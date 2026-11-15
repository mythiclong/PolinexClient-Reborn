package me.octo.client;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;

public final class IlIllIIlIIIIllIIlIlIIIIIlIllllIIllIlIlIIllIlllIIlIlIllllIIIIlIllIlIIlllIIllllIIllIlll {
   @NotNull
   public static IlIllIIlIIIIllIIlIlIIIIIlIllllIIllIlIlIIllIlllIIlIlIllllIIIIlIllIlIIlllIIllllIIllIlll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Map<String, float[]> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static List<lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String[] a;
   private static String[] b;

   private IlIllIIlIIIIllIIlIlIIIIIlIllllIIllIlIlIIllIlllIIlIlIllllIIIIlIllIlIIlllIIllllIIllIlll() {
   }

   @NotNull
   public final Map<String, float[]> a() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final List<lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII> b() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final void c() {
      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .a(this);
   }

   @SubscribeEvent
   public final void a(@NotNull IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl var1) {
      boolean var10000 = lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.w();
      short var10002 = 8713;
      short var10003 = -29424;
      Intrinsics.checkNotNullParameter(var1, "event");
      boolean var2 = var10000;
      var10000 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .screen instanceof lllIIIlIllllIIlIlllIlIlIllIIIlIlllllIIIlIIIIlIllIlIlIllIllIIllIIllllIIllIIIllllIlIIlI;
      if (var2) {
         if (var10000) {
            return;
         }

         var10000 = IIllIIIIIlIIIllIIllIIIlIIIIIllIIIIIIlllllIIllIIIlllIllIIlIIlIIlllIIIllIlIlllllIIIIlII.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
            .aA();
      }

      if (var2) {
         if (var10000) {
            return;
         }

         var10000 = IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            .a();
      }

      if (!var10000) {
         if (var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI != null) {
            GuiGraphicsExtractor var3 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            me.octo.client.utils.llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(
                  var3,
                  0,
                  0,
                  var3.guiWidth(),
                  var3.guiHeight(),
                  lllllIllIIlIlIlIllIlIIlllIlIlIllIlIlIlIIIIlllllIllllIIllIllIllIlllIlIIIlIlIlllIIlllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .p(),
                  IlIllIIlIIIIllIIlIlIIIIIlIllllIIllIlIlIIllIlllIIlIlIllllIIIIlIllIlIIlllIIllllIIllIlll::d
               );
            this.a(var3, false);
            me.octo.client.utils.llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(
                  var3,
                  0,
                  0,
                  var3.guiWidth(),
                  var3.guiHeight(),
                  lllllIllIIlIlIlIllIlIIlllIlIlIllIlIlIlIIIIlllllIllllIIllIllIllIlllIlIIIlIlIlllIIlllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .p(),
                  IlIllIIlIIIIllIIlIlIIIIIlIllllIIllIlIlIIllIlllIIlIlIllllIIIIlIllIlIIlllIIllllIIllIlll::e
               );
         }
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll var1) {
      boolean var2 = lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.w();
      me.octo.client.events.impl.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll var10000 = var1;
      if (var2) {
         short var10001 = 8712;
         short var10002 = 23329;
         Intrinsics.checkNotNullParameter(var1, "event");
         if (IIllIIIIIlIIIllIIllIIIlIIIIIllIIIIIIlllllIIllIIIlllIllIIlIIlIIlllIIIllIlIlllllIIIIlII.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
            .aA()) {
            return;
         }

         var10000 = var1;
      }

      GuiGraphicsExtractor var4 = var10000.k();
      if (var4 != null) {
         GuiGraphicsExtractor var3 = var4;
         me.octo.client.utils.llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(
               var3,
               0,
               0,
               var3.guiWidth(),
               var3.guiHeight(),
               lllllIllIIlIlIlIllIlIIlllIlIlIllIlIlIlIIIIlllllIllllIIllIllIllIlllIlIIIlIlIlllIIlllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .p(),
               IlIllIIlIIIIllIIlIlIIIIIlIllllIIllIlIlIIllIlllIIlIlIllllIIIIlIllIlIIlllIIllllIIllIlll::f
            );
      }
   }

   private final void a(boolean var1) {
      boolean var2 = lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.w();
      if (!llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a()) {
         Iterable var3 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         boolean var4 = false;

         for (Object var6 : var3) {
            lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII var7 = (lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII)var6;
            boolean var8 = false;
            if (var2) {
               label28:
               if (var2 && var7.p()) {
                  lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII var9;
                  label39: {
                     label38: {
                        boolean var10000 = var1;
                        if (var2) {
                           if (!var1) {
                              break label38;
                           }

                           var9 = var7;
                           if (!var2) {
                              break label39;
                           }

                           var10000 = var7.s();
                        }

                        if (!var10000) {
                           break label28;
                        }
                     }

                     me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
                     me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .b(var7.k(), var7.l());
                     me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(var7.g(), var7.g());
                     var9 = var7;
                  }

                  var9.n();
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
               }

               if (var2) {
                  continue;
               }
            }
            break;
         }
      }
   }

   private final void a(GuiGraphicsExtractor var1, boolean var2) {
      boolean var3 = lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.x();
      if (!llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a()) {
         Iterable var4 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         boolean var5 = false;

         for (Object var7 : var4) {
            lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII var8 = (lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII)var7;
            boolean var9 = false;
            if (!var3) {
               label28:
               if (!var3 && var8.p()) {
                  lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII var10;
                  label39: {
                     label38: {
                        boolean var10000 = var2;
                        if (!var3) {
                           if (!var2) {
                              break label38;
                           }

                           var10 = var8;
                           if (var3) {
                              break label39;
                           }

                           var10000 = var8.s();
                        }

                        if (!var10000) {
                           break label28;
                        }
                     }

                     var10 = var8;
                  }

                  var10.a(var1);
               }

               if (!var3) {
                  continue;
               }
            }
            break;
         }
      }
   }

   private final void b(boolean var1) {
      boolean var2 = lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.x();
      if (!llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a()) {
         Iterable var3 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         boolean var4 = false;

         for (Object var6 : var3) {
            lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII var7 = (lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII)var6;
            boolean var8 = false;
            if (!var2) {
               label28:
               if (!var2 && var7.p()) {
                  lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII var9;
                  label39: {
                     label38: {
                        boolean var10000 = var1;
                        if (!var2) {
                           if (!var1) {
                              break label38;
                           }

                           var9 = var7;
                           if (var2) {
                              break label39;
                           }

                           var10000 = var7.s();
                        }

                        if (!var10000) {
                           break label28;
                        }
                     }

                     me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
                     me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .b(var7.k(), var7.l());
                     me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(var7.g(), var7.g());
                     var9 = var7;
                  }

                  var9.u();
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
               }

               if (!var2) {
                  continue;
               }
            }
            break;
         }
      }
   }

   private static final Unit d() {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(false);
      me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .d();
      return Unit.INSTANCE;
   }

   private static final Unit e() {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(false);
      return Unit.INSTANCE;
   }

   private static final Unit f() {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(true);
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "sÀLó\u0010\u0005ÓçX\u0017\u0092";
      int var4 = "sÀLó\u0010\u0005ÓçX\u0017\u0092".length();
      char var1 = 5;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 2;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 2;
               var10006 = var6;
            } else {
               var13 = 2;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 2;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 52;
                  case 1 -> 41;
                  case 2 -> 74;
                  case 3 -> 90;
                  case 4 -> 47;
                  case 5 -> 90;
                  default -> 6;
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
            a = var5;
            b = new String[2];
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IlIllIIlIIIIllIIlIlIIIIIlIllllIIllIlIlIIllIlllIIlIlIllllIIIIlIllIlIIlllIIllllIIllIlll();
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new LinkedHashMap<>();
            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new ArrayList<>();
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 8713) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 107;
            case 1 -> 2;
            case 2 -> 100;
            case 3 -> 85;
            case 4 -> 10;
            case 5 -> 198;
            case 6 -> 151;
            case 7 -> 95;
            case 8 -> 255;
            case 9 -> 89;
            case 10 -> 174;
            case 11 -> 118;
            case 12 -> 163;
            case 13 -> 38;
            case 14 -> 189;
            case 15 -> 81;
            case 16 -> 249;
            case 17 -> 254;
            case 18 -> 186;
            case 19 -> 205;
            case 20 -> 180;
            case 21 -> 211;
            case 22 -> 51;
            case 23 -> 77;
            case 24 -> 251;
            case 25 -> 25;
            case 26 -> 195;
            case 27 -> 14;
            case 28 -> 164;
            case 29 -> 235;
            case 30 -> 128;
            case 31 -> 175;
            case 32 -> 131;
            case 33 -> 97;
            case 34 -> 222;
            case 35 -> 246;
            case 36 -> 188;
            case 37 -> 34;
            case 38 -> 78;
            case 39 -> 114;
            case 40 -> 241;
            case 41 -> 167;
            case 42 -> 39;
            case 43 -> 130;
            case 44 -> 230;
            case 45 -> 144;
            case 46 -> 6;
            case 47 -> 173;
            case 48 -> 181;
            case 49 -> 21;
            case 50 -> 32;
            case 51 -> 176;
            case 52 -> 58;
            case 53 -> 112;
            case 54 -> 57;
            case 55 -> 229;
            case 56 -> 250;
            case 57 -> 228;
            case 58 -> 91;
            case 59 -> 33;
            case 60 -> 3;
            case 61 -> 40;
            case 62 -> 24;
            case 63 -> 236;
            case 64 -> 155;
            case 65 -> 82;
            case 66 -> 92;
            case 67 -> 50;
            case 68 -> 111;
            case 69 -> 240;
            case 70 -> 202;
            case 71 -> 115;
            case 72 -> 182;
            case 73 -> 59;
            case 74 -> 194;
            case 75 -> 41;
            case 76 -> 252;
            case 77 -> 99;
            case 78 -> 199;
            case 79 -> 141;
            case 80 -> 224;
            case 81 -> 103;
            case 82 -> 84;
            case 83 -> 73;
            case 84 -> 234;
            case 85 -> 200;
            case 86 -> 156;
            case 87 -> 71;
            case 88 -> 213;
            case 89 -> 210;
            case 90 -> 221;
            case 91 -> 110;
            case 92 -> 242;
            case 93 -> 143;
            case 94 -> 232;
            case 95 -> 52;
            case 96 -> 35;
            case 97 -> 0;
            case 98 -> 47;
            case 99 -> 226;
            case 100 -> 217;
            case 101 -> 138;
            case 102 -> 22;
            case 103 -> 26;
            case 104 -> 147;
            case 105 -> 124;
            case 106 -> 208;
            case 107 -> 193;
            case 108 -> 12;
            case 109 -> 30;
            case 110 -> 191;
            case 111 -> 207;
            case 112 -> 23;
            case 113 -> 44;
            case 114 -> 212;
            case 115 -> 185;
            case 116 -> 1;
            case 117 -> 105;
            case 118 -> 134;
            case 119 -> 209;
            case 120 -> 101;
            case 121 -> 136;
            case 122 -> 83;
            case 123 -> 153;
            case 124 -> 86;
            case 125 -> 17;
            case 126 -> 165;
            case 127 -> 37;
            case 128 -> 74;
            case 129 -> 9;
            case 130 -> 203;
            case 131 -> 201;
            case 132 -> 75;
            case 133 -> 113;
            case 134 -> 121;
            case 135 -> 119;
            case 136 -> 127;
            case 137 -> 133;
            case 138 -> 68;
            case 139 -> 139;
            case 140 -> 142;
            case 141 -> 27;
            case 142 -> 243;
            case 143 -> 11;
            case 144 -> 223;
            case 145 -> 20;
            case 146 -> 192;
            case 147 -> 159;
            case 148 -> 116;
            case 149 -> 233;
            case 150 -> 76;
            case 151 -> 247;
            case 152 -> 179;
            case 153 -> 29;
            case 154 -> 160;
            case 155 -> 15;
            case 156 -> 129;
            case 157 -> 90;
            case 158 -> 94;
            case 159 -> 49;
            case 160 -> 237;
            case 161 -> 54;
            case 162 -> 170;
            case 163 -> 106;
            case 164 -> 244;
            case 165 -> 157;
            case 166 -> 158;
            case 167 -> 214;
            case 168 -> 93;
            case 169 -> 206;
            case 170 -> 53;
            case 171 -> 45;
            case 172 -> 66;
            case 173 -> 190;
            case 174 -> 225;
            case 175 -> 61;
            case 176 -> 123;
            case 177 -> 145;
            case 178 -> 135;
            case 179 -> 245;
            case 180 -> 79;
            case 181 -> 152;
            case 182 -> 197;
            case 183 -> 204;
            case 184 -> 60;
            case 185 -> 122;
            case 186 -> 102;
            case 187 -> 98;
            case 188 -> 253;
            case 189 -> 154;
            case 190 -> 19;
            case 191 -> 218;
            case 192 -> 239;
            case 193 -> 48;
            case 194 -> 177;
            case 195 -> 238;
            case 196 -> 109;
            case 197 -> 80;
            case 198 -> 18;
            case 199 -> 87;
            case 200 -> 126;
            case 201 -> 219;
            case 202 -> 46;
            case 203 -> 67;
            case 204 -> 215;
            case 205 -> 125;
            case 206 -> 104;
            case 207 -> 31;
            case 208 -> 146;
            case 209 -> 216;
            case 210 -> 150;
            case 211 -> 168;
            case 212 -> 70;
            case 213 -> 108;
            case 214 -> 16;
            case 215 -> 196;
            case 216 -> 172;
            case 217 -> 169;
            case 218 -> 187;
            case 219 -> 117;
            case 220 -> 120;
            case 221 -> 88;
            case 222 -> 149;
            case 223 -> 178;
            case 224 -> 183;
            case 225 -> 231;
            case 226 -> 13;
            case 227 -> 140;
            case 228 -> 8;
            case 229 -> 161;
            case 230 -> 7;
            case 231 -> 148;
            case 232 -> 63;
            case 233 -> 166;
            case 234 -> 56;
            case 235 -> 162;
            case 236 -> 43;
            case 237 -> 5;
            case 238 -> 171;
            case 239 -> 137;
            case 240 -> 96;
            case 241 -> 42;
            case 242 -> 227;
            case 243 -> 65;
            case 244 -> 28;
            case 245 -> 36;
            case 246 -> 69;
            case 247 -> 72;
            case 248 -> 62;
            case 249 -> 220;
            case 250 -> 248;
            case 251 -> 4;
            case 252 -> 55;
            case 253 -> 64;
            case 254 -> 184;
            default -> 132;
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
