package me.octo.client.utils;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.MatchResult.Destructured;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import org.jetbrains.annotations.NotNull;

public final class IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl
   extends lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   @NotNull
   public static IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static int IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static int lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static int IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static int llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static int lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static int lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static int lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static int lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static long IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static long llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static long IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static long IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static long IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static long IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private static long llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private static long IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   @NotNull
   private static Regex lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   private static boolean llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   @NotNull
   private static Map<String, IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   private static String[] c;
   private static String[] d;

   private IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl() {
   }

   public final int g() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   public final int h() {
      return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   public final int i() {
      return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   public final int j() {
      return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   public final int k() {
      return lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   public final int l() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   public final int m() {
      return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   public final int n() {
      return lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
      short var10002 = 23959;
      short var10003 = -3867;
      Intrinsics.checkNotNullParameter(var1, "event");
      Packet var3 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      String var2 = var10000;
      boolean var4 = var3 instanceof ClientboundSystemChatPacket;
      if (var2 != null) {
         if (!var4) {
            return;
         }

         var4 = ((ClientboundSystemChatPacket)var3).overlay();
      }

      if (!var4) {
         this.a((ClientboundSystemChatPacket)var3);
      }
   }

   private final void a(ClientboundSystemChatPacket var1) {
      Object var37 = null; // PX-FIX
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
      IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var10001 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      String var10002 = var1.content().getString();
      short var10004 = 23991;
      short var10005 = 18180;
      Intrinsics.checkNotNullExpressionValue(var10002, "getString(...)");
      String var3 = var10001.a(var10002);
      String var2 = var10000;
      if (llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl) {
         short var38 = 23978;
         short var45 = -418;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
            "§7[SkillUtils] Processing action bar: §f" + var3
         );
      }

      for (Entry var5 : lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll.entrySet()) {
         String var6 = (String)var5.getKey();
         IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var7 = (IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var5.getValue();
         boolean var30 = StringsKt.contains(var3, var6, false);

         while (var30) {
            var30 = llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
            if (var2 != null) {
               if (llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl) {
                  short var39 = 23973;
                  short var46 = 276;
                  short var47 = 23997;
                  short var10003 = -31119;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
                     "§7[SkillUtils] Found skill: §a" + var6 + " §7in message"
                  );
               }

               MatchResult var31 = (lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll).find( var3, 0);
               if (var31 != null) {
                  MatchResult var8 = var31;
                  boolean var9 = false;
                  Destructured var10 = var8.getDestructured();
                  String var11 = (String)var10.getMatch().getGroupValues().get(1);
                  String var12 = (String)var10.getMatch().getGroupValues().get(2);
                  if (var2 != null) {
                     Long var32 = StringsKt.toLongOrNull(StringsKt.replace(var11, ",", "", false));
                     if (var32 != null) {
                        long var13 = var32;
                        if (var2 != null) {
                           Long var33 = StringsKt.toLongOrNull(StringsKt.replace(var12, ",", "", false));
                           if (var33 != null) {
                              long var15 = var33;
                              int var34 =(( llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl) ? 1 : 0);
                              if (var2 != null) {
                                 if (llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl) {
                                    short var35 = 23970;
                                    short var40 = 9586;
                                    short var48 = 23967;
                                    short var57 = 3816;
                                    var10004 = 23974;
                                    var10005 = -21211;
                                    me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
                                       "§7[SkillUtils] §a" + var6 + " §7XP: §f" + var13 + "§7/§f" + var15
                                    );
                                 }

                                 long var72;
                                 var34 = (var72 = ((Number)var7.b().invoke()).longValue() - 0L) == 0L ? 0 : (var72 < 0L ? -1 : 1);
                              }

                              if (var2 != null) {
                                 if (var34 < 0) {
                                    var7.c().invoke(var13);
                                    if (llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl) {
                                       short var36 = 23976;
                                       short var41 = -20533;
                                       short var49 = 23979;
                                       short var58 = -17068;
                                       me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
                                          "§7[SkillUtils] §a" + var6 + " §7Initial XP set: §f" + var13
                                       );
                                    }

                                    if (var2 != null) {
                                       return;
                                    }
                                 }

                                 long var73;
                                 var34 = (var73 = var13 - ((Number)var7.b().invoke()).longValue()) == 0L ? 0 : (var73 < 0L ? -1 : 1);
                              }

                              label141: {
                                 if (var2 != null) {
                                    if (var34 < 0) {
                                       int var29 = (int)(var15 - ((Number)var7.b().invoke()).longValue() + var13);
                                       var37 = llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
                                       if (var2 != null) {
                                          if (llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl) {
                                             short var53 = 23976;
                                             short var62 = -20533;
                                             var62 = 23988;
                                             var10004 = -11612;
                                             me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
                                                "§7[SkillUtils] §a" + var6 + " §7Level up detected! Delta: §f" + var29
                                             );
                                          }

                                          var37 = var29;
                                       }
                                       break label141;
                                    }

                                    long var74;
                                    var34 = (var74 = var13 - ((Number)var7.b().invoke()).longValue()) == 0L ? 0 : (var74 < 0L ? -1 : 1);
                                 }

                                 if (var2 != null) {
                                    if (var34 > 0) {
                                       int var17 = (int)(var13 - ((Number)var7.b().invoke()).longValue());
                                       var37 = llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
                                       if (var2 != null) {
                                          if (llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl) {
                                             short var52 = 23976;
                                             short var60 = -20533;
                                             var60 = 23962;
                                             var10004 = 20568;
                                             me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
                                                "§7[SkillUtils] §a" + var6 + " §7XP gained: §f" + var17
                                             );
                                          }

                                          var37 = var17;
                                       }
                                       break label141;
                                    }

                                    var34 =(( llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl) ? 1 : 0);
                                 }

                                 if (var34 != 0) {
                                    short var42 = 23976;
                                    short var50 = -20533;
                                    short var51 = 23982;
                                    short var59 = -19129;
                                    me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
                                       "§7[SkillUtils] §a" + var6 + " §7No XP change"
                                    );
                                 }

                                 var37 = 0;
                              }

                              int var18 =((Integer)( var37));
                              if (var2 != null) {
                                 if (var18 > 0) {
                                    var7.e().invoke(((Number)var7.d().invoke()).intValue() + var18);
                                    if (var2 == null) {
                                       return;
                                    }

                                    if (llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl) {
                                       Object var43 = var7.d().invoke();
                                       short var54 = 23976;
                                       short var64 = -20533;
                                       var64 = 23956;
                                       var10004 = -15276;
                                       me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
                                          "§7[SkillUtils] §a" + var6 + " §7Total XP gained: §f" + var43
                                       );
                                    }
                                 }

                                 var7.c().invoke(var13);
                                 return;
                              }
                           }

                           return;
                        }
                     }

                     return;
                  }
               } else {
                  IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl var27 = this;
                  boolean var28 = false;
                  if (var2 != null && llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl) {
                     short var44 = 23976;
                     short var55 = -20533;
                     short var56 = 23993;
                     short var66 = -23690;
                     me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
                        "§7[SkillUtils] §a" + var6 + " §7found but no XP regex match"
                     );
                  }
               }

               return;
            }
         }
      }
   }

   public final void o() {
      String var1 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
      if (llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl) {
         short var10000 = 23992;
         short var10001 = -2656;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
            "§7[SkillUtils] Resetting ALL skill trackers"
         );
      }

      for (Entry var3 : lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll.entrySet()) {
         String var4 = (String)var3.getKey();
         IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var5 = (IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var3.getValue();
         var5.e().invoke(0);
         var5.c().invoke(-1L);
         if (var1 != null) {
            if (!llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl) {
               continue;
            }

            short var6 = 23965;
            short var10002 = 19756;
            var10002 = 23963;
            short var10003 = 2521;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
               "§7[SkillUtils] Reset §a" + var4 + " §7tracker"
            );
         }

         if (var1 == null) {
            break;
         }
      }
   }

   public final void a(@NotNull String var1) {
      String var2 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
      Object var10000 = var1;
      if (var2 != null) {
         short var10001 = 23986;
         short var10002 = 21820;
         Intrinsics.checkNotNullParameter(var1, "skillName");
         if (llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl) {
            var10001 = 23984;
            var10002 = -14280;
            var10002 = 23960;
            short var10003 = 2327;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
               "§7[SkillUtils] Resetting §a" + var1 + " §7tracker"
            );
         }

         var10000 = lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll.get(var1);
      }

      var10000 = (IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
      if ((IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000
         != null) {
         IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         boolean var4 = false;
         var3.e().invoke(0);
         var3.c().invoke(-1L);
      } else {
         IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl var5 = this;
         boolean var6 = false;
         if (var2 != null && llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl) {
            short var9 = 23961;
            short var12 = 997;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
               "§7[SkillUtils] Invalid skill name: §c" + var1
            );
         }
      }

      if (var2 == null) {
         lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[5]
         );
      }
   }

   public final int b(@NotNull String var1) {
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
      short var10002 = 23983;
      short var10003 = -17289;
      Intrinsics.checkNotNullParameter(var1, "skillName");
      String var2 = var10000;
      if (var2 != null) {
         IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var5 = lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll.get(
            var1
         );
         if (var5 != null) {
            Function0 var6 = var5.d();
            if (var6 != null) {
               Function0 var3 = var6;
               boolean var4 = false;
               return ((Number)var3.invoke()).intValue();
            }
         }
      }

      return 0;
   }

   public final boolean p() {
      String var1 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
      short var10000 =((short)(( llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl) ? 1 : 0));
      if (var1 != null) {
         var10000 =((short)(( !llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl) ? 1 : 0));
      }

      llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = (var10000 != 0);
      String var3;
      if (llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl) {
         var10000 = 23999;
         short var10001 = -7446;
         var3 = "enabled";
      } else {
         var10000 = 23987;
         short var5 = 5759;
         var3 = "disabled";
      }

      short var6 = 23980;
      short var10002 = 26848;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§e[SkillUtils] Debug mode " + var3);
      return llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   }

   public final boolean q() {
      return llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   }

   private static final long r() {
      return IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   }

   private static final Unit b(long var0) {
      IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var0;
      return Unit.INSTANCE;
   }

   private static final int s() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   private static final Unit b(int var0) {
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var0;
      return Unit.INSTANCE;
   }

   private static final long t() {
      return llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   }

   private static final Unit c(long var0) {
      llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var0;
      return Unit.INSTANCE;
   }

   private static final int u() {
      return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   private static final Unit c(int var0) {
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var0;
      return Unit.INSTANCE;
   }

   private static final long v() {
      return IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   }

   private static final Unit d(long var0) {
      IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = var0;
      return Unit.INSTANCE;
   }

   private static final int w() {
      return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   private static final Unit d(int var0) {
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var0;
      return Unit.INSTANCE;
   }

   private static final long x() {
      return IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   }

   private static final Unit e(long var0) {
      IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var0;
      return Unit.INSTANCE;
   }

   private static final int y() {
      return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   private static final Unit e(int var0) {
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var0;
      return Unit.INSTANCE;
   }

   private static final long z() {
      return IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   }

   private static final Unit f(long var0) {
      IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = var0;
      return Unit.INSTANCE;
   }

   private static final int A() {
      return lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   private static final Unit f(int var0) {
      lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var0;
      return Unit.INSTANCE;
   }

   private static final long B() {
      return IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   }

   private static final Unit g(long var0) {
      IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = var0;
      return Unit.INSTANCE;
   }

   private static final int C() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   private static final Unit g(int var0) {
      lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var0;
      return Unit.INSTANCE;
   }

   private static final long D() {
      return llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   }

   private static final Unit h(long var0) {
      llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = var0;
      return Unit.INSTANCE;
   }

   private static final int E() {
      return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   private static final Unit h(int var0) {
      lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var0;
      return Unit.INSTANCE;
   }

   private static final long F() {
      return IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   }

   private static final Unit i(long var0) {
      IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = var0;
      return Unit.INSTANCE;
   }

   private static final int G() {
      return lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   }

   private static final Unit i(int var0) {
      lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var0;
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var21 = null; // PX-FIX
      String[] var5 = new String[43];
      int var3 = 0;
      String var2 = "\u0092\u0093ó3\u000fd½\u0087æ\u0007Jq\u0099\u0082\u0017\u0012\u0018\f;\u001fµEÝªýo\u0081¶¦(\råe×û@\u0012¹ó.¼Ôè»\u00170Ì\u0081\u0082(DuÜGaZHfç!KS ,\u009f%\u0011+\t\u0002\u0092à\u001fLDÕ\u0083ë+%xÔàÄE\u008dp¯ã\u000eïÿ>2É\u007f?F\u0087\n\u0093\u007f)\u0001êA\u0007=ü\u0090\u0086}ñ\u0011[Þ\u0088é2^M\u0081\u001e\u009dÕØâ \u008a\u0087\u001eÙ1\u0007y\u0012Äù±\u009d/ÅÄ\u00863Öí^¢\u0087\u009f.Ë\u0006nZ\u0006\u0002kj\u000eÔ+\u001d\u0092(\u0010é ´ç^ú\u0007â\u001f\u009fÒ\u0098(¢¿\u0087Ó³\u0096O,ú»3q\u0087þ\u009fHd1g\u001f![\u00adÔ(ê?\u0006\u0091ß\fv%\u009d\t\u0088Ç\u001dÿ\u008eY.1G\bcï\u008fµ\u008b\u009eE¦\u001bßç\u008b\u0013/;ð¿\u0000\u001aûÐAÙå5\u0085 \u0019táí\u0002æ®õ\u0099\tµ\u0019àÇsù¡W¸\u000fº÷<\u008e<\u007f\"k\u009d,\u0092îP\u0088<\t\u0013vnÉà\u009fãéþ\u001aR :ó\u0019'6<ØjàÞ\"\u0018\u0089\u001b\b ¸T\u0093\u009c\u0093Oø$\b\u009bÑi·\u0089¥[Î(5=ÖH\u0084P\u0085Ò®·.eûo²áxdUb©\u0006ëË3ÿ\u0085Çy4ÂÁÿðÅ²e2\u001b\u0001\u00151eMÛ\u0013{Ê²h\u0006\r|Ü\u0083B\u009bYíôn£\u0011b&<+Ù<._Û\u0006\u0080S.©\bÎ<\u0007zÛ=\u009fÈòÖ\u0005éù9$\u008e\u0007\u009dÙ7v¶i\u008a\nx¡¯º«zï\u009c¬\u0010\u001e\u0094\u000fâ\u000e\u0002\u0098UË´\u0094m\u0001\u0093ã¿fÄZqýÒÔ¿\u0096ðÿÌA³Ç\u0011ã\u0098\füßÆî\u0000Ãí\u0083.N\u0006\u0004;½\bÖ1^¨\u00958(Ô\u000b×.ÿ\u0095£«¶Tÿ\u0096´\u0007ÀÞ\u009d\u009aÂQ\u0004\n¡0Â 3\u0016 ø:D\t\u0080Ù{]ëËxSç\t17\u0007¶¼ÏUØ\u0083\u0017oæ\u009d3í?¨?\u000b\n\u009aÒm\u0099`=5¡\u000fTw'\u0001\u0010±v]¨/o§X¼PÛÈ\u0081®\u001a=\nA®C\u009fÎaùúÿS\n\u008e?º\u00adñ'\u001e2\u0003J%!«T\u009aÔ\n\u008f\u0099ïÞ\u0006HþÊ\u0012LpòÉ\u0083b\u0005\u0082Cr\u0019-t\u0094«¯ÖØ)\u008d\u000f\\\b/ó\n7êÌÙ\u0092";
      int var4 = "\u0092\u0093ó3\u000fd½\u0087æ\u0007Jq\u0099\u0082\u0017\u0012\u0018\f;\u001fµEÝªýo\u0081¶¦(\råe×û@\u0012¹ó.¼Ôè»\u00170Ì\u0081\u0082(DuÜGaZHfç!KS ,\u009f%\u0011+\t\u0002\u0092à\u001fLDÕ\u0083ë+%xÔàÄE\u008dp¯ã\u000eïÿ>2É\u007f?F\u0087\n\u0093\u007f)\u0001êA\u0007=ü\u0090\u0086}ñ\u0011[Þ\u0088é2^M\u0081\u001e\u009dÕØâ \u008a\u0087\u001eÙ1\u0007y\u0012Äù±\u009d/ÅÄ\u00863Öí^¢\u0087\u009f.Ë\u0006nZ\u0006\u0002kj\u000eÔ+\u001d\u0092(\u0010é ´ç^ú\u0007â\u001f\u009fÒ\u0098(¢¿\u0087Ó³\u0096O,ú»3q\u0087þ\u009fHd1g\u001f![\u00adÔ(ê?\u0006\u0091ß\fv%\u009d\t\u0088Ç\u001dÿ\u008eY.1G\bcï\u008fµ\u008b\u009eE¦\u001bßç\u008b\u0013/;ð¿\u0000\u001aûÐAÙå5\u0085 \u0019táí\u0002æ®õ\u0099\tµ\u0019àÇsù¡W¸\u000fº÷<\u008e<\u007f\"k\u009d,\u0092îP\u0088<\t\u0013vnÉà\u009fãéþ\u001aR :ó\u0019'6<ØjàÞ\"\u0018\u0089\u001b\b ¸T\u0093\u009c\u0093Oø$\b\u009bÑi·\u0089¥[Î(5=ÖH\u0084P\u0085Ò®·.eûo²áxdUb©\u0006ëË3ÿ\u0085Çy4ÂÁÿðÅ²e2\u001b\u0001\u00151eMÛ\u0013{Ê²h\u0006\r|Ü\u0083B\u009bYíôn£\u0011b&<+Ù<._Û\u0006\u0080S.©\bÎ<\u0007zÛ=\u009fÈòÖ\u0005éù9$\u008e\u0007\u009dÙ7v¶i\u008a\nx¡¯º«zï\u009c¬\u0010\u001e\u0094\u000fâ\u000e\u0002\u0098UË´\u0094m\u0001\u0093ã¿fÄZqýÒÔ¿\u0096ðÿÌA³Ç\u0011ã\u0098\füßÆî\u0000Ãí\u0083.N\u0006\u0004;½\bÖ1^¨\u00958(Ô\u000b×.ÿ\u0095£«¶Tÿ\u0096´\u0007ÀÞ\u009d\u009aÂQ\u0004\n¡0Â 3\u0016 ø:D\t\u0080Ù{]ëËxSç\t17\u0007¶¼ÏUØ\u0083\u0017oæ\u009d3í?¨?\u000b\n\u009aÒm\u0099`=5¡\u000fTw'\u0001\u0010±v]¨/o§X¼PÛÈ\u0081®\u001a=\nA®C\u009fÎaùúÿS\n\u008e?º\u00adñ'\u001e2\u0003J%!«T\u009aÔ\n\u008f\u0099ïÞ\u0006HþÊ\u0012LpòÉ\u0083b\u0005\u0082Cr\u0019-t\u0094«¯ÖØ)\u008d\u000f\\\b/ó\n7êÌÙ\u0092"
         .length();
      char var1 = '\t';
      int var9 = -1;

      label52:
      while (true) {
         byte var10000 = 68;
         String var10001 = var2.substring(++var9, var9 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var34 = var10001.toCharArray();
               int var10004 = var34.length;
               int var6 = 0;
               byte var37 = var10000;
               var21 = var34;
               int var15 = var10004;
               byte var51;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var34;
                  var51 = var10000;
                  var10006 = var6;
               } else {
                  var37 = var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var55 = var34;
                  var51 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var55[var10006] = (char)(var55[var10006] ^ var51 ^ switch (var6 % 7) {
                     case 0 -> 20;
                     case 1 -> 44;
                     case 2 -> 54;
                     case 3 -> 36;
                     case 4 -> 15;
                     case 5 -> 65;
                     default -> 82;
                  });
                  var6++;
                  if (var37 == 0) {
                     var10006 = var37;
                     var55 = var21;
                     var51 = var37;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var55 = var21;
                     var51 = var37;
                     var10006 = var6;
                  }
               }
            }

            String var39 = new String(var21).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var39;
                  if ((var9 += var1) >= var4) {
                     c = var5;
                     d = new String[43];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl();
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = -1L;
                     llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = -1L;
                     IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = -1L;
                     IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = -1L;
                     IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = -1L;
                     IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = -1L;
                     llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = -1L;
                     IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = -1L;
                     var10002 = 23994;
                     short var40 = 29989;
                     lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = new Regex("\\(([0-9,]+)/([0-9,]+)\\)");
                     Pair[] var7 = new Pair[8];
                     var10002 = 23989;
                     short var41 = -18848;
                     short var59 = 23981;
                     short var70 = -6986;
                     var7[0] = TuplesKt.to(
                        "Combat",
                        new IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                           "combatXp",
                           IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl::r,
                           IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl::b,
                           IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl::s,
                           IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl::b
                        )
                     );
                     var10002 = 23975;
                     short var42 = 22804;
                     var59 = 23995;
                     var70 = -26832;
                     var7[1] = TuplesKt.to(
                        "Farming",
                        new IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                           "farmingXp",
                           IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl::t,
                           IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl::c,
                           IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl::u,
                           IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl::c
                        )
                     );
                     var10002 = 23969;
                     short var43 = 2561;
                     var59 = 23998;
                     var70 = -14889;
                     var7[2] = TuplesKt.to(
                        "Fishing",
                        new IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                           "fishingXp",
                           IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl::v,
                           IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl::d,
                           IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl::w,
                           IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl::d
                        )
                     );
                     var10002 = 23971;
                     short var44 = 10418;
                     var59 = 23972;
                     var70 = 682;
                     var7[3] = TuplesKt.to(
                        "Foraging",
                        new IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                           "foragingXp",
                           IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl::x,
                           IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl::e,
                           IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl::y,
                           IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl::e
                        )
                     );
                     var10002 = 23966;
                     short var45 = -2187;
                     var59 = 23996;
                     var70 = -6951;
                     var7[4] = TuplesKt.to(
                        "Enchanting",
                        new IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                           "enchantingXp",
                           IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl::z,
                           IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl::f,
                           IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl::A,
                           IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl::f
                        )
                     );
                     var10002 = 23977;
                     short var46 = -19392;
                     var59 = 23985;
                     var70 = 15780;
                     var7[5] = TuplesKt.to(
                        "Alchemy",
                        new IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                           "alchemyXp",
                           IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl::B,
                           IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl::g,
                           IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl::C,
                           IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl::g
                        )
                     );
                     var10002 = 23964;
                     short var47 = 20789;
                     var59 = 23968;
                     var70 = 25890;
                     var7[6] = TuplesKt.to(
                        "Carpentry",
                        new IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                           "carpentryXp",
                           IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl::D,
                           IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl::h,
                           IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl::E,
                           IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl::h
                        )
                     );
                     var10002 = 23990;
                     short var48 = -21566;
                     var59 = 23958;
                     var70 = 1045;
                     var7[7] = TuplesKt.to(
                        "Taming",
                        new IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                           "tamingXp",
                           IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl::F,
                           IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl::i,
                           IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl::G,
                           IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl::i
                        )
                     );
                     lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = MapsKt.mapOf(var7);
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var9);
                  break;
               default:
                  var5[var3++] = var39;
                  if ((var9 += var1) < var4) {
                     var1 = var2.charAt(var9);
                     continue label52;
                  }

                  var2 = "\u000f3\u008efÒ\u0016\rBq\u0099.+â¸ m¦`[\u008dÂ\u0083ºa\u001aV]Ã";
                  var4 = "\u000f3\u008efÒ\u0016\rBq\u0099.+â¸ m¦`[\u008dÂ\u0083ºa\u001aV]Ã".length();
                  var1 = 5;
                  var9 = -1;
            }

            var10000 = 120;
            var10001 = var2.substring(++var9, var9 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 23998) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 36;
            case 1 -> 74;
            case 2 -> 59;
            case 3 -> 150;
            case 4 -> 249;
            case 5 -> 232;
            case 6 -> 27;
            case 7 -> 123;
            case 8 -> 214;
            case 9 -> 108;
            case 10 -> 236;
            case 11 -> 190;
            case 12 -> 42;
            case 13 -> 173;
            case 14 -> 146;
            case 15 -> 56;
            case 16 -> 161;
            case 17 -> 168;
            case 18 -> 75;
            case 19 -> 68;
            case 20 -> 84;
            case 21 -> 235;
            case 22 -> 192;
            case 23 -> 109;
            case 24 -> 160;
            case 25 -> 34;
            case 26 -> 107;
            case 27 -> 47;
            case 28 -> 215;
            case 29 -> 73;
            case 30 -> 226;
            case 31 -> 246;
            case 32 -> 136;
            case 33 -> 83;
            case 34 -> 76;
            case 35 -> 164;
            case 36 -> 85;
            case 37 -> 253;
            case 38 -> 113;
            case 39 -> 141;
            case 40 -> 92;
            case 41 -> 3;
            case 42 -> 213;
            case 43 -> 5;
            case 44 -> 72;
            case 45 -> 91;
            case 46 -> 251;
            case 47 -> 48;
            case 48 -> 245;
            case 49 -> 13;
            case 50 -> 54;
            case 51 -> 40;
            case 52 -> 135;
            case 53 -> 163;
            case 54 -> 44;
            case 55 -> 159;
            case 56 -> 46;
            case 57 -> 189;
            case 58 -> 90;
            case 59 -> 247;
            case 60 -> 58;
            case 61 -> 120;
            case 62 -> 88;
            case 63 -> 148;
            case 64 -> 201;
            case 65 -> 8;
            case 66 -> 239;
            case 67 -> 71;
            case 68 -> 64;
            case 69 -> 171;
            case 70 -> 179;
            case 71 -> 217;
            case 72 -> 176;
            case 73 -> 207;
            case 74 -> 240;
            case 75 -> 218;
            case 76 -> 172;
            case 77 -> 99;
            case 78 -> 195;
            case 79 -> 106;
            case 80 -> 82;
            case 81 -> 155;
            case 82 -> 252;
            case 83 -> 208;
            case 84 -> 115;
            case 85 -> 122;
            case 86 -> 154;
            case 87 -> 230;
            case 88 -> 191;
            case 89 -> 103;
            case 90 -> 24;
            case 91 -> 0;
            case 92 -> 53;
            case 93 -> 162;
            case 94 -> 41;
            case 95 -> 234;
            case 96 -> 233;
            case 97 -> 19;
            case 98 -> 140;
            case 99 -> 223;
            case 100 -> 55;
            case 101 -> 156;
            case 102 -> 79;
            case 103 -> 110;
            case 104 -> 116;
            case 105 -> 199;
            case 106 -> 211;
            case 107 -> 203;
            case 108 -> 100;
            case 109 -> 63;
            case 110 -> 229;
            case 111 -> 138;
            case 112 -> 80;
            case 113 -> 15;
            case 114 -> 188;
            case 115 -> 101;
            case 116 -> 243;
            case 117 -> 206;
            case 118 -> 196;
            case 119 -> 202;
            case 120 -> 20;
            case 121 -> 4;
            case 122 -> 102;
            case 123 -> 157;
            case 124 -> 118;
            case 125 -> 204;
            case 126 -> 78;
            case 127 -> 10;
            case 128 -> 57;
            case 129 -> 169;
            case 130 -> 210;
            case 131 -> 241;
            case 132 -> 33;
            case 133 -> 18;
            case 134 -> 242;
            case 135 -> 62;
            case 136 -> 142;
            case 137 -> 104;
            case 138 -> 52;
            case 139 -> 1;
            case 140 -> 2;
            case 141 -> 134;
            case 142 -> 144;
            case 143 -> 16;
            case 144 -> 43;
            case 145 -> 87;
            case 146 -> 225;
            case 147 -> 69;
            case 148 -> 67;
            case 149 -> 96;
            case 150 -> 105;
            case 151 -> 198;
            case 152 -> 119;
            case 153 -> 175;
            case 154 -> 129;
            case 155 -> 50;
            case 156 -> 93;
            case 157 -> 255;
            case 158 -> 111;
            case 159 -> 231;
            case 160 -> 128;
            case 161 -> 127;
            case 162 -> 38;
            case 163 -> 97;
            case 164 -> 39;
            case 165 -> 23;
            case 166 -> 254;
            case 167 -> 152;
            case 168 -> 139;
            case 169 -> 126;
            case 170 -> 166;
            case 171 -> 131;
            case 172 -> 12;
            case 173 -> 61;
            case 174 -> 197;
            case 175 -> 89;
            case 176 -> 158;
            case 177 -> 221;
            case 178 -> 185;
            case 179 -> 94;
            case 180 -> 26;
            case 181 -> 220;
            case 182 -> 30;
            case 183 -> 200;
            case 184 -> 117;
            case 185 -> 7;
            case 186 -> 238;
            case 187 -> 178;
            case 188 -> 35;
            case 189 -> 11;
            case 190 -> 60;
            case 191 -> 228;
            case 192 -> 194;
            case 193 -> 222;
            case 194 -> 51;
            case 195 -> 112;
            case 196 -> 177;
            case 197 -> 182;
            case 198 -> 86;
            case 199 -> 165;
            case 200 -> 133;
            case 201 -> 216;
            case 202 -> 183;
            case 203 -> 14;
            case 204 -> 29;
            case 205 -> 137;
            case 206 -> 9;
            case 207 -> 181;
            case 208 -> 248;
            case 209 -> 77;
            case 210 -> 170;
            case 211 -> 49;
            case 212 -> 250;
            case 213 -> 227;
            case 214 -> 31;
            case 215 -> 124;
            case 216 -> 145;
            case 217 -> 244;
            case 218 -> 121;
            case 219 -> 22;
            case 220 -> 37;
            case 221 -> 65;
            case 222 -> 25;
            case 223 -> 167;
            case 224 -> 95;
            case 225 -> 151;
            case 226 -> 28;
            case 227 -> 147;
            case 228 -> 186;
            case 229 -> 32;
            case 230 -> 219;
            case 231 -> 17;
            case 232 -> 114;
            case 233 -> 132;
            case 234 -> 125;
            case 235 -> 81;
            case 236 -> 70;
            case 237 -> 180;
            case 238 -> 98;
            case 239 -> 45;
            case 240 -> 153;
            case 241 -> 193;
            case 242 -> 149;
            case 243 -> 66;
            case 244 -> 174;
            case 245 -> 205;
            case 246 -> 21;
            case 247 -> 130;
            case 248 -> 237;
            case 249 -> 209;
            case 250 -> 187;
            case 251 -> 224;
            case 252 -> 143;
            case 253 -> 212;
            case 254 -> 184;
            default -> 6;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @NotNull
      private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final Function0<Long> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final Function1<Long, Unit> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @NotNull
      private final Function0<Integer> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      @NotNull
      private final Function1<Integer, Unit> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         @NotNull String var1,
         @NotNull Function0<Long> var2,
         @NotNull Function1<? super Long, Unit> var3,
         @NotNull Function0<Integer> var4,
         @NotNull Function1<? super Integer, Unit> var5
      ) {
         short var10001 = -12947;
         short var10002 = 5478;
         Intrinsics.checkNotNullParameter(var1, "eventName");
         var10001 = -12946;
         var10002 = -20642;
         Intrinsics.checkNotNullParameter(var2, "getLastTotal");
         var10001 = -12945;
         var10002 = -25743;
         Intrinsics.checkNotNullParameter(var3, "setLastTotal");
         var10001 = -12949;
         var10002 = -30929;
         Intrinsics.checkNotNullParameter(var4, "getDynamicXp");
         var10001 = -12948;
         var10002 = -14527;
         Intrinsics.checkNotNullParameter(var5, "setDynamicXp");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = ((Function1<Long,Unit>)(Object)(var3));
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = ((Function1<Integer,Unit>)(Object)(var5));
      }

      @NotNull
      public final String a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final Function0<Long> b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final Function1<Long, Unit> c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final Function0<Integer> d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final Function1<Integer, Unit> e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[5];
         int var3 = 0;
         String var2 = "ùs ÿ\u009eÆ¢ÐâÆ«O\f%\u0012-Ó?C\u0096`dÐ{\u008d\t\u009d=ie\u0091Îár7";
         int var4 = "ùs ÿ\u009eÆ¢ÐâÆ«O\f%\u0012-Ó?C\u0096`dÐ{\u008d\t\u009d=ie\u0091Îár7".length();
         char var1 = '\f';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 113;
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
                        case 0 -> 16;
                        case 1 -> 114;
                        case 2 -> 43;
                        case 3 -> 5;
                        case 4 -> 59;
                        case 5 -> 112;
                        default -> 112;
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
                        b = new String[5];
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

                     var2 = "O±U\f\u008b\u000f\u00adÍ\u0011Ï\u0089$\f5½\u008c\u008d°?ÊËý\u000f\u0014<";
                     var4 = "O±U\f\u008b\u000f\u00adÍ\u0011Ï\u0089$\f5½\u008c\u008d°?ÊËý\u000f\u0014<".length();
                     var1 = '\f';
                     var8 = -1;
               }

               var10000 = 31;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
   } // PX-FIX end pxClinit
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -12945) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 137;
               case 1 -> 43;
               case 2 -> 213;
               case 3 -> 118;
               case 4 -> 132;
               case 5 -> 150;
               case 6 -> 175;
               case 7 -> 230;
               case 8 -> 247;
               case 9 -> 241;
               case 10 -> 154;
               case 11 -> 253;
               case 12 -> 39;
               case 13 -> 200;
               case 14 -> 16;
               case 15 -> 188;
               case 16 -> 139;
               case 17 -> 246;
               case 18 -> 113;
               case 19 -> 29;
               case 20 -> 24;
               case 21 -> 89;
               case 22 -> 46;
               case 23 -> 94;
               case 24 -> 187;
               case 25 -> 142;
               case 26 -> 202;
               case 27 -> 146;
               case 28 -> 147;
               case 29 -> 198;
               case 30 -> 165;
               case 31 -> 17;
               case 32 -> 182;
               case 33 -> 100;
               case 34 -> 181;
               case 35 -> 212;
               case 36 -> 90;
               case 37 -> 35;
               case 38 -> 52;
               case 39 -> 57;
               case 40 -> 168;
               case 41 -> 3;
               case 42 -> 140;
               case 43 -> 36;
               case 44 -> 51;
               case 45 -> 189;
               case 46 -> 98;
               case 47 -> 61;
               case 48 -> 23;
               case 49 -> 41;
               case 50 -> 170;
               case 51 -> 179;
               case 52 -> 123;
               case 53 -> 225;
               case 54 -> 125;
               case 55 -> 37;
               case 56 -> 126;
               case 57 -> 240;
               case 58 -> 210;
               case 59 -> 54;
               case 60 -> 131;
               case 61 -> 216;
               case 62 -> 28;
               case 63 -> 58;
               case 64 -> 14;
               case 65 -> 84;
               case 66 -> 8;
               case 67 -> 164;
               case 68 -> 59;
               case 69 -> 68;
               case 70 -> 38;
               case 71 -> 255;
               case 72 -> 229;
               case 73 -> 143;
               case 74 -> 185;
               case 75 -> 248;
               case 76 -> 121;
               case 77 -> 75;
               case 78 -> 244;
               case 79 -> 83;
               case 80 -> 215;
               case 81 -> 232;
               case 82 -> 73;
               case 83 -> 33;
               case 84 -> 231;
               case 85 -> 67;
               case 86 -> 106;
               case 87 -> 76;
               case 88 -> 148;
               case 89 -> 116;
               case 90 -> 12;
               case 91 -> 136;
               case 92 -> 149;
               case 93 -> 115;
               case 94 -> 193;
               case 95 -> 92;
               case 96 -> 64;
               case 97 -> 96;
               case 98 -> 197;
               case 99 -> 133;
               case 100 -> 117;
               case 101 -> 103;
               case 102 -> 209;
               case 103 -> 78;
               case 104 -> 199;
               case 105 -> 180;
               case 106 -> 128;
               case 107 -> 239;
               case 108 -> 159;
               case 109 -> 34;
               case 110 -> 223;
               case 111 -> 208;
               case 112 -> 88;
               case 113 -> 177;
               case 114 -> 82;
               case 115 -> 129;
               case 116 -> 174;
               case 117 -> 169;
               case 118 -> 167;
               case 119 -> 65;
               case 120 -> 60;
               case 121 -> 87;
               case 122 -> 120;
               case 123 -> 11;
               case 124 -> 71;
               case 125 -> 70;
               case 126 -> 85;
               case 127 -> 9;
               case 128 -> 108;
               case 129 -> 6;
               case 130 -> 40;
               case 131 -> 53;
               case 132 -> 250;
               case 133 -> 171;
               case 134 -> 233;
               case 135 -> 156;
               case 136 -> 251;
               case 137 -> 119;
               case 138 -> 80;
               case 139 -> 219;
               case 140 -> 252;
               case 141 -> 104;
               case 142 -> 138;
               case 143 -> 249;
               case 144 -> 27;
               case 145 -> 45;
               case 146 -> 112;
               case 147 -> 110;
               case 148 -> 42;
               case 149 -> 161;
               case 150 -> 99;
               case 151 -> 166;
               case 152 -> 134;
               case 153 -> 130;
               case 154 -> 211;
               case 155 -> 86;
               case 156 -> 15;
               case 157 -> 207;
               case 158 -> 44;
               case 159 -> 107;
               case 160 -> 48;
               case 161 -> 18;
               case 162 -> 55;
               case 163 -> 91;
               case 164 -> 102;
               case 165 -> 144;
               case 166 -> 184;
               case 167 -> 22;
               case 168 -> 47;
               case 169 -> 203;
               case 170 -> 176;
               case 171 -> 191;
               case 172 -> 72;
               case 173 -> 145;
               case 174 -> 50;
               case 175 -> 190;
               case 176 -> 227;
               case 177 -> 95;
               case 178 -> 206;
               case 179 -> 32;
               case 180 -> 5;
               case 181 -> 160;
               case 182 -> 172;
               case 183 -> 162;
               case 184 -> 111;
               case 185 -> 192;
               case 186 -> 178;
               case 187 -> 0;
               case 188 -> 105;
               case 189 -> 114;
               case 190 -> 214;
               case 191 -> 186;
               case 192 -> 155;
               case 193 -> 26;
               case 194 -> 236;
               case 195 -> 194;
               case 196 -> 63;
               case 197 -> 101;
               case 198 -> 30;
               case 199 -> 49;
               case 200 -> 20;
               case 201 -> 218;
               case 202 -> 79;
               case 203 -> 224;
               case 204 -> 62;
               case 205 -> 4;
               case 206 -> 151;
               case 207 -> 221;
               case 208 -> 217;
               case 209 -> 97;
               case 210 -> 135;
               case 211 -> 74;
               case 212 -> 69;
               case 213 -> 124;
               case 214 -> 13;
               case 215 -> 2;
               case 216 -> 204;
               case 217 -> 10;
               case 218 -> 222;
               case 219 -> 19;
               case 220 -> 234;
               case 221 -> 109;
               case 222 -> 153;
               case 223 -> 254;
               case 224 -> 31;
               case 225 -> 141;
               case 226 -> 21;
               case 227 -> 1;
               case 228 -> 245;
               case 229 -> 173;
               case 230 -> 235;
               case 231 -> 66;
               case 232 -> 158;
               case 233 -> 157;
               case 234 -> 183;
               case 235 -> 25;
               case 236 -> 122;
               case 237 -> 237;
               case 238 -> 163;
               case 239 -> 81;
               case 240 -> 228;
               case 241 -> 201;
               case 242 -> 77;
               case 243 -> 238;
               case 244 -> 242;
               case 245 -> 7;
               case 246 -> 226;
               case 247 -> 196;
               case 248 -> 56;
               case 249 -> 152;
               case 250 -> 127;
               case 251 -> 220;
               case 252 -> 205;
               case 253 -> 243;
               case 254 -> 93;
               default -> 195;
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
}
