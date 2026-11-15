package me.octo.client;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.FloatRef;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI
   extends IlIlIllIlIlllIllIlIIIIllIIIIIIIIlIlllllIlIlllIIIlIllIIIllIlIIlllllIllllIIllIllllIllII {

   @NotNull
   private final IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private final llIIlIIlllllllIlIlIlllllIIllIIlllIlIllIlllIllIIlIlIllllIlIllIIIIIIIlIlIlllIlIIlIlllII IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private final Minecraft IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private String lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private me.octo.client.utils.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private String llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private String lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private String lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private String lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private boolean lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @Nullable
   private lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private int llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private float IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @NotNull
   private final lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private boolean IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private float IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private float llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   @Nullable
   private IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   @Nullable
   private IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   private static String[] a;
   private static String[] b;

   public lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI(
      @NotNull IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll var1,
      @NotNull llIIlIIlllllllIlIlIlllllIIllIIlllIlIllIlllIllIIlIlIllllIlIllIIIIIIIlIlIlllIlIIlIlllII var2
   ) {
      short var10001 = -26069;
      short var10002 = 10798;
      Intrinsics.checkNotNullParameter(var1, "mainMenu");
      var10001 = -26073;
      var10002 = -29791;
      Intrinsics.checkNotNullParameter(var2, "proxyManagerPopup");
      super();
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var2;
      Minecraft var4 = Minecraft.getInstance();
      short var10003 = -26056;
      short var10004 = 30254;
      Intrinsics.checkNotNullExpressionValue(var4, "getInstance(...)");
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var4;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = "";
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = me.octo.client.utils.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = "";
      var10001 = -26071;
      var10002 = 13125;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = "1080";
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = "";
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = "";
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = true;
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII();
   }

   @Nullable
   public Float a(float param1, float param2, float param3, float param4, float param5) {
      int[] var6 = me.octo.client.IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.g();
      Float var0 = this.e();
      if (var0 == null) {
         return null;
      }
      float f6 = var0.floatValue();
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl += param5;
      float f7 = kotlin.ranges.RangesKt.coerceIn(param1 * 0.35f, 380.0f, 550.0f);
      float f8 = kotlin.ranges.RangesKt.coerceIn(param2 * 0.055f, 38.0f, 50.0f);
      float f9 = kotlin.ranges.RangesKt.coerceIn(param2 * 0.015f, 8.0f, 16.0f);
      float f10 = kotlin.ranges.RangesKt.coerceIn(param2 * 0.028f, 18.0f, 32.0f);
      float f11 = kotlin.ranges.RangesKt.coerceIn(param2 * 0.017f, 12.0f, 18.0f);
      float f12 = kotlin.ranges.RangesKt.coerceIn(param2 * 0.017f, 12.0f, 18.0f);
      float f13 = kotlin.ranges.RangesKt.coerceIn(f7 * 0.06f, 20.0f, 40.0f);
      float f14 = kotlin.ranges.RangesKt.coerceIn(param2 * 0.055f, 38.0f, 55.0f);
      int n15 = 4;
      int n16 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII == me.octo.client.utils.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI && this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll ? 2 : 0;
      int n17 = n15 + n16;
      float f18 = f14 * 0.6f;
      float f19 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII == me.octo.client.utils.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ? f18 + f9 : 0.0f;
      float f20 = (float)n17 * (f11 + 5.0f + f8 + f9);
      float f21 = f10 + f13 * 2;
      float f22 = f14 + f13 * 2;
      float f23 = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll ? 2 * (f8 + 4.0f) : 0.0f;
      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = f21 + f20 + f19 + f22 + f13 + f23;
      if (this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl == 0.0f) {
         this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
      }
      float f24 = this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI - this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl + f24 * 0.2f;
      f24 = this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
      float f25 = (param1 - f7) / 2;
      float f26 = (param2 - f24) / 2;
      float f27 = (f7 - f13 * 3) / 2;
      float f28 = f26 + f24 - f14 - f13;
      if (this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll == null) {
         this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = new IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl(
            f25 + f13,
            f28,
            f27,
            f14,
            "Add",
            "\n    <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n        <line x1=\"12\" y1=\"5\" x2=\"12\" y2=\"19\"/>\n        <line x1=\"5\" y1=\"12\" x2=\"19\" y2=\"12\"/>\n    </svg>\n",
            null,
            new kotlin.jvm.functions.Function0<Unit>() {
               public Unit invoke() {
                  return me.octo.client.lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a(me.octo.client.lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.this);
               }
            },
            64,
            null
         );
      }
      IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl var36;
      var36 = this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
      if (var36 != null) {
         var36.a(f25 + f13);
      }
      var36 = this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
      if (var36 != null) {
         var36.b(f28);
      }
      var36 = this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
      if (var36 != null) {
         var36.c(f27);
      }
      var36 = this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
      if (var36 != null) {
         var36.d(f14);
      }
      if (this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll == null) {
         this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = new IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl(
            f25 + f13 + f27 + f13,
            f28,
            f27,
            f14,
            "Cancel",
            "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n            <line x1=\"18\" y1=\"6\" x2=\"6\" y2=\"18\"/>\n            <line x1=\"6\" y1=\"6\" x2=\"18\" y2=\"18\"/>\n        </svg>\n",
            null,
            new kotlin.jvm.functions.Function0<Unit>() {
               public Unit invoke() {
                  return me.octo.client.lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.b(me.octo.client.lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.this);
               }
            },
            64,
            null
         );
      }
      IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl var37;
      var37 = this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
      if (var37 != null) {
         var37.a(f25 + f13 + f27 + f13);
      }
      var37 = this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
      if (var37 != null) {
         var37.b(f28);
      }
      var37 = this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
      if (var37 != null) {
         var37.c(f27);
      }
      var37 = this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
      if (var37 != null) {
         var37.d(f14);
      }
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
      org.lwjgl.nanovg.NanoVG.nvgSave(me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b());
      float f29 = 0.9f + f6 * 0.1f;
      float f30 = f25 + f7 / 2;
      float f31 = f26 + f24 / 2;
      org.lwjgl.nanovg.NanoVG.nvgTranslate(me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(), f30, f31);
      org.lwjgl.nanovg.NanoVG.nvgScale(me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(), f29, f29);
      org.lwjgl.nanovg.NanoVG.nvgTranslate(me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(), -f30, -f31);
      org.lwjgl.nanovg.NanoVG.nvgGlobalAlpha(me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(), f6);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(f25, f26, f7, f24, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.ac(), me.octo.client.lIllIlIlIlllllIIIIIlIlIIIlIIlIIlIIllIlIIIlIlIlIIIIIIIlIlIIlIlIlIIIIlIlIlIlIIIllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c());
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(f25, f26, f7, f24, 1.0f, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.af(), me.octo.client.lIllIlIlIlllllIIIIIlIlIIIlIIlIIlIIllIlIIIlIlIlIIIIIIIlIlIIlIlIlIIIIlIlIlIlIIIllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c());
      String s32 = "Add Proxy";
      float f32 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(s32, f13, me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(s32, f25 + (f7 - f32) / 2, f26 + f13, f13, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(), (me.octo.client.utils.IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl)null, 32, null);
      float f33 = f26 + f21 + f13;
      f33 = this.a("Proxy Name", this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll, me.octo.client.lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, false, f25, f33, f7, f8, f9, f11, f12, f13, param3, param4);
      f33 = this.a(f25, f33, f7, f8, f9, f11, f12, f13, param3, param4);
      f33 = this.a("IP Address", this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI, me.octo.client.lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, false, f25, f33, f7, f8, f9, f11, f12, f13, param3, param4);
      f33 = this.a("Port", this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, me.octo.client.lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, false, f25, f33, f7, f8, f9, f11, f12, f13, param3, param4);
      if (this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII == me.octo.client.utils.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
         f33 = this.a(f25, f33, f7, f18, f9, f11, f13, param3, param4);
         if (this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll) {
            f33 = this.a("Username", this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI, me.octo.client.lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, false, f25, f33, f7, f8, f9, f11, f12, f13, param3, param4);
            f33 = this.a("Password", this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl, me.octo.client.lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, true, f25, f33, f7, f8, f9, f11, f12, f13, param3, param4);
         }
      }
      IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl var38 = this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
      if (var38 != null) {
         var38.a(param3, param4, param5);
         var38.e();
      }
      IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl var39 = this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
      if (var39 != null) {
         var39.a(param3, param4, param5);
         var39.e();
      }
      org.lwjgl.nanovg.NanoVG.nvgRestore(me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b());
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
      return Float.valueOf(f6);
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.g ()[I
      // 003: astore 6
      // 005: aload 6
      // 007: ifnonnull 024
      // 00a: aload 0
      // 00b: invokevirtual me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.e ()Ljava/lang/Float;
      // 00e: dup
      // 00f: ifnull 023
      // 012: goto 019
      // 015: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 018: athrow
      // 019: invokevirtual java/lang/Float.floatValue ()F
      // 01c: goto 026
      // 01f: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 022: athrow
      // 023: pop
      // 024: aconst_null
      // 025: areturn
      // 026: fstore 7
      // 028: aload 0
      // 029: aload 0
      // 02a: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl F
      // 02d: fload 5
      // 02f: fadd
      // 030: putfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl F
      // 033: fload 1
      // 034: ldc 0.35
      // 036: fmul
      // 037: ldc 380.0
      // 039: ldc 550.0
      // 03b: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 03e: fstore 8
      // 040: fload 2
      // 041: ldc 0.055
      // 043: fmul
      // 044: ldc 38.0
      // 046: ldc 50.0
      // 048: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 04b: fstore 9
      // 04d: fload 2
      // 04e: ldc 0.015
      // 050: fmul
      // 051: ldc 8.0
      // 053: ldc 16.0
      // 055: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 058: fstore 10
      // 05a: fload 2
      // 05b: ldc 0.028
      // 05d: fmul
      // 05e: ldc 18.0
      // 060: ldc 32.0
      // 062: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 065: fstore 11
      // 067: fload 2
      // 068: ldc 0.017
      // 06a: fmul
      // 06b: ldc 12.0
      // 06d: ldc 18.0
      // 06f: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 072: fstore 12
      // 074: fload 2
      // 075: ldc 0.017
      // 077: fmul
      // 078: ldc 12.0
      // 07a: ldc 18.0
      // 07c: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 07f: fstore 13
      // 081: fload 8
      // 083: ldc 0.06
      // 085: fmul
      // 086: ldc 20.0
      // 088: ldc 40.0
      // 08a: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 08d: fstore 14
      // 08f: fload 2
      // 090: ldc 0.055
      // 092: fmul
      // 093: ldc 38.0
      // 095: ldc 55.0
      // 097: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 09a: fstore 15
      // 09c: bipush 4
      // 09d: istore 16
      // 09f: aload 0
      // 0a0: aload 6
      // 0a2: ifnonnull 0bd
      // 0a5: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lme/octo/client/utils/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 0a8: getstatic me/octo/client/utils/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/utils/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 0ab: if_acmpne 0d3
      // 0ae: goto 0b5
      // 0b1: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0b4: athrow
      // 0b5: aload 0
      // 0b6: goto 0bd
      // 0b9: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0bc: athrow
      // 0bd: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll Z
      // 0c0: aload 6
      // 0c2: ifnonnull 0d0
      // 0c5: ifeq 0d3
      // 0c8: goto 0cf
      // 0cb: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0ce: athrow
      // 0cf: bipush 2
      // 0d0: goto 0d4
      // 0d3: bipush 0
      // 0d4: istore 17
      // 0d6: iload 16
      // 0d8: iload 17
      // 0da: iadd
      // 0db: istore 18
      // 0dd: fload 15
      // 0df: ldc 0.6
      // 0e1: fmul
      // 0e2: fstore 19
      // 0e4: aload 0
      // 0e5: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lme/octo/client/utils/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 0e8: getstatic me/octo/client/utils/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/utils/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 0eb: if_acmpne 0fa
      // 0ee: fload 19
      // 0f0: fload 10
      // 0f2: fadd
      // 0f3: goto 0fb
      // 0f6: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0f9: athrow
      // 0fa: fconst_0
      // 0fb: fstore 20
      // 0fd: iload 18
      // 0ff: i2f
      // 100: fload 12
      // 102: ldc 5.0
      // 104: fadd
      // 105: fload 9
      // 107: fadd
      // 108: fload 10
      // 10a: fadd
      // 10b: fmul
      // 10c: fstore 21
      // 10e: fload 11
      // 110: fload 14
      // 112: bipush 2
      // 113: i2f
      // 114: fmul
      // 115: fadd
      // 116: fstore 22
      // 118: fload 15
      // 11a: fload 14
      // 11c: bipush 2
      // 11d: i2f
      // 11e: fmul
      // 11f: fadd
      // 120: fstore 23
      // 122: aload 0
      // 123: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll Z
      // 126: aload 6
      // 128: ifnonnull 136
      // 12b: ifeq 140
      // 12e: goto 135
      // 131: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 134: athrow
      // 135: bipush 2
      // 136: i2f
      // 137: fload 9
      // 139: ldc 4.0
      // 13b: fadd
      // 13c: fmul
      // 13d: goto 141
      // 140: fconst_0
      // 141: fstore 24
      // 143: aload 0
      // 144: fload 22
      // 146: fload 21
      // 148: fadd
      // 149: fload 20
      // 14b: fadd
      // 14c: fload 23
      // 14e: fadd
      // 14f: fload 14
      // 151: fadd
      // 152: fload 24
      // 154: fadd
      // 155: putfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI F
      // 158: aload 0
      // 159: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl F
      // 15c: fconst_0
      // 15d: fcmpg
      // 15e: aload 6
      // 160: ifnonnull 16e
      // 163: ifne 171
      // 166: goto 16d
      // 169: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 16c: athrow
      // 16d: bipush 1
      // 16e: goto 172
      // 171: bipush 0
      // 172: ifeq 189
      // 175: aload 0
      // 176: aload 0
      // 177: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI F
      // 17a: putfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl F
      // 17d: aload 6
      // 17f: ifnull 1a2
      // 182: goto 189
      // 185: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 188: athrow
      // 189: aload 0
      // 18a: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI F
      // 18d: aload 0
      // 18e: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl F
      // 191: fsub
      // 192: fstore 25
      // 194: aload 0
      // 195: aload 0
      // 196: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl F
      // 199: fload 25
      // 19b: ldc 0.2
      // 19d: fmul
      // 19e: fadd
      // 19f: putfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl F
      // 1a2: aload 0
      // 1a3: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl F
      // 1a6: fstore 25
      // 1a8: fload 1
      // 1a9: fload 8
      // 1ab: fsub
      // 1ac: bipush 2
      // 1ad: i2f
      // 1ae: fdiv
      // 1af: fstore 26
      // 1b1: fload 2
      // 1b2: fload 25
      // 1b4: fsub
      // 1b5: bipush 2
      // 1b6: i2f
      // 1b7: fdiv
      // 1b8: fstore 27
      // 1ba: fload 8
      // 1bc: fload 14
      // 1be: bipush 3
      // 1bf: i2f
      // 1c0: fmul
      // 1c1: fsub
      // 1c2: fconst_2
      // 1c3: fdiv
      // 1c4: fstore 28
      // 1c6: fload 27
      // 1c8: fload 25
      // 1ca: fadd
      // 1cb: fload 15
      // 1cd: fsub
      // 1ce: fload 14
      // 1d0: fsub
      // 1d1: fstore 29
      // 1d3: aload 0
      // 1d4: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll Lme/octo/client/IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl;
      // 1d7: aload 6
      // 1d9: ifnonnull 22f
      // 1dc: ifnonnull 224
      // 1df: goto 1e6
      // 1e2: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1e5: athrow
      // 1e6: aload 0
      // 1e7: new me/octo/client/IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl
      // 1ea: dup
      // 1eb: fload 26
      // 1ed: fload 14
      // 1ef: fadd
      // 1f0: fload 29
      // 1f2: fload 28
      // 1f4: fload 15
      // 1f6: sipush -26074
      // 1f9: sipush -21378
      // 1fc: pop2
      // 1fd: ldc "Add"
      // 1ff: sipush -26065
      // 202: sipush 16271
      // 205: pop2
      // 206: ldc "\n    <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n        <line x1=\"12\" y1=\"5\" x2=\"12\" y2=\"19\"/>\n        <line x1=\"5\" y1=\"12\" x2=\"19\" y2=\"12\"/>\n    </svg>\n"
      // 208: aconst_null
      // 209: aload 0
      // 20a: invokedynamic invoke (Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI;)Lkotlin/Unit;, ()Lkotlin/Unit; ]
      // 20f: bipush 64
      // 211: aconst_null
      // 212: invokespecial me/octo/client/IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl.<init> (FFFFLjava/lang/String;Ljava/lang/String;Ljava/lang/Float;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
      // 215: putfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll Lme/octo/client/IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl;
      // 218: aload 6
      // 21a: ifnull 282
      // 21d: goto 224
      // 220: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 223: athrow
      // 224: aload 0
      // 225: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll Lme/octo/client/IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl;
      // 228: goto 22f
      // 22b: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 22e: athrow
      // 22f: dup
      // 230: ifnull 242
      // 233: fload 26
      // 235: fload 14
      // 237: fadd
      // 238: invokevirtual me/octo/client/IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl.a (F)V
      // 23b: goto 243
      // 23e: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 241: athrow
      // 242: pop
      // 243: aload 0
      // 244: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll Lme/octo/client/IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl;
      // 247: dup
      // 248: ifnull 257
      // 24b: fload 29
      // 24d: invokevirtual me/octo/client/IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl.b (F)V
      // 250: goto 258
      // 253: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 256: athrow
      // 257: pop
      // 258: aload 0
      // 259: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll Lme/octo/client/IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl;
      // 25c: dup
      // 25d: ifnull 26c
      // 260: fload 28
      // 262: invokevirtual me/octo/client/IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl.c (F)V
      // 265: goto 26d
      // 268: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 26b: athrow
      // 26c: pop
      // 26d: aload 0
      // 26e: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll Lme/octo/client/IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl;
      // 271: dup
      // 272: ifnull 281
      // 275: fload 15
      // 277: invokevirtual me/octo/client/IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl.d (F)V
      // 27a: goto 282
      // 27d: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 280: athrow
      // 281: pop
      // 282: aload 0
      // 283: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll Lme/octo/client/IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl;
      // 286: aload 6
      // 288: ifnonnull 2e4
      // 28b: ifnonnull 2d9
      // 28e: goto 295
      // 291: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 294: athrow
      // 295: aload 0
      // 296: new me/octo/client/IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl
      // 299: dup
      // 29a: fload 26
      // 29c: fload 14
      // 29e: fadd
      // 29f: fload 28
      // 2a1: fadd
      // 2a2: fload 14
      // 2a4: fadd
      // 2a5: fload 29
      // 2a7: fload 28
      // 2a9: fload 15
      // 2ab: sipush -26055
      // 2ae: sipush -19622
      // 2b1: pop2
      // 2b2: ldc "Cancel"
      // 2b4: sipush -26068
      // 2b7: sipush -14841
      // 2ba: pop2
      // 2bb: ldc "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n            <line x1=\"18\" y1=\"6\" x2=\"6\" y2=\"18\"/>\n            <line x1=\"6\" y1=\"6\" x2=\"18\" y2=\"18\"/>\n        </svg>\n    "
      // 2bd: aconst_null
      // 2be: aload 0
      // 2bf: invokedynamic invoke (Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.b (Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI;)Lkotlin/Unit;, ()Lkotlin/Unit; ]
      // 2c4: bipush 64
      // 2c6: aconst_null
      // 2c7: invokespecial me/octo/client/IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl.<init> (FFFFLjava/lang/String;Ljava/lang/String;Ljava/lang/Float;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
      // 2ca: putfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll Lme/octo/client/IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl;
      // 2cd: aload 6
      // 2cf: ifnull 33d
      // 2d2: goto 2d9
      // 2d5: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2d8: athrow
      // 2d9: aload 0
      // 2da: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll Lme/octo/client/IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl;
      // 2dd: goto 2e4
      // 2e0: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2e3: athrow
      // 2e4: dup
      // 2e5: ifnull 2fd
      // 2e8: fload 26
      // 2ea: fload 14
      // 2ec: fadd
      // 2ed: fload 28
      // 2ef: fadd
      // 2f0: fload 14
      // 2f2: fadd
      // 2f3: invokevirtual me/octo/client/IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl.a (F)V
      // 2f6: goto 2fe
      // 2f9: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2fc: athrow
      // 2fd: pop
      // 2fe: aload 0
      // 2ff: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll Lme/octo/client/IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl;
      // 302: dup
      // 303: ifnull 312
      // 306: fload 29
      // 308: invokevirtual me/octo/client/IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl.b (F)V
      // 30b: goto 313
      // 30e: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 311: athrow
      // 312: pop
      // 313: aload 0
      // 314: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll Lme/octo/client/IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl;
      // 317: dup
      // 318: ifnull 327
      // 31b: fload 28
      // 31d: invokevirtual me/octo/client/IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl.c (F)V
      // 320: goto 328
      // 323: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 326: athrow
      // 327: pop
      // 328: aload 0
      // 329: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll Lme/octo/client/IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl;
      // 32c: dup
      // 32d: ifnull 33c
      // 330: fload 15
      // 332: invokevirtual me/octo/client/IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl.d (F)V
      // 335: goto 33d
      // 338: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 33b: athrow
      // 33c: pop
      // 33d: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g ()V
      // 340: sipush -26049
      // 343: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
      // 346: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b ()J
      // 349: invokestatic org/lwjgl/nanovg/NanoVG.nvgSave (J)V
      // 34c: sipush -25460
      // 34f: ldc 0.9
      // 351: fload 7
      // 353: ldc 0.1
      // 355: fmul
      // 356: fadd
      // 357: fstore 30
      // 359: fload 26
      // 35b: fload 8
      // 35d: bipush 2
      // 35e: i2f
      // 35f: fdiv
      // 360: fadd
      // 361: fstore 31
      // 363: fload 27
      // 365: fload 25
      // 367: bipush 2
      // 368: i2f
      // 369: fdiv
      // 36a: fadd
      // 36b: fstore 32
      // 36d: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
      // 370: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b ()J
      // 373: fload 31
      // 375: fload 32
      // 377: invokestatic org/lwjgl/nanovg/NanoVG.nvgTranslate (JFF)V
      // 37a: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
      // 37d: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b ()J
      // 380: fload 30
      // 382: fload 30
      // 384: invokestatic org/lwjgl/nanovg/NanoVG.nvgScale (JFF)V
      // 387: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
      // 38a: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b ()J
      // 38d: fload 31
      // 38f: fneg
      // 390: fload 32
      // 392: fneg
      // 393: invokestatic org/lwjgl/nanovg/NanoVG.nvgTranslate (JFF)V
      // 396: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
      // 399: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b ()J
      // 39c: fload 7
      // 39e: invokestatic org/lwjgl/nanovg/NanoVG.nvgGlobalAlpha (JF)V
      // 3a1: fload 26
      // 3a3: fload 27
      // 3a5: fload 8
      // 3a7: fload 25
      // 3a9: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 3ac: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.ac ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 3af: getstatic me/octo/client/lIllIlIlIlllllIIIIIlIlIIIlIIlIIlIIllIlIIIlIlIlIIIIIIIlIlIIlIlIlIIIIlIlIlIlIIIllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIllIlIlIlllllIIIIIlIlIIIlIIlIIlIIllIlIIIlIlIlIIIIIIIlIlIIlIlIlIIIIlIlIlIlIIIllllIllI;
      // 3b2: invokevirtual me/octo/client/lIllIlIlIlllllIIIIIlIlIIIlIIlIIlIIllIlIIIlIlIlIIIIIIIlIlIIlIlIlIIIIlIlIlIlIIIllllIllI.c ()F
      // 3b5: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;F)V
      // 3b8: fload 26
      // 3ba: fload 27
      // 3bc: fload 8
      // 3be: fload 25
      // 3c0: fconst_1
      // 3c1: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 3c4: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.af ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 3c7: getstatic me/octo/client/lIllIlIlIlllllIIIIIlIlIIIlIIlIIlIIllIlIIIlIlIlIIIIIIIlIlIIlIlIlIIIIlIlIlIlIIIllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIllIlIlIlllllIIIIIlIlIIIlIIlIIlIIllIlIIIlIlIlIIIIIIIlIlIIlIlIlIIIIlIlIlIlIIIllllIllI;
      // 3ca: invokevirtual me/octo/client/lIllIlIlIlllllIIIIIlIlIIIlIIlIIlIIllIlIIIlIlIlIIIIIIIlIlIIlIlIlIIIIlIlIlIlIIIllllIllI.c ()F
      // 3cd: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;F)V
      // 3d0: pop2
      // 3d1: ldc_w "Add Proxy"
      // 3d4: astore 33
      // 3d6: aload 33
      // 3d8: fload 11
      // 3da: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/utils/IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl;
      // 3dd: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/String;FLme/octo/client/utils/IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl;)F
      // 3e0: fstore 34
      // 3e2: aload 33
      // 3e4: fload 26
      // 3e6: fload 8
      // 3e8: fload 34
      // 3ea: fsub
      // 3eb: bipush 2
      // 3ec: i2f
      // 3ed: fdiv
      // 3ee: fadd
      // 3ef: fload 27
      // 3f1: fload 14
      // 3f3: fadd
      // 3f4: fload 11
      // 3f6: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 3f9: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.a ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 3fc: aconst_null
      // 3fd: bipush 32
      // 3ff: aconst_null
      // 400: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (Ljava/lang/String;FFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;Lme/octo/client/utils/IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl;ILjava/lang/Object;)V
      // 403: fload 27
      // 405: fload 22
      // 407: fadd
      // 408: fload 14
      // 40a: fadd
      // 40b: fstore 35
      // 40d: aload 0
      // 40e: sipush -26050
      // 411: sipush -29583
      // 414: pop2
      // 415: ldc_w "Proxy Name"
      // 418: aload 0
      // 419: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Ljava/lang/String;
      // 41c: getstatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 41f: bipush 0
      // 420: fload 26
      // 422: fload 35
      // 424: fload 8
      // 426: fload 9
      // 428: fload 10
      // 42a: fload 12
      // 42c: fload 13
      // 42e: fload 14
      // 430: fload 3
      // 431: fload 4
      // 433: invokespecial me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Ljava/lang/String;Ljava/lang/String;Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;ZFFFFFFFFFF)F
      // 436: fstore 35
      // 438: aload 0
      // 439: fload 26
      // 43b: fload 35
      // 43d: fload 8
      // 43f: fload 9
      // 441: fload 10
      // 443: fload 12
      // 445: fload 13
      // 447: fload 14
      // 449: fload 3
      // 44a: fload 4
      // 44c: invokespecial me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (FFFFFFFFFF)F
      // 44f: fstore 35
      // 451: aload 0
      // 452: sipush -26062
      // 455: sipush -6732
      // 458: pop2
      // 459: ldc_w "IP Address"
      // 45c: aload 0
      // 45d: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Ljava/lang/String;
      // 460: getstatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 463: bipush 0
      // 464: fload 26
      // 466: fload 35
      // 468: fload 8
      // 46a: fload 9
      // 46c: fload 10
      // 46e: fload 12
      // 470: fload 13
      // 472: fload 14
      // 474: fload 3
      // 475: fload 4
      // 477: invokespecial me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Ljava/lang/String;Ljava/lang/String;Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;ZFFFFFFFFFF)F
      // 47a: fstore 35
      // 47c: aload 0
      // 47d: sipush -26063
      // 480: sipush 13411
      // 483: pop2
      // 484: ldc_w "Port"
      // 487: aload 0
      // 488: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Ljava/lang/String;
      // 48b: getstatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 48e: bipush 0
      // 48f: fload 26
      // 491: fload 35
      // 493: fload 8
      // 495: fload 9
      // 497: fload 10
      // 499: fload 12
      // 49b: fload 13
      // 49d: fload 14
      // 49f: fload 3
      // 4a0: fload 4
      // 4a2: invokespecial me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Ljava/lang/String;Ljava/lang/String;Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;ZFFFFFFFFFF)F
      // 4a5: fstore 35
      // 4a7: aload 0
      // 4a8: aload 6
      // 4aa: ifnonnull 53e
      // 4ad: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lme/octo/client/utils/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 4b0: getstatic me/octo/client/utils/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/utils/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 4b3: if_acmpne 53d
      // 4b6: goto 4bd
      // 4b9: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4bc: athrow
      // 4bd: aload 0
      // 4be: fload 26
      // 4c0: fload 35
      // 4c2: fload 8
      // 4c4: fload 19
      // 4c6: fload 10
      // 4c8: fload 12
      // 4ca: fload 14
      // 4cc: fload 3
      // 4cd: fload 4
      // 4cf: invokespecial me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (FFFFFFFFF)F
      // 4d2: fstore 35
      // 4d4: aload 0
      // 4d5: aload 6
      // 4d7: ifnonnull 53e
      // 4da: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll Z
      // 4dd: ifeq 53d
      // 4e0: goto 4e7
      // 4e3: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4e6: athrow
      // 4e7: aload 0
      // 4e8: sipush -26058
      // 4eb: sipush 1665
      // 4ee: pop2
      // 4ef: ldc_w "Username"
      // 4f2: aload 0
      // 4f3: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Ljava/lang/String;
      // 4f6: getstatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 4f9: bipush 0
      // 4fa: fload 26
      // 4fc: fload 35
      // 4fe: fload 8
      // 500: fload 9
      // 502: fload 10
      // 504: fload 12
      // 506: fload 13
      // 508: fload 14
      // 50a: fload 3
      // 50b: fload 4
      // 50d: invokespecial me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Ljava/lang/String;Ljava/lang/String;Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;ZFFFFFFFFFF)F
      // 510: fstore 35
      // 512: aload 0
      // 513: sipush -26052
      // 516: sipush 22086
      // 519: pop2
      // 51a: ldc_w "Password"
      // 51d: aload 0
      // 51e: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Ljava/lang/String;
      // 521: getstatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 524: bipush 1
      // 525: fload 26
      // 527: fload 35
      // 529: fload 8
      // 52b: fload 9
      // 52d: fload 10
      // 52f: fload 12
      // 531: fload 13
      // 533: fload 14
      // 535: fload 3
      // 536: fload 4
      // 538: invokespecial me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Ljava/lang/String;Ljava/lang/String;Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;ZFFFFFFFFFF)F
      // 53b: fstore 35
      // 53d: aload 0
      // 53e: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll Lme/octo/client/IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl;
      // 541: dup
      // 542: ifnull 55d
      // 545: astore 36
      // 547: bipush 0
      // 548: istore 37
      // 54a: aload 36
      // 54c: fload 3
      // 54d: fload 4
      // 54f: fload 5
      // 551: invokevirtual me/octo/client/IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl.a (FFF)V
      // 554: aload 36
      // 556: invokevirtual me/octo/client/IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl.e ()V
      // 559: nop
      // 55a: goto 55f
      // 55d: pop
      // 55e: nop
      // 55f: aload 0
      // 560: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll Lme/octo/client/IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl;
      // 563: dup
      // 564: ifnull 57f
      // 567: astore 36
      // 569: bipush 0
      // 56a: istore 37
      // 56c: aload 36
      // 56e: fload 3
      // 56f: fload 4
      // 571: fload 5
      // 573: invokevirtual me/octo/client/IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl.a (FFF)V
      // 576: aload 36
      // 578: invokevirtual me/octo/client/IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl.e ()V
      // 57b: nop
      // 57c: goto 581
      // 57f: pop
      // 580: nop
      // 581: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
      // 584: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b ()J
      // 587: invokestatic org/lwjgl/nanovg/NanoVG.nvgRestore (J)V
      // 58a: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h ()V
      // 58d: fload 7
      // 58f: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 592: areturn
   }

   private final float a(
      String param1,
      String param2,
      lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI param3,
      boolean param4,
      float param5,
      float param6,
      float param7,
      float param8,
      float param9,
      float param10,
      float param11,
      float param12,
      float param13,
      float param14
   ) {
      // Restored from the original bytecode (offsets 000-303; see the PX artifact log).
      // Layout: draws the field label, the field box, the value (or a type-specific
      // placeholder when empty) and, while focused, a blinking caret.
      int[] var15 = IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.g();
      float var16 = param6;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         param1,
         param5 + param12,
         var16,
         param10,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(),
         (me.octo.client.utils.IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl)null,
         32,
         (Object)null
      );
      var16 = var16 + param10 + 5.0F;
      float var17 = var16;
      boolean var18 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl == param3;
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var19 = var18 ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.ad() : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.ae();
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var20 = var18 ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.ah() : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.af();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         param5 + param12,
         var17,
         param7 - param12 * 2.0F,
         param8,
         var19,
         lIllIlIlIlllllIIIIIlIlIIIlIIlIIlIIllIlIIIlIlIlIIIIIIIlIlIIlIlIlIIIIlIlIlIlIIIllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a()
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         param5 + param12,
         var17,
         param7 - param12 * 2.0F,
         param8,
         1.5F,
         var20,
         lIllIlIlIlllllIIIIIlIlIIIlIIlIIlIIllIlIIIlIlIlIIIIIIIlIlIIlIlIlIIIIlIlIlIlIIIllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a()
      );
      String var21 = param4 && param2.length() > 0 ? "\u2022".repeat(param2.length()) : param2;
      float var22 = var17 + (param8 - param11) / 2.0F;
      float var23 = param5 + param12 + 12.0F;
      if (var21.length() == 0 && !var18) {
         String var24;
         switch (param3.ordinal()) {
            case 0:
               var24 = "My Proxy";
               break;
            case 1:
               var24 = "127.0.0.1";
               break;
            case 2:
               var24 = "1080";
               break;
            case 3:
               var24 = "Optional";
               break;
            case 4:
               var24 = "Optional";
               break;
            default:
               throw new kotlin.NoWhenBranchMatchedException();
         }

         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var24,
            var23,
            var22,
            param11,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(),
            (me.octo.client.utils.IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl)null,
            32,
            (Object)null
         );
         return var16 + param8 + param9;
      }

      if (var18
         && this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.a()
         && var21.length() > 0) {
         lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
            var23,
            var17 + 10.0F,
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var21, param11, me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII),
            param8 - 20.0F
         );
      }

      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var21,
         var23,
         var22,
         param11,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(),
         (me.octo.client.utils.IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl)null,
         32,
         (Object)null
      );
      if (var18 && this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl % 20.0F < 10.0F) {
         String var25 = var21.substring(
            0,
            kotlin.ranges.RangesKt.coerceIn(
               this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI,
               0,
               var21.length()
            )
         );
         float var26 = var23 + me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var25, param11, me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var26, var17 + 10.0F, 2.0F, param8 - 20.0F, IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, 0.0F);
      }

      return var16 + param8 + param9;
   }

   private final float a(
      float param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, float param9, float param10
   ) {
      // Restored from the original bytecode (offsets 000-2ff) + CFR structure.
      // "Proxy Type" dropdown row: label, box (fill + stroke), current value, chevron,
      // then one hoverable row per proxy type while expanded. Returns the row height.
      float var12 = param2;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         "Proxy Type",
         param1 + param8,
         var12,
         param6,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(),
         (me.octo.client.utils.IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl)null,
         32,
         (Object)null
      );
      var12 = var12 + param6 + 5.0F;
      float var13 = var12;
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var14 = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll
         ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.ad()
         : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.ae();
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var15 = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll
         ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.af();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(param1 + param8, var13, param3 - param8 * 2.0F, param4, var14, me.octo.client.lIllIlIlIlllllIIIIIlIlIIIlIIlIIlIIllIlIIIlIlIlIIIIIIIlIlIIlIlIlIIIIlIlIlIlIIIllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a());
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(param1 + param8, var13, param3 - param8 * 2.0F, param4, 1.5F, var15, me.octo.client.lIllIlIlIlllllIIIIIlIlIIIlIIlIIlIIllIlIIIlIlIlIIIIIIIlIlIIlIlIlIIIIlIlIlIlIIIllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a());
      String var16 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.name();
      float var17 = var13 + (param4 - param7) / 2.0F;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var16,
         param1 + param8 + 12.0F,
         var17,
         param7,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(),
         (me.octo.client.utils.IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl)null,
         32,
         (Object)null
      );
      float var18 = param4 * 0.25F;
      float var19 = param1 + param3 - param8 - var18 - 12.0F;
      float var20 = var13 + (param4 - var18) / 2.0F;
      String var21 = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll
         ? "\n    <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n        <polyline points=\"18,15 12,9 6,15\"/>\n    </svg>\n"
         : "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n            <polyline points=\"6,9 12,15 18,9\"/>\n        </svg>\n    ";
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b(
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         var21,
         var19,
         var20,
         var18,
         var18,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(),
         0.0F,
         0.0F,
         192,
         null
      );
      float var22 = var12 + (param4 + param5);
      float var23 = var22;
      if (this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll) {
         for (me.octo.client.utils.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var24 : new me.octo.client.utils.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[]{me.octo.client.utils.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, me.octo.client.utils.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI}) {
            float var25 = var23;
            boolean var26 = param9 >= param1 + param8
               && param9 <= param1 + param3 - param8
               && param10 >= var25
               && param10 <= var25 + param4;
            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var27 = var26 ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.ad() : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.ae();
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(param1 + param8, var25, param3 - param8 * 2.0F, param4, var27, me.octo.client.lIllIlIlIlllllIIIIIlIlIIIlIIlIIlIIllIlIIIlIlIlIIIIIIIlIlIIlIlIlIIIIlIlIlIlIIIllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a());
            float var28 = var25 + (param4 - param7) / 2.0F;
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var24.name(),
               param1 + param8 + 12.0F,
               var28,
               param7,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(),
               (me.octo.client.utils.IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl)null,
               32,
               (Object)null
            );
            var23 = var23 + param4 + 4.0F;
         }
      }

      return var22;
   }

   private final float a(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      return var2;
   }

   public boolean a(float param1, float param2, float param3, float param4, int param5) {
      if (this.b()) {
         return true;
      }
      var var9 = this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
      if (var9 != null && var9.a(param3, param4, param5)) {
         return true;
      }
      var9 = this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
      if (var9 != null && var9.a(param3, param4, param5)) {
         return true;
      }
      if (param5 != 0) {
         return false;
      }
      float f7 = kotlin.ranges.RangesKt.coerceIn(param1 * 0.35f, 380.0f, 550.0f);
      float f8 = kotlin.ranges.RangesKt.coerceIn(param2 * 0.055f, 38.0f, 50.0f);
      float f9 = kotlin.ranges.RangesKt.coerceIn(param2 * 0.015f, 8.0f, 16.0f);
      float f10 = kotlin.ranges.RangesKt.coerceIn(param2 * 0.028f, 18.0f, 32.0f);
      float f11 = kotlin.ranges.RangesKt.coerceIn(param2 * 0.017f, 12.0f, 18.0f);
      float f12 = kotlin.ranges.RangesKt.coerceIn(f7 * 0.06f, 20.0f, 40.0f);
      float f13 = kotlin.ranges.RangesKt.coerceIn(param2 * 0.055f, 38.0f, 55.0f);
      int n14 = 4;
      // Original hit method (FFFFI)Z offset 274: getfield #110 = the auth-field visibility
      // toggle (same field the render method reads at its line 100), not the dropdown flag.
      int n15 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII == me.octo.client.utils.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI && this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll ? 2 : 0;
      int n16 = n14 + n15;
      float f17 = f13 * 0.6f;
      float f18 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII == me.octo.client.utils.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ? f17 + f9 : 0.0f;
      float f19 = (float)n16 * (f11 + 5.0f + f8 + f9);
      float f20 = f10 + f12 * 2.0f;
      float f21 = f13 + f12 * 2.0f;
      float f22 = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll ? 2.0f * (f8 + 4.0f) : 0.0f;
      float f23 = f20 + f19 + f18 + f21 + f12 + f22;
      float f24 = (param1 - f7) / 2.0f;
      float f25 = (param2 - f23) / 2.0f;
      boolean b26 = param3 >= f24 && param3 <= f24 + f7 && param4 >= f25 && param4 <= f25 + f23;
      if (!b26) {
         this.d();
         return true;
      }
      var ref27 = new kotlin.jvm.internal.Ref.FloatRef();
      ref27.element = f25 + f20 + f12;
      if (a(ref27, f11, param3, f24, f12, f7, param4, f8, this, f9, lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll)) {
         return true;
      }
      ref27.element += f11 + 5.0f;
      float f28 = ref27.element;
      boolean b29 = param3 >= f24 + f12 && param3 <= f24 + f7 - f12 && param4 >= f28 && param4 <= f28 + f8;
      if (b29) {
         this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = !this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
         this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = null;
         return true;
      }
      ref27.element += f8 + f9;
      if (this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll) {
         var var30 = kotlin.collections.CollectionsKt.listOf(new me.octo.client.utils.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[]{me.octo.client.utils.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, me.octo.client.utils.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI});
         for (Object var34 : var30) {
            var var35 = (me.octo.client.utils.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var34;
            float f37 = ref27.element;
            boolean b38 = param3 >= f24 + f12 && param3 <= f24 + f7 - f12 && param4 >= f37 && param4 <= f37 + f8;
            if (b38) {
               this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var35;
               this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = false;
               if (var35 == me.octo.client.utils.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
                  this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = false;
                  this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = "";
               }
               this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = "";
               return true;
            }
            ref27.element += f8 + 4.0f;
         }
      }
      if (a(ref27, f11, param3, f24, f12, f7, param4, f8, this, f9, lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI)) {
         return true;
      }
      if (a(ref27, f11, param3, f24, f12, f7, param4, f8, this, f9, lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl)) {
         return true;
      }
      if (this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII == me.octo.client.utils.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
         float f30 = f8 * 0.6f;
         float f31 = f24 + f12;
         float f32 = ref27.element;
         boolean b33 = param3 >= f31 && param3 <= f31 + f30 + 200.0f && param4 >= f32 && param4 <= f32 + f30;
         if (b33) {
            this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = !this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
            if (!this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll) {
               this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = "";
               this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = "";
            }
            this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = null;
            return true;
         }
         ref27.element += f30 + f9;
         if (this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll) {
            if (a(ref27, f11, param3, f24, f12, f7, param4, f8, this, f9, lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI)) {
               return true;
            }
            if (a(ref27, f11, param3, f24, f12, f7, param4, f8, this, f9, lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl)) {
               return true;
            }
         }
      }
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = false;
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = null;
      return false;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.g ()[I
      // 003: astore 6
      // 005: aload 0
      // 006: aload 6
      // 008: ifnonnull 01f
      // 00b: invokevirtual me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.b ()Z
      // 00e: ifeq 01e
      // 011: goto 018
      // 014: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 017: athrow
      // 018: bipush 1
      // 019: ireturn
      // 01a: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 01d: athrow
      // 01e: aload 0
      // 01f: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll Lme/octo/client/IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl;
      // 022: dup
      // 023: ifnull 04e
      // 026: astore 9
      // 028: bipush 0
      // 029: istore 10
      // 02b: aload 6
      // 02d: ifnonnull 04b
      // 030: aload 9
      // 032: fload 3
      // 033: fload 4
      // 035: iload 5
      // 037: invokevirtual me/octo/client/IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl.a (FFI)Z
      // 03a: ifeq 04a
      // 03d: goto 044
      // 040: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 043: athrow
      // 044: bipush 1
      // 045: ireturn
      // 046: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 049: athrow
      // 04a: nop
      // 04b: goto 050
      // 04e: pop
      // 04f: nop
      // 050: aload 0
      // 051: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll Lme/octo/client/IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl;
      // 054: dup
      // 055: ifnull 080
      // 058: astore 9
      // 05a: bipush 0
      // 05b: istore 10
      // 05d: aload 6
      // 05f: ifnonnull 07d
      // 062: aload 9
      // 064: fload 3
      // 065: fload 4
      // 067: iload 5
      // 069: invokevirtual me/octo/client/IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl.a (FFI)Z
      // 06c: ifeq 07c
      // 06f: goto 076
      // 072: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 075: athrow
      // 076: bipush 1
      // 077: ireturn
      // 078: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 07b: athrow
      // 07c: nop
      // 07d: goto 082
      // 080: pop
      // 081: nop
      // 082: iload 5
      // 084: aload 6
      // 086: ifnonnull 094
      // 089: ifeq 095
      // 08c: goto 093
      // 08f: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 092: athrow
      // 093: bipush 0
      // 094: ireturn
      // 095: fload 1
      // 096: ldc 0.35
      // 098: fmul
      // 099: ldc 380.0
      // 09b: ldc 550.0
      // 09d: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 0a0: fstore 7
      // 0a2: fload 2
      // 0a3: ldc 0.055
      // 0a5: fmul
      // 0a6: ldc 38.0
      // 0a8: ldc 50.0
      // 0aa: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 0ad: fstore 8
      // 0af: fload 2
      // 0b0: ldc 0.015
      // 0b2: fmul
      // 0b3: ldc 8.0
      // 0b5: ldc 16.0
      // 0b7: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 0ba: fstore 9
      // 0bc: fload 2
      // 0bd: ldc 0.028
      // 0bf: fmul
      // 0c0: ldc 18.0
      // 0c2: ldc 32.0
      // 0c4: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 0c7: fstore 10
      // 0c9: fload 2
      // 0ca: ldc 0.017
      // 0cc: fmul
      // 0cd: ldc 12.0
      // 0cf: ldc 18.0
      // 0d1: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 0d4: fstore 11
      // 0d6: fload 7
      // 0d8: ldc 0.06
      // 0da: fmul
      // 0db: ldc 20.0
      // 0dd: ldc 40.0
      // 0df: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 0e2: fstore 12
      // 0e4: fload 2
      // 0e5: ldc 0.055
      // 0e7: fmul
      // 0e8: ldc 38.0
      // 0ea: ldc 55.0
      // 0ec: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 0ef: fstore 13
      // 0f1: bipush 4
      // 0f2: istore 14
      // 0f4: aload 0
      // 0f5: aload 6
      // 0f7: ifnonnull 112
      // 0fa: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lme/octo/client/utils/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 0fd: getstatic me/octo/client/utils/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/utils/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 100: if_acmpne 128
      // 103: goto 10a
      // 106: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 109: athrow
      // 10a: aload 0
      // 10b: goto 112
      // 10e: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 111: athrow
      // 112: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll Z
      // 115: aload 6
      // 117: ifnonnull 125
      // 11a: ifeq 128
      // 11d: goto 124
      // 120: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 123: athrow
      // 124: bipush 2
      // 125: goto 129
      // 128: bipush 0
      // 129: istore 15
      // 12b: iload 14
      // 12d: iload 15
      // 12f: iadd
      // 130: istore 16
      // 132: fload 13
      // 134: ldc 0.6
      // 136: fmul
      // 137: fstore 17
      // 139: aload 0
      // 13a: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lme/octo/client/utils/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 13d: getstatic me/octo/client/utils/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/utils/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 140: if_acmpne 14f
      // 143: fload 17
      // 145: fload 9
      // 147: fadd
      // 148: goto 150
      // 14b: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 14e: athrow
      // 14f: fconst_0
      // 150: fstore 18
      // 152: iload 16
      // 154: i2f
      // 155: fload 11
      // 157: ldc 5.0
      // 159: fadd
      // 15a: fload 8
      // 15c: fadd
      // 15d: fload 9
      // 15f: fadd
      // 160: fmul
      // 161: fstore 19
      // 163: fload 10
      // 165: fload 12
      // 167: bipush 2
      // 168: i2f
      // 169: fmul
      // 16a: fadd
      // 16b: fstore 20
      // 16d: fload 13
      // 16f: fload 12
      // 171: bipush 2
      // 172: i2f
      // 173: fmul
      // 174: fadd
      // 175: fstore 21
      // 177: aload 0
      // 178: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll Z
      // 17b: aload 6
      // 17d: ifnonnull 18b
      // 180: ifeq 195
      // 183: goto 18a
      // 186: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 189: athrow
      // 18a: bipush 2
      // 18b: i2f
      // 18c: fload 8
      // 18e: ldc 4.0
      // 190: fadd
      // 191: fmul
      // 192: goto 196
      // 195: fconst_0
      // 196: fstore 22
      // 198: fload 20
      // 19a: fload 19
      // 19c: fadd
      // 19d: fload 18
      // 19f: fadd
      // 1a0: fload 21
      // 1a2: fadd
      // 1a3: fload 12
      // 1a5: fadd
      // 1a6: fload 22
      // 1a8: fadd
      // 1a9: fstore 23
      // 1ab: fload 1
      // 1ac: fload 7
      // 1ae: fsub
      // 1af: bipush 2
      // 1b0: i2f
      // 1b1: fdiv
      // 1b2: fstore 24
      // 1b4: fload 2
      // 1b5: fload 23
      // 1b7: fsub
      // 1b8: bipush 2
      // 1b9: i2f
      // 1ba: fdiv
      // 1bb: fstore 25
      // 1bd: fload 3
      // 1be: fload 24
      // 1c0: fcmpl
      // 1c1: aload 6
      // 1c3: ifnonnull 1de
      // 1c6: iflt 22a
      // 1c9: goto 1d0
      // 1cc: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1cf: athrow
      // 1d0: fload 3
      // 1d1: fload 24
      // 1d3: fload 7
      // 1d5: fadd
      // 1d6: fcmpg
      // 1d7: goto 1de
      // 1da: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1dd: athrow
      // 1de: aload 6
      // 1e0: ifnonnull 1f9
      // 1e3: ifgt 22a
      // 1e6: goto 1ed
      // 1e9: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1ec: athrow
      // 1ed: fload 4
      // 1ef: fload 25
      // 1f1: fcmpl
      // 1f2: goto 1f9
      // 1f5: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1f8: athrow
      // 1f9: aload 6
      // 1fb: ifnonnull 217
      // 1fe: iflt 22a
      // 201: goto 208
      // 204: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 207: athrow
      // 208: fload 4
      // 20a: fload 25
      // 20c: fload 23
      // 20e: fadd
      // 20f: fcmpg
      // 210: goto 217
      // 213: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 216: athrow
      // 217: aload 6
      // 219: ifnonnull 227
      // 21c: ifgt 22a
      // 21f: goto 226
      // 222: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 225: athrow
      // 226: bipush 1
      // 227: goto 22b
      // 22a: bipush 0
      // 22b: istore 26
      // 22d: iload 26
      // 22f: aload 6
      // 231: ifnonnull 24a
      // 234: ifne 24b
      // 237: goto 23e
      // 23a: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 23d: athrow
      // 23e: aload 0
      // 23f: invokevirtual me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.d ()V
      // 242: bipush 1
      // 243: goto 24a
      // 246: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 249: athrow
      // 24a: ireturn
      // 24b: new kotlin/jvm/internal/Ref$FloatRef
      // 24e: dup
      // 24f: invokespecial kotlin/jvm/internal/Ref$FloatRef.<init> ()V
      // 252: astore 27
      // 254: aload 27
      // 256: fload 25
      // 258: fload 20
      // 25a: fadd
      // 25b: fload 12
      // 25d: fadd
      // 25e: putfield kotlin/jvm/internal/Ref$FloatRef.element F
      // 261: aload 27
      // 263: fload 11
      // 265: fload 3
      // 266: fload 24
      // 268: aload 6
      // 26a: ifnonnull 29d
      // 26d: fload 12
      // 26f: fload 7
      // 271: fload 4
      // 273: fload 8
      // 275: aload 0
      // 276: fload 9
      // 278: getstatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 27b: aload 0
      // 27c: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Ljava/lang/String;
      // 27f: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/jvm/internal/Ref$FloatRef;FFFFFFFLme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI;FLme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;Ljava/lang/String;)Z
      // 282: ifeq 292
      // 285: goto 28c
      // 288: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 28b: athrow
      // 28c: bipush 1
      // 28d: ireturn
      // 28e: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 291: athrow
      // 292: aload 27
      // 294: aload 27
      // 296: getfield kotlin/jvm/internal/Ref$FloatRef.element F
      // 299: fload 11
      // 29b: ldc 5.0
      // 29d: fadd
      // 29e: fadd
      // 29f: putfield kotlin/jvm/internal/Ref$FloatRef.element F
      // 2a2: aload 27
      // 2a4: getfield kotlin/jvm/internal/Ref$FloatRef.element F
      // 2a7: fstore 28
      // 2a9: fload 3
      // 2aa: fload 24
      // 2ac: fload 12
      // 2ae: fadd
      // 2af: fcmpl
      // 2b0: aload 6
      // 2b2: ifnonnull 2d0
      // 2b5: iflt 31c
      // 2b8: goto 2bf
      // 2bb: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2be: athrow
      // 2bf: fload 3
      // 2c0: fload 24
      // 2c2: fload 7
      // 2c4: fadd
      // 2c5: fload 12
      // 2c7: fsub
      // 2c8: fcmpg
      // 2c9: goto 2d0
      // 2cc: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2cf: athrow
      // 2d0: aload 6
      // 2d2: ifnonnull 2eb
      // 2d5: ifgt 31c
      // 2d8: goto 2df
      // 2db: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2de: athrow
      // 2df: fload 4
      // 2e1: fload 28
      // 2e3: fcmpl
      // 2e4: goto 2eb
      // 2e7: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2ea: athrow
      // 2eb: aload 6
      // 2ed: ifnonnull 309
      // 2f0: iflt 31c
      // 2f3: goto 2fa
      // 2f6: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2f9: athrow
      // 2fa: fload 4
      // 2fc: fload 28
      // 2fe: fload 8
      // 300: fadd
      // 301: fcmpg
      // 302: goto 309
      // 305: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 308: athrow
      // 309: aload 6
      // 30b: ifnonnull 319
      // 30e: ifgt 31c
      // 311: goto 318
      // 314: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 317: athrow
      // 318: bipush 1
      // 319: goto 31d
      // 31c: bipush 0
      // 31d: istore 29
      // 31f: iload 29
      // 321: aload 6
      // 323: ifnonnull 36e
      // 326: ifeq 35a
      // 329: goto 330
      // 32c: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 32f: athrow
      // 330: aload 0
      // 331: aload 0
      // 332: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll Z
      // 335: aload 6
      // 337: ifnonnull 34c
      // 33a: goto 341
      // 33d: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 340: athrow
      // 341: ifne 34f
      // 344: goto 34b
      // 347: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 34a: athrow
      // 34b: bipush 1
      // 34c: goto 350
      // 34f: bipush 0
      // 350: putfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll Z
      // 353: aload 0
      // 354: aconst_null
      // 355: putfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 358: bipush 1
      // 359: ireturn
      // 35a: aload 27
      // 35c: aload 27
      // 35e: getfield kotlin/jvm/internal/Ref$FloatRef.element F
      // 361: fload 8
      // 363: fload 9
      // 365: fadd
      // 366: fadd
      // 367: putfield kotlin/jvm/internal/Ref$FloatRef.element F
      // 36a: aload 0
      // 36b: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll Z
      // 36e: aload 6
      // 370: ifnonnull 4d6
      // 373: ifeq 4ba
      // 376: goto 37d
      // 379: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 37c: athrow
      // 37d: bipush 2
      // 37e: anewarray 93
      // 381: astore 31
      // 383: aload 31
      // 385: bipush 0
      // 386: getstatic me/octo/client/utils/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/utils/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 389: aastore
      // 38a: aload 31
      // 38c: bipush 1
      // 38d: getstatic me/octo/client/utils/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/utils/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 390: aastore
      // 391: aload 31
      // 393: invokestatic kotlin/collections/CollectionsKt.listOf ([Ljava/lang/Object;)Ljava/util/List;
      // 396: astore 30
      // 398: aload 30
      // 39a: checkcast java/lang/Iterable
      // 39d: astore 31
      // 39f: bipush 0
      // 3a0: istore 32
      // 3a2: aload 31
      // 3a4: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 3a9: astore 33
      // 3ab: aload 33
      // 3ad: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3b2: ifeq 4b9
      // 3b5: aload 33
      // 3b7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3bc: astore 34
      // 3be: aload 34
      // 3c0: checkcast me/octo/client/utils/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
      // 3c3: astore 35
      // 3c5: bipush 0
      // 3c6: istore 36
      // 3c8: aload 27
      // 3ca: getfield kotlin/jvm/internal/Ref$FloatRef.element F
      // 3cd: fstore 37
      // 3cf: fload 3
      // 3d0: fload 24
      // 3d2: fload 12
      // 3d4: fadd
      // 3d5: fcmpl
      // 3d6: aload 6
      // 3d8: ifnonnull 4d6
      // 3db: aload 6
      // 3dd: ifnonnull 402
      // 3e0: goto 3e7
      // 3e3: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3e6: athrow
      // 3e7: iflt 44e
      // 3ea: goto 3f1
      // 3ed: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3f0: athrow
      // 3f1: fload 3
      // 3f2: fload 24
      // 3f4: fload 7
      // 3f6: fadd
      // 3f7: fload 12
      // 3f9: fsub
      // 3fa: fcmpg
      // 3fb: goto 402
      // 3fe: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 401: athrow
      // 402: aload 6
      // 404: ifnonnull 41d
      // 407: ifgt 44e
      // 40a: goto 411
      // 40d: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 410: athrow
      // 411: fload 4
      // 413: fload 37
      // 415: fcmpl
      // 416: goto 41d
      // 419: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 41c: athrow
      // 41d: aload 6
      // 41f: ifnonnull 43b
      // 422: iflt 44e
      // 425: goto 42c
      // 428: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 42b: athrow
      // 42c: fload 4
      // 42e: fload 37
      // 430: fload 8
      // 432: fadd
      // 433: fcmpg
      // 434: goto 43b
      // 437: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 43a: athrow
      // 43b: aload 6
      // 43d: ifnonnull 44b
      // 440: ifgt 44e
      // 443: goto 44a
      // 446: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 449: athrow
      // 44a: bipush 1
      // 44b: goto 44f
      // 44e: bipush 0
      // 44f: istore 38
      // 451: aload 6
      // 453: ifnonnull 4b4
      // 456: iload 38
      // 458: ifeq 4a2
      // 45b: goto 462
      // 45e: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 461: athrow
      // 462: aload 0
      // 463: aload 35
      // 465: putfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lme/octo/client/utils/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 468: aload 0
      // 469: bipush 0
      // 46a: putfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll Z
      // 46d: aload 6
      // 46f: ifnonnull 49a
      // 472: goto 479
      // 475: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 478: athrow
      // 479: aload 35
      // 47b: getstatic me/octo/client/utils/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/utils/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 47e: if_acmpne 4a0
      // 481: goto 488
      // 484: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 487: athrow
      // 488: aload 0
      // 489: bipush 0
      // 48a: putfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll Z
      // 48d: aload 0
      // 48e: ldc ""
      // 490: putfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Ljava/lang/String;
      // 493: goto 49a
      // 496: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 499: athrow
      // 49a: aload 0
      // 49b: ldc ""
      // 49d: putfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Ljava/lang/String;
      // 4a0: bipush 1
      // 4a1: ireturn
      // 4a2: aload 27
      // 4a4: aload 27
      // 4a6: getfield kotlin/jvm/internal/Ref$FloatRef.element F
      // 4a9: fload 8
      // 4ab: ldc 4.0
      // 4ad: fadd
      // 4ae: fadd
      // 4af: putfield kotlin/jvm/internal/Ref$FloatRef.element F
      // 4b2: nop
      // 4b3: nop
      // 4b4: aload 6
      // 4b6: ifnull 3ab
      // 4b9: nop
      // 4ba: aload 27
      // 4bc: fload 11
      // 4be: fload 3
      // 4bf: fload 24
      // 4c1: fload 12
      // 4c3: fload 7
      // 4c5: fload 4
      // 4c7: fload 8
      // 4c9: aload 0
      // 4ca: fload 9
      // 4cc: getstatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 4cf: aload 0
      // 4d0: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Ljava/lang/String;
      // 4d3: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/jvm/internal/Ref$FloatRef;FFFFFFFLme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI;FLme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;Ljava/lang/String;)Z
      // 4d6: aload 6
      // 4d8: ifnonnull 507
      // 4db: ifeq 4eb
      // 4de: goto 4e5
      // 4e1: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4e4: athrow
      // 4e5: bipush 1
      // 4e6: ireturn
      // 4e7: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4ea: athrow
      // 4eb: aload 27
      // 4ed: fload 11
      // 4ef: fload 3
      // 4f0: fload 24
      // 4f2: fload 12
      // 4f4: fload 7
      // 4f6: fload 4
      // 4f8: fload 8
      // 4fa: aload 0
      // 4fb: fload 9
      // 4fd: getstatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 500: aload 0
      // 501: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Ljava/lang/String;
      // 504: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/jvm/internal/Ref$FloatRef;FFFFFFFLme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI;FLme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;Ljava/lang/String;)Z
      // 507: aload 6
      // 509: ifnonnull 517
      // 50c: ifeq 518
      // 50f: goto 516
      // 512: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 515: athrow
      // 516: bipush 1
      // 517: ireturn
      // 518: aload 0
      // 519: aload 6
      // 51b: ifnonnull 6aa
      // 51e: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lme/octo/client/utils/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 521: getstatic me/octo/client/utils/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/utils/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 524: if_acmpne 6a4
      // 527: goto 52e
      // 52a: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 52d: athrow
      // 52e: fload 8
      // 530: ldc 0.6
      // 532: fmul
      // 533: fstore 30
      // 535: fload 24
      // 537: fload 12
      // 539: fadd
      // 53a: fstore 31
      // 53c: aload 27
      // 53e: getfield kotlin/jvm/internal/Ref$FloatRef.element F
      // 541: fstore 32
      // 543: fload 3
      // 544: fload 31
      // 546: fcmpl
      // 547: aload 6
      // 549: ifnonnull 568
      // 54c: iflt 5b4
      // 54f: goto 556
      // 552: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 555: athrow
      // 556: fload 3
      // 557: fload 31
      // 559: fload 30
      // 55b: fadd
      // 55c: ldc_w 200.0
      // 55f: fadd
      // 560: fcmpg
      // 561: goto 568
      // 564: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 567: athrow
      // 568: aload 6
      // 56a: ifnonnull 583
      // 56d: ifgt 5b4
      // 570: goto 577
      // 573: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 576: athrow
      // 577: fload 4
      // 579: fload 32
      // 57b: fcmpl
      // 57c: goto 583
      // 57f: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 582: athrow
      // 583: aload 6
      // 585: ifnonnull 5a1
      // 588: iflt 5b4
      // 58b: goto 592
      // 58e: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 591: athrow
      // 592: fload 4
      // 594: fload 32
      // 596: fload 30
      // 598: fadd
      // 599: fcmpg
      // 59a: goto 5a1
      // 59d: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5a0: athrow
      // 5a1: aload 6
      // 5a3: ifnonnull 5b1
      // 5a6: ifgt 5b4
      // 5a9: goto 5b0
      // 5ac: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5af: athrow
      // 5b0: bipush 1
      // 5b1: goto 5b5
      // 5b4: bipush 0
      // 5b5: istore 33
      // 5b7: iload 33
      // 5b9: aload 6
      // 5bb: ifnonnull 62c
      // 5be: ifeq 618
      // 5c1: goto 5c8
      // 5c4: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5c7: athrow
      // 5c8: aload 0
      // 5c9: aload 0
      // 5ca: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll Z
      // 5cd: aload 6
      // 5cf: ifnonnull 5e4
      // 5d2: goto 5d9
      // 5d5: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5d8: athrow
      // 5d9: ifne 5e7
      // 5dc: goto 5e3
      // 5df: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5e2: athrow
      // 5e3: bipush 1
      // 5e4: goto 5e8
      // 5e7: bipush 0
      // 5e8: putfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll Z
      // 5eb: aload 0
      // 5ec: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll Z
      // 5ef: aload 6
      // 5f1: ifnonnull 617
      // 5f4: ifne 611
      // 5f7: goto 5fe
      // 5fa: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5fd: athrow
      // 5fe: aload 0
      // 5ff: ldc ""
      // 601: putfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Ljava/lang/String;
      // 604: aload 0
      // 605: ldc ""
      // 607: putfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Ljava/lang/String;
      // 60a: goto 611
      // 60d: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 610: athrow
      // 611: aload 0
      // 612: aconst_null
      // 613: putfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 616: bipush 1
      // 617: ireturn
      // 618: aload 27
      // 61a: aload 27
      // 61c: getfield kotlin/jvm/internal/Ref$FloatRef.element F
      // 61f: fload 30
      // 621: fload 9
      // 623: fadd
      // 624: fadd
      // 625: putfield kotlin/jvm/internal/Ref$FloatRef.element F
      // 628: aload 0
      // 629: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll Z
      // 62c: aload 6
      // 62e: ifnonnull 6af
      // 631: ifeq 6a4
      // 634: goto 63b
      // 637: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 63a: athrow
      // 63b: aload 27
      // 63d: fload 11
      // 63f: fload 3
      // 640: fload 24
      // 642: fload 12
      // 644: fload 7
      // 646: fload 4
      // 648: fload 8
      // 64a: aload 0
      // 64b: fload 9
      // 64d: getstatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 650: aload 0
      // 651: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Ljava/lang/String;
      // 654: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/jvm/internal/Ref$FloatRef;FFFFFFFLme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI;FLme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;Ljava/lang/String;)Z
      // 657: aload 6
      // 659: ifnonnull 68f
      // 65c: goto 663
      // 65f: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 662: athrow
      // 663: ifeq 673
      // 666: goto 66d
      // 669: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 66c: athrow
      // 66d: bipush 1
      // 66e: ireturn
      // 66f: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 672: athrow
      // 673: aload 27
      // 675: fload 11
      // 677: fload 3
      // 678: fload 24
      // 67a: fload 12
      // 67c: fload 7
      // 67e: fload 4
      // 680: fload 8
      // 682: aload 0
      // 683: fload 9
      // 685: getstatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 688: aload 0
      // 689: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Ljava/lang/String;
      // 68c: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/jvm/internal/Ref$FloatRef;FFFFFFFLme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI;FLme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;Ljava/lang/String;)Z
      // 68f: aload 6
      // 691: ifnonnull 6af
      // 694: ifeq 6a4
      // 697: goto 69e
      // 69a: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 69d: athrow
      // 69e: bipush 1
      // 69f: ireturn
      // 6a0: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 6a3: athrow
      // 6a4: aload 0
      // 6a5: bipush 0
      // 6a6: putfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll Z
      // 6a9: aload 0
      // 6aa: aconst_null
      // 6ab: putfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 6ae: bipush 0
      // 6af: ireturn
   }

   public boolean a(int param1, int param2, int param3) {
      int[] var4 = me.octo.client.IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.g();
      if (this.b()) {
         return true;
      }

      me.octo.client.lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var5 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      if (var5 == null) {
         if (param1 == 256) {
            this.d();
            return true;
         }

         return false;
      }

      if (this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.a(param1, new kotlin.jvm.functions.Function0<String>() {
         public String invoke() {
            return lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a(lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.this, var5);
         }
      }, new kotlin.jvm.functions.Function0<Unit>() {
         public Unit invoke() {
            return lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.b(lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.this, var5);
         }
      })) {
         return true;
      }

      if (param1 == 86 && (param3 & 2) != 0) {
         me.octo.client.lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var6 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
         if (var6 == null) {
            return true;
         }

         String var7 = org.lwjgl.glfw.GLFW.glfwGetClipboardString(this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.getWindow().handle());
         if (var7 == null) {
            return true;
         }

         StringBuilder var12 = new StringBuilder();
         int var14 = 0;
         int var15 = var7.length();

         while (var14 < var15) {
            char var16 = var7.charAt(var14);
            if (var16 >= 32 && var16 < 127) {
               var12.append(var16);
            }

            var14++;
         }

         String var8 = var12.toString();
         if (var8.isEmpty()) {
            return true;
         }

         this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.b(new kotlin.jvm.functions.Function0<Unit>() {
            public Unit invoke() {
               return lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.c(lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.this, var6);
            }
         });
         String var9 = this.a(var6);
         String var17 = var9.substring(0, this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI);
         kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var17, "substring(...)");
         String var18 = var9.substring(this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI);
         kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var18, "substring(...)");
         String var10 = var17 + var8 + var18;
         if (var6 == me.octo.client.lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
            Integer var11 = kotlin.text.StringsKt.toIntOrNull(var10);
            if (var11 == null || var11 < 1 || var11 > 65535) {
               return true;
            }
         }

         this.a(var6, var10);
         this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI + var8.length();
         return true;
      }

      switch (param1) {
         case 256: {
            this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = null;
            this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = false;
            this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.b();
            return true;
         }
         case 257:
         case 335: {
            this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = null;
            this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.b();
            return true;
         }
         case 259: {
            me.octo.client.lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var7 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
            if (var7 == null) {
               return true;
            }

            if (this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.a(new kotlin.jvm.functions.Function0<Unit>() {
               public Unit invoke() {
                  return lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.d(lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.this, var7);
               }
            })) {
               return true;
            }

            String var8 = this.a(var7);
            if (var8.isEmpty()) {
               return true;
            }

            if (this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI <= 0) {
               return true;
            }

            String var9 = var8.substring(0, this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI - 1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var9, "substring(...)");
            String var10 = var8.substring(this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var10, "substring(...)");
            this.a(var7, var9 + var10);
            int var11 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
            this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var11 - 1;
            return true;
         }
         case 261: {
            me.octo.client.lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var7 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
            if (var7 == null) {
               return true;
            }

            if (this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.a(new kotlin.jvm.functions.Function0<Unit>() {
               public Unit invoke() {
                  return lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.e(lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.this, var7);
               }
            })) {
               return true;
            }

            String var8 = this.a(var7);
            if (this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI >= var8.length()) {
               return true;
            }

            String var9 = var8.substring(0, this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var9, "substring(...)");
            String var10 = var8.substring(this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI + 1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var10, "substring(...)");
            this.a(var7, var9 + var10);
            return true;
         }
         case 262: {
            this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.b();
            me.octo.client.lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var7 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
            if (var7 == null) {
               return true;
            }

            if (this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI < this.a(var7).length()) {
               int var8 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
               this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var8 + 1;
            }

            return true;
         }
         case 263: {
            this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.b();
            if (this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI > 0) {
               int var7 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
               this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var7 - 1;
            }

            return true;
         }
         default:
            throw new kotlin.NoWhenBranchMatchedException();
      }
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.g ()[I
      // 003: astore 4
      // 005: aload 0
      // 006: aload 4
      // 008: ifnonnull 01f
      // 00b: invokevirtual me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.b ()Z
      // 00e: ifeq 01e
      // 011: goto 018
      // 014: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 017: athrow
      // 018: bipush 1
      // 019: ireturn
      // 01a: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 01d: athrow
      // 01e: aload 0
      // 01f: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 022: aload 4
      // 024: ifnonnull 03c
      // 027: ifnull 4c6
      // 02a: goto 031
      // 02d: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 030: athrow
      // 031: aload 0
      // 032: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 035: goto 03c
      // 038: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 03b: athrow
      // 03c: dup
      // 03d: ifnonnull 047
      // 040: pop
      // 041: bipush 1
      // 042: ireturn
      // 043: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 046: athrow
      // 047: astore 5
      // 049: aload 0
      // 04a: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl Lme/octo/client/lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII;
      // 04d: iload 1
      // 04e: aload 0
      // 04f: aload 5
      // 051: invokedynamic invoke (Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI;Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI;Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)Ljava/lang/String;, ()Ljava/lang/String; ]
      // 056: aload 0
      // 057: aload 5
      // 059: invokedynamic invoke (Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI;Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.b (Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI;Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)Lkotlin/Unit;, ()Lkotlin/Unit; ]
      // 05e: invokevirtual me/octo/client/lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII.a (ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Z
      // 061: aload 4
      // 063: ifnonnull 077
      // 066: ifeq 076
      // 069: goto 070
      // 06c: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 06f: athrow
      // 070: bipush 1
      // 071: ireturn
      // 072: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 075: athrow
      // 076: iload 1
      // 077: aload 4
      // 079: ifnonnull 279
      // 07c: bipush 86
      // 07e: if_icmpne 278
      // 081: goto 088
      // 084: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 087: athrow
      // 088: iload 3
      // 089: bipush 2
      // 08a: iand
      // 08b: aload 4
      // 08d: ifnonnull 279
      // 090: goto 097
      // 093: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 096: athrow
      // 097: ifeq 278
      // 09a: goto 0a1
      // 09d: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0a0: athrow
      // 0a1: aload 0
      // 0a2: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 0a5: dup
      // 0a6: ifnonnull 0b7
      // 0a9: goto 0b0
      // 0ac: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0af: athrow
      // 0b0: pop
      // 0b1: bipush 1
      // 0b2: ireturn
      // 0b3: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0b6: athrow
      // 0b7: astore 6
      // 0b9: aload 4
      // 0bb: ifnonnull 0de
      // 0be: aload 0
      // 0bf: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lnet/minecraft/client/Minecraft;
      // 0c2: invokevirtual net/minecraft/client/Minecraft.getWindow ()Lcom/mojang/blaze3d/platform/Window;
      // 0c5: invokevirtual com/mojang/blaze3d/platform/Window.handle ()J
      // 0c8: invokestatic org/lwjgl/glfw/GLFW.glfwGetClipboardString (J)Ljava/lang/String;
      // 0cb: dup
      // 0cc: ifnonnull 0e0
      // 0cf: goto 0d6
      // 0d2: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0d5: athrow
      // 0d6: pop
      // 0d7: goto 0de
      // 0da: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0dd: athrow
      // 0de: bipush 1
      // 0df: ireturn
      // 0e0: astore 7
      // 0e2: aload 7
      // 0e4: astore 9
      // 0e6: bipush 0
      // 0e7: istore 10
      // 0e9: aload 9
      // 0eb: checkcast java/lang/CharSequence
      // 0ee: astore 11
      // 0f0: new java/lang/StringBuilder
      // 0f3: dup
      // 0f4: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f7: checkcast java/lang/Appendable
      // 0fa: astore 12
      // 0fc: bipush 0
      // 0fd: istore 13
      // 0ff: bipush 0
      // 100: istore 14
      // 102: aload 11
      // 104: invokeinterface java/lang/CharSequence.length ()I 1
      // 109: istore 15
      // 10b: iload 14
      // 10d: iload 15
      // 10f: if_icmpge 17e
      // 112: aload 11
      // 114: iload 14
      // 116: invokeinterface java/lang/CharSequence.charAt (I)C 2
      // 11b: istore 16
      // 11d: iload 16
      // 11f: istore 17
      // 121: bipush 0
      // 122: istore 18
      // 124: iload 17
      // 126: istore 19
      // 128: bipush 32
      // 12a: iload 19
      // 12c: aload 4
      // 12e: ifnonnull 152
      // 131: if_icmpgt 161
      // 134: goto 13b
      // 137: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 13a: athrow
      // 13b: iload 19
      // 13d: aload 4
      // 13f: ifnonnull 15e
      // 142: goto 149
      // 145: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 148: athrow
      // 149: bipush 127
      // 14b: goto 152
      // 14e: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 151: athrow
      // 152: if_icmpge 15d
      // 155: bipush 1
      // 156: goto 162
      // 159: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 15c: athrow
      // 15d: bipush 0
      // 15e: goto 162
      // 161: bipush 0
      // 162: ifeq 176
      // 165: aload 12
      // 167: iload 16
      // 169: invokeinterface java/lang/Appendable.append (C)Ljava/lang/Appendable; 2
      // 16e: pop
      // 16f: goto 176
      // 172: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 175: athrow
      // 176: iinc 14 1
      // 179: aload 4
      // 17b: ifnull 10b
      // 17e: aload 12
      // 180: checkcast java/lang/StringBuilder
      // 183: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 186: astore 8
      // 188: aload 8
      // 18a: checkcast java/lang/CharSequence
      // 18d: invokeinterface java/lang/CharSequence.length ()I 1
      // 192: aload 4
      // 194: ifnonnull 1a2
      // 197: ifle 1a5
      // 19a: goto 1a1
      // 19d: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1a0: athrow
      // 1a1: bipush 1
      // 1a2: goto 1a6
      // 1a5: bipush 0
      // 1a6: ifeq 276
      // 1a9: aload 0
      // 1aa: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl Lme/octo/client/lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII;
      // 1ad: aload 0
      // 1ae: aload 6
      // 1b0: invokedynamic invoke (Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI;Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.c (Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI;Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)Lkotlin/Unit;, ()Lkotlin/Unit; ]
      // 1b5: invokevirtual me/octo/client/lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII.b (Lkotlin/jvm/functions/Function0;)V
      // 1b8: aload 0
      // 1b9: aload 6
      // 1bb: invokespecial me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)Ljava/lang/String;
      // 1be: astore 9
      // 1c0: aload 9
      // 1c2: bipush 0
      // 1c3: aload 0
      // 1c4: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI I
      // 1c7: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1ca: dup
      // 1cb: sipush -26051
      // 1ce: sipush 11598
      // 1d1: pop2
      // 1d2: ldc_w "substring(...)"
      // 1d5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1d8: aload 8
      // 1da: aload 9
      // 1dc: aload 0
      // 1dd: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI I
      // 1e0: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 1e3: dup
      // 1e4: sipush -26061
      // 1e7: sipush -7721
      // 1ea: pop2
      // 1eb: ldc_w "substring(...)"
      // 1ee: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1f1: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 1f6: astore 10
      // 1f8: aload 4
      // 1fa: ifnonnull 268
      // 1fd: aload 6
      // 1ff: getstatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 202: if_acmpne 260
      // 205: goto 20c
      // 208: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 20b: athrow
      // 20c: aload 10
      // 20e: invokestatic kotlin/text/StringsKt.toIntOrNull (Ljava/lang/String;)Ljava/lang/Integer;
      // 211: astore 11
      // 213: aload 11
      // 215: aload 4
      // 217: ifnonnull 226
      // 21a: ifnull 257
      // 21d: goto 224
      // 220: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 223: athrow
      // 224: aload 11
      // 226: invokevirtual java/lang/Integer.intValue ()I
      // 229: aload 4
      // 22b: ifnonnull 25f
      // 22e: bipush 1
      // 22f: if_icmplt 257
      // 232: goto 239
      // 235: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 238: athrow
      // 239: aload 11
      // 23b: invokevirtual java/lang/Integer.intValue ()I
      // 23e: aload 4
      // 240: ifnonnull 25f
      // 243: goto 24a
      // 246: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 249: athrow
      // 24a: ldc_w 65535
      // 24d: if_icmple 260
      // 250: goto 257
      // 253: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 256: athrow
      // 257: bipush 1
      // 258: goto 25f
      // 25b: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 25e: athrow
      // 25f: ireturn
      // 260: aload 0
      // 261: aload 6
      // 263: aload 10
      // 265: invokespecial me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;Ljava/lang/String;)V
      // 268: aload 0
      // 269: aload 0
      // 26a: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI I
      // 26d: aload 8
      // 26f: invokevirtual java/lang/String.length ()I
      // 272: iadd
      // 273: putfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI I
      // 276: bipush 1
      // 277: ireturn
      // 278: iload 1
      // 279: aload 4
      // 27b: ifnonnull 4c5
      // 27e: lookupswitch 582 7 256 70 257 93 259 107 261 303 262 499 263 457 335 93
      // 2c0: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2c3: athrow
      // 2c4: aload 0
      // 2c5: aconst_null
      // 2c6: putfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 2c9: aload 0
      // 2ca: bipush 0
      // 2cb: putfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll Z
      // 2ce: aload 0
      // 2cf: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl Lme/octo/client/lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII;
      // 2d2: invokevirtual me/octo/client/lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII.b ()V
      // 2d5: bipush 1
      // 2d6: ireturn
      // 2d7: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2da: athrow
      // 2db: aload 0
      // 2dc: aconst_null
      // 2dd: putfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 2e0: aload 0
      // 2e1: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl Lme/octo/client/lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII;
      // 2e4: invokevirtual me/octo/client/lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII.b ()V
      // 2e7: bipush 1
      // 2e8: ireturn
      // 2e9: aload 0
      // 2ea: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 2ed: dup
      // 2ee: ifnonnull 2f8
      // 2f1: pop
      // 2f2: bipush 1
      // 2f3: ireturn
      // 2f4: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2f7: athrow
      // 2f8: astore 7
      // 2fa: aload 0
      // 2fb: aload 4
      // 2fd: ifnonnull 31f
      // 300: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl Lme/octo/client/lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII;
      // 303: aload 0
      // 304: aload 7
      // 306: invokedynamic invoke (Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI;Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.d (Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI;Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)Lkotlin/Unit;, ()Lkotlin/Unit; ]
      // 30b: invokevirtual me/octo/client/lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII.a (Lkotlin/jvm/functions/Function0;)Z
      // 30e: ifeq 31e
      // 311: goto 318
      // 314: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 317: athrow
      // 318: bipush 1
      // 319: ireturn
      // 31a: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 31d: athrow
      // 31e: aload 0
      // 31f: aload 7
      // 321: invokespecial me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)Ljava/lang/String;
      // 324: astore 8
      // 326: aload 8
      // 328: checkcast java/lang/CharSequence
      // 32b: invokeinterface java/lang/CharSequence.length ()I 1
      // 330: aload 4
      // 332: ifnonnull 340
      // 335: ifle 343
      // 338: goto 33f
      // 33b: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 33e: athrow
      // 33f: bipush 1
      // 340: goto 344
      // 343: bipush 0
      // 344: ifeq 3ab
      // 347: aload 0
      // 348: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI I
      // 34b: aload 4
      // 34d: ifnonnull 3ac
      // 350: goto 357
      // 353: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 356: athrow
      // 357: ifle 3ab
      // 35a: goto 361
      // 35d: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 360: athrow
      // 361: aload 0
      // 362: aload 7
      // 364: aload 8
      // 366: bipush 0
      // 367: aload 0
      // 368: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI I
      // 36b: bipush 1
      // 36c: isub
      // 36d: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 370: dup
      // 371: sipush -26061
      // 374: sipush -7721
      // 377: pop2
      // 378: ldc_w "substring(...)"
      // 37b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 37e: aload 8
      // 380: aload 0
      // 381: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI I
      // 384: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 387: dup
      // 388: sipush -26061
      // 38b: sipush -7721
      // 38e: pop2
      // 38f: ldc_w "substring(...)"
      // 392: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 395: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 39a: invokespecial me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;Ljava/lang/String;)V
      // 39d: aload 0
      // 39e: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI I
      // 3a1: istore 9
      // 3a3: aload 0
      // 3a4: iload 9
      // 3a6: bipush -1
      // 3a7: iadd
      // 3a8: putfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI I
      // 3ab: bipush 1
      // 3ac: ireturn
      // 3ad: aload 0
      // 3ae: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 3b1: dup
      // 3b2: ifnonnull 3bc
      // 3b5: pop
      // 3b6: bipush 1
      // 3b7: ireturn
      // 3b8: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3bb: athrow
      // 3bc: astore 7
      // 3be: aload 0
      // 3bf: aload 4
      // 3c1: ifnonnull 3e3
      // 3c4: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl Lme/octo/client/lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII;
      // 3c7: aload 0
      // 3c8: aload 7
      // 3ca: invokedynamic invoke (Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI;Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.e (Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI;Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)Lkotlin/Unit;, ()Lkotlin/Unit; ]
      // 3cf: invokevirtual me/octo/client/lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII.a (Lkotlin/jvm/functions/Function0;)Z
      // 3d2: ifeq 3e2
      // 3d5: goto 3dc
      // 3d8: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3db: athrow
      // 3dc: bipush 1
      // 3dd: ireturn
      // 3de: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3e1: athrow
      // 3e2: aload 0
      // 3e3: aload 7
      // 3e5: invokespecial me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)Ljava/lang/String;
      // 3e8: astore 8
      // 3ea: aload 0
      // 3eb: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI I
      // 3ee: aload 4
      // 3f0: ifnonnull 446
      // 3f3: aload 8
      // 3f5: invokevirtual java/lang/String.length ()I
      // 3f8: if_icmpge 445
      // 3fb: goto 402
      // 3fe: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 401: athrow
      // 402: aload 0
      // 403: aload 7
      // 405: aload 8
      // 407: bipush 0
      // 408: aload 0
      // 409: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI I
      // 40c: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 40f: dup
      // 410: sipush -26061
      // 413: sipush -7721
      // 416: pop2
      // 417: ldc_w "substring(...)"
      // 41a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 41d: aload 8
      // 41f: aload 0
      // 420: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI I
      // 423: bipush 1
      // 424: iadd
      // 425: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 428: dup
      // 429: sipush -26061
      // 42c: sipush -7721
      // 42f: pop2
      // 430: ldc_w "substring(...)"
      // 433: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 436: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 43b: invokespecial me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;Ljava/lang/String;)V
      // 43e: goto 445
      // 441: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 444: athrow
      // 445: bipush 1
      // 446: ireturn
      // 447: aload 0
      // 448: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl Lme/octo/client/lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII;
      // 44b: invokevirtual me/octo/client/lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII.b ()V
      // 44e: aload 0
      // 44f: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI I
      // 452: aload 4
      // 454: ifnonnull 470
      // 457: ifle 46f
      // 45a: goto 461
      // 45d: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 460: athrow
      // 461: aload 0
      // 462: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI I
      // 465: istore 7
      // 467: aload 0
      // 468: iload 7
      // 46a: bipush -1
      // 46b: iadd
      // 46c: putfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI I
      // 46f: bipush 1
      // 470: ireturn
      // 471: aload 0
      // 472: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl Lme/octo/client/lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII;
      // 475: invokevirtual me/octo/client/lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII.b ()V
      // 478: aload 4
      // 47a: ifnonnull 494
      // 47d: aload 0
      // 47e: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 481: dup
      // 482: ifnonnull 496
      // 485: goto 48c
      // 488: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 48b: athrow
      // 48c: pop
      // 48d: goto 494
      // 490: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 493: athrow
      // 494: bipush 1
      // 495: ireturn
      // 496: astore 7
      // 498: aload 0
      // 499: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI I
      // 49c: aload 4
      // 49e: ifnonnull 4c3
      // 4a1: aload 0
      // 4a2: aload 7
      // 4a4: invokespecial me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)Ljava/lang/String;
      // 4a7: invokevirtual java/lang/String.length ()I
      // 4aa: if_icmpge 4c2
      // 4ad: goto 4b4
      // 4b0: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4b3: athrow
      // 4b4: aload 0
      // 4b5: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI I
      // 4b8: istore 8
      // 4ba: aload 0
      // 4bb: iload 8
      // 4bd: bipush 1
      // 4be: iadd
      // 4bf: putfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI I
      // 4c2: bipush 1
      // 4c3: ireturn
      // 4c4: bipush 1
      // 4c5: ireturn
      // 4c6: iload 1
      // 4c7: aload 4
      // 4c9: ifnonnull 4e4
      // 4cc: sipush 256
      // 4cf: if_icmpne 4e3
      // 4d2: goto 4d9
      // 4d5: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4d8: athrow
      // 4d9: aload 0
      // 4da: invokevirtual me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.d ()V
      // 4dd: bipush 1
      // 4de: ireturn
      // 4df: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4e2: athrow
      // 4e3: bipush 0
      // 4e4: ireturn
   }

   public boolean a(char param1, int param2) {
      me.octo.client.lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI local4 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      if (local4 == null) {
         return false;
      }
      if (param1 < 32 || param1 > 126) {
         return true;
      }
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.b(new kotlin.jvm.functions.Function0<kotlin.Unit>() {
         public kotlin.Unit invoke() {
            return f(lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.this, local4);
         }
      });
      String local5 = this.a(local4);
      String local10000 = local5.substring(0, this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI);
      kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(local10000, "substring(...)");
      String local10001 = local5.substring(this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI);
      kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(local10001, "substring(...)");
      String local6 = local10000 + param1 + local10001;
      if (local4 == me.octo.client.lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
         Integer local7 = kotlin.text.StringsKt.toIntOrNull(local6);
         if (local7 == null || local7.intValue() < 1 || local7.intValue() > 65535) {
            return true;
         }
      }
      this.a(local4, local6);
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI + 1;
      return true;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.g ()[I
      // 003: astore 3
      // 004: aload 3
      // 005: ifnonnull 01f
      // 008: aload 0
      // 009: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 00c: dup
      // 00d: ifnonnull 021
      // 010: goto 017
      // 013: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 016: athrow
      // 017: pop
      // 018: goto 01f
      // 01b: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 01e: athrow
      // 01f: bipush 0
      // 020: ireturn
      // 021: astore 4
      // 023: iload 1
      // 024: aload 3
      // 025: ifnonnull 054
      // 028: bipush 32
      // 02a: if_icmplt 04c
      // 02d: goto 034
      // 030: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 033: athrow
      // 034: iload 1
      // 035: aload 3
      // 036: ifnonnull 054
      // 039: goto 040
      // 03c: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 03f: athrow
      // 040: bipush 126
      // 042: if_icmple 055
      // 045: goto 04c
      // 048: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 04b: athrow
      // 04c: bipush 1
      // 04d: goto 054
      // 050: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 053: athrow
      // 054: ireturn
      // 055: aload 0
      // 056: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl Lme/octo/client/lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII;
      // 059: aload 0
      // 05a: aload 4
      // 05c: invokedynamic invoke (Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI;Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.f (Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI;Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)Lkotlin/Unit;, ()Lkotlin/Unit; ]
      // 061: invokevirtual me/octo/client/lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII.b (Lkotlin/jvm/functions/Function0;)V
      // 064: aload 0
      // 065: aload 4
      // 067: invokespecial me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)Ljava/lang/String;
      // 06a: astore 5
      // 06c: aload 5
      // 06e: bipush 0
      // 06f: aload 0
      // 070: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI I
      // 073: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 076: dup
      // 077: sipush -26061
      // 07a: sipush -7721
      // 07d: pop2
      // 07e: ldc_w "substring(...)"
      // 081: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 084: iload 1
      // 085: aload 5
      // 087: aload 0
      // 088: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI I
      // 08b: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 08e: dup
      // 08f: sipush -26061
      // 092: sipush -7721
      // 095: pop2
      // 096: ldc_w "substring(...)"
      // 099: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 09c: invokedynamic makeConcatWithConstants (Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 0a1: astore 6
      // 0a3: aload 3
      // 0a4: ifnonnull 10f
      // 0a7: aload 4
      // 0a9: getstatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 0ac: if_acmpne 107
      // 0af: goto 0b6
      // 0b2: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0b5: athrow
      // 0b6: aload 6
      // 0b8: invokestatic kotlin/text/StringsKt.toIntOrNull (Ljava/lang/String;)Ljava/lang/Integer;
      // 0bb: astore 7
      // 0bd: aload 7
      // 0bf: aload 3
      // 0c0: ifnonnull 0cf
      // 0c3: ifnull 0fe
      // 0c6: goto 0cd
      // 0c9: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0cc: athrow
      // 0cd: aload 7
      // 0cf: invokevirtual java/lang/Integer.intValue ()I
      // 0d2: aload 3
      // 0d3: ifnonnull 106
      // 0d6: bipush 1
      // 0d7: if_icmplt 0fe
      // 0da: goto 0e1
      // 0dd: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0e0: athrow
      // 0e1: aload 7
      // 0e3: invokevirtual java/lang/Integer.intValue ()I
      // 0e6: aload 3
      // 0e7: ifnonnull 113
      // 0ea: goto 0f1
      // 0ed: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0f0: athrow
      // 0f1: ldc_w 65535
      // 0f4: if_icmple 107
      // 0f7: goto 0fe
      // 0fa: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0fd: athrow
      // 0fe: bipush 1
      // 0ff: goto 106
      // 102: invokestatic me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 105: athrow
      // 106: ireturn
      // 107: aload 0
      // 108: aload 4
      // 10a: aload 6
      // 10c: invokespecial me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.a (Lme/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;Ljava/lang/String;)V
      // 10f: aload 0
      // 110: getfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI I
      // 113: istore 7
      // 115: aload 0
      // 116: iload 7
      // 118: bipush 1
      // 119: iadd
      // 11a: putfield me/octo/client/lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI I
      // 11d: bipush 1
      // 11e: ireturn
   }

   private final String a(
      lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1
   ) {
      // The synthetic Kotlin switchmap array is null in this build, so dispatch on the
      // ordinal directly (identity+1 mapping for enum constants in declaration order).
      switch (var1.ordinal()) {
         case 0:
            return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
         case 1:
            return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
         case 2:
            return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
         case 3:
            return this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
         case 4:
            return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         default:
            throw new NoWhenBranchMatchedException();
      }
   }

   private final void a(
      lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI param1,
      String param2
   ) {
      // Restored from the bytecode (offsets 08-94): a switch on the field enum that
      // writes param2 into the matching backing string field.
      switch (param1.ordinal()) {
         case 0:
            this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = param2;
            break;
         case 1:
            this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = param2;
            break;
         case 2:
            this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = param2;
            break;
         case 3:
            this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = param2;
            break;
         case 4:
            this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = param2;
            break;
         default:
            throw new kotlin.NoWhenBranchMatchedException();
      }
   }

   private final void g() {
      int[] var1 = me.octo.client.IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.g();
      if (kotlin.text.StringsKt.isBlank(this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) || kotlin.text.StringsKt.isBlank(this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI)) {
         return;
      }
      Integer var2 = kotlin.text.StringsKt.toIntOrNull(this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl);
      if (var2 == null || var2.intValue() < 1 || var2.intValue() > 65535) {
         return;
      }
      me.octo.client.utils.llllllIlIlIIlIIllIIllllIllIlIlIllIIIlIIlIllllIlIllIIIIlllIIlIllIIlIIlIllIIIlIIIllIllI var3 = new me.octo.client.utils.llllllIlIlIIlIIllIIllllIllIlIlIllIIIlIIlIllllIlIllIIIIlllIIlIllIIlIIlIllIIIlIIIllIllI(
         kotlin.text.StringsKt.trim(this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll).toString(),
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
         kotlin.text.StringsKt.trim(this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI).toString(),
         var2.intValue(),
         kotlin.text.StringsKt.trim(this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI).toString(),
         kotlin.text.StringsKt.trim(this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl).toString());
      if (me.octo.client.utils.IIIllIIlllIlIlllllllIlIllIIIlIllllIIIllllllIlllllIIlIlIIllIlIIIIlllIIllllIlllIlIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var3)) {
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.h();
         this.d();
      }
   }

   private static final Unit a(lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI var0) {
      var0.g();
      return Unit.INSTANCE;
   }

   private static final Unit b(lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI var0) {
      var0.d();
      return Unit.INSTANCE;
   }

   private static final boolean a(
      FloatRef param0,
      float param1,
      float param2,
      float param3,
      float param4,
      float param5,
      float param6,
      float param7,
      lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI param8,
      float param9,
      lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI param10,
      String param11
   ) {
      param0.element = param0.element + (param1 + 5.0F);
      int[] var12 = me.octo.client.IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.g();
      float var13 = param0.element;
      boolean var14 = var12 != null
         || param2 >= param3 + param4
            && param2 <= param3 + param5 - param4
            && param6 >= var13
            && param6 <= var13 + param7;
      if (var14) {
         param8.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = param10;
         param8.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = param11.length();
         param8.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = false;
         param8.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.b();
         return true;
      } else {
         param0.element = param0.element + (param7 + param9);
         return false;
      }
   }

   private static final String a(
      lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI var0,
      lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1
   ) {
      return var0.a(var1);
   }

   private static final Unit b(
      lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI var0,
      lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1
   ) {
      var0.a(var1, "");
      var0.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 0;
      return Unit.INSTANCE;
   }

   private static final Unit c(
      lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI var0,
      lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1
   ) {
      var0.a(var1, "");
      var0.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 0;
      return Unit.INSTANCE;
   }

   private static final Unit d(
      lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI var0,
      lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1
   ) {
      var0.a(var1, "");
      var0.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 0;
      return Unit.INSTANCE;
   }

   private static final Unit e(
      lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI var0,
      lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1
   ) {
      var0.a(var1, "");
      var0.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 0;
      return Unit.INSTANCE;
   }

   private static final Unit f(
      lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI var0,
      lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1
   ) {
      var0.a(var1, "");
      var0.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 0;
      return Unit.INSTANCE;
   }

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[26];
      int var3 = 0;
      String var2 = ".\u000f\f:þ¢½ï¯\nÈ»è !àk¦d8\u000euf\u0015w?2#ë¤2\"\u00822Å\bÃ\u0096\u0095ÿ\u001f>_Þ\bcqz*\u001dÜ\u0017«\u0017º\u001búÌ®\u0083£À~\u0080\u008dÊ±\u0091ÂlV\u0007((vo\u0007\u0006ð\u007f\u009fÒò\u008a\u0010\u0012,y\u0016|b\u000fÏ\u0096\u0013\u0007\u0082´\u0004¬¡\u0004]~@Ú\bø/A\u0099HÝ\u0090l\u0099\u0093@Ý\u001fxT\\qlòÉTðE\u001c\u0006\u009aà\u001fYÆkn\u0003\u0098¡¤g{[+hô,É7\u001c\nLEÎöëÚ8¡Õ×\u0082\u0090ä1´\nÜ\u0005\u0019ê¾\u001c\u00adÐw¢à\u0003¯»SpúxÌûur\u0018LÐÍÎ9Â4í\t Y×\u009c©hÒÍMz\u001e\u001c$4\u0094\u0087®Î½©ur\u0004Â$ãKOjÅ&AZ^\u0087\u0019Ø¡4TÛu\u0084»Üõ\u0094\u0081¨\u009f\u00020÷U\u0005M|±\u00809=^ÅÖÀ\u0019¯\b\\M\u009d\u00adá,\u0088µ\u000e\u0093ëÉÆ¤\u0004P-Êêï\u0099\u008b¦\näX\u0018\u0003\u0084Þ]©\u0007K\u0004\u0016ª.°\t\u0007\u001c\u0004Ê¦/\u0085ßT»«¥Ú£\u0098ß\u0013Éûe\u0091&\\ ÿ\u0001I\u008c»\u0088fè+Ýf(ÿBV9\u000eyÀ´\u0093ªe\u0098r3|Øe¨\u0007\u0093p&bÐVÍ¤×~ÿ\u008düàË6Y1ÈÐ\u008dfã(ÌÑÄ\u001fv\u0014ý\u0012\u0007\t`x§eÈWþ*È\u0086®\u009fbÂ\u0007j¤OÖ\\\fäÆn?\u0085\r8P»\u0089wx\u0007¦rlÝ\u000b¸\u0081â\u009f\u0019\u009fÏ\u00917\u0089âûðÈMâN\u009cÞL \ftCÉÊë \u001fDDÿ\u0084-HÇ]OZ®\u0092pO§¡o\u0012\u0014îÃIÍFþ:7HÙ3\u0094qQ\u0085v\u0087\u0091N§\u008f\n\u0010ìóÊB½\u001d\u0015îU\u008am\u0091\u0002%\u0083\u000fpÓ\u0097&\u001cNí\u00adÉ \u008f¸c\u000e}8HÇ\nkr*ç48Ø\u0006\u0080K,~H\u0011)\u0010\u009bèÀ¶\u009eF\u0087¤ä\u008eK¿\u0007\u001dåá¿m£\u0087T\u0007i\u0016¹¾e3\u001c²Þs5\u0099\u0095£\n?Á¾\u0093½NL.IÒêí\u0012\u0016u\u0014FÈDÁVX·S&5£\u0089PÊ²ÀÞA¸üq\u009aÒ\u00ad\u0084b{IàÛ\u0013t]´\u0004\u0081C\u009b4DÙ6®\u0080Í\u0017\u0006M×jM\u001eR$\u0096ÀØÑÔ84\u001e¦\u008f\u0091Ôr, ÐÅ\u00adëZÊ\u000fZpjYÿ\u000e\u0013\u000ef\u0086\u0092âV\u00190ñå\u0006Ötù¦\u0013\u009e&Q\u008e·\u0090\u008cAS\u0090dE?sAi¸[\u0084\u009f|þ9ÝôÿJ\u007fRüÿ\u0010âz\u009fø äó\\iH\u009aZ´à\u0080\u0080ö 8î®,m\u001c+Ë\u0085\u008f\u001f×\u0088\r\u0096@'\u0086¡»Ãð\u0098ë¼8ûê\u001d²\u0018RÉæ\u008e\u008f*\u0016\u0085Õs\r=Z\\ÇJ°ÛÂ5®(ón\u0089JÑ¿\u0095ÑÙÍ¼Xb\u0085\tÜÌùyÃý\u0000.\u0018ÌÉj¥\u009eª\u000b\u0006\u009a'\u0093ó±Õj\u008d\u0012\u000f×§\u0090Èéþ\bl\u0010à2Ò3\u0087%\u0089ÿ|P\u0098É¸9%¾ø9\u0095IÖ]Ï\u001dU1³7\u008f\u00011#µWñCO¬·\u0094m\u0019\u00914ÿXß9EÍ\u001b\u0012åÒè6\tÜöõ°T\u0013ÈaHx#/\u0093\u0006\u0084TìØy«û(Zë¼N\u0007q«®,~ïó\u0006\u0099\u0000$Ã37ÍÑoÒ§Ö,\u0004åýäoÃ\u008aWu\u0011\u0015³I!_\u000e'ý½;\u0005\u0090ÀM>5,1£®´ÂIà¶_O©{\u0004ó\u0094\u0095\u0087\bÝª»@æ\u008eÏÕ";
      int var4 = ".\u000f\f:þ¢½ï¯\nÈ»è !àk¦d8\u000euf\u0015w?2#ë¤2\"\u00822Å\bÃ\u0096\u0095ÿ\u001f>_Þ\bcqz*\u001dÜ\u0017«\u0017º\u001búÌ®\u0083£À~\u0080\u008dÊ±\u0091ÂlV\u0007((vo\u0007\u0006ð\u007f\u009fÒò\u008a\u0010\u0012,y\u0016|b\u000fÏ\u0096\u0013\u0007\u0082´\u0004¬¡\u0004]~@Ú\bø/A\u0099HÝ\u0090l\u0099\u0093@Ý\u001fxT\\qlòÉTðE\u001c\u0006\u009aà\u001fYÆkn\u0003\u0098¡¤g{[+hô,É7\u001c\nLEÎöëÚ8¡Õ×\u0082\u0090ä1´\nÜ\u0005\u0019ê¾\u001c\u00adÐw¢à\u0003¯»SpúxÌûur\u0018LÐÍÎ9Â4í\t Y×\u009c©hÒÍMz\u001e\u001c$4\u0094\u0087®Î½©ur\u0004Â$ãKOjÅ&AZ^\u0087\u0019Ø¡4TÛu\u0084»Üõ\u0094\u0081¨\u009f\u00020÷U\u0005M|±\u00809=^ÅÖÀ\u0019¯\b\\M\u009d\u00adá,\u0088µ\u000e\u0093ëÉÆ¤\u0004P-Êêï\u0099\u008b¦\näX\u0018\u0003\u0084Þ]©\u0007K\u0004\u0016ª.°\t\u0007\u001c\u0004Ê¦/\u0085ßT»«¥Ú£\u0098ß\u0013Éûe\u0091&\\ ÿ\u0001I\u008c»\u0088fè+Ýf(ÿBV9\u000eyÀ´\u0093ªe\u0098r3|Øe¨\u0007\u0093p&bÐVÍ¤×~ÿ\u008düàË6Y1ÈÐ\u008dfã(ÌÑÄ\u001fv\u0014ý\u0012\u0007\t`x§eÈWþ*È\u0086®\u009fbÂ\u0007j¤OÖ\\\fäÆn?\u0085\r8P»\u0089wx\u0007¦rlÝ\u000b¸\u0081â\u009f\u0019\u009fÏ\u00917\u0089âûðÈMâN\u009cÞL \ftCÉÊë \u001fDDÿ\u0084-HÇ]OZ®\u0092pO§¡o\u0012\u0014îÃIÍFþ:7HÙ3\u0094qQ\u0085v\u0087\u0091N§\u008f\n\u0010ìóÊB½\u001d\u0015îU\u008am\u0091\u0002%\u0083\u000fpÓ\u0097&\u001cNí\u00adÉ \u008f¸c\u000e}8HÇ\nkr*ç48Ø\u0006\u0080K,~H\u0011)\u0010\u009bèÀ¶\u009eF\u0087¤ä\u008eK¿\u0007\u001dåá¿m£\u0087T\u0007i\u0016¹¾e3\u001c²Þs5\u0099\u0095£\n?Á¾\u0093½NL.IÒêí\u0012\u0016u\u0014FÈDÁVX·S&5£\u0089PÊ²ÀÞA¸üq\u009aÒ\u00ad\u0084b{IàÛ\u0013t]´\u0004\u0081C\u009b4DÙ6®\u0080Í\u0017\u0006M×jM\u001eR$\u0096ÀØÑÔ84\u001e¦\u008f\u0091Ôr, ÐÅ\u00adëZÊ\u000fZpjYÿ\u000e\u0013\u000ef\u0086\u0092âV\u00190ñå\u0006Ötù¦\u0013\u009e&Q\u008e·\u0090\u008cAS\u0090dE?sAi¸[\u0084\u009f|þ9ÝôÿJ\u007fRüÿ\u0010âz\u009fø äó\\iH\u009aZ´à\u0080\u0080ö 8î®,m\u001c+Ë\u0085\u008f\u001f×\u0088\r\u0096@'\u0086¡»Ãð\u0098ë¼8ûê\u001d²\u0018RÉæ\u008e\u008f*\u0016\u0085Õs\r=Z\\ÇJ°ÛÂ5®(ón\u0089JÑ¿\u0095ÑÙÍ¼Xb\u0085\tÜÌùyÃý\u0000.\u0018ÌÉj¥\u009eª\u000b\u0006\u009a'\u0093ó±Õj\u008d\u0012\u000f×§\u0090Èéþ\bl\u0010à2Ò3\u0087%\u0089ÿ|P\u0098É¸9%¾ø9\u0095IÖ]Ï\u001dU1³7\u008f\u00011#µWñCO¬·\u0094m\u0019\u00914ÿXß9EÍ\u001b\u0012åÒè6\tÜöõ°T\u0013ÈaHx#/\u0093\u0006\u0084TìØy«û(Zë¼N\u0007q«®,~ïó\u0006\u0099\u0000$Ã37ÍÑoÒ§Ö,\u0004åýäoÃ\u008aWu\u0011\u0015³I!_\u000e'ý½;\u0005\u0090ÀM>5,1£®´ÂIà¶_O©{\u0004ó\u0094\u0095\u0087\bÝª»@æ\u008eÏÕ"
         .length();
      char var1 = '\t';
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
                     case 0 -> 80;
                     case 1 -> 36;
                     case 2 -> 107;
                     case 3 -> 50;
                     case 4 -> 15;
                     case 5 -> 80;
                     default -> 19;
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
                     b = new String[26];
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

                  var2 = "\u0082\u009a\u007fþ)¬¿\u001aÂ¹\u0099óã\u0080SþZ\u0003ÚÙh";
                  var4 = "\u0082\u009a\u007fþ)¬¿\u001aÂ¹\u0099óã\u0080SþZ\u0003ÚÙh".length();
                  var1 = 17;
                  var8 = -1;
            }

            var10000 = 113;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -26049) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 150;
            case 1 -> 1;
            case 2 -> 144;
            case 3 -> 63;
            case 4 -> 37;
            case 5 -> 94;
            case 6 -> 249;
            case 7 -> 2;
            case 8 -> 241;
            case 9 -> 246;
            case 10 -> 99;
            case 11 -> 58;
            case 12 -> 216;
            case 13 -> 187;
            case 14 -> 53;
            case 15 -> 62;
            case 16 -> 28;
            case 17 -> 247;
            case 18 -> 248;
            case 19 -> 252;
            case 20 -> 142;
            case 21 -> 77;
            case 22 -> 110;
            case 23 -> 223;
            case 24 -> 173;
            case 25 -> 33;
            case 26 -> 219;
            case 27 -> 7;
            case 28 -> 118;
            case 29 -> 90;
            case 30 -> 229;
            case 31 -> 11;
            case 32 -> 251;
            case 33 -> 221;
            case 34 -> 3;
            case 35 -> 98;
            case 36 -> 203;
            case 37 -> 35;
            case 38 -> 10;
            case 39 -> 74;
            case 40 -> 134;
            case 41 -> 136;
            case 42 -> 195;
            case 43 -> 122;
            case 44 -> 153;
            case 45 -> 152;
            case 46 -> 57;
            case 47 -> 123;
            case 48 -> 30;
            case 49 -> 55;
            case 50 -> 145;
            case 51 -> 182;
            case 52 -> 222;
            case 53 -> 158;
            case 54 -> 165;
            case 55 -> 205;
            case 56 -> 124;
            case 57 -> 218;
            case 58 -> 204;
            case 59 -> 102;
            case 60 -> 233;
            case 61 -> 71;
            case 62 -> 197;
            case 63 -> 92;
            case 64 -> 151;
            case 65 -> 26;
            case 66 -> 191;
            case 67 -> 80;
            case 68 -> 166;
            case 69 -> 87;
            case 70 -> 172;
            case 71 -> 14;
            case 72 -> 163;
            case 73 -> 43;
            case 74 -> 156;
            case 75 -> 176;
            case 76 -> 70;
            case 77 -> 13;
            case 78 -> 160;
            case 79 -> 6;
            case 80 -> 230;
            case 81 -> 240;
            case 82 -> 100;
            case 83 -> 234;
            case 84 -> 226;
            case 85 -> 113;
            case 86 -> 29;
            case 87 -> 179;
            case 88 -> 79;
            case 89 -> 143;
            case 90 -> 66;
            case 91 -> 91;
            case 92 -> 141;
            case 93 -> 201;
            case 94 -> 135;
            case 95 -> 5;
            case 96 -> 237;
            case 97 -> 169;
            case 98 -> 228;
            case 99 -> 39;
            case 100 -> 130;
            case 101 -> 111;
            case 102 -> 9;
            case 103 -> 214;
            case 104 -> 120;
            case 105 -> 242;
            case 106 -> 167;
            case 107 -> 157;
            case 108 -> 115;
            case 109 -> 239;
            case 110 -> 154;
            case 111 -> 47;
            case 112 -> 215;
            case 113 -> 202;
            case 114 -> 193;
            case 115 -> 68;
            case 116 -> 109;
            case 117 -> 146;
            case 118 -> 72;
            case 119 -> 20;
            case 120 -> 243;
            case 121 -> 253;
            case 122 -> 52;
            case 123 -> 82;
            case 124 -> 161;
            case 125 -> 23;
            case 126 -> 189;
            case 127 -> 125;
            case 128 -> 50;
            case 129 -> 101;
            case 130 -> 95;
            case 131 -> 104;
            case 132 -> 190;
            case 133 -> 45;
            case 134 -> 227;
            case 135 -> 119;
            case 136 -> 140;
            case 137 -> 105;
            case 138 -> 67;
            case 139 -> 208;
            case 140 -> 129;
            case 141 -> 32;
            case 142 -> 51;
            case 143 -> 235;
            case 144 -> 21;
            case 145 -> 25;
            case 146 -> 40;
            case 147 -> 207;
            case 148 -> 112;
            case 149 -> 41;
            case 150 -> 128;
            case 151 -> 27;
            case 152 -> 36;
            case 153 -> 162;
            case 154 -> 231;
            case 155 -> 138;
            case 156 -> 46;
            case 157 -> 164;
            case 158 -> 44;
            case 159 -> 171;
            case 160 -> 178;
            case 161 -> 93;
            case 162 -> 60;
            case 163 -> 206;
            case 164 -> 254;
            case 165 -> 116;
            case 166 -> 174;
            case 167 -> 180;
            case 168 -> 127;
            case 169 -> 199;
            case 170 -> 15;
            case 171 -> 210;
            case 172 -> 238;
            case 173 -> 137;
            case 174 -> 65;
            case 175 -> 117;
            case 176 -> 61;
            case 177 -> 188;
            case 178 -> 194;
            case 179 -> 220;
            case 180 -> 225;
            case 181 -> 31;
            case 182 -> 48;
            case 183 -> 85;
            case 184 -> 97;
            case 185 -> 255;
            case 186 -> 54;
            case 187 -> 8;
            case 188 -> 212;
            case 189 -> 209;
            case 190 -> 147;
            case 191 -> 184;
            case 192 -> 250;
            case 193 -> 0;
            case 194 -> 168;
            case 195 -> 217;
            case 196 -> 148;
            case 197 -> 121;
            case 198 -> 34;
            case 199 -> 75;
            case 200 -> 232;
            case 201 -> 24;
            case 202 -> 133;
            case 203 -> 181;
            case 204 -> 186;
            case 205 -> 103;
            case 206 -> 139;
            case 207 -> 49;
            case 208 -> 224;
            case 209 -> 185;
            case 210 -> 236;
            case 211 -> 177;
            case 212 -> 88;
            case 213 -> 183;
            case 214 -> 192;
            case 215 -> 170;
            case 216 -> 245;
            case 217 -> 78;
            case 218 -> 76;
            case 219 -> 200;
            case 220 -> 84;
            case 221 -> 17;
            case 222 -> 198;
            case 223 -> 132;
            case 224 -> 18;
            case 225 -> 22;
            case 226 -> 73;
            case 227 -> 159;
            case 228 -> 38;
            case 229 -> 4;
            case 230 -> 108;
            case 231 -> 244;
            case 232 -> 56;
            case 233 -> 89;
            case 234 -> 211;
            case 235 -> 126;
            case 236 -> 42;
            case 237 -> 16;
            case 238 -> 114;
            case 239 -> 69;
            case 240 -> 96;
            case 241 -> 83;
            case 242 -> 81;
            case 243 -> 64;
            case 244 -> 213;
            case 245 -> 59;
            case 246 -> 106;
            case 247 -> 149;
            case 248 -> 19;
            case 249 -> 175;
            case 250 -> 86;
            case 251 -> 196;
            case 252 -> 131;
            case 253 -> 12;
            case 254 -> 155;
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

   public static enum IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;

      public static lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] a() {
         return (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[])IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.clone();
      }

      public static lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         String var0
      ) {
         return Enum.valueOf(
            lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> b() {
         return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[]{IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII};

      private static final EnumEntries<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = EnumEntriesKt.enumEntries(IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
   

  // PX-FIX synth restored from jar bytecode

  // PX-FIX synth restored from jar bytecode: anewarray + getstatic*/aastore
  public static final me.octo.client.lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] c() { return new me.octo.client.lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] { IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII }; }
}
}
