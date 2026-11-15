package me.octo.client;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import me.octo.client.utils.player.IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.glfw.GLFW;

public final class IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll
   implements lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI,
   IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl {
   public IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll c() {
      return (me.octo.client.IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll) this.m();
   }

   @NotNull
   public static IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.PXEvMid lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final IIlIlllllllIIIIlllIIlIIllIllIIlIIIlIIllIIlllIIIllIlIIlIIllIlIIIIlIlllIIllllIlIllIllIl IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private String IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private boolean IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private long IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private final lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private float IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private float llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private float lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private float lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private float lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @Nullable
   private static IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private static HashMap<String, IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static float llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static float IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static int IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static int IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static int IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private static int llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private static int IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   private static int lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   private static float llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   private static float lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   private static int IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   private static long IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   private static int IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   private static int llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   private static int lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   private static String[] IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   private static String[] g;
   private static String[] h;

   public IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll(
      @NotNull IIlIlllllllIIIIlllIIlIIllIllIIlIIIlIIllIIlllIIIllIlIIlIIllIlIIIIlIlllIIllllIlIllIllIl var1
   ) {
      short var10001 = 19081;
      short var10002 = 18668;
      Intrinsics.checkNotNullParameter(var1, "module");
      super();
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = "";
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = true;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII();
   }

   @NotNull
   @Override
   public String f() {
      String var10000 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.Z();
      short var10001 = 19090;
      short var10002 = 7007;
      return var10000 + "_preset_dropdown";
   }

   private final String a(String var1) {
      String[] var2 = x();
      String var10000 = var1;
      if (var2 != null) {
         if (var1.length() > 16) {
            var10000 = var1.substring(0, 13);
            short var10002 = 19096;
            short var10003 = -6830;
            Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
            short var10001 = 19080;
            var10002 = 22833;
            var10000 = var10000 + "...";
         } else {
            var10000 = var1;
         }
      }

      return var10000;
   }

   private final int a(List<String> var1) {
      Object var16 = null; // PX-FIX
      int var15;
      label41: {
         label43: {
            String[] var10000 = x();
            Collection var10001 = var1;
            String[] var4 = new String[4];
            short var10004 = 19092;
            short var10005 = -14720;
            var4[0] = "+ New Preset";
            var10004 = 19079;
            var10005 = 11530;
            var4[1] = "Select Preset";
            var10004 = 19072;
            var10005 = 12952;
            var4[2] = "Load";
            var10004 = 19102;
            var10005 = 17085;
            var4[3] = "Save";
            List var3 = CollectionsKt.plus(var10001, CollectionsKt.listOf(var4));
            Iterator var5 = var3.iterator();
            String[] var2 = var10000;
            Object var13 = var5;
            if (var2 != null) {
               if (!var5.hasNext()) {
                  var16 = null;
                  break label43;
               }

               var13 = var5.next();
            }

            String var6 = (String)var13;
            boolean var7 = false;
            Comparable var10 = (int)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll,
                  this.a(var6),
                  false, 2, null)
               + 22;

            while (var5.hasNext()) {
               String var11 = (String)var5.next();
               boolean var8 = false;
               Comparable var12 = (int)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll,
                     this.a(var11),
                     false, 2, null)
                  + 22;
               Comparable var14 = var10;
               if (var2 != null) {
                  var15 = var10.compareTo(var12);
                  if (var2 == null) {
                     break label41;
                  }

                  if (var15 >= 0) {
                     continue;
                  }

                  var14 = var12;
               }

               var10 = var14;
               if (var2 == null) {
                  break;
               }
            }

            var16 = var10;
         }

         var15 = (Integer)var16 != null ? (Integer)var16 : 150;
      }

      int var9 = var15;
      return me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            150,
            me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(var9, 220)
         );
   }

   private final int b(String var1) {
      int var7;
      label27: {
         label30: {
            String[] var10000 = x();
            CharSequence var4 = var1;
            String[] var2 = var10000;
            CharSequence var6 = var4;
            if (var2 != null) {
               if (var4 == null) {
                  break label30;
               }

               var6 = var4;
            }

            var7 = var6.length();
            if (var2 == null) {
               break label27;
            }

            if (var7 != 0) {
               var7 = 0;
               break label27;
            }
         }

         var7 = 1;
      }

      String var9;
      if (var7 != 0) {
         short var8 = 19094;
         short var10001 = -30211;
         var9 = "Select Preset";
      } else {
         var9 = this.a(var1);
      }

      String var3 = var9;
      int var5 = (int)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll, var3, false, 2, null)
         + 22;
      return me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            150,
            me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(var5, 220)
         );
   }

   private final float o() {
      Object var9 = null; // PX-FIX
      String[] var1 = x();
      if (var1 != null) {
         IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var10000 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.get(
            this.f()
         );
         if (var10000 != null) {
            IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var2;
            label45: {
               var2 = var10000;
               float var3 = (float)(System.currentTimeMillis() - var2.b());
               float var4 = var2.a() ? 250.0F : 125.0F;
               float var5 = RangesKt.coerceIn(var3 / var4, 0.0F, 1.0F);
               float var6 = var2.a()
                  ? IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .D(var5)
                  : var5;
               var10000 = var2;
               if (var1 != null) {
                  if (var2.a()) {
                     var9 = var2.c() + (1.0F - var2.c()) * var6;
                     break label45;
                  }

                  var10000 = var2;
               }

               var9 = var10000.c() - var2.c() * var6;
            }

            float var7 =((Float)( var9));
            int var10 = ((var2.a()) ? 1 : 0);
            if (var1 != null) {
               if (var10 != 0) {
                  return var7;
               }

               if (var1 == null) {
                  return var7;
               }

               float var12;
               var10 = (var12 = var7 - 0.001F) == 0.0F ? 0 : (var12 < 0.0F ? -1 : 1);
            }

            if (var10 <= 0) {
               IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.remove(this.f());
               return 0.0F;
            }

            return var7;
         }
      }

      return 0.0F;
   }

   private final void p() {
      String[] var1;
      long var3;
      IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var5;
      label24: {
         String var2 = this.f();
         String[] var10000 = x();
         var3 = System.currentTimeMillis();
         var5 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.get(var2);
         var1 = var10000;
         if (var1 != null) {
            if (var5 != null) {
               break label24;
            }

            IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.put(
               var2,
               new IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                  true, var3, 0.0F
               )
            );
         }

         if (var1 != null) {
            return;
         }
      }

      float var6 = this.o();
      boolean var10001 = var5.a();
      if (var1 != null) {
         var10001 = !var10001;
      }

      var5.a(var10001);
      var5.a(var3);
      var5.a(var6);
   }

   private final float a(int var1) {
      float var11 = 0; // PX-FIX
      String[] var2 = x();
      if (var2 != null) {
         IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var10000 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.get(
            this.f()
         );
         if (var10000 != null) {
            IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3;
            float var4;
            label33: {
               var3 = var10000;
               var4 = (float)(System.currentTimeMillis() - var3.b());
               int var10 = ((var3.a()) ? 1 : 0);
               if (var2 != null) {
                  if (var10 == 0) {
                     var11 = 0.0F;
                     break label33;
                  }

                  var10 = var1;
               }

               var11 = var10 * 18.0F;
            }

            float var5 = var11;
            float var6 = RangesKt.coerceAtLeast(var4 - var5, 0.0F);
            float var7 = var3.a() ? 250.0F : 125.0F;
            float var8 = RangesKt.coerceIn(var6 / var7, 0.0F, 1.0F);
            float var9 = var3.a()
               ? IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .D(var8)
               : var8;
            return var3.a() ? var9 : 1.0F - var9;
         }
      }

      return 0.0F;
   }

   @NotNull
   @Override
   public lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll a(
      @NotNull GuiGraphicsExtractor var1,
      @NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var2,
      int var3,
      int var4,
      int var5
   ) {
      String[] var6;
      float var7;
      List var8;
      int var10;
      int var11;
      byte var27;
      label58: {
         short var10001 = 19077;
         short var10002 = -24494;
         Intrinsics.checkNotNullParameter(var1, "drawContext");
         String[] var10000 = x();
         var10002 = 19086;
         short var10003 = 1808;
         Intrinsics.checkNotNullParameter(var2, "resolution");
         var7 = this.o();
         var8 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.l();
         var6 = var10000;
         String var9 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.i();
         var10 = this.b(var9);
         var11 = this.a(var8);
         String var12 = this.f();
         if (var6 != null) {
            IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var26 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.get(
               var12
            );
            if (var26 != null) {
               var27 = ((byte)((var26.a()) ? 1 : 0));
               break label58;
            }
         }

         var27 = 0;
      }

      byte var13 = (byte)var27;
      float var32;
      var27 = (byte)((var32 = ((byte)((var7 - 0.01F != 0.0) ? 1 : 0))) == (byte)((0.0F != 0) ? 0 : (var32 < 0.0F ? -1 : 1)) ? 1 : 0);
      label52:
      if (var6 != null) {
         if (var27 <= 0) {
            var27 = var13;
            if (var6 == null) {
               break label52;
            }

            if (var13 == 0) {
               var27 =(byte)( var10);
               break label52;
            }
         }

         var27 =(byte)( (int)me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.c(
            (float)var10, (float)var11, var7
         ));
      }

      int var14 = var27;
      int var15 = (int)var2.e() - 14;
      int var16 = var15 - var14;
      int var17 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.a(var1, (int)var2.c(), var3, var16 - 15);
      int var18 = (var17 - var3 >> 1) + var3;
      int var19 = var8.size() + 1;
      int var20 = var19 * 25 + 96 + 5 + 30;
      float var21 = 26.0F + var20 * var7;
      this.a(var16, var18, var14, var21);
      this.a(var16, var18, var14);
      boolean var22 = this.a(var4, var5, var16, var18, var14, var2);
      llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl var23 = null;
      if (var22) {
         var23 = this.q();
      }

      if (var7 > 0.01F) {
         llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl var24 = this.a(
            var1, var2, var16, var18, var14, var8, var19, var7, var4, var5
         );
         if (var24 != null) {
            var23 = var24;
         }
      }

      int var25 = var7 > 0.0F ? (int)((float)(var18 - 15) + var21 + 15.0F) : var17;
      return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(
         var25, (IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII)var23
      );
   }

   private final void a(int var1, int var2, int var3, float var4) {
      String[] var10000 = x();
      float var6 = var1 - 8;
      float var7 = var2 - 15;
      String[] var5 = var10000;
      float var8 = var3 + 16;
      float var9 = this.o();
      float var10 = var9;
      float var10001 = 0.01F;
      if (var5 != null) {
         if (var9 > 0.01F) {
            me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
               me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               var6,
               var7,
               var8,
               var4,
               5.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ah(),
               var9 * 0.55F,
               4.0F);
         }

         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var6,
            var7,
            var8,
            var4,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .B(),
            5.0F
         );
         var10 = var6;
         var10001 = var7;
      }

      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var10,
         var10001,
         var8,
         var4,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y(),
         5.0F
      );
      me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var11 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      String var12 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.Z();
      short var10002 = 19100;
      short var10003 = 19265;
      var11.a("preset:" + var12, var6, var7, var8, var4, 5.0F);
   }

   private final void a(int var1, int var2, int var3) {
      String[] var4;
      String var5;
      int var11;
      label51: {
         label54: {
            String[] var10000 = x();
            var5 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.i();
            var4 = var10000;
            CharSequence var7 = var5;
            CharSequence var10 = var7;
            if (var4 != null) {
               if (var7 == null) {
                  break label54;
               }

               var10 = var7;
            }

            var11 = var10.length();
            if (var4 == null) {
               break label51;
            }

            if (var11 != 0) {
               var11 = 0;
               break label51;
            }
         }

         var11 = 1;
      }

      String var13;
      if (var11 != 0) {
         short var12 = 19094;
         short var10001 = -30211;
         var13 = "Select Preset";
      } else {
         var13 = this.a(var5);
      }

      String var6;
      label39: {
         label55: {
            var6 = var13;
            CharSequence var8 = var5;
            CharSequence var14 = var8;
            if (var4 != null) {
               if (var8 == null) {
                  break label55;
               }

               var14 = var8;
            }

            var11 = var14.length();
            if (var4 == null) {
               break label39;
            }

            if (var11 != 0) {
               var11 = 0;
               break label39;
            }
         }

         var11 = 1;
      }

      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var9 = var11 != 0
         ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b()
         : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a();
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll, var6, var1, var2 - 9.0, var9, false, 16, null);
      this.a(
         null,
         var1 + var3 - 13,
         var2,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .F()
      );
   }

   private final boolean a(
      int var1, int var2, int var3, int var4, int var5, llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var6
   ) {
      String[] var10000 = x();
      boolean var8 = this.a(var1, var2, var3 - 8, var4 - 15, var3 + var5 + 8, var4 + 15);
      String[] var7 = var10000;
      boolean var9 = var8;
      if (var7 != null) {
         if (var8) {
            float var10;
            int var11 = (var10 = var2 - (var6.d() + 5)) == 0.0F ? 0 : (var10 < 0.0F ? -1 : 1);
            if (var7 == null) {
               return (var11 != 0);
            }

            if (var11 > 0) {
               llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(true);
               this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var1;
               this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var2;
               this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var3 - 8;
               this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var4 - 15;
               this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var5 + 16;
               return true;
            }
         }

         var9 = false;
      }

      return var9;
   }

   private final llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl q() {
      final float var1 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      final float var2 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      final float var3 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      final float var4 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      final float var5 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      return new llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl() {
         private static String b;

         @Override
         public void e() {
            IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.this.p();
            float var1x = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var5, 30.0F, var1, var2, var3, var4)
               + 6.0F;
            me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
               me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               b
                  + IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                     .Z(),
               var1,
               var2,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ah()
                  .a(140),
               var1x,
               0L);
         }

         // $VF: Irreducible bytecode was duplicated to produce valid code
         static {
            pxClinit: {
            char[] var10003 = "CSC%{*2".toCharArray();
            int var10004 = var10003.length;
            int var0 = 0;
            byte var6 = 120;
            char[] var10002 = var10003;
            int var1x = var10004;
            byte var10;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var10 = 120;
               var10006 = var0;
            } else {
               var6 = 120;
               var1x = var10004;
               if (var10004 <= var0) {
                  String var9 = new String(var10003).intern();
                  byte var4x = -1;
                  b = var9;
                  break pxClinit;
               }

               var10005 = var10003;
               var10 = 120;
               var10006 = var0;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
                  case 0 -> 75;
                  case 1 -> 89;
                  case 2 -> 94;
                  case 3 -> 46;
                  case 4 -> 102;
                  case 5 -> 38;
                  default -> 112;
               });
               var0++;
               if (var6 == 0) {
                  var10006 = var6;
                  var10005 = var10002;
                  var10 = var6;
               } else {
                  if (var1x <= var0) {
                     String var8 = new String(var10002).intern();
                     byte var3x = -1;
                     b = var8;
                     break pxClinit;
                  }

                  var10005 = var10002;
                  var10 = var6;
                  var10006 = var0;
               }
            }
            }
         }
      };
   }

   private final llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl a(
      GuiGraphicsExtractor var1,
      llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var2,
      int var3,
      int var4,
      int var5,
      List<String> var6,
      int var7,
      float var8,
      int var9,
      int var10
   ) {
      llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl var25 = null; // PX-FIX
      String[] var10000 = x();
      int var12 = var4 + 20;
      float var13 = (var7 * 25 + 96 + 5 + 30) * var8;
      String[] var11 = var10000;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a((float)(var3 - 8), (float)(var12 - 3), (float)(var5 + 16), var13 + 6.0F);
      int var14 = var12;
      llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl var15 = null;
      int var16 = 0;
      int var17 = var6.size();

      while (true) {
         if (var16 < var17) {
            llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl var18 = this.a(
               (String)var6.get(var16), var16, var3, var14, var5, var8, var9, var10, var2
            );
            if (var11 != null) {
               var25 = var18;
               if (var11 == null) {
                  break;
               }

               if (var18 != null) {
                  var15 = var18;
               }

               var14 += 25;
               var16++;
            }

            if (var11 != null) {
               continue;
            }
         }

         var14 -= 2;
         var25 = this.a(var3, var14, var5, var6.size(), var8, var9, var10, var2);
         break;
      }

      llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl var22 = var25;
      llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl var26 = var22;
      if (var11 != null) {
         if (var22 != null) {
            var15 = var22;
         }

         var14 += 30;
         short var10001 = 19074;
         short var10002 = -3274;
         var26 = this.a(
            "Load", var3, var14, var5, var7, var8, var9, var10, var2, null
         );
      }

      llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl var23 = var26;
      llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl var27 = var23;
      if (var11 != null) {
         if (var23 != null) {
            var15 = var23;
         }

         var14 += 29;
         short var31 = 19083;
         short var32 = -1204;
         var27 = this.a(
            "Save",
            var3,
            var14,
            var5,
            var7 + 1,
            var8,
            var9,
            var10,
            var2,
            null
         );
      }

      llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl var24 = var27;
      llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl var28 = var24;
      if (var11 != null) {
         if (var24 != null) {
            var15 = var24;
         }

         var14 += 29;
         var28 = this.b(var3, var14, var5, var7 + 2, var8, var9, var10, var2);
      }

      llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl var19 = var28;
      llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl var29 = var19;
      if (var11 != null) {
         if (var19 != null) {
            var15 = var19;
         }

         var14 += 29;
         var29 = this.c(var3, var14, var5, var7 + 3, var8, var9, var10, var2);
      }

      llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl var20 = var29;
      llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl var30 = var20;
      if (var11 != null) {
         if (var20 != null) {
            var15 = var20;
         }

         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .i();
         var30 = var15;
      }

      return var30;
   }

   private final llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl a(
      final String var1,
      final int var2,
      int var3,
      int var4,
      int var5,
      float var6,
      int var7,
      int var8,
      llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var9
   ) {
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var30 = null; // PX-FIX
      Object var28 = null; // PX-FIX
      String[] var10000 = x();
      String var11 = this.a(var1);
      String[] var10 = var10000;
      float var12 = this.a(var2);
      float var27 = var12;
      float var10001 = 0.02F;
      if (var10 != null) {
         if (var12 <= 0.02F) {
            return null;
         }

         var27 = 0.85F;
         var10001 = 0.15F * var12;
      }

      float var13;
      int var14;
      int var16;
      int var17;
      label77: {
         label81: {
            var13 = var27 + var10001;
            var14 = var4 + (int)((1.0F - var12) * 5.0F);
            var16 = var3 - 8 + 5;
            var17 = var5 + 16 - 10;
            var28 = this.a(var7, var8, var16, var14 - 2, var16 + var17, var14 + 22);
            if (var10 != null) {
               if ((me.octo.client.PxTruth.truth(var28))) {
                  break label81;
               }

               float var35;
               var28 = (var35 = var6 - 0.8F) == 0.0F ? 0 : (var35 < 0.0F ? -1 : 1);
            }

            if (var10 == null) {
               break label77;
            }

            if ((me.octo.client.PxTruth.truth(var28))) {
               var28 = 1;
               break label77;
            }
         }

         var28 = 0;
      }

      int var18;
      label66: {
         var18 =((Integer)( var28));
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(var12);
         int var29 = ((Intrinsics.areEqual(var1, this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.i())) ? 1 : 0);
         if (var10 != null) {
            if (var29 != 0) {
               var30 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .D();
               break label66;
            }

            var29 = var18;
         }

         var30 = var29 != 0
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .E()
            : new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(0, 0, 0, 0);
      }

      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var19 = var30;
      if (var10 != null) {
         if (var19.d() > 0) {
            this.a(var16, var14 - 2, var17, 22, var13, var19);
         }

         me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var31 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         String var34 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.Z();
         short var10003 = 19073;
         short var10004 = -18311;
         var31.a("presetitem:" + var34 + ":" + var2, var16, var14 - 2, var17, 22.0F, 3.0F);
      }

      this.a(
         var11,
         var16 + 5,
         var14 + 1,
         var17 - 10,
         22,
         var13,
         Intrinsics.areEqual(var1, this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.i())
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b()
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
      int var32 = var18;
      if (var10 != null) {
         if (var18 == 0) {
            return null;
         }

         float var36;
         var32 = (var36 = var8 - (var9.d() + 5)) == 0.0F ? 0 : (var36 < 0.0F ? -1 : 1);
      }

      if (var10 != null) {
         if (var32 <= 0) {
            return null;
         }

         llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(true);
         var32 = var7;
      }

      final float var20 = var32;
      final float var21 = var8;
      final float var23 = var16;
      final float var24 = var14 - 2;
      final float var25 = var17;
      final float var26 = 22.0F;
      return new llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl() {
         private static String b;

         @Override
         public void e() {
            IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
               .e(var1);
            float var1x = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var25, var26, var20, var21, var23, var24)
               + 4.0F;
            me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(
                  b
                     + IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        .Z()
                     + ":"
                     + var2,
                  var20,
                  var21,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .ah()
                     .a(170),
                  var1x,
                  420L
               );
         }

         // $VF: Irreducible bytecode was duplicated to produce valid code
         static {
            pxClinit: {
            char[] var10003 = "Nb\nFplcJu\u0002\u000f".toCharArray();
            int var10004 = var10003.length;
            int var0 = 0;
            byte var6x = 75;
            char[] var10002 = var10003;
            int var1x = var10004;
            byte var10x;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var10x = 75;
               var10006 = var0;
            } else {
               var6x = 75;
               var1x = var10004;
               if (var10004 <= var0) {
                  String var9x = new String(var10003).intern();
                  byte var4x = -1;
                  b = var9x;
                  break pxClinit;
               }

               var10005 = var10003;
               var10x = 75;
               var10006 = var0;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var10x ^ switch (var0 % 7) {
                  case 0 -> 117;
                  case 1 -> 91;
                  case 2 -> 36;
                  case 3 -> 126;
                  case 4 -> 94;
                  case 5 -> 83;
                  default -> 65;
               });
               var0++;
               if (var6x == 0) {
                  var10006 = var6x;
                  var10005 = var10002;
                  var10x = var6x;
               } else {
                  if (var1x <= var0) {
                     String var8x = new String(var10002).intern();
                     byte var3x = -1;
                     b = var8x;
                     break pxClinit;
                  }

                  var10005 = var10002;
                  var10x = var6x;
                  var10006 = var0;
               }
            }
            }
         }
      };
   }

   private final llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl a(
      int var1,
      int var2,
      int var3,
      int var4,
      float var5,
      int var6,
      int var7,
      llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var8
   ) {
      Object var18 = null; // PX-FIX
      String[] var10000 = x();
      float var10 = this.a(var4);
      String[] var9 = var10000;
      float var17 = var10;
      float var10001 = 0.02F;
      if (var9 != null) {
         if (var10 <= 0.02F) {
            return null;
         }

         var17 = 0.85F;
         var10001 = 0.15F * var10;
      }

      float var11;
      int var12;
      int var14;
      int var15;
      label68: {
         label72: {
            var11 = var17 + var10001;
            var12 = var2 + (int)((1.0F - var10) * 5.0F) + 2;
            var14 = var1 - 8 + 5;
            var15 = var3 + 16 - 10;
            var18 = this.a(var6, var7, var14, var12 - 2, var14 + var15, var12 + 22);
            if (var9 != null) {
               if ((me.octo.client.PxTruth.truth(var18))) {
                  break label72;
               }

               float var23;
               var18 = (var23 = var5 - 0.8F) == 0.0F ? 0 : (var23 < 0.0F ? -1 : 1);
            }

            if (var9 != null) {
               if ((me.octo.client.PxTruth.truth(var18))) {
                  break label72;
               }

               var18 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            }

            if (var9 == null) {
               break label68;
            }

            if ((me.octo.client.PxTruth.truth(var18))) {
               var18 = 1;
               break label68;
            }
         }

         var18 = 0;
      }

      int var16;
      label73: {
         var16 =((Integer)( var18));
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(var10);
         int var19 = ((this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0);
         if (var9 != null) {
            if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
               this.b(var14, var12, var15);
               if (var9 != null) {
                  break label73;
               }
            }

            var19 = var16;
         }

         if (var19 != 0) {
            this.a(
               var14,
               var12 - 2,
               var15,
               22,
               var11,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .E()
            );
         }

         short var22 = 19078;
         short var10002 = 783;
         this.a(
            "+ New Preset",
            var14 + 5,
            var12 + 1,
            var15 - 10,
            22,
            var11,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .ah()
         );
      }

      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
      int var20 = var16;
      if (var9 != null) {
         if (var16 == 0) {
            return null;
         }

         float var24;
         var20 = (var24 = var7 - (var8.d() + 5)) == 0.0F ? 0 : (var24 < 0.0F ? -1 : 1);
      }

      if (var20 > 0) {
         llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(true);
         return new llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl() {
            @Override
            public void e() {
               IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = true;
               IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.this;
               IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = "";
               IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = true;
               IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = System.currentTimeMillis();
               IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                  .b();
            }
         };
      } else {
         return null;
      }
   }

   private final void b(int var1, int var2, int var3) {
      Object var13 = null; // PX-FIX
      String[] var10000 = x();
      this.r();
      String[] var4 = var10000;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2 - 2,
         var3,
         22.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .h(),
         3.0F
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2 - 2,
         var3,
         22.0F,
         1.2F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .z(),
         3.0F
      );
      double var5 = var1 + 5.0;
      double var7 = var2 + 1.0;
      int var11 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.length();
      if (var4 != null) {
         var11 = var11 > 0 ? 1 : 0;
      }

      if (var11 != 0) {
         label48: {
            boolean var12 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.a();
            if (var4 != null) {
               if (var12) {
                  lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(
                        (float)var5,
                        var2 + 2,
                        (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll, this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, false, 2, null),
                        11.0F
                     );
               }

               var13 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
                  me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll,
                  this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
                  var5,
                  var7,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(),
                  false, 16, null);
               if (var4 == null) {
                  break label48;
               }

               var12 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            }

            if (!var12) {
               return;
            }

            var13 = var5
               + me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll, this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, false, 2, null);
         }

         double var9 =((Double)( var13));
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            (float)var9,
            var2 + 2,
            1.2F,
            11.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(),
            0.0F
         );
         if (var4 != null) {
            return;
         }
      }

      short var10001 = 19099;
      short var10002 = 30633;
      double var14 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll,
         "Enter name...",
         var5,
         var7,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            .a(0.6F),
         false, 16, null);
      if (var4 != null) {
         if (!this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
            return;
         }

         var14 = var5;
      }

      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         (float)var14,
         var2 + 2,
         1.2F,
         11.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         0.0F
      );
   }

   private final llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl a(
      final String var1,
      int var2,
      int var3,
      int var4,
      int var5,
      float var6,
      int var7,
      int var8,
      llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var9,
      final Function0<Unit> var10
   ) {
      Object var25 = null; // PX-FIX
      String[] var10000 = x();
      float var12 = this.a(var5);
      String[] var11 = var10000;
      float var33;
      int var24 = (var33 = var12 - 0.02F) == 0.0F ? 0 : (var33 < 0.0F ? -1 : 1);
      if (var11 != null) {
         if (var24 <= 0) {
            return null;
         }

         var24 = var2 - 8 + 5;
      }

      int var13;
      int var14;
      label63: {
         label67: {
            var13 = var24;
            var14 = var4 + 16 - 10;
            var25 = this.a(var7, var8, var13, var3, var13 + var14, var3 + 24);
            if (var11 != null) {
               if ((me.octo.client.PxTruth.truth(var25))) {
                  break label67;
               }

               float var34;
               var25 = (var34 = var6 - 0.8F) == 0.0F ? 0 : (var34 < 0.0F ? -1 : 1);
            }

            if (var11 == null) {
               break label63;
            }

            if ((me.octo.client.PxTruth.truth(var25))) {
               var25 = 1;
               break label63;
            }
         }

         var25 = 0;
      }

      int var15 =((Integer)( var25));
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(var12);
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var16 = var15 != 0
         ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .H()
         : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .G();
      me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var26 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      String var10001 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.Z();
      short var10003 = 19082;
      short var10004 = 25445;
      float var17 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(var26, "presetbtn:" + var10001 + ":" + var1, (var15 != 0), 0.0F, 4, null
      );
      float var35;
      int var27 = (var35 = var17 - 0.01F) == 0.0F ? 0 : (var35 < 0.0F ? -1 : 1);
      if (var11 != null) {
         if (var27 > 0) {
            me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
               me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               (float)var13,
               (float)var3,
               (float)var14,
               24.0F,
               5.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ah(),
               var17 * 0.55F,
               3.0F);
         }

         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var13, var3, var14, 24.0F, var16, 5.0F);
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var13,
            var3,
            var14,
            24.0F,
            1.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .y(),
            5.0F
         );
         me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var28 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         var10001 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.Z();
         var10003 = 19084;
         var10004 = -11508;
         var28.a("presetbtnrip:" + var10001 + ":" + var1, var13, var3, var14, 24.0F, 5.0F);
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.c(
            me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll,
            var1,
            var13 + var14 / 2,
            var3 + 6,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(),
            false, 16, null);
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
         var27 = var15;
      }

      if (var11 != null) {
         if (var27 == 0) {
            return null;
         }

         float var36;
         var27 = (var36 = var8 - (var9.d() + 5)) == 0.0F ? 0 : (var36 < 0.0F ? -1 : 1);
      }

      if (var11 != null) {
         if (var27 <= 0) {
            return null;
         }

         llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(true);
         var27 = var7;
      }

      final float var18 = var27;
      final float var19 = var8;
      final float var20 = var13;
      final float var21 = var3;
      final float var22 = var14;
      final float var23 = 24.0F;
      return new llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl() {
         private static String b;

         @Override
         public void e() {
      Object var10 = null; // PX-FIX
            float var1x = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var22, var23, var18, var19, var20, var21)
               + 4.0F;
            me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(
                  b
                     + IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        .Z()
                     + ":"
                     + var1,
                  var18,
                  var19,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .ah()
                     .a(170),
                  var1x,
                  460L
               );
            ((me.octo.client.PXDyn)var10).invoke();
         }

         // $VF: Irreducible bytecode was duplicated to produce valid code
         static {
            pxClinit: {
            char[] var10003x = "\b-6\fYL\u000f\f1!\u0016L\u0002".toCharArray();
            int var10004x = var10003x.length;
            int var0 = 0;
            byte var6x = 100;
            char[] var10002 = var10003x;
            int var1x = var10004x;
            byte var10x;
            char[] var10005;
            int var10006;
            if (var10004x <= 1) {
               var10005 = var10003x;
               var10x = 100;
               var10006 = var0;
            } else {
               var6x = 100;
               var1x = var10004x;
               if (var10004x <= var0) {
                  String var9x = new String(var10003x).intern();
                  byte var4x = -1;
                  b = var9x;
                  break pxClinit;
               }

               var10005 = var10003x;
               var10x = 100;
               var10006 = var0;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var10x ^ switch (var0 % 7) {
                  case 0 -> 28;
                  case 1 -> 59;
                  case 2 -> 55;
                  case 3 -> 27;
                  case 4 -> 88;
                  case 5 -> 92;
                  default -> 9;
               });
               var0++;
               if (var6x == 0) {
                  var10006 = var6x;
                  var10005 = var10002;
                  var10x = var6x;
               } else {
                  if (var1x <= var0) {
                     String var8x = new String(var10002).intern();
                     byte var3x = -1;
                     b = var8x;
                     break pxClinit;
                  }

                  var10005 = var10002;
                  var10x = var6x;
                  var10006 = var0;
               }
            }
            }
         }
      };
   }

   private final llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl b(
      int var1,
      int var2,
      int var3,
      int var4,
      float var5,
      int var6,
      int var7,
      llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var8
   ) {
      int var40 = 0; // PX-FIX
      Object var33 = null; // PX-FIX
      Object var32 = null; // PX-FIX
      String[] var10000 = x();
      float var10 = this.a(var4);
      String[] var9 = var10000;
      float var55;
      int var31 = (var55 = var10 - 0.02F) == 0.0F ? 0 : (var55 < 0.0F ? -1 : 1);
      if (var9 != null) {
         if (var31 <= 0) {
            return null;
         }

         var31 = var1 - 8 + 5;
      }

      int var11;
      int var12;
      final float var13;
      label110: {
         label114: {
            var11 = var31;
            var12 = var3 + 16 - 10;
            var13 = (float)(var12 / 2) - 3;
            var32 = this.a(var6, var7, var11, var2, (int)(var11 + var13 + 3), var2 + 24);
            if (var9 != null) {
               if ((me.octo.client.PxTruth.truth(var32))) {
                  break label114;
               }

               float var56;
               var32 = (var56 = var5 - 0.8F) == 0.0F ? 0 : (var56 < 0.0F ? -1 : 1);
            }

            if (var9 == null) {
               break label110;
            }

            if ((me.octo.client.PxTruth.truth(var32))) {
               var32 = 1;
               break label110;
            }
         }

         var32 = 0;
      }

      int var14;
      label99: {
         label115: {
            var14 =((Integer)( var32));
            var33 = this.a(var6, var7, (int)(var11 + var13 + 5), var2, var11 + var12, var2 + 24);
            if (var9 != null) {
               if ((me.octo.client.PxTruth.truth(var33))) {
                  break label115;
               }

               float var57;
               var33 = (var57 = var5 - 0.8F) == 0.0F ? 0 : (var57 < 0.0F ? -1 : 1);
            }

            if (var9 == null) {
               break label99;
            }

            if ((me.octo.client.PxTruth.truth(var33))) {
               var33 = 1;
               break label99;
            }
         }

         var33 = 0;
      }

      int var15 =((Integer)( var33));
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(var10);
      me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var34 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      String var10001 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.Z();
      short var10002 = 19098;
      short var10003 = -28671;
      float var16 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(var34, "presetdel:" + var10001, (var14 != 0), 0.0F, 4, null
      );
      float var58;
      int var35 = (var58 = var16 - 0.01F) == 0.0F ? 0 : (var58 < 0.0F ? -1 : 1);
      if (var9 != null) {
         if (var35 > 0) {
            me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
               me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               (float)var11,
               (float)var2,
               var13,
               24.0F,
               5.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ah(),
               var16 * 0.55F,
               3.0F);
         }

         var35 = var14;
      }

      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var17 = var35 != 0
         ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .H()
         : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .G();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var11, var2, var13, 24.0F, var17, 5.0F);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var11,
         var2,
         var13,
         24.0F,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y(),
         5.0F
      );
      me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var36 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      var10001 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.Z();
      var10002 = 19087;
      var10003 = 31334;
      var36.a("presetdelrip:" + var10001, var11, var2, var13, 24.0F, 5.0F);
      short var43 = 19076;
      var10002 = -27439;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            "\n    <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n        <polyline points=\"3,6 5,6 21,6\"/>\n        <path d=\"M19 6v14a2 2 0 0 1-2 2H7a2 2 0 0 1-2-2V6m3 0V4a2 2 0 0 1 2-2h4a2 2 0 0 1 2 2v2\"/>\n        <line x1=\"10\" y1=\"11\" x2=\"10\" y2=\"17\"/>\n        <line x1=\"14\" y1=\"11\" x2=\"14\" y2=\"17\"/>\n    </svg>\n",
            var11 + var13 / 2 - 6.5F,
            (float)var2 + 12 - 6.5F,
            13.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(),
            var10
         );
      me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var37 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      var10001 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.Z();
      var10002 = 19093;
      var10003 = -32687;
      float var18 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(var37, "presetreset:" + var10001, (var15 != 0), 0.0F, 4, null
      );
      float var59;
      int var38 = (var59 = var18 - 0.01F) == 0.0F ? 0 : (var59 < 0.0F ? -1 : 1);
      if (var9 != null) {
         if (var38 > 0) {
            me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
               me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               var11 + var13 + 5,
               (float)var2,
               var13,
               24.0F,
               5.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ah(),
               var18 * 0.55F,
               3.0F);
         }

         var38 = var15;
      }

      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var19 = var38 != 0
         ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .H()
         : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .G();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var11 + var13 + 5, var2, var13, 24.0F, var19, 5.0F
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var11 + var13 + 5,
         var2,
         var13,
         24.0F,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y(),
         5.0F
      );
      me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var39 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      var10001 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.Z();
      var10002 = 19097;
      var10003 = 2598;
      var39.a("presetresetrip:" + var10001, var11 + var13 + 5, var2, var13, 24.0F, 5.0F);
      short var46 = 19085;
      var10002 = 14365;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n            <polyline points=\"23,4 23,10 17,10\"/>\n            <polyline points=\"1,20 1,14 7,14\"/>\n            <path d=\"m20.49 9A9 9 0 0 0 5.64 5.64L1 10m22 4l-4.64 4.36A9 9 0 0 1 3.51 15\"/>\n        </svg>\n    ",
            var11 + var13 + 5 + var13 / 2 - 6.5F,
            (float)var2 + 12 - 6.5F,
            13.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(),
            var10
         );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
      var40 = var14;
      label81:
      if (var9 != null) {
         if (var14 != 0) {
            float var60;
            var40 = (var60 = var7 - (var8.d() + 5)) == 0.0F ? 0 : (var60 < 0.0F ? -1 : 1);
            if (var9 == null) {
               break label81;
            }

            if (var40 > 0) {
               llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(true);
               final float var20 = var6;
               final float var21 = var7;
               final float var22 = var11;
               final float var23 = var2;
               final float var25 = 24.0F;
               return new llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl() {
                  private static String b;

                  @Override
                  public void e() {
                     String var2x;
                     int var6x;
                     label26: {
                        label29: {
                           String[] var10000x = IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.x();
                           var2x = IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                              .i();
                           String[] var1x = var10000x;
                           CharSequence var3x = var2x;
                           CharSequence var5x = var3x;
                           if (var1x != null) {
                              if (var3x == null) {
                                 break label29;
                              }

                              var5x = var3x;
                           }

                           var6x = var5x.length();
                           if (var1x == null) {
                              break label26;
                           }

                           if (var6x != 0) {
                              var6x = 0;
                              break label26;
                           }
                        }

                        var6x = 1;
                     }

                     if (var6x == 0) {
                        IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                           .i(var2x);
                        IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                           .e(null);
                     }

                     float var4x = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .a(var13, var25, var20, var21, var22, var23)
                        + 4.0F;
                     me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(
                           b
                              + IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                                 .Z(),
                           var20,
                           var21,
                           IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .ah()
                              .a(170),
                           var4x,
                           460L
                        );
                  }

                  // $VF: Irreducible bytecode was duplicated to produce valid code
                  static {
                     pxClinit: {
                     char[] var10003x = "SlH]\u0010\u0004iFr_G\u0005J".toCharArray();
                     int var10004 = var10003x.length;
                     int var0 = 0;
                     byte var6x = 23;
                     char[] var10002x = var10003x;
                     int var1x = var10004;
                     byte var10x;
                     char[] var10005;
                     int var10006;
                     if (var10004 <= 1) {
                        var10005 = var10003x;
                        var10x = 23;
                        var10006 = var0;
                     } else {
                        var6x = 23;
                        var1x = var10004;
                        if (var10004 <= var0) {
                           String var9x = new String(var10003x).intern();
                           byte var4x = -1;
                           b = var9x;
                           break pxClinit;
                        }

                        var10005 = var10003x;
                        var10x = 23;
                        var10006 = var0;
                     }

                     while (true) {
                        var10005[var10006] = (char)(var10005[var10006] ^ var10x ^ switch (var0 % 7) {
                           case 0 -> 52;
                           case 1 -> 9;
                           case 2 -> 58;
                           case 3 -> 57;
                           case 4 -> 98;
                           case 5 -> 103;
                           default -> 26;
                        });
                        var0++;
                        if (var6x == 0) {
                           var10006 = var6x;
                           var10005 = var10002x;
                           var10x = var6x;
                        } else {
                           if (var1x <= var0) {
                              String var8x = new String(var10002x).intern();
                              byte var3x = -1;
                              b = var8x;
                              break pxClinit;
                           }

                           var10005 = var10002x;
                           var10x = var6x;
                           var10006 = var0;
                        }
                     }
                     }
                  }
               };
            }
         }

         var40 = var15;
      }

      if (var9 != null) {
         if (var40 == 0) {
            return null;
         }

         float var61;
         var40 = (var61 = var7 - (var8.d() + 5)) == 0.0F ? 0 : (var61 < 0.0F ? -1 : 1);
      }

      if (var9 != null) {
         if (var40 <= 0) {
            return null;
         }

         llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(true);
         var40 = var6;
      }

      final float var26 = var40;
      final float var27 = var7;
      final float var28 = var11 + var13 + 5;
      final float var29 = var2;
      final float var30 = 24.0F;
      return new llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl() {
         private static String b;

         @Override
         public void e() {
            IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
               .m();
            float var1 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var13, var30, var26, var27, var28, var29)
               + 4.0F;
            me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(
                  b
                     + IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        .Z(),
                  var26,
                  var27,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .ah()
                     .a(170),
                  var1,
                  460L
               );
         }

         // $VF: Irreducible bytecode was duplicated to produce valid code
         static {
            pxClinit: {
            char[] var10003 = "2`AY\u0004j\u0002'aA^\u0013w\u0000x".toCharArray();
            int var10004 = var10003.length;
            int var0 = 0;
            byte var6 = 29;
            char[] var10002 = var10003;
            int var1 = var10004;
            byte var10;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var10 = 29;
               var10006 = var0;
            } else {
               var6 = 29;
               var1 = var10004;
               if (var10004 <= var0) {
                  String var9 = new String(var10003).intern();
                  byte var4 = -1;
                  b = var9;
                  break pxClinit;
               }

               var10005 = var10003;
               var10 = 29;
               var10006 = var0;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
                  case 0 -> 95;
                  case 1 -> 15;
                  case 2 -> 57;
                  case 3 -> 55;
                  case 4 -> 124;
                  case 5 -> 3;
                  default -> 109;
               });
               var0++;
               if (var6 == 0) {
                  var10006 = var6;
                  var10005 = var10002;
                  var10 = var6;
               } else {
                  if (var1 <= var0) {
                     String var8 = new String(var10002).intern();
                     byte var3 = -1;
                     b = var8;
                     break pxClinit;
                  }

                  var10005 = var10002;
                  var10 = var6;
                  var10006 = var0;
               }
            }
            }
         }
      };
   }

   private final llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl c(
      int var1,
      int var2,
      int var3,
      int var4,
      float var5,
      int var6,
      int var7,
      llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var8
   ) {
      int var40 = 0; // PX-FIX
      Object var33 = null; // PX-FIX
      Object var32 = null; // PX-FIX
      String[] var10000 = x();
      float var10 = this.a(var4);
      String[] var9 = var10000;
      float var55;
      int var31 = (var55 = var10 - 0.02F) == 0.0F ? 0 : (var55 < 0.0F ? -1 : 1);
      if (var9 != null) {
         if (var31 <= 0) {
            return null;
         }

         var31 = var1 - 8 + 5;
      }

      int var11;
      int var12;
      final float var13;
      label110: {
         label114: {
            var11 = var31;
            var12 = var3 + 16 - 10;
            var13 = (float)(var12 / 2) - 3;
            var32 = this.a(var6, var7, var11, var2, (int)(var11 + var13 + 3), var2 + 24);
            if (var9 != null) {
               if ((me.octo.client.PxTruth.truth(var32))) {
                  break label114;
               }

               float var56;
               var32 = (var56 = var5 - 0.8F) == 0.0F ? 0 : (var56 < 0.0F ? -1 : 1);
            }

            if (var9 == null) {
               break label110;
            }

            if ((me.octo.client.PxTruth.truth(var32))) {
               var32 = 1;
               break label110;
            }
         }

         var32 = 0;
      }

      int var14;
      label99: {
         label115: {
            var14 =((Integer)( var32));
            var33 = this.a(var6, var7, (int)(var11 + var13 + 5), var2, var11 + var12, var2 + 24);
            if (var9 != null) {
               if ((me.octo.client.PxTruth.truth(var33))) {
                  break label115;
               }

               float var57;
               var33 = (var57 = var5 - 0.8F) == 0.0F ? 0 : (var57 < 0.0F ? -1 : 1);
            }

            if (var9 == null) {
               break label99;
            }

            if ((me.octo.client.PxTruth.truth(var33))) {
               var33 = 1;
               break label99;
            }
         }

         var33 = 0;
      }

      int var15 =((Integer)( var33));
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(var10);
      me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var34 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      String var10001 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.Z();
      short var10002 = 19103;
      short var10003 = 16226;
      float var16 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(var34, "presetexport:" + var10001, (var14 != 0), 0.0F, 4, null
      );
      float var58;
      int var35 = (var58 = var16 - 0.01F) == 0.0F ? 0 : (var58 < 0.0F ? -1 : 1);
      if (var9 != null) {
         if (var35 > 0) {
            me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
               me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               (float)var11,
               (float)var2,
               var13,
               24.0F,
               5.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ah(),
               var16 * 0.55F,
               3.0F);
         }

         var35 = var14;
      }

      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var17 = var35 != 0
         ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .H()
         : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .G();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var11, var2, var13, 24.0F, var17, 5.0F);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var11,
         var2,
         var13,
         24.0F,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y(),
         5.0F
      );
      me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var36 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      var10001 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.Z();
      var10002 = 19088;
      var10003 = 26810;
      var36.a("presetexportrip:" + var10001, var11, var2, var13, 24.0F, 5.0F);
      short var43 = 19089;
      var10002 = 14264;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n            <path d=\"M21 15v4a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2v-4\"/>\n            <polyline points=\"17,8 12,3 7,8\"/>\n            <line x1=\"12\" y1=\"3\" x2=\"12\" y2=\"15\"/>\n        </svg>\n    ",
            var11 + var13 / 2 - 6.5F,
            (float)var2 + 12 - 6.5F,
            13.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(),
            var10
         );
      me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var37 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      var10001 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.Z();
      var10002 = 19075;
      var10003 = -32352;
      float var18 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(var37, "presetimport:" + var10001, (var15 != 0), 0.0F, 4, null
      );
      float var59;
      int var38 = (var59 = var18 - 0.01F) == 0.0F ? 0 : (var59 < 0.0F ? -1 : 1);
      if (var9 != null) {
         if (var38 > 0) {
            me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
               me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               var11 + var13 + 5,
               (float)var2,
               var13,
               24.0F,
               5.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ah(),
               var18 * 0.55F,
               3.0F);
         }

         var38 = var15;
      }

      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var19 = var38 != 0
         ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .H()
         : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .G();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var11 + var13 + 5, var2, var13, 24.0F, var19, 5.0F
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var11 + var13 + 5,
         var2,
         var13,
         24.0F,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y(),
         5.0F
      );
      me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var39 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      var10001 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.Z();
      var10002 = 19101;
      var10003 = -20563;
      var39.a("presetimportrip:" + var10001, var11 + var13 + 5, var2, var13, 24.0F, 5.0F);
      short var46 = 19091;
      var10002 = -13354;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n            <path d=\"M21 15v4a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2v-4\"/>\n            <polyline points=\"7,10 12,15 17,10\"/>\n            <line x1=\"12\" y1=\"15\" x2=\"12\" y2=\"3\"/>\n        </svg>\n    ",
            var11 + var13 + 5 + var13 / 2 - 6.5F,
            (float)var2 + 12 - 6.5F,
            13.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(),
            var10
         );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
      var40 = var14;
      label81:
      if (var9 != null) {
         if (var14 != 0) {
            float var60;
            var40 = (var60 = var7 - (var8.d() + 5)) == 0.0F ? 0 : (var60 < 0.0F ? -1 : 1);
            if (var9 == null) {
               break label81;
            }

            if (var40 > 0) {
               llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(true);
               final float var20 = var6;
               final float var21 = var7;
               final float var22 = var11;
               final float var23 = var2;
               final float var25 = 24.0F;
               return new llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl() {
                  private static String b;

                  @Override
                  public void e() {
                     String[] var1x = IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.x();
                     if (var1x != null) {
                        String var10000x = IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                           .n();
                        if (var10000x != null) {
                           String var3x = var10000x;
                           boolean var4x = false;
                           me.octo.client.utils.llIIlllIlIlllIIllIllIIIIIlIlIlIlIlIIlllIlllllIlIIlIIIlIlllllIIIIllIIIIllIIIlllIlllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .a(var3x);
                        }
                     }

                     float var2x = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .a(var13, var25, var20, var21, var22, var23)
                        + 4.0F;
                     me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(
                           b
                              + IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                                 .Z(),
                           var20,
                           var21,
                           IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .ah()
                              .a(170),
                           var2x,
                           460L
                        );
                  }

                  // $VF: Irreducible bytecode was duplicated to produce valid code
                  static {
                     pxClinit: {
                     char[] var10003x = ",1ut\u000ep.$3\u007fu\u001fv\",y".toCharArray();
                     int var10004 = var10003x.length;
                     int var0 = 0;
                     byte var6x = 12;
                     char[] var10002x = var10003x;
                     int var1x = var10004;
                     byte var10x;
                     char[] var10005;
                     int var10006;
                     if (var10004 <= 1) {
                        var10005 = var10003x;
                        var10x = 12;
                        var10006 = var0;
                     } else {
                        var6x = 12;
                        var1x = var10004;
                        if (var10004 <= var0) {
                           String var9x = new String(var10003x).intern();
                           byte var4x = -1;
                           b = var9x;
                           break pxClinit;
                        }

                        var10005 = var10003x;
                        var10x = 12;
                        var10006 = var0;
                     }

                     while (true) {
                        var10005[var10006] = (char)(var10005[var10006] ^ var10x ^ switch (var0 % 7) {
                           case 0 -> 80;
                           case 1 -> 79;
                           case 2 -> 28;
                           case 3 -> 11;
                           case 4 -> 103;
                           case 5 -> 8;
                           default -> 71;
                        });
                        var0++;
                        if (var6x == 0) {
                           var10006 = var6x;
                           var10005 = var10002x;
                           var10x = var6x;
                        } else {
                           if (var1x <= var0) {
                              String var8x = new String(var10002x).intern();
                              byte var3x = -1;
                              b = var8x;
                              break pxClinit;
                           }

                           var10005 = var10002x;
                           var10x = var6x;
                           var10006 = var0;
                        }
                     }
                     }
                  }
               };
            }
         }

         var40 = var15;
      }

      if (var9 != null) {
         if (var40 == 0) {
            return null;
         }

         float var61;
         var40 = (var61 = var7 - (var8.d() + 5)) == 0.0F ? 0 : (var61 < 0.0F ? -1 : 1);
      }

      if (var9 != null) {
         if (var40 <= 0) {
            return null;
         }

         llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(true);
         var40 = var6;
      }

      final float var26 = var40;
      final float var27 = var7;
      final float var28 = var11 + var13 + 5;
      final float var29 = var2;
      final float var30 = 24.0F;
      return new llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl() {
         private static String b;

         @Override
         public void e() {
            String[] var10000 = IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.x();
            String var2 = me.octo.client.utils.llIIlllIlIlllIIllIllIIIIIlIlIlIlIlIIlllIlllllIlIIlIIIlIlllllIIIIllIIIIllIIIlllIlllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a();
            String[] var1 = var10000;
            boolean var4 = StringsKt.isBlank(var2);
            if (var1 != null) {
               var4 = !var4;
            }

            if (var4) {
               IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                  .j(var2);
            }

            float var3 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var13, var30, var26, var27, var28, var29)
               + 4.0F;
            me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(
                  b
                     + IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        .Z(),
                  var26,
                  var27,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .ah()
                     .a(170),
                  var3,
                  460L
               );
         }

         // $VF: Irreducible bytecode was duplicated to produce valid code
         static {
            pxClinit: {
            char[] var10003 = "l1\"j_R\u000bq3(kNT\u000bly".toCharArray();
            int var10004 = var10003.length;
            int var0 = 0;
            byte var6 = 102;
            char[] var10002 = var10003;
            int var1 = var10004;
            byte var10;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var10 = 102;
               var10006 = var0;
            } else {
               var6 = 102;
               var1 = var10004;
               if (var10004 <= var0) {
                  String var9 = new String(var10003).intern();
                  byte var4 = -1;
                  b = var9;
                  break pxClinit;
               }

               var10005 = var10003;
               var10 = 102;
               var10006 = var0;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
                  case 0 -> 122;
                  case 1 -> 37;
                  case 2 -> 33;
                  case 3 -> 127;
                  case 4 -> 92;
                  case 5 -> 64;
                  default -> 4;
               });
               var0++;
               if (var6 == 0) {
                  var10006 = var6;
                  var10005 = var10002;
                  var10 = var6;
               } else {
                  if (var1 <= var0) {
                     String var8 = new String(var10002).intern();
                     byte var3 = -1;
                     b = var8;
                     break pxClinit;
                  }

                  var10005 = var10002;
                  var10 = var6;
                  var10006 = var0;
               }
            }
            }
         }
      };
   }

   private final void a(
      int var1,
      int var2,
      int var3,
      int var4,
      float var5,
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6
   ) {
      float var7 = var3 * var5;
      float var8 = var4 * var5;
      float var9 = var1 + (var3 - var7) * 0.5F;
      float var10 = var2 + (var4 - var8) * 0.5F;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var9, var10, var7, var8, var6, 3.0F);
   }

   private final void a(
      String var1,
      int var2,
      int var3,
      int var4,
      int var5,
      float var6,
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var7
   ) {
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
      float var8 = var2 + var4 * 0.5F;
      float var9 = var3 + var5 * 0.5F;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(var8, var9);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var6, var6);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(-var8, -var9);
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll, var1, var2, var3, var7, false, 16, null);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
   }

   private final void r() {
      String[] var10000 = x();
      long var2 = System.currentTimeMillis();
      String[] var1 = var10000;
      if (var2 - this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll > 530L) {
         boolean var10001 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         if (var1 != null) {
            var10001 = !this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         }

         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var10001;
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var2;
      }
   }

   @NotNull
   @Override
   public IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll m() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   @Override
   public String k() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.al().name();
   }

   @NotNull
   @Override
   public String l() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.am();
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
      String[] var7 = x();
      int var10000 = var1;
      int var10001 = var3;
      if (var7 != null) {
         if (var1 < var3) {
            return (0 != 0);
         }

         var10000 = var2;
         var10001 = var4;
      }

      if (var7 != null) {
         if (var10000 < var10001) {
            return (0 != 0);
         }

         var10000 = var1;
         var10001 = var5;
      }

      if (var7 != null) {
         if (var10000 >= var10001) {
            return (0 != 0);
         }

         var10000 = var2;
         if (var7 == null) {
            return (var2 != 0);
         }

         var10001 = var6;
      }

      return (var10000 < var10001);
   }

   @Override
   public void i() {
      this.p();
   }

   @Override
   public boolean j() {
      String[] var1 = x();
      if (var1 != null) {
         IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var10000 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.get(
            this.f()
         );
         if (var10000 != null) {
            return var10000.a();
         }
      }

      return false;
   }

   @Override
   public float h() {
      return this.o();
   }

   @Override
   public void a(
      @Nullable GuiGraphicsExtractor var1,
      float var2,
      float var3,
      @NotNull me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4
   ) {
      short var10001 = 19095;
      short var10002 = -9404;
      Intrinsics.checkNotNullParameter(var4, "color");
      float var5 = this.o() * 180.0F;
      me.octo.client.utils.IIlIlllllIIlIllllIlIlIIIllIlIIlIlllIIllIIIIIlIIIIlIIIIlIlIlIlIllIlllllIIIllIIlllllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .d(null, var2 + 5, var3, 12.0F, 6.0F, var5, var4, 1.8F);
   }

   public final void s() {
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = false;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = "";
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = true;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.b();
   }

   public final boolean a(int var1, int var2) {
      String[] var3 = x();
      int var10000 = ((this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0);
      if (var3 != null) {
         if (!this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
            return false;
         }

         var10000 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
            .a(
               var1,
               null,
               null
            ) ? 1 : 0;
      }

      if (var3 != null) {
         if (var10000 != 0) {
            this.t();
            return true;
         }

         var10000 = var1;
      }

      if (var3 != null) {
         label114: {
            label85:
            switch (var10000) {
               case 256:
                  this.s();
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.b();
                  return false;
               case 257:
                  var10000 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.length();
                  if (var3 != null) {
                     var10000 = var10000 > 0 ? 1 : 0;
                  }

                  if (var10000 != 0) {
                     this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        .g(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
                     this.s();
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.b();
                  }

                  return true;
               case 259:
                  var10000 = var2;
                  if (var3 == null) {
                     break;
                  }

                  switch (var2) {
                     case 1:
                     case 2:
                        var10000 = ((java.util.function.Supplier<Integer>)(() -> { this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                           .a(String.valueOf((kotlin.jvm.functions.Function1)null)); return 0; })).get();
                        break label85;
                     default:
                        if (var3 != null) {
                           break label114;
                        }
                  }
               case 86:
                  if (var3 == null) {
                     return (var2 != 0);
                  }

                  if (var2 == 1) {
                     boolean var6 = this.u();
                     if (var3 == null) {
                        return var6;
                     }

                     if (var6) {
                        this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                           .b(null);
                        this.v();
                        return true;
                     }
                  }
               default:
                  break label114;
            }

            if (var3 != null) {
               if (var10000 != 0) {
                  this.t();
                  if (var3 != null) {
                     return true;
                  }
               }

               var10000 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.length();
            }

            if (var3 != null) {
               var10000 = var10000 > 0 ? 1 : 0;
            }

            if (var10000 != 0) {
               this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = StringsKt.dropLast(
                  this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, 1
               );
               this.t();
            }

            return true;
         }

         var10000 = 0;
      }

      return (var10000 != 0);
   }

   public final void a(char var1) {
      String[] var2 = x();
      int var10000 = ((this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0);
      if (var2 != null) {
         if (!this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
            return;
         }

         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
            .b(null);
         var10000 = var1;
      }

      label40: {
         char var3 = (char)var10000;
         var10000 = 32;
         char var10001 = var3;
         if (var2 != null) {
            if (' ' > var3) {
               var10000 = 0;
               break label40;
            }

            var10000 = var3;
            if (var2 == null) {
               break label40;
            }

            var10001 = 127;
         }

         var10000 = var10000 < var10001 ? 1 : 0;
      }

      if (var10000 != 0) {
         IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll var5 = this;
         if (var2 != null) {
            if (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.length() >= 16) {
               return;
            }

            this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
               + var1;
            var5 = this;
         }

         var5.t();
      }
   }

   private final void t() {
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = true;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = System.currentTimeMillis();
   }

   private final boolean u() {
      String[] var10000 = x();
      long var2 = Minecraft.getInstance().getWindow().handle();
      String[] var1 = var10000;
      int var4 = GLFW.glfwGetKey(var2, 341);
      if (var1 != null) {
         if (var4 != 1) {
            int var5 = GLFW.glfwGetKey(var2, 345);
            if (var1 == null) {
               return (var5 != 0);
            }

            if (var5 != 1) {
               return (0 != 0);
            }
         }

         var4 = 1;
      }

      return (var4 != 0);
   }

   private final void v() {
      Object var9 = null; // PX-FIX
      int var10 = 0; // PX-FIX
      String[] var10000 = x();
      String var2 = GLFW.glfwGetClipboardString(Minecraft.getInstance().getWindow().handle());
      String[] var1 = var10000;
      String var8 = var2;
      if (var1 != null) {
         if (var2 == null) {
            return;
         }

         var8 = var2;
      }

      String var3 = var8;
      int var4 = 0;
      int var5 = var3.length();

      label50: {
         while (var4 < var5) {
            char var6 = var3.charAt(var4);
            var9 = this;
            if (var1 == null || var1 == null) {
               break label50;
            }

            if (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.length() >= 16) {
               break;
            }

            label46: {
               var10 = 32;
               char var10001 = var6;
               if (var1 != null) {
                  if (' ' > var6) {
                     var10 = 0;
                     break label46;
                  }

                  var10 = var6;
                  if (var1 == null) {
                     break label46;
                  }

                  var10001 = 127;
               }

               var10 = var10 < var10001 ? 1 : 0;
            }

            if (var10 != 0) {
               this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                  + var6;
            }

            var4++;
            if (var1 == null) {
               break;
            }
         }

         var9 = this;
      }

      this.t();
   }

   private static final Unit a(IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll var0) {
      String var2;
      int var5;
      label26: {
         label29: {
            String[] var10000 = x();
            var2 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.i();
            String[] var1 = var10000;
            CharSequence var3 = var2;
            CharSequence var4 = var3;
            if (var1 != null) {
               if (var3 == null) {
                  break label29;
               }

               var4 = var3;
            }

            var5 = var4.length();
            if (var1 == null) {
               break label26;
            }

            if (var5 != 0) {
               var5 = 0;
               break label26;
            }
         }

         var5 = 1;
      }

      if (var5 == 0) {
         var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.h(var2);
         var0.p();
      }

      return Unit.INSTANCE;
   }

   private static final Unit b(IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll var0) {
      String var2;
      int var5;
      label26: {
         label29: {
            String[] var10000 = x();
            var2 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.i();
            String[] var1 = var10000;
            CharSequence var3 = var2;
            CharSequence var4 = var3;
            if (var1 != null) {
               if (var3 == null) {
                  break label29;
               }

               var4 = var3;
            }

            var5 = var4.length();
            if (var1 == null) {
               break label26;
            }

            if (var5 != 0) {
               var5 = 0;
               break label26;
            }
         }

         var5 = 1;
      }

      if (var5 == 0) {
         var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.g(var2);
         var0.p();
      }

      return Unit.INSTANCE;
   }

   private static final String c(IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll var0) {
      return var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   private static final Unit d(IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll var0) {
      var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = "";
      return Unit.INSTANCE;
   }

   private static final Unit e(IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll var0) {
      var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = "";
      return Unit.INSTANCE;
   }

   private static final Unit f(IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll var0) {
      var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = "";
      return Unit.INSTANCE;
   }

   private static final Unit g(IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll var0) {
      var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = "";
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
      String[] var5 = new String[32];
      int var3 = 0;
      String[] var10000 = new String[1];
      String var2 = "r\u000eÑ\u0095¦\u001c/Å\u001a$TB\u0003\u008cè©č\u0081&ßÛÏ¸ª×\u0017f®1hé46ßî@ì-æ¶ò\u008bh²^\u0082ÙT0ìSÊãÙÐüé¬c\u009cÍ\u0096K÷þÆ\u008eÉ²\u0019\u008d\u001dõ\u001aQ\u009ec^K\tê\u008aJêe\u008f«Z¦\u0098(\b|·¶\u0080ÒÌ-ö¶PüWïÞ>\u0088\u0007S`u8mTq\u0098p\u0002\u001b]5v*\u009d\nVÒ»\u008fPÒÈê³L¶\u008bVlþM\u0081HÞË¬\br÷çþ|\u0080»Ñ$ùË\u009eÇ¥Áºp»\u00174\u0012\u0098~Ó\u008dú®k\u0016>\u0002\u0085À³|eÊ\u0093\u0092ÉÆ(\u009cë\u001c,ë®\u009dÕÛÕl\u0005\u007f\u0019&b;MjÐu4rRP\u000eÈ\u009aÚ\u0000\u009bBóWJ)\u001aå\u001dpj±«â\u0000\u000fÎÏBj*Ý\u001c*ó@\u0010\u001b³;ä6úª\\¤\u0099\u000f>ºV«]\u0006\u0093\u0083\u0082nl\rÏ!æ\u0010\u001fM,'½\u0085\u0001ö®q\u0097®\u0010µRôJá\"\u0002\u0016\u0098\u0080\u008flÐËAÓĐâÉ³&B\u0007\u001b !\u0098hî°\u0012/I¼\u0001,\u0011 Y\u0007\u0005½\u0096t\u0081Z\"OO\u008f¼¦\u001eToM\u001e\u009a\u009dZ\u0012N°ì\u0081¥a¥O\u00942¬\u0002,¯X¼\u0086°\u0012\u0095é¥\u0086\u0098\u0002\u0014ëQ®ÖÎ£oM\u009b\u00ad¯Â\u009aKÝCæ\u0018èÀNØ\u008b\u009bnG\u000e»\u001deý½ªª\u0003\u0088ìBÒ\u00adÉÄì¿¾5g\fýA½¨ª!\u0095zS¡¨Cd\u008fzXO\u008b¶E\u0017û!0\u0085¸Æ.Ö\u008d6¨\u0085å®\u0080\u0015R\"Upi]íé=>ÃÔ=¥l\u000f\u0019ðgðcO\u0004Â`Xdb\u0080(\u0092\u0002\u0092\u0001\u00ad#\u00adH'Ý\u0088\u009fÎBÛ |\u008a \u0013\u0084}¤lÇMº)H\r\u0086$\u009bãtÖ«W\u0017\u0085ð\u0001Q\u000føÝîV\näÂE\u0019&3ë)x¶G\u0004ÅR\n>üÈ\u009b\u0086\u009cÏ§:§\u0087¶lÆu£\u00836·\u009b\u0086G\u0013\f^\u001fO¹)\u0019»±\u000eývæ\f¹Æ¨\u008c\u0089?Ý¼²¿$4\rqßÿLMóÑ\u0010*¹\u0011«\u008c\u0005CÜ\u008fmR\u000eÂu£\u001d\u001e\u000b\u0007÷\u0085ñ\u000e\rÃ4\u000f®\u0084JÄÕ6V\u009dÃ\u009b\nø\u0015\u0004\u0018\núgÀ¸\u0084¹jl\u008fú\r\u008e{Ì²!x!\u008e¬}`x\u000e\u0007n\u009eR\u0087Ö^~\u0010|p\u0010Z\u009eå$ïöÖÉ\u001c°G\u009eÐ\u0004\u009e'\u0018×\r6åYè·³\r0^\u009aÜ\u0095Z\u00048\u00ad'H\u000bÚ\u0017Ä¶\u0004xwE\u0089»Ù\u0004+ÇE\u0005\r\u0000ï\u009f©o\u009b\u001a 1/1#çŊk\u0080\u0082\u000fd>\u008cÎ\u00adÅSÅpÜA+ÞÁ¾UÆh\u009a\u008dXÕLý\u001bkç;\n\u0088Ê\u0016ëO«>3y·9\u001d©Ä\u0015ô\u008d!&B]Ö®£se2q\u0012Ù\u009ah\u0087yU¿\u001a\u0018»f\u0091Ìu\t-Ïe¨ð\u000b\"¡\u0006´ß¢8\u001b\u0097ñdÞ1#þ\u0081\u001a\r\u0013\u0086I·=w\u001c\\ù/áär½ÜEI§Ì9Âd¨\u0092)\u0092gÒón½\u0082'Ìj§§2ºHÆÚ\u001e\\,\u008e\u0080\u001bâø\u0001\u009esS,è\u009a*\u009d7ßæ\u0013\u0084r´t\u0014ÌB\u0086~\u0013\u009f¯\u0090ÔOtl(\u008a£°\u001d$\u0099S\u009ajÓ\u0012N\u0083\u009a³\u0011×0\u008c!\u0086ä\u0016u\u009f\u009ap\u0000ÌB\u001aWV)Û³{h/eâ\"ó\u0006þßë8.ÛË-í´ùpî\u0002lðëì<FÔ'´\u007f\u0006\u008d3éôløá\u001eÍ\u0093\"\u007f\u001f~\u001fZ\u00901QÖ4æF\u009eHÌ=ZèÇ\u0089ó\u000bÍ\u0017ûl\f¢ÈQLbXaº\u009c0afö\u009c\u0010Þ\u0099NQ\u009fsa\u001eJ¯O\u0004Q\\ñb\u0092\u001f\u0092½Ýd717c\u000bj¢@\u00046±Ô\u0004\u001a\u0086å\f7$bÞ\u008cõ\u000f,\u0098N¤\u0090\rÔ\u000bKÖÛ \u0003zpôZ\u0002å\u0003,ÈÄ\u0006'\u008dÄ],Ò\n\u0090\u0098\u008dG-FY\u0082-\u0014\u0004ð\u007fÕÜ\r]\n4\u0015\u001a\f¿ËñuïÒDħ¥®[Ê_\u009a¸\u0093Uîæ aË\u0015rûfÄý½Ä¤¶ÉàúO\u008bûutÈÛNòIòî\u00adîëÔÜ\u009fiÖºâ\u0006M£\u0089¯\u000f±XÙÖrWi(®®Ânt\u001f\u0089HâÚ @m¾\u0094¡\u0096è¥r§ÀÞE«\u009c¶À\u0016ZBT|IÜõ\u0089î8\u0016Mªâ2[ä\u0010L¹}¡ì\u0010\u0005\u0090¯·:òK6Ê\bª@Â(\u0088[s¶p\u0092Ì\tZr\u008b\fñ\u009e\n\u0010\u0012Â\u001c\u0088L3µ¼M^\fS\bæAô^Ê\u0017V\u008e×0%Ö¸âö\u0096-\u0011)Ù\u0088ÉÛ¥ýéÏ\t:r\u0087\fp\u009e:\u0010\u0014Þ\u0090\u0085\u0003¥}ârÐ=Ug7¹ðã½\u0002 Îd\u0019ä£\u0081@ñ[ù'\u001e #D9é¾\u0005Ou\bí¿ÿ\u0081°@\u0099À\"øDÛh:P\u0002\u0091Ðàcü?u¥,«²¶%\u0018\u0082]ø½ÉÕA¤lVÖ\t\u0089ás¼q¿âh$1\u0086¼9;t§";
      int var4 = "r\u000eÑ\u0095¦\u001c/Å\u001a$TB\u0003\u008cè©č\u0081&ßÛÏ¸ª×\u0017f®1hé46ßî@ì-æ¶ò\u008bh²^\u0082ÙT0ìSÊãÙÐüé¬c\u009cÍ\u0096K÷þÆ\u008eÉ²\u0019\u008d\u001dõ\u001aQ\u009ec^K\tê\u008aJêe\u008f«Z¦\u0098(\b|·¶\u0080ÒÌ-ö¶PüWïÞ>\u0088\u0007S`u8mTq\u0098p\u0002\u001b]5v*\u009d\nVÒ»\u008fPÒÈê³L¶\u008bVlþM\u0081HÞË¬\br÷çþ|\u0080»Ñ$ùË\u009eÇ¥Áºp»\u00174\u0012\u0098~Ó\u008dú®k\u0016>\u0002\u0085À³|eÊ\u0093\u0092ÉÆ(\u009cë\u001c,ë®\u009dÕÛÕl\u0005\u007f\u0019&b;MjÐu4rRP\u000eÈ\u009aÚ\u0000\u009bBóWJ)\u001aå\u001dpj±«â\u0000\u000fÎÏBj*Ý\u001c*ó@\u0010\u001b³;ä6úª\\¤\u0099\u000f>ºV«]\u0006\u0093\u0083\u0082nl\rÏ!æ\u0010\u001fM,'½\u0085\u0001ö®q\u0097®\u0010µRôJá\"\u0002\u0016\u0098\u0080\u008flÐËAÓĐâÉ³&B\u0007\u001b !\u0098hî°\u0012/I¼\u0001,\u0011 Y\u0007\u0005½\u0096t\u0081Z\"OO\u008f¼¦\u001eToM\u001e\u009a\u009dZ\u0012N°ì\u0081¥a¥O\u00942¬\u0002,¯X¼\u0086°\u0012\u0095é¥\u0086\u0098\u0002\u0014ëQ®ÖÎ£oM\u009b\u00ad¯Â\u009aKÝCæ\u0018èÀNØ\u008b\u009bnG\u000e»\u001deý½ªª\u0003\u0088ìBÒ\u00adÉÄì¿¾5g\fýA½¨ª!\u0095zS¡¨Cd\u008fzXO\u008b¶E\u0017û!0\u0085¸Æ.Ö\u008d6¨\u0085å®\u0080\u0015R\"Upi]íé=>ÃÔ=¥l\u000f\u0019ðgðcO\u0004Â`Xdb\u0080(\u0092\u0002\u0092\u0001\u00ad#\u00adH'Ý\u0088\u009fÎBÛ |\u008a \u0013\u0084}¤lÇMº)H\r\u0086$\u009bãtÖ«W\u0017\u0085ð\u0001Q\u000føÝîV\näÂE\u0019&3ë)x¶G\u0004ÅR\n>üÈ\u009b\u0086\u009cÏ§:§\u0087¶lÆu£\u00836·\u009b\u0086G\u0013\f^\u001fO¹)\u0019»±\u000eývæ\f¹Æ¨\u008c\u0089?Ý¼²¿$4\rqßÿLMóÑ\u0010*¹\u0011«\u008c\u0005CÜ\u008fmR\u000eÂu£\u001d\u001e\u000b\u0007÷\u0085ñ\u000e\rÃ4\u000f®\u0084JÄÕ6V\u009dÃ\u009b\nø\u0015\u0004\u0018\núgÀ¸\u0084¹jl\u008fú\r\u008e{Ì²!x!\u008e¬}`x\u000e\u0007n\u009eR\u0087Ö^~\u0010|p\u0010Z\u009eå$ïöÖÉ\u001c°G\u009eÐ\u0004\u009e'\u0018×\r6åYè·³\r0^\u009aÜ\u0095Z\u00048\u00ad'H\u000bÚ\u0017Ä¶\u0004xwE\u0089»Ù\u0004+ÇE\u0005\r\u0000ï\u009f©o\u009b\u001a 1/1#çŊk\u0080\u0082\u000fd>\u008cÎ\u00adÅSÅpÜA+ÞÁ¾UÆh\u009a\u008dXÕLý\u001bkç;\n\u0088Ê\u0016ëO«>3y·9\u001d©Ä\u0015ô\u008d!&B]Ö®£se2q\u0012Ù\u009ah\u0087yU¿\u001a\u0018»f\u0091Ìu\t-Ïe¨ð\u000b\"¡\u0006´ß¢8\u001b\u0097ñdÞ1#þ\u0081\u001a\r\u0013\u0086I·=w\u001c\\ù/áär½ÜEI§Ì9Âd¨\u0092)\u0092gÒón½\u0082'Ìj§§2ºHÆÚ\u001e\\,\u008e\u0080\u001bâø\u0001\u009esS,è\u009a*\u009d7ßæ\u0013\u0084r´t\u0014ÌB\u0086~\u0013\u009f¯\u0090ÔOtl(\u008a£°\u001d$\u0099S\u009ajÓ\u0012N\u0083\u009a³\u0011×0\u008c!\u0086ä\u0016u\u009f\u009ap\u0000ÌB\u001aWV)Û³{h/eâ\"ó\u0006þßë8.ÛË-í´ùpî\u0002lðëì<FÔ'´\u007f\u0006\u008d3éôløá\u001eÍ\u0093\"\u007f\u001f~\u001fZ\u00901QÖ4æF\u009eHÌ=ZèÇ\u0089ó\u000bÍ\u0017ûl\f¢ÈQLbXaº\u009c0afö\u009c\u0010Þ\u0099NQ\u009fsa\u001eJ¯O\u0004Q\\ñb\u0092\u001f\u0092½Ýd717c\u000bj¢@\u00046±Ô\u0004\u001a\u0086å\f7$bÞ\u008cõ\u000f,\u0098N¤\u0090\rÔ\u000bKÖÛ \u0003zpôZ\u0002å\u0003,ÈÄ\u0006'\u008dÄ],Ò\n\u0090\u0098\u008dG-FY\u0082-\u0014\u0004ð\u007fÕÜ\r]\n4\u0015\u001a\f¿ËñuïÒDħ¥®[Ê_\u009a¸\u0093Uîæ aË\u0015rûfÄý½Ä¤¶ÉàúO\u008bûutÈÛNòIòî\u00adîëÔÜ\u009fiÖºâ\u0006M£\u0089¯\u000f±XÙÖrWi(®®Ânt\u001f\u0089HâÚ @m¾\u0094¡\u0096è¥r§ÀÞE«\u009c¶À\u0016ZBT|IÜõ\u0089î8\u0016Mªâ2[ä\u0010L¹}¡ì\u0010\u0005\u0090¯·:òK6Ê\bª@Â(\u0088[s¶p\u0092Ì\tZr\u008b\fñ\u009e\n\u0010\u0012Â\u001c\u0088L3µ¼M^\fS\bæAô^Ê\u0017V\u008e×0%Ö¸âö\u0096-\u0011)Ù\u0088ÉÛ¥ýéÏ\t:r\u0087\fp\u009e:\u0010\u0014Þ\u0090\u0085\u0003¥}ârÐ=Ug7¹ðã½\u0002 Îd\u0019ä£\u0081@ñ[ù'\u001e #D9é¾\u0005Ou\bí¿ÿ\u0081°@\u0099À\"øDÛh:P\u0002\u0091Ðàcü?u¥,«²¶%\u0018\u0082]ø½ÉÕA¤lVÖ\t\u0089ás¼q¿âh$1\u0086¼9;t§"
         .length();
      char var1 = 16;
      int var8 = -1;
      b(var10000);

      label52:
while (true) {
         byte var9 = 66;
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
                     case 1 -> 42;
                     case 2 -> 74;
                     case 3 -> 84;
                     case 4 -> 115;
                     case 5 -> 71;
                     default -> 51;
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
                     g = var5;
                     h = new String[32];
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.PXEvMid(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new HashMap<>();
                     break label52;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var30;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "ÕÅ'Só\fê¡ØÌ\r\u0002à\u0089\u001eû;Ójî$\u0018®ì";
                  var4 = "ÕÅ'Só\fê¡ØÌ\r\u0002à\u0089\u001eû;Ójî$\u0018®ì".length();
                  var1 = '\n';
                  var8 = -1;
            }

            var9 = 59;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   public static void b(String[] var0) {
      IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = var0;
   }

   public static String[] x() {
      return IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   }

   private static String d(int var0, int var1) {
      int var2 = (var0 ^ 19088) & 65535;
      if (h[var2] == null) {
         char[] var3 = g[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 172;
            case 1 -> 55;
            case 2 -> 154;
            case 3 -> 238;
            case 4 -> 110;
            case 5 -> 112;
            case 6 -> 30;
            case 7 -> 50;
            case 8 -> 92;
            case 9 -> 167;
            case 10 -> 199;
            case 11 -> 32;
            case 12 -> 159;
            case 13 -> 191;
            case 14 -> 232;
            case 15 -> 204;
            case 16 -> 118;
            case 17 -> 229;
            case 18 -> 70;
            case 19 -> 179;
            case 20 -> 120;
            case 21 -> 183;
            case 22 -> 84;
            case 23 -> 248;
            case 24 -> 69;
            case 25 -> 116;
            case 26 -> 148;
            case 27 -> 122;
            case 28 -> 109;
            case 29 -> 25;
            case 30 -> 98;
            case 31 -> 247;
            case 32 -> 219;
            case 33 -> 197;
            case 34 -> 198;
            case 35 -> 100;
            case 36 -> 104;
            case 37 -> 205;
            case 38 -> 60;
            case 39 -> 0;
            case 40 -> 221;
            case 41 -> 246;
            case 42 -> 186;
            case 43 -> 17;
            case 44 -> 208;
            case 45 -> 38;
            case 46 -> 134;
            case 47 -> 145;
            case 48 -> 234;
            case 49 -> 213;
            case 50 -> 123;
            case 51 -> 184;
            case 52 -> 242;
            case 53 -> 158;
            case 54 -> 165;
            case 55 -> 22;
            case 56 -> 124;
            case 57 -> 195;
            case 58 -> 111;
            case 59 -> 87;
            case 60 -> 99;
            case 61 -> 61;
            case 62 -> 220;
            case 63 -> 83;
            case 64 -> 102;
            case 65 -> 41;
            case 66 -> 180;
            case 67 -> 190;
            case 68 -> 202;
            case 69 -> 117;
            case 70 -> 56;
            case 71 -> 73;
            case 72 -> 203;
            case 73 -> 3;
            case 74 -> 227;
            case 75 -> 6;
            case 76 -> 106;
            case 77 -> 130;
            case 78 -> 5;
            case 79 -> 51;
            case 80 -> 76;
            case 81 -> 114;
            case 82 -> 64;
            case 83 -> 151;
            case 84 -> 166;
            case 85 -> 2;
            case 86 -> 14;
            case 87 -> 212;
            case 88 -> 144;
            case 89 -> 13;
            case 90 -> 128;
            case 91 -> 189;
            case 92 -> 136;
            case 93 -> 78;
            case 94 -> 132;
            case 95 -> 119;
            case 96 -> 77;
            case 97 -> 192;
            case 98 -> 138;
            case 99 -> 40;
            case 100 -> 140;
            case 101 -> 53;
            case 102 -> 28;
            case 103 -> 59;
            case 104 -> 90;
            case 105 -> 207;
            case 106 -> 1;
            case 107 -> 58;
            case 108 -> 75;
            case 109 -> 27;
            case 110 -> 162;
            case 111 -> 214;
            case 112 -> 254;
            case 113 -> 52;
            case 114 -> 152;
            case 115 -> 89;
            case 116 -> 42;
            case 117 -> 113;
            case 118 -> 63;
            case 119 -> 15;
            case 120 -> 161;
            case 121 -> 211;
            case 122 -> 176;
            case 123 -> 187;
            case 124 -> 188;
            case 125 -> 231;
            case 126 -> 173;
            case 127 -> 29;
            case 128 -> 141;
            case 129 -> 222;
            case 130 -> 129;
            case 131 -> 153;
            case 132 -> 178;
            case 133 -> 21;
            case 134 -> 74;
            case 135 -> 65;
            case 136 -> 135;
            case 137 -> 16;
            case 138 -> 9;
            case 139 -> 236;
            case 140 -> 33;
            case 141 -> 4;
            case 142 -> 97;
            case 143 -> 103;
            case 144 -> 35;
            case 145 -> 177;
            case 146 -> 223;
            case 147 -> 240;
            case 148 -> 133;
            case 149 -> 181;
            case 150 -> 127;
            case 151 -> 218;
            case 152 -> 48;
            case 153 -> 80;
            case 154 -> 12;
            case 155 -> 131;
            case 156 -> 233;
            case 157 -> 18;
            case 158 -> 19;
            case 159 -> 95;
            case 160 -> 101;
            case 161 -> 245;
            case 162 -> 49;
            case 163 -> 147;
            case 164 -> 37;
            case 165 -> 169;
            case 166 -> 125;
            case 167 -> 156;
            case 168 -> 46;
            case 169 -> 217;
            case 170 -> 160;
            case 171 -> 143;
            case 172 -> 255;
            case 173 -> 44;
            case 174 -> 253;
            case 175 -> 206;
            case 176 -> 39;
            case 177 -> 196;
            case 178 -> 244;
            case 179 -> 174;
            case 180 -> 139;
            case 181 -> 93;
            case 182 -> 210;
            case 183 -> 243;
            case 184 -> 79;
            case 185 -> 54;
            case 186 -> 91;
            case 187 -> 72;
            case 188 -> 224;
            case 189 -> 175;
            case 190 -> 171;
            case 191 -> 31;
            case 192 -> 7;
            case 193 -> 82;
            case 194 -> 126;
            case 195 -> 68;
            case 196 -> 226;
            case 197 -> 163;
            case 198 -> 249;
            case 199 -> 10;
            case 200 -> 86;
            case 201 -> 200;
            case 202 -> 108;
            case 203 -> 142;
            case 204 -> 137;
            case 205 -> 71;
            case 206 -> 115;
            case 207 -> 96;
            case 208 -> 235;
            case 209 -> 209;
            case 210 -> 23;
            case 211 -> 185;
            case 212 -> 57;
            case 213 -> 194;
            case 214 -> 170;
            case 215 -> 26;
            case 216 -> 252;
            case 217 -> 94;
            case 218 -> 81;
            case 219 -> 88;
            case 220 -> 228;
            case 221 -> 164;
            case 222 -> 24;
            case 223 -> 34;
            case 224 -> 168;
            case 225 -> 230;
            case 226 -> 121;
            case 227 -> 36;
            case 228 -> 237;
            case 229 -> 201;
            case 230 -> 149;
            case 231 -> 182;
            case 232 -> 45;
            case 233 -> 193;
            case 234 -> 250;
            case 235 -> 157;
            case 236 -> 66;
            case 237 -> 105;
            case 238 -> 8;
            case 239 -> 47;
            case 240 -> 155;
            case 241 -> 241;
            case 242 -> 67;
            case 243 -> 62;
            case 244 -> 225;
            case 245 -> 107;
            case 246 -> 11;
            case 247 -> 251;
            case 248 -> 239;
            case 249 -> 215;
            case 250 -> 20;
            case 251 -> 85;
            case 252 -> 43;
            case 253 -> 216;
            case 254 -> 150;
            default -> 146;
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

         h[var2] = new String(var3).intern();
      }

      return h[var2];
   }

   // PX-FIX S2a: hand-written synthetic/bridge accessors (descriptor-exact, flags differ)
   // S2a row 0 [bridge_iface_default_delegate]
   public int a(float arg0) { return me.octo.client.lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.super.a(arg0); }
   // S2a row 1 [bridge_iface_default_delegate]
   public int a(float arg0, int arg1) { return me.octo.client.lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.super.a(arg0, arg1); }
   // S2a row 2 [bridge_iface_default_delegate]
   public me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl[] a(me.octo.client.IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll arg0) { return me.octo.client.IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.super.a(arg0); }
   // S2a row 3 [bridge_iface_default_delegate]
   public float a() { return me.octo.client.IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.super.a(); }
   // S2a row 4 [bridge_iface_default_delegate]
   public int a(me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll arg0) { return me.octo.client.IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.super.a(arg0); }
   // S2a row 5 [bridge_iface_default_delegate]
   public void a(char arg0, int arg1) { me.octo.client.IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.super.a(arg0, arg1); }
   // S2a row 6 [bridge_iface_default_delegate]
   public int b(me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll arg0) { return me.octo.client.IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.super.b(arg0); }
   // S2a row 7 [bridge_iface_default_delegate]
   public me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl[] b(me.octo.client.IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll arg0) { return me.octo.client.IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.super.b(arg0); }
   // S2a row 8 [bridge_iface_default_delegate]
   public int b() { return me.octo.client.IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.super.b(); }
   // S2a row 9 [bridge_iface_default_delegate]
   public int c(me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll arg0) { return me.octo.client.IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.super.c(arg0); }
   // S2a row 10 [bridge_iface_default_delegate]
   public void d() { me.octo.client.IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.super.d(); }
   // S2a row 11 [bridge_iface_default_delegate]
   public me.octo.client.lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll g() { return me.octo.client.lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.super.g(); }
   // S2a row 12 [static_bridge_single_other]
   public static final void h(me.octo.client.IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll arg0) { lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = arg0; }
   // S2a row 13 [static_bridge_single_other]
   public static final void i(me.octo.client.IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll arg0) { arg0.p(); }
   // S2a row 14 [bridge_iface_default_delegate]
   public int n() { return me.octo.client.IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.super.n(); }

   // PX-FIX R2 class-level backfill: jar members missing from source (descriptors/fields verified against jar)
   public static final void a(me.octo.client.IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll arg0, long arg1) { arg0.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = arg1; }
   public static final void a(me.octo.client.IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll arg0, java.lang.String arg1) { arg0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = arg1; }
   public static final void a(me.octo.client.IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll arg0, boolean arg1) { arg0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = arg1; }
   public boolean a(net.minecraft.client.gui.GuiGraphicsExtractor arg0, int arg1, int arg2, float arg3, float arg4, float arg5, float arg6) { return me.octo.client.IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.super.a(arg0, arg1, arg2, arg3, arg4, arg5, arg6); }
   public boolean a(net.minecraft.client.gui.GuiGraphicsExtractor arg0, int arg1, int arg2, int arg3, int arg4, float arg5) { return me.octo.client.IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.super.a(arg0, arg1, arg2, arg3, arg4, arg5); }
   public me.octo.client.lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll a(net.minecraft.client.gui.GuiGraphicsExtractor arg0, me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl[] arg1, me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll arg2, int arg3, int arg4, int arg5) { return me.octo.client.IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.super.a(arg0, arg1, arg2, arg3, arg4, arg5); }
   public me.octo.client.lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll a(net.minecraft.client.gui.GuiGraphicsExtractor arg0, me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl[] arg1, me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll arg2, int arg3, int arg4, int arg5, float arg6) { return me.octo.client.IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.super.a(arg0, arg1, arg2, arg3, arg4, arg5, arg6); }
   public static final void b(me.octo.client.IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll arg0, boolean arg1) { arg0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = arg1; }
   public boolean b(net.minecraft.client.gui.GuiGraphicsExtractor arg0, int arg1, int arg2, int arg3, int arg4, float arg5) { return me.octo.client.IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.super.b(arg0, arg1, arg2, arg3, arg4, arg5); }
   public static final me.octo.client.IIlIlllllllIIIIlllIIlIIllIllIIlIIIlIIllIIlllIIIllIlIIlIIllIlIIIIlIlllIIllllIlIllIllIl j(me.octo.client.IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll arg0) { return arg0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl; }
   public static final me.octo.client.lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII k(me.octo.client.IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll arg0) { return arg0.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll; }
   public static final me.octo.client.IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll w() { return lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll; }

   public final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI implements me.octo.client.llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl {
      final float IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      final float lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      final float IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      final float lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      final float IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static String b;

      static {
         char[] var0 = "CSC%{*2".toCharArray();
         for (int var1 = 0; var1 < var0.length; var1++) {
            var0[var1] = (char)(var0[var1] ^ 120 ^ switch (var1 % 7) {
               case 0 -> 75;
               case 1 -> 89;
               case 2 -> 94;
               case 3 -> 46;
               case 4 -> 102;
               case 5 -> 38;
               default -> 112;
            });
         }
         b = new String(var0).intern();
      }

      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(float var1, float var2, float var3, float var4, float var5) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
      }

      public void e() {
         IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.i(IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.this);
         me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var1 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         float var2 = var1.a(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, 30.0F, this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) + 6.0F;
         me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(var1, b + IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.j(IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.this).Z(), this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.ah().a(140), var2, 0L, 32, (Object)null);
      }

      public void a(char var1, int var2) {
         me.octo.client.llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl.super.a(var1, var2);
      }

      public void d() {
         me.octo.client.llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl.super.d();
      }

      public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
         return me.octo.client.llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl.super.a(var1, var2, var3, var4, var5, var6);
      }
   }
   public static final class PXEvMid implements me.octo.client.llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl {
      // PX-FIX RBPORT row24: members of jar IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI (anonymous inner class of IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll) ported here;
      // the PX-FIX varargs/marker ctors below stay (callers depend on them).
      final me.octo.client.IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll this$0;
      final float IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      final float lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      final float IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      final float lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      final float IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static java.lang.String b;

      public PXEvMid(me.octo.client.IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll var1, float var2, float var3, float var4, float var5, float var6) {
         this.this$0 = var1;
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var2;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var3;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var4;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var5;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var6;
      }

      public void e() {
         me.octo.client.IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.i(this.this$0);
         float var1 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, 30.0F, this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) + 6.0F;
         me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
            me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            b + me.octo.client.IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.j(this.this$0).Z(),
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
            me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.ah().a(140),
            var1,
            0L,
            32,
            (Object) null
         );
      }

      public void a(char var1, int var2) {
         me.octo.client.llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl.super.a(var1, var2);
      }

      public void d() {
         me.octo.client.llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl.super.d();
      }

      public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
         return me.octo.client.llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl.super.a(var1, var2, var3, var4, var5, var6);
      }

      static {
      pxClinit: { // PX-FIX RBPORT row <clinit>: jar string decrypt; constants copied from the
         // bytecode (cipher 'CSC%{*2', key 120, xor keys [75, 89, 94, 46, 102, 38, 112]) - verified b == "preset:".
         char[] var10003 = "CSC%{*2".toCharArray();
         int var10004 = var10003.length;
         int var0 = 0;
         byte var6 = (byte)120;
         char[] var10002 = var10003;
         int var1 = var10004;
         byte var10 = (byte)120;
         char[] var10005 = var10003;
         int var10006 = var0;
         if (var10004 <= 1) {
            var10005 = var10003;
            var10 = (byte)120;
            var10006 = var0;
         } else {
            var6 = (byte)120;
            var1 = var10004;
            if (var10004 <= var0) {
               String var9 = new String(var10003).intern();
               b = var9;
               break pxClinit;
            }
            var10005 = var10003;
            var10 = (byte)120;
            var10006 = var0;
         }
         while (true) {
            var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
               case 0 -> 75;
               case 1 -> 89;
               case 2 -> 94;
               case 3 -> 46;
               case 4 -> 102;
               case 5 -> 38;
               default -> 112;
            });
            var0++;
            if (var6 == 0) {
               var10006 = var6;
               var10005 = var10002;
               var10 = var6;
            } else {
               if (var1 <= var0) {
                  String var8 = new String(var10002).intern();
                  b = var8;
                  break pxClinit;
               }
               var10005 = var10002;
               var10 = var6;
               var10006 = var0;
            }
         }
      }
      }

        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public PXEvMid(Object... px) {
         // PX-FIX RBPORT row24: this pre-existing PX-FIX ctor must keep the final ported
         // fields definitely assigned; its call sites never read them.
         this.this$0 = null;
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 0.0F;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = 0.0F;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 0.0F;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 0.0F;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 0.0F;
        }
      public PXEvMid(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private PXEvMid() {
         // PX-FIX RBPORT row24: this pre-existing PX-FIX ctor must keep the final ported
         // fields definitely assigned; its call sites never read them.
         this.this$0 = null;
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 0.0F;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = 0.0F;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 0.0F;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 0.0F;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 0.0F;
      }

      @Nullable
      public final IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll a() {
         return IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      }

      public final void b() {
         String[] var1 = IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.x();
         if (var1 != null) {
            IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll var10000 = IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
            if (var10000 != null) {
               IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll var2 = var10000;
               boolean var3 = false;
               var10000 = var2;
               if (var1 != null) {
                  if (var2.j()) {
                     var2.i();
                  }

                  var10000 = var2;
               }

               var10000.s();
            }
         }

         IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = null;
      }

      private static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
         private boolean IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         private long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         private float IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;

         public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(boolean var1, long var2, float var4) {
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var4;
         }

         public final boolean a() {
            return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         }

         public final void a(boolean var1) {
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         }

         public final long b() {
            return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         public final void a(long var1) {
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
         }

         public final float c() {
            return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         public final void a(float var1) {
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
         }
      }
   }
}
