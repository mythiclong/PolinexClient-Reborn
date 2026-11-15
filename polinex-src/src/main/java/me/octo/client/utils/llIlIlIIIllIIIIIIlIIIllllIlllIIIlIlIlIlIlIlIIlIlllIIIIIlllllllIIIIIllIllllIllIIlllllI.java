package me.octo.client.utils;

import java.lang.Thread.UncaughtExceptionHandler;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Lazy;
import sun.misc.Unsafe;

public final class llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI {
   public static llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI();
   private static AtomicLong lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new AtomicLong(0L);
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = null;
   private static String[] a;
   private static String[] b;

   private llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI() {
   }

   private final String a(String var1) {
      String var2 = var1 == null ? "<null>" : var1.trim();
      if (var2.isEmpty()) {
         var2 = "<empty>";
      }

      StringBuilder var3 = new StringBuilder(160);
      var3.append(var2).append(" | thread=").append(Thread.currentThread().getName());
      StackTraceElement[] var4 = Thread.currentThread().getStackTrace();

      for (StackTraceElement var8 : var4) {
         String var9 = var8.getClassName();
         if (!var9.equals(Thread.class.getName())
            && !var9.equals(llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.class.getName())) {
            var3.append(" | at ").append(a(var8));
            break;
         }
      }

      return var3.toString();
   }

   private final void a(String var1, String var2) {
      String var3 = var1 != null && !var1.isBlank() ? var1.trim() : "ExceptionUtils";
      String var4 = var2 == null ? "<null>" : var2;
      String var5 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.ROOT).format(new Date());
      String var6 = "[" + var5 + "] " + var3 + ": " + var4;
      System.err.println(var6);
      reflectLog("me.octo.client.utils.IIIIIlllllIIIllIlIlIlllllIIIllIIIllllIIIIIIlIIIIIlIIlIllIlIIllllllllllllIIIIlIlIlllII", "e", var6);
      reflectLog("me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI", "e", var6);
   }

   public final void a() {
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.set(System.currentTimeMillis());
      UncaughtExceptionHandler var1 = (var0, var1x) -> a(var0, var1x);
      Thread.setDefaultUncaughtExceptionHandler(var1);

      try {
         Thread.currentThread().setUncaughtExceptionHandler(var1);
      } catch (Throwable var3) {
      }
   }

   public final void b(String var1) {
      String var2 = this.a(var1);
      long var3 = System.currentTimeMillis();
      long var5 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getAndSet(var3);
      if (var5 > 0L && var3 - var5 <= 50L) {
         System.err.println("[ExceptionUtils] repeated signal: " + var2);
      } else {
         this.a("Security/Error signal", var2);
      }
   }

   private static final CharSequence a(StackTraceElement var0) {
      if (var0 == null) {
         return "Object /* PX-FIX */";
      } else {
         StringBuilder var1 = new StringBuilder(96);
         var1.append(var0.getClassName()).append('.').append(var0.getMethodName());
         if (var0.isNativeMethod()) {
            var1.append("(Native Method)");
         } else if (var0.getFileName() != null) {
            var1.append('(').append(var0.getFileName());
            if (var0.getLineNumber() >= 0) {
               var1.append(':').append(var0.getLineNumber());
            }

            var1.append(')');
         } else {
            var1.append("(Unknown Source)");
         }

         return var1;
      }
   }

   private static final void a(Lazy var0, Lazy var1) {
      forceLazy(var0);
      forceLazy(var1);
   }

   private static final void a(Thread var0, Throwable var1) {
      Thread var2 = var0 == null ? Thread.currentThread() : var0;
      Object var3 = var1 == null ? new NullPointerException("Uncaught throwable was null") : var1;
      StringBuilder var4 = new StringBuilder(256);
      var4.append("Uncaught exception in ").append(var2.getName()).append(": ").append(var3.getClass().getName());
      if (((me.octo.client.PXDyn)var3).getMessage() != null) {
         var4.append(": ").append(((String)((me.octo.client.PXDyn)var3).getMessage()));
      }

      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a("UncaughtException", var4.toString());
      ((me.octo.client.PXDyn)var3).printStackTrace(System.err);
   }

   private static final llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
      Lazy var0
   ) {
      Object var1 = forceLazy(var0);
      return var1 instanceof llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
         ? (llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var1
         : b();
   }

   private static final llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll b() {
      return new llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll();
   }

   private static final Unsafe b(Lazy var0) {
      Object var1 = forceLazy(var0);
      return var1 instanceof Unsafe ? (Unsafe)var1 : c();
   }

   private static final Unsafe c() {
      return getUnsafeOrNull();
   }

   private static final void a(List var0, Lazy var1, Lazy var2) {
      if (var0 != null) {
         Object var3 = forceLazy(var1);
         Object var4 = forceLazy(var2);
         if (var3 != null) {
            var0.add(var3);
         }

         if (var4 != null) {
            var0.add(var4);
         }
      } else {
         forceLazy(var1);
         forceLazy(var2);
      }
   }

   private static final void c(Lazy var0) {
      forceLazy(var0);
   }

   private static final void b(Lazy var0, Lazy var1) {
      forceLazy(var0);
      forceLazy(var1);
   }

   private static final void b(Thread var0, Throwable var1) {
      a(var0, var1);
   }

   private static final llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI d(
      Lazy var0
   ) {
      Object var1 = forceLazy(var0);
      return var1 instanceof llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
         ? (llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var1
         : d();
   }

   private static final llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI d() {
      return new llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI();
   }

   private static final Unsafe e(Lazy var0) {
      Object var1 = forceLazy(var0);
      return var1 instanceof Unsafe ? (Unsafe)var1 : e();
   }

   private static final Unsafe e() {
      return getUnsafeOrNull();
   }

   private static final void c(String var0) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a("ExceptionUtils", var0 == null ? "<null>" : var0);
   }

   private static final void b(List var0, Lazy var1, Lazy var2) {
      a(var0, var1, var2);
   }

   private static final void f(Lazy var0) {
      forceLazy(var0);
   }

   static void $jnicClinit() {
      a = new String[0];
      b = new String[0];
   }

   public static void b(lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var0) {
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var0;
   }

   public static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] f() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 2357) & 65535;
      if (b != null && var2 >= 0 && var2 < b.length && b[var2] != null) {
         return b[var2];
      } else {
         String var3 = "<jnic-string:" + var0 + ":" + var1 + ">";
         if (b != null && var2 >= 0 && var2 < b.length) {
            b[var2] = var3;
         }

         return var3;
      }
   }

   public static void $jnicLoader() {
   }

   private static Object forceLazy(Lazy var0) {
      if (var0 == null) {
         return null;
      } else {
         try {
            return var0.getValue();
         } catch (Throwable var2) {
            System.err.println("[ExceptionUtils] lazy evaluation failed: " + var2);
            return null;
         }
      }
   }

   private static Unsafe getUnsafeOrNull() {
      try {
         Field var0 = Unsafe.class.getDeclaredField("theUnsafe");
         var0.setAccessible(true);
         return (Unsafe)var0.get(null);
      } catch (Throwable var1) {
         return null;
      }
   }

   private static void reflectLog(String var0, String var1, String var2) {
      try {
         Class var3 = Class.forName(var0);
         Method var4 = var3.getDeclaredMethod(var1, String.class);
         var4.setAccessible(true);
         var4.invoke(null, var2);
      } catch (Throwable var5) {
      }
   }

   static {
      $jnicClinit();
   }

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI extends RuntimeException {
      private static String a = "java.lang.OutOfMemoryError: GC overhead limit exceeded";

      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
      }

      @Override
      public Throwable fillInStackTrace() {
         return this;
      }

      @Override
      public String getMessage() {
         return null;
      }

      @Override
      public String toString() {
         return a;
      }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll extends RuntimeException {
      private static String a = "java.lang.OutOfMemoryError: GC overhead limit exceeded";

      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @Override
      public Throwable fillInStackTrace() {
         return this;
      }

      @Override
      public String getMessage() {
         return null;
      }

      @Override
      public String toString() {
         return a;
      }
   }
}
