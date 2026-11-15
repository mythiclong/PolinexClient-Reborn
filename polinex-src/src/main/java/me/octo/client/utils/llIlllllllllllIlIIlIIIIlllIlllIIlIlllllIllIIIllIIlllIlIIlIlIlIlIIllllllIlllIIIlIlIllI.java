package me.octo.client.utils;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.world.inventory.Slot;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import kotlin.io.CloseableKt;
import java.io.File;
import me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
import me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.client.player.LocalPlayer;
import kotlin.Unit;
import me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;

public final class llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI
   extends lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   public static llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11, Object p12, Object p13, Object p14, Object p15, Object p16, Object p17, Object p18, Object p19, Object p20, Object p21, Object p22, Object p23, Object p24, Object p25, Object p26, Object p27, Object p28, Object p29, Object p30, Object p31, Object p32, Object p33, Object p34, Object p35, Object p36, Object p37, Object p38, Object p39, Object p40, Object p41, Object p42, Object p43, Object p44, Object p45, Object p46, Object p47, Object p48) { return null; } // PX-FIX ovld

   @NotNull
   public static llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static String IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private static Gson lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private static me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private static llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private static llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private static lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private static List<Integer> lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] c;
   private static String[] d;

   private llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI() {
   }

   @NotNull
   public final String g() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII param1) {
      Object llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll = null; // PX-FIX
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c ()[I
      // 03: aload 1
      // 04: sipush -4851
      // 07: sipush -31932
      // 0a: pop2
      // 0b: ldc "event"
      // 0d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 10: astore 2
      // 11: invokestatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m ()Z
      // 14: aload 2
      // 15: ifnull 2e
      // 18: ifne 23
      // 1b: goto 22
      // 1e: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: return
      // 23: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll;
      // 26: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl [I
      // 29: swap
      // 2a: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.ordinal ()I
      // 2d: iaload
      // 2e: bipush 1
      // 2f: aload 2
      // 30: ifnull 5b
      // 33: if_icmpne bf
      // 36: goto 3d
      // 39: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 40: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.K ()I
      // 43: aload 2
      // 44: ifnull 9d
      // 47: goto 4e
      // 4a: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d: athrow
      // 4e: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 51: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()I
      // 54: goto 5b
      // 57: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a: athrow
      // 5b: if_icmpeq 7c
      // 5e: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 61: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 64: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()I
      // 67: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.b (I)Z
      // 6a: pop
      // 6b: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 6e: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 71: aload 2
      // 72: ifnonnull bf
      // 75: goto 7c
      // 78: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7b: athrow
      // 7c: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 7f: aload 2
      // 80: ifnull b6
      // 83: goto 8a
      // 86: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 89: athrow
      // 8a: sipush 500
      // 8d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 90: checkcast java/lang/Number
      // 93: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 96: goto 9d
      // 99: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9c: athrow
      // 9d: ifeq bf
      // a0: sipush -4806
      // a3: sipush -6152
      // a6: pop2
      // a7: ldc "/stats"
      // a9: invokestatic me/octo/client/utils/player/PXEvMid.a (Ljava/lang/Object;)V
      // ac: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // af: goto b6
      // b2: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b5: athrow
      // b6: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // b9: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll;
      // bc: putstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll;
      // bf: return
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI param1) {
      Object llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll = null; // PX-FIX
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c ()[I
      // 003: aload 1
      // 004: sipush -4856
      // 007: sipush -7363
      // 00a: pop2
      // 00b: ldc "event"
      // 00d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 010: astore 2
      // 011: invokestatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m ()Z
      // 014: aload 2
      // 015: ifnull 038
      // 018: ifeq 03b
      // 01b: goto 022
      // 01e: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 021: athrow
      // 022: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 025: sipush 250
      // 028: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 02b: checkcast java/lang/Number
      // 02e: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 031: goto 038
      // 034: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 037: athrow
      // 038: ifne 03c
      // 03b: return
      // 03c: aload 1
      // 03d: invokevirtual me/octo/client/events/impl/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.k ()Ljava/lang/String;
      // 040: dup
      // 041: aload 2
      // 042: ifnull 05e
      // 045: ifnull 061
      // 048: goto 04f
      // 04b: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04e: athrow
      // 04f: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // 052: swap
      // 053: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // 056: dup
      // 057: goto 05e
      // 05a: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05d: athrow
      // 05e: ifnonnull 067
      // 061: pop
      // 062: return
      // 063: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 066: athrow
      // 067: astore 3
      // 068: aload 2
      // 069: ifnull 083
      // 06c: aload 1
      // 06d: invokevirtual me/octo/client/events/impl/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.m ()Ljava/util/List;
      // 070: dup
      // 071: ifnonnull 084
      // 074: goto 07b
      // 077: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07a: athrow
      // 07b: pop
      // 07c: goto 083
      // 07f: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 082: athrow
      // 083: return
      // 084: astore 4
      // 086: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll;
      // 089: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl [I
      // 08c: swap
      // 08d: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.ordinal ()I
      // 090: iaload
      // 091: aload 2
      // 092: ifnull 0d7
      // 095: tableswitch 3065 2 5 35 969 1063 1941
      // 0b4: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b7: athrow
      // 0b8: aload 3
      // 0b9: aload 2
      // 0ba: ifnull 0e4
      // 0bd: goto 0c4
      // 0c0: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c3: athrow
      // 0c4: sipush -4847
      // 0c7: sipush 7656
      // 0ca: pop2
      // 0cb: ldc "Stats & Equipment"
      // 0cd: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 0d0: goto 0d7
      // 0d3: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d6: athrow
      // 0d7: ifne 0db
      // 0da: return
      // 0db: aload 4
      // 0dd: bipush 15
      // 0df: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0e4: checkcast net/minecraft/world/inventory/Slot
      // 0e7: invokevirtual net/minecraft/world/inventory/Slot.getItem ()Lnet/minecraft/world/item/ItemStack;
      // 0ea: dup
      // 0eb: ifnonnull 0f4
      // 0ee: pop
      // 0ef: return
      // 0f0: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f3: athrow
      // 0f4: astore 5
      // 0f6: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // 0f9: aload 5
      // 0fb: invokevirtual net/minecraft/world/item/ItemStack.getHoverName ()Lnet/minecraft/network/chat/Component;
      // 0fe: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 103: dup
      // 104: sipush -4821
      // 107: sipush -27614
      // 10a: pop2
      // 10b: ldc "getString(...)"
      // 10d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 110: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // 113: sipush -4854
      // 116: sipush -6876
      // 119: pop2
      // 11a: ldc "Mining Stats"
      // 11c: pop2
      // 11d: bipush 1
      // 11e: nop
      // 11f: ifne 127
      // 122: return
      // 123: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 126: athrow
      // 127: new kotlin/text/Regex
      // 12a: dup
      // 12b: sipush -4802
      // 12e: sipush 3599
      // 131: pop2
      // 132: ldc "\\d{1,3}(,\\d{3})*|\\d+"
      // 134: invokespecial kotlin/text/Regex.<init> (Ljava/lang/String;)V
      // 137: astore 6
      // 139: getstatic me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 13c: aload 5
      // 13e: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.d (Lnet/minecraft/world/item/ItemStack;)Ljava/util/List;
      // 141: checkcast java/lang/Iterable
      // 144: astore 7
      // 146: nop
      // 147: bipush 0
      // 148: istore 8
      // 14a: aload 7
      // 14c: astore 9
      // 14e: new java/util/ArrayList
      // 151: dup
      // 152: aload 7
      // 154: bipush 10
      // 156: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
      // 159: invokespecial java/util/ArrayList.<init> (I)V
      // 15c: checkcast java/util/Collection
      // 15f: astore 10
      // 161: bipush 0
      // 162: istore 11
      // 164: aload 9
      // 166: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 16b: astore 12
      // 16d: aload 12
      // 16f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 174: ifeq 1c0
      // 177: aload 12
      // 179: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 17e: astore 13
      // 180: aload 10
      // 182: aload 13
      // 184: checkcast net/minecraft/network/chat/Component
      // 187: astore 14
      // 189: astore 22
      // 18b: bipush 0
      // 18c: istore 15
      // 18e: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // 191: aload 14
      // 193: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 198: dup
      // 199: sipush -4855
      // 19c: sipush 16085
      // 19f: pop2
      // 1a0: ldc "getString(...)"
      // 1a2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1a5: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // 1a8: aload 22
      // 1aa: swap
      // 1ab: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 1b0: pop
      // 1b1: aload 2
      // 1b2: ifnull 1cf
      // 1b5: aload 2
      // 1b6: ifnonnull 16d
      // 1b9: goto 1c0
      // 1bc: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1bf: athrow
      // 1c0: aload 10
      // 1c2: checkcast java/util/List
      // 1c5: nop
      // 1c6: checkcast java/lang/Iterable
      // 1c9: astore 7
      // 1cb: nop
      // 1cc: bipush 0
      // 1cd: istore 8
      // 1cf: aload 7
      // 1d1: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 1d6: astore 9
      // 1d8: aload 9
      // 1da: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1df: ifeq 27d
      // 1e2: aload 9
      // 1e4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1e9: astore 10
      // 1eb: aload 10
      // 1ed: checkcast java/lang/String
      // 1f0: astore 11
      // 1f2: bipush 0
      // 1f3: istore 12
      // 1f5: aload 2
      // 1f6: ifnull 279
      // 1f9: aload 11
      // 1fb: checkcast java/lang/CharSequence
      // 1fe: aload 2
      // 1ff: ifnull 292
      // 202: goto 209
      // 205: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 208: athrow
      // 209: sipush -4861
      // 20c: sipush -25468
      // 20f: pop2
      // 210: ldc "Mining Speed"
      // 212: checkcast java/lang/CharSequence
      // 215: bipush 0
      // 216: bipush 2
      // 217: aconst_null
      // 218: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 21b: ifeq 277
      // 21e: goto 225
      // 221: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 224: athrow
      // 225: aload 6
      // 227: aload 11
      // 229: checkcast java/lang/CharSequence
      // 22c: bipush 0
      // 22d: bipush 2
      // 22e: aconst_null
      // 22f: invokestatic kotlin/text/Regex.find$default (Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;
      // 232: dup
      // 233: ifnull 275
      // 236: goto 23d
      // 239: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23c: athrow
      // 23d: invokeinterface kotlin/text/MatchResult.getValue ()Ljava/lang/String; 1
      // 242: dup
      // 243: ifnull 275
      // 246: goto 24d
      // 249: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24c: athrow
      // 24d: astore 13
      // 24f: bipush 0
      // 250: istore 14
      // 252: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 255: aload 13
      // 257: ldc_w ","
      // 25a: ldc_w ""
      // 25d: bipush 0
      // 25e: bipush 4
      // 25f: aconst_null
      // 260: invokestatic kotlin/text/StringsKt.replace$default (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
      // 263: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 266: i2d
      // 267: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
      // 26a: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.A ()D
      // 26d: dsub
      // 26e: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (D)V
      // 271: nop
      // 272: goto 277
      // 275: pop
      // 276: nop
      // 277: nop
      // 278: nop
      // 279: aload 2
      // 27a: ifnonnull 1d8
      // 27d: nop
      // 27e: aload 2
      // 27f: ifnull 2a4
      // 282: aload 4
      // 284: bipush 25
      // 286: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 28b: goto 292
      // 28e: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 291: athrow
      // 292: checkcast net/minecraft/world/inventory/Slot
      // 295: invokevirtual net/minecraft/world/inventory/Slot.getItem ()Lnet/minecraft/world/item/ItemStack;
      // 298: dup
      // 299: ifnonnull 2a5
      // 29c: pop
      // 29d: goto 2a4
      // 2a0: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a3: athrow
      // 2a4: return
      // 2a5: astore 7
      // 2a7: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // 2aa: aload 7
      // 2ac: invokevirtual net/minecraft/world/item/ItemStack.getHoverName ()Lnet/minecraft/network/chat/Component;
      // 2af: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 2b4: dup
      // 2b5: sipush -4855
      // 2b8: sipush 16085
      // 2bb: pop2
      // 2bc: ldc "getString(...)"
      // 2be: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 2c1: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // 2c4: sipush -4863
      // 2c7: sipush -1310
      // 2ca: pop2
      // 2cb: ldc_w "Miscellaneous Stats"
      // 2ce: pop2
      // 2cf: bipush 1
      // 2d0: nop
      // 2d1: ifne 2d9
      // 2d4: return
      // 2d5: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d8: athrow
      // 2d9: new kotlin/text/Regex
      // 2dc: dup
      // 2dd: sipush -4815
      // 2e0: sipush -13572
      // 2e3: pop2
      // 2e4: ldc_w "\\b\\d{1,3}(?:\\.\\d)?\\b"
      // 2e7: invokespecial kotlin/text/Regex.<init> (Ljava/lang/String;)V
      // 2ea: astore 8
      // 2ec: getstatic me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 2ef: aload 7
      // 2f1: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.d (Lnet/minecraft/world/item/ItemStack;)Ljava/util/List;
      // 2f4: checkcast java/lang/Iterable
      // 2f7: astore 9
      // 2f9: nop
      // 2fa: bipush 0
      // 2fb: istore 10
      // 2fd: aload 9
      // 2ff: astore 11
      // 301: new java/util/ArrayList
      // 304: dup
      // 305: aload 9
      // 307: bipush 10
      // 309: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
      // 30c: invokespecial java/util/ArrayList.<init> (I)V
      // 30f: checkcast java/util/Collection
      // 312: astore 12
      // 314: bipush 0
      // 315: istore 13
      // 317: aload 11
      // 319: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 31e: astore 14
      // 320: aload 14
      // 322: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 327: ifeq 373
      // 32a: aload 14
      // 32c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 331: astore 15
      // 333: aload 12
      // 335: aload 15
      // 337: checkcast net/minecraft/network/chat/Component
      // 33a: astore 16
      // 33c: astore 22
      // 33e: bipush 0
      // 33f: istore 17
      // 341: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // 344: aload 16
      // 346: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 34b: dup
      // 34c: sipush -4855
      // 34f: sipush 16085
      // 352: pop2
      // 353: ldc "getString(...)"
      // 355: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 358: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // 35b: aload 22
      // 35d: swap
      // 35e: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 363: pop
      // 364: aload 2
      // 365: ifnull 382
      // 368: aload 2
      // 369: ifnonnull 320
      // 36c: goto 373
      // 36f: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 372: athrow
      // 373: aload 12
      // 375: checkcast java/util/List
      // 378: nop
      // 379: checkcast java/lang/Iterable
      // 37c: astore 9
      // 37e: nop
      // 37f: bipush 0
      // 380: istore 10
      // 382: aload 9
      // 384: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 389: astore 11
      // 38b: aload 11
      // 38d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 392: ifeq 440
      // 395: aload 11
      // 397: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 39c: astore 12
      // 39e: aload 12
      // 3a0: checkcast java/lang/String
      // 3a3: astore 13
      // 3a5: bipush 0
      // 3a6: istore 14
      // 3a8: aload 2
      // 3a9: ifnull 43c
      // 3ac: aload 13
      // 3ae: aload 2
      // 3af: ifnull 44b
      // 3b2: goto 3b9
      // 3b5: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b8: athrow
      // 3b9: checkcast java/lang/CharSequence
      // 3bc: sipush -4813
      // 3bf: sipush 8910
      // 3c2: pop2
      // 3c3: ldc_w "Cold Resistance"
      // 3c6: checkcast java/lang/CharSequence
      // 3c9: bipush 0
      // 3ca: bipush 2
      // 3cb: aconst_null
      // 3cc: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 3cf: ifeq 43a
      // 3d2: goto 3d9
      // 3d5: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d8: athrow
      // 3d9: aload 8
      // 3db: aload 13
      // 3dd: checkcast java/lang/CharSequence
      // 3e0: bipush 0
      // 3e1: bipush 2
      // 3e2: aconst_null
      // 3e3: invokestatic kotlin/text/Regex.find$default (Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;
      // 3e6: dup
      // 3e7: ifnull 438
      // 3ea: goto 3f1
      // 3ed: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f0: athrow
      // 3f1: invokeinterface kotlin/text/MatchResult.getValue ()Ljava/lang/String; 1
      // 3f6: dup
      // 3f7: ifnull 438
      // 3fa: goto 401
      // 3fd: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 400: athrow
      // 401: invokestatic kotlin/text/StringsKt.toDoubleOrNull (Ljava/lang/String;)Ljava/lang/Double;
      // 404: aload 2
      // 405: ifnull 424
      // 408: goto 40f
      // 40b: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40e: athrow
      // 40f: dup
      // 410: ifnull 438
      // 413: goto 41a
      // 416: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 419: athrow
      // 41a: checkcast java/lang/Number
      // 41d: goto 424
      // 420: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 423: athrow
      // 424: invokevirtual java/lang/Number.doubleValue ()D
      // 427: dstore 15
      // 429: bipush 0
      // 42a: istore 17
      // 42c: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 42f: dload 15
      // 431: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e (D)V
      // 434: nop
      // 435: goto 43a
      // 438: pop
      // 439: nop
      // 43a: nop
      // 43b: nop
      // 43c: aload 2
      // 43d: ifnonnull 38b
      // 440: nop
      // 441: sipush -4830
      // 444: sipush 29988
      // 447: pop2
      // 448: ldc_w "/hotm"
      // 44b: invokestatic me/octo/client/utils/player/PXEvMid.a (Ljava/lang/Object;)V
      // 44e: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 451: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 454: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll;
      // 457: putstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll;
      // 45a: aload 2
      // 45b: ifnonnull c8e
      // 45e: aload 4
      // 460: bipush 4
      // 461: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 466: checkcast net/minecraft/world/inventory/Slot
      // 469: invokevirtual net/minecraft/world/inventory/Slot.getItem ()Lnet/minecraft/world/item/ItemStack;
      // 46c: dup
      // 46d: ifnull 4aa
      // 470: goto 477
      // 473: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 476: athrow
      // 477: astore 8
      // 479: bipush 0
      // 47a: istore 9
      // 47c: aload 2
      // 47d: ifnull 4a7
      // 480: aload 8
      // 482: getstatic net/minecraft/world/item/Items.BEDROCK Lnet/minecraft/world/item/Item;
      // 485: invokevirtual net/minecraft/world/item/ItemStack.is (Ljava/lang/Object;)Z
      // 488: ifne 4a5
      // 48b: goto 492
      // 48e: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 491: athrow
      // 492: getstatic me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 495: bipush 53
      // 497: bipush 1
      // 498: getstatic net/minecraft/world/inventory/ContainerInput.PICKUP Lnet/minecraft/world/inventory/ContainerInput;
      // 49b: invokevirtual me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a (IILnet/minecraft/world/inventory/ContainerInput;)V
      // 49e: goto 4a5
      // 4a1: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a4: athrow
      // 4a5: nop
      // 4a6: nop
      // 4a7: goto 4ac
      // 4aa: pop
      // 4ab: return
      // 4ac: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 4af: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 4b2: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll;
      // 4b5: putstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll;
      // 4b8: aload 2
      // 4b9: ifnonnull c8e
      // 4bc: aload 3
      // 4bd: sipush -4803
      // 4c0: sipush -15828
      // 4c3: pop2
      // 4c4: ldc_w "Heart of the Mountain"
      // 4c7: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 4ca: ifne 4d9
      // 4cd: goto 4d4
      // 4d0: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d3: athrow
      // 4d4: return
      // 4d5: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d8: athrow
      // 4d9: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Ljava/util/List;
      // 4dc: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 4e1: astore 5
      // 4e3: aload 5
      // 4e5: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4ea: ifeq 583
      // 4ed: aload 5
      // 4ef: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4f4: checkcast java/lang/Number
      // 4f7: invokevirtual java/lang/Number.intValue ()I
      // 4fa: istore 6
      // 4fc: aload 2
      // 4fd: ifnull 526
      // 500: aload 4
      // 502: iload 6
      // 504: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 509: checkcast net/minecraft/world/inventory/Slot
      // 50c: invokevirtual net/minecraft/world/inventory/Slot.getItem ()Lnet/minecraft/world/item/ItemStack;
      // 50f: dup
      // 510: aload 2
      // 511: ifnull 592
      // 514: goto 51b
      // 517: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 51a: athrow
      // 51b: ifnonnull 527
      // 51e: goto 525
      // 521: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 524: athrow
      // 525: pop
      // 526: return
      // 527: astore 7
      // 529: aload 7
      // 52b: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 52e: getstatic net/minecraft/world/item/Items.GREEN_STAINED_GLASS_PANE Lnet/minecraft/world/item/Item;
      // 531: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 534: aload 2
      // 535: ifnull 575
      // 538: ifeq 4e3
      // 53b: goto 542
      // 53e: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 541: athrow
      // 542: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // 545: aload 7
      // 547: invokevirtual net/minecraft/world/item/ItemStack.getHoverName ()Lnet/minecraft/network/chat/Component;
      // 54a: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 54f: dup
      // 550: sipush -4855
      // 553: sipush 16085
      // 556: pop2
      // 557: ldc "getString(...)"
      // 559: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 55c: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // 55f: sipush -4826
      // 562: sipush 31859
      // 565: pop2
      // 566: ldc_w "Tier "
      // 569: ldc_w ""
      // 56c: bipush 0
      // 56d: bipush 4
      // 56e: aconst_null
      // 56f: invokestatic kotlin/text/StringsKt.replace$default (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
      // 572: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 575: istore 9
      // 577: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 57a: iload 9
      // 57c: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (I)V
      // 57f: aload 2
      // 580: ifnonnull 4e3
      // 583: aload 4
      // 585: bipush 4
      // 586: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 58b: checkcast net/minecraft/world/inventory/Slot
      // 58e: invokevirtual net/minecraft/world/inventory/Slot.getItem ()Lnet/minecraft/world/item/ItemStack;
      // 591: dup
      // 592: ifnull 5c0
      // 595: astore 8
      // 597: bipush 0
      // 598: istore 9
      // 59a: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 59d: aload 8
      // 59f: getstatic net/minecraft/world/item/Items.BEDROCK Lnet/minecraft/world/item/Item;
      // 5a2: invokevirtual net/minecraft/world/item/ItemStack.is (Ljava/lang/Object;)Z
      // 5a5: aload 2
      // 5a6: ifnull 5b4
      // 5a9: ifne 5b7
      // 5ac: goto 5b3
      // 5af: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b2: athrow
      // 5b3: bipush 1
      // 5b4: goto 5b8
      // 5b7: bipush 0
      // 5b8: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Z)V
      // 5bb: nop
      // 5bc: nop
      // 5bd: goto 5c2
      // 5c0: pop
      // 5c1: return
      // 5c2: aload 0
      // 5c3: bipush 29
      // 5c5: aload 4
      // 5c7: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 5ca: invokespecial me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (ILjava/util/List;Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)V
      // 5cd: aload 2
      // 5ce: ifnull 62b
      // 5d1: aload 4
      // 5d3: bipush 33
      // 5d5: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 5da: checkcast net/minecraft/world/inventory/Slot
      // 5dd: invokevirtual net/minecraft/world/inventory/Slot.getItem ()Lnet/minecraft/world/item/ItemStack;
      // 5e0: dup
      // 5e1: ifnull 62a
      // 5e4: goto 5eb
      // 5e7: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5ea: athrow
      // 5eb: astore 8
      // 5ed: bipush 0
      // 5ee: istore 9
      // 5f0: aload 2
      // 5f1: ifnull 627
      // 5f4: aload 8
      // 5f6: getstatic net/minecraft/world/item/Items.EMERALD_BLOCK Lnet/minecraft/world/item/Item;
      // 5f9: invokevirtual net/minecraft/world/item/ItemStack.is (Ljava/lang/Object;)Z
      // 5fc: ifeq 625
      // 5ff: goto 606
      // 602: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 605: athrow
      // 606: aload 8
      // 608: invokevirtual net/minecraft/world/item/ItemStack.hasFoil ()Z
      // 60b: ifeq 625
      // 60e: goto 615
      // 611: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 614: athrow
      // 615: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 618: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 61b: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)V
      // 61e: goto 625
      // 621: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 624: athrow
      // 625: nop
      // 626: nop
      // 627: goto 62c
      // 62a: pop
      // 62b: return
      // 62c: aload 4
      // 62e: bipush 22
      // 630: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 635: checkcast net/minecraft/world/inventory/Slot
      // 638: invokevirtual net/minecraft/world/inventory/Slot.getItem ()Lnet/minecraft/world/item/ItemStack;
      // 63b: dup
      // 63c: ifnull 71b
      // 63f: astore 8
      // 641: bipush 0
      // 642: istore 9
      // 644: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // 647: aload 8
      // 649: invokevirtual net/minecraft/world/item/ItemStack.getHoverName ()Lnet/minecraft/network/chat/Component;
      // 64c: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 651: dup
      // 652: sipush -4855
      // 655: sipush 16085
      // 658: pop2
      // 659: ldc "getString(...)"
      // 65b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 65e: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // 661: sipush -4805
      // 664: sipush 13079
      // 667: pop2
      // 668: ldc_w "Efficient Miner"
      // 66b: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 66e: ifne 676
      // 671: return
      // 672: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 675: athrow
      // 676: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 679: aload 8
      // 67b: getstatic net/minecraft/world/item/Items.COAL_ORE Lnet/minecraft/world/item/Item;
      // 67e: invokevirtual net/minecraft/world/item/ItemStack.is (Ljava/lang/Object;)Z
      // 681: ifne 712
      // 684: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI;
      // 687: getstatic me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 68a: aload 8
      // 68c: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.d (Lnet/minecraft/world/item/ItemStack;)Ljava/util/List;
      // 68f: checkcast java/lang/Iterable
      // 692: astore 10
      // 694: astore 11
      // 696: astore 12
      // 698: bipush 0
      // 699: istore 13
      // 69b: aload 10
      // 69d: astore 14
      // 69f: new java/util/ArrayList
      // 6a2: dup
      // 6a3: aload 10
      // 6a5: bipush 10
      // 6a7: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
      // 6aa: invokespecial java/util/ArrayList.<init> (I)V
      // 6ad: checkcast java/util/Collection
      // 6b0: astore 15
      // 6b2: bipush 0
      // 6b3: istore 16
      // 6b5: aload 14
      // 6b7: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 6bc: astore 17
      // 6be: aload 17
      // 6c0: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 6c5: ifeq 6fe
      // 6c8: aload 17
      // 6ca: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 6cf: astore 18
      // 6d1: aload 15
      // 6d3: aload 18
      // 6d5: checkcast net/minecraft/network/chat/Component
      // 6d8: astore 19
      // 6da: astore 20
      // 6dc: bipush 0
      // 6dd: istore 21
      // 6df: aload 19
      // 6e1: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 6e6: aload 20
      // 6e8: swap
      // 6e9: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 6ee: pop
      // 6ef: aload 2
      // 6f0: ifnull 718
      // 6f3: aload 2
      // 6f4: ifnonnull 6be
      // 6f7: goto 6fe
      // 6fa: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6fd: athrow
      // 6fe: aload 15
      // 700: checkcast java/util/List
      // 703: nop
      // 704: astore 20
      // 706: aload 12
      // 708: aload 11
      // 70a: aload 20
      // 70c: invokespecial me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.e (Ljava/util/List;)I
      // 70f: goto 713
      // 712: bipush 0
      // 713: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c (I)V
      // 716: nop
      // 717: nop
      // 718: goto 71d
      // 71b: pop
      // 71c: return
      // 71d: aload 4
      // 71f: bipush 12
      // 721: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 726: checkcast net/minecraft/world/inventory/Slot
      // 729: invokevirtual net/minecraft/world/inventory/Slot.getItem ()Lnet/minecraft/world/item/ItemStack;
      // 72c: dup
      // 72d: ifnull 80c
      // 730: astore 8
      // 732: bipush 0
      // 733: istore 9
      // 735: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // 738: aload 8
      // 73a: invokevirtual net/minecraft/world/item/ItemStack.getHoverName ()Lnet/minecraft/network/chat/Component;
      // 73d: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 742: dup
      // 743: sipush -4855
      // 746: sipush 16085
      // 749: pop2
      // 74a: ldc "getString(...)"
      // 74c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 74f: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // 752: sipush -4801
      // 755: sipush -18214
      // 758: pop2
      // 759: ldc_w "Professional"
      // 75c: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 75f: ifne 767
      // 762: return
      // 763: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 766: athrow
      // 767: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 76a: aload 8
      // 76c: getstatic net/minecraft/world/item/Items.COAL_ORE Lnet/minecraft/world/item/Item;
      // 76f: invokevirtual net/minecraft/world/item/ItemStack.is (Ljava/lang/Object;)Z
      // 772: ifne 803
      // 775: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI;
      // 778: getstatic me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 77b: aload 8
      // 77d: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.d (Lnet/minecraft/world/item/ItemStack;)Ljava/util/List;
      // 780: checkcast java/lang/Iterable
      // 783: astore 10
      // 785: astore 11
      // 787: astore 12
      // 789: bipush 0
      // 78a: istore 13
      // 78c: aload 10
      // 78e: astore 14
      // 790: new java/util/ArrayList
      // 793: dup
      // 794: aload 10
      // 796: bipush 10
      // 798: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
      // 79b: invokespecial java/util/ArrayList.<init> (I)V
      // 79e: checkcast java/util/Collection
      // 7a1: astore 15
      // 7a3: bipush 0
      // 7a4: istore 16
      // 7a6: aload 14
      // 7a8: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 7ad: astore 17
      // 7af: aload 17
      // 7b1: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 7b6: ifeq 7ef
      // 7b9: aload 17
      // 7bb: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 7c0: astore 18
      // 7c2: aload 15
      // 7c4: aload 18
      // 7c6: checkcast net/minecraft/network/chat/Component
      // 7c9: astore 19
      // 7cb: astore 20
      // 7cd: bipush 0
      // 7ce: istore 21
      // 7d0: aload 19
      // 7d2: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 7d7: aload 20
      // 7d9: swap
      // 7da: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 7df: pop
      // 7e0: aload 2
      // 7e1: ifnull 809
      // 7e4: aload 2
      // 7e5: ifnonnull 7af
      // 7e8: goto 7ef
      // 7eb: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7ee: athrow
      // 7ef: aload 15
      // 7f1: checkcast java/util/List
      // 7f4: nop
      // 7f5: astore 20
      // 7f7: aload 12
      // 7f9: aload 11
      // 7fb: aload 20
      // 7fd: invokespecial me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.d (Ljava/util/List;)D
      // 800: goto 804
      // 803: dconst_0
      // 804: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b (D)V
      // 807: nop
      // 808: nop
      // 809: goto 80e
      // 80c: pop
      // 80d: return
      // 80e: getstatic me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 811: bipush 8
      // 813: bipush 1
      // 814: getstatic net/minecraft/world/inventory/ContainerInput.PICKUP Lnet/minecraft/world/inventory/ContainerInput;
      // 817: invokevirtual me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a (IILnet/minecraft/world/inventory/ContainerInput;)V
      // 81a: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 81d: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 820: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll;
      // 823: putstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll;
      // 826: aload 2
      // 827: ifnonnull c8e
      // 82a: aload 3
      // 82b: aload 2
      // 82c: ifnull 85a
      // 82f: goto 836
      // 832: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 835: athrow
      // 836: sipush -4819
      // 839: sipush -24695
      // 83c: pop2
      // 83d: ldc_w "Heart of the Mountain"
      // 840: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 843: ifne 852
      // 846: goto 84d
      // 849: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 84c: athrow
      // 84d: return
      // 84e: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 851: athrow
      // 852: aload 4
      // 854: bipush 0
      // 855: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 85a: checkcast net/minecraft/world/inventory/Slot
      // 85d: invokevirtual net/minecraft/world/inventory/Slot.getItem ()Lnet/minecraft/world/item/ItemStack;
      // 860: dup
      // 861: ifnull 89f
      // 864: invokevirtual net/minecraft/world/item/ItemStack.getHoverName ()Lnet/minecraft/network/chat/Component;
      // 867: dup
      // 868: ifnull 89f
      // 86b: goto 872
      // 86e: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 871: athrow
      // 872: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 877: aload 2
      // 878: ifnull 89b
      // 87b: goto 882
      // 87e: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 881: athrow
      // 882: dup
      // 883: ifnull 89f
      // 886: goto 88d
      // 889: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 88c: athrow
      // 88d: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // 890: swap
      // 891: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // 894: goto 89b
      // 897: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 89a: athrow
      // 89b: aload 2
      // 89c: ifnonnull 8a8
      // 89f: pop
      // 8a0: aconst_null
      // 8a1: goto 8a8
      // 8a4: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8a7: athrow
      // 8a8: sipush -4848
      // 8ab: sipush -591
      // 8ae: pop2
      // 8af: ldc_w "Tier 10"
      // 8b2: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 8b5: ifne 8bd
      // 8b8: return
      // 8b9: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8bc: athrow
      // 8bd: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Ljava/util/List;
      // 8c0: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 8c5: astore 5
      // 8c7: aload 5
      // 8c9: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 8ce: ifeq 967
      // 8d1: aload 5
      // 8d3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 8d8: checkcast java/lang/Number
      // 8db: invokevirtual java/lang/Number.intValue ()I
      // 8de: istore 6
      // 8e0: aload 2
      // 8e1: ifnull 90a
      // 8e4: aload 4
      // 8e6: iload 6
      // 8e8: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 8ed: checkcast net/minecraft/world/inventory/Slot
      // 8f0: invokevirtual net/minecraft/world/inventory/Slot.getItem ()Lnet/minecraft/world/item/ItemStack;
      // 8f3: dup
      // 8f4: aload 2
      // 8f5: ifnull 9ad
      // 8f8: goto 8ff
      // 8fb: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8fe: athrow
      // 8ff: ifnonnull 90b
      // 902: goto 909
      // 905: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 908: athrow
      // 909: pop
      // 90a: return
      // 90b: astore 7
      // 90d: aload 7
      // 90f: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 912: getstatic net/minecraft/world/item/Items.GREEN_STAINED_GLASS_PANE Lnet/minecraft/world/item/Item;
      // 915: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 918: aload 2
      // 919: ifnull 959
      // 91c: ifeq 8c7
      // 91f: goto 926
      // 922: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 925: athrow
      // 926: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // 929: aload 7
      // 92b: invokevirtual net/minecraft/world/item/ItemStack.getHoverName ()Lnet/minecraft/network/chat/Component;
      // 92e: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 933: dup
      // 934: sipush -4855
      // 937: sipush 16085
      // 93a: pop2
      // 93b: ldc "getString(...)"
      // 93d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 940: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // 943: sipush -4814
      // 946: sipush -23183
      // 949: pop2
      // 94a: ldc_w "Tier "
      // 94d: ldc_w ""
      // 950: bipush 0
      // 951: bipush 4
      // 952: aconst_null
      // 953: invokestatic kotlin/text/StringsKt.replace$default (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
      // 956: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 959: istore 9
      // 95b: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 95e: iload 9
      // 960: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (I)V
      // 963: aload 2
      // 964: ifnonnull 8c7
      // 967: aload 0
      // 968: bipush 1
      // 969: aload 4
      // 96b: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 96e: invokespecial me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (ILjava/util/List;Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)V
      // 971: aload 0
      // 972: bipush 7
      // 974: aload 4
      // 976: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 979: invokespecial me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (ILjava/util/List;Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)V
      // 97c: aload 0
      // 97d: bipush 37
      // 97f: aload 4
      // 981: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 984: invokespecial me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (ILjava/util/List;Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)V
      // 987: aload 0
      // 988: bipush 43
      // 98a: aload 4
      // 98c: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 98f: invokespecial me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (ILjava/util/List;Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)V
      // 992: aload 2
      // 993: ifnull a8d
      // 996: aload 4
      // 998: bipush 42
      // 99a: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 99f: checkcast net/minecraft/world/inventory/Slot
      // 9a2: invokevirtual net/minecraft/world/inventory/Slot.getItem ()Lnet/minecraft/world/item/ItemStack;
      // 9a5: dup
      // 9a6: goto 9ad
      // 9a9: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9ac: athrow
      // 9ad: ifnull a8c
      // 9b0: astore 8
      // 9b2: bipush 0
      // 9b3: istore 9
      // 9b5: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // 9b8: aload 8
      // 9ba: invokevirtual net/minecraft/world/item/ItemStack.getHoverName ()Lnet/minecraft/network/chat/Component;
      // 9bd: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 9c2: dup
      // 9c3: sipush -4855
      // 9c6: sipush 16085
      // 9c9: pop2
      // 9ca: ldc "getString(...)"
      // 9cc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 9cf: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // 9d2: sipush -4852
      // 9d5: sipush 20131
      // 9d8: pop2
      // 9d9: ldc_w "Great Explorer"
      // 9dc: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 9df: ifne 9e7
      // 9e2: return
      // 9e3: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9e6: athrow
      // 9e7: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 9ea: aload 8
      // 9ec: getstatic net/minecraft/world/item/Items.COAL_ORE Lnet/minecraft/world/item/Item;
      // 9ef: invokevirtual net/minecraft/world/item/ItemStack.is (Ljava/lang/Object;)Z
      // 9f2: ifne a83
      // 9f5: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI;
      // 9f8: getstatic me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 9fb: aload 8
      // 9fd: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.d (Lnet/minecraft/world/item/ItemStack;)Ljava/util/List;
      // a00: checkcast java/lang/Iterable
      // a03: astore 10
      // a05: astore 11
      // a07: astore 12
      // a09: bipush 0
      // a0a: istore 13
      // a0c: aload 10
      // a0e: astore 14
      // a10: new java/util/ArrayList
      // a13: dup
      // a14: aload 10
      // a16: bipush 10
      // a18: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
      // a1b: invokespecial java/util/ArrayList.<init> (I)V
      // a1e: checkcast java/util/Collection
      // a21: astore 15
      // a23: bipush 0
      // a24: istore 16
      // a26: aload 14
      // a28: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // a2d: astore 17
      // a2f: aload 17
      // a31: invokeinterface java/util/Iterator.hasNext ()Z 1
      // a36: ifeq a6f
      // a39: aload 17
      // a3b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // a40: astore 18
      // a42: aload 15
      // a44: aload 18
      // a46: checkcast net/minecraft/network/chat/Component
      // a49: astore 19
      // a4b: astore 20
      // a4d: bipush 0
      // a4e: istore 21
      // a50: aload 19
      // a52: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // a57: aload 20
      // a59: swap
      // a5a: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // a5f: pop
      // a60: aload 2
      // a61: ifnull a89
      // a64: aload 2
      // a65: ifnonnull a2f
      // a68: goto a6f
      // a6b: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a6e: athrow
      // a6f: aload 15
      // a71: checkcast java/util/List
      // a74: nop
      // a75: astore 20
      // a77: aload 12
      // a79: aload 11
      // a7b: aload 20
      // a7d: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.c (Ljava/util/List;)I
      // a80: goto a84
      // a83: bipush 0
      // a84: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b (I)V
      // a87: nop
      // a88: nop
      // a89: goto a8e
      // a8c: pop
      // a8d: return
      // a8e: aload 4
      // a90: bipush 21
      // a92: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // a97: checkcast net/minecraft/world/inventory/Slot
      // a9a: invokevirtual net/minecraft/world/inventory/Slot.getItem ()Lnet/minecraft/world/item/ItemStack;
      // a9d: dup
      // a9e: ifnull b7d
      // aa1: astore 8
      // aa3: bipush 0
      // aa4: istore 9
      // aa6: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // aa9: aload 8
      // aab: invokevirtual net/minecraft/world/item/ItemStack.getHoverName ()Lnet/minecraft/network/chat/Component;
      // aae: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // ab3: dup
      // ab4: sipush -4855
      // ab7: sipush 16085
      // aba: pop2
      // abb: ldc "getString(...)"
      // abd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // ac0: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // ac3: sipush -4824
      // ac6: sipush 6972
      // ac9: pop2
      // aca: ldc_w "Strong Arm"
      // acd: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // ad0: ifne ad8
      // ad3: return
      // ad4: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ad7: athrow
      // ad8: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // adb: aload 8
      // add: getstatic net/minecraft/world/item/Items.COAL_ORE Lnet/minecraft/world/item/Item;
      // ae0: invokevirtual net/minecraft/world/item/ItemStack.is (Ljava/lang/Object;)Z
      // ae3: ifne b74
      // ae6: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI;
      // ae9: getstatic me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // aec: aload 8
      // aee: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.d (Lnet/minecraft/world/item/ItemStack;)Ljava/util/List;
      // af1: checkcast java/lang/Iterable
      // af4: astore 10
      // af6: astore 11
      // af8: astore 12
      // afa: bipush 0
      // afb: istore 13
      // afd: aload 10
      // aff: astore 14
      // b01: new java/util/ArrayList
      // b04: dup
      // b05: aload 10
      // b07: bipush 10
      // b09: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
      // b0c: invokespecial java/util/ArrayList.<init> (I)V
      // b0f: checkcast java/util/Collection
      // b12: astore 15
      // b14: bipush 0
      // b15: istore 16
      // b17: aload 14
      // b19: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // b1e: astore 17
      // b20: aload 17
      // b22: invokeinterface java/util/Iterator.hasNext ()Z 1
      // b27: ifeq b60
      // b2a: aload 17
      // b2c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // b31: astore 18
      // b33: aload 15
      // b35: aload 18
      // b37: checkcast net/minecraft/network/chat/Component
      // b3a: astore 19
      // b3c: astore 20
      // b3e: bipush 0
      // b3f: istore 21
      // b41: aload 19
      // b43: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // b48: aload 20
      // b4a: swap
      // b4b: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // b50: pop
      // b51: aload 2
      // b52: ifnull b7a
      // b55: aload 2
      // b56: ifnonnull b20
      // b59: goto b60
      // b5c: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b5f: athrow
      // b60: aload 15
      // b62: checkcast java/util/List
      // b65: nop
      // b66: astore 20
      // b68: aload 12
      // b6a: aload 11
      // b6c: aload 20
      // b6e: invokespecial me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.b (Ljava/util/List;)D
      // b71: goto b75
      // b74: dconst_0
      // b75: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c (D)V
      // b78: nop
      // b79: nop
      // b7a: goto b7f
      // b7d: pop
      // b7e: return
      // b7f: aload 4
      // b81: bipush 15
      // b83: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // b88: checkcast net/minecraft/world/inventory/Slot
      // b8b: invokevirtual net/minecraft/world/inventory/Slot.getItem ()Lnet/minecraft/world/item/ItemStack;
      // b8e: dup
      // b8f: ifnull c6e
      // b92: astore 8
      // b94: bipush 0
      // b95: istore 9
      // b97: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // b9a: aload 8
      // b9c: invokevirtual net/minecraft/world/item/ItemStack.getHoverName ()Lnet/minecraft/network/chat/Component;
      // b9f: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // ba4: dup
      // ba5: sipush -4855
      // ba8: sipush 16085
      // bab: pop2
      // bac: ldc "getString(...)"
      // bae: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // bb1: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // bb4: sipush -4828
      // bb7: sipush 19096
      // bba: pop2
      // bbb: ldc_w "Eager Adventurer"
      // bbe: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // bc1: ifne bc9
      // bc4: return
      // bc5: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bc8: athrow
      // bc9: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // bcc: aload 8
      // bce: getstatic net/minecraft/world/item/Items.COAL_ORE Lnet/minecraft/world/item/Item;
      // bd1: invokevirtual net/minecraft/world/item/ItemStack.is (Ljava/lang/Object;)Z
      // bd4: ifne c65
      // bd7: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI;
      // bda: getstatic me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // bdd: aload 8
      // bdf: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.d (Lnet/minecraft/world/item/ItemStack;)Ljava/util/List;
      // be2: checkcast java/lang/Iterable
      // be5: astore 10
      // be7: astore 11
      // be9: astore 12
      // beb: bipush 0
      // bec: istore 13
      // bee: aload 10
      // bf0: astore 14
      // bf2: new java/util/ArrayList
      // bf5: dup
      // bf6: aload 10
      // bf8: bipush 10
      // bfa: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
      // bfd: invokespecial java/util/ArrayList.<init> (I)V
      // c00: checkcast java/util/Collection
      // c03: astore 15
      // c05: bipush 0
      // c06: istore 16
      // c08: aload 14
      // c0a: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // c0f: astore 17
      // c11: aload 17
      // c13: invokeinterface java/util/Iterator.hasNext ()Z 1
      // c18: ifeq c51
      // c1b: aload 17
      // c1d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // c22: astore 18
      // c24: aload 15
      // c26: aload 18
      // c28: checkcast net/minecraft/network/chat/Component
      // c2b: astore 19
      // c2d: astore 20
      // c2f: bipush 0
      // c30: istore 21
      // c32: aload 19
      // c34: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // c39: aload 20
      // c3b: swap
      // c3c: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // c41: pop
      // c42: aload 2
      // c43: ifnull c6b
      // c46: aload 2
      // c47: ifnonnull c11
      // c4a: goto c51
      // c4d: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c50: athrow
      // c51: aload 15
      // c53: checkcast java/util/List
      // c56: nop
      // c57: astore 20
      // c59: aload 12
      // c5b: aload 11
      // c5d: aload 20
      // c5f: invokespecial me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/util/List;)D
      // c62: goto c66
      // c65: dconst_0
      // c66: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d (D)V
      // c69: nop
      // c6a: nop
      // c6b: goto c70
      // c6e: pop
      // c6f: return
      // c70: aload 0
      // c71: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a ()Lnet/minecraft/client/Minecraft;
      // c74: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // c77: dup
      // c78: ifnull c85
      // c7b: invokevirtual net/minecraft/client/player/LocalPlayer.closeContainer ()V
      // c7e: goto c86
      // c81: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c84: athrow
      // c85: pop
      // c86: aload 0
      // c87: invokespecial me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.h ()V
      // c8a: aload 0
      // c8b: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.j ()V
      // c8e: return
   }

   private final double a(List<String> var1) {
      Object var27 = null; // PX-FIX
      int[] var10000 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      Iterator var3 = var1.iterator();
      int[] var2 = var10000;

      label93:
      while (true) {
         boolean var23 = var3.hasNext();

         label91:
         while (var23) {
            String var4 = (String)var3.next();
            String var5 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a(var4);

            double var22;
            do {
               String var24 = var5;
               if (var2 != null) {
                  short var10001 = -4807;
                  short var10002 = -587;
                  if (!StringsKt.startsWith(var5, "Grants ", false)) {
                     continue label93;
                  }

                  short var25 = -4808;
                  var10001 = 7777;
                  var24 = "Grants ";
               }

               String var6 = var24;
               String var26 = var5.substring(var6.length());
               short var29 = -4810;
               short var10003 = 24550;
               Intrinsics.checkNotNullExpressionValue(var26, "substring(...)");
               String var8 = var26;
               boolean var9 = false;
               CharSequence var10 = var8;
               var var11 = new StringBuilder();
               boolean var12 = false;
               int var13 = 0;
               int var14 = var10.length();

               while (var13 < var14) {
                  char var15 = var10.charAt(var13);
                  char var16 = var15;
                  boolean var17 = false;

                  label100: {
                     try {
                        if (var2 == null) {
                           break label100;
                        }

                        var23 = Character.isDigit(var16);
                        if (var2 == null) {
                           continue label91;
                        }
                     } catch (NumberFormatException var20) {
                        throw (RuntimeException)a(var20);
                     }

                     try {
                        if (var23) {
                           var11.append(var15);
                        }
                     } catch (NumberFormatException var19) {
                        throw (RuntimeException)a(var19);
                     }

                     var13++;
                  }

                  if (var2 == null) {
                     break;
                  }
               }

               String var7 = var11.toString();

               label86: {
                  label85: {
                     try {
                        var27 = var7.length();
                        if (var2 == null) {
                           break label86;
                        }

                        if (((Boolean)var27)) {
                           break label85;
                        }
                     } catch (NumberFormatException var21) {
                        throw (RuntimeException)a(var21);
                     }

                     var27 = 0;
                     break label86;
                  }

                  var27 = 1;
               }

               if (((Boolean)(var27))) {
                  continue label93;
               }

               try {
                  var22 = Double.parseDouble(var7);
               } catch (NumberFormatException var18) {
                  return 0.0;
               }
            } while (var2 == null);

            return var22;
         }

         return 0.0;
      }
   }

   private final double b(List<String> param1) {
      int[] var10000 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      kotlin.text.Regex var28 = new kotlin.text.Regex("\\d+");
      Iterator var29 = param1.iterator();
      int[] var2 = var10000;

      while (var29.hasNext()) {
         String var5 = (String)var29.next();

         do {
            String var6 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var5);
            if (var2 != null) {
               if (!StringsKt.contains(var6, "Gain ", false)) {
                  continue;
               }
            } else {
               break;
            }

            kotlin.text.MatchResult var7 = var28.find(var6, 0);
            if (var2 == null) {
               break;
            }

            if (var7 == null) {
               return 0.0;
            }

            String var8 = var7.getValue();
            if (var8 == null) {
               return 0.0;
            }

            Double var9 = StringsKt.toDoubleOrNull(var8);
            if (var9 == null) {
               return 0.0;
            }

            return var9.doubleValue();
         } while (var2 == null);

         return 0.0;
      }

      return 0.0;
   }

   public final int c(@NotNull List<String> param1) {
      int[] var10000 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      Intrinsics.checkNotNullParameter(param1, "lore");
      kotlin.text.Regex var28 = new kotlin.text.Regex("\\d+");
      Iterator var29 = param1.iterator();
      int[] var2 = var10000;

      while (var29.hasNext()) {
         String var5 = (String)var29.next();

         do {
            String var6 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var5);
            if (var2 != null) {
               if (!StringsKt.contains(var6, "Level", false)) {
                  continue;
               }
            } else {
               break;
            }

            kotlin.text.MatchResult var7 = var28.find(var6, 0);
            if (var2 == null) {
               break;
            }

            if (var7 == null) {
               return 0;
            }

            String var8 = var7.getValue();
            if (var8 == null) {
               return 0;
            }

            Integer var9 = StringsKt.toIntOrNull(var8);
            if (var9 == null) {
               return 0;
            }

            return var9.intValue();
         } while (var2 == null);

         return 0;
      }

      return 0;
   }

   private final double d(List<String> param1) {
      int[] var10000 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      kotlin.text.Regex var28 = new kotlin.text.Regex("\\d+");
      Iterator var29 = param1.iterator();
      int[] var2 = var10000;

      while (var29.hasNext()) {
         String var5 = (String)var29.next();

         do {
            String var6 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var5);
            if (var2 != null) {
               if (!StringsKt.contains(var6, "Gain ", false)) {
                  continue;
               }
            } else {
               break;
            }

            kotlin.text.MatchResult var7 = var28.find(var6, 0);
            if (var2 == null) {
               break;
            }

            if (var7 == null) {
               return 0.0;
            }

            String var8 = var7.getValue();
            if (var8 == null) {
               return 0.0;
            }

            Double var9 = StringsKt.toDoubleOrNull(var8);
            if (var9 == null) {
               return 0.0;
            }

            return var9.doubleValue();
         } while (var2 == null);

         return 0.0;
      }

      return 0.0;
   }

   private final int e(List<String> var1) {
      Object var27 = null; // PX-FIX
      int[] var10000 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      Iterator var3 = var1.iterator();
      int[] var2 = var10000;

      label93:
      while (true) {
         boolean var23 = var3.hasNext();

         label91:
         while (var23) {
            String var4 = (String)var3.next();
            String var5 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a(var4);

            int var22;
            do {
               String var24 = var5;
               if (var2 != null) {
                  short var10001 = -4808;
                  short var10002 = 7777;
                  if (!StringsKt.startsWith(var5, "Grants ", false)) {
                     continue label93;
                  }

                  short var25 = -4808;
                  var10001 = 7777;
                  var24 = "Grants ";
               }

               String var6 = var24;
               String var26 = var5.substring(var6.length());
               short var29 = -4804;
               short var10003 = 9998;
               Intrinsics.checkNotNullExpressionValue(var26, "substring(...)");
               String var8 = var26;
               boolean var9 = false;
               CharSequence var10 = var8;
               var var11 = new StringBuilder();
               boolean var12 = false;
               int var13 = 0;
               int var14 = var10.length();

               while (var13 < var14) {
                  char var15 = var10.charAt(var13);
                  char var16 = var15;
                  boolean var17 = false;

                  label100: {
                     try {
                        if (var2 == null) {
                           break label100;
                        }

                        var23 = Character.isDigit(var16);
                        if (var2 == null) {
                           continue label91;
                        }
                     } catch (NumberFormatException var20) {
                        throw (RuntimeException)a(var20);
                     }

                     try {
                        if (var23) {
                           var11.append(var15);
                        }
                     } catch (NumberFormatException var19) {
                        throw (RuntimeException)a(var19);
                     }

                     var13++;
                  }

                  if (var2 == null) {
                     break;
                  }
               }

               String var7 = var11.toString();

               label86: {
                  label85: {
                     try {
                        var27 = var7.length();
                        if (var2 == null) {
                           break label86;
                        }

                        if (((Boolean)var27)) {
                           break label85;
                        }
                     } catch (NumberFormatException var21) {
                        throw (RuntimeException)a(var21);
                     }

                     var27 = 0;
                     break label86;
                  }

                  var27 = 1;
               }

               if (((Boolean)(var27))) {
                  continue label93;
               }

               try {
                  var22 = Integer.parseInt(var7);
               } catch (NumberFormatException var18) {
                  return 0;
               }
            } while (var2 == null);

            return var22;
         }

         return 0;
      }
   }

   private final void a(
      int param1,
      List<? extends Slot> param2,
      lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.PXEvMid param3
   ) {
      Object llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll = null; // PX-FIX
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c ()[I
      // 03: astore 4
      // 05: aload 4
      // 07: ifnull 60
      // 0a: aload 2
      // 0b: iload 1
      // 0c: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 11: checkcast net/minecraft/world/inventory/Slot
      // 14: invokevirtual net/minecraft/world/inventory/Slot.getItem ()Lnet/minecraft/world/item/ItemStack;
      // 17: dup
      // 18: ifnull 5f
      // 1b: goto 22
      // 1e: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: astore 5
      // 24: bipush 0
      // 25: istore 6
      // 27: aload 4
      // 29: ifnull 5c
      // 2c: aload 5
      // 2e: getstatic net/minecraft/world/item/Items.EMERALD_BLOCK Lnet/minecraft/world/item/Item;
      // 31: invokevirtual net/minecraft/world/item/ItemStack.is (Ljava/lang/Object;)Z
      // 34: ifeq 5b
      // 37: goto 3e
      // 3a: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d: athrow
      // 3e: aload 5
      // 40: invokevirtual net/minecraft/world/item/ItemStack.hasFoil ()Z
      // 43: ifeq 5b
      // 46: goto 4d
      // 49: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c: athrow
      // 4d: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 50: aload 3
      // 51: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)V
      // 54: goto 5b
      // 57: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a: athrow
      // 5b: nop
      // 5c: goto 61
      // 5f: pop
      // 60: nop
      // 61: return
   }

   private final void h() {
      Object llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll = null; // PX-FIX
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c ()[I
      // 003: new me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
      // 006: dup
      // 007: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 00a: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Ljava/lang/String;
      // 00d: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 010: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()D
      // 013: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 016: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()D
      // 019: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 01c: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d ()D
      // 01f: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 022: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()D
      // 025: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 028: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.f ()Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 02b: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()Ljava/lang/String;
      // 02e: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 031: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.g ()I
      // 034: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 037: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h ()Z
      // 03a: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 03d: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.i ()D
      // 040: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 043: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.j ()I
      // 046: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 049: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.k ()I
      // 04c: invokespecial me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.<init> (Ljava/lang/String;DDDDLjava/lang/String;IZDII)V
      // 04f: astore 2
      // 050: astore 1
      // 051: new java/io/File
      // 054: dup
      // 055: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Ljava/lang/String;
      // 058: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 05b: astore 3
      // 05c: aload 3
      // 05d: aload 1
      // 05e: ifnull 095
      // 061: invokevirtual java/io/File.exists ()Z
      // 064: ifne 07a
      // 067: goto 06e
      // 06a: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06d: athrow
      // 06e: aload 3
      // 06f: invokevirtual java/io/File.mkdir ()Z
      // 072: pop
      // 073: goto 07a
      // 076: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 079: athrow
      // 07a: new java/io/File
      // 07d: dup
      // 07e: aload 3
      // 07f: aload 2
      // 080: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()Ljava/lang/String;
      // 083: sipush -4820
      // 086: sipush -18482
      // 089: pop2
      // 08a: ldc_w ".json"
      // 08d: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 092: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 095: astore 4
      // 097: new java/io/FileWriter
      // 09a: dup
      // 09b: aload 4
      // 09d: invokespecial java/io/FileWriter.<init> (Ljava/io/File;)V
      // 0a0: checkcast java/io/Closeable
      // 0a3: astore 5
      // 0a5: aconst_null
      // 0a6: astore 6
      // 0a8: nop
      // 0a9: aload 5
      // 0ab: checkcast java/io/FileWriter
      // 0ae: astore 7
      // 0b0: bipush 0
      // 0b1: istore 8
      // 0b3: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Lcom/google/gson/Gson;
      // 0b6: aload 2
      // 0b7: aload 7
      // 0b9: checkcast java/lang/Appendable
      // 0bc: invokevirtual com/google/gson/Gson.toJson (Ljava/lang/Object;Ljava/lang/Appendable;)V
      // 0bf: nop
      // 0c0: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 0c3: astore 7
      // 0c5: aload 5
      // 0c7: aload 6
      // 0c9: invokestatic kotlin/io/CloseableKt.closeFinally (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 0cc: goto 0e4
      // 0cf: astore 8
      // 0d1: aload 8
      // 0d3: astore 6
      // 0d5: aload 8
      // 0d7: athrow
      // 0d8: astore 8
      // 0da: aload 5
      // 0dc: aload 6
      // 0de: invokestatic kotlin/io/CloseableKt.closeFinally (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 0e1: aload 8
      // 0e3: athrow
      // 0e4: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0e7: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.f ()Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 0ea: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 0ed: if_acmpne 0fa
      // 0f0: ldc_w "f"
      // 0f3: goto 0fd
      // 0f6: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f9: athrow
      // 0fa: ldc_w "e"
      // 0fd: astore 5
      // 0ff: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 102: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h ()Z
      // 105: ifeq 112
      // 108: ldc_w "a"
      // 10b: goto 115
      // 10e: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 111: athrow
      // 112: ldc_w "c"
      // 115: astore 6
      // 117: sipush -4858
      // 11a: sipush 14587
      // 11d: pop2
      // 11e: ldc_w "  Your Mining Data"
      // 121: invokestatic me/octo/client/utils/player/PXEvMid.c (Ljava/lang/String;)V
      // 124: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 127: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()D
      // 12a: sipush -4831
      // 12d: sipush -29243
      // 130: pop2
      // 131: ldc_w "- Mining Speed: §e"
      // 134: dup_x2
      // 135: pop
      // 136: invokedynamic makeConcatWithConstants (Ljava/lang/String;D)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 13b: invokestatic me/octo/client/utils/player/PXEvMid.c (Ljava/lang/String;)V
      // 13e: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 141: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()D
      // 144: sipush -4864
      // 147: sipush 28572
      // 14a: pop2
      // 14b: ldc_w "- Professional: §e"
      // 14e: dup_x2
      // 14f: pop
      // 150: invokedynamic makeConcatWithConstants (Ljava/lang/String;D)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 155: invokestatic me/octo/client/utils/player/PXEvMid.c (Ljava/lang/String;)V
      // 158: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 15b: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d ()D
      // 15e: sipush -4823
      // 161: sipush 14446
      // 164: pop2
      // 165: ldc_w "- Strong Arm: §e"
      // 168: dup_x2
      // 169: pop
      // 16a: invokedynamic makeConcatWithConstants (Ljava/lang/String;D)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 16f: invokestatic me/octo/client/utils/player/PXEvMid.c (Ljava/lang/String;)V
      // 172: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 175: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()D
      // 178: sipush -4817
      // 17b: sipush -6033
      // 17e: pop2
      // 17f: ldc_w "- Eager Adventurer: §e"
      // 182: dup_x2
      // 183: pop
      // 184: invokedynamic makeConcatWithConstants (Ljava/lang/String;D)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 189: invokestatic me/octo/client/utils/player/PXEvMid.c (Ljava/lang/String;)V
      // 18c: sipush -4860
      // 18f: aload 5
      // 191: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 194: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.f ()Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 197: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()Ljava/lang/String;
      // 19a: astore 9
      // 19c: astore 10
      // 19e: sipush -16338
      // 1a1: pop2
      // 1a2: ldc_w "- Mining Ability: §"
      // 1a5: aload 10
      // 1a7: aload 9
      // 1a9: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 1ae: invokestatic me/octo/client/utils/player/PXEvMid.c (Ljava/lang/String;)V
      // 1b1: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 1b4: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.g ()I
      // 1b7: sipush -4850
      // 1ba: sipush 26806
      // 1bd: pop2
      // 1be: ldc_w "- HOTM Level: "
      // 1c1: swap
      // 1c2: invokedynamic makeConcatWithConstants (Ljava/lang/String;I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 1c7: invokestatic me/octo/client/utils/player/PXEvMid.c (Ljava/lang/String;)V
      // 1ca: sipush -4859
      // 1cd: aload 6
      // 1cf: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 1d2: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h ()Z
      // 1d5: istore 11
      // 1d7: astore 12
      // 1d9: sipush 29567
      // 1dc: pop2
      // 1dd: ldc_w "- Unlocked COTM: §"
      // 1e0: aload 12
      // 1e2: iload 11
      // 1e4: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 1e9: invokestatic me/octo/client/utils/player/PXEvMid.c (Ljava/lang/String;)V
      // 1ec: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 1ef: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.i ()D
      // 1f2: sipush -4822
      // 1f5: sipush 5569
      // 1f8: pop2
      // 1f9: ldc_w "- Cold Resistance: §b"
      // 1fc: dup_x2
      // 1fd: pop
      // 1fe: invokedynamic makeConcatWithConstants (Ljava/lang/String;D)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 203: invokestatic me/octo/client/utils/player/PXEvMid.c (Ljava/lang/String;)V
      // 206: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 209: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.j ()I
      // 20c: sipush -4827
      // 20f: sipush 30961
      // 212: pop2
      // 213: ldc_w "- Great Explorer: "
      // 216: swap
      // 217: invokedynamic makeConcatWithConstants (Ljava/lang/String;I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 21c: invokestatic me/octo/client/utils/player/PXEvMid.c (Ljava/lang/String;)V
      // 21f: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 222: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.k ()I
      // 225: sipush -4809
      // 228: sipush 19840
      // 22b: pop2
      // 22c: ldc_w "- Efficient Miner: §e"
      // 22f: swap
      // 230: invokedynamic makeConcatWithConstants (Ljava/lang/String;I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 235: invokestatic me/octo/client/utils/player/PXEvMid.c (Ljava/lang/String;)V
      // 238: return
   }

   public final void i() {
      Object llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll = null; // PX-FIX
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic me/octo/client/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 03: getfield me/octo/client/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/events/impl/base/PXEvMid;
      // 06: aload 0
      // 07: invokevirtual me/octo/client/events/impl/base/PXEvMid.a (Ljava/lang/Object;)V
      // 0a: invokestatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c ()[I
      // 0d: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
      // 10: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.D ()V
      // 13: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
      // 16: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.q ()Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 19: astore 2
      // 1a: astore 1
      // 1b: aload 0
      // 1c: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a ()Lnet/minecraft/client/Minecraft;
      // 1f: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 22: astore 3
      // 23: aload 1
      // 24: ifnull 55
      // 27: aload 2
      // 28: ifnull 3d
      // 2b: goto 32
      // 2e: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 3
      // 33: ifnonnull 56
      // 36: goto 3d
      // 39: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: sipush -4811
      // 40: sipush 266
      // 43: pop2
      // 44: ldc_w "No Drill! please run the command after you put a drill in your hotbar!"
      // 47: invokestatic me/octo/client/utils/player/PXEvMid.c (Ljava/lang/String;)V
      // 4a: aload 0
      // 4b: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.j ()V
      // 4e: goto 55
      // 51: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54: athrow
      // 55: return
      // 56: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
      // 59: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.i ()Z
      // 5c: aload 1
      // 5d: ifnull 86
      // 60: ifeq 80
      // 63: goto 6a
      // 66: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 69: athrow
      // 6a: sipush -4816
      // 6d: sipush -2389
      // 70: pop2
      // 71: ldc_w "Ability Active! please run the command again after it expires!"
      // 74: invokestatic me/octo/client/utils/player/PXEvMid.c (Ljava/lang/String;)V
      // 77: aload 0
      // 78: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.j ()V
      // 7b: return
      // 7c: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7f: athrow
      // 80: getstatic me/octo/client/utils/IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI;
      // 83: invokevirtual me/octo/client/utils/IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.j ()I
      // 86: ifeq 9f
      // 89: sipush -4857
      // 8c: sipush 18549
      // 8f: pop2
      // 90: ldc_w "Flowstate effect is active, which results in inaccurate mining data. Please retry in ~10 seconds!"
      // 93: invokestatic me/octo/client/utils/player/PXEvMid.c (Ljava/lang/String;)V
      // 96: aload 0
      // 97: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.j ()V
      // 9a: return
      // 9b: invokestatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9e: athrow
      // 9f: aload 2
      // a0: putstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // a3: new me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // a6: dup
      // a7: aload 3
      // a8: invokevirtual net/minecraft/client/player/LocalPlayer.getStringUUID ()Ljava/lang/String;
      // ab: dup
      // ac: sipush -4853
      // af: sipush 31159
      // b2: pop2
      // b3: ldc_w "getStringUUID(...)"
      // b6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // b9: dconst_0
      // ba: dconst_0
      // bb: dconst_0
      // bc: dconst_0
      // bd: aconst_null
      // be: bipush 0
      // bf: bipush 0
      // c0: dconst_0
      // c1: bipush 0
      // c2: bipush 0
      // c3: sipush 2046
      // c6: aconst_null
      // c7: invokespecial me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.<init> (Ljava/lang/String;DDDDLme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;IZDIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
      // ca: putstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // cd: getstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll;
      // d0: putstatic me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll;
      // d3: return
   }

   public final void j() {
      Object llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll = null; // PX-FIX
      me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .b(this);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var23 = null; // PX-FIX
      Object llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[50];
      int var3 = 0;
      String var2 = "Ma\u0094É~]ß|·¯\nÏ\u0013\u0089e6\u008e/\u0005PçAø\u009a\u0003VsÎ\u0005XWVSC\u0012L§¾\n{U\u000f3\u0091Â\u0007%¸ê\u0004Ü\u008b/\u0010µzÄÏ\u0007Y@\u009fØ\u0086e\u000b34,\u0007\u0005\u0097\u0097Ìy\u009b\u0005\u0000?Cyç\u0010?}ÄWµ69×kÈ\u0093{=R\u0089Ä\n\u009aCàU(\u0006[þò#\u000e#ªcg\u0084îÞ{7\u001cëæñÃ\u0015Âbk¯LZ\u0095\u0005<3\u008fn\u0088lql\u0010\u0010\u008d\u0091*\u0015wY68\u0099R{ü\u0002¹¤Î\u0098\u0080¬N\u0081Î\u0094\u0003l\u0005Î\u0088¹ñ\"\u0016$©±ØÚz\u007fR]ò\u001cµ\u001cÖ¡\u009drUÛÿ|J\u0003\u0011F&\u0014ã\u0096\u000f0+\u0096\u0080\u0002\u000bÅ$ÉI·V¶Ì©¯Æ>Ì=aMgu\f\u0080Y¯\u009eõ\u0016B¯nx-rl)Q×i\u0003\u0019Ò)âuá¬\u0011¾\u0010\u0082c\u0081Gßâ\nJ\u00adÕß\u009e\u008bÁ\r\u001e\f;\u0083±ñ{ï\u009btZ/\u000fQ\u0088\u0095_\u0015\u0018>\u009c¨\u0005\u008dºl¤¿\u0005\u009eæ\u0090B\u009dFãÌ#÷T\u0012\u0007\u009eïê sV3\u0084\u0081U#\u009d\u007f\u0095Ì1þË\u0013{ÝtÕØ;þ§@9\bW@É\nÇ\u0017\u009cK1ôôGCq\u0011ÖlRØô°¼õÒ\u0007|@\u000bá)Á0\u0089\u000bb1\u0017 ©\u0080Ë#\\\u0000\u000f\u0015«Ì@såä¨E°z\u0003ª\u009eÅ\u00adV\u009c\u0091é¡¡\u000eú|Ø\u008f'×ª\\¹ø:zËP\u0007\u009fûÅ\u0085ç)û\u0007÷\u009cÈiF´Ï\u000f\f\u0012ò)ñA\u0089öC¥w\u009f-\u000f\u0080\u0006pÆH\fáö\u0015n0\u0015\u0015ý÷÷H\u0093/\u0096\u001cÞÚd\u0005\u0098§·.\b\u000eß;|g³Ê8ÿë\u008cpô\u0082\u0081\fb{\u0081\u009d±#Qä\u0097N¹`\u0014Ææ\u008c\u00adÏØð\u0092/Û\u0080±\u0082\u0082Øg\u0093w\u0083[\u0013UpÅ\u0081¦\u001a¬7Õ6Þ\u001cc¥Ö+zC\u0017\u0012\u0016]âU\u000f¹Û\u001a\u000eÏ\u001bµÉ¤º\u009auº\fÈÝk>Æ\u00ad\u0086\u0099K\u0097Ú9\u0005°¨(\u009e\u0007\u0012\f\u0014¤`a\u0089s,Ë\u001f8.%g»ÇK\u008a\u0013K©TÐf~Ü\u0018×1\u0014@\u0089øPí2cúatj\u0097seÊ\r#FFÌì\u007f\u008fÒ\u0083\u008dK\u0080D±;Àù<xZ;aä$2Î \u0013±âr\u0085\u0087k÷í{!\r\bÍ\u001cc6éÔ\u0013ûe/.³@ÝbåW6\u008eBcl\n1±^$\u0085ðÖ«]6\u0080¼f\u0000\\\u0012fk\u009da/¦\u008cMß\u001f{\u0012æ¼YtJ7oco\u001ehhgS×àº\u0098\u000e\u009f/ô×vø\u0080¹üD\u0092íÞ¢\u0005½\u0019ã]§\u0012Ø\u0085\u001c\u0082kR#ì\u0088\u0093g¢\u001eÁÕô\u0087ô\fñ\u008fLt\"ä\u001a°Ü¶½\u008e\u0005O\u0084½îl\u000e%Ü\u0096n\téC\u0095:Qþßqh\u0004Ñ\u001bQ,\u000e\u0007MØjhï.¡K\u007fm]\u0017·";
      int var4 = "Ma\u0094É~]ß|·¯\nÏ\u0013\u0089e6\u008e/\u0005PçAø\u009a\u0003VsÎ\u0005XWVSC\u0012L§¾\n{U\u000f3\u0091Â\u0007%¸ê\u0004Ü\u008b/\u0010µzÄÏ\u0007Y@\u009fØ\u0086e\u000b34,\u0007\u0005\u0097\u0097Ìy\u009b\u0005\u0000?Cyç\u0010?}ÄWµ69×kÈ\u0093{=R\u0089Ä\n\u009aCàU(\u0006[þò#\u000e#ªcg\u0084îÞ{7\u001cëæñÃ\u0015Âbk¯LZ\u0095\u0005<3\u008fn\u0088lql\u0010\u0010\u008d\u0091*\u0015wY68\u0099R{ü\u0002¹¤Î\u0098\u0080¬N\u0081Î\u0094\u0003l\u0005Î\u0088¹ñ\"\u0016$©±ØÚz\u007fR]ò\u001cµ\u001cÖ¡\u009drUÛÿ|J\u0003\u0011F&\u0014ã\u0096\u000f0+\u0096\u0080\u0002\u000bÅ$ÉI·V¶Ì©¯Æ>Ì=aMgu\f\u0080Y¯\u009eõ\u0016B¯nx-rl)Q×i\u0003\u0019Ò)âuá¬\u0011¾\u0010\u0082c\u0081Gßâ\nJ\u00adÕß\u009e\u008bÁ\r\u001e\f;\u0083±ñ{ï\u009btZ/\u000fQ\u0088\u0095_\u0015\u0018>\u009c¨\u0005\u008dºl¤¿\u0005\u009eæ\u0090B\u009dFãÌ#÷T\u0012\u0007\u009eïê sV3\u0084\u0081U#\u009d\u007f\u0095Ì1þË\u0013{ÝtÕØ;þ§@9\bW@É\nÇ\u0017\u009cK1ôôGCq\u0011ÖlRØô°¼õÒ\u0007|@\u000bá)Á0\u0089\u000bb1\u0017 ©\u0080Ë#\\\u0000\u000f\u0015«Ì@såä¨E°z\u0003ª\u009eÅ\u00adV\u009c\u0091é¡¡\u000eú|Ø\u008f'×ª\\¹ø:zËP\u0007\u009fûÅ\u0085ç)û\u0007÷\u009cÈiF´Ï\u000f\f\u0012ò)ñA\u0089öC¥w\u009f-\u000f\u0080\u0006pÆH\fáö\u0015n0\u0015\u0015ý÷÷H\u0093/\u0096\u001cÞÚd\u0005\u0098§·.\b\u000eß;|g³Ê8ÿë\u008cpô\u0082\u0081\fb{\u0081\u009d±#Qä\u0097N¹`\u0014Ææ\u008c\u00adÏØð\u0092/Û\u0080±\u0082\u0082Øg\u0093w\u0083[\u0013UpÅ\u0081¦\u001a¬7Õ6Þ\u001cc¥Ö+zC\u0017\u0012\u0016]âU\u000f¹Û\u001a\u000eÏ\u001bµÉ¤º\u009auº\fÈÝk>Æ\u00ad\u0086\u0099K\u0097Ú9\u0005°¨(\u009e\u0007\u0012\f\u0014¤`a\u0089s,Ë\u001f8.%g»ÇK\u008a\u0013K©TÐf~Ü\u0018×1\u0014@\u0089øPí2cúatj\u0097seÊ\r#FFÌì\u007f\u008fÒ\u0083\u008dK\u0080D±;Àù<xZ;aä$2Î \u0013±âr\u0085\u0087k÷í{!\r\bÍ\u001cc6éÔ\u0013ûe/.³@ÝbåW6\u008eBcl\n1±^$\u0085ðÖ«]6\u0080¼f\u0000\\\u0012fk\u009da/¦\u008cMß\u001f{\u0012æ¼YtJ7oco\u001ehhgS×àº\u0098\u000e\u009f/ô×vø\u0080¹üD\u0092íÞ¢\u0005½\u0019ã]§\u0012Ø\u0085\u001c\u0082kR#ì\u0088\u0093g¢\u001eÁÕô\u0087ô\fñ\u008fLt\"ä\u001a°Ü¶½\u008e\u0005O\u0084½îl\u000e%Ü\u0096n\téC\u0095:Qþßqh\u0004Ñ\u001bQ,\u000e\u0007MØjhï.¡K\u007fm]\u0017·"
         .length();
      char var1 = 18;
      int var9 = -1;

      label52:
      while (true) {
         byte var10000 = 66;
         String var10001 = var2.substring(++var9, var9 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var28 = var10001.toCharArray();
               int var10004 = var28.length;
               int var6 = 0;
               byte var31 = var10000;
               var23 = var28;
               int var16 = var10004;
               byte var36;
               char[] var40;
               int var10006;
               if (var10004 <= 1) {
                  var40 = var28;
                  var36 = var10000;
                  var10006 = var6;
               } else {
                  var31 = var10000;
                  var16 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var40 = var28;
                  var36 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var40[var10006] = (char)(var40[var10006] ^ var36 ^ switch (var6 % 7) {
                     case 0 -> 31;
                     case 1 -> 6;
                     case 2 -> 17;
                     case 3 -> 98;
                     case 4 -> 78;
                     case 5 -> 15;
                     default -> 30;
                  });
                  var6++;
                  if (var31 == 0) {
                     var10006 = var31;
                     var40 = var23;
                     var36 = var31;
                  } else {
                     if (var16 <= var6) {
                        break;
                     }

                     var40 = var23;
                     var36 = var31;
                     var10006 = var6;
                  }
               }
            }

            String var33 = new String(var23).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var33;
                  if ((var9 += var1) >= var4) {
                     c = var5;
                     d = new String[50];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI();
                     String var11 = me.octo.client.llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a();
                     short var18 = -4812;
                     var10002 = -31877;
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var11 + "/miningdata";
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new Gson();
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a();
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                     lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        "", 0.0, 0.0, 0.0, 0.0, null, 0, false, 0.0, 0, 0, 2046, null
                     );
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
                     Integer[] var7 = new Integer[]{36, 27, 18, 9, 0};
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = CollectionsKt.listOf(var7);
                     break pxClinit;
                  }

                  var1 = var2.charAt(var9);
                  break;
               default:
                  var5[var3++] = var33;
                  if ((var9 += var1) < var4) {
                     var1 = var2.charAt(var9);
                     continue label52;
                  }

                  var2 = " ÐØqµ-\rúk?ß©/f¡«µÇ`9²¸$â\u0007Ò**èùjÅ";
                  var4 = " ÐØqµ-\rúk?ß©/f¡«µÇ`9²¸$â\u0007Ò**èùjÅ".length();
                  var1 = 24;
                  var9 = -1;
            }

            var10000 = 83;
            var10001 = var2.substring(++var9, var9 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static Throwable a(Throwable var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -4831) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 111;
            case 1 -> 189;
            case 2 -> 204;
            case 3 -> 64;
            case 4 -> 132;
            case 5 -> 250;
            case 6 -> 87;
            case 7 -> 249;
            case 8 -> 157;
            case 9 -> 253;
            case 10 -> 108;
            case 11 -> 55;
            case 12 -> 127;
            case 13 -> 4;
            case 14 -> 73;
            case 15 -> 164;
            case 16 -> 136;
            case 17 -> 181;
            case 18 -> 205;
            case 19 -> 114;
            case 20 -> 187;
            case 21 -> 60;
            case 22 -> 243;
            case 23 -> 186;
            case 24 -> 175;
            case 25 -> 143;
            case 26 -> 19;
            case 27 -> 77;
            case 28 -> 84;
            case 29 -> 2;
            case 30 -> 179;
            case 31 -> 212;
            case 32 -> 97;
            case 33 -> 56;
            case 34 -> 44;
            case 35 -> 75;
            case 36 -> 137;
            case 37 -> 133;
            case 38 -> 229;
            case 39 -> 36;
            case 40 -> 240;
            case 41 -> 6;
            case 42 -> 39;
            case 43 -> 82;
            case 44 -> 66;
            case 45 -> 246;
            case 46 -> 46;
            case 47 -> 210;
            case 48 -> 8;
            case 49 -> 124;
            case 50 -> 203;
            case 51 -> 177;
            case 52 -> 68;
            case 53 -> 167;
            case 54 -> 197;
            case 55 -> 33;
            case 56 -> 104;
            case 57 -> 140;
            case 58 -> 139;
            case 59 -> 224;
            case 60 -> 162;
            case 61 -> 135;
            case 62 -> 196;
            case 63 -> 107;
            case 64 -> 61;
            case 65 -> 242;
            case 66 -> 238;
            case 67 -> 163;
            case 68 -> 74;
            case 69 -> 191;
            case 70 -> 85;
            case 71 -> 195;
            case 72 -> 30;
            case 73 -> 70;
            case 74 -> 10;
            case 75 -> 54;
            case 76 -> 92;
            case 77 -> 166;
            case 78 -> 214;
            case 79 -> 220;
            case 80 -> 123;
            case 81 -> 3;
            case 82 -> 192;
            case 83 -> 199;
            case 84 -> 78;
            case 85 -> 52;
            case 86 -> 38;
            case 87 -> 50;
            case 88 -> 94;
            case 89 -> 198;
            case 90 -> 63;
            case 91 -> 202;
            case 92 -> 115;
            case 93 -> 106;
            case 94 -> 89;
            case 95 -> 151;
            case 96 -> 141;
            case 97 -> 226;
            case 98 -> 31;
            case 99 -> 131;
            case 100 -> 225;
            case 101 -> 11;
            case 102 -> 43;
            case 103 -> 228;
            case 104 -> 183;
            case 105 -> 142;
            case 106 -> 145;
            case 107 -> 0;
            case 108 -> 81;
            case 109 -> 173;
            case 110 -> 80;
            case 111 -> 112;
            case 112 -> 234;
            case 113 -> 182;
            case 114 -> 88;
            case 115 -> 129;
            case 116 -> 119;
            case 117 -> 40;
            case 118 -> 69;
            case 119 -> 208;
            case 120 -> 100;
            case 121 -> 27;
            case 122 -> 109;
            case 123 -> 57;
            case 124 -> 160;
            case 125 -> 98;
            case 126 -> 9;
            case 127 -> 159;
            case 128 -> 150;
            case 129 -> 76;
            case 130 -> 29;
            case 131 -> 95;
            case 132 -> 47;
            case 133 -> 213;
            case 134 -> 216;
            case 135 -> 251;
            case 136 -> 193;
            case 137 -> 180;
            case 138 -> 41;
            case 139 -> 190;
            case 140 -> 161;
            case 141 -> 176;
            case 142 -> 35;
            case 143 -> 45;
            case 144 -> 236;
            case 145 -> 219;
            case 146 -> 215;
            case 147 -> 17;
            case 148 -> 222;
            case 149 -> 172;
            case 150 -> 23;
            case 151 -> 118;
            case 152 -> 13;
            case 153 -> 101;
            case 154 -> 12;
            case 155 -> 72;
            case 156 -> 170;
            case 157 -> 25;
            case 158 -> 231;
            case 159 -> 15;
            case 160 -> 125;
            case 161 -> 207;
            case 162 -> 188;
            case 163 -> 34;
            case 164 -> 59;
            case 165 -> 22;
            case 166 -> 53;
            case 167 -> 18;
            case 168 -> 154;
            case 169 -> 248;
            case 170 -> 116;
            case 171 -> 5;
            case 172 -> 67;
            case 173 -> 16;
            case 174 -> 83;
            case 175 -> 241;
            case 176 -> 230;
            case 177 -> 28;
            case 178 -> 221;
            case 179 -> 62;
            case 180 -> 171;
            case 181 -> 24;
            case 182 -> 209;
            case 183 -> 200;
            case 184 -> 206;
            case 185 -> 178;
            case 186 -> 117;
            case 187 -> 96;
            case 188 -> 153;
            case 189 -> 223;
            case 190 -> 26;
            case 191 -> 113;
            case 192 -> 148;
            case 193 -> 149;
            case 194 -> 48;
            case 195 -> 218;
            case 196 -> 65;
            case 197 -> 58;
            case 198 -> 237;
            case 199 -> 168;
            case 200 -> 126;
            case 201 -> 79;
            case 202 -> 49;
            case 203 -> 121;
            case 204 -> 86;
            case 205 -> 71;
            case 206 -> 99;
            case 207 -> 146;
            case 208 -> 37;
            case 209 -> 144;
            case 210 -> 1;
            case 211 -> 90;
            case 212 -> 155;
            case 213 -> 7;
            case 214 -> 254;
            case 215 -> 102;
            case 216 -> 185;
            case 217 -> 245;
            case 218 -> 158;
            case 219 -> 227;
            case 220 -> 122;
            case 221 -> 42;
            case 222 -> 252;
            case 223 -> 201;
            case 224 -> 184;
            case 225 -> 169;
            case 226 -> 194;
            case 227 -> 105;
            case 228 -> 232;
            case 229 -> 244;
            case 230 -> 110;
            case 231 -> 93;
            case 232 -> 235;
            case 233 -> 21;
            case 234 -> 120;
            case 235 -> 233;
            case 236 -> 51;
            case 237 -> 14;
            case 238 -> 138;
            case 239 -> 247;
            case 240 -> 152;
            case 241 -> 130;
            case 242 -> 156;
            case 243 -> 128;
            case 244 -> 147;
            case 245 -> 239;
            case 246 -> 165;
            case 247 -> 91;
            case 248 -> 134;
            case 249 -> 255;
            case 250 -> 174;
            case 251 -> 32;
            case 252 -> 20;
            case 253 -> 211;
            case 254 -> 217;
            default -> 103;
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

   public static enum IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;

      public static llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[] a() {
         return (llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[])IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.clone();
      }

      public static llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(
         String var0
      ) {
         return Enum.valueOf(
            llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll> b() {
         return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[]{IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII};
      private static final EnumEntries<IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll> IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = kotlin.enums.EnumEntriesKt.enumEntries(IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
   
  // PX-FIX synth restored from jar bytecode
  // PX-FIX synth restored from jar bytecode: anewarray + getstatic*/aastore
  public static final me.octo.client.utils.llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[] c() { return new me.octo.client.utils.llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[] { IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII }; }
}

   @Serializable
   public static final class PXEvMid {
      // PX-FIX RC4-4: Kotlin default-args bridge restored from jar bytecode (descriptor (Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;Ljava/lang/String;DDDDLjava/lang/String;IZDIIILjava/lang/Object;)Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)
      public static PXEvMid a(PXEvMid self, java.lang.String p1, double p2, double p3, double p4, double p5, java.lang.String p6, int p7, boolean p8, double p9, int p10, int p11, int mask, java.lang.Object marker) {
      if ((mask & 1) != 0) { p1 = self.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
      if ((mask & 2) != 0) { p2 = self.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl; }
      if ((mask & 4) != 0) { p3 = self.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI; }
      if ((mask & 8) != 0) { p4 = self.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII; }
      if ((mask & 16) != 0) { p5 = self.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI; }
      if ((mask & 32) != 0) { p6 = self.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll; }
      if ((mask & 64) != 0) { p7 = self.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll; }
      if ((mask & 128) != 0) { p8 = self.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII; }
      if ((mask & 256) != 0) { p9 = self.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI; }
      if ((mask & 512) != 0) { p10 = self.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl; }
      if ((mask & 1024) != 0) { p11 = self.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI; }
      return self.a(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
      }
      @NotNull
      public static llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.PXEvMid.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @SerializedName("uuid")
      @NotNull
      private String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @SerializedName("miningSpeed")
      private double IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @SerializedName("professional")
      private double lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      @SerializedName("strongArm")
      private double IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      @SerializedName("eagerAdventurer")
      private double IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      @SerializedName("abilityType")
      @NotNull
      private String IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      @SerializedName("hotmLevel")
      private int lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      @SerializedName("cotm")
      private boolean IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      @SerializedName("coldResistance")
      private double llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      @SerializedName("greatExplorerLevel")
      private int lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      @SerializedName("efficientMiner")
      private int lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      private static String[] a;
      private static String[] b;

      public PXEvMid(
         @NotNull String var1,
         double var2,
         double var4,
         double var6,
         double var8,
         @NotNull String var10,
         int var11,
         boolean var12,
         double var13,
         int var15,
         int var16
      ) {
         short var10001 = 20397;
         short var10002 = 1776;
         Intrinsics.checkNotNullParameter(var1, "uuid");
         var10001 = 20410;
         var10002 = 30626;
         Intrinsics.checkNotNullParameter(var10, "abilityType");
         super();
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var2;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var6;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var8;
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var10;
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var11;
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var12;
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var13;
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var15;
         this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var16;
      }

      // PX-RESTORE pass119: Kotlin 序列化合成构造器（MiningDataCache，掩码 0x7FF 全字段必需），
      // 语义按 jar 字节码 <init>(ILjava/lang/String;DDDDLjava/lang/String;IZDIILSerializationConstructorMarker;)V 还原
      public PXEvMid(
         int var1,
         @NotNull String var2,
         double var3,
         double var5,
         double var7,
         double var9,
         @NotNull String var11,
         int var12,
         boolean var13,
         double var14,
         int var16,
         int var17,
         SerializationConstructorMarker var18
      ) {
         if ((var1 & 2047) != 2047) {
            PluginExceptionsKt.throwMissingFieldException(
               var1,
               2047,
               llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.getDescriptor()
            );
         }

         super();
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var5;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var7;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var9;
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var11;
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var12;
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var13;
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var14;
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var16;
         this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var17;
      }

      // PX-RESTORE pass119: Kotlin 序列化生成 writer（供 $llIIllll…$serializer.serialize 调用）
      public static final void a(
         @NotNull PXEvMid var0,
         @NotNull CompositeEncoder var1,
         @NotNull SerialDescriptor var2
      ) {
         var1.encodeStringElement(var2, 0, var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         var1.encodeDoubleElement(var2, 1, var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         var1.encodeDoubleElement(var2, 2, var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         var1.encodeDoubleElement(var2, 3, var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         var1.encodeDoubleElement(var2, 4, var0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
         var1.encodeStringElement(var2, 5, var0.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll);
         var1.encodeIntElement(var2, 6, var0.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll);
         var1.encodeBooleanElement(var2, 7, var0.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII);
         var1.encodeDoubleElement(var2, 8, var0.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI);
         var1.encodeIntElement(var2, 9, var0.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl);
         var1.encodeIntElement(var2, 10, var0.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI);
      }

      @NotNull
      public final String a() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final void a(@NotNull String var1) {
         short var10001 = 20407;
         short var10002 = 1410;
         Intrinsics.checkNotNullParameter(var1, "<set-?>");
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      }

      public final double b() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final void a(double var1) {
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
      }

      public final double c() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final void b(double var1) {
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var1;
      }

      public final double d() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final void c(double var1) {
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
      }

      public final double e() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final void d(double var1) {
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
      }

      @NotNull
      public final String f() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      public final void b(@NotNull String var1) {
         short var10001 = 20404;
         short var10002 = -32300;
         Intrinsics.checkNotNullParameter(var1, "<set-?>");
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var1;
      }

      public final int g() {
         return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      public final void a(int var1) {
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var1;
      }

      public final boolean h() {
         return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      public final void a(boolean var1) {
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var1;
      }

      public final double i() {
         return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }

      public final void e(double var1) {
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var1;
      }

      public final int j() {
         return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      }

      public final void b(int var1) {
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var1;
      }

      public final int k() {
         return this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      }

      public final void c(int var1) {
         this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var1;
      }

      @NotNull
      public final String l() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final double m() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final double n() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final double o() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final double p() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @NotNull
      public final String q() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      public final int r() {
         return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      public final boolean s() {
         return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      public final double t() {
         return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }

      public final int u() {
         return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      }

      public final int v() {
         return this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      }

      @NotNull
      public final llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.PXEvMid a(
         @NotNull String var1,
         double var2,
         double var4,
         double var6,
         double var8,
         @NotNull String var10,
         int var11,
         boolean var12,
         double var13,
         int var15,
         int var16
      ) {
         short var10001 = 20414;
         short var10002 = -10895;
         Intrinsics.checkNotNullParameter(var1, "uuid");
         var10001 = 20412;
         var10002 = 7693;
         Intrinsics.checkNotNullParameter(var10, "abilityType");
         return new llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.PXEvMid(
            var1, var2, var4, var6, var8, var10, var11, var12, var13, var15, var16
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 20408;
         int var1 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
         int var2 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
         double var3 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
         boolean var5 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
         int var6 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
         String var7 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         double var8 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         double var10 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         double var12 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         double var14 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         String var16 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         short var10001 = -21323;
         short var10002 = 20402;
         short var10003 = 4503;
         short var10004 = 20411;
         short var10005 = 19502;
         short var10006 = 20406;
         short var10007 = 2544;
         short var10008 = 20400;
         short var10009 = -13323;
         short var10010 = 20403;
         short var10011 = -9475;
         short var10012 = 20401;
         short var10013 = -23358;
         short var10014 = 20415;
         short var10015 = -24528;
         short var10016 = 20409;
         short var10017 = -32505;
         short var10018 = 20405;
         short var10019 = -509;
         short var10020 = 20413;
         short var10021 = -18642;
         return "MiningDataCache(uuid="
            + var16
            + ", miningSpeed="
            + var14
            + ", professional="
            + var12
            + ", strongArm="
            + var10
            + ", eagerAdventurer="
            + var8
            + ", abilityType="
            + var7
            + ", hotmLevel="
            + var6
            + ", cotm="
            + var5
            + ", coldResistance="
            + var3
            + ", greatExplorerLevel="
            + var2
            + ", efficientMiner="
            + var1
            + ")";
      }

      @Override
      public int hashCode() {
         IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
         int var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
         var2 = var2 * 31 + Double.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         var2 = var2 * 31 + Double.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         var2 = var2 * 31 + Double.hashCode(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         var2 = var2 * 31 + Double.hashCode(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
         var2 = var2 * 31 + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.hashCode();
         var2 = var2 * 31 + Integer.hashCode(this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll);
         var2 = var2 * 31 + Boolean.hashCode(this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII);
         var2 = var2 * 31 + Double.hashCode(this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI);
         var2 = var2 * 31 + Integer.hashCode(this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl);
         var2 = var2 * 31 + Integer.hashCode(this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI);
         if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
            IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.b(new int[1]);
         }

         return var2;
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int[] var2 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.PXEvMid
            )) {
               return false;
            }

            var10000 = var1;
         }

         llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.PXEvMid var3 = (llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.PXEvMid)var10000;
         int var4 = ((Intrinsics.areEqual(
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         )) ? 1 : 0);
         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = Double.compare(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            );
         }

         if (var2 != null) {
            if (var4 != 0) {
               return false;
            }

            var4 = Double.compare(
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            );
         }

         if (var2 != null) {
            if (var4 != 0) {
               return false;
            }

            var4 = Double.compare(
               this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
               var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            );
         }

         if (var2 != null) {
            if (var4 != 0) {
               return false;
            }

            var4 = Double.compare(
               this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
               var3.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            );
         }

         if (var2 != null) {
            if (var4 != 0) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
               var3.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
         }

         label114: {
            int var10001 = var3.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
            if (var2 != null) {
               if (var4 != var3.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) {
                  return false;
               }

               var4 = ((this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) ? 1 : 0);
               if (var2 == null) {
                  break label114;
               }

               var10001 = ((var3.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) ? 1 : 0);
            }

            if (var4 != var10001) {
               return false;
            }

            var4 = Double.compare(
               this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
               var3.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
            );
         }

         if (var2 != null) {
            if (var4 != 0) {
               return false;
            }

            var4 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
         }

         int var5 = var3.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
         if (var2 != null) {
            if (var4 != var3.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl) {
               return false;
            }

            var4 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
            if (var2 == null) {
               return (boolean)(this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI != 0);
            }

            var5 = var3.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
         }

         return !(var4 != var5);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[17];
         int var3 = 0;
         String var2 = "\u0096O¹\u0080[\u0091\u0089@Ê\u0085Ï\u009d(\u0012{\u0002<\u000b\u0013MáÀÒÏL\b7\bþ\u0007Ü.ö¥f\u0019 \u0004åÇ©l\u0011Ê\u00124\"&à\\ÎqÞk(Sº\u001b\u0000ö\u0015V3ç`òm\u0092\u0018{\u0088ýþµÑ\u0083æk¯\u001c\bÑ\u000f»ç\t\u0081ó(²\u0083}£ö\u009d\u007fWÀ\u000byß¬\u0092{\u0085yA\u0091!*\u00157~\u008f²ÜI\r~²õfl\u001dA²<¨\u001fzu\u0090\u0007'\u0093\u009d0\u0094\u0081\u000f\u0007\u0003\u0081\u0019r\u0004É\u001d\fËp\u0004u,yü\u0095ìì²_\f¦\u0006² \u0084¹\rÍ\u0083²\u008fa\u0012©\u0011^L¦ã\u0006«\tÍ\u0087¬\u000fh6\"/\u009b\u000eáÎS´\u008d\u0096·\u0018Z\nO,\u0098í";
         int var4 = "\u0096O¹\u0080[\u0091\u0089@Ê\u0085Ï\u009d(\u0012{\u0002<\u000b\u0013MáÀÒÏL\b7\bþ\u0007Ü.ö¥f\u0019 \u0004åÇ©l\u0011Ê\u00124\"&à\\ÎqÞk(Sº\u001b\u0000ö\u0015V3ç`òm\u0092\u0018{\u0088ýþµÑ\u0083æk¯\u001c\bÑ\u000f»ç\t\u0081ó(²\u0083}£ö\u009d\u007fWÀ\u000byß¬\u0092{\u0085yA\u0091!*\u00157~\u008f²ÜI\r~²õfl\u001dA²<¨\u001fzu\u0090\u0007'\u0093\u009d0\u0094\u0081\u000f\u0007\u0003\u0081\u0019r\u0004É\u001d\fËp\u0004u,yü\u0095ìì²_\f¦\u0006² \u0084¹\rÍ\u0083²\u008fa\u0012©\u0011^L¦ã\u0006«\tÍ\u0087¬\u000fh6\"/\u009b\u000eáÎS´\u008d\u0096·\u0018Z\nO,\u0098í"
            .length();
         char var1 = 17;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 123;
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
                        case 0 -> 108;
                        case 1 -> 34;
                        case 2 -> 62;
                        case 3 -> 123;
                        case 4 -> 16;
                        case 5 -> 57;
                        default -> 61;
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
                        a = var5;
                        b = new String[17];
                        IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.PXEvMid.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll((kotlin.jvm.internal.DefaultConstructorMarker) null);
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

                     var2 = "z¶FÚÏ^uÝ¥\u008d©\u0003°Õ\u0004¹ÁHÆ";
                     var4 = "z¶FÚÏ^uÝ¥\u008d©\u0003°Õ\u0004¹ÁHÆ".length();
                     var1 = 14;
                     var8 = -1;
               }

               var10000 = 112;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 20413) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 42;
               case 1 -> 4;
               case 2 -> 119;
               case 3 -> 126;
               case 4 -> 168;
               case 5 -> 72;
               case 6 -> 128;
               case 7 -> 165;
               case 8 -> 182;
               case 9 -> 34;
               case 10 -> 47;
               case 11 -> 6;
               case 12 -> 191;
               case 13 -> 33;
               case 14 -> 229;
               case 15 -> 18;
               case 16 -> 227;
               case 17 -> 91;
               case 18 -> 108;
               case 19 -> 161;
               case 20 -> 90;
               case 21 -> 192;
               case 22 -> 187;
               case 23 -> 224;
               case 24 -> 95;
               case 25 -> 88;
               case 26 -> 105;
               case 27 -> 127;
               case 28 -> 53;
               case 29 -> 122;
               case 30 -> 112;
               case 31 -> 64;
               case 32 -> 247;
               case 33 -> 70;
               case 34 -> 20;
               case 35 -> 139;
               case 36 -> 188;
               case 37 -> 190;
               case 38 -> 106;
               case 39 -> 228;
               case 40 -> 240;
               case 41 -> 55;
               case 42 -> 217;
               case 43 -> 244;
               case 44 -> 145;
               case 45 -> 159;
               case 46 -> 230;
               case 47 -> 31;
               case 48 -> 200;
               case 49 -> 215;
               case 50 -> 58;
               case 51 -> 214;
               case 52 -> 101;
               case 53 -> 40;
               case 54 -> 212;
               case 55 -> 41;
               case 56 -> 123;
               case 57 -> 117;
               case 58 -> 1;
               case 59 -> 153;
               case 60 -> 148;
               case 61 -> 107;
               case 62 -> 246;
               case 63 -> 206;
               case 64 -> 183;
               case 65 -> 169;
               case 66 -> 216;
               case 67 -> 85;
               case 68 -> 167;
               case 69 -> 23;
               case 70 -> 15;
               case 71 -> 198;
               case 72 -> 241;
               case 73 -> 220;
               case 74 -> 51;
               case 75 -> 221;
               case 76 -> 30;
               case 77 -> 43;
               case 78 -> 59;
               case 79 -> 14;
               case 80 -> 163;
               case 81 -> 179;
               case 82 -> 75;
               case 83 -> 5;
               case 84 -> 140;
               case 85 -> 152;
               case 86 -> 249;
               case 87 -> 243;
               case 88 -> 54;
               case 89 -> 98;
               case 90 -> 46;
               case 91 -> 97;
               case 92 -> 48;
               case 93 -> 63;
               case 94 -> 209;
               case 95 -> 103;
               case 96 -> 80;
               case 97 -> 45;
               case 98 -> 210;
               case 99 -> 114;
               case 100 -> 151;
               case 101 -> 83;
               case 102 -> 77;
               case 103 -> 203;
               case 104 -> 162;
               case 105 -> 44;
               case 106 -> 49;
               case 107 -> 208;
               case 108 -> 120;
               case 109 -> 36;
               case 110 -> 147;
               case 111 -> 27;
               case 112 -> 16;
               case 113 -> 196;
               case 114 -> 213;
               case 115 -> 160;
               case 116 -> 181;
               case 117 -> 180;
               case 118 -> 231;
               case 119 -> 233;
               case 120 -> 202;
               case 121 -> 157;
               case 122 -> 239;
               case 123 -> 68;
               case 124 -> 248;
               case 125 -> 131;
               case 126 -> 137;
               case 127 -> 118;
               case 128 -> 71;
               case 129 -> 129;
               case 130 -> 135;
               case 131 -> 158;
               case 132 -> 115;
               case 133 -> 144;
               case 134 -> 96;
               case 135 -> 154;
               case 136 -> 74;
               case 137 -> 66;
               case 138 -> 21;
               case 139 -> 104;
               case 140 -> 130;
               case 141 -> 100;
               case 142 -> 219;
               case 143 -> 89;
               case 144 -> 65;
               case 145 -> 204;
               case 146 -> 178;
               case 147 -> 236;
               case 148 -> 24;
               case 149 -> 11;
               case 150 -> 194;
               case 151 -> 78;
               case 152 -> 173;
               case 153 -> 2;
               case 154 -> 155;
               case 155 -> 146;
               case 156 -> 76;
               case 157 -> 197;
               case 158 -> 226;
               case 159 -> 57;
               case 160 -> 116;
               case 161 -> 56;
               case 162 -> 222;
               case 163 -> 94;
               case 164 -> 12;
               case 165 -> 32;
               case 166 -> 29;
               case 167 -> 195;
               case 168 -> 218;
               case 169 -> 254;
               case 170 -> 125;
               case 171 -> 245;
               case 172 -> 174;
               case 173 -> 143;
               case 174 -> 86;
               case 175 -> 87;
               case 176 -> 110;
               case 177 -> 37;
               case 178 -> 176;
               case 179 -> 207;
               case 180 -> 164;
               case 181 -> 52;
               case 182 -> 189;
               case 183 -> 177;
               case 184 -> 124;
               case 185 -> 7;
               case 186 -> 199;
               case 187 -> 193;
               case 188 -> 175;
               case 189 -> 79;
               case 190 -> 99;
               case 191 -> 132;
               case 192 -> 134;
               case 193 -> 113;
               case 194 -> 172;
               case 195 -> 39;
               case 196 -> 141;
               case 197 -> 205;
               case 198 -> 92;
               case 199 -> 170;
               case 200 -> 121;
               case 201 -> 253;
               case 202 -> 102;
               case 203 -> 73;
               case 204 -> 84;
               case 205 -> 25;
               case 206 -> 133;
               case 207 -> 156;
               case 208 -> 252;
               case 209 -> 17;
               case 210 -> 242;
               case 211 -> 251;
               case 212 -> 3;
               case 213 -> 8;
               case 214 -> 238;
               case 215 -> 166;
               case 216 -> 69;
               case 217 -> 201;
               case 218 -> 62;
               case 219 -> 232;
               case 220 -> 0;
               case 221 -> 22;
               case 222 -> 142;
               case 223 -> 9;
               case 224 -> 184;
               case 225 -> 225;
               case 226 -> 138;
               case 227 -> 109;
               case 228 -> 93;
               case 229 -> 171;
               case 230 -> 38;
               case 231 -> 136;
               case 232 -> 13;
               case 233 -> 19;
               case 234 -> 26;
               case 235 -> 28;
               case 236 -> 149;
               case 237 -> 111;
               case 238 -> 255;
               case 239 -> 185;
               case 240 -> 67;
               case 241 -> 186;
               case 242 -> 234;
               case 243 -> 82;
               case 244 -> 10;
               case 245 -> 61;
               case 246 -> 35;
               case 247 -> 211;
               case 248 -> 237;
               case 249 -> 235;
               case 250 -> 223;
               case 251 -> 50;
               case 252 -> 150;
               case 253 -> 60;
               case 254 -> 250;
               default -> 81;
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

      public static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
   public static me.octo.client.PXDyn llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll = null; // PX-FIX missing field v2
   
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(Object... px) {
        }

         private IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll() {
         }

         @NotNull
         public final KSerializer<llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.PXEvMid> a() {
      Object llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll = null; // PX-FIX
            return (KSerializer<llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.PXEvMid>)llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.PXEvMid.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         }
      }

      // PX-RESTORE pass119: Kotlin 序列化生成类（MiningDataCache 的 GeneratedSerializer），
      // 由 jar 字节码 $IllllIIlll…$llIIllll… 完整还原（serialize/deserialize/getDescriptor/childSerializers/clinit）
      public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
         implements GeneratedSerializer<PXEvMid> {
         public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         private static SerialDescriptor lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

         private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
         }

         public void a(@NotNull Encoder var1, @NotNull PXEvMid var2) {
            Intrinsics.checkNotNullParameter(var1, "encoder");
            Intrinsics.checkNotNullParameter(var2, "value");
            SerialDescriptor var3 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            CompositeEncoder var4 = var1.beginStructure(var3);
            PXEvMid.a(var2, var4, var3);
            var4.endStructure(var3);
         }

         @NotNull
         public PXEvMid a(@NotNull Decoder var1) {
            Intrinsics.checkNotNullParameter(var1, "decoder");
            SerialDescriptor var2 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            int var3 = 0;
            String var4 = null;
            double var5 = 0.0;
            double var6 = 0.0;
            double var7 = 0.0;
            double var8 = 0.0;
            String var9 = null;
            int var10 = 0;
            boolean var11 = false;
            double var12 = 0.0;
            int var13 = 0;
            int var14 = 0;
            CompositeDecoder var15 = var1.beginStructure(var2);

            while (true) {
               int var16 = var15.decodeElementIndex(var2);
               switch (var16) {
                  case -1:
                     break;
                  case 0:
                     var4 = var15.decodeStringElement(var2, 0);
                     var3 |= 1;
                     continue;
                  case 1:
                     var5 = var15.decodeDoubleElement(var2, 1);
                     var3 |= 2;
                     continue;
                  case 2:
                     var6 = var15.decodeDoubleElement(var2, 2);
                     var3 |= 4;
                     continue;
                  case 3:
                     var7 = var15.decodeDoubleElement(var2, 3);
                     var3 |= 8;
                     continue;
                  case 4:
                     var8 = var15.decodeDoubleElement(var2, 4);
                     var3 |= 16;
                     continue;
                  case 5:
                     var9 = var15.decodeStringElement(var2, 5);
                     var3 |= 32;
                     continue;
                  case 6:
                     var10 = var15.decodeIntElement(var2, 6);
                     var3 |= 64;
                     continue;
                  case 7:
                     var11 = var15.decodeBooleanElement(var2, 7);
                     var3 |= 128;
                     continue;
                  case 8:
                     var12 = var15.decodeDoubleElement(var2, 8);
                     var3 |= 256;
                     continue;
                  case 9:
                     var13 = var15.decodeIntElement(var2, 9);
                     var3 |= 512;
                     continue;
                  case 10:
                     var14 = var15.decodeIntElement(var2, 10);
                     var3 |= 1024;
                     continue;
                  default:
                     throw new UnknownFieldException(var16);
               }

               break;
            }

            var15.endStructure(var2);
            return new PXEvMid(
               var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, (SerializationConstructorMarker)null
            );
         }

         @NotNull
         public SerialDescriptor getDescriptor() {
            return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         @NotNull
         public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{
               StringSerializer.INSTANCE,
               DoubleSerializer.INSTANCE,
               DoubleSerializer.INSTANCE,
               DoubleSerializer.INSTANCE,
               DoubleSerializer.INSTANCE,
               StringSerializer.INSTANCE,
               IntSerializer.INSTANCE,
               BooleanSerializer.INSTANCE,
               DoubleSerializer.INSTANCE,
               IntSerializer.INSTANCE,
               IntSerializer.INSTANCE
            };
         }

         @NotNull
         public KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.super.typeParametersSerializers();
         }

         public void serialize(@NotNull Encoder var1, @NotNull PXEvMid var2) {
            this.a(var1, var2);
         }

         @NotNull
         public PXEvMid deserialize(@NotNull Decoder var1) {
            return this.a(var1);
         }

         static {
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll();
            PluginGeneratedSerialDescriptor var0 = new PluginGeneratedSerialDescriptor(
               "MiningDataCache",
               (GeneratedSerializer)IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               11
            );
            var0.addElement("uuid", false);
            var0.addElement("miningSpeed", false);
            var0.addElement("professional", false);
            var0.addElement("strongArm", false);
            var0.addElement("eagerAdventurer", false);
            var0.addElement("abilityType", false);
            var0.addElement("hotmLevel", false);
            var0.addElement("cotm", false);
            var0.addElement("coldResistance", false);
            var0.addElement("greatExplorerLevel", false);
            var0.addElement("efficientMiner", false);
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = (SerialDescriptor)var0;
         }
      }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX RC4-46: masked default-arg constructor restored from jar bytecode (descriptor (Ljava/lang/String;DDDDLme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;IZDIIILkotlin/jvm/internal/DefaultConstructorMarker;)V)
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(java.lang.String p1, double p2, double p3, double p4, double p5, me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.PXEvMid p6, int p7, boolean p8, double p9, int p10, int p11, int mask, kotlin.jvm.internal.DefaultConstructorMarker marker) {
      if ((mask & 1) != 0) { p1 = ""; }
      if ((mask & 2) != 0) { p2 = 0D; }
      if ((mask & 4) != 0) { p3 = 0D; }
      if ((mask & 8) != 0) { p4 = 0D; }
      if ((mask & 16) != 0) { p5 = 0D; }
      if ((mask & 32) != 0) { p6 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.PXEvMid.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII; }
      if ((mask & 64) != 0) { p7 = 10; }
      if ((mask & 128) != 0) { p8 = false; }
      if ((mask & 256) != 0) { p9 = 0D; }
      if ((mask & 512) != 0) { p10 = 0; }
      if ((mask & 1024) != 0) { p11 = 0; }
      this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
        }
        // PX-FIX RC4-46: Kotlin default-args bridge restored from jar bytecode (descriptor (Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;Ljava/lang/String;DDDDLme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;IZDIIILjava/lang/Object;)Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;)
        public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll self, java.lang.String p1, double p2, double p3, double p4, double p5, me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.PXEvMid p6, int p7, boolean p8, double p9, int p10, int p11, int mask, java.lang.Object marker) {
      if ((mask & 1) != 0) { p1 = self.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
      if ((mask & 2) != 0) { p2 = self.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
      if ((mask & 4) != 0) { p3 = self.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl; }
      if ((mask & 8) != 0) { p4 = self.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI; }
      if ((mask & 16) != 0) { p5 = self.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII; }
      if ((mask & 32) != 0) { p6 = self.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI; }
      if ((mask & 64) != 0) { p7 = self.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll; }
      if ((mask & 128) != 0) { p8 = self.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll; }
      if ((mask & 256) != 0) { p9 = self.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII; }
      if ((mask & 512) != 0) { p10 = self.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI; }
      if ((mask & 1024) != 0) { p11 = self.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl; }
      return self.a(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
        }
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

      @NotNull
      private String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private double lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private double IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private double lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private double IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      @NotNull
      private lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.PXEvMid IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private int IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private boolean lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      private double IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      private int llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      private int lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         @NotNull String var1,
         double var2,
         double var4,
         double var6,
         double var8,
         @NotNull lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.PXEvMid var10,
         int var11,
         boolean var12,
         double var13,
         int var15,
         int var16
      ) {
         short var10001 = 10984;
         short var10002 = -23126;
         Intrinsics.checkNotNullParameter(var1, "uuid");
         var10001 = 10980;
         var10002 = -32088;
         Intrinsics.checkNotNullParameter(var10, "abilityType");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var4;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var6;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var8;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var10;
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var11;
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var12;
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var13;
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var15;
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var16;
      }

      @NotNull
      public final String a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final void a(@NotNull String var1) {
         short var10001 = 10981;
         short var10002 = -5696;
         Intrinsics.checkNotNullParameter(var1, "<set-?>");
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      }

      public final double b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final void a(double var1) {
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      }

      public final double c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final void b(double var1) {
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
      }

      public final double d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final void c(double var1) {
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var1;
      }

      public final double e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final void d(double var1) {
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
      }

      @NotNull
      public final lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.PXEvMid f() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final void a(
         @NotNull lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.PXEvMid var1
      ) {
         short var10001 = 11000;
         short var10002 = 13681;
         Intrinsics.checkNotNullParameter(var1, "<set-?>");
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
      }

      public final int g() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      public final void a(int var1) {
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var1;
      }

      public final boolean h() {
         return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      public final void a(boolean var1) {
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var1;
      }

      public final double i() {
         return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      public final void e(double var1) {
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var1;
      }

      public final int j() {
         return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }

      public final void b(int var1) {
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var1;
      }

      public final int k() {
         return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      }

      public final void c(int var1) {
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var1;
      }

      @NotNull
      public final String l() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final double m() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final double n() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final double o() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final double p() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @NotNull
      public final lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.PXEvMid q() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final int r() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      public final boolean s() {
         return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      public final double t() {
         return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      public final int u() {
         return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }

      public final int v() {
         return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      }

      @NotNull
      public final llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         @NotNull String var1,
         double var2,
         double var4,
         double var6,
         double var8,
         @NotNull lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.PXEvMid var10,
         int var11,
         boolean var12,
         double var13,
         int var15,
         int var16
      ) {
      Object llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll = null; // PX-FIX
         short var10001 = 10986;
         short var10002 = 2324;
         Intrinsics.checkNotNullParameter(var1, "uuid");
         var10001 = 10987;
         var10002 = 13191;
         Intrinsics.checkNotNullParameter(var10, "abilityType");
         return new llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2, var4, var6, var8, var10, var11, var12, var13, var15, var16
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 10991;
         int var1 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
         int var2 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
         double var3 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
         boolean var5 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
         int var6 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.PXEvMid var7 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         double var8 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         double var10 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         double var12 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         double var14 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         String var16 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -13650;
         short var10002 = 10990;
         short var10003 = 19473;
         short var10004 = 10983;
         short var10005 = 11310;
         short var10006 = 10978;
         short var10007 = 25133;
         short var10008 = 10977;
         short var10009 = 26669;
         short var10010 = 10979;
         short var10011 = -3560;
         short var10012 = 10989;
         short var10013 = -9139;
         short var10014 = 10985;
         short var10015 = -8508;
         short var10016 = 10982;
         short var10017 = 15143;
         short var10018 = 10976;
         short var10019 = -12451;
         short var10020 = 10988;
         short var10021 = -22059;
         return "MiningCache(uuid="
            + var16
            + ", miningSpeed="
            + var14
            + ", professional="
            + var12
            + ", strongArm="
            + var10
            + ", eagerAdventurer="
            + var8
            + ", abilityType="
            + var7
            + ", hotmLevel="
            + var6
            + ", cotm="
            + var5
            + ", coldResistance="
            + var3
            + ", greatExplorerLevel="
            + var2
            + ", efficientMiner="
            + var1
            + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         var1 = var1 * 31 + Double.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         var1 = var1 * 31 + Double.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         var1 = var1 * 31 + Double.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         var1 = var1 * 31 + Double.hashCode(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         var1 = var1 * 31 + this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.hashCode();
         var1 = var1 * 31 + Integer.hashCode(this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll);
         var1 = var1 * 31 + Boolean.hashCode(this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll);
         var1 = var1 * 31 + Double.hashCode(this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII);
         var1 = var1 * 31 + Integer.hashCode(this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI);
         return var1 * 31 + Integer.hashCode(this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
      Object var6 = null; // PX-FIX
      Object llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll = null; // PX-FIX
         int[] var2 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
         llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = (llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = (llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var1;
         }

         llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = var10000;
         int var4 = ((Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )) ? 1 : 0);
         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = Double.compare(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
         }

         if (var2 != null) {
            if (var4 != 0) {
               return false;
            }

            var4 = Double.compare(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            );
         }

         if (var2 != null) {
            if (var4 != 0) {
               return false;
            }

            var4 = Double.compare(
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            );
         }

         label116: {
            if (var2 != null) {
               if (var4 != 0) {
                  return false;
               }

               var10000 = this;
               if (var2 == null) {
                  break label116;
               }

               var4 = Double.compare(
                  this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
                  var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
               );
            }

            if (var4 != 0) {
               return false;
            }

            var10000 = this;
         }

         if (var2 != null) {
            if (var10000.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               != var3.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
               return false;
            }

            var10000 = this;
         }

         label118: {
            var6 = var10000.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
            int var10001 = var3.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
            if (var2 != null) {
               if (var10000.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
                  != var3.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
                  return false;
               }

               var6 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
               if (var2 == null) {
                  break label118;
               }

               var10001 = ((var3.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) ? 1 : 0);
            }

            if ((Boolean)var6 != ((var10001 == 0))) {
               return false;
            }

            var6 = Double.compare(
               this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
               var3.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            );
         }

         if (var2 != null) {
            if (!((Boolean)var6)) {
               return false;
            }

            var6 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
         }

         int var7 = var3.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
         if (var2 != null) {
            if ((Boolean)var6 != ((var3.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI == 0))) {
               return false;
            }

            var6 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
            if (var2 == null) {
               return (boolean)(this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl != 0);
            }

            var7 = var3.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
         }

         return (boolean)(Object)((Boolean)var6 != ((var7 == 0)) ? 0 : 1);
      }

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
         this(null, 0.0, 0.0, 0.0, 0.0, null, 0, false, 0.0, 0, 0, 2047, null);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[17];
         int var3 = 0;
         String var2 = "\u0095²\u0084À\u00071+h\u0007ï\u009dh\u0004\u008a½g!\u000b\u00adN\u0015¢\u0016S\u00adRÙ`!\u0011Ñ5rÍxè\u0094¦»zã8}ß\u0018is\f³\u00123 îy9\u001c×«\u0007\u0018\u000eW\"ª b»ÓÂÉ'Lf¶j\u0011h\u008c\u0003\u00954\u00034\u001c\u008d\"ò\u0090p\u0018*ÿ¸\u0015éKw\u0016\u0099\rÜ?ZþyW._\u001d-~?ú¡ù\u0012!Ül÷ºDü\u0096\u0084I4f©H+ô¯C\f!Æz¡¹37\u0015GßÅc\u000e\u001e\b\u008fnL\u001dö  >\u0012ðã\u000f\u000bé¼\u009dü\u0007\u0098\u008f+\u009dO©\u0007ÎÔ\u0083Ú\r\fE\u0011§»º\u0015\u00adÖTÁ¢\u001c\u0013*\u008c\u0083)õ\u0093";
         int var4 = "\u0095²\u0084À\u00071+h\u0007ï\u009dh\u0004\u008a½g!\u000b\u00adN\u0015¢\u0016S\u00adRÙ`!\u0011Ñ5rÍxè\u0094¦»zã8}ß\u0018is\f³\u00123 îy9\u001c×«\u0007\u0018\u000eW\"ª b»ÓÂÉ'Lf¶j\u0011h\u008c\u0003\u00954\u00034\u001c\u008d\"ò\u0090p\u0018*ÿ¸\u0015éKw\u0016\u0099\rÜ?ZþyW._\u001d-~?ú¡ù\u0012!Ül÷ºDü\u0096\u0084I4f©H+ô¯C\f!Æz¡¹37\u0015GßÅc\u000e\u001e\b\u008fnL\u001dö  >\u0012ðã\u000f\u000bé¼\u009dü\u0007\u0098\u008f+\u009dO©\u0007ÎÔ\u0083Ú\r\fE\u0011§»º\u0015\u00adÖTÁ¢\u001c\u0013*\u008c\u0083)õ\u0093"
            .length();
         char var1 = 4;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 18;
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
                        case 0 -> 70;
                        case 1 -> 122;
                        case 2 -> 28;
                        case 3 -> 54;
                        case 4 -> 74;
                        case 5 -> 4;
                        default -> 75;
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
                        a = var5;
                        b = new String[17];
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

                     var2 = "\u0086´Û¿¥iW4E ¥á\u0093÷Â\u0007Üó\u0097hÙ\f\u0089";
                     var4 = "\u0086´Û¿¥iW4E ¥á\u0093÷Â\u0007Üó\u0097hÙ\f\u0089".length();
                     var1 = 15;
                     var8 = -1;
               }

               var10000 = 107;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 10984) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 143;
               case 1 -> 196;
               case 2 -> 65;
               case 3 -> 226;
               case 4 -> 138;
               case 5 -> 85;
               case 6 -> 114;
               case 7 -> 116;
               case 8 -> 93;
               case 9 -> 10;
               case 10 -> 232;
               case 11 -> 98;
               case 12 -> 145;
               case 13 -> 124;
               case 14 -> 172;
               case 15 -> 76;
               case 16 -> 132;
               case 17 -> 73;
               case 18 -> 59;
               case 19 -> 156;
               case 20 -> 202;
               case 21 -> 50;
               case 22 -> 151;
               case 23 -> 9;
               case 24 -> 236;
               case 25 -> 69;
               case 26 -> 254;
               case 27 -> 235;
               case 28 -> 216;
               case 29 -> 79;
               case 30 -> 208;
               case 31 -> 184;
               case 32 -> 4;
               case 33 -> 247;
               case 34 -> 54;
               case 35 -> 190;
               case 36 -> 142;
               case 37 -> 253;
               case 38 -> 99;
               case 39 -> 170;
               case 40 -> 83;
               case 41 -> 100;
               case 42 -> 237;
               case 43 -> 219;
               case 44 -> 49;
               case 45 -> 191;
               case 46 -> 90;
               case 47 -> 23;
               case 48 -> 78;
               case 49 -> 223;
               case 50 -> 133;
               case 51 -> 14;
               case 52 -> 92;
               case 53 -> 182;
               case 54 -> 94;
               case 55 -> 66;
               case 56 -> 249;
               case 57 -> 95;
               case 58 -> 75;
               case 59 -> 193;
               case 60 -> 61;
               case 61 -> 185;
               case 62 -> 205;
               case 63 -> 63;
               case 64 -> 135;
               case 65 -> 194;
               case 66 -> 187;
               case 67 -> 248;
               case 68 -> 3;
               case 69 -> 42;
               case 70 -> 157;
               case 71 -> 179;
               case 72 -> 39;
               case 73 -> 128;
               case 74 -> 178;
               case 75 -> 144;
               case 76 -> 252;
               case 77 -> 244;
               case 78 -> 180;
               case 79 -> 136;
               case 80 -> 30;
               case 81 -> 41;
               case 82 -> 29;
               case 83 -> 127;
               case 84 -> 233;
               case 85 -> 82;
               case 86 -> 250;
               case 87 -> 175;
               case 88 -> 186;
               case 89 -> 18;
               case 90 -> 241;
               case 91 -> 101;
               case 92 -> 206;
               case 93 -> 35;
               case 94 -> 62;
               case 95 -> 217;
               case 96 -> 55;
               case 97 -> 119;
               case 98 -> 251;
               case 99 -> 201;
               case 100 -> 214;
               case 101 -> 123;
               case 102 -> 231;
               case 103 -> 37;
               case 104 -> 70;
               case 105 -> 20;
               case 106 -> 243;
               case 107 -> 5;
               case 108 -> 141;
               case 109 -> 51;
               case 110 -> 86;
               case 111 -> 56;
               case 112 -> 13;
               case 113 -> 108;
               case 114 -> 221;
               case 115 -> 234;
               case 116 -> 120;
               case 117 -> 212;
               case 118 -> 68;
               case 119 -> 162;
               case 120 -> 224;
               case 121 -> 238;
               case 122 -> 104;
               case 123 -> 117;
               case 124 -> 36;
               case 125 -> 255;
               case 126 -> 96;
               case 127 -> 215;
               case 128 -> 242;
               case 129 -> 165;
               case 130 -> 88;
               case 131 -> 147;
               case 132 -> 171;
               case 133 -> 44;
               case 134 -> 168;
               case 135 -> 183;
               case 136 -> 109;
               case 137 -> 107;
               case 138 -> 220;
               case 139 -> 174;
               case 140 -> 210;
               case 141 -> 149;
               case 142 -> 115;
               case 143 -> 177;
               case 144 -> 33;
               case 145 -> 140;
               case 146 -> 126;
               case 147 -> 229;
               case 148 -> 121;
               case 149 -> 91;
               case 150 -> 112;
               case 151 -> 211;
               case 152 -> 228;
               case 153 -> 58;
               case 154 -> 26;
               case 155 -> 25;
               case 156 -> 6;
               case 157 -> 77;
               case 158 -> 129;
               case 159 -> 32;
               case 160 -> 176;
               case 161 -> 71;
               case 162 -> 27;
               case 163 -> 38;
               case 164 -> 87;
               case 165 -> 137;
               case 166 -> 89;
               case 167 -> 113;
               case 168 -> 12;
               case 169 -> 203;
               case 170 -> 48;
               case 171 -> 167;
               case 172 -> 213;
               case 173 -> 2;
               case 174 -> 31;
               case 175 -> 148;
               case 176 -> 227;
               case 177 -> 57;
               case 178 -> 198;
               case 179 -> 155;
               case 180 -> 21;
               case 181 -> 84;
               case 182 -> 53;
               case 183 -> 218;
               case 184 -> 150;
               case 185 -> 103;
               case 186 -> 74;
               case 187 -> 1;
               case 188 -> 139;
               case 189 -> 204;
               case 190 -> 60;
               case 191 -> 125;
               case 192 -> 80;
               case 193 -> 246;
               case 194 -> 64;
               case 195 -> 17;
               case 196 -> 97;
               case 197 -> 47;
               case 198 -> 19;
               case 199 -> 197;
               case 200 -> 225;
               case 201 -> 181;
               case 202 -> 46;
               case 203 -> 195;
               case 204 -> 158;
               case 205 -> 24;
               case 206 -> 110;
               case 207 -> 166;
               case 208 -> 11;
               case 209 -> 45;
               case 210 -> 209;
               case 211 -> 102;
               case 212 -> 188;
               case 213 -> 207;
               case 214 -> 200;
               case 215 -> 240;
               case 216 -> 16;
               case 217 -> 161;
               case 218 -> 173;
               case 219 -> 169;
               case 220 -> 199;
               case 221 -> 134;
               case 222 -> 105;
               case 223 -> 22;
               case 224 -> 192;
               case 225 -> 7;
               case 226 -> 15;
               case 227 -> 152;
               case 228 -> 189;
               case 229 -> 40;
               case 230 -> 163;
               case 231 -> 130;
               case 232 -> 245;
               case 233 -> 154;
               case 234 -> 146;
               case 235 -> 28;
               case 236 -> 81;
               case 237 -> 52;
               case 238 -> 118;
               case 239 -> 230;
               case 240 -> 0;
               case 241 -> 164;
               case 242 -> 67;
               case 243 -> 72;
               case 244 -> 8;
               case 245 -> 43;
               case 246 -> 106;
               case 247 -> 122;
               case 248 -> 153;
               case 249 -> 239;
               case 250 -> 159;
               case 251 -> 111;
               case 252 -> 34;
               case 253 -> 160;
               case 254 -> 222;
               default -> 131;
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
   }
}
