package me.octo.client;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import me.octo.client.utils.player.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import net.minecraft.client.player.LocalPlayer;
import org.jetbrains.annotations.NotNull;

public final class lIIIIlIIIllIlIlIlIlIIlIlllllIlIIlIllIlIlIlllIllIllIllIIlIIIlIlIllIIllIIIIlIlIIlIllIII
   extends lllIllllIlIIllIlIIlIIllIIIIIIIIIlIIIIllllIlIllIlllIlIlIlIIIIIIlllIIIIIllIIIIIllIlIIIl {

   @NotNull
   public static lIIIIlIIIllIlIlIlIlIIlIlllllIlIIlIllIlIlIlllIllIllIllIIlIIIlIlIllIIllIIIIlIlIIlIllIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
   @NotNull
   private static lIIIIlIIIllIlIlIlIlIIlIlllllIlIIlIllIlIlIlllIllIllIllIIlIIIlIlIllIIllIIIIlIlIIlIllIII IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   private static String[] j;
   private static String[] k;

   public lIIIIlIIIllIlIlIlIlIIlIlllllIlIIlIllIlIlIlllIllIllIllIIlIIIlIlIllIIllIIIIlIlIIlIllIII() {
      short var10001 = -20134;
      short var10002 = 13422;
      var10002 = -20131;
      short var10003 = 7069;
      me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      short var10004 = -20136;
      short var10005 = -3998;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         lIIIIIlIIIIllllllllIIIlIIlIIIIIIlIlIlIlllIlllIlllIllIIIIIlllllIIIIlIIlIlIlIlIllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         lIIIIIlIIIIllllllllIIIlIIlIIIIIIlIlIlIlllIlllIlllIllIIIIIlllllIIIIlIIlIlIlIlIllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         lIIIIIlIIIIllllllllIIIlIIlIIIIIIlIlIlIlllIlllIlllIllIIIIIlllllIIIIlIIlIlIlIlIllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c()
      };
      super("Slayer Macro", "Does slayer quests.", var3, "General", null, null, false, var1, 112, null);
   }

   @Override
   public void aC() {
      Object var7 = null; // PX-FIX
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      String var1 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (var1 != null) {
         LocalPlayer var10000 = this.ap().player;
         if (var10000 != null) {
            LocalPlayer var2 = var10000;
            int var6 = ((me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.n()) ? 1 : 0);
            if (var1 != null) {
               if (var6 != 0) {
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .t();
                  return;
               }

               var6 = ((int[])lIIIIlIIIllIlIlIlIlIIlIlllllIlIIlIllIlIlIlllIllIllIllIIlIIIlIlIllIIllIIIIlIlIIlIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl)[this.W()
                  .ordinal()];
            }

            label108: {
               if (var1 != null) {
                  switch (var6) {
                     case 1:
                        var6 = ((this.aK()) ? 1 : 0);
                        break;
                     case 2:
                        break label108;
                     default:
                        return;
                  }
               }

               label91: {
                  label90: {
                     label89: {
                        if (var1 != null) {
                           if (var6 == 0) {
                              return;
                           }

                           var7 = this;
                           if (var1 == null) {
                              break label89;
                           }

                           var6 = ((int[])lIIIIlIIIllIlIlIlIlIIlIlllllIlIIlIllIlIlIlllIllIllIllIIlIIIlIlIllIIllIIIIlIlIIlIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)[this.aJ()
                              .a()
                              .ordinal()];
                        }

                        switch (var6) {
                           case 1:
                              var7 = this;
                              break;
                           case 2:
                              break label90;
                           default:
                              break label91;
                        }
                     }

                     this.a9();
                     if (var1 != null) {
                        return;
                     }
                  }

                  this.bd();
               }

               if (var1 != null) {
                  return;
               }
            }

            var10000 = ((LocalPlayer)(Object)(this));
            if (var1 != null) {
               if (this.a8() == this.ac().size()) {
                  this.a9();
                  return;
               }

               var10000 = ((LocalPlayer)(Object)(this.ac().get(this.a8())));
               short var10002 = -20135;
               short var10003 = -2678;
               Intrinsics.checkNotNullExpressionValue(var10000, "get(...)");
            }

            IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var3;
            label110: {
               var3 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)(Object)var10000;
               int var9 = ((int[])lIIIIlIIIllIlIlIlIlIIlIlllllIlIIlIllIlIlIlllIllIllIllIIlIIIlIlIllIIllIIIIlIlIIlIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII)[var3.b()
                  .ordinal()];
               if (var1 != null) {
                  switch (var9) {
                     case 1:
                        var9 = ((me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .a(var3.d(), llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(var2), 2.0)) ? 1 : 0);
                        break;
                     case 2:
                        break label110;
                     default:
                        return;
                  }
               }

               if (var1 != null) {
                  if (var9 != 0) {
                     int var4 = this.a8();
                     this.a(var4 + 1);
                     IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                        .e()
                        .k();
                     if (var1 != null) {
                        return;
                     }
                  }

                  var9 = ((IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                     .e()
                     .d()) ? 1 : 0);
               }

               if (var1 != null) {
                  if (var9 == 0) {
                     return;
                  }

                  IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                     ((net.minecraft.core.BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                        .e())),
                     var3.a(),
                     null,
                     false);
               }

               if (var1 != null) {
                  return;
               }
            }

            int var10 = (llIlIlIIlIIlIlIllIIIIIIIIlIIIIlIIlIIllllllIIIllIIllllIlIlllIIIIllIIIIlllllIlIIllllIIl.a(
               IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                  .f(),
               var3.a(),
               null,
               2,
               null
            ) ? 1 : 0);
            if (var1 != null) {
               if (var10 == 0) {
                  return;
               }

               var10 = this.a8();
            }

            int var5 = var10;
            this.a(var5 + 1);
            return;
         }
      }
   }

   private final void bd() {
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
      );
      String var10001 = lIIIIIlIIIIllllllllIIIlIIlIIIIIIlIlIlIlllIlllIlllIllIIIIIlllllIIIIlIIlIlIlIlIllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a()
         .y();
      short var10002 = -20132;
      short var10003 = 17870;
      this.a((java.util.ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll>)(Intrinsics.areEqual(var10001, "Revenant Horror") ? new ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll>() : new ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll>()));
   }

   private final void be() {
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
      );
   }

   @Override
   public void a9() {
      String var1 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      lIIIIlIIIllIlIlIlIlIIlIlllllIlIIlIllIlIlIlllIllIllIllIIlIIIlIlIllIIllIIIIlIlIIlIllIII var10000 = this;
      if (var1 != null) {
         if (this.bg()) {
            this.be();
            if (var1 != null) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.a(this.bf(), 2000);
   }

   private final IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI bf() {
      String var1 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      String var10000 = lIIIIIlIIIIllllllllIIIlIIlIIIIIIlIlIlIlllIlllIlllIllIIIIIlllllIIIIlIIlIlIlIlIllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a()
         .y();
      short var10001 = -20133;
      short var10002 = 16548;
      boolean var2 = Intrinsics.areEqual(var10000, "Revenant Horror");
      if (var1 != null) {
         if (!var2) {
            return IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         }

         var2 = lIIIIIlIIIIllllllllIIIlIIlIIIIIIlIlIlIlllIlllIlllIllIIIIIlllllIIIIlIIlIlIlIlIllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c()
            .al();
      }

      return var2
         ? IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll
         : IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   private final boolean bg() {
      return false;
   }

   private final IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI bh() {
      lIIIIIlIIIIllllllllIIIlIIlIIIIIIlIlIlIlllIlllIlllIllIIIIIlllllIIIIlIIlIlIlIlIllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a()
         .y();
      return IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @Override
   public void M() {
      String var1;
      boolean var6;
      label67: {
         label66: {
            String var10000 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
            this.aM();
            var1 = var10000;
            me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var5 = this.a6();
            if (var1 != null) {
               if (var5 != null) {
                  break label66;
               }

               var5 = this.a7();
            }

            if (var5 == null) {
               var6 = false;
               break label67;
            }
         }

         var6 = true;
      }

      boolean var3;
      boolean var4;
      boolean var2 = var6;
      var3 = this.X() != null;
      var4 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
         == this.bh();
      var6 = var2;
      label57:
      if (var1 != null) {
         if (var2) {
            var6 = var3;
            if (var1 == null) {
               break label57;
            }

            if (var3) {
               var6 = var4;
               if (var1 == null) {
                  break label57;
               }

               if (var4) {
                  super.M();
                  this.a9();
                  return;
               }
            }
         }

         var6 = var2;
      }

      if (var1 != null) {
         if (!var6) {
            this.ba();
         }

         var6 = var3;
      }

      if (var1 != null) {
         if (!var6) {
            this.aP();
         }

         var6 = var4;
      }

      if (!var6) {
         this.b(CollectionsKt.listOf(this.bh()));
      }

      this.N();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "[ã¶@\u009e\u0000Þº\u0007ô\u000b}\u0010â¡Ä\u000f\u0012\u0096\u000e£\u008b×t»^ç]SPñ<\fµ\u000fÌ¤-»\u0084~\u0086j2±";
      int var4 = "[ã¶@\u009e\u0000Þº\u0007ô\u000b}\u0010â¡Ä\u000f\u0012\u0096\u000e£\u008b×t»^ç]SPñ<\fµ\u000fÌ¤-»\u0084~\u0086j2±".length();
      char var1 = '\b';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 47;
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
                     case 0 -> 94;
                     case 1 -> 17;
                     case 2 -> 35;
                     case 3 -> 53;
                     case 4 -> 50;
                     case 5 -> 103;
                     default -> 68;
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
                     k = new String[6];
                     lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = new lIIIIlIIIllIlIlIlIlIIlIlllllIlIIlIllIlIlIlllIllIllIllIIlIIIlIlIllIIllIIIIlIlIIlIllIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = new lIIIIlIIIllIlIlIlIlIIlIlllllIlIIlIllIlIlIlllIllIllIllIIlIIIlIlIllIIllIIIIlIlIIlIllIII();
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

                  var2 = ":Ü²É]\"U>\u001f³d}´Hª\u008c´\\ \u000f\u007f\u0088Ý\u001e\u008f\u001e\u008aüÿq\u0017ÿg\u001a¤";
                  var4 = ":Ü²É]\"U>\u001f³d}´Hª\u008c´\\ \u000f\u007f\u0088Ý\u001e\u008f\u001e\u008aüÿq\u0017ÿg\u001a¤".length();
                  var1 = 19;
                  var8 = -1;
            }

            var10000 = 95;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String e(int var0, int var1) {
      int var2 = (var0 ^ -20135) & 65535;
      if (k[var2] == null) {
         char[] var3 = j[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 186;
            case 1 -> 29;
            case 2 -> 124;
            case 3 -> 100;
            case 4 -> 6;
            case 5 -> 133;
            case 6 -> 74;
            case 7 -> 196;
            case 8 -> 243;
            case 9 -> 76;
            case 10 -> 49;
            case 11 -> 183;
            case 12 -> 147;
            case 13 -> 21;
            case 14 -> 116;
            case 15 -> 120;
            case 16 -> 111;
            case 17 -> 39;
            case 18 -> 77;
            case 19 -> 7;
            case 20 -> 64;
            case 21 -> 166;
            case 22 -> 152;
            case 23 -> 168;
            case 24 -> 151;
            case 25 -> 9;
            case 26 -> 97;
            case 27 -> 69;
            case 28 -> 114;
            case 29 -> 228;
            case 30 -> 108;
            case 31 -> 71;
            case 32 -> 136;
            case 33 -> 238;
            case 34 -> 79;
            case 35 -> 38;
            case 36 -> 154;
            case 37 -> 165;
            case 38 -> 78;
            case 39 -> 109;
            case 40 -> 250;
            case 41 -> 83;
            case 42 -> 61;
            case 43 -> 155;
            case 44 -> 232;
            case 45 -> 201;
            case 46 -> 191;
            case 47 -> 213;
            case 48 -> 25;
            case 49 -> 122;
            case 50 -> 240;
            case 51 -> 169;
            case 52 -> 48;
            case 53 -> 189;
            case 54 -> 193;
            case 55 -> 187;
            case 56 -> 149;
            case 57 -> 12;
            case 58 -> 164;
            case 59 -> 30;
            case 60 -> 20;
            case 61 -> 198;
            case 62 -> 93;
            case 63 -> 91;
            case 64 -> 42;
            case 65 -> 249;
            case 66 -> 204;
            case 67 -> 66;
            case 68 -> 208;
            case 69 -> 157;
            case 70 -> 36;
            case 71 -> 131;
            case 72 -> 237;
            case 73 -> 123;
            case 74 -> 19;
            case 75 -> 56;
            case 76 -> 141;
            case 77 -> 52;
            case 78 -> 214;
            case 79 -> 32;
            case 80 -> 0;
            case 81 -> 146;
            case 82 -> 26;
            case 83 -> 233;
            case 84 -> 89;
            case 85 -> 199;
            case 86 -> 70;
            case 87 -> 87;
            case 88 -> 138;
            case 89 -> 75;
            case 90 -> 216;
            case 91 -> 13;
            case 92 -> 99;
            case 93 -> 182;
            case 94 -> 132;
            case 95 -> 197;
            case 96 -> 17;
            case 97 -> 101;
            case 98 -> 57;
            case 99 -> 115;
            case 100 -> 161;
            case 101 -> 82;
            case 102 -> 148;
            case 103 -> 40;
            case 104 -> 247;
            case 105 -> 129;
            case 106 -> 234;
            case 107 -> 37;
            case 108 -> 227;
            case 109 -> 246;
            case 110 -> 14;
            case 111 -> 23;
            case 112 -> 230;
            case 113 -> 225;
            case 114 -> 241;
            case 115 -> 51;
            case 116 -> 102;
            case 117 -> 28;
            case 118 -> 219;
            case 119 -> 171;
            case 120 -> 24;
            case 121 -> 144;
            case 122 -> 130;
            case 123 -> 178;
            case 124 -> 236;
            case 125 -> 59;
            case 126 -> 162;
            case 127 -> 181;
            case 128 -> 142;
            case 129 -> 1;
            case 130 -> 117;
            case 131 -> 172;
            case 132 -> 135;
            case 133 -> 160;
            case 134 -> 143;
            case 135 -> 150;
            case 136 -> 176;
            case 137 -> 22;
            case 138 -> 33;
            case 139 -> 85;
            case 140 -> 4;
            case 141 -> 202;
            case 142 -> 86;
            case 143 -> 217;
            case 144 -> 231;
            case 145 -> 8;
            case 146 -> 206;
            case 147 -> 242;
            case 148 -> 128;
            case 149 -> 137;
            case 150 -> 107;
            case 151 -> 205;
            case 152 -> 244;
            case 153 -> 43;
            case 154 -> 140;
            case 155 -> 158;
            case 156 -> 88;
            case 157 -> 173;
            case 158 -> 72;
            case 159 -> 184;
            case 160 -> 50;
            case 161 -> 163;
            case 162 -> 103;
            case 163 -> 94;
            case 164 -> 251;
            case 165 -> 15;
            case 166 -> 211;
            case 167 -> 229;
            case 168 -> 170;
            case 169 -> 221;
            case 170 -> 245;
            case 171 -> 54;
            case 172 -> 106;
            case 173 -> 192;
            case 174 -> 226;
            case 175 -> 105;
            case 176 -> 177;
            case 177 -> 45;
            case 178 -> 159;
            case 179 -> 47;
            case 180 -> 255;
            case 181 -> 11;
            case 182 -> 3;
            case 183 -> 134;
            case 184 -> 92;
            case 185 -> 125;
            case 186 -> 104;
            case 187 -> 239;
            case 188 -> 67;
            case 189 -> 35;
            case 190 -> 175;
            case 191 -> 63;
            case 192 -> 139;
            case 193 -> 55;
            case 194 -> 220;
            case 195 -> 44;
            case 196 -> 215;
            case 197 -> 235;
            case 198 -> 18;
            case 199 -> 53;
            case 200 -> 185;
            case 201 -> 174;
            case 202 -> 68;
            case 203 -> 209;
            case 204 -> 118;
            case 205 -> 190;
            case 206 -> 145;
            case 207 -> 73;
            case 208 -> 252;
            case 209 -> 194;
            case 210 -> 95;
            case 211 -> 84;
            case 212 -> 203;
            case 213 -> 60;
            case 214 -> 27;
            case 215 -> 207;
            case 216 -> 98;
            case 217 -> 16;
            case 218 -> 34;
            case 219 -> 127;
            case 220 -> 223;
            case 221 -> 5;
            case 222 -> 41;
            case 223 -> 254;
            case 224 -> 110;
            case 225 -> 248;
            case 226 -> 222;
            case 227 -> 121;
            case 228 -> 210;
            case 229 -> 119;
            case 230 -> 31;
            case 231 -> 156;
            case 232 -> 224;
            case 233 -> 58;
            case 234 -> 126;
            case 235 -> 96;
            case 236 -> 90;
            case 237 -> 180;
            case 238 -> 46;
            case 239 -> 167;
            case 240 -> 81;
            case 241 -> 212;
            case 242 -> 112;
            case 243 -> 188;
            case 244 -> 80;
            case 245 -> 10;
            case 246 -> 62;
            case 247 -> 2;
            case 248 -> 218;
            case 249 -> 179;
            case 250 -> 253;
            case 251 -> 65;
            case 252 -> 153;
            case 253 -> 113;
            case 254 -> 195;
            default -> 200;
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

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final lIIIIlIIIllIlIlIlIlIIlIlllllIlIIlIllIlIlIlllIllIllIllIIlIIIlIlIllIIllIIIIlIlIIlIllIII a() {
         return lIIIIlIIIllIlIlIlIlIIlIlllllIlIIlIllIlIlIlllIllIllIllIIlIIIlIlIllIIllIIIIlIlIIlIllIII.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
      }
   }


  // PX-FIX synth restored from jar bytecode

  // PX-FIX synth restored from jar bytecode: getstatic + return
  public static me.octo.client.lIIIIlIIIllIlIlIlIlIIlIlllllIlIIlIllIlIlIlllIllIllIllIIlIIIlIlIllIIllIIIIlIlIIlIllIII bi() { return IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI; }
}
