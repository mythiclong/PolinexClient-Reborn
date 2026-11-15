package me.octo.client;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.GpuBuffer.MappedView;
import com.mojang.blaze3d.systems.RenderPass;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

public final class IIllIllIllIlIIlIIIIlllIIIlIIIIIlllIIIllIlIIIllllIIIllllIIlIlIlIIlIIIllIIllIIllIIIIIIl {
   @NotNull
   public static IIllIllIllIlIIlIIIIlllIIIlIIIIIlllIIIllIlIIIllllIIIllllIIlIlIlIIlIIIllIIllIIllIIIIIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static float lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static float IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static float lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static float IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static boolean IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static Lazy IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static String[] a;
   private static String[] b;

   private IIllIllIllIlIIlIIIIlllIIIlIIIIIlllIIIllIlIIIllllIIIllllIIlIlIlIIlIIIllIIllIIllIIIIIIl() {
   }

   private final GpuBufferSlice a() {
      Lazy var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      return (GpuBufferSlice)var1.getValue();
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(float var0, float var1, float var2, float var3) {
      int var10000 = ((IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.b()) ? 1 : 0);
      float var5 = RangesKt.coerceAtLeast(var0, 0.0F);
      boolean var4 = (var10000 != 0);
      float var6 = RangesKt.coerceAtLeast(var1, var5);
      float var7 = RangesKt.coerceAtLeast(var2, var6);
      float var8 = RangesKt.coerceAtLeast(var3, var7);
      float var13;
      var10000 = (var13 = var5 - lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
      if (var4) {
         var10000 = (((var10000 == 0) ? 1 : 0));
      }

      if ((var10000 != 0)) {
         float var14;
         var10000 = (var14 = var6 - IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) == 0.0F
            ? 0
            : (var14 < 0.0F ? -1 : 1);
         if (var4) {
            var10000 = (((var10000 == 0) ? 1 : 0));
         }

         if ((var10000 != 0)) {
            float var15;
            var10000 = (var15 = var7 - lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) == 0.0F
               ? 0
               : (var15 < 0.0F ? -1 : 1);
            if (var4) {
               var10000 = (((var10000 == 0) ? 1 : 0));
            }

            if ((var10000 != 0)) {
               float var16;
               var10000 = (var16 = var8 - IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) == 0.0F
                  ? 0
                  : (var16 < 0.0F ? -1 : 1);
               if (var4) {
                  var10000 = (((var10000 == 0) ? 1 : 0));
               }

               if ((var10000 != 0)) {
                  return;
               }
            }
         }
      }

      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var5;
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var6;
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var7;
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var8;
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = true;
   }

   @JvmStatic
   public static final void b() {
      a(0.0F, 0.0F, 512.0F, 512.0F);
   }

   @JvmStatic
   public static final void c() {
      try {
         if (!IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
            return;
         }
      } catch (Throwable var14) {
         throw (RuntimeException)a(var14);
      }

      GpuBufferSlice var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a();
      boolean var1 = false;
      boolean var3 = false;
      boolean var4 = true;
      boolean var5 = false;
      MappedView var10000 = lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.a()
         .createCommandEncoder()
         .mapBuffer(var0, var3, var4);
      short var10002 = 29599;
      short var10003 = -4332;
      Intrinsics.checkNotNullExpressionValue(var10000, "mapBuffer(...)");
      var var2 = var10000;
      Throwable var15 = null;

      try {
         MappedView var16 = (MappedView)var2;
         var5 = false;
         Std140Builder var19 = Std140Builder.intoBuffer(var16.data());
         var10002 = 29597;
         var10003 = 17007;
         Intrinsics.checkNotNullExpressionValue(var19, "intoBuffer(...)");
         Std140Builder var6 = var19;
         boolean var8 = false;
         var6.putVec4(
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
            lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
            IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         );
         Unit var17 = Unit.INSTANCE;
      } catch (Throwable var12) {
         var15 = var12;
         throw var12;
      } finally {
         AutoCloseableKt.closeFinally(var2, var15);
      }

      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = false;
   }

   @JvmStatic
   public static final void a(@NotNull RenderPass var0) {
      short var10001 = 29598;
      short var10002 = -6338;
      Intrinsics.checkNotNullParameter(var0, "pass");
      var0.setUniform(
         llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            .a(),
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a()
      );
   }

   @JvmStatic
   @NotNull
   public static final GpuBufferSlice d() {
      c();
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a();
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(float var0, float var1, float var2) {
      a(var0, var1, var2, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(float var0, float var1) {
      a(var0, var1, 0.0F, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(float var0) {
      a(var0, 0.0F, 0.0F, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void e() {
      a(0.0F, 0.0F, 0.0F, 0.0F);
   }

   private static final String f() {
      short var10000 = 29596;
      short var10001 = -10706;
      return "Polinex Distance Fade UBO";
   }

   private static final GpuBufferSlice g() {
      return llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         .a(IIllIllIllIlIIlIIIIlllIIIlIIIIIlllIIIllIlIIIllllIIIllllIIlIlIlIIlIIIllIIllIIllIIIIIIl::f);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "\u001c\u0007Ò\u0003«ÇXäñ%ðÿM{Ê\u0019\u0006R\u0097\u008e4 \u001c\\\u0085§ \u008d(d\u008a\u007f\u001fOïS\u0094\u0003;gø";
      int var4 = "\u001c\u0007Ò\u0003«ÇXäñ%ðÿM{Ê\u0019\u0006R\u0097\u008e4 \u001c\\\u0085§ \u008d(d\u008a\u007f\u001fOïS\u0094\u0003;gø".length();
      char var1 = 15;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 62;
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
                     case 0 -> 53;
                     case 1 -> 6;
                     case 2 -> 62;
                     case 3 -> 22;
                     case 4 -> 119;
                     case 5 -> 107;
                     default -> 86;
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
                     b = new String[4];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIllIllIllIlIIlIIIIlllIIIlIIIIIlllIIIllIlIIIllllIIIllllIIlIlIlIIlIIIllIIllIIllIIIIIIl();
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 512.0F;
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 512.0F;
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = true;
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = LazyKt.lazy(
                        IIllIllIllIlIIlIIIIlllIIIlIIIIIlllIIIllIlIIIllllIIIllllIIlIlIlIIlIIIllIIllIIllIIIIIIl::g
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

                  var2 = "p¢1\u009a\u008a\u0081C°kx¾«¬\u0018\u0004\"©ÆÊ";
                  var4 = "p¢1\u009a\u008a\u0081C°kx¾«¬\u0018\u0004\"©ÆÊ".length();
                  var1 = 14;
                  var8 = -1;
            }

            var10000 = 49;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 29597) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 238;
            case 1 -> 41;
            case 2 -> 63;
            case 3 -> 235;
            case 4 -> 61;
            case 5 -> 145;
            case 6 -> 252;
            case 7 -> 66;
            case 8 -> 27;
            case 9 -> 165;
            case 10 -> 160;
            case 11 -> 36;
            case 12 -> 197;
            case 13 -> 209;
            case 14 -> 227;
            case 15 -> 39;
            case 16 -> 22;
            case 17 -> 222;
            case 18 -> 236;
            case 19 -> 6;
            case 20 -> 104;
            case 21 -> 75;
            case 22 -> 150;
            case 23 -> 241;
            case 24 -> 37;
            case 25 -> 162;
            case 26 -> 67;
            case 27 -> 196;
            case 28 -> 182;
            case 29 -> 228;
            case 30 -> 122;
            case 31 -> 96;
            case 32 -> 59;
            case 33 -> 194;
            case 34 -> 15;
            case 35 -> 42;
            case 36 -> 204;
            case 37 -> 121;
            case 38 -> 232;
            case 39 -> 131;
            case 40 -> 105;
            case 41 -> 102;
            case 42 -> 198;
            case 43 -> 117;
            case 44 -> 58;
            case 45 -> 208;
            case 46 -> 176;
            case 47 -> 143;
            case 48 -> 233;
            case 49 -> 207;
            case 50 -> 144;
            case 51 -> 223;
            case 52 -> 218;
            case 53 -> 17;
            case 54 -> 90;
            case 55 -> 110;
            case 56 -> 89;
            case 57 -> 154;
            case 58 -> 202;
            case 59 -> 152;
            case 60 -> 8;
            case 61 -> 98;
            case 62 -> 65;
            case 63 -> 153;
            case 64 -> 113;
            case 65 -> 126;
            case 66 -> 216;
            case 67 -> 31;
            case 68 -> 161;
            case 69 -> 135;
            case 70 -> 10;
            case 71 -> 221;
            case 72 -> 206;
            case 73 -> 171;
            case 74 -> 51;
            case 75 -> 244;
            case 76 -> 85;
            case 77 -> 53;
            case 78 -> 103;
            case 79 -> 83;
            case 80 -> 107;
            case 81 -> 70;
            case 82 -> 169;
            case 83 -> 9;
            case 84 -> 220;
            case 85 -> 116;
            case 86 -> 226;
            case 87 -> 35;
            case 88 -> 99;
            case 89 -> 112;
            case 90 -> 5;
            case 91 -> 180;
            case 92 -> 13;
            case 93 -> 151;
            case 94 -> 76;
            case 95 -> 201;
            case 96 -> 188;
            case 97 -> 114;
            case 98 -> 68;
            case 99 -> 129;
            case 100 -> 47;
            case 101 -> 7;
            case 102 -> 250;
            case 103 -> 28;
            case 104 -> 249;
            case 105 -> 49;
            case 106 -> 46;
            case 107 -> 146;
            case 108 -> 254;
            case 109 -> 43;
            case 110 -> 217;
            case 111 -> 214;
            case 112 -> 142;
            case 113 -> 74;
            case 114 -> 38;
            case 115 -> 128;
            case 116 -> 251;
            case 117 -> 73;
            case 118 -> 141;
            case 119 -> 136;
            case 120 -> 2;
            case 121 -> 118;
            case 122 -> 173;
            case 123 -> 50;
            case 124 -> 156;
            case 125 -> 26;
            case 126 -> 18;
            case 127 -> 215;
            case 128 -> 33;
            case 129 -> 138;
            case 130 -> 1;
            case 131 -> 130;
            case 132 -> 239;
            case 133 -> 178;
            case 134 -> 72;
            case 135 -> 132;
            case 136 -> 212;
            case 137 -> 54;
            case 138 -> 203;
            case 139 -> 229;
            case 140 -> 155;
            case 141 -> 60;
            case 142 -> 45;
            case 143 -> 20;
            case 144 -> 193;
            case 145 -> 124;
            case 146 -> 56;
            case 147 -> 115;
            case 148 -> 69;
            case 149 -> 181;
            case 150 -> 92;
            case 151 -> 109;
            case 152 -> 219;
            case 153 -> 80;
            case 154 -> 186;
            case 155 -> 97;
            case 156 -> 95;
            case 157 -> 213;
            case 158 -> 119;
            case 159 -> 14;
            case 160 -> 210;
            case 161 -> 86;
            case 162 -> 140;
            case 163 -> 3;
            case 164 -> 120;
            case 165 -> 246;
            case 166 -> 91;
            case 167 -> 87;
            case 168 -> 185;
            case 169 -> 44;
            case 170 -> 12;
            case 171 -> 231;
            case 172 -> 93;
            case 173 -> 19;
            case 174 -> 148;
            case 175 -> 78;
            case 176 -> 125;
            case 177 -> 174;
            case 178 -> 101;
            case 179 -> 245;
            case 180 -> 82;
            case 181 -> 172;
            case 182 -> 170;
            case 183 -> 123;
            case 184 -> 94;
            case 185 -> 16;
            case 186 -> 211;
            case 187 -> 21;
            case 188 -> 4;
            case 189 -> 157;
            case 190 -> 88;
            case 191 -> 234;
            case 192 -> 81;
            case 193 -> 175;
            case 194 -> 11;
            case 195 -> 134;
            case 196 -> 247;
            case 197 -> 192;
            case 198 -> 23;
            case 199 -> 158;
            case 200 -> 30;
            case 201 -> 147;
            case 202 -> 242;
            case 203 -> 253;
            case 204 -> 177;
            case 205 -> 29;
            case 206 -> 149;
            case 207 -> 205;
            case 208 -> 184;
            case 209 -> 108;
            case 210 -> 24;
            case 211 -> 62;
            case 212 -> 240;
            case 213 -> 190;
            case 214 -> 183;
            case 215 -> 224;
            case 216 -> 48;
            case 217 -> 71;
            case 218 -> 255;
            case 219 -> 237;
            case 220 -> 84;
            case 221 -> 52;
            case 222 -> 164;
            case 223 -> 243;
            case 224 -> 77;
            case 225 -> 40;
            case 226 -> 57;
            case 227 -> 79;
            case 228 -> 159;
            case 229 -> 34;
            case 230 -> 106;
            case 231 -> 191;
            case 232 -> 55;
            case 233 -> 187;
            case 234 -> 100;
            case 235 -> 225;
            case 236 -> 199;
            case 237 -> 25;
            case 238 -> 111;
            case 239 -> 230;
            case 240 -> 163;
            case 241 -> 133;
            case 242 -> 189;
            case 243 -> 32;
            case 244 -> 127;
            case 245 -> 168;
            case 246 -> 167;
            case 247 -> 200;
            case 248 -> 139;
            case 249 -> 0;
            case 250 -> 248;
            case 251 -> 166;
            case 252 -> 64;
            case 253 -> 137;
            case 254 -> 179;
            default -> 195;
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

  // PX-FIX synth restored from jar bytecode
  // PX-FIX synth restored from jar bytecode: Kotlin default-argument bridge
  public void a(float p0, float p1, float p2, float p3, int p4, java.lang.Object p5) {
    a(p0, p1, p2, p3);
  }
}
