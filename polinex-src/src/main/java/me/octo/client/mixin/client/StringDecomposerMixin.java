package me.octo.client.mixin.client;

import net.minecraft.util.StringDecomposer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin({StringDecomposer.class})
public class StringDecomposerMixin {
   @Unique
   private static ThreadLocal<Boolean> polinex$isModifying = ThreadLocal.withInitial(() -> false);

   @ModifyVariable(
      method = {"iterateFormatted(Ljava/lang/String;ILnet/minecraft/network/chat/Style;Lnet/minecraft/util/FormattedCharSink;)Z", "iterateFormatted(Ljava/lang/String;Lnet/minecraft/network/chat/Style;Lnet/minecraft/util/FormattedCharSink;)Z", "iterate(Ljava/lang/String;Lnet/minecraft/network/chat/Style;Lnet/minecraft/util/FormattedCharSink;)Z", "iterateBackwards(Ljava/lang/String;Lnet/minecraft/network/chat/Style;Lnet/minecraft/util/FormattedCharSink;)Z"},
      at = @At("HEAD"),
      argsOnly = true,
      require = 0
   )
   private static String polinex$modifyVisitedText(String param0) {
      if (((java.lang.Boolean)polinex$isModifying.get()).booleanValue() || me.octo.client.utils.IIllIlllIIIIIllllIlllIIllIIIlIIllIIllIIlIllIIllIIIlIllIIlIIIIIlIIIIlIlIIIIIIlIlllIllI.a()) {
         return param0;
      }
      polinex$isModifying.set(java.lang.Boolean.valueOf(true));
      try {
         return me.octo.client.IlIIIIIlIIlIllllIllIllIIIIIIIllllIlIlIllIIlIlIIllIIlIIIlIllllIIIIIlllIllllllIIlIlllIl.e(param0);
      } catch (java.lang.Throwable var2) {
         return param0;
      } finally {
         polinex$isModifying.set(java.lang.Boolean.valueOf(false));
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
