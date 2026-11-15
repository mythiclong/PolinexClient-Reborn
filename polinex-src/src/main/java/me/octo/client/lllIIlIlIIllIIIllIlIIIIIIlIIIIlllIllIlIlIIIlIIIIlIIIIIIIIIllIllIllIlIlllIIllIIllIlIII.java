package me.octo.client;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderSystem.AutoStorageIndexBuffer;
import com.mojang.blaze3d.vertex.MeshData;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormat.IndexType;
import com.mojang.blaze3d.vertex.VertexFormat.Mode;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.nio.ByteBuffer;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public record lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII(
   @NotNull GpuBufferSlice l, @NotNull GpuBufferSlice m, @NotNull VertexFormat n, @NotNull IndexType o, int p
) {
   @NotNull
   public static lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Function<VertexFormat, IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static Function<IndexType, IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String[] a;
   private static String[] b;

   public lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII(
      @NotNull GpuBufferSlice l, @NotNull GpuBufferSlice m, @NotNull VertexFormat n, @NotNull IndexType o, int p
   ) {
      short var10001 = -9066;
      short var10002 = 2536;
      Intrinsics.checkNotNullParameter(l, "vertexSlice");
      var10001 = -9071;
      var10002 = -21711;
      Intrinsics.checkNotNullParameter(m, "indexSlice");
      var10001 = -9064;
      var10002 = -14386;
      Intrinsics.checkNotNullParameter(n, "vertexFormat");
      var10001 = -9063;
      var10002 = 16736;
      Intrinsics.checkNotNullParameter(o, "indexType");
            this.l = l;
      this.m = m;
      this.n = n;
      this.o = o;
      this.p = p;
   }

   @NotNull
   public final GpuBufferSlice q() {
      return this.l;
   }

   @NotNull
   public final GpuBufferSlice r() {
      return this.m;
   }

   @NotNull
   public final VertexFormat s() {
      return this.n;
   }

   @NotNull
   public final IndexType t() {
      return this.o;
   }

   public final int u() {
      return this.p;
   }

   public static lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII a(
      lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII var0,
      GpuBufferSlice var1,
      GpuBufferSlice var2,
      VertexFormat var3,
      IndexType var4,
      int var5,
      int var6,
      Object var7
   ) {
      if ((var6 & 1) != 0) {
         var1 = var0.l;
      }

      if ((var6 & 2) != 0) {
         var2 = var0.m;
      }

      if ((var6 & 4) != 0) {
         var3 = var0.n;
      }

      if ((var6 & 8) != 0) {
         var4 = var0.o;
      }

      if ((var6 & 16) != 0) {
         var5 = var0.p;
      }

      return var0.a(var1, var2, var3, var4, var5);
   }

   @NotNull
   public static final java.util.function.Function v() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public static final java.util.function.Function w() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public final lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII a(
      @NotNull GpuBufferSlice var1, @NotNull GpuBufferSlice var2, @NotNull VertexFormat var3, @NotNull IndexType var4, int var5
   ) {
      short var10001 = -9078;
      short var10002 = 14496;
      Intrinsics.checkNotNullParameter(var1, "vertexSlice");
      var10001 = -9068;
      var10002 = 13170;
      Intrinsics.checkNotNullParameter(var2, "indexSlice");
      var10001 = -9070;
      var10002 = 31942;
      Intrinsics.checkNotNullParameter(var3, "vertexFormat");
      var10001 = -9061;
      var10002 = -17395;
      Intrinsics.checkNotNullParameter(var4, "indexType");
      return new lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII(var1, var2, var3, var4, var5);
   }

   @NotNull
   @Override
   public String toString() {
      short var10000 = -9057;
      int var1 = this.p;
      IndexType var2 = this.o;
      VertexFormat var3 = this.n;
      GpuBufferSlice var4 = this.m;
      GpuBufferSlice var5 = this.l;
      short var10001 = -27193;
      short var10002 = -9062;
      short var10003 = -21036;
      short var10004 = -9065;
      short var10005 = 10892;
      short var10006 = -9072;
      short var10007 = -26004;
      short var10008 = -9058;
      short var10009 = 9102;
      return "MeshDraw(vertexSlice=" + var5 + ", indexSlice=" + var4 + ", vertexFormat=" + var3 + ", indexType=" + var2 + ", indexCount=" + var1 + ")";
   }

   @Override
   public int hashCode() {
      int var2 = this.l.hashCode();
      lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      var2 = var2 * 31 + this.m.hashCode();
      var2 = var2 * 31 + this.n.hashCode();
      var2 = var2 * 31 + this.o.hashCode();
      var2 = var2 * 31 + Integer.hashCode(this.p);
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b(
            new int[1]
         );
      }

      return var2;
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      int[] var2 = lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII var10000 = this;
      if (var2 != null) {
         if (this == var1) {
            return true;
         }

         var10000 = (lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII)var1;
      }

      if (var2 != null) {
         if (!(var10000 instanceof lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII)) {
            return false;
         }

         var10000 = (lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII)var1;
      }

      lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII var3 = var10000;
      boolean var4 = Intrinsics.areEqual(this.l, var3.l);
      if (var2 != null) {
         if (!var4) {
            return false;
         }

         var4 = Intrinsics.areEqual(this.m, var3.m);
      }

      label64: {
         if (var2 != null) {
            if (!var4) {
               return false;
            }

            var10000 = this;
            if (var2 == null) {
               break label64;
            }

            var4 = Intrinsics.areEqual(this.n, var3.n);
         }

         if (!var4) {
            return false;
         }

         var10000 = this;
      }

      if (var2 != null) {
         if (var10000.o != var3.o) {
            return false;
         }

         var10000 = this;
      }

      int var6 = var10000.p;
      if (var2 != null) {
         if (var10000.p != var3.p) {
            return false;
         }

         var6 = 1;
      }

      return (var6 != 0);
   }

   private static final IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI a(VertexFormat var0) {
      short var10001 = -9060;
      short var10002 = -19625;
      Intrinsics.checkNotNullParameter(var0, "it");
      short var10003 = -9059;
      short var10004 = -13260;
      return new IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI(
         "Polinex Shared VBO for " + var0,
         32,
         IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI.PXEvMid.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(8, 8192)
      );
   }

   private static final IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI a(IndexType var0) {
      short var10001 = -9069;
      short var10002 = 9729;
      Intrinsics.checkNotNullParameter(var0, "it");
      short var10003 = -9067;
      short var10004 = -29931;
      return new IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI(
         "Polinex Shared IBO for " + var0,
         64,
         IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI.PXEvMid.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(7, 1024)
      );
   }

   @JvmStatic
   @JvmName(
      name = "create"
   )
   @NotNull
   public static final lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII a(
      @NotNull MeshData var0,
      @NotNull RenderPipeline var1,
      @NotNull Function<VertexFormat, IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI> var2,
      @NotNull Function<IndexType, IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI> var3
   ) {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0, var1, var2, var3);
   }

   @JvmStatic
   public static final void a(@NotNull RenderPass var0, @NotNull lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII var1) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0, var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[17];
      int var3 = 0;
      String var2 = "\u0014ñ¯ÊÃ\u00818!E\u0099\u0094\u0004¾\tÉmôÕ\u00189Ý\u0002Ñ\fqy\t,n\u0019\u0092°÷\u0014\u001d \t/\u001d(Û\u0083ø®:¿\r°Y;ßQ#je\f\u001fÓZú\u0015\u008eæ«Ã:q:î{ß\u0099'\u0090m\u001bn\u0095#&[&\u0002_<\u0017É\u001câÖÅå³Þ\u000bz\u0087NÆAºÏÜ\u0094§LoÚ\u0016\fk¼J\u0094\u0006\u000e\u009fRVH)«\u0002ó\u0097\fñ\u0001\u0013ÔTBÊ^\u000e\u0088LD\nËX´s\u0010êÉ\u0086â\u001c\u000b\u008c¢¶W\u0099vy^&¤[\u000f¤\\¦t\b-\u0088¬Ç`ºõ\u0014Úy\n\u001bq®VSN¡\u0012ï\u008e";
      int var4 = "\u0014ñ¯ÊÃ\u00818!E\u0099\u0094\u0004¾\tÉmôÕ\u00189Ý\u0002Ñ\fqy\t,n\u0019\u0092°÷\u0014\u001d \t/\u001d(Û\u0083ø®:¿\r°Y;ßQ#je\f\u001fÓZú\u0015\u008eæ«Ã:q:î{ß\u0099'\u0090m\u001bn\u0095#&[&\u0002_<\u0017É\u001câÖÅå³Þ\u000bz\u0087NÆAºÏÜ\u0094§LoÚ\u0016\fk¼J\u0094\u0006\u000e\u009fRVH)«\u0002ó\u0097\fñ\u0001\u0013ÔTBÊ^\u000e\u0088LD\nËX´s\u0010êÉ\u0086â\u001c\u000b\u008c¢¶W\u0099vy^&¤[\u000f¤\\¦t\b-\u0088¬Ç`ºõ\u0014Úy\n\u001bq®VSN¡\u0012ï\u008e"
         .length();
      char var1 = '\r';
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
                     case 0 -> 10;
                     case 1 -> 24;
                     case 2 -> 111;
                     case 3 -> 126;
                     case 4 -> 56;
                     case 5 -> 18;
                     default -> 20;
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
                     b = new String[17];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (Object)null
                     );
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = me.octo.client.utils.lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a(
                        (Map<VertexFormat, IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI>)(new Object2ObjectArrayMap()),
                        lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII::a
                     );
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = me.octo.client.utils.lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.a(
                        new EnumMap<>(IndexType.class), lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII::a
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

                  var2 = "¸#\u0005øðéÜ\u0096/ºÊ\u009f¦²\u007fg\u00ad´@\u0081Zªy\u000beÌBSÎ?Z¾\u008bq'";
                  var4 = "¸#\u0005øðéÜ\u0096/ºÊ\u009f¦²\u007fg\u00ad´@\u0081Zªy\u000beÌBSÎ?Z¾\u008bq'".length();
                  var1 = 23;
                  var8 = -1;
            }

            var10000 = 66;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -9062) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 205;
            case 1 -> 189;
            case 2 -> 245;
            case 3 -> 10;
            case 4 -> 166;
            case 5 -> 68;
            case 6 -> 55;
            case 7 -> 21;
            case 8 -> 253;
            case 9 -> 87;
            case 10 -> 49;
            case 11 -> 46;
            case 12 -> 105;
            case 13 -> 229;
            case 14 -> 35;
            case 15 -> 233;
            case 16 -> 199;
            case 17 -> 104;
            case 18 -> 222;
            case 19 -> 215;
            case 20 -> 67;
            case 21 -> 144;
            case 22 -> 204;
            case 23 -> 76;
            case 24 -> 242;
            case 25 -> 187;
            case 26 -> 25;
            case 27 -> 195;
            case 28 -> 22;
            case 29 -> 169;
            case 30 -> 79;
            case 31 -> 106;
            case 32 -> 248;
            case 33 -> 224;
            case 34 -> 129;
            case 35 -> 114;
            case 36 -> 255;
            case 37 -> 206;
            case 38 -> 78;
            case 39 -> 50;
            case 40 -> 91;
            case 41 -> 149;
            case 42 -> 157;
            case 43 -> 30;
            case 44 -> 131;
            case 45 -> 69;
            case 46 -> 218;
            case 47 -> 102;
            case 48 -> 24;
            case 49 -> 236;
            case 50 -> 115;
            case 51 -> 26;
            case 52 -> 232;
            case 53 -> 39;
            case 54 -> 19;
            case 55 -> 113;
            case 56 -> 143;
            case 57 -> 191;
            case 58 -> 186;
            case 59 -> 223;
            case 60 -> 11;
            case 61 -> 31;
            case 62 -> 77;
            case 63 -> 252;
            case 64 -> 213;
            case 65 -> 156;
            case 66 -> 175;
            case 67 -> 148;
            case 68 -> 193;
            case 69 -> 243;
            case 70 -> 150;
            case 71 -> 163;
            case 72 -> 119;
            case 73 -> 107;
            case 74 -> 81;
            case 75 -> 52;
            case 76 -> 139;
            case 77 -> 33;
            case 78 -> 92;
            case 79 -> 161;
            case 80 -> 38;
            case 81 -> 237;
            case 82 -> 130;
            case 83 -> 71;
            case 84 -> 42;
            case 85 -> 83;
            case 86 -> 240;
            case 87 -> 108;
            case 88 -> 194;
            case 89 -> 62;
            case 90 -> 219;
            case 91 -> 210;
            case 92 -> 164;
            case 93 -> 190;
            case 94 -> 183;
            case 95 -> 36;
            case 96 -> 48;
            case 97 -> 212;
            case 98 -> 23;
            case 99 -> 227;
            case 100 -> 167;
            case 101 -> 3;
            case 102 -> 80;
            case 103 -> 16;
            case 104 -> 109;
            case 105 -> 111;
            case 106 -> 86;
            case 107 -> 2;
            case 108 -> 173;
            case 109 -> 226;
            case 110 -> 208;
            case 111 -> 51;
            case 112 -> 75;
            case 113 -> 29;
            case 114 -> 60;
            case 115 -> 93;
            case 116 -> 134;
            case 117 -> 96;
            case 118 -> 203;
            case 119 -> 6;
            case 120 -> 136;
            case 121 -> 179;
            case 122 -> 123;
            case 123 -> 181;
            case 124 -> 97;
            case 125 -> 230;
            case 126 -> 41;
            case 127 -> 54;
            case 128 -> 165;
            case 129 -> 249;
            case 130 -> 196;
            case 131 -> 14;
            case 132 -> 235;
            case 133 -> 170;
            case 134 -> 125;
            case 135 -> 198;
            case 136 -> 61;
            case 137 -> 231;
            case 138 -> 201;
            case 139 -> 247;
            case 140 -> 133;
            case 141 -> 63;
            case 142 -> 116;
            case 143 -> 192;
            case 144 -> 228;
            case 145 -> 180;
            case 146 -> 100;
            case 147 -> 138;
            case 148 -> 178;
            case 149 -> 151;
            case 150 -> 241;
            case 151 -> 101;
            case 152 -> 95;
            case 153 -> 18;
            case 154 -> 174;
            case 155 -> 9;
            case 156 -> 254;
            case 157 -> 221;
            case 158 -> 182;
            case 159 -> 7;
            case 160 -> 234;
            case 161 -> 17;
            case 162 -> 216;
            case 163 -> 217;
            case 164 -> 13;
            case 165 -> 103;
            case 166 -> 37;
            case 167 -> 0;
            case 168 -> 85;
            case 169 -> 99;
            case 170 -> 176;
            case 171 -> 211;
            case 172 -> 250;
            case 173 -> 146;
            case 174 -> 120;
            case 175 -> 238;
            case 176 -> 4;
            case 177 -> 64;
            case 178 -> 12;
            case 179 -> 121;
            case 180 -> 5;
            case 181 -> 126;
            case 182 -> 145;
            case 183 -> 43;
            case 184 -> 112;
            case 185 -> 200;
            case 186 -> 44;
            case 187 -> 72;
            case 188 -> 154;
            case 189 -> 155;
            case 190 -> 160;
            case 191 -> 53;
            case 192 -> 66;
            case 193 -> 207;
            case 194 -> 158;
            case 195 -> 15;
            case 196 -> 202;
            case 197 -> 82;
            case 198 -> 73;
            case 199 -> 32;
            case 200 -> 110;
            case 201 -> 140;
            case 202 -> 45;
            case 203 -> 239;
            case 204 -> 209;
            case 205 -> 57;
            case 206 -> 58;
            case 207 -> 98;
            case 208 -> 185;
            case 209 -> 132;
            case 210 -> 8;
            case 211 -> 251;
            case 212 -> 90;
            case 213 -> 89;
            case 214 -> 184;
            case 215 -> 246;
            case 216 -> 214;
            case 217 -> 34;
            case 218 -> 122;
            case 219 -> 56;
            case 220 -> 124;
            case 221 -> 135;
            case 222 -> 74;
            case 223 -> 94;
            case 224 -> 197;
            case 225 -> 40;
            case 226 -> 84;
            case 227 -> 59;
            case 228 -> 128;
            case 229 -> 47;
            case 230 -> 162;
            case 231 -> 225;
            case 232 -> 152;
            case 233 -> 171;
            case 234 -> 159;
            case 235 -> 127;
            case 236 -> 177;
            case 237 -> 172;
            case 238 -> 188;
            case 239 -> 137;
            case 240 -> 117;
            case 241 -> 153;
            case 242 -> 244;
            case 243 -> 70;
            case 244 -> 141;
            case 245 -> 65;
            case 246 -> 118;
            case 247 -> 147;
            case 248 -> 142;
            case 249 -> 1;
            case 250 -> 20;
            case 251 -> 168;
            case 252 -> 220;
            case 253 -> 28;
            case 254 -> 27;
            default -> 88;
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

      private static int[] IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private static String[] a;
      private static String[] b;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @JvmStatic
      @JvmName(
         name = "create"
      )
      @NotNull
      public final lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII a(
         @NotNull MeshData var1,
         @NotNull RenderPipeline var2,
         @NotNull Function<VertexFormat, IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI> var3,
         @NotNull Function<IndexType, IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI> var4
      ) {
         short var10001 = -15303;
         short var10002 = 28898;
         Intrinsics.checkNotNullParameter(var1, "<this>");
         int[] var10000 = b();
         var10002 = -15297;
         short var10003 = -19055;
         Intrinsics.checkNotNullParameter(var2, "pipeline");
         int[] var5 = var10000;
         var10001 = -15304;
         var10002 = -23558;
         Intrinsics.checkNotNullParameter(var3, "vboGetter");
         var10001 = -15305;
         var10002 = -15158;
         Intrinsics.checkNotNullParameter(var4, "iboGetter");
         var10000 = (int[])(Object)(var2.getVertexFormatMode());
         if (var5 != null) {
            if (var10000 == null) {
               var1.sortQuads(
                  lIIllllIIIIIIIIlIllIllIIlIIIlIlIlIIIllIIlIlIIIIIIllllIIIllIllIIIlllIllIIllllllllIllll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
                  RenderSystem.getProjectionType().vertexSorting()
               );
            }

            var10000 = (int[])(Object)(var3.apply(var2.getVertexFormat()));
         }

         IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI var15 = (IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI)(Object)var10000;
         ByteBuffer var23 = var1.vertexBuffer();
         var10003 = -15307;
         short var10004 = -518;
         Intrinsics.checkNotNullExpressionValue(var23, "vertexBuffer(...)");
         GpuBufferSlice var6 = var15.a(var23);
         ByteBuffer var7 = var1.indexBuffer();
         int var8 = var1.drawState().indexCount();
         Object var9 = null;
         Object var10 = null;
         if (var7 == null) {
            AutoStorageIndexBuffer var16 = RenderSystem.getSequentialBuffer(var2.getVertexFormatMode());
            var10002 = -15306;
            var10003 = 2082;
            Intrinsics.checkNotNullExpressionValue(var16, "getSequentialBuffer(...)");
            AutoStorageIndexBuffer var11 = var16;
            IndexType var17 = var11.type();
            var10002 = -15299;
            var10003 = -23890;
            Intrinsics.checkNotNullExpressionValue(var17, "type(...)");
            var10 = var17;
            GpuBufferSlice var18 = var11.getBuffer(var8).slice(0L, (long)var8 * ((IndexType)var10).bytes);
            var10002 = -15301;
            var10003 = -26744;
            Intrinsics.checkNotNullExpressionValue(var18, "slice(...)");
            var9 = var18;
         } else {
            IndexType var19 = var1.drawState().indexType();
            var10002 = -15300;
            var10003 = -5773;
            Intrinsics.checkNotNullExpressionValue(var19, "indexType(...)");
            var10 = var19;
            var9 = ((IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI)var4.apply((IndexType)var10)).a(var7);
         }

         VertexFormat var36 = var2.getVertexFormat();
         short var10006 = -15308;
         short var10007 = 16906;
         Intrinsics.checkNotNullExpressionValue(var36, "getVertexFormat(...)");
         lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII var20 = new lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII(
            var6, (GpuBufferSlice)var9, var36, (IndexType)var10, var8
         );
         if (var5 == null) {
            me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
               new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[1]
            );
         }

         return var20;
      }

      @JvmStatic
      public final void a(@NotNull RenderPass var1, @NotNull lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII var2) {
         short var10001 = -15298;
         short var10002 = 4034;
         Intrinsics.checkNotNullParameter(var1, "<this>");
         var10001 = -15302;
         var10002 = -26728;
         Intrinsics.checkNotNullParameter(var2, "meshDraw");
         lIIIIIlllIlllllIlIllIlIlIIIlIlIlllIllllllIIlIlIIlIIlllIlIllIllllllIllIIIIIllllIIIlIIl.a(var1, var2.l(), var2.m(), var2.n(), var2.o(), var2.p());
      }

      public static void b(int[] var0) {
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var0;
      }

      public static int[] b() {
         return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var21 = null; // PX-FIX
         String[] var5 = new String[12];
         int[] var10000 = new int[1];
         int var3 = 0;
         String var2 = "\rà\bü÷Wè×H%ÈÁ\u0089â\tÑ´9\u0083\u0017Âù\u000e\u009b\u0006¥Äî-\u00ad\u008a\b&gCë\u001c\u0088\u0014£\tî=\u0083èñ\u0093\u009b~\u009d\u0006åGæ]¬\u0084\b_*ÑÂ\u0005\u001a\u0015\u009b\nÖº'ó£\f\u008b\u0011Òi\u0014³õ\u0000\u0007ù[\u009a¡·2ÈÜ£ÞSØ7>EP\u0011.\\\u0086\u0010ïÕn+ÇQ\u0011\u0094\u0096\u0098B°\u0003";
         int var4 = "\rà\bü÷Wè×H%ÈÁ\u0089â\tÑ´9\u0083\u0017Âù\u000e\u009b\u0006¥Äî-\u00ad\u008a\b&gCë\u001c\u0088\u0014£\tî=\u0083èñ\u0093\u009b~\u009d\u0006åGæ]¬\u0084\b_*ÑÂ\u0005\u001a\u0015\u009b\nÖº'ó£\f\u008b\u0011Òi\u0014³õ\u0000\u0007ù[\u009a¡·2ÈÜ£ÞSØ7>EP\u0011.\\\u0086\u0010ïÕn+ÇQ\u0011\u0094\u0096\u0098B°\u0003"
            .length();
         b(var10000);
         char var1 = 14;
         int var8 = -1;

         label52:
         while (true) {
            byte var9 = 110;
            String var10001 = var2.substring(++var8, var8 + var1);
            byte var10002 = -1;

            while (true) {
               label47: {
                  char[] var25 = var10001.toCharArray();
                  int var10004 = var25.length;
                  int var6 = 0;
                  byte var28 = var9;
                  var21 = var25;
                  int var15 = var10004;
                  byte var33;
                  char[] var37;
                  int var10006;
                  if (var10004 <= 1) {
                     var37 = var25;
                     var33 = var9;
                     var10006 = var6;
                  } else {
                     var28 = var9;
                     var15 = var10004;
                     if (var10004 <= var6) {
                        break label47;
                     }

                     var37 = var25;
                     var33 = var9;
                     var10006 = var6;
                  }

                  while (true) {
                     var37[var10006] = (char)(var37[var10006] ^ var33 ^ switch (var6 % 7) {
                        case 0 -> 123;
                        case 1 -> 7;
                        case 2 -> 69;
                        case 3 -> 101;
                        case 4 -> 109;
                        case 5 -> 90;
                        default -> 22;
                     });
                     var6++;
                     if (var28 == 0) {
                        var10006 = var28;
                        var37 = var21;
                        var33 = var28;
                     } else {
                        if (var15 <= var6) {
                           break;
                        }

                        var37 = var21;
                        var33 = var28;
                        var10006 = var6;
                     }
                  }
               }

               String var30 = new String(var21).intern();
               switch (var10002) {
                  case 0:
                     var5[var3++] = var30;
                     if ((var8 += var1) >= var4) {
                        a = var5;
                        b = new String[12];
                        break label52;
                     }

                     var1 = var2.charAt(var8);
                     break;
                  default:
                     var5[var3++] = var30;
                     if ((var8 += var1) < var4) {
                        var1 = var2.charAt(var8);
                        continue label52;
                     }

                     var2 = "¢æ²ð?\u0093ÓK9Í[Ô\u0086\u001dG9L^§ïnýþd\t\u009eãá£-j\u0090Ñl";
                     var4 = "¢æ²ð?\u0093ÓK9Í[Ô\u0086\u001dG9L^§ïnýþd\t\u009eãá£-j\u0090Ñl".length();
                     var1 = 24;
                     var8 = -1;
               }

               var9 = 17;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -15300) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 237;
               case 1 -> 104;
               case 2 -> 247;
               case 3 -> 172;
               case 4 -> 252;
               case 5 -> 140;
               case 6 -> 33;
               case 7 -> 95;
               case 8 -> 92;
               case 9 -> 153;
               case 10 -> 102;
               case 11 -> 251;
               case 12 -> 213;
               case 13 -> 175;
               case 14 -> 40;
               case 15 -> 186;
               case 16 -> 34;
               case 17 -> 108;
               case 18 -> 44;
               case 19 -> 25;
               case 20 -> 149;
               case 21 -> 214;
               case 22 -> 61;
               case 23 -> 47;
               case 24 -> 2;
               case 25 -> 117;
               case 26 -> 100;
               case 27 -> 179;
               case 28 -> 107;
               case 29 -> 28;
               case 30 -> 103;
               case 31 -> 171;
               case 32 -> 112;
               case 33 -> 71;
               case 34 -> 130;
               case 35 -> 208;
               case 36 -> 143;
               case 37 -> 249;
               case 38 -> 118;
               case 39 -> 59;
               case 40 -> 76;
               case 41 -> 42;
               case 42 -> 147;
               case 43 -> 215;
               case 44 -> 24;
               case 45 -> 50;
               case 46 -> 240;
               case 47 -> 162;
               case 48 -> 139;
               case 49 -> 157;
               case 50 -> 57;
               case 51 -> 78;
               case 52 -> 114;
               case 53 -> 233;
               case 54 -> 5;
               case 55 -> 10;
               case 56 -> 230;
               case 57 -> 165;
               case 58 -> 225;
               case 59 -> 173;
               case 60 -> 48;
               case 61 -> 60;
               case 62 -> 105;
               case 63 -> 98;
               case 64 -> 211;
               case 65 -> 224;
               case 66 -> 69;
               case 67 -> 163;
               case 68 -> 223;
               case 69 -> 203;
               case 70 -> 87;
               case 71 -> 155;
               case 72 -> 250;
               case 73 -> 63;
               case 74 -> 113;
               case 75 -> 141;
               case 76 -> 11;
               case 77 -> 38;
               case 78 -> 135;
               case 79 -> 198;
               case 80 -> 82;
               case 81 -> 167;
               case 82 -> 21;
               case 83 -> 148;
               case 84 -> 68;
               case 85 -> 180;
               case 86 -> 231;
               case 87 -> 124;
               case 88 -> 253;
               case 89 -> 174;
               case 90 -> 7;
               case 91 -> 129;
               case 92 -> 197;
               case 93 -> 96;
               case 94 -> 200;
               case 95 -> 206;
               case 96 -> 125;
               case 97 -> 75;
               case 98 -> 219;
               case 99 -> 184;
               case 100 -> 3;
               case 101 -> 161;
               case 102 -> 84;
               case 103 -> 81;
               case 104 -> 154;
               case 105 -> 13;
               case 106 -> 205;
               case 107 -> 97;
               case 108 -> 12;
               case 109 -> 218;
               case 110 -> 199;
               case 111 -> 246;
               case 112 -> 49;
               case 113 -> 183;
               case 114 -> 160;
               case 115 -> 227;
               case 116 -> 110;
               case 117 -> 210;
               case 118 -> 150;
               case 119 -> 134;
               case 120 -> 55;
               case 121 -> 201;
               case 122 -> 128;
               case 123 -> 86;
               case 124 -> 222;
               case 125 -> 217;
               case 126 -> 41;
               case 127 -> 212;
               case 128 -> 189;
               case 129 -> 29;
               case 130 -> 142;
               case 131 -> 1;
               case 132 -> 64;
               case 133 -> 119;
               case 134 -> 43;
               case 135 -> 126;
               case 136 -> 133;
               case 137 -> 156;
               case 138 -> 30;
               case 139 -> 169;
               case 140 -> 192;
               case 141 -> 235;
               case 142 -> 187;
               case 143 -> 244;
               case 144 -> 93;
               case 145 -> 37;
               case 146 -> 137;
               case 147 -> 202;
               case 148 -> 70;
               case 149 -> 195;
               case 150 -> 132;
               case 151 -> 99;
               case 152 -> 83;
               case 153 -> 106;
               case 154 -> 31;
               case 155 -> 19;
               case 156 -> 232;
               case 157 -> 145;
               case 158 -> 170;
               case 159 -> 122;
               case 160 -> 16;
               case 161 -> 152;
               case 162 -> 159;
               case 163 -> 177;
               case 164 -> 66;
               case 165 -> 62;
               case 166 -> 73;
               case 167 -> 53;
               case 168 -> 123;
               case 169 -> 248;
               case 170 -> 90;
               case 171 -> 72;
               case 172 -> 56;
               case 173 -> 116;
               case 174 -> 164;
               case 175 -> 236;
               case 176 -> 54;
               case 177 -> 80;
               case 178 -> 243;
               case 179 -> 181;
               case 180 -> 166;
               case 181 -> 178;
               case 182 -> 46;
               case 183 -> 136;
               case 184 -> 26;
               case 185 -> 0;
               case 186 -> 17;
               case 187 -> 20;
               case 188 -> 101;
               case 189 -> 15;
               case 190 -> 185;
               case 191 -> 39;
               case 192 -> 131;
               case 193 -> 51;
               case 194 -> 6;
               case 195 -> 216;
               case 196 -> 254;
               case 197 -> 188;
               case 198 -> 91;
               case 199 -> 190;
               case 200 -> 115;
               case 201 -> 255;
               case 202 -> 23;
               case 203 -> 4;
               case 204 -> 191;
               case 205 -> 209;
               case 206 -> 182;
               case 207 -> 111;
               case 208 -> 52;
               case 209 -> 9;
               case 210 -> 27;
               case 211 -> 35;
               case 212 -> 77;
               case 213 -> 158;
               case 214 -> 8;
               case 215 -> 121;
               case 216 -> 79;
               case 217 -> 36;
               case 218 -> 67;
               case 219 -> 204;
               case 220 -> 65;
               case 221 -> 229;
               case 222 -> 168;
               case 223 -> 74;
               case 224 -> 228;
               case 225 -> 144;
               case 226 -> 239;
               case 227 -> 85;
               case 228 -> 238;
               case 229 -> 88;
               case 230 -> 32;
               case 231 -> 94;
               case 232 -> 151;
               case 233 -> 193;
               case 234 -> 234;
               case 235 -> 207;
               case 236 -> 221;
               case 237 -> 241;
               case 238 -> 138;
               case 239 -> 196;
               case 240 -> 22;
               case 241 -> 127;
               case 242 -> 18;
               case 243 -> 146;
               case 244 -> 45;
               case 245 -> 220;
               case 246 -> 120;
               case 247 -> 242;
               case 248 -> 194;
               case 249 -> 226;
               case 250 -> 89;
               case 251 -> 109;
               case 252 -> 245;
               case 253 -> 176;
               case 254 -> 14;
               default -> 58;
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

   public static me.octo.client.lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1, com.mojang.blaze3d.vertex.MeshData var2, com.mojang.blaze3d.pipeline.RenderPipeline var3, java.util.function.Function var4, java.util.function.Function var5, int var6, Object var7) {
      if ((var6 & 2) != 0) {
         var4 = me.octo.client.lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII.v();
      }
      if ((var6 & 4) != 0) {
         var5 = me.octo.client.lllIIlIlIIllIIIllIlIIIIIIlIIIIlllIllIlIlIIIlIIIIlIIIIIIIIIllIllIllIlIlllIIllIIllIlIII.w();
      }
      return var1.a(var2, var3, var4, var5);
   }


   public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker var1) {

      this();
   }

   }
}
