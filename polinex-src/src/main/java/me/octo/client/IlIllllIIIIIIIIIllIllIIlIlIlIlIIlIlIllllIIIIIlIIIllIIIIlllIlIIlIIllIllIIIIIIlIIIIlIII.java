package me.octo.client;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.resources.sounds.SimpleSoundInstance;
import net.minecraft.sounds.SoundEvents;
import org.jetbrains.annotations.NotNull;

public final class IlIllllIIIIIIIIIllIllIIlIlIlIlIIlIlIllllIIIIIlIIIllIIIIlllIlIIlIIllIllIIIIIIlIIIIlIII
   extends IlIlIIIllIIlIIlllIlIlIlIIlIIIlIllIllIIIllIIlIlIIllIIlIIlIlllIIIlllIlIIlIIIIlIllIlIlII {
   
   
   @NotNull
   public static IlIllllIIIIIIIIIllIllIIlIlIlIlIIlIlIllllIIIIIlIIIllIIIIlllIlIIlIIllIllIIIIIIlIIIIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private static me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static boolean lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static boolean lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private static HashMap<UUID, Long> lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] c;
   private static String[] d;

   public IlIllllIIIIIIIIIllIllIIlIlIlIlIIlIlIllllIIIIIlIIIllIIIIlllIlIIlIIllIllIIIIIIlIIIIlIII() {
      short var10001 = -20681;
      short var10002 = 16217;
      super("Player Notifier");
      me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .a(this);
   }

   @Override
   public void g() {
      if (!IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.a()) {
         this.a(true);
      }
   }

   @SubscribeEvent
   public final void b(@NotNull me.octo.client.events.impl.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl var1) {
      boolean var37 = false; // PX-FIX
      String var10000 = IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.B();
      short var10002 = -20680;
      short var10003 = -14474;
      Intrinsics.checkNotNullParameter(var1, "event");
      String var2 = var10000;
      boolean var36;
      if (var2 != null
         && lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
            != null) {
         var36 = lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
            .D();
         if (var2 != null) {
            ;
         }
      } else {
         var36 = false;
      }

      boolean var3 = var36;
      var37 = var3;
      label162:
      if (var2 != null) {
         if (var3) {
            var37 = IIIllIIlllllIlIlllIIIlllIIlIlIllllIlIIlIIllIllIlllllIIIllllIIIIIlIIlIIlllIIIlIlllIlIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
               .aA();
            if (var2 == null) {
               break label162;
            }

            if (var37) {
               Minecraft var38 = Minecraft.getInstance();
               var10002 = -20685;
               var10003 = -30125;
               Intrinsics.checkNotNullExpressionValue(var38, "getInstance(...)");
               Minecraft var4 = var38;
               if (var2 != null && var4.player != null) {
                  LocalPlayer var5 = var4.player;
                  if (var2 != null && var4.level != null) {
                     ClientLevel var6 = var4.level;
                     if (var2 != null) {
                        ClientPacketListener var39 = var4.getConnection();
                        if (var39 != null) {
                           ClientPacketListener var7 = var39;
                           double var8 = IIIllIIlllllIlIlllIIIlllIIlIlIllllIlIIlIIllIllIlllllIIIllllIIIIIlIIlIIlllIIIlIlllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .a()
                              .M();
                           double var10 = var8 * var8;
                           int var12 = var5.getId();
                           double var13 = var5.getX();
                           double var15 = var5.getY();
                           double var17 = var5.getZ();
                           long var19 = System.currentTimeMillis();
                           List var40 = var6.players();
                           var10002 = -20682;
                           var10003 = -29452;
                           Intrinsics.checkNotNullExpressionValue(var40, "players(...)");
                           List var21 = var40;
                           UUID var22 = null;
                           String var23 = null;
                           int var24 = 0;
                           int var25 = var21.size();

                           while (var24 < var25) {
                              var10000 = (String)var21.get(var24);
                              var10002 = -20686;
                              var10003 = -31463;
                              Intrinsics.checkNotNullExpressionValue(var10000, "get(...)");
                              AbstractClientPlayer var26 = (AbstractClientPlayer)(Object)var10000;
                              if (var2 != null) {
                                 UUID var33;
                                 label180: {
                                    if (var26.getId() != var12) {
                                       double var27 = var26.getX() - var13;
                                       double var29 = var26.getY() - var15;
                                       double var31 = var26.getZ() - var17;
                                       if (var2 == null) {
                                          continue;
                                       }

                                       label123:
                                       if (!(var27 * var27 + var29 * var29 + var31 * var31 >= var10)) {
                                          AbstractClientPlayer var42 = var26;
                                          if (var2 != null) {
                                             if (!var26.isAlive()) {
                                                break label123;
                                             }

                                             var42 = var26;
                                          }

                                          UUID var43 = var42.getUUID();
                                          var10002 = -20687;
                                          var10003 = 2280;
                                          Intrinsics.checkNotNullExpressionValue(var43, "getUUID(...)");
                                          var33 = var43;
                                          if (var2 == null) {
                                             continue;
                                          }

                                          label116:
                                          if (var33.version() == 4) {
                                             Object var10000b = var7.getPlayerInfo(var33);
                                             if (var2 != null) {
                                                if (var10000b == null) {
                                                   break label116;
                                                }

                                                var10000b = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.get(var33);
                                             }

                                             Long var34 = (Long)(Object)var10000b;
                                             if (var34 == null) {
                                                break label180;
                                             }

                                             if (var19 >= var34) {
                                                lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.remove(var33);
                                                break label180;
                                             }
                                          }
                                       }
                                    }

                                    var24++;
                                    continue;
                                 }

                                 var22 = var33;
                                 var23 = var26.getName().getString();
                                 break;
                              }
                           }

                           if (var22 == null) {
                              lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = false;
                              lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = false;
                              return;
                           }

                           boolean var45 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                           if (var2 != null) {
                              if (!lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl) {
                                 lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = true;
                                 llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.f();
                                 return;
                              }

                              var45 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                           }

                           if (var2 != null) {
                              if (var45) {
                                 return;
                              }

                              var24 = IIIllIIlllllIlIlllIIIlllIIlIlIllllIlIIlIIllIllIlllllIIIllllIIIIIlIIlIIlllIIIlIlllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .b()
                                 .M();
                              final var var24f = var24; // PX-FIX: lambda 捕获 final 副本
                              var45 = ((java.util.function.Supplier<Boolean>)(() -> { llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.a(var24f * 1000L); return false; })).get();
                           }

                           if (var2 != null) {
                              if (!var45) {
                                 return;
                              }

                              lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.put(
                                 var22,
                                 var19
                                    + IIIllIIlllllIlIlllIIIlllIIlIlIllllIlIIlIIllIllIlllllIIIllllIIIIIlIIlIIlllIIIlIlllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                          .c()
                                          .M()
                                       * 1000L
                              );
                              lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = true;
                              var45 = false;
                           }

                           label88: {
                              lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var45;
                              if (var2 != null) {
                                 var10000 = var23;
                                 if (var23 != null) {
                                    break label88;
                                 }
                              }

                              short var47 = -20683;
                              short var10001 = -2172;
                              var10000 = "A player";
                           }

                           String var35 = var10000;
                           short var49 = -20679;
                           var10002 = -26411;
                           short var10004 = -20678;
                           short var10005 = -24048;
                           me.octo.client.utils.IlllIlllllIIIlIIllIIIlIlIIlIIIlIlIIIlIllIIIIllllIIIIlIllIllllIlllIlIIlIllIIIlIIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .a("Polinex", var35 + " has been near you for " + var24 + "s");
                           var10003 = -20684;
                           var10004 = 9009;
                           String var55 = var35 + " is too close!";
                           var10004 = -20688;
                           var10005 = 28816;
                           me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.a(
                              me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                              5000L,
                              var55,
                              "Lurked for " + var24 + "s",
                              null,
                              8,
                              null
                           );
                           var4.getSoundManager().play(SimpleSoundInstance.forUI(SoundEvents.ENDER_DRAGON_GROWL, 1.0F, 5.0F));
                           return;
                        }
                     }

                     return;
                  }

                  return;
               }

               return;
            }
         }

         var37 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      }

      label154:
      if (var2 != null) {
         if (!var37) {
            var37 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
            if (var2 == null) {
               break label154;
            }

            if (!lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI) {
               return;
            }
         }

         lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = false;
         var37 = false;
      }

      lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var37;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[11];
      int var3 = 0;
      String var2 = "\fAí\u00839Ê\nÇMû\u0010\f2\u0004b\u0007>\u008e¸\u0089²é\u0088\"\b'åÀF\u0011\u0013#°\u0010oòÉÅps\u001d\u0002pµÓLEN}L\u000eíæ1£\u0092ç\u0003NÆZ£\u0004Kx\b\u0016\u0096\u0000\u0081Âp´:\f¢r\u0090ÍçE\u0082¬$MZ¶\u000f\u0007I\u0000ªõ©\u0093W~Â?\u0019\u0012(d\u0005ØHlÄí";
      int var4 = "\fAí\u00839Ê\nÇMû\u0010\f2\u0004b\u0007>\u008e¸\u0089²é\u0088\"\b'åÀF\u0011\u0013#°\u0010oòÉÅps\u001d\u0002pµÓLEN}L\u000eíæ1£\u0092ç\u0003NÆZ£\u0004Kx\b\u0016\u0096\u0000\u0081Âp´:\f¢r\u0090ÍçE\u0082¬$MZ¶\u000f\u0007I\u0000ªõ©\u0093W~Â?\u0019\u0012(d\u0005ØHlÄí"
         .length();
      char var1 = 11;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 92;
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
                     case 0 -> 42;
                     case 1 -> 126;
                     case 2 -> 73;
                     case 3 -> 3;
                     case 4 -> 35;
                     case 5 -> 111;
                     default -> 119;
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
                     c = var5;
                     d = new String[11];
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new IlIllllIIIIIIIIIllIllIIlIlIlIlIIlIlIllllIIIIIlIIIllIIIIlllIlIIlIIllIllIIIIIIlIIIIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new HashMap<>();
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

                  var2 = "·\u009fMU\u00ad\u0005ü\u0017kå¥çR\r\u0099¬\u0085ñ0ôJ·b¢\u008a:xtÖ\u0010i";
                  var4 = "·\u009fMU\u00ad\u0005ü\u0017kå¥çR\r\u0099¬\u0085ñ0ôJ·b¢\u008a:xtÖ\u0010i".length();
                  var1 = 7;
                  var8 = -1;
            }

            var10000 = 37;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ -20688) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 114;
            case 1 -> 17;
            case 2 -> 47;
            case 3 -> 172;
            case 4 -> 64;
            case 5 -> 217;
            case 6 -> 88;
            case 7 -> 2;
            case 8 -> 20;
            case 9 -> 83;
            case 10 -> 230;
            case 11 -> 135;
            case 12 -> 3;
            case 13 -> 139;
            case 14 -> 91;
            case 15 -> 188;
            case 16 -> 77;
            case 17 -> 66;
            case 18 -> 240;
            case 19 -> 218;
            case 20 -> 61;
            case 21 -> 209;
            case 22 -> 140;
            case 23 -> 248;
            case 24 -> 254;
            case 25 -> 213;
            case 26 -> 239;
            case 27 -> 150;
            case 28 -> 241;
            case 29 -> 120;
            case 30 -> 100;
            case 31 -> 59;
            case 32 -> 75;
            case 33 -> 96;
            case 34 -> 252;
            case 35 -> 65;
            case 36 -> 28;
            case 37 -> 221;
            case 38 -> 157;
            case 39 -> 168;
            case 40 -> 233;
            case 41 -> 242;
            case 42 -> 94;
            case 43 -> 253;
            case 44 -> 107;
            case 45 -> 203;
            case 46 -> 144;
            case 47 -> 13;
            case 48 -> 196;
            case 49 -> 236;
            case 50 -> 235;
            case 51 -> 146;
            case 52 -> 54;
            case 53 -> 35;
            case 54 -> 130;
            case 55 -> 127;
            case 56 -> 185;
            case 57 -> 133;
            case 58 -> 44;
            case 59 -> 111;
            case 60 -> 119;
            case 61 -> 121;
            case 62 -> 166;
            case 63 -> 178;
            case 64 -> 25;
            case 65 -> 33;
            case 66 -> 211;
            case 67 -> 244;
            case 68 -> 197;
            case 69 -> 176;
            case 70 -> 159;
            case 71 -> 169;
            case 72 -> 164;
            case 73 -> 82;
            case 74 -> 8;
            case 75 -> 231;
            case 76 -> 79;
            case 77 -> 180;
            case 78 -> 155;
            case 79 -> 16;
            case 80 -> 31;
            case 81 -> 227;
            case 82 -> 161;
            case 83 -> 207;
            case 84 -> 125;
            case 85 -> 126;
            case 86 -> 193;
            case 87 -> 85;
            case 88 -> 216;
            case 89 -> 219;
            case 90 -> 145;
            case 91 -> 182;
            case 92 -> 184;
            case 93 -> 112;
            case 94 -> 187;
            case 95 -> 147;
            case 96 -> 99;
            case 97 -> 69;
            case 98 -> 198;
            case 99 -> 26;
            case 100 -> 204;
            case 101 -> 41;
            case 102 -> 37;
            case 103 -> 132;
            case 104 -> 10;
            case 105 -> 186;
            case 106 -> 11;
            case 107 -> 21;
            case 108 -> 42;
            case 109 -> 225;
            case 110 -> 55;
            case 111 -> 136;
            case 112 -> 222;
            case 113 -> 56;
            case 114 -> 109;
            case 115 -> 115;
            case 116 -> 210;
            case 117 -> 78;
            case 118 -> 174;
            case 119 -> 154;
            case 120 -> 53;
            case 121 -> 245;
            case 122 -> 90;
            case 123 -> 22;
            case 124 -> 76;
            case 125 -> 81;
            case 126 -> 194;
            case 127 -> 143;
            case 128 -> 117;
            case 129 -> 212;
            case 130 -> 27;
            case 131 -> 86;
            case 132 -> 160;
            case 133 -> 6;
            case 134 -> 175;
            case 135 -> 9;
            case 136 -> 103;
            case 137 -> 1;
            case 138 -> 141;
            case 139 -> 62;
            case 140 -> 123;
            case 141 -> 7;
            case 142 -> 190;
            case 143 -> 208;
            case 144 -> 43;
            case 145 -> 183;
            case 146 -> 214;
            case 147 -> 153;
            case 148 -> 30;
            case 149 -> 232;
            case 150 -> 177;
            case 151 -> 148;
            case 152 -> 170;
            case 153 -> 162;
            case 154 -> 205;
            case 155 -> 118;
            case 156 -> 243;
            case 157 -> 14;
            case 158 -> 93;
            case 159 -> 4;
            case 160 -> 48;
            case 161 -> 68;
            case 162 -> 156;
            case 163 -> 195;
            case 164 -> 173;
            case 165 -> 102;
            case 166 -> 249;
            case 167 -> 138;
            case 168 -> 122;
            case 169 -> 52;
            case 170 -> 247;
            case 171 -> 29;
            case 172 -> 5;
            case 173 -> 105;
            case 174 -> 171;
            case 175 -> 89;
            case 176 -> 189;
            case 177 -> 110;
            case 178 -> 206;
            case 179 -> 40;
            case 180 -> 50;
            case 181 -> 57;
            case 182 -> 38;
            case 183 -> 223;
            case 184 -> 237;
            case 185 -> 226;
            case 186 -> 34;
            case 187 -> 71;
            case 188 -> 67;
            case 189 -> 87;
            case 190 -> 124;
            case 191 -> 36;
            case 192 -> 95;
            case 193 -> 73;
            case 194 -> 246;
            case 195 -> 200;
            case 196 -> 45;
            case 197 -> 255;
            case 198 -> 202;
            case 199 -> 179;
            case 200 -> 238;
            case 201 -> 215;
            case 202 -> 152;
            case 203 -> 129;
            case 204 -> 134;
            case 205 -> 23;
            case 206 -> 234;
            case 207 -> 12;
            case 208 -> 131;
            case 209 -> 19;
            case 210 -> 84;
            case 211 -> 224;
            case 212 -> 80;
            case 213 -> 70;
            case 214 -> 15;
            case 215 -> 165;
            case 216 -> 39;
            case 217 -> 220;
            case 218 -> 228;
            case 219 -> 191;
            case 220 -> 72;
            case 221 -> 113;
            case 222 -> 167;
            case 223 -> 98;
            case 224 -> 51;
            case 225 -> 101;
            case 226 -> 137;
            case 227 -> 60;
            case 228 -> 158;
            case 229 -> 201;
            case 230 -> 104;
            case 231 -> 46;
            case 232 -> 49;
            case 233 -> 192;
            case 234 -> 163;
            case 235 -> 32;
            case 236 -> 18;
            case 237 -> 58;
            case 238 -> 24;
            case 239 -> 97;
            case 240 -> 0;
            case 241 -> 74;
            case 242 -> 251;
            case 243 -> 128;
            case 244 -> 116;
            case 245 -> 151;
            case 246 -> 142;
            case 247 -> 250;
            case 248 -> 63;
            case 249 -> 199;
            case 250 -> 92;
            case 251 -> 106;
            case 252 -> 229;
            case 253 -> 149;
            case 254 -> 181;
            default -> 108;
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker pxMarker) {
           this();
        }


      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      public final boolean a() {
         return IlIllllIIIIIIIIIllIllIIlIlIlIlIIlIlIllllIIIIIlIIIllIIIIlllIlIIlIIllIllIIIIIIlIIIIlIII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      }
   }
      public static final boolean n() {
         return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      }
}
