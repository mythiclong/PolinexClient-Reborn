package me.octo.client;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.StringsKt;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

public final class IIIlIlIlIlIlIIlllIIIIIIlIIIIlIlIlIlIIlIIIlllIlllIIllIlllllIlllllIIlIlIIIIllIIlllIlllI
   extends IlIlIIIllIIlIIlllIlIlIlIIlIIIlIllIllIIIllIIlIlIIllIIlIIlIlllIIIlllIlIIlIIIIlIllIlIlII {
    public static <T> T b(Object p0) { return null; } // PX-FIX ovld2
   @NotNull
   public static IIIlIlIlIlIlIIlllIIIIIIlIIIIlIlIlIlIIlIIIlllIlllIIllIlllllIlllllIIlIlIIIIllIIlllIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private String lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private int lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private boolean lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private boolean lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static String[] c;
   private static String[] d;

   public IIIlIlIlIlIlIIlllIIIIIIlIIIIlIlIlIlIIlIIIlllIlllIIllIlllllIlllllIIlIlIIIIllIIlllIlllI() {
      short var10001 = 3255;
      short var10002 = -30610;
      super("Slayer Starter");
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = "";
   }

   @Override
   public void b(@NotNull me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI var1) {
      Object var45 = null; // PX-FIX
      Object var41 = null; // PX-FIX
      Object var38 = null; // PX-FIX
      String var31 = null; // PX-FIX
      String var29 = null; // PX-FIX
      Object var26 = null; // PX-FIX
      Object var24 = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = n();
      short var10002 = 3245;
      short var10003 = -19815;
      Intrinsics.checkNotNullParameter(var1, "event");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      if (var2 == null) {
         String var20 = var1.k();
         if (var20 != null) {
            String var3 = var20;
            if (var2 == null) {
               List var21 = var1.m();
               if (var21 != null) {
                  List var4 = var21;
                  int var22 = ((Intrinsics.areEqual(this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, var3)) ? 1 : 0);
                  if (var2 == null) {
                     if (var22 == 0) {
                        this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var3;
                        this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 250 + Random.Default.nextInt(100);
                        this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.f();
                        this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = false;
                        this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = false;
                     }

                     var22 = ((java.util.function.Supplier<Integer>)(() -> { this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
                        .a(this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI); return 0; })).get();
                  }

                  if (var2 == null) {
                     if (var22 == 0) {
                        return;
                     }

                     var22 = ((this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) ? 1 : 0);
                  }

                  if (var2 == null) {
                     if (var22 != 0) {
                        return;
                     }

                     var22 = IlIllIIIIlllllIllllllIIlIlllIIIIlIlllllIllIIlIlIIlIIIIlIIIlllIlllIIlllIlIlIlllIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .c()
                           .M()
                        + 10;
                  }

                  int var5 = var22;
                  String var23 = var3;
                  if (var2 == null) {
                     label346: {
                        label379: {
                           label343: {
                              label342: {
                                 switch (var3.hashCode()) {
                                    case -1815998242:
                                       label337: {
                                          label367: {
                                             label368: {
                                                short var55 = 3232;
                                                var10002 = -9199;
                                                boolean var25 = var3.equals("Slayer");
                                                if (var2 == null) {
                                                   if (!var25) {
                                                      break label346;
                                                   }

                                                   var26 = ((Slot)var4.get(34)).getItem();
                                                   if (var2 != null) {
                                                      break label368;
                                                   }

                                                   var25 = ((me.octo.client.PXDyn)var26).is(Items.BLACK_STAINED_GLASS_PANE);
                                                }

                                                if (var25) {
                                                   break label367;
                                                }

                                                me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var27 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                                                ItemStack var56 = ((Slot)var4.get(34)).getItem();
                                                var10003 = 3248;
                                                short var10004 = 19266;
                                                Intrinsics.checkNotNullExpressionValue(var56, "getItem(...)");
                                                var26 = var27.e(var56).get(2);
                                             }

                                             CharSequence var28 = (CharSequence)var26;
                                             String[] var7 = new String[]{" "};
                                             Iterable var15 = (StringsKt.split(var28, var7, false, 0));
                                             boolean var8 = false;

                                             for (Object var10 : var15) {
                                                String var11 = (String)var10;
                                                boolean var12 = false;
                                                var29 = var11;
                                                if (var2 != null) {
                                                   break label337;
                                                }

                                                label321: {
                                                   label320: {
                                                      int var30 = var11.hashCode();
                                                      if (var2 == null) {
                                                         switch (var30) {
                                                            case -1751803001:
                                                               var31 = var11;
                                                               if (var2 != null) {
                                                                  break label321;
                                                               }

                                                               short var67 = 3239;
                                                               var10002 = -20471;
                                                               var30 = ((var11.equals("Riftstalker")) ? 1 : 0);
                                                               break;
                                                            case -685180305:
                                                               var31 = var11;
                                                               if (var2 != null) {
                                                                  break label321;
                                                               }

                                                               short var65 = 3229;
                                                               var10002 = 13653;
                                                               if (var11.equals("Inferno")) {
                                                                  short var36 = 3244;
                                                                  var65 = 31343;
                                                                  var31 = "Blaze";
                                                                  break label321;
                                                               }
                                                               break label320;
                                                            case -199992837:
                                                               var31 = var11;
                                                               if (var2 != null) {
                                                                  break label321;
                                                               }

                                                               short var63 = 3246;
                                                               var10002 = -15758;
                                                               if (var11.equals("Revenant")) {
                                                                  short var35 = 3263;
                                                                  var63 = 13395;
                                                                  var31 = "Zombie";
                                                                  break label321;
                                                               }
                                                               break label320;
                                                            case 2589292:
                                                               var31 = var11;
                                                               if (var2 != null) {
                                                                  break label321;
                                                               }

                                                               short var61 = 3234;
                                                               var10002 = 29015;
                                                               if (var11.equals("Sven")) {
                                                                  short var34 = 3259;
                                                                  var61 = -6295;
                                                                  var31 = "Wolf";
                                                                  break label321;
                                                               }
                                                               break label320;
                                                            case 1016129108:
                                                               var31 = var11;
                                                               if (var2 != null) {
                                                                  break label321;
                                                               }

                                                               short var59 = 3257;
                                                               var10002 = 3113;
                                                               if (var11.equals("Voidgloom")) {
                                                                  short var33 = 3254;
                                                                  var59 = 9083;
                                                                  var31 = "Enderman";
                                                                  break label321;
                                                               }
                                                               break label320;
                                                            case 1024949544:
                                                               var31 = var11;
                                                               if (var2 != null) {
                                                                  break label321;
                                                               }

                                                               short var57 = 3235;
                                                               var10002 = -13948;
                                                               if (var11.equals("Tarantula")) {
                                                                  short var32 = 3250;
                                                                  var57 = 21750;
                                                                  var31 = "Spider";
                                                                  break label321;
                                                               }
                                                            default:
                                                               break label320;
                                                         }
                                                      }

                                                      if (var30 != 0) {
                                                         short var37 = 3228;
                                                         short var68 = -15195;
                                                         var31 = "Vampire";
                                                         break label321;
                                                      }
                                                   }

                                                   var31 = "";
                                                }

                                                label295: {
                                                   String var14 = var31;
                                                   var38 = Intrinsics.areEqual(
                                                      IlIllIIIIlllllIllllllIIlIlllIIIIlIlllllIllIIlIlIIlIIIIlIIIlllIlllIIlllIlIlIlllIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                                         .a()
                                                         .y(),
                                                      var14
                                                   );
                                                   label294:
                                                   if (var2 == null) {
                                                      if (!((Boolean)var38)) {
                                                         var38 = Intrinsics.areEqual(var14, "");
                                                         if (var2 != null) {
                                                            break label294;
                                                         }

                                                         if (!((Boolean)var38)) {
                                                            var10002 = 3227;
                                                            var10003 = -10045;
                                                            var10003 = 3238;
                                                            short var111 = -4543;
                                                            me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                                               .b(
                                                                  5000L,
                                                                  "Slayer Macro",
                                                                  "A different slayer is already active!",
                                                                  me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                                                               );
                                                            IIlIlIIllIIIIlIllIIIlllIIIllIIIIlIIIlIlIIlllllIlIIIIllIllIIlllIIIllllIlllIlllllllIlIl.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII
                                                               .a()
                                                               .N();
                                                            if (var2 == null) {
                                                               LocalPlayer var39 = this.a().player;
                                                               if (var39 != null) {
                                                                  var39.closeContainer();
                                                                  break label295;
                                                               }
                                                            }

                                                            if (var2 == null) {
                                                               break label295;
                                                            }
                                                         }
                                                      }

                                                      var38 = Intrinsics.areEqual(
                                                         IlIllIIIIlllllIllllllIIlIlllIIIIlIlllllIllIIlIlIIlIIIIlIIIlllIlllIIlllIlIlIlllIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                                            .a()
                                                            .y(),
                                                         var14
                                                      );
                                                   }

                                                   if (((Boolean)(var38))) {
                                                      var10002 = 3224;
                                                      var10003 = 17913;
                                                      var10003 = 3236;
                                                      short var112 = 13143;
                                                      me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                                         .b(
                                                            5000L,
                                                            "Slayer Macro",
                                                            "Continuing the already active slayer",
                                                            me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                                                         );
                                                      IIlIlIIllIIIIlIllIIIlllIIIllIIIIlIIIlIlIIlllllIlIIIIllIllIIlllIIIllllIlllIlllllllIlIl.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII
                                                         .a()
                                                         .e(true);
                                                      IIlIlIIllIIIIlIllIIIlllIIIllIIIIlIIIlIlIIlllllIlIIIIllIllIIlllIIIllllIlllIlllllllIlIl.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII
                                                         .a()
                                                         .f(false);
                                                      this.a(true);
                                                      if (var2 == null) {
                                                         LocalPlayer var40 = this.a().player;
                                                         if (var40 != null) {
                                                            var40.closeContainer();
                                                         }
                                                      }
                                                   }
                                                }

                                                if (var2 != null) {
                                                   break;
                                                }
                                             }
                                          }

                                          var29 = IlIllIIIIlllllIllllllIIlIlllIIIIlIlllllIllIIlIlIIlIIIIlIIIlllIlllIIlllIlIlIlllIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                             .a()
                                             .y();
                                       }

                                       label273: {
                                          String var17 = var29;
                                          var41 = var17.hashCode();
                                          if (var2 == null) {
                                             switch ((Integer)(var41)) {
                                                case -1812086011:
                                                   short var74 = 3261;
                                                   var10002 = -22097;
                                                   var41 = var17.equals("Spider");
                                                   if (var2 == null) {
                                                      if (((Boolean)(var41))) {
                                                         return;
                                                      }

                                                      var41 = 11;
                                                   }
                                                   break label273;
                                                case -1612488122:
                                                   short var73 = 3249;
                                                   var10002 = -19807;
                                                   var41 = var17.equals("Zombie");
                                                   break;
                                                case 2701938:
                                                   short var72 = 3226;
                                                   var10002 = 16881;
                                                   var41 = var17.equals("Wolf");
                                                   if (var2 == null) {
                                                      if (((Boolean)(var41))) {
                                                         return;
                                                      }

                                                      var41 = 12;
                                                   }
                                                   break label273;
                                                case 64266914:
                                                   short var71 = 3258;
                                                   var10002 = 9558;
                                                   var41 = var17.equals("Blaze");
                                                   if (var2 == null) {
                                                      if (((Boolean)(var41))) {
                                                         return;
                                                      }

                                                      var41 = 15;
                                                   }
                                                   break label273;
                                                case 1795680690:
                                                   short var70 = 3252;
                                                   var10002 = 3704;
                                                   var41 = var17.equals("Enderman");
                                                   if (var2 == null) {
                                                      if (((Boolean)(var41))) {
                                                         return;
                                                      }

                                                      var41 = 13;
                                                   }
                                                   break label273;
                                                case 1897037806:
                                                   short var69 = 3256;
                                                   var10002 = -21755;
                                                   var41 = var17.equals("Vampire");
                                                   if (var2 == null) {
                                                      if (((Boolean)(var41))) {
                                                         return;
                                                      }

                                                      var41 = 14;
                                                   }
                                                   break label273;
                                                default:
                                                   return;
                                             }
                                          }

                                          if (var2 == null) {
                                             if (((Boolean)(var41))) {
                                                return;
                                             }

                                             var41 = 10;
                                          }
                                       }

                                       int var16 =((Integer)( var41));

                                       label371: {
                                          for (Slot var19 : (List<Slot>)var4.subList(10, 16)) {
                                             if (var2 != null) {
                                                break label371;
                                             }

                                             if (var2 != null) {
                                                break;
                                             }
                                          }

                                          label373: {
                                             ItemStack var42 = ((Slot)var4.get(34)).getItem();
                                             if (var2 == null) {
                                                if (var42.is(Items.BLACK_STAINED_GLASS_PANE)) {
                                                   break label373;
                                                }

                                                var42 = ((Slot)var4.get(34)).getItem();
                                             }

                                             label377: {
                                                Component var43 = var42.getCustomName();
                                                label250:
                                                if (var43 != null) {
                                                   String var100C = var43.getString();
                                                   Object var75 = var100C;
                                                   if (var2 == null) {
                                                      if (var100C == null) {
                                                         break label250;
                                                      }

                                                      short var76 = 3242;
                                                      var10002 = -9549;
                                                      var75 = "Complete";
                                                   }

                                                   var45 = StringsKt.contains((CharSequence)(Object)var100C, (CharSequence)var75, false);
                                                   if (var2 == null) {
                                                      ;
                                                   }
                                                   break label377;
                                                }

                                                var45 = false;
                                             }

                                             if (((Boolean)(var45))) {
                                                IIIlIlIlIlIlIIlllIIIIIIlIIIIlIlIlIlIIlIIIlllIlllIIllIlllllIlllllIIlIlIIIIllIIlllIlllI var46 = this;
                                                if (var2 == null) {
                                                   if (this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll) {
                                                      return;
                                                   }

                                                   me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                                      .a(var16, 0, ContainerInput.PICKUP);
                                                   this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = true;
                                                   this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 450
                                                      + Random.Default.nextInt(100);
                                                   var46 = this;
                                                }

                                                var46.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.f();
                                                return;
                                             }
                                          }

                                          me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                             .a(var16, 0, ContainerInput.PICKUP);
                                          this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = true;
                                       }

                                       if (var2 == null) {
                                          return;
                                       }
                                       break;
                                    case -1679196512:
                                       short var54 = 3262;
                                       var10002 = 21611;
                                       if (!var3.equals("Confirm")) {
                                          break label346;
                                       }
                                       break label379;
                                    case -1234733609:
                                       short var53 = 3240;
                                       var10002 = 16991;
                                       var24 = var3.equals("Riftstalker Bloodfiend");
                                       if (var2 != null) {
                                          break label343;
                                       }

                                       if (((Boolean)(var24))) {
                                          break label346;
                                       }
                                       break label342;
                                    case -809956337:
                                       short var52 = 3241;
                                       var10002 = -1961;
                                       var24 = var3.equals("Sven Packmaster");
                                       if (var2 != null) {
                                          break label343;
                                       }

                                       if (((Boolean)(var24))) {
                                          break label346;
                                       }
                                       break label342;
                                    case 366037285:
                                       short var51 = 3253;
                                       var10002 = 11375;
                                       var24 = var3.equals("Voidgloom Seraph");
                                       if (var2 != null) {
                                          break label343;
                                       }

                                       if (((Boolean)(var24))) {
                                          break label346;
                                       }
                                       break label342;
                                    case 465983439:
                                       short var50 = 3247;
                                       var10002 = 3670;
                                       var24 = var3.equals("Inferno Demonlord");
                                       if (var2 != null) {
                                          break label343;
                                       }

                                       if (((Boolean)(var24))) {
                                          break label346;
                                       }
                                       break label342;
                                    case 1304598415:
                                       short var49 = 3233;
                                       var10002 = -11649;
                                       if (!var3.equals("Revenant Horror")) {
                                          break label346;
                                       }
                                       break;
                                    case 1693803384:
                                       short var10001 = 3243;
                                       var10002 = 20666;
                                       if (!var3.equals("Tarantula Broodfather")) {
                                          break label346;
                                       }
                                       break;
                                    default:
                                       break label346;
                                 }

                                 me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                    .a(var5, 0, ContainerInput.PICKUP);
                                 this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = true;
                                 if (var2 == null) {
                                    return;
                                 }
                              }

                              var24 = IlIllIIIIlllllIllllllIIlIlllIIIIlIlllllIllIIlIlIIlIIIIlIIIlllIlllIIlllIlIlIlllIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .c()
                                 .M();
                           }

                           if ((((((Boolean)(Object)((Boolean)var24 ? 1 : 0)))) ? 1 : 0)  > 4) {
                              me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII var47 = me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                              var10002 = 3224;
                              var10003 = 17913;
                              int var10005 = IlIllIIIIlllllIllllllIIlIlllIIIIlIlllllIllIIlIlIIlIIIIlIIIlllIlllIIlllIlIlIlllIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .c()
                                 .M();
                              short var10006 = 3251;
                              short var10007 = -28458;
                              var47.b(
                                 5000L,
                                 "Slayer Macro",
                                 var3 + " " + var10005 + " doesn't exist!",
                                 me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                              );
                              IIlIlIIllIIIIlIllIIIlllIIIllIIIIlIIIlIlIIlllllIlIIIIllIllIIlllIIIllllIlllIlllllllIlIl.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII
                                 .a()
                                 .N();
                              if (var2 == null) {
                                 return;
                              }
                           }

                           me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .a(var5, 0, ContainerInput.PICKUP);
                           this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = true;
                           if (var2 == null) {
                              return;
                           }
                        }

                        me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .a(11, 0, ContainerInput.PICKUP);
                        IIlIlIIllIIIIlIllIIIlllIIIllIIIIlIIIlIlIIlllllIlIIIIllIllIIlllIIIllllIlllIlllllllIlIl.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII
                           .a()
                           .e(true);
                        IIlIlIIllIIIIlIllIIIlllIIIllIIIIlIIIlIlIIlllllIlIIIIllIllIIlllIIIllllIlllIlllllllIlIl.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII
                           .a()
                           .f(false);
                        this.a(true);
                        this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = true;
                        if (var2 == null) {
                           return;
                        }
                     }

                     var10002 = 3224;
                     var10003 = 17913;
                     var10003 = 3237;
                     short var113 = -29376;
                     me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .b(
                           5000L,
                           "Slayer Macro",
                           "This shouldn't happen! (Error 0x1A)",
                           me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                        );
                     short var48 = 3260;
                     short var77 = -19901;
                     var23 = "This shouldn't happen! (Error 0x1A). Please report!";
                  }

                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(var23);
                  return;
               }
            }

            return;
         }
      }
   }

   @Override
   public void k() {
      n();
      me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(500L, null);
      super.k();
      IIlIlIIllIIIIlIllIIIlllIIIllIIIIlIIIlIlIIlllllIlIIIIllIllIIlllIIIllllIlllIlllllllIlIl.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII
         .a()
         .bf();
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         b(new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[2]);
      }
   }

   @Override
   public void j() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = n();
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 250 + Random.Default.nextInt(100);
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = "";
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.f();
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var10000;
      if (var1 == null) {
         me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var4 = IIlIlIIllIIIIlIllIIIlllIIIllIIIIlIIIlIlIIlllllIlIIIIllIllIIlllIIIllllIlllIlllllllIlIl.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII
            .a()
            .a_();
         if (var4 != null) {
            int var2 = var4.b();
            boolean var3 = false;
            me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .b(var2);
         }
      }

      short var10002 = 3224;
      short var10003 = 17913;
      var10003 = 3225;
      short var10004 = -16940;
      me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            5000L,
            "Slayer Macro",
            "Starting slayer...",
            me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         );
      super.j();
      if (var1 != null) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[1]
         );
      }
   }

   private static final Unit a(IIIlIlIlIlIlIIlllIIIIIIlIIIIlIlIlIlIIlIIIlllIlllIIllIlllllIlllllIIlIlIIIIllIIlllIlllI var0) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = n();
      if (var1 == null) {
         LocalPlayer var10000 = var0.a().player;
         if (var10000 != null) {
            var10000.clientSideCloseContainer();
         }
      }

      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[38];
      int var3 = 0;
      b((llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI)null);
      String var2 = "¿ü'd\u001crú\tüþKÿ\u001b\u0089ßc~\u0005Ì\rÓü\u0003\u0004\u00988ã%3\u0019¨µÅ\u0083$d*ö\u008a§\u008fÉ~\u00067¤5øOWÝ\u0003·Çø\u0095\u0014 J)Ós¾\bLG\u0013f\f¾c#;þàÂH\f#ö\u0006¢\u0091%îÔµ\u0007_\u009a\u008fqj\u0004<\u0006-'øÂçá\f\u0090\u0095ÌôFi\u0007\u0010d \u008f\u0097\u0006\u0014\fß§\u0003M\u00062\u00ad7i\u0096E\u000f³#\u001c/#°\u0006\u001dI\u001d³R\u0080\"ð\bøW·ê=\u000b¢\u0013\u0010{\u0099»\u0013\u0005\u0014\u001cÐ\u0006\u0099\u0095#\u000b\u0094ñÝ\b\u0001l\u0088\u008dÚç^\u008e\u000e\u000b4\u0018ØzÍþ\nå8òoõ=\u0016©¯j\u0003Å\u001c\u009cÉß\u009cI+¥u\rJfk\u001cPñ{\u000fFÜµ\u008b\u000epÜë×>[% \u0084@\ba\nKu\u0094G_\u0098\u0015@Á\u0085Ò³\u0091øxÏï0ú\u0091T\b\u0004©\u0098A~g\u00053\u001c,Þü\u0005\u0017ño.\u0001\bã\u009a39á}©J\u0011\u0099è\u0014\u001d\u000böj\u0081áP[ý7\töØ\u0019\u0006\teXòr\u0088\u000f3\u00ad)ß¢¡ÁÑÑ©·Wôá\f\u0004\u0080\u0091m\"\t½S:\u0080DÛ\u00061\u0010$\u0002\\$»\u001f\u0011\u008a4\u008e\u0084\u0094>,\u0000\u001cÂê¡\u0088\u009bä\u009b>eFÄ\\Lv{Uá\u0087V\u00802#ôe\b|4\u0013\u0092Ì(V|\u0014²\riYIøEöàêõQ\u0019$N\u008f[9F½\u009esµ%´¾º\\\u0088[\u0086o\u0016\u009e¹\u0001L0)ô,|=(¨½\u0003Þ\u0099\u000e\u009c4{$y\u0005G4<{t\u000bÂ^\u0007=hÛ)1i\u0083\u009f\f\u008e{¨1lð<³¨Ðì+\u0012¶\u0096¯\u009c\u009d4\u007fy\u0006öNó£\u000e\u008cL¢\u008a\u0004ç\u0091\f\u0010\fNr°\u0010oÔ\\7¤@m9";
      int var4 = "¿ü'd\u001crú\tüþKÿ\u001b\u0089ßc~\u0005Ì\rÓü\u0003\u0004\u00988ã%3\u0019¨µÅ\u0083$d*ö\u008a§\u008fÉ~\u00067¤5øOWÝ\u0003·Çø\u0095\u0014 J)Ós¾\bLG\u0013f\f¾c#;þàÂH\f#ö\u0006¢\u0091%îÔµ\u0007_\u009a\u008fqj\u0004<\u0006-'øÂçá\f\u0090\u0095ÌôFi\u0007\u0010d \u008f\u0097\u0006\u0014\fß§\u0003M\u00062\u00ad7i\u0096E\u000f³#\u001c/#°\u0006\u001dI\u001d³R\u0080\"ð\bøW·ê=\u000b¢\u0013\u0010{\u0099»\u0013\u0005\u0014\u001cÐ\u0006\u0099\u0095#\u000b\u0094ñÝ\b\u0001l\u0088\u008dÚç^\u008e\u000e\u000b4\u0018ØzÍþ\nå8òoõ=\u0016©¯j\u0003Å\u001c\u009cÉß\u009cI+¥u\rJfk\u001cPñ{\u000fFÜµ\u008b\u000epÜë×>[% \u0084@\ba\nKu\u0094G_\u0098\u0015@Á\u0085Ò³\u0091øxÏï0ú\u0091T\b\u0004©\u0098A~g\u00053\u001c,Þü\u0005\u0017ño.\u0001\bã\u009a39á}©J\u0011\u0099è\u0014\u001d\u000böj\u0081áP[ý7\töØ\u0019\u0006\teXòr\u0088\u000f3\u00ad)ß¢¡ÁÑÑ©·Wôá\f\u0004\u0080\u0091m\"\t½S:\u0080DÛ\u00061\u0010$\u0002\\$»\u001f\u0011\u008a4\u008e\u0084\u0094>,\u0000\u001cÂê¡\u0088\u009bä\u009b>eFÄ\\Lv{Uá\u0087V\u00802#ôe\b|4\u0013\u0092Ì(V|\u0014²\riYIøEöàêõQ\u0019$N\u008f[9F½\u009esµ%´¾º\\\u0088[\u0086o\u0016\u009e¹\u0001L0)ô,|=(¨½\u0003Þ\u0099\u000e\u009c4{$y\u0005G4<{t\u000bÂ^\u0007=hÛ)1i\u0083\u009f\f\u008e{¨1lð<³¨Ðì+\u0012¶\u0096¯\u009c\u009d4\u007fy\u0006öNó£\u000e\u008cL¢\u008a\u0004ç\u0091\f\u0010\fNr°\u0010oÔ\\7¤@m9"
         .length();
      char var1 = 7;
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
                     case 0 -> 22;
                     case 1 -> 8;
                     case 2 -> 79;
                     case 3 -> 107;
                     case 4 -> 20;
                     case 5 -> 51;
                     default -> 118;
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
                     d = new String[38];
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new IIIlIlIlIlIlIIlllIIIIIIlIIIIlIlIlIlIIlIIIlllIlllIIllIlllllIlllllIIlIlIIIIllIIlllIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
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

                  var2 = "BJ\u0004.ä§y\u0007ðé¥¡¡ý£";
                  var4 = "BJ\u0004.ä§y\u0007ðé¥¡¡ý£".length();
                  var1 = 7;
                  var8 = -1;
            }

            var10000 = 91;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   public static void b(me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var0) {
      IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var0;
   }

   public static me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] n() {
      return IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 3256) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 22;
            case 1 -> 135;
            case 2 -> 237;
            case 3 -> 39;
            case 4 -> 169;
            case 5 -> 230;
            case 6 -> 147;
            case 7 -> 250;
            case 8 -> 56;
            case 9 -> 41;
            case 10 -> 243;
            case 11 -> 239;
            case 12 -> 48;
            case 13 -> 69;
            case 14 -> 204;
            case 15 -> 76;
            case 16 -> 43;
            case 17 -> 158;
            case 18 -> 208;
            case 19 -> 27;
            case 20 -> 244;
            case 21 -> 114;
            case 22 -> 181;
            case 23 -> 175;
            case 24 -> 242;
            case 25 -> 253;
            case 26 -> 28;
            case 27 -> 166;
            case 28 -> 81;
            case 29 -> 192;
            case 30 -> 196;
            case 31 -> 234;
            case 32 -> 113;
            case 33 -> 112;
            case 34 -> 104;
            case 35 -> 236;
            case 36 -> 25;
            case 37 -> 184;
            case 38 -> 3;
            case 39 -> 235;
            case 40 -> 5;
            case 41 -> 124;
            case 42 -> 55;
            case 43 -> 98;
            case 44 -> 6;
            case 45 -> 11;
            case 46 -> 65;
            case 47 -> 84;
            case 48 -> 66;
            case 49 -> 75;
            case 50 -> 29;
            case 51 -> 130;
            case 52 -> 23;
            case 53 -> 90;
            case 54 -> 231;
            case 55 -> 95;
            case 56 -> 121;
            case 57 -> 173;
            case 58 -> 174;
            case 59 -> 34;
            case 60 -> 136;
            case 61 -> 63;
            case 62 -> 82;
            case 63 -> 185;
            case 64 -> 249;
            case 65 -> 151;
            case 66 -> 137;
            case 67 -> 74;
            case 68 -> 100;
            case 69 -> 142;
            case 70 -> 162;
            case 71 -> 13;
            case 72 -> 107;
            case 73 -> 131;
            case 74 -> 224;
            case 75 -> 129;
            case 76 -> 246;
            case 77 -> 116;
            case 78 -> 165;
            case 79 -> 36;
            case 80 -> 52;
            case 81 -> 68;
            case 82 -> 106;
            case 83 -> 202;
            case 84 -> 229;
            case 85 -> 189;
            case 86 -> 216;
            case 87 -> 44;
            case 88 -> 77;
            case 89 -> 138;
            case 90 -> 125;
            case 91 -> 171;
            case 92 -> 118;
            case 93 -> 73;
            case 94 -> 240;
            case 95 -> 218;
            case 96 -> 57;
            case 97 -> 30;
            case 98 -> 198;
            case 99 -> 12;
            case 100 -> 94;
            case 101 -> 191;
            case 102 -> 167;
            case 103 -> 93;
            case 104 -> 71;
            case 105 -> 91;
            case 106 -> 58;
            case 107 -> 188;
            case 108 -> 18;
            case 109 -> 45;
            case 110 -> 254;
            case 111 -> 150;
            case 112 -> 20;
            case 113 -> 156;
            case 114 -> 207;
            case 115 -> 209;
            case 116 -> 168;
            case 117 -> 233;
            case 118 -> 163;
            case 119 -> 211;
            case 120 -> 67;
            case 121 -> 199;
            case 122 -> 122;
            case 123 -> 80;
            case 124 -> 54;
            case 125 -> 32;
            case 126 -> 190;
            case 127 -> 132;
            case 128 -> 61;
            case 129 -> 194;
            case 130 -> 139;
            case 131 -> 149;
            case 132 -> 178;
            case 133 -> 37;
            case 134 -> 219;
            case 135 -> 1;
            case 136 -> 24;
            case 137 -> 38;
            case 138 -> 247;
            case 139 -> 86;
            case 140 -> 17;
            case 141 -> 213;
            case 142 -> 92;
            case 143 -> 115;
            case 144 -> 212;
            case 145 -> 105;
            case 146 -> 49;
            case 147 -> 10;
            case 148 -> 179;
            case 149 -> 51;
            case 150 -> 15;
            case 151 -> 141;
            case 152 -> 154;
            case 153 -> 26;
            case 154 -> 206;
            case 155 -> 143;
            case 156 -> 186;
            case 157 -> 89;
            case 158 -> 153;
            case 159 -> 144;
            case 160 -> 251;
            case 161 -> 140;
            case 162 -> 241;
            case 163 -> 47;
            case 164 -> 19;
            case 165 -> 4;
            case 166 -> 146;
            case 167 -> 33;
            case 168 -> 78;
            case 169 -> 226;
            case 170 -> 220;
            case 171 -> 195;
            case 172 -> 99;
            case 173 -> 214;
            case 174 -> 21;
            case 175 -> 83;
            case 176 -> 53;
            case 177 -> 225;
            case 178 -> 127;
            case 179 -> 238;
            case 180 -> 2;
            case 181 -> 223;
            case 182 -> 222;
            case 183 -> 161;
            case 184 -> 205;
            case 185 -> 197;
            case 186 -> 7;
            case 187 -> 123;
            case 188 -> 182;
            case 189 -> 97;
            case 190 -> 145;
            case 191 -> 232;
            case 192 -> 79;
            case 193 -> 60;
            case 194 -> 128;
            case 195 -> 172;
            case 196 -> 16;
            case 197 -> 217;
            case 198 -> 110;
            case 199 -> 102;
            case 200 -> 64;
            case 201 -> 9;
            case 202 -> 0;
            case 203 -> 101;
            case 204 -> 180;
            case 205 -> 252;
            case 206 -> 42;
            case 207 -> 117;
            case 208 -> 62;
            case 209 -> 170;
            case 210 -> 245;
            case 211 -> 221;
            case 212 -> 164;
            case 213 -> 255;
            case 214 -> 187;
            case 215 -> 193;
            case 216 -> 201;
            case 217 -> 126;
            case 218 -> 134;
            case 219 -> 155;
            case 220 -> 160;
            case 221 -> 159;
            case 222 -> 103;
            case 223 -> 59;
            case 224 -> 119;
            case 225 -> 215;
            case 226 -> 177;
            case 227 -> 210;
            case 228 -> 46;
            case 229 -> 72;
            case 230 -> 152;
            case 231 -> 120;
            case 232 -> 85;
            case 233 -> 8;
            case 234 -> 111;
            case 235 -> 248;
            case 236 -> 88;
            case 237 -> 14;
            case 238 -> 157;
            case 239 -> 133;
            case 240 -> 35;
            case 241 -> 203;
            case 242 -> 108;
            case 243 -> 50;
            case 244 -> 228;
            case 245 -> 40;
            case 246 -> 176;
            case 247 -> 148;
            case 248 -> 200;
            case 249 -> 87;
            case 250 -> 183;
            case 251 -> 31;
            case 252 -> 70;
            case 253 -> 227;
            case 254 -> 96;
            default -> 109;
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
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      public final boolean a() {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = IIIlIlIlIlIlIIlllIIIIIIlIIIIlIlIlIlIIlIIIlllIlllIIllIlllllIlllllIIlIlIIIIllIIlllIlllI.n();
         boolean var10000 = IIlIlIIllIIIIlIllIIIlllIIIllIIIIlIIIlIlIIlllllIlIIIIllIllIIlllIIIllllIlllIlllllllIlIl.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII
            .a()
            .ba();
         if (var1 == null) {
            if (var10000) {
               var10000 = IIlIlIIllIIIIlIllIIIlllIIIllIIIIlIIIlIlIIlllllIlIIIIllIllIIlllIIIllllIlllIlllllllIlIl.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII
                  .a()
                  .bc();
               if (var1 != null) {
                  return var10000;
               }

               if (!var10000) {
                  return false;
               }
            }

            var10000 = true;
         }

         return var10000;
      }
   }
}
