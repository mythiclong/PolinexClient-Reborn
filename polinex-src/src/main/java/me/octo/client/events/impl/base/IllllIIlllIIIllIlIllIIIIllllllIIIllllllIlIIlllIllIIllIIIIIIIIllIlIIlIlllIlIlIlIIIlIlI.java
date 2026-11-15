package me.octo.client.events.impl.base;

import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
   implements me.octo.client.events.impl.base.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {

      // PX-FIX TOP5F: Kotlin default-args synthetic ctor (mask bit 1 -> new me.octo.client.events.impl.base.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll())
      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(me.octo.client.events.impl.base.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll pxP0, int pxMask, kotlin.jvm.internal.DefaultConstructorMarker pxM) {
         if ((pxMask & 1) != 0) {
            pxP0 = new me.octo.client.events.impl.base.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll();
         }
         this(pxP0);
      }
   public static <T> T a(Object p0, Object p1, Object p2) { return null; } // PX-FIX ovld

        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(Object... px) {
           this((me.octo.client.events.impl.base.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)null); // PX-FIX: 委托（final 字段初始化；jar X() = this(null,1,null)）
        }

   @NotNull
   public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final me.octo.client.events.impl.base.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final ConcurrentHashMap<Class<? extends me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll>, List<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll>> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private final ConcurrentHashMap<Object, List<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll>> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static Lookup IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static ConcurrentHashMap<Class<?>, List<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.PXEvListener>> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static int[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static String[] a;
   private static String[] b;

   @JvmOverloads
   public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
      @NotNull me.octo.client.events.impl.base.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var1
   ) {
      short var10001 = -13851;
      short var10002 = -30333;
      Intrinsics.checkNotNullParameter(var1, "exceptionHandler");
      super();
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new ConcurrentHashMap<>();
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new ConcurrentHashMap<>();
   }

   private static final boolean PX_BUS_TRACE = false;

   public final void a(@NotNull Object var1) {
      if (PX_BUS_TRACE) {
      System.out.println("[PXBUS] register " + var1.getClass().getName());
      }
      boolean var18 = false; // PX-FIX
      Object var17 = null; // PX-FIX
      try {
         short var10001 = -13841;
         short var10002 = -10290;
         Intrinsics.checkNotNullParameter(var1, "target");
         if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.containsKey(var1)) {
            return;
         }
      } catch (Exception var15) {
         throw (RuntimeException)a((Throwable)var15);
      }

      Object var10000 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.computeIfAbsent(
            var1.getClass(), k -> this.a((java.lang.Class)k) );
      short var19 = -13847;
      short var10003 = -4360;
      Intrinsics.checkNotNullExpressionValue(var10000, "computeIfAbsent(...)");
      java.util.List<llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.PXEvListener> var2 = (java.util.List<llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.PXEvListener>)(java.util.List)var10000;
      if (PX_BUS_TRACE) {
      System.out.println("[PXBUS] reg list=" + var2.size());
      }
      List var3 = new ArrayList();

      for (llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.PXEvListener var5 : var2) {
         try {
            Consumer var6 = this.a(var1, (java.lang.reflect.Method)var5.a(), (java.lang.Class)var5.b());
            IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var7 = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
               var1, var6, var5.c(), var5.d()
            );
            var10000 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
               .computeIfAbsent(var5.b(), k -> new java.util.concurrent.CopyOnWriteArrayList<>());
            var19 = -13827;
            var10003 = -26340;
            Intrinsics.checkNotNullExpressionValue(var10000, "computeIfAbsent(...)");
            List var8 = (List)var10000;
            int var9 = Collections.binarySearch(
               var8,
               var7,
               new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll<>()
            );

            label51: {
               try {
                  if (var9 < 0) {
                     var17 = -var9 - 1;
                     break label51;
                  }
               } catch (Exception var13) {
                  throw (RuntimeException)a((Throwable)var13);
               }

               var17 = var9;
            }

            int var10 =((Integer)( var17));
            var8.add(var10, var7);
      var3.add(var7);
         } catch (Exception var14) {
            String var20 = var5.a().getName();
            var10003 = -13848;
            short var10004 = -15940;
            throw new RuntimeException("Failed to register event handler: " + var20, var14);
         }
      }

      label41: {
         try {
            if (!var3.isEmpty()) {
               var18 = true;
               break label41;
            }
         } catch (Exception var12) {
            throw (RuntimeException)a((Throwable)var12);
         }

         var18 = false;
      }

      try {
         if (var18) {
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.put(var1, var3);
         }
      } catch (Exception var11) {
         throw (RuntimeException)a((Throwable)var11);
      }
   }

   private final List<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.PXEvListener> a(
      Class<?> param1
   ) {
      java.util.List var3 = new java.util.ArrayList();
      java.util.Set var4 = com.google.common.reflect.TypeToken.of(param1).getTypes().rawTypes();
      for (java.lang.reflect.Method var8 : param1.getMethods()) {
         me.octo.client.events.impl.base.annotations.SubscribeEvent var9 = null;
         for (Object var11o : var4) {
            java.lang.Class var11 = (java.lang.Class)var11o;
            java.lang.reflect.Method var12;
            try { var12 = var11.getDeclaredMethod(var8.getName(), var8.getParameterTypes()); }
            catch (NoSuchMethodException pxE) { continue; }
            if (var12.isAnnotationPresent(me.octo.client.events.impl.base.annotations.SubscribeEvent.class)) { var9 = (me.octo.client.events.impl.base.annotations.SubscribeEvent)var12.getAnnotation(me.octo.client.events.impl.base.annotations.SubscribeEvent.class); break; }
         }
            if (PX_BUS_TRACE) {
            System.out.println("[PXBUS] scan " + param1.getName() + " m=" + var8.getName() + " ann=" + var9);
            }
         if (var9 == null) continue;
         if (!java.lang.reflect.Modifier.isPublic(var8.getModifiers())) throw new IllegalArgumentException("Event handler method must be public: " + var8.getName() + " in " + param1.getName());
         if (!var8.trySetAccessible()) throw new IllegalArgumentException("Cannot access method '" + var8.getName() + "' in " + param1.getName());
         java.lang.Class[] var10 = var8.getParameterTypes();
         if (var10.length != 1) throw new IllegalArgumentException("Method " + var8.getName() + " has @SubscribeEvent annotation, but requires " + var10.length + " arguments");
         java.lang.Class var13 = var10[0];
         if (!me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.class.isAssignableFrom(var13)) throw new IllegalArgumentException("Method " + var8.getName() + " has @SubscribeEvent annotation, but takes an argument that is not an Event: " + var13);
         if (var8.getReturnType() != java.lang.Void.TYPE) throw new IllegalArgumentException("Event handler method must return void: " + var8.getName() + " in " + param1.getName());
         var3.add(new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.PXEvListener(var8, var13, var9.priority(), var9.receiveCanceled()));
      }
      return var3;
   }

   private java.util.function.Consumer a(java.lang.Object handler, java.lang.reflect.Method m, java.lang.Class eventType) {
      if (PX_BUS_TRACE) {
      System.out.println("[PXBUS] invoker h=" + handler + " m=" + m + " e=" + eventType);
      }
      return ev -> {
         try { m.invoke(handler, ev); }
         catch (java.lang.reflect.InvocationTargetException e) { throw new RuntimeException(e.getCause()); }
         catch (Throwable t) { throw new RuntimeException(t); }
      };
   }

   public final boolean a(@NotNull me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll event) {
      Intrinsics.checkNotNullParameter(event, "event");
      List<IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll> listeners =
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.get(event.getClass());
      if (listeners == null) {
         return false;
      }
      for (IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll listener : listeners) {
         if (event.d() && event.e() && !listener.d()) {
            continue;
         }
         try {
            listener.b().accept(event);
         } catch (Throwable var5) {
            this.a(this, event, var5);
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b(
               "Exception in event handler for " + event.getClass().getSimpleName() + ":"
            );
            var5.printStackTrace();
         }
      }
      return event.d() && event.e();
   }

   public final boolean b(@NotNull Object target) {
      Intrinsics.checkNotNullParameter(target, "target");
      List<IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll> removed =
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.remove(target);
      if (removed == null) {
         return false;
      }
      boolean changed = false;
      for (List<IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll> listeners :
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.values()) {
         if (listeners.removeAll(removed)) {
            changed = true;
         }
      }
      return changed;
   }

   public final int b(@NotNull Class<? extends me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> eventClass) {
      Intrinsics.checkNotNullParameter(eventClass, "eventClass");
      List<IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll> listeners =
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.get(eventClass);
      return listeners == null ? 0 : listeners.size();
   }

   public final void a() {
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.clear();
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clear();
   }

   @Override
   public void a(
      @NotNull IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1,
      @NotNull me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2,
      @NotNull Throwable var3
   ) {
      short var10001 = -13839;
      short var10002 = 30862;
      Intrinsics.checkNotNullParameter(var1, "bus");
      var10001 = -13845;
      var10002 = -8188;
      Intrinsics.checkNotNullParameter(var2, "event");
      var10001 = -13855;
      var10002 = -3732;
      Intrinsics.checkNotNullParameter(var3, "throwable");
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a(var1, var2, var3);
   }

   @JvmOverloads
   public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
      this(null, 1, null);
   }

   private static final List a(IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var0, Class var1) {
      short var10001 = -13846;
      short var10002 = -18190;
      Intrinsics.checkNotNullParameter(var1, "it");
      return var0.a(var1);
   }

   private static final List a(Function1 var0, Object var1) {
      return (List<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.PXEvListener>)var0.invoke(
         var1
      );
   }

   private static final List c(Class var0) {
      short var10001 = -13850;
      short var10002 = -20332;
      Intrinsics.checkNotNullParameter(var0, "it");
      return new CopyOnWriteArrayList();
   }

   private static final List b(Function1 var0, Object var1) {
      return (List<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll>)var0.invoke(
         var1
      );
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[30];
      int var3 = 0;
      String var2 = "\u0004Xß4/£U®\u0010\u0084yè\u0099É¾\u0014#\u0091¦{*ÐêæI]Zúµ=D\u0097üJ\u0011>.ê\u008c¸<1o@\u009fèûë[®$»Th¹\u0090?\u00803áåK ?\u009b\u008c]\u001b¾«©5 æ,&\u0083ÍW_p\u0004\\\u0005\náMQ_\u001f¸!9\u008d\u0013¹dí\u001d¿Òö\u008b\tl6ûÀ·?¢£Æ\u001bî»\u0081<4ä\u0084\u0016\u0090\n÷ÙyY\u009cÿoq<\u0019\u0088\u000f.\u001bÑyä\u009b/ó\u0006ÍÅ7iÒ%\u0005\u00ad ¿õØM/À\u0000µ&^¢¹´?`Ãß7\u00956\u00adõ(¶\u0097\u0002\u0003Ã\u0017ä´\u0003ýN5Ünå\u008d©ñ\u001bÀ¹\u0085S\u0016\u00ad(c\u008c\u008fª÷\bà\u0014ê´Â\u0095x\u0003Ù¸Ùb\u0007¼\u0097\u008e\".8lî¥°B:\u0083\u00063\u000fNpÛD\t+\u007f\u001eé×\\è\u0001d\u00043Û\u008c¤\u0004ã\u008f\u0096.\u0003\u0012&¿%ùH\u0017d\u0014º\u0001]\u0090\"f\u0082ê¨Cï|çQH\u0099ÃÙk/\u001bÈ3Xdú+£\u0097çÃh\u000b2\rhó±½Ô¨\"p=\u0007ýþ\u008fÅ/\fVU+Ï\nõË\u0089-\u001f=\u008fË\u0018TSË{\u009c¨á\u009d£·\u0015ºRÑPæ¸¨\u0000oÞ\u0005@Üí\u0098C\tñ¦På%-bØÚ\u001er]Ô\u0092áµ\u0088\u009að\u0006óý\u0099\u0090\\S·GÇÓ\nL~¯(\u0096©MZQméÎ\u0091\u000b\u0007!h\u0014\u0017\\V8\u0006äó´ï\u0084·\"2+\u0001ÿJÏ±*Æ?\u0093í\u009c\f$\n\\r)¢f·¡ë\f¤q\u008eH¥$\u009c<:\u0014\u0001>â\u008e¢nû1k§\u001e¥=ÖUêÞåUË\u0002Ó=\u0005\u008aü]ò]'ñ¡\u0016Y4\u001d\u0005©\u0010¼vQèÒ\u0003 t\u000ePu¹dÝ\u009f¯\u0085Èà\u001e\u001bëm*Í\u001f'¾:¤\u0010öèÔ´®\u009eÓ\tëK\u0004\r\u001c\u007fAÇ\u0002\u000eÆ\n÷Zò&¨\u0091\u00927{x";
      int var4 = "\u0004Xß4/£U®\u0010\u0084yè\u0099É¾\u0014#\u0091¦{*ÐêæI]Zúµ=D\u0097üJ\u0011>.ê\u008c¸<1o@\u009fèûë[®$»Th¹\u0090?\u00803áåK ?\u009b\u008c]\u001b¾«©5 æ,&\u0083ÍW_p\u0004\\\u0005\náMQ_\u001f¸!9\u008d\u0013¹dí\u001d¿Òö\u008b\tl6ûÀ·?¢£Æ\u001bî»\u0081<4ä\u0084\u0016\u0090\n÷ÙyY\u009cÿoq<\u0019\u0088\u000f.\u001bÑyä\u009b/ó\u0006ÍÅ7iÒ%\u0005\u00ad ¿õØM/À\u0000µ&^¢¹´?`Ãß7\u00956\u00adõ(¶\u0097\u0002\u0003Ã\u0017ä´\u0003ýN5Ünå\u008d©ñ\u001bÀ¹\u0085S\u0016\u00ad(c\u008c\u008fª÷\bà\u0014ê´Â\u0095x\u0003Ù¸Ùb\u0007¼\u0097\u008e\".8lî¥°B:\u0083\u00063\u000fNpÛD\t+\u007f\u001eé×\\è\u0001d\u00043Û\u008c¤\u0004ã\u008f\u0096.\u0003\u0012&¿%ùH\u0017d\u0014º\u0001]\u0090\"f\u0082ê¨Cï|çQH\u0099ÃÙk/\u001bÈ3Xdú+£\u0097çÃh\u000b2\rhó±½Ô¨\"p=\u0007ýþ\u008fÅ/\fVU+Ï\nõË\u0089-\u001f=\u008fË\u0018TSË{\u009c¨á\u009d£·\u0015ºRÑPæ¸¨\u0000oÞ\u0005@Üí\u0098C\tñ¦På%-bØÚ\u001er]Ô\u0092áµ\u0088\u009að\u0006óý\u0099\u0090\\S·GÇÓ\nL~¯(\u0096©MZQméÎ\u0091\u000b\u0007!h\u0014\u0017\\V8\u0006äó´ï\u0084·\"2+\u0001ÿJÏ±*Æ?\u0093í\u009c\f$\n\\r)¢f·¡ë\f¤q\u008eH¥$\u009c<:\u0014\u0001>â\u008e¢nû1k§\u001e¥=ÖUêÞåUË\u0002Ó=\u0005\u008aü]ò]'ñ¡\u0016Y4\u001d\u0005©\u0010¼vQèÒ\u0003 t\u000ePu¹dÝ\u009f¯\u0085Èà\u001e\u001bëm*Í\u001f'¾:¤\u0010öèÔ´®\u009eÓ\tëK\u0004\r\u001c\u007fAÇ\u0002\u000eÆ\n÷Zò&¨\u0091\u00927{x"
         .length();
      char var1 = 15;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 113;
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
                     case 0 -> 124;
                     case 1 -> 69;
                     case 2 -> 112;
                     case 3 -> 76;
                     case 4 -> 26;
                     case 5 -> 99;
                     default -> 13;
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
                     b = new String[30];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
                     Lookup var10 = MethodHandles.lookup();
                     var10002 = -13837;
                     short var32 = -26218;
                     Intrinsics.checkNotNullExpressionValue(var10, "lookup(...)");
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var10;
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new ConcurrentHashMap<>();
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var31;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "\u0018â\u0087¿\u0080ÖÍIÍ+\tÐp@Íz\u009d×¯x";
                  var4 = "\u0018â\u0087¿\u0080ÖÍIÍ+\tÐp@Íz\u009d×¯x".length();
                  var1 = '\n';
                  var8 = -1;
            }

            var10000 = 40;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   public static void b(int[] var0) {
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var0;
   }

   public static int[] b() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -13828) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 81;
            case 1 -> 213;
            case 2 -> 168;
            case 3 -> 42;
            case 4 -> 192;
            case 5 -> 149;
            case 6 -> 153;
            case 7 -> 231;
            case 8 -> 29;
            case 9 -> 230;
            case 10 -> 80;
            case 11 -> 217;
            case 12 -> 137;
            case 13 -> 161;
            case 14 -> 191;
            case 15 -> 188;
            case 16 -> 7;
            case 17 -> 105;
            case 18 -> 178;
            case 19 -> 226;
            case 20 -> 98;
            case 21 -> 37;
            case 22 -> 148;
            case 23 -> 247;
            case 24 -> 65;
            case 25 -> 89;
            case 26 -> 44;
            case 27 -> 198;
            case 28 -> 223;
            case 29 -> 181;
            case 30 -> 121;
            case 31 -> 17;
            case 32 -> 183;
            case 33 -> 196;
            case 34 -> 103;
            case 35 -> 91;
            case 36 -> 180;
            case 37 -> 248;
            case 38 -> 119;
            case 39 -> 118;
            case 40 -> 3;
            case 41 -> 100;
            case 42 -> 25;
            case 43 -> 110;
            case 44 -> 243;
            case 45 -> 179;
            case 46 -> 207;
            case 47 -> 104;
            case 48 -> 90;
            case 49 -> 127;
            case 50 -> 234;
            case 51 -> 200;
            case 52 -> 69;
            case 53 -> 126;
            case 54 -> 158;
            case 55 -> 175;
            case 56 -> 50;
            case 57 -> 6;
            case 58 -> 163;
            case 59 -> 46;
            case 60 -> 224;
            case 61 -> 155;
            case 62 -> 27;
            case 63 -> 67;
            case 64 -> 102;
            case 65 -> 143;
            case 66 -> 214;
            case 67 -> 107;
            case 68 -> 5;
            case 69 -> 130;
            case 70 -> 77;
            case 71 -> 211;
            case 72 -> 255;
            case 73 -> 85;
            case 74 -> 4;
            case 75 -> 22;
            case 76 -> 222;
            case 77 -> 66;
            case 78 -> 32;
            case 79 -> 114;
            case 80 -> 241;
            case 81 -> 61;
            case 82 -> 15;
            case 83 -> 157;
            case 84 -> 88;
            case 85 -> 136;
            case 86 -> 190;
            case 87 -> 173;
            case 88 -> 76;
            case 89 -> 249;
            case 90 -> 39;
            case 91 -> 125;
            case 92 -> 82;
            case 93 -> 48;
            case 94 -> 2;
            case 95 -> 216;
            case 96 -> 18;
            case 97 -> 99;
            case 98 -> 8;
            case 99 -> 53;
            case 100 -> 197;
            case 101 -> 30;
            case 102 -> 45;
            case 103 -> 205;
            case 104 -> 19;
            case 105 -> 162;
            case 106 -> 186;
            case 107 -> 123;
            case 108 -> 187;
            case 109 -> 193;
            case 110 -> 203;
            case 111 -> 74;
            case 112 -> 146;
            case 113 -> 160;
            case 114 -> 252;
            case 115 -> 71;
            case 116 -> 242;
            case 117 -> 134;
            case 118 -> 238;
            case 119 -> 86;
            case 120 -> 138;
            case 121 -> 13;
            case 122 -> 165;
            case 123 -> 225;
            case 124 -> 233;
            case 125 -> 184;
            case 126 -> 78;
            case 127 -> 109;
            case 128 -> 11;
            case 129 -> 14;
            case 130 -> 227;
            case 131 -> 92;
            case 132 -> 124;
            case 133 -> 68;
            case 134 -> 75;
            case 135 -> 34;
            case 136 -> 60;
            case 137 -> 150;
            case 138 -> 97;
            case 139 -> 253;
            case 140 -> 171;
            case 141 -> 169;
            case 142 -> 56;
            case 143 -> 215;
            case 144 -> 93;
            case 145 -> 154;
            case 146 -> 176;
            case 147 -> 43;
            case 148 -> 10;
            case 149 -> 140;
            case 150 -> 141;
            case 151 -> 239;
            case 152 -> 95;
            case 153 -> 24;
            case 154 -> 220;
            case 155 -> 164;
            case 156 -> 208;
            case 157 -> 73;
            case 158 -> 201;
            case 159 -> 26;
            case 160 -> 35;
            case 161 -> 54;
            case 162 -> 40;
            case 163 -> 9;
            case 164 -> 115;
            case 165 -> 218;
            case 166 -> 142;
            case 167 -> 72;
            case 168 -> 156;
            case 169 -> 0;
            case 170 -> 195;
            case 171 -> 62;
            case 172 -> 128;
            case 173 -> 145;
            case 174 -> 84;
            case 175 -> 23;
            case 176 -> 240;
            case 177 -> 147;
            case 178 -> 96;
            case 179 -> 254;
            case 180 -> 131;
            case 181 -> 20;
            case 182 -> 117;
            case 183 -> 101;
            case 184 -> 87;
            case 185 -> 151;
            case 186 -> 204;
            case 187 -> 51;
            case 188 -> 38;
            case 189 -> 172;
            case 190 -> 64;
            case 191 -> 28;
            case 192 -> 166;
            case 193 -> 237;
            case 194 -> 1;
            case 195 -> 33;
            case 196 -> 139;
            case 197 -> 63;
            case 198 -> 228;
            case 199 -> 55;
            case 200 -> 36;
            case 201 -> 41;
            case 202 -> 94;
            case 203 -> 58;
            case 204 -> 236;
            case 205 -> 185;
            case 206 -> 209;
            case 207 -> 244;
            case 208 -> 246;
            case 209 -> 144;
            case 210 -> 111;
            case 211 -> 250;
            case 212 -> 108;
            case 213 -> 219;
            case 214 -> 202;
            case 215 -> 52;
            case 216 -> 120;
            case 217 -> 129;
            case 218 -> 47;
            case 219 -> 170;
            case 220 -> 221;
            case 221 -> 83;
            case 222 -> 59;
            case 223 -> 199;
            case 224 -> 79;
            case 225 -> 16;
            case 226 -> 31;
            case 227 -> 70;
            case 228 -> 12;
            case 229 -> 177;
            case 230 -> 251;
            case 231 -> 174;
            case 232 -> 167;
            case 233 -> 49;
            case 234 -> 210;
            case 235 -> 106;
            case 236 -> 132;
            case 237 -> 57;
            case 238 -> 232;
            case 239 -> 112;
            case 240 -> 194;
            case 241 -> 152;
            case 242 -> 122;
            case 243 -> 116;
            case 244 -> 245;
            case 245 -> 21;
            case 246 -> 206;
            case 247 -> 189;
            case 248 -> 135;
            case 249 -> 159;
            case 250 -> 113;
            case 251 -> 229;
            case 252 -> 133;
            case 253 -> 182;
            case 254 -> 212;
            default -> 235;
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

   private static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
      implements me.octo.client.events.impl.base.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      private static String[] a;
      private static String[] b;

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll() {
      }

      @Override
      public void a(
         @NotNull IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1,
         @NotNull me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2,
         @NotNull Throwable var3
      ) {
         short var10001 = -1139;
         short var10002 = -4318;
         Intrinsics.checkNotNullParameter(var1, "bus");
         var10001 = -1137;
         var10002 = 26749;
         Intrinsics.checkNotNullParameter(var2, "event");
         var10001 = -1138;
         var10002 = 27061;
         Intrinsics.checkNotNullParameter(var3, "throwable");
         short var10000 = -1140;
         var10001 = 21060;
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Exception in event handler:");
         var3.printStackTrace();
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[4];
         int var3 = 0;
         String var2 = "m)À\u001bã\fÂ¬\u0000LI\b±\u0093Ã\u001fx{IqÏ¬]c°s\u008d\u0091\u0003\u0086÷";
         int var4 = "m)À\u001bã\fÂ¬\u0000LI\b±\u0093Ã\u001fx{IqÏ¬]c°s\u008d\u0091\u0003\u0086÷".length();
         char var1 = 3;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 110;
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
                        case 0 -> 54;
                        case 1 -> 22;
                        case 2 -> 85;
                        case 3 -> 94;
                        case 4 -> 46;
                        case 5 -> 12;
                        default -> 56;
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

                     var2 = "{5_ãÝ\t7×òc\u009eGÚq\u000e";
                     var4 = "{5_ãÝ\t7×òc\u009eGÚq\u000e".length();
                     var1 = 5;
                     var8 = -1;
               }

               var10000 = 99;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -1139) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 35;
               case 1 -> 113;
               case 2 -> 24;
               case 3 -> 197;
               case 4 -> 227;
               case 5 -> 73;
               case 6 -> 237;
               case 7 -> 123;
               case 8 -> 57;
               case 9 -> 61;
               case 10 -> 0;
               case 11 -> 179;
               case 12 -> 46;
               case 13 -> 122;
               case 14 -> 200;
               case 15 -> 240;
               case 16 -> 143;
               case 17 -> 25;
               case 18 -> 82;
               case 19 -> 198;
               case 20 -> 176;
               case 21 -> 208;
               case 22 -> 186;
               case 23 -> 55;
               case 24 -> 216;
               case 25 -> 95;
               case 26 -> 11;
               case 27 -> 217;
               case 28 -> 8;
               case 29 -> 165;
               case 30 -> 110;
               case 31 -> 119;
               case 32 -> 214;
               case 33 -> 224;
               case 34 -> 150;
               case 35 -> 168;
               case 36 -> 1;
               case 37 -> 206;
               case 38 -> 151;
               case 39 -> 59;
               case 40 -> 251;
               case 41 -> 120;
               case 42 -> 228;
               case 43 -> 71;
               case 44 -> 69;
               case 45 -> 81;
               case 46 -> 50;
               case 47 -> 164;
               case 48 -> 215;
               case 49 -> 26;
               case 50 -> 204;
               case 51 -> 43;
               case 52 -> 234;
               case 53 -> 203;
               case 54 -> 158;
               case 55 -> 193;
               case 56 -> 88;
               case 57 -> 223;
               case 58 -> 78;
               case 59 -> 219;
               case 60 -> 207;
               case 61 -> 205;
               case 62 -> 209;
               case 63 -> 194;
               case 64 -> 52;
               case 65 -> 121;
               case 66 -> 230;
               case 67 -> 241;
               case 68 -> 53;
               case 69 -> 91;
               case 70 -> 152;
               case 71 -> 58;
               case 72 -> 2;
               case 73 -> 172;
               case 74 -> 109;
               case 75 -> 187;
               case 76 -> 10;
               case 77 -> 12;
               case 78 -> 253;
               case 79 -> 192;
               case 80 -> 134;
               case 81 -> 232;
               case 82 -> 66;
               case 83 -> 211;
               case 84 -> 128;
               case 85 -> 33;
               case 86 -> 233;
               case 87 -> 40;
               case 88 -> 184;
               case 89 -> 221;
               case 90 -> 126;
               case 91 -> 111;
               case 92 -> 3;
               case 93 -> 62;
               case 94 -> 141;
               case 95 -> 162;
               case 96 -> 160;
               case 97 -> 45;
               case 98 -> 159;
               case 99 -> 94;
               case 100 -> 97;
               case 101 -> 133;
               case 102 -> 246;
               case 103 -> 116;
               case 104 -> 14;
               case 105 -> 169;
               case 106 -> 32;
               case 107 -> 72;
               case 108 -> 161;
               case 109 -> 98;
               case 110 -> 245;
               case 111 -> 250;
               case 112 -> 13;
               case 113 -> 175;
               case 114 -> 142;
               case 115 -> 49;
               case 116 -> 60;
               case 117 -> 18;
               case 118 -> 39;
               case 119 -> 87;
               case 120 -> 127;
               case 121 -> 226;
               case 122 -> 236;
               case 123 -> 118;
               case 124 -> 144;
               case 125 -> 34;
               case 126 -> 89;
               case 127 -> 5;
               case 128 -> 130;
               case 129 -> 125;
               case 130 -> 27;
               case 131 -> 41;
               case 132 -> 167;
               case 133 -> 190;
               case 134 -> 139;
               case 135 -> 254;
               case 136 -> 64;
               case 137 -> 170;
               case 138 -> 83;
               case 139 -> 149;
               case 140 -> 196;
               case 141 -> 36;
               case 142 -> 20;
               case 143 -> 15;
               case 144 -> 105;
               case 145 -> 4;
               case 146 -> 44;
               case 147 -> 37;
               case 148 -> 153;
               case 149 -> 96;
               case 150 -> 180;
               case 151 -> 90;
               case 152 -> 163;
               case 153 -> 238;
               case 154 -> 140;
               case 155 -> 173;
               case 156 -> 218;
               case 157 -> 145;
               case 158 -> 213;
               case 159 -> 54;
               case 160 -> 84;
               case 161 -> 177;
               case 162 -> 29;
               case 163 -> 132;
               case 164 -> 155;
               case 165 -> 42;
               case 166 -> 63;
               case 167 -> 85;
               case 168 -> 178;
               case 169 -> 28;
               case 170 -> 19;
               case 171 -> 131;
               case 172 -> 104;
               case 173 -> 86;
               case 174 -> 235;
               case 175 -> 244;
               case 176 -> 231;
               case 177 -> 48;
               case 178 -> 174;
               case 179 -> 30;
               case 180 -> 115;
               case 181 -> 210;
               case 182 -> 22;
               case 183 -> 101;
               case 184 -> 157;
               case 185 -> 100;
               case 186 -> 17;
               case 187 -> 70;
               case 188 -> 21;
               case 189 -> 93;
               case 190 -> 171;
               case 191 -> 148;
               case 192 -> 188;
               case 193 -> 189;
               case 194 -> 154;
               case 195 -> 201;
               case 196 -> 191;
               case 197 -> 146;
               case 198 -> 181;
               case 199 -> 147;
               case 200 -> 80;
               case 201 -> 242;
               case 202 -> 138;
               case 203 -> 183;
               case 204 -> 76;
               case 205 -> 9;
               case 206 -> 239;
               case 207 -> 107;
               case 208 -> 195;
               case 209 -> 6;
               case 210 -> 249;
               case 211 -> 74;
               case 212 -> 79;
               case 213 -> 212;
               case 214 -> 102;
               case 215 -> 7;
               case 216 -> 124;
               case 217 -> 16;
               case 218 -> 129;
               case 219 -> 248;
               case 220 -> 92;
               case 221 -> 182;
               case 222 -> 103;
               case 223 -> 136;
               case 224 -> 135;
               case 225 -> 255;
               case 226 -> 185;
               case 227 -> 75;
               case 228 -> 243;
               case 229 -> 222;
               case 230 -> 67;
               case 231 -> 114;
               case 232 -> 108;
               case 233 -> 229;
               case 234 -> 56;
               case 235 -> 23;
               case 236 -> 202;
               case 237 -> 68;
               case 238 -> 166;
               case 239 -> 247;
               case 240 -> 99;
               case 241 -> 137;
               case 242 -> 47;
               case 243 -> 51;
               case 244 -> 225;
               case 245 -> 106;
               case 246 -> 117;
               case 247 -> 65;
               case 248 -> 199;
               case 249 -> 112;
               case 250 -> 77;
               case 251 -> 31;
               case 252 -> 252;
               case 253 -> 220;
               case 254 -> 38;
               default -> 156;
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

   public static final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
      @NotNull
      private final Object IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final Consumer<me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final EventPriority IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] a;
      private static String[] b;

      public IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
         @NotNull Object var1,
         @NotNull Consumer<me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> var2,
         @NotNull EventPriority var3,
         boolean var4
      ) {
         short var10001 = -9826;
         short var10002 = 26214;
         Intrinsics.checkNotNullParameter(var1, "target");
         var10001 = -9835;
         var10002 = -22666;
         Intrinsics.checkNotNullParameter(var2, "consumer");
         var10001 = -9832;
         var10002 = -24696;
         Intrinsics.checkNotNullParameter(var3, "priority");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
      }

      @NotNull
      public final Object a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
       public final Consumer<me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> b() {
          return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final EventPriority c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final boolean d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final Object e() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final Consumer<me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> f() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final EventPriority g() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final boolean h() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(
         @NotNull Object var1,
         @NotNull Consumer<me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> var2,
         @NotNull EventPriority var3,
         boolean var4
      ) {
         short var10001 = -9828;
         short var10002 = 20099;
         Intrinsics.checkNotNullParameter(var1, "target");
         var10001 = -9827;
         var10002 = 2003;
         Intrinsics.checkNotNullParameter(var2, "consumer");
         var10001 = -9829;
         var10002 = -24161;
         Intrinsics.checkNotNullParameter(var3, "priority");
         return new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
            var1, var2, var3, var4
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -9831;
         boolean var1 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         EventPriority var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         Consumer var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         Object var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -14405;
         short var10002 = -9825;
         short var10003 = 3501;
         short var10004 = -9830;
         short var10005 = 23798;
         short var10006 = -9836;
         short var10007 = -13649;
         return "EventHandlerWrapper(target=" + var4 + ", consumer=" + var3 + ", priority=" + var2 + ", receiveCanceled=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         var1 = var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
         var1 = var1 * 31 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.hashCode();
         return var1 * 31 + Boolean.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int[] var2 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
         IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var10000 = this;
         if (var2 == null) {
            if (this == var1) {
               return true;
            }

            var10000 = (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)var1;
         }

         if (var2 == null) {
            if (!(
               var10000 instanceof IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll
            )) {
               return false;
            }

            var10000 = (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)var1;
         }

         IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var3;
         label56: {
            var3 = var10000;
            boolean var4 = Intrinsics.areEqual(
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            );
            if (var2 == null) {
               if (!var4) {
                  return false;
               }

               var10000 = this;
               if (var2 != null) {
                  break label56;
               }

               var4 = Intrinsics.areEqual(
                  this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                  var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               );
            }

            if (!var4) {
               return false;
            }

            var10000 = this;
         }

         if (var2 == null) {
            if (var10000.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
               != var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
               return false;
            }

            var10000 = this;
         }

         boolean var6 = var10000.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         if (var2 == null) {
            if (var10000.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
               != var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
               return false;
            }

            var6 = true;
         }

         return var6;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[10];
         int var3 = 0;
         String var2 = "^*\u009e¿\u0000e\bmo\u0011Ì~\u0084\tü\u0006J\u0005\u001cZPÙ\u000b5\u0003±ûÝã\u0015Òú5{\b\u0017¶(U¹,\u0007f\u001b\u0014i×+ÍãZ\u008d\u0084£ÍmJ\u009bKÙ\u0089ð·\u0092ÆÀ¶ï_\u0088r\u000b\\ \u008f\u0092llÃ¸Ö÷Í\bÖ\u008c\u0010\u0012¾Äç{";
         int var4 = "^*\u009e¿\u0000e\bmo\u0011Ì~\u0084\tü\u0006J\u0005\u001cZPÙ\u000b5\u0003±ûÝã\u0015Òú5{\b\u0017¶(U¹,\u0007f\u001b\u0014i×+ÍãZ\u008d\u0084£ÍmJ\u009bKÙ\u0089ð·\u0092ÆÀ¶ï_\u0088r\u000b\\ \u008f\u0092llÃ¸Ö÷Í\bÖ\u008c\u0010\u0012¾Äç{"
            .length();
         char var1 = 6;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 101;
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
                        case 0 -> 115;
                        case 1 -> 41;
                        case 2 -> 122;
                        case 3 -> 60;
                        case 4 -> 12;
                        case 5 -> 35;
                        default -> 48;
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
                        b = new String[10];
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

                     var2 = "Ðãø\t.\u0004?\u0005Äb\u0004g'¶½x\u000bÏ\bGÞ°\u001e®:÷Ï";
                     var4 = "Ðãø\t.\u0004?\u0005Äb\u0004g'¶½x\u000bÏ\bGÞ°\u001e®:÷Ï".length();
                     var1 = 18;
                     var8 = -1;
               }

               var10000 = 40;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -9828) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 207;
               case 1 -> 23;
               case 2 -> 116;
               case 3 -> 6;
               case 4 -> 72;
               case 5 -> 208;
               case 6 -> 5;
               case 7 -> 145;
               case 8 -> 206;
               case 9 -> 138;
               case 10 -> 34;
               case 11 -> 7;
               case 12 -> 176;
               case 13 -> 233;
               case 14 -> 32;
               case 15 -> 139;
               case 16 -> 49;
               case 17 -> 217;
               case 18 -> 216;
               case 19 -> 248;
               case 20 -> 13;
               case 21 -> 64;
               case 22 -> 249;
               case 23 -> 95;
               case 24 -> 119;
               case 25 -> 175;
               case 26 -> 146;
               case 27 -> 112;
               case 28 -> 247;
               case 29 -> 230;
               case 30 -> 67;
               case 31 -> 113;
               case 32 -> 141;
               case 33 -> 91;
               case 34 -> 76;
               case 35 -> 158;
               case 36 -> 92;
               case 37 -> 212;
               case 38 -> 55;
               case 39 -> 205;
               case 40 -> 236;
               case 41 -> 104;
               case 42 -> 211;
               case 43 -> 250;
               case 44 -> 243;
               case 45 -> 221;
               case 46 -> 199;
               case 47 -> 48;
               case 48 -> 143;
               case 49 -> 79;
               case 50 -> 251;
               case 51 -> 54;
               case 52 -> 56;
               case 53 -> 24;
               case 54 -> 161;
               case 55 -> 99;
               case 56 -> 242;
               case 57 -> 123;
               case 58 -> 135;
               case 59 -> 162;
               case 60 -> 197;
               case 61 -> 94;
               case 62 -> 69;
               case 63 -> 173;
               case 64 -> 26;
               case 65 -> 4;
               case 66 -> 185;
               case 67 -> 14;
               case 68 -> 105;
               case 69 -> 33;
               case 70 -> 89;
               case 71 -> 65;
               case 72 -> 71;
               case 73 -> 198;
               case 74 -> 144;
               case 75 -> 60;
               case 76 -> 57;
               case 77 -> 117;
               case 78 -> 118;
               case 79 -> 30;
               case 80 -> 97;
               case 81 -> 129;
               case 82 -> 131;
               case 83 -> 222;
               case 84 -> 70;
               case 85 -> 58;
               case 86 -> 151;
               case 87 -> 100;
               case 88 -> 168;
               case 89 -> 220;
               case 90 -> 128;
               case 91 -> 36;
               case 92 -> 62;
               case 93 -> 177;
               case 94 -> 101;
               case 95 -> 28;
               case 96 -> 255;
               case 97 -> 74;
               case 98 -> 227;
               case 99 -> 45;
               case 100 -> 186;
               case 101 -> 37;
               case 102 -> 180;
               case 103 -> 86;
               case 104 -> 21;
               case 105 -> 182;
               case 106 -> 125;
               case 107 -> 17;
               case 108 -> 2;
               case 109 -> 40;
               case 110 -> 80;
               case 111 -> 215;
               case 112 -> 223;
               case 113 -> 210;
               case 114 -> 59;
               case 115 -> 142;
               case 116 -> 167;
               case 117 -> 137;
               case 118 -> 124;
               case 119 -> 231;
               case 120 -> 179;
               case 121 -> 114;
               case 122 -> 155;
               case 123 -> 187;
               case 124 -> 237;
               case 125 -> 178;
               case 126 -> 93;
               case 127 -> 157;
               case 128 -> 11;
               case 129 -> 156;
               case 130 -> 12;
               case 131 -> 108;
               case 132 -> 81;
               case 133 -> 109;
               case 134 -> 75;
               case 135 -> 232;
               case 136 -> 66;
               case 137 -> 77;
               case 138 -> 241;
               case 139 -> 8;
               case 140 -> 153;
               case 141 -> 194;
               case 142 -> 0;
               case 143 -> 183;
               case 144 -> 174;
               case 145 -> 169;
               case 146 -> 10;
               case 147 -> 204;
               case 148 -> 29;
               case 149 -> 35;
               case 150 -> 126;
               case 151 -> 51;
               case 152 -> 82;
               case 153 -> 68;
               case 154 -> 195;
               case 155 -> 136;
               case 156 -> 202;
               case 157 -> 253;
               case 158 -> 203;
               case 159 -> 83;
               case 160 -> 147;
               case 161 -> 84;
               case 162 -> 254;
               case 163 -> 164;
               case 164 -> 43;
               case 165 -> 134;
               case 166 -> 61;
               case 167 -> 102;
               case 168 -> 235;
               case 169 -> 165;
               case 170 -> 41;
               case 171 -> 148;
               case 172 -> 244;
               case 173 -> 214;
               case 174 -> 3;
               case 175 -> 19;
               case 176 -> 107;
               case 177 -> 1;
               case 178 -> 22;
               case 179 -> 52;
               case 180 -> 246;
               case 181 -> 96;
               case 182 -> 47;
               case 183 -> 98;
               case 184 -> 73;
               case 185 -> 171;
               case 186 -> 121;
               case 187 -> 78;
               case 188 -> 192;
               case 189 -> 188;
               case 190 -> 160;
               case 191 -> 190;
               case 192 -> 239;
               case 193 -> 106;
               case 194 -> 181;
               case 195 -> 63;
               case 196 -> 46;
               case 197 -> 159;
               case 198 -> 90;
               case 199 -> 110;
               case 200 -> 163;
               case 201 -> 115;
               case 202 -> 234;
               case 203 -> 88;
               case 204 -> 25;
               case 205 -> 18;
               case 206 -> 219;
               case 207 -> 85;
               case 208 -> 133;
               case 209 -> 150;
               case 210 -> 252;
               case 211 -> 120;
               case 212 -> 27;
               case 213 -> 152;
               case 214 -> 196;
               case 215 -> 240;
               case 216 -> 44;
               case 217 -> 245;
               case 218 -> 218;
               case 219 -> 127;
               case 220 -> 31;
               case 221 -> 189;
               case 222 -> 149;
               case 223 -> 9;
               case 224 -> 209;
               case 225 -> 132;
               case 226 -> 154;
               case 227 -> 122;
               case 228 -> 20;
               case 229 -> 225;
               case 230 -> 130;
               case 231 -> 224;
               case 232 -> 15;
               case 233 -> 103;
               case 234 -> 111;
               case 235 -> 213;
               case 236 -> 50;
               case 237 -> 193;
               case 238 -> 53;
               case 239 -> 228;
               case 240 -> 172;
               case 241 -> 16;
               case 242 -> 39;
               case 243 -> 191;
               case 244 -> 238;
               case 245 -> 184;
               case 246 -> 226;
               case 247 -> 140;
               case 248 -> 201;
               case 249 -> 229;
               case 250 -> 170;
               case 251 -> 166;
               case 252 -> 42;
               case 253 -> 38;
               case 254 -> 87;
               default -> 200;
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

   public static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var1, Object var2, java.util.function.Consumer var3, me.octo.client.events.impl.base.EventPriority var4, boolean var5, int var6, Object var7) {
      if ((var6 & 1) != 0) {
         var2 = var1.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }
      if ((var6 & 2) != 0) {
         var3 = var1.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }
      if ((var6 & 4) != 0) {
         var4 = var1.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }
      if ((var6 & 8) != 0) {
         var5 = var1.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }
      return var1.a(var2, var3, var4, var5);
   }

   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
    // PX-FIX TOP5F: Kotlin synthetic no-arg marker ctor (jar: <init>(DefaultConstructorMarker))
    public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker marker) {
        this();
    }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      public static final class PXEvListener {
         @NotNull
         private final Method IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         @NotNull
         private final Class<? extends me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         @NotNull
         private final EventPriority IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         private final boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         private static String[] a;
         private static String[] b;

         public PXEvListener(
            @NotNull Method var1,
            @NotNull Class<? extends me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> var2,
            @NotNull EventPriority var3,
            boolean var4
         ) {
            Intrinsics.checkNotNullParameter(var1, "method");
            Intrinsics.checkNotNullParameter(var2, "eventType");
            Intrinsics.checkNotNullParameter(var3, "priority");
            super();
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         }

         @NotNull
         public final Method a() {
            return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         }

         @NotNull
         public final Class<? extends me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> b() {
            return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         @NotNull
         public final EventPriority c() {
            return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         public final boolean d() {
            return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         @NotNull
         public final Method e() {
            return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         }

         @NotNull
         public final Class<? extends me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> f() {
            return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         @NotNull
         public final EventPriority g() {
            return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         public final boolean h() {
            return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         @NotNull
         public final IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.PXEvListener a(
            @NotNull Method var1,
            @NotNull Class<? extends me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> var2,
            @NotNull EventPriority var3,
            boolean var4
         ) {
            Intrinsics.checkNotNullParameter(var1, "method");
            Intrinsics.checkNotNullParameter(var2, "eventType");
            Intrinsics.checkNotNullParameter(var3, "priority");
            return new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.PXEvListener(
               var1, var2, var3, var4
            );
         }

         public static PXEvListener a(
            PXEvListener var0,
            Method var1,
            Class<? extends me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> var2,
            EventPriority var3,
            boolean var4,
            int var5,
            Object var6
         ) {
            if ((var5 & 1) != 0) {
               var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            }

            if ((var5 & 2) != 0) {
               var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            if ((var5 & 4) != 0) {
               var3 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }

            if ((var5 & 8) != 0) {
               var4 = var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            }

            return var0.a(var1, var2, var3, var4);
         }

         @NotNull
         @Override
         public String toString() {
            Method var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            Class var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            EventPriority var3 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            boolean var4 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            String var5 = "MethodMetadata(method=";
            String var6 = ", eventType=";
            String var7 = ", priority=";
            String var8 = ", receiveCanceled=";
            String var9 = ")";
            return var5 + var1 + var6 + var2 + var7 + var3 + var8 + var4 + var9;
         }

         @Override
         public int hashCode() {
            int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
            var1 = var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
            var1 = var1 * 31 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.hashCode();
            return var1 * 31 + Boolean.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         }

         @Override
         public boolean equals(@Nullable Object var1) {
            if (this == var1) {
               return true;
            }

            if (!(var1 instanceof IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.PXEvListener)) {
               return false;
            }

            IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.PXEvListener var2 = (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.PXEvListener)var1;
            return Intrinsics.areEqual(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, var2.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)
               && Intrinsics.areEqual(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, var2.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII)
               && this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == var2.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
               && this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI == var2.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         // $VF: Irreducible bytecode was duplicated to produce valid code
         static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
            String[] var5 = new String[10];
            int var3 = 0;
            String var2 = "Â\u0017¶\u008du1þÐ\u0012)°\u0007k*ª;!y&»\u00142\\î\u0018¡Ë\u0006ÜÔÖ\u0007Ú\u008a\fó\tKOPT¯¶I\u0081&æ\b2æ¨³¶ö\u0086(\u0016½gÞqÛD¬Î:\u0088å¨K!p;¿ïÃ\u0003a\u0014\t\r,ôo¶qMK¥\t0YSÁB¤Óñv";
            int var4 = "Â\u0017¶\u008du1þÐ\u0012)°\u0007k*ª;!y&»\u00142\\î\u0018¡Ë\u0006ÜÔÖ\u0007Ú\u008a\fó\tKOPT¯¶I\u0081&æ\b2æ¨³¶ö\u0086(\u0016½gÞqÛD¬Î:\u0088å¨K!p;¿ïÃ\u0003a\u0014\t\r,ôo¶qMK¥\t0YSÁB¤Óñv"
               .length();
            char var1 = '\b';
            int var8 = -1;

            label52:
            while (true) {
               byte var10000 = 79;
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
                           case 0 -> 33;
                           case 1 -> 63;
                           case 2 -> 123;
                           case 3 -> 125;
                           case 4 -> 92;
                           case 5 -> 98;
                           default -> 53;
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
                           b = new String[10];
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

                        var2 = "Rìkl\u0001\u008b\u000bïi±+Ø1Yj0å\u0091";
                        var4 = "Rìkl\u0001\u008b\u000bïi±+Ø1Yj0å\u0091".length();
                        var1 = 6;
                        var8 = -1;
                  }

                  var10000 = 47;
                  var10001 = var2.substring(++var8, var8 + var1);
                  var10002 = 0;
               }
            }
         }
}

         private static String a(int var0, int var1) {
            int var2 = (var0 ^ 12526) & 65535;
            if (b[var2] == null) {
               char[] var3 = a[var2].toCharArray();

               short var4 = switch (var3[0] & 0xFF) {
                  case 0 -> 105;
                  case 1 -> 72;
                  case 2 -> 160;
                  case 3 -> 194;
                  case 4 -> 133;
                  case 5 -> 100;
                  case 6 -> 245;
                  case 7 -> 23;
                  case 8 -> 27;
                  case 9 -> 215;
                  case 10 -> 99;
                  case 11 -> 252;
                  case 12 -> 203;
                  case 13 -> 125;
                  case 14 -> 61;
                  case 15 -> 91;
                  case 16 -> 129;
                  case 17 -> 31;
                  case 18 -> 209;
                  case 19 -> 32;
                  case 20 -> 18;
                  case 21 -> 70;
                  case 22 -> 40;
                  case 23 -> 65;
                  case 24 -> 10;
                  case 25 -> 241;
                  case 26 -> 9;
                  case 27 -> 52;
                  case 28 -> 235;
                  case 29 -> 119;
                  case 30 -> 73;
                  case 31 -> 169;
                  case 32 -> 130;
                  case 33 -> 180;
                  case 34 -> 207;
                  case 35 -> 249;
                  case 36 -> 201;
                  case 37 -> 227;
                  case 38 -> 84;
                  case 39 -> 89;
                  case 40 -> 132;
                  case 41 -> 166;
                  case 42 -> 106;
                  case 43 -> 102;
                  case 44 -> 115;
                  case 45 -> 113;
                  case 46 -> 251;
                  case 47 -> 87;
                  case 48 -> 226;
                  case 49 -> 13;
                  case 50 -> 92;
                  case 51 -> 163;
                  case 52 -> 159;
                  case 53 -> 175;
                  case 54 -> 236;
                  case 55 -> 49;
                  case 56 -> 47;
                  case 57 -> 104;
                  case 58 -> 75;
                  case 59 -> 64;
                  case 60 -> 151;
                  case 61 -> 38;
                  case 62 -> 20;
                  case 63 -> 59;
                  case 64 -> 34;
                  case 65 -> 247;
                  case 66 -> 204;
                  case 67 -> 19;
                  case 68 -> 221;
                  case 69 -> 55;
                  case 70 -> 187;
                  case 71 -> 193;
                  case 72 -> 212;
                  case 73 -> 148;
                  case 74 -> 51;
                  case 75 -> 141;
                  case 76 -> 224;
                  case 77 -> 45;
                  case 78 -> 50;
                  case 79 -> 237;
                  case 80 -> 213;
                  case 81 -> 177;
                  case 82 -> 110;
                  case 83 -> 41;
                  case 84 -> 33;
                  case 85 -> 172;
                  case 86 -> 143;
                  case 87 -> 39;
                  case 88 -> 43;
                  case 89 -> 114;
                  case 90 -> 140;
                  case 91 -> 198;
                  case 92 -> 103;
                  case 93 -> 117;
                  case 94 -> 244;
                  case 95 -> 186;
                  case 96 -> 231;
                  case 97 -> 179;
                  case 98 -> 44;
                  case 99 -> 183;
                  case 100 -> 238;
                  case 101 -> 112;
                  case 102 -> 127;
                  case 103 -> 243;
                  case 104 -> 181;
                  case 105 -> 107;
                  case 106 -> 182;
                  case 107 -> 146;
                  case 108 -> 131;
                  case 109 -> 189;
                  case 110 -> 3;
                  case 111 -> 155;
                  case 112 -> 232;
                  case 113 -> 190;
                  case 114 -> 157;
                  case 115 -> 144;
                  case 116 -> 185;
                  case 117 -> 246;
                  case 118 -> 136;
                  case 119 -> 11;
                  case 120 -> 128;
                  case 121 -> 69;
                  case 122 -> 234;
                  case 123 -> 81;
                  case 124 -> 124;
                  case 125 -> 80;
                  case 126 -> 196;
                  case 127 -> 6;
                  case 128 -> 12;
                  case 129 -> 216;
                  case 130 -> 93;
                  case 131 -> 137;
                  case 132 -> 168;
                  case 133 -> 253;
                  case 134 -> 79;
                  case 135 -> 76;
                  case 136 -> 0;
                  case 137 -> 118;
                  case 138 -> 24;
                  case 139 -> 154;
                  case 140 -> 36;
                  case 141 -> 150;
                  case 142 -> 108;
                  case 143 -> 120;
                  case 144 -> 254;
                  case 145 -> 123;
                  case 146 -> 2;
                  case 147 -> 68;
                  case 148 -> 233;
                  case 149 -> 74;
                  case 150 -> 66;
                  case 151 -> 134;
                  case 152 -> 48;
                  case 153 -> 83;
                  case 154 -> 88;
                  case 155 -> 178;
                  case 156 -> 158;
                  case 157 -> 165;
                  case 158 -> 58;
                  case 159 -> 53;
                  case 160 -> 197;
                  case 161 -> 218;
                  case 162 -> 85;
                  case 163 -> 223;
                  case 164 -> 82;
                  case 165 -> 57;
                  case 166 -> 225;
                  case 167 -> 94;
                  case 168 -> 220;
                  case 169 -> 5;
                  case 170 -> 98;
                  case 171 -> 211;
                  case 172 -> 240;
                  case 173 -> 156;
                  case 174 -> 1;
                  case 175 -> 217;
                  case 176 -> 250;
                  case 177 -> 229;
                  case 178 -> 202;
                  case 179 -> 239;
                  case 180 -> 188;
                  case 181 -> 167;
                  case 182 -> 17;
                  case 183 -> 63;
                  case 184 -> 90;
                  case 185 -> 242;
                  case 186 -> 15;
                  case 187 -> 28;
                  case 188 -> 56;
                  case 189 -> 145;
                  case 190 -> 176;
                  case 191 -> 77;
                  case 192 -> 206;
                  case 193 -> 149;
                  case 194 -> 86;
                  case 195 -> 170;
                  case 196 -> 162;
                  case 197 -> 126;
                  case 198 -> 152;
                  case 199 -> 67;
                  case 200 -> 255;
                  case 201 -> 230;
                  case 202 -> 153;
                  case 203 -> 26;
                  case 204 -> 171;
                  case 205 -> 101;
                  case 206 -> 37;
                  case 207 -> 139;
                  case 208 -> 30;
                  case 209 -> 25;
                  case 210 -> 142;
                  case 211 -> 228;
                  case 212 -> 8;
                  case 213 -> 210;
                  case 214 -> 219;
                  case 215 -> 111;
                  case 216 -> 109;
                  case 217 -> 4;
                  case 218 -> 121;
                  case 219 -> 173;
                  case 220 -> 122;
                  case 221 -> 54;
                  case 222 -> 71;
                  case 223 -> 138;
                  case 224 -> 46;
                  case 225 -> 174;
                  case 226 -> 195;
                  case 227 -> 21;
                  case 228 -> 164;
                  case 229 -> 29;
                  case 230 -> 62;
                  case 231 -> 78;
                  case 232 -> 97;
                  case 233 -> 96;
                  case 234 -> 205;
                  case 235 -> 95;
                  case 236 -> 191;
                  case 237 -> 192;
                  case 238 -> 16;
                  case 239 -> 60;
                  case 240 -> 214;
                  case 241 -> 248;
                  case 242 -> 35;
                  case 243 -> 199;
                  case 244 -> 14;
                  case 245 -> 7;
                  case 246 -> 184;
                  case 247 -> 42;
                  case 248 -> 161;
                  case 249 -> 135;
                  case 250 -> 147;
                  case 251 -> 200;
                  case 252 -> 116;
                  case 253 -> 222;
                  case 254 -> 22;
                  default -> 208;
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
   }
}
