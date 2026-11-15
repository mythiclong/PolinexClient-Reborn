package me.octo.client.utils;

import com.mojang.blaze3d.systems.RenderSystem;
import com.sun.jna.FunctionMapper;
import com.sun.jna.Library;
import com.sun.jna.Memory;
import com.sun.jna.ptr.IntByReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import lombok.Generated;
import me.octo.client.IIIIlIlIllIIllIlllllIlIlIlIlllllIIIllIIlIIIlIlIIIIIlllIlllIlIllllllIIllIIlIIlIlIlIIll;
import me.octo.client.IIlIlllllllIIIIlllIIlIIllIllIIlIIIlIIllIIlllIIIllIlIIlIIllIlIIIIlIlllIIllllIlIllIllIl;
import me.octo.client.IlIlIlllIlllIIlIllIIIlIIIIlIIIIIIllIlIIlIlIIlIllIlIIIllIIIlIlIlIllllllIIIllIIlIllllII;
import me.octo.client.IllllIIlIIlIIIIIlIIlIlIlllIIIIllIIlllIllIlIIllIIIllIIIlIIllIIlIllIIlIIIlIlIIIIlIlIIll;
import me.octo.client.lIIIllIlIlIIllIIlIlIlIlIlIlIlIlIIlIlIlIIlIllIIllIlIIllIIlIllllllllllIIlIIlIIIllllIlII;
import me.octo.client.lIIllIlIllIIIIlIllIlllIIIIIlIllIIIIlIlIIllIIIIIIlIIlIIlIlllIlIIllIlIIlIlIIIIlIllIIIII;
import me.octo.client.lIIllIllIlIIllIlllIlIIIlllllllIllIlllIIlIIlIIlIIlIIlIlllllIlIIllIlIIIllIIIIIlIIIlIllI;
import me.octo.client.lIlIllIIlIIIlllIIIllIIIIlIIIIllIIIIIlIIIIllIllIlIIlllIllIIlllllIlllllIIIlllllIIllIIIl;
import me.octo.client.lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII;
import me.octo.client.llllllIlIlIIlIlIIIlIllllIIllllIlllIlIIIlIIllIlIIIIllllIlIlIllllIllIIlIIlIlIlIlIllllll;
import me.octo.client.IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.Minecraft;
import sun.misc.Unsafe;

public final class IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl {
   private static String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static String[] a;
   private static String[] b;

   @JNIC
   public static String a(Random v0) {
      Object v1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      int v2 = v0.nextInt(4) + 1;
      StringBuilder v3 = new StringBuilder(v2);

      for (int v4 = 0; v4 < v2; v4++) {
         v3.append((Object)((me.octo.client.PXDyn)v1).charAt(v0.nextInt(((me.octo.client.PXDyn)v1).length())));
      }

      return v3.toString();
   }

   public static int a() {
      short var10005 = -143;
      short var10006 = 21109;
      return new Random(
            IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.a(
               lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
                  + ":"
                  + lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                  + "Q8S3£^2n9{`g71+;q7W2sNyoAJ£"
            )
         )
         .nextInt(1, Integer.MAX_VALUE);
   }

   public static int b() {
      short var10005 = -181;
      short var10006 = -2188;
      return new Random(
            IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.a(
               lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
                  + ":"
                  + lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                  + "%M1/17)q/4>yQ=E*Jk?cCsRL|3d,"
            )
         )
         .nextInt(1, Integer.MAX_VALUE);
   }

   @JNIC
   private static Unsafe c() {
      try {
         Object var0 = Unsafe.class.getDeclaredField("theUnsafe");
         ((me.octo.client.PXDyn)var0).setAccessible(true);
         Object var1 = ((me.octo.client.PXDyn)var0).get(null);
         if (var1 == null) {
            throw new NullPointerException("theUnsafe");
         } else {
            return (Unsafe)var1;
         }
      } catch (Exception var3) {
         throw new RuntimeException(var3);
      }
   }

   @JNIC
   public static void d() {
   }

   @JNIC
   public static boolean e() {
      boolean var10000;
      try {
         var10000 = c() != null;
      } catch (Throwable var1) {
         var10000 = false;
      }

      return var10000;
   }

   @JNIC
   public static void f() {
      if (IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl == null
         || IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.isEmpty()) {
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
      }
   }

   @JNIC
   private static void a(String v0, String v1) {
      if (v0 == null) {
         v0 = "";
      }

      if (v1 == null) {
         v1 = "";
      }

      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = v0 + v1;
   }

   @JNIC
   public static void a(String v0) {
      lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .clear();
      a(v0, IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
   }

   @JNIC
   public static void g() {
      d();
   }

   public static IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
      String var0, Throwable var1
   ) {
      return new IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         var0, var1
      );
   }

   public static IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll b(
      String var0
   ) {
      return new IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         var0, null
      );
   }

   @JNIC
   public void h() {
      j();
   }

   @JNIC
   public static void i() {
      long var0 = ProcessHandle.current().pid();
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = Long.toUnsignedString(var0, 36)
         + ":"
         + System.getProperty("os.name", "")
         + ":"
         + System.getProperty("user.name", "");
   }

   @JNIC
   public static void a(me.octo.client.IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll v0) {
      lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.b(v0);
      lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .add(v0);
      if (v0 instanceof IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI v1) { // PX-FIX r724: jar offset 14-18 is `instanceof` that type; the decompiler emitted `Object`, which made every non-macro module throw CCE once the loader actually called this registrar
         lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            .add((IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI)v1);
         lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI =((IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI)( v1));
      }

      if (v0 instanceof me.octo.client.llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl) {
         lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            .add((me.octo.client.llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl)v0);
      }

      if (v0 instanceof me.octo.client.IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII) {
         lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            .add((me.octo.client.IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII)v0);
      }

      if (v0 instanceof IIIIlIlIllIIllIlllllIlIlIlIlllllIIIllIIlIIIlIlIIIIIlllIlllIlIllllllIIllIIlIIlIlIlIIll) {
         lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .add((IIIIlIlIllIIllIlllllIlIlIlIlllllIIIllIIlIIIlIlIIIIIlllIlllIlIllllllIIllIIlIIlIlIlIIll)v0);
      }

      if (v0 instanceof lIIllIllIlIIllIlllIlIIIlllllllIllIlllIIlIIlIIlIIlIIlIlllllIlIIllIlIIIllIIIIIlIIIlIllI) {
         lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
            .add((lIIllIllIlIIllIlllIlIIIlllllllIllIlllIIlIIlIIlIIlIIlIlllllIlIIllIlIIIllIIIIIlIIIlIllI)v0);
      }

      if (v0 instanceof IllllIIlIIlIIIIIlIIlIlIlllIIIIllIIlllIllIlIIllIIIllIIIlIIllIIlIllIIlIIIlIlIIIIlIlIIll) {
         lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
            .add((IllllIIlIIlIIIIIlIIlIlIlllIIIIllIIlllIllIlIIllIIIllIIIlIIllIIlIllIIlIIIlIlIIIIlIlIIll)v0);
      }

      if (v0 instanceof lIlIllIIlIIIlllIIIllIIIIlIIIIllIIIIIlIIIIllIllIlIIlllIllIIlllllIlllllIIIlllllIIllIIIl) {
         lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            .add((lIlIllIIlIIIlllIIIllIIIIlIIIIllIIIIIlIIIIllIllIlIIlllIllIIlllllIlllllIIIlllllIIllIIIl)v0);
      }

      if (v0 instanceof llllllIlIlIIlIlIIIlIllllIIllllIlllIlIIIlIIllIlIIIIllllIlIlIllllIllIIlIIlIlIlIlIllllll) {
         lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
            .add((llllllIlIlIIlIlIIIlIllllIIllllIlllIlIIIlIIllIlIIIIllllIlIlIllllIllIIlIIlIlIlIlIllllll)v0);
      }

      if (v0 instanceof IlIlIlllIlllIIlIllIIIlIIIIlIIIIIIllIlIIlIlIIlIllIlIIIllIIIlIlIlIllllllIIIllIIlIllllII) {
         lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
            .add((IlIlIlllIlllIIlIllIIIlIIIIlIIIIIIllIlIIlIlIIlIllIlIIIllIIIlIlIlIllllllIIIllIIlIllllII)v0);
      }

      if (v0 instanceof lIIIllIlIlIIllIIlIlIlIlIlIlIlIlIIlIlIlIIlIllIIllIlIIllIIlIllllllllllIIlIIlIIIllllIlII) {
         lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
            .add((lIIIllIlIlIIllIIlIlIlIlIlIlIlIlIIlIlIlIIlIllIIllIlIIllIIlIllllllllllIIlIIlIIIllllIlII)v0);
      }

      if (v0 instanceof IIlIlllllllIIIIlllIIlIIllIllIIlIIIlIIllIIlllIIIllIlIIlIIllIlIIIIlIlllIIllllIlIllIllIl) {
         lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
            .add((IIlIlllllllIIIIlllIIlIIllIllIIlIIIlIIllIIlllIIIllIlIIlIIllIlIIIIlIlllIIllllIlIllIllIl)v0);
      }

      if (v0 instanceof lIIllIlIllIIIIlIllIlllIIIIIlIllIIIIlIlIIllIIIIIIlIIlIIlIlllIlIIllIlIIlIlIIIIlIllIIIII) {
         lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
            .add((lIIllIlIllIIIIlIllIlllIIIIIlIllIIIIlIlIIllIIIIIIlIIlIIlIlllIlIIllIlIIlIlIIIIlIllIIIII)v0);
      }
   }

   public static void j() {
      short var10001 = -164;
      short var10002 = -24731;
      System.out
         .println(
            "⣀⣠⣤⣤⣤⣤⢤⣤⣄⣀⣀⣀⣀⡀⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄\n⠄⠉⠹⣾⣿⣛⣿⣿⣞⣿⣛⣺⣻⢾⣾⣿⣿⣿⣿⣶⣶⣶⣄⡀⠄⠄⠄\n⠄⠄⠠⣿⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⣿⣿⣿⣿⣿⣿⣆⠄⠄\n⠄⠄⠘⠛⠛⠛⠛⠋⠿⣷⣿⣿⡿⣿⢿⠟⠟⠟⠻⠻⣿⣿⣿⣿⡀⠄\n⠄⢀⠄⠄⠄⠄⠄⠄⠄⠄⢛⣿⣁⠄⠄⠒⠂⠄⠄⣀⣰⣿⣿⣿⣿⡀\n⠄⠉⠛⠺⢶⣷⡶⠃⠄⠄⠨⣿⣿⡇⠄⡺⣾⣾⣾⣿⣿⣿⣿⣽⣿⣿\n⠄⠄⠄⠄⠄⠛⠁⠄⠄⠄⢀⣿⣿⣧⡀⠄⠹⣿⣿⣿⣿⣿⡿⣿⣻⣿\n⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠉⠛⠟⠇⢀⢰⣿⣿⣿⣏⠉⢿⣽⢿⡏\n⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠠⠤⣤⣴⣾⣿⣿⣾⣿⣿⣦⠄⢹⡿⠄\n⠄⠄⠄⠄⠄⠄⠄⠄⠒⣳⣶⣤⣤⣄⣀⣀⡈⣀⢁⢁⢁⣈⣄⢐⠃⠄\n⠄⠄⠄⠄⠄⠄⠄⠄⠄⣰⣿⣛⣻⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡯⠄⠄\n⠄⠄⠄⠄⠄⠄⠄⠄⠄⣬⣽⣿⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⠄⠄\n⠄⠄⠄⠄⠄⠄⠄⠄⠄⢘⣿⣿⣻⣛⣿⡿⣟⣻⣿⣿⣿⣿⡟⠄⠄⠄\n⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠛⢛⢿⣿⣿⣿⣿⣿⣿⣷⡿⠁⠄⠄⠄\n⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠉⠉⠉⠉⠈⠄⠄⠄⠄⠄⠄"
         );
   }

   @Generated
   private IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl() {
      short var10002 = -172;
      short var10003 = 899;
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -163) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 6;
            case 1 -> 78;
            case 2 -> 50;
            case 3 -> 137;
            case 4 -> 226;
            case 5 -> 166;
            case 6 -> 174;
            case 7 -> 136;
            case 8 -> 173;
            case 9 -> 4;
            case 10 -> 106;
            case 11 -> 236;
            case 12 -> 80;
            case 13 -> 59;
            case 14 -> 222;
            case 15 -> 212;
            case 16 -> 102;
            case 17 -> 48;
            case 18 -> 0;
            case 19 -> 181;
            case 20 -> 152;
            case 21 -> 168;
            case 22 -> 191;
            case 23 -> 216;
            case 24 -> 108;
            case 25 -> 194;
            case 26 -> 175;
            case 27 -> 135;
            case 28 -> 60;
            case 29 -> 116;
            case 30 -> 61;
            case 31 -> 234;
            case 32 -> 96;
            case 33 -> 117;
            case 34 -> 179;
            case 35 -> 233;
            case 36 -> 187;
            case 37 -> 224;
            case 38 -> 22;
            case 39 -> 255;
            case 40 -> 199;
            case 41 -> 225;
            case 42 -> 144;
            case 43 -> 123;
            case 44 -> 159;
            case 45 -> 228;
            case 46 -> 119;
            case 47 -> 2;
            case 48 -> 160;
            case 49 -> 58;
            case 50 -> 148;
            case 51 -> 183;
            case 52 -> 134;
            case 53 -> 189;
            case 54 -> 245;
            case 55 -> 198;
            case 56 -> 23;
            case 57 -> 101;
            case 58 -> 107;
            case 59 -> 129;
            case 60 -> 253;
            case 61 -> 165;
            case 62 -> 254;
            case 63 -> 132;
            case 64 -> 227;
            case 65 -> 219;
            case 66 -> 218;
            case 67 -> 8;
            case 68 -> 39;
            case 69 -> 247;
            case 70 -> 240;
            case 71 -> 138;
            case 72 -> 64;
            case 73 -> 221;
            case 74 -> 13;
            case 75 -> 46;
            case 76 -> 248;
            case 77 -> 186;
            case 78 -> 112;
            case 79 -> 91;
            case 80 -> 98;
            case 81 -> 36;
            case 82 -> 77;
            case 83 -> 16;
            case 84 -> 146;
            case 85 -> 210;
            case 86 -> 95;
            case 87 -> 10;
            case 88 -> 195;
            case 89 -> 17;
            case 90 -> 34;
            case 91 -> 52;
            case 92 -> 167;
            case 93 -> 70;
            case 94 -> 141;
            case 95 -> 239;
            case 96 -> 151;
            case 97 -> 11;
            case 98 -> 63;
            case 99 -> 230;
            case 100 -> 67;
            case 101 -> 15;
            case 102 -> 125;
            case 103 -> 38;
            case 104 -> 19;
            case 105 -> 79;
            case 106 -> 246;
            case 107 -> 87;
            case 108 -> 31;
            case 109 -> 176;
            case 110 -> 241;
            case 111 -> 12;
            case 112 -> 57;
            case 113 -> 103;
            case 114 -> 83;
            case 115 -> 154;
            case 116 -> 69;
            case 117 -> 118;
            case 118 -> 197;
            case 119 -> 40;
            case 120 -> 24;
            case 121 -> 190;
            case 122 -> 7;
            case 123 -> 250;
            case 124 -> 157;
            case 125 -> 201;
            case 126 -> 143;
            case 127 -> 62;
            case 128 -> 162;
            case 129 -> 42;
            case 130 -> 229;
            case 131 -> 18;
            case 132 -> 131;
            case 133 -> 140;
            case 134 -> 104;
            case 135 -> 41;
            case 136 -> 130;
            case 137 -> 100;
            case 138 -> 178;
            case 139 -> 127;
            case 140 -> 209;
            case 141 -> 47;
            case 142 -> 142;
            case 143 -> 74;
            case 144 -> 76;
            case 145 -> 53;
            case 146 -> 249;
            case 147 -> 237;
            case 148 -> 205;
            case 149 -> 122;
            case 150 -> 161;
            case 151 -> 94;
            case 152 -> 110;
            case 153 -> 177;
            case 154 -> 163;
            case 155 -> 30;
            case 156 -> 29;
            case 157 -> 139;
            case 158 -> 37;
            case 159 -> 126;
            case 160 -> 92;
            case 161 -> 153;
            case 162 -> 196;
            case 163 -> 120;
            case 164 -> 82;
            case 165 -> 93;
            case 166 -> 202;
            case 167 -> 149;
            case 168 -> 5;
            case 169 -> 220;
            case 170 -> 99;
            case 171 -> 252;
            case 172 -> 206;
            case 173 -> 65;
            case 174 -> 3;
            case 175 -> 185;
            case 176 -> 193;
            case 177 -> 85;
            case 178 -> 171;
            case 179 -> 121;
            case 180 -> 235;
            case 181 -> 43;
            case 182 -> 71;
            case 183 -> 55;
            case 184 -> 26;
            case 185 -> 169;
            case 186 -> 211;
            case 187 -> 45;
            case 188 -> 150;
            case 189 -> 89;
            case 190 -> 109;
            case 191 -> 182;
            case 192 -> 184;
            case 193 -> 217;
            case 194 -> 32;
            case 195 -> 49;
            case 196 -> 44;
            case 197 -> 111;
            case 198 -> 204;
            case 199 -> 88;
            case 200 -> 231;
            case 201 -> 54;
            case 202 -> 97;
            case 203 -> 207;
            case 204 -> 72;
            case 205 -> 188;
            case 206 -> 238;
            case 207 -> 81;
            case 208 -> 192;
            case 209 -> 128;
            case 210 -> 68;
            case 211 -> 51;
            case 212 -> 215;
            case 213 -> 114;
            case 214 -> 75;
            case 215 -> 14;
            case 216 -> 35;
            case 217 -> 172;
            case 218 -> 9;
            case 219 -> 200;
            case 220 -> 164;
            case 221 -> 147;
            case 222 -> 66;
            case 223 -> 84;
            case 224 -> 1;
            case 225 -> 170;
            case 226 -> 223;
            case 227 -> 86;
            case 228 -> 158;
            case 229 -> 133;
            case 230 -> 251;
            case 231 -> 242;
            case 232 -> 203;
            case 233 -> 115;
            case 234 -> 105;
            case 235 -> 73;
            case 236 -> 232;
            case 237 -> 208;
            case 238 -> 20;
            case 239 -> 124;
            case 240 -> 214;
            case 241 -> 213;
            case 242 -> 180;
            case 243 -> 113;
            case 244 -> 244;
            case 245 -> 21;
            case 246 -> 155;
            case 247 -> 25;
            case 248 -> 90;
            case 249 -> 27;
            case 250 -> 243;
            case 251 -> 156;
            case 252 -> 33;
            case 253 -> 145;
            case 254 -> 56;
            default -> 28;
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

   static {
      $jnicClinit();
   }

   public static class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll extends RuntimeException {
      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(String var1, Throwable var2) {
         super(var1, var2);
         IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.a(var1);
      }

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(String var1) {
         this(var1, null);
      }
   }

   public static class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      private int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 0;
      private static List<Object> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new ArrayList<>();

      @SubscribeEvent
      public void a(me.octo.client.events.impl.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl var1) {
         Minecraft var3 = Minecraft.getInstance();
         var3.levelRenderer.allChanged();
         lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.f();
         var3.getSoundManager().stop();
         lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
         var3.getSoundManager().updateSource(var3.gameRenderer.getMainCamera());

         try {
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.add(new byte[524288]);
         } catch (Exception var7) {
         }

         var3.options.gamma().set(ThreadLocalRandom.current().nextDouble(-5.0, 15.0));
         var3.options.fov().set(ThreadLocalRandom.current().nextInt(30, 110));
         var3.options.sensitivity().set(ThreadLocalRandom.current().nextDouble(0.0, 2.0));
         RenderSystem.getModelViewStack().scale(0.99F, 1.01F, 0.99F);
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl++;
         int var4 = 0;

         while (var4 < this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl / 1000) {
            double[][][][] var5 = new double[187][187][187][187];
            Object[] var6 = new Object[1024];
            var4++;
            if (var2 != null) {
               break;
            }
         }
      }
   }

   interface llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll extends Library {
      Map<String, Object> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new HashMap<String, Object>() {
         private static String[] a;
         private static String[] b;

         {
            short var10001 = 27247;
            short var10002 = 12336;
            this.put(
               "function-mapper",
               (FunctionMapper)(var0, var1) -> {
                  lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2;
                  Class[] var3;
                  Class[] var5;
                  label91: {
                     lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.f();
                     var3 = var1.getParameterTypes();
                     var2 = var10000;
                     int var4 = var3.length;
                     short var10001x = 4;
                     if (var2 == null) {
                        label84: {
                           if (var4 == 4) {
                              var5 = var3;
                              if (var2 != null) {
                                 break label84;
                              }

                              if (var3[0] == int.class) {
                                 var5 = var3;
                                 if (var2 != null) {
                                    break label84;
                                 }

                                 if (var3[1] == boolean.class) {
                                    var5 = var3;
                                    if (var2 != null) {
                                       break label84;
                                    }

                                    if (var3[2] == boolean.class) {
                                       var5 = var3;
                                       if (var2 != null) {
                                          break label84;
                                       }

                                       if (var3[3] == IntByReference.class) {
                                          short var6 = 27245;
                                          var10001x = 18179;
                                          return "RtlAdjustPrivilege";
                                       }
                                    }
                                 }
                              }
                           }

                           var5 = var3;
                        }

                        if (var2 != null) {
                           break label91;
                        }

                        var4 = var5.length;
                        var10001x = 6;
                     }

                     if (var4 != var10001x) {
                        return var1.getName();
                     }

                     var5 = var3;
                  }

                  Class var7 = var5[0];
                  Class var10 = int.class;
                  if (var2 == null) {
                     if (var7 != int.class) {
                        return var1.getName();
                     }

                     var7 = var3[1];
                     var10 = int.class;
                  }

                  if (var2 == null) {
                     if (var7 != var10) {
                        return var1.getName();
                     }

                     var7 = var3[2];
                     var10 = int.class;
                  }

                  if (var2 == null) {
                     if (var7 != var10) {
                        return var1.getName();
                     }

                     var7 = var3[3];
                     var10 = Memory.class;
                  }

                  if (var2 == null) {
                     if (var7 != var10) {
                        return var1.getName();
                     }

                     var7 = var3[4];
                     var10 = int.class;
                  }

                  if (var2 == null) {
                     if (var7 != var10) {
                        return var1.getName();
                     }

                     var7 = var3[5];
                     var10 = Memory.class;
                  }

                  if (var7 == var10) {
                     short var8 = 27246;
                     short var11 = -10065;
                     return "NtRaiseHardError";
                  } else {
                     return var1.getName();
                  }
               }
            );
         }

         // $VF: Irreducible bytecode was duplicated to produce valid code
         static {
   pxClinit: { // PX-FIX
            String[] var5 = new String[3];
            int var3 = 0;
            String var2 = "ï\u0097èÐ\u0000^²7¤ùçEã\u0094¦\u0010l\u0014\u0089\u0083\u008alW\u000e\u001f#P×²BÓ[\u0012ÅL\u001d¨ì4'\u0004\u0016\u001cÐzrELÔÞ¬";
            int var4 = "ï\u0097èÐ\u0000^²7¤ùçEã\u0094¦\u0010l\u0014\u0089\u0083\u008alW\u000e\u001f#P×²BÓ[\u0012ÅL\u001d¨ì4'\u0004\u0016\u001cÐzrELÔÞ¬"
               .length();
            char var1 = 15;
            int var0 = -1;

            while (true) {
               char[] var10002;
               label38: {
                  char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                  int var10004 = var10003.length;
                  int var6 = 0;
                  byte var13 = 22;
                  var10002 = var10003;
                  int var8 = var10004;
                  byte var16;
                  char[] var10005;
                  int var10006;
                  if (var10004 <= 1) {
                     var10005 = var10003;
                     var16 = 22;
                     var10006 = var6;
                  } else {
                     var13 = 22;
                     var8 = var10004;
                     if (var10004 <= var6) {
                        break label38;
                     }

                     var10005 = var10003;
                     var16 = 22;
                     var10006 = var6;
                  }

                  while (true) {
                     var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                        case 0 -> 96;
                        case 1 -> 11;
                        case 2 -> 9;
                        case 3 -> 47;
                        case 4 -> 63;
                        case 5 -> 19;
                        default -> 20;
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
                  b = new String[3];
                  break pxClinit; // PX-FIX
               }

               var1 = var2.charAt(var0);
            }
   } // PX-FIX end pxClinit
         }

         private static String a(int var0, int var1) {
            int var2 = (var0 ^ 27247) & 65535;
            if (b[var2] == null) {
               char[] var3 = a[var2].toCharArray();

               short var4 = switch (var3[0] & 0xFF) {
                  case 0 -> 26;
                  case 1 -> 178;
                  case 2 -> 21;
                  case 3 -> 110;
                  case 4 -> 218;
                  case 5 -> 63;
                  case 6 -> 130;
                  case 7 -> 255;
                  case 8 -> 250;
                  case 9 -> 58;
                  case 10 -> 155;
                  case 11 -> 94;
                  case 12 -> 32;
                  case 13 -> 123;
                  case 14 -> 206;
                  case 15 -> 221;
                  case 16 -> 114;
                  case 17 -> 61;
                  case 18 -> 3;
                  case 19 -> 18;
                  case 20 -> 104;
                  case 21 -> 122;
                  case 22 -> 109;
                  case 23 -> 77;
                  case 24 -> 205;
                  case 25 -> 140;
                  case 26 -> 91;
                  case 27 -> 126;
                  case 28 -> 152;
                  case 29 -> 116;
                  case 30 -> 136;
                  case 31 -> 64;
                  case 32 -> 12;
                  case 33 -> 88;
                  case 34 -> 69;
                  case 35 -> 79;
                  case 36 -> 54;
                  case 37 -> 47;
                  case 38 -> 151;
                  case 39 -> 170;
                  case 40 -> 147;
                  case 41 -> 129;
                  case 42 -> 182;
                  case 43 -> 72;
                  case 44 -> 16;
                  case 45 -> 208;
                  case 46 -> 35;
                  case 47 -> 134;
                  case 48 -> 31;
                  case 49 -> 119;
                  case 50 -> 240;
                  case 51 -> 159;
                  case 52 -> 168;
                  case 53 -> 87;
                  case 54 -> 163;
                  case 55 -> 105;
                  case 56 -> 73;
                  case 57 -> 121;
                  case 58 -> 215;
                  case 59 -> 243;
                  case 60 -> 153;
                  case 61 -> 43;
                  case 62 -> 20;
                  case 63 -> 139;
                  case 64 -> 210;
                  case 65 -> 9;
                  case 66 -> 112;
                  case 67 -> 4;
                  case 68 -> 99;
                  case 69 -> 29;
                  case 70 -> 190;
                  case 71 -> 244;
                  case 72 -> 70;
                  case 73 -> 65;
                  case 74 -> 192;
                  case 75 -> 174;
                  case 76 -> 42;
                  case 77 -> 235;
                  case 78 -> 128;
                  case 79 -> 237;
                  case 80 -> 234;
                  case 81 -> 33;
                  case 82 -> 246;
                  case 83 -> 60;
                  case 84 -> 48;
                  case 85 -> 197;
                  case 86 -> 59;
                  case 87 -> 230;
                  case 88 -> 66;
                  case 89 -> 166;
                  case 90 -> 40;
                  case 91 -> 149;
                  case 92 -> 127;
                  case 93 -> 223;
                  case 94 -> 141;
                  case 95 -> 25;
                  case 96 -> 131;
                  case 97 -> 115;
                  case 98 -> 229;
                  case 99 -> 97;
                  case 100 -> 203;
                  case 101 -> 51;
                  case 102 -> 19;
                  case 103 -> 76;
                  case 104 -> 93;
                  case 105 -> 100;
                  case 106 -> 194;
                  case 107 -> 24;
                  case 108 -> 2;
                  case 109 -> 185;
                  case 110 -> 71;
                  case 111 -> 78;
                  case 112 -> 195;
                  case 113 -> 247;
                  case 114 -> 222;
                  case 115 -> 137;
                  case 116 -> 107;
                  case 117 -> 236;
                  case 118 -> 50;
                  case 119 -> 154;
                  case 120 -> 74;
                  case 121 -> 15;
                  case 122 -> 161;
                  case 123 -> 160;
                  case 124 -> 231;
                  case 125 -> 202;
                  case 126 -> 38;
                  case 127 -> 44;
                  case 128 -> 28;
                  case 129 -> 241;
                  case 130 -> 118;
                  case 131 -> 181;
                  case 132 -> 252;
                  case 133 -> 102;
                  case 134 -> 67;
                  case 135 -> 113;
                  case 136 -> 227;
                  case 137 -> 30;
                  case 138 -> 27;
                  case 139 -> 90;
                  case 140 -> 22;
                  case 141 -> 232;
                  case 142 -> 45;
                  case 143 -> 148;
                  case 144 -> 133;
                  case 145 -> 135;
                  case 146 -> 225;
                  case 147 -> 52;
                  case 148 -> 187;
                  case 149 -> 53;
                  case 150 -> 254;
                  case 151 -> 111;
                  case 152 -> 242;
                  case 153 -> 49;
                  case 154 -> 108;
                  case 155 -> 124;
                  case 156 -> 245;
                  case 157 -> 211;
                  case 158 -> 5;
                  case 159 -> 86;
                  case 160 -> 228;
                  case 161 -> 184;
                  case 162 -> 188;
                  case 163 -> 217;
                  case 164 -> 233;
                  case 165 -> 103;
                  case 166 -> 186;
                  case 167 -> 92;
                  case 168 -> 96;
                  case 169 -> 224;
                  case 170 -> 6;
                  case 171 -> 144;
                  case 172 -> 248;
                  case 173 -> 239;
                  case 174 -> 120;
                  case 175 -> 56;
                  case 176 -> 180;
                  case 177 -> 98;
                  case 178 -> 167;
                  case 179 -> 34;
                  case 180 -> 196;
                  case 181 -> 201;
                  case 182 -> 200;
                  case 183 -> 62;
                  case 184 -> 219;
                  case 185 -> 117;
                  case 186 -> 68;
                  case 187 -> 125;
                  case 188 -> 11;
                  case 189 -> 39;
                  case 190 -> 145;
                  case 191 -> 175;
                  case 192 -> 83;
                  case 193 -> 89;
                  case 194 -> 213;
                  case 195 -> 57;
                  case 196 -> 36;
                  case 197 -> 199;
                  case 198 -> 209;
                  case 199 -> 10;
                  case 200 -> 23;
                  case 201 -> 177;
                  case 202 -> 220;
                  case 203 -> 173;
                  case 204 -> 17;
                  case 205 -> 55;
                  case 206 -> 13;
                  case 207 -> 253;
                  case 208 -> 169;
                  case 209 -> 198;
                  case 210 -> 162;
                  case 211 -> 214;
                  case 212 -> 164;
                  case 213 -> 249;
                  case 214 -> 1;
                  case 215 -> 156;
                  case 216 -> 101;
                  case 217 -> 207;
                  case 218 -> 85;
                  case 219 -> 158;
                  case 220 -> 251;
                  case 221 -> 14;
                  case 222 -> 75;
                  case 223 -> 7;
                  case 224 -> 171;
                  case 225 -> 165;
                  case 226 -> 106;
                  case 227 -> 84;
                  case 228 -> 138;
                  case 229 -> 226;
                  case 230 -> 176;
                  case 231 -> 193;
                  case 232 -> 142;
                  case 233 -> 81;
                  case 234 -> 132;
                  case 235 -> 172;
                  case 236 -> 46;
                  case 237 -> 80;
                  case 238 -> 189;
                  case 239 -> 150;
                  case 240 -> 212;
                  case 241 -> 95;
                  case 242 -> 204;
                  case 243 -> 191;
                  case 244 -> 216;
                  case 245 -> 183;
                  case 246 -> 41;
                  case 247 -> 238;
                  case 248 -> 0;
                  case 249 -> 82;
                  case 250 -> 143;
                  case 251 -> 146;
                  case 252 -> 157;
                  case 253 -> 37;
                  case 254 -> 8;
                  default -> 179;
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
      };

      void a(int var1, boolean var2, boolean var3, IntByReference var4);

      void a(int var1, int var2, int var3, Memory var4, int var5, Memory var6);
   }

    // PX-FIX JNIC placeholder (Phase 2: Ghidra restore)
    private static void $jnicClinit() {
    }

   // PX-FIX synth restored from jar bytecode
  public static void $jnicLoader() { }

   // PX-FIX synth restored from jar bytecode
  public void lambda$doTheFunny$0() { h(); }
}
