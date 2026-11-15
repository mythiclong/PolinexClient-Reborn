package me.octo.client;

import com.mojang.blaze3d.platform.Window;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import me.octo.client.utils.player.IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.glfw.GLFW;

public final class IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll {
   @NotNull
   public static IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.PXEvMid IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private Set<llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new LinkedHashSet<>();
   @NotNull
   private IntRange IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new IntRange(0, 500);
   @NotNull
   private String lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private String IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private boolean IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private float IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private final HashMap<String, Float> lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private final HashMap<String, Float> IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private final HashMap<String, Long> llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private float lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private float lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private final float lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private float lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private final float IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private float llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private float IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @Nullable
   private static IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static float IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static float IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private static me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private static String[] a;
   private static String[] b;

   public IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll() {
      short var10001 = 18865;
      short var10002 = 13561;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = "all";
      var10001 = 18842;
      var10002 = 19539;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = "newest";
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 100.0F;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new HashMap<>();
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new HashMap<>();
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new HashMap<>();
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 40.0F;
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 20.0F;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 11.0F;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 16.0F;
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 16.0F;
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 8.0F;
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 6.0F;
   }

   @NotNull
   public final Set<llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll> a() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final void a(@NotNull Set<llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll> var1) {
      short var10001 = 18873;
      short var10002 = 19003;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
   }

   @NotNull
   public final IntRange b() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final void a(@NotNull IntRange var1) {
      short var10001 = 18873;
      short var10002 = 19003;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
   }

   @NotNull
   public final String c() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   public final void a(@NotNull String var1) {
      short var10001 = 18872;
      short var10002 = -27112;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var1;
   }

   @NotNull
   public final String d() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   public final void b(@NotNull String var1) {
      short var10001 = 18873;
      short var10002 = 19003;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
   }

   private final float a(String var1, boolean var2, float var3) {
      Long var16 = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var4;
      long var5;
      float var14;
      label53: {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = i();
         var5 = System.nanoTime();
         var4 = var10000;
         if (var4 != null) {
            Float var13 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.get(var1);
            if (var13 != null) {
               var14 = var13;
               break label53;
            }
         }

         var14 = var2 ? 1.0F : 0.0F;
      }

      float var7;
      label47: {
         var7 = var14;
         if (var4 != null) {
            Long var15 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.get(var1);
            if (var15 != null) {
               var16 = var15;
               break label47;
            }
         }

         var16 = var5;
      }

      long var8 = var16;
      float var10 = RangesKt.coerceIn((float)(var5 - var8) / 1.0E9F, 0.0F, 0.1F);
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.put(var1, var5);
      float var11 = var2 ? 1.0F : 0.0F;
      float var19;
      int var17 = (var19 = var7 - var11) == 0.0F ? 0 : (var19 < 0.0F ? -1 : 1);
      if (var4 != null) {
         var17 = (((var17 == 0) ? 1 : 0));
      }

      if ((var17 == 0)) {
         float var12 = 1.0F - (float)Math.exp(-var3 * var10);
         var7 += (var11 - var7) * var12;
         var14 = Math.abs(var7 - var11);
         if (var4 == null) {
            return var14;
         }

         if (var14 < 0.001F) {
            var7 = var11;
         }
      }

      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.put(var1, var7);
      return var7;
   }

   private final float e() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = i();
      if (var1 != null && IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl != null) {
         IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var2;
         float var9;
         label40: {
            var2 = IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
            long var3 = System.currentTimeMillis();
            float var5 = (float)(var3 - var2.b());
            float var6 = RangesKt.coerceIn(var5 / 300.0F, 0.0F, 1.0F);
            float var7 = var2.a()
               ? IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .D(var6)
               : IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .v(var6);
            IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var10000 = var2;
            if (var1 != null) {
               if (var2.a()) {
                  var9 = var2.c() + (1.0F - var2.c()) * var7;
                  break label40;
               }

               var10000 = var2;
            }

            var9 = var10000.c() - var2.c() * var7;
         }

         float var8 = var9;
         int var10 = ((var2.a()) ? 1 : 0);
         if (var1 != null) {
            if (var10 != 0) {
               return var8;
            }

            if (var1 == null) {
               return var8;
            }

            float var12;
            var10 = (var12 = var8 - 0.001F) == 0.0F ? 0 : (var12 < 0.0F ? -1 : 1);
         }

         if (var10 <= 0) {
            IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = null;
            return 0.0F;
         } else {
            return var8;
         }
      } else {
         return 0.0F;
      }
   }

   public final void f() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1;
      long var2;
      IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var4;
      label24: {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = i();
         var2 = System.currentTimeMillis();
         var1 = var10000;
         var4 = IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
         IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var6 = var4;
         if (var1 != null) {
            if (var4 != null) {
               break label24;
            }

            var6 = new IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
               true, var2, 0.0F
            );
         }

         IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var6;
         if (var1 != null) {
            return;
         }
      }

      float var5 = this.e();
      boolean var10001 = var4.a();
      if (var1 != null) {
         var10001 = !var10001;
      }

      var4.a(var10001);
      var4.a(var2);
      var4.a(var5);
   }

   @Nullable
   public final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII a(
      @NotNull GuiGraphicsExtractor var1, float var2, float var3, float var4, float var5, int var6, int var7, float var8
   ) {
      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var34 = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var9;
      float var10;
      float var12;
      float var13;
      float var14;
      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var15;
      int var30;
      label118: {
         label121: {
            short var10001 = 18825;
            short var10002 = 6651;
            Intrinsics.checkNotNullParameter(var1, "context");
            me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = i();
            var10 = this.e();
            var9 = var10000;
            int var11 = (int)Math.ceil(llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d().size() / 3.0);
            var12 = var11
                  * (
                     this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                        + this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                  )
               + 3.0F;
            var13 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
               + var12
               + this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
               + 70.0F
               + this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
               + 32.0F
               + 5.0F;
            var14 = 40.0F + var13 * var10;
            var15 = null;
            float var45;
            var30 = (var45 = var6 - var2) == 0.0F ? 0 : (var45 < 0.0F ? -1 : 1);
            if (var9 != null) {
               if (var30 < 0) {
                  break label121;
               }

               float var46;
               var30 = (var46 = var6 - (var2 + var4)) == 0.0F ? 0 : (var46 < 0.0F ? -1 : 1);
            }

            if (var9 != null) {
               if (var30 > 0) {
                  break label121;
               }

               float var47;
               var30 = (var47 = var7 - var3) == 0.0F ? 0 : (var47 < 0.0F ? -1 : 1);
            }

            if (var9 != null) {
               if (var30 < 0) {
                  break label121;
               }

               float var48;
               var30 = (var48 = var7 - (var3 + 40.0F)) == 0.0F ? 0 : (var48 < 0.0F ? -1 : 1);
            }

            if (var9 == null) {
               break label118;
            }

            if (var30 <= 0) {
               var30 = 1;
               break label118;
            }
         }

         var30 = 0;
      }

      int var16 = var30;
      short var37 = 18827;
      short var42 = 15566;
      float var17 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         "filterpanel:header",
         (var16 != 0),
         0.0F,
         4,
         null
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var2,
         var3,
         var4,
         var14,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .j()
            .a(0.42F + var17 * 0.08F),
         6.0F
      );
      float var31 = var17;
      float var38 = 0.01F;
      if (var9 != null) {
         if (var17 > 0.01F) {
            me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
               me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               var2,
               var3,
               var4,
               var14,
               6.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ah(),
               var17 * 0.35F,
               3.0F);
         }

         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var2,
            var3,
            var4,
            var14,
            1.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .y()
               .a(0.3F + var17 * 0.25F),
            6.0F
         );
         var31 = var2;
         var38 = 16.0F;
      }

      label126: {
         float var18 = var31 + var38;
         float var19 = var3 + 12.0F;
         var37 = 18833;
         var42 = -29436;
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(
               "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n            <polygon points=\"22,3 2,3 10,12.46 10,19 14,21 14,12.46 22,3\"/>\n        </svg>\n    ",
               var18,
               var19,
               16.0F,
               var17 > 0.01F
                  ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a()
                  : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a()
                     .a(0.9F),
               var8
            );
         var37 = 18835;
         var42 = -1578;
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
            me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
            "Filters",
            var18 + 20.0F,
            var19 - 1.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(),
            false);
         float var20 = var2 + var4 - 30.0F;
         float var21 = var3 + 20.0F;
         float var22 = var10 * 180.0F;
         me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var23 = var17 > 0.01F
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .F()
               .a(
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .ah(),
                  var17
               )
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .F();
         me.octo.client.utils.IIlIlllllIIlIllllIlIlIIIllIlIIlIlllIIllIIIIIlIIIIlIIIIlIlIlIlIllIlllllIIIllIIlllllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .d(var1, var20 + 6, var21, 16.0F, 8.0F, var22, var23, 2.0F);
         float var32 = var10;
         float var41 = 0.01F;
         if (var9 != null) {
            if (!(var10 > 0.01F)) {
               break label126;
            }

            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(var2, var3 + 40.0F, var4, var13 * var10);
            var32 = var3 + 40.0F;
            var41 = 20.0F;
         }

         float var24;
         label88: {
            var24 = var32 + var41;
            IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var25 = this.a(var2, var24, var4, var6, var7, var8, var10);
            IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var33 = var25;
            if (var9 != null) {
               if (var25 == null) {
                  break label88;
               }

               var33 = var25;
            }

            var15 = var33;
         }

         var24 += this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl + var12;
         IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var26 = this.d(var2, var24, var4, var6, var7, var8, var10);
         var34 = var26;
         label81:
         if (var9 != null) {
            if (var26 != null) {
               var34 = var15;
               if (var9 == null) {
                  break label81;
               }

               if (var15 == null) {
                  var15 = var26;
               }
            }

            var24 += this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl + 70.0F;
            var34 = this.g(var2, var24, var4, var6, var7, var8, var10);
         }

         label124: {
            IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var27 = var34;
            IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var35 = var27;
            if (var9 != null) {
               if (var27 == null) {
                  break label124;
               }

               var35 = var15;
            }

            if (var9 != null) {
               if (var35 != null) {
                  break label124;
               }

               var35 = var27;
            }

            var15 = var35;
         }

         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .i();
      }

      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var36 = var15;
      if (var9 != null) {
         if (var15 == null && var16 != 0) {
            var15 = new IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII() {
               @Override
               public void e() {
                  IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.this.f();
               }

               @Override
               public void a(char var1, int var2x) {
               }

               @Override
               public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
                  return IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.a(var1, var2, var3, var4, var5, var6);
               }

               @Override
               public void d() {
                  IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.d();
               }
            };
         }

         var36 = var15;
      }

      return var36;
   }

   public final float g() {
      float var1 = this.e();
      int var2 = (int)Math.ceil(llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d().size() / 3.0);
      float var3 = var2
            * (
               this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                  + this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
            )
         + 3.0F;
      float var4 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
         + var3
         + this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
         + 70.0F
         + this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
         + 32.0F
         + 5.0F;
      return 40.0F + var4 * var1;
   }

   private final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII a(
      float var1, float var2, float var3, int var4, int var5, float var6, float var7
   ) {
      Object var58 = null; // PX-FIX
      Object var57 = null; // PX-FIX
      Object var55 = null; // PX-FIX
      Object var54 = null; // PX-FIX
      Object var49 = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var8 = i();
      if (var8 != null) {
         if (var7 < 0.3F) {
            return null;
         }

         float var10000 = 0.0F;
      }

      float var9 = var2;
      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var10 = null;
      float var11 = (var3 - 32.0F) / 3.0F;
      Iterable var12 = (Iterable)llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      boolean var13 = false;
      int var14 = 0;

      for (Object var16 : var12) {
         int var17 = var14++;
         if (var8 != null) {
            int var43 = var17;
            if (var8 != null) {
               if (var17 < 0) {
                  CollectionsKt.throwIndexOverflow();
               }

               var43 = var17;
            }

            final llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var18;
            float var23;
            float var24;
            byte var25;
            float var26;
            label142: {
               label152: {
                  var18 = (llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll)var16;
                  int var19 = var43;
                  boolean var20 = false;
                  int var21 = var19 % 3;
                  int var22 = var19 / 3;
                  var23 = var1 + 16.0F + var21 * var11;
                  var24 = var9
                     + var22
                        * (
                           this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                              + this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                        );
                  var25 = ((byte)((this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.contains(var18)) ? 1 : 0));
                  var26 = var11 - 8.0F;
                  float var61;
                  var43 = (var61 = var4 - var23) == 0.0F ? 0 : (var61 < 0.0F ? -1 : 1);
                  if (var8 != null) {
                     if (var43 < 0) {
                        break label152;
                     }

                     float var62;
                     var43 = (var62 = var4 - (var23 + var26)) == 0.0F ? 0 : (var62 < 0.0F ? -1 : 1);
                  }

                  if (var8 != null) {
                     if (var43 > 0) {
                        break label152;
                     }

                     float var63;
                     var43 = (var63 = var5 - var24) == 0.0F ? 0 : (var63 < 0.0F ? -1 : 1);
                  }

                  if (var8 != null) {
                     if (var43 < 0) {
                        break label152;
                     }

                     float var64;
                     var43 = (var64 = var5 - (var24 + this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI)) == 0.0F
                        ? 0
                        : (var64 < 0.0F ? -1 : 1);
                  }

                  if (var8 == null) {
                     break label142;
                  }

                  if (var43 <= 0) {
                     var43 = 1;
                     break label142;
                  }
               }

               var43 = 0;
            }

            int var27 = var43;
            me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var45 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            String var10001 = var18.name();
            short var10002 = 18821;
            short var10003 = -4969;
            float var28 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(var45, "filter:type:" + var10001, (var27 != 0), 0.0F, 4, null
            );
            float var46 = var28;
            if (var8 != null) {
               if (var28 > 0.01F) {
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                     var23 - 4.0F,
                     var24 - 2.0F,
                     var26 + 8.0F,
                     this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI + 4.0F,
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .ah()
                        .a(RangesKt.coerceIn((int)(var28 * 28.0F), 0, 255)),
                     4.0F
                  );
               }

               var46 = var23;
            }

            float var29 = var46;
            float var30 = var24
               + (
                     this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                        - this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
                  )
                  / 2.0F;
            var10001 = var18.name();
            var10002 = 18879;
            var10003 = -30207;
            float var31 = this.a("filter:check:" + var10001, (var25 != 0), 24.0F);
            if (var31 > 0.05F) {
               me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
                  me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                  var29,
                  var30,
                  this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll,
                  this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll,
                  4.0F,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .ah(),
                  var31 * 0.4F,
                  2.0F);
            }

            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var60;
            label118: {
               label117: {
                  me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var32 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .q()
                     .a(
                        IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .r(),
                        var31
                     );
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                     var29,
                     var30,
                     this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll,
                     this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll,
                     var32,
                     4.0F
                  );
                  var54 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
                  var57 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
                  int var10005 = var27;
                  if (var8 != null) {
                     if (var27 != 0) {
                        break label117;
                     }

                     var10005 = var25;
                  }

                  if (var10005 == 0) {
                     var60 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .u()
                        .a(0.7F);
                     break label118;
                  }
               }

               var60 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .u();
            }

            label153: {
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                  var29, var30, var54, var57, 1.0F, var60, 4.0F
               );
               float var47 = var31;
               if (var8 != null) {
                  if (!(var31 > 0.02F)) {
                     break label153;
                  }

                  var47 = IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.m(var31);
               }

               float var33 = var47;
               float var34 = var29 + 4.0F;
               float var35 = var30 + 8.0F;
               float var36 = var29 + 7.0F;
               float var37 = var30 + 11.0F;
               float var38 = var29 + 12.0F;
               float var39 = var30 + 5.0F;
               float var40 = RangesKt.coerceIn(var33 / 0.4F, 0.0F, 1.0F);
               float var41 = RangesKt.coerceIn((var33 - 0.4F) / 0.6F, 0.0F, 1.0F);
               float var65;
               var43 = (var65 = var40 - 0.0F) == 0.0F ? 0 : (var65 < 0.0F ? -1 : 1);
               if (var8 != null) {
                  if (var43 > 0) {
                     me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(
                           var34,
                           var35,
                           var34 + (var36 - var34) * var40,
                           var35 + (var37 - var35) * var40,
                           2.0F,
                           me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                        );
                  }

                  float var66;
                  var43 = (var66 = var41 - 0.0F) == 0.0F ? 0 : (var66 < 0.0F ? -1 : 1);
               }

               if (var43 > 0) {
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(
                        var36,
                        var37,
                        var36 + (var38 - var36) * var41,
                        var37 + (var39 - var37) * var41,
                        2.0F,
                        me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                     );
               }
            }

            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var59;
            label103: {
               label102: {
                  var55 = var29 + this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll + 12.0F;
                  var58 = var24 + 2.0F;
                  int var10004 = var27;
                  if (var8 != null) {
                     if (var27 != 0) {
                        break label102;
                     }

                     var10004 = var25;
                  }

                  if (var10004 == 0) {
                     var59 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a()
                        .a(0.85F);
                     break label103;
                  }
               }

               var59 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a();
            }

            me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
               .b(var18.a(), var55, var58, var59, false);
            label86:
            if (var8 != null && var27 != 0) {
               IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var50 = var10;
               if (var8 != null) {
                  if (var10 != null) {
                     break label86;
                  }

                  var50 = new IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII() {
                     @Override
                     public void e() {
                        me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1x = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
                        Set var10000 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.this.a();
                        llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var10001x = var18;
                        if (var1x != null) {
                           if (var10000.contains(var18)) {
                              IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.this.a().remove(var18);
                              return;
                           }

                           var10000 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.this.a();
                           var10001x = var18;
                        }

                        var10000.add(var10001x);
                     }

                     @Override
                     public void a(char var1, int var2x) {
                     }

                     @Override
                     public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
                        return IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.a(var1, var2, var3, var4, var5, var6);
                     }

                     @Override
                     public void d() {
                        IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.d();
                     }
                  };
               }

               var10 = var50;
            }

            if (var8 != null) {
               continue;
            }
         }
         break;
      }

      return var10;
   }

   private final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII b(
      float var1, float var2, float var3, int var4, int var5, float var6, float var7
   ) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var8 = i();
      float var10000 = var7;
      if (var8 != null) {
         if (var7 < 0.3F) {
            return null;
         }

         var10000 = var2;
      }

      float var9 = var10000;
      int var10001 = 18847;
      short var10002 = 24889;
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
         "Max Waypoints",
         var1 + 16.0F,
         var9 + 1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         false);
      var9 += 26.0F;
      float var10 = var1 + 16.0F;
      float var11 = var9 + 8.0F;
      float var12 = var3 - 32.0F;
      float var13 = 4.0F;
      short var10010 = 18826;
      short var10011 = -14853;
      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var14 = this.a(
         var10,
         var11,
         var12,
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         0.0F,
         100.0F,
         var4,
         var5,
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
         "filter:maxwp:full",
         null
      );
      var9 += 28.0F;
      var10002 = 18817;
      short var10003 = -11221;
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.b(
         String.valueOf(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.getFirst()) + " points",
         var10,
         var9,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a()
            .a(0.6F),
         false);
      var10002 = 18818;
      var10003 = 9687;
      String var21 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.getLast() + " points";
      double var24 = var10 + var12;
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.b(
         var21,
         var24
            - me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.a(
               var21, false),
         var9,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a()
            .a(0.6F),
         false);
      return var14;
   }

   private final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII c(
      float var1, float var2, float var3, int var4, int var5, float var6, float var7
   ) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var8 = i();
      if (var8 != null) {
         if (var7 < 0.3F) {
            return null;
         }

         float var10000 = 0.0F;
      }

      short var10001 = 18824;
      short var10002 = -32583;
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
         "Etherwarp Waypoints",
         var1 + 16.0F,
         var2 + 1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         false);
      float var9 = var2 + 28.0F;
      Pair[] var11 = new Pair[3];
      var10002 = 18865;
      short var10003 = 13561;
      var10003 = 18838;
      short var10004 = -7570;
      var11[0] = TuplesKt.to("all", "All");
      var10002 = 18820;
      var10003 = 30272;
      var10003 = 18878;
      var10004 = -30987;
      var11[1] = TuplesKt.to("yes", "Yes");
      var10002 = 18840;
      var10003 = -29953;
      var10003 = 18845;
      var10004 = -19849;
      var11[2] = TuplesKt.to("no", "No");
      List var10 = CollectionsKt.listOf(var11);
      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var33 = null;
      float var12 = 0.0F;
      var12 = var1 + 16.0F;
      Iterable var13 = var10;
      boolean var14 = false;
      int var15 = 0;

      for (Object var17 : var13) {
         int var18 = var15++;
         if (var8 != null) {
            if (var8 != null && var18 < 0) {
               CollectionsKt.throwIndexOverflow();
            }

            final String var22;
            String var23;
            boolean var24;
            float var26;
            float var28;
            int var36;
            label96: {
               label106: {
                  Pair var19 = (Pair)var17;
                  boolean var21 = false;
                  var22 = (String)var19.component1();
                  var23 = (String)var19.component2();
                  var24 = Intrinsics.areEqual(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, var22);
                  var26 = var9
                     + (
                           this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                              - this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
                        )
                        / 2.0F;
                  float var27 = (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.a(var23, false);
                  var28 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl + 8.0F + var27;
                  float var53;
                  var36 = (var53 = var4 - var12) == 0.0F ? 0 : (var53 < 0.0F ? -1 : 1);
                  if (var8 != null) {
                     if (var36 < 0) {
                        break label106;
                     }

                     float var54;
                     var36 = (var54 = var4 - (var12 + var28)) == 0.0F ? 0 : (var54 < 0.0F ? -1 : 1);
                  }

                  if (var8 != null) {
                     if (var36 > 0) {
                        break label106;
                     }

                     float var55;
                     var36 = (var55 = var5 - var9) == 0.0F ? 0 : (var55 < 0.0F ? -1 : 1);
                  }

                  if (var8 != null) {
                     if (var36 < 0) {
                        break label106;
                     }

                     float var56;
                     var36 = (var56 = var5 - (var9 + this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI)) == 0.0F
                        ? 0
                        : (var56 < 0.0F ? -1 : 1);
                  }

                  if (var8 == null) {
                     break label96;
                  }

                  if (var36 <= 0) {
                     var36 = 1;
                     break label96;
                  }
               }

               var36 = 0;
            }

            label107: {
               int var29 = var36;
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                  var12 + this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl / 2.0F,
                  var26 + this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl / 2.0F,
                  this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl / 2.0F,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .q()
               );
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                  var12 + this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl / 2.0F,
                  var26 + this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl / 2.0F,
                  this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl / 2.0F - 1.0F,
                  new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(0, 0, 0, 0)
               );
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                  var12,
                  var26,
                  this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
                  this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
                  1.0F,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .u(),
                  this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl / 2.0F
               );
               var10002 = 18846;
               var10003 = -25496;
               float var30 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                  "filter:ethsel:" + var22,
                  var24,
                  0.0F);
               float var57;
               var36 = (var57 = var30 - 0.02F) == 0.0F ? 0 : (var57 < 0.0F ? -1 : 1);
               if (var8 != null) {
                  if (var36 > 0) {
                     float var31 = var12 + this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl / 2.0F;
                     float var32 = var26 + this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl / 2.0F;
                     float var38 = var30;
                     float var40 = 0.05F;
                     if (var8 != null) {
                        if (var30 > 0.05F) {
                           me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .a(
                                 var31,
                                 var32,
                                 4.5F,
                                 IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .ah(),
                                 var30 * 0.6F,
                                 6.0F
                              );
                        }

                        var38 = var31;
                        var40 = var32;
                     }

                     me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                        var38,
                        var40,
                        4.5F * var30,
                        IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .r()
                     );
                  }

                  me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, var23, var12 + this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl + 8.0F, var9 + 2.0F, IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(), false, 16, null);
                  if (var8 == null) {
                     break label107;
                  }

                  var36 = var29;
               }

               label73:
               if (var36 != 0) {
                  IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var39 = var33;
                  if (var8 != null) {
                     if (var33 != null) {
                        break label73;
                     }

                     var39 = new IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII() {
                        @Override
                        public void e() {
                           IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.this.a(var22);
                        }

                        @Override
                        public void a(char var1, int var2x) {
                        }

                        @Override
                        public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
                           return IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.a(var1, var2, var3, var4, var5, var6);
                        }

                        @Override
                        public void d() {
                           IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.d();
                        }
                     };
                  }

                  var33 = var39;
               }

               var12 += var28 + 20.0F;
            }

            if (var8 != null) {
               continue;
            }
         }
         break;
      }

      return var33;
   }

   private final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII a(
      final float var1,
      float var2,
      final float var3,
      float var4,
      final float var5,
      final float var6,
      final int var7,
      int var8,
      boolean var9,
      final String var10,
      final Function2<? super Float, ? super Boolean, Unit> var11
   ) {
      float var26 = 0; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var12;
      float var13;
      float var14;
      final float var15;
      final float var16;
      int var24;
      label108: {
         var13 = 6.0F;
         var14 = (var4 - var5) / (var6 - var5);
         var15 = var1 + var3 * var14;
         var16 = var2 + this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI / 2.0F;
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = i();
         Float var17 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.get(var10);
         var12 = var10000;
         if (var12 != null) {
            if (var17 != null) {
               float var29;
               var24 = (var29 = Math.abs(var17 - var4) - 1.0F) == 0.0F ? 0 : (var29 < 0.0F ? -1 : 1);
               if (var12 == null) {
                  break label108;
               }

               if (var24 >= 0) {
                  me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
                     me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                     var10,
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .ah()
                        .a(140),
                     4.0F,
                     0L,
                     8,
                     null
                  );
               }
            }

            this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.put(var10, var4);
         }

         float var30;
         var24 = (var30 = var7 - (var1 - 5)) == 0.0F ? 0 : (var30 < 0.0F ? -1 : 1);
      }

      label100: {
         label111: {
            if (var12 != null) {
               if (var24 < 0) {
                  break label111;
               }

               float var31;
               var24 = (var31 = var8 - (var2 - 6)) == 0.0F ? 0 : (var31 < 0.0F ? -1 : 1);
            }

            if (var12 != null) {
               if (var24 < 0) {
                  break label111;
               }

               float var32;
               var24 = (var32 = var7 - (var1 + var3 + 5)) == 0.0F ? 0 : (var32 < 0.0F ? -1 : 1);
            }

            if (var12 != null) {
               if (var24 >= 0) {
                  break label111;
               }

               float var33;
               var24 = (var33 = var8 - (var2 + this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI + 12)) == 0.0F
                  ? 0
                  : (var33 < 0.0F ? -1 : 1);
            }

            if (var12 == null) {
               break label100;
            }

            if (var24 < 0) {
               var24 = 1;
               break label100;
            }
         }

         var24 = 0;
      }

      int var18;
      label79: {
         var18 = var24;
         var24 =(( var9) ? 1 : 0);
         if (var12 != null) {
            if (!var9) {
               var26 = 1.0F;
               break label79;
            }

            var24 = var18;
         }

         var26 = var24 != 0 ? 0.6F : 0.0F;
      }

      float var19 = var26;
      final float var20 = this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl * (1.0F + var19 * 0.35F);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2 + 1.0F,
         var3,
         this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI,
         new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(0, 0, 0, 30),
         var13
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .l(),
         var13
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .m(),
         var13
      );
      float var34;
      var24 = (var34 = var14 - 0.0F) == 0.0F ? 0 : (var34 < 0.0F ? -1 : 1);
      if (var12 != null) {
         if (var24 > 0) {
            float var21 = var3 * var14;
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(
                  var1,
                  var2,
                  var21,
                  this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .n(),
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .o(),
                  me.octo.client.utils.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                  var13
               );
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var1 + 1.0F,
               var2 + 1.0F,
               var21 - 2.0F,
               this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI - 2.0F,
               1.0F,
               new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 255, 255, 40),
               var13 - 1.0F
            );
         }

         me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(var10, var1, var2, var3, this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI, var13);
         float var35;
         var24 = (var35 = var19 - 0.0F) == 0.0F ? 0 : (var35 < 0.0F ? -1 : 1);
      }

      if (var12 != null) {
         if (var24 > 0) {
            me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(
                  var15,
                  var16,
                  var20,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .ah(),
                  var19,
                  9.0F
               );
         }

         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(
               var15,
               var16,
               var20,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .k()
            );
         short var10002 = 18822;
         short var10003 = -14658;
         me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var10 + ":rip", var15, var16, var20 * 2.4F);
         var24 =(( var9) ? 1 : 0);
      }

      if (var12 != null) {
         if (var24 != 0) {
            Window var28 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .getWindow();
            label65:
            if (var12 != null) {
               if (GLFW.glfwGetMouseButton(var28.handle(), 0) == 1) {
                  float var23 = RangesKt.coerceIn(var7, var1, var1 + var3);
                  float var22 = var5 + (var23 - var1) / var3 * (var6 - var5);
                  var11.invoke(var22, true);
                  if (var12 != null) {
                     break label65;
                  }
               }

               var11.invoke(var4, false);
            }
         }

         var24 = var18;
      }

      return var24 != 0
         ? new IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII() {
            private static String b;

            @Override
            public void e() {
      Object var20 = null; // PX-FIX
      Object var16 = null; // PX-FIX
               me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(
                     var10 + b,
                     var15,
                     var16,
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .ah()
                        .a(150),
                     ((Float)var20) * 2.4F,
                     240L
                  );
               float var1x = RangesKt.coerceIn(var7, var1, var1 + var3);
               float var2x = var5 + (var1x - var1) / var3 * (var6 - var5);
               var11.invoke(var2x, true);
            }

            @Override
            public void a(char var1x, int var2x) {
            }

            // $VF: Irreducible bytecode was duplicated to produce valid code
            static {
               pxClinit: {
               char[] var10003 = "`A><".toCharArray();
               int var10004 = var10003.length;
               int var0 = 0;
               byte var6x = 25;
               char[] var10002 = var10003;
               int var1x = var10004;
               byte var10x;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var10x = 25;
                  var10006 = var0;
               } else {
                  var6x = 25;
                  var1x = var10004;
                  if (var10004 <= var0) {
                     String var9x = new String(var10003).intern();
                     byte var4x = -1;
                     b = var9x;
                     break pxClinit;
                  }

                  var10005 = var10003;
                  var10x = 25;
                  var10006 = var0;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var10x ^ switch (var0 % 7) {
                     case 0 -> 67;
                     case 1 -> 42;
                     case 2 -> 78;
                     case 3 -> 85;
                     case 4 -> 5;
                     case 5 -> 59;
                     default -> 70;
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

            @Override
            public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
               return IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.a(var1, var2, var3, var4, var5, var6);
            }

            @Override
            public void d() {
               IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.d();
            }
         }
         : null;
   }

   private final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII d(
      float var1, float var2, float var3, int var4, int var5, float var6, float var7
   ) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var8 = i();
      if (var7 < 0.3F) {
         return null;
      } else {
         IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var9;
         float var10;
         float var12;
         float var13;
         float var14;
         float var15;
         label48: {
            var9 = null;
            var10 = 8.0F;
            float var11 = var3 - 32.0F - var10 * 2;
            var12 = var11 * 0.24F;
            var13 = var11 * 0.34F;
            var14 = var11 * 0.42F;
            var15 = var1 + 16.0F;
            IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var16 = this.e(
               var1, var2, var12 + 16.0F, var4, var5, var6, var7
            );
            IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var10000 = var16;
            if (var8 != null) {
               if (var16 == null) {
                  break label48;
               }

               var10000 = var16;
            }

            var9 = var10000;
         }

         float var17;
         label52: {
            var17 = var15 + var12 + var10;
            IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var18 = this.f(var17, var2, var13, var4, var5, var6, var7);
            IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var21 = var18;
            if (var8 != null) {
               if (var18 == null) {
                  break label52;
               }

               var21 = var9;
            }

            if (var8 != null) {
               if (var21 != null) {
                  break label52;
               }

               var21 = var18;
            }

            var9 = var21;
         }

         float var19 = var17 + var13 + var10;
         IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var20 = this.a(var19, var2, var14, var4, var5);
         IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var22 = var20;
         if (var8 != null) {
            if (var20 != null) {
               if (var8 == null) {
                  return var9;
               }

               if (var9 == null) {
                  var9 = var20;
               }
            }

            var22 = var9;
         }

         return var22;
      }
   }

   private final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII a(float var1, float var2, float var3, int var4, int var5) {
      Object var52 = null; // PX-FIX
      Object var49 = null; // PX-FIX
      Object var43 = null; // PX-FIX
      Object var41 = null; // PX-FIX
      Object var36 = null; // PX-FIX
      Object var34 = null; // PX-FIX
      Object var28 = null; // PX-FIX
      Object var24 = null; // PX-FIX
      short var10001 = 18868;
      short var10002 = 6841;
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
         "Sort By",
         var1,
         var2 + 1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         false);
      float var7 = var2 + 36.0F;
      Pair[] var9 = new Pair[3];
      var10002 = 18876;
      short var10003 = 11170;
      var10003 = 18823;
      int var10004 = -27315;
      var9[0] = TuplesKt.to("newest", "Newest");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = i();
      var10003 = 18816;
      var10004 = (short)-29496;
      var10004 = (short)18867;
      int var10005 = 21655;
      var9[1] = TuplesKt.to("relevant", "Most Relevant");
      var10003 = 18870;
      var10004 = (short)-2420;
      var10004 = (short)18836;
      var10005 = (short)-19972;
      var9[2] = TuplesKt.to("downloads", "Most Downloaded");
      List<Pair> var8 = CollectionsKt.listOf(var9);
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var6 = var10000;
      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var23 = null;
      float var10 = var1;

      for (Pair var12 : var8) {
         final String var13;
         String var14;
         byte var15;
         float var17;
         label110: {
            label118: {
               var13 = (String)var12.component1();
               var14 = (String)var12.component2();
               var15 = ((byte)((Intrinsics.areEqual(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, var13)) ? 1 : 0));
               float var16 = (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.a(var14, false);
               var17 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl + 8.0F + var16;
               float var53;
               var24 = (var53 = var4 - var10) == 0.0F ? 0 : (var53 < 0.0F ? -1 : 1);
               if (var6 != null) {
                  if ((me.octo.client.PxTruth.truth(var24))) {
                     break label118;
                  }

                  float var54;
                  var24 = (var54 = var4 - (var10 + var17)) == 0.0F ? 0 : (var54 < 0.0F ? -1 : 1);
               }

               if (var6 != null) {
                  if ((me.octo.client.PxTruth.truth(var24))) {
                     break label118;
                  }

                  float var55;
                  var24 = (var55 = var5 - var7) == 0.0F ? 0 : (var55 < 0.0F ? -1 : 1);
               }

               if (var6 != null) {
                  if ((me.octo.client.PxTruth.truth(var24))) {
                     break label118;
                  }

                  float var56;
                  var24 = (var56 = var5 - (var7 + this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI)) == 0.0F
                     ? 0
                     : (var56 < 0.0F ? -1 : 1);
               }

               if (var6 == null) {
                  break label110;
               }

               if ((me.octo.client.PxTruth.truth(var24))) {
                  var24 = 1;
                  break label110;
               }
            }

            var24 = 0;
         }

         int var18 =((Integer)( var24));
         var10002 = 18877;
         var10003 = -8278;
         float var19 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            "filter:sort:" + var13,
            (var18 != 0),
            0.0F,
            4,
            null
         );
         float var25 = var19;
         float var29 = 0.01F;
         if (var6 != null) {
            if (var19 > 0.01F) {
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                  var10 - 4.0F,
                  var7 - 2.0F,
                  var17 + 8.0F,
                  this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI + 4.0F,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .ah()
                     .a(RangesKt.coerceIn((int)(var19 * 28.0F), 0, 255)),
                  4.0F
               );
            }

            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var10 + this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl / 2.0F,
               var7 + this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI / 2.0F,
               this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl / 2.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .q()
            );
            var25 = var10;
            var29 = var7
               + (
                     this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                        - this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
                  )
                  / 2.0F;
         }

         label88: {
            label87: {
               var34 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
               var41 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
               var10005 = var18;
               if (var6 != null) {
                  if (var18 != 0) {
                     break label87;
                  }

                  var10005 = var15;
               }

               if (var10005 == 0) {
                  var52 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .u()
                     .a(0.7F);
                  break label88;
               }
            }

            var52 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .u();
         }

         label119: {
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var25, var29, var34, var41, 1.0F, var52, this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl / 2.0F
            );
            var10002 = 18828;
            var10003 = 4845;
            float var20 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               "filter:sortsel:" + var13,
               (var15 != 0),
               0.0F,
               4,
               null
            );
            float var26 = var20;
            float var30 = 0.02F;
            if (var6 != null) {
               if (!(var20 > 0.02F)) {
                  break label119;
               }

               var26 = var10;
               var30 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl / 2.0F;
            }

            float var21 = var26 + var30;
            float var22 = var7 + this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI / 2.0F;
            float var27 = var20;
            float var31 = 0.05F;
            if (var6 != null) {
               if (var20 > 0.05F) {
                  me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(
                        var21,
                        var22,
                        4.5F,
                        IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .ah(),
                        var20 * 0.6F,
                        6.0F
                     );
               }

               var27 = var21;
               var31 = var22;
            }

            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var27,
               var31,
               4.5F * var20,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .r()
            );
         }

         label73: {
            label72: {
               var36 = var10 + this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl + 8.0F;
               var43 = var7 + 2.0F;
               var10004 = var15;
               if (var6 != null) {
                  if (var15 != 0) {
                     break label72;
                  }

                  var10004 = var18;
               }

               if (var10004 == 0) {
                  var49 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a()
                     .a(0.7F);
                  break label73;
               }
            }

            var49 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a();
         }

          me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.b(
             var14, var36, var43, var49, false);
         if (var6 != null) {
            if (var18 != 0 && var23 == null) {
               var23 = new IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII() {
                  @Override
                  public void e() {
                     IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.this.b(var13);
                  }

                  @Override
                  public void a(char var1, int var2x) {
                  }

                  @Override
                  public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
                     return IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.a(var1, var2, var3, var4, var5, var6);
                  }

                  @Override
                  public void d() {
                     IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.d();
                  }
               };
            }

            var10 += var17 + 8.0F;
         }

         if (var6 == null) {
            break;
         }
      }

      return var23;
   }

   private final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII e(
      float var1, float var2, float var3, int var4, int var5, float var6, float var7
   ) {
      Object var63 = null; // PX-FIX
      Object var53 = null; // PX-FIX
      Object var47 = null; // PX-FIX
      Object var43 = null; // PX-FIX
      Object var39 = null; // PX-FIX
      float var9 = 0.0F;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = i();
      short var10002 = 18844;
      short var10003 = -18052;
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
         "Etherwarp Waypoints",
         var1 + 16.0F,
         var2 + 1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         false);
      var9 = var2 + 36.0F;
      Pair[] var11 = new Pair[3];
      var10003 = 18865;
      short var10004 = 13561;
      var10004 = 18875;
      int var10005 = -28606;
      var11[0] = TuplesKt.to("all", "All");
      var10003 = 18869;
      var10004 = 19981;
      var10004 = 18843;
      var10005 = (short)18773;
      var11[1] = TuplesKt.to("yes", "Yes");
      var10003 = 18871;
      var10004 = -23553;
      var10004 = 18831;
      var10005 = (short)9826;
      var11[2] = TuplesKt.to("no", "No");
      List var10 = CollectionsKt.listOf(var11);
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var8 = var10000;
      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var35 = null;
      float var12 = 0.0F;
      var12 = var1 + 16.0F;
      Iterable var13 = var10;
      boolean var14 = false;
      int var15 = 0;

      for (Object var17 : var13) {
         int var18 = var15++;
         if (var8 != null) {
            if (var8 != null && var18 < 0) {
               CollectionsKt.throwIndexOverflow();
            }

            final String var22;
            String var23;
            byte var24;
            float var26;
            float var28;
            label126: {
               label136: {
                  Pair var19 = (Pair)var17;
                  boolean var21 = false;
                  var22 = (String)var19.component1();
                  var23 = (String)var19.component2();
                  var24 = ((byte)((Intrinsics.areEqual(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, var22)) ? 1 : 0));
                  var26 = var9
                     + (
                           this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                              - this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
                        )
                        / 2.0F;
                  float var27 = (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.a(var23, false);
                  var28 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl + 8.0F + var27;
                  float var64;
                  var39 = (var64 = var4 - var12) == 0.0F ? 0 : (var64 < 0.0F ? -1 : 1);
                  if (var8 != null) {
                     if ((me.octo.client.PxTruth.truth(var39))) {
                        break label136;
                     }

                     float var65;
                     var39 = (var65 = var4 - (var12 + var28)) == 0.0F ? 0 : (var65 < 0.0F ? -1 : 1);
                  }

                  if (var8 != null) {
                     if ((me.octo.client.PxTruth.truth(var39))) {
                        break label136;
                     }

                     float var66;
                     var39 = (var66 = var5 - var9) == 0.0F ? 0 : (var66 < 0.0F ? -1 : 1);
                  }

                  if (var8 != null) {
                     if ((me.octo.client.PxTruth.truth(var39))) {
                        break label136;
                     }

                     float var67;
                     var39 = (var67 = var5 - (var9 + this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI)) == 0.0F
                        ? 0
                        : (var67 < 0.0F ? -1 : 1);
                  }

                  if (var8 == null) {
                     break label126;
                  }

                  if ((me.octo.client.PxTruth.truth(var39))) {
                     var39 = 1;
                     break label126;
                  }
               }

               var39 = 0;
            }

            int var29 =((Integer)( var39));
            var10002 = 18832;
            var10003 = 12625;
            float var30 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               "filter:eth:" + var22,
               (var29 != 0),
               0.0F,
               4,
               null
            );
            float var40 = var30;
            float var10001 = 0.01F;
            if (var8 != null) {
               if (var30 > 0.01F) {
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                     var12 - 4.0F,
                     var9 - 2.0F,
                     var28 + 8.0F,
                     this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI + 4.0F,
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .ah()
                        .a(RangesKt.coerceIn((int)(var30 * 28.0F), 0, 255)),
                     4.0F
                  );
               }

               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                  var12 + this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl / 2.0F,
                  var26 + this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl / 2.0F,
                  this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl / 2.0F,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .q()
               );
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                  var12 + this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl / 2.0F,
                  var26 + this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl / 2.0F,
                  this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl / 2.0F - 1.0F,
                  new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(0, 0, 0, 0)
               );
               var40 = var12;
               var10001 = var26;
            }

            label104: {
               label103: {
                  var47 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
                  var53 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
                  var10005 = var29;
                  if (var8 != null) {
                     if (var29 != 0) {
                        break label103;
                     }

                     var10005 = var24;
                  }

                  if (var10005 == 0) {
                     var63 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .u()
                        .a(0.7F);
                     break label104;
                  }
               }

               var63 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .u();
            }

            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var40, var10001, var47, var53, 1.0F, var63, this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl / 2.0F
            );
            var10002 = 18829;
            var10003 = 2087;
            float var31 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               "filter:ethsel:" + var22,
               (var24 != 0),
               0.0F,
               4,
               null
            );
            float var68;
            int var41 = (var68 = var31 - 0.02F) == 0.0F ? 0 : (var68 < 0.0F ? -1 : 1);
            if (var8 != null) {
               if (var41 > 0) {
                  float var32 = var12 + this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl / 2.0F;
                  float var33 = var26 + this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl / 2.0F;
                  float var42 = var31;
                  var10001 = 0.05F;
                  if (var8 != null) {
                     if (var31 > 0.05F) {
                        me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .a(
                              var32,
                              var33,
                              4.5F,
                              IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .ah(),
                              var31 * 0.6F,
                              6.0F
                           );
                     }

                     var42 = var32;
                     var10001 = var33;
                  }

                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                     var42,
                     var10001,
                     4.5F * var31,
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .r()
                  );
               }

               var41 = var24;
            }

            label94: {
               label93: {
                  if (var8 != null) {
                     if (var41 != 0) {
                        break label93;
                     }

                     var41 = var29;
                  }

                  if (var41 == 0) {
                     var43 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a()
                        .a(0.7F);
                     break label94;
                  }
               }

               var43 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a();
            }

            Object var37 = var43;
            me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, var23, var12 + this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl + 8.0F, var9 + 2.0F, var37, false, 16, null);
            if (var8 != null) {
               label83:
               if (var29 != 0) {
                  IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var44 = var35;
                  if (var8 != null) {
                     if (var35 != null) {
                        break label83;
                     }

                     var44 = new IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII() {
                        @Override
                        public void e() {
                           IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.this.a(var22);
                        }

                        @Override
                        public void a(char var1, int var2x) {
                        }

                        @Override
                        public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
                           return IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.a(var1, var2, var3, var4, var5, var6);
                        }

                        @Override
                        public void d() {
                           IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.d();
                        }
                     };
                  }

                  var35 = var44;
               }

               var12 += var28 + 20.0F;
            }

            if (var8 != null) {
               continue;
            }
         }
         break;
      }

      return var35;
   }

   private final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII f(
      float var1, float var2, float var3, int var4, int var5, float var6, float var7
   ) {
      int var10001 = 18819;
      short var10002 = -2337;
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
         "Max Waypoints",
         var1,
         var2 + 1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         false);
      float var8 = var2 + 26.0F;
      float var10 = var8 + 8.0F;
      float var11 = var3 - 16.0F;
      float var12 = 4.0F;
      short var10010 = 18874;
      short var10011 = -26430;
      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var13 = this.a(
         var1,
         var10,
         var11,
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         0.0F,
         100.0F,
         var4,
         var5,
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
         "filter:maxwp",
         null
      );
      var8 += 28.0F;
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.b(
         String.valueOf(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.getFirst()) + " pts",
         var1,
         var8,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a()
            .a(0.6F),
         false);
      String var18 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.getLast() + " pts";
      double var21 = var1 + var11;
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.b(
         var18,
         var21
            - me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.a(
               var18, false),
         var8,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a()
            .a(0.6F),
         false);
      return var13;
   }

   private final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII g(
      float var1, float var2, float var3, int var4, int var5, float var6, float var7
   ) {
      Object var20 = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var8 = i();
      float var10000 = var7;
      float var10001 = 0.3F;
      if (var8 != null) {
         if (var7 < 0.3F) {
            return null;
         }

         var10000 = var1;
         var10001 = 16.0F;
      }

      float var9;
      float var11;
      float var12;
      label69: {
         label73: {
            var9 = var10000 + var10001;
            var11 = var3 - 32.0F;
            var12 = 32.0F;
            float var31;
            var20 = (var31 = var4 - var9) == 0.0F ? 0 : (var31 < 0.0F ? -1 : 1);
            if (var8 != null) {
               if ((me.octo.client.PxTruth.truth(var20))) {
                  break label73;
               }

               float var32;
               var20 = (var32 = var4 - (var9 + var11)) == 0.0F ? 0 : (var32 < 0.0F ? -1 : 1);
            }

            if (var8 != null) {
               if ((me.octo.client.PxTruth.truth(var20))) {
                  break label73;
               }

               float var33;
               var20 = (var33 = var5 - var2) == 0.0F ? 0 : (var33 < 0.0F ? -1 : 1);
            }

            if (var8 != null) {
               if ((me.octo.client.PxTruth.truth(var20))) {
                  break label73;
               }

               float var34;
               var20 = (var34 = var5 - (var2 + var12)) == 0.0F ? 0 : (var34 < 0.0F ? -1 : 1);
            }

            if (var8 == null) {
               break label69;
            }

            if ((me.octo.client.PxTruth.truth(var20))) {
               var20 = 1;
               break label69;
            }
         }

         var20 = 0;
      }

      int var13 =((Integer)( var20));
      short var24 = 18866;
      short var10002 = 24789;
      float var14 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         "filter:clearbtn",
         (var13 != 0),
         0.0F,
         4,
         null
      );
      float var35;
      int var21 = (var35 = var14 - 0.01F) == 0.0F ? 0 : (var35 < 0.0F ? -1 : 1);
      if (var8 != null) {
         if (var21 > 0) {
            me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
               me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               var9,
               var2,
               var11,
               var12,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .aq(),
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ah(),
               var14 * 0.55F,
               4.0F);
         }

         var21 = var13;
      }

      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var15 = var21 != 0
         ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .H()
         : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .G();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var9,
         var2,
         var11,
         var12,
         var15,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .aq()
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var9,
         var2,
         var11,
         var12,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(0.35F + var14 * 0.4F),
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .aq()
      );
      short var25 = 18841;
      var10002 = 9816;
      me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(
            "filter:clearbtnrip",
            var9,
            var2,
            var11,
            var12,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .aq()
         );
      float var16 = var9 + 10.0F;
      short var26 = 18830;
      var10002 = 8553;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n            <line x1=\"18\" y1=\"6\" x2=\"6\" y2=\"18\"/>\n            <line x1=\"6\" y1=\"6\" x2=\"18\" y2=\"18\"/>\n        </svg>\n    ",
            var16,
            var2 + 8.0F,
            16.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(),
            var6
         );
      short var27 = 18839;
      var10002 = 18131;
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
         "Clear Filters",
         var16 + 20.0F,
         var2 + 8.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         false);
      int var22 = var13;
      if (var8 != null) {
         if (var13 == 0) {
            return null;
         }

         var22 = var4;
      }

      final float var17 = var22;
      final float var18 = var5;
      final float var19 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var11, var12, var17, var18, var9, var2)
         + 4.0F;
      return new IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII() {
         private static String b;

         @Override
         public void e() {
            me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(
                  b,
                  var17,
                  var18,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .ah()
                     .a(150),
                  var19,
                  220L
               );
            IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.this.h();
         }

         @Override
         public void a(char var1, int var2x) {
         }

         // $VF: Irreducible bytecode was duplicated to produce valid code
         static {
            pxClinit: {
            char[] var10003 = "\u0000CT\u001d\u001b5\u001a\u0005F]\b\f%T\bXQ\u0019".toCharArray();
            int var10004 = var10003.length;
            int var0 = 0;
            byte var6x = 18;
            char[] var10002x = var10003;
            int var1x = var10004;
            byte var10;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var10 = 18;
               var10006 = var0;
            } else {
               var6x = 18;
               var1x = var10004;
               if (var10004 <= var0) {
                  String var9x = new String(var10003).intern();
                  byte var4x = -1;
                  b = var9x;
                  break pxClinit;
               }

               var10005 = var10003;
               var10 = 18;
               var10006 = var0;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
                  case 0 -> 116;
                  case 1 -> 56;
                  case 2 -> 42;
                  case 3 -> 123;
                  case 4 -> 108;
                  case 5 -> 85;
                  default -> 50;
               });
               var0++;
               if (var6x == 0) {
                  var10006 = var6x;
                  var10005 = var10002x;
                  var10 = var6x;
               } else {
                  if (var1x <= var0) {
                     String var8x = new String(var10002x).intern();
                     byte var3x = -1;
                     b = var8x;
                     break pxClinit;
                  }

                  var10005 = var10002x;
                  var10 = var6x;
                  var10006 = var0;
               }
            }
            }
         }

         @Override
         public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
            return IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.a(var1, var2, var3, var4, var5, var6);
         }

         @Override
         public void d() {
            IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.d();
         }
      };
   }

   public final void h() {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.clear();
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new IntRange(0, 100);
      short var10001 = 18834;
      short var10002 = 17920;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = "all";
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 100.0F;
   }

   private static final Unit a(IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll var0, float var1, boolean var2) {
      var0.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var1;
      var0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var2;
      var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new IntRange(0, (int)var1);
      return Unit.INSTANCE;
   }

   private static final Unit b(IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll var0, float var1, boolean var2) {
      var0.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var1;
      var0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var2;
      var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new IntRange(0, (int)var1);
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
      String[] var5 = new String[48];
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[5];
      int var3 = 0;
      b(var10000);
      String var2 = " çÃ\u0007ô\u0090\u009agÍ©®\u000b%~\u0084º\u000e\u0012\u009f¯ß²~µ\u001bÞî\u009aÃ\u009aÑã\u001b\u0082q\u0087\u0099ÅzÐtl\u001f¶<Ý÷÷ýâvõjÏ+¬)Ê\u0088 òÚÇ\u0082ÁôA\\O'æy\u001e\u000e±ÀHé=\u0083nür\u0088é<\u0005thûèyÅÒcêÝÿ\u008a\u008c\u001dØ¶}Tòï·\u0003¿_Ùõò\u0017îÃ?9ùî\u0096q£\u001c#b/Ø´\u009c£\u009dy\u0092²6´\u001f{\u00adú_b©¢7ÇOAf\n±=l·²\u0083g\u00ad®?/eA²N\u008b\u0087\u009aMÜ\u000fæ\u009d\u0086£ï\u0002ÎþÛNÌ<í{0.\u0018\fª1tØÀÉiî\u001fyÜ\u0001\u0085é\u0003\bÍâ\rôÚ6\u009egs;\u0097 $Õ\u0016Í\u000f\u0094½ã\u0004[ó\u008dqx=\u0086=û\"G\u0004×ÚL\u0013\u0006\b~3&\u0096´\u0003\u001b_\u0084\u0002\tÁ\u0012¶\u009bö\u0006@\u0085V[þç\u001a]¡NÀd4\u0085\u000eClHø\u0097Z¬¦¹\u0093ûhÃS\rËË\u0003QZ¢\"ÝXJ¢cI\u0013s{\rµ¬Åeç´\u0006ú\u009fVcG^â¾\u0096\u0002'·\u0007±Ã\u009b*\u0085¸Í\rÅâÂtb\u0006%I¸Ø¾1Ê\b!\u001e\u0092*ß \u0080\u0089\u0007\u001e\u0093n ;ù\u001a\u0004nJ?@\u00069¾1>Ö·\u0003gu/\fa±\fC\u001f-½Y\u0096G¤¶\u0011Ùl\u001bøýZá®\u0005\u008bßl\u00958\u000eä\u0090\u0012N£é\u0001£e`E9f\u00ad%ñ\u0011\u008eª\u001f\u008a\u0013\\ÐèÀ\u0010kò2F¼¤È\u009d\u0089>\u0003Í\u0015s\u0007X\u0002\u008cóM1¹ÍPv\u0087\u008fî8t·¯\bçÖKï \u0095?Äv£\u0011\u007fR£Ihà¤¸åqébbáµßxbÖu~×\r\u009d\r¼<U¦ØÕeK\u0098×ÚväÙ;\u0016_1#S\u0081lèpÆ¾iu\u001cÝÏòì8\u001fZ\u0086¢.\u001dú\u008dAx\u0081¿\u0011\u0015c¼¥>\u0018ª7\u009fÝ½§\u0016\u009b\u0011\u009dfK~ÂÿÕ\u008f\fxü¥¬\u0018\u0086µYË\u0080J\u009dZ\u0002ØØ¿fÑPKÃÀÈ9ûfa\u0005\u0085\u0010\u008d¬&\u0000(.\u0000õ¬Î#P\u0019¡\u0013¹\u0012\u0081ËMÓ\u009aÖ@k\u009bõØ\u0084ë¾1±Õ·\u008fHtÊ(ðµ?T¦\u0094\u00014\\\u001f\u0017 y\u0010é²\u001c\u0002¸©\u000fÜ\u008a»$éÁcÃ[ñØkI±n\u000e\u0092\u0088rdÐÉDÔ¤ÝX¡·j\u000f\u0018ì#èúX\u0001à\u0014\u0090G³\n\u0093µ\r£¨\u0005¦\u0087±\u001cö\n¯¬9a\u0004Ô\u008c,Ù\u0003Óí½\t4ñÿ\u0097\u0010ó/,þ\u0002\tØ\u0007Á(\u0095¶´£f\u0003Ëâº\f/jÅ8&B\u009a\u00adjë2`\u0003óø\u009d\u00075\u0088\u009e=-¯¾\u00079s\u001fB\u001d@¸\u0003×n\u001d\rÑ5\u001aÓÝ?å\f\u008c\rÒ\u0019¢";
      int var4 = " çÃ\u0007ô\u0090\u009agÍ©®\u000b%~\u0084º\u000e\u0012\u009f¯ß²~µ\u001bÞî\u009aÃ\u009aÑã\u001b\u0082q\u0087\u0099ÅzÐtl\u001f¶<Ý÷÷ýâvõjÏ+¬)Ê\u0088 òÚÇ\u0082ÁôA\\O'æy\u001e\u000e±ÀHé=\u0083nür\u0088é<\u0005thûèyÅÒcêÝÿ\u008a\u008c\u001dØ¶}Tòï·\u0003¿_Ùõò\u0017îÃ?9ùî\u0096q£\u001c#b/Ø´\u009c£\u009dy\u0092²6´\u001f{\u00adú_b©¢7ÇOAf\n±=l·²\u0083g\u00ad®?/eA²N\u008b\u0087\u009aMÜ\u000fæ\u009d\u0086£ï\u0002ÎþÛNÌ<í{0.\u0018\fª1tØÀÉiî\u001fyÜ\u0001\u0085é\u0003\bÍâ\rôÚ6\u009egs;\u0097 $Õ\u0016Í\u000f\u0094½ã\u0004[ó\u008dqx=\u0086=û\"G\u0004×ÚL\u0013\u0006\b~3&\u0096´\u0003\u001b_\u0084\u0002\tÁ\u0012¶\u009bö\u0006@\u0085V[þç\u001a]¡NÀd4\u0085\u000eClHø\u0097Z¬¦¹\u0093ûhÃS\rËË\u0003QZ¢\"ÝXJ¢cI\u0013s{\rµ¬Åeç´\u0006ú\u009fVcG^â¾\u0096\u0002'·\u0007±Ã\u009b*\u0085¸Í\rÅâÂtb\u0006%I¸Ø¾1Ê\b!\u001e\u0092*ß \u0080\u0089\u0007\u001e\u0093n ;ù\u001a\u0004nJ?@\u00069¾1>Ö·\u0003gu/\fa±\fC\u001f-½Y\u0096G¤¶\u0011Ùl\u001bøýZá®\u0005\u008bßl\u00958\u000eä\u0090\u0012N£é\u0001£e`E9f\u00ad%ñ\u0011\u008eª\u001f\u008a\u0013\\ÐèÀ\u0010kò2F¼¤È\u009d\u0089>\u0003Í\u0015s\u0007X\u0002\u008cóM1¹ÍPv\u0087\u008fî8t·¯\bçÖKï \u0095?Äv£\u0011\u007fR£Ihà¤¸åqébbáµßxbÖu~×\r\u009d\r¼<U¦ØÕeK\u0098×ÚväÙ;\u0016_1#S\u0081lèpÆ¾iu\u001cÝÏòì8\u001fZ\u0086¢.\u001dú\u008dAx\u0081¿\u0011\u0015c¼¥>\u0018ª7\u009fÝ½§\u0016\u009b\u0011\u009dfK~ÂÿÕ\u008f\fxü¥¬\u0018\u0086µYË\u0080J\u009dZ\u0002ØØ¿fÑPKÃÀÈ9ûfa\u0005\u0085\u0010\u008d¬&\u0000(.\u0000õ¬Î#P\u0019¡\u0013¹\u0012\u0081ËMÓ\u009aÖ@k\u009bõØ\u0084ë¾1±Õ·\u008fHtÊ(ðµ?T¦\u0094\u00014\\\u001f\u0017 y\u0010é²\u001c\u0002¸©\u000fÜ\u008a»$éÁcÃ[ñØkI±n\u000e\u0092\u0088rdÐÉDÔ¤ÝX¡·j\u000f\u0018ì#èúX\u0001à\u0014\u0090G³\n\u0093µ\r£¨\u0005¦\u0087±\u001cö\n¯¬9a\u0004Ô\u008c,Ù\u0003Óí½\t4ñÿ\u0097\u0010ó/,þ\u0002\tØ\u0007Á(\u0095¶´£f\u0003Ëâº\f/jÅ8&B\u009a\u00adjë2`\u0003óø\u009d\u00075\u0088\u009e=-¯¾\u00079s\u001fB\u001d@¸\u0003×n\u001d\rÑ5\u001aÓÝ?å\f\u008c\rÒ\u0019¢"
         .length();
      char var1 = 3;
      int var8 = -1;

      label52:
while (true) {
         byte var9 = 109;
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
                     case 0 -> 81;
                     case 1 -> 37;
                     case 2 -> 12;
                     case 3 -> 33;
                     case 4 -> 91;
                     case 5 -> 41;
                     default -> 6;
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
                     b = new String[48];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.PXEvMid(
                        null
                     );
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

                  var2 = "t\u0092\u0091\u0096ï\u008f\f\u0091\u0011?zT'ù2%â:m";
                  var4 = "t\u0092\u0091\u0096ï\u008f\f\u0091\u0011?zT'ù2%â:m".length();
                  var1 = 6;
                  var8 = -1;
            }

            var9 = 69;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   public static void b(me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var0) {
      llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = var0;
   }

   public static me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] i() {
      return llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 18834) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 115;
            case 1 -> 24;
            case 2 -> 241;
            case 3 -> 174;
            case 4 -> 98;
            case 5 -> 2;
            case 6 -> 68;
            case 7 -> 243;
            case 8 -> 32;
            case 9 -> 227;
            case 10 -> 196;
            case 11 -> 60;
            case 12 -> 217;
            case 13 -> 90;
            case 14 -> 20;
            case 15 -> 58;
            case 16 -> 212;
            case 17 -> 99;
            case 18 -> 8;
            case 19 -> 77;
            case 20 -> 101;
            case 21 -> 37;
            case 22 -> 26;
            case 23 -> 245;
            case 24 -> 117;
            case 25 -> 210;
            case 26 -> 230;
            case 27 -> 34;
            case 28 -> 131;
            case 29 -> 89;
            case 30 -> 31;
            case 31 -> 132;
            case 32 -> 224;
            case 33 -> 97;
            case 34 -> 41;
            case 35 -> 185;
            case 36 -> 147;
            case 37 -> 202;
            case 38 -> 187;
            case 39 -> 215;
            case 40 -> 146;
            case 41 -> 193;
            case 42 -> 167;
            case 43 -> 233;
            case 44 -> 135;
            case 45 -> 247;
            case 46 -> 56;
            case 47 -> 106;
            case 48 -> 222;
            case 49 -> 204;
            case 50 -> 62;
            case 51 -> 253;
            case 52 -> 249;
            case 53 -> 164;
            case 54 -> 15;
            case 55 -> 93;
            case 56 -> 248;
            case 57 -> 142;
            case 58 -> 206;
            case 59 -> 143;
            case 60 -> 133;
            case 61 -> 54;
            case 62 -> 35;
            case 63 -> 192;
            case 64 -> 110;
            case 65 -> 65;
            case 66 -> 134;
            case 67 -> 49;
            case 68 -> 225;
            case 69 -> 27;
            case 70 -> 59;
            case 71 -> 189;
            case 72 -> 137;
            case 73 -> 66;
            case 74 -> 177;
            case 75 -> 80;
            case 76 -> 84;
            case 77 -> 124;
            case 78 -> 70;
            case 79 -> 114;
            case 80 -> 126;
            case 81 -> 57;
            case 82 -> 86;
            case 83 -> 156;
            case 84 -> 149;
            case 85 -> 184;
            case 86 -> 150;
            case 87 -> 170;
            case 88 -> 160;
            case 89 -> 235;
            case 90 -> 140;
            case 91 -> 30;
            case 92 -> 190;
            case 93 -> 92;
            case 94 -> 88;
            case 95 -> 218;
            case 96 -> 148;
            case 97 -> 136;
            case 98 -> 76;
            case 99 -> 151;
            case 100 -> 244;
            case 101 -> 240;
            case 102 -> 63;
            case 103 -> 4;
            case 104 -> 9;
            case 105 -> 226;
            case 106 -> 61;
            case 107 -> 207;
            case 108 -> 3;
            case 109 -> 252;
            case 110 -> 242;
            case 111 -> 19;
            case 112 -> 172;
            case 113 -> 208;
            case 114 -> 186;
            case 115 -> 96;
            case 116 -> 209;
            case 117 -> 36;
            case 118 -> 14;
            case 119 -> 25;
            case 120 -> 22;
            case 121 -> 195;
            case 122 -> 178;
            case 123 -> 216;
            case 124 -> 47;
            case 125 -> 191;
            case 126 -> 28;
            case 127 -> 79;
            case 128 -> 29;
            case 129 -> 33;
            case 130 -> 158;
            case 131 -> 102;
            case 132 -> 152;
            case 133 -> 199;
            case 134 -> 213;
            case 135 -> 139;
            case 136 -> 161;
            case 137 -> 214;
            case 138 -> 108;
            case 139 -> 12;
            case 140 -> 219;
            case 141 -> 42;
            case 142 -> 10;
            case 143 -> 40;
            case 144 -> 85;
            case 145 -> 145;
            case 146 -> 251;
            case 147 -> 121;
            case 148 -> 234;
            case 149 -> 45;
            case 150 -> 211;
            case 151 -> 229;
            case 152 -> 181;
            case 153 -> 159;
            case 154 -> 128;
            case 155 -> 16;
            case 156 -> 21;
            case 157 -> 200;
            case 158 -> 154;
            case 159 -> 197;
            case 160 -> 183;
            case 161 -> 171;
            case 162 -> 157;
            case 163 -> 168;
            case 164 -> 141;
            case 165 -> 39;
            case 166 -> 123;
            case 167 -> 176;
            case 168 -> 23;
            case 169 -> 13;
            case 170 -> 6;
            case 171 -> 254;
            case 172 -> 236;
            case 173 -> 138;
            case 174 -> 95;
            case 175 -> 78;
            case 176 -> 201;
            case 177 -> 166;
            case 178 -> 238;
            case 179 -> 221;
            case 180 -> 38;
            case 181 -> 232;
            case 182 -> 113;
            case 183 -> 198;
            case 184 -> 7;
            case 185 -> 119;
            case 186 -> 105;
            case 187 -> 155;
            case 188 -> 18;
            case 189 -> 246;
            case 190 -> 205;
            case 191 -> 153;
            case 192 -> 73;
            case 193 -> 83;
            case 194 -> 179;
            case 195 -> 44;
            case 196 -> 165;
            case 197 -> 250;
            case 198 -> 0;
            case 199 -> 163;
            case 200 -> 72;
            case 201 -> 255;
            case 202 -> 53;
            case 203 -> 116;
            case 204 -> 223;
            case 205 -> 122;
            case 206 -> 100;
            case 207 -> 180;
            case 208 -> 237;
            case 209 -> 188;
            case 210 -> 50;
            case 211 -> 48;
            case 212 -> 17;
            case 213 -> 51;
            case 214 -> 239;
            case 215 -> 82;
            case 216 -> 144;
            case 217 -> 52;
            case 218 -> 111;
            case 219 -> 125;
            case 220 -> 71;
            case 221 -> 55;
            case 222 -> 75;
            case 223 -> 69;
            case 224 -> 103;
            case 225 -> 203;
            case 226 -> 169;
            case 227 -> 104;
            case 228 -> 112;
            case 229 -> 120;
            case 230 -> 64;
            case 231 -> 220;
            case 232 -> 182;
            case 233 -> 231;
            case 234 -> 194;
            case 235 -> 67;
            case 236 -> 74;
            case 237 -> 118;
            case 238 -> 175;
            case 239 -> 107;
            case 240 -> 81;
            case 241 -> 46;
            case 242 -> 129;
            case 243 -> 162;
            case 244 -> 5;
            case 245 -> 1;
            case 246 -> 130;
            case 247 -> 127;
            case 248 -> 91;
            case 249 -> 43;
            case 250 -> 109;
            case 251 -> 94;
            case 252 -> 228;
            case 253 -> 11;
            case 254 -> 87;
            default -> 173;
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

   public static final class PXEvMid {
      // PX-FIX varargs-ctor: entry args lost by obfuscator; rewritten in place to the jar's exact
      // Kotlin-synthesized descriptor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
      // (the single call site passes a bare null and still binds to this ctor unambiguously)
      public PXEvMid(kotlin.jvm.internal.DefaultConstructorMarker marker) {
         this();
      }

      private PXEvMid() {
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
