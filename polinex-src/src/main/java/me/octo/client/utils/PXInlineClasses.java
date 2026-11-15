package me.octo.client.utils;

import java.lang.reflect.Method;

/**
 * Java-source-callable bridge for Kotlin inline-class impl methods whose
 * bytecode names contain '-' (illegal in Java source), e.g. UShort.box-impl.
 * Added during source-level restoration: the original Kotlin bytecode calls
 * these methods directly; decompiled Java cannot name them, so the calls are
 * routed through cached reflective handles with identical semantics.
 */
public final class PXInlineClasses {
   private static final Method USHORT_BOX = getMethod(kotlin.UShort.class, "box-impl", short.class);
   private static final Method USHORT_UNBOX = getMethod(kotlin.UShort.class, "unbox-impl");
   private static final Method UBYTE_BOX = getMethod(kotlin.UByte.class, "box-impl", byte.class);
   private static final Method UBYTE_UNBOX = getMethod(kotlin.UByte.class, "unbox-impl");

   private PXInlineClasses() {
   }

   private static Method getMethod(Class<?> owner, String name, Class<?>... params) {
      try {
         return owner.getMethod(name, params);
      } catch (NoSuchMethodException e) {
         throw new ExceptionInInitializerError(e);
      }
   }

   public static kotlin.UShort boxUShort(short v) {
      try {
         return (kotlin.UShort)USHORT_BOX.invoke(null, v);
      } catch (ReflectiveOperationException e) {
         throw new RuntimeException(e);
      }
   }

   public static short unboxUShort(kotlin.UShort v) {
      try {
         return (Short)USHORT_UNBOX.invoke(v);
      } catch (ReflectiveOperationException e) {
         throw new RuntimeException(e);
      }
   }

   public static kotlin.UByte boxUByte(byte v) {
      try {
         return (kotlin.UByte)UBYTE_BOX.invoke(null, v);
      } catch (ReflectiveOperationException e) {
         throw new RuntimeException(e);
      }
   }

   public static byte unboxUByte(kotlin.UByte v) {
      try {
         return (Byte)UBYTE_UNBOX.invoke(v);
      } catch (ReflectiveOperationException e) {
         throw new RuntimeException(e);
      }
   }
}
