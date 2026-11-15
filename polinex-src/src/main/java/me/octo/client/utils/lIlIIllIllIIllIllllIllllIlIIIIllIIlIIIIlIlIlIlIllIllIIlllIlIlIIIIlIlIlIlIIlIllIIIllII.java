package me.octo.client.utils;

import com.mojang.blaze3d.platform.NativeImage;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.nio.IntBuffer;
import java.nio.file.Path;
import java.util.Base64;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII {
   @NotNull
   public static lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static ScheduledExecutorService lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @Nullable
   private static IntBuffer IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @Nullable
   private static int[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static String[] a;
   private static String[] b;

   private lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII() {
   }

   @JvmStatic
   @NotNull
   public static final CompletableFuture<BufferedImage> a() {
      String var10000 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      CompletableFuture var1 = new CompletableFuture();
      Minecraft var10001 = Minecraft.getInstance();
      short var10003 = -16500;
      short var10004 = -12592;
      Intrinsics.checkNotNullExpressionValue(var10001, "getInstance(...)");
      Minecraft var2 = var10001;
      String var0 = var10000;
      if (var0 == null) {
         if (!var2.isSameThread()) {
            var2.execute(lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII::b);
            return var1;
         }

         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var2, var1);
      }

      return var1;
   }

   private final void a(Minecraft param1, CompletableFuture<BufferedImage> param2) {
      String var3 = me.octo.client.utils.IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      try {
         com.mojang.blaze3d.pipeline.RenderTarget var4 = param1.getMainRenderTarget();
         kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var4, "getMainRenderTarget(...)");
         int var5 = var4.width;
         int var6 = var4.height;
         if (var5 <= 0 || var6 <= 0) {
            param2.complete((java.awt.image.BufferedImage) null);
            return;
         }

         final com.mojang.blaze3d.pipeline.RenderTarget var10000 = var4;
         final java.util.concurrent.CompletableFuture<BufferedImage> var10001 = param2;
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.schedule(new Runnable() {
            public void run() {
               me.octo.client.utils.lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII.a(var10001);
            }
         }, 8L, java.util.concurrent.TimeUnit.SECONDS);
         net.minecraft.client.Screenshot.takeScreenshot(var4, new java.util.function.Consumer<com.mojang.blaze3d.platform.NativeImage>() {
            public void accept(com.mojang.blaze3d.platform.NativeImage var1) {
               me.octo.client.utils.lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII.a(var5, var6, var10001, var1);
            }
         });
      } catch (Exception var7) {
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Screenshot capture failed:" + var7.getMessage());
         param2.complete((java.awt.image.BufferedImage) null);
      }
   }

   private final BufferedImage a(NativeImage param1, int param2, int param3) {
      String var4 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();

      try {
         int var5 = param2 * param3;
         if (var4 != null) {
            lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new int[var5];
         } else if (IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == null || IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.capacity() > var5) {
            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = org.lwjgl.BufferUtils.createIntBuffer(var5);
            lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new int[var5];
         }

         int[] var6 = param1.getPixels();
         Intrinsics.checkNotNullExpressionValue(var6, "getPixels(...)");
         BufferedImage var7 = new BufferedImage(param2, param3, 1);
         Intrinsics.checkNotNull(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.clear();
         Intrinsics.checkNotNull(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.put(var6);
         Intrinsics.checkNotNull(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.flip();
         Intrinsics.checkNotNull(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         Intrinsics.checkNotNull(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.get(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, 0, var5);

         for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var8 % param2;
            int var10 = var8 / param2;
            Intrinsics.checkNotNull(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
            int var11 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI[var8];
            int var12 = var11 & 16777215;
            if (var4 != null) {
               return var7;
            }

            var7.setRGB(var9, var10, var12);
         }

         return var7;
      } finally {
         try {
            param1.close();
         } catch (Exception var10000) {
         }
      }
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/utils/IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b ()Ljava/lang/String;
      // 003: astore 4
      // 005: nop
      // 006: iload 2
      // 007: iload 3
      // 008: imul
      // 009: istore 5
      // 00b: getstatic me/octo/client/utils/lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Ljava/nio/IntBuffer;
      // 00e: aload 4
      // 010: ifnonnull 04b
      // 013: ifnull 03f
      // 016: goto 01d
      // 019: invokestatic me/octo/client/utils/lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01c: athrow
      // 01d: getstatic me/octo/client/utils/lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Ljava/nio/IntBuffer;
      // 020: dup
      // 021: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 024: invokevirtual java/nio/IntBuffer.capacity ()I
      // 027: aload 4
      // 029: ifnonnull 050
      // 02c: goto 033
      // 02f: invokestatic me/octo/client/utils/lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 032: athrow
      // 033: iload 5
      // 035: if_icmpge 055
      // 038: goto 03f
      // 03b: invokestatic me/octo/client/utils/lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03e: athrow
      // 03f: iload 5
      // 041: invokestatic org/lwjgl/BufferUtils.createIntBuffer (I)Ljava/nio/IntBuffer;
      // 044: goto 04b
      // 047: invokestatic me/octo/client/utils/lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04a: athrow
      // 04b: putstatic me/octo/client/utils/lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Ljava/nio/IntBuffer;
      // 04e: iload 5
      // 050: newarray 10
      // 052: putstatic me/octo/client/utils/lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI [I
      // 055: aload 1
      // 056: invokevirtual com/mojang/blaze3d/platform/NativeImage.getPixels ()[I
      // 059: astore 7
      // 05b: aload 7
      // 05d: sipush -16499
      // 060: sipush 28874
      // 063: pop2
      // 064: ldc "getPixels(...)"
      // 066: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 069: aload 7
      // 06b: astore 6
      // 06d: new java/awt/image/BufferedImage
      // 070: dup
      // 071: iload 2
      // 072: iload 3
      // 073: bipush 1
      // 074: invokespecial java/awt/image/BufferedImage.<init> (III)V
      // 077: astore 7
      // 079: getstatic me/octo/client/utils/lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Ljava/nio/IntBuffer;
      // 07c: dup
      // 07d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 080: invokevirtual java/nio/IntBuffer.clear ()Ljava/nio/IntBuffer;
      // 083: pop
      // 084: getstatic me/octo/client/utils/lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Ljava/nio/IntBuffer;
      // 087: dup
      // 088: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 08b: aload 6
      // 08d: invokevirtual java/nio/IntBuffer.put ([I)Ljava/nio/IntBuffer;
      // 090: pop
      // 091: getstatic me/octo/client/utils/lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Ljava/nio/IntBuffer;
      // 094: dup
      // 095: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 098: invokevirtual java/nio/IntBuffer.flip ()Ljava/nio/IntBuffer;
      // 09b: pop
      // 09c: getstatic me/octo/client/utils/lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Ljava/nio/IntBuffer;
      // 09f: dup
      // 0a0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 0a3: getstatic me/octo/client/utils/lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI [I
      // 0a6: dup
      // 0a7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 0aa: bipush 0
      // 0ab: iload 5
      // 0ad: invokevirtual java/nio/IntBuffer.get ([III)Ljava/nio/IntBuffer;
      // 0b0: pop
      // 0b1: bipush 0
      // 0b2: istore 8
      // 0b4: iload 8
      // 0b6: iload 5
      // 0b8: if_icmpge 0f9
      // 0bb: iload 8
      // 0bd: iload 2
      // 0be: irem
      // 0bf: istore 9
      // 0c1: iload 8
      // 0c3: iload 2
      // 0c4: idiv
      // 0c5: istore 10
      // 0c7: getstatic me/octo/client/utils/lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI [I
      // 0ca: dup
      // 0cb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 0ce: iload 8
      // 0d0: iaload
      // 0d1: istore 11
      // 0d3: iload 11
      // 0d5: ldc 16777215
      // 0d7: iand
      // 0d8: istore 12
      // 0da: aload 7
      // 0dc: aload 4
      // 0de: ifnonnull 0fb
      // 0e1: iload 9
      // 0e3: iload 10
      // 0e5: iload 12
      // 0e7: invokevirtual java/awt/image/BufferedImage.setRGB (III)V
      // 0ea: iinc 8 1
      // 0ed: aload 4
      // 0ef: ifnull 0b4
      // 0f2: goto 0f9
      // 0f5: invokestatic me/octo/client/utils/lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f8: athrow
      // 0f9: aload 7
      // 0fb: astore 5
      // 0fd: nop
      // 0fe: aload 1
      // 0ff: invokevirtual com/mojang/blaze3d/platform/NativeImage.close ()V
      // 102: goto 107
      // 105: astore 6
      // 107: goto 119
      // 10a: astore 6
      // 10c: nop
      // 10d: aload 1
      // 10e: invokevirtual com/mojang/blaze3d/platform/NativeImage.close ()V
      // 111: goto 116
      // 114: astore 7
      // 116: aload 6
      // 118: athrow
      // 119: aload 5
      // 11b: areturn
   }

   @JvmStatic
   @NotNull
   public static final CompletableFuture<String> b() {
      CompletableFuture var10000 = a()
         .<String>thenApplyAsync(
            lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII::b,
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         );
      short var10002 = -16484;
      short var10003 = -17600;
      Intrinsics.checkNotNullExpressionValue(var10000, "thenApplyAsync(...)");
      return var10000;
   }

   @JvmStatic
   @Nullable
   public static final BufferedImage c() {
      BufferedImage var0;
      try {
         var0 = a().get(10L, TimeUnit.SECONDS);
      } catch (Exception var2) {
         String var10000 = var2.getMessage();
         short var10001 = -16508;
         short var10002 = 4800;
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Error taking screenshot: " + var10000);
         var0 = null;
      }

      return var0;
   }

   @JvmStatic
   @Nullable
   public static final String d() {
      BufferedImage var0 = c();
      return var0 != null ? IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0) : null;
   }

   @JvmStatic
   @JvmOverloads
   @NotNull
   public static final CompletableFuture<Boolean> a(@NotNull Path var0, @NotNull String var1, float var2) {
      short var10001 = -16510;
      short var10002 = -2669;
      Intrinsics.checkNotNullParameter(var0, "path");
      var10001 = -16502;
      var10002 = -21068;
      Intrinsics.checkNotNullParameter(var1, "format");
      CompletableFuture var10000 = a()
         .thenApplyAsync(
            lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII::b,
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         );
      var10002 = -16488;
      short var10003 = 1683;
      Intrinsics.checkNotNullExpressionValue(var10000, "thenApplyAsync(...)");
      return var10000;
   }

   public static CompletableFuture<Boolean> a(Path var0, String var1, float var2, int var3, Object var4) {
      String var5 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      if (var5 == null) {
         if ((var3 & 2) != 0) {
            var1 = "png";
         }
      }

      if ((var3 & 4) != 0) {
         var2 = 0.9F;
      }

      return a(var0, var1, var2);
   }

   private final String a(BufferedImage var1) {
      byte[] var14 = null; // PX-FIX
      Object var13 = null; // PX-FIX
      byte[] var3 = null;
      String var10000 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      double var4 = 1.0;
      float var6 = 0.8F;
      String var2 = var10000;
      int var7 = 0;

      while (var7 < 5) {
         label73: {
            int var10 = var7;
            if (var2 == null) {
               if (var7 == 0) {
                  short var15 = -16486;
                  short var16 = -4993;
                  var13 = this.a(var1, "png", 1.0F, 1.0);
                  break label73;
               }

               var10 = var7;
            }
            var6 = switch (var10) {
               case 1 -> 0.7F;
               case 2 -> 0.5F;
               case 3 -> 0.3F;
               default -> 0.2F;
            };
            int var12 = var7;
            byte var10001 = 3;
            if (var2 == null) {
               if (var7 >= 3) {
                  var4 = 0.8;
               }

               var12 = var7;
               var10001 = 4;
            }

            if (var12 >= var10001) {
               var4 = 0.6;
            }

            short var10002 = -16512;
            short var10003 = 813;
            var13 = this.a(var1, "jpg", var6, var4);
         }

         byte[] var8 = ((byte[])(Object)(((Byte)( var13))));
         if (var2 == null) {
            label53: {
               if (var8 != null) {
                  var14 = var8;
                  if (var2 != null) {
                     break label53;
                  }

                  if (var8.length <= 800000) {
                     var14 = var8;
                     break label53;
                  }
               }

               var7++;
               continue;
            }

            var3 = var14;
            break;
         }
      }

      return var3 != null ? Base64.getEncoder().encodeToString(var3) : null;
   }

   private final byte[] a(BufferedImage param1, String param2, float param3, double param4) {
      String var6 = me.octo.client.utils.IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      byte[] var14 = null;
      try {
         java.awt.image.BufferedImage var7 = param4 < 1.0 ? this.a(param1, param4) : param1;
         java.io.ByteArrayOutputStream var8 = new java.io.ByteArrayOutputStream();
         String var9 = param2.toLowerCase(java.util.Locale.ROOT);
         Intrinsics.checkNotNullExpressionValue(var9, "toLowerCase(...)");
         if (var6 != null || Intrinsics.areEqual(var9, "jpg") || Intrinsics.areEqual(var9, "jpeg")) {
            java.util.Iterator var10 = javax.imageio.ImageIO.getImageWritersByFormatName("jpg");
            if (var10.hasNext()) {
               javax.imageio.ImageWriter var11 = (javax.imageio.ImageWriter)var10.next();
               javax.imageio.ImageWriteParam var12 = var11.getDefaultWriteParam();
               var12.setCompressionMode(2);
               var12.setCompressionQuality(param3);
               javax.imageio.stream.ImageOutputStream var13 = javax.imageio.ImageIO.createImageOutputStream(var8);
               var11.setOutput(var13);
               var11.write((javax.imageio.metadata.IIOMetadata)null, new javax.imageio.IIOImage((java.awt.image.RenderedImage)var7, (java.util.List)null, (javax.imageio.metadata.IIOMetadata)null), var12);
               var11.dispose();
               var13.close();
            } else {
               javax.imageio.ImageIO.write((java.awt.image.RenderedImage)var7, "jpg", (java.io.OutputStream)var8);
            }
         } else {
            javax.imageio.ImageIO.write((java.awt.image.RenderedImage)var7, param2, (java.io.OutputStream)var8);
         }
         var14 = var8.toByteArray();
      } catch (Exception var15) {
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Error compressing image: " + var15.getMessage());
         var14 = null;
      }
      return var14;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/utils/IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b ()Ljava/lang/String;
      // 003: astore 6
      // 005: nop
      // 006: dload 4
      // 008: dconst_1
      // 009: dcmpg
      // 00a: ifge 01b
      // 00d: aload 0
      // 00e: aload 1
      // 00f: dload 4
      // 011: invokespecial me/octo/client/utils/lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII.a (Ljava/awt/image/BufferedImage;D)Ljava/awt/image/BufferedImage;
      // 014: goto 01c
      // 017: invokestatic me/octo/client/utils/lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01a: athrow
      // 01b: aload 1
      // 01c: astore 7
      // 01e: new java/io/ByteArrayOutputStream
      // 021: dup
      // 022: invokespecial java/io/ByteArrayOutputStream.<init> ()V
      // 025: astore 8
      // 027: aload 2
      // 028: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 02b: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 02e: dup
      // 02f: sipush -16503
      // 032: sipush 30530
      // 035: pop2
      // 036: ldc_w "toLowerCase(...)"
      // 039: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 03c: astore 9
      // 03e: aload 9
      // 040: aload 6
      // 042: ifnonnull 08b
      // 045: sipush -16505
      // 048: sipush -5360
      // 04b: pop2
      // 04c: ldc_w "jpg"
      // 04f: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 052: ifne 081
      // 055: goto 05c
      // 058: invokestatic me/octo/client/utils/lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05b: athrow
      // 05c: aload 9
      // 05e: sipush -16507
      // 061: sipush 30795
      // 064: pop2
      // 065: ldc_w "jpeg"
      // 068: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 06b: aload 6
      // 06d: ifnonnull 133
      // 070: goto 077
      // 073: invokestatic me/octo/client/utils/lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 076: athrow
      // 077: ifeq 11e
      // 07a: goto 081
      // 07d: invokestatic me/octo/client/utils/lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 080: athrow
      // 081: sipush -16512
      // 084: sipush 813
      // 087: pop2
      // 088: ldc_w "jpg"
      // 08b: invokestatic javax/imageio/ImageIO.getImageWritersByFormatName (Ljava/lang/String;)Ljava/util/Iterator;
      // 08e: astore 10
      // 090: aload 10
      // 092: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 097: aload 6
      // 099: ifnonnull 118
      // 09c: ifeq 0fa
      // 09f: goto 0a6
      // 0a2: invokestatic me/octo/client/utils/lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a5: athrow
      // 0a6: aload 10
      // 0a8: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0ad: checkcast javax/imageio/ImageWriter
      // 0b0: astore 11
      // 0b2: aload 11
      // 0b4: invokevirtual javax/imageio/ImageWriter.getDefaultWriteParam ()Ljavax/imageio/ImageWriteParam;
      // 0b7: astore 12
      // 0b9: aload 12
      // 0bb: bipush 2
      // 0bc: invokevirtual javax/imageio/ImageWriteParam.setCompressionMode (I)V
      // 0bf: aload 12
      // 0c1: fload 3
      // 0c2: invokevirtual javax/imageio/ImageWriteParam.setCompressionQuality (F)V
      // 0c5: aload 8
      // 0c7: invokestatic javax/imageio/ImageIO.createImageOutputStream (Ljava/lang/Object;)Ljavax/imageio/stream/ImageOutputStream;
      // 0ca: astore 13
      // 0cc: aload 11
      // 0ce: aload 13
      // 0d0: invokevirtual javax/imageio/ImageWriter.setOutput (Ljava/lang/Object;)V
      // 0d3: aload 11
      // 0d5: aconst_null
      // 0d6: new javax/imageio/IIOImage
      // 0d9: dup
      // 0da: aload 7
      // 0dc: checkcast java/awt/image/RenderedImage
      // 0df: aconst_null
      // 0e0: aconst_null
      // 0e1: invokespecial javax/imageio/IIOImage.<init> (Ljava/awt/image/RenderedImage;Ljava/util/List;Ljavax/imageio/metadata/IIOMetadata;)V
      // 0e4: aload 12
      // 0e6: invokevirtual javax/imageio/ImageWriter.write (Ljavax/imageio/metadata/IIOMetadata;Ljavax/imageio/IIOImage;Ljavax/imageio/ImageWriteParam;)V
      // 0e9: aload 11
      // 0eb: invokevirtual javax/imageio/ImageWriter.dispose ()V
      // 0ee: aload 13
      // 0f0: invokeinterface javax/imageio/stream/ImageOutputStream.close ()V 1
      // 0f5: aload 6
      // 0f7: ifnull 134
      // 0fa: aload 7
      // 0fc: checkcast java/awt/image/RenderedImage
      // 0ff: sipush -16512
      // 102: sipush 813
      // 105: pop2
      // 106: ldc_w "jpg"
      // 109: aload 8
      // 10b: checkcast java/io/OutputStream
      // 10e: invokestatic javax/imageio/ImageIO.write (Ljava/awt/image/RenderedImage;Ljava/lang/String;Ljava/io/OutputStream;)Z
      // 111: goto 118
      // 114: invokestatic me/octo/client/utils/lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 117: athrow
      // 118: pop
      // 119: aload 6
      // 11b: ifnull 134
      // 11e: aload 7
      // 120: checkcast java/awt/image/RenderedImage
      // 123: aload 2
      // 124: aload 8
      // 126: checkcast java/io/OutputStream
      // 129: invokestatic javax/imageio/ImageIO.write (Ljava/awt/image/RenderedImage;Ljava/lang/String;Ljava/io/OutputStream;)Z
      // 12c: goto 133
      // 12f: invokestatic me/octo/client/utils/lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 132: athrow
      // 133: pop
      // 134: aload 8
      // 136: invokevirtual java/io/ByteArrayOutputStream.toByteArray ()[B
      // 139: astore 7
      // 13b: goto 15b
      // 13e: astore 8
      // 140: aload 8
      // 142: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 145: sipush -16482
      // 148: sipush 11363
      // 14b: pop2
      // 14c: ldc_w "Error compressing image: "
      // 14f: swap
      // 150: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 155: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b (Ljava/lang/String;)V
      // 158: aconst_null
      // 159: astore 7
      // 15b: aload 7
      // 15d: areturn
   }

   private final BufferedImage a(BufferedImage var1, double var2) {
      int var4 = (int)(var1.getWidth() * var2);
      int var5 = (int)(var1.getHeight() * var2);
      BufferedImage var6 = new BufferedImage(var4, var5, 1);
      Graphics2D var7 = var6.createGraphics();
      var7.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
      var7.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
      var7.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      var7.drawImage(var1, 0, 0, var4, var5, null);
      var7.dispose();
      return var6;
   }

   private final void a(BufferedImage param1, Path param2, String param3, float param4) {
      try {
         java.nio.file.Path var5 = java.nio.file.Files.createDirectories(param2.getParent(), new java.nio.file.attribute.FileAttribute[0]);
         java.nio.file.Files.createDirectories(param2.getParent(), new java.nio.file.attribute.FileAttribute[0]);
         String var6 = param3.toLowerCase(java.util.Locale.ROOT);
         kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var6, "toLowerCase(...)");
         if (kotlin.jvm.internal.Intrinsics.areEqual(var6, "jpg") || kotlin.jvm.internal.Intrinsics.areEqual(var6, "jpeg")) {
            java.util.Iterator var7 = javax.imageio.ImageIO.getImageWritersByFormatName("jpg");
            if (var7.hasNext()) {
               javax.imageio.ImageWriter var8 = (javax.imageio.ImageWriter) var7.next();
               javax.imageio.ImageWriteParam var9 = var8.getDefaultWriteParam();
               var9.setCompressionMode(2);
               var9.setCompressionQuality(param4);
               try (java.io.Closeable var10 = (java.io.Closeable) java.nio.file.Files.newOutputStream(param2, new java.nio.file.OpenOption[0])) {
                  java.io.OutputStream var12 = (java.io.OutputStream) var10;
                  javax.imageio.stream.ImageOutputStream var14 = javax.imageio.ImageIO.createImageOutputStream(var12);
                  var8.setOutput(var14);
                  var8.write((javax.imageio.metadata.IIOMetadata) null, new javax.imageio.IIOImage((java.awt.image.RenderedImage) param1, (java.util.List) null, (javax.imageio.metadata.IIOMetadata) null), var9);
                  var8.dispose();
                  var14.close();
               }
               return;
            }
         }
         javax.imageio.ImageIO.write((java.awt.image.RenderedImage) param1, "jpg", param2.toFile());
         if (var5 == null) {
            return;
         }
         javax.imageio.ImageIO.write((java.awt.image.RenderedImage) param1, param3, param2.toFile());
      } catch (java.io.IOException var11) {
         return;
      }
   }

   @JvmStatic
   @JvmOverloads
   @NotNull
   public static final CompletableFuture<Boolean> a(@NotNull Path var0, @NotNull String var1) {
      short var10001 = -16501;
      short var10002 = -16270;
      Intrinsics.checkNotNullParameter(var0, "path");
      var10001 = -16483;
      var10002 = -3371;
      Intrinsics.checkNotNullParameter(var1, "format");
      return a(var0, var1, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   @NotNull
   public static final CompletableFuture<Boolean> a(@NotNull Path var0) {
      short var10001 = -16510;
      short var10002 = -2669;
      Intrinsics.checkNotNullParameter(var0, "path");
      return a(var0, null, 0.0F);
   }

   private static final Thread a(Runnable var0) {
      short var10003 = -16485;
      short var10004 = 31962;
      Thread var1 = new Thread(var0, "Screenshot-Utils");
      boolean var3 = false;
      var1.setDaemon(true);
      return var1;
   }

   private static final void b(Minecraft var0, CompletableFuture var1) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0, var1);
   }

   private static final void a(NativeImage var0, int var1, int var2, CompletableFuture var3) {
      try {
         lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII var7 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         Intrinsics.checkNotNull(var0);
         BufferedImage var4 = var7.a(var0, var1, var2);
         var3.complete(var4);
      } catch (Exception var6) {
         String var10000 = var6.getMessage();
         short var10001 = -16481;
         short var10002 = 7833;
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Screenshot processing failed: " + var10000);
         var3.complete(null);
      }
   }

   private static final void a(CompletableFuture var0) {
      var0.complete(null);
   }

   private static final void a(int var0, int var1, CompletableFuture var2, NativeImage var3) {
      short var10001 = -16506;
      short var10002 = 22747;
      Intrinsics.checkNotNullParameter(var3, "img");
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.submit(
         (java.util.concurrent.Callable<Object>)(lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII::a)
      );
   }

   private static final String b(BufferedImage var0) {
      return var0 != null ? IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0) : null;
   }

   private static final String a(Function1 var0, Object var1) {
      return (String)var0.invoke(var1);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private static final Boolean a(Path var0, String var1, float var2, BufferedImage var3) {
      String var4 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();

      label30: {
         try {
            if (var4 != null) {
               break label30;
            }

            if (var3 == null) {
               return false;
            }
         } catch (Exception var9) {
            throw (RuntimeException)a(var9);
         }

         try {
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var3, var0, var1, var2);
         } catch (Exception var8) {
            String var10000 = var8.getMessage();
            short var10001 = -16487;
            short var10002 = -19425;
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Error saving screenshot: " + var10000);
            boolean var5 = false;
            return var5;
         }
      }

      boolean var14;
      try {
         var14 = true;
      } catch (Exception var7) {
         String var11 = var7.getMessage();
         short var12 = -16487;
         short var13 = -19425;
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Error saving screenshot: " + var11);
         var14 = false;
      }

      return var14;
   }

   private static final Boolean b(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[24];
      int var3 = 0;
      String var2 = "+ó,$ÁÝújÚêÄ\u009eÁù¦%\u0004\u0016Ñ\u007f\u0094\u0010zFOÿ\u008bR\u008fm½|Æ^\u0081á®&\u000e£GtÆëDuÈÌ/\u001d\u0010Øé\u0006\u0000@'PO\u0000\u0004&%16\u001b\u0001×\u0094'=ý4/,\u000b\u0090\u000eé\u0097_!\u009c-y´C\u000e\u0091\u001f\u0000æv\u0010µ¡ÿn»\u0094µC3Ïù:fmR·\u0003Á\u0000ä\u0003«\u0014Ê\u0019ê+=\u0081\u001f,\u0082\u009b\u0019¨üÀ¢ÉH\u008e\u009c?ÂãºU\u009eí¾\u0004ÅL\u0005'\u0004êU¨8\u0018Ï/ùÖRé@p\u0016\u0087ØÀ?¬ááéÒ4\u0005{ør\"\u0003cGÓ\u0003 \u0087â\u0019Lpéê\u0085AÆ8b\nI¬Ø\u00064kZY_Üçg\f¢ß\u001e¡L\u0080T¿\u0093dâ&²Ñ*Ò}^\u0090H\u001f\u008b.{\u001dZ\u0019?ôx2§V\u0013/ö\u0085bÎ!émâòÎ¸\u0014\u000bR\u0098¶aâ\u0006\u00193\u0004>+Í\u0003~Í)\u0010öäjAâ1Ï¶S8r^\ftLa";
      int var4 = "+ó,$ÁÝújÚêÄ\u009eÁù¦%\u0004\u0016Ñ\u007f\u0094\u0010zFOÿ\u008bR\u008fm½|Æ^\u0081á®&\u000e£GtÆëDuÈÌ/\u001d\u0010Øé\u0006\u0000@'PO\u0000\u0004&%16\u001b\u0001×\u0094'=ý4/,\u000b\u0090\u000eé\u0097_!\u009c-y´C\u000e\u0091\u001f\u0000æv\u0010µ¡ÿn»\u0094µC3Ïù:fmR·\u0003Á\u0000ä\u0003«\u0014Ê\u0019ê+=\u0081\u001f,\u0082\u009b\u0019¨üÀ¢ÉH\u008e\u009c?ÂãºU\u009eí¾\u0004ÅL\u0005'\u0004êU¨8\u0018Ï/ùÖRé@p\u0016\u0087ØÀ?¬ááéÒ4\u0005{ør\"\u0003cGÓ\u0003 \u0087â\u0019Lpéê\u0085AÆ8b\nI¬Ø\u00064kZY_Üçg\f¢ß\u001e¡L\u0080T¿\u0093dâ&²Ñ*Ò}^\u0090H\u001f\u008b.{\u001dZ\u0019?ôx2§V\u0013/ö\u0085bÎ!émâòÎ¸\u0014\u000bR\u0098¶aâ\u0006\u00193\u0004>+Í\u0003~Í)\u0010öäjAâ1Ï¶S8r^\ftLa"
         .length();
      char var1 = 16;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 10;
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
                     case 0 -> 86;
                     case 1 -> 22;
                     case 2 -> 126;
                     case 3 -> 62;
                     case 4 -> 114;
                     case 5 -> 50;
                     default -> 44;
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
                     b = new String[24];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII();
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = Executors.newSingleThreadScheduledExecutor(
                        lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII::a
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

                  var2 = "ê+¤@süÇO¾/Ü\u009aÏÖ°ºs¼Ã\u0019ÑMÃÔY\u001fÔd°Îî\u0095yúªqYYã¶\u0007f°\u0012â";
                  var4 = "ê+¤@süÇO¾/Ü\u009aÏÖ°ºs¼Ã\u0019ÑMÃÔY\u001fÔd°Îî\u0095yúªqYYã¶\u0007f°\u0012â".length();
                  var1 = 19;
                  var8 = -1;
            }

            var10000 = 125;
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
      int var2 = (var0 ^ -16498) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 135;
            case 1 -> 189;
            case 2 -> 93;
            case 3 -> 136;
            case 4 -> 229;
            case 5 -> 145;
            case 6 -> 166;
            case 7 -> 79;
            case 8 -> 126;
            case 9 -> 9;
            case 10 -> 210;
            case 11 -> 147;
            case 12 -> 141;
            case 13 -> 203;
            case 14 -> 211;
            case 15 -> 17;
            case 16 -> 14;
            case 17 -> 35;
            case 18 -> 102;
            case 19 -> 255;
            case 20 -> 117;
            case 21 -> 111;
            case 22 -> 184;
            case 23 -> 46;
            case 24 -> 155;
            case 25 -> 194;
            case 26 -> 34;
            case 27 -> 223;
            case 28 -> 112;
            case 29 -> 150;
            case 30 -> 196;
            case 31 -> 74;
            case 32 -> 201;
            case 33 -> 19;
            case 34 -> 45;
            case 35 -> 73;
            case 36 -> 209;
            case 37 -> 151;
            case 38 -> 143;
            case 39 -> 212;
            case 40 -> 148;
            case 41 -> 243;
            case 42 -> 71;
            case 43 -> 167;
            case 44 -> 100;
            case 45 -> 207;
            case 46 -> 188;
            case 47 -> 228;
            case 48 -> 95;
            case 49 -> 131;
            case 50 -> 25;
            case 51 -> 39;
            case 52 -> 12;
            case 53 -> 158;
            case 54 -> 62;
            case 55 -> 213;
            case 56 -> 246;
            case 57 -> 103;
            case 58 -> 116;
            case 59 -> 138;
            case 60 -> 159;
            case 61 -> 182;
            case 62 -> 72;
            case 63 -> 216;
            case 64 -> 174;
            case 65 -> 94;
            case 66 -> 21;
            case 67 -> 187;
            case 68 -> 164;
            case 69 -> 178;
            case 70 -> 30;
            case 71 -> 58;
            case 72 -> 240;
            case 73 -> 10;
            case 74 -> 230;
            case 75 -> 5;
            case 76 -> 249;
            case 77 -> 61;
            case 78 -> 48;
            case 79 -> 125;
            case 80 -> 146;
            case 81 -> 38;
            case 82 -> 233;
            case 83 -> 22;
            case 84 -> 20;
            case 85 -> 238;
            case 86 -> 43;
            case 87 -> 2;
            case 88 -> 128;
            case 89 -> 81;
            case 90 -> 132;
            case 91 -> 110;
            case 92 -> 122;
            case 93 -> 24;
            case 94 -> 41;
            case 95 -> 107;
            case 96 -> 68;
            case 97 -> 33;
            case 98 -> 31;
            case 99 -> 245;
            case 100 -> 219;
            case 101 -> 193;
            case 102 -> 55;
            case 103 -> 144;
            case 104 -> 15;
            case 105 -> 4;
            case 106 -> 204;
            case 107 -> 137;
            case 108 -> 89;
            case 109 -> 169;
            case 110 -> 86;
            case 111 -> 180;
            case 112 -> 206;
            case 113 -> 119;
            case 114 -> 91;
            case 115 -> 57;
            case 116 -> 27;
            case 117 -> 78;
            case 118 -> 140;
            case 119 -> 198;
            case 120 -> 234;
            case 121 -> 237;
            case 122 -> 104;
            case 123 -> 90;
            case 124 -> 236;
            case 125 -> 200;
            case 126 -> 65;
            case 127 -> 127;
            case 128 -> 186;
            case 129 -> 124;
            case 130 -> 154;
            case 131 -> 69;
            case 132 -> 252;
            case 133 -> 173;
            case 134 -> 185;
            case 135 -> 85;
            case 136 -> 250;
            case 137 -> 195;
            case 138 -> 214;
            case 139 -> 98;
            case 140 -> 29;
            case 141 -> 208;
            case 142 -> 26;
            case 143 -> 183;
            case 144 -> 75;
            case 145 -> 171;
            case 146 -> 190;
            case 147 -> 251;
            case 148 -> 23;
            case 149 -> 160;
            case 150 -> 202;
            case 151 -> 113;
            case 152 -> 114;
            case 153 -> 88;
            case 154 -> 8;
            case 155 -> 51;
            case 156 -> 118;
            case 157 -> 231;
            case 158 -> 179;
            case 159 -> 16;
            case 160 -> 149;
            case 161 -> 221;
            case 162 -> 134;
            case 163 -> 80;
            case 164 -> 217;
            case 165 -> 66;
            case 166 -> 152;
            case 167 -> 11;
            case 168 -> 108;
            case 169 -> 191;
            case 170 -> 225;
            case 171 -> 7;
            case 172 -> 3;
            case 173 -> 133;
            case 174 -> 241;
            case 175 -> 87;
            case 176 -> 56;
            case 177 -> 161;
            case 178 -> 121;
            case 179 -> 13;
            case 180 -> 84;
            case 181 -> 226;
            case 182 -> 205;
            case 183 -> 83;
            case 184 -> 130;
            case 185 -> 77;
            case 186 -> 156;
            case 187 -> 18;
            case 188 -> 218;
            case 189 -> 53;
            case 190 -> 199;
            case 191 -> 120;
            case 192 -> 82;
            case 193 -> 222;
            case 194 -> 40;
            case 195 -> 168;
            case 196 -> 175;
            case 197 -> 157;
            case 198 -> 247;
            case 199 -> 52;
            case 200 -> 28;
            case 201 -> 242;
            case 202 -> 244;
            case 203 -> 123;
            case 204 -> 59;
            case 205 -> 0;
            case 206 -> 227;
            case 207 -> 177;
            case 208 -> 76;
            case 209 -> 99;
            case 210 -> 36;
            case 211 -> 224;
            case 212 -> 176;
            case 213 -> 142;
            case 214 -> 197;
            case 215 -> 109;
            case 216 -> 253;
            case 217 -> 215;
            case 218 -> 92;
            case 219 -> 129;
            case 220 -> 153;
            case 221 -> 232;
            case 222 -> 44;
            case 223 -> 248;
            case 224 -> 47;
            case 225 -> 181;
            case 226 -> 32;
            case 227 -> 254;
            case 228 -> 97;
            case 229 -> 192;
            case 230 -> 106;
            case 231 -> 220;
            case 232 -> 163;
            case 233 -> 165;
            case 234 -> 172;
            case 235 -> 170;
            case 236 -> 63;
            case 237 -> 70;
            case 238 -> 101;
            case 239 -> 67;
            case 240 -> 139;
            case 241 -> 49;
            case 242 -> 162;
            case 243 -> 54;
            case 244 -> 6;
            case 245 -> 1;
            case 246 -> 105;
            case 247 -> 115;
            case 248 -> 64;
            case 249 -> 37;
            case 250 -> 96;
            case 251 -> 42;
            case 252 -> 239;
            case 253 -> 235;
            case 254 -> 60;
            default -> 50;
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
