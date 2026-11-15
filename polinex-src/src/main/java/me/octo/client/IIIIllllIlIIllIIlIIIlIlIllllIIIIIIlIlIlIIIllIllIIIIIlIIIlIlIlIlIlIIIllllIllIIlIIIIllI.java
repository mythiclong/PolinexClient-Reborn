package me.octo.client;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.glfw.GLFW;

public final class IIIIllllIlIIllIIlIIIlIlIllllIIIIIIlIlIlIIIllIllIIIIIlIIIlIlIlIlIlIIIllllIllIIlIIIIllI
   implements IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl {
   @NotNull
   public static IIIIllllIlIIllIIlIIIlIlIllllIIIIIIlIlIlIIIllIllIIIIIlIIIlIlIlIlIlIIIllllIllIIlIIIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private boolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private long IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private final long IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private final lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @Nullable
   private static IIIIllllIlIIllIIlIIIlIlIllllIIIIIIlIlIlIIIllIllIIIIIlIIIlIlIlIlIlIIIllllIllIIlIIIIllI IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static float llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static float lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static String[] d;
   private static String[] e;

   public IIIIllllIlIIllIIlIIIlIlIllllIIIIIIlIlIlIIIllIllIIIIIlIIIlIlIlIlIlIIIllllIllIIlIIIIllI(
      @NotNull IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII var1
   ) {
      short var10001 = -9428;
      short var10002 = -28272;
      Intrinsics.checkNotNullParameter(var1, "setting");
      super();
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = true;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 530L;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII();
   }

   @NotNull
   @Override
   public lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll a(
      @NotNull GuiGraphicsExtractor var1,
      @NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var2,
      int var3,
      int var4,
      int var5
   ) {
      String var43 = null; // PX-FIX
      Object var39 = null; // PX-FIX
      Object var34 = null; // PX-FIX
      Object var33 = null; // PX-FIX
      short var10001 = -9431;
      int var10002 = 2950;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      String[] var10000 = lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      var10002 = (short)-9425;
      short var10003 = -32568;
      Intrinsics.checkNotNullParameter(var2, "resolution");
      int var7 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a(var1, (int)var2.c(), var3, (int)var2.e());
      float var8 = var2.c() + 14.0F;
      String[] var6 = var10000;
      float var9 = var2.e() - 14.0F;
      float var10 = var9 - var8;
      float var11 = var7;
      float var12 = var11 + 24.0F;
      long var13 = System.currentTimeMillis();
      if (var13 - this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         > this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
         boolean var41 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         if (var6 != null) {
            var41 = !this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         }

         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var41;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var13;
      }

      String var15;
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var16;
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var17;
      label235: {
         label241: {
            var15 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.U();
            var16 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
               ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .h()
               : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .j();
            var17 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
               ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .z()
               : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .y();
            float var56;
            var33 = (var56 = var4 - var8) == 0.0F ? 0 : (var56 < 0.0F ? -1 : 1);
            if (var6 != null) {
               if ((me.octo.client.PxTruth.truth(var33))) {
                  break label241;
               }

               float var57;
               var33 = (var57 = var4 - var9) == 0.0F ? 0 : (var57 < 0.0F ? -1 : 1);
            }

            if (var6 != null) {
               if ((me.octo.client.PxTruth.truth(var33))) {
                  break label241;
               }

               float var58;
               var33 = (var58 = var5 - var11) == 0.0F ? 0 : (var58 < 0.0F ? -1 : 1);
            }

            if (var6 != null) {
               if ((me.octo.client.PxTruth.truth(var33))) {
                  break label241;
               }

               float var59;
               var33 = (var59 = var5 - var12) == 0.0F ? 0 : (var59 < 0.0F ? -1 : 1);
            }

            if (var6 == null) {
               break label235;
            }

            if ((me.octo.client.PxTruth.truth(var33))) {
               var33 = 1;
               break label235;
            }
         }

         var33 = 0;
      }

      int var18 =((Integer)( var33));
      var34 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      String var42 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.Z();
      short var48 = -9426;
      var10003 = -1384;
      var43 = "strfocus:" + var42;
      var10002 = ((this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) ? 1 : 0);
      label214:
      if (var6 != null) {
         if (!this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
            var10002 = var18;
            if (var6 == null) {
               break label214;
            }

            if (var18 == 0) {
               var10002 = 0;
               break label214;
            }
         }

         var10002 = 1;
      }

      label242: {
         float var19 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(var34, var43, (var10002 != 0), 0.0F, 4, null
         );
         float var60;
         int var35 = (var60 = var19 - 0.01F) == 0.0F ? 0 : (var60 < 0.0F ? -1 : 1);
         if (var6 != null) {
            if (var35 > 0) {
               float var20 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ? 0.7F : var19 * 0.4F;
               me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
                  me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                  var8,
                  var11,
                  var10,
                  24.0F,
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(),
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .ah(),
                  var20,
                  3.0F);
            }

            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var8, var11, var10, 24.0F, var16, IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a()
            );
            if (var6 == null) {
               break label242;
            }

            var35 = ((this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) ? 1 : 0);
         }

         if (var35 != 0) {
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var8 - 1.0F,
               var11 - 1.0F,
               var10 + 2.0F,
               26.0F,
               1.0F,
               var17.a(0.3F),
               IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a() + 1.0F
            );
         }

         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var8, var11, var10, 24.0F, 1.0F, var17, IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a()
         );
         me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var36 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         String var44 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.Z();
         var48 = -9429;
         var10003 = 21786;
         var36.a("strrip:" + var44, var8, var11, var10, 24.0F, IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a());
      }

      float var29 = var8 + 8.0F;
      float var21 = var11 + 12.0F - 6.0F;
      float var22 = var10 - 16.0F;
      int var37 = var15.length();
      if (var6 != null) {
         var37 = var37 > 0 ? 1 : 0;
      }

      label198: {
         label244: {
            if (var37 != 0) {
               label246: {
                  float var23 = (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl, var15, false, 2, null);
                  float var38 = var23;
                  float var45 = var22;
                  if (var6 != null) {
                     if (!(var23 > var22)) {
                        var10000 = ((String[])(Object)(var15));
                        break label246;
                     }

                     var38 = var23;
                     var45 = var22;
                  }

                  float var25 = var38 - var45;
                  int var26 = 0;
                  int var27 = 0;
                  int var28 = var15.length();

                  while (var27 < var28) {
                     var25 -= (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl,
                        String.valueOf(var15.charAt(var27)),
                        false, 2, null);
                     if (var6 != null) {
                        float var61;
                        var39 = (var61 = var25 - 0.0F) == 0.0F ? 0 : (var61 < 0.0F ? -1 : 1);
                        if (var6 == null) {
                           break label198;
                        }

                        if ((me.octo.client.PxTruth.truth(var39))) {
                           var26 = var27;
                           if (var6 != null) {
                              break;
                           }
                        }

                        var27++;
                     }

                     if (var6 == null) {
                        break;
                     }
                  }

                  var10000 = ((String[])(Object)(var15.substring(var26)));
                  var48 = -9430;
                  var10003 = -9434;
                  Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
               }

               String var24;
               var24 = String.valueOf(var10000);
               var39 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               label175:
               if (var6 != null) {
                  if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
                     var39 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.a();
                     if (var6 == null) {
                        break label175;
                     }

                     if (!(me.octo.client.PxTruth.truth(var39))) {
                        lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .a(
                              var29,
                              var21,
                              (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl, var24, false, 2, null),
                              14.400001F
                           );
                     }
                  }

                  me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl, var24, var29, var21, IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(), false, 16, null);
                  var39 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               }

               if (var6 == null) {
                  break label198;
               }

               if ((me.octo.client.PxTruth.truth(var39))) {
                  break label244;
               }

               var39 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
               if (var6 == null) {
                  break label198;
               }

               if (!this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) {
                  break label244;
               }

               float var32 = (float)(
                  var29
                     + me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl, var24, false, 2, null)
               );
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                  var32,
                  var21,
                  1.5F,
                  14.400001F,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(),
                  0.0F
               );
               if (var6 != null) {
                  break label244;
               }
            }

            var39 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            if (var6 != null) {
               if (!this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
                  var10001 = -9438;
                  var48 = 31051;
                  me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
                     me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl,
                     "Enter text...",
                     var29,
                     var21,
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                        .a(0.6F),
                     false, 16, null);
                  if (var6 != null) {
                     break label244;
                  }
               }

               var39 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            }

            if (var6 == null) {
               break label198;
            }

            if (!(me.octo.client.PxTruth.truth(var39))) {
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                  var29,
                  var21,
                  1.5F,
                  14.400001F,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(),
                  0.0F
               );
            }
         }

         float var62;
         var39 = (var62 = var4 - var8) == 0.0F ? 0 : (var62 < 0.0F ? -1 : 1);
      }

      label148: {
         label249: {
            if (var6 != null) {
               if ((me.octo.client.PxTruth.truth(var39))) {
                  break label249;
               }

               float var63;
               var39 = (var63 = var4 - var9) == 0.0F ? 0 : (var63 < 0.0F ? -1 : 1);
            }

            if (var6 != null) {
               if ((me.octo.client.PxTruth.truth(var39))) {
                  break label249;
               }

               float var64;
               var39 = (var64 = var5 - var11) == 0.0F ? 0 : (var64 < 0.0F ? -1 : 1);
            }

            if (var6 != null) {
               if ((me.octo.client.PxTruth.truth(var39))) {
                  break label249;
               }

               float var65;
               var39 = (var65 = var5 - var12) == 0.0F ? 0 : (var65 < 0.0F ? -1 : 1);
            }

            if (var6 != null) {
               if ((me.octo.client.PxTruth.truth(var39))) {
                  break label249;
               }

               float var66;
               var39 = (var66 = var5 - (var2.d() + 5)) == 0.0F ? 0 : (var66 < 0.0F ? -1 : 1);
            }

            if (var6 == null) {
               break label148;
            }

            if ((me.octo.client.PxTruth.truth(var39))) {
               var39 = 1;
               break label148;
            }
         }

         var39 = 0;
      }

      int var30 =((Integer)( var39));
      IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl var31 = null;
      if (var30 != 0) {
         var31 = this;
         llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(true);
      }

      return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll((int)(var12 + 6.0F), var31);
   }

   @Override
   public int a(@NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var1) {
      String[] var2;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll var6;
      label37: {
         short var10001 = -9432;
         short var10002 = 12212;
         Intrinsics.checkNotNullParameter(var1, "resolution");
         String[] var10000 = lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
         IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         var2 = var10000;
         IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII var5 = var4;
         if (var2 != null) {
            if (!(var4 instanceof IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll)) {
               var6 = null;
               break label37;
            }

            var5 = var4;
         }

         var6 = (IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll)var5;
      }

      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll var3 = var6;
      var6 = var3;
      if (var2 != null) {
         if (var3 == null) {
            return 50;
         }

         var6 = var3;
      }

      int var8 = var6.ab().length();
      if (var2 != null) {
         var8 = var8 > 0 ? 1 : 0;
      }

      return var8 != 0 ? 60 : 50;
   }

   @NotNull
   @Override
   public IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll c() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @Override
   public void e() {
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = this;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = true;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.b();
      this.d();
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .r();
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = me.octo.client.utils.lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl.a();
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = true;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = System.currentTimeMillis();
      me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var10000 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      String var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.Z();
      short var10002 = -9427;
      short var10003 = 12031;
      var10000.a(
         "strrip:" + var10001,
         0.0F,
         0.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .ah()
            .a(140),
         80.0F,
         480L
      );
   }

   // PX-FIX SYN5: synthetic members recovered from class bytes (name,descriptor) exact.

   // Interface default delegates (jar ACC_BRIDGE/ACC_SYNTHETIC): javac reproduces the body and the
   // exact (name,descriptor) but records only ACC_PUBLIC, so the flag deviation is expected.

   public float a() {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a();
   }

   public int b() {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b();
   }

   public boolean a(GuiGraphicsExtractor var1, int var2, int var3, int var4, int var5, float var6) {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var1, var2, var3, var4, var5, var6);
   }

   public boolean b(GuiGraphicsExtractor var1, int var2, int var3, int var4, int var5, float var6) {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b(var1, var2, var3, var4, var5, var6);
   }

   public boolean a(GuiGraphicsExtractor var1, int var2, int var3, float var4, float var5, float var6, float var7) {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public void a(char var1, int var2) {
      IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var1, var2);
   }

   public void d() {
      IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.d();
   }

   public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var1, var2, var3, var4, var5, var6);
   }

   // Static field accessors for IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII (jar ACC_SYNTHETIC static getter/setter).

   public static final IIIIllllIlIIllIIlIIIlIlIllllIIIIIIlIlIlIIIllIllIIIIIlIIIlIlIlIlIlIIIllllIllIIlIIIIllI k() {
      return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   public static final void f(IIIIllllIlIIllIIlIIIlIlIllllIIIIIIlIlIlIIIllIllIIIIIlIIIlIlIlIlIlIIIllllIllIIlIIIIllI var0) {
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var0;
   }
   public final void f() {
      String[] var10000 = lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = false;
      String[] var1 = var10000;
      IIIIllllIlIIllIIlIIIlIlIllllIIIIIIlIlIlIIIllIllIIIIIlIIIlIlIlIlIlIIIllllIllIIlIIIIllI var2 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      if (var1 != null) {
         if (Intrinsics.areEqual(IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII, this)) {
            IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = null;
         }

         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = true;
         var2 = this;
      }

      var2.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.b();
   }

   public final boolean a(int var1, int var2) {
      String[] var3 = lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      int var10000 = ((this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) ? 1 : 0);
      if (var3 != null) {
         if (!this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
            return false;
         }

         var10000 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
            .a(
               var1,
               null,
               null
            ) ? 1 : 0;
      }

      if (var3 != null) {
         if (var10000 != 0) {
            this.g();
            return true;
         }

         var10000 = var1;
      }

      if (var3 != null) {
         label101: {
            label77:
            switch (var10000) {
               case 86:
                  if (var3 == null) {
                     return (var2 != 0);
                  }

                  if (var2 == 1) {
                     boolean var5 = this.h();
                     if (var3 == null) {
                        return var5;
                     }

                     if (var5) {
                        this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                           .b(null);
                        this.i();
                        return true;
                     }
                  }
                  break label101;
               case 256:
               case 257:
                  this.f();
                  return false;
               case 259:
                  var10000 = var2;
                  if (var3 == null) {
                     break;
                  }

                  switch (var2) {
                     case 1:
                     case 2:
                        var10000 = ((java.util.function.Supplier<Integer>)(() -> { this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                           .a(String.valueOf((kotlin.jvm.functions.Function1)null)); return 0; })).get();
                        break label77;
                     default:
                        if (var3 != null) {
                           break label101;
                        }
                  }
               case 261:
                  if (var3 == null) {
                     return (var2 != 0);
                  }

                  if (var2 == 1) {
                     this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.b();
                     this.j();
                     return true;
                  }
               default:
                  break label101;
            }

            if (var3 != null) {
               if (var10000 != 0) {
                  this.g();
                  if (var3 != null) {
                     return true;
                  }
               }

               var10000 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.U().length();
            }

            if (var3 != null) {
               var10000 = var10000 > 0 ? 1 : 0;
            }

            if (var10000 != 0) {
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.V();
               this.g();
            }

            return true;
         }

         var10000 = 0;
      }

      return (var10000 != 0);
   }

   public final void a(char var1) {
      String[] var2 = lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      char var10000 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ? (char)1 : (char)0;
      if (var2 != null) {
         if (!this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
            return;
         }

         var10000 = var1;
      }

      label29: {
         short var10001;
         var10001 = 32;
         label28:
         if (var2 != null) {
            if (var10000 >= ' ') {
               var10000 = var1;
               var10001 = 126;
               if (var2 == null) {
                  break label28;
               }

               if (var1 <= '~') {
                  break label29;
               }
            }

            var10000 = var1;
            var10001 = 167;
         }

         if (var10000 != var10001) {
            return;
         }
      }

      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
         .b(null);
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.d(String.valueOf(var1));
      this.g();
   }

   private final void g() {
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = true;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = System.currentTimeMillis();
   }

   private final boolean h() {
      String[] var10000 = lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      long var2 = Minecraft.getInstance().getWindow().handle();
      String[] var1 = var10000;
      int var4 = GLFW.glfwGetKey(var2, 341);
      if (var1 != null) {
         if (var4 != 1) {
            int var5 = GLFW.glfwGetKey(var2, 345);
            if (var1 == null) {
               return (var5 != 0);
            }

            if (var5 != 1) {
               return (0 != 0);
            }
         }

         var4 = 1;
      }

      return (var4 != 0);
   }

   private final void i() {
      char var6 = 0; // PX-FIX
      String[] var1 = lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      if (var1 != null) {
         String var10000 = GLFW.glfwGetClipboardString(Minecraft.getInstance().getWindow().handle());
         if (var10000 != null) {
            String var2 = var10000;
            int var3 = 0;
            int var4 = var2.length();

            while (true) {
               if (var3 < var4) {
                  char var5 = var2.charAt(var3);
                  if (var1 == null) {
                     break;
                  }

                  label35: {
                     label34: {
                        short var10001;
                        var6 = var5;
                        var10001 = 32;
                        label33:
                        if (var1 != null) {
                           if (var5 >= ' ') {
                              var6 = var5;
                              var10001 = 126;
                              if (var1 == null) {
                                 break label33;
                              }

                              if (var5 <= '~') {
                                 break label34;
                              }
                           }

                           var6 = var5;
                           var10001 = 167;
                        }

                        if (var6 != var10001) {
                           break label35;
                        }
                     }

                     this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.d(String.valueOf(var5));
                  }

                  var3++;
                  if (var1 != null) {
                     continue;
                  }
               }

               this.g();
               break;
            }

            return;
         }
      }
   }

   private final void j() {
      String[] var1 = lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();

      do {
         boolean var10000;
         if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.U().length() > 0) {
            var10000 = true;
            if (var1 != null) {
            }
         } else {
            var10000 = false;
         }

         if (!var10000) {
            break;
         }

         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.V();
      } while (var1 != null);

      this.g();
   }

   private static final String a(IIIIllllIlIIllIIlIIIlIlIllllIIIIIIlIlIlIIIllIllIIIIIlIIIlIlIlIlIlIIIllllIllIIlIIIIllI var0) {
      return var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.U();
   }

   private static final Unit b(IIIIllllIlIIllIIlIIIlIlIllllIIIIIIlIlIlIIIllIllIIIIIlIIIlIlIlIlIlIIIllllIllIIlIIIIllI var0) {
      var0.j();
      return Unit.INSTANCE;
   }

   private static final Unit c(IIIIllllIlIIllIIlIIIlIlIllllIIIIIIlIlIlIIIllIllIIIIIlIIIlIlIlIlIlIIIllllIllIIlIIIIllI var0) {
      var0.j();
      return Unit.INSTANCE;
   }

   private static final Unit d(IIIIllllIlIIllIIlIIIlIlIllllIIIIIIlIlIlIIIllIllIIIIIlIIIlIlIlIlIlIIIllllIllIIlIIIIllI var0) {
      var0.j();
      return Unit.INSTANCE;
   }

   private static final Unit e(IIIIllllIlIIllIIlIIIlIlIllllIIIIIIlIlIlIIIllIllIIIIIlIIIlIlIlIlIlIIIllllIllIIlIIIIllI var0) {
      var0.j();
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[9];
      int var3 = 0;
      String var2 = "\u0084,¬ýÏ\r=Ñþòª]M>\u0007\u008c»½/âtu\nÅ\"´2çl>\u001d(Ê\u000b\u0089uû5q\u008d<e;m\n\t\u0098L?Å´¬6Ë]\ncY`]}\u0081m B}\u0007H,#è÷T\u008a";
      int var4 = "\u0084,¬ýÏ\r=Ñþòª]M>\u0007\u008c»½/âtu\nÅ\"´2çl>\u001d(Ê\u000b\u0089uû5q\u008d<e;m\n\t\u0098L?Å´¬6Ë]\ncY`]}\u0081m B}\u0007H,#è÷T\u008a"
         .length();
      char var1 = 14;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 27;
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
                     case 0 -> 91;
                     case 1 -> 46;
                     case 2 -> 80;
                     case 3 -> 109;
                     case 4 -> 114;
                     case 5 -> 8;
                     default -> 97;
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
                     d = var5;
                     e = new String[9];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIIIllllIlIIllIIlIIIlIlIllllIIIIIIlIlIlIIIllIllIIIIIlIIIlIlIlIlIlIIIllllIllIIlIIIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
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

                  var2 = "T×+/½ù\u0013\r\u0081ág§éM¯G\u0080\u009b\u0014*\u0017";
                  var4 = "T×+/½ù\u0013\r\u0081ág§éM¯G\u0080\u009b\u0014*\u0017".length();
                  var1 = 7;
                  var8 = -1;
            }

            var10000 = 23;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String c(int var0, int var1) {
      int var2 = (var0 ^ -9430) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 40;
            case 1 -> 193;
            case 2 -> 232;
            case 3 -> 67;
            case 4 -> 11;
            case 5 -> 255;
            case 6 -> 188;
            case 7 -> 177;
            case 8 -> 21;
            case 9 -> 71;
            case 10 -> 19;
            case 11 -> 154;
            case 12 -> 131;
            case 13 -> 45;
            case 14 -> 206;
            case 15 -> 212;
            case 16 -> 114;
            case 17 -> 43;
            case 18 -> 150;
            case 19 -> 166;
            case 20 -> 167;
            case 21 -> 57;
            case 22 -> 130;
            case 23 -> 142;
            case 24 -> 148;
            case 25 -> 213;
            case 26 -> 55;
            case 27 -> 50;
            case 28 -> 228;
            case 29 -> 44;
            case 30 -> 129;
            case 31 -> 122;
            case 32 -> 85;
            case 33 -> 151;
            case 34 -> 41;
            case 35 -> 119;
            case 36 -> 59;
            case 37 -> 7;
            case 38 -> 15;
            case 39 -> 3;
            case 40 -> 8;
            case 41 -> 200;
            case 42 -> 4;
            case 43 -> 196;
            case 44 -> 251;
            case 45 -> 179;
            case 46 -> 194;
            case 47 -> 106;
            case 48 -> 231;
            case 49 -> 201;
            case 50 -> 141;
            case 51 -> 105;
            case 52 -> 161;
            case 53 -> 58;
            case 54 -> 234;
            case 55 -> 39;
            case 56 -> 117;
            case 57 -> 18;
            case 58 -> 159;
            case 59 -> 92;
            case 60 -> 165;
            case 61 -> 139;
            case 62 -> 203;
            case 63 -> 204;
            case 64 -> 132;
            case 65 -> 36;
            case 66 -> 48;
            case 67 -> 61;
            case 68 -> 241;
            case 69 -> 87;
            case 70 -> 176;
            case 71 -> 109;
            case 72 -> 134;
            case 73 -> 1;
            case 74 -> 191;
            case 75 -> 244;
            case 76 -> 101;
            case 77 -> 171;
            case 78 -> 180;
            case 79 -> 75;
            case 80 -> 248;
            case 81 -> 86;
            case 82 -> 218;
            case 83 -> 13;
            case 84 -> 162;
            case 85 -> 2;
            case 86 -> 173;
            case 87 -> 239;
            case 88 -> 16;
            case 89 -> 181;
            case 90 -> 226;
            case 91 -> 78;
            case 92 -> 27;
            case 93 -> 236;
            case 94 -> 211;
            case 95 -> 225;
            case 96 -> 163;
            case 97 -> 186;
            case 98 -> 68;
            case 99 -> 102;
            case 100 -> 26;
            case 101 -> 94;
            case 102 -> 210;
            case 103 -> 172;
            case 104 -> 98;
            case 105 -> 97;
            case 106 -> 160;
            case 107 -> 83;
            case 108 -> 62;
            case 109 -> 192;
            case 110 -> 79;
            case 111 -> 133;
            case 112 -> 112;
            case 113 -> 80;
            case 114 -> 66;
            case 115 -> 37;
            case 116 -> 246;
            case 117 -> 107;
            case 118 -> 52;
            case 119 -> 128;
            case 120 -> 168;
            case 121 -> 95;
            case 122 -> 149;
            case 123 -> 10;
            case 124 -> 145;
            case 125 -> 170;
            case 126 -> 65;
            case 127 -> 138;
            case 128 -> 155;
            case 129 -> 25;
            case 130 -> 250;
            case 131 -> 156;
            case 132 -> 242;
            case 133 -> 189;
            case 134 -> 108;
            case 135 -> 33;
            case 136 -> 73;
            case 137 -> 115;
            case 138 -> 229;
            case 139 -> 144;
            case 140 -> 28;
            case 141 -> 207;
            case 142 -> 5;
            case 143 -> 14;
            case 144 -> 253;
            case 145 -> 157;
            case 146 -> 124;
            case 147 -> 205;
            case 148 -> 197;
            case 149 -> 47;
            case 150 -> 220;
            case 151 -> 169;
            case 152 -> 34;
            case 153 -> 64;
            case 154 -> 17;
            case 155 -> 63;
            case 156 -> 233;
            case 157 -> 202;
            case 158 -> 9;
            case 159 -> 77;
            case 160 -> 126;
            case 161 -> 88;
            case 162 -> 74;
            case 163 -> 121;
            case 164 -> 185;
            case 165 -> 249;
            case 166 -> 82;
            case 167 -> 175;
            case 168 -> 56;
            case 169 -> 49;
            case 170 -> 22;
            case 171 -> 136;
            case 172 -> 20;
            case 173 -> 76;
            case 174 -> 199;
            case 175 -> 54;
            case 176 -> 182;
            case 177 -> 184;
            case 178 -> 227;
            case 179 -> 72;
            case 180 -> 252;
            case 181 -> 143;
            case 182 -> 81;
            case 183 -> 238;
            case 184 -> 96;
            case 185 -> 123;
            case 186 -> 120;
            case 187 -> 110;
            case 188 -> 254;
            case 189 -> 127;
            case 190 -> 152;
            case 191 -> 51;
            case 192 -> 214;
            case 193 -> 53;
            case 194 -> 140;
            case 195 -> 70;
            case 196 -> 111;
            case 197 -> 90;
            case 198 -> 221;
            case 199 -> 0;
            case 200 -> 113;
            case 201 -> 217;
            case 202 -> 135;
            case 203 -> 103;
            case 204 -> 91;
            case 205 -> 195;
            case 206 -> 100;
            case 207 -> 42;
            case 208 -> 147;
            case 209 -> 104;
            case 210 -> 35;
            case 211 -> 12;
            case 212 -> 245;
            case 213 -> 23;
            case 214 -> 60;
            case 215 -> 93;
            case 216 -> 237;
            case 217 -> 158;
            case 218 -> 223;
            case 219 -> 187;
            case 220 -> 30;
            case 221 -> 84;
            case 222 -> 208;
            case 223 -> 198;
            case 224 -> 174;
            case 225 -> 146;
            case 226 -> 183;
            case 227 -> 125;
            case 228 -> 69;
            case 229 -> 222;
            case 230 -> 31;
            case 231 -> 216;
            case 232 -> 153;
            case 233 -> 230;
            case 234 -> 38;
            case 235 -> 247;
            case 236 -> 190;
            case 237 -> 178;
            case 238 -> 46;
            case 239 -> 209;
            case 240 -> 224;
            case 241 -> 219;
            case 242 -> 118;
            case 243 -> 137;
            case 244 -> 243;
            case 245 -> 6;
            case 246 -> 215;
            case 247 -> 235;
            case 248 -> 89;
            case 249 -> 32;
            case 250 -> 99;
            case 251 -> 240;
            case 252 -> 29;
            case 253 -> 164;
            case 254 -> 116;
            default -> 24;
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

// PX-FIX SYN5b: Kotlin synthetic constructor, delegates to the private no-arg one
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

// PX-FIX SYN5b: static accessor bridge
      public static final float a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll arg0) {
         return arg0.a();
      }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      private final float a() {
         return IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .aq();
      }

      @Nullable
      public final IIIIllllIlIIllIIlIIIlIlIllllIIIIIIlIlIlIIIllIllIIIIIlIIIlIlIlIlIlIIIllllIllIIlIIIIllI b() {
         return IIIIllllIlIIllIIlIIIlIlIllllIIIIIIlIlIlIIIllIllIIIIIlIIIlIlIlIlIlIIIllllIllIIlIIIIllI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      public final void c() {
         IIIIllllIlIIllIIlIIIlIlIllllIIIIIIlIlIlIIIllIllIIIIIlIIIlIlIlIlIlIIIllllIllIIlIIIIllI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = null;
      }
   }
}
