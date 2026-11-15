package me.octo.client.utils;

import java.net.URI;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII {
   @NotNull
   public static llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static String[] a;
   private static String[] b;

   private llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII() {
   }

   public final boolean a(@NotNull String var1) {
      short var10001 = -32483;
      short var10002 = -19915;
      Intrinsics.checkNotNullParameter(var1, "url");

      boolean var2;
      try {
         URI var5 = new URI(var1);
         var2 = this.a(var5);
      } catch (Exception var4) {
         String var6 = var4.getMessage();
         var10002 = -32487;
         short var10003 = -11456;
         var10003 = -32485;
         short var10004 = -8362;
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Failed to parse URL: " + var1 + " - " + var6);
         var2 = false;
      }

      return var2;
   }

   public final boolean a(@NotNull URI param1) {
      String var2 = me.octo.client.utils.IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      Intrinsics.checkNotNullParameter(param1, "uri");
      String var3 = System.getProperty("os.name").toLowerCase(java.util.Locale.ROOT);
      boolean var4;
      try {
         if (java.awt.Desktop.isDesktopSupported() && java.awt.Desktop.getDesktop().isSupported(java.awt.Desktop.Action.BROWSE)) {
            try {
               java.awt.Desktop.getDesktop().browse(param1);
               var4 = true;
            } catch (Exception var5) {
               var4 = this.a(param1, var3);
            }
         } else {
            me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Desktop.browse() not supported, using platform fallback");
            var4 = this.a(param1, var3);
         }
      } catch (Exception var5) {
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Failed to open URL: " + param1 + " - " + var5.getMessage());
         var4 = false;
      }

      return var4;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/utils/IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b ()Ljava/lang/String;
      // 03: aload 1
      // 04: sipush -32510
      // 07: sipush -24771
      // 0a: pop2
      // 0b: ldc "uri"
      // 0d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 10: sipush -32484
      // 13: sipush -3492
      // 16: pop2
      // 17: ldc "os.name"
      // 19: invokestatic java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 1c: dup
      // 1d: sipush -32496
      // 20: sipush -13226
      // 23: pop2
      // 24: ldc "getProperty(...)"
      // 26: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 29: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 2c: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 2f: dup
      // 30: sipush -32505
      // 33: sipush -31145
      // 36: pop2
      // 37: ldc "toLowerCase(...)"
      // 39: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 3c: astore 3
      // 3d: astore 2
      // 3e: nop
      // 3f: nop
      // 40: aload 2
      // 41: ifnonnull 98
      // 44: invokestatic java/awt/Desktop.isDesktopSupported ()Z
      // 47: ifeq 8c
      // 4a: goto 51
      // 4d: invokestatic me/octo/client/utils/llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50: athrow
      // 51: invokestatic java/awt/Desktop.getDesktop ()Ljava/awt/Desktop;
      // 54: getstatic java/awt/Desktop$Action.BROWSE Ljava/awt/Desktop$Action;
      // 57: invokevirtual java/awt/Desktop.isSupported (Ljava/awt/Desktop$Action;)Z
      // 5a: aload 2
      // 5b: ifnonnull 78
      // 5e: goto 65
      // 61: invokestatic me/octo/client/utils/llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 64: athrow
      // 65: ifeq 8c
      // 68: goto 6f
      // 6b: invokestatic me/octo/client/utils/llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6e: athrow
      // 6f: nop
      // 70: invokestatic java/awt/Desktop.getDesktop ()Ljava/awt/Desktop;
      // 73: aload 1
      // 74: invokevirtual java/awt/Desktop.browse (Ljava/net/URI;)V
      // 77: bipush 1
      // 78: istore 4
      // 7a: goto 87
      // 7d: astore 5
      // 7f: aload 0
      // 80: aload 1
      // 81: aload 3
      // 82: invokespecial me/octo/client/utils/llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII.a (Ljava/net/URI;Ljava/lang/String;)Z
      // 85: istore 4
      // 87: iload 4
      // 89: goto 9e
      // 8c: sipush -32462
      // 8f: sipush 23025
      // 92: pop2
      // 93: ldc "Desktop.browse() not supported, using platform fallback"
      // 95: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d (Ljava/lang/String;)V
      // 98: aload 0
      // 99: aload 1
      // 9a: aload 3
      // 9b: invokespecial me/octo/client/utils/llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII.a (Ljava/net/URI;Ljava/lang/String;)Z
      // 9e: istore 4
      // a0: goto cb
      // a3: astore 5
      // a5: aload 1
      // a6: aload 5
      // a8: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // ab: sipush -32500
      // ae: sipush 16927
      // b1: pop2
      // b2: ldc "Failed to open URL: "
      // b4: dup_x2
      // b5: pop
      // b6: sipush -32492
      // b9: sipush 20029
      // bc: pop2
      // bd: ldc " - "
      // bf: swap
      // c0: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/net/URI;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001" ]
      // c5: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b (Ljava/lang/String;)V
      // c8: bipush 0
      // c9: istore 4
      // cb: iload 4
      // cd: ireturn
   }

   private final boolean a(URI param1, String param2) {
      String var3 = me.octo.client.utils.IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      try {
         String[] var4;
         if (param2.contains("win")) {
            var4 = new String[]{"rundll32", "url.dll,FileProtocolHandler", param1.toString()};
         } else if (param2.contains("mac")) {
            var4 = new String[]{"open", param1.toString()};
         } else {
            var4 = new String[]{"xdg-open", param1.toString()};
         }
         Process var5 = Runtime.getRuntime().exec(var4);
         if (!param2.contains("linux") && !param2.contains("unix")) {
            return true;
         }
         Thread.sleep(100L);
         if (var5.isAlive()) {
            return true;
         }
         if (var5.exitValue() == 0) {
            return true;
         }
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("xdg-open failed, trying common browsers...");
         return this.b(param1);
      } catch (Exception var6) {
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("Platform fallback failed: " + var6.getMessage());
         if (param2.contains("linux") || param2.contains("unix")) {
            return this.b(param1);
         }
         return false;
      }
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/utils/IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b ()Ljava/lang/String;
      // 003: astore 3
      // 004: nop
      // 005: nop
      // 006: aload 2
      // 007: checkcast java/lang/CharSequence
      // 00a: sipush -32503
      // 00d: sipush 10267
      // 010: pop2
      // 011: ldc "win"
      // 013: checkcast java/lang/CharSequence
      // 016: bipush 0
      // 017: bipush 2
      // 018: aconst_null
      // 019: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 01c: aload 3
      // 01d: ifnonnull 07a
      // 020: ifeq 064
      // 023: goto 02a
      // 026: invokestatic me/octo/client/utils/llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 029: athrow
      // 02a: bipush 3
      // 02b: anewarray 90
      // 02e: astore 5
      // 030: aload 5
      // 032: bipush 0
      // 033: sipush -32504
      // 036: sipush 1817
      // 039: pop2
      // 03a: ldc "rundll32"
      // 03c: aastore
      // 03d: aload 5
      // 03f: bipush 1
      // 040: sipush -32501
      // 043: sipush -26254
      // 046: pop2
      // 047: ldc "url.dll,FileProtocolHandler"
      // 049: aastore
      // 04a: aload 5
      // 04c: bipush 2
      // 04d: aload 1
      // 04e: invokevirtual java/net/URI.toString ()Ljava/lang/String;
      // 051: dup
      // 052: sipush -32497
      // 055: sipush -27329
      // 058: pop2
      // 059: ldc "toString(...)"
      // 05b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 05e: aastore
      // 05f: aload 5
      // 061: goto 0df
      // 064: aload 2
      // 065: checkcast java/lang/CharSequence
      // 068: sipush -32499
      // 06b: sipush -5464
      // 06e: pop2
      // 06f: ldc "mac"
      // 071: checkcast java/lang/CharSequence
      // 074: bipush 0
      // 075: bipush 2
      // 076: aconst_null
      // 077: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 07a: aload 3
      // 07b: ifnonnull 0b6
      // 07e: ifeq 0b5
      // 081: goto 088
      // 084: invokestatic me/octo/client/utils/llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 087: athrow
      // 088: bipush 2
      // 089: anewarray 90
      // 08c: astore 5
      // 08e: aload 5
      // 090: bipush 0
      // 091: sipush -32494
      // 094: sipush 11257
      // 097: pop2
      // 098: ldc "open"
      // 09a: aastore
      // 09b: aload 5
      // 09d: bipush 1
      // 09e: aload 1
      // 09f: invokevirtual java/net/URI.toString ()Ljava/lang/String;
      // 0a2: dup
      // 0a3: sipush -32481
      // 0a6: sipush 20401
      // 0a9: pop2
      // 0aa: ldc "toString(...)"
      // 0ac: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0af: aastore
      // 0b0: aload 5
      // 0b2: goto 0df
      // 0b5: bipush 2
      // 0b6: anewarray 90
      // 0b9: astore 5
      // 0bb: aload 5
      // 0bd: bipush 0
      // 0be: sipush -32493
      // 0c1: sipush 20533
      // 0c4: pop2
      // 0c5: ldc "xdg-open"
      // 0c7: aastore
      // 0c8: aload 5
      // 0ca: bipush 1
      // 0cb: aload 1
      // 0cc: invokevirtual java/net/URI.toString ()Ljava/lang/String;
      // 0cf: dup
      // 0d0: sipush -32481
      // 0d3: sipush 20401
      // 0d6: pop2
      // 0d7: ldc "toString(...)"
      // 0d9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0dc: aastore
      // 0dd: aload 5
      // 0df: astore 4
      // 0e1: invokestatic java/lang/Runtime.getRuntime ()Ljava/lang/Runtime;
      // 0e4: aload 4
      // 0e6: invokevirtual java/lang/Runtime.exec ([Ljava/lang/String;)Ljava/lang/Process;
      // 0e9: astore 5
      // 0eb: aload 2
      // 0ec: checkcast java/lang/CharSequence
      // 0ef: sipush -32498
      // 0f2: sipush -30728
      // 0f5: pop2
      // 0f6: ldc "linux"
      // 0f8: checkcast java/lang/CharSequence
      // 0fb: bipush 0
      // 0fc: bipush 2
      // 0fd: aconst_null
      // 0fe: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 101: aload 3
      // 102: ifnonnull 14c
      // 105: ifne 13a
      // 108: goto 10f
      // 10b: invokestatic me/octo/client/utils/llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10e: athrow
      // 10f: aload 2
      // 110: checkcast java/lang/CharSequence
      // 113: sipush -32508
      // 116: sipush 25515
      // 119: pop2
      // 11a: ldc "unix"
      // 11c: checkcast java/lang/CharSequence
      // 11f: bipush 0
      // 120: bipush 2
      // 121: aconst_null
      // 122: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 125: aload 3
      // 126: ifnonnull 18b
      // 129: goto 130
      // 12c: invokestatic me/octo/client/utils/llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12f: athrow
      // 130: ifeq 18a
      // 133: goto 13a
      // 136: invokestatic me/octo/client/utils/llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 139: athrow
      // 13a: ldc2_w 100
      // 13d: invokestatic java/lang/Thread.sleep (J)V
      // 140: aload 5
      // 142: invokevirtual java/lang/Process.isAlive ()Z
      // 145: goto 14c
      // 148: invokestatic me/octo/client/utils/llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14b: athrow
      // 14c: aload 3
      // 14d: ifnonnull 18b
      // 150: ifne 18a
      // 153: goto 15a
      // 156: invokestatic me/octo/client/utils/llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 159: athrow
      // 15a: aload 5
      // 15c: invokevirtual java/lang/Process.exitValue ()I
      // 15f: aload 3
      // 160: ifnonnull 18b
      // 163: goto 16a
      // 166: invokestatic me/octo/client/utils/llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 169: athrow
      // 16a: ifeq 18a
      // 16d: goto 174
      // 170: invokestatic me/octo/client/utils/llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 173: athrow
      // 174: sipush -32507
      // 177: sipush 26768
      // 17a: pop2
      // 17b: ldc "xdg-open failed, trying common browsers..."
      // 17d: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c (Ljava/lang/String;)V
      // 180: aload 0
      // 181: aload 1
      // 182: invokespecial me/octo/client/utils/llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII.b (Ljava/net/URI;)Z
      // 185: ireturn
      // 186: invokestatic me/octo/client/utils/llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 189: athrow
      // 18a: bipush 1
      // 18b: istore 4
      // 18d: goto 208
      // 190: astore 5
      // 192: aload 5
      // 194: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 197: sipush -32512
      // 19a: sipush 24330
      // 19d: pop2
      // 19e: ldc "Platform fallback failed: "
      // 1a0: swap
      // 1a1: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 1a6: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c (Ljava/lang/String;)V
      // 1a9: aload 2
      // 1aa: checkcast java/lang/CharSequence
      // 1ad: sipush -32511
      // 1b0: sipush 29402
      // 1b3: pop2
      // 1b4: ldc "linux"
      // 1b6: checkcast java/lang/CharSequence
      // 1b9: bipush 0
      // 1ba: bipush 2
      // 1bb: aconst_null
      // 1bc: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 1bf: aload 3
      // 1c0: ifnonnull 204
      // 1c3: ifne 1f8
      // 1c6: goto 1cd
      // 1c9: invokestatic me/octo/client/utils/llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cc: athrow
      // 1cd: aload 2
      // 1ce: checkcast java/lang/CharSequence
      // 1d1: sipush -32482
      // 1d4: sipush -25534
      // 1d7: pop2
      // 1d8: ldc "unix"
      // 1da: checkcast java/lang/CharSequence
      // 1dd: bipush 0
      // 1de: bipush 2
      // 1df: aconst_null
      // 1e0: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 1e3: aload 3
      // 1e4: ifnonnull 206
      // 1e7: goto 1ee
      // 1ea: invokestatic me/octo/client/utils/llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ed: athrow
      // 1ee: ifeq 205
      // 1f1: goto 1f8
      // 1f4: invokestatic me/octo/client/utils/llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f7: athrow
      // 1f8: aload 0
      // 1f9: aload 1
      // 1fa: invokespecial me/octo/client/utils/llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII.b (Ljava/net/URI;)Z
      // 1fd: goto 204
      // 200: invokestatic me/octo/client/utils/llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 203: athrow
      // 204: ireturn
      // 205: bipush 0
      // 206: istore 4
      // 208: iload 4
      // 20a: ireturn
   }

   private final boolean b(URI var1) {
      String var10000 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      String[] var4 = new String[8];
      String var2 = var10000;
      short var10002 = -32491;
      short var10003 = -871;
      var4[0] = "firefox";
      var10002 = -32489;
      var10003 = -31866;
      var4[1] = "google-chrome";
      var10002 = -32509;
      var10003 = 20483;
      var4[2] = "chromium";
      var10002 = -32502;
      var10003 = -1966;
      var4[3] = "chromium-browser";
      var10002 = -32506;
      var10003 = 29848;
      var4[4] = "brave";
      var10002 = -32495;
      var10003 = 5811;
      var4[5] = "opera";
      var10002 = -32488;
      var10003 = 18014;
      var4[6] = "vivaldi";
      var10002 = -32490;
      var10003 = -24944;
      var4[7] = "microsoft-edge";
      List var3 = CollectionsKt.listOf(var4);
      Iterator var10 = var3.iterator();

      while (true) {
         try {
            boolean var11 = var10.hasNext();
            if (var2 != null) {
               return var11;
            }

            if (!var11) {
               break;
            }
         } catch (Exception var9) {
            throw (RuntimeException)a(var9);
         }

         String var5 = (String)var10.next();

         try {
            Runtime var12 = Runtime.getRuntime();
            String[] var6 = new String[]{var5, null};
            String var28 = var1.toString();
            short var10005 = -32481;
            short var10006 = 20401;
            Intrinsics.checkNotNullExpressionValue(var28, "toString(...)");
            var6[1] = var28;
            var12.exec(var6);
            return true;
         } catch (Exception var8) {
            if (var2 == null) {
               continue;
            }
            break;
         }
      }

      short var13 = -32486;
      short var10001 = -32414;
      lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Could not find any working browser on Linux. wow ur niche mate.");
      return false;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[33];
      int var3 = 0;
      String var2 = "g\"s¯\bÖ½²\u0089ùÎ ×\u0010ÒVÝ¨x'»\u001dÂfæU£Q¯Q\u0005\u000e¸^à(\u000eRL\u0091D\u0019À6}\u0089PU\u00ad\u0003À\rÀÃ\u0084f5%\u0092\u0010\u000b\u0007\u0090úò\u0003rb2\u0007Rîê\u0007LA£?\u0097\u0094Ô\u0087n6³\u0093\u0018¨d\u0013Oºtg¼#_BX½[\u009aø;\u009bv;6TÌ=ñ¶s%´°\u0090ºÛ\u00927}\u0081¯Ù¯É\u001aºêQ\u009aþ'#8Úøt3\u0003\u001a\u0092?\u0007<G16¹èG\u0015\t\u009f¾)½§¦v&lÍ\u0083²¶\u0011RÆÇ Ý\u0019\u0004h\u0019Ç\u0003\rG¾9Ú'ÏNÄûE\u0087&5\u0007ôrJÆ\u0088\u0011Á\u0003º6\u0098\u00030¥Ì\b$Ô\u0081k*\u0081\b\u0007\u001a6«\u0085\u001bÐñ:Ïâ'âizVÑ>d\u0013§ Ï;a\u009a$Ð\u0005¼\u001d`i\u009c\u0005\u008b«FÄ«\u0010Ã¥¶¢/´ö\u0002:`\u0094rrµ\u0095Í\u00048wÍÎ*Æ\u000e°ÿ¹\u0000(\u000eU|\u0014\u0007¤9\u000f{QI7\u00adK\u0093ó\u0089m1È1¨1Ï\u001cäÅ/W ýUæ\u009eá\u00107\u008aã fø\u0081(\u007fßîñ\u00917Ð0\u001b×»5\u009ehSq¹0\u008f\u001f\u009bU0\u0081÷¥\u009c\u0012÷p`\u0098]'mp\bï\u0016×\u0086~Så§\u0003¹\u009e¸\u0005!\u0099Óùê\r\u0088EÀ¥\u0018 ©9\u0007ú\u0018ÑÆ\u0014JNÖ\u0013°à\u0007\u009e\u0012qT1jÎº\u0096Y\u009aB±";
      int var4 = "g\"s¯\bÖ½²\u0089ùÎ ×\u0010ÒVÝ¨x'»\u001dÂfæU£Q¯Q\u0005\u000e¸^à(\u000eRL\u0091D\u0019À6}\u0089PU\u00ad\u0003À\rÀÃ\u0084f5%\u0092\u0010\u000b\u0007\u0090úò\u0003rb2\u0007Rîê\u0007LA£?\u0097\u0094Ô\u0087n6³\u0093\u0018¨d\u0013Oºtg¼#_BX½[\u009aø;\u009bv;6TÌ=ñ¶s%´°\u0090ºÛ\u00927}\u0081¯Ù¯É\u001aºêQ\u009aþ'#8Úøt3\u0003\u001a\u0092?\u0007<G16¹èG\u0015\t\u009f¾)½§¦v&lÍ\u0083²¶\u0011RÆÇ Ý\u0019\u0004h\u0019Ç\u0003\rG¾9Ú'ÏNÄûE\u0087&5\u0007ôrJÆ\u0088\u0011Á\u0003º6\u0098\u00030¥Ì\b$Ô\u0081k*\u0081\b\u0007\u001a6«\u0085\u001bÐñ:Ïâ'âizVÑ>d\u0013§ Ï;a\u009a$Ð\u0005¼\u001d`i\u009c\u0005\u008b«FÄ«\u0010Ã¥¶¢/´ö\u0002:`\u0094rrµ\u0095Í\u00048wÍÎ*Æ\u000e°ÿ¹\u0000(\u000eU|\u0014\u0007¤9\u000f{QI7\u00adK\u0093ó\u0089m1È1¨1Ï\u001cäÅ/W ýUæ\u009eá\u00107\u008aã fø\u0081(\u007fßîñ\u00917Ð0\u001b×»5\u009ehSq¹0\u008f\u001f\u009bU0\u0081÷¥\u009c\u0012÷p`\u0098]'mp\bï\u0016×\u0086~Så§\u0003¹\u009e¸\u0005!\u0099Óùê\r\u0088EÀ¥\u0018 ©9\u0007ú\u0018ÑÆ\u0014JNÖ\u0013°à\u0007\u009e\u0012qT1jÎº\u0096Y\u009aB±"
         .length();
      char var1 = 4;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 126;
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
                     case 0 -> 100;
                     case 1 -> 104;
                     case 2 -> 69;
                     case 3 -> 71;
                     case 4 -> 82;
                     case 5 -> 94;
                     default -> 3;
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
                     b = new String[33];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII();
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

                  var2 = "Ñ\u0097i7iÜbJæ¯&Ïé\u0090\u000f\u009a\u009fßP*÷TvÒ\u001cEã5¤t\u0017\b-®°n\t\u0015ãGn\u009bEø8úºû\u007fã0U3úv,=\u000b\u000e";
                  var4 = "Ñ\u0097i7iÜbJæ¯&Ïé\u0090\u000f\u009a\u009fßP*÷TvÒ\u001cEã5¤t\u0017\b-®°n\t\u0015ãGn\u009bEø8úºû\u007fã0U3úv,=\u000b\u000e".length();
                  var1 = 3;
                  var8 = -1;
            }

            var10000 = 83;
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
      int var2 = (var0 ^ -32494) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 54;
            case 1 -> 173;
            case 2 -> 86;
            case 3 -> 162;
            case 4 -> 144;
            case 5 -> 44;
            case 6 -> 223;
            case 7 -> 227;
            case 8 -> 194;
            case 9 -> 108;
            case 10 -> 38;
            case 11 -> 154;
            case 12 -> 232;
            case 13 -> 237;
            case 14 -> 40;
            case 15 -> 28;
            case 16 -> 209;
            case 17 -> 58;
            case 18 -> 160;
            case 19 -> 235;
            case 20 -> 56;
            case 21 -> 172;
            case 22 -> 112;
            case 23 -> 137;
            case 24 -> 87;
            case 25 -> 181;
            case 26 -> 39;
            case 27 -> 234;
            case 28 -> 47;
            case 29 -> 225;
            case 30 -> 138;
            case 31 -> 118;
            case 32 -> 130;
            case 33 -> 191;
            case 34 -> 84;
            case 35 -> 0;
            case 36 -> 122;
            case 37 -> 25;
            case 38 -> 14;
            case 39 -> 202;
            case 40 -> 45;
            case 41 -> 34;
            case 42 -> 222;
            case 43 -> 113;
            case 44 -> 142;
            case 45 -> 4;
            case 46 -> 1;
            case 47 -> 126;
            case 48 -> 12;
            case 49 -> 81;
            case 50 -> 62;
            case 51 -> 35;
            case 52 -> 65;
            case 53 -> 91;
            case 54 -> 83;
            case 55 -> 97;
            case 56 -> 189;
            case 57 -> 218;
            case 58 -> 135;
            case 59 -> 161;
            case 60 -> 49;
            case 61 -> 117;
            case 62 -> 166;
            case 63 -> 63;
            case 64 -> 179;
            case 65 -> 82;
            case 66 -> 243;
            case 67 -> 103;
            case 68 -> 121;
            case 69 -> 233;
            case 70 -> 19;
            case 71 -> 255;
            case 72 -> 107;
            case 73 -> 17;
            case 74 -> 254;
            case 75 -> 238;
            case 76 -> 111;
            case 77 -> 185;
            case 78 -> 105;
            case 79 -> 226;
            case 80 -> 9;
            case 81 -> 53;
            case 82 -> 249;
            case 83 -> 6;
            case 84 -> 69;
            case 85 -> 159;
            case 86 -> 67;
            case 87 -> 247;
            case 88 -> 184;
            case 89 -> 50;
            case 90 -> 210;
            case 91 -> 133;
            case 92 -> 163;
            case 93 -> 136;
            case 94 -> 215;
            case 95 -> 124;
            case 96 -> 114;
            case 97 -> 80;
            case 98 -> 24;
            case 99 -> 253;
            case 100 -> 33;
            case 101 -> 8;
            case 102 -> 251;
            case 103 -> 204;
            case 104 -> 245;
            case 105 -> 214;
            case 106 -> 152;
            case 107 -> 94;
            case 108 -> 61;
            case 109 -> 123;
            case 110 -> 217;
            case 111 -> 132;
            case 112 -> 164;
            case 113 -> 221;
            case 114 -> 59;
            case 115 -> 197;
            case 116 -> 43;
            case 117 -> 176;
            case 118 -> 7;
            case 119 -> 134;
            case 120 -> 150;
            case 121 -> 213;
            case 122 -> 230;
            case 123 -> 242;
            case 124 -> 74;
            case 125 -> 231;
            case 126 -> 10;
            case 127 -> 183;
            case 128 -> 127;
            case 129 -> 79;
            case 130 -> 26;
            case 131 -> 42;
            case 132 -> 75;
            case 133 -> 239;
            case 134 -> 153;
            case 135 -> 101;
            case 136 -> 174;
            case 137 -> 240;
            case 138 -> 177;
            case 139 -> 182;
            case 140 -> 23;
            case 141 -> 148;
            case 142 -> 141;
            case 143 -> 48;
            case 144 -> 228;
            case 145 -> 165;
            case 146 -> 89;
            case 147 -> 106;
            case 148 -> 195;
            case 149 -> 212;
            case 150 -> 99;
            case 151 -> 76;
            case 152 -> 3;
            case 153 -> 139;
            case 154 -> 2;
            case 155 -> 250;
            case 156 -> 196;
            case 157 -> 20;
            case 158 -> 98;
            case 159 -> 88;
            case 160 -> 96;
            case 161 -> 193;
            case 162 -> 207;
            case 163 -> 71;
            case 164 -> 93;
            case 165 -> 155;
            case 166 -> 16;
            case 167 -> 115;
            case 168 -> 64;
            case 169 -> 66;
            case 170 -> 168;
            case 171 -> 30;
            case 172 -> 224;
            case 173 -> 156;
            case 174 -> 187;
            case 175 -> 140;
            case 176 -> 57;
            case 177 -> 252;
            case 178 -> 128;
            case 179 -> 51;
            case 180 -> 244;
            case 181 -> 190;
            case 182 -> 22;
            case 183 -> 60;
            case 184 -> 15;
            case 185 -> 131;
            case 186 -> 206;
            case 187 -> 70;
            case 188 -> 37;
            case 189 -> 151;
            case 190 -> 199;
            case 191 -> 200;
            case 192 -> 180;
            case 193 -> 90;
            case 194 -> 208;
            case 195 -> 211;
            case 196 -> 27;
            case 197 -> 198;
            case 198 -> 143;
            case 199 -> 241;
            case 200 -> 167;
            case 201 -> 157;
            case 202 -> 216;
            case 203 -> 147;
            case 204 -> 129;
            case 205 -> 186;
            case 206 -> 119;
            case 207 -> 77;
            case 208 -> 32;
            case 209 -> 246;
            case 210 -> 31;
            case 211 -> 110;
            case 212 -> 52;
            case 213 -> 203;
            case 214 -> 11;
            case 215 -> 248;
            case 216 -> 175;
            case 217 -> 170;
            case 218 -> 201;
            case 219 -> 125;
            case 220 -> 236;
            case 221 -> 158;
            case 222 -> 188;
            case 223 -> 73;
            case 224 -> 92;
            case 225 -> 102;
            case 226 -> 95;
            case 227 -> 192;
            case 228 -> 149;
            case 229 -> 109;
            case 230 -> 29;
            case 231 -> 205;
            case 232 -> 116;
            case 233 -> 78;
            case 234 -> 169;
            case 235 -> 72;
            case 236 -> 85;
            case 237 -> 229;
            case 238 -> 219;
            case 239 -> 36;
            case 240 -> 18;
            case 241 -> 100;
            case 242 -> 41;
            case 243 -> 145;
            case 244 -> 220;
            case 245 -> 146;
            case 246 -> 104;
            case 247 -> 171;
            case 248 -> 13;
            case 249 -> 5;
            case 250 -> 120;
            case 251 -> 55;
            case 252 -> 21;
            case 253 -> 46;
            case 254 -> 68;
            default -> 178;
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
