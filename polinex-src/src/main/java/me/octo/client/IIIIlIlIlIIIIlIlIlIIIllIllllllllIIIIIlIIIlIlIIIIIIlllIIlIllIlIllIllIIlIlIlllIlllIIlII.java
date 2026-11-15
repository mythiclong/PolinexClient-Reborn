package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import me.octo.client.events.impl.IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl;
import me.octo.client.events.impl.lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

public final class IIIIlIlIlIIIIlIlIlIIIllIllllllllIIIIIlIIIlIlIIIIIIlllIIlIllIlIllIllIIlIlIlllIlllIIlII
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static IIIIlIlIlIIIIlIlIlIIIllIllllllllIIIIIlIIIlIlIIIIIIlllIIlIllIlIllIllIIlIlIlllIlllIIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private boolean lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private boolean lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private double IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private double llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private double IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private double IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private boolean IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   @NotNull
   private static IIIIlIlIlIIIIlIlIlIIIllIllllllllIIIIIlIIIlIlIIIIIIlllIIlIllIlIllIllIIlIlIlllIlllIIlII IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private static String[] f;
   private static String[] g;

   private IIIIlIlIlIIIIlIlIlIIIllIllllllllIIIIIlIIIlIlIIIIIIlllIIlIllIlIllIllIIlIlIlllIlllIIlII() {
      short var10001 = 4217;
      short var10002 = -1087;
      var10002 = 4216;
      short var10003 = -24719;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      short var10004 = 4218;
      short var10005 = -18803;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         IIIllIIlIllIlIIIIIIlllIlIlIIIIllIlIllIIIlIlIIlIlIIlIIlllIIIIIlIlIIlIIIIIlIlIIlIIIIllI.a(),
         IIIllIIlIllIlIIIIIIlllIlIlIIIIllIlIllIIIlIlIIlIlIIlIIlllIIIIIlIlIIlIIIIIlIlIIlIIIIllI.b(),
         IIIllIIlIllIlIIIIIIlllIlIlIIIIllIlIllIIIlIlIIlIlIIlIIlllIIIIIlIlIIlIIIIIlIlIIlIIIIllI.c(),
         IIIllIIlIllIlIIIIIIlllIlIlIIIIllIlIllIIIlIlIIlIlIIlIIlllIIIIIlIlIIlIIIIIlIlIIlIIIIllI.d(),
         IIIllIIlIllIlIIIIIIlllIlIlIIIIllIlIllIIIlIlIIlIlIIlIIlllIIIIIlIlIIlIIIIIlIlIIlIIIIllI.e()
      };
      super("Optifine Zoom", "Zooms your view in, usable with a keybind in the Minecraft settings.", var3, "Render", var1);
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 1.0;
   }

   @SubscribeEvent
   public final void a(@NotNull lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI var1) {
      net.minecraft.client.Options var5 = null;
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      Intrinsics.checkNotNullParameter(var1, "e");
      String var2 = var10000;
      boolean var3 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m();
      if (var2 == null) {
         if (!var3) {
            return;
         }

         var3 = this.aA();
      }

      if (var2 == null) {
         if (!var3) {
            return;
         }

         var3 = IIIllIIlIllIlIIIIIIlllIlIlIIIIllIlIllIIIlIlIIlIlIIlIIlllIIIIIlIlIIlIIIIIlIlIIlIIIIllI.f().isDown();
      }

      label53: {
         if (var3) {
            this.ag();
            if (var2 == null) {
               break label53;
            }
         }

         this.ah();
      }

      boolean var4 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      if (var2 == null) {
         if (!this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
            return;
         }

         this.ap().options.smoothCamera = IIIllIIlIllIlIIIIIIlllIlIlIIIIllIlIllIIIlIlIIlIlIIlIIlllIIIIIlIlIIlIIIIIlIlIIlIIIIllI.d().ae();
         var4 = IIIllIIlIllIlIIIIIIlllIlIlIIIIllIlIllIIIlIlIIlIlIIlIIlllIIIIIlIlIIlIIIIIlIlIIlIIIIllI.d().ae();
      }

      if (var2 == null) {
         if (!var4) {
            this.ap()
               .options
               .sensitivity()
               .set(this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl / Math.max(this.ai() * 0.5, 1.0));
         }

         var4 = IIIllIIlIllIlIIIIIIlllIlIlIIIIllIlIllIIIlIlIIlIlIIlIIlllIIIIIlIlIIlIIIIIlIlIIlIIIIllI.e().ae();
      }

      label67: {
         if (var2 == null) {
            if (!var4) {
               return;
            }

            var5 = this.ap().options;
            if (var2 != null) {
               break label67;
            }

            var4 = var5.hideGui;
         }

         if (var4) {
            return;
         }

         this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = false;
         var5 = this.ap().options;
      }

      var5.hideGui = true;
   }

   @SubscribeEvent
   public final void a(@NotNull IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl var1) {
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      Intrinsics.checkNotNullParameter(var1, "e");
      String var2 = var10000;
      boolean var3 = this.aA();
      if (var2 == null) {
         if (!var3) {
            return;
         }

         var3 = IIIllIIlIllIlIIIIIIlllIlIlIIIIllIlIllIIIlIlIIlIlIIlIIlllIIIIIlIlIIlIIIIIlIlIIlIIIIllI.c().ae();
      }

      if (!var3) {
         this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
            ? 1.0
            : 0.0;
      } else {
         double var4;
         label28: {
            IIIIlIlIlIIIIlIlIlIIIllIllllllllIIIIIlIIIlIlIIIIIIlllIIlIllIlIllIllIIlIlIlllIlllIIlII var10001 = this;
            if (var2 == null) {
               if (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
                  var4 = RangesKt.coerceAtMost(
                     this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl + var1.m() * 0.07, 1.0
                  );
                  break label28;
               }

               var10001 = this;
            }

            var4 = RangesKt.coerceAtLeast(var10001.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl - var1.m() * 0.07, 0.0);
         }

         this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var4;
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.lIIlllllIIIlllIIIllIIlllIllllllIIIIIlllllIIlIIIIIIIlllIlIlIIlIlllIIlIIlIIlIIlllIIlllI var1) {
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      Intrinsics.checkNotNullParameter(var1, "e");
      String var2 = var10000;
      int var3 = ((this.aA()) ? 1 : 0);
      if (var2 == null) {
         if (var3 == 0) {
            return;
         }

         var3 = ((this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) ? 1 : 0);
      }

      if (var2 == null) {
         if (var3 == 0) {
            return;
         }

         var3 = IIIllIIlIllIlIIIIIIlllIlIlIIIIllIlIllIIIlIlIIlIlIIlIIlllIIIIIlIlIIlIIIIIlIlIIlIIIIllI.b().M();
      }

      if (var3 > 0) {
         this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
            + var1.k()
               * 0.25
               * (
                  IIIllIIlIllIlIIIIIIlllIlIlIIIIllIlIllIIIlIlIIlIlIIlIIlllIIIIIlIlIIlIIIIIlIlIIlIIIIllI.b().M()
                     * this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
               );
         this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = RangesKt.coerceIn(
            this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI, 1.0, 100.0
         );
         var1.a(true);
      }
   }

   private final void ag() {
      String var1 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      IIIIlIlIlIIIIlIlIlIIIllIllllllllIIIIIlIIIlIlIIIIIIlllIIlIllIlIllIllIIlIlIlllIlllIIlII var10000 = this;
      if (var1 == null) {
         if (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
            return;
         }

         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = this.ap().options.smoothCamera;
         Object var10001 = this.ap().options.sensitivity().get();
         short var10003 = 4219;
         short var10004 = 18034;
         Intrinsics.checkNotNullExpressionValue(var10001, "get(...)");
         this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = ((Number)var10001).doubleValue();
         this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = IIIllIIlIllIlIIIIIIlllIlIlIIIIllIlIllIIIlIlIIlIlIIlIIlllIIIIIlIlIIlIIIIIlIlIIlIIIIllI.a()
            .M();
         this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = this.ap().options.fov().get().intValue();
         this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 0.001;
         var10000 = this;
      }

      var10000.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = true;
   }

   private final void ah() {
      IIIIlIlIlIIIIlIlIlIIIllIllllllllIIIIIlIIIlIlIIIIIIlllIIlIllIlIllIllIIlIlIlllIlllIIlII var2;
      label30: {
         label33: {
            String var1 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
            boolean var10000 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
            if (var1 == null) {
               if (!this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
                  return;
               }

               this.ap().options.smoothCamera = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
               this.ap().options.sensitivity().set(this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
               if (var1 != null) {
                  break label33;
               }

               var10000 = IIIllIIlIllIlIIIIIIlllIlIlIIIIllIlIllIIIlIlIIlIlIIlIIlllIIIIIlIlIIlIIIIIlIlIIlIIIIllI.e().ae();
            }

            if (var10000) {
               var2 = this;
               if (var1 != null) {
                  break label30;
               }

               if (!this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll) {
                  this.ap().options.hideGui = false;
               }
            }

            this.ap().levelRenderer.needsUpdate();
         }

         var2 = this;
      }

      var2.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = false;
   }

   public final double ai() {
      double var4;
      label14: {
         String var1 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
         double var5;
         int var10000 = (var5 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl - 0.5) == 0.0
            ? 0
            : (var5 < 0.0 ? -1 : 1);
         if (var1 == null) {
            if (var10000 < 0) {
               var4 = 4
                  * this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl
                  * this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl
                  * this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
               break label14;
            }

            var10000 = 1;
         }

         var4 = var10000 - Math.pow(-2 * this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl + 2, 3) / 2;
      }

      double var2 = var4;
      return this.a(var2, 1.0, this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI);
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var1) {
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      Intrinsics.checkNotNullParameter(var1, "e");
      String var2 = var10000;
      int var3 = ((this.aA()) ? 1 : 0);
      if (var2 == null) {
         if (var3 == 0) {
            return;
         }

         double var4;
         var3 = (var4 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl - 0.0) == 0.0 ? 0 : (var4 < 0.0 ? -1 : 1);
      }

      if (var2 == null) {
         if (var3 <= 0) {
            return;
         }

         var1.a(var1.k() / (float)this.ai());
         double var5;
         var3 = (var5 = this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl - var1.k()) == 0.0
            ? 0
            : (var5 < 0.0 ? -1 : 1);
      }

      if (var2 == null) {
         var3 = var3 == 0 ? 1 : 0;
      }

      if (var3 == 0) {
         this.ap().levelRenderer.needsUpdate();
      }

      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = var1.k();
   }

   public final boolean aG() {
      String var1 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      boolean var10000 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      if (var1 == null) {
         if (!this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
            return false;
         }

         var10000 = this.aA();
      }

      return var1 != null ? var10000 : var10000;
   }

   private final double a(double var1, double var3, double var5) {
      return var3 + var1 * (var5 - var3);
   }

   @Override
   public void aB() {
      this.as();
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 0.0;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = false;
   }

   @Override
   public void aC() {
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      this.at();
      String var1 = var10000;
      IIIIlIlIlIIIIlIlIlIIIllIllllllllIIIIIlIIIlIlIIIIIIlllIIlIllIlIllIllIIlIlIlllIlllIIlII var2 = this;
      if (var1 == null) {
         if (!this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
            return;
         }

         var2 = this;
      }

      var2.ah();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "A´\u0001àìk\u0085ú\u00997\u0019È\u0096D)z Áµ\u0082\u000e\u00adH¾\u0093Íe¸)T.¡ýí¿\\ç\u000f¼ú\f=zà\u0098§Gª\u0012¢\u0097\u0004¬\u0090ïMÊIÆ\u009fÄ6\u0001ôÇï¸mö\u001f2p7æ÷ï\u009fØÍÃ\b\u008d";
      int var4 = "A´\u0001àìk\u0085ú\u00997\u0019È\u0096D)z Áµ\u0082\u000e\u00adH¾\u0093Íe¸)T.¡ýí¿\\ç\u000f¼ú\f=zà\u0098§Gª\u0012¢\u0097\u0004¬\u0090ïMÊIÆ\u009fÄ6\u0001ôÇï¸mö\u001f2p7æ÷ï\u009fØÍÃ\b\u008d"
         .length();
      char var1 = '\r';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 82;
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
                     case 1 -> 26;
                     case 2 -> 34;
                     case 3 -> 58;
                     case 4 -> 12;
                     case 5 -> 5;
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
                     f = var5;
                     g = new String[4];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IIIIlIlIlIIIIlIlIlIIIllIllllllllIIIIIlIIIlIlIIIIIIlllIIlIllIlIllIllIIlIlIlllIlllIIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = new IIIIlIlIlIIIIlIlIlIIIllIllllllllIIIIIlIIIlIlIIIIIIlllIIlIllIlIllIllIIlIlIlllIlllIIlII();
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

                  var2 = "\u0003ak£æ\"Ê?\u0006>2E\u00851\u007f";
                  var4 = "\u0003ak£æ\"Ê?\u0006>2E\u00851\u007f".length();
                  var1 = '\b';
                  var8 = -1;
            }

            var10000 = 49;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   public static final IIIIlIlIlIIIIlIlIlIIIllIllllllllIIIIIlIIIlIlIIIIIIlllIIlIllIlIllIllIIlIlIlllIlllIIlII aH() {
      return IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 4217) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 207;
            case 1 -> 58;
            case 2 -> 222;
            case 3 -> 244;
            case 4 -> 220;
            case 5 -> 116;
            case 6 -> 17;
            case 7 -> 198;
            case 8 -> 213;
            case 9 -> 57;
            case 10 -> 8;
            case 11 -> 190;
            case 12 -> 98;
            case 13 -> 88;
            case 14 -> 119;
            case 15 -> 42;
            case 16 -> 67;
            case 17 -> 62;
            case 18 -> 250;
            case 19 -> 49;
            case 20 -> 28;
            case 21 -> 201;
            case 22 -> 129;
            case 23 -> 103;
            case 24 -> 73;
            case 25 -> 29;
            case 26 -> 56;
            case 27 -> 230;
            case 28 -> 113;
            case 29 -> 111;
            case 30 -> 65;
            case 31 -> 147;
            case 32 -> 64;
            case 33 -> 143;
            case 34 -> 255;
            case 35 -> 51;
            case 36 -> 11;
            case 37 -> 68;
            case 38 -> 155;
            case 39 -> 137;
            case 40 -> 61;
            case 41 -> 86;
            case 42 -> 0;
            case 43 -> 22;
            case 44 -> 25;
            case 45 -> 166;
            case 46 -> 171;
            case 47 -> 199;
            case 48 -> 234;
            case 49 -> 124;
            case 50 -> 30;
            case 51 -> 139;
            case 52 -> 78;
            case 53 -> 216;
            case 54 -> 7;
            case 55 -> 225;
            case 56 -> 249;
            case 57 -> 37;
            case 58 -> 21;
            case 59 -> 91;
            case 60 -> 23;
            case 61 -> 223;
            case 62 -> 229;
            case 63 -> 251;
            case 64 -> 237;
            case 65 -> 50;
            case 66 -> 102;
            case 67 -> 10;
            case 68 -> 217;
            case 69 -> 54;
            case 70 -> 36;
            case 71 -> 170;
            case 72 -> 31;
            case 73 -> 233;
            case 74 -> 40;
            case 75 -> 72;
            case 76 -> 172;
            case 77 -> 79;
            case 78 -> 186;
            case 79 -> 206;
            case 80 -> 12;
            case 81 -> 76;
            case 82 -> 117;
            case 83 -> 82;
            case 84 -> 52;
            case 85 -> 157;
            case 86 -> 246;
            case 87 -> 89;
            case 88 -> 106;
            case 89 -> 33;
            case 90 -> 243;
            case 91 -> 141;
            case 92 -> 219;
            case 93 -> 55;
            case 94 -> 211;
            case 95 -> 247;
            case 96 -> 96;
            case 97 -> 252;
            case 98 -> 100;
            case 99 -> 97;
            case 100 -> 183;
            case 101 -> 203;
            case 102 -> 53;
            case 103 -> 128;
            case 104 -> 187;
            case 105 -> 254;
            case 106 -> 224;
            case 107 -> 90;
            case 108 -> 236;
            case 109 -> 164;
            case 110 -> 212;
            case 111 -> 162;
            case 112 -> 195;
            case 113 -> 253;
            case 114 -> 202;
            case 115 -> 105;
            case 116 -> 1;
            case 117 -> 66;
            case 118 -> 231;
            case 119 -> 163;
            case 120 -> 15;
            case 121 -> 185;
            case 122 -> 218;
            case 123 -> 152;
            case 124 -> 19;
            case 125 -> 9;
            case 126 -> 149;
            case 127 -> 122;
            case 128 -> 239;
            case 129 -> 241;
            case 130 -> 142;
            case 131 -> 34;
            case 132 -> 204;
            case 133 -> 240;
            case 134 -> 245;
            case 135 -> 81;
            case 136 -> 32;
            case 137 -> 226;
            case 138 -> 83;
            case 139 -> 60;
            case 140 -> 43;
            case 141 -> 232;
            case 142 -> 194;
            case 143 -> 16;
            case 144 -> 193;
            case 145 -> 63;
            case 146 -> 145;
            case 147 -> 210;
            case 148 -> 77;
            case 149 -> 44;
            case 150 -> 227;
            case 151 -> 140;
            case 152 -> 181;
            case 153 -> 136;
            case 154 -> 95;
            case 155 -> 45;
            case 156 -> 135;
            case 157 -> 74;
            case 158 -> 27;
            case 159 -> 121;
            case 160 -> 238;
            case 161 -> 6;
            case 162 -> 200;
            case 163 -> 133;
            case 164 -> 154;
            case 165 -> 69;
            case 166 -> 59;
            case 167 -> 130;
            case 168 -> 35;
            case 169 -> 134;
            case 170 -> 148;
            case 171 -> 48;
            case 172 -> 125;
            case 173 -> 196;
            case 174 -> 109;
            case 175 -> 153;
            case 176 -> 87;
            case 177 -> 158;
            case 178 -> 85;
            case 179 -> 215;
            case 180 -> 2;
            case 181 -> 126;
            case 182 -> 161;
            case 183 -> 209;
            case 184 -> 184;
            case 185 -> 70;
            case 186 -> 144;
            case 187 -> 146;
            case 188 -> 101;
            case 189 -> 46;
            case 190 -> 13;
            case 191 -> 26;
            case 192 -> 182;
            case 193 -> 80;
            case 194 -> 191;
            case 195 -> 84;
            case 196 -> 235;
            case 197 -> 114;
            case 198 -> 165;
            case 199 -> 168;
            case 200 -> 71;
            case 201 -> 132;
            case 202 -> 192;
            case 203 -> 167;
            case 204 -> 94;
            case 205 -> 3;
            case 206 -> 214;
            case 207 -> 41;
            case 208 -> 118;
            case 209 -> 177;
            case 210 -> 156;
            case 211 -> 38;
            case 212 -> 205;
            case 213 -> 228;
            case 214 -> 123;
            case 215 -> 107;
            case 216 -> 131;
            case 217 -> 189;
            case 218 -> 115;
            case 219 -> 104;
            case 220 -> 75;
            case 221 -> 24;
            case 222 -> 197;
            case 223 -> 127;
            case 224 -> 110;
            case 225 -> 93;
            case 226 -> 208;
            case 227 -> 138;
            case 228 -> 39;
            case 229 -> 159;
            case 230 -> 150;
            case 231 -> 14;
            case 232 -> 188;
            case 233 -> 112;
            case 234 -> 47;
            case 235 -> 120;
            case 236 -> 173;
            case 237 -> 175;
            case 238 -> 174;
            case 239 -> 221;
            case 240 -> 160;
            case 241 -> 99;
            case 242 -> 169;
            case 243 -> 151;
            case 244 -> 18;
            case 245 -> 176;
            case 246 -> 242;
            case 247 -> 4;
            case 248 -> 5;
            case 249 -> 20;
            case 250 -> 92;
            case 251 -> 179;
            case 252 -> 180;
            case 253 -> 178;
            case 254 -> 108;
            default -> 248;
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

         g[var2] = new String(var3).intern();
      }

      return g[var2];
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final IIIIlIlIlIIIIlIlIlIIIllIllllllllIIIIIlIIIlIlIIIIIIlllIIlIllIlIllIllIIlIlIlllIlllIIlII a() {
         return IIIIlIlIlIIIIlIlIlIIIllIllllllllIIIIIlIIIlIlIIIIIIlllIIlIllIlIllIllIIlIlIlllIlllIIlII.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
      }
   
   public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker p0) {
      this();
   }
}
}
