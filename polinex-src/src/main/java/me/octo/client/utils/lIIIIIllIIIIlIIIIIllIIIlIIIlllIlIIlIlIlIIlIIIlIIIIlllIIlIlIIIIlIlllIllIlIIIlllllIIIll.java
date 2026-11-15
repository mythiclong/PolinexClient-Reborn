package me.octo.client.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll {
   public static boolean a(lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll var0, BlockPos var1, boolean var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = false;
      }

      return var0.a(var1, var2);
   }
   // PX-FIX ovld (replaced in place by phaseA TOPd: real Kotlin default-args bridge; jar descriptor (LlIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll;Lnet/minecraft/core/BlockPos;ZILjava/lang/Object;)Z)

   @NotNull
   public static lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Minecraft lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static int IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static ArrayDeque<Long> IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @Nullable
   private static BlockPos lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static long IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private static Regex lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private static Regex lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private static Regex lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private static Regex lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static String[] a;
   private static String[] b;

   private lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll() {
   }

   @NotNull
   public final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI a() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public static final int b() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   public static final void a(int var0) {
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var0;
   }

   public static final int d() {
      return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   public static final void b(int var0) {
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var0;
   }

   public static final int f() {
      return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   public static final long h() {
      return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   public static final void c() {
   }

   public static final void e() {
   }

   public static final void g() {
   }

   public static final void i() {
   }

   public final void j() {
      this.l();
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = System.currentTimeMillis();
      me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .a(this);
   }

   public final void k() {
      this.l();
      me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .b(this);
   }

   public final void l() {
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 0;
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 0;
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = 0;
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.clear();
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = null;
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = System.currentTimeMillis();
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 0L;
   }

   public final void m() {
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = null;
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 0L;
   }

   public final void a(@NotNull BlockPos var1) {
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
      short var10002 = -29666;
      short var10003 = 3663;
      Intrinsics.checkNotNullParameter(var1, "pos");
      String var2 = var10000;
      int var6 = ((Intrinsics.areEqual(var1, lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll)) ? 1 : 0);
      if (var2 != null) {
         if (var6 != 0) {
            return;
         }

         lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var1;
         var6 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      int var3 = var6;
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var3 + 1;
      long var5 = System.currentTimeMillis();
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.addLast(var5);
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var5;
   }

   public final float n() {
      Object var5 = null; // PX-FIX
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
      long var2 = System.currentTimeMillis();
      String var1 = var10000;

      while (true) {
         boolean var4;
         if (!((Collection)IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll).isEmpty()) {
            var4 = true;
            if (var1 != null) {
            }
         } else {
            var4 = false;
         }

         if (var4) {
            long var6;
            var5 = (var6 = var2 - ((Number)IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.first()).longValue() - 5000L)
                  == 0L
               ? 0
               : (var6 < 0L ? -1 : 1);
            if (var1 == null) {
               break;
            }

            if (((Boolean)var5)) {
               IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.removeFirst();
               if (var1 != null) {
                  continue;
               }
            }
         }

         var5 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.size();
         break;
      }

      return ((Float)var5) / 5.0F;
   }

   public final float o() {
      return this.n() * 60.0F;
   }

   public final float p() {
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
      long var2 = System.currentTimeMillis() - IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      String var1 = var10000;
      long var5;
      int var4 = (var5 = var2 - 0L) == 0L ? 0 : (var5 < 0L ? -1 : 1);
      if (var1 != null) {
         if (var4 <= 0) {
            return 0.0F;
         }

         var4 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      return var4 * 60000.0F / (float)var2;
   }

   @NotNull
   public final BlockPos a(int var1, int var2, int var3, float var4) {
      String var5 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
      if (var5 != null && lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.player != null) {
         LocalPlayer var6 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.player;
         double var7 = Math.toRadians(var4);
         double var9 = Math.sin(var7);
         double var11 = Math.cos(var7);
         double var13 = var1 * var11 - var3 * var9;
         double var15 = -var1 * var9 + var3 * var11;
         return new BlockPos(
            var6.blockPosition().getX() + (int)Math.rint(var13), var6.blockPosition().getY() + var2, var6.blockPosition().getZ() + (int)Math.rint(var15)
         );
      } else {
         BlockPos var10000 = BlockPos.ZERO;
         short var10002 = -29668;
         short var10003 = 16770;
         Intrinsics.checkNotNullExpressionValue(BlockPos.ZERO, "ZERO");
         return var10000;
      }
   }

   @NotNull
   public final Block b(@NotNull BlockPos var1) {
      Block var4;
      Block var10001;
      label22: {
         String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
         short var10002 = -29677;
         short var10003 = -28703;
         Intrinsics.checkNotNullParameter(var1, "pos");
         String var2 = var10000;
         if (var2 != null && lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.level != null) {
            BlockState var3 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.level.getBlockState(var1);
            if (var3 != null) {
               var4 = var3.getBlock();
               var10001 = var4;
               if (var2 == null) {
                  break label22;
               }

               if (var4 != null) {
                  return var4;
               }
            }
         }

         var4 = Blocks.AIR;
         var10001 = Blocks.AIR;
      }

      short var5 = -29675;
      short var6 = -15983;
      Intrinsics.checkNotNullExpressionValue(var10001, "AIR");
      return var4;
   }

   public final boolean a(@NotNull Block var1) {
      String var2;
      Object var9;
      var9 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
      short var10002 = -29683;
      short var10003 = 3315;
      Intrinsics.checkNotNullParameter(var1, "block");
      var2 = (String)var9;
      Iterable var3 = (Iterable)llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.g();
      boolean var4 = false;
      var9 = var3;
      label36:
      if (var2 != null) {
         if (var3 instanceof Collection) {
            var9 = (Collection)var3;
            if (var2 == null) {
               break label36;
            }

            if (((me.octo.client.PXDyn)var9).isEmpty()) {
               return false;
            }
         }

         var9 = var3;
      }

      for (Object var6 : (Iterable<?>)(var9)) {
         llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var7 = (llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll)var6;
         boolean var8 = false;
         boolean var10 = var7.a(var1);

         while (var10) {
            var10 = true;
            if (var2 != null) {
               return true;
            }
         }
      }

      return false;
   }

   private final boolean a(BlockState var1, BlockPos var2) {
      String var3 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
      if (var3 != null && lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.level != null) {
         ClientLevel var4 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.level;
         boolean var10000 = var1.isAir();
         if (var3 != null) {
            if (var10000) {
               return true;
            }

            Block var10001 = var1.getBlock();
            short var10003 = -29690;
            short var10004 = -25675;
            Intrinsics.checkNotNullExpressionValue(var10001, "getBlock(...)");
            var10000 = this.a(var10001);
         }

         if (var3 != null) {
            if (var10000) {
               return true;
            }

            var10000 = var1.getFluidState().isEmpty();
         }

         if (var3 != null) {
            if (!var10000) {
               return true;
            }

            var10000 = var1.getCollisionShape(var4, var2).isEmpty();
         }

         return var10000;
      } else {
         return false;
      }
   }

   public final boolean a(@NotNull BlockPos var1, boolean var2) {
       boolean var20 = false; // PX-FIX decl var20
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
      short var10002 = -29677;
      short var10003 = -28703;
      Intrinsics.checkNotNullParameter(var1, "pos");
      String var3 = var10000;
      if (var3 != null && lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.level != null) {
         ClientLevel var4 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.level;
         BlockState var14 = var4.getBlockState(var1);
         var10002 = -29670;
         var10003 = -28003;
         Intrinsics.checkNotNullExpressionValue(var14, "getBlockState(...)");
         BlockState var5 = var14;
         BlockState var15 = var4.getBlockState(var1.above());
         var10002 = -29680;
         var10003 = -5012;
         Intrinsics.checkNotNullExpressionValue(var15, "getBlockState(...)");
         BlockState var6 = var15;
         boolean var16 = this.a(var5, var1);
         if (var3 != null) {
            if (!var16) {
               boolean var21 = var2;
               if (var3 != null) {
                  if (var2) {
                     Block var31 = var5.getBlock();
                     var10003 = -29695;
                     short var46 = -2150;
                     var46 = -29667;
                     short var53 = 12256;
                     var53 = -29693;
                     short var57 = 6433;
                     this.a("isWalkable FAIL at " + var1 + ": feet=" + var31 + " not passable");
                  }

                  var21 = false;
               }

               return var21;
            }

            BlockPos var24 = var1.above();
            short var10004 = -29694;
            short var10005 = 23664;
            Intrinsics.checkNotNullExpressionValue(var24, "above(...)");
            var16 = this.a(var6, var24);
         }

         if (var3 != null) {
            if (var16) {
               BlockPos var17 = var1.below();
               var10002 = -29696;
               var10003 = 21491;
               Intrinsics.checkNotNullExpressionValue(var17, "below(...)");
               BlockPos var7 = var17;
               BlockState var18 = var4.getBlockState(var7);
               var10002 = -29680;
               var10003 = -5012;
               Intrinsics.checkNotNullExpressionValue(var18, "getBlockState(...)");
               BlockState var8 = var18;
               boolean var19 = var8.getCollisionShape(var4, var7).isEmpty();
               if (var3 != null) {
                  var19 = !var19;
               }

               boolean var9;
               var9 = var19;
               var20 = var9;
               label69:
               if (var3 != null) {
                  if (!var9) {
                     var20 = var2;
                     if (var3 == null) {
                        break label69;
                     }

                     if (var2) {
                        Block var28 = var8.getBlock();
                        var10003 = -29672;
                        short var43 = -14179;
                        var43 = -29688;
                        short var50 = -16203;
                        var50 = -29686;
                        short var55 = 17985;
                        this.a("isWalkable FAIL at " + var1 + ": floor=" + var28 + " no collision");
                     }
                  }

                  var20 = var9;
               }

               if (var3 != null) {
                  if (var20) {
                     if (var3 == null) {
                        return var2;
                     }

                     if (var2) {
                        Block var29 = var5.getBlock();
                        Block var38 = var6.getBlock();
                        Block var10 = var8.getBlock();
                        Block var11 = var38;
                        Block var12 = var29;
                        short var10001 = -29689;
                        var10002 = -18766;
                        var10003 = -29679;
                        short var45 = 3466;
                        short var52 = -29674;
                        short var56 = -18788;
                        short var10007 = -29681;
                        short var10008 = 28267;
                        this.a("isWalkable OK at " + var1 + ": feet=" + var12 + " head=" + var11 + " floor=" + var10);
                     }
                  }

                  var20 = var9;
               }

               return var20;
            }

            var16 = var2;
         }

         if (var3 != null) {
            if (var16) {
               Block var25 = var6.getBlock();
               var10003 = -29672;
               short var41 = -14179;
               var41 = -29691;
               short var48 = 7635;
               var48 = -29669;
               short var10006 = 24411;
               this.a("isWalkable FAIL at " + var1 + ": head=" + var25 + " not passable");
            }

            var16 = false;
         }

         return var16;
      } else {
         return false;
      }
   }

   private final void a(String var1) {
      short var10001 = -29692;
      short var10002 = 24845;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§7[dbg] " + var1);
   }

   public final boolean a(float var1) {
      return a(this, this.a(0, 0, 1, var1), false, 2, null);
   }

   public final boolean b(float var1) {
      return a(this, this.a(0, 0, -1, var1), false, 2, null);
   }

   public final boolean c(float var1) {
      return a(this, this.a(-1, 0, 0, var1), false, 2, null);
   }

   public final boolean d(float var1) {
      return a(this, this.a(1, 0, 0, var1), false, 2, null);
   }

   public final float e(float var1) {
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
      float var3 = var1 % 360.0F;
      String var2 = var10000;
      float var6;
      int var4 = (var6 = var3 - 180.0F) == 0.0F ? 0 : (var6 < 0.0F ? -1 : 1);
      if (var2 != null) {
         if (var4 > 0) {
            var3 -= 360.0F;
         }

         if (var2 == null) {
            return var3 * -180.0F;
         }

         float var7;
         var4 = (var7 = var3 - -180.0F) == 0.0F ? 0 : (var7 < 0.0F ? -1 : 1);
      }

      if (var4 < 0) {
         var3 += 360.0F;
      }

      return (float)Math.rint(var3 / 90.0F) * 90.0F;
   }

   public final float q() {
      String var1 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
      if (var1 != null && lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.player != null) {
         LocalPlayer var2 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.player;
         return this.e(var2.getYRot());
      } else {
         return 0.0F;
      }
   }

   @Nullable
   public final lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll r() { Float var20 = null; // PX-FIX hoist
        
      Object var39 = null; // PX-FIX
      Object var34 = null; // PX-FIX
      Collection var28 = null; // PX-FIX
      String var1 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
      if (var1 != null && lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.player != null) {
         LocalPlayer var2 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.player;
         int var3 = 0;

         while (var3 < 9) {
            ItemStack var10000 = var2.getInventory().getItem(var3);
            short var10002 = -29673;
            short var10003 = -7938;
            Intrinsics.checkNotNullExpressionValue(var10000, "getItem(...)");
            ItemStack var4 = var10000;
            label145:
            if (var1 != null) {
               if (!var4.isEmpty()) {
                  IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var26 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                  String var10001 = var4.getHoverName().getString();
                  var10003 = -29671;
                  short var10004 = 2918;
                  Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
                  String var5 = var26.a(var10001);
                  if (var1 == null) {
                     break label145;
                  }

                  CharSequence var27 = var5;
                  short var41 = -29682;
                  var10002 = -22889;
                  if (StringsKt.contains(var27, "Squeaky Mousemat", true)) {
                     Iterable var7 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .d(var4);
                     boolean var8 = false;
                     Collection var10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var7, 10));
                     boolean var11 = false;
                     Iterator var12 = var7.iterator();

                     while (true) {
                        if (var12.hasNext()) {
                           Object var13 = var12.next();
                           var28 = var10;
                           Component var14 = (Component)var13;
                           if (var1 == null) {
                              break;
                           }

                           boolean var15 = false;
                           IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var29 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                           var10001 = var14.getString();
                           var10003 = -29684;
                           var10004 = -31540;
                           Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
                           var10.add(var29.a(var10001));
                           if (var1 != null) {
                              continue;
                           }
                        }

                        var28 = var10;
                        break;
                     }

                     List var6 = (List)var28;
                     Iterator var9 = var6.iterator();

                     label124:
                     while (true) {
                        if (!var9.hasNext()) {
                           var10000 = null;
                           break;
                        }

                        var10000 = (ItemStack)var9.next();

                        while (true) {
                           label120: {
                              String var19 = (String)(Object)var10000;
                              var11 = false;
                              if (var1 != null) {
                                 MatchResult var31 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.find(var19, 0);
                                 label116:
                                 if (var31 != null) {
                                    Object var32 = var31.getGroupValues();
                                    if (var1 != null) {
                                       if (var32 == null) {
                                          break label116;
                                       }

                                       var32 = ((me.octo.client.PXDyn)var32).get(1);
                                    }

                                    String var33 = (String)var32;
                                    if ((String)var32 != null) {
                                       var34 = StringsKt.toFloatOrNull(var33);
                                       if (var1 != null) {
                                          break label120;
                                       }
                                    }
                                 }
                              }

                              var34 = null;
                           }

                            var20 =((Float)( var34));
                           if (var20 == null) {
                              break;
                           }

                           var10000 = ((ItemStack)(Object)(var20));
                           if (var1 != null) {
                              break label124;
                           }
                        }
                     }

                     Object var17 = var10000;
                     Iterator var21 = var6.iterator();

                     label99:
                     while (true) {
                        if (!var21.hasNext()) {
                           var10000 = null;
                           break;
                        }

                        var10000 = (ItemStack)var21.next();

                        while (true) {
                           label95: {
                              String var23 = (String)(Object)var10000;
                              boolean var25 = false;
                              if (var1 != null) {
                                 MatchResult var36 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.find(var23, 0);
                                 label91:
                                 if (var36 != null) {
                                    Object var37 = var36.getGroupValues();
                                    if (var1 != null) {
                                       if (var37 == null) {
                                          break label91;
                                       }

                                       var37 = ((me.octo.client.PXDyn)var37).get(1);
                                    }

                                    String var38 = (String)var37;
                                    if ((String)var37 != null) {
                                       var39 = StringsKt.toFloatOrNull(var38);
                                       if (var1 != null) {
                                          break label95;
                                       }
                                    }
                                 }
                              }

                              var39 = null;
                           }

                           Float var24 =((Float)( var39));
                           if (var24 == null) {
                              break;
                           }

                           var10000 = ((ItemStack)(Object)(var24));
                           if (var1 != null) {
                              break label99;
                           }
                        }
                     }

                     Object var18 = var10000;
                     var10000 = (ItemStack)var17;
                     if (var1 != null) {
                        if (var17 != null) {
                           return new lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                              (int)((float)Math.rint(var17 != null ? (Float)var17 : 0.0F)), (int)((float)Math.rint(var18 != null ? (Float)var18 : 0.0F))
                           );
                        }

                        var10000 = (ItemStack)var18;
                     }

                     if (var10000 == null) {
                        return null;
                     }

                     return new lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (int)((float)Math.rint(var17 != null ? (Float)var17 : 0.0F)), (int)((float)Math.rint(var18 != null ? (Float)var18 : 0.0F))
                     );
                  }
               }

               var3++;
            }

            if (var1 == null) {
               break;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl param1) {
      java.lang.String var2 = me.octo.client.utils.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "event");
      if (!me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m()) {
         return;
      }
      if (me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g() != me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll) {
         return;
      }
      if (var2 != null) {
         if (!IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.a((java.lang.Number) java.lang.Integer.valueOf(1000))) {
            return;
         }
      }
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.f();
      java.util.List<java.lang.String> var3 = var2 != null ? me.octo.client.utils.IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d() : (java.util.List<java.lang.String>) null;
      if (var3 == null) {
         var3 = kotlin.collections.CollectionsKt.emptyList();
      }
      int var4 = 0;
      for (java.lang.String var6 : var3) {
         java.lang.String var7 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var6);
         if (var2 != null) {
            if (kotlin.text.StringsKt.contains((java.lang.CharSequence) var7, (java.lang.CharSequence) "The Garden", false)) {
               kotlin.text.MatchResult var8 = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.find((java.lang.CharSequence) var7, 0);
               if (var8 != null) {
                  java.lang.Integer var9 = kotlin.text.StringsKt.toIntOrNull((java.lang.String) var8.getGroupValues().get(1));
                  var4 = var9 != null ? var9.intValue() : 0;
               }
            }
         }
      }
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
      for (java.util.Map.Entry var10 : me.octo.client.utils.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g().entrySet()) {
         java.lang.String var5 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a((java.lang.String) var10.getValue());
         if (var2 != null) {
            kotlin.text.MatchResult var6b = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.find((java.lang.CharSequence) var5, 0);
            if (var6b != null) {
               java.lang.Integer var11 = kotlin.text.StringsKt.toIntOrNull((java.lang.String) var6b.getGroupValues().get(1));
               IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var11 != null ? var11.intValue() : 0;
            }
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[34];
      int var3 = 0;
      String var2 = "\u0006h\u0005v\u000fZÈ\b\bÂÙ×ÂLrÔ\u0011Ýíxûu`w\u009e{H\u0094$Ä[-\u008f\u0018\rãéS\u008cWÍ1¦µ,\u008fë\n\u0013-¤fÒ¶E\u000f:tÜu¿òi\u008dÙÅQ~\nI\u0000»\u009cJ\u0000§õ\u0085¬\rÑÉ¡Ô=)»Þýwúd-\n\u001bB\u0091*~ìqh_\u001f\u0005c8ý¿ý\u000e³çY\\\u000eù\u000b\u009bö(A\u00adÔ.\u0007Ä¯\u0000\n%\u0088B\u0010@]\u0094«\u0083î\u001d\r\f:*\u001dÂ\u008a\u0006Q'ÜC\u000f£]$§ÞÂ¶\bã\u00ad¾¿'\bÛÝ\u0087ìû\u001cí«Âðý(zÂñ \u008cÂ\u009b-Òº\bº\u0085\u009cÂýï\u0016´)o\u0085y{\u0093?~½ùÚonA\u000f\"\u0018³\u0017úI3æÜñ\u0094×¹w}¦¿\u009fKNc´Wº\u0011\u008d>\r5R=óí\f\u0087\u0099Ìq\u008e÷Â\u0003Î¸2\rൃf§\u000b:k\u001afÂ/+²\u009d\f\u0003MO\u0013Ì^WÜ°Hé`\u0006ß\u0097jÌKÐ\u0007Ûb°7rbã\u0012oÃÂÉeew³\u0006Ô¢¿E|¹8\"ÿ\u0003IÎô\u0005N\u0003µ\u008c \u0007\u0093Ö¹¡S°Ç\u0004R¤Ù\f\n4'í\u009b\u0098\u000f\u0097>\u001f\u0091\u0003ü\u0002B\u000e\u0011\u0098\r³\u0084\u0004Z$Üß\u0004S|ñ\u0013\u001f\u0004 Æ~Ç\u0016jWÖ\u0011þ~A\u001cÜ÷ñ8\r¶ÒM· E\bS\u008bÆ4Rô\u0012Õ\u0004\u00951\u008fz*P\u00ad¨×0ë\u008dl\u0006\u00988";
      int var4 = "\u0006h\u0005v\u000fZÈ\b\bÂÙ×ÂLrÔ\u0011Ýíxûu`w\u009e{H\u0094$Ä[-\u008f\u0018\rãéS\u008cWÍ1¦µ,\u008fë\n\u0013-¤fÒ¶E\u000f:tÜu¿òi\u008dÙÅQ~\nI\u0000»\u009cJ\u0000§õ\u0085¬\rÑÉ¡Ô=)»Þýwúd-\n\u001bB\u0091*~ìqh_\u001f\u0005c8ý¿ý\u000e³çY\\\u000eù\u000b\u009bö(A\u00adÔ.\u0007Ä¯\u0000\n%\u0088B\u0010@]\u0094«\u0083î\u001d\r\f:*\u001dÂ\u008a\u0006Q'ÜC\u000f£]$§ÞÂ¶\bã\u00ad¾¿'\bÛÝ\u0087ìû\u001cí«Âðý(zÂñ \u008cÂ\u009b-Òº\bº\u0085\u009cÂýï\u0016´)o\u0085y{\u0093?~½ùÚonA\u000f\"\u0018³\u0017úI3æÜñ\u0094×¹w}¦¿\u009fKNc´Wº\u0011\u008d>\r5R=óí\f\u0087\u0099Ìq\u008e÷Â\u0003Î¸2\rൃf§\u000b:k\u001afÂ/+²\u009d\f\u0003MO\u0013Ì^WÜ°Hé`\u0006ß\u0097jÌKÐ\u0007Ûb°7rbã\u0012oÃÂÉeew³\u0006Ô¢¿E|¹8\"ÿ\u0003IÎô\u0005N\u0003µ\u008c \u0007\u0093Ö¹¡S°Ç\u0004R¤Ù\f\n4'í\u009b\u0098\u000f\u0097>\u001f\u0091\u0003ü\u0002B\u000e\u0011\u0098\r³\u0084\u0004Z$Üß\u0004S|ñ\u0013\u001f\u0004 Æ~Ç\u0016jWÖ\u0011þ~A\u001cÜ÷ñ8\r¶ÒM· E\bS\u008bÆ4Rô\u0012Õ\u0004\u00951\u008fz*P\u00ad¨×0ë\u008dl\u0006\u00988"
         .length();
      char var1 = 7;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 119;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var30 = var10001.toCharArray();
               int var10004 = var30.length;
               int var6 = 0;
               byte var33 = var10000;
               var21 = var30;
               int var15 = var10004;
               byte var43;
               char[] var47;
               int var10006;
               if (var10004 <= 1) {
                  var47 = var30;
                  var43 = var10000;
                  var10006 = var6;
               } else {
                  var33 = var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var47 = var30;
                  var43 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var47[var10006] = (char)(var47[var10006] ^ var43 ^ switch (var6 % 7) {
                     case 0 -> 67;
                     case 1 -> 109;
                     case 2 -> 33;
                     case 3 -> 14;
                     case 4 -> 22;
                     case 5 -> 97;
                     default -> 2;
                  });
                  var6++;
                  if (var33 == 0) {
                     var10006 = var33;
                     var47 = var21;
                     var43 = var33;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var47 = var21;
                     var43 = var33;
                     var10006 = var6;
                  }
               }
            }

            String var35 = new String(var21).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var35;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[34];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll();
                     Minecraft var10 = Minecraft.getInstance();
                     var10002 = -29659;
                     short var36 = -8242;
                     Intrinsics.checkNotNullExpressionValue(var10, "getInstance(...)");
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var10;
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new ArrayDeque();
                     var10002 = -29687;
                     short var37 = 30930;
                     lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new Regex(
                        "(?i)Selected\\s+Yaw:\\s*(-?\\d+(?:\\.\\d+)?)"
                     );
                     var10002 = -29685;
                     short var38 = -12125;
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new Regex(
                        "(?i)Selected\\s+Pitch:\\s*(-?\\d+(?:\\.\\d+)?)"
                     );
                     var10002 = -29676;
                     short var39 = 8729;
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new Regex("ൠ\\s*x\\s*(\\d+)");
                     var10002 = -29660;
                     short var40 = 29816;
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new Regex("Visitors:\\s*\\((\\d+)\\)");
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var35;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "f;\u0080¾L\u009ed:ÏÚf´q¯~à\u0015\u007fj³9×VH®Ø'LÑ\u0092G8Nýl¶ÅÉ";
                  var4 = "f;\u0080¾L\u009ed:ÏÚf´q¯~à\u0015\u007fj³9×VH®Ø'LÑ\u0092G8Nýl¶ÅÉ".length();
                  var1 = 16;
                  var8 = -1;
            }

            var10000 = 116;
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
      int var2 = (var0 ^ -29691) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 39;
            case 1 -> 32;
            case 2 -> 108;
            case 3 -> 254;
            case 4 -> 243;
            case 5 -> 28;
            case 6 -> 137;
            case 7 -> 77;
            case 8 -> 189;
            case 9 -> 94;
            case 10 -> 99;
            case 11 -> 75;
            case 12 -> 125;
            case 13 -> 33;
            case 14 -> 241;
            case 15 -> 213;
            case 16 -> 154;
            case 17 -> 245;
            case 18 -> 129;
            case 19 -> 205;
            case 20 -> 121;
            case 21 -> 237;
            case 22 -> 219;
            case 23 -> 59;
            case 24 -> 60;
            case 25 -> 42;
            case 26 -> 31;
            case 27 -> 207;
            case 28 -> 72;
            case 29 -> 128;
            case 30 -> 194;
            case 31 -> 255;
            case 32 -> 165;
            case 33 -> 61;
            case 34 -> 229;
            case 35 -> 200;
            case 36 -> 232;
            case 37 -> 36;
            case 38 -> 196;
            case 39 -> 17;
            case 40 -> 124;
            case 41 -> 210;
            case 42 -> 65;
            case 43 -> 91;
            case 44 -> 41;
            case 45 -> 46;
            case 46 -> 89;
            case 47 -> 34;
            case 48 -> 97;
            case 49 -> 64;
            case 50 -> 203;
            case 51 -> 141;
            case 52 -> 177;
            case 53 -> 234;
            case 54 -> 249;
            case 55 -> 174;
            case 56 -> 74;
            case 57 -> 88;
            case 58 -> 56;
            case 59 -> 71;
            case 60 -> 114;
            case 61 -> 101;
            case 62 -> 176;
            case 63 -> 35;
            case 64 -> 252;
            case 65 -> 68;
            case 66 -> 244;
            case 67 -> 43;
            case 68 -> 66;
            case 69 -> 175;
            case 70 -> 195;
            case 71 -> 153;
            case 72 -> 90;
            case 73 -> 197;
            case 74 -> 222;
            case 75 -> 184;
            case 76 -> 160;
            case 77 -> 14;
            case 78 -> 109;
            case 79 -> 20;
            case 80 -> 248;
            case 81 -> 152;
            case 82 -> 107;
            case 83 -> 12;
            case 84 -> 187;
            case 85 -> 7;
            case 86 -> 126;
            case 87 -> 190;
            case 88 -> 199;
            case 89 -> 246;
            case 90 -> 132;
            case 91 -> 48;
            case 92 -> 51;
            case 93 -> 230;
            case 94 -> 233;
            case 95 -> 142;
            case 96 -> 139;
            case 97 -> 150;
            case 98 -> 104;
            case 99 -> 62;
            case 100 -> 171;
            case 101 -> 115;
            case 102 -> 70;
            case 103 -> 145;
            case 104 -> 117;
            case 105 -> 78;
            case 106 -> 221;
            case 107 -> 93;
            case 108 -> 37;
            case 109 -> 133;
            case 110 -> 140;
            case 111 -> 148;
            case 112 -> 159;
            case 113 -> 84;
            case 114 -> 168;
            case 115 -> 15;
            case 116 -> 112;
            case 117 -> 240;
            case 118 -> 103;
            case 119 -> 2;
            case 120 -> 85;
            case 121 -> 11;
            case 122 -> 235;
            case 123 -> 52;
            case 124 -> 58;
            case 125 -> 212;
            case 126 -> 224;
            case 127 -> 179;
            case 128 -> 38;
            case 129 -> 217;
            case 130 -> 185;
            case 131 -> 26;
            case 132 -> 204;
            case 133 -> 131;
            case 134 -> 149;
            case 135 -> 236;
            case 136 -> 53;
            case 137 -> 144;
            case 138 -> 40;
            case 139 -> 102;
            case 140 -> 100;
            case 141 -> 86;
            case 142 -> 1;
            case 143 -> 113;
            case 144 -> 95;
            case 145 -> 167;
            case 146 -> 57;
            case 147 -> 3;
            case 148 -> 16;
            case 149 -> 123;
            case 150 -> 158;
            case 151 -> 118;
            case 152 -> 120;
            case 153 -> 96;
            case 154 -> 206;
            case 155 -> 24;
            case 156 -> 215;
            case 157 -> 173;
            case 158 -> 251;
            case 159 -> 82;
            case 160 -> 186;
            case 161 -> 147;
            case 162 -> 242;
            case 163 -> 80;
            case 164 -> 119;
            case 165 -> 183;
            case 166 -> 169;
            case 167 -> 67;
            case 168 -> 192;
            case 169 -> 220;
            case 170 -> 135;
            case 171 -> 253;
            case 172 -> 6;
            case 173 -> 110;
            case 174 -> 143;
            case 175 -> 180;
            case 176 -> 231;
            case 177 -> 29;
            case 178 -> 134;
            case 179 -> 146;
            case 180 -> 218;
            case 181 -> 208;
            case 182 -> 227;
            case 183 -> 47;
            case 184 -> 13;
            case 185 -> 191;
            case 186 -> 105;
            case 187 -> 45;
            case 188 -> 81;
            case 189 -> 226;
            case 190 -> 10;
            case 191 -> 30;
            case 192 -> 250;
            case 193 -> 223;
            case 194 -> 136;
            case 195 -> 98;
            case 196 -> 166;
            case 197 -> 163;
            case 198 -> 9;
            case 199 -> 69;
            case 200 -> 151;
            case 201 -> 201;
            case 202 -> 44;
            case 203 -> 111;
            case 204 -> 116;
            case 205 -> 216;
            case 206 -> 157;
            case 207 -> 76;
            case 208 -> 55;
            case 209 -> 73;
            case 210 -> 0;
            case 211 -> 54;
            case 212 -> 247;
            case 213 -> 228;
            case 214 -> 122;
            case 215 -> 5;
            case 216 -> 25;
            case 217 -> 87;
            case 218 -> 19;
            case 219 -> 162;
            case 220 -> 156;
            case 221 -> 4;
            case 222 -> 193;
            case 223 -> 198;
            case 224 -> 202;
            case 225 -> 23;
            case 226 -> 188;
            case 227 -> 170;
            case 228 -> 238;
            case 229 -> 92;
            case 230 -> 130;
            case 231 -> 172;
            case 232 -> 18;
            case 233 -> 50;
            case 234 -> 8;
            case 235 -> 209;
            case 236 -> 211;
            case 237 -> 127;
            case 238 -> 63;
            case 239 -> 181;
            case 240 -> 155;
            case 241 -> 161;
            case 242 -> 164;
            case 243 -> 79;
            case 244 -> 178;
            case 245 -> 83;
            case 246 -> 138;
            case 247 -> 27;
            case 248 -> 22;
            case 249 -> 225;
            case 250 -> 214;
            case 251 -> 182;
            case 252 -> 239;
            case 253 -> 106;
            case 254 -> 49;
            default -> 21;
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(int var1, int var2) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      }

      public final int a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int c() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int d() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         int var1, int var2
      ) {
         return new lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10002 = -22125;
         short var10003 = -1991;
         var10003 = -22126;
         short var10004 = 472;
         return "MousematValues(yaw="
            + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            + ", pitch="
            + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         return var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         int var10001 = var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var2 != null) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (var2 == null) {
               return (boolean)(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII != 0);
            }

            var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         return !(var4 != var10001);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: {
         String[] var5 = new String[2];
         int var3 = 0;
         String var2 = "\u0018\u0011\u008d°¾·ù5\u0013Ö\u0099\u001c\u001d8U\u0013ï\n1n\u001bÏwéù&Á±";
         int var4 = "\u0018\u0011\u008d°¾·ù5\u0013Ö\u0099\u001c\u001d8U\u0013ï\n1n\u001bÏwéù&Á±".length();
         char var1 = '\b';
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 42;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 42;
                  var10006 = var6;
               } else {
                  var13 = 42;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 42;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 90;
                     case 1 -> 118;
                     case 2 -> 115;
                     case 3 -> 126;
                     case 4 -> 4;
                     case 5 -> 38;
                     default -> 83;
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
               break pxClinit;
            }

            var1 = var2.charAt(var0);
         }
      }
}

      private static String b(int var0, int var1) {
         int var2 = (var0 ^ -22126) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 119;
               case 1 -> 151;
               case 2 -> 251;
               case 3 -> 249;
               case 4 -> 63;
               case 5 -> 198;
               case 6 -> 231;
               case 7 -> 11;
               case 8 -> 227;
               case 9 -> 166;
               case 10 -> 245;
               case 11 -> 24;
               case 12 -> 177;
               case 13 -> 46;
               case 14 -> 182;
               case 15 -> 100;
               case 16 -> 226;
               case 17 -> 31;
               case 18 -> 108;
               case 19 -> 45;
               case 20 -> 112;
               case 21 -> 4;
               case 22 -> 201;
               case 23 -> 190;
               case 24 -> 56;
               case 25 -> 55;
               case 26 -> 93;
               case 27 -> 7;
               case 28 -> 101;
               case 29 -> 228;
               case 30 -> 61;
               case 31 -> 77;
               case 32 -> 129;
               case 33 -> 147;
               case 34 -> 85;
               case 35 -> 53;
               case 36 -> 58;
               case 37 -> 39;
               case 38 -> 115;
               case 39 -> 208;
               case 40 -> 82;
               case 41 -> 229;
               case 42 -> 143;
               case 43 -> 94;
               case 44 -> 220;
               case 45 -> 163;
               case 46 -> 70;
               case 47 -> 81;
               case 48 -> 66;
               case 49 -> 150;
               case 50 -> 84;
               case 51 -> 51;
               case 52 -> 168;
               case 53 -> 68;
               case 54 -> 67;
               case 55 -> 86;
               case 56 -> 188;
               case 57 -> 96;
               case 58 -> 59;
               case 59 -> 189;
               case 60 -> 212;
               case 61 -> 69;
               case 62 -> 126;
               case 63 -> 133;
               case 64 -> 107;
               case 65 -> 41;
               case 66 -> 136;
               case 67 -> 197;
               case 68 -> 171;
               case 69 -> 9;
               case 70 -> 130;
               case 71 -> 246;
               case 72 -> 20;
               case 73 -> 33;
               case 74 -> 193;
               case 75 -> 28;
               case 76 -> 210;
               case 77 -> 254;
               case 78 -> 14;
               case 79 -> 141;
               case 80 -> 73;
               case 81 -> 243;
               case 82 -> 92;
               case 83 -> 238;
               case 84 -> 118;
               case 85 -> 97;
               case 86 -> 47;
               case 87 -> 139;
               case 88 -> 242;
               case 89 -> 74;
               case 90 -> 155;
               case 91 -> 142;
               case 92 -> 149;
               case 93 -> 253;
               case 94 -> 35;
               case 95 -> 103;
               case 96 -> 79;
               case 97 -> 110;
               case 98 -> 80;
               case 99 -> 117;
               case 100 -> 36;
               case 101 -> 234;
               case 102 -> 146;
               case 103 -> 233;
               case 104 -> 148;
               case 105 -> 164;
               case 106 -> 30;
               case 107 -> 99;
               case 108 -> 180;
               case 109 -> 5;
               case 110 -> 170;
               case 111 -> 248;
               case 112 -> 209;
               case 113 -> 222;
               case 114 -> 240;
               case 115 -> 60;
               case 116 -> 12;
               case 117 -> 124;
               case 118 -> 6;
               case 119 -> 184;
               case 120 -> 135;
               case 121 -> 23;
               case 122 -> 202;
               case 123 -> 191;
               case 124 -> 152;
               case 125 -> 10;
               case 126 -> 158;
               case 127 -> 25;
               case 128 -> 162;
               case 129 -> 19;
               case 130 -> 91;
               case 131 -> 50;
               case 132 -> 219;
               case 133 -> 26;
               case 134 -> 90;
               case 135 -> 37;
               case 136 -> 125;
               case 137 -> 44;
               case 138 -> 128;
               case 139 -> 199;
               case 140 -> 225;
               case 141 -> 15;
               case 142 -> 244;
               case 143 -> 123;
               case 144 -> 221;
               case 145 -> 173;
               case 146 -> 196;
               case 147 -> 232;
               case 148 -> 156;
               case 149 -> 62;
               case 150 -> 175;
               case 151 -> 165;
               case 152 -> 120;
               case 153 -> 13;
               case 154 -> 223;
               case 155 -> 134;
               case 156 -> 224;
               case 157 -> 179;
               case 158 -> 239;
               case 159 -> 154;
               case 160 -> 111;
               case 161 -> 102;
               case 162 -> 200;
               case 163 -> 157;
               case 164 -> 104;
               case 165 -> 187;
               case 166 -> 78;
               case 167 -> 105;
               case 168 -> 127;
               case 169 -> 17;
               case 170 -> 122;
               case 171 -> 186;
               case 172 -> 167;
               case 173 -> 106;
               case 174 -> 43;
               case 175 -> 214;
               case 176 -> 2;
               case 177 -> 137;
               case 178 -> 241;
               case 179 -> 88;
               case 180 -> 160;
               case 181 -> 145;
               case 182 -> 38;
               case 183 -> 138;
               case 184 -> 192;
               case 185 -> 181;
               case 186 -> 169;
               case 187 -> 40;
               case 188 -> 114;
               case 189 -> 216;
               case 190 -> 98;
               case 191 -> 27;
               case 192 -> 89;
               case 193 -> 87;
               case 194 -> 116;
               case 195 -> 8;
               case 196 -> 185;
               case 197 -> 72;
               case 198 -> 52;
               case 199 -> 21;
               case 200 -> 121;
               case 201 -> 237;
               case 202 -> 75;
               case 203 -> 176;
               case 204 -> 211;
               case 205 -> 230;
               case 206 -> 29;
               case 207 -> 195;
               case 208 -> 247;
               case 209 -> 174;
               case 210 -> 95;
               case 211 -> 32;
               case 212 -> 76;
               case 213 -> 153;
               case 214 -> 49;
               case 215 -> 65;
               case 216 -> 22;
               case 217 -> 252;
               case 218 -> 18;
               case 219 -> 183;
               case 220 -> 57;
               case 221 -> 159;
               case 222 -> 178;
               case 223 -> 140;
               case 224 -> 113;
               case 225 -> 71;
               case 226 -> 203;
               case 227 -> 16;
               case 228 -> 34;
               case 229 -> 54;
               case 230 -> 0;
               case 231 -> 218;
               case 232 -> 235;
               case 233 -> 250;
               case 234 -> 1;
               case 235 -> 109;
               case 236 -> 64;
               case 237 -> 172;
               case 238 -> 3;
               case 239 -> 42;
               case 240 -> 217;
               case 241 -> 144;
               case 242 -> 132;
               case 243 -> 194;
               case 244 -> 213;
               case 245 -> 83;
               case 246 -> 131;
               case 247 -> 206;
               case 248 -> 48;
               case 249 -> 205;
               case 250 -> 161;
               case 251 -> 255;
               case 252 -> 215;
               case 253 -> 204;
               case 254 -> 236;
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

            b[var2] = new String(var3).intern();
         }

         return b[var2];
      }
      public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll p0, int p1, int p2, int p3, java.lang.Object p4) {
         if ((p3 & 1) != 0) {
            p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         }
         if ((p3 & 2) != 0) {
            p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }
         return p0.a(p1, p2);
      }
   }
}
