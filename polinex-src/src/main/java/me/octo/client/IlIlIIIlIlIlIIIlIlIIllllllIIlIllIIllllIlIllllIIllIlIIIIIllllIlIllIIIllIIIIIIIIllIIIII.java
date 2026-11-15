package me.octo.client;

import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;

public final class IlIlIIIlIlIlIIIlIlIIllllllIIlIllIIllllIlIllllIIllIlIIIIIllllIlIllIIIllIIIIIIIIllIIIII
   implements lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI,
   IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl {
   @NotNull
   public static IlIlIIIlIlIlIIIlIlIIllllllIIlIllIIllllIlIllllIIllIlIIIIIllllIlIllIIIllIIIIIIIIllIIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
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
   private final int llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   public static float IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static String[] d;
   private static String[] e;

   public IlIlIIIlIlIlIIIlIlIIllllllIIlIllIIllllIlIllllIIllIlIIIIIllllIlIllIIIllIIIIIIIIllIIIII(
      @NotNull IlIIIIIllIlIIlllIIIllIlllllIIIlllIIIlIlIllIlIllIllIllllIllIIlllIllIllllIIIlIIIIllllll var1
   ) {
      String[] var10000 = lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      short var10002 = 7395;
      short var10003 = -7781;
      Intrinsics.checkNotNullParameter(var1, "setting");
      super();
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 24;
      String[] var2 = var10000;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 2;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = 110;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 20;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 26.0F;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = 12.0F;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 6.0F;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = "";
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 100L;
      String[] var3 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.G();
      String[] var5 = var3;
      int var17 = var3.length;
      if (var2 != null) {
         var17 = var17 == 0 ? 1 : 0;
      }

      Double var18;
      if (var17 != 0) {
         var18 = null;
      } else {
         String var6 = var3[0];
         boolean var7 = false;
         double var8 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll, var6, false, 2, null)
            + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
            + this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            + this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI * 2;
         int var10 = 1;
         int var11 = ArraysKt.getLastIndex(var3);
         if (var10 <= var11) {
            do {
               String var12 = var5[var10];
               boolean var13 = false;
               double var14 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll, var12, false, 2, null)
                  + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
                  + this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
                  + this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI * 2;
               var8 = Math.max(var8, var14);
               if (var10 == var11) {
                  break;
               }

               var10++;
            } while (var2 != null);
         }

         var18 = var8;
      }

      int var19;
      label27: {
         Double var4 = var18;
         Double var10001 = var4;
         if (var2 != null) {
            if (var4 == null) {
               var19 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
               break label27;
            }

            var10001 = var4;
         }

         var19 = (int)var10001.doubleValue();
      }

      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var19;
   }

   private final float k() {
      return IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .aq();
   }

   @NotNull
   @Override
   public String f() {
      String var10000 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.Z();
      short var10001 = 7399;
      short var10002 = 12083;
      return var10000 + "_multibool_dropdown";
   }

   private final float b(float var1) {
      float var2 = var1 - 1.0F;
      return 1.0F + var2 * var2 * var2;
   }

   private final float c(float var1) {
      float var2 = var1 * var1 * (3.0F - 2.0F * var1);
      return 0.7F + 0.3F * var2;
   }

   private final String d(float var1) {
      String[] var10000 = lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      List var3 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.I();
      String[] var2 = var10000;
      int var8 = ((var3.isEmpty()) ? 1 : 0);
      if (var2 != null) {
         if (var8 != 0) {
            short var15 = 7398;
            short var19 = 26934;
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
            float var23;
            int var9 = (var23 = var1 - 0.3F) == 0.0F ? 0 : (var23 < 0.0F ? -1 : 1);
            if (var2 != null) {
               var9 = var9 < 0 ? Math.min(2, var3.size()) : var3.size();
            }

            int var4 = var9;
            Iterable var10 = CollectionsKt.take(var3, var4);
            var10001 = 7402;
            short var10002 = 12264;
            return CollectionsKt.joinToString(var10, ", ", null, null, 0, null, null);
         }

         float var24;
         var8 = (var24 = var1 - 0.3F) == 0.0F ? 0 : (var24 < 0.0F ? -1 : 1);
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
         short var17 = 7396;
         short var20 = 7316;
         String var13 = CollectionsKt.joinToString(var12, ", ", null, null, 0, null, null);
         var20 = 7393;
         short var10003 = 32108;
         var11 = var13 + " + " + var6;
      } else {
         Iterable var14 = var5;
         short var18 = 7396;
         short var22 = 7316;
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
      int var97 = 0; // PX-FIX
      Object var93 = null; // PX-FIX
      Object var91 = null; // PX-FIX
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var87 = null; // PX-FIX
      String[] var6;
      llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl var7;
      float var81;
      label221: {
         short var10001 = 7394;
         short var10002 = 7250;
         Intrinsics.checkNotNullParameter(var1, "drawContext");
         String[] var10000 = lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
         var10002 = 7400;
         short var10003 = 31599;
         Intrinsics.checkNotNullParameter(var2, "resolution");
         var6 = var10000;
         var7 = null;
         long var79 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         long var98 = 0L;
         if (var6 != null) {
            if (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl <= 0L) {
               var81 = 1.0F;
               break label221;
            }

            var79 = System.currentTimeMillis();
            var98 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         }

         long var9 = var79 - var98;
         long var80 = var9;
         if (var6 != null) {
            if (var9 >= this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll) {
               this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 0L;
               var81 = 1.0F;
               break label221;
            }

            var80 = var9;
         }

         var81 = (float)var80 / (float)this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      }

      float var8 = var81;
      int var71 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.I().hashCode();
      if (var71 != this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) {
         String var10 = this.d(1.0F);
         int var99 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.length();
         if (var6 != null) {
            var99 = var99 == 0 ? 1 : 0;
         }

         this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var99 != 0
            ? (int)(
               me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll, var10, false, 2, null)
                  + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
            )
            : (int)(
               me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll, this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, false, 2, null)
                  + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
            );
         this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var71;
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = this.d(1.0F);
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = System.currentTimeMillis();
      }

      String var72 = this.d(var8);
      double var11 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll, var72, false, 2, null)
         + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      float var13 = this.b(var8);
      int var14 = (int)me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.c(
         (float)this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI, (float)var11, var13
      );
      float var15 = this.h();
      float var16 = this.b(var15);
      int var17 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, var14 + 16);
      int var18 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(var17, this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI);
      float var109;
      int var82 = (var109 = var15 - 0.0F) == 0.0F ? 0 : (var109 < 0.0F ? -1 : 1);
      if (var6 != null) {
         var82 = var82 > 0 ? var18 : var17;
      }

      int var19 = var82;
      int var20 = (int)var2.e() - 20;
      int var21 = var20 - var19;
      int var22 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.a(var1, (int)var2.c(), var3, var21 - 10);
      int var83 = (var22 - var3 >> 1) + var3 - 4;
      int var100 = ((this.c() instanceof IIIIlIlIllIIllIlllllIlIlIlIlllllIIIllIIlIIIlIlIIIIIlllIlllIlIllllllIIllIIlIIlIlIlIIll) ? 1 : 0);
      if (var6 != null) {
         var100 = var100 != 0 ? 4 : 0;
      }

      int var23;
      String[] var24;
      int var26;
      label203: {
         var23 = var83 + var100;
         var24 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.G();
         int var25 = var24.length;
         var26 = var25
               * (
                  this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                     + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
               )
            + 8;
         var81 = var15;
         float var101 = 0.0F;
         if (var6 != null) {
            if (!(var15 > 0.0F)) {
               var81 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
               break label203;
            }

            var81 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
            var101 = var26 * var16;
         }

         var81 += var101;
      }

      float var27;
      label197: {
         label196: {
            var27 = var81;
            byte var28 = ((byte)((this.a(var4, var5, var21 - 8, var23 - 13, var21 + var19 + 8, (int)(var23 - 13 + var27))) ? 1 : 0));
            int var86 = var28;
            if (var6 != null) {
               if (var28 == 0) {
                  break label196;
               }

               float var110;
               var86 = (var110 = var15 - 0.1F) == 0.0F ? 0 : (var110 < 0.0F ? -1 : 1);
            }

            if (var86 < 0) {
               var87 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .C();
               break label197;
            }
         }

         var87 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .B();
      }

      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var29 = var87;
      final float var30 = var21 - 8;
      final float var31 = var23 - 13;
      float var32 = var19 + 16;
      float var111;
      int var88 = (var111 = var15 - 0.01F) == 0.0F ? 0 : (var111 < 0.0F ? -1 : 1);
      if (var6 != null) {
         if (var88 > 0) {
            me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
               me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               var30,
               var31,
               var32,
               var27,
               this.k(),
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ah(),
               var15 * 0.55F,
               4.0F);
         }

         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var30, var31, var32, var27, var29, this.k()
         );
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var30,
            var31,
            var32,
            var27,
            1.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .y(),
            this.k()
         );
         me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var89 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         String var102 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.Z();
         short var106 = 7397;
         short var107 = 25823;
         var89.a("mbmain:" + var102, var30, var31, var32, var27, this.k());
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll, var72, var21, var23 - 7.0, IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(), false, 16, null);
         this.a(
            var1,
            (float)(var21 + var19 - 12),
            (float)var23,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .F()
         );
         var88 = ((this.a(var4, var5, var21 - 8, var23 - 13, var21 + var19 + 8, var23 + 13)) ? 1 : 0);
      }

      label223: {
         int var33 = var88;
         int var90 = var33;
         if (var6 != null) {
            if (var33 == 0) {
               break label223;
            }

            float var112;
            var90 = (var112 = var5 - (var2.d() + 5)) == 0.0F ? 0 : (var112 < 0.0F ? -1 : 1);
         }

         if (var6 != null) {
            if (var90 <= 0) {
               break label223;
            }

            llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(true);
            var90 = var4;
         }

         final float var34 = var90;
         float var35 = var5;
         var7 = new llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl() {
            private static String b;

            @Override
            public void e() {
               IlIlIIIlIlIlIIIlIlIIllllllIIlIllIIllllIlIllllIIllIlIIIIIllllIlIllIIIllIIIIIIIIllIIIII.this.i();
               float var1x = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(var32, 26.0F, var34, var35, var30, var31)
                  + 6.0F;
               me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
                  me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                  b
                     + IlIlIIIlIlIlIIIlIlIIllllllIIlIllIIllllIlIllllIIllIlIIIIIllllIlIllIIIllIIIIIIIIllIIIII.this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        .Z(),
                  var34,
                  var35,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .ah()
                     .a(140),
                  var1x,
                  0L);
            }

            // $VF: Irreducible bytecode was duplicated to produce valid code
            static {
               pxClinit: {
               char[] var10003x = "\u0004\u0014R'<Q\r".toCharArray();
               int var10004 = var10003x.length;
               int var0 = 0;
               byte var6x = 74;
               char[] var10002x = var10003x;
               int var1x = var10004;
               byte var10;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003x;
                  var10 = 74;
                  var10006 = var0;
               } else {
                  var6x = 74;
                  var1x = var10004;
                  if (var10004 <= var0) {
                     String var9 = new String(var10003x).intern();
                     byte var4x = -1;
                     b = var9;
                     break pxClinit;
                  }

                  var10005 = var10003x;
                  var10 = 74;
                  var10006 = var0;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
                     case 0 -> 35;
                     case 1 -> 60;
                     case 2 -> 117;
                     case 3 -> 12;
                     case 4 -> 31;
                     case 5 -> 117;
                     default -> 125;
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
         };
      }

      float var113;
      var91 = (var113 = var15 - 0.01F) == 0.0F ? 0 : (var113 < 0.0F ? -1 : 1);
      label176:
      if (var6 != null) {
         if ((me.octo.client.PxTruth.truth(var91))) {
            int var73 = var23 + 16;
            float var75 = var26 * var16;
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a((float)(var21 - 6), (float)(var73 - 2), (float)(var19 + 12), var75 + 4.0F);
            boolean[] var36 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.H();
            int var37 = var73;
            int var38 = 0;
            int var39 = var24.length;

            while (var38 < var39) {
               label234: {
                  String var40 = var24[var38];
                  boolean var41 = var36[var38];
                  float var42 = var38 * 0.05F;
                  float var43 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .c(
                        0.0F,
                        me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .b(1.0F, (var15 - var42) / (1.0F - var42))
                     );
                  float var44 = this.b(var43);
                  var81 = var43;
                  float var103 = 0.02F;
                  if (var6 != null) {
                     float var114;
                     var91 = (var114 = var43 - 0.02F) == 0.0F ? 0 : (var114 < 0.0F ? -1 : 1);
                     if (var6 == null) {
                        break label176;
                     }

                     if ((me.octo.client.PxTruth.truth(var91))) {
                        var37 += this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                           + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
                        if (var6 != null) {
                           break label234;
                        }

                        me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
                           new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[5]
                        );
                     }

                     var81 = var44 * var44;
                     var103 = var44;
                  }

                  float var45;
                  float var46;
                  int var49;
                  int var50;
                  label159: {
                     label228: {
                        var45 = var81 * var103;
                        var46 = this.c(var43);
                        float var47 = (1.0F - var44) * (1.0F - var44) * 12.0F;
                        float var48 = (1.0F - var44) * 2.0F;
                        var49 = var37 + (int)var48;
                        var50 = var21 + (int)var47;
                        var93 = this.a(
                           var4,
                           var5,
                           var50 - 4,
                           var49 - 2,
                           var50 + var19 - 4,
                           var49 + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                        );
                        if (var6 != null) {
                           if ((me.octo.client.PxTruth.truth(var93))) {
                              break label228;
                           }

                           float var115;
                           var93 = (var115 = var15 - 0.8F) == 0.0F ? 0 : (var115 < 0.0F ? -1 : 1);
                        }

                        if (var6 == null) {
                           break label159;
                        }

                        if ((me.octo.client.PxTruth.truth(var93))) {
                           var93 = 1;
                           break label159;
                        }
                     }

                     var93 = 0;
                  }

                  int var51 =((Integer)( var93));
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(var45);
                  me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var52 = var51 != 0
                     ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .E()
                     : new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(0, 0, 0, 0);
                  float var53 = var19 - 8;
                  final float var54 = var53 * var46;
                  final float var55 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI * var46;
                  final float var56 = var50 - 4 + (var53 - var54) * 0.5F;
                  final float var57 = var49 - 2 + (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI - var55) * 0.5F;
                  int var94 = var52.d();
                  if (var6 != null) {
                     if (var94 > 0) {
                        me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                           var56, var57, var54, var55, var52, this.k() * 0.6F
                        );
                     }

                     me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var95 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                     String var104 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.Z();
                     short var108 = 7403;
                     byte var10004 = 125;
                     var95.a("mbitem:" + var104 + ":" + var38, var56, var57, var54, var55, this.k() * 0.6F);
                     me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
                     var94 = var50;
                  }

                  float var58 = var94 + (var19 - 8) * 0.5F;
                  float var59 = var49 + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI * 0.5F;
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(var58, var59);
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(var46, var46);
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(-var58, -var59);
                  float var60 = var50 + this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
                  float var61 = var49
                     + (
                           this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                              - this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
                        )
                        * 0.5F
                     - 1.0F;
                  me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var62 = var41
                     ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .t()
                     : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .q();
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                     var60,
                     var61,
                     this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
                     this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
                     var62,
                     3.0F
                  );
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                     var60,
                     var61,
                     this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
                     this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
                     1.0F,
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .y(),
                     3.0F
                  );
                  boolean var96 = var41;
                  if (var6 != null) {
                     if (var41) {
                        float var63 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII * 0.65F;
                        float var64 = var60 + (this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII - var63) * 0.5F;
                        float var65 = var61 + (this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII - var63) * 0.5F;
                        me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .a(
                              var64 + var63 * 0.15F,
                              var65 + var63 * 0.5F,
                              var64 + var63 * 0.4F,
                              var65 + var63 * 0.75F,
                              1.5F,
                              IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .a()
                           );
                        me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .a(
                              var64 + var63 * 0.4F,
                              var65 + var63 * 0.75F,
                              var64 + var63 * 0.85F,
                              var65 + var63 * 0.25F,
                              1.5F,
                              IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .a()
                           );
                     }

                     var96 = var41;
                  }

                  me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var76 = var96
                     ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a()
                     : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .b();
                  me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll, var40, var50
                        + this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
                        + this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
                        + this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI, var49 + 4, var76, false, 16, null);
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
                  var97 = var51;
                  label140:
                  if (var6 != null) {
                     if (var51 != 0) {
                        float var116;
                        var97 = (var116 = var5 - (var2.d() + 5)) == 0.0F ? 0 : (var116 < 0.0F ? -1 : 1);
                        if (var6 == null) {
                           break label140;
                        }

                        if (var97 > 0) {
                           llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .a(true);
                           final float var77 = var4;
                           final float var78 = var5;
                           final var var38f = var38; // PX-FIX: 匿名类捕获 final 副本
                           var7 = new llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl() {
                              private static String b;

                              @Override
                              public void e() {
                                 IlIlIIIlIlIlIIIlIlIIllllllIIlIllIIllllIlIllllIIllIlIIIIIllllIlIllIIIllIIIIIIIIllIIIII.this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                                    .f(var38f);
                                 float var1 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                       .a(var54, var55, var77, var78, var56, var57)
                                    + 4.0F;
                                 me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .a(
                                       b
                                          + IlIlIIIlIlIlIIIlIlIIllllllIIlIllIIllllIlIllllIIllIlIIIIIllllIlIllIIIllIIIIIIIIllIIIII.this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                                             .Z()
                                          + ":"
                                          + var38f,
                                       var77,
                                       var78,
                                       IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                          .ah()
                                          .a(170),
                                       var1,
                                       420L
                                    );
                              }

                              // $VF: Irreducible bytecode was duplicated to produce valid code
                              static {
                                 pxClinit: {
                                 char[] var10003 = "dq`6X~L".toCharArray();
                                 int var10004 = var10003.length;
                                 int var0 = 0;
                                 byte var6 = 59;
                                 char[] var10002 = var10003;
                                 int var1 = var10004;
                                 byte var10;
                                 char[] var10005;
                                 int var10006;
                                 if (var10004 <= 1) {
                                    var10005 = var10003;
                                    var10 = 59;
                                    var10006 = var0;
                                 } else {
                                    var6 = 59;
                                    var1 = var10004;
                                    if (var10004 <= var0) {
                                       String var9 = new String(var10003).intern();
                                       byte var4 = -1;
                                       b = var9;
                                       break pxClinit;
                                    }

                                    var10005 = var10003;
                                    var10 = 59;
                                    var10006 = var0;
                                 }

                                 while (true) {
                                    var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
                                       case 0 -> 50;
                                       case 1 -> 40;
                                       case 2 -> 50;
                                       case 3 -> 121;
                                       case 4 -> 6;
                                       case 5 -> 40;
                                       default -> 77;
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
                     }

                     var97 = var37
                        + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                        + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
                  }

                  var37 = var97;
               }

               var38++;
               if (var6 == null) {
                  break;
               }
            }

            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .i();
         }

         float var117;
         var91 = (var117 = var15 - 0.0F) == 0.0F ? 0 : (var117 < 0.0F ? -1 : 1);
      }

      if (var6 != null) {
         var91 = (me.octo.client.PxTruth.truth(var91)) ? Math.max((int)(var23 - 13 + var27 + 12), var22) : var22;
      }

      int var74 =((Integer)( var91));
      return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(var74, var7);
   }

   @Override
   public int a(@NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var1) {
      String[] var2;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll var6;
      label37: {
         String[] var10000 = lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
         short var10002 = 7392;
         short var10003 = -30425;
         Intrinsics.checkNotNullParameter(var1, "resolution");
         var2 = var10000;
         IlIIIIIllIlIIlllIIIllIlllllIIIlllIIIlIlIllIlIllIllIllllIllIIlllIllIllllIIIlIIIIllllll var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         IlIIIIIllIlIIlllIIIllIlllllIIIlllIIIlIlIllIlIllIllIllllIllIIlllIllIllllIIIlIIIIllllll var5 = var4;
         if (var2 != null) {
            if (!(var4 instanceof IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll)) {
               var6 = null;
               break label37;
            }

            var5 = var4;
         }

         var6 = (IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll)var5;
      }

      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll var3 = var6;
      var6 = var3;
      if (var2 != null) {
         if (var3 == null) {
            return 30;
         }

         var6 = var3;
      }

      int var8 = var6.ab().length();
      if (var2 != null) {
         var8 = var8 > 0 ? 1 : 0;
      }

      return var8 != 0 ? 40 : 30;
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
      String[] var7 = lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
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
      String[] var5 = new String[11];
      int var3 = 0;
      String var2 = "@@\u0091\u0080x®Ûo\u0016\u007f¼\u000755ßØ,Ç7\nK²63óÙzÅq\u0082\u0003v\u0000Ú\u0004êt¤ª\u0013Í¿h\u0098æÓÕ\u001dP]\u0014j\f[\u0081&1\u0098\u008e\u0002Ã\u000b\u0007\u0093]Ï'\u0014\u008fm\u0002\u008f\u0016";
      int var4 = "@@\u0091\u0080x®Ûo\u0016\u007f¼\u000755ßØ,Ç7\nK²63óÙzÅq\u0082\u0003v\u0000Ú\u0004êt¤ª\u0013Í¿h\u0098æÓÕ\u001dP]\u0014j\f[\u0081&1\u0098\u008e\u0002Ã\u000b\u0007\u0093]Ï'\u0014\u008fm\u0002\u008f\u0016"
         .length();
      char var1 = 11;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 5;
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
                     case 0 -> 77;
                     case 1 -> 1;
                     case 2 -> 28;
                     case 3 -> 70;
                     case 4 -> 98;
                     case 5 -> 37;
                     default -> 120;
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
                     e = new String[11];
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new IlIlIIIlIlIlIIIlIlIIllllllIIlIllIIllllIlIllllIIllIlIIIIIllllIlIllIIIllIIIIIIIIllIIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
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

                  var2 = "Â\f©P\u0018\u009d)\nÐ\u0097\rßÜ\f×7\u008c\u0094";
                  var4 = "Â\f©P\u0018\u009d)\nÐ\u0097\rßÜ\f×7\u008c\u0094".length();
                  var1 = 7;
                  var8 = -1;
            }

            var10000 = 69;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 7394) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 160;
            case 1 -> 209;
            case 2 -> 225;
            case 3 -> 182;
            case 4 -> 66;
            case 5 -> 192;
            case 6 -> 145;
            case 7 -> 226;
            case 8 -> 230;
            case 9 -> 94;
            case 10 -> 108;
            case 11 -> 128;
            case 12 -> 191;
            case 13 -> 117;
            case 14 -> 45;
            case 15 -> 20;
            case 16 -> 201;
            case 17 -> 123;
            case 18 -> 164;
            case 19 -> 147;
            case 20 -> 0;
            case 21 -> 62;
            case 22 -> 163;
            case 23 -> 49;
            case 24 -> 71;
            case 25 -> 249;
            case 26 -> 140;
            case 27 -> 44;
            case 28 -> 38;
            case 29 -> 3;
            case 30 -> 63;
            case 31 -> 115;
            case 32 -> 159;
            case 33 -> 5;
            case 34 -> 234;
            case 35 -> 127;
            case 36 -> 67;
            case 37 -> 82;
            case 38 -> 165;
            case 39 -> 173;
            case 40 -> 107;
            case 41 -> 26;
            case 42 -> 125;
            case 43 -> 88;
            case 44 -> 96;
            case 45 -> 203;
            case 46 -> 37;
            case 47 -> 122;
            case 48 -> 130;
            case 49 -> 134;
            case 50 -> 30;
            case 51 -> 144;
            case 52 -> 238;
            case 53 -> 228;
            case 54 -> 19;
            case 55 -> 111;
            case 56 -> 142;
            case 57 -> 120;
            case 58 -> 95;
            case 59 -> 105;
            case 60 -> 98;
            case 61 -> 40;
            case 62 -> 78;
            case 63 -> 18;
            case 64 -> 135;
            case 65 -> 24;
            case 66 -> 168;
            case 67 -> 167;
            case 68 -> 33;
            case 69 -> 32;
            case 70 -> 211;
            case 71 -> 12;
            case 72 -> 196;
            case 73 -> 255;
            case 74 -> 251;
            case 75 -> 6;
            case 76 -> 35;
            case 77 -> 118;
            case 78 -> 129;
            case 79 -> 112;
            case 80 -> 244;
            case 81 -> 199;
            case 82 -> 22;
            case 83 -> 136;
            case 84 -> 172;
            case 85 -> 231;
            case 86 -> 80;
            case 87 -> 200;
            case 88 -> 8;
            case 89 -> 124;
            case 90 -> 183;
            case 91 -> 153;
            case 92 -> 61;
            case 93 -> 176;
            case 94 -> 195;
            case 95 -> 149;
            case 96 -> 104;
            case 97 -> 151;
            case 98 -> 235;
            case 99 -> 2;
            case 100 -> 207;
            case 101 -> 86;
            case 102 -> 121;
            case 103 -> 181;
            case 104 -> 215;
            case 105 -> 223;
            case 106 -> 116;
            case 107 -> 64;
            case 108 -> 50;
            case 109 -> 90;
            case 110 -> 202;
            case 111 -> 76;
            case 112 -> 158;
            case 113 -> 180;
            case 114 -> 245;
            case 115 -> 48;
            case 116 -> 198;
            case 117 -> 55;
            case 118 -> 54;
            case 119 -> 242;
            case 120 -> 194;
            case 121 -> 75;
            case 122 -> 171;
            case 123 -> 186;
            case 124 -> 248;
            case 125 -> 141;
            case 126 -> 4;
            case 127 -> 193;
            case 128 -> 166;
            case 129 -> 119;
            case 130 -> 100;
            case 131 -> 39;
            case 132 -> 184;
            case 133 -> 89;
            case 134 -> 206;
            case 135 -> 174;
            case 136 -> 204;
            case 137 -> 240;
            case 138 -> 59;
            case 139 -> 237;
            case 140 -> 126;
            case 141 -> 154;
            case 142 -> 188;
            case 143 -> 252;
            case 144 -> 69;
            case 145 -> 219;
            case 146 -> 133;
            case 147 -> 81;
            case 148 -> 210;
            case 149 -> 179;
            case 150 -> 227;
            case 151 -> 87;
            case 152 -> 246;
            case 153 -> 250;
            case 154 -> 51;
            case 155 -> 60;
            case 156 -> 239;
            case 157 -> 25;
            case 158 -> 190;
            case 159 -> 11;
            case 160 -> 178;
            case 161 -> 106;
            case 162 -> 74;
            case 163 -> 131;
            case 164 -> 109;
            case 165 -> 42;
            case 166 -> 68;
            case 167 -> 216;
            case 168 -> 157;
            case 169 -> 58;
            case 170 -> 148;
            case 171 -> 132;
            case 172 -> 175;
            case 173 -> 152;
            case 174 -> 23;
            case 175 -> 155;
            case 176 -> 137;
            case 177 -> 170;
            case 178 -> 91;
            case 179 -> 222;
            case 180 -> 28;
            case 181 -> 93;
            case 182 -> 43;
            case 183 -> 114;
            case 184 -> 208;
            case 185 -> 241;
            case 186 -> 217;
            case 187 -> 31;
            case 188 -> 232;
            case 189 -> 53;
            case 190 -> 189;
            case 191 -> 97;
            case 192 -> 52;
            case 193 -> 84;
            case 194 -> 229;
            case 195 -> 243;
            case 196 -> 146;
            case 197 -> 15;
            case 198 -> 72;
            case 199 -> 253;
            case 200 -> 70;
            case 201 -> 161;
            case 202 -> 214;
            case 203 -> 17;
            case 204 -> 205;
            case 205 -> 187;
            case 206 -> 110;
            case 207 -> 10;
            case 208 -> 162;
            case 209 -> 169;
            case 210 -> 47;
            case 211 -> 7;
            case 212 -> 220;
            case 213 -> 83;
            case 214 -> 247;
            case 215 -> 57;
            case 216 -> 197;
            case 217 -> 185;
            case 218 -> 9;
            case 219 -> 41;
            case 220 -> 16;
            case 221 -> 138;
            case 222 -> 65;
            case 223 -> 212;
            case 224 -> 77;
            case 225 -> 56;
            case 226 -> 85;
            case 227 -> 139;
            case 228 -> 177;
            case 229 -> 101;
            case 230 -> 92;
            case 231 -> 73;
            case 232 -> 79;
            case 233 -> 254;
            case 234 -> 224;
            case 235 -> 36;
            case 236 -> 46;
            case 237 -> 21;
            case 238 -> 143;
            case 239 -> 150;
            case 240 -> 113;
            case 241 -> 218;
            case 242 -> 103;
            case 243 -> 34;
            case 244 -> 213;
            case 245 -> 102;
            case 246 -> 27;
            case 247 -> 99;
            case 248 -> 156;
            case 249 -> 29;
            case 250 -> 13;
            case 251 -> 14;
            case 252 -> 1;
            case 253 -> 233;
            case 254 -> 236;
            default -> 221;
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
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
       public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker var1) { this(); }
   }

    @Override
    public lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll g() {
        return lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.super.g();
    }

    @Override
    public int a(float var1) {
        return lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.super.a(var1);
    }

    @Override
    public int a(float var1, int var2) {
        return lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.super.a(var1, var2);
    }

    @Override
    public float h() {
        return lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.super.h();
    }

    @Override
    public void i() {
        lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.super.i();
    }

    @Override
    public boolean j() {
        return lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.super.j();
    }

    @Override
    public void a(GuiGraphicsExtractor var1, float var2, float var3, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4) {
        lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.super.a(var1, var2, var3, var4);
    }

    @Override
    public float a() {
        return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a();
    }

    @Override
    public int b() {
        return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b();
    }

    @Override
    public boolean a(GuiGraphicsExtractor var1, int var2, int var3, int var4, int var5, float var6) {
        return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var1, var2, var3, var4, var5, var6);
    }

    @Override
    public boolean b(GuiGraphicsExtractor var1, int var2, int var3, int var4, int var5, float var6) {
        return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b(var1, var2, var3, var4, var5, var6);
    }

    @Override
    public boolean a(GuiGraphicsExtractor var1, int var2, int var3, float var4, float var5, float var6, float var7) {
        return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var1, var2, var3, var4, var5, var6, var7);
    }

    @Override
    public void a(char var1, int var2) {
        IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var1, var2);
    }

    @Override
    public void d() {
        IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.d();
    }

    public static final IlIIIIIllIlIIlllIIIllIlllllIIIlllIIIlIlIllIlIllIllIllllIllIIlllIllIllllIIIlIIIIllllll a(IlIlIIIlIlIlIIIlIlIIllllllIIlIllIIllllIlIllllIIllIlIIIIIllllIlIllIIIllIIIIIIIIllIIIII var0) {
        return var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
    }

    static String a(IlIlIIIlIlIlIIIlIlIIllllllIIlIllIIllllIlIllllIIllIlIIIIIllllIlIllIIIllIIIIIIIIllIIIII var0, float var1, int var2, Object var3) {
        if ((var2 & 1) != 0) {
            var1 = 1.0f;
        }
        return var0.d(var1);
    }
}
