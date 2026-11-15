package me.octo.client;

import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.Camera;
import net.minecraft.core.Position;
import net.minecraft.core.Vec3i;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3fc;

public record lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII(float i, float j, float k) {
   @NotNull
   public static lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @JvmField
   @NotNull
   public static lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @JvmField
   @NotNull
   public static lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @JvmField
   @NotNull
   public static lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @JvmField
   @NotNull
   public static lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static String[] a;
   private static String[] b;

   public lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII(double var1, double var3, double var5) {
      this((float)var1, (float)var3, (float)var5);
   }

   public lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII(@NotNull Position var1) {
      short var10001 = 10188;
      short var10002 = 30856;
      Intrinsics.checkNotNullParameter(var1, "vec");
      this(var1.x(), var1.y(), var1.z());
   }

   public lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII(@NotNull Vector3fc var1) {
      short var10001 = 10187;
      short var10002 = -14848;
      Intrinsics.checkNotNullParameter(var1, "vec");
      this(var1.x(), var1.y(), var1.z());
   }

   public lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII(@NotNull Vec3i var1) {
      short var10001 = 10188;
      short var10002 = 30856;
      Intrinsics.checkNotNullParameter(var1, "vec");
      this((float)var1.getX(), (float)var1.getY(), (float)var1.getZ());
   }

   @NotNull
   public final lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII a(float var1, float var2, float var3) {
      return new lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII(this.i + var1, this.j + var2, this.k + var3);
   }

   @NotNull
   public final lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII a(
      @NotNull lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII var1
   ) {
      short var10001 = 10184;
      short var10002 = 25435;
      Intrinsics.checkNotNullParameter(var1, "other");
      return this.a(var1.i, var1.j, var1.k);
   }

   private final lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII b(
      lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII var1
   ) {
      return new lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII(this.i - var1.i, this.j - var1.j, this.k - var1.k);
   }

   @NotNull
   public final lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII c(
      @NotNull lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII var1
   ) {
      short var10001 = 10184;
      short var10002 = 25435;
      Intrinsics.checkNotNullParameter(var1, "other");
      return this.a(var1);
   }

   @NotNull
   public final lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII d(
      @NotNull lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII var1
   ) {
      short var10001 = 10185;
      short var10002 = 19474;
      Intrinsics.checkNotNullParameter(var1, "other");
      return this.b(var1);
   }

   @NotNull
   public final lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII a(float var1) {
      return new lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII(this.i * var1, this.j * var1, this.k * var1);
   }

   @NotNull
   public final lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII b(float var1) {
      float var2 = (float)Math.cos(var1);
      float var3 = (float)Math.sin(var1);
      return new lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII(
         this.i, this.j * var2 + this.k * var3, this.k * var2 - this.j * var3
      );
   }

   @NotNull
   public final lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII c(float var1) {
      float var2 = (float)Math.cos(var1);
      float var3 = (float)Math.sin(var1);
      return new lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII(
         this.i * var2 + this.k * var3, this.j, this.k * var2 - this.i * var3
      );
   }

   public final float l() {
      return this.i * this.i + this.j * this.j + this.k * this.k;
   }

   public final float m() {
      return (float)Math.sqrt(this.l());
   }

   @NotNull
   public final lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII n() {
      return this.a(1.0F / this.m());
   }

   @NotNull
   public final lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII o() {
      return new lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII(-this.i, -this.j, -this.k);
   }

   @NotNull
   public final lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII a(
      float var1, @NotNull lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII var2
   ) {
      short var10001 = 10184;
      short var10002 = 25435;
      Intrinsics.checkNotNullParameter(var2, "other");
      return new lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII(
         Math.fma(var1, var2.i, this.i), Math.fma(var1, var2.j, this.j), Math.fma(var1, var2.k, this.k)
      );
   }

   @NotNull
   public final Vec3 p() {
      return new Vec3(this.i, this.j, this.k);
   }

   public final float q() {
      return this.i;
   }

   public final float r() {
      return this.j;
   }

   public final float s() {
      return this.k;
   }

   @NotNull
   public final lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII b(float var1, float var2, float var3) {
      return new lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII(var1, var2, var3);
   }

   @NotNull
   @Override
   public String toString() {
      short var10000 = 10186;
      float var1 = this.k;
      float var2 = this.j;
      float var3 = this.i;
      short var10001 = -22737;
      short var10002 = 10189;
      short var10003 = 25267;
      short var10004 = 10190;
      short var10005 = -21223;
      return "Vec3f(x=" + var3 + ", y=" + var2 + ", z=" + var1 + ")";
   }

   @Override
   public int hashCode() {
      int var1 = Float.hashCode(this.i);
      var1 = var1 * 31 + Float.hashCode(this.j);
      return var1 * 31 + Float.hashCode(this.k);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      String var2 = llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.s();
      Object var10000 = this;
      if (var2 == null) {
         if (this == var1) {
            return true;
         }

         var10000 = var1;
      }

      if (var2 == null) {
         if (!(var10000 instanceof lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII)) {
            return false;
         }

         var10000 = var1;
      }

      lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII var3 = (lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII)var10000;
      int var4 = Float.compare(this.i, var3.i);
      if (var2 == null) {
         if (var4 != 0) {
            return false;
         }

         var4 = Float.compare(this.j, var3.j);
      }

      if (var2 == null) {
         if (var4 != 0) {
            return false;
         }

         var4 = Float.compare(this.k, var3.k);
      }

      if (var2 == null) {
         if (var4 != 0) {
            return false;
         }

         var4 = 1;
      }

      return (var4 != 0);
   }

   @JvmStatic
   @NotNull
   public static final lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII a(@NotNull Camera var0) {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[7];
      int var3 = 0;
      String var2 = "u W/å\u0005ÜËbRC\b{\u0096\u0083\u009c\u0001\b1ª\u0003ÎQ\u0011\u0003èMÕ";
      int var4 = "u W/å\u0005ÜËbRC\b{\u0096\u0083\u009c\u0001\b1ª\u0003ÎQ\u0011\u0003èMÕ".length();
      char var1 = 5;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 39;
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
                     case 0 -> 60;
                     case 1 -> 122;
                     case 2 -> 87;
                     case 3 -> 56;
                     case 4 -> 49;
                     case 5 -> 34;
                     default -> 38;
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
                     b = new String[7];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (Object) null
                     );
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII(
                        0.0F, 0.0F, 0.0F
                     );
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII(
                        1.0F, 0.0F, 0.0F
                     );
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII(
                        0.0F, 1.0F, 0.0F
                     );
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII(
                        0.0F, 0.0F, 1.0F
                     );
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

                  var2 = "\u001aá§¶\u0004\u0006ø'\u0095";
                  var4 = "\u001aá§¶\u0004\u0006ø'\u0095".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 77;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 10184) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 122;
            case 1 -> 246;
            case 2 -> 186;
            case 3 -> 44;
            case 4 -> 37;
            case 5 -> 209;
            case 6 -> 131;
            case 7 -> 104;
            case 8 -> 118;
            case 9 -> 136;
            case 10 -> 218;
            case 11 -> 248;
            case 12 -> 149;
            case 13 -> 228;
            case 14 -> 34;
            case 15 -> 197;
            case 16 -> 58;
            case 17 -> 79;
            case 18 -> 10;
            case 19 -> 109;
            case 20 -> 45;
            case 21 -> 164;
            case 22 -> 196;
            case 23 -> 62;
            case 24 -> 13;
            case 25 -> 18;
            case 26 -> 14;
            case 27 -> 232;
            case 28 -> 178;
            case 29 -> 229;
            case 30 -> 29;
            case 31 -> 85;
            case 32 -> 38;
            case 33 -> 198;
            case 34 -> 82;
            case 35 -> 144;
            case 36 -> 56;
            case 37 -> 1;
            case 38 -> 187;
            case 39 -> 133;
            case 40 -> 86;
            case 41 -> 174;
            case 42 -> 69;
            case 43 -> 66;
            case 44 -> 19;
            case 45 -> 238;
            case 46 -> 84;
            case 47 -> 171;
            case 48 -> 219;
            case 49 -> 99;
            case 50 -> 105;
            case 51 -> 224;
            case 52 -> 226;
            case 53 -> 97;
            case 54 -> 225;
            case 55 -> 71;
            case 56 -> 35;
            case 57 -> 231;
            case 58 -> 50;
            case 59 -> 36;
            case 60 -> 189;
            case 61 -> 179;
            case 62 -> 96;
            case 63 -> 27;
            case 64 -> 202;
            case 65 -> 150;
            case 66 -> 251;
            case 67 -> 236;
            case 68 -> 180;
            case 69 -> 72;
            case 70 -> 78;
            case 71 -> 167;
            case 72 -> 181;
            case 73 -> 162;
            case 74 -> 237;
            case 75 -> 156;
            case 76 -> 185;
            case 77 -> 250;
            case 78 -> 42;
            case 79 -> 215;
            case 80 -> 165;
            case 81 -> 168;
            case 82 -> 73;
            case 83 -> 184;
            case 84 -> 103;
            case 85 -> 5;
            case 86 -> 154;
            case 87 -> 16;
            case 88 -> 113;
            case 89 -> 31;
            case 90 -> 41;
            case 91 -> 91;
            case 92 -> 129;
            case 93 -> 206;
            case 94 -> 235;
            case 95 -> 49;
            case 96 -> 249;
            case 97 -> 252;
            case 98 -> 195;
            case 99 -> 114;
            case 100 -> 227;
            case 101 -> 76;
            case 102 -> 88;
            case 103 -> 254;
            case 104 -> 142;
            case 105 -> 145;
            case 106 -> 80;
            case 107 -> 108;
            case 108 -> 83;
            case 109 -> 11;
            case 110 -> 90;
            case 111 -> 128;
            case 112 -> 163;
            case 113 -> 81;
            case 114 -> 151;
            case 115 -> 199;
            case 116 -> 123;
            case 117 -> 176;
            case 118 -> 67;
            case 119 -> 190;
            case 120 -> 188;
            case 121 -> 107;
            case 122 -> 155;
            case 123 -> 207;
            case 124 -> 175;
            case 125 -> 115;
            case 126 -> 61;
            case 127 -> 183;
            case 128 -> 74;
            case 129 -> 143;
            case 130 -> 194;
            case 131 -> 245;
            case 132 -> 116;
            case 133 -> 140;
            case 134 -> 148;
            case 135 -> 12;
            case 136 -> 200;
            case 137 -> 239;
            case 138 -> 4;
            case 139 -> 117;
            case 140 -> 51;
            case 141 -> 212;
            case 142 -> 158;
            case 143 -> 87;
            case 144 -> 95;
            case 145 -> 173;
            case 146 -> 160;
            case 147 -> 28;
            case 148 -> 191;
            case 149 -> 110;
            case 150 -> 216;
            case 151 -> 54;
            case 152 -> 233;
            case 153 -> 26;
            case 154 -> 102;
            case 155 -> 101;
            case 156 -> 98;
            case 157 -> 8;
            case 158 -> 92;
            case 159 -> 89;
            case 160 -> 134;
            case 161 -> 222;
            case 162 -> 203;
            case 163 -> 208;
            case 164 -> 170;
            case 165 -> 157;
            case 166 -> 9;
            case 167 -> 223;
            case 168 -> 55;
            case 169 -> 94;
            case 170 -> 100;
            case 171 -> 2;
            case 172 -> 193;
            case 173 -> 139;
            case 174 -> 153;
            case 175 -> 43;
            case 176 -> 24;
            case 177 -> 146;
            case 178 -> 40;
            case 179 -> 230;
            case 180 -> 247;
            case 181 -> 201;
            case 182 -> 169;
            case 183 -> 214;
            case 184 -> 220;
            case 185 -> 53;
            case 186 -> 177;
            case 187 -> 70;
            case 188 -> 241;
            case 189 -> 213;
            case 190 -> 211;
            case 191 -> 217;
            case 192 -> 20;
            case 193 -> 130;
            case 194 -> 210;
            case 195 -> 141;
            case 196 -> 147;
            case 197 -> 242;
            case 198 -> 63;
            case 199 -> 106;
            case 200 -> 124;
            case 201 -> 46;
            case 202 -> 159;
            case 203 -> 132;
            case 204 -> 48;
            case 205 -> 243;
            case 206 -> 253;
            case 207 -> 75;
            case 208 -> 47;
            case 209 -> 234;
            case 210 -> 111;
            case 211 -> 57;
            case 212 -> 221;
            case 213 -> 93;
            case 214 -> 126;
            case 215 -> 33;
            case 216 -> 25;
            case 217 -> 22;
            case 218 -> 119;
            case 219 -> 52;
            case 220 -> 60;
            case 221 -> 17;
            case 222 -> 192;
            case 223 -> 77;
            case 224 -> 7;
            case 225 -> 121;
            case 226 -> 21;
            case 227 -> 32;
            case 228 -> 244;
            case 229 -> 255;
            case 230 -> 240;
            case 231 -> 152;
            case 232 -> 182;
            case 233 -> 59;
            case 234 -> 137;
            case 235 -> 127;
            case 236 -> 68;
            case 237 -> 64;
            case 238 -> 161;
            case 239 -> 0;
            case 240 -> 23;
            case 241 -> 172;
            case 242 -> 135;
            case 243 -> 3;
            case 244 -> 138;
            case 245 -> 6;
            case 246 -> 205;
            case 247 -> 166;
            case 248 -> 39;
            case 249 -> 112;
            case 250 -> 120;
            case 251 -> 204;
            case 252 -> 65;
            case 253 -> 15;
            case 254 -> 125;
            default -> 30;
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }
        // PX-FIX DCM: kotlin-synthesized <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
           this();
        }


      private static String a;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @JvmStatic
      @NotNull
      public final lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII a(@NotNull Camera var1) {
         Intrinsics.checkNotNullParameter(var1, a);
         return lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            .b(-((float)Math.toRadians(var1.xRot())))
            .c(-((float)Math.toRadians(var1.yRot())));
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
         pxClinit: {
         char[] var10003 = "1h\u001bio\f".toCharArray();
         int var10004 = var10003.length;
         int var0 = 0;
         byte var6 = 121;
         char[] var10002 = var10003;
         int var1 = var10004;
         byte var10;
         char[] var10005;
         int var10006;
         if (var10004 <= 1) {
            var10005 = var10003;
            var10 = 121;
            var10006 = var0;
         } else {
            var6 = 121;
            var1 = var10004;
            if (var10004 <= var0) {
               String var9 = new String(var10003).intern();
               byte var4 = -1;
               a = var9;
               break pxClinit;
            }

            var10005 = var10003;
            var10 = 121;
            var10006 = var0;
         }

         while (true) {
            var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
               case 0 -> 43;
               case 1 -> 112;
               case 2 -> 15;
               case 3 -> 117;
               case 4 -> 100;
               case 5 -> 20;
               default -> 5;
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
                  a = var8;
                  break pxClinit;
               }

               var10005 = var10002;
               var10 = var6;
               var10006 = var0;
            }
         }
         }
      }
   }
      public static me.octo.client.lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII a(me.octo.client.lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII p0, float p1, float p2, float p3, int mask, java.lang.Object marker) {
         if ((mask & 1) != 0) { p1 = p0.i; }
         if ((mask & 2) != 0) { p2 = p0.j; }
         if ((mask & 4) != 0) { p3 = p0.k; }
         return p0.b(p1, p2, p3);
      }
}
