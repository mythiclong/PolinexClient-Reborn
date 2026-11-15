package me.octo.client;

import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;

public final class lllIIIlIIIlllIlllIlllIllllIIllIlIlIlIIllIIllIlllllIIlllIIIllIlIIIIllIlIlIIlIIllIlllII
   implements lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI,
   IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl {
   @NotNull
   public static lllIIIlIIIlllIlllIlllIllllIIllIlIlIlIIllIIllIlllllIIlllIIIllIlIIIIllIlIlIIlIIllIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final IlIIIIIllIlIIlllIIIllIlllllIIIlllIIIlIlIllIlIllIllIllllIllIIlllIllIllllIIIlIIIIllllll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private final int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private final int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private final int IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private final int IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private final float lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private final float IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private final float llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private String lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private int lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private long lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private final long lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private int IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private int llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   public static float IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static String[] d;
   private static String[] e;

   public lllIIIlIIIlllIlllIlllIllllIIllIlIlIlIIllIIllIlllllIIlllIIIllIlIIIIllIlIlIIlIIllIlllII(
      @NotNull IlIIIIIllIlIIlllIIIllIlllllIIIlllIIIlIlIllIlIllIllIllllIllIIlllIllIllllIIIlIIIIllllll var1
   ) {
      short var10001 = 11023;
      short var10002 = -31998;
      Intrinsics.checkNotNullParameter(var1, "setting");
      super();
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
      int[] var10000 = lIlllIIlIllIlIlIIlllIllIlIIllIIIlllllIlIIlIIlllllIIlllIIllIlIIIlIlllIlIllIllIIIlIIlIl.l();
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 28;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 3;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = 140;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 25;
      int[] var2 = var10000;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 30.0F;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = 16.0F;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 8.0F;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = "";
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 100L;
      String[] var3 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.G();
      String[] var4 = var3;
      int var16 = var3.length;
      if (var2 != null) {
         var16 = var16 == 0 ? 1 : 0;
      }

      Double var17;
      if (var16 != 0) {
         var17 = null;
      } else {
         String var5 = var3[0];
         boolean var6 = false;
         double var7 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, var5, false, 2, null)
            + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
            + this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            + this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI * 2;
         int var9 = 1;
         int var10 = ArraysKt.getLastIndex(var3);
         if (var9 <= var10) {
            do {
               String var11 = var4[var9];
               boolean var12 = false;
               double var13 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, var11, false, 2, null)
                  + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
                  + this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
                  + this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI * 2;
               var7 = Math.max(var7, var13);
               if (var9 == var10) {
                  break;
               }

               var9++;
               if (var2 == null) {
                  return;
               }
            } while (var2 != null);
         }

         var17 = var7;
      }

      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var17 != null
         ? (int)var17.doubleValue()
         : this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   private final float k() {
      return IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .aq();
   }

   @NotNull
   @Override
   public String f() {
      String var10000 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.Z();
      short var10001 = 11018;
      short var10002 = -22142;
      return var10000 + "_multibool_dropdown";
   }

   private final float b(float var1) {
      float var2 = var1 - 1.0F;
      return 1.0F + var2 * var2 * var2;
   }

   private final float c(float var1) {
      float var2 = var1 * var1 * (3.0F - 2.0F * var1);
      return 0.65F + 0.35F * var2;
   }

   private final String d(float var1) {
      int[] var10000 = lIlllIIlIllIlIlIIlllIllIlIIllIIIlllllIlIIlIIlllllIIlllIIllIlIIIlIlllIlIllIllIIIlIIlIl.l();
      List var3 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.I();
      int[] var2 = var10000;
      int var8 = ((var3.isEmpty()) ? 1 : 0);
      if (var2 != null) {
         if (var8 != 0) {
            short var15 = 11017;
            short var19 = -18159;
            return "None";
         }

         var8 = var3.size();
      }

      label55: {
         short var10001 = 1;
         if (var2 != null) {
            if (var8 == 1) {
               return (String)var3.get(0);
            }

            var8 = var3.size();
            if (var2 == null) {
               break label55;
            }

            var10001 = 3;
         }

         if (var8 <= var10001) {
            float var24;
            int var9 = (var24 = var1 - 0.3F) == 0.0F ? 0 : (var24 < 0.0F ? -1 : 1);
            if (var2 != null) {
               var9 = var9 < 0 ? Math.min(2, var3.size()) : var3.size();
            }

            int var4 = var9;
            Iterable var10 = CollectionsKt.take(var3, var4);
            var10001 = 11021;
            short var10002 = -10721;
            return CollectionsKt.joinToString(var10, ", ", null, null, 0, null, null);
         }

         float var25;
         var8 = (var25 = var1 - 0.3F) == 0.0F ? 0 : (var25 < 0.0F ? -1 : 1);
      }

      if (var2 != null) {
         var8 = var8 < 0 ? 2 : 3;
      }

      int var7 = var8;
      List var5 = CollectionsKt.take(var3, var7);
      int var6 = var3.size() - var7;
      String var11;
      if (var6 > 0) {
         Iterable var12 = var5;
         short var17 = 11016;
         short var20 = -12021;
         String var13 = CollectionsKt.joinToString(var12, ", ", null, null, 0, null, null);
         var20 = 11015;
         short var10003 = 888;
         var10003 = 11019;
         short var10004 = 31645;
         var11 = var13 + " + " + var6 + " more";
      } else {
         Iterable var14 = var5;
         short var18 = 11016;
         short var22 = -12021;
         var11 = CollectionsKt.joinToString(var14, ", ", null, null, 0, null, null);
      }

      return var11;
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
      int var81 = 0; // PX-FIX
      Object var79 = null; // PX-FIX
      Object var77 = null; // PX-FIX
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var75 = null; // PX-FIX
      int[] var6;
      llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl var7;
      float var69;
      label199: {
         int[] var10000 = lIlllIIlIllIlIlIIlllIllIlIIllIIIlllllIlIIlIIlllllIIlllIIllIlIIIlIlllIlIllIllIIIlIIlIl.l();
         short var10002 = 11022;
         short var10003 = -16062;
         Intrinsics.checkNotNullParameter(var1, "drawContext");
         var6 = var10000;
         short var10001 = 11020;
         var10002 = -30953;
         Intrinsics.checkNotNullParameter(var2, "resolution");
         var7 = null;
         long var67 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         long var82 = 0L;
         if (var6 != null) {
            if (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl <= 0L) {
               var69 = 1.0F;
               break label199;
            }

            var67 = System.currentTimeMillis();
            var82 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         }

         long var9 = var67 - var82;
         long var68 = var9;
         if (var6 != null) {
            if (var9 >= this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll) {
               this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 0L;
               var69 = 1.0F;
               break label199;
            }

            var68 = var9;
         }

         var69 = (float)var68 / (float)this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      }

      float var8 = var69;
      int var63 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.I().hashCode();
      if (var63 != this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) {
         String var10 = this.d(1.0F);
         int var83 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.length();
         if (var6 != null) {
            var83 = var83 == 0 ? 1 : 0;
         }

         this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var83 != 0
            ? (int)(
               me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, var10, false, 2, null)
                  + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
            )
            : (int)(
               me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, false, 2, null)
                  + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
            );
         this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var63;
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = this.d(1.0F);
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = System.currentTimeMillis();
      }

      String var64 = this.d(var8);
      double var11 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, var64, false, 2, null)
         + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      float var13 = this.b(var8);
      int var14 = (int)me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.c(
         (float)this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI, (float)var11, var13
      );
      float var15 = this.h();
      float var16 = this.b(var15);
      int var17 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, var14 + 20);
      int var18 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(var17, this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI);
      float var88;
      int var70 = (var88 = var15 - 0.0F) == 0.0F ? 0 : (var88 < 0.0F ? -1 : 1);
      if (var6 != null) {
         var70 = var70 > 0 ? var18 : var17;
      }

      int var19 = var70;
      int var20 = (int)var2.e() - 50 - 10;
      int var21 = var20 - var19;
      int var22 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.a(var1, (int)var2.c(), var3, var21 - 15);
      int var71 = (var22 - var3 >> 1) + var3 - 5;
      int var84 = ((this.c() instanceof IIIIlIlIllIIllIlllllIlIlIlIlllllIIIllIIlIIIlIlIIIIIlllIlllIlIllllllIIllIIlIIlIlIlIIll) ? 1 : 0);
      if (var6 != null) {
         var84 = var84 != 0 ? 5 : 0;
      }

      int var23;
      String[] var24;
      int var26;
      label181: {
         var23 = var71 + var84;
         var24 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.G();
         int var25 = var24.length;
         var26 = var25
               * (
                  this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                     + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
               )
            + 10;
         var69 = var15;
         float var85 = 0.0F;
         if (var6 != null) {
            if (!(var15 > 0.0F)) {
               var69 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
               break label181;
            }

            var69 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
            var85 = var26 * var16;
         }

         var69 += var85;
      }

      float var27;
      label175: {
         label174: {
            var27 = var69;
            byte var28 = ((byte)((this.a(var4, var5, var21 - 10, var23 - 15, var21 + var19 + 10, (int)(var23 - 15 + var27))) ? 1 : 0));
            int var74 = var28;
            if (var6 != null) {
               if (var28 == 0) {
                  break label174;
               }

               float var89;
               var74 = (var89 = var15 - 0.1F) == 0.0F ? 0 : (var89 < 0.0F ? -1 : 1);
            }

            if (var74 < 0) {
               var75 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .C();
               break label175;
            }
         }

         var75 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .B();
      }

      label166: {
         me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var29 = var75;
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var21 - 10, var23 - 15, var19 + 20, var27, var29, this.k()
         );
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var21 - 10,
            var23 - 15,
            var19 + 20,
            var27,
            1.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .y(),
            this.k()
         );
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, var64, var21, var23 - 8.5, IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(), false, 16, null);
         this.a(
            var1,
            (float)(var21 + var19 - 15),
            (float)var23,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .F()
         );
         byte var30 = ((byte)((this.a(var4, var5, var21 - 10, var23 - 15, var21 + var19 + 10, var23 + 15)) ? 1 : 0));
         int var76 = var30;
         if (var6 != null) {
            if (var30 == 0) {
               break label166;
            }

            float var90;
            var76 = (var90 = var5 - (var2.d() + 100)) == 0.0F ? 0 : (var90 < 0.0F ? -1 : 1);
         }

         if (var76 > 0) {
            llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(true);
            var7 = new llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl() {
               @Override
               public void e() {
                  lllIIIlIIIlllIlllIlllIllllIIllIlIlIlIIllIIllIlllllIIlllIIIllIlIIIIllIlIlIIlIIllIlllII.this.i();
               }
            };
         }
      }

      float var91;
      var77 = (var91 = var15 - 0.01F) == 0.0F ? 0 : (var91 < 0.0F ? -1 : 1);
      label160:
      if (var6 != null) {
         if (((Boolean)var77)) {
            int var31 = var23 + 20;
            float var32 = var26 * var16;
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a((float)(var21 - 8), (float)(var31 - 3), (float)(var19 + 16), var32 + 6.0F);
            boolean[] var33 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.H();
            int var34 = var31;
            int var35 = 0;
            int var36 = var24.length;

            while (var35 < var36) {
               label211: {
                  String var37 = var24[var35];
                  boolean var38 = var33[var35];
                  float var39 = var35 * 0.05F;
                  float var40 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .c(
                        0.0F,
                        me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .b(1.0F, (var15 - var39) / (1.0F - var39))
                     );
                  float var41 = this.b(var40);
                  var69 = var40;
                  float var86 = 0.02F;
                  if (var6 != null) {
                     float var92;
                     var77 = (var92 = var40 - 0.02F) == 0.0F ? 0 : (var92 < 0.0F ? -1 : 1);
                     if (var6 == null) {
                        break label160;
                     }

                     if (((Boolean)var77)) {
                        var34 += this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                           + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
                        if (var6 != null) {
                           break label211;
                        }

                        me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
                           new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[5]
                        );
                     }

                     var69 = var41 * var41;
                     var86 = var41;
                  }

                  float var42;
                  float var43;
                  int var46;
                  int var47;
                  label143: {
                     label205: {
                        var42 = var69 * var86;
                        var43 = this.c(var40);
                        float var44 = (1.0F - var41) * (1.0F - var41) * 15.0F;
                        float var45 = (1.0F - var41) * 2.0F;
                        var46 = var34 + (int)var45;
                        var47 = var21 + (int)var44;
                        var79 = this.a(
                           var4,
                           var5,
                           var47 - 5,
                           var46 - 2,
                           var47 + var19 - 5,
                           var46 + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                        );
                        if (var6 != null) {
                           if (((Boolean)(var79))) {
                              break label205;
                           }

                           float var93;
                           var79 = (var93 = var15 - 0.8F) == 0.0F ? 0 : (var93 < 0.0F ? -1 : 1);
                        }

                        if (var6 == null) {
                           break label143;
                        }

                        if (((Boolean)var79)) {
                           var79 = 1;
                           break label143;
                        }
                     }

                     var79 = 0;
                  }

                  int var48 =((Integer)( var79));
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(var42);
                  me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var49 = var48 != 0
                     ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .E()
                     : new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(0, 0, 0, 0);
                  float var50 = var19 - 10;
                  float var51 = var50 * var43;
                  float var52 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI * var43;
                  float var53 = var47 - 5 + (var50 - var51) * 0.5F;
                  float var54 = var46 - 2 + (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI - var52) * 0.5F;
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                     var53, var54, var51, var52, var49, this.k() * 0.6F
                  );
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
                  float var55 = var47 + (var19 - 10) * 0.5F;
                  float var56 = var46 + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI * 0.5F;
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(var55, var56);
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(var43, var43);
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(-var55, -var56);
                  float var57 = var47 + this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
                  float var58 = var46
                     + (
                           this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                              - this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
                        )
                        * 0.5F
                     - 2.0F;
                  me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var59 = var38
                     ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .t()
                     : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .q();
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                     var57,
                     var58,
                     this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
                     this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
                     var59,
                     3.0F
                  );
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                     var57,
                     var58,
                     this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
                     this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
                     1.0F,
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .y(),
                     3.0F
                  );
                  boolean var80 = var38;
                  if (var6 != null) {
                     if (var38) {
                        float var60 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII * 0.6F;
                        float var61 = var57 + (this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII - var60) * 0.5F;
                        float var62 = var58 + (this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII - var60) * 0.5F;
                        me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .a(
                              var61 + var60 * 0.2F,
                              var62 + var60 * 0.5F,
                              var61 + var60 * 0.4F,
                              var62 + var60 * 0.7F,
                              2.0F,
                              IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .a()
                           );
                        me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .a(
                              var61 + var60 * 0.4F,
                              var62 + var60 * 0.7F,
                              var61 + var60 * 0.8F,
                              var62 + var60 * 0.3F,
                              2.0F,
                              IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .a()
                           );
                     }

                     var80 = var38;
                  }

                  me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var66 = var80
                     ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a()
                     : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .b();
                  me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, var37, var47
                        + this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
                        + this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
                        + this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI, var46 + 4, var66, false, 16, null);
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
                  var81 = var48;
                  label127:
                  if (var6 != null) {
                     if (var48 != 0) {
                        float var94;
                        var81 = (var94 = var5 - (var2.d() + 100)) == 0.0F ? 0 : (var94 < 0.0F ? -1 : 1);
                        if (var6 == null) {
                           break label127;
                        }

                        if (var81 > 0) {
                           llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .a(true);
                           final int var35f = var35;
                           var7 = new llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl() {
                              @Override
                              public void e() {
                                 lllIIIlIIIlllIlllIlllIllllIIllIlIlIlIIllIIllIlllllIIlllIIIllIlIIIIllIlIlIIlIIllIlllII.this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                                    .f(var35f);
                              }
                           };
                        }
                     }

                     var81 = var34
                        + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                        + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
                  }

                  var34 = var81;
               }

               var35++;
               if (var6 == null) {
                  break;
               }
            }

            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .i();
         }

         float var95;
         var77 = (var95 = var15 - 0.0F) == 0.0F ? 0 : (var95 < 0.0F ? -1 : 1);
      }

      if (var6 != null) {
         var77 = ((Boolean)var77) ? Math.max((int)(var23 - 15 + var27 + 15), var22) : var22;
      }

      int var65 =((Integer)( var77));
      return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(var65, var7);
   }

   @NotNull
   @Override
   public IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll c() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
      int[] var7 = lIlllIIlIllIlIlIIlllIllIlIIllIIIlllllIlIIlIIlllllIIlllIIllIlIIIlIlllIlIllIllIIIlIIlIl.l();
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

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[9];
      int var3 = 0;
      String var2 = "\u0089Gcyð\u001fR\u000b\nÂó?\u007fµÅ«\rÌ0\u0002\u009b\u0097\nî0©\u008cKÂ\u0093\u0001\u00941\u0005\u00adÛÅåP\u0013\u0097Ç\bx¡#Ã¤JA¸¢u¼\t\u0002\u000bó\u0082\u0004²\u0012\u0084\u0089";
      int var4 = "\u0089Gcyð\u001fR\u000b\nÂó?\u007fµÅ«\rÌ0\u0002\u009b\u0097\nî0©\u008cKÂ\u0093\u0001\u00941\u0005\u00adÛÅåP\u0013\u0097Ç\bx¡#Ã¤JA¸¢u¼\t\u0002\u000bó\u0082\u0004²\u0012\u0084\u0089"
         .length();
      char var1 = 7;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 12;
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
                     case 0 -> 78;
                     case 1 -> 23;
                     case 2 -> 127;
                     case 3 -> 67;
                     case 4 -> 109;
                     case 5 -> 65;
                     default -> 79;
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
                     d = var5;
                     e = new String[9];
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new lllIIIlIIIlllIlllIlllIllllIIllIlIlIlIIllIIllIlllllIIlllIIIllIlIIIIllIlIlIIlIIllIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
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

                  var2 = "×¸\u0003\u0087@\u008d";
                  var4 = "×¸\u0003\u0087@\u008d".length();
                  var1 = 2;
                  var8 = -1;
            }

            var10000 = 14;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 11023) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 211;
            case 1 -> 162;
            case 2 -> 58;
            case 3 -> 160;
            case 4 -> 120;
            case 5 -> 178;
            case 6 -> 33;
            case 7 -> 26;
            case 8 -> 183;
            case 9 -> 81;
            case 10 -> 35;
            case 11 -> 166;
            case 12 -> 197;
            case 13 -> 251;
            case 14 -> 151;
            case 15 -> 220;
            case 16 -> 140;
            case 17 -> 96;
            case 18 -> 207;
            case 19 -> 43;
            case 20 -> 104;
            case 21 -> 153;
            case 22 -> 49;
            case 23 -> 111;
            case 24 -> 69;
            case 25 -> 61;
            case 26 -> 4;
            case 27 -> 24;
            case 28 -> 75;
            case 29 -> 110;
            case 30 -> 53;
            case 31 -> 103;
            case 32 -> 212;
            case 33 -> 156;
            case 34 -> 229;
            case 35 -> 237;
            case 36 -> 122;
            case 37 -> 173;
            case 38 -> 12;
            case 39 -> 254;
            case 40 -> 164;
            case 41 -> 68;
            case 42 -> 177;
            case 43 -> 200;
            case 44 -> 106;
            case 45 -> 91;
            case 46 -> 170;
            case 47 -> 48;
            case 48 -> 193;
            case 49 -> 128;
            case 50 -> 147;
            case 51 -> 21;
            case 52 -> 198;
            case 53 -> 66;
            case 54 -> 131;
            case 55 -> 71;
            case 56 -> 85;
            case 57 -> 29;
            case 58 -> 125;
            case 59 -> 101;
            case 60 -> 133;
            case 61 -> 18;
            case 62 -> 252;
            case 63 -> 165;
            case 64 -> 234;
            case 65 -> 242;
            case 66 -> 192;
            case 67 -> 87;
            case 68 -> 172;
            case 69 -> 187;
            case 70 -> 8;
            case 71 -> 67;
            case 72 -> 22;
            case 73 -> 163;
            case 74 -> 144;
            case 75 -> 136;
            case 76 -> 6;
            case 77 -> 203;
            case 78 -> 205;
            case 79 -> 230;
            case 80 -> 253;
            case 81 -> 102;
            case 82 -> 190;
            case 83 -> 194;
            case 84 -> 255;
            case 85 -> 39;
            case 86 -> 233;
            case 87 -> 146;
            case 88 -> 223;
            case 89 -> 32;
            case 90 -> 236;
            case 91 -> 161;
            case 92 -> 90;
            case 93 -> 9;
            case 94 -> 55;
            case 95 -> 65;
            case 96 -> 227;
            case 97 -> 202;
            case 98 -> 77;
            case 99 -> 199;
            case 100 -> 235;
            case 101 -> 222;
            case 102 -> 25;
            case 103 -> 62;
            case 104 -> 221;
            case 105 -> 47;
            case 106 -> 115;
            case 107 -> 94;
            case 108 -> 19;
            case 109 -> 98;
            case 110 -> 231;
            case 111 -> 186;
            case 112 -> 27;
            case 113 -> 169;
            case 114 -> 13;
            case 115 -> 184;
            case 116 -> 82;
            case 117 -> 100;
            case 118 -> 60;
            case 119 -> 41;
            case 120 -> 241;
            case 121 -> 247;
            case 122 -> 2;
            case 123 -> 70;
            case 124 -> 126;
            case 125 -> 76;
            case 126 -> 238;
            case 127 -> 114;
            case 128 -> 217;
            case 129 -> 124;
            case 130 -> 214;
            case 131 -> 11;
            case 132 -> 37;
            case 133 -> 218;
            case 134 -> 215;
            case 135 -> 51;
            case 136 -> 34;
            case 137 -> 139;
            case 138 -> 181;
            case 139 -> 249;
            case 140 -> 112;
            case 141 -> 134;
            case 142 -> 246;
            case 143 -> 239;
            case 144 -> 86;
            case 145 -> 224;
            case 146 -> 56;
            case 147 -> 201;
            case 148 -> 175;
            case 149 -> 89;
            case 150 -> 196;
            case 151 -> 80;
            case 152 -> 244;
            case 153 -> 36;
            case 154 -> 7;
            case 155 -> 109;
            case 156 -> 171;
            case 157 -> 14;
            case 158 -> 30;
            case 159 -> 92;
            case 160 -> 243;
            case 161 -> 137;
            case 162 -> 226;
            case 163 -> 28;
            case 164 -> 108;
            case 165 -> 143;
            case 166 -> 78;
            case 167 -> 3;
            case 168 -> 121;
            case 169 -> 245;
            case 170 -> 191;
            case 171 -> 73;
            case 172 -> 57;
            case 173 -> 182;
            case 174 -> 188;
            case 175 -> 148;
            case 176 -> 142;
            case 177 -> 129;
            case 178 -> 155;
            case 179 -> 174;
            case 180 -> 179;
            case 181 -> 185;
            case 182 -> 16;
            case 183 -> 45;
            case 184 -> 240;
            case 185 -> 15;
            case 186 -> 138;
            case 187 -> 20;
            case 188 -> 228;
            case 189 -> 232;
            case 190 -> 119;
            case 191 -> 38;
            case 192 -> 59;
            case 193 -> 1;
            case 194 -> 176;
            case 195 -> 141;
            case 196 -> 135;
            case 197 -> 107;
            case 198 -> 64;
            case 199 -> 145;
            case 200 -> 149;
            case 201 -> 79;
            case 202 -> 52;
            case 203 -> 74;
            case 204 -> 167;
            case 205 -> 127;
            case 206 -> 168;
            case 207 -> 219;
            case 208 -> 123;
            case 209 -> 118;
            case 210 -> 213;
            case 211 -> 152;
            case 212 -> 50;
            case 213 -> 248;
            case 214 -> 105;
            case 215 -> 31;
            case 216 -> 116;
            case 217 -> 42;
            case 218 -> 72;
            case 219 -> 23;
            case 220 -> 250;
            case 221 -> 195;
            case 222 -> 44;
            case 223 -> 154;
            case 224 -> 216;
            case 225 -> 46;
            case 226 -> 208;
            case 227 -> 54;
            case 228 -> 209;
            case 229 -> 95;
            case 230 -> 130;
            case 231 -> 189;
            case 232 -> 158;
            case 233 -> 88;
            case 234 -> 113;
            case 235 -> 5;
            case 236 -> 117;
            case 237 -> 40;
            case 238 -> 97;
            case 239 -> 206;
            case 240 -> 83;
            case 241 -> 63;
            case 242 -> 225;
            case 243 -> 157;
            case 244 -> 93;
            case 245 -> 159;
            case 246 -> 84;
            case 247 -> 180;
            case 248 -> 150;
            case 249 -> 17;
            case 250 -> 210;
            case 251 -> 10;
            case 252 -> 132;
            case 253 -> 0;
            case 254 -> 99;
            default -> 204;
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

         e[var2] = new String(var3).intern();
      }

      return e[var2];
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX obfuscator: original was the Kotlin synthetic marker ctor; jar descriptor (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
           this();
        }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }

   public boolean a(net.minecraft.client.gui.GuiGraphicsExtractor p1, int p2, int p3, float p4, float p5, float p6, float p7) {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(p1, p2, p3, p4, p5, p6, p7);
   }
   public boolean a(net.minecraft.client.gui.GuiGraphicsExtractor p1, int p2, int p3, int p4, int p5, float p6) {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(p1, p2, p3, p4, p5, p6);
   }
   public boolean b(net.minecraft.client.gui.GuiGraphicsExtractor p1, int p2, int p3, int p4, int p5, float p6) {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b(p1, p2, p3, p4, p5, p6);
   }
   public boolean j() {
      return lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.super.j();
   }
   public float a() {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a();
   }
   public float h() {
      return lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.super.h();
   }
   public int a(float p1) {
      return lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.super.a(p1);
   }
   public int a(float p1, int p2) {
      return lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.super.a(p1, p2);
   }
   public int a(me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll p1) {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(p1);
   }
   public int b() {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b();
   }
   public me.octo.client.lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll g() {
      return lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.super.g();
   }
   public static final me.octo.client.IlIIIIIllIlIIlllIIIllIlllllIIIlllIIIlIlIllIlIllIllIllllIllIIlllIllIllllIIIlIIIIllllll a(me.octo.client.lllIIIlIIIlllIlllIlllIllllIIllIlIlIlIIllIIllIlllllIIlllIIIllIlIIIIllIlIlIIlIIllIlllII p1) {
      return p1.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }
   public void a(char p1, int p2) {
      IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(p1, p2);
   }
   public void a(net.minecraft.client.gui.GuiGraphicsExtractor p1, float p2, float p3, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll p4) {
      lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.super.a(p1, p2, p3, p4);
   }
   public void d() {
      IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.d();
   }
   public void i() {
      lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.super.i();
   }
   static java.lang.String a(me.octo.client.lllIIIlIIIlllIlllIlllIllllIIllIlIlIlIIllIIllIlllllIIlllIIIllIlIIIIllIlIlIIlIIllIlllII p1, float p2, int p3, java.lang.Object p4) {
      if ((p3 & 1) != 0) p2 = 1F;
      return p1.d(p2);
   }
}
