package me.octo.client.utils;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll extends ClassLoader {
   public static <T> T a(Object p0) { return null; } // PX-FIX ovld


   public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(ClassLoader var1) {
      super(var1 == null ? Thread.currentThread().getContextClassLoader() : var1);
   }

   public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(ClassLoader var1, int var2, DefaultConstructorMarker var3) {
      this((var2 & 1) == 0 && var1 != null ? var1 : Thread.currentThread().getContextClassLoader());
   }

   public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      this(null, 1, null);
   }

   public final Class<?> a(String var1, byte[] var2) {
      if (var2 == null) {
         throw new NullPointerException("bytecode");
      } else if (var2.length == 0) {
         throw new ClassFormatError("Empty class bytecode");
      } else {
         synchronized (this.getClassLoadingLock(var1 == null ? "<anonymous>" : var1)) {
            if (var1 != null) {
               Class var4 = this.findLoadedClass(var1);
               if (var4 != null) {
                  return var4;
               }
            }

            return this.defineClass(var1, var2, 0, var2.length);
         }
      }
   }

   @Override
   protected Class<?> loadClass(String var1, boolean var2) throws ClassNotFoundException {
      if (var1 == null) {
         throw new NullPointerException("name");
      } else {
         synchronized (this.getClassLoadingLock(var1)) {
            Class var4 = this.findLoadedClass(var1);
            if (var4 == null) {
               var4 = super.loadClass(var1, false);
            }

            if (var2) {
               this.resolveClass(var4);
            }

            return var4;
         }
      }
   }

   static void $jnicClinit() {
   }

   public static void $jnicLoader() {
   }
}
