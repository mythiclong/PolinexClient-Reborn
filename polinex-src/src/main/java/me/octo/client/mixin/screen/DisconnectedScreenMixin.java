package me.octo.client.mixin.screen;

import me.octo.client.lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll;
import me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.MultiLineTextWidget;
import net.minecraft.client.gui.screens.DisconnectedScreen;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({DisconnectedScreen.class})
public abstract class DisconnectedScreenMixin extends Screen {
   @Unique
   private boolean polinex$banClipButtonsAdded = false;
   @Unique
   private Button polinex$uploadButton;
   @Unique
   private Button polinex$localOnlyButton;
   @Unique
   private Button polinex$askAgainButton;
   @Unique
   private MultiLineTextWidget polinex$banClipPromptText;

   protected DisconnectedScreenMixin(Component var1) {
      super(var1);
   }

   @Inject(
      method = {"init"},
      at = {@At("TAIL")}
   )
   private void polinex$initBanClipPrompt(CallbackInfo var1) {
      lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d(
         "Clipping UI: DisconnectedScreen init width="
            + this.width
            + " height="
            + this.height
            + " pendingPrompt="
            + lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI
               .aX()
            + " buttonsAdded="
            + this.polinex$banClipButtonsAdded
      );
      if (lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI
            .aX()
         && !this.polinex$banClipButtonsAdded) {
         this.polinex$addBanClipButtons();
      }
   }

   @Inject(
      method = {"repositionElements"},
      at = {@At("TAIL")}
   )
   private void polinex$refreshBanClipPromptLayout(CallbackInfo var1) {
      boolean var2 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI
         .aX();
      lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d(
         "Clipping UI: DisconnectedScreen refreshWidgetPositions pendingPrompt=" + var2 + " buttonsAdded=" + this.polinex$banClipButtonsAdded
      );
      if (var2 && !this.polinex$banClipButtonsAdded) {
         this.polinex$addBanClipButtons();
      } else {
         if (var2 && this.polinex$banClipButtonsAdded) {
            this.polinex$layoutBanClipWidgets();
         }
      }
   }

   @Unique
   private void polinex$addBanClipButtons() {
      byte var1 = 98;
      byte var2 = 20;
      byte var3 = 4;
      int var4 = var1 * 3 + var3 * 2;
      int var5 = (this.width - var4) / 2;
      int var6 = this.height - 72;
      lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d(
         "Clipping UI: adding ban clip buttons startX=" + var5 + " y=" + var6 + " width=" + this.width + " height=" + this.height
      );
      this.polinex$banClipPromptText = this.addRenderableWidget(
         new MultiLineTextWidget(Component.literal("Ban clip saved locally. Also upload it to the backend?"), this.font)
            .setCentered(true)
            .setMaxWidth(Math.max(120, this.width - 40))
      );
      this.polinex$uploadButton = this.addRenderableWidget(
         Button.builder(
               Component.literal("Upload Too"),
               var1x -> {
                  lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Clipping UI: Upload Too clicked");
                  lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI
                     .a(
                        lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                     );
                  this.polinex$hideBanClipButtons();
               }
            )
            .bounds(var5, var6, var1, var2)
            .build()
      );
      this.polinex$localOnlyButton = this.addRenderableWidget(
         Button.builder(
               Component.literal("Local Only"),
               var1x -> {
                  lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Clipping UI: Local Only clicked");
                  lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI
                     .a(
                        lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     );
                  this.polinex$hideBanClipButtons();
               }
            )
            .bounds(var5 + var1 + var3, var6, var1, var2)
            .build()
      );
      this.polinex$askAgainButton = this.addRenderableWidget(
         Button.builder(
               Component.literal("Not Now"),
               var1x -> {
                  lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Clipping UI: Not Now clicked");
                  lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI
                     .a(
                        lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     );
                  this.polinex$hideBanClipButtons();
               }
            )
            .bounds(var5 + (var1 + var3) * 2, var6, var1, var2)
            .build()
      );
      this.polinex$banClipButtonsAdded = true;
      this.polinex$layoutBanClipWidgets();
   }

   @Unique
   private void polinex$layoutBanClipWidgets() {
      if (this.polinex$banClipPromptText != null) {
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Clipping UI: laying out ban clip prompt text");
         this.polinex$banClipPromptText.setPosition((this.width - this.polinex$banClipPromptText.getWidth()) / 2, this.height - 96);
      }
   }

   @Unique
   private void polinex$hideBanClipButtons() {
      lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Clipping UI: hiding ban clip buttons");
      if (this.polinex$banClipPromptText != null) {
         this.polinex$banClipPromptText.visible = false;
         this.polinex$banClipPromptText.active = false;
      }

      if (this.polinex$uploadButton != null) {
         this.polinex$uploadButton.visible = false;
         this.polinex$uploadButton.active = false;
      }

      if (this.polinex$localOnlyButton != null) {
         this.polinex$localOnlyButton.visible = false;
         this.polinex$localOnlyButton.active = false;
      }

      if (this.polinex$askAgainButton != null) {
         this.polinex$askAgainButton.visible = false;
         this.polinex$askAgainButton.active = false;
      }

      this.polinex$banClipButtonsAdded = false;
   }
}
