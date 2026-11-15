package me.octo.client.utils;

import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.glfw.GLFW;
import kotlin.jdk7.AutoCloseableKt;
import java.nio.ByteBuffer;
import org.lwjgl.glfw.GLFWImage;
import org.lwjgl.glfw.GLFWNativeWin32;
import com.mojang.blaze3d.opengl.GlTexture;
import java.nio.IntBuffer;
import kotlin.jvm.internal.Intrinsics;
import java.util.Locale;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import com.mojang.blaze3d.platform.NativeImage;
import kotlin.text.StringsKt;
import kotlin.Unit;
import org.lwjgl.system.windows.User32;

public final class lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl {
   @NotNull
   public static lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @Nullable
   private static IllllIlIIIIllIllllIIIIIlIlllllllIIIIIlIIllIIllIlIllIlllllIIlllIlIlllIlllIlIlIlIIlIIII IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @Nullable
   private static IllIllllIIlIIIllllllIIIlllllIIlllIlllIIlllIlIIllllIlllIllIIllIIIlllllIIllIlIlIIlllllI lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static long IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static long IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static int lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static int IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static int llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static boolean lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static volatile int lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static volatile int lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static int lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static int IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private static lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @NotNull
   private static lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static int IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static boolean IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static boolean IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private static boolean llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private static boolean IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   private static int lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   private static boolean llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   private static double lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   private static double IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   private static int IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   private static int IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   private static boolean llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   private static long lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   private static int[] IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   private static String[] a;
   private static String[] b;

   private lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl() {
   }

   public final boolean a() {
      return lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   public final int b() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   public final void a(int var1) {
      lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var1;
   }

   public final int c() {
      return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   public final void b(int var1) {
      lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var1;
   }

   public final int d() {
      return lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   }

   public final void c(int var1) {
      lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var1;
   }

   public final int e() {
      return IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   }

   public final void d(int var1) {
      IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var1;
   }

   public final boolean f() {
      return llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   }

   public final void a(int param1, int param2) {
      int[] var3 = me.octo.client.utils.lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      if (var3 == null) {
         if (me.octo.client.utils.lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl) {
            me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("PiP window already open");
            return;
         }
         this.i();
         this.l();
      }
      try {
         int[] var4 = new int[1];
         int[] var5 = new int[1];
         org.lwjgl.glfw.GLFW.glfwGetFramebufferSize(me.octo.client.utils.lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, var4, var5);
         me.octo.client.utils.lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = Math.max(1, var4[0]);
         me.octo.client.utils.lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = Math.max(1, var5[0]);
         me.octo.client.utils.lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = (long)(1.0E9 / (double)me.octo.client.utils.lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl);
         me.octo.client.utils.lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 0L;
         me.octo.client.utils.IllllIlIIIIllIllllIIIIIlIlllllllIIIIIlIIllIIllIlIllIlllllIIlllIlIlllIlllIlIlIlIIlIIII var6 = new me.octo.client.utils.IllllIlIIIIllIllllIIIIIlIlllllllIIIIIlIIllIIllIlIllIlllllIIlllIlIlllIlllIlIlIlIIlIIII();
         var6.a(me.octo.client.utils.lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI, me.octo.client.utils.lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl);
         me.octo.client.utils.lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var6;
         kotlin.jvm.internal.Intrinsics.checkNotNull(me.octo.client.utils.lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         me.octo.client.utils.IllIllllIIlIIIllllllIIIlllllIIlllIlllIIlllIlIIllllIlllIllIIllIIIlllllIIllIlIlIIlllllI var7 = new me.octo.client.utils.IllIllllIIlIIIllllllIIIlllllIIlllIlllIIlllIlIIllllIlllIllIIllIIIlllllIIllIlIlIIlllllI(me.octo.client.utils.lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, me.octo.client.utils.lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         var7.a(me.octo.client.utils.lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI);
         var7.b(me.octo.client.utils.lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl);
         var7.d();
         me.octo.client.utils.lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var7;
         me.octo.client.utils.lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = true;
         me.octo.client.utils.lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = System.currentTimeMillis();
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Picture-in-Picture window opened (" + me.octo.client.utils.lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI + "x" + me.octo.client.utils.lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl + " @ " + me.octo.client.utils.lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl + "fps)");
      } catch (Exception var12) {
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Failed to open PiP window: " + var12.getMessage());
         var12.printStackTrace();
         this.m();
      }
   }

   public final void g() {
      int[] var1 = o();

      boolean var10000;
      label22: {
         try {
            var10000 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
            if (var1 == null) {
               break label22;
            }

            if (!lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl) {
               return;
            }
         } catch (RuntimeException var2) {
            throw (RuntimeException)a(var2);
         }

         this.m();
         var10000 =( 0 != 0);
      }

      lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = (boolean)var10000;
      var10000 =( 26611 != 0);
      short var10001 = 10931;
      lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Picture-in-Picture window closed");
   }

   public final void h() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o ()[I
      // 003: astore 1
      // 004: getstatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Z
      // 007: aload 1
      // 008: ifnull 021
      // 00b: ifeq 02f
      // 00e: goto 015
      // 011: invokestatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 014: athrow
      // 015: getstatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII J
      // 018: lconst_0
      // 019: lcmp
      // 01a: goto 021
      // 01d: invokestatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 020: athrow
      // 021: aload 1
      // 022: ifnull 036
      // 025: ifne 030
      // 028: goto 02f
      // 02b: invokestatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02e: athrow
      // 02f: return
      // 030: getstatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII J
      // 033: invokestatic org/lwjgl/glfw/GLFW.glfwWindowShouldClose (J)Z
      // 036: aload 1
      // 037: ifnull 053
      // 03a: ifeq 04d
      // 03d: goto 044
      // 040: invokestatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 043: athrow
      // 044: aload 0
      // 045: invokevirtual me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.g ()V
      // 048: return
      // 049: invokestatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04c: athrow
      // 04d: getstatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Lme/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 050: invokevirtual me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()Z
      // 053: aload 1
      // 054: ifnull 06e
      // 057: ifeq 071
      // 05a: goto 061
      // 05d: invokestatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 060: athrow
      // 061: getstatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 064: invokevirtual me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()Z
      // 067: goto 06e
      // 06a: invokestatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06d: athrow
      // 06e: ifne 08a
      // 071: getstatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII J
      // 074: getstatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Lme/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 077: invokevirtual me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()I
      // 07a: getstatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 07d: invokevirtual me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()I
      // 080: invokestatic org/lwjgl/glfw/GLFW.glfwSetWindowSize (JII)V
      // 083: goto 08a
      // 086: invokestatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 089: athrow
      // 08a: invokestatic java/lang/System.nanoTime ()J
      // 08d: lstore 2
      // 08e: lload 2
      // 08f: getstatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll J
      // 092: lsub
      // 093: getstatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI J
      // 096: lcmp
      // 097: aload 1
      // 098: ifnull 0c4
      // 09b: ifge 0a6
      // 09e: goto 0a5
      // 0a1: invokestatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a4: athrow
      // 0a5: return
      // 0a6: getstatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll J
      // 0a9: getstatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI J
      // 0ac: ladd
      // 0ad: putstatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll J
      // 0b0: aload 1
      // 0b1: ifnull 0d3
      // 0b4: lload 2
      // 0b5: getstatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll J
      // 0b8: lsub
      // 0b9: getstatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI J
      // 0bc: lcmp
      // 0bd: goto 0c4
      // 0c0: invokestatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c3: athrow
      // 0c4: ifle 0d2
      // 0c7: lload 2
      // 0c8: putstatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll J
      // 0cb: goto 0d2
      // 0ce: invokestatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d1: athrow
      // 0d2: nop
      // 0d3: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 0d6: invokevirtual net/minecraft/client/Minecraft.getMainRenderTarget ()Lcom/mojang/blaze3d/pipeline/RenderTarget;
      // 0d9: dup
      // 0da: sipush 26610
      // 0dd: sipush 6446
      // 0e0: pop2
      // 0e1: ldc "getMainRenderTarget(...)"
      // 0e3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0e6: astore 4
      // 0e8: aload 4
      // 0ea: getfield com/mojang/blaze3d/pipeline/RenderTarget.width I
      // 0ed: aload 1
      // 0ee: ifnull 112
      // 0f1: ifle 115
      // 0f4: goto 0fb
      // 0f7: invokestatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fa: athrow
      // 0fb: aload 4
      // 0fd: aload 1
      // 0fe: ifnull 118
      // 101: goto 108
      // 104: invokestatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 107: athrow
      // 108: getfield com/mojang/blaze3d/pipeline/RenderTarget.height I
      // 10b: goto 112
      // 10e: invokestatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 111: athrow
      // 112: ifgt 116
      // 115: return
      // 116: aload 4
      // 118: invokevirtual com/mojang/blaze3d/pipeline/RenderTarget.getColorTexture ()Lcom/mojang/blaze3d/textures/GpuTexture;
      // 11b: astore 5
      // 11d: aload 5
      // 11f: instanceof com/mojang/blaze3d/opengl/GlTexture
      // 122: aload 1
      // 123: ifnull 13a
      // 126: ifne 131
      // 129: goto 130
      // 12c: invokestatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12f: athrow
      // 130: return
      // 131: aload 5
      // 133: checkcast com/mojang/blaze3d/opengl/GlTexture
      // 136: bipush 0
      // 137: invokevirtual com/mojang/blaze3d/opengl/GlTexture.getWidth (I)I
      // 13a: istore 6
      // 13c: aload 5
      // 13e: checkcast com/mojang/blaze3d/opengl/GlTexture
      // 141: bipush 0
      // 142: invokevirtual com/mojang/blaze3d/opengl/GlTexture.getHeight (I)I
      // 145: istore 7
      // 147: iload 6
      // 149: aload 1
      // 14a: ifnull 159
      // 14d: ifle 167
      // 150: goto 157
      // 153: invokestatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 156: athrow
      // 157: iload 7
      // 159: aload 1
      // 15a: ifnull 170
      // 15d: ifgt 168
      // 160: goto 167
      // 163: invokestatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 166: athrow
      // 167: return
      // 168: aload 5
      // 16a: checkcast com/mojang/blaze3d/opengl/GlTexture
      // 16d: invokevirtual com/mojang/blaze3d/opengl/GlTexture.glId ()I
      // 170: istore 8
      // 172: iload 8
      // 174: aload 1
      // 175: ifnull 1cc
      // 178: getstatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll I
      // 17b: if_icmpne 1b9
      // 17e: goto 185
      // 181: invokestatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 184: athrow
      // 185: iload 6
      // 187: aload 1
      // 188: ifnull 1cc
      // 18b: goto 192
      // 18e: invokestatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 191: athrow
      // 192: getstatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII I
      // 195: if_icmpne 1b9
      // 198: goto 19f
      // 19b: invokestatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19e: athrow
      // 19f: iload 7
      // 1a1: aload 1
      // 1a2: ifnull 1cc
      // 1a5: goto 1ac
      // 1a8: invokestatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ab: athrow
      // 1ac: getstatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI I
      // 1af: if_icmpeq 1d0
      // 1b2: goto 1b9
      // 1b5: invokestatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b8: athrow
      // 1b9: iload 8
      // 1bb: putstatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll I
      // 1be: iload 6
      // 1c0: putstatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII I
      // 1c3: iload 7
      // 1c5: goto 1cc
      // 1c8: invokestatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1cb: athrow
      // 1cc: putstatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI I
      // 1cf: return
      // 1d0: getstatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/utils/IllllIlIIIIllIllllIIIIIlIlllllllIIIIIlIIllIIllIlIllIlllllIIlllIlIlllIlllIlIlIlIIlIIII;
      // 1d3: dup
      // 1d4: ifnull 1ed
      // 1d7: iload 8
      // 1d9: iload 6
      // 1db: iload 7
      // 1dd: getstatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI I
      // 1e0: getstatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl I
      // 1e3: invokevirtual me/octo/client/utils/IllllIlIIIIllIllllIIIIIlIlllllllIIIIIlIIllIIllIlIllIlllllIIlllIlIlllIlllIlIlIlIIlIIII.a (IIIII)V
      // 1e6: goto 1ee
      // 1e9: invokestatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ec: athrow
      // 1ed: pop
      // 1ee: getstatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/utils/IllIllllIIlIIIllllllIIIlllllIIlllIlllIIlllIlIIllllIlllIllIIllIIIlllllIIllIlIlIIlllllI;
      // 1f1: dup
      // 1f2: ifnull 216
      // 1f5: astore 9
      // 1f7: bipush 0
      // 1f8: istore 10
      // 1fa: aload 9
      // 1fc: getstatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl;
      // 1ff: pop
      // 200: getstatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI I
      // 203: invokevirtual me/octo/client/utils/IllIllllIIlIIIllllllIIIlllllIIlllIlllIIlllIlIIllllIlllIllIIllIIIlllllIIllIlIlIIlllllI.a (I)V
      // 206: aload 9
      // 208: getstatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl;
      // 20b: pop
      // 20c: getstatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl I
      // 20f: invokevirtual me/octo/client/utils/IllIllllIIlIIIllllllIIIlllllIIlllIlllIIlllIlIIllllIlllIllIIllIIIlllllIIllIlIlIIlllllI.b (I)V
      // 212: nop
      // 213: goto 218
      // 216: pop
      // 217: nop
      // 218: invokestatic java/lang/System.currentTimeMillis ()J
      // 21b: putstatic me/octo/client/utils/lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII J
      // 21e: goto 240
      // 221: astore 4
      // 223: aload 4
      // 225: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 228: sipush 26598
      // 22b: sipush -26075
      // 22e: pop2
      // 22f: ldc_w "Error capturing PiP frame: "
      // 232: swap
      // 233: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 238: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b (Ljava/lang/String;)V
      // 23b: aload 4
      // 23d: invokevirtual java/lang/Exception.printStackTrace ()V
      // 240: return
   }

    private final void i() {
       long var2 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getWindow().handle();
       GLFW.glfwDefaultWindowHints();
       GLFW.glfwWindowHint(131076, 0);
       GLFW.glfwWindowHint(131075, 1);
       GLFW.glfwWindowHint(139273, 217090);
       GLFW.glfwWindowHint(131077, 0);
       GLFW.glfwWindowHint(131079, this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll ? 1 : 0);
       GLFW.glfwWindowHint(131073, 0);
       this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = GLFW.glfwCreateWindow(this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI, this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl, "Minecraft PiP", 0L, var2);
       if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII == 0L) {
          throw new RuntimeException("Failed to create GLFW window for Picture-in-Picture");
       }
       this.j();
       GLFW.glfwSetWindowPos(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll, this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
       this.k();
       GLFW.glfwShowWindow(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
    }

   private final void j() {
int[] var1 = me.octo.client.utils.lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
if (var1 != null && !System.getProperty("os.name").toLowerCase(java.util.Locale.ROOT).contains("win")) {
   return;
}
long var2;
try {
   var2 = org.lwjgl.glfw.GLFWNativeWin32.glfwGetWin32Window(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
} catch (Throwable var6) {
   me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.e("GLFWNativeWin32 unavailable: " + var6.getMessage());
   return;
}
if (var1 != null && var2 == 0L) {
   return;
}
boolean var3 = IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll || (var1 != null && lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll < 255);
try {
   org.lwjgl.system.MemoryStack var5 = org.lwjgl.system.MemoryStack.stackPush();
   try {
      java.nio.IntBuffer var9 = var5.callocInt(1);
      long var10 = org.lwjgl.system.windows.User32.GetWindowLongPtr(var2, -20);
      var10 = llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI
            ? ((var10 | 128L | 134217728L) & -262145L)
            : (((var10 | 262144L) & -129L) & -134217729L);
      var10 = IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll ? (var10 | 32L) : (var10 & -33L);
      var10 = var3 ? (var10 | 524288L) : (var10 & -524289L);
      org.lwjgl.system.windows.User32.SetWindowLongPtr(var9, var2, -20, var10);
      if (var1 != null && var3) {
         int var12 = (byte) kotlin.ranges.RangesKt.coerceIn(lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll, 0, 255);
         org.lwjgl.system.windows.User32.SetLayeredWindowAttributes(var9, var2, 0, (byte) var12, 2);
      }
      org.lwjgl.system.windows.User32.ShowWindow(var2, 0);
      org.lwjgl.system.windows.User32.ShowWindow(var2, 8);
   } finally {
      var5.close();
   }
} catch (Throwable var6b) {
   me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.e("apply ex-styles failed: " + var6b.getMessage());
}
   }

   private final void k() {
int[] var1 = o();
try {
   MemoryStack var2 = MemoryStack.stackPush();
   Throwable var3 = null;
   try {
      MemoryStack var4 = var2;
      java.io.InputStream var6 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.getClass().getResourceAsStream("/assets/polinex/logo16.png");
      java.io.InputStream var7 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.getClass().getResourceAsStream("/assets/polinex/logo32.png");
      if (var1 == null) {
         return;
      }
      if (var6 == null) {
         return;
      }
      NativeImage var8;
      if (var1 == null) {
         var8 = NativeImage.read(var7);
      } else {
         if (var7 == null) {
            return;
         }
         var8 = NativeImage.read(var6);
      }
      Intrinsics.checkNotNullExpressionValue(var8, "read(...)");
      NativeImage var9 = NativeImage.read(var7);
      Intrinsics.checkNotNullExpressionValue(var9, "read(...)");
      ByteBuffer var10 = MemoryUtil.memAlloc(var8.getWidth() * var8.getHeight() * 4);
      Intrinsics.checkNotNullExpressionValue(var10, "memAlloc(...)");
      ByteBuffer var11 = MemoryUtil.memAlloc(var9.getWidth() * var9.getHeight() * 4);
      Intrinsics.checkNotNullExpressionValue(var11, "memAlloc(...)");
      var10.asIntBuffer().put(var8.getPixelsABGR());
      var11.asIntBuffer().put(var9.getPixelsABGR());
      GLFWImage.Buffer var12 = GLFWImage.malloc(2, var4);
      Intrinsics.checkNotNullExpressionValue(var12, "malloc(...)");
      var12.position(0);
      var12.width(var8.getWidth());
      var12.height(var8.getHeight());
      var12.pixels(var10);
      var12.position(1);
      var12.width(var9.getWidth());
      var12.height(var9.getHeight());
      var12.pixels(var11);
      var12.position(0);
      GLFW.glfwSetWindowIcon(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, var12);
      MemoryUtil.memFree(var10);
      MemoryUtil.memFree(var11);
      var8.close();
      var9.close();
   } catch (Throwable var5) {
      var3 = var5;
      throw var5;
   } finally {
      AutoCloseableKt.closeFinally(var2, var3);
   }
} catch (Exception var13) {
   me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.e("Could not set PiP window icon: " + var13.getMessage());
}
   }

   private final void l() {
      GLFW.glfwSetFramebufferSizeCallback(
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl::a
      );
      GLFW.glfwSetWindowPosCallback(
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl::b
      );
      GLFW.glfwSetScrollCallback(
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl::a
      );
      GLFW.glfwSetMouseButtonCallback(
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl::a
      );
      GLFW.glfwSetCursorPosCallback(
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl::b
      );
      GLFW.glfwSetWindowCloseCallback(
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl::a
      );
   }

    private final void m() {
       if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI != null) {
          this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.e();
          this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.b(2000L);
       }
       this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = null;
       try {
          if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl != null) {
             this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.c();
          }
       } catch (Exception var3) {
          me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Error destroying PiP relay: " + var3.getMessage());
       }
       this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = null;
       if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII != 0L) {
          try {
             GLFW.glfwDestroyWindow(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
          } catch (Exception var2) {
             me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Error destroying PiP window: " + var2.getMessage());
          }
          this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = 0L;
       }
       this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 0L;
    }

   public final void a(boolean param1) {
      o();
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = param1;
      if (!lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl || lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII == 0L) { return; }
      org.lwjgl.glfw.GLFW.glfwSetWindowAttrib(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, 131079, param1 ? 1 : 0);
   }

   public final void e(int var1) {
      IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = RangesKt.coerceIn(var1, 30, 240);
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = (long)(
         1.0E9 / IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl
      );
   }

   public final void b(boolean var1) {
      IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = var1;
   }

   public final void c(boolean param1) {
      o();
      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = param1;
      if (lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl && lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII != 0L) { this.j(); }
   }

   public final void d(boolean param1) {
      o();
      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = param1;
      if (lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl && lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII != 0L) { this.j(); }
   }

   public final void a(float param1) {
      o();
      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = (int)(RangesKt.coerceIn(param1, 0.0F, 1.0F) * 255.0F);
      if (lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl && lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII != 0L) { this.j(); }
   }

   public final boolean n() {
            var var1 = o();
            if (!lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl) {
               return false;
            }
            long var2 = System.currentTimeMillis() - IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            if (!IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl) {
               return false;
            }
            if (me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.isWindowActive()) {
               return false;
            }
            return var2 < 1000L;
   }

   public final void b(int param1, int param2) {
      o();
      if (lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl && lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII != 0L) { org.lwjgl.glfw.GLFW.glfwSetWindowSize(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, param1, param2); }
   }

   public final void c(int param1, int param2) {
      o();
      if (lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl && lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII != 0L) { org.lwjgl.glfw.GLFW.glfwSetWindowPos(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, param1, param2); }
   }

   private static final void a(long var0, int var2, int var3) {
      Object var8 = null; // PX-FIX
      int[] var10000 = o();
      lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = Math.max(1, var2);
      int[] var4 = var10000;

      try {
         label31: {
   pxClinit: {
            lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = Math.max(1, var3);
            if (var4 != null) {
               var8 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
               if (lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI != null) {
                  break label31;
               }
            }

            break pxClinit;
         }
}
      } catch (RuntimeException var7) {
         throw (RuntimeException)a(var7);
      }

      IllIllllIIlIIIllllllIIIlllllIIlllIlllIIlllIlIIllllIlllIllIIllIIIlllllIIllIlIlIIlllllI var5 =((IllIllllIIlIIIllllllIIIlllllIIlllIlllIIlllIlIIllllIlllIllIIllIIIlllllIIllIlIlIIlllllI)( var8));
      boolean var6 = false;
      var5.a(lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI);
      var5.b(lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl);
   }

   private static final void b(long var0, int var2, int var3) {
      lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var2;
      IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var3;
   }

   private static final void a(long var0, double var2, double var4) {
      try {
         if (llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI) {
            return;
         }
      } catch (RuntimeException var10) {
         throw (RuntimeException)a(var10);
      }

      double var6 = 1.0 + var4 * 0.13;
      int var8 = RangesKt.coerceIn((int)(lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl * var6), 100, 1000);
      int var9 = (int)(var8 * 16.0 / 9.0);
      llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.a(var9);
      IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.a(var8);
   }

   private static final void a(long param0, int param2, int param3, int param4) {
      int[] var5 = o();
      if (param2 == 2 && param3 == 1) {
         llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = !llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
      }
      if (param2 != 0) {
         return;
      }
      switch (param3) {
         case 0:
            llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = false;
            return;
         case 1: {
            long var6 = System.currentTimeMillis();
            if (var6 - lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII > 200L) {
               llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = false;
               org.lwjgl.glfw.GLFW.glfwFocusWindow(me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getWindow().handle());
               lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = 0L;
            }
            if (!llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI) {
               lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = var6;
               llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = true;
               double[] var8 = new double[1];
               double[] var9 = new double[1];
               org.lwjgl.glfw.GLFW.glfwGetCursorPos(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, var8, var9);
               lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = var8[0];
               IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = var9[0];
            } else {
               lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = var6;
            }
            llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = false;
            return;
         }
      }
   }

   private static final void b(long var0, double var2, double var4) {
      try {
         if (llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl) {
            GLFW.glfwSetWindowPos(
               lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
                  + (int)var2
                  - (int)lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll,
               IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
                  + (int)var4
                  - (int)IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll
            );
         }
      } catch (RuntimeException var6) {
         throw (RuntimeException)a(var6);
      }
   }

   private static final void a(long var0) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.g();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[27];
      int[] var10000 = new int[2];
      int var3 = 0;
      String var2 = "'Z\u001e\u0014ò)\u0080)Ùâ¨\u0018Ü$âõ\fÊõZÄ,:T¦\"C\"\u0019¾\u0007\u0099\u008a\u0095Ø39\u009d0PÉ\u0004\u0099x¦ÏØiaJ\u008e\u00980¡ÞW¬x$¶}8\u000e=;Ù8¥«H\u0084\u009f\u0006YÓÀ\u008f3î>'\u0098Õ¸d\u001bE¤7Ò¢0y¬èeek\tSi:¤wvFüµÉ\u0010\u008b@\u000b¡ÓS\u008cÄ®\u000f£\n\u009aÞzÅ\u0002 | wÖÊ\u009434ï\u0007ß\u001bì\u0080R\u001eê;È§\u0015dØë¹¬Ö'\u000e\u009b1cÜk\u0018@Fê2ÖåÎ:\u009d,`S¸ÀÚ6lábó¯í²b\u001a\u001b\u009aÇ\u0013\u0090%\u009fá\u001c\u0084ïk\\{À\u000b\u001eºU\u0094%²]OPà\u000bÿðNAW\u0084w!oüQ\u001f\u0085ýó/Ñ\n\u008b\u009a$ìsÌ)G\u001f'ôþ£¼´'ØfÇ,\u0091\u0099Ã\tæ\r\u0091ÿ\u0082\tì\n$S¬Vè\u001fñ\rªûÂ \u0088\u0091Hø²\u0088\u0082Lt\u0004.\u0002\u0001i\u0010¸\rõF&Ó¿\ry\u0001\u0014âÔhÏM\u001c¤Ú\u0016v\u009cBü\u0099\u0086\u0093Á÷S\"ÂåÆ\u0019\u0085\u0007ãX¿F!@}I\tû²?\u0085\u0092Xf^\u008c\u0010F\u0087ccÎ¥\u0005®\u007f\u0090¹7þÒ\u008a\u001a\u0017Em¿·Ê\u0095\u0099\u0002}Âs°\b\u001e\u0015\u001c\u0012É\u009a.0²\u0094\u001b¼m\u0015\u0080ü\u009c÷F\u0003ì\u0015\u0005>Åt¹H\u0004\u0013Êi\u009fd¿Ú\u001d\u009c\u001d©ÃÁ\u0094è`Ù¸5+7Õ\u001búb¨P! ß\u000fºBoµÜÓw\u0003\u001d\u0095\b0,X\tdð\u0095¾£R\u001f\u0096Ks÷Ë£]'\u0016+(;ÙÖ´ó\u0018ªAuD¹g3 \u0000\u001d\u0082×èþ\u001f´\u0085\u00adcºzB>\u009d\r£¦Ä\"$o=ÿ\u008fÃ\u008c\u00ad}\u0007\u0014:3Jü©\u0080\u001aZ¥ïô\u0095Ù?~\bwm\u0015\f´Êò_\u0085}s\"JÿÔ\u0004\u0093\u0003¶=Ï";
      int var4 = "'Z\u001e\u0014ò)\u0080)Ùâ¨\u0018Ü$âõ\fÊõZÄ,:T¦\"C\"\u0019¾\u0007\u0099\u008a\u0095Ø39\u009d0PÉ\u0004\u0099x¦ÏØiaJ\u008e\u00980¡ÞW¬x$¶}8\u000e=;Ù8¥«H\u0084\u009f\u0006YÓÀ\u008f3î>'\u0098Õ¸d\u001bE¤7Ò¢0y¬èeek\tSi:¤wvFüµÉ\u0010\u008b@\u000b¡ÓS\u008cÄ®\u000f£\n\u009aÞzÅ\u0002 | wÖÊ\u009434ï\u0007ß\u001bì\u0080R\u001eê;È§\u0015dØë¹¬Ö'\u000e\u009b1cÜk\u0018@Fê2ÖåÎ:\u009d,`S¸ÀÚ6lábó¯í²b\u001a\u001b\u009aÇ\u0013\u0090%\u009fá\u001c\u0084ïk\\{À\u000b\u001eºU\u0094%²]OPà\u000bÿðNAW\u0084w!oüQ\u001f\u0085ýó/Ñ\n\u008b\u009a$ìsÌ)G\u001f'ôþ£¼´'ØfÇ,\u0091\u0099Ã\tæ\r\u0091ÿ\u0082\tì\n$S¬Vè\u001fñ\rªûÂ \u0088\u0091Hø²\u0088\u0082Lt\u0004.\u0002\u0001i\u0010¸\rõF&Ó¿\ry\u0001\u0014âÔhÏM\u001c¤Ú\u0016v\u009cBü\u0099\u0086\u0093Á÷S\"ÂåÆ\u0019\u0085\u0007ãX¿F!@}I\tû²?\u0085\u0092Xf^\u008c\u0010F\u0087ccÎ¥\u0005®\u007f\u0090¹7þÒ\u008a\u001a\u0017Em¿·Ê\u0095\u0099\u0002}Âs°\b\u001e\u0015\u001c\u0012É\u009a.0²\u0094\u001b¼m\u0015\u0080ü\u009c÷F\u0003ì\u0015\u0005>Åt¹H\u0004\u0013Êi\u009fd¿Ú\u001d\u009c\u001d©ÃÁ\u0094è`Ù¸5+7Õ\u001búb¨P! ß\u000fºBoµÜÓw\u0003\u001d\u0095\b0,X\tdð\u0095¾£R\u001f\u0096Ks÷Ë£]'\u0016+(;ÙÖ´ó\u0018ªAuD¹g3 \u0000\u001d\u0082×èþ\u001f´\u0085\u00adcºzB>\u009d\r£¦Ä\"$o=ÿ\u008fÃ\u008c\u00ad}\u0007\u0014:3Jü©\u0080\u001aZ¥ïô\u0095Ù?~\bwm\u0015\f´Êò_\u0085}s\"JÿÔ\u0004\u0093\u0003¶=Ï"
         .length();
      char var1 = 27;
      b(var10000);
      int var8 = -1;

      label52:
      while (true) {
         byte var9 = 30;
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
                     case 0 -> 38;
                     case 1 -> 55;
                     case 2 -> 4;
                     case 3 -> 69;
                     case 4 -> 77;
                     case 5 -> 91;
                     default -> 67;
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
                     b = new String[27];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl();
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 854;
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 480;
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 100;
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 100;
                     llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        854
                     );
                     IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        480
                     );
                     IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 144;
                     IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = true;
                     llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = true;
                     lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = 255;
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var30;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "\u0007\u0005l¿4Ó~ãC\u0003ôõ¸";
                  var4 = "\u0007\u0005l¿4Ó~ãC\u0003ôõ¸".length();
                  var1 = '\t';
                  var8 = -1;
            }

            var9 = 90;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   public static void b(int[] var0) {
      IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = var0;
   }

   public static int[] o() {
      return IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   private static String d(int var0, int var1) {
      int var2 = (var0 ^ 26615) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 10;
            case 1 -> 127;
            case 2 -> 200;
            case 3 -> 226;
            case 4 -> 72;
            case 5 -> 30;
            case 6 -> 24;
            case 7 -> 214;
            case 8 -> 184;
            case 9 -> 63;
            case 10 -> 23;
            case 11 -> 193;
            case 12 -> 161;
            case 13 -> 207;
            case 14 -> 138;
            case 15 -> 107;
            case 16 -> 225;
            case 17 -> 1;
            case 18 -> 151;
            case 19 -> 112;
            case 20 -> 25;
            case 21 -> 109;
            case 22 -> 153;
            case 23 -> 231;
            case 24 -> 20;
            case 25 -> 53;
            case 26 -> 229;
            case 27 -> 194;
            case 28 -> 176;
            case 29 -> 59;
            case 30 -> 27;
            case 31 -> 233;
            case 32 -> 101;
            case 33 -> 159;
            case 34 -> 146;
            case 35 -> 7;
            case 36 -> 116;
            case 37 -> 172;
            case 38 -> 85;
            case 39 -> 152;
            case 40 -> 31;
            case 41 -> 134;
            case 42 -> 211;
            case 43 -> 110;
            case 44 -> 51;
            case 45 -> 56;
            case 46 -> 71;
            case 47 -> 105;
            case 48 -> 239;
            case 49 -> 249;
            case 50 -> 82;
            case 51 -> 41;
            case 52 -> 18;
            case 53 -> 155;
            case 54 -> 202;
            case 55 -> 188;
            case 56 -> 81;
            case 57 -> 222;
            case 58 -> 76;
            case 59 -> 250;
            case 60 -> 39;
            case 61 -> 38;
            case 62 -> 132;
            case 63 -> 230;
            case 64 -> 131;
            case 65 -> 169;
            case 66 -> 140;
            case 67 -> 149;
            case 68 -> 115;
            case 69 -> 86;
            case 70 -> 104;
            case 71 -> 165;
            case 72 -> 130;
            case 73 -> 0;
            case 74 -> 242;
            case 75 -> 174;
            case 76 -> 9;
            case 77 -> 34;
            case 78 -> 102;
            case 79 -> 148;
            case 80 -> 48;
            case 81 -> 35;
            case 82 -> 61;
            case 83 -> 170;
            case 84 -> 228;
            case 85 -> 223;
            case 86 -> 208;
            case 87 -> 94;
            case 88 -> 255;
            case 89 -> 73;
            case 90 -> 192;
            case 91 -> 47;
            case 92 -> 64;
            case 93 -> 118;
            case 94 -> 22;
            case 95 -> 191;
            case 96 -> 69;
            case 97 -> 45;
            case 98 -> 145;
            case 99 -> 156;
            case 100 -> 133;
            case 101 -> 142;
            case 102 -> 251;
            case 103 -> 241;
            case 104 -> 218;
            case 105 -> 203;
            case 106 -> 95;
            case 107 -> 65;
            case 108 -> 52;
            case 109 -> 5;
            case 110 -> 129;
            case 111 -> 182;
            case 112 -> 108;
            case 113 -> 209;
            case 114 -> 164;
            case 115 -> 13;
            case 116 -> 213;
            case 117 -> 29;
            case 118 -> 178;
            case 119 -> 46;
            case 120 -> 15;
            case 121 -> 201;
            case 122 -> 74;
            case 123 -> 93;
            case 124 -> 205;
            case 125 -> 244;
            case 126 -> 8;
            case 127 -> 50;
            case 128 -> 198;
            case 129 -> 77;
            case 130 -> 168;
            case 131 -> 154;
            case 132 -> 100;
            case 133 -> 113;
            case 134 -> 78;
            case 135 -> 67;
            case 136 -> 126;
            case 137 -> 245;
            case 138 -> 21;
            case 139 -> 254;
            case 140 -> 26;
            case 141 -> 120;
            case 142 -> 60;
            case 143 -> 136;
            case 144 -> 32;
            case 145 -> 14;
            case 146 -> 220;
            case 147 -> 111;
            case 148 -> 157;
            case 149 -> 2;
            case 150 -> 221;
            case 151 -> 181;
            case 152 -> 97;
            case 153 -> 150;
            case 154 -> 135;
            case 155 -> 234;
            case 156 -> 55;
            case 157 -> 37;
            case 158 -> 162;
            case 159 -> 224;
            case 160 -> 179;
            case 161 -> 75;
            case 162 -> 121;
            case 163 -> 83;
            case 164 -> 252;
            case 165 -> 90;
            case 166 -> 106;
            case 167 -> 143;
            case 168 -> 183;
            case 169 -> 253;
            case 170 -> 236;
            case 171 -> 166;
            case 172 -> 99;
            case 173 -> 42;
            case 174 -> 238;
            case 175 -> 117;
            case 176 -> 44;
            case 177 -> 36;
            case 178 -> 177;
            case 179 -> 91;
            case 180 -> 19;
            case 181 -> 49;
            case 182 -> 187;
            case 183 -> 128;
            case 184 -> 125;
            case 185 -> 89;
            case 186 -> 137;
            case 187 -> 199;
            case 188 -> 79;
            case 189 -> 114;
            case 190 -> 96;
            case 191 -> 40;
            case 192 -> 237;
            case 193 -> 186;
            case 194 -> 217;
            case 195 -> 163;
            case 196 -> 216;
            case 197 -> 28;
            case 198 -> 243;
            case 199 -> 206;
            case 200 -> 246;
            case 201 -> 87;
            case 202 -> 92;
            case 203 -> 167;
            case 204 -> 57;
            case 205 -> 68;
            case 206 -> 4;
            case 207 -> 196;
            case 208 -> 3;
            case 209 -> 190;
            case 210 -> 84;
            case 211 -> 189;
            case 212 -> 17;
            case 213 -> 248;
            case 214 -> 11;
            case 215 -> 98;
            case 216 -> 144;
            case 217 -> 124;
            case 218 -> 158;
            case 219 -> 6;
            case 220 -> 43;
            case 221 -> 147;
            case 222 -> 227;
            case 223 -> 235;
            case 224 -> 175;
            case 225 -> 160;
            case 226 -> 122;
            case 227 -> 212;
            case 228 -> 210;
            case 229 -> 88;
            case 230 -> 219;
            case 231 -> 185;
            case 232 -> 123;
            case 233 -> 54;
            case 234 -> 62;
            case 235 -> 139;
            case 236 -> 171;
            case 237 -> 247;
            case 238 -> 12;
            case 239 -> 33;
            case 240 -> 240;
            case 241 -> 232;
            case 242 -> 195;
            case 243 -> 215;
            case 244 -> 58;
            case 245 -> 70;
            case 246 -> 173;
            case 247 -> 141;
            case 248 -> 66;
            case 249 -> 119;
            case 250 -> 16;
            case 251 -> 204;
            case 252 -> 197;
            case 253 -> 80;
            case 254 -> 180;
            default -> 103;
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

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private double IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private double lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(int var1) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = System.currentTimeMillis();
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 100L;
      }

      public final int a() {
         int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
         double var2 = RangesKt.coerceIn(
            (double)(System.currentTimeMillis() - this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl)
               / this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
            0.0,
            1.0
         );
         int[] var1 = var10000;
         double var6 = var2;
         double var10001 = 1.0;
         if (var1 != null) {
            if (var2 >= 1.0) {
               return (int)this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            var6 = 1.0;
            var10001 = Math.pow(1.0 - var2, 3.0);
         }

         double var4 = var6 - var10001;
         return (int)(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               + (
                     this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  )
                  * var4
         );
      }

      public final void a(int var1) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = this.a();
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = System.currentTimeMillis();
      }

      public final boolean b() {
         int[] var1 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
         long var2;
         int var10000 = (
                  var2 = System.currentTimeMillis()
                     - this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                     - this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
               )
               == 0L
            ? 0
            : (var2 < 0L ? -1 : 1);
         if (var1 != null) {
            var10000 = var10000 >= 0 ? 1 : 0;
         }

         return (var10000 != 0);
      }
   }

   public static void a(lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl var1, int var2, int var3, int var4, Object var5) {
      if ((var4 & 1) != 0) {
         var2 = 854;
      }
      if ((var4 & 2) != 0) {
         var3 = 480;
      }
      var1.a(var2, var3);
   }

}
