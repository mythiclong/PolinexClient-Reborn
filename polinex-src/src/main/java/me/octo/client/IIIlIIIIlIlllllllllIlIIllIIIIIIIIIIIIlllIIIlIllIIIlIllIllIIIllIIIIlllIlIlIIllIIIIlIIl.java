package me.octo.client;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.ColorTargetState;
import com.mojang.blaze3d.pipeline.DepthStencilState;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Builder;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.shaders.UniformType;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.VertexFormat.Mode;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Iterator;
import java.util.Map.Entry;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.utils.lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII;
import me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

public final class IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl {
   @NotNull
   public static IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Object2ObjectOpenHashMap<Identifier, RenderPipeline> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @JvmField
   @NotNull
   public static RenderPipeline IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @JvmField
   @NotNull
   public static RenderPipeline lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @JvmField
   @NotNull
   public static RenderPipeline IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @JvmField
   @NotNull
   public static RenderPipeline IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @JvmField
   @NotNull
   public static RenderPipeline IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @JvmField
   @NotNull
   public static RenderPipeline lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @JvmField
   @NotNull
   public static RenderPipeline IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @JvmField
   @NotNull
   public static RenderPipeline llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private static RenderPipeline lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private static RenderPipeline lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private static RenderPipeline lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private static RenderPipeline lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private static RenderPipeline IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private static RenderPipeline llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @JvmField
   @NotNull
   public static RenderPipeline IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @JvmField
   @NotNull
   public static RenderPipeline IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @JvmField
   @NotNull
   public static RenderPipeline IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   @JvmField
   @NotNull
   public static RenderPipeline IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   @JvmField
   @NotNull
   public static RenderPipeline llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   @JvmField
   @NotNull
   public static RenderPipeline IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   @JvmField
   @NotNull
   public static RenderPipeline lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   @JvmField
   @NotNull
   public static RenderPipeline llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   @JvmField
   @NotNull
   public static RenderPipeline lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   @JvmField
   @NotNull
   public static RenderPipeline IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   @JvmField
   @NotNull
   public static RenderPipeline IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   @JvmField
   @NotNull
   public static RenderPipeline IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   @JvmField
   @NotNull
   public static RenderPipeline llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   @JvmField
   @NotNull
   public static RenderPipeline lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   @JvmField
   @NotNull
   public static RenderPipeline IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   @JvmField
   @NotNull
   public static RenderPipeline IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   @JvmField
   @NotNull
   public static RenderPipeline lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   @JvmField
   @NotNull
   public static RenderPipeline lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
   @JvmField
   @NotNull
   public static RenderPipeline IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
   @JvmField
   @NotNull
   public static RenderPipeline IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
   @JvmField
   @NotNull
   public static RenderPipeline IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI;
   private static String[] a;
   private static String[] b;

   private IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl() {
   }

   @NotNull
   public final RenderPipeline a(@NotNull String var1, @NotNull Function1<? super Builder, Unit> var2) {
      short var10001 = -22417;
      short var10002 = 1445;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = -22444;
      var10002 = 13870;
      Intrinsics.checkNotNullParameter(var2, "builderAction");
      var10002 = -22432;
      short var10003 = -13700;
      Identifier var3 = Polinex.a("pipeline/" + var1);
      Builder var4 = IlIlIlllIllllIlllIlIlIIllIlIIlIIIIlIlIIIlIllIIlIlIllllIIllIlIIIllIlIIIlIIIlIIIIIlIIlI.a().withLocation(var3);
      var2.invoke(var4);
      RenderPipeline var9 = var4.build();
      boolean var6 = false;
      if ((RenderPipeline)lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.put(var3, var9) != null) {
         boolean var8 = false;
         var10003 = -22433;
         short var10004 = 2455;
         throw new IllegalStateException(("Duplicated render pipeline: " + var3).toString());
      } else {
         var10002 = -22463;
         var10003 = -8045;
         Intrinsics.checkNotNullExpressionValue(var9, "also(...)");
         return var9;
      }
   }

   @NotNull
   public final Builder a(@NotNull Builder var1, @NotNull llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll var2) {
      short var10001 = -22454;
      short var10002 = 28351;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      var10001 = -22447;
      var10002 = -6313;
      Intrinsics.checkNotNullParameter(var2, "define");
      boolean var3 = false;
      Builder var10000 = var1.withUniform(var2.a(), UniformType.UNIFORM_BUFFER);
      var10002 = -22406;
      short var10003 = -17544;
      Intrinsics.checkNotNullExpressionValue(var10000, "withUniform(...)");
      return var10000;
   }

   private final void a(Builder param1, boolean param2) {
      param1.withCull(false);

      try {
         param1.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
         if (param2) {
            param1.withDepthStencilState(
               lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a()
            );
         }
      } catch (IllegalStateException var4) {
         throw (RuntimeException)a(var4);
      }
   }

   static void a(IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl var0, Builder var1, boolean var2, int var3, Object var4) {
      // PX-FIX PhaseA res2 R8: Kotlin static default-args bridge (renamed a$default -> a by the
      // obfuscator). The jar evaluates the default from <missing nested class>.b(), a mutable static
      // state flag whose initial value is false; mask bit 0 selects that default for var2.
      if ((var3 & 1) != 0) {
         var2 = false;
      }
      var0.a(var1, var2);
   }

   @NotNull
   public final Builder a(@NotNull Builder var1) {
      short var10001 = -22436;
      short var10002 = -6271;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      boolean var2 = false;
      boolean var5 = false;
      var10001 = -22458;
      var10002 = 21258;
      var1.withVertexShader("core/screenquad");
      var1.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      return var1;
   }

   private final void a(Builder var1, Mode var2) {
      Snippet var10001 = RenderPipelines.DEBUG_FILLED_SNIPPET;
      short var10003 = -22415;
      short var10004 = -24011;
      Intrinsics.checkNotNullExpressionValue(RenderPipelines.DEBUG_FILLED_SNIPPET, "DEBUG_FILLED_SNIPPET");
      IlIlIlllIllllIlllIlIlIIllIlIIlIIIIlIlIIIlIllIIlIlIllllIIllIlIIIllIlIIIlIIIlIIIIIlIIlI.a(var1, var10001);
      var1.withVertexFormat(DefaultVertexFormat.POSITION_COLOR, var2);
   }

   private final void b(Builder var1, Mode var2) {
      boolean var3 = false;
      var1.withVertexShader(
         lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
      var1.withFragmentShader(
         lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
      var1.withVertexFormat(DefaultVertexFormat.POSITION, var2);
   }

   private final void c(Builder var1, Mode var2) {
      boolean var3 = false;
      var1.withVertexShader(
         lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
      );
      short var10001 = -22408;
      short var10002 = -17185;
      var1.withFragmentShader("core/position_color");
      var1.withVertexFormat(DefaultVertexFormat.POSITION_COLOR, var2);
   }

   @JvmStatic
   @NotNull
   public static final RenderPipeline a(boolean var0) {
      try {
         if (var0) {
            return lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
         }
      } catch (IllegalStateException var1) {
         throw (RuntimeException)a(var1);
      }

      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   @JvmStatic
   @NotNull
   public static final RenderPipeline b(boolean var0) {
      try {
         if (var0) {
            return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         }
      } catch (IllegalStateException var1) {
         throw (RuntimeException)a(var1);
      }

      return lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   }

   @JvmStatic
   @NotNull
   public static final RenderPipeline c(boolean var0) {
      try {
         if (var0) {
            return IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
         }
      } catch (IllegalStateException var1) {
         throw (RuntimeException)a(var1);
      }

      return llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   }

   public final void a() {
      int var10000 = ((IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.b()) ? 1 : 0);
      Object2ObjectOpenHashMap var2 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      boolean var3 = false;
      ObjectIterator var10001 = var2.object2ObjectEntrySet().fastIterator();
      short var10003 = -22452;
      short var10004 = 5775;
      Intrinsics.checkNotNullExpressionValue(var10001, "fastIterator(...)");
      Iterator var10 = (Iterator)var10001;
      boolean var1 = (var10000 != 0);
      var3 = false;
      Iterator var4 = var10;

      while (true) {
         if (var4.hasNext()) {
            Object var5 = var4.next();
            Entry var6 = (Entry)var5;
            boolean var7 = false;
            RenderPipeline var8 = (RenderPipeline)var6.getValue();

            try {
               lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.a()
                  .precompilePipeline(
                     var8,
                     lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  );
               if (!var1) {
                  break;
               }

               if (var1) {
                  continue;
               }
            } catch (IllegalStateException var9) {
               throw (RuntimeException)a(var9);
            }
         }

         var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.size();
         short var13 = -22423;
         short var10002 = -32253;
         var10002 = -22441;
         var10003 = 28360;
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Loaded " + var10000 + " Render Pipelines.");
         break;
      }
   }

   private static final Unit b(Builder var0) {
      short var10001 = -22407;
      short var10002 = 26641;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      Snippet var5 = RenderPipelines.LINES_SNIPPET;
      short var10003 = -22526;
      short var10004 = 1257;
      Intrinsics.checkNotNullExpressionValue(RenderPipelines.LINES_SNIPPET, "LINES_SNIPPET");
      IlIlIlllIllllIlllIlIlIIllIlIIlIIIIlIlIIIlIllIIlIlIllllIIllIlIIIllIlIIIlIIIlIIIIIlIIlI.a(var0, var5);
      var0.withDepthStencilState(new DepthStencilState(CompareOp.LESS_THAN_OR_EQUAL, false));
      IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var3 = true;
      boolean var4 = false;
      var0.withCull(false);
      var0.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var0.withDepthStencilState(lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a());
      return Unit.INSTANCE;
   }

   private static final Unit c(Builder var0) {
      short var10001 = -22407;
      short var10002 = 26641;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0, Mode.DEBUG_LINES);
      IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var3 = true;
      boolean var4 = false;
      var0.withCull(false);
      var0.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var0.withDepthStencilState(lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a());
      return Unit.INSTANCE;
   }

   private static final Unit d(Builder var0) {
      short var10001 = -22407;
      short var10002 = 26641;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0, Mode.DEBUG_LINE_STRIP);
      IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var3 = true;
      boolean var4 = false;
      var0.withCull(false);
      var0.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var0.withDepthStencilState(lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a());
      return Unit.INSTANCE;
   }

   private static final Unit e(Builder var0) {
      short var10001 = -22407;
      short var10002 = 26641;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0, Mode.TRIANGLES);
      IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var3 = true;
      boolean var4 = false;
      var0.withCull(false);
      var0.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var0.withDepthStencilState(lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a());
      return Unit.INSTANCE;
   }

   private static final Unit f(Builder var0) {
      short var10001 = -22407;
      short var10002 = 26641;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0, Mode.QUADS);
      IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var3 = true;
      boolean var4 = false;
      var0.withCull(false);
      var0.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var0.withDepthStencilState(lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a());
      return Unit.INSTANCE;
   }

   private static final Unit g(Builder var0) {
      short var10001 = -22407;
      short var10002 = 26641;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      var0.withVertexShader(
         lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
      );
      var0.withFragmentShader(
         lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll
      );
      var0.withVertexFormat(DefaultVertexFormat.POSITION_COLOR, Mode.QUADS);
      var0.withCull(false);
      var0.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var0.withDepthStencilState(lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a());
      return Unit.INSTANCE;
   }

   private static final Unit h(Builder var0) {
      short var10001 = -22407;
      short var10002 = 26641;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      var0.withVertexShader(
         lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
      );
      var0.withFragmentShader(
         lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll
      );
      var0.withVertexFormat(DefaultVertexFormat.POSITION_TEX_COLOR, Mode.QUADS);
      var0.withCull(false);
      var0.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var0.withDepthStencilState(lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a());
      return Unit.INSTANCE;
   }

   private static final Unit i(Builder var0) {
      short var10001 = -22407;
      short var10002 = 26641;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0, Mode.QUADS);
      var0.withCull(false);
      var0.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var0.withDepthStencilState(new DepthStencilState(CompareOp.LESS_THAN_OR_EQUAL, true, 1.0F, -1.0E7F));
      return Unit.INSTANCE;
   }

   private static final Unit j(Builder var0) {
      short var10001 = -22407;
      short var10002 = 26641;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      Snippet var11 = RenderPipelines.DEBUG_FILLED_SNIPPET;
      short var10003 = -22522;
      short var10004 = 1713;
      Intrinsics.checkNotNullExpressionValue(RenderPipelines.DEBUG_FILLED_SNIPPET, "DEBUG_FILLED_SNIPPET");
      IlIlIlllIllllIlllIlIlIIllIlIIlIIIIlIlIIIlIllIIlIlIllllIIllIlIIIllIlIIIlIIIlIIIIIlIIlI.a(var0, var11);
      IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      Mode var3 = Mode.DEBUG_LINES;
      boolean var4 = false;
      var0.withVertexShader(
         lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
      );
      var10001 = -22424;
      var10002 = 21933;
      var0.withFragmentShader("core/position_color");
      var0.withVertexFormat(DefaultVertexFormat.POSITION_COLOR, var3);
      var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll var7 = llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      var4 = false;
      Builder var13 = var0.withUniform(var7.a(), UniformType.UNIFORM_BUFFER);
      var10002 = -22406;
      var10003 = -17544;
      Intrinsics.checkNotNullExpressionValue(var13, "withUniform(...)");
      var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var8 = true;
      var4 = false;
      var0.withCull(false);
      var0.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var0.withDepthStencilState(lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a());
      return Unit.INSTANCE;
   }

   private static final Unit k(Builder var0) {
      short var10001 = -22407;
      short var10002 = 26641;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      Snippet var11 = RenderPipelines.DEBUG_FILLED_SNIPPET;
      short var10003 = -22522;
      short var10004 = 1713;
      Intrinsics.checkNotNullExpressionValue(RenderPipelines.DEBUG_FILLED_SNIPPET, "DEBUG_FILLED_SNIPPET");
      IlIlIlllIllllIlllIlIlIIllIlIIlIIIIlIlIIIlIllIIlIlIllllIIllIlIIIllIlIIIlIIIlIIIIIlIIlI.a(var0, var11);
      IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      Mode var3 = Mode.DEBUG_LINES;
      boolean var4 = false;
      var0.withVertexShader(
         lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
      );
      var10001 = -22424;
      var10002 = 21933;
      var0.withFragmentShader("core/position_color");
      var0.withVertexFormat(DefaultVertexFormat.POSITION_COLOR, var3);
      var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll var7 = llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      var4 = false;
      Builder var13 = var0.withUniform(var7.a(), UniformType.UNIFORM_BUFFER);
      var10002 = -22406;
      var10003 = -17544;
      Intrinsics.checkNotNullExpressionValue(var13, "withUniform(...)");
      var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var8 = true;
      var4 = false;
      var0.withCull(false);
      var0.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var0.withDepthStencilState(lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a());
      return Unit.INSTANCE;
   }

   private static final Unit l(Builder var0) {
      short var10001 = -22407;
      short var10002 = 26641;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      Snippet var11 = RenderPipelines.DEBUG_FILLED_SNIPPET;
      short var10003 = -22522;
      short var10004 = 1713;
      Intrinsics.checkNotNullExpressionValue(RenderPipelines.DEBUG_FILLED_SNIPPET, "DEBUG_FILLED_SNIPPET");
      IlIlIlllIllllIlllIlIlIIllIlIIlIIIIlIlIIIlIllIIlIlIllllIIllIlIIIllIlIIIlIIIlIIIIIlIIlI.a(var0, var11);
      IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      Mode var3 = Mode.QUADS;
      boolean var4 = false;
      var0.withVertexShader(
         lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
      );
      var10001 = -22424;
      var10002 = 21933;
      var0.withFragmentShader("core/position_color");
      var0.withVertexFormat(DefaultVertexFormat.POSITION_COLOR, var3);
      var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll var7 = llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      var4 = false;
      Builder var13 = var0.withUniform(var7.a(), UniformType.UNIFORM_BUFFER);
      var10002 = -22406;
      var10003 = -17544;
      Intrinsics.checkNotNullExpressionValue(var13, "withUniform(...)");
      var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var8 = true;
      var4 = false;
      var0.withCull(false);
      var0.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var0.withDepthStencilState(lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a());
      return Unit.INSTANCE;
   }

   private static final Unit m(Builder var0) {
      short var10001 = -22407;
      short var10002 = 26641;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      Snippet var11 = RenderPipelines.DEBUG_FILLED_SNIPPET;
      short var10003 = -22522;
      short var10004 = 1713;
      Intrinsics.checkNotNullExpressionValue(RenderPipelines.DEBUG_FILLED_SNIPPET, "DEBUG_FILLED_SNIPPET");
      IlIlIlllIllllIlllIlIlIIllIlIIlIIIIlIlIIIlIllIIlIlIllllIIllIlIIIllIlIIIlIIIlIIIIIlIIlI.a(var0, var11);
      IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      Mode var3 = Mode.QUADS;
      boolean var4 = false;
      var0.withVertexShader(
         lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
      var0.withFragmentShader(
         lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
      var0.withVertexFormat(DefaultVertexFormat.POSITION, var3);
      var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll var7 = llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      var4 = false;
      Builder var12 = var0.withUniform(var7.a(), UniformType.UNIFORM_BUFFER);
      var10002 = -22406;
      var10003 = -17544;
      Intrinsics.checkNotNullExpressionValue(var12, "withUniform(...)");
      var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var8 = true;
      var4 = false;
      var0.withCull(false);
      var0.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var0.withDepthStencilState(lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a());
      return Unit.INSTANCE;
   }

   private static final Unit n(Builder var0) {
      short var10001 = -22407;
      short var10002 = 26641;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      Snippet var5 = RenderPipelines.DEBUG_FILLED_SNIPPET;
      short var10003 = -22522;
      short var10004 = 1713;
      Intrinsics.checkNotNullExpressionValue(RenderPipelines.DEBUG_FILLED_SNIPPET, "DEBUG_FILLED_SNIPPET");
      IlIlIlllIllllIlllIlIlIIllIlIIlIIIIlIlIIIlIllIIlIlIllllIIllIlIIIllIlIIIlIIIlIIIIIlIIlI.a(var0, var5);
      Snippet var6 = RenderPipelines.GLOBALS_SNIPPET;
      var10003 = -22405;
      var10004 = 20098;
      Intrinsics.checkNotNullExpressionValue(RenderPipelines.GLOBALS_SNIPPET, "GLOBALS_SNIPPET");
      IlIlIlllIllllIlllIlIlIIllIlIIlIIIIlIlIIIlIllIIlIlIllllIIllIlIIIllIlIIIlIIIlIIIIIlIIlI.a(var0, var6);
      var0.withVertexShader(
         lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
      );
      var0.withVertexFormat(DefaultVertexFormat.POSITION_COLOR, Mode.QUADS);
      IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll var3 = llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      boolean var4 = false;
      Builder var7 = var0.withUniform(var3.a(), UniformType.UNIFORM_BUFFER);
      var10002 = -22406;
      var10003 = -17544;
      Intrinsics.checkNotNullExpressionValue(var7, "withUniform(...)");
      var0.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      return Unit.INSTANCE;
   }

   private static final Unit o(Builder var0) {
      short var10001 = -22407;
      short var10002 = 26641;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      Snippet var5 = RenderPipelines.DEBUG_FILLED_SNIPPET;
      short var10003 = -22522;
      short var10004 = 1713;
      Intrinsics.checkNotNullExpressionValue(RenderPipelines.DEBUG_FILLED_SNIPPET, "DEBUG_FILLED_SNIPPET");
      IlIlIlllIllllIlllIlIlIIllIlIIlIIIIlIlIIIlIllIIlIlIllllIIllIlIIIllIlIIIlIIIlIIIIIlIIlI.a(var0, var5);
      Snippet var6 = RenderPipelines.GLOBALS_SNIPPET;
      var10003 = -22425;
      var10004 = -12422;
      Intrinsics.checkNotNullExpressionValue(RenderPipelines.GLOBALS_SNIPPET, "GLOBALS_SNIPPET");
      IlIlIlllIllllIlllIlIlIIllIlIIlIIIIlIlIIIlIllIIlIlIllllIIllIlIIIllIlIIIlIIIlIIIIIlIIlI.a(var0, var6);
      var0.withVertexShader(
         lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
      var0.withFragmentShader(
         lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
      var0.withVertexFormat(DefaultVertexFormat.POSITION, Mode.QUADS);
      IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll var3 = llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      boolean var4 = false;
      Builder var7 = var0.withUniform(var3.a(), UniformType.UNIFORM_BUFFER);
      var10002 = -22406;
      var10003 = -17544;
      Intrinsics.checkNotNullExpressionValue(var7, "withUniform(...)");
      var0.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      return Unit.INSTANCE;
   }

   private static final Unit p(Builder var0) {
      short var10001 = -22407;
      short var10002 = 26641;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      Snippet var5 = RenderPipelines.GUI_TEXTURED_SNIPPET;
      short var10003 = -22445;
      short var10004 = -5871;
      Intrinsics.checkNotNullExpressionValue(RenderPipelines.GUI_TEXTURED_SNIPPET, "GUI_TEXTURED_SNIPPET");
      IlIlIlllIllllIlllIlIlIIllIlIIlIIIIlIlIIIlIllIIlIlIllllIIllIlIIIllIlIIIlIIIlIIIIIlIIlI.a(var0, var5);
      var0.withVertexFormat(DefaultVertexFormat.POSITION_TEX_COLOR, Mode.QUADS);
      IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var3 = true;
      boolean var4 = false;
      var0.withCull(false);
      var0.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var0.withDepthStencilState(lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a());
      return Unit.INSTANCE;
   }

   private static final Unit q(Builder var0) {
      short var10001 = -22407;
      short var10002 = 26641;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var3 = false;
      boolean var6 = false;
      var10001 = -22458;
      var10002 = 21258;
      var0.withVertexShader("core/screenquad");
      var0.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var0.withFragmentShader(
         lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
      );
      var10001 = -22453;
      var10002 = -11318;
      var0.withSampler("InSampler");
      var0.withColorTargetState(
         new ColorTargetState(lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a(BlendFunction.ENTITY_OUTLINE_BLIT), 7)
      );
      var0.withDepthStencilState(lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a());
      return Unit.INSTANCE;
   }

   private static final Unit r(Builder var0) {
      short var10001 = -22407;
      short var10002 = 26641;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var3 = false;
      boolean var6 = false;
      var10001 = -22458;
      var10002 = 21258;
      var0.withVertexShader("core/screenquad");
      var0.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var0.withFragmentShader(
         lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
      );
      var10001 = -22453;
      var10002 = -11318;
      var0.withSampler("InSampler");
      var0.withColorTargetState(ColorTargetState.DEFAULT);
      var0.withDepthStencilState(lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a());
      return Unit.INSTANCE;
   }

   private static final Unit s(Builder var0) {
      short var10001 = -22407;
      short var10002 = 26641;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var3 = false;
      boolean var6 = false;
      var10001 = -22458;
      var10002 = 21258;
      var0.withVertexShader("core/screenquad");
      var0.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var0.withFragmentShader(
         lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
      );
      var10001 = -22453;
      var10002 = -11318;
      var0.withSampler("InSampler");
      var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll var8 = llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      boolean var4 = false;
      Builder var11 = var0.withUniform(var8.a(), UniformType.UNIFORM_BUFFER);
      var10002 = -22406;
      short var10003 = -17544;
      Intrinsics.checkNotNullExpressionValue(var11, "withUniform(...)");
      var0.withColorTargetState(ColorTargetState.DEFAULT);
      var0.withDepthStencilState(lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a());
      return Unit.INSTANCE;
   }

   private static final Unit t(Builder var0) {
      short var10001 = -22407;
      short var10002 = 26641;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var3 = false;
      boolean var6 = false;
      var10001 = -22458;
      var10002 = 21258;
      var0.withVertexShader("core/screenquad");
      var0.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var0.withFragmentShader(
         lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
      );
      var10001 = -22404;
      var10002 = -24039;
      var0.withSampler("MaskSampler");
      var10001 = -22412;
      var10002 = -5246;
      var0.withSampler("JfaSampler");
      var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll var8 = llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      boolean var4 = false;
      Builder var12 = var0.withUniform(var8.a(), UniformType.UNIFORM_BUFFER);
      var10002 = -22406;
      short var10003 = -17544;
      Intrinsics.checkNotNullExpressionValue(var12, "withUniform(...)");
      var0.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var0.withDepthStencilState(lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a());
      return Unit.INSTANCE;
   }

   private static final Unit u(Builder var0) {
      short var10001 = -22407;
      short var10002 = 26641;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var3 = false;
      boolean var6 = false;
      var10001 = -22458;
      var10002 = 21258;
      var0.withVertexShader("core/screenquad");
      var0.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var0.withFragmentShader(
         lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
      );
      var10001 = -22404;
      var10002 = -24039;
      var0.withSampler("MaskSampler");
      var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll var8 = llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      boolean var4 = false;
      Builder var11 = var0.withUniform(var8.a(), UniformType.UNIFORM_BUFFER);
      var10002 = -22406;
      short var10003 = -17544;
      Intrinsics.checkNotNullExpressionValue(var11, "withUniform(...)");
      var0.withColorTargetState(ColorTargetState.DEFAULT);
      var0.withDepthStencilState(lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a());
      return Unit.INSTANCE;
   }

   private static final Unit v(Builder var0) {
      short var10001 = -22407;
      short var10002 = 26641;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var3 = false;
      boolean var6 = false;
      var10001 = -22458;
      var10002 = 21258;
      var0.withVertexShader("core/screenquad");
      var0.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var0.withFragmentShader(
         lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
      );
      var10001 = -22404;
      var10002 = -24039;
      var0.withSampler("MaskSampler");
      var10001 = -22411;
      var10002 = 28281;
      var0.withSampler("OriginalMaskSampler");
      var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll var8 = llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      boolean var4 = false;
      Builder var12 = var0.withUniform(var8.a(), UniformType.UNIFORM_BUFFER);
      var10002 = -22406;
      short var10003 = -17544;
      Intrinsics.checkNotNullExpressionValue(var12, "withUniform(...)");
      var0.withColorTargetState(ColorTargetState.DEFAULT);
      var0.withDepthStencilState(lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a());
      return Unit.INSTANCE;
   }

   private static final Unit w(Builder var0) {
      short var10001 = -22407;
      short var10002 = 26641;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var3 = false;
      boolean var6 = false;
      var10001 = -22458;
      var10002 = 21258;
      var0.withVertexShader("core/screenquad");
      var0.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var0.withFragmentShader(
         lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
      );
      var10001 = -22404;
      var10002 = -24039;
      var0.withSampler("MaskSampler");
      var10001 = -22431;
      var10002 = -12546;
      var0.withSampler("OriginalMaskSampler");
      var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll var8 = llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      boolean var4 = false;
      Builder var12 = var0.withUniform(var8.a(), UniformType.UNIFORM_BUFFER);
      var10002 = -22406;
      short var10003 = -17544;
      Intrinsics.checkNotNullExpressionValue(var12, "withUniform(...)");
      var0.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var0.withDepthStencilState(lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a());
      return Unit.INSTANCE;
   }

   private static final Unit x(Builder var0) {
      short var10001 = -22435;
      short var10002 = -16115;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var3 = false;
      boolean var6 = false;
      var10001 = -22420;
      var10002 = -16537;
      var0.withVertexShader("core/screenquad");
      var0.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var0.withFragmentShader(
         lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
      );
      var10001 = -22450;
      var10002 = 16280;
      var0.withSampler("MaskSampler");
      var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll var8 = llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      boolean var4 = false;
      Builder var11 = var0.withUniform(var8.a(), UniformType.UNIFORM_BUFFER);
      var10002 = -22437;
      short var10003 = 12622;
      Intrinsics.checkNotNullExpressionValue(var11, "withUniform(...)");
      var0.withColorTargetState(ColorTargetState.DEFAULT);
      var0.withDepthStencilState(lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a());
      return Unit.INSTANCE;
   }

   private static final Unit y(Builder var0) {
      short var10001 = -22407;
      short var10002 = 26641;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var3 = false;
      boolean var6 = false;
      var10001 = -22458;
      var10002 = 21258;
      var0.withVertexShader("core/screenquad");
      var0.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var0.withFragmentShader(
         lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
      );
      var10001 = -22404;
      var10002 = -24039;
      var0.withSampler("MaskSampler");
      var10001 = -22431;
      var10002 = -12546;
      var0.withSampler("OriginalMaskSampler");
      var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll var8 = llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      boolean var4 = false;
      Builder var12 = var0.withUniform(var8.a(), UniformType.UNIFORM_BUFFER);
      var10002 = -22406;
      short var10003 = -17544;
      Intrinsics.checkNotNullExpressionValue(var12, "withUniform(...)");
      var0.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var0.withDepthStencilState(lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a());
      return Unit.INSTANCE;
   }

   private static final Unit z(Builder var0) {
      short var10001 = -22407;
      short var10002 = 26641;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var3 = false;
      boolean var6 = false;
      var10001 = -22458;
      var10002 = 21258;
      var0.withVertexShader("core/screenquad");
      var0.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var0.withFragmentShader(
         lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
      );
      var10001 = -22404;
      var10002 = -24039;
      var0.withSampler("MaskSampler");
      var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll var8 = llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      boolean var4 = false;
      Builder var11 = var0.withUniform(var8.a(), UniformType.UNIFORM_BUFFER);
      var10002 = -22406;
      short var10003 = -17544;
      Intrinsics.checkNotNullExpressionValue(var11, "withUniform(...)");
      var0.withColorTargetState(ColorTargetState.DEFAULT);
      var0.withDepthStencilState(lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a());
      return Unit.INSTANCE;
   }

   private static final Unit A(Builder var0) {
      short var10001 = -22407;
      short var10002 = 26641;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var3 = false;
      boolean var6 = false;
      var10001 = -22458;
      var10002 = 21258;
      var0.withVertexShader("core/screenquad");
      var0.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var0.withFragmentShader(
         lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl
      );
      var10001 = -22404;
      var10002 = -24039;
      var0.withSampler("MaskSampler");
      var10001 = -22431;
      var10002 = -12546;
      var0.withSampler("OriginalMaskSampler");
      var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll var8 = llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      boolean var4 = false;
      Builder var12 = var0.withUniform(var8.a(), UniformType.UNIFORM_BUFFER);
      var10002 = -22406;
      short var10003 = -17544;
      Intrinsics.checkNotNullExpressionValue(var12, "withUniform(...)");
      var0.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var0.withDepthStencilState(lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a());
      return Unit.INSTANCE;
   }

   private static final Unit B(Builder var0) {
      short var10001 = -22407;
      short var10002 = 26641;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      Snippet var1 = RenderPipelines.DEBUG_FILLED_SNIPPET;
      short var10003 = -22522;
      short var10004 = 1713;
      Intrinsics.checkNotNullExpressionValue(RenderPipelines.DEBUG_FILLED_SNIPPET, "DEBUG_FILLED_SNIPPET");
      IlIlIlllIllllIlllIlIlIIllIlIIlIIIIlIlIIIlIllIIlIlIllllIIllIlIIIllIlIIIlIIIlIIIIIlIIlI.a(var0, var1);
      var0.withVertexFormat(DefaultVertexFormat.POSITION_COLOR, Mode.QUADS);
      var0.withCull(false);
      var0.withColorTargetState(ColorTargetState.DEFAULT);
      var0.withDepthStencilState(lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a());
      return Unit.INSTANCE;
   }

   private static final Unit C(Builder var0) {
      short var10001 = -22407;
      short var10002 = 26641;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var3 = false;
      boolean var6 = false;
      var10001 = -22458;
      var10002 = 21258;
      var0.withVertexShader("core/screenquad");
      var0.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var0.withFragmentShader(
         lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl
      );
      var10001 = -22453;
      var10002 = -11318;
      var0.withSampler("InSampler");
      var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll var8 = llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      boolean var4 = false;
      Builder var11 = var0.withUniform(var8.a(), UniformType.UNIFORM_BUFFER);
      var10002 = -22406;
      short var10003 = -17544;
      Intrinsics.checkNotNullExpressionValue(var11, "withUniform(...)");
      var0.withColorTargetState(ColorTargetState.DEFAULT);
      var0.withDepthStencilState(lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a());
      return Unit.INSTANCE;
   }

   private static final Unit D(Builder var0) {
      short var10001 = -22407;
      short var10002 = 26641;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var3 = false;
      boolean var6 = false;
      var10001 = -22458;
      var10002 = 21258;
      var0.withVertexShader("core/screenquad");
      var0.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var0.withFragmentShader(
         lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll
      );
      var10001 = -22453;
      var10002 = -11318;
      var0.withSampler("InSampler");
      var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll var8 = llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      boolean var4 = false;
      Builder var11 = var0.withUniform(var8.a(), UniformType.UNIFORM_BUFFER);
      var10002 = -22406;
      short var10003 = -17544;
      Intrinsics.checkNotNullExpressionValue(var11, "withUniform(...)");
      var0.withColorTargetState(ColorTargetState.DEFAULT);
      var0.withDepthStencilState(lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a());
      return Unit.INSTANCE;
   }

   private static final Unit E(Builder var0) {
      short var10001 = -22407;
      short var10002 = 26641;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var3 = false;
      boolean var6 = false;
      var10001 = -22458;
      var10002 = 21258;
      var0.withVertexShader("core/screenquad");
      var0.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var0.withFragmentShader(
         lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll
      );
      var10001 = -22462;
      var10002 = 27259;
      var0.withSampler("InSampler");
      var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll var8 = llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      boolean var4 = false;
      Builder var11 = var0.withUniform(var8.a(), UniformType.UNIFORM_BUFFER);
      var10002 = -22406;
      short var10003 = -17544;
      Intrinsics.checkNotNullExpressionValue(var11, "withUniform(...)");
      var0.withColorTargetState(ColorTargetState.DEFAULT);
      var0.withDepthStencilState(lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a());
      return Unit.INSTANCE;
   }

   private static final Unit F(Builder var0) {
      short var10001 = -22407;
      short var10002 = 26641;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var3 = false;
      boolean var6 = false;
      var10001 = -22458;
      var10002 = 21258;
      var0.withVertexShader("core/screenquad");
      var0.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var0.withFragmentShader(
         lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl
      );
      var10001 = -22453;
      var10002 = -11318;
      var0.withSampler("InSampler");
      var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll var8 = llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      boolean var4 = false;
      Builder var11 = var0.withUniform(var8.a(), UniformType.UNIFORM_BUFFER);
      var10002 = -22406;
      short var10003 = -17544;
      Intrinsics.checkNotNullExpressionValue(var11, "withUniform(...)");
      var0.withColorTargetState(new ColorTargetState(BlendFunction.ADDITIVE));
      var0.withDepthStencilState(lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a());
      return Unit.INSTANCE;
   }

   private static final Unit G(Builder var0) {
      short var10001 = -22407;
      short var10002 = 26641;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var3 = false;
      boolean var6 = false;
      var10001 = -22458;
      var10002 = 21258;
      var0.withVertexShader("core/screenquad");
      var0.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var0.withFragmentShader(
         lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI
      );
      var10001 = -22453;
      var10002 = -11318;
      var0.withSampler("InSampler");
      var10001 = -22440;
      var10002 = -2254;
      var0.withSampler("DepthSampler");
      var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll var8 = llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      boolean var4 = false;
      Builder var12 = var0.withUniform(var8.a(), UniformType.UNIFORM_BUFFER);
      var10002 = -22406;
      short var10003 = -17544;
      Intrinsics.checkNotNullExpressionValue(var12, "withUniform(...)");
      var0.withColorTargetState(ColorTargetState.DEFAULT);
      var0.withDepthStencilState(lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a());
      return Unit.INSTANCE;
   }

   private static final Unit H(Builder var0) {
      short var10001 = -22407;
      short var10002 = 26641;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var3 = false;
      boolean var6 = false;
      var10001 = -22458;
      var10002 = 21258;
      var0.withVertexShader("core/screenquad");
      var0.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var0.withFragmentShader(
         lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll
      );
      var10001 = -22404;
      var10002 = -24039;
      var0.withSampler("MaskSampler");
      var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll var8 = llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      boolean var4 = false;
      Builder var11 = var0.withUniform(var8.a(), UniformType.UNIFORM_BUFFER);
      var10002 = -22406;
      short var10003 = -17544;
      Intrinsics.checkNotNullExpressionValue(var11, "withUniform(...)");
      var0.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var0.withDepthStencilState(lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a());
      return Unit.INSTANCE;
   }

   private static final Unit I(Builder var0) {
      short var10001 = -22407;
      short var10002 = 26641;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var3 = false;
      boolean var6 = false;
      var10001 = -22458;
      var10002 = 21258;
      var0.withVertexShader("core/screenquad");
      var0.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var0.withFragmentShader(
         lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
      );
      var10001 = -22404;
      var10002 = -24039;
      var0.withSampler("MaskSampler");
      var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll var8 = llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      boolean var4 = false;
      Builder var11 = var0.withUniform(var8.a(), UniformType.UNIFORM_BUFFER);
      var10002 = -22406;
      short var10003 = -17544;
      Intrinsics.checkNotNullExpressionValue(var11, "withUniform(...)");
      var0.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var0.withDepthStencilState(lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a());
      return Unit.INSTANCE;
   }

   private static final Unit J(Builder var0) {
      short var10001 = -22407;
      short var10002 = 26641;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var3 = false;
      boolean var6 = false;
      var10001 = -22458;
      var10002 = 21258;
      var0.withVertexShader("core/screenquad");
      var0.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var0.withFragmentShader(
         lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
      );
      var10001 = -22525;
      var10002 = -17968;
      var0.withSampler("texture0");
      var10001 = -22430;
      var10002 = -7445;
      var0.withSampler("image");
      var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll var8 = llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      boolean var4 = false;
      Builder var12 = var0.withUniform(var8.a(), UniformType.UNIFORM_BUFFER);
      var10002 = -22406;
      short var10003 = -17544;
      Intrinsics.checkNotNullExpressionValue(var12, "withUniform(...)");
      var0.withColorTargetState(ColorTargetState.DEFAULT);
      var0.withDepthStencilState(lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a());
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var55 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[70];
      int var3 = 0;
      String var2 = "\u001fU¦Å% *.É\f¾ïàÞV#J\u0083\u0011]£ñ\tÍi\t¨:³½\u0010=\tÿù·\u001cf\ní¥`\u000fLi\u0082gæsW \u009f+ùxÌ\u0013\u0007\u0007C\u0082èJ+ãf\t\u0082\u0092à×\u0007S\u0017øÛ\n8WPÐ9\u009cÙÜ,Ó\u0006i\u000e\u0088ÿ¢ \t\u0090ÂW7\u001bþíå1\b\u008f\u0090ÁJ½¹&0\náº\u000bt+vå7ø\u0003\u000bÓ*\u009bÎ\u0098\u009beo\u001f\u0080Ý\t\u0000Í\u0080£&ÞÇ\u0006F\u0011¥E\u001b<\u0092,u,\u0019»¬Z\u001a{aµ\u0098!Í\u00adñ§¥fù<pY6ªoV+hÈ\u0005]Pë\u0003Ð¾ÔQdôLZ\u009c\u000b¥\t«ñEf&1#\u0089\u009d\u0014e!<)\u0016ñf¦Õ.\u00ad<\":\u009f(R\u0098ð8\u0004\u0092\u0087ïK\u0006n\u00815=Ç£\u0011\u000e)S\u001e\u0012\n¤ä\u00961\u001dq)\u0001ïVª\u0012Q;\u001d¼«tÍFÊóÞúìÝ3\u0085Àú\r\u009dü\u0082\u0085Õ\u0011\u0002\u008b\u0000\u001aËsv\t6lF\u0097þXÜÖ;\u0018×Ý²©Í§ô\u0004Ñ^\u0002JéJûëÒu\u001e^\u0083ÂÝ\u0086\u0010Ô\u0091\u0001³*Xñï\nS\u0003Û«Z\u0091\u0096\fêx\u0097\u001fAo\u000e\u0098ãÉÊ\u000f\u000fà×+Ù/Ãd\u0082ñÔ<2I\r)\u0006Ä\u008d\n\u008a9\u0085\u001c\u0016Ï\bã³Ûq!\u0019Ìg¦\u0088¤\u009dM_í\u0002Õlº\u0080\u00812´ú]\u0006ý-\u001a\u009bð,\u0011ä~\"ñ÷{¯\u008b>\u009e\u009a\\W»kç:\u0005}\bü\u000b\u0012\t¹\n¥zÌ\u0097`Lÿ\tº\u000f/mR(ç\u0005o\u0013¡²\u008d 9Ô t\u001bxY\u008c@Ô}¸u¡\u0098\u0018ÈþàSiÙ`ËC§Pu£\u00ad²\u0017ûê;\u00ad'¼II\u000f\n ×>¸¤\u000f/\u0094iO_üÖ°\u0010ÃM\u0081%E\u0017à\u001eî\u0099Õ\u0084BOYv\r\u008b\u0018A[£\u00954a6W\u0080&\u0014\nNÒ[a\u0013ü\u009d1\u008d\u0080\u0016\u008cB\u0011R\u0014à\u0081Á\u0097\u008faë7è´Ù\u001cwý¨p§\u0013!ë/7SzícIs©^:4¦BÁ\b\u000e\u0007¶h\u0004F\raj\f\u0080ÿ\t8Ý\u0085\u000f^#2è3\u0004£2ÌÃ\u000f´.\u009d\u008f\u0005n+\u0083\u0010_\böòÂÀ\bæ÷ì¦\u0012)\u0084\u0092\u0007z>ÝüÃV\u009e!©9Ì«ìÆÐ(UÛ\u0092úû\\¹)\u009a-\u0017U¢£ùªñÓÀ¤ØP\u000eJ÷\u0006À¾\u008aì)W\u0014HBñ]Ö.\u0011\u0019ÿyÒ\u000bÍÜbôí\u0003\u0007K\u000bü\u001f]¥\u009b»\u008c\u0097Vßô\u0005¥ÀM\u0094Ü\nVmÞùRNUD®m\u0013\u0085³\t\u0080©Ð2ôYh\u0011\u008eI\u0094\\°Q \u001c\u0010iF¶IÜ\u0007/\u0004Ñ.xtÄ¯|(\u000f\u0097\u009edùÎ\\Á0M\u008at#\u009bY\\\u0013\u0001^+\u0081Ó¬ý¹K(é52Y§ïá½\n\u0011ÜE%\u0096\u0017\u0097³\u0016½-ê*Yuª>\u0002\u0005ç\b´\u0013\r\f¾)Ï\u0080bª\u0011¬|aËõ\u000b\u0095NSB\u0081\nF]{ÆQ\nª\u008e¬]Ì4{Èã#\r(¸ø\u009fnd\u0085WßKfÓç\b}ù[/ÌH\u0005$\t\u009d\u0092V¢E[E¤%\tîæ)ç\u0086\u0018Ì\u009d¸";
      int var4 = "\u001fU¦Å% *.É\f¾ïàÞV#J\u0083\u0011]£ñ\tÍi\t¨:³½\u0010=\tÿù·\u001cf\ní¥`\u000fLi\u0082gæsW \u009f+ùxÌ\u0013\u0007\u0007C\u0082èJ+ãf\t\u0082\u0092à×\u0007S\u0017øÛ\n8WPÐ9\u009cÙÜ,Ó\u0006i\u000e\u0088ÿ¢ \t\u0090ÂW7\u001bþíå1\b\u008f\u0090ÁJ½¹&0\náº\u000bt+vå7ø\u0003\u000bÓ*\u009bÎ\u0098\u009beo\u001f\u0080Ý\t\u0000Í\u0080£&ÞÇ\u0006F\u0011¥E\u001b<\u0092,u,\u0019»¬Z\u001a{aµ\u0098!Í\u00adñ§¥fù<pY6ªoV+hÈ\u0005]Pë\u0003Ð¾ÔQdôLZ\u009c\u000b¥\t«ñEf&1#\u0089\u009d\u0014e!<)\u0016ñf¦Õ.\u00ad<\":\u009f(R\u0098ð8\u0004\u0092\u0087ïK\u0006n\u00815=Ç£\u0011\u000e)S\u001e\u0012\n¤ä\u00961\u001dq)\u0001ïVª\u0012Q;\u001d¼«tÍFÊóÞúìÝ3\u0085Àú\r\u009dü\u0082\u0085Õ\u0011\u0002\u008b\u0000\u001aËsv\t6lF\u0097þXÜÖ;\u0018×Ý²©Í§ô\u0004Ñ^\u0002JéJûëÒu\u001e^\u0083ÂÝ\u0086\u0010Ô\u0091\u0001³*Xñï\nS\u0003Û«Z\u0091\u0096\fêx\u0097\u001fAo\u000e\u0098ãÉÊ\u000f\u000fà×+Ù/Ãd\u0082ñÔ<2I\r)\u0006Ä\u008d\n\u008a9\u0085\u001c\u0016Ï\bã³Ûq!\u0019Ìg¦\u0088¤\u009dM_í\u0002Õlº\u0080\u00812´ú]\u0006ý-\u001a\u009bð,\u0011ä~\"ñ÷{¯\u008b>\u009e\u009a\\W»kç:\u0005}\bü\u000b\u0012\t¹\n¥zÌ\u0097`Lÿ\tº\u000f/mR(ç\u0005o\u0013¡²\u008d 9Ô t\u001bxY\u008c@Ô}¸u¡\u0098\u0018ÈþàSiÙ`ËC§Pu£\u00ad²\u0017ûê;\u00ad'¼II\u000f\n ×>¸¤\u000f/\u0094iO_üÖ°\u0010ÃM\u0081%E\u0017à\u001eî\u0099Õ\u0084BOYv\r\u008b\u0018A[£\u00954a6W\u0080&\u0014\nNÒ[a\u0013ü\u009d1\u008d\u0080\u0016\u008cB\u0011R\u0014à\u0081Á\u0097\u008faë7è´Ù\u001cwý¨p§\u0013!ë/7SzícIs©^:4¦BÁ\b\u000e\u0007¶h\u0004F\raj\f\u0080ÿ\t8Ý\u0085\u000f^#2è3\u0004£2ÌÃ\u000f´.\u009d\u008f\u0005n+\u0083\u0010_\böòÂÀ\bæ÷ì¦\u0012)\u0084\u0092\u0007z>ÝüÃV\u009e!©9Ì«ìÆÐ(UÛ\u0092úû\\¹)\u009a-\u0017U¢£ùªñÓÀ¤ØP\u000eJ÷\u0006À¾\u008aì)W\u0014HBñ]Ö.\u0011\u0019ÿyÒ\u000bÍÜbôí\u0003\u0007K\u000bü\u001f]¥\u009b»\u008c\u0097Vßô\u0005¥ÀM\u0094Ü\nVmÞùRNUD®m\u0013\u0085³\t\u0080©Ð2ôYh\u0011\u008eI\u0094\\°Q \u001c\u0010iF¶IÜ\u0007/\u0004Ñ.xtÄ¯|(\u000f\u0097\u009edùÎ\\Á0M\u008at#\u009bY\\\u0013\u0001^+\u0081Ó¬ý¹K(é52Y§ïá½\n\u0011ÜE%\u0096\u0017\u0097³\u0016½-ê*Yuª>\u0002\u0005ç\b´\u0013\r\f¾)Ï\u0080bª\u0011¬|aËõ\u000b\u0095NSB\u0081\nF]{ÆQ\nª\u008e¬]Ì4{Èã#\r(¸ø\u009fnd\u0085WßKfÓç\b}ù[/ÌH\u0005$\t\u009d\u0092V¢E[E¤%\tîæ)ç\u0086\u0018Ì\u009d¸"
         .length();
      char var1 = '\t';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 85;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var94 = var10001.toCharArray();
               int var10004 = var94.length;
               int var6 = 0;
               byte var97 = var10000;
               var55 = var94;
               int var14 = var10004;
               byte var102;
               char[] var106;
               int var10006;
               if (var10004 <= 1) {
                  var106 = var94;
                  var102 = var10000;
                  var10006 = var6;
               } else {
                  var97 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var106 = var94;
                  var102 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var106[var10006] = (char)(var106[var10006] ^ var102 ^ switch (var6 % 7) {
                     case 0 -> 93;
                     case 1 -> 35;
                     case 2 -> 34;
                     case 3 -> 54;
                     case 4 -> 30;
                     case 5 -> 28;
                     default -> 30;
                  });
                  var6++;
                  if (var97 == 0) {
                     var10006 = var97;
                     var106 = var55;
                     var102 = var97;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var106 = var55;
                     var102 = var97;
                     var10006 = var6;
                  }
               }
            }

            String var99 = new String(var55).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var99;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[70];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl();
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new Object2ObjectOpenHashMap();
                     short var16 = -22428;
                     var10002 = 12678;
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "lines_with_width", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::b
                     );
                     short var17 = -22409;
                     var10002 = -23675;
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "lines", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::c
                     );
                     short var18 = -22403;
                     var10002 = -25897;
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "line_strip", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::d
                     );
                     short var19 = -22528;
                     var10002 = -13032;
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "triangles", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::e
                     );
                     short var20 = -22402;
                     var10002 = -24782;
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "quads", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::f
                     );
                     short var21 = -22418;
                     var10002 = 788;
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "screen_lines", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::g
                     );
                     short var22 = -22422;
                     var10002 = 31957;
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "glow_lines", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::h
                     );
                     short var23 = -22401;
                     var10002 = -6010;
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "chams_blocks", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::i
                     );
                     short var24 = -22426;
                     var10002 = 8170;
                     lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "lines_relative_to_camera", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::j
                     );
                     short var25 = -22413;
                     var10002 = -14739;
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "lines_relative_to_camera_no_color", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::k
                     );
                     short var26 = -22438;
                     var10002 = 28479;
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "quads_relative_to_camera", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::l
                     );
                     short var27 = -22451;
                     var10002 = 28790;
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "quads_relative_to_camera_no_color", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::m
                     );
                     short var28 = -22521;
                     var10002 = 8113;
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "outline_quads", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::n
                     );
                     short var29 = -22421;
                     var10002 = -22446;
                     llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "outline_quads_no_color", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::o
                     );
                     short var30 = -22527;
                     var10002 = 14292;
                     IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "tex_quads", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::p
                     );
                     short var31 = -22457;
                     var10002 = 30747;
                     IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "outline", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::q
                     );
                     short var32 = -22456;
                     var10002 = -1176;
                     IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "jfa_mask", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::r
                     );
                     short var33 = -22446;
                     var10002 = -7478;
                     IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "jfa_flood", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::s
                     );
                     short var34 = -22427;
                     var10002 = -14424;
                     llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "jfa_composite", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::t
                     );
                     short var35 = -22429;
                     var10002 = -9311;
                     IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "glow_down", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::u
                     );
                     short var36 = -22414;
                     var10002 = -7726;
                     lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "glow_up", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::v
                     );
                     short var37 = -22442;
                     var10002 = -24370;
                     llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "glow_up_composite", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::w
                     );
                     short var38 = -22434;
                     var10002 = -4092;
                     lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "glow_h", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::x
                     );
                     short var39 = -22416;
                     var10002 = -20293;
                     IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "glow_v", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::y
                     );
                     short var40 = -22449;
                     var10002 = 20456;
                     IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "outline_h", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::z
                     );
                     short var41 = -22443;
                     var10002 = 13334;
                     IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "outline_v", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::A
                     );
                     short var42 = -22460;
                     var10002 = -18152;
                     llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "fill_mask", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::B
                     );
                     short var43 = -22448;
                     var10002 = 26329;
                     lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "fxaa", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::C
                     );
                     short var44 = -22461;
                     var10002 = -22907;
                     IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "bloom_bright", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::D
                     );
                     short var45 = -22455;
                     var10002 = 21824;
                     IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "bloom_blur", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::E
                     );
                     short var46 = -22439;
                     var10002 = 27689;
                     lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "bloom_composite", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::F
                     );
                     short var47 = -22410;
                     var10002 = -10390;
                     lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "motion_blur", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::G
                     );
                     short var48 = -22464;
                     var10002 = 14437;
                     IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "fill_blit", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::H
                     );
                     short var49 = -22419;
                     var10002 = 6582;
                     IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "jfa_glow", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::I
                     );
                     short var50 = -22459;
                     var10002 = 1803;
                     IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        "item_chams", IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl::J
                     );
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var99;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "°º\u000f£è\u00107?Ú\\\u0097N\u0084\u0095ª<\u0015ûùµ\r]«Ê\u008e\u008e\u009a3o »v\u008c4";
                  var4 = "°º\u000f£è\u00107?Ú\\\u0097N\u0084\u0095ª<\u0015ûùµ\r]«Ê\u008e\u008e\u009a3o »v\u008c4".length();
                  var1 = 20;
                  var8 = -1;
            }

            var10000 = 57;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static IllegalStateException a(IllegalStateException var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -22462) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 234;
            case 1 -> 48;
            case 2 -> 53;
            case 3 -> 76;
            case 4 -> 222;
            case 5 -> 121;
            case 6 -> 109;
            case 7 -> 82;
            case 8 -> 129;
            case 9 -> 117;
            case 10 -> 133;
            case 11 -> 21;
            case 12 -> 141;
            case 13 -> 10;
            case 14 -> 153;
            case 15 -> 34;
            case 16 -> 216;
            case 17 -> 35;
            case 18 -> 147;
            case 19 -> 70;
            case 20 -> 26;
            case 21 -> 42;
            case 22 -> 90;
            case 23 -> 29;
            case 24 -> 179;
            case 25 -> 192;
            case 26 -> 83;
            case 27 -> 80;
            case 28 -> 167;
            case 29 -> 156;
            case 30 -> 61;
            case 31 -> 39;
            case 32 -> 125;
            case 33 -> 45;
            case 34 -> 32;
            case 35 -> 78;
            case 36 -> 215;
            case 37 -> 108;
            case 38 -> 118;
            case 39 -> 57;
            case 40 -> 13;
            case 41 -> 99;
            case 42 -> 190;
            case 43 -> 20;
            case 44 -> 128;
            case 45 -> 100;
            case 46 -> 72;
            case 47 -> 126;
            case 48 -> 178;
            case 49 -> 132;
            case 50 -> 86;
            case 51 -> 81;
            case 52 -> 93;
            case 53 -> 238;
            case 54 -> 208;
            case 55 -> 15;
            case 56 -> 166;
            case 57 -> 91;
            case 58 -> 188;
            case 59 -> 119;
            case 60 -> 113;
            case 61 -> 135;
            case 62 -> 197;
            case 63 -> 239;
            case 64 -> 49;
            case 65 -> 38;
            case 66 -> 65;
            case 67 -> 88;
            case 68 -> 227;
            case 69 -> 199;
            case 70 -> 180;
            case 71 -> 230;
            case 72 -> 143;
            case 73 -> 94;
            case 74 -> 74;
            case 75 -> 247;
            case 76 -> 165;
            case 77 -> 137;
            case 78 -> 175;
            case 79 -> 228;
            case 80 -> 22;
            case 81 -> 6;
            case 82 -> 205;
            case 83 -> 182;
            case 84 -> 142;
            case 85 -> 59;
            case 86 -> 185;
            case 87 -> 174;
            case 88 -> 213;
            case 89 -> 79;
            case 90 -> 149;
            case 91 -> 198;
            case 92 -> 130;
            case 93 -> 95;
            case 94 -> 110;
            case 95 -> 243;
            case 96 -> 210;
            case 97 -> 98;
            case 98 -> 114;
            case 99 -> 212;
            case 100 -> 206;
            case 101 -> 43;
            case 102 -> 85;
            case 103 -> 226;
            case 104 -> 28;
            case 105 -> 225;
            case 106 -> 127;
            case 107 -> 16;
            case 108 -> 195;
            case 109 -> 231;
            case 110 -> 219;
            case 111 -> 115;
            case 112 -> 96;
            case 113 -> 84;
            case 114 -> 189;
            case 115 -> 111;
            case 116 -> 64;
            case 117 -> 207;
            case 118 -> 193;
            case 119 -> 52;
            case 120 -> 202;
            case 121 -> 242;
            case 122 -> 27;
            case 123 -> 252;
            case 124 -> 235;
            case 125 -> 51;
            case 126 -> 211;
            case 127 -> 171;
            case 128 -> 40;
            case 129 -> 107;
            case 130 -> 176;
            case 131 -> 191;
            case 132 -> 103;
            case 133 -> 75;
            case 134 -> 131;
            case 135 -> 123;
            case 136 -> 25;
            case 137 -> 214;
            case 138 -> 44;
            case 139 -> 4;
            case 140 -> 105;
            case 141 -> 183;
            case 142 -> 7;
            case 143 -> 60;
            case 144 -> 204;
            case 145 -> 164;
            case 146 -> 162;
            case 147 -> 31;
            case 148 -> 106;
            case 149 -> 55;
            case 150 -> 201;
            case 151 -> 102;
            case 152 -> 249;
            case 153 -> 139;
            case 154 -> 221;
            case 155 -> 87;
            case 156 -> 71;
            case 157 -> 73;
            case 158 -> 46;
            case 159 -> 170;
            case 160 -> 68;
            case 161 -> 160;
            case 162 -> 9;
            case 163 -> 1;
            case 164 -> 240;
            case 165 -> 63;
            case 166 -> 112;
            case 167 -> 237;
            case 168 -> 23;
            case 169 -> 24;
            case 170 -> 92;
            case 171 -> 224;
            case 172 -> 172;
            case 173 -> 196;
            case 174 -> 246;
            case 175 -> 36;
            case 176 -> 8;
            case 177 -> 203;
            case 178 -> 186;
            case 179 -> 18;
            case 180 -> 5;
            case 181 -> 144;
            case 182 -> 177;
            case 183 -> 151;
            case 184 -> 250;
            case 185 -> 218;
            case 186 -> 220;
            case 187 -> 155;
            case 188 -> 136;
            case 189 -> 122;
            case 190 -> 17;
            case 191 -> 169;
            case 192 -> 62;
            case 193 -> 157;
            case 194 -> 158;
            case 195 -> 248;
            case 196 -> 241;
            case 197 -> 194;
            case 198 -> 152;
            case 199 -> 168;
            case 200 -> 12;
            case 201 -> 146;
            case 202 -> 229;
            case 203 -> 223;
            case 204 -> 89;
            case 205 -> 97;
            case 206 -> 200;
            case 207 -> 0;
            case 208 -> 232;
            case 209 -> 134;
            case 210 -> 236;
            case 211 -> 11;
            case 212 -> 33;
            case 213 -> 58;
            case 214 -> 19;
            case 215 -> 150;
            case 216 -> 47;
            case 217 -> 217;
            case 218 -> 255;
            case 219 -> 2;
            case 220 -> 163;
            case 221 -> 56;
            case 222 -> 245;
            case 223 -> 145;
            case 224 -> 233;
            case 225 -> 41;
            case 226 -> 140;
            case 227 -> 254;
            case 228 -> 54;
            case 229 -> 37;
            case 230 -> 66;
            case 231 -> 173;
            case 232 -> 159;
            case 233 -> 181;
            case 234 -> 116;
            case 235 -> 138;
            case 236 -> 69;
            case 237 -> 67;
            case 238 -> 50;
            case 239 -> 148;
            case 240 -> 154;
            case 241 -> 101;
            case 242 -> 14;
            case 243 -> 124;
            case 244 -> 209;
            case 245 -> 184;
            case 246 -> 104;
            case 247 -> 253;
            case 248 -> 120;
            case 249 -> 251;
            case 250 -> 187;
            case 251 -> 244;
            case 252 -> 3;
            case 253 -> 77;
            case 254 -> 161;
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
}
