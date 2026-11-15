package me.octo.client;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.nanovg.NanoVG;

public final class lIIIlIIIIlIIIlIlIlllIlIIIlIIIIllIlIllIllIlIlIllIlIllIIllllIIllIlIlIIIIIllIllIIlllIIlI
   extends IlIlIllIlIlllIllIlIIIIllIIIIIIIIlIlllllIlIlllIIIlIllIIIllIlIIlllllIllllIIllIllllIllII {
   public static int var32 = 0; // PX-FIX (retyped int) missing field v2
   
   public static me.octo.client.PXDyn var79 = null; // PX-FIX missing field v2
   
   @NotNull
   private final IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private final Minecraft IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private List<me.octo.client.utils.lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @Nullable
   private UUID lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @Nullable
   private me.octo.client.utils.lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @Nullable
   private me.octo.client.utils.lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private final me.octo.client.utils.llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private float lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @Nullable
   private IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @Nullable
   private IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @Nullable
   private String IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private long llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @NotNull
   private final Function0<Unit> IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static String[] a;
   private static String[] b;

   public lIIIlIIIIlIIIlIlIlllIlIIIlIIIIllIlIllIllIlIlIllIlIllIIllllIIllIlIlIIIIIllIllIIlllIIlI(
      @NotNull IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll var1
   ) {
      short var10001 = -4641;
      short var10002 = -5461;
      Intrinsics.checkNotNullParameter(var1, "mainMenu");
      super();
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
      Minecraft var3 = Minecraft.getInstance();
      short var10003 = -4644;
      short var10004 = 25431;
      Intrinsics.checkNotNullExpressionValue(var3, "getInstance(...)");
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var3;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = CollectionsKt.emptyList();
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new me.octo.client.utils.llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll(
         200
      );
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = null;
      Object var10000 = null;
      var10000 = null;
      this.g();
   }

   private final void g() {
      Object var10000 = null;
      List var1 = CollectionsKt.toMutableList(Collections.emptyList());
      Object var2 = null;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = (UUID)var2;
      Comparator var3 = new lIIIlIIIIlIIIlIlIlllIlIIIlIIIIllIlIllIllIlIlIllIlIllIIllllIIllIlIlIIIIIllIllIIlllIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         (UUID)var2
      );
      CollectionsKt.sortWith(
         var1,
         new lIIIlIIIIlIIIlIlIlllIlIIIlIIIIllIlIllIllIlIlIllIlIllIIllllIIllIlIlIIIIIllIllIIlllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var3
         )
      );
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var1;
   }

   private final void a(UUID var1) {
      int[] var2 = IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.g();
      if (var2 == null) {
         if (Intrinsics.areEqual(var1, this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll)) {
            return;
         }

         Object var10000 = null;
         // PX-FIX: removed dead lambda-creation statement (no side effects; obfuscation artifact)
         this.d();
      }
   }

   private final void b(UUID var1) {
      Object var10000 = null;
      this.g();
   }

   @Nullable
   @Override
   public Float a(float var1, float var2, float var3, float var4, float var5) { String var32 = null; // PX-FIX hoist
        
      int[] var6 = IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.g();
      if (var6 == null) {
         Float var10000 = this.e();
         if (var10000 != null) {
            float var7;
            float var8;
            float var9;
            float var10;
            float var12;
            float var14;
            float var15;
            float var17;
            float var18;
            float var19;
            float var20;
            float var21;
            float var63;
            float var79;
            label389: {
               var7 = var10000;
               short var77 = -4650;
               IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a();
               short var10001 = 9739;
               var8 = RangesKt.coerceIn(var1 * 0.35F, 350.0F, 600.0F);
               var9 = RangesKt.coerceIn(var2 * 0.07F, 45.0F, 70.0F);
               var10 = RangesKt.coerceIn(var2 * 0.012F, 6.0F, 14.0F);
               var63 = RangesKt.coerceIn(var2 * 0.03F, 20.0F, 36.0F);
               var12 = RangesKt.coerceIn(var8 * 0.05F, 20.0F, 40.0F);
               byte var13 = 5;
               var14 = var63 + var12 * 2;
               var15 = var13 * (var9 + var10);
               float var16 = var9 + var12 * 2;
               var17 = var14 + var15 + var16 + var12;
               var18 = (var1 - var8) / 2;
               var19 = (var2 - var17) / 2;
               var20 = (var8 - var12 * 3) / 2.0F;
               var21 = var19 + var17 - var9 - var12;
               float var22 = var9 * 0.44F;
               float var23 = var22 * 1.3F;
               float var24 = var9 * 0.22F;
               float var25 = var20 - var24 - var23 - var24 - var24;
               float var26 = var9 * 0.4F;
               float var27 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                  "Add Account",
                  var26,
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
               );
               float var78 = var27;
               float var108 = var25;
               if (var6 == null) {
                  if (!(var27 > var25)) {
                     var79 = 0.4F;
                     break label389;
                  }

                  var78 = 0.4F * (var25 / var27);
                  var108 = 0.95F;
               }

               var79 = var78 * var108;
            }

            float var28;
            label412: {
               var28 = var79;
               IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl var80 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
               if (var6 == null) {
                  if (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl == null) {
                     float var10003 = var18 + var12;
                     short var10007 = -4651;
                     short var10008 = -30239;
                     var10008 = -4655;
                     short var10009 = 26126;
                     this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl(
                        var10003,
                        var21,
                        var20,
                        var9,
                        "Add Account",
                        "\n    <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n        <line x1=\"12\" y1=\"5\" x2=\"12\" y2=\"19\"/>\n        <line x1=\"5\" y1=\"12\" x2=\"19\" y2=\"12\"/>\n    </svg>\n",
                        var28,
                        null
                     );
                     if (var6 == null) {
                        break label412;
                     }
                  }

                  var80 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
               }

               if (var80 != null) {
                  var80.a(var18 + var12);
               } else {
                  Object var81 = null;
               }

               if (var6 == null && this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl != null) {
                  this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.b(var21);
               } else {
                  Object var82 = null;
               }

               if (var6 == null && this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl != null) {
                  this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.c(var20);
               } else {
                  Object var83 = null;
               }

               if (var6 == null && this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl != null) {
                  this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.d(var9);
               } else {
                  Object var84 = null;
               }

               if (var6 == null && this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl != null) {
                  this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.a(Float.valueOf(var28));
               } else {
                  Object var85 = null;
               }
            }

            label413: {
               IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl var86 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
               if (var6 == null) {
                  if (this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll == null) {
                     float var115 = var18 + var12 + var20 + var12;
                     short var116 = -4654;
                     short var118 = 24799;
                     var118 = -4649;
                     short var120 = -31063;
                     this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl(
                        var115,
                        var21,
                        var20,
                        var9,
                        "Close",
                        "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n            <line x1=\"18\" y1=\"6\" x2=\"6\" y2=\"18\"/>\n            <line x1=\"6\" y1=\"6\" x2=\"18\" y2=\"18\"/>\n        </svg>\n    ",
                        var28,
                        null
                     );
                     if (var6 == null) {
                        break label413;
                     }
                  }

                  var86 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
               }

               if (var86 != null) {
                  var86.a(var18 + var12 + var20 + var12);
               } else {
                  Object var87 = null;
               }

               if (var6 == null && this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll != null) {
                  this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.b(var21);
               } else {
                  Object var88 = null;
               }

               if (var6 == null && this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll != null) {
                  this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.c(var20);
               } else {
                  Object var89 = null;
               }

               if (var6 == null && this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll != null) {
                  this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.d(var9);
               } else {
                  Object var90 = null;
               }

               if (var6 == null && this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll != null) {
                  this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.a(Float.valueOf(var28));
               } else {
                  Object var91 = null;
               }
            }

            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
            short var92 = -4642;
            NanoVG.nvgSave(
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b()
            );
            short var109 = -13734;
            float var29 = 0.9F + var7 * 0.1F;
            float var30 = var18 + var8 / 2;
            float var31 = var19 + var17 / 2;
            NanoVG.nvgTranslate(
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b(),
               var30,
               var31
            );
            NanoVG.nvgScale(
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b(),
               var29,
               var29
            );
            NanoVG.nvgTranslate(
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b(),
               -var30,
               -var31
            );
            NanoVG.nvgGlobalAlpha(
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b(),
               var7
            );
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var18,
               var19,
               var8,
               var17,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ac(),
               lIllIlIlIlllllIIIIIlIlIIIlIIlIIlIIllIlIIIlIlIlIIIIIIIlIlIIlIlIlIIIIlIlIlIlIIIllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c()
            );
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var18,
               var19,
               var8,
               var17,
               1.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .af(),
               lIllIlIlIlllllIIIIIlIlIIIlIIlIIlIIllIlIIIlIlIlIIIIIIIlIlIIlIlIlIIIIlIlIlIlIIIllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c()
            );
             var32 = "Account Swapper";
            float var33 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var32,
               var63,
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            );
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var32,
               var18 + (var8 - var33) / 2,
               var19 + var12,
               var63,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(),
               null);
            float var34 = var19 + var14 + var12 + 2.0F;
            float var35 = var15 - 2.0F;
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
            NanoVG.nvgScissor(
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b(),
               var18 + var12 - 2.0F,
               var34 - 2.0F,
               var8 - var12 * 2 + 4.0F,
               var35 + 2.0F
            );
            this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = null;
            this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = null;
            float var36 = RangesKt.coerceIn(var2 * 0.02F, 14.0F, 22.0F);
            float var37 = RangesKt.coerceIn(var2 * 0.016F, 12.0F, 18.0F);
            float var38 = RangesKt.coerceIn(var9 * 0.4F, 18.0F, 28.0F);
            float var39 = var9 * 0.65F;
            Iterable var40 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
            boolean var41 = false;
            int var42 = 0;
            Iterator var43 = var40.iterator();
            int var94;

            while (true) {
               if (var43.hasNext()) {
                  Object var44 = var43.next();
                  int var45 = var42++;
                  var94 = var45;
                  if (var6 != null) {
                     break;
                  }

                  if (var6 == null) {
                     if (var45 < 0) {
                        CollectionsKt.throwIndexOverflow();
                     }

                     var94 = var45;
                  }

                  me.octo.client.utils.lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var46 = (me.octo.client.utils.lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var44;
                  int var47 = var94;
                  boolean var48 = false;
                  float var49 = var34 + var47 * (var9 + var10) - this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.e();
                  float var50 = var18 + var12;
                  label227:
                  if (var6 == null && !(var49 + var9 < var34)) {
                     float var95 = var49;
                     float var110 = var34 + var35;
                     if (var6 == null) {
                        if (var49 > var110) {
                           break label227;
                        }

                        var95 = var50 + var8 - var12 * 2 - var38;
                        var110 = var12 * 0.5F;
                     }

                     float var51;
                     float var52;
                     byte var53;
                     int var96;
                     label304: {
                        label401: {
                           var51 = var95 - var110;
                           var52 = var49 + (var9 - var38) / 2;
                           var53 = (byte)(Intrinsics.areEqual(null, this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) ? 1 : 0);
                           var96 = 1;
                           if (var6 == null) {
                              if (true) {
                                 break label401;
                              }

                              var96 = var53;
                           }

                           if (var6 == null) {
                              if (var96 != 0) {
                                 break label401;
                              }

                              float var121;
                              var96 = (var121 = var3 - var51) == 0.0F ? 0 : (var121 < 0.0F ? -1 : 1);
                           }

                           if (var6 == null) {
                              if (var96 < 0) {
                                 break label401;
                              }

                              float var122;
                              var96 = (var122 = var3 - (var51 + var38)) == 0.0F ? 0 : (var122 < 0.0F ? -1 : 1);
                           }

                           if (var6 == null) {
                              if (var96 > 0) {
                                 break label401;
                              }

                              float var123;
                              var96 = (var123 = var4 - var52) == 0.0F ? 0 : (var123 < 0.0F ? -1 : 1);
                           }

                           if (var6 == null) {
                              if (var96 < 0) {
                                 break label401;
                              }

                              float var124;
                              var96 = (var124 = var4 - (var52 + var38)) == 0.0F ? 0 : (var124 < 0.0F ? -1 : 1);
                           }

                           if (var6 != null) {
                              break label304;
                           }

                           if (var96 <= 0) {
                              var96 = 1;
                              break label304;
                           }
                        }

                        var96 = 0;
                     }

                     int var54 = var96;
                     int var97 = var54;
                     if (var6 == null) {
                        if (var54 != 0) {
                           this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var46;
                        }

                        float var125;
                        var97 = (var125 = var3 - var50) == 0.0F ? 0 : (var125 < 0.0F ? -1 : 1);
                     }

                     label272: {
                        label402: {
                           if (var6 == null) {
                              if (var97 < 0) {
                                 break label402;
                              }

                              float var126;
                              var97 = (var126 = var3 - (var50 + var8 - var12 * 2)) == 0.0F ? 0 : (var126 < 0.0F ? -1 : 1);
                           }

                           if (var6 == null) {
                              if (var97 > 0) {
                                 break label402;
                              }

                              float var127;
                              var97 = (var127 = var4 - var49) == 0.0F ? 0 : (var127 < 0.0F ? -1 : 1);
                           }

                           if (var6 == null) {
                              if (var97 < 0) {
                                 break label402;
                              }

                              float var128;
                              var97 = (var128 = var4 - (var49 + var9)) == 0.0F ? 0 : (var128 < 0.0F ? -1 : 1);
                           }

                           if (var6 == null) {
                              if (var97 > 0) {
                                 break label402;
                              }

                              var97 = var54;
                           }

                           if (var6 != null) {
                              break label272;
                           }

                           if (var97 == 0) {
                              var97 = 1;
                              break label272;
                           }
                        }

                        var97 = 0;
                     }

                     int var55 = var97;
                     int var98 = var55;
                     if (var6 == null) {
                        if (var55 != 0) {
                           this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var46;
                        }

                        var98 = var53;
                     }

                     me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var99;
                     label245: {
                        if (var6 == null) {
                           if (var98 != 0) {
                              var99 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                                 .a(0.15F);
                              break label245;
                           }

                           var98 = var55;
                        }

                        var99 = var98 != 0
                           ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .ad()
                           : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .ac();
                     }

                     me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var56 = var99;
                     var95 = var50;
                     float var111 = var49;
                     float var10002 = var8 - var12 * 2;
                     if (var6 == null) {
                        me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                           var50,
                           var49,
                           var10002,
                           var9,
                           var56,
                           lIllIlIlIlllllIIIIIlIlIIIlIIlIIlIIllIlIIIlIlIlIIIIIIIlIlIIlIlIlIIIIlIlIlIlIIIllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .a()
                        );
                        if (var53 != 0) {
                           me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                              var50,
                              var49,
                              var8 - var12 * 2,
                              var9,
                              1.0F,
                              IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
                              lIllIlIlIlllllIIIIIlIlIIIlIIlIIlIIllIlIIIlIlIlIIIIIIIlIlIIlIlIlIIIIlIlIlIlIIIllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .a()
                           );
                        }

                        var95 = var50 + var12;
                        var111 = var39;
                        var10002 = 2;
                     }

                     float var57 = var95 + var111 / var10002;
                     float var58 = var49 + var9 / 2;
                     IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a("", var57, var58, var39);
                     float var59 = var50 + var12 + var39 + var12;
                     float var60 = var49 + (var9 - var36) / 2;
                     me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                        "",
                        var59,
                        var60,
                        var36,
                        var53 != 0
                           ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                           : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .a(),
                        null);
                     int var101 = var53;
                     if (var6 == null) {
                        if (var53 != 0) {
                           short var102 = -4656;
                           var109 = 26233;
                           String var61 = "Active";
                           float var62 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                              var61,
                              var37,
                              me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                           );
                           me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                              var61,
                              var50 + var8 - var12 * 2 - var62 - var12,
                              var60 + var36 - var37,
                              var37,
                              IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
                              null);
                        }

                        var101 = 1;
                     }

                     if (var6 == null) {
                        if (var101 != 0) {
                           break label227;
                        }

                        var101 = var53;
                     }

                     if (var6 == null) {
                        if (var101 != 0) {
                           break label227;
                        }

                        var101 = var54;
                     }

                     me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var75 = var101 != 0
                        ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .aj()
                        : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .b();
                     var109 = -4643;
                     short var114 = 15580;
                     me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b(
                        me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                        "\n    <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n        <polyline points=\"3,6 5,6 21,6\"/>\n        <path d=\"M19 6v14a2 2 0 0 1-2 2H7a2 2 0 0 1-2-2V6m3 0V4a2 2 0 0 1 2-2h4a2 2 0 0 1 2 2v2\"/>\n        <line x1=\"10\" y1=\"11\" x2=\"10\" y2=\"17\"/>\n        <line x1=\"14\" y1=\"11\" x2=\"14\" y2=\"17\"/>\n    </svg>\n",
                        var51,
                        var52,
                        var38,
                        var38,
                        var75,
                        0.0F,
                        0.0F);
                  }

                  if (var6 == null) {
                     continue;
                  }
               }

               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
               var94 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.size();
               break;
            }

            float var64 = var94 * (var9 + var10);
            this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = Math.max(0.0F, var64 - var35);
            lIIIlIIIIlIIIlIlIlllIlIIIlIIIIllIlIllIllIlIlIllIlIllIIllllIIllIlIlIIIIIllIllIIlllIIlI var103 = this;
            if (var6 == null) {
               if (this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI > 0.0F) {
                  float var65 = 4.0F;
                  float var67 = var18 + var8 - var12 / 2 - var65;
                  float var68 = var35 / var64 * var35;
                  float var72 = var34
                     + this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.e()
                        / this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                        * (var35 - var68);
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                     var67,
                     var34,
                     var65,
                     var35,
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .ae(),
                     var65 / 2
                  );
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                     var67,
                     var72,
                     var65,
                     var68,
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
                     var65 / 2
                  );
               }

               var103 = this;
            }

            if (var103.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl != null) {
               IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl var69 = var103.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
               boolean var73 = false;
               var69.a(var3, var4, var5);
               var69.e();
            } else {
               Object var105 = null;
            }

            if (var6 == null && this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll != null) {
               IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl var70 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
               boolean var74 = false;
               var70.a(var3, var4, var5);
               var70.e();
            } else {
               Object var106 = null;
            }

            String var66 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
            if (var6 == null) {
               long var107;
               label209: {
                  if (var66 != null) {
                     var107 = System.currentTimeMillis();
                     if (var6 != null) {
                        break label209;
                     }

                     if (var107 < this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI) {
                        float var71 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                           var66,
                           var37,
                           me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                        );
                        me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                           var66,
                           var18 + (var8 - var71) / 2,
                           var21 - var37 - var12 * 0.5F,
                           var37,
                           IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .aj(),
                           null);
                     }
                  }

                  var107 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b();
               }

               NanoVG.nvgRestore(var107);
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
            }

            return var7;
         }
      }

      boolean var11 = false;
      Object var76 = null;
      return null;
   }

   @Override
   public boolean a(float var1, float var2, float var3, float var4, int var5) {
      int[] var6 = IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.g();
      lIIIlIIIIlIIIlIlIlllIlIIIlIIIIllIlIllIllIlIlIllIlIllIIllllIIllIlIlIIIIIllIllIIlllIIlI var10000 = this;
      if (var6 == null) {
         if (this.b()) {
            return true;
         }

         var10000 = this;
      }

      if (var10000.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl != null) {
         IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl var9 = var10000.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         boolean var10 = false;
         boolean var29 = var9.a(var3, var4, var5);
         if (var6 != null) {
            return var29;
         }

         if (var29) {
            return true;
         }
      }

      if (this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll != null) {
         IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl var22 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
         boolean var24 = false;
         boolean var30 = var22.a(var3, var4, var5);
         if (var6 != null) {
            return var30;
         }

         if (var30) {
            return true;
         }
      }

      int var31 = var5;
      if (var6 == null) {
         if (var5 == 0) {
            label102: {
               label132: {
                  float var7 = RangesKt.coerceIn(var1 * 0.35F, 350.0F, 600.0F);
                  float var8 = RangesKt.coerceIn(var2 * 0.07F, 45.0F, 70.0F);
                  float var23 = RangesKt.coerceIn(var2 * 0.012F, 6.0F, 14.0F);
                  float var25 = RangesKt.coerceIn(var2 * 0.03F, 20.0F, 36.0F);
                  float var11 = RangesKt.coerceIn(var7 * 0.05F, 20.0F, 40.0F);
                  float var12 = var25 + var11 * 2;
                  float var13 = 5 * (var8 + var23);
                  float var14 = var8 + var11 * 2;
                  float var15 = var12 + var13 + var14 + var11;
                  float var16 = (var1 - var7) / 2;
                  float var17 = (var2 - var15) / 2;
                  float var36;
                  int var32;
                  var32 = (var36 = var3 - var16) == 0.0F ? 0 : (var36 < 0.0F ? -1 : 1);
                  if (var6 == null) {
                     if (var32 < 0) {
                        break label132;
                     }

                     float var37;
                     var32 = (var37 = var3 - (var16 + var7)) == 0.0F ? 0 : (var37 < 0.0F ? -1 : 1);
                  }

                  if (var6 == null) {
                     if (var32 > 0) {
                        break label132;
                     }

                     float var38;
                     var32 = (var38 = var4 - var17) == 0.0F ? 0 : (var38 < 0.0F ? -1 : 1);
                  }

                  if (var6 == null) {
                     if (var32 < 0) {
                        break label132;
                     }

                     float var39;
                     var32 = (var39 = var4 - (var17 + var15)) == 0.0F ? 0 : (var39 < 0.0F ? -1 : 1);
                  }

                  if (var6 != null) {
                     break label102;
                  }

                  if (var32 <= 0) {
                     var32 = 1;
                     break label102;
                  }
               }

               var32 = 0;
            }

            int var18 = var32;
            if (var6 != null) {
               return var18 != 0;
            }

            if (var18 == 0) {
               this.d();
               return true;
            }

            me.octo.client.utils.lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var19 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
            me.octo.client.utils.lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var34 = var19;
            if (var6 == null) {
               if (var19 != null) {
                  boolean var27 = false;
                  this.b((kotlin.jvm.functions.Function1)null);
                  return true;
               }

               var19 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
               var34 = var19;
            }

            if (var6 != null || var34 != null) {
               boolean var21 = false;
               boolean var35 = Intrinsics.areEqual(null, this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll);
               if (var6 == null) {
                  if (!var35) {
                     this.a((kotlin.jvm.functions.Function1)null);
                  }

                  var35 = true;
               }

               return var35;
            }
         }

         var31 = 0;
      }

      return var31 != 0;
   }

   @Override
   public boolean a(float var1, float var2, float var3, float var4, double var5, double var7) {
      float var9 = RangesKt.coerceIn(
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.e() - (float)var7 * 100.0F,
         0.0F,
         this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
      );
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.a(var9);
      return true;
   }

   @Override
   public boolean a(int var1, int var2, int var3) {
      int[] var4 = IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.g();
      int var10000 = var1;
      if (var4 == null) {
         if (var1 == 256) {
            this.d();
            return true;
         }

         var10000 = 0;
      }

      return var10000 != 0;
   }

   private static final Unit a(lIIIlIIIIlIIIlIlIlllIlIIIlIIIIllIlIllIllIlIlIllIlIllIIllllIIllIlIlIIIIIllIllIIlllIIlI var0) {
      var0.g();
      return Unit.INSTANCE;
   }

   private static final Unit a(lIIIlIIIIlIIIlIlIlllIlIIIlIIIIllIlIllIllIlIlIllIlIllIIllllIIllIlIlIIIIIllIllIIlllIIlI var0, Throwable var1) {
      int[] var10000 = IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.g();
      Intrinsics.checkNotNullParameter(var1, "e");
      int[] var2 = var10000;
      lIIIlIIIIlIIIlIlIlllIlIIIlIIIIllIlIllIllIlIlIllIlIllIIllllIIllIlIlIIIIIllIllIIlllIIlI var3 = var0;
      if (var2 == null) {
         String var10001 = var1.getMessage();
         if (var10001 == null) {
            short var5 = -4653;
            short var10002 = -18275;
            var10001 = "Login failed";
         }

         var0.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var10001;
         var3 = var0;
      }

      var3.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = System.currentTimeMillis() + 4000L;
      String var4 = var1.getMessage();
      short var6 = -4652;
      short var7 = -17377;
      me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Failed to switch account: " + var4);
      return Unit.INSTANCE;
   }

   private static final Unit b(lIIIlIIIIlIIIlIlIlllIlIIIlIIIIllIlIllIllIlIlIllIlIllIIllllIIllIlIlIIIIIllIllIIlllIIlI var0) {
      var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.a(var0);
      return Unit.INSTANCE;
   }

   private static final Unit c(lIIIlIIIIlIIIlIlIlllIlIIIlIIIIllIlIllIllIlIlIllIlIllIIllllIIllIlIlIIIIIllIllIIlllIIlI var0) {
      var0.d();
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[12];
      int var3 = 0;
      String var2 = "\n\u0097¶\"t\u0099Usµê56\u0005\u0081\u0019fb+aJ\u0081²~`]¬vN\u009a\u0086O\u0014\u0019Éü0B²@3%°-ê¸`¤\u0085$aÈWö§þ8æµ\u001908?Mä_\u0093\u009fÈ?\u0096Ì\\R¸ÇpÆ·óêm¼Ü\f\u0095ö÷a\\ñP~\u0015WrH\u0093Ò.\t\u008bzö\u0015°óG×\u0097\u0002\u001e\u0080\u0098\u001eä\"\u0096ÙÝa¶úTU\u0017¥¹¹Àµ\u00151HrJ\u0012D\u008fU*êZÅ\u009b\u001a®\u0098\u0095\u0010f\u0004åxàú\u0012\u0089£;éhf\u0003;\u0081m\u00ad¢ïY+©h²ç\rø+ \u0095f3½ms¹\u0011\u0085ùð \u0086Ôr[\u009açô\u001aÌd\u00998s\u0018\u000b\u0085í!¡+ª°qw^\u0095\u000b\u00ad¢$H\u008b\u0097¤ÖõªÅ\u001a÷a\u0085Ù7gÐ4JÀlí \u008fgx_ß\n\fþ¿(ÄHä\f\u000bg_Ó¨Ç\u000fù9\u0082Òs\u0005^¤\u0013Ò#»hÈúÉýø7\u0096\u0087ÖÙ1?Ê(´ëý\u008eÌHÛ\u0016ã\u0006\u008e\u0099\u001e!J¸ÐwëíúRÊS\u001825\u0017í\u0011üÓ¡\u009e\u009b1ü\u008f\u0090q\u009f×\bó\u00925\u0018Ù[5§\u001dÇ-ÀÊ½$\u009e\u0012\u008aZRø\u0092\u0081\u00980§FëP\u00ad¨hÒ\u0001\u00933\u0087C\u0098¢\u001dz\u0094Ï\u0001tàßlRö¨´ÔÄËR\u0006¸,\u009cÞ\u009e,Q\u0088¬ûà<@\u008aÅ\u008ccÑs¢¾êFP\u00030\u007fc\\ÿa\u0014s\u00ad¥\u0006\u0006*/\nLÁ1÷³ìÆ^9Sá£\u00139U§9v JÖ¾\nu\u0080z\u009cèuO\u0089\u0006²Õ×\bÐù\bÙÄ\u000eonò\u0098¦\u000f_¿}Cs]\u001elqB¢\u0007°$^";
      int var4 = "\n\u0097¶\"t\u0099Usµê56\u0005\u0081\u0019fb+aJ\u0081²~`]¬vN\u009a\u0086O\u0014\u0019Éü0B²@3%°-ê¸`¤\u0085$aÈWö§þ8æµ\u001908?Mä_\u0093\u009fÈ?\u0096Ì\\R¸ÇpÆ·óêm¼Ü\f\u0095ö÷a\\ñP~\u0015WrH\u0093Ò.\t\u008bzö\u0015°óG×\u0097\u0002\u001e\u0080\u0098\u001eä\"\u0096ÙÝa¶úTU\u0017¥¹¹Àµ\u00151HrJ\u0012D\u008fU*êZÅ\u009b\u001a®\u0098\u0095\u0010f\u0004åxàú\u0012\u0089£;éhf\u0003;\u0081m\u00ad¢ïY+©h²ç\rø+ \u0095f3½ms¹\u0011\u0085ùð \u0086Ôr[\u009açô\u001aÌd\u00998s\u0018\u000b\u0085í!¡+ª°qw^\u0095\u000b\u00ad¢$H\u008b\u0097¤ÖõªÅ\u001a÷a\u0085Ù7gÐ4JÀlí \u008fgx_ß\n\fþ¿(ÄHä\f\u000bg_Ó¨Ç\u000fù9\u0082Òs\u0005^¤\u0013Ò#»hÈúÉýø7\u0096\u0087ÖÙ1?Ê(´ëý\u008eÌHÛ\u0016ã\u0006\u008e\u0099\u001e!J¸ÐwëíúRÊS\u001825\u0017í\u0011üÓ¡\u009e\u009b1ü\u008f\u0090q\u009f×\bó\u00925\u0018Ù[5§\u001dÇ-ÀÊ½$\u009e\u0012\u008aZRø\u0092\u0081\u00980§FëP\u00ad¨hÒ\u0001\u00933\u0087C\u0098¢\u001dz\u0094Ï\u0001tàßlRö¨´ÔÄËR\u0006¸,\u009cÞ\u009e,Q\u0088¬ûà<@\u008aÅ\u008ccÑs¢¾êFP\u00030\u007fc\\ÿa\u0014s\u00ad¥\u0006\u0006*/\nLÁ1÷³ìÆ^9Sá£\u00139U§9v JÖ¾\nu\u0080z\u009cèuO\u0089\u0006²Õ×\bÐù\bÙÄ\u000eonò\u0098¦\u000f_¿}Cs]\u001elqB¢\u0007°$^"
         .length();
      char var1 = 205;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 53;
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
                     case 0 -> 51;
                     case 1 -> 97;
                     case 2 -> 105;
                     case 3 -> 107;
                     case 4 -> 24;
                     case 5 -> 39;
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
                     a = var5;
                     b = new String[12];
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

                  var2 = "Ì\u0014kWÊ.ÔIþ(óë\u007f\u0094%zO!\u001fR\u007f\rõ<\u007fp³Äa\u0014µ\u001eÓ7|de\u001c°ÇKË=7Q¢Þo:G b¸F\u0092@®öÙHuFÔ\u0095\u0091{\u008cY\u001a\u0016)b]`8P\u001a\fõ\\%D¡9q=³rÑ\u0096øÇÕs\u0090@ñ]^6ë\\É»Óæ£z\f¦>\u0087CæT\u0084ëYÿKj/Ä\u0086\u009daö6C\u0013Ïº;B£Û\u0080\u0002Í\u00832¹\u0088;\u0085\u00938ò\u0095±ãøæÁÙ\"¤\u00910çù\u0015gW~ið\u009a\u0019IþüzG\u0092 i(ºxÉ$»z\u008bìÐ¼@»Pê\u009fú)\u0081c*Ð\u009dÿ\u008fe´2bÑë¢£\u0013nü\u0018\u0019Û¿h¯\u000e\u007f:óDT\u0092\u0017\u0087E(v\\\u0098ÀM\u009aö8\u008aSý\u0010Jë\u0085#»\u0096\u0093Úù´I\u0096¦I!^¨¿\u001dqdæ\u0006\u00adÐ\u009e}ZÌN(\u008c\u001f\f6&\u001e\u0006Ê\fOqÉCöcõ^=]éni¸\u0081mÄDu×¦)S-äJOHf³9\u0001¬TuK¿\u0013@¼M\u0091;+xÃS¸\u0010\u0093Ï\u0014¨µÚ»fý{¨ë.¤AH";
                  var4 = "Ì\u0014kWÊ.ÔIþ(óë\u007f\u0094%zO!\u001fR\u007f\rõ<\u007fp³Äa\u0014µ\u001eÓ7|de\u001c°ÇKË=7Q¢Þo:G b¸F\u0092@®öÙHuFÔ\u0095\u0091{\u008cY\u001a\u0016)b]`8P\u001a\fõ\\%D¡9q=³rÑ\u0096øÇÕs\u0090@ñ]^6ë\\É»Óæ£z\f¦>\u0087CæT\u0084ëYÿKj/Ä\u0086\u009daö6C\u0013Ïº;B£Û\u0080\u0002Í\u00832¹\u0088;\u0085\u00938ò\u0095±ãøæÁÙ\"¤\u00910çù\u0015gW~ið\u009a\u0019IþüzG\u0092 i(ºxÉ$»z\u008bìÐ¼@»Pê\u009fú)\u0081c*Ð\u009dÿ\u008fe´2bÑë¢£\u0013nü\u0018\u0019Û¿h¯\u000e\u007f:óDT\u0092\u0017\u0087E(v\\\u0098ÀM\u009aö8\u008aSý\u0010Jë\u0085#»\u0096\u0093Úù´I\u0096¦I!^¨¿\u001dqdæ\u0006\u00adÐ\u009e}ZÌN(\u008c\u001f\f6&\u001e\u0006Ê\fOqÉCöcõ^=]éni¸\u0081mÄDu×¦)S-äJOHf³9\u0001¬TuK¿\u0013@¼M\u0091;+xÃS¸\u0010\u0093Ï\u0014¨µÚ»fý{¨ë.¤AH"
                     .length();
                  var1 = 330;
                  var8 = -1;
            }

            var10000 = 20;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -4649) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 49;
            case 1 -> 75;
            case 2 -> 107;
            case 3 -> 12;
            case 4 -> 61;
            case 5 -> 40;
            case 6 -> 94;
            case 7 -> 54;
            case 8 -> 58;
            case 9 -> 186;
            case 10 -> 97;
            case 11 -> 219;
            case 12 -> 163;
            case 13 -> 92;
            case 14 -> 131;
            case 15 -> 86;
            case 16 -> 192;
            case 17 -> 69;
            case 18 -> 117;
            case 19 -> 20;
            case 20 -> 167;
            case 21 -> 169;
            case 22 -> 82;
            case 23 -> 35;
            case 24 -> 32;
            case 25 -> 102;
            case 26 -> 106;
            case 27 -> 114;
            case 28 -> 125;
            case 29 -> 156;
            case 30 -> 201;
            case 31 -> 124;
            case 32 -> 93;
            case 33 -> 244;
            case 34 -> 246;
            case 35 -> 100;
            case 36 -> 31;
            case 37 -> 214;
            case 38 -> 123;
            case 39 -> 65;
            case 40 -> 136;
            case 41 -> 225;
            case 42 -> 222;
            case 43 -> 217;
            case 44 -> 162;
            case 45 -> 19;
            case 46 -> 17;
            case 47 -> 137;
            case 48 -> 242;
            case 49 -> 173;
            case 50 -> 85;
            case 51 -> 59;
            case 52 -> 8;
            case 53 -> 41;
            case 54 -> 126;
            case 55 -> 180;
            case 56 -> 218;
            case 57 -> 203;
            case 58 -> 91;
            case 59 -> 98;
            case 60 -> 159;
            case 61 -> 118;
            case 62 -> 81;
            case 63 -> 145;
            case 64 -> 34;
            case 65 -> 77;
            case 66 -> 147;
            case 67 -> 95;
            case 68 -> 52;
            case 69 -> 27;
            case 70 -> 87;
            case 71 -> 42;
            case 72 -> 74;
            case 73 -> 228;
            case 74 -> 240;
            case 75 -> 234;
            case 76 -> 209;
            case 77 -> 166;
            case 78 -> 227;
            case 79 -> 22;
            case 80 -> 47;
            case 81 -> 122;
            case 82 -> 241;
            case 83 -> 174;
            case 84 -> 211;
            case 85 -> 189;
            case 86 -> 255;
            case 87 -> 99;
            case 88 -> 196;
            case 89 -> 66;
            case 90 -> 154;
            case 91 -> 207;
            case 92 -> 158;
            case 93 -> 121;
            case 94 -> 55;
            case 95 -> 63;
            case 96 -> 24;
            case 97 -> 133;
            case 98 -> 128;
            case 99 -> 212;
            case 100 -> 235;
            case 101 -> 172;
            case 102 -> 239;
            case 103 -> 229;
            case 104 -> 21;
            case 105 -> 204;
            case 106 -> 208;
            case 107 -> 13;
            case 108 -> 96;
            case 109 -> 213;
            case 110 -> 170;
            case 111 -> 67;
            case 112 -> 60;
            case 113 -> 71;
            case 114 -> 150;
            case 115 -> 160;
            case 116 -> 178;
            case 117 -> 78;
            case 118 -> 205;
            case 119 -> 220;
            case 120 -> 153;
            case 121 -> 165;
            case 122 -> 89;
            case 123 -> 215;
            case 124 -> 135;
            case 125 -> 175;
            case 126 -> 210;
            case 127 -> 29;
            case 128 -> 4;
            case 129 -> 43;
            case 130 -> 188;
            case 131 -> 73;
            case 132 -> 139;
            case 133 -> 83;
            case 134 -> 53;
            case 135 -> 199;
            case 136 -> 56;
            case 137 -> 200;
            case 138 -> 25;
            case 139 -> 206;
            case 140 -> 177;
            case 141 -> 101;
            case 142 -> 134;
            case 143 -> 48;
            case 144 -> 250;
            case 145 -> 148;
            case 146 -> 7;
            case 147 -> 127;
            case 148 -> 187;
            case 149 -> 46;
            case 150 -> 252;
            case 151 -> 181;
            case 152 -> 3;
            case 153 -> 179;
            case 154 -> 237;
            case 155 -> 2;
            case 156 -> 33;
            case 157 -> 216;
            case 158 -> 164;
            case 159 -> 0;
            case 160 -> 151;
            case 161 -> 185;
            case 162 -> 142;
            case 163 -> 130;
            case 164 -> 84;
            case 165 -> 202;
            case 166 -> 14;
            case 167 -> 88;
            case 168 -> 190;
            case 169 -> 9;
            case 170 -> 1;
            case 171 -> 247;
            case 172 -> 140;
            case 173 -> 80;
            case 174 -> 51;
            case 175 -> 144;
            case 176 -> 194;
            case 177 -> 105;
            case 178 -> 171;
            case 179 -> 116;
            case 180 -> 132;
            case 181 -> 224;
            case 182 -> 141;
            case 183 -> 37;
            case 184 -> 64;
            case 185 -> 44;
            case 186 -> 103;
            case 187 -> 233;
            case 188 -> 161;
            case 189 -> 90;
            case 190 -> 113;
            case 191 -> 193;
            case 192 -> 16;
            case 193 -> 50;
            case 194 -> 6;
            case 195 -> 18;
            case 196 -> 11;
            case 197 -> 248;
            case 198 -> 76;
            case 199 -> 197;
            case 200 -> 112;
            case 201 -> 10;
            case 202 -> 195;
            case 203 -> 62;
            case 204 -> 243;
            case 205 -> 30;
            case 206 -> 23;
            case 207 -> 120;
            case 208 -> 253;
            case 209 -> 57;
            case 210 -> 26;
            case 211 -> 110;
            case 212 -> 198;
            case 213 -> 157;
            case 214 -> 245;
            case 215 -> 68;
            case 216 -> 182;
            case 217 -> 183;
            case 218 -> 129;
            case 219 -> 15;
            case 220 -> 5;
            case 221 -> 230;
            case 222 -> 36;
            case 223 -> 249;
            case 224 -> 143;
            case 225 -> 232;
            case 226 -> 70;
            case 227 -> 115;
            case 228 -> 39;
            case 229 -> 79;
            case 230 -> 191;
            case 231 -> 236;
            case 232 -> 108;
            case 233 -> 226;
            case 234 -> 111;
            case 235 -> 251;
            case 236 -> 28;
            case 237 -> 138;
            case 238 -> 184;
            case 239 -> 176;
            case 240 -> 168;
            case 241 -> 104;
            case 242 -> 72;
            case 243 -> 38;
            case 244 -> 109;
            case 245 -> 254;
            case 246 -> 152;
            case 247 -> 221;
            case 248 -> 223;
            case 249 -> 149;
            case 250 -> 45;
            case 251 -> 231;
            case 252 -> 119;
            case 253 -> 155;
            case 254 -> 146;
            default -> 238;
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
