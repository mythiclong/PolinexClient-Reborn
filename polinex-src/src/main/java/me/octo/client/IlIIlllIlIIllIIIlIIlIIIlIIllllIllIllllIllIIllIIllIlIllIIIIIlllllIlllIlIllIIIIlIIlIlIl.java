package me.octo.client;

import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

@lIIlllllIIIlllIIIllIIlllIllllllIIIIIlllllIIlIIIIIIIlllIlIlIIlIlllIIlIIlIIlIIlllIIlllI
public final class IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl
   implements lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl {
   private final ScheduledExecutorService IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] a;
   private static String[] b;

   public IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl() {
      e();
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = Executors.newScheduledThreadPool(1);
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         b(new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[1]);
      }
   }

   public final ScheduledExecutorService b() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   @Override
   public IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI a() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = e();
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      short var10001 = 15764;
      short var10002 = -27339;
      var10002 = 15789;
      short var10003 = -21028;
      var10000 = var10000.a("polinex", "Main Polinex command");
      var10001 = 15760;
      var10002 = 12078;
      var10000 = var10000.a("lenny");
      var10001 = 15798;
      var10002 = 10210;
      var10000 = var10000.a("poli");
      var10001 = 15754;
      var10002 = -7454;
      var10000 = var10000.a("polar");
      var10001 = 15797;
      var10002 = 20116;
      var10000 = var10000.a("octo");
      var10001 = 15767;
      var10002 = -12087;
      var10000 = var10000.a("lory");
      var10001 = 15780;
      var10002 = 32088;
      var10000 = var10000.a("pn").b(IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl::a);
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var18 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      var10002 = 15761;
      var10003 = -24734;
      var10003 = 15765;
      short var10004 = 21737;
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var19 = var18.a(
         "getminingdata", "Start mining cache data retrieval"
      );
      var10002 = 15785;
      var10003 = -9231;
      var10000 = var10000.a(var19.a("gmd").a(IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl::b).a());
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var20 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      var10002 = 15766;
      var10003 = -17094;
      var10003 = 15793;
      var10004 = -15693;
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var21 = var20.a(
         "setmeleeweapon", "Set melee weapon for fishing macro from held item"
      );
      var10002 = 15751;
      var10003 = 10422;
      var10000 = var10000.a(var21.a("smw").a(IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl::c).a());
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var22 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      var10002 = 15795;
      var10003 = -19949;
      var10003 = 15778;
      var10004 = 15362;
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var23 = var22.a(
            "esp", "Manage CustomESP entries"
         )
         .b(IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl::d);
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var39 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      var10003 = 15763;
      var10004 = 11630;
      var10004 = 15784;
      short var10005 = 4420;
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var40 = var39.a(
         "add", "Add a CustomESP entry"
      );
      IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var59 = IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      var10004 = 15854;
      var10005 = 21750;
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var41 = var40.a(
         var59.a("name")
            .a(
               IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            )
            .b()
      );
      IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var60 = IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      var10004 = 15750;
      var10005 = 4150;
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var42 = var41.a(
         var60.a("color")
            .a(
               IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            )
            .a()
            .b()
      );
      IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var61 = IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      var10004 = 15807;
      var10005 = 1916;
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var24 = var23.a(
         var42.a(
               var61.a("mode")
                  .a(
                     IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  )
                  .a()
                  .b()
            )
            .a(IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl::e)
            .a()
      );
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var43 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      var10003 = 15792;
      var10004 = 12755;
      var10004 = 15762;
      var10005 = 22938;
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var44 = var43.a(
         "remove", "Remove a CustomESP entry"
      );
      var10003 = 15787;
      var10004 = 3874;
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var45 = var44.a(
         "rm"
      );
      var10003 = 15768;
      var10004 = 10296;
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var46 = var45.a(
         "delete"
      );
      IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var65 = IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      var10004 = 15854;
      var10005 = 21750;
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var25 = var24.a(
         var46.a(
               var65.a("name")
                  .a(
                     IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  )
                  .b()
            )
            .a(IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl::f)
            .a()
      );
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var47 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      var10003 = 15745;
      var10004 = 21878;
      var10004 = 15775;
      var10005 = 28398;
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var48 = var47.a(
         "list", "List all CustomESP entries"
      );
      var10003 = 15749;
      var10004 = -21067;
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var26 = var25.a(
         var48.a("ls").a(IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl::g).a()
      );
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var49 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      var10003 = 15788;
      var10004 = -6763;
      var10004 = 15852;
      var10005 = -9185;
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI var11 = var10000.a(
            var26.a(
                  var49.a("clear", "Clear all CustomESP entries")
                     .a(IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl::h)
                     .a()
               )
               .a()
         )
         .a();
      if (var1 == null) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[3]
         );
      }

      return var11;
   }

   private static final void c() {
      Minecraft.getInstance().setScreen(new lIIlIlIIllIllllIIIllIIIIIlIIlIllIllllIIlllIIIIIlIlIlllIlIIIlllIlIIlIlllllIIlIIIIIIIll());
   }

   private static final Unit d() {
      Minecraft.getInstance().execute(IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl::c);
      return Unit.INSTANCE;
   }

   private static final Unit a(llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var0) {
      short var10001 = 15777;
      short var10002 = 27349;
      Intrinsics.checkNotNullParameter(var0, "<unused var>");
      me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(100L, IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl::d);
      return Unit.INSTANCE;
   }

   private static final Unit b(llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var0) {
      short var10001 = 15777;
      short var10002 = 27349;
      Intrinsics.checkNotNullParameter(var0, "<unused var>");
      me.octo.client.utils.llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .i();
      return Unit.INSTANCE;
   }

   private static final Unit c(llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var0) {
      short var10001 = 15799;
      short var10002 = -3402;
      Intrinsics.checkNotNullParameter(var0, "<unused var>");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = e();
      Minecraft var11 = Minecraft.getInstance();
      short var10003 = 15802;
      short var10004 = 29601;
      Intrinsics.checkNotNullExpressionValue(var11, "getInstance(...)");
      Minecraft var2 = var11;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var10000;
      LocalPlayer var3 = var2.player;
      LocalPlayer var6 = var3;
      if (var1 != null) {
         if (var3 == null) {
            short var10 = 15747;
            var10001 = 29606;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§cPlayer not found!");
            return Unit.INSTANCE;
         }

         var6 = var3;
      }

      ItemStack var7 = var6.getMainHandItem();
      var10002 = 15755;
      var10003 = 9435;
      Intrinsics.checkNotNullExpressionValue(var7, "getMainHandItem(...)");
      ItemStack var4 = var7;
      if (var1 != null) {
         if (!var4.isEmpty()) {
            me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var9 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            String var13 = var4.getHoverName().getString();
            var10003 = 15753;
            var10004 = -29244;
            Intrinsics.checkNotNullExpressionValue(var13, "getString(...)");
            String var5 = var9.a(var13);
            IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(var5);
            var10001 = 15782;
            var10002 = -31174;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "§aMelee weapon set to: §f" + var5
            );
            return Unit.INSTANCE;
         }

         IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(null);
         short var8 = 15748;
         var10001 = 8938;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
            "§eMelee weapon cleared. CombatBot will auto-detect a sword."
         );
      }

      return Unit.INSTANCE;
   }

   private static final Unit d(llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var0) {
      short var10001 = 15777;
      short var10002 = 27349;
      Intrinsics.checkNotNullParameter(var0, "<unused var>");
      short var10000 = 15804;
      var10001 = -19933;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§eUsage:");
      var10000 = 15844;
      var10001 = 28601;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
         "§7  .pn esp add <name> [hex_color] [name|type]"
      );
      var10000 = 15849;
      var10001 = -1022;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§7  .pn esp remove <name>");
      var10000 = 15770;
      var10001 = -6409;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§7  .pn esp list");
      var10000 = 15851;
      var10001 = -14804;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§7  .pn esp clear");
      return Unit.INSTANCE;
   }

   private static final Unit e(llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII param0) {
      Intrinsics.checkNotNullParameter(param0, "context");
      String var1 = null;
      int var2 = 0;
      for (me.octo.client.IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll var3 : param0.a().b()) {
         int var4 = var2++;
         if (var4 < 0) {
            CollectionsKt.throwIndexOverflow();
         }
         if (Intrinsics.areEqual(var3.a(), "name") && var4 < param0.b().length) {
            Object var5 = param0.b()[var4];
            var1 = (String)(var5 instanceof String ? var5 : null);
            break;
         }
      }
      if (var1 == null || StringsKt.isBlank(var1)) {
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§cUsage: .pn esp add <name> [hex_color] [name|type]");
         return Unit.INSTANCE;
      }
      String var6 = null;
      int var7 = 0;
      for (me.octo.client.IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll var8 : param0.a().b()) {
         int var9 = var7++;
         if (var9 < 0) {
            CollectionsKt.throwIndexOverflow();
         }
         if (Intrinsics.areEqual(var8.a(), "color") && var9 < param0.b().length) {
            Object var10 = param0.b()[var9];
            var6 = (String)(var10 instanceof String ? var10 : null);
            break;
         }
      }
      Integer var11 = null;
      if (var6 != null) {
         try {
            var11 = Integer.valueOf(-16777216 | Integer.parseInt(StringsKt.removePrefix(var6, (CharSequence)"#"), kotlin.text.CharsKt.checkRadix(16)));
         } catch (Exception var12) {
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§cInvalid color: " + var6 + " (use hex like FF0000)");
            return Unit.INSTANCE;
         }
      }
      String var13 = null;
      int var14 = 0;
      for (me.octo.client.IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll var15 : param0.a().b()) {
         int var16 = var14++;
         if (var16 < 0) {
            CollectionsKt.throwIndexOverflow();
         }
         if (Intrinsics.areEqual(var15.a(), "mode") && var16 < param0.b().length) {
            Object var17 = param0.b()[var16];
            var13 = (String)(var17 instanceof String ? var17 : null);
            break;
         }
      }
      String var18;
      if (var13 == null) {
         var18 = null;
      } else {
         var18 = var13.toLowerCase(Locale.ROOT);
         Intrinsics.checkNotNullExpressionValue(var18, "toLowerCase(...)");
      }
      me.octo.client.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll var19 = Intrinsics.areEqual(var18, "type") || Intrinsics.areEqual(var18, "entity_type") ? me.octo.client.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII : me.octo.client.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      me.octo.client.lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.a(var1, var11, var19);
      String var20 = var19 == me.octo.client.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII ? "type" : "name";
      String var21;
      if (var11 == null) {
         var21 = "default";
      } else {
         String var22 = Integer.toHexString(var11.intValue() & 16777215);
         Intrinsics.checkNotNullExpressionValue(var22, "toHexString(...)");
         String var23 = var22.toUpperCase(Locale.ROOT);
         Intrinsics.checkNotNullExpressionValue(var23, "toUpperCase(...)");
         var21 = "#" + var23;
      }
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§aAdded ESP entry: §f" + var1 + " §7(mode=" + var20 + ", color=" + var21 + ")");
      return Unit.INSTANCE;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: sipush 15774
      // 004: sipush -25296
      // 007: pop2
      // 008: ldc_w "context"
      // 00b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 00e: invokestatic me/octo/client/IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl.e ()[Lme/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
      // 011: aload 0
      // 012: astore 3
      // 013: sipush 15848
      // 016: sipush 7592
      // 019: pop2
      // 01a: ldc "name"
      // 01c: astore 4
      // 01e: bipush 0
      // 01f: istore 5
      // 021: astore 1
      // 022: aload 3
      // 023: invokevirtual me/octo/client/llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII.a ()Lme/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI;
      // 026: invokevirtual me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.b ()Ljava/util/List;
      // 029: checkcast java/lang/Iterable
      // 02c: astore 6
      // 02e: bipush 0
      // 02f: istore 7
      // 031: bipush 0
      // 032: istore 8
      // 034: aload 6
      // 036: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 03b: astore 9
      // 03d: aload 9
      // 03f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 044: ifeq 0d6
      // 047: aload 9
      // 049: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 04e: astore 10
      // 050: iload 8
      // 052: iinc 8 1
      // 055: istore 11
      // 057: aload 1
      // 058: ifnull 0d7
      // 05b: iload 11
      // 05d: aload 1
      // 05e: ifnull 077
      // 061: goto 068
      // 064: invokestatic me/octo/client/IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 067: athrow
      // 068: ifge 075
      // 06b: goto 072
      // 06e: invokestatic me/octo/client/IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 071: athrow
      // 072: invokestatic kotlin/collections/CollectionsKt.throwIndexOverflow ()V
      // 075: iload 11
      // 077: aload 10
      // 079: checkcast me/octo/client/IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll
      // 07c: astore 12
      // 07e: istore 13
      // 080: bipush 0
      // 081: istore 14
      // 083: aload 1
      // 084: ifnull 0d2
      // 087: aload 12
      // 089: invokevirtual me/octo/client/IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll.a ()Ljava/lang/String;
      // 08c: aload 4
      // 08e: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 091: ifeq 0d0
      // 094: goto 09b
      // 097: invokestatic me/octo/client/IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09a: athrow
      // 09b: iload 13
      // 09d: aload 3
      // 09e: invokevirtual me/octo/client/llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII.b ()[Ljava/lang/Object;
      // 0a1: arraylength
      // 0a2: if_icmpge 0d0
      // 0a5: goto 0ac
      // 0a8: invokestatic me/octo/client/IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ab: athrow
      // 0ac: aload 3
      // 0ad: invokevirtual me/octo/client/llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII.b ()[Ljava/lang/Object;
      // 0b0: iload 13
      // 0b2: aaload
      // 0b3: dup
      // 0b4: instanceof java/lang/String
      // 0b7: ifne 0ca
      // 0ba: goto 0c1
      // 0bd: invokestatic me/octo/client/IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c0: athrow
      // 0c1: pop
      // 0c2: aconst_null
      // 0c3: goto 0ca
      // 0c6: invokestatic me/octo/client/IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c9: athrow
      // 0ca: checkcast java/lang/String
      // 0cd: goto 0d8
      // 0d0: nop
      // 0d1: nop
      // 0d2: aload 1
      // 0d3: ifnonnull 03d
      // 0d6: nop
      // 0d7: aconst_null
      // 0d8: astore 2
      // 0d9: aload 2
      // 0da: checkcast java/lang/CharSequence
      // 0dd: astore 3
      // 0de: aload 3
      // 0df: aload 1
      // 0e0: ifnull 0ee
      // 0e3: ifnull 0ff
      // 0e6: goto 0ed
      // 0e9: invokestatic me/octo/client/IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ec: athrow
      // 0ed: aload 3
      // 0ee: invokestatic kotlin/text/StringsKt.isBlank (Ljava/lang/CharSequence;)Z
      // 0f1: aload 1
      // 0f2: ifnull 100
      // 0f5: ifeq 103
      // 0f8: goto 0ff
      // 0fb: invokestatic me/octo/client/IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fe: athrow
      // 0ff: bipush 1
      // 100: goto 104
      // 103: bipush 0
      // 104: ifeq 11c
      // 107: sipush 15847
      // 10a: sipush 22791
      // 10d: pop2
      // 10e: ldc_w "§cUsage: .pn esp add <name> [hex_color] [name|type]"
      // 111: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 114: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 117: areturn
      // 118: invokestatic me/octo/client/IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11b: athrow
      // 11c: aload 0
      // 11d: astore 4
      // 11f: sipush 15781
      // 122: sipush -4486
      // 125: pop2
      // 126: ldc "color"
      // 128: astore 5
      // 12a: bipush 0
      // 12b: istore 6
      // 12d: aload 4
      // 12f: invokevirtual me/octo/client/llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII.a ()Lme/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI;
      // 132: invokevirtual me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.b ()Ljava/util/List;
      // 135: checkcast java/lang/Iterable
      // 138: astore 7
      // 13a: bipush 0
      // 13b: istore 8
      // 13d: bipush 0
      // 13e: istore 9
      // 140: aload 7
      // 142: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 147: astore 10
      // 149: aload 10
      // 14b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 150: ifeq 1e4
      // 153: aload 10
      // 155: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 15a: astore 11
      // 15c: iload 9
      // 15e: iinc 9 1
      // 161: istore 12
      // 163: aload 1
      // 164: ifnull 1e5
      // 167: iload 12
      // 169: aload 1
      // 16a: ifnull 183
      // 16d: goto 174
      // 170: invokestatic me/octo/client/IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 173: athrow
      // 174: ifge 181
      // 177: goto 17e
      // 17a: invokestatic me/octo/client/IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17d: athrow
      // 17e: invokestatic kotlin/collections/CollectionsKt.throwIndexOverflow ()V
      // 181: iload 12
      // 183: aload 11
      // 185: checkcast me/octo/client/IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll
      // 188: astore 13
      // 18a: istore 14
      // 18c: bipush 0
      // 18d: istore 15
      // 18f: aload 1
      // 190: ifnull 1e0
      // 193: aload 13
      // 195: invokevirtual me/octo/client/IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll.a ()Ljava/lang/String;
      // 198: aload 5
      // 19a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 19d: ifeq 1de
      // 1a0: goto 1a7
      // 1a3: invokestatic me/octo/client/IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a6: athrow
      // 1a7: iload 14
      // 1a9: aload 4
      // 1ab: invokevirtual me/octo/client/llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII.b ()[Ljava/lang/Object;
      // 1ae: arraylength
      // 1af: if_icmpge 1de
      // 1b2: goto 1b9
      // 1b5: invokestatic me/octo/client/IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b8: athrow
      // 1b9: aload 4
      // 1bb: invokevirtual me/octo/client/llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII.b ()[Ljava/lang/Object;
      // 1be: iload 14
      // 1c0: aaload
      // 1c1: dup
      // 1c2: instanceof java/lang/String
      // 1c5: ifne 1d8
      // 1c8: goto 1cf
      // 1cb: invokestatic me/octo/client/IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ce: athrow
      // 1cf: pop
      // 1d0: aconst_null
      // 1d1: goto 1d8
      // 1d4: invokestatic me/octo/client/IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d7: athrow
      // 1d8: checkcast java/lang/String
      // 1db: goto 1e6
      // 1de: nop
      // 1df: nop
      // 1e0: aload 1
      // 1e1: ifnonnull 149
      // 1e4: nop
      // 1e5: aconst_null
      // 1e6: astore 3
      // 1e7: aload 1
      // 1e8: ifnull 1f7
      // 1eb: aload 3
      // 1ec: ifnull 23e
      // 1ef: goto 1f6
      // 1f2: invokestatic me/octo/client/IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f5: athrow
      // 1f6: nop
      // 1f7: ldc_w -16777216
      // 1fa: aload 3
      // 1fb: ldc_w "#"
      // 1fe: checkcast java/lang/CharSequence
      // 201: invokestatic kotlin/text/StringsKt.removePrefix (Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 204: bipush 16
      // 206: invokestatic kotlin/text/CharsKt.checkRadix (I)I
      // 209: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;I)I
      // 20c: ior
      // 20d: istore 5
      // 20f: goto 236
      // 212: astore 6
      // 214: aload 3
      // 215: sipush 15758
      // 218: sipush 4924
      // 21b: pop2
      // 21c: ldc_w "§cInvalid color: "
      // 21f: swap
      // 220: sipush 15855
      // 223: sipush -21540
      // 226: pop2
      // 227: ldc_w " (use hex like FF0000)"
      // 22a: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 22f: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 232: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 235: areturn
      // 236: iload 5
      // 238: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 23b: goto 23f
      // 23e: aconst_null
      // 23f: astore 4
      // 241: sipush 15776
      // 244: aload 0
      // 245: astore 6
      // 247: sipush 4163
      // 24a: pop2
      // 24b: ldc "mode"
      // 24d: astore 7
      // 24f: bipush 0
      // 250: istore 8
      // 252: aload 6
      // 254: invokevirtual me/octo/client/llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII.a ()Lme/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI;
      // 257: invokevirtual me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.b ()Ljava/util/List;
      // 25a: checkcast java/lang/Iterable
      // 25d: astore 9
      // 25f: bipush 0
      // 260: istore 10
      // 262: bipush 0
      // 263: istore 11
      // 265: aload 9
      // 267: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 26c: astore 12
      // 26e: aload 12
      // 270: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 275: ifeq 309
      // 278: aload 12
      // 27a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 27f: astore 13
      // 281: iload 11
      // 283: iinc 11 1
      // 286: istore 14
      // 288: aload 1
      // 289: ifnull 30a
      // 28c: iload 14
      // 28e: aload 1
      // 28f: ifnull 2a8
      // 292: goto 299
      // 295: invokestatic me/octo/client/IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 298: athrow
      // 299: ifge 2a6
      // 29c: goto 2a3
      // 29f: invokestatic me/octo/client/IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a2: athrow
      // 2a3: invokestatic kotlin/collections/CollectionsKt.throwIndexOverflow ()V
      // 2a6: iload 14
      // 2a8: aload 13
      // 2aa: checkcast me/octo/client/IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll
      // 2ad: astore 15
      // 2af: istore 16
      // 2b1: bipush 0
      // 2b2: istore 17
      // 2b4: aload 1
      // 2b5: ifnull 305
      // 2b8: aload 15
      // 2ba: invokevirtual me/octo/client/IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll.a ()Ljava/lang/String;
      // 2bd: aload 7
      // 2bf: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 2c2: ifeq 303
      // 2c5: goto 2cc
      // 2c8: invokestatic me/octo/client/IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2cb: athrow
      // 2cc: iload 16
      // 2ce: aload 6
      // 2d0: invokevirtual me/octo/client/llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII.b ()[Ljava/lang/Object;
      // 2d3: arraylength
      // 2d4: if_icmpge 303
      // 2d7: goto 2de
      // 2da: invokestatic me/octo/client/IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2dd: athrow
      // 2de: aload 6
      // 2e0: invokevirtual me/octo/client/llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII.b ()[Ljava/lang/Object;
      // 2e3: iload 16
      // 2e5: aaload
      // 2e6: dup
      // 2e7: instanceof java/lang/String
      // 2ea: ifne 2fd
      // 2ed: goto 2f4
      // 2f0: invokestatic me/octo/client/IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f3: athrow
      // 2f4: pop
      // 2f5: aconst_null
      // 2f6: goto 2fd
      // 2f9: invokestatic me/octo/client/IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2fc: athrow
      // 2fd: checkcast java/lang/String
      // 300: goto 30b
      // 303: nop
      // 304: nop
      // 305: aload 1
      // 306: ifnonnull 26e
      // 309: nop
      // 30a: aconst_null
      // 30b: astore 5
      // 30d: aload 1
      // 30e: ifnull 345
      // 311: aload 5
      // 313: dup
      // 314: ifnull 33d
      // 317: goto 31e
      // 31a: invokestatic me/octo/client/IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31d: athrow
      // 31e: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 321: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 324: dup
      // 325: sipush 15757
      // 328: sipush 19029
      // 32b: pop2
      // 32c: ldc_w "toLowerCase(...)"
      // 32f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 332: aload 1
      // 333: ifnonnull 346
      // 336: goto 33d
      // 339: invokestatic me/octo/client/IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33c: athrow
      // 33d: pop
      // 33e: goto 345
      // 341: invokestatic me/octo/client/IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 344: athrow
      // 345: aconst_null
      // 346: astore 7
      // 348: aload 7
      // 34a: sipush 15752
      // 34d: sipush -25972
      // 350: pop2
      // 351: ldc_w "type"
      // 354: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 357: aload 1
      // 358: ifnull 37b
      // 35b: ifne 37e
      // 35e: goto 365
      // 361: invokestatic me/octo/client/IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 364: athrow
      // 365: aload 7
      // 367: sipush 15800
      // 36a: sipush 9417
      // 36d: pop2
      // 36e: ldc_w "entity_type"
      // 371: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 374: goto 37b
      // 377: invokestatic me/octo/client/IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37a: athrow
      // 37b: ifeq 388
      // 37e: getstatic me/octo/client/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 381: goto 38b
      // 384: invokestatic me/octo/client/IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 387: athrow
      // 388: getstatic me/octo/client/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 38b: astore 6
      // 38d: getstatic me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll Lme/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl;
      // 390: aload 2
      // 391: aload 4
      // 393: aload 6
      // 395: invokevirtual me/octo/client/lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.a (Ljava/lang/String;Ljava/lang/Integer;Lme/octo/client/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;)V
      // 398: aload 6
      // 39a: getstatic me/octo/client/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 39d: if_acmpne 3b1
      // 3a0: sipush 15746
      // 3a3: sipush -16868
      // 3a6: pop2
      // 3a7: ldc_w "type"
      // 3aa: goto 3ba
      // 3ad: invokestatic me/octo/client/IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b0: athrow
      // 3b1: sipush 15854
      // 3b4: sipush 21750
      // 3b7: pop2
      // 3b8: ldc "name"
      // 3ba: astore 7
      // 3bc: aload 1
      // 3bd: ifnull 406
      // 3c0: aload 4
      // 3c2: dup
      // 3c3: ifnull 405
      // 3c6: goto 3cd
      // 3c9: invokestatic me/octo/client/IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3cc: athrow
      // 3cd: invokevirtual java/lang/Integer.intValue ()I
      // 3d0: ldc_w 16777215
      // 3d3: iand
      // 3d4: invokestatic java/lang/Integer.toHexString (I)Ljava/lang/String;
      // 3d7: dup
      // 3d8: sipush 15801
      // 3db: sipush -4145
      // 3de: pop2
      // 3df: ldc_w "toHexString(...)"
      // 3e2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 3e5: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 3e8: invokevirtual java/lang/String.toUpperCase (Ljava/util/Locale;)Ljava/lang/String;
      // 3eb: dup
      // 3ec: sipush 15759
      // 3ef: sipush -26270
      // 3f2: pop2
      // 3f3: ldc_w "toUpperCase(...)"
      // 3f6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 3f9: invokedynamic makeConcatWithConstants (Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "#\u0001" ]
      // 3fe: goto 410
      // 401: invokestatic me/octo/client/IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 404: athrow
      // 405: pop
      // 406: sipush 15805
      // 409: sipush -5690
      // 40c: pop2
      // 40d: ldc_w "default"
      // 410: astore 8
      // 412: sipush 15771
      // 415: aload 2
      // 416: aload 7
      // 418: aload 8
      // 41a: astore 18
      // 41c: astore 19
      // 41e: astore 20
      // 420: sipush -24903
      // 423: pop2
      // 424: ldc_w "§aAdded ESP entry: §f"
      // 427: aload 20
      // 429: sipush 15790
      // 42c: sipush 887
      // 42f: pop2
      // 430: ldc_w " §7(mode="
      // 433: aload 19
      // 435: sipush 15769
      // 438: sipush 1050
      // 43b: pop2
      // 43c: ldc_w ", color="
      // 43f: aload 18
      // 441: ldc_w ")"
      // 444: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001\u0001\u0001" ]
      // 449: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 44c: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 44f: areturn
   }

   private static final Unit f(llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var0) {
      Object var21 = null; // PX-FIX
      Object var18 = null; // PX-FIX
      short var10001 = 15850;
      short var10002 = -20255;
      Intrinsics.checkNotNullParameter(var0, "context");
      llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var3 = var0;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = e();
      var10001 = 15854;
      var10002 = 21750;
      String var4 = "name";
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var10000;
      boolean var5 = false;
      Iterable var6 = var0.a().b();
      boolean var7 = false;
      int var8 = 0;

      label72: {
         for (Object var10 : var6) {
            int var11 = var8++;
            if (var1 != null) {
               int var17 = var11;
               if (var1 != null) {
                  if (var11 < 0) {
                     CollectionsKt.throwIndexOverflow();
                  }

                  var17 = var11;
               }

               IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll var12 = (IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll)var10;
               int var13 = var17;
               boolean var14 = false;
               if (var1 != null && Intrinsics.areEqual(var12.a(), var4) && var13 < var3.b().length) {
                  var10000 = (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[])var3.b()[var13];
                  if (!((Object)var10000 instanceof String)) {
                     var10000 = null;
                  }

                  var18 = (String)(Object)var10000;
                  break label72;
               }

               if (var1 != null) {
                  continue;
               }
            }
            break;
         }

         var18 = null;
      }

      String var2;
      label56: {
         label77: {
            var2 =((String)( var18));
            CharSequence var15 = var2;
            CharSequence var20 = var15;
            if (var1 != null) {
               if (var15 == null) {
                  break label77;
               }

               var20 = var15;
            }

            var21 = StringsKt.isBlank(var20);
            if (var1 == null) {
               break label56;
            }

            if (!(me.octo.client.PxTruth.truth(var21))) {
               var21 = false;
               break label56;
            }
         }

         var21 = true;
      }

      if ((me.octo.client.PxTruth.truth(var21))) {
         short var22 = 15803;
         var10001 = -7759;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§cUsage: .pn esp remove <name>");
         return Unit.INSTANCE;
      } else {
         if (lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
            .e(var2)) {
            var10001 = 15783;
            var10002 = 7707;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "§aRemoved ESP entry: §f" + var2
            );
            if (var1 != null) {
               return Unit.INSTANCE;
            }
         }

         var10001 = 15772;
         var10002 = -25265;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§cNo entry found for: " + var2);
         return Unit.INSTANCE;
      }
   }

   private static final Unit g(llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var0) {
      String var16 = null; // PX-FIX
      short var10001 = 15777;
      short var10002 = 27349;
      Intrinsics.checkNotNullParameter(var0, "<unused var>");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = e();
      List var2 = lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
         .ag();
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var10000;
      int var12 = ((var2.isEmpty()) ? 1 : 0);
      if (var1 != null) {
         if (var12 != 0) {
            short var22 = 15786;
            var10001 = -27926;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§eNo CustomESP entries.");
            return Unit.INSTANCE;
         }

         var12 = var2.size();
      }

      var10001 = 15773;
      var10002 = -18998;
      var10002 = 15744;
      short var10003 = -17269;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
         "§eCustomESP entries (" + var12 + "):"
      );

      for (IIlIIlIlllllIIlIIIlIIllIIIIIIlIIlIlIIIllIlIlIIIIllllIIIIIIIIlIIIllIlllIlIIllIIllIIIlI var4 :((IIlIIlIlllllIIlIIIlIIllIIIIIIlIIlIlIIIllIlIlIIIIllllIIIIIIIIlIIIllIlllIlIIllIIllIIIlI[])(Object)( var2))) {
         label38: {
            if (var1 != null) {
               Integer var13 = var4.b();
               if (var13 != null) {
                  int var7 = var13.intValue();
                  boolean var8 = false;
                  if (var1 != null) {
                     String var14 = Integer.toHexString(var7 & 16777215);
                     var10002 = 15779;
                     var10003 = -26045;
                     Intrinsics.checkNotNullExpressionValue(var14, "toHexString(...)");
                     String var15 = var14.toUpperCase(Locale.ROOT);
                     var10002 = 15756;
                     var10003 = -26078;
                     Intrinsics.checkNotNullExpressionValue(var15, "toUpperCase(...)");
                     var16 = "#" + var15;
                     if ("#" + var15 != null) {
                        break label38;
                     }
                  }
               }
            }

            short var17 = 15806;
            var10001 = 22781;
            var16 = "default";
         }

         String var5 = var16;
         String var19;
         if (var4.c()
            == IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )
          {
            short var18 = 15746;
            var10001 = -16868;
            var19 = "type";
         } else {
            short var20 = 15854;
            var10001 = 21750;
            var19 = "name";
         }

         String var6 = var19;
         short var21 = 15853;
         String var11 = var4.a();
         var10001 = 1375;
         var10002 = 15796;
         var10003 = 11607;
         short var10004 = 15845;
         short var10005 = -10352;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
            "§7  - §f" + var11 + " §7(mode=" + var6 + ", color=" + var5 + ")"
         );
         if (var1 == null) {
            break;
         }
      }

      return Unit.INSTANCE;
   }

   private static final Unit h(llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var0) {
      short var10001 = 15777;
      short var10002 = 27349;
      Intrinsics.checkNotNullParameter(var0, "<unused var>");
      int var1 = lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
         .ag()
         .size();
      lIIIIlIlIlIlIlIlIlIllIllIlIllllIIIllIlIlllIllllIlIIlIlllIlIIlIlllllIllIIIlIIlIIlIIlIl.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
         .ah();
      var10001 = 15791;
      var10002 = -22639;
      var10002 = 15794;
      short var10003 = -5558;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§aCleared " + var1 + " ESP entries.");
      return Unit.INSTANCE;
   }

   public static void b(me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var0) {
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var0;
   }

   public static me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] e() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[75];
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[3];
      int var3 = 0;
      String var2 = "àÊ\u0097Ì\\{\u0012¯d|\u001b\u009e\u009b\u0015Î\r0¶bî\u0005\u0096~¾ù¦\n\n\u0085W'nu¤p\u0001á\tôÐ\u008b×\u0007©\u0096$Ê\u0003ÊÝ°\u0015\bW\n\u0094\u0002\u0087\u009cW\u0006C\u00045Vç\u0081(\tùVÿ\u009b\u0002\u009f¢\u0017ý ¤\u0004ùP¼¤õà\u009f\u0011qMÁ[t`\u0095\u008e9\u0010\r\u0005¨\u0007p»W\u0002Ë\u0087\u0017d\u0092\u008bÌÎ.½Ô¦uÏ\u0013U©c²×1³1Ò\nÕ\u0019}@·\u0096´oÀòk\u0019#PWÈ¾\u0004\u0090_1t¿¸\u0098Ëç\f.û\u0016gØC°wE\u00adÔ\f\u0004ò\u0012ü\u0013\u0010ô±*g¶g\u0007Q¾~B\u008eü\u0000¬\u000f\u0018\u009cM\u001f3í_Ä\u0097\u0004¬\u0099-µ°ÓfeE,\u0004\u0086åD\u008d\u0007Î\u009dQ\u00ad?\u0085\u009a\b^$Ë\u0088-z_\b\u0004Í\u0005\u001bñ\u0007\u0093\u0002ú^Jû4\u00101=\u0092ö¡Uå\u0017â¶É\u0097\u008d#\u0082k\u000b\u001dü\u0018ãGP\u009fÞóWû\u001e\u0000£\u0000¾T¼pÐ*O§¦»ÀÖlá7·¦\u0082\u0094z\f\f\u0001J<\u0097´\u0010\u000e\t8\u0017Yà.\u0096\u009cúã²\u008a\u0087bÿ\u0004 Ýäm\t\u0015\u008b·¼\u0080Äf\u0089Ô\f÷U-²¿ù\\ ØGgQ\u0004&ÕÐç1\u001b+(:X\u0017u¸çøô\u0094wù:âã/ý,Ï)yúµá¬Íà\u0092_G\u001e\u0099\r!:ç \u0094\u00ad\u0001J@\u008e?K×,\u0006YÛ|kó\u009b\u0003Ñ\u0011\u0085\r¥WÅák\u0012õ\t¢´»k\u0081\u0010E\\\u0018Ð{ìVáZbÕ³L§ºû\u0010\u001c¨*Q\u0000 ÞxKQ÷Õ\bk2b\u0010I\u001a\u0080\u0007Uêt!\u001ez]°]Ç\u0098÷\u0011\u0093Inþ\u0011\f$SÌ\b¤\u0080æ/¹\u0090-\u000eþ\u0002&l\u0080×Q^ÄF\u008b\u0001¥0\u0004ûóóû\u0014\u0011óÛL*\u0015´X\u0099\"¬d\u0018[bG¤]\u009bx\u0005\u0001)4pß\u0002áÑ;ý0§\u001c¶>\u0080Øc\\\"øwÝº¶\u0019\nië×ÓÐ´\u0004\u0017×Ð\u00ad\u008d¼\u0092#á;\u0087_Þ\u009c\u0091ÓÙ8!ç\u007fªR\u001e\u0001!½\u0096C\u0090È\u000f2õ\u0003i6A\u00050ec÷5\u0004H[\u009dí\u0002ðå\u0013\u0083Gu=_.\u0011\u0017\u0006¶=Ë\u00147?ô\r\u0097é\u0004»/û`\u0015\u0081a&&Vzj.GPãÙR£\u0001hµâK¤\u008e\u0016\u0088É\nï,\u000b\u001d*¿À]âñQ$X\u00013¡¯^\u001f\u001aBÐø\u009cè\u0019\u0087ôü:xÕ±\u001aWI\u007f\"<j\u001f\u0006ÿU\u0010W\u0007\u0006¨§Uø9p\bmLat\u0085rñ\u0007\u0006QW¨ðJ£\u0015Ý\u0007¯\u007f2s\u0018qc_g8Â\u009f\u0013ïçM@b\u0098\u0010\u009d\u000bÆ&\u0018\u0081T\u0098\u0081B?¿ähøð!mÈó'\u008déô\u0086ýûÄ\u0096\nèò¼}K Õ\u0093Ð\u0093ÆûS&\u0003¡ô\u0000\u0080\u001e\u0007ZÒ_\u0007®ÐÜ\u0004pM\u009bä\u000eµ)Ù7n[³\u0019\u0005\u0089îBî\u008a\r\u0014ì{\u008f6N9òÉ\u009fe¥\u0091\u0005 \u001d\u008d²¡\u0003×$Õ\u0018J\u008b:a;Ú-\u0005l¨j\u0087óP\u001f\u0000v\u000b\u001dO;¢{Ñ\b\u0087Æ\u0085\u009fsæ\u0093h\u001b|¡Ç\u0002\u0089<¾9;às\u0087'\u008d`ëÍXÎ\u00034ÜöLû\u001aY\u0016y\txÉ{\u0015\u001c\u0015SMÇ.c6¼\u0084ó\u0098\n\u0004\u0095i\u0004~(\u0007\u009b\u00191\u0090SUªï\u0002UKûf\u0088Ñ\u0082\u009d;\u000362\"ÞhØ#S\u0004\u0017\u009a*Í\u00117:\u0093\u0000²E\u0001\u0000+QjÝA!´i+\u0007\u0004\fçÁð«q\b\u0011eîQtÖÏ\u0093";
      int var4 = "àÊ\u0097Ì\\{\u0012¯d|\u001b\u009e\u009b\u0015Î\r0¶bî\u0005\u0096~¾ù¦\n\n\u0085W'nu¤p\u0001á\tôÐ\u008b×\u0007©\u0096$Ê\u0003ÊÝ°\u0015\bW\n\u0094\u0002\u0087\u009cW\u0006C\u00045Vç\u0081(\tùVÿ\u009b\u0002\u009f¢\u0017ý ¤\u0004ùP¼¤õà\u009f\u0011qMÁ[t`\u0095\u008e9\u0010\r\u0005¨\u0007p»W\u0002Ë\u0087\u0017d\u0092\u008bÌÎ.½Ô¦uÏ\u0013U©c²×1³1Ò\nÕ\u0019}@·\u0096´oÀòk\u0019#PWÈ¾\u0004\u0090_1t¿¸\u0098Ëç\f.û\u0016gØC°wE\u00adÔ\f\u0004ò\u0012ü\u0013\u0010ô±*g¶g\u0007Q¾~B\u008eü\u0000¬\u000f\u0018\u009cM\u001f3í_Ä\u0097\u0004¬\u0099-µ°ÓfeE,\u0004\u0086åD\u008d\u0007Î\u009dQ\u00ad?\u0085\u009a\b^$Ë\u0088-z_\b\u0004Í\u0005\u001bñ\u0007\u0093\u0002ú^Jû4\u00101=\u0092ö¡Uå\u0017â¶É\u0097\u008d#\u0082k\u000b\u001dü\u0018ãGP\u009fÞóWû\u001e\u0000£\u0000¾T¼pÐ*O§¦»ÀÖlá7·¦\u0082\u0094z\f\f\u0001J<\u0097´\u0010\u000e\t8\u0017Yà.\u0096\u009cúã²\u008a\u0087bÿ\u0004 Ýäm\t\u0015\u008b·¼\u0080Äf\u0089Ô\f÷U-²¿ù\\ ØGgQ\u0004&ÕÐç1\u001b+(:X\u0017u¸çøô\u0094wù:âã/ý,Ï)yúµá¬Íà\u0092_G\u001e\u0099\r!:ç \u0094\u00ad\u0001J@\u008e?K×,\u0006YÛ|kó\u009b\u0003Ñ\u0011\u0085\r¥WÅák\u0012õ\t¢´»k\u0081\u0010E\\\u0018Ð{ìVáZbÕ³L§ºû\u0010\u001c¨*Q\u0000 ÞxKQ÷Õ\bk2b\u0010I\u001a\u0080\u0007Uêt!\u001ez]°]Ç\u0098÷\u0011\u0093Inþ\u0011\f$SÌ\b¤\u0080æ/¹\u0090-\u000eþ\u0002&l\u0080×Q^ÄF\u008b\u0001¥0\u0004ûóóû\u0014\u0011óÛL*\u0015´X\u0099\"¬d\u0018[bG¤]\u009bx\u0005\u0001)4pß\u0002áÑ;ý0§\u001c¶>\u0080Øc\\\"øwÝº¶\u0019\nië×ÓÐ´\u0004\u0017×Ð\u00ad\u008d¼\u0092#á;\u0087_Þ\u009c\u0091ÓÙ8!ç\u007fªR\u001e\u0001!½\u0096C\u0090È\u000f2õ\u0003i6A\u00050ec÷5\u0004H[\u009dí\u0002ðå\u0013\u0083Gu=_.\u0011\u0017\u0006¶=Ë\u00147?ô\r\u0097é\u0004»/û`\u0015\u0081a&&Vzj.GPãÙR£\u0001hµâK¤\u008e\u0016\u0088É\nï,\u000b\u001d*¿À]âñQ$X\u00013¡¯^\u001f\u001aBÐø\u009cè\u0019\u0087ôü:xÕ±\u001aWI\u007f\"<j\u001f\u0006ÿU\u0010W\u0007\u0006¨§Uø9p\bmLat\u0085rñ\u0007\u0006QW¨ðJ£\u0015Ý\u0007¯\u007f2s\u0018qc_g8Â\u009f\u0013ïçM@b\u0098\u0010\u009d\u000bÆ&\u0018\u0081T\u0098\u0081B?¿ähøð!mÈó'\u008déô\u0086ýûÄ\u0096\nèò¼}K Õ\u0093Ð\u0093ÆûS&\u0003¡ô\u0000\u0080\u001e\u0007ZÒ_\u0007®ÐÜ\u0004pM\u009bä\u000eµ)Ù7n[³\u0019\u0005\u0089îBî\u008a\r\u0014ì{\u008f6N9òÉ\u009fe¥\u0091\u0005 \u001d\u008d²¡\u0003×$Õ\u0018J\u008b:a;Ú-\u0005l¨j\u0087óP\u001f\u0000v\u000b\u001dO;¢{Ñ\b\u0087Æ\u0085\u009fsæ\u0093h\u001b|¡Ç\u0002\u0089<¾9;às\u0087'\u008d`ëÍXÎ\u00034ÜöLû\u001aY\u0016y\txÉ{\u0015\u001c\u0015SMÇ.c6¼\u0084ó\u0098\n\u0004\u0095i\u0004~(\u0007\u009b\u00191\u0090SUªï\u0002UKûf\u0088Ñ\u0082\u009d;\u000362\"ÞhØ#S\u0004\u0017\u009a*Í\u00117:\u0093\u0000²E\u0001\u0000+QjÝA!´i+\u0007\u0004\fçÁð«q\b\u0011eîQtÖÏ\u0093"
         .length();
      char var1 = 20;
      int var8 = -1;
      b(var10000);

      label52:
      while (true) {
         byte var9 = 82;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var25 = var10001.toCharArray();
               int var10004 = var25.length;
               int var6 = 0;
               byte var28 = var9;
               var21 = var25;
               int var15 = var10004;
               byte var33;
               char[] var37;
               int var10006;
               if (var10004 <= 1) {
                  var37 = var25;
                  var33 = var9;
                  var10006 = var6;
               } else {
                  var28 = var9;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var37 = var25;
                  var33 = var9;
                  var10006 = var6;
               }

               while (true) {
                  var37[var10006] = (char)(var37[var10006] ^ var33 ^ switch (var6 % 7) {
                     case 0 -> 75;
                     case 1 -> 124;
                     case 2 -> 119;
                     case 3 -> 33;
                     case 4 -> 60;
                     case 5 -> 45;
                     default -> 77;
                  });
                  var6++;
                  if (var28 == 0) {
                     var10006 = var28;
                     var37 = var21;
                     var33 = var28;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var37 = var21;
                     var33 = var28;
                     var10006 = var6;
                  }
               }
            }

            String var30 = new String(var21).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var30;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[75];
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var30;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "\u001f\u00066'¦\u0001#(ÏôVÉd\u000bóÄ\fÄ1ç|T\u000b\u008e;îË9;\u0091¢É\u00adWÛ\u0011\\ÕSøgÐ0ý\u0093\u008a3?\u009eG¹\u001cüÙx¿úµ°Y¢*\u0080Þ\u0019ñ»\u0084õ·Â.\u001a\u008aØ¥:GL\u0014,+°å#u\u0012²zQì¤7CÝ\u0090Þ\\";
                  var4 = "\u001f\u00066'¦\u0001#(ÏôVÉd\u000bóÄ\fÄ1ç|T\u000b\u008e;îË9;\u0091¢É\u00adWÛ\u0011\\ÕSøgÐ0ý\u0093\u008a3?\u009eG¹\u001cüÙx¿úµ°Y¢*\u0080Þ\u0019ñ»\u0084õ·Â.\u001a\u008aØ¥:GL\u0014,+°å#u\u0012²zQì¤7CÝ\u0090Þ\\"
                     .length();
                  var1 = '.';
                  var8 = -1;
            }

            var9 = 118;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 15789) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 9;
            case 1 -> 3;
            case 2 -> 98;
            case 3 -> 118;
            case 4 -> 104;
            case 5 -> 177;
            case 6 -> 97;
            case 7 -> 162;
            case 8 -> 108;
            case 9 -> 176;
            case 10 -> 218;
            case 11 -> 74;
            case 12 -> 43;
            case 13 -> 248;
            case 14 -> 72;
            case 15 -> 124;
            case 16 -> 123;
            case 17 -> 244;
            case 18 -> 242;
            case 19 -> 221;
            case 20 -> 229;
            case 21 -> 7;
            case 22 -> 18;
            case 23 -> 49;
            case 24 -> 122;
            case 25 -> 243;
            case 26 -> 29;
            case 27 -> 252;
            case 28 -> 106;
            case 29 -> 99;
            case 30 -> 120;
            case 31 -> 180;
            case 32 -> 213;
            case 33 -> 247;
            case 34 -> 52;
            case 35 -> 184;
            case 36 -> 216;
            case 37 -> 135;
            case 38 -> 208;
            case 39 -> 138;
            case 40 -> 115;
            case 41 -> 236;
            case 42 -> 126;
            case 43 -> 32;
            case 44 -> 164;
            case 45 -> 192;
            case 46 -> 163;
            case 47 -> 173;
            case 48 -> 1;
            case 49 -> 193;
            case 50 -> 109;
            case 51 -> 85;
            case 52 -> 165;
            case 53 -> 132;
            case 54 -> 125;
            case 55 -> 202;
            case 56 -> 5;
            case 57 -> 217;
            case 58 -> 145;
            case 59 -> 88;
            case 60 -> 181;
            case 61 -> 234;
            case 62 -> 148;
            case 63 -> 147;
            case 64 -> 161;
            case 65 -> 112;
            case 66 -> 187;
            case 67 -> 2;
            case 68 -> 250;
            case 69 -> 117;
            case 70 -> 188;
            case 71 -> 67;
            case 72 -> 12;
            case 73 -> 144;
            case 74 -> 14;
            case 75 -> 140;
            case 76 -> 10;
            case 77 -> 17;
            case 78 -> 31;
            case 79 -> 42;
            case 80 -> 62;
            case 81 -> 57;
            case 82 -> 82;
            case 83 -> 153;
            case 84 -> 198;
            case 85 -> 175;
            case 86 -> 35;
            case 87 -> 134;
            case 88 -> 51;
            case 89 -> 158;
            case 90 -> 219;
            case 91 -> 215;
            case 92 -> 45;
            case 93 -> 128;
            case 94 -> 23;
            case 95 -> 6;
            case 96 -> 156;
            case 97 -> 96;
            case 98 -> 133;
            case 99 -> 121;
            case 100 -> 119;
            case 101 -> 249;
            case 102 -> 151;
            case 103 -> 237;
            case 104 -> 232;
            case 105 -> 196;
            case 106 -> 95;
            case 107 -> 4;
            case 108 -> 160;
            case 109 -> 87;
            case 110 -> 90;
            case 111 -> 150;
            case 112 -> 179;
            case 113 -> 20;
            case 114 -> 185;
            case 115 -> 207;
            case 116 -> 194;
            case 117 -> 141;
            case 118 -> 127;
            case 119 -> 130;
            case 120 -> 22;
            case 121 -> 83;
            case 122 -> 80;
            case 123 -> 253;
            case 124 -> 16;
            case 125 -> 65;
            case 126 -> 166;
            case 127 -> 71;
            case 128 -> 89;
            case 129 -> 64;
            case 130 -> 101;
            case 131 -> 13;
            case 132 -> 212;
            case 133 -> 58;
            case 134 -> 46;
            case 135 -> 63;
            case 136 -> 197;
            case 137 -> 210;
            case 138 -> 15;
            case 139 -> 220;
            case 140 -> 11;
            case 141 -> 0;
            case 142 -> 77;
            case 143 -> 169;
            case 144 -> 240;
            case 145 -> 25;
            case 146 -> 149;
            case 147 -> 183;
            case 148 -> 59;
            case 149 -> 110;
            case 150 -> 201;
            case 151 -> 44;
            case 152 -> 139;
            case 153 -> 53;
            case 154 -> 105;
            case 155 -> 171;
            case 156 -> 233;
            case 157 -> 66;
            case 158 -> 38;
            case 159 -> 241;
            case 160 -> 26;
            case 161 -> 50;
            case 162 -> 70;
            case 163 -> 69;
            case 164 -> 30;
            case 165 -> 154;
            case 166 -> 186;
            case 167 -> 178;
            case 168 -> 131;
            case 169 -> 205;
            case 170 -> 251;
            case 171 -> 48;
            case 172 -> 91;
            case 173 -> 113;
            case 174 -> 235;
            case 175 -> 222;
            case 176 -> 230;
            case 177 -> 168;
            case 178 -> 231;
            case 179 -> 255;
            case 180 -> 75;
            case 181 -> 204;
            case 182 -> 114;
            case 183 -> 224;
            case 184 -> 73;
            case 185 -> 190;
            case 186 -> 129;
            case 187 -> 55;
            case 188 -> 174;
            case 189 -> 199;
            case 190 -> 107;
            case 191 -> 94;
            case 192 -> 56;
            case 193 -> 92;
            case 194 -> 254;
            case 195 -> 24;
            case 196 -> 86;
            case 197 -> 103;
            case 198 -> 76;
            case 199 -> 81;
            case 200 -> 102;
            case 201 -> 209;
            case 202 -> 111;
            case 203 -> 155;
            case 204 -> 100;
            case 205 -> 152;
            case 206 -> 191;
            case 207 -> 37;
            case 208 -> 136;
            case 209 -> 79;
            case 210 -> 182;
            case 211 -> 61;
            case 212 -> 195;
            case 213 -> 93;
            case 214 -> 146;
            case 215 -> 19;
            case 216 -> 239;
            case 217 -> 157;
            case 218 -> 142;
            case 219 -> 78;
            case 220 -> 214;
            case 221 -> 28;
            case 222 -> 137;
            case 223 -> 143;
            case 224 -> 36;
            case 225 -> 47;
            case 226 -> 246;
            case 227 -> 116;
            case 228 -> 167;
            case 229 -> 245;
            case 230 -> 227;
            case 231 -> 68;
            case 232 -> 223;
            case 233 -> 203;
            case 234 -> 41;
            case 235 -> 189;
            case 236 -> 84;
            case 237 -> 170;
            case 238 -> 228;
            case 239 -> 21;
            case 240 -> 39;
            case 241 -> 206;
            case 242 -> 60;
            case 243 -> 27;
            case 244 -> 159;
            case 245 -> 34;
            case 246 -> 200;
            case 247 -> 225;
            case 248 -> 33;
            case 249 -> 40;
            case 250 -> 211;
            case 251 -> 54;
            case 252 -> 8;
            case 253 -> 226;
            case 254 -> 172;
            default -> 238;
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
