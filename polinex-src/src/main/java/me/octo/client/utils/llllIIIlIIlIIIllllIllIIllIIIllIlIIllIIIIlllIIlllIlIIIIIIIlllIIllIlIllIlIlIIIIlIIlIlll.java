package me.octo.client.utils;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.nio.charset.Charset;
import java.util.concurrent.Executors;
import java.lang.invoke.LambdaMetafactory;
import net.minecraft.client.Minecraft;
import kotlin.jvm.internal.Reflection;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import me.octo.client.lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII;

public final class llllIIIlIIlIIIllllIllIIllIIIllIlIIllIIIIlllIIlllIlIIIIIIIlllIIllIlIllIlIlIIIIlIIlIlll {

   // PX-FIX: jar 异常表对“无抛出点”区域也登记了 IOException handler；Java 源码需 try 体可抛该异常才能保留 catch（运行时空桩不抛）。
   private static void pxIOExceptionReach() throws java.io.IOException {
   }

   @NotNull
   public static llllIIIlIIlIIIllllIllIIllIIIllIlIIllIIIIlllIIlllIlIIIIIIIlllIIllIlIllIlIlIIIIlIIlIlll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static AtomicBoolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static AtomicBoolean IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static AtomicBoolean IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @Nullable
   private static ScheduledExecutorService lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static long IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static int lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static volatile boolean lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static volatile boolean lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static volatile boolean lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @Nullable
   private static OutputStream IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private static AtomicInteger llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @NotNull
   private static String IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @NotNull
   private static String IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static long IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static volatile long IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private static volatile long llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private static String[] a;
   private static String[] b;

   private llllIIIlIIlIIIllllIllIIllIIIllIlIIllIIIIlllIIlllIlIIIIIIIlllIIllIlIllIlIlIIIIlIIlIlll() {
   }

   public final void a() {
      String[] var1 = llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      boolean var10000 = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      if (var1 != null) {
         if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
            return;
         }

         var10000 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.get();
      }

      if (var1 != null) {
         if (var10000) {
            return;
         }

         var10000 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      }

      if (var1 != null) {
         if (var10000) {
            return;
         }

         lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = true;
         lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = false;
         if (var1 == null) {
            return;
         }

         var10000 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.compareAndSet(false, true);
      }

      if (var10000) {
         IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(llllIIIlIIlIIIllllIllIIllIIIllIlIIllIIIIlllIIlllIlIIIIIIIlllIIllIlIllIlIlIIIIlIIlIlll::r);
      }
   }

   public final void b() {
      lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = false;
      this.l();
   }

   private final boolean c() {
      String[] var1 = llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      try {
         if (var1 == null) {
            return false;
         }
         for (String var4 : this.d()) {
            File var5 = new File(var4);
            if (!var5.exists()) {
               continue;
            }
            AtomicReference<String> var6 = new AtomicReference<>(null);
            Thread var7 = new Thread(() -> a(var5, var6), "DiscordRPC-Connect");
            var7.setDaemon(true);
            var7.start();
            var7.join(3000L);
            if (var7.isAlive()) {
               lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("[DiscordRPC] Pipe timed out: " + var4);
               if (IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl != null) {
                  IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.close();
               }
               IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = null;
               var7.join(500L);
               continue;
            }
            String var8 = var6.get();
            if (var8 == null) {
               lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("[DiscordRPC] Connected to Discord");
               return true;
            }
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("[DiscordRPC] Failed on " + var4 + " : " + var8);
         }
         return false;
      } catch (Exception var9) {
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("[DiscordRPC] Connection error: " + var9.getMessage());
         return false;
      }
   }

   private final List<String> d() {
      String[] var1;
      String var10;
      label60: {
         String[] var10000 = llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
         short var10001 = 1307;
         short var10002 = 3581;
         String var24 = System.getProperty("os.name");
         short var10003 = 1289;
         short var10004 = 26546;
         Intrinsics.checkNotNullExpressionValue(var24, "getProperty(...)");
         String var25 = var24.toLowerCase(Locale.ROOT);
         var10003 = 1359;
         var10004 = 26623;
         Intrinsics.checkNotNullExpressionValue(var25, "toLowerCase(...)");
         String var2 = var25;
         var1 = var10000;
         CharSequence var8 = var2;
         var10001 = 1290;
         var10002 = -9726;
         boolean var9 = StringsKt.contains(var8, "win", false);
         if (var1 != null) {
            if (var9) {
               short var23 = 1355;
               var10001 = 4181;
               return CollectionsKt.listOf("\\\\.\\pipe\\discord-ipc-0");
            }

            var10 = var2;
            if (var1 == null) {
               break label60;
            }

            CharSequence var11 = var2;
            var10001 = 1364;
            var10002 = 28251;
            var9 = StringsKt.contains(var11, "mac", false);
         }

         if (var9) {
            short var12 = 1404;
            var10001 = -7096;
            var10 = System.getenv("TMPDIR");
            if (var10 == null) {
               short var14 = 1352;
               var10001 = 24846;
               var10 = "/tmp";
            }

            String var3 = var10;
            var10001 = 1400;
            var10002 = -9419;
            return CollectionsKt.listOf(var3 + "/discord-ipc-0");
         }

         var10 = this.e();
      }

      String var7;
      label45: {
         var7 = var10;
         if (var1 != null) {
            short var16 = 1374;
            short var31 = 24849;
            var10 = System.getenv("XDG_RUNTIME_DIR");
            if (var10 != null) {
               break label45;
            }
         }

         short var18 = 1304;
         short var32 = -30688;
         var10 = "/tmp";
      }

      String var4;
      label39: {
         label62: {
            var4 = var10;
            short var19 = 1302;
            short var33 = -26703;
            var10 = System.getenv("TMPDIR");
            String var34 = var10;
            if (var1 != null) {
               if (var10 != null) {
                  break label39;
               }

               if (var1 == null) {
                  break label62;
               }

               short var21 = 1360;
               var33 = -1728;
               var10 = System.getenv("TMP");
               var34 = var10;
            }

            if (var34 != null) {
               break label39;
            }
         }

         short var22 = 1304;
         short var36 = -30688;
         var10 = "/tmp";
      }

      String var5 = var10;
      String[] var6 = new String[5];
      short var43 = 1380;
      short var49 = -5851;
      var6[0] = var4 + "/discord-ipc-0";
      short var41 = 1311;
      var43 = -24016;
      var6[1] = "/tmp/discord-ipc-0";
      var43 = 1380;
      var49 = -5851;
      var6[2] = var5 + "/discord-ipc-0";
      var43 = 1303;
      var49 = -20821;
      var49 = 1380;
      short var10005 = -5851;
      var6[3] = "/run/user/" + var7 + "/discord-ipc-0";
      var43 = 1391;
      var49 = 26760;
      var49 = 1380;
      var10005 = -5851;
      var6[4] = "/var/run/user/" + var7 + "/discord-ipc-0";
      return CollectionsKt.listOf(var6);
   }

   private final String e() {
      String var2;
      try {
         Process var3 = new ProcessBuilder(new String[]{"id", "-u"}).start();
         java.io.InputStream var4 = var3.getInputStream();
         Intrinsics.checkNotNullExpressionValue(var4, "getInputStream(...)");
         java.io.Reader var5 = new java.io.InputStreamReader(var4, Charsets.UTF_8);
         java.io.BufferedReader var6 = var5 instanceof java.io.BufferedReader ? (java.io.BufferedReader)var5 : new java.io.BufferedReader(var5, 8192);
         String var7 = var6.readLine();
         var2 = var7 != null ? var7 : "1000";
      } catch (Exception var8) {
         var2 = "1000";
      }
      return var2;
   }

   private final boolean a(int var1, String var2) {
      Object var17 = null; // PX-FIX
      String[] var3 = llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();

      boolean var4;
      try {
         boolean var18;
         label30: {
            label36: {
               try {
                  pxIOExceptionReach();
                  if (var3 != null) {
                     var17 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
                     if (IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl != null) {
                        break label36;
                     }
                  }
               } catch (IOException var13) {
                  throw (RuntimeException)a(var13);
               }

               var18 = false;
               break label30;
            }

            OutputStream var6 =((OutputStream)( var17));
            boolean var7 = false;
            byte[] var19 = var2.getBytes(Charsets.UTF_8);
            short var22 = 1354;
            short var10003 = 25794;
            Intrinsics.checkNotNullExpressionValue(var19, "getBytes(...)");
            byte[] var8 = var19;
            ByteBuffer var9 = ByteBuffer.allocate(8 + var8.length);
            boolean var11 = false;
            var9.order(ByteOrder.LITTLE_ENDIAN);
            var9.putInt(var1);
            var9.putInt(var8.length);
            var9.put(var8);
            var6.write(var9.array());
            var6.flush();
            var18 = true;
         }

         var4 = var18;
      } catch (IOException var14) {
         String var16 = var14.getMessage();
         short var20 = 1393;
         short var21 = 21128;
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("[DiscordRPC] Connection lost: " + var16);
         this.f();
         var4 = false;
      } catch (Exception var15) {
         String var10000 = var15.getMessage();
         short var10001 = 1388;
         short var10002 = -24942;
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("[DiscordRPC] Frame send error: " + var10000);
         var4 = false;
      }

      return var4;
   }

   private final void f() {
      String[] var1 = me.octo.client.utils.llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.set(true);
      try {
        OutputStream var2 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
        if (var1 != null && var2 != null) {
          var2.close();
        }
      } catch (Exception var3) {
      }
      IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = null;
   }

   private final boolean g() {
      String[] var1 = llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      int var10000 =(( lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI) ? 1 : 0);
      if (var1 != null) {
         if (!lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI) {
            long var2 = System.currentTimeMillis();
            long var12;
            var10000 = (var12 = var2 - llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI - 10000L) == 0L
               ? 0
               : (var12 < 0L ? -1 : 1);
            if (var1 != null) {
               if (var10000 < 0) {
                  return false;
               }

               var10000 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
            }

            if (var1 != null) {
               if (var10000 >= 3) {
                  short var8 = 1362;
                  short var10 = -14979;
                  lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c(
                     "[DiscordRPC] Max reconnection attempts reached, giving up"
                  );
                  lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = true;
                  return false;
               }

               llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var2;
               var10000 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
            }

            int var4 = var10000;
            lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var4 + 1;
            short var10001 = 1298;
            short var10002 = 2004;
            var10002 = 1385;
            short var10003 = -12449;
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d(
               "[DiscordRPC] Attempting reconnection (" + lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl + "/3)..."
            );
            short var6 = ((short)((this.c()) ? 1 : 0));
            if (var1 != null) {
               if ((var6 != 0)) {
                  var6 = 1399;
                  var10001 = -13733;
                  lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("[DiscordRPC] Reconnected successfully");
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.set(false);
                  lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 0;
                  lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = false;
                  var6 = 1;
               } else {
                  var6 = 0;
               }
            }

            return (var6 != 0);
         }

         var10000 = 0;
      }

      return (var10000 != 0);
   }

   private final String h() {
      String[] var1 = new String[13];
      short var10002 = 1382;
      short var10003 = 9994;
      var1[0] = "Touching grass";
      var10002 = 1370;
      var10003 = -17456;
      var1[1] = "Etherwarping around mindlessly";
      var10002 = 1310;
      var10003 = 13295;
      var1[2] = "Pretending I'm not addicted";
      var10002 = 1356;
      var10003 = 32503;
      var1[3] = "Staring at blocks";
      var10002 = 1351;
      var10003 = 2507;
      var1[4] = "Pretending to be productive";
      var10002 = 1345;
      var10003 = 7967;
      var1[5] = "Getting rich (not irl dw)";
      var10002 = 1403;
      var10003 = 27715;
      var1[6] = "Punching rocks for money";
      var10002 = 1372;
      var10003 = -22724;
      var1[7] = "Flexing imaginary wealth";
      var10002 = 1353;
      var10003 = -26839;
      var1[8] = "Perfecting the art of doing nothing";
      var10002 = 1344;
      var10003 = -10968;
      var1[9] = "Denying I have a problem";
      var10002 = 1384;
      var10003 = -16422;
      var1[10] = "Procrastinating with style";
      var10002 = 1379;
      var10003 = -4667;
      var1[11] = "Avoiding real world responsibilities";
      var10002 = 1309;
      var10003 = 24223;
      var1[12] = "Downloading more ram";
      return (String)CollectionsKt.random(CollectionsKt.listOf(var1), (Random)Random.Default);
   }

   private final void i() {
String[] var1 = llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
if (!lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl || !IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.get() || (IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.get() && !this.g())) {
   return;
}

Minecraft var2 = Minecraft.getInstance();
Intrinsics.checkNotNullExpressionValue(var2, "getInstance(...)");
if (var2.level == null) {
   IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = "In Menu";
   IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = "Main Menu";
} else if (var2.isLocalServer()) {
   IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = "Singleplayer";
   IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = this.h();
} else {
   IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = this.h();
   IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
      ? "Using the " + (lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI == null ? null : lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.aa())
      : "Current Area: " + IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.d(IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g());
}

try {
   this.j();
} catch (Exception var3) {
   long var4 = System.currentTimeMillis();
   if (var4 - IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl >= 60000L) {
      IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = var4;
      lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("[DiscordRPC] Auto status update error: " + var3.getMessage());
   }
}
   }

   private final void j() {
      if (!this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl || !IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.get() || !IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.get()) {
         return;
      }
      try {
         String var2 = me.octo.client.utils.llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII.b(this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl);
         String var3 = me.octo.client.utils.llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII.b(this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl);
         String var4 = "Polinex Client (Fabric " + me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getLaunchedVersion() + ")";
         long var8 = this.k();
         long var12 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
         String var5 = "{\"cmd\":\"SET_ACTIVITY\",\"args\":{\"pid\":" + var12
            + ",\"activity\":{\"details\":\"" + var4
            + "\",\"state\":\"" + var3
            + "\",\"timestamps\":{\"start\":" + var8
            + "},\"assets\":{\"large_image\":\"polinex\",\"large_text\":\"" + var2
            + "\"}}},\"nonce\":\"" + this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.incrementAndGet()
            + "\"}";
         this.a(1, var5);
      } catch (java.lang.Exception var3x) {
         long var4x = java.lang.System.currentTimeMillis();
         if (var4x - this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI >= 60000L) {
            this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = var4x;
            me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("[DiscordRPC] Presence update error: " + var3x.getMessage());
         }
      }
   }

   private final long k() {
      long var1;
      try {
         var1 = ProcessHandle.current().pid();
      } catch (Exception var4) {
         var1 = System.currentTimeMillis() % 10000;
      }

      return var1;
   }

   private final void l() {
      String[] var1 = llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      try {
         if (var1 != null) {
            java.util.concurrent.ScheduledExecutorService var2 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
            if (var2 != null) {
               var2.submit(llllIIIlIIlIIIllllIllIIllIIIllIlIIllIIIIlllIIlllIlIIIIIIIlllIIllIlIllIlIlIIIIlIIlIlll::s);
            }
         }

         if (lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll != null) {
            lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.shutdown();
         }
         if (lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll != null) {
            lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.awaitTermination(5L, java.util.concurrent.TimeUnit.SECONDS);
         }
         lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = null;
         if (var1 != null) {
            java.io.OutputStream var2 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
            if (var2 != null) {
               var2.close();
            }
         }

         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = null;
         IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.set(false);
         lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = false;
         IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.set(false);
         lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 0;
         llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 0L;
         lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = false;
         if (var1 != null && lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("[DiscordRPC] Shut down successfully");
         }
      } catch (Exception var2) {
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("[DiscordRPC] Shutdown error: " + var2.getMessage());
      }

   }

   public final void a(@NotNull String var1, @NotNull String var2) {
      String[] var10000 = llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      short var10002 = 1405;
      short var10003 = 11892;
      Intrinsics.checkNotNullParameter(var1, "state");
      var10002 = 1288;
      var10003 = -15512;
      Intrinsics.checkNotNullParameter(var2, "details");
      String[] var3 = var10000;
      boolean var4 = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      if (var3 != null) {
         if (!lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
            return;
         }

         var4 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.get();
      }

      if (var4) {
         IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = var1;
         IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var2;
         if (var3 != null) {
            if (lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll != null) {
               lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.submit(
                  llllIIIlIIlIIIllllIllIIllIIIllIlIIllIIIIlllIIlllIlIIIIIIIlllIIllIlIllIlIlIIIIlIIlIlll::t
               );
            }
         }

         if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
            llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b(
               new String[4]
            );
         }
      }
   }

   public final void m() {
      if (!lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
         return;
      }
      if (!IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.get()) {
         return;
      }
      if (IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.get()) {
         return;
      }
      long var4 = this.k();
      int var3 = llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.incrementAndGet();
      String var2 = "{\"cmd\":\"SET_ACTIVITY\",\"args\":{\"pid\":" + var4 + ",\"activity\":null},\"nonce\":\"" + var3 + "\"}";
      this.a(1, var2);
      try {
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("[DiscordRPC] Presence cleared");
      } catch (Exception var2b) {
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("[DiscordRPC] Clear presence error:" + var2b.getMessage());
      }
   }

   public final void a(@NotNull String var1) {
      String[] var10000 = llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      short var10002 = 1367;
      short var10003 = -28044;
      Intrinsics.checkNotNullParameter(var1, "state");
      String[] var2 = var10000;
      boolean var3 = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      if (var2 != null) {
         if (!lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
            return;
         }

         var3 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.get();
      }

      if (var3) {
         IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = var1;
         if (var2 != null) {
            if (lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll != null) {
               lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.submit(
                  llllIIIlIIlIIIllllIllIIllIIIllIlIIllIIIIlllIIlllIlIIIIIIIlllIIllIlIllIlIlIIIIlIIlIlll::u
               );
            }
         }
      }
   }

   public final void b(@NotNull String var1) {
      String[] var10000 = llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      short var10002 = 1365;
      short var10003 = 21938;
      Intrinsics.checkNotNullParameter(var1, "details");
      String[] var2 = var10000;
      boolean var3 = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      if (var2 != null) {
         if (!lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
            return;
         }

         var3 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.get();
      }

      if (var3) {
         IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var1;
         if (var2 != null) {
            if (lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll != null) {
               lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.submit(
                  llllIIIlIIlIIIllllIllIIllIIIllIlIIllIIIIlllIIlllIlIIIIIIIlllIIllIlIllIlIlIIIIlIIlIlll::v
               );
            }
         }
      }
   }

   public final void n() {
      String[] var1 = llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      if (var1 != null) {
         if (lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll != null) {
            lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.submit(
               llllIIIlIIlIIIllllIllIIllIIIllIlIIllIIIIlllIIlllIlIIIIIIIlllIIllIlIllIlIlIIIIlIIlIlll::w
            );
         }
      }
   }

   public final boolean o() {
      String[] var1 = llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      boolean var10000 = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      if (var1 != null) {
         if (!lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
            return false;
         }

         var10000 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      }

      return var1 == null ? var10000 : !var10000;
   }

   public final boolean p() {
      String[] var1 = llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      boolean var10000 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.get();
      if (var1 != null) {
         if (!var10000) {
            return false;
         }

         var10000 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      }

      if (var1 != null) {
         if (var10000) {
            return false;
         }

         var10000 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.get();
      }

      return var1 == null ? var10000 : !var10000;
   }

   @NotNull
   public final Pair<String, String> q() {
      return new Pair(
         IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl,
         IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl
      );
   }

   private static final Thread a(Runnable var0) {
      short var10003 = 1371;
      short var10004 = -8337;
      Thread var1 = new Thread(var0, "DiscordRPC-Thread");
      boolean var3 = false;
      var1.setDaemon(true);
      return var1;
   }

   private static final Unit r() {
      try {
         if (IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c()) {
            me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("[DiscordRPC] Connected successfully");
            IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = System.currentTimeMillis() / 1000L;
            IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.set(true);
            IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.set(false);
            lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 0;
            lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = false;
            lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = Executors.newSingleThreadScheduledExecutor(llllIIIlIIlIIIllllIllIIllIIIllIlIIllIIIIlllIIlllIlIIIIIIIlllIIllIlIllIlIlIIIIlIIlIlll::a);
            lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.scheduleAtFixedRate(IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl::i, 0L, 5L, TimeUnit.SECONDS);
         } else {
            me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("[DiscordRPC] Failed to connect to Discord — is Discord running?");
            lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = true;
         }
      } catch (Exception var1) {
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("[DiscordRPC] Initialization failed: " + var1.getMessage());
         lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = true;
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.l();
      } finally {
         IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.set(false);
      }
      return Unit.INSTANCE;
   }

   private static final void a(File param0, AtomicReference param1) {
      var var2 = me.octo.client.utils.llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      try {
        if (var2 != null) {
          IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.close();
        }
        IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new java.io.FileOutputStream(param0);
        boolean var3 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(0, "{\"v\":1,\"client_id\":\"1409601159345475694\"}");
        if (var2 != null && !var3) {
          param1.set("handshake write failed");
        }
      } catch (Exception var3) {
        param1.set(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(var3.getClass()).getSimpleName() + ":" + var3.getMessage());
      }
   }

   private static final void s() {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.m();
   }

   private static final void t() {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.j();
   }

   private static final void u() {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.j();
   }

   private static final void v() {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.j();
   }

   private static final void w() {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.i();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var26 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[85];
      int var3 = 0;
      String var2 = "@ê¸d\u001d\u0003\u009e?\u0010¶ßü\rzT®r¨ý£`!\u0018\u001dÔðß4>\u0091UÜAÑð$`Þ\u0092V\u0014Õ\u0010G\u0081\"ÛÛ\u0019Ì§V\u0095eWhVê#|ö\u0088lø\u0013¯Ô\u0017¸\u00051Ë\u001e\u0018^oÒ×\u0019çql\u0092\u001b\\\u001d!L«)\u001f·\u009d3Ge!å\u0084Ój²\u0084\u00119¾qvqN\u0088\u001e\u0004qq|3cß\u009c¿\u0018zåM£$\u0090ç(³¥Õ>cbð0Ã\u009ct/6ùR_$IZ·Æ°Ç\u0084\u0005\u0013j\u0089ÒSíîr¼árøòø·>dÀ>ñY\u008e\u009d3\u0091\u0081\u0014[\u000f6\u0080;\u0005·¼à\u0085\u007fÊLÏÝD\u009c\u000e\u008e°#?·êqíNµ\u0089¶?Ò\u0003î\u0014º\u001dA\u0002\u0098y\u0019 \u001eK\u00008Ý-MCFúnu\u0093ùô©\u0099\u0094ß?½\u008fV9`-¼\u009c\u009d\u001c\u008eÜ\u0012Ê\u009fs\u0005\u0095\\\u0083\u000fó\u008dÜWC«G3xýÚ,T®\\Áéï=äCÀ*¤X\u0087\u0083s÷¦ËZ\u008d\u001bu3 \u0018ªî$Þ3k_gdÑÓù+âOª\u0016¦fêgë9\u0019\u0005«\b×¹-ÕÙR\u0011í.ÅvÉ\u0003éÈw\u0007Z¢>zy\u0093X\u0007Û3Ò\u000e6¶:\u0005\u00ad® Ý\u0001\u0004ÔHÔ\u0005#\u0092+\u0093L\u0006½=h\u009eÇÖ*k\u009a\u0091V\u008du\u0080Æ\u0012Ã!Ú#\u009aº\u0090\u000bô_òU¨É\rqË8t©\rF\u0091\u0084è\u0015õ\u009d\u0016<a\u0097!DgÆtWÊÒï\u0080ÏÔ²bQ\u0099ð \u0098\u0011\u0015¯\u0013ûkÐ\u000e \u0086½;\u0002ÒAal¹\u000b-\u008a\b\r> \t\u0095T¨H\u0002æH\u0010\u0018±\\]\u0014±)\u0005Õ\u0011\u0014:\u0098\u0004oï\u0018¹ñ|\bhÄn¢¢¹Ú_µ\u0083\u0097u\u001f\u0015\u0098N\r\u009eG¶\u0019³\u008bDJ6 ¥>àcÅmj ¾ûé[\u0083À\u0018½+\r\"\n¤kë\u0098smÑX\b§\u0013-\t³'Ï\to\u0092È5Ô\u0014:f\u009b\u008f\u0099²Ü)Û5ðd±&'H\u0083ê\u0090ôÅcýR\u0086ª/ìév·¬p\u00962\u0095Ý1ò\u008a\u0013*\u0086{\u009a,\u0011\u0094\u0010\u0017Ðuª\u0097_}Öð\u0019OþÃ)\u0088Ù[óÌÖ\u008d\u001dB¬\u0002\u000bJ\u001b ZÂ\u0085ÙÙÖHñÃ;ªÑÏc\u0015\u008b\u009d\n_Y¥\ròAÿô\u000eNE\u0083µz9rxòg æª£\u00132v\u0088Ã<«\u0006ËO¾ÏÐdÜ\u0091±<\u001an\u0002\u0089S\u0018W37X\u0000\u0090K\u0088G\u0001%R°v\u0089\u0018\u0093]ý\u0007´÷ÜÍ\u0006\u00943õ@\u0080k\u0005ü;\noD\u001fÈí©\u0084?\u001fÚ¼\u0098ÆÎò/«\u0017\u009dçó\u0011>\u0004ë\u00076 ½R¤½\u0081B\u0007\u009e\u001ez«#\u0002\u0098#~Ú\u007fbåÃ\u0081'óµ£\u009c\u0082f¢$QÄÇØÒ<\u001eõ\u0014íÇ\u0097=å5RM\u0000q\u001e9\u0006\u0097ùø°\"I\u0087x-%SQ\u0098Â\u0016\u0018/CÃDÿÃ¶\u001e¹u©Ù\u0004\u0082g\u009el\u00020:\u0010\u008c\u0096\u0087ÔIt¾Kî®\u009dß©¸Ix\u000e{Þßô\u008f1\f\u001c\u0097<x÷\u0001Ó\u0018\u0012éïfß¦\u009aÞCNyÙa'²Tàk#ì¬\u001d&\u008a%\u0005ï\u0010Ä\b\u0017<½DæUö\\:s\u0091!Õå\u0081<4@ñg\u0088@/\t\"´xÀ\u009a\u009e]æ\u001aRw\u00967\u000fuî.\u0004¸#í½i-\u0003°«Ö¤@;õê®C\u0006y\u008f%\f«¹!êwí×·uËñºo\u008aÇ§\r\u0006IÅiUm\u0080\u008aT$GsÓc|æ\u0014'I\u001d×ÇJÁC·U©idð¦è2éÁõà.¬\u0012\rK¡hH\u0006¨£\u001fçîLä\u0083\u0013M=jö\u0090ôäns\u008fÖ_\u0017¬ã_|\u0081\u0084KÖz-ZP\u0016¨\u0003÷Ï\u0003\u0084\\'\u000e+ù\u001e2ËÞ\u000e\u009d\u0002]\u009cÊ¯?\t2\u0091\u007f8`:S\u0084;MM_Y\u0017a*\u008bíea^[Ã¦4Å\u0000Á\u0010þ\n¹f±8$Épi\u0015q⃧\u0087ê!\u0014\u0080\u008f\u0016{Y\u0094àsÆ\u0086'\u008c¨qËò\u000eýÞý\u0097ðAáÃeG\u0093{àÉ\u001d\u0081¨\u0080,\u001a\n~\u001e\f\u0092\\x}êZ¼³®Î·uöÅa\u0085R\u0003²Å\u00027g2¦\u0007Í®\u0081\u0016\b\u0012\u0016sc^Îóg@/×\u001c§\u001ahIÌ\u0006Gy¥\u009f\u000bñh2+í\u0087TÜ\u000b%¶½»§Oðy¶¯+$ÑÄÕÏq)è¿3ç¡\u008cl¼¢qVF¿ô-fG\u009c\u001c®\u008f_7kMÆ\u0011\bý\u008f\u000etiÄ0\u0092\u0089onQ¥T¾$¨$\u000fÀQ! «9*ä\u0014A¨Þó4ì ·Z¡Í¢¨é,\u000fä\u0089ÿ0@;vÔ6?\u000eØÄYÿµdý\u0016\u0091Çâ?î\u0099#7oVÔÀ\u0015%ýgî1÷Ð\u000bë\u0082\u0014mÂ\u001cN!+a\u0090«)\u001a0¸TÂé\u001da\u0004ò[\u0010g\t\u0006d¤)Ý6ºõF\u0012ÉÈo¸²\u0097ð%\u000b\u0016\u0090\u0087\bõTÕ£\u0081\u0007{m*Xâ84\ffÂrý¬¬D\u0089:@é\u0001\u0014µÅäÒDkH2\u0080)µ\u008b\u00adz¾\u0005\"\u009d,\u001f\u001b½Aaæ\u00adµXÅ r\u0001¡Þy\u0081,\u0092ÔÝü»\u000f[\u0083Ý7Ø\u0012\u0081R~F\r/BÇÂc£§\u00985R,ð<\u00047\u001a(Ã\u0004\u0090\u0004÷\u008b&\u0013ÉÒ\u0000P\u008f7®%\u0084yºÙ Ò¤,\u0085\u0011ùu\u0012 ({iÍËa8\u0003Að³ËåvÞ\u0018Öçû\u007fkt¡\u001aU\u0097ô³~i\u0006\u0083µ^\b\u0017v\u0098D¾\u001b\u001c5¢%@?Äsùºa\u0016Ù\u008aMKÜ\"F~\u0081»|X$Õ=\u0002À\u0094\u0006\t`F*ö&\n.T\u0093^«à\u008c\u001bSl\u0007A÷]Ð\u0015ÆÕ\u0010Þ=Í¸\u001cß\u008f¥PàÉã¼?ë\u0088\u0003}\u0081±";
      int var4 = "@ê¸d\u001d\u0003\u009e?\u0010¶ßü\rzT®r¨ý£`!\u0018\u001dÔðß4>\u0091UÜAÑð$`Þ\u0092V\u0014Õ\u0010G\u0081\"ÛÛ\u0019Ì§V\u0095eWhVê#|ö\u0088lø\u0013¯Ô\u0017¸\u00051Ë\u001e\u0018^oÒ×\u0019çql\u0092\u001b\\\u001d!L«)\u001f·\u009d3Ge!å\u0084Ój²\u0084\u00119¾qvqN\u0088\u001e\u0004qq|3cß\u009c¿\u0018zåM£$\u0090ç(³¥Õ>cbð0Ã\u009ct/6ùR_$IZ·Æ°Ç\u0084\u0005\u0013j\u0089ÒSíîr¼árøòø·>dÀ>ñY\u008e\u009d3\u0091\u0081\u0014[\u000f6\u0080;\u0005·¼à\u0085\u007fÊLÏÝD\u009c\u000e\u008e°#?·êqíNµ\u0089¶?Ò\u0003î\u0014º\u001dA\u0002\u0098y\u0019 \u001eK\u00008Ý-MCFúnu\u0093ùô©\u0099\u0094ß?½\u008fV9`-¼\u009c\u009d\u001c\u008eÜ\u0012Ê\u009fs\u0005\u0095\\\u0083\u000fó\u008dÜWC«G3xýÚ,T®\\Áéï=äCÀ*¤X\u0087\u0083s÷¦ËZ\u008d\u001bu3 \u0018ªî$Þ3k_gdÑÓù+âOª\u0016¦fêgë9\u0019\u0005«\b×¹-ÕÙR\u0011í.ÅvÉ\u0003éÈw\u0007Z¢>zy\u0093X\u0007Û3Ò\u000e6¶:\u0005\u00ad® Ý\u0001\u0004ÔHÔ\u0005#\u0092+\u0093L\u0006½=h\u009eÇÖ*k\u009a\u0091V\u008du\u0080Æ\u0012Ã!Ú#\u009aº\u0090\u000bô_òU¨É\rqË8t©\rF\u0091\u0084è\u0015õ\u009d\u0016<a\u0097!DgÆtWÊÒï\u0080ÏÔ²bQ\u0099ð \u0098\u0011\u0015¯\u0013ûkÐ\u000e \u0086½;\u0002ÒAal¹\u000b-\u008a\b\r> \t\u0095T¨H\u0002æH\u0010\u0018±\\]\u0014±)\u0005Õ\u0011\u0014:\u0098\u0004oï\u0018¹ñ|\bhÄn¢¢¹Ú_µ\u0083\u0097u\u001f\u0015\u0098N\r\u009eG¶\u0019³\u008bDJ6 ¥>àcÅmj ¾ûé[\u0083À\u0018½+\r\"\n¤kë\u0098smÑX\b§\u0013-\t³'Ï\to\u0092È5Ô\u0014:f\u009b\u008f\u0099²Ü)Û5ðd±&'H\u0083ê\u0090ôÅcýR\u0086ª/ìév·¬p\u00962\u0095Ý1ò\u008a\u0013*\u0086{\u009a,\u0011\u0094\u0010\u0017Ðuª\u0097_}Öð\u0019OþÃ)\u0088Ù[óÌÖ\u008d\u001dB¬\u0002\u000bJ\u001b ZÂ\u0085ÙÙÖHñÃ;ªÑÏc\u0015\u008b\u009d\n_Y¥\ròAÿô\u000eNE\u0083µz9rxòg æª£\u00132v\u0088Ã<«\u0006ËO¾ÏÐdÜ\u0091±<\u001an\u0002\u0089S\u0018W37X\u0000\u0090K\u0088G\u0001%R°v\u0089\u0018\u0093]ý\u0007´÷ÜÍ\u0006\u00943õ@\u0080k\u0005ü;\noD\u001fÈí©\u0084?\u001fÚ¼\u0098ÆÎò/«\u0017\u009dçó\u0011>\u0004ë\u00076 ½R¤½\u0081B\u0007\u009e\u001ez«#\u0002\u0098#~Ú\u007fbåÃ\u0081'óµ£\u009c\u0082f¢$QÄÇØÒ<\u001eõ\u0014íÇ\u0097=å5RM\u0000q\u001e9\u0006\u0097ùø°\"I\u0087x-%SQ\u0098Â\u0016\u0018/CÃDÿÃ¶\u001e¹u©Ù\u0004\u0082g\u009el\u00020:\u0010\u008c\u0096\u0087ÔIt¾Kî®\u009dß©¸Ix\u000e{Þßô\u008f1\f\u001c\u0097<x÷\u0001Ó\u0018\u0012éïfß¦\u009aÞCNyÙa'²Tàk#ì¬\u001d&\u008a%\u0005ï\u0010Ä\b\u0017<½DæUö\\:s\u0091!Õå\u0081<4@ñg\u0088@/\t\"´xÀ\u009a\u009e]æ\u001aRw\u00967\u000fuî.\u0004¸#í½i-\u0003°«Ö¤@;õê®C\u0006y\u008f%\f«¹!êwí×·uËñºo\u008aÇ§\r\u0006IÅiUm\u0080\u008aT$GsÓc|æ\u0014'I\u001d×ÇJÁC·U©idð¦è2éÁõà.¬\u0012\rK¡hH\u0006¨£\u001fçîLä\u0083\u0013M=jö\u0090ôäns\u008fÖ_\u0017¬ã_|\u0081\u0084KÖz-ZP\u0016¨\u0003÷Ï\u0003\u0084\\'\u000e+ù\u001e2ËÞ\u000e\u009d\u0002]\u009cÊ¯?\t2\u0091\u007f8`:S\u0084;MM_Y\u0017a*\u008bíea^[Ã¦4Å\u0000Á\u0010þ\n¹f±8$Épi\u0015q⃧\u0087ê!\u0014\u0080\u008f\u0016{Y\u0094àsÆ\u0086'\u008c¨qËò\u000eýÞý\u0097ðAáÃeG\u0093{àÉ\u001d\u0081¨\u0080,\u001a\n~\u001e\f\u0092\\x}êZ¼³®Î·uöÅa\u0085R\u0003²Å\u00027g2¦\u0007Í®\u0081\u0016\b\u0012\u0016sc^Îóg@/×\u001c§\u001ahIÌ\u0006Gy¥\u009f\u000bñh2+í\u0087TÜ\u000b%¶½»§Oðy¶¯+$ÑÄÕÏq)è¿3ç¡\u008cl¼¢qVF¿ô-fG\u009c\u001c®\u008f_7kMÆ\u0011\bý\u008f\u000etiÄ0\u0092\u0089onQ¥T¾$¨$\u000fÀQ! «9*ä\u0014A¨Þó4ì ·Z¡Í¢¨é,\u000fä\u0089ÿ0@;vÔ6?\u000eØÄYÿµdý\u0016\u0091Çâ?î\u0099#7oVÔÀ\u0015%ýgî1÷Ð\u000bë\u0082\u0014mÂ\u001cN!+a\u0090«)\u001a0¸TÂé\u001da\u0004ò[\u0010g\t\u0006d¤)Ý6ºõF\u0012ÉÈo¸²\u0097ð%\u000b\u0016\u0090\u0087\bõTÕ£\u0081\u0007{m*Xâ84\ffÂrý¬¬D\u0089:@é\u0001\u0014µÅäÒDkH2\u0080)µ\u008b\u00adz¾\u0005\"\u009d,\u001f\u001b½Aaæ\u00adµXÅ r\u0001¡Þy\u0081,\u0092ÔÝü»\u000f[\u0083Ý7Ø\u0012\u0081R~F\r/BÇÂc£§\u00985R,ð<\u00047\u001a(Ã\u0004\u0090\u0004÷\u008b&\u0013ÉÒ\u0000P\u008f7®%\u0084yºÙ Ò¤,\u0085\u0011ùu\u0012 ({iÍËa8\u0003Að³ËåvÞ\u0018Öçû\u007fkt¡\u001aU\u0097ô³~i\u0006\u0083µ^\b\u0017v\u0098D¾\u001b\u001c5¢%@?Äsùºa\u0016Ù\u008aMKÜ\"F~\u0081»|X$Õ=\u0002À\u0094\u0006\t`F*ö&\n.T\u0093^«à\u008c\u001bSl\u0007A÷]Ð\u0015ÆÕ\u0010Þ=Í¸\u001cß\u008f¥PàÉã¼?ë\u0088\u0003}\u0081±"
         .length();
      char var1 = '#';
      int var8 = -1;

      label52:
      while (true) {
         short var10000 = 16;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var30 = var10001.toCharArray();
               int var10004 = var30.length;
               int var6 = 0;
               byte var33 = (byte)var10000;
               var26 = var30;
               int var17 = var10004;
               byte var38;
               char[] var42;
               int var10006;
               if (var10004 <= 1) {
                  var42 = var30;
                  var38 = (byte)var10000;
                  var10006 = var6;
               } else {
                  var33 = (byte)var10000;
                  var17 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var42 = var30;
                  var38 = (byte)var10000;
                  var10006 = var6;
               }

               while (true) {
                  var42[var10006] = (char)(var42[var10006] ^ var38 ^ switch (var6 % 7) {
                     case 0 -> 14;
                     case 1 -> 20;
                     case 2 -> 58;
                     case 3 -> 22;
                     case 4 -> 120;
                     case 5 -> 45;
                     default -> 93;
                  });
                  var6++;
                  if (var33 == 0) {
                     var10006 = var33;
                     var42 = var26;
                     var38 = var33;
                  } else {
                     if (var17 <= var6) {
                        break;
                     }

                     var42 = var26;
                     var38 = var33;
                     var10006 = var6;
                  }
               }
            }

            String var35 = new String(var26).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var35;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[85];
                     var10000 = 1401;
                     short var19 = 9724;
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = "1409601159345475694";
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llllIIIlIIlIIIllllIllIIllIIIllIlIIllIIIIlllIIlllIlIIIIIIIlllIIllIlIllIlIlIIIIlIIlIlll();
                     var10000 = 1297;
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new AtomicBoolean(false);
                     short var20 = -31770;
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new AtomicBoolean(false);
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new AtomicBoolean(false);
                     llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new AtomicInteger(0);
                     IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = "Idle";
                     var10000 = 1407;
                     short var21 = -15592;
                     IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = "In Menu";
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var35;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "P¡má·XÕã\u009be\u000f½\u008eòS\u0099YARRõ\u0014Ï'¸´\u001f\u0017QÕ¯]\u008eB´ÚØ\u0014K\u008a\u008cµõ£:ûj§\u0088\t\u0000f\u001eEºLn\u009a\u008e\u0001\u008aÉs";
                  var4 = "P¡má·XÕã\u009be\u000f½\u008eòS\u0099YARRõ\u0014Ï'¸´\u001f\u0017QÕ¯]\u008eB´ÚØ\u0014K\u008a\u008cµõ£:ûj§\u0088\t\u0000f\u001eEºLn\u009a\u008e\u0001\u008aÉs"
                     .length();
                  var1 = 23;
                  var8 = -1;
            }

            var10000 = 102;
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
      int var2 = (var0 ^ 1368) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 165;
            case 1 -> 162;
            case 2 -> 84;
            case 3 -> 102;
            case 4 -> 129;
            case 5 -> 29;
            case 6 -> 141;
            case 7 -> 216;
            case 8 -> 52;
            case 9 -> 235;
            case 10 -> 76;
            case 11 -> 159;
            case 12 -> 85;
            case 13 -> 126;
            case 14 -> 136;
            case 15 -> 32;
            case 16 -> 144;
            case 17 -> 24;
            case 18 -> 3;
            case 19 -> 114;
            case 20 -> 205;
            case 21 -> 98;
            case 22 -> 170;
            case 23 -> 110;
            case 24 -> 111;
            case 25 -> 206;
            case 26 -> 63;
            case 27 -> 27;
            case 28 -> 37;
            case 29 -> 139;
            case 30 -> 133;
            case 31 -> 13;
            case 32 -> 82;
            case 33 -> 232;
            case 34 -> 215;
            case 35 -> 184;
            case 36 -> 169;
            case 37 -> 119;
            case 38 -> 21;
            case 39 -> 12;
            case 40 -> 161;
            case 41 -> 210;
            case 42 -> 163;
            case 43 -> 197;
            case 44 -> 223;
            case 45 -> 101;
            case 46 -> 78;
            case 47 -> 68;
            case 48 -> 140;
            case 49 -> 4;
            case 50 -> 113;
            case 51 -> 121;
            case 52 -> 158;
            case 53 -> 33;
            case 54 -> 16;
            case 55 -> 196;
            case 56 -> 61;
            case 57 -> 38;
            case 58 -> 104;
            case 59 -> 100;
            case 60 -> 107;
            case 61 -> 125;
            case 62 -> 15;
            case 63 -> 48;
            case 64 -> 130;
            case 65 -> 164;
            case 66 -> 49;
            case 67 -> 246;
            case 68 -> 146;
            case 69 -> 160;
            case 70 -> 123;
            case 71 -> 245;
            case 72 -> 231;
            case 73 -> 42;
            case 74 -> 57;
            case 75 -> 154;
            case 76 -> 190;
            case 77 -> 1;
            case 78 -> 46;
            case 79 -> 148;
            case 80 -> 182;
            case 81 -> 199;
            case 82 -> 96;
            case 83 -> 109;
            case 84 -> 249;
            case 85 -> 92;
            case 86 -> 189;
            case 87 -> 8;
            case 88 -> 150;
            case 89 -> 214;
            case 90 -> 90;
            case 91 -> 118;
            case 92 -> 87;
            case 93 -> 60;
            case 94 -> 122;
            case 95 -> 45;
            case 96 -> 208;
            case 97 -> 35;
            case 98 -> 244;
            case 99 -> 238;
            case 100 -> 26;
            case 101 -> 243;
            case 102 -> 103;
            case 103 -> 23;
            case 104 -> 18;
            case 105 -> 219;
            case 106 -> 224;
            case 107 -> 173;
            case 108 -> 43;
            case 109 -> 51;
            case 110 -> 117;
            case 111 -> 186;
            case 112 -> 194;
            case 113 -> 20;
            case 114 -> 108;
            case 115 -> 204;
            case 116 -> 212;
            case 117 -> 230;
            case 118 -> 28;
            case 119 -> 75;
            case 120 -> 71;
            case 121 -> 233;
            case 122 -> 253;
            case 123 -> 65;
            case 124 -> 40;
            case 125 -> 62;
            case 126 -> 88;
            case 127 -> 191;
            case 128 -> 79;
            case 129 -> 225;
            case 130 -> 229;
            case 131 -> 203;
            case 132 -> 30;
            case 133 -> 202;
            case 134 -> 217;
            case 135 -> 5;
            case 136 -> 174;
            case 137 -> 236;
            case 138 -> 106;
            case 139 -> 145;
            case 140 -> 77;
            case 141 -> 185;
            case 142 -> 31;
            case 143 -> 81;
            case 144 -> 237;
            case 145 -> 70;
            case 146 -> 168;
            case 147 -> 112;
            case 148 -> 14;
            case 149 -> 179;
            case 150 -> 59;
            case 151 -> 74;
            case 152 -> 2;
            case 153 -> 124;
            case 154 -> 183;
            case 155 -> 39;
            case 156 -> 56;
            case 157 -> 234;
            case 158 -> 94;
            case 159 -> 128;
            case 160 -> 255;
            case 161 -> 251;
            case 162 -> 181;
            case 163 -> 252;
            case 164 -> 218;
            case 165 -> 222;
            case 166 -> 7;
            case 167 -> 69;
            case 168 -> 151;
            case 169 -> 54;
            case 170 -> 147;
            case 171 -> 176;
            case 172 -> 166;
            case 173 -> 53;
            case 174 -> 248;
            case 175 -> 134;
            case 176 -> 142;
            case 177 -> 211;
            case 178 -> 17;
            case 179 -> 180;
            case 180 -> 172;
            case 181 -> 19;
            case 182 -> 89;
            case 183 -> 201;
            case 184 -> 247;
            case 185 -> 64;
            case 186 -> 198;
            case 187 -> 135;
            case 188 -> 192;
            case 189 -> 105;
            case 190 -> 221;
            case 191 -> 9;
            case 192 -> 11;
            case 193 -> 167;
            case 194 -> 241;
            case 195 -> 132;
            case 196 -> 95;
            case 197 -> 187;
            case 198 -> 120;
            case 199 -> 171;
            case 200 -> 116;
            case 201 -> 44;
            case 202 -> 41;
            case 203 -> 226;
            case 204 -> 127;
            case 205 -> 239;
            case 206 -> 66;
            case 207 -> 55;
            case 208 -> 58;
            case 209 -> 157;
            case 210 -> 22;
            case 211 -> 47;
            case 212 -> 213;
            case 213 -> 149;
            case 214 -> 177;
            case 215 -> 115;
            case 216 -> 209;
            case 217 -> 143;
            case 218 -> 220;
            case 219 -> 131;
            case 220 -> 207;
            case 221 -> 25;
            case 222 -> 155;
            case 223 -> 36;
            case 224 -> 242;
            case 225 -> 138;
            case 226 -> 227;
            case 227 -> 188;
            case 228 -> 178;
            case 229 -> 0;
            case 230 -> 195;
            case 231 -> 254;
            case 232 -> 200;
            case 233 -> 80;
            case 234 -> 97;
            case 235 -> 152;
            case 236 -> 93;
            case 237 -> 72;
            case 238 -> 175;
            case 239 -> 10;
            case 240 -> 156;
            case 241 -> 6;
            case 242 -> 137;
            case 243 -> 83;
            case 244 -> 228;
            case 245 -> 50;
            case 246 -> 153;
            case 247 -> 193;
            case 248 -> 86;
            case 249 -> 240;
            case 250 -> 73;
            case 251 -> 34;
            case 252 -> 99;
            case 253 -> 91;
            case 254 -> 67;
            default -> 250;
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
