package me.octo.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
import me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.core.NonNullList;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.DyedItemColor;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import net.minecraft.world.item.component.CustomData;
import java.nio.file.Files;
import me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
import me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.item.component.ResolvableProfile;
import java.nio.charset.StandardCharsets;
import kotlin.text.StringsKt;
import me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;

public final class IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII {
   @NotNull
   public static IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static Gson IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static File IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static int lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static int IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static int llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private static JsonObject lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static boolean lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private static lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private static lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static String[] a;
   private static String[] b;

   private IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII() {
   }

   @SubscribeEvent
   public final void a(@NotNull IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d ()Z
      // 003: aload 1
      // 004: sipush 4284
      // 007: sipush -25088
      // 00a: pop2
      // 00b: ldc "event"
      // 00d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 010: istore 2
      // 011: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Z
      // 014: iload 2
      // 015: ifne 025
      // 018: ifeq 033
      // 01b: goto 022
      // 01e: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 021: athrow
      // 022: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Z
      // 025: iload 2
      // 026: ifne 04a
      // 029: ifne 034
      // 02c: goto 033
      // 02f: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 032: athrow
      // 033: return
      // 034: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 037: iload 2
      // 038: ifne 0d2
      // 03b: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl [I
      // 03e: swap
      // 03f: invokevirtual me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.ordinal ()I
      // 042: iaload
      // 043: goto 04a
      // 046: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 049: athrow
      // 04a: tableswitch 3841 1 25 114 149 241 314 380 461 472 553 564 863 1190 1259 1270 1406 1417 1737 2064 2153 2225 2592 2818 2907 2979 3367 3743
      // 0bc: sipush 4315
      // 0bf: sipush -5268
      // 0c2: pop2
      // 0c3: ldc "§e[ItemParser] Starting process..."
      // 0c5: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 0c8: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 0cb: goto 0d2
      // 0ce: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d1: athrow
      // 0d2: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 0d5: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0d8: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 0db: iload 2
      // 0dc: ifeq f57
      // 0df: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0e2: bipush 100
      // 0e4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e7: checkcast java/lang/Number
      // 0ea: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 0ed: ifne 0fc
      // 0f0: goto 0f7
      // 0f3: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f6: athrow
      // 0f7: return
      // 0f8: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fb: athrow
      // 0fc: sipush 4251
      // 0ff: sipush 15453
      // 102: pop2
      // 103: ldc "§e[ItemParser] Closing any open GUIs..."
      // 105: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 108: iload 2
      // 109: ifne 127
      // 10c: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 10f: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 112: dup
      // 113: ifnull 12a
      // 116: goto 11d
      // 119: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11c: athrow
      // 11d: invokevirtual net/minecraft/client/player/LocalPlayer.closeContainer ()V
      // 120: goto 127
      // 123: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 126: athrow
      // 127: goto 12b
      // 12a: pop
      // 12b: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 12e: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 131: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 134: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 137: iload 2
      // 138: ifeq f57
      // 13b: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 13e: iload 2
      // 13f: ifne 17d
      // 142: goto 149
      // 145: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 148: athrow
      // 149: sipush 250
      // 14c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 14f: checkcast java/lang/Number
      // 152: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 155: ifne 164
      // 158: goto 15f
      // 15b: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15e: athrow
      // 15f: return
      // 160: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 163: athrow
      // 164: sipush 4258
      // 167: sipush -23386
      // 16a: pop2
      // 16b: ldc "§e[ItemParser] Fetching inventory items..."
      // 16d: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 170: aload 0
      // 171: invokespecial me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.b ()V
      // 174: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 177: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 17a: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 17d: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 180: iload 2
      // 181: ifeq f57
      // 184: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 187: bipush 100
      // 189: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 18c: checkcast java/lang/Number
      // 18f: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 192: ifne 1a1
      // 195: goto 19c
      // 198: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19b: athrow
      // 19c: return
      // 19d: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a0: athrow
      // 1a1: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 1a4: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 1a7: dup
      // 1a8: ifnull 1b5
      // 1ab: invokevirtual net/minecraft/client/player/LocalPlayer.closeContainer ()V
      // 1ae: goto 1b6
      // 1b1: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b4: athrow
      // 1b5: pop
      // 1b6: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 1b9: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 1bc: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 1bf: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 1c2: iload 2
      // 1c3: ifeq f57
      // 1c6: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 1c9: iload 2
      // 1ca: ifne 210
      // 1cd: goto 1d4
      // 1d0: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d3: athrow
      // 1d4: sipush 500
      // 1d7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1da: checkcast java/lang/Number
      // 1dd: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 1e0: ifne 1ef
      // 1e3: goto 1ea
      // 1e6: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e9: athrow
      // 1ea: return
      // 1eb: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ee: athrow
      // 1ef: sipush 4314
      // 1f2: sipush -7095
      // 1f5: pop2
      // 1f6: ldc "§e[ItemParser] Opening storage for enderchest..."
      // 1f8: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 1fb: sipush 4244
      // 1fe: sipush -29922
      // 201: pop2
      // 202: ldc "/storage"
      // 204: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Ljava/lang/Object;)V
      // 207: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 20a: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 20d: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 210: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 213: iload 2
      // 214: ifeq f57
      // 217: iload 2
      // 218: ifeq f57
      // 21b: goto 222
      // 21e: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 221: athrow
      // 222: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 225: sipush 500
      // 228: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 22b: checkcast java/lang/Number
      // 22e: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 231: iload 2
      // 232: ifne 266
      // 235: goto 23c
      // 238: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23b: athrow
      // 23c: ifne 247
      // 23f: goto 246
      // 242: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 245: athrow
      // 246: return
      // 247: sipush 4240
      // 24a: sipush 24371
      // 24d: pop2
      // 24e: ldc "§e[ItemParser] Opening enderchest (slot 9)..."
      // 250: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 253: getstatic me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 256: bipush 9
      // 258: bipush 0
      // 259: getstatic net/minecraft/world/inventory/ContainerInput.PICKUP Lnet/minecraft/world/inventory/ContainerInput;
      // 25c: invokevirtual me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a (IILnet/minecraft/world/inventory/ContainerInput;)V
      // 25f: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 262: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 265: bipush 0
      // 266: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Z
      // 269: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 26c: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 26f: iload 2
      // 270: ifeq f57
      // 273: iload 2
      // 274: ifeq f57
      // 277: goto 27e
      // 27a: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27d: athrow
      // 27e: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 281: sipush 500
      // 284: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 287: checkcast java/lang/Number
      // 28a: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 28d: iload 2
      // 28e: ifne 2a5
      // 291: goto 298
      // 294: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 297: athrow
      // 298: ifeq 2b3
      // 29b: goto 2a2
      // 29e: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a1: athrow
      // 2a2: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Z
      // 2a5: iload 2
      // 2a6: ifne 2b5
      // 2a9: ifeq 2b4
      // 2ac: goto 2b3
      // 2af: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b2: athrow
      // 2b3: return
      // 2b4: bipush 1
      // 2b5: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Z
      // 2b8: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 2bb: getfield net/minecraft/client/Minecraft.screen Lnet/minecraft/client/gui/screens/Screen;
      // 2be: astore 3
      // 2bf: aload 3
      // 2c0: iload 2
      // 2c1: ifne 2d9
      // 2c4: instanceof net/minecraft/client/gui/screens/inventory/AbstractContainerScreen
      // 2c7: ifeq f57
      // 2ca: goto 2d1
      // 2cd: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d0: athrow
      // 2d1: aload 3
      // 2d2: goto 2d9
      // 2d5: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d8: athrow
      // 2d9: checkcast net/minecraft/client/gui/screens/inventory/AbstractContainerScreen
      // 2dc: invokevirtual net/minecraft/client/gui/screens/inventory/AbstractContainerScreen.getTitle ()Lnet/minecraft/network/chat/Component;
      // 2df: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 2e4: dup
      // 2e5: sipush 4269
      // 2e8: sipush 5866
      // 2eb: pop2
      // 2ec: ldc "getString(...)"
      // 2ee: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 2f1: astore 4
      // 2f3: new kotlin/text/Regex
      // 2f6: dup
      // 2f7: sipush 4237
      // 2fa: sipush 24762
      // 2fd: pop2
      // 2fe: ldc "Ender Chest \\((\\d+)/(\\d+)\\)"
      // 300: invokespecial kotlin/text/Regex.<init> (Ljava/lang/String;)V
      // 303: aload 4
      // 305: checkcast java/lang/CharSequence
      // 308: bipush 0
      // 309: bipush 2
      // 30a: aconst_null
      // 30b: invokestatic kotlin/text/Regex.find$default (Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;
      // 30e: astore 5
      // 310: iload 2
      // 311: ifne 35b
      // 314: aload 5
      // 316: dup
      // 317: ifnull 35a
      // 31a: goto 321
      // 31d: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 320: athrow
      // 321: invokeinterface kotlin/text/MatchResult.getGroupValues ()Ljava/util/List; 1
      // 326: iload 2
      // 327: ifne 349
      // 32a: goto 331
      // 32d: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 330: athrow
      // 331: dup
      // 332: ifnull 35a
      // 335: goto 33c
      // 338: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33b: athrow
      // 33c: bipush 1
      // 33d: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 342: goto 349
      // 345: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 348: athrow
      // 349: checkcast java/lang/String
      // 34c: dup
      // 34d: ifnull 35a
      // 350: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 353: goto 35c
      // 356: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 359: athrow
      // 35a: pop
      // 35b: bipush 1
      // 35c: istore 6
      // 35e: aload 3
      // 35f: checkcast net/minecraft/client/gui/screens/inventory/AbstractContainerScreen
      // 362: invokevirtual net/minecraft/client/gui/screens/inventory/AbstractContainerScreen.getMenu ()Lnet/minecraft/world/inventory/AbstractContainerMenu;
      // 365: getfield net/minecraft/world/inventory/AbstractContainerMenu.slots Lnet/minecraft/core/NonNullList;
      // 368: dup
      // 369: sipush 4236
      // 36c: sipush 27288
      // 36f: pop2
      // 370: ldc "slots"
      // 372: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 375: checkcast java/util/List
      // 378: bipush 45
      // 37a: invokestatic kotlin/collections/CollectionsKt.dropLast (Ljava/util/List;I)Ljava/util/List;
      // 37d: astore 7
      // 37f: aload 0
      // 380: aload 7
      // 382: iload 6
      // 384: sipush 4343
      // 387: sipush -6403
      // 38a: pop2
      // 38b: ldc "enderchest_page_"
      // 38d: swap
      // 38e: invokedynamic makeConcatWithConstants (Ljava/lang/String;I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 393: bipush 0
      // 394: bipush 4
      // 395: aconst_null
      // 396: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII;Ljava/util/List;Ljava/lang/String;ZILjava/lang/Object;)V
      // 399: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 39c: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 39f: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 3a2: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 3a5: iload 2
      // 3a6: ifeq f57
      // 3a9: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 3ac: sipush 500
      // 3af: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3b2: checkcast java/lang/Number
      // 3b5: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 3b8: ifne 3c7
      // 3bb: goto 3c2
      // 3be: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c1: athrow
      // 3c2: return
      // 3c3: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c6: athrow
      // 3c7: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 3ca: getfield net/minecraft/client/Minecraft.screen Lnet/minecraft/client/gui/screens/Screen;
      // 3cd: astore 3
      // 3ce: aload 3
      // 3cf: iload 2
      // 3d0: ifne 406
      // 3d3: instanceof net/minecraft/client/gui/screens/inventory/AbstractContainerScreen
      // 3d6: ifeq f57
      // 3d9: goto 3e0
      // 3dc: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3df: athrow
      // 3e0: aload 3
      // 3e1: checkcast net/minecraft/client/gui/screens/inventory/AbstractContainerScreen
      // 3e4: invokevirtual net/minecraft/client/gui/screens/inventory/AbstractContainerScreen.getMenu ()Lnet/minecraft/world/inventory/AbstractContainerMenu;
      // 3e7: getfield net/minecraft/world/inventory/AbstractContainerMenu.slots Lnet/minecraft/core/NonNullList;
      // 3ea: dup
      // 3eb: sipush 4236
      // 3ee: sipush 27288
      // 3f1: pop2
      // 3f2: ldc "slots"
      // 3f4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 3f7: checkcast java/util/List
      // 3fa: bipush 7
      // 3fc: invokestatic kotlin/collections/CollectionsKt.getOrNull (Ljava/util/List;I)Ljava/lang/Object;
      // 3ff: goto 406
      // 402: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 405: athrow
      // 406: checkcast net/minecraft/world/inventory/Slot
      // 409: dup
      // 40a: ifnull 417
      // 40d: invokevirtual net/minecraft/world/inventory/Slot.getItem ()Lnet/minecraft/world/item/ItemStack;
      // 410: goto 419
      // 413: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 416: athrow
      // 417: pop
      // 418: aconst_null
      // 419: astore 4
      // 41b: iload 2
      // 41c: ifne 452
      // 41f: aload 4
      // 421: dup
      // 422: ifnull 44a
      // 425: goto 42c
      // 428: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42b: athrow
      // 42c: invokevirtual net/minecraft/world/item/ItemStack.getHoverName ()Lnet/minecraft/network/chat/Component;
      // 42f: dup
      // 430: ifnull 44a
      // 433: goto 43a
      // 436: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 439: athrow
      // 43a: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 43f: dup
      // 440: ifnonnull 45c
      // 443: goto 44a
      // 446: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 449: athrow
      // 44a: pop
      // 44b: goto 452
      // 44e: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 451: athrow
      // 452: sipush 4233
      // 455: sipush 11233
      // 458: pop2
      // 459: ldc_w "empty"
      // 45c: astore 5
      // 45e: aload 5
      // 460: iload 2
      // 461: ifne 4ba
      // 464: checkcast java/lang/CharSequence
      // 467: sipush 4351
      // 46a: sipush 13200
      // 46d: pop2
      // 46e: ldc_w "Next Page"
      // 471: checkcast java/lang/CharSequence
      // 474: bipush 1
      // 475: invokestatic kotlin/text/StringsKt.contains (Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z
      // 478: ifeq 4a9
      // 47b: goto 482
      // 47e: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 481: athrow
      // 482: getstatic me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 485: bipush 7
      // 487: bipush 0
      // 488: getstatic net/minecraft/world/inventory/ContainerInput.PICKUP Lnet/minecraft/world/inventory/ContainerInput;
      // 48b: invokevirtual me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a (IILnet/minecraft/world/inventory/ContainerInput;)V
      // 48e: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 491: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 494: bipush 0
      // 495: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Z
      // 498: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 49b: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 49e: iload 2
      // 49f: ifeq f57
      // 4a2: goto 4a9
      // 4a5: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a8: athrow
      // 4a9: sipush 4243
      // 4ac: sipush -9995
      // 4af: pop2
      // 4b0: ldc_w "§e[ItemParser] Ender Chest complete"
      // 4b3: goto 4ba
      // 4b6: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b9: athrow
      // 4ba: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 4bd: iload 2
      // 4be: ifne 4dc
      // 4c1: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 4c4: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 4c7: dup
      // 4c8: ifnull 4df
      // 4cb: goto 4d2
      // 4ce: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d1: athrow
      // 4d2: invokevirtual net/minecraft/client/player/LocalPlayer.closeContainer ()V
      // 4d5: goto 4dc
      // 4d8: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4db: athrow
      // 4dc: goto 4e0
      // 4df: pop
      // 4e0: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 4e3: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 4e6: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 4e9: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 4ec: iload 2
      // 4ed: ifeq f57
      // 4f0: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 4f3: iload 2
      // 4f4: ifne 52e
      // 4f7: goto 4fe
      // 4fa: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4fd: athrow
      // 4fe: sipush 500
      // 501: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 504: checkcast java/lang/Number
      // 507: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 50a: ifne 519
      // 50d: goto 514
      // 510: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 513: athrow
      // 514: return
      // 515: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 518: athrow
      // 519: sipush 4239
      // 51c: sipush -29802
      // 51f: pop2
      // 520: ldc "/storage"
      // 522: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Ljava/lang/Object;)V
      // 525: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 528: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 52b: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 52e: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 531: iload 2
      // 532: ifeq f57
      // 535: iload 2
      // 536: ifeq f57
      // 539: goto 540
      // 53c: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53f: athrow
      // 540: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 543: sipush 500
      // 546: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 549: checkcast java/lang/Number
      // 54c: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 54f: iload 2
      // 550: ifne 569
      // 553: goto 55a
      // 556: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 559: athrow
      // 55a: ifne 565
      // 55d: goto 564
      // 560: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 563: athrow
      // 564: return
      // 565: aload 0
      // 566: invokespecial me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a ()I
      // 569: istore 3
      // 56a: iload 2
      // 56b: ifne 5c4
      // 56e: iload 3
      // 56f: bipush -1
      // 570: if_icmpeq 5a4
      // 573: goto 57a
      // 576: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 579: athrow
      // 57a: iload 3
      // 57b: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll I
      // 57e: getstatic me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 581: iload 3
      // 582: bipush 0
      // 583: getstatic net/minecraft/world/inventory/ContainerInput.PICKUP Lnet/minecraft/world/inventory/ContainerInput;
      // 586: invokevirtual me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a (IILnet/minecraft/world/inventory/ContainerInput;)V
      // 589: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 58c: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 58f: bipush 0
      // 590: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Z
      // 593: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 596: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 599: iload 2
      // 59a: ifeq f57
      // 59d: goto 5a4
      // 5a0: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a3: athrow
      // 5a4: sipush 4231
      // 5a7: sipush -24577
      // 5aa: pop2
      // 5ab: ldc_w "§e[ItemParser] No backpacks found, skipping..."
      // 5ae: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 5b1: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 5b4: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 5b7: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 5ba: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 5bd: goto 5c4
      // 5c0: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c3: athrow
      // 5c4: iload 2
      // 5c5: ifeq f57
      // 5c8: iload 2
      // 5c9: ifeq f57
      // 5cc: goto 5d3
      // 5cf: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5d2: athrow
      // 5d3: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 5d6: sipush 500
      // 5d9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5dc: checkcast java/lang/Number
      // 5df: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 5e2: iload 2
      // 5e3: ifne 5fa
      // 5e6: goto 5ed
      // 5e9: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5ec: athrow
      // 5ed: ifeq 608
      // 5f0: goto 5f7
      // 5f3: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5f6: athrow
      // 5f7: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Z
      // 5fa: iload 2
      // 5fb: ifne 60a
      // 5fe: ifeq 609
      // 601: goto 608
      // 604: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 607: athrow
      // 608: return
      // 609: bipush 1
      // 60a: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Z
      // 60d: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 610: getfield net/minecraft/client/Minecraft.screen Lnet/minecraft/client/gui/screens/Screen;
      // 613: astore 3
      // 614: aload 3
      // 615: iload 2
      // 616: ifne 62e
      // 619: instanceof net/minecraft/client/gui/screens/inventory/AbstractContainerScreen
      // 61c: ifeq f57
      // 61f: goto 626
      // 622: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 625: athrow
      // 626: aload 3
      // 627: goto 62e
      // 62a: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 62d: athrow
      // 62e: checkcast net/minecraft/client/gui/screens/inventory/AbstractContainerScreen
      // 631: invokevirtual net/minecraft/client/gui/screens/inventory/AbstractContainerScreen.getTitle ()Lnet/minecraft/network/chat/Component;
      // 634: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 639: dup
      // 63a: sipush 4269
      // 63d: sipush 5866
      // 640: pop2
      // 641: ldc "getString(...)"
      // 643: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 646: astore 5
      // 648: bipush 0
      // 649: istore 6
      // 64b: aload 5
      // 64d: checkcast java/lang/CharSequence
      // 650: astore 7
      // 652: new java/lang/StringBuilder
      // 655: dup
      // 656: invokespecial java/lang/StringBuilder.<init> ()V
      // 659: checkcast java/lang/Appendable
      // 65c: astore 8
      // 65e: bipush 0
      // 65f: istore 9
      // 661: bipush 0
      // 662: istore 10
      // 664: aload 7
      // 666: invokeinterface java/lang/CharSequence.length ()I 1
      // 66b: istore 11
      // 66d: iload 10
      // 66f: iload 11
      // 671: if_icmpge 6bd
      // 674: aload 7
      // 676: iload 10
      // 678: invokeinterface java/lang/CharSequence.charAt (I)C 2
      // 67d: istore 12
      // 67f: iload 12
      // 681: istore 13
      // 683: bipush 0
      // 684: istore 14
      // 686: iload 2
      // 687: ifne f57
      // 68a: iload 2
      // 68b: ifne 6b9
      // 68e: goto 695
      // 691: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 694: athrow
      // 695: iload 13
      // 697: invokestatic java/lang/Character.isDigit (C)Z
      // 69a: nop
      // 69b: ifeq 6b6
      // 69e: goto 6a5
      // 6a1: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a4: athrow
      // 6a5: aload 8
      // 6a7: iload 12
      // 6a9: invokeinterface java/lang/Appendable.append (C)Ljava/lang/Appendable; 2
      // 6ae: pop
      // 6af: goto 6b6
      // 6b2: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6b5: athrow
      // 6b6: iinc 10 1
      // 6b9: iload 2
      // 6ba: ifeq 66d
      // 6bd: aload 8
      // 6bf: checkcast java/lang/StringBuilder
      // 6c2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6c5: astore 4
      // 6c7: aload 3
      // 6c8: checkcast net/minecraft/client/gui/screens/inventory/AbstractContainerScreen
      // 6cb: invokevirtual net/minecraft/client/gui/screens/inventory/AbstractContainerScreen.getMenu ()Lnet/minecraft/world/inventory/AbstractContainerMenu;
      // 6ce: getfield net/minecraft/world/inventory/AbstractContainerMenu.slots Lnet/minecraft/core/NonNullList;
      // 6d1: dup
      // 6d2: sipush 4236
      // 6d5: sipush 27288
      // 6d8: pop2
      // 6d9: ldc "slots"
      // 6db: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 6de: checkcast java/util/List
      // 6e1: bipush 45
      // 6e3: invokestatic kotlin/collections/CollectionsKt.dropLast (Ljava/util/List;I)Ljava/util/List;
      // 6e6: astore 5
      // 6e8: aload 0
      // 6e9: aload 5
      // 6eb: aload 4
      // 6ed: sipush 4254
      // 6f0: sipush -13303
      // 6f3: pop2
      // 6f4: ldc_w "backpack_slot_"
      // 6f7: swap
      // 6f8: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 6fd: bipush 0
      // 6fe: bipush 4
      // 6ff: aconst_null
      // 700: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII;Ljava/util/List;Ljava/lang/String;ZILjava/lang/Object;)V
      // 703: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 706: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 709: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 70c: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 70f: iload 2
      // 710: ifeq f57
      // 713: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 716: sipush 500
      // 719: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 71c: checkcast java/lang/Number
      // 71f: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 722: ifne 731
      // 725: goto 72c
      // 728: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 72b: athrow
      // 72c: return
      // 72d: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 730: athrow
      // 731: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 734: getfield net/minecraft/client/Minecraft.screen Lnet/minecraft/client/gui/screens/Screen;
      // 737: astore 3
      // 738: aload 3
      // 739: iload 2
      // 73a: ifne 770
      // 73d: instanceof net/minecraft/client/gui/screens/inventory/AbstractContainerScreen
      // 740: ifeq f57
      // 743: goto 74a
      // 746: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 749: athrow
      // 74a: aload 3
      // 74b: checkcast net/minecraft/client/gui/screens/inventory/AbstractContainerScreen
      // 74e: invokevirtual net/minecraft/client/gui/screens/inventory/AbstractContainerScreen.getMenu ()Lnet/minecraft/world/inventory/AbstractContainerMenu;
      // 751: getfield net/minecraft/world/inventory/AbstractContainerMenu.slots Lnet/minecraft/core/NonNullList;
      // 754: dup
      // 755: sipush 4236
      // 758: sipush 27288
      // 75b: pop2
      // 75c: ldc "slots"
      // 75e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 761: checkcast java/util/List
      // 764: bipush 7
      // 766: invokestatic kotlin/collections/CollectionsKt.getOrNull (Ljava/util/List;I)Ljava/lang/Object;
      // 769: goto 770
      // 76c: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 76f: athrow
      // 770: checkcast net/minecraft/world/inventory/Slot
      // 773: dup
      // 774: ifnull 781
      // 777: invokevirtual net/minecraft/world/inventory/Slot.getItem ()Lnet/minecraft/world/item/ItemStack;
      // 77a: goto 783
      // 77d: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 780: athrow
      // 781: pop
      // 782: aconst_null
      // 783: astore 4
      // 785: iload 2
      // 786: ifne 7bc
      // 789: aload 4
      // 78b: dup
      // 78c: ifnull 7b4
      // 78f: goto 796
      // 792: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 795: athrow
      // 796: invokevirtual net/minecraft/world/item/ItemStack.getHoverName ()Lnet/minecraft/network/chat/Component;
      // 799: dup
      // 79a: ifnull 7b4
      // 79d: goto 7a4
      // 7a0: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7a3: athrow
      // 7a4: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 7a9: dup
      // 7aa: ifnonnull 7c6
      // 7ad: goto 7b4
      // 7b0: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7b3: athrow
      // 7b4: pop
      // 7b5: goto 7bc
      // 7b8: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7bb: athrow
      // 7bc: sipush 4271
      // 7bf: sipush 20091
      // 7c2: pop2
      // 7c3: ldc_w "empty"
      // 7c6: astore 5
      // 7c8: aload 5
      // 7ca: iload 2
      // 7cb: ifne 824
      // 7ce: checkcast java/lang/CharSequence
      // 7d1: sipush 4262
      // 7d4: sipush -8583
      // 7d7: pop2
      // 7d8: ldc_w "Next Page"
      // 7db: checkcast java/lang/CharSequence
      // 7de: bipush 1
      // 7df: invokestatic kotlin/text/StringsKt.contains (Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z
      // 7e2: ifeq 813
      // 7e5: goto 7ec
      // 7e8: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7eb: athrow
      // 7ec: getstatic me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 7ef: bipush 7
      // 7f1: bipush 0
      // 7f2: getstatic net/minecraft/world/inventory/ContainerInput.PICKUP Lnet/minecraft/world/inventory/ContainerInput;
      // 7f5: invokevirtual me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a (IILnet/minecraft/world/inventory/ContainerInput;)V
      // 7f8: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 7fb: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 7fe: bipush 0
      // 7ff: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Z
      // 802: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 805: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 808: iload 2
      // 809: ifeq f57
      // 80c: goto 813
      // 80f: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 812: athrow
      // 813: sipush 4263
      // 816: sipush -21399
      // 819: pop2
      // 81a: ldc_w "§e[ItemParser] Backpacks complete"
      // 81d: goto 824
      // 820: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 823: athrow
      // 824: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 827: iload 2
      // 828: ifne 846
      // 82b: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 82e: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 831: dup
      // 832: ifnull 849
      // 835: goto 83c
      // 838: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 83b: athrow
      // 83c: invokevirtual net/minecraft/client/player/LocalPlayer.closeContainer ()V
      // 83f: goto 846
      // 842: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 845: athrow
      // 846: goto 84a
      // 849: pop
      // 84a: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 84d: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 850: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 853: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 856: iload 2
      // 857: ifeq f57
      // 85a: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 85d: iload 2
      // 85e: ifne 8ac
      // 861: goto 868
      // 864: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 867: athrow
      // 868: sipush 500
      // 86b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 86e: checkcast java/lang/Number
      // 871: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 874: ifne 883
      // 877: goto 87e
      // 87a: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 87d: athrow
      // 87e: return
      // 87f: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 882: athrow
      // 883: sipush 4235
      // 886: sipush 6521
      // 889: pop2
      // 88a: ldc_w "§e[ItemParser] Opening wardrobe..."
      // 88d: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 890: sipush 4334
      // 893: sipush -15147
      // 896: pop2
      // 897: ldc_w "/wd"
      // 89a: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Ljava/lang/Object;)V
      // 89d: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 8a0: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 8a3: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 8a6: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 8a9: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 8ac: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 8af: iload 2
      // 8b0: ifeq f57
      // 8b3: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 8b6: iload 2
      // 8b7: ifne 8f4
      // 8ba: goto 8c1
      // 8bd: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8c0: athrow
      // 8c1: sipush 3000
      // 8c4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 8c7: checkcast java/lang/Number
      // 8ca: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 8cd: ifeq f57
      // 8d0: goto 8d7
      // 8d3: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8d6: athrow
      // 8d7: sipush 4312
      // 8da: sipush 31647
      // 8dd: pop2
      // 8de: ldc_w "§c[ItemParser] Wardrobe open timeout, retrying..."
      // 8e1: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 8e4: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 8e7: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 8ea: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 8ed: goto 8f4
      // 8f0: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8f3: athrow
      // 8f4: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 8f7: iload 2
      // 8f8: ifeq f57
      // 8fb: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 8fe: sipush 500
      // 901: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 904: checkcast java/lang/Number
      // 907: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 90a: iload 2
      // 90b: ifne 922
      // 90e: goto 915
      // 911: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 914: athrow
      // 915: ifeq 930
      // 918: goto 91f
      // 91b: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 91e: athrow
      // 91f: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Z
      // 922: iload 2
      // 923: ifne 932
      // 926: ifeq 931
      // 929: goto 930
      // 92c: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 92f: athrow
      // 930: return
      // 931: bipush 1
      // 932: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Z
      // 935: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 938: getfield net/minecraft/client/Minecraft.screen Lnet/minecraft/client/gui/screens/Screen;
      // 93b: astore 3
      // 93c: aload 3
      // 93d: instanceof net/minecraft/client/gui/screens/inventory/AbstractContainerScreen
      // 940: iload 2
      // 941: ifne a5d
      // 944: ifeq a42
      // 947: goto 94e
      // 94a: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 94d: athrow
      // 94e: aload 3
      // 94f: checkcast net/minecraft/client/gui/screens/inventory/AbstractContainerScreen
      // 952: invokevirtual net/minecraft/client/gui/screens/inventory/AbstractContainerScreen.getTitle ()Lnet/minecraft/network/chat/Component;
      // 955: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 95a: dup
      // 95b: sipush 4269
      // 95e: sipush 5866
      // 961: pop2
      // 962: ldc "getString(...)"
      // 964: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 967: astore 4
      // 969: new kotlin/text/Regex
      // 96c: dup
      // 96d: sipush 4250
      // 970: sipush -28253
      // 973: pop2
      // 974: ldc_w "Wardrobe \\((\\d+)/(\\d+)\\)"
      // 977: invokespecial kotlin/text/Regex.<init> (Ljava/lang/String;)V
      // 97a: aload 4
      // 97c: checkcast java/lang/CharSequence
      // 97f: bipush 0
      // 980: bipush 2
      // 981: aconst_null
      // 982: invokestatic kotlin/text/Regex.find$default (Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;
      // 985: astore 5
      // 987: iload 2
      // 988: ifne 9d2
      // 98b: aload 5
      // 98d: dup
      // 98e: ifnull 9d1
      // 991: goto 998
      // 994: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 997: athrow
      // 998: invokeinterface kotlin/text/MatchResult.getGroupValues ()Ljava/util/List; 1
      // 99d: iload 2
      // 99e: ifne 9c0
      // 9a1: goto 9a8
      // 9a4: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9a7: athrow
      // 9a8: dup
      // 9a9: ifnull 9d1
      // 9ac: goto 9b3
      // 9af: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9b2: athrow
      // 9b3: bipush 1
      // 9b4: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 9b9: goto 9c0
      // 9bc: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9bf: athrow
      // 9c0: checkcast java/lang/String
      // 9c3: dup
      // 9c4: ifnull 9d1
      // 9c7: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 9ca: goto 9d3
      // 9cd: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9d0: athrow
      // 9d1: pop
      // 9d2: bipush 1
      // 9d3: istore 6
      // 9d5: iload 2
      // 9d6: ifne a20
      // 9d9: aload 5
      // 9db: dup
      // 9dc: ifnull a1f
      // 9df: goto 9e6
      // 9e2: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9e5: athrow
      // 9e6: invokeinterface kotlin/text/MatchResult.getGroupValues ()Ljava/util/List; 1
      // 9eb: iload 2
      // 9ec: ifne a0e
      // 9ef: goto 9f6
      // 9f2: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9f5: athrow
      // 9f6: dup
      // 9f7: ifnull a1f
      // 9fa: goto a01
      // 9fd: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a00: athrow
      // a01: bipush 2
      // a02: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // a07: goto a0e
      // a0a: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a0d: athrow
      // a0e: checkcast java/lang/String
      // a11: dup
      // a12: ifnull a1f
      // a15: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // a18: goto a21
      // a1b: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a1e: athrow
      // a1f: pop
      // a20: bipush 1
      // a21: istore 7
      // a23: iload 6
      // a25: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII I
      // a28: aload 0
      // a29: aload 3
      // a2a: checkcast net/minecraft/client/gui/screens/inventory/AbstractContainerScreen
      // a2d: iload 6
      // a2f: invokespecial me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Lnet/minecraft/client/gui/screens/inventory/AbstractContainerScreen;I)V
      // a32: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // a35: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // a38: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // a3b: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // a3e: iload 2
      // a3f: ifeq f57
      // a42: sipush 4286
      // a45: sipush 5659
      // a48: pop2
      // a49: ldc_w "§c[ItemParser] No screen open for wardrobe"
      // a4c: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // a4f: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // a52: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // a55: bipush 0
      // a56: goto a5d
      // a59: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a5c: athrow
      // a5d: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Z
      // a60: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // a63: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // a66: iload 2
      // a67: ifeq f57
      // a6a: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // a6d: sipush 500
      // a70: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // a73: checkcast java/lang/Number
      // a76: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // a79: ifne a88
      // a7c: goto a83
      // a7f: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a82: athrow
      // a83: return
      // a84: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a87: athrow
      // a88: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // a8b: getfield net/minecraft/client/Minecraft.screen Lnet/minecraft/client/gui/screens/Screen;
      // a8e: astore 3
      // a8f: iload 2
      // a90: ifne b48
      // a93: aload 3
      // a94: instanceof net/minecraft/client/gui/screens/inventory/AbstractContainerScreen
      // a97: ifeq b28
      // a9a: goto aa1
      // a9d: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // aa0: athrow
      // aa1: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII I
      // aa4: iload 2
      // aa5: ifne ad4
      // aa8: goto aaf
      // aab: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // aae: athrow
      // aaf: bipush 1
      // ab0: if_icmpne ae1
      // ab3: goto aba
      // ab6: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ab9: athrow
      // aba: getstatic me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // abd: bipush 53
      // abf: bipush 0
      // ac0: getstatic net/minecraft/world/inventory/ContainerInput.PICKUP Lnet/minecraft/world/inventory/ContainerInput;
      // ac3: invokevirtual me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a (IILnet/minecraft/world/inventory/ContainerInput;)V
      // ac6: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // ac9: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // acc: bipush 0
      // acd: goto ad4
      // ad0: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ad3: athrow
      // ad4: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Z
      // ad7: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // ada: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // add: iload 2
      // ade: ifeq f57
      // ae1: sipush 4338
      // ae4: sipush -17364
      // ae7: pop2
      // ae8: ldc_w "§e[ItemParser] Wardrobe complete"
      // aeb: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // aee: iload 2
      // aef: ifne b14
      // af2: goto af9
      // af5: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // af8: athrow
      // af9: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // afc: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // aff: dup
      // b00: ifnull b17
      // b03: goto b0a
      // b06: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b09: athrow
      // b0a: invokevirtual net/minecraft/client/player/LocalPlayer.closeContainer ()V
      // b0d: goto b14
      // b10: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b13: athrow
      // b14: goto b18
      // b17: pop
      // b18: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // b1b: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // b1e: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // b21: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // b24: iload 2
      // b25: ifeq f57
      // b28: sipush 4323
      // b2b: sipush 29579
      // b2e: pop2
      // b2f: ldc_w "§c[ItemParser] No screen open for wardrobe next"
      // b32: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // b35: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // b38: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // b3b: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // b3e: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // b41: goto b48
      // b44: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b47: athrow
      // b48: iload 2
      // b49: ifeq f57
      // b4c: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // b4f: iload 2
      // b50: ifne b9e
      // b53: goto b5a
      // b56: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b59: athrow
      // b5a: sipush 500
      // b5d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // b60: checkcast java/lang/Number
      // b63: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // b66: ifne b75
      // b69: goto b70
      // b6c: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b6f: athrow
      // b70: return
      // b71: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b74: athrow
      // b75: sipush 4307
      // b78: sipush -20961
      // b7b: pop2
      // b7c: ldc_w "§e[ItemParser] Opening pets..."
      // b7f: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // b82: sipush 4255
      // b85: sipush 26865
      // b88: pop2
      // b89: ldc_w "/pets"
      // b8c: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Ljava/lang/Object;)V
      // b8f: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // b92: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // b95: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // b98: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // b9b: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // b9e: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // ba1: iload 2
      // ba2: ifeq f57
      // ba5: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // ba8: iload 2
      // ba9: ifne be6
      // bac: goto bb3
      // baf: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // bb2: athrow
      // bb3: sipush 3000
      // bb6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // bb9: checkcast java/lang/Number
      // bbc: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // bbf: ifeq f57
      // bc2: goto bc9
      // bc5: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // bc8: athrow
      // bc9: sipush 4264
      // bcc: sipush -22711
      // bcf: pop2
      // bd0: ldc_w "§c[ItemParser] Pets open timeout, retrying..."
      // bd3: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // bd6: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // bd9: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // bdc: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // bdf: goto be6
      // be2: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // be5: athrow
      // be6: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // be9: iload 2
      // bea: ifeq f57
      // bed: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // bf0: sipush 500
      // bf3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // bf6: checkcast java/lang/Number
      // bf9: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // bfc: iload 2
      // bfd: ifne c14
      // c00: goto c07
      // c03: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c06: athrow
      // c07: ifeq c22
      // c0a: goto c11
      // c0d: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c10: athrow
      // c11: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Z
      // c14: iload 2
      // c15: ifne c24
      // c18: ifeq c23
      // c1b: goto c22
      // c1e: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c21: athrow
      // c22: return
      // c23: bipush 1
      // c24: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Z
      // c27: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // c2a: getfield net/minecraft/client/Minecraft.screen Lnet/minecraft/client/gui/screens/Screen;
      // c2d: astore 3
      // c2e: aload 3
      // c2f: instanceof net/minecraft/client/gui/screens/inventory/AbstractContainerScreen
      // c32: iload 2
      // c33: ifne d64
      // c36: ifeq d49
      // c39: goto c40
      // c3c: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c3f: athrow
      // c40: aload 3
      // c41: checkcast net/minecraft/client/gui/screens/inventory/AbstractContainerScreen
      // c44: invokevirtual net/minecraft/client/gui/screens/inventory/AbstractContainerScreen.getTitle ()Lnet/minecraft/network/chat/Component;
      // c47: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // c4c: dup
      // c4d: sipush 4269
      // c50: sipush 5866
      // c53: pop2
      // c54: ldc "getString(...)"
      // c56: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // c59: astore 4
      // c5b: aload 4
      // c5d: sipush 4333
      // c60: sipush 6619
      // c63: pop2
      // c64: ldc_w "§e[ItemParser] Pets title: "
      // c67: swap
      // c68: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // c6d: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // c70: new kotlin/text/Regex
      // c73: dup
      // c74: sipush 4324
      // c77: sipush 18448
      // c7a: pop2
      // c7b: ldc_w "Pets \\((\\d+)/(\\d+)\\)"
      // c7e: invokespecial kotlin/text/Regex.<init> (Ljava/lang/String;)V
      // c81: aload 4
      // c83: checkcast java/lang/CharSequence
      // c86: bipush 0
      // c87: bipush 2
      // c88: aconst_null
      // c89: invokestatic kotlin/text/Regex.find$default (Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;
      // c8c: astore 5
      // c8e: iload 2
      // c8f: ifne cd9
      // c92: aload 5
      // c94: dup
      // c95: ifnull cd8
      // c98: goto c9f
      // c9b: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c9e: athrow
      // c9f: invokeinterface kotlin/text/MatchResult.getGroupValues ()Ljava/util/List; 1
      // ca4: iload 2
      // ca5: ifne cc7
      // ca8: goto caf
      // cab: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // cae: athrow
      // caf: dup
      // cb0: ifnull cd8
      // cb3: goto cba
      // cb6: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // cb9: athrow
      // cba: bipush 1
      // cbb: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // cc0: goto cc7
      // cc3: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // cc6: athrow
      // cc7: checkcast java/lang/String
      // cca: dup
      // ccb: ifnull cd8
      // cce: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // cd1: goto cda
      // cd4: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // cd7: athrow
      // cd8: pop
      // cd9: bipush 1
      // cda: istore 6
      // cdc: iload 2
      // cdd: ifne d27
      // ce0: aload 5
      // ce2: dup
      // ce3: ifnull d26
      // ce6: goto ced
      // ce9: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // cec: athrow
      // ced: invokeinterface kotlin/text/MatchResult.getGroupValues ()Ljava/util/List; 1
      // cf2: iload 2
      // cf3: ifne d15
      // cf6: goto cfd
      // cf9: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // cfc: athrow
      // cfd: dup
      // cfe: ifnull d26
      // d01: goto d08
      // d04: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d07: athrow
      // d08: bipush 2
      // d09: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // d0e: goto d15
      // d11: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d14: athrow
      // d15: checkcast java/lang/String
      // d18: dup
      // d19: ifnull d26
      // d1c: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // d1f: goto d28
      // d22: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d25: athrow
      // d26: pop
      // d27: bipush 1
      // d28: istore 7
      // d2a: iload 6
      // d2c: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI I
      // d2f: aload 0
      // d30: aload 3
      // d31: checkcast net/minecraft/client/gui/screens/inventory/AbstractContainerScreen
      // d34: iload 6
      // d36: invokespecial me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.b (Lnet/minecraft/client/gui/screens/inventory/AbstractContainerScreen;I)V
      // d39: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // d3c: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // d3f: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // d42: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // d45: iload 2
      // d46: ifeq f57
      // d49: sipush 4230
      // d4c: sipush 6044
      // d4f: pop2
      // d50: ldc_w "§c[ItemParser] No screen open for pets"
      // d53: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // d56: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // d59: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // d5c: bipush 0
      // d5d: goto d64
      // d60: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d63: athrow
      // d64: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Z
      // d67: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // d6a: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // d6d: iload 2
      // d6e: ifeq f57
      // d71: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // d74: sipush 500
      // d77: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // d7a: checkcast java/lang/Number
      // d7d: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // d80: ifne d8f
      // d83: goto d8a
      // d86: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d89: athrow
      // d8a: return
      // d8b: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d8e: athrow
      // d8f: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // d92: getfield net/minecraft/client/Minecraft.screen Lnet/minecraft/client/gui/screens/Screen;
      // d95: astore 3
      // d96: iload 2
      // d97: ifne ee5
      // d9a: aload 3
      // d9b: instanceof net/minecraft/client/gui/screens/inventory/AbstractContainerScreen
      // d9e: ifeq ec5
      // da1: goto da8
      // da4: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // da7: athrow
      // da8: aload 3
      // da9: checkcast net/minecraft/client/gui/screens/inventory/AbstractContainerScreen
      // dac: invokevirtual net/minecraft/client/gui/screens/inventory/AbstractContainerScreen.getMenu ()Lnet/minecraft/world/inventory/AbstractContainerMenu;
      // daf: getfield net/minecraft/world/inventory/AbstractContainerMenu.slots Lnet/minecraft/core/NonNullList;
      // db2: dup
      // db3: sipush 4236
      // db6: sipush 27288
      // db9: pop2
      // dba: ldc "slots"
      // dbc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // dbf: checkcast java/util/List
      // dc2: bipush 53
      // dc4: invokestatic kotlin/collections/CollectionsKt.getOrNull (Ljava/util/List;I)Ljava/lang/Object;
      // dc7: checkcast net/minecraft/world/inventory/Slot
      // dca: dup
      // dcb: ifnull ddf
      // dce: goto dd5
      // dd1: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // dd4: athrow
      // dd5: invokevirtual net/minecraft/world/inventory/Slot.getItem ()Lnet/minecraft/world/item/ItemStack;
      // dd8: goto de1
      // ddb: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // dde: athrow
      // ddf: pop
      // de0: aconst_null
      // de1: astore 4
      // de3: iload 2
      // de4: ifne e1a
      // de7: aload 4
      // de9: dup
      // dea: ifnull e12
      // ded: goto df4
      // df0: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // df3: athrow
      // df4: invokevirtual net/minecraft/world/item/ItemStack.getHoverName ()Lnet/minecraft/network/chat/Component;
      // df7: dup
      // df8: ifnull e12
      // dfb: goto e02
      // dfe: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // e01: athrow
      // e02: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // e07: dup
      // e08: ifnonnull e24
      // e0b: goto e12
      // e0e: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // e11: athrow
      // e12: pop
      // e13: goto e1a
      // e16: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // e19: athrow
      // e1a: sipush 4271
      // e1d: sipush 20091
      // e20: pop2
      // e21: ldc_w "empty"
      // e24: astore 5
      // e26: aload 5
      // e28: iload 2
      // e29: ifne e8f
      // e2c: checkcast java/lang/CharSequence
      // e2f: sipush 4262
      // e32: sipush -8583
      // e35: pop2
      // e36: ldc_w "Next Page"
      // e39: checkcast java/lang/CharSequence
      // e3c: bipush 1
      // e3d: invokestatic kotlin/text/StringsKt.contains (Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z
      // e40: ifeq e7e
      // e43: goto e4a
      // e46: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // e49: athrow
      // e4a: sipush 4321
      // e4d: sipush 5626
      // e50: pop2
      // e51: ldc_w "§e[ItemParser] Clicking next pets page (slot 53)..."
      // e54: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // e57: getstatic me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // e5a: bipush 53
      // e5c: bipush 0
      // e5d: getstatic net/minecraft/world/inventory/ContainerInput.PICKUP Lnet/minecraft/world/inventory/ContainerInput;
      // e60: invokevirtual me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a (IILnet/minecraft/world/inventory/ContainerInput;)V
      // e63: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // e66: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // e69: bipush 0
      // e6a: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Z
      // e6d: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // e70: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // e73: iload 2
      // e74: ifeq f57
      // e77: goto e7e
      // e7a: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // e7d: athrow
      // e7e: sipush 4327
      // e81: sipush -15563
      // e84: pop2
      // e85: ldc_w "§e[ItemParser] Pets complete"
      // e88: goto e8f
      // e8b: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // e8e: athrow
      // e8f: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // e92: iload 2
      // e93: ifne eb1
      // e96: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // e99: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // e9c: dup
      // e9d: ifnull eb4
      // ea0: goto ea7
      // ea3: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ea6: athrow
      // ea7: invokevirtual net/minecraft/client/player/LocalPlayer.closeContainer ()V
      // eaa: goto eb1
      // ead: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // eb0: athrow
      // eb1: goto eb5
      // eb4: pop
      // eb5: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // eb8: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // ebb: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // ebe: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // ec1: iload 2
      // ec2: ifeq f57
      // ec5: sipush 4248
      // ec8: sipush -20900
      // ecb: pop2
      // ecc: ldc_w "§c[ItemParser] No screen open for pets next"
      // ecf: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // ed2: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // ed5: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // ed8: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // edb: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // ede: goto ee5
      // ee1: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ee4: athrow
      // ee5: iload 2
      // ee6: ifeq f57
      // ee9: sipush 4347
      // eec: sipush 354
      // eef: pop2
      // ef0: ldc_w "§a[ItemParser] Complete! Saving..."
      // ef3: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // ef6: iload 2
      // ef7: ifne f1c
      // efa: goto f01
      // efd: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // f00: athrow
      // f01: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // f04: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // f07: dup
      // f08: ifnull f1f
      // f0b: goto f12
      // f0e: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // f11: athrow
      // f12: invokevirtual net/minecraft/client/player/LocalPlayer.closeContainer ()V
      // f15: goto f1c
      // f18: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // f1b: athrow
      // f1c: goto f20
      // f1f: pop
      // f20: aload 0
      // f21: invokespecial me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.c ()V
      // f24: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Ljava/io/File;
      // f27: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // f2a: sipush 4319
      // f2d: sipush -28032
      // f30: pop2
      // f31: ldc_w "§a[ItemParser] Saved to "
      // f34: swap
      // f35: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // f3a: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // f3d: bipush 0
      // f3e: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Z
      // f41: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // f44: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // f47: iload 2
      // f48: ifeq f57
      // f4b: new kotlin/NoWhenBranchMatchedException
      // f4e: dup
      // f4f: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
      // f52: athrow
      // f53: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // f56: athrow
      // f57: return
   }

   @SubscribeEvent
   public final void a(@NotNull llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.e ()Z
      // 003: aload 1
      // 004: sipush 4245
      // 007: sipush 2310
      // 00a: pop2
      // 00b: ldc "event"
      // 00d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 010: istore 2
      // 011: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Z
      // 014: iload 2
      // 015: ifeq 025
      // 018: ifeq 036
      // 01b: goto 022
      // 01e: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 021: athrow
      // 022: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Z
      // 025: ifeq 036
      // 028: aload 1
      // 029: invokevirtual me/octo/client/events/impl/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.m ()Ljava/util/List;
      // 02c: ifnonnull 03b
      // 02f: goto 036
      // 032: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 035: athrow
      // 036: return
      // 037: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03a: athrow
      // 03b: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 03e: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl [I
      // 041: swap
      // 042: invokevirtual me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.ordinal ()I
      // 045: iaload
      // 046: iload 2
      // 047: ifeq 0ab
      // 04a: lookupswitch 707 6 6 62 8 203 12 129 14 330 18 457 22 584
      // 084: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 087: athrow
      // 088: aload 1
      // 089: invokevirtual me/octo/client/events/impl/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.k ()Ljava/lang/String;
      // 08c: iload 2
      // 08d: ifeq 0b8
      // 090: goto 097
      // 093: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 096: athrow
      // 097: sipush 4225
      // 09a: sipush 3188
      // 09d: pop2
      // 09e: ldc_w "Storage"
      // 0a1: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 0a4: goto 0ab
      // 0a7: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0aa: athrow
      // 0ab: ifeq 30d
      // 0ae: sipush 4350
      // 0b1: sipush -29607
      // 0b4: pop2
      // 0b5: ldc_w "§e[ItemParser] Storage GUI opened"
      // 0b8: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 0bb: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 0be: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 0c1: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0c4: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 0c7: iload 2
      // 0c8: ifne 30d
      // 0cb: aload 1
      // 0cc: invokevirtual me/octo/client/events/impl/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.k ()Ljava/lang/String;
      // 0cf: iload 2
      // 0d0: ifeq 102
      // 0d3: goto 0da
      // 0d6: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d9: athrow
      // 0da: sipush 4330
      // 0dd: sipush 11422
      // 0e0: pop2
      // 0e1: ldc_w "Storage"
      // 0e4: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 0e7: ifeq 30d
      // 0ea: goto 0f1
      // 0ed: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f0: athrow
      // 0f1: sipush 4325
      // 0f4: sipush 25245
      // 0f7: pop2
      // 0f8: ldc_w "§e[ItemParser] Storage GUI opened for backpacks"
      // 0fb: goto 102
      // 0fe: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 101: athrow
      // 102: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 105: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 108: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 10b: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 10e: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 111: iload 2
      // 112: ifne 30d
      // 115: aload 1
      // 116: invokevirtual me/octo/client/events/impl/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.k ()Ljava/lang/String;
      // 119: dup
      // 11a: iload 2
      // 11b: ifeq 146
      // 11e: goto 125
      // 121: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 124: athrow
      // 125: ifnull 167
      // 128: goto 12f
      // 12b: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12e: athrow
      // 12f: checkcast java/lang/CharSequence
      // 132: sipush 4282
      // 135: sipush -30442
      // 138: pop2
      // 139: ldc_w "Ender Chest"
      // 13c: checkcast java/lang/CharSequence
      // 13f: goto 146
      // 142: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 145: athrow
      // 146: bipush 0
      // 147: bipush 2
      // 148: aconst_null
      // 149: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 14c: iload 2
      // 14d: ifeq 164
      // 150: bipush 1
      // 151: if_icmpne 163
      // 154: goto 15b
      // 157: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15a: athrow
      // 15b: bipush 1
      // 15c: goto 169
      // 15f: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 162: athrow
      // 163: bipush 0
      // 164: goto 169
      // 167: pop
      // 168: bipush 0
      // 169: ifeq 30d
      // 16c: sipush 4339
      // 16f: sipush -4293
      // 172: pop2
      // 173: ldc_w "§e[ItemParser] Ender Chest GUI opened"
      // 176: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 179: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 17c: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 17f: bipush 0
      // 180: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Z
      // 183: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 186: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 189: iload 2
      // 18a: ifne 30d
      // 18d: goto 194
      // 190: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 193: athrow
      // 194: aload 1
      // 195: invokevirtual me/octo/client/events/impl/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.k ()Ljava/lang/String;
      // 198: dup
      // 199: iload 2
      // 19a: ifeq 1c5
      // 19d: goto 1a4
      // 1a0: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a3: athrow
      // 1a4: ifnull 1e6
      // 1a7: goto 1ae
      // 1aa: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ad: athrow
      // 1ae: checkcast java/lang/CharSequence
      // 1b1: sipush 4272
      // 1b4: sipush 14170
      // 1b7: pop2
      // 1b8: ldc_w "Backpack"
      // 1bb: checkcast java/lang/CharSequence
      // 1be: goto 1c5
      // 1c1: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c4: athrow
      // 1c5: bipush 0
      // 1c6: bipush 2
      // 1c7: aconst_null
      // 1c8: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 1cb: iload 2
      // 1cc: ifeq 1e3
      // 1cf: bipush 1
      // 1d0: if_icmpne 1e2
      // 1d3: goto 1da
      // 1d6: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d9: athrow
      // 1da: bipush 1
      // 1db: goto 1e8
      // 1de: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e1: athrow
      // 1e2: bipush 0
      // 1e3: goto 1e8
      // 1e6: pop
      // 1e7: bipush 0
      // 1e8: ifeq 30d
      // 1eb: sipush 4349
      // 1ee: sipush -29772
      // 1f1: pop2
      // 1f2: ldc_w "§e[ItemParser] Backpack GUI opened"
      // 1f5: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 1f8: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 1fb: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 1fe: bipush 0
      // 1ff: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Z
      // 202: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 205: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 208: iload 2
      // 209: ifne 30d
      // 20c: goto 213
      // 20f: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 212: athrow
      // 213: aload 1
      // 214: invokevirtual me/octo/client/events/impl/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.k ()Ljava/lang/String;
      // 217: dup
      // 218: iload 2
      // 219: ifeq 244
      // 21c: goto 223
      // 21f: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 222: athrow
      // 223: ifnull 265
      // 226: goto 22d
      // 229: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22c: athrow
      // 22d: checkcast java/lang/CharSequence
      // 230: sipush 4344
      // 233: sipush 27504
      // 236: pop2
      // 237: ldc_w "Wardrobe"
      // 23a: checkcast java/lang/CharSequence
      // 23d: goto 244
      // 240: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 243: athrow
      // 244: bipush 0
      // 245: bipush 2
      // 246: aconst_null
      // 247: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 24a: iload 2
      // 24b: ifeq 262
      // 24e: bipush 1
      // 24f: if_icmpne 261
      // 252: goto 259
      // 255: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 258: athrow
      // 259: bipush 1
      // 25a: goto 267
      // 25d: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 260: athrow
      // 261: bipush 0
      // 262: goto 267
      // 265: pop
      // 266: bipush 0
      // 267: ifeq 30d
      // 26a: sipush 4247
      // 26d: sipush 9110
      // 270: pop2
      // 271: ldc_w "§e[ItemParser] Wardrobe GUI opened"
      // 274: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 277: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 27a: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 27d: bipush 0
      // 27e: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Z
      // 281: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 284: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 287: iload 2
      // 288: ifne 30d
      // 28b: goto 292
      // 28e: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 291: athrow
      // 292: aload 1
      // 293: invokevirtual me/octo/client/events/impl/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.k ()Ljava/lang/String;
      // 296: dup
      // 297: iload 2
      // 298: ifeq 2c3
      // 29b: goto 2a2
      // 29e: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a1: athrow
      // 2a2: ifnull 2e4
      // 2a5: goto 2ac
      // 2a8: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ab: athrow
      // 2ac: checkcast java/lang/CharSequence
      // 2af: sipush 4246
      // 2b2: sipush -20642
      // 2b5: pop2
      // 2b6: ldc_w "Pets"
      // 2b9: checkcast java/lang/CharSequence
      // 2bc: goto 2c3
      // 2bf: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c2: athrow
      // 2c3: bipush 0
      // 2c4: bipush 2
      // 2c5: aconst_null
      // 2c6: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 2c9: iload 2
      // 2ca: ifeq 2e1
      // 2cd: bipush 1
      // 2ce: if_icmpne 2e0
      // 2d1: goto 2d8
      // 2d4: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d7: athrow
      // 2d8: bipush 1
      // 2d9: goto 2e6
      // 2dc: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2df: athrow
      // 2e0: bipush 0
      // 2e1: goto 2e6
      // 2e4: pop
      // 2e5: bipush 0
      // 2e6: ifeq 30d
      // 2e9: sipush 4252
      // 2ec: sipush -24904
      // 2ef: pop2
      // 2f0: ldc_w "§e[ItemParser] Pets GUI opened"
      // 2f3: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 2f6: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 2f9: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 2fc: bipush 0
      // 2fd: putstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Z
      // 300: getstatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 303: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 306: goto 30d
      // 309: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30c: athrow
      // 30d: return
   }

   private final int a() {
      net.minecraft.client.gui.screens.Screen var2 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.screen;
      if (!(var2 instanceof AbstractContainerScreen)) {
         return -1;
      }
      AbstractContainerScreen<?> containerScreen = (AbstractContainerScreen<?>) var2;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§e[ItemParser] Scanning for backpacks...");
      for (int var3 = 27; var3 < 45; var3++) {
         Slot var4 = CollectionsKt.getOrNull(containerScreen.getMenu().slots, var3);
         ItemStack var5 = var4 == null ? null : var4.getItem();
         if (var5 == null) {
            continue;
         }
         if (var5.isEmpty()) {
            continue;
         }
         String var6 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var5.getHoverName().getString());
         if (!StringsKt.contains(var6, "Backpack", false)) {
            continue;
         }
         if (StringsKt.contains(var6, "Locked", false)) {
            continue;
         }
         if (StringsKt.contains(var6, "Empty", false)) {
            continue;
         }
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§e[ItemParser] Found backpack!");
         return var3;
      }
      return -1;
   }

   private final void b() {
      net.minecraft.world.entity.player.Inventory var2 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.player.getInventory();
      com.google.gson.JsonArray var3 = new com.google.gson.JsonArray();
      for (int var4 = 0; var4 < 36; var4++) {
         net.minecraft.world.item.ItemStack var5 = var2.getItem(var4);
         if (!var5.isEmpty() && this.a(var5)) {
            var3.add((com.google.gson.JsonElement) this.b(var5));
         }
      }
      lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.add("inventory", (com.google.gson.JsonElement) var3);
   }

   private final void a(List<? extends Slot> param1, String param2, boolean param3) {
      com.google.gson.JsonArray var5 = new com.google.gson.JsonArray();
      boolean var4 = me.octo.client.IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.e();
      java.util.Iterator var6 = param1.iterator();
      while (var6.hasNext()) {
         net.minecraft.world.inventory.Slot var7 = (net.minecraft.world.inventory.Slot)var6.next();
         net.minecraft.world.item.ItemStack var8 = var7.getItem();
         kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var8, "getItem(...)");
         if (!var8.isEmpty() && var4) {
            if (param3) {
               this.a(var8);
            }
            com.google.gson.JsonElement var9 = this.b(var8);
            var5.add(var9);
         }
      }
      if (!IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.has(param2)) {
         IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.add(param2, (com.google.gson.JsonElement)var5);
      }
      com.google.gson.JsonArray var12 = IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.getAsJsonArray(param2);
      for (Object var10 : (Iterable)var5) {
         com.google.gson.JsonElement var11 = (com.google.gson.JsonElement)var10;
         var12.add(var11);
      }
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§e[ItemParser] " + param2 + ": Found " + var5.size() + " items");
   }

   private final void a(AbstractContainerScreen<?> var1, int var2) {
      ItemStack var33 = null; // PX-FIX
      Object var32 = null; // PX-FIX
      JsonObject var4 = new JsonObject();
      List[] var6 = new List[9];
      Integer[] var7 = new Integer[]{0, 9, 18, 27};
      var6[0] = CollectionsKt.listOf(var7);
      var7 = new Integer[]{1, 10, 19, 28};
      var6[1] = CollectionsKt.listOf(var7);
      int var10000 = ((IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d()) ? 1 : 0);
      var7 = new Integer[]{2, 11, 20, 29};
      var6[2] = CollectionsKt.listOf(var7);
      var7 = new Integer[]{3, 12, 21, 30};
      var6[3] = CollectionsKt.listOf(var7);
      var7 = new Integer[]{4, 13, 22, 31};
      var6[4] = CollectionsKt.listOf(var7);
      var7 = new Integer[]{5, 14, 23, 32};
      var6[5] = CollectionsKt.listOf(var7);
      var7 = new Integer[]{6, 15, 24, 33};
      var6[6] = CollectionsKt.listOf(var7);
      var7 = new Integer[]{7, 16, 25, 34};
      var6[7] = CollectionsKt.listOf(var7);
      var7 = new Integer[]{8, 17, 26, 35};
      var6[8] = CollectionsKt.listOf(var7);
      List var5 = CollectionsKt.listOf(var6);
      Iterator var18 = var5.iterator();
      boolean var3 = (var10000 != 0);
      int var27 = 0;

      label95:
      while (true) {
         var10000 = ((var18.hasNext()) ? 1 : 0);

         while (var10000 != 0) {
            int var8 = var27++;
            Object var29 = var18.next();

            JsonArray var10;
            label89:
            while (true) {
               List var9 = (List)var29;
               var10 = new JsonArray();
               if (var3) {
                  return;
               }

               Iterator var11 = var9.iterator();

               label87:
               while (true) {
                  boolean var30 = var11.hasNext();

                  ItemStack var13;
                  do {
                     if (!var30) {
                        break label89;
                     }

                     int var12 = ((Number)var11.next()).intValue();

                     label80: {
                        label103: {
                           try {
                              if (var3) {
                                 break label103;
                              }

                              NonNullList var31 = var1.getMenu().slots;
                              short var10002 = 4236;
                              short var10003 = 27288;
                              Intrinsics.checkNotNullExpressionValue(var31, "slots");
                              var29 = (Slot)CollectionsKt.getOrNull(var31, var12);
                              if (var3) {
                                 continue label89;
                              }
                           } catch (NoWhenBranchMatchedException var16) {
                              throw (RuntimeException)a(var16);
                           }

                           try {
                              if (var29 != null) {
                                 var32 = ((me.octo.client.PXDyn)var29).getItem();
                                 break label80;
                              }
                           } catch (NoWhenBranchMatchedException var17) {
                              throw (RuntimeException)a(var17);
                           }
                        }

                        var32 = null;
                     }

                     var13 =((ItemStack)( var32));

                     label65: {
                        try {
                           var33 = var13;
                           if (var3) {
                              break label65;
                           }

                           if (var13 == null) {
                              continue label87;
                           }
                        } catch (NoWhenBranchMatchedException var15) {
                           throw (RuntimeException)a(var15);
                        }

                        var33 = var13;
                     }

                     var30 = var33.isEmpty();
                  } while (var3);

                  if (!var30) {
                     JsonObject var14 = this.b(var13);
                     var10.add((JsonElement)var14);
                     if (var3) {
                        break label89;
                     }
                  }
               }
            }

            var10000 = var10.size();
            if (!var3) {
               if (var10000 <= 0) {
                  continue label95;
               }

               int var10001 = var8 + 1;
               short var35 = 4317;
               short var38 = 27856;
               var4.add("set_" + var10001, (JsonElement)var10);
               if (!var3) {
                  continue label95;
               }
               break;
            }
         }

         short var36 = 4265;
         short var39 = 15641;
         lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.add("wardrobe_page_" + var2, (JsonElement)var4);
         int var34 = var4.size();
         var36 = 4318;
         var39 = 913;
         var39 = 4238;
         short var10004 = 18344;
         var10004 = 4257;
         short var10005 = -30239;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
            "§e[ItemParser] Wardrobe page " + var2 + ": Found " + var34 + " sets"
         );
         return;
      }
   }

   private final void b(AbstractContainerScreen<?> param1, int param2) {
JsonArray jsonArray = new JsonArray();
for (int i = 9; i < 45; i++) {
   Slot slot = CollectionsKt.getOrNull(param1.getMenu().slots, i);
   ItemStack itemStack = slot == null ? null : slot.getItem();
   if (itemStack == null) {
      continue;
   }
   if (itemStack.isEmpty()) {
      continue;
   }
   String name = itemStack.getItem().toString();
   name = name.substring(name.lastIndexOf('.') + 1).replace("Item", "");
   if (StringsKt.contains(name, "skull", true) || StringsKt.contains(name, "head", true) || StringsKt.contains(name, "player_head", true)) {
      JsonObject jsonObject = this.b(itemStack);
      jsonArray.add((JsonElement)jsonObject);
   }
}
IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.add("pets_page_" + param2, (JsonElement)jsonArray);
me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§e[ItemParser] Pets page " + param2 + ": Found " + jsonArray.size() + " pets");
   }

   private final boolean a(ItemStack param1) {
      String var3 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(param1.getHoverName().getString());
      for (String var8 : me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g()) {
         if (kotlin.text.StringsKt.contains(var3, var8, true)) {
            return true;
         }
      }
      for (String var8 : me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.i()) {
         if (kotlin.text.StringsKt.contains(var3, var8, true)) {
            return true;
         }
      }
      for (String var8 : me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.h()) {
         if (kotlin.text.StringsKt.contains(var3, var8, true)) {
            return true;
         }
      }
      for (String var8 : me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.j()) {
         if (kotlin.text.StringsKt.contains(var3, var8, true)) {
            return true;
         }
      }
      for (String var8 : me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.k()) {
         if (kotlin.text.StringsKt.contains(var3, var8, true)) {
            return true;
         }
      }
      for (String var8 : me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.l()) {
         if (kotlin.text.StringsKt.contains(var3, var8, true)) {
            return true;
         }
      }
      return false;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // 003: aload 1
      // 004: invokevirtual net/minecraft/world/item/ItemStack.getHoverName ()Lnet/minecraft/network/chat/Component;
      // 007: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 00c: dup
      // 00d: sipush 4269
      // 010: sipush 5866
      // 013: pop2
      // 014: ldc "getString(...)"
      // 016: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 019: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // 01c: astore 3
      // 01d: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.e ()Z
      // 020: getstatic me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 023: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.g ()Ljava/util/List;
      // 026: checkcast java/lang/Iterable
      // 029: astore 4
      // 02b: istore 2
      // 02c: bipush 0
      // 02d: istore 5
      // 02f: aload 4
      // 031: iload 2
      // 032: ifeq 06b
      // 035: instanceof java/util/Collection
      // 038: ifeq 069
      // 03b: goto 042
      // 03e: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 041: athrow
      // 042: aload 4
      // 044: checkcast java/util/Collection
      // 047: iload 2
      // 048: ifeq 06b
      // 04b: goto 052
      // 04e: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 051: athrow
      // 052: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 057: ifeq 069
      // 05a: goto 061
      // 05d: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 060: athrow
      // 061: bipush 0
      // 062: goto 0a8
      // 065: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 068: athrow
      // 069: aload 4
      // 06b: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 070: astore 6
      // 072: aload 6
      // 074: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 079: ifeq 0a7
      // 07c: aload 6
      // 07e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 083: astore 7
      // 085: aload 7
      // 087: checkcast java/lang/String
      // 08a: astore 8
      // 08c: bipush 0
      // 08d: istore 9
      // 08f: aload 3
      // 090: checkcast java/lang/CharSequence
      // 093: aload 8
      // 095: checkcast java/lang/CharSequence
      // 098: bipush 1
      // 099: invokestatic kotlin/text/StringsKt.contains (Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z
      // 09c: ifeq 072
      // 09f: bipush 1
      // 0a0: iload 2
      // 0a1: ifeq 09c
      // 0a4: goto 0a8
      // 0a7: bipush 0
      // 0a8: ifne 35d
      // 0ab: getstatic me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 0ae: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.i ()Ljava/util/List;
      // 0b1: checkcast java/lang/Iterable
      // 0b4: astore 4
      // 0b6: bipush 0
      // 0b7: istore 5
      // 0b9: aload 4
      // 0bb: iload 2
      // 0bc: ifeq 0f5
      // 0bf: instanceof java/util/Collection
      // 0c2: ifeq 0f3
      // 0c5: goto 0cc
      // 0c8: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cb: athrow
      // 0cc: aload 4
      // 0ce: checkcast java/util/Collection
      // 0d1: iload 2
      // 0d2: ifeq 0f5
      // 0d5: goto 0dc
      // 0d8: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0db: athrow
      // 0dc: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 0e1: ifeq 0f3
      // 0e4: goto 0eb
      // 0e7: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ea: athrow
      // 0eb: bipush 0
      // 0ec: goto 132
      // 0ef: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f2: athrow
      // 0f3: aload 4
      // 0f5: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 0fa: astore 6
      // 0fc: aload 6
      // 0fe: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 103: ifeq 131
      // 106: aload 6
      // 108: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 10d: astore 7
      // 10f: aload 7
      // 111: checkcast java/lang/String
      // 114: astore 8
      // 116: bipush 0
      // 117: istore 9
      // 119: aload 3
      // 11a: checkcast java/lang/CharSequence
      // 11d: aload 8
      // 11f: checkcast java/lang/CharSequence
      // 122: bipush 1
      // 123: invokestatic kotlin/text/StringsKt.contains (Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z
      // 126: ifeq 0fc
      // 129: bipush 1
      // 12a: iload 2
      // 12b: ifeq 126
      // 12e: goto 132
      // 131: bipush 0
      // 132: ifne 35d
      // 135: getstatic me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 138: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.h ()Ljava/util/List;
      // 13b: checkcast java/lang/Iterable
      // 13e: astore 4
      // 140: bipush 0
      // 141: istore 5
      // 143: aload 4
      // 145: iload 2
      // 146: ifeq 17f
      // 149: instanceof java/util/Collection
      // 14c: ifeq 17d
      // 14f: goto 156
      // 152: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 155: athrow
      // 156: aload 4
      // 158: checkcast java/util/Collection
      // 15b: iload 2
      // 15c: ifeq 17f
      // 15f: goto 166
      // 162: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 165: athrow
      // 166: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 16b: ifeq 17d
      // 16e: goto 175
      // 171: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 174: athrow
      // 175: bipush 0
      // 176: goto 1bc
      // 179: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17c: athrow
      // 17d: aload 4
      // 17f: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 184: astore 6
      // 186: aload 6
      // 188: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 18d: ifeq 1bb
      // 190: aload 6
      // 192: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 197: astore 7
      // 199: aload 7
      // 19b: checkcast java/lang/String
      // 19e: astore 8
      // 1a0: bipush 0
      // 1a1: istore 9
      // 1a3: aload 3
      // 1a4: checkcast java/lang/CharSequence
      // 1a7: aload 8
      // 1a9: checkcast java/lang/CharSequence
      // 1ac: bipush 1
      // 1ad: invokestatic kotlin/text/StringsKt.contains (Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z
      // 1b0: ifeq 186
      // 1b3: bipush 1
      // 1b4: iload 2
      // 1b5: ifeq 1b0
      // 1b8: goto 1bc
      // 1bb: bipush 0
      // 1bc: ifne 35d
      // 1bf: getstatic me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 1c2: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.j ()Ljava/util/List;
      // 1c5: checkcast java/lang/Iterable
      // 1c8: astore 4
      // 1ca: bipush 0
      // 1cb: istore 5
      // 1cd: aload 4
      // 1cf: iload 2
      // 1d0: ifeq 209
      // 1d3: instanceof java/util/Collection
      // 1d6: ifeq 207
      // 1d9: goto 1e0
      // 1dc: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1df: athrow
      // 1e0: aload 4
      // 1e2: checkcast java/util/Collection
      // 1e5: iload 2
      // 1e6: ifeq 209
      // 1e9: goto 1f0
      // 1ec: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ef: athrow
      // 1f0: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 1f5: ifeq 207
      // 1f8: goto 1ff
      // 1fb: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1fe: athrow
      // 1ff: bipush 0
      // 200: goto 246
      // 203: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 206: athrow
      // 207: aload 4
      // 209: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 20e: astore 6
      // 210: aload 6
      // 212: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 217: ifeq 245
      // 21a: aload 6
      // 21c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 221: astore 7
      // 223: aload 7
      // 225: checkcast java/lang/String
      // 228: astore 8
      // 22a: bipush 0
      // 22b: istore 9
      // 22d: aload 3
      // 22e: checkcast java/lang/CharSequence
      // 231: aload 8
      // 233: checkcast java/lang/CharSequence
      // 236: bipush 1
      // 237: invokestatic kotlin/text/StringsKt.contains (Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z
      // 23a: ifeq 210
      // 23d: bipush 1
      // 23e: iload 2
      // 23f: ifeq 23a
      // 242: goto 246
      // 245: bipush 0
      // 246: ifne 35d
      // 249: getstatic me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 24c: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.k ()Ljava/util/List;
      // 24f: checkcast java/lang/Iterable
      // 252: astore 4
      // 254: bipush 0
      // 255: istore 5
      // 257: aload 4
      // 259: iload 2
      // 25a: ifeq 293
      // 25d: instanceof java/util/Collection
      // 260: ifeq 291
      // 263: goto 26a
      // 266: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 269: athrow
      // 26a: aload 4
      // 26c: checkcast java/util/Collection
      // 26f: iload 2
      // 270: ifeq 293
      // 273: goto 27a
      // 276: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 279: athrow
      // 27a: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 27f: ifeq 291
      // 282: goto 289
      // 285: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 288: athrow
      // 289: bipush 0
      // 28a: goto 2d0
      // 28d: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 290: athrow
      // 291: aload 4
      // 293: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 298: astore 6
      // 29a: aload 6
      // 29c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2a1: ifeq 2cf
      // 2a4: aload 6
      // 2a6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2ab: astore 7
      // 2ad: aload 7
      // 2af: checkcast java/lang/String
      // 2b2: astore 8
      // 2b4: bipush 0
      // 2b5: istore 9
      // 2b7: aload 3
      // 2b8: checkcast java/lang/CharSequence
      // 2bb: aload 8
      // 2bd: checkcast java/lang/CharSequence
      // 2c0: bipush 1
      // 2c1: invokestatic kotlin/text/StringsKt.contains (Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z
      // 2c4: ifeq 29a
      // 2c7: bipush 1
      // 2c8: iload 2
      // 2c9: ifeq 2c4
      // 2cc: goto 2d0
      // 2cf: bipush 0
      // 2d0: ifne 35d
      // 2d3: getstatic me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 2d6: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.l ()Ljava/util/List;
      // 2d9: checkcast java/lang/Iterable
      // 2dc: astore 4
      // 2de: bipush 0
      // 2df: istore 5
      // 2e1: aload 4
      // 2e3: iload 2
      // 2e4: ifeq 31d
      // 2e7: instanceof java/util/Collection
      // 2ea: ifeq 31b
      // 2ed: goto 2f4
      // 2f0: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f3: athrow
      // 2f4: aload 4
      // 2f6: checkcast java/util/Collection
      // 2f9: iload 2
      // 2fa: ifeq 31d
      // 2fd: goto 304
      // 300: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 303: athrow
      // 304: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 309: ifeq 31b
      // 30c: goto 313
      // 30f: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 312: athrow
      // 313: bipush 0
      // 314: goto 35a
      // 317: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31a: athrow
      // 31b: aload 4
      // 31d: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 322: astore 6
      // 324: aload 6
      // 326: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 32b: ifeq 359
      // 32e: aload 6
      // 330: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 335: astore 7
      // 337: aload 7
      // 339: checkcast java/lang/String
      // 33c: astore 8
      // 33e: bipush 0
      // 33f: istore 9
      // 341: aload 3
      // 342: checkcast java/lang/CharSequence
      // 345: aload 8
      // 347: checkcast java/lang/CharSequence
      // 34a: bipush 1
      // 34b: invokestatic kotlin/text/StringsKt.contains (Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z
      // 34e: ifeq 324
      // 351: bipush 1
      // 352: iload 2
      // 353: ifeq 34e
      // 356: goto 35a
      // 359: bipush 0
      // 35a: ifeq 365
      // 35d: bipush 1
      // 35e: goto 366
      // 361: invokestatic me/octo/client/IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 364: athrow
      // 365: bipush 0
      // 366: ireturn
   }

   private final JsonObject b(ItemStack param1) {
      // decoy enum boolean getter and its `iload_2; ifne` folds dropped (COMMON decoy family).
      String var3 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(param1.getHoverName().getString());
      String var4 = param1.getItem().toString();
      var4 = kotlin.text.StringsKt.substringAfterLast(var4, '.', var4).replace("Item", "");
      JsonObject var6 = new JsonObject();
      var6.addProperty("name", var3);
      var6.addProperty("type", var4);
      if (kotlin.text.StringsKt.contains(var4, "skull", true) || kotlin.text.StringsKt.contains(var4, "head", true) || kotlin.text.StringsKt.contains(var4, "player_head", true)) {
         String var9 = this.d(param1);
         if (var9 != null) {
            var6.addProperty("headId", var9);
         }
      }
      if (kotlin.text.StringsKt.contains(var4, "leather_", true)) {
         String var10 = this.c(param1);
         if (var10 != null) {
            var6.addProperty("color", var10);
         }
      }
      return var6;
   }

   private final String c(ItemStack var1) {
      boolean var2 = IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();

      try {
         DyedItemColor var3 = var1.get(DataComponents.DYED_COLOR);

         DyedItemColor var10000;
         label24: {
            try {
               var10000 = var3;
               if (var2) {
                  break label24;
               }

               if (var3 == null) {
                  return null;
               }
            } catch (Exception var7) {
               throw (RuntimeException)a(var7);
            }

            var10000 = var3;
         }

         int var4 = var10000.rgb();
         short var9 = 4340;
         short var10001 = -1507;
         String var5 = "#%06X";
         Object[] var6 = new Object[]{var4 & 16777215};
         String var10 = String.format(var5, Arrays.copyOf(var6, var6.length));
         short var10002 = 4342;
         short var10003 = 11934;
         Intrinsics.checkNotNullExpressionValue(var10, "format(...)");
         return var10;
      } catch (Exception var8) {
         return null;
      }
   }

   private final String d(ItemStack param1) {
      try {
         var var3 = (net.minecraft.world.item.component.ResolvableProfile) param1.get(net.minecraft.core.component.DataComponents.PROFILE);
         if (var3 != null) {
            for (var var6 : var3.partialProfile().properties().values()) {
               if (kotlin.jvm.internal.Intrinsics.areEqual(var6.name(), "textures")) {
                  return var6.value();
               }
            }
         }
         var var4 = (net.minecraft.world.item.component.CustomData) param1.get(net.minecraft.core.component.DataComponents.CUSTOM_DATA);
         if (var4 == null) {
            return null;
         }
         return var4.copyTag()
               .getCompoundOrEmpty("SkullOwner")
               .getCompoundOrEmpty("Properties")
               .getCompoundOrEmpty("textures")
               .getStringOr("Value", "");
      } catch (java.lang.Exception var3) {
         return null;
      }
   }

    private final void c() {
       if (this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.getParentFile() != null) {
          this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.getParentFile().mkdirs();
       }
       try {
          String var2 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.toJson(this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl);
          Files.write(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.toPath(), var2.getBytes(StandardCharsets.UTF_8), new java.nio.file.OpenOption[0]);
       } catch (Exception var3) {
          me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§c[ItemParser] Failed to save: " + var3.getMessage());
       }
    }

   public final void d() {
      boolean var1 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.e();
      if (var1 && !lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
         me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a(this);
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = true;
      }
   }

    public final void e() {
       if (!this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
          me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§c[ItemParser] Not initialized!");
          return;
       }
       if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
          me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§c[ItemParser] Already running!");
          return;
       }
       this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
       this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = -1;
       this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = 1;
       this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 1;
       this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = false;
       this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.entrySet().clear();
       this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.f();
       this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.f();
       this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.f();
       this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = true;
    }

   public final void f() {
      boolean var1 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.e();
      if (var1 && IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = false;
      }

      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      if (var1) {
         LocalPlayer var3 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.player;
         if (var3 != null) {
            var3.closeContainer();
         }
      }

      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§e[ItemParser] Stopped");
   }

   public final boolean g() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final void h() {
      boolean var1 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.e();
      try {
         if (var1) {
            if (!IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.exists()) {
               return;
            }

            IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.delete();
         }

         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§a[ItemParser] Items cleared");
         lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.entrySet().clear();
      } catch (Exception var2) {
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§c[ItemParser] Failed to clear: " + var2.getMessage());
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[108];
      int var3 = 0;
      String var2 = "æ\u0010 ðÕÐç\u00801ÌjUéô\"W÷À\nðAÐgmss}\u0006òéçi\u0016\u0081\u0015\u0015²~\u0017\u009f\u0005I\u000eµÙ\u0094\u0016æÿ \rÕoçw12j\u008aé\u000f\"(à!\u0003\u001d±º\u000b¼vêzRmÿâÝ¾t\u0004ã×\u008d\u001f\u0005ç<¤#¼\u000bÔ¦ÞW\"R$Äë©Í*ÄUd\u009e]\u001dö9\u0013û.³a(3ÑÙï_qNGü»\u0004.\u001fèð\u0098/*¨,\u0094Ã\u0015¥\u009e¦Fù\u0004qóß\u009b\bl\u000e\u0010\u0095è\u001eÊæ\r¬TÈ\u000eÇ\u0099`\u0013ë3\f6\u0088\u0006iÞ\u007f@\u0010¡\u0005\u0014è\u0004úä\u0004\u009b\n\r\u0000\bP§~;\u007f32ó\bâs*¡Òw.¢\u000e¦òË\u0005¢ìÀy\u0005b\u0007À\u0003\u0006-¦n(ùÔñÇ¤5HêÅùæ \u0016±\u009e\u0019Â\u009b\u000fø\u0005\u0084â\u0016\u0001àãTøè\u000e\f\u0083¥?E'[\råh\u008d\u001cô±b@\u009dÆîB\u0010\u0094N^m\u0095²aò[\\\u001a¡>\u0010Yð\u0005ý2\bH\u008b\u0094%x\bØ$\u000e\u0097/ù\r$!ÝuôÑI¬'\u009d\u0012\u0018ßåb¦¦Å1Êl\n\u008f0ÕrNòÈ\u0005\u00001Mà;\u0005Äo\u000frç\u0005÷bKWF\u001f´@j<\u009cIÎ³\u0014ªÎ\u0099}m°q§»@\u009dGY\u0018\u0094«öû\u007fT\u0001\u0097\u000e\u009b~x'\u0014dÛÝ4ÄQ\u000e$É*\u008a$\u00advd\u0000Ñ\u009a÷\u008f²=òùAã\u009dô\u008cÇ=ðèi\u008dòHRÜ\u009b£\u0089\u001aæ¶\u008f\u009b\u0092»)\u008f*\b÷*1|H¨|\u0095\u0004$G¾²!\u0093z\u008e½\u0000y]µfj\u0080\u0081´n\u0089\u0015\u0080¹£\u0083ÙnqEzCÏÀ\bØîüä\t\u001a´HYËJöw\u009a\u0005\u000fX}\u0013\u008d+8àû(®Ë\u0088ãÜ ×Ø^EÔ|%ZÀÇ½\u0091\u0082aËuæ\u0083ÏõÈ\u0087T\u0099\fqç`Tê\u0000L¾'YÔ×h+Ã8âÊ\u0080\u0015Ü\u0006ÅßaG\u001aïcDLg\u0097ÔSÒ\u0099\r¸E\u008cÙ+\u0017êÀ\u009a¯\u0018\u0018>8\u009cÜß\u000f\u001f\u0083\u0082\u000e:{Ä\u00905\u0087ðó\u009cHQwû\u0013|þ\u0084(\u0096x(^áÜ\u001f\u0093\u009c¿Bã¿Ë \u001e¬þi-ükÂ÷\u0095\"þ\u0088{Op#»8X\u0016\u009b°ù=Bfd\u0016#i\u0005KÃ2\u0000i\u000e¸¨®A?\u00840µ:7í\u0001ã7\neg\u0014ô ûH´\u0099³-6Î:+\u0096«\u008fï<!ËèÝC¤½4\u0006\u0003«gU\u0003°X.\u0006\u0095i\u008a³5^PÓ^WM\r\u009e©\u0014\u0006Ìñ#)`Ùþê\u0011\u0000¸ÍËõµ\u001aè\\Â5£õ%\u009dØ\u0093¡\u0016\u001c4ÐÎ\u0014ß\\uÕÈ\f\r\u0016ª0NÈ\u0094û\u0010\u0088µF\u0005|>×cÒ\b\u008a\u0015\u001b¢~|^¤\"µ®J'\u0098*Nß\u0004'Ì(=[¸¦¦ih¨@H\u0083ó\u008c\u009a¼F\u009bð`|5\u0083\u0004«A¯à\u0005õåózì ª\u0092©fä\u0002ÁÚõ\u0087ò<úÙ@ç¹i\u0083Ç?\u0012\u0017ýJËÊÙÚìØó\"Ë\u0007\u0085\u0012a\u008cq\u000bã½0{¢1KóÉÏ¼\u0092\u0090rýF\u0088¶óRúxL}û¡\u0004¾T'U\u001b\u007fä\u0092(]'\u001e«á\u0097óZ\u0013\u008d\u009e¬n\u001b\u0099ÉÝ¬\u009e\u009d`4â\u0005À\u0083\u009e\u0097·\b\u0088\u008f[ñv\u0016_é\bg°#/\nÂ4Ø\u0007Ã2Ú¼-\u0007G\u0005Æ³\u0095\u0085\u0091\u000b0$ín\u0000\"\\\u00136\u0092\u0019\f/\nnÈrå=Ún¬zÂ\u0017¨¢\u001e¬Ã\u0018@¯oí ÄU±øÇ_\u008d¬\u0002\\\u0086%\u0006Ë\nÝ\u0012¹3.Ç\u000b\u0004\u0093Q¼w\r#}(c¡2+\u0092Ú\u0087.~Bê[Î\u0004j7¡\u009e\u0013øü5Û¤¢·Ôò;\u0082½pV_}&*\u000f¹Õæt\u0081\u0014ý^ó\u0007Ú¾D\u00037µ\u0082:õ.\u008b\u0096ê\u008bÂ\\K\u000eXøFvN\u008c¯ß\u000b3¡\u008dÞ\f4ÝÑ\u0006Ê\u001f\bÃ\u0086C\u008b³=âC\"ûò\u0083(¡Ëiãà PØ®EÊqæ\u001a»$¦\u0012\u0014m\u0019n\u00adH\u0092³\u0085\u0089\u0080?\u0019ì4atý@â\u0092\u0091\u008e~\u001dkýruûòPO\u00ad¯À)Á\"×B\u0006º\u0011\u0099\u007f©\"é\bñ¥`«ÔÄ\u0081+\u0084È\u008eS\nY¥\u0006¡Ì\f\u008aãhp\b\u0083@\u0006ÇW»\u009e;\tÝ;°¨Ôt\u0015°æ!\u0004Û|\u0089^ÿ\u0096e\u001fp¯ÂQ\u00065\t\u0002\u0005]\u0088::\u0080=\u0013Ôv_\u0099`×Ò¨\u0005\u009a/æ\u009dó\r\u000f¸êîKh\u0090\u0087\u009f7\u0082¶Y%ü\u001ccq½àê\u0086\u0090\f^Mo÷ò!àßOªÊ)y\u009fKÛ\u009f\f\u0081\u000b\u001b\u001c¢¯\u008eZz xdó~¯\u0001¨ºØ\u008bW½NéÖðk£Ññwce\u0096t\f'¹K@\bÖ\u001e[Q\u0097Ø#Õ9 êØ\u0011×\u0086¤ÏHF\u0080±d\u007f\u0005Æ\u0019\u008cÉ=î\u0082\u009f\u0005ub-\u0089^\u0010\u0005Wù^0ª\u0098<iÎ\u001dÆ½\u000b\u009cÙ\u000b\u009b\u008c_\f#þË\b\u00160r\u0005o\u007fé¥,\u000fAeÔ^K\u00054:K\u009b%¿\u0000©\u001f\tGÜ./\u0086\u0093ÖùM\u00071î\u0084'æt>\u001bô\u009eb!\u009dêîÇ\u0010$NHmW² ãXS\u001aÉ\rÛ}\u0096áð\u0005r\u0002'\u0086v\u001f'Û\u0018OÒ'\u0007~-\u0013é®\u0099\u008b,¥:5pþ\u008eñjç¤A{yM\u0012µ\u0003Y~q3\u0090Gî\u001a\f\u008dÜ+V¹\u0086ût!\u0091ý\u008e\u008fÆ\u0015tÉÁN¯\u001dåÔè|¨÷:ïà»i«ô\u0001\u0002«1\u008cp,\u008cô ¿\u00ad\r\u001c2ÞÂ\u0005\u00008 àUmú¤/<\u008e{å¾r\u008aÔ\u009cFß\u0004_Þô\u000f!4@\n\u00ad(\u0080V\u008b\u0093î_ÎnèôP÷\u008b¸öÊâKÉD4C3ÁN\u0004fc<³/AªÔ§K:4ÝKg% \u0000Z\u001f\u0082Gtõ¦/ÿ\"\u0085GÃü½È<ýYí\tùi\u008b{]¿-\u001bÙhÒY³\u0014®=\u000fo®g\u0013\u0010\u007f¿a£\u0086\u009aEv }\u0093A\u001c§\u0099\bÁÐöGD%TèF¹\u0096(\u0018°_9ú\u0093\u0017|äQ\u0012t$\n«Ï´Çä?ë±\u008eõ\u001f6\u0000:4\u0096H\u008f\u0093<®Ë\u0019Ý}¤t(ç\u0014jåz\u0018\u009f 4z\u0086\u0081\u009fF1;}\u009b\u009b¢½\t-ìyÑã\u009e\"Ì\u0089(\u008c¹\u0014zßÄ\u0001Lá¥æ^gr\túE)]¾\u0085~dLý\t\u0086í\u0081¥^»\"\u001c7\u007f\u0014>L\u009a\u0013\u009e¾\u009f\u001bW=õn\u001aç^\u000eTVÅ½1tü\u001b{s!/\u0082ë0æí OÕ'ç~1\u0013j®é\u008b\"¤ä%\u0019Ï$Ùk7O\u0001ª\t\reþq\u0001=Hý/æQÓKä\u0000æI\u009dh½\u00042îÛ9\u0006\u00adºE\u00889V\u0018á[À\u001dÉmd7A:d\u008b(/\u001a,ò¸ã\u0000_\u009fÌÝ\u001dDZt¹_ù¶¥\u001bh/ÁAf7\u0001W\u009dV6\u0087\u009b{\u0089¤áFÞ`\u0017\u00ad*¾½×:Âë?e*Õ\u0014\u0093Ð\u0083Z\u0005\f\u0013H¤§\féM6[Ý¥æV^=|ð";
      int var4 = "æ\u0010 ðÕÐç\u00801ÌjUéô\"W÷À\nðAÐgmss}\u0006òéçi\u0016\u0081\u0015\u0015²~\u0017\u009f\u0005I\u000eµÙ\u0094\u0016æÿ \rÕoçw12j\u008aé\u000f\"(à!\u0003\u001d±º\u000b¼vêzRmÿâÝ¾t\u0004ã×\u008d\u001f\u0005ç<¤#¼\u000bÔ¦ÞW\"R$Äë©Í*ÄUd\u009e]\u001dö9\u0013û.³a(3ÑÙï_qNGü»\u0004.\u001fèð\u0098/*¨,\u0094Ã\u0015¥\u009e¦Fù\u0004qóß\u009b\bl\u000e\u0010\u0095è\u001eÊæ\r¬TÈ\u000eÇ\u0099`\u0013ë3\f6\u0088\u0006iÞ\u007f@\u0010¡\u0005\u0014è\u0004úä\u0004\u009b\n\r\u0000\bP§~;\u007f32ó\bâs*¡Òw.¢\u000e¦òË\u0005¢ìÀy\u0005b\u0007À\u0003\u0006-¦n(ùÔñÇ¤5HêÅùæ \u0016±\u009e\u0019Â\u009b\u000fø\u0005\u0084â\u0016\u0001àãTøè\u000e\f\u0083¥?E'[\råh\u008d\u001cô±b@\u009dÆîB\u0010\u0094N^m\u0095²aò[\\\u001a¡>\u0010Yð\u0005ý2\bH\u008b\u0094%x\bØ$\u000e\u0097/ù\r$!ÝuôÑI¬'\u009d\u0012\u0018ßåb¦¦Å1Êl\n\u008f0ÕrNòÈ\u0005\u00001Mà;\u0005Äo\u000frç\u0005÷bKWF\u001f´@j<\u009cIÎ³\u0014ªÎ\u0099}m°q§»@\u009dGY\u0018\u0094«öû\u007fT\u0001\u0097\u000e\u009b~x'\u0014dÛÝ4ÄQ\u000e$É*\u008a$\u00advd\u0000Ñ\u009a÷\u008f²=òùAã\u009dô\u008cÇ=ðèi\u008dòHRÜ\u009b£\u0089\u001aæ¶\u008f\u009b\u0092»)\u008f*\b÷*1|H¨|\u0095\u0004$G¾²!\u0093z\u008e½\u0000y]µfj\u0080\u0081´n\u0089\u0015\u0080¹£\u0083ÙnqEzCÏÀ\bØîüä\t\u001a´HYËJöw\u009a\u0005\u000fX}\u0013\u008d+8àû(®Ë\u0088ãÜ ×Ø^EÔ|%ZÀÇ½\u0091\u0082aËuæ\u0083ÏõÈ\u0087T\u0099\fqç`Tê\u0000L¾'YÔ×h+Ã8âÊ\u0080\u0015Ü\u0006ÅßaG\u001aïcDLg\u0097ÔSÒ\u0099\r¸E\u008cÙ+\u0017êÀ\u009a¯\u0018\u0018>8\u009cÜß\u000f\u001f\u0083\u0082\u000e:{Ä\u00905\u0087ðó\u009cHQwû\u0013|þ\u0084(\u0096x(^áÜ\u001f\u0093\u009c¿Bã¿Ë \u001e¬þi-ükÂ÷\u0095\"þ\u0088{Op#»8X\u0016\u009b°ù=Bfd\u0016#i\u0005KÃ2\u0000i\u000e¸¨®A?\u00840µ:7í\u0001ã7\neg\u0014ô ûH´\u0099³-6Î:+\u0096«\u008fï<!ËèÝC¤½4\u0006\u0003«gU\u0003°X.\u0006\u0095i\u008a³5^PÓ^WM\r\u009e©\u0014\u0006Ìñ#)`Ùþê\u0011\u0000¸ÍËõµ\u001aè\\Â5£õ%\u009dØ\u0093¡\u0016\u001c4ÐÎ\u0014ß\\uÕÈ\f\r\u0016ª0NÈ\u0094û\u0010\u0088µF\u0005|>×cÒ\b\u008a\u0015\u001b¢~|^¤\"µ®J'\u0098*Nß\u0004'Ì(=[¸¦¦ih¨@H\u0083ó\u008c\u009a¼F\u009bð`|5\u0083\u0004«A¯à\u0005õåózì ª\u0092©fä\u0002ÁÚõ\u0087ò<úÙ@ç¹i\u0083Ç?\u0012\u0017ýJËÊÙÚìØó\"Ë\u0007\u0085\u0012a\u008cq\u000bã½0{¢1KóÉÏ¼\u0092\u0090rýF\u0088¶óRúxL}û¡\u0004¾T'U\u001b\u007fä\u0092(]'\u001e«á\u0097óZ\u0013\u008d\u009e¬n\u001b\u0099ÉÝ¬\u009e\u009d`4â\u0005À\u0083\u009e\u0097·\b\u0088\u008f[ñv\u0016_é\bg°#/\nÂ4Ø\u0007Ã2Ú¼-\u0007G\u0005Æ³\u0095\u0085\u0091\u000b0$ín\u0000\"\\\u00136\u0092\u0019\f/\nnÈrå=Ún¬zÂ\u0017¨¢\u001e¬Ã\u0018@¯oí ÄU±øÇ_\u008d¬\u0002\\\u0086%\u0006Ë\nÝ\u0012¹3.Ç\u000b\u0004\u0093Q¼w\r#}(c¡2+\u0092Ú\u0087.~Bê[Î\u0004j7¡\u009e\u0013øü5Û¤¢·Ôò;\u0082½pV_}&*\u000f¹Õæt\u0081\u0014ý^ó\u0007Ú¾D\u00037µ\u0082:õ.\u008b\u0096ê\u008bÂ\\K\u000eXøFvN\u008c¯ß\u000b3¡\u008dÞ\f4ÝÑ\u0006Ê\u001f\bÃ\u0086C\u008b³=âC\"ûò\u0083(¡Ëiãà PØ®EÊqæ\u001a»$¦\u0012\u0014m\u0019n\u00adH\u0092³\u0085\u0089\u0080?\u0019ì4atý@â\u0092\u0091\u008e~\u001dkýruûòPO\u00ad¯À)Á\"×B\u0006º\u0011\u0099\u007f©\"é\bñ¥`«ÔÄ\u0081+\u0084È\u008eS\nY¥\u0006¡Ì\f\u008aãhp\b\u0083@\u0006ÇW»\u009e;\tÝ;°¨Ôt\u0015°æ!\u0004Û|\u0089^ÿ\u0096e\u001fp¯ÂQ\u00065\t\u0002\u0005]\u0088::\u0080=\u0013Ôv_\u0099`×Ò¨\u0005\u009a/æ\u009dó\r\u000f¸êîKh\u0090\u0087\u009f7\u0082¶Y%ü\u001ccq½àê\u0086\u0090\f^Mo÷ò!àßOªÊ)y\u009fKÛ\u009f\f\u0081\u000b\u001b\u001c¢¯\u008eZz xdó~¯\u0001¨ºØ\u008bW½NéÖðk£Ññwce\u0096t\f'¹K@\bÖ\u001e[Q\u0097Ø#Õ9 êØ\u0011×\u0086¤ÏHF\u0080±d\u007f\u0005Æ\u0019\u008cÉ=î\u0082\u009f\u0005ub-\u0089^\u0010\u0005Wù^0ª\u0098<iÎ\u001dÆ½\u000b\u009cÙ\u000b\u009b\u008c_\f#þË\b\u00160r\u0005o\u007fé¥,\u000fAeÔ^K\u00054:K\u009b%¿\u0000©\u001f\tGÜ./\u0086\u0093ÖùM\u00071î\u0084'æt>\u001bô\u009eb!\u009dêîÇ\u0010$NHmW² ãXS\u001aÉ\rÛ}\u0096áð\u0005r\u0002'\u0086v\u001f'Û\u0018OÒ'\u0007~-\u0013é®\u0099\u008b,¥:5pþ\u008eñjç¤A{yM\u0012µ\u0003Y~q3\u0090Gî\u001a\f\u008dÜ+V¹\u0086ût!\u0091ý\u008e\u008fÆ\u0015tÉÁN¯\u001dåÔè|¨÷:ïà»i«ô\u0001\u0002«1\u008cp,\u008cô ¿\u00ad\r\u001c2ÞÂ\u0005\u00008 àUmú¤/<\u008e{å¾r\u008aÔ\u009cFß\u0004_Þô\u000f!4@\n\u00ad(\u0080V\u008b\u0093î_ÎnèôP÷\u008b¸öÊâKÉD4C3ÁN\u0004fc<³/AªÔ§K:4ÝKg% \u0000Z\u001f\u0082Gtõ¦/ÿ\"\u0085GÃü½È<ýYí\tùi\u008b{]¿-\u001bÙhÒY³\u0014®=\u000fo®g\u0013\u0010\u007f¿a£\u0086\u009aEv }\u0093A\u001c§\u0099\bÁÐöGD%TèF¹\u0096(\u0018°_9ú\u0093\u0017|äQ\u0012t$\n«Ï´Çä?ë±\u008eõ\u001f6\u0000:4\u0096H\u008f\u0093<®Ë\u0019Ý}¤t(ç\u0014jåz\u0018\u009f 4z\u0086\u0081\u009fF1;}\u009b\u009b¢½\t-ìyÑã\u009e\"Ì\u0089(\u008c¹\u0014zßÄ\u0001Lá¥æ^gr\túE)]¾\u0085~dLý\t\u0086í\u0081¥^»\"\u001c7\u007f\u0014>L\u009a\u0013\u009e¾\u009f\u001bW=õn\u001aç^\u000eTVÅ½1tü\u001b{s!/\u0082ë0æí OÕ'ç~1\u0013j®é\u008b\"¤ä%\u0019Ï$Ùk7O\u0001ª\t\reþq\u0001=Hý/æQÓKä\u0000æI\u009dh½\u00042îÛ9\u0006\u00adºE\u00889V\u0018á[À\u001dÉmd7A:d\u008b(/\u001a,ò¸ã\u0000_\u009fÌÝ\u001dDZt¹_ù¶¥\u001bh/ÁAf7\u0001W\u009dV6\u0087\u009b{\u0089¤áFÞ`\u0017\u00ad*¾½×:Âë?e*Õ\u0014\u0093Ð\u0083Z\u0005\f\u0013H¤§\féM6[Ý¥æV^=|ð"
         .length();
      char var1 = '(';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 22;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var25 = var10001.toCharArray();
               int var10004 = var25.length;
               int var6 = 0;
               byte var28 = var10000;
               var20 = var25;
               int var14 = var10004;
               byte var34;
               char[] var38;
               int var10006;
               if (var10004 <= 1) {
                  var38 = var25;
                  var34 = var10000;
                  var10006 = var6;
               } else {
                  var28 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var38 = var25;
                  var34 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var38[var10006] = (char)(var38[var10006] ^ var34 ^ switch (var6 % 7) {
                     case 0 -> 17;
                     case 1 -> 127;
                     case 2 -> 2;
                     case 3 -> 73;
                     case 4 -> 1;
                     case 5 -> 54;
                     default -> 62;
                  });
                  var6++;
                  if (var28 == 0) {
                     var10006 = var28;
                     var38 = var20;
                     var34 = var28;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var38 = var20;
                     var34 = var28;
                     var10006 = var6;
                  }
               }
            }

            String var30 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var30;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[108];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII();
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new GsonBuilder().setPrettyPrinting().create();
                     var10002 = 4268;
                     short var31 = 13514;
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new File("polinex/items.json");
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = -1;
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = 1;
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 1;
                     lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new JsonObject();
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var30;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "÷Ê|Õ \n'¥W\u0016ØpÁ.Ynõ\u0002EUÑô«ï8\u001c\bãO«\n*¤Å\"ö\u009c¿÷Í ";
                  var4 = "÷Ê|Õ \n'¥W\u0016ØpÁ.Ynõ\u0002EUÑô«ï8\u001c\bãO«\n*¤Å\"ö\u009c¿÷Í ".length();
                  var1 = 30;
                  var8 = -1;
            }

            var10000 = 102;
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
      int var2 = (var0 ^ 4281) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 113;
            case 1 -> 43;
            case 2 -> 150;
            case 3 -> 181;
            case 4 -> 198;
            case 5 -> 110;
            case 6 -> 249;
            case 7 -> 25;
            case 8 -> 233;
            case 9 -> 88;
            case 10 -> 106;
            case 11 -> 187;
            case 12 -> 205;
            case 13 -> 132;
            case 14 -> 71;
            case 15 -> 80;
            case 16 -> 130;
            case 17 -> 191;
            case 18 -> 51;
            case 19 -> 89;
            case 20 -> 189;
            case 21 -> 86;
            case 22 -> 153;
            case 23 -> 175;
            case 24 -> 163;
            case 25 -> 69;
            case 26 -> 158;
            case 27 -> 176;
            case 28 -> 81;
            case 29 -> 38;
            case 30 -> 182;
            case 31 -> 91;
            case 32 -> 32;
            case 33 -> 241;
            case 34 -> 139;
            case 35 -> 215;
            case 36 -> 85;
            case 37 -> 167;
            case 38 -> 15;
            case 39 -> 94;
            case 40 -> 16;
            case 41 -> 236;
            case 42 -> 103;
            case 43 -> 55;
            case 44 -> 8;
            case 45 -> 18;
            case 46 -> 108;
            case 47 -> 101;
            case 48 -> 119;
            case 49 -> 157;
            case 50 -> 73;
            case 51 -> 56;
            case 52 -> 195;
            case 53 -> 138;
            case 54 -> 57;
            case 55 -> 40;
            case 56 -> 111;
            case 57 -> 179;
            case 58 -> 254;
            case 59 -> 239;
            case 60 -> 4;
            case 61 -> 217;
            case 62 -> 244;
            case 63 -> 196;
            case 64 -> 70;
            case 65 -> 211;
            case 66 -> 109;
            case 67 -> 173;
            case 68 -> 121;
            case 69 -> 177;
            case 70 -> 188;
            case 71 -> 147;
            case 72 -> 242;
            case 73 -> 222;
            case 74 -> 149;
            case 75 -> 206;
            case 76 -> 142;
            case 77 -> 238;
            case 78 -> 104;
            case 79 -> 134;
            case 80 -> 27;
            case 81 -> 26;
            case 82 -> 79;
            case 83 -> 50;
            case 84 -> 87;
            case 85 -> 114;
            case 86 -> 201;
            case 87 -> 2;
            case 88 -> 166;
            case 89 -> 31;
            case 90 -> 53;
            case 91 -> 154;
            case 92 -> 66;
            case 93 -> 209;
            case 94 -> 100;
            case 95 -> 180;
            case 96 -> 78;
            case 97 -> 192;
            case 98 -> 143;
            case 99 -> 247;
            case 100 -> 64;
            case 101 -> 105;
            case 102 -> 212;
            case 103 -> 133;
            case 104 -> 216;
            case 105 -> 145;
            case 106 -> 9;
            case 107 -> 49;
            case 108 -> 193;
            case 109 -> 22;
            case 110 -> 58;
            case 111 -> 45;
            case 112 -> 20;
            case 113 -> 118;
            case 114 -> 204;
            case 115 -> 203;
            case 116 -> 235;
            case 117 -> 21;
            case 118 -> 155;
            case 119 -> 185;
            case 120 -> 125;
            case 121 -> 28;
            case 122 -> 52;
            case 123 -> 232;
            case 124 -> 6;
            case 125 -> 131;
            case 126 -> 171;
            case 127 -> 84;
            case 128 -> 248;
            case 129 -> 237;
            case 130 -> 90;
            case 131 -> 184;
            case 132 -> 107;
            case 133 -> 234;
            case 134 -> 253;
            case 135 -> 227;
            case 136 -> 200;
            case 137 -> 34;
            case 138 -> 33;
            case 139 -> 255;
            case 140 -> 165;
            case 141 -> 124;
            case 142 -> 42;
            case 143 -> 246;
            case 144 -> 243;
            case 145 -> 75;
            case 146 -> 199;
            case 147 -> 0;
            case 148 -> 54;
            case 149 -> 97;
            case 150 -> 127;
            case 151 -> 202;
            case 152 -> 160;
            case 153 -> 39;
            case 154 -> 224;
            case 155 -> 218;
            case 156 -> 164;
            case 157 -> 128;
            case 158 -> 214;
            case 159 -> 62;
            case 160 -> 46;
            case 161 -> 67;
            case 162 -> 226;
            case 163 -> 178;
            case 164 -> 136;
            case 165 -> 72;
            case 166 -> 5;
            case 167 -> 231;
            case 168 -> 115;
            case 169 -> 23;
            case 170 -> 159;
            case 171 -> 172;
            case 172 -> 98;
            case 173 -> 162;
            case 174 -> 37;
            case 175 -> 140;
            case 176 -> 141;
            case 177 -> 47;
            case 178 -> 129;
            case 179 -> 250;
            case 180 -> 208;
            case 181 -> 220;
            case 182 -> 197;
            case 183 -> 83;
            case 184 -> 245;
            case 185 -> 65;
            case 186 -> 122;
            case 187 -> 24;
            case 188 -> 144;
            case 189 -> 251;
            case 190 -> 213;
            case 191 -> 44;
            case 192 -> 152;
            case 193 -> 229;
            case 194 -> 137;
            case 195 -> 183;
            case 196 -> 221;
            case 197 -> 68;
            case 198 -> 230;
            case 199 -> 228;
            case 200 -> 169;
            case 201 -> 82;
            case 202 -> 117;
            case 203 -> 151;
            case 204 -> 14;
            case 205 -> 76;
            case 206 -> 194;
            case 207 -> 13;
            case 208 -> 61;
            case 209 -> 19;
            case 210 -> 190;
            case 211 -> 207;
            case 212 -> 174;
            case 213 -> 210;
            case 214 -> 148;
            case 215 -> 102;
            case 216 -> 112;
            case 217 -> 161;
            case 218 -> 252;
            case 219 -> 60;
            case 220 -> 77;
            case 221 -> 156;
            case 222 -> 186;
            case 223 -> 126;
            case 224 -> 123;
            case 225 -> 3;
            case 226 -> 29;
            case 227 -> 30;
            case 228 -> 116;
            case 229 -> 48;
            case 230 -> 63;
            case 231 -> 59;
            case 232 -> 93;
            case 233 -> 36;
            case 234 -> 146;
            case 235 -> 225;
            case 236 -> 92;
            case 237 -> 168;
            case 238 -> 11;
            case 239 -> 12;
            case 240 -> 17;
            case 241 -> 120;
            case 242 -> 74;
            case 243 -> 135;
            case 244 -> 35;
            case 245 -> 95;
            case 246 -> 41;
            case 247 -> 99;
            case 248 -> 219;
            case 249 -> 1;
            case 250 -> 96;
            case 251 -> 223;
            case 252 -> 7;
            case 253 -> 170;
            case 254 -> 240;
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

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   public static enum IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
      lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
      lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
      lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl,
      lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll,
      IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
      llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI,
      IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl,
      IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl,
      IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll,
      IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl,
      llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI,
      IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll,
      lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll,
      llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl,
      lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   

      private static boolean IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;

      public static IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] a() {
         return (IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[])IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll.clone();
      }

      public static IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         String var0
      ) {
         return Enum.valueOf(
            IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> b() {
         return IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[]{IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll, IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII, llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI, lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI, lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl, lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll, IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI, IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl, IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl, IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll, IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl, llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI, IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll, lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll, llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl, lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll};
   private static final EnumEntries<IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = kotlin.enums.EnumEntriesKt.enumEntries(IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll);

      public static void b(boolean var0) {
         IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = var0;
      }

      public static boolean d() {
         return IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
      }

      public static boolean e() {
         boolean var0 = d();
         return !var0;
      }
   

  // PX-FIX synth restored from jar bytecode

  // PX-FIX synth restored from jar bytecode: anewarray + getstatic*/aastore
  public static final me.octo.client.IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] c() { return new me.octo.client.IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] { IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll, IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII, llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI, lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI, lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl, lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll, IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI, IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl, IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl, IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll, IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl, llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI, IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll, lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll, llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl, lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll }; }
}


  // PX-FIX synth restored from jar bytecode

  // PX-FIX synth restored from jar bytecode: Kotlin default-argument bridge
  public void a(me.octo.client.IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII p0, java.util.List p1, java.lang.String p2, boolean p3, int p4, java.lang.Object p5) {
    p0.a(p1, p2, p3);
  }
}
