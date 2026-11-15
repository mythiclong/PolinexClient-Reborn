package me.octo.client.utils;

import com.mojang.blaze3d.platform.NativeImage;
import com.mojang.blaze3d.platform.NativeImage.Format;
import com.mojang.blaze3d.vertex.VertexConsumer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import net.fabricmc.fabric.api.client.rendering.v1.level.LevelRenderContext;
import net.minecraft.client.Camera;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource.BufferSource;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.util.ARGB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import java.nio.ByteBuffer;
import org.joml.Quaternionfc;

public final class IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl {
   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T a(IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlII

   @NotNull
   public static IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static Supplier<String> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @Nullable
   private static NativeImage lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @Nullable
   private static DynamicTexture IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @Nullable
   private static Identifier IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static volatile int IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static volatile int lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static volatile int IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static volatile boolean llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static volatile int lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private static int[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private static int[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private static float[] lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private static Map<IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll, IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private static Set<IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static String[] a;
   private static String[] b;

   private IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl() {
   }

   @JvmStatic
   private static final Minecraft a() {
      Minecraft var10000 = Minecraft.getInstance();
      short var10002 = -18908;
      short var10003 = -29098;
      Intrinsics.checkNotNullExpressionValue(var10000, "getInstance(...)");
      return var10000;
   }

   private final void b() {
      int[] var1 = llllIllllllIllllIlIlllllllIllIIlIlllIIIlllllllIlIIIlIIIlIIIIllIIllllIlIlIIIllIIlIIIlI.c();
      NativeImage var10000 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      if (var1 == null) {
         if (lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI != null) {
            return;
         }

         var10000 = new NativeImage(Format.RGBA, 2048, 2048, true);
      }

      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var10000;
      short var2 = -18886;
      Supplier var10003 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      NativeImage var10004 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      Intrinsics.checkNotNull(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new DynamicTexture(var10003, var10004);
      short var10001 = 15713;
      var10001 = -18891;
      short var10002 = 32075;
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = Identifier.fromNamespaceAndPath("polinex", "text_atlas");
      Minecraft var3 = a();
      if (var3 != null) {
         TextureManager var4 = var3.getTextureManager();
         if (var4 != null) {
            Identifier var6 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            Intrinsics.checkNotNull(IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
            DynamicTexture var7 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            Intrinsics.checkNotNull(IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
            var4.register(var6, var7);
         }
      }
   }

   private final Pair<Integer, Integer> a(int var1, int var2) {
      int var10000;
      label23: {
         int[] var3 = llllIllllllIllllIlIlllllllIllIIlIlllIIIlllllllIlIIIlIIIlIIIIllIIllllIlIlIIIllIIlIIIlI.c();
         var10000 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll + var1;
         short var10001 = 2048;
         if (var3 == null) {
            if (var10000 > 2048) {
               IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 0;
               lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                  + IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
               IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = 0;
            }

            var10000 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll + var2;
            if (var3 != null) {
               break label23;
            }

            var10001 = 2048;
         }

         if (var10000 > var10001) {
            return null;
         }

         var10000 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      int var4 = var10000;
      int var5 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll += var1;
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = Math.max(
         IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII, var2
      );
      return new Pair(var4, var5);
   }

   public final void c() {
      boolean var5 = false; // PX-FIX
      IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.clear();
      int[] var10000 = llllIllllllIllllIlIlllllllIllIIlIlllIIIlllllllIlIIIlIIIlIIIIllIIllllIlIlIIIllIIlIIIlI.c();
      llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.clear();
      int[] var1 = var10000;
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 0;
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 0;
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = 0;
      NativeImage var2 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      if (var2 != null) {
         int var3 = 0;

         label35: {
            while (var3 < 2048) {
               var5 = false;
               if (var1 != null) {
                  break label35;
               }

               int var4 = 0;

               while (true) {
                  if (var4 < 2048) {
                     var2.setPixelABGR(var4, var3, 0);
                     var4++;
                     if (var1 != null) {
                        break;
                     }

                     if (var1 == null) {
                        continue;
                     }
                  }

                  var3++;
                  break;
               }

               if (var1 != null) {
                  break;
               }
            }

            var5 = true;
         }

         llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var5;
      }
   }

   private final void d() {
      if (llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) {
         if (IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII != null) {
            IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.upload();
         }

         llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = false;
      }
   }

   public final void a(
      @NotNull LevelRenderContext var1,
      @NotNull Component var2,
      @NotNull Vec3 var3,
      float var4,
      float var5,
      boolean var6,
      @NotNull IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl var7,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var8,
      boolean var9,
      float var10
   ) {
      int[] var10000 = llllIllllllIllllIlIlllllllIllIIlIlllIIIlllllllIlIIIlIIIlIIIIllIIllllIlIlIIIllIIlIIIlI.c();
      short var10002 = -18890;
      short var10003 = -25667;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10002 = -18895;
      var10003 = -13258;
      Intrinsics.checkNotNullParameter(var2, "text");
      var10002 = -18905;
      var10003 = 4614;
      Intrinsics.checkNotNullParameter(var3, "pos");
      int[] var11 = var10000;
      short var10001 = -18882;
      var10002 = -21972;
      Intrinsics.checkNotNullParameter(var7, "font");
      var10001 = -18909;
      var10002 = -19635;
      Intrinsics.checkNotNullParameter(var8, "color");
      String var19 = var2.getString();
      var10002 = -18883;
      var10003 = 9454;
      Intrinsics.checkNotNullExpressionValue(var19, "getString(...)");
      String var12 = var19;
      int var20 = var12.length();
      if (var11 == null) {
         var20 = var20 == 0 ? 1 : 0;
      }

      if (var20 == 0) {
         IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var13 = new IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            var12, var7, var8.o(), var9, var10
         );
         if (var11 == null) {
            IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var21 = this.b(
               var13
            );
            if (var21 != null) {
               IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var14 = var21;
               this.d();
               if (var11 == null && IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI != null) {
                  Identifier var15 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                  var14.a(System.currentTimeMillis());
                  float var16 = var4 * 0.025F;
                  float var17 = var14.e() * var16;
                  float var18 = var14.f() * var16;
                  this.a(var1, var3, var17, var18, var14, var15, var6);
                  return;
               }

               return;
            }
         }
      }
   }

   public final void a(
      @NotNull LevelRenderContext var1,
      @NotNull List<IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> var2
   ) {
      VertexConsumer var32 = null; // PX-FIX
      Object var31 = null; // PX-FIX
      int[] var10000 = llllIllllllIllllIlIlllllllIllIIlIlllIIIlllllllIlIIIlIIIlIIIIllIIllllIlIlIIIllIIlIIIlI.c();
      short var10002 = -18887;
      short var10003 = -12556;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10002 = -18893;
      var10003 = -25009;
      Intrinsics.checkNotNullParameter(var2, "entries");
      int[] var3 = var10000;
      if (var3 == null) {
         if (var2.isEmpty()) {
            return;
         }

         this.d();
      }

      if (var3 == null && IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI != null) {
         Identifier var4 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         BufferSource var7 = var1.bufferSource();
         BufferSource var26 = var7;
         if (var3 == null) {
            var26 = var7 instanceof BufferSource ? var7 : null;
         }

         if (var26 != null) {
            BufferSource var5 = var26;
            if (var3 == null) {
               Minecraft var27 = a();
               if (var27 != null && var27.gameRenderer != null) {
                  Camera var29 = var27.gameRenderer.getMainCamera();
                  if (var29 != null) {
                     Camera var6 = var29;
                     Vec3 var30 = var6.position();
                     var10002 = -18896;
                     var10003 = 6270;
                     Intrinsics.checkNotNullExpressionValue(var30, "position(...)");
                     Vec3 var25 = var30;
                     RenderType var8 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.b(var4);
                     RenderType var9 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a(var4);
                     VertexConsumer var10 = null;
                     VertexConsumer var11 = null;
                     boolean var12 = false;
                     boolean var13 = false;
                     Iterator var14 = var2.iterator();

                     while (true) {
                        if (var14.hasNext()) {
                           IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var15 = (IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var14.next();
                           IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var16 = var15.a();
                           var16.a(System.currentTimeMillis());
                           float var17 = var15.c() * 0.025F;
                           float var18 = var16.e() * var17;
                           float var19 = var16.f() * var17;
                           float var20 = (float)(-var18 / 2.0 + 0.0);
                           float var21 = (float)(-var19 / 2.0 + var15.d());
                           Matrix4f var22 = new Matrix4f();
                           var22.translate((float)(var15.b().x - var25.x), (float)(var15.b().y - var25.y), (float)(var15.b().z - var25.z))
                              .rotate((Quaternionfc)var6.rotation());
                           int var23 = ARGB.colorFromFloat(1.0F, 1.0F, 1.0F, 1.0F);
                           var31 = var15.e();
                           if (var3 != null) {
                              break;
                           }

                           label101: {
                              if (var3 == null) {
                                 if (((Boolean)(var31))) {
                                    var12 = true;
                                    var32 = var10;
                                    if (var3 == null) {
                                       if (var10 == null) {
                                          var10 = var5.getBuffer(var8);
                                       }

                                       var32 = var10;
                                       Intrinsics.checkNotNull(var10);
                                    }
                                    break label101;
                                 }

                                 var31 = true;
                              }

                              var13 =((Boolean)( var31));
                              var32 = var11;
                              if (var3 == null) {
                                 if (var11 == null) {
                                    var11 = var5.getBuffer(var9);
                                 }

                                 var32 = var11;
                              }

                              Intrinsics.checkNotNull(var32);
                           }

                           VertexConsumer var24 = var32;
                           var24.addVertex((Matrix4fc)var22, var20, var21, 0.0F).setUv(var16.c(), var16.b()).setColor(var23);
                           var24.addVertex((Matrix4fc)var22, var20, var21 + var19, 0.0F).setUv(var16.c(), var16.d()).setColor(var23);
                           var24.addVertex((Matrix4fc)var22, var20 + var18, var21 + var19, 0.0F).setUv(var16.a(), var16.d()).setColor(var23);
                           var24.addVertex((Matrix4fc)var22, var20 + var18, var21, 0.0F).setUv(var16.a(), var16.b()).setColor(var23);
                           if (var3 == null) {
                              continue;
                           }
                        }

                        var31 = var12;
                        break;
                     }

                     if (var3 == null) {
                        if (((Boolean)(var31))) {
                           var5.endBatch(var8);
                        }

                        var31 = var13;
                     }

                     if (((Boolean)(var31))) {
                        var5.endBatch(var9);
                     }

                     return;
                  }
               }
            }
         }
      }
   }

   @Nullable
   public final IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
      @NotNull IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var1
   ) {
      short var10001 = -18906;
      short var10002 = -14120;
      Intrinsics.checkNotNullParameter(var1, "key");
      return this.b(var1);
   }

   private final IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll b(
      IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll param1
   ) {
      int[] var2 = llllIllllllIllllIlIlllllllIllIIlIlllIIIlllllllIlIIIlIIIlIIIIllIIllllIlIlIIIllIIlIIIlI.c();
      IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.get(param1);
      if (var2 != null) {
         return var3;
      }

      if (llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.contains(param1)) {
         return null;
      }

      if (lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b() == -1L) {
         return null;
      }

      this.b();
      float var4 = 4.0F;
      float var5 = param1.e() * var4 * 0.95F * 0.75F;
      float var6;
      try {
         var6 = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(param1.a(), var5, param1.b());
      } catch (Exception var19) {
         llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.add(param1);
         return null;
      }

      float var7 = var6;
      if (!(var7 > 0.0F && Math.abs(var7) <= Float.MAX_VALUE)) {
         llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.add(param1);
         return null;
      }

      float var8 = var5 * 1.5F;
      float var9 = 8.0F * var4;
      int var10 = ((int)Math.ceil((double)var7) + (int)(var9 * 2.0F) + 3) / 4 * 4;
      int var11 = ((int)Math.ceil((double)(var8 + 6.0F)) + (int)(var9 * 1.5F) + 3) / 4 * 4;
      if (!(var10 > 0 && var11 > 0 && var10 <= 2048 && var11 <= 2048)) {
         llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.add(param1);
         return null;
      }

      Pair<Integer, Integer> var12 = this.a(var10, var11);
      if (var12 == null) {
         this.c();
         var12 = this.a(var10, var11);
      }

      if (var12 == null) {
         return null;
      }

      return this.a(param1, var12.getFirst(), var12.getSecond(), var10, var11, var7, var8, var5, var9, var4);
   }

   private final IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
      IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll param1,
      int param2,
      int param3,
      int param4,
      int param5,
      float param6,
      float param7,
      float param8,
      float param9,
      float param10
   ) {
      int[] guard = llllIllllllIllllIlIlllllllIllIIlIlllIIIlllllllIlIIIlIIIlIIIIllIIllllIlIlIIIllIIlIIIlI.c();
      int[] viewport = new int[4];
      GL11.glGetIntegerv(2978, viewport);
      int savedFramebuffer = GL11.glGetInteger(36006);
      int savedReadBuffer = GL11.glGetInteger(3074);
      int savedProgram = GL11.glGetInteger(35725);
      int savedVao = GL11.glGetInteger(34229);
      int savedArrayBuffer = GL11.glGetInteger(34964);
      int savedPixelPackBuffer = GL11.glGetInteger(35053);
      int savedPixelUnpackBuffer = GL11.glGetInteger(35055);
      int savedActiveTexture = GL11.glGetInteger(34016);
      int savedTexture = GL11.glGetInteger(32873);
      boolean savedBlend = GL11.glIsEnabled(3042);
      int savedBlendSrc = GL11.glGetInteger(3041);
      int savedBlendDst = GL11.glGetInteger(3040);
      boolean savedCullFace = GL11.glIsEnabled(2884);
      boolean savedDepthTest = GL11.glIsEnabled(2929);
      boolean savedScissorTest = GL11.glIsEnabled(3089);
      boolean savedStencilTest = GL11.glIsEnabled(2960);
      int[] savedColorMask = new int[4];
      GL11.glGetIntegerv(3107, savedColorMask);
      int savedStencilMask = GL11.glGetInteger(2968);
      float[] savedClearColor = new float[4];
      GL11.glGetFloatv(3106, savedClearColor);
      int savedPack0 = GL11.glGetInteger(3330);
      int savedPack1 = GL11.glGetInteger(3331);
      int savedPack2 = GL11.glGetInteger(3332);
      int savedPack3 = GL11.glGetInteger(3333);
      int savedUnpack0 = GL11.glGetInteger(3314);
      int savedUnpack1 = GL11.glGetInteger(3315);
      int savedUnpack2 = GL11.glGetInteger(3316);
      int savedUnpack3 = GL11.glGetInteger(3317);

      int fbo = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      if (guard == null && fbo == -1) {
         fbo = GL30.glGenFramebuffers();
         lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = fbo;
      }

      int texture = GL11.glGenTextures();
      GL15.glBindBuffer(35052, 0);
      GL11.glPixelStorei(3314, 0);
      GL11.glPixelStorei(3315, 0);
      GL11.glPixelStorei(3316, 0);
      GL11.glPixelStorei(3317, 4);
      GL11.glBindTexture(3553, texture);
      GL11.glTexParameteri(3553, 10241, 9729);
      GL11.glTexParameteri(3553, 10240, 9729);
      GL11.glTexParameteri(3553, 10242, 33071);
      GL11.glTexParameteri(3553, 10243, 33071);
      GL11.glTexImage2D(3553, 0, 32856, param4, param5, 0, 6408, 5121, (ByteBuffer)null);
      GL30.glBindFramebuffer(36160, fbo);
      GL30.glFramebufferTexture2D(36160, 36064, 3553, texture, 0);
      int fboStatus = GL30.glCheckFramebufferStatus(36160);
      if (guard == null && fboStatus != 36053) {
         llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.add(param1);
         GL11.glDeleteTextures(texture);
         GL20.glUseProgram(savedProgram);
         GL30.glBindVertexArray(savedVao);
         GL15.glBindBuffer(34962, savedArrayBuffer);
         GL15.glBindBuffer(35051, savedPixelPackBuffer);
         GL15.glBindBuffer(35052, savedPixelUnpackBuffer);
         GL13.glActiveTexture(savedActiveTexture);
         GL11.glBindTexture(3553, savedTexture);
         GL30.glBindFramebuffer(36160, savedFramebuffer);
         GL11.glViewport(viewport[0], viewport[1], viewport[2], viewport[3]);
         GL11.glReadBuffer(savedReadBuffer);
         GL11.glClearColor(savedClearColor[0], savedClearColor[1], savedClearColor[2], savedClearColor[3]);
         if (savedBlend) {
            GL11.glEnable(3042);
         } else {
            GL11.glDisable(3042);
         }
         GL11.glBlendFunc(savedBlendSrc, savedBlendDst);
         if (savedCullFace) {
            GL11.glEnable(2884);
         } else {
            GL11.glDisable(2884);
         }
         if (savedDepthTest) {
            GL11.glEnable(2929);
         } else {
            GL11.glDisable(2929);
         }
         if (savedScissorTest) {
            GL11.glEnable(3089);
         } else {
            GL11.glDisable(3089);
         }
         if (savedStencilTest) {
            GL11.glEnable(2960);
         } else {
            GL11.glDisable(2960);
         }
         GL11.glColorMask(savedColorMask[0] != 0, savedColorMask[1] != 0, savedColorMask[2] != 0, savedColorMask[3] != 0);
         GL11.glStencilMask(savedStencilMask);
         GL11.glPixelStorei(3330, savedPack0);
         GL11.glPixelStorei(3331, savedPack1);
         GL11.glPixelStorei(3332, savedPack2);
         GL11.glPixelStorei(3333, savedPack3);
         GL11.glPixelStorei(3314, savedUnpack0);
         GL11.glPixelStorei(3315, savedUnpack1);
         GL11.glPixelStorei(3316, savedUnpack2);
         GL11.glPixelStorei(3317, savedUnpack3);
         return null;
      }

      try {
         GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
         GL11.glClear(16384);
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            fbo, (float)param4, (float)param5, null, 8, null
         );
         me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll font = new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(param1.c());
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b((float)param4, 0.0F);
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(-1.0F, 1.0F);
         float var40 = ((float)param4 - param6) / 2.0F;
         float var41 = param8 * 1.2F;
         float var42 = param6 + 18.0F;
         float var43 = param7 / 2.0F + param9 * 0.5F;
         float var44 = var40 - param9 / 2.0F;
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var44, var41, var42, var43, font.a(0.7F), 12.0F);
         me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll font2 = param1.d()
            ? font.b(me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl)
            : me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var44, var41, var42, var43, 2.5F, font2, 12.0F);
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(param1.a(), var40 - 7.0F, var41 - 8.5F, var43 + param8 / 4.0F, font, param1.b());
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.f();
         GL20.glUseProgram(savedProgram);
         GL30.glBindVertexArray(savedVao);
         GL15.glBindBuffer(34962, savedArrayBuffer);
         GL13.glActiveTexture(savedActiveTexture);
         GL11.glBindTexture(3553, savedTexture);
         if (savedBlend) {
            GL11.glEnable(3042);
         } else {
            GL11.glDisable(3042);
         }
         GL11.glBlendFunc(savedBlendSrc, savedBlendDst);
         if (savedCullFace) {
            GL11.glEnable(2884);
         } else {
            GL11.glDisable(2884);
         }
         if (savedDepthTest) {
            GL11.glEnable(2929);
         } else {
            GL11.glDisable(2929);
         }
         if (savedScissorTest) {
            GL11.glEnable(3089);
         } else {
            GL11.glDisable(3089);
         }
         if (savedStencilTest) {
            GL11.glEnable(2960);
         } else {
            GL11.glDisable(2960);
         }
         GL11.glColorMask(savedColorMask[0] != 0, savedColorMask[1] != 0, savedColorMask[2] != 0, savedColorMask[3] != 0);
         GL11.glStencilMask(savedStencilMask);
         GL15.glBindBuffer(35051, 0);
         GL11.glPixelStorei(3330, 0);
         GL11.glPixelStorei(3331, 0);
         GL11.glPixelStorei(3332, 0);
         GL11.glPixelStorei(3333, 4);
         GL30.glBindFramebuffer(36160, fbo);
         GL11.glReadBuffer(36064);
         int pixelCount = param4 * param5;
         int byteCount = pixelCount * 4;
         ByteBuffer pixels = BufferUtils.createByteBuffer(byteCount);
         GL11.glReadPixels(0, 0, param4, param5, 6408, 5121, pixels);
         byte[] pixelBytes = new byte[byteCount];
         pixels.get(pixelBytes);
         if (guard == null && lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI != null) {
            NativeImage image = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            int idx = 0;
            for (int i = 0; i < pixelCount; i++) {
               int px = i % param4;
               int py = i / param4;
               int r = pixelBytes[idx] & 255;
               int g = pixelBytes[idx + 1] & 255;
               int b = pixelBytes[idx + 2] & 255;
               int a = pixelBytes[idx + 3] & 255;
               idx += 4;
               image.setPixelABGR(param2 + px, param3 + py, (a << 24) | (b << 16) | (g << 8) | r);
            }
         }
         llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = true;
         IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll entry = new IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            (float)param2 / 2048.0F,
            (float)param3 / 2048.0F,
            (float)(param2 + param4) / 2048.0F,
            (float)(param3 + param5) / 2048.0F,
            (float)param4 / param10,
            (float)param5 / param10,
            0L
         );
         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.put(param1, entry);
         return entry;
      } finally {
         GL11.glDeleteTextures(texture);
         GL20.glUseProgram(savedProgram);
         GL30.glBindVertexArray(savedVao);
         GL15.glBindBuffer(34962, savedArrayBuffer);
         GL15.glBindBuffer(35051, savedPixelPackBuffer);
         GL15.glBindBuffer(35052, savedPixelUnpackBuffer);
         GL13.glActiveTexture(savedActiveTexture);
         GL11.glBindTexture(3553, savedTexture);
         GL30.glBindFramebuffer(36160, savedFramebuffer);
         GL11.glViewport(viewport[0], viewport[1], viewport[2], viewport[3]);
         GL11.glReadBuffer(savedReadBuffer);
         GL11.glClearColor(savedClearColor[0], savedClearColor[1], savedClearColor[2], savedClearColor[3]);
         if (savedBlend) {
            GL11.glEnable(3042);
         } else {
            GL11.glDisable(3042);
         }
         GL11.glBlendFunc(savedBlendSrc, savedBlendDst);
         if (savedCullFace) {
            GL11.glEnable(2884);
         } else {
            GL11.glDisable(2884);
         }
         if (savedDepthTest) {
            GL11.glEnable(2929);
         } else {
            GL11.glDisable(2929);
         }
         if (savedScissorTest) {
            GL11.glEnable(3089);
         } else {
            GL11.glDisable(3089);
         }
         if (savedStencilTest) {
            GL11.glEnable(2960);
         } else {
            GL11.glDisable(2960);
         }
         GL11.glColorMask(savedColorMask[0] != 0, savedColorMask[1] != 0, savedColorMask[2] != 0, savedColorMask[3] != 0);
         GL11.glStencilMask(savedStencilMask);
         GL11.glPixelStorei(3330, savedPack0);
         GL11.glPixelStorei(3331, savedPack1);
         GL11.glPixelStorei(3332, savedPack2);
         GL11.glPixelStorei(3333, savedPack3);
         GL11.glPixelStorei(3314, savedUnpack0);
         GL11.glPixelStorei(3315, savedUnpack1);
         GL11.glPixelStorei(3316, savedUnpack2);
         GL11.glPixelStorei(3317, savedUnpack3);
      }
   }
   private final void a(
      LevelRenderContext var1,
      Vec3 var2,
      float var3,
      float var4,
      IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var5,
      Identifier var6,
      boolean var7
   ) {
      int[] var8 = llllIllllllIllllIlIlllllllIllIIlIlllIIIlllllllIlIIIlIIIlIIIIllIIllllIlIlIIIllIIlIIIlI.c();
      if (var8 == null) {
         Minecraft var10000 = a();
         if (var10000 != null && var10000.gameRenderer != null) {
            Camera var20 = var10000.gameRenderer.getMainCamera();
            if (var20 != null) {
               Camera var9 = var20;
               Vec3 var21 = var9.position();
               short var10002 = -18884;
               short var10003 = 3028;
               Intrinsics.checkNotNullExpressionValue(var21, "position(...)");
               Vec3 var10 = var21;
               BufferSource var13 = var1.bufferSource();
               BufferSource var22 = var13;
               if (var8 == null) {
                  var22 = var13 instanceof BufferSource ? var13 : null;
               }

               if (var22 == null) {
                  return;
               }

               BufferSource var11 = var22;
               Matrix4f var12 = new Matrix4f();
               var12.translate((float)(var2.x - var10.x), (float)(var2.y - var10.y), (float)(var2.z - var10.z)).rotate((Quaternionfc)var9.rotation());
               RenderType var18 = var7
                  ? lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.b(var6)
                  : lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a(var6);
               VertexConsumer var23 = var11.getBuffer(var18);
               var10002 = -18889;
               var10003 = 10253;
               Intrinsics.checkNotNullExpressionValue(var23, "getBuffer(...)");
               VertexConsumer var14 = var23;
               int var15 = ARGB.colorFromFloat(1.0F, 1.0F, 1.0F, 1.0F);
               float var16 = -var3 / 2.0F;
               float var17 = -var4 / 2.0F;
               var14.addVertex((Matrix4fc)var12, var16, var17, 0.0F).setUv(var5.c(), var5.b()).setColor(var15);
               var14.addVertex((Matrix4fc)var12, var16, var17 + var4, 0.0F).setUv(var5.c(), var5.d()).setColor(var15);
               var14.addVertex((Matrix4fc)var12, var16 + var3, var17 + var4, 0.0F).setUv(var5.a(), var5.d()).setColor(var15);
               var14.addVertex((Matrix4fc)var12, var16 + var3, var17, 0.0F).setUv(var5.a(), var5.b()).setColor(var15);
               var11.endBatch(var18);
               return;
            }
         }
      }
   }

   public final void a(
      @NotNull LevelRenderContext var1,
      @NotNull Component var2,
      @NotNull Vec3 var3,
      float var4,
      boolean var5,
      @NotNull IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl var6
   ) {
      short var10001 = -18887;
      short var10002 = -12556;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = -18881;
      var10002 = -6511;
      Intrinsics.checkNotNullParameter(var2, "text");
      var10001 = -18885;
      var10002 = 16195;
      Intrinsics.checkNotNullParameter(var3, "pos");
      var10001 = -18892;
      var10002 = -7365;
      Intrinsics.checkNotNullParameter(var6, "font");
      a(this, var1, var2, var3, var4, 0.0F, var5, var6, null, false, 0.0F);
   }

   public final void a(
      @NotNull LevelRenderContext var1,
      @NotNull Component var2,
      @NotNull Vec3 var3,
      float var4,
      boolean var5,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6,
      boolean var7,
      @NotNull IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl var8
   ) {
      short var10001 = -18887;
      short var10002 = -12556;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = -18881;
      var10002 = -6511;
      Intrinsics.checkNotNullParameter(var2, "text");
      var10001 = -18885;
      var10002 = 16195;
      Intrinsics.checkNotNullParameter(var3, "pos");
      var10001 = -18888;
      var10002 = -394;
      Intrinsics.checkNotNullParameter(var6, "color");
      var10001 = -18892;
      var10002 = -7365;
      Intrinsics.checkNotNullParameter(var8, "font");
      a(this, var1, var2, var3, var4, 0.0F, var5, var8, var6, var7, 0.0F);
   }

   public final void a(
      @NotNull LevelRenderContext var1,
      @NotNull Component var2,
      @NotNull Vec3 var3,
      float var4,
      float var5,
      boolean var6,
      @NotNull IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl var7
   ) {
      short var10001 = -18887;
      short var10002 = -12556;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = -18881;
      var10002 = -6511;
      Intrinsics.checkNotNullParameter(var2, "text");
      var10001 = -18885;
      var10002 = 16195;
      Intrinsics.checkNotNullParameter(var3, "pos");
      var10001 = -18892;
      var10002 = -7365;
      Intrinsics.checkNotNullParameter(var7, "font");
      a(this, var1, var2, var3, var4, var5, var6, var7, null, false, 0.0F);
   }

   private static final String e() {
      short var10000 = -18907;
      short var10001 = -10696;
      return "text_atlas";
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[21];
      int var3 = 0;
      String var2 = "\u0007Æ^\u0082\u0015\u00853\nÑáùnC#\u0007\u0096\u0084ò·ÉÍ¨\nºE\u0094Äëº\u0091\u0003Æ³\u0004h\u0085\u0088\u0097\u0007\u0090vîÎ\u001f9ø\u0015%c\u008fà\u001d\u008d7t÷ü\u0097r'ß^LkJ?5\t\u0004:¹\u0084[\r«\"9~\u001f[Z4\u008eJ\u0003Ý\u001b\u0004\u0087}3Ã\u0004\u0013¤ç³\u000e\u0084l.Æ\u001a*übÓ\u0086\u000e\u0082½¾\r\u0004ÜÌ¡¡ \u008dKt¥\\ ð\u0003\u001f8¯\u0007\u001b\u00140¸Ø\u008fì\u0007\u0003\r@\u0086\u009fëb\u0005pÈ,%G\u0003*\u0015\t\u0003\u0099\u009b\r\nÿ|<ãþ^3\u009f\u0092 ";
      int var4 = "\u0007Æ^\u0082\u0015\u00853\nÑáùnC#\u0007\u0096\u0084ò·ÉÍ¨\nºE\u0094Äëº\u0091\u0003Æ³\u0004h\u0085\u0088\u0097\u0007\u0090vîÎ\u001f9ø\u0015%c\u008fà\u001d\u008d7t÷ü\u0097r'ß^LkJ?5\t\u0004:¹\u0084[\r«\"9~\u001f[Z4\u008eJ\u0003Ý\u001b\u0004\u0087}3Ã\u0004\u0013¤ç³\u000e\u0084l.Æ\u001a*übÓ\u0086\u000e\u0082½¾\r\u0004ÜÌ¡¡ \u008dKt¥\\ ð\u0003\u001f8¯\u0007\u001b\u00140¸Ø\u008fì\u0007\u0003\r@\u0086\u009fëb\u0005pÈ,%G\u0003*\u0015\t\u0003\u0099\u009b\r\nÿ|<ãþ^3\u009f\u0092 "
         .length();
      char var1 = 14;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 8;
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
                     case 0 -> 26;
                     case 1 -> 38;
                     case 2 -> 11;
                     case 3 -> 28;
                     case 4 -> 57;
                     case 5 -> 51;
                     default -> 2;
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
                     b = new String[21];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl();
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl::e;
                     lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = -1;
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new int[4];
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new int[4];
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new float[4];
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new LinkedHashMap<>();
                     llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new LinkedHashSet<>();
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

                  var2 = "÷\u0081\u008a«^\u0015úan\u0089\u0010\u008d\u0096T¨í\u0005eÏD\u000f\u0080";
                  var4 = "÷\u0081\u008a«^\u0015úan\u0089\u0010\u008d\u0096T¨í\u0005eÏD\u000f\u0080".length();
                  var1 = 16;
                  var8 = -1;
            }

            var10000 = 39;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ -18889) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 211;
            case 1 -> 197;
            case 2 -> 68;
            case 3 -> 242;
            case 4 -> 148;
            case 5 -> 5;
            case 6 -> 228;
            case 7 -> 178;
            case 8 -> 98;
            case 9 -> 232;
            case 10 -> 179;
            case 11 -> 21;
            case 12 -> 119;
            case 13 -> 198;
            case 14 -> 235;
            case 15 -> 80;
            case 16 -> 147;
            case 17 -> 130;
            case 18 -> 222;
            case 19 -> 252;
            case 20 -> 70;
            case 21 -> 155;
            case 22 -> 110;
            case 23 -> 99;
            case 24 -> 186;
            case 25 -> 233;
            case 26 -> 75;
            case 27 -> 129;
            case 28 -> 187;
            case 29 -> 138;
            case 30 -> 254;
            case 31 -> 46;
            case 32 -> 112;
            case 33 -> 67;
            case 34 -> 121;
            case 35 -> 23;
            case 36 -> 28;
            case 37 -> 71;
            case 38 -> 65;
            case 39 -> 52;
            case 40 -> 218;
            case 41 -> 60;
            case 42 -> 192;
            case 43 -> 251;
            case 44 -> 205;
            case 45 -> 224;
            case 46 -> 17;
            case 47 -> 89;
            case 48 -> 32;
            case 49 -> 50;
            case 50 -> 237;
            case 51 -> 44;
            case 52 -> 131;
            case 53 -> 244;
            case 54 -> 184;
            case 55 -> 208;
            case 56 -> 190;
            case 57 -> 113;
            case 58 -> 14;
            case 59 -> 4;
            case 60 -> 7;
            case 61 -> 107;
            case 62 -> 193;
            case 63 -> 164;
            case 64 -> 69;
            case 65 -> 77;
            case 66 -> 38;
            case 67 -> 43;
            case 68 -> 92;
            case 69 -> 49;
            case 70 -> 16;
            case 71 -> 103;
            case 72 -> 82;
            case 73 -> 8;
            case 74 -> 173;
            case 75 -> 84;
            case 76 -> 2;
            case 77 -> 108;
            case 78 -> 123;
            case 79 -> 150;
            case 80 -> 94;
            case 81 -> 245;
            case 82 -> 24;
            case 83 -> 79;
            case 84 -> 200;
            case 85 -> 246;
            case 86 -> 191;
            case 87 -> 180;
            case 88 -> 18;
            case 89 -> 141;
            case 90 -> 101;
            case 91 -> 6;
            case 92 -> 236;
            case 93 -> 151;
            case 94 -> 53;
            case 95 -> 165;
            case 96 -> 30;
            case 97 -> 51;
            case 98 -> 117;
            case 99 -> 195;
            case 100 -> 206;
            case 101 -> 140;
            case 102 -> 241;
            case 103 -> 125;
            case 104 -> 106;
            case 105 -> 207;
            case 106 -> 66;
            case 107 -> 132;
            case 108 -> 0;
            case 109 -> 15;
            case 110 -> 3;
            case 111 -> 9;
            case 112 -> 174;
            case 113 -> 227;
            case 114 -> 202;
            case 115 -> 144;
            case 116 -> 158;
            case 117 -> 42;
            case 118 -> 114;
            case 119 -> 149;
            case 120 -> 168;
            case 121 -> 143;
            case 122 -> 31;
            case 123 -> 182;
            case 124 -> 133;
            case 125 -> 97;
            case 126 -> 170;
            case 127 -> 152;
            case 128 -> 194;
            case 129 -> 157;
            case 130 -> 104;
            case 131 -> 239;
            case 132 -> 214;
            case 133 -> 90;
            case 134 -> 135;
            case 135 -> 199;
            case 136 -> 162;
            case 137 -> 231;
            case 138 -> 215;
            case 139 -> 248;
            case 140 -> 40;
            case 141 -> 96;
            case 142 -> 88;
            case 143 -> 145;
            case 144 -> 73;
            case 145 -> 213;
            case 146 -> 243;
            case 147 -> 93;
            case 148 -> 72;
            case 149 -> 176;
            case 150 -> 253;
            case 151 -> 225;
            case 152 -> 109;
            case 153 -> 45;
            case 154 -> 136;
            case 155 -> 217;
            case 156 -> 219;
            case 157 -> 223;
            case 158 -> 250;
            case 159 -> 76;
            case 160 -> 61;
            case 161 -> 86;
            case 162 -> 210;
            case 163 -> 163;
            case 164 -> 249;
            case 165 -> 216;
            case 166 -> 29;
            case 167 -> 95;
            case 168 -> 111;
            case 169 -> 83;
            case 170 -> 58;
            case 171 -> 247;
            case 172 -> 34;
            case 173 -> 126;
            case 174 -> 25;
            case 175 -> 196;
            case 176 -> 59;
            case 177 -> 115;
            case 178 -> 105;
            case 179 -> 74;
            case 180 -> 171;
            case 181 -> 212;
            case 182 -> 20;
            case 183 -> 33;
            case 184 -> 62;
            case 185 -> 181;
            case 186 -> 137;
            case 187 -> 220;
            case 188 -> 91;
            case 189 -> 55;
            case 190 -> 172;
            case 191 -> 19;
            case 192 -> 100;
            case 193 -> 22;
            case 194 -> 185;
            case 195 -> 156;
            case 196 -> 81;
            case 197 -> 255;
            case 198 -> 47;
            case 199 -> 226;
            case 200 -> 183;
            case 201 -> 201;
            case 202 -> 169;
            case 203 -> 120;
            case 204 -> 139;
            case 205 -> 177;
            case 206 -> 209;
            case 207 -> 11;
            case 208 -> 37;
            case 209 -> 234;
            case 210 -> 189;
            case 211 -> 238;
            case 212 -> 188;
            case 213 -> 204;
            case 214 -> 124;
            case 215 -> 39;
            case 216 -> 35;
            case 217 -> 26;
            case 218 -> 56;
            case 219 -> 36;
            case 220 -> 12;
            case 221 -> 160;
            case 222 -> 118;
            case 223 -> 166;
            case 224 -> 57;
            case 225 -> 175;
            case 226 -> 85;
            case 227 -> 41;
            case 228 -> 13;
            case 229 -> 27;
            case 230 -> 1;
            case 231 -> 153;
            case 232 -> 122;
            case 233 -> 54;
            case 234 -> 240;
            case 235 -> 78;
            case 236 -> 87;
            case 237 -> 159;
            case 238 -> 127;
            case 239 -> 134;
            case 240 -> 116;
            case 241 -> 221;
            case 242 -> 142;
            case 243 -> 128;
            case 244 -> 154;
            case 245 -> 203;
            case 246 -> 10;
            case 247 -> 230;
            case 248 -> 63;
            case 249 -> 64;
            case 250 -> 146;
            case 251 -> 102;
            case 252 -> 48;
            case 253 -> 161;
            case 254 -> 229;
            default -> 167;
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

   public static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      @NotNull
      private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final float IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static String[] a;
      private static String[] b;

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         @NotNull String var1,
         @NotNull IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl var2,
         int var3,
         boolean var4,
         float var5
      ) {
         short var10001 = 18045;
         short var10002 = -17168;
         Intrinsics.checkNotNullParameter(var1, "text");
         var10001 = 18046;
         var10002 = 17885;
         Intrinsics.checkNotNullParameter(var2, "font");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
      }

      @NotNull
      public final String a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final boolean d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final float e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @NotNull
      public final String f() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl g() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int h() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final boolean i() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final float j() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @NotNull
      public final IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
         @NotNull String var1,
         @NotNull IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl var2,
         int var3,
         boolean var4,
         float var5
      ) {
         short var10001 = 18043;
         short var10002 = 20170;
         Intrinsics.checkNotNullParameter(var1, "text");
         var10001 = 18042;
         var10002 = -13919;
         Intrinsics.checkNotNullParameter(var2, "font");
         return new IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            var1, var2, var3, var4, var5
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 18041;
         float var1 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         boolean var2 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         int var3 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         String var5 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -7447;
         short var10002 = 18047;
         short var10003 = -19983;
         short var10004 = 18040;
         short var10005 = 19062;
         short var10006 = 18044;
         short var10007 = -23695;
         short var10008 = 18036;
         short var10009 = -26609;
         return "TextCacheKey(text=" + var5 + ", font=" + var4 + ", color=" + var3 + ", mix=" + var2 + ", fontSize=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         var1 = var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
         var1 = var1 * 31 + Integer.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         var1 = var1 * 31 + Boolean.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         return var1 * 31 + Float.hashCode(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int[] var2 = llllIllllllIllllIlIlllllllIllIIlIlllIIIlllllllIlIIIlIIIlIIIIllIIllllIlIlIIIllIIlIIIlI.c();
         Object var10000 = this;
         if (var2 == null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == null) {
            if (!(
               var10000 instanceof IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = (IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var10000;
         int var4 = ((Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )) ? 1 : 0);
         if (var2 == null) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )) ? 1 : 0);
         }

         if (var2 == null) {
            if (var4 == 0) {
               return false;
            }

            var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         label64: {
            int var10001 = var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            if (var2 == null) {
               if (var4 != var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
                  return false;
               }

               var4 = ((this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0);
               if (var2 != null) {
                  break label64;
               }

               var10001 = ((var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0);
            }

            if (var4 != var10001) {
               return false;
            }

            var4 = Float.compare(
               this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
               var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            );
         }

         if (var2 == null) {
            if (var4 != 0) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[9];
         int var3 = 0;
         String var2 = "¿nÀ_\u009dY\u0004å\u0093Í\u0010\u0004ä\u0006«é\u0007\u008aÕm.Tø\f\b'dÝ\u0018å%7þ\u0012nU\u0098È\u001aI\u0013é\u009dàÀz2uë¹3¢\u0004\u0001c\u0017E";
         int var4 = "¿nÀ_\u009dY\u0004å\u0093Í\u0010\u0004ä\u0006«é\u0007\u008aÕm.Tø\f\b'dÝ\u0018å%7þ\u0012nU\u0098È\u001aI\u0013é\u009dàÀz2uë¹3¢\u0004\u0001c\u0017E"
            .length();
         char var1 = 6;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 70;
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
                        case 0 -> 10;
                        case 1 -> 25;
                        case 2 -> 60;
                        case 3 -> 114;
                        case 4 -> 52;
                        case 5 -> 11;
                        default -> 16;
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
                        b = new String[9];
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

                     var2 = "¼:\u001fÜ\u000bþh\u001a`CÈy\u0096\u0000ù.";
                     var4 = "¼:\u001fÜ\u000bþh\u001a`CÈy\u0096\u0000ù.".length();
                     var1 = 4;
                     var8 = -1;
               }

               var10000 = 120;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 18044) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 102;
               case 1 -> 133;
               case 2 -> 110;
               case 3 -> 103;
               case 4 -> 215;
               case 5 -> 254;
               case 6 -> 5;
               case 7 -> 249;
               case 8 -> 99;
               case 9 -> 126;
               case 10 -> 12;
               case 11 -> 172;
               case 12 -> 207;
               case 13 -> 85;
               case 14 -> 236;
               case 15 -> 38;
               case 16 -> 43;
               case 17 -> 251;
               case 18 -> 147;
               case 19 -> 166;
               case 20 -> 208;
               case 21 -> 136;
               case 22 -> 181;
               case 23 -> 28;
               case 24 -> 178;
               case 25 -> 95;
               case 26 -> 24;
               case 27 -> 179;
               case 28 -> 156;
               case 29 -> 51;
               case 30 -> 190;
               case 31 -> 168;
               case 32 -> 160;
               case 33 -> 123;
               case 34 -> 115;
               case 35 -> 228;
               case 36 -> 191;
               case 37 -> 234;
               case 38 -> 242;
               case 39 -> 41;
               case 40 -> 158;
               case 41 -> 195;
               case 42 -> 162;
               case 43 -> 3;
               case 44 -> 243;
               case 45 -> 185;
               case 46 -> 171;
               case 47 -> 206;
               case 48 -> 90;
               case 49 -> 101;
               case 50 -> 189;
               case 51 -> 240;
               case 52 -> 182;
               case 53 -> 138;
               case 54 -> 159;
               case 55 -> 211;
               case 56 -> 163;
               case 57 -> 203;
               case 58 -> 226;
               case 59 -> 141;
               case 60 -> 105;
               case 61 -> 106;
               case 62 -> 91;
               case 63 -> 32;
               case 64 -> 223;
               case 65 -> 11;
               case 66 -> 235;
               case 67 -> 137;
               case 68 -> 176;
               case 69 -> 194;
               case 70 -> 56;
               case 71 -> 27;
               case 72 -> 183;
               case 73 -> 144;
               case 74 -> 116;
               case 75 -> 193;
               case 76 -> 97;
               case 77 -> 118;
               case 78 -> 40;
               case 79 -> 72;
               case 80 -> 200;
               case 81 -> 164;
               case 82 -> 18;
               case 83 -> 86;
               case 84 -> 222;
               case 85 -> 134;
               case 86 -> 21;
               case 87 -> 107;
               case 88 -> 23;
               case 89 -> 114;
               case 90 -> 201;
               case 91 -> 109;
               case 92 -> 238;
               case 93 -> 148;
               case 94 -> 150;
               case 95 -> 196;
               case 96 -> 122;
               case 97 -> 197;
               case 98 -> 70;
               case 99 -> 63;
               case 100 -> 121;
               case 101 -> 151;
               case 102 -> 53;
               case 103 -> 209;
               case 104 -> 94;
               case 105 -> 65;
               case 106 -> 130;
               case 107 -> 47;
               case 108 -> 92;
               case 109 -> 145;
               case 110 -> 89;
               case 111 -> 84;
               case 112 -> 67;
               case 113 -> 75;
               case 114 -> 139;
               case 115 -> 78;
               case 116 -> 80;
               case 117 -> 45;
               case 118 -> 54;
               case 119 -> 48;
               case 120 -> 66;
               case 121 -> 132;
               case 122 -> 214;
               case 123 -> 233;
               case 124 -> 36;
               case 125 -> 77;
               case 126 -> 33;
               case 127 -> 52;
               case 128 -> 217;
               case 129 -> 188;
               case 130 -> 127;
               case 131 -> 76;
               case 132 -> 14;
               case 133 -> 204;
               case 134 -> 149;
               case 135 -> 64;
               case 136 -> 71;
               case 137 -> 247;
               case 138 -> 46;
               case 139 -> 157;
               case 140 -> 111;
               case 141 -> 30;
               case 142 -> 227;
               case 143 -> 213;
               case 144 -> 142;
               case 145 -> 61;
               case 146 -> 212;
               case 147 -> 17;
               case 148 -> 9;
               case 149 -> 165;
               case 150 -> 79;
               case 151 -> 129;
               case 152 -> 104;
               case 153 -> 2;
               case 154 -> 39;
               case 155 -> 255;
               case 156 -> 239;
               case 157 -> 225;
               case 158 -> 131;
               case 159 -> 161;
               case 160 -> 98;
               case 161 -> 199;
               case 162 -> 62;
               case 163 -> 248;
               case 164 -> 250;
               case 165 -> 140;
               case 166 -> 73;
               case 167 -> 44;
               case 168 -> 15;
               case 169 -> 19;
               case 170 -> 220;
               case 171 -> 96;
               case 172 -> 22;
               case 173 -> 82;
               case 174 -> 83;
               case 175 -> 210;
               case 176 -> 57;
               case 177 -> 231;
               case 178 -> 252;
               case 179 -> 58;
               case 180 -> 175;
               case 181 -> 221;
               case 182 -> 13;
               case 183 -> 59;
               case 184 -> 124;
               case 185 -> 35;
               case 186 -> 31;
               case 187 -> 192;
               case 188 -> 117;
               case 189 -> 180;
               case 190 -> 49;
               case 191 -> 81;
               case 192 -> 20;
               case 193 -> 187;
               case 194 -> 186;
               case 195 -> 205;
               case 196 -> 88;
               case 197 -> 216;
               case 198 -> 7;
               case 199 -> 218;
               case 200 -> 153;
               case 201 -> 167;
               case 202 -> 143;
               case 203 -> 25;
               case 204 -> 87;
               case 205 -> 169;
               case 206 -> 16;
               case 207 -> 253;
               case 208 -> 68;
               case 209 -> 112;
               case 210 -> 29;
               case 211 -> 154;
               case 212 -> 202;
               case 213 -> 246;
               case 214 -> 60;
               case 215 -> 230;
               case 216 -> 34;
               case 217 -> 26;
               case 218 -> 74;
               case 219 -> 232;
               case 220 -> 1;
               case 221 -> 229;
               case 222 -> 219;
               case 223 -> 10;
               case 224 -> 120;
               case 225 -> 245;
               case 226 -> 0;
               case 227 -> 55;
               case 228 -> 119;
               case 229 -> 42;
               case 230 -> 173;
               case 231 -> 135;
               case 232 -> 184;
               case 233 -> 224;
               case 234 -> 237;
               case 235 -> 174;
               case 236 -> 100;
               case 237 -> 244;
               case 238 -> 155;
               case 239 -> 170;
               case 240 -> 93;
               case 241 -> 8;
               case 242 -> 128;
               case 243 -> 146;
               case 244 -> 177;
               case 245 -> 152;
               case 246 -> 50;
               case 247 -> 108;
               case 248 -> 6;
               case 249 -> 125;
               case 250 -> 69;
               case 251 -> 4;
               case 252 -> 37;
               case 253 -> 241;
               case 254 -> 113;
               default -> 198;
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
       public static me.octo.client.utils.IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(me.octo.client.utils.IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var0, java.lang.String var1, me.octo.client.utils.IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl var2, int var3, boolean var4, float var5, int var6, java.lang.Object var7) {
           if ((var6 & 16) != 0) var5 = var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
           return var0.a(var1, var2, var3, var4, var5);
       }
   }

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      @NotNull
      private final IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final Vec3 lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final float IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final float lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final boolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         @NotNull IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1,
         @NotNull Vec3 var2,
         float var3,
         float var4,
         boolean var5
      ) {
         short var10001 = -3304;
         short var10002 = -14024;
         Intrinsics.checkNotNullParameter(var1, "entry");
         var10001 = -3302;
         var10002 = -3457;
         Intrinsics.checkNotNullParameter(var2, "pos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
      }

      @NotNull
      public final IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final Vec3 b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final float c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final float d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final boolean e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @NotNull
      public final IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll f() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final Vec3 g() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final float h() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final float i() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final boolean j() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @NotNull
      public final IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         @NotNull IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1,
         @NotNull Vec3 var2,
         float var3,
         float var4,
         boolean var5
      ) {
         short var10001 = -3303;
         short var10002 = 9618;
         Intrinsics.checkNotNullParameter(var1, "entry");
         var10001 = -3300;
         var10002 = -12082;
         Intrinsics.checkNotNullParameter(var2, "pos");
         return new IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var2, var3, var4, var5
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -3301;
         boolean var1 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         float var2 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         float var3 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         Vec3 var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var5 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 21815;
         short var10002 = -3311;
         short var10003 = -30510;
         short var10004 = -3297;
         short var10005 = -14443;
         short var10006 = -3299;
         short var10007 = 6961;
         short var10008 = -3298;
         short var10009 = -25499;
         return "BatchedTextEntry(entry=" + var5 + ", pos=" + var4 + ", scale=" + var3 + ", yOffset=" + var2 + ", throughWalls=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         var1 = var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
         var1 = var1 * 31 + Float.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         var1 = var1 * 31 + Float.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         return var1 * 31 + Boolean.hashCode(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int[] var2 = llllIllllllIllllIlIlllllllIllIIlIlllIIIlllllllIlIIIlIIIlIIIIllIIllllIlIlIIIllIIlIIIlI.c();
         Object var10000 = this;
         if (var2 == null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == null) {
            if (!(
               var10000 instanceof IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = var1;
         }

         IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
         int var4 = ((Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )) ? 1 : 0);
         if (var2 == null) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )) ? 1 : 0);
         }

         if (var2 == null) {
            if (var4 == 0) {
               return false;
            }

            var4 = Float.compare(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            );
         }

         if (var2 == null) {
            if (var4 != 0) {
               return false;
            }

            var4 = Float.compare(
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            );
         }

         if (var2 == null) {
            if (var4 != 0) {
               return false;
            }

            var4 = ((this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) ? 1 : 0);
         }

         if (var2 == null) {
            if (var4 !=( (!var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) ? 1 : 0)) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[9];
         int var3 = 0;
         String var2 = "\u000eÒÄ{S\u0005Ö\u0098ß20\u0017,GC6²\u0002÷¬©\u008bx\u000b5X\u0006Rl\u0089\u0086\"¡¶ï\u0003úPê\n\u008b³\u0019í[Ó\u0012ÄñÔ\u0003áÖ\u0089\bÊº;àSÑâ\u0097";
         int var4 = "\u000eÒÄ{S\u0005Ö\u0098ß20\u0017,GC6²\u0002÷¬©\u008bx\u000b5X\u0006Rl\u0089\u0086\"¡¶ï\u0003úPê\n\u008b³\u0019í[Ó\u0012ÄñÔ\u0003áÖ\u0089\bÊº;àSÑâ\u0097"
            .length();
         char var1 = 5;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 55;
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
                        case 0 -> 107;
                        case 1 -> 65;
                        case 2 -> 4;
                        case 3 -> 9;
                        case 4 -> 25;
                        case 5 -> 94;
                        default -> 82;
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
                        b = new String[9];
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

                     var2 = "ó®\u001el\u0006,,\u0014éãÌà\u0013+Ê\u0006ú\u0016;|'\u009b";
                     var4 = "ó®\u001el\u0006,,\u0014éãÌà\u0013+Ê\u0006ú\u0016;|'\u009b".length();
                     var1 = 15;
                     var8 = -1;
               }

               var10000 = 22;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -3303) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 62;
               case 1 -> 125;
               case 2 -> 151;
               case 3 -> 236;
               case 4 -> 100;
               case 5 -> 92;
               case 6 -> 89;
               case 7 -> 55;
               case 8 -> 80;
               case 9 -> 49;
               case 10 -> 99;
               case 11 -> 76;
               case 12 -> 155;
               case 13 -> 112;
               case 14 -> 121;
               case 15 -> 235;
               case 16 -> 184;
               case 17 -> 214;
               case 18 -> 65;
               case 19 -> 79;
               case 20 -> 98;
               case 21 -> 141;
               case 22 -> 154;
               case 23 -> 220;
               case 24 -> 48;
               case 25 -> 216;
               case 26 -> 226;
               case 27 -> 230;
               case 28 -> 102;
               case 29 -> 126;
               case 30 -> 31;
               case 31 -> 13;
               case 32 -> 190;
               case 33 -> 139;
               case 34 -> 113;
               case 35 -> 6;
               case 36 -> 23;
               case 37 -> 210;
               case 38 -> 122;
               case 39 -> 251;
               case 40 -> 12;
               case 41 -> 101;
               case 42 -> 84;
               case 43 -> 115;
               case 44 -> 172;
               case 45 -> 43;
               case 46 -> 156;
               case 47 -> 161;
               case 48 -> 30;
               case 49 -> 42;
               case 50 -> 227;
               case 51 -> 15;
               case 52 -> 152;
               case 53 -> 130;
               case 54 -> 97;
               case 55 -> 199;
               case 56 -> 41;
               case 57 -> 186;
               case 58 -> 16;
               case 59 -> 136;
               case 60 -> 68;
               case 61 -> 3;
               case 62 -> 166;
               case 63 -> 116;
               case 64 -> 176;
               case 65 -> 0;
               case 66 -> 168;
               case 67 -> 94;
               case 68 -> 72;
               case 69 -> 19;
               case 70 -> 197;
               case 71 -> 127;
               case 72 -> 233;
               case 73 -> 38;
               case 74 -> 134;
               case 75 -> 22;
               case 76 -> 200;
               case 77 -> 183;
               case 78 -> 201;
               case 79 -> 194;
               case 80 -> 158;
               case 81 -> 56;
               case 82 -> 91;
               case 83 -> 255;
               case 84 -> 17;
               case 85 -> 143;
               case 86 -> 146;
               case 87 -> 77;
               case 88 -> 165;
               case 89 -> 215;
               case 90 -> 208;
               case 91 -> 167;
               case 92 -> 118;
               case 93 -> 175;
               case 94 -> 66;
               case 95 -> 59;
               case 96 -> 83;
               case 97 -> 231;
               case 98 -> 120;
               case 99 -> 239;
               case 100 -> 58;
               case 101 -> 159;
               case 102 -> 69;
               case 103 -> 45;
               case 104 -> 81;
               case 105 -> 60;
               case 106 -> 9;
               case 107 -> 148;
               case 108 -> 35;
               case 109 -> 245;
               case 110 -> 70;
               case 111 -> 238;
               case 112 -> 5;
               case 113 -> 150;
               case 114 -> 53;
               case 115 -> 170;
               case 116 -> 206;
               case 117 -> 174;
               case 118 -> 8;
               case 119 -> 32;
               case 120 -> 204;
               case 121 -> 44;
               case 122 -> 242;
               case 123 -> 34;
               case 124 -> 119;
               case 125 -> 240;
               case 126 -> 182;
               case 127 -> 177;
               case 128 -> 106;
               case 129 -> 124;
               case 130 -> 7;
               case 131 -> 164;
               case 132 -> 11;
               case 133 -> 229;
               case 134 -> 88;
               case 135 -> 39;
               case 136 -> 18;
               case 137 -> 142;
               case 138 -> 73;
               case 139 -> 57;
               case 140 -> 108;
               case 141 -> 135;
               case 142 -> 195;
               case 143 -> 247;
               case 144 -> 51;
               case 145 -> 33;
               case 146 -> 198;
               case 147 -> 114;
               case 148 -> 104;
               case 149 -> 181;
               case 150 -> 219;
               case 151 -> 144;
               case 152 -> 47;
               case 153 -> 228;
               case 154 -> 29;
               case 155 -> 61;
               case 156 -> 157;
               case 157 -> 212;
               case 158 -> 10;
               case 159 -> 203;
               case 160 -> 248;
               case 161 -> 149;
               case 162 -> 123;
               case 163 -> 4;
               case 164 -> 82;
               case 165 -> 25;
               case 166 -> 169;
               case 167 -> 211;
               case 168 -> 95;
               case 169 -> 224;
               case 170 -> 117;
               case 171 -> 232;
               case 172 -> 196;
               case 173 -> 26;
               case 174 -> 103;
               case 175 -> 85;
               case 176 -> 213;
               case 177 -> 63;
               case 178 -> 254;
               case 179 -> 188;
               case 180 -> 244;
               case 181 -> 138;
               case 182 -> 249;
               case 183 -> 75;
               case 184 -> 21;
               case 185 -> 253;
               case 186 -> 180;
               case 187 -> 162;
               case 188 -> 27;
               case 189 -> 1;
               case 190 -> 129;
               case 191 -> 109;
               case 192 -> 218;
               case 193 -> 64;
               case 194 -> 147;
               case 195 -> 179;
               case 196 -> 111;
               case 197 -> 250;
               case 198 -> 132;
               case 199 -> 163;
               case 200 -> 40;
               case 201 -> 46;
               case 202 -> 96;
               case 203 -> 28;
               case 204 -> 133;
               case 205 -> 2;
               case 206 -> 107;
               case 207 -> 86;
               case 208 -> 131;
               case 209 -> 74;
               case 210 -> 205;
               case 211 -> 78;
               case 212 -> 93;
               case 213 -> 52;
               case 214 -> 241;
               case 215 -> 54;
               case 216 -> 246;
               case 217 -> 36;
               case 218 -> 202;
               case 219 -> 222;
               case 220 -> 37;
               case 221 -> 67;
               case 222 -> 137;
               case 223 -> 20;
               case 224 -> 191;
               case 225 -> 217;
               case 226 -> 145;
               case 227 -> 178;
               case 228 -> 185;
               case 229 -> 128;
               case 230 -> 252;
               case 231 -> 173;
               case 232 -> 187;
               case 233 -> 24;
               case 234 -> 140;
               case 235 -> 160;
               case 236 -> 71;
               case 237 -> 237;
               case 238 -> 243;
               case 239 -> 223;
               case 240 -> 192;
               case 241 -> 209;
               case 242 -> 87;
               case 243 -> 207;
               case 244 -> 50;
               case 245 -> 171;
               case 246 -> 234;
               case 247 -> 221;
               case 248 -> 225;
               case 249 -> 90;
               case 250 -> 105;
               case 251 -> 14;
               case 252 -> 193;
               case 253 -> 153;
               case 254 -> 189;
               default -> 110;
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
       public static me.octo.client.utils.IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(me.octo.client.utils.IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var0, me.octo.client.utils.IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1, net.minecraft.world.phys.Vec3 var2, float var3, float var4, boolean var5, int var6, java.lang.Object var7) {
           return var0.a(var1, var2, var3, var4, var5);
       }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private final float IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final float lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final float IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final float lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final float IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private final float IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private long IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         float var1, float var2, float var3, float var4, float var5, float var6, long var7
      ) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var6;
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var7;
      }

      public final float a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final float b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final float c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final float d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final float e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final float f() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final long g() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      public final void a(long var1) {
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var1;
      }

      public final float h() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final float i() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final float j() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final float k() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final float l() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final float m() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final long n() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      @NotNull
      public final IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         float var1, float var2, float var3, float var4, float var5, float var6, long var7
      ) {
         return new IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2, var3, var4, var5, var6, var7
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -15509;
         long var1 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         float var3 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         float var4 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         float var5 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         float var6 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         float var7 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         float var8 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -5113;
         short var10002 = -15511;
         short var10003 = -23311;
         short var10004 = -15506;
         short var10005 = -28203;
         short var10006 = -15512;
         short var10007 = -23464;
         short var10008 = -15505;
         short var10009 = -1346;
         short var10010 = -15510;
         short var10011 = 6520;
         short var10012 = -15508;
         short var10013 = -14844;
         return "AtlasEntry(u0="
            + var8
            + ", v0="
            + var7
            + ", u1="
            + var6
            + ", v1="
            + var5
            + ", displayWidth="
            + var4
            + ", displayHeight="
            + var3
            + ", lastUsed="
            + var1
            + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Float.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var1 = var1 * 31 + Float.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         var1 = var1 * 31 + Float.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         var1 = var1 * 31 + Float.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         var1 = var1 * 31 + Float.hashCode(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         var1 = var1 * 31 + Float.hashCode(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
         return var1 * 31 + Long.hashCode(this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int[] var2 = llllIllllllIllllIlIlllllllIllIIlIlllIIIlllllllIlIIIlIIIlIIIIllIIllllIlIlIIIllIIlIIIlI.c();
         Object var10000 = this;
         if (var2 == null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == null) {
            if (!(
               var10000 instanceof IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         int var4 = Float.compare(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         );
         if (var2 == null) {
            if (var4 != 0) {
               return false;
            }

            var4 = Float.compare(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
         }

         if (var2 == null) {
            if (var4 != 0) {
               return false;
            }

            var4 = Float.compare(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            );
         }

         if (var2 == null) {
            if (var4 != 0) {
               return false;
            }

            var4 = Float.compare(
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            );
         }

         if (var2 == null) {
            if (var4 != 0) {
               return false;
            }

            var4 = Float.compare(
               this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
               var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            );
         }

         if (var2 == null) {
            if (var4 != 0) {
               return false;
            }

            var4 = Float.compare(
               this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
               var3.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            );
         }

         if (var2 == null) {
            if (var4 != 0) {
               return false;
            }

            long var5;
            var4 = (
                     var5 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
                        - var3.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
                  )
                  == 0L
               ? 0
               : (var5 < 0L ? -1 : 1);
         }

         if (var2 == null) {
            if (var4 != 0) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[7];
         int var3 = 0;
         String var2 = "=®´\u0013¿·¾æ»\u0007Ïz¶[&Ç\u000eÅ%c´L\u007fÂy}r0ßú%\u0005\u0092\u0012SÜ]\u0005ñ\u0098?\u008cÐ\u0005\u0082rRÐ\u001e";
         int var4 = "=®´\u0013¿·¾æ»\u0007Ïz¶[&Ç\u000eÅ%c´L\u007fÂy}r0ßú%\u0005\u0092\u0012SÜ]\u0005ñ\u0098?\u008cÐ\u0005\u0082rRÐ\u001e".length();
         char var1 = 16;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 43;
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
                        case 0 -> 45;
                        case 1 -> 29;
                        case 2 -> 53;
                        case 3 -> 102;
                        case 4 -> 90;
                        case 5 -> 99;
                        default -> 61;
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

                     var2 = "ì\u009c\\\u0087p÷\u0095<\f\u0091ç\u008bÿ\u001bå\u000b\u001dgjð¿\u0014UÖ\u0016¯o";
                     var4 = "ì\u009c\\\u0087p÷\u0095<\f\u0091ç\u008bÿ\u001bå\u000b\u001dgjð¿\u0014UÖ\u0016¯o".length();
                     var1 = 15;
                     var8 = -1;
               }

               var10000 = 86;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -15510) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 10;
               case 1 -> 245;
               case 2 -> 151;
               case 3 -> 6;
               case 4 -> 113;
               case 5 -> 232;
               case 6 -> 28;
               case 7 -> 96;
               case 8 -> 13;
               case 9 -> 122;
               case 10 -> 225;
               case 11 -> 207;
               case 12 -> 93;
               case 13 -> 213;
               case 14 -> 61;
               case 15 -> 85;
               case 16 -> 90;
               case 17 -> 152;
               case 18 -> 105;
               case 19 -> 210;
               case 20 -> 172;
               case 21 -> 212;
               case 22 -> 211;
               case 23 -> 35;
               case 24 -> 233;
               case 25 -> 238;
               case 26 -> 78;
               case 27 -> 72;
               case 28 -> 230;
               case 29 -> 147;
               case 30 -> 150;
               case 31 -> 228;
               case 32 -> 125;
               case 33 -> 58;
               case 34 -> 75;
               case 35 -> 190;
               case 36 -> 174;
               case 37 -> 48;
               case 38 -> 15;
               case 39 -> 57;
               case 40 -> 180;
               case 41 -> 4;
               case 42 -> 16;
               case 43 -> 251;
               case 44 -> 49;
               case 45 -> 2;
               case 46 -> 40;
               case 47 -> 169;
               case 48 -> 193;
               case 49 -> 84;
               case 50 -> 91;
               case 51 -> 94;
               case 52 -> 199;
               case 53 -> 101;
               case 54 -> 12;
               case 55 -> 206;
               case 56 -> 248;
               case 57 -> 103;
               case 58 -> 71;
               case 59 -> 97;
               case 60 -> 24;
               case 61 -> 32;
               case 62 -> 17;
               case 63 -> 188;
               case 64 -> 187;
               case 65 -> 198;
               case 66 -> 118;
               case 67 -> 247;
               case 68 -> 191;
               case 69 -> 139;
               case 70 -> 112;
               case 71 -> 92;
               case 72 -> 155;
               case 73 -> 182;
               case 74 -> 123;
               case 75 -> 208;
               case 76 -> 156;
               case 77 -> 114;
               case 78 -> 215;
               case 79 -> 200;
               case 80 -> 42;
               case 81 -> 203;
               case 82 -> 145;
               case 83 -> 165;
               case 84 -> 77;
               case 85 -> 146;
               case 86 -> 67;
               case 87 -> 196;
               case 88 -> 249;
               case 89 -> 219;
               case 90 -> 159;
               case 91 -> 98;
               case 92 -> 176;
               case 93 -> 229;
               case 94 -> 195;
               case 95 -> 0;
               case 96 -> 52;
               case 97 -> 54;
               case 98 -> 221;
               case 99 -> 237;
               case 100 -> 164;
               case 101 -> 73;
               case 102 -> 186;
               case 103 -> 56;
               case 104 -> 74;
               case 105 -> 8;
               case 106 -> 108;
               case 107 -> 214;
               case 108 -> 254;
               case 109 -> 126;
               case 110 -> 20;
               case 111 -> 178;
               case 112 -> 79;
               case 113 -> 5;
               case 114 -> 76;
               case 115 -> 1;
               case 116 -> 250;
               case 117 -> 68;
               case 118 -> 83;
               case 119 -> 27;
               case 120 -> 55;
               case 121 -> 87;
               case 122 -> 44;
               case 123 -> 46;
               case 124 -> 226;
               case 125 -> 177;
               case 126 -> 149;
               case 127 -> 143;
               case 128 -> 124;
               case 129 -> 244;
               case 130 -> 168;
               case 131 -> 31;
               case 132 -> 45;
               case 133 -> 30;
               case 134 -> 167;
               case 135 -> 99;
               case 136 -> 62;
               case 137 -> 81;
               case 138 -> 14;
               case 139 -> 157;
               case 140 -> 234;
               case 141 -> 204;
               case 142 -> 158;
               case 143 -> 127;
               case 144 -> 102;
               case 145 -> 136;
               case 146 -> 65;
               case 147 -> 100;
               case 148 -> 160;
               case 149 -> 80;
               case 150 -> 128;
               case 151 -> 3;
               case 152 -> 137;
               case 153 -> 154;
               case 154 -> 246;
               case 155 -> 138;
               case 156 -> 41;
               case 157 -> 107;
               case 158 -> 53;
               case 159 -> 217;
               case 160 -> 9;
               case 161 -> 241;
               case 162 -> 38;
               case 163 -> 253;
               case 164 -> 218;
               case 165 -> 135;
               case 166 -> 252;
               case 167 -> 63;
               case 168 -> 243;
               case 169 -> 21;
               case 170 -> 255;
               case 171 -> 115;
               case 172 -> 25;
               case 173 -> 47;
               case 174 -> 240;
               case 175 -> 104;
               case 176 -> 162;
               case 177 -> 179;
               case 178 -> 148;
               case 179 -> 231;
               case 180 -> 185;
               case 181 -> 95;
               case 182 -> 153;
               case 183 -> 43;
               case 184 -> 224;
               case 185 -> 163;
               case 186 -> 173;
               case 187 -> 192;
               case 188 -> 69;
               case 189 -> 37;
               case 190 -> 106;
               case 191 -> 144;
               case 192 -> 171;
               case 193 -> 170;
               case 194 -> 175;
               case 195 -> 133;
               case 196 -> 110;
               case 197 -> 202;
               case 198 -> 242;
               case 199 -> 194;
               case 200 -> 189;
               case 201 -> 23;
               case 202 -> 132;
               case 203 -> 19;
               case 204 -> 26;
               case 205 -> 220;
               case 206 -> 119;
               case 207 -> 34;
               case 208 -> 117;
               case 209 -> 64;
               case 210 -> 109;
               case 211 -> 131;
               case 212 -> 39;
               case 213 -> 197;
               case 214 -> 142;
               case 215 -> 235;
               case 216 -> 89;
               case 217 -> 222;
               case 218 -> 216;
               case 219 -> 66;
               case 220 -> 70;
               case 221 -> 141;
               case 222 -> 121;
               case 223 -> 181;
               case 224 -> 227;
               case 225 -> 223;
               case 226 -> 11;
               case 227 -> 183;
               case 228 -> 60;
               case 229 -> 161;
               case 230 -> 82;
               case 231 -> 120;
               case 232 -> 129;
               case 233 -> 166;
               case 234 -> 236;
               case 235 -> 50;
               case 236 -> 130;
               case 237 -> 134;
               case 238 -> 116;
               case 239 -> 239;
               case 240 -> 86;
               case 241 -> 184;
               case 242 -> 18;
               case 243 -> 59;
               case 244 -> 33;
               case 245 -> 29;
               case 246 -> 140;
               case 247 -> 22;
               case 248 -> 36;
               case 249 -> 209;
               case 250 -> 201;
               case 251 -> 88;
               case 252 -> 205;
               case 253 -> 111;
               case 254 -> 51;
               default -> 7;
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
       public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(float var0, float var1, float var2, float var3, float var4, float var5, long var6, int var7, kotlin.jvm.internal.DefaultConstructorMarker var8) { this(var0, var1, var2, var3, var4, var5, (var7 & 64) != 0 ? java.lang.System.currentTimeMillis() : var6); }
       public static me.octo.client.utils.IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(me.octo.client.utils.IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0, float var1, float var2, float var3, float var4, float var5, float var6, long var7, int var8, java.lang.Object var9) {
           if ((var8 & 64) != 0) var7 = var0.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
           return var0.a(var1, var2, var3, var4, var5, var6, var7);
       }
   }

   public static void a(
      me.octo.client.utils.IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl var0,
      net.fabricmc.fabric.api.client.rendering.v1.level.LevelRenderContext var1,
      net.minecraft.network.chat.Component var2,
      net.minecraft.world.phys.Vec3 var3,
      float var4,
      float var5,
      boolean var6,
      me.octo.client.utils.IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl var7,
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var8,
      boolean var9,
      float var10,
      int var11,
      java.lang.Object var12
   ) {
      if ((var11 & 8) != 0) {
         var4 = 1.0F;
      }
      if ((var11 & 16) != 0) {
         var5 = 0.0F;
      }
      if ((var11 & 32) != 0) {
         var6 = false;
      }
      if ((var11 & 64) != 0) {
         var7 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }
      if ((var11 & 128) != 0) {
         var8 = me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      }
      if ((var11 & 256) != 0) {
         var9 = false;
      }
      if ((var11 & 512) != 0) {
         var10 = 16.0F;
      }
      
      var0.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public static void a(
      me.octo.client.utils.IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl var0,
      net.fabricmc.fabric.api.client.rendering.v1.level.LevelRenderContext var1,
      net.minecraft.network.chat.Component var2,
      net.minecraft.world.phys.Vec3 var3,
      float var4,
      boolean var5,
      me.octo.client.utils.IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl var6,
      int var7,
      java.lang.Object var8
   ) {
      if ((var7 & 32) != 0) {
         var6 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }
      
      var0.a(var1, var2, var3, var4, var5, var6);
   }

   public static void a(
      me.octo.client.utils.IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl var0,
      net.fabricmc.fabric.api.client.rendering.v1.level.LevelRenderContext var1,
      net.minecraft.network.chat.Component var2,
      net.minecraft.world.phys.Vec3 var3,
      float var4,
      boolean var5,
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6,
      boolean var7,
      me.octo.client.utils.IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl var8,
      int var9,
      java.lang.Object var10
   ) {
      if ((var9 & 64) != 0) {
         var7 = false;
      }
      if ((var9 & 128) != 0) {
         var8 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }
      
      var0.a(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public static void a(
      me.octo.client.utils.IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl var0,
      net.fabricmc.fabric.api.client.rendering.v1.level.LevelRenderContext var1,
      net.minecraft.network.chat.Component var2,
      net.minecraft.world.phys.Vec3 var3,
      float var4,
      float var5,
      boolean var6,
      me.octo.client.utils.IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl var7,
      int var8,
      java.lang.Object var9
   ) {
      if ((var8 & 64) != 0) {
         var7 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }
      
      var0.a(var1, var2, var3, var4, var5, var6, var7);
   }
}
