package me.octo.client;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.ChatScreen;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.ClickEvent.RunCommand;
import net.minecraft.network.chat.HoverEvent.ShowText;
import org.jetbrains.annotations.NotNull;

public final class IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private final ArrayList<llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII> lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private boolean lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private static IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;

   public static void a(IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII arg0, boolean arg1, int arg2, Object arg3) { // SYNB1-defaultarg-a
      if ((arg2 & 1) != 0) {
         arg1 = true;
      }

      arg0.d(arg1);
   }

   public static void a(IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII arg0, String arg1, int arg2, Object arg3) { // SYNB1-defaultarg-b
      if ((arg2 & 1) != 0) {
         arg1 = "SIMULATED FAILSAFE";
      }

      arg0.e(arg1);
   }

   public static void b(IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII arg0, String arg1, int arg2, Object arg3) { // SYNB1-defaultarg-c
      if ((arg2 & 1) != 0) {
         arg1 = "FAILSAFE TRIGGERED";
      }

      arg0.f(arg1);
   }

   public static final IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII aH() { // SYNB1-staticgetter
      return llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   }

   private static String[] f;
   private static String[] g;

   private IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII() {
      short var10001 = 22969;
      short var10002 = 8475;
      var10002 = 22953;
      short var10003 = 3663;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      short var10004 = 22971;
      short var10005 = -6458;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e(),
         llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c(),
         llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .f(),
         llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .d(),
         llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .g(),
         llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .h(),
         llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .i(),
         llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .j(),
         llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .k()
      };
      super("Failsafes", "Enables a bunch of failsafes.", var3, "Failsafes", true, var1);
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new ArrayList<>();
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
   }

   @Override
   public void aB() {
      super.aB();
      this.ag();
   }

   @Override
   public void aC() {
      super.aC();
      this.ah();
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl var1) {
      Object var4 = null; // PX-FIX
      String[] var10000 = llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII.g();
      short var10002 = 22965;
      short var10003 = -28511;
      Intrinsics.checkNotNullParameter(var1, "event");
      String[] var2 = var10000;
      boolean var3 = ((java.util.function.Supplier<Boolean>)(() -> { this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.a(5000); return false; })).get();
      if (var2 != null) {
         if (!var3) {
            return;
         }

         var3 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      }

      label38: {
         label37: {
            label36:
            if (var2 != null) {
               if (!var3) {
                  var3 = this.aA();
                  if (var2 == null) {
                     break label36;
                  }

                  if (var3) {
                     this.ag();
                     if (var2 != null) {
                        break label37;
                     }
                  }
               }

               var4 = this;
               if (var2 == null) {
                  break label38;
               }

               var3 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
            }

            if (var3) {
               var4 = this;
               if (var2 == null) {
                  break label38;
               }

               if (!this.aA()) {
                  this.ah();
               }
            }
         }

         var4 = this;
      }

      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.f();
   }

   private final void ag() {
      llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII[] var3 = new llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII[11];
      String[] var10000 = llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII.g();
      short var10005 = 22941;
      short var10006 = 16688;
      var3[0] = new lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl("TeleportFailsafe");
      String[] var1 = var10000;
      short var10004 = 22939;
      var10005 = -12816;
      var3[1] = new IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI("VelocityFailsafe");
      var10004 = 22963;
      var10005 = 10170;
      var3[2] = new lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII("EtherwarpFailsafe");
      var10004 = 22970;
      var10005 = 18403;
      var3[3] = new lllIIIIlIlIlllllIlIIllIIllIllllIlIIIllIIllIIllIIlIIlIlIIIIlllIIllIlllIIlIIlIlIlIIllll("ItemSwapFailsafe");
      var10004 = 22949;
      short var18 = 13;
      var3[4] = new llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII("PlayerCloneFailsafe");
      var10004 = 22975;
      var18 = -2385;
      var3[5] = new lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl("RotationFailsafe");
      var10004 = 22959;
      var18 = -642;
      var3[6] = new IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl("AirWaypointFailsafe");
      var10004 = 22960;
      var18 = 5211;
      var3[7] = new IlllIIIIllllIIllIlllIllIIIllIIIlIllIIllIlIIIlllIllllllIllIlIIIIIllIIlIlIllIIllIIlIIII("ChatMentionFailsafe");
      var10004 = 22958;
      var18 = 12018;
      var3[8] = new lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII("BlockBreakFailsafe");
      var10004 = 22964;
      var18 = -18593;
      var3[9] = new lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII("TradeGUIFailsafe");
      var10004 = 22950;
      var18 = 16015;
      var3[10] = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI("PowderFailsafe");
      List var2 = CollectionsKt.listOf(var3);
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.clear();
      Iterator var5 = var2.iterator();

      while (true) {
         if (var5.hasNext()) {
            llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII var4 = (llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII)var5.next();
            me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .a(var4);
            this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.add(var4);
            var4.a(false);
            if (var1 == null) {
               break;
            }

            if (var1 != null) {
               continue;
            }
         }

         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = true;
         break;
      }
   }

   private final void ah() {
      String[] var10000 = llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII.g();
      Iterator var10001 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.iterator();
      short var10003 = 22931;
      short var10004 = 15208;
      Intrinsics.checkNotNullExpressionValue(var10001, "iterator(...)");
      Iterator var2 = var10001;
      String[] var1 = var10000;

      while (true) {
         if (var2.hasNext()) {
            var10000 = (String[])var2.next();
            short var10002 = 22946;
            var10003 = -153;
            Intrinsics.checkNotNullExpressionValue(var10000, "next(...)");
            llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII var3 = (llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII)(Object)var10000;
            me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .b(var3);
            if (var1 == null) {
               break;
            }

            if (var1 != null) {
               continue;
            }
         }

         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.clear();
         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = false;
         break;
      }
   }

   public final void d(boolean var1) {
      String[] var10000 = llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII.g();
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(false);
      String[] var2 = var10000;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .t();
      if (var2 != null) {
         if (var1) {
            IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var5 = IllIIlIIlIlIlIIIlIlIllIlllIIIllIIIIlllIllIlIIIlIllIIIlIlIlIIIIIIIlllIIIIlIIIIIIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b();
            if (var5 != null) {
               IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var3 = var5;
               boolean var4 = false;
               String var10001 = var3.aj();
               short var10002 = 22962;
               short var10003 = -26227;
               this.d("Re-enabling macro: " + var10001);
            }

            IllIIlIIlIlIlIIIlIlIllIlllIIIllIIIIlllIllIlIIIlIllIIIlIlIlIIIIIIIlllIIIIlIIIIIIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .d();
         }

         this.ag();
      }
   }

   public final boolean ai() {
      String[] var1;
      Object var8;
      var var2 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      var8 = llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII.g();
      boolean var3 = false;
      var1 = (String[])var8;
      var8 = var2;
      label36:
      if (var1 != null) {
         if (var2 instanceof Collection) {
            var8 = var2;
            if (var1 == null) {
               break label36;
            }

            if (((me.octo.client.PXDyn)var8).isEmpty()) {
               return false;
            }
         }

         var8 = var2;
      }

      for (Object var5 : (Iterable<?>)(var8)) {
         llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII var6 = (llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII)var5;
         boolean var7 = false;
         boolean var9 = var6.b();

         while (var9) {
            var9 = true;
            if (var1 != null) {
               return true;
            }
         }
      }

      return false;
   }

   public final void e(@NotNull String var1) {
      String[] var2;
      Object var5;
      label44: {
         var5 = llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII.g();
         short var10002 = 22956;
         short var10003 = 8601;
         Intrinsics.checkNotNullParameter(var1, "reason");
         var2 = (String[])var5;
         boolean var4 = this.aA();
         if (var2 != null) {
            if (!var4) {
               short var11 = 22966;
               short var13 = 25600;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                  "§cFailsafes module is off — enable it first"
               );
               return;
            }

            var5 = this;
            if (var2 == null) {
               break label44;
            }

            var4 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
         }

         if (!var4) {
            this.ag();
         }

         var5 = CollectionsKt.firstOrNull(this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl);
      }

      label46: {
         llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII var3 = (llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII)var5;
         var5 = var3;
         if (var2 != null) {
            if (var3 == null) {
               short var10 = 22955;
               short var12 = -30860;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§cNo failsafes registered");
               return;
            }

            var5 = var3.a();
            short var14 = 22948;
            short var15 = -26761;
            var15 = 22937;
            short var10004 = 11843;
            var5 = "§eSimulating failsafe via " + var5 + ": " + var1;
            if (var2 == null) {
               break label46;
            }

            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c((String)var5);
            var3.a(var1);
            var5 = var3;
         }

         if (((llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII)var5).b()) {
            return;
         }

         short var9 = 22940;
         short var10001 = -28935;
         var5 = "§7(suppressed — no macro activity detected)";
      }

      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c((String)var5);
   }

   public final void f(@NotNull String var1) {
      String[] var10000 = llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII.g();
      short var10002 = 22935;
      short var10003 = 31052;
      Intrinsics.checkNotNullParameter(var1, "reason");
      String[] var2 = var10000;
      IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII var10 = this;
      if (var2 != null) {
         if (!this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll) {
            this.ag();
         }

         var10 = this;
      }

      Iterable var4 = var10.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      boolean var5 = false;
      Iterator var6 = var4.iterator();

      label44:
      while (true) {
         if (var6.hasNext()) {
            Object var7 = var6.next();
            var10000 = (String[])var7;

            while (true) {
               llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII var8 = (llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII)(Object)var10000;
               boolean var9 = false;
               String var12 = var8.a();
               short var10001 = 22936;
               var10002 = -3264;
               if (!Intrinsics.areEqual(var12, "PowderFailsafe")) {
                  continue label44;
               }

               var10000 = (String[])var7;
               if (var2 != null) {
                  break label44;
               }
            }
         }

         var10000 = null;
         break;
      }

      llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII var3 = (llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII)(Object)var10000;
      llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII var13 = var3;
      if (var2 != null) {
         if (var3 == null) {
            short var15 = 22974;
            short var17 = -11241;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§cNo failsafes registered");
            return;
         }

         var3.a(var1);
         var13 = var3;
      }

      if (!var13.b()) {
         short var14 = 22961;
         short var16 = -29521;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
            "§7(suppressed — no macro activity detected)"
         );
      }

      if (var2 == null) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[2]
         );
      }
   }

   public final void aG() {
      IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var1 = IllIIlIIlIlIlIIIlIlIllIlllIIIllIIIIlllIllIlIIIlIllIIIlIlIlIIIIIIIlllIIIIlIIIIIIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(
            IllIIlIIlIlIlIIIlIlIllIlllIIIllIIIIlllIllIlIIIlIllIIIlIlIlIIIIIIIlllIIIIlIIIIIIlIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         );
      if (var1 != null) {
         short var10000 = 22951;
         short var10001 = -12965;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("DISABLING CURRENT MACRO");
      }
   }

   @SubscribeEvent
   public final void a(@NotNull llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII var1) {
      Object var25 = null; // PX-FIX
      Object var22 = null; // PX-FIX
      Object var21 = null; // PX-FIX
      String[] var2;
      IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII var19;
      String[] var10000 = llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII.g();
      short var10002 = 22942;
      short var10003 = -25419;
      Intrinsics.checkNotNullParameter(var1, "event");
      var2 = var10000;
      var19 = this;
      label153:
      if (var2 != null) {
         label151:
         if (this.ap().screen instanceof ChatScreen) {
            label157: {
               boolean var20 = IIllIlllllIlllIIIlIIllIIlllIllllIllIIIIllIIIIIllIIlIlIlllllIlIIIllIlIllllIIIIlllIIIII.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                  .ae();
               if (var2 != null) {
                  if (!var20) {
                     break label151;
                  }

                  var21 = lIlIllIIlIlllllIIlIllIIllIlllIlllllIlIIlllllIllIIIllIIlllIIIllIlIIIIllllllIlIllIIIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  if (var2 == null) {
                     break label157;
                  }

                  var20 = lIlIllIIlIlllllIIlIllIIllIlllIlllllIlIIlllllIllIIIllIIlllIIIllIlIIIIllllllIlIllIIIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a();
               }

               if (!var20) {
                  break label151;
               }

               var21 = lIlIllIIlIlllllIIlIllIIllIlllIlllllIlIIlllllIllIIIllIIlllIIIllIlIIIIllllllIlIllIIIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            }

            String var3 = ((me.octo.client.PXDyn)var21).b();
            short var10001 = 22967;
            var10002 = 15308;
            var22 = Intrinsics.areEqual(var3, "AccidentalChat");
            label137:
            if (var2 != null) {
               if (!(me.octo.client.PxTruth.truth(var22))) {
                  var10001 = 22938;
                  var10002 = -27197;
                  var22 = Intrinsics.areEqual(var3, "SendChat");
                  if (var2 == null) {
                     break label137;
                  }

                  if (!(me.octo.client.PxTruth.truth(var22))) {
                     var22 = false;
                     break label137;
                  }
               }

               var22 = true;
            }

            boolean var4 =(me.octo.client.PxTruth.truth(var22));
            var19 = llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
            if (var2 == null) {
               break label153;
            }

            label129:
            if (llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.aA()) {
               boolean var23 = var4;
               if (var2 != null) {
                  if (var4) {
                     break label129;
                  }

                  var23 = lIlIIIIIIlllIllIlIlIlIIIIIlIlllllllIIIIIIlIlIIllIlIllIllIIIIIIIlIIIIIllIllllIIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .e()
                     .al();
               }

               label122: {
                  label121: {
                     if (var2 != null) {
                        if (!var23) {
                           break label121;
                        }

                        var23 = false;
                     }

                     IIIllIIlllIlIlllllllIlIllIIIlIllllIIIllllllIlllllIIlIlIIllIlIIIIlllIIllllIlllIlIIlIIl.a(var23);
                     if (var2 != null) {
                        break label122;
                     }
                  }

                  lIlIllIIlIlllllIIlIllIIllIlllIlllllIlIIlllllIllIIIllIIlllIIIllIlIIIIllllllIlIllIIIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .d();
               }

               this.d(false);
               short var24 = 22968;
               var10001 = -4423;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.f(
                  "DISABLED REACTIONS DUE TO OPENING CHAT"
               );
            }
         }

         var19 = this;
      }

      Iterable var5 = var19.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      Iterator var6 = var5.iterator();

      label110:
      while (true) {
         if (var6.hasNext()) {
            Object var7 = var6.next();
            var25 = var7;

            while (true) {
               llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII var8 = (llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII)var25;
               boolean var9 = false;
               if (!var8.b()) {
                  continue label110;
               }

               var25 = var7;
               if (var2 != null) {
                  break label110;
               }
            }
         }

         var25 = null;
         break;
      }

      label166: {
         llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII var10 = (llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII)var25;
         if (var2 != null) {
            if (var10 == null) {
               break label166;
            }

            this.aG();
            this.ah();
         }

         boolean var26 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI
            .aT();
         if (var2 != null) {
            label92:
            if (var26) {
               String var27 = var10.a().toLowerCase(Locale.ROOT);
               var10002 = 22928;
               var10003 = 32067;
               Intrinsics.checkNotNullExpressionValue(var27, "toLowerCase(...)");
               CharSequence var13 = var27;
               var10002 = 22972;
               var10003 = 27977;
               Regex var15 = new Regex("[^a-z0-9]+");
               String var18 = "_";
               String var11 = var15.replace(var13, var18);
               String var14 = var10.a();
               int var28 = ((lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI
                  .aU()) ? 1 : 0);
               if (var2 != null) {
                  if (var28 == 0) {
                     short var29 = 22957;
                     short var37 = 9119;
                     MutableComponent var30 = Component.literal("§e§l[CLIP NOW]");
                     Style var38 = Style.EMPTY;
                     int var10004 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI
                        .aV();
                     short var10005 = 22947;
                     short var10006 = 14200;
                     Style var39 = var38.withClickEvent(new RunCommand("/clip " + var10004));
                     short var56 = 22944;
                     var10005 = -18142;
                     MutableComponent var31 = var30.setStyle(var39.withHoverEvent(new ShowText(Component.literal("§7Save a clip of the failsafe"))));
                     var10002 = 22934;
                     var10003 = -20528;
                     Intrinsics.checkNotNullExpressionValue(var31, "setStyle(...)");
                     MutableComponent var17 = var31;
                     if (var2 != null) {
                        LocalPlayer var32 = Minecraft.getInstance().player;
                        if (var32 != null) {
                           var10002 = 22952;
                           var10003 = -26764;
                           var10003 = 22945;
                           var56 = 25144;
                           var32.sendSystemMessage(Component.literal("§c[Failsafe] §7" + var14 + " triggered. ").append(var17));
                        }
                     }
                     break label92;
                  }

                  var28 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI
                     .aV();
               }

               int var16 = var28;
               me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(10000L, null);
            }

            short var33 = 22954;
            short var40 = 22740;
            var40 = 22935;
            var10002 = 31052;
            me.octo.client.utils.lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.a(
               "failsafe_triggered", MapsKt.mapOf(TuplesKt.to("reason", var10.a())), true, true
            );
            var26 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
               .ae();
         }

         if (var2 != null) {
            if (var26) {
               llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                  .a();
            }

            var26 = IIllIlllllIlllIIIlIIllIIlllIllllIllIIIIllIIIIIllIIlIlIlllllIlIIIllIlIllllIIIIlllIIIII.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
               .ae();
         }

         label83:
         if (var26) {
            label81: {
               String var49 = llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a();
               var10003 = 22930;
               short var58 = -30531;
               File var12 = new File(var49, "config/recordings/record.json");
               boolean var34 = lIlIIIIIIlllIllIlIlIlIIIIIlIlllllllIIIIIIlIlIIllIlIllIllIIIIIIIlIIIIIllIllllIIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .e()
                  .al();
               if (var2 != null) {
                  if (!var34) {
                     break label81;
                  }

                  var34 = IIIllIIlllIlIlllllllIlIllIIIlIllllIIIllllllIlllllIIlIlIIllIlIIIIlllIIllllIlllIlIIlIIl.a(var12);
               }

               if (var34) {
                  IIIllIIlllIlIlllllllIlIllIIIlIllllIIIllllllIlllllIIlIlIIllIlIIIIlllIIllllIlllIlIIlIIl.a();
                  if (var2 != null) {
                     break label83;
                  }
               }
            }

            lIlIllIIlIlllllIIlIllIIllIlllIlllllIlIIlllllIllIIIllIIlllIIIllIlIIIIllllllIlIllIIIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .c();
         }
      }

      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII.b(new String[5]);
      }
   }

   private static final Unit a(int var0, String var1) {
      short var10004 = 22929;
      short var10005 = -21380;
      lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI
         .a(var0, true, "failsafe_" + var1);
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[46];
      int var3 = 0;
      String var2 = "\u001cz\u000f\u0080e|m\u0092\u00adÄ\n§\u00adí:\u009e\t\u0084¼þîö\u0086<\fU&ù0)\u007f@\u0011ÞW\u001dý\u009aø&»Ríí\u0010\u0004¤héÙ\r\bA3Åq§\u0003eYÐ^\u0082ªÌ\t¢À:anw/27\u0019tH\u001a1ú\u0019\u0083\u0014Z<\u0093â\u0081\u001c-çmÿ\u0013ÜË\u0017úÇ_\u0010¤áq\u0087¾\u000fÛ?´¬)ªÉL¶ª\nl²U¶\u0083µñMà\u0015\u0012+ò\u00983¥\u0003¼¸\u0006S\u0012\u0011^\u009e\f\\wÿ\u0013ßÛG\u008f\u0010\u0082Z\u0085\u0007¶\u009bKNµ\u009e\u0082:\u000eû\u0011K¨eÒ¥?pø8ì@dò\"*4ä\u0013\u0004ÛC2v\u0002Ý\tz==}¾Ñ\u0002\u0006Iã\u001f+ý·M\fï7Ï\u001eé\u0005ßÆY¨‣\u001a\u0015P?>;\u0090Sû.\u0082Yð¹\u0099\u0093§Qõ\u0081\u000b§D5+\u0017bö+2-Ú\u0093¢\u0088úe/\rdV'\u0018´ÿ\u009b\u0019¬X[\u009b\u0012¸þ\u0083₺íPü+\u0006ZP\u0013^9&ã\u0097\u007f\\S\u000e\u0014x\u00011UÜµÒ\u007fE¹?¦o\u0010\u001f~ÕÏ\u008c\u008d\u0094£ ü» \u009b\rü\u0082\u00051î\u0003SÃ\u0012\u0087Cº\u0011~y-ó[JõÄ>\"Ý¶\u009eÖ\u00199Ñ³\u0002Ï\u007f%Ø\u008e¥\tÑÒzG+ fºïþq\\\u000b\u008b\u000fs¯ïä² î×V\bºèeÕK\u001dÁ\u0096=K\u0098ù\u0018\"tÉùv¤ï«Ùö!b3\u0090Q8\u0094ß÷\b¾\u0012\u0012t©bï»k\u009aö\u0005õóÇB@\u008b\u0083\u0083\u0000\u0013UÁ8sDq,ã\u0099\u0019[Ø+e°\u0090\u001f1Õ\u0006¿\u001f#\u0001X\u0088\u000e\"[9\u00961«Ããæµ\u0090Ã\u0019\u001a\t3\u009f4\u0016ÇÍb\u0088\u0085\u0006Dö§à{£\u001d &\u008d,àv\u001d\u0092¬õ\u0085Æú%ºí|;Ý#g?¢\u00ad-\u009cþq\u0003\fÚÛ\u0084°ÕîÍÐ\u001eË|¯\u000e¸k³Ó\u0094;\u0084Î|qà°¼§\u0017\u001dQµSÓ\u0094 í8\u0093³\u001dÔ\u00973¯V\nGÿÖ0µ\u001a\u009f\u0082z¨\u0005ÿ\u0095±,\u009bINq½\u009f\u007f[\u0080õ°\u000fhUÉ+C\u0013\u0001\u000f\u0092!dÛ\u009fß¼ý(Dvö\u001bâj\u007f{\bí¶c#\u0092?\u0081\u0002\u0010ÜµâHÀ9úîèc¢S¸s\u0098M\u000e\u0099D\u00976\u0010\u0087\u0014Yn\u0083¢îôl\u0002Òà\u0005\u0091\u0086\u0017^A\u0012\u001c\u000eÍ¼\u0094ÈtÁ+\bK\u0088í¯£\u0003Ud+YcÙ\u0096}d\u009dt£H\u0096op\u009d ¼±\u0084«¤©Ã\u0001\u0091dÏ\u0010Y\u0090¬¶\u0001õ!\u0015\u00915\u0017gA]/¿\u0010ÓîA)§Xa\t]3\u0014Yn2Be\u001dY!Ã\u0098¬\u0005g\u00adHc÷\u000fÃ-\n\u008d\u0018MrÝ\u0088égR¦Ö\u0097\u000bu\r3ÂÎ\u0088o\u0082V,k\u001e6\u0018ß\u0010s\u009dQ\u0006\u0086ü¢á\u0002í0\u0096:HvÀ\t\u0013[(\u0012,\u0019gÿ\u0012";
      int var4 = "\u001cz\u000f\u0080e|m\u0092\u00adÄ\n§\u00adí:\u009e\t\u0084¼þîö\u0086<\fU&ù0)\u007f@\u0011ÞW\u001dý\u009aø&»Ríí\u0010\u0004¤héÙ\r\bA3Åq§\u0003eYÐ^\u0082ªÌ\t¢À:anw/27\u0019tH\u001a1ú\u0019\u0083\u0014Z<\u0093â\u0081\u001c-çmÿ\u0013ÜË\u0017úÇ_\u0010¤áq\u0087¾\u000fÛ?´¬)ªÉL¶ª\nl²U¶\u0083µñMà\u0015\u0012+ò\u00983¥\u0003¼¸\u0006S\u0012\u0011^\u009e\f\\wÿ\u0013ßÛG\u008f\u0010\u0082Z\u0085\u0007¶\u009bKNµ\u009e\u0082:\u000eû\u0011K¨eÒ¥?pø8ì@dò\"*4ä\u0013\u0004ÛC2v\u0002Ý\tz==}¾Ñ\u0002\u0006Iã\u001f+ý·M\fï7Ï\u001eé\u0005ßÆY¨‣\u001a\u0015P?>;\u0090Sû.\u0082Yð¹\u0099\u0093§Qõ\u0081\u000b§D5+\u0017bö+2-Ú\u0093¢\u0088úe/\rdV'\u0018´ÿ\u009b\u0019¬X[\u009b\u0012¸þ\u0083₺íPü+\u0006ZP\u0013^9&ã\u0097\u007f\\S\u000e\u0014x\u00011UÜµÒ\u007fE¹?¦o\u0010\u001f~ÕÏ\u008c\u008d\u0094£ ü» \u009b\rü\u0082\u00051î\u0003SÃ\u0012\u0087Cº\u0011~y-ó[JõÄ>\"Ý¶\u009eÖ\u00199Ñ³\u0002Ï\u007f%Ø\u008e¥\tÑÒzG+ fºïþq\\\u000b\u008b\u000fs¯ïä² î×V\bºèeÕK\u001dÁ\u0096=K\u0098ù\u0018\"tÉùv¤ï«Ùö!b3\u0090Q8\u0094ß÷\b¾\u0012\u0012t©bï»k\u009aö\u0005õóÇB@\u008b\u0083\u0083\u0000\u0013UÁ8sDq,ã\u0099\u0019[Ø+e°\u0090\u001f1Õ\u0006¿\u001f#\u0001X\u0088\u000e\"[9\u00961«Ããæµ\u0090Ã\u0019\u001a\t3\u009f4\u0016ÇÍb\u0088\u0085\u0006Dö§à{£\u001d &\u008d,àv\u001d\u0092¬õ\u0085Æú%ºí|;Ý#g?¢\u00ad-\u009cþq\u0003\fÚÛ\u0084°ÕîÍÐ\u001eË|¯\u000e¸k³Ó\u0094;\u0084Î|qà°¼§\u0017\u001dQµSÓ\u0094 í8\u0093³\u001dÔ\u00973¯V\nGÿÖ0µ\u001a\u009f\u0082z¨\u0005ÿ\u0095±,\u009bINq½\u009f\u007f[\u0080õ°\u000fhUÉ+C\u0013\u0001\u000f\u0092!dÛ\u009fß¼ý(Dvö\u001bâj\u007f{\bí¶c#\u0092?\u0081\u0002\u0010ÜµâHÀ9úîèc¢S¸s\u0098M\u000e\u0099D\u00976\u0010\u0087\u0014Yn\u0083¢îôl\u0002Òà\u0005\u0091\u0086\u0017^A\u0012\u001c\u000eÍ¼\u0094ÈtÁ+\bK\u0088í¯£\u0003Ud+YcÙ\u0096}d\u009dt£H\u0096op\u009d ¼±\u0084«¤©Ã\u0001\u0091dÏ\u0010Y\u0090¬¶\u0001õ!\u0015\u00915\u0017gA]/¿\u0010ÓîA)§Xa\t]3\u0014Yn2Be\u001dY!Ã\u0098¬\u0005g\u00adHc÷\u000fÃ-\n\u008d\u0018MrÝ\u0088égR¦Ö\u0097\u000bu\r3ÂÎ\u0088o\u0082V,k\u001e6\u0018ß\u0010s\u009dQ\u0006\u0086ü¢á\u0002í0\u0096:HvÀ\t\u0013[(\u0012,\u0019gÿ\u0012"
         .length();
      char var1 = 16;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 13;
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
                     case 0 -> 83;
                     case 1 -> 108;
                     case 2 -> 79;
                     case 3 -> 121;
                     case 4 -> 91;
                     case 5 -> 88;
                     default -> 94;
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
                     g = new String[46];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
                     llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII();
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

                  var2 = "^T\u009cÿ´Ó.\n°\u0098ú\u007fñ\u0006X\u009fh¦\u0086Ë";
                  var4 = "^T\u009cÿ´Ó.\n°\u0098ú\u007fñ\u0006X\u009fh¦\u0086Ë".length();
                  var1 = '\r';
                  var8 = -1;
            }

            var10000 = 24;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 22970) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 223;
            case 1 -> 54;
            case 2 -> 157;
            case 3 -> 14;
            case 4 -> 31;
            case 5 -> 121;
            case 6 -> 44;
            case 7 -> 89;
            case 8 -> 255;
            case 9 -> 201;
            case 10 -> 135;
            case 11 -> 52;
            case 12 -> 120;
            case 13 -> 68;
            case 14 -> 133;
            case 15 -> 38;
            case 16 -> 160;
            case 17 -> 109;
            case 18 -> 77;
            case 19 -> 235;
            case 20 -> 118;
            case 21 -> 106;
            case 22 -> 241;
            case 23 -> 55;
            case 24 -> 58;
            case 25 -> 116;
            case 26 -> 67;
            case 27 -> 208;
            case 28 -> 188;
            case 29 -> 2;
            case 30 -> 182;
            case 31 -> 230;
            case 32 -> 195;
            case 33 -> 225;
            case 34 -> 70;
            case 35 -> 125;
            case 36 -> 143;
            case 37 -> 210;
            case 38 -> 92;
            case 39 -> 239;
            case 40 -> 99;
            case 41 -> 165;
            case 42 -> 138;
            case 43 -> 156;
            case 44 -> 203;
            case 45 -> 234;
            case 46 -> 57;
            case 47 -> 0;
            case 48 -> 252;
            case 49 -> 59;
            case 50 -> 224;
            case 51 -> 80;
            case 52 -> 184;
            case 53 -> 69;
            case 54 -> 181;
            case 55 -> 146;
            case 56 -> 253;
            case 57 -> 248;
            case 58 -> 63;
            case 59 -> 228;
            case 60 -> 221;
            case 61 -> 129;
            case 62 -> 246;
            case 63 -> 25;
            case 64 -> 23;
            case 65 -> 74;
            case 66 -> 216;
            case 67 -> 84;
            case 68 -> 136;
            case 69 -> 238;
            case 70 -> 192;
            case 71 -> 215;
            case 72 -> 76;
            case 73 -> 197;
            case 74 -> 193;
            case 75 -> 30;
            case 76 -> 98;
            case 77 -> 81;
            case 78 -> 29;
            case 79 -> 86;
            case 80 -> 161;
            case 81 -> 218;
            case 82 -> 194;
            case 83 -> 174;
            case 84 -> 183;
            case 85 -> 162;
            case 86 -> 83;
            case 87 -> 237;
            case 88 -> 124;
            case 89 -> 243;
            case 90 -> 66;
            case 91 -> 47;
            case 92 -> 37;
            case 93 -> 8;
            case 94 -> 127;
            case 95 -> 254;
            case 96 -> 1;
            case 97 -> 200;
            case 98 -> 179;
            case 99 -> 5;
            case 100 -> 43;
            case 101 -> 170;
            case 102 -> 185;
            case 103 -> 180;
            case 104 -> 85;
            case 105 -> 24;
            case 106 -> 222;
            case 107 -> 142;
            case 108 -> 53;
            case 109 -> 100;
            case 110 -> 45;
            case 111 -> 151;
            case 112 -> 93;
            case 113 -> 62;
            case 114 -> 236;
            case 115 -> 158;
            case 116 -> 115;
            case 117 -> 144;
            case 118 -> 88;
            case 119 -> 40;
            case 120 -> 232;
            case 121 -> 113;
            case 122 -> 175;
            case 123 -> 79;
            case 124 -> 196;
            case 125 -> 159;
            case 126 -> 73;
            case 127 -> 139;
            case 128 -> 35;
            case 129 -> 186;
            case 130 -> 28;
            case 131 -> 33;
            case 132 -> 148;
            case 133 -> 82;
            case 134 -> 167;
            case 135 -> 94;
            case 136 -> 137;
            case 137 -> 41;
            case 138 -> 164;
            case 139 -> 16;
            case 140 -> 141;
            case 141 -> 87;
            case 142 -> 34;
            case 143 -> 247;
            case 144 -> 207;
            case 145 -> 102;
            case 146 -> 60;
            case 147 -> 178;
            case 148 -> 107;
            case 149 -> 153;
            case 150 -> 172;
            case 151 -> 163;
            case 152 -> 119;
            case 153 -> 65;
            case 154 -> 46;
            case 155 -> 123;
            case 156 -> 226;
            case 157 -> 202;
            case 158 -> 206;
            case 159 -> 117;
            case 160 -> 90;
            case 161 -> 213;
            case 162 -> 3;
            case 163 -> 171;
            case 164 -> 212;
            case 165 -> 231;
            case 166 -> 4;
            case 167 -> 214;
            case 168 -> 132;
            case 169 -> 229;
            case 170 -> 112;
            case 171 -> 91;
            case 172 -> 71;
            case 173 -> 209;
            case 174 -> 56;
            case 175 -> 233;
            case 176 -> 12;
            case 177 -> 249;
            case 178 -> 211;
            case 179 -> 227;
            case 180 -> 155;
            case 181 -> 240;
            case 182 -> 49;
            case 183 -> 105;
            case 184 -> 199;
            case 185 -> 36;
            case 186 -> 173;
            case 187 -> 176;
            case 188 -> 168;
            case 189 -> 198;
            case 190 -> 72;
            case 191 -> 219;
            case 192 -> 250;
            case 193 -> 17;
            case 194 -> 190;
            case 195 -> 130;
            case 196 -> 191;
            case 197 -> 13;
            case 198 -> 51;
            case 199 -> 169;
            case 200 -> 9;
            case 201 -> 131;
            case 202 -> 39;
            case 203 -> 110;
            case 204 -> 251;
            case 205 -> 128;
            case 206 -> 205;
            case 207 -> 11;
            case 208 -> 149;
            case 209 -> 104;
            case 210 -> 154;
            case 211 -> 152;
            case 212 -> 19;
            case 213 -> 48;
            case 214 -> 27;
            case 215 -> 75;
            case 216 -> 61;
            case 217 -> 21;
            case 218 -> 42;
            case 219 -> 189;
            case 220 -> 140;
            case 221 -> 134;
            case 222 -> 242;
            case 223 -> 64;
            case 224 -> 204;
            case 225 -> 6;
            case 226 -> 177;
            case 227 -> 220;
            case 228 -> 147;
            case 229 -> 95;
            case 230 -> 217;
            case 231 -> 15;
            case 232 -> 187;
            case 233 -> 101;
            case 234 -> 245;
            case 235 -> 150;
            case 236 -> 114;
            case 237 -> 10;
            case 238 -> 166;
            case 239 -> 18;
            case 240 -> 126;
            case 241 -> 103;
            case 242 -> 78;
            case 243 -> 96;
            case 244 -> 22;
            case 245 -> 122;
            case 246 -> 50;
            case 247 -> 111;
            case 248 -> 26;
            case 249 -> 108;
            case 250 -> 7;
            case 251 -> 32;
            case 252 -> 97;
            case 253 -> 20;
            case 254 -> 145;
            default -> 244;
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
      public final IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII a() {
         return IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      }
       public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker var1) { this(); }
   }
}
