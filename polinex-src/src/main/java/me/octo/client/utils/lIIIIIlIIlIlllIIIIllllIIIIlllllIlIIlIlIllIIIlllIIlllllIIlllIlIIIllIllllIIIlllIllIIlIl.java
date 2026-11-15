package me.octo.client.utils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import me.octo.client.IIlllllIlIIlIIIlIIIlIIIlIllllIIlllIllIllllllIIllIlllllllllllIIIllIIIIlIIIIIIlIIlIIIll;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.HoverEvent;
import net.minecraft.network.chat.HoverEvent.ShowText;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public final class lIIIIIlIIlIlllIIIIllllIIIIlllllIlIIlIlIllIIIlllIIlllllIIlllIlIIIllIllllIIIlllIllIIlIl {
   @NotNull
   public static lIIIIIlIIlIlllIIIIllllIIIIlllllIlIIlIlIllIIIlllIIlllllIIlllIlIIIllIllllIIIlllIllIIlIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Regex lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static Regex IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static Map<String, Integer> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static boolean IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private static HashMap<String, Long> IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static int llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static String[] a;
   private static String[] b;

   private lIIIIIlIIlIlllIIIIllllIIIIlllllIlIIlIlIllIIIlllIIlllllIIlllIlIIIllIllllIIIlllIllIIlIl() {
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI var1) {
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
      short var10002 = -14055;
      short var10003 = 2563;
      Intrinsics.checkNotNullParameter(var1, "event");
      String var2 = var10000;
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = false;
      CharSequence var3 = var1.l();
      short var10001 = -14078;
      var10002 = 23431;
      boolean var4 = StringsKt.contains(var3, "Sack", true);
      if (var2 != null) {
         if (!var4) {
            return;
         }

         var4 = true;
      }

      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI var1) {
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
      short var10002 = -14055;
      short var10003 = 2563;
      Intrinsics.checkNotNullParameter(var1, "event");
      String var2 = var10000;
      boolean var3 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      if (var2 != null) {
         if (!lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
            return;
         }

         var3 = false;
      }

      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var3;
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = System.currentTimeMillis();
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      short var10001 = -14055;
      short var10002 = 2563;
      Intrinsics.checkNotNullParameter(var1, "event");
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = false;
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = System.currentTimeMillis();
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
      short var10002 = -14076;
      short var10003 = -17881;
      Intrinsics.checkNotNullParameter(var1, "event");
      Packet var3 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      String var2 = var10000;
      boolean var9 = var3 instanceof ClientboundSystemChatPacket;
      if (var2 != null) {
         if (!var9) {
            return;
         }

         var9 = ((ClientboundSystemChatPacket)var3).overlay();
      }

      if (!var9) {
         IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var10 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         String var10001 = ((ClientboundSystemChatPacket)var3).content().getString();
         var10003 = -14074;
         short var10004 = -28525;
         Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
         String var4 = var10.a(var10001);
         boolean var11 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.containsMatchIn(var4);
         if (var2 != null) {
            if (var11) {
               long var5 = System.currentTimeMillis() + 1500L;

               for (String var8 : this.a().keySet()) {
                  IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.put(var8, var5);
                  if (var2 == null) {
                     break;
                  }
               }

               return;
            }

            var10000 = StringsKt.trimStart(var4).toString();
            short var13 = -14073;
            var10002 = 16137;
            var11 = StringsKt.startsWith(var10000, "[Sacks]", false);
         }

         if (var11) {
            Component var14 = ((ClientboundSystemChatPacket)var3).content();
            var10003 = -14065;
            var10004 = -26510;
            Intrinsics.checkNotNullExpressionValue(var14, "content(...)");
            this.a(var14);
         }
      }
   }

   private final void a(Component var1) {
      Integer var12 = null; // PX-FIX
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
      lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = System.currentTimeMillis();
      String var2 = var10000;
      int var15 =(( lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0);
      if (var2 != null) {
         if (lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
            return;
         }

         long var32;
         var15 = (var32 = System.currentTimeMillis() - IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII - 10000L) == 0L
            ? 0
            : (var32 < 0L ? -1 : 1);
      }

      if (var15 >= 0) {
         List var16 = var1.getSiblings();
         short var10002 = -14066;
         short var10003 = -31959;
         Intrinsics.checkNotNullExpressionValue(var16, "getSiblings(...)");
         Iterator var6 = var16.iterator();

         label85:
         while (true) {
            if (!var6.hasNext()) {
               var10000 = null;
               break;
            }

            var10000 = (String)var6.next();

            while (true) {
               label81: {
                  Component var7 = (Component)(Object)var10000;
                  boolean var8 = false;
                  if (var2 != null) {
                     lIIIIIlIIlIlllIIIIllllIIIIlllllIlIIlIlIllIIIlllIIlllllIIlllIlIIIllIllllIIIlllIllIIlIl var18 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                     Intrinsics.checkNotNull(var7);
                     var10000 = var18.b(var7);
                     if (var10000 != null) {
                        String var9 = var10000;
                        boolean var11 = false;
                        var10000 = var9;
                        if (var2 != null) {
                           short var10001 = -14067;
                           var10002 = -13320;
                           var10000 = StringsKt.startsWith(var9, "Added", false) ? var9 : null;
                        }
                        break label81;
                     }
                  }

                  var10000 = null;
               }

               String var13 = var10000;
               if (var13 == null) {
                  break;
               }

               var10000 = var13;
               if (var2 != null) {
                  break label85;
               }
            }
         }

         if (var10000 != null) {
            Object var3 = var10000;
            if (IIlllllIlIIlIIIlIIIlIIIlIllllIIlllIllIllllllIIllIlllllllllllIIIllIIIIlIIIIIIlIIlIIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               )
             {
               var10002 = -14077;
               var10003 = -6697;
               var10000 = StringsKt.replace((String)var3, "\n", " | ", false);
               short var24 = -14056;
               var10002 = -3427;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
                  "§b[SackHover]§r " + var10000
               );
            }

            Iterator var4 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.findAll((CharSequence)var3, 0)
               .iterator();

            label68:
            while (true) {
               int var22 = ((var4.hasNext()) ? 1 : 0);

               MatchResult var5;
               do {
                  if (var22 == 0) {
                     return;
                  }

                  var5 = (MatchResult)var4.next();
                  if (var2 == null) {
                     continue label68;
                  }

                  Integer var23 = StringsKt.toIntOrNull(StringsKt.replace((String)var5.getGroupValues().get(1), ",", "", false));
                  if (var23 == null) {
                     continue label68;
                  }

                  var12 = var23;
                  var22 = var12;
               } while (var2 == null);

               if (var12 > 0) {
                  String var14 = lIlIlllllllIIlIlIlllIIllIlllllIlllllllllIIlIlllIlIlIllIlIlIIlIlIIIllllllIIIlIIllllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a((String)var5.getGroupValues().get(2));
                  if (var2 != null) {
                     if (IIlllllIlIIlIIIlIIIlIIIlIllllIIlllIllIllllllIIllIlllllllllllIIIllIIIIlIIIIIIlIIlIIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        )
                      {
                        var10002 = -14053;
                        var10003 = 31267;
                        var10003 = -14069;
                        short var10004 = 11397;
                        me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
                           "§a[SackGain]§r " + var14 + " x" + var12
                        );
                     }

                     me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        .a(
                           new me.octo.client.events.impl.lIlIllIlllIlllIIllllllIIlIIlIllllIIlIIIIllIlIIIIlIIlIlllllIlIlllIIIlIIIlIlIlIlIllllII(
                              var14,
                              var12,
                              me.octo.client.events.impl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           )
                        );
                  }

                  if (var2 == null) {
                     return;
                  }
               }
            }
         }
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII var1) {
      Long var17 = null; // PX-FIX
      Object var13 = null; // PX-FIX
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
      short var10002 = -14055;
      short var10003 = 2563;
      Intrinsics.checkNotNullParameter(var1, "event");
      String var2 = var10000;
      if (me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m()) {
         if (lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .screen
            == null) {
            long var21;
            int var10 = (var21 = System.currentTimeMillis() - lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll - 3000L)
                  == 0L
               ? 0
               : (var21 < 0L ? -1 : 1);
            if (var2 != null) {
               if (var10 < 0) {
                  return;
               }

               long var22;
               var10 = (var22 = System.currentTimeMillis() - IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII - 1000L)
                     == 0L
                  ? 0
                  : (var22 < 0L ? -1 : 1);
            }

            if (var2 != null) {
               if (var10 < 0) {
                  return;
               }

               var10 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
            }

            int var3 = var10;
            llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var3 + 1;
            if (var3 % 5 == 0) {
               Map var9 = this.a();
               boolean var11 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
               if (var2 != null) {
                  if (IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
                     Iterator var4 = var9.entrySet().iterator();

                     label89:
                     while (true) {
                        int var12 = ((var4.hasNext()) ? 1 : 0);

                        while (var12 != 0) {
                           Entry var5 = (Entry)var4.next();
                           String var6 = (String)var5.getKey();
                           int var7 = ((Number)var5.getValue()).intValue();
                           if (var2 == null) {
                              return;
                           }

                           int var15;
                           label83: {
                              if (var2 != null) {
                                 Integer var10001 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.get(var6);
                                 if (var10001 != null) {
                                    var15 = var10001;
                                    break label83;
                                 }
                              }

                              var15 = 0;
                           }

                           int var8 = var7 - var15;
                           var12 = var8;
                           if (var2 != null) {
                              if (var8 <= 0) {
                                 continue label89;
                              }

                              label71: {
                                 var13 = System.currentTimeMillis();
                                 if (var2 != null) {
                                    Long var16 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.get(var6);
                                    if (var16 != null) {
                                       var17 = var16;
                                       break label71;
                                    }
                                 }

                                 var17 = 0L;
                              }

                              long var23;
                              int var14 = (var23 = (Long)var13 - var17) == 0L ? 0 : (var23 < 0L ? -1 : 1);
                              if (var2 != null) {
                                 if (var14 < 0) {
                                    continue label89;
                                 }

                                 var14 = ((IIlllllIlIIlIIIlIIIlIIIlIllllIIlllIllIllllllIIllIlllllllllllIIIllIIIIlIIIIIIlIIlIIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) ? 1 : 0);
                              }

                              if (var2 != null) {
                                 if (var14 != 0) {
                                    var10002 = -14079;
                                    var10003 = 9838;
                                    var10003 = -14068;
                                    short var10004 = 15814;
                                    me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
                                       "§e[InvGain]§r " + var6 + " x" + var8
                                    );
                                 }

                                 me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                                    .a(
                                       new me.octo.client.events.impl.lIlIllIlllIlllIIllllllIIlIIlIllllIIlIIIIllIlIIIIlIIlIlllllIlIlllIIIlIIIlIlIlIlIllllII(
                                          var6,
                                          var8,
                                          me.octo.client.events.impl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                                       )
                                    );
                              }

                              if (var2 != null) {
                                 continue label89;
                              }
                              break;
                           }
                        }

                        IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var9;
                        return;
                     }
                  }

                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var9;
                  var11 = true;
               }

               IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var11;
            }
         }
      }
   }

   private final Map<String, Integer> a() {
      Integer var14 = null; // PX-FIX
      String var1 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
      if (var1 != null
         && lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .player
            != null) {
         LocalPlayer var2 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .player;
         HashMap var3 = new HashMap();
         Inventory var10000 = var2.getInventory();
         short var10002 = -14072;
         short var10003 = -22995;
         Intrinsics.checkNotNullExpressionValue(var10000, "getInventory(...)");
         Inventory var4 = var10000;
         int var5 = 0;
         int var6 = var4.getContainerSize();

         while (var5 < var6) {
            ItemStack var11 = var4.getItem(var5);
            var10002 = -14071;
            var10003 = -21777;
            Intrinsics.checkNotNullExpressionValue(var11, "getItem(...)");
            ItemStack var7 = var11;
            if (var1 != null) {
               if (!var7.isEmpty()) {
                  String var12 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .g(var7);
                  if (var12 != null) {
                     String var8;
                     Map var9;
                     label34: {
                        var8 = var12;
                        var9 = var3;
                        if (var1 != null) {
                           Integer var13 = (Integer)var3.get(var8);
                           if (var13 != null) {
                              var14 = var13;
                              break label34;
                           }
                        }

                        var14 = 0;
                     }

                     Integer var10 = var14 + var7.getCount();
                     var9.put(var8, var10);
                  }
               }

               var5++;
            }

            if (var1 == null) {
               break;
            }
         }

         return var3;
      } else {
         return MapsKt.emptyMap();
      }
   }

   private final String b(Component var1) {
      String var2 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
      if (var2 != null) {
         HoverEvent var10000 = var1.getStyle().getHoverEvent();
         if (var10000 != null) {
            HoverEvent var3 = var10000;
            if (var3 instanceof ShowText) {
               IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var4 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
               String var10001 = ((ShowText)var3).value().getString();
               short var10003 = -14075;
               short var10004 = -28584;
               Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
               return var4.a(var10001);
            }

            return null;
         }
      }

      return null;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[19];
      int var3 = 0;
      String var2 = "Fjà¾sL-3È²¯u\u0011@® &qL<\u0004¹\u009bÌi\u0013\u0081:vR\u0002½7\u001cã¼\u00adùGr\u0096AªJ¤wd\u001eÝF¸Ü\u000eU\u0019\u000e£\u0010Ó\u0084`a\u0005TWP\u0014g\u0002\u0085?\fÊmï(Ú\u000f21\u0011ò\u0094}\u0010¡¨\u001cüñZÂWT\u001e)\u0081\u0088ç\u008f½\u000e÷ø!ì\u009b\u0015C -ðÏûãØ\u0018ºù\u0012«\u007f\u0002ý\u0014÷}Û\u008b´\u0007t(z\u0086U!;%Â\u000f\u0003\u008bP¢\u0004ÏÜtÎ\u000e>\u0001ïÉ\u0092ì\u0015\u0094\u0002Î\u0096;\u0089q\u0005¡rOëµ\u0007¥\u00922{\u0081\u008d¿\u000e\u0002hhäbI\u000b ÁXîé\u0086+\u0005À¡c\u00910";
      int var4 = "Fjà¾sL-3È²¯u\u0011@® &qL<\u0004¹\u009bÌi\u0013\u0081:vR\u0002½7\u001cã¼\u00adùGr\u0096AªJ¤wd\u001eÝF¸Ü\u000eU\u0019\u000e£\u0010Ó\u0084`a\u0005TWP\u0014g\u0002\u0085?\fÊmï(Ú\u000f21\u0011ò\u0094}\u0010¡¨\u001cüñZÂWT\u001e)\u0081\u0088ç\u008f½\u000e÷ø!ì\u009b\u0015C -ðÏûãØ\u0018ºù\u0012«\u007f\u0002ý\u0014÷}Û\u008b´\u0007t(z\u0086U!;%Â\u000f\u0003\u008bP¢\u0004ÏÜtÎ\u000e>\u0001ïÉ\u0092ì\u0015\u0094\u0002Î\u0096;\u0089q\u0005¡rOëµ\u0007¥\u00922{\u0081\u008d¿\u000e\u0002hhäbI\u000b ÁXîé\u0086+\u0005À¡c\u00910"
         .length();
      char var1 = '\f';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 28;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var26 = var10001.toCharArray();
               int var10004 = var26.length;
               int var6 = 0;
               byte var29 = var10000;
               var20 = var26;
               int var14 = var10004;
               byte var36;
               char[] var40;
               int var10006;
               if (var10004 <= 1) {
                  var40 = var26;
                  var36 = var10000;
                  var10006 = var6;
               } else {
                  var29 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var40 = var26;
                  var36 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var40[var10006] = (char)(var40[var10006] ^ var36 ^ switch (var6 % 7) {
                     case 0 -> 73;
                     case 1 -> 60;
                     case 2 -> 97;
                     case 3 -> 107;
                     case 4 -> 82;
                     case 5 -> 108;
                     default -> 1;
                  });
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var40 = var20;
                     var36 = var29;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var40 = var20;
                     var36 = var29;
                     var10006 = var6;
                  }
               }
            }

            String var31 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var31;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[19];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIIIIIlIIlIlllIIIIllllIIIIlllllIlIIlIlIllIIIlllIIlllllIIlllIlIIIllIllllIIIlllIllIIlIl();
                     var10002 = -14070;
                     short var32 = 3813;
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new Regex("([+-][\\d,]+) (.+?) \\((.+?)\\)");
                     var10002 = -14080;
                     short var33 = -9787;
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new Regex("Moved .+ from your Sacks");
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = MapsKt.emptyMap();
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new HashMap<>();
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var31;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "º]ÅèE\u0094\u0017ÃEÕqÜi\u0099¿\u008e\u000fr\u0018Ü#físãÇ å±k+\b";
                  var4 = "º]ÅèE\u0094\u0017ÃEÕqÜi\u0099¿\u008e\u000fr\u0018Ü#físãÇ å±k+\b".length();
                  var1 = 16;
                  var8 = -1;
            }

            var10000 = 125;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -14071) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 45;
            case 1 -> 184;
            case 2 -> 137;
            case 3 -> 20;
            case 4 -> 149;
            case 5 -> 197;
            case 6 -> 206;
            case 7 -> 176;
            case 8 -> 196;
            case 9 -> 32;
            case 10 -> 47;
            case 11 -> 24;
            case 12 -> 104;
            case 13 -> 29;
            case 14 -> 140;
            case 15 -> 73;
            case 16 -> 253;
            case 17 -> 173;
            case 18 -> 121;
            case 19 -> 123;
            case 20 -> 58;
            case 21 -> 187;
            case 22 -> 17;
            case 23 -> 170;
            case 24 -> 80;
            case 25 -> 199;
            case 26 -> 195;
            case 27 -> 75;
            case 28 -> 53;
            case 29 -> 21;
            case 30 -> 92;
            case 31 -> 60;
            case 32 -> 84;
            case 33 -> 109;
            case 34 -> 147;
            case 35 -> 161;
            case 36 -> 250;
            case 37 -> 148;
            case 38 -> 145;
            case 39 -> 13;
            case 40 -> 132;
            case 41 -> 23;
            case 42 -> 117;
            case 43 -> 56;
            case 44 -> 61;
            case 45 -> 130;
            case 46 -> 215;
            case 47 -> 156;
            case 48 -> 6;
            case 49 -> 133;
            case 50 -> 114;
            case 51 -> 180;
            case 52 -> 124;
            case 53 -> 188;
            case 54 -> 51;
            case 55 -> 100;
            case 56 -> 247;
            case 57 -> 157;
            case 58 -> 193;
            case 59 -> 72;
            case 60 -> 210;
            case 61 -> 15;
            case 62 -> 198;
            case 63 -> 14;
            case 64 -> 67;
            case 65 -> 81;
            case 66 -> 2;
            case 67 -> 219;
            case 68 -> 138;
            case 69 -> 52;
            case 70 -> 66;
            case 71 -> 68;
            case 72 -> 40;
            case 73 -> 127;
            case 74 -> 3;
            case 75 -> 241;
            case 76 -> 65;
            case 77 -> 9;
            case 78 -> 203;
            case 79 -> 59;
            case 80 -> 251;
            case 81 -> 79;
            case 82 -> 122;
            case 83 -> 143;
            case 84 -> 5;
            case 85 -> 232;
            case 86 -> 111;
            case 87 -> 99;
            case 88 -> 154;
            case 89 -> 112;
            case 90 -> 25;
            case 91 -> 231;
            case 92 -> 191;
            case 93 -> 98;
            case 94 -> 89;
            case 95 -> 41;
            case 96 -> 249;
            case 97 -> 78;
            case 98 -> 120;
            case 99 -> 30;
            case 100 -> 244;
            case 101 -> 248;
            case 102 -> 125;
            case 103 -> 131;
            case 104 -> 227;
            case 105 -> 242;
            case 106 -> 200;
            case 107 -> 76;
            case 108 -> 86;
            case 109 -> 168;
            case 110 -> 0;
            case 111 -> 146;
            case 112 -> 254;
            case 113 -> 234;
            case 114 -> 192;
            case 115 -> 12;
            case 116 -> 54;
            case 117 -> 209;
            case 118 -> 162;
            case 119 -> 142;
            case 120 -> 90;
            case 121 -> 108;
            case 122 -> 216;
            case 123 -> 39;
            case 124 -> 213;
            case 125 -> 212;
            case 126 -> 44;
            case 127 -> 85;
            case 128 -> 110;
            case 129 -> 134;
            case 130 -> 34;
            case 131 -> 240;
            case 132 -> 205;
            case 133 -> 28;
            case 134 -> 239;
            case 135 -> 97;
            case 136 -> 141;
            case 137 -> 183;
            case 138 -> 178;
            case 139 -> 115;
            case 140 -> 222;
            case 141 -> 36;
            case 142 -> 116;
            case 143 -> 175;
            case 144 -> 87;
            case 145 -> 82;
            case 146 -> 107;
            case 147 -> 185;
            case 148 -> 77;
            case 149 -> 19;
            case 150 -> 243;
            case 151 -> 106;
            case 152 -> 4;
            case 153 -> 233;
            case 154 -> 190;
            case 155 -> 252;
            case 156 -> 55;
            case 157 -> 208;
            case 158 -> 38;
            case 159 -> 118;
            case 160 -> 202;
            case 161 -> 1;
            case 162 -> 105;
            case 163 -> 69;
            case 164 -> 88;
            case 165 -> 255;
            case 166 -> 179;
            case 167 -> 158;
            case 168 -> 221;
            case 169 -> 31;
            case 170 -> 223;
            case 171 -> 155;
            case 172 -> 33;
            case 173 -> 57;
            case 174 -> 119;
            case 175 -> 172;
            case 176 -> 171;
            case 177 -> 151;
            case 178 -> 18;
            case 179 -> 144;
            case 180 -> 220;
            case 181 -> 16;
            case 182 -> 71;
            case 183 -> 139;
            case 184 -> 91;
            case 185 -> 42;
            case 186 -> 152;
            case 187 -> 62;
            case 188 -> 165;
            case 189 -> 10;
            case 190 -> 166;
            case 191 -> 113;
            case 192 -> 43;
            case 193 -> 64;
            case 194 -> 194;
            case 195 -> 83;
            case 196 -> 182;
            case 197 -> 211;
            case 198 -> 63;
            case 199 -> 229;
            case 200 -> 201;
            case 201 -> 177;
            case 202 -> 7;
            case 203 -> 27;
            case 204 -> 129;
            case 205 -> 204;
            case 206 -> 26;
            case 207 -> 169;
            case 208 -> 214;
            case 209 -> 96;
            case 210 -> 163;
            case 211 -> 136;
            case 212 -> 246;
            case 213 -> 235;
            case 214 -> 37;
            case 215 -> 101;
            case 216 -> 135;
            case 217 -> 11;
            case 218 -> 225;
            case 219 -> 218;
            case 220 -> 22;
            case 221 -> 159;
            case 222 -> 217;
            case 223 -> 228;
            case 224 -> 103;
            case 225 -> 8;
            case 226 -> 95;
            case 227 -> 164;
            case 228 -> 102;
            case 229 -> 230;
            case 230 -> 160;
            case 231 -> 174;
            case 232 -> 189;
            case 233 -> 74;
            case 234 -> 46;
            case 235 -> 48;
            case 236 -> 238;
            case 237 -> 126;
            case 238 -> 167;
            case 239 -> 35;
            case 240 -> 94;
            case 241 -> 181;
            case 242 -> 207;
            case 243 -> 93;
            case 244 -> 150;
            case 245 -> 224;
            case 246 -> 186;
            case 247 -> 226;
            case 248 -> 70;
            case 249 -> 50;
            case 250 -> 49;
            case 251 -> 245;
            case 252 -> 237;
            case 253 -> 153;
            case 254 -> 236;
            default -> 128;
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
