package me.octo.client.utils;

import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.imageio.ImageIO;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lllIIIIlIlIlllllIlIIllIIllIllllIlIIIllIIllIIllIIlIIlIlIIIIlllIIllIlllIIlIIlIlIlIIllll {
   @NotNull
   public static lllIIIIlIlIlllllIlIIllIIllIllllIlIIIllIIllIIllIIlIIlIlIIIIlllIIllIlllIIlIIlIlIlIIllll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] a;
   private static String[] b;

   private lllIIIIlIlIlllllIlIIllIIllIllllIlIIIllIIllIIllIIlIIlIlIIIIlllIIllIlllIIlIIlIlIlIIllll() {
   }

   @JvmStatic
   public static final void a(@NotNull Path param0) {
      // decoy: <guard>.i() String[] (slot 1) is only re-tested by ifnull/ifnonnull folds -> kept as a real switch value
      String[] var1 = lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.i();
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param0, "path");
      try {
         if (var1 != null) {
            java.nio.file.Files.delete(param0);
         } else {
            if (java.nio.file.Files.isDirectory(param0, new java.nio.file.LinkOption[0])) {
               java.nio.file.Files.walkFileTree(param0, (java.nio.file.FileVisitor)new me.octo.client.utils.lllIIIIlIlIlllllIlIIllIIllIllllIlIIIllIIllIIllIIlIIlIlIIIIlllIIllIlllIIlIIlIlIlIIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll());
               return;
            }
            java.nio.file.Files.delete(param0);
         }
      } catch (java.io.IOException var2) {
         throw new RuntimeException("Failed to delete path:" + param0, (Throwable)var2);
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   @JvmStatic
   // PX-FIX: jar 异常表对“无抛出点”区域也登记了 IOException handler；Java 源码需 try 体可抛该异常才能保留 catch（运行时空桩不抛）。
   private static void pxIOExceptionReach() throws java.io.IOException {
   }

   public static final void b(@NotNull Path var0) {
      Object var6 = null; // PX-FIX
      String[] var10000 = lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.i();
      short var10002 = 8884;
      short var10003 = 28515;
      Intrinsics.checkNotNullParameter(var0, "path");
      String[] var1 = var10000;

      byte var10001;
      label26: {
         try {
            pxIOExceptionReach();
            var6 = var0;
            var10001 = 0;
            if (var1 != null) {
               break label26;
            }

            LinkOption[] var7 = new LinkOption[0];
            if (Files.exists(var0, Arrays.copyOf(var7, var7.length))) {
               return;
            }
         } catch (IOException var5) {
            throw (RuntimeException)a(var5);
         }

         try {
            pxIOExceptionReach();
            var6 = var0;
            var10001 = 0;
         } catch (IOException var4) {
            var10003 = 8883;
            short var10004 = -30309;
            throw new RuntimeException("Failed to create directory: " + var0, var4);
         }
      }

      try {
         Files.createDirectories((Path)var6);
      } catch (IOException var3) {
         var10003 = 8883;
         short var10 = -30309;
         throw new RuntimeException("Failed to create directory: " + var0, var3);
      }
   }

   @JvmStatic
   public static final void a(@NotNull Path var0, @NotNull String var1) {
      short var10001 = 8895;
      short var10002 = -28774;
      Intrinsics.checkNotNullParameter(var0, "path");
      var10001 = 8870;
      var10002 = 10332;
      Intrinsics.checkNotNullParameter(var1, "text");

      try {
         CharSequence var6 = var1;
         OpenOption[] var2 = new OpenOption[]{StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING};
         Files.writeString(var0, var6, var2);
      } catch (IOException var4) {
         short var10003 = 8893;
         short var10004 = -13998;
         throw new RuntimeException("Failed to write file: " + var0, var4);
      }
   }

   @JvmStatic
   @NotNull
   public static final String c(@NotNull Path var0) {
      short var10001 = 8895;
      short var10002 = -28774;
      Intrinsics.checkNotNullParameter(var0, "path");

      try {
         String var1 = Files.readString(var0);
         Intrinsics.checkNotNull(var1);
         return var1;
      } catch (IOException var3) {
         short var10003 = 8894;
         short var10004 = -12031;
         throw new RuntimeException("Failed to read file: " + var0, var3);
      }
   }

   @JvmStatic
   public static final void a(@NotNull Path var0, @NotNull byte[] var1) {
      short var10001 = 8895;
      short var10002 = -28774;
      Intrinsics.checkNotNullParameter(var0, "path");
      var10001 = 8886;
      var10002 = 10527;
      Intrinsics.checkNotNullParameter(var1, "bytes");

      try {
         OpenOption[] var2 = new OpenOption[]{StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING};
         Files.write(var0, var1, var2);
      } catch (IOException var4) {
         short var10003 = 8889;
         short var10004 = 25313;
         throw new RuntimeException("Failed to write file: " + var0, var4);
      }
   }

   @JvmStatic
   @NotNull
   public static final byte[] d(@NotNull Path var0) {
      short var10001 = 8895;
      short var10002 = -28774;
      Intrinsics.checkNotNullParameter(var0, "path");

      try {
         byte[] var1 = Files.readAllBytes(var0);
         Intrinsics.checkNotNull(var1);
         return var1;
      } catch (IOException var3) {
         short var10003 = 8890;
         short var10004 = -11117;
         throw new RuntimeException("Failed to read file: " + var0, var3);
      }
   }

   @JvmStatic
   @NotNull
   public static final List<Path> e(@NotNull Path var0) {
      short var10001 = 8869;
      short var10002 = -25350;
      Intrinsics.checkNotNullParameter(var0, "folder");

      try {
         var var2 = Files.list(var0);
         Throwable var3 = null;

         List var12;
         try {
            Stream var4 = (Stream)var2;
            boolean var5 = false;
            var12 = var4.toList();
         } catch (Throwable var9) {
            var3 = var9;
            throw var9;
         } finally {
            AutoCloseableKt.closeFinally(var2, var3);
         }

         Intrinsics.checkNotNull(var12);
         return var12;
      } catch (IOException var11) {
         short var10003 = 8888;
         short var10004 = 29524;
         throw new RuntimeException("Failed to list files in folder: " + var0, var11);
      }
   }

   @JvmStatic
   @NotNull
   public static final byte[] a(@NotNull BufferedImage var0) {
      short var10001 = 8868;
      short var10002 = 20196;
      Intrinsics.checkNotNullParameter(var0, "image");
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();

      try {
         RenderedImage var10000 = var0;
         var10001 = 8871;
         var10002 = -23823;
         ImageIO.write(var10000, "PNG", var1);
      } catch (IOException var3) {
         var10002 = 8881;
         short var10003 = 1901;
         throw new RuntimeException("Failed to get image bytes", var3);
      }

      byte[] var4 = var1.toByteArray();
      var10002 = 8864;
      short var9 = -22429;
      Intrinsics.checkNotNullExpressionValue(var4, "toByteArray(...)");
      return var4;
   }

   @JvmStatic
   @Nullable
   public static final Path a(@NotNull String param0, @NotNull String param1, @NotNull String param2, @NotNull String... param3) {
      String[] var4 = me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.i();
      Intrinsics.checkNotNullParameter(param0, "title");
      Intrinsics.checkNotNullParameter(param1, "filterDescription");
      Intrinsics.checkNotNullParameter(param2, "lastPath");
      Intrinsics.checkNotNullParameter(param3, "filters");
      if (lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
         return null;
      } else {
         org.lwjgl.system.MemoryStack var5 = org.lwjgl.system.MemoryStack.stackPush();
         Throwable var6 = null;

         try {
            org.lwjgl.system.MemoryStack var7 = var5;
            org.lwjgl.PointerBuffer var8 = var7.mallocPointer(param3.length);
            Intrinsics.checkNotNullExpressionValue(var8, "mallocPointer(...)");

            for (int var10 = 0; var10 < param3.length; var10++) {
               String var12 = param3[var10];
               var8.put(var7.UTF8(var12));
            }

            var8.flip();
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = true;
            String var13 = org.lwjgl.util.tinyfd.TinyFileDialogs.tinyfd_openFileDialog(param0, param2, var8, param1, false);
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = false;
            return var13 == null ? null : Path.of(var13, new String[0]);
         } catch (Throwable var14) {
            var6 = var14;
            throw var14;
         } finally {
            AutoCloseableKt.closeFinally(var5, var6);
         }
      }
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.i ()[Ljava/lang/String;
      // 003: aload 0
      // 004: sipush 8885
      // 007: sipush 6725
      // 00a: pop2
      // 00b: ldc "title"
      // 00d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 010: astore 4
      // 012: aload 1
      // 013: sipush 8865
      // 016: sipush -8750
      // 019: pop2
      // 01a: ldc "filterDescription"
      // 01c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 01f: aload 2
      // 020: sipush 8880
      // 023: sipush -1552
      // 026: pop2
      // 027: ldc "lastPath"
      // 029: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 02c: aload 3
      // 02d: sipush 8892
      // 030: sipush 26831
      // 033: pop2
      // 034: ldc "filters"
      // 036: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 039: nop
      // 03a: getstatic me/octo/client/utils/lllIIIIlIlIlllllIlIIllIIllIllllIlIIIllIIllIIllIIlIIlIlIIIIlllIIllIlllIIlIIlIlIlIIllll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Z
      // 03d: ifeq 042
      // 040: aconst_null
      // 041: areturn
      // 042: invokestatic org/lwjgl/system/MemoryStack.stackPush ()Lorg/lwjgl/system/MemoryStack;
      // 045: checkcast java/lang/AutoCloseable
      // 048: astore 5
      // 04a: aconst_null
      // 04b: astore 6
      // 04d: nop
      // 04e: aload 5
      // 050: checkcast org/lwjgl/system/MemoryStack
      // 053: astore 7
      // 055: bipush 0
      // 056: istore 8
      // 058: aload 7
      // 05a: aload 3
      // 05b: arraylength
      // 05c: invokevirtual org/lwjgl/system/MemoryStack.mallocPointer (I)Lorg/lwjgl/PointerBuffer;
      // 05f: dup
      // 060: sipush 8887
      // 063: sipush -12999
      // 066: pop2
      // 067: ldc "mallocPointer(...)"
      // 069: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 06c: astore 9
      // 06e: bipush 0
      // 06f: istore 10
      // 071: aload 3
      // 072: arraylength
      // 073: istore 11
      // 075: iload 10
      // 077: iload 11
      // 079: if_icmpge 0a6
      // 07c: aload 3
      // 07d: iload 10
      // 07f: aaload
      // 080: astore 12
      // 082: aload 9
      // 084: aload 7
      // 086: aload 12
      // 088: checkcast java/lang/CharSequence
      // 08b: invokevirtual org/lwjgl/system/MemoryStack.UTF8 (Ljava/lang/CharSequence;)Ljava/nio/ByteBuffer;
      // 08e: invokevirtual org/lwjgl/PointerBuffer.put (Ljava/nio/ByteBuffer;)Lorg/lwjgl/PointerBuffer;
      // 091: pop
      // 092: iinc 10 1
      // 095: aload 4
      // 097: ifnonnull 0b0
      // 09a: aload 4
      // 09c: ifnull 075
      // 09f: goto 0a6
      // 0a2: invokestatic me/octo/client/utils/lllIIIIlIlIlllllIlIIllIIllIllllIlIIIllIIllIIllIIlIIlIlIIIIlllIIllIlllIIlIIlIlIlIIllll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a5: athrow
      // 0a6: aload 9
      // 0a8: invokevirtual org/lwjgl/PointerBuffer.flip ()Lorg/lwjgl/system/CustomBuffer;
      // 0ab: pop
      // 0ac: bipush 1
      // 0ad: putstatic me/octo/client/utils/lllIIIIlIlIlllllIlIIllIIllIllllIlIIIllIIllIIllIIlIIlIlIIIIlllIIllIlllIIlIIlIlIlIIllll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Z
      // 0b0: aload 0
      // 0b1: checkcast java/lang/CharSequence
      // 0b4: aload 2
      // 0b5: checkcast java/lang/CharSequence
      // 0b8: aload 9
      // 0ba: aload 1
      // 0bb: checkcast java/lang/CharSequence
      // 0be: bipush 0
      // 0bf: invokestatic org/lwjgl/util/tinyfd/TinyFileDialogs.tinyfd_openFileDialog (Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lorg/lwjgl/PointerBuffer;Ljava/lang/CharSequence;Z)Ljava/lang/String;
      // 0c2: astore 10
      // 0c4: bipush 0
      // 0c5: putstatic me/octo/client/utils/lllIIIIlIlIlllllIlIIllIIllIllllIlIIIllIIllIIllIIlIIlIlIIIIlllIIllIlllIIlIIlIlIlIIllll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Z
      // 0c8: aload 10
      // 0ca: aload 4
      // 0cc: ifnonnull 0e3
      // 0cf: ifnonnull 0e1
      // 0d2: goto 0d9
      // 0d5: invokestatic me/octo/client/utils/lllIIIIlIlIlllllIlIIllIIllIllllIlIIIllIIllIIllIIlIIlIlIIIIlllIIllIlllIIlIIlIlIlIIllll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d8: athrow
      // 0d9: aconst_null
      // 0da: goto 0ea
      // 0dd: invokestatic me/octo/client/utils/lllIIIIlIlIlllllIlIIllIIllIllllIlIIIllIIllIIllIIlIIlIlIIIIlllIIllIlllIIlIIlIlIlIIllll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e0: athrow
      // 0e1: aload 10
      // 0e3: bipush 0
      // 0e4: anewarray 136
      // 0e7: invokestatic java/nio/file/Path.of (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
      // 0ea: nop
      // 0eb: astore 7
      // 0ed: aload 5
      // 0ef: aload 6
      // 0f1: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 0f4: aload 7
      // 0f6: goto 10e
      // 0f9: astore 8
      // 0fb: aload 8
      // 0fd: astore 6
      // 0ff: aload 8
      // 101: athrow
      // 102: astore 8
      // 104: aload 5
      // 106: aload 6
      // 108: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 10b: aload 8
      // 10d: athrow
      // 10e: astore 5
      // 110: goto 12c
      // 113: astore 6
      // 115: new java/lang/RuntimeException
      // 118: dup
      // 119: sipush 8882
      // 11c: sipush -29609
      // 11f: pop2
      // 120: ldc_w "Failed to open file dialog"
      // 123: aload 6
      // 125: checkcast java/lang/Throwable
      // 128: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 12b: athrow
      // 12c: aload 5
      // 12e: areturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[22];
      int var3 = 0;
      String var2 = "ê\u0081À=/\u0004@\u0006\u0011À\u0012Â9ç#ÚÄà¶r)[KÁádbZ«\u0005Ï\u0099°%7\u0019û!\u008b ø£\u009f¦å\u001d|JRÉ\u0097-Ä'\u0018mÁ¾?÷K\b~!N8,¾Â¼\u001cbì¸\u0099\u009e\u0094S@|ÁKÆ!ì×è3\u0095\u0083\n8PçyQ|\u000e\u0090\u001aÎÇ-ü,8\u0005Õ¶s\u001e\u0092\u0006+gý²\\ßh?\u000e3úaq\u0016î\u0019)'¬C\u0015º´\u009eF-\u001a\u0084,\u00179\u008aIR\u009bí\u0007Q¾ÿÂÓò©\u0004£þmß\u001584ó\u0082÷÷~,ÙLî`¢ÈwÊ°º\u009f®s\u0016ªW¡î½z7\u009dðzÎ±\u000b\u0017\u000ee}ÄÁ\u009b\u008aÔ ·ê\u0002YÉ\u008c¹C!¡ïÑMcÚ\u00ad\u0005V)z¥u£Ù\u0094Øv\u0094\u0004U`\u0093\u0017\u008a\u0088¥\u0015=\u0005'rò\u0087\u009d\u0019\u0015æy-æ91\u000fjoU\u0015øÅë¼ô0\u001eÔÕSo\u0083\u0092´qEpK\u0087\u0090p\u0006~Ê\u001a\u009aoë\u0005é\u0018\u000b\u0081á\u0003ÄP\u0096\u0004í\u009b,ë";
      int var4 = "ê\u0081À=/\u0004@\u0006\u0011À\u0012Â9ç#ÚÄà¶r)[KÁádbZ«\u0005Ï\u0099°%7\u0019û!\u008b ø£\u009f¦å\u001d|JRÉ\u0097-Ä'\u0018mÁ¾?÷K\b~!N8,¾Â¼\u001cbì¸\u0099\u009e\u0094S@|ÁKÆ!ì×è3\u0095\u0083\n8PçyQ|\u000e\u0090\u001aÎÇ-ü,8\u0005Õ¶s\u001e\u0092\u0006+gý²\\ßh?\u000e3úaq\u0016î\u0019)'¬C\u0015º´\u009eF-\u001a\u0084,\u00179\u008aIR\u009bí\u0007Q¾ÿÂÓò©\u0004£þmß\u001584ó\u0082÷÷~,ÙLî`¢ÈwÊ°º\u009f®s\u0016ªW¡î½z7\u009dðzÎ±\u000b\u0017\u000ee}ÄÁ\u009b\u008aÔ ·ê\u0002YÉ\u008c¹C!¡ïÑMcÚ\u00ad\u0005V)z¥u£Ù\u0094Øv\u0094\u0004U`\u0093\u0017\u008a\u0088¥\u0015=\u0005'rò\u0087\u009d\u0019\u0015æy-æ91\u000fjoU\u0015øÅë¼ô0\u001eÔÕSo\u0083\u0092´qEpK\u0087\u0090p\u0006~Ê\u001a\u009aoë\u0005é\u0018\u000b\u0081á\u0003ÄP\u0096\u0004í\u009b,ë"
         .length();
      char var1 = 5;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 49;
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
                     case 0 -> 19;
                     case 1 -> 72;
                     case 2 -> 102;
                     case 3 -> 59;
                     case 4 -> 115;
                     case 5 -> 82;
                     default -> 16;
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
                     b = new String[22];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lllIIIIlIlIlllllIlIIllIIllIllllIlIIIllIIllIIllIIlIIlIlIIIIlllIIllIlllIIlIIlIlIlIIllll();
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

                  var2 = "¯Ä\u007fÒ\u009c¯(½¸Q\u0002»qq(¹c\u0010\u000e\t5 /Zhá\u0014-½7²Ó\u0082º";
                  var4 = "¯Ä\u007fÒ\u009c¯(½¸Q\u0002»qq(¹c\u0010\u000e\t5 /Zhá\u0014-½7²Ó\u0082º".length();
                  var1 = 17;
                  var8 = -1;
            }

            var10000 = 64;
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
      int var2 = (var0 ^ 8885) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 114;
            case 1 -> 27;
            case 2 -> 187;
            case 3 -> 242;
            case 4 -> 239;
            case 5 -> 250;
            case 6 -> 102;
            case 7 -> 8;
            case 8 -> 79;
            case 9 -> 53;
            case 10 -> 70;
            case 11 -> 118;
            case 12 -> 50;
            case 13 -> 127;
            case 14 -> 105;
            case 15 -> 119;
            case 16 -> 115;
            case 17 -> 31;
            case 18 -> 244;
            case 19 -> 38;
            case 20 -> 220;
            case 21 -> 123;
            case 22 -> 246;
            case 23 -> 20;
            case 24 -> 166;
            case 25 -> 162;
            case 26 -> 165;
            case 27 -> 209;
            case 28 -> 109;
            case 29 -> 207;
            case 30 -> 226;
            case 31 -> 134;
            case 32 -> 197;
            case 33 -> 25;
            case 34 -> 106;
            case 35 -> 195;
            case 36 -> 71;
            case 37 -> 188;
            case 38 -> 131;
            case 39 -> 237;
            case 40 -> 153;
            case 41 -> 42;
            case 42 -> 174;
            case 43 -> 236;
            case 44 -> 151;
            case 45 -> 184;
            case 46 -> 130;
            case 47 -> 126;
            case 48 -> 44;
            case 49 -> 142;
            case 50 -> 15;
            case 51 -> 163;
            case 52 -> 116;
            case 53 -> 194;
            case 54 -> 241;
            case 55 -> 26;
            case 56 -> 67;
            case 57 -> 5;
            case 58 -> 176;
            case 59 -> 222;
            case 60 -> 245;
            case 61 -> 43;
            case 62 -> 175;
            case 63 -> 100;
            case 64 -> 149;
            case 65 -> 252;
            case 66 -> 75;
            case 67 -> 248;
            case 68 -> 18;
            case 69 -> 157;
            case 70 -> 21;
            case 71 -> 39;
            case 72 -> 111;
            case 73 -> 254;
            case 74 -> 136;
            case 75 -> 64;
            case 76 -> 215;
            case 77 -> 90;
            case 78 -> 4;
            case 79 -> 201;
            case 80 -> 145;
            case 81 -> 170;
            case 82 -> 198;
            case 83 -> 214;
            case 84 -> 45;
            case 85 -> 82;
            case 86 -> 150;
            case 87 -> 32;
            case 88 -> 193;
            case 89 -> 120;
            case 90 -> 211;
            case 91 -> 139;
            case 92 -> 192;
            case 93 -> 58;
            case 94 -> 41;
            case 95 -> 183;
            case 96 -> 128;
            case 97 -> 14;
            case 98 -> 81;
            case 99 -> 0;
            case 100 -> 113;
            case 101 -> 35;
            case 102 -> 204;
            case 103 -> 78;
            case 104 -> 99;
            case 105 -> 22;
            case 106 -> 12;
            case 107 -> 230;
            case 108 -> 87;
            case 109 -> 57;
            case 110 -> 253;
            case 111 -> 36;
            case 112 -> 156;
            case 113 -> 93;
            case 114 -> 89;
            case 115 -> 186;
            case 116 -> 164;
            case 117 -> 85;
            case 118 -> 23;
            case 119 -> 240;
            case 120 -> 52;
            case 121 -> 104;
            case 122 -> 233;
            case 123 -> 159;
            case 124 -> 217;
            case 125 -> 138;
            case 126 -> 61;
            case 127 -> 203;
            case 128 -> 140;
            case 129 -> 169;
            case 130 -> 40;
            case 131 -> 68;
            case 132 -> 228;
            case 133 -> 48;
            case 134 -> 154;
            case 135 -> 11;
            case 136 -> 19;
            case 137 -> 178;
            case 138 -> 124;
            case 139 -> 171;
            case 140 -> 189;
            case 141 -> 63;
            case 142 -> 65;
            case 143 -> 235;
            case 144 -> 125;
            case 145 -> 199;
            case 146 -> 221;
            case 147 -> 97;
            case 148 -> 191;
            case 149 -> 129;
            case 150 -> 132;
            case 151 -> 196;
            case 152 -> 55;
            case 153 -> 13;
            case 154 -> 9;
            case 155 -> 181;
            case 156 -> 210;
            case 157 -> 76;
            case 158 -> 218;
            case 159 -> 3;
            case 160 -> 108;
            case 161 -> 155;
            case 162 -> 143;
            case 163 -> 69;
            case 164 -> 92;
            case 165 -> 29;
            case 166 -> 24;
            case 167 -> 208;
            case 168 -> 202;
            case 169 -> 33;
            case 170 -> 255;
            case 171 -> 54;
            case 172 -> 1;
            case 173 -> 225;
            case 174 -> 112;
            case 175 -> 249;
            case 176 -> 213;
            case 177 -> 72;
            case 178 -> 10;
            case 179 -> 177;
            case 180 -> 223;
            case 181 -> 30;
            case 182 -> 180;
            case 183 -> 227;
            case 184 -> 16;
            case 185 -> 243;
            case 186 -> 91;
            case 187 -> 107;
            case 188 -> 238;
            case 189 -> 110;
            case 190 -> 167;
            case 191 -> 133;
            case 192 -> 158;
            case 193 -> 205;
            case 194 -> 83;
            case 195 -> 229;
            case 196 -> 122;
            case 197 -> 37;
            case 198 -> 234;
            case 199 -> 101;
            case 200 -> 137;
            case 201 -> 60;
            case 202 -> 160;
            case 203 -> 66;
            case 204 -> 200;
            case 205 -> 28;
            case 206 -> 182;
            case 207 -> 161;
            case 208 -> 73;
            case 209 -> 121;
            case 210 -> 251;
            case 211 -> 77;
            case 212 -> 146;
            case 213 -> 47;
            case 214 -> 224;
            case 215 -> 2;
            case 216 -> 49;
            case 217 -> 206;
            case 218 -> 247;
            case 219 -> 152;
            case 220 -> 185;
            case 221 -> 232;
            case 222 -> 179;
            case 223 -> 34;
            case 224 -> 172;
            case 225 -> 168;
            case 226 -> 17;
            case 227 -> 74;
            case 228 -> 147;
            case 229 -> 7;
            case 230 -> 59;
            case 231 -> 148;
            case 232 -> 212;
            case 233 -> 103;
            case 234 -> 94;
            case 235 -> 6;
            case 236 -> 173;
            case 237 -> 144;
            case 238 -> 84;
            case 239 -> 95;
            case 240 -> 62;
            case 241 -> 219;
            case 242 -> 96;
            case 243 -> 88;
            case 244 -> 141;
            case 245 -> 46;
            case 246 -> 135;
            case 247 -> 117;
            case 248 -> 51;
            case 249 -> 80;
            case 250 -> 86;
            case 251 -> 190;
            case 252 -> 56;
            case 253 -> 216;
            case 254 -> 98;
            default -> 231;
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
