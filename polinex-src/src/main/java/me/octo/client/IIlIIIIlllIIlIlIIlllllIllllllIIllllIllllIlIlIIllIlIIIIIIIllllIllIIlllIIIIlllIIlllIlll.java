package me.octo.client;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll
   implements IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll,
   llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl {
    public IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll() {
       this(""); // PX-FIX: 委托主构造器（final 字段初始化）
    }
   @NotNull
   private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @Nullable
   private String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @Nullable
   private IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static int[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static String[] b;
   private static String[] c;

   public IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll(@NotNull String var1, @Nullable String var2) {
      short var10001 = 15922;
      short var10002 = -11986;
      Intrinsics.checkNotNullParameter(var1, "name");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
   }

   @NotNull
   public final String ag() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @Nullable
   protected final String ah() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   protected final void e(@Nullable String var1) {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
   }

   public IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll(@NotNull String var1) {
      short var10001 = 15927;
      short var10002 = -13383;
      Intrinsics.checkNotNullParameter(var1, "name");
      this(var1, null);
   }

   @Nullable
   public final IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll ai() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final void a(@Nullable IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var1) {
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
   }

   @Override
   public int a(@NotNull GuiGraphicsExtractor var1, int var2, int var3, int var4) {
      Object var32 = null; // PX-FIX
      Object var30 = null; // PX-FIX
      Object var25 = null; // PX-FIX
      Object var24 = null; // PX-FIX
      int var18 = 0; // PX-FIX
      Object var17 = null; // PX-FIX
      int[] var10000 = ak();
      short var10002 = 15924;
      short var10003 = 29353;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      int[] var5 = var10000;
      if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == null) {
         return var3;
      } else {
         int var6 = -1;
         IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var16 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         Intrinsics.checkNotNull(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var7 = var16.ax();
         int var8 = 0;
         int var9 = var7.length;

         label132: {
            while (true) {
               label129:
               if (var8 < var9) {
                  var17 = var7[var8];
                  if (var5 != null) {
                     break;
                  }

                  if (var17 == this) {
                     var6 = var8;
                     if (var5 == null) {
                        break label129;
                     }
                  }

                  var8++;
                  if (var5 == null) {
                     continue;
                  }
               }

               var18 = var6;
               if (var5 != null) {
                  break label132;
               }

               if (var6 == -1) {
                  return var3;
               }

               var17 = this;
               break;
            }

            var18 = ((this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl instanceof IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI) ? 1 : 0);
         }

         float var19;
         if (var18 != 0) {
            var19 = 1.0F;
         } else {
            llIlllIIIIlllllllIIllIIlIIllIlIIlIlllllIllIIIIIIIIlIIllllllIllIIIllIllIIIIlllllIIlIlI.PXEvMid var20 = llIlllIIIIlllllllIIllIIlIIllIlIIlIlllllIllIIIIIIIIlIIllllllIllIIIllIllIIIIlllllIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var10001 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            Intrinsics.checkNotNull(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
            var19 = var20.a(var10001, var6);
         }

         float var12 = var19;
         float var39;
         int var21 = (var39 = var12 - 0.01F) == 0.0F ? 0 : (var39 < 0.0F ? -1 : 1);
         if (var5 == null) {
            if (var21 <= 0) {
               return var3;
            }

            var21 = ((this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl instanceof IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI) ? 1 : 0);
         }

         float var22;
         if (var21 != 0) {
            var22 = 1.0F;
         } else {
            llIlllIIIIlllllllIIllIIlIIllIlIIlIlllllIllIIIIIIIIlIIllllllIllIIIllIllIIIIlllllIIlIlI.PXEvMid var23 = llIlllIIIIlllllllIIllIIlIIllIlIIlIlllllIllIIIIIIIIlIIllllllIllIIIllIllIIIIlllllIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var34 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            Intrinsics.checkNotNull(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
            var22 = var23.b(var34, var6);
         }

         label112: {
            label111: {
               label138: {
                  label139: {
                     float var13 = var22;
                     me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
                     me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .b(var13);
                     var24 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl instanceof IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI;
                     label108:
                     if (var5 == null) {
                        if (!(me.octo.client.PxTruth.truth(var24))) {
                           var24 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl instanceof lIlllIlIllIlllIIlIIllIlIIlIIIlIIlllllIlIlIlIlIIlIllIIIIlIIlIllllIllllIllIIlIlIIlIlIII;
                           if (var5 != null) {
                              break label108;
                           }

                           if (!(me.octo.client.PxTruth.truth(var24))) {
                              me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll
                                 .a(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, var2 + 14, var3 + 5);
                              if (var5 == null) {
                                 if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII != null) {
                                    String var26 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                                    Intrinsics.checkNotNull(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
                                    int var27 = var26.length();
                                    if (var5 == null) {
                                       var27 = var27 > 0 ? 1 : 0;
                                    }

                                    if (var27 != 0) {
                                       if (var5 != null) {
                                          return var4 + var2;
                                       }

                                       if (var4 > var2) {
                                          me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll var29 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
                                          String var36 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                                          Intrinsics.checkNotNull(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
                                          double var10 = var29.a(
                                             var36,
                                             var2 + 14.0,
                                             var3 + 23.0,
                                             (double)var4,
                                             me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                                                .a(0.2F)
                                          );
                                          me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
                                          return (int)(var10 + 6);
                                       }
                                    }
                                 }

                                 me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
                              }

                              return var3 + 28;
                           }
                        }

                        var25 = this;
                        if (var5 != null) {
                           break label139;
                        }

                        var24 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl instanceof IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI;
                     }

                     if ((me.octo.client.PxTruth.truth(var24))) {
                        if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII != null) {
                           var32 = var4;
                           if (var5 != null) {
                              break label112;
                           }

                           if (var4 > var2) {
                              me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
                                 .a(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, var2 + 35, var3 + 6);
                              me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll var33 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
                              String var38 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                              Intrinsics.checkNotNull(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
                              var32 = var33.a(
                                 var38,
                                 var2 + 35,
                                 var3 + 24,
                                 var4,
                                 me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                                    .a(0.6F)
                              );
                              break label112;
                           }
                        }

                        me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
                           .a(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, var2 + 35, var3 + 9);
                        break label138;
                     }

                     var25 = this;
                  }

                  if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII != null) {
                     var30 = var4;
                     if (var5 != null) {
                        break label111;
                     }

                     if (var4 > var2) {
                        me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
                           .a(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, var2 + 50, var3 + 6);
                        me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll var31 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
                        String var37 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                        Intrinsics.checkNotNull(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
                        var30 = var31.a(
                           var37,
                           var2 + 50,
                           var3 + 24,
                           var4,
                           me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                              .a(0.6F)
                        );
                        break label111;
                     }
                  }

                  me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
                     .a(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, var2 + 50, var3 + 9);
               }

               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
               return var3 + 30;
            }

            int var14 =((Integer)( var30));
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
            return var14 + 8;
         }

         int var15 =((Integer)( var32));
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
         return var15 + 8;
      }
   }

   @Override
   public boolean a(@NotNull String var1) {
      int[] var2;
      boolean var7;
      int[] var10000 = ak();
      Intrinsics.checkNotNullParameter(var1, "s");
      String var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      var2 = var10000;
      Locale var5 = Locale.ROOT;
      short var10002 = 15921;
      short var10003 = -5357;
      Intrinsics.checkNotNullExpressionValue(Locale.ROOT, "ROOT");
      String var6 = var3.toLowerCase(var5);
      var10002 = 15928;
      var10003 = -27709;
      Intrinsics.checkNotNullExpressionValue(var6, "toLowerCase(...)");
      var7 = StringsKt.contains(var6, var1, false);
      label33:
      if (var2 == null) {
         label24:
         if (!var7) {
            label37: {
               Object var8 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               if (var2 == null) {
                  if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII == null) {
                     break label37;
                  }

                  String var9 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                  Intrinsics.checkNotNull(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
                  var3 = var9;
                  Locale var10 = Locale.ROOT;
                  var10002 = 15920;
                  var10003 = -12262;
                  Intrinsics.checkNotNullExpressionValue(Locale.ROOT, "ROOT");
                  String var11 = var3.toLowerCase(var10);
                  var10002 = 15923;
                  var10003 = -31359;
                  Intrinsics.checkNotNullExpressionValue(var11, "toLowerCase(...)");
                  var8 = var11;
               }

               var7 = StringsKt.contains((CharSequence)var8, var1, false);
               if (var2 != null) {
                  break label33;
               }

               if (var7) {
                  break label24;
               }
            }

            var7 = false;
            break label33;
         }

         var7 = true;
      }

      if (var2 != null) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[5]
         );
      }

      return var7;
   }

   @NotNull
   @Override
   public String aa() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   @Override
   public String ab() {
      int[] var1 = ak();
      return var1 == null && this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII != null
         ? this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         : "";
   }

   @NotNull
   @Override
   public String Z() {
      int[] var1 = ak();
      String var10000 = var1 == null && this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl != null
         ? this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.aa()
         : null;
      short var10002 = 15925;
      short var10003 = 5039;
      String var2 = "setting-" + var10000 + "-" + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      Locale var3 = Locale.getDefault();
      var10002 = 15926;
      var10003 = 21416;
      Intrinsics.checkNotNullExpressionValue(var3, "getDefault(...)");
      var10000 = var2.toLowerCase(var3);
      var10002 = 15923;
      var10003 = -31359;
      Intrinsics.checkNotNullExpressionValue(var10000, "toLowerCase(...)");
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         b(new int[5]);
      }

      return var10000;
   }

   public void aj() {
   }

   // PX-FIX bridge: jar carries Kotlin-generated delegation bridges that re-dispatch each inheritied
   // interface member to its default implementation (invokespecial on the interface).
   @Override
   public boolean b() {
      return IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll.super.b();
   }

   @Override
   public boolean c() {
      return IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll.super.c();
   }

   @Override
   public lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll f() {
      return IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll.super.f();
   }

   @Override
   @NotNull
   public IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl h() {
      return IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll.super.h();
   }

   @Override
   @NotNull
   public com.google.gson.JsonElement a() {
      return llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl.super.a();
   }

   @Override
   public void a(@NotNull com.google.gson.JsonElement var1) {
      llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl.super.a(var1);
   }

   public static void b(int[] var0) {
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var0;
   }

   public static int[] ak() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[9];
      int var3 = 0;
      b((int[])null);
      String var2 = "ÆfO\u0083\u0004\u0013mõâ\u0004V¿Äb\u0010ºî!\u008db\u001a¡°¿\u008eb\u0010ç\u0007@ô\u000b\u0018\u000eJ7³\\5\u0004¶ÂÖ\b^gbì+E@_\u000fàv#þ\u000f9O\u0081\u001e_·Ë¹º\u008c";
      int var4 = "ÆfO\u0083\u0004\u0013mõâ\u0004V¿Äb\u0010ºî!\u008db\u001a¡°¿\u008eb\u0010ç\u0007@ô\u000b\u0018\u000eJ7³\\5\u0004¶ÂÖ\b^gbì+E@_\u000fàv#þ\u000f9O\u0081\u001e_·Ë¹º\u008c"
         .length();
      char var1 = 4;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 84;
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
                     case 0 -> 105;
                     case 1 -> 34;
                     case 2 -> 51;
                     case 3 -> 39;
                     case 4 -> 76;
                     case 5 -> 118;
                     default -> 81;
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
                     b = var5;
                     c = new String[9];
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

                  var2 = ",\u001a\u0088Õ\u0010\u008e\u000e¤\u0092ÑúÔ¯\u0012nÔ\u000f2çùë";
                  var4 = ",\u001a\u0088Õ\u0010\u008e\u000e¤\u0092ÑúÔ¯\u0012nÔ\u000f2çùë".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 30;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 15920) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 192;
            case 1 -> 121;
            case 2 -> 194;
            case 3 -> 185;
            case 4 -> 220;
            case 5 -> 101;
            case 6 -> 118;
            case 7 -> 141;
            case 8 -> 190;
            case 9 -> 183;
            case 10 -> 120;
            case 11 -> 27;
            case 12 -> 196;
            case 13 -> 226;
            case 14 -> 97;
            case 15 -> 9;
            case 16 -> 165;
            case 17 -> 86;
            case 18 -> 116;
            case 19 -> 87;
            case 20 -> 138;
            case 21 -> 68;
            case 22 -> 154;
            case 23 -> 202;
            case 24 -> 20;
            case 25 -> 82;
            case 26 -> 55;
            case 27 -> 46;
            case 28 -> 191;
            case 29 -> 8;
            case 30 -> 199;
            case 31 -> 84;
            case 32 -> 178;
            case 33 -> 99;
            case 34 -> 225;
            case 35 -> 246;
            case 36 -> 0;
            case 37 -> 104;
            case 38 -> 7;
            case 39 -> 64;
            case 40 -> 137;
            case 41 -> 88;
            case 42 -> 231;
            case 43 -> 188;
            case 44 -> 109;
            case 45 -> 251;
            case 46 -> 151;
            case 47 -> 187;
            case 48 -> 107;
            case 49 -> 189;
            case 50 -> 177;
            case 51 -> 171;
            case 52 -> 197;
            case 53 -> 83;
            case 54 -> 10;
            case 55 -> 91;
            case 56 -> 38;
            case 57 -> 11;
            case 58 -> 39;
            case 59 -> 26;
            case 60 -> 17;
            case 61 -> 123;
            case 62 -> 157;
            case 63 -> 92;
            case 64 -> 205;
            case 65 -> 95;
            case 66 -> 2;
            case 67 -> 13;
            case 68 -> 70;
            case 69 -> 136;
            case 70 -> 30;
            case 71 -> 254;
            case 72 -> 103;
            case 73 -> 229;
            case 74 -> 125;
            case 75 -> 40;
            case 76 -> 119;
            case 77 -> 216;
            case 78 -> 24;
            case 79 -> 180;
            case 80 -> 35;
            case 81 -> 1;
            case 82 -> 14;
            case 83 -> 5;
            case 84 -> 79;
            case 85 -> 193;
            case 86 -> 230;
            case 87 -> 234;
            case 88 -> 150;
            case 89 -> 243;
            case 90 -> 200;
            case 91 -> 132;
            case 92 -> 6;
            case 93 -> 102;
            case 94 -> 149;
            case 95 -> 249;
            case 96 -> 56;
            case 97 -> 28;
            case 98 -> 235;
            case 99 -> 159;
            case 100 -> 207;
            case 101 -> 94;
            case 102 -> 25;
            case 103 -> 124;
            case 104 -> 139;
            case 105 -> 223;
            case 106 -> 221;
            case 107 -> 41;
            case 108 -> 176;
            case 109 -> 155;
            case 110 -> 179;
            case 111 -> 168;
            case 112 -> 130;
            case 113 -> 16;
            case 114 -> 204;
            case 115 -> 215;
            case 116 -> 145;
            case 117 -> 81;
            case 118 -> 163;
            case 119 -> 182;
            case 120 -> 208;
            case 121 -> 80;
            case 122 -> 48;
            case 123 -> 111;
            case 124 -> 164;
            case 125 -> 173;
            case 126 -> 211;
            case 127 -> 245;
            case 128 -> 106;
            case 129 -> 66;
            case 130 -> 131;
            case 131 -> 90;
            case 132 -> 67;
            case 133 -> 60;
            case 134 -> 96;
            case 135 -> 142;
            case 136 -> 128;
            case 137 -> 181;
            case 138 -> 175;
            case 139 -> 58;
            case 140 -> 77;
            case 141 -> 32;
            case 142 -> 31;
            case 143 -> 186;
            case 144 -> 50;
            case 145 -> 23;
            case 146 -> 42;
            case 147 -> 21;
            case 148 -> 18;
            case 149 -> 44;
            case 150 -> 74;
            case 151 -> 85;
            case 152 -> 78;
            case 153 -> 153;
            case 154 -> 49;
            case 155 -> 52;
            case 156 -> 61;
            case 157 -> 143;
            case 158 -> 160;
            case 159 -> 117;
            case 160 -> 237;
            case 161 -> 105;
            case 162 -> 248;
            case 163 -> 12;
            case 164 -> 203;
            case 165 -> 252;
            case 166 -> 3;
            case 167 -> 134;
            case 168 -> 122;
            case 169 -> 161;
            case 170 -> 227;
            case 171 -> 4;
            case 172 -> 146;
            case 173 -> 76;
            case 174 -> 233;
            case 175 -> 69;
            case 176 -> 241;
            case 177 -> 135;
            case 178 -> 45;
            case 179 -> 239;
            case 180 -> 242;
            case 181 -> 127;
            case 182 -> 126;
            case 183 -> 63;
            case 184 -> 162;
            case 185 -> 170;
            case 186 -> 29;
            case 187 -> 65;
            case 188 -> 244;
            case 189 -> 253;
            case 190 -> 198;
            case 191 -> 166;
            case 192 -> 144;
            case 193 -> 250;
            case 194 -> 53;
            case 195 -> 98;
            case 196 -> 217;
            case 197 -> 152;
            case 198 -> 167;
            case 199 -> 47;
            case 200 -> 209;
            case 201 -> 140;
            case 202 -> 156;
            case 203 -> 15;
            case 204 -> 222;
            case 205 -> 158;
            case 206 -> 108;
            case 207 -> 169;
            case 208 -> 33;
            case 209 -> 59;
            case 210 -> 73;
            case 211 -> 206;
            case 212 -> 224;
            case 213 -> 219;
            case 214 -> 236;
            case 215 -> 174;
            case 216 -> 110;
            case 217 -> 214;
            case 218 -> 57;
            case 219 -> 43;
            case 220 -> 172;
            case 221 -> 238;
            case 222 -> 75;
            case 223 -> 148;
            case 224 -> 212;
            case 225 -> 255;
            case 226 -> 100;
            case 227 -> 22;
            case 228 -> 112;
            case 229 -> 184;
            case 230 -> 201;
            case 231 -> 37;
            case 232 -> 210;
            case 233 -> 240;
            case 234 -> 51;
            case 235 -> 213;
            case 236 -> 115;
            case 237 -> 129;
            case 238 -> 34;
            case 239 -> 195;
            case 240 -> 232;
            case 241 -> 228;
            case 242 -> 71;
            case 243 -> 72;
            case 244 -> 62;
            case 245 -> 147;
            case 246 -> 218;
            case 247 -> 114;
            case 248 -> 36;
            case 249 -> 54;
            case 250 -> 133;
            case 251 -> 113;
            case 252 -> 19;
            case 253 -> 89;
            case 254 -> 93;
            default -> 247;
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }
}
