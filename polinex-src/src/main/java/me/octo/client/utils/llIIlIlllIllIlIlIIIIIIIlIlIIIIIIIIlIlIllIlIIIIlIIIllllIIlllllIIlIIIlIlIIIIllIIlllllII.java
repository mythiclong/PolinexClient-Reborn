package me.octo.client.utils;

import com.mojang.blaze3d.vertex.PoseStack;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.core.BlockPos.MutableBlockPos;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2f;
import org.joml.Vector2f;
import org.joml.Vector3f;

public final class llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII {
   @NotNull
   public static llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @JvmField
   @NotNull
   public static lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII<PoseStack> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @JvmField
   @NotNull
   public static lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII<Matrix3x2f> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @JvmField
   @NotNull
   public static lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII<Vector3f> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @JvmField
   @NotNull
   public static lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII<Vector2f> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @JvmField
   @NotNull
   public static lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII<MutableBlockPos> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @JvmField
   @NotNull
   public static lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII<StringBuilder> IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static String[] a;
   private static String[] b;

   private llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII() {
   }

   private static final Unit a(MutableBlockPos var0) {
      short var10001 = -21782;
      short var10002 = 18152;
      Intrinsics.checkNotNullParameter(var0, "it");
      var0.set(0, 0, 0);
      return Unit.INSTANCE;
   }

   private static final StringBuilder a() {
      return new StringBuilder(128);
   }

   private static final Unit a(StringBuilder var0) {
      short var10001 = -21781;
      short var10002 = 32657;
      Intrinsics.checkNotNullParameter(var0, "it");
      var0.setLength(0);
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "«\u007f\u0002-u";
      int var4 = "«\u007f\u0002-u".length();
      char var1 = 2;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 98;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 98;
               var10006 = var6;
            } else {
               var13 = 98;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 98;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 87;
                  case 1 -> 60;
                  case 2 -> 100;
                  case 3 -> 88;
                  case 4 -> 78;
                  case 5 -> 122;
                  default -> 115;
               });
               var6++;
               if (var13 == 0) {
                  var10006 = var13;
                  var10005 = var10002;
                  var16 = var13;
               } else {
                  if (var8 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var16 = var13;
                  var10006 = var6;
               }
            }
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var5[var3++] = var15;
         if ((var0 += var1) >= var4) {
            a = var5;
            b = new String[2];
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII();
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII<>(
               com.mojang.blaze3d.vertex.PoseStack::new,
               poseStack -> { me.octo.client.lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.a(poseStack); return kotlin.Unit.INSTANCE; }
            );
            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII<org.joml.Matrix3x2f>(
               org.joml.Matrix3x2f::new,
               o -> { o.identity(); return kotlin.Unit.INSTANCE; }
            );
            lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII<org.joml.Vector3f>(
               org.joml.Vector3f::new,
               o -> { o.zero(); return kotlin.Unit.INSTANCE; }
            );
            IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII<org.joml.Vector2f>(
               org.joml.Vector2f::new,
               o -> { o.zero(); return kotlin.Unit.INSTANCE; }
            );
            IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII<MutableBlockPos>(
                  net.minecraft.core.BlockPos.MutableBlockPos::new,
                  llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII::a
               )
               .b();
            IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII<StringBuilder>(
                  java.lang.StringBuilder::new,
                  o -> { o.setLength(0); return kotlin.Unit.INSTANCE; }
               )
               .b();
            break pxClinit; // PX-FIX
         }

         var1 = var2.charAt(var0);
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -21782) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 238;
            case 1 -> 112;
            case 2 -> 235;
            case 3 -> 127;
            case 4 -> 200;
            case 5 -> 161;
            case 6 -> 60;
            case 7 -> 116;
            case 8 -> 50;
            case 9 -> 163;
            case 10 -> 148;
            case 11 -> 20;
            case 12 -> 124;
            case 13 -> 196;
            case 14 -> 111;
            case 15 -> 108;
            case 16 -> 21;
            case 17 -> 77;
            case 18 -> 9;
            case 19 -> 226;
            case 20 -> 13;
            case 21 -> 156;
            case 22 -> 140;
            case 23 -> 73;
            case 24 -> 32;
            case 25 -> 125;
            case 26 -> 188;
            case 27 -> 106;
            case 28 -> 54;
            case 29 -> 139;
            case 30 -> 43;
            case 31 -> 253;
            case 32 -> 131;
            case 33 -> 153;
            case 34 -> 81;
            case 35 -> 31;
            case 36 -> 16;
            case 37 -> 85;
            case 38 -> 38;
            case 39 -> 245;
            case 40 -> 202;
            case 41 -> 5;
            case 42 -> 243;
            case 43 -> 205;
            case 44 -> 178;
            case 45 -> 144;
            case 46 -> 103;
            case 47 -> 134;
            case 48 -> 185;
            case 49 -> 51;
            case 50 -> 24;
            case 51 -> 123;
            case 52 -> 234;
            case 53 -> 98;
            case 54 -> 40;
            case 55 -> 118;
            case 56 -> 1;
            case 57 -> 87;
            case 58 -> 59;
            case 59 -> 214;
            case 60 -> 231;
            case 61 -> 193;
            case 62 -> 84;
            case 63 -> 102;
            case 64 -> 88;
            case 65 -> 35;
            case 66 -> 56;
            case 67 -> 93;
            case 68 -> 242;
            case 69 -> 30;
            case 70 -> 11;
            case 71 -> 132;
            case 72 -> 167;
            case 73 -> 203;
            case 74 -> 19;
            case 75 -> 64;
            case 76 -> 195;
            case 77 -> 92;
            case 78 -> 183;
            case 79 -> 249;
            case 80 -> 83;
            case 81 -> 136;
            case 82 -> 70;
            case 83 -> 104;
            case 84 -> 28;
            case 85 -> 159;
            case 86 -> 105;
            case 87 -> 173;
            case 88 -> 72;
            case 89 -> 198;
            case 90 -> 169;
            case 91 -> 100;
            case 92 -> 254;
            case 93 -> 57;
            case 94 -> 223;
            case 95 -> 191;
            case 96 -> 247;
            case 97 -> 244;
            case 98 -> 179;
            case 99 -> 228;
            case 100 -> 41;
            case 101 -> 213;
            case 102 -> 151;
            case 103 -> 122;
            case 104 -> 181;
            case 105 -> 255;
            case 106 -> 126;
            case 107 -> 174;
            case 108 -> 204;
            case 109 -> 47;
            case 110 -> 61;
            case 111 -> 74;
            case 112 -> 240;
            case 113 -> 75;
            case 114 -> 63;
            case 115 -> 220;
            case 116 -> 114;
            case 117 -> 229;
            case 118 -> 172;
            case 119 -> 109;
            case 120 -> 76;
            case 121 -> 29;
            case 122 -> 121;
            case 123 -> 115;
            case 124 -> 182;
            case 125 -> 119;
            case 126 -> 48;
            case 127 -> 166;
            case 128 -> 120;
            case 129 -> 67;
            case 130 -> 34;
            case 131 -> 155;
            case 132 -> 110;
            case 133 -> 94;
            case 134 -> 62;
            case 135 -> 101;
            case 136 -> 175;
            case 137 -> 189;
            case 138 -> 99;
            case 139 -> 53;
            case 140 -> 137;
            case 141 -> 225;
            case 142 -> 150;
            case 143 -> 207;
            case 144 -> 160;
            case 145 -> 145;
            case 146 -> 128;
            case 147 -> 157;
            case 148 -> 10;
            case 149 -> 68;
            case 150 -> 12;
            case 151 -> 236;
            case 152 -> 190;
            case 153 -> 95;
            case 154 -> 69;
            case 155 -> 90;
            case 156 -> 219;
            case 157 -> 143;
            case 158 -> 241;
            case 159 -> 230;
            case 160 -> 212;
            case 161 -> 209;
            case 162 -> 246;
            case 163 -> 65;
            case 164 -> 96;
            case 165 -> 55;
            case 166 -> 4;
            case 167 -> 171;
            case 168 -> 221;
            case 169 -> 233;
            case 170 -> 8;
            case 171 -> 192;
            case 172 -> 86;
            case 173 -> 15;
            case 174 -> 44;
            case 175 -> 23;
            case 176 -> 164;
            case 177 -> 232;
            case 178 -> 251;
            case 179 -> 184;
            case 180 -> 80;
            case 181 -> 180;
            case 182 -> 138;
            case 183 -> 133;
            case 184 -> 37;
            case 185 -> 79;
            case 186 -> 208;
            case 187 -> 39;
            case 188 -> 2;
            case 189 -> 227;
            case 190 -> 215;
            case 191 -> 239;
            case 192 -> 97;
            case 193 -> 18;
            case 194 -> 165;
            case 195 -> 91;
            case 196 -> 7;
            case 197 -> 170;
            case 198 -> 22;
            case 199 -> 147;
            case 200 -> 158;
            case 201 -> 237;
            case 202 -> 218;
            case 203 -> 162;
            case 204 -> 211;
            case 205 -> 154;
            case 206 -> 71;
            case 207 -> 201;
            case 208 -> 17;
            case 209 -> 197;
            case 210 -> 250;
            case 211 -> 26;
            case 212 -> 224;
            case 213 -> 78;
            case 214 -> 107;
            case 215 -> 216;
            case 216 -> 210;
            case 217 -> 199;
            case 218 -> 52;
            case 219 -> 0;
            case 220 -> 42;
            case 221 -> 49;
            case 222 -> 113;
            case 223 -> 36;
            case 224 -> 142;
            case 225 -> 206;
            case 226 -> 177;
            case 227 -> 248;
            case 228 -> 3;
            case 229 -> 252;
            case 230 -> 27;
            case 231 -> 14;
            case 232 -> 176;
            case 233 -> 130;
            case 234 -> 187;
            case 235 -> 168;
            case 236 -> 58;
            case 237 -> 152;
            case 238 -> 149;
            case 239 -> 146;
            case 240 -> 141;
            case 241 -> 89;
            case 242 -> 186;
            case 243 -> 25;
            case 244 -> 194;
            case 245 -> 217;
            case 246 -> 135;
            case 247 -> 222;
            case 248 -> 45;
            case 249 -> 82;
            case 250 -> 6;
            case 251 -> 129;
            case 252 -> 117;
            case 253 -> 66;
            case 254 -> 33;
            default -> 46;
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
   public static class IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1 {
      public static IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private static java.lang.String[] a;
      private static java.lang.String[] b;

      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI() {
         super(1, me.octo.client.lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.class, "reset", "reset(Lcom/mojang/blaze3d/vertex/PoseStack;)V", 1);
      }

      public final void a(com.mojang.blaze3d.vertex.PoseStack var1) {
         kotlin.jvm.internal.Intrinsics.checkNotNullParameter(var1, "p0");
         me.octo.client.lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.a(var1);
      }

      @Override
      public java.lang.Object invoke(java.lang.Object var1) {
         this.a((com.mojang.blaze3d.vertex.PoseStack)var1);
         return kotlin.Unit.INSTANCE;
      }

      static {
         // PX-FIX clinit Phase A
      }

      private static String a(int var0, int var1) {
         // PX-FIX Phase A: encrypted string table decryption not inlined
         return null;
      }
   }
   public static class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll extends kotlin.jvm.internal.AdaptedFunctionReference implements kotlin.jvm.functions.Function1 {
      public static IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private static java.lang.String[] a;
      private static java.lang.String[] b;

      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll() {
         super(1, org.joml.Vector3f.class, "zero", "zero()Lorg/joml/Vector3f;", 8);
      }

      public final void a(org.joml.Vector3f var1) {
         kotlin.jvm.internal.Intrinsics.checkNotNullParameter(var1, "p0");
         var1.zero();
      }

      @Override
      public java.lang.Object invoke(java.lang.Object var1) {
         this.a((org.joml.Vector3f)var1);
         return kotlin.Unit.INSTANCE;
      }

      static {
         // PX-FIX clinit Phase A
      }

      private static String a(int var0, int var1) {
         // PX-FIX Phase A: encrypted string table decryption not inlined
         return null;
      }
   }
   public static class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0 {
      public static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private static java.lang.String[] a;
      private static java.lang.String[] b;

      IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
         super(0, org.joml.Matrix3x2f.class, "<init>", "<init>()V", 0);
      }

      public final org.joml.Matrix3x2f a() {
         return new org.joml.Matrix3x2f();
      }

      @Override
      public java.lang.Object invoke() {
         return this.a();
      }

      static {
         // PX-FIX clinit Phase A
      }

      private static String a(int var0, int var1) {
         // PX-FIX Phase A: encrypted string table decryption not inlined
         return null;
      }
   }
   public static class IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0 {
      public static IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private static java.lang.String[] a;
      private static java.lang.String[] b;

      IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI() {
         super(0, net.minecraft.core.BlockPos.MutableBlockPos.class, "<init>", "<init>()V", 0);
      }

      public final net.minecraft.core.BlockPos.MutableBlockPos a() {
         return new net.minecraft.core.BlockPos.MutableBlockPos();
      }

      @Override
      public java.lang.Object invoke() {
         return this.a();
      }

      static {
         // PX-FIX clinit Phase A
      }

      private static String a(int var0, int var1) {
         // PX-FIX Phase A: encrypted string table decryption not inlined
         return null;
      }
   }
   public static class IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0 {
      public static IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private static java.lang.String[] a;
      private static java.lang.String[] b;

      IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll() {
         super(0, org.joml.Vector3f.class, "<init>", "<init>()V", 0);
      }

      public final org.joml.Vector3f a() {
         return new org.joml.Vector3f();
      }

      @Override
      public java.lang.Object invoke() {
         return this.a();
      }

      static {
         // PX-FIX clinit Phase A
      }

      private static String a(int var0, int var1) {
         // PX-FIX Phase A: encrypted string table decryption not inlined
         return null;
      }
   }
   public static class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI extends kotlin.jvm.internal.AdaptedFunctionReference implements kotlin.jvm.functions.Function1 {
      public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private static java.lang.String[] a;
      private static java.lang.String[] b;

      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
         super(1, org.joml.Vector2f.class, "zero", "zero()Lorg/joml/Vector2f;", 8);
      }

      public final void a(org.joml.Vector2f var1) {
         kotlin.jvm.internal.Intrinsics.checkNotNullParameter(var1, "p0");
         var1.zero();
      }

      @Override
      public java.lang.Object invoke(java.lang.Object var1) {
         this.a((org.joml.Vector2f)var1);
         return kotlin.Unit.INSTANCE;
      }

      static {
         // PX-FIX clinit Phase A
      }

      private static String a(int var0, int var1) {
         // PX-FIX Phase A: encrypted string table decryption not inlined
         return null;
      }
   }
   public static class llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0 {
      public static llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private static java.lang.String[] a;
      private static java.lang.String[] b;

      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl() {
         super(0, org.joml.Vector2f.class, "<init>", "<init>()V", 0);
      }

      public final org.joml.Vector2f a() {
         return new org.joml.Vector2f();
      }

      @Override
      public java.lang.Object invoke() {
         return this.a();
      }

      static {
         // PX-FIX clinit Phase A
      }

      private static String a(int var0, int var1) {
         // PX-FIX Phase A: encrypted string table decryption not inlined
         return null;
      }
   }
   public static class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll extends kotlin.jvm.internal.AdaptedFunctionReference implements kotlin.jvm.functions.Function1 {
      public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private static java.lang.String[] a;
      private static java.lang.String[] b;

      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
         super(1, org.joml.Matrix3x2f.class, "identity", "identity()Lorg/joml/Matrix3x2f;", 8);
      }

      public final void a(org.joml.Matrix3x2f var1) {
         kotlin.jvm.internal.Intrinsics.checkNotNullParameter(var1, "p0");
         var1.identity();
      }

      @Override
      public java.lang.Object invoke(java.lang.Object var1) {
         this.a((org.joml.Matrix3x2f)var1);
         return kotlin.Unit.INSTANCE;
      }

      static {
         // PX-FIX clinit Phase A
      }

      private static String a(int var0, int var1) {
         // PX-FIX Phase A: encrypted string table decryption not inlined
         return null;
      }
   }
   public static class llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0 {
      public static llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private static java.lang.String[] a;
      private static java.lang.String[] b;

      llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll() {
         super(0, com.mojang.blaze3d.vertex.PoseStack.class, "<init>", "<init>()V", 0);
      }

      public final com.mojang.blaze3d.vertex.PoseStack a() {
         return new com.mojang.blaze3d.vertex.PoseStack();
      }

      @Override
      public java.lang.Object invoke() {
         return this.a();
      }

      static {
         // PX-FIX clinit Phase A
      }

      private static String a(int var0, int var1) {
         // PX-FIX Phase A: encrypted string table decryption not inlined
         return null;
      }
   }
}
