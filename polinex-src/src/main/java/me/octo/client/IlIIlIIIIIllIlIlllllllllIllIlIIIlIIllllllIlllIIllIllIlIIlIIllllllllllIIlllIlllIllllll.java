package me.octo.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.IIIlllllIIllIlIllIIllIlIIllIIlIIlIIlllIlIIlIlIIIllllIllllllIIIIlIllIlllIIIIIIllIllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
import me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
import me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
import me.octo.client.utils.IllllllIllllIIIIIlIIlIlIIIllIlIllIIlllIIllIlllllllllIIIllIlIIlIIIllIIIIIllIIIIIllllIl;
import me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
import me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
import me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
import me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.nanovg.NVGColor;
import org.lwjgl.nanovg.NanoVG;

public final class IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll {
   public static <T> T a(Object p0) { return null; } // PX-FIX ovld

   @NotNull
   private final Function1<lIIIIIlIIIIIIIIlllIlIlIlIIIllIlIIllllIIIIIlllIllIIlIlllIIIIllllIIlIlIIlIIIIIIlIlIIIII, Unit> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final Function1<IIllIIlllllllIIllllIlIlIIIIIllIllIIIlllIIIlIIIllllllIIlIIIlIlIlIIllIllIIIIIlIlIlIIIlI, Unit> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final Function1<IllIIlIIlIlIIllIIIlIIIIlIIllIIIlllllIIlllIIIllIIlllIlllIIIIlIIlllIlIllIIIIllIIlllIlll, Unit> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private final Function0<Unit> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @Nullable
   private volatile List<IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private volatile boolean IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private volatile boolean IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private volatile boolean lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private long IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private final llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static String[] a;
   private static String[] b;

   public IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll(
      @NotNull Function1<? super lIIIIIlIIIIIIIIlllIlIlIlIIIllIlIIllllIIIIIlllIllIIlIlllIIIIllllIIlIlIIlIIIIIIlIlIIIII, Unit> var1,
      @NotNull Function1<? super IIllIIlllllllIIllllIlIlIIIIIllIllIIIlllIIIlIIIllllllIIlIIIlIlIlIIllIllIIIIIlIlIlIIIlI, Unit> var2,
      @NotNull Function1<? super IllIIlIIlIlIIllIIIlIIIIlIIllIIIlllllIIlllIIIllIIlllIlllIIIIlIIlllIlIllIIIIllIIlllIlll, Unit> var3,
      @NotNull Function0<Unit> var4
   ) {
      short var10001 = -4528;
      short var10002 = -23359;
      Intrinsics.checkNotNullParameter(var1, "requestRoutePicker");
      var10001 = -4511;
      var10002 = -31334;
      Intrinsics.checkNotNullParameter(var2, "requestMacroPicker");
      var10001 = -4554;
      var10002 = 24990;
      Intrinsics.checkNotNullParameter(var3, "requestConfirm");
      var10001 = -4518;
      var10002 = -10510;
      Intrinsics.checkNotNullParameter(var4, "dismissPopup");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = ((Function1<lIIIIIlIIIIIIIIlllIlIlIlIIIllIlIIllllIIIIIlllIllIIlIlllIIIIllllIIlIlIIlIIIIIIlIlIIIII,Unit>)(Object)(var1));
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = ((Function1<IIllIIlllllllIIllllIlIlIIIIIllIllIIIlllIIIlIIIllllllIIlIIIlIlIlIIllIllIIIIIlIlIlIIIlI,Unit>)(Object)(var2));
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = ((Function1<IllIIlIIlIlIIllIIIlIIIIlIIllIIIlllllIIlllIIIllIIlllIlllIIIIlIIlllIlIllIIIIllIIlllIlll,Unit>)(Object)(var3));
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll();
   }

   private final void a() {
      new Thread(() -> a(this)).start();
   }

   public final void b() {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll var10000 = this;
      if (var1 != null) {
         if (this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
            return;
         }

         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = true;
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = false;
         var10000 = this;
      }

      var10000.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = null;
      short var2 = -4563;
      short var10001 = 11018;
      lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.e("[Routes/Uploads] fetching my routes");
      new Thread(() -> b(this)).start();
   }

   @Nullable
   public final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII a(
      float var1, float var2, float var3, float var4, int var5, int var6, float var7
   ) {
      Object var44 = null; // PX-FIX
      Object var43 = null; // PX-FIX
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var8;
      boolean var42;
      label235: {
         var8 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
         IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll var10000 = this;
         if (var8 != null) {
            if (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII == null) {
               var42 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
               if (var8 == null) {
                  break label235;
               }

               if (!this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
                  var42 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
                  if (var8 == null) {
                     break label235;
                  }

                  if (!this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
                     this.b();
                  }
               }
            }

            var10000 = this;
         }

         var42 = var10000.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      label238: {
         label239: {
            label240: {
               if (var8 != null) {
                  if (var42) {
                     float var32 = var1 + var3 / 2.0F;
                     float var34 = var2 + var4 / 2.0F;
                     float var36 = 16.0F;
                     long var38 = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .b();
                     float var40 = (float)(System.currentTimeMillis() % 1000L) / 1000.0F * (float) (Math.PI * 2);
                     float var41 = 4.08407F;
                     lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b(
                        var32,
                        var34,
                        var36,
                        2.0F,
                        IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .y()
                           .a(0.2F)
                     );
                     NanoVG.nvgBeginPath(var38);
                     NanoVG.nvgArc(var38, var32, var34, var36, var40, var40 + var41, 2);
                     NanoVG.nvgStrokeWidth(var38, 2.5F);
                     NVGColor var16 = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a();
                     NanoVG.nvgRGBAf(
                        IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .ah()
                              .a()
                           / 255.0F,
                        IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .ah()
                              .b()
                           / 255.0F,
                        IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .ah()
                              .c()
                           / 255.0F,
                        0.85F * var7,
                        var16
                     );
                     NanoVG.nvgStrokeColor(var38, var16);
                     NanoVG.nvgStroke(var38);
                     return null;
                  }

                  var43 = this;
                  if (var8 == null) {
                     break label240;
                  }

                  var42 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
               }

               if (var42) {
                  break label239;
               }

               var43 = this;
            }

            var44 = ((me.octo.client.PXDyn)var43).IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            if (var8 == null) {
               break label238;
            }

            if (((me.octo.client.PXDyn)var43).IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII != null) {
               var44 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
               break label238;
            }
         }

         float var9;
         float var10;
         float var11;
         float var12;
         label207: {
            label242: {
               short var10001 = -4521;
               short var10002 = -22406;
               lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
                  .a(
                     "Couldn't fetch uploads",
                     var1 + var3 / 2.0F,
                     var2 + var4 / 2.0F - 12.0F,
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .c()
                  );
               var9 = 120.0F;
               var10 = 28.0F;
               var11 = var1 + (var3 - var9) / 2.0F;
               var12 = var2 + var4 / 2.0F + 6.0F;
               float var57;
               var42 = (var57 = var5 - var11) == 0.0F;
               if (var8 != null) {
                  if ((var42 ? 1 : 0) < 0) {
                     break label242;
                  }

                  float var58;
                  var42 = (var58 = var5 - (var11 + var9)) == 0.0F;
               }

               if (var8 != null) {
                  if ((var42 ? 1 : 0) > 0) {
                     break label242;
                  }

                  float var59;
                  var42 = (var59 = var6 - var12) == 0.0F;
               }

               if (var8 != null) {
                  if ((var42 ? 1 : 0) < 0) {
                     break label242;
                  }

                  float var60;
                  var42 = (var60 = var6 - (var12 + var10)) == 0.0F;
               }

               if (var8 == null) {
                  break label207;
               }

               if ((var42 ? 1 : 0) <= 0) {
                  var42 =( 1 != 0);
                  break label207;
               }
            }

            var42 =( 0 != 0);
         }

         int var13 =(( var42) ? 1 : 0);
         lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var11,
            var12,
            var9,
            var10,
            var13 != 0
               ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .g()
               : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .j(),
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .aq()
         );
         lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var11,
            var12,
            var9,
            var10,
            1.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .y()
               .a(var13 != 0 ? 0.7F : 0.4F),
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .aq()
         );
         short var53 = -4546;
         short var55 = -27293;
         lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
            .a(
               "Retry",
               var11 + var9 / 2.0F,
               var12 + var10 / 2.0F,
               var13 != 0
                  ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a()
                  : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b()
            );
         return var13 != 0 ? this.a((kotlin.jvm.functions.Function1)null) : null;
      }

      if (var44 == null) {
         return null;
      } else {
         float var14;
         IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var15;
         List var31;
         byte var33;
         float var35;
         float var37;
         float var39;
         label185: {
            label243: {
               var31 =((List)( var44));
               var33 = 2;
               var35 = 10.0F;
               var37 = 10.0F;
               var39 = (var3 - var35) / var33;
               var14 = 70.0F;
               var15 = null;
               float var61;
               var42 = (var61 = var5 - var1) == 0.0F;
               if (var8 != null) {
                  if ((var42 ? 1 : 0) < 0) {
                     break label243;
                  }

                  float var62;
                  var42 = (var62 = var5 - (var1 + var39)) == 0.0F;
               }

               if (var8 != null) {
                  if ((var42 ? 1 : 0) > 0) {
                     break label243;
                  }

                  float var63;
                  var42 = (var63 = var6 - var2) == 0.0F;
               }

               if (var8 != null) {
                  if ((var42 ? 1 : 0) < 0) {
                     break label243;
                  }

                  float var64;
                  var42 = (var64 = var6 - (var2 + var14)) == 0.0F;
               }

               if (var8 == null) {
                  break label185;
               }

               if ((var42 ? 1 : 0) <= 0) {
                  var42 =( 1 != 0);
                  break label185;
               }
            }

            var42 =( 0 != 0);
         }

         label164: {
            int var18 =(( var42) ? 1 : 0);
            IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll var47 = this;
            if (var8 != null) {
               this.a(var1, var2, var39, var14, (var18 != 0));
               if (var18 == 0) {
                  break label164;
               }

               var47 = this;
            }

            var15 = var47.a((kotlin.jvm.functions.Function1)null);
         }

         Object var48 = var31;
         if (var8 != null) {
            if (var31.isEmpty()) {
               short var54 = -4483;
               short var56 = -24091;
               lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
                  .a(
                     "No uploads yet — click 'Upload new' to start",
                     var1 + var3 / 2.0F,
                     var2 + var14 + 32.0F,
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .c()
                  );
               return var15;
            }

            var48 = var31;
         }

         Iterator var19 = ((me.octo.client.PXDyn)var48).iterator();
         int var20 = 0;

         while (true) {
            var42 = var19.hasNext();

            IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var22;
            int var28;
            int var29;
            do {
               if (var42) {
                  return var15;
               }

               int var21 = var20++;
               var22 = (IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl)var19.next();
               int var23 = var21 + 1;
               int var24 = var23 % var33;
               int var25 = var23 / var33;
               float var26 = var1 + var24 * (var39 + var35);
               float var27 = var2 + var25 * (var14 + var37);
               float var65;
               var42 = (var65 = var27 + var14 - (var2 + var4)) == 0.0F;
               if (var8 != null) {
                  if ((var42 ? 1 : 0) > 0) {
                     return var15;
                  }

                  var42 = (this.a(var22, var26, var27, var39, var14, var5, var6) != 0);
               }

               label152: {
                  label245: {
                     var28 =(( var42) ? 1 : 0);
                     float var66;
                     var42 = (var66 = var5 - var26) == 0.0F;
                     if (var8 != null) {
                        if ((var42 ? 1 : 0) < 0) {
                           break label245;
                        }

                        float var67;
                        var42 = (var67 = var5 - (var26 + var39)) == 0.0F;
                     }

                     if (var8 != null) {
                        if ((var42 ? 1 : 0) > 0) {
                           break label245;
                        }

                        float var68;
                        var42 = (var68 = var6 - var27) == 0.0F;
                     }

                     if (var8 != null) {
                        if ((var42 ? 1 : 0) < 0) {
                           break label245;
                        }

                        float var69;
                        var42 = (var69 = var6 - (var27 + var14)) == 0.0F;
                     }

                     if (var8 == null) {
                        break label152;
                     }

                     if ((var42 ? 1 : 0) <= 0) {
                        var42 =( 1 != 0);
                        break label152;
                     }
                  }

                  var42 =( 0 != 0);
               }

               var29 =(( var42) ? 1 : 0);
               var42 =( var29 != 0);
            } while (var8 == null);

            if (var29 != 0 && var15 == null) {
               var15 = switch (var28) {
                  case 0 -> this.a((kotlin.jvm.functions.Function1)null);
                  case 1 -> this.a((kotlin.jvm.functions.Function1)null);
                  default -> (IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII)this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
               };
               if (var8 == null) {
                  return var15;
               }
            }
         }
      }
   }

   private final void a(float var1, float var2, float var3, float var4, boolean var5) {
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6 = var5
         ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .g()
         : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e()
            .a(0.6F);
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var4,
         var6,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .ar()
      );
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
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
      short var10000 = -4542;
      short var10001 = 14927;
      String var7 = "Upload new";
      float var8 = (float)lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll, var7, false, 2, null);
      float var9 = 16.0F;
      float var10 = var9 + 10.0F + var8;
      float var11 = var1 + (var3 - var10) / 2.0F;
      float var12 = var2 + var4 / 2.0F;
      var10001 = -4520;
      short var10002 = -23993;
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n            <path d=\"M21 15v4a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2v-4\"/>\n            <polyline points=\"17,8 12,3 7,8\"/>\n            <line x1=\"12\" y1=\"3\" x2=\"12\" y2=\"15\"/>\n        </svg>\n    ",
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
      lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.d(
         lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll,
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

   private final void c() {
      short var10003 = -4525;
      short var10004 = 12834;
      var10004 = -4545;
      short var10005 = -19447;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .invoke(
            new IIllIIlllllllIIllllIlIlIIIIIllIllIIIlllIIIlIIIllllllIIlIIIlIlIlIIllIllIIIIIlIlIlIIIlI(
               "Upload a route",
               "Pick a macro to see its local routes",
               null,
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            )
         );
   }

   private final void a(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var1) {
      Function1 var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      short var10003 = -4549;
      short var10004 = 10944;
      String var2 = var1.a();
      short var10005 = -4482;
      short var10006 = -10484;
      var10000.invoke(
         new lIIIIIlIIIIIIIIlllIlIlIlIIIllIlIIllllIIIIIlllIllIIlIlllIIIIllllIIlIlIIlIIIIIIlIlIIIII(
            "Pick a route",
            var2 + " · choose the route you want to upload",
            var1.d(),
            null,
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         )
      );
   }

   private final void a(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var1, String var2) {
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.invoke();
      short var10003 = -4531;
      short var10004 = 7355;
      short var10006 = -4529;
      short var10007 = 29301;
      String var3 = "'" + var2 + "' will be uploaded to the route browser as a new public entry. You can take it down later from this tab.";
      short var10005 = -4553;
      var10006 = 949;
      var10006 = -4515;
      var10007 = 10058;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         .invoke(
            new IllIIlIIlIlIIllIIIlIIIIlIIllIIIlllllIIlllIIIllIIlllIlllIIIIlIIlllIlIllIIIIllIIlllIlll(
               "Upload route?",
               var3,
               "Upload",
               "Cancel",
               false,
               null,
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            )
         );
   }

   private final String b(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII param1, String param2) {
      String var4;
      try {
         if (param1.g() == llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII || param1.g() == llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
            var4 = param2;
            var var5 = param1.J();
            if (var5 != null) {
               String var6 = var5.d(param2);
               if (var6 != null) {
                  var4 = var6;
               }
            }
         } else {
            var4 = param2;
         }
      } catch (Exception var7) {
         var4 = param2;
      }
      var var8 = new me.octo.client.llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI(param1.b());
      String var9;
      try {
         if (param1.g() == llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
            var var10 = var8.a(var4);
            var9 = var10 == null ? null : me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var10);
         } else if (param1.g() == llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII && param1.i().size() > 1) {
            var var11 = new com.google.gson.JsonObject();
            for (String var12 : param1.i()) {
               var var13 = var8.a(var4, var12);
               if (var13 == null) {
                  var13 = new me.octo.client.IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll(kotlin.collections.CollectionsKt.emptyList(), null, null, null, 14, null);
               }
               var11.add(var12, me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(var13));
            }
            var9 = me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a((Object)var11);
         } else if (param1.g() == llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
            String var14 = (String)kotlin.collections.CollectionsKt.firstOrNull(param1.i());
            if (var14 == null) {
               return null;
            }
            var var15 = var8.a(var4, var14);
            var9 = var15 == null ? null : me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var15);
         } else {
            var9 = null;
         }
      } catch (Exception var16) {
         var9 = null;
      }
      return var9;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i ()[Lme/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
      // 003: astore 3
      // 004: aload 1
      // 005: aload 3
      // 006: ifnull 042
      // 009: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.g ()Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 00c: getstatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 00f: if_acmpeq 035
      // 012: goto 019
      // 015: invokestatic me/octo/client/IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 018: athrow
      // 019: aload 1
      // 01a: aload 3
      // 01b: ifnull 042
      // 01e: goto 025
      // 021: invokestatic me/octo/client/IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 024: athrow
      // 025: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.g ()Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 028: getstatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 02b: if_acmpne 070
      // 02e: goto 035
      // 031: invokestatic me/octo/client/IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 034: athrow
      // 035: nop
      // 036: aload 3
      // 037: ifnull 060
      // 03a: aload 1
      // 03b: goto 042
      // 03e: invokestatic me/octo/client/IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 041: athrow
      // 042: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.J ()Lme/octo/client/IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl;
      // 045: dup
      // 046: ifnull 058
      // 049: aload 2
      // 04a: invokevirtual me/octo/client/IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl.d (Ljava/lang/String;)Ljava/lang/String;
      // 04d: dup
      // 04e: ifnonnull 061
      // 051: goto 058
      // 054: invokestatic me/octo/client/IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 057: athrow
      // 058: pop
      // 059: goto 060
      // 05c: invokestatic me/octo/client/IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05f: athrow
      // 060: aload 2
      // 061: astore 5
      // 063: goto 06b
      // 066: astore 6
      // 068: aload 2
      // 069: astore 5
      // 06b: aload 5
      // 06d: goto 071
      // 070: aload 2
      // 071: astore 4
      // 073: new me/octo/client/llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI
      // 076: dup
      // 077: aload 1
      // 078: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.b ()Ljava/lang/String;
      // 07b: invokespecial me/octo/client/llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI.<init> (Ljava/lang/String;)V
      // 07e: astore 5
      // 080: nop
      // 081: nop
      // 082: aload 1
      // 083: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.g ()Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 086: getstatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 089: aload 3
      // 08a: ifnull 0c5
      // 08d: if_acmpne 0be
      // 090: goto 097
      // 093: invokestatic me/octo/client/IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 096: athrow
      // 097: aload 5
      // 099: aload 4
      // 09b: invokevirtual me/octo/client/llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI.a (Ljava/lang/String;)Lme/octo/client/IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll;
      // 09e: dup
      // 09f: ifnull 0b9
      // 0a2: goto 0a9
      // 0a5: invokestatic me/octo/client/IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a8: athrow
      // 0a9: astore 8
      // 0ab: bipush 0
      // 0ac: istore 9
      // 0ae: getstatic me/octo/client/utils/llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII;
      // 0b1: aload 8
      // 0b3: invokevirtual me/octo/client/utils/llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.a (Ljava/lang/Object;)Ljava/lang/String;
      // 0b6: goto 1d1
      // 0b9: pop
      // 0ba: aconst_null
      // 0bb: goto 1d1
      // 0be: aload 1
      // 0bf: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.g ()Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 0c2: getstatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 0c5: aload 3
      // 0c6: ifnull 182
      // 0c9: if_acmpne 170
      // 0cc: goto 0d3
      // 0cf: invokestatic me/octo/client/IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d2: athrow
      // 0d3: aload 1
      // 0d4: aload 3
      // 0d5: ifnull 171
      // 0d8: goto 0df
      // 0db: invokestatic me/octo/client/IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0de: athrow
      // 0df: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.i ()Ljava/util/List;
      // 0e2: invokeinterface java/util/List.size ()I 1
      // 0e7: bipush 1
      // 0e8: if_icmple 170
      // 0eb: goto 0f2
      // 0ee: invokestatic me/octo/client/IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f1: athrow
      // 0f2: new com/google/gson/JsonObject
      // 0f5: dup
      // 0f6: invokespecial com/google/gson/JsonObject.<init> ()V
      // 0f9: astore 6
      // 0fb: aload 1
      // 0fc: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.i ()Ljava/util/List;
      // 0ff: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 104: astore 7
      // 106: aload 7
      // 108: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 10d: ifeq 165
      // 110: aload 7
      // 112: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 117: checkcast java/lang/String
      // 11a: aload 3
      // 11b: ifnull 16d
      // 11e: astore 8
      // 120: aload 3
      // 121: ifnull 140
      // 124: aload 5
      // 126: aload 4
      // 128: aload 8
      // 12a: invokevirtual me/octo/client/llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI.a (Ljava/lang/String;Ljava/lang/String;)Lme/octo/client/IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll;
      // 12d: dup
      // 12e: ifnonnull 150
      // 131: goto 138
      // 134: invokestatic me/octo/client/IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 137: athrow
      // 138: pop
      // 139: goto 140
      // 13c: invokestatic me/octo/client/IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13f: athrow
      // 140: new me/octo/client/IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll
      // 143: dup
      // 144: invokestatic kotlin/collections/CollectionsKt.emptyList ()Ljava/util/List;
      // 147: aconst_null
      // 148: aconst_null
      // 149: aconst_null
      // 14a: bipush 14
      // 14c: aconst_null
      // 14d: invokespecial me/octo/client/IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll.<init> (Ljava/util/List;Ljava/lang/String;Lme/octo/client/IIIllIlIIlIllIlIlllIlIllIIllIIlIlIllIlIlllIlIlIllIIIIIlIlIllllIlIlIIIIIIlIIIIllllIllI;Lme/octo/client/lIIIllIlllIlIIIlIIlIIlIIlIlIlIIllIlIlllIIlIlllllIllllIIIllllllIIllllIIIIIIIlIlIllIlll;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
      // 150: astore 9
      // 152: aload 6
      // 154: aload 8
      // 156: getstatic me/octo/client/utils/llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII;
      // 159: aload 9
      // 15b: invokevirtual me/octo/client/utils/llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.c (Ljava/lang/Object;)Lcom/google/gson/JsonElement;
      // 15e: invokevirtual com/google/gson/JsonObject.add (Ljava/lang/String;Lcom/google/gson/JsonElement;)V
      // 161: aload 3
      // 162: ifnonnull 106
      // 165: getstatic me/octo/client/utils/llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII;
      // 168: aload 6
      // 16a: invokevirtual me/octo/client/utils/llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.a (Ljava/lang/Object;)Ljava/lang/String;
      // 16d: goto 1d1
      // 170: aload 1
      // 171: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.g ()Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 174: aload 3
      // 175: ifnull 193
      // 178: getstatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 17b: goto 182
      // 17e: invokestatic me/octo/client/IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 181: athrow
      // 182: if_acmpne 1d0
      // 185: aload 1
      // 186: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.i ()Ljava/util/List;
      // 189: invokestatic kotlin/collections/CollectionsKt.firstOrNull (Ljava/util/List;)Ljava/lang/Object;
      // 18c: goto 193
      // 18f: invokestatic me/octo/client/IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 192: athrow
      // 193: checkcast java/lang/String
      // 196: dup
      // 197: ifnonnull 1a1
      // 19a: pop
      // 19b: aconst_null
      // 19c: areturn
      // 19d: invokestatic me/octo/client/IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a0: athrow
      // 1a1: astore 6
      // 1a3: aload 3
      // 1a4: ifnull 1cc
      // 1a7: aload 5
      // 1a9: aload 4
      // 1ab: aload 6
      // 1ad: invokevirtual me/octo/client/llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI.a (Ljava/lang/String;Ljava/lang/String;)Lme/octo/client/IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll;
      // 1b0: dup
      // 1b1: ifnull 1cb
      // 1b4: goto 1bb
      // 1b7: invokestatic me/octo/client/IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ba: athrow
      // 1bb: astore 9
      // 1bd: bipush 0
      // 1be: istore 10
      // 1c0: getstatic me/octo/client/utils/llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII;
      // 1c3: aload 9
      // 1c5: invokevirtual me/octo/client/utils/llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.a (Ljava/lang/Object;)Ljava/lang/String;
      // 1c8: goto 1d1
      // 1cb: pop
      // 1cc: aconst_null
      // 1cd: goto 1d1
      // 1d0: aconst_null
      // 1d1: astore 6
      // 1d3: goto 1db
      // 1d6: astore 7
      // 1d8: aconst_null
      // 1d9: astore 6
      // 1db: aload 6
      // 1dd: areturn
   }

   private final void c(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var1, String var2) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll var10000 = this;
      if (var3 != null) {
         if (this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) {
            short var6 = -4503;
            short var7 = -20596;
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.e(
               "[Routes/Uploads] doUploadNew called while already uploading — ignored"
            );
            return;
         }

         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = true;
         var10000 = this;
      }

      String var4 = var10000.b(var1, var2);
      String var5 = var4;
      if (var3 != null) {
         if (var4 == null) {
            this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = false;
            short var9 = -4568;
            short var12 = 30973;
            var12 = -4485;
            short var15 = 23380;
            IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(
                  3000L,
                  "Uploads",
                  "Couldn't read local route",
                  IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
               );
            return;
         }

         short var10002 = -4568;
         short var10003 = 30973;
         short var10004 = -4502;
         short var10005 = 18822;
         IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(
               2000L,
               "Uploads",
               "Uploading " + var2 + "…",
               IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
         String var10001 = var1.d();
         var10002 = -4498;
         var10003 = -23495;
         var10003 = -4566;
         var10004 = 743;
         var5 = "[Routes/Uploads] uploading '" + var2 + "' type=" + var10001;
      }

      lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.e(var5);
      new Thread(() -> a(var2, var1, var4, this)).start();
   }

   private final int a(
      IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var1,
      float var2,
      float var3,
      float var4,
      float var5,
      int var6,
      int var7
   ) {
      Object var28 = null; // PX-FIX
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var8;
      int var10000;
      label85: {
         label88: {
            var8 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
            float var38;
            var10000 = (var38 = var6 - var2) == 0.0F ? 0 : (var38 < 0.0F ? -1 : 1);
            if (var8 != null) {
               if (var10000 < 0) {
                  break label88;
               }

               float var39;
               var10000 = (var39 = var6 - (var2 + var4)) == 0.0F ? 0 : (var39 < 0.0F ? -1 : 1);
            }

            if (var8 != null) {
               if (var10000 > 0) {
                  break label88;
               }

               float var40;
               var10000 = (var40 = var7 - var3) == 0.0F ? 0 : (var40 < 0.0F ? -1 : 1);
            }

            if (var8 != null) {
               if (var10000 < 0) {
                  break label88;
               }

               float var41;
               var10000 = (var41 = var7 - (var3 + var5)) == 0.0F ? 0 : (var41 < 0.0F ? -1 : 1);
            }

            if (var8 == null) {
               break label85;
            }

            if (var10000 <= 0) {
               var10000 = 1;
               break label85;
            }
         }

         var10000 = 0;
      }

      int var9;
      float var16;
      label63: {
         var9 = var10000;
         llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var10 = var9 != 0
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .g()
               .b(3.0F, 3.0F, 3.0F)
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .j();
         llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var11 = var9 != 0
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .z()
               .a(0.7F)
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .y()
               .a(0.35F);
         lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var2,
            var3,
            var4,
            var5,
            var10,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .aq()
         );
         lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var2,
            var3,
            var4,
            var5,
            1.0F,
            var11,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .aq()
         );
         me.octo.client.IIIlllllIIllIlIllIIllIlIIllIIlIIlIIlllIlIIlIlIIIllllIllllllIIIIlIllIlllIIIIIIllIllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var12 = IIIlllllIIllIlIllIIllIlIIllIIlIIlIIlllIlIIlIlIIIllllIllllllIIIIlIllIlllIIIIIIllIllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c(var1.c());
         float var13 = 44.0F;
         float var14 = var2 + 8.0F;
         float var15 = var3 + (var5 - var13) / 2.0F;
         IllllllIllllIIIIIlIIlIlIIIllIlIllIIlllIIllIlllllllllIIIllIlIIlIIIllIIIIIllIIIIIllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var12.b(), var12.a(), var14, var15, var13, var9 != 0 ? 1.0F : 0.92F, true);
         var16 = var14 + var13 + 12.0F;
         IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var27 = var1;
         if (var8 != null) {
            if (var1.b().length() > 22) {
               String var29 = var1.b().substring(0, 21);
               short var10002 = -4544;
               short var10003 = 26234;
               Intrinsics.checkNotNullExpressionValue(var29, "substring(...)");
               var28 = var29 + "…";
               break label63;
            }

            var27 = var1;
         }

         var28 = var27.b();
      }

      String var17 =((String)( var28));
      lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.d(
         lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll,
         var17,
         var16,
         var3 + var5 / 2.0F - 8.0F,
         var9 != 0
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
               .a(0.92F),
         false, 16, null);
      lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll var30 = lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      int var10001 = var1.d();
      int var32 = var1.g();
      short var33 = -4517;
      short var10004 = 13157;
      var10004 = -4543;
      short var10005 = 2143;
      lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.d(
         var30,
         var10001 + " pts · " + var32 + " downloads",
         var16,
         var3 + var5 / 2.0F + 8.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c(),
         false, 16, null);
      float var18 = 50.0F;
      float var19 = 36.0F;
      float var20 = 26.0F;
      float var21 = 8.0F;
      float var22 = var2 + var4 - 16.0F - var18;
      float var23 = var3 + (var5 - var19) / 2.0F;
      float var24 = var22 - var20 - var21;
      float var25 = var3 + (var5 - var20) / 2.0F;
      byte var26 = -1;
      var10004 = -4524;
      var10005 = -19552;
      byte var31 = ((byte)((this.a(
         var24,
         var25,
         var20,
         "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n            <line x1=\"18\" y1=\"6\" x2=\"6\" y2=\"18\"/>\n            <line x1=\"6\" y1=\"6\" x2=\"18\" y2=\"18\"/>\n        </svg>\n    ",
         var6,
         var7
      )) ? 1 : 0));
      if (var8 != null) {
         if (var31 != 0) {
            var26 = 1;
         }

         var10005 = -4488;
         short var10006 = 17704;
         var31 = ((byte)((this.a(
            var22,
            var23,
            var18,
            var19,
            "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n            <path d=\"M21 15v4a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2v-4\"/>\n            <polyline points=\"17,8 12,3 7,8\"/>\n            <line x1=\"12\" y1=\"3\" x2=\"12\" y2=\"15\"/>\n        </svg>\n    ",
            var6,
            var7
         )) ? 1 : 0));
      }

      if (var8 != null) {
         if (var31 != 0) {
            var26 = 0;
         }

         var31 = var26;
      }

      return var31;
   }

   private final boolean a(float var1, float var2, float var3, float var4, String var5, int var6, int var7) {
      int var10000;
      label53: {
         label56: {
            lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var8 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
            float var13;
            var10000 = (var13 = var6 - var1) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
            if (var8 != null) {
               if (var10000 < 0) {
                  break label56;
               }

               float var14;
               var10000 = (var14 = var6 - (var1 + var3)) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
            }

            if (var8 != null) {
               if (var10000 > 0) {
                  break label56;
               }

               float var15;
               var10000 = (var15 = var7 - var2) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
            }

            if (var8 != null) {
               if (var10000 < 0) {
                  break label56;
               }

               float var16;
               var10000 = (var16 = var7 - (var2 + var4)) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1);
            }

            if (var8 == null) {
               break label53;
            }

            if (var10000 <= 0) {
               var10000 = 1;
               break label53;
            }
         }

         var10000 = 0;
      }

      int var9 = var10000;
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var10 = var9 != 0
         ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .h()
            .b(8.0F, 8.0F, 8.0F)
         : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .h();
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var11 = var9 != 0
         ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .z()
            .a(0.8F)
         : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(0.5F);
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var4,
         var10,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .aq()
      );
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var4,
         1.0F,
         var11,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .aq()
      );
      float var12 = 18.0F;
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            var5,
            var1 + (var3 - var12) / 2.0F,
            var2 + (var4 - var12) / 2.0F,
            var12,
            var9 != 0
               ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a()
               : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a()
                  .a(0.9F),
            1.0F
         );
      return (var9 != 0);
   }

   private final boolean a(float var1, float var2, float var3, String var4, int var5, int var6) {
      int var10000;
      label53: {
         label56: {
            lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var7 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
            float var11;
            var10000 = (var11 = var5 - var1) == 0.0F ? 0 : (var11 < 0.0F ? -1 : 1);
            if (var7 != null) {
               if (var10000 < 0) {
                  break label56;
               }

               float var12;
               var10000 = (var12 = var5 - (var1 + var3)) == 0.0F ? 0 : (var12 < 0.0F ? -1 : 1);
            }

            if (var7 != null) {
               if (var10000 > 0) {
                  break label56;
               }

               float var13;
               var10000 = (var13 = var6 - var2) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
            }

            if (var7 != null) {
               if (var10000 < 0) {
                  break label56;
               }

               float var14;
               var10000 = (var14 = var6 - (var2 + var3)) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
            }

            if (var7 == null) {
               break label53;
            }

            if (var10000 <= 0) {
               var10000 = 1;
               break label53;
            }
         }

         var10000 = 0;
      }

      int var8 = var10000;
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var9 = var8 != 0
         ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .g()
         : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e()
            .a(0.3F);
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var1, var2, var3, var3, var9, 6.0F);
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var3,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(var8 != 0 ? 0.5F : 0.2F),
         6.0F
      );
      float var10 = var3 - 14.0F;
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            var4,
            var1 + (var3 - var10) / 2.0F,
            var2 + (var3 - var10) / 2.0F,
            var10,
            var8 != 0
               ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a()
               : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b(),
            1.0F
         );
      return (var8 != 0);
   }

   private final void a(IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var1) {
      Function1 var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      String var10003 = var1.b();
      short var10004 = -4559;
      short var10005 = 13276;
      var10003 = "Update '" + var10003 + "'";
      var10004 = -4533;
      var10005 = -25436;
      var10000.invoke(
         new lIIIIIlIIIIIIIIlllIlIlIlIIIllIlIIllllIIIIIlllIllIIlIlllIIIIllllIIlIlIIlIIIIIIlIlIIIII(
            var10003,
            "Pick the local route file to replace it with",
            var1.c(),
            null,
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         )
      );
   }

   private final void a(
      IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var1,
      llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var2,
      String var3
   ) {
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.invoke();
      Function1 var10000 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      short var10003 = -4505;
      short var10004 = 5081;
      String var4 = var1.b();
      short var10006 = -4540;
      short var10007 = -9900;
      var10007 = -4489;
      short var10008 = 19657;
      var10008 = -4532;
      short var10009 = -30088;
      String var5 = "Replace '" + var4 + "' on the route browser with your local '" + var3 + "'? The old version will be overwritten for everyone.";
      short var10005 = -4501;
      var10006 = 15465;
      var10006 = -4558;
      var10007 = 22650;
      var10000.invoke(
         new IllIIlIIlIlIIllIIIlIIIIlIIllIIIlllllIIlllIIIllIIlllIlllIIIIlIIlllIlIllIIIIllIIlllIlll(
            "Confirm update",
            var5,
            "Update",
            "Cancel",
            false,
            null,
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         )
      );
   }

   private final void b(
      IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var1,
      llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var2,
      String var3
   ) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      String var5 = this.b(var2, var3);
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var4 = var10000;
      String var6 = var5;
      if (var4 != null) {
         if (var5 == null) {
            short var10 = -4568;
            short var14 = 30973;
            var14 = -4550;
            short var17 = -13192;
            IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(
                  3000L,
                  "Uploads",
                  "Couldn't read local route",
                  IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
               );
            return;
         }

         IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII var7 = IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10002 = -4568;
         short var10003 = 30973;
         String var11 = var1.b();
         short var10004 = -4539;
         short var10005 = -9437;
         var7.b(
            2000L,
            "Uploads",
            "Updating " + var11 + "…",
            IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         );
         String var8 = var1.a();
         String var10001 = var1.b();
         var10002 = -4560;
         var10003 = -29767;
         var10003 = -4535;
         var10004 = -25710;
         var6 = "[Routes/Uploads] updating id=" + var8 + " name='" + var10001 + "'";
      }

      lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.e(var6);
      new Thread(() -> a(var1, var5, this)).start();
   }

   private final void b(IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var1) {
      Function1 var10000 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      short var10003 = -4484;
      short var10004 = 23743;
      String var10005 = var1.b();
      short var10006 = -4516;
      short var10007 = 4296;
      String var2 = "'" + var10005 + "' will be removed from the route browser. This can't be undone. Are you sure?";
      short var3 = -4530;
      var10006 = 16830;
      var10006 = -4564;
      var10007 = 30298;
      var10000.invoke(
         new IllIIlIIlIlIIllIIIlIIIIlIIllIIIlllllIIlllIIIllIIlllIlllIIIIlIIlllIlIllIIIIllIIlllIlll(
            "Take down route?",
            var2,
            "Take down",
            "Keep it",
            true,
            null,
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         )
      );
   }

   private final void c(IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var1) {
      IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII var10000 = IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      short var10002 = -4551;
      short var10003 = 20061;
      String var4 = var1.b();
      short var10004 = -4495;
      short var10005 = 29313;
      var10000.b(
         2000L,
         "Uploads",
         "Taking down " + var4 + "…",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
      );
      String var2 = var1.a();
      String var10001 = var1.b();
      var10002 = -4548;
      var10003 = 7863;
      var10003 = -4537;
      var10004 = 28056;
      lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.e(
         "[Routes/Uploads] deleting id=" + var2 + " name='" + var10001 + "'"
      );
      new Thread(() -> a(var1, this)).start();
   }

   private final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII a(final Function0<Unit> var1) {
      return new IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII() {
         public void e() {
            var1.invoke();
         }

         public void a(char var1x, int var2) {
         }
      };
   }

   private static final void a(List var0, IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll var1, List var2) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      List var10000 = var0;
      if (var3 != null) {
         if (var0 != null) {
            int var4 = var0.size();
            short var10001 = -4522;
            short var10002 = 22014;
            var10002 = -4494;
            short var10003 = -850;
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.e("[Routes/Uploads] silent refresh: " + var4 + " routes");
            var1.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var0;
            var1.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = System.currentTimeMillis();
         }

         var10000 = var2;
      }

      if (var3 != null) {
         if (var10000 == null) {
            return;
         }

         var10000 = var2;
      }

      int var5 = var10000.size();
      short var6 = -4493;
      short var8 = -31039;
      var8 = -4494;
      short var10 = -850;
      lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.e("[Routes/Uploads] browse silent refresh: " + var5 + " routes");
      Polinex.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var2);
   }

   private static final void a(IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll var0) {
      List var1 = IIllIIIllllllIIllIIIlIllIllIIlIIlIlllIlllIIIIllIIlIIIIllIlIllIIlllIllllIllIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b();
      List var2 = IIllIIIllllllIIllIIIlIllIllIIlIIlIlllIlllIIIIllIIlIIIIllIlIllIIlllIllllIllIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      Minecraft.getInstance().execute(null);
   }

   private static final void a(IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll var0, List var1) {
      label15: {
         lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
         var0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = false;
         lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
         if (var2 != null) {
            if (var1 != null) {
               int var3 = var1.size();
               short var10001 = -4555;
               short var10002 = -12840;
               var10002 = -4512;
               short var10003 = -1741;
               lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.e("[Routes/Uploads] fetched " + var3 + " routes");
               var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
               if (var2 != null) {
                  break label15;
               }
            }

            short var4 = -4527;
            short var5 = -27737;
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c(
               "[Routes/Uploads] fetch returned null — server error or no response"
            );
         }

         var0.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = true;
      }

      var0.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = System.currentTimeMillis();
   }

   private static final void b(IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll var0) {
      List var1 = IIllIIIllllllIIllIIIlIllIllIIlIIlIlllIlllIIIIllIIlIIIIllIlIllIIlllIllllIllIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b();
      Minecraft.getInstance().execute(null);
   }

   private static final Unit c(IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll var0) {
      var0.b();
      return Unit.INSTANCE;
   }

   private static final Unit d(IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll var0) {
      var0.c();
      return Unit.INSTANCE;
   }

   private static final Unit a(
      IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll var0,
      IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var1
   ) {
      var0.a(var1);
      return Unit.INSTANCE;
   }

   private static final Unit b(
      IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll var0,
      IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var1
   ) {
      var0.b(var1);
      return Unit.INSTANCE;
   }

   private static final Unit a(
      IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll var0,
      IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var1,
      llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var2
   ) {
      short var10001 = -4552;
      short var10002 = -31958;
      Intrinsics.checkNotNullParameter(var1, "<unused var>");
      var10001 = -4557;
      var10002 = 28722;
      Intrinsics.checkNotNullParameter(var2, "editor");
      var0.a(var2);
      return Unit.INSTANCE;
   }

   private static final Unit a(
      IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll var0,
      llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var1,
      String var2
   ) {
      short var10001 = -4519;
      short var10002 = -29923;
      Intrinsics.checkNotNullParameter(var1, "pickedEditor");
      var10001 = -4538;
      var10002 = -29353;
      Intrinsics.checkNotNullParameter(var2, "routeName");
      var0.a(var1, var2);
      return Unit.INSTANCE;
   }

   private static final Unit b(
      IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll var0,
      llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var1,
      String var2
   ) {
      var0.c(var1, var2);
      return Unit.INSTANCE;
   }

   private static final void a(
      IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll var0,
      lIIllIIIIlIIlIIllIIlIllIIllIllIlIIlllIllIIIlIIllIlIIllIIlIIIlllIllIlIlIllIIlllIlIlllI var1,
      String var2
   ) {
      Object var8 = null; // PX-FIX
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      var0.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = false;
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = var10000;
      lIIllIIIIlIIlIIllIIlIllIIllIllIlIIlllIllIIIlIIllIlIIllIIlIIIlllIllIlIlIllIIlllIlIlllI var6 = var1;
      if (var3 != null) {
         if (var1 == null) {
            short var10001 = -4534;
            short var10002 = -27786;
            var10002 = -4526;
            short var10003 = -4508;
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("[Routes/Uploads] upload '" + var2 + "' — null response");
            var10002 = -4568;
            var10003 = 30973;
            var10003 = -4491;
            short var10004 = 8821;
            IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(
                  3500L,
                  "Uploads",
                  "Upload failed",
                  IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
               );
            if (var3 != null) {
               return;
            }
         }

         var6 = var1;
      }

      label48: {
         boolean var7 = var6.a();
         if (var3 != null) {
            if (var7) {
               String var11 = var1.d();
               short var17 = -4490;
               short var26 = -28883;
               var26 = -4507;
               short var35 = -13821;
               lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.e(
                  "[Routes/Uploads] upload '" + var2 + "' success id=" + var11
               );
               var17 = -4568;
               var26 = 30973;
               var35 = -4514;
               short var10005 = -2037;
               IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b(
                     3000L,
                     "Uploads",
                     "Uploaded " + var2,
                     IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                  );
               var0.a();
               if (var3 != null) {
                  return;
               }
            }

            var8 = var1;
            if (var3 == null) {
               break label48;
            }

            var7 = var1.b();
         }

         if (var7) {
            String var12 = var1.d();
            short var19 = -4490;
            short var29 = -28883;
            var29 = -4567;
            short var37 = 30870;
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.e(
               "[Routes/Uploads] upload '" + var2 + "' duplicate id=" + var12
            );
            var19 = -4568;
            var29 = 30973;
            short var39 = -4506;
            short var10006 = -15540;
            IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(
                  3500L,
                  "Uploads",
                  "'" + var2 + "' is already uploaded — use Update instead",
                  IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
               );
            if (var3 != null) {
               return;
            }
         }

         var8 = var1;
      }

      String var9 = ((me.octo.client.PXDyn)var8).c();
      if (var9 == null) {
         short var10 = -4565;
         short var13 = 3458;
         var9 = "Upload failed";
      }

      String var4 = var9;
      short var14 = -4499;
      short var21 = 22254;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var5 = StringsKt.startsWith(
            var4, "Please wait", false)
         ? IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         : IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      var21 = -4490;
      short var32 = -28883;
      var32 = -4500;
      short var38 = -2742;
      lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("[Routes/Uploads] upload '" + var2 + "' failed: " + var4);
      var21 = -4568;
      var32 = 30973;
      IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(3500L, "Uploads", var4, var5);
   }

   private static final void a(
      String var0,
      llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var1,
      String var2,
      IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll var3
   ) {
      lIIllIIIIlIIlIIllIIlIllIIllIllIlIIlllIllIIIlIIllIlIIllIIlIIIlllIllIlIlIllIIlllIlIlllI var4 = IIllIIIllllllIIllIIIlIllIllIIlIIlIlllIlllIIIIllIIlIIIIllIlIllIIlllIllllIllIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var0, var1.d(), var2);
      Minecraft.getInstance().execute(null);
   }

   private static final Unit a(
      IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll var0,
      IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var1,
      llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var2,
      String var3
   ) {
      short var10001 = -4536;
      short var10002 = -10026;
      Intrinsics.checkNotNullParameter(var2, "editor");
      var10001 = -4556;
      var10002 = 30655;
      Intrinsics.checkNotNullParameter(var3, "routeName");
      var0.a(var1, var2, var3);
      return Unit.INSTANCE;
   }

   private static final Unit b(
      IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll var0,
      IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var1,
      llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var2,
      String var3
   ) {
      var0.b(var1, var2, var3);
      return Unit.INSTANCE;
   }

   private static final void a(
      lIIllIIIIlIIlIIllIIlIllIIllIllIlIIlllIllIIIlIIllIlIIllIIlIIIlllIllIlIlIllIIlllIlIlllI var0,
      IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var1,
      IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll var2
   ) {
      Object var17 = null; // PX-FIX
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      lIIllIIIIlIIlIIllIIlIllIIllIllIlIIlllIllIIIlIIllIlIIllIIlIIIlllIllIlIlIllIIlllIlIlllI var10000 = var0;
      if (var3 != null) {
         if (var0 == null) {
            String var15 = var1.a();
            short var10001 = -4509;
            short var10002 = 23312;
            var10002 = -4486;
            short var10003 = -29815;
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("[Routes/Uploads] update id=" + var15 + " — null response");
            var10002 = -4568;
            var10003 = 30973;
            var10003 = -4481;
            short var10004 = 28692;
            IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(
                  3500L,
                  "Uploads",
                  "Update failed",
                  IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
               );
            if (var3 != null) {
               return;
            }
         }

         var10000 = var0;
      }

      if (var10000.a()) {
         label60: {
            List var22;
            label59: {
               String var16 = var1.a();
               short var21 = -4496;
               short var26 = 27912;
               var26 = -4547;
               short var33 = -7854;
               lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.e("[Routes/Uploads] update id=" + var16 + " success");
               var17 = var2;
               if (var3 != null && var2.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII != null) {
                  Iterable var4 = var2.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
                  boolean var5 = false;
                  var var7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var4, 10));
                  boolean var8 = false;

                  for (Object var10 : var4) {
                     IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var11 = (IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl)var10;
                     boolean var12 = false;
                     if (var3 == null) {
                        break label60;
                     }

                     IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var18 = var11;
                     if (var3 != null) {
                        var18 = Intrinsics.areEqual(var11.a(), var1.a())
                           ? IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl.a(
                              var11, null, null, null, 0, false, null, 0, 0L, System.currentTimeMillis(), null)
                           : var11;
                     }

                     var7.add(var18);
                     if (var3 == null) {
                        break;
                     }
                  }

                  var22 = var7;
                  var17 = var2;
                  if (var3 != null) {
                     break label59;
                  }
               }

               var22 = null;
            }

            ((me.octo.client.PXDyn)var17).IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var22;
            IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII var19 = IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            short var28 = -4568;
            short var34 = 30973;
            String var35 = var1.b();
            short var41 = -4523;
            short var10005 = -4369;
            var19.b(
               3000L,
               "Uploads",
               "Updated " + var35,
               IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            );
            var2.a();
         }

         if (var3 != null) {
            return;
         }
      }

      String var39;
      label37: {
         String var20 = var1.a();
         String var23 = var0.c();
         short var29 = -4496;
         short var36 = 27912;
         short var37 = -4508;
         short var42 = 32408;
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("[Routes/Uploads] update id=" + var20 + " failed: " + var23);
         var29 = -4568;
         short var38 = 30973;
         if (var3 != null) {
            var39 = var0.c();
            if (var39 != null) {
               break label37;
            }
         }

         short var40 = -4513;
         var42 = -32527;
         var39 = "Update failed";
      }

      IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            3500L,
            "Uploads",
            var39,
            IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         );
   }

   private static final void a(
      IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var0,
      String var1,
      IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll var2
   ) {
      lIIllIIIIlIIlIIllIIlIllIIllIllIlIIlllIllIIIlIIllIlIIllIIlIIIlllIllIlIlIllIIlllIlIlllI var3 = IIllIIIllllllIIllIIIlIllIllIIlIIlIlllIlllIIIIllIIlIIIIllIlIllIIlllIllllIllIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var0.a(), var1);
      Minecraft.getInstance().execute(null);
   }

   private static final Unit c(
      IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll var0,
      IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var1
   ) {
      var0.c(var1);
      return Unit.INSTANCE;
   }

   private static final void a(
      boolean var0,
      IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var1,
      IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll var2
   ) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      if (var3 != null) {
         if (var0) {
            label49: {
               IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll var14;
               List var18;
               label48: {
                  String var10000 = var1.a();
                  short var10001 = -4510;
                  short var10002 = -1680;
                  var10002 = -4487;
                  short var10003 = 28590;
                  lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.e("[Routes/Uploads] delete id=" + var10000 + " success");
                  var14 = var2;
                  if (var3 != null && var2.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII != null) {
                     Iterable var4 = var2.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
                     boolean var5 = false;
                     var var7 = new ArrayList();
                     boolean var8 = false;

                     for (Object var10 : var4) {
                        IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var11 = (IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl)var10;
                        boolean var12 = false;
                        if (var3 == null) {
                           break label49;
                        }

                        boolean var15 = Intrinsics.areEqual(var11.a(), var1.a());
                        if (var3 != null) {
                           if (var15) {
                              continue;
                           }

                           var7.add(var10);
                        }

                        if (var3 == null) {
                           break;
                        }
                     }

                     var18 = var7;
                     var14 = var2;
                     if (var3 != null) {
                        break label48;
                     }
                  }

                  var18 = null;
               }

               var14.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var18;
               IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII var16 = IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
               short var21 = -4568;
               short var25 = 30973;
               String var26 = var1.b();
               short var10004 = -4541;
               short var10005 = -27779;
               var16.b(
                  3000L,
                  "Uploads",
                  "Took down " + var26,
                  IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
               );
               var2.a();
            }

            if (var3 != null) {
               return;
            }
         }

         String var17 = var1.a();
         short var19 = -4492;
         short var22 = -11497;
         var22 = -4497;
         short var27 = 7582;
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("[Routes/Uploads] delete id=" + var17 + " failed");
      }

      short var24 = -4568;
      short var28 = 30973;
      var28 = -4504;
      short var30 = -12163;
      IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            3500L,
            "Uploads",
            "Takedown failed",
            IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         );
   }

   private static final void a(
      IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var0,
      IlIIlIIIIIllIlIlllllllllIllIlIIIlIIllllllIlllIIllIllIlIIlIIllllllllllIIlllIlllIllllll var1
   ) {
      boolean var2 = IIllIIIllllllIIllIIIlIllIllIIlIIlIlllIlllIIIIllIIlIIIIllIlIllIIlllIllllIllIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .e(var0.a());
      Minecraft.getInstance().execute(null);
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[86];
      int var3 = 0;
      String var2 = "5zi\u0081q16V v\u0089[Nï@Òq£ý\u0087Ñ;\ri-s¤vðø:ÅI/5Ü\u0002\u0017Vy;:ÞÂþ{\u0092:!¦\u0011\u0097ÓA\u0086'Ù/Æ}=J.zJx#Kt%\u0095SAG[S\u0096ã\u0080X\u001d\u0014\u000eÚÿU\u0082\u000b\f`\u0099|U/d¹\u008d/ÝÓÅºÅ\u0088¥|\u001cü\u001d\u0012òx;\fd\u0092T:Ð7<FK\u0094k\u0087<:eáµ\u0019\u000b:Eç& Ç\f\u008bêð2\u0000½EO`Ð\u009e\u0082\u000f'\u0091\u0082\u0092\u009e\u000eÒÙ*]åy°þ\u0018Pì\u0091ØK\u009dÌ\u008cìÙg³.U\u001a\u0099Ü\u0010J\tCnMà\u0001LÌ\u001eýùÛ,H\u0084\u0011àD¼FËÉaIVÅÒo~r\n9¯Ø\u0006Jéi@\u009c©þ\u0099\u00872\u008cô\u0011\u0090\u008cZÐ}¡s\u0007=W\u0080½\b%\u0099xD\u007fîO\u0013µc²\u0013üz/\u0091a÷3\u0098Æ\b`\u0088ù¥ßÛ\u009bµ\u0010¹\u20f7\u0097ÌûSÔßk\u001eè\"jHÈ\u00ad\u0019{&\u0095àU\u0096yq®\u0002^EcÙ\u009c\u0012µk\u008d\u0005>\u009fì¡é\u0010U}»M\t\u0001vË@d\u0013\u009f.\u0019\u000f\u0084,F[ËVux£ûðå\u001c\u0080Ç.e⁉\f\u0016\u0091¡¬oØh æ\u0082Ñ¤¾]\u009b²¢¤\u0099AÜ82R&¶\u009f&\u001e¼c\u007fx\u008a\u0019Ô¦\u0003£tî×\u0012Ó¯F\u0013\u0017ÎÝ\u0098½uª\\p|â`L£Øß~\u0019\u008d\r\u0019ø\u001cÊGt.UâÍ·Àv\u001bI\u0083Ò×ôA\u000bºKI0`\u0083ö:\tÞh×·ù\u001eu½Ä¯ä\fÄº\u0089¹\u0001\u0011¿¹Þ\fý`\u0007âz³ÌØ\"\u008e(º6¬a;\u0097ò`t\u0012×\u000b\u007f\u009b¥¤-Ê«\u001d\"&Ú]+¾\u0011êÙ\u0082\u001c\u0012\u009a\u001dô\u0018³\u0006\u009bÝ\u001b0\u0085ý\u0017\u0011Y·¹Ü)ÂlÝwñ9§\u007fín\r,oû\u0087g\u008c\rÃíOf1/W\u001fÍ\u0084RéÊ\u0019É\u0006ÂgöWKxC\u00111k£\u0097>%^íÇ\u000fõ\u0015:kB(m\u009f¥sN¼\u0099|\u0014\u0090\u0003\u0003\u0093ÂÜ\u0091i¹>Ã'co\u0083jÅd~äæ\u001bæÀ\u0089OÇh?ªy\u000fsÉ\u007fÛÕØ9\u0083ü\u0011\u0010¹&\n5E\u0099µÈ\u0011·\u0099c¡F*\u0091\f·{¼¸\u000eOÒQ´Íå\u009d\u0090è\u009añÎ¦8}~.VX7ãÜ-¿x+%þêÚõs\u0002/°\u0098_\u0096\u0011\u0082Æ×\u0091‽3DQÀj\u0003ò=\n2¨qÎö:æµ\u009d\u0091\u0006'\u0097Û'¿É\nåO½f,è¸ì\u0086ñ\u000b¤\u0098\u000fY\u0003\u0006A\n\u000f\u0015\u0012\u001c\u008cBjïãFéZ\u0017U»ãò\u0086\u0014\u0007\u001b©o\u0087à\u0004\u0098\u0000_{mß\u0007+\u0096\u0084Ûé_¤\u0007§·\u001buÍ\u0015,\u0012o+\u0004\u0013âÏýÝF\u0098=+Î\u0092\u0094\u001f\\]\u001b\u001d\u0093XÕ¥\u0001!²\u000eH\u0098@\u0096ò\u0098\u0089\u008aiH¬¹tùðU\u0006Ö\u001b¢\u0098¯´[-þ7õøçVy0eÑ5sªÔVr\u00800z\u001e3\t}eN¥°\u0090\u008f\u0095[\r\n2UÝ\u008c\u0006çÈ$\u0080:\b;*s\u0085`-0ÜRÐ¬ãò\u0010\u0093=Rrÿ\u0004A\u00ad¸(₉¥\u0018»¸VÿüÀJÜd]X\u0083\u0098m33×\u000e\u0012\f£¯æ(émê](ì\u009c©čëÒ²\u0094\n\u0093Y\u0002Mü4\nùÅ¶\u0097¯\u000b&\u0092ª\u0099b=Àù\u0019'GÒÌ\u0080\u0097\u0087îÉyµ9-Ö°c\u0093IQd\u007fÿ\u000eÊ\u0082¨ãés4¥{,\u008a`Ø?\u0094Ðø^\u000f\u0087ú\u0007¬Íæ\u0002!Év\u001dÃ¼ÕÏ\u0084÷í_áê$-â\u0005\u0092üS\u0087\u0006Æ¾\u0018ªÜHö¡\u00adª8\u0004=å¤¿\u0087/\u0098¿cÑÌöÅÜ\u00adÊ\u007f»In\fp\u0098*³Ë*z]<À\u0006wÞ\u0015\u009eZ\u001brñÖâ\u00ad,Ó%´ø\u0097\u0007\u0082\u0086ð\u0002\u0012\u0091L½f,\u0089ü·:É2q¼¦U÷uÍ1\u009a÷XôD»¥ßä\u0017\u000b\u0086[´x¥\u000e¬±ó\u0096°\u008e\u0017É\u0092C¾p\u0000*\u009f\u0080\u0084þo,¼¬·èG¼\u0085;èfa~¬Á;p&8\u007fÛÜ(,\"Ò\\È\u0013Å\u0015ÈÄ¹VkËi\u0006\u0087Ø@Å\u008c}\u008eÉq\fí\"\u0004¡²SÆ\u0092>j&\u009d\fCRW©Æ\u0083óIn§ð¢\u0007>D3OäF\u0084M\u008e9Á \u00959oÐÎ°¨\u000fA[êî%þr\u008c\u0097´2\u0086À\u0017XE4\u0083Ô\u0004\u0018.Ið\u0000K6^$ËOWú6c½5¢®'ü$Û\u0096³úmYsÉÿ¤7f \u0088±Fa\b \u009a3èy\u0006Ð¯û\u0011áD\tß\u0091ÌéAÞ\u001c#\b\rÛ÷D+LHOÒÎ=2ÞÆ\u0012n$$òæó}EXa7ÊIådñB\u0080BáäÇ;VÜ_\tÁ?a®©/\u007f2v\u001c×XLíÄ\u000e\u0013ÑÛ®ºî4þX\u008bØ²¸ Ù]\u007fØ$ ê'\\·,Ñ©<¬\u00892\u007fy\u000e{JxõaÚ¿9\u0011dí\u20ffs_:8\u0084¤§\u001fã_\u0012\u008fÑ\u0093\u000e7ZÑ\u0090âñ-ÃÃãùmÌ\u000fÍ\u0091ÜýUã«d\u0005ê\u001cÀ\u0016gFeçÕ\u0005iSC¡_:g\u0019í;ÙQ\u001fðí\u0089¡\b\u0090\u008d\u0004*qP\u0097\u008f×Ò·\u000f\u0085\u0000\u0085CAÛÔt\u0093E\u008f0\u0014ã\u000bOîÞ·\u009fæ¿Ç\u0000\u000b-\u0012\u001e¿J¥m¹²\u009a\u000emÏÐXF\nÐ1|\u0086A\u008c)\u0089I\u001b_&\u0092Bÿ)×´\u009b\u0090C\u0011\u0003U¯U\u0001ëì\u0017é\f¡uubÅ8w\u009b\u001d(\u008aakH~:Î_©\u008d\u0095\u007fîîÅ\u00adÂY@ü,\u0000@wæ\u0011(cÉ\u0007N/6\u0011\u0087î\u009a©½©Dn¡¦If\u0088Â¿\u001a¶1*,Äë\u0080\rv\u0001\u0000|\u001d\u0098\u001fÍ=õ~b¸<q\bú¤`AÈ\u0005\u009b=!\u0085\u00adK\u0012Çùm\u00ad\u0087«©<°}\\x\u0012@W|×t%©æ,\u0083\"Ëi|À\u0092\u0016»Ù\u008d\u001fVi\u0019\u008e¢éß»TùÑMÊÔ\u0010\u001fø©\u0006Ó¬~Ã¼õ\u0007ÑþÛÛ\u000b\u0083\u0093\u0019Ä¨c²ÂíÍ/\u0093û+6à<VPSCfÚÁ¯¼<\u0092,1x»ê\u0000*P®-Ô$@bwU\u001fE`\u0006·\u0006-ïÇ\u0016az{áýÙ9Æ=Fû\u0085{*SÍ; )4ãñ;xs±7äÌÞ\u0092\u001d\u0016u\f\u0099WÓ\u0010«Sô ûMf¢vrK \u001d\u0012V\u0016\u008e?áÄ¡Öð\f%wÂ|íÀñ\u009d\u0017\rB¾\u007f\f7b\u0097¢Û¹GÑ(\t¦vÅ,Æ-\u008fN\u007fhÇ¿èp°#Ë\u0093ZØ=\u0017\u0015ïVyFiy´x8\u009bï&àzKrýT¯y¦rëÝ%\u001e\u0015\u009béj#í\u008d¤`a\u0091\u001f\u008a\u009eNT±\u0094\u001e\u008bØª\f?GÎK±\u0089vL×<\u001bÜ\u0013¸Þ3Ý\\:L®,n¢ü¶O:¯eRY\"Ç\rwÃèµ\u0092v4\u000e¸ÒÌ8\u009bmü\u008bÞ^´\u0090VÌ\nd\u0083c%ØTË~ýU\n!\u0081\u0013ëº\u009e&!çT\ns\u001a{`\u0095kå\u00862Í\tr\u0082\u0082?\u0017`ÖWV\t\u000b®^\u0000\u000f!isÌ\t¿\u008c\u001a\u00ad¥\u0004\u0000\u001eJ\u0007V\u008b+u\u0015VP\fÒ\u009c+÷íEØ5çGüÃ\u0007v:ù\u009cçpÞ\u0019Ü\\a¯Ë\u007fªLÔ¥\u0011±\u008aG¡Á\u0012\u0011yJ v?\u009c\u0093\fBµÕSÍ\b¡J\u001d¤\u009fr\u001d`ú÷øP¤\u009f\u0006ÙÞb\u0092É¨sÂ÷\u0000ç\u0081LÑK\n\u0080\u009a÷\u000fó\b8\u0082òä¾ó·°\u0005Ïr1?ý$ÓÅç]\u008bÉim\nª´m\u008fGÎP\u008c\u0081±Ü\u008a¿\u0004\u0089;\"à»\u000bxV\u008eÛ\"Ù¹\u001dÇä\u0003;ÎÜL\t£?-® /N2P\u000f\u0006[Ã\u0083>@.Ó\"&I\b°\u009a)\u0086áýú%\u0006»\u0007\u0096\u0004Læ\u0006Ír½\u0018Ä\u008e\t\tÔÌ¦\u007fe[2!\u0019\u0011{ÙÈ\u0095¢'ÆÎÆ\u0080\u0091\u0095ÈøÎ\u0086\u0083É«\u008f\u0093ù×\u001c\u000e¶\u001c?õ\u0085\u0013\u0011HÕè\u0094\u008fOÄ\u0006\u0004\u000f·:.¤\u0007iÉ\u001aâ\u009b¿Q\u000fñ¨=\u008egcç\u009a»\u008c\u0095\u0013\u0017>ï\u0007#±w¡<\u0002Ø\rþ\u0014èYÅÈÉã\u001e\u001b(\u001a\u0085";
      int var4 = "5zi\u0081q16V v\u0089[Nï@Òq£ý\u0087Ñ;\ri-s¤vðø:ÅI/5Ü\u0002\u0017Vy;:ÞÂþ{\u0092:!¦\u0011\u0097ÓA\u0086'Ù/Æ}=J.zJx#Kt%\u0095SAG[S\u0096ã\u0080X\u001d\u0014\u000eÚÿU\u0082\u000b\f`\u0099|U/d¹\u008d/ÝÓÅºÅ\u0088¥|\u001cü\u001d\u0012òx;\fd\u0092T:Ð7<FK\u0094k\u0087<:eáµ\u0019\u000b:Eç& Ç\f\u008bêð2\u0000½EO`Ð\u009e\u0082\u000f'\u0091\u0082\u0092\u009e\u000eÒÙ*]åy°þ\u0018Pì\u0091ØK\u009dÌ\u008cìÙg³.U\u001a\u0099Ü\u0010J\tCnMà\u0001LÌ\u001eýùÛ,H\u0084\u0011àD¼FËÉaIVÅÒo~r\n9¯Ø\u0006Jéi@\u009c©þ\u0099\u00872\u008cô\u0011\u0090\u008cZÐ}¡s\u0007=W\u0080½\b%\u0099xD\u007fîO\u0013µc²\u0013üz/\u0091a÷3\u0098Æ\b`\u0088ù¥ßÛ\u009bµ\u0010¹\u20f7\u0097ÌûSÔßk\u001eè\"jHÈ\u00ad\u0019{&\u0095àU\u0096yq®\u0002^EcÙ\u009c\u0012µk\u008d\u0005>\u009fì¡é\u0010U}»M\t\u0001vË@d\u0013\u009f.\u0019\u000f\u0084,F[ËVux£ûðå\u001c\u0080Ç.e⁉\f\u0016\u0091¡¬oØh æ\u0082Ñ¤¾]\u009b²¢¤\u0099AÜ82R&¶\u009f&\u001e¼c\u007fx\u008a\u0019Ô¦\u0003£tî×\u0012Ó¯F\u0013\u0017ÎÝ\u0098½uª\\p|â`L£Øß~\u0019\u008d\r\u0019ø\u001cÊGt.UâÍ·Àv\u001bI\u0083Ò×ôA\u000bºKI0`\u0083ö:\tÞh×·ù\u001eu½Ä¯ä\fÄº\u0089¹\u0001\u0011¿¹Þ\fý`\u0007âz³ÌØ\"\u008e(º6¬a;\u0097ò`t\u0012×\u000b\u007f\u009b¥¤-Ê«\u001d\"&Ú]+¾\u0011êÙ\u0082\u001c\u0012\u009a\u001dô\u0018³\u0006\u009bÝ\u001b0\u0085ý\u0017\u0011Y·¹Ü)ÂlÝwñ9§\u007fín\r,oû\u0087g\u008c\rÃíOf1/W\u001fÍ\u0084RéÊ\u0019É\u0006ÂgöWKxC\u00111k£\u0097>%^íÇ\u000fõ\u0015:kB(m\u009f¥sN¼\u0099|\u0014\u0090\u0003\u0003\u0093ÂÜ\u0091i¹>Ã'co\u0083jÅd~äæ\u001bæÀ\u0089OÇh?ªy\u000fsÉ\u007fÛÕØ9\u0083ü\u0011\u0010¹&\n5E\u0099µÈ\u0011·\u0099c¡F*\u0091\f·{¼¸\u000eOÒQ´Íå\u009d\u0090è\u009añÎ¦8}~.VX7ãÜ-¿x+%þêÚõs\u0002/°\u0098_\u0096\u0011\u0082Æ×\u0091‽3DQÀj\u0003ò=\n2¨qÎö:æµ\u009d\u0091\u0006'\u0097Û'¿É\nåO½f,è¸ì\u0086ñ\u000b¤\u0098\u000fY\u0003\u0006A\n\u000f\u0015\u0012\u001c\u008cBjïãFéZ\u0017U»ãò\u0086\u0014\u0007\u001b©o\u0087à\u0004\u0098\u0000_{mß\u0007+\u0096\u0084Ûé_¤\u0007§·\u001buÍ\u0015,\u0012o+\u0004\u0013âÏýÝF\u0098=+Î\u0092\u0094\u001f\\]\u001b\u001d\u0093XÕ¥\u0001!²\u000eH\u0098@\u0096ò\u0098\u0089\u008aiH¬¹tùðU\u0006Ö\u001b¢\u0098¯´[-þ7õøçVy0eÑ5sªÔVr\u00800z\u001e3\t}eN¥°\u0090\u008f\u0095[\r\n2UÝ\u008c\u0006çÈ$\u0080:\b;*s\u0085`-0ÜRÐ¬ãò\u0010\u0093=Rrÿ\u0004A\u00ad¸(₉¥\u0018»¸VÿüÀJÜd]X\u0083\u0098m33×\u000e\u0012\f£¯æ(émê](ì\u009c©čëÒ²\u0094\n\u0093Y\u0002Mü4\nùÅ¶\u0097¯\u000b&\u0092ª\u0099b=Àù\u0019'GÒÌ\u0080\u0097\u0087îÉyµ9-Ö°c\u0093IQd\u007fÿ\u000eÊ\u0082¨ãés4¥{,\u008a`Ø?\u0094Ðø^\u000f\u0087ú\u0007¬Íæ\u0002!Év\u001dÃ¼ÕÏ\u0084÷í_áê$-â\u0005\u0092üS\u0087\u0006Æ¾\u0018ªÜHö¡\u00adª8\u0004=å¤¿\u0087/\u0098¿cÑÌöÅÜ\u00adÊ\u007f»In\fp\u0098*³Ë*z]<À\u0006wÞ\u0015\u009eZ\u001brñÖâ\u00ad,Ó%´ø\u0097\u0007\u0082\u0086ð\u0002\u0012\u0091L½f,\u0089ü·:É2q¼¦U÷uÍ1\u009a÷XôD»¥ßä\u0017\u000b\u0086[´x¥\u000e¬±ó\u0096°\u008e\u0017É\u0092C¾p\u0000*\u009f\u0080\u0084þo,¼¬·èG¼\u0085;èfa~¬Á;p&8\u007fÛÜ(,\"Ò\\È\u0013Å\u0015ÈÄ¹VkËi\u0006\u0087Ø@Å\u008c}\u008eÉq\fí\"\u0004¡²SÆ\u0092>j&\u009d\fCRW©Æ\u0083óIn§ð¢\u0007>D3OäF\u0084M\u008e9Á \u00959oÐÎ°¨\u000fA[êî%þr\u008c\u0097´2\u0086À\u0017XE4\u0083Ô\u0004\u0018.Ið\u0000K6^$ËOWú6c½5¢®'ü$Û\u0096³úmYsÉÿ¤7f \u0088±Fa\b \u009a3èy\u0006Ð¯û\u0011áD\tß\u0091ÌéAÞ\u001c#\b\rÛ÷D+LHOÒÎ=2ÞÆ\u0012n$$òæó}EXa7ÊIådñB\u0080BáäÇ;VÜ_\tÁ?a®©/\u007f2v\u001c×XLíÄ\u000e\u0013ÑÛ®ºî4þX\u008bØ²¸ Ù]\u007fØ$ ê'\\·,Ñ©<¬\u00892\u007fy\u000e{JxõaÚ¿9\u0011dí\u20ffs_:8\u0084¤§\u001fã_\u0012\u008fÑ\u0093\u000e7ZÑ\u0090âñ-ÃÃãùmÌ\u000fÍ\u0091ÜýUã«d\u0005ê\u001cÀ\u0016gFeçÕ\u0005iSC¡_:g\u0019í;ÙQ\u001fðí\u0089¡\b\u0090\u008d\u0004*qP\u0097\u008f×Ò·\u000f\u0085\u0000\u0085CAÛÔt\u0093E\u008f0\u0014ã\u000bOîÞ·\u009fæ¿Ç\u0000\u000b-\u0012\u001e¿J¥m¹²\u009a\u000emÏÐXF\nÐ1|\u0086A\u008c)\u0089I\u001b_&\u0092Bÿ)×´\u009b\u0090C\u0011\u0003U¯U\u0001ëì\u0017é\f¡uubÅ8w\u009b\u001d(\u008aakH~:Î_©\u008d\u0095\u007fîîÅ\u00adÂY@ü,\u0000@wæ\u0011(cÉ\u0007N/6\u0011\u0087î\u009a©½©Dn¡¦If\u0088Â¿\u001a¶1*,Äë\u0080\rv\u0001\u0000|\u001d\u0098\u001fÍ=õ~b¸<q\bú¤`AÈ\u0005\u009b=!\u0085\u00adK\u0012Çùm\u00ad\u0087«©<°}\\x\u0012@W|×t%©æ,\u0083\"Ëi|À\u0092\u0016»Ù\u008d\u001fVi\u0019\u008e¢éß»TùÑMÊÔ\u0010\u001fø©\u0006Ó¬~Ã¼õ\u0007ÑþÛÛ\u000b\u0083\u0093\u0019Ä¨c²ÂíÍ/\u0093û+6à<VPSCfÚÁ¯¼<\u0092,1x»ê\u0000*P®-Ô$@bwU\u001fE`\u0006·\u0006-ïÇ\u0016az{áýÙ9Æ=Fû\u0085{*SÍ; )4ãñ;xs±7äÌÞ\u0092\u001d\u0016u\f\u0099WÓ\u0010«Sô ûMf¢vrK \u001d\u0012V\u0016\u008e?áÄ¡Öð\f%wÂ|íÀñ\u009d\u0017\rB¾\u007f\f7b\u0097¢Û¹GÑ(\t¦vÅ,Æ-\u008fN\u007fhÇ¿èp°#Ë\u0093ZØ=\u0017\u0015ïVyFiy´x8\u009bï&àzKrýT¯y¦rëÝ%\u001e\u0015\u009béj#í\u008d¤`a\u0091\u001f\u008a\u009eNT±\u0094\u001e\u008bØª\f?GÎK±\u0089vL×<\u001bÜ\u0013¸Þ3Ý\\:L®,n¢ü¶O:¯eRY\"Ç\rwÃèµ\u0092v4\u000e¸ÒÌ8\u009bmü\u008bÞ^´\u0090VÌ\nd\u0083c%ØTË~ýU\n!\u0081\u0013ëº\u009e&!çT\ns\u001a{`\u0095kå\u00862Í\tr\u0082\u0082?\u0017`ÖWV\t\u000b®^\u0000\u000f!isÌ\t¿\u008c\u001a\u00ad¥\u0004\u0000\u001eJ\u0007V\u008b+u\u0015VP\fÒ\u009c+÷íEØ5çGüÃ\u0007v:ù\u009cçpÞ\u0019Ü\\a¯Ë\u007fªLÔ¥\u0011±\u008aG¡Á\u0012\u0011yJ v?\u009c\u0093\fBµÕSÍ\b¡J\u001d¤\u009fr\u001d`ú÷øP¤\u009f\u0006ÙÞb\u0092É¨sÂ÷\u0000ç\u0081LÑK\n\u0080\u009a÷\u000fó\b8\u0082òä¾ó·°\u0005Ïr1?ý$ÓÅç]\u008bÉim\nª´m\u008fGÎP\u008c\u0081±Ü\u008a¿\u0004\u0089;\"à»\u000bxV\u008eÛ\"Ù¹\u001dÇä\u0003;ÎÜL\t£?-® /N2P\u000f\u0006[Ã\u0083>@.Ó\"&I\b°\u009a)\u0086áýú%\u0006»\u0007\u0096\u0004Læ\u0006Ír½\u0018Ä\u008e\t\tÔÌ¦\u007fe[2!\u0019\u0011{ÙÈ\u0095¢'ÆÎÆ\u0080\u0091\u0095ÈøÎ\u0086\u0083É«\u008f\u0093ù×\u001c\u000e¶\u001c?õ\u0085\u0013\u0011HÕè\u0094\u008fOÄ\u0006\u0004\u000f·:.¤\u0007iÉ\u001aâ\u009b¿Q\u000fñ¨=\u008egcç\u009a»\u008c\u0095\u0013\u0017>ï\u0007#±w¡<\u0002Ø\rþ\u0014èYÅÈÉã\u001e\u001b(\u001a\u0085"
         .length();
      char var1 = 269;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 26;
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
                     case 0 -> 103;
                     case 1 -> 31;
                     case 2 -> 17;
                     case 3 -> 112;
                     case 4 -> 35;
                     case 5 -> 82;
                     default -> 33;
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
                     b = new String[86];
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

                  var2 = "ï¥+òáyE#üìQ\u000f±o\u0096JÍbÕ0\nÉ>Ûk\u0014Al«^DQTÄ\\ì*î\u009fkhã\u00ad";
                  var4 = "ï¥+òáyE#üìQ\u000f±o\u0096JÍbÕ0\nÉ>Ûk\u0014Al«^DQTÄ\\ì*î\u009fkhã\u00ad".length();
                  var1 = 7;
                  var8 = -1;
            }

            var10000 = 96;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -4488) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 120;
            case 1 -> 253;
            case 2 -> 17;
            case 3 -> 8;
            case 4 -> 135;
            case 5 -> 240;
            case 6 -> 15;
            case 7 -> 199;
            case 8 -> 23;
            case 9 -> 156;
            case 10 -> 215;
            case 11 -> 255;
            case 12 -> 116;
            case 13 -> 147;
            case 14 -> 35;
            case 15 -> 247;
            case 16 -> 146;
            case 17 -> 157;
            case 18 -> 58;
            case 19 -> 96;
            case 20 -> 188;
            case 21 -> 208;
            case 22 -> 176;
            case 23 -> 125;
            case 24 -> 105;
            case 25 -> 38;
            case 26 -> 162;
            case 27 -> 187;
            case 28 -> 203;
            case 29 -> 113;
            case 30 -> 52;
            case 31 -> 212;
            case 32 -> 73;
            case 33 -> 238;
            case 34 -> 181;
            case 35 -> 124;
            case 36 -> 21;
            case 37 -> 175;
            case 38 -> 48;
            case 39 -> 144;
            case 40 -> 67;
            case 41 -> 69;
            case 42 -> 97;
            case 43 -> 141;
            case 44 -> 194;
            case 45 -> 109;
            case 46 -> 169;
            case 47 -> 252;
            case 48 -> 64;
            case 49 -> 126;
            case 50 -> 45;
            case 51 -> 39;
            case 52 -> 153;
            case 53 -> 33;
            case 54 -> 251;
            case 55 -> 119;
            case 56 -> 12;
            case 57 -> 66;
            case 58 -> 209;
            case 59 -> 112;
            case 60 -> 233;
            case 61 -> 85;
            case 62 -> 152;
            case 63 -> 81;
            case 64 -> 242;
            case 65 -> 213;
            case 66 -> 149;
            case 67 -> 2;
            case 68 -> 250;
            case 69 -> 237;
            case 70 -> 89;
            case 71 -> 94;
            case 72 -> 230;
            case 73 -> 202;
            case 74 -> 3;
            case 75 -> 102;
            case 76 -> 136;
            case 77 -> 1;
            case 78 -> 228;
            case 79 -> 108;
            case 80 -> 44;
            case 81 -> 25;
            case 82 -> 128;
            case 83 -> 14;
            case 84 -> 59;
            case 85 -> 111;
            case 86 -> 40;
            case 87 -> 217;
            case 88 -> 83;
            case 89 -> 200;
            case 90 -> 90;
            case 91 -> 129;
            case 92 -> 70;
            case 93 -> 182;
            case 94 -> 110;
            case 95 -> 184;
            case 96 -> 53;
            case 97 -> 9;
            case 98 -> 218;
            case 99 -> 201;
            case 100 -> 227;
            case 101 -> 27;
            case 102 -> 164;
            case 103 -> 159;
            case 104 -> 24;
            case 105 -> 19;
            case 106 -> 100;
            case 107 -> 211;
            case 108 -> 161;
            case 109 -> 223;
            case 110 -> 4;
            case 111 -> 173;
            case 112 -> 104;
            case 113 -> 86;
            case 114 -> 18;
            case 115 -> 118;
            case 116 -> 185;
            case 117 -> 54;
            case 118 -> 0;
            case 119 -> 179;
            case 120 -> 77;
            case 121 -> 137;
            case 122 -> 49;
            case 123 -> 72;
            case 124 -> 220;
            case 125 -> 178;
            case 126 -> 50;
            case 127 -> 99;
            case 128 -> 7;
            case 129 -> 117;
            case 130 -> 56;
            case 131 -> 172;
            case 132 -> 243;
            case 133 -> 30;
            case 134 -> 74;
            case 135 -> 29;
            case 136 -> 76;
            case 137 -> 214;
            case 138 -> 246;
            case 139 -> 133;
            case 140 -> 235;
            case 141 -> 127;
            case 142 -> 155;
            case 143 -> 42;
            case 144 -> 61;
            case 145 -> 166;
            case 146 -> 88;
            case 147 -> 231;
            case 148 -> 65;
            case 149 -> 132;
            case 150 -> 171;
            case 151 -> 13;
            case 152 -> 139;
            case 153 -> 80;
            case 154 -> 163;
            case 155 -> 189;
            case 156 -> 224;
            case 157 -> 158;
            case 158 -> 191;
            case 159 -> 239;
            case 160 -> 168;
            case 161 -> 150;
            case 162 -> 20;
            case 163 -> 177;
            case 164 -> 198;
            case 165 -> 22;
            case 166 -> 254;
            case 167 -> 204;
            case 168 -> 222;
            case 169 -> 154;
            case 170 -> 192;
            case 171 -> 114;
            case 172 -> 6;
            case 173 -> 92;
            case 174 -> 11;
            case 175 -> 151;
            case 176 -> 93;
            case 177 -> 206;
            case 178 -> 131;
            case 179 -> 87;
            case 180 -> 62;
            case 181 -> 82;
            case 182 -> 78;
            case 183 -> 107;
            case 184 -> 75;
            case 185 -> 148;
            case 186 -> 216;
            case 187 -> 121;
            case 188 -> 180;
            case 189 -> 79;
            case 190 -> 138;
            case 191 -> 236;
            case 192 -> 197;
            case 193 -> 134;
            case 194 -> 167;
            case 195 -> 122;
            case 196 -> 165;
            case 197 -> 196;
            case 198 -> 245;
            case 199 -> 37;
            case 200 -> 71;
            case 201 -> 43;
            case 202 -> 219;
            case 203 -> 229;
            case 204 -> 41;
            case 205 -> 68;
            case 206 -> 60;
            case 207 -> 115;
            case 208 -> 210;
            case 209 -> 145;
            case 210 -> 26;
            case 211 -> 98;
            case 212 -> 5;
            case 213 -> 193;
            case 214 -> 32;
            case 215 -> 249;
            case 216 -> 232;
            case 217 -> 101;
            case 218 -> 57;
            case 219 -> 47;
            case 220 -> 16;
            case 221 -> 195;
            case 222 -> 28;
            case 223 -> 140;
            case 224 -> 142;
            case 225 -> 221;
            case 226 -> 248;
            case 227 -> 130;
            case 228 -> 205;
            case 229 -> 63;
            case 230 -> 226;
            case 231 -> 51;
            case 232 -> 183;
            case 233 -> 160;
            case 234 -> 95;
            case 235 -> 84;
            case 236 -> 186;
            case 237 -> 103;
            case 238 -> 234;
            case 239 -> 190;
            case 240 -> 55;
            case 241 -> 143;
            case 242 -> 36;
            case 243 -> 244;
            case 244 -> 31;
            case 245 -> 174;
            case 246 -> 225;
            case 247 -> 207;
            case 248 -> 91;
            case 249 -> 123;
            case 250 -> 34;
            case 251 -> 106;
            case 252 -> 10;
            case 253 -> 46;
            case 254 -> 241;
            default -> 170;
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
   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      implements me.octo.client.IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII {
      public void e() {
      }

      public void a(char var1, int var2) {
      }

      public void d() {
         me.octo.client.IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.d();
      }

      public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
         return me.octo.client.IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.a(var1, var2, var3, var4, var5, var6);
      }
   }

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
      implements me.octo.client.IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII {
      final Function0<Unit> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(Function0<Unit> var1) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      }

      public void e() {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.invoke();
      }

      public void a(char var1, int var2) {
      }

      public void d() {
         me.octo.client.IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.d();
      }

      public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
         return me.octo.client.IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.a(var1, var2, var3, var4, var5, var6);
      }
   }
}
