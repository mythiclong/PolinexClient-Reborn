package me.octo.client;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextColor;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2fStack;

public final class llIllIlllllIlIlIIllIIIlllIIllIIlIIllIIIlIllllIllIllIllIIIlIllIllIIllIIllIlIIlIIIlIIII
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static llIllIlllllIlIlIIllIIIlllIIllIIlIIllIIIlIllllIllIllIllIIIlIllIllIIllIIllIlIIlIIIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private float lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private final float[] lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private String IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private String llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @NotNull
   private me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @NotNull
   private me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private float IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private float IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private long llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private int IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   private float lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   private float llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   private float lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   private long IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   @NotNull
   private final Regex IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   @NotNull
   private final Regex IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   @NotNull
   private final Regex llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   @JvmField
   @NotNull
   public static llIllIlllllIlIlIIllIIIlllIIllIIlIIllIIIlIllllIllIllIllIIIlIllIllIIllIIllIlIIlIIIlIIII lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   private static String[] f;
   private static String[] g;

   private llIllIlllllIlIlIIllIIIlllIIllIIlIIllIIIlIllllIllIllIllIIIlIllIllIIllIIllIlIIlIIIlIIII() {
      short var10001 = -28069;
      short var10002 = -16433;
      var10002 = -28080;
      short var10003 = 23944;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var7 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      short var10004 = -28066;
      short var10005 = -6733;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         lIllIlIIIllIlIlIIIlIlllIIlllIllllIIIllllIlIllIlIlIllIIlllIlIlIllllIIIIIIIlIIIlIlIIIII.a(),
         lIllIlIIIllIlIlIIIlIlllIIlllIllllIIIllllIlIllIlIlIllIIlllIlIlIllllIIIIIIIlIIIlIlIIIII.b(),
         lIllIlIIIllIlIlIIIlIlllIIlllIllllIIIllllIlIllIlIlIllIIlllIlIlIllllIIIIIIIlIIIlIlIIIII.c(),
         lIllIlIIIllIlIlIIIlIlllIIlllIllllIIIllllIlIllIlIlIllIIlllIlIlIllllIIIIIIIlIIIlIlIIIII.d(),
         lIllIlIIIllIlIlIIIlIlllIIlllIllllIIIllllIlIllIlIlIllIIlllIlIlIllllIIIIIIIlIIIlIlIIIII.e()
      };
      super("Custom Hotbar", "Replaces vanilla hotbar with a smoother pill design.", var7, "Misc", var1);
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = -1.0F;
      int var5 = 0;

      float[] var2;
      for (var2 = new float[9]; var5 < 9; var5++) {
         var2[var5] = 1.0F;
      }

      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var2;
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = "";
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = "";
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = -1;
      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = -1.0F;
      this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = -1.0F;
      this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = -1.0F;
      var10003 = -28078;
      var10004 = 7634;
      this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = new Regex("§[0-9a-fk-orA-FK-OR]");
      var10003 = -28067;
      var10004 = -26119;
      this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = new Regex("[^\\x20-\\x7E]");
      var10003 = -28071;
      byte var13 = 70;
      this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = new Regex("§([0-9a-fA-F])");
   }

   private final boolean ag() {
      return lIllIlIIIllIlIlIIIlIlllIIlllIllllIIIllllIlIllIlIlIllIIlllIlIlIllllIIIIIIIlIIIlIlIIIII.c().ae();
   }

   public final boolean ah() {
      return true;
   }

   public final boolean ai() {
      return lIllIlIIIllIlIlIIIlIlllIIlllIllllIIIllllIlIllIlIlIllIIlllIlIlIllllIIIIIIIlIIIlIlIIIII.e().ae();
   }

   @Override
   public void aB() {
      super.aB();
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = -1.0F;
      int var2 = 0;
      int var3 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.length;
      String var1 = var10000;

      while (true) {
         if (var2 < var3) {
            this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll[var2] = 1.0F;
            var2++;
            if (var1 != null) {
               break;
            }

            if (var1 == null) {
               continue;
            }

            me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
               new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[5]
            );
         }

         this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = "";
         this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = "";
         this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a();
         this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a();
         this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = 0.0F;
         this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = 0.0F;
         this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = -1.0F;
         this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = -1.0F;
         this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = -1.0F;
         this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = -1;
         this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = 0L;
         break;
      }
   }

   @SubscribeEvent
   public final void a(@NotNull IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl var1) {
      float var41 = 0; // PX-FIX
      Object var40 = null; // PX-FIX
      Object var36 = null; // PX-FIX
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      short var10002 = -28079;
      short var10003 = -28719;
      Intrinsics.checkNotNullParameter(var1, "event");
      String var2 = var10000;
      llIllIlllllIlIlIIllIIIlllIIllIIlIIllIIIlIllllIllIllIllIIIlIllIllIIllIIllIlIIlIIIlIIII var31 = this;
      if (var2 == null) {
         if (!this.ae()) {
            return;
         }

         var31 = this;
      }

      LocalPlayer var32 = var31.ap().player;
      if (var32 != null) {
         LocalPlayer var3 = var32;
         if (var3.getInventory() != null) {
            if (var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI != null) {
               GuiGraphicsExtractor var4 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
               float var5 = var1.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
               float var6 = var1.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
               float var7 = RangesKt.coerceAtLeast(this.ap().getWindow().getGuiScale(), 1.0F);
               long var8 = System.nanoTime();
               long var33 = this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
               long var10001 = 0L;
               if (var2 == null) {
                  if (this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll == 0L) {
                     this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = var8;
                  }

                  var33 = var8;
                  var10001 = this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
               }

               float var10 = RangesKt.coerceIn((float)(var33 - var10001) / 1.0E9F, 0.001F, 0.1F);
               this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = var8;
               float var11 = ((lIllIlIIIllIlIlIIIlIlllIIlllIllllIIIllllIlIllIlIlIllIIlllIlIlIllllIIIIIIIlIIIlIlIIIII.a())).<Float>n() * 1.07F;
               float var12 = ((lIllIlIIIllIlIlIIIlIlllIIlllIllllIIIllllIlIllIlIlIllIIlllIlIlIllllIIIIIIIlIIIlIlIIIII.b())).n();
               int var13 = RangesKt.coerceIn(var3.getInventory().getSelectedSlot(), 0, 8);
               float var14 = 170.0F * var11;
               float var15 = 19.0F * var11;
               float var16 = 18.0F * var11;
               float var17 = (var5 - var14) / 2.0F;
               float var18 = var6 - var15 - 1.0F;
               float var19 = var15 / 2.0F;
               float var20 = (var14 - var16 * 9.0F) / 2.0F;
               float var21 = var17 + var20;
               float var42;
               int var34 = (var42 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl - 0.0F) == 0.0F
                  ? 0
                  : (var42 < 0.0F ? -1 : 1);
               if (var2 == null) {
                  if (var34 < 0) {
                     this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var13;
                  }

                  this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = this.b(
                     this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl, var13, 26.0F, var10
                  );
                  var34 = 0;
               }

               int var22 = var34;

               while (true) {
                  if (var22 < 9) {
                     if (var2 != null) {
                        break;
                     }

                     float var23 = var22 == var13 ? 1.05F : 0.95F;
                     this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll[var22] = this.b(
                        this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll[var22], var23, 30.0F, var10
                     );
                     var22++;
                     if (var2 == null) {
                        continue;
                     }
                  }

                  this.a(var3.getMainHandItem(), var13, var10, System.currentTimeMillis());
                  break;
               }

               label112: {
                  label111: {
                     float var29 = var21 + var16 * var13 + var16 / 2.0F;
                     float var43;
                     int var35 = (var43 = this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll - 0.0F) == 0.0F
                        ? 0
                        : (var43 < 0.0F ? -1 : 1);
                     if (var2 == null) {
                        if (var35 < 0) {
                           this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = var29;
                           if (var2 == null) {
                              break label111;
                           }
                        }

                        this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = this.b(
                           this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll, var29, 26.0F, var10
                        );
                        var36 = Math.abs(this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll - var29);
                        if (var2 != null) {
                           break label112;
                        }

                        float var44;
                        var35 = (var44 = ((Float)var36) - 0.05F) == 0.0F ? 0 : (var44 < 0.0F ? -1 : 1);
                     }

                     if (var35 < 0) {
                        this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = var29;
                     }
                  }

                  var36 = 8.0F;
               }

               float var30 =((Float)( var36));
               int var37 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.length();
               if (var2 == null) {
                  var37 = var37 > 0 ? 1 : 0;
               }

               float var24 = var37 != 0
                  ? this.a(this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var30 * var7) / var7 + 10.0F
                  : 0.0F;
               int var38 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.length();
               if (var2 == null) {
                  var38 = var38 > 0 ? 1 : 0;
               }

               label127: {
                  float var25 = var38 != 0 ? var30 + 6.0F : 0.0F;
                  float var45;
                  int var39 = (var45 = this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl - 0.0F) == 0.0F
                     ? 0
                     : (var45 < 0.0F ? -1 : 1);
                  if (var2 == null) {
                     if (var39 < 0) {
                        this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = var24;
                     }

                     var40 = this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
                     var41 = 0.0F;
                     if (var2 != null) {
                        break label127;
                     }

                     float var46;
                     var39 = (var46 = this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll - 0.0F) == 0.0F
                        ? 0
                        : (var46 < 0.0F ? -1 : 1);
                  }

                  if (var39 < 0) {
                     this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = var25;
                  }

                  this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = this.b(
                     this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl, var24, 24.0F, var10
                  );
                  this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = this.b(
                     this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll, var25, 24.0F, var10
                  );
                  var40 = var16;
                  var41 = 2.0F;
               }

               float var26 = ((Float)var40) - var41;
               float var27 = var21
                  + var16 * this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                  + (var16 - var26) / 2.0F;
               float var28 = var18 + (var15 - var26) / 2.0F;
      final float px17=var17, px7=var7, px18=var18, px14=var14, px15=var15, px19=var19;
      final float px12=var12, px27=var27, px28=var28, px26=var26, px23=(var22 == var13 ? 1.05F : 0.95F);
               me.octo.client.utils.llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(
                     var4,
                     0,
                     0,
                     var4.guiWidth(),
                     var4.guiHeight(),
                     lllllIllIIlIlIlIllIlIIlllIlIlIllIlIlIlIIIIlllllIllllIIllIllIllIlllIlIIIlIlIlllIIlllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .p(),
            () -> pxFnA(this, px17, px7, px18, px14, px15, px19, px12, px27, px28, px26, px23)
                  );
               this.a(var4, var3, var21, var18, var15, var16, var11);
               me.octo.client.utils.llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(
                     var4,
                     0,
                     0,
                     var4.guiWidth(),
                     var4.guiHeight(),
                     lllllIllIIlIlIlIllIlIIlllIlIlIllIlIlIlIIIIlllllIllllIIllIllIllIlllIlIIIlIlIlllIIlllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .p(),
            () -> pxFnB(this, var3, var21, var7, var18, var15, var16)
                  );
            }
         }
      }
   }

   private final void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      int var8 = RangesKt.coerceIn((int)(var6 * 216), 0, 255);
      String var7 = var10000;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var4,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e()
            .a(var8),
         var5
      );
      int var10 = ((lIllIlIIIllIlIlIIIlIlllIIlllIllllIIIllllIlIllIlIlIllIIlllIlIlIllllIIIIIIIlIIIlIlIIIII.d())).ae() ? 1 : 0;
      if (var7 == null) {
         if (var10 == 0) {
            return;
         }

         var10 = RangesKt.coerceIn((int)(var6 * 140), 0, 255);
      }

      int var9 = var10;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var4,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(var9),
         var5
      );
   }

   private final void a(float var1, float var2, float var3, float var4) {
      float var5 = var3 / 2.0F;
      int var6 = RangesKt.coerceIn((int)(var4 * 48), 0, 255);
      int var7 = RangesKt.coerceIn((int)(var4 * 136), 0, 255);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var3,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .ah()
            .a(var6),
         var5
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var3,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .ah()
            .a(var7),
         var5
      );
   }

   private final void a(float var1, float var2, float var3) {
      float var5;
      float var6;
      float var16;
      float var10001;
      label29: {
         var5 = Math.max(this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl, 0.0F) * var3;
         String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
         var6 = Math.max(this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll, 0.0F) * var3;
         String var4 = var10000;
         float var17;
         int var15 = (var17 = var5 - 1.0F) == 0.0F ? 0 : (var17 < 0.0F ? -1 : 1);
         if (var4 == null) {
            if (var15 < 0) {
               return;
            }

            var16 = var6;
            var10001 = 1.0F;
            if (var4 != null) {
               break label29;
            }

            float var18;
            var15 = (var18 = var6 - 1.0F) == 0.0F ? 0 : (var18 < 0.0F ? -1 : 1);
         }

         if (var15 < 0) {
            return;
         }

         var16 = this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll * var3;
         var10001 = var5 / 2.0F;
      }

      float var7 = var16 - var10001;
      float var8 = var1 - var6 - 4.0F * var3;
      float var9 = var6 / 2.0F;
      int var10 = RangesKt.coerceIn((int)(this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl * 216), 0, 255);
      int var11 = RangesKt.coerceIn((int)(this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl * 90), 0, 255);
      int var12 = RangesKt.coerceIn(
         (int)(
            this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl
               * this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll
               * 255
         ),
         0,
         255
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var7,
         var8,
         var5,
         var6,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e()
            .a(var10),
         var9
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var7,
         var8,
         var5,
         var6,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(var11),
         var9
      );
      if (var12 > 0) {
         me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var13 = this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .a(var12);
         float var14 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var2, null, 4, null);
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
            var7 + (var5 - var14) / 2.0F,
            var8 + (var6 - var2) / 2.0F,
            var2,
            var13,
            null,
            32,
            null);
      }
   }

   private final void a(GuiGraphicsExtractor var1, LocalPlayer var2, float var3, float var4, float var5, float var6, float var7) {
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      Matrix3x2fStack var10001 = var1.pose();
      short var10003 = -28072;
      short var10004 = 28949;
      Intrinsics.checkNotNullExpressionValue(var10001, "pose(...)");
      Matrix3x2fStack var9 = var10001;
      int var10 = 0;
      String var8 = var10000;

      while (var10 < 9) {
         label22: {
            ItemStack var15 = var2.getInventory().getItem(var10);
            if (var15 != null) {
               ItemStack var11 = var15;
               if (var8 != null) {
                  break label22;
               }

               if (!var11.isEmpty()) {
                  float var12 = var3 + var6 * var10 + var6 / 2.0F;
                  float var13 = var4 + var5 / 2.0F;
                  float var14 = var7 * 0.92F * this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll[var10];
                  var9.pushMatrix();
                  var9.translate(var12, var13);
                  var9.scale(var14, var14);
                  var9.translate(-8.0F, -8.0F);
                  var1.item(var11, 0, 0);
                  var9.popMatrix();
               }
            }

            var10++;
         }

         if (var8 != null) {
            break;
         }
      }
   }

   private final void a(LocalPlayer var1, float var2, float var3, float var4, float var5) {
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      float var7 = 12.0F;
      int var8 = 0;
      String var6 = var10000;

      while (var8 < 9) {
         label31: {
            ItemStack var14 = var1.getInventory().getItem(var8);
            if (var14 != null) {
               ItemStack var9 = var14;
               if (var6 != null) {
                  break label31;
               }

               label28:
               if (!var9.isEmpty()) {
                  int var15 = var9.getCount();
                  if (var6 == null) {
                     if (var15 <= 1) {
                        break label28;
                     }

                     var15 = var9.getCount();
                  }

                  String var10 = String.valueOf(var15);
                  float var11 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                     var10, var7, null, 4, null);
                  float var12 = var2 + var5 * (var8 + 1) - var11 - 3.0F;
                  float var13 = var3 + var4 - var7 - 3.0F;
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                     var10,
                     var12 + 0.75F,
                     var13 + 0.75F,
                     var7,
                     new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(0, 0, 0, 160),
                     null,
                     32,
                     null);
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                     var10,
                     var12,
                     var13,
                     var7,
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(),
                     null,
                     32,
                     null);
               }
            }

            var8++;
         }

         if (var6 != null) {
            break;
         }
      }
   }

   private final void a(ItemStack var1, int var2, float var3, long var4) {
      Object var22 = null; // PX-FIX
      Object var21 = null; // PX-FIX
      Object var19 = null; // PX-FIX
      String var6;
      Pair var15;
      label156: {
         label155: {
            var6 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
            ItemStack var10000 = var1;
            if (var6 == null) {
               if (var1 == null) {
                  break label155;
               }

               var10000 = var1;
            }

            if (!var10000.isEmpty()) {
               var15 = this.a(var1);
               break label156;
            }
         }

         var15 = TuplesKt.to(
            "",
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
         );
      }

      Pair var7 = var15;
      String var8 = (String)var7.component1();
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var9 = (me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll)var7.component2();
      int var16 = var2;
      if (var6 == null) {
         var16 = var2 != this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll ? 1 : 0;
      }

      int var10 = var16;
      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = var2;
      int var17 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.length();
      if (var6 == null) {
         var17 = var17 == 0 ? 1 : 0;
      }

      label144: {
         label159: {
            if (var17 != 0) {
               int var18 = var8.length();
               if (var6 == null) {
                  var18 = var18 > 0 ? 1 : 0;
               }

               if (var18 != 0) {
                  this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var8;
                  this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var8;
                  this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = var9;
                  this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var9;
                  this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = var4;
                  if (var6 == null) {
                     break label159;
                  }
               }
            }

            var19 = Intrinsics.areEqual(var8, this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI);
            if (var6 == null) {
               if (pxBool(var19)) {
                  this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var8;
                  this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var9;
                  this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = var4;
                  if (var6 == null) {
                     break label159;
                  }
               }

               var19 = var10;
            }

            if (var6 != null) {
               break label144;
            }

            if (!pxBool(var19)) {
               this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = var4;
            }
         }

         var19 = Intrinsics.areEqual(
            this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
            this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
         );
      }

      label127: {
         label160: {
      int var11 = pxBool(var19) ? 1 : 0;
            int var20 = var11;
            if (var6 == null) {
               if (var11 == 0) {
                  this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = this.b(
                     this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll, 0.0F, 40.0F, var3
                  );
                  float var24;
                  var21 = (var24 = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll - 0.04F) == 0.0F
                     ? 0
                     : (var24 < 0.0F ? -1 : 1);
                  if (var6 != null) {
                     break label127;
                  }

                  if (pxBool(var21)) {
                     break label160;
                  }

                  this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
                  this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
                  this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = 0.0F;
                  if (var6 == null) {
                     break label160;
                  }
               }

               var20 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.length();
            }

            if (var6 == null) {
               var20 = var20 > 0 ? 1 : 0;
            }

            if (var20 != 0) {
               this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = this.b(
                  this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll, 1.0F, 28.0F, var3
               );
               if (var6 == null) {
                  break label160;
               }
            }

            this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = 0.0F;
         }

         var21 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.length();
      }

      if (var6 == null) {
         var21 = pxBool(var21) ? 1 : 0;
      }

      label108: {
         if (!pxBool(var21)) {
            long var25;
            var22 = (var25 = var4 - this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI - 1000L) == 0L
               ? 0
               : (var25 < 0L ? -1 : 1);
            if (var6 != null) {
               break label108;
            }

            if (pxBool(var22)) {
               var22 = 1;
               break label108;
            }
         }

         var22 = 0;
      }

      int var12 = pxBool(var22) ? 1 : 0;
      float var13 = var12 != 0 ? 1.0F : 0.0F;
      float var14 = var12 != 0 ? 32.0F : 8.0F;
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = this.b(
         this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl, var13, var14, var3
      );
      float var26;
      int var23 = (var26 = this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl - 0.01F) == 0.0F
         ? 0
         : (var26 < 0.0F ? -1 : 1);
      if (var6 == null) {
         if (var23 >= 0) {
            return;
         }

         this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = 0.0F;
         var23 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.length();
      }

      if (var6 == null) {
         var23 = var23 == 0 ? 1 : 0;
      }

      if (var23 != 0) {
         this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = "";
         this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = 0.0F;
      }
   }

   private final float a(String var1, float var2) {
      return me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var1, var2, null, 4, null);
   }

   private final Pair<String, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll> a(ItemStack var1) {
      String var10000 = var1.getHoverName().getString();
      short var10002 = -28068;
      short var10003 = 11734;
      Intrinsics.checkNotNullExpressionValue(var10000, "getString(...)");
      String var2 = var10000;
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var3 = this.a(var1, var2);
      CharSequence var5 = var2;
      Regex var6 = this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
      String var7 = "";
      var5 = var6.replace(var5, var7);
      var6 = this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
      var7 = "";
      var5 = var6.replace(var5, var7);
      var10002 = -28065;
      var10003 = 8831;
      var6 = new Regex(" {2,}");
      var7 = " ";
      String var4 = StringsKt.trim(var6.replace(var5, var7)).toString();
      return TuplesKt.to(var4, var3);
   }

   private final me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll a(ItemStack var1, String var2) {
      String var3 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      if (var3 == null) {
         MatchResult var10000 = (this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI).find( var2, 0);
         if (var10000 != null) {
            MatchResult var6 = var10000;
            boolean var7 = false;
            if (var3 == null) {
               me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var15 = this.a(
                  ((String)var6.getGroupValues().get(1)).charAt(0)
               );
               if (var15 != null) {
                  me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var8 = var15;
                  boolean var14 = false;
                  return var8;
               }
            }
         }
      }

      TextColor var4 = var1.getHoverName().getStyle().getColor();
      TextColor var16 = var4;
      if (var3 == null) {
         if (var4 == null) {
            label35:
            for (Object var17 : var1.getHoverName().getSiblings()) {
               short var10002 = -28070;
               short var10003 = -27250;
               Intrinsics.checkNotNullExpressionValue(var17, "next(...)");

               do {
                  Component var5 = (Component)var17;
                  TextColor var12 = var5.getStyle().getColor();
                  if (var12 == null) {
                     continue label35;
                  }

                  boolean var9 = false;
                  var17 = this.a(var12.getValue());
               } while (var3 != null);

               return (me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll)var17;
            }

            return IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a();
         }

         var16 = var4;
      }

      TextColor var11 = var16;
      boolean var13 = false;
      return this.a(var11.getValue());
   }

   private final me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll a(char var1) {
      String var2 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      if (var2 == null) {
         ChatFormatting var10000 = ChatFormatting.getByCode(Character.toLowerCase(var1));
         if (var10000 != null) {
            Integer var4 = var10000.getColor();
            if (var4 != null) {
               int var3 = var4;
               return this.a(var3);
            }

            return null;
         }
      }

      return null;
   }

   private final me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll a(int var1) {
      return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
         var1 >> 16 & 0xFF, var1 >> 8 & 0xFF, var1 & 0xFF
      );
   }

   private final float b(float var1, float var2, float var3, float var4) {
      String var5 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      float var7;
      int var10000 = (var7 = var1 - var2) == 0.0F ? 0 : (var7 < 0.0F ? -1 : 1);
      if (var5 == null) {
         var10000 = (((var10000 == 0) ? 1 : 0));
      }

      if ((var10000 != 0)) {
         return var1;
      } else {
         float var6 = 1.0F - (float)Math.exp(-var3 * var4);
         return var1 + (var2 - var1) * var6;
      }
   }

   private static final Unit a(
      llIllIlllllIlIlIIllIIIlllIIllIIlIIllIIIlIllllIllIllIllIIIlIllIllIIllIIllIlIIlIIIlIIII var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11
   ) {
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      var0.a(var1 * var2, var3 * var2, var4 * var2, var5 * var2, var6 * var2, var7);
      String var12 = var10000;
      var0.a(var8 * var2, var9 * var2, var10 * var2, var7);
      int var13 = ((var0.ag()) ? 1 : 0);
      if (var12 == null) {
         if (var13 == 0) {
            return Unit.INSTANCE;
         }

         float var14;
         var13 = (var14 = var0.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl - 0.01F) == 0.0F
            ? 0
            : (var14 < 0.0F ? -1 : 1);
      }

      if (var12 == null) {
         if (var13 <= 0) {
            return Unit.INSTANCE;
         }

         var13 = var0.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.length();
      }

      if (var12 == null) {
         var13 = var13 > 0 ? 1 : 0;
      }

      if (var13 != 0) {
         var0.a(var3 * var2, var11 * var2, var2);
      }

      return Unit.INSTANCE;
   }

   private static final Unit a(
      llIllIlllllIlIlIIllIIIlllIIllIIlIIllIIIlIllllIllIllIllIIIlIllIllIIllIIllIlIIlIIIlIIII var0,
      LocalPlayer var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6
   ) {
      var0.a(var1, var2 * var3, var4 * var3, var5 * var3, var6 * var3);
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[11];
      int var3 = 0;
      String var2 = "rñ\u0093rA\u00115\u009d¯\u000eÌýA\t3\u0096\u0091\u009bÒjvd£5\ta)'3½\nªþ\\\rPn\u0082É$\u001680\u0087ã»á\u0093\u000e\u000eÛîJUº'\u007f\f´\u008f\u0093\u008c®\fµ(\nC¢\u0097\u0013âYl²\u0007\u0004X6LJ\u0005Õ\u0015|1\u00804Y{\u0093ak\u0016[ÄI#Ç´dGÞ£Êú\u0014ö|?\u0018Zã\u0000)2\u0085\u0089d¤Ã^ÉG\u0018§¿\u001b\u00030\bå\u0010\u0092Eq\u0016.#°";
      int var4 = "rñ\u0093rA\u00115\u009d¯\u000eÌýA\t3\u0096\u0091\u009bÒjvd£5\ta)'3½\nªþ\\\rPn\u0082É$\u001680\u0087ã»á\u0093\u000e\u000eÛîJUº'\u007f\f´\u008f\u0093\u008c®\fµ(\nC¢\u0097\u0013âYl²\u0007\u0004X6LJ\u0005Õ\u0015|1\u00804Y{\u0093ak\u0016[ÄI#Ç´dGÞ£Êú\u0014ö|?\u0018Zã\u0000)2\u0085\u0089d¤Ã^ÉG\u0018§¿\u001b\u00030\bå\u0010\u0092Eq\u0016.#°"
         .length();
      char var1 = '\t';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 48;
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
                     case 0 -> 101;
                     case 1 -> 29;
                     case 2 -> 74;
                     case 3 -> 62;
                     case 4 -> 121;
                     case 5 -> 73;
                     default -> 7;
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
                     f = var5;
                     g = new String[11];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new llIllIlllllIlIlIIllIIIlllIIllIIlIIllIIIlIllllIllIllIllIIIlIllIllIIllIIllIlIIlIIIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = new llIllIlllllIlIlIIllIIIlllIIllIIlIIllIIIlIllllIllIllIllIIIlIllIllIIllIIllIlIIlIIIlIIII();
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

                  var2 = "\u0016³cÖ\n\u0014\u009dÔÝño²\u001dÚVÑÕ\u001b\u001c±\u000bãÏgør";
                  var4 = "\u0016³cÖ\n\u0014\u009dÔÝño²\u001dÚVÑÕ\u001b\u001c±\u000bãÏgør".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 46;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -28072) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 99;
            case 1 -> 18;
            case 2 -> 13;
            case 3 -> 70;
            case 4 -> 9;
            case 5 -> 137;
            case 6 -> 90;
            case 7 -> 100;
            case 8 -> 50;
            case 9 -> 89;
            case 10 -> 165;
            case 11 -> 227;
            case 12 -> 42;
            case 13 -> 115;
            case 14 -> 178;
            case 15 -> 147;
            case 16 -> 164;
            case 17 -> 255;
            case 18 -> 66;
            case 19 -> 156;
            case 20 -> 123;
            case 21 -> 126;
            case 22 -> 160;
            case 23 -> 150;
            case 24 -> 179;
            case 25 -> 102;
            case 26 -> 64;
            case 27 -> 184;
            case 28 -> 181;
            case 29 -> 183;
            case 30 -> 24;
            case 31 -> 188;
            case 32 -> 112;
            case 33 -> 144;
            case 34 -> 176;
            case 35 -> 118;
            case 36 -> 75;
            case 37 -> 7;
            case 38 -> 251;
            case 39 -> 190;
            case 40 -> 110;
            case 41 -> 146;
            case 42 -> 4;
            case 43 -> 152;
            case 44 -> 138;
            case 45 -> 5;
            case 46 -> 241;
            case 47 -> 206;
            case 48 -> 187;
            case 49 -> 157;
            case 50 -> 170;
            case 51 -> 87;
            case 52 -> 52;
            case 53 -> 58;
            case 54 -> 218;
            case 55 -> 235;
            case 56 -> 177;
            case 57 -> 101;
            case 58 -> 239;
            case 59 -> 148;
            case 60 -> 155;
            case 61 -> 77;
            case 62 -> 120;
            case 63 -> 10;
            case 64 -> 233;
            case 65 -> 202;
            case 66 -> 84;
            case 67 -> 47;
            case 68 -> 192;
            case 69 -> 106;
            case 70 -> 245;
            case 71 -> 203;
            case 72 -> 54;
            case 73 -> 34;
            case 74 -> 6;
            case 75 -> 127;
            case 76 -> 41;
            case 77 -> 3;
            case 78 -> 175;
            case 79 -> 195;
            case 80 -> 63;
            case 81 -> 163;
            case 82 -> 207;
            case 83 -> 92;
            case 84 -> 85;
            case 85 -> 31;
            case 86 -> 65;
            case 87 -> 236;
            case 88 -> 27;
            case 89 -> 242;
            case 90 -> 162;
            case 91 -> 154;
            case 92 -> 149;
            case 93 -> 153;
            case 94 -> 111;
            case 95 -> 240;
            case 96 -> 132;
            case 97 -> 38;
            case 98 -> 145;
            case 99 -> 226;
            case 100 -> 11;
            case 101 -> 254;
            case 102 -> 55;
            case 103 -> 37;
            case 104 -> 200;
            case 105 -> 186;
            case 106 -> 76;
            case 107 -> 222;
            case 108 -> 14;
            case 109 -> 133;
            case 110 -> 108;
            case 111 -> 171;
            case 112 -> 114;
            case 113 -> 23;
            case 114 -> 94;
            case 115 -> 194;
            case 116 -> 19;
            case 117 -> 225;
            case 118 -> 129;
            case 119 -> 119;
            case 120 -> 204;
            case 121 -> 45;
            case 122 -> 250;
            case 123 -> 216;
            case 124 -> 16;
            case 125 -> 193;
            case 126 -> 173;
            case 127 -> 213;
            case 128 -> 223;
            case 129 -> 49;
            case 130 -> 182;
            case 131 -> 21;
            case 132 -> 253;
            case 133 -> 229;
            case 134 -> 121;
            case 135 -> 159;
            case 136 -> 25;
            case 137 -> 124;
            case 138 -> 61;
            case 139 -> 249;
            case 140 -> 209;
            case 141 -> 134;
            case 142 -> 237;
            case 143 -> 36;
            case 144 -> 217;
            case 145 -> 221;
            case 146 -> 196;
            case 147 -> 180;
            case 148 -> 208;
            case 149 -> 78;
            case 150 -> 113;
            case 151 -> 93;
            case 152 -> 161;
            case 153 -> 8;
            case 154 -> 28;
            case 155 -> 244;
            case 156 -> 224;
            case 157 -> 30;
            case 158 -> 103;
            case 159 -> 158;
            case 160 -> 73;
            case 161 -> 117;
            case 162 -> 57;
            case 163 -> 172;
            case 164 -> 0;
            case 165 -> 83;
            case 166 -> 32;
            case 167 -> 228;
            case 168 -> 88;
            case 169 -> 79;
            case 170 -> 26;
            case 171 -> 135;
            case 172 -> 96;
            case 173 -> 169;
            case 174 -> 39;
            case 175 -> 141;
            case 176 -> 60;
            case 177 -> 211;
            case 178 -> 210;
            case 179 -> 43;
            case 180 -> 248;
            case 181 -> 33;
            case 182 -> 20;
            case 183 -> 151;
            case 184 -> 231;
            case 185 -> 130;
            case 186 -> 220;
            case 187 -> 15;
            case 188 -> 12;
            case 189 -> 72;
            case 190 -> 86;
            case 191 -> 191;
            case 192 -> 215;
            case 193 -> 243;
            case 194 -> 82;
            case 195 -> 48;
            case 196 -> 67;
            case 197 -> 69;
            case 198 -> 22;
            case 199 -> 198;
            case 200 -> 219;
            case 201 -> 199;
            case 202 -> 238;
            case 203 -> 174;
            case 204 -> 230;
            case 205 -> 105;
            case 206 -> 128;
            case 207 -> 59;
            case 208 -> 44;
            case 209 -> 1;
            case 210 -> 189;
            case 211 -> 125;
            case 212 -> 68;
            case 213 -> 53;
            case 214 -> 97;
            case 215 -> 185;
            case 216 -> 98;
            case 217 -> 140;
            case 218 -> 166;
            case 219 -> 212;
            case 220 -> 247;
            case 221 -> 107;
            case 222 -> 116;
            case 223 -> 139;
            case 224 -> 62;
            case 225 -> 131;
            case 226 -> 95;
            case 227 -> 91;
            case 228 -> 40;
            case 229 -> 122;
            case 230 -> 104;
            case 231 -> 197;
            case 232 -> 232;
            case 233 -> 201;
            case 234 -> 29;
            case 235 -> 246;
            case 236 -> 17;
            case 237 -> 81;
            case 238 -> 234;
            case 239 -> 71;
            case 240 -> 56;
            case 241 -> 205;
            case 242 -> 142;
            case 243 -> 136;
            case 244 -> 51;
            case 245 -> 74;
            case 246 -> 80;
            case 247 -> 168;
            case 248 -> 252;
            case 249 -> 2;
            case 250 -> 35;
            case 251 -> 109;
            case 252 -> 214;
            case 253 -> 46;
            case 254 -> 167;
            default -> 143;
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

         g[var2] = new String(var3).intern();
      }

      return g[var2];
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }

   private static boolean pxBool(java.lang.Object o) {
      if (o instanceof Boolean) return ((Boolean)o).booleanValue();
      if (o instanceof Number) return ((Number)o).intValue() != 0;
      throw new IllegalStateException("pxBool on " + o);
   }
   private static int pxInt(java.lang.Object o) {
      if (o instanceof Number) return ((Number)o).intValue();
      if (o instanceof Boolean) return ((Boolean)o).booleanValue() ? 1 : 0;
      throw new IllegalStateException("pxInt on " + o);
   }

   /** Reconstructed from the jar's synthetic lambda implementation (bootstrap method #1). */

   /** Reconstructed from the jar's synthetic lambda implementation (bootstrap method #0). */
      private static final kotlin.Unit pxFnA(me.octo.client.llIllIlllllIlIlIIllIIIlllIIllIIlIIllIIIlIllllIllIllIllIIIlIllIllIIllIIllIlIIlIIIlIIII self,
         float f1, float f2, float f3, float f4, float f5, float f6,
         float f7, float f8, float f9, float f10, float f11) {
      java.lang.String s = me.octo.client.lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      self.a(f1 * f2, f3 * f2, f4 * f2, f5 * f2, f6 * f2, f7);
      self.a(f8 * f2, f9 * f2, f10 * f2, f7);
      if ((s != null || self.ag()) && self.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl > 0.01F && self.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.length() > 0) {
         self.a(f3 * f2, f11 * f2, f2);
      }
      return kotlin.Unit.INSTANCE;
   }
   private static final kotlin.Unit pxFnB(me.octo.client.llIllIlllllIlIlIIllIIIlllIIllIIlIIllIIIlIllllIllIllIllIIIlIllIllIIllIIllIlIIlIIIlIIII self, net.minecraft.client.player.LocalPlayer player,
                                        float x, float s, float y, float w, float h) {
      self.a(player, x * s, y * s, w * s, h * s);
      return kotlin.Unit.INSTANCE;
   }
}
