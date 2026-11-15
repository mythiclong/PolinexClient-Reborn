package me.octo.client;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.buffers.GpuBuffer.MappedView;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.ByteBufferBuilder;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.Tesselator;
import kotlin.Unit;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI {
   private static String[] IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static String[] b;
   private static String[] c;

   @NotNull
   public static final GpuDevice a() {
      GpuDevice var10000 = RenderSystem.getDevice();
      short var10002 = 3886;
      short var10003 = -32527;
      Intrinsics.checkNotNullExpressionValue(var10000, "getDevice(...)");
      return var10000;
   }

   public static final void a(@NotNull PoseStack var0) {
      String[] var10000 = b();
      short var10002 = 3877;
      short var10003 = 7646;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      String[] var1 = var10000;

      while (true) {
         if (!var0.isEmpty()) {
            var0.popPose();
            if (var1 != null) {
               break;
            }

            if (var1 == null) {
               continue;
            }
         }

         var0.setIdentity();
         break;
      }
   }

   @NotNull
   public static final BufferBuilder a(@NotNull Tesselator var0, @NotNull RenderPipeline var1) {
      short var10001 = 3877;
      short var10002 = 7646;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 3885;
      var10002 = 17412;
      Intrinsics.checkNotNullParameter(var1, "pipeline");
      boolean var2 = false;
      BufferBuilder var10000 = var0.begin(var1.getVertexFormatMode(), var1.getVertexFormat());
      var10002 = 3876;
      short var10003 = -18379;
      Intrinsics.checkNotNullExpressionValue(var10000, "begin(...)");
      return var10000;
   }

   @NotNull
   public static final BufferBuilder a(@NotNull ByteBufferBuilder var0, @NotNull RenderPipeline var1) {
      short var10001 = 3874;
      short var10002 = -3633;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 3879;
      var10002 = -5358;
      Intrinsics.checkNotNullParameter(var1, "pipeline");
      boolean var2 = false;
      return new BufferBuilder(var0, var1.getVertexFormatMode(), var1.getVertexFormat());
   }

   public static final void a(@Nullable GpuTextureView var0, @Nullable GpuTextureView var1, @NotNull Function0<Unit> var2) {
      short var10001 = 3881;
      short var10002 = 30183;
      Intrinsics.checkNotNullParameter(var2, "block");
      boolean var3 = false;
      GpuTextureView var4 = RenderSystem.outputColorTextureOverride;
      GpuTextureView var5 = RenderSystem.outputDepthTextureOverride;

      try {
         RenderSystem.outputColorTextureOverride = var0;
         RenderSystem.outputDepthTextureOverride = var1;
         var2.invoke();
      } finally {
         InlineMarker.finallyStart(1);
         RenderSystem.outputColorTextureOverride = var4;
         RenderSystem.outputDepthTextureOverride = var5;
         InlineMarker.finallyEnd(1);
      }
   }

   public static final void a(@NotNull GpuTexture var0, int var1) {
      short var10001 = 3877;
      short var10002 = 7646;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      boolean var2 = false;
      a().createCommandEncoder().clearColorTexture(var0, var1);
   }

   public static final void a(@NotNull GpuTexture var0, @NotNull GpuTexture var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      short var10001 = 3877;
      short var10002 = 7646;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 3873;
      var10002 = -22303;
      Intrinsics.checkNotNullParameter(var1, "source");
      boolean var9 = false;
      a().createCommandEncoder().copyTextureToTexture(var1, var0, var2, var3, var4, var5, var6, var7, var8);
   }

   public static final void a(@NotNull GpuTexture var0, double var1) {
      short var10001 = 3877;
      short var10002 = 7646;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      boolean var3 = false;
      a().createCommandEncoder().clearDepthTexture(var0, var1);
   }

   public static void a(@NotNull RenderTarget var0, int var1, double var2, int var3, Object var4) {
      // SYNB1-defaultarg
      if ((var3 & 1) != 0) { var1 = 0; }
      if ((var3 & 2) != 0) { var2 = 1.0; }
      a(var0, var1, var2);
   }

   public static void a(@NotNull GpuTexture var0, double var1, int var2, Object var3) {
      // SYNB1-defaultarg
      if ((var2 & 1) != 0) { var1 = 1.0; }
      a(var0, var1);
   }

   public static void a(@NotNull GpuTexture var0, int var1, int var2, Object var3) {
      // SYNB1-defaultarg
      if ((var2 & 1) != 0) { var1 = 0; }
      a(var0, var1);
   }

   public static void a(@NotNull GpuTexture var0, @NotNull GpuTexture var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Object var10) {
      // SYNB1-defaultarg
      if ((var9 & 2) != 0) { var2 = 0; }
      if ((var9 & 4) != 0) { var3 = 0; }
      if ((var9 & 8) != 0) { var4 = 0; }
      if ((var9 & 16) != 0) { var5 = 0; }
      if ((var9 & 32) != 0) { var6 = 0; }
      if ((var9 & 64) != 0) { var7 = var1.getWidth(var2); }
      if ((var9 & 128) != 0) { var8 = var1.getHeight(var2); }
      a(var0, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public static void a(@Nullable GpuTextureView var0, @Nullable GpuTextureView var1, @NotNull Function0<Unit> var2, int var3, Object var4) {
      // SYNB1-defaultarg
      if ((var3 & 1) != 0) { var0 = null; }
      if ((var3 & 2) != 0) { var1 = null; }
      a(var0, var1, var2);
   }
   public static final void a(@NotNull RenderTarget var0, int var1, double var2) {
      String[] var4;
      GpuTexture var7;
      GpuTexture var15;
      short var10001 = 3877;
      short var10002 = 7646;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      String[] var10000 = b();
      boolean var5 = false;
      GpuTexture var6 = var0.getColorTexture();
      GpuTexture var8 = var0.getDepthTexture();
      var4 = var10000;
      boolean var10 = false;
      var7 = var0.useDepth ? var8 : null;
      var15 = var6;
      label41:
      if (var4 == null) {
         if (var6 != null) {
            var15 = var7;
            if (var4 != null) {
               break label41;
            }

            if (var7 != null) {
               a().createCommandEncoder().clearColorAndDepthTextures(var6, var1, var7, var2);
               if (var4 == null) {
                  return;
               }
            }
         }

         var15 = var6;
      }

      if (var4 == null) {
         if (var15 != null) {
            var8 = var15;
            var10 = false;
            a().createCommandEncoder().clearColorTexture(var8, var1);
            return;
         }

         var15 = var7;
      }

      if (var4 == null) {
         if (var15 == null) {
            return;
         }

         var15 = var7;
      }

      var8 = var15;
      boolean var11 = false;
      a().createCommandEncoder().clearDepthTexture(var8, var2);
   }

   @NotNull
   public static final MappedView a(@NotNull GpuBufferSlice var0, boolean var1, boolean var2) {
      short var10001 = 3877;
      short var10002 = 7646;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      boolean var3 = false;
      MappedView var10000 = a().createCommandEncoder().mapBuffer(var0, var1, var2);
      var10002 = 3878;
      short var10003 = -13745;
      Intrinsics.checkNotNullExpressionValue(var10000, "mapBuffer(...)");
      return var10000;
   }

   public static final int a(@NotNull Function1<? super IIIllllllllIIlIlIlIIlIllIIIIlIIIlIIlIIlllllIIIIlIlIIlIlIIlllIIIllIIlllllIIlIIlIlIIllI, Unit> var0) {
      short var10001 = 3881;
      short var10002 = 30183;
      Intrinsics.checkNotNullParameter(var0, "block");
      boolean var1 = false;
      IIIllllllllIIlIlIlIIlIllIIIIlIIIlIIlIIlllllIIIIlIlIIlIlIIlllIIIllIIlllllIIlIIlIlIIllI var2 = IIIllllllllIIlIlIlIIlIllIIIIlIIIlIIlIIlllllIIIIlIlIIlIlIIlllIIIllIIlllllIIlIIlIlIIllI.m(
         IIIllllllllIIlIlIlIIlIllIIIIlIIIlIIlIIlllllIIIIlIlIIlIlIIlllIIIllIIlllllIIlIIlIlIIllI.l(new Std140SizeCalculator())
      );
      var0.invoke(var2);
      Std140SizeCalculator var4 = var2.b();
      boolean var3 = false;
      return var4.get();
   }

   public static final void a(@NotNull GpuBufferSlice var0, @NotNull Function1<? super Std140Builder, Unit> var1) {
      short var10001 = 3877;
      short var10002 = 7646;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 3872;
      var10002 = 1729;
      Intrinsics.checkNotNullParameter(var1, "block");
      boolean var2 = false;
      boolean var4 = false;
      boolean var5 = true;
      boolean var6 = false;
      MappedView var10000 = a().createCommandEncoder().mapBuffer(var0, var4, var5);
      var10002 = 3887;
      short var10003 = 30560;
      Intrinsics.checkNotNullExpressionValue(var10000, "mapBuffer(...)");
      var var3 = var10000;
      Throwable var12 = null;

      try {
         MappedView var13 = (MappedView)var3;
         var6 = false;
         Std140Builder var16 = Std140Builder.intoBuffer(var13.data());
         var10002 = 3884;
         var10003 = 2619;
         Intrinsics.checkNotNullExpressionValue(var16, "intoBuffer(...)");
         Std140Builder var7 = var16;
         var1.invoke(var7);
         Unit var14 = Unit.INSTANCE;
      } catch (Throwable var10) {
         var12 = var10;
         throw var10;
      } finally {
         InlineMarker.finallyStart(1);
         AutoCloseableKt.closeFinally(var3, var12);
         InlineMarker.finallyEnd(1);
      }
   }

   public static void b(String[] var0) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var0;
   }

   public static String[] b() {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[13];
      int var3 = 0;
      String var2 = "\u008fi°½í·\nm\u0080v³Æ`v9Vw\b©\u0004©¢Ê\u008eõÆ\u000e\u001aôa\u0092ÊDÇq}]¾EhI\u0006Øâá¯iÖ\u0005\u0002\u001e\u0093Bv\u0006\u0094wh\u001dX\u0080\u00069þfO7é\bqÅ²\u009a©\u0089\u0099&\u000fÍÖ\u001b\u00156/\u0089n£\u0087\u0096\u000f«\u0007\u0081\u000e\u0088Þ3×\u0080ì\u008edTÿ\u009b\u0011ÌÃ";
      int var4 = "\u008fi°½í·\nm\u0080v³Æ`v9Vw\b©\u0004©¢Ê\u008eõÆ\u000e\u001aôa\u0092ÊDÇq}]¾EhI\u0006Øâá¯iÖ\u0005\u0002\u001e\u0093Bv\u0006\u0094wh\u001dX\u0080\u00069þfO7é\bqÅ²\u009a©\u0089\u0099&\u000fÍÖ\u001b\u00156/\u0089n£\u0087\u0096\u000f«\u0007\u0081\u000e\u0088Þ3×\u0080ì\u008edTÿ\u009b\u0011ÌÃ"
         .length();
      char var1 = 6;
      b(null);
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 32;
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
                     case 0 -> 93;
                     case 1 -> 48;
                     case 2 -> 29;
                     case 3 -> 33;
                     case 4 -> 106;
                     case 5 -> 122;
                     default -> 74;
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
                     b = var5;
                     c = new String[13];
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

                  var2 = "\u0011ñ\u0013ìL\u0001V\u0091êÛåÉ_\u0084\u0005\\A\u0004õØ";
                  var4 = "\u0011ñ\u0013ìL\u0001V\u0091êÛåÉ_\u0084\u0005\\A\u0004õØ".length();
                  var1 = 14;
                  var8 = -1;
            }

            var10000 = 27;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 3877) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 14;
            case 1 -> 22;
            case 2 -> 221;
            case 3 -> 148;
            case 4 -> 174;
            case 5 -> 8;
            case 6 -> 234;
            case 7 -> 204;
            case 8 -> 62;
            case 9 -> 181;
            case 10 -> 247;
            case 11 -> 75;
            case 12 -> 136;
            case 13 -> 43;
            case 14 -> 30;
            case 15 -> 162;
            case 16 -> 195;
            case 17 -> 232;
            case 18 -> 40;
            case 19 -> 6;
            case 20 -> 201;
            case 21 -> 238;
            case 22 -> 130;
            case 23 -> 85;
            case 24 -> 175;
            case 25 -> 91;
            case 26 -> 111;
            case 27 -> 199;
            case 28 -> 108;
            case 29 -> 142;
            case 30 -> 24;
            case 31 -> 90;
            case 32 -> 172;
            case 33 -> 28;
            case 34 -> 250;
            case 35 -> 50;
            case 36 -> 249;
            case 37 -> 230;
            case 38 -> 73;
            case 39 -> 117;
            case 40 -> 177;
            case 41 -> 96;
            case 42 -> 236;
            case 43 -> 198;
            case 44 -> 149;
            case 45 -> 169;
            case 46 -> 178;
            case 47 -> 0;
            case 48 -> 54;
            case 49 -> 254;
            case 50 -> 60;
            case 51 -> 20;
            case 52 -> 206;
            case 53 -> 196;
            case 54 -> 84;
            case 55 -> 224;
            case 56 -> 55;
            case 57 -> 34;
            case 58 -> 215;
            case 59 -> 93;
            case 60 -> 245;
            case 61 -> 160;
            case 62 -> 252;
            case 63 -> 179;
            case 64 -> 120;
            case 65 -> 122;
            case 66 -> 166;
            case 67 -> 188;
            case 68 -> 87;
            case 69 -> 154;
            case 70 -> 56;
            case 71 -> 100;
            case 72 -> 211;
            case 73 -> 47;
            case 74 -> 131;
            case 75 -> 226;
            case 76 -> 187;
            case 77 -> 212;
            case 78 -> 243;
            case 79 -> 38;
            case 80 -> 113;
            case 81 -> 127;
            case 82 -> 88;
            case 83 -> 129;
            case 84 -> 10;
            case 85 -> 77;
            case 86 -> 15;
            case 87 -> 193;
            case 88 -> 183;
            case 89 -> 59;
            case 90 -> 165;
            case 91 -> 126;
            case 92 -> 237;
            case 93 -> 49;
            case 94 -> 9;
            case 95 -> 103;
            case 96 -> 106;
            case 97 -> 21;
            case 98 -> 146;
            case 99 -> 79;
            case 100 -> 213;
            case 101 -> 209;
            case 102 -> 116;
            case 103 -> 69;
            case 104 -> 208;
            case 105 -> 109;
            case 106 -> 39;
            case 107 -> 118;
            case 108 -> 125;
            case 109 -> 1;
            case 110 -> 228;
            case 111 -> 220;
            case 112 -> 217;
            case 113 -> 194;
            case 114 -> 132;
            case 115 -> 239;
            case 116 -> 140;
            case 117 -> 210;
            case 118 -> 68;
            case 119 -> 78;
            case 120 -> 128;
            case 121 -> 242;
            case 122 -> 182;
            case 123 -> 171;
            case 124 -> 3;
            case 125 -> 80;
            case 126 -> 83;
            case 127 -> 164;
            case 128 -> 176;
            case 129 -> 185;
            case 130 -> 27;
            case 131 -> 121;
            case 132 -> 240;
            case 133 -> 33;
            case 134 -> 251;
            case 135 -> 138;
            case 136 -> 189;
            case 137 -> 225;
            case 138 -> 13;
            case 139 -> 35;
            case 140 -> 246;
            case 141 -> 70;
            case 142 -> 63;
            case 143 -> 248;
            case 144 -> 161;
            case 145 -> 159;
            case 146 -> 105;
            case 147 -> 203;
            case 148 -> 152;
            case 149 -> 44;
            case 150 -> 219;
            case 151 -> 115;
            case 152 -> 65;
            case 153 -> 19;
            case 154 -> 158;
            case 155 -> 29;
            case 156 -> 223;
            case 157 -> 244;
            case 158 -> 37;
            case 159 -> 231;
            case 160 -> 135;
            case 161 -> 12;
            case 162 -> 36;
            case 163 -> 156;
            case 164 -> 86;
            case 165 -> 11;
            case 166 -> 145;
            case 167 -> 123;
            case 168 -> 147;
            case 169 -> 94;
            case 170 -> 192;
            case 171 -> 190;
            case 172 -> 58;
            case 173 -> 107;
            case 174 -> 71;
            case 175 -> 46;
            case 176 -> 98;
            case 177 -> 32;
            case 178 -> 52;
            case 179 -> 253;
            case 180 -> 25;
            case 181 -> 233;
            case 182 -> 124;
            case 183 -> 82;
            case 184 -> 191;
            case 185 -> 2;
            case 186 -> 97;
            case 187 -> 119;
            case 188 -> 104;
            case 189 -> 150;
            case 190 -> 48;
            case 191 -> 72;
            case 192 -> 74;
            case 193 -> 45;
            case 194 -> 89;
            case 195 -> 26;
            case 196 -> 216;
            case 197 -> 137;
            case 198 -> 81;
            case 199 -> 214;
            case 200 -> 57;
            case 201 -> 53;
            case 202 -> 95;
            case 203 -> 101;
            case 204 -> 92;
            case 205 -> 134;
            case 206 -> 99;
            case 207 -> 61;
            case 208 -> 139;
            case 209 -> 235;
            case 210 -> 184;
            case 211 -> 42;
            case 212 -> 110;
            case 213 -> 255;
            case 214 -> 7;
            case 215 -> 186;
            case 216 -> 222;
            case 217 -> 205;
            case 218 -> 17;
            case 219 -> 155;
            case 220 -> 31;
            case 221 -> 207;
            case 222 -> 227;
            case 223 -> 163;
            case 224 -> 4;
            case 225 -> 66;
            case 226 -> 167;
            case 227 -> 18;
            case 228 -> 144;
            case 229 -> 151;
            case 230 -> 112;
            case 231 -> 114;
            case 232 -> 197;
            case 233 -> 41;
            case 234 -> 5;
            case 235 -> 170;
            case 236 -> 180;
            case 237 -> 153;
            case 238 -> 168;
            case 239 -> 143;
            case 240 -> 133;
            case 241 -> 173;
            case 242 -> 16;
            case 243 -> 218;
            case 244 -> 64;
            case 245 -> 200;
            case 246 -> 241;
            case 247 -> 102;
            case 248 -> 157;
            case 249 -> 23;
            case 250 -> 229;
            case 251 -> 202;
            case 252 -> 51;
            case 253 -> 67;
            case 254 -> 141;
            default -> 76;
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
}
