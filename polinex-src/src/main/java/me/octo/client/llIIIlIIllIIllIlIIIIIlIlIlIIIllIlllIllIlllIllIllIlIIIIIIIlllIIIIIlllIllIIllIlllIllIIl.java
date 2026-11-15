package me.octo.client;

import com.mojang.blaze3d.platform.InputConstants;
import com.mojang.blaze3d.platform.InputConstants.Key;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.CharsKt;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.input.KeyEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl
   extends llIIlIlIlIIIlIIIIlIllIlIllIllIIlIlIIllllIllIlllIlIIIllllllllllIlIllIIlllIlIIlIIIlllIl
   implements IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII {
   @NotNull
   public static llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private final lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private final me.octo.client.utils.llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private boolean lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private int IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private boolean llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private final String lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @Nullable
   private static llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private static Minecraft lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] d;
   private static String[] e;

   // W8-3 backfill: interface default-method bridges (jar flags 0x0041 ACC_PUBLIC|ACC_BRIDGE,
   // jar body = aload_0; invokespecial InterfaceMethod IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.d:()V / .a:(IIIIII)Z)
   public void d() {
      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.d();
   }

   public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
      return IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.a(var1, var2, var3, var4, var5, var6);
   }

   // W8-3 backfill: compiler-synthesised static accessor (jar flags 0x1019 ACC_PUBLIC|STATIC|FINAL|SYNTHETIC)
   public static final llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl aq() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   public llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl(
      @NotNull lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll var1
   ) {
      short var10001 = 20878;
      short var10002 = 24547;
      Intrinsics.checkNotNullParameter(var1, "keybind");
      super();
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new me.octo.client.utils.llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll(
         120
      );
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = Integer.MIN_VALUE;
      String var2 = Integer.toString(System.identityHashCode(this), CharsKt.checkRadix(16));
      short var10003 = 20879;
      short var10004 = 21998;
      Intrinsics.checkNotNullExpressionValue(var2, "toString(...)");
      var10002 = 20868;
      var10003 = -23637;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = "keybind-" + var2;
   }

   @Override
   public void e() {
      this.a(true);
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .r();
      this.a(me.octo.client.utils.lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl.a());
      lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = this;
      me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var10000 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      String var10001 = this.Z();
      short var10002 = 20867;
      short var10003 = 14872;
      var10000.a(
         "kbrip:" + var10001,
         0.0F,
         0.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .ah()
            .a(140),
         40.0F,
         420L
      );
   }

   @Override
   public void a(char var1, int var2) {
      boolean var3 = IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.ay();
      llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl var10000 = this;
      if (!var3) {
         if (!this.ae()) {
            return;
         }

         var10000 = this;
      }

      var10000.c(var1, var2);
   }

   public final void c(int var1) {
      boolean var2 = IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.az();
      int var10000 = ((this.ae()) ? 1 : 0);
      if (var2) {
         if (var10000 == 0) {
            return;
         }

         var10000 = var1;
      }

      byte var10001 = 2;
      if (var2) {
         if (var10000 < 2) {
            return;
         }

         var10000 = var1;
         var10001 = 7;
      }

      if (var10000 <= var10001) {
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var1);
         llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e();
         this.a(false);
         this.a(me.octo.client.utils.lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl.a());
         lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = null;
         this.al();
      }
   }

   public final boolean a(@NotNull GuiGraphicsExtractor var1, int var2, int var3, float var4, float var5) {
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var41 = null; // PX-FIX
      int var10000 = ((IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.ay()) ? 1 : 0);
      short var10002 = 20877;
      short var10003 = 20666;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      boolean var6 = (var10000 != 0);
      float var7 = 12.0F;
      float var8 = 28.0F;
      float var9 = 38.0F;
      var10000 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b();
      if (!var6) {
         var10000 = var10000 == 0 ? 1 : 0;
      }

      int var10 = var10000;
      String var34;
      if (var10 != 0) {
         short var33 = 20865;
         short var10001 = -6012;
         var34 = "NONE";
      } else {
         var34 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.a(
            this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b()
         );
      }

      String var11 = var34;
      float var12 = (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(
               me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll,
               var11,
               false,
               2,
               null);
      float var13 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .c(var12 + var7 * 2, var9);
      var10000 = ((this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) ? 1 : 0);
      if (!var6) {
         if (!this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) {
            this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.c(var13);
            this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = true;
         }

         var10000 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b();
      }

      int var14;
      label183: {
         label189: {
            var14 = var10000;
            if (!var6) {
               if (var14 == this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) {
                  break label189;
               }

               this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.a(var13);
               this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var14;
            }

            if (!var6) {
               break label183;
            }

            me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
               new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[5]
            );
         }

         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.a(var13);
      }

      float var15;
      float var16;
      float var17;
      float var18;
      label173: {
         label190: {
            var15 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.e();
            var16 = var4 - var15 + 5.0F;
            var17 = var5 - var8 / 2.0F;
            var18 = var8 / 2.0F;
            float var54;
            var10000 = (var54 = var2 - (var16 - 2)) == 0.0F ? 0 : (var54 < 0.0F ? -1 : 1);
            if (!var6) {
               if (var10000 < 0) {
                  break label190;
               }

               float var55;
               var10000 = (var55 = var3 - (var17 - 2)) == 0.0F ? 0 : (var55 < 0.0F ? -1 : 1);
            }

            if (!var6) {
               if (var10000 < 0) {
                  break label190;
               }

               float var56;
               var10000 = (var56 = var2 - (var16 + var15 + 2)) == 0.0F ? 0 : (var56 < 0.0F ? -1 : 1);
            }

            if (!var6) {
               if (var10000 >= 0) {
                  break label190;
               }

               float var57;
               var10000 = (var57 = var3 - (var17 + var8 + 2)) == 0.0F ? 0 : (var57 < 0.0F ? -1 : 1);
            }

            if (var6) {
               break label173;
            }

            if (var10000 < 0) {
               var10000 = 1;
               break label173;
            }
         }

         var10000 = 0;
      }

      int var19 = var10000;
      me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var37 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      String var45 = this.Z();
      var10002 = 20866;
      var10003 = 4388;
      float var20 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(var37, "kb:" + var45, (var19 != 0), 0.0F, 4, null);
      me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var38 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      var45 = this.Z();
      var10002 = 20871;
      var10003 = -8928;
      float var21 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(var38, "kbsel:" + var45, this.ae(), 0.0F, 4, null);
      List var22 = var14 != 0
         ? IIIlIllIIIllllllIllllIIIlIllIllIllIIIIlllllllIIIIlllllIllIIIIlIIlIIIIIlIlllllIlIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, var14)
         : CollectionsKt.emptyList();
      var10000 = ((var22.isEmpty()) ? 1 : 0);
      if (!var6) {
         var10000 = var10000 == 0 ? 1 : 0;
      }

      int var23;
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var25;
      label151: {
         me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var26;
         label150: {
            var23 = var10000;
            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var24 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .r()
               .a(
                  RangesKt.coerceIn(
                     (int)(
                        IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .r()
                              .d()
                           * 0.55F
                     ),
                     0,
                     255
                  )
               );
            var25 = me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .L(),
                  var24,
                  var21
               );
            var26 = me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a()
                     .a(220),
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(),
                  var21
               );
            var10000 = var23;
            if (!var6) {
               if (var23 == 0) {
                  break label150;
               }

               float var58;
               var10000 = (var58 = var21 - 0.5F) == 0.0F ? 0 : (var58 < 0.0F ? -1 : 1);
            }

            if (var10000 < 0) {
               var41 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .P();
               break label151;
            }
         }

         var41 = var26;
      }

      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var27 = var41;
      float var28 = var20 * 70.0F;
      float var29 = var28 + (170.0F - var28) * var21;
      float var59;
      var10000 = (var59 = var29 - 0.5F) == 0.0F ? 0 : (var59 < 0.0F ? -1 : 1);
      if (!var6) {
         if (var10000 > 0) {
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(
                  var16,
                  var17,
                  var15,
                  var8,
                  var18,
                  8.0F + 2.0F * var21,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .ah()
                     .a(RangesKt.coerceIn((int)var29, 0, 255))
               );
         }

         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var16, var17, var15, var8, var25, var18);
         var10000 = RangesKt.coerceIn((int)(180.0F * (1.0F - var21)), 0, 255);
      }

      label141: {
         label191: {
            int var30 = var10000;
            var10000 = var23;
            if (!var6) {
               if (var23 != 0) {
                  int var31 = RangesKt.coerceIn((int)(210.0F * (1.0F - var21)), 0, 255);
                  var10000 = var31;
                  if (var6) {
                     break label141;
                  }

                  if (var31 <= 0) {
                     break label191;
                  }

                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                     var16,
                     var17,
                     var15,
                     var8,
                     1.5F,
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .P()
                        .a(var31),
                     var18
                  );
                  if (!var6) {
                     break label191;
                  }
               }

               var10000 = var30;
            }

            if (var6) {
               break label141;
            }

            if (var10000 > 0) {
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                  var16,
                  var17,
                  var15,
                  var8,
                  1.0F,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .N()
                     .a(var30),
                  var18
               );
            }
         }

         me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var44 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         var45 = this.Z();
         var10002 = 20867;
         var10003 = 14872;
         var44.a("kbrip:" + var45, var16, var17, var15, var8, var18);
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll
            .c(var11, var16 + var15 / 2.0F, var5 - 7.0F, var27, false);
         var10000 = var23;
      }

      label126:
      if (!var6) {
         if (var10000 != 0) {
            var10000 = var19;
            if (var6) {
               break label126;
            }

            if (var19 != 0) {
               IIIlIllIIIllllllIllllIIIlIllIllIllIIIIlllllllIIIIlllllIllIIIIlIIlIIIIIlIlllllIlIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var16 + var15 / 2.0F, var17, var22);
            }
         }

         float var60;
         var10000 = (var60 = var2 - (var16 - 2)) == 0.0F ? 0 : (var60 < 0.0F ? -1 : 1);
      }

      if (!var6) {
         if (var10000 < 0) {
            return (0 != 0);
         }

         float var61;
         var10000 = (var61 = var3 - (var17 - 2)) == 0.0F ? 0 : (var61 < 0.0F ? -1 : 1);
      }

      if (!var6) {
         if (var10000 < 0) {
            return (0 != 0);
         }

         float var62;
         var10000 = (var62 = var2 - (var16 + var15 + 2)) == 0.0F ? 0 : (var62 < 0.0F ? -1 : 1);
      }

      if (!var6) {
         if (var10000 >= 0) {
            return (0 != 0);
         }

         float var63;
         var10000 = (var63 = var3 - (var17 + var8 + 2)) == 0.0F ? 0 : (var63 < 0.0F ? -1 : 1);
      }

      if (var6) {
         return (var10000 != 0);
      } else {
         return (var10000 < 0);
      }
   }

   private final void al() {
      me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var10000 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      String var10001 = this.Z();
      short var10002 = 20870;
      short var10003 = -6044;
      var10000.a(
         "kbrip:" + var10001,
         0.0F,
         0.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .ah()
            .a(170),
         120.0F,
         520L
      );
   }

   public final float am() {
      boolean var1 = IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.az();
      int var10000 = ((this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) ? 1 : 0);
      if (var1) {
         if (this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) {
            return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.e();
         }

         var10000 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b();
      }

      String var4;
      if (var10000 == 0) {
         short var3 = 20869;
         short var10001 = 18392;
         var4 = "NONE";
      } else {
         var4 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.a(
            this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b()
         );
      }

      String var2 = var4;
      return me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .c(
            (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(
                  me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll,
                  var2,
                  false,
                  2,
                  null)
               + 24.0F,
            38.0F
         );
   }

   public final int an() {
      boolean var1 = IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.az();
      int var10000 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b();
      if (var1) {
         if (var10000 != 0) {
            String var2 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.a(
               this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b()
            );
            int var3 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
               me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
               var2,
               false,
               2,
               null
            );
            return me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b(var3 + 10, 26)
               + me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
                  me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
                  "[",
                  false,
                  2,
                  null
               );
         }

         var10000 = 26
            + me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
               me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
               "[",
               false,
               2,
               null
            );
      }

      return var10000;
   }

   @Override
   public void c(char var1, int var2) {
      boolean var3 = IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.ay();
      int var10000 = ((this.ae()) ? 1 : 0);
      if (!var3) {
         if (var10000 == 0) {
            return;
         }

         var10000 = var2;
      }

      if (!var3) {
         switch (var10000) {
            case 256:
            case 259:
            case 261:
               this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(0);
               llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .e();
               this.a(false);
               this.a(me.octo.client.utils.lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl.a());
               lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = null;
               this.al();
               if (!var3) {
                  return;
               }
            case 257:
            case 258:
            case 260:
            default:
               var10000 = var2;
         }
      }

      if (!var3) {
         if (var10000 == -1) {
            return;
         }

         var10000 = var2;
      }

      if (var10000 > 0) {
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var2);
         llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e();
         this.a(false);
         this.a(me.octo.client.utils.lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl.a());
         lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = null;
         this.al();
      }
   }

   @Override
   public void ai() {
      this.a(false);
      if (Intrinsics.areEqual(lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI, this)) {
         lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = null;
      }
   }

   @NotNull
   @Override
   public String ad() {
      return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.a(
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b()
      );
   }

   public final int ao() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b();
   }

   public final boolean ap() {
      boolean var1 = IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.az();
      int var10000 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b();
      if (var1) {
         var10000 = var10000 != 0 ? 1 : 0;
      }

      return (var10000 != 0);
   }

   @NotNull
   @Override
   public String Z() {
      return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var21 = null; // PX-FIX
      String[] var5 = new String[11];
      int var3 = 0;
      String var2 = "k\u0097zÉx]\u0006~ÓÙM1@\u0004ãK×ú\bÆèÅÆÁ\u000f{W\u0006Ö\u0089Ì\u0006\u0093)\u0003gC²\u0004õh\u0015\u009e\u0010³Kë\u0099¯·A²{\u001aÙ\"K$\u0094\u0081\rj&\u0086BÝL\u008a\u0092\u001d\u0095Ð1O";
      int var4 = "k\u0097zÉx]\u0006~ÓÙM1@\u0004ãK×ú\bÆèÅÆÁ\u000f{W\u0006Ö\u0089Ì\u0006\u0093)\u0003gC²\u0004õh\u0015\u009e\u0010³Kë\u0099¯·A²{\u001aÙ\"K$\u0094\u0081\rj&\u0086BÝL\u008a\u0092\u001d\u0095Ð1O"
         .length();
      char var1 = 6;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 85;
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
                     case 0 -> 79;
                     case 1 -> 119;
                     case 2 -> 116;
                     case 3 -> 97;
                     case 4 -> 55;
                     case 5 -> 68;
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
                     d = var5;
                     e = new String[11];
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     Minecraft var10 = Minecraft.getInstance();
                     var10002 = 20864;
                     short var32 = 25895;
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

                  var2 = "3\u0081\u0088\u0018\u009b'Ã\u000bõ¡¦üo\r8\u009cõ\u0080\u0080";
                  var4 = "3\u0081\u0088\u0018\u009b'Ã\u000bõ¡¦üo\r8\u009cõ\u0080\u0080".length();
                  var1 = 7;
                  var8 = -1;
            }

            var10000 = 41;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String d(int var0, int var1) {
      int var2 = (var0 ^ 20871) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 52;
            case 1 -> 44;
            case 2 -> 68;
            case 3 -> 105;
            case 4 -> 180;
            case 5 -> 245;
            case 6 -> 198;
            case 7 -> 231;
            case 8 -> 223;
            case 9 -> 248;
            case 10 -> 208;
            case 11 -> 75;
            case 12 -> 88;
            case 13 -> 142;
            case 14 -> 220;
            case 15 -> 176;
            case 16 -> 252;
            case 17 -> 237;
            case 18 -> 169;
            case 19 -> 158;
            case 20 -> 242;
            case 21 -> 137;
            case 22 -> 209;
            case 23 -> 87;
            case 24 -> 164;
            case 25 -> 82;
            case 26 -> 4;
            case 27 -> 96;
            case 28 -> 131;
            case 29 -> 233;
            case 30 -> 63;
            case 31 -> 80;
            case 32 -> 18;
            case 33 -> 26;
            case 34 -> 187;
            case 35 -> 10;
            case 36 -> 204;
            case 37 -> 177;
            case 38 -> 93;
            case 39 -> 153;
            case 40 -> 146;
            case 41 -> 45;
            case 42 -> 67;
            case 43 -> 19;
            case 44 -> 108;
            case 45 -> 62;
            case 46 -> 226;
            case 47 -> 100;
            case 48 -> 114;
            case 49 -> 235;
            case 50 -> 230;
            case 51 -> 136;
            case 52 -> 182;
            case 53 -> 122;
            case 54 -> 70;
            case 55 -> 147;
            case 56 -> 25;
            case 57 -> 115;
            case 58 -> 0;
            case 59 -> 250;
            case 60 -> 34;
            case 61 -> 179;
            case 62 -> 112;
            case 63 -> 219;
            case 64 -> 69;
            case 65 -> 152;
            case 66 -> 29;
            case 67 -> 17;
            case 68 -> 31;
            case 69 -> 125;
            case 70 -> 154;
            case 71 -> 43;
            case 72 -> 92;
            case 73 -> 32;
            case 74 -> 138;
            case 75 -> 2;
            case 76 -> 174;
            case 77 -> 22;
            case 78 -> 228;
            case 79 -> 9;
            case 80 -> 200;
            case 81 -> 206;
            case 82 -> 133;
            case 83 -> 202;
            case 84 -> 76;
            case 85 -> 165;
            case 86 -> 238;
            case 87 -> 101;
            case 88 -> 203;
            case 89 -> 124;
            case 90 -> 212;
            case 91 -> 40;
            case 92 -> 73;
            case 93 -> 166;
            case 94 -> 30;
            case 95 -> 39;
            case 96 -> 139;
            case 97 -> 221;
            case 98 -> 232;
            case 99 -> 104;
            case 100 -> 85;
            case 101 -> 156;
            case 102 -> 11;
            case 103 -> 216;
            case 104 -> 103;
            case 105 -> 225;
            case 106 -> 186;
            case 107 -> 167;
            case 108 -> 130;
            case 109 -> 149;
            case 110 -> 132;
            case 111 -> 83;
            case 112 -> 234;
            case 113 -> 6;
            case 114 -> 129;
            case 115 -> 8;
            case 116 -> 47;
            case 117 -> 162;
            case 118 -> 175;
            case 119 -> 57;
            case 120 -> 121;
            case 121 -> 23;
            case 122 -> 42;
            case 123 -> 249;
            case 124 -> 148;
            case 125 -> 14;
            case 126 -> 199;
            case 127 -> 59;
            case 128 -> 99;
            case 129 -> 246;
            case 130 -> 141;
            case 131 -> 126;
            case 132 -> 236;
            case 133 -> 213;
            case 134 -> 5;
            case 135 -> 16;
            case 136 -> 170;
            case 137 -> 119;
            case 138 -> 107;
            case 139 -> 91;
            case 140 -> 184;
            case 141 -> 197;
            case 142 -> 98;
            case 143 -> 172;
            case 144 -> 144;
            case 145 -> 140;
            case 146 -> 66;
            case 147 -> 195;
            case 148 -> 56;
            case 149 -> 240;
            case 150 -> 205;
            case 151 -> 128;
            case 152 -> 193;
            case 153 -> 117;
            case 154 -> 54;
            case 155 -> 188;
            case 156 -> 191;
            case 157 -> 150;
            case 158 -> 161;
            case 159 -> 94;
            case 160 -> 53;
            case 161 -> 159;
            case 162 -> 90;
            case 163 -> 28;
            case 164 -> 163;
            case 165 -> 65;
            case 166 -> 229;
            case 167 -> 55;
            case 168 -> 46;
            case 169 -> 89;
            case 170 -> 120;
            case 171 -> 74;
            case 172 -> 218;
            case 173 -> 241;
            case 174 -> 254;
            case 175 -> 12;
            case 176 -> 222;
            case 177 -> 41;
            case 178 -> 151;
            case 179 -> 72;
            case 180 -> 95;
            case 181 -> 84;
            case 182 -> 13;
            case 183 -> 211;
            case 184 -> 181;
            case 185 -> 24;
            case 186 -> 214;
            case 187 -> 145;
            case 188 -> 185;
            case 189 -> 7;
            case 190 -> 194;
            case 191 -> 253;
            case 192 -> 51;
            case 193 -> 192;
            case 194 -> 239;
            case 195 -> 110;
            case 196 -> 143;
            case 197 -> 109;
            case 198 -> 168;
            case 199 -> 97;
            case 200 -> 255;
            case 201 -> 81;
            case 202 -> 189;
            case 203 -> 38;
            case 204 -> 113;
            case 205 -> 134;
            case 206 -> 71;
            case 207 -> 127;
            case 208 -> 116;
            case 209 -> 123;
            case 210 -> 155;
            case 211 -> 102;
            case 212 -> 201;
            case 213 -> 217;
            case 214 -> 27;
            case 215 -> 86;
            case 216 -> 111;
            case 217 -> 160;
            case 218 -> 1;
            case 219 -> 20;
            case 220 -> 244;
            case 221 -> 64;
            case 222 -> 48;
            case 223 -> 79;
            case 224 -> 50;
            case 225 -> 118;
            case 226 -> 3;
            case 227 -> 157;
            case 228 -> 21;
            case 229 -> 215;
            case 230 -> 15;
            case 231 -> 196;
            case 232 -> 36;
            case 233 -> 224;
            case 234 -> 171;
            case 235 -> 77;
            case 236 -> 243;
            case 237 -> 58;
            case 238 -> 37;
            case 239 -> 227;
            case 240 -> 61;
            case 241 -> 35;
            case 242 -> 178;
            case 243 -> 49;
            case 244 -> 207;
            case 245 -> 247;
            case 246 -> 106;
            case 247 -> 183;
            case 248 -> 210;
            case 249 -> 33;
            case 250 -> 135;
            case 251 -> 173;
            case 252 -> 60;
            case 253 -> 190;
            case 254 -> 251;
            default -> 78;
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

         e[var2] = new String(var3).intern();
      }

      return e[var2];
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

      private static String[] a;
      private static String[] b;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @Nullable
      public final llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl a() {
         return llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      }

      @NotNull
      public final String a(int var1) {
         String var4;
         switch (var1) {
            case -1:
            case 0:
               short var5 = 12936;
               short var10001 = -14995;
               var4 = "NONE";
               break;
            default:
               Key var10000 = InputConstants.getKey(new KeyEvent(var1, 0, 0));
               short var10002 = 12939;
               short var10003 = 99;
               Intrinsics.checkNotNullExpressionValue(var10000, "getKey(...)");
               Key var2 = var10000;
               String var3 = var2.getDisplayName().getString();
               var10002 = 12938;
               var10003 = -12227;
               Intrinsics.checkNotNullExpressionValue(var3, "getString(...)");
               var4 = var3.toUpperCase(Locale.ROOT);
               var10002 = 12937;
               var10003 = -29217;
               Intrinsics.checkNotNullExpressionValue(var4, "toUpperCase(...)");
         }

         return var4;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[4];
         int var3 = 0;
         String var2 = "ðÁÌÀ+Ü\u0098<7¢Ä\\ yü\u0094\u0004\r\f\u0015h";
         int var4 = "ðÁÌÀ+Ü\u0098<7¢Ä\\ yü\u0094\u0004\r\f\u0015h".length();
         char var1 = 16;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 104;
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
                        case 0 -> 11;
                        case 1 -> 83;
                        case 2 -> 121;
                        case 3 -> 5;
                        case 4 -> 119;
                        case 5 -> 26;
                        default -> 122;
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
                        b = new String[4];
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

                     var2 = "¡^¹L\u009a\u0002L\u001aüôX\u000eÕx7\u0090Z\u0089&A\u0091Ñ\u0092\u000bG]";
                     var4 = "¡^¹L\u009a\u0002L\u001aüôX\u000eÕx7\u0090Z\u0089&A\u0091Ñ\u0092\u000bG]".length();
                     var1 = 11;
                     var8 = -1;
               }

               var10000 = 11;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
   } // PX-FIX end pxClinit
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 12937) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 164;
               case 1 -> 160;
               case 2 -> 201;
               case 3 -> 141;
               case 4 -> 29;
               case 5 -> 122;
               case 6 -> 18;
               case 7 -> 146;
               case 8 -> 125;
               case 9 -> 198;
               case 10 -> 140;
               case 11 -> 73;
               case 12 -> 193;
               case 13 -> 240;
               case 14 -> 96;
               case 15 -> 246;
               case 16 -> 135;
               case 17 -> 9;
               case 18 -> 244;
               case 19 -> 196;
               case 20 -> 168;
               case 21 -> 215;
               case 22 -> 27;
               case 23 -> 84;
               case 24 -> 109;
               case 25 -> 52;
               case 26 -> 195;
               case 27 -> 3;
               case 28 -> 48;
               case 29 -> 252;
               case 30 -> 207;
               case 31 -> 38;
               case 32 -> 231;
               case 33 -> 130;
               case 34 -> 47;
               case 35 -> 183;
               case 36 -> 42;
               case 37 -> 82;
               case 38 -> 199;
               case 39 -> 174;
               case 40 -> 247;
               case 41 -> 81;
               case 42 -> 74;
               case 43 -> 22;
               case 44 -> 119;
               case 45 -> 229;
               case 46 -> 228;
               case 47 -> 234;
               case 48 -> 180;
               case 49 -> 28;
               case 50 -> 150;
               case 51 -> 112;
               case 52 -> 169;
               case 53 -> 152;
               case 54 -> 20;
               case 55 -> 91;
               case 56 -> 120;
               case 57 -> 138;
               case 58 -> 188;
               case 59 -> 101;
               case 60 -> 78;
               case 61 -> 41;
               case 62 -> 123;
               case 63 -> 213;
               case 64 -> 177;
               case 65 -> 179;
               case 66 -> 238;
               case 67 -> 206;
               case 68 -> 110;
               case 69 -> 167;
               case 70 -> 31;
               case 71 -> 40;
               case 72 -> 67;
               case 73 -> 57;
               case 74 -> 137;
               case 75 -> 121;
               case 76 -> 118;
               case 77 -> 224;
               case 78 -> 83;
               case 79 -> 64;
               case 80 -> 212;
               case 81 -> 21;
               case 82 -> 162;
               case 83 -> 106;
               case 84 -> 253;
               case 85 -> 191;
               case 86 -> 5;
               case 87 -> 132;
               case 88 -> 158;
               case 89 -> 59;
               case 90 -> 36;
               case 91 -> 187;
               case 92 -> 170;
               case 93 -> 171;
               case 94 -> 136;
               case 95 -> 243;
               case 96 -> 35;
               case 97 -> 178;
               case 98 -> 145;
               case 99 -> 153;
               case 100 -> 220;
               case 101 -> 197;
               case 102 -> 24;
               case 103 -> 79;
               case 104 -> 17;
               case 105 -> 108;
               case 106 -> 219;
               case 107 -> 235;
               case 108 -> 184;
               case 109 -> 227;
               case 110 -> 77;
               case 111 -> 75;
               case 112 -> 7;
               case 113 -> 12;
               case 114 -> 72;
               case 115 -> 33;
               case 116 -> 185;
               case 117 -> 165;
               case 118 -> 218;
               case 119 -> 25;
               case 120 -> 189;
               case 121 -> 209;
               case 122 -> 200;
               case 123 -> 159;
               case 124 -> 100;
               case 125 -> 105;
               case 126 -> 155;
               case 127 -> 8;
               case 128 -> 226;
               case 129 -> 133;
               case 130 -> 203;
               case 131 -> 30;
               case 132 -> 251;
               case 133 -> 148;
               case 134 -> 129;
               case 135 -> 89;
               case 136 -> 92;
               case 137 -> 0;
               case 138 -> 23;
               case 139 -> 192;
               case 140 -> 45;
               case 141 -> 216;
               case 142 -> 34;
               case 143 -> 13;
               case 144 -> 95;
               case 145 -> 147;
               case 146 -> 211;
               case 147 -> 248;
               case 148 -> 232;
               case 149 -> 214;
               case 150 -> 205;
               case 151 -> 19;
               case 152 -> 4;
               case 153 -> 53;
               case 154 -> 50;
               case 155 -> 221;
               case 156 -> 134;
               case 157 -> 16;
               case 158 -> 166;
               case 159 -> 32;
               case 160 -> 154;
               case 161 -> 157;
               case 162 -> 93;
               case 163 -> 11;
               case 164 -> 175;
               case 165 -> 143;
               case 166 -> 54;
               case 167 -> 239;
               case 168 -> 223;
               case 169 -> 114;
               case 170 -> 151;
               case 171 -> 149;
               case 172 -> 233;
               case 173 -> 242;
               case 174 -> 254;
               case 175 -> 204;
               case 176 -> 66;
               case 177 -> 26;
               case 178 -> 104;
               case 179 -> 222;
               case 180 -> 225;
               case 181 -> 43;
               case 182 -> 6;
               case 183 -> 156;
               case 184 -> 65;
               case 185 -> 161;
               case 186 -> 176;
               case 187 -> 163;
               case 188 -> 117;
               case 189 -> 208;
               case 190 -> 186;
               case 191 -> 115;
               case 192 -> 249;
               case 193 -> 210;
               case 194 -> 99;
               case 195 -> 1;
               case 196 -> 10;
               case 197 -> 182;
               case 198 -> 80;
               case 199 -> 217;
               case 200 -> 127;
               case 201 -> 144;
               case 202 -> 37;
               case 203 -> 86;
               case 204 -> 61;
               case 205 -> 94;
               case 206 -> 97;
               case 207 -> 49;
               case 208 -> 85;
               case 209 -> 113;
               case 210 -> 88;
               case 211 -> 14;
               case 212 -> 39;
               case 213 -> 139;
               case 214 -> 126;
               case 215 -> 98;
               case 216 -> 103;
               case 217 -> 245;
               case 218 -> 190;
               case 219 -> 194;
               case 220 -> 116;
               case 221 -> 128;
               case 222 -> 2;
               case 223 -> 107;
               case 224 -> 70;
               case 225 -> 76;
               case 226 -> 51;
               case 227 -> 236;
               case 228 -> 124;
               case 229 -> 111;
               case 230 -> 68;
               case 231 -> 102;
               case 232 -> 172;
               case 233 -> 44;
               case 234 -> 131;
               case 235 -> 202;
               case 236 -> 173;
               case 237 -> 69;
               case 238 -> 71;
               case 239 -> 250;
               case 240 -> 237;
               case 241 -> 56;
               case 242 -> 230;
               case 243 -> 181;
               case 244 -> 60;
               case 245 -> 90;
               case 246 -> 255;
               case 247 -> 142;
               case 248 -> 58;
               case 249 -> 63;
               case 250 -> 15;
               case 251 -> 62;
               case 252 -> 87;
               case 253 -> 46;
               case 254 -> 241;
               default -> 55;
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
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker p0) { this(); }
   }
}
