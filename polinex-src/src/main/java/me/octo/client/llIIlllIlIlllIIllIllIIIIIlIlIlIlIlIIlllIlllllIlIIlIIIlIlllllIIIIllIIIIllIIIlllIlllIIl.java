package me.octo.client;

import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.ClickEvent.SuggestCommand;
import org.jetbrains.annotations.NotNull;

@lIIlllllIIIlllIIIllIIlllIllllllIIIIIlllllIIlIIIIIIIlllIlIlIIlIlllIIlIIlIIlIIlllIIlllI
public final class llIIlllIlIlllIIllIllIIIIIlIlIlIlIlIIlllIlllllIlIIlIIIlIlllllIIIIllIIIIllIIIlllIlllIIl
   implements lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl {
   private static String[] a;
   private static String[] b;

   @NotNull
   @Override
   public IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI a() {
      String[] var1 = IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.c();
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      short var10001 = 19409;
      short var10002 = 32082;
      var10002 = 19359;
      short var10003 = -18095;
      var10000 = var10000.a("irc", "IRC chat commands");
      var10001 = 19392;
      var10002 = 14755;
      var10000 = var10000.a("polinexirc").b((kotlin.jvm.functions.Function1) (var5 -> a(this, (llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII) var5)));
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var11 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      var10002 = 19364;
      var10003 = 24270;
      var10003 = 19341;
      short var10004 = 29805;
      var10000 = var10000.a(var11.a("join", "Connect to IRC").a((kotlin.jvm.functions.Function1) (var5 -> a(this, (llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII) var5))).a());
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var12 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      var10002 = 19389;
      var10003 = -27731;
      var10003 = 19342;
      var10004 = -11582;
      var10000 = var10000.a(
         var12.a("leave", "Disconnect from IRC").a((kotlin.jvm.functions.Function1) (var5 -> b(this, (llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII) var5))).a()
      );
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var13 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      var10002 = 19411;
      var10003 = -12638;
      var10003 = 19358;
      var10004 = 29241;
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var14 = var13.a(
         "nickname", "Change IRC nickname"
      );
      var10002 = 19400;
      var10003 = 30809;
      var10000 = var10000.a(var14.a("nick").a((kotlin.jvm.functions.Function1) (var5 -> c(this, (llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII) var5))).a());
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var15 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      var10002 = 19414;
      var10003 = 10002;
      var10003 = 19378;
      var10004 = -21473;
      var10000 = var10000.a(var15.a("help", "Show IRC help").a((kotlin.jvm.functions.Function1) (var5 -> d(this, (llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII) var5))).a());
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var16 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      var10002 = 19413;
      var10003 = 10313;
      var10003 = 19334;
      var10004 = -4694;
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var17 = var16.a(
         "chatmode", "Toggle IRC chat mode"
      );
      var10002 = 19360;
      var10003 = 31862;
      var10000 = var10000.a(var17.a("irc").a((t) -> f(this, (llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII)t)).a());
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var18 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      var10002 = 19374;
      var10003 = 3442;
      var10003 = 19356;
      var10004 = -9396;
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI var9 = var10000.a(
            var18.a("prefix", "Change IRC command prefix").a((t) -> g(this, (llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII)t)).a()
         )
         .a();
      if (var1 == null) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[4]
         );
      }

      return var9;
   }

   private final void a(String[] var1) {
      Object var12 = null; // PX-FIX
      String[] var2 = IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.c();
      int var10000 = ((me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.f()) ? 1 : 0);
      if (var2 != null) {
         if (var10000 != 0) {
            short var18 = 19335;
            short var27 = -29375;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "§cYou're already connected to IRC!"
            );
            return;
         }

         var10000 = var1.length;
      }

      if (var2 != null) {
         var10000 = var10000 == 0 ? 1 : 0;
      }

      if (var10000 != 0) {
         short var6 = ((short)((me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.k()) ? 1 : 0));
         if (var2 != null) {
            if ((var6 != 0)) {
               var6 = 19396;
               short var10001 = 2964;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§7Connecting to IRC...");
            }

            me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a(null, null);
         }

         if (var2 != null) {
            return;
         }
      }

      label85: {
         label84: {
            label98: {
               var10000 = var1.length;
               short var19 = 1;
               if (var2 != null) {
                  if (var10000 == 1) {
                     String var9 = var1[0].toLowerCase(Locale.ROOT);
                     short var10002 = 19336;
                     short var10003 = 11849;
                     Intrinsics.checkNotNullExpressionValue(var9, "toLowerCase(...)");
                     String var3 = var9;
                     if (var2 != null) {
                        if (this.c(var3)) {
                           short var10 = 19412;
                           var19 = -14827;
                           me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                              "§7Connecting to IRC..."
                           );
                           me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a(var3, null);
                           if (var2 != null) {
                              return;
                           }
                        }

                        short var11 = 19394;
                        var19 = 30806;
                        me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                           "§cInvalid nickname type. Valid: discord, discord-nickname, polinex-username, custom"
                        );
                     }

                     if (var2 != null) {
                        return;
                     }
                  }

                  var10000 = var1.length;
                  if (var2 == null) {
                     break label98;
                  }

                  var19 = 2;
               }

               if (var10000 < var19) {
                  break label84;
               }

               var12 = var1[0].toLowerCase(Locale.ROOT);
               short var28 = 19336;
               short var32 = 11849;
               Intrinsics.checkNotNullExpressionValue(var12, "toLowerCase(...)");
               if (var2 == null) {
                  break label85;
               }

               var19 = 19367;
               var28 = 14765;
               var10000 = ((Intrinsics.areEqual(var12, "custom")) ? 1 : 0);
            }

            if (var10000 != 0) {
               label72: {
                  String var4;
                  label71: {
                     var4 = this.a(var1, 1);
                     String var13 = var4;
                     if (var2 != null) {
                        if (var4.length() >= 3) {
                           var10000 = var4.length();
                           if (var2 == null) {
                              break label72;
                           }

                           if (var10000 <= 30) {
                              break label71;
                           }
                        }

                        short var15 = 19363;
                        short var23 = -32565;
                        var13 = "§cCustom nickname must be 3-30 characters long!";
                     }

                     me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(var13);
                     if (var2 != null) {
                        return;
                     }
                  }

                  short var16 = 19412;
                  short var24 = -14827;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§7Connecting to IRC...");
                  var16 = 19367;
                  var24 = 14765;
                  me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a("custom", var4);
               }

               if (var2 != null) {
                  return;
               }
            }
         }

         var12 = llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .p();
      }

      String var5 =((String)( var12));
      short var26 = 19390;
      short var30 = -29224;
      var30 = 19331;
      short var33 = -20061;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
         "§cUsage: ." + var5 + " join [discord|discord-nickname|polinex-username|custom <nickname>]"
      );
   }

   private final void b() {
      String[] var1 = IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.c();
      short var10000 = ((short)((me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.f()) ? 1 : 0));
      if (var1 != null) {
         if ((var10000 == 0)) {
            var10000 = 19407;
            short var4 = -23695;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "§cYou're not connected to IRC!"
            );
            return;
         }

         var10000 = ((short)((me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a()) ? 1 : 0));
      }

      if (var1 != null) {
         if ((var10000 != 0)) {
            me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a(false);
         }

         var10000 = 19405;
         short var10001 = 1284;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§7Disconnecting from IRC...");
         me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.c();
      }
   }

   public final void c() {
      label29: {
         String[] var1 = IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.c();
         short var10000 = ((short)((me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a()) ? 1 : 0));
         if (var1 != null) {
            if ((var10000 != 0)) {
               me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a(false);
               var10000 = 19329;
               short var10001 = -12865;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                  "§cIRC chat mode disabled. Messages will now go to normal chat."
               );
               if (var1 != null) {
                  break label29;
               }
            }

            var10000 = ((short)((me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.f()) ? 1 : 0));
         }

         label20: {
            if (var1 != null) {
               if ((var10000 == 0)) {
                  break label20;
               }

               var10000 = 1;
            }

            me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a(var10000 != 0);
            var10000 = 19354;
            String var2 = llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .p();
            short var6 = -25773;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "§aIRC chat mode enabled. All messages will now go to IRC chat."
            );
            var6 = 19372;
            short var10002 = -13544;
            var10002 = 19362;
            short var10003 = 3660;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "§7Use §f/" + var2 + " chatmode§7 again to disable."
            );
            if (var1 != null) {
               break label29;
            }
         }

         String var3 = llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .p();
         short var8 = 19384;
         short var10 = -16998;
         var10 = 19406;
         short var12 = 9245;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
            "§cYou must connect to IRC first! Use §f/" + var3 + " join"
         );
      }

      lIIIlIllIIllIIlllIIIIIIlllIIIlIlIllIIllIlIIIIIllIlIllllIlIlIlIIllIIlIllIlIlIllllllIll.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
         .ag();
   }

   private final void b(String[] var1) {
      Object var12 = null; // PX-FIX
      String var3 = llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .p();
      String[] var2 = IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.c();
      int var10000 = var1.length;
      if (var2 != null) {
         var10000 = var10000 == 0 ? 1 : 0;
      }

      if (var10000 != 0) {
         String var4 = me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.g();
         String var7 = var4;
         if (var2 != null) {
            if (var4 != null) {
               this.a(var4);
               if (var2 != null) {
                  return;
               }
            }

            short var8 = 19371;
            short var10001 = 13051;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§cNo IRC nickname set!");
            var10001 = 19397;
            short var10002 = 19746;
            var10002 = 19345;
            short var10003 = 27625;
            var7 = "§7Usage: ." + var3 + " nickname <discord|discord-nickname|polinex-username|custom <n>>";
         }

         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(var7);
         if (var2 != null) {
            return;
         }
      }

      label76: {
         label75: {
            label91: {
               var10000 = var1.length;
               short var18 = 1;
               if (var2 != null) {
                  if (var10000 == 1) {
                     String var10 = var1[0].toLowerCase(Locale.ROOT);
                     short var25 = 19336;
                     short var30 = 11849;
                     Intrinsics.checkNotNullExpressionValue(var10, "toLowerCase(...)");
                     String var5 = var10;
                     if (var2 != null) {
                        if (this.c(var5)) {
                           me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.b(var5, null);
                           if (var2 != null) {
                              return;
                           }
                        }

                        short var11 = 19365;
                        var18 = 24739;
                        me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                           "§cInvalid nickname type. Valid: discord, discord-nickname, polinex-username, custom"
                        );
                     }

                     if (var2 != null) {
                        return;
                     }
                  }

                  var10000 = var1.length;
                  if (var2 == null) {
                     break label91;
                  }

                  var18 = 2;
               }

               if (var10000 < var18) {
                  break label75;
               }

               var12 = var1[0].toLowerCase(Locale.ROOT);
               short var26 = 19336;
               short var31 = 11849;
               Intrinsics.checkNotNullExpressionValue(var12, "toLowerCase(...)");
               if (var2 == null) {
                  break label76;
               }

               var18 = 19367;
               var26 = 14765;
               var10000 = ((Intrinsics.areEqual(var12, "custom")) ? 1 : 0);
            }

            if (var10000 != 0) {
               label63: {
                  String var6;
                  label62: {
                     var6 = this.a(var1, 1);
                     String var13 = var6;
                     if (var2 != null) {
                        if (var6.length() >= 3) {
                           var10000 = var6.length();
                           if (var2 == null) {
                              break label63;
                           }

                           if (var10000 <= 30) {
                              break label62;
                           }
                        }

                        short var15 = 19375;
                        short var21 = 24779;
                        var13 = "§cCustom nickname must be 3-30 characters long!";
                     }

                     me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(var13);
                     if (var2 != null) {
                        return;
                     }
                  }

                  short var16 = 19367;
                  short var22 = 14765;
                  me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.b("custom", var6);
               }

               if (var2 != null) {
                  return;
               }
            }
         }

         short var23 = 19390;
         short var28 = -29224;
         var28 = 19386;
         short var32 = 26623;
         var12 = "§cUsage: ." + var3 + " nickname <discord|discord-nickname|polinex-username|custom <n>>";
      }

      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(String.valueOf(var12));
   }

   private final void c(String[] var1) {
      String[] var2 = IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.c();
      String[] var10000 = var1;
      if (var2 != null) {
         if (var1.length != 1) {
            String var4 = llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .p();
            short var11 = 19370;
            short var13 = -17743;
            var13 = 19369;
            short var15 = -16090;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "§cUsage: ." + var4 + " prefix <new_prefix>"
            );
            return;
         }

         var10000 = var1;
      }

      String var5 = var10000[0].toLowerCase(Locale.ROOT);
      short var10002 = 19395;
      short var10003 = -3288;
      Intrinsics.checkNotNullExpressionValue(var5, "toLowerCase(...)");
      String var3 = var5;
      String var6 = var3;
      if (var2 != null) {
         if (var3.length() > 10) {
            short var8 = 19343;
            short var10 = -7128;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "§cPrefix too long! Maximum 10 characters."
            );
            return;
         }

         llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c(var3);
         short var10001 = 19332;
         var10002 = 14229;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
            "§aIRC prefix changed to: §f." + var3
         );
         short var7 = 19355;
         var10001 = -24160;
         var6 = "§7Command updated successfully!";
      }

      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(var6);
   }

   private final void a(String var1) {
      String[] var2 = IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.c();
      if (var2 != null) {
         LocalPlayer var10000 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a()
            .player;
         if (var10000 != null) {
            LocalPlayer var3 = var10000;
            short var10 = 19399;
            String var4 = llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .p();
            short var10001 = 5122;
            MutableComponent var5 = me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.b(
               var1,
               me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.i(),
               me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.j()
            );
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a(
               "§aCurrent IRC nickname: ", var5
            );
            short var11 = 19373;
            var10001 = 7956;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "§7Click to change your nickname:"
            );
            short var10003 = 19404;
            short var10004 = -11418;
            String var13 = "." + var4 + " nickname discord";
            short var10002 = 19344;
            var10003 = -8043;
            MutableComponent var6 = this.a(var13, "Use Discord username");
            var3.sendSystemMessage(var6);
            var10003 = 19348;
            var10004 = 24461;
            String var14 = "." + var4 + " nickname discord-nickname";
            var10002 = 19352;
            var10003 = 3431;
            MutableComponent var7 = this.a(var14, "Use Discord display name");
            var3.sendSystemMessage(var7);
            var10003 = 19393;
            var10004 = -26976;
            String var15 = "." + var4 + " nickname polinex-username";
            var10002 = 19340;
            var10003 = -7333;
            MutableComponent var8 = this.a(var15, "Use Polinex username");
            var3.sendSystemMessage(var8);
            var10003 = 19368;
            var10004 = 3664;
            String var16 = "." + var4 + " nickname custom ";
            var10002 = 19333;
            var10003 = -3674;
            MutableComponent var9 = this.a(var16, "Use custom nickname");
            var3.sendSystemMessage(var9);
            return;
         }
      }
   }

   private final void d() {
      this.e();
   }

   private final void e() {
      short var10000 = 19388;
      String[] var10001 = IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.c();
      String var2 = llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .p();
      String[] var1 = var10001;
      short var14 = -16910;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("IRC basic commands");
      short var10003 = 19337;
      short var10004 = -32439;
      this.b("." + var2 + " help - Shows this help menu");
      var10003 = 19351;
      var10004 = -11188;
      this.b("." + var2 + " join - Connect to IRC");
      var10003 = 19417;
      var10004 = -9327;
      this.b("." + var2 + " leave - Disconnect from IRC");
      var10003 = 19391;
      var10004 = 15166;
      this.b("." + var2 + " irc - Toggle IRC chat mode");
      var10003 = 19398;
      var10004 = 13669;
      this.b("." + var2 + " prefix <new_prefix> - Change IRC command prefix");
      var10000 = 19383;
      short var15 = -10594;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("IRC messaging");
      var10003 = 19387;
      var10004 = -14529;
      this.b("." + var2 + " <message> - Send message to IRC chat");
      short var16 = 19376;
      short var10002 = 22422;
      this.b("Messages are limited to 150 characters");
      var10000 = 19328;
      short var17 = 23594;
      String var7 = "IRC chat mode";
      if (var1 != null) {
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("IRC chat mode");
         short var18 = 19382;
         var10002 = 14687;
         this.b("When enabled, all regular chat messages go to IRC");
         var10002 = 19402;
         var10003 = 15166;
         var10003 = 19377;
         var10004 = -22666;
         this.b("Use §f/" + var2 + " chatmode§7 to toggle this mode");
         if (me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.f()) {
            String var3 = me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.g();
            String var8 = var3;
            String var19 = var3;
            if (var1 != null) {
               if (var3 == null) {
                  var10000 = 19418;
                  short var20 = 651;
                  var8 = "Unknown";
               }

               var19 = me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.i();
            }

            MutableComponent var4 = me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.b(
               var8, var19, me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.j()
            );
            var10000 = 19347;
            short var21 = 709;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a(
               "§aCurrently connected as: ", var4
            );
            if (var1 != null) {
               if (me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a()) {
                  var10000 = 19361;
                  short var22 = -18966;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                     "§aIRC chat mode: §fENABLED"
                  );
                  if (var1 != null) {
                     return;
                  }
               }

               var10000 = 19357;
               short var23 = 32137;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                  "§cIRC chat mode: §fDISABLED"
               );
            }

            if (var1 != null) {
               return;
            }
         }

         var10000 = 19330;
         short var24 = -8563;
         var7 = "§cNot connected to IRC";
      }

      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(var7);
   }

   private final void b(String var1) {
      short var10001 = 19380;
      short var10002 = -18699;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§7" + var1);
   }

   private final void d(String[] var1) {
      String[] var2 = IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.c();
      if (!me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.f()) {
         String var4 = llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .p();
         short var9 = 19401;
         short var10002 = -10656;
         var10002 = 19385;
         short var10003 = -11674;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
            "§cYou must connect to IRC first! Use §f/" + var4 + " join"
         );
      } else {
         String var3 = this.a(var1, 0);
         int var10000 = StringsKt.trim(var3).toString().length();
         if (var2 != null) {
            var10000 = var10000 == 0 ? 1 : 0;
         }

         if (var10000 != 0) {
            short var7 = 19346;
            short var8 = -28239;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§cMessage cannot be empty!");
         } else {
            var10000 = var3.length();
            if (var2 != null) {
               if (var10000 > 150) {
                  short var6 = 19366;
                  short var10001 = -15024;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                     "§cMessage too long! Maximum 150 characters."
                  );
                  return;
               }

               me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a(var3);
            }
         }
      }
   }

   private final boolean c(String var1) {
      String[] var2 = new String[4];
      short var10002 = 19415;
      short var10003 = -19003;
      var2[0] = "discord";
      var10002 = 19339;
      var10003 = 8343;
      var2[1] = "discord-nickname";
      var10002 = 19353;
      var10003 = 6729;
      var2[2] = "polinex-username";
      var10002 = 19408;
      var10003 = -9546;
      var2[3] = "custom";
      return CollectionsKt.listOf(var2).contains(var1);
   }

   private final String a(String[] var1, int var2) {
      return var2 >= var1.length ? "" : CollectionsKt.joinToString(ArraysKt.drop(var1, var2), " ", null, null, 0, null, null);
   }

   private final MutableComponent a(String var1, String var2) {
      short var10002 = 19349;
      short var10003 = 27348;
      var10003 = 19416;
      short var10004 = 29348;
      MutableComponent var10000 = Component.literal("§b" + var1 + " §7- " + var2)
         .withStyle((java.util.function.UnaryOperator<net.minecraft.network.chat.Style>)null);
      var10002 = 19350;
      var10003 = 10499;
      Intrinsics.checkNotNullExpressionValue(var10000, "withStyle(...)");
      return var10000;
   }

   private static final Unit a(
      llIIlllIlIlllIIllIllIIIIIlIlIlIlIlIIlllIlllllIlIIlIIIlIlllllIIIIllIIIIllIIIlllIlllIIl var0,
      llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var1
   ) {
      String[] var10000 = IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.c();
      short var10002 = 19338;
      short var10003 = 9098;
      Intrinsics.checkNotNullParameter(var1, "context");
      String[] var2 = var10000;
      String[] var3 = var1.c();
      int var4 = var3.length;
      if (var2 != null) {
         var4 = var4 == 0 ? 1 : 0;
      }

      if (var4 != 0) {
         var0.d();
         if (var2 != null) {
            return Unit.INSTANCE;
         }
      }

      var0.d(var3);
      return Unit.INSTANCE;
   }

   private static final Unit b(
      llIIlllIlIlllIIllIllIIIIIlIlIlIlIlIIlllIlllllIlIIlIIIlIlllllIIIIllIIIIllIIIlllIlllIIl var0,
      llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var1
   ) {
      short var10001 = 19338;
      short var10002 = 9098;
      Intrinsics.checkNotNullParameter(var1, "context");
      var0.a(var1.c());
      return Unit.INSTANCE;
   }

   private static final Unit c(
      llIIlllIlIlllIIllIllIIIIIlIlIlIlIlIIlllIlllllIlIIlIIIlIlllllIIIIllIIIIllIIIlllIlllIIl var0,
      llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var1
   ) {
      short var10001 = 19379;
      short var10002 = -14293;
      Intrinsics.checkNotNullParameter(var1, "<unused var>");
      var0.b();
      return Unit.INSTANCE;
   }

   private static final Unit d(
      llIIlllIlIlllIIllIllIIIIIlIlIlIlIlIIlllIlllllIlIIlIIIlIlllllIIIIllIIIIllIIIlllIlllIIl var0,
      llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var1
   ) {
      short var10001 = 19338;
      short var10002 = 9098;
      Intrinsics.checkNotNullParameter(var1, "context");
      var0.b(var1.c());
      return Unit.INSTANCE;
   }

   private static final Unit e(
      llIIlllIlIlllIIllIllIIIIIlIlIlIlIlIIlllIlllllIlIIlIIIlIlllllIIIIllIIIIllIIIlllIlllIIl var0,
      llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var1
   ) {
      short var10001 = 19381;
      short var10002 = 12610;
      Intrinsics.checkNotNullParameter(var1, "<unused var>");
      var0.d();
      return Unit.INSTANCE;
   }

   private static final Unit f(
      llIIlllIlIlllIIllIllIIIIIlIlIlIlIlIIlllIlllllIlIIlIIIlIlllllIIIIllIIIIllIIIlllIlllIIl var0,
      llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var1
   ) {
      short var10001 = 19381;
      short var10002 = 12610;
      Intrinsics.checkNotNullParameter(var1, "<unused var>");
      var0.c();
      return Unit.INSTANCE;
   }

   private static final Unit g(
      llIIlllIlIlllIIllIllIIIIIlIlIlIlIlIIlllIlllllIlIIlIIIlIlllllIIIIllIIIIllIIIlllIlllIIl var0,
      llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var1
   ) {
      short var10001 = 19410;
      short var10002 = 17802;
      Intrinsics.checkNotNullParameter(var1, "context");
      var0.c(var1.c());
      return Unit.INSTANCE;
   }

   private static final Style a(String var0, Style var1) {
      short var10001 = 19403;
      short var10002 = -5830;
      Intrinsics.checkNotNullParameter(var1, "style");
      return var1.withClickEvent(new SuggestCommand(var0));
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[91];
      int var3 = 0;
      String var2 = "¦SÅf6\b\u0003là(cg\u0003>:Øor\bþâïßÞ¢\u008a\u0097^iî²¤\u000b9µz\u0010øÑ\u0011\u0014ÈiNc\u0087\u0082\u0080\u0012\u0006â\u0007@ç\u000f\u001cIÌåæÑ¢ÚòZ'®Í\u0000¾\u0011¸\\M\\B\u0016\u009b<\\Ó¾På=0yô)«ä\u0097\u0098\\l\u0097Î/\u0086CÝ±ÂLre\u001d\u0090\u0017»ñÃË5EÇ\u0000Wá\u0010ê\u0098¡§áò\u009b\u0094h±\u0017¾\u009dÃ\nï#î\u008bÿû¯½w\"\u0087LP\u009eÜ¸Õ\u008c\u000e\u008eÈQ¾Ê#°\u008dÚ\u0003\u009e¬s\u001c-=\u008d\u008cT!z\u000e¹©£!\u0098\u009b#ð]\u0000«g7\f@s\u009er\u0019\u0098\u0013\u0004É(0ißú(À \u008e|\u0014äÑ\u0010oø\u0003\u0014)á®íôÛô\u0087\u0005á¬²Q\u0093GòM!ËK\"º\u001ao\u0017,Ï\u0087#\u0001þ\\&\u00872!\u009fÞòV·\u008dL\u009c\u0006Í\u0098Ø$,³|4j7\u0010³\u0085òi*B\u0005¾\u0010½\u001eD¬ ,+\u001cøxl2ò\u000f¦\u0099âM>}¾½Â\u0016ùà\u009dáYI\u007fÚÈÜ?\u008c\u0007\u0001\u0092s\u0090n\u0018Û\u0010\u0004\u0082)C\u0091\u009d\u007fÞ\u0084\bdèeÑ\u001eÿ\u0014ÚDó\u0081!ó¹éU.Eê\"¡\u0086¶E¿ W\u000e\u0088\u009ff+Ì-\u008fö\u0092§¼ùi·\u0013§\u008ayB\u009b¡4\u008e«^n\u0091\u0013\\OÄRÚ¯)Æ~é\u0086Ä\u0002\u0093îûì\u0000Î*\u009crñ\u0099\u0088^Ñ%Úms¨\u0005fú¤\u0085óÈÖ\u0086]ó\u007f&S¸ð\u0014Òsòg\u0015)¶~I\u0080ûÊj¥\u008f6d¯\u0084U@Ï?\u0086\u00139\u008bëÃ¸ªÖÓ\u0080JKÖ&\bB\u0005yGå¨õ5'\u008by\\2Þç\u009d\u007fs»ÀQ5-,\u0002\u008cp^v,Â¤{\u008eç½ò`\u008d\u0093\u0014ä¸^9*\u001a\"öh\u0080\\\"\\BNÑW¹\u0003¿ÐÍ\u008a\u0015Ö$Ý±ï°Î\u000b\u001aoFÏÄf¹>\u0019\u0097ÞEÜ\u0015{¿n\u00039\u001bÅV-®À\u0096ã\u001aYuTZc¢ æÑ\u000e£JgÅâ(\u0088 QmAþ¤\u008an¿\u00028W\u000eX\\Ô\u0093õëU\u0097t\t]äæõ\u00160Ò\u007f Åè\u009de\u0095ÕÃ\u00906y\u0007í\\Â\u0097\u001b/<\u0018ö:vN\u0085\f¤Ú\u000b\u0014³Xrí©dv§\u0090\u0011\u0081\u001b\u0013y\u0010\u00adÓ\u0095¥û\u001d\u000f;\u000e®K|Fyzê>¹\u0007\u001fË\u0006É#\tç\u0002¥\u0011w-u\u00800nh\u0084\u0087§\u0098!ïH=§\u001a\u009505zR\u009e\u001eÆ\u0018\u0086\u0088\u00ad\u0092\b0xækª\u008d\u0082ª)»(\u0089\u008du\u0014ÐØÍð\u001fàA>¢G3â´\u0098'ºv`zì\u008a1\u008c{HºÍÐ÷\u0094Cr\u0005\u0085ÕB\u0019eÏÔÆv\u0096Î.BÔD\u0014KKú%Ã¹='Z\u0083üây\u001bh\u0080%yA\u009fËÃú[\u0006:\u0003Hû6¤(\u0010\u009aJ°\u0085_¡b=\u0013\u0095IÊ\u0016µ\u008c¶mM¼¥\u0014qé}±úÌ±\u0011\u0089: K\u008a\u00ad\u0094Ø\u0012°=²À\\ÊO»\u0003\u009f®æ\u001axÙ'\u0010\u0001²Ãfûï&¬\u0007\u009a{l´c\u0012ò\r\u008e\u0089ÆJ\u009f\u001d0\u0081xjØå%d®ñ\u001f\u008bÛ\u0099+<t×\u009f9\u0082½ð\u001e\u000fzH¯º/Êc{\"ñcç\u0087³l\u000f\u008bF»ÓT`^n\u0012Õ\u0091j\u00988ÛuÙ´nÑ¬°sª>çÌ¢×fMÁ\u000f\u00850ô\u0004PõvfSDý êÄ\u0017çº\u0094\u0001 «Lñ\u0094´n\u008aëd\u008bz¯-(ÞÈ\u0080AxdóS»Z,ÔÊH\u008fI\u0097\u0018\u0084\u0016Öy´\u0095l¾\u007fÌHvl\u009a\u008c\u0088|\u009c\u0015ÓQ¶Ã\u0006¼³\u0082e\u001aÃ¹\u0096S\u0090Ü®ÕN\u000eÖ+Ë UJû{¨iÐ´\u0093\u001boj\u007fëR¬\u000e¶\"ï5ë\u0088\u008a4\u0001\u000bÜt\u001c\u001dGf\u0083\r\u001d¬\u000f\u0095ðÜ\u0006|ÎÁB\u008cW\u0011Çû\u0087\u008b\u0019\u0098ï¡8æ\u0099KÇmö×N\u0014D\u0081ì\u001f\u0001ËYa\u008dT[\u0098uQ\u0014Üê\u000fI\u0013\nÌ1\u00adní?>*Ã$\u00164\u008b©%TçW£?\u0003\u009eft\u0006\u0095ã¨¨iÜï\u000f\t\u0010\u007f6y\u009a\u009a\u0096mC ÃVZCÏb}\u001f0\u009aètÙKL®}JÙ\u008a³Ý`Ûu}\te:\u008f]?\u0006ñ(\u0017k\u00847/Ç\u0084ÚÞÅüatc\u0012\u0015D\u0005B»km¹Ïîá\u000eìkè¥o\u0016÷\u0097¹\u0093½\u0094\u000bÂÓS$$¶3ÛÀÆÉ\u009c&\u007f J\u009aó¡ý°»X\u0015å6²÷7áfÛÚ9»\u0081\u009f·$Y\u009c\u00022\u001cei{¿y\u0092§\u001fÐ\u0090dH[¡Uì àÞ©öÕx¡v\u009díÜø&OºN\u0087%+\u0093,§\rïs\u0099HWQ7u3ß\u00134S\f\u0011ÍÅ#®R\u0007ß\u0093\u008c\u008c$\u0002é\u0006\f\u008b\u0001\u0096ºÄaJ¹:@¹½1ì=w\u0098Á]Ù\u007f\u0017ü\u009dÜÞøoºþ¢\u008a\u009d¡s>æ`wÛ\tiÝr\u0018É8(\u0007\u0092ú\u009ep!îóÆ\u00076í85\r&ÕÕ¶:\u001f_%zì_¾@(5¤\u009eÀ\u00122_kµð¿A4â\u0016w0gïê\u001dû\u0085;§\u00991Õ\u0082`*\u0004YX×í*á3\u0086\u0005\u0016\u0018»y]@{\u00ad\u0010AëÁ±\u008aó\u0083¿ö\u00adîîB\u0092\u009aÔW«\r¿á¾\u001cN®Tø\u0097JS\u000fé!i\u008a\u000b|f\u0005k©]úÓ¸v6íÜ5÷¨)Æº}Á\u0095ú\u009c¾%EÑÓÐ\u000f(6\u0003\u0003ç½î;\u00adZ\u000fÔVÙ\u0003#¦õ\u009c¢þa?\u008aÁ\u0015/\\%l¶q\u0012#Eu¤!YÒsÉ8a\u008aÆ\u0015\u0005á»Ø\u0005¡¶\u0086]>\n\u0004%´ìÎoZ Oe\u001b:@#\u001b¾Éx\u0099©¸ä6ú¬£\u000eeÍ\"}\u0081Â°ýiÝB\nAø\bÀH±yêÇH\u001aB672\u000f¯-G`:\u0081Êª\u0019¦ï=-cÖyÉeVV$Sq{\u0006:\u0010\r}ùÇiJ¦\u0001P=\u0080[\fM´_`5n{¶¢\u008d\fÙÍÇf=üü\u0000ÐÒÌ\u001aÿr\u0089[wÐ\u0080 ê\u0018¯\u0018Rì/ÉäâqÑ´ze\u0083E lg\u0098ÿY\u0090Ñü^Ý}\u0007á{\u0088p\u0010\u000ehEÔÜõÛHËce\u009fÃ[ÁD\u0016óÚ\\Ñ\b^lwÝº\u001b²h\u0002:w¾¬2+èÜ\nÝP\u008f\u009c©a¶áÒ]0xHk&ñìG\u0085NÈ#\u000bz#õ\u0092ÖÆÎ*%íMDÑ\u0004¹\u0001\u008df\u0003\u008e\u0085aS\u001bå¾)¿\u0084ßt@§f\u0092\u0096\u0018È\u0000;\fø í:íö:nì^¤kfvk!\bp\u0016Õ\u0004^H9\u0012(Ñ¯\u0002¡\u0081\u001e-îû@vW\r 1/Ôls\u008b\u008e×÷¾é)øÃ»¢\r\\½SK\u008c¹ÍA\u0003\u0007ª¹ý>\u0017\r5\u0005CÅ>\u001a2\u0011\u0016\u001b½\u0097^\u001b\u0007Ñ%è=\u0096´^\u0098[Ç\u001b·\u0014Ó\u000e\u0003n¹Ð6î2¦¨ëJ\u0013\u0096\u0000ÑÙ3ÎýÈ½Úú\u0005F\u0005±Ú\u001c\u001e¬\u000e\u00ad\u0095t\u009f\u008c)`°s\u0007DÒ¿Ö)(#0¥ä°2iZn\u0096\u0092\u0006\u0006ACfóxa\u0003ÛÍn\u0007\u0001psÌn\u0093Û\bb\u0001¾;p\u0088kE\u0016í\u001a\u009fÉp]c\u0017<¶'3ï2Êq lñ3\u0090ß\b\u009bÁ/\u001d\u0003¾oL\u0004o?Öj\u0007·º_D_}¦\u0005,\u00ad¤ÿ£";
      int var4 = "¦SÅf6\b\u0003là(cg\u0003>:Øor\bþâïßÞ¢\u008a\u0097^iî²¤\u000b9µz\u0010øÑ\u0011\u0014ÈiNc\u0087\u0082\u0080\u0012\u0006â\u0007@ç\u000f\u001cIÌåæÑ¢ÚòZ'®Í\u0000¾\u0011¸\\M\\B\u0016\u009b<\\Ó¾På=0yô)«ä\u0097\u0098\\l\u0097Î/\u0086CÝ±ÂLre\u001d\u0090\u0017»ñÃË5EÇ\u0000Wá\u0010ê\u0098¡§áò\u009b\u0094h±\u0017¾\u009dÃ\nï#î\u008bÿû¯½w\"\u0087LP\u009eÜ¸Õ\u008c\u000e\u008eÈQ¾Ê#°\u008dÚ\u0003\u009e¬s\u001c-=\u008d\u008cT!z\u000e¹©£!\u0098\u009b#ð]\u0000«g7\f@s\u009er\u0019\u0098\u0013\u0004É(0ißú(À \u008e|\u0014äÑ\u0010oø\u0003\u0014)á®íôÛô\u0087\u0005á¬²Q\u0093GòM!ËK\"º\u001ao\u0017,Ï\u0087#\u0001þ\\&\u00872!\u009fÞòV·\u008dL\u009c\u0006Í\u0098Ø$,³|4j7\u0010³\u0085òi*B\u0005¾\u0010½\u001eD¬ ,+\u001cøxl2ò\u000f¦\u0099âM>}¾½Â\u0016ùà\u009dáYI\u007fÚÈÜ?\u008c\u0007\u0001\u0092s\u0090n\u0018Û\u0010\u0004\u0082)C\u0091\u009d\u007fÞ\u0084\bdèeÑ\u001eÿ\u0014ÚDó\u0081!ó¹éU.Eê\"¡\u0086¶E¿ W\u000e\u0088\u009ff+Ì-\u008fö\u0092§¼ùi·\u0013§\u008ayB\u009b¡4\u008e«^n\u0091\u0013\\OÄRÚ¯)Æ~é\u0086Ä\u0002\u0093îûì\u0000Î*\u009crñ\u0099\u0088^Ñ%Úms¨\u0005fú¤\u0085óÈÖ\u0086]ó\u007f&S¸ð\u0014Òsòg\u0015)¶~I\u0080ûÊj¥\u008f6d¯\u0084U@Ï?\u0086\u00139\u008bëÃ¸ªÖÓ\u0080JKÖ&\bB\u0005yGå¨õ5'\u008by\\2Þç\u009d\u007fs»ÀQ5-,\u0002\u008cp^v,Â¤{\u008eç½ò`\u008d\u0093\u0014ä¸^9*\u001a\"öh\u0080\\\"\\BNÑW¹\u0003¿ÐÍ\u008a\u0015Ö$Ý±ï°Î\u000b\u001aoFÏÄf¹>\u0019\u0097ÞEÜ\u0015{¿n\u00039\u001bÅV-®À\u0096ã\u001aYuTZc¢ æÑ\u000e£JgÅâ(\u0088 QmAþ¤\u008an¿\u00028W\u000eX\\Ô\u0093õëU\u0097t\t]äæõ\u00160Ò\u007f Åè\u009de\u0095ÕÃ\u00906y\u0007í\\Â\u0097\u001b/<\u0018ö:vN\u0085\f¤Ú\u000b\u0014³Xrí©dv§\u0090\u0011\u0081\u001b\u0013y\u0010\u00adÓ\u0095¥û\u001d\u000f;\u000e®K|Fyzê>¹\u0007\u001fË\u0006É#\tç\u0002¥\u0011w-u\u00800nh\u0084\u0087§\u0098!ïH=§\u001a\u009505zR\u009e\u001eÆ\u0018\u0086\u0088\u00ad\u0092\b0xækª\u008d\u0082ª)»(\u0089\u008du\u0014ÐØÍð\u001fàA>¢G3â´\u0098'ºv`zì\u008a1\u008c{HºÍÐ÷\u0094Cr\u0005\u0085ÕB\u0019eÏÔÆv\u0096Î.BÔD\u0014KKú%Ã¹='Z\u0083üây\u001bh\u0080%yA\u009fËÃú[\u0006:\u0003Hû6¤(\u0010\u009aJ°\u0085_¡b=\u0013\u0095IÊ\u0016µ\u008c¶mM¼¥\u0014qé}±úÌ±\u0011\u0089: K\u008a\u00ad\u0094Ø\u0012°=²À\\ÊO»\u0003\u009f®æ\u001axÙ'\u0010\u0001²Ãfûï&¬\u0007\u009a{l´c\u0012ò\r\u008e\u0089ÆJ\u009f\u001d0\u0081xjØå%d®ñ\u001f\u008bÛ\u0099+<t×\u009f9\u0082½ð\u001e\u000fzH¯º/Êc{\"ñcç\u0087³l\u000f\u008bF»ÓT`^n\u0012Õ\u0091j\u00988ÛuÙ´nÑ¬°sª>çÌ¢×fMÁ\u000f\u00850ô\u0004PõvfSDý êÄ\u0017çº\u0094\u0001 «Lñ\u0094´n\u008aëd\u008bz¯-(ÞÈ\u0080AxdóS»Z,ÔÊH\u008fI\u0097\u0018\u0084\u0016Öy´\u0095l¾\u007fÌHvl\u009a\u008c\u0088|\u009c\u0015ÓQ¶Ã\u0006¼³\u0082e\u001aÃ¹\u0096S\u0090Ü®ÕN\u000eÖ+Ë UJû{¨iÐ´\u0093\u001boj\u007fëR¬\u000e¶\"ï5ë\u0088\u008a4\u0001\u000bÜt\u001c\u001dGf\u0083\r\u001d¬\u000f\u0095ðÜ\u0006|ÎÁB\u008cW\u0011Çû\u0087\u008b\u0019\u0098ï¡8æ\u0099KÇmö×N\u0014D\u0081ì\u001f\u0001ËYa\u008dT[\u0098uQ\u0014Üê\u000fI\u0013\nÌ1\u00adní?>*Ã$\u00164\u008b©%TçW£?\u0003\u009eft\u0006\u0095ã¨¨iÜï\u000f\t\u0010\u007f6y\u009a\u009a\u0096mC ÃVZCÏb}\u001f0\u009aètÙKL®}JÙ\u008a³Ý`Ûu}\te:\u008f]?\u0006ñ(\u0017k\u00847/Ç\u0084ÚÞÅüatc\u0012\u0015D\u0005B»km¹Ïîá\u000eìkè¥o\u0016÷\u0097¹\u0093½\u0094\u000bÂÓS$$¶3ÛÀÆÉ\u009c&\u007f J\u009aó¡ý°»X\u0015å6²÷7áfÛÚ9»\u0081\u009f·$Y\u009c\u00022\u001cei{¿y\u0092§\u001fÐ\u0090dH[¡Uì àÞ©öÕx¡v\u009díÜø&OºN\u0087%+\u0093,§\rïs\u0099HWQ7u3ß\u00134S\f\u0011ÍÅ#®R\u0007ß\u0093\u008c\u008c$\u0002é\u0006\f\u008b\u0001\u0096ºÄaJ¹:@¹½1ì=w\u0098Á]Ù\u007f\u0017ü\u009dÜÞøoºþ¢\u008a\u009d¡s>æ`wÛ\tiÝr\u0018É8(\u0007\u0092ú\u009ep!îóÆ\u00076í85\r&ÕÕ¶:\u001f_%zì_¾@(5¤\u009eÀ\u00122_kµð¿A4â\u0016w0gïê\u001dû\u0085;§\u00991Õ\u0082`*\u0004YX×í*á3\u0086\u0005\u0016\u0018»y]@{\u00ad\u0010AëÁ±\u008aó\u0083¿ö\u00adîîB\u0092\u009aÔW«\r¿á¾\u001cN®Tø\u0097JS\u000fé!i\u008a\u000b|f\u0005k©]úÓ¸v6íÜ5÷¨)Æº}Á\u0095ú\u009c¾%EÑÓÐ\u000f(6\u0003\u0003ç½î;\u00adZ\u000fÔVÙ\u0003#¦õ\u009c¢þa?\u008aÁ\u0015/\\%l¶q\u0012#Eu¤!YÒsÉ8a\u008aÆ\u0015\u0005á»Ø\u0005¡¶\u0086]>\n\u0004%´ìÎoZ Oe\u001b:@#\u001b¾Éx\u0099©¸ä6ú¬£\u000eeÍ\"}\u0081Â°ýiÝB\nAø\bÀH±yêÇH\u001aB672\u000f¯-G`:\u0081Êª\u0019¦ï=-cÖyÉeVV$Sq{\u0006:\u0010\r}ùÇiJ¦\u0001P=\u0080[\fM´_`5n{¶¢\u008d\fÙÍÇf=üü\u0000ÐÒÌ\u001aÿr\u0089[wÐ\u0080 ê\u0018¯\u0018Rì/ÉäâqÑ´ze\u0083E lg\u0098ÿY\u0090Ñü^Ý}\u0007á{\u0088p\u0010\u000ehEÔÜõÛHËce\u009fÃ[ÁD\u0016óÚ\\Ñ\b^lwÝº\u001b²h\u0002:w¾¬2+èÜ\nÝP\u008f\u009c©a¶áÒ]0xHk&ñìG\u0085NÈ#\u000bz#õ\u0092ÖÆÎ*%íMDÑ\u0004¹\u0001\u008df\u0003\u008e\u0085aS\u001bå¾)¿\u0084ßt@§f\u0092\u0096\u0018È\u0000;\fø í:íö:nì^¤kfvk!\bp\u0016Õ\u0004^H9\u0012(Ñ¯\u0002¡\u0081\u001e-îû@vW\r 1/Ôls\u008b\u008e×÷¾é)øÃ»¢\r\\½SK\u008c¹ÍA\u0003\u0007ª¹ý>\u0017\r5\u0005CÅ>\u001a2\u0011\u0016\u001b½\u0097^\u001b\u0007Ñ%è=\u0096´^\u0098[Ç\u001b·\u0014Ó\u000e\u0003n¹Ð6î2¦¨ëJ\u0013\u0096\u0000ÑÙ3ÎýÈ½Úú\u0005F\u0005±Ú\u001c\u001e¬\u000e\u00ad\u0095t\u009f\u008c)`°s\u0007DÒ¿Ö)(#0¥ä°2iZn\u0096\u0092\u0006\u0006ACfóxa\u0003ÛÍn\u0007\u0001psÌn\u0093Û\bb\u0001¾;p\u0088kE\u0016í\u001a\u009fÉp]c\u0017<¶'3ï2Êq lñ3\u0090ß\b\u009bÁ/\u001d\u0003¾oL\u0004o?Öj\u0007·º_D_}¦\u0005,\u00ad¤ÿ£"
         .length();
      char var1 = '\r';
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
                     case 0 -> 109;
                     case 1 -> 93;
                     case 2 -> 65;
                     case 3 -> 65;
                     case 4 -> 48;
                     case 5 -> 126;
                     default -> 115;
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
                     b = new String[91];
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

                  var2 = "Ý×ø~V_ÉCà¦U\u009d5Z\u008bzµ\u008býæ¸Æ\u000f\u008bG\u000e&y\u0007¸:\u0081\u008e¯½\u0082";
                  var4 = "Ý×ø~V_ÉCà¦U\u009d5Z\u008bzµ\u008býæ¸Æ\u000f\u008bG\u000e&y\u0007¸:\u0081\u008e¯½\u0082".length();
                  var1 = 28;
                  var8 = -1;
            }

            var10000 = 15;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 19328) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 78;
            case 1 -> 46;
            case 2 -> 97;
            case 3 -> 27;
            case 4 -> 5;
            case 5 -> 182;
            case 6 -> 133;
            case 7 -> 12;
            case 8 -> 2;
            case 9 -> 35;
            case 10 -> 132;
            case 11 -> 204;
            case 12 -> 239;
            case 13 -> 81;
            case 14 -> 100;
            case 15 -> 211;
            case 16 -> 102;
            case 17 -> 48;
            case 18 -> 118;
            case 19 -> 57;
            case 20 -> 226;
            case 21 -> 111;
            case 22 -> 36;
            case 23 -> 40;
            case 24 -> 244;
            case 25 -> 96;
            case 26 -> 159;
            case 27 -> 245;
            case 28 -> 216;
            case 29 -> 68;
            case 30 -> 184;
            case 31 -> 72;
            case 32 -> 22;
            case 33 -> 1;
            case 34 -> 236;
            case 35 -> 110;
            case 36 -> 127;
            case 37 -> 137;
            case 38 -> 18;
            case 39 -> 122;
            case 40 -> 23;
            case 41 -> 138;
            case 42 -> 228;
            case 43 -> 116;
            case 44 -> 86;
            case 45 -> 41;
            case 46 -> 151;
            case 47 -> 87;
            case 48 -> 33;
            case 49 -> 255;
            case 50 -> 210;
            case 51 -> 191;
            case 52 -> 220;
            case 53 -> 106;
            case 54 -> 52;
            case 55 -> 229;
            case 56 -> 47;
            case 57 -> 112;
            case 58 -> 14;
            case 59 -> 250;
            case 60 -> 243;
            case 61 -> 62;
            case 62 -> 145;
            case 63 -> 233;
            case 64 -> 6;
            case 65 -> 4;
            case 66 -> 157;
            case 67 -> 248;
            case 68 -> 224;
            case 69 -> 135;
            case 70 -> 139;
            case 71 -> 175;
            case 72 -> 103;
            case 73 -> 192;
            case 74 -> 187;
            case 75 -> 60;
            case 76 -> 93;
            case 77 -> 59;
            case 78 -> 42;
            case 79 -> 20;
            case 80 -> 230;
            case 81 -> 147;
            case 82 -> 94;
            case 83 -> 10;
            case 84 -> 156;
            case 85 -> 231;
            case 86 -> 212;
            case 87 -> 254;
            case 88 -> 55;
            case 89 -> 11;
            case 90 -> 222;
            case 91 -> 109;
            case 92 -> 45;
            case 93 -> 218;
            case 94 -> 83;
            case 95 -> 30;
            case 96 -> 77;
            case 97 -> 237;
            case 98 -> 54;
            case 99 -> 200;
            case 100 -> 25;
            case 101 -> 152;
            case 102 -> 90;
            case 103 -> 80;
            case 104 -> 213;
            case 105 -> 203;
            case 106 -> 130;
            case 107 -> 37;
            case 108 -> 89;
            case 109 -> 43;
            case 110 -> 31;
            case 111 -> 197;
            case 112 -> 125;
            case 113 -> 164;
            case 114 -> 241;
            case 115 -> 32;
            case 116 -> 253;
            case 117 -> 67;
            case 118 -> 217;
            case 119 -> 70;
            case 120 -> 155;
            case 121 -> 73;
            case 122 -> 49;
            case 123 -> 69;
            case 124 -> 227;
            case 125 -> 201;
            case 126 -> 134;
            case 127 -> 190;
            case 128 -> 44;
            case 129 -> 169;
            case 130 -> 177;
            case 131 -> 29;
            case 132 -> 115;
            case 133 -> 153;
            case 134 -> 235;
            case 135 -> 66;
            case 136 -> 53;
            case 137 -> 131;
            case 138 -> 75;
            case 139 -> 179;
            case 140 -> 38;
            case 141 -> 149;
            case 142 -> 219;
            case 143 -> 188;
            case 144 -> 206;
            case 145 -> 8;
            case 146 -> 240;
            case 147 -> 120;
            case 148 -> 101;
            case 149 -> 63;
            case 150 -> 196;
            case 151 -> 171;
            case 152 -> 185;
            case 153 -> 209;
            case 154 -> 214;
            case 155 -> 92;
            case 156 -> 193;
            case 157 -> 160;
            case 158 -> 232;
            case 159 -> 84;
            case 160 -> 249;
            case 161 -> 108;
            case 162 -> 136;
            case 163 -> 176;
            case 164 -> 161;
            case 165 -> 13;
            case 166 -> 167;
            case 167 -> 107;
            case 168 -> 158;
            case 169 -> 181;
            case 170 -> 50;
            case 171 -> 16;
            case 172 -> 74;
            case 173 -> 3;
            case 174 -> 144;
            case 175 -> 51;
            case 176 -> 88;
            case 177 -> 123;
            case 178 -> 180;
            case 179 -> 141;
            case 180 -> 56;
            case 181 -> 26;
            case 182 -> 71;
            case 183 -> 0;
            case 184 -> 189;
            case 185 -> 207;
            case 186 -> 146;
            case 187 -> 247;
            case 188 -> 194;
            case 189 -> 58;
            case 190 -> 91;
            case 191 -> 242;
            case 192 -> 82;
            case 193 -> 104;
            case 194 -> 142;
            case 195 -> 117;
            case 196 -> 9;
            case 197 -> 128;
            case 198 -> 166;
            case 199 -> 113;
            case 200 -> 186;
            case 201 -> 85;
            case 202 -> 39;
            case 203 -> 124;
            case 204 -> 28;
            case 205 -> 143;
            case 206 -> 195;
            case 207 -> 205;
            case 208 -> 126;
            case 209 -> 150;
            case 210 -> 246;
            case 211 -> 163;
            case 212 -> 162;
            case 213 -> 221;
            case 214 -> 154;
            case 215 -> 76;
            case 216 -> 7;
            case 217 -> 34;
            case 218 -> 252;
            case 219 -> 64;
            case 220 -> 148;
            case 221 -> 238;
            case 222 -> 21;
            case 223 -> 98;
            case 224 -> 24;
            case 225 -> 65;
            case 226 -> 199;
            case 227 -> 165;
            case 228 -> 223;
            case 229 -> 174;
            case 230 -> 61;
            case 231 -> 105;
            case 232 -> 17;
            case 233 -> 173;
            case 234 -> 168;
            case 235 -> 215;
            case 236 -> 225;
            case 237 -> 178;
            case 238 -> 79;
            case 239 -> 140;
            case 240 -> 234;
            case 241 -> 172;
            case 242 -> 251;
            case 243 -> 119;
            case 244 -> 198;
            case 245 -> 95;
            case 246 -> 19;
            case 247 -> 170;
            case 248 -> 202;
            case 249 -> 129;
            case 250 -> 183;
            case 251 -> 121;
            case 252 -> 99;
            case 253 -> 15;
            case 254 -> 114;
            default -> 208;
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
