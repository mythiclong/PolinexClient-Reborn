package me.octo.client;

import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll;
import me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
import me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
import me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
import me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIIllIIIlIIllIlIllIIlIIllllIIIIIIIlllIIIlllIlIIIlIlllllIIllIlIllIlIIlIIlIIlIlIIIlIIll
   extends IlIlIIIllIIlIIlllIlIlIlIIlIIIlIllIllIIIllIIlIlIIllIIlIIlIlllIIIlllIlIIlIIIIlIllIlIlII {
    public static <T> T a(Object... args) { return null; } // PX-FIX ovld-var
   @Nullable
   private CompletableFuture<IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid> IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @Nullable
   private String llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private boolean lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private final Pattern lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private final Pattern lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private boolean lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private boolean IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private boolean llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @Nullable
   private String IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private boolean IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static String[] c;
   private static String[] d;

   public IIIllIIIlIIllIlIllIIlIIllllIIIIIIIlllIIIlllIlIIIlIlllllIIllIlIllIlIIlIIlIIlIlIIIlIIll() {
      short var10001 = -6773;
      short var10002 = 22710;
      super("Auction Helper");
      var10001 = -6754;
      var10002 = 18093;
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = Pattern.compile("^You purchased (.+) for ([0-9,]+) coins!$");
      var10001 = -6772;
      var10002 = -3044;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = Pattern.compile("^You claimed (.+) from .+'s auction!$");
   }

   public final boolean n() {
      return this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   }

   public final void c(boolean var1) {
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var1;
   }

   public final boolean o() {
      return this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   }

   public final void d(boolean var1) {
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var1;
   }

   public final boolean p() {
      return this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   }

   public final void e(boolean var1) {
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var1;
   }

   public void g() {
      int var1 = IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid.p();
      if (!me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m()) {
         return;
      }

      String var2 = lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
         .e()
         .a();
      if (var2 == null) {
         this.k();
         return;
      }

      if (!Intrinsics.areEqual(this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI, var2)) {
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var2;
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = null;
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = false;
      }

      CompletableFuture var3 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      if (var3 == null) {
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.b(
            IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, var2, 0L, 2, (Object)null
         );
         return;
      }

      Intrinsics.checkNotNullExpressionValue(var3, "getAuthData(...)");
      if (var3.isDone() && !this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl) {
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = true;

         IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid var4;
         Object var5;
         try {
            var5 = var3.get();
         } catch (Exception var6) {
            var6.printStackTrace();
            lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
               .g()
               .add(var2);
            lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
               .a((lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll)null);
            this.k();
            return;
         }

         var4 = (IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid)var5;
         if (StringsKt.equals(var4.c(), "success", true) && var4.g() != null && !(var4.g() instanceof JsonNull)) {
            JsonObject var7 = JsonElementKt.getJsonObject(var4.g());
            System.out.println("JsonObject:\n" + var7);
            String var8 = JsonElementKt.getContentOrNull(JsonElementKt.getJsonPrimitive((JsonElement)var7.get("uuid")));
            Long var9 = JsonElementKt.getLongOrNull(JsonElementKt.getJsonPrimitive((JsonElement)var7.get("price")));
            if (StringsKt.isBlank(var8) || var9 == null) {
               lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                  .g()
                  .add(var2);
               lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                  .a((lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll)null);
               this.k();
               return;
            }

            if (var9.longValue() - (long)IlIIIlIIIlIIIlIIlIIllIIIIlIllIllIlIlIIllllIIlIIIIIllIIIlIlllIIIlIIllIllIlIlllIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().M() * 1000000L > 0) {
               lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                  .g()
                  .add(var2);
               lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                  .a((lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll)null);
               this.k();
               return;
            }

            this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = var8;
            if (!this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl) {
               this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = true;
               this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = true;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("Viewing auction " + var8);
            }

            LocalPlayer var10 = this.a().player;
            if (var10 != null && var10.connection != null) {
               var10.connection.sendChat("/viewauction " + var8);
            }

            this.d().f();
            return;
         }

         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.h("Error while gathering the auction data.");
         lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
            .g()
            .add(var2);
         lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
            .a((lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll)null);
         this.k();
         return;
      }
   }

   public final void a(int var1) {
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(var1, 0, ContainerInput.PICKUP);
      this.d().f();
   }

   @SubscribeEvent
   public final void c(@NotNull llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI var1) {
      Object var29 = null; // PX-FIX
      String var26 = null; // PX-FIX
      String var21 = null; // PX-FIX
      int var10000 = IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid.p();
      short var10002 = -6759;
      short var10003 = -23444;
      Intrinsics.checkNotNullParameter(var1, "event");
      int var2 = var10000;
      boolean var17 = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m();
      if (var2 == 0) {
         if (!var17) {
            return;
         }

         var17 = ((java.util.function.Supplier<Boolean>)(() -> { this.d().a(500); return false; })).get();
      }

      if (var17) {
         String var18 = var1.k();
         String var10001 = var18;
         if (var2 == 0) {
            if (var18 == null) {
               return;
            }

            var18 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a(var18);
            var10001 = var18;
         }

         if (var10001 != null) {
            String var3 = var18;
            if (var2 == 0) {
               List var19 = var1.m();
               if (var19 != null) {
                  label182: {
                     List var4 = var19;
                     short var35 = -6762;
                     var10002 = 8846;
                     var17 = Intrinsics.areEqual(var3, "BIN Auction View");
                     if (var2 == 0) {
                        if (var17) {
                           label152: {
                              Slot var27 = (Slot)CollectionsKt.getOrNull(var4, 31);
                              if (var27 != null) {
                                 ItemStack var28 = var27.getItem();
                                 if (var28 != null) {
                                    var29 = var28.getItem();
                                    if (var2 == 0) {
                                       break label152;
                                    }
                                 }
                              }

                              var29 = null;
                           }

                           Item var13 =((Item)( var29));
                           var17 = Intrinsics.areEqual(var13, Items.GOLD_NUGGET);
                           if (var2 == 0) {
                              if (var17) {
                                 label142: {
                                    if (var2 == 0) {
                                       Slot var38 = (Slot)CollectionsKt.getOrNull(var4, 13);
                                       if (var38 != null) {
                                          ItemStack var39 = var38.getItem();
                                          if (var39 != null) {
                                             var10001 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                                .c(var39);
                                             if (var2 == 0) {
                                                break label142;
                                             }
                                          }
                                       }
                                    }

                                    var10001 = null;
                                 }

                                 lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                                    .a(var10001);
                                 if (var2 == 0) {
                                    if (lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                                          .f()
                                       == null) {
                                       lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll var33 = lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                                          .e();
                                       if (var33 != null) {
                                          String var34 = var33.a();
                                          if (var34 != null) {
                                             String var15 = var34;
                                             boolean var16 = false;
                                             lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                                                .g()
                                                .add(var15);
                                          }
                                       }

                                       lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                                          .a((lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll)null);
                                       this.k();
                                       return;
                                    }

                                    this.a(31);
                                    this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = true;
                                 }

                                 if (var2 == 0) {
                                    return;
                                 }
                              }

                              var17 = Intrinsics.areEqual(var13, Items.POTATO);
                           }

                           label132: {
                              if (var2 == 0) {
                                 if (var17) {
                                    break label132;
                                 }

                                 var17 = Intrinsics.areEqual(var13, Items.POISONOUS_POTATO);
                              }

                              if (!var17) {
                                 return;
                              }
                           }

                           lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll var31 = lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                              .e();
                           if (var31 != null) {
                              String var32 = var31.a();
                              if (var32 != null) {
                                 String var14 = var32;
                                 boolean var12 = false;
                                 lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                                    .g()
                                    .add(var14);
                              }
                           }

                           lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                              .a((lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll)null);
                           this.k();
                           return;
                        }

                        var21 = var3;
                        if (var2 != 0) {
                           break label182;
                        }

                        short var36 = -6756;
                        var10002 = 18715;
                        var17 = Intrinsics.areEqual(var3, "Confirm Purchase");
                     }

                     if (!var17) {
                        return;
                     }

                     var21 = ((String)(CollectionsKt.getOrNull(var4, 11)));
                  }

                  label119: {
                     label186: {
                        Slot var7 = (Slot)(Object)var21;
                        Slot var22 = var7;
                        if (var2 == 0) {
                           if (var7 == null) {
                              break label186;
                           }

                           var22 = var7;
                        }

                        ItemStack var8 = var22.getItem();
                        ItemStack var23 = var8;
                        if (var2 == 0) {
                           if (var8 == null) {
                              break label186;
                           }

                           var23 = var8;
                        }

                        Component var9 = var23.getHoverName();
                        Component var24 = var9;
                        if (var2 == 0) {
                           if (var9 == null) {
                              break label186;
                           }

                           var24 = var9;
                        }

                        String var10 = var24.getString();
                        String var25 = var10;
                        if (var2 == 0) {
                           if (var10 == null) {
                              break label186;
                           }

                           var25 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .a(var10);
                        }

                        String var11 = var25;
                        var26 = var11;
                        if (var2 != 0) {
                           break label119;
                        }

                        if (var11 != null) {
                           var26 = StringsKt.trim(var11).toString();
                           break label119;
                        }
                     }

                     var26 = null;
                  }

                  String var6 = var26;
                  if (var2 == 0) {
                     short var37 = -6784;
                     var10002 = 661;
                     if (!Intrinsics.areEqual(var6, "Confirm")) {
                        return;
                     }

                     this.a(11);
                  }

                  this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = true;
                  return;
               }
            }
         }
      }
   }

   @SubscribeEvent
   public final void c(@NotNull IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      Integer var17 = null; // PX-FIX
      int var2;
      ClientboundSystemChatPacket var12;
      label63: {
         int var10000 = IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid.p();
         short var10002 = -6757;
         short var10003 = 4656;
         Intrinsics.checkNotNullParameter(var1, "event");
         var2 = var10000;
         Packet var5 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         Packet var11 = var5;
         if (var2 == 0) {
            if (!(var5 instanceof ClientboundSystemChatPacket)) {
               var12 = null;
               break label63;
            }

            var11 = var5;
         }

         var12 = (ClientboundSystemChatPacket)var11;
      }

      if (var12 != null) {
         ClientboundSystemChatPacket var3 = var12;
         IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var13 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         String var10001 = var3.content().getString();
         short var30 = -6760;
         short var10004 = 13094;
         Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
         String var4 = StringsKt.trim(var13.a(var10001)).toString();
         Matcher var9 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.matcher(var4);
         Matcher var6 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.matcher(var4);
         boolean var14 = var9.find();
         if (var2 == 0) {
            if (var14) {
               String var7;
               label51: {
                  var7 = var9.group(1);
                  if (var2 == 0) {
                     String var15 = var9.group(2);
                     short var25 = -6771;
                     var30 = 4019;
                     Intrinsics.checkNotNullExpressionValue(var15, "group(...)");
                     Integer var16 = StringsKt.toIntOrNull(StringsKt.replace(var15, ",", "", false));
                     if (var16 != null) {
                        var17 = var16;
                        break label51;
                     }
                  }

                  var17 = 0;
               }

               int var8 = var17;
               lIllllIlIlIlIlIIIlIlIllIIlIIIlIIIIIllllIllllIIlIllIlIIllIlIlIIIllllIllIIlIIIlllIIllII var18 = lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                  .b();
               BigDecimal var21 = lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                  .b()
                  .d()
                  .add(new BigDecimal(var8));
               var30 = -6753;
               var10004 = -1413;
               Intrinsics.checkNotNullExpressionValue(var21, "add(...)");
               var18.b(var21);
               if (var2 == 0) {
                  if (lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                     .b()
                     .c()) {
                     lIllllIlIlIlIlIIIlIlIllIIlIIIlIIIIIllllIllllIIlIllIlIIllIlIlIIIllllIllIIlIIIlllIIllII var19 = lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                        .b();
                     BigDecimal var22 = lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                        .b()
                        .b()
                        .subtract(new BigDecimal(var8));
                     var30 = -6755;
                     var10004 = -14938;
                     Intrinsics.checkNotNullExpressionValue(var22, "subtract(...)");
                     var19.a(var22);
                  }

                  short var26 = -6758;
                  var30 = 6559;
                  var30 = -6769;
                  var10004 = -10606;
                  var10004 = -6775;
                  short var10005 = -30081;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
                     "Successfully purchased " + var7 + " for " + var8 + " coins."
                  );
               }

               if (var2 == 0) {
                  return;
               }
            }

            var14 = var6.find();
         }

         if (var2 == 0) {
            if (var14) {
               String var10 = var6.group(1);
               short var23 = -6774;
               short var27 = -28639;
               var27 = -6766;
               var30 = -18798;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
                  "Successfully claimed " + var10 + " from auction."
               );
               llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .g(true);
               this.k();
               if (var2 == 0) {
                  return;
               }
            }

            CharSequence var20 = var4;
            short var24 = -6776;
            short var29 = -940;
            var14 = StringsKt.contains(var20, "auction wasn't found!", false);
         }

         if (var14) {
            lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
               .a((lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll)null);
            this.k();
         }
      }
   }

   public void j() {
      int var1;
      String var3;
      label26: {
         var1 = IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid.p();
         if (var1 == 0) {
            lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll var10000 = lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
               .e();
            if (var10000 != null) {
               var3 = var10000.a();
               break label26;
            }
         }

         var3 = null;
      }

      String var2 = var3;
      if (var1 == 0) {
         if (var2 != null) {
            if (IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.n()) {
               LocalPlayer var4 = this.a().player;
               Intrinsics.checkNotNull(var4);
               var4.closeContainer();
            }

            this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = false;
            this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = false;
            this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = false;
            this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = null;
            this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var2;
            this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = false;
            this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = null;
            this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = false;
            this.d().f();
            super.j();
            return;
         }

         this.k();
      }
   }

   public void k() {
      this.d().d();
      llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .f(true);
      super.k();
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[25];
      int var3 = 0;
      String var2 = "\u008eì¦\u008f´8©£zwb\u0003\u000b\u000e\u0005þöû\u0080,\u0017\u0014ûPO\u008e\u0017Çoü£ \u0002WÊM9\u0099û³ëòòÛ\u0005Õ{\u009e1\u0080\u0010Ob$  ^\u0091!Îýyéùÿß»\r;\u008d\u0090\u0096 Ëç¶·\u008a}zï)\nÇ3w*Ç¸\u0002Ã\u009c\u009eky¸0»\u0084ù¼ÓQÇ\u009eÒOËvÈ7Ñ-0\u0094êQà x»cÌ\bi¼\u008cß¹z^{\u0010¿)\u0086\u009e\u009e¦\\¡\rí\u0007ü\u0004¦\\\u001a\f-$A\u007f\u000b¬\u0001(\b0¼\u0018\u000eÎÿ\u0007²_væi\u009e\n=:\u000fG\r:(lPP JÜ\u008auLj©\u0007\u0089ÞÇë|\u0083\u0099\u0005í»\" \u008b\u0010¹MûaWÿL¦\u0083ÉÒu-Oª¶'J{^´k¶\u008alÍ\f\u0010®.<ÌÎ\u008eF\u009f\u0018|v\u001c\n\u0094ê¸ Ï×\u0017ç&Ü¯(\u0005¡ü\u0015\u0018ç¥Û<l\u0001Ù\u0098öq\u0013\u0096\u0019ÇÓ;-e\u0098\u0082\u0007:1\u0084È\u0092¬s\u0015]·yÆ«&cIhg2\u009a\u0005Ê\u001e[ÃÃ·^³\u000e\u007fºmp%\u0019\"wÃ'Ý³½Ö%\u0004xò\u0080\u0012*¦Ý0\u0013¯(\u009ei/G¯\u000eq\u0015G\u0005&ÆCú×\u0010p?¨À\u009d\u000f5´M\nFd¤M\u0088Øíî\u0014\u0097\u0004,\u001d¿\u0094";
      int var4 = "\u008eì¦\u008f´8©£zwb\u0003\u000b\u000e\u0005þöû\u0080,\u0017\u0014ûPO\u008e\u0017Çoü£ \u0002WÊM9\u0099û³ëòòÛ\u0005Õ{\u009e1\u0080\u0010Ob$  ^\u0091!Îýyéùÿß»\r;\u008d\u0090\u0096 Ëç¶·\u008a}zï)\nÇ3w*Ç¸\u0002Ã\u009c\u009eky¸0»\u0084ù¼ÓQÇ\u009eÒOËvÈ7Ñ-0\u0094êQà x»cÌ\bi¼\u008cß¹z^{\u0010¿)\u0086\u009e\u009e¦\\¡\rí\u0007ü\u0004¦\\\u001a\f-$A\u007f\u000b¬\u0001(\b0¼\u0018\u000eÎÿ\u0007²_væi\u009e\n=:\u000fG\r:(lPP JÜ\u008auLj©\u0007\u0089ÞÇë|\u0083\u0099\u0005í»\" \u008b\u0010¹MûaWÿL¦\u0083ÉÒu-Oª¶'J{^´k¶\u008alÍ\f\u0010®.<ÌÎ\u008eF\u009f\u0018|v\u001c\n\u0094ê¸ Ï×\u0017ç&Ü¯(\u0005¡ü\u0015\u0018ç¥Û<l\u0001Ù\u0098öq\u0013\u0096\u0019ÇÓ;-e\u0098\u0082\u0007:1\u0084È\u0092¬s\u0015]·yÆ«&cIhg2\u009a\u0005Ê\u001e[ÃÃ·^³\u000e\u007fºmp%\u0019\"wÃ'Ý³½Ö%\u0004xò\u0080\u0012*¦Ý0\u0013¯(\u009ei/G¯\u000eq\u0015G\u0005&ÆCú×\u0010p?¨À\u009d\u000f5´M\nFd¤M\u0088Øíî\u0014\u0097\u0004,\u001d¿\u0094"
         .length();
      char var1 = 14;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 79;
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
                     case 0 -> 121;
                     case 1 -> 42;
                     case 2 -> 1;
                     case 3 -> 107;
                     case 4 -> 104;
                     case 5 -> 73;
                     default -> 7;
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
                     d = new String[25];
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "µdaÈt\u0007¿o.\u0095õü/";
                  var4 = "µdaÈt\u0007¿o.\u0095õü/".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 52;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ -6760) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 48;
            case 1 -> 246;
            case 2 -> 179;
            case 3 -> 199;
            case 4 -> 93;
            case 5 -> 243;
            case 6 -> 255;
            case 7 -> 213;
            case 8 -> 54;
            case 9 -> 43;
            case 10 -> 151;
            case 11 -> 55;
            case 12 -> 83;
            case 13 -> 40;
            case 14 -> 245;
            case 15 -> 251;
            case 16 -> 57;
            case 17 -> 17;
            case 18 -> 99;
            case 19 -> 124;
            case 20 -> 236;
            case 21 -> 69;
            case 22 -> 166;
            case 23 -> 226;
            case 24 -> 169;
            case 25 -> 197;
            case 26 -> 49;
            case 27 -> 158;
            case 28 -> 232;
            case 29 -> 133;
            case 30 -> 20;
            case 31 -> 74;
            case 32 -> 113;
            case 33 -> 188;
            case 34 -> 46;
            case 35 -> 238;
            case 36 -> 104;
            case 37 -> 121;
            case 38 -> 102;
            case 39 -> 164;
            case 40 -> 2;
            case 41 -> 78;
            case 42 -> 110;
            case 43 -> 187;
            case 44 -> 147;
            case 45 -> 184;
            case 46 -> 5;
            case 47 -> 140;
            case 48 -> 118;
            case 49 -> 143;
            case 50 -> 176;
            case 51 -> 122;
            case 52 -> 230;
            case 53 -> 181;
            case 54 -> 131;
            case 55 -> 23;
            case 56 -> 201;
            case 57 -> 0;
            case 58 -> 22;
            case 59 -> 21;
            case 60 -> 75;
            case 61 -> 1;
            case 62 -> 26;
            case 63 -> 163;
            case 64 -> 112;
            case 65 -> 53;
            case 66 -> 219;
            case 67 -> 85;
            case 68 -> 32;
            case 69 -> 217;
            case 70 -> 252;
            case 71 -> 90;
            case 72 -> 138;
            case 73 -> 174;
            case 74 -> 115;
            case 75 -> 87;
            case 76 -> 103;
            case 77 -> 8;
            case 78 -> 162;
            case 79 -> 111;
            case 80 -> 114;
            case 81 -> 4;
            case 82 -> 141;
            case 83 -> 198;
            case 84 -> 33;
            case 85 -> 168;
            case 86 -> 106;
            case 87 -> 135;
            case 88 -> 227;
            case 89 -> 91;
            case 90 -> 82;
            case 91 -> 137;
            case 92 -> 28;
            case 93 -> 86;
            case 94 -> 11;
            case 95 -> 61;
            case 96 -> 196;
            case 97 -> 50;
            case 98 -> 41;
            case 99 -> 42;
            case 100 -> 183;
            case 101 -> 205;
            case 102 -> 14;
            case 103 -> 247;
            case 104 -> 153;
            case 105 -> 76;
            case 106 -> 72;
            case 107 -> 233;
            case 108 -> 51;
            case 109 -> 119;
            case 110 -> 208;
            case 111 -> 145;
            case 112 -> 156;
            case 113 -> 209;
            case 114 -> 235;
            case 115 -> 123;
            case 116 -> 202;
            case 117 -> 96;
            case 118 -> 139;
            case 119 -> 116;
            case 120 -> 73;
            case 121 -> 225;
            case 122 -> 125;
            case 123 -> 239;
            case 124 -> 52;
            case 125 -> 206;
            case 126 -> 127;
            case 127 -> 95;
            case 128 -> 154;
            case 129 -> 59;
            case 130 -> 37;
            case 131 -> 189;
            case 132 -> 109;
            case 133 -> 10;
            case 134 -> 215;
            case 135 -> 160;
            case 136 -> 13;
            case 137 -> 250;
            case 138 -> 101;
            case 139 -> 27;
            case 140 -> 203;
            case 141 -> 56;
            case 142 -> 65;
            case 143 -> 193;
            case 144 -> 120;
            case 145 -> 64;
            case 146 -> 244;
            case 147 -> 190;
            case 148 -> 142;
            case 149 -> 84;
            case 150 -> 31;
            case 151 -> 148;
            case 152 -> 172;
            case 153 -> 39;
            case 154 -> 34;
            case 155 -> 222;
            case 156 -> 92;
            case 157 -> 171;
            case 158 -> 66;
            case 159 -> 152;
            case 160 -> 117;
            case 161 -> 178;
            case 162 -> 211;
            case 163 -> 38;
            case 164 -> 242;
            case 165 -> 60;
            case 166 -> 237;
            case 167 -> 173;
            case 168 -> 88;
            case 169 -> 68;
            case 170 -> 105;
            case 171 -> 210;
            case 172 -> 200;
            case 173 -> 44;
            case 174 -> 100;
            case 175 -> 29;
            case 176 -> 134;
            case 177 -> 47;
            case 178 -> 15;
            case 179 -> 36;
            case 180 -> 7;
            case 181 -> 45;
            case 182 -> 204;
            case 183 -> 177;
            case 184 -> 71;
            case 185 -> 80;
            case 186 -> 3;
            case 187 -> 248;
            case 188 -> 130;
            case 189 -> 157;
            case 190 -> 185;
            case 191 -> 229;
            case 192 -> 240;
            case 193 -> 216;
            case 194 -> 149;
            case 195 -> 194;
            case 196 -> 249;
            case 197 -> 221;
            case 198 -> 97;
            case 199 -> 62;
            case 200 -> 191;
            case 201 -> 81;
            case 202 -> 231;
            case 203 -> 129;
            case 204 -> 241;
            case 205 -> 58;
            case 206 -> 16;
            case 207 -> 161;
            case 208 -> 175;
            case 209 -> 63;
            case 210 -> 19;
            case 211 -> 107;
            case 212 -> 223;
            case 213 -> 182;
            case 214 -> 67;
            case 215 -> 25;
            case 216 -> 128;
            case 217 -> 126;
            case 218 -> 12;
            case 219 -> 35;
            case 220 -> 136;
            case 221 -> 108;
            case 222 -> 30;
            case 223 -> 9;
            case 224 -> 167;
            case 225 -> 6;
            case 226 -> 146;
            case 227 -> 170;
            case 228 -> 165;
            case 229 -> 195;
            case 230 -> 98;
            case 231 -> 253;
            case 232 -> 144;
            case 233 -> 89;
            case 234 -> 224;
            case 235 -> 254;
            case 236 -> 155;
            case 237 -> 77;
            case 238 -> 212;
            case 239 -> 207;
            case 240 -> 218;
            case 241 -> 70;
            case 242 -> 228;
            case 243 -> 132;
            case 244 -> 159;
            case 245 -> 234;
            case 246 -> 150;
            case 247 -> 180;
            case 248 -> 186;
            case 249 -> 192;
            case 250 -> 214;
            case 251 -> 18;
            case 252 -> 94;
            case 253 -> 220;
            case 254 -> 79;
            default -> 24;
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
