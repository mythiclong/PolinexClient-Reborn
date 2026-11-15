package me.octo.client;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.Json.Default;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI {
   public static CompletableFuture<IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid> a(
      IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI p0,
      String p1,
      long p2,
      int p3,
      Object p4
   ) {
      if ((p3 & 2) != 0) {
         p2 = 7500L;
      }
      return p0.a(p1, p2);
   } // SYN3-defaultarg

   public static CompletableFuture<IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid> b(
      IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI p0,
      String p1,
      long p2,
      int p3,
      Object p4
   ) {
      if ((p3 & 2) != 0) {
         p2 = 7500L;
      }
      return p0.b(p1, p2);
   } // SYN3-defaultarg

   @NotNull
   public static IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static AtomicBoolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static ScheduledExecutorService IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static ConcurrentHashMap<String, IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static Json IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static String[] a;
   private static String[] b;

   private IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI() {
   }

   @JvmStatic
   public static final void a(@NotNull JsonObject param0) {
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.q ()I
      // 003: aload 0
      // 004: sipush -2960
      // 007: sipush -26752
      // 00a: pop2
      // 00b: ldc "json"
      // 00d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 010: istore 1
      // 011: nop
      // 012: iload 1
      // 013: ifeq 055
      // 016: aload 0
      // 017: sipush -2957
      // 01a: sipush 15903
      // 01d: pop2
      // 01e: ldc "status"
      // 020: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 023: checkcast kotlinx/serialization/json/JsonElement
      // 026: dup
      // 027: ifnull 04d
      // 02a: goto 031
      // 02d: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 030: athrow
      // 031: invokestatic kotlinx/serialization/json/JsonElementKt.getJsonPrimitive (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;
      // 034: dup
      // 035: ifnull 04d
      // 038: goto 03f
      // 03b: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03e: athrow
      // 03f: invokestatic kotlinx/serialization/json/JsonElementKt.getContentOrNull (Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;
      // 042: dup
      // 043: ifnonnull 05e
      // 046: goto 04d
      // 049: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04c: athrow
      // 04d: pop
      // 04e: goto 055
      // 051: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 054: athrow
      // 055: sipush -3003
      // 058: sipush -23135
      // 05b: pop2
      // 05c: ldc "unknown"
      // 05e: astore 2
      // 05f: aload 0
      // 060: sipush -3006
      // 063: sipush 21085
      // 066: pop2
      // 067: ldc "item_id"
      // 069: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 06c: checkcast kotlinx/serialization/json/JsonElement
      // 06f: dup
      // 070: iload 1
      // 071: ifeq 0d4
      // 074: ifnull 0b0
      // 077: goto 07e
      // 07a: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07d: athrow
      // 07e: invokestatic kotlinx/serialization/json/JsonElementKt.getJsonPrimitive (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;
      // 081: dup
      // 082: iload 1
      // 083: ifeq 0d4
      // 086: goto 08d
      // 089: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08c: athrow
      // 08d: ifnull 0b0
      // 090: goto 097
      // 093: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 096: athrow
      // 097: invokestatic kotlinx/serialization/json/JsonElementKt.getContentOrNull (Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;
      // 09a: iload 1
      // 09b: ifeq 0d0
      // 09e: goto 0a5
      // 0a1: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a4: athrow
      // 0a5: dup
      // 0a6: ifnonnull 106
      // 0a9: goto 0b0
      // 0ac: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0af: athrow
      // 0b0: pop
      // 0b1: iload 1
      // 0b2: ifeq 0f0
      // 0b5: goto 0bc
      // 0b8: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bb: athrow
      // 0bc: aload 0
      // 0bd: sipush -2952
      // 0c0: sipush 25281
      // 0c3: pop2
      // 0c4: ldc "itemId"
      // 0c6: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0c9: goto 0d0
      // 0cc: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cf: athrow
      // 0d0: checkcast kotlinx/serialization/json/JsonElement
      // 0d3: dup
      // 0d4: ifnull 0ef
      // 0d7: invokestatic kotlinx/serialization/json/JsonElementKt.getJsonPrimitive (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;
      // 0da: dup
      // 0db: ifnull 0ef
      // 0de: goto 0e5
      // 0e1: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e4: athrow
      // 0e5: invokestatic kotlinx/serialization/json/JsonElementKt.getContentOrNull (Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;
      // 0e8: goto 0f1
      // 0eb: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ee: athrow
      // 0ef: pop
      // 0f0: aconst_null
      // 0f1: dup
      // 0f2: ifnonnull 106
      // 0f5: pop
      // 0f6: sipush -2996
      // 0f9: sipush 16634
      // 0fc: pop2
      // 0fd: ldc "unknown"
      // 0ff: goto 106
      // 102: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 105: athrow
      // 106: astore 3
      // 107: aload 0
      // 108: sipush -2973
      // 10b: sipush -17700
      // 10e: pop2
      // 10f: ldc "recipe"
      // 111: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 114: checkcast kotlinx/serialization/json/JsonElement
      // 117: astore 4
      // 119: iload 1
      // 11a: ifeq 151
      // 11d: aload 0
      // 11e: sipush -3002
      // 121: sipush -31644
      // 124: pop2
      // 125: ldc "message"
      // 127: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 12a: checkcast kotlinx/serialization/json/JsonElement
      // 12d: dup
      // 12e: ifnull 150
      // 131: goto 138
      // 134: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 137: athrow
      // 138: invokestatic kotlinx/serialization/json/JsonElementKt.getJsonPrimitive (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;
      // 13b: dup
      // 13c: ifnull 150
      // 13f: goto 146
      // 142: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 145: athrow
      // 146: invokestatic kotlinx/serialization/json/JsonElementKt.getContentOrNull (Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;
      // 149: goto 152
      // 14c: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14f: athrow
      // 150: pop
      // 151: aconst_null
      // 152: astore 5
      // 154: aload 2
      // 155: sipush -2948
      // 158: sipush 27257
      // 15b: pop2
      // 15c: ldc "success"
      // 15e: iload 1
      // 15f: ifeq 185
      // 162: bipush 1
      // 163: invokestatic kotlin/text/StringsKt.equals (Ljava/lang/String;Ljava/lang/String;Z)Z
      // 166: ifne 1bb
      // 169: goto 170
      // 16c: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16f: athrow
      // 170: aload 5
      // 172: iload 1
      // 173: ifeq 1b3
      // 176: goto 17d
      // 179: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17c: athrow
      // 17d: dup
      // 17e: goto 185
      // 181: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 184: athrow
      // 185: ifnonnull 1a0
      // 188: pop
      // 189: aload 3
      // 18a: sipush -2947
      // 18d: sipush -31801
      // 190: pop2
      // 191: ldc "Failed to fetch recipe for "
      // 193: swap
      // 194: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 199: goto 1a0
      // 19c: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19f: athrow
      // 1a0: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.h (Ljava/lang/String;)V
      // 1a3: getstatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lkotlinx/serialization/json/Json;
      // 1a6: getstatic kotlinx/serialization/json/JsonElement.Companion Lkotlinx/serialization/json/JsonElement$Companion;
      // 1a9: invokevirtual kotlinx/serialization/json/JsonElement$Companion.serializer ()Lkotlinx/serialization/KSerializer;
      // 1ac: checkcast kotlinx/serialization/SerializationStrategy
      // 1af: aload 0
      // 1b0: invokevirtual kotlinx/serialization/json/Json.encodeToString (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;
      // 1b3: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 1b6: swap
      // 1b7: invokevirtual java/io/PrintStream.println (Ljava/lang/Object;)V
      // 1ba: return
      // 1bb: aload 4
      // 1bd: iload 1
      // 1be: ifeq 1cd
      // 1c1: ifnull 1d3
      // 1c4: goto 1cb
      // 1c7: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ca: athrow
      // 1cb: aload 4
      // 1cd: instanceof kotlinx/serialization/json/JsonNull
      // 1d0: ifeq 202
      // 1d3: aload 3
      // 1d4: sipush -3004
      // 1d7: sipush 6372
      // 1da: pop2
      // 1db: ldc "No recipe found for "
      // 1dd: swap
      // 1de: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 1e3: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.j (Ljava/lang/String;)V
      // 1e6: getstatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lkotlinx/serialization/json/Json;
      // 1e9: getstatic kotlinx/serialization/json/JsonElement.Companion Lkotlinx/serialization/json/JsonElement$Companion;
      // 1ec: invokevirtual kotlinx/serialization/json/JsonElement$Companion.serializer ()Lkotlinx/serialization/KSerializer;
      // 1ef: checkcast kotlinx/serialization/SerializationStrategy
      // 1f2: aload 0
      // 1f3: invokevirtual kotlinx/serialization/json/Json.encodeToString (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;
      // 1f6: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 1f9: swap
      // 1fa: invokevirtual java/io/PrintStream.println (Ljava/lang/Object;)V
      // 1fd: return
      // 1fe: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 201: athrow
      // 202: aload 3
      // 203: sipush -3001
      // 206: sipush -7203
      // 209: pop2
      // 20a: ldc "Recipe fetched for "
      // 20c: swap
      // 20d: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 212: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.i (Ljava/lang/String;)V
      // 215: getstatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lkotlinx/serialization/json/Json;
      // 218: getstatic kotlinx/serialization/json/JsonElement.Companion Lkotlinx/serialization/json/JsonElement$Companion;
      // 21b: invokevirtual kotlinx/serialization/json/JsonElement$Companion.serializer ()Lkotlinx/serialization/KSerializer;
      // 21e: checkcast kotlinx/serialization/SerializationStrategy
      // 221: aload 4
      // 223: invokevirtual kotlinx/serialization/json/Json.encodeToString (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;
      // 226: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 229: swap
      // 22a: invokevirtual java/io/PrintStream.println (Ljava/lang/Object;)V
      // 22d: goto 25e
      // 230: astore 2
      // 231: aload 2
      // 232: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 235: sipush -2993
      // 238: sipush 13149
      // 23b: pop2
      // 23c: ldc "Recipe response parse error: "
      // 23e: swap
      // 23f: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 244: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.h (Ljava/lang/String;)V
      // 247: getstatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lkotlinx/serialization/json/Json;
      // 24a: getstatic kotlinx/serialization/json/JsonElement.Companion Lkotlinx/serialization/json/JsonElement$Companion;
      // 24d: invokevirtual kotlinx/serialization/json/JsonElement$Companion.serializer ()Lkotlinx/serialization/KSerializer;
      // 250: checkcast kotlinx/serialization/SerializationStrategy
      // 253: aload 0
      // 254: invokevirtual kotlinx/serialization/json/Json.encodeToString (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;
      // 257: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 25a: swap
      // 25b: invokevirtual java/io/PrintStream.println (Ljava/lang/Object;)V
      // 25e: return
   }

   @JvmStatic
   public static final void b(@NotNull JsonObject param0) {
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.q ()I
      // 003: aload 0
      // 004: sipush -3008
      // 007: sipush -10579
      // 00a: pop2
      // 00b: ldc "json"
      // 00d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 010: istore 1
      // 011: nop
      // 012: iload 1
      // 013: ifeq 055
      // 016: aload 0
      // 017: sipush -2957
      // 01a: sipush 15903
      // 01d: pop2
      // 01e: ldc "status"
      // 020: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 023: checkcast kotlinx/serialization/json/JsonElement
      // 026: dup
      // 027: ifnull 04d
      // 02a: goto 031
      // 02d: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 030: athrow
      // 031: invokestatic kotlinx/serialization/json/JsonElementKt.getJsonPrimitive (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;
      // 034: dup
      // 035: ifnull 04d
      // 038: goto 03f
      // 03b: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03e: athrow
      // 03f: invokestatic kotlinx/serialization/json/JsonElementKt.getContentOrNull (Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;
      // 042: dup
      // 043: ifnonnull 05e
      // 046: goto 04d
      // 049: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04c: athrow
      // 04d: pop
      // 04e: goto 055
      // 051: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 054: athrow
      // 055: sipush -2996
      // 058: sipush 16634
      // 05b: pop2
      // 05c: ldc "unknown"
      // 05e: astore 2
      // 05f: aload 0
      // 060: sipush -3006
      // 063: sipush 21085
      // 066: pop2
      // 067: ldc "item_id"
      // 069: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 06c: checkcast kotlinx/serialization/json/JsonElement
      // 06f: dup
      // 070: iload 1
      // 071: ifeq 0d4
      // 074: ifnull 0b0
      // 077: goto 07e
      // 07a: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07d: athrow
      // 07e: invokestatic kotlinx/serialization/json/JsonElementKt.getJsonPrimitive (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;
      // 081: dup
      // 082: iload 1
      // 083: ifeq 0d4
      // 086: goto 08d
      // 089: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08c: athrow
      // 08d: ifnull 0b0
      // 090: goto 097
      // 093: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 096: athrow
      // 097: invokestatic kotlinx/serialization/json/JsonElementKt.getContentOrNull (Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;
      // 09a: iload 1
      // 09b: ifeq 0d0
      // 09e: goto 0a5
      // 0a1: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a4: athrow
      // 0a5: dup
      // 0a6: ifnonnull 106
      // 0a9: goto 0b0
      // 0ac: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0af: athrow
      // 0b0: pop
      // 0b1: iload 1
      // 0b2: ifeq 0f0
      // 0b5: goto 0bc
      // 0b8: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bb: athrow
      // 0bc: aload 0
      // 0bd: sipush -2952
      // 0c0: sipush 25281
      // 0c3: pop2
      // 0c4: ldc "itemId"
      // 0c6: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0c9: goto 0d0
      // 0cc: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cf: athrow
      // 0d0: checkcast kotlinx/serialization/json/JsonElement
      // 0d3: dup
      // 0d4: ifnull 0ef
      // 0d7: invokestatic kotlinx/serialization/json/JsonElementKt.getJsonPrimitive (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;
      // 0da: dup
      // 0db: ifnull 0ef
      // 0de: goto 0e5
      // 0e1: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e4: athrow
      // 0e5: invokestatic kotlinx/serialization/json/JsonElementKt.getContentOrNull (Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;
      // 0e8: goto 0f1
      // 0eb: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ee: athrow
      // 0ef: pop
      // 0f0: aconst_null
      // 0f1: dup
      // 0f2: ifnonnull 106
      // 0f5: pop
      // 0f6: sipush -2996
      // 0f9: sipush 16634
      // 0fc: pop2
      // 0fd: ldc "unknown"
      // 0ff: goto 106
      // 102: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 105: athrow
      // 106: astore 3
      // 107: aload 0
      // 108: sipush -2972
      // 10b: sipush -5603
      // 10e: pop2
      // 10f: ldc "auction"
      // 111: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 114: checkcast kotlinx/serialization/json/JsonElement
      // 117: astore 4
      // 119: iload 1
      // 11a: ifeq 151
      // 11d: aload 0
      // 11e: sipush -3002
      // 121: sipush -31644
      // 124: pop2
      // 125: ldc "message"
      // 127: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 12a: checkcast kotlinx/serialization/json/JsonElement
      // 12d: dup
      // 12e: ifnull 150
      // 131: goto 138
      // 134: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 137: athrow
      // 138: invokestatic kotlinx/serialization/json/JsonElementKt.getJsonPrimitive (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;
      // 13b: dup
      // 13c: ifnull 150
      // 13f: goto 146
      // 142: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 145: athrow
      // 146: invokestatic kotlinx/serialization/json/JsonElementKt.getContentOrNull (Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;
      // 149: goto 152
      // 14c: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14f: athrow
      // 150: pop
      // 151: aconst_null
      // 152: astore 5
      // 154: aload 2
      // 155: sipush -2948
      // 158: sipush 27257
      // 15b: pop2
      // 15c: ldc "success"
      // 15e: iload 1
      // 15f: ifeq 185
      // 162: bipush 1
      // 163: invokestatic kotlin/text/StringsKt.equals (Ljava/lang/String;Ljava/lang/String;Z)Z
      // 166: ifne 1bb
      // 169: goto 170
      // 16c: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16f: athrow
      // 170: aload 5
      // 172: iload 1
      // 173: ifeq 1b3
      // 176: goto 17d
      // 179: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17c: athrow
      // 17d: dup
      // 17e: goto 185
      // 181: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 184: athrow
      // 185: ifnonnull 1a0
      // 188: pop
      // 189: aload 3
      // 18a: sipush -2961
      // 18d: sipush -20728
      // 190: pop2
      // 191: ldc "Failed to fetch auction for "
      // 193: swap
      // 194: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 199: goto 1a0
      // 19c: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19f: athrow
      // 1a0: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.h (Ljava/lang/String;)V
      // 1a3: getstatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lkotlinx/serialization/json/Json;
      // 1a6: getstatic kotlinx/serialization/json/JsonElement.Companion Lkotlinx/serialization/json/JsonElement$Companion;
      // 1a9: invokevirtual kotlinx/serialization/json/JsonElement$Companion.serializer ()Lkotlinx/serialization/KSerializer;
      // 1ac: checkcast kotlinx/serialization/SerializationStrategy
      // 1af: aload 0
      // 1b0: invokevirtual kotlinx/serialization/json/Json.encodeToString (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;
      // 1b3: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 1b6: swap
      // 1b7: invokevirtual java/io/PrintStream.println (Ljava/lang/Object;)V
      // 1ba: return
      // 1bb: aload 4
      // 1bd: iload 1
      // 1be: ifeq 1cd
      // 1c1: ifnull 1d3
      // 1c4: goto 1cb
      // 1c7: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ca: athrow
      // 1cb: aload 4
      // 1cd: instanceof kotlinx/serialization/json/JsonNull
      // 1d0: ifeq 202
      // 1d3: aload 3
      // 1d4: sipush -2951
      // 1d7: sipush 11136
      // 1da: pop2
      // 1db: ldc "No auction data found for "
      // 1dd: swap
      // 1de: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 1e3: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.j (Ljava/lang/String;)V
      // 1e6: getstatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lkotlinx/serialization/json/Json;
      // 1e9: getstatic kotlinx/serialization/json/JsonElement.Companion Lkotlinx/serialization/json/JsonElement$Companion;
      // 1ec: invokevirtual kotlinx/serialization/json/JsonElement$Companion.serializer ()Lkotlinx/serialization/KSerializer;
      // 1ef: checkcast kotlinx/serialization/SerializationStrategy
      // 1f2: aload 0
      // 1f3: invokevirtual kotlinx/serialization/json/Json.encodeToString (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;
      // 1f6: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 1f9: swap
      // 1fa: invokevirtual java/io/PrintStream.println (Ljava/lang/Object;)V
      // 1fd: return
      // 1fe: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 201: athrow
      // 202: aload 3
      // 203: sipush -2965
      // 206: sipush 5703
      // 209: pop2
      // 20a: ldc "Auction fetched for "
      // 20c: swap
      // 20d: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 212: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.i (Ljava/lang/String;)V
      // 215: getstatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lkotlinx/serialization/json/Json;
      // 218: getstatic kotlinx/serialization/json/JsonElement.Companion Lkotlinx/serialization/json/JsonElement$Companion;
      // 21b: invokevirtual kotlinx/serialization/json/JsonElement$Companion.serializer ()Lkotlinx/serialization/KSerializer;
      // 21e: checkcast kotlinx/serialization/SerializationStrategy
      // 221: aload 4
      // 223: invokevirtual kotlinx/serialization/json/Json.encodeToString (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;
      // 226: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 229: swap
      // 22a: invokevirtual java/io/PrintStream.println (Ljava/lang/Object;)V
      // 22d: goto 25e
      // 230: astore 2
      // 231: aload 2
      // 232: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 235: sipush -2945
      // 238: sipush 6686
      // 23b: pop2
      // 23c: ldc "Auction response parse error: "
      // 23e: swap
      // 23f: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 244: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.h (Ljava/lang/String;)V
      // 247: getstatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lkotlinx/serialization/json/Json;
      // 24a: getstatic kotlinx/serialization/json/JsonElement.Companion Lkotlinx/serialization/json/JsonElement$Companion;
      // 24d: invokevirtual kotlinx/serialization/json/JsonElement$Companion.serializer ()Lkotlinx/serialization/KSerializer;
      // 250: checkcast kotlinx/serialization/SerializationStrategy
      // 253: aload 0
      // 254: invokevirtual kotlinx/serialization/json/Json.encodeToString (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;
      // 257: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 25a: swap
      // 25b: invokevirtual java/io/PrintStream.println (Ljava/lang/Object;)V
      // 25e: return
   }

   public final void a() {
      int var1 = me.octo.client.IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid.p();

      if (var1 == 0) {
         lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.compareAndSet(false, true);
      }
   }

   @NotNull
   public final CompletableFuture<IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid> a(
      @NotNull String var1, long var2
   ) {
      short var10001 = -2952;
      short var10002 = 25281;
      Intrinsics.checkNotNullParameter(var1, "itemId");
      this.a();
      var10001 = -2975;
      var10002 = -8501;
      return this.a("museum_fetch_recipe", var1, var2);
   }

   @NotNull
   public final CompletableFuture<IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid> b(
      @NotNull String var1, long var2
   ) {
      short var10001 = -2994;
      short var10002 = -14877;
      Intrinsics.checkNotNullParameter(var1, "itemId");
      this.a();
      var10001 = -2995;
      var10002 = -28008;
      return this.a("museum_fetch_auction", var1, var2);
   }

   private final CompletableFuture<IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid> a(
      String param1, String param2, long param3
   ) {
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      java.lang.String var6 = param1 + ":" + param2;
      int var5 = me.octo.client.IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid.q();
      me.octo.client.IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var7 = me.octo.client.IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.get(var6);
      if (var5 == 0 || var7 != null) {
         return var7.a();
      }
      java.util.concurrent.CompletableFuture<me.octo.client.IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid> var15 = new java.util.concurrent.CompletableFuture<>();
      java.util.concurrent.ScheduledFuture<?> var8 = me.octo.client.IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.schedule(
         new java.lang.Runnable() {
            public void run() {
               me.octo.client.IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a(var6, param1, param2);
            }
         },
         param3,
         java.util.concurrent.TimeUnit.MILLISECONDS
      );
      java.util.concurrent.ConcurrentHashMap<java.lang.String, me.octo.client.IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> var16 = me.octo.client.IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      kotlin.jvm.internal.Intrinsics.checkNotNull(var8);
      me.octo.client.IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var9 = var16.putIfAbsent(
         var6,
         new me.octo.client.IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var15, var8)
      );
      if (var5 != 0 && var9 != null) {
         var8.cancel(false);
      }
      if (var5 == 0 || var9 != null) {
         return var9.a();
      }
      boolean var11 = false;
      kotlinx.serialization.json.JsonObjectBuilder var12 = new kotlinx.serialization.json.JsonObjectBuilder();
      kotlinx.serialization.json.JsonElementBuildersKt.put(var12, "type", param1);
      kotlinx.serialization.json.JsonElementBuildersKt.put(var12, "item_id", param2);
      java.lang.String var10 = var12.build().toString();
      me.octo.client.IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var13;
      if (var5 != 0) {
         var11 = true;
         if (var11) {
            return var15;
         }
         var13 = me.octo.client.IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.remove(var6);
      } else {
         var13 = (me.octo.client.IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)(java.lang.Object)var10;
      }
      if (var13 != null) {
         java.util.concurrent.ScheduledFuture<?> var14 = var13.b();
         if (var14 != null) {
            var14.cancel(false);
         }
      }
      var15.completeExceptionally(new java.lang.IllegalStateException(""));
      return var15;
   }

   private final void a(String param1, JsonElement param2) {
      int var3 = PXEvMid.p();
      if (var3 != 0) {
         return;
      }
      if (param2 == null) {
         System.out.println(param1 + "[" + " ] null");
         return;
      }

      String var4 = param1
         + IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.encodeToString(kotlinx.serialization.json.JsonElement.Companion.serializer(), param2)
         + "\n==========" + " ==========\n" + "\n==========================\n";
      System.out.println(var4);
   }

   private final void c(JsonObject param1) {
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.p ()I
      // 003: istore 2
      // 004: iload 2
      // 005: ifne 048
      // 008: aload 1
      // 009: sipush -2962
      // 00c: sipush 10787
      // 00f: pop2
      // 010: ldc_w "type"
      // 013: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 016: checkcast kotlinx/serialization/json/JsonElement
      // 019: dup
      // 01a: ifnull 040
      // 01d: goto 024
      // 020: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 023: athrow
      // 024: invokestatic kotlinx/serialization/json/JsonElementKt.getJsonPrimitive (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;
      // 027: dup
      // 028: ifnull 040
      // 02b: goto 032
      // 02e: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 031: athrow
      // 032: invokestatic kotlinx/serialization/json/JsonElementKt.getContentOrNull (Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;
      // 035: dup
      // 036: ifnonnull 049
      // 039: goto 040
      // 03c: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03f: athrow
      // 040: pop
      // 041: goto 048
      // 044: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 047: athrow
      // 048: return
      // 049: astore 3
      // 04a: aload 3
      // 04b: iload 2
      // 04c: ifne 099
      // 04f: sipush -2949
      // 052: sipush -14788
      // 055: pop2
      // 056: ldc "museum_fetch_recipe"
      // 058: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 05b: ifne 08c
      // 05e: goto 065
      // 061: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 064: athrow
      // 065: aload 3
      // 066: iload 2
      // 067: ifne 099
      // 06a: goto 071
      // 06d: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 070: athrow
      // 071: sipush -2969
      // 074: sipush -5958
      // 077: pop2
      // 078: ldc "museum_fetch_auction"
      // 07a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 07d: ifne 08c
      // 080: goto 087
      // 083: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 086: athrow
      // 087: return
      // 088: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08b: athrow
      // 08c: aload 1
      // 08d: sipush -2974
      // 090: sipush -15870
      // 093: pop2
      // 094: ldc "item_id"
      // 096: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 099: checkcast kotlinx/serialization/json/JsonElement
      // 09c: dup
      // 09d: ifnull 0bc
      // 0a0: invokestatic kotlinx/serialization/json/JsonElementKt.getJsonPrimitive (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;
      // 0a3: dup
      // 0a4: ifnull 0bc
      // 0a7: goto 0ae
      // 0aa: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ad: athrow
      // 0ae: invokestatic kotlinx/serialization/json/JsonElementKt.getContentOrNull (Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;
      // 0b1: dup
      // 0b2: ifnonnull 0c2
      // 0b5: goto 0bc
      // 0b8: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bb: athrow
      // 0bc: pop
      // 0bd: return
      // 0be: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c1: athrow
      // 0c2: astore 4
      // 0c4: aload 3
      // 0c5: aload 4
      // 0c7: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001:\u0001" ]
      // 0cc: astore 5
      // 0ce: iload 2
      // 0cf: ifne 0f0
      // 0d2: getstatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Ljava/util/concurrent/ConcurrentHashMap;
      // 0d5: aload 5
      // 0d7: invokevirtual java/util/concurrent/ConcurrentHashMap.remove (Ljava/lang/Object;)Ljava/lang/Object;
      // 0da: checkcast me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
      // 0dd: dup
      // 0de: ifnonnull 0f1
      // 0e1: goto 0e8
      // 0e4: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e7: athrow
      // 0e8: pop
      // 0e9: goto 0f0
      // 0ec: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ef: athrow
      // 0f0: return
      // 0f1: astore 6
      // 0f3: aload 6
      // 0f5: invokevirtual me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b ()Ljava/util/concurrent/ScheduledFuture;
      // 0f8: bipush 0
      // 0f9: invokeinterface java/util/concurrent/ScheduledFuture.cancel (Z)Z 2
      // 0fe: pop
      // 0ff: iload 2
      // 100: ifne 142
      // 103: aload 1
      // 104: sipush -2976
      // 107: sipush 29580
      // 10a: pop2
      // 10b: ldc "status"
      // 10d: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 110: checkcast kotlinx/serialization/json/JsonElement
      // 113: dup
      // 114: ifnull 13a
      // 117: goto 11e
      // 11a: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11d: athrow
      // 11e: invokestatic kotlinx/serialization/json/JsonElementKt.getJsonPrimitive (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;
      // 121: dup
      // 122: ifnull 13a
      // 125: goto 12c
      // 128: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12b: athrow
      // 12c: invokestatic kotlinx/serialization/json/JsonElementKt.getContentOrNull (Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;
      // 12f: dup
      // 130: ifnonnull 14b
      // 133: goto 13a
      // 136: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 139: athrow
      // 13a: pop
      // 13b: goto 142
      // 13e: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 141: athrow
      // 142: sipush -3007
      // 145: sipush 15736
      // 148: pop2
      // 149: ldc "success"
      // 14b: astore 7
      // 14d: aload 3
      // 14e: astore 9
      // 150: aload 9
      // 152: sipush -2975
      // 155: sipush -8501
      // 158: pop2
      // 159: ldc "museum_fetch_recipe"
      // 15b: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 15e: iload 2
      // 15f: ifne 19c
      // 162: ifeq 183
      // 165: goto 16c
      // 168: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16b: athrow
      // 16c: aload 1
      // 16d: sipush -2958
      // 170: sipush -28016
      // 173: pop2
      // 174: ldc "recipe"
      // 176: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 179: checkcast kotlinx/serialization/json/JsonElement
      // 17c: goto 1ba
      // 17f: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 182: athrow
      // 183: aload 9
      // 185: iload 2
      // 186: ifne 1b3
      // 189: sipush -2969
      // 18c: sipush -5958
      // 18f: pop2
      // 190: ldc "museum_fetch_auction"
      // 192: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 195: goto 19c
      // 198: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19b: athrow
      // 19c: ifeq 1b9
      // 19f: aload 1
      // 1a0: sipush -2997
      // 1a3: sipush -4065
      // 1a6: pop2
      // 1a7: ldc "auction"
      // 1a9: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1ac: goto 1b3
      // 1af: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b2: athrow
      // 1b3: checkcast kotlinx/serialization/json/JsonElement
      // 1b6: goto 1ba
      // 1b9: aconst_null
      // 1ba: astore 8
      // 1bc: iload 2
      // 1bd: ifne 1f4
      // 1c0: aload 1
      // 1c1: sipush -2964
      // 1c4: sipush -6441
      // 1c7: pop2
      // 1c8: ldc "message"
      // 1ca: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1cd: checkcast kotlinx/serialization/json/JsonElement
      // 1d0: dup
      // 1d1: ifnull 1f3
      // 1d4: goto 1db
      // 1d7: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1da: athrow
      // 1db: invokestatic kotlinx/serialization/json/JsonElementKt.getJsonPrimitive (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;
      // 1de: dup
      // 1df: ifnull 1f3
      // 1e2: goto 1e9
      // 1e5: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e8: athrow
      // 1e9: invokestatic kotlinx/serialization/json/JsonElementKt.getContentOrNull (Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;
      // 1ec: goto 1f5
      // 1ef: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f2: athrow
      // 1f3: pop
      // 1f4: aconst_null
      // 1f5: astore 9
      // 1f7: aload 6
      // 1f9: invokevirtual me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()Ljava/util/concurrent/CompletableFuture;
      // 1fc: new me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 1ff: dup
      // 200: aload 3
      // 201: aload 7
      // 203: aload 4
      // 205: aload 8
      // 207: aload 7
      // 209: sipush -2946
      // 20c: sipush 10591
      // 20f: pop2
      // 210: ldc_w "error"
      // 213: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 216: ifeq 234
      // 219: aload 9
      // 21b: dup
      // 21c: ifnonnull 235
      // 21f: goto 226
      // 222: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 225: athrow
      // 226: pop
      // 227: sipush -2998
      // 22a: sipush 2008
      // 22d: pop2
      // 22e: ldc_w "Unknown error"
      // 231: goto 235
      // 234: aconst_null
      // 235: invokespecial me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;)V
      // 238: invokevirtual java/util/concurrent/CompletableFuture.complete (Ljava/lang/Object;)Z
      // 23b: pop
      // 23c: aload 3
      // 23d: astore 10
      // 23f: aload 10
      // 241: sipush -2975
      // 244: sipush -8501
      // 247: pop2
      // 248: ldc "museum_fetch_recipe"
      // 24a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 24d: iload 2
      // 24e: ifne 27f
      // 251: ifeq 26a
      // 254: goto 25b
      // 257: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25a: athrow
      // 25b: aload 1
      // 25c: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Lkotlinx/serialization/json/JsonObject;)V
      // 25f: iload 2
      // 260: ifeq 28d
      // 263: goto 26a
      // 266: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 269: athrow
      // 26a: aload 10
      // 26c: sipush -2969
      // 26f: sipush -5958
      // 272: pop2
      // 273: ldc "museum_fetch_auction"
      // 275: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 278: goto 27f
      // 27b: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27e: athrow
      // 27f: ifeq 28d
      // 282: aload 1
      // 283: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.b (Lkotlinx/serialization/json/JsonObject;)V
      // 286: goto 28d
      // 289: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28c: athrow
      // 28d: return
   }

   private static final Thread a(Runnable var0) {
      short var10003 = -2970;
      short var10004 = -20618;
      Thread var1 = new Thread(var0, "BackendMuseumFetching-Timeout");
      boolean var3 = false;
      var1.setDaemon(true);
      return var1;
   }

   private static final Unit a(JsonBuilder var0) {
      short var10001 = -2966;
      short var10002 = 30718;
      Intrinsics.checkNotNullParameter(var0, "$this$Json");
      var0.setPrettyPrint(true);
      return Unit.INSTANCE;
   }

   private static final Unit a(com.google.gson.JsonObject var0) {
      short var10001 = -2971;
      short var10002 = -7229;
      Intrinsics.checkNotNullParameter(var0, "gsonJson");
      Default var10000 = Json.Default;
      String var2 = var0.toString();
      short var10003 = -3000;
      short var10004 = 17342;
      Intrinsics.checkNotNullExpressionValue(var2, "toString(...)");
      JsonObject var1 = JsonElementKt.getJsonObject(var10000.parseToJsonElement(var2));
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(var1);
      return Unit.INSTANCE;
   }

   private static final void a(String param0, String param1, String param2) {
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.p ()I
      // 03: getstatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Ljava/util/concurrent/ConcurrentHashMap;
      // 06: aload 0
      // 07: invokevirtual java/util/concurrent/ConcurrentHashMap.remove (Ljava/lang/Object;)Ljava/lang/Object;
      // 0a: checkcast me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
      // 0d: astore 4
      // 0f: istore 3
      // 10: aload 4
      // 12: iload 3
      // 13: ifne 22
      // 16: ifnull 71
      // 19: goto 20
      // 1c: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 4
      // 22: invokevirtual me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()Ljava/util/concurrent/CompletableFuture;
      // 25: invokevirtual java/util/concurrent/CompletableFuture.isDone ()Z
      // 28: iload 3
      // 29: ifne 70
      // 2c: ifne 71
      // 2f: goto 36
      // 32: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35: athrow
      // 36: aload 4
      // 38: invokevirtual me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()Ljava/util/concurrent/CompletableFuture;
      // 3b: new java/util/concurrent/TimeoutException
      // 3e: dup
      // 3f: aload 1
      // 40: aload 2
      // 41: sipush -2954
      // 44: sipush 18132
      // 47: pop2
      // 48: ldc_w "Museum request timed out ("
      // 4b: dup_x2
      // 4c: pop
      // 4d: sipush -2950
      // 50: sipush -27593
      // 53: pop2
      // 54: ldc_w ", item_id="
      // 57: swap
      // 58: ldc_w ")"
      // 5b: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001" ]
      // 60: invokespecial java/util/concurrent/TimeoutException.<init> (Ljava/lang/String;)V
      // 63: checkcast java/lang/Throwable
      // 66: invokevirtual java/util/concurrent/CompletableFuture.completeExceptionally (Ljava/lang/Throwable;)Z
      // 69: goto 70
      // 6c: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6f: athrow
      // 70: pop
      // 71: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var24 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[47];
      int var3 = 0;
      String var2 = "ãÒÛ\u0092ÑÖU+&<\u0094/Úºá¼Xë\u00ad\u009aTÂDwÕ\u000fù\u009fÖ\u0014Óþ\u0007\u008fH¹O\u008e)Áaj\u0090\u008bÌNøAJî\u0007ÄVx\u008b©\bÝ\b\u0017¨È\u0088\u0011-\u008cÉ\u0007§±\u001bO5¬´\u00063\r÷ïA0\u0006x+½\u0005OÅ\u0013â\u0082!\u0000\u008cH×°:\u0006\u0003\u0092Ü\u0087U¾ÄFy\u0004ç®¸\b\u001c\u009dN\u009a\u0006²©}¶õÂ´Ù¤S\u0019Té5ÓåÞ6àª7ÞÒ»\u0007æ\u0092¡\u0006\u0088Vû\f\u0000Ô×Ó\u009d1Ö\u009elºÄ\u0007\nWõìÃKôüRâ÷\u0014ÅK|()|Í2mÉ\u009dSÍÂ§ ´±\u008ex;\bÚ0í¯w]\u0099\u0017p\u0097@mg\\pÒZæÝ6\u000fxj\"¬\u0089ÒÇ\u008b|Ý\u0098õHêy\u007f\u0007ï±U·]±úÏ\u0000¤\u00148\u0086p5\u0099L²nY\u001c¦ÍlðêU8\u0012±+\u007f\u0002¤%,\u0012ì\u000bú*:ýñÖw½¥å\u001a~¿\u0096§z¼v:\u009eÄ\u0081bt3¬ù\u0016F#\u0080O\u0088©) 7\u0006¥\u009fâLSÒ\u0013(Æx\u0088§Y²\u0092\u0096B\u0096\u001an\u0096\u0003\u009c\u000e\u0002 \u0004\u0087\u0093´¯\u0006T\n\u001b\u000fÜ,\u0006+F×¨\u0002p\u0004\u009eÕU'\f\u008cÜ)ÒB\u0011-\u009a\u0013:+=\u0005Èªlè\u0003\u001eC8¬F3±\u008e\u008b\u0011þ\u0083¦î\u00063\u0017\u0095µ7V\u001a\u008coóU\u0005\u0015,\u0005\u0088\u0007\u001fESþÀO`\u001bpà'Ó\u0005\u0013\u008bá+(o\u0084ßøv!\u0017\u008b}=\u0012\u0099\rR\u0004RÎ\n\u008ch\u009f³\u0012\r\u0016\u0017\u0003U\u0013w¾\u0093\u0087Ú¸\u001d®cÅ(ê¹\u0088ù_QzË\u0006UäEåèô\u001aÇz\u0091B£\u008a\u0019(§á¸;¾9äìy80\u0007{|ð\n(#\u0007?\\\u009aßïm\u0017\u0013m\u0017\u0018¬¼X\u000b»1gb¾Ê\u0014¯\u001dp\u0095l\u0014ëÕ\u0014¤\u0003'\u0002\u0084p\u0000O\u008bÚ_ûy?\u008aÿ\u001f\u0007X\fu¢\u0007lÎ\u0007ãº\u0093.$\u0080\u0096\u0014\u007fc\u0092<úÏ\u0019@ã\u00188Q»ì©¢TÜß]\u0004Hq\u008f³\u0007hø½I\u001d¹Û\u0006.\u001a*:\u0005\u000f\u001dºìâÓã·àRLËÞË'J=eÐ\u0007Ö2Ad\u0095\u0014ç\u0011^XÈ\u0007\b\u0082\u007fsFVæ\u0014Q\fWÑBr\u000e÷\u0001îd\u008f07ØÙz³\u001a°\rVq\u0090\r»\u0099Y\u0095ü*ÊÖû";
      int var4 = "ãÒÛ\u0092ÑÖU+&<\u0094/Úºá¼Xë\u00ad\u009aTÂDwÕ\u000fù\u009fÖ\u0014Óþ\u0007\u008fH¹O\u008e)Áaj\u0090\u008bÌNøAJî\u0007ÄVx\u008b©\bÝ\b\u0017¨È\u0088\u0011-\u008cÉ\u0007§±\u001bO5¬´\u00063\r÷ïA0\u0006x+½\u0005OÅ\u0013â\u0082!\u0000\u008cH×°:\u0006\u0003\u0092Ü\u0087U¾ÄFy\u0004ç®¸\b\u001c\u009dN\u009a\u0006²©}¶õÂ´Ù¤S\u0019Té5ÓåÞ6àª7ÞÒ»\u0007æ\u0092¡\u0006\u0088Vû\f\u0000Ô×Ó\u009d1Ö\u009elºÄ\u0007\nWõìÃKôüRâ÷\u0014ÅK|()|Í2mÉ\u009dSÍÂ§ ´±\u008ex;\bÚ0í¯w]\u0099\u0017p\u0097@mg\\pÒZæÝ6\u000fxj\"¬\u0089ÒÇ\u008b|Ý\u0098õHêy\u007f\u0007ï±U·]±úÏ\u0000¤\u00148\u0086p5\u0099L²nY\u001c¦ÍlðêU8\u0012±+\u007f\u0002¤%,\u0012ì\u000bú*:ýñÖw½¥å\u001a~¿\u0096§z¼v:\u009eÄ\u0081bt3¬ù\u0016F#\u0080O\u0088©) 7\u0006¥\u009fâLSÒ\u0013(Æx\u0088§Y²\u0092\u0096B\u0096\u001an\u0096\u0003\u009c\u000e\u0002 \u0004\u0087\u0093´¯\u0006T\n\u001b\u000fÜ,\u0006+F×¨\u0002p\u0004\u009eÕU'\f\u008cÜ)ÒB\u0011-\u009a\u0013:+=\u0005Èªlè\u0003\u001eC8¬F3±\u008e\u008b\u0011þ\u0083¦î\u00063\u0017\u0095µ7V\u001a\u008coóU\u0005\u0015,\u0005\u0088\u0007\u001fESþÀO`\u001bpà'Ó\u0005\u0013\u008bá+(o\u0084ßøv!\u0017\u008b}=\u0012\u0099\rR\u0004RÎ\n\u008ch\u009f³\u0012\r\u0016\u0017\u0003U\u0013w¾\u0093\u0087Ú¸\u001d®cÅ(ê¹\u0088ù_QzË\u0006UäEåèô\u001aÇz\u0091B£\u008a\u0019(§á¸;¾9äìy80\u0007{|ð\n(#\u0007?\\\u009aßïm\u0017\u0013m\u0017\u0018¬¼X\u000b»1gb¾Ê\u0014¯\u001dp\u0095l\u0014ëÕ\u0014¤\u0003'\u0002\u0084p\u0000O\u008bÚ_ûy?\u008aÿ\u001f\u0007X\fu¢\u0007lÎ\u0007ãº\u0093.$\u0080\u0096\u0014\u007fc\u0092<úÏ\u0019@ã\u00188Q»ì©¢TÜß]\u0004Hq\u008f³\u0007hø½I\u001d¹Û\u0006.\u001a*:\u0005\u000f\u001dºìâÓã·àRLËÞË'J=eÐ\u0007Ö2Ad\u0095\u0014ç\u0011^XÈ\u0007\b\u0082\u007fsFVæ\u0014Q\fWÑBr\u000e÷\u0001îd\u008f07ØÙz³\u001a°\rVq\u0090\r»\u0099Y\u0095ü*ÊÖû"
         .length();
      char var1 = 29;
      int var8 = -1;

      label52:
      while (true) {
         short var10000 = 79;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var28 = var10001.toCharArray();
               int var10004 = var28.length;
               int var6 = 0;
               byte var31 = (byte)var10000;
               var24 = var28;
               int var16 = var10004;
               byte var36;
               char[] var40;
               int var10006;
               if (var10004 <= 1) {
                  var40 = var28;
                  var36 = (byte)var10000;
                  var10006 = var6;
               } else {
                  var31 = (byte)var10000;
                  var16 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var40 = var28;
                  var36 = (byte)var10000;
                  var10006 = var6;
               }

               while (true) {
                  var40[var10006] = (char)(var40[var10006] ^ var36 ^ switch (var6 % 7) {
                     case 0 -> 88;
                     case 1 -> 19;
                     case 2 -> 99;
                     case 3 -> 42;
                     case 4 -> 10;
                     case 5 -> 15;
                     default -> 37;
                  });
                  var6++;
                  if (var31 == 0) {
                     var10006 = var31;
                     var40 = var24;
                     var36 = var31;
                  } else {
                     if (var16 <= var6) {
                        break;
                     }

                     var40 = var24;
                     var36 = var31;
                     var10006 = var6;
                  }
               }
            }

            String var33 = new String(var24).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var33;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[47];
                     var10000 = -2956;
                     short var18 = -31770;
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = "museum_fetch_recipe";
                     var10000 = -3005;
                     short var19 = 29229;
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = "museum_fetch_auction";
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI();
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new AtomicBoolean(false);
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = Executors.newSingleThreadScheduledExecutor(
                        IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI::a
                     );
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new ConcurrentHashMap<>();
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = JsonKt.Json(
                        null, IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI::a);
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var33;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "úÊ\u0086!Od8\rÙ\u000eeà\u001eZjNî\u009b\tO6";
                  var4 = "úÊ\u0086!Od8\rÙ\u000eeà\u001eZjNî\u009b\tO6".length();
                  var1 = 7;
                  var8 = -1;
            }

            var10000 = 28;
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
      int var2 = (var0 ^ -2970) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 92;
            case 1 -> 83;
            case 2 -> 236;
            case 3 -> 38;
            case 4 -> 156;
            case 5 -> 228;
            case 6 -> 198;
            case 7 -> 71;
            case 8 -> 254;
            case 9 -> 184;
            case 10 -> 57;
            case 11 -> 2;
            case 12 -> 75;
            case 13 -> 145;
            case 14 -> 197;
            case 15 -> 32;
            case 16 -> 29;
            case 17 -> 53;
            case 18 -> 193;
            case 19 -> 204;
            case 20 -> 12;
            case 21 -> 82;
            case 22 -> 140;
            case 23 -> 101;
            case 24 -> 203;
            case 25 -> 210;
            case 26 -> 113;
            case 27 -> 118;
            case 28 -> 188;
            case 29 -> 63;
            case 30 -> 30;
            case 31 -> 144;
            case 32 -> 199;
            case 33 -> 85;
            case 34 -> 77;
            case 35 -> 174;
            case 36 -> 134;
            case 37 -> 170;
            case 38 -> 27;
            case 39 -> 43;
            case 40 -> 31;
            case 41 -> 49;
            case 42 -> 100;
            case 43 -> 67;
            case 44 -> 66;
            case 45 -> 238;
            case 46 -> 52;
            case 47 -> 143;
            case 48 -> 177;
            case 49 -> 46;
            case 50 -> 37;
            case 51 -> 74;
            case 52 -> 39;
            case 53 -> 250;
            case 54 -> 19;
            case 55 -> 8;
            case 56 -> 244;
            case 57 -> 147;
            case 58 -> 229;
            case 59 -> 194;
            case 60 -> 208;
            case 61 -> 227;
            case 62 -> 153;
            case 63 -> 148;
            case 64 -> 154;
            case 65 -> 196;
            case 66 -> 150;
            case 67 -> 95;
            case 68 -> 201;
            case 69 -> 240;
            case 70 -> 109;
            case 71 -> 141;
            case 72 -> 33;
            case 73 -> 222;
            case 74 -> 97;
            case 75 -> 62;
            case 76 -> 219;
            case 77 -> 189;
            case 78 -> 87;
            case 79 -> 103;
            case 80 -> 172;
            case 81 -> 10;
            case 82 -> 161;
            case 83 -> 4;
            case 84 -> 9;
            case 85 -> 190;
            case 86 -> 123;
            case 87 -> 146;
            case 88 -> 138;
            case 89 -> 69;
            case 90 -> 111;
            case 91 -> 186;
            case 92 -> 26;
            case 93 -> 116;
            case 94 -> 232;
            case 95 -> 120;
            case 96 -> 47;
            case 97 -> 3;
            case 98 -> 42;
            case 99 -> 54;
            case 100 -> 99;
            case 101 -> 246;
            case 102 -> 223;
            case 103 -> 166;
            case 104 -> 40;
            case 105 -> 176;
            case 106 -> 175;
            case 107 -> 93;
            case 108 -> 221;
            case 109 -> 178;
            case 110 -> 135;
            case 111 -> 112;
            case 112 -> 13;
            case 113 -> 160;
            case 114 -> 122;
            case 115 -> 5;
            case 116 -> 58;
            case 117 -> 81;
            case 118 -> 70;
            case 119 -> 0;
            case 120 -> 211;
            case 121 -> 126;
            case 122 -> 181;
            case 123 -> 15;
            case 124 -> 171;
            case 125 -> 106;
            case 126 -> 90;
            case 127 -> 108;
            case 128 -> 233;
            case 129 -> 86;
            case 130 -> 22;
            case 131 -> 6;
            case 132 -> 249;
            case 133 -> 14;
            case 134 -> 132;
            case 135 -> 104;
            case 136 -> 84;
            case 137 -> 157;
            case 138 -> 60;
            case 139 -> 35;
            case 140 -> 241;
            case 141 -> 133;
            case 142 -> 121;
            case 143 -> 28;
            case 144 -> 218;
            case 145 -> 125;
            case 146 -> 23;
            case 147 -> 117;
            case 148 -> 88;
            case 149 -> 185;
            case 150 -> 114;
            case 151 -> 34;
            case 152 -> 21;
            case 153 -> 36;
            case 154 -> 18;
            case 155 -> 128;
            case 156 -> 56;
            case 157 -> 213;
            case 158 -> 152;
            case 159 -> 234;
            case 160 -> 151;
            case 161 -> 237;
            case 162 -> 212;
            case 163 -> 220;
            case 164 -> 25;
            case 165 -> 209;
            case 166 -> 79;
            case 167 -> 252;
            case 168 -> 110;
            case 169 -> 169;
            case 170 -> 215;
            case 171 -> 216;
            case 172 -> 11;
            case 173 -> 94;
            case 174 -> 65;
            case 175 -> 80;
            case 176 -> 41;
            case 177 -> 217;
            case 178 -> 225;
            case 179 -> 73;
            case 180 -> 163;
            case 181 -> 78;
            case 182 -> 127;
            case 183 -> 239;
            case 184 -> 187;
            case 185 -> 55;
            case 186 -> 119;
            case 187 -> 164;
            case 188 -> 202;
            case 189 -> 243;
            case 190 -> 64;
            case 191 -> 149;
            case 192 -> 191;
            case 193 -> 245;
            case 194 -> 129;
            case 195 -> 155;
            case 196 -> 17;
            case 197 -> 96;
            case 198 -> 142;
            case 199 -> 206;
            case 200 -> 162;
            case 201 -> 105;
            case 202 -> 230;
            case 203 -> 136;
            case 204 -> 76;
            case 205 -> 173;
            case 206 -> 231;
            case 207 -> 139;
            case 208 -> 226;
            case 209 -> 124;
            case 210 -> 180;
            case 211 -> 107;
            case 212 -> 158;
            case 213 -> 115;
            case 214 -> 98;
            case 215 -> 7;
            case 216 -> 91;
            case 217 -> 44;
            case 218 -> 137;
            case 219 -> 183;
            case 220 -> 195;
            case 221 -> 48;
            case 222 -> 247;
            case 223 -> 165;
            case 224 -> 72;
            case 225 -> 68;
            case 226 -> 182;
            case 227 -> 214;
            case 228 -> 131;
            case 229 -> 251;
            case 230 -> 45;
            case 231 -> 205;
            case 232 -> 248;
            case 233 -> 1;
            case 234 -> 242;
            case 235 -> 61;
            case 236 -> 200;
            case 237 -> 89;
            case 238 -> 20;
            case 239 -> 207;
            case 240 -> 159;
            case 241 -> 59;
            case 242 -> 130;
            case 243 -> 167;
            case 244 -> 192;
            case 245 -> 51;
            case 246 -> 235;
            case 247 -> 102;
            case 248 -> 179;
            case 249 -> 168;
            case 250 -> 16;
            case 251 -> 224;
            case 252 -> 50;
            case 253 -> 253;
            case 254 -> 24;
            default -> 255;
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

   private static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
   public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI p0, CompletableFuture p1, ScheduledFuture p2, int m, Object mk) {
      if ((m & 1) != 0) {
         p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }
      if ((m & 2) != 0) {
         p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }
      return new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(p1, p2);
   }

      @NotNull
      private final CompletableFuture<IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final ScheduledFuture<?> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         @NotNull CompletableFuture<IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid> var1,
         @NotNull ScheduledFuture<?> var2
      ) {
         short var10001 = -11398;
         short var10002 = 19745;
         Intrinsics.checkNotNullParameter(var1, "future");
         var10001 = -11397;
         var10002 = -28929;
         Intrinsics.checkNotNullParameter(var2, "timeoutTask");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      }

      @NotNull
      public final CompletableFuture<IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid> a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final ScheduledFuture<?> b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final CompletableFuture<IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid> c() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final ScheduledFuture<?> d() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         @NotNull CompletableFuture<IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid> var1,
         @NotNull ScheduledFuture<?> var2
      ) {
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
         short var10001 = -11395;
         short var10002 = 32439;
         Intrinsics.checkNotNullParameter(var1, "future");
         var10001 = -11396;
         var10002 = -27236;
         Intrinsics.checkNotNullParameter(var2, "timeoutTask");
         return new IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var2
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10002 = -11399;
         short var10003 = -11871;
         var10003 = -11400;
         short var10004 = -15984;
         return "Pending(future="
            + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            + ", timeoutTask="
            + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         return var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
         int var2 = IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid.p();
         Object var10000 = this;
         if (var2 == 0) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == 0) {
            if (!(
               var10000 instanceof IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = var1;
         }

         IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
         boolean var4 = Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         );
         if (var2 == 0) {
            if (!var4) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
         }

         if (var2 == 0) {
            if (!var4) {
               return false;
            }

            var4 = true;
         }

         return var4;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[6];
         int var3 = 0;
         String var2 = "\u0092á|y!aD¤ÔÖ¬\u0010Õÿ¸\u000e\u0099²ôóm\u0097AMo<\u009eN=ª\u000bý\u00052i\u008dY\u0004§ªC\u009b\u0006ëº¹\u0011ÛT";
         int var4 = "\u0092á|y!aD¤ÔÖ¬\u0010Õÿ¸\u000e\u0099²ôóm\u0097AMo<\u009eN=ª\u000bý\u00052i\u008dY\u0004§ªC\u009b\u0006ëº¹\u0011ÛT".length();
         char var1 = 15;
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
                        case 0 -> 17;
                        case 1 -> 103;
                        case 2 -> 104;
                        case 3 -> 84;
                        case 4 -> 57;
                        case 5 -> 18;
                        default -> 52;
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
                        b = new String[6];
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

                     var2 = "ÄxÑÄ[c\u000b*ZE\u000fî\u0018å\u0002\u001bz ";
                     var4 = "ÄxÑÄ[c\u000b*ZE\u000fî\u0018å\u0002\u001bz ".length();
                     var1 = 6;
                     var8 = -1;
               }

               var10000 = 30;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -11399) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 74;
               case 1 -> 165;
               case 2 -> 137;
               case 3 -> 88;
               case 4 -> 197;
               case 5 -> 26;
               case 6 -> 155;
               case 7 -> 114;
               case 8 -> 81;
               case 9 -> 27;
               case 10 -> 57;
               case 11 -> 222;
               case 12 -> 247;
               case 13 -> 230;
               case 14 -> 118;
               case 15 -> 164;
               case 16 -> 148;
               case 17 -> 171;
               case 18 -> 159;
               case 19 -> 175;
               case 20 -> 231;
               case 21 -> 192;
               case 22 -> 152;
               case 23 -> 50;
               case 24 -> 94;
               case 25 -> 229;
               case 26 -> 40;
               case 27 -> 178;
               case 28 -> 2;
               case 29 -> 32;
               case 30 -> 205;
               case 31 -> 16;
               case 32 -> 1;
               case 33 -> 35;
               case 34 -> 160;
               case 35 -> 38;
               case 36 -> 107;
               case 37 -> 75;
               case 38 -> 13;
               case 39 -> 68;
               case 40 -> 162;
               case 41 -> 188;
               case 42 -> 253;
               case 43 -> 70;
               case 44 -> 146;
               case 45 -> 23;
               case 46 -> 101;
               case 47 -> 223;
               case 48 -> 7;
               case 49 -> 214;
               case 50 -> 142;
               case 51 -> 238;
               case 52 -> 105;
               case 53 -> 248;
               case 54 -> 83;
               case 55 -> 163;
               case 56 -> 252;
               case 57 -> 134;
               case 58 -> 180;
               case 59 -> 36;
               case 60 -> 151;
               case 61 -> 76;
               case 62 -> 213;
               case 63 -> 251;
               case 64 -> 15;
               case 65 -> 133;
               case 66 -> 136;
               case 67 -> 154;
               case 68 -> 9;
               case 69 -> 135;
               case 70 -> 245;
               case 71 -> 103;
               case 72 -> 31;
               case 73 -> 29;
               case 74 -> 108;
               case 75 -> 3;
               case 76 -> 200;
               case 77 -> 77;
               case 78 -> 120;
               case 79 -> 64;
               case 80 -> 138;
               case 81 -> 116;
               case 82 -> 254;
               case 83 -> 63;
               case 84 -> 61;
               case 85 -> 124;
               case 86 -> 156;
               case 87 -> 242;
               case 88 -> 246;
               case 89 -> 204;
               case 90 -> 112;
               case 91 -> 233;
               case 92 -> 52;
               case 93 -> 82;
               case 94 -> 166;
               case 95 -> 8;
               case 96 -> 60;
               case 97 -> 227;
               case 98 -> 125;
               case 99 -> 172;
               case 100 -> 139;
               case 101 -> 144;
               case 102 -> 24;
               case 103 -> 186;
               case 104 -> 130;
               case 105 -> 212;
               case 106 -> 150;
               case 107 -> 219;
               case 108 -> 62;
               case 109 -> 217;
               case 110 -> 97;
               case 111 -> 255;
               case 112 -> 71;
               case 113 -> 53;
               case 114 -> 72;
               case 115 -> 86;
               case 116 -> 45;
               case 117 -> 99;
               case 118 -> 104;
               case 119 -> 141;
               case 120 -> 191;
               case 121 -> 194;
               case 122 -> 59;
               case 123 -> 28;
               case 124 -> 111;
               case 125 -> 66;
               case 126 -> 58;
               case 127 -> 41;
               case 128 -> 11;
               case 129 -> 140;
               case 130 -> 181;
               case 131 -> 183;
               case 132 -> 93;
               case 133 -> 102;
               case 134 -> 206;
               case 135 -> 244;
               case 136 -> 4;
               case 137 -> 128;
               case 138 -> 199;
               case 139 -> 20;
               case 140 -> 67;
               case 141 -> 122;
               case 142 -> 190;
               case 143 -> 39;
               case 144 -> 174;
               case 145 -> 224;
               case 146 -> 209;
               case 147 -> 113;
               case 148 -> 129;
               case 149 -> 19;
               case 150 -> 73;
               case 151 -> 228;
               case 152 -> 6;
               case 153 -> 109;
               case 154 -> 218;
               case 155 -> 127;
               case 156 -> 34;
               case 157 -> 65;
               case 158 -> 236;
               case 159 -> 241;
               case 160 -> 47;
               case 161 -> 145;
               case 162 -> 195;
               case 163 -> 98;
               case 164 -> 177;
               case 165 -> 157;
               case 166 -> 87;
               case 167 -> 92;
               case 168 -> 14;
               case 169 -> 119;
               case 170 -> 225;
               case 171 -> 37;
               case 172 -> 237;
               case 173 -> 100;
               case 174 -> 210;
               case 175 -> 249;
               case 176 -> 250;
               case 177 -> 189;
               case 178 -> 78;
               case 179 -> 55;
               case 180 -> 176;
               case 181 -> 201;
               case 182 -> 158;
               case 183 -> 30;
               case 184 -> 226;
               case 185 -> 56;
               case 186 -> 85;
               case 187 -> 48;
               case 188 -> 168;
               case 189 -> 22;
               case 190 -> 153;
               case 191 -> 0;
               case 192 -> 198;
               case 193 -> 89;
               case 194 -> 143;
               case 195 -> 167;
               case 196 -> 51;
               case 197 -> 131;
               case 198 -> 184;
               case 199 -> 79;
               case 200 -> 207;
               case 201 -> 185;
               case 202 -> 21;
               case 203 -> 10;
               case 204 -> 232;
               case 205 -> 220;
               case 206 -> 173;
               case 207 -> 203;
               case 208 -> 240;
               case 209 -> 169;
               case 210 -> 33;
               case 211 -> 44;
               case 212 -> 25;
               case 213 -> 215;
               case 214 -> 149;
               case 215 -> 43;
               case 216 -> 91;
               case 217 -> 211;
               case 218 -> 90;
               case 219 -> 110;
               case 220 -> 115;
               case 221 -> 54;
               case 222 -> 18;
               case 223 -> 84;
               case 224 -> 187;
               case 225 -> 161;
               case 226 -> 239;
               case 227 -> 126;
               case 228 -> 193;
               case 229 -> 17;
               case 230 -> 235;
               case 231 -> 121;
               case 232 -> 147;
               case 233 -> 202;
               case 234 -> 179;
               case 235 -> 42;
               case 236 -> 12;
               case 237 -> 182;
               case 238 -> 123;
               case 239 -> 46;
               case 240 -> 49;
               case 241 -> 95;
               case 242 -> 196;
               case 243 -> 69;
               case 244 -> 106;
               case 245 -> 234;
               case 246 -> 96;
               case 247 -> 208;
               case 248 -> 221;
               case 249 -> 170;
               case 250 -> 132;
               case 251 -> 80;
               case 252 -> 243;
               case 253 -> 5;
               case 254 -> 117;
               default -> 216;
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

   @Serializable
   public static final class PXEvMid {
      @NotNull
      public static IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @NotNull
      private final String lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      @Nullable
      private final JsonElement IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      @Nullable
      private final String IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static int IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private static String[] a;
      private static String[] b;

      public PXEvMid(
         @NotNull String var1, @NotNull String var2, @NotNull String var3, @Nullable JsonElement var4, @Nullable String var5
      ) {
         short var10001 = 20165;
         short var10002 = 11027;
         Intrinsics.checkNotNullParameter(var1, "type");
         var10001 = 20169;
         var10002 = 18750;
         Intrinsics.checkNotNullParameter(var2, "status");
         var10001 = 20167;
         var10002 = -10096;
         Intrinsics.checkNotNullParameter(var3, "itemId");
         super();
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var2;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var3;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var4;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var5;
      }

      // PX-RESTORE X1: Kotlin 默认参数合成构造器（jar: <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V）
      // 位掩码 8 -> var4(payload) 置空, 16 -> var5(errorMessage) 置空, 随后委托给 5 参构造器。
      public PXEvMid(String var1, String var2, String var3, JsonElement var4, String var5, int var6, DefaultConstructorMarker var7) {
         if ((var6 & 8) != 0) {
            var4 = null;
         }

         if ((var6 & 16) != 0) {
            var5 = null;
         }

         this(var1, var2, var3, var4, var5);
      }

      @NotNull
      public final String a() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final String c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final String e() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @Nullable
      public final JsonElement g() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @Nullable
      public final String i() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @NotNull
      public final String k() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final String l() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final String m() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @Nullable
      public final JsonElement n() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @Nullable
      public final String o() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @NotNull
      public final IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid a(
         @NotNull String var1, @NotNull String var2, @NotNull String var3, @Nullable JsonElement var4, @Nullable String var5
      ) {
         short var10001 = 20172;
         short var10002 = -8352;
         Intrinsics.checkNotNullParameter(var1, "type");
         var10001 = 20171;
         var10002 = 16980;
         Intrinsics.checkNotNullParameter(var2, "status");
         var10001 = 20173;
         var10002 = 8844;
         Intrinsics.checkNotNullParameter(var3, "itemId");
         return new IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid(
            var1, var2, var3, var4, var5
         );
      }

      // PX-RESTORE X1: Kotlin 默认参数合成静态桥（jar: a(LOuter$real;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LJsonElement;Ljava/lang/String;ILjava/lang/Object;)LOuter$real;）
      // p() 为混淆器状态位（clinit 中 b(0) 置 0）；掩码位为 0 时才用 var0 的字段填充对应参数，最后调用实例 a(...)。
      @NotNull
      public static PXEvMid a(
         @NotNull PXEvMid var0, String var1, String var2, String var3, JsonElement var4, String var5, int var6, Object var7
      ) {
         int var8 = p();
         if (var8 == 0 && (var6 & 1) != 0) {
            var1 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         if (var8 == 0 && (var6 & 2) != 0) {
            var2 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         if (var8 == 0 && (var6 & 4) != 0) {
            var3 = var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         if (var8 == 0 && (var6 & 8) != 0) {
            var4 = var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         }

         if (var8 == 0 && (var6 & 16) != 0) {
            var5 = var0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         }

         return var0.a(var1, var2, var3, var4, var5);
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 20175;
         String var1 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         JsonElement var2 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         String var3 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         String var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         String var5 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         short var10001 = 25096;
         short var10002 = 20174;
         short var10003 = -5406;
         short var10004 = 20170;
         short var10005 = 14858;
         short var10006 = 20166;
         short var10007 = 1395;
         short var10008 = 20168;
         short var10009 = -22182;
         return "MuseumResponse(type=" + var5 + ", status=" + var4 + ", itemId=" + var3 + ", payload=" + var2 + ", errorMessage=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1;
         int var8;
         int var10;
         label29: {
            var8 = q();
            int var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
            var2 = var2 * 31 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.hashCode();
            var1 = var8;
            var2 = var2 * 31 + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.hashCode();
            var8 = var2 * 31;
            JsonElement var10001 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            if (var1 != 0) {
               if (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII == null) {
                  var10 = 0;
                  break label29;
               }

               var10001 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            }

            var10 = var10001.hashCode();
         }

         label23: {
            int var6 = var8 + var10;
            var8 = var6 * 31;
            String var11 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            if (var1 != 0) {
               if (this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI == null) {
                  var10 = 0;
                  break label23;
               }

               var11 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            }

            var10 = var11.hashCode();
         }

         int var7 = var8 + var10;
         if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
            b(++var1);
         }

         return var7;
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int var2 = p();
         Object var10000 = this;
         if (var2 == 0) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == 0) {
            if (!(
               var10000 instanceof IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid
            )) {
               return false;
            }

            var10000 = var1;
         }

         IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid var3 = (IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid)var10000;
         boolean var4 = Intrinsics.areEqual(
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         );
         if (var2 == 0) {
            if (!var4) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            );
         }

         if (var2 == 0) {
            if (!var4) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            );
         }

         if (var2 == 0) {
            if (!var4) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
               var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            );
         }

         if (var2 == 0) {
            if (!var4) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
               var3.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            );
         }

         if (var2 == 0) {
            if (!var4) {
               return false;
            }

            var4 = true;
         }

         return var4;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[11];
         int var3 = 0;
         String var2 = "\"\u009f\u0007J\u0011\u0081=\u0017J\u008f<x\u001a_ôÐ\u001e\u0097iÝ\t\u000f$ïÓ\u0018\u0098\u00ad\u0018Õ\u0006ûw\u008a~H\u0007\u0004fÅ\u0092\u008c\u0006¸æ¿UVO\tõ\u0006ª\u0097í\t«\u0007®\u0006ðÓ¶ów\u009b\u000fB°PG(×Ý·dµ1S0Ô2\u0006\bòôÎ\u0087\u0011";
         int var4 = "\"\u009f\u0007J\u0011\u0081=\u0017J\u008f<x\u001a_ôÐ\u001e\u0097iÝ\t\u000f$ïÓ\u0018\u0098\u00ad\u0018Õ\u0006ûw\u008a~H\u0007\u0004fÅ\u0092\u008c\u0006¸æ¿UVO\tõ\u0006ª\u0097í\t«\u0007®\u0006ðÓ¶ów\u009b\u000fB°PG(×Ý·dµ1S0Ô2\u0006\bòôÎ\u0087\u0011"
            .length();
         b(0);
         char var1 = 20;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 5;
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
                        case 0 -> 2;
                        case 1 -> 45;
                        case 2 -> 49;
                        case 3 -> 7;
                        case 4 -> 26;
                        case 5 -> 41;
                        default -> 112;
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
                        b = new String[11];
                        IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll((kotlin.jvm.internal.DefaultConstructorMarker) null);
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

                     var2 = "Ð\u0081U0v\t#aFÊ\u0004^\u0014×ô";
                     var4 = "Ð\u0081U0v\t#aFÊ\u0004^\u0014×ô".length();
                     var1 = '\n';
                     var8 = -1;
               }

               var10000 = 7;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      public static void b(int var0) {
         IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var0;
      }

      public static int p() {
         return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      public static int q() {
         int var0 = p();
         return var0 == 0 ? 116 : 0;
      }

      // PX-RESTORE X1: 混淆器插入的空合成占位方法（jar flags=ACC_PUBLIC|ACC_STATIC|ACC_SYNTHETIC(0x1009)，stack=0/locals=0，体仅 return，类内零引用）。
      // javac 无法产出 ACC_SYNTHETIC，故标志位与 jar 不同（描述符一致）。
      public static void b() {
      }

      public static void d() {
      }

      public static void f() {
      }

      public static void h() {
      }

      public static void j() {
      }

      // PX-RESTORE pass119: Kotlin 序列化合成构造器（位掩码校验 + 直达字段赋值），
      // 语义按 jar 字节码 llIIllll….() <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LJsonElement;Ljava/lang/String;LSerializationConstructorMarker;)V 还原
      public PXEvMid(
         int var1,
         @NotNull String var2,
         @NotNull String var3,
         @NotNull String var4,
         @Nullable JsonElement var5,
         @Nullable String var6,
         SerializationConstructorMarker var7
      ) {
         if ((var1 & 7) != 7) {
            PluginExceptionsKt.throwMissingFieldException(
               var1,
               7,
               PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.getDescriptor()
            );
         }

         super();
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = (var1 & 8) != 0 ? var5 : null;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = (var1 & 16) != 0 ? var6 : null;
      }

      // PX-RESTORE pass119: Kotlin 序列化生成 writer（供 $IllllIIlll…$serializer.serialize 调用），
      // 语义按 jar 字节码 a(llIIllll…,CompositeEncoder,SerialDescriptor)V 还原
      public static final void a(
         @NotNull PXEvMid var0,
         @NotNull CompositeEncoder var1,
         @NotNull SerialDescriptor var2
      ) {
         var1.encodeStringElement(var2, 0, var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         var1.encodeStringElement(var2, 1, var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         var1.encodeStringElement(var2, 2, var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         if (var1.shouldEncodeElementDefault(var2, 3)
            || var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII != null) {
            var1.encodeNullableSerializableElement(
               var2, 3, (SerializationStrategy)JsonElementSerializer.INSTANCE, var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            );
         }

         if (var1.shouldEncodeElementDefault(var2, 4)
            || var0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI != null) {
            var1.encodeNullableSerializableElement(
               var2, 4, (SerializationStrategy)StringSerializer.INSTANCE, var0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            );
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 20175) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 107;
               case 1 -> 235;
               case 2 -> 135;
               case 3 -> 104;
               case 4 -> 223;
               case 5 -> 58;
               case 6 -> 20;
               case 7 -> 217;
               case 8 -> 190;
               case 9 -> 108;
               case 10 -> 66;
               case 11 -> 207;
               case 12 -> 165;
               case 13 -> 19;
               case 14 -> 49;
               case 15 -> 42;
               case 16 -> 14;
               case 17 -> 244;
               case 18 -> 156;
               case 19 -> 204;
               case 20 -> 88;
               case 21 -> 213;
               case 22 -> 255;
               case 23 -> 171;
               case 24 -> 6;
               case 25 -> 206;
               case 26 -> 79;
               case 27 -> 115;
               case 28 -> 152;
               case 29 -> 202;
               case 30 -> 159;
               case 31 -> 138;
               case 32 -> 4;
               case 33 -> 140;
               case 34 -> 84;
               case 35 -> 40;
               case 36 -> 91;
               case 37 -> 160;
               case 38 -> 187;
               case 39 -> 200;
               case 40 -> 77;
               case 41 -> 133;
               case 42 -> 150;
               case 43 -> 51;
               case 44 -> 201;
               case 45 -> 197;
               case 46 -> 214;
               case 47 -> 208;
               case 48 -> 0;
               case 49 -> 199;
               case 50 -> 1;
               case 51 -> 167;
               case 52 -> 211;
               case 53 -> 243;
               case 54 -> 203;
               case 55 -> 248;
               case 56 -> 109;
               case 57 -> 7;
               case 58 -> 240;
               case 59 -> 196;
               case 60 -> 62;
               case 61 -> 53;
               case 62 -> 101;
               case 63 -> 246;
               case 64 -> 181;
               case 65 -> 173;
               case 66 -> 229;
               case 67 -> 15;
               case 68 -> 119;
               case 69 -> 241;
               case 70 -> 43;
               case 71 -> 54;
               case 72 -> 27;
               case 73 -> 73;
               case 74 -> 216;
               case 75 -> 220;
               case 76 -> 251;
               case 77 -> 89;
               case 78 -> 219;
               case 79 -> 194;
               case 80 -> 117;
               case 81 -> 67;
               case 82 -> 81;
               case 83 -> 37;
               case 84 -> 24;
               case 85 -> 96;
               case 86 -> 155;
               case 87 -> 189;
               case 88 -> 12;
               case 89 -> 128;
               case 90 -> 120;
               case 91 -> 228;
               case 92 -> 110;
               case 93 -> 147;
               case 94 -> 234;
               case 95 -> 175;
               case 96 -> 87;
               case 97 -> 75;
               case 98 -> 125;
               case 99 -> 174;
               case 100 -> 26;
               case 101 -> 83;
               case 102 -> 70;
               case 103 -> 64;
               case 104 -> 97;
               case 105 -> 29;
               case 106 -> 236;
               case 107 -> 230;
               case 108 -> 72;
               case 109 -> 212;
               case 110 -> 38;
               case 111 -> 71;
               case 112 -> 86;
               case 113 -> 209;
               case 114 -> 103;
               case 115 -> 239;
               case 116 -> 198;
               case 117 -> 23;
               case 118 -> 63;
               case 119 -> 2;
               case 120 -> 191;
               case 121 -> 90;
               case 122 -> 18;
               case 123 -> 158;
               case 124 -> 65;
               case 125 -> 149;
               case 126 -> 226;
               case 127 -> 102;
               case 128 -> 222;
               case 129 -> 192;
               case 130 -> 39;
               case 131 -> 210;
               case 132 -> 123;
               case 133 -> 142;
               case 134 -> 237;
               case 135 -> 131;
               case 136 -> 233;
               case 137 -> 254;
               case 138 -> 137;
               case 139 -> 141;
               case 140 -> 180;
               case 141 -> 178;
               case 142 -> 74;
               case 143 -> 185;
               case 144 -> 105;
               case 145 -> 154;
               case 146 -> 163;
               case 147 -> 69;
               case 148 -> 231;
               case 149 -> 184;
               case 150 -> 94;
               case 151 -> 34;
               case 152 -> 56;
               case 153 -> 46;
               case 154 -> 144;
               case 155 -> 205;
               case 156 -> 113;
               case 157 -> 161;
               case 158 -> 162;
               case 159 -> 253;
               case 160 -> 10;
               case 161 -> 30;
               case 162 -> 33;
               case 163 -> 52;
               case 164 -> 111;
               case 165 -> 85;
               case 166 -> 134;
               case 167 -> 164;
               case 168 -> 218;
               case 169 -> 132;
               case 170 -> 100;
               case 171 -> 50;
               case 172 -> 11;
               case 173 -> 28;
               case 174 -> 126;
               case 175 -> 245;
               case 176 -> 143;
               case 177 -> 146;
               case 178 -> 183;
               case 179 -> 55;
               case 180 -> 45;
               case 181 -> 98;
               case 182 -> 60;
               case 183 -> 31;
               case 184 -> 32;
               case 185 -> 153;
               case 186 -> 8;
               case 187 -> 215;
               case 188 -> 95;
               case 189 -> 168;
               case 190 -> 25;
               case 191 -> 136;
               case 192 -> 35;
               case 193 -> 221;
               case 194 -> 176;
               case 195 -> 145;
               case 196 -> 252;
               case 197 -> 242;
               case 198 -> 224;
               case 199 -> 13;
               case 200 -> 5;
               case 201 -> 99;
               case 202 -> 21;
               case 203 -> 129;
               case 204 -> 61;
               case 205 -> 151;
               case 206 -> 3;
               case 207 -> 139;
               case 208 -> 17;
               case 209 -> 93;
               case 210 -> 47;
               case 211 -> 116;
               case 212 -> 170;
               case 213 -> 122;
               case 214 -> 16;
               case 215 -> 41;
               case 216 -> 121;
               case 217 -> 57;
               case 218 -> 127;
               case 219 -> 59;
               case 220 -> 179;
               case 221 -> 80;
               case 222 -> 9;
               case 223 -> 148;
               case 224 -> 118;
               case 225 -> 182;
               case 226 -> 232;
               case 227 -> 112;
               case 228 -> 76;
               case 229 -> 106;
               case 230 -> 36;
               case 231 -> 114;
               case 232 -> 238;
               case 233 -> 68;
               case 234 -> 82;
               case 235 -> 193;
               case 236 -> 130;
               case 237 -> 177;
               case 238 -> 48;
               case 239 -> 225;
               case 240 -> 157;
               case 241 -> 78;
               case 242 -> 44;
               case 243 -> 250;
               case 244 -> 249;
               case 245 -> 22;
               case 246 -> 166;
               case 247 -> 186;
               case 248 -> 124;
               case 249 -> 172;
               case 250 -> 227;
               case 251 -> 188;
               case 252 -> 247;
               case 253 -> 169;
               case 254 -> 92;
               default -> 195;
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
         // PX-RESTORE X1: jar 中该类没有任何字段（原 PX-FIX 的 PXDyn 占位字段已删除，随之消失了多余的 <clinit>）。
         // PX-RESTORE X1: jar 成员 = private <init>()V / public <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V / public final a()Lkotlinx/serialization/KSerializer;
         public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(DefaultConstructorMarker var1) {
         }

         private IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll() {
         }

         @NotNull
         public final KSerializer<IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid> a() {
            return (KSerializer<IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid>)IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         }
      }

      // PX-RESTORE pass119: Kotlin 序列化生成类（MuseumResponse 的 GeneratedSerializer），
      // 由 jar 字节码 $llIIllll…$IllllIIlll… 完整还原（serialize/deserialize/getDescriptor/childSerializers/clinit）
      public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
         implements GeneratedSerializer {
         public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         private static SerialDescriptor lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         private static String[] a;
         private static String[] b;

         private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
         }

         public final void a(@NotNull Encoder var1, @NotNull PXEvMid var2) {
            Intrinsics.checkNotNullParameter(var1, "encoder");
            Intrinsics.checkNotNullParameter(var2, "value");
            SerialDescriptor var3 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            CompositeEncoder var4 = var1.beginStructure(var3);
            PXEvMid.a(var2, var4, var3);
            var4.endStructure(var3);
         }

         @NotNull
         public final PXEvMid a(@NotNull Decoder var1) {
            Intrinsics.checkNotNullParameter(var1, "decoder");
            SerialDescriptor var2 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            int var3 = 0;
            String var4 = null;
            String var5 = null;
            String var6 = null;
            JsonElement var7 = null;
            String var8 = null;
            CompositeDecoder var9 = var1.beginStructure(var2);

            while (true) {
               int var10 = var9.decodeElementIndex(var2);
               switch (var10) {
                  case -1:
                     break;
                  case 0:
                     var4 = var9.decodeStringElement(var2, 0);
                     var3 |= 1;
                     continue;
                  case 1:
                     var5 = var9.decodeStringElement(var2, 1);
                     var3 |= 2;
                     continue;
                  case 2:
                     var6 = var9.decodeStringElement(var2, 2);
                     var3 |= 4;
                     continue;
                  case 3:
                     var7 = (JsonElement)var9
                        .decodeNullableSerializableElement(var2, 3, (DeserializationStrategy)JsonElementSerializer.INSTANCE, var7);
                     var3 |= 8;
                     continue;
                  case 4:
                     var8 = (String)var9
                        .decodeNullableSerializableElement(var2, 4, (DeserializationStrategy)StringSerializer.INSTANCE, var8);
                     var3 |= 16;
                     continue;
                  default:
                     throw new UnknownFieldException(var10);
               }

               break;
            }

            var9.endStructure(var2);
            return new PXEvMid(
               var3, var4, var5, var6, var7, var8, (SerializationConstructorMarker)null
            );
         }

         @NotNull
         public SerialDescriptor getDescriptor() {
            return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         @NotNull
         public KSerializer<?>[] childSerializers() {
            return new kotlinx.serialization.KSerializer[]{
               StringSerializer.INSTANCE,
               StringSerializer.INSTANCE,
               StringSerializer.INSTANCE,
               BuiltinSerializersKt.getNullable((KSerializer)JsonElementSerializer.INSTANCE),
               BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE)
            };
         }

         @NotNull
         public KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.super.typeParametersSerializers();
         }

         // PX-RESTORE X1: jar 的接口实现是「擦除签名」版本（serialize(Encoder,Object)V / deserialize(Decoder)Object），
         // 泛型实现被混淆器改名为 a(Encoder,real)V / a(Decoder)real；故此处实现原始签名的接口方法，并补上 jar 的私有成员。
         public void serialize(@NotNull Encoder var1, @NotNull Object var2) {
            this.a(var1, (PXEvMid)var2);
         }

         @NotNull
         public Object deserialize(@NotNull Decoder var1) {
            return this.a(var1);
         }

         // PX-RESTORE X1: jar: private static kotlinx.serialization.UnknownFieldException a(UnknownFieldException)
         // （恒等返回；jar 的 deserialize 中有 5 处异常处理调用它）
         private static UnknownFieldException a(UnknownFieldException var0) {
            return var0;
         }

         // PX-RESTORE X1: jar: private static java.lang.String a(int,int) —— 混淆器的字符串解密器（本类内零调用点，见报告「残余」）。
         // 控制流与 jar 相同：(var0 ^ 8724) & 65535 取索引，b[] 作缓存，未命中时取 a[]。
         // 残差：jar 的 a[] 由 clinit 内联的 255 路 XOR 表从加密常量解密得到；此处 clinit 直接写入解密后的明文字面量。
         //       该类内无任何调用点（javap 全类零引用），故两者行为不可区分。
         private static String a(int var0, int var1) {
            int var2 = (var0 ^ 8724) & 65535;
            String var3 = b[var2];
            if (var3 == null) {
               var3 = a[var2];
               b[var2] = var3;
            }

            return var3;
         }

         static {
            // PX-RESTORE X1: jar 的 clinit 会用内联 XOR 循环解密 9 个字符串写入 a[]，并把 b 初始化为 new String[9]（见 a(int,int) 的残差说明）。
            a = new String[]{
               "me.octo.client.modules.impl.macros.misc.museum.helpers.BackendMuseumFetching.MuseumResponse",
               "type",
               "status",
               "item_id",
               "payload",
               "error_message",
               "encoder",
               "value",
               "decoder"
            };
            b = new String[9];
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI();
            PluginGeneratedSerialDescriptor var0 = new PluginGeneratedSerialDescriptor(
               "me.octo.client.modules.impl.macros.misc.museum.helpers.BackendMuseumFetching.MuseumResponse",
               (GeneratedSerializer)IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               5
            );
            var0.addElement("type", false);
            var0.addElement("status", false);
            var0.addElement("item_id", false);
            var0.addElement("payload", true);
            var0.addElement("error_message", true);
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = (SerialDescriptor)var0;
         }
      }
   }
}
