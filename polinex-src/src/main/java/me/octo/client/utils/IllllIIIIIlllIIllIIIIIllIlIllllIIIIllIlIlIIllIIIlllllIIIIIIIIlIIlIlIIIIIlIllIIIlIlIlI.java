package me.octo.client.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.optionals.OptionalsKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import me.octo.client.IlllllllIlIIIlIlIIIlIIllIllIIIlllIlllIIIlIlIlIIIlIlIlIIlIlllIIlIllIlIlIlIlIllIllIllII;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundSetPlayerTeamPacket;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import net.minecraft.network.protocol.game.ClientboundSetPlayerTeamPacket.Parameters;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI
   extends lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   @NotNull
   public static IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static int IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static int lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static int IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static int llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private static lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static int lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static int lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static int lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static int IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static int llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static int IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static int IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static int IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static int IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private static int llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private static int IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   private static int lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   private static int llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   private static int lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   private static int IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   private static boolean IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   private static String[] c;
   private static String[] d;

   private IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI() {
   }

   public final int g() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   public final void b(int var1) {
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var1;
   }

   public final int h() {
      return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   public final void c(int var1) {
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var1;
   }

   public final int i() {
      return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   public final void d(int var1) {
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var1;
   }

   public final int j() {
      return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   public final void e(int var1) {
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var1;
   }

   public final int k() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   public final void f(int var1) {
      lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var1;
   }

   public final int l() {
      return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   public final void g(int var1) {
      lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var1;
   }

   public final int m() {
      return lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   }

   public final void h(int var1) {
      lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var1;
   }

   public final int n() {
      return IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   }

   public final void i(int var1) {
      IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var1;
   }

   public final int o() {
      return llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   }

   public final void j(int var1) {
      llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var1;
   }

   public final int p() {
      return IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   }

   public final void k(int var1) {
      IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = var1;
   }

   public final int q() {
      return IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   }

   public final void l(int var1) {
      IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var1;
   }

   public final int r() {
      return IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   }

   public final void m(int var1) {
      IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = var1;
   }

   public final int s() {
      return IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   }

   public final void n(int var1) {
      IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = var1;
   }

   public final int t() {
      return llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   }

   public final void o(int var1) {
      llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = var1;
   }

   public final int u() {
      return IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   }

   public final void p(int var1) {
      IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = var1;
   }

   public final int v() {
      return lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   }

   public final void q(int var1) {
      lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = var1;
   }

   public final int w() {
      return llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   }

   public final void r(int var1) {
      llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = var1;
   }

   public final int x() {
      return lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   }

   public final void s(int var1) {
      lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = var1;
   }

   public final int y() {
      return IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   }

   public final void t(int var1) {
      IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = var1;
   }

   public final boolean z() {
      return IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   }

   public final void a(boolean var1) {
      IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = var1;
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII var1) {
      Object var10000 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      short var10002 = 25994;
      short var10003 = 1369;
      Intrinsics.checkNotNullParameter(var1, "event");
      Object var2 = var10000;
      byte var4 = ((byte)((me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m()) ? 1 : 0));
      if (var2 != null) {
         if (var4 == 0) {
            return;
         }

         var4 = ((java.util.function.Supplier<Byte>)(() -> { lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.a(10000); return 0; })).get();
      }

      label44: {
         if (var2 != null) {
            if (var4 == 0) {
               break label44;
            }

            var4 = 0;
         }

         llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var4;
      }

      var10000 = this.a().player;
      if (var2 != null) {
         if (var10000 == null) {
            return;
         }

         var10000 = (Entity)var10000;
      }

      Vec3 var6 = me.octo.client.utils.player.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a((Entity)var10000);
      if (var6 != null) {
         Vec3 var3 = var6;
         if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g()
            == me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            )
          {
            double var8;
            int var7 = (
                     var8 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .b(var3, new Vec3(0.5, 127.0, 200.5))
                        - 36.0
                  )
                  == 0.0
               ? 0
               : (var8 < 0.0 ? -1 : 1);
            if (var2 != null) {
               if (var7 >= 0) {
                  return;
               }

               var7 = 0;
            }

            IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var7;
         }
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.lIlllIlllllIIIIllIlIIlIlIllllIIIIllIIllIIlIlIIlIllIlIllIlIIIIlIIIIlIlIIllIIllIIIlllII var1) {
      int[] var10000 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      short var10002 = 25994;
      short var10003 = 1369;
      Intrinsics.checkNotNullParameter(var1, "event");
      int[] var2 = var10000;
      if (var2 != null) {
         if (!me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m()) {
            return;
         }

         this.a(var1.k());
         this.b(var1.k());
         this.c(var1.k());
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) { String var13 = null; // PX-FIX hoist
        
      Object var8 = null; // PX-FIX
      short var10001 = 26000;
      short var10002 = 26282;
      Intrinsics.checkNotNullParameter(var1, "event");
      int[] var10000 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      Packet var3 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      int[] var2 = var10000;
      boolean var6 = var3 instanceof ClientboundSystemChatPacket;
      if (var2 != null) {
         if (!var6) {
            return;
         }

         var6 = ((ClientboundSystemChatPacket)var3).overlay();
      }

      if (var6) {
         this.a((ClientboundSystemChatPacket)var3);
         this.b((ClientboundSystemChatPacket)var3);
         if (var2 != null) {
            return;
         }
      }

      String var4;
      IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var7 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
       var13 = ((ClientboundSystemChatPacket)var3).content().getString();
      short var10003 = 25989;
      short var10004 = 29290;
      Intrinsics.checkNotNullExpressionValue(var13, "getString(...)");
      var4 = var7.a(var13);
      var10001 = 26010;
      var10002 = -3910;
      var8 = StringsKt.startsWith(var4, "Your", false);
      label38:
      if (var2 != null) {
         label46:
         if (!((Boolean)var8)) {
            CharSequence var9 = var4;
            var10001 = 26009;
            var10002 = -12318;
            boolean var10 = StringsKt.contains(var9, "is empty! Refuel it by talking to a Drill Mechanic!", false);
            if (var2 != null) {
               if (!var10) {
                  CharSequence var11 = var4;
                  var10001 = 25988;
                  var10002 = -29479;
                  var8 = StringsKt.contains(var11, "is close to empty! Refuel it by talking to a Drill Mechanic!", false);
                  if (var2 == null) {
                     break label38;
                  }

                  if (((Boolean)(var8))) {
                     break label46;
                  }
               }

               var10 = true;
            }

            IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = var10;
         }

         var8 = StringsKt.startsWith(var4, "[", false);
      }

      if (var2 != null) {
         if (!((Boolean)var8)) {
            return;
         }

         CharSequence var12 = var4;
         var10001 = 26011;
         var10002 = -8663;
         var8 = StringsKt.contains(var12, " Commission Complete! ", false);
      }

      if (var2 != null) {
         if (((Boolean)(var8))) {
            return;
         }

         var8 = IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
      }

      int var5 =((Integer)( var8));
      IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = var5 + 1;
      var10001 = 26012;
      var10002 = 6376;
      IlllllllIlIIIlIlIIIlIIllIllIIIlllIlllIIIlIlIlIIIlIlIlIIlIlllIIlIllIlIlIlIlIllIllIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a("commissions", 1L);
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      short var10001 = 25994;
      short var10002 = 1369;
      Intrinsics.checkNotNullParameter(var1, "event");
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 0;
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 0;
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = 100000;
      IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = false;
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI var1) { ArrayList var13 = null; // PX-FIX hoist
        
      double var39 = 0; // PX-FIX
      Object var36 = null; // PX-FIX
      int[] var2 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      me.octo.client.events.impl.IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI var10000 = var1;
      if (var2 != null) {
         short var10001 = 25994;
         short var10002 = 1369;
         Intrinsics.checkNotNullParameter(var1, "event");
         if (this.a().player == null) {
            return;
         }

         var10000 = var1;
      }

      BlockPos var32 = var10000.k();
      if (var32 != null) {
         BlockPos var3 = var32;
         if (var2 != null) {
            BlockState var33 = var1.m();
            if (var33 != null) {
               BlockState var4 = var33;
               if (var2 != null) {
                  BlockState var34 = var1.l();
                  if (var34 != null) {
                     BlockState var5 = var34;
                     BlockPos var6 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .r();
                     int var7 = var3.getX() - var6.getX();
                     int var8 = var3.getY() - var6.getY();
                     int var9 = var3.getZ() - var6.getZ();
                     int var35 = var7 * var7 + var8 * var8 + var9 * var9;
                     if (var2 != null) {
                        if (var35 > 36) {
                           return;
                        }

                        var35 = ((IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .e(var5)) ? 1 : 0);
                     }

                     label256: {
                        if (var2 != null) {
                           if (var35 != 0) {
                              var35 = ((var4.is(Blocks.SANDSTONE)) ? 1 : 0);
                              break label256;
                           }

                           var35 = ((IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .f(var5)) ? 1 : 0);
                        }

                        if (var2 != null) {
                           if (var35 != 0) {
                              var35 = ((var4.is(Blocks.RED_SANDSTONE)) ? 1 : 0);
                              break label256;
                           }

                           var35 = ((IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .g(var5)) ? 1 : 0);
                        }

                        if (var2 != null) {
                           var35 = var35 != 0 ? (var4.is(Blocks.BROWN_TERRACOTTA) ? 1 : 0) : 0;
                        }
                     }

                     int var10 = var35;
                     var36 = var4.isAir();
                     label229:
                     if (var2 != null) {
                        if (((Boolean)(var36))) {
                           var36 = var4.is(Blocks.BEDROCK);
                           if (var2 == null) {
                              break label229;
                           }

                           if (((Boolean)(var36))) {
                              var36 = var10;
                              if (var2 == null) {
                                 break label229;
                              }

                              if (var10 == 0) {
                                 return;
                              }
                           }
                        }

                        var36 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .a(var5);
                     }

                     label258: {
                        if (var2 != null) {
                           if (!((Boolean)var36)) {
                              int var11 = IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll++;
                              if (var2 != null) {
                                 break label258;
                              }
                           }

                           var36 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .b(var5);
                        }

                        if (var2 != null) {
                           if (!((Boolean)var36)) {
                              int var17 = IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl++;
                              if (var2 != null) {
                                 break label258;
                              }
                           }

                           var36 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .p(var5);
                        }

                        if (var2 != null) {
                           if (!((Boolean)var36)) {
                              int var18 = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl++;
                              if (var2 != null) {
                                 break label258;
                              }
                           }

                           var36 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .k(var5);
                        }

                        if (var2 != null) {
                           if (!((Boolean)var36)) {
                              int var19 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI++;
                              if (var2 != null) {
                                 break label258;
                              }
                           }

                           var36 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .D(var5);
                        }

                        if (var2 != null) {
                           if (!((Boolean)var36)) {
                              int var20 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll++;
                              if (var2 != null) {
                                 break label258;
                              }
                           }

                           var36 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .l(var5);
                        }

                        if (var2 != null) {
                           if (!((Boolean)var36)) {
                              int var21 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl++;
                              if (var2 != null) {
                                 break label258;
                              }
                           }

                           var36 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .m(var5);
                        }

                        if (var2 != null) {
                           if (!((Boolean)var36)) {
                              int var22 = llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI++;
                              if (var2 != null) {
                                 break label258;
                              }
                           }

                           var36 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .n(var5);
                        }

                        if (var2 != null) {
                           if (!((Boolean)var36)) {
                              int var23 = IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl++;
                              if (var2 != null) {
                                 break label258;
                              }
                           }

                           var36 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .o(var5);
                        }

                        if (var2 != null) {
                           if (!((Boolean)var36)) {
                              int var24 = IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl++;
                              if (var2 != null) {
                                 break label258;
                              }
                           }

                           var36 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .c(var5);
                        }

                        if (var2 != null) {
                           if (!((Boolean)var36)) {
                              int var25 = llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI++;
                              if (var2 != null) {
                                 break label258;
                              }
                           }

                           var36 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .d(var5);
                        }

                        if (var2 != null) {
                           if (!((Boolean)var36)) {
                              int var26 = IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll++;
                              if (var2 != null) {
                                 break label258;
                              }
                           }

                           var36 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .e(var5);
                        }

                        if (var2 != null) {
                           if (!((Boolean)var36)) {
                              int var27 = lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll++;
                              if (var2 != null) {
                                 break label258;
                              }
                           }

                           var36 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .f(var5);
                        }

                        if (var2 != null) {
                           if (!((Boolean)var36)) {
                              int var28 = llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl++;
                              if (var2 != null) {
                                 break label258;
                              }
                           }

                           var36 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .g(var5);
                        }

                        if (var2 != null) {
                           if (((Boolean)(var36))) {
                              return;
                           }

                           var36 = lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
                        }

                        int var29 =((Integer)( var36));
                        lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = var29 + 1;
                        if (var2 == null) {
                           return;
                        }
                     }

                     ArrayList var14 = lIIllIlIlllIlIIIIIIIIlIllllIlIlIIlllIllIIIlIllIIlIIlIIlIlIlIIIIlIIIlllIIIlIlIIIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .b();
                     boolean var16 = false;
                     boolean var37 = var14.isEmpty();
                     if (var2 != null) {
                        var37 = !var37;
                     }

                     label141: {
                         var13 = var37 ? var14 : null;
                        Object var38 = var13;
                        if (var2 != null) {
                           if (var13 == null) {
                              var39 = 0.0;
                              break label141;
                           }

                           var38 = var13;
                        }

                        var39 = CollectionsKt.averageOfDouble((Iterable)var38);
                     }

                     double var30 = var39;
                     double var41;
                     int var40 = (var41 = Math.abs(var30) - (Double.MAX_VALUE)) == 0.0 ? 0 : (var41 < 0.0 ? -1 : 1);
                     if (var2 != null) {
                        var40 = var40 <= 0 ? 1 : 0;
                     }

                     if (var40 != 0) {
                        lIIllIlIlllIlIIIIIIIIlIllllIlIlIIlllIllIIIlIllIIlIIlIIlIlIlIIIIlIIIlllIIIlIlIIIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .a(
                              lIIllIlIlllIlIIIIIIIIlIllllIlIlIIlllIllIIIlIllIIlIIlIIlIlIlIIIIlIIIlllIIIlIlIIIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .c()
                                 + var30
                           );
                     }

                     int var31 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI++;
                     lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.f();
                     return;
                  }
               }

               return;
            }
         }
      }
   }

   private final void a(ClientboundSystemChatPacket var1) { MatchResult var13 = null; // PX-FIX hoist
        
      int var22 = 0; // PX-FIX
      Object var21 = null; // PX-FIX
      Object var19 = null; // PX-FIX
      Object var10 = null; // PX-FIX
      int[] var10000 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var10001 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      String var10002 = var1.content().getString();
      short var10004 = 25996;
      short var10005 = -3243;
      Intrinsics.checkNotNullExpressionValue(var10002, "getString(...)");
      String var3 = var10001.a(var10002);
      int[] var2 = var10000;
      if (var3.length() >= 3) {
         short var23 = 26014;
         short var10003 = -23729;
         MatchResult var5 = (new Regex("(\\d{1,3}(?:,\\d{3})*)/\\d+k?\\s+Drill Fuel")).find( var3, 0);
          var13 = var5;
         if (var2 != null) {
            if (var5 == null) {
               return;
            }

            var13 = var5;
         }

         List var6 = var13.getGroupValues();
         var10000 = (int[])(Object)var6;
         if (var2 != null) {
            if (var6 == null) {
               return;
            }

            var10000 = (int[])var6.get(1);
         }

         String var7 = (String)(Object)var10000;
         String var15 = var7;
         if (var2 != null) {
            if (var7 == null) {
               return;
            }

            var15 = StringsKt.replace(var7, ",", "", false);
         }

         String var8 = var15;
         String var16 = var8;
         if (var2 != null) {
            if (var8 == null) {
               return;
            }

            var16 = var8;
         }

         Integer var9 = StringsKt.toIntOrNull(var16);
         Integer var17 = var9;
         if (var2 != null) {
            if (var9 == null) {
               return;
            }

            var17 = var9;
         }

         int var4;
         label68: {
            var4 = var17;
            if (var2 != null) {
               me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var18 = lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .q();
               if (var18 != null) {
                  var19 = var18.b();
                  break label68;
               }
            }

            var19 = null;
         }

         label62: {
            var10 = var19;
            if (var2 != null) {
               me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var20 = lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .o();
               if (var20 != null) {
                  var21 = var20.b();
                  break label62;
               }
            }

            var21 = null;
         }

         Integer var11 =((Integer)( var21));
         int var12 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .K();
         if (var2 != null) {
            label54: {
               if (var10 != null && var11 != null) {
                  var22 = var12;
                  if (var2 == null) {
                     break label54;
                  }

                  if (var12 == var11) {
                     var22 = ((Intrinsics.areEqual(var11, var10)) ? 1 : 0);
                     if (var2 == null) {
                        break label54;
                     }

                     if (var22 == 0) {
                        return;
                     }
                  }
               }

               var22 = var4;
            }

            IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var22;
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final void b(ClientboundSystemChatPacket var1) { short var13 = (short)0; // PX-FIX hoist
        
      Object var10 = null; // PX-FIX
      int[] var10000 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var10001 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      String var10002 = var1.content().getString();
      short var10004 = 25996;
      short var10005 = -3243;
      Intrinsics.checkNotNullExpressionValue(var10002, "getString(...)");
      String var3 = var10001.a(var10002);
      int[] var2 = var10000;
      if (var3.length() >= 3) {
         short var14 = 25985;
         short var10003 = -1242;
         Regex var4 = new Regex("\\+([0-9,.]+(?:\\.[0-9]+)?)\\sMining", RegexOption.IGNORE_CASE);
         MatchResult var5 = (var4).find( var3, 0);
         var10000 = (int[])(Object)var5;
         if (var2 != null) {
            if (var5 == null) {
               return;
            }

            var10000 = (int[])(Object)(var5.getGroupValues().get(1));
         }

         label53: {
            String var6 = (String)(Object)var10000;
            if (var2 != null) {
               Double var9 = StringsKt.toDoubleOrNull(StringsKt.replace(var6, ",", "", false));
               if (var9 != null) {
                  var10 = (int)var9.doubleValue();
                  break label53;
               }
            }

            var10 = 0;
         }

         int var7 =((Integer)( var10));
         int var11 = var7;
         if (var2 != null) {
            if (var7 > 0) {
               lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI var12 = lIIllIlIlllIlIIIIIIIIlIllllIlIlIIlllIllIIIlIllIIlIIlIIlIlIlIIIIlIIIlllIIIlIlIIIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a();
               if (var2 != null) {
                  final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI var12f = var12;
                  if (!((java.util.function.Supplier<Boolean>)(() -> { var12f.a(1500); return false; })).get()) {
                     return;
                  }

                  lIIllIlIlllIlIIIIIIIIlIllllIlIlIIlllIllIIIlIllIIlIIlIIlIlIlIIIIlIIIlllIIIlIlIIIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(
                        lIIllIlIlllIlIIIIIIIIlIllllIlIlIIlllIllIIIlIllIIlIIlIIlIlIlIIIIlIIIlllIIIlIlIIIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .c()
                           + var7
                     );
                   var13 = 26003;
                  short var15 = -4114;
                  IlllllllIlIIIlIlIIIlIIllIllIIIlllIlllIIIlIlIlIIIlIlIlIIlIlllIIlIllIlIlIlIlIllIllIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a("miningXp", var7);
                  var12 = lIIllIlIlllIlIIIIIIIIlIllllIlIlIIlllIllIIIlIllIIlIIlIIlIlIlIIIIlIIIlllIIIlIlIIIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a();
               }

               var12.f();
               return;
            }

            var11 = lIIllIlIlllIlIIIIIIIIlIllllIlIlIIlllIllIIIlIllIIlIIlIIlIlIlIIIIlIIIlllIIIlIlIIIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b()
               .size();
         }

         while (var11 > 10) {
            lIIllIlIlllIlIIIIIIIIlIllllIlIlIIlllIllIIIlIllIIlIIlIIlIlIlIIIIlIIIlllIIIlIlIIIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b()
               .remove(0);
            if (var2 == null) {
               return;
            }

            if (var2 == null) {
               break;
            }

            var11 = lIIllIlIlllIlIIIIIIIIlIllllIlIlIIlllIllIIIlIllIIlIIlIIlIlIlIIIIlIIIlllIIIlIlIIIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b()
               .size();
         }

         lIIllIlIlllIlIIIIIIIIlIllllIlIlIIlllIllIIIlIllIIlIIlIIlIlIlIIIIlIIIlllIIIlIlIIIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b()
            .add((double)var7);
      }
   }

   private final void a(ClientboundSetPlayerTeamPacket param1) {
      int[] var2 = me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      java.util.Optional var3 = param1.getParameters();
      kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var3, "getParameters(...)");
      net.minecraft.network.protocol.game.ClientboundSetPlayerTeamPacket.Parameters var9 = (net.minecraft.network.protocol.game.ClientboundSetPlayerTeamPacket.Parameters) kotlin.jvm.optionals.OptionalsKt.getOrNull(var3);
      if (var9 == null) {
         return;
      }
      net.minecraft.network.chat.Component var10 = var9.getPlayerPrefix();
      if (var10 == null) {
         return;
      }
      String var11 = var10.getString();
      if (var11 == null) {
         return;
      }
      String var4 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var11);
      if (var4 == null) {
         return;
      }
      String var5 = new kotlin.text.Regex("§[0-9A-FK-ORa-fk-or]").replace((CharSequence)var4, "");
      if (me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g() != me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl) {
         return;
      }
      if (!var5.startsWith("Cold")) {
         return;
      }
      int var6i;
      try {
         Character var12 = kotlin.text.StringsKt.getOrNull((CharSequence)var5, 7);
         if (var12 == null) {
            return;
         }
         char var13 = var12.charValue();
         Character var14 = kotlin.text.StringsKt.getOrNull((CharSequence)var5, 8);
         char var15 = var14 != null ? var14.charValue() : ' ';
         if (!Character.isDigit(var13)) {
            var6i = 0;
         } else if (!Character.isDigit(var15)) {
            var6i = kotlin.text.CharsKt.digitToInt(var13);
         } else {
            var6i = Integer.parseInt("" + var13 + var15);
         }
      } catch (Exception var16) {
         var6i = 0;
      }
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var6i;
   }

   private final void b(ClientboundSetPlayerTeamPacket param1) {
      int[] var2 = me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      java.util.Optional var3 = param1.getParameters();
      kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var3, "getParameters(...)");
      net.minecraft.network.protocol.game.ClientboundSetPlayerTeamPacket.Parameters var9 = (net.minecraft.network.protocol.game.ClientboundSetPlayerTeamPacket.Parameters) kotlin.jvm.optionals.OptionalsKt.getOrNull(var3);
      if (var9 == null) {
         return;
      }
      net.minecraft.network.chat.Component var10 = var9.getPlayerPrefix();
      if (var10 == null) {
         return;
      }
      String var11 = var10.getString();
      if (var11 == null) {
         return;
      }
      String var4 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var11);
      if (var4 == null) {
         return;
      }
      String var5 = new kotlin.text.Regex("§[0-9A-FK-ORa-fk-or]").replace((CharSequence)var4, "");
      if (me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g() != me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
         return;
      }
      if (!var5.startsWith("Heat")) {
         return;
      }
      int var6i;
      try {
         Character var12 = kotlin.text.StringsKt.getOrNull((CharSequence)var5, 6);
         if (var12 == null) {
            return;
         }
         char var13 = var12.charValue();
         Character var14 = kotlin.text.StringsKt.getOrNull((CharSequence)var5, 7);
         char var15 = var14 != null ? var14.charValue() : ' ';
         if (!Character.isDigit(var13)) {
            var6i = 0;
         } else if (!Character.isDigit(var15)) {
            var6i = kotlin.text.CharsKt.digitToInt(var13);
         } else {
            var6i = Integer.parseInt("" + var13 + var15);
         }
      } catch (Exception var16) {
         var6i = 0;
      }
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var6i;
   }

   private final void c(ClientboundSetPlayerTeamPacket var1) { String var13 = null; // PX-FIX hoist
        
      int[] var10000 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      Optional var10001 = var1.getParameters();
      short var10003 = 25992;
      short var10004 = -21174;
      Intrinsics.checkNotNullExpressionValue(var10001, "getParameters(...)");
      Optional var3 = var10001;
      int[] var2 = var10000;
      if (var2 != null) {
         Parameters var7 = (Parameters)OptionalsKt.getOrNull(var3);
         if (var7 != null) {
            Component var8 = var7.getPlayerPrefix();
            if (var8 != null) {
               String var9 = var8.getString();
                var13 = var9;
               if (var2 != null) {
                  if (var9 == null) {
                     return;
                  }

                  var9 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a(var9);
                  var13 = var9;
               }

               if (var13 != null) {
                  String var4 = var9;
                  if (var2 != null) {
                     Parameters var10 = (Parameters)OptionalsKt.getOrNull(var3);
                     if (var10 != null) {
                        Component var11 = var10.getPlayerSuffix();
                        if (var11 != null) {
                           String var12 = var11.getString();
                           String var14 = var12;
                           if (var2 != null) {
                              if (var12 == null) {
                                 return;
                              }

                              var12 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .a(var12);
                              var14 = var12;
                           }

                           if (var2 != null) {
                              if (var14 == null) {
                                 return;
                              }

                              var12 = StringsKt.replace(var12, ",", "", false);
                              var14 = var12;
                           }

                           if (var14 != null) {
                              String var5 = var12;
                              String var6 = var4 + var5;
                              short var10002 = 25987;
                              var10003 = -18131;
                              this.a(var6, "Gemstone: ", IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI::a);
                              var10002 = 26008;
                              var10003 = 4719;
                              this.a(var6, "Mithril: ", IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI::b);
                              var10002 = 25991;
                              var10003 = 27138;
                              this.a(var6, "Glacite: ", IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI::c);
                              return;
                           }
                        }
                     }
                  }

                  return;
               }
            }
         }
      }
   }

   private final void a(String var1, String var2, Function1<? super Double, Unit> var3) {
      int[] var10000 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      short var10003 = 25995;
      short var10004 = -2430;
      Regex var5 = new Regex("(\\d+)");
      int[] var4 = var10000;
      if (StringsKt.contains(var1, var2, false)) {
         MatchResult var9 = (var5).find( var1, 0);
         if (var9 == null) {
            return;
         }

         Object var10 = var9.getGroupValues();
         if (var4 != null) {
            if (var10 == null) {
               return;
            }

            var10 = ((me.octo.client.PXDyn)var10).get(1);
         }

         label38: {
            String var11 = (String)var10;
            if ((String)var10 != null) {
               var10 = StringsKt.toDoubleOrNull(var11);
               if (var4 == null) {
                  break label38;
               }

               if (var10 != null) {
                  var10 = (Number)var10;
                  break label38;
               }
            }

            return;
         }

         double var6 = ((me.octo.client.PXDyn)var10).doubleValue();
         boolean var8 = false;
         var3.invoke(var6);
      }
   }

   public final int A() {
       int var13 = 0; // PX-FIX decl var13
      int[] var1 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      if (var1 != null) {
         ItemStack var10000 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .L();
         if (var10000 != null) {
            ItemStack var2 = var10000;
            List var3 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .d(var2);
            Iterable var4 = var3;
            boolean var5 = false;
            Iterator var6 = var4.iterator();

            while (true) {
               if (var6.hasNext()) {
                  Object var7 = var6.next();
                  Component var8 = (Component)var7;
                  boolean var9 = false;
                  IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var11 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                  String var10001 = var8.getString();
                  short var10003 = 25996;
                  short var10004 = -3243;
                  Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
                  String var10 = var11.a(var10001);
                  if (var1 != null) {
                     CharSequence var12 = var10;
                     short var17 = 26001;
                     short var10002 = -21634;
                     var13 = (int)(StringsKt.contains(var12, "Flowstate", false) ? 1 : 0);
                     if (var1 == null) {
                        break;
                     }

                     if (var13 != 0) {
                        CharSequence var14 = var10;
                        short var18 = 25984;
                        var10002 = -9148;
                        int var15 = ((StringsKt.contains(var14, "III", false)) ? 1 : 0);
                        if (var1 != null) {
                           if (var15 != 0) {
                              return 3;
                           }

                           CharSequence var16 = var10;
                           short var19 = 25999;
                           var10002 = 19586;
                           var15 = ((StringsKt.contains(var16, "II", false)) ? 1 : 0);
                        }

                        if (var1 != null) {
                           var15 = var15 != 0 ? 2 : 1;
                        }

                        return var15;
                     }
                  }

                  if (var1 != null) {
                     continue;
                  }
               }

               var13 = 0;
               break;
            }

            return var13;
         }
      }

      return 0;
   }

   private static final Unit a(double var0) {
      int[] var2 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      double var5;
      int var10000 = (
               var5 = IIIIIlIIIlIIIIlIllllIIIIIIIlllIlllIIIlIlIllllllIIIllIIIllIIIlIllIIIllIlIlIIlIIIllIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a()
                  - 0.0
            )
            == 0.0
         ? 0
         : (var5 < 0.0 ? -1 : 1);
      if (var2 != null) {
         var10000 = (((var10000 == 0) ? 1 : 0));
      }

      if ((var10000 == 0)) {
         double var3 = Math.max(
            var0
               - IIIIIlIIIlIIIIlIllllIIIIIIIlllIlllIIIlIlIllllllIIIllIIIllIIIlIllIIIllIlIlIIlIIIllIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(),
            0.0
         );
         if (var2 != null) {
            if (var3 > 100000.0) {
               return Unit.INSTANCE;
            }

            IIIIIlIIIlIIIIlIllllIIIIIIIlllIlllIIIlIlIllllllIIIllIIIllIIIlIllIIIllIlIlIIlIIIllIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .d(
                  IIIIIlIIIlIIIIlIllllIIIIIIIlllIlllIIIlIlIllllllIIIllIIIllIIIlIllIIIllIlIlIIlIIIllIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .d()
                     + var3
               );
         }

         short var10001 = 26015;
         short var10002 = 2342;
         IlllllllIlIIIlIlIIIlIIllIllIIIlllIlllIIIlIlIlIIIlIlIlIIlIlllIIlIllIlIlIlIlIllIllIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a("gemstonePowder", (long)var3);
      }

      IIIIIlIIIlIIIIlIllllIIIIIIIlllIlllIIIlIlIllllllIIIllIIIllIIIlIllIIIllIlIlIIlIIIllIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var0);
      return Unit.INSTANCE;
   }

   private static final Unit b(double var0) {
      int[] var2 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      double var5;
      int var10000 = (
               var5 = IIIIIlIIIlIIIIlIllllIIIIIIIlllIlllIIIlIlIllllllIIIllIIIllIIIlIllIIIllIlIlIIlIIIllIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b()
                  - 0.0
            )
            == 0.0
         ? 0
         : (var5 < 0.0 ? -1 : 1);
      if (var2 != null) {
         var10000 = (((var10000 == 0) ? 1 : 0));
      }

      if ((var10000 == 0)) {
         double var3 = Math.max(
            var0
               - IIIIIlIIIlIIIIlIllllIIIIIIIlllIlllIIIlIlIllllllIIIllIIIllIIIlIllIIIllIlIlIIlIIIllIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b(),
            0.0
         );
         if (var2 != null) {
            if (var3 > 100000.0) {
               return Unit.INSTANCE;
            }

            IIIIIlIIIlIIIIlIllllIIIIIIIlllIlllIIIlIlIllllllIIIllIIIllIIIlIllIIIllIlIlIIlIIIllIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .e(
                  IIIIIlIIIlIIIIlIllllIIIIIIIlllIlllIIIlIlIllllllIIIllIIIllIIIlIllIIIllIlIlIIlIIIllIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .e()
                     + var3
               );
         }

         short var10001 = 25990;
         short var10002 = 163;
         IlllllllIlIIIlIlIIIlIIllIllIIIlllIlllIIIlIlIlIIIlIlIlIIlIlllIIlIllIlIlIlIlIllIllIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a("mithrilPowder", (long)var3);
      }

      IIIIIlIIIlIIIIlIllllIIIIIIIlllIlllIIIlIlIllllllIIIllIIIllIIIlIllIIIllIlIlIIlIIIllIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(var0);
      return Unit.INSTANCE;
   }

   private static final Unit c(double var0) {
      int[] var2 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      double var5;
      int var10000 = (
               var5 = IIIIIlIIIlIIIIlIllllIIIIIIIlllIlllIIIlIlIllllllIIIllIIIllIIIlIllIIIllIlIlIIlIIIllIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .c()
                  - 0.0
            )
            == 0.0
         ? 0
         : (var5 < 0.0 ? -1 : 1);
      if (var2 != null) {
         var10000 = (((var10000 == 0) ? 1 : 0));
      }

      if ((var10000 == 0)) {
         double var3 = Math.max(
            var0
               - IIIIIlIIIlIIIIlIllllIIIIIIIlllIlllIIIlIlIllllllIIIllIIIllIIIlIllIIIllIlIlIIlIIIllIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c(),
            0.0
         );
         if (var2 != null) {
            if (var3 > 100000.0) {
               return Unit.INSTANCE;
            }

            IIIIIlIIIlIIIIlIllllIIIIIIIlllIlllIIIlIlIllllllIIIllIIIllIIIlIllIIIllIlIlIIlIIIllIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .f(
                  IIIIIlIIIlIIIIlIllllIIIIIIIlllIlllIIIlIlIllllllIIIllIIIllIIIlIllIIIllIlIlIIlIIIllIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .f()
                     + var3
               );
         }

         short var10001 = 26002;
         short var10002 = -27006;
         IlllllllIlIIIlIlIIIlIIllIllIIIlllIlllIIIlIlIlIIIlIlIlIIlIlllIIlIllIlIlIlIlIllIllIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a("glacitePowder", (long)var3);
      }

      IIIIIlIIIlIIIIlIllllIIIIIIIlllIlllIIIlIlIllllllIIIllIIIllIIIlIllIIIllIlIlIIlIIIllIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .c(var0);
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[28];
      int var3 = 0;
      String var2 = "OÒJ\u0095¦ee mìWa¯¥\u001b^ú_\u0004\u0093åi\f\u0005a^ÜKR\u00050\u0088\u0013»×\u000eT\u0080)Üß/õjt\u009a}$\u0095Û\u0014t$±ÏMÏ\u0007\u000bÊ\u009eb}t\u0007xêÔb\u0014l\u0012\u0010?¡(ÛÒÊÖ\u00982éºxÞá1¥²\u0002/\u00ad\u0003õ\u0015Ë!:ØäXõé,D\\ \u001d®-_üQO§\u0080\u0004Xh= Ôô\u001a\u0099êP,\u0091Ò\u0014¹\"\b\u000fz×á\b\u0016þùq\u0007\u0086\u0016Ú\u0019d\u00ad¬\n(Æ\u009b4³\u000b\u007f[\u009fÞ<\u00825h\u008e1N)óñ\u009f#]|\u007fë²&ÛÆÓ\u0004ÙÕ¨[\u0088\u001cÜ:êF\u0005\u009e\u001aØ¸z#:\u0093G¤ï\u009e¥\u008c\u0096Ë\u001f\u008cËanß\u0093\b¤Ì\bª\u000e\u0087ÅSt\u0090:\u001cÈIÎÚ®a\u008a\r\u0098\u0087û\u008a\u0083¢½\u009dÐÂªÐ0\tøC\u008d¼á\u0013\u0080\u007f\u0010\tTmF×4\tK\u0082A3\u0010\u0081:\u001ez\u0085fjþgÞÙZ\u001aY\u001d\u009e}÷4û\u0006\u0098¾\u00005Ù³\u008e¼\u000e>þâ¡\u0085Ôºisú2.î\u001e*Ù±\u0082+Ü\u0004|øÔ¹\u0016\u0010¾\u0015Ç9®\t?¼Éëïb+×~\n\u0082 \u0003RT\u000b\u0010T<3Z*áì§ëS\u0004çK\u0080\u0082'ó«k\u008fÀ6¡Ï HU\u0089taÿ\u001eÊéÕçgq«\u008e Ô±¬\u0017%\u0082Wt=ÒÝâ\f½\u000e,s?\u0082'Ýí\u0081§Ê\u008fËò~\u0005eB\\ÈB\tÿ\u009eB\u0013ÍpX]Ê";
      int var4 = "OÒJ\u0095¦ee mìWa¯¥\u001b^ú_\u0004\u0093åi\f\u0005a^ÜKR\u00050\u0088\u0013»×\u000eT\u0080)Üß/õjt\u009a}$\u0095Û\u0014t$±ÏMÏ\u0007\u000bÊ\u009eb}t\u0007xêÔb\u0014l\u0012\u0010?¡(ÛÒÊÖ\u00982éºxÞá1¥²\u0002/\u00ad\u0003õ\u0015Ë!:ØäXõé,D\\ \u001d®-_üQO§\u0080\u0004Xh= Ôô\u001a\u0099êP,\u0091Ò\u0014¹\"\b\u000fz×á\b\u0016þùq\u0007\u0086\u0016Ú\u0019d\u00ad¬\n(Æ\u009b4³\u000b\u007f[\u009fÞ<\u00825h\u008e1N)óñ\u009f#]|\u007fë²&ÛÆÓ\u0004ÙÕ¨[\u0088\u001cÜ:êF\u0005\u009e\u001aØ¸z#:\u0093G¤ï\u009e¥\u008c\u0096Ë\u001f\u008cËanß\u0093\b¤Ì\bª\u000e\u0087ÅSt\u0090:\u001cÈIÎÚ®a\u008a\r\u0098\u0087û\u008a\u0083¢½\u009dÐÂªÐ0\tøC\u008d¼á\u0013\u0080\u007f\u0010\tTmF×4\tK\u0082A3\u0010\u0081:\u001ez\u0085fjþgÞÙZ\u001aY\u001d\u009e}÷4û\u0006\u0098¾\u00005Ù³\u008e¼\u000e>þâ¡\u0085Ôºisú2.î\u001e*Ù±\u0082+Ü\u0004|øÔ¹\u0016\u0010¾\u0015Ç9®\t?¼Éëïb+×~\n\u0082 \u0003RT\u000b\u0010T<3Z*áì§ëS\u0004çK\u0080\u0082'ó«k\u008fÀ6¡Ï HU\u0089taÿ\u001eÊéÕçgq«\u008e Ô±¬\u0017%\u0082Wt=ÒÝâ\f½\u000e,s?\u0082'Ýí\u0081§Ê\u008fËò~\u0005eB\\ÈB\tÿ\u009eB\u0013ÍpX]Ê"
         .length();
      char var1 = 18;
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
                     case 0 -> 46;
                     case 1 -> 86;
                     case 2 -> 71;
                     case 3 -> 66;
                     case 4 -> 66;
                     case 5 -> 105;
                     default -> 11;
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
                     d = new String[28];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI();
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = 100000;
                     lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
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

                  var2 = "\u001ey2¼QTÑº2a±ã\u0014\b\u0086ûeCRók\u001f";
                  var4 = "\u001ey2¼QTÑº2a±ã\u0014\b\u0086ûeCRók\u001f".length();
                  var1 = '\r';
                  var8 = -1;
            }

            var10000 = 119;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 25992) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 97;
            case 1 -> 64;
            case 2 -> 123;
            case 3 -> 162;
            case 4 -> 17;
            case 5 -> 28;
            case 6 -> 91;
            case 7 -> 7;
            case 8 -> 76;
            case 9 -> 106;
            case 10 -> 103;
            case 11 -> 144;
            case 12 -> 154;
            case 13 -> 242;
            case 14 -> 2;
            case 15 -> 199;
            case 16 -> 129;
            case 17 -> 167;
            case 18 -> 188;
            case 19 -> 120;
            case 20 -> 39;
            case 21 -> 112;
            case 22 -> 125;
            case 23 -> 180;
            case 24 -> 227;
            case 25 -> 165;
            case 26 -> 101;
            case 27 -> 219;
            case 28 -> 108;
            case 29 -> 210;
            case 30 -> 155;
            case 31 -> 48;
            case 32 -> 157;
            case 33 -> 252;
            case 34 -> 186;
            case 35 -> 77;
            case 36 -> 105;
            case 37 -> 184;
            case 38 -> 71;
            case 39 -> 63;
            case 40 -> 45;
            case 41 -> 225;
            case 42 -> 170;
            case 43 -> 69;
            case 44 -> 87;
            case 45 -> 133;
            case 46 -> 12;
            case 47 -> 156;
            case 48 -> 152;
            case 49 -> 236;
            case 50 -> 141;
            case 51 -> 192;
            case 52 -> 3;
            case 53 -> 248;
            case 54 -> 182;
            case 55 -> 13;
            case 56 -> 55;
            case 57 -> 238;
            case 58 -> 14;
            case 59 -> 243;
            case 60 -> 171;
            case 61 -> 173;
            case 62 -> 47;
            case 63 -> 22;
            case 64 -> 10;
            case 65 -> 23;
            case 66 -> 179;
            case 67 -> 100;
            case 68 -> 244;
            case 69 -> 255;
            case 70 -> 250;
            case 71 -> 98;
            case 72 -> 203;
            case 73 -> 237;
            case 74 -> 32;
            case 75 -> 128;
            case 76 -> 213;
            case 77 -> 159;
            case 78 -> 79;
            case 79 -> 25;
            case 80 -> 26;
            case 81 -> 161;
            case 82 -> 24;
            case 83 -> 212;
            case 84 -> 218;
            case 85 -> 102;
            case 86 -> 245;
            case 87 -> 62;
            case 88 -> 239;
            case 89 -> 38;
            case 90 -> 52;
            case 91 -> 151;
            case 92 -> 59;
            case 93 -> 1;
            case 94 -> 164;
            case 95 -> 200;
            case 96 -> 88;
            case 97 -> 231;
            case 98 -> 121;
            case 99 -> 138;
            case 100 -> 193;
            case 101 -> 118;
            case 102 -> 150;
            case 103 -> 241;
            case 104 -> 246;
            case 105 -> 202;
            case 106 -> 223;
            case 107 -> 117;
            case 108 -> 158;
            case 109 -> 143;
            case 110 -> 34;
            case 111 -> 84;
            case 112 -> 214;
            case 113 -> 163;
            case 114 -> 228;
            case 115 -> 92;
            case 116 -> 232;
            case 117 -> 115;
            case 118 -> 109;
            case 119 -> 146;
            case 120 -> 73;
            case 121 -> 196;
            case 122 -> 153;
            case 123 -> 8;
            case 124 -> 178;
            case 125 -> 46;
            case 126 -> 44;
            case 127 -> 251;
            case 128 -> 36;
            case 129 -> 226;
            case 130 -> 61;
            case 131 -> 230;
            case 132 -> 53;
            case 133 -> 187;
            case 134 -> 185;
            case 135 -> 16;
            case 136 -> 29;
            case 137 -> 174;
            case 138 -> 57;
            case 139 -> 0;
            case 140 -> 83;
            case 141 -> 89;
            case 142 -> 68;
            case 143 -> 126;
            case 144 -> 19;
            case 145 -> 204;
            case 146 -> 189;
            case 147 -> 33;
            case 148 -> 27;
            case 149 -> 37;
            case 150 -> 201;
            case 151 -> 41;
            case 152 -> 56;
            case 153 -> 169;
            case 154 -> 221;
            case 155 -> 142;
            case 156 -> 191;
            case 157 -> 9;
            case 158 -> 35;
            case 159 -> 211;
            case 160 -> 136;
            case 161 -> 183;
            case 162 -> 82;
            case 163 -> 43;
            case 164 -> 247;
            case 165 -> 168;
            case 166 -> 31;
            case 167 -> 224;
            case 168 -> 74;
            case 169 -> 149;
            case 170 -> 240;
            case 171 -> 166;
            case 172 -> 215;
            case 173 -> 67;
            case 174 -> 50;
            case 175 -> 86;
            case 176 -> 148;
            case 177 -> 81;
            case 178 -> 5;
            case 179 -> 206;
            case 180 -> 205;
            case 181 -> 220;
            case 182 -> 21;
            case 183 -> 190;
            case 184 -> 113;
            case 185 -> 175;
            case 186 -> 30;
            case 187 -> 66;
            case 188 -> 217;
            case 189 -> 94;
            case 190 -> 160;
            case 191 -> 65;
            case 192 -> 49;
            case 193 -> 140;
            case 194 -> 177;
            case 195 -> 134;
            case 196 -> 147;
            case 197 -> 233;
            case 198 -> 254;
            case 199 -> 127;
            case 200 -> 70;
            case 201 -> 116;
            case 202 -> 229;
            case 203 -> 18;
            case 204 -> 216;
            case 205 -> 145;
            case 206 -> 111;
            case 207 -> 96;
            case 208 -> 234;
            case 209 -> 99;
            case 210 -> 130;
            case 211 -> 11;
            case 212 -> 135;
            case 213 -> 139;
            case 214 -> 107;
            case 215 -> 4;
            case 216 -> 93;
            case 217 -> 15;
            case 218 -> 209;
            case 219 -> 58;
            case 220 -> 253;
            case 221 -> 119;
            case 222 -> 249;
            case 223 -> 60;
            case 224 -> 122;
            case 225 -> 131;
            case 226 -> 20;
            case 227 -> 40;
            case 228 -> 207;
            case 229 -> 181;
            case 230 -> 235;
            case 231 -> 42;
            case 232 -> 54;
            case 233 -> 132;
            case 234 -> 80;
            case 235 -> 95;
            case 236 -> 194;
            case 237 -> 197;
            case 238 -> 75;
            case 239 -> 51;
            case 240 -> 6;
            case 241 -> 222;
            case 242 -> 90;
            case 243 -> 172;
            case 244 -> 176;
            case 245 -> 104;
            case 246 -> 198;
            case 247 -> 78;
            case 248 -> 72;
            case 249 -> 110;
            case 250 -> 124;
            case 251 -> 85;
            case 252 -> 195;
            case 253 -> 208;
            case 254 -> 137;
            default -> 114;
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
