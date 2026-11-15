package me.octo.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import net.minecraft.ChatFormatting;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llllllIIIlllIlIllIIlIIIIIIIIllIIlllIIIIllllIlIlIIlIIllllIIIlIIllIlIIlIllIlIIIIlIIlIII
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static llllllIIIlllIlIllIIlIIIIIIIIllIIlllIIIIllllIlIlIIlIIllllIIIlIIllIlIIlIllIlIIIIlIIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private boolean lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @JvmField
   @NotNull
   public static llllllIIIlllIlIllIIlIIIIIIIIllIIlllIIIIllllIlIlIIlIIllllIIIlIIllIlIIlIllIlIIIIlIIlIII lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private static Regex IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static String[] f;
   private static String[] g;

   private llllllIIIlllIlIllIIlIIIIIIIIllIIlllIIIIllllIlIlIIlIIllllIIIlIIllIlIIlIllIlIIIIlIIlIII() {
      short var10001 = 30506;
      short var10002 = -5412;
      var10002 = 30515;
      short var10003 = 13330;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      short var10004 = 30469;
      short var10005 = -28494;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         lIlllIIlIIIIIlIlllIllIIIIlIIllllIlIlIlIlllIIllIIllIIlIIIIlllIIIlllIIllllIlIlllIIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         lIlllIIlIIIIIlIlllIllIIIIlIIllllIlIlIlIlllIIllIIllIIlIIIIlllIIIlllIIllllIlIlllIIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         lIlllIIlIIIIIlIlllIllIIIIlIIllllIlIlIlIlllIIllIIllIIlIIIIlllIIIlllIIllllIlIlllIIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c(),
         lIlllIIlIIIIIlIlllIllIIIIlIIllllIlIlIlIlllIIllIIllIIlIIIIlllIIIlllIIllllIlIlllIIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .d()
      };
      super(
         "Action on Player Ban",
         "Does configurable actions when a player is banned in your lobby. Swap Lobby, Disconnect, and Swap Server & Restart are unavailable for Gemstone Macro, which requires manual setup.",
         var3,
         "Miscellaneous",
         true,
         var1
      );
   }

   @Override
   public void aB() {
      super.aB();
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = false;
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      boolean var47 = false; // PX-FIX
      Object var39 = null; // PX-FIX
      boolean var38 = false; // PX-FIX
      boolean var37 = false; // PX-FIX
      boolean var36 = false; // PX-FIX
      String[] var2;
      ClientboundSystemChatPacket var29;
      label302: {
         String[] var10000 = llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII.g();
         short var10002 = 30489;
         short var10003 = 11923;
         Intrinsics.checkNotNullParameter(var1, "event");
         Packet var5 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         var2 = var10000;
         Packet var28 = var5;
         if (var2 != null) {
            if (!(var5 instanceof ClientboundSystemChatPacket)) {
               var29 = null;
               break label302;
            }

            var28 = var5;
         }

         var29 = (ClientboundSystemChatPacket)var28;
      }

      if (var29 != null) {
         ClientboundSystemChatPacket var3 = var29;
         if (!var3.overlay()) {
            me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var30 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            String var10001 = var3.content().getString();
            short var88 = 30507;
            short var10004 = 24513;
            Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
            String var4 = var30.a(var10001);
            boolean var31 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
            if (var2 != null) {
               if (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
                  return;
               }

               CharSequence var32 = var4;
               short var51 = 30485;
               short var68 = -22391;
               var31 = StringsKt.contains(var32, "A player has been removed from your game", false);
            }

            label291:
            if (var2 != null) {
               if (!var31) {
                  CharSequence var33 = var4;
                  short var52 = 30510;
                  short var69 = -15821;
                  var31 = StringsKt.contains(var33, "Use /report to continue helping out the server", false);
                  if (var2 == null) {
                     break label291;
                  }

                  if (!var31) {
                     return;
                  }
               }

               var31 = StringsKt.startsWith(var4, "[", false);
            }

            label283:
            if (var2 != null) {
               if (var31) {
                  short var53 = 30488;
                  short var70 = -30727;
                  var31 = StringsKt.startsWith(var4, "From", false);
                  if (var2 == null) {
                     break label283;
                  }

                  if (var31) {
                     return;
                  }
               }

               var31 = lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
            }

            if (var2 != null) {
               var31 = var31 || llIIlIlllIlIllIllIllIlIlIlllllIlllIIIIlIIllIIIlIllIlIlIlIIIIIIlllIlIlllIlllIllIlIlIIl.a() != null;
            }

            boolean var22 = var31;
            boolean var34 = var22;
            if (var2 != null) {
               if (!var22) {
                  return;
               }

               var34 = lIlllIIlIIIIIlIlllIllIIIIlIIllllIlIlIlIlllIIllIIllIIlIIIIlllIIIlllIIllllIlIlllIIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a()
                  .al();
            }

            boolean var6 = var34;
            boolean var7 = lIlllIIlIIIIIlIlllIllIIIIlIIllllIlIlIlIlllIIllIIllIIlIIIIlllIIIlllIIllllIlIlllIIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b()
               .al();
            boolean var8 = lIlllIIlIIIIIlIlllIllIIIIlIIllllIlIlIlIlllIIllIIllIIlIIIIlllIIIlllIIllllIlIlllIIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .c()
               .al();
            boolean var9 = lIlllIIlIIIIIlIlllIllIIIIlIIllllIlIlIlIlllIIllIIllIIlIIIIlllIIIlllIIllllIlIlllIIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .d()
               .al();
            if (var2 != null) {
               label262:
               if (!var6) {
                  boolean var35 = var7;
                  if (var2 != null) {
                     if (var7) {
                        break label262;
                     }

                     var35 = var8;
                  }

                  if (var2 != null) {
                     if (var35) {
                        break label262;
                     }

                     var35 = var9;
                  }

                  if (!var35) {
                     return;
                  }
               }

               this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = true;
            }

            String var10;
            IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var11;
            IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var12;
            boolean var13;
            label251: {
               label308: {
                  var10 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.a();
                  var11 = IllIIlIIlIlIlIIIlIlIllIlllIIIllIIIIlllIllIlIIIlIllIIIlIlIlIIIIIIIlllIIIIlIIIIIIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b();
                  var12 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .g();
                  var13 = var11 instanceof IIlIIIllllIIlIlIlIllIIlIIlIllIllllIIllIlIIIllllIIllIlIIllllIlllIIIlllIIIIIIIIIIIlIIll;
                  var36 = var9;
                  if (var2 != null) {
                     if (!var9) {
                        break label308;
                     }

                     var36 = var13;
                  }

                  if (var2 == null) {
                     break label251;
                  }

                  if (!var36) {
                     var36 = true;
                     break label251;
                  }
               }

               var36 = false;
            }

            boolean var14;
            label240: {
               label309: {
                  var14 = var36;
                  var37 = var7;
                  if (var2 != null) {
                     if (!var7) {
                        break label309;
                     }

                     var37 = var13;
                  }

                  if (var2 == null) {
                     break label240;
                  }

                  if (!var37) {
                     var37 = true;
                     break label240;
                  }
               }

               var37 = false;
            }

            boolean var15;
            label229: {
               label310: {
                  var15 = var37;
                  var38 = var8;
                  if (var2 != null) {
                     if (!var8) {
                        break label310;
                     }

                     var38 = var13;
                  }

                  if (var2 == null) {
                     break label229;
                  }

                  if (!var38) {
                     var38 = true;
                     break label229;
                  }
               }

               var38 = false;
            }

            boolean var16;
            label218: {
               var16 = var38;
               if (var2 != null && var11 != null) {
                  var39 = var11.aj();
                  if (var39 != null) {
                     break label218;
                  }
               }

               short var40 = 30481;
               short var54 = -19903;
               var39 = "macro";
            }

            String var17;
            String var74;
            label211: {
               var17 =((String)( var39));
               short var41 = 30511;
               short var55 = 28386;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.f(
                  "Player banned in your server"
               );
               short var56 = 30476;
               short var71 = -12187;
               if (var2 != null) {
                  LocalPlayer var72 = this.ap().player;
                  if (var72 != null) {
                     Component var73 = var72.getName();
                     if (var73 != null) {
                        var74 = var73.getString();
                        if (var2 != null) {
                           break label211;
                        }
                     }
                  }
               }

               var74 = null;
            }

            var88 = 30520;
            var10004 = 1478;
            me.octo.client.utils.IlllIlllllIIIlIIllIIIlIlIIlIIIlIlIIIlIllIIIIllllIIIIlIllIllllIlllIlIIlIllIIIlIIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a("Player Banned", "A player was banned in your server on " + var74);
            boolean var42 = var13;
            if (var2 != null) {
               if (var13) {
                  List var19 = CollectionsKt.createListBuilder();
                  boolean var21 = false;
                  boolean var43 = var7;
                  if (var2 != null) {
                     if (var7) {
                        short var57 = 30492;
                        short var75 = 5263;
                        var19.add("Swap Lobby");
                     }

                     var43 = var8;
                  }

                  if (var2 != null) {
                     if (var43) {
                        short var58 = 30501;
                        short var76 = -21386;
                        var19.add("Disconnect");
                     }

                     var43 = var9;
                  }

                  if (var2 != null && var43) {
                     short var59 = 30487;
                     short var77 = -2720;
                     var19.add("Swap Server & Restart");
                  }

                  List var18 = CollectionsKt.build(var19);
                  boolean var44 = var18.isEmpty();
                  if (var2 != null) {
                     var44 = !var44;
                  }

                  if (var44) {
                     Iterable var45 = var18;
                     short var60 = 30495;
                     short var78 = -27883;
                     String var46 = CollectionsKt.joinToString(var45, ", ", null, null, 0, null, null);
                     short var61 = 30493;
                     short var79 = 27653;
                     me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                        "§c[PlayerBan] Gemstone Macro requires manual setup — skipped: " + var46 + "."
                     );
                  }
               }

               var42 = var6;
            }

            label188: {
               label187: {
                  if (var2 != null) {
                     if (var42) {
                        break label187;
                     }

                     var42 = var14;
                  }

                  if (!var42) {
                     break label188;
                  }
               }

               IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                  .a()
                  .aG();
            }

            List var24;
            label314: {
               var24 = CollectionsKt.createListBuilder();
               boolean var27 = false;
               label177:
               if (var2 != null) {
                  if (!var6) {
                     var47 = var14;
                     if (var2 == null) {
                        break label314;
                     }

                     if (!var14) {
                        break label177;
                     }
                  }

                  short var80 = 30512;
                  var88 = 18249;
                  var24.add("stopped " + var17);
               }

               var47 = var15;
            }

            if (var2 != null) {
               if (var47) {
                  short var62 = 30478;
                  short var81 = -26594;
                  var24.add("swapping to hub");
               }

               var47 = var16;
            }

            if (var2 != null) {
               if (var47) {
                  short var63 = 30509;
                  short var82 = 7298;
                  var24.add("disconnecting");
               }

               var47 = var14;
            }

            if (var2 != null && var47) {
               short var83 = 30486;
               var88 = -14203;
               var24.add("swapping servers & restarting " + var17);
            }

            List var23 = CollectionsKt.build(var24);
            Iterable var48 = var23;
            short var64 = 30508;
            short var84 = -7508;
            String var49 = CollectionsKt.joinToString(var48, ", ", null, null, 0, null, null);
            short var65 = 30466;
            short var85 = 968;
            short var86 = 30522;
            var88 = 23231;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "§e[PlayerBan] Player was banned — " + var49 + " as configured."
            );
            short var50 = 30514;
            short var66 = 16815;
            Pair[] var25 = new Pair[3];
            Pair[] var67 = var25;
            byte var87 = 0;
            var88 = 30468;
            var10004 = -1575;
            String var94 = "server_id";
            String var99 = var10;
            if (var2 != null) {
               if (var10 == null) {
                  var10004 = 30524;
                  short var10005 = -18695;
                  var99 = "unknown";
               }

               var25[0] = TuplesKt.to("server_id", var99);
               var88 = 30481;
               var10004 = -19903;
               var25[1] = TuplesKt.to("macro", var17);
               var67 = var25;
               var87 = 2;
               var88 = 30484;
               var10004 = -23731;
               var94 = "actions";
               Iterable var103 = var23;
               short var104 = 30508;
               short var10006 = -7508;
               var99 = CollectionsKt.joinToString(var103, ", ", null, null, 0, null, null);
            }

            var67[var87] = TuplesKt.to(var94, var99);
            me.octo.client.utils.lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.a(
               "player_ban_detected", MapsKt.mapOf(var25), true, true
            );
            long var26 = RangesKt.random(new IntRange(2000, 5000), (Random)Random.Default);
            me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(var26, null);
         }
      }
   }

   private final void a(
      String var1,
      IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var2,
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var3,
      int var4
   ) {
      String[] var5 = llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII.g();
      if (var5 != null) {
         if (var4 < 5) {
            lIllllIllllIIllIlIllIlIlIIIIlIIlllllllIlIIIIIIlIlIlIIIlIIIIllIllllIllllIIIlllIIIIlIlI var11 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.a(
               IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
               var3, 0, 2, null);
            lIllllIllllIIllIlIllIlIlIIIIlIIlllllllIlIIIIIIlIlIlIIIlIIIIllIllllIllllIIIlllIIIIlIlI var13 = var11;
            if (var5 != null) {
               if (var11.b() == Integer.MAX_VALUE) {
                  this.ap().execute(null);
                  short var17 = 30513;
                  short var20 = -32730;
                  Pair[] var12 = new Pair[4];
                  short var23 = 30521;
                  short var31 = 17129;
                  var31 = 30464;
                  short var38 = -15508;
                  var12[0] = TuplesKt.to("outcome", "swap_failed");
                  var23 = 30526;
                  var31 = 15373;
                  var31 = 30523;
                  var38 = 26241;
                  var12[1] = TuplesKt.to("reason", "unknown_location");
                  var23 = 30481;
                  var31 = -19903;
                  var12[2] = TuplesKt.to("macro", var2.aj());
                  var23 = 30503;
                  var31 = -26058;
                  var12[3] = TuplesKt.to("location", var3.name());
                  me.octo.client.utils.lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.a(
                     "player_ban_resolved", MapsKt.mapOf(var12), false, false
                  );
                  return;
               }

               var13 = var11;
            }

            String var7 = StringsKt.removePrefix(var13.d(), "/");
            boolean var8 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.a(var2);
            String var15;
            if (var8) {
               short var14 = 30480;
               short var18 = 28524;
               var15 = "warp base";
            } else {
               short var16 = 30498;
               short var19 = -20875;
               var15 = "is";
            }

            String var9 = var15;
            IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var10 = var8
               ? IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
               : IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
            me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(null);
            return;
         }

         this.ap().execute(null);
      }

      short var10000 = 30527;
      short var10001 = 14179;
      Pair[] var6 = new Pair[3];
      short var10003 = 30490;
      short var10004 = 13722;
      var10004 = 30516;
      short var10005 = 8176;
      var6[0] = TuplesKt.to("outcome", "swap_failed");
      var10003 = 30500;
      var10004 = 18971;
      var10004 = 30517;
      var10005 = 25051;
      var6[1] = TuplesKt.to("reason", "max_retries");
      var10003 = 30479;
      var10004 = -25995;
      var6[2] = TuplesKt.to("macro", var2.aj());
      me.octo.client.utils.lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.a(
         "player_ban_resolved", MapsKt.mapOf(var6), false, false
      );
   }

   private static final void a(boolean var0, boolean var1) {
      String[] var2 = llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII.g();
      short var10000 =((short)(( var0) ? 1 : 0));
      if (var2 != null) {
         if (var0) {
            var10000 = 30525;
            short var10001 = -8770;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b("warp hub");
         }

         var10000 =((short)(( var1) ? 1 : 0));
      }

      if ((var10000 != 0)) {
         var10000 = 30475;
         short var5 = 2913;
         me.octo.client.utils.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.a(
            "Polinex | Player banned in your server", ChatFormatting.RED
         );
      }
   }

   private static final void ag() {
      short var10000 = 30494;
      short var10001 = 32676;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
         "§e[PlayerBan] Done. You may continue if you want."
      );
   }

   private static final Unit a(
      llllllIIIlllIlIllIIlIIIIIIIIllIIlllIIIIllllIlIlIIlIIllllIIIlIIllIlIIlIllIlIIIIlIIlIII var0,
      boolean var1,
      String var2,
      IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var3,
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var4,
      boolean var5,
      String var6,
      boolean var7
   ) {
      String[] var10000 = llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII.g();
      var0.ap().execute(null);
      String[] var8 = var10000;
      boolean var11 = var1;
      if (var8 != null) {
         if (var1 && var2 != null && var3 != null) {
            var0.a(var2, var3, var4, 0);
            if (var8 != null) {
               return Unit.INSTANCE;
            }
         }

         var11 = var5;
      }

      if (var11) {
         short var12 = 30513;
         short var10001 = -32730;
         Pair[] var9 = new Pair[2];
         short var10003 = 30521;
         short var10004 = 17129;
         var10004 = 30465;
         short var10005 = 1791;
         var9[0] = TuplesKt.to("outcome", "disconnected");
         var10003 = 30481;
         var10004 = -19903;
         var9[1] = TuplesKt.to("macro", var6);
         me.octo.client.utils.lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.a(
            "player_ban_resolved", MapsKt.mapOf(var9), true, false
         );
         if (var8 != null) {
            return Unit.INSTANCE;
         }
      }

      var0.ap().execute(llllllIIIlllIlIllIIlIIIIIIIIllIIlllIIIIllllIlIlIIlIIllllIIIlIIllIlIIlIllIlIIIIlIIlIII::ag);
      short var13 = 30513;
      short var14 = -32730;
      Pair[] var10 = new Pair[2];
      short var16 = 30521;
      short var20 = 17129;
      var20 = 30473;
      short var23 = 27655;
      var10[0] = TuplesKt.to("outcome", "stopped");
      var16 = 30481;
      var20 = -19903;
      var10[1] = TuplesKt.to("macro", var6);
      me.octo.client.utils.lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.a(
         "player_ban_resolved", MapsKt.mapOf(var10), false, false
      );
      return Unit.INSTANCE;
   }

   private static final void a(int var0) {
      int var10000 = var0 + 1;
      short var10001 = 30467;
      short var10002 = -4752;
      var10002 = 30504;
      short var10003 = -15644;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
         "§e[PlayerBan] Swapping server... (attempt " + var10000 + "/5)"
      );
   }

   private static final void e(String var0) {
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b(var0);
   }

   private static final void ah() {
      short var10000 = 30499;
      short var10001 = -14301;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
         "§c[PlayerBan] Timed out waiting for intermediate stop, retrying..."
      );
   }

   private static final void f(String var0) {
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b(var0);
   }

   private static final void a(
      llllllIIIlllIlIllIIlIIIIIIIIllIIlllIIIIllllIlIlIIlIIllllIIIlIIllIlIIlIllIlIIIIlIIlIII var0,
      IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var1
   ) {
      var0.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = false;
      String var10000 = var1.aj();
      short var10001 = 30482;
      short var10002 = -28905;
      var10002 = 30497;
      short var10003 = -4896;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
         "§a[PlayerBan] Player was banned — swapped to a different server and restarted " + var10000 + ". You may continue if you want."
      );
      IllIIlIIlIlIlIIIlIlIllIlllIIIllIIIIlllIllIlIIIlIllIIIlIlIlIIIIIIIlllIIIIlIIIIIIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .d();
   }

   private static final void c(int var0) {
      int var10000 = var0 + 1;
      short var10001 = 30474;
      short var10002 = -22695;
      var10002 = 30472;
      short var10003 = 18357;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
         "§c[PlayerBan] Same server, trying again... (" + var10000 + "/5)"
      );
   }

   private static final void b(
      llllllIIIlllIlIllIIlIIIIIIIIllIIlllIIIIllllIlIlIIlIIllllIIIlIIllIlIIlIllIlIIIIlIIlIII var0,
      IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var1
   ) {
      var0.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = false;
      String var10000 = var1.aj();
      short var10001 = 30470;
      short var10002 = 17915;
      var10002 = 30477;
      short var10003 = -2692;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
         "§c[PlayerBan] Failed to get a different server after 5 attempts — " + var10000 + " remains stopped. You may continue if you want."
      );
   }

   private static final void a(
      llllllIIIlllIlIllIIlIIIIIIIIllIIlllIIIIllllIlIlIIlIIllllIIIlIIllIlIIlIllIlIIIIlIIlIII var0,
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var1,
      IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var2
   ) {
      var0.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = false;
      String var10000 = var1.name();
      String var10001 = var2.aj();
      short var10002 = 30505;
      short var10003 = 27165;
      var10003 = 30483;
      short var10004 = 17496;
      var10004 = 30518;
      short var10005 = 25320;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
         "§c[PlayerBan] Unknown warp for " + var10000 + " — " + var10001 + " remains stopped. You may continue if you want."
      );
   }

   private static final Unit a(
      llllllIIIlllIlIllIIlIIIIIIIIllIIlllIIIIllllIlIlIIlIIllllIIIlIIllIlIIlIllIlIIIIlIIlIII var0,
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var1,
      String var2,
      IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var3,
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var4,
      int var5,
      lIllllIllllIIllIlIllIlIlIIIIlIIlllllllIlIIIIIIlIlIlIIIlIIIIllIllllIllllIIIlllIIIIlIlI var6,
      String var7,
      String var8
   ) {
      long var17 = 0L; // PX-FIX
      long var16 = 0L; // PX-FIX
      var0.ap().execute(null);
      var0.ap().execute(null);
      String[] var10000 = llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII.g();
      long var10 = System.currentTimeMillis() + 30000;
      String[] var9 = var10000;

      long var10001;
      while (true) {
         label71:
         if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g()
            != var1) {
            var16 = System.currentTimeMillis();
            if (var9 != null) {
               var10001 = var10;
               if (var9 == null) {
                  break;
               }

               if (var16 >= var10) {
                  break label71;
               }

               var16 = 500L;
            }

            try {
               Thread.sleep(var16);
            }
            catch (InterruptedException exception) {
               throw new RuntimeException(exception);
            }
            if (var9 != null) {
               continue;
            }
         }

         if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g()
            != var1) {
            var0.ap().execute(llllllIIIlllIlIllIIlIIIIIIIIllIIlllIIIIllllIlIlIIlIIllllIIIlIIllIlIIlIllIlIIIIlIIlIII::ah);
            try {
               Thread.sleep(2000L);
            }
            catch (InterruptedException exception) {
               throw new RuntimeException(exception);
            }
            var0.a(var2, var3, var4, var5 + 1);
            return Unit.INSTANCE;
         }

         try {
            Thread.sleep(5000L);
         }
         catch (InterruptedException exception) {
            throw new RuntimeException(exception);
         }
         var0.ap().execute(null);
         var16 = System.currentTimeMillis();
         var10001 = 30000;
         break;
      }

      long var12 = ((Long)var16) + var10001;

      label59: {
         while (true) {
            if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .g()
               != var6.a()) {
               if (var9 == null) {
                  break label59;
               }

               if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .g()
                  != var4) {
                  var17 = System.currentTimeMillis();
                  if (var9 == null) {
                     break;
                  }

                  if (var17 < var12) {
                     try {
                        Thread.sleep(500L);
                     }
                     catch (InterruptedException exception) {
                        throw new RuntimeException(exception);
                     }
                     if (var9 != null) {
                        continue;
                     }
                  }
               }
            }

            var17 = 1000L;
            break;
         }

         try {
            Thread.sleep(var17);
         }
         catch (InterruptedException exception) {
            throw new RuntimeException(exception);
         }
      }

      String var14 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.a();
      if (var9 != null) {
         label41:
         if (var14 != null) {
            String var18 = var14;
            if (var9 != null) {
               if (Intrinsics.areEqual(var14, var2)) {
                  break label41;
               }

               short var19 = 30513;
               short var20 = -32730;
               var18 = "player_ban_resolved";
            }

            Pair[] var15 = new Pair[4];
            short var10003 = 30521;
            short var10004 = 17129;
            var10004 = 30502;
            short var10005 = -9285;
            var15[0] = TuplesKt.to("outcome", "swap_success");
            var10003 = 30481;
            var10004 = -19903;
            var15[1] = TuplesKt.to("macro", var3.aj());
            var10003 = 30496;
            var10004 = 5503;
            var15[2] = TuplesKt.to("old_server_id", var2);
            var10003 = 30491;
            var10004 = -31564;
            var15[3] = TuplesKt.to("new_server_id", var14);
            me.octo.client.utils.lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.a(
               var18, MapsKt.mapOf(var15), true, false
            );
            var0.ap().execute(null);
            if (var9 != null) {
               return Unit.INSTANCE;
            }
         }

         var0.ap().execute(null);
         try {
            Thread.sleep(3000L);
         }
         catch (InterruptedException exception) {
            throw new RuntimeException(exception);
         }
      }

      var0.a(var2, var3, var4, var5 + 1);
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[63];
      int var3 = 0;
      String var2 = "\u001f\u001a&ý\u0092\u008c.ÛÆìk>«ì^74Ö\b\u0098Ô7\u0014à?v¼a¶\u0087e¹¼V*÷å\u0080\u0007\u0012LhÇÑ1\u0089\u000f«¤þ\u000fè\u0001(ª%Dc8y\u000b¦\u0010\tÜM \u0089k\u0089Å\u0014¿ö]\u000eÛ:»\u0007¥PØ1;Yß\b\u0086\u009aç\u0098©®0¼\u0006f\u0089M}Âw\u0013°[Õ\u0005Û/¹Õ\b&å\\Æ\u0090\u0010\u0089*CÐ\b\u000e oxV¿\u0084p\u0013\u0080ÑÓT\u001b\u0005¡\u0090\u000b\u008e\u0085IÊ2\u0091Ý\u001aÉÖ\u00139àärýÁ}\b\u0090\u009dö=¤oV\u009e«O¢³çÅ\u0089¿\u0091\"-K«\u007fN\u0097\u009b\u001cCHÿ>\u001e+®mª[R¡\u008b,ãdI¸d\u0081\u0090A`ÜÞ;%d®\u0019L\u0095ãßï|\u0096\u0019@°èa\u0083=ü\u001aU\b©o©\u0089\u0090 P=V\u0006±Ö(s'íCÞ¹àý¤\u0017¾\u0083\u0002ã#b#%\u0003\u0001qb\u0017\u000fIv`ÞmfÙ\"WóÈh1ëõ½Ó¨ù]í\u000bÛB\u001e2¶\r¿\\J\u0003M\u007f\u001f§DC\u0003y\u00803n]¸fù\u001fni\u0001y·ÈRq\u008cÝp³è\u009eE\u0090U«\n®P\u0015Ø¼Z³rcI:\u007fD\u000b²ìö\u0082\u0085ã1ÑíÇÎ\u000b\u008f&\u0095 þ~Ã\u001a\u0001Æá/\u0096uO\t\b#v=§\u0015R\u0099k\u0095\u0018B8vü.Ì\tÅ¸÷3`y\u00033v\u0004¶íys\u0087ÖÕØ2í\u0084\u0012»\u008d³%\u0092Aq«+Ã\u0006ÃdcB\u0003z^K\u0097\u0019ÝR1Êã ½Á\u0017¯\u0081N\u0094Ò\\0ôÉ~½\u0003\u001fLÜ\u001f¯\u0095!\u001b1óê8\u0093PÙ'\u00803ÝÆóã^\u0003s·Po\u0017\u0099U\u007f\u008fÝ\u008f\u0014fa\r¼}\u0016Y`\u008brtO\u001e%\u0085j\u0085Å¼w\u000eªav@\tèæ!\u0015sñ$P\u0012\u0002\u0085h\rOÃ®©îÿeW\u0086\u008b@¬\u0080.\u009f\u0005µk\u0019\u0090Ø0WÖê\u008fxî»ÖàM£È´Fºï\u0000õ¢S²\u0090©g\u0098\u0016±WRz#Cu}¯úpc\u001cÄ_\u007f\u0085\u008e?l×\"f\u0091C^Õ$\u001a<o\u0085e\u00149'º}¡]ª\rï]Çã*\u0006~\u0011|4ï\u009a\u0086\u001fdUâ\u0017\u0012ë VG{+m¯\u000fQ\u009fÇÃJs_dÒ\u001b\u008f\u0088ö\u0000GÓ¹\u0002OGB×\u0095.\u001bÐóÖ8\u0014P)'\u009e3\u001fÁ\u008cï|¿\\È\u0097>\u0089Ëj\u0014\u000eü>êc½à{£ù²°uæ\u0099\u0092O-\u0090&\u009c\u0010)¬YrÞÁô\u009aù&#W\u0013\t-8\u0006õ8?K\u008c±\n·ï\u0095,\u0089O\u0089A\u001bI\fn¡m+öÃKh;»í\u0084\bÂ\u000e\u0006Ôò\u0015\u009fæ\u0004vÛóÜ\u0005>ã·\\\u0002\u0007\u0000\u009c*Ý\u0099r\u0080\r\u0016ÆÊ¸úmd|?\u0099\u0087/\u008b\nÈ¸\u009d\b\u0097\u0098íÚ·Ð>z\f\u009b(f\u0095\u0000ôÎÉr\u0014õUa\u00012l»T·\u0003\u009f8@É\u009c\rá»¡ÌÁ\u0004ÅÏ\u001dÌ%\u0095¡Þ\u0098\u0086¢´\\Tcn}⁻]ÃOXñÕùV\u0085©1\u009e\u0012\u0007-õ5rà\u0080K»DÌ_EJÖX\u001eI%\fIÿió?G¼I*)Æ\u001a½ë¦\u0001`\rt¾Ã\u009f\b@¿\u009a.\u0002cÊ\t!\u001f\u0013(7²÷e<\u0005ÙoD$¡Ns\u0006º+Bõ\u0084ø^H`$·S>È wea\u0011\t\u008d\u0017*Ô«\u008e8ý\u001c ‶»wJx|ÄÝ)\u0006×aü9Ò¥CT \u0099:Ö¾3:\u0005Ú9\u00adÕ+=Ò1\u0085ì\u0081\u0088\u0011F\u0082¶ $Î\u0003\u0003Þ⃝\u0003\u0007Ù\u001aÞÓ\u0007ûE(¡Èñ§hÇq²-Þ\u0016\u0084\u0004»¯Ö\u008eÅIR,\u0082Ùk\u0011Í\u0007»KÌ\u0017ÖàR¸ß¦bÄ-\u001e\u001cv#Ñ\u0010\u0086F\u009d¡\u0097\u0083Ôd\u0097(¢Å\u0099õ\b« \"¤:ä¹\\zâ\u0015¸\u0018\u0093\u001cV\u0005ß\u0085®5é\u0006\u008c\u0090O¹^|þ¬²\u0003?pØ\u0007aà\u0082`ë¼3,dÝX\u0012\u001eÒ\u000f\u001c/ÔN·r!\u0085\u008b8¯®äÀ\u009dM6\u0095j\u0005Ä\u0098ñ\u009að96\u0099ëõCkKKøÌ6&_1\u0001;æíS:\u008b\u009f$ò\u0014\u0092Ä\u009c\u00ad;¹\u008c@9%\u0012ÓAµ¦\u0093\u001d^®Í?\u00826ãÐ\r2N¡§U{\u0017\u007fMW|eã/©W¨Mô«é,T7,Ý¤\u001dáS\u0007T\u001bj0\u0081Z©\u0004\u0011\u001e=Ì»\u008f\u0015\u0089Ï\u009e7{^JÉÁÏúVt\u0005J\u000f \u0015´½â\u000b\u0018,j¦ðG_í\u0082\u0005\u000f\u0005\u009eiú\u000b\u007fûO`²¿×Z1¶U\f®\u0097\u0092#i®\u0095}\u0098Î\u008f\u000e\"\u008e¢\u0005;µ÷z¸\u0081@\u009b%ÈsÑÌÝ÷Úqæ\u000bsWõÜP\u008fGÝó¤\u20cb;*J \u009dk¦ý\u0018ùÍh\u0012 ùÓôÃ\u001ag7P¢G=Ì\u0010¿\u0016úfR\u0002yÂGIßú¸>çØö\tTI9`7m$\u0096¾";
      int var4 = "\u001f\u001a&ý\u0092\u008c.ÛÆìk>«ì^74Ö\b\u0098Ô7\u0014à?v¼a¶\u0087e¹¼V*÷å\u0080\u0007\u0012LhÇÑ1\u0089\u000f«¤þ\u000fè\u0001(ª%Dc8y\u000b¦\u0010\tÜM \u0089k\u0089Å\u0014¿ö]\u000eÛ:»\u0007¥PØ1;Yß\b\u0086\u009aç\u0098©®0¼\u0006f\u0089M}Âw\u0013°[Õ\u0005Û/¹Õ\b&å\\Æ\u0090\u0010\u0089*CÐ\b\u000e oxV¿\u0084p\u0013\u0080ÑÓT\u001b\u0005¡\u0090\u000b\u008e\u0085IÊ2\u0091Ý\u001aÉÖ\u00139àärýÁ}\b\u0090\u009dö=¤oV\u009e«O¢³çÅ\u0089¿\u0091\"-K«\u007fN\u0097\u009b\u001cCHÿ>\u001e+®mª[R¡\u008b,ãdI¸d\u0081\u0090A`ÜÞ;%d®\u0019L\u0095ãßï|\u0096\u0019@°èa\u0083=ü\u001aU\b©o©\u0089\u0090 P=V\u0006±Ö(s'íCÞ¹àý¤\u0017¾\u0083\u0002ã#b#%\u0003\u0001qb\u0017\u000fIv`ÞmfÙ\"WóÈh1ëõ½Ó¨ù]í\u000bÛB\u001e2¶\r¿\\J\u0003M\u007f\u001f§DC\u0003y\u00803n]¸fù\u001fni\u0001y·ÈRq\u008cÝp³è\u009eE\u0090U«\n®P\u0015Ø¼Z³rcI:\u007fD\u000b²ìö\u0082\u0085ã1ÑíÇÎ\u000b\u008f&\u0095 þ~Ã\u001a\u0001Æá/\u0096uO\t\b#v=§\u0015R\u0099k\u0095\u0018B8vü.Ì\tÅ¸÷3`y\u00033v\u0004¶íys\u0087ÖÕØ2í\u0084\u0012»\u008d³%\u0092Aq«+Ã\u0006ÃdcB\u0003z^K\u0097\u0019ÝR1Êã ½Á\u0017¯\u0081N\u0094Ò\\0ôÉ~½\u0003\u001fLÜ\u001f¯\u0095!\u001b1óê8\u0093PÙ'\u00803ÝÆóã^\u0003s·Po\u0017\u0099U\u007f\u008fÝ\u008f\u0014fa\r¼}\u0016Y`\u008brtO\u001e%\u0085j\u0085Å¼w\u000eªav@\tèæ!\u0015sñ$P\u0012\u0002\u0085h\rOÃ®©îÿeW\u0086\u008b@¬\u0080.\u009f\u0005µk\u0019\u0090Ø0WÖê\u008fxî»ÖàM£È´Fºï\u0000õ¢S²\u0090©g\u0098\u0016±WRz#Cu}¯úpc\u001cÄ_\u007f\u0085\u008e?l×\"f\u0091C^Õ$\u001a<o\u0085e\u00149'º}¡]ª\rï]Çã*\u0006~\u0011|4ï\u009a\u0086\u001fdUâ\u0017\u0012ë VG{+m¯\u000fQ\u009fÇÃJs_dÒ\u001b\u008f\u0088ö\u0000GÓ¹\u0002OGB×\u0095.\u001bÐóÖ8\u0014P)'\u009e3\u001fÁ\u008cï|¿\\È\u0097>\u0089Ëj\u0014\u000eü>êc½à{£ù²°uæ\u0099\u0092O-\u0090&\u009c\u0010)¬YrÞÁô\u009aù&#W\u0013\t-8\u0006õ8?K\u008c±\n·ï\u0095,\u0089O\u0089A\u001bI\fn¡m+öÃKh;»í\u0084\bÂ\u000e\u0006Ôò\u0015\u009fæ\u0004vÛóÜ\u0005>ã·\\\u0002\u0007\u0000\u009c*Ý\u0099r\u0080\r\u0016ÆÊ¸úmd|?\u0099\u0087/\u008b\nÈ¸\u009d\b\u0097\u0098íÚ·Ð>z\f\u009b(f\u0095\u0000ôÎÉr\u0014õUa\u00012l»T·\u0003\u009f8@É\u009c\rá»¡ÌÁ\u0004ÅÏ\u001dÌ%\u0095¡Þ\u0098\u0086¢´\\Tcn}⁻]ÃOXñÕùV\u0085©1\u009e\u0012\u0007-õ5rà\u0080K»DÌ_EJÖX\u001eI%\fIÿió?G¼I*)Æ\u001a½ë¦\u0001`\rt¾Ã\u009f\b@¿\u009a.\u0002cÊ\t!\u001f\u0013(7²÷e<\u0005ÙoD$¡Ns\u0006º+Bõ\u0084ø^H`$·S>È wea\u0011\t\u008d\u0017*Ô«\u008e8ý\u001c ‶»wJx|ÄÝ)\u0006×aü9Ò¥CT \u0099:Ö¾3:\u0005Ú9\u00adÕ+=Ò1\u0085ì\u0081\u0088\u0011F\u0082¶ $Î\u0003\u0003Þ⃝\u0003\u0007Ù\u001aÞÓ\u0007ûE(¡Èñ§hÇq²-Þ\u0016\u0084\u0004»¯Ö\u008eÅIR,\u0082Ùk\u0011Í\u0007»KÌ\u0017ÖàR¸ß¦bÄ-\u001e\u001cv#Ñ\u0010\u0086F\u009d¡\u0097\u0083Ôd\u0097(¢Å\u0099õ\b« \"¤:ä¹\\zâ\u0015¸\u0018\u0093\u001cV\u0005ß\u0085®5é\u0006\u008c\u0090O¹^|þ¬²\u0003?pØ\u0007aà\u0082`ë¼3,dÝX\u0012\u001eÒ\u000f\u001c/ÔN·r!\u0085\u008b8¯®äÀ\u009dM6\u0095j\u0005Ä\u0098ñ\u009að96\u0099ëõCkKKøÌ6&_1\u0001;æíS:\u008b\u009f$ò\u0014\u0092Ä\u009c\u00ad;¹\u008c@9%\u0012ÓAµ¦\u0093\u001d^®Í?\u00826ãÐ\r2N¡§U{\u0017\u007fMW|eã/©W¨Mô«é,T7,Ý¤\u001dáS\u0007T\u001bj0\u0081Z©\u0004\u0011\u001e=Ì»\u008f\u0015\u0089Ï\u009e7{^JÉÁÏúVt\u0005J\u000f \u0015´½â\u000b\u0018,j¦ðG_í\u0082\u0005\u000f\u0005\u009eiú\u000b\u007fûO`²¿×Z1¶U\f®\u0097\u0092#i®\u0095}\u0098Î\u008f\u000e\"\u008e¢\u0005;µ÷z¸\u0081@\u009b%ÈsÑÌÝ÷Úqæ\u000bsWõÜP\u008fGÝó¤\u20cb;*J \u009dk¦ý\u0018ùÍh\u0012 ùÓôÃ\u001ag7P¢G=Ì\u0010¿\u0016úfR\u0002yÂGIßú¸>çØö\tTI9`7m$\u0096¾"
         .length();
      char var1 = '&';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 60;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var25 = var10001.toCharArray();
               int var10004 = var25.length;
               int var6 = 0;
               byte var28 = var10000;
               var20 = var25;
               int var14 = var10004;
               byte var34;
               char[] var38;
               int var10006;
               if (var10004 <= 1) {
                  var38 = var25;
                  var34 = var10000;
                  var10006 = var6;
               } else {
                  var28 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var38 = var25;
                  var34 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var38[var10006] = (char)(var38[var10006] ^ var34 ^ switch (var6 % 7) {
                     case 0 -> 90;
                     case 1 -> 113;
                     case 2 -> 44;
                     case 3 -> 99;
                     case 4 -> 119;
                     case 5 -> 124;
                     default -> 1;
                  });
                  var6++;
                  if (var28 == 0) {
                     var10006 = var28;
                     var38 = var20;
                     var34 = var28;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var38 = var20;
                     var34 = var28;
                     var10006 = var6;
                  }
               }
            }

            String var30 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var30;
                  if ((var8 += var1) >= var4) {
                     f = var5;
                     g = new String[63];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new llllllIIIlllIlIllIIlIIIIIIIIllIIlllIIIIllllIlIlIIlIIllllIIIlIIllIlIIlIllIlIIIIlIIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new llllllIIIlllIlIllIIlIIIIIIIIllIIlllIIIIllllIlIlIIlIIllllIIIlIIllIlIIlIllIlIIIIlIIlIII();
                     var10002 = 30519;
                     short var31 = -26671;
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new Regex(
                        "\\b([a-z]{1,10}\\d{1,6}[A-Za-z]{1,4})\\b"
                     );
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var30;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "ï\u0002\u0019>½ éU÷ñkd\u0098BÒ÷!ø\u009e °íwEê*I=X§\u009f\u008c4\u0010\u0094_\u009cB/ï\u001eï\u0099¼i\u0083EV\u009cÓz[«\u000eø{±\u0095\u001c!\u008c}(W\u008f\u0011AÍ(°\u0094j~\u0083\u0090Àä\u0003⃐\u0017";
                  var4 = "ï\u0002\u0019>½ éU÷ñkd\u0098BÒ÷!ø\u009e °íwEê*I=X§\u009f\u008c4\u0010\u0094_\u009cB/ï\u001eï\u0099¼i\u0083EV\u009cÓz[«\u000eø{±\u0095\u001c!\u008c}(W\u008f\u0011AÍ(°\u0094j~\u0083\u0090Àä\u0003⃐\u0017"
                     .length();
                  var1 = '\r';
                  var8 = -1;
            }

            var10000 = 123;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 30520) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 155;
            case 1 -> 159;
            case 2 -> 180;
            case 3 -> 193;
            case 4 -> 17;
            case 5 -> 236;
            case 6 -> 232;
            case 7 -> 147;
            case 8 -> 64;
            case 9 -> 82;
            case 10 -> 174;
            case 11 -> 33;
            case 12 -> 252;
            case 13 -> 94;
            case 14 -> 205;
            case 15 -> 185;
            case 16 -> 163;
            case 17 -> 16;
            case 18 -> 55;
            case 19 -> 108;
            case 20 -> 134;
            case 21 -> 101;
            case 22 -> 133;
            case 23 -> 18;
            case 24 -> 249;
            case 25 -> 2;
            case 26 -> 250;
            case 27 -> 11;
            case 28 -> 74;
            case 29 -> 35;
            case 30 -> 68;
            case 31 -> 95;
            case 32 -> 253;
            case 33 -> 79;
            case 34 -> 160;
            case 35 -> 51;
            case 36 -> 201;
            case 37 -> 140;
            case 38 -> 200;
            case 39 -> 171;
            case 40 -> 15;
            case 41 -> 53;
            case 42 -> 166;
            case 43 -> 80;
            case 44 -> 229;
            case 45 -> 20;
            case 46 -> 222;
            case 47 -> 143;
            case 48 -> 78;
            case 49 -> 126;
            case 50 -> 152;
            case 51 -> 223;
            case 52 -> 38;
            case 53 -> 156;
            case 54 -> 218;
            case 55 -> 241;
            case 56 -> 233;
            case 57 -> 248;
            case 58 -> 12;
            case 59 -> 149;
            case 60 -> 54;
            case 61 -> 19;
            case 62 -> 36;
            case 63 -> 8;
            case 64 -> 112;
            case 65 -> 243;
            case 66 -> 162;
            case 67 -> 109;
            case 68 -> 26;
            case 69 -> 116;
            case 70 -> 137;
            case 71 -> 60;
            case 72 -> 90;
            case 73 -> 184;
            case 74 -> 27;
            case 75 -> 37;
            case 76 -> 203;
            case 77 -> 50;
            case 78 -> 172;
            case 79 -> 237;
            case 80 -> 213;
            case 81 -> 154;
            case 82 -> 231;
            case 83 -> 208;
            case 84 -> 97;
            case 85 -> 42;
            case 86 -> 157;
            case 87 -> 5;
            case 88 -> 86;
            case 89 -> 63;
            case 90 -> 119;
            case 91 -> 30;
            case 92 -> 7;
            case 93 -> 214;
            case 94 -> 238;
            case 95 -> 128;
            case 96 -> 207;
            case 97 -> 91;
            case 98 -> 198;
            case 99 -> 81;
            case 100 -> 31;
            case 101 -> 178;
            case 102 -> 145;
            case 103 -> 195;
            case 104 -> 46;
            case 105 -> 113;
            case 106 -> 164;
            case 107 -> 66;
            case 108 -> 183;
            case 109 -> 10;
            case 110 -> 179;
            case 111 -> 103;
            case 112 -> 150;
            case 113 -> 102;
            case 114 -> 40;
            case 115 -> 48;
            case 116 -> 206;
            case 117 -> 61;
            case 118 -> 28;
            case 119 -> 170;
            case 120 -> 106;
            case 121 -> 142;
            case 122 -> 124;
            case 123 -> 165;
            case 124 -> 70;
            case 125 -> 59;
            case 126 -> 202;
            case 127 -> 115;
            case 128 -> 212;
            case 129 -> 77;
            case 130 -> 125;
            case 131 -> 107;
            case 132 -> 96;
            case 133 -> 224;
            case 134 -> 49;
            case 135 -> 52;
            case 136 -> 88;
            case 137 -> 153;
            case 138 -> 177;
            case 139 -> 245;
            case 140 -> 4;
            case 141 -> 168;
            case 142 -> 219;
            case 143 -> 117;
            case 144 -> 220;
            case 145 -> 118;
            case 146 -> 251;
            case 147 -> 58;
            case 148 -> 227;
            case 149 -> 158;
            case 150 -> 129;
            case 151 -> 131;
            case 152 -> 161;
            case 153 -> 186;
            case 154 -> 62;
            case 155 -> 230;
            case 156 -> 130;
            case 157 -> 215;
            case 158 -> 98;
            case 159 -> 9;
            case 160 -> 56;
            case 161 -> 216;
            case 162 -> 240;
            case 163 -> 32;
            case 164 -> 110;
            case 165 -> 151;
            case 166 -> 173;
            case 167 -> 188;
            case 168 -> 44;
            case 169 -> 127;
            case 170 -> 226;
            case 171 -> 228;
            case 172 -> 6;
            case 173 -> 139;
            case 174 -> 146;
            case 175 -> 254;
            case 176 -> 84;
            case 177 -> 13;
            case 178 -> 21;
            case 179 -> 29;
            case 180 -> 197;
            case 181 -> 114;
            case 182 -> 92;
            case 183 -> 247;
            case 184 -> 192;
            case 185 -> 45;
            case 186 -> 65;
            case 187 -> 169;
            case 188 -> 132;
            case 189 -> 176;
            case 190 -> 182;
            case 191 -> 111;
            case 192 -> 57;
            case 193 -> 71;
            case 194 -> 196;
            case 195 -> 67;
            case 196 -> 234;
            case 197 -> 187;
            case 198 -> 105;
            case 199 -> 3;
            case 200 -> 83;
            case 201 -> 175;
            case 202 -> 209;
            case 203 -> 123;
            case 204 -> 22;
            case 205 -> 210;
            case 206 -> 47;
            case 207 -> 141;
            case 208 -> 239;
            case 209 -> 225;
            case 210 -> 244;
            case 211 -> 235;
            case 212 -> 73;
            case 213 -> 246;
            case 214 -> 189;
            case 215 -> 93;
            case 216 -> 136;
            case 217 -> 72;
            case 218 -> 190;
            case 219 -> 217;
            case 220 -> 34;
            case 221 -> 99;
            case 222 -> 211;
            case 223 -> 242;
            case 224 -> 39;
            case 225 -> 43;
            case 226 -> 120;
            case 227 -> 221;
            case 228 -> 194;
            case 229 -> 104;
            case 230 -> 144;
            case 231 -> 1;
            case 232 -> 121;
            case 233 -> 87;
            case 234 -> 0;
            case 235 -> 25;
            case 236 -> 122;
            case 237 -> 191;
            case 238 -> 89;
            case 239 -> 85;
            case 240 -> 24;
            case 241 -> 199;
            case 242 -> 100;
            case 243 -> 167;
            case 244 -> 41;
            case 245 -> 138;
            case 246 -> 255;
            case 247 -> 14;
            case 248 -> 69;
            case 249 -> 135;
            case 250 -> 23;
            case 251 -> 204;
            case 252 -> 76;
            case 253 -> 181;
            case 254 -> 75;
            default -> 148;
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

      private static String[] a;
      private static String[] b;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @Nullable
      public final String a() {
         String[] var1 = llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII.g();
         if (var1 != null) {
            ArrayList var10000 = me.octo.client.utils.IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .d();
            if (var10000 != null) {
               ArrayList var2 = var10000;
               Iterator var6 = var2.iterator();
               short var10002 = 29015;
               short var10003 = 14532;
               Intrinsics.checkNotNullExpressionValue(var6, "iterator(...)");
               Iterator var3 = var6;

               while (var3.hasNext()) {
                  var10000 = (ArrayList)var3.next();
                  var10002 = 29014;
                  var10003 = -28801;
                  Intrinsics.checkNotNullExpressionValue(var10000, "next(...)");
                  String var4 = (String)(Object)var10000;
                  if (var1 != null) {
                     MatchResult var8 = llllllIIIlllIlIllIIlIIIIIIIIllIIlllIIIIllllIlIlIIlIIllllIIIlIIllIlIIlIllIlIIIIlIIlIII.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.find(var4, 0);
                     if (var8 != null) {
                        MatchResult var5 = var8;
                        return (String)var5.getGroupValues().get(1);
                     }
                  }
               }

               return null;
            }
         }

         return null;
      }

      private final boolean a(IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var1) {
         String[] var2 = llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII.g();
         boolean var10000 = var1 instanceof IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII;
         if (var2 != null) {
            if (!var10000) {
               var10000 = var1 instanceof IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll;
               if (var2 == null) {
                  return var10000;
               }

               if (!var10000) {
                  var10000 = var1 instanceof llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI;
                  if (var2 == null) {
                     return var10000;
                  }

                  if (!var10000) {
                     return false;
                  }
               }
            }

            var10000 = true;
         }

         return var10000;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: { // PX-FIX
         String[] var5 = new String[2];
         int var3 = 0;
         String var2 = "y&>\u009b7a3¼Æµ\f+\u0019\tË\u0086\u0092ºUÙ^æ\u0003";
         int var4 = "y&>\u009b7a3¼Æµ\f+\u0019\tË\u0086\u0092ºUÙ^æ\u0003".length();
         char var1 = '\r';
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 95;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 95;
                  var10006 = var6;
               } else {
                  var13 = 95;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 95;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 69;
                     case 1 -> 115;
                     case 2 -> 44;
                     case 3 -> 13;
                     case 4 -> 105;
                     case 5 -> 79;
                     default -> 110;
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
               break pxClinit; // PX-FIX
            }

            var1 = var2.charAt(var0);
         }
   } // PX-FIX end pxClinit
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 29015) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 123;
               case 1 -> 69;
               case 2 -> 15;
               case 3 -> 204;
               case 4 -> 167;
               case 5 -> 133;
               case 6 -> 207;
               case 7 -> 224;
               case 8 -> 37;
               case 9 -> 2;
               case 10 -> 46;
               case 11 -> 51;
               case 12 -> 74;
               case 13 -> 143;
               case 14 -> 57;
               case 15 -> 98;
               case 16 -> 93;
               case 17 -> 200;
               case 18 -> 247;
               case 19 -> 155;
               case 20 -> 58;
               case 21 -> 170;
               case 22 -> 124;
               case 23 -> 168;
               case 24 -> 8;
               case 25 -> 10;
               case 26 -> 68;
               case 27 -> 95;
               case 28 -> 238;
               case 29 -> 197;
               case 30 -> 255;
               case 31 -> 122;
               case 32 -> 248;
               case 33 -> 109;
               case 34 -> 159;
               case 35 -> 225;
               case 36 -> 154;
               case 37 -> 126;
               case 38 -> 227;
               case 39 -> 135;
               case 40 -> 9;
               case 41 -> 114;
               case 42 -> 158;
               case 43 -> 138;
               case 44 -> 193;
               case 45 -> 21;
               case 46 -> 14;
               case 47 -> 0;
               case 48 -> 236;
               case 49 -> 196;
               case 50 -> 184;
               case 51 -> 80;
               case 52 -> 165;
               case 53 -> 128;
               case 54 -> 229;
               case 55 -> 222;
               case 56 -> 60;
               case 57 -> 203;
               case 58 -> 67;
               case 59 -> 63;
               case 60 -> 7;
               case 61 -> 249;
               case 62 -> 111;
               case 63 -> 223;
               case 64 -> 161;
               case 65 -> 190;
               case 66 -> 226;
               case 67 -> 45;
               case 68 -> 253;
               case 69 -> 210;
               case 70 -> 221;
               case 71 -> 17;
               case 72 -> 81;
               case 73 -> 107;
               case 74 -> 70;
               case 75 -> 30;
               case 76 -> 240;
               case 77 -> 91;
               case 78 -> 11;
               case 79 -> 66;
               case 80 -> 137;
               case 81 -> 88;
               case 82 -> 157;
               case 83 -> 191;
               case 84 -> 136;
               case 85 -> 41;
               case 86 -> 134;
               case 87 -> 29;
               case 88 -> 118;
               case 89 -> 205;
               case 90 -> 104;
               case 91 -> 174;
               case 92 -> 245;
               case 93 -> 232;
               case 94 -> 149;
               case 95 -> 62;
               case 96 -> 160;
               case 97 -> 35;
               case 98 -> 254;
               case 99 -> 186;
               case 100 -> 42;
               case 101 -> 239;
               case 102 -> 99;
               case 103 -> 76;
               case 104 -> 65;
               case 105 -> 27;
               case 106 -> 115;
               case 107 -> 4;
               case 108 -> 49;
               case 109 -> 64;
               case 110 -> 55;
               case 111 -> 228;
               case 112 -> 141;
               case 113 -> 119;
               case 114 -> 218;
               case 115 -> 156;
               case 116 -> 195;
               case 117 -> 162;
               case 118 -> 194;
               case 119 -> 140;
               case 120 -> 53;
               case 121 -> 36;
               case 122 -> 211;
               case 123 -> 34;
               case 124 -> 22;
               case 125 -> 90;
               case 126 -> 144;
               case 127 -> 185;
               case 128 -> 147;
               case 129 -> 237;
               case 130 -> 235;
               case 131 -> 212;
               case 132 -> 180;
               case 133 -> 40;
               case 134 -> 213;
               case 135 -> 148;
               case 136 -> 120;
               case 137 -> 101;
               case 138 -> 33;
               case 139 -> 32;
               case 140 -> 106;
               case 141 -> 199;
               case 142 -> 105;
               case 143 -> 103;
               case 144 -> 243;
               case 145 -> 31;
               case 146 -> 189;
               case 147 -> 125;
               case 148 -> 3;
               case 149 -> 171;
               case 150 -> 86;
               case 151 -> 25;
               case 152 -> 214;
               case 153 -> 132;
               case 154 -> 129;
               case 155 -> 39;
               case 156 -> 198;
               case 157 -> 116;
               case 158 -> 75;
               case 159 -> 24;
               case 160 -> 117;
               case 161 -> 59;
               case 162 -> 50;
               case 163 -> 215;
               case 164 -> 231;
               case 165 -> 181;
               case 166 -> 78;
               case 167 -> 178;
               case 168 -> 151;
               case 169 -> 250;
               case 170 -> 108;
               case 171 -> 209;
               case 172 -> 19;
               case 173 -> 142;
               case 174 -> 251;
               case 175 -> 163;
               case 176 -> 82;
               case 177 -> 188;
               case 178 -> 244;
               case 179 -> 152;
               case 180 -> 97;
               case 181 -> 85;
               case 182 -> 121;
               case 183 -> 112;
               case 184 -> 173;
               case 185 -> 1;
               case 186 -> 84;
               case 187 -> 47;
               case 188 -> 43;
               case 189 -> 172;
               case 190 -> 169;
               case 191 -> 72;
               case 192 -> 175;
               case 193 -> 145;
               case 194 -> 38;
               case 195 -> 5;
               case 196 -> 166;
               case 197 -> 202;
               case 198 -> 216;
               case 199 -> 83;
               case 200 -> 77;
               case 201 -> 87;
               case 202 -> 73;
               case 203 -> 100;
               case 204 -> 18;
               case 205 -> 71;
               case 206 -> 23;
               case 207 -> 153;
               case 208 -> 94;
               case 209 -> 192;
               case 210 -> 130;
               case 211 -> 241;
               case 212 -> 44;
               case 213 -> 234;
               case 214 -> 246;
               case 215 -> 164;
               case 216 -> 150;
               case 217 -> 26;
               case 218 -> 183;
               case 219 -> 252;
               case 220 -> 208;
               case 221 -> 206;
               case 222 -> 6;
               case 223 -> 28;
               case 224 -> 16;
               case 225 -> 102;
               case 226 -> 79;
               case 227 -> 110;
               case 228 -> 48;
               case 229 -> 20;
               case 230 -> 242;
               case 231 -> 54;
               case 232 -> 219;
               case 233 -> 217;
               case 234 -> 96;
               case 235 -> 131;
               case 236 -> 13;
               case 237 -> 230;
               case 238 -> 220;
               case 239 -> 201;
               case 240 -> 12;
               case 241 -> 177;
               case 242 -> 176;
               case 243 -> 127;
               case 244 -> 92;
               case 245 -> 182;
               case 246 -> 89;
               case 247 -> 187;
               case 248 -> 139;
               case 249 -> 233;
               case 250 -> 146;
               case 251 -> 52;
               case 252 -> 56;
               case 253 -> 61;
               case 254 -> 113;
               default -> 179;
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
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker p0) {  }
      public static boolean a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll p0, me.octo.client.IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI p1) { return p0.a(p1); }
   }
   public static kotlin.text.Regex ai() { return null; }
}
