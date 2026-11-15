package me.octo.client;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.ColorTargetState;
import com.mojang.blaze3d.pipeline.DepthStencilState;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Builder;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.CompareOp;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.renderer.rendertype.RenderSetup;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.rendertype.RenderSetup.OutlineProperty;
import net.minecraft.client.renderer.rendertype.RenderSetup.RenderSetupBuilder;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Util;
import org.jetbrains.annotations.NotNull;

public final class lIIlIlllIllIIIllIIIIIIIlIIIlIlIIlIIlllIIIlIIIllIllIlIIlllIIIIIIIIlIllllIlIIllIIIlllII {
   public static <T> T a(Object p0, Object p1) { return null; } // PX-FIX mr5
   @NotNull
   public static lIIlIlllIllIIIllIIIIIIIlIIIlIlIIlIIlllIIIlIIIllIllIlIIlllIIIIIIIIlIllllIlIIllIIIlllII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static DepthStencilState lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static RenderPipeline IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static RenderPipeline lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static RenderPipeline IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @JvmField
   @NotNull
   public static BiFunction<Identifier, Boolean, RenderType> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @JvmField
   @NotNull
   public static Function<Identifier, RenderType> IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @JvmField
   @NotNull
   public static BiFunction<Identifier, Boolean, RenderType> lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static String[] a;
   private static String[] b;

   private lIIlIlllIllIIIllIIIIIIIlIIIlIlIIlIIlllIIIlIIIllIllIlIIlllIIIIIIIIlIllllIlIIllIIIlllII() {
   }

   private final void a(Builder var1) {
      boolean var2 = false;
      var1.withDepthStencilState(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
   }

   private static final Unit b(Builder var0) {
      short var10001 = -31566;
      short var10002 = -16824;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      Snippet var4 = RenderPipelines.ENTITY_SNIPPET;
      short var10003 = -31572;
      short var10004 = -7877;
      Intrinsics.checkNotNullExpressionValue(RenderPipelines.ENTITY_SNIPPET, "ENTITY_SNIPPET");
      IlIlIlllIllllIlllIlIlIIllIlIIlIIIIlIlIIIlIllIIlIlIllllIIllIlIIIllIlIIIlIIIlIIIIIlIIlI.a(var0, var4);
      var10001 = -31574;
      var10002 = -14821;
      var0.withShaderDefine("ALPHA_CUTOUT", 0.1F);
      var10001 = -31567;
      var10002 = 6995;
      var0.withShaderDefine("PER_FACE_LIGHTING");
      var10001 = -31561;
      var10002 = 29253;
      var0.withSampler("Sampler1");
      var0.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var0.withCull(false);
      lIIlIlllIllIIIllIIIIIIIlIIIlIlIIlIIlllIIIlIIIllIllIlIIlllIIIIIIIIlIllllIlIIllIIIlllII var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var3 = false;
      var0.withDepthStencilState(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      return Unit.INSTANCE;
   }

   private static final Unit c(Builder var0) {
      short var10001 = -31562;
      short var10002 = 21514;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      Snippet var4 = RenderPipelines.ENTITY_SNIPPET;
      short var10003 = -31575;
      short var10004 = 22562;
      Intrinsics.checkNotNullExpressionValue(RenderPipelines.ENTITY_SNIPPET, "ENTITY_SNIPPET");
      IlIlIlllIllllIlllIlIlIIllIlIIlIIIIlIlIIIlIllIIlIlIllllIIllIlIIIllIlIIIlIIIlIIIIIlIIlI.a(var0, var4);
      var10001 = -31553;
      var10002 = -5519;
      var0.withShaderDefine("ALPHA_CUTOUT", 0.1F);
      var10001 = -31582;
      var10002 = 14504;
      var0.withSampler("Sampler1");
      lIIlIlllIllIIIllIIIIIIIlIIIlIlIIlIIlllIIIlIIIllIllIlIIlllIIIIIIIIlIllllIlIIllIIIlllII var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var3 = false;
      var0.withDepthStencilState(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      return Unit.INSTANCE;
   }

   private static final Unit d(Builder var0) {
      short var10001 = -31562;
      short var10002 = 21514;
      Intrinsics.checkNotNullParameter(var0, "$this$newPipeline");
      Snippet var4 = RenderPipelines.ENTITY_SNIPPET;
      short var10003 = -31575;
      short var10004 = 22562;
      Intrinsics.checkNotNullExpressionValue(RenderPipelines.ENTITY_SNIPPET, "ENTITY_SNIPPET");
      IlIlIlllIllllIlllIlIlIIllIlIIlIIIIlIlIIIlIllIIlIlIllllIIllIlIIIllIlIIIlIIIlIIIIIlIIlI.a(var0, var4);
      var10001 = -31553;
      var10002 = -5519;
      var0.withShaderDefine("ALPHA_CUTOUT", 0.1F);
      var10001 = -31570;
      var10002 = 10285;
      var0.withShaderDefine("PER_FACE_LIGHTING");
      var10001 = -31582;
      var10002 = 14504;
      var0.withSampler("Sampler1");
      var0.withCull(false);
      lIIlIlllIllIIIllIIIIIIIlIIIlIlIIlIIlllIIIlIIIllIllIlIIlllIIIIIIIIlIllllIlIIllIIIlllII var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var3 = false;
      var0.withDepthStencilState(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      return Unit.INSTANCE;
   }

   private static final RenderType a(Identifier var0, Boolean var1) {
      short var10001 = -31576;
      short var10002 = -11910;
      Intrinsics.checkNotNullParameter(var0, "identifier");
      var10001 = -31581;
      var10002 = -478;
      Intrinsics.checkNotNullParameter(var1, "affectsOutline");
      RenderSetupBuilder var10000 = RenderSetup.builder(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      var10001 = -31583;
      var10002 = -18336;
      RenderSetup var3 = var10000.withTexture("Sampler0", var0)
         .useLightmap()
         .useOverlay()
         .affectsCrumbling()
         .sortOnUpload()
         .setOutline(var1 ? OutlineProperty.AFFECTS_OUTLINE : OutlineProperty.NONE)
         .createRenderSetup();
      var10002 = -31569;
      short var10003 = -23800;
      Intrinsics.checkNotNullExpressionValue(var3, "createRenderSetup(...)");
      RenderSetup var2 = var3;
      short var4 = -31577;
      var10001 = -16848;
      return RenderType.create("polinex_entity_translucent", var2);
   }

   private static final RenderType a(Identifier var0) {
      short var10001 = -31579;
      short var10002 = -6769;
      Intrinsics.checkNotNullParameter(var0, "identifier");
      RenderSetupBuilder var10000 = RenderSetup.builder(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      var10001 = -31580;
      var10002 = -31009;
      RenderSetup var2 = var10000.withTexture("Sampler0", var0)
         .useLightmap()
         .useOverlay()
         .affectsCrumbling()
         .setOutline(OutlineProperty.AFFECTS_OUTLINE)
         .createRenderSetup();
      var10002 = -31571;
      short var10003 = -18821;
      Intrinsics.checkNotNullExpressionValue(var2, "createRenderSetup(...)");
      RenderSetup var1 = var2;
      short var3 = -31584;
      var10001 = -4671;
      return RenderType.create("polinex_entity_cutout", var1);
   }

   private static final RenderType b(Identifier var0, Boolean var1) {
      short var10001 = -31579;
      short var10002 = -6769;
      Intrinsics.checkNotNullParameter(var0, "identifier");
      var10001 = -31563;
      var10002 = 30169;
      Intrinsics.checkNotNullParameter(var1, "affectsOutline");
      RenderSetupBuilder var10000 = RenderSetup.builder(IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
      var10001 = -31580;
      var10002 = -31009;
      RenderSetup var3 = var10000.withTexture("Sampler0", var0)
         .useLightmap()
         .useOverlay()
         .affectsCrumbling()
         .setOutline(var1 ? OutlineProperty.AFFECTS_OUTLINE : OutlineProperty.NONE)
         .createRenderSetup();
      var10002 = -31571;
      short var10003 = -18821;
      Intrinsics.checkNotNullExpressionValue(var3, "createRenderSetup(...)");
      RenderSetup var2 = var3;
      short var4 = -31578;
      var10001 = -4845;
      return RenderType.create("polinex_entity_cutout_no_cull", var2);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var26 = null; // PX-FIX
      String[] var5 = new String[26];
      int var3 = 0;
      String var2 = "&êÛÉ_\u0003ßUÄ}ZÎÞ\u000bÝnp)÷\u0000ÞËtÊ\u0090O\u001d!5;2C|\\º´\u0080Tq\u001füå\u0087pô\u0011\n;fÞ\u001aX\tÑ\u00ad.\n\u009d_\u009f\u0012å\u0093Ïü\u001b¤\b\u0086\u008a\u0089\u00136bº\u0016\u000e\u008eÌ÷)\u009c\u0083\u0000fE\u0013`Z\u0098\u0085\bõ6ç\u0084û\u0090\u0003I\b¬GÌª\u009eU¯ð\u0015;ix¹+\rQ\u0094\u0015E`É\u0099ë5ej¨R\u0081S\u0016µ`Ñ.,öÂÑ\u0003\u009aÙbºú¹Î°Uí²\u00977\u0011|\r\u008al¤c¶ã\u008fÐs3]r\u0000ó*\u00169\u0094@°\u001e%\u0084«ËÕÀ\u008b\u0099ÇÝi<¡|,¥ä\u000e¨¬¡$\u0015¦ÌVN·am(L\u00184ÁåO)\u001d²¤ÆS)ü\u009bR\u0016ü\u009dÞ×¨\u0097\b¾±\f¯¶Á$\u0088\u0081ÔrÈóí'\u000e>\u008es`O.\u0087G'\u0095L)\u008dÄ\n[\u009eG*þ\u0094¬\u001cw¸\b\u0013\u007f;\u00ad`µpí\u0011ù\u0002ú¬âîÀ»áã³ýLB\u008aê}\u000ed¦ªd7*uSëµµ\u008e\"\u001f\u001bö÷½\u0089\"ÅÓ¿ê0¬\u0090+È\u0007OY\u0019v¼µïg\u0011Rêæ\f\u0015\u0080\u0002ÉBÚ\u0086å\u001a²ù?\u0011'\u009c!\u007f\u0099\u0094¯ô\f\n\u000eÀûå|\u001e£\u0011Ó\u007f\u007f\"\u001aªaÚu÷,×¶î}`\u0085\fK´ÉO;\n©ÿÿñEW";
      int var4 = "&êÛÉ_\u0003ßUÄ}ZÎÞ\u000bÝnp)÷\u0000ÞËtÊ\u0090O\u001d!5;2C|\\º´\u0080Tq\u001füå\u0087pô\u0011\n;fÞ\u001aX\tÑ\u00ad.\n\u009d_\u009f\u0012å\u0093Ïü\u001b¤\b\u0086\u008a\u0089\u00136bº\u0016\u000e\u008eÌ÷)\u009c\u0083\u0000fE\u0013`Z\u0098\u0085\bõ6ç\u0084û\u0090\u0003I\b¬GÌª\u009eU¯ð\u0015;ix¹+\rQ\u0094\u0015E`É\u0099ë5ej¨R\u0081S\u0016µ`Ñ.,öÂÑ\u0003\u009aÙbºú¹Î°Uí²\u00977\u0011|\r\u008al¤c¶ã\u008fÐs3]r\u0000ó*\u00169\u0094@°\u001e%\u0084«ËÕÀ\u008b\u0099ÇÝi<¡|,¥ä\u000e¨¬¡$\u0015¦ÌVN·am(L\u00184ÁåO)\u001d²¤ÆS)ü\u009bR\u0016ü\u009dÞ×¨\u0097\b¾±\f¯¶Á$\u0088\u0081ÔrÈóí'\u000e>\u008es`O.\u0087G'\u0095L)\u008dÄ\n[\u009eG*þ\u0094¬\u001cw¸\b\u0013\u007f;\u00ad`µpí\u0011ù\u0002ú¬âîÀ»áã³ýLB\u008aê}\u000ed¦ªd7*uSëµµ\u008e\"\u001f\u001bö÷½\u0089\"ÅÓ¿ê0¬\u0090+È\u0007OY\u0019v¼µïg\u0011Rêæ\f\u0015\u0080\u0002ÉBÚ\u0086å\u001a²ù?\u0011'\u009c!\u007f\u0099\u0094¯ô\f\n\u000eÀûå|\u001e£\u0011Ó\u007f\u007f\"\u001aªaÚu÷,×¶î}`\u0085\fK´ÉO;\n©ÿÿñEW"
         .length();
      char var1 = 26;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 116;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var36 = var10001.toCharArray();
               int var10004 = var36.length;
               int var6 = 0;
               byte var39 = var10000;
               var26 = var36;
               int var17 = var10004;
               byte var47;
               char[] var51;
               int var10006;
               if (var10004 <= 1) {
                  var51 = var36;
                  var47 = var10000;
                  var10006 = var6;
               } else {
                  var39 = var10000;
                  var17 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var51 = var36;
                  var47 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var51[var10006] = (char)(var51[var10006] ^ var47 ^ switch (var6 % 7) {
                     case 0 -> 125;
                     case 1 -> 28;
                     case 2 -> 88;
                     case 3 -> 6;
                     case 4 -> 90;
                     case 5 -> 33;
                     default -> 94;
                  });
                  var6++;
                  if (var39 == 0) {
                     var10006 = var39;
                     var51 = var26;
                     var47 = var39;
                  } else {
                     if (var17 <= var6) {
                        break;
                     }

                     var51 = var26;
                     var47 = var39;
                     var10006 = var6;
                  }
               }
            }

            String var41 = new String(var26).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var41;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[26];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIIlIlllIllIIIllIIIIIIIlIIIlIlIIlIIlllIIIlIIIllIllIlIIlllIIIIIIIIlIllllIlIIllIIIlllII();
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new DepthStencilState(
                        CompareOp.LESS_THAN_OR_EQUAL, true, 1.0F, -1.0E7F
                     );
                     short var19 = -31573;
                     var10002 = -7039;
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a("chams/entity_translucent", lIIlIlllIllIIIllIIIIIIIlIIIlIlIIlIIlllIIIlIIIllIllIlIIlllIIIIIIIIlIllllIlIIllIIIlllII::b);
                     short var20 = -31554;
                     var10002 = -26763;
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a("chams/entity_cutout", lIIlIlllIllIIIllIIIIIIIlIIIlIlIIlIIlllIIIlIIIllIllIlIIlllIIIIIIIIlIllllIlIIllIIIlllII::c);
                     short var21 = -31564;
                     var10002 = -1891;
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a("chams/entity_cutout_no_cull", lIIlIlllIllIIIllIIIIIIIlIIIlIlIIlIIlllIIIlIIIllIllIlIIlllIIIIIIIIlIllllIlIIllIIIlllII::d);
                     BiFunction var10 = Util.memoize((java.util.function.BiFunction)(lIIlIlllIllIIIllIIIIIIIlIIIlIlIIlIIlllIIIlIIIllIllIlIIlllIIIIIIIIlIllllIlIIllIIIlllII::a));
                     var10002 = -31568;
                     short var42 = 375;
                     Intrinsics.checkNotNullExpressionValue(var10, "memoize(...)");
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var10;
                     Function var11 = Util.memoize((java.util.function.Function<Identifier, RenderType>)(lIIlIlllIllIIIllIIIIIIIlIIIlIlIIlIIlllIIIlIIIllIllIlIIlllIIIIIIIIlIllllIlIIllIIIlllII::a));
                     var10002 = -31565;
                     short var43 = -25215;
                     Intrinsics.checkNotNullExpressionValue(var11, "memoize(...)");
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var11;
                     BiFunction var12 = Util.memoize((java.util.function.BiFunction<Identifier, Boolean, RenderType>)(lIIlIlllIllIIIllIIIIIIIlIIIlIlIIlIIlllIIIlIIIllIllIlIIlllIIIIIIIIlIllllIlIIllIIIlllII::b));
                     var10002 = -31565;
                     short var44 = -25215;
                     Intrinsics.checkNotNullExpressionValue(var12, "memoize(...)");
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var12;
                     break label52;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var41;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = ":ß\u0080úS©\\\u0084*ÞBq\u0013\u0007Opmhªi¡N\u0000Ëe4\u0085\u0017\u0015¨¡»";
                  var4 = ":ß\u0080úS©\\\u0084*ÞBq\u0013\u0007Opmhªi¡N\u0000Ëe4\u0085\u0017\u0015¨¡»".length();
                  var1 = '\f';
                  var8 = -1;
            }

            var10000 = 8;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -31577) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 239;
            case 1 -> 118;
            case 2 -> 230;
            case 3 -> 39;
            case 4 -> 206;
            case 5 -> 57;
            case 6 -> 141;
            case 7 -> 246;
            case 8 -> 48;
            case 9 -> 136;
            case 10 -> 11;
            case 11 -> 188;
            case 12 -> 166;
            case 13 -> 207;
            case 14 -> 248;
            case 15 -> 194;
            case 16 -> 14;
            case 17 -> 162;
            case 18 -> 227;
            case 19 -> 147;
            case 20 -> 88;
            case 21 -> 93;
            case 22 -> 229;
            case 23 -> 137;
            case 24 -> 25;
            case 25 -> 134;
            case 26 -> 252;
            case 27 -> 132;
            case 28 -> 16;
            case 29 -> 65;
            case 30 -> 30;
            case 31 -> 167;
            case 32 -> 198;
            case 33 -> 101;
            case 34 -> 241;
            case 35 -> 156;
            case 36 -> 84;
            case 37 -> 2;
            case 38 -> 223;
            case 39 -> 211;
            case 40 -> 187;
            case 41 -> 250;
            case 42 -> 38;
            case 43 -> 197;
            case 44 -> 123;
            case 45 -> 222;
            case 46 -> 62;
            case 47 -> 209;
            case 48 -> 40;
            case 49 -> 179;
            case 50 -> 127;
            case 51 -> 113;
            case 52 -> 153;
            case 53 -> 208;
            case 54 -> 122;
            case 55 -> 176;
            case 56 -> 185;
            case 57 -> 5;
            case 58 -> 168;
            case 59 -> 69;
            case 60 -> 169;
            case 61 -> 35;
            case 62 -> 80;
            case 63 -> 6;
            case 64 -> 149;
            case 65 -> 244;
            case 66 -> 72;
            case 67 -> 56;
            case 68 -> 0;
            case 69 -> 102;
            case 70 -> 237;
            case 71 -> 216;
            case 72 -> 238;
            case 73 -> 192;
            case 74 -> 120;
            case 75 -> 226;
            case 76 -> 64;
            case 77 -> 112;
            case 78 -> 104;
            case 79 -> 99;
            case 80 -> 85;
            case 81 -> 138;
            case 82 -> 63;
            case 83 -> 243;
            case 84 -> 89;
            case 85 -> 225;
            case 86 -> 110;
            case 87 -> 177;
            case 88 -> 119;
            case 89 -> 44;
            case 90 -> 254;
            case 91 -> 193;
            case 92 -> 175;
            case 93 -> 45;
            case 94 -> 49;
            case 95 -> 173;
            case 96 -> 98;
            case 97 -> 139;
            case 98 -> 53;
            case 99 -> 108;
            case 100 -> 215;
            case 101 -> 159;
            case 102 -> 28;
            case 103 -> 157;
            case 104 -> 143;
            case 105 -> 4;
            case 106 -> 253;
            case 107 -> 95;
            case 108 -> 90;
            case 109 -> 205;
            case 110 -> 9;
            case 111 -> 32;
            case 112 -> 213;
            case 113 -> 114;
            case 114 -> 100;
            case 115 -> 77;
            case 116 -> 7;
            case 117 -> 8;
            case 118 -> 217;
            case 119 -> 231;
            case 120 -> 202;
            case 121 -> 26;
            case 122 -> 151;
            case 123 -> 218;
            case 124 -> 70;
            case 125 -> 182;
            case 126 -> 133;
            case 127 -> 203;
            case 128 -> 164;
            case 129 -> 66;
            case 130 -> 20;
            case 131 -> 34;
            case 132 -> 111;
            case 133 -> 195;
            case 134 -> 196;
            case 135 -> 60;
            case 136 -> 233;
            case 137 -> 158;
            case 138 -> 135;
            case 139 -> 255;
            case 140 -> 109;
            case 141 -> 140;
            case 142 -> 131;
            case 143 -> 3;
            case 144 -> 33;
            case 145 -> 86;
            case 146 -> 75;
            case 147 -> 186;
            case 148 -> 146;
            case 149 -> 19;
            case 150 -> 126;
            case 151 -> 74;
            case 152 -> 174;
            case 153 -> 144;
            case 154 -> 224;
            case 155 -> 29;
            case 156 -> 47;
            case 157 -> 115;
            case 158 -> 97;
            case 159 -> 219;
            case 160 -> 178;
            case 161 -> 87;
            case 162 -> 27;
            case 163 -> 251;
            case 164 -> 125;
            case 165 -> 106;
            case 166 -> 52;
            case 167 -> 79;
            case 168 -> 58;
            case 169 -> 76;
            case 170 -> 184;
            case 171 -> 235;
            case 172 -> 36;
            case 173 -> 61;
            case 174 -> 13;
            case 175 -> 55;
            case 176 -> 22;
            case 177 -> 128;
            case 178 -> 191;
            case 179 -> 67;
            case 180 -> 15;
            case 181 -> 172;
            case 182 -> 116;
            case 183 -> 124;
            case 184 -> 103;
            case 185 -> 21;
            case 186 -> 236;
            case 187 -> 78;
            case 188 -> 41;
            case 189 -> 96;
            case 190 -> 189;
            case 191 -> 50;
            case 192 -> 91;
            case 193 -> 212;
            case 194 -> 160;
            case 195 -> 129;
            case 196 -> 163;
            case 197 -> 214;
            case 198 -> 71;
            case 199 -> 234;
            case 200 -> 46;
            case 201 -> 12;
            case 202 -> 155;
            case 203 -> 18;
            case 204 -> 145;
            case 205 -> 23;
            case 206 -> 180;
            case 207 -> 105;
            case 208 -> 37;
            case 209 -> 245;
            case 210 -> 232;
            case 211 -> 94;
            case 212 -> 43;
            case 213 -> 92;
            case 214 -> 221;
            case 215 -> 142;
            case 216 -> 152;
            case 217 -> 24;
            case 218 -> 201;
            case 219 -> 107;
            case 220 -> 161;
            case 221 -> 240;
            case 222 -> 130;
            case 223 -> 204;
            case 224 -> 183;
            case 225 -> 150;
            case 226 -> 83;
            case 227 -> 51;
            case 228 -> 148;
            case 229 -> 59;
            case 230 -> 121;
            case 231 -> 171;
            case 232 -> 68;
            case 233 -> 247;
            case 234 -> 82;
            case 235 -> 200;
            case 236 -> 73;
            case 237 -> 42;
            case 238 -> 17;
            case 239 -> 165;
            case 240 -> 54;
            case 241 -> 181;
            case 242 -> 31;
            case 243 -> 81;
            case 244 -> 154;
            case 245 -> 220;
            case 246 -> 190;
            case 247 -> 242;
            case 248 -> 10;
            case 249 -> 228;
            case 250 -> 199;
            case 251 -> 170;
            case 252 -> 249;
            case 253 -> 117;
            case 254 -> 210;
            default -> 1;
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
