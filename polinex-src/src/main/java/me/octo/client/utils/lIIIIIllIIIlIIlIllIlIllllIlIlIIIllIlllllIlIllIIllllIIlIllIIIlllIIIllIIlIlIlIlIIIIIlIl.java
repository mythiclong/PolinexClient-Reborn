package me.octo.client.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl {

   // Reconstructed from jar method a(String,float,float,X,float,long,int,Object) ; defaults transcribed from javap -p -c -s bytecode.
   public static void a(me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl self, String var1, float var2, float var3, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4, float var5, long var6, int mask, Object marker) {
      if ((mask & 32) != 0) { var6 = 520L; }
      self.a(var1, var2, var3, var4, var5, var6);
   }
   // Reconstructed from jar method a(String,boolean,float,int,Object) ; defaults transcribed from javap -p -c -s bytecode.
   public static float a(me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl self, String var1, boolean var2, float var3, int mask, Object marker) {
      if ((mask & 4) != 0) { var3 = 14.0F; }
      return self.a(var1, var2, var3);
   }
   // Reconstructed from jar method a(String,float,int,Object) ; defaults transcribed from javap -p -c -s bytecode.
   public static float a(me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl self, String var1, float var2, int mask, Object marker) {
      if ((mask & 2) != 0) { var2 = 0.06F; }
      return self.a(var1, var2);
   }
   // Reconstructed from jar method a(String,X,float,long,int,Object) ; defaults transcribed from javap -p -c -s bytecode.
   public static void a(me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl self, String var1, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var2, float var3, long var4, int mask, Object marker) {
      if ((mask & 4) != 0) { var3 = 6.0F; }
      if ((mask & 8) != 0) { var4 = 120L; }
      self.a(var1, var2, var3, var4);
   }
   // Reconstructed from jar method a(String,long,int,Object) ; defaults transcribed from javap -p -c -s bytecode.
   public static void a(me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl self, String var1, long var2, int mask, Object marker) {
      if ((mask & 2) != 0) { var2 = 260L; }
      self.a(var1, var2);
   }
   // Reconstructed from jar method a(long,int,Object) ; defaults transcribed from javap -p -c -s bytecode.
   public static float a(me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl self, long var1, int mask, Object marker) {
      if ((mask & 1) != 0) { var1 = 2400L; }
      return self.a(var1);
   }
   // Reconstructed from jar method a(float,float,float,float,float,X,long,float,int,int,Object) ; defaults transcribed from javap -p -c -s bytecode.
   public static void a(me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl self, float var1, float var2, float var3, float var4, float var5, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6, long var7, float var9, int var10, int mask, Object marker) {
      if ((mask & 64) != 0) { var7 = 2400L; }
      if ((mask & 128) != 0) { var9 = 26.0F; }
      if ((mask & 256) != 0) { var10 = 60; }
      self.a(var1, var2, var3, var4, var5, var6, var7, var9, var10);
   }
   // Reconstructed from jar method a(float,float,float,float,float,X,float,float,int,int,Object) ; defaults transcribed from javap -p -c -s bytecode.
   public static void a(me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl self, float var1, float var2, float var3, float var4, float var5, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6, float var7, float var8, int var9, int mask, Object marker) {
      if ((mask & 128) != 0) { var8 = 4.0F; }
      if ((mask & 256) != 0) { var9 = 3; }
      self.a(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }
   // Reconstructed from jar method a(float,float,float,X,long,float,float,int,Object) ; defaults transcribed from javap -p -c -s bytecode.
   public static void a(me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl self, float var1, float var2, float var3, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4, long var5, float var7, float var8, int mask, Object marker) {
      if ((mask & 16) != 0) { var5 = 2400L; }
      if ((mask & 32) != 0) { var7 = 0.3F; }
      if ((mask & 64) != 0) { var8 = 0.75F; }
      self.a(var1, var2, var3, var4, var5, var7, var8);
   }
   // Reconstructed from jar method a(String,float,float,float,X,float,X,float,float,int,Object) ; defaults transcribed from javap -p -c -s bytecode.
   public static void a(me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl self, String var1, float var2, float var3, float var4, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var5, float var6, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var7, float var8, float var9, int mask, Object marker) {
      if ((mask & 32) != 0) { var6 = 1.0F; }
      if ((mask & 64) != 0) { var7 = me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.ah(); }
      if ((mask & 128) != 0) { var8 = 1.0F; }
      if ((mask & 256) != 0) { var9 = 12.0F; }
      self.a(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }
   // Reconstructed from jar method a(String,float,float,float,X,float,X,long,float,float,float,int,Object) ; defaults transcribed from javap -p -c -s bytecode.
   public static void a(me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl self, String var1, float var2, float var3, float var4, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var5, float var6, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var7, long var8, float var10, float var11, float var12, int mask, Object marker) {
      if ((mask & 32) != 0) { var6 = 1.0F; }
      if ((mask & 64) != 0) { var7 = me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.ah(); }
      if ((mask & 128) != 0) { var8 = 2400L; }
      if ((mask & 256) != 0) { var10 = 0.5F; }
      if ((mask & 512) != 0) { var11 = 1.0F; }
      if ((mask & 1024) != 0) { var12 = 12.0F; }
      self.a(var1, var2, var3, var4, var5, var6, var7, var8, var10, var11, var12);
   }
   // Reconstructed from jar method a(float,float,float,float,float,X,float,float,int,Object) ; defaults transcribed from javap -p -c -s bytecode.
   public static void a(me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl self, float var1, float var2, float var3, float var4, float var5, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6, float var7, float var8, int mask, Object marker) {
      if ((mask & 64) != 0) { var7 = 1.0F; }
      if ((mask & 128) != 0) { var8 = 10.0F; }
      self.a(var1, var2, var3, var4, var5, var6, var7, var8);
   }
   // Reconstructed from jar method a(float,float,float,float,float,X,long,float,float,float,int,Object) ; defaults transcribed from javap -p -c -s bytecode.
   public static void a(me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl self, float var1, float var2, float var3, float var4, float var5, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6, long var7, float var9, float var10, float var11, int mask, Object marker) {
      if ((mask & 64) != 0) { var7 = 2400L; }
      if ((mask & 128) != 0) { var9 = 0.5F; }
      if ((mask & 256) != 0) { var10 = 1.0F; }
      if ((mask & 512) != 0) { var11 = 10.0F; }
      self.a(var1, var2, var3, var4, var5, var6, var7, var9, var10, var11);
   }
   // Reconstructed from jar method a(float,float,float,X,float,float,int,Object) ; defaults transcribed from javap -p -c -s bytecode.
   public static void a(me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl self, float var1, float var2, float var3, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4, float var5, float var6, int mask, Object marker) {
      if ((mask & 16) != 0) { var5 = 1.0F; }
      if ((mask & 32) != 0) { var6 = 8.0F; }
      self.a(var1, var2, var3, var4, var5, var6);
   }
   // Reconstructed from jar method a(float,float,float,X,long,float,float,float,int,Object) ; defaults transcribed from javap -p -c -s bytecode.
   public static void a(me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl self, float var1, float var2, float var3, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4, long var5, float var7, float var8, float var9, int mask, Object marker) {
      if ((mask & 16) != 0) { var5 = 2000L; }
      if ((mask & 32) != 0) { var7 = 0.55F; }
      if ((mask & 64) != 0) { var8 = 1.0F; }
      if ((mask & 128) != 0) { var9 = 8.0F; }
      self.a(var1, var2, var3, var4, var5, var7, var8, var9);
   }

    public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) { return null; } // PX-FIX ovld2
    public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) { return null; } // PX-FIX ovld2
    public static <T> T a(Object p0, Object p1) { return null; } // PX-FIX ovld2
   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T a(String p0, Object p1, float p2, Object p3, float p4, float p5) { return null; 

// PX-DEDUP removed duplicate ovld: public static <T> T a(String p0, Object p1, float p2, float p3, Object p4, float p5) { return null; 

// PX-DEDUP removed duplicate ovld: public static <T> T a(String p0, Object p1, float p2, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlII

   public static <T> T a(Object p0, Object p1, Object p2, Object p3) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T a(String p0, String p1, boolean p2, float p3, int p4, Object p5) { return null; 

// PX-DEDUP removed duplicate ovld: public static <T> T a(String p0, float p1, Object p2, float p3, float p4, Object p5) { return null; 

// PX-DEDUP removed duplicate ovld: public static <T> T a(String p0, float p1, Object p2, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlII

// PX-DEDUP removed duplicate ovld: public static <T> T a(String p0, float p1, float p2, Object p3, float p4, float p5) { return null; }

   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) { return null; } // PX-FIX ovld

   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11) { return null; } // PX-FIX ovld

   @NotNull
   public static lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static long IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static int IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private static HashMap<String, List<lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll>> lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private static HashMap<String, lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private static HashMap<String, Long> llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private static HashMap<String, lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private static HashMap<String, Long> lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private static HashMap<String, lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll> lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static String[] a;
   private static String[] b;

   private lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl() {
   }

   public final long a() {
      return System.nanoTime();
   }

   public final void a(
      @NotNull String var1,
      float var2,
      float var3,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4,
      float var5,
      long var6
   ) {
      short var10001 = 16257;
      short var10002 = 5814;
      Intrinsics.checkNotNullParameter(var1, "id");
      var10001 = 16260;
      var10002 = 23477;
      Intrinsics.checkNotNullParameter(var4, "color");
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var8 = b();
      Map var10 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      boolean var12 = false;
      Object var13 = var10.get(var1);
      List var9;
      if (var13 == null) {
         boolean var14 = false;
         var9 = new ArrayList();
         var10.put(var1, var9);
      } else {
         var9 = (List)var13;
      }

      while (true) {
         if (var9.size() >= 5) {
            var9.remove(0);
            if (var8 == null) {
               break;
            }

            if (var8 != null) {
               continue;
            }
         }

         var9.add(
            new lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
               var2, var3, var4, var5, this.a(), var6 * 1000000L
            )
         );
         break;
      }
   }

   public final void a(@NotNull String var1, float var2, float var3, float var4, float var5, float var6) {
      Object var30 = null; // PX-FIX
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = b();
      short var10002 = 16257;
      short var10003 = 5814;
      Intrinsics.checkNotNullParameter(var1, "id");
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var7 = var10000;
      if (var7 != null) {
         List var27 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.get(var1);
         if (var27 != null) {
            List var8 = var27;
            int var28 = ((var8.isEmpty()) ? 1 : 0);
            if (var7 != null) {
               if (var28 != 0) {
                  return;
               }

               float var32;
               var28 = (var32 = var4 - 0.5F) == 0.0F ? 0 : (var32 < 0.0F ? -1 : 1);
            }

            if (var7 != null) {
               if (var28 <= 0) {
                  return;
               }

               float var33;
               var28 = (var33 = var5 - 0.5F) == 0.0F ? 0 : (var33 < 0.0F ? -1 : 1);
            }

            if (var28 > 0) {
               long var9 = this.a();
               llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var11 = new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
                  0, 0, 0, 0
               );
               Iterator var12 = var8.iterator();

               while (true) {
                  if (var12.hasNext()) {
                     lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var13 = (lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var12.next();
                     long var14 = var9 - var13.e();
                     long var29 = var14;
                     if (var7 != null) {
                        long var34;
                        var30 = (var34 = var14 - var13.f()) == 0L ? 0 : (var34 < 0L ? -1 : 1);
                        if (var7 == null) {
                           break;
                        }

                        if (me.octo.client.PxTruth.truth(var30)) {
                           var12.remove();
                           if (var7 != null) {
                              continue;
                           }
                        }

                        var29 = var14;
                     }

                     float var16 = RangesKt.coerceIn((float)var29 / (float)var13.f(), 0.0F, 1.0F);
                     float var19 = 1.0F - var16;
                     float var23 = 1.0F;
                     int var20 = 0;
                     float var24 = var19 * var19 * var19;
                     float var17 = var23 - var24;
                     float var18 = var13.d() * var17;
                     var19 = (1.0F - var16) * (1.0F - var16);
                     var20 = var13.c().d();
                     int var21 = RangesKt.coerceIn((int)(var20 * var19), 0, 255);
                     int var31 = var21;
                     if (var7 != null) {
                        if (var21 <= 0) {
                           continue;
                        }

                        float var35;
                        var31 = (var35 = var18 - 0.5F) == 0.0F ? 0 : (var35 < 0.0F ? -1 : 1);
                     }

                     if (var31 < 0) {
                        continue;
                     }

                     llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var22 = var13.c().a(var21);
                     lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(var2, var3, var4, var5, var6, var13.a(), var13.b(), 0.0F, var18, var22, var11);
                     if (var7 != null) {
                        continue;
                     }
                  }

                  if (var7 == null) {
                     return;
                  }

                  var30 = var8.isEmpty();
                  break;
               }

               if (!me.octo.client.PxTruth.truth(var30)) {
                  lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.remove(var1);
               }

               return;
            }

            return;
         }
      }
   }

   public final void a(@NotNull String var1, float var2, float var3, float var4) {
      short var10001 = 16257;
      short var10002 = 5814;
      Intrinsics.checkNotNullParameter(var1, "id");
      this.a(var1, var2 - var4, var3 - var4, var4 * 2.0F, var4 * 2.0F, var4);
   }

   public final float a(@NotNull String var1, boolean var2, float var3) {
      Object var18 = null; // PX-FIX
      short var10001 = 16257;
      short var10002 = 5814;
      Intrinsics.checkNotNullParameter(var1, "id");
      long var5 = this.a();
      Map var8 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = b();
      boolean var10 = false;
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var4 = var10000;
      Object var11 = var8.get(var1);
      Object var10000x = null; // PX-FIX var-split (lllIlIIll[] 声明 vs Y 用途)
      if (var11 == null) {
         boolean var12 = false;
         lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var13 = new lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var2 ? 1.0F : 0.0F, var5
         );
         var8.put(var1, var13);
         var10000x = var13;
      } else {
         var10000x = var11;
      }

      lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var7 = (lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000x;
      float var14 = RangesKt.coerceIn((float)(var5 - var7.b()) / 1.0E9F, 0.0F, 0.1F);
      var7.a(var5);
      float var9 = var2 ? 1.0F : 0.0F;
      float var20;
      int var17 = (var20 = var7.a() - var9) == 0.0F ? 0 : (var20 < 0.0F ? -1 : 1);
      if (var4 != null) {
         var17 = (((var17 == 0) ? 1 : 0));
      }

      label55: {
         if ((var17 == 0)) {
            float var15 = 1.0F - (float)Math.exp(-var3 * var14);
            var7.a(var7.a() + (var9 - var7.a()) * var15);
            float var21;
            var18 = (var21 = Math.abs(var7.a() - var9) - 0.001F) == 0.0F ? 0 : (var21 < 0.0F ? -1 : 1);
            if (var4 == null) {
               break label55;
            }

            if (me.octo.client.PxTruth.truth(var18)) {
               var7.a(var9);
            }
         }

         float var22;
         var18 = (var22 = var7.a() - 0.0F) == 0.0F ? 0 : (var22 < 0.0F ? -1 : 1);
      }

      if (var4 != null) {
         var18 = me.octo.client.PxTruth.truth(var18);
      }

      if (!(me.octo.client.PxTruth.truth(var18) && !var2)) {
         lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.remove(var1);
      }

      float var19 = var7.a();
      if (var4 == null) {
         lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[4]
         );
      }

      return var19;
   }

   public final void a(@NotNull String var1) {
      short var10001 = 16257;
      short var10002 = 5814;
      Intrinsics.checkNotNullParameter(var1, "id");
      lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.put(var1, this.a());
   }

   public final float b(@NotNull String var1) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = b();
      short var10002 = 16257;
      short var10003 = 5814;
      Intrinsics.checkNotNullParameter(var1, "id");
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      if (var2 != null) {
         Long var9 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.get(var1);
         if (var9 != null) {
            long var3 = var9;
            long var5 = this.a() - var3;
            long var10 = var5;
            if (var2 != null) {
               if (var5 >= 180000000L) {
                  lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.remove(var1);
                  return 0.0F;
               }

               var10 = var5;
            }

            float var7 = (float)var10 / (float)180000000L;
            float var8 = 4.0F * var7 * (1.0F - var7);
            return RangesKt.coerceIn(var8, 0.0F, 1.0F);
         }
      }

      return 0.0F;
   }

   public final float a(@NotNull String var1, float var2) {
      short var10001 = 16257;
      short var10002 = 5814;
      Intrinsics.checkNotNullParameter(var1, "id");
      return 1.0F - this.b(var1) * var2;
   }

   public final void a(
      @NotNull String var1, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var2, float var3, long var4
   ) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var6;
      long var7;
      long var12;
      label22: {
         lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = b();
         short var10002 = 16257;
         short var10003 = 5814;
         Intrinsics.checkNotNullParameter(var1, "id");
         var10002 = 16260;
         var10003 = 23477;
         Intrinsics.checkNotNullParameter(var2, "color");
         var6 = var10000;
         var7 = this.a();
         if (var6 != null) {
            Long var11 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.get(var1);
            if (var11 != null) {
               var12 = var11;
               break label22;
            }
         }

         var12 = 0L;
      }

      long var9 = var12;
      if (var6 != null) {
         if ((var7 - var9) / 1000000L < var4) {
            return;
         }

         llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.put(var1, var7);
         IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.put(
            var1,
            new lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
               var2, var7, var3
            )
         );
      }
   }

   public final void b(@NotNull String var1, float var2, float var3, float var4, float var5, float var6) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = b();
      short var10002 = 16257;
      short var10003 = 5814;
      Intrinsics.checkNotNullParameter(var1, "id");
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var7 = var10000;
      if (var7 != null) {
         lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var17 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.get(
            var1
         );
         if (var17 != null) {
            lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var8 = var17;
            float var20;
            int var18 = (var20 = var4 - 0.5F) == 0.0F ? 0 : (var20 < 0.0F ? -1 : 1);
            if (var7 != null) {
               if (var18 <= 0) {
                  return;
               }

               float var21;
               var18 = (var21 = var5 - 0.5F) == 0.0F ? 0 : (var21 < 0.0F ? -1 : 1);
            }

            if (var18 > 0) {
               long var9 = this.a() - var8.b();
               long var19 = var9;
               if (var7 != null) {
                  if (var9 >= 700000000L) {
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.remove(var1);
                     return;
                  }

                  var19 = var9;
               }

               float var11 = RangesKt.coerceIn((float)var19 / (float)700000000L, 0.0F, 1.0F);
               byte var12 = 3;
               int var13 = 0;

               while (var13 < var12) {
                  float var14 = RangesKt.coerceIn(var11 + var13 * 0.1F, 0.0F, 1.0F);
                  label40:
                  if (var7 != null) {
                     if (!(var14 >= 1.0F)) {
                        float var15 = var8.c() * var14;
                        int var16 = RangesKt.coerceIn((int)((1.0F - var14) * (1.0F - var14) * 110.0F / (var13 + 1)), 0, 255);
                        if (var7 == null) {
                           break label40;
                        }

                        if (var16 > 0) {
                           lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                              var2 - var15, var3 - var15, var4 + var15 * 2.0F, var5 + var15 * 2.0F, 1.0F, var8.a().a(var16), this.a(var4, var5, var6, var15)
                           );
                        }
                     }

                     var13++;
                  }

                  if (var7 == null) {
                     break;
                  }
               }

               return;
            }

            return;
         }
      }
   }

   private final float a(float var1, float var2, float var3, float var4) {
      float var5 = RangesKt.coerceAtLeast(Math.min(var1, var2), 1.0F);
      float var6 = RangesKt.coerceIn(var3 / (var5 * 0.5F), 0.0F, 1.0F);
      float var7 = var5 + var4 * 2.0F;
      return var7 * 0.5F * var6;
   }

   public final void a(@NotNull String var1, long var2) {
      short var10001 = 16257;
      short var10002 = 5814;
      Intrinsics.checkNotNullParameter(var1, "id");
      lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.put(
         var1,
         new lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
            this.a(), var2 * 1000000L
         )
      );
   }

   public final float c(@NotNull String var1) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = b();
      short var10002 = 16262;
      short var10003 = 7654;
      Intrinsics.checkNotNullParameter(var1, "id");
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      if (var2 != null) {
         lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var7 = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.get(
            var1
         );
         if (var7 != null) {
            lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var3 = var7;
            long var4 = this.a() - var3.a();
            long var8 = var4;
            if (var2 != null) {
               if (var4 >= var3.b()) {
                  lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.remove(var1);
                  return 0.0F;
               }

               var8 = var4;
            }

            float var6 = (float)var8 / (float)var3.b();
            return (1.0F - var6) * (1.0F - var6);
         }
      }

      return 0.0F;
   }

   public final float a(long var1) {
      long var3 = Math.max(1L, var1 * 1000000L);
      return RangesKt.coerceIn((float)(this.a() % var3) / (float)var3, 0.0F, 1.0F);
   }

   public final void a(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6,
      long var7,
      float var9,
      int var10
   ) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = b();
      short var10002 = 16260;
      short var10003 = 23477;
      Intrinsics.checkNotNullParameter(var6, "color");
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var11 = var10000;
      float var21 = var3;
      if (var11 != null) {
         if (var3 <= 1.0F) {
            return;
         }

         var21 = this.a(var7);
      }

      float var12 = var21;
      float var13 = -var9 + (var3 + var9 * 2.0F) * var12;
      float var14 = RangesKt.coerceAtLeast(var13 - var9 / 2.0F, 0.0F);
      float var15 = RangesKt.coerceAtMost(var13 + var9 / 2.0F, var3);
      float var22 = var15;
      float var10001 = var14;
      if (var11 != null) {
         if (var15 <= var14) {
            return;
         }

         var22 = Math.abs((var14 + var15) * 0.5F - var13);
         var10001 = var9 * 0.5F;
      }

      float var16 = var22 / var10001;
      int var17 = (int)(RangesKt.coerceIn(1.0F - var16, 0.0F, 1.0F) * var10);
      if (var11 != null) {
         if (var17 > 0) {
            lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(var1, var2, var3, var4);

            try {
               lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                  var1 + var14, var2, var15 - var14, var4, var6.a(var17), var5
               );
            } finally {
               lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .i();
            }
         }
      }
   }

   public final void a(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6,
      float var7,
      float var8,
      int var9
   ) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = b();
      short var10002 = 16260;
      short var10003 = 23477;
      Intrinsics.checkNotNullParameter(var6, "color");
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10 = var10000;
      float var16;
      int var15 = (var16 = var7 - 0.01F) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1);
      if (var10 != null) {
         if (var15 <= 0) {
            return;
         }

         float var17;
         var15 = (var17 = var3 - 0.5F) == 0.0F ? 0 : (var17 < 0.0F ? -1 : 1);
      }

      if (var10 != null) {
         if (var15 <= 0) {
            return;
         }

         float var18;
         var15 = (var18 = var4 - 0.5F) == 0.0F ? 0 : (var18 < 0.0F ? -1 : 1);
      }

      if (var10 != null) {
         if (var15 <= 0) {
            return;
         }

         var15 = 0;
      }

      int var11 = var15;

      while (var11 < var9) {
         float var12 = (float)(var11 + 1) / var9;
         float var13 = var8 * var12 * var7;
         int var14 = RangesKt.coerceIn((int)((1.0F - var12) * var7 * var6.d() * 0.6F), 0, 255);
         if (var10 != null) {
            if (var14 > 0) {
               lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                  var1 - var13, var2 - var13, var3 + var13 * 2.0F, var4 + var13 * 2.0F, 1.0F, var6.a(var14), this.a(var3, var4, var5, var13)
               );
            }

            var11++;
         }

         if (var10 == null) {
            break;
         }
      }
   }

   public final void a(
      float var1, float var2, float var3, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4, float var5
   ) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var6;
      float var11;
      float var10001;
      label33: {
         lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = b();
         short var10002 = 16260;
         short var10003 = 23477;
         Intrinsics.checkNotNullParameter(var4, "color");
         var6 = var10000;
         float var12;
         int var10 = (var12 = var5 - 0.01F) == 0.0F ? 0 : (var12 < 0.0F ? -1 : 1);
         if (var6 != null) {
            if (var10 <= 0) {
               return;
            }

            var11 = var3;
            var10001 = 0.5F;
            if (var6 == null) {
               break label33;
            }

            float var13;
            var10 = (var13 = var3 - 0.5F) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
         }

         if (var10 <= 0) {
            return;
         }

         var11 = var3;
         var10001 = 2.4F;
      }

      float var7 = var11 * var10001;
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var8 = new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
         0, 0, 0, 0
      );
      int var9 = RangesKt.coerceIn((int)(var4.d() * var5), 0, 255);
      if (var6 != null) {
         if (var9 <= 0) {
            return;
         }

         lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var1 - var7 / 2.0F, var2 - var7 / 2.0F, var7, var7, var7 / 2.0F, var1, var2, 0.0F, var3, var4.a(var9), var8);
      }
   }

   public final void a(
      float var1,
      float var2,
      float var3,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4,
      long var5,
      float var7,
      float var8
   ) {
      short var10001 = 16260;
      short var10002 = 23477;
      Intrinsics.checkNotNullParameter(var4, "color");
      float var9 = this.a(var5);
      float var10 = 0.5F - 0.5F * (float)Math.cos(var9 * 2.0F * (float) Math.PI);
      float var11 = var7 + (var8 - var7) * var10;
      this.a(var1, var2, var3, var4, var11);
   }

   public final void a(
      @NotNull String var1,
      float var2,
      float var3,
      float var4,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var5,
      float var6,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var7,
      float var8,
      float var9
   ) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = b();
      short var10002 = 16265;
      short var10003 = -18587;
      Intrinsics.checkNotNullParameter(var1, "svg");
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10 = var10000;
      short var10001 = 16256;
      var10002 = -9681;
      Intrinsics.checkNotNullParameter(var5, "baseColor");
      var10001 = 16261;
      var10002 = 20655;
      Intrinsics.checkNotNullParameter(var7, "glowColor");
      if (var10 != null) {
         if (var8 > 0.01F) {
            byte var11 = 5;
            int var12 = 0;

            while (var12 < var11) {
               float var13 = (float)(var12 + 1) / var11;
               float var14 = var4 * (0.45F * var13) * var8;
               float var15 = var4 + var14;
               float var16 = (var15 - var4) / 2.0F;
               float var19 = 1.0F - var13;
               boolean var20 = false;
               float var17 = var19 * var19 * var19;
               int var18 = RangesKt.coerceIn((int)(var17 * 0.95F * var8 * var7.d()), 0, 255);
               if (var10 == null) {
                  return;
               }

               if (var10 != null) {
                  if (var18 > 0) {
                     lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .b(var1, var2 - var16, var3 - var16, var15, var7.a(var18), 1.0F);
                  }

                  var12++;
               }

               if (var10 == null) {
                  break;
               }
            }
         }

         lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(var1, var2, var3, var4, var5, var6);
      }
   }

   public final void a(
      @NotNull String var1,
      float var2,
      float var3,
      float var4,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var5,
      float var6,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var7,
      long var8,
      float var10,
      float var11,
      float var12
   ) {
      b();
      short var10002 = 16263;
      short var10003 = -23991;
      Intrinsics.checkNotNullParameter(var1, "svg");
      var10002 = 16264;
      var10003 = -19017;
      Intrinsics.checkNotNullParameter(var5, "baseColor");
      short var10001 = 16259;
      var10002 = 945;
      Intrinsics.checkNotNullParameter(var7, "glowColor");
      float var14 = this.a(var8);
      float var15 = 0.5F - 0.5F * (float)Math.cos(var14 * 2.0F * (float) Math.PI);
      float var16 = var10 + (var11 - var10) * var15;
      this.a(var1, var2, var3, var4, var5, var6, var7, var16, var12 * (0.85F + 0.15F * var15));
      if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         b(new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[3]);
      }
   }

   public final void a(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6,
      float var7,
      float var8
   ) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = b();
      short var10002 = 16259;
      short var10003 = 945;
      Intrinsics.checkNotNullParameter(var6, "glowColor");
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var9 = var10000;
      float var12;
      int var11 = (var12 = var7 - 0.01F) == 0.0F ? 0 : (var12 < 0.0F ? -1 : 1);
      if (var9 != null) {
         if (var11 <= 0) {
            return;
         }

         var11 = RangesKt.coerceIn((int)(var6.d() * var7), 0, 255);
      }

      int var10 = var11;
      if (var9 != null) {
         if (var10 <= 0) {
            return;
         }

         lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var1, var2, var3, var4, var5, var8, var6.a(var10));
      }
   }

   public final void a(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6,
      long var7,
      float var9,
      float var10,
      float var11
   ) {
      short var10001 = 16259;
      short var10002 = 945;
      Intrinsics.checkNotNullParameter(var6, "glowColor");
      float var12 = this.a(var7);
      float var13 = 0.5F - 0.5F * (float)Math.cos(var12 * 2.0F * (float) Math.PI);
      float var14 = var9 + (var10 - var9) * var13;
      this.a(var1, var2, var3, var4, var5, var6, var14, var11 * (0.85F + 0.15F * var13));
   }

   public final void a(
      float var1,
      float var2,
      float var3,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4,
      float var5,
      float var6
   ) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = b();
      short var10002 = 16259;
      short var10003 = 945;
      Intrinsics.checkNotNullParameter(var4, "glowColor");
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var7 = var10000;
      float var10;
      int var9 = (var10 = var5 - 0.01F) == 0.0F ? 0 : (var10 < 0.0F ? -1 : 1);
      if (var7 != null) {
         if (var9 <= 0) {
            return;
         }

         float var11;
         var9 = (var11 = var3 - 0.5F) == 0.0F ? 0 : (var11 < 0.0F ? -1 : 1);
      }

      if (var7 != null) {
         if (var9 <= 0) {
            return;
         }

         var9 = RangesKt.coerceIn((int)(var4.d() * var5), 0, 255);
      }

      int var8 = var9;
      if (var7 != null) {
         if (var8 <= 0) {
            return;
         }

         lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var1 - var3, var2 - var3, var3 * 2.0F, var3 * 2.0F, var3, var6, var4.a(var8));
      }
   }

   public final void a(
      float var1,
      float var2,
      float var3,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4,
      long var5,
      float var7,
      float var8,
      float var9
   ) {
      short var10001 = 16259;
      short var10002 = 945;
      Intrinsics.checkNotNullParameter(var4, "glowColor");
      float var10 = this.a(var5);
      float var11 = 0.5F - 0.5F * (float)Math.cos(var10 * 2.0F * (float) Math.PI);
      float var12 = var7 + (var8 - var7) * var11;
      this.a(var1, var2, var3, var4, var12, var9 * (0.85F + 0.15F * var11));
   }

   public final void a(
      @NotNull String var1,
      float var2,
      float var3,
      float var4,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var5,
      float var6
   ) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = b();
      short var10002 = 16258;
      short var10003 = 9861;
      Intrinsics.checkNotNullParameter(var1, "text");
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var7 = var10000;
      short var10001 = 16267;
      var10002 = -13241;
      Intrinsics.checkNotNullParameter(var5, "color");
      float var15 = var6;
      if (var7 != null) {
         if (var6 <= 0.01F) {
            return;
         }

         var15 = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var1, var4, null);
      }

      float var8 = var15;
      float var16 = var8;
      float var17 = 0.5F;
      if (var7 != null) {
         if (var8 <= 0.5F) {
            return;
         }

         var16 = var4;
         var17 = 1.8F;
      }

      float var9 = var16 * var17;
      float var10 = var8 + var4 * 1.4F;
      float var11 = var2 - var10 / 2.0F;
      float var12 = var3 - var4 * 0.1F - var9 / 2.0F;
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var13 = new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
         0, 0, 0, 0
      );
      int var14 = RangesKt.coerceIn((int)(var5.d() * var6), 0, 255);
      if (var7 != null) {
         if (var14 <= 0) {
            return;
         }

         lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var11, var12, var10, var9, var9 / 2.0F, var2, var3 + var4 * 0.35F, 0.0F, Math.max(var10, var9) * 0.55F, var5.a(var14), var13);
      }
   }

   public final float a(float var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = Math.max(var3 - var5, var5 + var1 - var3);
      float var8 = Math.max(var4 - var6, var6 + var2 - var4);
      return (float)Math.sqrt(var7 * var7 + var8 * var8);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var21 = null; // PX-FIX
      String[] var5 = new String[11];
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[5];
      int var3 = 0;
      String var2 = "\u000e´\tæO)Ì\u001aäj]n\t=SëñÝ\u0013\u0092£q\u0004N+ãÕ\têW\u0011q\u0082\u0003y¡\f\u0005s2¥¦F\u0003ä\u001fN\u0002G¤\u0003¶ò\u0004";
      int var4 = "\u000e´\tæO)Ì\u001aäj]n\t=SëñÝ\u0013\u0092£q\u0004N+ãÕ\têW\u0011q\u0082\u0003y¡\f\u0005s2¥¦F\u0003ä\u001fN\u0002G¤\u0003¶ò\u0004".length();
      char var1 = 2;
      b(var10000);
      int var8 = -1;

      label52:
      while (true) {
         byte var9 = 118;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var25 = var10001.toCharArray();
               int var10004 = var25.length;
               int var6 = 0;
               byte var28 = var9;
               var21 = var25;
               int var15 = var10004;
               byte var33;
               char[] var37;
               int var10006;
               if (var10004 <= 1) {
                  var37 = var25;
                  var33 = var9;
                  var10006 = var6;
               } else {
                  var28 = var9;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var37 = var25;
                  var33 = var9;
                  var10006 = var6;
               }

               while (true) {
                  var37[var10006] = (char)(var37[var10006] ^ var33 ^ switch (var6 % 7) {
                     case 0 -> 57;
                     case 1 -> 46;
                     case 2 -> 55;
                     case 3 -> 112;
                     case 4 -> 63;
                     case 5 -> 109;
                     default -> 49;
                  });
                  var6++;
                  if (var28 == 0) {
                     var10006 = var28;
                     var37 = var21;
                     var33 = var28;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var37 = var21;
                     var33 = var28;
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
                     b = new String[11];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl();
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new HashMap<>();
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new HashMap<>();
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new HashMap<>();
                     lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new HashMap<>();
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new HashMap<>();
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new HashMap<>();
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var30;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "×ÁÑÃÛÛ\u008cdl\u0005\u001d\u0089¶\u000fú";
                  var4 = "×ÁÑÃÛÛ\u008cdl\u0005\u001d\u0089¶\u000fú".length();
                  var1 = '\t';
                  var8 = -1;
            }

            var9 = 34;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   public static void b(lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var0) {
      lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var0;
   }

   public static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] b() {
      return lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 16257) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 15;
            case 1 -> 16;
            case 2 -> 140;
            case 3 -> 37;
            case 4 -> 251;
            case 5 -> 101;
            case 6 -> 226;
            case 7 -> 68;
            case 8 -> 133;
            case 9 -> 242;
            case 10 -> 170;
            case 11 -> 91;
            case 12 -> 48;
            case 13 -> 203;
            case 14 -> 84;
            case 15 -> 13;
            case 16 -> 246;
            case 17 -> 184;
            case 18 -> 23;
            case 19 -> 254;
            case 20 -> 216;
            case 21 -> 47;
            case 22 -> 197;
            case 23 -> 66;
            case 24 -> 155;
            case 25 -> 250;
            case 26 -> 231;
            case 27 -> 158;
            case 28 -> 132;
            case 29 -> 232;
            case 30 -> 105;
            case 31 -> 153;
            case 32 -> 147;
            case 33 -> 90;
            case 34 -> 36;
            case 35 -> 53;
            case 36 -> 208;
            case 37 -> 230;
            case 38 -> 26;
            case 39 -> 0;
            case 40 -> 139;
            case 41 -> 60;
            case 42 -> 50;
            case 43 -> 52;
            case 44 -> 131;
            case 45 -> 114;
            case 46 -> 236;
            case 47 -> 35;
            case 48 -> 174;
            case 49 -> 175;
            case 50 -> 24;
            case 51 -> 249;
            case 52 -> 61;
            case 53 -> 229;
            case 54 -> 223;
            case 55 -> 33;
            case 56 -> 4;
            case 57 -> 253;
            case 58 -> 89;
            case 59 -> 200;
            case 60 -> 86;
            case 61 -> 217;
            case 62 -> 70;
            case 63 -> 59;
            case 64 -> 111;
            case 65 -> 142;
            case 66 -> 3;
            case 67 -> 238;
            case 68 -> 74;
            case 69 -> 180;
            case 70 -> 188;
            case 71 -> 162;
            case 72 -> 69;
            case 73 -> 58;
            case 74 -> 49;
            case 75 -> 110;
            case 76 -> 221;
            case 77 -> 10;
            case 78 -> 186;
            case 79 -> 2;
            case 80 -> 214;
            case 81 -> 145;
            case 82 -> 73;
            case 83 -> 51;
            case 84 -> 148;
            case 85 -> 63;
            case 86 -> 183;
            case 87 -> 138;
            case 88 -> 201;
            case 89 -> 234;
            case 90 -> 38;
            case 91 -> 27;
            case 92 -> 152;
            case 93 -> 207;
            case 94 -> 161;
            case 95 -> 43;
            case 96 -> 164;
            case 97 -> 45;
            case 98 -> 103;
            case 99 -> 102;
            case 100 -> 126;
            case 101 -> 248;
            case 102 -> 205;
            case 103 -> 1;
            case 104 -> 56;
            case 105 -> 93;
            case 106 -> 8;
            case 107 -> 87;
            case 108 -> 98;
            case 109 -> 81;
            case 110 -> 222;
            case 111 -> 169;
            case 112 -> 198;
            case 113 -> 79;
            case 114 -> 156;
            case 115 -> 181;
            case 116 -> 193;
            case 117 -> 25;
            case 118 -> 19;
            case 119 -> 44;
            case 120 -> 80;
            case 121 -> 96;
            case 122 -> 11;
            case 123 -> 243;
            case 124 -> 225;
            case 125 -> 22;
            case 126 -> 92;
            case 127 -> 255;
            case 128 -> 213;
            case 129 -> 163;
            case 130 -> 54;
            case 131 -> 12;
            case 132 -> 75;
            case 133 -> 137;
            case 134 -> 94;
            case 135 -> 95;
            case 136 -> 178;
            case 137 -> 160;
            case 138 -> 129;
            case 139 -> 151;
            case 140 -> 233;
            case 141 -> 168;
            case 142 -> 204;
            case 143 -> 189;
            case 144 -> 135;
            case 145 -> 115;
            case 146 -> 220;
            case 147 -> 14;
            case 148 -> 99;
            case 149 -> 123;
            case 150 -> 41;
            case 151 -> 240;
            case 152 -> 192;
            case 153 -> 182;
            case 154 -> 190;
            case 155 -> 252;
            case 156 -> 165;
            case 157 -> 224;
            case 158 -> 176;
            case 159 -> 46;
            case 160 -> 116;
            case 161 -> 227;
            case 162 -> 72;
            case 163 -> 32;
            case 164 -> 187;
            case 165 -> 237;
            case 166 -> 239;
            case 167 -> 97;
            case 168 -> 154;
            case 169 -> 100;
            case 170 -> 55;
            case 171 -> 113;
            case 172 -> 166;
            case 173 -> 120;
            case 174 -> 108;
            case 175 -> 206;
            case 176 -> 77;
            case 177 -> 21;
            case 178 -> 78;
            case 179 -> 185;
            case 180 -> 245;
            case 181 -> 118;
            case 182 -> 122;
            case 183 -> 67;
            case 184 -> 31;
            case 185 -> 127;
            case 186 -> 76;
            case 187 -> 7;
            case 188 -> 191;
            case 189 -> 244;
            case 190 -> 195;
            case 191 -> 212;
            case 192 -> 5;
            case 193 -> 18;
            case 194 -> 171;
            case 195 -> 6;
            case 196 -> 173;
            case 197 -> 143;
            case 198 -> 167;
            case 199 -> 124;
            case 200 -> 30;
            case 201 -> 62;
            case 202 -> 149;
            case 203 -> 104;
            case 204 -> 9;
            case 205 -> 40;
            case 206 -> 83;
            case 207 -> 194;
            case 208 -> 159;
            case 209 -> 146;
            case 210 -> 218;
            case 211 -> 106;
            case 212 -> 85;
            case 213 -> 121;
            case 214 -> 235;
            case 215 -> 112;
            case 216 -> 136;
            case 217 -> 134;
            case 218 -> 144;
            case 219 -> 119;
            case 220 -> 107;
            case 221 -> 29;
            case 222 -> 64;
            case 223 -> 209;
            case 224 -> 179;
            case 225 -> 241;
            case 226 -> 42;
            case 227 -> 88;
            case 228 -> 117;
            case 229 -> 202;
            case 230 -> 28;
            case 231 -> 57;
            case 232 -> 211;
            case 233 -> 65;
            case 234 -> 20;
            case 235 -> 128;
            case 236 -> 34;
            case 237 -> 141;
            case 238 -> 228;
            case 239 -> 210;
            case 240 -> 39;
            case 241 -> 17;
            case 242 -> 172;
            case 243 -> 247;
            case 244 -> 130;
            case 245 -> 82;
            case 246 -> 109;
            case 247 -> 196;
            case 248 -> 215;
            case 249 -> 219;
            case 250 -> 125;
            case 251 -> 71;
            case 252 -> 199;
            case 253 -> 157;
            case 254 -> 150;
            default -> 177;
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

   private static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      // PX-FIX RC4-145: Kotlin default-args bridge restored from jar bytecode (descriptor (Lme/octo/client/utils/lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;FFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;FJJILjava/lang/Object;)Lme/octo/client/utils/lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)
      public static IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll self, float p1, float p2, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll p3, float p4, long p5, long p6, int mask, java.lang.Object marker) {
      if ((mask & 1) != 0) { p1 = self.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
      if ((mask & 2) != 0) { p2 = self.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
      if ((mask & 4) != 0) { p3 = self.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl; }
      if ((mask & 8) != 0) { p4 = self.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI; }
      if ((mask & 16) != 0) { p5 = self.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII; }
      if ((mask & 32) != 0) { p6 = self.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI; }
      return self.a(p1, p2, p3, p4, p5, p6);
      }
      private final float IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final float lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final float lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private final long IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static String[] a;
      private static String[] b;

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         float var1,
         float var2,
         @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var3,
         float var4,
         long var5,
         long var7
      ) {
         short var10001 = -8106;
         short var10002 = 29998;
         Intrinsics.checkNotNullParameter(var3, "color");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var7;
      }

      public final float a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final float b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final float d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final long e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final long f() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final float g() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final float h() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll i() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final float j() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final long k() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final long l() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @NotNull
      public final lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
         float var1,
         float var2,
         @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var3,
         float var4,
         long var5,
         long var7
      ) {
         short var10001 = -8105;
         short var10002 = -29328;
         Intrinsics.checkNotNullParameter(var3, "color");
         return new lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            var1, var2, var3, var4, var5, var7
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -8110;
         long var1 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         long var3 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         float var5 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         float var7 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         float var8 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 30080;
         short var10002 = -8111;
         short var10003 = 9125;
         short var10004 = -8107;
         short var10005 = 3651;
         short var10006 = -8108;
         short var10007 = -3454;
         short var10008 = -8112;
         short var10009 = -587;
         short var10010 = -8109;
         short var10011 = 23888;
         return "Ripple(ox=" + var8 + ", oy=" + var7 + ", color=" + var6 + ", maxRadius=" + var5 + ", startNs=" + var3 + ", durationNs=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Float.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var1 = var1 * 31 + Float.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         var1 = var1 * 31 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.hashCode();
         var1 = var1 * 31 + Float.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         var1 = var1 * 31 + Long.hashCode(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         return var1 * 31 + Long.hashCode(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.b();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = (lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var10000;
         int var4 = Float.compare(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         );
         if (var2 != null) {
            if (var4 != 0) {
               return false;
            }

            var4 = Float.compare(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
         }

         if (var2 != null) {
            if (var4 != 0) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = Float.compare(
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            );
         }

         if (var2 != null) {
            if (var4 != 0) {
               return false;
            }

            long var5;
            var4 = (
                     var5 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                        - var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                  )
                  == 0L
               ? 0
               : (var5 < 0L ? -1 : 1);
         }

         if (var2 != null) {
            if (var4 != 0) {
               return false;
            }

            long var6;
            var4 = (
                     var6 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        - var3.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  )
                  == 0L
               ? 0
               : (var6 < 0L ? -1 : 1);
         }

         if (var2 != null) {
            if (var4 != 0) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[8];
         int var3 = 0;
         String var2 = "Éd½òM\nP·\u0092\u0085këÍ\u007f¯\u0017\r\u009e¬\\çT\u0095[æa´Ã\u0003\u0011\nB¯bâ\u001b\u00943D¬u\b\u0016òJ6oøçÐ\fþ!YBÖ\u0084U\u009c\u0011L6*";
         int var4 = "Éd½òM\nP·\u0092\u0085këÍ\u007f¯\u0017\r\u009e¬\\çT\u0095[æa´Ã\u0003\u0011\nB¯bâ\u001b\u00943D¬u\b\u0016òJ6oøçÐ\fþ!YBÖ\u0084U\u009c\u0011L6*"
            .length();
         char var1 = 5;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 47;
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
                        case 0 -> 53;
                        case 1 -> 22;
                        case 2 -> 46;
                        case 3 -> 43;
                        case 4 -> 74;
                        case 5 -> 124;
                        default -> 26;
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
                        b = new String[8];
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

                     var2 = "R@uØf\u0005\u000eúþ\u008f\u0017";
                     var4 = "R@uØf\u0005\u000eúþ\u008f\u0017".length();
                     var1 = 5;
                     var8 = -1;
               }

               var10000 = 22;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
   } // PX-FIX end pxClinit
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -8111) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 121;
               case 1 -> 217;
               case 2 -> 17;
               case 3 -> 80;
               case 4 -> 239;
               case 5 -> 6;
               case 6 -> 188;
               case 7 -> 32;
               case 8 -> 12;
               case 9 -> 65;
               case 10 -> 20;
               case 11 -> 201;
               case 12 -> 35;
               case 13 -> 214;
               case 14 -> 250;
               case 15 -> 129;
               case 16 -> 62;
               case 17 -> 111;
               case 18 -> 154;
               case 19 -> 181;
               case 20 -> 39;
               case 21 -> 70;
               case 22 -> 202;
               case 23 -> 159;
               case 24 -> 115;
               case 25 -> 139;
               case 26 -> 208;
               case 27 -> 134;
               case 28 -> 85;
               case 29 -> 63;
               case 30 -> 234;
               case 31 -> 14;
               case 32 -> 146;
               case 33 -> 64;
               case 34 -> 41;
               case 35 -> 241;
               case 36 -> 73;
               case 37 -> 58;
               case 38 -> 71;
               case 39 -> 251;
               case 40 -> 141;
               case 41 -> 150;
               case 42 -> 228;
               case 43 -> 38;
               case 44 -> 8;
               case 45 -> 224;
               case 46 -> 193;
               case 47 -> 173;
               case 48 -> 138;
               case 49 -> 101;
               case 50 -> 198;
               case 51 -> 124;
               case 52 -> 16;
               case 53 -> 82;
               case 54 -> 183;
               case 55 -> 210;
               case 56 -> 252;
               case 57 -> 104;
               case 58 -> 24;
               case 59 -> 31;
               case 60 -> 23;
               case 61 -> 161;
               case 62 -> 51;
               case 63 -> 60;
               case 64 -> 66;
               case 65 -> 170;
               case 66 -> 89;
               case 67 -> 206;
               case 68 -> 9;
               case 69 -> 255;
               case 70 -> 100;
               case 71 -> 157;
               case 72 -> 54;
               case 73 -> 178;
               case 74 -> 79;
               case 75 -> 212;
               case 76 -> 167;
               case 77 -> 200;
               case 78 -> 114;
               case 79 -> 15;
               case 80 -> 96;
               case 81 -> 98;
               case 82 -> 126;
               case 83 -> 109;
               case 84 -> 172;
               case 85 -> 175;
               case 86 -> 216;
               case 87 -> 151;
               case 88 -> 118;
               case 89 -> 29;
               case 90 -> 127;
               case 91 -> 215;
               case 92 -> 77;
               case 93 -> 180;
               case 94 -> 22;
               case 95 -> 142;
               case 96 -> 229;
               case 97 -> 174;
               case 98 -> 69;
               case 99 -> 125;
               case 100 -> 189;
               case 101 -> 74;
               case 102 -> 248;
               case 103 -> 240;
               case 104 -> 113;
               case 105 -> 68;
               case 106 -> 36;
               case 107 -> 171;
               case 108 -> 128;
               case 109 -> 10;
               case 110 -> 249;
               case 111 -> 93;
               case 112 -> 1;
               case 113 -> 94;
               case 114 -> 191;
               case 115 -> 230;
               case 116 -> 19;
               case 117 -> 81;
               case 118 -> 211;
               case 119 -> 227;
               case 120 -> 56;
               case 121 -> 182;
               case 122 -> 246;
               case 123 -> 192;
               case 124 -> 187;
               case 125 -> 3;
               case 126 -> 44;
               case 127 -> 245;
               case 128 -> 26;
               case 129 -> 5;
               case 130 -> 108;
               case 131 -> 61;
               case 132 -> 168;
               case 133 -> 196;
               case 134 -> 48;
               case 135 -> 50;
               case 136 -> 237;
               case 137 -> 235;
               case 138 -> 91;
               case 139 -> 86;
               case 140 -> 144;
               case 141 -> 130;
               case 142 -> 204;
               case 143 -> 219;
               case 144 -> 76;
               case 145 -> 102;
               case 146 -> 223;
               case 147 -> 199;
               case 148 -> 222;
               case 149 -> 155;
               case 150 -> 194;
               case 151 -> 140;
               case 152 -> 28;
               case 153 -> 42;
               case 154 -> 244;
               case 155 -> 116;
               case 156 -> 242;
               case 157 -> 33;
               case 158 -> 131;
               case 159 -> 55;
               case 160 -> 88;
               case 161 -> 84;
               case 162 -> 213;
               case 163 -> 18;
               case 164 -> 236;
               case 165 -> 117;
               case 166 -> 247;
               case 167 -> 78;
               case 168 -> 148;
               case 169 -> 119;
               case 170 -> 2;
               case 171 -> 195;
               case 172 -> 112;
               case 173 -> 218;
               case 174 -> 164;
               case 175 -> 207;
               case 176 -> 4;
               case 177 -> 231;
               case 178 -> 158;
               case 179 -> 110;
               case 180 -> 136;
               case 181 -> 47;
               case 182 -> 233;
               case 183 -> 52;
               case 184 -> 106;
               case 185 -> 105;
               case 186 -> 75;
               case 187 -> 132;
               case 188 -> 43;
               case 189 -> 169;
               case 190 -> 123;
               case 191 -> 184;
               case 192 -> 120;
               case 193 -> 92;
               case 194 -> 25;
               case 195 -> 221;
               case 196 -> 177;
               case 197 -> 220;
               case 198 -> 143;
               case 199 -> 179;
               case 200 -> 27;
               case 201 -> 162;
               case 202 -> 72;
               case 203 -> 205;
               case 204 -> 0;
               case 205 -> 225;
               case 206 -> 46;
               case 207 -> 30;
               case 208 -> 226;
               case 209 -> 165;
               case 210 -> 45;
               case 211 -> 166;
               case 212 -> 254;
               case 213 -> 95;
               case 214 -> 203;
               case 215 -> 163;
               case 216 -> 37;
               case 217 -> 21;
               case 218 -> 153;
               case 219 -> 145;
               case 220 -> 99;
               case 221 -> 49;
               case 222 -> 97;
               case 223 -> 7;
               case 224 -> 152;
               case 225 -> 185;
               case 226 -> 197;
               case 227 -> 107;
               case 228 -> 186;
               case 229 -> 149;
               case 230 -> 57;
               case 231 -> 133;
               case 232 -> 253;
               case 233 -> 11;
               case 234 -> 160;
               case 235 -> 40;
               case 236 -> 156;
               case 237 -> 83;
               case 238 -> 34;
               case 239 -> 87;
               case 240 -> 137;
               case 241 -> 147;
               case 242 -> 59;
               case 243 -> 90;
               case 244 -> 238;
               case 245 -> 135;
               case 246 -> 243;
               case 247 -> 53;
               case 248 -> 13;
               case 249 -> 232;
               case 250 -> 103;
               case 251 -> 209;
               case 252 -> 190;
               case 253 -> 122;
               case 254 -> 176;
               default -> 67;
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

   private static final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
      private long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] a;
      private static String[] b;

      public IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(long var1, long var3) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var3;
      }

      public final long a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final void a(long var1) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      }

      public final long b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final void b(long var1) {
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      }

      public final long c() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final long d() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(
         long var1, long var3
      ) {
         return new lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
            var1, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 25941;
         long var1 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         long var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 18850;
         short var10002 = 25940;
         short var10003 = -27681;
         return "TimedKey(startNs=" + var3 + ", durationNs=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Long.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         return var1 * 31 + Long.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.b();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var3 = (lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)var10000;
         long var5;
         int var4 = (
                  var5 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     - var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               )
               == 0L
            ? 0
            : (var5 < 0L ? -1 : 1);
         if (var2 != null) {
            if ((var4 != 0)) {
               return false;
            }

            long var6;
            var4 = (
                     var6 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        - var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  )
                  == 0L
               ? 0
               : (var6 < 0L ? -1 : 1);
         }

         if (var2 != null) {
            if ((var4 != 0)) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: { // PX-FIX
         String[] var5 = new String[2];
         int var3 = 0;
         String var2 = "\u008c\u0014}ç6q%\u000f\u009aê«\u008eø\u0011õA,=\"\u0012b\u001c\u0006\u0087\u00ad\u008f\nc6N]";
         int var4 = "\u008c\u0014}ç6q%\u000f\u009aê«\u008eø\u0011õA,=\"\u0012b\u001c\u0006\u0087\u00ad\u008f\nc6N]".length();
         char var1 = '\r';
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 65;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 65;
                  var10006 = var6;
               } else {
                  var13 = 65;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 65;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 67;
                     case 1 -> 35;
                     case 2 -> 32;
                     case 3 -> 57;
                     case 4 -> 110;
                     case 5 -> 121;
                     default -> 15;
                  });
                  var6++;
                  if (var13 == 0) {
                     var10006 = var13;
                     var10005 = var10002;
                     var16 = var13;
                  } else {
                     if (var8 <= var6) {
                        break;
                     }

                     var10005 = var10002;
                     var16 = var13;
                     var10006 = var6;
                  }
               }
            }

            String var15 = new String(var10002).intern();
            byte var10 = -1;
            var5[var3++] = var15;
            if ((var0 += var1) >= var4) {
               a = var5;
               b = new String[2];
               break pxClinit; // PX-FIX
            }

            var1 = var2.charAt(var0);
         }
   } // PX-FIX end pxClinit
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 25940) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 32;
               case 1 -> 107;
               case 2 -> 236;
               case 3 -> 167;
               case 4 -> 187;
               case 5 -> 239;
               case 6 -> 143;
               case 7 -> 154;
               case 8 -> 126;
               case 9 -> 205;
               case 10 -> 188;
               case 11 -> 200;
               case 12 -> 140;
               case 13 -> 76;
               case 14 -> 20;
               case 15 -> 35;
               case 16 -> 210;
               case 17 -> 191;
               case 18 -> 240;
               case 19 -> 97;
               case 20 -> 71;
               case 21 -> 229;
               case 22 -> 193;
               case 23 -> 244;
               case 24 -> 75;
               case 25 -> 212;
               case 26 -> 16;
               case 27 -> 176;
               case 28 -> 24;
               case 29 -> 166;
               case 30 -> 145;
               case 31 -> 242;
               case 32 -> 121;
               case 33 -> 148;
               case 34 -> 99;
               case 35 -> 91;
               case 36 -> 165;
               case 37 -> 67;
               case 38 -> 175;
               case 39 -> 5;
               case 40 -> 8;
               case 41 -> 63;
               case 42 -> 85;
               case 43 -> 103;
               case 44 -> 213;
               case 45 -> 163;
               case 46 -> 117;
               case 47 -> 82;
               case 48 -> 27;
               case 49 -> 224;
               case 50 -> 151;
               case 51 -> 100;
               case 52 -> 131;
               case 53 -> 51;
               case 54 -> 89;
               case 55 -> 129;
               case 56 -> 170;
               case 57 -> 43;
               case 58 -> 90;
               case 59 -> 252;
               case 60 -> 19;
               case 61 -> 147;
               case 62 -> 122;
               case 63 -> 95;
               case 64 -> 45;
               case 65 -> 38;
               case 66 -> 65;
               case 67 -> 161;
               case 68 -> 149;
               case 69 -> 184;
               case 70 -> 83;
               case 71 -> 160;
               case 72 -> 142;
               case 73 -> 192;
               case 74 -> 21;
               case 75 -> 139;
               case 76 -> 195;
               case 77 -> 108;
               case 78 -> 94;
               case 79 -> 174;
               case 80 -> 127;
               case 81 -> 241;
               case 82 -> 93;
               case 83 -> 110;
               case 84 -> 141;
               case 85 -> 182;
               case 86 -> 80;
               case 87 -> 37;
               case 88 -> 248;
               case 89 -> 17;
               case 90 -> 157;
               case 91 -> 243;
               case 92 -> 50;
               case 93 -> 208;
               case 94 -> 88;
               case 95 -> 46;
               case 96 -> 48;
               case 97 -> 209;
               case 98 -> 52;
               case 99 -> 59;
               case 100 -> 29;
               case 101 -> 233;
               case 102 -> 177;
               case 103 -> 206;
               case 104 -> 98;
               case 105 -> 152;
               case 106 -> 119;
               case 107 -> 203;
               case 108 -> 201;
               case 109 -> 128;
               case 110 -> 156;
               case 111 -> 253;
               case 112 -> 57;
               case 113 -> 41;
               case 114 -> 162;
               case 115 -> 86;
               case 116 -> 14;
               case 117 -> 109;
               case 118 -> 144;
               case 119 -> 60;
               case 120 -> 186;
               case 121 -> 53;
               case 122 -> 72;
               case 123 -> 235;
               case 124 -> 238;
               case 125 -> 190;
               case 126 -> 47;
               case 127 -> 172;
               case 128 -> 134;
               case 129 -> 180;
               case 130 -> 214;
               case 131 -> 130;
               case 132 -> 171;
               case 133 -> 137;
               case 134 -> 179;
               case 135 -> 4;
               case 136 -> 123;
               case 137 -> 66;
               case 138 -> 185;
               case 139 -> 102;
               case 140 -> 64;
               case 141 -> 136;
               case 142 -> 61;
               case 143 -> 138;
               case 144 -> 22;
               case 145 -> 25;
               case 146 -> 112;
               case 147 -> 124;
               case 148 -> 114;
               case 149 -> 215;
               case 150 -> 168;
               case 151 -> 237;
               case 152 -> 10;
               case 153 -> 230;
               case 154 -> 69;
               case 155 -> 74;
               case 156 -> 216;
               case 157 -> 73;
               case 158 -> 250;
               case 159 -> 58;
               case 160 -> 68;
               case 161 -> 218;
               case 162 -> 194;
               case 163 -> 118;
               case 164 -> 158;
               case 165 -> 132;
               case 166 -> 223;
               case 167 -> 101;
               case 168 -> 62;
               case 169 -> 49;
               case 170 -> 222;
               case 171 -> 228;
               case 172 -> 150;
               case 173 -> 221;
               case 174 -> 198;
               case 175 -> 104;
               case 176 -> 225;
               case 177 -> 199;
               case 178 -> 254;
               case 179 -> 0;
               case 180 -> 183;
               case 181 -> 251;
               case 182 -> 42;
               case 183 -> 36;
               case 184 -> 169;
               case 185 -> 234;
               case 186 -> 15;
               case 187 -> 18;
               case 188 -> 28;
               case 189 -> 189;
               case 190 -> 113;
               case 191 -> 87;
               case 192 -> 197;
               case 193 -> 133;
               case 194 -> 159;
               case 195 -> 9;
               case 196 -> 164;
               case 197 -> 217;
               case 198 -> 3;
               case 199 -> 220;
               case 200 -> 40;
               case 201 -> 30;
               case 202 -> 219;
               case 203 -> 245;
               case 204 -> 11;
               case 205 -> 115;
               case 206 -> 202;
               case 207 -> 207;
               case 208 -> 153;
               case 209 -> 34;
               case 210 -> 77;
               case 211 -> 84;
               case 212 -> 178;
               case 213 -> 181;
               case 214 -> 78;
               case 215 -> 96;
               case 216 -> 111;
               case 217 -> 232;
               case 218 -> 173;
               case 219 -> 13;
               case 220 -> 81;
               case 221 -> 196;
               case 222 -> 1;
               case 223 -> 2;
               case 224 -> 204;
               case 225 -> 7;
               case 226 -> 92;
               case 227 -> 33;
               case 228 -> 135;
               case 229 -> 227;
               case 230 -> 79;
               case 231 -> 106;
               case 232 -> 120;
               case 233 -> 211;
               case 234 -> 23;
               case 235 -> 12;
               case 236 -> 56;
               case 237 -> 249;
               case 238 -> 116;
               case 239 -> 247;
               case 240 -> 55;
               case 241 -> 146;
               case 242 -> 31;
               case 243 -> 231;
               case 244 -> 54;
               case 245 -> 26;
               case 246 -> 44;
               case 247 -> 255;
               case 248 -> 39;
               case 249 -> 155;
               case 250 -> 6;
               case 251 -> 105;
               case 252 -> 70;
               case 253 -> 226;
               case 254 -> 246;
               default -> 125;
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
   
    public static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var0, long var1, long var2, int var3, Object var4) {
       if ((var3 & 1) != 0) {
          var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
       }
       if ((var3 & 2) != 0) {
          var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
       }
       return var0.a(var1, var2);
    }}

   private static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      // PX-FIX RC4-143: Kotlin default-args bridge restored from jar bytecode (descriptor (Lme/octo/client/utils/lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;JFILjava/lang/Object;)Lme/octo/client/utils/lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)
      public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI self, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll p1, long p2, float p3, int mask, java.lang.Object marker) {
      if ((mask & 1) != 0) { p1 = self.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
      if ((mask & 2) != 0) { p2 = self.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
      if ((mask & 4) != 0) { p3 = self.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl; }
      return self.a(p1, p2, p3);
      }
      @NotNull
      private final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final float IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, long var2, float var4
      ) {
         short var10001 = -4642;
         short var10002 = 21005;
         Intrinsics.checkNotNullParameter(var1, "color");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var4;
      }

      @NotNull
      public final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final long b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final float c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final long e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final float f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, long var2, float var4
      ) {
         short var10001 = -4643;
         short var10002 = 5381;
         Intrinsics.checkNotNullParameter(var1, "color");
         return new lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var2, var4
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -4644;
         float var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         long var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 3394;
         short var10002 = -4641;
         short var10003 = 23104;
         short var10004 = -4648;
         short var10005 = -22772;
         return "Pulse(color=" + var4 + ", startNs=" + var2 + ", extra=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         var1 = var1 * 31 + Long.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         return var1 * 31 + Float.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.b();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
         int var4 = ((Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )) ? 1 : 0);
         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            long var5;
            var4 = (
                     var5 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        - var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  )
                  == 0L
               ? 0
               : (var5 < 0L ? -1 : 1);
         }

         if (var2 != null) {
            if (var4 != 0) {
               return false;
            }

            var4 = Float.compare(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            );
         }

         if (var2 != null) {
            if (var4 != 0) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[5];
         int var3 = 0;
         String var2 = "[M wÔ@µ\u0005Ý°^í\u0005Ô\u008c\u0004\nW\u0005ÙJ¥Òc";
         int var4 = "[M wÔ@µ\u0005Ý°^í\u0005Ô\u008c\u0004\nW\u0005ÙJ¥Òc".length();
         char var1 = '\f';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 10;
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
                        case 0 -> 111;
                        case 1 -> 11;
                        case 2 -> 91;
                        case 3 -> 92;
                        case 4 -> 100;
                        case 5 -> 91;
                        default -> 66;
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

                     var2 = "WÁ,ÿ\\\rÖ}º\t\b~»\u001f¼ûè\u0080²";
                     var4 = "WÁ,ÿ\\\rÖ}º\t\b~»\u001f¼ûè\u0080²".length();
                     var1 = '\n';
                     var8 = -1;
               }

               var10000 = 102;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
   } // PX-FIX end pxClinit
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -4644) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 210;
               case 1 -> 191;
               case 2 -> 162;
               case 3 -> 244;
               case 4 -> 105;
               case 5 -> 224;
               case 6 -> 208;
               case 7 -> 92;
               case 8 -> 248;
               case 9 -> 82;
               case 10 -> 45;
               case 11 -> 77;
               case 12 -> 2;
               case 13 -> 252;
               case 14 -> 203;
               case 15 -> 55;
               case 16 -> 50;
               case 17 -> 120;
               case 18 -> 38;
               case 19 -> 68;
               case 20 -> 230;
               case 21 -> 119;
               case 22 -> 205;
               case 23 -> 187;
               case 24 -> 10;
               case 25 -> 91;
               case 26 -> 35;
               case 27 -> 39;
               case 28 -> 14;
               case 29 -> 196;
               case 30 -> 111;
               case 31 -> 159;
               case 32 -> 126;
               case 33 -> 169;
               case 34 -> 4;
               case 35 -> 229;
               case 36 -> 42;
               case 37 -> 108;
               case 38 -> 135;
               case 39 -> 155;
               case 40 -> 171;
               case 41 -> 99;
               case 42 -> 109;
               case 43 -> 166;
               case 44 -> 78;
               case 45 -> 209;
               case 46 -> 156;
               case 47 -> 100;
               case 48 -> 87;
               case 49 -> 73;
               case 50 -> 253;
               case 51 -> 165;
               case 52 -> 114;
               case 53 -> 30;
               case 54 -> 154;
               case 55 -> 7;
               case 56 -> 129;
               case 57 -> 66;
               case 58 -> 145;
               case 59 -> 22;
               case 60 -> 54;
               case 61 -> 142;
               case 62 -> 212;
               case 63 -> 190;
               case 64 -> 41;
               case 65 -> 195;
               case 66 -> 97;
               case 67 -> 13;
               case 68 -> 199;
               case 69 -> 192;
               case 70 -> 101;
               case 71 -> 217;
               case 72 -> 132;
               case 73 -> 75;
               case 74 -> 94;
               case 75 -> 246;
               case 76 -> 241;
               case 77 -> 227;
               case 78 -> 243;
               case 79 -> 153;
               case 80 -> 107;
               case 81 -> 59;
               case 82 -> 118;
               case 83 -> 172;
               case 84 -> 24;
               case 85 -> 231;
               case 86 -> 1;
               case 87 -> 193;
               case 88 -> 174;
               case 89 -> 44;
               case 90 -> 9;
               case 91 -> 232;
               case 92 -> 117;
               case 93 -> 79;
               case 94 -> 206;
               case 95 -> 86;
               case 96 -> 182;
               case 97 -> 98;
               case 98 -> 128;
               case 99 -> 6;
               case 100 -> 29;
               case 101 -> 72;
               case 102 -> 185;
               case 103 -> 61;
               case 104 -> 240;
               case 105 -> 103;
               case 106 -> 53;
               case 107 -> 121;
               case 108 -> 221;
               case 109 -> 146;
               case 110 -> 235;
               case 111 -> 89;
               case 112 -> 70;
               case 113 -> 85;
               case 114 -> 26;
               case 115 -> 218;
               case 116 -> 201;
               case 117 -> 150;
               case 118 -> 130;
               case 119 -> 177;
               case 120 -> 170;
               case 121 -> 113;
               case 122 -> 115;
               case 123 -> 37;
               case 124 -> 21;
               case 125 -> 140;
               case 126 -> 63;
               case 127 -> 215;
               case 128 -> 69;
               case 129 -> 225;
               case 130 -> 43;
               case 131 -> 220;
               case 132 -> 239;
               case 133 -> 19;
               case 134 -> 71;
               case 135 -> 251;
               case 136 -> 148;
               case 137 -> 197;
               case 138 -> 60;
               case 139 -> 233;
               case 140 -> 181;
               case 141 -> 219;
               case 142 -> 139;
               case 143 -> 133;
               case 144 -> 40;
               case 145 -> 247;
               case 146 -> 3;
               case 147 -> 236;
               case 148 -> 202;
               case 149 -> 110;
               case 150 -> 222;
               case 151 -> 180;
               case 152 -> 122;
               case 153 -> 204;
               case 154 -> 34;
               case 155 -> 28;
               case 156 -> 249;
               case 157 -> 88;
               case 158 -> 58;
               case 159 -> 32;
               case 160 -> 125;
               case 161 -> 47;
               case 162 -> 138;
               case 163 -> 33;
               case 164 -> 168;
               case 165 -> 5;
               case 166 -> 161;
               case 167 -> 93;
               case 168 -> 36;
               case 169 -> 184;
               case 170 -> 157;
               case 171 -> 198;
               case 172 -> 143;
               case 173 -> 112;
               case 174 -> 123;
               case 175 -> 49;
               case 176 -> 152;
               case 177 -> 51;
               case 178 -> 189;
               case 179 -> 207;
               case 180 -> 188;
               case 181 -> 56;
               case 182 -> 245;
               case 183 -> 83;
               case 184 -> 57;
               case 185 -> 8;
               case 186 -> 250;
               case 187 -> 175;
               case 188 -> 46;
               case 189 -> 194;
               case 190 -> 144;
               case 191 -> 104;
               case 192 -> 116;
               case 193 -> 223;
               case 194 -> 131;
               case 195 -> 226;
               case 196 -> 238;
               case 197 -> 160;
               case 198 -> 16;
               case 199 -> 164;
               case 200 -> 167;
               case 201 -> 255;
               case 202 -> 67;
               case 203 -> 147;
               case 204 -> 216;
               case 205 -> 173;
               case 206 -> 0;
               case 207 -> 80;
               case 208 -> 95;
               case 209 -> 11;
               case 210 -> 18;
               case 211 -> 106;
               case 212 -> 149;
               case 213 -> 48;
               case 214 -> 179;
               case 215 -> 127;
               case 216 -> 151;
               case 217 -> 27;
               case 218 -> 102;
               case 219 -> 186;
               case 220 -> 20;
               case 221 -> 31;
               case 222 -> 17;
               case 223 -> 200;
               case 224 -> 237;
               case 225 -> 228;
               case 226 -> 211;
               case 227 -> 254;
               case 228 -> 15;
               case 229 -> 176;
               case 230 -> 178;
               case 231 -> 81;
               case 232 -> 65;
               case 233 -> 213;
               case 234 -> 12;
               case 235 -> 74;
               case 236 -> 134;
               case 237 -> 136;
               case 238 -> 124;
               case 239 -> 64;
               case 240 -> 137;
               case 241 -> 76;
               case 242 -> 25;
               case 243 -> 52;
               case 244 -> 96;
               case 245 -> 214;
               case 246 -> 23;
               case 247 -> 90;
               case 248 -> 242;
               case 249 -> 163;
               case 250 -> 183;
               case 251 -> 62;
               case 252 -> 84;
               case 253 -> 234;
               case 254 -> 158;
               default -> 141;
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

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private float IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(float var1, long var2) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      }

      public final float a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final void a(float var1) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      }

      public final long b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final void a(long var1) {
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      }

      public final float c() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final long d() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         float var1, long var2
      ) {
         return new lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -3964;
         long var1 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         float var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 14712;
         short var10002 = -3963;
         short var10003 = 22158;
         return "HoverState(t=" + var3 + ", lastNs=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Float.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         return var1 * 31 + Long.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.b();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         int var4 = Float.compare(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         );
         if (var2 != null) {
            if (var4 != 0) {
               return false;
            }

            long var5;
            var4 = (
                     var5 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        - var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  )
                  == 0L
               ? 0
               : (var5 < 0L ? -1 : 1);
         }

         if (var2 != null) {
            if (var4 != 0) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: { // PX-FIX
         String[] var5 = new String[2];
         int var3 = 0;
         String var2 = "\u008f\u008d\u008fû\u0081zÄÅ\u0001Ù_<d\t÷×r\u0012fä#ÇÉ";
         int var4 = "\u008f\u008d\u008fû\u0081zÄÅ\u0001Ù_<d\t÷×r\u0012fä#ÇÉ".length();
         char var1 = '\r';
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 33;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 33;
                  var10006 = var6;
               } else {
                  var13 = 33;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 33;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 24;
                     case 1 -> 124;
                     case 2 -> 79;
                     case 3 -> 39;
                     case 4 -> 86;
                     case 5 -> 126;
                     default -> 115;
                  });
                  var6++;
                  if (var13 == 0) {
                     var10006 = var13;
                     var10005 = var10002;
                     var16 = var13;
                  } else {
                     if (var8 <= var6) {
                        break;
                     }

                     var10005 = var10002;
                     var16 = var13;
                     var10006 = var6;
                  }
               }
            }

            String var15 = new String(var10002).intern();
            byte var10 = -1;
            var5[var3++] = var15;
            if ((var0 += var1) >= var4) {
               a = var5;
               b = new String[2];
               break pxClinit; // PX-FIX
            }

            var1 = var2.charAt(var0);
         }
   } // PX-FIX end pxClinit
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -3964) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 124;
               case 1 -> 251;
               case 2 -> 135;
               case 3 -> 182;
               case 4 -> 127;
               case 5 -> 59;
               case 6 -> 66;
               case 7 -> 148;
               case 8 -> 215;
               case 9 -> 60;
               case 10 -> 187;
               case 11 -> 123;
               case 12 -> 58;
               case 13 -> 84;
               case 14 -> 33;
               case 15 -> 247;
               case 16 -> 239;
               case 17 -> 200;
               case 18 -> 252;
               case 19 -> 163;
               case 20 -> 174;
               case 21 -> 243;
               case 22 -> 63;
               case 23 -> 100;
               case 24 -> 162;
               case 25 -> 69;
               case 26 -> 166;
               case 27 -> 62;
               case 28 -> 197;
               case 29 -> 156;
               case 30 -> 119;
               case 31 -> 70;
               case 32 -> 151;
               case 33 -> 46;
               case 34 -> 139;
               case 35 -> 23;
               case 36 -> 144;
               case 37 -> 90;
               case 38 -> 238;
               case 39 -> 32;
               case 40 -> 136;
               case 41 -> 206;
               case 42 -> 27;
               case 43 -> 29;
               case 44 -> 51;
               case 45 -> 18;
               case 46 -> 54;
               case 47 -> 91;
               case 48 -> 43;
               case 49 -> 227;
               case 50 -> 219;
               case 51 -> 101;
               case 52 -> 53;
               case 53 -> 8;
               case 54 -> 228;
               case 55 -> 22;
               case 56 -> 232;
               case 57 -> 175;
               case 58 -> 26;
               case 59 -> 171;
               case 60 -> 153;
               case 61 -> 212;
               case 62 -> 117;
               case 63 -> 68;
               case 64 -> 81;
               case 65 -> 218;
               case 66 -> 167;
               case 67 -> 173;
               case 68 -> 64;
               case 69 -> 190;
               case 70 -> 131;
               case 71 -> 255;
               case 72 -> 50;
               case 73 -> 17;
               case 74 -> 21;
               case 75 -> 233;
               case 76 -> 82;
               case 77 -> 6;
               case 78 -> 103;
               case 79 -> 20;
               case 80 -> 120;
               case 81 -> 237;
               case 82 -> 2;
               case 83 -> 12;
               case 84 -> 115;
               case 85 -> 155;
               case 86 -> 210;
               case 87 -> 226;
               case 88 -> 130;
               case 89 -> 176;
               case 90 -> 4;
               case 91 -> 192;
               case 92 -> 7;
               case 93 -> 0;
               case 94 -> 44;
               case 95 -> 191;
               case 96 -> 224;
               case 97 -> 230;
               case 98 -> 72;
               case 99 -> 202;
               case 100 -> 142;
               case 101 -> 45;
               case 102 -> 14;
               case 103 -> 183;
               case 104 -> 189;
               case 105 -> 98;
               case 106 -> 76;
               case 107 -> 104;
               case 108 -> 203;
               case 109 -> 74;
               case 110 -> 168;
               case 111 -> 121;
               case 112 -> 241;
               case 113 -> 118;
               case 114 -> 105;
               case 115 -> 134;
               case 116 -> 57;
               case 117 -> 141;
               case 118 -> 152;
               case 119 -> 248;
               case 120 -> 164;
               case 121 -> 40;
               case 122 -> 209;
               case 123 -> 41;
               case 124 -> 138;
               case 125 -> 249;
               case 126 -> 137;
               case 127 -> 19;
               case 128 -> 108;
               case 129 -> 235;
               case 130 -> 229;
               case 131 -> 25;
               case 132 -> 221;
               case 133 -> 102;
               case 134 -> 47;
               case 135 -> 87;
               case 136 -> 160;
               case 137 -> 146;
               case 138 -> 78;
               case 139 -> 112;
               case 140 -> 195;
               case 141 -> 246;
               case 142 -> 204;
               case 143 -> 140;
               case 144 -> 158;
               case 145 -> 194;
               case 146 -> 61;
               case 147 -> 244;
               case 148 -> 170;
               case 149 -> 35;
               case 150 -> 106;
               case 151 -> 73;
               case 152 -> 37;
               case 153 -> 48;
               case 154 -> 125;
               case 155 -> 67;
               case 156 -> 188;
               case 157 -> 207;
               case 158 -> 236;
               case 159 -> 88;
               case 160 -> 93;
               case 161 -> 11;
               case 162 -> 159;
               case 163 -> 169;
               case 164 -> 80;
               case 165 -> 150;
               case 166 -> 253;
               case 167 -> 126;
               case 168 -> 179;
               case 169 -> 99;
               case 170 -> 28;
               case 171 -> 154;
               case 172 -> 39;
               case 173 -> 165;
               case 174 -> 186;
               case 175 -> 24;
               case 176 -> 97;
               case 177 -> 52;
               case 178 -> 145;
               case 179 -> 10;
               case 180 -> 147;
               case 181 -> 16;
               case 182 -> 122;
               case 183 -> 30;
               case 184 -> 38;
               case 185 -> 114;
               case 186 -> 242;
               case 187 -> 223;
               case 188 -> 133;
               case 189 -> 83;
               case 190 -> 107;
               case 191 -> 109;
               case 192 -> 216;
               case 193 -> 86;
               case 194 -> 79;
               case 195 -> 132;
               case 196 -> 3;
               case 197 -> 198;
               case 198 -> 71;
               case 199 -> 234;
               case 200 -> 129;
               case 201 -> 149;
               case 202 -> 250;
               case 203 -> 9;
               case 204 -> 92;
               case 205 -> 157;
               case 206 -> 172;
               case 207 -> 193;
               case 208 -> 128;
               case 209 -> 161;
               case 210 -> 77;
               case 211 -> 178;
               case 212 -> 55;
               case 213 -> 89;
               case 214 -> 116;
               case 215 -> 110;
               case 216 -> 15;
               case 217 -> 56;
               case 218 -> 42;
               case 219 -> 65;
               case 220 -> 36;
               case 221 -> 184;
               case 222 -> 85;
               case 223 -> 177;
               case 224 -> 95;
               case 225 -> 180;
               case 226 -> 31;
               case 227 -> 213;
               case 228 -> 49;
               case 229 -> 240;
               case 230 -> 225;
               case 231 -> 185;
               case 232 -> 199;
               case 233 -> 211;
               case 234 -> 205;
               case 235 -> 96;
               case 236 -> 220;
               case 237 -> 201;
               case 238 -> 1;
               case 239 -> 196;
               case 240 -> 217;
               case 241 -> 94;
               case 242 -> 254;
               case 243 -> 214;
               case 244 -> 113;
               case 245 -> 245;
               case 246 -> 181;
               case 247 -> 111;
               case 248 -> 208;
               case 249 -> 13;
               case 250 -> 222;
               case 251 -> 34;
               case 252 -> 143;
               case 253 -> 5;
               case 254 -> 231;
               default -> 75;
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
   
    public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0, float var1, long var2, int var3, Object var4) {
       if ((var3 & 1) != 0) {
          var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
       }
       if ((var3 & 2) != 0) {
          var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
       }
       return var0.a(var1, var2);
    }}
}
