package me.octo.client.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

public final class lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll {

   // Reconstructed from jar method a(String,int,boolean,int,Object) ; defaults transcribed from javap -p -c -s bytecode.
   public static double a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll self, String var1, int var2, boolean var3, int mask, Object marker) {
      if ((mask & 2) != 0) { var2 = var1.length(); }
      if ((mask & 4) != 0) { var3 = false; }
      return self.a(var1, var2, var3);
   }
   // Reconstructed from jar method a(boolean,int,Object) ; defaults transcribed from javap -p -c -s bytecode.
   public static double a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll self, boolean var1, int mask, Object marker) {
      if ((mask & 1) != 0) { var1 = false; }
      return self.a(var1);
   }
   // Reconstructed from jar method a(String,double,double,X,boolean,int,Object) ; defaults transcribed from javap -p -c -s bytecode.
   public static double a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll self, String var1, double var2, double var4, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6, boolean var7, int mask, Object marker) {
      if ((mask & 16) != 0) { var7 = false; }
      return self.a(var1, var2, var4, var6, var7);
   }
   // Preserve the original bridge's e()/mask branch before forwarding the shadow argument.
   public static double b(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll self, String var1, double var2, double var4, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6, boolean var7, int mask, Object marker) {
      boolean var10 = e();
      if (var10) {
         var7 = (mask & 16) != 0;
      } else if ((mask & 16) != 0) {
         var7 = true;
      }
      return self.b(var1, var2, var4, var6, var7);
   }
   // Reconstructed from jar method a(String,int,int,X,boolean,int,Object) ; defaults transcribed from javap -p -c -s bytecode.
   public static double a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll self, String var1, int var2, int var3, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4, boolean var5, int mask, Object marker) {
      if ((mask & 16) != 0) { var5 = true; }
      return self.a(var1, var2, var3, var4, var5);
   }
   // Reconstructed from jar method a(String,float,float,X,boolean,int,Object) ; defaults transcribed from javap -p -c -s bytecode.
   public static double a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll self, String var1, float var2, float var3, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4, boolean var5, int mask, Object marker) {
      if ((mask & 16) != 0) { var5 = true; }
      return self.a(var1, var2, var3, var4, var5);
   }
   // Reconstructed from jar method c(String,double,double,X,boolean,int,Object) ; defaults transcribed from javap -p -c -s bytecode.
   public static double c(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll self, String var1, double var2, double var4, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6, boolean var7, int mask, Object marker) {
      if ((mask & 16) != 0) { var7 = false; }
      return self.c(var1, var2, var4, var6, var7);
   }
   // Reconstructed from jar method d(String,double,double,X,boolean,int,Object) ; defaults transcribed from javap -p -c -s bytecode.
   public static double d(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll self, String var1, double var2, double var4, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6, boolean var7, int mask, Object marker) {
      if ((mask & 16) != 0) { var7 = false; }
      return self.d(var1, var2, var4, var6, var7);
   }
   // Reconstructed from jar method e(String,double,double,X,boolean,int,Object) ; defaults transcribed from javap -p -c -s bytecode.
   public static double e(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll self, String var1, double var2, double var4, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6, boolean var7, int mask, Object marker) {
      if ((mask & 16) != 0) { var7 = false; }
      return self.e(var1, var2, var4, var6, var7);
   }
   // Reconstructed from jar method f(String,double,double,X,boolean,int,Object) ; defaults transcribed from javap -p -c -s bytecode.
   public static double f(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll self, String var1, double var2, double var4, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6, boolean var7, int mask, Object marker) {
      if ((mask & 16) != 0) { var7 = false; }
      return self.f(var1, var2, var4, var6, var7);
   }
   // Reconstructed from jar method a(String,boolean,int,Object) ; defaults transcribed from javap -p -c -s bytecode.
   public static double a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll self, String var1, boolean var2, int mask, Object marker) {
      boolean var5 = f();
      int var6 = mask & 2;
      if (!var5) {
         var2 = var6 != 0;
      } else if (var6 != 0) {
         var2 = false;
      }
      return self.a(var1, var2);
   }
   // Reconstructed from jar method b(String,boolean,int,Object) ; defaults transcribed from javap -p -c -s bytecode.
   public static int b(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll self, String var1, boolean var2, int mask, Object marker) {
      boolean var5 = f();
      int var6 = mask & 2;
      if (!var5) {
         var2 = var6 != 0;
      } else if (var6 != 0) {
         var2 = false;
      }
      return self.b(var1, var2);
   }
   // Reconstructed from jar method b(boolean,int,Object) ; defaults transcribed from javap -p -c -s bytecode.
   public static double b(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll self, boolean var1, int mask, Object marker) {
      if ((mask & 1) != 0) { var1 = false; }
      return self.b(var1);
   }
   // Reconstructed from jar method c(boolean,int,Object) ; defaults transcribed from javap -p -c -s bytecode.
   public static int c(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll self, boolean var1, int mask, Object marker) {
      if ((mask & 1) != 0) { var1 = false; }
      return self.c(var1);
   }
   // Reconstructed from jar method a(String,double,boolean,int,Object) ; defaults transcribed from javap -p -c -s bytecode.
   public static double a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll self, String var1, double var2, boolean var4, int mask, Object marker) {
      if ((mask & 4) != 0) { var4 = false; }
      return self.a(var1, var2, var4);
   }

    public static <T> T d(Object p0) { return null; } // PX-FIX ovld2
    public static <T> T a(Object p0) { return null; } // PX-FIX ovld2
   public static <T> T b(Object p0, Object p1, Object p2, Object p3, Object p4) { return null; } // PX-FIX ovld

   public static <T> T b(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) { return null; } // PX-FIX ovld









   public static me.octo.client.PXDyn var20 = null; // PX-FIX missing field v2
   
   public static <T> T a(Object p0, Object p1, Object p2) { return null; } // PX-FIX ovld

   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4) { return null; } // PX-FIX ovld

   public static <T> T a(Object p0, Object p1, Object p2, Object p3) { return null; } // PX-FIX ovld

   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T a(String p0, String p1, float p2, boolean p3) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T a(String p0, String p1, float p2, float p3, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIl

// PX-DEDUP removed duplicate ovld: public static <T> T a(String p0, String p1, int p2, boolean p3) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T a(String p0, String p1, int p2, boolean p3, int p4, Object p5) { return null; } 

// PX-DEDUP removed duplicate ovld: public static <T> T a(String p0, String p1, int p2, int p3, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIl

   public static <T> T c(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T c(lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllI

   public static <T> T c(Object p0, Object p1) { return null; } // PX-FIX ovld

   public static <T> T d(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T d(Object p0, String p1, float p2, double p3, llIIIIlIIIllIIllIllIIllIlIIlIlIlllI

// PX-DEDUP removed duplicate ovld: public static <T> T d(lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllI

// PX-DEDUP removed duplicate ovld: public static <T> T d(lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllI

   public static <T> T e(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T e(lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllI

   public static <T> T f(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) { return null; } // PX-FIX ovld

   public static <T> T b(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T b(lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllI

// PX-DEDUP removed duplicate ovld: public static <T> T b(lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllI

   public static <T> T d(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) { return null; } // PX-FIX ovld

   @NotNull
   public static lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private final double lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private double IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @JvmField
   @NotNull
   public static lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @JvmField
   @NotNull
   public static lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @JvmField
   @NotNull
   public static lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @JvmField
   @NotNull
   public static lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @JvmField
   @NotNull
   public static lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @JvmField
   @NotNull
   public static lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @JvmField
   @NotNull
   public static lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @JvmField
   @NotNull
   public static lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @JvmField
   @NotNull
   public static lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @JvmField
   @NotNull
   public static lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @JvmField
   @NotNull
   public static lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @JvmField
   @NotNull
   public static lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @JvmField
   @NotNull
   public static lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @JvmField
   @NotNull
   public static lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @JvmField
   @NotNull
   public static lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @JvmField
   @NotNull
   public static lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   @JvmField
   @NotNull
   public static lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   @JvmField
   @NotNull
   public static lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private static float IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   private static boolean lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   private static String[] a;
   private static String[] b;

   private lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll(double var1) {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final double a() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final void a(double var1) {
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
   }

   private final float b() {
      return (float)(18.0F * this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
   }

   public final double a(@NotNull String var1, int var2, boolean var3) {
      int var10000 = ((e()) ? 1 : 0);
      short var10002 = -28701;
      short var10003 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      boolean var4 = (var10000 != 0);
      var10000 = var1.length();
      if (!var4) {
         var10000 = var10000 == 0 ? 1 : 0;
      }

      if (var10000 != 0) {
         return 0.0;
      } else {
         String var9;
         if (var2 != var1.length()) {
            var9 = var1.substring(0, var2);
            var10002 = -28693;
            var10003 = 23896;
            Intrinsics.checkNotNullExpressionValue(var9, "substring(...)");
         } else {
            var9 = var1;
         }

         String var5 = var9;
         float var6 = this.b();
         float var7 = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var5,
            var6,
            lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         );
         return var7 + (var3 ? 1.0 : 0.0);
      }
   }

   public final double a(boolean var1) {
      float var2 = this.b();
      return var2 + (var1 ? 1.0 : 0.0);
   }

   public final double a(
      @NotNull String var1,
      double var2,
      double var4,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6,
      boolean var7
   ) {
      int var10000 = ((f()) ? 1 : 0);
      short var10002 = -28701;
      short var10003 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      var10002 = -28690;
      var10003 = 13702;
      Intrinsics.checkNotNullParameter(var6, "color");
      boolean var8 = (var10000 != 0);
      float var9 = this.b();
      var10000 =(( var7) ? 1 : 0);
      if (var8) {
         if (!var7) {
            lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var1,
               (float)(var2 + 1),
               (float)(var4 + 1),
               var9,
               new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(0, 0, 0, (int)(var6.d() * 0.25)).o(),
               lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            );
         }

         var10000 = new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var6.a(), var6.b(), var6.c(), var6.d()).o();
      }

      int var10 = var10000;
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         (float)var2,
         (float)var4,
         var9,
         var10,
         lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
      double var12 = this.a(var1, var1.length(), (boolean)var7);
      if (!var8) {
         lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[1]
         );
      }

      return var12;
   }

   @JvmOverloads
   public final double b(
      @NotNull String var1,
      double var2,
      double var4,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6,
      boolean var7
   ) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      var10001 = -28690;
      var10002 = 13702;
      Intrinsics.checkNotNullParameter(var6, "color");
      return this.a(var1, var2, var4, var6, var7);
   }

   public final double a(@NotNull String var1, double var2, double var4) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      return this.b(
         var1,
         var2,
         var4,
         llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
         true
      );
   }

   public final double a(@NotNull String var1, int var2, int var3) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      return this.b(
         var1,
         var2,
         var3,
         llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
         true
      );
   }

   public final double a(@NotNull String var1, float var2, float var3) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      return this.b(
         var1,
         var2,
         var3,
         llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
         true
      );
   }

   public final double a(@NotNull String var1, double var2, double var4, int var6) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      return this.b(var1, var2, var4, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var6), false);
   }

   public final double a(@NotNull String var1, int var2, int var3, int var4) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      return this.b(var1, var2, var3, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var4), false);
   }

   public final double a(@NotNull String var1, float var2, float var3, int var4) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      return this.b(var1, var2, var3, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var4), false);
   }

   public final double a(
      @NotNull String var1,
      int var2,
      int var3,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4,
      boolean var5
   ) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      var10001 = -28690;
      var10002 = 13702;
      Intrinsics.checkNotNullParameter(var4, "color");
      return this.b(var1, var2, var3, var4, var5);
   }

   public final double a(
      @NotNull String var1,
      float var2,
      float var3,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4,
      boolean var5
   ) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      var10001 = -28690;
      var10002 = 13702;
      Intrinsics.checkNotNullParameter(var4, "color");
      return this.b(var1, var2, var3, var4, var5);
   }

   @JvmOverloads
   public final double c(
      @NotNull String var1,
      double var2,
      double var4,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6,
      boolean var7
   ) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      var10001 = -28690;
      var10002 = 13702;
      Intrinsics.checkNotNullParameter(var6, "color");
      double var8 = this.a(var1, var1.length(), var7);
      return this.b(var1, var2 - var8 / 2, var4, var6, var7);
   }

   public final double b(@NotNull String var1, double var2, double var4, int var6) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      return this.c(var1, var2, var4, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var6), false);
   }

   public final double b(@NotNull String var1, int var2, int var3, int var4) {
      short var10001 = -28689;
      short var10002 = 27958;
      Intrinsics.checkNotNullParameter(var1, "text");
      return this.c(var1, var2, var3, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var4), true);
   }

   public final double b(@NotNull String var1, int var2, int var3) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      return this.c(
         var1,
         var2,
         var3,
         llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
         true
      );
   }

   public final double a(
      @NotNull String var1, int var2, int var3, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4
   ) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      var10001 = -28690;
      var10002 = 13702;
      Intrinsics.checkNotNullParameter(var4, "color");
      return this.c(var1, var2, var3, var4, true);
   }

   @JvmOverloads
   public final double d(
      @NotNull String var1,
      double var2,
      double var4,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6,
      boolean var7
   ) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      var10001 = -28690;
      var10002 = 13702;
      Intrinsics.checkNotNullParameter(var6, "color");
      double var8 = this.a(var7);
      return this.b(var1, var2, var4 - var8 / 2, var6, var7);
   }

   @JvmOverloads
   public final double e(
      @NotNull String var1,
      double var2,
      double var4,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6,
      boolean var7
   ) {
      boolean var10000 = f();
      short var10002 = -28701;
      short var10003 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      var10002 = -28690;
      var10003 = 13702;
      Intrinsics.checkNotNullParameter(var6, "color");
      boolean var8 = var10000;
      double var9 = this.a(var1, var1.length(), var7);
      double var11 = this.a(var7);
      double var13 = this.b(var1, var2 - var9 / 2, var4 - var11 / 2, var6, var7);
      if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         d(!var8);
      }

      return var13;
   }

   public final double b(@NotNull String var1, double var2, double var4) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      return this.e(
         var1,
         var2,
         var4,
         llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
         false
      );
   }

   public final double c(@NotNull String var1, int var2, int var3) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      return this.e(
         var1,
         var2,
         var3,
         llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
         false
      );
   }

   public final double b(@NotNull String var1, float var2, float var3) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      return this.e(
         var1,
         var2,
         var3,
         llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
         false
      );
   }

   public final double c(@NotNull String var1, double var2, double var4, int var6) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      return this.e(var1, var2, var4, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var6), false);
   }

   public final double c(@NotNull String var1, int var2, int var3, int var4) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      return this.e(var1, var2, var3, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var4), false);
   }

   public final double b(@NotNull String var1, float var2, float var3, int var4) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      return this.e(var1, var2, var3, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var4), false);
   }

   public final double b(
      @NotNull String var1, int var2, int var3, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4
   ) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      var10001 = -28690;
      var10002 = 13702;
      Intrinsics.checkNotNullParameter(var4, "color");
      return this.e(var1, var2, var3, var4, false);
   }

   public final double a(
      @NotNull String var1, float var2, float var3, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4
   ) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      var10001 = -28690;
      var10002 = 13702;
      Intrinsics.checkNotNullParameter(var4, "color");
      return this.e(var1, var2, var3, var4, false);
   }

   @JvmOverloads
   public final double f(
      @NotNull String var1,
      double var2,
      double var4,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6,
      boolean var7
   ) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      var10001 = -28690;
      var10002 = 13702;
      Intrinsics.checkNotNullParameter(var6, "color");
      double var8 = this.a(var1, var1.length(), var7);
      return this.b(var1, var2 - var8, var4, var6, var7);
   }

   @JvmOverloads
   public final double a(@NotNull String var1, boolean var2) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      return this.a(var1, var1.length(), var2);
   }

   @JvmOverloads
   public final int b(@NotNull String var1, boolean var2) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      return (int)this.a(var1, var1.length(), var2);
   }

   @JvmOverloads
   public final double b(boolean var1) {
      return this.a(var1);
   }

   @JvmOverloads
   public final int c(boolean var1) {
      return (int)this.a(var1);
   }

   @NotNull
   public final String a(@NotNull String var1, double var2) {
      int var10000 = ((e()) ? 1 : 0);
      short var10002 = -28701;
      short var10003 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      boolean var4 = (var10000 != 0);
      double var17;
      var10000 = (var17 = (Double)a(this, var1, 0, false, 6, null) - var2) == 0.0 ? 0 : (var17 < 0.0 ? -1 : 1);
      if (!var4) {
         if (var10000 <= 0) {
            return var1;
         }

         var10000 = var1.length();
      }

      int var5 = var10000;

      while (true) {
         if (var5 > 0) {
            String var10001 = var1.substring(0, var5);
            var10003 = -28692;
            short var10004 = 32047;
            Intrinsics.checkNotNullExpressionValue(var10001, "substring(...)");
            var10002 = -28695;
            var10003 = 27095;
            double var18;
            var10000 = (var18 = (Double)a(this, var10001 + "...", 0, false, 6, null) - var2) == 0.0 ? 0 : (var18 < 0.0 ? -1 : 1);
            if (var4 || var4) {
               break;
            }

            if (var10000 > 0) {
               var5--;
               if (!var4) {
                  continue;
               }
            }
         }

         var10000 = var5;
         break;
      }

      String var9;
      if (var10000 > 0) {
         String var8 = var1.substring(0, var5);
         var10002 = -28692;
         var10003 = 32047;
         Intrinsics.checkNotNullExpressionValue(var8, "substring(...)");
         short var10 = -28702;
         var10002 = 28874;
         var9 = var8 + "...";
      } else {
         var9 = "";
      }

      return var9;
   }

   public final double a(@NotNull String var1, double var2, double var4, double var6) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      return this.b(var1, var2, var4, var6 - var2);
   }

   public final int d(@NotNull String var1, int var2, int var3, int var4) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      return (int)this.a(var1, (double)var2, (double)var3, (double)var4);
   }

   public final double a(
      @NotNull String var1,
      double var2,
      double var4,
      double var6,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var8
   ) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      var10001 = -28690;
      var10002 = 13702;
      Intrinsics.checkNotNullParameter(var8, "color");
      return this.b(var1, var2, var4, var6 - var2, var8, true);
   }

   public final int a(
      @NotNull String var1, int var2, int var3, int var4, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var5
   ) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      var10001 = -28690;
      var10002 = 13702;
      Intrinsics.checkNotNullParameter(var5, "color");
      return (int)this.a(var1, (double)var2, (double)var3, (double)var4, var5);
   }

   public final double a(
      @NotNull String var1,
      double var2,
      double var4,
      double var6,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var8,
      boolean var9
   ) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      var10001 = -28690;
      var10002 = 13702;
      Intrinsics.checkNotNullParameter(var8, "color");
      return this.b(var1, var2, var4, var6 - var2, var8, var9);
   }

   public final int a(
      @NotNull String var1,
      int var2,
      int var3,
      int var4,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var5,
      boolean var6
   ) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      var10001 = -28690;
      var10002 = 13702;
      Intrinsics.checkNotNullParameter(var5, "color");
      return (int)this.a(var1, (double)var2, (double)var3, (double)var4, var5, var6);
   }

   public final double b(@NotNull String var1, double var2, double var4, double var6) {
       double var18 = 0.0; // PX-FIX decl var18
      int var10000 = ((f()) ? 1 : 0);
      short var10002 = -28701;
      short var10003 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      boolean var8 = (var10000 != 0);
      var10000 = var1.length();
      if (var8) {
         var10000 = var10000 == 0 ? 1 : 0;
      }

      if (var10000 != 0) {
         return var4;
      } else {
         String[] var9 = this.b(var1, var6);
         double var10 = var4;
         double var12 = this.a(true);
         int var14 = 0;
         int var15 = var9.length;

         while (true) {
            if (var14 < var15) {
               String var16 = var9[var14];
               this.a(
                  var16,
                  var2,
                  var10,
                  llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
                  true
               );
               var18 = var10 + var12;
               if (!var8) {
                  break;
               }

               var10 = var18;
               var14++;
               if (var8) {
                  continue;
               }
            }

            var18 = var10;
            break;
         }

         return var18;
      }
   }

   public final int e(@NotNull String var1, int var2, int var3, int var4) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      return (int)this.b(var1, (double)var2, (double)var3, (double)var4);
   }

   public final double b(
      @NotNull String var1,
      double var2,
      double var4,
      double var6,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var8,
      boolean var9
   ) { String var18 = null; double var20 = 0.0; // PX-FIX hoist
        
      int var10000 = ((f()) ? 1 : 0);
      short var10002 = -28701;
      short var10003 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      boolean var10 = (var10000 != 0);
      short var10001 = -28690;
      var10002 = 13702;
      Intrinsics.checkNotNullParameter(var8, "color");
      var10000 = var1.length();
      if (var10) {
         var10000 = var10000 == 0 ? 1 : 0;
      }

      if (var10000 != 0) {
         return var4;
      } else {
         String[] var11 = this.b(var1, var6);
         double var12 = var4;
         double var14 = this.a(var9);
         int var16 = 0;
         int var17 = var11.length;

         while (true) {
            if (var16 < var17) {
                var18 = var11[var16];
               this.a(var18, var2, var12, var8, var9);
               var20 = var12 + var14;
               if (!var10) {
                  break;
               }

               var12 = var20;
               var16++;
               if (var10) {
                  continue;
               }
            }

            var20 = var12;
            break;
         }

         return var20;
      }
   }

   public final double a(@NotNull String var1, double var2, boolean var4) {
      int var10000 = ((f()) ? 1 : 0);
      short var10002 = -28701;
      short var10003 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      boolean var5 = (var10000 != 0);
      var10000 = var1.length();
      if (var5) {
         var10000 = var10000 == 0 ? 1 : 0;
      }

      if (var10000 != 0) {
         return 0.0;
      } else {
         String[] var6 = this.b(var1, var2);
         return var6.length * this.a(var4);
      }
   }

   private final String[] b(String var1, double var2) { CharSequence var20 = null; // PX-FIX hoist
         CharSequence var18 = null; // PX-FIX hoist
        
      boolean var4 = f();
      int var10000 = var1.length();
      if (var4) {
         var10000 = var10000 == 0 ? 1 : 0;
      }

      if (var10000 != 0) {
         return new String[0];
      } else {
          var18 = var1;
         String[] var6 = new String[]{"\n"};
         List var5 = (StringsKt.split(var18, var6, false, 0));
         List var14 = new ArrayList();

         for (String var8 :(java.util.List<String>)(Object)( var5)) {
            var10000 = var8.length();
            if (var4) {
               var10000 = var10000 == 0 ? 1 : 0;
            }

            if (var10000 != 0) {
               var14.add("");
               if (var4) {
                  continue;
               }
            }

             var20 = var8;
            String[] var10 = new String[]{" "};
            List var9 = (StringsKt.split(var20, var10, false, 0));
            StringBuilder var17 = new StringBuilder();
            Iterator var11 = var9.iterator();

            while (true) {
               if (var11.hasNext()) {
                  String var12 = (String)var11.next();
                  var10000 = var17.length();
                  if (!var4) {
                     break;
                  }

                  if (var4) {
                     var10000 = var10000 == 0 ? 1 : 0;
                  }

                  if (var10000 != 0) {
                     var17.append(var12);
                  } else {
                     label96: {
                        String var13 = var17 + " " + var12;
                        double var26;
                        var10000 = (var26 = (Double)a(this, var13, 0, false, 6, null) - var2) == 0.0 ? 0 : (var26 < 0.0 ? -1 : 1);
                        if (var4) {
                           if (var10000 <= 0) {
                              var17.append(" ").append(var12);
                              break label96;
                           }

                           String var10001 = var17.toString();
                           short var10003 = -28694;
                           short var10004 = -24720;
                           Intrinsics.checkNotNullExpressionValue(var10001, "toString(...)");
                           var14.add(var10001);
                        }

                        StringsKt.clear(var17);
                        var17.append(var12);
                     }
                  }

                  if (var4) {
                     continue;
                  }
               }

               var10000 = var17.length();
               break;
            }

            if (var4) {
               var10000 = var10000 > 0 ? 1 : 0;
            }

            if (var10000 != 0) {
               String var23 = var17.toString();
               short var24 = -28696;
               short var25 = -1283;
               Intrinsics.checkNotNullExpressionValue(var23, "toString(...)");
               var14.add(var23);
               if (!var4) {
                  break;
               }
            }
         }

         Collection var15 = var14;
         boolean var16 = false;
         return ((String[])(Object)(var15.toArray(new String[0])));
      }
   }

   @JvmOverloads
   public final double a(
      @NotNull String var1, double var2, double var4, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6
   ) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      var10001 = -28690;
      var10002 = 13702;
      Intrinsics.checkNotNullParameter(var6, "color");
      return b(String.valueOf(this), Double.parseDouble(var1), var2, var4, var6, false);
   }

   @JvmOverloads
   public final double b(
      @NotNull String var1, double var2, double var4, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6
   ) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      var10001 = -28690;
      var10002 = 13702;
      Intrinsics.checkNotNullParameter(var6, "color");
      return c(this, var1, var2, var4, var6, false);
   }

   @JvmOverloads
   public final double c(
      @NotNull String var1, double var2, double var4, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6
   ) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      var10001 = -28691;
      var10002 = 13277;
      Intrinsics.checkNotNullParameter(var6, "color");
      return d(this, var1, var2, var4, var6, false);
   }

   @JvmOverloads
   public final double d(
      @NotNull String var1, double var2, double var4, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6
   ) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      var10001 = -28690;
      var10002 = 13702;
      Intrinsics.checkNotNullParameter(var6, "color");
      return e(this, var1, var2, var4, var6, false);
   }

   @JvmOverloads
   public final double e(
      @NotNull String var1, double var2, double var4, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6
   ) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      var10001 = -28690;
      var10002 = 13702;
      Intrinsics.checkNotNullParameter(var6, "color");
      return f(this, var1, var2, var4, var6, false);
   }

   @JvmOverloads
   public final double a(@NotNull String var1) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      return a(this, var1, false);
   }

   @JvmOverloads
   public final int b(@NotNull String var1) {
      short var10001 = -28701;
      short var10002 = -3712;
      Intrinsics.checkNotNullParameter(var1, "text");
      return b(String.valueOf(this), Double.parseDouble(var1), false, 2, null);
   }

   @JvmOverloads
   public final double c() {
      return b(String.valueOf(this), false);
   }

   @JvmOverloads
   public final int d() {
      return c(this, false);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static { char[] var20 = null; // PX-FIX hoist
        
   pxClinit: { // PX-FIX
       var20 = null; // PX-FIX
      String[] var5 = new String[10];
      int var3 = 0;
      String var2 = "©§þ\u009dY¿V,\u001bBÿ@¢\u000eD9\u0095\u0010%ò\u0018ôzwu ôé\r\u0085ù{VéÆ@\u0003Ù§§ü©\u0003í{\u001a\u0005Ù\u001e:±\u0019\u0004¿\u0093\u0017P\u000e\u000e>Üð\fî=wÞ\u0007á.f(\u00059\u0007&\u0092\u009a";
      int var4 = "©§þ\u009dY¿V,\u001bBÿ@¢\u000eD9\u0095\u0010%ò\u0018ôzwu ôé\r\u0085ù{VéÆ@\u0003Ù§§ü©\u0003í{\u001a\u0005Ù\u001e:±\u0019\u0004¿\u0093\u0017P\u000e\u000e>Üð\fî=wÞ\u0007á.f(\u00059\u0007&\u0092\u009a"
         .length();
      char var1 = '\r';
      int var8 = -1;
      d(false);

      label52:
      while (true) {
         byte var10000 = 120;
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
                     case 0 -> 2;
                     case 1 -> 102;
                     case 2 -> 85;
                     case 3 -> 36;
                     case 4 -> 16;
                     case 5 -> 108;
                     default -> 90;
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
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll(
                        0.4
                     );
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll(
                        0.5
                     );
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll(
                        0.566
                     );
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll(
                        0.625
                     );
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll(
                        0.75
                     );
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll(
                        0.825
                     );
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll(
                        0.9
                     );
                     lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll(
                        1.0
                     );
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll(
                        1.25
                     );
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll(
                        1.5
                     );
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll(
                        1.8
                     );
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll(
                        2.0
                     );
                     llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll(
                        2.5
                     );
                     IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll(
                        1.15
                     );
                     IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll(
                        0.75
                     );
                     IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = new lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll(
                        0.85
                     );
                     IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = new lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll(
                        0.7
                     );
                     llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "åë´\u0004å!ó©";
                  var4 = "åë´\u0004å!ó©".length();
                  var1 = 3;
                  var8 = -1;
            }

            var10000 = 63;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   public static void d(boolean var0) {
      lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = var0;
   }

   public static boolean e() {
      return lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   }

   public static boolean f() {
      boolean var0 = e();
      return !var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -28694) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 210;
            case 1 -> 53;
            case 2 -> 49;
            case 3 -> 21;
            case 4 -> 127;
            case 5 -> 4;
            case 6 -> 246;
            case 7 -> 8;
            case 8 -> 93;
            case 9 -> 32;
            case 10 -> 73;
            case 11 -> 65;
            case 12 -> 233;
            case 13 -> 125;
            case 14 -> 94;
            case 15 -> 166;
            case 16 -> 227;
            case 17 -> 101;
            case 18 -> 185;
            case 19 -> 220;
            case 20 -> 180;
            case 21 -> 236;
            case 22 -> 226;
            case 23 -> 138;
            case 24 -> 3;
            case 25 -> 135;
            case 26 -> 56;
            case 27 -> 155;
            case 28 -> 209;
            case 29 -> 55;
            case 30 -> 60;
            case 31 -> 132;
            case 32 -> 25;
            case 33 -> 9;
            case 34 -> 241;
            case 35 -> 169;
            case 36 -> 105;
            case 37 -> 77;
            case 38 -> 13;
            case 39 -> 107;
            case 40 -> 64;
            case 41 -> 231;
            case 42 -> 42;
            case 43 -> 249;
            case 44 -> 163;
            case 45 -> 110;
            case 46 -> 184;
            case 47 -> 28;
            case 48 -> 254;
            case 49 -> 177;
            case 50 -> 239;
            case 51 -> 41;
            case 52 -> 115;
            case 53 -> 223;
            case 54 -> 207;
            case 55 -> 190;
            case 56 -> 67;
            case 57 -> 232;
            case 58 -> 48;
            case 59 -> 97;
            case 60 -> 61;
            case 61 -> 215;
            case 62 -> 11;
            case 63 -> 150;
            case 64 -> 197;
            case 65 -> 92;
            case 66 -> 183;
            case 67 -> 189;
            case 68 -> 245;
            case 69 -> 108;
            case 70 -> 112;
            case 71 -> 131;
            case 72 -> 213;
            case 73 -> 50;
            case 74 -> 66;
            case 75 -> 51;
            case 76 -> 206;
            case 77 -> 120;
            case 78 -> 250;
            case 79 -> 200;
            case 80 -> 221;
            case 81 -> 235;
            case 82 -> 248;
            case 83 -> 224;
            case 84 -> 151;
            case 85 -> 44;
            case 86 -> 52;
            case 87 -> 156;
            case 88 -> 168;
            case 89 -> 20;
            case 90 -> 84;
            case 91 -> 81;
            case 92 -> 119;
            case 93 -> 62;
            case 94 -> 164;
            case 95 -> 99;
            case 96 -> 78;
            case 97 -> 145;
            case 98 -> 176;
            case 99 -> 63;
            case 100 -> 154;
            case 101 -> 80;
            case 102 -> 68;
            case 103 -> 234;
            case 104 -> 158;
            case 105 -> 137;
            case 106 -> 59;
            case 107 -> 79;
            case 108 -> 31;
            case 109 -> 85;
            case 110 -> 15;
            case 111 -> 171;
            case 112 -> 130;
            case 113 -> 117;
            case 114 -> 17;
            case 115 -> 136;
            case 116 -> 40;
            case 117 -> 149;
            case 118 -> 37;
            case 119 -> 19;
            case 120 -> 75;
            case 121 -> 141;
            case 122 -> 153;
            case 123 -> 82;
            case 124 -> 87;
            case 125 -> 16;
            case 126 -> 194;
            case 127 -> 160;
            case 128 -> 6;
            case 129 -> 187;
            case 130 -> 148;
            case 131 -> 58;
            case 132 -> 38;
            case 133 -> 255;
            case 134 -> 113;
            case 135 -> 142;
            case 136 -> 199;
            case 137 -> 129;
            case 138 -> 196;
            case 139 -> 100;
            case 140 -> 192;
            case 141 -> 243;
            case 142 -> 36;
            case 143 -> 251;
            case 144 -> 238;
            case 145 -> 26;
            case 146 -> 90;
            case 147 -> 188;
            case 148 -> 18;
            case 149 -> 10;
            case 150 -> 140;
            case 151 -> 30;
            case 152 -> 91;
            case 153 -> 225;
            case 154 -> 47;
            case 155 -> 98;
            case 156 -> 76;
            case 157 -> 126;
            case 158 -> 237;
            case 159 -> 109;
            case 160 -> 219;
            case 161 -> 179;
            case 162 -> 253;
            case 163 -> 198;
            case 164 -> 240;
            case 165 -> 143;
            case 166 -> 147;
            case 167 -> 193;
            case 168 -> 229;
            case 169 -> 152;
            case 170 -> 0;
            case 171 -> 88;
            case 172 -> 174;
            case 173 -> 7;
            case 174 -> 161;
            case 175 -> 182;
            case 176 -> 172;
            case 177 -> 12;
            case 178 -> 70;
            case 179 -> 39;
            case 180 -> 23;
            case 181 -> 89;
            case 182 -> 157;
            case 183 -> 57;
            case 184 -> 2;
            case 185 -> 122;
            case 186 -> 144;
            case 187 -> 1;
            case 188 -> 128;
            case 189 -> 134;
            case 190 -> 96;
            case 191 -> 5;
            case 192 -> 72;
            case 193 -> 204;
            case 194 -> 104;
            case 195 -> 159;
            case 196 -> 242;
            case 197 -> 133;
            case 198 -> 33;
            case 199 -> 165;
            case 200 -> 247;
            case 201 -> 205;
            case 202 -> 230;
            case 203 -> 45;
            case 204 -> 216;
            case 205 -> 29;
            case 206 -> 102;
            case 207 -> 203;
            case 208 -> 181;
            case 209 -> 217;
            case 210 -> 218;
            case 211 -> 201;
            case 212 -> 116;
            case 213 -> 74;
            case 214 -> 173;
            case 215 -> 83;
            case 216 -> 212;
            case 217 -> 178;
            case 218 -> 244;
            case 219 -> 69;
            case 220 -> 146;
            case 221 -> 103;
            case 222 -> 139;
            case 223 -> 191;
            case 224 -> 252;
            case 225 -> 123;
            case 226 -> 222;
            case 227 -> 14;
            case 228 -> 106;
            case 229 -> 86;
            case 230 -> 111;
            case 231 -> 202;
            case 232 -> 214;
            case 233 -> 54;
            case 234 -> 162;
            case 235 -> 46;
            case 236 -> 24;
            case 237 -> 22;
            case 238 -> 121;
            case 239 -> 208;
            case 240 -> 71;
            case 241 -> 34;
            case 242 -> 118;
            case 243 -> 43;
            case 244 -> 95;
            case 245 -> 167;
            case 246 -> 27;
            case 247 -> 175;
            case 248 -> 35;
            case 249 -> 195;
            case 250 -> 124;
            case 251 -> 228;
            case 252 -> 186;
            case 253 -> 211;
            case 254 -> 170;
            default -> 114;
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
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }
}
