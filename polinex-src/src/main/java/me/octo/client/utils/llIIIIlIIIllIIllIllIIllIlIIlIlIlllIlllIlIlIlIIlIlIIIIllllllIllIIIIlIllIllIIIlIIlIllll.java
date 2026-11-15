package me.octo.client.utils;

import java.awt.Color;
import java.util.Arrays;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector4f;
import org.lwjgl.nanovg.NVGColor;
import org.lwjgl.nanovg.NanoVG;

public final class llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll {
   @NotNull
   public static llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll();
   private int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 255;
   private float IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private float IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private float lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private boolean IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @JvmField
   @NotNull
   public static llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @JvmField
   @NotNull
   public static llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @JvmField
   @NotNull
   public static llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @JvmField
   @NotNull
   public static llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @JvmField
   @NotNull
   public static llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @JvmField
   @NotNull
   public static llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @JvmField
   @NotNull
   public static llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @JvmField
   @NotNull
   public static llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @JvmField
   @NotNull
   public static llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @JvmField
   @NotNull
   public static llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   @JvmField
   @NotNull
   public static llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   @JvmField
   @NotNull
   public static llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   @JvmField
   @NotNull
   public static llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   @JvmField
   @NotNull
   public static llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   @JvmField
   @NotNull
   public static llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   private static String[] lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   private static String[] b;
   private static String[] c;

   public final int a() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final int b() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final int c() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   public final int d() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   public llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(int var1, int var2, int var3) {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var2;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var3;
   }

   public llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(int var1, int var2, int var3, int var4) {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var2;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var3;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var4;
   }

   public llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(float var1, float var2, float var3, float var4) {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = (int)(var1 * 255.0F);
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = (int)(var2 * 255.0F);
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = (int)(var3 * 255.0F);
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = (int)(var4 * 255.0F);
   }

   public llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(@NotNull Color var1) {
      short var10001 = -27266;
      short var10002 = -4788;
      Intrinsics.checkNotNullParameter(var1, "awtColor");
      this(var1.getRed(), var1.getGreen(), var1.getBlue(), var1.getAlpha());
   }

   public llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(int var1) {
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1 >> 24 & 0xFF;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1 >> 16 & 0xFF;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1 >> 8 & 0xFF;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var1 & 0xFF;
      if (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII == 0 && var1 != 0) {
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 255;
      }
   }

   public llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(int var1, boolean var2) {
      if (var2) {
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1 >> 24 & 0xFF;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1 >> 16 & 0xFF;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1 >> 8 & 0xFF;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var1 & 0xFF;
      } else {
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 255;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1 >> 16 & 0xFF;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1 >> 8 & 0xFF;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var1 & 0xFF;
      }
   }

   public llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(float var1, float var2, float var3) {
      this.a(var1, var2, var3);
   }

   @NotNull
   public final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll a(float var1) {
      return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         (int)(var1 * 255)
      );
   }

   @NotNull
   public final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll a(int var1) {
      return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         var1
      );
   }

   @NotNull
   public final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll b(float var1) {
      return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         RangesKt.coerceIn(
            (int)(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII * RangesKt.coerceIn(var1, 0.0F, 1.0F)), 0, 255
         )
      );
   }

   @NotNull
   public final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll c(float var1) {
      return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         RangesKt.coerceIn((int)(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII + var1), 0, 255)
      );
   }

   @NotNull
   public final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll b(int var1) {
      return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         RangesKt.coerceIn(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII + var1, 0, 255)
      );
   }

   @NotNull
   public final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll e() {
      return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         255
      );
   }

   @NotNull
   public final Vector4f f() {
      return new Vector4f(
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII / 255.0F,
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl / 255.0F,
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI / 255.0F,
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII / 255.0F
      );
   }

   public final int g() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII << 24
         | this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII << 16
         | this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl << 8
         | this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @NotNull
   public final String h() {
      String var10000 = Integer.toString(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, CharsKt.checkRadix(16));
      short var10002 = -27279;
      short var10003 = 8337;
      Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
      String var1 = StringsKt.padStart(var10000, 2, '0');
      var10000 = Integer.toString(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, CharsKt.checkRadix(16));
      var10002 = -27265;
      var10003 = 23580;
      Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
      String var2 = StringsKt.padStart(var10000, 2, '0');
      var10000 = Integer.toString(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, CharsKt.checkRadix(16));
      var10002 = -27265;
      var10003 = 23580;
      Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
      String var3 = StringsKt.padStart(var10000, 2, '0');
      return "#" + var1 + var2 + var3;
   }

   @NotNull
   public final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll d(float var1) {
      return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
         RangesKt.coerceIn((int)(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII * var1), 0, 255),
         RangesKt.coerceIn((int)(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl * var1), 0, 255),
         RangesKt.coerceIn((int)(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI * var1), 0, 255),
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
   }

   @NotNull
   public final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll e(float var1) {
      return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
         RangesKt.coerceIn((int)(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII / var1), 0, 255),
         RangesKt.coerceIn((int)(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl / var1), 0, 255),
         RangesKt.coerceIn((int)(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI / var1), 0, 255),
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
   }

   @NotNull
   public final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll i() {
      return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
         RangesKt.coerceAtLeast((int)(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII * 0.7F), 0),
         RangesKt.coerceAtLeast((int)(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl * 0.7F), 0),
         RangesKt.coerceAtLeast((int)(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI * 0.7F), 0),
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
   }

   @NotNull
   public final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll j() {
      String[] var10000 = v();
      byte var2 = 3;
      String[] var1 = var10000;
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var3 = this;
      if (var1 == null) {
         if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII == 0) {
            if (var1 != null) {
               return this;
            }

            if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == 0) {
               if (var1 != null) {
                  return this;
               }

               if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI == 0) {
                  return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
                     var2, var2, var2, this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                  );
               }
            }
         }

         var3 = new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
            RangesKt.coerceAtMost((int)(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII / 0.7F), 255),
            RangesKt.coerceAtMost((int)(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl / 0.7F), 255),
            RangesKt.coerceAtMost((int)(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI / 0.7F), 255),
            this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         );
      }

      return var3;
   }

   @NotNull
   public final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll f(float var1) {
      return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
         RangesKt.coerceIn((int)(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII + var1), 0, 255),
         RangesKt.coerceIn((int)(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl + var1), 0, 255),
         RangesKt.coerceIn((int)(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI + var1), 0, 255),
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
   }

   @NotNull
   public final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll k() {
      return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
   }

   @NotNull
   public final Color l() {
      return new Color(
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
   }

   private final void a(int var1, int var2, int var3) {
      float var5 = var1 / 255.0F;
      float var6 = var2 / 255.0F;
      float var7 = var3 / 255.0F;
      float var8 = Math.max(var5, Math.max(var6, var7));
      String[] var10000 = v();
      float var9 = Math.min(var5, Math.min(var6, var7));
      float var10 = var8 - var9;
      String[] var4 = var10000;
      float var15;
      int var10001 = (var15 = var10 - 0.0F) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
      if (var4 == null) {
         var10001 = (((var10001 == 0) ? 1 : 0));
      }

      float var11;
      if ((var10001 != 0)) {
         var11 = 0.0F;
      } else {
         float var16;
         var10001 = (var16 = var8 - var5) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1);
         if (var4 == null) {
            var10001 = (((var10001 == 0) ? 1 : 0));
         }

         if ((var10001 != 0)) {
            var11 = 60.0F * ((var6 - var7) / var10 % 6);
         } else {
            float var17;
            var10001 = (var17 = var8 - var6) == 0.0F ? 0 : (var17 < 0.0F ? -1 : 1);
            if (var4 == null) {
               var10001 = (((var10001 == 0) ? 1 : 0));
            }

            var11 =(( ((Float)(Object)(((var10001 != 0 ? 1 : 0)!= 0) ? 60.0F * ((var7 - var5) / var10 + 2) : 60.0F * ((var5 - var6) / var10 + 2)))));
         }
      }

      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var11;
      float var18;
      var10001 = (var18 = var8 - 0.0F) == 0.0F ? 0 : (var18 < 0.0F ? -1 : 1);
      if (var4 == null) {
         var10001 = (((var10001 == 0) ? 1 : 0));
      }

      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll =(( ((Float)(Object)(((var10001 != 0 ? 1 : 0)!= 0) ? 0.0F : var10 / var8))));
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var8;
   }

   private final void m() {
      String[] var1 = v();
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var10000 = this;
      if (var1 == null) {
         if (this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) {
            return;
         }

         this.a(
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         );
         var10000 = this;
      }

      var10000.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = true;
   }

   public final void a(float var1, float var2, float var3) {
      String[] var10000 = v();
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var2;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var3;
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var5 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
         var1, var2, var3
      );
      String[] var4 = var10000;
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6 = var5;
      if (var4 == null) {
         if (var5 != null) {
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var5.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var5.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var5.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         var6 = this;
      }

      var6.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = true;
   }

   public final void g(float var1) {
      String[] var10000 = v();
      this.m();
      String[] var2 = var10000;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var3 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
      );
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4 = var3;
      if (var2 == null) {
         if (var3 == null) {
            return;
         }

         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         var4 = this;
      }

      var4.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   public final void h(float var1) {
      String[] var10000 = v();
      this.m();
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var1;
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var3 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
      );
      String[] var2 = var10000;
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4 = var3;
      if (var2 == null) {
         if (var3 == null) {
            return;
         }

         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         var4 = this;
      }

      var4.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   public final void i(float var1) {
      this.m();
      String[] var10000 = v();
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var1;
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var3 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
      );
      String[] var2 = var10000;
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4 = var3;
      if (var2 == null) {
         if (var3 == null) {
            return;
         }

         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         var4 = this;
      }

      var4.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   public final void b(int var1, int var2, int var3) {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var2;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var3;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = false;
   }

   public final void a(int var1, int var2, int var3, int var4) {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var2;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var3;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var4;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = false;
   }

   public final void c(int var1) {
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
   }

   @NotNull
   public final String n() {
      return ""
         + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   public final int o() {
      int var1 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII << 24 & 0xFF000000;
      int var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII << 16 & 0xFF0000;
      int var3 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl << 8 & 0xFF00;
      int var4 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI & 0xFF;
      return var1 | var2 | var3 | var4;
   }

   @NotNull
   public final String p() {
      short var10000 = -27267;
      short var10001 = -31584;
      String var1 = "#%06X";
      Object[] var2 = new Object[]{this.o()};
      String var3 = String.format(var1, Arrays.copyOf(var2, var2.length));
      short var10002 = -27277;
      short var10003 = -22536;
      Intrinsics.checkNotNullExpressionValue(var3, "format(...)");
      return var3;
   }

   public final float q() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII / 255.0F;
   }

   public final float r() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl / 255.0F;
   }

   public final float s() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI / 255.0F;
   }

   public final float t() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII / 255.0F;
   }

   @NotNull
   public final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll a(
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1
   ) {
      short var10001 = -27284;
      short var10002 = 18745;
      Intrinsics.checkNotNullParameter(var1, "color");
      return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            + var1.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            + var1.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            + var1.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
      );
   }

   @NotNull
   public final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll b(float var1, float var2, float var3) {
      return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
         Math.min(255, this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII + (int)var1),
         Math.min(255, this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl + (int)var2),
         Math.min(255, this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI + (int)var3)
      );
   }

   @NotNull
   public final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll b(
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1
   ) {
      short var10001 = -27272;
      short var10002 = -29641;
      Intrinsics.checkNotNullParameter(var1, "other");
      return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
         (
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  + var1.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )
            / 2,
         (
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                  + var1.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            )
            / 2,
         (
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                  + var1.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            )
            / 2,
         (
               this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                  + var1.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            )
            / 2
      );
   }

   @NotNull
   public final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll a(
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, float var2
   ) {
      short var10001 = -27287;
      short var10002 = 17280;
      Intrinsics.checkNotNullParameter(var1, "other");
      float var3 = RangesKt.coerceIn(var2, 0.0F, 1.0F);
      return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
         (int)(
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII * (1.0F - var3)
               + var1.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII * var3
         ),
         (int)(
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl * (1.0F - var3)
               + var1.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl * var3
         ),
         (int)(
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI * (1.0F - var3)
               + var1.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI * var3
         ),
         (int)(
            this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII * (1.0F - var3)
               + var1.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII * var3
         )
      );
   }

   @NotNull
   public final NVGColor u() {
      NVGColor var10000 = NVGColor.create();
      short var10002 = -27270;
      short var10003 = -30901;
      Intrinsics.checkNotNullExpressionValue(var10000, "create(...)");
      NVGColor var1 = var10000;
      NanoVG.nvgRGBA(
         (byte)this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         (byte)this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
         (byte)this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         (byte)this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
         var1
      );
      return var1;
   }

   @JvmStatic
   @NotNull
   public static final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll a(
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var0,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1,
      float var2
   ) {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0, var1, var2);
   }

   @JvmStatic
   @NotNull
   public static final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll a(
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var0,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1
   ) {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0, var1);
   }

   @JvmStatic
   @NotNull
   public static final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll b(
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var0,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1,
      float var2
   ) {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var0, var1, var2);
   }

   @JvmStatic
   @NotNull
   public static final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll d(int var0) {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0);
   }

   @JvmStatic
   @NotNull
   public static final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll e(int var0) {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var0);
   }

   @JvmStatic
   @NotNull
   public static final String c(int var0, int var1, int var2) {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0, var1, var2);
   }

   @JvmStatic
   public static final int d(int var0, int var1, int var2) {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var0, var1, var2);
   }

   @JvmStatic
   public static final int e(int var0, int var1, int var2) {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(var0, var1, var2);
   }

   @JvmStatic
   @NotNull
   public static final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll a(@NotNull String var0) {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0);
   }

   @JvmStatic
   @Nullable
   public static final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll c(float var0, float var1, float var2) {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0, var1, var2);
   }

   @JvmStatic
   @NotNull
   public static final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll d(float var0, float var1, float var2) {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var0, var1, var2);
   }

   @JvmStatic
   @NotNull
   public static final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll b(@NotNull String var0) {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var0);
   }

   @JvmStatic
   @NotNull
   public static final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll a(@NotNull LivingEntity var0) {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[22];
      int var3 = 0;
      String var2 = "\u0017\u0000\u008d8\u0005\u0013(\tãÑ\u0003#\u001d¹\u000bOõ\u0002\u009a\u001a@\u0080\u0015³æÍ\u0005]È]×\"\nYô(Ï\u0019Ü«\u0087;0\rÈd1\u0003\u008aÈ\u0012Ài<W¥\u0013\b±3\u008eÅ£Ä\u0088ñ\r²/~jcå/eÎ\u0088£3\u008d\u0004\f\u0007j¥\u000b1¼\u007f\u0001U¯ÞÛx?´\u0005@Ôc¾(\u0005ñ_ô\u0014[\tª\u007fJ´éÈÊ\r¸\u0004¦\rAó\u0004Ð÷Ä\u0007\u0005@kc\u008b\u009c\u0006èÝ¢c9Å\u0006cP\n%\u0088]\u0007ÐP8_\u0001i÷";
      int var4 = "\u0017\u0000\u008d8\u0005\u0013(\tãÑ\u0003#\u001d¹\u000bOõ\u0002\u009a\u001a@\u0080\u0015³æÍ\u0005]È]×\"\nYô(Ï\u0019Ü«\u0087;0\rÈd1\u0003\u008aÈ\u0012Ài<W¥\u0013\b±3\u008eÅ£Ä\u0088ñ\r²/~jcå/eÎ\u0088£3\u008d\u0004\f\u0007j¥\u000b1¼\u007f\u0001U¯ÞÛx?´\u0005@Ôc¾(\u0005ñ_ô\u0014[\tª\u007fJ´éÈÊ\r¸\u0004¦\rAó\u0004Ð÷Ä\u0007\u0005@kc\u008b\u009c\u0006èÝ¢c9Å\u0006cP\n%\u0088]\u0007ÐP8_\u0001i÷"
         .length();
      char var1 = 4;
      int var8 = -1;
      // ROUTE-A: `b((String)null)` is an artifact - the hex colour is passed as a literal null, which the
      // callee rejects with a Kotlin non-null check. Removed rather than crashing. Colour init is UNRESTORED.

      label52:
      while (true) {
         byte var10000 = 41;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var37 = var10001.toCharArray();
               int var10004 = var37.length;
               int var6 = 0;
               byte var40 = var10000;
               var20 = var37;
               int var14 = var10004;
               byte var45;
               char[] var62;
               int var10006;
               if (var10004 <= 1) {
                  var62 = var37;
                  var45 = var10000;
                  var10006 = var6;
               } else {
                  var40 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var62 = var37;
                  var45 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var62[var10006] = (char)(var62[var10006] ^ var45 ^ switch (var6 % 7) {
                     case 0 -> 84;
                     case 1 -> 35;
                     case 2 -> 7;
                     case 3 -> 17;
                     case 4 -> 11;
                     case 5 -> 21;
                     default -> 124;
                  });
                  var6++;
                  if (var40 == 0) {
                     var10006 = var40;
                     var62 = var20;
                     var45 = var40;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var62 = var20;
                     var45 = var40;
                     var10006 = var6;
                  }
               }
            }

            String var42 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var42;
                  if ((var8 += var1) >= var4) {
                     b = var5;
                     c = new String[22];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
                        0, 0, 0, 0
                     );
                     lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
                        0, 0, 0, 0
                     );
                     Color var24 = Color.WHITE;
                     short var49 = -27283;
                     short var66 = 6288;
                     Intrinsics.checkNotNullExpressionValue(Color.WHITE, "WHITE");
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
                        var24
                     );
                     Color var25 = Color.LIGHT_GRAY;
                     var49 = -27268;
                     var66 = -16014;
                     Intrinsics.checkNotNullExpressionValue(Color.LIGHT_GRAY, "LIGHT_GRAY");
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
                        var25
                     );
                     Color var26 = Color.GRAY;
                     var49 = -27271;
                     var66 = -5184;
                     Intrinsics.checkNotNullExpressionValue(Color.GRAY, "GRAY");
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
                        var26
                     );
                     Color var27 = Color.DARK_GRAY;
                     var49 = -27276;
                     var66 = -4788;
                     Intrinsics.checkNotNullExpressionValue(Color.DARK_GRAY, "DARK_GRAY");
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
                        var27
                     );
                     Color var28 = Color.BLACK;
                     var49 = -27275;
                     var66 = -847;
                     Intrinsics.checkNotNullExpressionValue(Color.BLACK, "BLACK");
                     llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
                        var28
                     );
                     Color var29 = Color.RED;
                     var49 = -27269;
                     var66 = 32312;
                     Intrinsics.checkNotNullExpressionValue(Color.RED, "RED");
                     IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
                        var29
                     );
                     Color var30 = Color.PINK;
                     var49 = -27273;
                     var66 = 8542;
                     Intrinsics.checkNotNullExpressionValue(Color.PINK, "PINK");
                     IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
                        var30
                     );
                     Color var31 = Color.ORANGE;
                     var49 = -27285;
                     var66 = -1212;
                     Intrinsics.checkNotNullExpressionValue(Color.ORANGE, "ORANGE");
                     IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
                        var31
                     );
                     Color var32 = Color.YELLOW;
                     var49 = -27288;
                     var66 = -7395;
                     Intrinsics.checkNotNullExpressionValue(Color.YELLOW, "YELLOW");
                     IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
                        var32
                     );
                     Color var33 = Color.GREEN;
                     var49 = -27278;
                     var66 = -17752;
                     Intrinsics.checkNotNullExpressionValue(Color.GREEN, "GREEN");
                     llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
                        var33
                     );
                     Color var34 = Color.MAGENTA;
                     var49 = -27286;
                     var66 = -27816;
                     Intrinsics.checkNotNullExpressionValue(Color.MAGENTA, "MAGENTA");
                     IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
                        var34
                     );
                     Color var35 = Color.CYAN;
                     var49 = -27280;
                     var66 = 7418;
                     Intrinsics.checkNotNullExpressionValue(Color.CYAN, "CYAN");
                     lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
                        var35
                     );
                     Color var36 = Color.BLUE;
                     var49 = -27274;
                     var66 = 10599;
                     Intrinsics.checkNotNullExpressionValue(Color.BLUE, "BLUE");
                     llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
                        var36
                     );
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var42;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "Ë+áä\u0013\u0005\u0099ò<'\u001e";
                  var4 = "Ë+áä\u0013\u0005\u0099ò<'\u001e".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 108;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   public static void b(String[] var0) {
      lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = var0;
   }

   public static String[] v() {
      return lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -27271) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 57;
            case 1 -> 128;
            case 2 -> 172;
            case 3 -> 152;
            case 4 -> 68;
            case 5 -> 138;
            case 6 -> 113;
            case 7 -> 117;
            case 8 -> 67;
            case 9 -> 241;
            case 10 -> 216;
            case 11 -> 204;
            case 12 -> 137;
            case 13 -> 135;
            case 14 -> 173;
            case 15 -> 255;
            case 16 -> 240;
            case 17 -> 244;
            case 18 -> 30;
            case 19 -> 78;
            case 20 -> 34;
            case 21 -> 85;
            case 22 -> 160;
            case 23 -> 199;
            case 24 -> 60;
            case 25 -> 215;
            case 26 -> 49;
            case 27 -> 196;
            case 28 -> 32;
            case 29 -> 64;
            case 30 -> 243;
            case 31 -> 20;
            case 32 -> 157;
            case 33 -> 66;
            case 34 -> 31;
            case 35 -> 114;
            case 36 -> 10;
            case 37 -> 77;
            case 38 -> 239;
            case 39 -> 150;
            case 40 -> 140;
            case 41 -> 130;
            case 42 -> 59;
            case 43 -> 127;
            case 44 -> 186;
            case 45 -> 231;
            case 46 -> 53;
            case 47 -> 229;
            case 48 -> 62;
            case 49 -> 37;
            case 50 -> 250;
            case 51 -> 165;
            case 52 -> 141;
            case 53 -> 155;
            case 54 -> 15;
            case 55 -> 182;
            case 56 -> 7;
            case 57 -> 218;
            case 58 -> 29;
            case 59 -> 103;
            case 60 -> 107;
            case 61 -> 46;
            case 62 -> 111;
            case 63 -> 142;
            case 64 -> 171;
            case 65 -> 193;
            case 66 -> 13;
            case 67 -> 79;
            case 68 -> 154;
            case 69 -> 247;
            case 70 -> 22;
            case 71 -> 146;
            case 72 -> 2;
            case 73 -> 123;
            case 74 -> 74;
            case 75 -> 94;
            case 76 -> 206;
            case 77 -> 161;
            case 78 -> 26;
            case 79 -> 84;
            case 80 -> 168;
            case 81 -> 238;
            case 82 -> 234;
            case 83 -> 148;
            case 84 -> 164;
            case 85 -> 151;
            case 86 -> 3;
            case 87 -> 198;
            case 88 -> 16;
            case 89 -> 92;
            case 90 -> 187;
            case 91 -> 208;
            case 92 -> 188;
            case 93 -> 118;
            case 94 -> 44;
            case 95 -> 156;
            case 96 -> 203;
            case 97 -> 27;
            case 98 -> 43;
            case 99 -> 149;
            case 100 -> 220;
            case 101 -> 212;
            case 102 -> 183;
            case 103 -> 189;
            case 104 -> 21;
            case 105 -> 230;
            case 106 -> 147;
            case 107 -> 98;
            case 108 -> 249;
            case 109 -> 143;
            case 110 -> 54;
            case 111 -> 144;
            case 112 -> 145;
            case 113 -> 200;
            case 114 -> 19;
            case 115 -> 80;
            case 116 -> 76;
            case 117 -> 194;
            case 118 -> 102;
            case 119 -> 70;
            case 120 -> 132;
            case 121 -> 42;
            case 122 -> 254;
            case 123 -> 219;
            case 124 -> 23;
            case 125 -> 11;
            case 126 -> 87;
            case 127 -> 225;
            case 128 -> 110;
            case 129 -> 39;
            case 130 -> 40;
            case 131 -> 8;
            case 132 -> 41;
            case 133 -> 100;
            case 134 -> 197;
            case 135 -> 125;
            case 136 -> 223;
            case 137 -> 126;
            case 138 -> 201;
            case 139 -> 139;
            case 140 -> 227;
            case 141 -> 61;
            case 142 -> 72;
            case 143 -> 167;
            case 144 -> 45;
            case 145 -> 181;
            case 146 -> 14;
            case 147 -> 209;
            case 148 -> 96;
            case 149 -> 81;
            case 150 -> 246;
            case 151 -> 75;
            case 152 -> 207;
            case 153 -> 253;
            case 154 -> 4;
            case 155 -> 180;
            case 156 -> 89;
            case 157 -> 166;
            case 158 -> 248;
            case 159 -> 178;
            case 160 -> 221;
            case 161 -> 119;
            case 162 -> 210;
            case 163 -> 175;
            case 164 -> 108;
            case 165 -> 104;
            case 166 -> 205;
            case 167 -> 228;
            case 168 -> 213;
            case 169 -> 252;
            case 170 -> 48;
            case 171 -> 63;
            case 172 -> 245;
            case 173 -> 120;
            case 174 -> 0;
            case 175 -> 95;
            case 176 -> 122;
            case 177 -> 192;
            case 178 -> 162;
            case 179 -> 51;
            case 180 -> 237;
            case 181 -> 91;
            case 182 -> 242;
            case 183 -> 105;
            case 184 -> 12;
            case 185 -> 73;
            case 186 -> 134;
            case 187 -> 179;
            case 188 -> 71;
            case 189 -> 233;
            case 190 -> 56;
            case 191 -> 115;
            case 192 -> 153;
            case 193 -> 251;
            case 194 -> 176;
            case 195 -> 109;
            case 196 -> 174;
            case 197 -> 190;
            case 198 -> 9;
            case 199 -> 93;
            case 200 -> 35;
            case 201 -> 25;
            case 202 -> 17;
            case 203 -> 6;
            case 204 -> 159;
            case 205 -> 28;
            case 206 -> 18;
            case 207 -> 214;
            case 208 -> 1;
            case 209 -> 129;
            case 210 -> 106;
            case 211 -> 191;
            case 212 -> 116;
            case 213 -> 133;
            case 214 -> 82;
            case 215 -> 185;
            case 216 -> 170;
            case 217 -> 195;
            case 218 -> 224;
            case 219 -> 211;
            case 220 -> 131;
            case 221 -> 24;
            case 222 -> 121;
            case 223 -> 97;
            case 224 -> 47;
            case 225 -> 177;
            case 226 -> 58;
            case 227 -> 169;
            case 228 -> 222;
            case 229 -> 88;
            case 230 -> 38;
            case 231 -> 86;
            case 232 -> 33;
            case 233 -> 202;
            case 234 -> 112;
            case 235 -> 235;
            case 236 -> 163;
            case 237 -> 65;
            case 238 -> 124;
            case 239 -> 5;
            case 240 -> 90;
            case 241 -> 101;
            case 242 -> 36;
            case 243 -> 236;
            case 244 -> 50;
            case 245 -> 52;
            case 246 -> 55;
            case 247 -> 184;
            case 248 -> 83;
            case 249 -> 99;
            case 250 -> 232;
            case 251 -> 136;
            case 252 -> 217;
            case 253 -> 69;
            case 254 -> 158;
            default -> 226;
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private static String[] a;
      private static String[] b;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @JvmStatic
      @NotNull
      public final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll a(
         @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1,
         @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var2,
         float var3
      ) {
         short var10001 = -29703;
         short var10002 = 13346;
         Intrinsics.checkNotNullParameter(var1, "color1");
         var10001 = -29697;
         var10002 = -29048;
         Intrinsics.checkNotNullParameter(var2, "color2");
         int var4 = (int)(var1.a() + (var2.a() - var1.a()) * var3);
         int var5 = (int)(var1.b() + (var2.b() - var1.b()) * var3);
         int var6 = (int)(var1.c() + (var2.c() - var1.c()) * var3);
         int var7 = (int)(var1.d() + (var2.d() - var1.d()) * var3);
         return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var4, var5, var6, var7);
      }

      @JvmStatic
      @NotNull
      public final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll a(
         @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1,
         @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var2
      ) {
         short var10001 = -29703;
         short var10002 = 13346;
         Intrinsics.checkNotNullParameter(var1, "color1");
         var10001 = -29697;
         var10002 = -29048;
         Intrinsics.checkNotNullParameter(var2, "color2");
         return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
            (var1.a() + var2.a()) / 2, (var1.b() + var2.b()) / 2, (var1.c() + var2.c()) / 2, (var1.d() + var2.d()) / 2
         );
      }

      @JvmStatic
      @NotNull
      public final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll b(
         @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1,
         @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var2,
         float var3
      ) {
         short var10001 = -29708;
         short var10002 = 6919;
         Intrinsics.checkNotNullParameter(var1, "color1");
         llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.v();
         var10002 = -29707;
         short var10003 = 30080;
         Intrinsics.checkNotNullParameter(var2, "color2");
         float var5 = RangesKt.coerceIn(var3, 0.0F, 1.0F);

         try {
            llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var10000 = new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
               (int)(var1.a() * (1.0F - var5) + var2.a() * var5),
               (int)(var1.b() * (1.0F - var5) + var2.b() * var5),
               (int)(var1.c() * (1.0F - var5) + var2.c() * var5),
               (int)(var1.d() * (1.0F - var5) + var2.d() * var5)
            );
            if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
               llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.b(new String[1]);
            }

            return var10000;
         } catch (IllegalArgumentException var6) {
            throw (RuntimeException)a(var6);
         }
      }

      @JvmStatic
      @NotNull
      public final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll a(int var1) {
         return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var1, false);
      }

      @JvmStatic
      @NotNull
      public final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll b(int var1) {
         return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var1, true);
      }

      @JvmStatic
      @NotNull
      public final String a(int var1, int var2, int var3) {
         return "" + var1 + var2 + var3;
      }

      @JvmStatic
      public final int b(int var1, int var2, int var3) {
         return Integer.parseInt("" + var1 + var2 + var3);
      }

      @JvmStatic
      public final int c(int var1, int var2, int var3) {
         String var10000 = Integer.toString(var1, CharsKt.checkRadix(16));
         short var10002 = -29706;
         short var10003 = -30395;
         Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
         String var4 = StringsKt.padStart(var10000, 2, '0');
         var10000 = Integer.toString(var2, CharsKt.checkRadix(16));
         var10002 = -29705;
         var10003 = 3676;
         Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
         String var5 = StringsKt.padStart(var10000, 2, '0');
         var10000 = Integer.toString(var3, CharsKt.checkRadix(16));
         var10002 = -29705;
         var10003 = 3676;
         Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
         String var6 = StringsKt.padStart(var10000, 2, '0');
         String var7 = var4 + var5 + var6;
         return Integer.parseInt(var7, CharsKt.checkRadix(16));
      }

      @JvmStatic
      @NotNull
      public final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll a(@NotNull String param1) {
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.v();
      Intrinsics.checkNotNullParameter(param1, "hexColor");
      String var2 = param1.replace("#", "");
      switch (var2.length()) {
         case 6: {
            int var3 = Integer.parseInt(var2.substring(0, 2), CharsKt.checkRadix(16));
            int var4 = Integer.parseInt(var2.substring(2, 4), CharsKt.checkRadix(16));
            int var5 = Integer.parseInt(var2.substring(4, 6), CharsKt.checkRadix(16));
            return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var3, var4, var5);
         }
         case 8: {
            int var6 = Integer.parseInt(var2.substring(0, 2), CharsKt.checkRadix(16));
            int var7 = Integer.parseInt(var2.substring(2, 4), CharsKt.checkRadix(16));
            int var8 = Integer.parseInt(var2.substring(4, 6), CharsKt.checkRadix(16));
            int var9 = Integer.parseInt(var2.substring(6, 8), CharsKt.checkRadix(16));
            return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var7, var8, var9, var6);
         }
         default:
            throw new IllegalArgumentException("Invalid hex color format. Expected 6 or 8 characters.");
      }
         // $VF: Couldn't be decompiled
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         // java.lang.RuntimeException: parsing failure!
         //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
         //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
         //
         // Bytecode:
         // 000: invokestatic me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.v ()[Ljava/lang/String;
         // 003: aload 1
         // 004: sipush -29699
         // 007: sipush 25661
         // 00a: pop2
         // 00b: ldc "hexColor"
         // 00d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
         // 010: aload 1
         // 011: ldc "#"
         // 013: ldc ""
         // 015: bipush 0
         // 016: bipush 4
         // 017: aconst_null
         // 018: invokestatic kotlin/text/StringsKt.replace$default (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
         // 01b: astore 3
         // 01c: astore 2
         // 01d: aload 3
         // 01e: invokevirtual java/lang/String.length ()I
         // 021: aload 2
         // 022: ifnonnull 066
         // 025: tableswitch 279 6 8 31 279 142
         // 040: invokestatic me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
         // 043: athrow
         // 044: aload 3
         // 045: bipush 0
         // 046: bipush 2
         // 047: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
         // 04a: dup
         // 04b: sipush -29704
         // 04e: sipush 11685
         // 051: pop2
         // 052: ldc "substring(...)"
         // 054: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
         // 057: bipush 16
         // 059: invokestatic kotlin/text/CharsKt.checkRadix (I)I
         // 05c: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;I)I
         // 05f: goto 066
         // 062: invokestatic me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
         // 065: athrow
         // 066: istore 4
         // 068: aload 3
         // 069: bipush 2
         // 06a: bipush 4
         // 06b: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
         // 06e: dup
         // 06f: sipush -29698
         // 072: sipush -16058
         // 075: pop2
         // 076: ldc "substring(...)"
         // 078: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
         // 07b: bipush 16
         // 07d: invokestatic kotlin/text/CharsKt.checkRadix (I)I
         // 080: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;I)I
         // 083: istore 5
         // 085: aload 3
         // 086: bipush 4
         // 087: bipush 6
         // 089: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
         // 08c: dup
         // 08d: sipush -29698
         // 090: sipush -16058
         // 093: pop2
         // 094: ldc "substring(...)"
         // 096: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
         // 099: bipush 16
         // 09b: invokestatic kotlin/text/CharsKt.checkRadix (I)I
         // 09e: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;I)I
         // 0a1: istore 6
         // 0a3: new me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll
         // 0a6: dup
         // 0a7: iload 4
         // 0a9: iload 5
         // 0ab: iload 6
         // 0ad: invokespecial me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.<init> (III)V
         // 0b0: goto 14d
         // 0b3: aload 3
         // 0b4: bipush 0
         // 0b5: bipush 2
         // 0b6: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
         // 0b9: dup
         // 0ba: sipush -29698
         // 0bd: sipush -16058
         // 0c0: pop2
         // 0c1: ldc "substring(...)"
         // 0c3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
         // 0c6: bipush 16
         // 0c8: invokestatic kotlin/text/CharsKt.checkRadix (I)I
         // 0cb: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;I)I
         // 0ce: istore 4
         // 0d0: aload 3
         // 0d1: bipush 2
         // 0d2: bipush 4
         // 0d3: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
         // 0d6: dup
         // 0d7: sipush -29698
         // 0da: sipush -16058
         // 0dd: pop2
         // 0de: ldc "substring(...)"
         // 0e0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
         // 0e3: bipush 16
         // 0e5: invokestatic kotlin/text/CharsKt.checkRadix (I)I
         // 0e8: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;I)I
         // 0eb: istore 5
         // 0ed: aload 3
         // 0ee: bipush 4
         // 0ef: bipush 6
         // 0f1: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
         // 0f4: dup
         // 0f5: sipush -29698
         // 0f8: sipush -16058
         // 0fb: pop2
         // 0fc: ldc "substring(...)"
         // 0fe: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
         // 101: bipush 16
         // 103: invokestatic kotlin/text/CharsKt.checkRadix (I)I
         // 106: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;I)I
         // 109: istore 6
         // 10b: aload 3
         // 10c: bipush 6
         // 10e: bipush 8
         // 110: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
         // 113: dup
         // 114: sipush -29698
         // 117: sipush -16058
         // 11a: pop2
         // 11b: ldc "substring(...)"
         // 11d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
         // 120: bipush 16
         // 122: invokestatic kotlin/text/CharsKt.checkRadix (I)I
         // 125: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;I)I
         // 128: istore 7
         // 12a: new me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll
         // 12d: dup
         // 12e: iload 5
         // 130: iload 6
         // 132: iload 7
         // 134: iload 4
         // 136: invokespecial me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.<init> (IIII)V
         // 139: goto 14d
         // 13c: new java/lang/IllegalArgumentException
         // 13f: dup
         // 140: sipush -29701
         // 143: sipush 13518
         // 146: pop2
         // 147: ldc "Invalid hex color format. Expected 6 or 8 characters."
         // 149: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
         // 14c: athrow
         // 14d: areturn
      }

      @JvmStatic
      @Nullable
      public final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll a(float param1, float param2, float param3) {
      String[] var4 = v();
      float var5 = param1 / 60.0F;
      float var6 = param3 * param2;
      float var7 = var6 * (1.0F - Math.abs(var5 % 2.0F - 1.0F));
      org.joml.Vector3f var8;
      if (var5 >= 0.0F && var5 <= 1.0F) {
         var8 = new org.joml.Vector3f(var6, var7, 0.0F);
      } else if (var5 >= 1.0F && var5 <= 2.0F) {
         var8 = new org.joml.Vector3f(var7, var6, 0.0F);
      } else if (var5 >= 2.0F && var5 <= 3.0F) {
         var8 = new org.joml.Vector3f(0.0F, var6, var7);
      } else if (var5 >= 3.0F && var5 <= 4.0F) {
         var8 = new org.joml.Vector3f(0.0F, var7, var6);
      } else if (var5 >= 4.0F && var5 <= 5.0F) {
         var8 = new org.joml.Vector3f(var7, 0.0F, var6);
      } else if (var5 >= 5.0F && var5 <= 6.0F) {
         var8 = new org.joml.Vector3f(var6, 0.0F, var7);
      } else {
         var8 = null;
      }
      if (var8 == null) {
         return null;
      }
      boolean var10 = false;
      float var11 = param3 - var6;
      return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
         (int)(255.0F * (var8.x + var11)),
         (int)(255.0F * (var8.y + var11)),
         (int)(255.0F * (var8.z + var11))
      );
         // $VF: Couldn't be decompiled
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         // java.lang.RuntimeException: parsing failure!
         //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
         //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
         //
         // Bytecode:
         // 000: invokestatic me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.v ()[Ljava/lang/String;
         // 003: fload 1
         // 004: bipush 60
         // 006: i2f
         // 007: fdiv
         // 008: fstore 5
         // 00a: fload 3
         // 00b: fload 2
         // 00c: fmul
         // 00d: fstore 6
         // 00f: astore 4
         // 011: fload 6
         // 013: bipush 1
         // 014: i2f
         // 015: fload 5
         // 017: bipush 2
         // 018: i2f
         // 019: frem
         // 01a: bipush 1
         // 01b: i2f
         // 01c: fsub
         // 01d: invokestatic java/lang/Math.abs (F)F
         // 020: fsub
         // 021: fmul
         // 022: fstore 7
         // 024: nop
         // 025: fload 5
         // 027: fconst_0
         // 028: fcmpl
         // 029: aload 4
         // 02b: ifnonnull 069
         // 02e: iflt 065
         // 031: goto 038
         // 034: invokestatic me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
         // 037: athrow
         // 038: fload 5
         // 03a: fconst_1
         // 03b: fcmpg
         // 03c: aload 4
         // 03e: ifnonnull 069
         // 041: goto 048
         // 044: invokestatic me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
         // 047: athrow
         // 048: ifgt 065
         // 04b: goto 052
         // 04e: invokestatic me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
         // 051: athrow
         // 052: new org/joml/Vector3f
         // 055: dup
         // 056: fload 6
         // 058: fload 7
         // 05a: fconst_0
         // 05b: invokespecial org/joml/Vector3f.<init> (FFF)V
         // 05e: goto 1a1
         // 061: invokestatic me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
         // 064: athrow
         // 065: fload 5
         // 067: fconst_1
         // 068: fcmpl
         // 069: aload 4
         // 06b: ifnonnull 0a9
         // 06e: iflt 0a5
         // 071: goto 078
         // 074: invokestatic me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
         // 077: athrow
         // 078: fload 5
         // 07a: fconst_2
         // 07b: fcmpg
         // 07c: aload 4
         // 07e: ifnonnull 0a9
         // 081: goto 088
         // 084: invokestatic me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
         // 087: athrow
         // 088: ifgt 0a5
         // 08b: goto 092
         // 08e: invokestatic me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
         // 091: athrow
         // 092: new org/joml/Vector3f
         // 095: dup
         // 096: fload 7
         // 098: fload 6
         // 09a: fconst_0
         // 09b: invokespecial org/joml/Vector3f.<init> (FFF)V
         // 09e: goto 1a1
         // 0a1: invokestatic me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
         // 0a4: athrow
         // 0a5: fload 5
         // 0a7: fconst_2
         // 0a8: fcmpl
         // 0a9: aload 4
         // 0ab: ifnonnull 0eb
         // 0ae: iflt 0e6
         // 0b1: goto 0b8
         // 0b4: invokestatic me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
         // 0b7: athrow
         // 0b8: fload 5
         // 0ba: ldc 3.0
         // 0bc: fcmpg
         // 0bd: aload 4
         // 0bf: ifnonnull 0eb
         // 0c2: goto 0c9
         // 0c5: invokestatic me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
         // 0c8: athrow
         // 0c9: ifgt 0e6
         // 0cc: goto 0d3
         // 0cf: invokestatic me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
         // 0d2: athrow
         // 0d3: new org/joml/Vector3f
         // 0d6: dup
         // 0d7: fconst_0
         // 0d8: fload 6
         // 0da: fload 7
         // 0dc: invokespecial org/joml/Vector3f.<init> (FFF)V
         // 0df: goto 1a1
         // 0e2: invokestatic me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
         // 0e5: athrow
         // 0e6: fload 5
         // 0e8: ldc 3.0
         // 0ea: fcmpl
         // 0eb: aload 4
         // 0ed: ifnonnull 12d
         // 0f0: iflt 128
         // 0f3: goto 0fa
         // 0f6: invokestatic me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
         // 0f9: athrow
         // 0fa: fload 5
         // 0fc: ldc 4.0
         // 0fe: fcmpg
         // 0ff: aload 4
         // 101: ifnonnull 12d
         // 104: goto 10b
         // 107: invokestatic me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
         // 10a: athrow
         // 10b: ifgt 128
         // 10e: goto 115
         // 111: invokestatic me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
         // 114: athrow
         // 115: new org/joml/Vector3f
         // 118: dup
         // 119: fconst_0
         // 11a: fload 7
         // 11c: fload 6
         // 11e: invokespecial org/joml/Vector3f.<init> (FFF)V
         // 121: goto 1a1
         // 124: invokestatic me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
         // 127: athrow
         // 128: fload 5
         // 12a: ldc 4.0
         // 12c: fcmpl
         // 12d: aload 4
         // 12f: ifnonnull 16f
         // 132: iflt 16a
         // 135: goto 13c
         // 138: invokestatic me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
         // 13b: athrow
         // 13c: fload 5
         // 13e: ldc 5.0
         // 140: fcmpg
         // 141: aload 4
         // 143: ifnonnull 16f
         // 146: goto 14d
         // 149: invokestatic me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
         // 14c: athrow
         // 14d: ifgt 16a
         // 150: goto 157
         // 153: invokestatic me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
         // 156: athrow
         // 157: new org/joml/Vector3f
         // 15a: dup
         // 15b: fload 7
         // 15d: fconst_0
         // 15e: fload 6
         // 160: invokespecial org/joml/Vector3f.<init> (FFF)V
         // 163: goto 1a1
         // 166: invokestatic me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
         // 169: athrow
         // 16a: fload 5
         // 16c: ldc 5.0
         // 16e: fcmpl
         // 16f: aload 4
         // 171: ifnonnull 18a
         // 174: iflt 1a0
         // 177: goto 17e
         // 17a: invokestatic me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
         // 17d: athrow
         // 17e: fload 5
         // 180: ldc 6.0
         // 182: fcmpg
         // 183: goto 18a
         // 186: invokestatic me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
         // 189: athrow
         // 18a: ifgt 1a0
         // 18d: new org/joml/Vector3f
         // 190: dup
         // 191: fload 6
         // 193: fconst_0
         // 194: fload 7
         // 196: invokespecial org/joml/Vector3f.<init> (FFF)V
         // 199: goto 1a1
         // 19c: invokestatic me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
         // 19f: athrow
         // 1a0: aconst_null
         // 1a1: astore 8
         // 1a3: aload 4
         // 1a5: ifnonnull 1f0
         // 1a8: aload 8
         // 1aa: dup
         // 1ab: ifnull 1ef
         // 1ae: goto 1b5
         // 1b1: invokestatic me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
         // 1b4: athrow
         // 1b5: astore 9
         // 1b7: bipush 0
         // 1b8: istore 10
         // 1ba: fload 3
         // 1bb: fload 6
         // 1bd: fsub
         // 1be: fstore 11
         // 1c0: new me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll
         // 1c3: dup
         // 1c4: ldc 255.0
         // 1c6: aload 9
         // 1c8: getfield org/joml/Vector3f.x F
         // 1cb: fload 11
         // 1cd: fadd
         // 1ce: fmul
         // 1cf: f2i
         // 1d0: ldc 255.0
         // 1d2: aload 9
         // 1d4: getfield org/joml/Vector3f.y F
         // 1d7: fload 11
         // 1d9: fadd
         // 1da: fmul
         // 1db: f2i
         // 1dc: ldc 255.0
         // 1de: aload 9
         // 1e0: getfield org/joml/Vector3f.z F
         // 1e3: fload 11
         // 1e5: fadd
         // 1e6: fmul
         // 1e7: f2i
         // 1e8: invokespecial me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.<init> (III)V
         // 1eb: nop
         // 1ec: goto 1f1
         // 1ef: pop
         // 1f0: aconst_null
         // 1f1: areturn
      }

      @JvmStatic
      @NotNull
      public final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll b(float var1, float var2, float var3) {
         Color var4 = Color.getHSBColor(var1, var2, var3);
         Intrinsics.checkNotNull(var4);
         return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var4).a(255);
      }

      @JvmStatic
      @NotNull
      public final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll b(@NotNull String var1) {
         short var10001 = -29702;
         short var10002 = 29789;
         Intrinsics.checkNotNullParameter(var1, "hex");
         String var2 = StringsKt.replace(var1, "#", "", false);
         String var10000 = var2.substring(0, 2);
         var10002 = -29698;
         short var10003 = -16058;
         Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
         int var3 = Integer.parseInt(var10000, CharsKt.checkRadix(16));
         var10000 = var2.substring(2, 4);
         var10002 = -29698;
         var10003 = -16058;
         Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
         int var4 = Integer.parseInt(var10000, CharsKt.checkRadix(16));
         var10000 = var2.substring(4, 6);
         var10002 = -29698;
         var10003 = -16058;
         Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
         int var5 = Integer.parseInt(var10000, CharsKt.checkRadix(16));
         return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var3, var4, var5, 255);
      }

      @JvmStatic
      @NotNull
      public final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll a(@NotNull LivingEntity var1) {
         short var10001 = -29700;
         short var10002 = 28298;
         Intrinsics.checkNotNullParameter(var1, "entity");
         float var2 = this.b(var1);
         int var3 = Color.HSBtoRGB(var2 / 3.0F, 1.0F, 1.0F) | 0xFF000000;
         return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var3);
      }

      private final float b(LivingEntity param1) {
         float var3 = param1.getHealth();
         float var4 = param1.getMaxHealth();
         if (!(var4 > 0.0F)) {
            return 0.0F;
         }
         return kotlin.ranges.RangesKt.coerceIn(var3 / var4, 0.0F, 1.0F);
      }

      private static IllegalArgumentException a(IllegalArgumentException var0) {
         return var0;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[12];
         int var3 = 0;
         String var2 = "©JÞü¾×°B\u0006o]¦^'ù\u0006\u009f¬fG\"W\u000eÀX\u0091\u009c\u0015ó»\u0007Û\u009dáÍöñ\u0006\u008c\u0097\u0004 n¸\u000e4¿\u000f`ÆlÁô\u0094ã\b\u0002Ë\b5d<lz$d\u008bÃ~Ïím¦l\u009cïö`ùHmÍ\u007fû³Ø×ÍL$b\u0006[Q\bß\u008a\u00928\u008d\f?ö$F¬\u0099Å\u0080ù\u0017sÏ\u0003ßà\u0010\u0006< \u0012Ö¬e\u0006y\u001cºQ¹\u0096";
         int var4 = "©JÞü¾×°B\u0006o]¦^'ù\u0006\u009f¬fG\"W\u000eÀX\u0091\u009c\u0015ó»\u0007Û\u009dáÍöñ\u0006\u008c\u0097\u0004 n¸\u000e4¿\u000f`ÆlÁô\u0094ã\b\u0002Ë\b5d<lz$d\u008bÃ~Ïím¦l\u009cïö`ùHmÍ\u007fû³Ø×ÍL$b\u0006[Q\bß\u008a\u00928\u008d\f?ö$F¬\u0099Å\u0080ù\u0017sÏ\u0003ßà\u0010\u0006< \u0012Ö¬e\u0006y\u001cºQ¹\u0096"
            .length();
         char var1 = '\b';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 116;
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
                        case 1 -> 86;
                        case 2 -> 102;
                        case 3 -> 15;
                        case 4 -> 75;
                        case 5 -> 20;
                        default -> 25;
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

                     var2 = "±Y\t\u0082w¬Vý®\u008c\u0089I\u009c\r\u007f\u00adÐ\u001cL\u007f1\u0087BÃ\u0014 /";
                     var4 = "±Y\t\u0082w¬Vý®\u008c\u0089I\u009c\r\u007f\u00adÐ\u001cL\u007f1\u0087BÃ\u0014 /".length();
                     var1 = '\r';
                     var8 = -1;
               }

               var10000 = 61;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -29699) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 172;
               case 1 -> 253;
               case 2 -> 104;
               case 3 -> 18;
               case 4 -> 162;
               case 5 -> 174;
               case 6 -> 16;
               case 7 -> 77;
               case 8 -> 225;
               case 9 -> 229;
               case 10 -> 155;
               case 11 -> 109;
               case 12 -> 100;
               case 13 -> 40;
               case 14 -> 134;
               case 15 -> 218;
               case 16 -> 14;
               case 17 -> 224;
               case 18 -> 125;
               case 19 -> 69;
               case 20 -> 110;
               case 21 -> 216;
               case 22 -> 114;
               case 23 -> 180;
               case 24 -> 243;
               case 25 -> 91;
               case 26 -> 215;
               case 27 -> 8;
               case 28 -> 231;
               case 29 -> 105;
               case 30 -> 11;
               case 31 -> 226;
               case 32 -> 199;
               case 33 -> 102;
               case 34 -> 133;
               case 35 -> 247;
               case 36 -> 19;
               case 37 -> 23;
               case 38 -> 198;
               case 39 -> 95;
               case 40 -> 208;
               case 41 -> 139;
               case 42 -> 47;
               case 43 -> 62;
               case 44 -> 64;
               case 45 -> 33;
               case 46 -> 241;
               case 47 -> 212;
               case 48 -> 42;
               case 49 -> 235;
               case 50 -> 35;
               case 51 -> 34;
               case 52 -> 166;
               case 53 -> 230;
               case 54 -> 51;
               case 55 -> 160;
               case 56 -> 4;
               case 57 -> 222;
               case 58 -> 54;
               case 59 -> 119;
               case 60 -> 116;
               case 61 -> 96;
               case 62 -> 15;
               case 63 -> 135;
               case 64 -> 171;
               case 65 -> 194;
               case 66 -> 75;
               case 67 -> 196;
               case 68 -> 85;
               case 69 -> 145;
               case 70 -> 187;
               case 71 -> 193;
               case 72 -> 93;
               case 73 -> 81;
               case 74 -> 191;
               case 75 -> 78;
               case 76 -> 55;
               case 77 -> 97;
               case 78 -> 190;
               case 79 -> 98;
               case 80 -> 237;
               case 81 -> 148;
               case 82 -> 121;
               case 83 -> 163;
               case 84 -> 249;
               case 85 -> 127;
               case 86 -> 66;
               case 87 -> 244;
               case 88 -> 71;
               case 89 -> 36;
               case 90 -> 26;
               case 91 -> 156;
               case 92 -> 67;
               case 93 -> 157;
               case 94 -> 202;
               case 95 -> 207;
               case 96 -> 152;
               case 97 -> 83;
               case 98 -> 228;
               case 99 -> 255;
               case 100 -> 49;
               case 101 -> 9;
               case 102 -> 151;
               case 103 -> 59;
               case 104 -> 239;
               case 105 -> 82;
               case 106 -> 38;
               case 107 -> 31;
               case 108 -> 130;
               case 109 -> 89;
               case 110 -> 214;
               case 111 -> 236;
               case 112 -> 115;
               case 113 -> 94;
               case 114 -> 140;
               case 115 -> 167;
               case 116 -> 70;
               case 117 -> 203;
               case 118 -> 128;
               case 119 -> 32;
               case 120 -> 7;
               case 121 -> 234;
               case 122 -> 211;
               case 123 -> 210;
               case 124 -> 2;
               case 125 -> 179;
               case 126 -> 28;
               case 127 -> 123;
               case 128 -> 106;
               case 129 -> 240;
               case 130 -> 44;
               case 131 -> 72;
               case 132 -> 76;
               case 133 -> 251;
               case 134 -> 29;
               case 135 -> 149;
               case 136 -> 227;
               case 137 -> 52;
               case 138 -> 232;
               case 139 -> 170;
               case 140 -> 132;
               case 141 -> 245;
               case 142 -> 87;
               case 143 -> 197;
               case 144 -> 6;
               case 145 -> 111;
               case 146 -> 84;
               case 147 -> 186;
               case 148 -> 124;
               case 149 -> 252;
               case 150 -> 183;
               case 151 -> 219;
               case 152 -> 22;
               case 153 -> 41;
               case 154 -> 169;
               case 155 -> 213;
               case 156 -> 209;
               case 157 -> 165;
               case 158 -> 118;
               case 159 -> 129;
               case 160 -> 12;
               case 161 -> 223;
               case 162 -> 99;
               case 163 -> 204;
               case 164 -> 200;
               case 165 -> 143;
               case 166 -> 53;
               case 167 -> 86;
               case 168 -> 65;
               case 169 -> 107;
               case 170 -> 250;
               case 171 -> 90;
               case 172 -> 154;
               case 173 -> 175;
               case 174 -> 58;
               case 175 -> 103;
               case 176 -> 101;
               case 177 -> 184;
               case 178 -> 10;
               case 179 -> 120;
               case 180 -> 248;
               case 181 -> 112;
               case 182 -> 48;
               case 183 -> 73;
               case 184 -> 173;
               case 185 -> 153;
               case 186 -> 13;
               case 187 -> 108;
               case 188 -> 20;
               case 189 -> 146;
               case 190 -> 60;
               case 191 -> 201;
               case 192 -> 5;
               case 193 -> 46;
               case 194 -> 144;
               case 195 -> 39;
               case 196 -> 57;
               case 197 -> 131;
               case 198 -> 188;
               case 199 -> 45;
               case 200 -> 30;
               case 201 -> 0;
               case 202 -> 88;
               case 203 -> 161;
               case 204 -> 74;
               case 205 -> 122;
               case 206 -> 80;
               case 207 -> 195;
               case 208 -> 21;
               case 209 -> 233;
               case 210 -> 150;
               case 211 -> 61;
               case 212 -> 206;
               case 213 -> 17;
               case 214 -> 37;
               case 215 -> 1;
               case 216 -> 221;
               case 217 -> 79;
               case 218 -> 182;
               case 219 -> 142;
               case 220 -> 27;
               case 221 -> 141;
               case 222 -> 117;
               case 223 -> 177;
               case 224 -> 159;
               case 225 -> 63;
               case 226 -> 158;
               case 227 -> 50;
               case 228 -> 24;
               case 229 -> 164;
               case 230 -> 217;
               case 231 -> 178;
               case 232 -> 238;
               case 233 -> 43;
               case 234 -> 189;
               case 235 -> 113;
               case 236 -> 185;
               case 237 -> 92;
               case 238 -> 137;
               case 239 -> 25;
               case 240 -> 176;
               case 241 -> 254;
               case 242 -> 181;
               case 243 -> 168;
               case 244 -> 147;
               case 245 -> 3;
               case 246 -> 136;
               case 247 -> 192;
               case 248 -> 205;
               case 249 -> 56;
               case 250 -> 68;
               case 251 -> 126;
               case 252 -> 220;
               case 253 -> 242;
               case 254 -> 138;
               default -> 246;
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
}
