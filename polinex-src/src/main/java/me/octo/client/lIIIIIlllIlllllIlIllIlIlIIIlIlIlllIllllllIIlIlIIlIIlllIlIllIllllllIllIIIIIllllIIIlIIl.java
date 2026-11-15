package me.octo.client;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.ScissorState;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormat.IndexType;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Map.Entry;
import java.util.function.Supplier;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.renderer.DynamicUniforms;
import net.minecraft.client.renderer.texture.AbstractTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;
import org.joml.Vector4fc;

public final class lIIIIIlllIlllllIlIllIlIlIIIlIlIlllIllllllIIlIlIIlIIlllIlIllIllllllIllIIIIIllllIIIlIIl {
   @NotNull
   private static Vector4f IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Vector3f lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static Matrix4f IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static Supplier<String> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static String[] a;
   private static String[] b;

   public static final void a(@NotNull RenderPass var0, @NotNull Map<String, ? extends AbstractTexture> var1) {
      boolean var10000 = IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.b();
      short var10002 = 6845;
      short var10003 = -27885;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      boolean var2 = var10000;
      short var10001 = 6818;
      var10002 = -29792;
      Intrinsics.checkNotNullParameter(var1, "textures");
      boolean var3 = false;
      boolean var5 = false;

      for (Entry var7 : var1.entrySet()) {
         boolean var9 = false;
         String var11 = (String)var7.getKey();
         AbstractTexture var12 = (AbstractTexture)var7.getValue();
         boolean var13 = false;
         if (var2) {
            var0.bindTexture(var11, var2 && var12 != null ? var12.getTextureView() : null, var12 != null ? var12.getSampler() : null);
            if (var2) {
               continue;
            }
         }
         break;
      }
   }

   public static final void a(@NotNull RenderPass var0, @NotNull String var1, @Nullable AbstractTexture var2) {
      boolean var10000 = IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.b();
      short var10002 = 6845;
      short var10003 = -27885;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      boolean var3 = var10000;
      short var10001 = 6822;
      var10002 = -25498;
      Intrinsics.checkNotNullParameter(var1, "name");
      boolean var4 = false;
      var0.bindTexture(var1, var3 && var2 != null ? var2.getTextureView() : null, var2 != null ? var2.getSampler() : null);
   }

   public static final void a(@NotNull RenderPass var0, @NotNull String var1) {
      short var10001 = 6845;
      short var10002 = -27885;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 6841;
      var10002 = 25577;
      Intrinsics.checkNotNullParameter(var1, "name");
      boolean var2 = false;
      var0.bindTexture(var1, null, null);
   }

   public static final void b(@NotNull RenderPass var0, @NotNull Map<String, GpuBufferSlice> var1) {
      boolean var10000 = IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.b();
      short var10002 = 6845;
      short var10003 = -27885;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10002 = 6821;
      var10003 = -16588;
      Intrinsics.checkNotNullParameter(var1, "uniforms");
      boolean var2 = var10000;
      boolean var3 = false;
      boolean var5 = false;

      for (Entry var7 : var1.entrySet()) {
         boolean var9 = false;
         var0.setUniform((String)var7.getKey(), (GpuBufferSlice)var7.getValue());
         if (var2 && var2) {
            continue;
         }
         break;
      }
   }

   public static final void a(@NotNull RenderPass var0) {
      short var10001 = 6845;
      short var10002 = -27885;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      boolean var1 = false;
      RenderSystem.bindDefaultUniforms(var0);
   }

   public static final void b(@NotNull RenderPass var0) {
      boolean var10000 = IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.b();
      short var10002 = 6845;
      short var10003 = -27885;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      boolean var1 = var10000;
      boolean var2 = false;
      if (var1) {
         GpuBufferSlice var5 = RenderSystem.getProjectionMatrixBuffer();
         if (var5 != null) {
            GpuBufferSlice var3 = var5;
            boolean var4 = false;
            short var10001 = 6833;
            var10002 = -7162;
            var0.setUniform("Projection", var3);
         }
      }
   }

   public static final void c(@NotNull RenderPass var0) {
      boolean var10000 = IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.c();
      short var10002 = 6845;
      short var10003 = -27885;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      boolean var1 = var10000;
      boolean var2 = false;
      if (!var1) {
         GpuBufferSlice var5 = RenderSystem.getShaderFog();
         if (var5 != null) {
            GpuBufferSlice var3 = var5;
            boolean var4 = false;
            short var10001 = 6828;
            var10002 = -12351;
            var0.setUniform("Fog", var3);
         }
      }
   }

   public static final void d(@NotNull RenderPass var0) {
      boolean var10000 = IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.b();
      short var10002 = 6845;
      short var10003 = -27885;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      boolean var2 = false;
      boolean var1 = var10000;
      if (var1) {
         GpuBuffer var5 = RenderSystem.getGlobalSettingsUniform();
         if (var5 != null) {
            GpuBuffer var3 = var5;
            boolean var4 = false;
            short var10001 = 6843;
            var10002 = 30159;
            var0.setUniform("Globals", var3);
         }
      }
   }

   public static final void e(@NotNull RenderPass var0) {
      boolean var10000 = IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.b();
      short var10002 = 6845;
      short var10003 = -27885;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      boolean var2 = false;
      boolean var1 = var10000;
      if (var1) {
         GpuBufferSlice var5 = RenderSystem.getShaderLights();
         if (var5 != null) {
            GpuBufferSlice var3 = var5;
            boolean var4 = false;
            short var10001 = 6819;
            var10002 = 29662;
            var0.setUniform("Lighting", var3);
         }
      }
   }

   public static final void a(@NotNull RenderPass var0, @NotNull GpuBufferSlice var1) {
      short var10001 = 6845;
      short var10002 = -27885;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 6836;
      var10002 = 24544;
      Intrinsics.checkNotNullParameter(var1, "gpuBufferSlice");
      boolean var2 = false;
      var10001 = 6830;
      var10002 = 13446;
      var0.setUniform("DynamicTransforms", var1);
   }

   public static final void f(@NotNull RenderPass var0) {
      short var10001 = 6845;
      short var10002 = -27885;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      boolean var1 = false;
      ScissorState var10000 = RenderSystem.getScissorStateForRenderTypeDraws();
      var10002 = 6826;
      short var10003 = -32239;
      Intrinsics.checkNotNullExpressionValue(var10000, "getScissorStateForRenderTypeDraws(...)");
      ScissorState var2 = var10000;
      if (var2.enabled()) {
         var0.enableScissor(var2.x(), var2.y(), var2.width(), var2.height());
      }
   }

   public static final void a(
      @NotNull RenderPass var0, @NotNull GpuBufferSlice var1, @NotNull GpuBufferSlice var2, @NotNull VertexFormat var3, @NotNull IndexType var4, int var5
   ) {
      short var10001 = 6845;
      short var10002 = -27885;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 6816;
      var10002 = 28708;
      Intrinsics.checkNotNullParameter(var1, "vertexSlice");
      var10001 = 6829;
      var10002 = 21437;
      Intrinsics.checkNotNullParameter(var2, "indexSlice");
      var10001 = 6837;
      var10002 = -15752;
      Intrinsics.checkNotNullParameter(var3, "vertexFormat");
      var10001 = 6840;
      var10002 = 30823;
      Intrinsics.checkNotNullParameter(var4, "indexType");
      var0.setVertexBuffer(0, var1.buffer());
      var0.setIndexBuffer(var2.buffer(), var4);
      var0.drawIndexed((int)(var1.offset() / var3.getVertexSize()), (int)(var2.offset() / var4.bytes), var5, 1);
   }

   @JvmOverloads
   @NotNull
   public static final GpuBufferSlice a(
      @Nullable Matrix4fc var0, @NotNull llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1
   ) {
      DynamicUniforms var4;
      Matrix4fc var10001;
      label13: {
         boolean var10000 = IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.c();
         short var10002 = 6834;
         short var10003 = -12471;
         Intrinsics.checkNotNullParameter(var1, "colorModulator");
         boolean var2 = var10000;
         var4 = RenderSystem.getDynamicUniforms();
         if (!var2) {
            var10001 = var0;
            if (var0 != null) {
               break label13;
            }
         }

         Matrix4f var5 = RenderSystem.getModelViewMatrix();
         var10003 = 6831;
         short var10004 = -24386;
         Intrinsics.checkNotNullExpressionValue(var5, "getModelViewMatrix(...)");
         var10001 = (Matrix4fc)var5;
      }

      GpuBufferSlice var3 = var4.writeTransform(
         var10001,
         (Vector4fc)var1.a(IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl),
         (Vector3fc)lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         (Matrix4fc)IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
      );
      short var6 = 6827;
      short var7 = 22001;
      Intrinsics.checkNotNullExpressionValue(var3, "writeTransform(...)");
      return var3;
   }

   @JvmOverloads
   @NotNull
   public static final RenderPass a(
      @NotNull RenderTarget var0, @NotNull Supplier<String> var1, @NotNull OptionalInt var2, @NotNull OptionalDouble var3, boolean var4, boolean var5
   ) {
      Intrinsics.checkNotNullParameter(var0, "<this>");
      Intrinsics.checkNotNullParameter(var1, "labelGetter");
      Intrinsics.checkNotNullParameter(var2, "clearColor");
      Intrinsics.checkNotNullParameter(var3, "clearDepth");
      GpuTextureView var8 = RenderSystem.outputColorTextureOverride != null
         ? (var5 ? RenderSystem.outputColorTextureOverride : null)
         : var0.getColorTextureView();
      GpuTextureView var15 = RenderSystem.outputDepthTextureOverride != null
         ? (var5 ? RenderSystem.outputDepthTextureOverride : null)
         : var0.getDepthTextureView();
      RenderPass var24 = lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.a()
         .createCommandEncoder()
         .createRenderPass(var1, var8, var2, var15, var3);
      Intrinsics.checkNotNullExpressionValue(var24, "createRenderPass(...)");
      return var24;
   }

   @JvmOverloads
   @NotNull
   public static final RenderPass a(@NotNull GpuTextureView var0, @NotNull Supplier<String> var1, @NotNull OptionalInt var2, boolean var3) {
      GpuTextureView var10000;
      label20: {
         short var10001 = 6845;
         short var10002 = -27885;
         Intrinsics.checkNotNullParameter(var0, "<this>");
         var10001 = 6844;
         var10002 = -1058;
         Intrinsics.checkNotNullParameter(var1, "labelGetter");
         var10001 = 6839;
         var10002 = -6492;
         Intrinsics.checkNotNullParameter(var2, "clearColor");
         boolean var4 = IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.b();
         if (var4 && RenderSystem.outputColorTextureOverride != null) {
            GpuTextureView var8 = RenderSystem.outputColorTextureOverride;
            boolean var10 = false;
            var10000 = var3 ? var8 : null;
            if ((var3 ? var8 : null) != null) {
               break label20;
            }
         }

         var10000 = var0;
      }

      GpuTextureView var6 = var10000;
      Object var11 = null;
      OptionalDouble var13 = OptionalDouble.empty();
      short var19 = 6842;
      short var10003 = 11884;
      Intrinsics.checkNotNullExpressionValue(var13, "empty(...)");
      OptionalDouble var9 = var13;
      boolean var12 = false;
      RenderPass var14 = lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.a()
         .createCommandEncoder()
         .createRenderPass(var1, var6, var2, (GpuTextureView)var11, var9);
      var19 = 6824;
      var10003 = -15045;
      Intrinsics.checkNotNullExpressionValue(var14, "createRenderPass(...)");
      return var14;
   }

   private static final RenderPass a(Supplier<String> var0, GpuTextureView var1, OptionalInt var2, GpuTextureView var3, OptionalDouble var4) {
      boolean var5 = false;
      RenderPass var10000 = lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.a()
         .createCommandEncoder()
         .createRenderPass(var0, var1, var2, var3, var4);
      short var10002 = 6835;
      short var10003 = 20005;
      Intrinsics.checkNotNullExpressionValue(var10000, "createRenderPass(...)");
      return var10000;
   }

   @JvmOverloads
   @NotNull
   public static final GpuBufferSlice a(@Nullable Matrix4fc var0) {
      return a(var0, null);
   }

   @JvmOverloads
   @NotNull
   public static final GpuBufferSlice a() {
      return ((GpuBufferSlice)(Object)(a((RenderTarget)null, (Supplier<String>)null)));
   }

   @JvmOverloads
   @NotNull
   public static final RenderPass a(
      @NotNull RenderTarget var0, @NotNull Supplier<String> var1, @NotNull OptionalInt var2, @NotNull OptionalDouble var3, boolean var4
   ) {
      short var10001 = 6825;
      short var10002 = 32019;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 6823;
      var10002 = 27189;
      Intrinsics.checkNotNullParameter(var1, "labelGetter");
      var10001 = 6838;
      var10002 = 20695;
      Intrinsics.checkNotNullParameter(var2, "clearColor");
      var10001 = 6817;
      var10002 = 26179;
      Intrinsics.checkNotNullParameter(var3, "clearDepth");
      return a(var0, var1, var2, var3, var4, false);
   }

   @JvmOverloads
   @NotNull
   public static final RenderPass a(@NotNull RenderTarget var0, @NotNull Supplier<String> var1, @NotNull OptionalInt var2, @NotNull OptionalDouble var3) {
      short var10001 = 6845;
      short var10002 = -27885;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 6844;
      var10002 = -1058;
      Intrinsics.checkNotNullParameter(var1, "labelGetter");
      var10001 = 6839;
      var10002 = -6492;
      Intrinsics.checkNotNullParameter(var2, "clearColor");
      var10001 = 6832;
      var10002 = -8789;
      Intrinsics.checkNotNullParameter(var3, "clearDepth");
      return a(var0, var1, var2, var3, false, false);
   }

   @JvmOverloads
   @NotNull
   public static final RenderPass a(@NotNull RenderTarget var0, @NotNull Supplier<String> var1, @NotNull OptionalInt var2) {
      short var10001 = 6845;
      short var10002 = -27885;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 6844;
      var10002 = -1058;
      Intrinsics.checkNotNullParameter(var1, "labelGetter");
      var10001 = 6839;
      var10002 = -6492;
      Intrinsics.checkNotNullParameter(var2, "clearColor");
      return a(var0, var1, var2, null, false, false);
   }

   @JvmOverloads
   @NotNull
   public static final RenderPass a(@NotNull RenderTarget var0, @NotNull Supplier<String> var1) {
      short var10001 = 6845;
      short var10002 = -27885;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 6844;
      var10002 = -1058;
      Intrinsics.checkNotNullParameter(var1, "labelGetter");
      return a(var0, var1, null, null, false, false);
   }

   @JvmOverloads
   @NotNull
   public static final RenderPass a(@NotNull RenderTarget var0) {
      short var10001 = 6845;
      short var10002 = -27885;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      return a(var0, null, null, null, false, false);
   }

   @JvmOverloads
   @NotNull
   public static final RenderPass a(@NotNull GpuTextureView var0, @NotNull Supplier<String> var1, @NotNull OptionalInt var2) {
      short var10001 = 6845;
      short var10002 = -27885;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 6844;
      var10002 = -1058;
      Intrinsics.checkNotNullParameter(var1, "labelGetter");
      var10001 = 6839;
      var10002 = -6492;
      Intrinsics.checkNotNullParameter(var2, "clearColor");
      return a(var0, var1, var2, false);
   }

   @JvmOverloads
   @NotNull
   public static final RenderPass a(@NotNull GpuTextureView var0, @NotNull Supplier<String> var1) {
      short var10001 = 6845;
      short var10002 = -27885;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 6844;
      var10002 = -1058;
      Intrinsics.checkNotNullParameter(var1, "labelGetter");
      return a(var0, var1, null, false);
   }

   @JvmOverloads
   @NotNull
   public static final RenderPass a(@NotNull GpuTextureView var0) {
      short var10001 = 6845;
      short var10002 = -27885;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      return a(var0, null, null, false);
   }

   private static final String b() {
      short var10000 = 6820;
      short var10001 = -25338;
      return "Polinex RenderPass";
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[31];
      int var3 = 0;
      String var2 = "É\u009f,®\u0018VdüZÂ\u008a\nO*\\%ô¬:\u0004|I\bþ\u0011\u0082\u007f\u0096f\u0091®\b¨\u0011hî6Ð¯\u0014\u0012ÉFÐÃQX\fÏ\"gÒ\u0085\u009d×\u0007!\u0016ú\bA¨E0Gßú\u0099\u0004l \u009cÌ\u000b\u0088yMç/s\u009c\u0098¨S}\u0015rÐû§\u0006Ý\u0095:B5nøU¿®O?: \u0083;\u0006©r9=õÜ&\u0096\u000eò»\u0003&áÞÈk(á\\O\u008eÓ¨f\u0001\u0094«\u00125\u0007ÛaÔâ\u008daÃ\u0087\u0082@\u009e&\u0090Ù\u0013ì\u008c²9³\u00880\u0083Ò\u0091\u007f\u00846\u0082ÿ8#\"b\u0003\u0090\u0082$\nQ¡Õ\u0012îÙ;Fc6\u0011s\u0095\u0013eh\u0089S\f\u0091á\u0080ÆÔWo\u0083}\u0017ø\u0015?Æ¶YÌ\u0082\u0080\u0007\t\u0017¤ç)Ei\f\u0085ÙNÓ\u008d\n\u0085u\u0005ÎßÑ_«Ð¼\nÉ\u0004Ó6Y\u0083k;~\u0092\u000eVÕv·\u00998\u009dªÂ\u000e\u0002\u0090cg\u0015G&]yÒ\u0006\u000fA\u0011Z\u0004\u0015\u0018\u0002\u0007ø\nÌ\u0086]ï\u000e\\Ãª¤?ù§ÝªþåK?µ\fî¾È\u008a\u0084Òâo&ÝyË\nðq«N\nÆï²\u0096\u001a\nÏ\u008bL\u0011ö-pÏeµ\tõÊA\u007f|s|í:\u0004TÔ\u009bR\n\u0011RD\u001eK\u0010ì,Þ\u0098\u0007ÙQ$I£j·\u000b\u009b|/Gcg\u0015\u001a\u0099\u0003[";
      int var4 = "É\u009f,®\u0018VdüZÂ\u008a\nO*\\%ô¬:\u0004|I\bþ\u0011\u0082\u007f\u0096f\u0091®\b¨\u0011hî6Ð¯\u0014\u0012ÉFÐÃQX\fÏ\"gÒ\u0085\u009d×\u0007!\u0016ú\bA¨E0Gßú\u0099\u0004l \u009cÌ\u000b\u0088yMç/s\u009c\u0098¨S}\u0015rÐû§\u0006Ý\u0095:B5nøU¿®O?: \u0083;\u0006©r9=õÜ&\u0096\u000eò»\u0003&áÞÈk(á\\O\u008eÓ¨f\u0001\u0094«\u00125\u0007ÛaÔâ\u008daÃ\u0087\u0082@\u009e&\u0090Ù\u0013ì\u008c²9³\u00880\u0083Ò\u0091\u007f\u00846\u0082ÿ8#\"b\u0003\u0090\u0082$\nQ¡Õ\u0012îÙ;Fc6\u0011s\u0095\u0013eh\u0089S\f\u0091á\u0080ÆÔWo\u0083}\u0017ø\u0015?Æ¶YÌ\u0082\u0080\u0007\t\u0017¤ç)Ei\f\u0085ÙNÓ\u008d\n\u0085u\u0005ÎßÑ_«Ð¼\nÉ\u0004Ó6Y\u0083k;~\u0092\u000eVÕv·\u00998\u009dªÂ\u000e\u0002\u0090cg\u0015G&]yÒ\u0006\u000fA\u0011Z\u0004\u0015\u0018\u0002\u0007ø\nÌ\u0086]ï\u000e\\Ãª¤?ù§ÝªþåK?µ\fî¾È\u008a\u0084Òâo&ÝyË\nðq«N\nÆï²\u0096\u001a\nÏ\u008bL\u0011ö-pÏeµ\tõÊA\u007f|s|í:\u0004TÔ\u009bR\n\u0011RD\u001eK\u0010ì,Þ\u0098\u0007ÙQ$I£j·\u000b\u009b|/Gcg\u0015\u001a\u0099\u0003["
         .length();
      char var1 = 11;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 49;
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
                     case 0 -> 61;
                     case 1 -> 52;
                     case 2 -> 111;
                     case 3 -> 113;
                     case 4 -> 62;
                     case 5 -> 56;
                     default -> 45;
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
                     b = new String[31];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new Vector4f(1.0F);
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new Vector3f();
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new Matrix4f();
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = lIIIIIlllIlllllIlIllIlIlIIIlIlIlllIllllllIIlIlIIlIIlllIlIllIllllllIllIIIIIllllIIIlIIl::b;
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

                  var2 = "\u0091P\u0001FÍ\u008c\nEÓñ\u0011ÂÎâÈ ;";
                  var4 = "\u0091P\u0001FÍ\u008c\nEÓñ\u0011ÂÎâÈ ;".length();
                  var1 = 6;
                  var8 = -1;
            }

            var10000 = 9;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }


   @Nullable
   public static GpuBufferSlice a(
      @Nullable Matrix4fc var0, @NotNull llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1, int var2, @Nullable Object var3
   ) {
      if ((var2 & 1) != 0) {
         var0 = null;
      }

      if ((var2 & 2) != 0) {
         var1 = me.octo.client.llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      return a(var0, var1);
   }

   public static RenderPass a(
      RenderTarget var0, Supplier var1, OptionalInt var2, OptionalDouble var3, boolean var4, boolean var5, int var6, Object var7
   ) {
      if ((var6 & 1) != 0) {
         var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      if ((var6 & 2) != 0) {
         var2 = OptionalInt.empty();
      }

      if ((var6 & 4) != 0) {
         var3 = OptionalDouble.empty();
      }

      if ((var6 & 8) != 0) {
         var4 = true;
      }

      if ((var6 & 16) != 0) {
         var5 = false;
      }

      return a(var0, var1, var2, var3, var4, var5);
   }

   public static RenderPass a(
      GpuTextureView var0, Supplier var1, OptionalInt var2, boolean var3, int var4, Object var5
   ) {
      if ((var4 & 1) != 0) {
         var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      if ((var4 & 2) != 0) {
         var2 = OptionalInt.empty();
      }

      if ((var4 & 4) != 0) {
         var3 = false;
      }

      return a(var0, var1, var2, var3);
   }

   static RenderPass a(
      Supplier var0, GpuTextureView var1, OptionalInt var2, GpuTextureView var3, OptionalDouble var4, int var5, Object var6
   ) {
      if ((var5 & 1) != 0) {
         var0 = c();
      }

      if ((var5 & 4) != 0) {
         var2 = OptionalInt.empty();
      }

      if ((var5 & 8) != 0) {
         var3 = null;
      }

      if ((var5 & 16) != 0) {
         var4 = OptionalDouble.empty();
      }

      return a(var0, var1, var2, var3, var4);
   }

   @NotNull
   public static final Supplier<String> c() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 6816) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 188;
            case 1 -> 175;
            case 2 -> 155;
            case 3 -> 144;
            case 4 -> 63;
            case 5 -> 211;
            case 6 -> 205;
            case 7 -> 66;
            case 8 -> 198;
            case 9 -> 128;
            case 10 -> 19;
            case 11 -> 29;
            case 12 -> 126;
            case 13 -> 136;
            case 14 -> 17;
            case 15 -> 158;
            case 16 -> 103;
            case 17 -> 147;
            case 18 -> 235;
            case 19 -> 105;
            case 20 -> 32;
            case 21 -> 145;
            case 22 -> 2;
            case 23 -> 108;
            case 24 -> 232;
            case 25 -> 239;
            case 26 -> 214;
            case 27 -> 142;
            case 28 -> 55;
            case 29 -> 244;
            case 30 -> 206;
            case 31 -> 222;
            case 32 -> 229;
            case 33 -> 186;
            case 34 -> 31;
            case 35 -> 217;
            case 36 -> 68;
            case 37 -> 233;
            case 38 -> 236;
            case 39 -> 11;
            case 40 -> 134;
            case 41 -> 53;
            case 42 -> 156;
            case 43 -> 44;
            case 44 -> 160;
            case 45 -> 25;
            case 46 -> 197;
            case 47 -> 27;
            case 48 -> 118;
            case 49 -> 248;
            case 50 -> 202;
            case 51 -> 130;
            case 52 -> 201;
            case 53 -> 52;
            case 54 -> 112;
            case 55 -> 76;
            case 56 -> 127;
            case 57 -> 189;
            case 58 -> 143;
            case 59 -> 219;
            case 60 -> 125;
            case 61 -> 249;
            case 62 -> 226;
            case 63 -> 220;
            case 64 -> 250;
            case 65 -> 138;
            case 66 -> 24;
            case 67 -> 35;
            case 68 -> 181;
            case 69 -> 213;
            case 70 -> 177;
            case 71 -> 195;
            case 72 -> 39;
            case 73 -> 69;
            case 74 -> 178;
            case 75 -> 253;
            case 76 -> 14;
            case 77 -> 252;
            case 78 -> 110;
            case 79 -> 152;
            case 80 -> 169;
            case 81 -> 191;
            case 82 -> 21;
            case 83 -> 7;
            case 84 -> 176;
            case 85 -> 48;
            case 86 -> 241;
            case 87 -> 149;
            case 88 -> 179;
            case 89 -> 51;
            case 90 -> 16;
            case 91 -> 101;
            case 92 -> 131;
            case 93 -> 137;
            case 94 -> 151;
            case 95 -> 107;
            case 96 -> 88;
            case 97 -> 67;
            case 98 -> 165;
            case 99 -> 42;
            case 100 -> 192;
            case 101 -> 78;
            case 102 -> 247;
            case 103 -> 15;
            case 104 -> 100;
            case 105 -> 64;
            case 106 -> 99;
            case 107 -> 57;
            case 108 -> 135;
            case 109 -> 13;
            case 110 -> 1;
            case 111 -> 170;
            case 112 -> 33;
            case 113 -> 6;
            case 114 -> 93;
            case 115 -> 184;
            case 116 -> 129;
            case 117 -> 97;
            case 118 -> 121;
            case 119 -> 200;
            case 120 -> 8;
            case 121 -> 164;
            case 122 -> 171;
            case 123 -> 73;
            case 124 -> 95;
            case 125 -> 207;
            case 126 -> 30;
            case 127 -> 75;
            case 128 -> 163;
            case 129 -> 9;
            case 130 -> 87;
            case 131 -> 240;
            case 132 -> 77;
            case 133 -> 102;
            case 134 -> 221;
            case 135 -> 157;
            case 136 -> 0;
            case 137 -> 193;
            case 138 -> 115;
            case 139 -> 3;
            case 140 -> 166;
            case 141 -> 251;
            case 142 -> 150;
            case 143 -> 70;
            case 144 -> 91;
            case 145 -> 153;
            case 146 -> 28;
            case 147 -> 89;
            case 148 -> 109;
            case 149 -> 58;
            case 150 -> 183;
            case 151 -> 227;
            case 152 -> 85;
            case 153 -> 72;
            case 154 -> 20;
            case 155 -> 94;
            case 156 -> 231;
            case 157 -> 37;
            case 158 -> 196;
            case 159 -> 116;
            case 160 -> 119;
            case 161 -> 161;
            case 162 -> 117;
            case 163 -> 49;
            case 164 -> 246;
            case 165 -> 122;
            case 166 -> 71;
            case 167 -> 208;
            case 168 -> 210;
            case 169 -> 12;
            case 170 -> 234;
            case 171 -> 81;
            case 172 -> 194;
            case 173 -> 185;
            case 174 -> 154;
            case 175 -> 159;
            case 176 -> 80;
            case 177 -> 123;
            case 178 -> 50;
            case 179 -> 22;
            case 180 -> 46;
            case 181 -> 167;
            case 182 -> 82;
            case 183 -> 45;
            case 184 -> 218;
            case 185 -> 254;
            case 186 -> 10;
            case 187 -> 59;
            case 188 -> 237;
            case 189 -> 60;
            case 190 -> 96;
            case 191 -> 40;
            case 192 -> 5;
            case 193 -> 83;
            case 194 -> 74;
            case 195 -> 4;
            case 196 -> 224;
            case 197 -> 113;
            case 198 -> 41;
            case 199 -> 146;
            case 200 -> 86;
            case 201 -> 132;
            case 202 -> 65;
            case 203 -> 114;
            case 204 -> 47;
            case 205 -> 174;
            case 206 -> 62;
            case 207 -> 106;
            case 208 -> 34;
            case 209 -> 92;
            case 210 -> 212;
            case 211 -> 242;
            case 212 -> 173;
            case 213 -> 61;
            case 214 -> 139;
            case 215 -> 255;
            case 216 -> 216;
            case 217 -> 199;
            case 218 -> 23;
            case 219 -> 230;
            case 220 -> 180;
            case 221 -> 120;
            case 222 -> 38;
            case 223 -> 111;
            case 224 -> 90;
            case 225 -> 225;
            case 226 -> 228;
            case 227 -> 36;
            case 228 -> 238;
            case 229 -> 245;
            case 230 -> 140;
            case 231 -> 172;
            case 232 -> 190;
            case 233 -> 104;
            case 234 -> 18;
            case 235 -> 203;
            case 236 -> 124;
            case 237 -> 187;
            case 238 -> 223;
            case 239 -> 84;
            case 240 -> 148;
            case 241 -> 209;
            case 242 -> 26;
            case 243 -> 168;
            case 244 -> 43;
            case 245 -> 98;
            case 246 -> 54;
            case 247 -> 243;
            case 248 -> 162;
            case 249 -> 215;
            case 250 -> 79;
            case 251 -> 141;
            case 252 -> 56;
            case 253 -> 204;
            case 254 -> 182;
            default -> 133;
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
