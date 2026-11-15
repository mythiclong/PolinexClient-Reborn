package me.octo.client.utils;

import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.contents.TranslatableContents;
import net.minecraft.util.HttpUtil.DownloadProgressListener;
import com.google.common.hash.Funnels;
import java.net.InetAddress;
import net.minecraft.network.chat.contents.KeybindContents;
import java.util.OptionalLong;
import net.minecraft.network.chat.contents.PlainTextContents;
import java.nio.charset.StandardCharsets;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;

public final class llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI {

   // PX-FIX: jar 异常表对“无抛出点”区域也登记了 IOException handler；Java 源码需 try 体可抛该异常才能保留 catch（运行时空桩不抛）。
   private static void pxIOExceptionReach() throws java.io.IOException {
   }

    public static <T> T d(Object p0, Object p1) { return null; } // PX-FIX mr3
    public static <T> T c(Object p0, Object p1) { return null; } // PX-FIX mr3
   private static int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] a;
   private static String[] b;

   private llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI() {
   }

   public static String a(Component var0) {
      try {
         if (var0 == null) {
            return "";
         }
      } catch (IllegalStateException var2) {
         throw (RuntimeException)a(var2);
      }

      StringBuilder var1 = new StringBuilder();
      a(var1, var0);
      return var1.toString();
   }

   public static boolean a() {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.f();
      StackTraceElement[] var2 = Thread.currentThread().getStackTrace();
      int var3 = var2.length;
      for (int var4 = 0; var4 < var3; var4++) {
         String var5 = var2[var4].getClassName();
         if ("net.minecraft.client.resource.server.ServerResourcePackLoader".equals(var5) || "net.minecraft.util.Downloader".equals(var5)) { return true; } }
      return false;
   }

   public static Path a(
      Path param0, URL param1, Map<String, String> param2, HashFunction param3, HashCode param4, int param5, Proxy param6, DownloadProgressListener param7
   ) {
      HttpURLConnection var9 = null;
      InputStream var10 = null;
      param7.requestStart();
      try {
         Path var11 = param4 != null ? a(param0, param4) : null;
         try {
            if (var11 != null) {
               if (a(var11, param3, param4)) {
                  param7.requestFinished(true);
                  a(var11);
                  Path var12 = var11;
                  a(var10);
                  return var12; }
               Files.deleteIfExists(var11); } }
         catch (IOException param12) {
            param7.requestFinished(false);
            throw new IllegalStateException("Failed to validate cached resource pack at " + String.valueOf(var11), param12); }
         URL var12 = a(param1, param2, param6);
         var9 = b(var12, param2, param6);
         var10 = var9.getInputStream();
         long var13 = var9.getContentLengthLong();
         OptionalLong var15 = var13 == -1L ? OptionalLong.empty() : OptionalLong.of(var13);
         param7.downloadStart(var15);
         if (var15.isPresent() && var15.getAsLong() > (long)param5) { throw new IOException(String.valueOf(var15) + " is larger than max size " + param5); }
         Files.createDirectories(param0, new java.nio.file.attribute.FileAttribute[0]);
         Path var16 = Files.createTempFile(param0, "download", ".tmp", new java.nio.file.attribute.FileAttribute[0]);
         try {
            HashCode var17 = a(param3, param5, param7, var10, var16);
            Path var18 = a(param0, var17);
            if (!a(var18, param3, var17)) { Files.move(var16, var18, new java.nio.file.CopyOption[]{StandardCopyOption.REPLACE_EXISTING}); }
            a(var18);
            param7.requestFinished(true);
            Path var19 = var18;
            Files.deleteIfExists(var16);
            a(var10);
            return var19; }
         finally {
            Files.deleteIfExists(var16); } }
      catch (Throwable param12) {
         a(var9);
         param7.requestFinished(false);
         throw new IllegalStateException("Failed to safely download resource pack from " + String.valueOf(param1), param12); }
      finally {
         a(var10); }
   }

   private static URL a(URL param0, Map<String, String> param1, Proxy param2) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/utils/llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.f ()[Lme/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
      // 003: aload 0
      // 004: astore 4
      // 006: bipush 0
      // 007: istore 5
      // 009: astore 3
      // 00a: iload 5
      // 00c: bipush 8
      // 00e: if_icmpgt 126
      // 011: aconst_null
      // 012: astore 6
      // 014: aload 4
      // 016: aload 1
      // 017: aload 2
      // 018: invokestatic me/octo/client/utils/llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.b (Ljava/net/URL;Ljava/util/Map;Ljava/net/Proxy;)Ljava/net/HttpURLConnection;
      // 01b: astore 6
      // 01d: aload 6
      // 01f: invokevirtual java/net/HttpURLConnection.getResponseCode ()I
      // 022: istore 7
      // 024: iload 7
      // 026: invokestatic me/octo/client/utils/llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.a (I)Z
      // 029: ifne 048
      // 02c: aload 4
      // 02e: astore 8
      // 030: aload 6
      // 032: aload 3
      // 033: ifnonnull 042
      // 036: ifnull 045
      // 039: goto 040
      // 03c: invokestatic me/octo/client/utils/llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03f: athrow
      // 040: aload 6
      // 042: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 045: aload 8
      // 047: areturn
      // 048: aload 6
      // 04a: sipush 6451
      // 04d: sipush -10464
      // 050: pop2
      // 051: ldc "Location"
      // 053: invokevirtual java/net/HttpURLConnection.getHeaderField (Ljava/lang/String;)Ljava/lang/String;
      // 056: astore 8
      // 058: aload 8
      // 05a: aload 3
      // 05b: ifnonnull 06a
      // 05e: ifnull 070
      // 061: goto 068
      // 064: invokestatic me/octo/client/utils/llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 067: athrow
      // 068: aload 8
      // 06a: invokevirtual java/lang/String.isBlank ()Z
      // 06d: ifeq 091
      // 070: new java/io/IOException
      // 073: dup
      // 074: aload 4
      // 076: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 079: sipush 6416
      // 07c: sipush 26712
      // 07f: pop2
      // 080: ldc_w "Resource pack redirect missing Location header for "
      // 083: swap
      // 084: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 089: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 08c: athrow
      // 08d: invokestatic me/octo/client/utils/llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 090: athrow
      // 091: aload 4
      // 093: invokevirtual java/net/URL.toURI ()Ljava/net/URI;
      // 096: aload 8
      // 098: invokevirtual java/net/URI.resolve (Ljava/lang/String;)Ljava/net/URI;
      // 09b: astore 9
      // 09d: aload 9
      // 09f: invokevirtual java/net/URI.toURL ()Ljava/net/URL;
      // 0a2: astore 4
      // 0a4: aload 3
      // 0a5: ifnonnull 122
      // 0a8: aload 6
      // 0aa: ifnull 11f
      // 0ad: goto 0b4
      // 0b0: invokestatic me/octo/client/utils/llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b3: athrow
      // 0b4: aload 6
      // 0b6: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 0b9: goto 11f
      // 0bc: invokestatic me/octo/client/utils/llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bf: athrow
      // 0c0: astore 7
      // 0c2: aload 7
      // 0c4: aload 3
      // 0c5: ifnonnull 0de
      // 0c8: instanceof java/io/IOException
      // 0cb: ifeq 0e6
      // 0ce: goto 0d5
      // 0d1: invokestatic me/octo/client/utils/llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d4: athrow
      // 0d5: aload 7
      // 0d7: goto 0de
      // 0da: invokestatic me/octo/client/utils/llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dd: athrow
      // 0de: checkcast java/io/IOException
      // 0e1: astore 8
      // 0e3: aload 8
      // 0e5: athrow
      // 0e6: new java/io/IOException
      // 0e9: dup
      // 0ea: aload 4
      // 0ec: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 0ef: sipush 6418
      // 0f2: sipush -25047
      // 0f5: pop2
      // 0f6: ldc_w "Failed while validating resource pack URL "
      // 0f9: swap
      // 0fa: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 0ff: aload 7
      // 101: invokespecial java/io/IOException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 104: athrow
      // 105: astore 10
      // 107: aload 6
      // 109: aload 3
      // 10a: ifnonnull 119
      // 10d: ifnull 11c
      // 110: goto 117
      // 113: invokestatic me/octo/client/utils/llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 116: athrow
      // 117: aload 6
      // 119: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 11c: aload 10
      // 11e: athrow
      // 11f: iinc 5 1
      // 122: aload 3
      // 123: ifnull 00a
      // 126: new java/io/IOException
      // 129: dup
      // 12a: aload 0
      // 12b: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 12e: sipush 6405
      // 131: sipush 32632
      // 134: pop2
      // 135: ldc_w "Too many redirects while downloading resource pack from "
      // 138: swap
      // 139: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 13e: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 141: athrow
      URL var4 = param0;
      int var5 = 0;
      while (true) {
         HttpURLConnection var6 = null;
         try {
            var6 = b(var4, param1, param2);
            int var7 = var6.getResponseCode();
            if (!a(var7)) {
               URL var8 = var4;
               return var8; }
            String var9 = var6.getHeaderField("Location");
            if (var9 == null || var9.isBlank()) { throw new IOException("Resource pack redirect missing Location header for " + String.valueOf(var4)); }
            try {
               var4 = var4.toURI().resolve(var9).toURL(); }
            catch (Exception var10) {
               if (var10 instanceof IOException) { throw (IOException)var10; }
               throw new IOException("Failed while validating resource pack URL " + String.valueOf(var4), var10); } }
         finally {
            if (var6 != null) { var6.disconnect(); } }
         var5++;
         if (var5 > 8) { throw new IOException("Too many redirects while downloading resource pack from " + String.valueOf(param0)); } }
   }

   private static HttpURLConnection b(URL var0, Map<String, String> var1, Proxy var2) throws IOException {
      a(var0);
      HttpURLConnection var3 = (HttpURLConnection)var0.openConnection(var2);
      var3.setInstanceFollowRedirects(false);
      var1.forEach(var3::setRequestProperty);
      return var3;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private static void a(URL var0) throws IOException {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.f();
      ServerData var2 = Minecraft.getInstance().getCurrentServer();
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var10000;

      label85: {
      String var13 = null; // PX-FIX
      Object var12 = null; // PX-FIX
      String var11 = null; // PX-FIX
      Object var10 = null; // PX-FIX
   pxClinit: {
         label75: {
            try {
               pxIOExceptionReach();
               var10 = var2;
               if (var1 != null) {
                  break label75;
               }

               if (var2 == null) {
                  break label85;
               }
            } catch (IOException var9) {
               throw (RuntimeException)a(var9);
            }

            var10 = var2;
         }

         try {
            pxIOExceptionReach();
            if (((me.octo.client.PXDyn)var10).isLan()) {
               break label85;
            }
         } catch (IOException var8) {
            throw (RuntimeException)a(var8);
         }

         String var3 = var0.getHost();

         label61: {
            try {
               pxIOExceptionReach();
               var11 = var3;
               if (var1 != null) {
                  break label61;
               }

               if (var3 == null) {
                  break pxClinit;
               }
            } catch (IOException var7) {
               throw (RuntimeException)a(var7);
            }

            var11 = var3;
         }

         label82: {
            label54: {
               try {
                  pxIOExceptionReach();
                  var12 = var11.isBlank();
                  if (var1 != null) {
                     break label54;
                  }

                  if (((Boolean)(var12))) {
                     break pxClinit;
                  }
               } catch (IOException var6) {
                  throw (RuntimeException)a(var6);
               }

               try {
                  var13 = var3;
                  if (var1 != null) {
                     break label82;
                  }

                  var12 = a(var3);
               } catch (IOException var5) {
                  throw (RuntimeException)a(var5);
               }
            }

            if (!((Boolean)var12)) {
               break pxClinit;
            }

            short var14 = 6413;
            short var10001 = 12135;
            var13 = "Blocked a suspicious resource-pack download to a local/private address.";
         }

         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.j(var13);
         short var10003 = 6408;
         short var10004 = 3078;
         throw new IOException("Blocked remote server resource pack request to local/private address: " + var3);
      }
}

      try {
         pxIOExceptionReach();
         ;
      } catch (IOException var4) {
         throw (RuntimeException)a(var4);
      }
   }

   private static boolean a(String param0) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/utils/llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.f ()[Lme/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
      // 03: aload 0
      // 04: invokestatic java/net/InetAddress.getAllByName (Ljava/lang/String;)[Ljava/net/InetAddress;
      // 07: astore 2
      // 08: astore 1
      // 09: aload 2
      // 0a: arraylength
      // 0b: istore 3
      // 0c: bipush 0
      // 0d: istore 4
      // 0f: iload 4
      // 11: iload 3
      // 12: if_icmpge 90
      // 15: aload 2
      // 16: iload 4
      // 18: aaload
      // 19: astore 5
      // 1b: aload 5
      // 1d: invokevirtual java/net/InetAddress.isAnyLocalAddress ()Z
      // 20: aload 1
      // 21: ifnonnull 91
      // 24: aload 1
      // 25: ifnonnull 88
      // 28: goto 2f
      // 2b: invokestatic me/octo/client/utils/llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: ifne 87
      // 32: goto 39
      // 35: invokestatic me/octo/client/utils/llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38: athrow
      // 39: aload 5
      // 3b: invokevirtual java/net/InetAddress.isLoopbackAddress ()Z
      // 3e: aload 1
      // 3f: ifnonnull 88
      // 42: goto 49
      // 45: invokestatic me/octo/client/utils/llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48: athrow
      // 49: ifne 87
      // 4c: goto 53
      // 4f: invokestatic me/octo/client/utils/llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 52: athrow
      // 53: aload 5
      // 55: invokevirtual java/net/InetAddress.isSiteLocalAddress ()Z
      // 58: aload 1
      // 59: ifnonnull 88
      // 5c: goto 63
      // 5f: invokestatic me/octo/client/utils/llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: ifne 87
      // 66: goto 6d
      // 69: invokestatic me/octo/client/utils/llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6c: athrow
      // 6d: aload 5
      // 6f: invokevirtual java/net/InetAddress.isLinkLocalAddress ()Z
      // 72: aload 1
      // 73: ifnonnull 88
      // 76: goto 7d
      // 79: invokestatic me/octo/client/utils/llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7c: athrow
      // 7d: ifeq 89
      // 80: goto 87
      // 83: invokestatic me/octo/client/utils/llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 86: athrow
      // 87: bipush 1
      // 88: ireturn
      // 89: iinc 4 1
      // 8c: aload 1
      // 8d: ifnull 0f
      // 90: bipush 0
      // 91: ireturn
      llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.f();
      InetAddress[] var1 = InetAddress.getAllByName(param0);
      for (int var2 = 0; var2 < var1.length; var2++) { InetAddress var3 = var1[var2]; if (var3.isAnyLocalAddress() || var3.isLoopbackAddress() || var3.isSiteLocalAddress() || var3.isLinkLocalAddress()) { return true; } }
      return false;
   }

   private static void a(StringBuilder param0, Component param1) {
      llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.f();
      net.minecraft.network.chat.ComponentContents var2 = param1.getContents();
      if (var2 instanceof PlainTextContents) {
         param0.append(((PlainTextContents)var2).text());
      } else if (var2 instanceof TranslatableContents) {
         param0.append(a((TranslatableContents)var2));
      } else if (var2 instanceof KeybindContents) {
         param0.append(((KeybindContents)var2).getName());
      } else {
         String var7 = param1.tryCollapseToString();
         if (var7 != null) {
            param0.append(var7);
         }
      }
      for (Component var5 : param1.getSiblings()) {
         a(param0, var5);
      }
   }

   private static String a(TranslatableContents param0) {
      llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.f();
      String var1 = param0.getKey();
      String var2 = param0.getFallback();
      if (b(var1)) {
         Object[] var3 = new Object[param0.getArgs().length];
         Object[] var4 = param0.getArgs();
         for (int var5 = 0; var5 < var4.length; var5++) {
            Object var6 = var4[var5];
            var3[var5] = var6 instanceof Component ? a((Component)var6) : var6;
         }
         String var7 = var2 != null ? var2 : var1;
         return Component.translatableWithFallback(var1, var7, var3).getString();
      }
      return var2 != null ? var2 : var1;
   }

   private static void a(HttpURLConnection param0) {
      llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.f();
      if (param0 == null) {
         return;
      }
      InputStream var2 = param0.getErrorStream();
      try {
         String var3 = new String(var2.readAllBytes(), StandardCharsets.UTF_8);
         if (!var3.isBlank()) {
            System.err.println("[ExploitPreventer] HTTP error body: " + var3);
         }
         var2.close();
      } catch (Exception var4) {
      } finally {
         param0.disconnect();
      }
   }

   private static void a(Path var0) {
      try {
         Files.setLastModifiedTime(var0, FileTime.from(Instant.now()));
      } catch (IOException var2) {
      }
   }

   private static boolean a(Path param0, HashFunction param1, HashCode param2) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/utils/llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.f ()[Lme/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
      // 03: astore 3
      // 04: aload 0
      // 05: aload 3
      // 06: ifnonnull 21
      // 09: bipush 0
      // 0a: anewarray 507
      // 0d: invokestatic java/nio/file/Files.exists (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
      // 10: ifne 20
      // 13: goto 1a
      // 16: invokestatic me/octo/client/utils/llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19: athrow
      // 1a: bipush 0
      // 1b: ireturn
      // 1c: invokestatic me/octo/client/utils/llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: aload 0
      // 21: aload 1
      // 22: invokestatic me/octo/client/utils/llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.a (Ljava/nio/file/Path;Lcom/google/common/hash/HashFunction;)Lcom/google/common/hash/HashCode;
      // 25: astore 4
      // 27: aload 4
      // 29: aload 2
      // 2a: invokevirtual com/google/common/hash/HashCode.equals (Ljava/lang/Object;)Z
      // 2d: ireturn
      llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.f();
      if (Files.exists(param0, new java.nio.file.LinkOption[0])) { return a(param0, param1).equals(param2); }
      return false;
   }

   private static HashCode a(Path param0, HashFunction param1) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/utils/llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.f ()[Lme/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
      // 03: aload 1
      // 04: invokeinterface com/google/common/hash/HashFunction.newHasher ()Lcom/google/common/hash/Hasher; 1
      // 09: invokestatic com/google/common/hash/Funnels.asOutputStream (Lcom/google/common/hash/PrimitiveSink;)Ljava/io/OutputStream;
      // 0c: astore 3
      // 0d: astore 2
      // 0e: aload 0
      // 0f: bipush 0
      // 10: anewarray 526
      // 13: invokestatic java/nio/file/Files.newInputStream (Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/InputStream;
      // 16: astore 4
      // 18: aload 4
      // 1a: aload 3
      // 1b: invokevirtual java/io/InputStream.transferTo (Ljava/io/OutputStream;)J
      // 1e: pop2
      // 1f: aload 4
      // 21: aload 2
      // 22: ifnonnull 2a
      // 25: ifnull 56
      // 28: aload 4
      // 2a: invokevirtual java/io/InputStream.close ()V
      // 2d: goto 56
      // 30: astore 5
      // 32: aload 4
      // 34: aload 2
      // 35: ifnonnull 44
      // 38: ifnull 53
      // 3b: goto 42
      // 3e: invokestatic me/octo/client/utils/llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: aload 4
      // 44: invokevirtual java/io/InputStream.close ()V
      // 47: goto 53
      // 4a: astore 6
      // 4c: aload 5
      // 4e: aload 6
      // 50: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 53: aload 5
      // 55: athrow
      // 56: aload 3
      // 57: aload 2
      // 58: ifnonnull 66
      // 5b: ifnull 90
      // 5e: goto 65
      // 61: invokestatic me/octo/client/utils/llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 64: athrow
      // 65: aload 3
      // 66: invokevirtual java/io/OutputStream.close ()V
      // 69: goto 90
      // 6c: astore 4
      // 6e: aload 3
      // 6f: aload 2
      // 70: ifnonnull 7e
      // 73: ifnull 8d
      // 76: goto 7d
      // 79: invokestatic me/octo/client/utils/llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7c: athrow
      // 7d: aload 3
      // 7e: invokevirtual java/io/OutputStream.close ()V
      // 81: goto 8d
      // 84: astore 5
      // 86: aload 4
      // 88: aload 5
      // 8a: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 8d: aload 4
      // 8f: athrow
      // 90: aload 1
      // 91: aload 0
      // 92: invokestatic java/nio/file/Files.readAllBytes (Ljava/nio/file/Path;)[B
      // 95: invokeinterface com/google/common/hash/HashFunction.hashBytes ([B)Lcom/google/common/hash/HashCode; 2
      // 9a: areturn
      llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.f();
      java.io.OutputStream var3 = Funnels.asOutputStream(param1.newHasher());
      try {
         InputStream var4 = Files.newInputStream(param0, new java.nio.file.OpenOption[0]);
         try {
            var4.transferTo(var3);
         } finally {
            if (var4 != null) {
               var4.close();
            }
         }
      } finally {
         if (var3 != null) {
            var3.close();
         }
      }
      return param1.hashBytes(Files.readAllBytes(param0));
   }

   private static Path a(Path var0, HashCode var1) {
      return var0.resolve(var1.toString());
   }

   private static HashCode a(HashFunction param0, int param1, DownloadProgressListener param2, InputStream param3, Path param4) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/utils/llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.f ()[Lme/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
      // 003: aload 4
      // 005: bipush 1
      // 006: anewarray 526
      // 009: dup
      // 00a: bipush 0
      // 00b: getstatic java/nio/file/StandardOpenOption.CREATE Ljava/nio/file/StandardOpenOption;
      // 00e: aastore
      // 00f: invokestatic java/nio/file/Files.newOutputStream (Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/OutputStream;
      // 012: astore 6
      // 014: astore 5
      // 016: aload 0
      // 017: invokeinterface com/google/common/hash/HashFunction.newHasher ()Lcom/google/common/hash/Hasher; 1
      // 01c: astore 7
      // 01e: sipush 8196
      // 021: newarray 8
      // 023: astore 8
      // 025: lconst_0
      // 026: lstore 9
      // 028: aload 3
      // 029: aload 8
      // 02b: invokevirtual java/io/InputStream.read ([B)I
      // 02e: istore 11
      // 030: iload 11
      // 032: ifge 063
      // 035: aload 7
      // 037: invokeinterface com/google/common/hash/Hasher.hash ()Lcom/google/common/hash/HashCode; 1
      // 03c: astore 12
      // 03e: aload 6
      // 040: aload 5
      // 042: ifnonnull 0d1
      // 045: aload 5
      // 047: ifnonnull 05d
      // 04a: goto 051
      // 04d: invokestatic me/octo/client/utils/llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 050: athrow
      // 051: ifnull 060
      // 054: goto 05b
      // 057: invokestatic me/octo/client/utils/llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05a: athrow
      // 05b: aload 6
      // 05d: invokevirtual java/io/OutputStream.close ()V
      // 060: aload 12
      // 062: areturn
      // 063: lload 9
      // 065: iload 11
      // 067: i2l
      // 068: ladd
      // 069: lstore 9
      // 06b: aload 2
      // 06c: lload 9
      // 06e: invokeinterface net/minecraft/util/HttpUtil$DownloadProgressListener.downloadedBytes (J)V 3
      // 073: lload 9
      // 075: iload 1
      // 076: i2l
      // 077: lcmp
      // 078: aload 5
      // 07a: ifnonnull 0b6
      // 07d: ifle 0b3
      // 080: goto 087
      // 083: invokestatic me/octo/client/utils/llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 086: athrow
      // 087: new java/io/IOException
      // 08a: dup
      // 08b: lload 9
      // 08d: iload 1
      // 08e: istore 13
      // 090: lstore 14
      // 092: sipush 6411
      // 095: sipush 26127
      // 098: pop2
      // 099: ldc_w "Resource pack exceeded max size: "
      // 09c: lload 14
      // 09e: sipush 6429
      // 0a1: sipush -8118
      // 0a4: pop2
      // 0a5: ldc_w " > "
      // 0a8: iload 13
      // 0aa: invokedynamic makeConcatWithConstants (Ljava/lang/String;JLjava/lang/String;I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001" ]
      // 0af: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 0b2: athrow
      // 0b3: invokestatic java/lang/Thread.interrupted ()Z
      // 0b6: ifeq 0cf
      // 0b9: new java/io/IOException
      // 0bc: dup
      // 0bd: sipush 6406
      // 0c0: sipush -10360
      // 0c3: pop2
      // 0c4: ldc_w "Resource pack download interrupted"
      // 0c7: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 0ca: athrow
      // 0cb: invokestatic me/octo/client/utils/llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ce: athrow
      // 0cf: aload 6
      // 0d1: aload 8
      // 0d3: bipush 0
      // 0d4: iload 11
      // 0d6: invokevirtual java/io/OutputStream.write ([BII)V
      // 0d9: aload 7
      // 0db: aload 8
      // 0dd: bipush 0
      // 0de: iload 11
      // 0e0: invokeinterface com/google/common/hash/Hasher.putBytes ([BII)Lcom/google/common/hash/Hasher; 4
      // 0e5: pop
      // 0e6: goto 028
      // 0e9: astore 7
      // 0eb: aload 6
      // 0ed: aload 5
      // 0ef: ifnonnull 0fe
      // 0f2: ifnull 10d
      // 0f5: goto 0fc
      // 0f8: invokestatic me/octo/client/utils/llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fb: athrow
      // 0fc: aload 6
      // 0fe: invokevirtual java/io/OutputStream.close ()V
      // 101: goto 10d
      // 104: astore 8
      // 106: aload 7
      // 108: aload 8
      // 10a: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 10d: aload 7
      // 10f: athrow
      llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.f();
      java.io.OutputStream var6 = Files.newOutputStream(param4, new java.nio.file.OpenOption[]{StandardOpenOption.CREATE});
      com.google.common.hash.Hasher var7 = param0.newHasher();
      byte[] var8 = new byte[8196];
      long var9 = 0L;
      HashCode var12 = null;
      try {
         while (true) {
            int var11 = param3.read(var8);
            if (var11 < 0) {
               var12 = var7.hash();
               break;
            }
            var9 += (long)var11;
            param2.downloadedBytes(var9);
            if (var9 > (long)param1) {
               throw new IOException("Resource pack exceeded max size: " + var9 + " > " + param1);
            }
            if (Thread.interrupted()) {
               throw new IOException("Resource pack download interrupted");
            }
            var6.write(var8, 0, var11);
            var7.putBytes(var8, 0, var11);
         }
      } finally {
         if (var6 != null) {
            var6.close();
         }
      }
      return var12;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private static void a(InputStream var0) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.f();

      InputStream var10000;
      label30: {
         try {
            pxIOExceptionReach();
            var10000 = var0;
            if (var1 != null) {
               break label30;
            }

            if (var0 == null) {
               return;
            }
         } catch (IOException var5) {
            throw (RuntimeException)a(var5);
         }

         try {
            pxIOExceptionReach();
            var10000 = var0;
         } catch (IOException var4) {
            return;
         }
      }

      try {
         var10000.close();
      } catch (IOException var3) {
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[49];
      int var3 = 0;
      String var2 = "\bÈC\bäOtA©\u0006\u00ad\u0081@ò\u0018>ðµ/Ç.ù¬åÅÏ\u0084\u0007@&'¼\u0090ä\rß¡\u0001Lpú\u0011\u001c^OVTn<ü9Uy\u0088Å\u0014XÁxæ\u008e#\u0089tÏÞ\u008aç¯,=©\u00143h\u000fêCÞ»ý³´LX`I9wT\"v\u009aç¤\u008fQ\u0005\u0093ÛI1¿-\u007f\u001c\u009dT\u0089Ã\u009em\u007fâè\u0002ª.\u001a\u0092\u0017\u0096²\u0081üL´\u009c\u0086å\u0086»\u00166?ÀD\u008dá\u0081\u009e¸\u0003#ÌtÕ8\u008d\r'À>H´5hvµóyCÂ3vr0\u001euÿP/ÂÉë?\u0097\u008e\u000fw,¸\u0004ú\u0099kûoÄEc\u009a\u0096\u0097ÄÃÈ\u0012¼°T\u0016V{Íh4G;\u0084\u0095\u0006¿\u0091²\u0005VÜ%G\u001a*týüh¥D\u001b\u009eÈ¶æìÑdö¿o\u0084ÓÀ\u0018\u0005Ç¶÷\u008c}qN9ä\u0088¨d\u0016\u0018\u0003¹ÅZÇ5\u0003v¡_\nÅµqù'î\u001f>\u009a»\u000f\u0088ÅøÀgC(OÃ¼5â0#\u000b\t²õ%`\r|·¸Þ\u0005~4GVÒ\u0005\u0095%f»{\n@Ýââ\u0000\u001enÕ¸È\u0004¨A\u0006T8TS®>!NÌtý?\b¤mH\u0005±\u0088¼Ð1\u0010_ì_ª]Òr?\\¾ý*W\u0085@Ôd-ØÏ5\u0080ùÜæ9U|\u0005GUHt\u0094j\b\u009e\u001aÙYÕ+|\n\nêG©èìBøà)n\"\u001eE=øÔ#d´Dº;Q\u008dCZÄA\u0082ÆP\u001eeI¸\u0095<¸I%\u0087}©¯g\nÝæ\u000f½tÉ\bù\u0014_\t²¦\u0012\u001d\u0004'äå×\u0011#£LH\u001cø\u0011\u00adG\u008e?\n\u0090iÁó)\f0\u0001?ytià»cÊ¾¥G\u0099\\Ãÿ\u008aYuKÀøÐU¸Gê\u0012åÔ\u0096§o\u0012K\u00989`\u001bò³\u009bZlMgÀ\u0007´ê\u008c³\u0091°]\u009c¢.\u0095êðõ²©CMÆ~é?â4\u008bbím\u001a\u0011/´fjv$À¢Å?¸:Ù8È\u001aÐ\u0012zÒ{{r\rIÓ\u001fæ\u008a·\u0098»dbK\t¢\u009c\u0005¤4k\u0004\u001a64Å\u001d8\u0085E¡$zlçªÒÍ\u001bL¡\u008fLÖé«T·¸ýw\u0085u\u009aÀ@\u0016i\u0017\u0012ß7<\u0099ÀK#\"ò\u001f\u009aÄ\u0095ÍÿÌiæ FÌËi\rß\u0007ß\u0080\u0086Äw%\u0096\u0005\u0081ýä&8Q\u008bJØ\u009d¢\u000eðw/P_EµyÖ\u0089Iå\u0092\u001b¤\u008d k\u000fÐ 8\t\f%w0drÝ\u008dyèñÜZ\u009dëÎe`\rçÚ!Û\u0016\u0085\u0092Ãn\u0086\u001d\u0018\u008f°÷ü\u0097uI\u0091ÍCØ\u0082\u001e^ÓxÙ®y\u0011¯\u0096\f \u0010\bòÕ\u0081F\u0012*I\f\u009d·\u0013T~:¬\u0011hÃ7A4Yá5Y\u009dühè%ÎzÈ\bF\u0006«!ûÂÈ\\\fé\u0095Ùè¢lJ\u0091aI\u0082ý\u0019Ü\u008aYÃAñý\u009d\u0001ß?¨gÈn\u0093\u0096Áq\u0099l÷\rJB\u0005í\u0012³\u0010\u000e\r{HÁvõ,>n\u008cöÚ\u0015C\bÕ\u008c\u0089\u0084Qxù¬\u0006\u0088w\r¥\u009f¬\tÁ\u0085\u0087\u000f\r\u0093IFC\u000fÒOî\u0088!pà)Úp\u0016{T\u0010\u0087+^±¹á\ru\u000e»m8¯YíI±ë?£&\u0012Ç§:\u000b°\u0093@uÎï$û'ê\u008dm\u0013%²\u0090ý\u0004[\u000b\u009c\u0012\u009d\u0093Úßñ´\u0019¾ô\t\u0083×j&\u0080âêý\u001f\u0010êÕ\u0089ÎÃ4U\u008dã\u0005J\u0000ë\u001cÍà\ti%Ú½áÕSãK";
      int var4 = "\bÈC\bäOtA©\u0006\u00ad\u0081@ò\u0018>ðµ/Ç.ù¬åÅÏ\u0084\u0007@&'¼\u0090ä\rß¡\u0001Lpú\u0011\u001c^OVTn<ü9Uy\u0088Å\u0014XÁxæ\u008e#\u0089tÏÞ\u008aç¯,=©\u00143h\u000fêCÞ»ý³´LX`I9wT\"v\u009aç¤\u008fQ\u0005\u0093ÛI1¿-\u007f\u001c\u009dT\u0089Ã\u009em\u007fâè\u0002ª.\u001a\u0092\u0017\u0096²\u0081üL´\u009c\u0086å\u0086»\u00166?ÀD\u008dá\u0081\u009e¸\u0003#ÌtÕ8\u008d\r'À>H´5hvµóyCÂ3vr0\u001euÿP/ÂÉë?\u0097\u008e\u000fw,¸\u0004ú\u0099kûoÄEc\u009a\u0096\u0097ÄÃÈ\u0012¼°T\u0016V{Íh4G;\u0084\u0095\u0006¿\u0091²\u0005VÜ%G\u001a*týüh¥D\u001b\u009eÈ¶æìÑdö¿o\u0084ÓÀ\u0018\u0005Ç¶÷\u008c}qN9ä\u0088¨d\u0016\u0018\u0003¹ÅZÇ5\u0003v¡_\nÅµqù'î\u001f>\u009a»\u000f\u0088ÅøÀgC(OÃ¼5â0#\u000b\t²õ%`\r|·¸Þ\u0005~4GVÒ\u0005\u0095%f»{\n@Ýââ\u0000\u001enÕ¸È\u0004¨A\u0006T8TS®>!NÌtý?\b¤mH\u0005±\u0088¼Ð1\u0010_ì_ª]Òr?\\¾ý*W\u0085@Ôd-ØÏ5\u0080ùÜæ9U|\u0005GUHt\u0094j\b\u009e\u001aÙYÕ+|\n\nêG©èìBøà)n\"\u001eE=øÔ#d´Dº;Q\u008dCZÄA\u0082ÆP\u001eeI¸\u0095<¸I%\u0087}©¯g\nÝæ\u000f½tÉ\bù\u0014_\t²¦\u0012\u001d\u0004'äå×\u0011#£LH\u001cø\u0011\u00adG\u008e?\n\u0090iÁó)\f0\u0001?ytià»cÊ¾¥G\u0099\\Ãÿ\u008aYuKÀøÐU¸Gê\u0012åÔ\u0096§o\u0012K\u00989`\u001bò³\u009bZlMgÀ\u0007´ê\u008c³\u0091°]\u009c¢.\u0095êðõ²©CMÆ~é?â4\u008bbím\u001a\u0011/´fjv$À¢Å?¸:Ù8È\u001aÐ\u0012zÒ{{r\rIÓ\u001fæ\u008a·\u0098»dbK\t¢\u009c\u0005¤4k\u0004\u001a64Å\u001d8\u0085E¡$zlçªÒÍ\u001bL¡\u008fLÖé«T·¸ýw\u0085u\u009aÀ@\u0016i\u0017\u0012ß7<\u0099ÀK#\"ò\u001f\u009aÄ\u0095ÍÿÌiæ FÌËi\rß\u0007ß\u0080\u0086Äw%\u0096\u0005\u0081ýä&8Q\u008bJØ\u009d¢\u000eðw/P_EµyÖ\u0089Iå\u0092\u001b¤\u008d k\u000fÐ 8\t\f%w0drÝ\u008dyèñÜZ\u009dëÎe`\rçÚ!Û\u0016\u0085\u0092Ãn\u0086\u001d\u0018\u008f°÷ü\u0097uI\u0091ÍCØ\u0082\u001e^ÓxÙ®y\u0011¯\u0096\f \u0010\bòÕ\u0081F\u0012*I\f\u009d·\u0013T~:¬\u0011hÃ7A4Yá5Y\u009dühè%ÎzÈ\bF\u0006«!ûÂÈ\\\fé\u0095Ùè¢lJ\u0091aI\u0082ý\u0019Ü\u008aYÃAñý\u009d\u0001ß?¨gÈn\u0093\u0096Áq\u0099l÷\rJB\u0005í\u0012³\u0010\u000e\r{HÁvõ,>n\u008cöÚ\u0015C\bÕ\u008c\u0089\u0084Qxù¬\u0006\u0088w\r¥\u009f¬\tÁ\u0085\u0087\u000f\r\u0093IFC\u000fÒOî\u0088!pà)Úp\u0016{T\u0010\u0087+^±¹á\ru\u000e»m8¯YíI±ë?£&\u0012Ç§:\u000b°\u0093@uÎï$û'ê\u008dm\u0013%²\u0090ý\u0004[\u000b\u009c\u0012\u009d\u0093Úßñ´\u0019¾ô\t\u0083×j&\u0080âêý\u001f\u0010êÕ\u0089ÎÃ4U\u008dã\u0005J\u0000ë\u001cÍà\ti%Ú½áÕSãK"
         .length();
      char var1 = '=';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 95;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var25 = var10001.toCharArray();
               int var10004 = var25.length;
               int var6 = 0;
               byte var28 = var10000;
               var21 = var25;
               int var15 = var10004;
               byte var63;
               char[] var97;
               int var10006;
               if (var10004 <= 1) {
                  var97 = var25;
                  var63 = var10000;
                  var10006 = var6;
               } else {
                  var28 = var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var97 = var25;
                  var63 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var97[var10006] = (char)(var97[var10006] ^ var63 ^ switch (var6 % 7) {
                     case 0 -> 51;
                     case 1 -> 16;
                     case 2 -> 71;
                     case 3 -> 64;
                     case 4 -> 71;
                     case 5 -> 112;
                     default -> 26;
                  });
                  var6++;
                  if (var28 == 0) {
                     var10006 = var28;
                     var97 = var21;
                     var63 = var28;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var97 = var21;
                     var63 = var28;
                     var10006 = var6;
                  }
               }
            }

            String var30 = new String(var21).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var30;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[49];
                     String[] var10 = new String[30];
                     short var31 = 6448;
                     short var67 = 26747;
                     var10[0] = "advancements.";
                     short var32 = 6461;
                     var67 = 16725;
                     var10[1] = "argument.";
                     short var33 = 6410;
                     var67 = -10487;
                     var10[2] = "biome.minecraft.";
                     short var34 = 6456;
                     var67 = -4902;
                     var10[3] = "block.minecraft.";
                     short var35 = 6424;
                     var67 = 29192;
                     var10[4] = "book.";
                     short var36 = 6437;
                     var67 = 6073;
                     var10[5] = "chat.";
                     short var37 = 6459;
                     var67 = -11982;
                     var10[6] = "commands.";
                     short var38 = 6407;
                     var67 = 24027;
                     var10[7] = "container.";
                     short var39 = 6450;
                     var67 = 6717;
                     var10[8] = "death.";
                     short var40 = 6458;
                     var67 = 22796;
                     var10[9] = "demo.";
                     short var41 = 6462;
                     var67 = -8128;
                     var10[10] = "disconnect.";
                     short var42 = 6453;
                     var67 = -28151;
                     var10[11] = "effect.minecraft.";
                     short var43 = 6409;
                     var67 = 556;
                     var10[12] = "enchantment.minecraft.";
                     short var44 = 6403;
                     var67 = -18336;
                     var10[13] = "entity.minecraft.";
                     short var45 = 6430;
                     var67 = 22068;
                     var10[14] = "gamerule.";
                     short var46 = 6415;
                     var67 = 6687;
                     var10[15] = "gui.";
                     short var47 = 6460;
                     var67 = 9608;
                     var10[16] = "item.minecraft.";
                     short var48 = 6401;
                     var67 = -30846;
                     var10[17] = "itemGroup.";
                     short var49 = 6457;
                     var67 = 8619;
                     var10[18] = "language.";
                     short var50 = 6423;
                     var67 = -30165;
                     var10[19] = "menu.";
                     short var51 = 6402;
                     var67 = 8985;
                     var10[20] = "multiplayer.";
                     short var52 = 6400;
                     var67 = 811;
                     var10[21] = "narrator.";
                     short var53 = 6452;
                     var67 = 11320;
                     var10[22] = "options.";
                     short var54 = 6425;
                     var67 = 28342;
                     var10[23] = "pack.";
                     short var55 = 6417;
                     var67 = -15084;
                     var10[24] = "resourcePack.";
                     short var56 = 6455;
                     var67 = 2882;
                     var10[25] = "selectWorld.";
                     short var57 = 6419;
                     var67 = 17555;
                     var10[26] = "sign.";
                     short var58 = 6431;
                     var67 = -17580;
                     var10[27] = "stat.minecraft.";
                     short var59 = 6427;
                     var67 = -24038;
                     var10[28] = "subtitles.";
                     short var60 = 6449;
                     var67 = 30773;
                     var10[29] = "team.";
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var10;
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

                  var2 = "Ñ¦³\u001d\u001a\u0005ÃI\u001aW¢";
                  var4 = "Ñ¦³\u001d\u001a\u0005ÃI\u001aW¢".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 40;
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
      int var2 = (var0 ^ 6421) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 41;
            case 1 -> 253;
            case 2 -> 47;
            case 3 -> 38;
            case 4 -> 168;
            case 5 -> 204;
            case 6 -> 156;
            case 7 -> 11;
            case 8 -> 191;
            case 9 -> 210;
            case 10 -> 70;
            case 11 -> 231;
            case 12 -> 90;
            case 13 -> 105;
            case 14 -> 145;
            case 15 -> 97;
            case 16 -> 167;
            case 17 -> 2;
            case 18 -> 84;
            case 19 -> 108;
            case 20 -> 28;
            case 21 -> 75;
            case 22 -> 119;
            case 23 -> 5;
            case 24 -> 203;
            case 25 -> 198;
            case 26 -> 16;
            case 27 -> 114;
            case 28 -> 80;
            case 29 -> 166;
            case 30 -> 225;
            case 31 -> 4;
            case 32 -> 24;
            case 33 -> 150;
            case 34 -> 37;
            case 35 -> 249;
            case 36 -> 1;
            case 37 -> 224;
            case 38 -> 131;
            case 39 -> 236;
            case 40 -> 45;
            case 41 -> 51;
            case 42 -> 243;
            case 43 -> 221;
            case 44 -> 187;
            case 45 -> 206;
            case 46 -> 125;
            case 47 -> 182;
            case 48 -> 195;
            case 49 -> 22;
            case 50 -> 234;
            case 51 -> 165;
            case 52 -> 233;
            case 53 -> 63;
            case 54 -> 58;
            case 55 -> 247;
            case 56 -> 12;
            case 57 -> 117;
            case 58 -> 74;
            case 59 -> 130;
            case 60 -> 192;
            case 61 -> 240;
            case 62 -> 9;
            case 63 -> 152;
            case 64 -> 72;
            case 65 -> 127;
            case 66 -> 207;
            case 67 -> 49;
            case 68 -> 212;
            case 69 -> 73;
            case 70 -> 223;
            case 71 -> 21;
            case 72 -> 252;
            case 73 -> 147;
            case 74 -> 8;
            case 75 -> 219;
            case 76 -> 244;
            case 77 -> 102;
            case 78 -> 20;
            case 79 -> 54;
            case 80 -> 241;
            case 81 -> 157;
            case 82 -> 85;
            case 83 -> 237;
            case 84 -> 15;
            case 85 -> 226;
            case 86 -> 197;
            case 87 -> 201;
            case 88 -> 93;
            case 89 -> 188;
            case 90 -> 161;
            case 91 -> 199;
            case 92 -> 232;
            case 93 -> 71;
            case 94 -> 33;
            case 95 -> 158;
            case 96 -> 61;
            case 97 -> 242;
            case 98 -> 89;
            case 99 -> 255;
            case 100 -> 3;
            case 101 -> 148;
            case 102 -> 68;
            case 103 -> 18;
            case 104 -> 98;
            case 105 -> 213;
            case 106 -> 205;
            case 107 -> 79;
            case 108 -> 178;
            case 109 -> 6;
            case 110 -> 200;
            case 111 -> 107;
            case 112 -> 211;
            case 113 -> 50;
            case 114 -> 104;
            case 115 -> 67;
            case 116 -> 218;
            case 117 -> 96;
            case 118 -> 14;
            case 119 -> 52;
            case 120 -> 113;
            case 121 -> 171;
            case 122 -> 60;
            case 123 -> 53;
            case 124 -> 135;
            case 125 -> 228;
            case 126 -> 59;
            case 127 -> 160;
            case 128 -> 126;
            case 129 -> 64;
            case 130 -> 230;
            case 131 -> 122;
            case 132 -> 103;
            case 133 -> 76;
            case 134 -> 246;
            case 135 -> 138;
            case 136 -> 229;
            case 137 -> 29;
            case 138 -> 83;
            case 139 -> 62;
            case 140 -> 154;
            case 141 -> 23;
            case 142 -> 129;
            case 143 -> 66;
            case 144 -> 86;
            case 145 -> 0;
            case 146 -> 179;
            case 147 -> 208;
            case 148 -> 202;
            case 149 -> 163;
            case 150 -> 173;
            case 151 -> 216;
            case 152 -> 141;
            case 153 -> 184;
            case 154 -> 78;
            case 155 -> 139;
            case 156 -> 149;
            case 157 -> 151;
            case 158 -> 186;
            case 159 -> 190;
            case 160 -> 36;
            case 161 -> 250;
            case 162 -> 238;
            case 163 -> 48;
            case 164 -> 214;
            case 165 -> 35;
            case 166 -> 164;
            case 167 -> 25;
            case 168 -> 44;
            case 169 -> 77;
            case 170 -> 181;
            case 171 -> 227;
            case 172 -> 82;
            case 173 -> 137;
            case 174 -> 106;
            case 175 -> 128;
            case 176 -> 183;
            case 177 -> 170;
            case 178 -> 56;
            case 179 -> 34;
            case 180 -> 27;
            case 181 -> 115;
            case 182 -> 10;
            case 183 -> 42;
            case 184 -> 95;
            case 185 -> 43;
            case 186 -> 31;
            case 187 -> 26;
            case 188 -> 185;
            case 189 -> 120;
            case 190 -> 177;
            case 191 -> 169;
            case 192 -> 124;
            case 193 -> 69;
            case 194 -> 17;
            case 195 -> 30;
            case 196 -> 162;
            case 197 -> 217;
            case 198 -> 55;
            case 199 -> 133;
            case 200 -> 65;
            case 201 -> 193;
            case 202 -> 94;
            case 203 -> 116;
            case 204 -> 194;
            case 205 -> 81;
            case 206 -> 91;
            case 207 -> 146;
            case 208 -> 239;
            case 209 -> 112;
            case 210 -> 142;
            case 211 -> 209;
            case 212 -> 155;
            case 213 -> 118;
            case 214 -> 251;
            case 215 -> 87;
            case 216 -> 254;
            case 217 -> 144;
            case 218 -> 39;
            case 219 -> 196;
            case 220 -> 57;
            case 221 -> 215;
            case 222 -> 123;
            case 223 -> 88;
            case 224 -> 32;
            case 225 -> 222;
            case 226 -> 100;
            case 227 -> 180;
            case 228 -> 189;
            case 229 -> 132;
            case 230 -> 111;
            case 231 -> 7;
            case 232 -> 99;
            case 233 -> 140;
            case 234 -> 110;
            case 235 -> 159;
            case 236 -> 13;
            case 237 -> 220;
            case 238 -> 121;
            case 239 -> 40;
            case 240 -> 172;
            case 241 -> 175;
            case 242 -> 248;
            case 243 -> 235;
            case 244 -> 174;
            case 245 -> 176;
            case 246 -> 101;
            case 247 -> 46;
            case 248 -> 19;
            case 249 -> 109;
            case 250 -> 143;
            case 251 -> 245;
            case 252 -> 134;
            case 253 -> 92;
            case 254 -> 136;
            default -> 153;
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

   // PX-RESTORED (T3c): reconstructed from the reference jar bytecode. The obfuscator guarded every
   // live branch with a call to the "llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.f()" watermark array and dead IllegalStateException handlers; those
   // arms are collapsed here, the watermark call itself is kept for its side effect.
   private static boolean b(String param0) {
      llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.f();
      if (param0 == null || param0.isBlank()) {
         return false;
      }
      for (String var1 : lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
         if (param0.startsWith(var1)) {
            return true;
         }
      }
      return false;
   }

   // PX-RESTORED (T3c): same watermark pattern collapsed; the live test is the HTTP redirect status set.
   private static boolean a(int param0) {
      llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.f();
      return param0 == 301 || param0 == 302 || param0 == 303 || param0 == 307 || param0 == 308;
   }

}
