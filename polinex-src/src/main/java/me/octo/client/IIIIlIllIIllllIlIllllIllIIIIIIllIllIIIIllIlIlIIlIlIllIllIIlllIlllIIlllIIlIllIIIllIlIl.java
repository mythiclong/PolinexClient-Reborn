package me.octo.client;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.world.scores.DisplaySlot;
import net.minecraft.world.scores.Scoreboard;
import org.jetbrains.annotations.NotNull;

public final class IIIIlIllIIllllIlIllllIllIIIIIIllIllIIIIllIlIlIIlIlIllIllIIlllIlllIIlllIIlIllIIIllIlIl
   extends lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII {
   private static String[] c;
   private static String[] d;

   public IIIIlIllIIllllIlIllllIllIIIIIIllIllIIIIllIlIlIIlIlIllIllIIlllIlllIIlllIIlIllIIIllIlIl() {
      super(0.85F, 0.35F, 1.0F);
   }

   @NotNull
   @Override
   public String m() {
      short var10000 = -17496;
      short var10001 = 31142;
      return "Scoreboard";
   }

   @Override
   public boolean p() {
      return llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .ae();
   }

   @Override
   public void v() {
      llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .af();
   }

   @Override
   public boolean s() {
      return false;
   }

   @Override
   public boolean t() {
      return true;
   }

   @Override
   public void n() {
      boolean var1 = lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.w();
      if (var1) {
         ClientLevel var10000 = this.a().level;
         if (var10000 != null) {
            Scoreboard var6 = var10000.getScoreboard();
            if (var6 != null && var6.getDisplayObjective(DisplaySlot.SIDEBAR) != null) {
               if (var1) {
                  llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] var7 = llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                     .ag();
                  if (var7 != null) {
                     llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] var3 = var7;
                     if (var1) {
                        String var8 = llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                           .ah();
                        if (var8 != null) {
                           String var4 = var8;
                           float var5 = llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                              .ai();
                           int var9 = var3.length;
                           if (var1) {
                              var9 = var9 == 0 ? 1 : 0;
                           }

                           if (var9 != 0) {
                              return;
                           }

                           this.a(var3, var4, var5);
                           return;
                        }
                     }

                     return;
                  }
               }

               return;
            }
         }
      }
   }

   @Override
   public void o() {
      this.n();
   }

   private final void a(
      llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] var1,
      String var2,
      float var3
   ) {
      boolean var4;
      float var6;
      float var8;
      float var9;
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var11;
      float var13;
      label89: {
         float var15;
         List var16;
         label85: {
            int var5 = var1.length;
            var6 = 20.0F;
            float var7 = var5 * var6;
            int var10000 = ((lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.w()) ? 1 : 0);
            var8 = var3 + 40.0F;
            var9 = 40.0F;
            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var10 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .e()
               .a(0.6F);
            var11 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .y()
               .a(0.35F);
            float var12 = 8.0F;
            var13 = 12.0F;
            var4 = (var10000 != 0);
            float var14 = var9 + var7;
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(0.0F, 0.0F, var8, var14, var10, var12);
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               0.0F,
               0.0F,
               var8,
               var14,
               2.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .y()
                  .a(0.6F),
               var12
            );
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var13, var9, var8 - var13 * 2.0F, 1.0F, var11, 0.5F
            );
            var15 = var8 / 2.0F;
            var16 = llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
               .d(var2);
            var10000 = var16.size();
            if (var4) {
               if (var10000 != 1) {
                  break label85;
               }

               var10000 = ((Intrinsics.areEqual(
                  ((llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var16.get(
                        0
                     ))
                     .a(),
                  var2
               )) ? 1 : 0);
            }

            if (var10000 != 0) {
               me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                  .b(
                     var2,
                     (int)var15,
                     (int)(var9 / 2.0F),
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a()
                  );
               if (var4) {
                  break label89;
               }
            }
         }

         float var17 = (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
            llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
               .a(var2),
            false, 2, null);
         float var18 = var15 - var17 / 2.0F;

         for (llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var20 :((llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[])(Object)( var16))) {
            me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
               var20.a(),
               (int)var18,
               (int)(var9 / 2.0F - 7.0F),
               var20.b(),
               false, 16, null);
            var18 += (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
               var20.a(),
               false, 2, null);
            if (!var4) {
               break;
            }
         }
      }

      int var25 = 0;
      int var26 = var1.length;

      while (var25 < var26) {
         llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var27;
         float var28;
         int var36;
         label66: {
            label91: {
               label92: {
                  var27 = var1[var25];
                  var28 = var9 + var25 * var6 + 4.0F;
                  CharSequence var35 = var27.a();
                  short var10001 = -17495;
                  short var10002 = 20999;
                  if (StringsKt.contains(var35, "polinexclient.com", true)) {
                     float var21 = var8 / 2.0F;
                     me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                        var13, var28 - 13.0F, var8 - var13 * 2.0F, 1.0F, var11, 0.5F
                     );
                     me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
                        .b(
                           var27.a(),
                           (int)var21,
                           (int)var28 + 3,
                           IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .a()
                        );
                     if (var4) {
                        break label92;
                     }
                  }

                  List var29 = llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                     .d(var27.a());
                  float var22 = 12.0F;

                  for (llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var24 :((llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[])(Object)( var29))) {
                     me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
                        var24.a(),
                        (int)var22,
                        (int)(var28 + 4.0F),
                        var24.b(),
                        false, 16, null);
                     var22 += (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
                        var24.a(),
                        false, 2, null);
                     if (!var4) {
                        break label91;
                     }

                     if (!var4) {
                        break;
                     }
                  }
               }

               var36 = var27.b().length();
               if (!var4) {
                  break label66;
               }

               if (var36 > 0) {
                  var36 = 1;
                  break label66;
               }
            }

            var36 = 0;
         }

         label46: {
            if (var36 != 0) {
               List var30 = llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                  .d(var27.b());
               float var31 = var8 - var27.c() - 12.0F;

               for (llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var33 :((llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[])(Object)( var30))) {
                  me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
                     var33.a(),
                     (int)var31,
                     (int)(var28 + 4.0F),
                     var33.b(),
                     false, 16, null);
                  var31 += (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
                     var33.a(),
                     false, 2, null);
                  if (!var4) {
                     break label46;
                  }

                  if (!var4) {
                     break;
                  }
               }
            }

            var25++;
         }

         if (!var4) {
            break;
         }
      }
   }

   @Override
   public float q() {
      boolean var10000 = lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.w();
      float var2 = llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .ai();
      boolean var1 = var10000;
      float var3 = var2;
      float var10001 = 0.0F;
      if (var1) {
         if (!(var2 > 0.0F)) {
            return 0.0F;
         }

         var3 = var2;
         var10001 = 40.0F;
      }

      return var3 + var10001;
   }

   @Override
   public float r() {
      int var10000 = ((lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.x()) ? 1 : 0);
      llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] var2 = llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .ag();
      boolean var1 = (var10000 != 0);
      llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] var3 = var2;
      if (!var1) {
         if (var2 == null) {
            return 0.0F;
         }

         var3 = var2;
      }

      var10000 = var3.length;
      if (!var1) {
         var10000 = var10000 == 0 ? 1 : 0;
      }

      return var10000 == 0 ? 40.0F + var2.length * 20.0F : 0.0F;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "\u0097öð\u001b/\u0085À\u0090Éd\u0093\u0018\bp\u0012@0\n½uñýg&´\u0001¬\u0019";
      int var4 = "\u0097öð\u001b/\u0085À\u0090Éd\u0093\u0018\bp\u0012@0\n½uñýg&´\u0001¬\u0019".length();
      char var1 = 17;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 105;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 105;
               var10006 = var6;
            } else {
               var13 = 105;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 105;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 3;
                  case 1 -> 40;
                  case 2 -> 52;
                  case 3 -> 111;
                  case 4 -> 124;
                  case 5 -> 110;
                  default -> 53;
               });
               var6++;
               if (var13 == 0) {
                  var10006 = var13;
                  var10005 = var10002;
                  var16 = var13;
               } else {
                  if (var8 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var16 = var13;
                  var10006 = var6;
               }
            }
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var5[var3++] = var15;
         if ((var0 += var1) >= var4) {
            c = var5;
            d = new String[2];
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ -17495) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 220;
            case 1 -> 78;
            case 2 -> 251;
            case 3 -> 85;
            case 4 -> 1;
            case 5 -> 62;
            case 6 -> 86;
            case 7 -> 73;
            case 8 -> 24;
            case 9 -> 56;
            case 10 -> 156;
            case 11 -> 125;
            case 12 -> 90;
            case 13 -> 47;
            case 14 -> 211;
            case 15 -> 37;
            case 16 -> 49;
            case 17 -> 76;
            case 18 -> 153;
            case 19 -> 119;
            case 20 -> 191;
            case 21 -> 137;
            case 22 -> 113;
            case 23 -> 29;
            case 24 -> 208;
            case 25 -> 157;
            case 26 -> 250;
            case 27 -> 115;
            case 28 -> 210;
            case 29 -> 63;
            case 30 -> 201;
            case 31 -> 202;
            case 32 -> 41;
            case 33 -> 173;
            case 34 -> 44;
            case 35 -> 146;
            case 36 -> 186;
            case 37 -> 129;
            case 38 -> 178;
            case 39 -> 199;
            case 40 -> 219;
            case 41 -> 245;
            case 42 -> 189;
            case 43 -> 235;
            case 44 -> 172;
            case 45 -> 195;
            case 46 -> 8;
            case 47 -> 124;
            case 48 -> 151;
            case 49 -> 163;
            case 50 -> 109;
            case 51 -> 170;
            case 52 -> 145;
            case 53 -> 133;
            case 54 -> 110;
            case 55 -> 45;
            case 56 -> 82;
            case 57 -> 25;
            case 58 -> 66;
            case 59 -> 217;
            case 60 -> 12;
            case 61 -> 190;
            case 62 -> 175;
            case 63 -> 79;
            case 64 -> 100;
            case 65 -> 27;
            case 66 -> 238;
            case 67 -> 194;
            case 68 -> 97;
            case 69 -> 121;
            case 70 -> 192;
            case 71 -> 241;
            case 72 -> 99;
            case 73 -> 48;
            case 74 -> 237;
            case 75 -> 51;
            case 76 -> 254;
            case 77 -> 4;
            case 78 -> 225;
            case 79 -> 11;
            case 80 -> 72;
            case 81 -> 89;
            case 82 -> 68;
            case 83 -> 71;
            case 84 -> 158;
            case 85 -> 3;
            case 86 -> 184;
            case 87 -> 75;
            case 88 -> 132;
            case 89 -> 216;
            case 90 -> 120;
            case 91 -> 38;
            case 92 -> 230;
            case 93 -> 42;
            case 94 -> 223;
            case 95 -> 9;
            case 96 -> 155;
            case 97 -> 249;
            case 98 -> 40;
            case 99 -> 168;
            case 100 -> 95;
            case 101 -> 240;
            case 102 -> 232;
            case 103 -> 116;
            case 104 -> 30;
            case 105 -> 177;
            case 106 -> 118;
            case 107 -> 234;
            case 108 -> 117;
            case 109 -> 26;
            case 110 -> 185;
            case 111 -> 112;
            case 112 -> 43;
            case 113 -> 87;
            case 114 -> 101;
            case 115 -> 243;
            case 116 -> 81;
            case 117 -> 209;
            case 118 -> 111;
            case 119 -> 80;
            case 120 -> 5;
            case 121 -> 148;
            case 122 -> 39;
            case 123 -> 103;
            case 124 -> 215;
            case 125 -> 131;
            case 126 -> 236;
            case 127 -> 102;
            case 128 -> 22;
            case 129 -> 228;
            case 130 -> 16;
            case 131 -> 20;
            case 132 -> 166;
            case 133 -> 182;
            case 134 -> 233;
            case 135 -> 203;
            case 136 -> 77;
            case 137 -> 18;
            case 138 -> 93;
            case 139 -> 239;
            case 140 -> 188;
            case 141 -> 218;
            case 142 -> 65;
            case 143 -> 74;
            case 144 -> 50;
            case 145 -> 52;
            case 146 -> 128;
            case 147 -> 28;
            case 148 -> 176;
            case 149 -> 59;
            case 150 -> 147;
            case 151 -> 179;
            case 152 -> 35;
            case 153 -> 91;
            case 154 -> 0;
            case 155 -> 200;
            case 156 -> 57;
            case 157 -> 152;
            case 158 -> 15;
            case 159 -> 23;
            case 160 -> 6;
            case 161 -> 107;
            case 162 -> 96;
            case 163 -> 248;
            case 164 -> 7;
            case 165 -> 183;
            case 166 -> 58;
            case 167 -> 247;
            case 168 -> 174;
            case 169 -> 149;
            case 170 -> 141;
            case 171 -> 54;
            case 172 -> 61;
            case 173 -> 94;
            case 174 -> 14;
            case 175 -> 127;
            case 176 -> 10;
            case 177 -> 181;
            case 178 -> 21;
            case 179 -> 231;
            case 180 -> 114;
            case 181 -> 252;
            case 182 -> 2;
            case 183 -> 53;
            case 184 -> 55;
            case 185 -> 143;
            case 186 -> 222;
            case 187 -> 169;
            case 188 -> 83;
            case 189 -> 193;
            case 190 -> 13;
            case 191 -> 105;
            case 192 -> 205;
            case 193 -> 123;
            case 194 -> 224;
            case 195 -> 171;
            case 196 -> 64;
            case 197 -> 164;
            case 198 -> 159;
            case 199 -> 162;
            case 200 -> 17;
            case 201 -> 106;
            case 202 -> 67;
            case 203 -> 126;
            case 204 -> 60;
            case 205 -> 226;
            case 206 -> 165;
            case 207 -> 135;
            case 208 -> 140;
            case 209 -> 161;
            case 210 -> 69;
            case 211 -> 32;
            case 212 -> 31;
            case 213 -> 212;
            case 214 -> 242;
            case 215 -> 34;
            case 216 -> 244;
            case 217 -> 160;
            case 218 -> 136;
            case 219 -> 207;
            case 220 -> 229;
            case 221 -> 154;
            case 222 -> 19;
            case 223 -> 213;
            case 224 -> 150;
            case 225 -> 84;
            case 226 -> 138;
            case 227 -> 206;
            case 228 -> 130;
            case 229 -> 108;
            case 230 -> 187;
            case 231 -> 46;
            case 232 -> 196;
            case 233 -> 33;
            case 234 -> 139;
            case 235 -> 246;
            case 236 -> 180;
            case 237 -> 104;
            case 238 -> 134;
            case 239 -> 227;
            case 240 -> 88;
            case 241 -> 204;
            case 242 -> 36;
            case 243 -> 221;
            case 244 -> 253;
            case 245 -> 167;
            case 246 -> 70;
            case 247 -> 92;
            case 248 -> 142;
            case 249 -> 144;
            case 250 -> 197;
            case 251 -> 98;
            case 252 -> 255;
            case 253 -> 122;
            case 254 -> 214;
            default -> 198;
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
}
