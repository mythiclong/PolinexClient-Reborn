package me.octo.client;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI
   implements lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl {
   @NotNull
   private final HashMap<IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll, LinkedHashSet<IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI>> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new HashMap<>();
   private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] b;
   private static String[] c;

   @NotNull
   @Override
   public IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI a() {
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      short var10001 = -10782;
      short var10002 = -19465;
      var10002 = -10781;
      short var10003 = -11800;
      return var10000.a("generate-cache", "Generate world cache for pathfinding")
         .a((kotlin.jvm.functions.Function1)null)
         .a();
   }

   private final void b() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.c ()[Ljava/lang/String;
      // 003: new java/io/File
      // 006: dup
      // 007: getstatic me/octo/client/llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl;
      // 00a: invokevirtual me/octo/client/llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.a ()Ljava/lang/String;
      // 00d: getstatic me/octo/client/IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Lme/octo/client/IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 010: invokevirtual me/octo/client/IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()Ljava/lang/String;
      // 013: invokespecial java/io/File.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 016: astore 2
      // 017: astore 1
      // 018: aload 2
      // 019: aload 1
      // 01a: ifnull 030
      // 01d: invokevirtual java/io/File.exists ()Z
      // 020: ifne 02f
      // 023: goto 02a
      // 026: invokestatic me/octo/client/IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 029: athrow
      // 02a: return
      // 02b: invokestatic me/octo/client/IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02e: athrow
      // 02f: aload 2
      // 030: invokedynamic accept ()Ljava/io/FileFilter; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/io/File;)Z, me/octo/client/IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.a (Ljava/io/File;)Z, (Ljava/io/File;)Z ]
      // 035: invokevirtual java/io/File.listFiles (Ljava/io/FileFilter;)[Ljava/io/File;
      // 038: astore 4
      // 03a: aload 4
      // 03c: aload 1
      // 03d: ifnull 04c
      // 040: ifnull 0ab
      // 043: goto 04a
      // 046: invokestatic me/octo/client/IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 049: athrow
      // 04a: aload 4
      // 04c: astore 6
      // 04e: nop
      // 04f: bipush 0
      // 050: istore 7
      // 052: aload 6
      // 054: astore 8
      // 056: new java/util/ArrayList
      // 059: dup
      // 05a: aload 6
      // 05c: arraylength
      // 05d: invokespecial java/util/ArrayList.<init> (I)V
      // 060: checkcast java/util/Collection
      // 063: astore 9
      // 065: bipush 0
      // 066: istore 10
      // 068: bipush 0
      // 069: istore 11
      // 06b: aload 8
      // 06d: arraylength
      // 06e: istore 12
      // 070: iload 11
      // 072: iload 12
      // 074: if_icmpge 0a2
      // 077: aload 8
      // 079: iload 11
      // 07b: aaload
      // 07c: astore 13
      // 07e: aload 9
      // 080: aload 13
      // 082: astore 14
      // 084: aload 1
      // 085: ifnull 0a4
      // 088: astore 27
      // 08a: bipush 0
      // 08b: istore 15
      // 08d: aload 14
      // 08f: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 092: aload 27
      // 094: swap
      // 095: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 09a: pop
      // 09b: iinc 11 1
      // 09e: aload 1
      // 09f: ifnonnull 070
      // 0a2: aload 9
      // 0a4: checkcast java/util/List
      // 0a7: nop
      // 0a8: goto 0ae
      // 0ab: invokestatic kotlin/collections/CollectionsKt.emptyList ()Ljava/util/List;
      // 0ae: astore 3
      // 0af: aload 0
      // 0b0: getfield me/octo/client/IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Ljava/util/HashMap;
      // 0b3: invokevirtual java/util/HashMap.clear ()V
      // 0b6: aload 3
      // 0b7: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0bc: astore 4
      // 0be: aload 4
      // 0c0: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0c5: ifeq 470
      // 0c8: aload 4
      // 0ca: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0cf: checkcast java/lang/String
      // 0d2: astore 5
      // 0d4: new java/io/File
      // 0d7: dup
      // 0d8: aload 2
      // 0d9: aload 5
      // 0db: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 0de: astore 6
      // 0e0: aload 6
      // 0e2: invokedynamic accept ()Ljava/io/FileFilter; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/io/File;)Z, me/octo/client/IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.b (Ljava/io/File;)Z, (Ljava/io/File;)Z ]
      // 0e7: invokevirtual java/io/File.listFiles (Ljava/io/FileFilter;)[Ljava/io/File;
      // 0ea: astore 8
      // 0ec: aload 8
      // 0ee: aload 1
      // 0ef: ifnull 0fe
      // 0f2: ifnull 118
      // 0f5: goto 0fc
      // 0f8: invokestatic me/octo/client/IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fb: athrow
      // 0fc: aload 8
      // 0fe: invokestatic kotlin/collections/ArraysKt.toList ([Ljava/lang/Object;)Ljava/util/List;
      // 101: astore 9
      // 103: aload 9
      // 105: aload 1
      // 106: ifnull 115
      // 109: ifnull 118
      // 10c: goto 113
      // 10f: invokestatic me/octo/client/IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 112: athrow
      // 113: aload 9
      // 115: goto 11b
      // 118: goto 0be
      // 11b: astore 7
      // 11d: aload 7
      // 11f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 124: astore 8
      // 126: aload 8
      // 128: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 12d: ifeq 258
      // 130: aload 8
      // 132: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 137: checkcast java/io/File
      // 13a: astore 9
      // 13c: new java/io/BufferedInputStream
      // 13f: dup
      // 140: new java/io/FileInputStream
      // 143: dup
      // 144: aload 9
      // 146: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 149: checkcast java/io/InputStream
      // 14c: ldc 65536
      // 14e: invokespecial java/io/BufferedInputStream.<init> (Ljava/io/InputStream;I)V
      // 151: checkcast java/io/Closeable
      // 154: astore 10
      // 156: aconst_null
      // 157: astore 11
      // 159: nop
      // 15a: aload 10
      // 15c: checkcast java/io/BufferedInputStream
      // 15f: astore 12
      // 161: bipush 0
      // 162: istore 13
      // 164: new java/io/DataInputStream
      // 167: dup
      // 168: aload 12
      // 16a: checkcast java/io/InputStream
      // 16d: invokespecial java/io/DataInputStream.<init> (Ljava/io/InputStream;)V
      // 170: checkcast java/io/Closeable
      // 173: astore 14
      // 175: aconst_null
      // 176: astore 15
      // 178: nop
      // 179: aload 14
      // 17b: checkcast java/io/DataInputStream
      // 17e: astore 16
      // 180: bipush 0
      // 181: istore 17
      // 183: aload 16
      // 185: invokevirtual java/io/DataInputStream.readInt ()I
      // 188: istore 18
      // 18a: bipush 0
      // 18b: aload 1
      // 18c: ifnull 0c5
      // 18f: istore 19
      // 191: iload 19
      // 193: iload 18
      // 195: if_icmpge 20e
      // 198: iload 19
      // 19a: istore 20
      // 19c: bipush 0
      // 19d: istore 21
      // 19f: aload 16
      // 1a1: invokevirtual java/io/DataInputStream.readByte ()B
      // 1a4: istore 22
      // 1a6: aload 16
      // 1a8: invokevirtual java/io/DataInputStream.readInt ()I
      // 1ab: istore 23
      // 1ad: aload 16
      // 1af: invokevirtual java/io/DataInputStream.readInt ()I
      // 1b2: istore 24
      // 1b4: aload 16
      // 1b6: invokevirtual java/io/DataInputStream.readInt ()I
      // 1b9: istore 25
      // 1bb: new me/octo/client/IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 1be: dup
      // 1bf: iload 23
      // 1c1: bipush 4
      // 1c2: ishr
      // 1c3: iload 25
      // 1c5: bipush 4
      // 1c6: ishr
      // 1c7: invokespecial me/octo/client/IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.<init> (II)V
      // 1ca: astore 26
      // 1cc: aload 0
      // 1cd: getfield me/octo/client/IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Ljava/util/HashMap;
      // 1d0: aload 26
      // 1d2: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, me/octo/client/IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.a (Lme/octo/client/IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;)Ljava/util/LinkedHashSet;, (Lme/octo/client/IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;)Ljava/util/LinkedHashSet; ]
      // 1d7: invokedynamic apply (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, me/octo/client/IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.a (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/LinkedHashSet;, (Ljava/lang/Object;)Ljava/util/LinkedHashSet; ]
      // 1dc: invokevirtual java/util/HashMap.computeIfAbsent (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
      // 1df: checkcast java/util/LinkedHashSet
      // 1e2: new me/octo/client/IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
      // 1e5: dup
      // 1e6: iload 23
      // 1e8: bipush 15
      // 1ea: iand
      // 1eb: iload 24
      // 1ed: iload 25
      // 1ef: bipush 15
      // 1f1: iand
      // 1f2: iload 22
      // 1f4: invokespecial me/octo/client/IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.<init> (IIIB)V
      // 1f7: invokevirtual java/util/LinkedHashSet.add (Ljava/lang/Object;)Z
      // 1fa: pop
      // 1fb: nop
      // 1fc: iinc 19 1
      // 1ff: aload 1
      // 200: ifnull 20f
      // 203: aload 1
      // 204: ifnonnull 191
      // 207: goto 20e
      // 20a: invokestatic me/octo/client/IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20d: athrow
      // 20e: nop
      // 20f: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 212: astore 16
      // 214: aload 14
      // 216: aload 15
      // 218: invokestatic kotlin/io/CloseableKt.closeFinally (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 21b: goto 233
      // 21e: astore 17
      // 220: aload 17
      // 222: astore 15
      // 224: aload 17
      // 226: athrow
      // 227: astore 17
      // 229: aload 14
      // 22b: aload 15
      // 22d: invokestatic kotlin/io/CloseableKt.closeFinally (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 230: aload 17
      // 232: athrow
      // 233: nop
      // 234: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 237: astore 12
      // 239: aload 10
      // 23b: aload 11
      // 23d: invokestatic kotlin/io/CloseableKt.closeFinally (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 240: goto 126
      // 243: astore 13
      // 245: aload 13
      // 247: astore 11
      // 249: aload 13
      // 24b: athrow
      // 24c: astore 13
      // 24e: aload 10
      // 250: aload 11
      // 252: invokestatic kotlin/io/CloseableKt.closeFinally (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 255: aload 13
      // 257: athrow
      // 258: new java/io/File
      // 25b: dup
      // 25c: aload 2
      // 25d: aload 5
      // 25f: sipush -10773
      // 262: sipush 26473
      // 265: pop2
      // 266: ldc_w ".dat"
      // 269: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 26e: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 271: astore 8
      // 273: aload 0
      // 274: getfield me/octo/client/IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Ljava/util/HashMap;
      // 277: invokevirtual java/util/HashMap.values ()Ljava/util/Collection;
      // 27a: dup
      // 27b: sipush -10780
      // 27e: sipush -129
      // 281: pop2
      // 282: ldc_w "<get-values>(...)"
      // 285: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 288: checkcast java/lang/Iterable
      // 28b: astore 10
      // 28d: bipush 0
      // 28e: istore 11
      // 290: aload 10
      // 292: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 297: astore 12
      // 299: aload 12
      // 29b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2a0: ifeq 2d0
      // 2a3: aload 12
      // 2a5: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2aa: astore 13
      // 2ac: iload 11
      // 2ae: aload 13
      // 2b0: checkcast java/util/LinkedHashSet
      // 2b3: astore 14
      // 2b5: istore 27
      // 2b7: bipush 0
      // 2b8: istore 15
      // 2ba: aload 14
      // 2bc: invokevirtual java/util/LinkedHashSet.size ()I
      // 2bf: istore 28
      // 2c1: iload 27
      // 2c3: iload 28
      // 2c5: iadd
      // 2c6: istore 11
      // 2c8: aload 1
      // 2c9: ifnull 0be
      // 2cc: aload 1
      // 2cd: ifnonnull 299
      // 2d0: iload 11
      // 2d2: istore 9
      // 2d4: bipush 4
      // 2d5: aload 0
      // 2d6: getfield me/octo/client/IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Ljava/util/HashMap;
      // 2d9: invokevirtual java/util/HashMap.keySet ()Ljava/util/Set;
      // 2dc: invokeinterface java/util/Set.size ()I 1
      // 2e1: bipush 12
      // 2e3: imul
      // 2e4: iadd
      // 2e5: iload 9
      // 2e7: bipush 5
      // 2e8: imul
      // 2e9: iadd
      // 2ea: istore 10
      // 2ec: new java/io/BufferedOutputStream
      // 2ef: dup
      // 2f0: new java/io/FileOutputStream
      // 2f3: dup
      // 2f4: aload 8
      // 2f6: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;)V
      // 2f9: checkcast java/io/OutputStream
      // 2fc: iload 10
      // 2fe: invokespecial java/io/BufferedOutputStream.<init> (Ljava/io/OutputStream;I)V
      // 301: checkcast java/io/Closeable
      // 304: astore 11
      // 306: aconst_null
      // 307: astore 12
      // 309: nop
      // 30a: aload 11
      // 30c: checkcast java/io/BufferedOutputStream
      // 30f: astore 13
      // 311: bipush 0
      // 312: istore 14
      // 314: new java/io/DataOutputStream
      // 317: dup
      // 318: aload 13
      // 31a: checkcast java/io/OutputStream
      // 31d: invokespecial java/io/DataOutputStream.<init> (Ljava/io/OutputStream;)V
      // 320: checkcast java/io/Closeable
      // 323: astore 15
      // 325: aconst_null
      // 326: astore 16
      // 328: nop
      // 329: aload 15
      // 32b: checkcast java/io/DataOutputStream
      // 32e: astore 17
      // 330: bipush 0
      // 331: istore 18
      // 333: aload 17
      // 335: aload 0
      // 336: getfield me/octo/client/IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Ljava/util/HashMap;
      // 339: invokevirtual java/util/HashMap.size ()I
      // 33c: invokevirtual java/io/DataOutputStream.writeInt (I)V
      // 33f: aload 0
      // 340: getfield me/octo/client/IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Ljava/util/HashMap;
      // 343: checkcast java/util/Map
      // 346: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 34b: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 350: astore 19
      // 352: aload 19
      // 354: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 359: ifeq 3fe
      // 35c: aload 19
      // 35e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 363: checkcast java/util/Map$Entry
      // 366: astore 20
      // 368: aload 20
      // 36a: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 36f: checkcast me/octo/client/IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 372: astore 21
      // 374: aload 20
      // 376: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 37b: checkcast java/util/LinkedHashSet
      // 37e: astore 22
      // 380: aload 17
      // 382: aload 22
      // 384: invokevirtual java/util/LinkedHashSet.size ()I
      // 387: invokevirtual java/io/DataOutputStream.writeInt (I)V
      // 38a: aload 17
      // 38c: aload 21
      // 38e: invokevirtual me/octo/client/IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()I
      // 391: invokevirtual java/io/DataOutputStream.writeInt (I)V
      // 394: aload 17
      // 396: aload 21
      // 398: invokevirtual me/octo/client/IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()I
      // 39b: invokevirtual java/io/DataOutputStream.writeInt (I)V
      // 39e: aload 22
      // 3a0: invokevirtual java/util/LinkedHashSet.iterator ()Ljava/util/Iterator;
      // 3a3: dup
      // 3a4: sipush -10777
      // 3a7: sipush -18287
      // 3aa: pop2
      // 3ab: ldc_w "iterator(...)"
      // 3ae: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 3b1: astore 23
      // 3b3: aload 23
      // 3b5: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3ba: ifeq 352
      // 3bd: aload 23
      // 3bf: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3c4: dup
      // 3c5: sipush -10778
      // 3c8: sipush -30018
      // 3cb: pop2
      // 3cc: ldc_w "next(...)"
      // 3cf: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 3d2: checkcast me/octo/client/IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
      // 3d5: astore 24
      // 3d7: aload 17
      // 3d9: aload 24
      // 3db: invokevirtual me/octo/client/IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d ()B
      // 3de: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 3e1: aload 17
      // 3e3: aload 24
      // 3e5: invokevirtual me/octo/client/IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.e ()I
      // 3e8: invokevirtual java/io/DataOutputStream.writeInt (I)V
      // 3eb: aload 1
      // 3ec: ifnull 39e
      // 3ef: aload 1
      // 3f0: ifnull 404
      // 3f3: aload 1
      // 3f4: ifnonnull 3b3
      // 3f7: goto 3fe
      // 3fa: invokestatic me/octo/client/IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3fd: athrow
      // 3fe: aload 17
      // 400: invokevirtual java/io/DataOutputStream.flush ()V
      // 403: nop
      // 404: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 407: astore 17
      // 409: aload 15
      // 40b: aload 16
      // 40d: invokestatic kotlin/io/CloseableKt.closeFinally (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 410: goto 428
      // 413: astore 18
      // 415: aload 18
      // 417: astore 16
      // 419: aload 18
      // 41b: athrow
      // 41c: astore 18
      // 41e: aload 15
      // 420: aload 16
      // 422: invokestatic kotlin/io/CloseableKt.closeFinally (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 425: aload 18
      // 427: athrow
      // 428: nop
      // 429: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 42c: astore 13
      // 42e: aload 11
      // 430: aload 12
      // 432: invokestatic kotlin/io/CloseableKt.closeFinally (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 435: goto 44d
      // 438: astore 14
      // 43a: aload 14
      // 43c: astore 12
      // 43e: aload 14
      // 440: athrow
      // 441: astore 14
      // 443: aload 11
      // 445: aload 12
      // 447: invokestatic kotlin/io/CloseableKt.closeFinally (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 44a: aload 14
      // 44c: athrow
      // 44d: aload 0
      // 44e: getfield me/octo/client/IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Ljava/util/HashMap;
      // 451: invokevirtual java/util/HashMap.clear ()V
      // 454: aload 8
      // 456: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 459: sipush -10784
      // 45c: sipush -22006
      // 45f: pop2
      // 460: ldc_w "Wrote all files to "
      // 463: swap
      // 464: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 469: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 46c: aload 1
      // 46d: ifnonnull 0be
      // 470: return
   }

   private static final Unit a(
      IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI var0,
      llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var1
   ) {
      short var10001 = -10774;
      short var10002 = -7494;
      Intrinsics.checkNotNullParameter(var1, "<unused var>");
      var0.b();
      return Unit.INSTANCE;
   }

   private static final LinkedHashSet a(
      IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0
   ) {
      short var10001 = -10783;
      short var10002 = -13229;
      Intrinsics.checkNotNullParameter(var0, "it");
      return new LinkedHashSet();
   }

   private static final LinkedHashSet a(Function1 var0, Object var1) {
      return (LinkedHashSet)var0.invoke(var1);
   }

   private static final boolean a(File var0) {
      return var0.isDirectory();
   }

   private static final boolean b(File var0) {
      String[] var1 = c();
      boolean var10000 = var0.isFile();
      if (var1 != null) {
         if (!var10000) {
            return false;
         }

         Intrinsics.checkNotNull(var0);
         String var2 = FilesKt.getExtension(var0);
         short var10001 = -10779;
         short var10002 = 18529;
         var10000 = Intrinsics.areEqual(var2, "dat");
      }

      return var1 == null ? var10000 : var10000;
   }

   public static void b(String[] var0) {
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var0;
   }

   public static String[] c() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[10];
      String[] var10000 = new String[2];
      int var3 = 0;
      b(var10000);
      String var2 = "\\\u001aÛ\u0001,(³è&\u0002ÃªýA$Óè\u000e_\u0096ãä\u0091Á9\u009dJýo»á\u0087¾S\u001dQÉæT\u0090@÷|\u001e\u0094z¸é}ÅI\u0013º\u007f0IgS:çá\u0088UÚÌ\u0004Îî\u0005xü\u00025±\t\u008eQ¿y.[¸kR\rþ:K!GÌ´Ô»=\u009aä1\u0011\u0016Í©¨W9}6\u0010÷D\u008f\u001dXeIÛ\u0003\b*(";
      int var4 = "\\\u001aÛ\u0001,(³è&\u0002ÃªýA$Óè\u000e_\u0096ãä\u0091Á9\u009dJýo»á\u0087¾S\u001dQÉæT\u0090@÷|\u001e\u0094z¸é}ÅI\u0013º\u007f0IgS:çá\u0088UÚÌ\u0004Îî\u0005xü\u00025±\t\u008eQ¿y.[¸kR\rþ:K!GÌ´Ô»=\u009aä1\u0011\u0016Í©¨W9}6\u0010÷D\u008f\u001dXeIÛ\u0003\b*("
         .length();
      char var1 = 14;
      int var8 = -1;

      label52:
      while (true) {
         byte var9 = 45;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var25 = var10001.toCharArray();
               int var10004 = var25.length;
               int var6 = 0;
               byte var28 = var9;
               var21 = var25;
               int var15 = var10004;
               byte var33;
               char[] var37;
               int var10006;
               if (var10004 <= 1) {
                  var37 = var25;
                  var33 = var9;
                  var10006 = var6;
               } else {
                  var28 = var9;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var37 = var25;
                  var33 = var9;
                  var10006 = var6;
               }

               while (true) {
                  var37[var10006] = (char)(var37[var10006] ^ var33 ^ switch (var6 % 7) {
                     case 0 -> 97;
                     case 1 -> 97;
                     case 2 -> 17;
                     case 3 -> 74;
                     case 4 -> 44;
                     case 5 -> 97;
                     default -> 115;
                  });
                  var6++;
                  if (var28 == 0) {
                     var10006 = var28;
                     var37 = var21;
                     var33 = var28;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var37 = var21;
                     var33 = var28;
                     var10006 = var6;
                  }
               }
            }

            String var30 = new String(var21).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var30;
                  if ((var8 += var1) >= var4) {
                     b = var5;
                     c = new String[10];
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

                  var2 = "Ý|NZ\nÀÓ¡öQoJ\u0004B\nâ¦";
                  var4 = "Ý|NZ\nÀÓ¡öQoJ\u0004B\nâ¦".length();
                  var1 = '\f';
                  var8 = -1;
            }

            var9 = 115;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -10782) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 227;
            case 1 -> 103;
            case 2 -> 4;
            case 3 -> 78;
            case 4 -> 40;
            case 5 -> 11;
            case 6 -> 145;
            case 7 -> 209;
            case 8 -> 198;
            case 9 -> 171;
            case 10 -> 144;
            case 11 -> 61;
            case 12 -> 238;
            case 13 -> 193;
            case 14 -> 49;
            case 15 -> 3;
            case 16 -> 128;
            case 17 -> 122;
            case 18 -> 27;
            case 19 -> 56;
            case 20 -> 150;
            case 21 -> 217;
            case 22 -> 46;
            case 23 -> 175;
            case 24 -> 156;
            case 25 -> 41;
            case 26 -> 190;
            case 27 -> 157;
            case 28 -> 106;
            case 29 -> 226;
            case 30 -> 110;
            case 31 -> 179;
            case 32 -> 133;
            case 33 -> 237;
            case 34 -> 109;
            case 35 -> 170;
            case 36 -> 206;
            case 37 -> 43;
            case 38 -> 121;
            case 39 -> 8;
            case 40 -> 123;
            case 41 -> 45;
            case 42 -> 115;
            case 43 -> 138;
            case 44 -> 129;
            case 45 -> 201;
            case 46 -> 21;
            case 47 -> 244;
            case 48 -> 68;
            case 49 -> 1;
            case 50 -> 38;
            case 51 -> 17;
            case 52 -> 69;
            case 53 -> 34;
            case 54 -> 92;
            case 55 -> 54;
            case 56 -> 255;
            case 57 -> 161;
            case 58 -> 210;
            case 59 -> 101;
            case 60 -> 162;
            case 61 -> 147;
            case 62 -> 176;
            case 63 -> 172;
            case 64 -> 2;
            case 65 -> 196;
            case 66 -> 221;
            case 67 -> 239;
            case 68 -> 65;
            case 69 -> 241;
            case 70 -> 116;
            case 71 -> 124;
            case 72 -> 39;
            case 73 -> 228;
            case 74 -> 108;
            case 75 -> 132;
            case 76 -> 223;
            case 77 -> 14;
            case 78 -> 13;
            case 79 -> 254;
            case 80 -> 235;
            case 81 -> 59;
            case 82 -> 117;
            case 83 -> 95;
            case 84 -> 242;
            case 85 -> 20;
            case 86 -> 48;
            case 87 -> 112;
            case 88 -> 79;
            case 89 -> 153;
            case 90 -> 25;
            case 91 -> 24;
            case 92 -> 37;
            case 93 -> 126;
            case 94 -> 240;
            case 95 -> 80;
            case 96 -> 154;
            case 97 -> 93;
            case 98 -> 253;
            case 99 -> 55;
            case 100 -> 118;
            case 101 -> 167;
            case 102 -> 220;
            case 103 -> 81;
            case 104 -> 72;
            case 105 -> 222;
            case 106 -> 246;
            case 107 -> 213;
            case 108 -> 77;
            case 109 -> 214;
            case 110 -> 143;
            case 111 -> 75;
            case 112 -> 218;
            case 113 -> 207;
            case 114 -> 211;
            case 115 -> 51;
            case 116 -> 82;
            case 117 -> 134;
            case 118 -> 159;
            case 119 -> 63;
            case 120 -> 231;
            case 121 -> 67;
            case 122 -> 113;
            case 123 -> 248;
            case 124 -> 245;
            case 125 -> 76;
            case 126 -> 107;
            case 127 -> 73;
            case 128 -> 184;
            case 129 -> 9;
            case 130 -> 234;
            case 131 -> 142;
            case 132 -> 178;
            case 133 -> 152;
            case 134 -> 252;
            case 135 -> 166;
            case 136 -> 119;
            case 137 -> 131;
            case 138 -> 232;
            case 139 -> 233;
            case 140 -> 84;
            case 141 -> 62;
            case 142 -> 204;
            case 143 -> 194;
            case 144 -> 60;
            case 145 -> 87;
            case 146 -> 219;
            case 147 -> 98;
            case 148 -> 177;
            case 149 -> 215;
            case 150 -> 85;
            case 151 -> 141;
            case 152 -> 44;
            case 153 -> 31;
            case 154 -> 189;
            case 155 -> 83;
            case 156 -> 29;
            case 157 -> 149;
            case 158 -> 136;
            case 159 -> 16;
            case 160 -> 160;
            case 161 -> 102;
            case 162 -> 140;
            case 163 -> 183;
            case 164 -> 243;
            case 165 -> 10;
            case 166 -> 42;
            case 167 -> 250;
            case 168 -> 230;
            case 169 -> 229;
            case 170 -> 23;
            case 171 -> 168;
            case 172 -> 163;
            case 173 -> 169;
            case 174 -> 125;
            case 175 -> 100;
            case 176 -> 30;
            case 177 -> 32;
            case 178 -> 182;
            case 179 -> 96;
            case 180 -> 97;
            case 181 -> 127;
            case 182 -> 58;
            case 183 -> 114;
            case 184 -> 89;
            case 185 -> 188;
            case 186 -> 35;
            case 187 -> 208;
            case 188 -> 251;
            case 189 -> 203;
            case 190 -> 74;
            case 191 -> 88;
            case 192 -> 155;
            case 193 -> 164;
            case 194 -> 18;
            case 195 -> 197;
            case 196 -> 249;
            case 197 -> 187;
            case 198 -> 70;
            case 199 -> 174;
            case 200 -> 185;
            case 201 -> 205;
            case 202 -> 192;
            case 203 -> 202;
            case 204 -> 216;
            case 205 -> 64;
            case 206 -> 186;
            case 207 -> 199;
            case 208 -> 66;
            case 209 -> 173;
            case 210 -> 181;
            case 211 -> 247;
            case 212 -> 165;
            case 213 -> 57;
            case 214 -> 99;
            case 215 -> 26;
            case 216 -> 180;
            case 217 -> 137;
            case 218 -> 5;
            case 219 -> 53;
            case 220 -> 135;
            case 221 -> 12;
            case 222 -> 71;
            case 223 -> 52;
            case 224 -> 151;
            case 225 -> 90;
            case 226 -> 212;
            case 227 -> 15;
            case 228 -> 7;
            case 229 -> 236;
            case 230 -> 225;
            case 231 -> 195;
            case 232 -> 200;
            case 233 -> 6;
            case 234 -> 22;
            case 235 -> 224;
            case 236 -> 191;
            case 237 -> 111;
            case 238 -> 0;
            case 239 -> 86;
            case 240 -> 91;
            case 241 -> 148;
            case 242 -> 33;
            case 243 -> 28;
            case 244 -> 158;
            case 245 -> 47;
            case 246 -> 105;
            case 247 -> 50;
            case 248 -> 146;
            case 249 -> 94;
            case 250 -> 104;
            case 251 -> 130;
            case 252 -> 19;
            case 253 -> 36;
            case 254 -> 120;
            default -> 139;
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }

   private static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final byte lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(int var1, int var2, int var3, byte var4) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               << 8
            | this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl << 4
            | this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final byte d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final int e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String[] var2 = IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.c();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         int var3 = ((var10000 instanceof IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI) ? 1 : 0);
         if (var2 != null) {
            if (var3 == 0) {
               return false;
            }

            var3 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         }

         if (var2 != null) {
            var3 = var3
                  == ((IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var1)
                     .IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
               ? 1
               : 0;
         }

         return (var3 != 0);
      }

      @Override
      public int hashCode() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final int f() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int g() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int h() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final byte i() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         int var1, int var2, int var3, byte var4
      ) {
         return new IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var2, var3, var4
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -1595;
         byte var1 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         int var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -28345;
         short var10002 = -1594;
         short var10003 = 19017;
         short var10004 = -1596;
         short var10005 = 14546;
         short var10006 = -1593;
         short var10007 = -18414;
         return "LocalPos(x=" + var4 + ", y=" + var3 + ", z=" + var2 + ", state=" + var1 + ")";
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[4];
         int var3 = 0;
         String var2 = "¸2\u000e\u0088\u000b1xJ;ÛÉ¢s<Á@";
         int var4 = "¸2\u000e\u0088\u000b1xJ;ÛÉ¢s<Á@".length();
         char var1 = 4;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 86;
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
                        case 0 -> 58;
                        case 1 -> 26;
                        case 2 -> 17;
                        case 3 -> 8;
                        case 4 -> 79;
                        case 5 -> 46;
                        default -> 34;
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
                        b = new String[4];
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

                     var2 = "\u00149È¹\bÂH\u0018ÞÞ¶ô\"";
                     var4 = "\u00149È¹\bÂH\u0018ÞÞ¶ô\"".length();
                     var1 = 4;
                     var8 = -1;
               }

               var10000 = 68;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -1596) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 250;
               case 1 -> 69;
               case 2 -> 224;
               case 3 -> 139;
               case 4 -> 115;
               case 5 -> 32;
               case 6 -> 117;
               case 7 -> 90;
               case 8 -> 73;
               case 9 -> 169;
               case 10 -> 61;
               case 11 -> 145;
               case 12 -> 215;
               case 13 -> 235;
               case 14 -> 196;
               case 15 -> 58;
               case 16 -> 103;
               case 17 -> 208;
               case 18 -> 176;
               case 19 -> 239;
               case 20 -> 80;
               case 21 -> 17;
               case 22 -> 149;
               case 23 -> 166;
               case 24 -> 39;
               case 25 -> 47;
               case 26 -> 199;
               case 27 -> 92;
               case 28 -> 60;
               case 29 -> 0;
               case 30 -> 178;
               case 31 -> 143;
               case 32 -> 53;
               case 33 -> 231;
               case 34 -> 222;
               case 35 -> 22;
               case 36 -> 147;
               case 37 -> 48;
               case 38 -> 114;
               case 39 -> 121;
               case 40 -> 72;
               case 41 -> 16;
               case 42 -> 74;
               case 43 -> 66;
               case 44 -> 25;
               case 45 -> 2;
               case 46 -> 216;
               case 47 -> 128;
               case 48 -> 95;
               case 49 -> 122;
               case 50 -> 27;
               case 51 -> 112;
               case 52 -> 33;
               case 53 -> 111;
               case 54 -> 177;
               case 55 -> 211;
               case 56 -> 161;
               case 57 -> 126;
               case 58 -> 119;
               case 59 -> 253;
               case 60 -> 78;
               case 61 -> 5;
               case 62 -> 230;
               case 63 -> 210;
               case 64 -> 174;
               case 65 -> 188;
               case 66 -> 30;
               case 67 -> 219;
               case 68 -> 186;
               case 69 -> 12;
               case 70 -> 183;
               case 71 -> 144;
               case 72 -> 59;
               case 73 -> 55;
               case 74 -> 236;
               case 75 -> 6;
               case 76 -> 226;
               case 77 -> 70;
               case 78 -> 83;
               case 79 -> 100;
               case 80 -> 118;
               case 81 -> 43;
               case 82 -> 232;
               case 83 -> 246;
               case 84 -> 205;
               case 85 -> 88;
               case 86 -> 1;
               case 87 -> 104;
               case 88 -> 194;
               case 89 -> 129;
               case 90 -> 81;
               case 91 -> 26;
               case 92 -> 110;
               case 93 -> 54;
               case 94 -> 156;
               case 95 -> 155;
               case 96 -> 138;
               case 97 -> 41;
               case 98 -> 254;
               case 99 -> 116;
               case 100 -> 229;
               case 101 -> 87;
               case 102 -> 13;
               case 103 -> 150;
               case 104 -> 157;
               case 105 -> 120;
               case 106 -> 3;
               case 107 -> 42;
               case 108 -> 68;
               case 109 -> 165;
               case 110 -> 89;
               case 111 -> 168;
               case 112 -> 162;
               case 113 -> 240;
               case 114 -> 109;
               case 115 -> 134;
               case 116 -> 75;
               case 117 -> 175;
               case 118 -> 96;
               case 119 -> 131;
               case 120 -> 141;
               case 121 -> 71;
               case 122 -> 184;
               case 123 -> 10;
               case 124 -> 181;
               case 125 -> 202;
               case 126 -> 40;
               case 127 -> 179;
               case 128 -> 225;
               case 129 -> 36;
               case 130 -> 133;
               case 131 -> 146;
               case 132 -> 62;
               case 133 -> 185;
               case 134 -> 227;
               case 135 -> 79;
               case 136 -> 248;
               case 137 -> 204;
               case 138 -> 190;
               case 139 -> 9;
               case 140 -> 173;
               case 141 -> 37;
               case 142 -> 244;
               case 143 -> 214;
               case 144 -> 187;
               case 145 -> 84;
               case 146 -> 243;
               case 147 -> 249;
               case 148 -> 98;
               case 149 -> 97;
               case 150 -> 124;
               case 151 -> 201;
               case 152 -> 189;
               case 153 -> 105;
               case 154 -> 221;
               case 155 -> 11;
               case 156 -> 91;
               case 157 -> 153;
               case 158 -> 182;
               case 159 -> 125;
               case 160 -> 20;
               case 161 -> 148;
               case 162 -> 192;
               case 163 -> 102;
               case 164 -> 217;
               case 165 -> 4;
               case 166 -> 160;
               case 167 -> 237;
               case 168 -> 21;
               case 169 -> 64;
               case 170 -> 238;
               case 171 -> 18;
               case 172 -> 99;
               case 173 -> 212;
               case 174 -> 135;
               case 175 -> 213;
               case 176 -> 172;
               case 177 -> 127;
               case 178 -> 171;
               case 179 -> 35;
               case 180 -> 200;
               case 181 -> 137;
               case 182 -> 252;
               case 183 -> 56;
               case 184 -> 51;
               case 185 -> 233;
               case 186 -> 255;
               case 187 -> 247;
               case 188 -> 130;
               case 189 -> 245;
               case 190 -> 19;
               case 191 -> 45;
               case 192 -> 14;
               case 193 -> 241;
               case 194 -> 76;
               case 195 -> 24;
               case 196 -> 82;
               case 197 -> 63;
               case 198 -> 52;
               case 199 -> 50;
               case 200 -> 28;
               case 201 -> 140;
               case 202 -> 94;
               case 203 -> 93;
               case 204 -> 107;
               case 205 -> 136;
               case 206 -> 7;
               case 207 -> 193;
               case 208 -> 31;
               case 209 -> 8;
               case 210 -> 251;
               case 211 -> 132;
               case 212 -> 218;
               case 213 -> 195;
               case 214 -> 29;
               case 215 -> 151;
               case 216 -> 101;
               case 217 -> 209;
               case 218 -> 170;
               case 219 -> 223;
               case 220 -> 113;
               case 221 -> 142;
               case 222 -> 234;
               case 223 -> 163;
               case 224 -> 242;
               case 225 -> 108;
               case 226 -> 57;
               case 227 -> 65;
               case 228 -> 49;
               case 229 -> 46;
               case 230 -> 198;
               case 231 -> 207;
               case 232 -> 85;
               case 233 -> 220;
               case 234 -> 15;
               case 235 -> 167;
               case 236 -> 180;
               case 237 -> 191;
               case 238 -> 38;
               case 239 -> 106;
               case 240 -> 44;
               case 241 -> 86;
               case 242 -> 154;
               case 243 -> 197;
               case 244 -> 158;
               case 245 -> 152;
               case 246 -> 77;
               case 247 -> 34;
               case 248 -> 67;
               case 249 -> 23;
               case 250 -> 159;
               case 251 -> 123;
               case 252 -> 164;
               case 253 -> 206;
               case 254 -> 203;
               default -> 228;
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
         public static me.octo.client.IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(me.octo.client.IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI p0, int p1, int p2, int p3, byte p4, int mask, java.lang.Object marker) {
         if ((mask & 1) != 0) { p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
         if ((mask & 2) != 0) { p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
         if ((mask & 4) != 0) { p3 = p0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl; }
         if ((mask & 8) != 0) { p4 = p0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI; }
         return p0.a(p1, p2, p3, p4);
      }
}

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
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
      public final IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         int var1, int var2
      ) {
         return new IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10002 = 30150;
         short var10003 = -5938;
         var10003 = 30151;
         short var10004 = -1141;
         return "ChunkPos(x="
            + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            + ", z="
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
         String[] var2 = IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.c();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
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
         String var2 = "ÌÖ9Oiß6\u0080Ê\u008b×\u0004ËLT\u000e";
         int var4 = "ÌÖ9Oiß6\u0080Ê\u008b×\u0004ËLT\u000e".length();
         char var1 = 11;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 36;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 36;
                  var10006 = var6;
               } else {
                  var13 = 36;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 36;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 50;
                     case 1 -> 41;
                     case 2 -> 24;
                     case 3 -> 27;
                     case 4 -> 93;
                     case 5 -> 6;
                     default -> 121;
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
         int var2 = (var0 ^ 30150) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 134;
               case 1 -> 207;
               case 2 -> 114;
               case 3 -> 91;
               case 4 -> 217;
               case 5 -> 225;
               case 6 -> 238;
               case 7 -> 158;
               case 8 -> 70;
               case 9 -> 59;
               case 10 -> 9;
               case 11 -> 199;
               case 12 -> 254;
               case 13 -> 179;
               case 14 -> 26;
               case 15 -> 240;
               case 16 -> 183;
               case 17 -> 177;
               case 18 -> 48;
               case 19 -> 122;
               case 20 -> 172;
               case 21 -> 30;
               case 22 -> 150;
               case 23 -> 164;
               case 24 -> 58;
               case 25 -> 6;
               case 26 -> 210;
               case 27 -> 86;
               case 28 -> 76;
               case 29 -> 253;
               case 30 -> 185;
               case 31 -> 5;
               case 32 -> 119;
               case 33 -> 40;
               case 34 -> 242;
               case 35 -> 178;
               case 36 -> 56;
               case 37 -> 78;
               case 38 -> 175;
               case 39 -> 203;
               case 40 -> 126;
               case 41 -> 65;
               case 42 -> 73;
               case 43 -> 105;
               case 44 -> 36;
               case 45 -> 121;
               case 46 -> 130;
               case 47 -> 151;
               case 48 -> 236;
               case 49 -> 19;
               case 50 -> 245;
               case 51 -> 123;
               case 52 -> 222;
               case 53 -> 99;
               case 54 -> 133;
               case 55 -> 144;
               case 56 -> 197;
               case 57 -> 152;
               case 58 -> 255;
               case 59 -> 101;
               case 60 -> 72;
               case 61 -> 116;
               case 62 -> 186;
               case 63 -> 194;
               case 64 -> 100;
               case 65 -> 14;
               case 66 -> 190;
               case 67 -> 113;
               case 68 -> 206;
               case 69 -> 93;
               case 70 -> 189;
               case 71 -> 111;
               case 72 -> 17;
               case 73 -> 146;
               case 74 -> 215;
               case 75 -> 181;
               case 76 -> 2;
               case 77 -> 115;
               case 78 -> 138;
               case 79 -> 94;
               case 80 -> 196;
               case 81 -> 62;
               case 82 -> 45;
               case 83 -> 233;
               case 84 -> 162;
               case 85 -> 226;
               case 86 -> 234;
               case 87 -> 88;
               case 88 -> 140;
               case 89 -> 117;
               case 90 -> 148;
               case 91 -> 60;
               case 92 -> 103;
               case 93 -> 13;
               case 94 -> 50;
               case 95 -> 106;
               case 96 -> 193;
               case 97 -> 246;
               case 98 -> 68;
               case 99 -> 252;
               case 100 -> 34;
               case 101 -> 95;
               case 102 -> 176;
               case 103 -> 87;
               case 104 -> 21;
               case 105 -> 214;
               case 106 -> 159;
               case 107 -> 168;
               case 108 -> 173;
               case 109 -> 25;
               case 110 -> 18;
               case 111 -> 139;
               case 112 -> 208;
               case 113 -> 129;
               case 114 -> 221;
               case 115 -> 98;
               case 116 -> 229;
               case 117 -> 22;
               case 118 -> 110;
               case 119 -> 118;
               case 120 -> 39;
               case 121 -> 92;
               case 122 -> 97;
               case 123 -> 165;
               case 124 -> 80;
               case 125 -> 127;
               case 126 -> 218;
               case 127 -> 213;
               case 128 -> 220;
               case 129 -> 135;
               case 130 -> 191;
               case 131 -> 33;
               case 132 -> 71;
               case 133 -> 157;
               case 134 -> 239;
               case 135 -> 67;
               case 136 -> 120;
               case 137 -> 200;
               case 138 -> 64;
               case 139 -> 8;
               case 140 -> 232;
               case 141 -> 49;
               case 142 -> 187;
               case 143 -> 108;
               case 144 -> 174;
               case 145 -> 219;
               case 146 -> 28;
               case 147 -> 107;
               case 148 -> 166;
               case 149 -> 42;
               case 150 -> 160;
               case 151 -> 156;
               case 152 -> 89;
               case 153 -> 192;
               case 154 -> 27;
               case 155 -> 241;
               case 156 -> 142;
               case 157 -> 1;
               case 158 -> 137;
               case 159 -> 230;
               case 160 -> 47;
               case 161 -> 15;
               case 162 -> 132;
               case 163 -> 46;
               case 164 -> 38;
               case 165 -> 251;
               case 166 -> 249;
               case 167 -> 184;
               case 168 -> 136;
               case 169 -> 228;
               case 170 -> 61;
               case 171 -> 182;
               case 172 -> 143;
               case 173 -> 77;
               case 174 -> 231;
               case 175 -> 55;
               case 176 -> 12;
               case 177 -> 131;
               case 178 -> 205;
               case 179 -> 3;
               case 180 -> 24;
               case 181 -> 11;
               case 182 -> 247;
               case 183 -> 104;
               case 184 -> 29;
               case 185 -> 83;
               case 186 -> 149;
               case 187 -> 43;
               case 188 -> 41;
               case 189 -> 167;
               case 190 -> 84;
               case 191 -> 75;
               case 192 -> 198;
               case 193 -> 248;
               case 194 -> 195;
               case 195 -> 128;
               case 196 -> 244;
               case 197 -> 10;
               case 198 -> 216;
               case 199 -> 81;
               case 200 -> 79;
               case 201 -> 155;
               case 202 -> 125;
               case 203 -> 85;
               case 204 -> 54;
               case 205 -> 31;
               case 206 -> 223;
               case 207 -> 35;
               case 208 -> 112;
               case 209 -> 141;
               case 210 -> 69;
               case 211 -> 147;
               case 212 -> 44;
               case 213 -> 0;
               case 214 -> 204;
               case 215 -> 74;
               case 216 -> 250;
               case 217 -> 52;
               case 218 -> 53;
               case 219 -> 188;
               case 220 -> 23;
               case 221 -> 154;
               case 222 -> 209;
               case 223 -> 63;
               case 224 -> 4;
               case 225 -> 170;
               case 226 -> 169;
               case 227 -> 224;
               case 228 -> 227;
               case 229 -> 124;
               case 230 -> 211;
               case 231 -> 243;
               case 232 -> 90;
               case 233 -> 109;
               case 234 -> 235;
               case 235 -> 145;
               case 236 -> 16;
               case 237 -> 201;
               case 238 -> 82;
               case 239 -> 153;
               case 240 -> 96;
               case 241 -> 171;
               case 242 -> 37;
               case 243 -> 7;
               case 244 -> 163;
               case 245 -> 202;
               case 246 -> 57;
               case 247 -> 212;
               case 248 -> 237;
               case 249 -> 102;
               case 250 -> 51;
               case 251 -> 180;
               case 252 -> 32;
               case 253 -> 66;
               case 254 -> 161;
               default -> 20;
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
         public static me.octo.client.IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(me.octo.client.IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll p0, int p1, int p2, int mask, java.lang.Object marker) {
         if ((mask & 1) != 0) { p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
         if ((mask & 2) != 0) { p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
         return p0.a(p1, p2);
      }
}
}
