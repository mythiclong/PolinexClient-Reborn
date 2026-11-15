package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.AABB;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIlIlIIllIIIIlIllIIIlllIIIllIIIIlIIIlIlIIlllllIlIIIIllIllIIlllIIIllllIlllIlllllllIlIl
   extends IIIllIIIlIIlIIlllllIlIlIllllIIllIlIlIIllIlIlIIIIlIllIlIlIIlIIIIIlIlIIIlIIlIlIIIIIIIlI {

   @NotNull
   public static IIlIlIIllIIIIlIllIIIlllIIIllIIIIlIIIlIlIIlllllIlIIIIllIllIIlllIIIllllIlllIlllllllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII;
   @NotNull
   private IIIIIIlIlIIIlllIllIIIlllIllllllIIIIlllllIlIlIIIIllIIlIIIIIllIllIIllIIlIllIIIllIlIlIlI llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
   private int lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   private boolean lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
   @NotNull
   private String llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
   private boolean lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
   @NotNull
   private static IIlIlIIllIIIIlIllIIIlllIIIllIIIIlIIIlIlIIlllllIlIIIIllIllIIlllIIIllllIlllIlllllllIlIl lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
   private static String[] j;
   private static String[] k;

   public IIlIlIIllIIIIlIllIIIlllIIIllIIIIlIIIlIlIIlllllIlIIIIllIllIIlllIIIllllIlllIlllllllIlIl() {
      short var10001 = 6383;
      short var10002 = 254;
      var10002 = 6393;
      short var10003 = 1108;
      me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      short var10004 = 6377;
      short var10005 = 20704;
      List var4 = CollectionsKt.emptyList();
      List var10006 = CollectionsKt.emptyList();
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         IlIllIIIIlllllIllllllIIlIlllIIIIlIlllllIllIIlIlIIlIIIIlIIIlllIlllIIlllIlIlIlllIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         IlIllIIIIlllllIllllllIIlIlllIIIIlIlllllIllIIlIlIIlIIIIlIIIlllIlllIIlllIlIlIlllIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         IlIllIIIIlllllIllllllIIlIlllIIIIlIlllllIllIIlIlIIlIIIIlIIIlllIlllIIlllIlIlIlllIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c(),
         IIIllIIIlIIlIIlllllIlIlIllllIIllIlIlIIllIlIlIIIIlIllIlIlIIlIIIIIlIlIIIlIIlIlIIIIIIIlI.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
            .a(),
         IIIllIIIlIIlIIlllllIlIlIllllIIllIlIlIIllIlIlIIIIlIllIlIlIIlIIIIIlIlIIIlIIlIlIIIIIIIlI.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
            .b(),
         IIIllIIIlIIlIIlllllIlIlIllllIIllIlIlIIllIlIlIIIIlIllIlIlIIlIIIIIlIlIIIlIIlIlIIIIIIIlI.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
            .c()
      };
      super("Slayer Macro", "Automatically starts and completes Slayer Quests.", var3, "Slayer", var4, var10006, false, var1);
      this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl = IIIllIIIlIIIllIIIIlllIllIIlllIllIIlllllIIIllIllIIIIIIllIlllllIlIlIIlIlIlllllIIllIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = "";
   }

   @Nullable
   public final me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a_() {
      return this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   }

   public final void d(
      @Nullable me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = var1;
   }

   public final boolean ba() {
      return this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
   }

   public final void e(boolean var1) {
      this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = var1;
   }

   @NotNull
   public final String bb() {
      return this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
   }

   public final void e(@NotNull String var1) {
      short var10001 = 6389;
      short var10002 = 16341;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = var1;
   }

   public final boolean bc() {
      return this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
   }

   public final void f(boolean var1) {
      this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = var1;
   }

   @Override
   public void aC() {
      Object var11 = null; // PX-FIX
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      int var1;
      label96: {
         IIlIlIIllIIIIlIllIIIlllIIIllIIIIlIIIlIlIIlllllIlIIIIllIllIIlllIIIllllIlllIlllllllIlIl var7;
         label97: {
            var1 = IIlIlIIllIIIIlIllIIIlllIIIllIIIIlIIIlIlIIlllllIlIIIIllIllIIlllIIIllllIlllIlllllllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
            int var10000 = ((int[])IIlIlIIllIIIIlIllIIIlllIIIllIIIIlIIIlIlIIlllllIlIIIIllIllIIlllIIIllllIlllIlllllllIlIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII)[this.W()
               .ordinal()];
            if (var1 != 0) {
               switch (var10000) {
                  case 1:
                     var7 = this;
                     if (var1 == 0) {
                        break label97;
                     }

                     var10000 = ((this.aK()) ? 1 : 0);
                     break;
                  case 2:
                     break label96;
                  case 3:
                  default:
                     return;
               }
            }

            if (var10000 == 0) {
               return;
            }

            var7 = this;
         }

         if (var1 != 0) {
            if (var7.aJ().a() != this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.f()) {
               return;
            }

            var7 = this;
         }

         var7.bd();
         if (var1 != 0) {
            return;
         }
      }

      llIlIlIIlIIlIlIllIIIIIIIIlIIIIlIIlIIllllllIIIllIIllllIlIlllIIIIllIIIIlllllIlIIllllIIl var8 = ((llIlIlIIlIIlIlIllIIIIIIIIlIIIIlIIlIIllllllIIIllIIllllIlIlllIIIIllIIIIlllllIlIIllllIIl)(Object)(this));
      if (var1 != 0) {
         if (this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl == this.ac().size()) {
            this.be();
            return;
         }

         var8 = ((llIlIlIIlIIlIlIllIIIIIIIIlIIIIlIIlIIllllllIIIllIIllllIlIlllIIIIllIIIIlllllIlIIllllIIl)(Object)(this.ac().get(this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl)));
         short var10002 = 6395;
         short var10003 = -31796;
         Intrinsics.checkNotNullExpressionValue(var8, "get(...)");
      }

      IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var2 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)(Object)var8;
      switch (((int[])IIlIlIIllIIIIlIllIIIlllIIIllIIIIlIIIlIlIIlllllIlIIIIllIllIIlllIIIllllIlllIlllllllIlIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)[var2.b()
         .ordinal()]) {
         case 1:
            Integer var13;
            BlockPos var10001;
            label70: {
               var8 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                  .f();
               var10001 = var2.a();
               if (var1 != 0) {
                  me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var12 = this.X();
                  if (var12 != null) {
                     var13 = var12.b();
                     break label70;
                  }
               }

               var13 = null;
            }

            int var10 = ((var8.a(var10001, var13)) ? 1 : 0);
            if (var1 != 0) {
               if (var10 == 0) {
                  break;
               }

               var10 = this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
            }

            int var3 = var10;
            this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = var3 + 1;
            if (var1 != 0) {
               break;
            }
         case 2:
            double var6 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(var2.a(), false);
            var11 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
               .e()
               .d();
            label58:
            if (var1 != 0) {
               if (!(me.octo.client.PxTruth.truth(var11))) {
                  double var14;
                  var11 = (var14 = var6 - 1.5) == 0.0 ? 0 : (var14 < 0.0 ? -1 : 1);
                  if (var1 == 0) {
                     break label58;
                  }

                  if ((me.octo.client.PxTruth.truth(var11))) {
                     int var5 = this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl++;
                     if (var1 != 0) {
                        return;
                     }
                  }
               }

               var11 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                  .e()
                  .d();
            }

            if (var1 != 0 && !(me.octo.client.PxTruth.truth(var11))) {
               IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                  ((BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                     .e())),
                  ((IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll)(Object)(var2.a())),
                  0,
                  false);
            }
      }
   }

   private final void bd() {
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
      );
      this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = 0;
      this.a(
         (ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll>)CollectionsKt.toCollection(
            this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.i(), new ArrayList()
         )
      );
   }

   private final void be() {
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
      );
   }

   public final void bf() {
      Object var9 = null; // PX-FIX
      int var1;
      int var10;
      label52: {
         var var2 = this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.c();
         var10 = IIlIlIIllIIIIlIllIIIlllIIIllIIIIlIIIlIlIIlllllIlIIIIllIllIIlllIIIllllIlllIlllllllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
         boolean var3 = false;
         var1 = var10;
         var9 = var2;
         label48:
         if (var1 != 0) {
            if (var2 instanceof Collection) {
               var9 = (Collection)var2;
               if (var1 == 0) {
                  break label48;
               }

               if (((me.octo.client.PXDyn)var9).isEmpty()) {
                  var10 = 0;
                  break label52;
               }
            }

            var9 = var2;
         }

         Iterator var4 = ((me.octo.client.PXDyn)var9).iterator();

         label39:
         while (true) {
            if (!var4.hasNext()) {
               var10 = 0;
               break;
            }

            Object var5 = var4.next();
            AABB var6 = (AABB)var5;
            boolean var7 = false;
            var10 = ((var6.contains(me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w())) ? 1 : 0);

            while ((var10 != 0)) {
               var10 = 1;
               if (var1 != 0) {
                  break label39;
               }
            }
         }
      }

      label28: {
         if ((var10 != 0)) {
            this.be();
            if (var1 != 0) {
               break label28;
            }
         }

         this.a(this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.f(), 2000);
      }

      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         IIlIlIIllIIIIlIllIIIlllIIIllIIIIlIIIlIlIIlllllIlIIIIllIllIIlllIIIllllIlllIlllllllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b(
            ++var1
         );
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.lIlIIIllllllIlIIlllIllIIIlIllllIIllllIIllllIIIIIlIIlIIIlIlIlIIIIllIIIIIllIIlIIllIllII var1) {
      int var10000 = IIlIlIIllIIIIlIllIIIlllIIIllIIIIlIIIlIlIIlllllIlIIIIllIllIIlllIIIllllIlllIlllllllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c();
      Intrinsics.checkNotNullParameter(var1, "e");
      int var2 = var10000;
      if (var2 == 0) {
         ArrayList var11 = me.octo.client.utils.IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .d();
         if (var11 != null) {
            ArrayList var3 = var11;
            Iterable var4 = var3;
            boolean var5 = false;

            for (Object var7 : var4) {
               String var8 = (String)var7;
               boolean var9 = false;
               if (var2 == 0) {
                  if (var2 == 0) {
                     CharSequence var12 = var8;
                     short var10001 = 6381;
                     short var10002 = -17910;
                     if (StringsKt.contains(var12, "Slayer Quest", false)) {
                        this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = true;
                        int var10 = var3.indexOf(var8) + 1;
                        if (var2 == 0) {
                           if (var10 == 0) {
                              me.octo.client.utils.IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .f();
                              return;
                           }

                           me.octo.client.utils.IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .a((String)var3.get(var10));
                        }

                        Object var13 = var3.get(var10 + 1);
                        short var10003 = 6396;
                        short var10004 = 17732;
                        Intrinsics.checkNotNullExpressionValue(var13, "get(...)");
                        CharSequence var14 = (CharSequence)var13;
                        var10002 = 6390;
                        var10003 = -10079;
                        this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = StringsKt.contains(
                           var14, "Boss slain!", false);
                     }
                  }

                  if (var2 == 0) {
                     continue;
                  }
               }
               break;
            }

            return;
         }
      }
   }

   @NotNull
   public final String bg() {
      int var1 = IIlIlIIllIIIIlIllIIIlllIIIllIIIIlIIIlIlIIlllllIlIIIIllIllIIlllIIIllllIlllIlllllllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      if (!this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII) {
         return "";
      } else {
         String var5;
         label96: {
            label100: {
               var5 = me.octo.client.utils.IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c();
               if (var1 != 0) {
                  if (var5 == null) {
                     break label100;
                  }

                  var5 = var5;
               }

               String[] var3 = new String[]{" "};
               Object var4 = StringsKt.split(var5, var3, false, 0);
               if (var1 != 0) {
                  if (var4 == null) {
                     break label100;
                  }

                  var4 = ((me.octo.client.PXDyn)var4).get(0);
               }

               var5 = (String)var4;
               if (var1 != 0) {
                  break label96;
               }
            }

            var5 = null;
         }

         String var2 = var5;
         var5 = var2;
         if (var1 != 0) {
            if (var2 == null) {
               return "";
            }

            var5 = var2;
         }

         int var7 = var5.hashCode();
         if (var1 != 0) {
            switch (var7) {
               case -1751803001:
                  if (var1 == 0) {
                     return var2;
                  }

                  short var24 = 6398;
                  short var30 = -29883;
                  var7 = ((var2.equals("Riftstalker")) ? 1 : 0);
                  break;
               case -685180305:
                  if (var1 == 0) {
                     return var2;
                  }

                  short var22 = 6397;
                  short var29 = 12643;
                  if (var2.equals("Inferno")) {
                     short var13 = 6392;
                     var22 = 10627;
                     return "Blaze";
                  }

                  return "";
               case -199992837:
                  if (var1 == 0) {
                     return var2;
                  }

                  short var20 = 6399;
                  short var28 = -3590;
                  if (var2.equals("Revenant")) {
                     short var12 = 6384;
                     var20 = -336;
                     return "Zombie";
                  }

                  return "";
               case 2589292:
                  if (var1 == 0) {
                     return var2;
                  }

                  short var18 = 6380;
                  short var27 = -19600;
                  if (var2.equals("Sven")) {
                     short var11 = 6394;
                     var18 = 7815;
                     return "Wolf";
                  }

                  return "";
               case 1016129108:
                  if (var1 == 0) {
                     return var2;
                  }

                  short var16 = 6379;
                  short var26 = 26868;
                  if (var2.equals("Voidgloom")) {
                     short var10 = 6386;
                     var16 = -6931;
                     return "Enderman";
                  }

                  return "";
               case 1024949544:
                  if (var1 == 0) {
                     return var2;
                  }

                  short var10001 = 6391;
                  short var10002 = 12282;
                  if (var2.equals("Tarantula")) {
                     short var9 = 6388;
                     var10001 = 26260;
                     return "Spider";
                  }

                  return "";
               default:
                  return "";
            }
         }

         if (var7 != 0) {
            short var14 = 6378;
            short var25 = 27582;
            return "Vampire";
         } else {
            return "";
         }
      }
   }

   @Override
   public void M() {
      int var1;
      IIIIIIlIlIIIlllIllIIIlllIllllllIIIIlllllIlIlIIIIllIIlIIIIIllIllIIllIIlIllIIIllIlIlIlI var9;
      label108: {
         label107: {
            int var10000 = IIlIlIIllIIIIlIllIIIlllIIIllIIIIlIIIlIlIIlllllIlIIIIllIllIIlllIIIllllIlllIlllllllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
            this.aM();
            var1 = var10000;
            String var2 = IlIllIIIIlllllIllllllIIlIlllIIIIlIlllllIllIIlIlIIlIIIIlIIIlllIlllIIlllIlIlIlllIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
               .y();
            int var10001 = var2.hashCode();
            if (var1 != 0) {
               switch (var10001) {
                  case -1612488122:
                     short var12 = 6376;
                     short var16 = -594;
                     var10001 = ((var2.equals("Zombie")) ? 1 : 0);
                     break;
                  case 2701938:
                     short var11 = 6372;
                     short var15 = -22781;
                     if (var2.equals("Wolf")) {
                        var9 = IIIllIIIlIIIllIIIIlllIllIIlllIllIIlllllIIIllIllIIIIIIllIlllllIlIlIIlIlIlllllIIllIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .b();
                        break label108;
                     }
                     break label107;
                  case 1795680690:
                     short var10002 = 6387;
                     short var10003 = 1896;
                     if (var2.equals("Enderman")) {
                        var9 = IIIllIIIlIIIllIIIIlllIllIIlllIllIIlllllIIIllIllIIIIIIllIlllllIlIlIIlIlIlllllIIllIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .c();
                        break label108;
                     }
                  default:
                     break label107;
               }
            }

            if (var10001 != 0) {
               var9 = IIIllIIIlIIIllIIIIlllIllIIlllIllIIlllllIIIllIllIIIIIIllIlllllIlIlIIlIlIlllllIIllIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a();
               break label108;
            }
         }

         var9 = IIIllIIIlIIIllIIIIlllIllIIlllIllIIlllllIIIllIllIIIIIIllIlllllIlIlIIlIlIlllllIIllIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a();
      }

      label118: {
         boolean var3;
         boolean var4;
         boolean var5;
         boolean var8;
         this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl = var9;
         short var13 = 6382;
         short var17 = 25301;
         this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a("Maddox Batphone");
         boolean var7 = this.a5() != null;
         var3 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g()
            == this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.g();
         var4 = this.X() != null;
         var5 = this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI != null;
         var8 = var7;
         label94:
         if (var1 != 0) {
            if (var7) {
               var8 = var3;
               if (var1 == 0) {
                  break label94;
               }

               if (var3) {
                  var8 = var4;
                  if (var1 == 0) {
                     break label94;
                  }

                  if (var4) {
                     if (var1 == 0) {
                        break label118;
                     }

                     if (var5) {
                        super.M();
                        me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                           .a(
                              me.octo.client.events.impl.lIlIIIllllllIlIIlllIllIIIlIllllIIllllIIllllIIIIIlIIlIIIlIlIlIIIIllIIIIIllIIlIIllIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           );
                        break label118;
                     }
                  }
               }
            }

            var8 = var7;
         }

         if (var1 != 0) {
            if (!var8) {
               this.a6();
            }

            var8 = var4;
         }

         if (var1 != 0) {
            if (!var8) {
               this.aP();
            }

            var8 = var3;
         }

         if (var1 != 0) {
            if (!var8) {
               this.b(CollectionsKt.listOf(this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.g()));
            }

            var8 = var5;
         }

         if (!var8) {
            short var10 = 6385;
            var13 = 18931;
            this.a(
               "Missing: Maddox Batphone",
               me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            );
         }

         this.N();
         return;
      }

      llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI[] var6 = new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI[]{
         new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
            llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
            IIlIlIIllIIIIlIllIIIlllIIIllIIIIlIIIlIlIIlllllIlIIIIllIllIIlllIIIllllIlllIlllllllIlIl::bh,
            true
         ),
         new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
            llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            null,
            true
         ),
         new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
            llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
            IIlIlIIllIIIIlIllIIIlllIIIllIIIIlIIIlIlIIlllllIlIIIIllIllIIlllIIIllllIlllIlllllllIlIl::bi,
            false
         ),
         new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
            llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            IIlIlIIllIIIIlIllIIIlllIIIllIIIIlIIIlIlIIlllllIlIIIIllIllIIlllIIIllllIlllIlllllllIlIl::bj,
            false
         )
      };
      this.a(CollectionsKt.listOf(var6));
      this.bf();
      if (var1 == 0) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[2]
         );
      }
   }

   @Override
   public void N() {
      this.aN();
      super.N();
   }

   @Override
   public void aH() {
      this.bf();
   }

   private static final boolean bh() {
      return IIIlIlIlIlIlIIlllIIIIIIlIIIIlIlIlIlIIlIIIlllIlllIIllIlllllIlllllIIlIlIIIIllIIlllIlllI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .a();
   }

   private static final boolean a(IIlIlIIllIIIIlIllIIIlllIIIllIIIIlIIIlIlIIlllllIlIIIIllIllIIlllIIIllllIlllIlllllllIlIl var0) {
      int var1 = IIlIlIIllIIIIlIllIIIlllIIIllIIIIlIIIlIlIIlllllIlIIIIllIllIIlllIIIllllIlllIlllllllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      boolean var10000 = var0.af();
      if (var1 != 0) {
         if (!var10000) {
            return false;
         }

         var10000 = lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            .b();
      }

      return var1 == 0 ? var10000 : var10000;
   }

   private static final boolean bi() {
      return IlllIIIIlIlllIlllllIlIlIIllIlllIlIIllllllIlllllIllIllllIllIIIllIIlIlIlllIIlIllIIlIlll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .a();
   }

   private static final boolean bj() {
      return IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .e();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[25];
      int var3 = 0;
      String var2 = ">V¯Çx\u00123\f\u0007úDÎ¢X\u001a¡\u000b|vf\u0012L%\f¾*ÄÝ\bß´\u0002ÖÏ\u009bÍÆ\u0005$Ëx\u000e~1\f#\u000b<¯\u008d¸\u0019\u0003\u0091ïJ\u008cq8óì\u001aýå\u009cLT7å4\u001e\u001d½\u0082;)\u0092EBj\u008d\u0082Å!u4OZ`\u000fèf0\u0004¹Cq`\byÙG6e,\u0090Ë\u0006\u008eô\u0016hº~\u0007É\u0007pe³\u00809\u000bTKdtè\t¬Ñ\u0090\u008e\u009b\t<\u00ad¼u\u009c~¼Õ \u0006\u009a\u0012¸Nçk\u0018\\\u00ad\u008bn\\WQÿ\fX(ÒÅ$¤«6ÜáOWtlþ\b\u0084û\u008eU\u0012çæÞ\b®MË\u0083º=ó\u0085\u0004LEB\u0092\f\u009d¹|Cþ¥ÏU%#à\u0080\u000fÃ\u0017o'3\u009d=\no¨<Þ\u007f)\u0084\f\u009eÈ\u001cmò`Nñ\u0001.óü\u0006\u001f\u008e\bÝñ\u0019\u0006x\\Àÿi2\u0007ÝtÝ_K\u000e±";
      int var4 = ">V¯Çx\u00123\f\u0007úDÎ¢X\u001a¡\u000b|vf\u0012L%\f¾*ÄÝ\bß´\u0002ÖÏ\u009bÍÆ\u0005$Ëx\u000e~1\f#\u000b<¯\u008d¸\u0019\u0003\u0091ïJ\u008cq8óì\u001aýå\u009cLT7å4\u001e\u001d½\u0082;)\u0092EBj\u008d\u0082Å!u4OZ`\u000fèf0\u0004¹Cq`\byÙG6e,\u0090Ë\u0006\u008eô\u0016hº~\u0007É\u0007pe³\u00809\u000bTKdtè\t¬Ñ\u0090\u008e\u009b\t<\u00ad¼u\u009c~¼Õ \u0006\u009a\u0012¸Nçk\u0018\\\u00ad\u008bn\\WQÿ\fX(ÒÅ$¤«6ÜáOWtlþ\b\u0084û\u008eU\u0012çæÞ\b®MË\u0083º=ó\u0085\u0004LEB\u0092\f\u009d¹|Cþ¥ÏU%#à\u0080\u000fÃ\u0017o'3\u009d=\no¨<Þ\u007f)\u0084\f\u009eÈ\u001cmò`Nñ\u0001.óü\u0006\u001f\u008e\bÝñ\u0019\u0006x\\Àÿi2\u0007ÝtÝ_K\u000e±"
         .length();
      char var1 = '\b';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 127;
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
                     case 0 -> 90;
                     case 1 -> 49;
                     case 2 -> 76;
                     case 3 -> 90;
                     case 4 -> 64;
                     case 5 -> 50;
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
                     j = var5;
                     k = new String[25];
                     IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = new IIlIlIIllIIIIlIllIIIlllIIIllIIIIlIIIlIlIIlllllIlIIIIllIllIIlllIIIllllIlllIlllllllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII = new IIlIlIIllIIIIlIllIIIlllIIIllIIIIlIIIlIlIIlllllIlIIIIllIllIIlllIIIllllIlllIlllllllIlIl();
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

                  var2 = ",ê\u0003³þÿ&\u0019B\u0004ú\u0005ýL";
                  var4 = ",ê\u0003³þÿ&\u0019B\u0004ú\u0005ýL".length();
                  var1 = '\t';
                  var8 = -1;
            }

            var10000 = 50;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String e(int var0, int var1) {
      int var2 = (var0 ^ 6396) & 65535;
      if (k[var2] == null) {
         char[] var3 = j[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 1;
            case 1 -> 64;
            case 2 -> 247;
            case 3 -> 71;
            case 4 -> 196;
            case 5 -> 85;
            case 6 -> 33;
            case 7 -> 69;
            case 8 -> 76;
            case 9 -> 152;
            case 10 -> 197;
            case 11 -> 25;
            case 12 -> 75;
            case 13 -> 46;
            case 14 -> 21;
            case 15 -> 35;
            case 16 -> 151;
            case 17 -> 23;
            case 18 -> 172;
            case 19 -> 206;
            case 20 -> 68;
            case 21 -> 192;
            case 22 -> 244;
            case 23 -> 208;
            case 24 -> 225;
            case 25 -> 173;
            case 26 -> 186;
            case 27 -> 200;
            case 28 -> 249;
            case 29 -> 125;
            case 30 -> 38;
            case 31 -> 174;
            case 32 -> 102;
            case 33 -> 81;
            case 34 -> 0;
            case 35 -> 142;
            case 36 -> 159;
            case 37 -> 6;
            case 38 -> 132;
            case 39 -> 149;
            case 40 -> 253;
            case 41 -> 236;
            case 42 -> 242;
            case 43 -> 40;
            case 44 -> 179;
            case 45 -> 228;
            case 46 -> 148;
            case 47 -> 89;
            case 48 -> 49;
            case 49 -> 130;
            case 50 -> 59;
            case 51 -> 44;
            case 52 -> 18;
            case 53 -> 168;
            case 54 -> 169;
            case 55 -> 87;
            case 56 -> 252;
            case 57 -> 19;
            case 58 -> 78;
            case 59 -> 34;
            case 60 -> 55;
            case 61 -> 246;
            case 62 -> 238;
            case 63 -> 164;
            case 64 -> 29;
            case 65 -> 104;
            case 66 -> 177;
            case 67 -> 88;
            case 68 -> 226;
            case 69 -> 20;
            case 70 -> 90;
            case 71 -> 209;
            case 72 -> 14;
            case 73 -> 207;
            case 74 -> 198;
            case 75 -> 193;
            case 76 -> 52;
            case 77 -> 215;
            case 78 -> 83;
            case 79 -> 147;
            case 80 -> 11;
            case 81 -> 171;
            case 82 -> 91;
            case 83 -> 175;
            case 84 -> 220;
            case 85 -> 184;
            case 86 -> 189;
            case 87 -> 26;
            case 88 -> 93;
            case 89 -> 58;
            case 90 -> 117;
            case 91 -> 15;
            case 92 -> 145;
            case 93 -> 210;
            case 94 -> 255;
            case 95 -> 106;
            case 96 -> 127;
            case 97 -> 113;
            case 98 -> 170;
            case 99 -> 120;
            case 100 -> 39;
            case 101 -> 150;
            case 102 -> 176;
            case 103 -> 107;
            case 104 -> 45;
            case 105 -> 54;
            case 106 -> 141;
            case 107 -> 28;
            case 108 -> 227;
            case 109 -> 139;
            case 110 -> 202;
            case 111 -> 138;
            case 112 -> 100;
            case 113 -> 110;
            case 114 -> 126;
            case 115 -> 95;
            case 116 -> 43;
            case 117 -> 98;
            case 118 -> 181;
            case 119 -> 232;
            case 120 -> 12;
            case 121 -> 191;
            case 122 -> 218;
            case 123 -> 124;
            case 124 -> 79;
            case 125 -> 73;
            case 126 -> 222;
            case 127 -> 105;
            case 128 -> 123;
            case 129 -> 221;
            case 130 -> 111;
            case 131 -> 251;
            case 132 -> 133;
            case 133 -> 135;
            case 134 -> 119;
            case 135 -> 47;
            case 136 -> 224;
            case 137 -> 67;
            case 138 -> 56;
            case 139 -> 154;
            case 140 -> 129;
            case 141 -> 163;
            case 142 -> 3;
            case 143 -> 158;
            case 144 -> 112;
            case 145 -> 24;
            case 146 -> 62;
            case 147 -> 86;
            case 148 -> 53;
            case 149 -> 155;
            case 150 -> 234;
            case 151 -> 143;
            case 152 -> 109;
            case 153 -> 101;
            case 154 -> 2;
            case 155 -> 211;
            case 156 -> 188;
            case 157 -> 190;
            case 158 -> 216;
            case 159 -> 7;
            case 160 -> 230;
            case 161 -> 9;
            case 162 -> 48;
            case 163 -> 250;
            case 164 -> 84;
            case 165 -> 57;
            case 166 -> 137;
            case 167 -> 165;
            case 168 -> 4;
            case 169 -> 10;
            case 170 -> 187;
            case 171 -> 156;
            case 172 -> 217;
            case 173 -> 229;
            case 174 -> 37;
            case 175 -> 166;
            case 176 -> 17;
            case 177 -> 134;
            case 178 -> 61;
            case 179 -> 254;
            case 180 -> 240;
            case 181 -> 239;
            case 182 -> 66;
            case 183 -> 99;
            case 184 -> 31;
            case 185 -> 96;
            case 186 -> 144;
            case 187 -> 22;
            case 188 -> 213;
            case 189 -> 235;
            case 190 -> 167;
            case 191 -> 203;
            case 192 -> 185;
            case 193 -> 201;
            case 194 -> 116;
            case 195 -> 108;
            case 196 -> 32;
            case 197 -> 72;
            case 198 -> 97;
            case 199 -> 245;
            case 200 -> 115;
            case 201 -> 219;
            case 202 -> 65;
            case 203 -> 13;
            case 204 -> 194;
            case 205 -> 243;
            case 206 -> 248;
            case 207 -> 223;
            case 208 -> 51;
            case 209 -> 94;
            case 210 -> 70;
            case 211 -> 161;
            case 212 -> 80;
            case 213 -> 237;
            case 214 -> 178;
            case 215 -> 157;
            case 216 -> 162;
            case 217 -> 204;
            case 218 -> 41;
            case 219 -> 74;
            case 220 -> 92;
            case 221 -> 122;
            case 222 -> 231;
            case 223 -> 205;
            case 224 -> 8;
            case 225 -> 118;
            case 226 -> 195;
            case 227 -> 136;
            case 228 -> 30;
            case 229 -> 180;
            case 230 -> 42;
            case 231 -> 199;
            case 232 -> 241;
            case 233 -> 212;
            case 234 -> 36;
            case 235 -> 50;
            case 236 -> 5;
            case 237 -> 160;
            case 238 -> 182;
            case 239 -> 131;
            case 240 -> 214;
            case 241 -> 146;
            case 242 -> 121;
            case 243 -> 128;
            case 244 -> 27;
            case 245 -> 140;
            case 246 -> 60;
            case 247 -> 233;
            case 248 -> 16;
            case 249 -> 77;
            case 250 -> 82;
            case 251 -> 153;
            case 252 -> 114;
            case 253 -> 103;
            case 254 -> 183;
            default -> 63;
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

         k[var2] = new String(var3).intern();
      }

      return k[var2];
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private static int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final IIlIlIIllIIIIlIllIIIlllIIIllIIIIlIIIlIlIIlllllIlIIIIllIllIIlllIIIllllIlllIlllllllIlIl a() {
         return IIlIlIIllIIIIlIllIIIlllIIIllIIIIlIIIlIlIIlllllIlIIIIllIllIIlllIIIllllIlllIlllllllIlIl.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
      }

      public static void b(int var0) {
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var0;
      }

      public static int b() {
         return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public static int c() {
         int var0 = b();
         return var0 == 0 ? 107 : 0;
      }

      static {
         if (c() != 0) {
            b(31);
         }
      }
   }


  // PX-FIX synth restored from jar bytecode

  // PX-FIX synth restored from jar bytecode: getstatic + return
  public static me.octo.client.IIlIlIIllIIIIlIllIIIlllIIIllIIIIlIIIlIlIIlllllIlIIIIllIllIIlllIIIllllIlllIlllllllIlIl bk() { return lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII; }
}
