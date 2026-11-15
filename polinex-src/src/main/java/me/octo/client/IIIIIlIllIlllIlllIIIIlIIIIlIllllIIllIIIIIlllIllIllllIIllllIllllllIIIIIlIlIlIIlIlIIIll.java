package me.octo.client;

import it.unimi.dsi.fastutil.booleans.BooleanArrayList;
import it.unimi.dsi.fastutil.floats.FloatArrayList;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.internal.Ref.ObjectRef;
import me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl;
import me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.AABB;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll {
   
   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T a(Object p0, AABB p1, llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlI

   @NotNull
   public static IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static ObjectArrayList<AABB> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static IntArrayList IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static IntArrayList lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static FloatArrayList IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static IntArrayList IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static FloatArrayList IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private static BooleanArrayList lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private static FloatArrayList IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private static IntArrayList llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private static Object2ObjectOpenHashMap<Object, IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private static Object lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static String[] a;
   private static String[] b;

   private IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll() {
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull AABB param0,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll param1,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll param2,
      float param3,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll param4,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll param5,
      float param6,
      boolean param7,
      float param8
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()Z
      // 03: aload 0
      // 04: sipush 27248
      // 07: sipush 2956
      // 0a: pop2
      // 0b: ldc "box"
      // 0d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 10: getstatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Ljava/lang/Object;
      // 13: astore 10
      // 15: istore 9
      // 17: aload 10
      // 19: monitorenter
      // 1a: nop
      // 1b: bipush 0
      // 1c: istore 11
      // 1e: getstatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
      // 21: aload 0
      // 22: invokevirtual it/unimi/dsi/fastutil/objects/ObjectArrayList.add (Ljava/lang/Object;)Z
      // 25: pop
      // 26: getstatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lit/unimi/dsi/fastutil/ints/IntArrayList;
      // 29: iload 9
      // 2b: ifeq 45
      // 2e: aload 1
      // 2f: dup
      // 30: ifnull 44
      // 33: goto 3a
      // 36: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 39: athrow
      // 3a: invokevirtual me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.h ()I
      // 3d: goto 46
      // 40: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 43: athrow
      // 44: pop
      // 45: bipush 0
      // 46: invokevirtual it/unimi/dsi/fastutil/ints/IntArrayList.add (I)Z
      // 49: pop
      // 4a: getstatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lit/unimi/dsi/fastutil/ints/IntArrayList;
      // 4d: iload 9
      // 4f: ifeq 69
      // 52: aload 2
      // 53: dup
      // 54: ifnull 68
      // 57: goto 5e
      // 5a: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5d: athrow
      // 5e: invokevirtual me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.h ()I
      // 61: goto 6a
      // 64: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 67: athrow
      // 68: pop
      // 69: bipush 0
      // 6a: invokevirtual it/unimi/dsi/fastutil/ints/IntArrayList.add (I)Z
      // 6d: pop
      // 6e: getstatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lit/unimi/dsi/fastutil/floats/FloatArrayList;
      // 71: fload 3
      // 72: invokevirtual it/unimi/dsi/fastutil/floats/FloatArrayList.add (F)Z
      // 75: pop
      // 76: getstatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lit/unimi/dsi/fastutil/ints/IntArrayList;
      // 79: iload 9
      // 7b: ifeq 96
      // 7e: aload 4
      // 80: dup
      // 81: ifnull 95
      // 84: goto 8b
      // 87: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 8a: athrow
      // 8b: invokevirtual me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.h ()I
      // 8e: goto 97
      // 91: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 94: athrow
      // 95: pop
      // 96: bipush 0
      // 97: invokevirtual it/unimi/dsi/fastutil/ints/IntArrayList.add (I)Z
      // 9a: pop
      // 9b: getstatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lit/unimi/dsi/fastutil/ints/IntArrayList;
      // 9e: iload 9
      // a0: ifeq bb
      // a3: aload 5
      // a5: dup
      // a6: ifnull ba
      // a9: goto b0
      // ac: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // af: athrow
      // b0: invokevirtual me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.h ()I
      // b3: goto bc
      // b6: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // b9: athrow
      // ba: pop
      // bb: bipush 0
      // bc: invokevirtual it/unimi/dsi/fastutil/ints/IntArrayList.add (I)Z
      // bf: pop
      // c0: getstatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lit/unimi/dsi/fastutil/floats/FloatArrayList;
      // c3: fload 6
      // c5: invokevirtual it/unimi/dsi/fastutil/floats/FloatArrayList.add (F)Z
      // c8: pop
      // c9: getstatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Lit/unimi/dsi/fastutil/booleans/BooleanArrayList;
      // cc: iload 7
      // ce: invokevirtual it/unimi/dsi/fastutil/booleans/BooleanArrayList.add (Z)Z
      // d1: pop
      // d2: getstatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lit/unimi/dsi/fastutil/floats/FloatArrayList;
      // d5: fload 8
      // d7: invokevirtual it/unimi/dsi/fastutil/floats/FloatArrayList.add (F)Z
      // da: istore 11
      // dc: aload 10
      // de: monitorexit
      // df: goto ea
      // e2: astore 12
      // e4: aload 10
      // e6: monitorexit
      // e7: aload 12
      // e9: athrow
      // ea: return
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull BlockPos var0,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2,
      float var3,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var4,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var5,
      float var6,
      boolean var7,
      float var8
   ) {
      short var10001 = 27242;
      short var10002 = 5919;
      Intrinsics.checkNotNullParameter(var0, "pos");
      a(
         new AABB(var0.getX(), var0.getY(), var0.getZ(), var0.getX() + 1.0, var0.getY() + 1.0, var0.getZ() + 1.0),
         var1,
         var2,
         var3,
         var4,
         var5,
         var6,
         var7,
         var8
      );
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Object var0,
      @NotNull AABB var1,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3,
      float var4,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var5,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var6,
      float var7,
      boolean var8,
      float var9
   ) {
      Object var20 = null; // PX-FIX
      short var10001 = 27240;
      short var10002 = -14219;
      Intrinsics.checkNotNullParameter(var0, "key");
      var10001 = 27248;
      var10002 = 2956;
      Intrinsics.checkNotNullParameter(var1, "box");
      Object var10 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      synchronized (var10) {
         boolean var11 = false;
         Map var12 = (Map)lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;

         IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000;
         int var10003;
         label38: {
            try {
               if (var2 != null) {
                  var10003 = var2.h();
               } else {
                  var10003 = 0;
               }
               var10000 = new IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                  
                  (AABB)var20, var10003, var3 != null ? var3.h() : 0, var4, var5 != null ? var5.h() : 0, var6 != null ? var6.h() : 0, var7, var8, var9); // PX-FIX
               var20 = var1;
            } catch (NoWhenBranchMatchedException var14) {
               throw (RuntimeException)a(var14);
            }
         }

         IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var13 = var10000;
         var12.put(var0, var13);
         Unit var16 = Unit.INSTANCE;
      }
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Object var0,
      @NotNull BlockPos var1,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3,
      float var4,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var5,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var6,
      float var7,
      boolean var8,
      float var9
   ) {
      short var10001 = 27240;
      short var10002 = -14219;
      Intrinsics.checkNotNullParameter(var0, "key");
      var10001 = 27242;
      var10002 = 5919;
      Intrinsics.checkNotNullParameter(var1, "pos");
      a(
         var0,
         new AABB(var1.getX(), var1.getY(), var1.getZ(), var1.getX() + 1.0, var1.getY() + 1.0, var1.getZ() + 1.0),
         var2,
         var3,
         var4,
         var5,
         var6,
         var7,
         var8,
         var9
      );
   }

   // $VF: Extended synchronized range to monitorexit
   @JvmStatic
   public static void a(
      @NotNull AABB var0,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2,
      float var3,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var4,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var5,
      float var6,
      boolean var7,
      float var8,
      int var9,
      Object varX
   ) { // SYNB1-defaultarg
      if ((var9 & 2) != 0) { var1 = null; }
      if ((var9 & 4) != 0) { var2 = null; }
      if ((var9 & 8) != 0) { var3 = 1.5F; }
      if ((var9 & 16) != 0) { var4 = null; }
      if ((var9 & 32) != 0) { var5 = null; }
      if ((var9 & 64) != 0) { var6 = 18.0F; }
      if ((var9 & 128) != 0) { var7 = true; }
      if ((var9 & 256) != 0) { var8 = 1.5F; }
      a(var0, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public static void a(
      @NotNull BlockPos var0,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2,
      float var3,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var4,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var5,
      float var6,
      boolean var7,
      float var8,
      int var9,
      Object varX
   ) { // SYNB1-defaultarg
      if ((var9 & 2) != 0) { var1 = null; }
      if ((var9 & 4) != 0) { var2 = null; }
      if ((var9 & 8) != 0) { var3 = 1.5F; }
      if ((var9 & 16) != 0) { var4 = null; }
      if ((var9 & 32) != 0) { var5 = null; }
      if ((var9 & 64) != 0) { var6 = 18.0F; }
      if ((var9 & 128) != 0) { var7 = true; }
      if ((var9 & 256) != 0) { var8 = 1.5F; }
      a(var0, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public static void a(
      @NotNull Object var0,
      @NotNull AABB var1,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3,
      float var4,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var5,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var6,
      float var7,
      boolean var8,
      float var9,
      int var10,
      Object varX
   ) { // SYNB1-defaultarg
      if ((var10 & 4) != 0) { var2 = null; }
      if ((var10 & 8) != 0) { var3 = null; }
      if ((var10 & 16) != 0) { var4 = 1.5F; }
      if ((var10 & 32) != 0) { var5 = null; }
      if ((var10 & 64) != 0) { var6 = null; }
      if ((var10 & 128) != 0) { var7 = 18.0F; }
      if ((var10 & 256) != 0) { var8 = true; }
      if ((var10 & 512) != 0) { var9 = 1.5F; }
      a(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public static void a(
      @NotNull Object var0,
      @NotNull BlockPos var1,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3,
      float var4,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var5,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var6,
      float var7,
      boolean var8,
      float var9,
      int var10,
      Object varX
   ) { // SYNB1-defaultarg
      if ((var10 & 4) != 0) { var2 = null; }
      if ((var10 & 8) != 0) { var3 = null; }
      if ((var10 & 16) != 0) { var4 = 1.5F; }
      if ((var10 & 32) != 0) { var5 = null; }
      if ((var10 & 64) != 0) { var6 = null; }
      if ((var10 & 128) != 0) { var7 = 18.0F; }
      if ((var10 & 256) != 0) { var8 = true; }
      if ((var10 & 512) != 0) { var9 = 1.5F; }
      a(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public static final void a(@NotNull Object var0) {
      short var10001 = 27240;
      short var10002 = -14219;
      Intrinsics.checkNotNullParameter(var0, "key");
      Object var1 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      synchronized (var1) {
         boolean var2 = false;
         IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var5 = (IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.remove(
            var0
         );
      }
   }

   // $VF: Extended synchronized range to monitorexit
   @JvmStatic
   public static final void a() {
      Object var0 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      synchronized (var0) {
         boolean var1 = false;
         lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.clear();
         Unit var4 = Unit.INSTANCE;
      }
   }

   // $VF: Extended synchronized range to monitorexit
   @JvmStatic
   public static final void b() {
      Object var0 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      synchronized (var0) {
         boolean var1 = false;
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.clear();
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.clear();
         lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clear();
         IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.clear();
         llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.clear();
         IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.clear();
         IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.clear();
         lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.clear();
         IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.clear();
         lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.clear();
         Unit var4 = Unit.INSTANCE;
      }
   }

   @SubscribeEvent
   public final void a(@NotNull IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      short var10001 = 27237;
      short var10002 = -16927;
      Intrinsics.checkNotNullParameter(var1, "event");
      b();
   }

   @SubscribeEvent(
      priority = EventPriority.NORMAL
   )
   public final void a(@NotNull IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()Z
      // 003: aload 1
      // 004: sipush 27250
      // 007: sipush 4132
      // 00a: pop2
      // 00b: ldc "event"
      // 00d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 010: istore 2
      // 011: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 014: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 017: ifnull 02a
      // 01a: getstatic me/octo/client/IIllIIIIIlIIIllIIllIIIlIIIIIllIIIIIIlllllIIllIIIlllIllIIlIIlIIlllIIIllIlIlllllIIIIlII.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Lme/octo/client/IIllIIIIIlIIIllIIllIIIlIIIIIllIIIIIIlllllIIllIIIlllIllIIlIIlIIlllIIIllIlIlllllIIIIlII;
      // 01d: invokevirtual me/octo/client/IIllIIIIIlIIIllIIllIIIlIIIIIllIIIIIIlllllIIllIIIlllIllIIlIIlIIlllIIIllIlIlllllIIIIlII.aA ()Z
      // 020: ifeq 02f
      // 023: goto 02a
      // 026: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 029: athrow
      // 02a: return
      // 02b: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 02e: athrow
      // 02f: new kotlin/jvm/internal/Ref$ObjectRef
      // 032: dup
      // 033: invokespecial kotlin/jvm/internal/Ref$ObjectRef.<init> ()V
      // 036: astore 3
      // 037: aconst_null
      // 038: astore 4
      // 03a: new kotlin/jvm/internal/Ref$ObjectRef
      // 03d: dup
      // 03e: invokespecial kotlin/jvm/internal/Ref$ObjectRef.<init> ()V
      // 041: astore 5
      // 043: aconst_null
      // 044: astore 6
      // 046: aconst_null
      // 047: astore 7
      // 049: new kotlin/jvm/internal/Ref$ObjectRef
      // 04c: dup
      // 04d: invokespecial kotlin/jvm/internal/Ref$ObjectRef.<init> ()V
      // 050: astore 8
      // 052: aconst_null
      // 053: astore 9
      // 055: aconst_null
      // 056: astore 10
      // 058: aconst_null
      // 059: astore 11
      // 05b: bipush 0
      // 05c: istore 12
      // 05e: getstatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Ljava/lang/Object;
      // 061: astore 14
      // 063: aload 14
      // 065: monitorenter
      // 066: nop
      // 067: bipush 0
      // 068: istore 15
      // 06a: getstatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
      // 06d: invokevirtual it/unimi/dsi/fastutil/objects/ObjectArrayList.size ()I
      // 070: istore 16
      // 072: getstatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lit/unimi/dsi/fastutil/objects/Object2ObjectOpenHashMap;
      // 075: invokevirtual it/unimi/dsi/fastutil/objects/Object2ObjectOpenHashMap.size ()I
      // 078: istore 17
      // 07a: iload 16
      // 07c: iload 17
      // 07e: iadd
      // 07f: istore 12
      // 081: iload 12
      // 083: iload 2
      // 084: ifne 0a0
      // 087: ifne 095
      // 08a: goto 091
      // 08d: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 090: athrow
      // 091: aload 14
      // 093: monitorexit
      // 094: return
      // 095: aload 3
      // 096: iload 12
      // 098: anewarray 83
      // 09b: putfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
      // 09e: iload 12
      // 0a0: newarray 10
      // 0a2: astore 4
      // 0a4: aload 5
      // 0a6: iload 12
      // 0a8: newarray 10
      // 0aa: putfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
      // 0ad: iload 12
      // 0af: newarray 6
      // 0b1: astore 6
      // 0b3: iload 12
      // 0b5: newarray 10
      // 0b7: astore 7
      // 0b9: aload 8
      // 0bb: iload 12
      // 0bd: newarray 10
      // 0bf: putfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
      // 0c2: iload 12
      // 0c4: newarray 6
      // 0c6: astore 9
      // 0c8: iload 12
      // 0ca: newarray 4
      // 0cc: astore 10
      // 0ce: iload 12
      // 0d0: newarray 6
      // 0d2: astore 11
      // 0d4: bipush 0
      // 0d5: istore 18
      // 0d7: iload 18
      // 0d9: iload 16
      // 0db: if_icmpge 176
      // 0de: aload 3
      // 0df: getfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
      // 0e2: checkcast [Lnet/minecraft/world/phys/AABB;
      // 0e5: iload 18
      // 0e7: getstatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
      // 0ea: iload 18
      // 0ec: invokevirtual it/unimi/dsi/fastutil/objects/ObjectArrayList.get (I)Ljava/lang/Object;
      // 0ef: aastore
      // 0f0: aload 4
      // 0f2: iload 18
      // 0f4: getstatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lit/unimi/dsi/fastutil/ints/IntArrayList;
      // 0f7: iload 18
      // 0f9: invokevirtual it/unimi/dsi/fastutil/ints/IntArrayList.getInt (I)I
      // 0fc: iastore
      // 0fd: aload 5
      // 0ff: getfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
      // 102: checkcast [I
      // 105: iload 18
      // 107: getstatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lit/unimi/dsi/fastutil/ints/IntArrayList;
      // 10a: iload 18
      // 10c: invokevirtual it/unimi/dsi/fastutil/ints/IntArrayList.getInt (I)I
      // 10f: iastore
      // 110: aload 6
      // 112: iload 18
      // 114: getstatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lit/unimi/dsi/fastutil/floats/FloatArrayList;
      // 117: iload 18
      // 119: invokevirtual it/unimi/dsi/fastutil/floats/FloatArrayList.getFloat (I)F
      // 11c: fastore
      // 11d: aload 7
      // 11f: iload 18
      // 121: getstatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lit/unimi/dsi/fastutil/ints/IntArrayList;
      // 124: iload 18
      // 126: invokevirtual it/unimi/dsi/fastutil/ints/IntArrayList.getInt (I)I
      // 129: iastore
      // 12a: aload 8
      // 12c: getfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
      // 12f: checkcast [I
      // 132: iload 18
      // 134: getstatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lit/unimi/dsi/fastutil/ints/IntArrayList;
      // 137: iload 18
      // 139: invokevirtual it/unimi/dsi/fastutil/ints/IntArrayList.getInt (I)I
      // 13c: iastore
      // 13d: aload 9
      // 13f: iload 18
      // 141: getstatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lit/unimi/dsi/fastutil/floats/FloatArrayList;
      // 144: iload 18
      // 146: invokevirtual it/unimi/dsi/fastutil/floats/FloatArrayList.getFloat (I)F
      // 149: fastore
      // 14a: aload 10
      // 14c: iload 18
      // 14e: getstatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Lit/unimi/dsi/fastutil/booleans/BooleanArrayList;
      // 151: iload 18
      // 153: invokevirtual it/unimi/dsi/fastutil/booleans/BooleanArrayList.getBoolean (I)Z
      // 156: bastore
      // 157: aload 11
      // 159: iload 18
      // 15b: getstatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lit/unimi/dsi/fastutil/floats/FloatArrayList;
      // 15e: iload 18
      // 160: invokevirtual it/unimi/dsi/fastutil/floats/FloatArrayList.getFloat (I)F
      // 163: fastore
      // 164: iinc 18 1
      // 167: iload 2
      // 168: ifne 17a
      // 16b: iload 2
      // 16c: ifeq 0d7
      // 16f: goto 176
      // 172: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 175: athrow
      // 176: iload 16
      // 178: istore 18
      // 17a: getstatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lit/unimi/dsi/fastutil/objects/Object2ObjectOpenHashMap;
      // 17d: invokevirtual it/unimi/dsi/fastutil/objects/Object2ObjectOpenHashMap.values ()Ljava/util/Collection;
      // 180: checkcast it/unimi/dsi/fastutil/objects/ObjectCollection
      // 183: invokeinterface it/unimi/dsi/fastutil/objects/ObjectCollection.iterator ()Lit/unimi/dsi/fastutil/objects/ObjectIterator; 1
      // 188: dup
      // 189: sipush 27232
      // 18c: sipush -13964
      // 18f: pop2
      // 190: ldc_w "iterator(...)"
      // 193: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 196: astore 19
      // 198: aload 19
      // 19a: invokeinterface it/unimi/dsi/fastutil/objects/ObjectIterator.hasNext ()Z 1
      // 19f: ifeq 22e
      // 1a2: aload 19
      // 1a4: invokeinterface it/unimi/dsi/fastutil/objects/ObjectIterator.next ()Ljava/lang/Object; 1
      // 1a9: checkcast me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 1ac: astore 20
      // 1ae: aload 3
      // 1af: getfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
      // 1b2: checkcast [Lnet/minecraft/world/phys/AABB;
      // 1b5: iload 18
      // 1b7: aload 20
      // 1b9: invokevirtual me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Lnet/minecraft/world/phys/AABB;
      // 1bc: aastore
      // 1bd: aload 4
      // 1bf: iload 18
      // 1c1: aload 20
      // 1c3: invokevirtual me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()I
      // 1c6: iastore
      // 1c7: aload 5
      // 1c9: getfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
      // 1cc: checkcast [I
      // 1cf: iload 18
      // 1d1: aload 20
      // 1d3: invokevirtual me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()I
      // 1d6: iastore
      // 1d7: aload 6
      // 1d9: iload 18
      // 1db: aload 20
      // 1dd: invokevirtual me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d ()F
      // 1e0: fastore
      // 1e1: aload 7
      // 1e3: iload 18
      // 1e5: aload 20
      // 1e7: invokevirtual me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()I
      // 1ea: iastore
      // 1eb: aload 8
      // 1ed: getfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
      // 1f0: checkcast [I
      // 1f3: iload 18
      // 1f5: aload 20
      // 1f7: invokevirtual me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.f ()I
      // 1fa: iastore
      // 1fb: aload 9
      // 1fd: iload 18
      // 1ff: aload 20
      // 201: invokevirtual me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.g ()F
      // 204: fastore
      // 205: aload 10
      // 207: iload 18
      // 209: aload 20
      // 20b: invokevirtual me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h ()Z
      // 20e: bastore
      // 20f: aload 11
      // 211: iload 18
      // 213: aload 20
      // 215: invokevirtual me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.i ()F
      // 218: fastore
      // 219: iload 18
      // 21b: iinc 18 1
      // 21e: pop
      // 21f: iload 2
      // 220: ifne 235
      // 223: iload 2
      // 224: ifeq 198
      // 227: goto 22e
      // 22a: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 22d: athrow
      // 22e: getstatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll;
      // 231: invokespecial me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.c ()V
      // 234: nop
      // 235: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 238: astore 15
      // 23a: aload 14
      // 23c: monitorexit
      // 23d: aload 15
      // 23f: goto 24a
      // 242: astore 16
      // 244: aload 14
      // 246: monitorexit
      // 247: aload 16
      // 249: athrow
      // 24a: pop
      // 24b: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 24e: getfield net/minecraft/client/Minecraft.gameRenderer Lnet/minecraft/client/renderer/GameRenderer;
      // 251: invokevirtual net/minecraft/client/renderer/GameRenderer.getMainCamera ()Lnet/minecraft/client/Camera;
      // 254: invokevirtual net/minecraft/client/Camera.position ()Lnet/minecraft/world/phys/Vec3;
      // 257: dup
      // 258: sipush 27236
      // 25b: sipush 31175
      // 25e: pop2
      // 25f: ldc_w "position(...)"
      // 262: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 265: astore 13
      // 267: ldc2_w 16384.0
      // 26a: dstore 14
      // 26c: iload 12
      // 26e: newarray 10
      // 270: astore 16
      // 272: new kotlin/jvm/internal/Ref$IntRef
      // 275: dup
      // 276: invokespecial kotlin/jvm/internal/Ref$IntRef.<init> ()V
      // 279: astore 17
      // 27b: bipush 0
      // 27c: istore 18
      // 27e: iload 18
      // 280: iload 12
      // 282: if_icmpge 348
      // 285: iload 2
      // 286: ifne 35f
      // 289: aload 3
      // 28a: getfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
      // 28d: checkcast [Lnet/minecraft/world/phys/AABB;
      // 290: iload 18
      // 292: aaload
      // 293: dup
      // 294: ifnonnull 2a6
      // 297: goto 29e
      // 29a: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 29d: athrow
      // 29e: pop
      // 29f: goto 341
      // 2a2: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2a5: athrow
      // 2a6: astore 19
      // 2a8: aload 19
      // 2aa: getfield net/minecraft/world/phys/AABB.minX D
      // 2ad: aload 19
      // 2af: getfield net/minecraft/world/phys/AABB.maxX D
      // 2b2: dadd
      // 2b3: ldc2_w 0.5
      // 2b6: dmul
      // 2b7: dstore 20
      // 2b9: aload 19
      // 2bb: getfield net/minecraft/world/phys/AABB.minY D
      // 2be: aload 19
      // 2c0: getfield net/minecraft/world/phys/AABB.maxY D
      // 2c3: dadd
      // 2c4: ldc2_w 0.5
      // 2c7: dmul
      // 2c8: dstore 22
      // 2ca: aload 19
      // 2cc: getfield net/minecraft/world/phys/AABB.minZ D
      // 2cf: aload 19
      // 2d1: getfield net/minecraft/world/phys/AABB.maxZ D
      // 2d4: dadd
      // 2d5: ldc2_w 0.5
      // 2d8: dmul
      // 2d9: dstore 24
      // 2db: dload 20
      // 2dd: aload 13
      // 2df: getfield net/minecraft/world/phys/Vec3.x D
      // 2e2: dsub
      // 2e3: dstore 26
      // 2e5: dload 22
      // 2e7: aload 13
      // 2e9: getfield net/minecraft/world/phys/Vec3.y D
      // 2ec: dsub
      // 2ed: dstore 28
      // 2ef: dload 24
      // 2f1: aload 13
      // 2f3: getfield net/minecraft/world/phys/Vec3.z D
      // 2f6: dsub
      // 2f7: dstore 30
      // 2f9: iload 2
      // 2fa: ifne 344
      // 2fd: dload 26
      // 2ff: dload 26
      // 301: dmul
      // 302: dload 28
      // 304: dload 28
      // 306: dmul
      // 307: dadd
      // 308: dload 30
      // 30a: dload 30
      // 30c: dmul
      // 30d: dadd
      // 30e: dload 14
      // 310: dcmpl
      // 311: ifgt 341
      // 314: goto 31b
      // 317: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 31a: athrow
      // 31b: aload 19
      // 31d: invokestatic me/octo/client/utils/llllIllllllIllllIlIlllllllIllIIlIlllIIIlllllllIlIIIlIIIlIIIIllIIllllIlIlIIIllIIlIIIlI.a (Lnet/minecraft/world/phys/AABB;)Z
      // 320: ifeq 341
      // 323: goto 32a
      // 326: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 329: athrow
      // 32a: aload 16
      // 32c: aload 17
      // 32e: getfield kotlin/jvm/internal/Ref$IntRef.element I
      // 331: istore 32
      // 333: aload 17
      // 335: iload 32
      // 337: bipush 1
      // 338: iadd
      // 339: putfield kotlin/jvm/internal/Ref$IntRef.element I
      // 33c: iload 32
      // 33e: iload 18
      // 340: iastore
      // 341: iinc 18 1
      // 344: iload 2
      // 345: ifeq 27e
      // 348: aload 17
      // 34a: getfield kotlin/jvm/internal/Ref$IntRef.element I
      // 34d: iload 2
      // 34e: ifne 364
      // 351: ifne 35c
      // 354: goto 35b
      // 357: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 35a: athrow
      // 35b: return
      // 35c: bipush 0
      // 35d: istore 18
      // 35f: aload 17
      // 361: getfield kotlin/jvm/internal/Ref$IntRef.element I
      // 364: istore 19
      // 366: iload 18
      // 368: iload 19
      // 36a: if_icmpge 3af
      // 36d: aload 16
      // 36f: iload 18
      // 371: iaload
      // 372: istore 20
      // 374: aload 4
      // 376: iload 20
      // 378: iaload
      // 379: istore 21
      // 37b: iload 2
      // 37c: ifne 3ab
      // 37f: iload 21
      // 381: bipush 24
      // 383: iushr
      // 384: ifeq 3a8
      // 387: goto 38e
      // 38a: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 38d: athrow
      // 38e: aload 3
      // 38f: getfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
      // 392: checkcast [Lnet/minecraft/world/phys/AABB;
      // 395: iload 20
      // 397: aaload
      // 398: dup
      // 399: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 39c: iload 21
      // 39e: invokestatic me/octo/client/IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII.a (Lnet/minecraft/world/phys/AABB;I)V
      // 3a1: goto 3a8
      // 3a4: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3a7: athrow
      // 3a8: iinc 18 1
      // 3ab: iload 2
      // 3ac: ifeq 366
      // 3af: fconst_0
      // 3b0: fstore 18
      // 3b2: bipush 0
      // 3b3: istore 19
      // 3b5: bipush 0
      // 3b6: istore 20
      // 3b8: aload 17
      // 3ba: getfield kotlin/jvm/internal/Ref$IntRef.element I
      // 3bd: istore 21
      // 3bf: iload 20
      // 3c1: iload 21
      // 3c3: if_icmpge 41b
      // 3c6: aload 16
      // 3c8: iload 20
      // 3ca: iaload
      // 3cb: istore 22
      // 3cd: iload 2
      // 3ce: ifne 417
      // 3d1: aload 5
      // 3d3: getfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
      // 3d6: checkcast [I
      // 3d9: iload 22
      // 3db: iaload
      // 3dc: bipush 24
      // 3de: iushr
      // 3df: iload 2
      // 3e0: ifne 41d
      // 3e3: goto 3ea
      // 3e6: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3e9: athrow
      // 3ea: ifeq 414
      // 3ed: goto 3f4
      // 3f0: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3f3: athrow
      // 3f4: bipush 1
      // 3f5: istore 19
      // 3f7: iload 2
      // 3f8: ifne 417
      // 3fb: aload 6
      // 3fd: iload 22
      // 3ff: faload
      // 400: fload 18
      // 402: fcmpl
      // 403: ifle 414
      // 406: goto 40d
      // 409: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 40c: athrow
      // 40d: aload 6
      // 40f: iload 22
      // 411: faload
      // 412: fstore 18
      // 414: iinc 20 1
      // 417: iload 2
      // 418: ifeq 3bf
      // 41b: iload 19
      // 41d: ifeq 43f
      // 420: fload 18
      // 422: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (F)V
      // 425: aload 1
      // 426: invokevirtual me/octo/client/events/impl/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.k ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 429: aload 17
      // 42b: aload 16
      // 42d: aload 5
      // 42f: aload 3
      // 430: invokedynamic invoke (Lkotlin/jvm/internal/Ref$IntRef;[ILkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/jvm/internal/Ref$IntRef;[ILkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;)Lkotlin/Unit;, (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;)Lkotlin/Unit; ]
      // 435: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Lcom/mojang/blaze3d/vertex/PoseStack;Lkotlin/jvm/functions/Function1;)V
      // 438: goto 43f
      // 43b: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 43e: athrow
      // 43f: fconst_0
      // 440: fstore 20
      // 442: fconst_0
      // 443: fstore 21
      // 445: bipush 0
      // 446: istore 22
      // 448: bipush 1
      // 449: istore 23
      // 44b: bipush 0
      // 44c: istore 24
      // 44e: aload 17
      // 450: getfield kotlin/jvm/internal/Ref$IntRef.element I
      // 453: istore 25
      // 455: iload 24
      // 457: iload 25
      // 459: if_icmpge 4e4
      // 45c: aload 16
      // 45e: iload 24
      // 460: iaload
      // 461: istore 26
      // 463: iload 2
      // 464: ifne 4e0
      // 467: aload 8
      // 469: getfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
      // 46c: checkcast [I
      // 46f: iload 26
      // 471: iaload
      // 472: bipush 24
      // 474: iushr
      // 475: iload 2
      // 476: ifne 4e6
      // 479: goto 480
      // 47c: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 47f: athrow
      // 480: ifeq 4dd
      // 483: goto 48a
      // 486: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 489: athrow
      // 48a: bipush 1
      // 48b: istore 22
      // 48d: aload 9
      // 48f: iload 26
      // 491: faload
      // 492: fload 20
      // 494: fcmpl
      // 495: iload 2
      // 496: ifne 4b2
      // 499: ifle 4aa
      // 49c: goto 4a3
      // 49f: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4a2: athrow
      // 4a3: aload 9
      // 4a5: iload 26
      // 4a7: faload
      // 4a8: fstore 20
      // 4aa: aload 11
      // 4ac: iload 26
      // 4ae: faload
      // 4af: fload 21
      // 4b1: fcmpl
      // 4b2: iload 2
      // 4b3: ifne 4cc
      // 4b6: ifle 4c7
      // 4b9: goto 4c0
      // 4bc: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4bf: athrow
      // 4c0: aload 11
      // 4c2: iload 26
      // 4c4: faload
      // 4c5: fstore 21
      // 4c7: aload 10
      // 4c9: iload 26
      // 4cb: baload
      // 4cc: iload 2
      // 4cd: ifne 4db
      // 4d0: ifne 4dd
      // 4d3: goto 4da
      // 4d6: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4d9: athrow
      // 4da: bipush 0
      // 4db: istore 23
      // 4dd: iinc 24 1
      // 4e0: iload 2
      // 4e1: ifeq 455
      // 4e4: iload 22
      // 4e6: iload 2
      // 4e7: ifne 546
      // 4ea: ifeq 53b
      // 4ed: goto 4f4
      // 4f0: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4f3: athrow
      // 4f4: fload 21
      // 4f6: iload 2
      // 4f7: ifne 516
      // 4fa: goto 501
      // 4fd: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 500: athrow
      // 501: fconst_0
      // 502: fcmpl
      // 503: ifle 519
      // 506: goto 50d
      // 509: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 50c: athrow
      // 50d: fload 21
      // 50f: goto 516
      // 512: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 515: athrow
      // 516: goto 51b
      // 519: ldc 1.5
      // 51b: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.c (F)V
      // 51e: fload 20
      // 520: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.b (F)V
      // 523: iload 23
      // 525: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Z)V
      // 528: aload 1
      // 529: invokevirtual me/octo/client/events/impl/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.k ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 52c: aload 17
      // 52e: aload 16
      // 530: aload 8
      // 532: aload 3
      // 533: invokedynamic invoke (Lkotlin/jvm/internal/Ref$IntRef;[ILkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.b (Lkotlin/jvm/internal/Ref$IntRef;[ILkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;)Lkotlin/Unit;, (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;)Lkotlin/Unit; ]
      // 538: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.b (Lcom/mojang/blaze3d/vertex/PoseStack;Lkotlin/jvm/functions/Function1;)V
      // 53b: bipush 0
      // 53c: istore 24
      // 53e: bipush 0
      // 53f: istore 25
      // 541: aload 17
      // 543: getfield kotlin/jvm/internal/Ref$IntRef.element I
      // 546: istore 26
      // 548: iload 25
      // 54a: iload 26
      // 54c: if_icmpge 588
      // 54f: aload 7
      // 551: aload 16
      // 553: iload 25
      // 555: iaload
      // 556: iaload
      // 557: bipush 24
      // 559: iushr
      // 55a: iload 2
      // 55b: ifne 58a
      // 55e: iload 2
      // 55f: ifne 574
      // 562: goto 569
      // 565: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 568: athrow
      // 569: ifeq 57a
      // 56c: goto 573
      // 56f: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 572: athrow
      // 573: bipush 1
      // 574: istore 24
      // 576: iload 2
      // 577: ifeq 588
      // 57a: iinc 25 1
      // 57d: iload 2
      // 57e: ifeq 548
      // 581: goto 588
      // 584: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 587: athrow
      // 588: iload 24
      // 58a: ifeq 960
      // 58d: aload 1
      // 58e: invokevirtual me/octo/client/events/impl/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.k ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 591: astore 25
      // 593: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 596: invokevirtual net/minecraft/client/Minecraft.getMainRenderTarget ()Lcom/mojang/blaze3d/pipeline/RenderTarget;
      // 599: dup
      // 59a: sipush 27239
      // 59d: sipush -9797
      // 5a0: pop2
      // 5a1: ldc_w "getMainRenderTarget(...)"
      // 5a4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 5a7: astore 26
      // 5a9: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 5ac: astore 27
      // 5ae: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 5b1: getfield net/minecraft/client/Minecraft.gameRenderer Lnet/minecraft/client/renderer/GameRenderer;
      // 5b4: invokevirtual net/minecraft/client/renderer/GameRenderer.getMainCamera ()Lnet/minecraft/client/Camera;
      // 5b7: dup
      // 5b8: sipush 27245
      // 5bb: sipush -2548
      // 5be: pop2
      // 5bf: ldc_w "getMainCamera(...)"
      // 5c2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 5c5: astore 28
      // 5c7: bipush 0
      // 5c8: istore 29
      // 5ca: sipush 2848
      // 5cd: invokestatic org/lwjgl/opengl/GL11C.glEnable (I)V
      // 5d0: getstatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 5d3: aload 26
      // 5d5: aload 25
      // 5d7: aload 28
      // 5d9: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b (Lcom/mojang/blaze3d/pipeline/RenderTarget;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/Camera;)Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;
      // 5dc: astore 30
      // 5de: nop
      // 5df: aload 27
      // 5e1: getstatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl [I
      // 5e4: swap
      // 5e5: invokevirtual me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.ordinal ()I
      // 5e8: iaload
      // 5e9: tableswitch 847 1 2 23 435
      // 600: aload 30
      // 602: astore 31
      // 604: bipush 0
      // 605: istore 32
      // 607: aload 31
      // 609: astore 33
      // 60b: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 60e: astore 34
      // 610: bipush 0
      // 611: istore 35
      // 613: aload 33
      // 615: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.d ()Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 618: astore 36
      // 61a: aload 33
      // 61c: aload 34
      // 61e: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 621: nop
      // 622: aload 33
      // 624: astore 37
      // 626: bipush 0
      // 627: istore 38
      // 629: aload 37
      // 62b: astore 39
      // 62d: bipush 0
      // 62e: istore 40
      // 630: aload 39
      // 632: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.b ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 635: astore 41
      // 637: bipush 0
      // 638: istore 42
      // 63a: aload 41
      // 63c: invokevirtual com/mojang/blaze3d/vertex/PoseStack.pushPose ()V
      // 63f: nop
      // 640: aload 41
      // 642: astore 43
      // 644: bipush 0
      // 645: istore 44
      // 647: aload 39
      // 649: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.c ()Lnet/minecraft/client/Camera;
      // 64c: invokevirtual net/minecraft/client/Camera.position ()Lnet/minecraft/world/phys/Vec3;
      // 64f: dup
      // 650: sipush 27234
      // 653: sipush 14283
      // 656: pop2
      // 657: ldc_w "position(...)"
      // 65a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 65d: astore 45
      // 65f: aload 43
      // 661: aload 45
      // 663: getfield net/minecraft/world/phys/Vec3.x D
      // 666: dneg
      // 667: aload 45
      // 669: getfield net/minecraft/world/phys/Vec3.y D
      // 66c: dneg
      // 66d: aload 45
      // 66f: getfield net/minecraft/world/phys/Vec3.z D
      // 672: dneg
      // 673: invokevirtual com/mojang/blaze3d/vertex/PoseStack.translate (DDD)V
      // 676: aload 39
      // 678: astore 46
      // 67a: bipush 0
      // 67b: istore 47
      // 67d: aload 46
      // 67f: astore 48
      // 681: getstatic me/octo/client/IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lcom/mojang/blaze3d/pipeline/RenderPipeline;
      // 684: astore 49
      // 686: invokestatic kotlin/collections/MapsKt.emptyMap ()Ljava/util/Map;
      // 689: astore 50
      // 68b: invokestatic kotlin/collections/MapsKt.emptyMap ()Ljava/util/Map;
      // 68e: astore 51
      // 690: bipush 0
      // 691: istore 52
      // 693: aload 48
      // 695: aload 49
      // 697: aload 50
      // 699: aload 51
      // 69b: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lcom/mojang/blaze3d/pipeline/RenderPipeline;Ljava/util/Map;Ljava/util/Map;)Lcom/mojang/blaze3d/vertex/VertexConsumer;
      // 69e: astore 53
      // 6a0: nop
      // 6a1: aload 53
      // 6a3: aload 48
      // 6a5: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.b ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 6a8: invokevirtual com/mojang/blaze3d/vertex/PoseStack.last ()Lcom/mojang/blaze3d/vertex/PoseStack$Pose;
      // 6ab: dup
      // 6ac: sipush 27249
      // 6af: sipush -12417
      // 6b2: pop2
      // 6b3: ldc_w "last(...)"
      // 6b6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 6b9: astore 54
      // 6bb: astore 55
      // 6bd: bipush 0
      // 6be: istore 56
      // 6c0: aload 54
      // 6c2: invokevirtual com/mojang/blaze3d/vertex/PoseStack$Pose.pose ()Lorg/joml/Matrix4f;
      // 6c5: dup
      // 6c6: sipush 27235
      // 6c9: sipush 32144
      // 6cc: pop2
      // 6cd: ldc_w "pose(...)"
      // 6d0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 6d3: astore 57
      // 6d5: bipush 0
      // 6d6: istore 58
      // 6d8: aload 17
      // 6da: getfield kotlin/jvm/internal/Ref$IntRef.element I
      // 6dd: istore 59
      // 6df: iload 58
      // 6e1: iload 59
      // 6e3: if_icmpge 745
      // 6e6: aload 16
      // 6e8: iload 58
      // 6ea: iaload
      // 6eb: istore 60
      // 6ed: aload 7
      // 6ef: iload 60
      // 6f1: iaload
      // 6f2: istore 61
      // 6f4: iload 2
      // 6f5: ifne 741
      // 6f8: iload 61
      // 6fa: bipush 24
      // 6fc: iushr
      // 6fd: iload 2
      // 6fe: ifne 949
      // 701: goto 708
      // 704: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 707: athrow
      // 708: ifeq 73e
      // 70b: goto 712
      // 70e: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 711: athrow
      // 712: aload 55
      // 714: aload 57
      // 716: checkcast org/joml/Matrix4fc
      // 719: aload 3
      // 71a: getfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
      // 71d: checkcast [Lnet/minecraft/world/phys/AABB;
      // 720: iload 60
      // 722: aaload
      // 723: dup
      // 724: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 727: new me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll
      // 72a: dup
      // 72b: iload 61
      // 72d: invokespecial me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.<init> (I)V
      // 730: bipush 0
      // 731: bipush 8
      // 733: aconst_null
      // 734: invokestatic me/octo/client/lIllIlIIIIIIIIlllIIIIlIIIlIlIlIlIlIIIlIIlIIlllIllIIIIlllIIlIIIIlIlllIIIlIIllllIlllllI.b (Lcom/mojang/blaze3d/vertex/VertexConsumer;Lorg/joml/Matrix4fc;Lnet/minecraft/world/phys/AABB;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;IILjava/lang/Object;)V
      // 737: goto 73e
      // 73a: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 73d: athrow
      // 73e: iinc 58 1
      // 741: iload 2
      // 742: ifeq 6df
      // 745: nop
      // 746: nop
      // 747: aload 48
      // 749: aload 53
      // 74b: bipush 0
      // 74c: bipush 2
      // 74d: aconst_null
      // 74e: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lcom/mojang/blaze3d/vertex/VertexConsumer;ZILjava/lang/Object;)V
      // 751: goto 763
      // 754: astore 62
      // 756: aload 48
      // 758: aload 53
      // 75a: bipush 0
      // 75b: bipush 2
      // 75c: aconst_null
      // 75d: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lcom/mojang/blaze3d/vertex/VertexConsumer;ZILjava/lang/Object;)V
      // 760: aload 62
      // 762: athrow
      // 763: nop
      // 764: nop
      // 765: nop
      // 766: nop
      // 767: nop
      // 768: aload 41
      // 76a: invokevirtual com/mojang/blaze3d/vertex/PoseStack.popPose ()V
      // 76d: goto 77a
      // 770: astore 63
      // 772: aload 41
      // 774: invokevirtual com/mojang/blaze3d/vertex/PoseStack.popPose ()V
      // 777: aload 63
      // 779: athrow
      // 77a: nop
      // 77b: nop
      // 77c: nop
      // 77d: nop
      // 77e: aload 33
      // 780: aload 36
      // 782: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 785: goto 794
      // 788: astore 64
      // 78a: aload 33
      // 78c: aload 36
      // 78e: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 791: aload 64
      // 793: athrow
      // 794: nop
      // 795: nop
      // 796: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 799: goto 940
      // 79c: aload 30
      // 79e: astore 31
      // 7a0: bipush 0
      // 7a1: istore 32
      // 7a3: aload 31
      // 7a5: astore 33
      // 7a7: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 7aa: astore 34
      // 7ac: bipush 0
      // 7ad: istore 35
      // 7af: aload 33
      // 7b1: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.d ()Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 7b4: astore 36
      // 7b6: aload 33
      // 7b8: aload 34
      // 7ba: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 7bd: nop
      // 7be: aload 33
      // 7c0: astore 37
      // 7c2: bipush 0
      // 7c3: istore 38
      // 7c5: aload 37
      // 7c7: astore 39
      // 7c9: bipush 0
      // 7ca: istore 40
      // 7cc: aload 39
      // 7ce: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.b ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 7d1: astore 41
      // 7d3: bipush 0
      // 7d4: istore 42
      // 7d6: aload 41
      // 7d8: invokevirtual com/mojang/blaze3d/vertex/PoseStack.pushPose ()V
      // 7db: nop
      // 7dc: aload 41
      // 7de: astore 43
      // 7e0: bipush 0
      // 7e1: istore 44
      // 7e3: aload 39
      // 7e5: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.c ()Lnet/minecraft/client/Camera;
      // 7e8: invokevirtual net/minecraft/client/Camera.position ()Lnet/minecraft/world/phys/Vec3;
      // 7eb: dup
      // 7ec: sipush 27234
      // 7ef: sipush 14283
      // 7f2: pop2
      // 7f3: ldc_w "position(...)"
      // 7f6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 7f9: astore 45
      // 7fb: aload 43
      // 7fd: aload 45
      // 7ff: getfield net/minecraft/world/phys/Vec3.x D
      // 802: dneg
      // 803: aload 45
      // 805: getfield net/minecraft/world/phys/Vec3.y D
      // 808: dneg
      // 809: aload 45
      // 80b: getfield net/minecraft/world/phys/Vec3.z D
      // 80e: dneg
      // 80f: invokevirtual com/mojang/blaze3d/vertex/PoseStack.translate (DDD)V
      // 812: aload 39
      // 814: astore 46
      // 816: bipush 0
      // 817: istore 47
      // 819: aload 46
      // 81b: astore 48
      // 81d: getstatic me/octo/client/IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lcom/mojang/blaze3d/pipeline/RenderPipeline;
      // 820: astore 49
      // 822: invokestatic kotlin/collections/MapsKt.emptyMap ()Ljava/util/Map;
      // 825: astore 50
      // 827: invokestatic kotlin/collections/MapsKt.emptyMap ()Ljava/util/Map;
      // 82a: astore 51
      // 82c: bipush 0
      // 82d: istore 52
      // 82f: aload 48
      // 831: aload 49
      // 833: aload 50
      // 835: aload 51
      // 837: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lcom/mojang/blaze3d/pipeline/RenderPipeline;Ljava/util/Map;Ljava/util/Map;)Lcom/mojang/blaze3d/vertex/VertexConsumer;
      // 83a: astore 53
      // 83c: nop
      // 83d: aload 53
      // 83f: aload 48
      // 841: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.b ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 844: invokevirtual com/mojang/blaze3d/vertex/PoseStack.last ()Lcom/mojang/blaze3d/vertex/PoseStack$Pose;
      // 847: dup
      // 848: sipush 27247
      // 84b: sipush 190
      // 84e: pop2
      // 84f: ldc_w "last(...)"
      // 852: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 855: astore 54
      // 857: astore 55
      // 859: bipush 0
      // 85a: istore 56
      // 85c: aload 54
      // 85e: invokevirtual com/mojang/blaze3d/vertex/PoseStack$Pose.pose ()Lorg/joml/Matrix4f;
      // 861: dup
      // 862: sipush 27246
      // 865: sipush -17794
      // 868: pop2
      // 869: ldc_w "pose(...)"
      // 86c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 86f: astore 57
      // 871: bipush 0
      // 872: istore 58
      // 874: aload 17
      // 876: getfield kotlin/jvm/internal/Ref$IntRef.element I
      // 879: istore 59
      // 87b: iload 58
      // 87d: iload 59
      // 87f: if_icmpge 8e1
      // 882: aload 16
      // 884: iload 58
      // 886: iaload
      // 887: istore 60
      // 889: aload 7
      // 88b: iload 60
      // 88d: iaload
      // 88e: istore 61
      // 890: iload 2
      // 891: ifne 8dd
      // 894: iload 61
      // 896: bipush 24
      // 898: iushr
      // 899: iload 2
      // 89a: ifne 949
      // 89d: goto 8a4
      // 8a0: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 8a3: athrow
      // 8a4: ifeq 8da
      // 8a7: goto 8ae
      // 8aa: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 8ad: athrow
      // 8ae: aload 55
      // 8b0: aload 57
      // 8b2: checkcast org/joml/Matrix4fc
      // 8b5: aload 3
      // 8b6: getfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
      // 8b9: checkcast [Lnet/minecraft/world/phys/AABB;
      // 8bc: iload 60
      // 8be: aaload
      // 8bf: dup
      // 8c0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 8c3: new me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll
      // 8c6: dup
      // 8c7: iload 61
      // 8c9: invokespecial me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.<init> (I)V
      // 8cc: bipush 0
      // 8cd: bipush 8
      // 8cf: aconst_null
      // 8d0: invokestatic me/octo/client/lIllIlIIIIIIIIlllIIIIlIIIlIlIlIlIlIIIlIIlIIlllIllIIIIlllIIlIIIIlIlllIIIlIIllllIlllllI.b (Lcom/mojang/blaze3d/vertex/VertexConsumer;Lorg/joml/Matrix4fc;Lnet/minecraft/world/phys/AABB;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;IILjava/lang/Object;)V
      // 8d3: goto 8da
      // 8d6: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 8d9: athrow
      // 8da: iinc 58 1
      // 8dd: iload 2
      // 8de: ifeq 87b
      // 8e1: nop
      // 8e2: nop
      // 8e3: aload 48
      // 8e5: aload 53
      // 8e7: bipush 0
      // 8e8: bipush 2
      // 8e9: aconst_null
      // 8ea: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lcom/mojang/blaze3d/vertex/VertexConsumer;ZILjava/lang/Object;)V
      // 8ed: goto 8ff
      // 8f0: astore 62
      // 8f2: aload 48
      // 8f4: aload 53
      // 8f6: bipush 0
      // 8f7: bipush 2
      // 8f8: aconst_null
      // 8f9: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lcom/mojang/blaze3d/vertex/VertexConsumer;ZILjava/lang/Object;)V
      // 8fc: aload 62
      // 8fe: athrow
      // 8ff: nop
      // 900: nop
      // 901: nop
      // 902: nop
      // 903: nop
      // 904: aload 41
      // 906: invokevirtual com/mojang/blaze3d/vertex/PoseStack.popPose ()V
      // 909: goto 916
      // 90c: astore 63
      // 90e: aload 41
      // 910: invokevirtual com/mojang/blaze3d/vertex/PoseStack.popPose ()V
      // 913: aload 63
      // 915: athrow
      // 916: nop
      // 917: nop
      // 918: nop
      // 919: nop
      // 91a: aload 33
      // 91c: aload 36
      // 91e: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 921: goto 930
      // 924: astore 64
      // 926: aload 33
      // 928: aload 36
      // 92a: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 92d: aload 64
      // 92f: athrow
      // 930: nop
      // 931: nop
      // 932: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 935: goto 940
      // 938: new kotlin/NoWhenBranchMatchedException
      // 93b: dup
      // 93c: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
      // 93f: athrow
      // 940: pop
      // 941: aload 30
      // 943: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.f ()V
      // 946: sipush 2848
      // 949: invokestatic org/lwjgl/opengl/GL11C.glDisable (I)V
      // 94c: goto 95f
      // 94f: astore 65
      // 951: aload 30
      // 953: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.f ()V
      // 956: sipush 2848
      // 959: invokestatic org/lwjgl/opengl/GL11C.glDisable (I)V
      // 95c: aload 65
      // 95e: athrow
      // 95f: nop
      // 960: return
   }

   private final void c() {
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.clear();
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.clear();
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clear();
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.clear();
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.clear();
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.clear();
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.clear();
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.clear();
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull AABB var0,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2,
      float var3,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var4,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var5,
      float var6,
      boolean var7
   ) {
      short var10001 = 27248;
      short var10002 = 2956;
      Intrinsics.checkNotNullParameter(var0, "box");
      a(var0, var1, var2, var3, var4, var5, var6, var7, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull AABB var0,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2,
      float var3,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var4,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var5,
      float var6
   ) {
      short var10001 = 27248;
      short var10002 = 2956;
      Intrinsics.checkNotNullParameter(var0, "box");
      a(var0, var1, var2, var3, var4, var5, var6, false, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull AABB var0,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2,
      float var3,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var4,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var5
   ) {
      short var10001 = 27248;
      short var10002 = 2956;
      Intrinsics.checkNotNullParameter(var0, "box");
      a(var0, var1, var2, var3, var4, var5, 0.0F, false, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull AABB var0,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2,
      float var3,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var4
   ) {
      short var10001 = 27248;
      short var10002 = 2956;
      Intrinsics.checkNotNullParameter(var0, "box");
      a(var0, var1, var2, var3, var4, null, 0.0F, false, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull AABB var0,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2,
      float var3
   ) {
      short var10001 = 27248;
      short var10002 = 2956;
      Intrinsics.checkNotNullParameter(var0, "box");
      a(var0, var1, var2, var3, null, null, 0.0F, false, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull AABB var0,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2
   ) {
      short var10001 = 27248;
      short var10002 = 2956;
      Intrinsics.checkNotNullParameter(var0, "box");
      a(var0, var1, var2, 0.0F, null, null, 0.0F, false, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(@NotNull AABB var0, @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1) {
      short var10001 = 27241;
      short var10002 = 851;
      Intrinsics.checkNotNullParameter(var0, "box");
      a(var0, var1, null, 0.0F, null, null, 0.0F, false, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(@NotNull AABB var0) {
      short var10001 = 27248;
      short var10002 = 2956;
      Intrinsics.checkNotNullParameter(var0, "box");
      a(var0, null, null, 0.0F, null, null, 0.0F, false, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull BlockPos var0,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2,
      float var3,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var4,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var5,
      float var6,
      boolean var7
   ) {
      short var10001 = 27242;
      short var10002 = 5919;
      Intrinsics.checkNotNullParameter(var0, "pos");
      a(var0, var1, var2, var3, var4, var5, var6, var7, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull BlockPos var0,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2,
      float var3,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var4,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var5,
      float var6
   ) {
      short var10001 = 27242;
      short var10002 = 5919;
      Intrinsics.checkNotNullParameter(var0, "pos");
      a(var0, var1, var2, var3, var4, var5, var6, false, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull BlockPos var0,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2,
      float var3,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var4,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var5
   ) {
      short var10001 = 27242;
      short var10002 = 5919;
      Intrinsics.checkNotNullParameter(var0, "pos");
      a(var0, var1, var2, var3, var4, var5, 0.0F, false, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull BlockPos var0,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2,
      float var3,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var4
   ) {
      short var10001 = 27244;
      short var10002 = -18756;
      Intrinsics.checkNotNullParameter(var0, "pos");
      a(var0, var1, var2, var3, var4, null, 0.0F, false, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull BlockPos var0,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2,
      float var3
   ) {
      short var10001 = 27242;
      short var10002 = 5919;
      Intrinsics.checkNotNullParameter(var0, "pos");
      a(var0, var1, var2, var3, null, null, 0.0F, false, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull BlockPos var0,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2
   ) {
      short var10001 = 27242;
      short var10002 = 5919;
      Intrinsics.checkNotNullParameter(var0, "pos");
      a(var0, var1, var2, 0.0F, null, null, 0.0F, false, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(@NotNull BlockPos var0, @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1) {
      short var10001 = 27242;
      short var10002 = 5919;
      Intrinsics.checkNotNullParameter(var0, "pos");
      a(var0, var1, null, 0.0F, null, null, 0.0F, false, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(@NotNull BlockPos var0) {
      short var10001 = 27242;
      short var10002 = 5919;
      Intrinsics.checkNotNullParameter(var0, "pos");
      a(var0, null, null, 0.0F, null, null, 0.0F, false, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Object var0,
      @NotNull AABB var1,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3,
      float var4,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var5,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var6,
      float var7,
      boolean var8
   ) {
      short var10001 = 27240;
      short var10002 = -14219;
      Intrinsics.checkNotNullParameter(var0, "key");
      var10001 = 27248;
      var10002 = 2956;
      Intrinsics.checkNotNullParameter(var1, "box");
      a(var0, var1, var2, var3, var4, var5, var6, var7, var8, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Object var0,
      @NotNull AABB var1,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3,
      float var4,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var5,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var6,
      float var7
   ) {
      short var10001 = 27240;
      short var10002 = -14219;
      Intrinsics.checkNotNullParameter(var0, "key");
      var10001 = 27248;
      var10002 = 2956;
      Intrinsics.checkNotNullParameter(var1, "box");
      a(var0, var1, var2, var3, var4, var5, var6, var7, false, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Object var0,
      @NotNull AABB var1,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3,
      float var4,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var5,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var6
   ) {
      short var10001 = 27240;
      short var10002 = -14219;
      Intrinsics.checkNotNullParameter(var0, "key");
      var10001 = 27248;
      var10002 = 2956;
      Intrinsics.checkNotNullParameter(var1, "box");
      a(var0, var1, var2, var3, var4, var5, var6, 0.0F, false, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Object var0,
      @NotNull AABB var1,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3,
      float var4,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var5
   ) {
      short var10001 = 27240;
      short var10002 = -14219;
      Intrinsics.checkNotNullParameter(var0, "key");
      var10001 = 27248;
      var10002 = 2956;
      Intrinsics.checkNotNullParameter(var1, "box");
      a(var0, var1, var2, var3, var4, var5, null, 0.0F, false, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Object var0,
      @NotNull AABB var1,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3,
      float var4
   ) {
      short var10001 = 27240;
      short var10002 = -14219;
      Intrinsics.checkNotNullParameter(var0, "key");
      var10001 = 27248;
      var10002 = 2956;
      Intrinsics.checkNotNullParameter(var1, "box");
      a(var0, var1, var2, var3, var4, null, null, 0.0F, false, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Object var0,
      @NotNull AABB var1,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3
   ) {
      short var10001 = 27240;
      short var10002 = -14219;
      Intrinsics.checkNotNullParameter(var0, "key");
      var10001 = 27248;
      var10002 = 2956;
      Intrinsics.checkNotNullParameter(var1, "box");
      a(var0, var1, var2, var3, 0.0F, null, null, 0.0F, false, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Object var0, @NotNull AABB var1, @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2
   ) {
      short var10001 = 27233;
      short var10002 = -28998;
      Intrinsics.checkNotNullParameter(var0, "key");
      var10001 = 27248;
      var10002 = 2956;
      Intrinsics.checkNotNullParameter(var1, "box");
      a(var0, var1, var2, null, 0.0F, null, null, 0.0F, false, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(@NotNull Object var0, @NotNull AABB var1) {
      short var10001 = 27240;
      short var10002 = -14219;
      Intrinsics.checkNotNullParameter(var0, "key");
      var10001 = 27248;
      var10002 = 2956;
      Intrinsics.checkNotNullParameter(var1, "box");
      a(var0, var1, null, null, 0.0F, null, null, 0.0F, false, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Object var0,
      @NotNull BlockPos var1,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3,
      float var4,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var5,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var6,
      float var7,
      boolean var8
   ) {
      short var10001 = 27240;
      short var10002 = -14219;
      Intrinsics.checkNotNullParameter(var0, "key");
      var10001 = 27242;
      var10002 = 5919;
      Intrinsics.checkNotNullParameter(var1, "pos");
      a(var0, var1, var2, var3, var4, var5, var6, var7, var8, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Object var0,
      @NotNull BlockPos var1,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3,
      float var4,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var5,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var6,
      float var7
   ) {
      short var10001 = 27240;
      short var10002 = -14219;
      Intrinsics.checkNotNullParameter(var0, "key");
      var10001 = 27242;
      var10002 = 5919;
      Intrinsics.checkNotNullParameter(var1, "pos");
      a(var0, var1, var2, var3, var4, var5, var6, var7, false, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Object var0,
      @NotNull BlockPos var1,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3,
      float var4,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var5,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var6
   ) {
      short var10001 = 27240;
      short var10002 = -14219;
      Intrinsics.checkNotNullParameter(var0, "key");
      var10001 = 27242;
      var10002 = 5919;
      Intrinsics.checkNotNullParameter(var1, "pos");
      a(var0, var1, var2, var3, var4, var5, var6, 0.0F, false, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Object var0,
      @NotNull BlockPos var1,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3,
      float var4,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var5
   ) {
      short var10001 = 27240;
      short var10002 = -14219;
      Intrinsics.checkNotNullParameter(var0, "key");
      var10001 = 27242;
      var10002 = 5919;
      Intrinsics.checkNotNullParameter(var1, "pos");
      a(var0, var1, var2, var3, var4, var5, null, 0.0F, false, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Object var0,
      @NotNull BlockPos var1,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3,
      float var4
   ) {
      short var10001 = 27240;
      short var10002 = -14219;
      Intrinsics.checkNotNullParameter(var0, "key");
      var10001 = 27242;
      var10002 = 5919;
      Intrinsics.checkNotNullParameter(var1, "pos");
      a(var0, var1, var2, var3, var4, null, null, 0.0F, false, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Object var0,
      @NotNull BlockPos var1,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3
   ) {
      short var10001 = 27240;
      short var10002 = -14219;
      Intrinsics.checkNotNullParameter(var0, "key");
      var10001 = 27242;
      var10002 = 5919;
      Intrinsics.checkNotNullParameter(var1, "pos");
      a(var0, var1, var2, var3, 0.0F, null, null, 0.0F, false, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Object var0, @NotNull BlockPos var1, @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2
   ) {
      short var10001 = 27240;
      short var10002 = -14219;
      Intrinsics.checkNotNullParameter(var0, "key");
      var10001 = 27242;
      var10002 = 5919;
      Intrinsics.checkNotNullParameter(var1, "pos");
      a(var0, var1, var2, null, 0.0F, null, null, 0.0F, false, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(@NotNull Object var0, @NotNull BlockPos var1) {
      short var10001 = 27240;
      short var10002 = -14219;
      Intrinsics.checkNotNullParameter(var0, "key");
      var10001 = 27242;
      var10002 = 5919;
      Intrinsics.checkNotNullParameter(var1, "pos");
      a(var0, var1, null, null, 0.0F, null, null, 0.0F, false, 0.0F);
   }

   private static final Unit a(
      IntRef param0,
      int[] param1,
      ObjectRef param2,
      ObjectRef param3,
      IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI param4
   ) {
      boolean var5 = me.octo.client.IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.c();
      Intrinsics.checkNotNullParameter(param4, "$this$paintOutlineMask");
      int var6 = 0;
      int var7 = param0.element;
      while (var6 < var7) {
         int var8 = param1[var6];
         int var9 = ((int[])param2.element)[var8];
         if (var5) {
            break;
         }
         if ((var9 >>> 24) != 0) {
            AABB var10 = ((AABB[])param3.element)[var8];
            Intrinsics.checkNotNull(var10);
            me.octo.client.lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a(param4, var10, new me.octo.client.llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(var9), null, 0, 0, 0.0F, 56, null);
         }
         var6++;
      }
      return Unit.INSTANCE;
   }

   private static final Unit b(
      IntRef param0,
      int[] param1,
      ObjectRef param2,
      ObjectRef param3,
      IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI param4
   ) {
      boolean var5 = IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.c();
      Intrinsics.checkNotNullParameter(param4, "$this$paintGlowMask");
      int var6 = 0;
      int var7 = param0.element;
      while (var6 < var7) {
         int var8 = param1[var6];
         int var9 = ((int[])param2.element)[var8];
         if (var5) {
            break;
         }
         if ((var9 >>> 24) != 0) {
            AABB var10 = ((AABB[])param3.element)[var8];
            Intrinsics.checkNotNull(var10);
            lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a(param4, var10, new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(var9), null, 0, 0, 0.0f, 56, null);
         }
         var6++;
         if (!var5) {
            continue;
         }
         break;
      }
      return Unit.INSTANCE;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()Z
      // 03: aload 4
      // 05: sipush 27238
      // 08: sipush 23177
      // 0b: pop2
      // 0c: ldc_w "$this$paintGlowMask"
      // 0f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 12: istore 5
      // 14: bipush 0
      // 15: istore 6
      // 17: aload 0
      // 18: getfield kotlin/jvm/internal/Ref$IntRef.element I
      // 1b: istore 7
      // 1d: iload 6
      // 1f: iload 7
      // 21: if_icmpge 7c
      // 24: aload 1
      // 25: iload 6
      // 27: iaload
      // 28: istore 8
      // 2a: aload 2
      // 2b: getfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
      // 2e: checkcast [I
      // 31: iload 8
      // 33: iaload
      // 34: istore 9
      // 36: iload 5
      // 38: ifne 77
      // 3b: iload 9
      // 3d: bipush 24
      // 3f: iushr
      // 40: ifeq 74
      // 43: goto 4a
      // 46: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 49: athrow
      // 4a: aload 4
      // 4c: aload 3
      // 4d: getfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
      // 50: checkcast [Lnet/minecraft/world/phys/AABB;
      // 53: iload 8
      // 55: aaload
      // 56: dup
      // 57: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 5a: new me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll
      // 5d: dup
      // 5e: iload 9
      // 60: invokespecial me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.<init> (I)V
      // 63: aconst_null
      // 64: bipush 0
      // 65: bipush 0
      // 66: fconst_0
      // 67: bipush 56
      // 69: aconst_null
      // 6a: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lnet/minecraft/world/phys/AABB;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;IIFILjava/lang/Object;)V
      // 6d: goto 74
      // 70: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 73: athrow
      // 74: iinc 6 1
      // 77: iload 5
      // 79: ifeq 1d
      // 7c: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 7f: areturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[19];
      int var3 = 0;
      String var2 = "í\u0013ÕiÖ\u0087\u000bQ¢qÔ/º\u0003\u0095)\u0084\r+Ö!²\u0089\u0099W0)Â¥Y\u0094\t\u0013±&R5OV\u0005a\riji%\u0080kvn\r\t! \u0004\u0005Çö\u001d\u008bÚ\u0013f©M%{&ñ,@ï»Ý\u0003\u0088ß·Jâ«\u0018I'\u009fã¬\u0013E]\u0007\u0094Î\u0090¡|@Jk\u0093Vqí\u0004\u0011\u000b\u0003\u0094©¤\u0003^MÔ\u0003÷®º\u0016Mª(E×*d\u00adòßíÓÐ[\u0084\u0091V\u0090àXx\u0004\u0003\u009c7×\u0012¡Û\u0082|\u000fà12\u008dI\u001a_\t\fkëá<\t{Ö+¾\u0094Òb¶ç\tcî·g\u0007Ú\u0010·©\u0003\fÌ\u009e";
      int var4 = "í\u0013ÕiÖ\u0087\u000bQ¢qÔ/º\u0003\u0095)\u0084\r+Ö!²\u0089\u0099W0)Â¥Y\u0094\t\u0013±&R5OV\u0005a\riji%\u0080kvn\r\t! \u0004\u0005Çö\u001d\u008bÚ\u0013f©M%{&ñ,@ï»Ý\u0003\u0088ß·Jâ«\u0018I'\u009fã¬\u0013E]\u0007\u0094Î\u0090¡|@Jk\u0093Vqí\u0004\u0011\u000b\u0003\u0094©¤\u0003^MÔ\u0003÷®º\u0016Mª(E×*d\u00adòßíÓÐ[\u0084\u0091V\u0090àXx\u0004\u0003\u009c7×\u0012¡Û\u0082|\u000fà12\u008dI\u001a_\t\fkëá<\t{Ö+¾\u0094Òb¶ç\tcî·g\u0007Ú\u0010·©\u0003\fÌ\u009e"
         .length();
      char var1 = '\r';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 102;
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
                     case 0 -> 14;
                     case 1 -> 64;
                     case 2 -> 34;
                     case 3 -> 33;
                     case 4 -> 42;
                     case 5 -> 108;
                     default -> 28;
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
                     b = new String[19];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll();
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new ObjectArrayList();
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new IntArrayList();
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new IntArrayList();
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new FloatArrayList();
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IntArrayList();
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new FloatArrayList();
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new BooleanArrayList();
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new FloatArrayList();
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new IntArrayList();
                     lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new Object2ObjectOpenHashMap();
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new Object();
                     me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        .a(IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
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

                  var2 = "*Ùhw\n.Gßµ\u0005Í\u0084ª3Ú";
                  var4 = "*Ùhw\n.Gßµ\u0005Í\u0084ª3Ú".length();
                  var1 = '\t';
                  var8 = -1;
            }

            var10000 = 59;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 27232) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 70;
            case 1 -> 86;
            case 2 -> 40;
            case 3 -> 101;
            case 4 -> 114;
            case 5 -> 200;
            case 6 -> 183;
            case 7 -> 145;
            case 8 -> 137;
            case 9 -> 220;
            case 10 -> 142;
            case 11 -> 87;
            case 12 -> 144;
            case 13 -> 75;
            case 14 -> 95;
            case 15 -> 51;
            case 16 -> 162;
            case 17 -> 10;
            case 18 -> 129;
            case 19 -> 27;
            case 20 -> 148;
            case 21 -> 217;
            case 22 -> 227;
            case 23 -> 81;
            case 24 -> 244;
            case 25 -> 24;
            case 26 -> 143;
            case 27 -> 14;
            case 28 -> 251;
            case 29 -> 82;
            case 30 -> 46;
            case 31 -> 12;
            case 32 -> 31;
            case 33 -> 117;
            case 34 -> 161;
            case 35 -> 254;
            case 36 -> 211;
            case 37 -> 128;
            case 38 -> 130;
            case 39 -> 176;
            case 40 -> 53;
            case 41 -> 185;
            case 42 -> 55;
            case 43 -> 155;
            case 44 -> 44;
            case 45 -> 238;
            case 46 -> 79;
            case 47 -> 228;
            case 48 -> 99;
            case 49 -> 97;
            case 50 -> 58;
            case 51 -> 60;
            case 52 -> 103;
            case 53 -> 11;
            case 54 -> 255;
            case 55 -> 186;
            case 56 -> 123;
            case 57 -> 242;
            case 58 -> 17;
            case 59 -> 106;
            case 60 -> 194;
            case 61 -> 188;
            case 62 -> 96;
            case 63 -> 15;
            case 64 -> 174;
            case 65 -> 150;
            case 66 -> 139;
            case 67 -> 152;
            case 68 -> 109;
            case 69 -> 164;
            case 70 -> 112;
            case 71 -> 80;
            case 72 -> 52;
            case 73 -> 236;
            case 74 -> 4;
            case 75 -> 178;
            case 76 -> 147;
            case 77 -> 169;
            case 78 -> 19;
            case 79 -> 67;
            case 80 -> 199;
            case 81 -> 9;
            case 82 -> 193;
            case 83 -> 141;
            case 84 -> 223;
            case 85 -> 39;
            case 86 -> 168;
            case 87 -> 63;
            case 88 -> 64;
            case 89 -> 234;
            case 90 -> 50;
            case 91 -> 115;
            case 92 -> 42;
            case 93 -> 205;
            case 94 -> 124;
            case 95 -> 151;
            case 96 -> 239;
            case 97 -> 213;
            case 98 -> 57;
            case 99 -> 206;
            case 100 -> 134;
            case 101 -> 62;
            case 102 -> 189;
            case 103 -> 175;
            case 104 -> 118;
            case 105 -> 21;
            case 106 -> 121;
            case 107 -> 126;
            case 108 -> 248;
            case 109 -> 66;
            case 110 -> 214;
            case 111 -> 69;
            case 112 -> 125;
            case 113 -> 171;
            case 114 -> 226;
            case 115 -> 5;
            case 116 -> 173;
            case 117 -> 243;
            case 118 -> 132;
            case 119 -> 203;
            case 120 -> 233;
            case 121 -> 216;
            case 122 -> 98;
            case 123 -> 133;
            case 124 -> 111;
            case 125 -> 224;
            case 126 -> 93;
            case 127 -> 105;
            case 128 -> 131;
            case 129 -> 157;
            case 130 -> 180;
            case 131 -> 88;
            case 132 -> 225;
            case 133 -> 136;
            case 134 -> 215;
            case 135 -> 198;
            case 136 -> 43;
            case 137 -> 110;
            case 138 -> 0;
            case 139 -> 219;
            case 140 -> 74;
            case 141 -> 204;
            case 142 -> 154;
            case 143 -> 113;
            case 144 -> 159;
            case 145 -> 18;
            case 146 -> 201;
            case 147 -> 235;
            case 148 -> 29;
            case 149 -> 65;
            case 150 -> 241;
            case 151 -> 249;
            case 152 -> 196;
            case 153 -> 153;
            case 154 -> 34;
            case 155 -> 207;
            case 156 -> 6;
            case 157 -> 77;
            case 158 -> 156;
            case 159 -> 48;
            case 160 -> 179;
            case 161 -> 202;
            case 162 -> 127;
            case 163 -> 108;
            case 164 -> 232;
            case 165 -> 104;
            case 166 -> 120;
            case 167 -> 38;
            case 168 -> 122;
            case 169 -> 177;
            case 170 -> 30;
            case 171 -> 149;
            case 172 -> 138;
            case 173 -> 253;
            case 174 -> 41;
            case 175 -> 23;
            case 176 -> 100;
            case 177 -> 20;
            case 178 -> 221;
            case 179 -> 7;
            case 180 -> 16;
            case 181 -> 187;
            case 182 -> 84;
            case 183 -> 1;
            case 184 -> 167;
            case 185 -> 76;
            case 186 -> 252;
            case 187 -> 119;
            case 188 -> 192;
            case 189 -> 208;
            case 190 -> 13;
            case 191 -> 237;
            case 192 -> 231;
            case 193 -> 245;
            case 194 -> 163;
            case 195 -> 3;
            case 196 -> 54;
            case 197 -> 91;
            case 198 -> 212;
            case 199 -> 116;
            case 200 -> 250;
            case 201 -> 94;
            case 202 -> 197;
            case 203 -> 165;
            case 204 -> 210;
            case 205 -> 218;
            case 206 -> 182;
            case 207 -> 85;
            case 208 -> 71;
            case 209 -> 35;
            case 210 -> 32;
            case 211 -> 72;
            case 212 -> 209;
            case 213 -> 28;
            case 214 -> 8;
            case 215 -> 25;
            case 216 -> 190;
            case 217 -> 45;
            case 218 -> 59;
            case 219 -> 166;
            case 220 -> 22;
            case 221 -> 240;
            case 222 -> 170;
            case 223 -> 191;
            case 224 -> 90;
            case 225 -> 68;
            case 226 -> 26;
            case 227 -> 33;
            case 228 -> 247;
            case 229 -> 246;
            case 230 -> 172;
            case 231 -> 89;
            case 232 -> 195;
            case 233 -> 230;
            case 234 -> 146;
            case 235 -> 181;
            case 236 -> 102;
            case 237 -> 160;
            case 238 -> 61;
            case 239 -> 37;
            case 240 -> 2;
            case 241 -> 78;
            case 242 -> 229;
            case 243 -> 140;
            case 244 -> 56;
            case 245 -> 158;
            case 246 -> 83;
            case 247 -> 184;
            case 248 -> 135;
            case 249 -> 107;
            case 250 -> 49;
            case 251 -> 47;
            case 252 -> 222;
            case 253 -> 36;
            case 254 -> 92;
            default -> 73;
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

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @NotNull
      private final AABB IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final float lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private final int IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private final float IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private boolean lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      private float IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      private static String a;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         @NotNull AABB var1, int var2, int var3, float var4, int var5, int var6, float var7, boolean var8, float var9
      ) {
         Intrinsics.checkNotNullParameter(var1, a);
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var6;
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var7;
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var8;
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var9;
      }

      @NotNull
      public final AABB a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final float d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final int e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final int f() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final float g() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      public final boolean h() {
         return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      public final float i() {
         return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: {
         char[] var10003 = "8u?".toCharArray();
         int var10004 = var10003.length;
         int var0 = 0;
         byte var6 = 11;
         char[] var10002 = var10003;
         int var1 = var10004;
         byte var10;
         char[] var10005;
         int var10006;
         if (var10004 <= 1) {
            var10005 = var10003;
            var10 = 11;
            var10006 = var0;
         } else {
            var6 = 11;
            var1 = var10004;
            if (var10004 <= var0) {
               String var9 = new String(var10003).intern();
               byte var4 = -1;
               a = var9;
               break pxClinit;
            }

            var10005 = var10003;
            var10 = 11;
            var10006 = var0;
         }

         while (true) {
            var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
               case 0 -> 81;
               case 1 -> 17;
               case 2 -> 76;
               case 3 -> 35;
               case 4 -> 112;
               case 5 -> 89;
               default -> 106;
            });
            var0++;
            if (var6 == 0) {
               var10006 = var6;
               var10005 = var10002;
               var10 = var6;
            } else {
               if (var1 <= var0) {
                  String var8 = new String(var10002).intern();
                  byte var3 = -1;
                  a = var8;
                  break pxClinit;
               }

               var10005 = var10002;
               var10 = var6;
               var10006 = var0;
            }
         }
      }
}
   }
}
