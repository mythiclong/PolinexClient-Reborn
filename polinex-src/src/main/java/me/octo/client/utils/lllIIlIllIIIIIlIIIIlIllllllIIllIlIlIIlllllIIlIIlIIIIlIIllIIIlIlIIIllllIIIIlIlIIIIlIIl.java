package me.octo.client.utils;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.nanovg.NVGColor;
import org.lwjgl.nanovg.NVGPaint;
import org.lwjgl.nanovg.NanoVG;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.io.CloseableKt;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import org.lwjgl.system.MemoryUtil;
import net.minecraft.client.Minecraft;
import org.lwjgl.nanovg.NSVGImage;
import org.lwjgl.nanovg.NanoSVG;
import org.lwjgl.nanovg.NanoVGGL3;
import org.lwjgl.stb.STBImage;
import kotlin.io.TextStreamsKt;

public final class lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl {
   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) { return null; } // PX-FIX ovld

   public static <T> T a(Object p0, Object p1, Object p2, Object p3) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T a(Object p0, float p1, Object p2, float p3, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIl

// PX-DEDUP removed duplicate ovld: public static <T> T a(Object p0, float p1, float p2, float p3, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIll

   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) { return null; } // PX-FIX ovld

   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4) { return null; } // PX-FIX ovld

   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) { return null; } // PX-FIX ovld

   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T a(float p0, float p1, Object p2, Object p3, float p4, llIIIIlIIIllIIllIllIIllIlI

// PX-DEDUP removed duplicate ovld: public static <T> T a(float p0, float p1, Object p2, Object p3, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIl

// PX-DEDUP removed duplicate ovld: public static <T> T a(lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlI

   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) { return null; } // PX-FIX ovld

   public static <T> T b(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T b(lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlI

   public static <T> T b(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) { return null; } // PX-FIX ovld



   @NotNull
   public static lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static NVGPaint lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static NVGColor IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static NVGColor lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @JvmField
   @NotNull
   public static IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static HashMap<IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl, lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static float[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private static HashMap<llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII, lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private static HashMap<String, llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII> IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private static HashMap<String, Integer> llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private static HashMap<String, Integer> lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private static HashMap<Integer, lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private static HashMap<lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll, Float> lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @Nullable
   private static lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static long IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static boolean llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static boolean IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static float IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @JvmField
   public static float IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static int IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private static int llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private static int IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   private static int lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   private static int llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   private static int lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   @JvmField
   public static boolean IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   private static int IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   private static String IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   private static String[] a;
   private static String[] b;

   private lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl() {
   }

   @NotNull
   public final NVGColor a() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final long b() {
      return IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   }

   public final void a(long var1) {
      IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var1;
   }

   public final int a(int param1, int param2, int param3) {
      String var4 = j();
      if (param1 == 0 || param2 <= 0 || param3 <= 0) {
         IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = false;
         return 0;
      }
      float var5 = RangesKt.coerceIn(IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll, 1.0F, 3.0F);
      int var6 = (int)((float)param2 * var5);
      int var7 = (int)((float)param3 * var5);
      boolean var8 = llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl != var6 || lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll != var7;
      if (IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl == 0) {
         IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = GL30.glGenFramebuffers();
      }
      if (llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI == 0 || var8) {
         if (llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI == 0) {
            llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = GL30.glGenRenderbuffers();
         }
         GL30.glBindRenderbuffer(36161, llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI);
         GL30.glRenderbufferStorage(36161, 32856, var6, var7);
         if (IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll == 0) {
            IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = GL30.glGenRenderbuffers();
         }
         GL30.glBindRenderbuffer(36161, IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll);
         GL30.glRenderbufferStorage(36161, 35056, var6, var7);
         GL30.glBindRenderbuffer(36161, 0);
         llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = var6;
         lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = var7;
      }
      GL30.glBindFramebuffer(36160, IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl);
      GL30.glFramebufferRenderbuffer(36160, 36064, 36161, llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI);
      GL30.glFramebufferRenderbuffer(36160, 33306, 36161, IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll);
      int var9 = GL30.glCheckFramebufferStatus(36160);
      IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = var9 == 36053;
      if (IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll) {
         if (lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll == 0) {
            lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = GL30.glGenFramebuffers();
         }
         GL11.glViewport(0, 0, var6, var7);
         GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
         GL11.glClearStencil(0);
         GL11.glClear(17408);
      }
      int var10 = IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll ? 1 : 0;
      if (var10 != IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII) {
         IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = var10;
         if (IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll) {
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("[NVG] SSAA(" + var5 + "x) FBO ready — smooth AA borders");
         } else {
            String var11 = Integer.toString(var9, CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(var11, "toString(...)");
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("[NVG] SSAA FBO incomplete (status=0x" + var11 + ") — stroke fallback on MC FBO");
         }
      }
      return IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll ? IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl : 0;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.j ()Ljava/lang/String;
      // 003: astore 4
      // 005: iload 1
      // 006: aload 4
      // 008: ifnull 04f
      // 00b: ifeq 043
      // 00e: goto 015
      // 011: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 014: athrow
      // 015: iload 2
      // 016: aload 4
      // 018: ifnull 04f
      // 01b: goto 022
      // 01e: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 021: athrow
      // 022: ifle 043
      // 025: goto 02c
      // 028: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02b: athrow
      // 02c: iload 3
      // 02d: aload 4
      // 02f: ifnull 04f
      // 032: goto 039
      // 035: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 038: athrow
      // 039: ifgt 050
      // 03c: goto 043
      // 03f: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 042: athrow
      // 043: bipush 0
      // 044: putstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll Z
      // 047: bipush 0
      // 048: goto 04f
      // 04b: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04e: athrow
      // 04f: ireturn
      // 050: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll F
      // 053: fconst_1
      // 054: ldc 3.0
      // 056: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 059: fstore 5
      // 05b: iload 2
      // 05c: i2f
      // 05d: fload 5
      // 05f: fmul
      // 060: f2i
      // 061: istore 6
      // 063: iload 3
      // 064: i2f
      // 065: fload 5
      // 067: fmul
      // 068: f2i
      // 069: istore 7
      // 06b: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl I
      // 06e: aload 4
      // 070: ifnull 0a2
      // 073: iload 6
      // 075: if_icmpne 09a
      // 078: goto 07f
      // 07b: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07e: athrow
      // 07f: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll I
      // 082: aload 4
      // 084: ifnull 0a2
      // 087: goto 08e
      // 08a: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08d: athrow
      // 08e: iload 7
      // 090: if_icmpeq 0a5
      // 093: goto 09a
      // 096: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 099: athrow
      // 09a: bipush 1
      // 09b: goto 0a2
      // 09e: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a1: athrow
      // 0a2: goto 0a6
      // 0a5: bipush 0
      // 0a6: istore 8
      // 0a8: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl I
      // 0ab: aload 4
      // 0ad: ifnull 0ca
      // 0b0: ifne 0c7
      // 0b3: goto 0ba
      // 0b6: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b9: athrow
      // 0ba: invokestatic org/lwjgl/opengl/GL30.glGenFramebuffers ()I
      // 0bd: putstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl I
      // 0c0: goto 0c7
      // 0c3: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c6: athrow
      // 0c7: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI I
      // 0ca: aload 4
      // 0cc: ifnull 0f4
      // 0cf: ifeq 0f1
      // 0d2: goto 0d9
      // 0d5: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d8: athrow
      // 0d9: iload 8
      // 0db: aload 4
      // 0dd: ifnull 18a
      // 0e0: goto 0e7
      // 0e3: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e6: athrow
      // 0e7: ifeq 165
      // 0ea: goto 0f1
      // 0ed: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f0: athrow
      // 0f1: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI I
      // 0f4: aload 4
      // 0f6: ifnull 126
      // 0f9: ifne 110
      // 0fc: goto 103
      // 0ff: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 102: athrow
      // 103: invokestatic org/lwjgl/opengl/GL30.glGenRenderbuffers ()I
      // 106: putstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI I
      // 109: goto 110
      // 10c: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10f: athrow
      // 110: ldc 36161
      // 112: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI I
      // 115: invokestatic org/lwjgl/opengl/GL30.glBindRenderbuffer (II)V
      // 118: ldc 36161
      // 11a: ldc 32856
      // 11c: iload 6
      // 11e: iload 7
      // 120: invokestatic org/lwjgl/opengl/GL30.glRenderbufferStorage (IIII)V
      // 123: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll I
      // 126: aload 4
      // 128: ifnull 162
      // 12b: ifne 142
      // 12e: goto 135
      // 131: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 134: athrow
      // 135: invokestatic org/lwjgl/opengl/GL30.glGenRenderbuffers ()I
      // 138: putstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll I
      // 13b: goto 142
      // 13e: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 141: athrow
      // 142: ldc 36161
      // 144: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll I
      // 147: invokestatic org/lwjgl/opengl/GL30.glBindRenderbuffer (II)V
      // 14a: ldc 36161
      // 14c: ldc 35056
      // 14e: iload 6
      // 150: iload 7
      // 152: invokestatic org/lwjgl/opengl/GL30.glRenderbufferStorage (IIII)V
      // 155: ldc 36161
      // 157: bipush 0
      // 158: invokestatic org/lwjgl/opengl/GL30.glBindRenderbuffer (II)V
      // 15b: iload 6
      // 15d: putstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl I
      // 160: iload 7
      // 162: putstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll I
      // 165: ldc 36160
      // 167: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl I
      // 16a: invokestatic org/lwjgl/opengl/GL30.glBindFramebuffer (II)V
      // 16d: ldc 36160
      // 16f: ldc 36064
      // 171: ldc 36161
      // 173: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI I
      // 176: invokestatic org/lwjgl/opengl/GL30.glFramebufferRenderbuffer (IIII)V
      // 179: ldc 36160
      // 17b: ldc 33306
      // 17d: ldc 36161
      // 17f: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll I
      // 182: invokestatic org/lwjgl/opengl/GL30.glFramebufferRenderbuffer (IIII)V
      // 185: ldc 36160
      // 187: invokestatic org/lwjgl/opengl/GL30.glCheckFramebufferStatus (I)I
      // 18a: istore 9
      // 18c: iload 9
      // 18e: aload 4
      // 190: ifnull 1a7
      // 193: ldc 36053
      // 195: if_icmpne 1aa
      // 198: goto 19f
      // 19b: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19e: athrow
      // 19f: bipush 1
      // 1a0: goto 1a7
      // 1a3: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a6: athrow
      // 1a7: goto 1ab
      // 1aa: bipush 0
      // 1ab: putstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll Z
      // 1ae: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll Z
      // 1b1: aload 4
      // 1b3: ifnull 203
      // 1b6: ifeq 200
      // 1b9: goto 1c0
      // 1bc: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1bf: athrow
      // 1c0: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll I
      // 1c3: aload 4
      // 1c5: ifnull 1fd
      // 1c8: goto 1cf
      // 1cb: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ce: athrow
      // 1cf: ifne 1e6
      // 1d2: goto 1d9
      // 1d5: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d8: athrow
      // 1d9: invokestatic org/lwjgl/opengl/GL30.glGenFramebuffers ()I
      // 1dc: putstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll I
      // 1df: goto 1e6
      // 1e2: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e5: athrow
      // 1e6: bipush 0
      // 1e7: bipush 0
      // 1e8: iload 6
      // 1ea: iload 7
      // 1ec: invokestatic org/lwjgl/opengl/GL11.glViewport (IIII)V
      // 1ef: fconst_0
      // 1f0: fconst_0
      // 1f1: fconst_0
      // 1f2: fconst_0
      // 1f3: invokestatic org/lwjgl/opengl/GL11.glClearColor (FFFF)V
      // 1f6: bipush 0
      // 1f7: invokestatic org/lwjgl/opengl/GL11.glClearStencil (I)V
      // 1fa: sipush 17408
      // 1fd: invokestatic org/lwjgl/opengl/GL11.glClear (I)V
      // 200: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll Z
      // 203: aload 4
      // 205: ifnull 213
      // 208: ifeq 216
      // 20b: goto 212
      // 20e: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 211: athrow
      // 212: bipush 1
      // 213: goto 217
      // 216: bipush 0
      // 217: istore 10
      // 219: iload 10
      // 21b: aload 4
      // 21d: ifnull 2b0
      // 220: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII I
      // 223: if_icmpeq 2ad
      // 226: goto 22d
      // 229: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22c: athrow
      // 22d: iload 10
      // 22f: putstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII I
      // 232: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll Z
      // 235: aload 4
      // 237: ifnull 27d
      // 23a: goto 241
      // 23d: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 240: athrow
      // 241: ifeq 274
      // 244: goto 24b
      // 247: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24a: athrow
      // 24b: fload 5
      // 24d: sipush -27251
      // 250: sipush -22594
      // 253: pop2
      // 254: ldc "[NVG] SSAA("
      // 256: swap
      // 257: sipush -27260
      // 25a: sipush -2202
      // 25d: pop2
      // 25e: ldc "x) FBO ready — smooth AA borders"
      // 260: invokedynamic makeConcatWithConstants (Ljava/lang/String;FLjava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 265: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d (Ljava/lang/String;)V
      // 268: aload 4
      // 26a: ifnonnull 2ad
      // 26d: goto 274
      // 270: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 273: athrow
      // 274: iload 9
      // 276: goto 27d
      // 279: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27c: athrow
      // 27d: bipush 16
      // 27f: invokestatic kotlin/text/CharsKt.checkRadix (I)I
      // 282: invokestatic java/lang/Integer.toString (II)Ljava/lang/String;
      // 285: dup
      // 286: sipush -27262
      // 289: sipush 31604
      // 28c: pop2
      // 28d: ldc "toString(...)"
      // 28f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 292: sipush -27228
      // 295: sipush 1407
      // 298: pop2
      // 299: ldc "[NVG] SSAA FBO incomplete (status=0x"
      // 29b: swap
      // 29c: sipush -27205
      // 29f: sipush 22626
      // 2a2: pop2
      // 2a3: ldc ") — stroke fallback on MC FBO"
      // 2a5: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 2aa: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d (Ljava/lang/String;)V
      // 2ad: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll Z
      // 2b0: aload 4
      // 2b2: ifnull 2c2
      // 2b5: ifeq 2c5
      // 2b8: goto 2bf
      // 2bb: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2be: athrow
      // 2bf: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl I
      // 2c2: goto 2c6
      // 2c5: bipush 0
      // 2c6: ireturn
   }

   public final void b(int param1, int param2, int param3) {
      if (IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll
         && IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl != 0
         && lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll != 0) {
         float var4 = RangesKt.coerceIn(IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll, 1.0F, 3.0F);
         GL30.glBindFramebuffer(36009, lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll);
         GL30.glFramebufferTexture2D(36009, 36064, 3553, param1, 0);
         GL30.glBindFramebuffer(36008, IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl);
         GL30.glBlitFramebuffer(0, 0, (int)((float)param2 * var4), (int)((float)param3 * var4), 0, 0, param2, param3, 16384, 9729);
         GL30.glBindFramebuffer(36160, 0);
      }
      IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = false;
   }

   public final void c() {
      // $VF: Couldn't be decompiled
      Object var3 = null;
      if (!llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI) {
         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = NanoVGGL3.nvgCreate(3);
         if (IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl == -1L) {
            var3 = "Failed to initialize NanoVG";
            throw new IllegalArgumentException(var3.toString());
         }
         NanoVG.nvgSave(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
         NanoVG.nvgFontSize(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, 16.0F);
         ByteBuffer var2 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.c();
         int var4 = NanoVG.nvgCreateFontMem(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, (CharSequence)IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.a(), var2, false);
         ((Map)IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI).put(IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, new lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(var4, var2));
         NanoVG.nvgFontFaceId(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var4);
         NanoVG.nvgBeginPath(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
         NanoVG.nvgText(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, -1000.0F, -1000.0F, (CharSequence)"0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_=+[]{};:'\",.<>?/|\\`~");
         NanoVG.nvgClosePath(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
         NanoVG.nvgRestore(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
         llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = true;
      }
   }

   public final float d() {
      java.lang.String var1 = j();
      net.minecraft.client.Minecraft var2 = net.minecraft.client.Minecraft.getInstance();
      try {
         if (var1 != null && var2.getWindow().getScreenWidth() == 0) {
            return 1.0F;
         }
         return (float) var2.getWindow().getWidth() / (float) var2.getWindow().getScreenWidth();
      } catch (IllegalArgumentException var3) {
         throw (RuntimeException)a(var3);
      }
   }

   public final float e() {
      try {
         short var10000 = -27258;
         short var10001 = 11199;
         String var2 = System.getProperty("os.name");
         short var10002 = -27212;
         short var10003 = 19342;
         Intrinsics.checkNotNullExpressionValue(var2, "getProperty(...)");
         String var3 = var2.toLowerCase(Locale.ROOT);
         var10002 = -27257;
         var10003 = -21490;
         Intrinsics.checkNotNullExpressionValue(var3, "toLowerCase(...)");
         CharSequence var4 = var3;
         var10001 = -27208;
         var10002 = -31842;
         if (StringsKt.contains(var4, "mac", false)) {
            return this.d();
         }
      } catch (IllegalArgumentException var1) {
         throw (RuntimeException)a(var1);
      }

      return 1.0F;
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(float param0, float param1, float param2) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
      if (IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl) {
         throw new IllegalStateException("[NVGRenderer] Already drawing, but called beginFrame");
      }
      float var3 = RangesKt.coerceAtLeast(param2, 0.25F);
      IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var3;
      float var4 = IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll
         ? RangesKt.coerceIn(IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll, 1.0F, 3.0F)
         : 1.0F;
      NanoVG.nvgBeginFrame(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param0 / var3, param1 / var3, var3 * var4);
      NanoVG.nvgTextAlign(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, 9);
      IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = true;
   }

   public final void a(int param1, float param2, float param3, @Nullable int[] param4) {
      this.c();
      if (IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl) {
         throw new IllegalStateException("[NVGRenderer] Already drawing, but called beginFrameWithFBO");
      }
      IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 1.0F;
      GL30.glBindFramebuffer(36160, param1);
      if (param4 != null) {
         GL11.glViewport(param4[0], param4[1], param4[2], param4[3]);
      } else {
         GL11.glViewport(0, 0, (int)param2, (int)param3);
      }
      NanoVG.nvgBeginFrame(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param2, param3, 1.0F);
      NanoVG.nvgTextAlign(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, 9);
      IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = true;
   }

   @JvmStatic
   public static final void f() {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
      if (!IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl) {
         throw new IllegalStateException("[NVGRenderer] Not drawing, but called endFrame");
      }
      NanoVG.nvgEndFrame(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
      IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = false;
   }

   @JvmStatic
   public static final void g() {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
      NanoVG.nvgSave(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
   }

   @JvmStatic
   public static final void h() {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
      NanoVG.nvgRestore(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
   }

   public final void a(float var1, float var2) {
      this.c();
      NanoVG.nvgScale(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var1, var2);
   }

   public final void b(float var1, float var2) {
      this.c();
      NanoVG.nvgTranslate(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var1, var2);
   }

   public final void a(float var1) {
      this.c();
      NanoVG.nvgRotate(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var1);
   }

   public final void b(float var1) {
      this.c();
      NanoVG.nvgGlobalAlpha(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, RangesKt.coerceIn(var1, 0.0F, 1.0F));
   }

   public final void a(float param1, float param2, float param3, float param4) {
      this.c();
      lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll, param1, param2, param3 + param1, param4 + param2);
      if (lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll != null) {
         lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.f();
      }
   }

   public final void i() {
      this.c();
      NanoVG.nvgResetScissor(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var1 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var1 == null ? null : var1.a();
      if (lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll != null) {
         lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.f();
      }
   }

   public final void a(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6
   ) {
      short var10001 = -27216;
      short var10002 = 24901;
      Intrinsics.checkNotNullParameter(var6, "color");
      this.c();
      NanoVG.nvgBeginPath(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
      NanoVG.nvgMoveTo(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var1, var2);
      NanoVG.nvgLineTo(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var3, var4);
      NanoVG.nvgStrokeWidth(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var5);
      this.a(var6);
      NanoVG.nvgStrokeColor(
         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
      );
      NanoVG.nvgStroke(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
   }

   public final void a(
      @NotNull float[] param1, int param2, float param3, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll param4
   ) {
      // $VF: Couldn't be decompiled
      Intrinsics.checkNotNullParameter(param1, "points");
      Intrinsics.checkNotNullParameter(param4, "color");
      this.c();
      if (param2 < 2) {
         return;
      }
      NanoVG.nvgBeginPath(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
      NanoVG.nvgLineCap(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, 1);
      NanoVG.nvgLineJoin(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, 1);
      NanoVG.nvgMoveTo(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param1[0], param1[1]);
      for (int var5 = 1; var5 < param2; var5++) {
         NanoVG.nvgLineTo(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param1[var5 * 2], param1[var5 * 2 + 1]);
      }
      NanoVG.nvgStrokeWidth(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param3);
      this.a(param4);
      NanoVG.nvgStrokeColor(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      NanoVG.nvgStroke(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
      NanoVG.nvgLineCap(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, 0);
      NanoVG.nvgLineJoin(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, 4);
   }

   public final void a(
      @NotNull float[] param1,
      int param2,
      float param3,
      float param4,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll param5,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll param6
   ) {
      // $VF: Couldn't be decompiled
      Intrinsics.checkNotNullParameter(param1, "points");
      Intrinsics.checkNotNullParameter(param5, "top");
      Intrinsics.checkNotNullParameter(param6, "bottom");
      this.c();
      if (param2 < 2) {
         return;
      }
      NanoVG.nvgBeginPath(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
      NanoVG.nvgMoveTo(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param1[0], param4);
      NanoVG.nvgLineTo(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param1[0], param1[1]);
      for (int var7 = 1; var7 < param2; var7++) {
         NanoVG.nvgLineTo(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param1[var7 * 2], param1[var7 * 2 + 1]);
      }
      NanoVG.nvgLineTo(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param1[(param2 - 1) * 2], param4);
      NanoVG.nvgClosePath(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
      this.a(param5, param6, param1[0], param3, 1.0F, param4 - param3, me.octo.client.utils.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      NanoVG.nvgFillPaint(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      NanoVG.nvgFill(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
   }

   private final void a(float[] var1, int var2) {
      String var10000 = j();
      int var4 = 0;
      int var5 = var2 - 1;
      String var3 = var10000;

      while (var4 < var5) {
         int var6 = Math.max(0, var4 - 1) * 2;
         int var7 = var4 * 2;
         int var8 = (var4 + 1) * 2;
         int var9 = Math.min(var2 - 1, var4 + 2) * 2;
         float var10 = var1[var7] + (var1[var8] - var1[var6]) / 6.0F;
         float var11 = var1[var7 + 1] + (var1[var8 + 1] - var1[var6 + 1]) / 6.0F;
         float var12 = var1[var8] - (var1[var9] - var1[var7]) / 6.0F;
         float var13 = var1[var8 + 1] - (var1[var9 + 1] - var1[var7 + 1]) / 6.0F;
         NanoVG.nvgBezierTo(
            IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var10, var11, var12, var13, var1[var8], var1[var8 + 1]
         );
         var4++;
         if (var3 == null) {
            break;
         }
      }
   }

   public final void b(
      @NotNull float[] param1, int param2, float param3, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll param4
   ) {
      // $VF: Couldn't be decompiled
      Intrinsics.checkNotNullParameter(param1, "points");
      Intrinsics.checkNotNullParameter(param4, "color");
      this.c();
      if (param2 < 3) {
         this.a(param1, param2, param3, param4);
         return;
      }
      NanoVG.nvgBeginPath(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
      NanoVG.nvgLineCap(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, 1);
      NanoVG.nvgLineJoin(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, 1);
      NanoVG.nvgMoveTo(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param1[0], param1[1]);
      this.a(param1, param2);
      NanoVG.nvgStrokeWidth(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param3);
      this.a(param4);
      NanoVG.nvgStrokeColor(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      NanoVG.nvgStroke(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
      NanoVG.nvgLineCap(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, 0);
      NanoVG.nvgLineJoin(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, 4);
   }

   public final void b(
      @NotNull float[] param1,
      int param2,
      float param3,
      float param4,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll param5,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll param6
   ) {
      // $VF: Couldn't be decompiled
      Intrinsics.checkNotNullParameter(param1, "points");
      Intrinsics.checkNotNullParameter(param5, "top");
      Intrinsics.checkNotNullParameter(param6, "bottom");
      this.c();
      if (param2 < 3) {
         this.a(param1, param2, param3, param4, param5, param6);
         return;
      }
      NanoVG.nvgBeginPath(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
      NanoVG.nvgMoveTo(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param1[0], param4);
      NanoVG.nvgLineTo(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param1[0], param1[1]);
      this.a(param1, param2);
      NanoVG.nvgLineTo(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param1[(param2 - 1) * 2], param4);
      NanoVG.nvgClosePath(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
      this.a(param5, param6, param1[0], param3, 1.0F, param4 - param3, me.octo.client.utils.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      NanoVG.nvgFillPaint(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      NanoVG.nvgFill(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
   }

   public final void a(
      float param1,
      float param2,
      float param3,
      float param4,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll param5,
      float param6,
      boolean param7
   ) {
      // $VF: Couldn't be decompiled
      Intrinsics.checkNotNullParameter(param5, "color");
      this.c();
      NanoVG.nvgBeginPath(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
      if (param7) {
         NanoVG.nvgMoveTo(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param1, param2 + param4);
         NanoVG.nvgLineTo(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param1 + param3, param2 + param4);
         NanoVG.nvgLineTo(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param1 + param3, param2 + param6);
         NanoVG.nvgArcTo(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param1 + param3, param2, param1 + param3 - param6, param2, param6);
         NanoVG.nvgLineTo(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param1 + param6, param2);
         NanoVG.nvgArcTo(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param1, param2, param1, param2 + param6, param6);
         NanoVG.nvgLineTo(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param1, param2 + param4);
      } else {
         NanoVG.nvgMoveTo(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param1, param2);
         NanoVG.nvgLineTo(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param1 + param3, param2);
         NanoVG.nvgLineTo(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param1 + param3, param2 + param4 - param6);
         NanoVG.nvgArcTo(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param1 + param3, param2 + param4, param1 + param3 - param6, param2 + param4, param6);
         NanoVG.nvgLineTo(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param1 + param6, param2 + param4);
         NanoVG.nvgArcTo(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param1, param2 + param4, param1, param2 + param4 - param6, param6);
      }
      NanoVG.nvgLineTo(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param1, param2);
      NanoVG.nvgClosePath(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
      this.a(param5);
      NanoVG.nvgFillColor(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      NanoVG.nvgFill(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
   }

   @JvmStatic
   public static final float c(float var0) {
      return Math.round(var0 * IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl)
         / IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   }

   @JvmStatic
   public static final void a(
      float var0,
      float var1,
      float var2,
      float var3,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4,
      float var5,
      float var6,
      float var7,
      float var8
   ) {
      short var10001 = -27255;
      short var10002 = 10377;
      Intrinsics.checkNotNullParameter(var4, "color");
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
      float var9 = IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
      float var10 = d(var9, var0);
      float var11 = d(var9, var1);
      float var12 = d(var9, var0 + var2) - var10;
      float var13 = d(var9, var1 + var3) - var11;
      NanoVG.nvgBeginPath(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
      NanoVG.nvgRoundedRectVarying(
         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var10, var11, var12, var13, var5, var8, var7, var6
      );
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var4);
      NanoVG.nvgFillColor(
         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
      );
      NanoVG.nvgFill(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
   }

   @JvmStatic
   public static final void a(
      float var0,
      float var1,
      float var2,
      float var3,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4,
      float var5
   ) {
      short var10001 = -27255;
      short var10002 = 10377;
      Intrinsics.checkNotNullParameter(var4, "color");
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
      a(var0, var1, var2, var3, var4, var5, var5, var5, var5);
   }

   public final void a(
      float var1, float var2, float var3, float var4, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var5
   ) {
      short var10001 = -27255;
      short var10002 = 10377;
      Intrinsics.checkNotNullParameter(var5, "color");
      this.c();
      NanoVG.nvgBeginPath(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
      NanoVG.nvgRect(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var1, var2, var3, var4 + 0.5F);
      this.a(var5);
      NanoVG.nvgFillColor(
         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
      );
      NanoVG.nvgFill(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
   }

   @JvmStatic
   public static final void a(
      float var0,
      float var1,
      float var2,
      float var3,
      float var4,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var5,
      float var6,
      float var7,
      float var8,
      float var9
   ) {
      short var10001 = -27255;
      short var10002 = 10377;
      Intrinsics.checkNotNullParameter(var5, "color");
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var5);
      String var10000 = j();
      float var11 = var0;
      String var10 = var10000;
      float var12 = var1;
      float var13 = var2;
      float var14 = var3;

      label20: {
         try {
            if (var10 == null) {
               return;
            }

            if (!(var4 <= 1.5F)) {
               break label20;
            }
         } catch (IllegalArgumentException var17) {
            throw (RuntimeException)a(var17);
         }

         float var15 = IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
         float var16 = var4 * var15 / 2.0F;
         var11 = b(var15, var16, var0);
         var12 = b(var15, var16, var1);
         var13 = b(var15, var16, var0 + var2) - var11;
         var14 = b(var15, var16, var1 + var3) - var12;
      }

      NanoVG.nvgBeginPath(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
      NanoVG.nvgRoundedRectVarying(
         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var11, var12, var13, var14, var6, var9, var8, var7
      );
      NanoVG.nvgStrokeWidth(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var4);
      NanoVG.nvgStrokeColor(
         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
      );
      NanoVG.nvgStroke(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
   }

   @JvmStatic
   public static final void a(
      float var0,
      float var1,
      float var2,
      float var3,
      float var4,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var5,
      float var6
   ) {
      short var10001 = -27255;
      short var10002 = 10377;
      Intrinsics.checkNotNullParameter(var5, "color");
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
      a(var0, var1, var2, var3, var4, var5, var6, var6, var6, var6);
   }

   public final void a(
      float var1,
      float var2,
      float var3,
      float var4,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var5,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6,
      @NotNull me.octo.client.utils.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var7,
      float var8,
      float var9,
      float var10,
      float var11
   ) {
      short var10001 = -27230;
      short var10002 = -24140;
      Intrinsics.checkNotNullParameter(var5, "color1");
      var10001 = -27226;
      var10002 = 30800;
      Intrinsics.checkNotNullParameter(var6, "color2");
      var10001 = -27224;
      var10002 = 23047;
      Intrinsics.checkNotNullParameter(var7, "gradient");
      this.c();
      NanoVG.nvgBeginPath(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
      NanoVG.nvgRoundedRectVarying(
         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var1, var2, var3, var4, var8, var11, var10, var9
      );
      this.a(var5, var6, var1, var2, var3, var4, var7);
      NanoVG.nvgFillPaint(
         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
      );
      NanoVG.nvgFill(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
   }

   public final void a(
      float var1,
      float var2,
      float var3,
      float var4,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var5,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6,
      @NotNull me.octo.client.utils.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var7,
      float var8
   ) {
      short var10001 = -27229;
      short var10002 = -901;
      Intrinsics.checkNotNullParameter(var5, "color1");
      var10001 = -27254;
      var10002 = 8074;
      Intrinsics.checkNotNullParameter(var6, "color2");
      var10001 = -27252;
      var10002 = -17926;
      Intrinsics.checkNotNullParameter(var7, "gradient");
      this.c();
      this.a(var1, var2, var3, var4, var5, var6, var7, var8, var8, var8, var8);
   }

   public final void a(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var10,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var11
   ) {
      short var10001 = -27256;
      short var10002 = -147;
      Intrinsics.checkNotNullParameter(var10, "innerColor");
      var10001 = -27263;
      var10002 = -15975;
      Intrinsics.checkNotNullParameter(var11, "outerColor");
      this.c();
      float var12 = RangesKt.coerceAtLeast(var8, 0.0F);
      float var13 = RangesKt.coerceAtLeast(var9, var12 + 0.5F);
      NanoVG.nvgRGBA(
         (byte)var10.a(),
         (byte)var10.b(),
         (byte)var10.c(),
         (byte)var10.d(),
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
      );
      NanoVG.nvgRGBA(
         (byte)var11.a(),
         (byte)var11.b(),
         (byte)var11.c(),
         (byte)var11.d(),
         lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
      );
      NanoVG.nvgRadialGradient(
         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
         var6,
         var7,
         var12,
         var13,
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
         lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
      );
      NanoVG.nvgBeginPath(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
      NanoVG.nvgRoundedRect(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var1, var2, var3, var4, var5);
      NanoVG.nvgFillPaint(
         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
      );
      NanoVG.nvgFill(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
   }

   public final void a(
      float param1,
      float param2,
      float param3,
      float param4,
      float param5,
      float param6,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll param7
   ) {
      // $VF: Couldn't be decompiled
      Intrinsics.checkNotNullParameter(param7, "color");
      this.c();
      if (param6 > 0.1F && param3 > 0.5F && param4 > 0.5F) {
         NanoVG.nvgRGBA((byte)param7.a(), (byte)param7.b(), (byte)param7.c(), (byte)param7.d(), IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         NanoVG.nvgRGBA((byte)param7.a(), (byte)param7.b(), (byte)param7.c(), (byte)0, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         NanoVG.nvgBoxGradient(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param1, param2, param3, param4, param5, param6, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         NanoVG.nvgBeginPath(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
         NanoVG.nvgRect(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param1 - param6, param2 - param6, param3 + 2.0F * param6, param4 + 2.0F * param6);
         NanoVG.nvgFillPaint(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         NanoVG.nvgFill(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
      }
   }

   public final void a(float var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.c();
      NanoVG.nvgRGBA((byte)0, (byte)0, (byte)0, (byte)125, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      NanoVG.nvgRGBA((byte)0, (byte)0, (byte)0, (byte)0, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      NanoVG.nvgBoxGradient(
         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
         var1 - var6,
         var2 - var6,
         var3 + 2 * var6,
         var4 + 2 * var6,
         var7 + var6,
         var5,
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
         lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
      );
      NanoVG.nvgBeginPath(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
      NanoVG.nvgRoundedRect(
         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
         var1 - var6 - var5,
         var2 - var6 - var5,
         var3 + 2 * var6 + 2 * var5,
         var4 + 2 * var6 + 2 * var5,
         var7 + var6
      );
      NanoVG.nvgRoundedRect(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var1, var2, var3, var4, var7);
      NanoVG.nvgPathWinding(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, 2);
      NanoVG.nvgFillPaint(
         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
      );
      NanoVG.nvgFill(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
   }

   @JvmStatic
   public static final void a(
      float var0, float var1, float var2, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var3
   ) {
      short var10001 = -27255;
      short var10002 = 10377;
      Intrinsics.checkNotNullParameter(var3, "color");
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
      NanoVG.nvgBeginPath(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
      NanoVG.nvgCircle(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var0, var1, var2);
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var3);
      NanoVG.nvgFillColor(
         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
      );
      NanoVG.nvgFill(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
   }

   @JvmStatic
   public static final void b(
      float var0, float var1, float var2, float var3, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4
   ) {
      short var10001 = -27255;
      short var10002 = 10377;
      Intrinsics.checkNotNullParameter(var4, "color");
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
      NanoVG.nvgBeginPath(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
      NanoVG.nvgCircle(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var0, var1, var2);
      NanoVG.nvgStrokeWidth(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var3);
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var4);
      NanoVG.nvgStrokeColor(
         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
      );
      NanoVG.nvgStroke(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
   }

   @JvmStatic
   public static final void b(
      float var0,
      float var1,
      float var2,
      float var3,
      float var4,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var5,
      float var6
   ) {
      short var10001 = -27255;
      short var10002 = 10377;
      Intrinsics.checkNotNullParameter(var5, "color");
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
      g();
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var0, var1);
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var4 * (float) (Math.PI / 180.0));
      NanoVG.nvgBeginPath(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
      float var7 = var2 / 2.0F;
      float var8 = var3 / 2.0F;
      NanoVG.nvgMoveTo(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, -var7, -var8);
      NanoVG.nvgLineTo(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, 0.0F, var8);
      NanoVG.nvgLineTo(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var7, -var8);
      NanoVG.nvgStrokeWidth(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var6);
      NanoVG.nvgLineCap(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, 1);
      NanoVG.nvgLineJoin(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, 1);
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var5);
      NanoVG.nvgStrokeColor(
         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
      );
      NanoVG.nvgStroke(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
      h();
   }

   @JvmStatic
   public static final void a(
      @NotNull String var0,
      float var1,
      float var2,
      float var3,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4,
      @NotNull IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl var5
   ) {
      short var10001 = -27261;
      short var10002 = -2428;
      Intrinsics.checkNotNullParameter(var0, "text");
      var10001 = -27255;
      var10002 = 10377;
      Intrinsics.checkNotNullParameter(var4, "color");
      var10001 = -27209;
      var10002 = -18281;
      Intrinsics.checkNotNullParameter(var5, "font");
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
      NanoVG.nvgFontSize(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var3);
      NanoVG.nvgFontFaceId(
         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var5)
      );
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var4);
      NanoVG.nvgFillColor(
         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
      );
      NanoVG.nvgText(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var1, var2 + 0.5F, var0);
   }

   @JvmStatic
   public static final void b(
      @NotNull String var0,
      float var1,
      float var2,
      float var3,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4,
      @NotNull IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl var5
   ) {
      short var10001 = -27261;
      short var10002 = -2428;
      Intrinsics.checkNotNullParameter(var0, "text");
      var10001 = -27255;
      var10002 = 10377;
      Intrinsics.checkNotNullParameter(var4, "color");
      var10001 = -27209;
      var10002 = -18281;
      Intrinsics.checkNotNullParameter(var5, "font");
      a(var0, var1 + a(var0, var3, null) * 0.5F, var2, var3, var4, null, 32, null);
   }

   @JvmStatic
   public static final float a(
      @NotNull String param0, float param1, @NotNull IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl param2
   ) {
      String var3 = j();
      Intrinsics.checkNotNullParameter(param0, "text");
      Intrinsics.checkNotNullParameter(param2, "font");
      if (IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl != null) { IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(); }
      int var4 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(param2);
      IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var5 = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(param0, param1, var4);
      Float var6 = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.get(var5);
      if (var3 != null) {
         if (var6 != null) { return var6.floatValue(); }
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
         org.lwjgl.nanovg.NanoVG.nvgFontSize(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param1);
         org.lwjgl.nanovg.NanoVG.nvgFontFaceId(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var4);
      }
      float var7 = org.lwjgl.nanovg.NanoVG.nvgTextBounds(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, 0.0F, 0.0F, (CharSequence)param0, IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll);
      if (var3 != null) {
         if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.size() >= 8192) { lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.clear(); }
         lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.put(var5, Float.valueOf(var7));
      }
      return var7;
   }

   @JvmStatic
   public static final float b(
      @NotNull String var0, float var1, @NotNull IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl var2
   ) {
      short var10001 = -27261;
      short var10002 = -2428;
      Intrinsics.checkNotNullParameter(var0, "text");
      var10001 = -27209;
      var10002 = -18281;
      Intrinsics.checkNotNullParameter(var2, "font");
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
      NanoVG.nvgFontSize(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var1);
      NanoVG.nvgFontFaceId(
         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var2)
      );
      NanoVG.nvgTextBounds(
         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
         0.0F,
         0.0F,
         var0,
         IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
      );
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[3]
         - IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[1];
   }

   @JvmStatic
   public static final void a(
      @NotNull String var0,
      float var1,
      float var2,
      float var3,
      float var4,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var5,
      @NotNull IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl var6,
      float var7
   ) {
      short var10001 = -27261;
      short var10002 = -2428;
      Intrinsics.checkNotNullParameter(var0, "text");
      var10001 = -27255;
      var10002 = 10377;
      Intrinsics.checkNotNullParameter(var5, "color");
      var10001 = -27209;
      var10002 = -18281;
      Intrinsics.checkNotNullParameter(var6, "font");
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
      NanoVG.nvgFontSize(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var4);
      NanoVG.nvgFontFaceId(
         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var6)
      );
      NanoVG.nvgTextAlign(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, 9);
      NanoVG.nvgTextLineHeight(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var7);
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var5);
      NanoVG.nvgFillColor(
         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
      );
      NanoVG.nvgTextBox(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var1, var2, var3, var0);
   }

   @JvmStatic
   @NotNull
   public static final float[] a(
      @NotNull String var0,
      float var1,
      float var2,
      @NotNull IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl var3,
      float var4
   ) {
      short var10001 = -27261;
      short var10002 = -2428;
      Intrinsics.checkNotNullParameter(var0, "text");
      var10001 = -27209;
      var10002 = -18281;
      Intrinsics.checkNotNullParameter(var3, "font");
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
      float[] var5 = new float[4];
      NanoVG.nvgFontSize(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var2);
      NanoVG.nvgFontFaceId(
         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var3)
      );
      NanoVG.nvgTextLineHeight(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var4);
      NanoVG.nvgTextBoxBounds(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, 0.0F, 0.0F, var1, var0, var5);
      return var5;
   }

   public final int a(@NotNull IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl var1) {
      short var10001 = -27209;
      short var10002 = -18281;
      Intrinsics.checkNotNullParameter(var1, "font");
      this.c();
      Map var2 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      boolean var4 = false;
      Object var5 = var2.get(var1);
      Object var10000;
      if (var5 == null) {
         boolean var6 = false;
         ByteBuffer var7 = var1.c();
         lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var8 = new lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            NanoVG.nvgCreateFontMem(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var1.a(), var7, false), var7
         );
         var2.put(var1, var8);
         var10000 = var8;
      } else {
         var10000 = var5;
      }

      return ((lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000)
         .a();
   }

   public final void a(@NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1) {
      short var10001 = -27255;
      short var10002 = 10377;
      Intrinsics.checkNotNullParameter(var1, "color");
      this.c();
      NanoVG.nvgRGBA(
         (byte)var1.a(), (byte)var1.b(), (byte)var1.c(), (byte)var1.d(), IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
      );
   }

   private final void a(
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1,
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var2
   ) {
      this.c();
      NanoVG.nvgRGBA(
         (byte)var1.a(), (byte)var1.b(), (byte)var1.c(), (byte)var1.d(), IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
      );
      NanoVG.nvgRGBA(
         (byte)var2.a(), (byte)var2.b(), (byte)var2.c(), (byte)var2.d(), lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
      );
   }

   private final void a(
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1,
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var2,
      float var3,
      float var4,
      float var5,
      float var6,
      me.octo.client.utils.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var7
   ) {
      Object llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll = null; // PX-FIX
      try {
         this.c();
         this.a(var1, var2);
         switch (lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl[var7.ordinal()]) {
            case 1:
               NanoVG.nvgLinearGradient(
                  IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
                  var3,
                  var4,
                  var3 + var5,
                  var4,
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               );
               return;
            case 2:
               break;
            default:
               throw new NoWhenBranchMatchedException();
         }
      } catch (IllegalArgumentException var8) {
         throw (RuntimeException)a(var8);
      }

      NanoVG.nvgLinearGradient(
         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
         var3,
         var4,
         var3,
         var4 + var6,
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
         lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
      );
   }

   public final void a(
      @NotNull llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII param1,
      float param2,
      float param3,
      float param4,
      float param5,
      float param6,
      float param7,
      float param8,
      float param9
   ) {
      // $VF: Couldn't be decompiled
      Intrinsics.checkNotNullParameter(param1, "image");
      this.c();
      int var10 = this.a(param1);
      if (var10 > 0) {
         NanoVG.nvgImagePattern(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param2, param3, param4, param5, 0.0F, var10, 1.0F, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         NanoVG.nvgBeginPath(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
         NanoVG.nvgRoundedRectVarying(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param2, param3, param4, param5, param6, param9, param8, param7);
         NanoVG.nvgFillPaint(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         NanoVG.nvgFill(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
      }
   }

   private final int a(int param1, int param2, int param3, ByteBuffer param4) {
      String var5 = this.j();
      if (param1 < 1) {
         return 0;
      }

      if (param2 < 1) {
         return 0;
      }

      if (param4.remaining() < (long) param1 * (long) param2 * 4L) {
         return 0;
      }

      return org.lwjgl.nanovg.NanoVG.nvgCreateImageRGBA(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param1, param2, param3, param4);
   }

   public final int e(@NotNull String resourcePath) {
      Intrinsics.checkNotNullParameter(resourcePath, "resourcePath");
      String var2 = j();
      this.c();
      Integer var3 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.get(resourcePath);
      if (var3 != null) {
         return var3.intValue();
      }
      llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII var4 = this.a(resourcePath);
      if (var4 == null) {
         return 0;
      }
      int[] var5 = new int[1];
      int[] var6 = new int[1];
      int[] var7 = new int[1];
      ByteBuffer var8 = STBImage.stbi_load_from_memory(var4.d(), var5, var6, var7, 4);
      if (var8 == null) {
         return 0;
      }
      int var9 = var5[0];
      int var10 = var6[0];
      int var11 = 4;
      int var12 = var9 * var11;
      int var13 = var10 * var11;
      if (var9 < 1 || var10 < 1) {
         STBImage.stbi_image_free(var8);
         return 0;
      }
      ByteBuffer var14 = MemoryUtil.memAlloc(var12 * var13 * 4);
      Intrinsics.checkNotNullExpressionValue(var14, "memAlloc(...)");
      for (int var15 = 0; var15 < var13; var15++) {
         int var16 = var15 / var11;
         for (int var17 = 0; var17 < var12; var17++) {
            int var18 = var17 / var11;
            int var19 = (var16 * var9 + var18) * 4;
            int var20 = (var15 * var12 + var17) * 4;
            var14.put(var20, var8.get(var19));
            var14.put(var20 + 1, var8.get(var19 + 1));
            var14.put(var20 + 2, var8.get(var19 + 2));
            var14.put(var20 + 3, var8.get(var19 + 3));
         }
      }
      int var21 = this.a(var12, var13, 1, var14);
      if (var21 > 0) {
         lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.put(resourcePath, var21);
      }
      STBImage.stbi_image_free(var8);
      MemoryUtil.memFree(var14);
      return var21;
   }

   private final llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII a(String var1) {
      llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII var2;
      try {
         Map var8 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
         boolean var4 = false;
         Object var5 = var8.get(var1);
         Object var10000;
         if (var5 == null) {
            boolean var6 = false;
            llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII var9 = new llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII(
               var1, false, null, null, 14, null
            );
            var8.put(var1, var9);
            var10000 = var9;
         } else {
            var10000 = var5;
         }

         var2 = (llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII)var10000;
      } catch (Throwable var7) {
         var2 = null;
      }

      return var2;
   }

   private final llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII b(String param1) {
      String var2 = j();
      if (var2 == null) {
         return null;
      }

      var var3 = this.a(param1);
      if (var3 == null) {
         return null;
      }

      var var4 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.get(var3);
      if (var2 != null && var4 != null) {
         var4.a(var4.a() + 1);
         return var4.b() > 0 ? var3 : null;
      }

      int var5;
      try {
         var5 = var3.b() ? this.c(var3) : this.b(var3);
      } catch (Throwable var6) {
         var5 = 0;
      }

      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.put(var3, new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(1, var5));
      return var5 > 0 ? var3 : null;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.j ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 2
      // 05: ifnull 20
      // 08: aload 0
      // 09: aload 1
      // 0a: invokespecial me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/String;)Lme/octo/client/utils/llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII;
      // 0d: dup
      // 0e: ifnonnull 22
      // 11: goto 18
      // 14: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: pop
      // 19: goto 20
      // 1c: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: aconst_null
      // 21: areturn
      // 22: astore 3
      // 23: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Ljava/util/HashMap;
      // 26: aload 3
      // 27: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 2a: checkcast me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
      // 2d: astore 4
      // 2f: aload 2
      // 30: ifnull 69
      // 33: aload 4
      // 35: ifnull 68
      // 38: goto 3f
      // 3b: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e: athrow
      // 3f: aload 4
      // 41: astore 6
      // 43: bipush 0
      // 44: istore 7
      // 46: aload 6
      // 48: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()I
      // 4b: istore 8
      // 4d: aload 6
      // 4f: iload 8
      // 51: bipush 1
      // 52: iadd
      // 53: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (I)V
      // 56: aload 6
      // 58: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b ()I
      // 5b: ifle 66
      // 5e: aload 3
      // 5f: goto 67
      // 62: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 65: athrow
      // 66: aconst_null
      // 67: areturn
      // 68: nop
      // 69: aload 3
      // 6a: invokevirtual me/octo/client/utils/llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.b ()Z
      // 6d: aload 2
      // 6e: ifnull 87
      // 71: ifeq 8a
      // 74: goto 7b
      // 77: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7a: athrow
      // 7b: aload 0
      // 7c: aload 3
      // 7d: invokespecial me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.c (Lme/octo/client/utils/llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII;)I
      // 80: goto 87
      // 83: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 86: athrow
      // 87: goto 8f
      // 8a: aload 0
      // 8b: aload 3
      // 8c: invokespecial me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b (Lme/octo/client/utils/llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII;)I
      // 8f: istore 5
      // 91: goto 99
      // 94: astore 6
      // 96: bipush 0
      // 97: istore 5
      // 99: iload 5
      // 9b: istore 4
      // 9d: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Ljava/util/HashMap;
      // a0: checkcast java/util/Map
      // a3: aload 3
      // a4: new me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
      // a7: dup
      // a8: bipush 1
      // a9: iload 4
      // ab: invokespecial me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.<init> (II)V
      // ae: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // b3: pop
      // b4: iload 4
      // b6: ifle c1
      // b9: aload 3
      // ba: goto c2
      // bd: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c0: athrow
      // c1: aconst_null
      // c2: areturn
   }

   public final void a(@NotNull String param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, float param9) {
      // $VF: Couldn't be decompiled
      Intrinsics.checkNotNullParameter(param1, "resourcePath");
      this.c();
      llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII var10 = this.b(param1);
      if (var10 != null) {
         this.a(var10, param2, param3, param4, param5, param6, param7, param8, param9);
      }
   }

   public final void a(
      @NotNull String param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, float param9, float param10
   ) {
      // $VF: Couldn't be decompiled
      Intrinsics.checkNotNullParameter(param1, "resourcePath");
      this.c();
      llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII var11 = this.b(param1);
      if (var11 != null) {
         this.a(var11, param2, param3, param4, param5, param6, param7, param8, param9, param10);
      }
   }

   public final void a(
      @NotNull llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII param1,
      float param2,
      float param3,
      float param4,
      float param5,
      float param6,
      float param7,
      float param8,
      float param9,
      float param10
   ) {
      // $VF: Couldn't be decompiled
      Intrinsics.checkNotNullParameter(param1, "image");
      this.c();
      int var11 = this.a(param1);
      if (var11 > 0) {
         NanoVG.nvgImagePattern(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param2, param3, param4, param5, 0.0F, var11, param10, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         NanoVG.nvgBeginPath(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
         NanoVG.nvgRoundedRectVarying(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param2, param3, param4, param5, param6, param9, param8, param7);
         NanoVG.nvgFillPaint(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         NanoVG.nvgFill(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
      }
   }

   private final int a(llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII param1) {
      int n;
      block5: {
         block4: {
            String string = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.j();
            this.c();
            String string2 = string;
            try {
               IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
               {
                  if (string2 == null || (illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.get(param1)) == null) break block4;
               }
               n = illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
               break block5;
            }
            catch (IllegalArgumentException illegalArgumentException) {
               throw (RuntimeException)lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(illegalArgumentException);
            }
         }
         n = 0;
      }
      return n;
   }

   public final int c(@NotNull String param1) {
      Intrinsics.checkNotNullParameter(param1, "resourcePath");
      String var2 = j();
      this.c();
      me.octo.client.utils.llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII var3 = this.a(param1);
      if (var3 == null) {
         return 0;
      }
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var4 = (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.get(var3);
      if (var4 != null) {
         int var5 = var4.a();
         var4.a(var5 + 1);
         return var4.b();
      }
      int var6;
      try {
         if (var3.b()) {
            var6 = this.c(var3);
         } else {
            var6 = this.b(var3);
         }
      } catch (Throwable var7) {
         var6 = 0;
      }
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.put(var3, new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(1, var6));
      return var6;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.j ()Ljava/lang/String;
      // 03: aload 1
      // 04: sipush -27204
      // 07: sipush -29745
      // 0a: pop2
      // 0b: ldc_w "resourcePath"
      // 0e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 11: aload 0
      // 12: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.c ()V
      // 15: astore 2
      // 16: aload 2
      // 17: ifnull 32
      // 1a: aload 0
      // 1b: aload 1
      // 1c: invokespecial me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/String;)Lme/octo/client/utils/llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII;
      // 1f: dup
      // 20: ifnonnull 34
      // 23: goto 2a
      // 26: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: pop
      // 2b: goto 32
      // 2e: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: bipush 0
      // 33: ireturn
      // 34: astore 3
      // 35: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Ljava/util/HashMap;
      // 38: aload 3
      // 39: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 3c: checkcast me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
      // 3f: astore 4
      // 41: aload 2
      // 42: ifnull 6f
      // 45: aload 4
      // 47: ifnull 6e
      // 4a: goto 51
      // 4d: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 50: athrow
      // 51: aload 4
      // 53: astore 6
      // 55: bipush 0
      // 56: istore 7
      // 58: aload 6
      // 5a: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()I
      // 5d: istore 8
      // 5f: aload 6
      // 61: iload 8
      // 63: bipush 1
      // 64: iadd
      // 65: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (I)V
      // 68: aload 6
      // 6a: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b ()I
      // 6d: ireturn
      // 6e: nop
      // 6f: aload 3
      // 70: invokevirtual me/octo/client/utils/llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.b ()Z
      // 73: aload 2
      // 74: ifnull 8d
      // 77: ifeq 90
      // 7a: goto 81
      // 7d: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 80: athrow
      // 81: aload 0
      // 82: aload 3
      // 83: invokespecial me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.c (Lme/octo/client/utils/llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII;)I
      // 86: goto 8d
      // 89: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8c: athrow
      // 8d: goto 95
      // 90: aload 0
      // 91: aload 3
      // 92: invokespecial me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b (Lme/octo/client/utils/llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII;)I
      // 95: istore 5
      // 97: goto 9f
      // 9a: astore 6
      // 9c: bipush 0
      // 9d: istore 5
      // 9f: iload 5
      // a1: istore 4
      // a3: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Ljava/util/HashMap;
      // a6: checkcast java/util/Map
      // a9: aload 3
      // aa: new me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
      // ad: dup
      // ae: bipush 1
      // af: iload 4
      // b1: invokespecial me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.<init> (II)V
      // b4: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // b9: pop
      // ba: iload 4
      // bc: ireturn
   }

   public final int d(@NotNull String param1) {
      int n;
      block23: {
         int n2;
         block24: {
            int n3;
            ByteBuffer byteBuffer;
            int[] nArray;
            int[] nArray2;
            String string2;
            block20: {
               block21: {
                  llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII2;
                  Object object;
                  block19: {
                     Number number;
                     block18: {
                        String string3 = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.j();
                        Intrinsics.checkNotNullParameter((Object)param1, (String)"resourcePath");
                        string2 = string3;
                        this.c();
                        object = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.get(param1);
                        number = (Number)object;
                        if (string2 == null) break block18;
                        try {
                           block25: {
                              if (number == null) break block19;
                              break block25;
                           }
                           number = (Number)object;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                           throw (RuntimeException)lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(illegalArgumentException);
                        }
                     }
                     int n4 = number.intValue();
                     boolean bl = false;
                     return n4;
                  }
                  try {
                     if ((llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII2 = this.a(param1)) == null) {
                        return 0;
                     }
                  }
                  catch (IllegalArgumentException illegalArgumentException) {
                     throw (RuntimeException)lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(illegalArgumentException);
                  }
                  object = llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII2;
                  nArray2 = new int[1];
                  nArray = new int[1];
                  int[] nArray3 = new int[1];
                  if (string2 == null) break block21;
                  try {
                     if ((byteBuffer = STBImage.stbi_load_from_memory((ByteBuffer)((llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII)object).d(), (int[])nArray2, (int[])nArray, (int[])nArray3, (int)4)) != null) break block20;
                     break block21;
                  }
                  catch (IllegalArgumentException illegalArgumentException) {
                     throw (RuntimeException)lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(illegalArgumentException);
                  }
               }
               return 0;
            }
            ByteBuffer byteBuffer2 = byteBuffer;
            try {
               n3 = this.a(nArray2[0], nArray[0], 32, byteBuffer2);
            }
            finally {
               STBImage.stbi_image_free((ByteBuffer)byteBuffer2);
            }
            n2 = n3;
            try {
               {
                  n = n2;
                  if (string2 == null) break block23;
                  if (n <= 0) break block24;
               }
               ((Map)llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI).put(param1, n2);
            }
            catch (IllegalArgumentException illegalArgumentException) {
               throw (RuntimeException)lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(illegalArgumentException);
            }
         }
         n = n2;
      }
      return n;
   }

   private final int c(llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII param1) {
      String var2 = j();
      this.c();
      java.io.InputStream var4 = param1.c();
      Throwable var5 = null;
      String var3 = null;
      try {
         int var11 = 8192;
         java.io.Reader var10 = (java.io.Reader)new java.io.InputStreamReader(var4, Charsets.UTF_8);
         java.io.Reader var12 = var10 instanceof java.io.BufferedReader ? var10 : (java.io.Reader)new java.io.BufferedReader(var10, var11);
         var3 = TextStreamsKt.readText(var12);
      } finally {
         CloseableKt.closeFinally(var4, var5);
      }
      NSVGImage var13 = NanoSVG.nsvgParse(var3, "px", 96.0f);
      if (var13 == null) {
         return 0;
      }
      int var14 = (int)var13.width();
      int var15 = (int)var13.height();
      if (var14 < 1 || var15 < 1) {
         NanoSVG.nsvgDelete(var13);
         return 0;
      }
      ByteBuffer var16 = MemoryUtil.memAlloc(var14 * var15 * 4);
      try {
         long var8 = NanoSVG.nsvgCreateRasterizer();
         NanoSVG.nsvgRasterize(var8, var13, 0.0f, 0.0f, 1.0f, var16, var14, var15, var14 * 4);
         int var9 = this.a(var14, var15, 0, var16);
         NanoSVG.nsvgDeleteRasterizer(var8);
         return var9;
      } finally {
         NanoSVG.nsvgDelete(var13);
         MemoryUtil.memFree(var16);
      }
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.j ()Ljava/lang/String;
      // 003: aload 0
      // 004: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.c ()V
      // 007: aload 1
      // 008: invokevirtual me/octo/client/utils/llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.c ()Ljava/io/InputStream;
      // 00b: checkcast java/io/Closeable
      // 00e: astore 4
      // 010: astore 2
      // 011: aconst_null
      // 012: astore 5
      // 014: nop
      // 015: aload 4
      // 017: checkcast java/io/InputStream
      // 01a: astore 6
      // 01c: bipush 0
      // 01d: istore 7
      // 01f: aload 6
      // 021: astore 8
      // 023: getstatic kotlin/text/Charsets.UTF_8 Ljava/nio/charset/Charset;
      // 026: astore 9
      // 028: new java/io/InputStreamReader
      // 02b: dup
      // 02c: aload 8
      // 02e: aload 9
      // 030: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
      // 033: checkcast java/io/Reader
      // 036: astore 10
      // 038: sipush 8192
      // 03b: istore 11
      // 03d: aload 10
      // 03f: aload 2
      // 040: ifnull 059
      // 043: instanceof java/io/BufferedReader
      // 046: ifeq 05f
      // 049: goto 050
      // 04c: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04f: athrow
      // 050: aload 10
      // 052: goto 059
      // 055: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 058: athrow
      // 059: checkcast java/io/BufferedReader
      // 05c: goto 06a
      // 05f: new java/io/BufferedReader
      // 062: dup
      // 063: aload 10
      // 065: iload 11
      // 067: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;I)V
      // 06a: checkcast java/io/Reader
      // 06d: invokestatic kotlin/io/TextStreamsKt.readText (Ljava/io/Reader;)Ljava/lang/String;
      // 070: astore 6
      // 072: aload 4
      // 074: aload 5
      // 076: invokestatic kotlin/io/CloseableKt.closeFinally (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 079: aload 6
      // 07b: goto 093
      // 07e: astore 7
      // 080: aload 7
      // 082: astore 5
      // 084: aload 7
      // 086: athrow
      // 087: astore 7
      // 089: aload 4
      // 08b: aload 5
      // 08d: invokestatic kotlin/io/CloseableKt.closeFinally (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 090: aload 7
      // 092: athrow
      // 093: astore 3
      // 094: aload 2
      // 095: ifnull 0c2
      // 098: aload 3
      // 099: checkcast java/lang/CharSequence
      // 09c: sipush -27250
      // 09f: sipush -20401
      // 0a2: pop2
      // 0a3: ldc_w "px"
      // 0a6: checkcast java/lang/CharSequence
      // 0a9: ldc_w 96.0
      // 0ac: invokestatic org/lwjgl/nanovg/NanoSVG.nsvgParse (Ljava/lang/CharSequence;Ljava/lang/CharSequence;F)Lorg/lwjgl/nanovg/NSVGImage;
      // 0af: dup
      // 0b0: ifnonnull 0c4
      // 0b3: goto 0ba
      // 0b6: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b9: athrow
      // 0ba: pop
      // 0bb: goto 0c2
      // 0be: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c1: athrow
      // 0c2: bipush 0
      // 0c3: ireturn
      // 0c4: astore 4
      // 0c6: aload 4
      // 0c8: invokevirtual org/lwjgl/nanovg/NSVGImage.width ()F
      // 0cb: f2i
      // 0cc: istore 5
      // 0ce: aload 4
      // 0d0: invokevirtual org/lwjgl/nanovg/NSVGImage.height ()F
      // 0d3: f2i
      // 0d4: istore 6
      // 0d6: iload 5
      // 0d8: aload 2
      // 0d9: ifnull 10c
      // 0dc: bipush 1
      // 0dd: if_icmplt 0ff
      // 0e0: goto 0e7
      // 0e3: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e6: athrow
      // 0e7: iload 6
      // 0e9: bipush 1
      // 0ea: aload 2
      // 0eb: ifnull 113
      // 0ee: goto 0f5
      // 0f1: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f4: athrow
      // 0f5: if_icmpge 10d
      // 0f8: goto 0ff
      // 0fb: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fe: athrow
      // 0ff: aload 4
      // 101: invokestatic org/lwjgl/nanovg/NanoSVG.nsvgDelete (Lorg/lwjgl/nanovg/NSVGImage;)V
      // 104: bipush 0
      // 105: goto 10c
      // 108: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10b: athrow
      // 10c: ireturn
      // 10d: iload 5
      // 10f: iload 6
      // 111: imul
      // 112: bipush 4
      // 113: imul
      // 114: invokestatic org/lwjgl/system/MemoryUtil.memAlloc (I)Ljava/nio/ByteBuffer;
      // 117: dup
      // 118: sipush -27223
      // 11b: sipush -25480
      // 11e: pop2
      // 11f: ldc_w "memAlloc(...)"
      // 122: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 125: astore 7
      // 127: nop
      // 128: invokestatic org/lwjgl/nanovg/NanoSVG.nsvgCreateRasterizer ()J
      // 12b: lstore 8
      // 12d: lload 8
      // 12f: aload 4
      // 131: fconst_0
      // 132: fconst_0
      // 133: fconst_1
      // 134: aload 7
      // 136: iload 5
      // 138: iload 6
      // 13a: iload 5
      // 13c: bipush 4
      // 13d: imul
      // 13e: invokestatic org/lwjgl/nanovg/NanoSVG.nsvgRasterize (JLorg/lwjgl/nanovg/NSVGImage;FFFLjava/nio/ByteBuffer;III)V
      // 141: aload 0
      // 142: iload 5
      // 144: iload 6
      // 146: bipush 0
      // 147: aload 7
      // 149: invokespecial me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (IIILjava/nio/ByteBuffer;)I
      // 14c: istore 10
      // 14e: lload 8
      // 150: invokestatic org/lwjgl/nanovg/NanoSVG.nsvgDeleteRasterizer (J)V
      // 153: iload 10
      // 155: istore 11
      // 157: aload 4
      // 159: invokestatic org/lwjgl/nanovg/NanoSVG.nsvgDelete (Lorg/lwjgl/nanovg/NSVGImage;)V
      // 15c: aload 7
      // 15e: invokestatic org/lwjgl/system/MemoryUtil.memFree (Ljava/nio/ByteBuffer;)V
      // 161: iload 11
      // 163: ireturn
      // 164: astore 9
      // 166: aload 4
      // 168: invokestatic org/lwjgl/nanovg/NanoSVG.nsvgDelete (Lorg/lwjgl/nanovg/NSVGImage;)V
      // 16b: aload 7
      // 16d: invokestatic org/lwjgl/system/MemoryUtil.memFree (Ljava/nio/ByteBuffer;)V
      // 170: aload 9
      // 172: athrow
   }

   public final void d(@NotNull llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII param1) {
      // $VF: Couldn't be decompiled
      Intrinsics.checkNotNullParameter(param1, "image");
      this.c();
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var2 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.get(param1);
      if (var2 != null) {
         int var3 = var2.a();
         var2.a(var3 - 1);
         if (var2.a() == 0) {
            NanoVG.nvgDeleteImage(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var2.b());
            lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.remove(param1);
            IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.remove(param1.a());
         }
      }
   }

   public final void a(
      @NotNull String param1,
      float param2,
      float param3,
      float param4,
      float param5,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll param6,
      float param7,
      float param8,
      float param9,
      float param10,
      float param11
   ) {
      // $VF: Couldn't be decompiled
      Intrinsics.checkNotNullParameter(param1, "resourcePath");
      Intrinsics.checkNotNullParameter(param6, "color");
      this.c();
      llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII var12 = this.b(param1);
      if (var12 != null) {
         this.a(var12, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11);
      }
   }

   public final void a(
      @NotNull llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII param1,
      float param2,
      float param3,
      float param4,
      float param5,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll param6,
      float param7,
      float param8,
      float param9,
      float param10,
      float param11
   ) {
      // $VF: Couldn't be decompiled
      Intrinsics.checkNotNullParameter(param1, "image");
      Intrinsics.checkNotNullParameter(param6, "color");
      this.c();
      int var12 = this.a(param1);
      if (var12 > 0) {
         NanoVG.nvgImagePattern(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param2, param3, param4, param5, 0.0F, var12, param11, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.innerColor().r(param6.q());
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.innerColor().g(param6.r());
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.innerColor().b(param6.s());
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.innerColor().a(param6.t() * param11);
         NanoVG.nvgBeginPath(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
         NanoVG.nvgRoundedRectVarying(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param2, param3, param4, param5, param7, param10, param9, param8);
         NanoVG.nvgFillPaint(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         NanoVG.nvgFill(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
      }
   }

   public final void a(
      @NotNull String var1,
      float var2,
      float var3,
      float var4,
      float var5,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6,
      float var7,
      float var8
   ) {
      short var10001 = -27204;
      short var10002 = -29745;
      Intrinsics.checkNotNullParameter(var1, "resourcePath");
      var10001 = -27255;
      var10002 = 10377;
      Intrinsics.checkNotNullParameter(var6, "color");
      this.c();
      this.a(var1, var2, var3, var4, var5, var6, var7, var7, var7, var7, var8);
   }

   public final void a(@NotNull String var1, float var2, float var3, float var4, float var5, int var6, float var7, float var8) {
      short var10001 = -27204;
      short var10002 = -29745;
      Intrinsics.checkNotNullParameter(var1, "resourcePath");
      this.c();
      this.a(var1, var2, var3, var4, var5, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var6), var7, var8);
   }

   public final void a(
      @NotNull String var1,
      float var2,
      float var3,
      float var4,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var5,
      float var6
   ) {
      short var10001 = -27204;
      short var10002 = -29745;
      Intrinsics.checkNotNullParameter(var1, "resourcePath");
      var10001 = -27255;
      var10002 = 10377;
      Intrinsics.checkNotNullParameter(var5, "color");
      this.c();
      this.a(var1, var2, var3, var4, var4, var5, 0.0F, var6);
   }

   public final void b(
      @NotNull String var1,
      float var2,
      float var3,
      float var4,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var5,
      float var6
   ) {
      short var10001 = -27207;
      short var10002 = 5387;
      Intrinsics.checkNotNullParameter(var1, "svgContent");
      var10001 = -27255;
      var10002 = 10377;
      Intrinsics.checkNotNullParameter(var5, "color");
      this.c();
      this.b(var1, var2, var3, var4, var4, var5, 0.0F, var6);
   }

   public final void b(
      @NotNull String var1,
      float var2,
      float var3,
      float var4,
      float var5,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6,
      float var7,
      float var8
   ) {
      short var10001 = -27218;
      short var10002 = 14323;
      Intrinsics.checkNotNullParameter(var1, "svgContent");
      var10001 = -27255;
      var10002 = 10377;
      Intrinsics.checkNotNullParameter(var6, "color");
      this.c();
      Map var10 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      Integer var11 = var1.hashCode();
      boolean var12 = false;
      Object var13 = var10.get(var11);
      Object var10000;
      if (var13 == null) {
         boolean var14 = false;
         lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var15 = new lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            0, IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.f(var1)
         );
         var10.put(var11, var15);
         var10000 = var15;
      } else {
         var10000 = var13;
      }

      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var9 = (lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
      this.a(var9.b(), var2, var3, var4, var5, var6, var7, var8);
   }

   private final int f(String param1) {
      NSVGImage nSVGImage;
      String string2;
      block9: {
         block8: {
            String string3 = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.j();
            this.c();
            string2 = string3;
            if (string2 == null) break block8;
            try {
               if ((nSVGImage = NanoSVG.nsvgParse((CharSequence)param1, (CharSequence)"px", (float)96.0f)) != null) break block9;
               break block8;
            }
            catch (IllegalArgumentException illegalArgumentException) {
               throw (RuntimeException)lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(illegalArgumentException);
            }
         }
         throw new IllegalStateException("Failed to parse SVG content");
      }
      NSVGImage nSVGImage2 = nSVGImage;
      float f = 2.0f;
      int n = (int)(nSVGImage2.width() * f);
      int n2 = (int)(nSVGImage2.height() * f);
      ByteBuffer byteBuffer = MemoryUtil.memAlloc((int)(n * n2 * 4));
      Intrinsics.checkNotNullExpressionValue((Object)byteBuffer, (String)"memAlloc(...)");
      ByteBuffer byteBuffer2 = byteBuffer;
      try {
         long l = NanoSVG.nsvgCreateRasterizer();
         NanoSVG.nsvgRasterize((long)l, (NSVGImage)nSVGImage2, (float)0.0f, (float)0.0f, (float)f, (ByteBuffer)byteBuffer2, (int)n, (int)n2, (int)(n * 4));
         int n3 = n * n2 * 4;
         for (int i = 0; i < n3; i += 4) {
            byteBuffer2.put(i, (byte)-1);
            byteBuffer2.put(i + 1, (byte)-1);
            byteBuffer2.put(i + 2, (byte)-1);
            if (string2 != null) continue;
         }
         int n4 = NanoVG.nvgCreateImageRGBA((long)IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, (int)n, (int)n2, (int)1, (ByteBuffer)byteBuffer2);
         NanoSVG.nsvgDeleteRasterizer((long)l);
         int n5 = n4;
         return n5;
      }
      finally {
         NanoSVG.nsvgDelete((NSVGImage)nSVGImage2);
         MemoryUtil.memFree((ByteBuffer)byteBuffer2);
      }
   }

   private final void a(
      int param1,
      float param2,
      float param3,
      float param4,
      float param5,
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll param6,
      float param7,
      float param8
   ) {
      // $VF: Couldn't be decompiled
      this.c();
      NanoVG.nvgImagePattern(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param2, param3, param4, param5, 0.0F, param1, param8, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.innerColor().r(param6.q());
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.innerColor().g(param6.r());
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.innerColor().b(param6.s());
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.innerColor().a(param6.t() * param8);
      NanoVG.nvgBeginPath(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
      if (param7 > 0.0F) {
         NanoVG.nvgRoundedRect(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param2, param3, param4, param5, param7);
      } else {
         NanoVG.nvgRect(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, param2, param3, param4, param5);
      }
      NanoVG.nvgFillPaint(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      NanoVG.nvgFill(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
   }

   @JvmStatic
   public static final void c(
      float var0,
      float var1,
      float var2,
      float var3,
      float var4,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var5,
      float var6
   ) {
      short var10001 = -27255;
      short var10002 = 10377;
      Intrinsics.checkNotNullParameter(var5, "color");
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
      float var7 = var2 - var0;
      float var8 = var3 - var1;
      a(var0, var1, var7, var8, var4, var5, var6);
   }

   @JvmStatic
   public static final void b(
      float var0,
      float var1,
      float var2,
      float var3,
      float var4,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var5,
      float var6,
      float var7,
      float var8,
      float var9
   ) {
      short var10001 = -27255;
      short var10002 = 10377;
      Intrinsics.checkNotNullParameter(var5, "color");
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
      float var10 = var2 - var0;
      float var11 = var3 - var1;
      a(var0, var1, var10, var11, var4, var5, var6, var7, var8, var9);
   }

   @JvmStatic
   public static final void a(float var0, float var1, float var2, float var3, float var4, int var5, float var6) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
      float var7 = var2 - var0;
      float var8 = var3 - var1;
      b(var0, var1, var7, var8, var4, var5, var6);
   }

   @JvmStatic
   public static final void a(float var0, float var1, float var2, float var3, float var4, int var5, float var6, float var7, float var8, float var9) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
      float var10 = var2 - var0;
      float var11 = var3 - var1;
      b(var0, var1, var10, var11, var4, var5, var6, var7, var8, var9);
   }

   @JvmStatic
   public static final void a(float var0, float var1, float var2, float var3, int var4, float var5, float var6, float var7, float var8) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
      a(var0, var1, var2, var3, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var4), var5, var6, var7, var8);
   }

   @JvmStatic
   public static final void a(float var0, float var1, float var2, float var3, int var4, float var5) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
      a(var0, var1, var2, var3, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var4), var5);
   }

   @JvmStatic
   public static final void a(float var0, float var1, float var2, float var3, int var4) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
         var0, var1, var2, var3, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var4)
      );
   }

   @JvmStatic
   public static final void b(float var0, float var1, float var2, float var3, float var4, int var5, float var6, float var7, float var8, float var9) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
      a(var0, var1, var2, var3, var4, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var5), var6, var7, var8, var9);
   }

   @JvmStatic
   public static final void b(float var0, float var1, float var2, float var3, float var4, int var5, float var6) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
      a(var0, var1, var2, var3, var4, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var5), var6);
   }

   @JvmStatic
   public static final void a(float var0, float var1, float var2, int var3) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
      a(var0, var1, var2, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var3));
   }

   @JvmStatic
   public static final void b(float var0, float var1, float var2, float var3, int var4) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
      b(var0, var1, var2, var3, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var4));
   }

   @JvmStatic
   public static final void c(float var0, float var1, float var2, float var3, float var4, int var5, float var6) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
      b(var0, var1, var2, var3, var4, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var5), var6);
   }

   @JvmStatic
   public static final void a(
      @NotNull String var0,
      float var1,
      float var2,
      float var3,
      int var4,
      @NotNull IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl var5
   ) {
      short var10001 = -27261;
      short var10002 = -2428;
      Intrinsics.checkNotNullParameter(var0, "text");
      var10001 = -27209;
      var10002 = -18281;
      Intrinsics.checkNotNullParameter(var5, "font");
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
      a(var0, var1, var2, var3, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var4), var5);
   }

   @JvmStatic
   @JvmOverloads
   public static final void c(float var0, float var1) {
      a(var0, var1, 0.0F, 4, (java.lang.Object)null);
   }

   private static final float d(float var0, float var1) {
      return Math.round(var1 * var0) / var0;
   }

   private static final float b(float var0, float var1, float var2) {
      return (Math.round(var2 * var0 - var1) + var1) / var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var23 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[48];
      int var3 = 0;
      g("bl7aMc");
      String var2 = "Eeç\u001crÄ¯\u009d\u009ear`-\u001böÿ!\u0003nô*UKhF#ÕT´ò\u0014ñ\u0097\u00930n\"#_\u009bG\u0010êÇº¥¨¶ÌýH\u0089\u0012}´¢\u0004Ó\nÃ¶\u001aðÌJaØý¾\røèªH\u0092\u001dÒvµ÷hPÞ\bV\"8ÁH¤-~\u0005âdaöo\u0003¦\u0099F\u0006©uw\u0085\u00106$0kxp¥\u0090\u001f2Þ&O\u0080\u009eß®q\u0087ÔWé\u0016Æ\u009cUâ\u001b¬:\u009b~å*^²èã\u0006\u008eæÞí\u0080|\u0006\u0087W\u008bÚ\u0089ú\u001c\u001føBü[çß~ÓrµÎ(ö\u0089}8×¨\u001dË!r°\u0084\u009c\u001ey\u0006\u0083=\u007f\u0096´\u0013\u0006úA$\u0018|¡\u0006ÀëcM\u0094\u000b\u0004¼\u009eKø\fÉ&n¿Î\u0016oÌ÷)\rk\u0006x\u008fMÚWÝ.=üÙ\u0082\u009e\u008b«\u008böó¯[pyá!×[\u000f,f\u0099\u00adÜK\u007fÓ*|Zl\u000f£\u0093[¡«Å%\u0099\u0018ØÎ±\u0090Ã\n\u0094SðL\u0091ÝÊ*\u0088à\u0003\u0014\u000b9\u001d\u0014'₂=Þæº\u001eE<SC> ±Ò®Ê\u0098gtñiÈ\u0097¶\u008e¾G\u001b\u0081\u009bÏ\u008f³e\u0091g<.±ä\nE;vW7\u001aÖX\n\u000b°\u009e\u0088\u0007^âà@å#ÍîJP¹\u0089 \u000e@üÃ)g¬ò´B¸ßeCNj²@&Y\u0003ú\u008e\u0005\u0083Ï\u0087Ü\u008f\u001f\f`\u007fÚ¯\u0005\u0094||@¥k\u008d/\u008a(á\u001c³\u009b+u\u0006Ú\u007fÎYh¶\u000eÎO\u0007g/¨ë\u0086\u008fS\u009b;ËjôEqo\u0084,F4\u0010\u0010eåè_9©\u0097|W\u0017S\u008bgãk\u0004\u008eR\ra\u0002\u0002p\f»\u0095 É\u0007ØV\u0015Ð\u0012é\f\u0005:.<õ\u007f\u0003}*=4 7zûê¤%n'O\u0095Ì7\u008b\u0006|ÃÖNfóS\t$u¤\u009bm\u0007gSúP\u0014ÿLÿò\u0003±ôÑC>9º©Dê0I6\u000bº°)\u000b\u008fÿZßv\u009bR\bE§Zq\u0004²¤¼;\u0017¼\u009c\u008a6\u008a¾«T÷ûÛúi¿ ô]¨\u0017/}\u0092á\u0006\u001cõzÊ\u0085ê¦g\u009f\u0019=#Ü\u0098t\u0087i-)ôX\u0010\u0018Ý»¯G¿#/F\u000eª\u0018\u0002±n\u0005Í\u0016Âò \n²\u0017dù6¤\u009b\u0084Û\u001b\u0004\u000b¶û¶\u0006\u0010³yF×i\r\u001eÏv¬\t\u0081¡åÛ\u0085¥\u001eg \tÿnhÀÝ<8\u0083B\u0000\u0017Ù₮hu\\\u0001OÇ\ruÀÓ\u008c\u001aË\u0011È>\u009b \u0010\u000eCoX4ýcbt\f{ß\u0099ö¡Y\u0007\u0004°4¸gÈÊ\n\u0097A\u001cK`òQN\u0082B\u00050~;µ$";
      int var4 = "Eeç\u001crÄ¯\u009d\u009ear`-\u001böÿ!\u0003nô*UKhF#ÕT´ò\u0014ñ\u0097\u00930n\"#_\u009bG\u0010êÇº¥¨¶ÌýH\u0089\u0012}´¢\u0004Ó\nÃ¶\u001aðÌJaØý¾\røèªH\u0092\u001dÒvµ÷hPÞ\bV\"8ÁH¤-~\u0005âdaöo\u0003¦\u0099F\u0006©uw\u0085\u00106$0kxp¥\u0090\u001f2Þ&O\u0080\u009eß®q\u0087ÔWé\u0016Æ\u009cUâ\u001b¬:\u009b~å*^²èã\u0006\u008eæÞí\u0080|\u0006\u0087W\u008bÚ\u0089ú\u001c\u001føBü[çß~ÓrµÎ(ö\u0089}8×¨\u001dË!r°\u0084\u009c\u001ey\u0006\u0083=\u007f\u0096´\u0013\u0006úA$\u0018|¡\u0006ÀëcM\u0094\u000b\u0004¼\u009eKø\fÉ&n¿Î\u0016oÌ÷)\rk\u0006x\u008fMÚWÝ.=üÙ\u0082\u009e\u008b«\u008böó¯[pyá!×[\u000f,f\u0099\u00adÜK\u007fÓ*|Zl\u000f£\u0093[¡«Å%\u0099\u0018ØÎ±\u0090Ã\n\u0094SðL\u0091ÝÊ*\u0088à\u0003\u0014\u000b9\u001d\u0014'₂=Þæº\u001eE<SC> ±Ò®Ê\u0098gtñiÈ\u0097¶\u008e¾G\u001b\u0081\u009bÏ\u008f³e\u0091g<.±ä\nE;vW7\u001aÖX\n\u000b°\u009e\u0088\u0007^âà@å#ÍîJP¹\u0089 \u000e@üÃ)g¬ò´B¸ßeCNj²@&Y\u0003ú\u008e\u0005\u0083Ï\u0087Ü\u008f\u001f\f`\u007fÚ¯\u0005\u0094||@¥k\u008d/\u008a(á\u001c³\u009b+u\u0006Ú\u007fÎYh¶\u000eÎO\u0007g/¨ë\u0086\u008fS\u009b;ËjôEqo\u0084,F4\u0010\u0010eåè_9©\u0097|W\u0017S\u008bgãk\u0004\u008eR\ra\u0002\u0002p\f»\u0095 É\u0007ØV\u0015Ð\u0012é\f\u0005:.<õ\u007f\u0003}*=4 7zûê¤%n'O\u0095Ì7\u008b\u0006|ÃÖNfóS\t$u¤\u009bm\u0007gSúP\u0014ÿLÿò\u0003±ôÑC>9º©Dê0I6\u000bº°)\u000b\u008fÿZßv\u009bR\bE§Zq\u0004²¤¼;\u0017¼\u009c\u008a6\u008a¾«T÷ûÛúi¿ ô]¨\u0017/}\u0092á\u0006\u001cõzÊ\u0085ê¦g\u009f\u0019=#Ü\u0098t\u0087i-)ôX\u0010\u0018Ý»¯G¿#/F\u000eª\u0018\u0002±n\u0005Í\u0016Âò \n²\u0017dù6¤\u009b\u0084Û\u001b\u0004\u000b¶û¶\u0006\u0010³yF×i\r\u001eÏv¬\t\u0081¡åÛ\u0085¥\u001eg \tÿnhÀÝ<8\u0083B\u0000\u0017Ù₮hu\\\u0001OÇ\ruÀÓ\u008c\u001aË\u0011È>\u009b \u0010\u000eCoX4ýcbt\f{ß\u0099ö¡Y\u0007\u0004°4¸gÈÊ\n\u0097A\u001cK`òQN\u0082B\u00050~;µ$"
         .length();
      char var1 = '\r';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 63;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var28 = var10001.toCharArray();
               int var10004 = var28.length;
               int var6 = 0;
               byte var31 = var10000;
               var23 = var28;
               int var17 = var10004;
               byte var38;
               char[] var43;
               int var10006;
               if (var10004 <= 1) {
                  var43 = var28;
                  var38 = var10000;
                  var10006 = var6;
               } else {
                  var31 = var10000;
                  var17 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var43 = var28;
                  var38 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var43[var10006] = (char)(var43[var10006] ^ var38 ^ switch (var6 % 7) {
                     case 0 -> 47;
                     case 1 -> 27;
                     case 2 -> 37;
                     case 3 -> 102;
                     case 4 -> 23;
                     case 5 -> 5;
                     default -> 52;
                  });
                  var6++;
                  if (var31 == 0) {
                     var10006 = var31;
                     var43 = var23;
                     var38 = var31;
                  } else {
                     if (var17 <= var6) {
                        break;
                     }

                     var43 = var23;
                     var38 = var31;
                     var10006 = var6;
                  }
               }
            }

            String var33 = new String(var23).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var33;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[48];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl();
                     NVGPaint var10 = NVGPaint.malloc();
                     Intrinsics.checkNotNull(var10);
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var10;
                     NVGColor var11 = NVGColor.malloc();
                     Intrinsics.checkNotNull(var11);
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var11;
                     NVGColor var12 = NVGColor.malloc();
                     Intrinsics.checkNotNull(var12);
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var12;
                     var10002 = -27219;
                     short var34 = -5938;
                     short var35 = -27231;
                     short var42 = -27658;
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl(
                        "San Francisco", "/assets/polinex/fonts/SF.otf"
                     );
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new HashMap<>();
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new float[4];
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new HashMap<>();
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new HashMap<>();
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new HashMap<>();
                     lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new HashMap<>();
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new HashMap<>();
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new HashMap<>();
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = -1L;
                     IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 1.0F;
                     IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = 2.0F;
                     IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = -1;
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var33;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "5\u0082}q\r\u0085³@\u001ci@0=\u0089[®\u0084G";
                  var4 = "5\u0082}q\r\u0085³@\u001ci@0=\u0089[®\u0084G".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 119;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   public static void g(String var0) {
      IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = var0;
   }

   public static String j() {
      return IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -27219) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 39;
            case 1 -> 149;
            case 2 -> 16;
            case 3 -> 35;
            case 4 -> 53;
            case 5 -> 166;
            case 6 -> 221;
            case 7 -> 2;
            case 8 -> 146;
            case 9 -> 187;
            case 10 -> 150;
            case 11 -> 42;
            case 12 -> 209;
            case 13 -> 7;
            case 14 -> 238;
            case 15 -> 214;
            case 16 -> 210;
            case 17 -> 241;
            case 18 -> 24;
            case 19 -> 101;
            case 20 -> 68;
            case 21 -> 94;
            case 22 -> 220;
            case 23 -> 186;
            case 24 -> 80;
            case 25 -> 5;
            case 26 -> 100;
            case 27 -> 223;
            case 28 -> 188;
            case 29 -> 0;
            case 30 -> 164;
            case 31 -> 151;
            case 32 -> 4;
            case 33 -> 167;
            case 34 -> 77;
            case 35 -> 145;
            case 36 -> 33;
            case 37 -> 152;
            case 38 -> 115;
            case 39 -> 158;
            case 40 -> 47;
            case 41 -> 144;
            case 42 -> 252;
            case 43 -> 245;
            case 44 -> 70;
            case 45 -> 75;
            case 46 -> 157;
            case 47 -> 249;
            case 48 -> 183;
            case 49 -> 19;
            case 50 -> 141;
            case 51 -> 82;
            case 52 -> 255;
            case 53 -> 74;
            case 54 -> 116;
            case 55 -> 55;
            case 56 -> 62;
            case 57 -> 155;
            case 58 -> 224;
            case 59 -> 171;
            case 60 -> 124;
            case 61 -> 10;
            case 62 -> 174;
            case 63 -> 142;
            case 64 -> 169;
            case 65 -> 229;
            case 66 -> 72;
            case 67 -> 13;
            case 68 -> 161;
            case 69 -> 143;
            case 70 -> 230;
            case 71 -> 219;
            case 72 -> 27;
            case 73 -> 201;
            case 74 -> 118;
            case 75 -> 97;
            case 76 -> 112;
            case 77 -> 25;
            case 78 -> 189;
            case 79 -> 233;
            case 80 -> 196;
            case 81 -> 175;
            case 82 -> 61;
            case 83 -> 6;
            case 84 -> 111;
            case 85 -> 200;
            case 86 -> 218;
            case 87 -> 121;
            case 88 -> 135;
            case 89 -> 3;
            case 90 -> 52;
            case 91 -> 59;
            case 92 -> 181;
            case 93 -> 198;
            case 94 -> 57;
            case 95 -> 108;
            case 96 -> 215;
            case 97 -> 87;
            case 98 -> 29;
            case 99 -> 48;
            case 100 -> 32;
            case 101 -> 76;
            case 102 -> 202;
            case 103 -> 176;
            case 104 -> 184;
            case 105 -> 250;
            case 106 -> 51;
            case 107 -> 217;
            case 108 -> 11;
            case 109 -> 107;
            case 110 -> 110;
            case 111 -> 130;
            case 112 -> 246;
            case 113 -> 156;
            case 114 -> 78;
            case 115 -> 98;
            case 116 -> 192;
            case 117 -> 197;
            case 118 -> 173;
            case 119 -> 136;
            case 120 -> 204;
            case 121 -> 84;
            case 122 -> 216;
            case 123 -> 113;
            case 124 -> 125;
            case 125 -> 134;
            case 126 -> 58;
            case 127 -> 30;
            case 128 -> 127;
            case 129 -> 234;
            case 130 -> 28;
            case 131 -> 96;
            case 132 -> 20;
            case 133 -> 212;
            case 134 -> 26;
            case 135 -> 177;
            case 136 -> 66;
            case 137 -> 199;
            case 138 -> 81;
            case 139 -> 147;
            case 140 -> 168;
            case 141 -> 148;
            case 142 -> 129;
            case 143 -> 122;
            case 144 -> 56;
            case 145 -> 254;
            case 146 -> 165;
            case 147 -> 73;
            case 148 -> 138;
            case 149 -> 208;
            case 150 -> 194;
            case 151 -> 92;
            case 152 -> 139;
            case 153 -> 99;
            case 154 -> 43;
            case 155 -> 79;
            case 156 -> 23;
            case 157 -> 206;
            case 158 -> 159;
            case 159 -> 18;
            case 160 -> 132;
            case 161 -> 126;
            case 162 -> 162;
            case 163 -> 114;
            case 164 -> 86;
            case 165 -> 91;
            case 166 -> 235;
            case 167 -> 37;
            case 168 -> 231;
            case 169 -> 38;
            case 170 -> 205;
            case 171 -> 40;
            case 172 -> 154;
            case 173 -> 123;
            case 174 -> 65;
            case 175 -> 244;
            case 176 -> 232;
            case 177 -> 15;
            case 178 -> 251;
            case 179 -> 102;
            case 180 -> 60;
            case 181 -> 50;
            case 182 -> 227;
            case 183 -> 67;
            case 184 -> 228;
            case 185 -> 31;
            case 186 -> 90;
            case 187 -> 12;
            case 188 -> 180;
            case 189 -> 71;
            case 190 -> 64;
            case 191 -> 195;
            case 192 -> 160;
            case 193 -> 22;
            case 194 -> 237;
            case 195 -> 85;
            case 196 -> 103;
            case 197 -> 46;
            case 198 -> 178;
            case 199 -> 225;
            case 200 -> 170;
            case 201 -> 207;
            case 202 -> 211;
            case 203 -> 89;
            case 204 -> 119;
            case 205 -> 247;
            case 206 -> 49;
            case 207 -> 17;
            case 208 -> 1;
            case 209 -> 140;
            case 210 -> 191;
            case 211 -> 83;
            case 212 -> 172;
            case 213 -> 163;
            case 214 -> 153;
            case 215 -> 14;
            case 216 -> 9;
            case 217 -> 36;
            case 218 -> 137;
            case 219 -> 117;
            case 220 -> 54;
            case 221 -> 203;
            case 222 -> 21;
            case 223 -> 34;
            case 224 -> 236;
            case 225 -> 239;
            case 226 -> 45;
            case 227 -> 106;
            case 228 -> 8;
            case 229 -> 109;
            case 230 -> 213;
            case 231 -> 222;
            case 232 -> 243;
            case 233 -> 88;
            case 234 -> 242;
            case 235 -> 63;
            case 236 -> 185;
            case 237 -> 133;
            case 238 -> 69;
            case 239 -> 41;
            case 240 -> 182;
            case 241 -> 179;
            case 242 -> 93;
            case 243 -> 240;
            case 244 -> 104;
            case 245 -> 190;
            case 246 -> 253;
            case 247 -> 44;
            case 248 -> 120;
            case 249 -> 128;
            case 250 -> 193;
            case 251 -> 226;
            case 252 -> 95;
            case 253 -> 131;
            case 254 -> 105;
            default -> 248;
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


   public final void a(@NotNull String var1, float var2, float var3, float var4, float var5, float var6) {
      short var10001 = -27204;
      short var10002 = -29745;
      Intrinsics.checkNotNullParameter(var1, "resourcePath");
      this.c();
      int var7 = this.d(var1);
      NanoVG.nvgImagePattern(
         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
         var2,
         var3,
         var4,
         var5,
         0.0F,
         var7,
         var6,
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
      );
      NanoVG.nvgBeginPath(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
      NanoVG.nvgRect(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var2, var3, var4, var5);
      NanoVG.nvgFillPaint(
         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
      );
      NanoVG.nvgFill(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
   }

   public final void b(@NotNull String var1, float var2, float var3, float var4, float var5, float var6) {
      short var10001 = -27215;
      short var10002 = -1023;
      Intrinsics.checkNotNullParameter(var1, "resourcePath");
      this.c();
      int var7 = this.e(var1);
      NanoVG.nvgImagePattern(
         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
         var2,
         var3,
         var4,
         var5,
         0.0F,
         var7,
         var6,
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
      );
      NanoVG.nvgBeginPath(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
      NanoVG.nvgRect(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var2, var3, var4, var5);
      NanoVG.nvgFillPaint(
         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
      );
      NanoVG.nvgFill(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
   }
   private static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      @Nullable
      private final lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private float lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; // PX-FIX: jar 中 final，但 var6==null 早退路径不赋值（字节码允许），去 final 以过 javac
      private float IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl; // PX-FIX: jar 中 final，但 var6==null 早退路径不赋值（字节码允许），去 final 以过 javac
      private float lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI; // PX-FIX: jar 中 final，但 var6==null 早退路径不赋值（字节码允许），去 final 以过 javac
      private float IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         @Nullable lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var1,
         float var2,
         float var3,
         float var4,
         float var5
      ) {
         String var10000 = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.j();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         String var6 = var10000;
         lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var7 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var6 != null) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl == null) {
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
               this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
               if (var6 != null) {
                  return;
               }
            }

            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = Math.max(
               var2,
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = Math.max(
               var3,
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            );
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = Math.min(
               var4,
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            );
            var7 = this;
         }

         var7.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = Math.min(
            var5,
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         );
      }

      @Nullable
      public final lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final float b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final float c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final float d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final float e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final void f() {
         float var1 = Math.max(
            0.0F,
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
               - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         );
         float var2 = Math.max(
            0.0F,
            this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
               - this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         );
         NanoVG.nvgScissor(
            lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(),
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
            var1,
            var2
         );
      }
   }

   private static final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
      @NotNull
      private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final float lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(@NotNull String var1, float var2, int var3) {
         short var10001 = -5430;
         short var10002 = -29259;
         Intrinsics.checkNotNullParameter(var1, "text");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      }

      @NotNull
      public final String a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final float b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final String d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final float e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(
         @NotNull String var1, float var2, int var3
      ) {
         short var10001 = -5429;
         short var10002 = -21752;
         Intrinsics.checkNotNullParameter(var1, "text");
         return new lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -5432;
         int var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         float var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         String var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -30935;
         short var10002 = -5426;
         short var10003 = 4999;
         short var10004 = -5431;
         short var10005 = -23506;
         return "TextWidthKey(text=" + var3 + ", size=" + var2 + ", fontId=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         var1 = var1 * 31 + Float.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         return var1 * 31 + Integer.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.j();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var3 = (lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)var10000;
         int var4 = ((Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )) ? 1 : 0);
         if (var2 != null) {
            if (var4 == 0) {
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

            var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         if (var2 != null) {
            if (var4 != var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[5];
         int var3 = 0;
         String var2 = "\u0014ö³¢\u0004ï\u0088Ìm\u0012\u0088<\u0004ûU²\u001cié/üK $Cìf\u0016";
         int var4 = "\u0014ö³¢\u0004ï\u0088Ìm\u0012\u0088<\u0004ûU²\u001cié/üK $Cìf\u0016".length();
         char var1 = 4;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 75;
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
                        case 0 -> 47;
                        case 1 -> 4;
                        case 2 -> 116;
                        case 3 -> 99;
                        case 4 -> 89;
                        case 5 -> 16;
                        default -> 102;
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

                     var2 = "lÁ\rNl\u009dôÞÕ\u0007\u001b¨öe°/\u008d";
                     var4 = "lÁ\rNl\u009dôÞÕ\u0007\u001b¨öe°/\u008d".length();
                     var1 = '\t';
                     var8 = -1;
               }

               var10000 = 84;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -5430) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 160;
               case 1 -> 4;
               case 2 -> 40;
               case 3 -> 36;
               case 4 -> 31;
               case 5 -> 34;
               case 6 -> 8;
               case 7 -> 233;
               case 8 -> 194;
               case 9 -> 18;
               case 10 -> 119;
               case 11 -> 75;
               case 12 -> 82;
               case 13 -> 63;
               case 14 -> 229;
               case 15 -> 226;
               case 16 -> 64;
               case 17 -> 234;
               case 18 -> 3;
               case 19 -> 255;
               case 20 -> 184;
               case 21 -> 215;
               case 22 -> 29;
               case 23 -> 243;
               case 24 -> 158;
               case 25 -> 241;
               case 26 -> 138;
               case 27 -> 225;
               case 28 -> 240;
               case 29 -> 1;
               case 30 -> 85;
               case 31 -> 33;
               case 32 -> 2;
               case 33 -> 11;
               case 34 -> 236;
               case 35 -> 221;
               case 36 -> 91;
               case 37 -> 228;
               case 38 -> 208;
               case 39 -> 145;
               case 40 -> 98;
               case 41 -> 140;
               case 42 -> 139;
               case 43 -> 195;
               case 44 -> 108;
               case 45 -> 172;
               case 46 -> 117;
               case 47 -> 162;
               case 48 -> 95;
               case 49 -> 127;
               case 50 -> 101;
               case 51 -> 157;
               case 52 -> 70;
               case 53 -> 170;
               case 54 -> 10;
               case 55 -> 254;
               case 56 -> 120;
               case 57 -> 5;
               case 58 -> 253;
               case 59 -> 169;
               case 60 -> 90;
               case 61 -> 161;
               case 62 -> 244;
               case 63 -> 148;
               case 64 -> 200;
               case 65 -> 199;
               case 66 -> 125;
               case 67 -> 213;
               case 68 -> 251;
               case 69 -> 168;
               case 70 -> 134;
               case 71 -> 21;
               case 72 -> 116;
               case 73 -> 80;
               case 74 -> 227;
               case 75 -> 58;
               case 76 -> 218;
               case 77 -> 123;
               case 78 -> 62;
               case 79 -> 94;
               case 80 -> 106;
               case 81 -> 69;
               case 82 -> 153;
               case 83 -> 22;
               case 84 -> 205;
               case 85 -> 129;
               case 86 -> 132;
               case 87 -> 96;
               case 88 -> 222;
               case 89 -> 32;
               case 90 -> 224;
               case 91 -> 79;
               case 92 -> 249;
               case 93 -> 204;
               case 94 -> 103;
               case 95 -> 19;
               case 96 -> 59;
               case 97 -> 191;
               case 98 -> 47;
               case 99 -> 187;
               case 100 -> 118;
               case 101 -> 35;
               case 102 -> 84;
               case 103 -> 156;
               case 104 -> 246;
               case 105 -> 235;
               case 106 -> 207;
               case 107 -> 43;
               case 108 -> 109;
               case 109 -> 247;
               case 110 -> 20;
               case 111 -> 149;
               case 112 -> 177;
               case 113 -> 136;
               case 114 -> 186;
               case 115 -> 202;
               case 116 -> 41;
               case 117 -> 45;
               case 118 -> 164;
               case 119 -> 173;
               case 120 -> 13;
               case 121 -> 167;
               case 122 -> 128;
               case 123 -> 130;
               case 124 -> 178;
               case 125 -> 220;
               case 126 -> 146;
               case 127 -> 61;
               case 128 -> 152;
               case 129 -> 89;
               case 130 -> 46;
               case 131 -> 201;
               case 132 -> 68;
               case 133 -> 102;
               case 134 -> 44;
               case 135 -> 115;
               case 136 -> 248;
               case 137 -> 203;
               case 138 -> 111;
               case 139 -> 9;
               case 140 -> 223;
               case 141 -> 193;
               case 142 -> 54;
               case 143 -> 190;
               case 144 -> 131;
               case 145 -> 14;
               case 146 -> 93;
               case 147 -> 242;
               case 148 -> 97;
               case 149 -> 144;
               case 150 -> 72;
               case 151 -> 198;
               case 152 -> 99;
               case 153 -> 27;
               case 154 -> 12;
               case 155 -> 214;
               case 156 -> 217;
               case 157 -> 16;
               case 158 -> 25;
               case 159 -> 239;
               case 160 -> 38;
               case 161 -> 52;
               case 162 -> 231;
               case 163 -> 219;
               case 164 -> 56;
               case 165 -> 71;
               case 166 -> 67;
               case 167 -> 171;
               case 168 -> 196;
               case 169 -> 86;
               case 170 -> 165;
               case 171 -> 66;
               case 172 -> 24;
               case 173 -> 37;
               case 174 -> 174;
               case 175 -> 105;
               case 176 -> 81;
               case 177 -> 92;
               case 178 -> 76;
               case 179 -> 163;
               case 180 -> 216;
               case 181 -> 206;
               case 182 -> 83;
               case 183 -> 142;
               case 184 -> 209;
               case 185 -> 232;
               case 186 -> 17;
               case 187 -> 112;
               case 188 -> 55;
               case 189 -> 26;
               case 190 -> 181;
               case 191 -> 150;
               case 192 -> 185;
               case 193 -> 147;
               case 194 -> 78;
               case 195 -> 51;
               case 196 -> 135;
               case 197 -> 137;
               case 198 -> 175;
               case 199 -> 42;
               case 200 -> 151;
               case 201 -> 30;
               case 202 -> 211;
               case 203 -> 48;
               case 204 -> 126;
               case 205 -> 87;
               case 206 -> 65;
               case 207 -> 155;
               case 208 -> 124;
               case 209 -> 250;
               case 210 -> 122;
               case 211 -> 143;
               case 212 -> 23;
               case 213 -> 104;
               case 214 -> 77;
               case 215 -> 210;
               case 216 -> 197;
               case 217 -> 57;
               case 218 -> 154;
               case 219 -> 230;
               case 220 -> 39;
               case 221 -> 74;
               case 222 -> 237;
               case 223 -> 6;
               case 224 -> 188;
               case 225 -> 121;
               case 226 -> 212;
               case 227 -> 50;
               case 228 -> 183;
               case 229 -> 88;
               case 230 -> 179;
               case 231 -> 15;
               case 232 -> 192;
               case 233 -> 141;
               case 234 -> 49;
               case 235 -> 182;
               case 236 -> 113;
               case 237 -> 189;
               case 238 -> 53;
               case 239 -> 176;
               case 240 -> 166;
               case 241 -> 28;
               case 242 -> 73;
               case 243 -> 180;
               case 244 -> 100;
               case 245 -> 252;
               case 246 -> 7;
               case 247 -> 133;
               case 248 -> 114;
               case 249 -> 238;
               case 250 -> 0;
               case 251 -> 245;
               case 252 -> 110;
               case 253 -> 60;
               case 254 -> 159;
               default -> 107;
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
      public static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll p0, java.lang.String p1, float p2, int p3, int p4, java.lang.Object p5) {
         if ((p4 & 1) != 0) p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if ((p4 & 2) != 0) p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if ((p4 & 4) != 0) p3 = p0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         return p0.a(p1, p2, p3);
      }
   }

   private static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      private int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(int var1, int var2) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      }

      public final int a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final void a(int var1) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      }

      public final int b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int c() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int d() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         int var1, int var2
      ) {
         return new lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var2
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10002 = 16375;
         short var10003 = 13261;
         var10003 = 16374;
         short var10004 = -27447;
         return "NVGImage(count="
            + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            + ", nvg="
            + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         return var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.j();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = var1;
         }

         lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         int var10001 = var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var2 != null) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (var2 == null) {
               return (boolean)(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII != 0);
            }

            var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         return !(var4 != var10001);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: {
         String[] var5 = new String[2];
         int var3 = 0;
         String var2 = "°K\u0080·\u0083T\u000fpþ\u009f\u0086föþ2\u008f½?\u009a,iß";
         int var4 = "°K\u0080·\u0083T\u000fpþ\u009f\u0086föþ2\u008f½?\u009a,iß".length();
         char var1 = 6;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 90;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 90;
                  var10006 = var6;
               } else {
                  var13 = 90;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 90;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 82;
                     case 1 -> 110;
                     case 2 -> 10;
                     case 3 -> 80;
                     case 4 -> 7;
                     case 5 -> 60;
                     default -> 100;
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
               break pxClinit;
            }

            var1 = var2.charAt(var0);
         }
      }
}

      private static String b(int var0, int var1) {
         int var2 = (var0 ^ 16374) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 55;
               case 1 -> 143;
               case 2 -> 101;
               case 3 -> 96;
               case 4 -> 28;
               case 5 -> 79;
               case 6 -> 221;
               case 7 -> 250;
               case 8 -> 128;
               case 9 -> 170;
               case 10 -> 218;
               case 11 -> 204;
               case 12 -> 220;
               case 13 -> 6;
               case 14 -> 114;
               case 15 -> 234;
               case 16 -> 107;
               case 17 -> 216;
               case 18 -> 100;
               case 19 -> 64;
               case 20 -> 1;
               case 21 -> 97;
               case 22 -> 156;
               case 23 -> 41;
               case 24 -> 205;
               case 25 -> 243;
               case 26 -> 183;
               case 27 -> 178;
               case 28 -> 5;
               case 29 -> 102;
               case 30 -> 48;
               case 31 -> 167;
               case 32 -> 42;
               case 33 -> 124;
               case 34 -> 188;
               case 35 -> 27;
               case 36 -> 74;
               case 37 -> 252;
               case 38 -> 58;
               case 39 -> 251;
               case 40 -> 242;
               case 41 -> 67;
               case 42 -> 82;
               case 43 -> 189;
               case 44 -> 92;
               case 45 -> 219;
               case 46 -> 236;
               case 47 -> 117;
               case 48 -> 88;
               case 49 -> 181;
               case 50 -> 174;
               case 51 -> 246;
               case 52 -> 135;
               case 53 -> 12;
               case 54 -> 212;
               case 55 -> 47;
               case 56 -> 176;
               case 57 -> 16;
               case 58 -> 194;
               case 59 -> 4;
               case 60 -> 94;
               case 61 -> 184;
               case 62 -> 68;
               case 63 -> 238;
               case 64 -> 95;
               case 65 -> 14;
               case 66 -> 87;
               case 67 -> 180;
               case 68 -> 168;
               case 69 -> 123;
               case 70 -> 85;
               case 71 -> 210;
               case 72 -> 134;
               case 73 -> 137;
               case 74 -> 75;
               case 75 -> 26;
               case 76 -> 77;
               case 77 -> 89;
               case 78 -> 69;
               case 79 -> 249;
               case 80 -> 112;
               case 81 -> 0;
               case 82 -> 129;
               case 83 -> 9;
               case 84 -> 131;
               case 85 -> 111;
               case 86 -> 215;
               case 87 -> 201;
               case 88 -> 187;
               case 89 -> 166;
               case 90 -> 147;
               case 91 -> 255;
               case 92 -> 217;
               case 93 -> 253;
               case 94 -> 237;
               case 95 -> 13;
               case 96 -> 227;
               case 97 -> 10;
               case 98 -> 78;
               case 99 -> 38;
               case 100 -> 241;
               case 101 -> 148;
               case 102 -> 133;
               case 103 -> 202;
               case 104 -> 232;
               case 105 -> 140;
               case 106 -> 83;
               case 107 -> 91;
               case 108 -> 59;
               case 109 -> 61;
               case 110 -> 17;
               case 111 -> 153;
               case 112 -> 136;
               case 113 -> 3;
               case 114 -> 229;
               case 115 -> 244;
               case 116 -> 228;
               case 117 -> 199;
               case 118 -> 63;
               case 119 -> 84;
               case 120 -> 151;
               case 121 -> 207;
               case 122 -> 163;
               case 123 -> 23;
               case 124 -> 186;
               case 125 -> 233;
               case 126 -> 165;
               case 127 -> 125;
               case 128 -> 159;
               case 129 -> 193;
               case 130 -> 139;
               case 131 -> 172;
               case 132 -> 206;
               case 133 -> 93;
               case 134 -> 162;
               case 135 -> 245;
               case 136 -> 171;
               case 137 -> 121;
               case 138 -> 122;
               case 139 -> 24;
               case 140 -> 37;
               case 141 -> 130;
               case 142 -> 46;
               case 143 -> 127;
               case 144 -> 105;
               case 145 -> 36;
               case 146 -> 11;
               case 147 -> 196;
               case 148 -> 182;
               case 149 -> 198;
               case 150 -> 108;
               case 151 -> 119;
               case 152 -> 175;
               case 153 -> 99;
               case 154 -> 8;
               case 155 -> 76;
               case 156 -> 158;
               case 157 -> 209;
               case 158 -> 31;
               case 159 -> 29;
               case 160 -> 33;
               case 161 -> 19;
               case 162 -> 45;
               case 163 -> 90;
               case 164 -> 113;
               case 165 -> 247;
               case 166 -> 81;
               case 167 -> 116;
               case 168 -> 235;
               case 169 -> 22;
               case 170 -> 149;
               case 171 -> 56;
               case 172 -> 115;
               case 173 -> 144;
               case 174 -> 191;
               case 175 -> 160;
               case 176 -> 141;
               case 177 -> 195;
               case 178 -> 213;
               case 179 -> 138;
               case 180 -> 222;
               case 181 -> 155;
               case 182 -> 197;
               case 183 -> 150;
               case 184 -> 53;
               case 185 -> 35;
               case 186 -> 173;
               case 187 -> 72;
               case 188 -> 185;
               case 189 -> 214;
               case 190 -> 39;
               case 191 -> 230;
               case 192 -> 254;
               case 193 -> 200;
               case 194 -> 157;
               case 195 -> 118;
               case 196 -> 226;
               case 197 -> 30;
               case 198 -> 152;
               case 199 -> 164;
               case 200 -> 57;
               case 201 -> 145;
               case 202 -> 146;
               case 203 -> 154;
               case 204 -> 248;
               case 205 -> 21;
               case 206 -> 65;
               case 207 -> 7;
               case 208 -> 66;
               case 209 -> 223;
               case 210 -> 161;
               case 211 -> 49;
               case 212 -> 239;
               case 213 -> 109;
               case 214 -> 54;
               case 215 -> 62;
               case 216 -> 211;
               case 217 -> 15;
               case 218 -> 73;
               case 219 -> 104;
               case 220 -> 179;
               case 221 -> 52;
               case 222 -> 43;
               case 223 -> 50;
               case 224 -> 169;
               case 225 -> 18;
               case 226 -> 2;
               case 227 -> 32;
               case 228 -> 231;
               case 229 -> 106;
               case 230 -> 132;
               case 231 -> 142;
               case 232 -> 86;
               case 233 -> 224;
               case 234 -> 208;
               case 235 -> 203;
               case 236 -> 110;
               case 237 -> 103;
               case 238 -> 192;
               case 239 -> 34;
               case 240 -> 70;
               case 241 -> 60;
               case 242 -> 80;
               case 243 -> 44;
               case 244 -> 51;
               case 245 -> 126;
               case 246 -> 177;
               case 247 -> 225;
               case 248 -> 25;
               case 249 -> 240;
               case 250 -> 98;
               case 251 -> 190;
               case 252 -> 120;
               case 253 -> 71;
               case 254 -> 40;
               default -> 20;
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
      public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI p0, int p1, int p2, int p3, java.lang.Object p4) {
         if ((p3 & 1) != 0) p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if ((p3 & 2) != 0) p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         return p0.a(p1, p2);
      }
   }

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final ByteBuffer lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(int var1, @NotNull ByteBuffer var2) {
         short var10001 = -10418;
         short var10002 = -30736;
         Intrinsics.checkNotNullParameter(var2, "buffer");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      }

      public final int a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final ByteBuffer b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int c() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final ByteBuffer d() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         int var1, @NotNull ByteBuffer var2
      ) {
         short var10001 = -10420;
         short var10002 = 22526;
         Intrinsics.checkNotNullParameter(var2, "buffer");
         return new lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10002 = -10419;
         short var10003 = 14177;
         var10003 = -10417;
         short var10004 = -20039;
         return "NVGFont(id="
            + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            + ", buffer="
            + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         return var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.j();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var2 != null) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[4];
         int var3 = 0;
         String var2 = "\u001d¦s3\u0090}Âæk\u0085)\u0006lÕÕ:Kd";
         int var4 = "\u001d¦s3\u0090}Âæk\u0085)\u0006lÕÕ:Kd".length();
         char var1 = 11;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 88;
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
                        case 0 -> 17;
                        case 1 -> 88;
                        case 2 -> 97;
                        case 3 -> 101;
                        case 4 -> 65;
                        case 5 -> 4;
                        default -> 93;
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

                     var2 = "$\u0019¸¨\u0086´Þkh\u0006s\u0084Ñ÷,:";
                     var4 = "$\u0019¸¨\u0086´Þkh\u0006s\u0084Ñ÷,:".length();
                     var1 = '\t';
                     var8 = -1;
               }

               var10000 = 95;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -10419) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 59;
               case 1 -> 85;
               case 2 -> 126;
               case 3 -> 138;
               case 4 -> 100;
               case 5 -> 175;
               case 6 -> 78;
               case 7 -> 95;
               case 8 -> 228;
               case 9 -> 51;
               case 10 -> 224;
               case 11 -> 10;
               case 12 -> 105;
               case 13 -> 152;
               case 14 -> 200;
               case 15 -> 250;
               case 16 -> 253;
               case 17 -> 93;
               case 18 -> 75;
               case 19 -> 208;
               case 20 -> 58;
               case 21 -> 41;
               case 22 -> 72;
               case 23 -> 218;
               case 24 -> 222;
               case 25 -> 204;
               case 26 -> 26;
               case 27 -> 142;
               case 28 -> 52;
               case 29 -> 144;
               case 30 -> 125;
               case 31 -> 223;
               case 32 -> 229;
               case 33 -> 141;
               case 34 -> 133;
               case 35 -> 124;
               case 36 -> 99;
               case 37 -> 183;
               case 38 -> 241;
               case 39 -> 62;
               case 40 -> 44;
               case 41 -> 118;
               case 42 -> 180;
               case 43 -> 248;
               case 44 -> 187;
               case 45 -> 238;
               case 46 -> 2;
               case 47 -> 196;
               case 48 -> 49;
               case 49 -> 35;
               case 50 -> 6;
               case 51 -> 165;
               case 52 -> 38;
               case 53 -> 79;
               case 54 -> 112;
               case 55 -> 176;
               case 56 -> 214;
               case 57 -> 37;
               case 58 -> 5;
               case 59 -> 216;
               case 60 -> 233;
               case 61 -> 145;
               case 62 -> 217;
               case 63 -> 243;
               case 64 -> 147;
               case 65 -> 192;
               case 66 -> 185;
               case 67 -> 80;
               case 68 -> 148;
               case 69 -> 215;
               case 70 -> 220;
               case 71 -> 63;
               case 72 -> 162;
               case 73 -> 139;
               case 74 -> 114;
               case 75 -> 184;
               case 76 -> 94;
               case 77 -> 69;
               case 78 -> 14;
               case 79 -> 191;
               case 80 -> 12;
               case 81 -> 7;
               case 82 -> 181;
               case 83 -> 254;
               case 84 -> 71;
               case 85 -> 107;
               case 86 -> 15;
               case 87 -> 109;
               case 88 -> 33;
               case 89 -> 39;
               case 90 -> 101;
               case 91 -> 47;
               case 92 -> 189;
               case 93 -> 83;
               case 94 -> 53;
               case 95 -> 86;
               case 96 -> 91;
               case 97 -> 211;
               case 98 -> 18;
               case 99 -> 131;
               case 100 -> 140;
               case 101 -> 102;
               case 102 -> 45;
               case 103 -> 97;
               case 104 -> 42;
               case 105 -> 129;
               case 106 -> 115;
               case 107 -> 150;
               case 108 -> 36;
               case 109 -> 193;
               case 110 -> 123;
               case 111 -> 120;
               case 112 -> 77;
               case 113 -> 227;
               case 114 -> 195;
               case 115 -> 236;
               case 116 -> 28;
               case 117 -> 134;
               case 118 -> 22;
               case 119 -> 43;
               case 120 -> 92;
               case 121 -> 239;
               case 122 -> 234;
               case 123 -> 103;
               case 124 -> 127;
               case 125 -> 167;
               case 126 -> 157;
               case 127 -> 81;
               case 128 -> 13;
               case 129 -> 66;
               case 130 -> 68;
               case 131 -> 177;
               case 132 -> 240;
               case 133 -> 209;
               case 134 -> 70;
               case 135 -> 73;
               case 136 -> 82;
               case 137 -> 212;
               case 138 -> 201;
               case 139 -> 198;
               case 140 -> 190;
               case 141 -> 87;
               case 142 -> 113;
               case 143 -> 65;
               case 144 -> 226;
               case 145 -> 61;
               case 146 -> 221;
               case 147 -> 90;
               case 148 -> 48;
               case 149 -> 31;
               case 150 -> 21;
               case 151 -> 255;
               case 152 -> 56;
               case 153 -> 108;
               case 154 -> 249;
               case 155 -> 17;
               case 156 -> 40;
               case 157 -> 182;
               case 158 -> 8;
               case 159 -> 25;
               case 160 -> 30;
               case 161 -> 179;
               case 162 -> 11;
               case 163 -> 225;
               case 164 -> 16;
               case 165 -> 1;
               case 166 -> 111;
               case 167 -> 172;
               case 168 -> 194;
               case 169 -> 104;
               case 170 -> 143;
               case 171 -> 170;
               case 172 -> 203;
               case 173 -> 117;
               case 174 -> 158;
               case 175 -> 130;
               case 176 -> 159;
               case 177 -> 232;
               case 178 -> 174;
               case 179 -> 98;
               case 180 -> 32;
               case 181 -> 23;
               case 182 -> 206;
               case 183 -> 116;
               case 184 -> 161;
               case 185 -> 166;
               case 186 -> 50;
               case 187 -> 153;
               case 188 -> 74;
               case 189 -> 155;
               case 190 -> 169;
               case 191 -> 0;
               case 192 -> 46;
               case 193 -> 88;
               case 194 -> 110;
               case 195 -> 207;
               case 196 -> 34;
               case 197 -> 24;
               case 198 -> 135;
               case 199 -> 168;
               case 200 -> 19;
               case 201 -> 252;
               case 202 -> 199;
               case 203 -> 178;
               case 204 -> 122;
               case 205 -> 197;
               case 206 -> 146;
               case 207 -> 219;
               case 208 -> 156;
               case 209 -> 54;
               case 210 -> 164;
               case 211 -> 29;
               case 212 -> 67;
               case 213 -> 132;
               case 214 -> 205;
               case 215 -> 151;
               case 216 -> 89;
               case 217 -> 235;
               case 218 -> 154;
               case 219 -> 213;
               case 220 -> 4;
               case 221 -> 251;
               case 222 -> 171;
               case 223 -> 20;
               case 224 -> 55;
               case 225 -> 106;
               case 226 -> 136;
               case 227 -> 57;
               case 228 -> 121;
               case 229 -> 210;
               case 230 -> 173;
               case 231 -> 237;
               case 232 -> 64;
               case 233 -> 60;
               case 234 -> 149;
               case 235 -> 231;
               case 236 -> 246;
               case 237 -> 186;
               case 238 -> 230;
               case 239 -> 188;
               case 240 -> 137;
               case 241 -> 245;
               case 242 -> 160;
               case 243 -> 119;
               case 244 -> 3;
               case 245 -> 128;
               case 246 -> 247;
               case 247 -> 163;
               case 248 -> 9;
               case 249 -> 76;
               case 250 -> 84;
               case 251 -> 244;
               case 252 -> 202;
               case 253 -> 96;
               case 254 -> 242;
               default -> 27;
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
      public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll p0, int p1, java.nio.ByteBuffer p2, int p3, java.lang.Object p4) {
         if ((p3 & 1) != 0) p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if ((p3 & 2) != 0) p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         return p0.a(p1, p2);
      }
   }
   public static void a(float var0, float var1, float var2, int var3, java.lang.Object var4) {
      if ((var3 & 4) != 0) {
         var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d();
      }
      a(var0, var1, var2);
      return;
   }

   public static void a(me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl var0, int var1, float var2, float var3, int[] var4, int var5, java.lang.Object var6) {
      if ((var5 & 8) != 0) {
         var4 = null;
      }
      var0.a(var1, var2, var3, var4);
      return;
   }

   public static void a(java.lang.String var0, float var1, float var2, float var3, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4, me.octo.client.utils.IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl var5, int var6, java.lang.Object var7) {
      if ((var6 & 32) != 0) {
         var5 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }
      a(var0, var1, var2, var3, var4, var5);
      return;
   }

   public static void b(java.lang.String var0, float var1, float var2, float var3, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4, me.octo.client.utils.IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl var5, int var6, java.lang.Object var7) {
      if ((var6 & 32) != 0) {
         var5 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }
      b(var0, var1, var2, var3, var4, var5);
      return;
   }

   public static float a(java.lang.String var0, float var1, me.octo.client.utils.IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl var2, int var3, java.lang.Object var4) {
      if ((var3 & 4) != 0) {
         var2 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }
      return a(var0, var1, var2);
   }

   public static float b(java.lang.String var0, float var1, me.octo.client.utils.IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl var2, int var3, java.lang.Object var4) {
      if ((var3 & 4) != 0) {
         var2 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }
      return b(var0, var1, var2);
   }

   public static void a(java.lang.String var0, float var1, float var2, float var3, float var4, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var5, me.octo.client.utils.IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl var6, float var7, int var8, java.lang.Object var9) {
      if ((var8 & 128) != 0) {
         var7 = 1.0f;
      }
      a(var0, var1, var2, var3, var4, var5, var6, var7);
      return;
   }

   public static float[] a(java.lang.String var0, float var1, float var2, me.octo.client.utils.IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl var3, float var4, int var5, java.lang.Object var6) {
      if ((var5 & 16) != 0) {
         var4 = 1.0f;
      }
      return a(var0, var1, var2, var3, var4);
   }

   public static void a(me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl var0, java.lang.String var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, java.lang.Object var11) {
      if ((var10 & 32) != 0) {
         var6 = 0.0f;
      }
      if ((var10 & 64) != 0) {
         var7 = 0.0f;
      }
      if ((var10 & 128) != 0) {
         var8 = 0.0f;
      }
      if ((var10 & 256) != 0) {
         var9 = 0.0f;
      }
      var0.a(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      return;
   }

   public static void a(me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl var0, java.lang.String var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, int var11, java.lang.Object var12) {
      if ((var11 & 32) != 0) {
         var6 = 0.0f;
      }
      if ((var11 & 64) != 0) {
         var7 = 0.0f;
      }
      if ((var11 & 128) != 0) {
         var8 = 0.0f;
      }
      if ((var11 & 256) != 0) {
         var9 = 0.0f;
      }
      if ((var11 & 512) != 0) {
         var10 = 1.0f;
      }
      var0.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
      return;
   }

   public static void a(me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl var0, me.octo.client.utils.llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, int var11, java.lang.Object var12) {
      if ((var11 & 512) != 0) {
         var10 = 1.0f;
      }
      var0.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
      return;
   }

   public static void a(me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl var0, java.lang.String var1, float var2, float var3, float var4, float var5, float var6, int var7, java.lang.Object var8) {
      if ((var7 & 32) != 0) {
         var6 = 1.0f;
      }
      var0.a(var1, var2, var3, var4, var5, var6);
      return;
   }

   public static void b(me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl var0, java.lang.String var1, float var2, float var3, float var4, float var5, float var6, int var7, java.lang.Object var8) {
      if ((var7 & 32) != 0) {
         var6 = 1.0f;
      }
      var0.b(var1, var2, var3, var4, var5, var6);
      return;
   }

   public static void a(me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl var0, java.lang.String var1, float var2, float var3, float var4, float var5, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6, float var7, float var8, float var9, float var10, float var11, int var12, java.lang.Object var13) {
      if ((var12 & 64) != 0) {
         var7 = 0.0f;
      }
      if ((var12 & 128) != 0) {
         var8 = 0.0f;
      }
      if ((var12 & 256) != 0) {
         var9 = 0.0f;
      }
      if ((var12 & 512) != 0) {
         var10 = 0.0f;
      }
      if ((var12 & 1024) != 0) {
         var11 = 1.0f;
      }
      var0.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
      return;
   }

   public static void a(me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl var0, me.octo.client.utils.llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII var1, float var2, float var3, float var4, float var5, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6, float var7, float var8, float var9, float var10, float var11, int var12, java.lang.Object var13) {
      if ((var12 & 1024) != 0) {
         var11 = 1.0f;
      }
      var0.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
      return;
   }

   public static void a(me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl var0, java.lang.String var1, float var2, float var3, float var4, float var5, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6, float var7, float var8, int var9, java.lang.Object var10) {
      if ((var9 & 64) != 0) {
         var7 = 0.0f;
      }
      if ((var9 & 128) != 0) {
         var8 = 1.0f;
      }
      var0.a(var1, var2, var3, var4, var5, var6, var7, var8);
      return;
   }

   public static void a(me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl var0, java.lang.String var1, float var2, float var3, float var4, float var5, int var6, float var7, float var8, int var9, java.lang.Object var10) {
      if ((var9 & 64) != 0) {
         var7 = 0.0f;
      }
      if ((var9 & 128) != 0) {
         var8 = 1.0f;
      }
      var0.a(var1, var2, var3, var4, var5, var6, var7, var8);
      return;
   }

   public static void a(me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl var0, java.lang.String var1, float var2, float var3, float var4, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var5, float var6, int var7, java.lang.Object var8) {
      if ((var7 & 32) != 0) {
         var6 = 1.0f;
      }
      var0.a(var1, var2, var3, var4, var5, var6);
      return;
   }

   public static void b(me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl var0, java.lang.String var1, float var2, float var3, float var4, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var5, float var6, int var7, java.lang.Object var8) {
      if ((var7 & 32) != 0) {
         var6 = 1.0f;
      }
      var0.b(var1, var2, var3, var4, var5, var6);
      return;
   }

   public static void b(me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl var0, java.lang.String var1, float var2, float var3, float var4, float var5, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6, float var7, float var8, int var9, java.lang.Object var10) {
      if ((var9 & 64) != 0) {
         var7 = 0.0f;
      }
      if ((var9 & 128) != 0) {
         var8 = 1.0f;
      }
      var0.b(var1, var2, var3, var4, var5, var6, var7, var8);
      return;
   }

   public static void a(java.lang.String var0, float var1, float var2, float var3, int var4, me.octo.client.utils.IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl var5, int var6, java.lang.Object var7) {
      if ((var6 & 32) != 0) {
         var5 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }
      a(var0, var1, var2, var3, var4, var5);
      return;
   }

   private final int b(me.octo.client.utils.llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII var1) {
      this.c();
      int[] var2 = new int[1];
      int[] var3 = new int[1];
      int[] var4 = new int[1];
      java.nio.ByteBuffer var5 = var1.d();
      java.nio.ByteBuffer var6 = org.lwjgl.stb.STBImage.stbi_load_from_memory(var5, var2, var3, var4, 4);
      if (var6 == null) {
         return 0;
      }
      int var7 = this.a(var2[0], var3[0], 0, var6);
      org.lwjgl.stb.STBImage.stbi_image_free(var6);
      return var7;
   }
}