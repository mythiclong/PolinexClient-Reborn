package me.octo.client.mixin.client;

import java.util.Random;
import net.minecraft.client.gui.components.SplashRenderer;
import net.minecraft.client.resources.SplashManager;
import net.minecraft.network.chat.Component;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({SplashManager.class})
public class SplashTextMixin {
   @Inject(
      method = {"getSplash"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void get(CallbackInfoReturnable<SplashRenderer> var1) {
      String[] var2 = new String[]{"We <3 Polinex!", "polinexclient.com", "Two steps ahead.", "lf polinex update", "Polinex users are sexy"};
      var1.setReturnValue(new SplashRenderer(Component.literal(var2[new Random().nextInt(var2.length)])));
   }
}
