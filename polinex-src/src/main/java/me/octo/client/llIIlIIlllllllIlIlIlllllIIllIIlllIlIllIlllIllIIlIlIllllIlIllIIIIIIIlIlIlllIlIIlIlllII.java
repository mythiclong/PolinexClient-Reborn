package me.octo.client;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.nanovg.NanoVG;

public final class llIIlIIlllllllIlIlIlllllIIllIIlllIlIllIlllIllIIlIlIllllIlIllIIIIIIIlIlIlllIlIIlIlllII
   extends IlIlIllIlIlllIllIlIIIIllIIIIIIIIlIlllllIlIlllIIIlIllIIIllIlIIlllllIllllIIllIllllIllII {
    public static <T> T c(Object p0) { return null; } // PX-FIX mr3
    public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) { return null; } // PX-FIX mr3
   public static me.octo.client.PXDyn var37 = null; // PX-FIX missing field v2
   
   @NotNull
   private final IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private final Minecraft IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private List<me.octo.client.utils.llllllIlIlIIlIIllIIllllIllIlIlIllIIIlIIlIllllIlIllIIIIlllIIlIllIIlIIlIllIIIlIIIllIllI> IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @Nullable
   private Integer lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @Nullable
   private Integer IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @Nullable
   private Integer llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private final me.octo.client.utils.llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private float lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @Nullable
   private IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @Nullable
   private IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @Nullable
   private IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static String[] a;
   private static String[] b;

   public llIIlIIlllllllIlIlIlllllIIllIIlllIlIllIlllIllIIlIlIllllIlIllIIIIIIIlIlIlllIlIIlIlllII(
      @NotNull IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll var1
   ) {
      short var10001 = 31793;
      short var10002 = 20219;
      Intrinsics.checkNotNullParameter(var1, "mainMenu");
      super();
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
      Minecraft var2 = Minecraft.getInstance();
      short var10003 = 31802;
      short var10004 = 9492;
      Intrinsics.checkNotNullExpressionValue(var2, "getInstance(...)");
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var2;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = CollectionsKt.emptyList();
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new me.octo.client.utils.llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll(
         200
      );
      this.g();
   }

   private final void g() {
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = me.octo.client.utils.IIIllIIlllIlIlllllllIlIllIIIlIllllIIIllllllIlllllIIlIlIIllIlIIIIlllIIllllIlllIlIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = me.octo.client.utils.IIIllIIlllIlIlllllllIlIllIIIlIllllIIIllllllIlllllIIlIlIIllIlIIIIlllIIllllIlllIlIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .c();
   }

   public final void h() {
      this.g();
   }

   @Nullable
   @Override
   public Float a(float var1, float var2, float var3, float var4, float var5) {
      int[] var6 = IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.g();
      if (var6 == null) {
         Float var10000 = this.e();
         if (var10000 != null) {
            float var7;
            float var8;
            float var9;
            float var10;
            float var11;
            float var12;
            float var13;
            float var15;
            float var65;
            int var86;
            label457: {
               var7 = var10000;
               var8 = RangesKt.coerceIn(var1 * 0.4F, 400.0F, 700.0F);
               var9 = RangesKt.coerceIn(var2 * 0.065F, 45.0F, 65.0F);
               var10 = RangesKt.coerceIn(var2 * 0.012F, 6.0F, 14.0F);
               var11 = RangesKt.coerceIn(var2 * 0.028F, 18.0F, 32.0F);
               var12 = RangesKt.coerceIn(var8 * 0.05F, 20.0F, 40.0F);
               var13 = RangesKt.coerceIn(var2 * 0.055F, 38.0F, 55.0F);
               byte var14 = 5;
               var15 = var11 + var12 * 2;
               byte var64 = (byte)(this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.isEmpty() ? 1 : 0);
               if (var6 == null) {
                  if (var64 != 0) {
                     var65 = var9 * 2;
                     break label457;
                  }

                  var64 = var14;
               }

               var65 = var64 * (var9 + var10);
            }

            float var16;
            float var18;
            float var19;
            float var20;
            float var21;
            float var22;
            label480: {
               var16 = var65;
               float var17 = var13 + var12 * 2;
               var18 = var15 + var16 + var17 + var12;
               var19 = (var1 - var8) / 2;
               var20 = (var2 - var18) / 2;
               var21 = (var8 - var12 * 4) / 3.0F;
               var22 = var20 + var18 - var13 - var12;
               IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl var66 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
               if (var6 == null) {
                  if (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl == null) {
                     float var10003 = var19 + var12;
                     short var10007 = 31800;
                     short var10008 = -20452;
                     var10008 = 31803;
                     short var10009 = 16414;
                     this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl(
                        var10003,
                        var22,
                        var21,
                        var13,
                        "Add",
                        "\n    <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n        <line x1=\"12\" y1=\"5\" x2=\"12\" y2=\"19\"/>\n        <line x1=\"5\" y1=\"12\" x2=\"19\" y2=\"12\"/>\n    </svg>\n",
                        null,
                        () -> a(this),
                        64,
                        null
                     );
                     if (var6 == null) {
                        break label480;
                     }
                  }

                  var66 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
               }

               if (var66 != null) {
                  var66.a(var19 + var12);
               } else {
                  Object var67 = null;
               }

               if (var6 == null && this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl != null) {
                  this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.b(var22);
               } else {
                  Object var68 = null;
               }

               if (var6 == null && this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl != null) {
                  this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.c(var21);
               } else {
                  Object var69 = null;
               }

               if (var6 == null && this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl != null) {
                  this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.d(var13);
               } else {
                  Object var70 = null;
               }
            }

            label481: {
               IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl var71 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
               if (var6 == null) {
                  if (this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll == null) {
                     float var118 = var19 + var12 + var21 + var12;
                     String var122;
                     if (this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll != null) {
                        short var121 = 31798;
                        short var126 = 5784;
                        var122 = "Disable";
                     } else {
                        short var123 = 31796;
                        short var127 = -1805;
                        var122 = "None";
                     }

                     short var128 = 31794;
                     short var131 = -15467;
                     IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl var10001 = new IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl(
                        var118,
                        var22,
                        var21,
                        var13,
                        var122,
                        "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n            <line x1=\"18\" y1=\"6\" x2=\"6\" y2=\"18\"/>\n            <line x1=\"6\" y1=\"6\" x2=\"18\" y2=\"18\"/>\n        </svg>\n    ",
                        null,
                        () -> b(this),
                        64,
                        null
                     );
                     this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var10001;
                     if (var6 == null) {
                        break label481;
                     }
                  }

                  var71 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
               }

               if (var71 != null) {
                  var71.a(var19 + var12 + var21 + var12);
               } else {
                  Object var72 = null;
               }

               if (var6 == null && this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll != null) {
                  this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.b(var22);
               } else {
                  Object var73 = null;
               }

               if (var6 == null && this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll != null) {
                  this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.c(var21);
               } else {
                  Object var74 = null;
               }

               if (var6 == null && this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll != null) {
                  this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.d(var13);
               } else {
                  Object var75 = null;
               }

               if (var6 == null && this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll != null) {
                  String var106;
                  if (this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll != null) {
                     short var105 = 31804;
                     short var10002 = -12451;
                     var106 = "Disable";
                  } else {
                     short var107 = 31797;
                     short var115 = 14130;
                     var106 = "None";
                  }

                  this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.a(var106);
               } else {
                  Object var76 = null;
               }
            }

            label482: {
               IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl var77 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
               if (var6 == null) {
                  if (this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl == null) {
                     float var119 = var19 + var12 + var21 * 2 + var12 * 2;
                     short var124 = 31805;
                     short var129 = -21368;
                     var129 = 31806;
                     short var132 = -22540;
                     this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl(
                        var119,
                        var22,
                        var21,
                        var13,
                        "Close",
                        "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n            <line x1=\"18\" y1=\"6\" x2=\"6\" y2=\"18\"/>\n            <line x1=\"6\" y1=\"6\" x2=\"18\" y2=\"18\"/>\n        </svg>\n    ",
                        null,
                        () -> c(this),
                        64,
                        null
                     );
                     if (var6 == null) {
                        break label482;
                     }
                  }

                  var77 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
               }

               if (var77 != null) {
                  var77.a(var19 + var12 + var21 * 2 + var12 * 2);
               } else {
                  Object var78 = null;
               }

               if (var6 == null && this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl != null) {
                  this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.b(var22);
               } else {
                  Object var79 = null;
               }

               if (var6 == null && this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl != null) {
                  this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.c(var21);
               } else {
                  Object var80 = null;
               }

               if (var6 == null && this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl != null) {
                  this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.d(var13);
               } else {
                  Object var81 = null;
               }
            }

            float var28;
            float var29;
            label366: {
               label467: {
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
                  short var82 = 31795;
                  NanoVG.nvgSave(
                     me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .b()
                  );
                  short var108 = 25895;
                  float var23 = 0.9F + var7 * 0.1F;
                  float var24 = var19 + var8 / 2;
                  float var25 = var20 + var18 / 2;
                  NanoVG.nvgTranslate(
                     me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .b(),
                     var24,
                     var25
                  );
                  NanoVG.nvgScale(
                     me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .b(),
                     var23,
                     var23
                  );
                  NanoVG.nvgTranslate(
                     me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .b(),
                     -var24,
                     -var25
                  );
                  NanoVG.nvgGlobalAlpha(
                     me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .b(),
                     var7
                  );
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                     var19,
                     var20,
                     var8,
                     var18,
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .ac(),
                     lIllIlIlIlllllIIIIIlIlIIIlIIlIIlIIllIlIIIlIlIlIIIIIIIlIlIIlIlIlIIIIlIlIlIlIIIllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .c()
                  );
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                     var19,
                     var20,
                     var8,
                     var18,
                     1.0F,
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .af(),
                     lIllIlIlIlllllIIIIIlIlIIIlIIlIIlIIllIlIIIlIlIlIIIIIIIlIlIIlIlIlIIIIlIlIlIlIIIllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .c()
                  );
                  String var26 = "Proxy Manager";
                  float var27 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                     var26,
                     var11,
                     me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                  );
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                     var26,
                     var19 + (var8 - var27) / 2,
                     var20 + var12,
                     var11,
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(),
                     (me.octo.client.utils.IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl)null,
                     32,
                     (Object)null);
                  var28 = var20 + var15 + var12 + 2.0F;
                  var29 = var16 - 2.0F;
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
                  NanoVG.nvgScissor(
                     me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .b(),
                     var19 + var12 - 2.0F,
                     var28 - 2.0F,
                     var8 - var12 * 2 + 4.0F,
                     var29 + 2.0F
                  );
                  this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = null;
                  this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = null;
                  float var30 = RangesKt.coerceIn(var2 * 0.019F, 13.0F, 20.0F);
                  float var31 = RangesKt.coerceIn(var2 * 0.015F, 11.0F, 16.0F);
                  float var32 = RangesKt.coerceIn(var9 * 0.35F, 16.0F, 24.0F);
                  Object var83 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
                  if (var6 == null) {
                     if (this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.isEmpty()) {
                        short var84 = 31801;
                        var108 = 13760;
                        String var33 = "No proxies configured";
                        float var34 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                           var33,
                           var30,
                           me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                        );
                        me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                           var33,
                           var19 + (var8 - var34) / 2,
                           var28 + (var29 - var30) / 2,
                           var30,
                           IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .b(),
                           (me.octo.client.utils.IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl)null,
                           32,
                           (Object)null);
                        if (var6 == null) {
                           break label467;
                        }
                     }

                     var83 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
                  }

                  Object var56 = var83;
                  boolean var58 = false;
                  int var35 = 0;

                  for (Object var37 : (Iterable<?>)(var56)) {
                     int var38 = var35++;
                     var86 = var38;
                     if (var6 != null) {
                        break label366;
                     }

                     if (var6 == null) {
                        if (var38 < 0) {
                           CollectionsKt.throwIndexOverflow();
                        }

                        var86 = var38;
                     }

                     me.octo.client.utils.llllllIlIlIIlIIllIIllllIllIlIlIllIIIlIIlIllllIlIllIIIIlllIIlIllIIlIIlIllIIIlIIIllIllI var39 = (me.octo.client.utils.llllllIlIlIIlIIllIIllllIllIlIlIllIIIlIIlIllllIlIllIIIIlllIIlIllIIlIIlIllIIIlIIIllIllI)var37;
                     int var40 = var86;
                     boolean var41 = false;
                     float var42 = var28
                        + var40 * (var9 + var10)
                        - this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.e();
                     float var43 = var19 + var12;
                     label354:
                     if (var6 == null && !(var42 + var9 < var28)) {
                        float var87 = var42;
                        float var110 = var28 + var29;
                        if (var6 == null) {
                           if (var42 > var110) {
                              break label354;
                           }

                           var87 = var43 + var8 - var12 * 2 - var32;
                           var110 = var12 * 0.5F;
                        }

                        float var44;
                        float var45;
                        int var88;
                        label350: {
                           label470: {
                              var44 = var87 - var110;
                              var45 = var42 + (var9 - var32) / 2;
                              float var133;
                              var88 = (var133 = var3 - var44) == 0.0F ? 0 : (var133 < 0.0F ? -1 : 1);
                              if (var6 == null) {
                                 if (var88 < 0) {
                                    break label470;
                                 }

                                 float var134;
                                 var88 = (var134 = var3 - (var44 + var32)) == 0.0F ? 0 : (var134 < 0.0F ? -1 : 1);
                              }

                              if (var6 == null) {
                                 if (var88 > 0) {
                                    break label470;
                                 }

                                 float var135;
                                 var88 = (var135 = var4 - var45) == 0.0F ? 0 : (var135 < 0.0F ? -1 : 1);
                              }

                              if (var6 == null) {
                                 if (var88 < 0) {
                                    break label470;
                                 }

                                 float var136;
                                 var88 = (var136 = var4 - (var45 + var32)) == 0.0F ? 0 : (var136 < 0.0F ? -1 : 1);
                              }

                              if (var6 != null) {
                                 break label350;
                              }

                              if (var88 <= 0) {
                                 var88 = 1;
                                 break label350;
                              }
                           }

                           var88 = 0;
                        }

                        int var46 = var88;
                        int var89 = var46;
                        if (var6 == null) {
                           if (var46 != 0) {
                              this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var40;
                           }

                           float var137;
                           var89 = (var137 = var3 - var43) == 0.0F ? 0 : (var137 < 0.0F ? -1 : 1);
                        }

                        label328: {
                           label471: {
                              if (var6 == null) {
                                 if (var89 < 0) {
                                    break label471;
                                 }

                                 float var138;
                                 var89 = (var138 = var3 - (var43 + var8 - var12 * 2)) == 0.0F ? 0 : (var138 < 0.0F ? -1 : 1);
                              }

                              if (var6 == null) {
                                 if (var89 > 0) {
                                    break label471;
                                 }

                                 float var139;
                                 var89 = (var139 = var4 - var42) == 0.0F ? 0 : (var139 < 0.0F ? -1 : 1);
                              }

                              if (var6 == null) {
                                 if (var89 < 0) {
                                    break label471;
                                 }

                                 float var140;
                                 var89 = (var140 = var4 - (var42 + var9)) == 0.0F ? 0 : (var140 < 0.0F ? -1 : 1);
                              }

                              if (var6 == null) {
                                 if (var89 > 0) {
                                    break label471;
                                 }

                                 var89 = var46;
                              }

                              if (var6 != null) {
                                 break label328;
                              }

                              if (var89 == 0) {
                                 var89 = 1;
                                 break label328;
                              }
                           }

                           var89 = 0;
                        }

                        int var47 = var89;
                        if (var47 != 0) {
                           this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var40;
                        }

                        Integer var90;
                        label301: {
                           if (this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll != null) {
                              var90 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
                              if (var6 != null) {
                                 break label301;
                              }

                              if (var90 == var40) {
                                 var90 = 1;
                                 break label301;
                              }
                           }

                           var90 = 0;
                        }

                        int var49;
                        label294: {
                           var49 = var90;
                           int var91 = var49;
                           if (var6 == null) {
                              if (var49 != 0) {
                                 var83 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                                    .a(0.15F);
                                 break label294;
                              }

                              var91 = var47;
                           }

                           var83 = var91 != 0
                              ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .ad()
                              : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .ac();
                        }

                        me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var48 = (me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll)var83;
                        float var93 = var43;
                        float var111 = var42;
                        if (var6 == null) {
                           me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                              var43,
                              var42,
                              var8 - var12 * 2,
                              var9,
                              var48,
                              lIllIlIlIlllllIIIIIlIlIIIlIIlIIlIIllIlIIIlIlIlIIIIIIIlIlIIlIlIlIIIIlIlIlIlIIIllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .a()
                           );
                           if (var49 != 0) {
                              me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                                 var43,
                                 var42,
                                 var8 - var12 * 2,
                                 var9,
                                 2.0F,
                                 IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
                                 lIllIlIlIlllllIIIIIlIlIIIlIIlIIlIIllIlIIIlIlIlIIIIIIIlIlIIlIlIlIIIIlIlIlIlIIIllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .a()
                              );
                           }

                           var93 = var42;
                           var111 = 4.0F;
                        }

                        float var50 = var93 - var111;
                        float var51 = var50 + var30 - 1.0F;
                        float var52 = var51 + var31 + 5.0F;
                        me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                           var39.a(),
                           var43 + var12 / 1.5F,
                           var51,
                           var30,
                           var49 != 0
                              ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                              : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .a(),
                           (me.octo.client.utils.IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl)null,
                           32,
                           (Object)null);
                        var83 = var39.b().name();
                        String var112 = var39.c();
                        int var116 = var39.d();
                        short var120 = 31807;
                        short var10004 = 18164;
                        String var53 = var83 + " • " + var112 + ":" + var116;
                        me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                           var53,
                           var43 + var12 / 1.5F,
                           var52,
                           var31,
                           IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .b(),
                           (me.octo.client.utils.IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl)null,
                           32,
                           (Object)null);
                        int var95 = var49;
                        if (var6 == null) {
                           if (var49 != 0) {
                              short var96 = 31799;
                              var108 = 18983;
                              String var54 = "Active";
                              float var55 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                                 var54,
                                 var31,
                                 me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                              );
                              me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                                 var54,
                                 var43 + var8 - var12 * 2 - var55 - var32 - var12,
                                 var52 - 7.0F,
                                 var31,
                                 IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
                                 (me.octo.client.utils.IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl)null,
                                 32,
                                 (Object)null);
                           }

                           var95 = var46;
                        }

                        me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var63 = var95 != 0
                           ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .aj()
                           : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .b();
                        var108 = 31792;
                        short var117 = -27151;
                        me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b(
                           me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                           "\n    <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n        <polyline points=\"3,6 5,6 21,6\"/>\n        <path d=\"M19 6v14a2 2 0 0 1-2 2H7a2 2 0 0 1-2-2V6m3 0V4a2 2 0 0 1 2-2h4a2 2 0 0 1 2 2v2\"/>\n        <line x1=\"10\" y1=\"11\" x2=\"10\" y2=\"17\"/>\n        <line x1=\"14\" y1=\"11\" x2=\"14\" y2=\"17\"/>\n    </svg>\n",
                           var44,
                           var45,
                           var32,
                           var32,
                           var63,
                           0.0F,
                           0.0F);
                     }

                     if (var6 != null) {
                        break;
                     }
                  }
               }

               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
               var86 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.size();
            }

            float var57 = var86 * (var9 + var10);
            this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = Math.max(0.0F, var57 - var29);
            llIIlIIlllllllIlIlIlllllIIllIIlllIlIllIlllIllIIlIlIllllIlIllIIIIIIIlIlIlllIlIIlIlllII var97 = this;
            if (var6 == null) {
               if (this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI > 0.0F) {
                  float var59 = 4.0F;
                  float var60 = var19 + var8 - var12 / 2 - var59;
                  float var61 = var29 / var57 * var29;
                  float var62 = var28
                     + this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.e()
                        / this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                        * (var29 - var61);
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                     var60,
                     var28,
                     var59,
                     var29,
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .ae(),
                     var59 / 2
                  );
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                     var60,
                     var62,
                     var59,
                     var61,
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
                     var59 / 2
                  );
               }

               var97 = this;
            }

            if (var97.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl != null) {
               var97.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.a(var3, var4, var5);
            } else {
               Object var99 = null;
            }

            if (var6 == null && this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl != null) {
               this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.e();
            } else {
               Object var100 = null;
            }

            if (var6 == null && this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll != null) {
               this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.a(var3, var4, var5);
            } else {
               Object var101 = null;
            }

            if (var6 == null && this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll != null) {
               this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.e();
            } else {
               Object var102 = null;
            }

            if (var6 == null && this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl != null) {
               this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.a(var3, var4, var5);
            } else {
               Object var103 = null;
            }

            if (var6 == null && this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl != null) {
               this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.e();
            } else {
               Object var104 = null;
            }

            NanoVG.nvgRestore(
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b()
            );
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
            return var7;
         }
      }

      return null;
   }

   @Override
   public boolean a(float var1, float var2, float var3, float var4, int var5) {
      int[] var6 = IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.g();
      llIIlIIlllllllIlIlIlllllIIllIIlllIlIllIlllIllIIlIlIllllIlIllIIIIIIIlIlIlllIlIIlIlllII var10000 = this;
      if (var6 == null) {
         if (this.b()) {
            return true;
         }

         var10000 = this;
      }

      if (var10000.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl != null) {
         IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl var9 = var10000.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         boolean var10 = false;
         if (var6 == null && var9.a(var3, var4, var5)) {
            return true;
         }
      }

      if (this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll != null) {
         IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl var23 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
         boolean var26 = false;
         if (var6 == null && var23.a(var3, var4, var5)) {
            return true;
         }
      }

      if (this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl != null) {
         IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl var24 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
         boolean var27 = false;
         if (var6 == null && var24.a(var3, var4, var5)) {
            return true;
         }
      }

      label138: {
      int var32 = var5;
      Integer var37;
      if (var6 == null) {
            if (var5 == 0) {
               float var7;
               float var11;
               float var12;
                float var13;
                float var34;
                label122: {
                  var7 = RangesKt.coerceIn(var1 * 0.4F, 400.0F, 700.0F);
                  float var8 = RangesKt.coerceIn(var2 * 0.065F, 45.0F, 65.0F);
                  float var25 = RangesKt.coerceIn(var2 * 0.012F, 6.0F, 14.0F);
                  float var28 = RangesKt.coerceIn(var2 * 0.028F, 18.0F, 32.0F);
                  var11 = RangesKt.coerceIn(var7 * 0.05F, 20.0F, 40.0F);
                  var12 = RangesKt.coerceIn(var2 * 0.055F, 38.0F, 55.0F);
                  var13 = var28 + var11 * 2;
                  byte var33 = (byte)(this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.isEmpty() ? 1 : 0);
                  if (var6 == null) {
                     if (var33 != 0) {
                        var34 = var8 * 2;
                        break label122;
                     }

                     var33 = 5;
                  }

                  var34 = var33 * (var8 + var25);
               }

                int var35;
                label116: {
                   label136: {
                     float var14 = var34;
                     float var15 = var12 + var11 * 2;
                     float var16 = var13 + var14 + var15 + var11;
                     float var17 = (var1 - var7) / 2;
                     float var18 = (var2 - var16) / 2;
                     float var38;
                     var35 = (var38 = var3 - var17) == 0.0F ? 0 : (var38 < 0.0F ? -1 : 1);
                     if (var6 == null) {
                        if (var35 < 0) {
                           break label136;
                        }

                        float var39;
                        var35 = (var39 = var3 - (var17 + var7)) == 0.0F ? 0 : (var39 < 0.0F ? -1 : 1);
                     }

                     if (var6 == null) {
                        if (var35 > 0) {
                           break label136;
                        }

                        float var40;
                        var35 = (var40 = var4 - var18) == 0.0F ? 0 : (var40 < 0.0F ? -1 : 1);
                     }

                     if (var6 == null) {
                        if (var35 < 0) {
                           break label136;
                        }

                        float var41;
                        var35 = (var41 = var4 - (var18 + var16)) == 0.0F ? 0 : (var41 < 0.0F ? -1 : 1);
                     }

                     if (var6 != null) {
                        break label116;
                     }

                     if (var35 <= 0) {
                        var35 = 1;
                        break label116;
                     }
                  }

                  var35 = 0;
               }

               int var19 = var35;
               if (var6 != null) {
                  return var19 != 0;
               }

               if (var19 == 0) {
                  this.d();
                  return true;
               }

               Integer var20 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
               var37 = var20;
               if (var6 == null) {
                  if (var20 != null) {
                     int var29 = var20.intValue();
                     boolean var30 = false;
                     me.octo.client.utils.IIIllIIlllIlIlllllllIlIllIIIlIllllIIIllllllIlllllIIlIlIIllIlIIIIlllIIllllIlllIlIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(var29);
                     this.g();
                     return true;
                  }

                  var20 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
                  var37 = var20;
               }

               if (var6 != null) {
                  break label138;
               }

               if (var37 != null) {
                  var37 = var20;
                  break label138;
               }
            }

            var32 = 0;
         }

         return var32 != 0;
      }

      int var21 = var37.intValue();
      boolean var22 = false;
      me.octo.client.utils.IIIllIIlllIlIlllllllIlIllIIIlIllllIIIllllllIlllllIIlIlIIllIlIIIIlllIIllllIlllIlIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(var21);
      this.g();
      return true;
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

   private static final Unit a(llIIlIIlllllllIlIlIlllllIIllIIlllIlIllIlllIllIIlIlIllllIlIllIIIIIIIlIlIlllIlIIlIlllII var0) {
      var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.a(var0);
      return Unit.INSTANCE;
   }

   private static final Unit b(llIIlIIlllllllIlIlIlllllIIllIIlllIlIllIlllIllIIlIlIllllIlIllIIIIIIIlIlIlllIlIIlIlllII var0) {
      int[] var1 = IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.g();
      llIIlIIlllllllIlIlIlllllIIllIIlllIlIllIlllIllIIlIlIllllIlIllIIIIIIIlIlIlllIlIIlIlllII var10000 = var0;
      if (var1 == null) {
         if (var0.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll == null) {
            return Unit.INSTANCE;
         }

         me.octo.client.utils.IIIllIIlllIlIlllllllIlIllIIIlIllllIIIllllllIlllllIIlIlIIllIlIIIIlllIIllllIlllIlIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .d();
         var10000 = var0;
      }

      var10000.g();
      return Unit.INSTANCE;
   }

   private static final Unit c(llIIlIIlllllllIlIlIlllllIIllIIlllIlIllIlllIllIIlIlIllllIlIllIIIIIIIlIlIlllIlIIlIlllII var0) {
      var0.d();
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[16];
      int var3 = 0;
      String var2 = "¤e¯Õ»x\u0089\u0005g\u0012,\u008cSÍ\u008c\u008d~éúÚî¢µÈ½å.\u0091Å\u0013á\r\u0086´\u0017ÔÛ´a¡Ë\u0085\u0094\u0088\u0096]µÚ\u0003ëÊÑÙÈ,¥µ?³RRù\u0090W)\u0089BëRÛÊ¾\u0084Ù\u001c8£½õ B9¾ÂE¡{\u008fu¬ú\u0095\u0003¶û 4å1¼{ Zóú\u00877p¾;0Öãþ*\fUá®Ôó+\u0089\nçë\u001e\u0004,é\u0018\u009af°¶ØÜ\u0086<µeÌC\u0093òÏÞ\u0014ïÆx\u0082èáäT\u001cÒ¶½gN\u0098\u0005\u009d\u001eqõbÇ\u0082\u0091Í\u0095ÜPâå5!\u0001AÃR¶@Lµ\tTR\u0018}dçg4\u0090Z\u008e£YÅÒÐÚBn³sC¾\u0096\rb\u009b\u0092\u008a:\u0003]\u2073+\u0003\u0081&¹\u0015Û1X\u0088lã|jñþ\u008b\u0090ÙÆ\"~\r¢i\tÀ\u0010\u0084ÉëåØLy\b×«`c\bÚ9õ»¢Ô»ÂB£ªDC\u0094Éî\u0007[\u0096ñ$Ýàòï¥\u00954þã¼Ù<Å\u0003©\u0097þ\u009báë±ìàÿ@\u00174\tOGíf«Yâ\nÄû\u007f?cöw\u0002\u009eU2Ó\u0092Iö\u009d\u008ceCÉÉ8Zuñjþ[\u0082Q\u008eÓ¹úoj\nàô¢\u0095)\u0000w YM\u0004¡\u0084\u0083:\u0098@¢û!/\u008f\u000e×\u0013\r\u0007w\u0001\fZnAW\u0094j^y\u008fª«²Ä¯ðuF\u0087c\u0097\u001e¿Ä\u001a¼ê\u0017\u000fÊÖ\u001aþË_/ÓTr¥»KÜ®@¼\u0007kCûRPB\u000eð,#0\u008b^D063\u0016\u0098\u0018£\u0004õ·ÓM\u0004ý¯ÒN\u0007¥p\u008fw¿,\t\u0006&]]\u0091\u0016ðŊ\u009b£\u009c,¦~6ÿÐã»\u0000I\u0086_J\u001dªÇ\u001c\u000bx\t\u008fm\u0094Î7r\u0018Ê\u0012®\u0089¼\u000f\u000flp[l7eÚG\u0092\u008eV_Ü~\fî\u0019gÄ¬\u0014\u0084\u0099LC\u009c\u0089êån\u0018yQùøZ¾J´;,£Ebõv`7dfÔù}\u0092\u0006êVúv\u0083ô¬q¨93(ã(×¾\u000f¬a©\u0014Q£ÿ\u0087\t\u001dýDä\u008cm«s\u008c\u0006\u0011\u0098\u0017ôO7_h\u0092æ°p!µ÷7ø-ø\u0099ÿÁ#dÁ=\u0081Ï²¡`Þ\u009c\u008e¹9(6\u0005\u001e\u001b«£-CBÚ¼\u0012¶X9ªckà\u008c2¢Xa\u009b\u0006óØKþØ%s\u0005;×d\u000fu\rG»ÝÐ\ná)¿}ãH\u008f¦ÛÊ|0¬j\u0003%àü)x\u0094ê¶\u000b\u0005qÀ*ðc¯\u009b\u0092¥ñVG%\u0081>\u0084GZ\u009aÙE\\àhÔw\u0001¤z!Q\u0088skj\u009cwM\u0017Áb`yë\u0082Èî\u0012 ðF¾\u007f\u008eÀß\u001c\u008a)¹\"\u0086³¶ T÷ð0\u0014\u009c3\u0013\t\u0011³\u0015\u0011êÆ\u0095JnÕ%2\u0015¿ÖxN\u0082Pcv\b¢gy\u0093\u0017WÝ«";
      int var4 = "¤e¯Õ»x\u0089\u0005g\u0012,\u008cSÍ\u008c\u008d~éúÚî¢µÈ½å.\u0091Å\u0013á\r\u0086´\u0017ÔÛ´a¡Ë\u0085\u0094\u0088\u0096]µÚ\u0003ëÊÑÙÈ,¥µ?³RRù\u0090W)\u0089BëRÛÊ¾\u0084Ù\u001c8£½õ B9¾ÂE¡{\u008fu¬ú\u0095\u0003¶û 4å1¼{ Zóú\u00877p¾;0Öãþ*\fUá®Ôó+\u0089\nçë\u001e\u0004,é\u0018\u009af°¶ØÜ\u0086<µeÌC\u0093òÏÞ\u0014ïÆx\u0082èáäT\u001cÒ¶½gN\u0098\u0005\u009d\u001eqõbÇ\u0082\u0091Í\u0095ÜPâå5!\u0001AÃR¶@Lµ\tTR\u0018}dçg4\u0090Z\u008e£YÅÒÐÚBn³sC¾\u0096\rb\u009b\u0092\u008a:\u0003]\u2073+\u0003\u0081&¹\u0015Û1X\u0088lã|jñþ\u008b\u0090ÙÆ\"~\r¢i\tÀ\u0010\u0084ÉëåØLy\b×«`c\bÚ9õ»¢Ô»ÂB£ªDC\u0094Éî\u0007[\u0096ñ$Ýàòï¥\u00954þã¼Ù<Å\u0003©\u0097þ\u009báë±ìàÿ@\u00174\tOGíf«Yâ\nÄû\u007f?cöw\u0002\u009eU2Ó\u0092Iö\u009d\u008ceCÉÉ8Zuñjþ[\u0082Q\u008eÓ¹úoj\nàô¢\u0095)\u0000w YM\u0004¡\u0084\u0083:\u0098@¢û!/\u008f\u000e×\u0013\r\u0007w\u0001\fZnAW\u0094j^y\u008fª«²Ä¯ðuF\u0087c\u0097\u001e¿Ä\u001a¼ê\u0017\u000fÊÖ\u001aþË_/ÓTr¥»KÜ®@¼\u0007kCûRPB\u000eð,#0\u008b^D063\u0016\u0098\u0018£\u0004õ·ÓM\u0004ý¯ÒN\u0007¥p\u008fw¿,\t\u0006&]]\u0091\u0016ðŊ\u009b£\u009c,¦~6ÿÐã»\u0000I\u0086_J\u001dªÇ\u001c\u000bx\t\u008fm\u0094Î7r\u0018Ê\u0012®\u0089¼\u000f\u000flp[l7eÚG\u0092\u008eV_Ü~\fî\u0019gÄ¬\u0014\u0084\u0099LC\u009c\u0089êån\u0018yQùøZ¾J´;,£Ebõv`7dfÔù}\u0092\u0006êVúv\u0083ô¬q¨93(ã(×¾\u000f¬a©\u0014Q£ÿ\u0087\t\u001dýDä\u008cm«s\u008c\u0006\u0011\u0098\u0017ôO7_h\u0092æ°p!µ÷7ø-ø\u0099ÿÁ#dÁ=\u0081Ï²¡`Þ\u009c\u008e¹9(6\u0005\u001e\u001b«£-CBÚ¼\u0012¶X9ªckà\u008c2¢Xa\u009b\u0006óØKþØ%s\u0005;×d\u000fu\rG»ÝÐ\ná)¿}ãH\u008f¦ÛÊ|0¬j\u0003%àü)x\u0094ê¶\u000b\u0005qÀ*ðc¯\u009b\u0092¥ñVG%\u0081>\u0084GZ\u009aÙE\\àhÔw\u0001¤z!Q\u0088skj\u009cwM\u0017Áb`yë\u0082Èî\u0012 ðF¾\u007f\u008eÀß\u001c\u008a)¹\"\u0086³¶ T÷ð0\u0014\u009c3\u0013\t\u0011³\u0015\u0011êÆ\u0095JnÕ%2\u0015¿ÖxN\u0082Pcv\b¢gy\u0093\u0017WÝ«"
         .length();
      char var1 = 7;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 14;
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
                     case 0 -> 123;
                     case 1 -> 5;
                     case 2 -> 36;
                     case 3 -> 51;
                     case 4 -> 122;
                     case 5 -> 74;
                     default -> 53;
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
                     b = new String[16];
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

                  var2 = "Ìî\u008ay\u00984^\u0083_\u0010\u001c\u0002æ\u0091 ï¡nr$u:k\u0095\u008byjb\\\u0088s¡õ¹÷{¨?iéÆ}\u0014Ø{R·\u0005Ð4Ý\u0019 \u0005âú f%>Ô8FAµÃ¶©Ü,õ\u0080\u0091WÔK2\u0095æJ»ÃÀuSRË\u0081°+[`ÿp[Çpµ\u0017nHâåÀD\fRÌA\n\u0002\u0017^gØyztÖ\u0091\\\u0000}aôµ\u00800\u0003ð\u0006_¼ú_ç\u0092ZI\u0006,Tù.öÞ\u0093Þúë-?\u009b-Ã J\u0091(i\u009c3\u0016uWÏ±`)\u008a\u0017§\u0084µì¨\u0012{\u0089ô\u0085\u0089\u0084±°V\u0002¾\rÒ5&\u0002\rGã!P&,\u0088C3mò\r*(\bá7t´Ê\u008c\rõDX";
                  var4 = "Ìî\u008ay\u00984^\u0083_\u0010\u001c\u0002æ\u0091 ï¡nr$u:k\u0095\u008byjb\\\u0088s¡õ¹÷{¨?iéÆ}\u0014Ø{R·\u0005Ð4Ý\u0019 \u0005âú f%>Ô8FAµÃ¶©Ü,õ\u0080\u0091WÔK2\u0095æJ»ÃÀuSRË\u0081°+[`ÿp[Çpµ\u0017nHâåÀD\fRÌA\n\u0002\u0017^gØyztÖ\u0091\\\u0000}aôµ\u00800\u0003ð\u0006_¼ú_ç\u0092ZI\u0006,Tù.öÞ\u0093Þúë-?\u009b-Ã J\u0091(i\u009c3\u0016uWÏ±`)\u008a\u0017§\u0084µì¨\u0012{\u0089ô\u0085\u0089\u0084±°V\u0002¾\rÒ5&\u0002\rGã!P&,\u0088C3mò\r*(\bá7t´Ê\u008c\rõDX"
                     .length();
                  var1 = 205;
                  var8 = -1;
            }

            var10000 = 17;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 31804) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 252;
            case 1 -> 180;
            case 2 -> 145;
            case 3 -> 107;
            case 4 -> 58;
            case 5 -> 201;
            case 6 -> 48;
            case 7 -> 181;
            case 8 -> 93;
            case 9 -> 104;
            case 10 -> 41;
            case 11 -> 80;
            case 12 -> 49;
            case 13 -> 225;
            case 14 -> 238;
            case 15 -> 114;
            case 16 -> 6;
            case 17 -> 202;
            case 18 -> 55;
            case 19 -> 61;
            case 20 -> 8;
            case 21 -> 132;
            case 22 -> 109;
            case 23 -> 228;
            case 24 -> 79;
            case 25 -> 39;
            case 26 -> 87;
            case 27 -> 227;
            case 28 -> 83;
            case 29 -> 59;
            case 30 -> 54;
            case 31 -> 45;
            case 32 -> 88;
            case 33 -> 249;
            case 34 -> 158;
            case 35 -> 226;
            case 36 -> 29;
            case 37 -> 188;
            case 38 -> 182;
            case 39 -> 51;
            case 40 -> 236;
            case 41 -> 170;
            case 42 -> 118;
            case 43 -> 135;
            case 44 -> 34;
            case 45 -> 184;
            case 46 -> 52;
            case 47 -> 77;
            case 48 -> 101;
            case 49 -> 142;
            case 50 -> 185;
            case 51 -> 66;
            case 52 -> 230;
            case 53 -> 129;
            case 54 -> 31;
            case 55 -> 71;
            case 56 -> 203;
            case 57 -> 251;
            case 58 -> 115;
            case 59 -> 235;
            case 60 -> 122;
            case 61 -> 177;
            case 62 -> 117;
            case 63 -> 89;
            case 64 -> 23;
            case 65 -> 173;
            case 66 -> 74;
            case 67 -> 191;
            case 68 -> 119;
            case 69 -> 214;
            case 70 -> 90;
            case 71 -> 162;
            case 72 -> 244;
            case 73 -> 10;
            case 74 -> 100;
            case 75 -> 106;
            case 76 -> 16;
            case 77 -> 198;
            case 78 -> 210;
            case 79 -> 125;
            case 80 -> 92;
            case 81 -> 159;
            case 82 -> 215;
            case 83 -> 21;
            case 84 -> 2;
            case 85 -> 139;
            case 86 -> 78;
            case 87 -> 38;
            case 88 -> 189;
            case 89 -> 196;
            case 90 -> 239;
            case 91 -> 72;
            case 92 -> 85;
            case 93 -> 152;
            case 94 -> 75;
            case 95 -> 32;
            case 96 -> 154;
            case 97 -> 219;
            case 98 -> 94;
            case 99 -> 20;
            case 100 -> 27;
            case 101 -> 84;
            case 102 -> 175;
            case 103 -> 168;
            case 104 -> 220;
            case 105 -> 25;
            case 106 -> 183;
            case 107 -> 35;
            case 108 -> 254;
            case 109 -> 204;
            case 110 -> 213;
            case 111 -> 70;
            case 112 -> 255;
            case 113 -> 105;
            case 114 -> 69;
            case 115 -> 199;
            case 116 -> 245;
            case 117 -> 97;
            case 118 -> 127;
            case 119 -> 46;
            case 120 -> 150;
            case 121 -> 172;
            case 122 -> 155;
            case 123 -> 174;
            case 124 -> 7;
            case 125 -> 91;
            case 126 -> 44;
            case 127 -> 82;
            case 128 -> 37;
            case 129 -> 153;
            case 130 -> 241;
            case 131 -> 164;
            case 132 -> 53;
            case 133 -> 240;
            case 134 -> 102;
            case 135 -> 237;
            case 136 -> 108;
            case 137 -> 218;
            case 138 -> 131;
            case 139 -> 0;
            case 140 -> 176;
            case 141 -> 19;
            case 142 -> 163;
            case 143 -> 123;
            case 144 -> 5;
            case 145 -> 248;
            case 146 -> 165;
            case 147 -> 18;
            case 148 -> 169;
            case 149 -> 36;
            case 150 -> 205;
            case 151 -> 96;
            case 152 -> 57;
            case 153 -> 222;
            case 154 -> 26;
            case 155 -> 43;
            case 156 -> 211;
            case 157 -> 231;
            case 158 -> 207;
            case 159 -> 14;
            case 160 -> 98;
            case 161 -> 216;
            case 162 -> 250;
            case 163 -> 146;
            case 164 -> 33;
            case 165 -> 116;
            case 166 -> 233;
            case 167 -> 62;
            case 168 -> 195;
            case 169 -> 190;
            case 170 -> 193;
            case 171 -> 167;
            case 172 -> 110;
            case 173 -> 136;
            case 174 -> 224;
            case 175 -> 12;
            case 176 -> 156;
            case 177 -> 206;
            case 178 -> 197;
            case 179 -> 9;
            case 180 -> 56;
            case 181 -> 209;
            case 182 -> 11;
            case 183 -> 63;
            case 184 -> 253;
            case 185 -> 223;
            case 186 -> 128;
            case 187 -> 138;
            case 188 -> 217;
            case 189 -> 221;
            case 190 -> 67;
            case 191 -> 160;
            case 192 -> 141;
            case 193 -> 194;
            case 194 -> 22;
            case 195 -> 242;
            case 196 -> 130;
            case 197 -> 157;
            case 198 -> 246;
            case 199 -> 171;
            case 200 -> 28;
            case 201 -> 147;
            case 202 -> 47;
            case 203 -> 134;
            case 204 -> 208;
            case 205 -> 232;
            case 206 -> 68;
            case 207 -> 112;
            case 208 -> 4;
            case 209 -> 200;
            case 210 -> 192;
            case 211 -> 81;
            case 212 -> 178;
            case 213 -> 187;
            case 214 -> 30;
            case 215 -> 65;
            case 216 -> 229;
            case 217 -> 133;
            case 218 -> 113;
            case 219 -> 124;
            case 220 -> 73;
            case 221 -> 60;
            case 222 -> 120;
            case 223 -> 166;
            case 224 -> 243;
            case 225 -> 161;
            case 226 -> 15;
            case 227 -> 212;
            case 228 -> 99;
            case 229 -> 40;
            case 230 -> 151;
            case 231 -> 3;
            case 232 -> 42;
            case 233 -> 76;
            case 234 -> 50;
            case 235 -> 247;
            case 236 -> 144;
            case 237 -> 111;
            case 238 -> 13;
            case 239 -> 143;
            case 240 -> 234;
            case 241 -> 126;
            case 242 -> 121;
            case 243 -> 140;
            case 244 -> 103;
            case 245 -> 137;
            case 246 -> 24;
            case 247 -> 86;
            case 248 -> 148;
            case 249 -> 1;
            case 250 -> 186;
            case 251 -> 149;
            case 252 -> 64;
            case 253 -> 17;
            case 254 -> 179;
            default -> 95;
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
