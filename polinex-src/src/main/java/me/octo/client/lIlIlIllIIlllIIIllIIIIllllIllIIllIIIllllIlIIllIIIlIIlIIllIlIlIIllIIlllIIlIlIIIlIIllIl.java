package me.octo.client;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.minecraft.ChatFormatting;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;

public class lIlIlIllIIlllIIIllIIIIllllIllIIllIIIllllIlIIllIIIlIIlIIllIlIlIIllIIlllIIlIlIIIlIIllIl
   extends IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI {
   public static me.octo.client.PXDyn IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX missing field v2
   
   private boolean lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI;
   private static String[] h;
   private static String[] i;

   public lIlIlIllIIlllIIIllIIIIllllIllIIllIIIllllIlIIllIIIlIIlIIllIlIlIIllIIlllIIlIlIIIlIIllIl(
      @NotNull String var1,
      @NotNull String var2,
      @NotNull me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3,
      @NotNull String var4,
      @NotNull List<String> var5,
      @NotNull List<String> var6,
      boolean var7,
      @NotNull IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll... var8
   ) {
      short var10001 = 28273;
      short var10002 = 29886;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = 28283;
      var10002 = 28730;
      Intrinsics.checkNotNullParameter(var2, "description");
      var10001 = 28279;
      var10002 = -14716;
      Intrinsics.checkNotNullParameter(var3, "category");
      var10001 = 28277;
      var10002 = -23692;
      Intrinsics.checkNotNullParameter(var4, "subcategory");
      var10001 = 28282;
      var10002 = 9999;
      Intrinsics.checkNotNullParameter(var5, "instructions");
      var10001 = 28278;
      var10002 = -16290;
      Intrinsics.checkNotNullParameter(var6, "tips");
      var10001 = 28285;
      var10002 = 4251;
      Intrinsics.checkNotNullParameter(var8, "settings");
      super(var1, var2, var3, var4, var5, var6, var7, Arrays.copyOf(var8, var8.length));
   }

   @Override
   public void aM() {
      super.aM();
      this.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = false;
   }

   @Override
   public void aO() {
      super.aO();
   }

   public final boolean a5() {
      Object IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX
      boolean var1 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      int var10000 = me.octo.client.utils.lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll.b();
      if (var1) {
         var10000 = var10000
               >= IIlIllIIlIIIlllIIIIlllllIlIIlIIlIlIIIlllIllIIIlIIllIlIlIIIllIIIIIlIlIlIIIIIIlllIllllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b()
                  .M()
            ? 1
            : 0;
      }

      return (var10000 != 0);
   }

   public final boolean a6() {
      Object IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX
      boolean var1 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      int var10000 = me.octo.client.utils.lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll.d();
      if (var1) {
         var10000 = var10000
               >= IIlIllIIlIIIlllIIIIlllllIlIIlIIlIlIIIlllIllIIIlIIllIlIlIIIllIIIIIlIlIlIIIIIIlllIllllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a()
                  .M()
            ? 1
            : 0;
      }

      return (var10000 != 0);
   }

   public final boolean a7() {
      boolean var1 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.d();
      int var10000 = me.octo.client.utils.lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll.b();
      if (!var1) {
         var10000 = var10000 >= 8 ? 1 : 0;
      }

      return (var10000 != 0);
   }

   public final boolean a8() {
      boolean var1 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.d();
      if (!var1) {
         LocalPlayer var10000 = this.ap().player;
         if (var10000 != null) {
            ItemStack var4 = var10000.getMainHandItem();
            if (var4 != null) {
               ItemStack var2 = var4;
               Item var5 = var2.getItem();
               short var10002 = 28265;
               short var10003 = 19375;
               Intrinsics.checkNotNullExpressionValue(var5, "getItem(...)");
               Item var3 = var5;
               boolean var6 = var3 instanceof HoeItem;
               if (!var1) {
                  if (!var6) {
                     boolean var7 = var3 instanceof AxeItem;
                     if (var1) {
                        return var7;
                     }

                     if (!var7) {
                        return false;
                     }
                  }

                  var6 = true;
               }

               return var6;
            }
         }
      }

      return false;
   }

   public final void a9() {
      Object IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX
      boolean var1 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      if (var1) {
         if (!me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m()) {
            return;
         }

         short var10000 = 28280;
         short var10001 = -3659;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("getting the best hoe");
      }

      if (var1) {
         BlockHitResult var12 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .I();
         if (var12 != null) {
            BlockHitResult var2 = var12;
            if (var1) {
               BlockPos var13 = var2.getBlockPos();
               if (var13 != null) {
                  BlockPos var3 = var13;
                  ClientLevel var14 = this.ap().level;
                  Intrinsics.checkNotNull(var14);
                  Block var15 = var14.getBlockState(var3).getBlock();
                  short var10002 = 28281;
                  short var10003 = -6274;
                  Intrinsics.checkNotNullExpressionValue(var15, "getBlock(...)");
                  Block var4 = var15;
                  Iterable var6 = (Iterable)lIlIlIllIIlllIIIllIIIIllllIllIIllIIIllllIlIIllIIIlIIlIIllIlIlIIllIIlllIIlIlIIIlIIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  boolean var7 = false;
                  Iterator var8 = var6.iterator();

                  label39:
                  while (true) {
                     if (var8.hasNext()) {
                        Object var9 = var8.next();
                        var12 = (BlockHitResult)var9;

                        while (true) {
                           llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var10 = (llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII)(Object)var12;
                           boolean var11 = false;
                           if (!Intrinsics.areEqual(var10.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, var4)) {
                              continue label39;
                           }

                           var12 = (BlockHitResult)var9;
                           if (var1) {
                              break label39;
                           }
                        }
                     }

                     var12 = null;
                     break;
                  }

                  llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var17 = (llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII)(Object)var12;
                  if ((llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII)(Object)var12 == null) {
                     return;
                  }

                  llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var5 = var17;
                  short var18 = 28284;
                  var10002 = 17928;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                     "current crop: " + var5.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
                  );
                  this.a(var5);
                  return;
               }
            }

            return;
         }
      }
   }

   private final void a(llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var1) {
      boolean var10000 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      int var3 = 0;
      boolean var2 = var10000;

      while (var3 < 9) {
         LocalPlayer var7 = this.ap().player;
         Intrinsics.checkNotNull(var7);
         ItemStack var8 = var7.getInventory().getItem(var3);
         short var10002 = 28286;
         short var10003 = 32360;
         Intrinsics.checkNotNullExpressionValue(var8, "getItem(...)");
         ItemStack var4 = var8;
         label26:
         if (var2) {
            if (var4.getItem() != null) {
               String var9 = var4.getHoverName().getString();
               var10002 = 28274;
               var10003 = -6088;
               Intrinsics.checkNotNullExpressionValue(var9, "getString(...)");
               String var5 = var9;
               String var6 = ChatFormatting.stripFormatting(var5);
               if (!var2) {
                  break label26;
               }

               if (var6 != null) {
                  CharSequence var10 = var6;
                  String var10001 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                  var10003 = 28272;
                  short var10004 = -26576;
                  Intrinsics.checkNotNullExpressionValue(var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, "bestHoes");
                  if (StringsKt.contains(var10, var10001, false)) {
                     this.a(var3);
                     if (var2) {
                        break;
                     }
                  }
               }
            }

            var3++;
         }

         if (!var2) {
            break;
         }
      }
   }

   public final boolean a(@NotNull me.octo.client.utils.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var1) {
      boolean var10000 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.d();
      short var10002 = 28276;
      short var10003 = 19401;
      Intrinsics.checkNotNullParameter(var1, "crop");
      boolean var2 = var10000;
      if (!var2) {
         LocalPlayer var7 = this.ap().player;
         if (var7 != null) {
            LocalPlayer var3 = var7;
            int var4 = 0;

            while (var4 < 9) {
               label34: {
                  ItemStack var8 = var3.getInventory().getItem(var4);
                  if (var8 != null) {
                     ItemStack var5 = var8;
                     if (var2) {
                        break label34;
                     }

                     if (!var5.isEmpty()) {
                        String var9 = ChatFormatting.stripFormatting(var5.getHoverName().getString());
                        if (var9 != null) {
                           String var6 = var9;
                           if (var2) {
                              break label34;
                           }

                           if (StringsKt.contains(var6, var1.d(), true)) {
                              this.a(var4);
                              return true;
                           }
                        }
                     }
                  }

                  var4++;
               }

               if (var2) {
                  break;
               }
            }

            return false;
         }
      }

      return false;
   }

   private final void a(int var1) {
      Object IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX
      boolean var2 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      lIlIlIllIIlllIIIllIIIIllllIllIIllIIIllllIlIIllIIIlIIlIIllIlIlIIllIIlllIIlIlIIIlIIllIl var10000 = this;
      if (var2) {
         if (this.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI) {
            return;
         }

         var10000 = this;
      }

      var10000.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = true;
      me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(null);
   }

   private static final Unit a(int var0, lIlIlIllIIlllIIIllIIIIllllIllIIllIIIllllIlIIllIIIlIIlIIllIlIlIIllIIlllIIlIlIIIlIIllIl var1) {
      Object IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX
      short var10001 = 28275;
      short var10002 = 21338;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("changing slot to " + var0);
      short var10000 = 28287;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(50 + (int)(150 * Math.random()));
      var10001 = -23058;
      LocalPlayer var3 = var1.ap().player;
      Intrinsics.checkNotNull(var3);
      var3.getInventory().setSelectedSlot(var0);
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("slot successfully changed xd");
      var1.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = false;
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[17];
      int var3 = 0;
      String var2 = "´JÚ);SÇÁ\u001c£kG¼\u0014\u0085(üSúí^|÷p\u008a½éÔ\"äÊåä¯\u000b\tU\të¸\bysûH¾\f^\u001aO\u007fpss\u0083ËV¸Í\bÊ(\u0083S\u0015í£/\u000eâÙ\u0092yýn \f^d@6£º\u001cñNÿ·«l\u0006±»ïà±t|\nûjU\u008eõ\u009d÷Z\u008bOnj¯\fðóR\u00152´ó5S\u0016Dö\u0004³\u0081\u000bó\bö\u00020\u0016¥D²;\u0011[\"¶¤\nM\u0086È\u0090R±Î°YÚ£2\u000eÅ\u001côòæ\u0006mÐM\"ç±*Ö\u000b»!»wÎ\u0086Ó\u000f\u001f«ó\u0004\u000bó²Ù\b»\u0010¿Á\u009c\u008dH\b";
      int var4 = "´JÚ);SÇÁ\u001c£kG¼\u0014\u0085(üSúí^|÷p\u008a½éÔ\"äÊåä¯\u000b\tU\të¸\bysûH¾\f^\u001aO\u007fpss\u0083ËV¸Í\bÊ(\u0083S\u0015í£/\u000eâÙ\u0092yýn \f^d@6£º\u001cñNÿ·«l\u0006±»ïà±t|\nûjU\u008eõ\u009d÷Z\u008bOnj¯\fðóR\u00152´ó5S\u0016Dö\u0004³\u0081\u000bó\bö\u00020\u0016¥D²;\u0011[\"¶¤\nM\u0086È\u0090R±Î°YÚ£2\u000eÅ\u001côòæ\u0006mÐM\"ç±*Ö\u000b»!»wÎ\u0086Ó\u000f\u001f«ó\u0004\u000bó²Ù\b»\u0010¿Á\u009c\u008dH\b"
         .length();
      char var1 = '\r';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 127;
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
                     case 0 -> 83;
                     case 1 -> 56;
                     case 2 -> 73;
                     case 3 -> 124;
                     case 4 -> 79;
                     case 5 -> 12;
                     default -> 91;
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
                     h = var5;
                     i = new String[17];
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

                  var2 = "/ç®R\f\u0082WnóÇ\u001a?\u0092¸\u0090KT";
                  var4 = "/ç®R\f\u0082WnóÇ\u001a?\u0092¸\u0090KT".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 38;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 28281) & 65535;
      if (i[var2] == null) {
         char[] var3 = h[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 188;
            case 1 -> 0;
            case 2 -> 235;
            case 3 -> 148;
            case 4 -> 78;
            case 5 -> 155;
            case 6 -> 184;
            case 7 -> 123;
            case 8 -> 227;
            case 9 -> 84;
            case 10 -> 171;
            case 11 -> 94;
            case 12 -> 28;
            case 13 -> 7;
            case 14 -> 138;
            case 15 -> 200;
            case 16 -> 21;
            case 17 -> 60;
            case 18 -> 243;
            case 19 -> 111;
            case 20 -> 245;
            case 21 -> 9;
            case 22 -> 89;
            case 23 -> 242;
            case 24 -> 1;
            case 25 -> 233;
            case 26 -> 13;
            case 27 -> 113;
            case 28 -> 35;
            case 29 -> 164;
            case 30 -> 192;
            case 31 -> 88;
            case 32 -> 151;
            case 33 -> 34;
            case 34 -> 20;
            case 35 -> 102;
            case 36 -> 149;
            case 37 -> 249;
            case 38 -> 17;
            case 39 -> 133;
            case 40 -> 109;
            case 41 -> 252;
            case 42 -> 73;
            case 43 -> 5;
            case 44 -> 206;
            case 45 -> 154;
            case 46 -> 183;
            case 47 -> 251;
            case 48 -> 69;
            case 49 -> 131;
            case 50 -> 97;
            case 51 -> 98;
            case 52 -> 8;
            case 53 -> 116;
            case 54 -> 99;
            case 55 -> 145;
            case 56 -> 139;
            case 57 -> 112;
            case 58 -> 103;
            case 59 -> 135;
            case 60 -> 177;
            case 61 -> 39;
            case 62 -> 218;
            case 63 -> 68;
            case 64 -> 236;
            case 65 -> 38;
            case 66 -> 181;
            case 67 -> 162;
            case 68 -> 67;
            case 69 -> 220;
            case 70 -> 211;
            case 71 -> 77;
            case 72 -> 216;
            case 73 -> 213;
            case 74 -> 22;
            case 75 -> 2;
            case 76 -> 215;
            case 77 -> 253;
            case 78 -> 76;
            case 79 -> 81;
            case 80 -> 85;
            case 81 -> 222;
            case 82 -> 146;
            case 83 -> 204;
            case 84 -> 56;
            case 85 -> 178;
            case 86 -> 208;
            case 87 -> 187;
            case 88 -> 254;
            case 89 -> 44;
            case 90 -> 48;
            case 91 -> 18;
            case 92 -> 104;
            case 93 -> 247;
            case 94 -> 142;
            case 95 -> 62;
            case 96 -> 57;
            case 97 -> 172;
            case 98 -> 250;
            case 99 -> 16;
            case 100 -> 43;
            case 101 -> 115;
            case 102 -> 198;
            case 103 -> 4;
            case 104 -> 202;
            case 105 -> 226;
            case 106 -> 201;
            case 107 -> 66;
            case 108 -> 193;
            case 109 -> 180;
            case 110 -> 114;
            case 111 -> 255;
            case 112 -> 74;
            case 113 -> 30;
            case 114 -> 244;
            case 115 -> 33;
            case 116 -> 225;
            case 117 -> 50;
            case 118 -> 86;
            case 119 -> 70;
            case 120 -> 137;
            case 121 -> 29;
            case 122 -> 219;
            case 123 -> 199;
            case 124 -> 159;
            case 125 -> 15;
            case 126 -> 126;
            case 127 -> 166;
            case 128 -> 118;
            case 129 -> 248;
            case 130 -> 55;
            case 131 -> 239;
            case 132 -> 234;
            case 133 -> 156;
            case 134 -> 128;
            case 135 -> 241;
            case 136 -> 175;
            case 137 -> 101;
            case 138 -> 90;
            case 139 -> 207;
            case 140 -> 209;
            case 141 -> 53;
            case 142 -> 96;
            case 143 -> 197;
            case 144 -> 23;
            case 145 -> 106;
            case 146 -> 152;
            case 147 -> 122;
            case 148 -> 52;
            case 149 -> 125;
            case 150 -> 228;
            case 151 -> 144;
            case 152 -> 127;
            case 153 -> 157;
            case 154 -> 169;
            case 155 -> 32;
            case 156 -> 224;
            case 157 -> 214;
            case 158 -> 153;
            case 159 -> 205;
            case 160 -> 26;
            case 161 -> 27;
            case 162 -> 147;
            case 163 -> 83;
            case 164 -> 124;
            case 165 -> 46;
            case 166 -> 49;
            case 167 -> 51;
            case 168 -> 71;
            case 169 -> 231;
            case 170 -> 179;
            case 171 -> 189;
            case 172 -> 223;
            case 173 -> 210;
            case 174 -> 240;
            case 175 -> 238;
            case 176 -> 40;
            case 177 -> 59;
            case 178 -> 132;
            case 179 -> 221;
            case 180 -> 72;
            case 181 -> 194;
            case 182 -> 93;
            case 183 -> 24;
            case 184 -> 25;
            case 185 -> 107;
            case 186 -> 121;
            case 187 -> 161;
            case 188 -> 95;
            case 189 -> 230;
            case 190 -> 158;
            case 191 -> 140;
            case 192 -> 54;
            case 193 -> 168;
            case 194 -> 119;
            case 195 -> 108;
            case 196 -> 150;
            case 197 -> 100;
            case 198 -> 163;
            case 199 -> 174;
            case 200 -> 186;
            case 201 -> 80;
            case 202 -> 19;
            case 203 -> 110;
            case 204 -> 212;
            case 205 -> 143;
            case 206 -> 91;
            case 207 -> 11;
            case 208 -> 37;
            case 209 -> 195;
            case 210 -> 41;
            case 211 -> 61;
            case 212 -> 246;
            case 213 -> 141;
            case 214 -> 75;
            case 215 -> 136;
            case 216 -> 117;
            case 217 -> 160;
            case 218 -> 120;
            case 219 -> 185;
            case 220 -> 173;
            case 221 -> 64;
            case 222 -> 217;
            case 223 -> 167;
            case 224 -> 105;
            case 225 -> 63;
            case 226 -> 229;
            case 227 -> 130;
            case 228 -> 92;
            case 229 -> 58;
            case 230 -> 6;
            case 231 -> 45;
            case 232 -> 42;
            case 233 -> 170;
            case 234 -> 14;
            case 235 -> 65;
            case 236 -> 82;
            case 237 -> 47;
            case 238 -> 191;
            case 239 -> 190;
            case 240 -> 3;
            case 241 -> 10;
            case 242 -> 203;
            case 243 -> 12;
            case 244 -> 176;
            case 245 -> 196;
            case 246 -> 237;
            case 247 -> 31;
            case 248 -> 36;
            case 249 -> 129;
            case 250 -> 79;
            case 251 -> 165;
            case 252 -> 182;
            case 253 -> 232;
            case 254 -> 87;
            default -> 134;
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

         i[var2] = new String(var3).intern();
      }

      return i[var2];
   }

   public lIlIlIllIIlllIIIllIIIIllllIllIIllIIIllllIlIIllIIIlIIlIIllIlIlIIllIIlllIIlIlIIIlIIllIl(String var1, String var2, me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3, String var4, java.util.List var5, java.util.List var6, boolean var7, me.octo.client.IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var8, int var9, kotlin.jvm.internal.DefaultConstructorMarker var10) {
      if ((var9 & 16) != 0) {
         var5 = kotlin.collections.CollectionsKt.emptyList();
      }
      if ((var9 & 32) != 0) {
         var6 = kotlin.collections.CollectionsKt.emptyList();
      }
      if ((var9 & 64) != 0) {
         var7 = false;
      }

      this(var1, var2, var3, var4, var5, var6, var7, var8);
   }

}
