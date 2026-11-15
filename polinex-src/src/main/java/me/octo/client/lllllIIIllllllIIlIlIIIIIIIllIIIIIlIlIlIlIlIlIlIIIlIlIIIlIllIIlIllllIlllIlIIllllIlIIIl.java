package me.octo.client;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.graalvm.polyglot.Value;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl(Object... px) {
           this((Value)null, (Value)null, (Value)null, (Value)null, (Function2<? super Value, ? super Object[], ? extends Object>)null); // PX-FIX: 委托主构造器（final 字段初始化）
        }

   @Nullable
   private final Value IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @Nullable
   private final Value lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @Nullable
   private final Value IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @Nullable
   private final Value lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @Nullable
   private final Function2<Value, Object[], Object> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static String[] a;
   private static String[] b;

   public lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl(
      @Nullable Value var1,
      @Nullable Value var2,
      @Nullable Value var3,
      @Nullable Value var4,
      @Nullable Function2<? super Value, ? super Object[], ? extends Object> var5
   ) {
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = ((Function2<Value,Object[],Object>)(Object)(var5));
   }

   // PX-FIX W7-6: Kotlin default-argument constructor bridge
   public lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl(
      Value var1, Value var2, Value var3, Value var4, Function2 var5, int var6, kotlin.jvm.internal.DefaultConstructorMarker var7
   ) {
      this(
         (var6 & 1) != 0 ? null : var1,
         (var6 & 2) != 0 ? null : var2,
         (var6 & 4) != 0 ? null : var3,
         (var6 & 8) != 0 ? null : var4,
         (var6 & 16) != 0 ? null : var5
      );
   }

   @Nullable
   public final Value a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @Nullable
   public final Value b() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @Nullable
   public final Value c() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @Nullable
   public final Value d() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @Nullable
   public final Function2<Value, Object[], Object> e() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @Nullable
   public final Object a(@Nullable Value var1, @NotNull Object... var2) {
      Object IlIIlllIIlIllIlIIllIIIIIIlllIlIlIllllllIIIlIIIIlllIIllIlllIllIllllIlIIIlIIlIIIIllIIlI = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = ((me.octo.client.PXDyn)IlIIlllIIlIllIlIIllIIIIIIlllIlIlIllllllIIIlIIIIlllIIllIlllIllIllllIlIIIlIIlIIIIllIIlI).b();
      short var10002 = 27331;
      short var10003 = 27567;
      Intrinsics.checkNotNullParameter(var2, "args");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = var10000;
      return var3 != null && this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII != null
         ? this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.invoke(var1, var2)
         : null;
   }

   @Nullable
   public final Value f() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @Nullable
   public final Value g() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @Nullable
   public final Value h() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @Nullable
   public final Value i() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @Nullable
   public final Function2<Value, Object[], Object> j() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @NotNull
   public final lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl a(
      @Nullable Value var1,
      @Nullable Value var2,
      @Nullable Value var3,
      @Nullable Value var4,
      @Nullable Function2<? super Value, ? super Object[], ? extends Object> var5
   ) {
      return new lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl(var1, var2, var3, var4, var5);
   }

   // PX-FIX W7-6: Kotlin default-argument bridge for the copy method
   public static lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl a(
      lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl var0,
      Value var1, Value var2, Value var3, Value var4, Function2 var5, int var6, Object var7
   ) {
      if ((var6 & 1) != 0) {
         var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      if ((var6 & 2) != 0) {
         var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      if ((var6 & 4) != 0) {
         var3 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      if ((var6 & 8) != 0) {
         var4 = var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      if ((var6 & 16) != 0) {
         var5 = var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      return var0.a(var1, var2, var3, var4, var5);
   }

   @NotNull
   @Override
   public String toString() {
      short var10000 = 27330;
      Function2 var1 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      Value var2 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      Value var3 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      Value var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      Value var5 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      short var10001 = 17432;
      short var10002 = 27333;
      short var10003 = -27559;
      short var10004 = 27332;
      short var10005 = -1542;
      short var10006 = 27328;
      short var10007 = -27164;
      short var10008 = 27329;
      short var10009 = -23755;
      return "ScriptCallbacks(onEnable=" + var5 + ", onDisable=" + var4 + ", onChange=" + var3 + ", shouldRender=" + var2 + ", executor=" + var1 + ")";
   }

   @Override
   public int hashCode() {
      Object IlIIlllIIlIllIlIIllIIIIIIlllIlIlIllllllIIIlIIIIlllIIllIlllIllIllllIlIIIlIIlIIIIllIIlI = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1;
      int var6;
      label58: {
         var1 = ((me.octo.client.PXDyn)IlIIlllIIlIllIlIIllIIIIIIlllIlIlIllllllIIIlIIIIlllIIllIlllIllIllllIlIIIlIIlIIIIllIIlI).b();
         Value var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var1 != null) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl == null) {
               var6 = 0;
               break label58;
            }

            var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         }

         var6 = var10000.hashCode();
      }

      int var11;
      label52: {
         int var2 = var6;
         var6 = var2 * 31;
         Value var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if (var1 != null) {
            if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII == null) {
               var11 = 0;
               break label52;
            }

            var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         var11 = var10001.hashCode();
      }

      label46: {
         int var3 = var6 + var11;
         var6 = var3 * 31;
         Value var12 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if (var1 != null) {
            if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == null) {
               var11 = 0;
               break label46;
            }

            var12 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         var11 = var12.hashCode();
      }

      label40: {
         int var4 = var6 + var11;
         var6 = var4 * 31;
         Value var14 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         if (var1 != null) {
            if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI == null) {
               var11 = 0;
               break label40;
            }

            var14 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         var11 = var14.hashCode();
      }

      int var5 = var6 + var11;
      var6 = var5 * 31;
      Function2 var16 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      if (var1 != null) {
         if (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII == null) {
            return var6 + 0;
         }

         var16 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      return var6 + var16.hashCode();
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      Object IlIIlllIIlIllIlIIllIIIIIIlllIlIlIllllllIIIlIIIIlllIIllIlllIllIllllIlIIIlIIlIIIIllIIlI = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = ((me.octo.client.PXDyn)IlIIlllIIlIllIlIIllIIIIIIlllIlIlIllllllIIIlIIIIlllIIllIlllIllIllllIlIIIlIIlIIIIllIIlI).b();
      Object var10000 = this;
      if (var2 != null) {
         if (this == var1) {
            return true;
         }

         var10000 = var1;
      }

      if (var2 != null) {
         if (!(var10000 instanceof lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl)) {
            return false;
         }

         var10000 = var1;
      }

      lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl var3 = (lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl)var10000;
      boolean var4 = Intrinsics.areEqual(
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
      );
      if (var2 != null) {
         if (!var4) {
            return false;
         }

         var4 = Intrinsics.areEqual(
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         );
      }

      if (var2 != null) {
         if (!var4) {
            return false;
         }

         var4 = Intrinsics.areEqual(
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
            var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         );
      }

      if (var2 != null) {
         if (!var4) {
            return false;
         }

         var4 = Intrinsics.areEqual(
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
            var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         );
      }

      if (var2 != null) {
         if (!var4) {
            return false;
         }

         var4 = Intrinsics.areEqual(
            this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
            var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         );
      }

      if (var2 != null) {
         if (!var4) {
            return false;
         }

         var4 = true;
      }

      return var4;
   }

   public lllllIIIllllllIIlIlIIIIIIIllIIIIIlIlIlIlIlIlIlIIIlIlIIIlIllIIlIllllIlllIlIIllllIlIIIl() {
      this(null, null, null, null, null, 31, null);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "k\u0099\u001dzÿäà\u0000\"'7g\u009b\u0087¤\u000b4áàe\u009e\u0003\u009e8ê%ç\u0019\u0004Wa\u0089Nº\u0005ïjvË`\u008fÛ®Ø\r]HÝtY\"Ê\u009d\u0004\u009b\u0003ó*";
      int var4 = "k\u0099\u001dzÿäà\u0000\"'7g\u009b\u0087¤\u000b4áàe\u009e\u0003\u009e8ê%ç\u0019\u0004Wa\u0089Nº\u0005ïjvË`\u008fÛ®Ø\r]HÝtY\"Ê\u009d\u0004\u009b\u0003ó*"
         .length();
      char var1 = 15;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 86;
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
                     case 0 -> 19;
                     case 1 -> 92;
                     case 2 -> 84;
                     case 3 -> 18;
                     case 4 -> 56;
                     case 5 -> 101;
                     default -> 106;
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
                     b = new String[6];
                     break label52;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "®ìR9N¼\u0099T\u007f\r·\fVHM\u00adª/ð\b\u0007aE5";
                  var4 = "®ìR9N¼\u0099T\u007f\r·\fVHM\u00adª/ð\b\u0007aE5".length();
                  var1 = 11;
                  var8 = -1;
            }

            var10000 = 120;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 27328) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 136;
            case 1 -> 181;
            case 2 -> 54;
            case 3 -> 229;
            case 4 -> 230;
            case 5 -> 172;
            case 6 -> 165;
            case 7 -> 206;
            case 8 -> 92;
            case 9 -> 144;
            case 10 -> 24;
            case 11 -> 142;
            case 12 -> 236;
            case 13 -> 193;
            case 14 -> 185;
            case 15 -> 234;
            case 16 -> 203;
            case 17 -> 161;
            case 18 -> 66;
            case 19 -> 179;
            case 20 -> 90;
            case 21 -> 29;
            case 22 -> 174;
            case 23 -> 120;
            case 24 -> 50;
            case 25 -> 207;
            case 26 -> 227;
            case 27 -> 113;
            case 28 -> 210;
            case 29 -> 253;
            case 30 -> 195;
            case 31 -> 124;
            case 32 -> 64;
            case 33 -> 12;
            case 34 -> 80;
            case 35 -> 18;
            case 36 -> 2;
            case 37 -> 250;
            case 38 -> 68;
            case 39 -> 4;
            case 40 -> 121;
            case 41 -> 147;
            case 42 -> 220;
            case 43 -> 155;
            case 44 -> 107;
            case 45 -> 104;
            case 46 -> 226;
            case 47 -> 148;
            case 48 -> 183;
            case 49 -> 16;
            case 50 -> 221;
            case 51 -> 62;
            case 52 -> 170;
            case 53 -> 111;
            case 54 -> 40;
            case 55 -> 106;
            case 56 -> 246;
            case 57 -> 65;
            case 58 -> 81;
            case 59 -> 21;
            case 60 -> 56;
            case 61 -> 72;
            case 62 -> 0;
            case 63 -> 9;
            case 64 -> 125;
            case 65 -> 6;
            case 66 -> 237;
            case 67 -> 42;
            case 68 -> 8;
            case 69 -> 164;
            case 70 -> 39;
            case 71 -> 14;
            case 72 -> 129;
            case 73 -> 20;
            case 74 -> 52;
            case 75 -> 166;
            case 76 -> 105;
            case 77 -> 152;
            case 78 -> 224;
            case 79 -> 32;
            case 80 -> 244;
            case 81 -> 196;
            case 82 -> 75;
            case 83 -> 242;
            case 84 -> 151;
            case 85 -> 1;
            case 86 -> 19;
            case 87 -> 86;
            case 88 -> 84;
            case 89 -> 23;
            case 90 -> 98;
            case 91 -> 191;
            case 92 -> 133;
            case 93 -> 76;
            case 94 -> 254;
            case 95 -> 89;
            case 96 -> 73;
            case 97 -> 138;
            case 98 -> 82;
            case 99 -> 219;
            case 100 -> 139;
            case 101 -> 74;
            case 102 -> 91;
            case 103 -> 211;
            case 104 -> 93;
            case 105 -> 184;
            case 106 -> 156;
            case 107 -> 126;
            case 108 -> 192;
            case 109 -> 208;
            case 110 -> 49;
            case 111 -> 22;
            case 112 -> 199;
            case 113 -> 216;
            case 114 -> 35;
            case 115 -> 255;
            case 116 -> 249;
            case 117 -> 143;
            case 118 -> 116;
            case 119 -> 102;
            case 120 -> 241;
            case 121 -> 189;
            case 122 -> 190;
            case 123 -> 45;
            case 124 -> 217;
            case 125 -> 63;
            case 126 -> 243;
            case 127 -> 127;
            case 128 -> 215;
            case 129 -> 94;
            case 130 -> 146;
            case 131 -> 51;
            case 132 -> 182;
            case 133 -> 145;
            case 134 -> 83;
            case 135 -> 205;
            case 136 -> 131;
            case 137 -> 118;
            case 138 -> 168;
            case 139 -> 70;
            case 140 -> 5;
            case 141 -> 200;
            case 142 -> 173;
            case 143 -> 41;
            case 144 -> 213;
            case 145 -> 109;
            case 146 -> 158;
            case 147 -> 33;
            case 148 -> 209;
            case 149 -> 223;
            case 150 -> 34;
            case 151 -> 239;
            case 152 -> 37;
            case 153 -> 130;
            case 154 -> 186;
            case 155 -> 235;
            case 156 -> 212;
            case 157 -> 88;
            case 158 -> 201;
            case 159 -> 15;
            case 160 -> 123;
            case 161 -> 198;
            case 162 -> 31;
            case 163 -> 150;
            case 164 -> 225;
            case 165 -> 149;
            case 166 -> 160;
            case 167 -> 26;
            case 168 -> 55;
            case 169 -> 232;
            case 170 -> 154;
            case 171 -> 252;
            case 172 -> 218;
            case 173 -> 137;
            case 174 -> 178;
            case 175 -> 159;
            case 176 -> 27;
            case 177 -> 187;
            case 178 -> 99;
            case 179 -> 251;
            case 180 -> 43;
            case 181 -> 71;
            case 182 -> 112;
            case 183 -> 233;
            case 184 -> 46;
            case 185 -> 95;
            case 186 -> 197;
            case 187 -> 77;
            case 188 -> 132;
            case 189 -> 30;
            case 190 -> 248;
            case 191 -> 177;
            case 192 -> 58;
            case 193 -> 10;
            case 194 -> 100;
            case 195 -> 85;
            case 196 -> 48;
            case 197 -> 17;
            case 198 -> 108;
            case 199 -> 167;
            case 200 -> 78;
            case 201 -> 60;
            case 202 -> 25;
            case 203 -> 97;
            case 204 -> 7;
            case 205 -> 228;
            case 206 -> 194;
            case 207 -> 11;
            case 208 -> 141;
            case 209 -> 13;
            case 210 -> 176;
            case 211 -> 114;
            case 212 -> 122;
            case 213 -> 101;
            case 214 -> 38;
            case 215 -> 3;
            case 216 -> 169;
            case 217 -> 204;
            case 218 -> 135;
            case 219 -> 117;
            case 220 -> 79;
            case 221 -> 163;
            case 222 -> 240;
            case 223 -> 67;
            case 224 -> 128;
            case 225 -> 87;
            case 226 -> 180;
            case 227 -> 202;
            case 228 -> 247;
            case 229 -> 171;
            case 230 -> 53;
            case 231 -> 157;
            case 232 -> 44;
            case 233 -> 115;
            case 234 -> 231;
            case 235 -> 61;
            case 236 -> 188;
            case 237 -> 245;
            case 238 -> 28;
            case 239 -> 153;
            case 240 -> 103;
            case 241 -> 47;
            case 242 -> 57;
            case 243 -> 110;
            case 244 -> 175;
            case 245 -> 96;
            case 246 -> 69;
            case 247 -> 140;
            case 248 -> 59;
            case 249 -> 36;
            case 250 -> 238;
            case 251 -> 134;
            case 252 -> 119;
            case 253 -> 162;
            case 254 -> 214;
            default -> 222;
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
