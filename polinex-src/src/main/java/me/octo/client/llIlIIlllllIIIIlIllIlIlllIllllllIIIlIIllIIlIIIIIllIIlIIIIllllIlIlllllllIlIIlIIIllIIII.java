package me.octo.client;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public final class llIlIIlllllIIIIlIllIlIlllIllllllIIIlIIllIIlIIIIIllIIlIIIIllllIlIlllllllIlIIlIIIllIIII
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
    public static <T> T b(Object p0) { return null; } // PX-FIX mr4
    public static <T> T a(Object... args) { return null; } // PX-FIX ovld-var
   @NotNull
   public static llIlIIlllllIIIIlIllIlIlllIllllllIIIlIIllIIlIIIIIllIIlIIIIllllIlIlllllllIlIIlIIIllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private boolean lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private boolean lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private boolean IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @JvmField
   @NotNull
   public static llIlIIlllllIIIIlIllIlIlllIllllllIIIlIIllIIlIIIIIllIIlIIIIllllIlIlllllllIlIIlIIIllIIII IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static String[] f;
   private static String[] g;

   private llIlIIlllllIIIIlIllIlIlllIllllllIIIlIIllIIlIIIIIllIIlIIIIllllIlIlllllllIlIIlIIIllIIII() {
      short var10001 = 23877;
      short var10002 = 19120;
      var10002 = 23896;
      short var10003 = 9578;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      short var10004 = 23875;
      short var10005 = -19593;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         lIlllIIIIIIllllllllllIIllllllllllIIlllIllIIlIIIlIIlIIIIlllllIIllIllllllllIlIlIlIlIIIl.a(),
         lIlllIIIIIIllllllllllIIllllllllllIIlllIllIIlIIIlIIlIIIIlllllIIllIllllllllIlIlIlIlIIIl.b()
      };
      super("Auto Maddox", "Automatically calls Maddox and starts a quest after you kill your boss.", var3, "Slayer", var1);
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
   }

   private final int ag() {
      return ((Integer)((me.octo.client.PXDyn)(Object)(lIlllIIIIIIllllllllllIIllllllllllIIlllIllIIlIIIlIIlIIIIlllllIIllIllllllllIlIlIlIlIIIl.b())).M()) - 1;
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI var1) {
      Object var26 = null; // PX-FIX
      Object var22 = null; // PX-FIX
      boolean var19 = false; // PX-FIX
      boolean var18 = false; // PX-FIX
      boolean var17 = false; // PX-FIX
      boolean var16 = false; // PX-FIX
      boolean var15 = false; // PX-FIX
      boolean var14 = false; // PX-FIX
      boolean var13 = false; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = lIIlIllIlIIlIIIllIIIlIlIIIlIlllIIIIlIlIllIlIIIIllIIIllIIllIIlIlllIllllllllllIIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      short var10002 = 23880;
      short var10003 = -21046;
      Intrinsics.checkNotNullParameter(var1, "event");
      String var3 = var1.k();
      var10002 = 23884;
      var10003 = -15959;
      boolean var4 = Intrinsics.areEqual(var3, "Slayer");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      boolean var9;
      if (var2 == null && var3 != null) {
         CharSequence var10 = var3;
         short var10001 = 23917;
         var10002 = 30792;
         var9 = StringsKt.contains(var10, "Abiphone", false);
         if (var2 == null) {
            ;
         }
      } else {
         var9 = false;
      }

      boolean var5 = var9;
      boolean var11;
      if (var2 == null && var3 != null) {
         short var27 = 23894;
         var10002 = -16167;
         var11 = StringsKt.startsWith(var3, "Confirm", false);
         if (var2 == null) {
            ;
         }
      } else {
         var11 = false;
      }

      boolean var6 = var11;
      boolean var12;
      if (var2 == null && var3 != null) {
         short var28 = 23891;
         var10002 = -26413;
         var12 = StringsKt.startsWith(var3, "Revenant", false);
         if (var2 == null) {
            ;
         }
      } else {
         var12 = false;
      }

      label270: {
         if (!var12) {
            label267: {
               String var29 = var3;
               if (var2 == null) {
                  if (var3 == null) {
                     var13 = false;
                     break label267;
                  }

                  short var30 = 23915;
                  var10002 = 10831;
                  var29 = "Tarantula";
               }

               var13 = StringsKt.startsWith(var3, var29, false);
               if (var2 == null) {
                  ;
               }
            }

            if (!var13) {
               label260: {
                  String var31 = var3;
                  if (var2 == null) {
                     if (var3 == null) {
                        var14 = false;
                        break label260;
                     }

                     short var32 = 23926;
                     var10002 = 12653;
                     var31 = "Sven";
                  }

                  var14 = StringsKt.startsWith(var3, var31, false);
                  if (var2 == null) {
                     ;
                  }
               }

               if (!var14) {
                  label253: {
                     String var33 = var3;
                     if (var2 == null) {
                        if (var3 == null) {
                           var15 = false;
                           break label253;
                        }

                        short var34 = 23879;
                        var10002 = 18380;
                        var33 = "Voidgloom";
                     }

                     var15 = StringsKt.startsWith(var3, var33, false);
                     if (var2 == null) {
                        ;
                     }
                  }

                  if (!var15) {
                     label246: {
                        String var35 = var3;
                        if (var2 == null) {
                           if (var3 == null) {
                              var16 = false;
                              break label246;
                           }

                           short var36 = 23899;
                           var10002 = -2127;
                           var35 = "Riftstalker";
                        }

                        var16 = StringsKt.startsWith(var3, var35, false);
                        if (var2 == null) {
                           ;
                        }
                     }

                     if (!var16) {
                        label239: {
                           String var37 = var3;
                           if (var2 == null) {
                              if (var3 == null) {
                                 var17 = false;
                                 break label239;
                              }

                              short var38 = 23914;
                              var10002 = 9916;
                              var37 = "Inferno";
                           }

                           var17 = StringsKt.startsWith(var3, var37, false);
                           if (var2 == null) {
                              ;
                           }
                        }

                        if (!var17) {
                           var18 = false;
                           break label270;
                        }
                     }
                  }
               }
            }
         }

         var18 = true;
      }

      boolean var7;
      var7 = var18;
      var19 = var5;
      label231:
      if (var2 == null) {
         if (var5) {
            var19 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
            if (var2 != null) {
               break label231;
            }

            if (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
               me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(100L + (long)(Math.random() * 100), (kotlin.jvm.functions.Function1)(llIlIIlllllIIIIlIllIlIlllIllllllIIIlIIllIIlIIIIIllIIlIIIIllllIlIlllllllIlIIlIIIllIIII::a));
               return;
            }
         }

         var19 = var4;
      }

      label224:
      if (var2 == null) {
         if (var19) {
            var19 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
            if (var2 != null) {
               break label224;
            }

            if (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
               var19 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
               if (var2 != null) {
                  break label224;
               }

               if (!this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll) {
                  int var20 = ((java.util.function.Supplier<Integer>)(() -> { this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.a(300); return 0; })).get();
                  if (var2 == null) {
                     if (var20 == 0) {
                        return;
                     }

                     var20 = 10 + (Integer)((me.octo.client.PXDyn)(Object)(lIlllIIIIIIllllllllllIIllllllllllIIlllIllIIlIIIlIIlIIIIlllllIIllIllllllllIlIlIlIlIIIl.a())).x();
                  }

                  int var8 = var20;
                  me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(200L + (long)(Math.random() * 100), (kotlin.jvm.functions.Function1)(llIlIIlllllIIIIlIllIlIlllIllllllIIIlIIllIIlIIIIIllIIlIIIIllllIlIlllllllIlIIlIIIllIIII::b));
                  me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(1200L + (long)(Math.random() * 100), (kotlin.jvm.functions.Function1)(llIlIIlllllIIIIlIllIlIlllIllllllIIIlIIllIIlIIIIIllIIlIIIIllllIlIlllllllIlIIlIIIllIIII::a));
                  this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.f();
                  this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = true;
                  this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = false;
                  return;
               }
            }
         }

         var19 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      }

      label214:
      if (var2 == null) {
         if (var19) {
            var19 = var7;
            if (var2 != null) {
               break label214;
            }

            if (var7) {
               var19 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
               if (var2 != null) {
                  break label214;
               }

               if (!this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) {
                  label306: {
                     int var21 = ((java.util.function.Supplier<Integer>)(() -> { this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.a(200); return 0; })).get();
                     if (var2 == null) {
                        if (var21 == 0) {
                           return;
                        }

                        this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.f();
                        var22 = this;
                        if (var2 != null) {
                           break label306;
                        }

                        var21 = this.ag();
                     }

                     label177:
                     if (var21 == 4) {
                        int var23 = ((me.octo.client.PXDyn)(Object)(lIlllIIIIIIllllllllllIIllllllllllIIlllIllIIlIIIlIIlIIIIlllllIIllIllllllllIlIlIlIlIIIl.a())).x();
                        if (var2 == null) {
                           if (var23 == 0) {
                              break label177;
                           }

                           var23 = ((me.octo.client.PXDyn)(Object)(lIlllIIIIIIllllllllllIIllllllllllIIlllIllIIlIIIlIIlIIIIlllllIIllIllllllllIlIlIlIlIIIl.a())).x();
                        }

                        if (var23 != 4) {
                           short var24 = 23892;
                           short var39 = 4580;
                           me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                              "This tier of the selected slayer doesn't exist"
                           );
                           if (var2 == null) {
                              LocalPlayer var25 = this.ap().player;
                              if (var25 != null) {
                                 var25.closeContainer();
                              }
                           }

                           return;
                        }
                     }

                     me.octo.client.utils.player.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a(11 + this.ag(), 0, 0);
                     this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = false;
                     var22 = this;
                  }

                  this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = false;
                  return;
               }
            }
         }

         var19 = var6;
      }

      label294: {
         if (var2 == null) {
            if (!var19) {
               break label294;
            }

            var19 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
         }

         label295: {
            if (var2 == null) {
               if (var19) {
                  break label294;
               }

               var26 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
               if (var2 != null) {
                  break label295;
               }

               var19 = ((java.util.function.Supplier<Boolean>)(() -> { this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.a(200); return false; })).get();
            }

            if (!var19) {
               break label294;
            }

            var26 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
         }

         ((me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI)var26).f();
         me.octo.client.utils.player.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(11, 0, 0);
         this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = true;
      }

      if (var2 != null) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[3]
         );
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      Object var37 = null; // PX-FIX
      Object var35 = null; // PX-FIX
      String var32 = null; // PX-FIX
      Object var28 = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2;
      ClientboundSystemChatPacket var22;
      label155: {
         short var10001 = 23886;
         short var10002 = -12668;
         Intrinsics.checkNotNullParameter(var1, "event");
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = lIIlIllIlIIlIIIllIIIlIlIIIlIlllIIIIlIlIllIlIIIIllIIIllIIllIIlIlllIllllllllllIIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
         Packet var5 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         var2 = var10000;
         Packet var21 = var5;
         if (var2 == null) {
            if (!(var5 instanceof ClientboundSystemChatPacket)) {
               var22 = null;
               break label155;
            }

            var21 = var5;
         }

         var22 = (ClientboundSystemChatPacket)var21;
      }

      if (var22 != null) {
         ClientboundSystemChatPacket var3 = var22;
         me.octo.client.utils.player.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var23 = me.octo.client.utils.player.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         String var40 = var3.content().getString();
         short var10003 = 23883;
         short var10004 = -3775;
         Intrinsics.checkNotNullExpressionValue(var40, "getString(...)");
         String var4 = var23.a(var40);
         byte var24 = ((byte)((StringsKt.contains(var4, ":", false)) ? 1 : 0));
         if (var2 == null) {
            if (var24 != 0) {
               return;
            }

            CharSequence var25 = var4;
            short var41 = 23898;
            short var46 = -24815;
            var24 = ((byte)((StringsKt.contains(var25, "NICE! SLAYER BOSS SLAIN!", false)) ? 1 : 0));
         }

         if (var2 == null) {
            if (var24 == 0) {
               return;
            }

            var24 = 31;
         }

         String[] var6 = new String[var24];
         short var47 = 23925;
         var10003 = 31568;
         var6[0] = "AATROX_BATPHONE";
         var47 = 23913;
         var10003 = -7949;
         var6[1] = "ABIPHONE_X_RED";
         var47 = 23924;
         var10003 = 7738;
         var6[2] = "ABIPHONE_X_BLUE";
         var47 = 23912;
         var10003 = -16816;
         var6[3] = "ABIPHONE_X_PLUS";
         var47 = 23882;
         var10003 = 24060;
         var6[4] = "ABIPHONE_X_PLUS_SPECIAL_EDITION";
         var47 = 23888;
         var10003 = -27671;
         var6[5] = "ABIPHONE_XI_YELLOW";
         var47 = 23903;
         var10003 = -700;
         var6[6] = "ABIPHONE_XI_GREEN";
         var47 = 23885;
         var10003 = -17485;
         var6[7] = "ABIPHONE_XI_ULTRA";
         var47 = 23934;
         var10003 = -8292;
         var6[8] = "ABIPHONE_XI_ULTRA_STYLE";
         var47 = 23902;
         var10003 = -16650;
         var6[9] = "ABIPHONE_XII_AMBER";
         var47 = 23876;
         var10003 = 31134;
         var6[10] = "ABIPHONE_XII_AMETHYST";
         var47 = 23901;
         var10003 = 21433;
         var6[11] = "ABIPHONE_XII_MEGA";
         var47 = 23887;
         var10003 = -9191;
         var6[12] = "ABIPHONE_XII_MEGA_COLOR";
         var47 = 23927;
         var10003 = -31847;
         var6[13] = "ABIPHONE_XIII_JADE";
         var47 = 23890;
         var10003 = -10757;
         var6[14] = "ABIPHONE_XIII_SAPPHIRE";
         var47 = 23874;
         var10003 = 22734;
         var6[15] = "ABIPHONE_XIII_PRO";
         var47 = 23893;
         var10003 = -13491;
         var6[16] = "ABIPHONE_XIII_PRO_GIGA";
         var47 = 23873;
         var10003 = 1873;
         var6[17] = "ABIPHONE_XIV_ORANGE";
         var47 = 23881;
         var10003 = -12343;
         var6[18] = "ABIPHONE_XIV_BLACK";
         var47 = 23928;
         var10003 = -24438;
         var6[19] = "ABIPHONE_XIV_PURPLE";
         var47 = 23922;
         var10003 = -2286;
         var6[20] = "ABIPHONE_XIV_ENORMOUS";
         var47 = 23878;
         var10003 = -31985;
         var6[21] = "ABIPHONE_XIV_ENORMOUS_PURPLE";
         var47 = 23919;
         var10003 = 20548;
         var6[22] = "ABIPHONE_XIV_ENORMOUS_BLACK";
         var47 = 23933;
         var10003 = 21421;
         var6[23] = "ABIPHONE_FLIP_DRAGON";
         var47 = 23911;
         var10003 = -10076;
         var6[24] = "ABIPHONE_FLIP_NUCLEUS";
         var47 = 23930;
         var10003 = 4149;
         var6[25] = "ABIPHONE_FLIP_VOLCANO";
         var47 = 23929;
         var10003 = -32015;
         var6[26] = "ABIPHONE_FLIP_PLUS_FLOWER";
         var47 = 23916;
         var10003 = 30098;
         var6[27] = "ABIPHONE_FLIP_PLUS_CLOCKWORK";
         var47 = 23931;
         var10003 = 6814;
         var6[28] = "ABIPHONE_FLIP_PLUS_LUNAR";
         var47 = 23900;
         var10003 = 321;
         var6[29] = "ABINGOPHONE";
         var47 = 23923;
         var10003 = -3812;
         var6[30] = "ABINGOPHONE_PLUS";
         Set var17 = SetsKt.setOf(var6);
         int var18 = 0;

         while (var18 < 9) {
            if (var2 != null) {
               return;
            }

            label139: {
               LocalPlayer var26 = this.ap().player;
               if (var26 != null) {
                  Inventory var27 = var26.getInventory();
                  if (var27 != null) {
                     var28 = var27.getItem(var18);
                     break label139;
                  }
               }

               var28 = null;
            }

            String var8;
            label134: {
               label160: {
                  ItemStack var7 =((ItemStack)( var28));
                  var8 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .g(var7);
                  ItemStack var29 = var7;
                  if (var2 == null) {
                     if (var7 == null) {
                        break label160;
                     }

                     var29 = var7;
                  }

                  Component var10 = var29.getHoverName();
                  Component var30 = var10;
                  if (var2 == null) {
                     if (var10 == null) {
                        break label160;
                     }

                     var30 = var10;
                  }

                  String var11 = var30.getString();
                  String var31 = var11;
                  if (var2 == null) {
                     if (var11 == null) {
                        break label160;
                     }

                     var31 = var11;
                  }

                  String var13 = var31;
                  me.octo.client.utils.player.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var14 = me.octo.client.utils.player.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                  boolean var16 = false;
                  String var12 = var14.a(var13);
                  var32 = var12;
                  if (var2 == null) {
                     if (var12 == null) {
                        break label160;
                     }

                     String var33 = var12.toLowerCase(Locale.ROOT);
                     var47 = 23932;
                     var10003 = -439;
                     Intrinsics.checkNotNullExpressionValue(var33, "toLowerCase(...)");
                     var13 = var33;
                     var32 = var13;
                  }

                  if (var2 != null) {
                     break label134;
                  }

                  if (var32 != null) {
                     var32 = var13;
                     break label134;
                  }
               }

               var32 = "";
            }

            String var9 = var32;
            CharSequence var34 = var9;
            short var42 = 23935;
            var47 = 9560;
            var35 = StringsKt.contains(var34, "abiphone", false);
            label108:
            if (var2 == null) {
               if (!((Boolean)var35)) {
                  CharSequence var36 = var9;
                  short var43 = 23889;
                  var47 = 20913;
                  var35 = StringsKt.contains(var36, "batphone", false);
                  if (var2 != null) {
                     break label108;
                  }

                  if (!((Boolean)var35)) {
                     var35 = false;
                     break label108;
                  }
               }

               var35 = true;
            }

            boolean var19;
            label100: {
               label99: {
                  var19 =((Boolean)( var35));
                  if (var8 != null) {
                     var37 = var17.contains(var8);
                     if (var2 != null) {
                        break label100;
                     }

                     if (((Boolean)(var37))) {
                        break label99;
                     }

                     CharSequence var38 = var8;
                     short var44 = 23895;
                     var47 = -27942;
                     var37 = StringsKt.contains(var38, "ABIPHONE", false);
                     if (var2 != null) {
                        break label100;
                     }

                     if (((Boolean)(var37))) {
                        break label99;
                     }
                  }

                  var37 = false;
                  break label100;
               }

               var37 = true;
            }

            boolean var20 =((Boolean)( var37));
            if (var2 != null) {
               return;
            }

            if (var20 || var19) {
               me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .b(var18);
               this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = true;
               this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = false;
               this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = false;
               this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.f();
               return;
            }

            var18++;
            if (var2 != null) {
               break;
            }
         }

         short var39 = 23920;
         short var45 = 14617;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("You don't have any batphones");
      }
   }

   private final boolean a(me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI var1, int var2) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = lIIlIllIlIIlIIIllIIIlIlIIIlIlllIIIIlIlIllIlIIIIllIIIllIIllIIlIlllIllllllllllIIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      if (var3 == null) {
         List var10000 = var1.m();
         if (var10000 != null) {
            Slot var12 = (Slot)CollectionsKt.getOrNull(var10000, var2);
            if (var12 != null) {
               ItemStack var13 = var12.getItem();
               if (var13 != null) {
                  ItemStack var4 = var13;
                  List var5 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .e(var4);
                  var var6 = var5;
                  boolean var7 = false;
                  var10000 = var6;
                  label42:
                  if (var3 == null) {
                     if (var6 instanceof Collection) {
                        var10000 = var6;
                        if (var3 != null) {
                           break label42;
                        }

                        if (var10000.isEmpty()) {
                           return false;
                        }
                     }

                     var10000 = var6;
                  }

                  for (Object var9 : var10000) {
                     String var10 = (String)var9;
                     boolean var11 = false;
                     CharSequence var16 = me.octo.client.utils.player.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a(var10);
                     short var10001 = 23918;
                     short var10002 = -32275;
                     boolean var15 = StringsKt.contains(var16, "Click to collect reward", true);

                     while (var15) {
                        var15 = true;
                        if (var3 == null) {
                           return true;
                        }
                     }
                  }

                  return false;
               }
            }
         }
      }

      return false;
   }

   @Override
   public void aB() {
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = false;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = false;
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = false;
      lIIlIllIlIIlIIIllIIIlIlIIIlIlllIIIIlIlIllIlIIIIllIIIllIIllIIlIlllIllllllllllIIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.f();
      this.as();
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         lIIlIllIlIIlIIIllIIIlIlIIIlIlllIIIIlIlIllIlIIIIllIIIllIIllIIlIlllIllllllllllIIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[1]
         );
      }
   }

   @Override
   public void aC() {
      this.at();
   }

   private static final void a(
      llIlIIlllllIIIIlIllIlIlllIllllllIIIlIIllIIlIIIIIllIIlIIIIllllIlIlllllllIlIIlIIIllIIII var0,
      me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI var1,
      int var2
   ) {
      if (var0.a(var1, var2)) {
         me.octo.client.utils.player.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(var2, 0, 0);
      }
   }

   private static final void a(int var0) {
      me.octo.client.utils.player.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(var0, 0, 0);
   }

   private static final Unit a(
      llIlIIlllllIIIIlIllIlIlllIllllllIIIlIIllIIlIIIIIllIIlIIIIllllIlIlllllllIlIIlIIIllIIII var0,
      me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI var1
   ) {
      Slot var17 = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2;
      Integer var18;
      label56: {
         label55: {
            label59: {
               me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = lIIlIllIlIIlIIIllIIIlIlIIIlIlllIIIIlIlIllIlIIIIllIIIllIIllIIlIlllIllllllllllIIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
               var0.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.f();
               var2 = var10000;
               List var4 = var1.m();
               var18 = ((Integer)(Object)(var4));
               if (var2 == null) {
                  if (var4 == null) {
                     break label59;
                  }

                  var18 = ((Integer)(Object)(var4));
               }

               Object var6 = var18;
               boolean var7 = false;
               Iterator var8 = ((me.octo.client.PXDyn)var6).iterator();

               label53:
               while (true) {
                  if (var8.hasNext()) {
                     Object var9 = var8.next();
                     var18 = (Integer)var9;

                     do {
                        Slot var10 = (Slot)(Object)var18;
                        boolean var11 = false;
                        me.octo.client.utils.player.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var15 = me.octo.client.utils.player.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                        String var10001 = var10.getItem().getHoverName().getString();
                        short var10003 = 23921;
                        short var10004 = -25124;
                        Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
                        String var12 = var15.a(var10001);
                        CharSequence var16 = var12;
                        short var20 = 23872;
                        short var10002 = 26482;
                        if (!StringsKt.contains(var16, "Maddox", true)) {
                           continue label53;
                        }

                        var18 = (Integer)var9;
                     } while (var2 != null);
                  } else {
                     var18 = null;
                  }

                  Slot var5 = (Slot)(Object)var18;
                  var17 = var5;
                  if (var2 != null) {
                     break label55;
                  }

                  if (var5 != null) {
                     var17 = var5;
                     break label55;
                  }
                  break;
               }
            }

            var18 = null;
            break label56;
         }

         var18 = var17.index;
      }

      label31: {
         Integer var3 = var18;
         if (var2 == null) {
            if (var3 == null) {
               break label31;
            }

            me.octo.client.utils.player.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a((int)var3, 0, 0);
         }

         if (var2 == null) {
            return Unit.INSTANCE;
         }
      }

      short var19 = 23897;
      short var21 = 30199;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
         "You don't have Maddox the Slayer in your inventory"
      );
      return Unit.INSTANCE;
   }

   private static final Unit b(
      llIlIIlllllIIIIlIllIlIlllIllllllIIIlIIllIIlIIIIIllIIlIIIIllllIlIlllllllIlIIlIIIllIIII var0,
      me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI var1,
      int var2
   ) {
      var0.ap().execute(null);
      return Unit.INSTANCE;
   }

   private static final Unit a(llIlIIlllllIIIIlIllIlIlllIllllllIIIlIIllIIlIIIIIllIIlIIIIllllIlIlllllllIlIIlIIIllIIII var0, int var1) {
      var0.ap().execute(null);
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[57];
      int var3 = 0;
      String var2 = "¾¹òói7«x<¿ääçók²Ë\u0012RÖo\u001eÚ\u008aÝÏòI=,Ä-\u001c\u001f'%\u0011ô\u001e»\u0007@©\u008e«\u0098Åp½m\u0013!P\u008d\u000b\u009e\u0092ö\u0088æ\u0085ª#ÑnG\u000b¦\u0018¯\u00ad3g\u0093\u0007ÅaR\u0018T\u0082Kë|ìP\u0088ã\u0088Î.H\u0016\u001f\n\u0013Æ\u0017ì\u0013lÔÉ2\u008dv³òÖIÕñüØ\u0093A=\u0089B$\b\u009a7\u0088ÿÎm\u0090¬HSÈO\u0010Ä¸n\u001e\u000eÚ\u008a\u0015ìM:up\rÍé\u001b\u00adb3GÔj\u0082gØS&3ÌFdöH\u0096A\u0006N\u007fDrQv;â~Ó1å\u0011\u0004¤\u0085Û\u0090zV\u0091\u0015Ð¹zï\bÄ¹;³yÆ\u009dÁ_ã¿\u0003Ü\u00adGÚ^\u0085\u000fr¿/\t%u¥Öú\bií\by6f@R\u0007eéìGHl©\u0016Ç\rÝe\u008cå\u0017\"«ô\u0016\u009b·Å»Ïg \u0012¥#è.\u009a<á\u000fGÔ,x\"ã\u0089!ÏsÈ`Y(u(\u008bú]0«ð²ßWòÇä\u000e\u0098\u0003ã\u0000Þ¤\u0013+tD¿\u0089Y\b\u0087´\u009b¤º`\u0013H\u0016\u0086ðõÚ\u0089\u0012·Ü¿+\u0094`çº²3:ÁJwÓ¶\bYµt\u0015\u0003ïâg\u0012lö¨\u001a\"\nÂß\u0011KAzM7êÖÒÖ\u0017¿°ÒÒm\u0013+ü,/æà¿¸{%ÆÊíþSKl\u0005\u0016\u0080kXÏ\u0011v2ë\u0082J\u0019Ï½°\u0007uóÇ\u000f.ç_\u0006ÒÚ\u0007]×Ó\u000e?\u0002\u001dD2\u009f\\Ü9\u0015\u001c¾\u001a\u009c\u001fL\u009f¬7¢¯Òk\u0013Ý\u0017§Fr#\u007f\u000b\u0095\u0002÷mé\u0010\u000e\u001c.{Ô;\u009aL\u0012\u0000F%\f\u0093Èô\u0087×@\u0099\u0012P\u0015\u008fxr³\u0005\r6\b\u008e£\t -äÝ cy\u009fQ\u001c\u008dM\u0094m¥ä2\u0002\u000fð\u0082\u00043Ðá)ìPÕçÆ! À\u0092¨Z\u0083\u000b_Îóó»í»@Ï\u008a÷\u0015\u001dv\u0086\nç\bz\u009f\u0006C£m\u0017\u0005f\u001dy\u0098·]Y\u0006CO5ï\u0091\u0085\u00113õCz_\u0006m^ä{ÿj\u008aû\u001c\b\u0093\u0013 6!\u0002\u0013\tä¿ÕGÙòX\u0004\u0090öAnõ\u00069'¢SÌ¦\bj\u0019lã¾1U¼\u0017\u008e\u007fô+©,³\u001b?Ó\u0084iù\\é\u008d§hÑ±ÓÙÜ\u0014Uó\u008fºÆ\u001e^]\u0082\u00056x\u000f¹\u0082@ØÉ\"\u0084\u0010õz\r<\f<ãp°S @¯\u0082M\u0003\u0018\u001dÕ\u0086~ç\u0086zN\u0006g¦4\u001d0Ôo\u0090å\u00ad\u0095ÝD\u0094X\u0015¡\u0092\u0011\u0096\u0015\u009b$íÍ\u0013ßº2á7V3±ý\u000f\u0010\u0019ñ,\u001bATa\f²Èø\u007fÇ&N³ |\u001c0 w¨íóÌ\u0013#YAï\u001f´e\bå±ß,\u0098À\u008f\u0081[úk\u0012À¢=\u0090\u0090[\u0094õÛ\u000e\u0018Äv.\u0099¡q\u0086\u0004Içp´\u000f@b0é\u0088!aHHR®Ã\u009cþ\r\u000fpØ+ßR²ÌÈÐ©o;I±Ô\u0010õd\u009bVK^\u001fXg\u0001\u0091çÓ\u008d\b¶\u0015\u009fîÖ\u0019íj;Ó.Ê¦C·8q4þó\u0097\u0093\u008e\u000eRÐ°\u001e\u0087Ôêµï8Æ\u001bA(\u001c|%\u008d\u0098\u0011\u0004-XãípçA]Í\u0092öøBw\u0084É<®\bÁºa\u001b¾æò\u0018iJ«×<JäSÿ:xtßû³\u0092\n\u008f«\f \u0018j\u0017\u0097kµq\u0086]+\u009d.W\u0010\u0096°ßé×\u0017ì¼\u008a¶Çn\b\u0010\u008c\u0007QÓgøv\u001c\u0093üW[Ý\"=Úîõ»f¾z &\u001eÌ|¿þîÈ5ûÔÌþ\tBãáÎq¼q|\u0005\u0007\u0092@QPíñg\u000e³\u0092S\u0096]\u009b-íì\rè¿°\"";
      int var4 = "¾¹òói7«x<¿ääçók²Ë\u0012RÖo\u001eÚ\u008aÝÏòI=,Ä-\u001c\u001f'%\u0011ô\u001e»\u0007@©\u008e«\u0098Åp½m\u0013!P\u008d\u000b\u009e\u0092ö\u0088æ\u0085ª#ÑnG\u000b¦\u0018¯\u00ad3g\u0093\u0007ÅaR\u0018T\u0082Kë|ìP\u0088ã\u0088Î.H\u0016\u001f\n\u0013Æ\u0017ì\u0013lÔÉ2\u008dv³òÖIÕñüØ\u0093A=\u0089B$\b\u009a7\u0088ÿÎm\u0090¬HSÈO\u0010Ä¸n\u001e\u000eÚ\u008a\u0015ìM:up\rÍé\u001b\u00adb3GÔj\u0082gØS&3ÌFdöH\u0096A\u0006N\u007fDrQv;â~Ó1å\u0011\u0004¤\u0085Û\u0090zV\u0091\u0015Ð¹zï\bÄ¹;³yÆ\u009dÁ_ã¿\u0003Ü\u00adGÚ^\u0085\u000fr¿/\t%u¥Öú\bií\by6f@R\u0007eéìGHl©\u0016Ç\rÝe\u008cå\u0017\"«ô\u0016\u009b·Å»Ïg \u0012¥#è.\u009a<á\u000fGÔ,x\"ã\u0089!ÏsÈ`Y(u(\u008bú]0«ð²ßWòÇä\u000e\u0098\u0003ã\u0000Þ¤\u0013+tD¿\u0089Y\b\u0087´\u009b¤º`\u0013H\u0016\u0086ðõÚ\u0089\u0012·Ü¿+\u0094`çº²3:ÁJwÓ¶\bYµt\u0015\u0003ïâg\u0012lö¨\u001a\"\nÂß\u0011KAzM7êÖÒÖ\u0017¿°ÒÒm\u0013+ü,/æà¿¸{%ÆÊíþSKl\u0005\u0016\u0080kXÏ\u0011v2ë\u0082J\u0019Ï½°\u0007uóÇ\u000f.ç_\u0006ÒÚ\u0007]×Ó\u000e?\u0002\u001dD2\u009f\\Ü9\u0015\u001c¾\u001a\u009c\u001fL\u009f¬7¢¯Òk\u0013Ý\u0017§Fr#\u007f\u000b\u0095\u0002÷mé\u0010\u000e\u001c.{Ô;\u009aL\u0012\u0000F%\f\u0093Èô\u0087×@\u0099\u0012P\u0015\u008fxr³\u0005\r6\b\u008e£\t -äÝ cy\u009fQ\u001c\u008dM\u0094m¥ä2\u0002\u000fð\u0082\u00043Ðá)ìPÕçÆ! À\u0092¨Z\u0083\u000b_Îóó»í»@Ï\u008a÷\u0015\u001dv\u0086\nç\bz\u009f\u0006C£m\u0017\u0005f\u001dy\u0098·]Y\u0006CO5ï\u0091\u0085\u00113õCz_\u0006m^ä{ÿj\u008aû\u001c\b\u0093\u0013 6!\u0002\u0013\tä¿ÕGÙòX\u0004\u0090öAnõ\u00069'¢SÌ¦\bj\u0019lã¾1U¼\u0017\u008e\u007fô+©,³\u001b?Ó\u0084iù\\é\u008d§hÑ±ÓÙÜ\u0014Uó\u008fºÆ\u001e^]\u0082\u00056x\u000f¹\u0082@ØÉ\"\u0084\u0010õz\r<\f<ãp°S @¯\u0082M\u0003\u0018\u001dÕ\u0086~ç\u0086zN\u0006g¦4\u001d0Ôo\u0090å\u00ad\u0095ÝD\u0094X\u0015¡\u0092\u0011\u0096\u0015\u009b$íÍ\u0013ßº2á7V3±ý\u000f\u0010\u0019ñ,\u001bATa\f²Èø\u007fÇ&N³ |\u001c0 w¨íóÌ\u0013#YAï\u001f´e\bå±ß,\u0098À\u008f\u0081[úk\u0012À¢=\u0090\u0090[\u0094õÛ\u000e\u0018Äv.\u0099¡q\u0086\u0004Içp´\u000f@b0é\u0088!aHHR®Ã\u009cþ\r\u000fpØ+ßR²ÌÈÐ©o;I±Ô\u0010õd\u009bVK^\u001fXg\u0001\u0091çÓ\u008d\b¶\u0015\u009fîÖ\u0019íj;Ó.Ê¦C·8q4þó\u0097\u0093\u008e\u000eRÐ°\u001e\u0087Ôêµï8Æ\u001bA(\u001c|%\u008d\u0098\u0011\u0004-XãípçA]Í\u0092öøBw\u0084É<®\bÁºa\u001b¾æò\u0018iJ«×<JäSÿ:xtßû³\u0092\n\u008f«\f \u0018j\u0017\u0097kµq\u0086]+\u009d.W\u0010\u0096°ßé×\u0017ì¼\u008a¶Çn\b\u0010\u008c\u0007QÓgøv\u001c\u0093üW[Ý\"=Úîõ»f¾z &\u001eÌ|¿þîÈ5ûÔÌþ\tBãáÎq¼q|\u0005\u0007\u0092@QPíñg\u000e³\u0092S\u0096]\u009b-íì\rè¿°\""
         .length();
      char var1 = 17;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 61;
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
                     case 0 -> 15;
                     case 1 -> 64;
                     case 2 -> 126;
                     case 3 -> 12;
                     case 4 -> 74;
                     case 5 -> 71;
                     default -> 90;
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
                     g = new String[57];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new llIlIIlllllIIIIlIllIlIlllIllllllIIIlIIllIIlIIIIIllIIlIIIIllllIlIlllllllIlIIlIIIllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new llIlIIlllllIIIIlIllIlIlllIllllllIIIlIIllIIlIIIIIllIIlIIIIllllIlIlllllllIlIIlIIIllIIII();
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

                  var2 = "\u001fÁrHÍô\u008b´\u008c\u0092Pú\u001am\u001c\u0015~æ^¬Hh;'\u009aþ\u0081³MttJûÐºbÔ";
                  var4 = "\u001fÁrHÍô\u008b´\u008c\u0092Pú\u001am\u001c\u0015~æ^¬Hh;'\u009aþ\u0081³MttJûÐºbÔ".length();
                  var1 = 15;
                  var8 = -1;
            }

            var10000 = 98;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 23903) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 115;
            case 1 -> 142;
            case 2 -> 36;
            case 3 -> 218;
            case 4 -> 231;
            case 5 -> 141;
            case 6 -> 116;
            case 7 -> 186;
            case 8 -> 248;
            case 9 -> 126;
            case 10 -> 247;
            case 11 -> 44;
            case 12 -> 78;
            case 13 -> 215;
            case 14 -> 181;
            case 15 -> 52;
            case 16 -> 136;
            case 17 -> 58;
            case 18 -> 254;
            case 19 -> 82;
            case 20 -> 22;
            case 21 -> 90;
            case 22 -> 45;
            case 23 -> 162;
            case 24 -> 117;
            case 25 -> 103;
            case 26 -> 243;
            case 27 -> 160;
            case 28 -> 219;
            case 29 -> 97;
            case 30 -> 205;
            case 31 -> 133;
            case 32 -> 123;
            case 33 -> 105;
            case 34 -> 229;
            case 35 -> 12;
            case 36 -> 67;
            case 37 -> 15;
            case 38 -> 59;
            case 39 -> 39;
            case 40 -> 208;
            case 41 -> 89;
            case 42 -> 122;
            case 43 -> 87;
            case 44 -> 191;
            case 45 -> 196;
            case 46 -> 26;
            case 47 -> 48;
            case 48 -> 74;
            case 49 -> 129;
            case 50 -> 86;
            case 51 -> 73;
            case 52 -> 198;
            case 53 -> 35;
            case 54 -> 140;
            case 55 -> 34;
            case 56 -> 227;
            case 57 -> 24;
            case 58 -> 65;
            case 59 -> 0;
            case 60 -> 28;
            case 61 -> 242;
            case 62 -> 70;
            case 63 -> 112;
            case 64 -> 5;
            case 65 -> 173;
            case 66 -> 55;
            case 67 -> 54;
            case 68 -> 174;
            case 69 -> 184;
            case 70 -> 1;
            case 71 -> 110;
            case 72 -> 241;
            case 73 -> 156;
            case 74 -> 96;
            case 75 -> 177;
            case 76 -> 91;
            case 77 -> 210;
            case 78 -> 2;
            case 79 -> 14;
            case 80 -> 250;
            case 81 -> 134;
            case 82 -> 20;
            case 83 -> 255;
            case 84 -> 221;
            case 85 -> 25;
            case 86 -> 149;
            case 87 -> 197;
            case 88 -> 31;
            case 89 -> 201;
            case 90 -> 92;
            case 91 -> 192;
            case 92 -> 161;
            case 93 -> 148;
            case 94 -> 202;
            case 95 -> 10;
            case 96 -> 213;
            case 97 -> 220;
            case 98 -> 170;
            case 99 -> 164;
            case 100 -> 61;
            case 101 -> 179;
            case 102 -> 233;
            case 103 -> 135;
            case 104 -> 158;
            case 105 -> 41;
            case 106 -> 183;
            case 107 -> 168;
            case 108 -> 217;
            case 109 -> 132;
            case 110 -> 100;
            case 111 -> 79;
            case 112 -> 43;
            case 113 -> 85;
            case 114 -> 29;
            case 115 -> 93;
            case 116 -> 63;
            case 117 -> 209;
            case 118 -> 223;
            case 119 -> 147;
            case 120 -> 13;
            case 121 -> 182;
            case 122 -> 131;
            case 123 -> 69;
            case 124 -> 214;
            case 125 -> 19;
            case 126 -> 189;
            case 127 -> 53;
            case 128 -> 226;
            case 129 -> 51;
            case 130 -> 206;
            case 131 -> 101;
            case 132 -> 49;
            case 133 -> 180;
            case 134 -> 251;
            case 135 -> 68;
            case 136 -> 252;
            case 137 -> 176;
            case 138 -> 46;
            case 139 -> 114;
            case 140 -> 119;
            case 141 -> 77;
            case 142 -> 200;
            case 143 -> 95;
            case 144 -> 60;
            case 145 -> 193;
            case 146 -> 8;
            case 147 -> 99;
            case 148 -> 235;
            case 149 -> 239;
            case 150 -> 204;
            case 151 -> 30;
            case 152 -> 151;
            case 153 -> 127;
            case 154 -> 249;
            case 155 -> 9;
            case 156 -> 42;
            case 157 -> 72;
            case 158 -> 108;
            case 159 -> 3;
            case 160 -> 211;
            case 161 -> 178;
            case 162 -> 143;
            case 163 -> 40;
            case 164 -> 124;
            case 165 -> 7;
            case 166 -> 98;
            case 167 -> 81;
            case 168 -> 232;
            case 169 -> 144;
            case 170 -> 18;
            case 171 -> 80;
            case 172 -> 84;
            case 173 -> 38;
            case 174 -> 102;
            case 175 -> 137;
            case 176 -> 199;
            case 177 -> 163;
            case 178 -> 228;
            case 179 -> 152;
            case 180 -> 6;
            case 181 -> 236;
            case 182 -> 130;
            case 183 -> 125;
            case 184 -> 224;
            case 185 -> 66;
            case 186 -> 175;
            case 187 -> 83;
            case 188 -> 159;
            case 189 -> 47;
            case 190 -> 169;
            case 191 -> 17;
            case 192 -> 138;
            case 193 -> 76;
            case 194 -> 166;
            case 195 -> 111;
            case 196 -> 194;
            case 197 -> 27;
            case 198 -> 50;
            case 199 -> 150;
            case 200 -> 94;
            case 201 -> 222;
            case 202 -> 185;
            case 203 -> 37;
            case 204 -> 16;
            case 205 -> 139;
            case 206 -> 155;
            case 207 -> 238;
            case 208 -> 225;
            case 209 -> 109;
            case 210 -> 33;
            case 211 -> 106;
            case 212 -> 245;
            case 213 -> 167;
            case 214 -> 237;
            case 215 -> 203;
            case 216 -> 23;
            case 217 -> 128;
            case 218 -> 187;
            case 219 -> 240;
            case 220 -> 57;
            case 221 -> 4;
            case 222 -> 32;
            case 223 -> 172;
            case 224 -> 246;
            case 225 -> 62;
            case 226 -> 88;
            case 227 -> 154;
            case 228 -> 120;
            case 229 -> 11;
            case 230 -> 195;
            case 231 -> 21;
            case 232 -> 188;
            case 233 -> 145;
            case 234 -> 64;
            case 235 -> 234;
            case 236 -> 157;
            case 237 -> 107;
            case 238 -> 244;
            case 239 -> 171;
            case 240 -> 75;
            case 241 -> 146;
            case 242 -> 230;
            case 243 -> 190;
            case 244 -> 104;
            case 245 -> 153;
            case 246 -> 165;
            case 247 -> 56;
            case 248 -> 71;
            case 249 -> 212;
            case 250 -> 113;
            case 251 -> 121;
            case 252 -> 253;
            case 253 -> 216;
            case 254 -> 118;
            default -> 207;
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
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }
}
