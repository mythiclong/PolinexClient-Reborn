package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.mixin.accessors.SignEditAccessor;
import net.minecraft.client.gui.screens.inventory.AbstractSignEditScreen;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.game.ServerboundSignUpdatePacket;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import org.jetbrains.annotations.NotNull;

public final class lIIIlIlIlIIlIIIIIlIlIlIIllllIllIlIlllIIIIIllIIlIllIIIIIIIIlIlIlllIllllllIllIlIlIIIlII
   extends IlIlIIIllIIlIIlllIlIlIlIIlIIIlIllIllIIIllIIlIlIIllIIlIIlIlllIIIlllIlIIlIIIIlIllIlIlII {
   private boolean IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private boolean llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static String[] c;
   private static String[] d;

   public lIIIlIlIlIIlIIIIIlIlIlIIllllIllIlIlllIIIIIllIIlIllIIIIIIIIlIlIlllIllllllIllIlIlIIIlII() {
      short var10001 = -9077;
      short var10002 = -14859;
      super("Auction Helper");
   }

   public final boolean n() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   public final void c(boolean var1) {
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var1;
   }

   public final boolean o() {
      return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   public final void d(boolean var1) {
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var1;
   }

   @Override
   public void g() {
   }

   public final void a(int var1) {
      me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(var1, 0, ContainerInput.PICKUP);
      this.d().f();
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII var1) {
      int var10000 = IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid.q();
      short var10002 = -9083;
      short var10003 = -28993;
      Intrinsics.checkNotNullParameter(var1, "event");
      int var2 = var10000;
      net.minecraft.client.gui.screens.Screen var8;
      boolean var7 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      if (var2 != 0) {
         if (this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) {
            return;
         }

         var7 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m();
      }

      if (var2 != 0) {
         if (!var7) {
            return;
         }

         var7 = ((java.util.function.Supplier<Boolean>)(() -> { this.d().a(800); return false; })).get();
      }

      label54: {
         if (var2 != 0) {
            if (!var7) {
               return;
            }

            var8 = this.a().screen;
            if (var2 == 0) {
               break label54;
            }

            var7 = var8 instanceof AbstractSignEditScreen;
         }

         if (!var7) {
            return;
         }

         var8 = this.a().screen;
         var10002 = -9088;
         var10003 = -2985;
         Intrinsics.checkNotNull(var8, "null cannot be cast to non-null type me.octo.client.mixin.accessors.SignEditAccessor");
      }

      SignEditAccessor var3 = (SignEditAccessor)var8;
      SignBlockEntity var4 = var3.getSign();
      boolean var5 = var3.isIsFrontText();
      BlockPos var9 = var4.getBlockPos();
      var10002 = -9085;
      var10003 = 10207;
      Intrinsics.checkNotNullExpressionValue(var9, "getBlockPos(...)");
      BlockPos var6 = var9;
      ClientPacketListener var10 = this.a().getConnection();
      if (var10 != null) {
         lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll var10005 = lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
            .e();
         if (var10005 == null) {
            return;
         }

         String var15 = var10005.b();
         if (var15 == null) {
            return;
         }

         short var10007 = -9074;
         short var10008 = -7505;
         var10008 = -9079;
         short var10009 = -18338;
         ServerboundSignUpdatePacket var10001 = new ServerboundSignUpdatePacket(var6, var5, var15, "", "^^^^^^^^^^^^^^^", "Enter query");
         var10.send(var10001);
      }

      this.a().setScreen(null);
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = true;
   }

   @SubscribeEvent
   public final void c(@NotNull me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI var1) {
      int var10000 = IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid.q();
      short var10002 = -9084;
      short var10003 = -16877;
      Intrinsics.checkNotNullParameter(var1, "event");
      int var2 = var10000;
      boolean var34 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m();
      if (var2 != 0) {
         if (!var34) {
            return;
         }

         var34 = ((java.util.function.Supplier<Boolean>)(() -> { this.d().a(500); return false; })).get();
      }

      if (var34) {
         String var35 = var1.k();
         if (var35 != null) {
            String var3 = var35;
            if (var2 != 0) {
               List var36 = var1.m();
               if (var36 != null) {
                  List var4 = var36;
                  CharSequence var37 = var3;
                  short var10001 = -9087;
                  var10002 = -2586;
                  var34 = StringsKt.contains(var37, "Auction House", false);
                  if (var2 != 0) {
                     if (var34) {
                        me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var39 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                        String var54 = ((Slot)var4.get(11)).getItem().getHoverName().getString();
                        var10003 = -9081;
                        short var10004 = 12581;
                        Intrinsics.checkNotNullExpressionValue(var54, "getString(...)");
                        String var40 = var39.a(var54);
                        var10001 = -9086;
                        var10002 = 28550;
                        if (!Intrinsics.areEqual(var40, "Auctions Browser")) {
                           return;
                        }

                        this.a(11);
                        if (var2 != 0) {
                           return;
                        }
                     }

                     var10001 = -9075;
                     var10002 = 9970;
                     var34 = Intrinsics.areEqual(var3, "Auction Browser");
                  }

                  if (var2 != 0) {
                     if (!var34) {
                        return;
                     }

                     var34 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
                  }

                  Object var41;
                  label167: {
                     label166: {
                        if (var2 != 0) {
                           if (var34) {
                              break label166;
                           }

                           var41 = var4;
                           if (var2 == 0) {
                              break label167;
                           }

                           var34 = Intrinsics.areEqual(((Slot)var4.get(47)).getItem().getItem(), Items.ANVIL);
                        }

                        if (var34) {
                           this.a(47);
                           return;
                        }
                     }

                     me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var42 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                     ItemStack var57 = ((Slot)var4.get(52)).getItem();
                     var10003 = -9078;
                     short var73 = -2387;
                     Intrinsics.checkNotNullExpressionValue(var57, "getItem(...)");
                     var41 = var42.d(var57);
                  }

                  Object var6 = var41;
                  boolean var7 = false;
                  var var9 = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)var6, 10));
                  boolean var10 = false;

                  label156: {
                     for (Object var12 : (Iterable<?>)(var6)) {
                        Component var13 = (Component)var12;
                        boolean var14 = false;
                        me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var43 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                        String var58 = var13.getString();
                        var10003 = -9080;
                        short var74 = 12868;
                        Intrinsics.checkNotNullExpressionValue(var58, "getString(...)");
                        var9.add(var43.a(var58));
                        if (var2 == 0) {
                           break label156;
                        }

                        if (var2 == 0) {
                           break;
                        }
                     }

                     var6 = var9;
                     var7 = false;
                  }

                  label199: {
                     label145:
                     if (var2 != 0) {
                        if (var6 instanceof Collection) {
                           if (var2 == 0) {
                              break label145;
                           }

                           if (((Collection)var6).isEmpty()) {
                              var34 = false;
                              break label199;
                           }
                        }
                     }

                     Iterator var8 = ((Iterable)var6).iterator();

                     label138:
                     while (true) {
                        if (!var8.hasNext()) {
                           var34 = false;
                           break;
                        }

                        Object var22 = var8.next();
                        String var24 = (String)var22;
                        boolean var27 = false;
                        CharSequence var46 = var24;
                        var10001 = -9073;
                        var10002 = -7174;
                        var34 = StringsKt.contains(var46, "▶ BIN Only", false);

                        while (var34) {
                           var34 = true;
                           if (var2 != 0) {
                              break label138;
                           }
                        }
                     }
                  }

                  boolean var5 = var34;
                  Object var47 = var4;
                  if (var2 != 0) {
                     if (Intrinsics.areEqual(((Slot)var4.get(52)).getItem().getItem(), Items.GOLD_INGOT) && !var5) {
                        this.a(52);
                        this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = true;
                        return;
                     }

                     me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var48 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                     ItemStack var60 = ((Slot)var4.get(50)).getItem();
                     var10003 = -9082;
                     short var75 = -12935;
                     Intrinsics.checkNotNullExpressionValue(var60, "getItem(...)");
                     var47 = var48.d(var60);
                  }

                  Object var19 = var47;
                  boolean var20 = false;
                  var var25 = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)var19, 10));
                  boolean var28 = false;

                  label125: {
                     for (Object var32 : (Iterable<?>)(var19)) {
                        Component var33 = (Component)var32;
                        boolean var15 = false;
                        me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var49 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                        String var61 = var33.getString();
                        var10003 = -9080;
                        short var76 = 12868;
                        Intrinsics.checkNotNullExpressionValue(var61, "getString(...)");
                        var25.add(var49.a(var61));
                        if (var2 == 0) {
                           break label125;
                        }

                        if (var2 == 0) {
                           break;
                        }
                     }

                     var19 = var25;
                     var20 = false;
                  }

                  label202: {
                     label114:
                     if (var2 != 0) {
                        if (var19 instanceof Collection) {
                           if (var2 == 0) {
                              break label114;
                           }

                           if (((Collection)var19).isEmpty()) {
                              var34 = false;
                              break label202;
                           }
                        }
                     }

                     Iterator var23 = ((Iterable)var19).iterator();

                     label107:
                     while (true) {
                        if (!var23.hasNext()) {
                           var34 = false;
                           break;
                        }

                        Object var26 = var23.next();
                        String var29 = (String)var26;
                        boolean var31 = false;
                        CharSequence var52 = var29;
                        var10001 = -9076;
                        var10002 = 10798;
                        var34 = StringsKt.contains(var52, "▶ Lowest Price", false);

                        while (var34) {
                           var34 = true;
                           if (var2 != 0) {
                              break label107;
                           }
                        }
                     }
                  }

                  boolean var17 = var34;
                  var34 = Intrinsics.areEqual(((Slot)var4.get(50)).getItem().getItem(), Items.HOPPER);
                  label94:
                  if (var2 != 0) {
                     if (var34) {
                        var34 = var17;
                        if (var2 == 0) {
                           break label94;
                        }

                        if (!var17) {
                           this.a(50);
                           this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = true;
                           return;
                        }
                     }

                     var34 = Intrinsics.areEqual(((Slot)var4.get(48)).getItem().getItem(), Items.OAK_SIGN);
                  }

                  if (var34) {
                     this.a(48);
                     this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = true;
                     return;
                  }

                  return;
               }
            }
         }
      }
   }

   @Override
   public void j() {
      int var1 = IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid.q();
      if (var1 != 0) {
         if (lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
               .e()
            == null) {
            this.k();
            if (var1 != 0) {
               return;
            }
         }

         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = false;
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = false;
         this.d().f();
      }

      super.j();
   }

   @Override
   public void k() {
      this.d().d();
      super.k();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[16];
      int var3 = 0;
      String var2 = "!Â,`f 9\u0087<n\u001d\u0012Y6\u0094@\u0010<>zÛ\\'Öo\u001dEF¸J\u0091Ï\u0019\r\u0093é\u008f!âx\u0001×\u008fFvL¹TæAä,(Î7Â\u0081cT»ÛA\u000fÆS\u0017&\u0016=ó9eß\u0014\u009d84\u008cÆã8èúTEÙZ $ë\bY\"y¶\u0080%@]r\u008f¹\u0080ms\u0083[K0Ê\r\u0099\u0097«°\u0012\u0091·\u0016\u0098ûg\u008e¹£Ô:\u0007\u0088/ªý\u000eÖ\u0099Ò\u001a¡ÁÐ\u0010}~¹¹;\u0082\fø÷\u0017Í\u0019uÃ5ÒR,ý\u0005à\u009bG\u0016 \u0005Ý àaÔ\u000e×j\u0007Qóv#\u0016ËtçB±3\f2¶Nå2p¦\u0095~F¹\u007f\u000bZr%;YG\u0011Ã\\&\u0088\u000e.gÍÅB:¬oò\u0091HD\u0005=\n╴¢[\u008aZØô+\u0010H\u000fÊäeä\u0012\u009eþbPpr°Lª8";
      int var4 = "!Â,`f 9\u0087<n\u001d\u0012Y6\u0094@\u0010<>zÛ\\'Öo\u001dEF¸J\u0091Ï\u0019\r\u0093é\u008f!âx\u0001×\u008fFvL¹TæAä,(Î7Â\u0081cT»ÛA\u000fÆS\u0017&\u0016=ó9eß\u0014\u009d84\u008cÆã8èúTEÙZ $ë\bY\"y¶\u0080%@]r\u008f¹\u0080ms\u0083[K0Ê\r\u0099\u0097«°\u0012\u0091·\u0016\u0098ûg\u008e¹£Ô:\u0007\u0088/ªý\u000eÖ\u0099Ò\u001a¡ÁÐ\u0010}~¹¹;\u0082\fø÷\u0017Í\u0019uÃ5ÒR,ý\u0005à\u009bG\u0016 \u0005Ý àaÔ\u000e×j\u0007Qóv#\u0016ËtçB±3\f2¶Nå2p¦\u0095~F¹\u007f\u000bZr%;YG\u0011Ã\\&\u0088\u000e.gÍÅB:¬oò\u0091HD\u0005=\n╴¢[\u008aZØô+\u0010H\u000fÊäeä\u0012\u009eþbPpr°Lª8"
         .length();
      char var1 = 16;
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
                     case 0 -> 3;
                     case 1 -> 90;
                     case 2 -> 13;
                     case 3 -> 98;
                     case 4 -> 78;
                     case 5 -> 31;
                     default -> 36;
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
                     d = new String[16];
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

                  var2 = "áÀò7~\u0089¡Ú¢É±4=>\u0081\u000e▵~^\u0004?\u009dIGc\u0086º¥òÑ";
                  var4 = "áÀò7~\u0089¡Ú¢É±4=>\u0081\u000e▵~^\u0004?\u009dIGc\u0086º¥òÑ".length();
                  var1 = 15;
                  var8 = -1;
            }

            var10000 = 44;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ -9085) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 9;
            case 1 -> 197;
            case 2 -> 67;
            case 3 -> 22;
            case 4 -> 162;
            case 5 -> 145;
            case 6 -> 37;
            case 7 -> 42;
            case 8 -> 175;
            case 9 -> 189;
            case 10 -> 53;
            case 11 -> 214;
            case 12 -> 66;
            case 13 -> 45;
            case 14 -> 52;
            case 15 -> 62;
            case 16 -> 205;
            case 17 -> 0;
            case 18 -> 193;
            case 19 -> 81;
            case 20 -> 59;
            case 21 -> 88;
            case 22 -> 242;
            case 23 -> 102;
            case 24 -> 3;
            case 25 -> 30;
            case 26 -> 64;
            case 27 -> 246;
            case 28 -> 196;
            case 29 -> 119;
            case 30 -> 32;
            case 31 -> 103;
            case 32 -> 168;
            case 33 -> 154;
            case 34 -> 113;
            case 35 -> 159;
            case 36 -> 140;
            case 37 -> 89;
            case 38 -> 226;
            case 39 -> 224;
            case 40 -> 41;
            case 41 -> 47;
            case 42 -> 38;
            case 43 -> 56;
            case 44 -> 87;
            case 45 -> 31;
            case 46 -> 195;
            case 47 -> 202;
            case 48 -> 223;
            case 49 -> 212;
            case 50 -> 16;
            case 51 -> 85;
            case 52 -> 73;
            case 53 -> 115;
            case 54 -> 70;
            case 55 -> 135;
            case 56 -> 163;
            case 57 -> 225;
            case 58 -> 34;
            case 59 -> 49;
            case 60 -> 83;
            case 61 -> 75;
            case 62 -> 18;
            case 63 -> 94;
            case 64 -> 129;
            case 65 -> 108;
            case 66 -> 82;
            case 67 -> 137;
            case 68 -> 144;
            case 69 -> 165;
            case 70 -> 208;
            case 71 -> 171;
            case 72 -> 36;
            case 73 -> 26;
            case 74 -> 254;
            case 75 -> 97;
            case 76 -> 27;
            case 77 -> 160;
            case 78 -> 40;
            case 79 -> 228;
            case 80 -> 204;
            case 81 -> 219;
            case 82 -> 158;
            case 83 -> 122;
            case 84 -> 114;
            case 85 -> 11;
            case 86 -> 93;
            case 87 -> 124;
            case 88 -> 206;
            case 89 -> 182;
            case 90 -> 233;
            case 91 -> 232;
            case 92 -> 84;
            case 93 -> 156;
            case 94 -> 106;
            case 95 -> 121;
            case 96 -> 134;
            case 97 -> 110;
            case 98 -> 112;
            case 99 -> 253;
            case 100 -> 61;
            case 101 -> 86;
            case 102 -> 249;
            case 103 -> 132;
            case 104 -> 230;
            case 105 -> 6;
            case 106 -> 222;
            case 107 -> 178;
            case 108 -> 203;
            case 109 -> 215;
            case 110 -> 133;
            case 111 -> 194;
            case 112 -> 183;
            case 113 -> 185;
            case 114 -> 170;
            case 115 -> 8;
            case 116 -> 247;
            case 117 -> 20;
            case 118 -> 105;
            case 119 -> 210;
            case 120 -> 157;
            case 121 -> 218;
            case 122 -> 244;
            case 123 -> 255;
            case 124 -> 221;
            case 125 -> 147;
            case 126 -> 58;
            case 127 -> 192;
            case 128 -> 107;
            case 129 -> 139;
            case 130 -> 46;
            case 131 -> 78;
            case 132 -> 148;
            case 133 -> 24;
            case 134 -> 120;
            case 135 -> 231;
            case 136 -> 181;
            case 137 -> 7;
            case 138 -> 57;
            case 139 -> 153;
            case 140 -> 91;
            case 141 -> 238;
            case 142 -> 43;
            case 143 -> 14;
            case 144 -> 198;
            case 145 -> 166;
            case 146 -> 217;
            case 147 -> 60;
            case 148 -> 48;
            case 149 -> 74;
            case 150 -> 176;
            case 151 -> 39;
            case 152 -> 179;
            case 153 -> 51;
            case 154 -> 2;
            case 155 -> 35;
            case 156 -> 201;
            case 157 -> 125;
            case 158 -> 44;
            case 159 -> 245;
            case 160 -> 80;
            case 161 -> 19;
            case 162 -> 76;
            case 163 -> 177;
            case 164 -> 188;
            case 165 -> 200;
            case 166 -> 12;
            case 167 -> 174;
            case 168 -> 243;
            case 169 -> 207;
            case 170 -> 146;
            case 171 -> 79;
            case 172 -> 227;
            case 173 -> 250;
            case 174 -> 23;
            case 175 -> 241;
            case 176 -> 199;
            case 177 -> 190;
            case 178 -> 25;
            case 179 -> 237;
            case 180 -> 117;
            case 181 -> 209;
            case 182 -> 169;
            case 183 -> 240;
            case 184 -> 65;
            case 185 -> 116;
            case 186 -> 186;
            case 187 -> 235;
            case 188 -> 123;
            case 189 -> 142;
            case 190 -> 149;
            case 191 -> 29;
            case 192 -> 127;
            case 193 -> 104;
            case 194 -> 184;
            case 195 -> 71;
            case 196 -> 17;
            case 197 -> 92;
            case 198 -> 216;
            case 199 -> 126;
            case 200 -> 1;
            case 201 -> 220;
            case 202 -> 131;
            case 203 -> 68;
            case 204 -> 252;
            case 205 -> 96;
            case 206 -> 99;
            case 207 -> 55;
            case 208 -> 248;
            case 209 -> 236;
            case 210 -> 54;
            case 211 -> 152;
            case 212 -> 95;
            case 213 -> 173;
            case 214 -> 229;
            case 215 -> 172;
            case 216 -> 161;
            case 217 -> 138;
            case 218 -> 239;
            case 219 -> 251;
            case 220 -> 28;
            case 221 -> 211;
            case 222 -> 4;
            case 223 -> 98;
            case 224 -> 164;
            case 225 -> 33;
            case 226 -> 187;
            case 227 -> 141;
            case 228 -> 90;
            case 229 -> 143;
            case 230 -> 21;
            case 231 -> 180;
            case 232 -> 150;
            case 233 -> 77;
            case 234 -> 130;
            case 235 -> 128;
            case 236 -> 167;
            case 237 -> 69;
            case 238 -> 13;
            case 239 -> 15;
            case 240 -> 191;
            case 241 -> 234;
            case 242 -> 111;
            case 243 -> 101;
            case 244 -> 5;
            case 245 -> 151;
            case 246 -> 213;
            case 247 -> 100;
            case 248 -> 72;
            case 249 -> 118;
            case 250 -> 136;
            case 251 -> 155;
            case 252 -> 63;
            case 253 -> 50;
            case 254 -> 109;
            default -> 10;
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
