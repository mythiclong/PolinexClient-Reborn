package me.octo.client;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.mixin.accessors.InventoryAccessor;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.NonNullList;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.EntityHitResult;
import org.jetbrains.annotations.NotNull;

public final class IIIllIlllIIllllIlllIllllIllIlIIIIIIIlIIIIIIIlllIIlIlIIIIIIIlllIllIIIlllIIIlIIlIIIlllI
   extends IlIlIIIllIIlIIlllIlIlIlIIlIIIlIllIllIIIllIIlIlIIllIIlIIlIlllIIIlllIlIIlIIIIlIllIlIlII {
    public static <T> T a(Object... args) { return null; } // PX-FIX ovld-var
   
   
   private int IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private String llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private boolean lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private boolean lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private boolean lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] c;
   private static String[] d;

   public IIIllIlllIIllllIlllIllllIllIlIIIIIIIlIIIIIIIlllIIlIlIIIIIIIlllIllIIIlllIIIlIIlIIIlllI() {
      short var10001 = -13944;
      short var10002 = 18833;
      super("Museum Add Helper");
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = -1;
      var10001 = -13938;
      var10002 = 5463;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = "Unknown";
   }

   public final int n() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   public final void a(int var1) {
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var1;
   }

   @NotNull
   public final String o() {
      return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   public final void b(@NotNull String var1) {
      short var10001 = -13921;
      short var10002 = 23834;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var1;
   }

   public final boolean p() {
      return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   public final void c(boolean var1) {
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var1;
   }

   public final boolean q() {
      return this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   public final void d(boolean var1) {
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var1;
   }

   public final boolean r() {
      return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   public final void e(boolean var1) {
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var1;
   }

   @Override
   public void g() {
      Object var49 = null; // PX-FIX
      Object var47 = null; // PX-FIX
      Object var45 = null; // PX-FIX
      Object var41 = null; // PX-FIX
      Object var39 = null; // PX-FIX
      Object var36 = null; // PX-FIX
      Object var31 = null; // PX-FIX
      int var1 = IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid.p();
      int var10000 = ((me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m()) ? 1 : 0);
      if (var1 == 0) {
         if (var10000 == 0) {
            return;
         }

         var10000 = ((me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.n()) ? 1 : 0);
      }

      label252:
      if (var1 == 0) {
         if (var10000 != 0) {
            var10000 = ((this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) ? 1 : 0);
            if (var1 != 0) {
               break label252;
            }

            if (!this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
               LocalPlayer var24 = this.a().player;
               if (var24 != null) {
                  var24.closeContainer();
               }
            }
         }

         var10000 = ((java.util.function.Supplier<Integer>)(() -> { this.d().a(500); return 0; })).get();
      }

      if (var1 == 0) {
         if (var10000 == 0) {
            return;
         }

         var10000 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      label256: {
         label243:
         if (var1 == 0) {
            if (var10000 == -1) {
               var10000 = ((this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl) ? 1 : 0);
               if (var1 != 0) {
                  break label243;
               }

               if (!this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl) {
                  LocalPlayer var25 = this.a().player;
                  Intrinsics.checkNotNull(var25);
                  Inventory var26 = var25.getInventory();
                  short var10002 = -13949;
                  short var10003 = 24502;
                  Intrinsics.checkNotNull(var26, "null cannot be cast to non-null type me.octo.client.mixin.accessors.InventoryAccessor");
                  NonNullList var27 = ((InventoryAccessor)var26).getItems();
                  var10002 = -13946;
                  var10003 = 6308;
                  Intrinsics.checkNotNullExpressionValue(var27, "getItems(...)");
                  List var3 = var27;
                  boolean var4 = false;
                  int var5 = 0;

                  label236: {
                     for (Object var7 : var3) {
                        ItemStack var8 = (ItemStack)var7;
                        boolean var9 = false;
                        if (var1 == 0) {
                           me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var28 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                           Intrinsics.checkNotNull(var8);
                           var10000 = ((Intrinsics.areEqual(
                              var28.c(var8),
                              lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                                 .f()
                           )) ? 1 : 0);
                           if (var1 != 0) {
                              break label236;
                           }

                           if (var10000 != 0) {
                              var10000 = var5;
                              break label236;
                           }

                           var5++;
                        }

                        if (var1 != 0) {
                           break;
                        }
                     }

                     var10000 = -1;
                  }

                  int var2 = var10000;
                  this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = this.b(var2);
                  var10000 = var2;
                  int var10001 = -1;
                  if (var1 == 0) {
                     if (var2 == -1) {
                        short var32 = -13943;
                        short var57 = -21805;
                        me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.h(
                           "Couldn't find the purchased item! Please, add it to the museum and restart the macro."
                        );
                        lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                           .a(true);
                        this.a(true);
                        return;
                     }

                     this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = true;
                     var10000 = var2;
                     var10001 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
                  }

                  var10002 = -13924;
                  var10003 = 11674;
                  var10003 = -13939;
                  short var10004 = -11467;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
                     "Found item in slot " + var10000 + " (mapped to " + var10001 + ")"
                  );
               }
            }

            var31 = this;
            if (var1 != 0) {
               break label256;
            }

            short var56 = -13938;
            short var69 = 5463;
            var10000 = ((Intrinsics.areEqual(this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI, "Unknown")) ? 1 : 0);
         }

         if (var10000 != 0) {
            lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll var58 = lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
               .h();
            lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll var70 = lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
               .e();
            Intrinsics.checkNotNull(var70);
            this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var58.b(var70);
            String var33 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
            if (var1 == 0) {
               short var59 = -13938;
               short var71 = 5463;
               if (Intrinsics.areEqual(this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI, "Unknown")) {
                  short var55 = -13940;
                  short var66 = -5580;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.h(
                     "Couldn't find the correct category! Please, add the item to the museum and restart the macro."
                  );
                  lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                     .a(true);
                  this.a(true);
                  return;
               }

               short var60 = -13950;
               short var72 = 27983;
               var33 = "Determined category: " + this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
            }

            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(var33);
         }

         var31 = this;
      }

      label217: {
         ClientLevel var34 = this.a().level;
         if (var34 != null) {
            Iterable var35 = var34.entitiesForRendering();
            if (var35 != null) {
               Iterable var14 = var35;
               boolean var16 = false;
               Iterator var18 = var14.iterator();

               label212:
               while (true) {
                  if (!var18.hasNext()) {
                     var36 = null;
                     break;
                  }

                  Object var20 = var18.next();
                  var36 = var20;

                  while (true) {
                     label208: {
                        label264: {
                           Entity var22 = (Entity)var36;
                           boolean var10 = false;
                           me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var37 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                           String var61 = var22.getName().getString();
                           short var79 = -13934;
                           short var81 = 19041;
                           Intrinsics.checkNotNullExpressionValue(var61, "getString(...)");
                           String var11 = var37.a(var61);
                           CharSequence var38 = var11;
                           short var62 = -13937;
                           short var73 = 3273;
                           var39 = StringsKt.contains(var38, "Eleanor", false);
                           if (var1 == 0) {
                              if (!(me.octo.client.PxTruth.truth(var39))) {
                                 break label264;
                              }

                              CharSequence var40 = var11;
                              short var63 = -13926;
                              var73 = -7199;
                              var39 = StringsKt.contains(var40, "Goldsworth", false);
                           }

                           if (var1 != 0) {
                              break label208;
                           }

                           if ((me.octo.client.PxTruth.truth(var39))) {
                              var39 = true;
                              break label208;
                           }
                        }

                        var39 = false;
                     }

                     if (!(me.octo.client.PxTruth.truth(var39))) {
                        break;
                     }

                     var36 = var20;
                     if (var1 == 0) {
                        break label212;
                     }
                  }
               }

               var41 = (Entity)var36;
               if (var1 == 0) {
                  break label217;
               }
            }
         }

         var41 = null;
      }

      Entity var12 =((Entity)( var41));
      if (var1 == 0) {
         if (var12 == null) {
            IIIllIlllIIllllIlllIllllIllIlIIIIIIIlIIIIIIIlllIIlIlIIIIIIIlllIllIIIlllIIIlIIlIIIlllI var53 = this;
            if (var1 == 0) {
               if (this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI) {
                  return;
               }

               short var54 = -13925;
               short var65 = 12078;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("Searching for Eleanor...");
               var53 = this;
            }

            var53.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = false;
            return;
         }

         this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = true;
      }

      label187: {
         double var13 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var12), true);
         double var82;
         var10000 = (var82 = var13 - 2.0) == 0.0 ? 0 : (var82 < 0.0 ? -1 : 1);
         if (var1 == 0) {
            if (var10000 >= 0) {
               break label187;
            }

            var10000 = ((me.octo.client.utils.player.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .i()) ? 1 : 0);
         }

         if (var10000 == 0) {
            me.octo.client.utils.player.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.a(
               new IlllIIIIlIIIllIIlIllIIIllIIlIllIIIllIIlIIlIlIlIIIIllIlIIlIIIIIIIlIIlIIIlIlIIIlIIllIII(null, 0L, 3, null).a((LivingEntity)var12)
            );
         }
      }

      label181: {
         EntityHitResult var43 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .H();
         if (var43 != null) {
            Entity var44 = var43.getEntity();
            if (var44 != null) {
               Entity var21 = var44;
               boolean var23 = false;
               var45 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var21);
               if (var1 == 0) {
                  break label181;
               }
            }
         }

         var45 = null;
      }

      label174: {
         label266: {
            label267: {
               boolean var46 = Intrinsics.areEqual(
                  var45, me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var12)
               );
               if (var1 == 0) {
                  if (!var46) {
                     return;
                  }

                  var47 = this;
                  if (var1 != 0) {
                     break label267;
                  }

                  var46 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
               }

               if (var46) {
                  return;
               }

               me.octo.client.utils.player.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .g();
               if (var1 != 0) {
                  break label266;
               }

               var47 = this;
            }

            LocalPlayer var48 = this.a().player;
            if (var48 != null) {
               var49 = var48.getInventory();
               break label174;
            }
         }

         var49 = null;
      }

      Inventory var15 =((Inventory)( var49));
      if (var1 == 0) {
         label153: {
            if (var15 != null) {
               int var17 = 0;

               while (var17 < 9) {
                  ItemStack var50 = var15.getItem(var17);
                  short var75 = -13951;
                  short var80 = 4987;
                  Intrinsics.checkNotNullExpressionValue(var50, "getItem(...)");
                  ItemStack var19 = var50;
                  if (var1 == 0) {
                     boolean var51 = var19.isEmpty();
                     if (var1 != 0) {
                        break label153;
                     }

                     if (var51) {
                        var15.setSelectedSlot(var17);
                        if (var1 == 0) {
                           break;
                        }
                     }

                     var17++;
                  }

                  if (var1 != 0) {
                     break;
                  }
               }
            }

            me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .j();
         }

         short var52 = -13928;
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = true;
         short var64 = 25882;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
            "Right-clicked Eleanor with empty hand, waiting for museum GUI..."
         );
      }

      this.d().f();
   }

   @SubscribeEvent
   public final void c(@NotNull me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI var1) {
      Object var16 = null; // PX-FIX
      String var12 = null; // PX-FIX
      int var10000 = IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid.q();
      short var10002 = -13923;
      short var10003 = -24132;
      Intrinsics.checkNotNullParameter(var1, "event");
      int var2 = var10000;
      short var10 = ((short)((me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m()) ? 1 : 0));
      if (var2 != 0) {
         if ((var10 == 0)) {
            return;
         }

         var10 = ((java.util.function.Supplier<Short>)(() -> { this.d().a(1000); return 0; })).get();
      }

      if ((var10 != 0)) {
         String var3 = var1.k();
         IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI var4 = null;
         short var10001 = -13938;
         var10002 = 5463;
         if (!Intrinsics.areEqual(this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI, "Unknown")) {
            var4 = lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
               .c()
               .c()
               .b(this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI);
            if (var4 == null) {
               var10 = -13942;
               var10001 = 9627;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.h(
                  "Couldn't find the correct category! Please, add the item to the museum and restart the macro."
               );
               lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                  .a(true);
               this.a(true);
            } else {
               label122: {
   pxClinit: {
                  var10001 = -13952;
                  var10002 = -15314;
                  boolean var11 = Intrinsics.areEqual(var3, "Your Museum");
                  if (var2 != 0) {
                     if (var11) {
                        me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .a(var4.b(), 0, ContainerInput.PICKUP);
                        this.d().f();
                        break pxClinit;
                     }

                     var12 = var3;
                     if (var2 == 0) {
                        break label122;
                     }

                     var10001 = -13941;
                     var10002 = -26049;
                     var11 = Intrinsics.areEqual(var3, "Confirm Donation");
                  }

                  if (var11) {
                     label93: {
                        label92: {
                           Object var13 = var1.m();
                           if (var2 != 0) {
                              if (var13 == null) {
                                 break label92;
                              }

                              var13 = CollectionsKt.getOrNull((List)var13, 20);
                           }

                           Slot var14 = (Slot)var13;
                           if ((Slot)var13 != null) {
                              ItemStack var15 = var14.getItem();
                              if (var15 != null) {
                                 var16 = var15.getItem();
                                 if (var2 != 0) {
                                    break label93;
                                 }
                              }
                           }
                        }

                        var16 = null;
                     }

                     if (!Intrinsics.areEqual(var16, Items.LIME_TERRACOTTA)) {
                        break pxClinit;
                     }

                     me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a(20, 0, ContainerInput.PICKUP);
                     lIIIIIIIIlIlIlIlIIIlIlIllIIIlIIllIIllIlIlIIlIIIlIlIIIIIIIIllIllIIllllllIlIIlIIllIIlIl var6 = lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                        .c();
                     int var7 = var6.b();
                     var6.b(var7 + 1);
                     var7 = var4.c();
                     var4.a(var7 + 1);
                     List var17 = var4.f();
                     lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll var26 = lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                        .e();
                     Intrinsics.checkNotNull(var26);
                     var17.remove(var26.a());
                     lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                        .a((lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll)null);
                     this.a(true);
                     if (var2 != 0) {
                        break pxClinit;
                     }
                  }

                  var12 = var3;
               }
}

               if (var2 != 0) {
                  if (var12 == null) {
                     return;
                  }

                  var12 = var3;
               }

               var10001 = -13922;
               var10002 = 4845;
               boolean var18 = StringsKt.contains((CharSequence)var12, "Museum", false);
               if (var2 != 0) {
                  if (!var18) {
                     return;
                  }

                  CharSequence var19 = var3;
                  var10001 = -13931;
                  var10002 = 27307;
                  var18 = StringsKt.contains(var19, "Weapons", false);
               }

               label120: {
   pxClinit: {
                  if (var2 != 0) {
                     if (var18) {
                        break label120;
                     }

                     CharSequence var20 = var3;
                     var10001 = -13930;
                     var10002 = -28981;
                     var18 = StringsKt.contains(var20, "Armor", false);
                  }

                  if (var2 != 0) {
                     if (var18) {
                        break label120;
                     }

                     CharSequence var21 = var3;
                     var10001 = -13927;
                     var10002 = 11677;
                     var18 = StringsKt.contains(var21, "Rarities", false);
                  }

                  if (var2 != 0) {
                     if (var18) {
                        break label120;
                     }

                     CharSequence var22 = var3;
                     var10001 = -13945;
                     var10002 = -16840;
                     var18 = StringsKt.contains(var22, "Special", false);
                  }

                  if (!var18) {
                     break pxClinit;
                  }
               }
}

               me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a(this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII, 0, ContainerInput.PICKUP);
               this.d().f();
            }
         }
      }
   }

   @SubscribeEvent
   public final void c(@NotNull me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      Object var13 = null; // PX-FIX
      int var2;
      ClientboundSystemChatPacket var8;
      label56: {
         int var10000 = IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid.p();
         short var10002 = -13933;
         short var10003 = 28549;
         Intrinsics.checkNotNullParameter(var1, "event");
         var2 = var10000;
         Packet var5 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         Packet var7 = var5;
         if (var2 == 0) {
            if (!(var5 instanceof ClientboundSystemChatPacket)) {
               var8 = null;
               break label56;
            }

            var7 = var5;
         }

         var8 = (ClientboundSystemChatPacket)var7;
      }

      if (var8 != null) {
         ClientboundSystemChatPacket var3 = var8;
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var9 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         String var10001 = var3.content().getString();
         short var25 = -13932;
         short var10004 = 2228;
         Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
         String var4 = StringsKt.trim(var9.a(var10001)).toString();
         CharSequence var10 = var4;
         short var16 = -13935;
         short var22 = -18936;
         if (StringsKt.contains(var10, "You have already donated that item", false)) {
            label46: {
               lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll var11 = lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                  .e();
               String var12 = var11 != null ? var11.a() : null;
               short var17 = -13936;
               var22 = 24035;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.h(
                  "Item already donated! Skipping " + var12
               );
               var13 = lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                  .g();
               if (var2 == 0) {
                  lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll var18 = lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                     .e();
                  if (var18 != null) {
                     var10001 = var18.a();
                     if (var10001 != null) {
                        break label46;
                     }
                  }
               }

               var10001 = "";
            }

            ((me.octo.client.PXDyn)var13).add(var10001);
            IIIllIlllIIllllIlllIllllIllIlIIIIIIIlIIIIIIIlllIIlIlIIIIIIIlllIllIIIlllIIIlIIlIIIlllI var14 = this;
            if (var2 == 0) {
               short var20 = -13929;
               var22 = -2111;
               if (!Intrinsics.areEqual(this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI, "Unknown")) {
                  IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI var6 = lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                     .c()
                     .c()
                     .b(this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI);
                  if (var6 != null) {
                     List var15 = var6.f();
                     if (var15 != null) {
                        lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll var21 = lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                           .e();
                        Intrinsics.checkNotNull(var21);
                        var15.remove(var21.a());
                     }
                  }
               }

               lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                  .a((lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll)null);
               var14 = this;
            }

            var14.a(true);
         }
      }
   }

   public final int b(int var1) {
      int var10000 = IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid.q();
      byte var3 = 54;
      int var2 = var10000;
      var10000 = var1;
      int var10001 = 9;
      if (var2 != 0) {
         if (var1 < 9) {
            return var3 + 27 + var1;
         }

         var10000 = var3;
         var10001 = var1 - 9;
      }

      return var10000 + var10001;
   }

   @Override
   public void j() {
      this.d().f();
      super.j();
   }

   @Override
   public void k() {
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = -1;
      short var10001 = -13938;
      short var10002 = 5463;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = "Unknown";
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = false;
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = false;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = false;
      me.octo.client.utils.player.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .g();
      this.d().d();
      super.k();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[30];
      int var3 = 0;
      String var2 = "\u001e(.\u0093MVL°ûl\u00183\u001c\u0010H6æ7FAeµýÕ\u008aR\u009dìC ñB\u0003Þ\u008b@7á·`\u0013ÿl\u008aoý²Ï\u008f\u0087Í<\u001fw^w\u008dÝ~ØR-+2½{-\u0018e\u0086~JbèôÙ`\\¤\".\u0017\\´WßÌ\u0084¸9\u0012ØwdG\u008d\u0014Û[/\b@ûL+ÛósØ\u0006Á¼\u0081YB4\u0007yãße\u0005Ò\u0081\u0013\u00960\u0007\u009aEk¾¬r,×6\u000b5 jX¨³\u0005ÊÞÛ}Ü\u000e\u000b\b°ë\u0082\u008dTr-ëpdpÙ\u0005\u009dè1»\u0081\u001frÝe\\_\u00914\u009c\u0086à\r2Òã\u0080~Ýh\u0089(N\\\u001bêC1ç¦}s\u0002\"Ò\"s\u0096Ç,|<\u0093\u0001J\u0005vjòý¸ýF\u0082¼\u0016;rþÈ(\u0015\u0085K\rI\u009a\u0005\u0005ø\u00165á\u000e\u0007y\u0010\u0095¿Á\u0098C\u000e\u0093U£@àø\u0018Ü¤>AÞV\u008e\u0007¸Óå³\u0084Ýö]\u008dÃÁæ\u009dèë[\u001aÙ~åT¨\u0087ÝA\u008e\u0098!ùEâÙ\u0091\u000e\u0010\u0013èÎ®\u000f6¡LÓX\u001cD\u0019\u0089\u009c\u0091þÔï©\u008e>\fÜêK\u0017óâ\u0006l¥'X\u0013\u0003¶@©Ë\u0091ª\u0001?\u0005\u0083ùé\u001eë\u001dDñp\u001d©ºèLv]\u0091³\u009a\u0087Å\u0010v'¥pdm2 Fa\u001aÕ/\tá\u008f\u0011\u008dõ\bps\u0011\u00022\u0084e(\u0016ÿx×\u000fØUËÔ\t\u0004\u0084´ÈÐ~¨òËÅmµe\u0007\u0099CÙó\u0012®\u0002³r´0\u0086Òß½\tìãDÇ&2öÌ ÀÐ\u001f¢x¿üèPé\u008ckµ¿\u0083\"í\u008aÏN\u0095ù|8|\u0087u(\u0082ýööØëÀsÙä\u000e%ES+\u0007Î#cÙ\u001fT\u0098\u0007¢^ò;ãþ:](Ju×\u000bÎ9\u009f@A5ö=Êª\u0091ä\u0007,\u0010oc0\u001dË\u0096[\u0000\u0081¬\u0083C\u0093(øâÎ:\u0096ÝÓ\u0004Úí½\u008d\u0084Â\u009b\u0085hÛÝ1!&\\ôî41q.úå \u007f <'íÁÙa¢\r\u0082\u007fi½Õ\u0094\u001d\u008b~j¤\u0099Ë+Ñ\u0094¬\f\u001f©\u0084\t:§Ë\u007f\u0014]¹k\u0015A\u001a¾\u009fEìj¢è½\u0084&n(t\u001c\u0006\n!üÅU0Jç\u008e'è6ía_\u008bSR¼Õ¹Ñ;\u0019á:æ\u0019\u001e\u0018\u0014\u0017Ø\u008ePH»\u0086\u0091Í\u0090c\u0098]ç¶ã±\u0098Ì\u0082\u0004\u008d\u0093\nKâ\u008eÄÒ\"Òª¶\u00adâd·§\u0000µ\u0081¾ßÅ|úw\u00928akÀÜ<\u0081á1ÙØ\u000b\u009bÃZøªÕ\u0093¼HÑÝ\f2°\u0097æfbÌ<óªË\u008d";
      int var4 = "\u001e(.\u0093MVL°ûl\u00183\u001c\u0010H6æ7FAeµýÕ\u008aR\u009dìC ñB\u0003Þ\u008b@7á·`\u0013ÿl\u008aoý²Ï\u008f\u0087Í<\u001fw^w\u008dÝ~ØR-+2½{-\u0018e\u0086~JbèôÙ`\\¤\".\u0017\\´WßÌ\u0084¸9\u0012ØwdG\u008d\u0014Û[/\b@ûL+ÛósØ\u0006Á¼\u0081YB4\u0007yãße\u0005Ò\u0081\u0013\u00960\u0007\u009aEk¾¬r,×6\u000b5 jX¨³\u0005ÊÞÛ}Ü\u000e\u000b\b°ë\u0082\u008dTr-ëpdpÙ\u0005\u009dè1»\u0081\u001frÝe\\_\u00914\u009c\u0086à\r2Òã\u0080~Ýh\u0089(N\\\u001bêC1ç¦}s\u0002\"Ò\"s\u0096Ç,|<\u0093\u0001J\u0005vjòý¸ýF\u0082¼\u0016;rþÈ(\u0015\u0085K\rI\u009a\u0005\u0005ø\u00165á\u000e\u0007y\u0010\u0095¿Á\u0098C\u000e\u0093U£@àø\u0018Ü¤>AÞV\u008e\u0007¸Óå³\u0084Ýö]\u008dÃÁæ\u009dèë[\u001aÙ~åT¨\u0087ÝA\u008e\u0098!ùEâÙ\u0091\u000e\u0010\u0013èÎ®\u000f6¡LÓX\u001cD\u0019\u0089\u009c\u0091þÔï©\u008e>\fÜêK\u0017óâ\u0006l¥'X\u0013\u0003¶@©Ë\u0091ª\u0001?\u0005\u0083ùé\u001eë\u001dDñp\u001d©ºèLv]\u0091³\u009a\u0087Å\u0010v'¥pdm2 Fa\u001aÕ/\tá\u008f\u0011\u008dõ\bps\u0011\u00022\u0084e(\u0016ÿx×\u000fØUËÔ\t\u0004\u0084´ÈÐ~¨òËÅmµe\u0007\u0099CÙó\u0012®\u0002³r´0\u0086Òß½\tìãDÇ&2öÌ ÀÐ\u001f¢x¿üèPé\u008ckµ¿\u0083\"í\u008aÏN\u0095ù|8|\u0087u(\u0082ýööØëÀsÙä\u000e%ES+\u0007Î#cÙ\u001fT\u0098\u0007¢^ò;ãþ:](Ju×\u000bÎ9\u009f@A5ö=Êª\u0091ä\u0007,\u0010oc0\u001dË\u0096[\u0000\u0081¬\u0083C\u0093(øâÎ:\u0096ÝÓ\u0004Úí½\u008d\u0084Â\u009b\u0085hÛÝ1!&\\ôî41q.úå \u007f <'íÁÙa¢\r\u0082\u007fi½Õ\u0094\u001d\u008b~j¤\u0099Ë+Ñ\u0094¬\f\u001f©\u0084\t:§Ë\u007f\u0014]¹k\u0015A\u001a¾\u009fEìj¢è½\u0084&n(t\u001c\u0006\n!üÅU0Jç\u008e'è6ía_\u008bSR¼Õ¹Ñ;\u0019á:æ\u0019\u001e\u0018\u0014\u0017Ø\u008ePH»\u0086\u0091Í\u0090c\u0098]ç¶ã±\u0098Ì\u0082\u0004\u008d\u0093\nKâ\u008eÄÒ\"Òª¶\u00adâd·§\u0000µ\u0081¾ßÅ|úw\u00928akÀÜ<\u0081á1ÙØ\u000b\u009bÃZøªÕ\u0093¼HÑÝ\f2°\u0097æfbÌ<óªË\u008d"
         .length();
      char var1 = '\n';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 57;
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
                     case 0 -> 11;
                     case 1 -> 19;
                     case 2 -> 81;
                     case 3 -> 12;
                     case 4 -> 46;
                     case 5 -> 36;
                     default -> 76;
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
                     d = new String[30];
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

                  var2 = "wù\tù\u0083·Fë\u0092V\u0017#\u00ad\u0007qÌjÂÁ»±";
                  var4 = "wù\tù\u0083·Fë\u0092V\u0017#\u00ad\u0007qÌjÂÁ»±".length();
                  var1 = '\r';
                  var8 = -1;
            }

            var10000 = 9;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ -13926) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 20;
            case 1 -> 220;
            case 2 -> 74;
            case 3 -> 248;
            case 4 -> 232;
            case 5 -> 195;
            case 6 -> 99;
            case 7 -> 250;
            case 8 -> 168;
            case 9 -> 169;
            case 10 -> 90;
            case 11 -> 10;
            case 12 -> 235;
            case 13 -> 41;
            case 14 -> 192;
            case 15 -> 185;
            case 16 -> 245;
            case 17 -> 95;
            case 18 -> 222;
            case 19 -> 203;
            case 20 -> 51;
            case 21 -> 205;
            case 22 -> 176;
            case 23 -> 111;
            case 24 -> 234;
            case 25 -> 16;
            case 26 -> 219;
            case 27 -> 87;
            case 28 -> 212;
            case 29 -> 0;
            case 30 -> 126;
            case 31 -> 42;
            case 32 -> 43;
            case 33 -> 75;
            case 34 -> 35;
            case 35 -> 131;
            case 36 -> 98;
            case 37 -> 15;
            case 38 -> 243;
            case 39 -> 7;
            case 40 -> 119;
            case 41 -> 55;
            case 42 -> 110;
            case 43 -> 145;
            case 44 -> 118;
            case 45 -> 40;
            case 46 -> 161;
            case 47 -> 12;
            case 48 -> 45;
            case 49 -> 138;
            case 50 -> 217;
            case 51 -> 60;
            case 52 -> 160;
            case 53 -> 65;
            case 54 -> 252;
            case 55 -> 207;
            case 56 -> 247;
            case 57 -> 3;
            case 58 -> 226;
            case 59 -> 177;
            case 60 -> 201;
            case 61 -> 2;
            case 62 -> 223;
            case 63 -> 38;
            case 64 -> 218;
            case 65 -> 72;
            case 66 -> 46;
            case 67 -> 189;
            case 68 -> 56;
            case 69 -> 67;
            case 70 -> 173;
            case 71 -> 183;
            case 72 -> 23;
            case 73 -> 151;
            case 74 -> 208;
            case 75 -> 163;
            case 76 -> 70;
            case 77 -> 96;
            case 78 -> 53;
            case 79 -> 166;
            case 80 -> 193;
            case 81 -> 112;
            case 82 -> 1;
            case 83 -> 91;
            case 84 -> 155;
            case 85 -> 85;
            case 86 -> 209;
            case 87 -> 153;
            case 88 -> 68;
            case 89 -> 136;
            case 90 -> 154;
            case 91 -> 175;
            case 92 -> 224;
            case 93 -> 69;
            case 94 -> 73;
            case 95 -> 18;
            case 96 -> 6;
            case 97 -> 167;
            case 98 -> 241;
            case 99 -> 37;
            case 100 -> 107;
            case 101 -> 141;
            case 102 -> 188;
            case 103 -> 213;
            case 104 -> 33;
            case 105 -> 179;
            case 106 -> 181;
            case 107 -> 251;
            case 108 -> 13;
            case 109 -> 242;
            case 110 -> 113;
            case 111 -> 134;
            case 112 -> 121;
            case 113 -> 149;
            case 114 -> 125;
            case 115 -> 24;
            case 116 -> 221;
            case 117 -> 146;
            case 118 -> 233;
            case 119 -> 117;
            case 120 -> 17;
            case 121 -> 172;
            case 122 -> 236;
            case 123 -> 216;
            case 124 -> 59;
            case 125 -> 148;
            case 126 -> 30;
            case 127 -> 77;
            case 128 -> 105;
            case 129 -> 116;
            case 130 -> 11;
            case 131 -> 158;
            case 132 -> 52;
            case 133 -> 123;
            case 134 -> 122;
            case 135 -> 39;
            case 136 -> 102;
            case 137 -> 156;
            case 138 -> 206;
            case 139 -> 196;
            case 140 -> 63;
            case 141 -> 200;
            case 142 -> 114;
            case 143 -> 162;
            case 144 -> 244;
            case 145 -> 21;
            case 146 -> 129;
            case 147 -> 84;
            case 148 -> 66;
            case 149 -> 28;
            case 150 -> 182;
            case 151 -> 26;
            case 152 -> 210;
            case 153 -> 150;
            case 154 -> 147;
            case 155 -> 109;
            case 156 -> 135;
            case 157 -> 78;
            case 158 -> 44;
            case 159 -> 228;
            case 160 -> 230;
            case 161 -> 238;
            case 162 -> 89;
            case 163 -> 143;
            case 164 -> 184;
            case 165 -> 215;
            case 166 -> 80;
            case 167 -> 202;
            case 168 -> 246;
            case 169 -> 62;
            case 170 -> 92;
            case 171 -> 191;
            case 172 -> 249;
            case 173 -> 239;
            case 174 -> 253;
            case 175 -> 187;
            case 176 -> 137;
            case 177 -> 254;
            case 178 -> 36;
            case 179 -> 227;
            case 180 -> 225;
            case 181 -> 93;
            case 182 -> 49;
            case 183 -> 103;
            case 184 -> 165;
            case 185 -> 71;
            case 186 -> 120;
            case 187 -> 171;
            case 188 -> 88;
            case 189 -> 106;
            case 190 -> 27;
            case 191 -> 159;
            case 192 -> 194;
            case 193 -> 211;
            case 194 -> 100;
            case 195 -> 14;
            case 196 -> 104;
            case 197 -> 164;
            case 198 -> 61;
            case 199 -> 34;
            case 200 -> 190;
            case 201 -> 115;
            case 202 -> 64;
            case 203 -> 144;
            case 204 -> 140;
            case 205 -> 170;
            case 206 -> 76;
            case 207 -> 19;
            case 208 -> 8;
            case 209 -> 142;
            case 210 -> 132;
            case 211 -> 139;
            case 212 -> 94;
            case 213 -> 178;
            case 214 -> 127;
            case 215 -> 82;
            case 216 -> 152;
            case 217 -> 128;
            case 218 -> 57;
            case 219 -> 101;
            case 220 -> 204;
            case 221 -> 4;
            case 222 -> 9;
            case 223 -> 124;
            case 224 -> 79;
            case 225 -> 198;
            case 226 -> 237;
            case 227 -> 214;
            case 228 -> 81;
            case 229 -> 29;
            case 230 -> 231;
            case 231 -> 97;
            case 232 -> 86;
            case 233 -> 58;
            case 234 -> 50;
            case 235 -> 48;
            case 236 -> 83;
            case 237 -> 199;
            case 238 -> 240;
            case 239 -> 197;
            case 240 -> 5;
            case 241 -> 186;
            case 242 -> 255;
            case 243 -> 47;
            case 244 -> 229;
            case 245 -> 157;
            case 246 -> 133;
            case 247 -> 32;
            case 248 -> 31;
            case 249 -> 25;
            case 250 -> 130;
            case 251 -> 54;
            case 252 -> 174;
            case 253 -> 108;
            case 254 -> 22;
            default -> 180;
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
}
