package me.octo.client.utils;

import java.io.File;
import java.io.InputStream;
import java.nio.ShortBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.collections.ArrayDeque;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.openal.AL;
import org.lwjgl.openal.AL10;
import org.lwjgl.openal.ALC;
import org.lwjgl.openal.ALCapabilities;
import org.lwjgl.openal.EXTThreadLocalContext;
import org.lwjgl.openal.ALC10;
import kotlin.jdk7.AutoCloseableKt;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.text.Charsets;
import java.util.concurrent.Future;
import java.nio.IntBuffer;
import java.lang.invoke.LambdaMetafactory;
import java.util.Map;
import org.lwjgl.system.MemoryStack;
import kotlin.ranges.RangesKt;
import org.lwjgl.stb.STBVorbis;

public final class IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll {
   @NotNull
   public static IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static ExecutorService lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static boolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static boolean IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @Nullable
   private static ALCapabilities IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static boolean lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private static HashMap<String, Integer> IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private static ArrayDeque<Integer> llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static int lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private static Set<String> lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static String[] a;
   private static String[] b;

   private IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll() {
   }

   public final void a(@NotNull String var1, @NotNull byte[] var2, @NotNull String var3, float var4) {
      short var10001 = -31530;
      short var10002 = -8968;
      Intrinsics.checkNotNullParameter(var1, "cacheKey");
      var10001 = -31523;
      var10002 = -1972;
      Intrinsics.checkNotNullParameter(var2, "bytes");
      var10001 = -31546;
      var10002 = 22698;
      Intrinsics.checkNotNullParameter(var3, "hint");
      this.a(var1, var4, () -> b(var2, var3));
   }

   public final void a(@NotNull File var1, float var2) {
      String var10000 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      short var10002 = -31533;
      short var10003 = -25454;
      Intrinsics.checkNotNullParameter(var1, "file");
      String var3 = var10000;
      boolean var7 = var1.exists();
      if (var3 == null) {
         if (!var7) {
            return;
         }

         var7 = var1.isFile();
      }

      if (var7) {
         long var4 = var1.lastModified();
         String var6 = var1.getAbsolutePath();
         short var10001 = -31537;
         var10002 = 9580;
         this.a("file:" + var6 + ":" + var4, var2, () -> a(var1));
      }
   }

   public final void a(@NotNull String var1, float var2) {
      short var10001 = -31541;
      short var10002 = 14037;
      Intrinsics.checkNotNullParameter(var1, "resourcePath");
      var10002 = -31517;
      short var10003 = -12942;
      this.a("res:" + var1, var2, () -> a(var1));
   }

   public final void a(
      @NotNull String var1,
      float var2,
      @NotNull Function0<IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> var3
   ) {
      short var10001 = -31519;
      short var10002 = -7472;
      Intrinsics.checkNotNullParameter(var1, "cacheKey");
      var10001 = -31532;
      var10002 = -7028;
      Intrinsics.checkNotNullParameter(var3, "decoder");
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.submit(
         (Runnable)(() -> b(var1, var2, var3))
      );
   }

   @Nullable
   public final IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
      @NotNull byte[] var1, @NotNull String var2
   ) {
      String var10000 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      short var10002 = -31542;
      short var10003 = 930;
      Intrinsics.checkNotNullParameter(var1, "bytes");
      String var3 = var10000;
      short var10001 = -31525;
      var10002 = -7689;
      Intrinsics.checkNotNullParameter(var2, "hint");
      var10000 = var2.toLowerCase(Locale.ROOT);
      var10002 = -31550;
      var10003 = 6281;
      Intrinsics.checkNotNullExpressionValue(var10000, "toLowerCase(...)");
      String var4 = var10000;
      var10001 = -31536;
      var10002 = 31522;
      boolean var6 = StringsKt.endsWith(var4, ".ogg", false);
      if (var3 == null) {
         if (var6) {
            IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var18 = this.a(
               var1
            );
            if (var3 == null && var18 == null) {
               var18 = this.b(var1);
            }

            return var18;
         }

         var10001 = -31514;
         var10002 = 14555;
         var6 = StringsKt.endsWith(var4, ".wav", false);
      }

      IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var7;
      if (var6) {
         var7 = this.b(var1);
         if (var3 == null && var7 == null) {
            var7 = this.a(var1);
         }
      } else {
         IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var8 = this;
         byte[] var11 = var1;
         if (var3 == null) {
            IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var17 = this.a(
               var1
            );
            if (var17 != null) {
               return var17;
            }

            var8 = this;
            var11 = var1;
         }

         var7 = var8.b(var11);
      }

      return var7;
   }

   @NotNull
   public final Set<String> a() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   private final llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
      byte[] param1
   ) {
      String var2 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      try {
         ByteBuffer var3 = ByteBuffer.allocateDirect(param1.length).order(ByteOrder.nativeOrder());
         var3.put(param1).flip();
         AutoCloseable var4 = (AutoCloseable)MemoryStack.stackPush();
         Throwable var5 = null;

         try {
            MemoryStack var6 = (MemoryStack)var4;
            IntBuffer var8 = var6.mallocInt(1);
            Intrinsics.checkNotNullExpressionValue(var8, "mallocInt(...)");
            IntBuffer var9 = var6.mallocInt(1);
            Intrinsics.checkNotNullExpressionValue(var9, "mallocInt(...)");
            ShortBuffer var10 = STBVorbis.stb_vorbis_decode_memory(var3, var8, var9);
            if (var10 == null) {
               return null;
            }

            return new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(var10, var8.get(0), var9.get(0));
         } catch (Throwable var7) {
            var5 = var7;
            throw var7;
         } finally {
            AutoCloseableKt.closeFinally(var4, var5);
         }
      } catch (Throwable var16) {
         return null;
      }
   }

   private final llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll b(
      byte[] param1
   ) {
      String var2 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      try {
         ByteBuffer var3 = ByteBuffer.wrap(param1).order(ByteOrder.LITTLE_ENDIAN);
         if (param1.length < 44) {
            return null;
         }

         String var4 = new String(param1, 0, 4, Charsets.UTF_8);
         String var5 = new String(param1, 8, 4, Charsets.UTF_8);
         if (!(var4.equals("RIFF") && var5.equals("WAVE"))) {
            return null;
         }

         int var6 = 12;
         int var7 = 0;
         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         int var11 = -1;
         int var12 = 0;

         while (var6 + 8 <= param1.length) {
            String var13 = new String(param1, var6, 4, Charsets.UTF_8);
            int var14 = var3.getInt(var6 + 4);
            var6 += 8;
            if (var13.equals("fmt ")) {
               var10 = var3.getShort(var6) & 65535;
               var7 = var3.getShort(var6 + 2) & 65535;
               var8 = var3.getInt(var6 + 4);
               var9 = var3.getShort(var6 + 14) & 65535;
            } else if (var13.equals("data")) {
               var11 = var6;
               var12 = var14;
               break;
            }

            var6 += var14;
            if ((var14 & 1) == 1) {
               var6++;
            }
         }

         if (var11 < 0 || var7 == 0 || var8 == 0) {
            return null;
         }

         if (var10 != 1 || var9 != 16) {
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("WAV must be 16-bit PCM (format=" + var10 + ", bps=" + var9 + ")");
            return null;
         }

         int var16 = var12 / 2;
         ByteBuffer var17 = ByteBuffer.allocateDirect(var12).order(ByteOrder.nativeOrder());
         var17.put(param1, var11, var12).flip();
         ShortBuffer var18 = var17.asShortBuffer();
         var18.limit(var16);
         Intrinsics.checkNotNull(var18);
         return new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(var18, var7, var8);
      } catch (Exception var4) {
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("WAV decode failed: " + var4.getMessage());
         return null;
      }
   }

   private final boolean b() {
      String var1 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      if (IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) {
         return true;
      }
      if (IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
         return false;
      }
      try {
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = ALC10.alcOpenDevice((ByteBuffer)null);
         if (IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == 0L) {
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("Polinex audio: alcOpenDevice failed");
            IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = true;
            return false;
         }
         org.lwjgl.openal.ALCCapabilities var2 = ALC.createCapabilities(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         Intrinsics.checkNotNullExpressionValue(var2, "createCapabilities(...)");
         if (!var2.ALC_EXT_thread_local_context) {
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("Polinex audio: ALC_EXT_thread_local_context unavailable \u2014 audio disabled");
            ALC10.alcCloseDevice(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 0L;
            IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = true;
            return false;
         }
         lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = ALC10.alcCreateContext(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, (IntBuffer)null);
         if (lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI == 0L) {
            ALC10.alcCloseDevice(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 0L;
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("Polinex audio: alcCreateContext failed");
            IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = true;
            return false;
         }
         IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = true;
         Runtime.getRuntime().addShutdownHook(new Thread(me.octo.client.utils.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll::f));
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Polinex audio engine ready (thread-local context)");
         return true;
      } catch (Throwable var3) {
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Polinex audio init failed: " + var3.getClass().getSimpleName() + ": " + var3.getMessage());
         IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = true;
         return false;
      }
   }

   private final void c() {
      String var1 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      boolean var10000 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      if (var1 == null) {
         if (lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) {
            return;
         }

         EXTThreadLocalContext.alcSetThreadContext(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = AL.createCapabilities(ALC.getCapabilities());
         var10000 = true;
      }

      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var10000;
   }

   private final void d() {
      String var1 = me.octo.client.utils.IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      java.util.concurrent.Future var2 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.submit(new Runnable() {
         @Override
         public void run() {
            me.octo.client.utils.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll.g();
         }
      });
      try {
         var2.get();
      } catch (Throwable var4) {
      }
      long var5 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      if (var5 != 0L) {
         org.lwjgl.openal.ALC10.alcDestroyContext(var5);
      }
      long var6 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      if (var6 != 0L) {
         org.lwjgl.openal.ALC10.alcCloseDevice(var6);
      }
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.shutdownNow();
   }

   private final int a(
      IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      String var10000 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      int var3 = AL10.alGenBuffers();
      String var2 = var10000;
      int var5 = var1.b();
      if (var2 == null) {
         var5 = var5 == 2 ? 4355 : 4353;
      }

      int var4 = var5;
      AL10.alBufferData(var3, var4, var1.a(), var1.c());
      return var3;
   }

   private final int e() {
      String var10000 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      Iterator var2 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.iterator();
      String var1 = var10000;

      while (var2.hasNext()) {
         int var3 = ((Number)var2.next()).intValue();
         int var4 = AL10.alGetSourcei(var3, 4112);
         int var7 = var4;

         while (var7 != 4114) {
            var7 = var3;
            if (var1 == null) {
               return var3;
            }
         }
      }

      int var8 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.size();
      if (var1 == null) {
         if (var8 < 16) {
            int var6 = AL10.alGenSources();
            int var9 = var6;
            if (var1 == null) {
               if (var6 != 0) {
                  llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.addLast(var6);
               }

               var9 = var6;
            }

            return var9;
         }

         var8 = ((Number)llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.first()).intValue();
      }

      int var5 = var8;
      AL10.alSourceStop(var5);
      return var5;
   }

   private static final Thread a(Runnable var0) {
      short var10003 = -31526;
      short var10004 = -1996;
      Thread var1 = new Thread(var0, "Polinex-Audio");
      boolean var3 = false;
      var1.setDaemon(true);
      return var1;
   }

   private static final IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll b(
      byte[] var0, String var1
   ) {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0, var1);
   }

   private static final IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
      File var0
   ) {
      IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var10000 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      byte[] var10001 = FilesKt.readBytes(var0);
      String var10002 = var0.getName();
      short var10004 = -31529;
      short var10005 = -30471;
      Intrinsics.checkNotNullExpressionValue(var10002, "getName(...)");
      return var10000.a(var10001, var10002);
   }

   private static final IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
      String var0
   ) {
      var var2 = lIlIlIlIIIlIIIIIllIlIIIIllllIIIlllIIlllIllIlllllIIIllIIlllIllIlIlllIllIlIIlIIllllIlll.a(var0);
      Throwable var3 = null;

      byte[] var10;
      try {
         InputStream var4 = var2;
         boolean var5 = false;
         try {
            var10 = var4.readAllBytes();
         }
         catch (java.io.IOException iOException) {
            throw new RuntimeException(iOException);
         }
      } catch (Throwable var8) {
         var3 = var8;
         throw var8;
      } finally {
         CloseableKt.closeFinally(var2, var3);
      }

      IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var10000 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      Intrinsics.checkNotNull(var10);
      return var10000.a(var10, var0);
   }

   private static final void b(String param0, float param1, Function0 param2) {
      String var3 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      try {
         if (var3 == null && !IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b()) {
            return;
         }

         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
         Map var5 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
         Integer var8 = (Integer)var5.get(param0);
         int var4;
         if (var8 == null) {
            llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10 = (llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)param2.invoke();
            var4 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var10);
            var5.put(param0, var4);
         } else {
            var4 = var8.intValue();
         }

         int var9 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.e();
         if (var9 == 0) {
            return;
         }

         AL10.alSourceStop(var9);
         AL10.alSourcei(var9, 4105, 0);
         AL10.alSourcei(var9, 4105, var4);
         AL10.alSourcef(var9, 4106, RangesKt.coerceAtLeast(param1, 0.0F));
         AL10.alSourcef(var9, 4099, 1.0F);
         AL10.alSource3f(var9, 4100, 0.0F, 0.0F, 0.0F);
         AL10.alSourcei(var9, 514, 1);
         AL10.alSourcePlay(var9);
      } catch (Throwable var4) {
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Polinex audio play error: " + var4.getClass().getSimpleName() + ": " + var4.getMessage());
      }
   }

   private static final void f() {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d();
   }

   private static final void g() {
      String var0 = me.octo.client.utils.IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();

      if (var0 == null) {
         if (!IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) {
            return;
         }

         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
      }

      for (Integer var5 : llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) {
         org.lwjgl.openal.AL10.alDeleteSources(var5.intValue());
      }

      for (Integer var6 : IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.values()) {
         kotlin.jvm.internal.Intrinsics.checkNotNull(var6);
         org.lwjgl.openal.AL10.alDeleteBuffers(var6.intValue());
      }

      org.lwjgl.openal.EXTThreadLocalContext.alcSetThreadContext(0L);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[37];
      int var3 = 0;
      String var2 = "ýî@$\u001dÁ¼MÊ¸e\u0085éG\u0007*\u0004pp¬6\u0004ílhµ\u001fXg©±cÅ+èXÌ^0\u0091à÷\u008eV\u009f\tû²\u0097]wý\u000bÅz\u001aûz\u0004DnÊé\u000e*\u008a d=¬\u0098\u000b\u0007£ Ðc,\u0017äM¿àí\u0096ð\u0085EÕ 9ôþôòH}O>\u001eý\u0001\u001b»ß\b\u0004)\u0003\nvWÖ×Ïßiïg\u0099/ðÛ¯GÔ\u0080\u000bD\u000b\u0005\u0090\u0093\u0001U\u000e\fw\u0086èbÒ\u001e\u0016e\u009dM\u0089+\u0013³;Ô:Å¤ÇÍ\u0093\u0017®ê2j\u0098lßj\u0094&ü©àÊ4Ú©M#±Y#\u000eî\u009cÁ\u0092\u0002W\u009fPQ·K[h\u008c\u000f¨cá/\u0007\u0002×\u009eÛ\u001f\u00035ï\u0000\u0005Hg\u0086Ù¬\u0002Â(\u0004þ\u0005HT\u00045\u001a±q\u0004\u0082Âßm\u0004\u0096w\u0017\u001f12Ä9g\u000foÎûÏgÄù½¯¯¿\u0012)\u0000¦w\u0090¯\u0006LSãàÓY»?\u008dè%fC\u0007\u009f$<ò3?Ù5\u001e¹i\bp/+Ô¨\u0016Mf\fYµ\u009d%\u008fì-\u008aB\u001b\u0099\u0006\u0007\u0007\u0017\"P\u0088O\u007f\u001a<Þø$7\u0007Éö/ÆØÍ>)Êm\u000f!+µÇò«YÙ\u0090\r\u000b\u0089\u001eÎëZRP|¾\u0096Â÷\u0004;y%\u000b\u0003Î2u\u0006!ä¦Ü.z\u0002`~HÛ\u000b\u0004\u009e¨P:\u001cQ\u009b\u0017fÇF¥ô\u0095 \u008fØé]1Hî&\u007fm½¿z8jFÚ%Ù6N\u0097\u00ad\u0084÷Ç8¦\u001a£\u009bZR'ÝbRy\u2068+³ ø\u0014l\u0019k'âf\u0081\u0019\u0084¦\u000e×\u0011\u001f\u0017ÊÂfÆØ\u001aÛç\u001cÊ\u0005Þ\bÈ&7#m;Ò\u0098r\u0090a\u0004:\u0098z\u0006jJ\u0010U\u0003\u0090iÏ\u001a\u0016ÎMw®\u0097\u0000\"¯H\"\u008fÇ\u0080\u0004\u0010\u0015\u0004E\u0011\u009a\u008cÄzÛaf\u0007ô-\"õÓ\u009d\u0086v[";
      int var4 = "ýî@$\u001dÁ¼MÊ¸e\u0085éG\u0007*\u0004pp¬6\u0004ílhµ\u001fXg©±cÅ+èXÌ^0\u0091à÷\u008eV\u009f\tû²\u0097]wý\u000bÅz\u001aûz\u0004DnÊé\u000e*\u008a d=¬\u0098\u000b\u0007£ Ðc,\u0017äM¿àí\u0096ð\u0085EÕ 9ôþôòH}O>\u001eý\u0001\u001b»ß\b\u0004)\u0003\nvWÖ×Ïßiïg\u0099/ðÛ¯GÔ\u0080\u000bD\u000b\u0005\u0090\u0093\u0001U\u000e\fw\u0086èbÒ\u001e\u0016e\u009dM\u0089+\u0013³;Ô:Å¤ÇÍ\u0093\u0017®ê2j\u0098lßj\u0094&ü©àÊ4Ú©M#±Y#\u000eî\u009cÁ\u0092\u0002W\u009fPQ·K[h\u008c\u000f¨cá/\u0007\u0002×\u009eÛ\u001f\u00035ï\u0000\u0005Hg\u0086Ù¬\u0002Â(\u0004þ\u0005HT\u00045\u001a±q\u0004\u0082Âßm\u0004\u0096w\u0017\u001f12Ä9g\u000foÎûÏgÄù½¯¯¿\u0012)\u0000¦w\u0090¯\u0006LSãàÓY»?\u008dè%fC\u0007\u009f$<ò3?Ù5\u001e¹i\bp/+Ô¨\u0016Mf\fYµ\u009d%\u008fì-\u008aB\u001b\u0099\u0006\u0007\u0007\u0017\"P\u0088O\u007f\u001a<Þø$7\u0007Éö/ÆØÍ>)Êm\u000f!+µÇò«YÙ\u0090\r\u000b\u0089\u001eÎëZRP|¾\u0096Â÷\u0004;y%\u000b\u0003Î2u\u0006!ä¦Ü.z\u0002`~HÛ\u000b\u0004\u009e¨P:\u001cQ\u009b\u0017fÇF¥ô\u0095 \u008fØé]1Hî&\u007fm½¿z8jFÚ%Ù6N\u0097\u00ad\u0084÷Ç8¦\u001a£\u009bZR'ÝbRy\u2068+³ ø\u0014l\u0019k'âf\u0081\u0019\u0084¦\u000e×\u0011\u001f\u0017ÊÂfÆØ\u001aÛç\u001cÊ\u0005Þ\bÈ&7#m;Ò\u0098r\u0090a\u0004:\u0098z\u0006jJ\u0010U\u0003\u0090iÏ\u001a\u0016ÎMw®\u0097\u0000\"¯H\"\u008fÇ\u0080\u0004\u0010\u0015\u0004E\u0011\u009a\u008cÄzÛaf\u0007ô-\"õÓ\u009d\u0086v["
         .length();
      char var1 = 16;
      int var9 = -1;

      label52:
      while (true) {
         byte var10000 = 94;
         String var10001 = var2.substring(++var9, var9 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var27 = var10001.toCharArray();
               int var10004 = var27.length;
               int var6 = 0;
               byte var30 = var10000;
               var21 = var27;
               int var15 = var10004;
               byte var37;
               char[] var41;
               int var10006;
               if (var10004 <= 1) {
                  var41 = var27;
                  var37 = var10000;
                  var10006 = var6;
               } else {
                  var30 = var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var41 = var27;
                  var37 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var41[var10006] = (char)(var41[var10006] ^ var37 ^ switch (var6 % 7) {
                     case 0 -> 36;
                     case 1 -> 93;
                     case 2 -> 88;
                     case 3 -> 42;
                     case 4 -> 57;
                     case 5 -> 114;
                     default -> 70;
                  });
                  var6++;
                  if (var30 == 0) {
                     var10006 = var30;
                     var41 = var21;
                     var37 = var30;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var41 = var21;
                     var37 = var30;
                     var10006 = var6;
                  }
               }
            }

            String var32 = new String(var21).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var32;
                  if ((var9 += var1) >= var4) {
                     a = var5;
                     b = new String[37];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll();
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = Executors.newSingleThreadExecutor(
                        IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll::a
                     );
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new HashMap<>();
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new ArrayDeque();
                     String[] var7 = new String[2];
                     var10002 = -31538;
                     short var33 = 6853;
                     var7[0] = "wav";
                     var10002 = -31528;
                     short var34 = -27623;
                     var7[1] = "ogg";
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = SetsKt.setOf(var7);
                     break pxClinit;
                  }

                  var1 = var2.charAt(var9);
                  break;
               default:
                  var5[var3++] = var32;
                  if ((var9 += var1) < var4) {
                     var1 = var2.charAt(var9);
                     continue label52;
                  }

                  var2 = "I\u0000\u0081¼p\u0096Ûû\u0004.«\u008b\u0003";
                  var4 = "I\u0000\u0081¼p\u0096Ûû\u0004.«\u008b\u0003".length();
                  var1 = '\b';
                  var9 = -1;
            }

            var10000 = 82;
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
      int var2 = (var0 ^ -31550) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 85;
            case 1 -> 92;
            case 2 -> 140;
            case 3 -> 205;
            case 4 -> 75;
            case 5 -> 248;
            case 6 -> 53;
            case 7 -> 28;
            case 8 -> 15;
            case 9 -> 174;
            case 10 -> 143;
            case 11 -> 48;
            case 12 -> 50;
            case 13 -> 86;
            case 14 -> 215;
            case 15 -> 126;
            case 16 -> 63;
            case 17 -> 198;
            case 18 -> 34;
            case 19 -> 193;
            case 20 -> 32;
            case 21 -> 59;
            case 22 -> 212;
            case 23 -> 231;
            case 24 -> 81;
            case 25 -> 61;
            case 26 -> 221;
            case 27 -> 227;
            case 28 -> 46;
            case 29 -> 255;
            case 30 -> 129;
            case 31 -> 133;
            case 32 -> 238;
            case 33 -> 4;
            case 34 -> 166;
            case 35 -> 181;
            case 36 -> 168;
            case 37 -> 21;
            case 38 -> 23;
            case 39 -> 228;
            case 40 -> 51;
            case 41 -> 14;
            case 42 -> 197;
            case 43 -> 211;
            case 44 -> 64;
            case 45 -> 55;
            case 46 -> 12;
            case 47 -> 130;
            case 48 -> 70;
            case 49 -> 160;
            case 50 -> 24;
            case 51 -> 104;
            case 52 -> 169;
            case 53 -> 152;
            case 54 -> 177;
            case 55 -> 99;
            case 56 -> 179;
            case 57 -> 155;
            case 58 -> 226;
            case 59 -> 88;
            case 60 -> 82;
            case 61 -> 69;
            case 62 -> 84;
            case 63 -> 116;
            case 64 -> 47;
            case 65 -> 206;
            case 66 -> 202;
            case 67 -> 170;
            case 68 -> 214;
            case 69 -> 253;
            case 70 -> 42;
            case 71 -> 29;
            case 72 -> 224;
            case 73 -> 145;
            case 74 -> 5;
            case 75 -> 57;
            case 76 -> 44;
            case 77 -> 201;
            case 78 -> 125;
            case 79 -> 141;
            case 80 -> 73;
            case 81 -> 113;
            case 82 -> 216;
            case 83 -> 213;
            case 84 -> 111;
            case 85 -> 105;
            case 86 -> 165;
            case 87 -> 153;
            case 88 -> 101;
            case 89 -> 65;
            case 90 -> 237;
            case 91 -> 30;
            case 92 -> 220;
            case 93 -> 83;
            case 94 -> 9;
            case 95 -> 16;
            case 96 -> 1;
            case 97 -> 184;
            case 98 -> 137;
            case 99 -> 176;
            case 100 -> 158;
            case 101 -> 167;
            case 102 -> 182;
            case 103 -> 13;
            case 104 -> 100;
            case 105 -> 175;
            case 106 -> 90;
            case 107 -> 156;
            case 108 -> 178;
            case 109 -> 102;
            case 110 -> 229;
            case 111 -> 122;
            case 112 -> 172;
            case 113 -> 19;
            case 114 -> 250;
            case 115 -> 60;
            case 116 -> 7;
            case 117 -> 194;
            case 118 -> 8;
            case 119 -> 106;
            case 120 -> 173;
            case 121 -> 98;
            case 122 -> 171;
            case 123 -> 251;
            case 124 -> 191;
            case 125 -> 115;
            case 126 -> 56;
            case 127 -> 159;
            case 128 -> 245;
            case 129 -> 123;
            case 130 -> 195;
            case 131 -> 222;
            case 132 -> 200;
            case 133 -> 232;
            case 134 -> 199;
            case 135 -> 150;
            case 136 -> 233;
            case 137 -> 132;
            case 138 -> 93;
            case 139 -> 230;
            case 140 -> 110;
            case 141 -> 20;
            case 142 -> 196;
            case 143 -> 103;
            case 144 -> 80;
            case 145 -> 45;
            case 146 -> 117;
            case 147 -> 67;
            case 148 -> 0;
            case 149 -> 217;
            case 150 -> 11;
            case 151 -> 49;
            case 152 -> 79;
            case 153 -> 52;
            case 154 -> 43;
            case 155 -> 151;
            case 156 -> 94;
            case 157 -> 135;
            case 158 -> 128;
            case 159 -> 87;
            case 160 -> 223;
            case 161 -> 10;
            case 162 -> 235;
            case 163 -> 240;
            case 164 -> 134;
            case 165 -> 41;
            case 166 -> 241;
            case 167 -> 22;
            case 168 -> 161;
            case 169 -> 3;
            case 170 -> 108;
            case 171 -> 147;
            case 172 -> 149;
            case 173 -> 91;
            case 174 -> 242;
            case 175 -> 37;
            case 176 -> 17;
            case 177 -> 109;
            case 178 -> 249;
            case 179 -> 74;
            case 180 -> 62;
            case 181 -> 33;
            case 182 -> 112;
            case 183 -> 89;
            case 184 -> 124;
            case 185 -> 148;
            case 186 -> 183;
            case 187 -> 38;
            case 188 -> 35;
            case 189 -> 243;
            case 190 -> 119;
            case 191 -> 162;
            case 192 -> 138;
            case 193 -> 54;
            case 194 -> 97;
            case 195 -> 77;
            case 196 -> 236;
            case 197 -> 36;
            case 198 -> 6;
            case 199 -> 157;
            case 200 -> 120;
            case 201 -> 131;
            case 202 -> 188;
            case 203 -> 186;
            case 204 -> 2;
            case 205 -> 127;
            case 206 -> 225;
            case 207 -> 58;
            case 208 -> 136;
            case 209 -> 219;
            case 210 -> 210;
            case 211 -> 154;
            case 212 -> 246;
            case 213 -> 71;
            case 214 -> 139;
            case 215 -> 25;
            case 216 -> 40;
            case 217 -> 95;
            case 218 -> 31;
            case 219 -> 78;
            case 220 -> 187;
            case 221 -> 144;
            case 222 -> 207;
            case 223 -> 72;
            case 224 -> 121;
            case 225 -> 204;
            case 226 -> 114;
            case 227 -> 203;
            case 228 -> 118;
            case 229 -> 254;
            case 230 -> 18;
            case 231 -> 185;
            case 232 -> 164;
            case 233 -> 142;
            case 234 -> 26;
            case 235 -> 163;
            case 236 -> 96;
            case 237 -> 208;
            case 238 -> 76;
            case 239 -> 39;
            case 240 -> 180;
            case 241 -> 189;
            case 242 -> 68;
            case 243 -> 27;
            case 244 -> 234;
            case 245 -> 252;
            case 246 -> 192;
            case 247 -> 209;
            case 248 -> 244;
            case 249 -> 146;
            case 250 -> 66;
            case 251 -> 239;
            case 252 -> 190;
            case 253 -> 218;
            case 254 -> 107;
            default -> 247;
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
      @NotNull
      private final ShortBuffer IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(@NotNull ShortBuffer var1, int var2, int var3) {
         short var10001 = -7861;
         short var10002 = 21746;
         Intrinsics.checkNotNullParameter(var1, "samples");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      }

      @NotNull
      public final ShortBuffer a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final ShortBuffer d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         @NotNull ShortBuffer var1, int var2, int var3
      ) {
         short var10001 = -7864;
         short var10002 = 29750;
         Intrinsics.checkNotNullParameter(var1, "samples");
         return new IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -7860;
         int var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         ShortBuffer var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -31228;
         short var10002 = -7862;
         short var10003 = -21512;
         short var10004 = -7863;
         short var10005 = 11274;
         return "PcmBuffer(samples=" + var3 + ", channels=" + var2 + ", sampleRate=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         var1 = var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         return var1 * 31 + Integer.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
         Object var10000 = this;
         if (var2 == null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == null) {
            if (!(
               var10000 instanceof IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         int var4 = ((Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )) ? 1 : 0);
         if (var2 == null) {
            if (var4 == 0) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         int var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if (var2 == null) {
            if (var4 != var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
               return false;
            }

            var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            if (var2 != null) {
               return (boolean)(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl != 0);
            }

            var10001 = var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         return !(var4 != var10001);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[5];
         int var3 = 0;
         String var2 = "½²Øì£þî\r\u0002\u008f\u00853Ô#>\b\u0093¶\u0099ê\u008c\u000b;\u0017²),V®{ýÊä";
         int var4 = "½²Øì£þî\r\u0002\u008f\u00853Ô#>\b\u0093¶\u0099ê\u008c\u000b;\u0017²),V®{ýÊä".length();
         char var1 = 7;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 17;
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
                        case 0 -> 96;
                        case 1 -> 63;
                        case 2 -> 32;
                        case 3 -> 83;
                        case 4 -> 35;
                        case 5 -> 33;
                        default -> 95;
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
                        b = new String[5];
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

                     var2 = "@ï\u009b»7è\u0080\u0012»U£\u009c){l+NgýHKÀN\u0018¸\u008c";
                     var4 = "@ï\u009b»7è\u0080\u0012»U£\u009c){l+NgýHKÀN\u0018¸\u008c".length();
                     var1 = 7;
                     var8 = -1;
               }

               var10000 = 14;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -7864) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 150;
               case 1 -> 248;
               case 2 -> 230;
               case 3 -> 217;
               case 4 -> 245;
               case 5 -> 14;
               case 6 -> 138;
               case 7 -> 32;
               case 8 -> 164;
               case 9 -> 233;
               case 10 -> 47;
               case 11 -> 4;
               case 12 -> 106;
               case 13 -> 220;
               case 14 -> 90;
               case 15 -> 253;
               case 16 -> 213;
               case 17 -> 205;
               case 18 -> 43;
               case 19 -> 183;
               case 20 -> 188;
               case 21 -> 100;
               case 22 -> 222;
               case 23 -> 246;
               case 24 -> 5;
               case 25 -> 104;
               case 26 -> 8;
               case 27 -> 165;
               case 28 -> 58;
               case 29 -> 214;
               case 30 -> 51;
               case 31 -> 38;
               case 32 -> 62;
               case 33 -> 59;
               case 34 -> 155;
               case 35 -> 12;
               case 36 -> 181;
               case 37 -> 108;
               case 38 -> 126;
               case 39 -> 48;
               case 40 -> 196;
               case 41 -> 72;
               case 42 -> 228;
               case 43 -> 112;
               case 44 -> 45;
               case 45 -> 65;
               case 46 -> 149;
               case 47 -> 42;
               case 48 -> 60;
               case 49 -> 31;
               case 50 -> 201;
               case 51 -> 137;
               case 52 -> 97;
               case 53 -> 1;
               case 54 -> 147;
               case 55 -> 239;
               case 56 -> 215;
               case 57 -> 141;
               case 58 -> 15;
               case 59 -> 98;
               case 60 -> 52;
               case 61 -> 252;
               case 62 -> 123;
               case 63 -> 3;
               case 64 -> 30;
               case 65 -> 162;
               case 66 -> 235;
               case 67 -> 34;
               case 68 -> 122;
               case 69 -> 99;
               case 70 -> 202;
               case 71 -> 200;
               case 72 -> 218;
               case 73 -> 174;
               case 74 -> 146;
               case 75 -> 247;
               case 76 -> 250;
               case 77 -> 151;
               case 78 -> 117;
               case 79 -> 55;
               case 80 -> 170;
               case 81 -> 225;
               case 82 -> 23;
               case 83 -> 110;
               case 84 -> 79;
               case 85 -> 187;
               case 86 -> 249;
               case 87 -> 53;
               case 88 -> 166;
               case 89 -> 116;
               case 90 -> 219;
               case 91 -> 154;
               case 92 -> 80;
               case 93 -> 94;
               case 94 -> 86;
               case 95 -> 124;
               case 96 -> 192;
               case 97 -> 241;
               case 98 -> 136;
               case 99 -> 209;
               case 100 -> 11;
               case 101 -> 131;
               case 102 -> 93;
               case 103 -> 173;
               case 104 -> 25;
               case 105 -> 132;
               case 106 -> 56;
               case 107 -> 7;
               case 108 -> 68;
               case 109 -> 33;
               case 110 -> 63;
               case 111 -> 152;
               case 112 -> 16;
               case 113 -> 95;
               case 114 -> 115;
               case 115 -> 171;
               case 116 -> 169;
               case 117 -> 37;
               case 118 -> 102;
               case 119 -> 161;
               case 120 -> 212;
               case 121 -> 182;
               case 122 -> 19;
               case 123 -> 195;
               case 124 -> 232;
               case 125 -> 156;
               case 126 -> 13;
               case 127 -> 129;
               case 128 -> 70;
               case 129 -> 92;
               case 130 -> 193;
               case 131 -> 85;
               case 132 -> 50;
               case 133 -> 120;
               case 134 -> 74;
               case 135 -> 203;
               case 136 -> 91;
               case 137 -> 168;
               case 138 -> 159;
               case 139 -> 39;
               case 140 -> 251;
               case 141 -> 78;
               case 142 -> 103;
               case 143 -> 234;
               case 144 -> 227;
               case 145 -> 20;
               case 146 -> 226;
               case 147 -> 140;
               case 148 -> 135;
               case 149 -> 211;
               case 150 -> 125;
               case 151 -> 240;
               case 152 -> 113;
               case 153 -> 89;
               case 154 -> 243;
               case 155 -> 216;
               case 156 -> 191;
               case 157 -> 24;
               case 158 -> 179;
               case 159 -> 36;
               case 160 -> 172;
               case 161 -> 118;
               case 162 -> 105;
               case 163 -> 96;
               case 164 -> 178;
               case 165 -> 142;
               case 166 -> 153;
               case 167 -> 175;
               case 168 -> 238;
               case 169 -> 148;
               case 170 -> 176;
               case 171 -> 27;
               case 172 -> 186;
               case 173 -> 145;
               case 174 -> 167;
               case 175 -> 206;
               case 176 -> 144;
               case 177 -> 26;
               case 178 -> 130;
               case 179 -> 208;
               case 180 -> 107;
               case 181 -> 139;
               case 182 -> 128;
               case 183 -> 73;
               case 184 -> 133;
               case 185 -> 194;
               case 186 -> 0;
               case 187 -> 199;
               case 188 -> 67;
               case 189 -> 190;
               case 190 -> 189;
               case 191 -> 83;
               case 192 -> 210;
               case 193 -> 61;
               case 194 -> 46;
               case 195 -> 66;
               case 196 -> 29;
               case 197 -> 76;
               case 198 -> 121;
               case 199 -> 184;
               case 200 -> 71;
               case 201 -> 160;
               case 202 -> 69;
               case 203 -> 84;
               case 204 -> 119;
               case 205 -> 22;
               case 206 -> 157;
               case 207 -> 111;
               case 208 -> 64;
               case 209 -> 21;
               case 210 -> 134;
               case 211 -> 2;
               case 212 -> 158;
               case 213 -> 127;
               case 214 -> 198;
               case 215 -> 44;
               case 216 -> 185;
               case 217 -> 35;
               case 218 -> 81;
               case 219 -> 17;
               case 220 -> 10;
               case 221 -> 254;
               case 222 -> 18;
               case 223 -> 101;
               case 224 -> 223;
               case 225 -> 40;
               case 226 -> 255;
               case 227 -> 109;
               case 228 -> 242;
               case 229 -> 77;
               case 230 -> 49;
               case 231 -> 114;
               case 232 -> 75;
               case 233 -> 221;
               case 234 -> 57;
               case 235 -> 204;
               case 236 -> 9;
               case 237 -> 229;
               case 238 -> 224;
               case 239 -> 244;
               case 240 -> 180;
               case 241 -> 143;
               case 242 -> 41;
               case 243 -> 231;
               case 244 -> 207;
               case 245 -> 28;
               case 246 -> 163;
               case 247 -> 82;
               case 248 -> 87;
               case 249 -> 197;
               case 250 -> 6;
               case 251 -> 236;
               case 252 -> 88;
               case 253 -> 54;
               case 254 -> 177;
               default -> 237;
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
   
public static me.octo.client.utils.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(me.octo.client.utils.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll p0, java.nio.ShortBuffer p1, int p2, int p3, int p4, java.lang.Object p5) {
         String var6 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
         if (var6 == null) {
            if ((p4 & 1) != 0) {
               p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            }

            if ((p4 & 2) != 0) {
               p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            if ((p4 & 4) != 0) {
               p3 = p0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }
         }

         return p0.a(p1, p2, p3);
      }
}
}
