package me.octo.client;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.ByteBufferBuilder;
import com.mojang.blaze3d.vertex.VertexConsumer;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import kotlin.Pair;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty1;
import me.octo.client.utils.lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII;
import net.minecraft.client.renderer.texture.AbstractTexture;
import org.jetbrains.annotations.NotNull;

public final class IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI {
   public static <T> T a(Object p0, Object p1, Object p2) { return null; } // PX-FIX ovld

   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4) { return null; } // PX-FIX ovld

   @NotNull
   public static IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final ObjectArrayList<ByteBufferBuilder> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new ObjectArrayList();
   @NotNull
   private final Object2ObjectOpenHashMap<IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl, BufferBuilder> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new Object2ObjectOpenHashMap();
   @NotNull
   private final ObjectArrayList<Pair<IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl, lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII>> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new ObjectArrayList();
   @NotNull
   private final Function<RenderPipeline, IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.<RenderPipeline, IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl>a(
      (Map)(new Object2ObjectOpenHashMap()), IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI::a
   );
   private static Comparator<IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static Comparator<Pair<IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl, ?>> IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static String[] a;
   private static String[] b;

   @NotNull
   public final IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl a(
      @NotNull RenderPipeline var1, @NotNull Map<String, ? extends AbstractTexture> var2, @NotNull Map<String, GpuBufferSlice> var3
   ) {
      boolean var10000 = IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.c();
      short var10002 = -31871;
      short var10003 = -6790;
      Intrinsics.checkNotNullParameter(var1, "pipeline");
      boolean var4 = var10000;
      short var10001 = -31872;
      var10002 = 29049;
      Intrinsics.checkNotNullParameter(var2, "textures");
      var10001 = -31863;
      var10002 = 30386;
      Intrinsics.checkNotNullParameter(var3, "uniforms");
      var10000 = var2.isEmpty();
      if (!var4) {
         if (!var10000) {
            return new IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl(
               var1,
               lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a(var2),
               lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a(var3)
            );
         }

         if (var4) {
            return (IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl)(Object)var3;
         }

         var10000 = var3.isEmpty();
      }

      if (var10000) {
         Object var6 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.apply(var1);
         var10002 = -31868;
         var10003 = 21458;
         Intrinsics.checkNotNullExpressionValue(var6, "apply(...)");
         return (IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl)var6;
      } else {
         return new IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl(
            var1,
            lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a(var2),
            lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a(var3)
         );
      }
   }

   @NotNull
   public final VertexConsumer a(@NotNull IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl var1) {
      short var10001 = -31858;
      short var10002 = 27060;
      Intrinsics.checkNotNullParameter(var1, "key");
      Object var10000 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         .computeIfAbsent(var1, null);
      var10002 = -31862;
      short var10003 = 22596;
      Intrinsics.checkNotNullExpressionValue(var10000, "computeIfAbsent(...)");
      return (VertexConsumer)var10000;
   }

   @JvmOverloads
   public final void a(@NotNull RenderTarget param1, @NotNull GpuBufferSlice param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: sipush -31867
      // 004: sipush -9516
      // 007: pop2
      // 008: ldc "renderTarget"
      // 00a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 00d: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()Z
      // 010: aload 2
      // 011: sipush -31866
      // 014: sipush 8502
      // 017: pop2
      // 018: ldc "dynamicTransforms"
      // 01a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 01d: istore 3
      // 01e: nop
      // 01f: aload 0
      // 020: getfield me/octo/client/IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lit/unimi/dsi/fastutil/objects/Object2ObjectOpenHashMap;
      // 023: iload 3
      // 024: ifeq 059
      // 027: invokevirtual it/unimi/dsi/fastutil/objects/Object2ObjectOpenHashMap.isEmpty ()Z
      // 02a: ifeq 055
      // 02d: goto 034
      // 030: invokestatic me/octo/client/IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 033: athrow
      // 034: nop
      // 035: aload 0
      // 036: getfield me/octo/client/IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
      // 039: invokevirtual it/unimi/dsi/fastutil/objects/ObjectArrayList.clear ()V
      // 03c: aload 0
      // 03d: getfield me/octo/client/IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lit/unimi/dsi/fastutil/objects/Object2ObjectOpenHashMap;
      // 040: invokevirtual it/unimi/dsi/fastutil/objects/Object2ObjectOpenHashMap.clear ()V
      // 043: aload 0
      // 044: getfield me/octo/client/IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
      // 047: checkcast java/lang/Iterable
      // 04a: invokestatic me/octo/client/lIIllllIIIIIIIIlIllIllIIlIIIlIlIlIIIllIIlIlIIIIIIllllIIIllIllIIIlllIllIIllllllllIllll.a (Ljava/lang/Iterable;)V
      // 04d: aload 0
      // 04e: getfield me/octo/client/IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
      // 051: invokevirtual it/unimi/dsi/fastutil/objects/ObjectArrayList.clear ()V
      // 054: return
      // 055: aload 0
      // 056: getfield me/octo/client/IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lit/unimi/dsi/fastutil/objects/Object2ObjectOpenHashMap;
      // 059: astore 4
      // 05b: bipush 0
      // 05c: istore 5
      // 05e: aload 4
      // 060: invokevirtual it/unimi/dsi/fastutil/objects/Object2ObjectOpenHashMap.object2ObjectEntrySet ()Lit/unimi/dsi/fastutil/objects/Object2ObjectMap$FastEntrySet;
      // 063: invokeinterface it/unimi/dsi/fastutil/objects/Object2ObjectMap$FastEntrySet.fastIterator ()Lit/unimi/dsi/fastutil/objects/ObjectIterator; 1
      // 068: dup
      // 069: sipush -31859
      // 06c: sipush -19502
      // 06f: pop2
      // 070: ldc "fastIterator(...)"
      // 072: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 075: checkcast java/util/Iterator
      // 078: astore 4
      // 07a: nop
      // 07b: bipush 0
      // 07c: istore 5
      // 07e: aload 4
      // 080: astore 6
      // 082: aload 6
      // 084: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 089: ifeq 13a
      // 08c: aload 6
      // 08e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 093: astore 7
      // 095: aload 7
      // 097: checkcast java/util/Map$Entry
      // 09a: astore 8
      // 09c: bipush 0
      // 09d: istore 9
      // 09f: aload 8
      // 0a1: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 0a6: checkcast me/octo/client/IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl
      // 0a9: astore 10
      // 0ab: aload 8
      // 0ad: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 0b2: checkcast com/mojang/blaze3d/vertex/BufferBuilder
      // 0b5: astore 11
      // 0b7: iload 3
      // 0b8: ifeq 133
      // 0bb: aload 11
      // 0bd: invokevirtual com/mojang/blaze3d/vertex/BufferBuilder.build ()Lcom/mojang/blaze3d/vertex/MeshData;
      // 0c0: iload 3
      // 0c1: ifeq 1a5
      // 0c4: goto 0cb
      // 0c7: invokestatic me/octo/client/IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ca: athrow
      // 0cb: dup
      // 0cc: ifnull 132
      // 0cf: goto 0d6
      // 0d2: invokestatic me/octo/client/IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d5: athrow
      // 0d6: checkcast java/lang/AutoCloseable
      // 0d9: astore 12
      // 0db: aconst_null
      // 0dc: astore 13
      // 0de: nop
      // 0df: aload 12
      // 0e1: checkcast com/mojang/blaze3d/vertex/MeshData
      // 0e4: astore 14
      // 0e6: bipush 0
      // 0e7: istore 15
      // 0e9: aload 0
      // 0ea: getfield me/octo/client/IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
      // 0ed: checkcast java/util/Collection
      // 0f0: aload 10
      // 0f2: getstatic me/octo/client/lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0f5: aload 14
      // 0f7: aload 10
      // 0f9: invokevirtual me/octo/client/IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl.a ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
      // 0fc: aconst_null
      // 0fd: aconst_null
      // 0fe: bipush 6
      // 100: aconst_null
      // 101: invokestatic me/octo/client/lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lme/octo/client/lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;Lcom/mojang/blaze3d/vertex/MeshData;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Ljava/util/function/Function;Ljava/util/function/Function;ILjava/lang/Object;)Lme/octo/client/lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII;
      // 104: invokestatic kotlin/TuplesKt.to (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
      // 107: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 10c: pop
      // 10d: nop
      // 10e: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 111: astore 14
      // 113: aload 12
      // 115: aload 13
      // 117: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 11a: goto 134
      // 11d: astore 15
      // 11f: aload 15
      // 121: astore 13
      // 123: aload 15
      // 125: athrow
      // 126: astore 15
      // 128: aload 12
      // 12a: aload 13
      // 12c: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 12f: aload 15
      // 131: athrow
      // 132: pop
      // 133: nop
      // 134: nop
      // 135: nop
      // 136: iload 3
      // 137: ifne 082
      // 13a: nop
      // 13b: aload 0
      // 13c: getfield me/octo/client/IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lit/unimi/dsi/fastutil/objects/Object2ObjectOpenHashMap;
      // 13f: invokevirtual it/unimi/dsi/fastutil/objects/Object2ObjectOpenHashMap.clear ()V
      // 142: aload 0
      // 143: getfield me/octo/client/IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
      // 146: iload 3
      // 147: ifeq 17f
      // 14a: invokevirtual it/unimi/dsi/fastutil/objects/ObjectArrayList.isEmpty ()Z
      // 14d: ifeq 178
      // 150: goto 157
      // 153: invokestatic me/octo/client/IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 156: athrow
      // 157: nop
      // 158: aload 0
      // 159: getfield me/octo/client/IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
      // 15c: invokevirtual it/unimi/dsi/fastutil/objects/ObjectArrayList.clear ()V
      // 15f: aload 0
      // 160: getfield me/octo/client/IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lit/unimi/dsi/fastutil/objects/Object2ObjectOpenHashMap;
      // 163: invokevirtual it/unimi/dsi/fastutil/objects/Object2ObjectOpenHashMap.clear ()V
      // 166: aload 0
      // 167: getfield me/octo/client/IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
      // 16a: checkcast java/lang/Iterable
      // 16d: invokestatic me/octo/client/lIIllllIIIIIIIIlIllIllIIlIIIlIlIlIIIllIIlIlIIIIIIllllIIIllIllIIIlllIllIIllllllllIllll.a (Ljava/lang/Iterable;)V
      // 170: aload 0
      // 171: getfield me/octo/client/IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
      // 174: invokevirtual it/unimi/dsi/fastutil/objects/ObjectArrayList.clear ()V
      // 177: return
      // 178: aload 0
      // 179: getfield me/octo/client/IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
      // 17c: checkcast java/util/List
      // 17f: getstatic me/octo/client/IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Ljava/util/Comparator;
      // 182: dup
      // 183: sipush -31861
      // 186: sipush -2406
      // 189: pop2
      // 18a: ldc "PAIR_COMPARATOR"
      // 18c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 18f: invokestatic kotlin/collections/CollectionsKt.sortWith (Ljava/util/List;Ljava/util/Comparator;)V
      // 192: aload 1
      // 193: invokedynamic get ()Ljava/util/function/Supplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.a ()Ljava/lang/String;, ()Ljava/lang/String; ]
      // 198: aconst_null
      // 199: aconst_null
      // 19a: bipush 0
      // 19b: bipush 1
      // 19c: bipush 14
      // 19e: aconst_null
      // 19f: invokestatic me/octo/client/lIIIIIlllIlllllIlIllIlIlIIIlIlIlllIllllllIIlIlIIlIIlllIlIllIllllllIllIIIIIllllIIIlIIl.a (Lcom/mojang/blaze3d/pipeline/RenderTarget;Ljava/util/function/Supplier;Ljava/util/OptionalInt;Ljava/util/OptionalDouble;ZZILjava/lang/Object;)Lcom/mojang/blaze3d/systems/RenderPass;
      // 1a2: checkcast java/lang/AutoCloseable
      // 1a5: astore 4
      // 1a7: aconst_null
      // 1a8: astore 5
      // 1aa: nop
      // 1ab: aload 4
      // 1ad: checkcast com/mojang/blaze3d/systems/RenderPass
      // 1b0: astore 6
      // 1b2: bipush 0
      // 1b3: istore 7
      // 1b5: aload 6
      // 1b7: astore 8
      // 1b9: bipush 0
      // 1ba: istore 9
      // 1bc: invokestatic com/mojang/blaze3d/systems/RenderSystem.getScissorStateForRenderTypeDraws ()Lcom/mojang/blaze3d/systems/ScissorState;
      // 1bf: dup
      // 1c0: sipush -31860
      // 1c3: sipush -4643
      // 1c6: pop2
      // 1c7: ldc_w "getScissorStateForRenderTypeDraws(...)"
      // 1ca: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1cd: astore 10
      // 1cf: aload 10
      // 1d1: invokevirtual com/mojang/blaze3d/systems/ScissorState.enabled ()Z
      // 1d4: iload 3
      // 1d5: ifeq 208
      // 1d8: ifeq 202
      // 1db: goto 1e2
      // 1de: invokestatic me/octo/client/IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e1: athrow
      // 1e2: aload 8
      // 1e4: aload 10
      // 1e6: invokevirtual com/mojang/blaze3d/systems/ScissorState.x ()I
      // 1e9: aload 10
      // 1eb: invokevirtual com/mojang/blaze3d/systems/ScissorState.y ()I
      // 1ee: aload 10
      // 1f0: invokevirtual com/mojang/blaze3d/systems/ScissorState.width ()I
      // 1f3: aload 10
      // 1f5: invokevirtual com/mojang/blaze3d/systems/ScissorState.height ()I
      // 1f8: invokevirtual com/mojang/blaze3d/systems/RenderPass.enableScissor (IIII)V
      // 1fb: goto 202
      // 1fe: invokestatic me/octo/client/IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 201: athrow
      // 202: nop
      // 203: aload 6
      // 205: astore 8
      // 207: bipush 0
      // 208: istore 9
      // 20a: aload 8
      // 20c: invokestatic com/mojang/blaze3d/systems/RenderSystem.bindDefaultUniforms (Lcom/mojang/blaze3d/systems/RenderPass;)V
      // 20f: aload 6
      // 211: astore 8
      // 213: aload 2
      // 214: astore 9
      // 216: bipush 0
      // 217: istore 10
      // 219: aload 8
      // 21b: sipush -31865
      // 21e: sipush 23641
      // 221: pop2
      // 222: ldc_w "DynamicTransforms"
      // 225: aload 9
      // 227: invokevirtual com/mojang/blaze3d/systems/RenderPass.setUniform (Ljava/lang/String;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V
      // 22a: nop
      // 22b: aload 0
      // 22c: getfield me/octo/client/IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
      // 22f: checkcast java/lang/Iterable
      // 232: astore 8
      // 234: bipush 0
      // 235: istore 9
      // 237: aload 8
      // 239: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 23e: astore 10
      // 240: aload 10
      // 242: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 247: ifeq 394
      // 24a: aload 10
      // 24c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 251: astore 11
      // 253: aload 11
      // 255: checkcast kotlin/Pair
      // 258: astore 12
      // 25a: bipush 0
      // 25b: istore 13
      // 25d: aload 12
      // 25f: invokevirtual kotlin/Pair.component1 ()Ljava/lang/Object;
      // 262: checkcast me/octo/client/IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl
      // 265: astore 14
      // 267: aload 12
      // 269: invokevirtual kotlin/Pair.component2 ()Ljava/lang/Object;
      // 26c: checkcast me/octo/client/lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII
      // 26f: astore 15
      // 271: aload 6
      // 273: aload 14
      // 275: invokevirtual me/octo/client/IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl.a ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
      // 278: invokevirtual com/mojang/blaze3d/systems/RenderPass.setPipeline (Lcom/mojang/blaze3d/pipeline/RenderPipeline;)V
      // 27b: aload 6
      // 27d: astore 16
      // 27f: aload 14
      // 281: invokevirtual me/octo/client/IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl.c ()Ljava/util/Map;
      // 284: astore 17
      // 286: bipush 0
      // 287: istore 18
      // 289: aload 17
      // 28b: astore 19
      // 28d: bipush 0
      // 28e: istore 20
      // 290: iload 3
      // 291: ifeq 396
      // 294: aload 19
      // 296: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 29b: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 2a0: astore 21
      // 2a2: aload 21
      // 2a4: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2a9: ifeq 2e1
      // 2ac: aload 21
      // 2ae: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2b3: checkcast java/util/Map$Entry
      // 2b6: astore 22
      // 2b8: aload 22
      // 2ba: astore 23
      // 2bc: bipush 0
      // 2bd: istore 24
      // 2bf: aload 16
      // 2c1: aload 23
      // 2c3: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 2c8: checkcast java/lang/String
      // 2cb: aload 23
      // 2cd: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 2d2: checkcast com/mojang/blaze3d/buffers/GpuBufferSlice
      // 2d5: invokevirtual com/mojang/blaze3d/systems/RenderPass.setUniform (Ljava/lang/String;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V
      // 2d8: nop
      // 2d9: iload 3
      // 2da: ifeq 2f8
      // 2dd: iload 3
      // 2de: ifne 2a2
      // 2e1: nop
      // 2e2: nop
      // 2e3: aload 6
      // 2e5: astore 16
      // 2e7: aload 14
      // 2e9: invokevirtual me/octo/client/IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl.b ()Ljava/util/Map;
      // 2ec: astore 17
      // 2ee: bipush 0
      // 2ef: istore 18
      // 2f1: aload 17
      // 2f3: astore 19
      // 2f5: bipush 0
      // 2f6: istore 20
      // 2f8: aload 19
      // 2fa: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 2ff: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 304: astore 21
      // 306: aload 21
      // 308: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 30d: ifeq 382
      // 310: aload 21
      // 312: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 317: checkcast java/util/Map$Entry
      // 31a: astore 22
      // 31c: aload 22
      // 31e: astore 23
      // 320: bipush 0
      // 321: istore 24
      // 323: aload 16
      // 325: astore 25
      // 327: aload 23
      // 329: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 32e: checkcast java/lang/String
      // 331: astore 26
      // 333: aload 23
      // 335: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 33a: checkcast net/minecraft/client/renderer/texture/AbstractTexture
      // 33d: astore 27
      // 33f: bipush 0
      // 340: istore 28
      // 342: aload 25
      // 344: aload 26
      // 346: iload 3
      // 347: ifeq 366
      // 34a: aload 27
      // 34c: iload 3
      // 34d: ifeq 2d2
      // 350: goto 357
      // 353: invokestatic me/octo/client/IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 356: athrow
      // 357: dup
      // 358: ifnull 365
      // 35b: invokevirtual net/minecraft/client/renderer/texture/AbstractTexture.getTextureView ()Lcom/mojang/blaze3d/textures/GpuTextureView;
      // 35e: goto 367
      // 361: invokestatic me/octo/client/IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 364: athrow
      // 365: pop
      // 366: aconst_null
      // 367: aload 27
      // 369: dup
      // 36a: ifnull 377
      // 36d: invokevirtual net/minecraft/client/renderer/texture/AbstractTexture.getSampler ()Lcom/mojang/blaze3d/textures/GpuSampler;
      // 370: goto 379
      // 373: invokestatic me/octo/client/IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 376: athrow
      // 377: pop
      // 378: aconst_null
      // 379: invokevirtual com/mojang/blaze3d/systems/RenderPass.bindTexture (Ljava/lang/String;Lcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/textures/GpuSampler;)V
      // 37c: nop
      // 37d: nop
      // 37e: iload 3
      // 37f: ifne 306
      // 382: nop
      // 383: nop
      // 384: getstatic me/octo/client/lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 387: aload 6
      // 389: aload 15
      // 38b: invokevirtual me/octo/client/lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lcom/mojang/blaze3d/systems/RenderPass;Lme/octo/client/lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII;)V
      // 38e: nop
      // 38f: nop
      // 390: iload 3
      // 391: ifne 240
      // 394: nop
      // 395: nop
      // 396: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 399: astore 6
      // 39b: aload 4
      // 39d: aload 5
      // 39f: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 3a2: goto 3ba
      // 3a5: astore 7
      // 3a7: aload 7
      // 3a9: astore 5
      // 3ab: aload 7
      // 3ad: athrow
      // 3ae: astore 7
      // 3b0: aload 4
      // 3b2: aload 5
      // 3b4: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 3b7: aload 7
      // 3b9: athrow
      // 3ba: aload 0
      // 3bb: getfield me/octo/client/IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
      // 3be: invokevirtual it/unimi/dsi/fastutil/objects/ObjectArrayList.clear ()V
      // 3c1: aload 0
      // 3c2: getfield me/octo/client/IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lit/unimi/dsi/fastutil/objects/Object2ObjectOpenHashMap;
      // 3c5: invokevirtual it/unimi/dsi/fastutil/objects/Object2ObjectOpenHashMap.clear ()V
      // 3c8: aload 0
      // 3c9: getfield me/octo/client/IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
      // 3cc: checkcast java/lang/Iterable
      // 3cf: invokestatic me/octo/client/lIIllllIIIIIIIIlIllIllIIlIIIlIlIlIIIllIIlIlIIIIIIllllIIIllIllIIIlllIllIIllllllllIllll.a (Ljava/lang/Iterable;)V
      // 3d2: aload 0
      // 3d3: getfield me/octo/client/IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
      // 3d6: invokevirtual it/unimi/dsi/fastutil/objects/ObjectArrayList.clear ()V
      // 3d9: goto 400
      // 3dc: astore 4
      // 3de: aload 0
      // 3df: getfield me/octo/client/IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
      // 3e2: invokevirtual it/unimi/dsi/fastutil/objects/ObjectArrayList.clear ()V
      // 3e5: aload 0
      // 3e6: getfield me/octo/client/IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lit/unimi/dsi/fastutil/objects/Object2ObjectOpenHashMap;
      // 3e9: invokevirtual it/unimi/dsi/fastutil/objects/Object2ObjectOpenHashMap.clear ()V
      // 3ec: aload 0
      // 3ed: getfield me/octo/client/IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
      // 3f0: checkcast java/lang/Iterable
      // 3f3: invokestatic me/octo/client/lIIllllIIIIIIIIlIllIllIIlIIIlIlIlIIIllIIlIlIIIIIIllllIIIllIllIIIlllIllIIllllllllIllll.a (Ljava/lang/Iterable;)V
      // 3f6: aload 0
      // 3f7: getfield me/octo/client/IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
      // 3fa: invokevirtual it/unimi/dsi/fastutil/objects/ObjectArrayList.clear ()V
      // 3fd: aload 4
      // 3ff: athrow
      // 400: return
   }

   @JvmOverloads
   public final void a(@NotNull RenderTarget var1) {
      short var10001 = -31857;
      short var10002 = 14106;
      Intrinsics.checkNotNullParameter(var1, "renderTarget");
      a(this, var1, null);
   }

   private static final IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl a(RenderPipeline var0) {
      Intrinsics.checkNotNull(var0);
      return new IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl(var0, null, null, 6, null);
   }

   private static final BufferBuilder a(
      IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI var0,
      IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl var1
   ) {
      return lIIllllIIIIIIIIlIllIllIIlIIIlIlIlIIIllIIlIlIIIIIIllllIIIllIllIIIlllIllIIllllllllIllll.a(
         var1.a(), (Collection)var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
      );
   }

   private static final String a() {
      short var10000 = -31864;
      short var10001 = -21892;
      return "WorldRenderEnvironment Batch draw";
   }

   private static final int b(IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl var0) {
      return var0.a().getSortKey();
   }

   private static final int a(Function1 var0, Object var1) {
      return ((Number)var0.invoke(var1)).intValue();
   }

   private static final int c(IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl var0) {
      return var0.b().size();
   }

   private static final int b(Function1 var0, Object var1) {
      return ((Number)var0.invoke(var1)).intValue();
   }

   private static final int d(IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl var0) {
      return var0.c().size();
   }

   private static final int c(Function1 var0, Object var1) {
      return ((Number)var0.invoke(var1)).intValue();
   }

   private static final int e(IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl var0) {
      return var0.hashCode();
   }

   private static final int d(Function1 var0, Object var1) {
      return ((Number)var0.invoke(var1)).intValue();
   }

   private static final IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl a(KProperty1 var0, Pair var1) {
      return (IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl)((Function1)var0).invoke(var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[14];
      int var3 = 0;
      String var2 = "R ï\u0099ð©¦÷âÊÚ\u0088å¾õ\u008c\u0000&àæ\u009fâ3\u0018§~\u0018Üv\u008a\u0082b2n\u009c\u0095\u001aÿ\u0088\u0018Iå\u0010 ¸\u009agv=!À\u0081\u0096y\u0089\u0091\f%E\u008a¡Îºù@\r^\\m\u0003Íjº\b·|8îu\u0011ü'!siÝgºKgUß\u0010Å×þÜ_Ï¼\u000f!37\u0091ûö\u009eùé\u0010X\u009d!\u009e6\u000f\u0092Ë=æÁ\u0093~^§\u0012X3Sý¬\u0014\u0090¼\fÁm&®=äúð\u001cAMß¼S0öÐ\f\u0010\u0019,*\u001aËcn^\u009b6Õ\nçc½Úé\u0086ø\u0099D\u008d\u0011\u0091µì%\n\u0094_È\bÚ÷</HwxÝ\u0011¶\u0090,\u0081\u0012\u0000\\Zh\u0088ûv®\u0001GQÛ";
      int var4 = "R ï\u0099ð©¦÷âÊÚ\u0088å¾õ\u008c\u0000&àæ\u009fâ3\u0018§~\u0018Üv\u008a\u0082b2n\u009c\u0095\u001aÿ\u0088\u0018Iå\u0010 ¸\u009agv=!À\u0081\u0096y\u0089\u0091\f%E\u008a¡Îºù@\r^\\m\u0003Íjº\b·|8îu\u0011ü'!siÝgºKgUß\u0010Å×þÜ_Ï¼\u000f!37\u0091ûö\u009eùé\u0010X\u009d!\u009e6\u000f\u0092Ë=æÁ\u0093~^§\u0012X3Sý¬\u0014\u0090¼\fÁm&®=äúð\u001cAMß¼S0öÐ\f\u0010\u0019,*\u001aËcn^\u009b6Õ\nçc½Úé\u0086ø\u0099D\u008d\u0011\u0091µì%\n\u0094_È\bÚ÷</HwxÝ\u0011¶\u0090,\u0081\u0012\u0000\\Zh\u0088ûv®\u0001GQÛ"
         .length();
      char var1 = 17;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 6;
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
                     case 0 -> 102;
                     case 1 -> 114;
                     case 2 -> 118;
                     case 3 -> 44;
                     case 4 -> 81;
                     case 5 -> 87;
                     default -> 81;
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
                     b = new String[14];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = Comparator.<IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl>comparingInt(IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI::b)
                        .thenComparingInt(IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI::c)
                        .thenComparingInt(IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI::d)
                        .thenComparingInt(IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI::e);
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = Comparator.comparing(
                        (t) -> (IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl)((kotlin.Pair)t).getFirst(),
                        IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     );
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

                  var2 = "\u001c\u008a\u008fªÄ\u009fÔæ\b×Êz>j%0ß";
                  var4 = "\u001c\u008a\u008fªÄ\u009fÔæ\b×Êz>j%0ß".length();
                  var1 = '\b';
                  var8 = -1;
            }

            var10000 = 118;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static Throwable a(Throwable var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -31859) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 113;
            case 1 -> 209;
            case 2 -> 82;
            case 3 -> 22;
            case 4 -> 28;
            case 5 -> 247;
            case 6 -> 124;
            case 7 -> 0;
            case 8 -> 137;
            case 9 -> 161;
            case 10 -> 65;
            case 11 -> 123;
            case 12 -> 254;
            case 13 -> 178;
            case 14 -> 31;
            case 15 -> 57;
            case 16 -> 58;
            case 17 -> 205;
            case 18 -> 71;
            case 19 -> 56;
            case 20 -> 190;
            case 21 -> 69;
            case 22 -> 54;
            case 23 -> 222;
            case 24 -> 73;
            case 25 -> 14;
            case 26 -> 206;
            case 27 -> 85;
            case 28 -> 106;
            case 29 -> 120;
            case 30 -> 237;
            case 31 -> 230;
            case 32 -> 12;
            case 33 -> 211;
            case 34 -> 193;
            case 35 -> 217;
            case 36 -> 87;
            case 37 -> 228;
            case 38 -> 61;
            case 39 -> 188;
            case 40 -> 39;
            case 41 -> 150;
            case 42 -> 37;
            case 43 -> 184;
            case 44 -> 250;
            case 45 -> 96;
            case 46 -> 110;
            case 47 -> 84;
            case 48 -> 40;
            case 49 -> 240;
            case 50 -> 126;
            case 51 -> 79;
            case 52 -> 139;
            case 53 -> 86;
            case 54 -> 176;
            case 55 -> 13;
            case 56 -> 203;
            case 57 -> 200;
            case 58 -> 47;
            case 59 -> 163;
            case 60 -> 129;
            case 61 -> 173;
            case 62 -> 142;
            case 63 -> 180;
            case 64 -> 195;
            case 65 -> 233;
            case 66 -> 78;
            case 67 -> 147;
            case 68 -> 174;
            case 69 -> 227;
            case 70 -> 119;
            case 71 -> 99;
            case 72 -> 133;
            case 73 -> 7;
            case 74 -> 80;
            case 75 -> 109;
            case 76 -> 152;
            case 77 -> 153;
            case 78 -> 102;
            case 79 -> 115;
            case 80 -> 224;
            case 81 -> 25;
            case 82 -> 24;
            case 83 -> 172;
            case 84 -> 46;
            case 85 -> 43;
            case 86 -> 226;
            case 87 -> 154;
            case 88 -> 101;
            case 89 -> 249;
            case 90 -> 53;
            case 91 -> 118;
            case 92 -> 131;
            case 93 -> 234;
            case 94 -> 41;
            case 95 -> 242;
            case 96 -> 89;
            case 97 -> 98;
            case 98 -> 157;
            case 99 -> 104;
            case 100 -> 33;
            case 101 -> 42;
            case 102 -> 187;
            case 103 -> 91;
            case 104 -> 244;
            case 105 -> 221;
            case 106 -> 134;
            case 107 -> 36;
            case 108 -> 208;
            case 109 -> 225;
            case 110 -> 8;
            case 111 -> 121;
            case 112 -> 210;
            case 113 -> 29;
            case 114 -> 92;
            case 115 -> 146;
            case 116 -> 241;
            case 117 -> 17;
            case 118 -> 130;
            case 119 -> 83;
            case 120 -> 116;
            case 121 -> 10;
            case 122 -> 93;
            case 123 -> 38;
            case 124 -> 202;
            case 125 -> 245;
            case 126 -> 143;
            case 127 -> 136;
            case 128 -> 246;
            case 129 -> 18;
            case 130 -> 9;
            case 131 -> 26;
            case 132 -> 64;
            case 133 -> 212;
            case 134 -> 32;
            case 135 -> 236;
            case 136 -> 175;
            case 137 -> 50;
            case 138 -> 100;
            case 139 -> 3;
            case 140 -> 219;
            case 141 -> 181;
            case 142 -> 204;
            case 143 -> 192;
            case 144 -> 162;
            case 145 -> 60;
            case 146 -> 125;
            case 147 -> 201;
            case 148 -> 62;
            case 149 -> 215;
            case 150 -> 158;
            case 151 -> 207;
            case 152 -> 159;
            case 153 -> 107;
            case 154 -> 141;
            case 155 -> 145;
            case 156 -> 21;
            case 157 -> 11;
            case 158 -> 183;
            case 159 -> 75;
            case 160 -> 194;
            case 161 -> 30;
            case 162 -> 76;
            case 163 -> 155;
            case 164 -> 214;
            case 165 -> 95;
            case 166 -> 55;
            case 167 -> 45;
            case 168 -> 6;
            case 169 -> 1;
            case 170 -> 68;
            case 171 -> 253;
            case 172 -> 114;
            case 173 -> 238;
            case 174 -> 122;
            case 175 -> 20;
            case 176 -> 2;
            case 177 -> 111;
            case 178 -> 23;
            case 179 -> 51;
            case 180 -> 140;
            case 181 -> 218;
            case 182 -> 52;
            case 183 -> 138;
            case 184 -> 34;
            case 185 -> 144;
            case 186 -> 243;
            case 187 -> 166;
            case 188 -> 171;
            case 189 -> 232;
            case 190 -> 229;
            case 191 -> 165;
            case 192 -> 103;
            case 193 -> 15;
            case 194 -> 135;
            case 195 -> 74;
            case 196 -> 167;
            case 197 -> 97;
            case 198 -> 199;
            case 199 -> 198;
            case 200 -> 182;
            case 201 -> 112;
            case 202 -> 117;
            case 203 -> 77;
            case 204 -> 149;
            case 205 -> 185;
            case 206 -> 216;
            case 207 -> 4;
            case 208 -> 70;
            case 209 -> 231;
            case 210 -> 169;
            case 211 -> 127;
            case 212 -> 148;
            case 213 -> 27;
            case 214 -> 132;
            case 215 -> 16;
            case 216 -> 191;
            case 217 -> 220;
            case 218 -> 189;
            case 219 -> 66;
            case 220 -> 255;
            case 221 -> 44;
            case 222 -> 63;
            case 223 -> 151;
            case 224 -> 88;
            case 225 -> 48;
            case 226 -> 94;
            case 227 -> 179;
            case 228 -> 223;
            case 229 -> 19;
            case 230 -> 170;
            case 231 -> 35;
            case 232 -> 72;
            case 233 -> 160;
            case 234 -> 235;
            case 235 -> 251;
            case 236 -> 108;
            case 237 -> 128;
            case 238 -> 59;
            case 239 -> 239;
            case 240 -> 177;
            case 241 -> 164;
            case 242 -> 248;
            case 243 -> 105;
            case 244 -> 156;
            case 245 -> 252;
            case 246 -> 186;
            case 247 -> 213;
            case 248 -> 49;
            case 249 -> 67;
            case 250 -> 197;
            case 251 -> 168;
            case 252 -> 90;
            case 253 -> 81;
            case 254 -> 196;
            default -> 5;
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
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }
   // PX-FIX synth restored from jar bytecode
   public static void a(me.octo.client.IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI p0, com.mojang.blaze3d.pipeline.RenderTarget p1, com.mojang.blaze3d.buffers.GpuBufferSlice p2, int p3, java.lang.Object p4) {
      if ((p3 & 2) != 0) {
         p2 = me.octo.client.lIIIIIlllIlllllIlIllIlIlIIIlIlIlllIllllllIIlIlIIlIIlllIlIllIllllllIllIIIIIllllIIIlIIl.a((org.joml.Matrix4fc) null, (me.octo.client.llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll) null, 3, (java.lang.Object) null);
      }
      p0.a(p1, p2);
   }
}
