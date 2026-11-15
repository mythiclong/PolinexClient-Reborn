package me.octo.client;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuSampler;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.Unit;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;

public abstract class IIlIIIIlIIlIllllIlllIIIIIIIIIIlIIllllIIlllIIIIIlIllIIIIlIlIIIlIllIlIIIlllIllIIIIlIIIl {

   @NotNull
   private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final RenderPipeline lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private final boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private final boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private final lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private final GpuSampler IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private boolean IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static String[] a;
   private static String[] b;

   public IIlIIIIlIIlIllllIlllIIIIIIIIIIlIIllllIIlllIIIIIlIllIIIIlIlIIIlIllIlIIIlllIllIIIIlIIIl(
      @NotNull String var1, @NotNull RenderPipeline var2, boolean var3, boolean var4
   ) {
      short var10001 = -22604;
      short var10002 = 13460;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = -22593;
      var10002 = -14605;
      Intrinsics.checkNotNullParameter(var2, "blitPipeline");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
      short var10004 = -22601;
      short var10005 = 3194;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl(
         "Custom shader FBO " + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
         0,
         4,
         null
      );
      GpuSampler var6 = RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST);
      short var10003 = -22602;
      var10004 = 18624;
      Intrinsics.checkNotNullExpressionValue(var6, "getClampToEdge(...)");
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var6;
   }

   public IIlIIIIlIIlIllllIlllIIIIIIIIIIlIIllllIIlllIIIIIlIllIIIIlIlIIIlIllIlIIIlllIllIIIIlIIIl(
      @NotNull String var1, @NotNull RenderPipeline var2, boolean var3, boolean var4, int var5, kotlin.jvm.internal.DefaultConstructorMarker var6
   ) {
      if ((var5 & 4) != 0) {
         var3 = false;
      }
      if ((var5 & 8) != 0) {
         var4 = false;
      }
      this(var1, var2, var3, var4);
   }

   @NotNull
   public final String a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   public final boolean b() {
      return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   public final void a(boolean var1) {
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var1;
   }

   public boolean c() {
      return true;
   }

   @NotNull
   public final RenderTarget d() {
      RenderTarget renderTarget;
      block9: {
         boolean bl;
         block11: {
            block10: {
               boolean bl2;
               boolean bl3;
               block7: {
                  block8: {
                     bl3 = lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl.f();
                     try {
                        bl2 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
                        if (!bl3) break block7;
                        if (bl2) break block8;
                     }
                     catch (IllegalArgumentException illegalArgumentException) {
                        throw (RuntimeException)IIlIIIIlIIlIllllIlllIIIIIIIIIIlIIllllIIlllIIIIIlIllIIIIlIlIIIlIllIlIIIlllIllIIIIlIIIl.a(illegalArgumentException);
                     }
                     bl2 = true;
                     break block7;
                  }
                  bl2 = false;
               }
               if (!bl2) {
                  boolean bl4 = false;
                  String string = "OverlayShaderRenderer " + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl + " is dirty, draw it before starting another render pass";
                  throw new IllegalArgumentException(string.toString());
               }
               try {
                  try {
                     renderTarget = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.d();
                     if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() != null) break block9;
                     if (!bl3) break block10;
                  }
                  catch (IllegalArgumentException illegalArgumentException) {
                     throw (RuntimeException)IIlIIIIlIIlIllllIlllIIIIIIIIIIlIIllllIIlllIIIIIlIllIIIIlIlIIIlIllIlIIIlllIllIIIIlIIIl.a(illegalArgumentException);
                  }
                  bl = false;
                  break block11;
               }
               catch (IllegalArgumentException illegalArgumentException) {
                  throw (RuntimeException)IIlIIIIlIIlIllllIlllIIIIIIIIIIlIIllllIIlllIIIIIlIllIIIIlIlIIIlIllIlIIIlllIllIIIIlIIIl.a(illegalArgumentException);
               }
            }
            bl = true;
         }
         lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl.b(bl);
      }
      return renderTarget;
   }

   protected void e() {
   }

   protected void a(@NotNull RenderPass var1) {
      short var10001 = -22595;
      short var10002 = -16097;
      Intrinsics.checkNotNullParameter(var1, "pass");
   }

   protected void f() {
   }

   public final void a(@NotNull RenderTarget param1) {
      final boolean bl = lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl.f();
      Intrinsics.checkNotNullParameter(param1, "target");
      if (this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
         throw new IllegalArgumentException("Overlay shader " + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl + " FBO color texture view is null");
      }
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = false;
      this.e();
      com.mojang.blaze3d.textures.GpuTextureView gpuTextureView = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.c().getColorTextureView();
      final String string = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      RenderPass renderPass = lIIIIIlllIlllllIlIllIlIlIIIlIlIlllIllllllIIlIlIIlIIlllIlIllIllllllIllIIIIIllllIIIlIIl.a(param1, new java.util.function.Supplier<String>() {
         public String get() {
            return "Overlay Shader " + string + " blit pass";
         }
      }, (java.util.OptionalInt)null, (java.util.OptionalDouble)null, false, false, 30, (Object)null);
      Throwable throwable = null;
      try {
         renderPass.setPipeline(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         if (bl) {
            RenderSystem.bindDefaultUniforms(renderPass);
         }
         renderPass.bindTexture("InSampler", gpuTextureView, this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
         this.a(renderPass);
         renderPass.draw(0, 3);
      } catch (Throwable throwable2) {
         throwable = throwable2;
         throw throwable2;
      } finally {
         kotlin.jdk7.AutoCloseableKt.closeFinally(renderPass, throwable);
      }
      this.f();
   }

   private static final String a(IIlIIIIlIIlIllllIlllIIIIIIIIIIlIIllllIIlllIIIIIlIllIIIIlIlIIIlIllIlIIIlllIllIIIIlIIIl var0) {
      short var10001 = -22596;
      short var10002 = -13855;
      var10002 = -22599;
      short var10003 = -1701;
      return "Overlay Shader " + var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl + " blit pass";
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[13];
      int var3 = 0;
      String var2 = "ñ8¼¦ÇèãÚgX_ïÌõ%\u008d\u0081$}mo\u0012\u0015O\u0080ÜÛJð\u009fòcã>~ÚÛ¬iVÃ\\f\u009bXä\u008f+ê{Oÿ!è\u0004±\\-f\u0012¹#º\u000e\f'¢ F½\f¶j¾Àï\f\u0012\u00138 -[\u001aPNÀ\u0003Ü>T<\u0086Ói¬-~\u000f\u0000Ç\u0016÷NÒÐÀa\u0081\u0095\u0018ë\u0018c\u001f\u0092\u0017áæ?h-\u0099\u0016u¥Ï\u0084úÚ\u0003\u0006\u001bõ\u00adr\u009f#ÏQ\u0087?\u0002AÑJ\u0006Ä¶Å9È©\tý,Y\u0082V\u001cço1\u0004Fó\u0010\u0085\u000f½n¡Â¸t\u000e\u0014\u009a\u001bÎK\u0080r\u000e\f)\n·\u0011ËÀÒÎ\u0016¬\u0088\u009d";
      int var4 = "ñ8¼¦ÇèãÚgX_ïÌõ%\u008d\u0081$}mo\u0012\u0015O\u0080ÜÛJð\u009fòcã>~ÚÛ¬iVÃ\\f\u009bXä\u008f+ê{Oÿ!è\u0004±\\-f\u0012¹#º\u000e\f'¢ F½\f¶j¾Àï\f\u0012\u00138 -[\u001aPNÀ\u0003Ü>T<\u0086Ói¬-~\u000f\u0000Ç\u0016÷NÒÐÀa\u0081\u0095\u0018ë\u0018c\u001f\u0092\u0017áæ?h-\u0099\u0016u¥Ï\u0084úÚ\u0003\u0006\u001bõ\u00adr\u009f#ÏQ\u0087?\u0002AÑJ\u0006Ä¶Å9È©\tý,Y\u0082V\u001cço1\u0004Fó\u0010\u0085\u000f½n¡Â¸t\u000e\u0014\u009a\u001bÎK\u0080r\u000e\f)\n·\u0011ËÀÒÎ\u0016¬\u0088\u009d"
         .length();
      char var1 = '6';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 118;
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
                     case 0 -> 3;
                     case 1 -> 1;
                     case 2 -> 13;
                     case 3 -> 93;
                     case 4 -> 48;
                     case 5 -> 98;
                     default -> 63;
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
                     b = new String[13];
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

                  var2 = "]\u0091-\u00ad¹\t¾X'\u0016°Smà\u0093¤\u009a\u0007p\u00adQ;\n?Ùê)q µ6u½";
                  var4 = "]\u0091-\u00ad¹\t¾X'\u0016°Smà\u0093¤\u009a\u0007p\u00adQ;\n?Ùê)q µ6u½".length();
                  var1 = 22;
                  var8 = -1;
            }

            var10000 = 9;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -22603) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 238;
            case 1 -> 4;
            case 2 -> 66;
            case 3 -> 111;
            case 4 -> 116;
            case 5 -> 110;
            case 6 -> 240;
            case 7 -> 123;
            case 8 -> 209;
            case 9 -> 38;
            case 10 -> 69;
            case 11 -> 104;
            case 12 -> 175;
            case 13 -> 163;
            case 14 -> 141;
            case 15 -> 81;
            case 16 -> 31;
            case 17 -> 146;
            case 18 -> 44;
            case 19 -> 210;
            case 20 -> 216;
            case 21 -> 137;
            case 22 -> 200;
            case 23 -> 24;
            case 24 -> 50;
            case 25 -> 198;
            case 26 -> 160;
            case 27 -> 188;
            case 28 -> 212;
            case 29 -> 195;
            case 30 -> 130;
            case 31 -> 3;
            case 32 -> 247;
            case 33 -> 36;
            case 34 -> 62;
            case 35 -> 250;
            case 36 -> 176;
            case 37 -> 72;
            case 38 -> 144;
            case 39 -> 94;
            case 40 -> 95;
            case 41 -> 236;
            case 42 -> 9;
            case 43 -> 237;
            case 44 -> 227;
            case 45 -> 170;
            case 46 -> 202;
            case 47 -> 159;
            case 48 -> 229;
            case 49 -> 222;
            case 50 -> 29;
            case 51 -> 220;
            case 52 -> 82;
            case 53 -> 70;
            case 54 -> 14;
            case 55 -> 161;
            case 56 -> 187;
            case 57 -> 166;
            case 58 -> 41;
            case 59 -> 55;
            case 60 -> 191;
            case 61 -> 253;
            case 62 -> 86;
            case 63 -> 32;
            case 64 -> 153;
            case 65 -> 101;
            case 66 -> 0;
            case 67 -> 194;
            case 68 -> 77;
            case 69 -> 173;
            case 70 -> 232;
            case 71 -> 199;
            case 72 -> 5;
            case 73 -> 138;
            case 74 -> 25;
            case 75 -> 53;
            case 76 -> 113;
            case 77 -> 150;
            case 78 -> 89;
            case 79 -> 143;
            case 80 -> 125;
            case 81 -> 179;
            case 82 -> 119;
            case 83 -> 85;
            case 84 -> 13;
            case 85 -> 122;
            case 86 -> 22;
            case 87 -> 126;
            case 88 -> 196;
            case 89 -> 165;
            case 90 -> 102;
            case 91 -> 215;
            case 92 -> 181;
            case 93 -> 231;
            case 94 -> 34;
            case 95 -> 168;
            case 96 -> 255;
            case 97 -> 15;
            case 98 -> 57;
            case 99 -> 61;
            case 100 -> 230;
            case 101 -> 127;
            case 102 -> 51;
            case 103 -> 96;
            case 104 -> 132;
            case 105 -> 149;
            case 106 -> 226;
            case 107 -> 136;
            case 108 -> 223;
            case 109 -> 60;
            case 110 -> 139;
            case 111 -> 8;
            case 112 -> 155;
            case 113 -> 133;
            case 114 -> 7;
            case 115 -> 254;
            case 116 -> 64;
            case 117 -> 214;
            case 118 -> 2;
            case 119 -> 79;
            case 120 -> 108;
            case 121 -> 182;
            case 122 -> 10;
            case 123 -> 213;
            case 124 -> 221;
            case 125 -> 246;
            case 126 -> 106;
            case 127 -> 49;
            case 128 -> 239;
            case 129 -> 71;
            case 130 -> 74;
            case 131 -> 171;
            case 132 -> 54;
            case 133 -> 140;
            case 134 -> 178;
            case 135 -> 17;
            case 136 -> 11;
            case 137 -> 156;
            case 138 -> 46;
            case 139 -> 193;
            case 140 -> 228;
            case 141 -> 183;
            case 142 -> 109;
            case 143 -> 131;
            case 144 -> 203;
            case 145 -> 107;
            case 146 -> 152;
            case 147 -> 16;
            case 148 -> 243;
            case 149 -> 59;
            case 150 -> 67;
            case 151 -> 248;
            case 152 -> 19;
            case 153 -> 148;
            case 154 -> 56;
            case 155 -> 30;
            case 156 -> 47;
            case 157 -> 157;
            case 158 -> 21;
            case 159 -> 37;
            case 160 -> 88;
            case 161 -> 154;
            case 162 -> 177;
            case 163 -> 26;
            case 164 -> 114;
            case 165 -> 115;
            case 166 -> 80;
            case 167 -> 197;
            case 168 -> 100;
            case 169 -> 208;
            case 170 -> 249;
            case 171 -> 6;
            case 172 -> 185;
            case 173 -> 84;
            case 174 -> 190;
            case 175 -> 211;
            case 176 -> 241;
            case 177 -> 217;
            case 178 -> 12;
            case 179 -> 99;
            case 180 -> 91;
            case 181 -> 172;
            case 182 -> 42;
            case 183 -> 93;
            case 184 -> 48;
            case 185 -> 35;
            case 186 -> 52;
            case 187 -> 192;
            case 188 -> 23;
            case 189 -> 63;
            case 190 -> 218;
            case 191 -> 225;
            case 192 -> 40;
            case 193 -> 184;
            case 194 -> 118;
            case 195 -> 151;
            case 196 -> 234;
            case 197 -> 147;
            case 198 -> 73;
            case 199 -> 75;
            case 200 -> 90;
            case 201 -> 105;
            case 202 -> 180;
            case 203 -> 142;
            case 204 -> 235;
            case 205 -> 117;
            case 206 -> 27;
            case 207 -> 68;
            case 208 -> 28;
            case 209 -> 121;
            case 210 -> 233;
            case 211 -> 167;
            case 212 -> 135;
            case 213 -> 78;
            case 214 -> 244;
            case 215 -> 219;
            case 216 -> 18;
            case 217 -> 242;
            case 218 -> 169;
            case 219 -> 162;
            case 220 -> 112;
            case 221 -> 58;
            case 222 -> 128;
            case 223 -> 45;
            case 224 -> 124;
            case 225 -> 145;
            case 226 -> 33;
            case 227 -> 186;
            case 228 -> 174;
            case 229 -> 65;
            case 230 -> 251;
            case 231 -> 98;
            case 232 -> 204;
            case 233 -> 76;
            case 234 -> 120;
            case 235 -> 252;
            case 236 -> 164;
            case 237 -> 103;
            case 238 -> 97;
            case 239 -> 206;
            case 240 -> 129;
            case 241 -> 39;
            case 242 -> 87;
            case 243 -> 224;
            case 244 -> 83;
            case 245 -> 201;
            case 246 -> 245;
            case 247 -> 92;
            case 248 -> 158;
            case 249 -> 207;
            case 250 -> 1;
            case 251 -> 205;
            case 252 -> 20;
            case 253 -> 43;
            case 254 -> 189;
            default -> 134;
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
