package me.octo.client.utils.player;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.mixin.accessors.InventoryAccessor;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.ChatScreen;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.multiplayer.MultiPlayerGameMode;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.NonNullList;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import net.minecraft.client.gui.screens.inventory.ContainerScreen;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;

public final class IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI
   extends me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   public static me.octo.client.PXDyn IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX missing field v2
   
   @NotNull
   public static IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] c;
   private static String[] d;

   private IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI() {
   }

   @NotNull
   public final String a(@NotNull String var1) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      short var10002 = 7616;
      short var10003 = -2152;
      Intrinsics.checkNotNullParameter(var1, "input");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      if (var2 != null) {
         String var3 = ChatFormatting.stripFormatting(var1);
         if (var3 != null) {
            return var3;
         }
      }

      return var1;
   }

   @Nullable
   public final String g() {
        lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
        try {
            String string;
            block13: {
                Screen screen;
                block12: {
                    Screen screen2 = this.a().screen;
                    screen = screen2;
                    if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray == null) break block12;
                    try {
                        block14: {
                            break block14;
                        }
                        if (!(screen instanceof ContainerScreen)) return null;
                        screen = screen2;
                    }
                    catch (Exception exception) {
                        throw IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a(exception);
                    }
                }
                string = ChatFormatting.stripFormatting((String)((ContainerScreen)screen).getTitle().getString());
                if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray == null) break block13;
                try {
                    block15: {
                        break block15;
                    }
                    string = string;
                    if (string == null) return null;
                    string = ((Object)StringsKt.trim((CharSequence)string)).toString();
                }
                catch (Exception exception) {
                    throw IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a(exception);
                }
            }
            try {
                if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray != null) return string;
                return null;
            }
            catch (Exception exception) {
                throw IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a(exception);
            }
        }
        catch (Exception exception) {
            return null;
        }
   }

   @Nullable
   public final String a(@Nullable Screen param1) {
      try {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
         if (var2 != null && param1 instanceof AbstractContainerScreen) {
            net.minecraft.network.chat.Component var3 = ((AbstractContainerScreen)param1).getTitle();
            Intrinsics.checkNotNullExpressionValue(var3, "getTitle(...)");
            if (var2 != null) {
               return StringsKt.trim((CharSequence)ChatFormatting.stripFormatting(var3.getString())).toString();
            }
         }

         return null;
      } catch (Exception var4) {
         var4.printStackTrace();
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Error retrieving inventory name: " + var4.getMessage());
         return null;
      }
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h ()[Lme/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 2
      // 06: ifnull 18
      // 09: instanceof net/minecraft/client/gui/screens/inventory/AbstractContainerScreen
      // 0c: ifeq 7d
      // 0f: goto 16
      // 12: invokestatic me/octo/client/utils/player/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: nop
      // 17: aload 1
      // 18: checkcast net/minecraft/client/gui/screens/inventory/AbstractContainerScreen
      // 1b: invokevirtual net/minecraft/client/gui/screens/inventory/AbstractContainerScreen.getTitle ()Lnet/minecraft/network/chat/Component;
      // 1e: dup
      // 1f: sipush 7617
      // 22: sipush 16622
      // 25: pop2
      // 26: ldc "getTitle(...)"
      // 28: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 2b: astore 3
      // 2c: aload 2
      // 2d: ifnull 60
      // 30: aload 3
      // 31: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 36: invokestatic net/minecraft/ChatFormatting.stripFormatting (Ljava/lang/String;)Ljava/lang/String;
      // 39: dup
      // 3a: ifnull 58
      // 3d: goto 44
      // 40: invokestatic me/octo/client/utils/player/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: checkcast java/lang/CharSequence
      // 47: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
      // 4a: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 4d: aload 2
      // 4e: ifnonnull 61
      // 51: goto 58
      // 54: invokestatic me/octo/client/utils/player/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 57: athrow
      // 58: pop
      // 59: goto 60
      // 5c: invokestatic me/octo/client/utils/player/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5f: athrow
      // 60: aconst_null
      // 61: areturn
      // 62: astore 3
      // 63: aload 3
      // 64: invokevirtual java/lang/Exception.printStackTrace ()V
      // 67: aload 3
      // 68: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 6b: sipush 7622
      // 6e: sipush 17235
      // 71: pop2
      // 72: ldc "Error retrieving inventory name: "
      // 74: swap
      // 75: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 7a: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 7d: aconst_null
      // 7e: areturn
   }

   public final void a(int var1, int var2, int var3) {
      Object IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var4 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      if (var4 != null) {
         LocalPlayer var10000 = this.a().player;
         if (var10000 != null) {
            LocalPlayer var5 = var10000;
            boolean var6 = false;
            if (var4 != null) {
               MultiPlayerGameMode var7 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().gameMode;
               if (var7 != null) {
                  var7.handleContainerInput(
                     var5.containerMenu.containerId,
                     var1,
                     var2,
                     (ContainerInput)(Object) // PX-FIX switchmap-conflict
IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        [var3],
                     var5
                  );
               }
            }
         }
      }
   }

   public final int h() {
      Object var16 = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      LocalPlayer var2 = this.a().player;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var10000;
      LocalPlayer var13 = var2;
      if (var1 != null) {
         if (var2 == null) {
            return 0;
         }

         var13 = var2;
      }

      NonNullList var6;
      LocalPlayer var3 = var13;
      boolean var4 = false;
      Inventory var14 = var3.getInventory();
      short var10002 = 7619;
      short var10003 = -18059;
      Intrinsics.checkNotNull(var14, "null cannot be cast to non-null type me.octo.client.mixin.accessors.InventoryAccessor");
      InventoryAccessor var5 = (InventoryAccessor)var14;
      NonNullList var15 = var5.getItems();
      var10002 = 7620;
      var10003 = 28417;
      Intrinsics.checkNotNullExpressionValue(var15, "getItems(...)");
      var6 = var15;
      boolean var7 = false;
      var16 = var6 instanceof Collection;
      label56:
      if (var1 != null) {
         if (!((Boolean)var16)) {
            var16 = var6.isEmpty();
            if (var1 == null) {
               break label56;
            }

            if (!((Boolean)var16)) {
               return 0;
            }
         }

         var16 = 0;
      }

      int var8 =((Integer)( var16));

      for (Object var10 : var6) {
         ItemStack var11 = (ItemStack)var10;
         boolean var12 = false;
         int var17 = ((var11.isEmpty()) ? 1 : 0);
         if (var1 == null) {
            return var17;
         }

         label63: {
            if (var1 != null) {
               if (var17 == 0) {
                  continue;
               }

               var8++;
               if (var1 == null) {
                  break label63;
               }

               var17 = var8;
            }

            if (var17 >= 0) {
               continue;
            }

            CollectionsKt.throwCountOverflow();
         }

         if (var1 == null) {
            break;
         }
      }

      return var8;
   }

   @NotNull
   public final List<Slot> i() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1;
      AbstractContainerScreen var20;
      label64: {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
         Screen var4 = this.a().screen;
         var1 = var10000;
         Screen var19 = var4;
         if (var1 != null) {
            if (!(var4 instanceof AbstractContainerScreen)) {
               var20 = null;
               break label64;
            }

            var19 = var4;
         }

         var20 = (AbstractContainerScreen)var19;
      }

      if (var20 == null) {
         return CollectionsKt.emptyList();
      } else {
         AbstractContainerScreen var2 = var20;
         NonNullList var21 = var2.getMenu().slots;
         short var10002 = 7621;
         short var10003 = 6907;
         Intrinsics.checkNotNullExpressionValue(var21, "slots");
         Iterable var3 = var21;
         boolean var13 = false;
         Iterable var5 = var3;
         var var6 = new ArrayList();
         boolean var7 = false;
         Iterator var8 = var3.iterator();

         while (true) {
            if (var8.hasNext()) {
               Object var9 = var8.next();
               Slot var10 = (Slot)var9;
               boolean var11 = false;
               boolean var22 = var10.container instanceof Inventory;
               if (var1 == null) {
                  break;
               }

               if (var1 != null) {
                  var22 = !var22;
               }

               if (!var22) {
                  continue;
               }

               var6.add(var9);
               if (var1 != null) {
                  continue;
               }
            }

            var3 = var6;
            var13 = false;
            var5 = var3;
            var6 = new ArrayList();
            boolean var23 = false;
            break;
         }

         for (Object var16 : var5) {
            Slot var17 = (Slot)var16;
            boolean var18 = false;
            boolean var24 = var17.getItem().isEmpty();
            if (var1 != null) {
               var24 = !var24;
            }

            if (var24) {
               var6.add(var16);
               if (var1 == null) {
                  break;
               }
            }
         }

         return var6;
      }
   }

   @JvmStatic
   public static final boolean j() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var0 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      Screen var10000 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().screen;
      if (var0 != null) {
         if (var10000 == null) {
            return false;
         }

         var10000 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().screen;
      }

      return var0 == null ? var10000 instanceof ChatScreen : !(var10000 instanceof ChatScreen);
   }

   @NotNull
   public final List<ItemStack> k() {
      ArrayList var7 = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      if (var1 != null) {
         LocalPlayer var10000 = this.a().player;
         if (var10000 != null) {
            LocalPlayer var2 = var10000;
            Inventory var6 = var2.getInventory();
            short var10002 = 7623;
            short var10003 = -24584;
            Intrinsics.checkNotNullExpressionValue(var6, "getInventory(...)");
            Inventory var3 = var6;
            ArrayList var4 = new ArrayList();
            int var5 = 0;

            while (true) {
               if (var5 < 9) {
                  var7 = var4;
                  if (var1 == null) {
                     break;
                  }

                  var4.add(var3.getItem(var5));
                  var5++;
                  if (var1 != null) {
                     continue;
                  }
               }

               var7 = ((ArrayList)(Object)(CollectionsKt.toList(var4)));
               break;
            }

            return (List<ItemStack>)var7;
         }
      }

      return CollectionsKt.emptyList();
   }

   public final int a(@NotNull String... var1) {
      boolean var20 = false; // PX-FIX
      Object var19 = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      short var10002 = 7618;
      short var10003 = -16455;
      Intrinsics.checkNotNullParameter(var1, "items");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      if (var2 != null) {
         LocalPlayer var15 = this.a().player;
         if (var15 != null) {
            LocalPlayer var3 = var15;
            boolean var4 = false;
            int var5 = 0;

            while (var5 < 9) {
               ItemStack var16 = var3.getInventory().getItem(var5);
               var10002 = 7631;
               var10003 = -30783;
               Intrinsics.checkNotNullExpressionValue(var16, "getItem(...)");
               ItemStack var6 = var16;
               if (var2 != null) {
                  byte var17 = ((byte)((var6.isEmpty()) ? 1 : 0));
                  if (var2 == null) {
                     return var17;
                  }

                  if (var17 == 0) {
                     var10000 = ((lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[])(Object)(ChatFormatting.stripFormatting(var6.getHoverName().getString())));

                     label74: {
                        label73:
                        while (true) {
                           if (var10000 == null) {
                              var10000 = ((lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[])(Object)(""));
                           }

                           Object var7 = var10000;
                           String[] var8 = var1;
                           boolean var9 = false;
                           int var10 = 0;
                           int var11 = var1.length;

                           while (true) {
                              if (var10 >= var11) {
                                 break label73;
                              }

                              String var12 = var8[var10];
                              boolean var14 = false;
                              var10000 = ((lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[])(Object)(var12));
                              if (var2 == null) {
                                 break;
                              }

                              label68: {
                                 label96: {
                                    if (var2 != null) {
                                       if (var12 == null) {
                                          break label96;
                                       }

                                    }

                                    var19 = StringsKt.contains((CharSequence)var7, (CharSequence)var12, true);
                                    if (var2 == null) {
                                       break label68;
                                    }

                                    if (((Boolean)(var19))) {
                                       var19 = true;
                                       break label68;
                                    }
                                 }

                                 var19 = false;
                              }

                              if (((Boolean)(var19))) {
                                 var20 = true;
                                 break label74;
                              }

                              var10++;
                              if (var2 == null) {
                                 break label73;
                              }
                           }
                        }

                        var20 = false;
                     }

                     if (var20) {
                        return var5;
                     }
                  }

                  var5++;
               }

               if (var2 == null) {
                  break;
               }
            }
         }
      }

      return -1;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[9];
      int var3 = 0;
      String var2 = "f\u0086\u0015SL\u0096\u00adû´\u0095\u001d3]üWæ\u000e!µù\u000foÕ¥\u0016\n6ÜV¸\u0012Uk5ÈG)0\u0001/!\u000f¯`\u0003ÖÚ¨Uì9\u0005Óä.\nN\rß¤\"\u0017°\rcä8\u0089\u0007\u008eÈUç³\u0015Â\u00190\u0084\u0098\u000fù5çÔ_ký\u000eÀ\u0082Ï<MáctÛËT{ùþý0\bnÍ/;§ó¸\u0014\u001e^1)Û©\u001dà¢·À\u000eJ\u000e¯\u0017\u0011iv\u00adPðÄWj\u0082ó7\u0097\u009c\u0002-öÇÇzqcGj¸Ý\u0087\u0005|`\u0088\u0098Ñ\r}&vZ'\u000b.\u0001°á\u0016\u0083ê";
      int var4 = "f\u0086\u0015SL\u0096\u00adû´\u0095\u001d3]üWæ\u000e!µù\u000foÕ¥\u0016\n6ÜV¸\u0012Uk5ÈG)0\u0001/!\u000f¯`\u0003ÖÚ¨Uì9\u0005Óä.\nN\rß¤\"\u0017°\rcä8\u0089\u0007\u008eÈUç³\u0015Â\u00190\u0084\u0098\u000fù5çÔ_ký\u000eÀ\u0082Ï<MáctÛËT{ùþý0\bnÍ/;§ó¸\u0014\u001e^1)Û©\u001dà¢·À\u000eJ\u000e¯\u0017\u0011iv\u00adPðÄWj\u0082ó7\u0097\u009c\u0002-öÇÇzqcGj¸Ý\u0087\u0005|`\u0088\u0098Ñ\r}&vZ'\u000b.\u0001°á\u0016\u0083ê"
         .length();
      char var1 = 17;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 20;
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
                     case 0 -> 38;
                     case 1 -> 45;
                     case 2 -> 116;
                     case 3 -> 48;
                     case 4 -> 98;
                     case 5 -> 122;
                     default -> 56;
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
                     d = new String[9];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI();
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

                  var2 = "}®\u0017ª8\fF\u0001»\t)dú8§\u0088\u0098\u0003";
                  var4 = "}®\u0017ª8\fF\u0001»\t)dú8§\u0088\u0098\u0003".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 114;
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
      int var2 = (var0 ^ 7623) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 166;
            case 1 -> 38;
            case 2 -> 93;
            case 3 -> 180;
            case 4 -> 74;
            case 5 -> 37;
            case 6 -> 234;
            case 7 -> 47;
            case 8 -> 10;
            case 9 -> 56;
            case 10 -> 150;
            case 11 -> 128;
            case 12 -> 165;
            case 13 -> 71;
            case 14 -> 206;
            case 15 -> 126;
            case 16 -> 36;
            case 17 -> 236;
            case 18 -> 76;
            case 19 -> 141;
            case 20 -> 224;
            case 21 -> 133;
            case 22 -> 218;
            case 23 -> 210;
            case 24 -> 83;
            case 25 -> 239;
            case 26 -> 214;
            case 27 -> 209;
            case 28 -> 110;
            case 29 -> 151;
            case 30 -> 254;
            case 31 -> 238;
            case 32 -> 104;
            case 33 -> 124;
            case 34 -> 123;
            case 35 -> 50;
            case 36 -> 101;
            case 37 -> 25;
            case 38 -> 149;
            case 39 -> 199;
            case 40 -> 49;
            case 41 -> 88;
            case 42 -> 86;
            case 43 -> 96;
            case 44 -> 158;
            case 45 -> 194;
            case 46 -> 130;
            case 47 -> 247;
            case 48 -> 95;
            case 49 -> 79;
            case 50 -> 99;
            case 51 -> 173;
            case 52 -> 215;
            case 53 -> 164;
            case 54 -> 14;
            case 55 -> 243;
            case 56 -> 227;
            case 57 -> 221;
            case 58 -> 200;
            case 59 -> 17;
            case 60 -> 45;
            case 61 -> 60;
            case 62 -> 163;
            case 63 -> 33;
            case 64 -> 169;
            case 65 -> 160;
            case 66 -> 153;
            case 67 -> 176;
            case 68 -> 229;
            case 69 -> 184;
            case 70 -> 205;
            case 71 -> 81;
            case 72 -> 26;
            case 73 -> 77;
            case 74 -> 1;
            case 75 -> 121;
            case 76 -> 228;
            case 77 -> 136;
            case 78 -> 146;
            case 79 -> 198;
            case 80 -> 189;
            case 81 -> 191;
            case 82 -> 179;
            case 83 -> 62;
            case 84 -> 197;
            case 85 -> 183;
            case 86 -> 175;
            case 87 -> 106;
            case 88 -> 187;
            case 89 -> 91;
            case 90 -> 201;
            case 91 -> 70;
            case 92 -> 22;
            case 93 -> 72;
            case 94 -> 237;
            case 95 -> 213;
            case 96 -> 111;
            case 97 -> 54;
            case 98 -> 55;
            case 99 -> 255;
            case 100 -> 167;
            case 101 -> 246;
            case 102 -> 159;
            case 103 -> 67;
            case 104 -> 219;
            case 105 -> 32;
            case 106 -> 23;
            case 107 -> 226;
            case 108 -> 16;
            case 109 -> 11;
            case 110 -> 207;
            case 111 -> 102;
            case 112 -> 98;
            case 113 -> 220;
            case 114 -> 0;
            case 115 -> 252;
            case 116 -> 162;
            case 117 -> 53;
            case 118 -> 4;
            case 119 -> 233;
            case 120 -> 115;
            case 121 -> 58;
            case 122 -> 9;
            case 123 -> 6;
            case 124 -> 185;
            case 125 -> 172;
            case 126 -> 64;
            case 127 -> 7;
            case 128 -> 84;
            case 129 -> 235;
            case 130 -> 51;
            case 131 -> 182;
            case 132 -> 222;
            case 133 -> 212;
            case 134 -> 132;
            case 135 -> 145;
            case 136 -> 78;
            case 137 -> 120;
            case 138 -> 34;
            case 139 -> 61;
            case 140 -> 155;
            case 141 -> 156;
            case 142 -> 27;
            case 143 -> 248;
            case 144 -> 13;
            case 145 -> 82;
            case 146 -> 28;
            case 147 -> 29;
            case 148 -> 181;
            case 149 -> 143;
            case 150 -> 24;
            case 151 -> 195;
            case 152 -> 59;
            case 153 -> 100;
            case 154 -> 217;
            case 155 -> 118;
            case 156 -> 5;
            case 157 -> 231;
            case 158 -> 109;
            case 159 -> 230;
            case 160 -> 21;
            case 161 -> 2;
            case 162 -> 19;
            case 163 -> 203;
            case 164 -> 103;
            case 165 -> 174;
            case 166 -> 154;
            case 167 -> 125;
            case 168 -> 39;
            case 169 -> 94;
            case 170 -> 35;
            case 171 -> 116;
            case 172 -> 204;
            case 173 -> 148;
            case 174 -> 192;
            case 175 -> 85;
            case 176 -> 8;
            case 177 -> 244;
            case 178 -> 112;
            case 179 -> 170;
            case 180 -> 142;
            case 181 -> 245;
            case 182 -> 249;
            case 183 -> 89;
            case 184 -> 208;
            case 185 -> 43;
            case 186 -> 117;
            case 187 -> 41;
            case 188 -> 30;
            case 189 -> 122;
            case 190 -> 135;
            case 191 -> 127;
            case 192 -> 68;
            case 193 -> 147;
            case 194 -> 87;
            case 195 -> 75;
            case 196 -> 3;
            case 197 -> 80;
            case 198 -> 140;
            case 199 -> 177;
            case 200 -> 242;
            case 201 -> 108;
            case 202 -> 73;
            case 203 -> 168;
            case 204 -> 92;
            case 205 -> 44;
            case 206 -> 161;
            case 207 -> 171;
            case 208 -> 251;
            case 209 -> 114;
            case 210 -> 139;
            case 211 -> 31;
            case 212 -> 97;
            case 213 -> 186;
            case 214 -> 18;
            case 215 -> 250;
            case 216 -> 113;
            case 217 -> 46;
            case 218 -> 188;
            case 219 -> 193;
            case 220 -> 12;
            case 221 -> 107;
            case 222 -> 232;
            case 223 -> 69;
            case 224 -> 157;
            case 225 -> 105;
            case 226 -> 144;
            case 227 -> 48;
            case 228 -> 20;
            case 229 -> 240;
            case 230 -> 134;
            case 231 -> 42;
            case 232 -> 15;
            case 233 -> 90;
            case 234 -> 152;
            case 235 -> 40;
            case 236 -> 178;
            case 237 -> 119;
            case 238 -> 57;
            case 239 -> 202;
            case 240 -> 196;
            case 241 -> 137;
            case 242 -> 138;
            case 243 -> 129;
            case 244 -> 190;
            case 245 -> 211;
            case 246 -> 216;
            case 247 -> 65;
            case 248 -> 223;
            case 249 -> 52;
            case 250 -> 131;
            case 251 -> 241;
            case 252 -> 66;
            case 253 -> 253;
            case 254 -> 225;
            default -> 63;
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
