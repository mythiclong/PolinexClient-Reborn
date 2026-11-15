package me.octo.client;

import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII;
import me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.nanovg.NVGPaint;
import org.lwjgl.nanovg.NanoVG;

public final class IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII {
   @NotNull
   public static IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static ConcurrentHashMap<String, Integer> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static ConcurrentHashMap<String, Boolean> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static ConcurrentHashMap<String, IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static String[] a;
   private static String[] b;

   private IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII() {
   }

   public final void a(@NotNull String var1, float var2, float var3, float var4) {
      label29: {
         int[] var5;
         label25: {
            short var10001 = -14560;
            short var10002 = -9795;
            Intrinsics.checkNotNullParameter(var1, "username");
            int[] var10000 = IlIlIllIlIlllIllIlIIIIllIIIIIIIIlIlllllIlIlllIIIlIllIIIllIlIIlllllIllllIIllIllllIllII.f();
            lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
            var5 = var10000;
            Integer var6 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.get(var1);
            Integer var11 = var6;
            if (var5 == null) {
               if (var6 == null) {
                  break label25;
               }

               var11 = var6;
            }

            byte var7 = -1;
            if (var11 != var7) {
               NVGPaint var8 = NanoVG.nvgImagePattern(
                  lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(),
                  var2 - var4 / 2,
                  var3 - var4 / 2,
                  var4,
                  var4,
                  0.0F,
                  var6,
                  1.0F,
                  NVGPaint.create()
               );
               var10001 = -14552;
               var10002 = 27310;
               Intrinsics.checkNotNullExpressionValue(var8, "nvgImagePattern(...)");
               NanoVG.nvgBeginPath(
                  lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b()
               );
               NanoVG.nvgCircle(
                  lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(),
                  var2,
                  var3,
                  var4 / 2
               );
               NanoVG.nvgFillPaint(
                  lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(),
                  var8
               );
               NanoVG.nvgFill(
                  lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b()
               );
               if (var5 == null) {
                  break label29;
               }
            }
         }

         NVGPaint var12 = NanoVG.nvgRadialGradient(
            lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(),
            var2,
            var3,
            0.0F,
            var4 / 2,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .ad()
               .u(),
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .ac()
               .u(),
            NVGPaint.create()
         );
         short var16 = -14553;
         short var10003 = 3158;
         Intrinsics.checkNotNullExpressionValue(var12, "nvgRadialGradient(...)");
         NVGPaint var9 = var12;
         NanoVG.nvgBeginPath(
            lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b()
         );
         NanoVG.nvgCircle(
            lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(),
            var2,
            var3,
            var4 / 2
         );
         NanoVG.nvgFillPaint(
            lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(),
            var9
         );
         NanoVG.nvgFill(
            lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b()
         );
         float var10 = var4 * 0.55F;
         short var14 = -14558;
         var16 = 4714;
         lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b(
            lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            "\n        <svg viewBox=\"0 0 24 24\" fill=\"currentColor\">\n            <circle cx=\"12\" cy=\"7\" r=\"5\"/>\n            <path d=\"M12 14c-6 0-10 3-10 7v3h20v-3c0-4-4-7-10-7z\"/>\n        </svg>\n    ",
            var2 - var10 / 2,
            var3 - var10 / 2,
            var10,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(),
            0.0F);
         if (var5 != null) {
            return;
         }

         if (IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.putIfAbsent(var1, true) == null) {
            this.a(var1);
         }
      }

      NanoVG.nvgBeginPath(
         lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b()
      );
      NanoVG.nvgCircle(
         lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         var2,
         var3,
         var4 / 2
      );
      NanoVG.nvgStrokeWidth(
         lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         2.0F
      );
      NanoVG.nvgStrokeColor(
         lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .ag()
            .u()
      );
      NanoVG.nvgStroke(
         lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b()
      );
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
   }

   private final void a(String var1) {
      IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(() -> b(var1)); // PX-FIX: jar BSM#0 impl b:(Ljava/lang/String;)Lkotlin/Unit;
   }

   public final void a() {
      int[] var0 = me.octo.client.IlIlIllIlIlllIllIlIIIIllIIIIIIIIlIlllllIlIlllIIIlIllIIIllIlIIlllllIllllIIllIllllIllII.f();
      java.util.Map map = (java.util.Map)IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      java.util.Iterator var2 = map.entrySet().iterator();
      int[] var1 = var0;
      while (var2.hasNext()) {
         java.util.Map.Entry var3 = (java.util.Map.Entry)var2.next();
         String var4 = (String)var3.getKey();
         IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var5 = (IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var3.getValue();
         long var6 = (long)var5.a() * (long)var5.b() * 4L;
         if (var5.a() >= 1 && var5.b() >= 1 && (long)var5.c().remaining() >= var6) {
            try {
               int var8 = org.lwjgl.nanovg.NanoVG.nvgCreateImageRGBA(me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(), var5.a(), var5.b(), 0, var5.c());
               map.put(var4, Integer.valueOf(var8 > 0 ? var8 : -1));
            } catch (Exception var9) {
               map.put(var4, Integer.valueOf(-1));
            }
         } else {
            map.put(var4, Integer.valueOf(-1));
         }
         var2.remove();
         IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.remove(var4);
      }
   }

   public final void b() {
      Collection var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.values();
      short var10002 = -14554;
      short var10003 = -27364;
      Intrinsics.checkNotNullExpressionValue(var10000, "<get-values>(...)");
      Iterable var2 = var10000;
      int[] var9 = IlIlIllIlIlllIllIlIIIIllIIIIIIIIlIlllllIlIlllIIIlIllIIIllIlIIlllllIllllIIllIllllIllII.f();
      boolean var3 = false;
      int[] var1 = var9;
      Iterator var4 = var2.iterator();

      while (true) {
         if (var4.hasNext()) {
            Object var5 = var4.next();
            Integer var6 = (Integer)var5;
            boolean var7 = false;
            if (var1 != null) {
               break;
            }

            byte var8 = -1;
            if (var6 == null || var6 != var8) {
               long var10 = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b();
               Intrinsics.checkNotNull(var6);
               NanoVG.nvgDeleteImage(var10, var6);
            }

            if (var1 == null) {
               continue;
            }
         }

         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.clear();
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.clear();
         lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clear();
         break;
      }
   }

   private static final Unit b(String param0) {
      int[] var1 = me.octo.client.IlIlIllIlIlllIllIlIIIIllIIIIIIIIlIlllllIlIlllIIIlIllIIIllIlIIlllllIllllIIllIllllIllII.f();
      try {
         int var2 = 128;
         java.net.URL var3 = new java.net.URL("https://mc-heads.net/avatar/" + param0 + "/" + var2);
         java.net.HttpURLConnection var4 = (java.net.HttpURLConnection)var3.openConnection();
         Intrinsics.checkNotNull(var4, "null cannot be cast to non-null type java.net.HttpURLConnection");
         var4.setRequestProperty("User-Agent", "Mozilla/5.0 (Polinex Client)");
         var4.connect();
         java.awt.image.BufferedImage var5 = javax.imageio.ImageIO.read(var4.getInputStream());
         if (var5 != null && var5.getWidth() >= 1 && var5.getHeight() >= 1) {
            int var6 = var5.getWidth();
            int var7 = var5.getHeight();
            int[] var8 = new int[var6 * var7];
            var5.getRGB(0, 0, var6, var7, var8, 0, var6);
            byte[] var9 = new byte[var6 * var7 * 4];
            for (int var10 = 0, var11 = var8.length; var10 < var11; var10++) {
               int var12 = var8[var10];
               int var13 = var10 * 4;
               var9[var13] = (byte)(var12 >> 16 & 255);
               var9[var13 + 1] = (byte)(var12 >> 8 & 255);
               var9[var13 + 2] = (byte)(var12 & 255);
               var9[var13 + 3] = (byte)(var12 >> 24 & 255);
            }
            ByteBuffer var10 = org.lwjgl.BufferUtils.createByteBuffer(var9.length);
            Intrinsics.checkNotNullExpressionValue(var10, "createByteBuffer(...)");
            var10.put(var9);
            var10.flip();
            ((java.util.Map<String, me.octo.client.IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll>)lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI).put(param0, new me.octo.client.IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(var6, var7, var10));
         } else {
            ((java.util.Map<String, Integer>)lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII).put(param0, -1);
            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.remove(param0);
         }
      } catch (Exception var3) {
         ((java.util.Map<String, Integer>)lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII).put(param0, -1);
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.remove(param0);
      }
      return Unit.INSTANCE;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IlIlIllIlIlllIllIlIIIIllIIIIIIIIlIlllllIlIlllIIIlIllIIIllIlIIlllllIllllIIllIllllIllII.f ()[I
      // 003: astore 1
      // 004: nop
      // 005: sipush 128
      // 008: istore 2
      // 009: new java/net/URL
      // 00c: dup
      // 00d: aload 0
      // 00e: iload 2
      // 00f: sipush -14559
      // 012: sipush -24397
      // 015: pop2
      // 016: ldc_w "https://mc-heads.net/avatar/"
      // 019: dup_x2
      // 01a: pop
      // 01b: ldc_w "/"
      // 01e: swap
      // 01f: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001" ]
      // 024: invokespecial java/net/URL.<init> (Ljava/lang/String;)V
      // 027: astore 3
      // 028: aload 3
      // 029: invokevirtual java/net/URL.openConnection ()Ljava/net/URLConnection;
      // 02c: dup
      // 02d: sipush -14555
      // 030: sipush 29400
      // 033: pop2
      // 034: ldc_w "null cannot be cast to non-null type java.net.HttpURLConnection"
      // 037: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
      // 03a: checkcast java/net/HttpURLConnection
      // 03d: astore 4
      // 03f: aload 4
      // 041: sipush -14551
      // 044: sipush -6703
      // 047: pop2
      // 048: ldc_w "User-Agent"
      // 04b: sipush -14557
      // 04e: sipush -6869
      // 051: pop2
      // 052: ldc_w "Mozilla/5.0 (Polinex Client)"
      // 055: invokevirtual java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 058: aload 4
      // 05a: invokevirtual java/net/HttpURLConnection.connect ()V
      // 05d: aload 4
      // 05f: invokevirtual java/net/HttpURLConnection.getInputStream ()Ljava/io/InputStream;
      // 062: invokestatic javax/imageio/ImageIO.read (Ljava/io/InputStream;)Ljava/awt/image/BufferedImage;
      // 065: astore 5
      // 067: aload 5
      // 069: aload 1
      // 06a: ifnonnull 1ae
      // 06d: ifnull 18f
      // 070: goto 077
      // 073: invokestatic me/octo/client/IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 076: athrow
      // 077: aload 5
      // 079: aload 1
      // 07a: ifnonnull 1ae
      // 07d: goto 084
      // 080: invokestatic me/octo/client/IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 083: athrow
      // 084: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 087: bipush 1
      // 088: if_icmplt 18f
      // 08b: goto 092
      // 08e: invokestatic me/octo/client/IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 091: athrow
      // 092: aload 5
      // 094: aload 1
      // 095: ifnonnull 1ae
      // 098: goto 09f
      // 09b: invokestatic me/octo/client/IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09e: athrow
      // 09f: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 0a2: bipush 1
      // 0a3: if_icmplt 18f
      // 0a6: goto 0ad
      // 0a9: invokestatic me/octo/client/IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ac: athrow
      // 0ad: aload 5
      // 0af: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 0b2: istore 6
      // 0b4: aload 5
      // 0b6: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 0b9: istore 7
      // 0bb: iload 6
      // 0bd: iload 7
      // 0bf: imul
      // 0c0: newarray 10
      // 0c2: astore 8
      // 0c4: aload 5
      // 0c6: bipush 0
      // 0c7: bipush 0
      // 0c8: iload 6
      // 0ca: iload 7
      // 0cc: aload 8
      // 0ce: bipush 0
      // 0cf: iload 6
      // 0d1: invokevirtual java/awt/image/BufferedImage.getRGB (IIII[III)[I
      // 0d4: pop
      // 0d5: iload 6
      // 0d7: iload 7
      // 0d9: imul
      // 0da: bipush 4
      // 0db: imul
      // 0dc: newarray 8
      // 0de: astore 9
      // 0e0: bipush 0
      // 0e1: istore 10
      // 0e3: aload 8
      // 0e5: arraylength
      // 0e6: istore 11
      // 0e8: iload 10
      // 0ea: iload 11
      // 0ec: if_icmpge 14d
      // 0ef: aload 8
      // 0f1: iload 10
      // 0f3: iaload
      // 0f4: istore 12
      // 0f6: iload 10
      // 0f8: bipush 4
      // 0f9: imul
      // 0fa: istore 13
      // 0fc: aload 9
      // 0fe: iload 13
      // 100: iload 12
      // 102: bipush 16
      // 104: ishr
      // 105: sipush 255
      // 108: iand
      // 109: i2b
      // 10a: bastore
      // 10b: aload 9
      // 10d: iload 13
      // 10f: bipush 1
      // 110: iadd
      // 111: iload 12
      // 113: bipush 8
      // 115: ishr
      // 116: sipush 255
      // 119: iand
      // 11a: i2b
      // 11b: bastore
      // 11c: aload 9
      // 11e: iload 13
      // 120: bipush 2
      // 121: iadd
      // 122: iload 12
      // 124: sipush 255
      // 127: iand
      // 128: i2b
      // 129: bastore
      // 12a: aload 9
      // 12c: iload 13
      // 12e: bipush 3
      // 12f: iadd
      // 130: iload 12
      // 132: bipush 24
      // 134: ishr
      // 135: sipush 255
      // 138: iand
      // 139: i2b
      // 13a: bastore
      // 13b: iinc 10 1
      // 13e: aload 1
      // 13f: ifnonnull 1cc
      // 142: aload 1
      // 143: ifnull 0e8
      // 146: goto 14d
      // 149: invokestatic me/octo/client/IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14c: athrow
      // 14d: aload 9
      // 14f: arraylength
      // 150: invokestatic org/lwjgl/BufferUtils.createByteBuffer (I)Ljava/nio/ByteBuffer;
      // 153: dup
      // 154: sipush -14556
      // 157: sipush -9512
      // 15a: pop2
      // 15b: ldc_w "createByteBuffer(...)"
      // 15e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 161: astore 10
      // 163: aload 10
      // 165: aload 9
      // 167: invokevirtual java/nio/ByteBuffer.put ([B)Ljava/nio/ByteBuffer;
      // 16a: pop
      // 16b: aload 10
      // 16d: invokevirtual java/nio/ByteBuffer.flip ()Ljava/nio/ByteBuffer;
      // 170: pop
      // 171: getstatic me/octo/client/IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Ljava/util/concurrent/ConcurrentHashMap;
      // 174: checkcast java/util/Map
      // 177: aload 0
      // 178: new me/octo/client/IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 17b: dup
      // 17c: iload 6
      // 17e: iload 7
      // 180: aload 10
      // 182: invokespecial me/octo/client/IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.<init> (IILjava/nio/ByteBuffer;)V
      // 185: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 18a: pop
      // 18b: aload 1
      // 18c: ifnull 1cc
      // 18f: getstatic me/octo/client/IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Ljava/util/concurrent/ConcurrentHashMap;
      // 192: checkcast java/util/Map
      // 195: aload 0
      // 196: bipush -1
      // 197: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 19a: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 19f: pop
      // 1a0: getstatic me/octo/client/IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Ljava/util/concurrent/ConcurrentHashMap;
      // 1a3: aload 0
      // 1a4: invokevirtual java/util/concurrent/ConcurrentHashMap.remove (Ljava/lang/Object;)Ljava/lang/Object;
      // 1a7: goto 1ae
      // 1aa: invokestatic me/octo/client/IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ad: athrow
      // 1ae: pop
      // 1af: goto 1cc
      // 1b2: astore 3
      // 1b3: getstatic me/octo/client/IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Ljava/util/concurrent/ConcurrentHashMap;
      // 1b6: checkcast java/util/Map
      // 1b9: aload 0
      // 1ba: bipush -1
      // 1bb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1be: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1c3: pop
      // 1c4: getstatic me/octo/client/IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Ljava/util/concurrent/ConcurrentHashMap;
      // 1c7: aload 0
      // 1c8: invokevirtual java/util/concurrent/ConcurrentHashMap.remove (Ljava/lang/Object;)Ljava/lang/Object;
      // 1cb: pop
      // 1cc: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 1cf: areturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[10];
      int var3 = 0;
      String var2 = "wed\u0082\u0081§,ÿ\u001cyN\n\u0002b®¬¤\u000e\tmìêKÓk\u0088_5\u0096\u0092jÒU×,Ø5¹\u000f¥¾ñy\u0090ù5\u0007\u008aö6\u000e\u008c\u001fà\nn`\u0091¬®üK\u0098Å½n\u0084¥$åx\u0084ÝþAÃµ\u0011åãâé1.1\u008fa\u0095ý\u0015^\n\rJéq\rk\u000fÃ7_ÞÛ\u009eÉ>9\u0099<W¬\u0081\u0095¾£¾ëÂâ¦\u008bª\u007f\u0015\u0003L;O]Ë0|\u0010}\u0010UU\u009aïýSiM\u0015\u0099ç\u009dN50\u0090\u0017\u0089I\u00821¤Mvß!A\u0082\u0094U\u000e+bÈ&\rý\u009c\u009a\u0081Îã¨¢ñrÁæñtéß^SÄ>\u001e~RnX]ØzÔa\u0083F\u0003qG\u0016Ø\u0087µ^|ã{ôT²¡]|\u0093¿\u001c\rÙ\u000b\u0091\u0092°\u0000ûD¯j\u0094ù4^\u008c\u0014_\t\u009a\u001aD7þ#_s³\u0015ãÌ\"\u0085S2\u0000ÕB½±¡ð[ò\u008f\u008b¢Ø;\u000b?ýtDxã'ë¦b,Ú\u008di\"\u0000Òqg½{ë\u0007\u009b8y`*\u0013\u009b\u0091ð²!¡|$í\u0013¹\u0099±w6\\%-¼\u0090p»\u009doA\u001c(\u0014Êx\u00adóyA×\u0011m\u0081G\u008e¦÷ï\tù\u0091ÖoEè\u0088äç\u0016Á\u009fÈXYÝÝ\u0011¯\u001c'ç\u0016\nlW\u0004 þ\u00adÈT";
      int var4 = "wed\u0082\u0081§,ÿ\u001cyN\n\u0002b®¬¤\u000e\tmìêKÓk\u0088_5\u0096\u0092jÒU×,Ø5¹\u000f¥¾ñy\u0090ù5\u0007\u008aö6\u000e\u008c\u001fà\nn`\u0091¬®üK\u0098Å½n\u0084¥$åx\u0084ÝþAÃµ\u0011åãâé1.1\u008fa\u0095ý\u0015^\n\rJéq\rk\u000fÃ7_ÞÛ\u009eÉ>9\u0099<W¬\u0081\u0095¾£¾ëÂâ¦\u008bª\u007f\u0015\u0003L;O]Ë0|\u0010}\u0010UU\u009aïýSiM\u0015\u0099ç\u009dN50\u0090\u0017\u0089I\u00821¤Mvß!A\u0082\u0094U\u000e+bÈ&\rý\u009c\u009a\u0081Îã¨¢ñrÁæñtéß^SÄ>\u001e~RnX]ØzÔa\u0083F\u0003qG\u0016Ø\u0087µ^|ã{ôT²¡]|\u0093¿\u001c\rÙ\u000b\u0091\u0092°\u0000ûD¯j\u0094ù4^\u008c\u0014_\t\u009a\u001aD7þ#_s³\u0015ãÌ\"\u0085S2\u0000ÕB½±¡ð[ò\u008f\u008b¢Ø;\u000b?ýtDxã'ë¦b,Ú\u008di\"\u0000Òqg½{ë\u0007\u009b8y`*\u0013\u009b\u0091ð²!¡|$í\u0013¹\u0099±w6\\%-¼\u0090p»\u009doA\u001c(\u0014Êx\u00adóyA×\u0011m\u0081G\u008e¦÷ï\tù\u0091ÖoEè\u0088äç\u0016Á\u009fÈXYÝÝ\u0011¯\u001c'ç\u0016\nlW\u0004 þ\u00adÈT"
         .length();
      char var1 = '\b';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 25;
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
                     case 0 -> 83;
                     case 1 -> 107;
                     case 2 -> 100;
                     case 3 -> 22;
                     case 4 -> 28;
                     case 5 -> 82;
                     default -> 107;
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
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII();
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new ConcurrentHashMap<>();
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new ConcurrentHashMap<>();
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new ConcurrentHashMap<>();
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

                  var2 = "ú\u0016t©\u0019E\u008dx\u008dH\u0005AN©\u0096Æ°A¢\u009b\n\u0095gÇ\u0019m/K\u0011kp";
                  var4 = "ú\u0016t©\u0019E\u008dx\u008dH\u0005AN©\u0096Æ°A¢\u009b\n\u0095gÇ\u0019m/K\u0011kp".length();
                  var1 = 20;
                  var8 = -1;
            }

            var10000 = 108;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -14560) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 153;
            case 1 -> 101;
            case 2 -> 204;
            case 3 -> 201;
            case 4 -> 223;
            case 5 -> 85;
            case 6 -> 83;
            case 7 -> 19;
            case 8 -> 106;
            case 9 -> 149;
            case 10 -> 200;
            case 11 -> 241;
            case 12 -> 67;
            case 13 -> 50;
            case 14 -> 95;
            case 15 -> 58;
            case 16 -> 185;
            case 17 -> 157;
            case 18 -> 168;
            case 19 -> 52;
            case 20 -> 90;
            case 21 -> 23;
            case 22 -> 112;
            case 23 -> 102;
            case 24 -> 194;
            case 25 -> 73;
            case 26 -> 43;
            case 27 -> 182;
            case 28 -> 203;
            case 29 -> 12;
            case 30 -> 54;
            case 31 -> 82;
            case 32 -> 169;
            case 33 -> 230;
            case 34 -> 158;
            case 35 -> 205;
            case 36 -> 17;
            case 37 -> 147;
            case 38 -> 202;
            case 39 -> 1;
            case 40 -> 227;
            case 41 -> 251;
            case 42 -> 148;
            case 43 -> 130;
            case 44 -> 15;
            case 45 -> 140;
            case 46 -> 62;
            case 47 -> 243;
            case 48 -> 245;
            case 49 -> 224;
            case 50 -> 93;
            case 51 -> 88;
            case 52 -> 92;
            case 53 -> 119;
            case 54 -> 139;
            case 55 -> 174;
            case 56 -> 188;
            case 57 -> 48;
            case 58 -> 16;
            case 59 -> 7;
            case 60 -> 69;
            case 61 -> 117;
            case 62 -> 160;
            case 63 -> 191;
            case 64 -> 167;
            case 65 -> 173;
            case 66 -> 225;
            case 67 -> 237;
            case 68 -> 111;
            case 69 -> 27;
            case 70 -> 87;
            case 71 -> 33;
            case 72 -> 183;
            case 73 -> 77;
            case 74 -> 239;
            case 75 -> 65;
            case 76 -> 96;
            case 77 -> 24;
            case 78 -> 63;
            case 79 -> 181;
            case 80 -> 250;
            case 81 -> 252;
            case 82 -> 150;
            case 83 -> 156;
            case 84 -> 78;
            case 85 -> 84;
            case 86 -> 71;
            case 87 -> 39;
            case 88 -> 176;
            case 89 -> 166;
            case 90 -> 109;
            case 91 -> 4;
            case 92 -> 233;
            case 93 -> 86;
            case 94 -> 118;
            case 95 -> 196;
            case 96 -> 18;
            case 97 -> 206;
            case 98 -> 226;
            case 99 -> 146;
            case 100 -> 74;
            case 101 -> 129;
            case 102 -> 122;
            case 103 -> 108;
            case 104 -> 34;
            case 105 -> 110;
            case 106 -> 189;
            case 107 -> 219;
            case 108 -> 163;
            case 109 -> 244;
            case 110 -> 81;
            case 111 -> 124;
            case 112 -> 104;
            case 113 -> 246;
            case 114 -> 152;
            case 115 -> 144;
            case 116 -> 13;
            case 117 -> 236;
            case 118 -> 45;
            case 119 -> 94;
            case 120 -> 178;
            case 121 -> 131;
            case 122 -> 61;
            case 123 -> 10;
            case 124 -> 125;
            case 125 -> 99;
            case 126 -> 91;
            case 127 -> 32;
            case 128 -> 229;
            case 129 -> 231;
            case 130 -> 64;
            case 131 -> 126;
            case 132 -> 151;
            case 133 -> 207;
            case 134 -> 107;
            case 135 -> 11;
            case 136 -> 127;
            case 137 -> 170;
            case 138 -> 216;
            case 139 -> 113;
            case 140 -> 44;
            case 141 -> 162;
            case 142 -> 159;
            case 143 -> 136;
            case 144 -> 59;
            case 145 -> 37;
            case 146 -> 180;
            case 147 -> 22;
            case 148 -> 100;
            case 149 -> 132;
            case 150 -> 133;
            case 151 -> 142;
            case 152 -> 214;
            case 153 -> 5;
            case 154 -> 55;
            case 155 -> 228;
            case 156 -> 46;
            case 157 -> 80;
            case 158 -> 121;
            case 159 -> 8;
            case 160 -> 143;
            case 161 -> 190;
            case 162 -> 154;
            case 163 -> 177;
            case 164 -> 171;
            case 165 -> 60;
            case 166 -> 249;
            case 167 -> 49;
            case 168 -> 213;
            case 169 -> 14;
            case 170 -> 210;
            case 171 -> 75;
            case 172 -> 138;
            case 173 -> 6;
            case 174 -> 172;
            case 175 -> 38;
            case 176 -> 164;
            case 177 -> 21;
            case 178 -> 217;
            case 179 -> 211;
            case 180 -> 70;
            case 181 -> 197;
            case 182 -> 186;
            case 183 -> 255;
            case 184 -> 114;
            case 185 -> 242;
            case 186 -> 40;
            case 187 -> 20;
            case 188 -> 41;
            case 189 -> 0;
            case 190 -> 220;
            case 191 -> 218;
            case 192 -> 187;
            case 193 -> 36;
            case 194 -> 208;
            case 195 -> 56;
            case 196 -> 134;
            case 197 -> 3;
            case 198 -> 9;
            case 199 -> 253;
            case 200 -> 128;
            case 201 -> 209;
            case 202 -> 175;
            case 203 -> 145;
            case 204 -> 31;
            case 205 -> 120;
            case 206 -> 79;
            case 207 -> 135;
            case 208 -> 42;
            case 209 -> 115;
            case 210 -> 254;
            case 211 -> 179;
            case 212 -> 212;
            case 213 -> 141;
            case 214 -> 165;
            case 215 -> 29;
            case 216 -> 66;
            case 217 -> 57;
            case 218 -> 26;
            case 219 -> 193;
            case 220 -> 47;
            case 221 -> 35;
            case 222 -> 137;
            case 223 -> 221;
            case 224 -> 103;
            case 225 -> 53;
            case 226 -> 89;
            case 227 -> 155;
            case 228 -> 51;
            case 229 -> 199;
            case 230 -> 222;
            case 231 -> 240;
            case 232 -> 234;
            case 233 -> 30;
            case 234 -> 105;
            case 235 -> 235;
            case 236 -> 76;
            case 237 -> 123;
            case 238 -> 68;
            case 239 -> 28;
            case 240 -> 2;
            case 241 -> 184;
            case 242 -> 248;
            case 243 -> 238;
            case 244 -> 195;
            case 245 -> 192;
            case 246 -> 232;
            case 247 -> 72;
            case 248 -> 247;
            case 249 -> 98;
            case 250 -> 198;
            case 251 -> 215;
            case 252 -> 116;
            case 253 -> 161;
            case 254 -> 25;
            default -> 97;
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
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final ByteBuffer IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(int var1, int var2, @NotNull ByteBuffer var3) {
         short var10001 = -14029;
         short var10002 = -5065;
         Intrinsics.checkNotNullParameter(var3, "buffer");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      }

      public final int a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final ByteBuffer c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final int d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final ByteBuffer f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         int var1, int var2, @NotNull ByteBuffer var3
      ) {
         short var10001 = -14027;
         short var10002 = -3327;
         Intrinsics.checkNotNullParameter(var3, "buffer");
         return new IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -14030;
         ByteBuffer var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -17685;
         short var10002 = -14031;
         short var10003 = -16875;
         short var10004 = -14032;
         short var10005 = -11862;
         return "PendingImage(width=" + var3 + ", height=" + var2 + ", buffer=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var1 = var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         return var1 * 31 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
      Object var4 = null; // PX-FIX
         int[] var2 = IlIlIllIlIlllIllIlIIIIllIIIIIIIIlIlllllIlIlllIIIlIllIIIllIlIIlllllIllllIIllIllllIllII.f();
         Object var10000 = this;
         if (var2 == null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == null) {
            if (!(
               var10000 instanceof IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         label48: {
            IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
            var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            int var10001 = var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            if (var2 == null) {
               if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
                  return false;
               }

               var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               if (var2 != null) {
                  break label48;
               }

               var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            if ((Boolean)var4 != ((var10001 == 0))) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            );
         }

         if (var2 == null) {
            if (((Boolean)(var4))) {
               return false;
            }

            var4 = 1;
         }

         return (boolean)var4;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[5];
         int var3 = 0;
         String var2 = ";\u0082Õ=uÖgoþ\tû|Çòs<D\u00156\u0006²\u0092mÃ¡\u007f";
         int var4 = ";\u0082Õ=uÖgoþ\tû|Çòs<D\u00156\u0006²\u0092mÃ¡\u007f".length();
         char var1 = '\t';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 24;
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
                        case 0 -> 56;
                        case 1 -> 90;
                        case 2 -> 111;
                        case 3 -> 124;
                        case 4 -> 53;
                        case 5 -> 75;
                        default -> 88;
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

                     var2 = "á\u0087\u0017\u001d\u0087\u0096Z\u001e\u008bÝ\u0096<Â°:Íhye\u0006\u0016q\u0095ÓÒ\u0011";
                     var4 = "á\u0087\u0017\u001d\u0087\u0096Z\u001e\u008bÝ\u0096<Â°:Íhye\u0006\u0016q\u0095ÓÒ\u0011".length();
                     var1 = 19;
                     var8 = -1;
               }

               var10000 = 120;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -14031) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 167;
               case 1 -> 188;
               case 2 -> 197;
               case 3 -> 102;
               case 4 -> 103;
               case 5 -> 121;
               case 6 -> 122;
               case 7 -> 136;
               case 8 -> 97;
               case 9 -> 176;
               case 10 -> 30;
               case 11 -> 153;
               case 12 -> 168;
               case 13 -> 180;
               case 14 -> 5;
               case 15 -> 191;
               case 16 -> 16;
               case 17 -> 46;
               case 18 -> 43;
               case 19 -> 26;
               case 20 -> 173;
               case 21 -> 84;
               case 22 -> 29;
               case 23 -> 187;
               case 24 -> 81;
               case 25 -> 200;
               case 26 -> 2;
               case 27 -> 222;
               case 28 -> 92;
               case 29 -> 159;
               case 30 -> 117;
               case 31 -> 49;
               case 32 -> 145;
               case 33 -> 239;
               case 34 -> 183;
               case 35 -> 252;
               case 36 -> 198;
               case 37 -> 57;
               case 38 -> 12;
               case 39 -> 194;
               case 40 -> 104;
               case 41 -> 114;
               case 42 -> 204;
               case 43 -> 3;
               case 44 -> 203;
               case 45 -> 85;
               case 46 -> 75;
               case 47 -> 123;
               case 48 -> 55;
               case 49 -> 6;
               case 50 -> 73;
               case 51 -> 18;
               case 52 -> 35;
               case 53 -> 142;
               case 54 -> 108;
               case 55 -> 157;
               case 56 -> 151;
               case 57 -> 171;
               case 58 -> 227;
               case 59 -> 240;
               case 60 -> 58;
               case 61 -> 88;
               case 62 -> 74;
               case 63 -> 253;
               case 64 -> 99;
               case 65 -> 120;
               case 66 -> 163;
               case 67 -> 148;
               case 68 -> 51;
               case 69 -> 20;
               case 70 -> 193;
               case 71 -> 64;
               case 72 -> 80;
               case 73 -> 129;
               case 74 -> 93;
               case 75 -> 248;
               case 76 -> 210;
               case 77 -> 228;
               case 78 -> 61;
               case 79 -> 214;
               case 80 -> 244;
               case 81 -> 66;
               case 82 -> 143;
               case 83 -> 189;
               case 84 -> 164;
               case 85 -> 217;
               case 86 -> 205;
               case 87 -> 47;
               case 88 -> 206;
               case 89 -> 17;
               case 90 -> 192;
               case 91 -> 82;
               case 92 -> 216;
               case 93 -> 241;
               case 94 -> 209;
               case 95 -> 213;
               case 96 -> 0;
               case 97 -> 91;
               case 98 -> 138;
               case 99 -> 118;
               case 100 -> 24;
               case 101 -> 247;
               case 102 -> 42;
               case 103 -> 224;
               case 104 -> 160;
               case 105 -> 236;
               case 106 -> 126;
               case 107 -> 237;
               case 108 -> 14;
               case 109 -> 38;
               case 110 -> 59;
               case 111 -> 111;
               case 112 -> 125;
               case 113 -> 181;
               case 114 -> 34;
               case 115 -> 10;
               case 116 -> 33;
               case 117 -> 78;
               case 118 -> 67;
               case 119 -> 154;
               case 120 -> 177;
               case 121 -> 185;
               case 122 -> 245;
               case 123 -> 158;
               case 124 -> 119;
               case 125 -> 156;
               case 126 -> 52;
               case 127 -> 22;
               case 128 -> 254;
               case 129 -> 207;
               case 130 -> 77;
               case 131 -> 94;
               case 132 -> 233;
               case 133 -> 65;
               case 134 -> 208;
               case 135 -> 242;
               case 136 -> 178;
               case 137 -> 69;
               case 138 -> 215;
               case 139 -> 53;
               case 140 -> 37;
               case 141 -> 32;
               case 142 -> 124;
               case 143 -> 196;
               case 144 -> 90;
               case 145 -> 147;
               case 146 -> 71;
               case 147 -> 219;
               case 148 -> 133;
               case 149 -> 62;
               case 150 -> 146;
               case 151 -> 246;
               case 152 -> 50;
               case 153 -> 86;
               case 154 -> 255;
               case 155 -> 190;
               case 156 -> 170;
               case 157 -> 98;
               case 158 -> 127;
               case 159 -> 195;
               case 160 -> 41;
               case 161 -> 250;
               case 162 -> 134;
               case 163 -> 229;
               case 164 -> 15;
               case 165 -> 96;
               case 166 -> 201;
               case 167 -> 11;
               case 168 -> 45;
               case 169 -> 110;
               case 170 -> 115;
               case 171 -> 1;
               case 172 -> 139;
               case 173 -> 140;
               case 174 -> 231;
               case 175 -> 63;
               case 176 -> 169;
               case 177 -> 152;
               case 178 -> 48;
               case 179 -> 166;
               case 180 -> 60;
               case 181 -> 100;
               case 182 -> 4;
               case 183 -> 199;
               case 184 -> 251;
               case 185 -> 79;
               case 186 -> 112;
               case 187 -> 76;
               case 188 -> 131;
               case 189 -> 109;
               case 190 -> 27;
               case 191 -> 234;
               case 192 -> 8;
               case 193 -> 44;
               case 194 -> 137;
               case 195 -> 31;
               case 196 -> 116;
               case 197 -> 106;
               case 198 -> 218;
               case 199 -> 249;
               case 200 -> 128;
               case 201 -> 21;
               case 202 -> 25;
               case 203 -> 23;
               case 204 -> 36;
               case 205 -> 226;
               case 206 -> 107;
               case 207 -> 132;
               case 208 -> 13;
               case 209 -> 54;
               case 210 -> 72;
               case 211 -> 9;
               case 212 -> 87;
               case 213 -> 230;
               case 214 -> 28;
               case 215 -> 238;
               case 216 -> 141;
               case 217 -> 101;
               case 218 -> 232;
               case 219 -> 179;
               case 220 -> 135;
               case 221 -> 211;
               case 222 -> 225;
               case 223 -> 105;
               case 224 -> 130;
               case 225 -> 70;
               case 226 -> 56;
               case 227 -> 175;
               case 228 -> 40;
               case 229 -> 7;
               case 230 -> 144;
               case 231 -> 161;
               case 232 -> 162;
               case 233 -> 39;
               case 234 -> 165;
               case 235 -> 223;
               case 236 -> 149;
               case 237 -> 19;
               case 238 -> 174;
               case 239 -> 155;
               case 240 -> 172;
               case 241 -> 182;
               case 242 -> 186;
               case 243 -> 150;
               case 244 -> 243;
               case 245 -> 202;
               case 246 -> 83;
               case 247 -> 68;
               case 248 -> 235;
               case 249 -> 95;
               case 250 -> 221;
               case 251 -> 89;
               case 252 -> 220;
               case 253 -> 184;
               case 254 -> 113;
               default -> 212;
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
   
      // PX-FIX-ok: Kotlin $default bridge (synthetic; jar body translated 1:1)
      public static final IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0, int var1, int var2, ByteBuffer var3, int var4, Object var5) {
         int[] var6 = IlIlIllIlIlllIllIlIIIIllIIIIIIIIlIlllllIlIlllIIIlIllIIIllIlIIlllllIllllIIllIllllIllII.f();
         if ((var4 & 1) != 0) {
            if (var6 == null) {
               var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            }
         }
         if ((var4 & 2) != 0) {
            if (var6 == null) {
               var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }
         }
         if ((var4 & 4) != 0) {
            var3 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }
         return var0.a(var1, var2, var3);
      }
}
}
