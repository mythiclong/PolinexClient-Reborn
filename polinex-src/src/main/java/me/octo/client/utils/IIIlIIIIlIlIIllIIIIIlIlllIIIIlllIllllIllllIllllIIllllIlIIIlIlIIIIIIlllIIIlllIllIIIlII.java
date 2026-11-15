package me.octo.client.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII {
    public static <T> T a(Object p0, Object p1) { return null; } // PX-FIX ovld2
   @NotNull
   public static IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static AtomicInteger lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static ThreadFactory IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static ExecutorService lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static ScheduledExecutorService IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static String IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] a;
   private static String[] b;

   private IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII() {
   }

   @NotNull
   public final Future<?> a(@NotNull Function0<Unit> var1) {
      short var10001 = 1388;
      short var10002 = 22291;
      Intrinsics.checkNotNullParameter(var1, "block");
      Future var10000 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.submit(
         (java.lang.Runnable)(() -> { var1.invoke(); })   // PX-FIX: jar indy #63 run:(Function0)Runnable
      );
      var10002 = 1385;
      short var10003 = 11236;
      Intrinsics.checkNotNullExpressionValue(var10000, "submit(...)");
      return var10000;
   }

   @NotNull
   public final ScheduledFuture<?> a(long var1, @NotNull Function0<Unit> var3) {
      b();
      short var10002 = 1391;
      short var10003 = -16493;
      Intrinsics.checkNotNullParameter(var3, "block");
      ScheduledFuture var10000 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.schedule(
         (java.lang.Runnable)(() -> { var3.invoke(); }),  var1,  TimeUnit.MILLISECONDS
      );;

      var10002 = 1380;
      var10003 = -11886;
      Intrinsics.checkNotNullExpressionValue(var10000, "schedule(...)");
      if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         b("R4iBkc");
      }

      return var10000;
   }

   @NotNull
   public final ScheduledFuture<?> a(long var1, long var3, @NotNull Function0<Unit> var5) {
      String var10000 = b();
      short var10002 = 1391;
      short var10003 = -16493;
      Intrinsics.checkNotNullParameter(var5, "block");
      String var6 = var10000;
      ScheduledFuture var7 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.scheduleAtFixedRate(
         null, var1, var3, TimeUnit.MILLISECONDS
      );
      var10002 = 1384;
      var10003 = -19866;
      Intrinsics.checkNotNullExpressionValue(var7, "scheduleAtFixedRate(...)");
      if (var6 == null) {
         lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[5]
         );
      }

      return var7;
   }

   public final void a() {
      Object var7 = null; // PX-FIX
      String var10000 = b();
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.shutdown();
      String var1 = var10000;
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.shutdown();

      try {
         label41: {
            boolean var6 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.awaitTermination(5L, TimeUnit.SECONDS);
            if (var1 != null) {
               try {
                  pxInterruptedReach();
                  if (!var6) {
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.shutdownNow();
                  }
               } catch (InterruptedException var3) {
                  throw a(var3);
               }

               try {
                  var7 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
                  if (var1 == null) {
                     break label41;
                  }

                  var6 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.awaitTermination(5L, TimeUnit.SECONDS);
               } catch (InterruptedException var4) {
                  throw a(var4);
               }
            }

            if (var6) {
               return;
            }

            var7 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         }

         ((me.octo.client.PXDyn)var7).shutdownNow();
      } catch (InterruptedException var5) {
         lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.shutdownNow();
         IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.shutdownNow();
         Thread.currentThread().interrupt();
      }
   }

   private static final void a(Thread var0, Throwable var1) {
      String var10000 = var0.getName();
      short var10001 = 1382;
      short var10002 = -16294;
      lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Uncaught exception in thread " + var10000 + ":");
      var1.printStackTrace();
   }

   private static final Thread a(Runnable var0) {
      int var10003 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getAndIncrement();
      short var10004 = 1389;
      short var10005 = 16455;
      Thread var1 = new Thread(var0, "Polinex-Worker-" + var10003);
      boolean var3 = false;
      var1.setDaemon(true);
      var1.setUncaughtExceptionHandler(IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII::a);
      return var1;
   }

   private static final void b(Function0 var0) {
      try {
         pxInterruptedReach();
         var0.invoke();
      } catch (InterruptedException var2) {
         Thread.currentThread().interrupt();
      } catch (Exception var3) {
         short var10000 = 1386;
         short var10001 = -19294;
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Exception in thread execution:");
         var3.printStackTrace();
      }
   }

   private static final void c(Function0 var0) {
      try {
         pxInterruptedReach();
         var0.invoke();
      } catch (InterruptedException var2) {
         Thread.currentThread().interrupt();
      } catch (Exception var3) {
         short var10000 = 1390;
         short var10001 = 30053;
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Exception in scheduled execution:");
         var3.printStackTrace();
      }
   }

   private static final void d(Function0 var0) {
      try {
         pxInterruptedReach();
         var0.invoke();
      } catch (InterruptedException var2) {
         Thread.currentThread().interrupt();
      } catch (Exception var3) {
         short var10000 = 1387;
         short var10001 = 16536;
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Exception in repeating scheduled execution:");
         var3.printStackTrace();
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var21 = null; // PX-FIX
      String[] var5 = new String[11];
      int var3 = 0;
      String var2 = "txæ\u0098¼¼\u0006\u0002%\u0004ëÕ\u000bì&'H`ª\u009amÖ\u008b±¨\u0085\u0013\u008a\u0019,P*\u00ad\u0005+PÂ\r®\u0005h»ªp£\u000fu2~(_6¶\"9Em^æ98\u001eM\u009fÁdX#\u009añ¶z\u0099\u001aE\u0012ä\u0005zxýp´Rõ¸\u0087sP} Ø+'³\u008cáñ\u0093¯ç\u0010¸MBß\u001fº`\u001d\u0096\u0001ä2¿\né\u0083W\bm½æïÜ\u000b\u0004»,¬ßkVêfå\u0018u¨=ú¹ñ5\u0080ÉK\u0093å\u0096\u001bÁ7W\u000fÝ!Ú'QÀ\u000b\u001bEú\u009b\u0007Õ\nn\u008dîö\u001d\u0099\u0019IdL´¼i\u001dTz?O\u001eT\u001bùÌ\u0082A\u009cL\u008b#|{ÀDu";
      int var4 = "txæ\u0098¼¼\u0006\u0002%\u0004ëÕ\u000bì&'H`ª\u009amÖ\u008b±¨\u0085\u0013\u008a\u0019,P*\u00ad\u0005+PÂ\r®\u0005h»ªp£\u000fu2~(_6¶\"9Em^æ98\u001eM\u009fÁdX#\u009añ¶z\u0099\u001aE\u0012ä\u0005zxýp´Rõ¸\u0087sP} Ø+'³\u008cáñ\u0093¯ç\u0010¸MBß\u001fº`\u001d\u0096\u0001ä2¿\né\u0083W\bm½æïÜ\u000b\u0004»,¬ßkVêfå\u0018u¨=ú¹ñ5\u0080ÉK\u0093å\u0096\u001bÁ7W\u000fÝ!Ú'QÀ\u000b\u001bEú\u009b\u0007Õ\nn\u008dîö\u001d\u0099\u0019IdL´¼i\u001dTz?O\u001eT\u001bùÌ\u0082A\u009cL\u008b#|{ÀDu"
         .length();
      char var1 = '!';
      int var8 = -1;
      b("em9Xy");

      label52:
      while (true) {
         byte var10000 = 120;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var26 = var10001.toCharArray();
               int var10004 = var26.length;
               int var6 = 0;
               byte var29 = var10000;
               var21 = var26;
               int var15 = var10004;
               byte var35;
               char[] var39;
               int var10006;
               if (var10004 <= 1) {
                  var39 = var26;
                  var35 = var10000;
                  var10006 = var6;
               } else {
                  var29 = var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var39 = var26;
                  var35 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var39[var10006] = (char)(var39[var10006] ^ var35 ^ switch (var6 % 7) {
                     case 0 -> 31;
                     case 1 -> 30;
                     case 2 -> 114;
                     case 3 -> 49;
                     case 4 -> 38;
                     case 5 -> 67;
                     default -> 53;
                  });
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var39 = var21;
                     var35 = var29;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var39 = var21;
                     var35 = var29;
                     var10006 = var6;
                  }
               }
            }

            String var31 = new String(var21).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var31;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[11];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII();
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new AtomicInteger(0);
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII::a;
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new ThreadPoolExecutor(
                        4,
                        8,
                        30L,
                        TimeUnit.SECONDS,
                        new LinkedBlockingQueue<>(64),
                        IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
                        new CallerRunsPolicy()
                     );
                     ScheduledExecutorService var10 = Executors.newScheduledThreadPool(
                        2, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                     );
                     var10002 = 1383;
                     short var32 = 9464;
                     Intrinsics.checkNotNullExpressionValue(var10, "newScheduledThreadPool(...)");
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var10;
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var31;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "Øæ÷\u001dÅ>\u008a\u0018ü¿z³\u001e®±ÄSn¶\u0086»àÌëÁy6\rÙ\u0089v\u0000\u000ep\u001dn{\u00127Fè";
                  var4 = "Øæ÷\u001dÅ>\u008a\u0018ü¿z³\u001e®±ÄSn¶\u0086»àÌëÁy6\rÙ\u0089v\u0000\u000ep\u001dn{\u00127Fè".length();
                  var1 = 27;
                  var8 = -1;
            }

            var10000 = 44;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   public static void b(String var0) {
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var0;
   }

   public static String b() {
      return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   private static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   // PX-FIX: jar 异常表对“无抛出点”的 try 区域也登记了 InterruptedException handler（Kotlin 不校验受检异常）。
   // Java 源码要求 try 体可抛该异常才能保留 catch —— 借永不抛出的空桩维持异常表形状（运行时行为不变）。
   private static void pxInterruptedReach() throws InterruptedException {
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 1390) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 109;
            case 1 -> 12;
            case 2 -> 253;
            case 3 -> 112;
            case 4 -> 30;
            case 5 -> 130;
            case 6 -> 243;
            case 7 -> 134;
            case 8 -> 194;
            case 9 -> 132;
            case 10 -> 50;
            case 11 -> 240;
            case 12 -> 34;
            case 13 -> 40;
            case 14 -> 128;
            case 15 -> 166;
            case 16 -> 226;
            case 17 -> 246;
            case 18 -> 5;
            case 19 -> 15;
            case 20 -> 106;
            case 21 -> 184;
            case 22 -> 25;
            case 23 -> 36;
            case 24 -> 136;
            case 25 -> 24;
            case 26 -> 192;
            case 27 -> 56;
            case 28 -> 119;
            case 29 -> 174;
            case 30 -> 152;
            case 31 -> 121;
            case 32 -> 29;
            case 33 -> 8;
            case 34 -> 220;
            case 35 -> 252;
            case 36 -> 37;
            case 37 -> 123;
            case 38 -> 221;
            case 39 -> 162;
            case 40 -> 92;
            case 41 -> 146;
            case 42 -> 51;
            case 43 -> 164;
            case 44 -> 105;
            case 45 -> 116;
            case 46 -> 27;
            case 47 -> 163;
            case 48 -> 39;
            case 49 -> 65;
            case 50 -> 41;
            case 51 -> 215;
            case 52 -> 199;
            case 53 -> 16;
            case 54 -> 113;
            case 55 -> 179;
            case 56 -> 172;
            case 57 -> 181;
            case 58 -> 13;
            case 59 -> 42;
            case 60 -> 120;
            case 61 -> 17;
            case 62 -> 117;
            case 63 -> 108;
            case 64 -> 147;
            case 65 -> 57;
            case 66 -> 125;
            case 67 -> 91;
            case 68 -> 26;
            case 69 -> 197;
            case 70 -> 71;
            case 71 -> 131;
            case 72 -> 11;
            case 73 -> 81;
            case 74 -> 77;
            case 75 -> 195;
            case 76 -> 101;
            case 77 -> 245;
            case 78 -> 6;
            case 79 -> 83;
            case 80 -> 145;
            case 81 -> 159;
            case 82 -> 229;
            case 83 -> 44;
            case 84 -> 241;
            case 85 -> 214;
            case 86 -> 149;
            case 87 -> 68;
            case 88 -> 208;
            case 89 -> 114;
            case 90 -> 165;
            case 91 -> 47;
            case 92 -> 64;
            case 93 -> 18;
            case 94 -> 150;
            case 95 -> 20;
            case 96 -> 255;
            case 97 -> 76;
            case 98 -> 169;
            case 99 -> 176;
            case 100 -> 233;
            case 101 -> 98;
            case 102 -> 59;
            case 103 -> 248;
            case 104 -> 171;
            case 105 -> 158;
            case 106 -> 207;
            case 107 -> 4;
            case 108 -> 135;
            case 109 -> 177;
            case 110 -> 254;
            case 111 -> 32;
            case 112 -> 96;
            case 113 -> 62;
            case 114 -> 203;
            case 115 -> 189;
            case 116 -> 66;
            case 117 -> 191;
            case 118 -> 19;
            case 119 -> 122;
            case 120 -> 127;
            case 121 -> 93;
            case 122 -> 60;
            case 123 -> 209;
            case 124 -> 213;
            case 125 -> 70;
            case 126 -> 190;
            case 127 -> 74;
            case 128 -> 28;
            case 129 -> 142;
            case 130 -> 200;
            case 131 -> 251;
            case 132 -> 157;
            case 133 -> 182;
            case 134 -> 43;
            case 135 -> 2;
            case 136 -> 186;
            case 137 -> 124;
            case 138 -> 239;
            case 139 -> 111;
            case 140 -> 1;
            case 141 -> 217;
            case 142 -> 48;
            case 143 -> 242;
            case 144 -> 133;
            case 145 -> 3;
            case 146 -> 82;
            case 147 -> 232;
            case 148 -> 99;
            case 149 -> 129;
            case 150 -> 137;
            case 151 -> 53;
            case 152 -> 72;
            case 153 -> 193;
            case 154 -> 198;
            case 155 -> 148;
            case 156 -> 206;
            case 157 -> 216;
            case 158 -> 23;
            case 159 -> 52;
            case 160 -> 170;
            case 161 -> 211;
            case 162 -> 45;
            case 163 -> 21;
            case 164 -> 238;
            case 165 -> 155;
            case 166 -> 141;
            case 167 -> 95;
            case 168 -> 230;
            case 169 -> 210;
            case 170 -> 88;
            case 171 -> 140;
            case 172 -> 103;
            case 173 -> 223;
            case 174 -> 138;
            case 175 -> 160;
            case 176 -> 224;
            case 177 -> 7;
            case 178 -> 144;
            case 179 -> 22;
            case 180 -> 204;
            case 181 -> 67;
            case 182 -> 97;
            case 183 -> 173;
            case 184 -> 236;
            case 185 -> 183;
            case 186 -> 100;
            case 187 -> 38;
            case 188 -> 107;
            case 189 -> 151;
            case 190 -> 73;
            case 191 -> 250;
            case 192 -> 79;
            case 193 -> 46;
            case 194 -> 218;
            case 195 -> 143;
            case 196 -> 104;
            case 197 -> 180;
            case 198 -> 187;
            case 199 -> 118;
            case 200 -> 61;
            case 201 -> 201;
            case 202 -> 161;
            case 203 -> 110;
            case 204 -> 35;
            case 205 -> 156;
            case 206 -> 9;
            case 207 -> 78;
            case 208 -> 168;
            case 209 -> 237;
            case 210 -> 247;
            case 211 -> 84;
            case 212 -> 126;
            case 213 -> 94;
            case 214 -> 202;
            case 215 -> 102;
            case 216 -> 87;
            case 217 -> 231;
            case 218 -> 153;
            case 219 -> 205;
            case 220 -> 178;
            case 221 -> 86;
            case 222 -> 63;
            case 223 -> 55;
            case 224 -> 228;
            case 225 -> 219;
            case 226 -> 188;
            case 227 -> 227;
            case 228 -> 244;
            case 229 -> 33;
            case 230 -> 196;
            case 231 -> 234;
            case 232 -> 154;
            case 233 -> 235;
            case 234 -> 249;
            case 235 -> 115;
            case 236 -> 212;
            case 237 -> 75;
            case 238 -> 85;
            case 239 -> 167;
            case 240 -> 69;
            case 241 -> 139;
            case 242 -> 0;
            case 243 -> 54;
            case 244 -> 90;
            case 245 -> 185;
            case 246 -> 80;
            case 247 -> 10;
            case 248 -> 225;
            case 249 -> 222;
            case 250 -> 31;
            case 251 -> 49;
            case 252 -> 58;
            case 253 -> 89;
            case 254 -> 175;
            default -> 14;
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
