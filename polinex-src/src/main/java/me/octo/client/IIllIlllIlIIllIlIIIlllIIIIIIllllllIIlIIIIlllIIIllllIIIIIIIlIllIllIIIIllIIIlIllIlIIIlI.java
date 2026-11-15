package me.octo.client;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.MeshData;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.Tesselator;
import com.mojang.blaze3d.vertex.VertexConsumer;
import java.util.IdentityHashMap;
import java.util.Map;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.utils.lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII;
import net.minecraft.client.Camera;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.core.Position;
import net.minecraft.core.Vec3i;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI {
   public static <T> T a(Object p0, Object p1, Object p2) { return null; } // PX-FIX ovld

   @NotNull
   public static IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final RenderTarget lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final PoseStack IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private final Camera lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private final IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private final boolean IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @Nullable
   private IdentityHashMap<BufferBuilder, IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl> lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private static PoseStack IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private static IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private static lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII<IdentityHashMap<BufferBuilder, IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl>> lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @Nullable
   private static IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static String[] a;
   private static String[] b;

   // PX-FIX R2 class-level backfill: jar members missing from source (descriptors verified against jar)
   public static void e() {
   }

   @NotNull
   public static final PoseStack i() {
      return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   @NotNull
   public static final IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI j() {
      return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   @Nullable
   public static final IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI k() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   public static final void a(@Nullable IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var0) {
      lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var0;
   }

   public static VertexConsumer a(IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI var0, RenderPipeline var1, Map var2, Map var3, int var4, Object var5) {
      PXEvMid.c();
      if ((var4 & 2) != 0) {
         var2 = kotlin.collections.MapsKt.emptyMap();
      }

      if ((var4 & 4) != 0) {
         var3 = kotlin.collections.MapsKt.emptyMap();
      }

      return var0.a(var1, var2, var3);
   }

   public static void a(IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI var0, VertexConsumer var1, boolean var2, int var3, Object var4) {
      PXEvMid.c();
      if ((var3 & 2) != 0) {
         var2 = true;
      }

      var0.a(var1, var2);
   }

   public IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI(
      @NotNull RenderTarget var1,
      @NotNull PoseStack var2,
      @NotNull Camera var3,
      @NotNull IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI var4,
      boolean var5
   ) {
      short var10001 = -6282;
      short var10002 = 4816;
      Intrinsics.checkNotNullParameter(var1, "renderTarget");
      var10001 = -6278;
      var10002 = -22297;
      Intrinsics.checkNotNullParameter(var2, "poseStack");
      var10001 = -6287;
      var10002 = -7333;
      Intrinsics.checkNotNullParameter(var3, "camera");
      var10001 = -6298;
      var10002 = 9678;
      Intrinsics.checkNotNullParameter(var4, "batchCollector");
      super();
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var2;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var3;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var4;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var5;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public final RenderTarget a() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final PoseStack b() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public final Camera c() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @NotNull
   public final IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl d() {
      return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   public final void a(@NotNull IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl var1) {
      short var10001 = -6280;
      short var10002 = 10572;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var1;
   }

   @NotNull
   public final Vec3 a(@NotNull lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII var1) {
      short var10001 = -6277;
      short var10002 = 27122;
      Intrinsics.checkNotNullParameter(var1, "pos");
      return lIllIIlIIIIIlllIllIlIIIlIIIlIIlIIlIIIIlIllIIIlIIlllIllIIlIlIlllIlIlllIlllIIIIlIIIIlII.b(
         var1, this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
      );
   }

   @NotNull
   public final Vec3 a(@NotNull Position var1) {
      short var10001 = -6274;
      short var10002 = 28771;
      Intrinsics.checkNotNullParameter(var1, "pos");
      return lIllIIlIIIIIlllIllIlIIIlIIIlIIlIIlIIIIlIllIIIlIIlllIllIIlIlIlllIlIlllIlllIIIIlIIIIlII.b(
         var1, this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
      );
   }

   @NotNull
   public final Vec3 a(@NotNull Vec3i var1) {
      short var10001 = -6274;
      short var10002 = 28771;
      Intrinsics.checkNotNullParameter(var1, "pos");
      return lIllIIlIIIIIlllIllIlIIIlIIIlIIlIIlIIIIlIllIIIlIIlllIllIIlIlIlllIlIlllIlllIIIIlIIIIlII.b(
         var1, this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
      );
   }

   public final void a(@NotNull Function1<? super IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI, Unit> var1) {
      short var10001 = -6284;
      short var10002 = 4523;
      Intrinsics.checkNotNullParameter(var1, "block");
      boolean var2 = false;
      IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI var3 = this;
      IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl var4 = IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      boolean var5 = false;
      IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl var6 = this.d();
      this.a(var4);

      try {
         var1.invoke(var3);
      } finally {
         InlineMarker.finallyStart(1);
         this.a(var6);
         InlineMarker.finallyEnd(1);
      }
   }

   public final void b(@NotNull Function1<? super IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI, Unit> var1) {
      short var10001 = -6288;
      short var10002 = 25445;
      Intrinsics.checkNotNullParameter(var1, "block");
      boolean var2 = false;
      IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI var3 = this;
      IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl var4 = IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var5 = false;
      IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl var6 = this.d();
      this.a(var4);

      try {
         var1.invoke(var3);
      } finally {
         InlineMarker.finallyStart(1);
         this.a(var6);
         InlineMarker.finallyEnd(1);
      }
   }

   @NotNull
   public final VertexConsumer a(@NotNull RenderPipeline var1, @NotNull Map<String, ? extends AbstractTexture> var2, @NotNull Map<String, GpuBufferSlice> var3) {
      Object var18 = null; // PX-FIX
      boolean var4;
      IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl var5;
      boolean var15;
      label30: {
         var15 = IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.c();
         short var10002 = -6285;
         short var10003 = 23308;
         Intrinsics.checkNotNullParameter(var1, "pipeline");
         var4 = var15;
         short var10001 = -6276;
         var10002 = 3894;
         Intrinsics.checkNotNullParameter(var2, "textures");
         var10001 = -6279;
         var10002 = -29040;
         Intrinsics.checkNotNullParameter(var3, "uniforms");
         var5 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.a(var1, var2, var3);
         if (this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
            == IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )
          {
            var15 = lIllIIlIIIIIlllIllIlIIIlIIIlIIlIIlIIIIlIllIIIlIIlllIllIIlIlIlllIlIlllIlllIIIIlIIIIlII.b(var1);
            if (var4) {
               break label30;
            }

            if (!var15) {
               var15 = true;
               break label30;
            }
         }

         var15 = false;
      }

      boolean var6 = var15;
      if (var6) {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.a(var5);
      } else {
         BufferBuilder var7;
         label22: {
            Tesselator var16 = Tesselator.getInstance();
            short var22 = -6299;
            short var24 = 24656;
            Intrinsics.checkNotNullExpressionValue(var16, "getInstance(...)");
            Tesselator var8 = var16;
            boolean var10 = false;
            BufferBuilder var17 = var8.begin(var1.getVertexFormatMode(), var1.getVertexFormat());
            var22 = -6297;
            var24 = 31035;
            Intrinsics.checkNotNullExpressionValue(var17, "begin(...)");
            var7 = var17;
            var18 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
            if (!var4) {
               if (this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll != null) {
                  break label22;
               }

               var18 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.a();
            }

            Object var14 = var18;
            IdentityHashMap var11 = (IdentityHashMap)var14;
            boolean var12 = false;
            this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var11;
            var18 = (IdentityHashMap)var14;
         }

         Object var13 = var18;
         ((Map)var13).put(var7, var5);
         return var7;
      }
   }

   public final void a(@NotNull VertexConsumer param1, boolean param2) {
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "consumer");
      com.mojang.blaze3d.vertex.BufferBuilder var4 = param1 instanceof com.mojang.blaze3d.vertex.BufferBuilder ? (com.mojang.blaze3d.vertex.BufferBuilder) param1 : null;
      if (var4 == null) {
         return;
      }
      java.util.IdentityHashMap var5 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      if (var5 == null) {
         return;
      }
      me.octo.client.IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl var6 = (me.octo.client.IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl) var5.remove(var4);
      if (var6 == null) {
         return;
      }
      if (var5.isEmpty()) {
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = null;
         me.octo.client.IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.a(var5);
      }
      if (param2) {
         com.mojang.blaze3d.vertex.MeshData var7 = var4.build();
         try {
            this.a(var6, var7);
         } finally {
            kotlin.jdk7.AutoCloseableKt.closeFinally(var7, (java.lang.Throwable) null);
         }
      }
   }

   @PublishedApi
   public final void f() {
      boolean var1 = IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.b();
      IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI var10000 = this;
      if (var1) {
         if (this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
            return;
         }

         var10000 = this;
      }

      IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.a(
         var10000.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         null);
   }

   @PublishedApi
   public final void a(
      @NotNull IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl var1,
      @NotNull Function1<? super IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI, Unit> var2
   ) {
      short var10001 = -6275;
      short var10002 = 6173;
      Intrinsics.checkNotNullParameter(var1, "mode");
      var10001 = -6284;
      var10002 = 4523;
      Intrinsics.checkNotNullParameter(var2, "block");
      boolean var3 = false;
      IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl var4 = this.d();
      this.a(var1);

      try {
         var2.invoke(this);
      } finally {
         InlineMarker.finallyStart(1);
         this.a(var4);
         InlineMarker.finallyEnd(1);
      }
   }

   private final void a(IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl param1, MeshData param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()Z
      // 003: aconst_null
      // 004: aconst_null
      // 005: bipush 3
      // 006: aconst_null
      // 007: invokestatic me/octo/client/lIIIIIlllIlllllIlIllIlIlIIIlIlIlllIllllllIIlIlIIlIIlllIlIllIllllllIllIIIIIllllIIIlIIl.a (Lorg/joml/Matrix4fc;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;ILjava/lang/Object;)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;
      // 00a: astore 4
      // 00c: getstatic me/octo/client/lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 00f: aload 2
      // 010: aload 1
      // 011: invokevirtual me/octo/client/IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl.a ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
      // 014: aconst_null
      // 015: aconst_null
      // 016: bipush 6
      // 018: aconst_null
      // 019: invokestatic me/octo/client/lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lme/octo/client/lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;Lcom/mojang/blaze3d/vertex/MeshData;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Ljava/util/function/Function;Ljava/util/function/Function;ILjava/lang/Object;)Lme/octo/client/lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII;
      // 01c: astore 5
      // 01e: aload 0
      // 01f: getfield me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lcom/mojang/blaze3d/pipeline/RenderTarget;
      // 022: invokedynamic get ()Ljava/util/function/Supplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.g ()Ljava/lang/String;, ()Ljava/lang/String; ]
      // 027: aconst_null
      // 028: aconst_null
      // 029: bipush 0
      // 02a: bipush 1
      // 02b: bipush 14
      // 02d: aconst_null
      // 02e: invokestatic me/octo/client/lIIIIIlllIlllllIlIllIlIlIIIlIlIlllIllllllIIlIlIIlIIlllIlIllIllllllIllIIIIIllllIIIlIIl.a (Lcom/mojang/blaze3d/pipeline/RenderTarget;Ljava/util/function/Supplier;Ljava/util/OptionalInt;Ljava/util/OptionalDouble;ZZILjava/lang/Object;)Lcom/mojang/blaze3d/systems/RenderPass;
      // 031: checkcast java/lang/AutoCloseable
      // 034: astore 6
      // 036: aconst_null
      // 037: astore 7
      // 039: istore 3
      // 03a: nop
      // 03b: aload 6
      // 03d: checkcast com/mojang/blaze3d/systems/RenderPass
      // 040: astore 8
      // 042: bipush 0
      // 043: istore 9
      // 045: aload 8
      // 047: astore 10
      // 049: bipush 0
      // 04a: istore 11
      // 04c: invokestatic com/mojang/blaze3d/systems/RenderSystem.getScissorStateForRenderTypeDraws ()Lcom/mojang/blaze3d/systems/ScissorState;
      // 04f: dup
      // 050: sipush -6273
      // 053: sipush -11491
      // 056: pop2
      // 057: ldc_w "getScissorStateForRenderTypeDraws(...)"
      // 05a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 05d: astore 12
      // 05f: aload 12
      // 061: invokevirtual com/mojang/blaze3d/systems/ScissorState.enabled ()Z
      // 064: iload 3
      // 065: ifne 098
      // 068: ifeq 092
      // 06b: goto 072
      // 06e: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 071: athrow
      // 072: aload 10
      // 074: aload 12
      // 076: invokevirtual com/mojang/blaze3d/systems/ScissorState.x ()I
      // 079: aload 12
      // 07b: invokevirtual com/mojang/blaze3d/systems/ScissorState.y ()I
      // 07e: aload 12
      // 080: invokevirtual com/mojang/blaze3d/systems/ScissorState.width ()I
      // 083: aload 12
      // 085: invokevirtual com/mojang/blaze3d/systems/ScissorState.height ()I
      // 088: invokevirtual com/mojang/blaze3d/systems/RenderPass.enableScissor (IIII)V
      // 08b: goto 092
      // 08e: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 091: athrow
      // 092: nop
      // 093: aload 8
      // 095: astore 10
      // 097: bipush 0
      // 098: istore 11
      // 09a: aload 10
      // 09c: invokestatic com/mojang/blaze3d/systems/RenderSystem.bindDefaultUniforms (Lcom/mojang/blaze3d/systems/RenderPass;)V
      // 09f: aload 8
      // 0a1: astore 10
      // 0a3: aload 4
      // 0a5: astore 11
      // 0a7: bipush 0
      // 0a8: istore 12
      // 0aa: aload 10
      // 0ac: sipush -6286
      // 0af: sipush 12600
      // 0b2: pop2
      // 0b3: ldc_w "DynamicTransforms"
      // 0b6: aload 11
      // 0b8: invokevirtual com/mojang/blaze3d/systems/RenderPass.setUniform (Ljava/lang/String;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V
      // 0bb: nop
      // 0bc: aload 8
      // 0be: astore 10
      // 0c0: aload 1
      // 0c1: invokevirtual me/octo/client/IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl.c ()Ljava/util/Map;
      // 0c4: astore 11
      // 0c6: bipush 0
      // 0c7: istore 12
      // 0c9: aload 11
      // 0cb: astore 13
      // 0cd: bipush 0
      // 0ce: istore 14
      // 0d0: aload 13
      // 0d2: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 0d7: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0dc: astore 15
      // 0de: aload 15
      // 0e0: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0e5: ifeq 124
      // 0e8: aload 15
      // 0ea: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0ef: checkcast java/util/Map$Entry
      // 0f2: astore 16
      // 0f4: aload 16
      // 0f6: astore 17
      // 0f8: bipush 0
      // 0f9: istore 18
      // 0fb: aload 10
      // 0fd: aload 17
      // 0ff: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 104: checkcast java/lang/String
      // 107: aload 17
      // 109: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 10e: checkcast com/mojang/blaze3d/buffers/GpuBufferSlice
      // 111: invokevirtual com/mojang/blaze3d/systems/RenderPass.setUniform (Ljava/lang/String;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V
      // 114: nop
      // 115: iload 3
      // 116: ifne 143
      // 119: iload 3
      // 11a: ifeq 0de
      // 11d: goto 124
      // 120: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 123: athrow
      // 124: nop
      // 125: nop
      // 126: aload 8
      // 128: aload 1
      // 129: invokevirtual me/octo/client/IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl.a ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
      // 12c: invokevirtual com/mojang/blaze3d/systems/RenderPass.setPipeline (Lcom/mojang/blaze3d/pipeline/RenderPipeline;)V
      // 12f: aload 8
      // 131: astore 10
      // 133: aload 1
      // 134: invokevirtual me/octo/client/IIIIIlIllIlIllIIIlllIlIlllIllIlIIllllllIlIIIlllllllIIllIlIlllllIlIlIIIIlIllIllIIlIlIl.b ()Ljava/util/Map;
      // 137: astore 11
      // 139: bipush 0
      // 13a: istore 12
      // 13c: aload 11
      // 13e: astore 13
      // 140: bipush 0
      // 141: istore 14
      // 143: aload 13
      // 145: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 14a: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 14f: astore 15
      // 151: aload 15
      // 153: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 158: ifeq 1d4
      // 15b: aload 15
      // 15d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 162: checkcast java/util/Map$Entry
      // 165: astore 16
      // 167: aload 16
      // 169: astore 17
      // 16b: bipush 0
      // 16c: istore 18
      // 16e: aload 10
      // 170: astore 19
      // 172: aload 17
      // 174: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 179: checkcast java/lang/String
      // 17c: astore 20
      // 17e: aload 17
      // 180: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 185: checkcast net/minecraft/client/renderer/texture/AbstractTexture
      // 188: astore 21
      // 18a: bipush 0
      // 18b: istore 22
      // 18d: iload 3
      // 18e: ifne 1e1
      // 191: aload 19
      // 193: aload 20
      // 195: iload 3
      // 196: ifne 1b8
      // 199: goto 1a0
      // 19c: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19f: athrow
      // 1a0: aload 21
      // 1a2: dup
      // 1a3: ifnull 1b7
      // 1a6: goto 1ad
      // 1a9: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ac: athrow
      // 1ad: invokevirtual net/minecraft/client/renderer/texture/AbstractTexture.getTextureView ()Lcom/mojang/blaze3d/textures/GpuTextureView;
      // 1b0: goto 1b9
      // 1b3: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b6: athrow
      // 1b7: pop
      // 1b8: aconst_null
      // 1b9: aload 21
      // 1bb: dup
      // 1bc: ifnull 1c9
      // 1bf: invokevirtual net/minecraft/client/renderer/texture/AbstractTexture.getSampler ()Lcom/mojang/blaze3d/textures/GpuSampler;
      // 1c2: goto 1cb
      // 1c5: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c8: athrow
      // 1c9: pop
      // 1ca: aconst_null
      // 1cb: invokevirtual com/mojang/blaze3d/systems/RenderPass.bindTexture (Ljava/lang/String;Lcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/textures/GpuSampler;)V
      // 1ce: nop
      // 1cf: nop
      // 1d0: iload 3
      // 1d1: ifeq 151
      // 1d4: nop
      // 1d5: nop
      // 1d6: getstatic me/octo/client/lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 1d9: aload 8
      // 1db: aload 5
      // 1dd: invokevirtual me/octo/client/lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lcom/mojang/blaze3d/systems/RenderPass;Lme/octo/client/lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII;)V
      // 1e0: nop
      // 1e1: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 1e4: astore 8
      // 1e6: aload 6
      // 1e8: aload 7
      // 1ea: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 1ed: goto 205
      // 1f0: astore 9
      // 1f2: aload 9
      // 1f4: astore 7
      // 1f6: aload 9
      // 1f8: athrow
      // 1f9: astore 9
      // 1fb: aload 6
      // 1fd: aload 7
      // 1ff: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 202: aload 9
      // 204: athrow
      // 205: return
   }

   private static final String g() {
      short var10000 = -6281;
      short var10001 = 16866;
      return "WorldRenderEnvironment Immediate draw";
   }

   @JvmStatic
   public static final void a(@NotNull RenderTarget var0, @NotNull PoseStack var1, @NotNull Camera var2) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0, var1, var2);
   }

   @JvmStatic
   public static final void h() {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a();
   }

   @JvmStatic
   @PublishedApi
   @NotNull
   public static final IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI b(
      @NotNull RenderTarget var0, @NotNull PoseStack var1, @NotNull Camera var2
   ) {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var0, var1, var2);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[19];
      int var3 = 0;
      String var2 = ">¬Sy½?ñ`\u0001\u0091¸1ævç\u0096\u008c\u0082ñ5[êzµ\u00044\u0086é\u0081&[î>ÓZ\u0002\u0092\fjtD!Á\u001dn\u000fó\u0090%b\bùo\u0005\u001eù\u0010JA\u0005\u00921H¦o\bèåH\u009f\u0094ðÖÎ\u0011§Î\rìà\u001at¢a°|§éM\u0014Ô\u0096\u0006\u001eÏúÓbq\u0005Ù\u009e!SB&}þ\u000bGw\u001bY¥Ë\u0080ª×®¿\fÙ|ÅÐB§\u0014 C\u008b¢|¬D¼~Þ~É7Ë±à\u0003sT8\u0004ßi\u0004È\bßj\"òÉuL\u0010\u0003a\u008cz\t»¨!ðå\u0000/hQ\bÈ\u009eð\u0014ºùs\u0081\u0007¯\u0088pze)Ñ\n\u0083\u0011b\u0080&ß\u0082\t\u0007¸";
      int var4 = ">¬Sy½?ñ`\u0001\u0091¸1ævç\u0096\u008c\u0082ñ5[êzµ\u00044\u0086é\u0081&[î>ÓZ\u0002\u0092\fjtD!Á\u001dn\u000fó\u0090%b\bùo\u0005\u001eù\u0010JA\u0005\u00921H¦o\bèåH\u009f\u0094ðÖÎ\u0011§Î\rìà\u001at¢a°|§éM\u0014Ô\u0096\u0006\u001eÏúÓbq\u0005Ù\u009e!SB&}þ\u000bGw\u001bY¥Ë\u0080ª×®¿\fÙ|ÅÐB§\u0014 C\u008b¢|¬D¼~Þ~É7Ë±à\u0003sT8\u0004ßi\u0004È\bßj\"òÉuL\u0010\u0003a\u008cz\t»¨!ðå\u0000/hQ\bÈ\u009eð\u0014ºùs\u0081\u0007¯\u0088pze)Ñ\n\u0083\u0011b\u0080&ß\u0082\t\u0007¸"
         .length();
      char var1 = '%';
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
                     case 0 -> 53;
                     case 1 -> 126;
                     case 2 -> 88;
                     case 3 -> 104;
                     case 4 -> 33;
                     case 5 -> 11;
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
                     a = var5;
                     b = new String[19];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid(
                        (Object[]) null
                     );
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new PoseStack();
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI();
                     lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII(
                        (kotlin.jvm.functions.Function0<java.util.IdentityHashMap>) java.util.IdentityHashMap::new,
                        (kotlin.jvm.functions.Function1<java.util.IdentityHashMap, kotlin.Unit>) o -> { o.clear(); return kotlin.Unit.INSTANCE; }
                     );
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

                  var2 = "¼\u008dÀËSÀýø\u0095\u0096d¶\u0019Ã\u0010\u0097®\u0000\u0001MÆã\u0003,C\u0017\u0096ðL|\u008f";
                  var4 = "¼\u008dÀËSÀýø\u0095\u0096d¶\u0019Ã\u0010\u0097®\u0000\u0001MÆã\u0003,C\u0017\u0096ðL|\u008f".length();
                  var1 = 14;
                  var8 = -1;
            }

            var10000 = 124;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static Throwable a(Throwable var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -6281) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 90;
            case 1 -> 159;
            case 2 -> 67;
            case 3 -> 66;
            case 4 -> 34;
            case 5 -> 82;
            case 6 -> 112;
            case 7 -> 131;
            case 8 -> 222;
            case 9 -> 152;
            case 10 -> 104;
            case 11 -> 78;
            case 12 -> 46;
            case 13 -> 58;
            case 14 -> 137;
            case 15 -> 185;
            case 16 -> 170;
            case 17 -> 212;
            case 18 -> 15;
            case 19 -> 191;
            case 20 -> 142;
            case 21 -> 127;
            case 22 -> 217;
            case 23 -> 174;
            case 24 -> 202;
            case 25 -> 199;
            case 26 -> 146;
            case 27 -> 124;
            case 28 -> 98;
            case 29 -> 12;
            case 30 -> 164;
            case 31 -> 73;
            case 32 -> 96;
            case 33 -> 26;
            case 34 -> 215;
            case 35 -> 54;
            case 36 -> 125;
            case 37 -> 140;
            case 38 -> 113;
            case 39 -> 161;
            case 40 -> 25;
            case 41 -> 245;
            case 42 -> 91;
            case 43 -> 75;
            case 44 -> 255;
            case 45 -> 190;
            case 46 -> 14;
            case 47 -> 254;
            case 48 -> 221;
            case 49 -> 4;
            case 50 -> 219;
            case 51 -> 110;
            case 52 -> 97;
            case 53 -> 136;
            case 54 -> 68;
            case 55 -> 49;
            case 56 -> 7;
            case 57 -> 83;
            case 58 -> 129;
            case 59 -> 194;
            case 60 -> 232;
            case 61 -> 87;
            case 62 -> 108;
            case 63 -> 29;
            case 64 -> 0;
            case 65 -> 145;
            case 66 -> 220;
            case 67 -> 48;
            case 68 -> 10;
            case 69 -> 167;
            case 70 -> 242;
            case 71 -> 28;
            case 72 -> 214;
            case 73 -> 71;
            case 74 -> 248;
            case 75 -> 36;
            case 76 -> 53;
            case 77 -> 243;
            case 78 -> 239;
            case 79 -> 148;
            case 80 -> 123;
            case 81 -> 209;
            case 82 -> 121;
            case 83 -> 225;
            case 84 -> 111;
            case 85 -> 13;
            case 86 -> 238;
            case 87 -> 94;
            case 88 -> 102;
            case 89 -> 154;
            case 90 -> 168;
            case 91 -> 99;
            case 92 -> 118;
            case 93 -> 160;
            case 94 -> 95;
            case 95 -> 47;
            case 96 -> 30;
            case 97 -> 195;
            case 98 -> 32;
            case 99 -> 128;
            case 100 -> 107;
            case 101 -> 9;
            case 102 -> 206;
            case 103 -> 178;
            case 104 -> 50;
            case 105 -> 229;
            case 106 -> 89;
            case 107 -> 132;
            case 108 -> 196;
            case 109 -> 144;
            case 110 -> 227;
            case 111 -> 119;
            case 112 -> 86;
            case 113 -> 43;
            case 114 -> 247;
            case 115 -> 64;
            case 116 -> 17;
            case 117 -> 133;
            case 118 -> 114;
            case 119 -> 79;
            case 120 -> 141;
            case 121 -> 184;
            case 122 -> 182;
            case 123 -> 72;
            case 124 -> 233;
            case 125 -> 51;
            case 126 -> 63;
            case 127 -> 22;
            case 128 -> 157;
            case 129 -> 241;
            case 130 -> 5;
            case 131 -> 126;
            case 132 -> 192;
            case 133 -> 6;
            case 134 -> 166;
            case 135 -> 20;
            case 136 -> 74;
            case 137 -> 147;
            case 138 -> 38;
            case 139 -> 236;
            case 140 -> 24;
            case 141 -> 226;
            case 142 -> 234;
            case 143 -> 158;
            case 144 -> 198;
            case 145 -> 177;
            case 146 -> 88;
            case 147 -> 81;
            case 148 -> 27;
            case 149 -> 210;
            case 150 -> 2;
            case 151 -> 101;
            case 152 -> 65;
            case 153 -> 45;
            case 154 -> 246;
            case 155 -> 16;
            case 156 -> 33;
            case 157 -> 76;
            case 158 -> 56;
            case 159 -> 169;
            case 160 -> 188;
            case 161 -> 163;
            case 162 -> 235;
            case 163 -> 19;
            case 164 -> 252;
            case 165 -> 103;
            case 166 -> 139;
            case 167 -> 42;
            case 168 -> 156;
            case 169 -> 52;
            case 170 -> 240;
            case 171 -> 11;
            case 172 -> 135;
            case 173 -> 35;
            case 174 -> 228;
            case 175 -> 116;
            case 176 -> 143;
            case 177 -> 84;
            case 178 -> 18;
            case 179 -> 106;
            case 180 -> 115;
            case 181 -> 197;
            case 182 -> 8;
            case 183 -> 187;
            case 184 -> 244;
            case 185 -> 207;
            case 186 -> 77;
            case 187 -> 44;
            case 188 -> 175;
            case 189 -> 138;
            case 190 -> 231;
            case 191 -> 120;
            case 192 -> 251;
            case 193 -> 122;
            case 194 -> 201;
            case 195 -> 39;
            case 196 -> 250;
            case 197 -> 204;
            case 198 -> 183;
            case 199 -> 203;
            case 200 -> 130;
            case 201 -> 249;
            case 202 -> 179;
            case 203 -> 57;
            case 204 -> 165;
            case 205 -> 224;
            case 206 -> 186;
            case 207 -> 59;
            case 208 -> 37;
            case 209 -> 21;
            case 210 -> 253;
            case 211 -> 1;
            case 212 -> 134;
            case 213 -> 41;
            case 214 -> 208;
            case 215 -> 200;
            case 216 -> 100;
            case 217 -> 176;
            case 218 -> 181;
            case 219 -> 105;
            case 220 -> 85;
            case 221 -> 60;
            case 222 -> 151;
            case 223 -> 40;
            case 224 -> 31;
            case 225 -> 92;
            case 226 -> 211;
            case 227 -> 109;
            case 228 -> 70;
            case 229 -> 117;
            case 230 -> 69;
            case 231 -> 153;
            case 232 -> 150;
            case 233 -> 218;
            case 234 -> 171;
            case 235 -> 80;
            case 236 -> 62;
            case 237 -> 23;
            case 238 -> 189;
            case 239 -> 155;
            case 240 -> 172;
            case 241 -> 149;
            case 242 -> 230;
            case 243 -> 61;
            case 244 -> 223;
            case 245 -> 55;
            case 246 -> 93;
            case 247 -> 173;
            case 248 -> 3;
            case 249 -> 213;
            case 250 -> 205;
            case 251 -> 193;
            case 252 -> 180;
            case 253 -> 162;
            case 254 -> 216;
            default -> 237;
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

   public static final class PXEvMid {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public PXEvMid(Object... px) {
        }

      private static boolean IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private static String[] a;
      private static String[] b;

      // PX-FIX jar member (row1): Kotlin synthetic ctor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
      public PXEvMid(kotlin.jvm.internal.DefaultConstructorMarker var1) {
         this();
      }

      private PXEvMid() {
      }

      @JvmStatic
      public final void a(@NotNull RenderTarget var1, @NotNull PoseStack var2, @NotNull Camera var3) {
         short var10001 = -7961;
         short var10002 = 19419;
         Intrinsics.checkNotNullParameter(var1, "renderTarget");
         var10001 = -7962;
         var10002 = 9916;
         Intrinsics.checkNotNullParameter(var2, "eventPoseStack");
         var10001 = -7968;
         var10002 = 4287;
         Intrinsics.checkNotNullParameter(var3, "camera");
         this.a();
         lIllIIlIIIIIlllIllIlIIIlIIIlIIlIIlIIIIlIllIIIlIIlllIllIIlIlIlllIlIlllIlllIIIIlIIIIlII.b(
            IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
            var2
         );
         IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1,
            IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
            var3,
            IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
         );
      }

      @JvmStatic
      public final void a() {
         boolean var1 = c();
         if (!var1) {
            IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var10000 = IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
            if (var10000 != null) {
               IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var2 = var10000;
               IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI.a(var2.g(), var2.d(), null, 2, null);
               IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = null;
               return;
            }
         }
      }

      @JvmStatic
      @PublishedApi
      @NotNull
      public final IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI b(
         @NotNull RenderTarget var1, @NotNull PoseStack var2, @NotNull Camera var3
      ) {
         boolean var10000 = c();
         short var10002 = -7966;
         short var10003 = -29954;
         Intrinsics.checkNotNullParameter(var1, "renderTarget");
         var10002 = -7965;
         var10003 = 3553;
         Intrinsics.checkNotNullParameter(var2, "poseStack");
         var10002 = -7967;
         var10003 = 19668;
         Intrinsics.checkNotNullParameter(var3, "camera");
         IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var5 = IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
         boolean var4 = var10000;
         IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var6 = var5;
         if (!var4) {
            if (var5 == null) {
               return new IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI(
                  var1, var2, var3, new IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI(), false
               );
            }

            var6 = var5;
         }

         return var6.d() == var1
            ? new IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI(var1, var5.e(), var5.f(), var5.g(), true)
            : new IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI(
               var1, var2, var3, new IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI(), false
            );
      }

      public static void b(boolean var0) {
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var0;
      }

      public static boolean b() {
         return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public static boolean c() {
         boolean var0 = b();
         return !var0;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[6];
         int var3 = 0;
         String var2 = "6¤0½«îªan\f\fæ(¿ \u0089\u001eIrøÙ\u0003\u0006£Xííìñ\u0006fFU.û\u0089";
         int var4 = "6¤0½«îªan\f\fæ(¿ \u0089\u001eIrøÙ\u0003\u0006£Xííìñ\u0006fFU.û\u0089".length();
         char var1 = '\t';
         b(true);
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 20;
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
                        case 0 -> 56;
                        case 1 -> 73;
                        case 2 -> 106;
                        case 3 -> 113;
                        case 4 -> 56;
                        case 5 -> 92;
                        default -> 22;
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
                        b = new String[6];
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

                     var2 = "ÛÍÛÓW\rùÐ\u0087ÂnM\u000e\u0086\u0012\u008eS\u0086tË\u008b\u008aÍ+\u000b\u0011É";
                     var4 = "ÛÍÛÓW\rùÐ\u0087ÂnM\u000e\u0086\u0012\u008eS\u0086tË\u008b\u008aÍ+\u000b\u0011É".length();
                     var1 = '\f';
                     var8 = -1;
               }

               var10000 = 28;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -7965) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 58;
               case 1 -> 146;
               case 2 -> 206;
               case 3 -> 186;
               case 4 -> 105;
               case 5 -> 218;
               case 6 -> 91;
               case 7 -> 122;
               case 8 -> 152;
               case 9 -> 219;
               case 10 -> 240;
               case 11 -> 144;
               case 12 -> 121;
               case 13 -> 99;
               case 14 -> 48;
               case 15 -> 104;
               case 16 -> 28;
               case 17 -> 88;
               case 18 -> 180;
               case 19 -> 249;
               case 20 -> 212;
               case 21 -> 211;
               case 22 -> 57;
               case 23 -> 39;
               case 24 -> 11;
               case 25 -> 164;
               case 26 -> 119;
               case 27 -> 110;
               case 28 -> 15;
               case 29 -> 62;
               case 30 -> 83;
               case 31 -> 138;
               case 32 -> 172;
               case 33 -> 10;
               case 34 -> 3;
               case 35 -> 32;
               case 36 -> 217;
               case 37 -> 33;
               case 38 -> 224;
               case 39 -> 21;
               case 40 -> 82;
               case 41 -> 90;
               case 42 -> 135;
               case 43 -> 49;
               case 44 -> 24;
               case 45 -> 250;
               case 46 -> 0;
               case 47 -> 71;
               case 48 -> 234;
               case 49 -> 247;
               case 50 -> 184;
               case 51 -> 154;
               case 52 -> 26;
               case 53 -> 198;
               case 54 -> 6;
               case 55 -> 155;
               case 56 -> 22;
               case 57 -> 238;
               case 58 -> 188;
               case 59 -> 199;
               case 60 -> 100;
               case 61 -> 216;
               case 62 -> 125;
               case 63 -> 16;
               case 64 -> 9;
               case 65 -> 162;
               case 66 -> 61;
               case 67 -> 102;
               case 68 -> 103;
               case 69 -> 89;
               case 70 -> 177;
               case 71 -> 230;
               case 72 -> 160;
               case 73 -> 108;
               case 74 -> 150;
               case 75 -> 133;
               case 76 -> 107;
               case 77 -> 229;
               case 78 -> 87;
               case 79 -> 56;
               case 80 -> 209;
               case 81 -> 77;
               case 82 -> 127;
               case 83 -> 169;
               case 84 -> 128;
               case 85 -> 176;
               case 86 -> 92;
               case 87 -> 149;
               case 88 -> 136;
               case 89 -> 95;
               case 90 -> 210;
               case 91 -> 239;
               case 92 -> 235;
               case 93 -> 93;
               case 94 -> 190;
               case 95 -> 41;
               case 96 -> 63;
               case 97 -> 196;
               case 98 -> 168;
               case 99 -> 97;
               case 100 -> 70;
               case 101 -> 173;
               case 102 -> 36;
               case 103 -> 53;
               case 104 -> 117;
               case 105 -> 243;
               case 106 -> 182;
               case 107 -> 132;
               case 108 -> 148;
               case 109 -> 202;
               case 110 -> 98;
               case 111 -> 201;
               case 112 -> 72;
               case 113 -> 174;
               case 114 -> 115;
               case 115 -> 178;
               case 116 -> 163;
               case 117 -> 23;
               case 118 -> 204;
               case 119 -> 252;
               case 120 -> 215;
               case 121 -> 153;
               case 122 -> 220;
               case 123 -> 139;
               case 124 -> 118;
               case 125 -> 42;
               case 126 -> 185;
               case 127 -> 84;
               case 128 -> 157;
               case 129 -> 242;
               case 130 -> 143;
               case 131 -> 244;
               case 132 -> 60;
               case 133 -> 34;
               case 134 -> 14;
               case 135 -> 255;
               case 136 -> 19;
               case 137 -> 228;
               case 138 -> 113;
               case 139 -> 129;
               case 140 -> 59;
               case 141 -> 45;
               case 142 -> 65;
               case 143 -> 232;
               case 144 -> 1;
               case 145 -> 130;
               case 146 -> 12;
               case 147 -> 80;
               case 148 -> 158;
               case 149 -> 175;
               case 150 -> 181;
               case 151 -> 116;
               case 152 -> 31;
               case 153 -> 213;
               case 154 -> 236;
               case 155 -> 166;
               case 156 -> 30;
               case 157 -> 2;
               case 158 -> 225;
               case 159 -> 68;
               case 160 -> 106;
               case 161 -> 248;
               case 162 -> 245;
               case 163 -> 69;
               case 164 -> 67;
               case 165 -> 18;
               case 166 -> 35;
               case 167 -> 25;
               case 168 -> 227;
               case 169 -> 159;
               case 170 -> 193;
               case 171 -> 27;
               case 172 -> 183;
               case 173 -> 147;
               case 174 -> 120;
               case 175 -> 207;
               case 176 -> 165;
               case 177 -> 66;
               case 178 -> 13;
               case 179 -> 46;
               case 180 -> 223;
               case 181 -> 161;
               case 182 -> 52;
               case 183 -> 44;
               case 184 -> 208;
               case 185 -> 101;
               case 186 -> 222;
               case 187 -> 74;
               case 188 -> 203;
               case 189 -> 131;
               case 190 -> 51;
               case 191 -> 55;
               case 192 -> 156;
               case 193 -> 124;
               case 194 -> 145;
               case 195 -> 141;
               case 196 -> 200;
               case 197 -> 151;
               case 198 -> 37;
               case 199 -> 5;
               case 200 -> 85;
               case 201 -> 109;
               case 202 -> 126;
               case 203 -> 170;
               case 204 -> 241;
               case 205 -> 233;
               case 206 -> 237;
               case 207 -> 123;
               case 208 -> 64;
               case 209 -> 187;
               case 210 -> 189;
               case 211 -> 253;
               case 212 -> 214;
               case 213 -> 81;
               case 214 -> 167;
               case 215 -> 96;
               case 216 -> 47;
               case 217 -> 86;
               case 218 -> 194;
               case 219 -> 254;
               case 220 -> 231;
               case 221 -> 54;
               case 222 -> 246;
               case 223 -> 17;
               case 224 -> 4;
               case 225 -> 111;
               case 226 -> 134;
               case 227 -> 7;
               case 228 -> 226;
               case 229 -> 171;
               case 230 -> 40;
               case 231 -> 8;
               case 232 -> 38;
               case 233 -> 191;
               case 234 -> 197;
               case 235 -> 20;
               case 236 -> 73;
               case 237 -> 221;
               case 238 -> 75;
               case 239 -> 192;
               case 240 -> 94;
               case 241 -> 112;
               case 242 -> 195;
               case 243 -> 179;
               case 244 -> 79;
               case 245 -> 114;
               case 246 -> 205;
               case 247 -> 50;
               case 248 -> 140;
               case 249 -> 137;
               case 250 -> 251;
               case 251 -> 142;
               case 252 -> 29;
               case 253 -> 43;
               case 254 -> 76;
               default -> 78;
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

      record IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         @NotNull RenderTarget d,
         @NotNull PoseStack e,
         @NotNull Camera f,
         @NotNull IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI g
      ) {
         private static String[] a;
         private static String[] b;

         public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            @NotNull RenderTarget d,
            @NotNull PoseStack e,
            @NotNull Camera f,
            @NotNull IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI g
         ) {
            short var10001 = 12653;
            short var10002 = -19083;
            Intrinsics.checkNotNullParameter(d, "renderTarget");
            var10001 = 12655;
            var10002 = 12075;
            Intrinsics.checkNotNullParameter(e, "poseStack");
            var10001 = 12642;
            var10002 = 11297;
            Intrinsics.checkNotNullParameter(f, "camera");
            var10001 = 12640;
            var10002 = -14623;
            Intrinsics.checkNotNullParameter(g, "collector");
                        this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
         }

         @NotNull
         public final RenderTarget h() {
            return this.d;
         }

         @NotNull
         public final PoseStack i() {
            return this.e;
         }

         @NotNull
         public final Camera j() {
            return this.f;
         }

         @NotNull
         public final IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI k() {
            return this.g;
         }

         @NotNull
         public final IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
            @NotNull RenderTarget var1,
            @NotNull PoseStack var2,
            @NotNull Camera var3,
            @NotNull IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI var4
         ) {
            short var10001 = 12652;
            short var10002 = 10710;
            Intrinsics.checkNotNullParameter(var1, "renderTarget");
            var10001 = 12643;
            var10002 = 21135;
            Intrinsics.checkNotNullParameter(var2, "poseStack");
            var10001 = 12654;
            var10002 = 23971;
            Intrinsics.checkNotNullParameter(var3, "camera");
            var10001 = 12648;
            var10002 = -11145;
            Intrinsics.checkNotNullParameter(var4, "collector");
            return new IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
               var1, var2, var3, var4
            );
         }

         @NotNull
         @Override
         public String toString() {
            short var10000 = 12650;
            IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI var1 = this.g;
            Camera var2 = this.f;
            PoseStack var3 = this.e;
            RenderTarget var4 = this.d;
            short var10001 = 2673;
            short var10002 = 12649;
            short var10003 = 16262;
            short var10004 = 12651;
            short var10005 = -15225;
            short var10006 = 12641;
            short var10007 = 18221;
            return "ActiveWorldFrame(renderTarget=" + var4 + ", poseStack=" + var3 + ", camera=" + var2 + ", collector=" + var1 + ")";
         }

         @Override
         public int hashCode() {
            int var1 = this.d.hashCode();
            var1 = var1 * 31 + this.e.hashCode();
            var1 = var1 * 31 + this.f.hashCode();
            return var1 * 31 + this.g.hashCode();
         }

         @Override
         public boolean equals(@Nullable Object var1) {
            boolean var2 = IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.c();
            Object var10000 = this;
            if (!var2) {
               if (this == var1) {
                  return true;
               }

               var10000 = var1;
            }

            if (!var2) {
               if (!(
                  var10000 instanceof IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
               )) {
                  return false;
               }

               var10000 = var1;
            }

            IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
            boolean var4 = Intrinsics.areEqual(this.d, var3.d);
            if (!var2) {
               if (!var4) {
                  return false;
               }

               var4 = Intrinsics.areEqual(this.e, var3.e);
            }

            if (!var2) {
               if (!var4) {
                  return false;
               }

               var4 = Intrinsics.areEqual(this.f, var3.f);
            }

            if (!var2) {
               if (!var4) {
                  return false;
               }

               var4 = Intrinsics.areEqual(this.g, var3.g);
            }

            if (!var2) {
               if (!var4) {
                  return false;
               }

               var4 = true;
            }

            return var4;
         }

         // PX-FIX jar member (row2): Kotlin synthetic default-args bridge; jar descriptor (LIllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;LRenderTarget;LPoseStack;LCamera;LIIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI;ILjava/lang/Object;)LIllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
         public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
            IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var0,
            RenderTarget var1,
            PoseStack var2,
            Camera var3,
            IIlIIlIlIlllIIIlIIllllIlllIlIIlIlIIIlIllIIlIlIllIlIlllIllIlIlIIlIIllIIIllIlIIlIIlIllI var4,
            int var5,
            Object var6
         ) {
            boolean var7 = b();
            if ((var5 & 1) != 0 && var7) {
               var1 = var0.d;
            }

            if ((var5 & 2) != 0 && var7) {
               var2 = var0.e;
            }

            if ((var5 & 4) != 0 && var7) {
               var3 = var0.f;
            }

            if ((var5 & 8) != 0) {
               var4 = var0.g;
            }

            return var0.a(var1, var2, var3, var4);
         }

         // $VF: Irreducible bytecode was duplicated to produce valid code
         static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
            String[] var5 = new String[12];
            int var3 = 0;
            String var2 = "Í¢ê\u0000\u0084\u001e\u0007¹ø\u001e\u0094y\u0016Xõ\u001ct÷X\u0089B-äo\u001fÜ\u00921¡B¼\\\u0014\u008fÎæÅ \u0095ù\fo\u0080\u00adJ\u0003\u0098\u000b| \u008f3x\t\u008dØKäV(R·Û\t.\u0011QÔß\u0011\u0086iï\u0006ù\u0099Ä\n\u0091ß\fÌ?R[7Ç^w~]\u0087ï\f\u0090ÌÙ%F\bp\u008e»b?\b\tm\u00139\u0094Ò\u0019'hÛ\u0006\u0016-9\u009c.\r";
            int var4 = "Í¢ê\u0000\u0084\u001e\u0007¹ø\u001e\u0094y\u0016Xõ\u001ct÷X\u0089B-äo\u001fÜ\u00921¡B¼\\\u0014\u008fÎæÅ \u0095ù\fo\u0080\u00adJ\u0003\u0098\u000b| \u008f3x\t\u008dØKäV(R·Û\t.\u0011QÔß\u0011\u0086iï\u0006ù\u0099Ä\n\u0091ß\fÌ?R[7Ç^w~]\u0087ï\f\u0090ÌÙ%F\bp\u008e»b?\b\tm\u00139\u0094Ò\u0019'hÛ\u0006\u0016-9\u009c.\r"
               .length();
            char var1 = '\t';
            int var8 = -1;

            label52:
            while (true) {
               byte var10000 = 58;
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
                           case 0 -> 70;
                           case 1 -> 98;
                           case 2 -> 44;
                           case 3 -> 32;
                           case 4 -> 67;
                           case 5 -> 79;
                           default -> 48;
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

                        var2 = "%#F\u008f¡\u0098$ò\u0091\u0016\u001aw\tÏÚ²\u0015Ø§2÷f";
                        var4 = "%#F\u008f¡\u0098$ò\u0091\u0016\u001aw\tÏÚ²\u0015Ø§2÷f".length();
                        var1 = '\f';
                        var8 = -1;
                  }

                  var10000 = 68;
                  var10001 = var2.substring(++var8, var8 + var1);
                  var10002 = 0;
               }
            }
         }
}

         private static String a(int var0, int var1) {
            int var2 = (var0 ^ 12651) & 65535;
            if (b[var2] == null) {
               char[] var3 = a[var2].toCharArray();

               short var4 = switch (var3[0] & 0xFF) {
                  case 0 -> 109;
                  case 1 -> 173;
                  case 2 -> 251;
                  case 3 -> 227;
                  case 4 -> 68;
                  case 5 -> 202;
                  case 6 -> 3;
                  case 7 -> 191;
                  case 8 -> 57;
                  case 9 -> 212;
                  case 10 -> 163;
                  case 11 -> 80;
                  case 12 -> 1;
                  case 13 -> 115;
                  case 14 -> 160;
                  case 15 -> 118;
                  case 16 -> 77;
                  case 17 -> 46;
                  case 18 -> 255;
                  case 19 -> 71;
                  case 20 -> 162;
                  case 21 -> 99;
                  case 22 -> 59;
                  case 23 -> 7;
                  case 24 -> 248;
                  case 25 -> 129;
                  case 26 -> 245;
                  case 27 -> 23;
                  case 28 -> 247;
                  case 29 -> 48;
                  case 30 -> 225;
                  case 31 -> 44;
                  case 32 -> 6;
                  case 33 -> 241;
                  case 34 -> 156;
                  case 35 -> 112;
                  case 36 -> 122;
                  case 37 -> 231;
                  case 38 -> 73;
                  case 39 -> 34;
                  case 40 -> 45;
                  case 41 -> 11;
                  case 42 -> 96;
                  case 43 -> 83;
                  case 44 -> 208;
                  case 45 -> 49;
                  case 46 -> 250;
                  case 47 -> 183;
                  case 48 -> 79;
                  case 49 -> 215;
                  case 50 -> 75;
                  case 51 -> 216;
                  case 52 -> 2;
                  case 53 -> 12;
                  case 54 -> 146;
                  case 55 -> 124;
                  case 56 -> 4;
                  case 57 -> 28;
                  case 58 -> 154;
                  case 59 -> 167;
                  case 60 -> 203;
                  case 61 -> 70;
                  case 62 -> 106;
                  case 63 -> 55;
                  case 64 -> 148;
                  case 65 -> 184;
                  case 66 -> 224;
                  case 67 -> 144;
                  case 68 -> 213;
                  case 69 -> 62;
                  case 70 -> 93;
                  case 71 -> 244;
                  case 72 -> 130;
                  case 73 -> 39;
                  case 74 -> 40;
                  case 75 -> 102;
                  case 76 -> 209;
                  case 77 -> 110;
                  case 78 -> 89;
                  case 79 -> 117;
                  case 80 -> 232;
                  case 81 -> 178;
                  case 82 -> 9;
                  case 83 -> 199;
                  case 84 -> 249;
                  case 85 -> 187;
                  case 86 -> 30;
                  case 87 -> 205;
                  case 88 -> 150;
                  case 89 -> 14;
                  case 90 -> 119;
                  case 91 -> 139;
                  case 92 -> 230;
                  case 93 -> 82;
                  case 94 -> 43;
                  case 95 -> 237;
                  case 96 -> 32;
                  case 97 -> 67;
                  case 98 -> 221;
                  case 99 -> 105;
                  case 100 -> 228;
                  case 101 -> 177;
                  case 102 -> 29;
                  case 103 -> 206;
                  case 104 -> 26;
                  case 105 -> 132;
                  case 106 -> 24;
                  case 107 -> 220;
                  case 108 -> 121;
                  case 109 -> 180;
                  case 110 -> 116;
                  case 111 -> 253;
                  case 112 -> 111;
                  case 113 -> 235;
                  case 114 -> 197;
                  case 115 -> 181;
                  case 116 -> 120;
                  case 117 -> 0;
                  case 118 -> 172;
                  case 119 -> 164;
                  case 120 -> 201;
                  case 121 -> 138;
                  case 122 -> 174;
                  case 123 -> 35;
                  case 124 -> 86;
                  case 125 -> 94;
                  case 126 -> 133;
                  case 127 -> 141;
                  case 128 -> 246;
                  case 129 -> 204;
                  case 130 -> 47;
                  case 131 -> 134;
                  case 132 -> 137;
                  case 133 -> 189;
                  case 134 -> 192;
                  case 135 -> 239;
                  case 136 -> 107;
                  case 137 -> 126;
                  case 138 -> 22;
                  case 139 -> 65;
                  case 140 -> 52;
                  case 141 -> 211;
                  case 142 -> 182;
                  case 143 -> 69;
                  case 144 -> 158;
                  case 145 -> 60;
                  case 146 -> 8;
                  case 147 -> 53;
                  case 148 -> 161;
                  case 149 -> 210;
                  case 150 -> 85;
                  case 151 -> 171;
                  case 152 -> 219;
                  case 153 -> 128;
                  case 154 -> 72;
                  case 155 -> 207;
                  case 156 -> 95;
                  case 157 -> 103;
                  case 158 -> 16;
                  case 159 -> 84;
                  case 160 -> 218;
                  case 161 -> 151;
                  case 162 -> 61;
                  case 163 -> 155;
                  case 164 -> 33;
                  case 165 -> 17;
                  case 166 -> 140;
                  case 167 -> 168;
                  case 168 -> 78;
                  case 169 -> 54;
                  case 170 -> 114;
                  case 171 -> 145;
                  case 172 -> 195;
                  case 173 -> 193;
                  case 174 -> 152;
                  case 175 -> 81;
                  case 176 -> 179;
                  case 177 -> 234;
                  case 178 -> 27;
                  case 179 -> 254;
                  case 180 -> 186;
                  case 181 -> 113;
                  case 182 -> 233;
                  case 183 -> 185;
                  case 184 -> 25;
                  case 185 -> 58;
                  case 186 -> 131;
                  case 187 -> 198;
                  case 188 -> 88;
                  case 189 -> 236;
                  case 190 -> 98;
                  case 191 -> 223;
                  case 192 -> 169;
                  case 193 -> 147;
                  case 194 -> 214;
                  case 195 -> 125;
                  case 196 -> 149;
                  case 197 -> 176;
                  case 198 -> 136;
                  case 199 -> 50;
                  case 200 -> 100;
                  case 201 -> 21;
                  case 202 -> 108;
                  case 203 -> 37;
                  case 204 -> 190;
                  case 205 -> 51;
                  case 206 -> 217;
                  case 207 -> 42;
                  case 208 -> 20;
                  case 209 -> 41;
                  case 210 -> 238;
                  case 211 -> 175;
                  case 212 -> 5;
                  case 213 -> 243;
                  case 214 -> 165;
                  case 215 -> 31;
                  case 216 -> 13;
                  case 217 -> 196;
                  case 218 -> 135;
                  case 219 -> 252;
                  case 220 -> 101;
                  case 221 -> 15;
                  case 222 -> 240;
                  case 223 -> 188;
                  case 224 -> 226;
                  case 225 -> 87;
                  case 226 -> 127;
                  case 227 -> 242;
                  case 228 -> 36;
                  case 229 -> 19;
                  case 230 -> 10;
                  case 231 -> 63;
                  case 232 -> 200;
                  case 233 -> 76;
                  case 234 -> 38;
                  case 235 -> 153;
                  case 236 -> 56;
                  case 237 -> 90;
                  case 238 -> 74;
                  case 239 -> 91;
                  case 240 -> 18;
                  case 241 -> 229;
                  case 242 -> 170;
                  case 243 -> 64;
                  case 244 -> 104;
                  case 245 -> 159;
                  case 246 -> 66;
                  case 247 -> 92;
                  case 248 -> 222;
                  case 249 -> 143;
                  case 250 -> 97;
                  case 251 -> 166;
                  case 252 -> 194;
                  case 253 -> 123;
                  case 254 -> 157;
                  default -> 142;
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
}
