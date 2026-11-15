package me.octo.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.multiplayer.JoinMultiplayerScreen;
import net.minecraft.client.gui.screens.options.OptionsScreen;
import net.minecraft.client.gui.screens.worldselection.SelectWorldScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.nanovg.NanoVG;

public final class IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll
   extends llIllIIlllIIIlIIIIlIIIIIllIllIIIlIIIlllIlIllIlIIIllIllllIIlIllIIllIIllIIIlIIIIlIlllll {
   @NotNull
   private final Minecraft lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final List<IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private final List<IlIlIllIllIllIlIlllIlIlIllIlllllllIlIIllllIlIIllIlIllIllIlllllIIIlIIllIllIIlllIIlllll> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @Nullable
   private IlIlIllIllIllIlIlllIlIlIllIlllllllIlIIllllIlIIllIlIllIllIlllllIIIlIIllIllIIlllIIlllll IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @Nullable
   private IlIlIllIllIllIlIlllIlIlIllIlllllllIlIIllllIlIIllIlIllIllIlllllIIIlIIllIllIIlllIIlllll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private final IlllIIlIllIlllIIIIlIIIIlIllIlIIllIllIlIIIlIlIIllIlIllIIIIlllIIIIIIlllIIllllIlllIIlIlI IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private String lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private boolean IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private boolean lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private long lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private float lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @Nullable
   private String lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private final List<String> IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @Nullable
   private String llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private boolean IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private long IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private boolean IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   @Nullable
   private IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private static int[] llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private static String[] c;
   private static String[] d;

   public IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll() {
      MutableComponent var10001 = Component.empty();
      short var10003 = 19698;
      short var10004 = -17251;
      Intrinsics.checkNotNullExpressionValue(var10001, "empty(...)");
      super(var10001);
      Minecraft var2 = Minecraft.getInstance();
      var10003 = 19674;
      var10004 = -9184;
      Intrinsics.checkNotNullExpressionValue(var2, "getInstance(...)");
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new ArrayList<>();
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new ArrayList<>();
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new IlllIIlIllIlllIIIIlIIIIlIllIlIIllIllIlIIIlIlIIllIlIllIIIIlllIIIIIIlllIIllllIlllIIlIlI();
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = "";
      String[] var1 = new String[9];
      var10003 = 19711;
      var10004 = -19144;
      var1[0] = "v2.1.0-dev";
      var10003 = 19706;
      var10004 = -9082;
      var1[1] = "v2.0.0-beta";
      var10003 = 19700;
      var10004 = -10584;
      var1[2] = "v1.2.0";
      var10003 = 19656;
      var10004 = -6772;
      var1[3] = "v1.1.0";
      var10003 = 19662;
      var10004 = 934;
      var1[4] = "v1.0.0";
      var10003 = 19657;
      var10004 = -2449;
      var1[5] = "v0.9.0";
      var10003 = 19648;
      var10004 = 21459;
      var1[6] = "v0.8.5";
      var10003 = 19669;
      var10004 = -2644;
      var1[7] = "v0.8.0";
      var10003 = 19709;
      var10004 = 26261;
      var1[8] = "v0.7.0";
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = CollectionsKt.listOf(var1);
   }

   public final void a(@NotNull llIIlIIlllllllIlIlIlllllIIllIIlllIlIllIlllIllIIlIlIllllIlIllIIIIIIIlIlIlllIlIIlIlllII var1) {
      short var10001 = 19666;
      short var10002 = -28544;
      Intrinsics.checkNotNullParameter(var1, "proxyManagerPopup");
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
         .a(new lllIIlIlllIIIlllllIllIIllIIIIIIlIlIIlIIlIIlllllIllIlIlIllIIIIllIIllllIlIIIIIIIIlIlIlI(this, var1));
   }

   public final void a(@NotNull lIIIlIIIIlIIIlIlIlllIlIIIlIIIIllIlIllIllIlIlIllIlIllIIllllIIllIlIlIIIIIllIllIIlllIIlI var1) {
      short var10001 = 19708;
      short var10002 = 5770;
      Intrinsics.checkNotNullParameter(var1, "parent");
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
         .a(
            new llllIlIlIlIIIIIIlIIlIIlIlIIlIIlllllIllIllllIllllIIIlllIlIllllIlllIlIIlllIIIIlllIIIlII(
               IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll::d
            )
         );
   }

   private final List<String> a() {
      int[] var1 = g();
      List var10000 = Collections.emptyList();
      if (var1 == null) {
         if (var10000.isEmpty()) {
            return this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
         }

         var10000 = Collections.emptyList();
      }

      List var2 = var10000;
      Intrinsics.checkNotNull(var2);
      return var2;
   }

   @Override
   protected void init() {
      super.init();
      Object var10000 = null;
      me.octo.client.utils.lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      this.c();
   }

   public final void c() {
      Object isFailure = null; // PX-FIX
      Object constructor = null; // PX-FIX
      IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll var1 = this;

      Object var2;
      try {
         var2 = var1;
         boolean var3 = false;
         var2 = var1.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getUser().getName();
      } catch (Throwable var5) {
         var2 = ResultKt.createFailure(var5);
      }

      Object var4x = var2;
      var2 = "";

      Object var10001;
      label25: {
         try {
            if (var4x instanceof Result.Failure) {
               var10001 = var2;
               break label25;
            }
         } catch (Throwable var6) {
            throw (RuntimeException)a(var6);
         }

         var10001 = var4x;
      }

      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = (String)var10001;
   }

   private final IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
      float var1, float var2
   ) {
      float var3 = RangesKt.coerceIn(Math.min(var1 / 1920.0F, var2 / 1080.0F), 0.55F, 2.2F);
      return new IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         var1, var2, var3, 28.0F * var3, 88.0F * var3, 340.0F * var3, 74.0F * var3, 7.0F * var3, 46.0F * var3, 21.0F * var3, 14.0F * var3
      );
   }

   private final void a(
      IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.clear();
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clear();
      float var2 = var1.d() + var1.e() + 24.0F * var1.c();
      List var10000 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      float var10003 = var1.d();
      float var10005 = var1.f();
      float var10006 = var1.g();
      short var10007 = 19673;
      short var10008 = -26375;
      var10008 = 19649;
      short var10009 = 31663;
      var10000.add(
         new IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl(
            var10003,
            var2,
            var10005,
            var10006,
            "Singleplayer",
            "\n        <svg viewBox=\"0 0 24 24\" fill=\"currentColor\">\n            <circle cx=\"12\" cy=\"7\" r=\"5\"/>\n            <path d=\"M12 14c-6 0-10 3-10 7v3h20v-3c0-4-4-7-10-7z\"/>\n        </svg>\n    ",
            null,
            () -> a(this),
            64,
            null
         )
      );
      var10000 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      var10003 = var1.d();
      float var10004 = var2 + var1.g() + var1.h();
      var10005 = var1.f();
      var10006 = var1.g();
      var10007 = 19699;
      var10008 = -32071;
      var10008 = 19653;
      var10009 = 27362;
      var10000.add(
         new IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl(
            var10003,
            var10004,
            var10005,
            var10006,
            "Multiplayer",
            "\n        <svg viewBox=\"0 0 24 24\" fill=\"currentColor\">\n            <path d=\"M7.2 0a6.4 6.4 0 1 0 0 12.8 6.4 6.4 0 0 0 0-12.8Z\"/>\n            <path d=\"M17 1h-.04A5.2 5.2 0 0 0 13 2.7a5.9 5.9 0 0 0 0 7.9 5.2 5.2 0 0 0 3.8 1.7h.04a5.2 5.2 0 0 0 3.8-1.7 5.8 5.8 0 0 0 1.5-4A5.5 5.5 0 0 0 17 1Z\"/>\n            <path d=\"M17.2 13.4h-.5a9.3 9.3 0 0 0-6.2 2.4 12 12 0 0 1 4.7 8.9H24v-1.9a9.3 9.3 0 0 0-6.8-9.4Z\"/>\n            <path d=\"M14.3 24.7a10 10 0 0 0-10-9.4H4a10 10 0 0 0-10 10v1.2h14.3v-1.2q0-.3 0-.6Z\"/>\n        </svg>\n    ",
            null,
            () -> b(this),
            64,
            null
         )
      );
      var10000 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      var10003 = var1.d();
      var10004 = var2 + (var1.g() + var1.h()) * 2;
      var10005 = var1.f();
      var10006 = var1.g();
      var10007 = 19677;
      var10008 = -15253;
      var10008 = 19655;
      var10009 = -15710;
      var10000.add(
         new IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl(
            var10003,
            var10004,
            var10005,
            var10006,
            "Proxy Manager",
            "\n        <svg viewBox=\"0 0 24 24\" fill=\"currentColor\">\n            <path d=\"M21 1H3a2 2 0 0 0-2 2v2a2 2 0 0 0 2 2h18a2 2 0 0 0 2-2V3a2 2 0 0 0-2-2ZM5 5a.5.5 0 0 1-1 0V3a.5.5 0 0 1 1 0v2Zm2 0a.5.5 0 0 1-1 0V3a.5.5 0 0 1 1 0v2Zm2 0a.5.5 0 0 1-1 0V3a.5.5 0 0 1 1 0v2Zm7 0a1 1 0 1 1 0-2 1 1 0 0 1 0 2Zm3 0a1 1 0 1 1 0-2 1 1 0 0 1 0 2Zm2 4H3a2 2 0 0 0-2 2v2a2 2 0 0 0 2 2h18a2 2 0 0 0 2-2v-2a2 2 0 0 0-2-2Zm-16 4a.5.5 0 0 1-1 0v-2a.5.5 0 0 1 1 0v2Zm2 0a.5.5 0 0 1-1 0v-2a.5.5 0 0 1 1 0v2Zm2 0a.5.5 0 0 1-1 0v-2a.5.5 0 0 1 1 0v2Zm7 0a1 1 0 1 1 0-2 1 1 0 0 1 0 2Zm3 0a1 1 0 1 1 0-2 1 1 0 0 1 0 2ZM21 17H3a2 2 0 0 0-2 2v2a2 2 0 0 0 2 2h18a2 2 0 0 0 2-2v-2a2 2 0 0 0-2-2ZM5 21a.5.5 0 0 1-1 0v-2a.5.5 0 0 1 1 0v2Zm2 0a.5.5 0 0 1-1 0v-2a.5.5 0 0 1 1 0v2Zm2 0a.5.5 0 0 1-1 0v-2a.5.5 0 0 1 1 0v2Zm7 0a1 1 0 1 1 0-2 1 1 0 0 1 0 2Zm3 0a1 1 0 1 1 0-2 1 1 0 0 1 0 2Z\"/>\n        </svg>\n    ",
            null,
            () -> c(this),
            64,
            null
         )
      );
      var10000 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      var10003 = var1.d();
      var10004 = var2 + (var1.g() + var1.h()) * 3;
      var10005 = var1.f();
      var10006 = var1.g();
      var10007 = 19664;
      var10008 = 31784;
      var10008 = 19650;
      var10009 = 11583;
      var10000.add(
         new IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl(
            var10003,
            var10004,
            var10005,
            var10006,
            "Options",
            "\n        <svg viewBox=\"0 0 24 24\" fill=\"currentColor\">\n            <path d=\"M19.14 12.94c.04-.3.06-.61.06-.94 0-.32-.02-.64-.07-.94l2.03-1.58c.18-.14.23-.41.12-.61l-1.92-3.32c-.12-.22-.37-.29-.59-.22l-2.39.96c-.5-.38-1.03-.7-1.62-.94L14.4 2.81c-.04-.24-.24-.41-.48-.41h-3.84c-.24 0-.43.17-.47.41l-.36 2.54c-.59.24-1.13.57-1.62.94l-2.39-.96c-.22-.08-.47 0-.59.22L2.74 8.87c-.12.21-.08.47.12.61l2.03 1.58c-.05.3-.09.63-.09.94s.02.64.07.94l-2.03 1.58c-.18.14-.23.41-.12.61l1.92 3.32c.12.22.37.29.59.22l2.39-.96c.5.38 1.03.7 1.62.94l.36 2.54c.05.24.24.41.48.41h3.84c.24 0 .44-.17.47-.41l.36-2.54c.59-.24 1.13-.56 1.62-.94l2.39.96c.22.08.47 0 .59-.22l1.92-3.32c.12-.22.07-.47-.12-.61l-2.01-1.58zM12 15.6c-1.98 0-3.6-1.62-3.6-3.6s1.62-3.6 3.6-3.6 3.6 1.62 3.6 3.6-1.62 3.6-3.6 3.6z\"/>\n        </svg>\n    ",
            null,
            (kotlin.jvm.functions.Function0)(IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll::d),
            64,
            null
         )
      );
      float var3 = var1.b() - var1.i() - var1.d();
      float var4 = 10.0F * var1.c();
      var10003 = var1.d();
      var10005 = var1.i();
      var10006 = var1.i();
      var10007 = 19675;
      var10008 = -16571;
      var10008 = 19665;
      var10009 = 26765;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new IlIlIllIllIllIlIlllIlIlIllIlllllllIlIIllllIlIIllIlIllIllIlllllIIIlIIllIllIIlllIIlllll(
         var10003,
         var3,
         var10005,
         var10006,
         "\n    <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"1.9\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\n        <path d=\"M12 15L15 12L12 9\"/>\n        <line x1=\"15\" y1=\"12\" x2=\"4\" y2=\"12\"/>\n        <path d=\"M4 7.2 C 4 5.5 4.4 4.7 5.1 4.2 C 5.5 4 6.1 4 7.2 4 H 16.8 C 17.9 4 18.5 4 18.9 4.2 C 19.6 4.7 20 5.5 20 7.2 V 16.8 C 20 18.5 19.6 19.3 18.9 19.8 C 18.5 20 17.9 20 16.8 20 H 7.2 C 6.1 20 5.5 20 5.1 19.8 C 4.4 19.3 4 18.5 4 16.8\"/>\n    </svg>\n",
         "Quit",
         0.0F,
         false,
         (kotlin.jvm.functions.Function0)(IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll::e),
         192,
         null
      );
      float var5 = var1.d() + var1.i() + var4;
      var10000 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      var10005 = var1.i();
      var10006 = var1.i();
      var10007 = 19652;
      var10008 = -24464;
      var10008 = 19704;
      var10009 = 28102;
      var10000.add(
         new IlIlIllIllIllIlIlllIlIlIllIlllllllIlIIllllIlIIllIlIllIllIlllllIIIlIIllIllIIlllIIlllll(
            var5,
            var3,
            var10005,
            var10006,
            "\n    <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"1.8\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\n        <circle cx=\"12\" cy=\"12\" r=\"10\"/>\n        <path d=\"M9.09 9a3 3 0 0 1 5.83 1c0 2-3 3-3 3\"/>\n        <line x1=\"12\" y1=\"17.2\" x2=\"12.01\" y2=\"17.2\"/>\n    </svg>\n",
            "FAQ",
            0.0F,
            false,
            (kotlin.jvm.functions.Function0)(IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll::e),
            192,
            null
         )
      );
      var5 += var1.i() + var4;
      var10000 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      var10005 = var1.i();
      var10006 = var1.i();
      var10007 = 19667;
      var10008 = 8675;
      var10008 = 19658;
      var10009 = -7340;
      var10000.add(
         new IlIlIllIllIllIlIlllIlIlIllIlllllllIlIIllllIlIIllIlIllIllIlllllIIIlIIllIllIIlllIIlllll(
            var5,
            var3,
            var10005,
            var10006,
            "\n    <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"1.8\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\n        <path d=\"M4 19.5A2.5 2.5 0 0 1 6.5 17H20\"/>\n        <path d=\"M6.5 2H20v20H6.5A2.5 2.5 0 0 1 4 19.5v-15A2.5 2.5 0 0 1 6.5 2z\"/>\n    </svg>\n",
            "Documentation",
            0.0F,
            false,
            (kotlin.jvm.functions.Function0)(IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll::f),
            192,
            null
         )
      );
      var10005 = var1.j() * 2.0F;
      var10006 = var1.j() * 2.0F;
      var10007 = 19654;
      var10008 = 14564;
      var10008 = 19678;
      var10009 = -29385;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IlIlIllIllIllIlIlllIlIlIllIlllllllIlIIllllIlIIllIlIllIllIlllllIIIlIIllIllIIlllIIlllll(
         0.0F,
         0.0F,
         var10005,
         var10006,
         "\n    <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"1.8\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\n        <polyline points=\"23 4 23 10 17 10\"/>\n        <polyline points=\"1 20 1 14 7 14\"/>\n        <path d=\"M3.51 9a9 9 0 0 1 14.85-3.36L23 10M1 14l4.64 4.36A9 9 0 0 0 20.49 15\"/>\n    </svg>\n",
         "Switch",
         0.5F,
         true,
         IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll::f
      );
   }

   @Override
   public void extractRenderState(@NotNull GuiGraphicsExtractor var1, int var2, int var3, float var4) {
      int[] var5;
      byte var6;
      float var20;
      label69: {
         int[] var10000 = g();
         short var10002 = 19668;
         short var10003 = 27223;
         Intrinsics.checkNotNullParameter(var1, "context");
         var5 = var10000;
         short var15 = 19659;
         this.c();
         short var10001 = 20185;
         String var16 = System.getProperty("os.name");
         var10002 = 19672;
         var10003 = 8539;
         Intrinsics.checkNotNullExpressionValue(var16, "getProperty(...)");
         String var17 = var16.toLowerCase(Locale.ROOT);
         var10002 = 19679;
         var10003 = -31189;
         Intrinsics.checkNotNullExpressionValue(var17, "toLowerCase(...)");
         CharSequence var18 = var17;
         var10001 = 19663;
         var10002 = 29460;
         var6 = ((byte)((StringsKt.contains(var18, "mac", false)) ? 1 : 0));
         int var19 = var6;
         if (var5 == null) {
            if (var6 != 0) {
               var20 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getWindow().getScreenWidth();
               break label69;
            }

            var19 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getWindow().getWidth();
         }

         var20 = var19;
      }

      float var7;
      label63: {
         var7 = var20;
         int var21 = var6;
         if (var5 == null) {
            if (var6 != 0) {
               var20 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getWindow().getScreenHeight();
               break label63;
            }

            var21 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getWindow().getHeight();
         }

         var20 = var21;
      }

      float var8;
      IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var9;
      label57: {
         var8 = var20;
         var9 = this.a(var7, var8);
         IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll var23 = this;
         if (var5 == null) {
            if (this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl != null) {
               IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var24 = this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
               Intrinsics.checkNotNull(this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl);
               float var35;
               int var25 = (var35 = var24.a() - var7) == 0.0F ? 0 : (var35 < 0.0F ? -1 : 1);
               if (var5 == null) {
                  var25 = (((var25 == 0) ? 1 : 0));
               }

               if ((var25 != 0)) {
                  IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var26 = this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
                  Intrinsics.checkNotNull(this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl);
                  float var36;
                  int var27 = (var36 = var26.b() - var8) == 0.0F ? 0 : (var36 < 0.0F ? -1 : 1);
                  if (var5 == null) {
                     var27 = (((var27 == 0) ? 1 : 0));
                  }

                  if ((var27 != 0)) {
                     break label57;
                  }
               }
            }

            this.a(var9);
            var23 = this;
         }

         var23.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = var9;
      }

      float var13;
      float var14;
      label47: {
         var13 = 0.0F;
         var14 = 0.0F;
         int var28 = var6;
         if (var5 == null) {
            if (var6 != 0) {
               var13 = var2 * var7 / var1.guiWidth();
               var14 = var3 * var8 / var1.guiHeight();
               if (var5 == null) {
                  break label47;
               }

               me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
                  new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[2]
               );
            }

            var28 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getWindow().getGuiScale();
         }

         float var12 = var28;
         var13 = var2 * var12;
         var14 = var3 * var12;
      }

      final var w9 = var9;
      final float pxA = var13;
      final float pxB = var14;
      final float pxC = var4;
      final float pxD = var7;
      final float pxE = var8;

      me.octo.client.utils.llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(
            var1,
            0,
            0,
            var1.guiWidth(),
            var1.guiHeight(),
            lllllIllIIlIlIlIllIlIIlllIlIlIllIlIlIlIIIIlllllIllllIIllIllIllIlllIlIIIlIlIlllIIlllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .o(),
            () -> a(this, w9, pxA, pxB, pxC, pxD, pxE)   // PX-FIX: jar indy#9 / BSM#9 impl a(Host,Nested,FFFFF)
         );
      super.extractRenderState(var1, var2, var3, var4);
   }

   private final void b(
      IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      float var2 = var1.d();
      float var3 = var1.d();
      short var10001 = 19701;
      short var10002 = 18452;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b(
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         "\n        <svg width=\"100%\" height=\"100%\" viewBox=\"0 0 1000 1000\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" xml:space=\"preserve\" xmlns:serif=\"http://www.serif.com/\" style=\"fill-rule:evenodd;clip-rule:evenodd;stroke-linecap:round;stroke-linejoin:round;stroke-miterlimit:1.5;\">\n    <g id=\"Circles\">\n        <g transform=\"matrix(1,0,0,1,-2.25144,-6.552205)\">\n            <circle cx=\"142.393\" cy=\"367.484\" r=\"18.984\" fill=\"currentColor\"/>\n        </g>\n        <g transform=\"matrix(1,0,0,1,584.806935,456.451612)\">\n            <circle cx=\"142.393\" cy=\"367.484\" r=\"18.984\" fill=\"currentColor\"/>\n        </g>\n        <g transform=\"matrix(0.82218,0,0,0.82218,222.150739,559.882122)\">\n            <circle cx=\"142.393\" cy=\"367.484\" r=\"18.984\" fill=\"currentColor\"/>\n        </g>\n        <g transform=\"matrix(1.574519,0,0,1.574519,-29.287141,-357.025146)\">\n            <circle cx=\"142.393\" cy=\"367.484\" r=\"18.984\" fill=\"currentColor\"/>\n        </g>\n        <g transform=\"matrix(1.574519,0,0,1.574519,630.504469,94.034301)\">\n            <circle cx=\"142.393\" cy=\"367.484\" r=\"18.984\" fill=\"currentColor\"/>\n        </g>\n        <g transform=\"matrix(0.747066,0,0,0.747066,545.885729,-137.813619)\">\n            <circle cx=\"142.393\" cy=\"367.484\" r=\"18.984\" fill=\"currentColor\"/>\n        </g>\n    </g>\n    <g id=\"Top\">\n        <path id=\"Top-Big\" serif:id=\"Top Big\" d=\"M570.165,259.847C570.165,259.847 632.989,289.24 670.928,341.694C671.152,342.004 677.997,337.709 683.361,331.034C688.725,324.359 615.639,251.994 583.949,247.118C582.4,246.88 573.46,246.999 574.413,246.88C575.367,246.761 569.493,256.246 570.165,259.847Z\" style=\"fill:none;stroke:currentColor;stroke-width:1px;\"/>\n        <path d=\"M402.904,514.909C402.904,514.909 404.99,533.533 410.354,533.235C415.718,532.937 453.917,514.704 457.587,511.035C458.034,510.588 454.435,497.142 452.223,493.602C451.478,492.41 402.904,514.909 402.904,514.909Z\" style=\"fill:none;stroke:currentColor;stroke-width:1px;\"/>\n        <g>\n            <path d=\"M269.436,319.737C269.436,319.737 336.262,207.094 500,204.285C661.479,201.514 746.785,319.369 772.1,380.128C772.899,382.046 769.351,390.736 737.424,424.837C699.641,465.194 484.252,636.917 245.047,635.628C243.263,635.619 230.418,631.098 221.664,604.464C212.911,577.831 220.36,582.115 220.919,580.066C221.478,578.017 234.702,581.928 267.854,579.88C301.006,577.831 373.36,554.46 385.376,542.444C385.655,542.164 387.604,531.549 386.307,527.171C384.817,522.143 327.595,554.208 251.091,561.441C246.238,561.9 219.802,562.745 214.959,561.441C210.117,560.137 205.833,550.825 206.392,545.238C206.951,539.65 201.391,510.34 206.578,464.034C206.906,461.107 212.579,454.53 219.627,454.22C228.304,453.838 242.799,463.47 304.115,453.171C332.396,448.421 490.326,396.76 546.095,314.676C547.59,312.475 544.513,311.898 537.726,315.462C530.94,319.026 404.044,425.119 275.254,434.992C266.957,435.628 242.508,435.281 242.508,435.281C242.508,435.281 215.712,435.377 217.715,414.302C219.717,393.228 249.946,347.551 250.423,346.598C250.9,345.644 253.366,343.165 259.1,343.165C260.722,343.165 259.048,349.489 284.561,354.226C313.836,359.662 404.822,334.819 461.628,271.206C463.797,268.777 455.673,268.398 451.889,271.084C448.105,273.769 385.574,327.086 315.159,332.115C312.551,332.301 267.524,335.131 269.436,319.737ZM402.904,514.909C402.904,514.909 404.99,533.533 410.354,533.235C415.718,532.937 453.917,514.704 457.587,511.035C458.034,510.588 454.435,497.142 452.223,493.602C451.478,492.41 402.904,514.909 402.904,514.909ZM574.499,246.915C574.482,246.887 574.454,246.875 574.413,246.88C574.291,246.895 574.332,246.906 574.499,246.915ZM574.499,246.915C574.881,247.554 569.522,256.398 570.165,259.847C570.165,259.847 632.989,289.24 670.928,341.694C671.152,342.004 677.997,337.709 683.361,331.034C688.725,324.359 615.639,251.994 583.949,247.118C582.599,246.91 575.634,246.974 574.499,246.915Z\" fill=\"currentColor\"/>\n            <path id=\"Main-Top\" serif:id=\"Main Top\" d=\"M269.436,319.737C269.436,319.737 336.262,207.094 500,204.285C661.479,201.514 746.785,319.369 772.1,380.128C772.899,382.046 769.351,390.736 737.424,424.837C699.641,465.194 484.252,636.917 245.047,635.628C243.263,635.619 230.418,631.098 221.664,604.464C212.911,577.831 220.36,582.115 220.919,580.066C221.478,578.017 234.702,581.928 267.854,579.88C301.006,577.831 373.36,554.46 385.376,542.444C385.655,542.164 387.604,531.549 386.307,527.171C384.817,522.143 327.595,554.208 251.091,561.441C246.238,561.9 219.802,562.745 214.959,561.441C210.117,560.137 205.833,550.825 206.392,545.238C206.951,539.65 201.391,510.34 206.578,464.034C206.906,461.107 212.579,454.53 219.627,454.22C228.304,453.838 242.799,463.47 304.115,453.171C332.396,448.421 490.326,396.76 546.095,314.676C547.59,312.475 544.513,311.898 537.726,315.462C530.94,319.026 404.044,425.119 275.254,434.992C266.957,435.628 242.508,435.281 242.508,435.281C242.508,435.281 215.712,435.377 217.715,414.302C219.717,393.228 249.946,347.551 250.423,346.598C250.9,345.644 253.366,343.165 259.1,343.165C260.722,343.165 259.048,349.489 284.561,354.226C313.836,359.662 404.822,334.819 461.628,271.206C463.797,268.777 455.673,268.398 451.889,271.084C448.105,273.769 385.574,327.086 315.159,332.115C312.551,332.301 267.524,335.131 269.436,319.737Z\" style=\"fill:none;stroke:currentColor;stroke-width:1px;\"/>\n        </g>\n    </g>\n    <g id=\"Middle\">\n        <g transform=\"matrix(1,0,0,1,3.005268,5.110119)\">\n            <path d=\"M549.076,603.525C549.076,603.525 669.009,552.288 789.524,438.74C789.955,438.334 823.354,459.839 732.777,515.494C715.297,526.235 514.82,670.053 302.808,701.742C301.054,702.004 289.532,704.908 268.145,681.145C267.072,679.953 351.25,680.668 429.777,651.107C508.305,621.546 482.919,631.876 549.076,603.525Z\" fill=\"currentColor\"/>\n            <path id=\"Small-ring\" serif:id=\"Small ring\" d=\"M549.076,603.525C549.076,603.525 669.009,552.288 789.524,438.74C789.955,438.334 823.354,459.839 732.777,515.494C715.297,526.235 514.82,670.053 302.808,701.742C301.054,702.004 289.532,704.908 268.145,681.145C267.072,679.953 351.25,680.668 429.777,651.107C508.305,621.546 482.919,631.876 549.076,603.525Z\" style=\"fill:none;stroke:currentColor;stroke-width:1.04px;\"/>\n        </g>\n        <g>\n            <path d=\"M553.455,572.592C553.455,572.592 732.261,493.331 826.988,348.082C837.646,331.741 853.276,287.691 818.463,262.114C783.649,236.537 727.468,243.25 699.849,241.03C693.075,240.486 667.954,219.845 720.103,219.612C767.363,219.401 793.671,219.612 816.951,230.321C840.232,241.03 865.25,270.6 864.212,303.19C863.048,339.741 843.593,376.654 788.782,434.728C730.864,496.093 498.732,668.516 265.096,678.839C244.501,679.749 84.167,674.121 126.866,546.519C130.7,535.062 134.183,524 152.249,500.084C170.315,476.168 179.069,495.351 171.06,506.34C163.051,517.328 146.848,553.646 145.358,564.076C143.868,574.506 120.587,655.896 269.585,655.524C291.025,655.47 438.525,637.816 553.455,572.592Z\" fill=\"currentColor\"/>\n            <path id=\"Big-Ring-2\" serif:id=\"Big Ring 2\" d=\"M553.455,572.592C553.455,572.592 732.261,493.331 826.988,348.082C837.646,331.741 853.276,287.691 818.463,262.114C783.649,236.537 727.468,243.25 699.849,241.03C693.075,240.486 667.954,219.845 720.103,219.612C767.363,219.401 793.671,219.612 816.951,230.321C840.232,241.03 865.25,270.6 864.212,303.19C863.048,339.741 843.593,376.654 788.782,434.728C730.864,496.093 498.732,668.516 265.096,678.839C244.501,679.749 84.167,674.121 126.866,546.519C130.7,535.062 134.183,524 152.249,500.084C170.315,476.168 179.069,495.351 171.06,506.34C163.051,517.328 146.848,553.646 145.358,564.076C143.868,574.506 120.587,655.896 269.585,655.524C291.025,655.47 438.525,637.816 553.455,572.592Z\" style=\"fill:none;stroke:currentColor;stroke-width:1.04px;\"/>\n        </g>\n        <g>\n            <path d=\"M172.542,421.374C189.382,421.294 181.679,441.787 171.344,450.192C138.241,477.11 76.765,549.863 66.943,571.567C-5.297,731.205 180.628,722.774 222.271,725.803C320.193,732.925 491.002,665.502 553.022,639.614C615.043,613.726 677.435,571.634 680.602,569.771C703.937,556.045 757.708,518.553 783.969,496.576C810.23,474.599 803.152,481.922 862.565,422.162C921.978,362.402 943.252,310.441 945.259,304.826C957.022,271.91 950.846,224.368 909.499,204.237C859.765,180.022 786.768,184.347 776.767,185.597C702.088,194.927 682.126,206.352 654.586,209.414C629.161,212.24 630.888,196.559 638.239,193.518C643.617,191.294 736.069,159.826 826.865,161.455C917.66,163.085 943.885,202.067 948.589,206.981C1013.775,275.078 939.21,368.958 934.659,374.875C714.472,661.176 321.981,741.78 309.317,742.807C282.398,744.989 197.718,767.918 98.179,730.799C-10.224,690.374 32.353,597.46 37.672,582.686C62.075,514.907 172.542,421.374 172.542,421.374Z\" fill=\"currentColor\"/>\n            <path id=\"Big-Ring\" serif:id=\"Big Ring\" d=\"M172.542,421.374C172.542,421.374 62.075,514.907 37.672,582.686C32.353,597.46 -10.224,690.374 98.179,730.799C197.718,767.918 282.398,744.989 309.317,742.807C321.981,741.78 714.472,661.176 934.659,374.875C939.21,368.958 1013.775,275.078 948.589,206.981C943.885,202.067 917.66,163.085 826.865,161.455C736.069,159.826 643.617,191.294 638.239,193.518C630.888,196.559 629.161,212.24 654.586,209.414C682.126,206.352 702.088,194.927 776.767,185.597C786.768,184.347 859.765,180.022 909.499,204.237C950.846,224.368 957.022,271.91 945.259,304.826C943.252,310.441 921.978,362.402 862.565,422.162C803.152,481.922 810.23,474.599 783.969,496.576C757.708,518.553 703.937,556.045 680.602,569.771C677.435,571.634 615.043,613.726 553.022,639.614C491.002,665.502 320.193,732.925 222.271,725.803C180.628,722.774 -5.297,731.205 66.943,571.567C76.765,549.863 138.241,477.11 171.344,450.192C181.679,441.787 189.382,421.294 172.542,421.374Z\" style=\"fill:none;stroke:currentColor;stroke-width:1.04px;\"/>\n        </g>\n    </g>\n    <g id=\"Bottom\">\n        <path id=\"Bottom-Hole\" serif:id=\"Bottom Hole\" d=\"M634.286,696.705C634.286,696.705 645.199,708.71 653.202,709.437C661.205,710.165 668.844,693.795 670.662,691.976C672.481,690.158 657.931,672.697 651.019,674.152C644.108,675.607 633.195,688.339 634.286,696.705Z\" style=\"fill:none;stroke:currentColor;stroke-width:1.04px;\"/>\n        <g>\n            <path d=\"M358.606,759.376C349.201,750.386 362.573,743.726 366.556,742.903C592.089,696.342 783.21,541.627 785.976,540.651C792.16,538.468 795.705,546.094 795.891,553.019C796.348,570.115 766.909,636.005 764.566,639.698C592.169,911.542 358.606,759.376 358.606,759.376ZM634.286,696.705C634.286,696.705 645.199,708.71 653.202,709.437C661.205,710.165 668.844,693.795 670.662,691.976C672.481,690.158 657.931,672.697 651.019,674.152C644.108,675.607 633.195,688.339 634.286,696.705Z\" fill=\"currentColor\"/>\n            <path id=\"Bototm\" d=\"M358.606,759.376C358.606,759.376 592.169,911.542 764.566,639.698C766.909,636.005 796.348,570.115 795.891,553.019C795.705,546.094 792.16,538.468 785.976,540.651C783.21,541.627 592.089,696.342 366.556,742.903C362.573,743.726 349.201,750.386 358.606,759.376Z\" style=\"fill:none;stroke:currentColor;stroke-width:1.04px;\"/>\n        </g>\n    </g>\n</svg>\n    ",
         var2,
         var3,
         var1.e(),
         var1.e(),
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
         0.0F,
         0.0F);
      short var10000 = 19661;
      float var4 = var2 + var1.e() + var1.e() * 0.15F;
      var10001 = -2252;
      float var5 = var3 + var1.e() * 0.12F;
      float var6 = var1.e() * 0.51F;
      float var7 = var1.e() * 0.34F;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         "POLINEX",
         var4,
         var5,
         var6,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
      var10000 = 19660;
      var10001 = -18979;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         "Client",
         var4,
         var5 + var6 * 0.9F,
         var7,
         new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(13421772),
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
   }

   private final void a(
      IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1,
      float var2,
      float var3,
      float var4
   ) {
      int[] var5 = g();
      int var10000 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.length();
      if (var5 == null) {
         var10000 = var10000 == 0 ? 1 : 0;
      }

      if (var10000 == 0) {
         float var6 = var1.j() * 2.5F;
         float var7 = var1.j() * 0.6F;
         float var8 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
            var1.j(),
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         );
         float var9 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b(
            this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
            var1.j(),
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         );
         float var10 = var1.j() * 2.0F;
         float var11 = var7 * 0.4F;
         float var12 = var7 * 1.1F;
         float var13 = var7 * 0.65F;
         float var14 = var7 + var6 + var7 + var8 + var12 + var10 + var11 + var13;
         float var15 = var6 + var7 * 2;
         float var16 = var1.a() - var14 - var1.d();
         float var17 = var1.d();
         float var18 = RangesKt.coerceAtMost(
            lIllIlIlIlllllIIIIIlIlIIIlIIlIIlIIllIlIIIlIlIlIIIIIIIlIlIIlIlIlIIIIlIlIlIlIIIllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(),
            var15 / 2.0F
         );
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var16,
            var17,
            var14,
            var15,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .ac(),
            var18
         );
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var16,
            var17,
            var14,
            var15,
            1.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .af(),
            var18
         );
         IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll, var16 + var7 + var6 / 2, var17 + var15 / 2, var6);
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
            var16 + var7 + var6 + var7,
            var17 + (var15 - var9) / 2,
            var1.j(),
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(),
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         if (var5 == null && this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI != null) {
            IlIlIllIllIllIlIlllIlIlIllIlllllllIlIIllllIlIIllIlIllIllIlllllIIIlIIllIllIIlllIIlllll var19 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            boolean var20 = false;
            var19.a(var16 + var14 - var10 - var13 - 2.0F * var1.c());
            var19.b(var17 + (var15 - var19.d()) / 2);
            var19.a(var2, var3, var4);
            var19.e();
         }
      }
   }

   private final void a(
      IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1,
      float var2,
      float var3
   ) { int var53 = 0; // PX-FIX hoist
        
      float var99 = 0; // PX-FIX
      Object var93 = null; // PX-FIX
      int var92 = 0; // PX-FIX
      Object var89 = null; // PX-FIX
      Object var86 = null; // PX-FIX
      int var51 = 0; // PX-FIX
      int[] var4;
      float var83;
      label306: {
         var4 = g();
         boolean var10000 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
         if (var4 == null) {
            if (this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl) {
               float var46 = (float)(System.currentTimeMillis() - this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI)
                  / 1000.0F;
               float var48 = RangesKt.coerceIn(var46 / 0.2F, 0.0F, 1.0F);
               var83 = var48;
               float var10001 = 1.0F;
               if (var4 == null) {
                  if (var48 >= 1.0F) {
                     this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = false;
                     this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = false;
                     var83 = 0.0F;
                     break label306;
                  }

                  var83 = 1.0F;
                  var10001 = var48 * var48 * var48;
               }

               var83 -= var10001;
               break label306;
            }

            var10000 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
         }

         if (var10000) {
            float var6 = (float)(System.currentTimeMillis() - this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI)
               / 1000.0F;
            float var7 = RangesKt.coerceIn(var6 / 0.25F, 0.0F, 1.0F);
            var83 = var7 * var7 * (3.0F - 2.0F * var7);
         } else {
            var83 = 0.0F;
         }
      }

      float var5;
      float var9;
      float var10;
      byte var11;
      float var47;
      String var49;
      label295: {
         float var8;
         label309: {
            label310: {
               var5 = var83;
               var47 = var1.k() * 0.8F;
               var49 = lIIlIlIIllIllllIIIllIIIIIlIIlIllIllllIIlllIIIIIlIlIlllIlIIIlllIlIIlIlllllIIlIIIIIIIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                  .a();
               var8 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                  var49,
                  var1.k(),
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
               var9 = var8 + var47 * 2.5F;
               var10 = var1.k() + var47 * 1.6F;
               var11 = 5;
               Iterator var15 = this.a().iterator();
               Object var85 = var15;
               if (var4 == null) {
                  if (!var15.hasNext()) {
                     var86 = null;
                     break label310;
                  }

                  var85 = var15.next();
               }

               String var16 = (String)var85;
               boolean var17 = false;
               float var52 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                  var16, var1.k(), me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);

               while (var15.hasNext()) {
                  String var55 = (String)var15.next();
                  boolean var18 = false;
                  float var56 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                     var55, var1.k(), me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
                  var52 = Math.max(var52, var56);
                  if (var4 != null) {
                     break label309;
                  }

                  if (var4 != null) {
                     break;
                  }
               }

               var86 = var52;
            }

            if (var86 != null) {
               var83 =((Float)( var86));
               break label295;
            }
         }

         var83 = var8;
      }

      float var12 = var83;
      float var13 = (var12 + var47 * 2.5F) * 1.5F;
      Iterable var50 = this.a();
       var53 = 0;
      var var58 = new ArrayList();
      boolean var19 = false;

      for (Object var21 : var50) {
         String var22 = (String)var21;
         boolean var23 = false;
         boolean var88 = Intrinsics.areEqual(var22, var49);
         if (var4 == null) {
            var88 = !var88;
         }

         if (var88) {
            var58.add(var21);
            if (var4 != null) {
               break;
            }
         }
      }

      List var14;
      float var24;
      float var25;
      List var57;
      float var61;
      float var62;
      float var63;
      float var64;
      label264: {
         label313: {
            var14 = var58;
            var51 = RangesKt.coerceAtLeast(var14.size() - (var11 - 1), 0);
            var53 = RangesKt.coerceIn((int)(this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl * var51), 0, var51);
            var57 = CollectionsKt.take(CollectionsKt.drop(var14, var53), var11 - 1);
            int var59 = var57.size() + 1;
            float var60 = var59 * var10;
            var61 = var9 + (var13 - var9) * var5;
            var62 = var10 + (var60 - var10) * var5;
            var63 = var1.a() - var9 - var1.d();
            var64 = var1.b() - var10 - var1.d();
            var24 = var63 + (var9 - var61);
            var25 = var64 - (var62 - var10);
            float var103;
            var89 = (var103 = var2 - var63) == 0.0F ? 0 : (var103 < 0.0F ? -1 : 1);
            if (var4 == null) {
               if (((Number)var89).intValue() != 0) {
                  break label313;
               }

               float var104;
               var89 = (var104 = var2 - (var63 + var9)) == 0.0F ? 0 : (var104 < 0.0F ? -1 : 1);
            }

            if (var4 == null) {
               if (((Number)var89).intValue() != 0) {
                  break label313;
               }

               float var105;
               var89 = (var105 = var3 - var64) == 0.0F ? 0 : (var105 < 0.0F ? -1 : 1);
            }

            if (var4 == null) {
               if (((Number)var89).intValue() != 0) {
                  break label313;
               }

               float var106;
               var89 = (var106 = var3 - (var64 + var10)) == 0.0F ? 0 : (var106 < 0.0F ? -1 : 1);
            }

            if (var4 != null) {
               break label264;
            }

            if (((Number)var89).intValue() != 0) {
               var89 = 1;
               break label264;
            }
         }

         var89 = 0;
      }

      int var26;
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var97;
      label243: {
         label242: {
            var26 =((Integer)( var89));
            int var10004 = var26;
            if (var4 == null) {
               if (var26 != 0) {
                  break label242;
               }

               var10004 = ((this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) ? 1 : 0);
            }

            if (var10004 == 0) {
               var97 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ac();
               break label243;
            }
         }

         var97 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .ad();
      }

      label234: {
         label233: {
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var24,
               var25,
               var61,
               var62,
               var97,
               lIllIlIlIlllllIIIIIlIlIIIlIIlIIlIIllIlIIIlIlIlIIIIIIIlIlIIlIlIlIIIIlIlIlIlIIIllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b()
            );
            int var98 = var26;
            if (var4 == null) {
               if (var26 != 0) {
                  break label233;
               }

               var98 = ((this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) ? 1 : 0);
            }

            if (var98 == 0) {
               var99 = 1.5F;
               break label234;
            }
         }

         var99 = 2.0F;
      }

      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var102;
      label225: {
         label224: {
            int var10005 = var26;
            if (var4 == null) {
               if (var26 != 0) {
                  break label224;
               }

               var10005 = ((this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) ? 1 : 0);
            }

            if (var10005 == 0) {
               var102 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .af();
               break label225;
            }
         }

         var102 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      float var29;
      float var10002;
      float var10003;
      label216: {
         label215: {
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var24,
               var25,
               var61,
               var62,
               var99,
               var102,
               lIllIlIlIlllllIIIIIlIlIIIlIIlIIlIIllIlIIIlIlIlIIIIIIIlIlIIlIlIlIIIIlIlIlIlIIIllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b()
            );
            float var27 = var63 + var47 * 1.25F;
            float var28 = var24 + var47 * 1.25F;
            var29 = var27 + (var28 - var27) * var5;
            float var30 = var64 + var47 * 0.8F;
            float var31 = 1.0F - var5 * 0.3F;
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
            NanoVG.nvgGlobalAlpha(
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b(),
               var31
            );
            var10002 = var30 + 1;
            var10003 = var1.k();
            int var100 = var26;
            if (var4 == null) {
               if (var26 != 0) {
                  break label215;
               }

               var100 = ((this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) ? 1 : 0);
            }

            if (var100 == 0) {
               var97 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b();
               break label216;
            }
         }

         var97 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var49, var29, var10002, var10003, var97, me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
      float var107;
      int var90 = (var107 = var5 - 0.3F) == 0.0F ? 0 : (var107 < 0.0F ? -1 : 1);
      if (var4 == null) {
         if (var90 > 0) {
            float var32 = RangesKt.coerceIn((var5 - 0.3F) / 0.7F, 0.0F, 1.0F);
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
            NanoVG.nvgGlobalAlpha(
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b(),
               var32
            );
            NanoVG.nvgScissor(
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b(),
               var24 + 2.0F,
               var25 + 2.0F,
               var61 - 4.0F,
               var62 - 4.0F
            );
            this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = null;
            Iterable var33 = var57;
            boolean var34 = false;
            int var35 = 0;
            Iterator var36 = var33.iterator();

            while (true) {
               if (var36.hasNext()) {
                  Object var37 = var36.next();
                  int var38 = var35++;
                  var92 = var38;
                  if (var4 != null) {
                     break;
                  }

                  if (var4 == null) {
                     if (var38 < 0) {
                        CollectionsKt.throwIndexOverflow();
                     }

                     var92 = var38;
                  }

                  String var39;
                  float var42;
                  label198: {
                     label316: {
                        var39 = (String)var37;
                        int var40 = var92;
                        boolean var41 = false;
                        var42 = var25 + var40 * var10;
                        float var108;
                        var93 = (var108 = var2 - var24) == 0.0F ? 0 : (var108 < 0.0F ? -1 : 1);
                        if (var4 == null) {
                           if (((Number)var93).intValue() != 0) {
                              break label316;
                           }

                           float var109;
                           var93 = (var109 = var2 - (var24 + var61)) == 0.0F ? 0 : (var109 < 0.0F ? -1 : 1);
                        }

                        if (var4 == null) {
                           if (((Number)var93).intValue() != 0) {
                              break label316;
                           }

                           float var110;
                           var93 = (var110 = var3 - var42) == 0.0F ? 0 : (var110 < 0.0F ? -1 : 1);
                        }

                        if (var4 == null) {
                           if (((Number)var93).intValue() != 0) {
                              break label316;
                           }

                           float var111;
                           var93 = (var111 = var3 - (var42 + var10)) == 0.0F ? 0 : (var111 < 0.0F ? -1 : 1);
                        }

                        if (var4 != null) {
                           break label198;
                        }

                        if (((Number)var93).intValue() != 0) {
                           var93 = 1;
                           break label198;
                        }
                     }

                     var93 = 0;
                  }

                  int var43;
                  label177: {
                     var43 =((Integer)( var93));
                     if (var4 == null) {
                        if (var43 == 0) {
                           break label177;
                        }

                        this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var39;
                     }

                     me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                        var24 + 4.0F,
                        var42 + 2.0F,
                        var61 - 8.0F,
                        var10 - 2.0F,
                        IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .ae(),
                        lIllIlIlIlllllIIIIIlIlIIIlIIlIIlIIllIlIIIlIlIlIIIIIIIlIlIIlIlIlIIIIlIlIlIlIIIllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .a()
                     );
                  }

                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                     var39,
                     var24 + var47 * 1.25F,
                     var42 + var47 * 0.8F,
                     var1.k(),
                     var43 != 0
                        ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .a()
                        : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .b(),
                     me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
                  if (var4 == null) {
                     continue;
                  }
               }

               var92 =((Integer)( var51));
               break;
            }

            if (var92 > 0) {
               float var66 = 3.0F;
               float var68 = 4.0F;
               float var70 = var24 + var61 - var66 - var68;
               float var72 = var57.size() * var10 - var68 * 2;
               float var74 = RangesKt.coerceAtLeast(var72 / ((float)var14.size() / var57.size()), var10 * 0.3F);
               float var76 = var25 + var68 + (var72 - var74) * this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                  var70,
                  var76,
                  var66,
                  var74,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                     .a(0.6F),
                  var66 / 2.0F
               );
            }

            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
         }

         var90 = ((this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl) ? 1 : 0);
      }

      if (var90 != 0) {
         float var69;
         float var71;
         float var73;
         String var75;
         float var77;
         float var78;
         float var81;
         float var82;
         int var96;
         label161: {
            label318: {
               float var65 = (float)(System.currentTimeMillis() - this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl)
                  / 1000.0F;
               short var94 = 19676;
               float var67 = RangesKt.coerceIn(var65 / 0.3F, 0.0F, 1.0F);
               short var95 = 21135;
               var69 = var67 * var67;
               var71 = var1.k();
               var73 = var71 * 0.75F;
               var75 = "Restart to apply";
               var77 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                     var75,
                     var71,
                     me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                  )
                  + var73 * 2;
               var78 = var71 + var73 * 1.4F;
               float var79 = var63 - var77 - var73 * 1.5F;
               float var80 = var79 - (var13 - var9) - var73;
               var81 = var79 + (var80 - var79) * var5;
               var82 = var64 + (var10 - var78) / 2;
               float var112;
               var96 = (var112 = var2 - var81) == 0.0F ? 0 : (var112 < 0.0F ? -1 : 1);
               if (var4 == null) {
                  if (var96 < 0) {
                     break label318;
                  }

                  float var113;
                  var96 = (var113 = var2 - (var81 + var77)) == 0.0F ? 0 : (var113 < 0.0F ? -1 : 1);
               }

               if (var4 == null) {
                  if (var96 > 0) {
                     break label318;
                  }

                  float var114;
                  var96 = (var114 = var3 - var82) == 0.0F ? 0 : (var114 < 0.0F ? -1 : 1);
               }

               if (var4 == null) {
                  if (var96 < 0) {
                     break label318;
                  }

                  float var115;
                  var96 = (var115 = var3 - (var82 + var78)) == 0.0F ? 0 : (var115 < 0.0F ? -1 : 1);
               }

               if (var4 != null) {
                  break label161;
               }

               if (var96 <= 0) {
                  var96 = 1;
                  break label161;
               }
            }

            var96 = 0;
         }

         this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = (var96 != 0);
         float var44 = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll ? 1.0F : 0.85F;
         me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var45 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .aj()
            .a(var44 * var69);
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
         NanoVG.nvgGlobalAlpha(
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(),
            var69
         );
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var81,
            var82,
            var77,
            var78,
            var45,
            lIllIlIlIlllllIIIIIlIlIIIlIIlIIlIIllIlIIIlIlIlIIIIIIIlIlIIlIlIlIIIIlIlIlIlIIIllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
         );
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var81,
            var82,
            var77,
            var78,
            1.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .aj(),
            lIllIlIlIlllllIIIIIlIlIIIlIIlIIlIIllIlIIIlIlIlIIIIIIIlIlIIlIlIlIIIIlIlIlIlIIIllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
         );
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var75,
            var81 + var73,
            var82 + var73 * 0.7F,
            var71,
            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
      }
   }

   private final void b(
      IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1,
      float var2,
      float var3
   ) {
      IlIlIllIllIllIlIlllIlIlIllIlllllllIlIIllllIlIIllIlIllIllIlllllIIIlIIllIllIIlllIIlllll var16 = null; // PX-FIX
      int[] var10000 = g();
      float var5 = var1.j() * 0.75F;
      int[] var4 = var10000;
      if (var4 == null && this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII != null) {
         IlIlIllIllIllIlIlllIlIlIllIlllllllIlIIllllIlIIllIlIllIllIlllllIIIlIIllIllIIlllIIlllll var8 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         boolean var9 = false;
         if (var4 == null && var8.b(var2, var3)) {
            lIlIlIIlIlIllIllIlIlIIlIllIllIlIlIlIlIlIIIllIIIlIIllllIlIllIlllIIllIlllIIIIIIIIllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(var8.g(), var8.a() + var8.c() / 2, var8.b(), var5, true);
         }
      }

      Iterable var6 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      boolean var7 = false;
      Iterator var12 = var6.iterator();

      while (true) {
         if (var12.hasNext()) {
            Object var14 = var12.next();
            IlIlIllIllIllIlIlllIlIlIllIlllllllIlIIllllIlIIllIlIllIllIlllllIIIlIIllIllIIlllIIlllll var10 = (IlIlIllIllIllIlIlllIlIlIllIlllllllIlIIllllIlIIllIlIllIllIlllllIIIlIIllIllIIlllIIlllll)var14;
            boolean var11 = false;
            if (var4 == null) {
               var16 = var10;
               if (var4 != null) {
                  break;
               }

               if (var10.b(var2, var3)) {
                  lIlIlIIlIlIllIllIlIlIIlIllIllIlIlIlIlIlIIIllIIIlIIllllIlIllIlllIIllIlllIIIIIIIIllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(var10.g(), var10.a() + var10.c() / 2, var10.b(), var5, true);
               }
            }

            if (var4 == null) {
               continue;
            }
         }

         if (var4 != null) {
            return;
         }

         var16 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         break;
      }

      if (var16 != null) {
         IlIlIllIllIllIlIlllIlIlIllIlllllllIlIIllllIlIIllIlIllIllIlllllIIIlIIllIllIIlllIIlllll var13 = var16;
         boolean var15 = false;
         if (var4 == null && var13.b(var2, var3)) {
            lIlIlIIlIlIllIllIlIlIIlIllIllIlIlIlIlIlIIIllIIIlIIllllIlIllIlllIIllIlllIIIIIIIIllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(var13.g(), var13.a() + var13.c() / 2, var13.b() + var13.d(), var5, false);
         }
      }
   }

   @Override
   public boolean a(double var1, double var3, int var5) {
       boolean var53 = false; // PX-FIX decl var53
      Object var49 = null; // PX-FIX
      Object var48 = null; // PX-FIX
      Object var45 = null; // PX-FIX
      int[] var6;
      byte var7;
      float var40;
      label220: {
         int[] var10000 = g();
         short var10001 = 19697;
         short var10002 = 25590;
         String var54 = System.getProperty("os.name");
         short var10003 = 19670;
         short var10004 = -23471;
         Intrinsics.checkNotNullExpressionValue(var54, "getProperty(...)");
         String var55 = var54.toLowerCase(Locale.ROOT);
         var10003 = 19710;
         var10004 = -10364;
         Intrinsics.checkNotNullExpressionValue(var55, "toLowerCase(...)");
         CharSequence var56 = var55;
         var10002 = 19651;
         var10003 = -29111;
         var7 = ((byte)((StringsKt.contains(var56, "mac", false)) ? 1 : 0));
         var6 = var10000;
         int var39 = var7;
         if (var6 == null) {
            if (var7 != 0) {
               var40 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getWindow().getScreenWidth();
               break label220;
            }

            var39 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getWindow().getWidth();
         }

         var40 = var39;
      }

      float var8;
      label214: {
         var8 = var40;
         int var41 = var7;
         if (var6 == null) {
            if (var7 != 0) {
               var40 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getWindow().getScreenHeight();
               break label214;
            }

            var41 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getWindow().getHeight();
         }

         var40 = var41;
      }

      float var9;
      float var20;
      float var21;
      label208: {
         var9 = var40;
         var20 = 0.0F;
         var21 = 0.0F;
         int var43 = var7;
         if (var6 == null) {
            if (var7 != 0) {
               float var12 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getWindow().getGuiScale();
               var20 = (float)(
                  var1 * var8 * var12 / this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getWindow().getWidth()
               );
               var21 = (float)(
                  var3 * var9 * var12 / this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getWindow().getHeight()
               );
               if (var6 == null) {
                  break label208;
               }
            }

            var43 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getWindow().getGuiScale();
         }

         float var22 = var43;
         var20 = (float)(var1 * var22);
         var21 = (float)(var3 * var22);
      }

      boolean var44 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.a(var8, var9, var20, var21, var5);
      if (var6 == null) {
         if (var44) {
            return true;
         }

         var44 = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
      }

      label223: {
         if (var6 == null) {
            if (var44) {
               short var59 = 19696;
               short var62 = 22761;
               me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d(
                  "Restarting game to apply version change to: " + this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
               );
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.stop();
               return true;
            }

            var45 = this;
            if (var6 != null) {
               break label223;
            }

            var44 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
         }

         if (var44) {
            var45 = this;
            if (var6 != null) {
               break label223;
            }

            if (this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll != null) {
               String var57 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
               Intrinsics.checkNotNull(this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll);
               this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var57;
               boolean var46 = Intrinsics.areEqual(
                  this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI,
                  lIIlIlIIllIllllIIIllIIIIIlIIlIllIllllIIlllIIIIIlIlIlllIlIIIlllIlIIlIlllllIIlIIIIIIIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                     .a()
               );
               if (var6 == null) {
                  var46 = !var46;
               }

               boolean var23 = var46;
               boolean var47 = var23;
               if (var6 == null) {
                  if (var23) {
                     if (var6 != null) {
                        return this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
                     }

                     if (!this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl) {
                        this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = System.currentTimeMillis();
                     }
                  }

                  this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = var23;
                  llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .d(this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI);
                  short var58 = 19705;
                  short var61 = 17956;
                  me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d(
                     "Selected version: " + this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
                  );
                  this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = true;
                  this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = System.currentTimeMillis();
                  var47 = true;
               }

               return var47;
            }
         }

         var45 = this;
      }

      label188: {
         IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var24 = ((llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)(Object)(((IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll)var45).IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl));
         if (var24 != null) {
            String var13 = lIIlIlIIllIllllIIIllIIIIIlIIlIllIllllIIlllIIIIIlIlIlllIlIIIlllIlIIlIlllllIIlIIIIIIIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
               .a();
            float var14 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var13, var24.k(), me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
            float var15 = var24.k() * 0.8F;
            float var16 = var14 + var15 * 2.5F;
            float var17 = var24.k() + var15 * 1.6F;
            float var18 = var24.a() - var16 - var24.d();
            float var19 = var24.b() - var17 - var24.d();
            float var66;
            var48 = (var66 = var20 - var18) == 0.0F ? 0 : (var66 < 0.0F ? -1 : 1);
            label184:
            if (var6 == null) {
               if ((((Number)var48).intValue() > 0)) {
                  float var67;
                  var48 = (var67 = var20 - (var18 + var16)) == 0.0F ? 0 : (var67 < 0.0F ? -1 : 1);
                  if (var6 != null) {
                     break label184;
                  }

                  if ((((Number)var48).intValue() < 0)) {
                     float var68;
                     var48 = (var68 = var21 - var19) == 0.0F ? 0 : (var68 < 0.0F ? -1 : 1);
                     if (var6 != null) {
                        break label184;
                     }

                     if ((((Number)var48).intValue() > 0)) {
                        float var69;
                        var48 = (var69 = var21 - (var19 + var17)) == 0.0F ? 0 : (var69 < 0.0F ? -1 : 1);
                        if (var6 != null) {
                           break label184;
                        }

                        if ((((Number)var48).intValue() < 0)) {
                           IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll var50 = this;
                           if (var6 == null) {
                              if (this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) {
                                 this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = true;
                                 this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = System.currentTimeMillis();
                                 if (var6 == null) {
                                    return true;
                                 }
                              }

                              this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = true;
                              this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = System.currentTimeMillis();
                              var50 = this;
                           }

                           var50.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 0.0F;
                           return true;
                        }
                     }
                  }
               }

               var49 = this;
               if (var6 != null) {
                  break label188;
               }

               var48 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
            }

            if (!(me.octo.client.PxTruth.truth(var48))) {
               this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = true;
               this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = System.currentTimeMillis();
            }
         }

         var49 = this;
      }

      Iterable var25 = ((Iterable)(Object)(((IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll)var49).IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl));
      boolean var26 = false;
      Iterator var27 = var25.iterator();

      while (true) {
         if (var27.hasNext()) {
            Object var31 = var27.next();
            IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl var35 = (IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl)var31;
            boolean var37 = false;
            if (var6 == null) {
               boolean var51 = var35.a(var20, var21, var5);
               if (var6 != null) {
                  break;
               }

               if (var51) {
                  return true;
               }
            }

            if (var6 == null) {
               continue;
            }
         }

         if (var6 == null && this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII != null) {
            IlIlIllIllIllIlIlllIlIlIllIlllllllIlIIllllIlIIllIlIllIllIlllllIIIlIIllIllIIlllIIlllll var28 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            boolean var32 = false;
            if (var6 == null && var28.a(var20, var21, var5)) {
               return true;
            }
         }

         var25 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         boolean var52 = false;
         break;
      }

      var27 = var25.iterator();

      while (true) {
         if (var27.hasNext()) {
            Object var33 = var27.next();
            IlIlIllIllIllIlIlllIlIlIllIlllllllIlIIllllIlIIllIlIllIllIlllllIIIlIIllIllIIlllIIlllll var36 = (IlIlIllIllIllIlIlllIlIlIllIlllllllIlIIllllIlIIllIlIllIllIlllllIIIlIIllIllIIlllIIlllll)var33;
            boolean var38 = false;
            if (var6 == null) {
               var53 = var36.a(var20, var21, var5);
               if (var6 != null) {
                  break;
               }

               if (var53) {
                  return true;
               }
            }

            if (var6 == null) {
               continue;
            }
         }

         if (var6 == null && this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI != null) {
            IlIlIllIllIllIlIlllIlIlIllIlllllllIlIIllllIlIIllIlIllIllIlllllIIIlIIllIllIIlllIIlllll var30 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            boolean var34 = false;
            if (var6 == null && var30.a(var20, var21, var5)) {
               return true;
            }
         }

         var53 = super.a(var1, var3, var5);
         break;
      }

      return var53;
   }

   @Override
   public boolean mouseScrolled(double var1, double var3, double var5, double var7) { int var53 = 0; // PX-FIX hoist
        
      Object var59 = null; // PX-FIX
      Object var57 = null; // PX-FIX
      int[] var9;
      byte var10;
      float var52;
      label144: {
         int[] var10000 = g();
         short var10001 = 19659;
         short var10002 = 20185;
         String var61 = System.getProperty("os.name");
         short var10003 = 19672;
         short var10004 = 8539;
         Intrinsics.checkNotNullExpressionValue(var61, "getProperty(...)");
         String var62 = var61.toLowerCase(Locale.ROOT);
         var10003 = 19679;
         var10004 = -31189;
         Intrinsics.checkNotNullExpressionValue(var62, "toLowerCase(...)");
         CharSequence var63 = var62;
         var10002 = 19663;
         var10003 = 29460;
         var10 = ((byte)((StringsKt.contains(var63, "mac", false)) ? 1 : 0));
         var9 = var10000;
         int var51 = var10;
         if (var9 == null) {
            if (var10 != 0) {
               var52 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getWindow().getScreenWidth();
               break label144;
            }

            var51 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getWindow().getWidth();
         }

         var52 = var51;
      }

      float var11;
      label138: {
         var11 = var52;
          var53 = var10;
         if (var9 == null) {
            if (var10 != 0) {
               var52 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getWindow().getScreenHeight();
               break label138;
            }

            var53 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getWindow().getHeight();
         }

         var52 = var53;
      }

      float var12;
      float var33;
      float var34;
      label132: {
         var12 = var52;
         var33 = 0.0F;
         var34 = 0.0F;
         int var55 = var10;
         if (var9 == null) {
            if (var10 != 0) {
               float var15 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getWindow().getGuiScale();
               var33 = (float)(
                  var1 * var11 * var15 / this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getWindow().getWidth()
               );
               var34 = (float)(
                  var3 * var12 * var15 / this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getWindow().getHeight()
               );
               if (var9 == null) {
                  break label132;
               }
            }

            var55 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getWindow().getGuiScale();
         }

         float var35 = var55;
         var33 = (float)(var1 * var35);
         var34 = (float)(var3 * var35);
      }

      boolean var56 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.a(var11, var12, var33, var34, var5, var7);
      if (var9 == null) {
         if (var56) {
            return true;
         }

         var56 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      if (var9 == null) {
         label122: {
            if (var56) {
               var57 = this;
               if (var9 != null) {
                  break label122;
               }

               IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var36 = this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
               if (var36 != null) {
                  String var16 = lIIlIlIIllIllllIIIllIIIIIlIIlIllIllllIIlllIIIIIlIlIlllIlIIIlllIlIIlIlllllIIlIIIIIIIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                     .a();
                  float var17 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                     var16, var36.k(), me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
                  float var18 = var36.k() * 0.8F;
                  float var19 = var17 + var18 * 2.5F;
                  float var20 = var36.k() + var18 * 1.6F;
                  float var21 = var36.a() - var19 - var36.d();
                  float var22 = var36.b() - var20 - var36.d();
                  Iterable var24 = this.a();
                  boolean var25 = false;
                  var var27 = new ArrayList();
                  int var28 = 0;

                  for (Object var30 : var24) {
                     String var31 = (String)var30;
                     boolean var32 = false;
                     int var72 = ((Intrinsics.areEqual(var31, var16)) ? 1 : 0);
                     if (var9 != null) {
                        return (var72 != 0);
                     }

                     if (var9 == null) {
                        var72 = var72 == 0 ? 1 : 0;
                     }

                     if (var72 != 0) {
                        var27.add(var30);
                        if (var9 != null) {
                           break;
                        }
                     }
                  }

                  List var23 = var27;
                  int var37 = RangesKt.coerceAtLeast(var23.size() - 4, 0);
                  if (var9 != null) {
                     return (var37 != 0);
                  }

                  if (var37 > 0) {
                     label106: {
                        label150: {
                           label151: {
                              Iterator var39 = this.a().iterator();
                              Object var58 = var39;
                              if (var9 == null) {
                                 if (!var39.hasNext()) {
                                    var59 = null;
                                    break label151;
                                 }

                                 var58 = var39.next();
                              }

                              String var41 = (String)var58;
                              boolean var44 = false;
                              float var42 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                                 var41, var36.k(), me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);

                              while (var39.hasNext()) {
                                 String var45 = (String)var39.next();
                                 boolean var48 = false;
                                 float var46 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                                    var45, var36.k(), me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
                                 var42 = Math.max(var42, var46);
                                 if (var9 != null) {
                                    break label150;
                                 }

                                 if (var9 != null) {
                                    break;
                                 }
                              }

                              var59 = var42;
                           }

                           if (var59 != null) {
                              var52 =((Float)( var59));
                              break label106;
                           }
                        }

                        var52 = var17;
                     }

                     float var38 = var52;
                     float var26 = (var38 + var18 * 2.5F) * 1.5F;
                     var28 = CollectionsKt.take(var23, 4).size() + 1;
                     float var43 = var28 * var20;
                     float var47 = var21 + (var19 - var26);
                     float var49 = var22 - (var43 - var20);
                     float var68;
                     int var73 = (var68 = var33 - var47) == 0.0F ? 0 : (var68 < 0.0F ? -1 : 1);
                     if (var9 != null) {
                        return (var73 != 0);
                     }

                     if (var73 >= 0) {
                        float var69;
                        int var74 = (var69 = var33 - (var47 + var26)) == 0.0F ? 0 : (var69 < 0.0F ? -1 : 1);
                        if (var9 != null) {
                           return (var74 != 0);
                        }

                        if (var74 <= 0) {
                           float var70;
                           int var75 = (var70 = var34 - var49) == 0.0F ? 0 : (var70 < 0.0F ? -1 : 1);
                           if (var9 != null) {
                              return (var75 != 0);
                           }

                           if (var75 >= 0) {
                              float var71;
                              int var76 = (var71 = var34 - (var49 + var43)) == 0.0F ? 0 : (var71 < 0.0F ? -1 : 1);
                              if (var9 != null) {
                                 return (var76 != 0);
                              }

                              if (var76 <= 0) {
                                 float var50 = (float)(var7 * 0.1F);
                                 this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = RangesKt.coerceIn(
                                    this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl - var50, 0.0F, 1.0F
                                 );
                                 return true;
                              }
                           }
                        }
                     }
                  }
               }
            }

         }

         // Original bytecode 847-857: aload_0 / dload_1 / dload_3 / dload 5 / dload 7 /
         // invokespecial llIllIIlllIII...mouseScrolled:(DDDD)Z / ireturn.
         var56 = super.mouseScrolled(var1, var3, var5, var7);
      }

      return var56;
   }

   @Override
   public boolean a(int var1, int var2, int var3) {
      int[] var4 = g();
      int var10000 = ((this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.a(var1, var2, var3)) ? 1 : 0);
      if (var4 == null) {
         if (var10000 != 0) {
            return true;
         }

         var10000 = var1;
      }

      if (var4 == null) {
         if (var10000 == 256) {
            boolean var5 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
            if (var4 == null) {
               if (this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) {
                  this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = true;
                  this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = System.currentTimeMillis();
                  return true;
               }

               var5 = true;
            }

            return var5;
         }

         var10000 = ((super.a(var1, var2, var3)) ? 1 : 0);
      }

      return (var10000 != 0);
   }

   @Override
   public boolean a(char var1, int var2) {
      int[] var3 = g();
      boolean var10000 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.a(var1, var2);
      if (var3 == null) {
         if (var10000) {
            return true;
         }

         var10000 = super.a(var1, var2);
      }

      return var10000;
   }

   @Override
   public boolean isPauseScreen() {
      return false;
   }

   private static final Unit d() {
      return Unit.INSTANCE;
   }

   private static final Unit a(IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll var0) {
      var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.setScreen(new SelectWorldScreen(var0));
      return Unit.INSTANCE;
   }

   private static final Unit b(IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll var0) {
      var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.setScreen(new JoinMultiplayerScreen(var0));
      return Unit.INSTANCE;
   }

   private static final Unit c(IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll var0) {
      var0.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
         .a(new llIIlIIlllllllIlIlIlllllIIllIIlllIlIllIlllIllIIlIlIllllIlIllIIIIIIIlIlIlllIlIIlIlllII(var0));
      return Unit.INSTANCE;
   }

   private static final Unit d(IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll var0) {
      var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .setScreen(new OptionsScreen(var0, var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.options, false));
      return Unit.INSTANCE;
   }

   private static final Unit e(IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll var0) {
      var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.stop();
      return Unit.INSTANCE;
   }

   private static final Unit e() {
      short var10001 = 19671;
      short var10002 = -12804;
      me.octo.client.utils.llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a("https://polinexclient.com/info/faq");
      return Unit.INSTANCE;
   }

   private static final Unit f() {
      short var10001 = 19707;
      short var10002 = 31590;
      me.octo.client.utils.llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a("https://polinexclient.com/documentation");
      return Unit.INSTANCE;
   }

   private static final Unit f(IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll var0) {
      var0.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
         .a(new lIIIlIIIIlIIIlIlIlllIlIIIlIIIIllIlIllIllIlIlIllIlIllIIllllIIllIlIlIIIIIllIllIIlllIIlI(var0));
      return Unit.INSTANCE;
   }

   private static final Unit a(
      IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll var0,
      IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6
   ) {
      IllIlIIlIIIIllIIllIlllllIIIIIIllllIIlIIIlIlIlllIllIllllIlIlIlIIIllIllIlIIIIlIlllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(
            var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getWindow().getWidth(),
            var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getWindow().getHeight()
         );
      IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      Iterable var8 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      boolean var9 = false;
      int[] var10000 = g();
      Iterator var10 = var8.iterator();
      int[] var7 = var10000;

      while (var10.hasNext()) {
         Object var11 = var10.next();
         IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl var12 = (IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl)var11;
         boolean var13 = false;
         var12.a(var2, var3, var4);
         var12.e();
         if (var7 == null && var7 == null) {
            continue;
         }
         break;
      }

      if (var7 == null && var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII != null) {
         IlIlIllIllIllIlIlllIlIlIllIlllllllIlIIllllIlIIllIlIllIllIlllllIIIlIIllIllIIlllIIlllll var16 = var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         boolean var18 = false;
         var16.a(var2, var3, var4);
         var16.e();
      }

      var8 = var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      var9 = false;
      var10 = var8.iterator();

      while (true) {
         if (var10.hasNext()) {
            Object var19 = var10.next();
            IlIlIllIllIllIlIlllIlIlIllIlllllllIlIIllllIlIIllIlIllIllIlllllIIIlIIllIllIIlllIIlllll var20 = (IlIlIllIllIllIlIlllIlIlIllIlllllllIlIIllllIlIIllIlIllIllIlllllIIIlIIllIllIIlllIIlllll)var19;
            boolean var21 = false;
            var20.a(var2, var3, var4);
            var20.e();
            if (var7 != null) {
               break;
            }

            if (var7 == null) {
               continue;
            }
         }

         var0.b(var1);
         var0.a(var1, var2, var3, var4);
         var0.a(var1, var2, var3);
         var0.b(var1, var2, var3);
         var0.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.a(var5, var6, var2, var3, var4);
         break;
      }

      return Unit.INSTANCE;
   }

   public static void b(int[] var0) {
      llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = var0;
   }

   public static int[] g() {
      return llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[46];
      int var3 = 0;
      b((int[])null);
      String var2 = "Êq6\u000e\u001aó\u009fß\u0004[«\\\u0010\u000bq¦´O\u007fè\fù\u0004yA\u008bf°æǚ\u009e\u0010\u0080\u0005\u0007dúEÍ\bG_é\u0095²¬\u001c)ÅS³h\u009a1@aTqØT#Ä±l§JèxÓû'ÛõÃéîyæY3:M9\u0013¢}í§\u0010°üYr3³\u000e\u001aGÈB6\u001e\u001f=Àû\u0092<\u0011÷\u000f$\u0003Ü4\u001c+×\u0091\rÚD<\u0091D\u0089+\f=\u0081\u0096z-,iIÐAv®E\u007f\u0087¢)Ø\u0017\u000e\t\u008b%0&ý\u0011»Ê àÑc?Jç¥À³\u000f®´\u0085¤\u0082²\u0099\u008bg¿Ó\u0098¯7lºÒ\u001d\u0092\u0097ã8jFRÇ\u0004ím¨i$~\u0083Ø¨R\u0015¦\u0082\u009f\u0091 ^\u0093\u0092_\u001bÍ\u0014§³¯QãR\u0095¬âH0\u0014\u0003\u0014{(Ã¯dð;\u0005È\u001c\u0014ÛÉg\u00ad\u0083YL,\u009e]\u009a·ï\u0014ô´\u0098Ú\u000ey.~\u0012\u0096\u00055\u0083©w96íÈóêÚD\u0001\u000e¢#é¬ÊC¶§\u001dÆ \u0000ïIçËb±øîÖÓó\u0089^&\u0092\u0083µSÎm0u;¸¶ç\u001e\u0093\u001b%tu^fò\u0014\u0090\u009aÃa°\u0098ÎÝÁj\u0006\u0085ùfò\u0003\u0081\\)\u0085ÀÕ×\u0096ÈTÁµaæÇî]\u0005Öù\u008aÖc:´¹ß\u009e\u0001Òë\u0082Ý\u0019¦ß¸ÿ\u0018\u001aD\u008cÂ´b\u00ad[9rö[\u0016\u001c\u0002÷BÝ_¥ÁN¾±;\u0014x¨Ù\u0093\u009e\u008e¿Õ÷_[$¯¨¢\u0001\u009aT\u009f©Æ\"\u009fæº®µ\u000e~å\u0017ìì´n°Ê\u009e\u0017Ý¬H7\u000en\u008fÃ»\u008bR\u007f¯\u0084:\u0004{\u009cvÉH¾üÖ±\u0002\u008b\töÕß³#\r-&_Å bÈYÝ\u001aèD\nL\u0007E´ê\u0013Ï\u0010î\u0002\u001aÃÄ·\u0002\u008e<ÇBÌs×¯Ð\rÐ\u008f\u0017¶\n]\u0017ê\u0080I×\u0012ß\u0010J\u009a\u001aí,éñ%X×Ò\nÒ1LÉ\u0010«yûÁÞ\u0003}î\u001a½h\u00916|\u0007¥\u0006S\u000f\u0002\u000ft¯\u0004¦\u009bþß\u0007üUu¾(!¹ĕâ(\u000f\u0002ö\u0084ÄY\n\u008b¿/ö\u009bQm`\u0011JTB\u0088¤-\u0087â¬\u0001ÇZÀ\u0005ÍT(M\u0019\u0098íçàX\r³öà\u009a'%\u000bµJÈó\u009ca*$èÀãW\u0091òÏ6\u0095@9¢\b\u0002Ø¾8\u008b\u008d2ò6r\u001c\u008dÛåü\u0011ËÖ\u008e24!\u009fçH_4³\u0086G\u009a\u00170.Ê81k æ¾ó\u009a§ßÆî3\u0097b³Î\u008d\fµiá\u0094éí8\u009b\u0007\u009fÜô\u008cFÄ\u0098ª!sí³é¸\u0002}\u0087?1\u0093\t0¸BE_Då!O\u0084þJ\u0096J>PÎÜÎtÎ9\u0002U\u0005oµ)\u0087v÷Ù&rÄ¢¸\u0003Þ¶³\b\u009f :ÀË\u009f¸Ð\u008eu\u0084\u0003ß`\u009b\bp}\u0017HG¦\u0091\u001c\u0080U\u001ceÈ\u0090\u001c\u0005Xé,Ñ>$ísmÔÌ\u001fÌQ\u0002&\u008f\u008dÃó \u0001]\"G{ï]+#ª-3ðo\u009a`\u008e\u008fíö¶\tS\u0099ø\u008d\u009d\u0011\u001a*j\u0002¥¦ÎZ\u001d·\u0088\u001cT\u009d¤¬¢\u00061\u009c\u0088\u009eÇ\u0000\u0007\u000b08óÒ ª\"\u0084\u0095¹;\u00adÿÊ©\u000b¨pí]Ñtx\u00adj\"»´þçc\u009dÒÆ³þRb\u00adô²\u0010ºu\u00904\u0089o0\u000eâD\u001aIçg=Æ\u0006\u0098e½ aæ\u0006E\u0099\u0006\u0016\u00169\u0007%ì0í\u009f¯\u0096\rô\f\tuPÌé \u0017²ÅÐN\u0007£ÝZWÓ\u0013è\u0006Ú?!`\u001dm\u0003«dî\u0006\u0080B¾l\u0001W¹¤xÇ\bïÙ´;zG\u001b6Å\u0013AÇÍÈ!3\u001bÝÞ)\u009e0\u000bOuU\u0016¹\u0087y½f\u0099ÜìK¸7n§¬¥;\u0088¿Ròáý-\u000f1\u008eÊí^ª\u0013\u001cbopê\u0005Æ?¡(\\lYû:Iúº\bq\u0089fh\u0016Al\u007f ¶\t ¶Cyì¢@×4ý\u0091g{ì\u0083¡w#*}\u009bMnpßË|ª0»2!\u008a\u001dÊrÉ\u008d#j\u0091~ßþ\u009ctxÂYRÃ.>\u001b\u0091ì1À\u0007\t\u0099ê\u00920ÏåRZ\u0006½Û\u0095 a\u0001\n \u00ad8²\u0010\u008eWÞÊ_ ~Y[D\u0087´\u0006¤@:\u0005\u0091v\u0003\u0018û\u0098̞Ïµª±Bî\u0001ÝÌ\u009bÍ\u00ad\u001f`\u001a©¦\u0005L\u008a¶êkÏ(ìÝÔ¯&M×ì´Ðß4ëY\u00ad\u000eë¸<vÖ`æÔ\u009f\u009fXP\u001aº×8\u0016;Åp`G\f\u0004½\u0087¼x\u0000\u0001ÍÂ»RaÐ\u007f/îÉ\u0011ÒìHL|UáêN\u0086:tÿXF\u009b×E|qBÕØ¥-=y\u008aq\u00152ñ§E½Ì#\u0086ÖV\u0006\u0004\u0080uÈ]Þ\u0019\u0017\u008d/zI¯1\u0082\\?\\ÿ¢Â\u0094¾ÎjîL^BN~qý\u008a\u009a\u009bµd\f¾%îg§\u008f)*Zà>\u0019¼~^N\u0011à¤ëIÌK!¦\u0080f®ö´í8³ôBÌ©\u0082\u007f_\u0004¨ºVs\u0004Ï\u0010ÜWeT\u0004\u0085µºøHÄ\u0001?Ò%R:h\u008d\f¦4ãìü\u007fz$\u0080ì\"Ò\u008dÚÆ~\u0088(\t\u008aGÃµ\f4]Ìëh£zuðn]\u0091\u0013\u0000\u00809U]\u008apå©\u009e\u009cÐ\u008a\u009c°³©½u\u009ev\u0001\t\u009fî³u¨\u0098\u0017ßJúq\u0099ÌJEªë9Ä\u001d\u001d\u008co\u0014# ªäoïí\u000eY\u008f2+\u008bôãè\u000böÄ\u008a\u0096dæÕ9ÄéeÊqèL¦I\u0013uÚ\u009añ±$òt\u0088Û\u0005¡\u008b®×\u0092Í\u009b0jÝÜã\u008feKf\u008cÇOIè\u0092Ý\u0096ý\nË\u0099£\u0019ê´Å[O,\"Omçg\u0017\u001fã\u001e\u0089\u0019Á»ý\u001fÛ|gO\f7é\u0082¢L\u009bn\u001dBRÜV1-û4\u007fÓ\u0003M*5\u0085Ü¹GÉ´0§\tI7àgÌÆKJW=h|D2\u001fÝ2:\u009cm\r:9\u0089Ð\u001cÐa\u0010\"\u008c¥¤ýv+óË\u009f §\u0004Âgb\u008ed\u0010íc`\u009cr_\u001aåv\u0088\u0097ô\u008cSwâJg\u0004á\u0099Ç¦ä^o(ôø\nÅä_íd³\u001c\u0007©Òw\u0096Â\u0003cVLhE\u008beª\u001eë\u001aò¼À\u000fû\u0003¦WCÊ³íÒ\u0083\u0096ø\u001d\u001fSË¶õ\u0096J\n\u0098\u009cÌ\u001fº\u0012\u0089t0_ÈO\u0096K{\u008e\u009c^uT\u0014R\u0000\u0096G\u008d¯\u0093ÅpÀ \u0019êæ¿Å-v#2¿ÜOW½ä\u0081¿\u0005²}xª\u0018\u00158\u0082\u000f\u009f¯_õ\u001b\u0097²_º\u001c\u008as,¢¸Qiics¶KP\u001a×\u0091\u0098\u008bÙ÷2&µ\u0003\t¯bGñÙ<b*J\u0094w©prÇ\u0089\u0093\u0093¸\u0099ýRgÑß\u0097ÒÈìM\r\u0093ïd-¡vpÏ@¢Í\u0086Ã¼¥¢Ëñ\t$¯&~d\r¬\\\u0001R\u008fÔ\u0091B-\u000fÂÏ£\\\u0004\u009c\u000e\u009dJ@\u008b\u0011\u008c¶Ey\u009aO\u008bö6¹èÎ¸ë\u0012à\u0001þ{\u001a¿9Ùè\u0010/bgB»\u0014_c\u0083{¨&\u0015(\u009e\u001eË×\u0088\u0084\u007f)5]~âȋ6Æ\u0095ß¥#ýdS¬>Ka¼Õ2_vsäQ'\u0097v·Û.2Ñú\u0082L\u0015Çï±Ó&¥\u0014\u0091ÜKÚ\b\n¯}-ì 6·×Fn§!È#\u000e¼\u0088\u0097ýÎ¸Ò\u009fÍýt]\u008c¡\u0087®¥÷o6º_\u001a\u008cobjUU,,iº*c\u009d'³\u000bX[T|Î\u0081õÃ9a?ªa¹\u00120WÞ¡ÖÛXATEÚ\u0092ëª§-,ì\u0085q\u008c)\u0086ý\u0099¿Ã\u009b¡jÍÚ¼ªe\u0081è?g\u0003HbAç+ÆæwE&ú\u0012³\u008dÚ\u008d^¦\u0011\u009d!L+í|\"H¤\u0082\u0006\u0098øÅøwÙÒ>M\u001dà¡ð\r\u0017Zõ-°ìåß¥\u00862\u0090ª,R\u0090\u0092Z\\ÎxÔ\u0016f\f7<\u0001Ó´ÅzwæÜ~CW!èÈ#\u001er\u0015n`+\u0092F\u008að\u0016±á\u000458±E6FúÍHbNjçÒ6Î]2d\b¾¤\u000fë¨\u007fùÑ8.È¿ýa²\u0011\u001d>7¨\n)F2\u0010\u000f\u0002\r|¦\u0084\\\u0007\u0085-R§@â\u0092\u000fiàÍÄ Â9Ñ\u009c¦Ëµ¾\u0018\\\u0016C½¾×\u0018w?ëð§Zð\u0005ähÉÛ4´í¸\u0089AûR?¦ÙÓ/¢\u008bZ\u001c¸i\u000e÷/Öxà\u0093\u0086\b³\u008f¹ª\u0019\u008d\u0093ö[ý6¸ÓÏ1ôÎ\u0000\u0012Õ\u0098Q=s\u000fSªvÁ¡Ô\b\u009d\u0016k\u008bm\u009d\u0091´9\u001e°ÍÛ[ya9¶tî\u008f_)PxTb8¯i\u001egÓ3Da\u009dôø\u0093ðò'B\u009e/t\u008b\u0096ñ¼ÕÝªdk\u008bx©D8g\u0087ØäÓ°yh2\u008d\u0010<v\u0002»\u0000ýµFa\u0088¶1nþt\u009b\u0092%ÛuV*G\u0098k/jò\u0095\u0017²\u0012e\u0089\u0003\u0097«wD½\u008f ħ¾æ\u0084Û\u0087¿ê>Ïg\u0007²á(³\u001b<ßÁ\u008d3³\u008aJB\u000e\u0014\u009cÐé\"s\u0091\u009a£\u0094h£Ã\u0080%´µ.áSxQyÅ>\u0093¹È²\u0006ïÈP]ôäs\u0084\u0093ø\u001e\u0099H\u0099&e\u001dR\u0080\u0016\u009a\u0081\u0010@.Ò\u0006\u0002\u0094Ç?¬\u0013b\u008a©6,\u0005>\u0003ú8_6¡9Wë&\u0080¬|\u0013\u0004È¯T,\u0006·Õ\u001dð§_v\u0010\u001b\u0006\u008b\u0097È'fáê<±»1`þY\u009c\u0011Ö\u0006\u0099v¿`C\u0006>xOw¹\u0003RQ-]¼\u009a+\u007f\u007fâ\u0098G\"\u0019$àN«\u0080uü\u0092\u0098E×±$Ô\u0099C!\u00ad£fÃ>U\u0006`ªM\u0090üw\u0088WXèç\"ûu©Héþa\u009b\u0018\u0080J\u001dæ3¹|\u008djÓ£8/Ôà¼\u001c{¿hàÕIö\u0013i@½eïâ ÏSßâ©M¶¤~Ö*t\u008827S¿à\u0011Lóõ§¹\u001feñ/PMHL§DGè+×Ò³Z\u0086x\u001b Åß=ͨ\u009f· ñ\u0003æ)ÜÉ»m©\u000bà\u0098¹ö\u0007FÊ÷âCÎ-Ì}Ð»¦ÏÇ¼¶Ú\u009fuãq¬\u000bË\u00188bVâö\u0084\u009d\u0095\u0018\u0011\u0012\u0092Ö=6\u009bÁdàÅ\u001cT¿\u008dü9\b)ÌÇ\u009bòeÄü¥ó\u0091\u0001ÊM:,9\u0082p\u0088E\u0011F\u0013ÏÙc$.µ»Ø\"ÃMxG3íqegîH Wq;\u000e%-Ø¢\u000e\u008c\u008a\u0091½\u0003ò\u00adÅ\u0005Û%\u0005£÷¬µ\u0095X\u0083\fÆ\u001bG^$7!°E#i*ÞåÌfÐÏûçÔÈ4Q\u007f¹¯ñ@)æ%2\u0098B\u0004²Éu\u0083\u0092\u0091XÍ¦ùy\u001fT5ð ¹è\t\u001a5\u0096Í~v\u0085È^¾þ\u0016\u00911\u00921\u0088o\u0012\u0001\\'¿j¾«&n'\u009a}\u0006Óíäu,vÎÎ6èã¦\u0087ëñh}vy´©1Ù\u0018<\u0017_\u0089ëþ\u0017Ø\u0013Þ\t?(\u009a\u0001-Úìxq0)3ý\f²mÆëÏ\u0087°ÓúDX\u009cÓùzÓ\t`\u00100*Gª½p õ]½G©ï\u0001(i©\u0080\t56]\u008f©\u001d\n¤uLçó\reBÿø3;é2xQ\u0097cð\u0080 \u001a\u00137i°\u0083÷5\u0080<YÇÇÆÿÍ'ðä°èPS *}ë\u0093:e\u009då±P\n\u0000\u0014\"\u0096ÊÓ'\u0014±Z?K\tU$°\\þÉå\u0018\u0083á\u0012F\u0082eô×H\u0080\u008f·\u001dÈ¤\rAÊ\u0084\u0096úÊÆlÏñÔ R¤\u0092ßR\u0014v§Ù\u000f$á\u008e\u001dñP¦\u0002ÈÐä¿D\u0088Á\u0013Ô]\u0090\u009ef¹\u009aÄáruê&ÿçdû\u0099§yôá¢\u0018\u0015Û\rfj\u0014\nÔ\u0085¯q»Ý×¬ Ü\u0007zþäë\u0012+Ìdû÷©\u0084³7\u009aØT\u000fR\u008aJ\u009e#Ô\u0095_Ù\u000f2\u009cBí²ôur\u0091I\u0007ñ\u008a3½öñÉÄp»âI[=³ÍvU\u0088° *,\u0004jÕh\u00adöüÝs¥i\u0080øY³\u0086Jõ^E\u0082ª¼j\u0090yÊf#\u001d\u007fu¨TKÑc\"\b:\u009b\u000e3-X¢\u001e\u0081\u008a\u009cÿùºõÍ\u009eû?\u0003àuÄå\u0098P/OºpG|\rÚäL\u0004À\u0082ôn\u0099ÚæP&»v\u009d\u009b\u0002x@£4q\u0091ôv\u009e\u0083\u00ad¡\u009fÌz<²ªl>\u0094,]Î\u0097Üå@ø*_ZºC\u0001Ì~\t2\u0084\u009eï\u009aÿ¿Àð-ÆÏ\u008e\u0015\u000b¸Q+#$\u0094ÄT-\u009dK³\u0087JôSd\u008f¯KÖà \u009a1\u0092h¡\u00ad#o-îIÃ.LKÀ\u008féêÞ\nB\u00144¯\u0018=³\u007f=ïHÌ,\"~[Ð\tËx\u0012\u0016©\r~\u009dÊ¤\u0082ÝrWQ»=Ió\u000bv¸\u0088\u0003 \u000b\u0014®¾ÑÀÀQ;Ë[Ò=\u0082ÌPV6ÏÑ\"sg\u0082Ð-\u0010[¯\nX~eút5\u008eIí\fªz\u0011Ob\u0094K§±\u009e6=ú£H\u008f@ñ\u009ePîAÁ¼W{ÖhÍÕð¦ý$\u0000íZq\u0096\u00adî²Ł\u0018dP\u008b\u001dµ¹\u007f¥OJ·H\u0088\u0086\u000f\u009a]\u0015Ý©¹Ù\u000b(&Y\u0099yI\u0017g7\u0018wÄò©\u0090ÁO\u009cø+HóMEßGêÃ#ÂáG\u0085à\u001dX]DF\u00905zÊÉÒ\u0093u$wzÍ\u00133!%T\u0088PÒR\u000eÍlíyJÇ¬\u009f\u008c0*¥xì\u000f¬«j\u0016\u0081\u000eÍ©Õ³1Ü\tÖøV-ßN±Íw;\u0015²¦¾\u0083n¥²±p6âú[H³\\&·î\u000eC\"ªa>\u00ad\u008f±ÁKìF\u009ac\u0015ä\u008e\u009c¹¼`àÄf\u009b7|\u0005\u0088IEu\u0080Oxþ×\u0096ú>cÜ+\u0093:\u008d\"¶ÈäFh\u0087ò$mG¶\u009ayý2¨\u0001ÎiûÕp<\u0019»~Fº¨\u0094ß%²¤º¨P\u0002ÎY\u0007Éýà\u00adÙ2èûï\u001c4ìåÜsÎJÎ»\u0090uþ\u0091Ø\u0007×\u0094t¤¤7!\\´\u0096¼\u001cÀôÐ\u0089\u0019\u001d=°ÏL{\tXÉ\u008e \u008c\u0094\u0081³AR?¸®\u00159\u009c \u0084Ì\u0087\u009fÊYu)GÔ´²w>ù\u001fjìm\u0019Ô¶Ç\u0012O\u0005\u0084\u000f\u0001\u0080\u0007\u008aá÷~'©üC]è+\u0003<@`'¦·ý\u007f%wÛ¸)\u008a4©ÕYei\u008fHfÿ<vör¿ð\u008fö~Á\u0095\u0085\u000fÑn°\u0001»\t\u000b\"¾ê\u0090\u008bÈúIZKà\u0006ïzSM¼\u0094\u0006´\u0013¢I\u0015H\n8Ù©}ãT÷Üû=\u0010\u001a\u008eÍ?\u0018Ü¥\u0015\u0001Â\u000b~Z\u0081\u008a\u001a\u0007Yð¿nnß¨,\u0014ðÑ U@ÞY§0tù\u0017\u0094Î\u009a\\\u001bB\\Q²ÐiØ\u001e\u0086Dn5\u0087\u008fAí)×Æè\u001d¥Â²\u009c\u001c\u000b:i÷\u0081efÉ×Iê\u000e\n^\u001bJÔ]\u0094\u009e\u0095þH";
      int var4 = "Êq6\u000e\u001aó\u009fß\u0004[«\\\u0010\u000bq¦´O\u007fè\fù\u0004yA\u008bf°æǚ\u009e\u0010\u0080\u0005\u0007dúEÍ\bG_é\u0095²¬\u001c)ÅS³h\u009a1@aTqØT#Ä±l§JèxÓû'ÛõÃéîyæY3:M9\u0013¢}í§\u0010°üYr3³\u000e\u001aGÈB6\u001e\u001f=Àû\u0092<\u0011÷\u000f$\u0003Ü4\u001c+×\u0091\rÚD<\u0091D\u0089+\f=\u0081\u0096z-,iIÐAv®E\u007f\u0087¢)Ø\u0017\u000e\t\u008b%0&ý\u0011»Ê àÑc?Jç¥À³\u000f®´\u0085¤\u0082²\u0099\u008bg¿Ó\u0098¯7lºÒ\u001d\u0092\u0097ã8jFRÇ\u0004ím¨i$~\u0083Ø¨R\u0015¦\u0082\u009f\u0091 ^\u0093\u0092_\u001bÍ\u0014§³¯QãR\u0095¬âH0\u0014\u0003\u0014{(Ã¯dð;\u0005È\u001c\u0014ÛÉg\u00ad\u0083YL,\u009e]\u009a·ï\u0014ô´\u0098Ú\u000ey.~\u0012\u0096\u00055\u0083©w96íÈóêÚD\u0001\u000e¢#é¬ÊC¶§\u001dÆ \u0000ïIçËb±øîÖÓó\u0089^&\u0092\u0083µSÎm0u;¸¶ç\u001e\u0093\u001b%tu^fò\u0014\u0090\u009aÃa°\u0098ÎÝÁj\u0006\u0085ùfò\u0003\u0081\\)\u0085ÀÕ×\u0096ÈTÁµaæÇî]\u0005Öù\u008aÖc:´¹ß\u009e\u0001Òë\u0082Ý\u0019¦ß¸ÿ\u0018\u001aD\u008cÂ´b\u00ad[9rö[\u0016\u001c\u0002÷BÝ_¥ÁN¾±;\u0014x¨Ù\u0093\u009e\u008e¿Õ÷_[$¯¨¢\u0001\u009aT\u009f©Æ\"\u009fæº®µ\u000e~å\u0017ìì´n°Ê\u009e\u0017Ý¬H7\u000en\u008fÃ»\u008bR\u007f¯\u0084:\u0004{\u009cvÉH¾üÖ±\u0002\u008b\töÕß³#\r-&_Å bÈYÝ\u001aèD\nL\u0007E´ê\u0013Ï\u0010î\u0002\u001aÃÄ·\u0002\u008e<ÇBÌs×¯Ð\rÐ\u008f\u0017¶\n]\u0017ê\u0080I×\u0012ß\u0010J\u009a\u001aí,éñ%X×Ò\nÒ1LÉ\u0010«yûÁÞ\u0003}î\u001a½h\u00916|\u0007¥\u0006S\u000f\u0002\u000ft¯\u0004¦\u009bþß\u0007üUu¾(!¹ĕâ(\u000f\u0002ö\u0084ÄY\n\u008b¿/ö\u009bQm`\u0011JTB\u0088¤-\u0087â¬\u0001ÇZÀ\u0005ÍT(M\u0019\u0098íçàX\r³öà\u009a'%\u000bµJÈó\u009ca*$èÀãW\u0091òÏ6\u0095@9¢\b\u0002Ø¾8\u008b\u008d2ò6r\u001c\u008dÛåü\u0011ËÖ\u008e24!\u009fçH_4³\u0086G\u009a\u00170.Ê81k æ¾ó\u009a§ßÆî3\u0097b³Î\u008d\fµiá\u0094éí8\u009b\u0007\u009fÜô\u008cFÄ\u0098ª!sí³é¸\u0002}\u0087?1\u0093\t0¸BE_Då!O\u0084þJ\u0096J>PÎÜÎtÎ9\u0002U\u0005oµ)\u0087v÷Ù&rÄ¢¸\u0003Þ¶³\b\u009f :ÀË\u009f¸Ð\u008eu\u0084\u0003ß`\u009b\bp}\u0017HG¦\u0091\u001c\u0080U\u001ceÈ\u0090\u001c\u0005Xé,Ñ>$ísmÔÌ\u001fÌQ\u0002&\u008f\u008dÃó \u0001]\"G{ï]+#ª-3ðo\u009a`\u008e\u008fíö¶\tS\u0099ø\u008d\u009d\u0011\u001a*j\u0002¥¦ÎZ\u001d·\u0088\u001cT\u009d¤¬¢\u00061\u009c\u0088\u009eÇ\u0000\u0007\u000b08óÒ ª\"\u0084\u0095¹;\u00adÿÊ©\u000b¨pí]Ñtx\u00adj\"»´þçc\u009dÒÆ³þRb\u00adô²\u0010ºu\u00904\u0089o0\u000eâD\u001aIçg=Æ\u0006\u0098e½ aæ\u0006E\u0099\u0006\u0016\u00169\u0007%ì0í\u009f¯\u0096\rô\f\tuPÌé \u0017²ÅÐN\u0007£ÝZWÓ\u0013è\u0006Ú?!`\u001dm\u0003«dî\u0006\u0080B¾l\u0001W¹¤xÇ\bïÙ´;zG\u001b6Å\u0013AÇÍÈ!3\u001bÝÞ)\u009e0\u000bOuU\u0016¹\u0087y½f\u0099ÜìK¸7n§¬¥;\u0088¿Ròáý-\u000f1\u008eÊí^ª\u0013\u001cbopê\u0005Æ?¡(\\lYû:Iúº\bq\u0089fh\u0016Al\u007f ¶\t ¶Cyì¢@×4ý\u0091g{ì\u0083¡w#*}\u009bMnpßË|ª0»2!\u008a\u001dÊrÉ\u008d#j\u0091~ßþ\u009ctxÂYRÃ.>\u001b\u0091ì1À\u0007\t\u0099ê\u00920ÏåRZ\u0006½Û\u0095 a\u0001\n \u00ad8²\u0010\u008eWÞÊ_ ~Y[D\u0087´\u0006¤@:\u0005\u0091v\u0003\u0018û\u0098̞Ïµª±Bî\u0001ÝÌ\u009bÍ\u00ad\u001f`\u001a©¦\u0005L\u008a¶êkÏ(ìÝÔ¯&M×ì´Ðß4ëY\u00ad\u000eë¸<vÖ`æÔ\u009f\u009fXP\u001aº×8\u0016;Åp`G\f\u0004½\u0087¼x\u0000\u0001ÍÂ»RaÐ\u007f/îÉ\u0011ÒìHL|UáêN\u0086:tÿXF\u009b×E|qBÕØ¥-=y\u008aq\u00152ñ§E½Ì#\u0086ÖV\u0006\u0004\u0080uÈ]Þ\u0019\u0017\u008d/zI¯1\u0082\\?\\ÿ¢Â\u0094¾ÎjîL^BN~qý\u008a\u009a\u009bµd\f¾%îg§\u008f)*Zà>\u0019¼~^N\u0011à¤ëIÌK!¦\u0080f®ö´í8³ôBÌ©\u0082\u007f_\u0004¨ºVs\u0004Ï\u0010ÜWeT\u0004\u0085µºøHÄ\u0001?Ò%R:h\u008d\f¦4ãìü\u007fz$\u0080ì\"Ò\u008dÚÆ~\u0088(\t\u008aGÃµ\f4]Ìëh£zuðn]\u0091\u0013\u0000\u00809U]\u008apå©\u009e\u009cÐ\u008a\u009c°³©½u\u009ev\u0001\t\u009fî³u¨\u0098\u0017ßJúq\u0099ÌJEªë9Ä\u001d\u001d\u008co\u0014# ªäoïí\u000eY\u008f2+\u008bôãè\u000böÄ\u008a\u0096dæÕ9ÄéeÊqèL¦I\u0013uÚ\u009añ±$òt\u0088Û\u0005¡\u008b®×\u0092Í\u009b0jÝÜã\u008feKf\u008cÇOIè\u0092Ý\u0096ý\nË\u0099£\u0019ê´Å[O,\"Omçg\u0017\u001fã\u001e\u0089\u0019Á»ý\u001fÛ|gO\f7é\u0082¢L\u009bn\u001dBRÜV1-û4\u007fÓ\u0003M*5\u0085Ü¹GÉ´0§\tI7àgÌÆKJW=h|D2\u001fÝ2:\u009cm\r:9\u0089Ð\u001cÐa\u0010\"\u008c¥¤ýv+óË\u009f §\u0004Âgb\u008ed\u0010íc`\u009cr_\u001aåv\u0088\u0097ô\u008cSwâJg\u0004á\u0099Ç¦ä^o(ôø\nÅä_íd³\u001c\u0007©Òw\u0096Â\u0003cVLhE\u008beª\u001eë\u001aò¼À\u000fû\u0003¦WCÊ³íÒ\u0083\u0096ø\u001d\u001fSË¶õ\u0096J\n\u0098\u009cÌ\u001fº\u0012\u0089t0_ÈO\u0096K{\u008e\u009c^uT\u0014R\u0000\u0096G\u008d¯\u0093ÅpÀ \u0019êæ¿Å-v#2¿ÜOW½ä\u0081¿\u0005²}xª\u0018\u00158\u0082\u000f\u009f¯_õ\u001b\u0097²_º\u001c\u008as,¢¸Qiics¶KP\u001a×\u0091\u0098\u008bÙ÷2&µ\u0003\t¯bGñÙ<b*J\u0094w©prÇ\u0089\u0093\u0093¸\u0099ýRgÑß\u0097ÒÈìM\r\u0093ïd-¡vpÏ@¢Í\u0086Ã¼¥¢Ëñ\t$¯&~d\r¬\\\u0001R\u008fÔ\u0091B-\u000fÂÏ£\\\u0004\u009c\u000e\u009dJ@\u008b\u0011\u008c¶Ey\u009aO\u008bö6¹èÎ¸ë\u0012à\u0001þ{\u001a¿9Ùè\u0010/bgB»\u0014_c\u0083{¨&\u0015(\u009e\u001eË×\u0088\u0084\u007f)5]~âȋ6Æ\u0095ß¥#ýdS¬>Ka¼Õ2_vsäQ'\u0097v·Û.2Ñú\u0082L\u0015Çï±Ó&¥\u0014\u0091ÜKÚ\b\n¯}-ì 6·×Fn§!È#\u000e¼\u0088\u0097ýÎ¸Ò\u009fÍýt]\u008c¡\u0087®¥÷o6º_\u001a\u008cobjUU,,iº*c\u009d'³\u000bX[T|Î\u0081õÃ9a?ªa¹\u00120WÞ¡ÖÛXATEÚ\u0092ëª§-,ì\u0085q\u008c)\u0086ý\u0099¿Ã\u009b¡jÍÚ¼ªe\u0081è?g\u0003HbAç+ÆæwE&ú\u0012³\u008dÚ\u008d^¦\u0011\u009d!L+í|\"H¤\u0082\u0006\u0098øÅøwÙÒ>M\u001dà¡ð\r\u0017Zõ-°ìåß¥\u00862\u0090ª,R\u0090\u0092Z\\ÎxÔ\u0016f\f7<\u0001Ó´ÅzwæÜ~CW!èÈ#\u001er\u0015n`+\u0092F\u008að\u0016±á\u000458±E6FúÍHbNjçÒ6Î]2d\b¾¤\u000fë¨\u007fùÑ8.È¿ýa²\u0011\u001d>7¨\n)F2\u0010\u000f\u0002\r|¦\u0084\\\u0007\u0085-R§@â\u0092\u000fiàÍÄ Â9Ñ\u009c¦Ëµ¾\u0018\\\u0016C½¾×\u0018w?ëð§Zð\u0005ähÉÛ4´í¸\u0089AûR?¦ÙÓ/¢\u008bZ\u001c¸i\u000e÷/Öxà\u0093\u0086\b³\u008f¹ª\u0019\u008d\u0093ö[ý6¸ÓÏ1ôÎ\u0000\u0012Õ\u0098Q=s\u000fSªvÁ¡Ô\b\u009d\u0016k\u008bm\u009d\u0091´9\u001e°ÍÛ[ya9¶tî\u008f_)PxTb8¯i\u001egÓ3Da\u009dôø\u0093ðò'B\u009e/t\u008b\u0096ñ¼ÕÝªdk\u008bx©D8g\u0087ØäÓ°yh2\u008d\u0010<v\u0002»\u0000ýµFa\u0088¶1nþt\u009b\u0092%ÛuV*G\u0098k/jò\u0095\u0017²\u0012e\u0089\u0003\u0097«wD½\u008f ħ¾æ\u0084Û\u0087¿ê>Ïg\u0007²á(³\u001b<ßÁ\u008d3³\u008aJB\u000e\u0014\u009cÐé\"s\u0091\u009a£\u0094h£Ã\u0080%´µ.áSxQyÅ>\u0093¹È²\u0006ïÈP]ôäs\u0084\u0093ø\u001e\u0099H\u0099&e\u001dR\u0080\u0016\u009a\u0081\u0010@.Ò\u0006\u0002\u0094Ç?¬\u0013b\u008a©6,\u0005>\u0003ú8_6¡9Wë&\u0080¬|\u0013\u0004È¯T,\u0006·Õ\u001dð§_v\u0010\u001b\u0006\u008b\u0097È'fáê<±»1`þY\u009c\u0011Ö\u0006\u0099v¿`C\u0006>xOw¹\u0003RQ-]¼\u009a+\u007f\u007fâ\u0098G\"\u0019$àN«\u0080uü\u0092\u0098E×±$Ô\u0099C!\u00ad£fÃ>U\u0006`ªM\u0090üw\u0088WXèç\"ûu©Héþa\u009b\u0018\u0080J\u001dæ3¹|\u008djÓ£8/Ôà¼\u001c{¿hàÕIö\u0013i@½eïâ ÏSßâ©M¶¤~Ö*t\u008827S¿à\u0011Lóõ§¹\u001feñ/PMHL§DGè+×Ò³Z\u0086x\u001b Åß=ͨ\u009f· ñ\u0003æ)ÜÉ»m©\u000bà\u0098¹ö\u0007FÊ÷âCÎ-Ì}Ð»¦ÏÇ¼¶Ú\u009fuãq¬\u000bË\u00188bVâö\u0084\u009d\u0095\u0018\u0011\u0012\u0092Ö=6\u009bÁdàÅ\u001cT¿\u008dü9\b)ÌÇ\u009bòeÄü¥ó\u0091\u0001ÊM:,9\u0082p\u0088E\u0011F\u0013ÏÙc$.µ»Ø\"ÃMxG3íqegîH Wq;\u000e%-Ø¢\u000e\u008c\u008a\u0091½\u0003ò\u00adÅ\u0005Û%\u0005£÷¬µ\u0095X\u0083\fÆ\u001bG^$7!°E#i*ÞåÌfÐÏûçÔÈ4Q\u007f¹¯ñ@)æ%2\u0098B\u0004²Éu\u0083\u0092\u0091XÍ¦ùy\u001fT5ð ¹è\t\u001a5\u0096Í~v\u0085È^¾þ\u0016\u00911\u00921\u0088o\u0012\u0001\\'¿j¾«&n'\u009a}\u0006Óíäu,vÎÎ6èã¦\u0087ëñh}vy´©1Ù\u0018<\u0017_\u0089ëþ\u0017Ø\u0013Þ\t?(\u009a\u0001-Úìxq0)3ý\f²mÆëÏ\u0087°ÓúDX\u009cÓùzÓ\t`\u00100*Gª½p õ]½G©ï\u0001(i©\u0080\t56]\u008f©\u001d\n¤uLçó\reBÿø3;é2xQ\u0097cð\u0080 \u001a\u00137i°\u0083÷5\u0080<YÇÇÆÿÍ'ðä°èPS *}ë\u0093:e\u009då±P\n\u0000\u0014\"\u0096ÊÓ'\u0014±Z?K\tU$°\\þÉå\u0018\u0083á\u0012F\u0082eô×H\u0080\u008f·\u001dÈ¤\rAÊ\u0084\u0096úÊÆlÏñÔ R¤\u0092ßR\u0014v§Ù\u000f$á\u008e\u001dñP¦\u0002ÈÐä¿D\u0088Á\u0013Ô]\u0090\u009ef¹\u009aÄáruê&ÿçdû\u0099§yôá¢\u0018\u0015Û\rfj\u0014\nÔ\u0085¯q»Ý×¬ Ü\u0007zþäë\u0012+Ìdû÷©\u0084³7\u009aØT\u000fR\u008aJ\u009e#Ô\u0095_Ù\u000f2\u009cBí²ôur\u0091I\u0007ñ\u008a3½öñÉÄp»âI[=³ÍvU\u0088° *,\u0004jÕh\u00adöüÝs¥i\u0080øY³\u0086Jõ^E\u0082ª¼j\u0090yÊf#\u001d\u007fu¨TKÑc\"\b:\u009b\u000e3-X¢\u001e\u0081\u008a\u009cÿùºõÍ\u009eû?\u0003àuÄå\u0098P/OºpG|\rÚäL\u0004À\u0082ôn\u0099ÚæP&»v\u009d\u009b\u0002x@£4q\u0091ôv\u009e\u0083\u00ad¡\u009fÌz<²ªl>\u0094,]Î\u0097Üå@ø*_ZºC\u0001Ì~\t2\u0084\u009eï\u009aÿ¿Àð-ÆÏ\u008e\u0015\u000b¸Q+#$\u0094ÄT-\u009dK³\u0087JôSd\u008f¯KÖà \u009a1\u0092h¡\u00ad#o-îIÃ.LKÀ\u008féêÞ\nB\u00144¯\u0018=³\u007f=ïHÌ,\"~[Ð\tËx\u0012\u0016©\r~\u009dÊ¤\u0082ÝrWQ»=Ió\u000bv¸\u0088\u0003 \u000b\u0014®¾ÑÀÀQ;Ë[Ò=\u0082ÌPV6ÏÑ\"sg\u0082Ð-\u0010[¯\nX~eút5\u008eIí\fªz\u0011Ob\u0094K§±\u009e6=ú£H\u008f@ñ\u009ePîAÁ¼W{ÖhÍÕð¦ý$\u0000íZq\u0096\u00adî²Ł\u0018dP\u008b\u001dµ¹\u007f¥OJ·H\u0088\u0086\u000f\u009a]\u0015Ý©¹Ù\u000b(&Y\u0099yI\u0017g7\u0018wÄò©\u0090ÁO\u009cø+HóMEßGêÃ#ÂáG\u0085à\u001dX]DF\u00905zÊÉÒ\u0093u$wzÍ\u00133!%T\u0088PÒR\u000eÍlíyJÇ¬\u009f\u008c0*¥xì\u000f¬«j\u0016\u0081\u000eÍ©Õ³1Ü\tÖøV-ßN±Íw;\u0015²¦¾\u0083n¥²±p6âú[H³\\&·î\u000eC\"ªa>\u00ad\u008f±ÁKìF\u009ac\u0015ä\u008e\u009c¹¼`àÄf\u009b7|\u0005\u0088IEu\u0080Oxþ×\u0096ú>cÜ+\u0093:\u008d\"¶ÈäFh\u0087ò$mG¶\u009ayý2¨\u0001ÎiûÕp<\u0019»~Fº¨\u0094ß%²¤º¨P\u0002ÎY\u0007Éýà\u00adÙ2èûï\u001c4ìåÜsÎJÎ»\u0090uþ\u0091Ø\u0007×\u0094t¤¤7!\\´\u0096¼\u001cÀôÐ\u0089\u0019\u001d=°ÏL{\tXÉ\u008e \u008c\u0094\u0081³AR?¸®\u00159\u009c \u0084Ì\u0087\u009fÊYu)GÔ´²w>ù\u001fjìm\u0019Ô¶Ç\u0012O\u0005\u0084\u000f\u0001\u0080\u0007\u008aá÷~'©üC]è+\u0003<@`'¦·ý\u007f%wÛ¸)\u008a4©ÕYei\u008fHfÿ<vör¿ð\u008fö~Á\u0095\u0085\u000fÑn°\u0001»\t\u000b\"¾ê\u0090\u008bÈúIZKà\u0006ïzSM¼\u0094\u0006´\u0013¢I\u0015H\n8Ù©}ãT÷Üû=\u0010\u001a\u008eÍ?\u0018Ü¥\u0015\u0001Â\u000b~Z\u0081\u008a\u001a\u0007Yð¿nnß¨,\u0014ðÑ U@ÞY§0tù\u0017\u0094Î\u009a\\\u001bB\\Q²ÐiØ\u001e\u0086Dn5\u0087\u008fAí)×Æè\u001d¥Â²\u009c\u001c\u000b:i÷\u0081efÉ×Iê\u000e\n^\u001bJÔ]\u0094\u009e\u0095þH"
         .length();
      char var1 = '\f';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 121;
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
                     case 0 -> 122;
                     case 1 -> 88;
                     case 2 -> 33;
                     case 3 -> 94;
                     case 4 -> 97;
                     case 5 -> 65;
                     default -> 55;
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
                     c = var5;
                     d = new String[46];
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

                  var2 = " Ü\u0016Ý\u0094\"\u009a\u0005þÁÊ§¾`nèIoû·4\u0018y]~íó¿zR\u0098$¾A\u0003Æ\u009f\u0086¢\u0096hÎ\u0005\u00adê|ù`\u008c\u001c\u0092¼\u0016ÁX i«B0\u000e¼ËÆÆ±Û®\\\u008c¼\u0012Q\u0081ÓåP0\u0094a\u0099e\u00002ÛÐðJ]^gß\u0017?\u001d[\u0089\u0089¬/Ö>mI\u0018\u0096î\u00ad\u0086¢ñ\"áF[Ã\"KÚµ\u0097Þ®\u0006gR\u008d\u0011Úq\u0083s-y±ë\u009a\u0098 Çök>Ê\u0086~/¤kÜIoªn?å¸à\f\u009aw\u0084J\u0095\u0016Èmþ\u0002b\"AºÚäG¯x©\u0014³ ¡4#ÜY¦}è\u008e\u0096\u0081\u0091'þð$Ú{çE\u001ac\u0085µ¨\u008eAY\u000f/zM\bdi_·N_gy&B¡¢\u008bVR\u001d£\u0001¡´ÀÌò\u000f|¨«Ö\u0081Ú\u0088¢ÖÍ$/$v\u008bpÕ\u008f¼Õ½\u0086\u0099uJ\u0096¤\u0018\u001cºizÇO¯\t`ÜÆ\u009dü\u0099£\u001dÑÚ\u0002¶\u008a^á/ \u0094v\u0006uð\u0000ó\u0005éÍûUj\u001fûKÛt#D\u0093@ò`C\u000bá`\u0083Ð\u0084Ñ\u0085¡\u0089\u00ad9èÍÿ\u0019íÇ{dÉ¬\\\u0097|l!\u00071{\u001föë\u009fÐ\u008e\\\u009bUä\u0010cà|p×pgH\u0094©7¯^\u008fñÌ\u0010\u008d\u009e\u009a\u0013ü\u009eÚ\u0004ü\u0017|\r(¦ðj\u008c\u0097§-s)R\u0088Kù\u000fÌ\u0081hå#\u0011\u0019du\u0015¦ãy\u0001ij÷\u0093Æüñ·\u00adÁåO@;\u0018\u0010\u0002I×æ¿ë ½*\u0086Eù\u0088³i©î\u00816f\u008dO\u0016òR!Û\\û\u0015:Fø¢\u0091\nÇ\u0017,2\u009eFó$®jA\u009cÚ\u001d\u000f&\u0091Öt\u008c\u0017\u0099£\u009e\u0015\u009a,:\bÛÃ\u0006>\u0096^Ú\u008aêk\u0084À[\u008f|f3üìí\u0090\u001aL=\u007fÊá\u0011\u0015ÍÚÜ\u008c\u0000\u0018B/\u00136\u0097Jt×.\u008cDèl¶TûNùE!\u0001GK¯}\u0095^gåAÁnnTÅË\u0015\u0004äÊF\u0087ð~7çuËþ\u000e#\u0013t\u0015\u008féfò\u0089ifíò\u008c^¸ë\u009b\u0005¬c!\u0087r»ÍÐ¢\u008a+À\u001d\u0098=VCu\u0002 \u001eñ\u0095êbFLèeÍB-\u0099W½¾2§T²ÜÏ\u0093¸ßv²@?\u0085{r\u0012\b\u0014\u0098\u008aRàpÅ£sãyë\u0093MøÛ\u0012Ü\u001cåuÑ r= ÝX0\u009bOz{9¨s\rdc+Ì*\u008e\u0094æÚîdÅ\u009bûX\u009e§BÏ1ø\u0080ç\u009fV¼\u0096Lû\u0091\u0080y>¤1\u009cg>\u0091\u0081d©\u0084t=ï¢}´\u0084\u0083SÈ\u0082\u0017ÿ»\u0011\u008c~OÚ¦1\u00adúÉ@Yá\u008e)\u001a\u0082äÑ\u0087+'Ø\u0084Gi+\u0018&y\u0097p2\u0093\u0007ña\u009b\u00adØ;j\u008b½ZHù\u0001t\u0088´ÈÇ\u0013¥·\u009a[.-\u0093<zÚíþ\u000b\f%æåqÁhn\u0094Ù\u0094\t\u00145Ki[\u00ad°\u0014»Ñ\bÁC%.uÓ_0\u00ad\u008d\u0010T´\u00940ì\u0081atû\u0014ôåëbÛ\u009dL\u0084ÿ¢7L\u0098Ç\\³Ç)$M\u0083\u0018W\u0017ry\u001f÷H\u009a;ø\u0017!¦C\u0095ÅÏþ¯Fý\u0089\u0012L\u0018\u009cLâë¥n75'\u0098ô\u0011µExrÑm¯¡²;ù\u001fÓ\u001aaß\u009bµùî\u0004°ÛZM\u0019Õ\u008c\u0010ùM0¥\u000eÛ\u0090å\u0083Øo#íD\u00adgÈu\u001bê\u0089¿p2ÂÚ\u009a&\u0015\u0092;Z&ú¶Áp$ÛªÖ(\u009cS\nb\u001c¦ai(+[\u001e\u0007Èz¤ÓzÈáÔA[ñ\u000b=Ëüçj\u0085Â_Ê¼\u009eÃËs»åÒYì5;Øæø^6U\u0011H\u0089ôø\u0010¥\u0093ÁY\u0099k\u0007r\u0088\u0014\u008dÉ\u009f²\u0005^áfA\u008a~ÈÇXUj¯Í\u0015\u0092·\u0091NÚÇô¡pÏR'_«\u0081\fìý\u0082ß¹^\"\u0000ã§ýï®*h%Q]é\u009e~©\u009cjSÐ+\u0099ä\u0096\u001dy-^I;\u0002\u0098ò\u001b\u0015Ë\u0098 B\u001e\u0015\u0016\u008coì«ËìqÀ\u008c½'d ëUÐ×\\¬\u0012\u0081D\u0002\u000eT\bE3(½¤\u001aÇ<\u0003Å}þ~É>r\u0081æ\u0096x\u0002uL7à\u001aX\u0094\u0090\u0019VUUj\u001fÐ3\u009aR\u008c\u0094hÜ\u000bÖiK7\bã¶\u0019\u0004³\u0018(¿m{:*7{¢\b\u0015¬ßÓ\u00adã½=\u001aÚ\u0019Nl¸ïîî^%\n\u009aQQ\u0001Mîs\u0003Mõ¥ù»\u0090\u000fþ\u0018Ä\u009f/½oïÖ\u0090\u0081^\u0006\u0099¼\u009c=ûèp\u0011\u0006M\u00917£\u0082khm-½JÊÐ[^\u0081)qàâ\u0080\u009em\u0095û+w$_öux²Úxör\u0084\u0017Ñ\u001aþ3Í ï\u0081²î\u001dä\u0098\u0004@\u0085ã¹E\u0019#Õlû \u0002B\u0016Í\u009a&ð\u0098\u0086M\rÜ.üµsKÏ\u0084Ñ_è¼\u000eem³zÌ\u0014²Õ\u0094ö\u0095\u0005Ì¿i\u009dÃ\u0018\u0018\u008b\u0086¿\u000f\u0011·\\iûlÒT¾N³DãuÝ\u001baÞy\u009b\u0001ê(¸\nøúÌ\u0012¢Ü\u0001\u000bÆ N\u008a£?·7ë\u008f\u000bÜ§Ú©¨\u007fe°¶HÖa\u0003¤Ë\u0012v[Þï\u008d¢-#\u0087/(+àc\u0095ó¨¿¯IH\u0093FW¿¡\u0014\u0014«ù¢\u0092ë\u0003#ñèT\u0085G\u0015\u008ej(:g6\u0097\u0092$Ü@Ï©Y\u0093!O³Í\u0085A,\u0016«æ%°äñ\u0016j·$Ã¸\u0087k¿K\u008cGô\nÝ°ht:Û\u0098j\u0012¡Ý²\u0096\u001e\u0093ÿoú\u0083¦¯Äô\\\b=rö¼¼ú\u000fhZÒ[[®ü[Ø\u0002Zz¸\u008cdiõ\u0018¾M\u000eÈk'5e\f\u0016\u0088f1BXÙ\f\u000e?^U\u0086\u0084\u0087\u0093W\u001aj_sÉ[\u0002\u0094ÐÐTÍæÓ=×=+À\u0010ÀÜ\u0007»Êíø,®æ]\u0080\u008a/\u001b{Ú\u000eXB\u008aê\u009c\u001dÃH¥\u001aån{\u0007\u0084\u0099\u0093BM³m(ULF\u008cw\u009f[ùê)\u008a +#\u009e,W÷8£_<-»²V\u0093\u0006î\u0002 \u0006BY@j¹`¯TM\\í;\u000eòÁ\u0017´¿rU&âÞÈ9\u0089Õ¨ÏýßáÒ]U\"\u001dRa{ò\u0014\u0087ÄÛËø\u0014ÛÈmÇÚz¸\u00ad>H\u0013ì¾\u0085\u0080`´\u0005\rhgÈ$$ó¦\u000fìµh1\u0086ZÝè\u0010t\u0095\u0018VÑþ ¤ü}Ë\u0087½Þ?oÐL+W\u001e=\u0085Nãæ\u0014\u001bm\u001ar¢ôÉDÉ,\u0012\u0018èløÁ\b\u0089K@\u00123\u0097c]\u0010\u0001¨ÉX¯\u00166Ö9@òìõH\u0092@ð\u0085¦.Ñ}ÃPlNÆÔ\u0010sÁ\fÆV_\u0016Ò\u009e\u008bó^çèxTÍ\u0097\u0085÷Ã\u0015\u0019ä>\u0088Ïcª4\u0080\u0083»\fU#Ï N\u001c\f2µßÎ|RRD\nAÈ\u0092y+·\tä\u0017\u0097Ýkùèr\u0089ûæµg\u0002I\u008a\u000euë\u0092S÷\u0004É\u0084\u0001\u0090\u0000\u0002ï=d¥È^âÖé¹íÉ#P\u0088và»5Î°\u0086ä\u0099\u008cé°¿\u009d\u0001»aÚQ\u001d|&À\u00040 /R|BÎå¤úÂÆP\u0085÷\u0013¶\u0015\u0091¯n\u0096cÄìHOf\u00981(·\u0000\u0096|R.î\u0081£!|SÜðMúf\u0082\t\u0010J\u00882há³&OT©À¬÷uÿä\u0083B7ß\u0018\u00adò2V\u009a#2¦Ç\b\u0088á¥\u0084(áD»0òæY\u0096\u0094\u0004p\u001eò\u0091ë3¶ð\u009bt\u0091DÃ½\u0010Ã\u0017ê\u0099ÓÜÀw¦\u0088\u0017éÿ\u007f\u008f¹\u0084m\u0011B\u0098\u00ad¸ñw\u008esóÖCG:ç\u008c«ÐÒuÖWi\u008b\u0014mðþ[4[è\u0005¹\u0089Oä*mºt\u0083Iö´\u007fùJ\u007f\u001dÓÎ\fa]]© ®\u000f~\u0080£\u000bd¢4\u00ad\u001a¡azó |\u008f\u0007EÛ\u000eÂù\u0086Î\u0092Ô\u0089ÔÒ\u001ds\u009b»þé«``\rg9\u0002\u0082a\u0098tdnÿ}\u008aÑÛrEå\u000bt\b\u001a\u0097Ç ¦\u0094\u00881\u0010uî\u008d¾>\u008e\u0017\u0010Ò¿\u0000#@îþô¼\u009aü\u0083I\u001a»\u0018«õ\u0017[\u007fÌãþ8\u0006Q\u0080^\u0010LÁµ%¶×\u008d\u008fBz\u0000P¦©±\\\u0080\u0016öz¡Ðf4\u0002Ú¬xô\u0081\u0089Á~\u000f\u001d\\þÌÒë\u0010\u0013\u0000K\u0018¾¥d\u008c_ag\u000epN#\u0086$\u000eVm½ßJ.JcóãÔBÄÎð\u0084\u00902P\u000eRS«<å\u001dàK4?Ia\r£E½q¹êóÒq\u0095w{\u0086\u008d^O:isõ°¬T\u001f>Ë\u00ad[öS\fê\u0097\u0082-£¤=\f-(fK3tÄü%Çqÿ\u0080Á\u009b\u009e\u009b\u0013Ãr^öqG\u001eo+3hE¯&NZ¨ñ\rmyê+#(\u0086æØ\u0004Èá\"#\u0010TÅb/C®\u008c\u001b«Ò°(#Q;¦.,K.,¥:' \u0093Nï\u0018\u0091*h®èU\u0097{\u0087 ÆßD\u0087ÞÐ\u008bþ1»¯çãøJÇÕéøÕÈ²uTÅ\u009cjñ[l¶}\u0095\u0080(:\u008d ùÝ\nù2f?zåà'²E4\u008føé\u001b\u008c±\u000bh\u0085ai&é\u0088¶\u0086\u008e4l½×&µ¯Á\u001dÜGUÔ~\u0093p\u0006WÐoßv}\bÏÉÎN´¾?4¡^ ª\u007fH\u009fyö\u0080¢¼ò \u008c\u009dßî\u0097x\u001b õ\u0087}\u0087TjÚÆ×\u0086\u0011±©¿\u0080á\u0091\nÈÝmý\u0081ìzñKUµzY\u001bx½Û\u0097ðo\u0004ó×a^\bWoËJ·RG\u008f\u0098¿\u0017¼3Á/Jý\u0011k#à\u009cØ2^a[0h37ö\\q\u00adô\u009d9\u0090©\u001dÛò³?·oIÚËn\u00812\u0006\u0007ê7Ð\u0087?Ù=å\u0081'\u008d;if*Po'\u008c«\u008eI\u0091Y(1\u0094+ý\u0010Ñ¦\u0089C¼ÁNQbk,P\u0011.²8È\u0093\u0016»\u0098zöé^\u001fê>\u0093\u0087p~\u00142aÿò!\u008bcÝ\u0012t£¨\u001f§=¶0¥SB\u008c¢\r\u001a\u0080ÂÚ¥nV¹3Æu]\u0001\u0095\u0086\u0014 Q\u0011J^Îk\u009bk*u\u0086\u001f+~5Ì,G«Ë\u0095ñ\u0001\u0005I\u001a\u0011þÑ\u009cviáÎøð\tÀHì6ÂÖ\u001b\u001føcÙËóc\t\u008cQ <[\n!\u0098Ì±p~\u0098YÑùâ®KW@¿ç\u0012ÿËÉowÞ\u0010âñ\u0012w{b\tHïÕ*Töø\u0006Ê&ôRr,)ÂùmÞÞA¢:SÌT\u0090/2F8Ñ\u0001ª¿ÍA\u001f\u0083>_\u0087(yÿVüy«T\u000eÍ+Ç.\u0011á@ÆÝÑFN\u009aÖRñÐ¿ývp1\u009e\u0087¤+e\u0012 \nüê?\u009eí(,#°Ø\u0086â\u0010]YFï\u0085h\u0000\u009c%¦xI\u0099&¿\u0090\u0019Ö\u0007U\u001ezE{·±Àv6[Î\u0003Ö\u008fh:ls\u0092°dV¢<\\ã\u008dð-Ë\u0003\u0088^ÎÿØ\u0097\u0083yÙÌxI¾B¡?è¹\u001dWziåäñ-. }ê0\u00adG\u009d1{â\u00ad×jÁË\u008bf\nó\u0004{¼\u0005r\u008e¡då\u000bÅXîßX}\u0097\u000bÓd²p!ÁWG\u009f\u0090|\u009d\u0014;\"íN-[¥=è>\r/i½\u0005\u0010\u0080\u0082knËûLãÓ=\u0090\u0013^\n\u000e®ù\u0005¹ô)C;+gò(\u0019L`\u0097½\u0098Ílèó\u001e7yh\u0085M\u009e²À\u0099-D<ø\u0000²Û¸ý70\u0093Ú\u001aîZ\u008e¿\u0090\\ª£·Tþö\u0000\u009b¶É\u0081\u000b\u0094Ï\t~ç 4îñÝMà¿îp¶r>é'Ð]\u008c\u0089C\u000fñ×µÓá\u0090\u009b´ø¬KQZ3r\u0096\u000bøQ\u0093A}¤\u0018@ÂØâÁb\u009ci\u000eb·\u0092\u0081\u001b¼>se\u0006äÚ\b¹\u0091Å«Í\u009d\u009fíÚÜT\u0012=Te»r\f\u0097ÇÙ«¸\u0018ÓIl÷ú|¼m¾P\u0003ï¼åÀl¼\u0084\fXGÎ äs¾\u001fï·\bq\u008aR\\é T\u0093\u001c\u0096Qæ°§þ\u001d\u008b\u008bµ_>_ðJ/\u0097\u009e%\u0095Má\u0086T\u0017e\u009bs\u0092ÔÏ@\t¬\n\bën\u0098\u0081\u0004\u0081ÊA\"\u0013\u0091g\u009d\u0090\u0019¸ÊZÏV:Þ¸AÂÌóLRÀè\u0095¥,±=ÏXíOöô\u0016w\u0001\u008cÞF\\\u0014²Þ\u0087ûßæØXRÉW\u0005ïÓ\u0016\u001b\u0084~\u0084Çâ«\u0004 \u0085¿ÌÕ;ß#L|L>½^ÏLrT@ÊÁÐ\u0082zFÂb½á¬â[Ç>'×å?#eIHg3\u001f¥\u0099Mb½LùP^ \u0081YI4ËÐ\u0086\u0086\u0004ò\f\u0086j5Ç(oø\u000e¥\u001f\t7fk²£²t\u0098ÛÌB:-¢\bIß)`yÓ?{#øÇX\u001cJ¹ºó&`ÿ\u0018ÿM&ÉfS\u00882\u000e¤\u0097kb´ã¶¤=q,¦3\u0095ý?\u0015\u0002\u000f[?¥|áP,\u000b@þ\u008aòµ\u0010\u008cñ^D¼Ùà;S¾'p\u0001ï:ã¨\u000bGú\u001b\u009a)\u008aÎ\u0095X2ût04Ü;Î'÷}öJÑ¦\u0081\u0007}¸2I·Kýñ4\u009be½|\u0006ì¶ì\u0006(JËw\u009dDÖÉk¤e,ù\u00189\u001a8ÆQ®±¡ó4¦K1\n¦\u0018\u0085Â\u0005à\u001dhà$æj8hÉÔîÝbF\u001d]ÁO¯i¾\u008d\u001fN\u0094jàÜHá\u0088óE±\f\u0010\u000f»wV<\u0094\u001dÂ(ÐS{\u0002%ËÝ-^\u0097Óê©\u001eU5+Êâ2d\u0092\u0000\u0082U\u008e½ñ\u0095©1rã\u0000A\u001d\u0001Õ~f±Ìy@f«¡s£q\u0090\u0096*B½ç\u0097$\u0019a¨¤¶º\u0080X\u0096ìXÄ~]û\u0090¡\u0089u\u0017\u001aÌ)|\u0088\u0094Ï\\bÞ\u0093Ës¼ñ\u0015\nQ\"·\u0005u!\u000b¥Ê:(«õ^Ay d¬¶L\u0087\u0083\u00ad¥\u009b\u0019\u000ee\u00975úçò\u0081\u0018zÊ\u0099\u0016¿a¹>Ó\u0001è\u008eé°\u0006|+dl«Úf©`*Ûÿ ÔSA(\f_§N\"k¡\u009aO\bqKvþ*x-\u0085¼Å\u0011\u00897J\u009d\fYÒa>#KÓ½»gÍ6\u0087bÕÑõ6\u001e\u0083=\u0007 \u0094;\fs\u0085!íl\u0016Í®£Í\u0092\n/\u009a÷ÖrL¦\u008c3Þ:\t!TÖ5¤¢Ý\t0\u0082ã5dº.b{ÝÙ5\u0097{7/\u0089jÀ\u0091t\u0088\u0014¬\u0095Ï\u009a-\u009fÍ¶2d}Á\u001a¢þJ\u0090CeìD¸ËÎª\u009cn-\u009d\u001fðÂ\u0085\u0095vÔ\fb½\bÆ\u009fïfw&Ð\u0088ºÕ]¡<÷t\r\u0014û\t\u0094vò\u00874}Ú==\u0091Y®Û\u009aT(¥`pO\u0013;aq\u0017öv8\u000b\u0098á]\u009déo\u00ad\u000bÃ\u0019¤\u0096\u0093\u001bLo)g@|\u001b\u008dV¯Uàës¢\u0002V§B s}Ð\u0092#\u0002#Æ\u001ax \u008c=+y.¸±C!¯\tmL\bOÊ°MÕÝEJzÎ\u0005¥D\u0017å\u008b\u0003ã\u0081* ßH\u0013 1é\u0005z/«,¡\u008d\\¶\u0003i[ÉÔ\u0004\u0082Ý\u0017\u0090\u009c\u0090{ó,åTù\u0090\u0084I\u0087îßDØ\fSM\\ZÁ8@r¹Ä{¦CvÉ\u0086åM[\u0011<¹óþ\u007f\u0088\u0005¶\u000bZ÷ø<(T¸þY¯bGQ²_\u0010ç]\u0090Lô$êP\u0016Ö\u009f\u008bÇ\u0013\u0092ú\u0082ã\u008e\u0089ñ»¦Ln×ÿvSW n\u0093\u0002NÐÌlf>\u001fI\u008f}ý\b8ì<\fc´P\t{lâÔ\u0097òW×³ì´®MìÙß\u009d,7àÇ_¦<ó4ã_\u008a,½\u001c8haLÐ\u0094ÕáËEÏ®TÊfÿª?®ýòLÃ\u0019\u008c\u008c;HiÍï0,\u001cÍ;\u0085\u0098Å\\³üýy_£U§l¬ÑÈ*\u0018\u008b\u009e\u0094ÓÚ·d$çæ©\u008b*Õo$Iç*1yô)è¸Íä1ÐZ8ìbpú\u009d¸ÄM\u0005xÌ&Æ)\u0098`\u009b±D\u0097¾(KP,&µ\u008eÛÒ1lòÄ\u008e\u0081\u000fÁÁ:¤ä¹\u007fq0:\u0080<\u000e÷Òþð\u0006\u0016aÌh\t\u001a&òtÂózP\u0090\t\u0010K\u008e$|ÕcÛ\nû¸Ap\u0019ÔXÍIÀì¥¦îC\u009cÏ+[\u0083¯üêK\u001aÖº\u0083Gõ- $g\u0002!^ö¨¬LÁ8°MjAèÀ²¯Æ6Ì8\u0003æ\u009aÅ[(:\u009eÒ\u0016³\u001bY§é\u007f\u0097¥®QödWpüÍªAª\u0017\u0010é2\u0099/7+8»ªì\u0006@\u0013K\u000fðÚ\u0085\r\u0083$ÿ\u001bt!kêqì\u000fè¾Í¡<_¹\u0005\u009c\u0081óiïâÈ.\u0082\u0014\u0099\u00adk\u009e$\u0094\u000flµ\u000b\u008f{\u0083ú0¢\u0086í\fc\u0013#m\u0013¤\u0083·\u001bï³~Msô\u0098\u009fûdiØ÷.Z\u0089Ò\u001fÒ\u0007\u0018Ú\u0093\u0099\u0001êYi.E¹.\u009c\u0080ÿ\u0087ä\u0011N½R\u0002\u008f\u008f,8Åâ7AY,\u009a_j¶\u000fè%,±þJ\u009bEbÅ!|n\u0090\u001eUôUG\u007f/Az¯\u0001\u009ba¯ß\u0011\u008c\u001bl·\u008a|o\u00adFÛÇ é\u0013JÒÕ!\u0098ÍÌ\u0097\u009b\u0015ø÷G¶Qéô.ØbDîk\u0018D?Wç\\ Ù\u0000:MÙ«X<Ã\u009d\u000fW\u009bÖM\u00ad+ÿ¼\u00175\u000bî÷K<»_æü^¶\u009b>3!îZêNn7ô\u0014ßìO×\u0085ûÛ\u0004\u00ad!'ú>\u008bcüòQR.\u0002\u0015uÎÝFÂxUeßb[BmØ±\u0013\u0003<ýý¼pOÅ\f\u001e\rü\u001eÿ{Â\u0090\bV\u008c×^\u001eê\r\u0005\u007fN\u001b½?¡Ç7zb«n»õ¤?¯\u001e¦Öô°\u0006Üe\u001ac¸ü6ë\u009dï@qIÖ¯d\u0093C\u0089ø\u0010kY\u009cØ\u0013SùÂ\u009fùùå®\u009fàî\u0083\u00ad=\u0018óçº\u0090Ú\u0081Éy\r:\u007f?¡`n\u0089¨3V|\u001bh\u0016P\u001c9£«è\u009eSR\"±q\u001e_³Ðç\u001b\u009c\u009b\u0012×Âx\u0085\u0017sS\u009dñìûÖ \u0012\u0016\u008aJÊr6õ<\"ô\u0000Z\u001dïDú%çsû²Â\t\u008bb\u001fÛ¬04ËW«§\u0000k³ÚúÐ§\u0016QC\u0085\u0092#[\u0013\u001eòüý\u0098ë9¹J¶ÒÉ3\u000eZ|>ÁÉ\u0001\u0016F\n\u0006Ò\u0017=Q\u007föú¼1\u000fgH\u0083G\u008dõRË\u0094ÆAÞFÄ\u00802R\u000b\u0014x§\u009f/o\u0099Ï\u0012&\u008cÆ\u0096PmRHù\u0017DñË\u0090\u0083\u009f\u0093Ö[\u0000¼!(xU\u001eé+¡k\u0015®j(:â6\u0003ñ\u0017±£\u00ad÷\u00148©Y¡\u0002¤\u0010\u000e¶S)\u001e\u0099ê\u0015\u0099\fã/)\u0093¡\br\u0082\u00194½\\_>\u0088\u0017ï|\u0083wå\u009fP\u0003!\u009f\u0096û\u0099×\t:,=w>ü\u0089ÍÍ\nÙ}þÆò\u0097c*5sW×qÃ·p·£\u008b2;Ð·«ÞÕòìÇ\u0089¶D[Kà\u009f\u0014²3l¿=*ÒÊ$/F\u0097Ñs¼0\u0082\u009di*%\u0004\týgõ2)üÚ}KÃ1\u0006»\u0086\u000fpD\u00940è< ©\u0010©)õ\u008aB\u0014\u009f;xG}\u0092é¥ìdÒ¢\u0081ÌE\"£/ã \f*Å\"ùéB{\u001eöË\u009fÔ\u008eÀ×_ü\u008bì\tÆ¹\u0092hÇ\u000e\u001d\u00ad-(T\u0086ºj\r\u007fåEÎ§¿\u001c90÷Cª×\u008ekT\u0001\u0016/ï\u0002½\u0014eéÞK\u0083\u0010q¯Ö\u001apMC<x*·\u0017m\u0017hhÒ.X\u008f\u0086þY\u0089jY(§³G\u0094ÛaBr\r#\u0091G]¦£/¦ÁÂÇ\u0086!ð\u000e\u0083n|¦Êª.S°õ©\b0«z{ä«\u0093md\f\u001cY\u0013:Í¯gùÏ¿s+\u0017\u0086^\u000e°\u0019R<M°\u0010«V6Ã0·kÓ'«37Õ\u0097a@©$¯Î}ÜæbÈ.n¾0\u0000\u0002ï\u001d\u0010\u0001BdU\u009c¢+\u0006ÿ3\u001b)¿i\u0096ä['q¬\u0095 .H\u0087'+è\u008d\u009eòh\u008djé\u0095b£\u000f\u0099x\u009e\u008bÓ½.D§ÿ \u000e MlQ\u0001\u008d:FK\u0004=)\u0003¯âcF¢;\u0004ù4_m2Å\u0082ÜÙ&Beú~\u0005\u0091æ^\u0083Ç\u0092{ZÐ\u0098ú(â[\u008eç\u0090c\u009c.ù\rcÖ\u0006¯°F\u0081E\u0096qU\u008bèÞFNNxÐ\u0094î!`P¥>0½GxTµ\u008e]Údê)a\u001b\u0083¢MK´\u00006)\u0090¼\u001aÖî§\u009b¢ê\\\u0000v£\u0086\u0003\u0097`÷ÜM\u0010ðÇ¾\u009c²yõ/\u0000hî±å\u001bN¤»\u0012ÇBpÓ\u0098.úMçxãÀSÜhàV\u0084\u0080Ï\u0085úU3$ûuü\u009e%\u0089\u0096uxÜ\u0000ýèq®þ\u0090\u008b\u00adª$Ðè\u0086\u0012ý¥ÿà-w×\u0098¢jUàRóàpQ\u009b:Þÿ\u0089dÄI\u0012öaÜf\u0016ÃK.(\u00ad`9º\u0094µ¡E\röä³¬UúäWg8È\u0011æü\u0005¿\u008ajþA´mèÚ\u001b.üz)J\u008f5ÿ\r;®\u007fÃNè\u0011\u008d3\u001e\u008e\u001dÝ\u0080;\u009a»*\u0094ùLDQÌ5\u009e\u0091j\u008f\u0019²* \u008ayte_{©ÜD@:\u008dk+'íáôÅ\u008aÚ& 9Ó#\u00959_\u0085«ôh\u008e\u0005iò·\u00ad\u0012ú\u009e\u0013²«ßÎá\u0091\u0087\u0007l¼Ï¹\";¬äÖ'\t\u0083y¨p\u0004Mm0\u0000\u0082\u0000\u009cT`è{I\u009e\u001d_Ë\u0013õÅ¤O\u0098%G\rL+\u000bó{°\u009cF\r|Ádáäøø\u0096¢«õÇl¢Ó\u0012\u0016\u001dÎAZ ô×~Árf\u009c@Ò\u0097Ô°ðÞB¬\"à4¯\u0011x\u0084Ö\u0017\u007f @O\u009do\u0002ôÛjÈðm¢\u0084rTàZ²\u001e G~®L\u0082íÎg1YEûVá´Ä\u0003é\u008cÍºFåÀ÷°ÄÖ\u0095 @\u008d\u001aÿ\u0011\u0003\u0091\u0000\u000eÅ¨\u0095\u0004ÇÂ²×ºÖfÐ\u0091Ï\u001cTþÌ\u0089\u00009]\u0085\u000e\u0006\u0012\u0084%Ñ\tGg¾uÃ¨Tí\u0011\u0084»\u00986¾»\u0091!«,44«\u001e-{s+ÞÖNÛ\u0085×H2®\u00838K\u0095\u008dä\u0089\fÂA\u0015s«ªVÙÐ\u0088ù&çyï`Pwà\u0080½9lö\u008d«ë§®Y¿¶:Ú*\u001fÑµ¶Ì\u0089Èo\u0019\u008cú7õ \u0090Å\u0006õ\u0012 ß\u0090øÝÀv\u001a¬ÎèGwP\u009bõFÿ\u0086G»\u0000vC´¶\u0012A\u0014\u007f×Kýñ\u0097\u009b×¾!\u0005$ÓÞl\f\u0003o4' oÈ\\\u008f\u008c#-þS7\u0080µ_\u0095L=\u009ew\u009bÚM\u0085\u009cóË\u009eÍcË\u0018;\t¼¤s\u0093 ÈÀ)ÒNÛ«\u0083¥6à\u001eÃÕy´¹»Qój$\u009f)\u0084vm\u001c¨Âi×\u008b²±o,IvWW\u009cmøpûN\u0015Aýp¹º¨Ë¥9Þ¾\u00156\u00ad\u00ad\u0002b\u0086ó\u0089!\u0081\u0089_¨\u0083\u0091\u0017ø2*+6Þ³Åþ½£×Ó\u0097\u0097JdH^uP\u0098 0N ,R\u000f\u0091\u00941¦\u001a\n6\u0004Ü¨ f\u0098?P³îAà\u0095Nä\rË\u0003Þ¢S\u008f]ó\u009ba)\u001aj\u001b.×°f!\u008e&\na¢\u0002}ô|;´1Äx\u0099c¤eß\u00887ï\u0015~ÕrK\u0099èÖI{\u0083Î1\u0004°CÄ\u0094\u0003)Ê!\u0004l\u0082Áß®+\u0016\\?ùup§u<ÊO;|³)¦\u001e\tYb-Ó©4µÆj\n«:\f7\u0015åf\u0006ba\bh°\u001e\u0013ö\u009cGcoA6H@b\u00859.D|àN\u0093t¢,c8ÑÖ~ðÞ\u0091´Q\u009e\u007f\u0002£5Èyî.\u0014Z\u0081f]\u0086\u0011§f\u009aQ\u008bÞ\u0097tj#äcÙÒL\u009cóÎ/ëãÖmðÅyWô9\u0096\u0010\u0080Ùá¾6Am-lë7\u008e¦¢Í-L¦\u0001nHid¯\u001fê\u0088\u000bFþ\u0095\u009e\u0094\u0006¼\u0089u½W\b\u0089»nÊ¸\u0019\u0001£\u0010¨X\u0084I\u008aïå  #Go\u0012f£*\u001f:6o;\u009a5 §Àn¶*\u009e\u008bîÀûnÀ\u001d\u008b._\u001câ$siù¾Ý @\u008aZ^\u0086\u0091]×\u0084u\n~\u000eø\u001f¢6\u0012o\u0011\u0085MÕ¡$ëeÇ2&Ñä\u009d\u000b\u0013&â\u0084\u008cBÿ2 \u0017óã·\u0084ù0ÚcFrÈ×Ga¹é\u009eä¿X\u0012\u0085MYû\b}I$\u0012Ð¢)ê\u001cæÄÙêW5\bIýû}ipñý\\ò\u001cV¾Þ´F×K{Ìî2S7\u0086\u0016û=Í¯ò]drÝDæ]ò\u0006#\u00862INhdpÊD\u0090^]G\b¦\u00130¤\u009b2gmgÑ\u0096\\õKVoB b\u001do\u009f|wúa.Zê}\u0019î\u0010Wø\u0011Këg!\u008f\u008aàÒ!ë\u0000\nþ¼+\u0094È(ñ®ÝÚgI\t=9;òEôs\u0096èÑ\u009d\u0006\u0081Æ\u008eBè\\]Â2Ò¯\u0099\u0097È&8\u0018QWq-ë3ò\f\u0010NòY\u0014Qÿ\u0014á\u00078ÞI}\u00adcëú\\\u008dÒ,è\u008a>\u0005bdi\u0002ò±Ù\u000e\u0001\u0092\u0095\u001d\u007fØiwh\u0085\u009ba·Yèö\t\u009dh,\u0087¨7T\u0099\u0097\u0015\u0084\u0012L<\u008eÉïU\\L¬ò\u008fý\u0002#ß¼º\u0096\u008f<\u0014¢\u000e\u009dhëm4É\u000b¢ó=J\u009b\u0097\u0006·¹Ð\u008c ã#=k\u001fe\u0007ª.Ê\u001a\u0098õ¬î\u0000\u009eäH\u001fÏ!3ôSý\u001cÌSoá\u0000#®Æ³\u0090\u008c\u0086\u0099@b\u0090ÜÛÔ#ÕÃ\u001a÷¸.5ô\u0092å*úÊ\fÐåºÞ©\u000b±5j|R+nú¦\u0011ÚeÏ\u0099uDøuh©E\u000b\u0004Á¦]f¸\u0086\"\u00adÞ¡?~?#\u0002\u0001Ê«8\"¤ãwð+³¾\u009bQ1³sh zý×«\\>W\b\u008b'ñ-\u0014ý'\u0018Ã\u008eëC4[\u0093R\t\bÍÖ?³©¸ÈÉü¢\u0080\u0088!sîõ°tÑÀN\u0005\u0084Ú\n\nSFàö0~\u00adª A úcÀ5Y,þ¨\u0096\u0097Rjxi»Þ\u0005\u0081åß\u0080\u0010ö\u0088R\u0086\u009c0\r½ñ¤};8ÎL]Eþ[\u009d\u001aÌ\u0017ç`°Õ8\u0018çK@û\u0084)À¸¢\u0018~Vw0qtoe6Á@ù\u0083\u0084(óº&O^©Î¬µqQàrÊ¡¤bÎ9?*e\bOåÀ\u0082É\u0011@\u001e]²MÙ?¶\u008dôx¤WRR\u0016µÖô\u009bEñHßC`·K#\u0093:\u0007%é;ô%{hvþJ«\u001fç¿rÕô=:êÉê¥\u009f-*9s\tDw\u0007h\u0085\u00827\u0099:?&fIG¦°Y±\fº\u001bä\u0004\u00ad]Î\u001b\u009d\u0002¢ç=\u009fi¦þ\u0096è¡ÃÆX·\u0091\u0099Ù°y©¿Ð\u0080\u000eí\u0099¿\u0098l8(EÅô«ÿ@ë\u0097(³\u0003\u00adn3\bï9ç£C*p\u0014@*^\u000b.æ*ê\u009b\u0011ä\u0099Ì,Ú¢Í[Ó\u008c´É'Ú\u0094\u0085çbs\u0005\u001b.Ã\u0084r¨Þ\u0095ÏlgM\u0094²]\u0084Ø\u000bï¤TKäk7år\u0087ÎH\u0000ö3\u009díI²ÎµtjP©ç\u001a\u008f\u0004<èT\u0087/YK¹£Z\u0006½\u0090(h\u0091ò³H¡\fN±&\u0097À\u0019\u0013ìÓ8F9gæÈ\u009ft5b³ùÀ\u008d¼åÞ~I\u0006v¢¸k\u009fz;0zoïÄ«\u0001}a\u0002Q\u001as\u0002\u0096\u0084¢\u0082\u0012\u0006ÛÈ:´&\u0097\u0013î·ó[\u0003-6<ÎÆt¥ÈþÐ\tU\u00ad\töj\u0089\u0096#¨8¨\u0014W/1\fÄ@\u0090±Â\u0012c¸=k+LóG\u0014êKC?\b\u009c8ïÖ|ðÛ\u0096ÞYt\u009c\u001fUÖóKÊëµ+9ãAñÔ¬Y ÐëO2À^ôªó|î\\Ý¼áKë\u000b\u0091þ¬\u0086Å}â~ýº`\u0088ô\u0010´\u009a3úG\u001f«&ï@\u001a*\u008fz\u0002(4Øwµm\u001cIø\u0013oÖê6cJÎJ\u009dv£¬Ìì\u0002\u0007\u0085änÖîÛS\u0003\u0097¥M\u008b±ewåV5(\u0000\r6v\u008f\u0012î\u0019êäV\u000bG*È\u008dgÆä¨Î\u0003,à\niÏ\u008f¿¹(¤\u0085ãoå\u001e7\u008e²Ø\u0092<Ù\u001eoÄÞ(â\u007f\u001b'rÉ-¾Îé\n}vµ\u0014'&\u008aX\u001f&g\u0085¶Cv\u00190\u0018ò\u0000ðº\u0096öTù\u0093/÷]\u00872`ÁAâ+û\u000eñ¼ ò¦Å\u008e\u0086\u0094õ®ó0\u0099énî\u008bæ¬\u008f!ÑÎ¤\u0099÷{4Y³d\u0001UÑ\u009a»½#rÀ+\u0096ÒN\u009bPÏ\u0094\u000e\u009d\u0005ì\u0006Ý\u00861\u0015KyF©\rµ\u0096\u0084±-Cÿ^¼âmµEwë]¨ÂèmMòê\u0013Åm\u001dHj\u0014\u001b\u0082\u0017\f\u0013\u009eæðÃ\u0099ÝW\u0014{\u0011MU\u00903ÀíYè¯øÐ\u0093ÁÁ:\t[Z;\tèö\u009a·:8{Õg¬¸N$L\u0002\u0015àì\u0097ÑF\u008bl\u0001ð:\nD\b2\u0086å¬À\u0019:ÛàÝWwµy³Ü\u008e\u0004îÍ×èt|æ\u000fÊß0Ë?#5!éw}\u0089ëÞÉ\n\u00984ÈUl&\u0087X]&ª\u008a/Lgý|!Ó(UQ\u0082\u008cpQu5\fð?\u0081Sq\u0086ú[7\u008ffÈ\u009dº\u0001Íz¯\u0001÷vY'J\u0086_\u0005\u0087]nõ]2âÚÔz\u001a\u0084\u009c\u0084\u0015ç¼\r\u0087-8])\u0001Âa\u0007¹è\u0086NH\u001dÀ+D\u0005«Íú\u0002\u008f À;cs.6\u0004x96{\u0088dG+\u0001\u0006B\u0098\u009aüIÎ|Cii°É\u0016T\u00003<Côº\u0088\f\u0093N«\u0003Öå³Áê[Ä7\bô¢\u0017\u0006¬Â\u0017×p*dpÛñ\u000fzä^ý¤ô\u009cËB6=\u001dz×\fÕ\u001a\u0094êz\u0015û\u0097Ý\u0086\u001eS\u000eÓ\u0013Z\u00181^ÞFú\u0011\u009b\u0088;P[\u009fhB0×U·N£F\u0091\u0080³'i\u008d\u001d\u008aùÊqz\u0017À\u0080|G+\u0086ü\u009d\u001bP¯Ö\u0006<µð\u0005J*b{ÉÌ#ïf\u009cW<MãHç\u0012\u0093\u0090\u008f\u008ejól¥E2`È\u009b\u0087\u0092CÎ\u0013\r#-ÜN}J#ò´:Îý\u008d\u0089v\u0013Xäaþã¢ì1ç®²\u0093§f\u009c¿\u0088\u008e¥Ñ[ã\u008eÞ\u009bü\r\u0080¢¨j\u0085r\u001fJ;\u0005\u0082iÑ\u0097)\u0098\u0091J@ýOZ\u0097ê\u0014ù\u000eJ\u0017*|:Ñ%©t^Ú\u009b\u0083À\u0096\u0015Eã\u008c\rÙ\u0084\u000eÑ±\u0003,¶\u0088\u001adï)Þ\u0086ÇÊÆ·\u007fÒ\u0002§Ü\u0015\u0002>ß\u0007¥ÿ\u008a±ô¶1\n»¥Ï\u008fheìfÁ»\u0005éñ]\u0094v\u009c\u008eZXÿ\u0011Z\u0098\u0017®ñ\u0097\u0093)\u009bÇ²ðïÎÙ\u0081ÁaON¤S\u009c\u008d\u0091x,Yä^\u0084\u0002RìF\u0095§ãjí)¢\u001dT\u0083\u009a\u009f.jÇ\t\u0012Ã\u0003½¬+W\u0018¬U\f¢Àùeyúª\u0007ÊC\u0005ðþÃª÷$\u0088«*1¨\u0015\u009fZ\u001a\f\u009fâ\u0016¯Åtój¸Ð±\u000e\u0010JÒ3<NU\u0089áfçÞ\u0086\u0087mãïÑ&Ó&»ÌÎIý\u0012E\u001cßá¶¦Þ3Ù¯%£Å\u0001 \u0093Âù\u008a>$½;CbÃ0Z¤ Ð{\u0005Qî\u008f]^wV\nrzßÛ\u001a´\u001fDÝ\u0014\u008f \u009dÁ¾qp¡\u0001åp\u00adNóB£\u001cµº\u000f%¶å»\bUdØÐZ8ó\u0087\u009dS\u009aö\u008dsE8øu²DÉÈ{S¢\u0011\u0086\u008f£®\u0001\u008a¡\u001b`\u008d§\u009e\u0094F\u0003hUÿ;\u008aåpíËÜ\u0016\u0013=U\u0004\u009e\u001a\r]ç¯Ì¾ùñ7\u008d9Û\u009d\"lö\u008cò\u0007\u0006\u0091\u0097\u0085V:SnîÍ\u0010åÐßo£^ïAÛ\u0016VeAA\u0098º7\u0001\u0015¾úØùF±ÊXÑÎ\u0012\u0003\u0086Ç\u0094t)1n\u009b\u009249y÷\u008eª\t\u00892Séó\u009aö\u0017\u009cY\u0003d\u001a_\u0012\u0095Fü\u0095ÿ\u0018\u0092-á¶Tã\u009eí\u008b3Üºt6\u0088I\u008dõ\u001c\u0002Ó;Ï')`\u0013Qþ\u001d\u0091¬h\u0097b¹DbY\u0003^»\u0016\u0003\u0081O«ÇÜ\u001eÑ¹M²Ý %y¥\rL.)\u008e#\u008ax×:àß\u0089]Ý~4\u0086áPá8ý¹\u000e\u000e\u009e\u0084\u0092¬Ô|üíbk¢\u0090$H\u0016ïÀk¶\u0007\u009a\"ïx}x|þõT{\u0095é\u0016YL\u0093\u001dq3\u0011û$f\u0099M'Wu\u001d mØIzAÇ3 §®O\u0086þ\u0094ò\u008f5\u0011¦h\u008aßsáTj;È/\u008fB\u009b\u0004±>\n\t1q0\u009a\u0088¸«yÑ\u008b´\f\u000bæÙ\u0003«\u0096µ8àIt¬\u0001áðw&´\u0097E°ÆÁ\u0098PWå^mjØ\u0096È§\u0095þ.rèA[\u0092\u007f=\u0094UâÔXÖVók\u007f)\u009a78òpÃU{d±e\u0015o-\u001dyà\u0097L\r:åO¡\u0006ÓÇ×K,\u0012\u0002+)«\u0019§+â1\u0087\u0015u$2$\b\u000fLQ\u0019\bT>wÒë3\u0001Í\u0086x\u0010¼\u0018ýðè\u0080ip-Ôk=o.ðß\u0017@\u0096\u0094ÁÒ\u0092Ã\\\u009aI[ñº^Mþð\u0081\u009bXè\u0087Ûò¸@\nc1909\u008e$\u00ad)\u0014?±ä¼&¹oß\u0081O N¼Ü\bî@ûÝRòÍÐ\u0081\u0084²'É\u001b\u008d%Tû)\u009eÌ¸\u000eÅ$¢\u009f\u0002CÅ\b%\u0081¤\u0096ZêúØ)aõÛ?·³_ÔkÒ±ÉÙNkWßåÖå´:1Í<Ìd®Wh\u0099Hû9RKÍ\u0002\u0087\u0093°E\fr\u0010êlÁÃ\u0015ÿáÂ\u008dxÁr\"^C\u000eV@i\u008e+Ê{\u009fö\u00adGão27*A¡¡\b.\u0003z|WÚ¥sÃ¥\u009b\u0015Zr\u009e .Ü\u0091\u008fõ»'\u009b`\u0011Å[î\u0085¯ÅÂ\u008eÖú\u008eöqT$\u001f\u0013E\u0091\u0092¬åù/kêµÍ§\u0016\u001e\u001d\u008a¡6½\u001a\u00ad£\u000eÓJ÷ùl\u001aº\u0098êc\u001dÄU×ÎGL¨a\u008c#u\u008c`*Ý\fÂ\u009c\rîGÜrw©\u008fùéÌ\u0098ê]9ê\u009c®ò£F¨\u001c\u0014\rz\u000fä\u0086\u0093\bmb\u0015\u0014<\u0019ç\u0005$\u008aa3\u00ad\u001d¦\u0006a\u0097\u007f\u008d¡Úb²®\u0097ÝJeL;s6\u0019¤n\u000eÅ&º\rI÷H\u008b\u0011¸à»\u0005bm£Üúí¯÷\u009a¯Ê(ÖÄx©Ì_¤ãÏÞl\bÇ.Ì\u0090\u008e\u0006H\u0017\u001c\u0092\u001c®e\u0084\u0081Wú\u000117¾Yµ6z×µ¤+\u00802YVñë¼öaÖmwÐ¨L\u0090\u008e\u008b\u008c\u0089\n\bØ\tF\u0083mÆ~\u009c¨Ò¸;\u0016®½\u0099\u008bPÐA6C_ºâÐr\u0091¸:Vê·\u001b æLC*4ÝØfnC¼\u0018«§}oEÌ6ös\u0080\u008b@\u0099\u001eÑËÙ¶g\u0006_Z°¨ìÅ£c¾ugEjè6F^\u0082\u0097Â\u009fZ1ÊùF¼ñ(L\u0090ÏúÉSXì\"\u0080\u009b\u0017É]ë?Ð,\u0084Èÿþ½\u0087'\u0017\u009fµ\u0083Ít\\Ó*ÙöHRÆ²\u0016ôÆÖ\u0006OmXþ\u0091\b¹êo5JÁÀä\u000e}ð7e³ìX\b\u0007jjÁ×ë´Jk\u009büÞñLsÎ\u0089\u0098làÈh¢\u0093D\u007fE\u009a/ö\u008f\u001eªÓÒ,c\u0014½\f\u009aT:Ã\u0002ôò!\u0012\u009cül%È\u0087%xC\u008fÅ.fG[v8]'\u0080{¶-¼iÎÞ\u001f¬¿\u0007çb4\u0095¬\u0010øJ\u008bÛñ-â<É\fÒÓ0x \u008f»Ï\u0097ÁCk6(¦5UÈ,0\u0098Ù\u0014\u0081=â3ñ\u00ad ø\u0001ìC\u00154\u0083¹:©þTÜ\t\u001a\u0083\u008e0\u0081íí®ìøZÕ Ã\u0017\tÝÚ\u007f\u0005\u0017é\u000e8~\tz+Îs\u000ek»J\u008c\u0001\u0015Rp\u0017VôD8\u008c\u009fIª\u001f¤Z\u000frxFNe´êÜ\u0083\u0012´2\u0084\u0000Æ\u0099Ðr·3°0\u008f\u0012à1oAe´¹\u0019I\u000fºÞwÞp´m\u0013c\u0017Ý\u008aÎK\tø£\u007f\u00adj\u0017JªôÅ:¬;\u0004V\u0002\u0005\u0017nEÎ&ä5»\u0092ì\u008c\u00adÕ^«¡\u001e\u0015Oú;¿qIñ\u0098?RyÎ#û$C¸im[ü\u0011\u0092è'wBË\u0088§\u0001S\u0098t\u008b\u0084Î\u0001>\u0015\u009f9fî&\u0084\u0089øÙ\u0091\u008eÃQLðWL©D \u0001\u007f\u0081\u008dè`c`\u008fåØ*Ê\u008a  [²ÆþF\u0092«¶ºîÇX\u0083p\fÙ\u0001ÓUx\u0001C@×\u0098\u001f\u0007ÿx¢Æq\u008f`¸\u008d\u009aAÁg\u000f6\\\u0093Ì\\ë\u0086\u0016uNú\u001e=pöÖJ<\u0085\u0019\u001aL¥ÉÌë[\t·¿bð\u0089 °¯\u009cú\u0004Ad±°©jtfSJ*)È\u0019\u0087!H0ö]\u0098aLBlâbì\u009c»ËÍ*\u0086eÕ2Õ%?j\u0092ü:ê]\u0094D(S\u0084¸i\u0086=^m\u001eÂ\u008aÝØÂb¸ýª\u0086\u0087\u009e¾\u0085¸Y\u0093I(þ¤`H^\u009eÊ}Î(\u0092n\u0099¹'z\u0097Ç\u0091»lÆ¯ªÊ\rH¥íé>\u009c\u0000×zëË\n%Ø·\u009c^N\u0083\u00895¾\u0019\u000bÃÚÉÇlº\u008a\u008c|x\u000em>sfù\u0010n\u0090¯\u001em¨\b\u0015ÃþD´ýÇollC7\u0081LñÈ\u0082\u0085Õ)Ä¹å\u0019¹wY*\u0081Ï\u0082\u008c4¦=i·b=7é\u008e¾>m\u0011ç°\u00adÊ#;ëüñ6>\u008b\u009eá\u0015Nô\u0091Å1q\u009c\"1ÁbBWÎ8Ä\u0097è]´\u007f÷\u0087°zç6\u0091x\u008f6#\u0088*G*\u0001ÁBb\u009fí6uµüfU¡ß\u008e@\u0090è·\u0001\rä\u0003[º\u008a\u0081XZ\u0011Ùf\\\u008d&Ì\u0082ÏÉñx\u0093r(HB\u000f(\u0092pP%]pçÙh÷°»ú0ïµh±AWÐJ¸Í_ã{Ñ{nñü1P}Îk\u0092ä\t\u008a£dåsÃ/\u0017Q\u008eN2«\u009e¤¸áIæTx¤\u0095\u009cY\u0092k*¿\u0087\u0083,î\u0011Úçe}\u0007%ï1ì\u0084ê Äq\u001f\n<.\u0085G9v=/\u0013{\u0010þ@¾Ót\u009do\u001ew\u0015\u0089<ìØ+¶ÂAÿc\u009f¢ÎåùÏIïRr¢;YÅ\u008dð\u008a\u008f±Ä\u008f\b¡¢½\fýÈ¸\u0096±\u001béa?eh»Ñ:\u008fÚ¢£\u0015P\u001af§-:8\u0095\u0083Ë)(\u0095\u0089Ù®Ê\u008e\u0086!Ñ\t¦OùOpÕ2»<\u0001ÖZ×\u0081\u008fZWn*\u0017[Ä\u001c$\u001fsÁ¥àþùÐ¶ª¯vAÐ´\t×\u008dBz¬ï[\u0002¾â*æ\u0017âã|âc?\u000e)½\u0094÷èä@\r\u0084Àh¸¯\u0093½('¨ðA\u0080\u0019\u0006ý´\u0003¿F3f¶b\u0083:ô=Ø$Là\u0017Æ\nm\"}º1)Þ°ªú¥tK<aÌ\u0084£PypÝ\u0097©¼gk_\r×d\u0093¡cA.bJ e%¦ù\u0001\u0011\u008d_÷½g¿±U\u0093\u001c¡ÇS¹ÇV±D_\u0005kmÜS³qû²½+ñ\u0006\"\u0015«Åâa";
                  var4 = " Ü\u0016Ý\u0094\"\u009a\u0005þÁÊ§¾`nèIoû·4\u0018y]~íó¿zR\u0098$¾A\u0003Æ\u009f\u0086¢\u0096hÎ\u0005\u00adê|ù`\u008c\u001c\u0092¼\u0016ÁX i«B0\u000e¼ËÆÆ±Û®\\\u008c¼\u0012Q\u0081ÓåP0\u0094a\u0099e\u00002ÛÐðJ]^gß\u0017?\u001d[\u0089\u0089¬/Ö>mI\u0018\u0096î\u00ad\u0086¢ñ\"áF[Ã\"KÚµ\u0097Þ®\u0006gR\u008d\u0011Úq\u0083s-y±ë\u009a\u0098 Çök>Ê\u0086~/¤kÜIoªn?å¸à\f\u009aw\u0084J\u0095\u0016Èmþ\u0002b\"AºÚäG¯x©\u0014³ ¡4#ÜY¦}è\u008e\u0096\u0081\u0091'þð$Ú{çE\u001ac\u0085µ¨\u008eAY\u000f/zM\bdi_·N_gy&B¡¢\u008bVR\u001d£\u0001¡´ÀÌò\u000f|¨«Ö\u0081Ú\u0088¢ÖÍ$/$v\u008bpÕ\u008f¼Õ½\u0086\u0099uJ\u0096¤\u0018\u001cºizÇO¯\t`ÜÆ\u009dü\u0099£\u001dÑÚ\u0002¶\u008a^á/ \u0094v\u0006uð\u0000ó\u0005éÍûUj\u001fûKÛt#D\u0093@ò`C\u000bá`\u0083Ð\u0084Ñ\u0085¡\u0089\u00ad9èÍÿ\u0019íÇ{dÉ¬\\\u0097|l!\u00071{\u001föë\u009fÐ\u008e\\\u009bUä\u0010cà|p×pgH\u0094©7¯^\u008fñÌ\u0010\u008d\u009e\u009a\u0013ü\u009eÚ\u0004ü\u0017|\r(¦ðj\u008c\u0097§-s)R\u0088Kù\u000fÌ\u0081hå#\u0011\u0019du\u0015¦ãy\u0001ij÷\u0093Æüñ·\u00adÁåO@;\u0018\u0010\u0002I×æ¿ë ½*\u0086Eù\u0088³i©î\u00816f\u008dO\u0016òR!Û\\û\u0015:Fø¢\u0091\nÇ\u0017,2\u009eFó$®jA\u009cÚ\u001d\u000f&\u0091Öt\u008c\u0017\u0099£\u009e\u0015\u009a,:\bÛÃ\u0006>\u0096^Ú\u008aêk\u0084À[\u008f|f3üìí\u0090\u001aL=\u007fÊá\u0011\u0015ÍÚÜ\u008c\u0000\u0018B/\u00136\u0097Jt×.\u008cDèl¶TûNùE!\u0001GK¯}\u0095^gåAÁnnTÅË\u0015\u0004äÊF\u0087ð~7çuËþ\u000e#\u0013t\u0015\u008féfò\u0089ifíò\u008c^¸ë\u009b\u0005¬c!\u0087r»ÍÐ¢\u008a+À\u001d\u0098=VCu\u0002 \u001eñ\u0095êbFLèeÍB-\u0099W½¾2§T²ÜÏ\u0093¸ßv²@?\u0085{r\u0012\b\u0014\u0098\u008aRàpÅ£sãyë\u0093MøÛ\u0012Ü\u001cåuÑ r= ÝX0\u009bOz{9¨s\rdc+Ì*\u008e\u0094æÚîdÅ\u009bûX\u009e§BÏ1ø\u0080ç\u009fV¼\u0096Lû\u0091\u0080y>¤1\u009cg>\u0091\u0081d©\u0084t=ï¢}´\u0084\u0083SÈ\u0082\u0017ÿ»\u0011\u008c~OÚ¦1\u00adúÉ@Yá\u008e)\u001a\u0082äÑ\u0087+'Ø\u0084Gi+\u0018&y\u0097p2\u0093\u0007ña\u009b\u00adØ;j\u008b½ZHù\u0001t\u0088´ÈÇ\u0013¥·\u009a[.-\u0093<zÚíþ\u000b\f%æåqÁhn\u0094Ù\u0094\t\u00145Ki[\u00ad°\u0014»Ñ\bÁC%.uÓ_0\u00ad\u008d\u0010T´\u00940ì\u0081atû\u0014ôåëbÛ\u009dL\u0084ÿ¢7L\u0098Ç\\³Ç)$M\u0083\u0018W\u0017ry\u001f÷H\u009a;ø\u0017!¦C\u0095ÅÏþ¯Fý\u0089\u0012L\u0018\u009cLâë¥n75'\u0098ô\u0011µExrÑm¯¡²;ù\u001fÓ\u001aaß\u009bµùî\u0004°ÛZM\u0019Õ\u008c\u0010ùM0¥\u000eÛ\u0090å\u0083Øo#íD\u00adgÈu\u001bê\u0089¿p2ÂÚ\u009a&\u0015\u0092;Z&ú¶Áp$ÛªÖ(\u009cS\nb\u001c¦ai(+[\u001e\u0007Èz¤ÓzÈáÔA[ñ\u000b=Ëüçj\u0085Â_Ê¼\u009eÃËs»åÒYì5;Øæø^6U\u0011H\u0089ôø\u0010¥\u0093ÁY\u0099k\u0007r\u0088\u0014\u008dÉ\u009f²\u0005^áfA\u008a~ÈÇXUj¯Í\u0015\u0092·\u0091NÚÇô¡pÏR'_«\u0081\fìý\u0082ß¹^\"\u0000ã§ýï®*h%Q]é\u009e~©\u009cjSÐ+\u0099ä\u0096\u001dy-^I;\u0002\u0098ò\u001b\u0015Ë\u0098 B\u001e\u0015\u0016\u008coì«ËìqÀ\u008c½'d ëUÐ×\\¬\u0012\u0081D\u0002\u000eT\bE3(½¤\u001aÇ<\u0003Å}þ~É>r\u0081æ\u0096x\u0002uL7à\u001aX\u0094\u0090\u0019VUUj\u001fÐ3\u009aR\u008c\u0094hÜ\u000bÖiK7\bã¶\u0019\u0004³\u0018(¿m{:*7{¢\b\u0015¬ßÓ\u00adã½=\u001aÚ\u0019Nl¸ïîî^%\n\u009aQQ\u0001Mîs\u0003Mõ¥ù»\u0090\u000fþ\u0018Ä\u009f/½oïÖ\u0090\u0081^\u0006\u0099¼\u009c=ûèp\u0011\u0006M\u00917£\u0082khm-½JÊÐ[^\u0081)qàâ\u0080\u009em\u0095û+w$_öux²Úxör\u0084\u0017Ñ\u001aþ3Í ï\u0081²î\u001dä\u0098\u0004@\u0085ã¹E\u0019#Õlû \u0002B\u0016Í\u009a&ð\u0098\u0086M\rÜ.üµsKÏ\u0084Ñ_è¼\u000eem³zÌ\u0014²Õ\u0094ö\u0095\u0005Ì¿i\u009dÃ\u0018\u0018\u008b\u0086¿\u000f\u0011·\\iûlÒT¾N³DãuÝ\u001baÞy\u009b\u0001ê(¸\nøúÌ\u0012¢Ü\u0001\u000bÆ N\u008a£?·7ë\u008f\u000bÜ§Ú©¨\u007fe°¶HÖa\u0003¤Ë\u0012v[Þï\u008d¢-#\u0087/(+àc\u0095ó¨¿¯IH\u0093FW¿¡\u0014\u0014«ù¢\u0092ë\u0003#ñèT\u0085G\u0015\u008ej(:g6\u0097\u0092$Ü@Ï©Y\u0093!O³Í\u0085A,\u0016«æ%°äñ\u0016j·$Ã¸\u0087k¿K\u008cGô\nÝ°ht:Û\u0098j\u0012¡Ý²\u0096\u001e\u0093ÿoú\u0083¦¯Äô\\\b=rö¼¼ú\u000fhZÒ[[®ü[Ø\u0002Zz¸\u008cdiõ\u0018¾M\u000eÈk'5e\f\u0016\u0088f1BXÙ\f\u000e?^U\u0086\u0084\u0087\u0093W\u001aj_sÉ[\u0002\u0094ÐÐTÍæÓ=×=+À\u0010ÀÜ\u0007»Êíø,®æ]\u0080\u008a/\u001b{Ú\u000eXB\u008aê\u009c\u001dÃH¥\u001aån{\u0007\u0084\u0099\u0093BM³m(ULF\u008cw\u009f[ùê)\u008a +#\u009e,W÷8£_<-»²V\u0093\u0006î\u0002 \u0006BY@j¹`¯TM\\í;\u000eòÁ\u0017´¿rU&âÞÈ9\u0089Õ¨ÏýßáÒ]U\"\u001dRa{ò\u0014\u0087ÄÛËø\u0014ÛÈmÇÚz¸\u00ad>H\u0013ì¾\u0085\u0080`´\u0005\rhgÈ$$ó¦\u000fìµh1\u0086ZÝè\u0010t\u0095\u0018VÑþ ¤ü}Ë\u0087½Þ?oÐL+W\u001e=\u0085Nãæ\u0014\u001bm\u001ar¢ôÉDÉ,\u0012\u0018èløÁ\b\u0089K@\u00123\u0097c]\u0010\u0001¨ÉX¯\u00166Ö9@òìõH\u0092@ð\u0085¦.Ñ}ÃPlNÆÔ\u0010sÁ\fÆV_\u0016Ò\u009e\u008bó^çèxTÍ\u0097\u0085÷Ã\u0015\u0019ä>\u0088Ïcª4\u0080\u0083»\fU#Ï N\u001c\f2µßÎ|RRD\nAÈ\u0092y+·\tä\u0017\u0097Ýkùèr\u0089ûæµg\u0002I\u008a\u000euë\u0092S÷\u0004É\u0084\u0001\u0090\u0000\u0002ï=d¥È^âÖé¹íÉ#P\u0088và»5Î°\u0086ä\u0099\u008cé°¿\u009d\u0001»aÚQ\u001d|&À\u00040 /R|BÎå¤úÂÆP\u0085÷\u0013¶\u0015\u0091¯n\u0096cÄìHOf\u00981(·\u0000\u0096|R.î\u0081£!|SÜðMúf\u0082\t\u0010J\u00882há³&OT©À¬÷uÿä\u0083B7ß\u0018\u00adò2V\u009a#2¦Ç\b\u0088á¥\u0084(áD»0òæY\u0096\u0094\u0004p\u001eò\u0091ë3¶ð\u009bt\u0091DÃ½\u0010Ã\u0017ê\u0099ÓÜÀw¦\u0088\u0017éÿ\u007f\u008f¹\u0084m\u0011B\u0098\u00ad¸ñw\u008esóÖCG:ç\u008c«ÐÒuÖWi\u008b\u0014mðþ[4[è\u0005¹\u0089Oä*mºt\u0083Iö´\u007fùJ\u007f\u001dÓÎ\fa]]© ®\u000f~\u0080£\u000bd¢4\u00ad\u001a¡azó |\u008f\u0007EÛ\u000eÂù\u0086Î\u0092Ô\u0089ÔÒ\u001ds\u009b»þé«``\rg9\u0002\u0082a\u0098tdnÿ}\u008aÑÛrEå\u000bt\b\u001a\u0097Ç ¦\u0094\u00881\u0010uî\u008d¾>\u008e\u0017\u0010Ò¿\u0000#@îþô¼\u009aü\u0083I\u001a»\u0018«õ\u0017[\u007fÌãþ8\u0006Q\u0080^\u0010LÁµ%¶×\u008d\u008fBz\u0000P¦©±\\\u0080\u0016öz¡Ðf4\u0002Ú¬xô\u0081\u0089Á~\u000f\u001d\\þÌÒë\u0010\u0013\u0000K\u0018¾¥d\u008c_ag\u000epN#\u0086$\u000eVm½ßJ.JcóãÔBÄÎð\u0084\u00902P\u000eRS«<å\u001dàK4?Ia\r£E½q¹êóÒq\u0095w{\u0086\u008d^O:isõ°¬T\u001f>Ë\u00ad[öS\fê\u0097\u0082-£¤=\f-(fK3tÄü%Çqÿ\u0080Á\u009b\u009e\u009b\u0013Ãr^öqG\u001eo+3hE¯&NZ¨ñ\rmyê+#(\u0086æØ\u0004Èá\"#\u0010TÅb/C®\u008c\u001b«Ò°(#Q;¦.,K.,¥:' \u0093Nï\u0018\u0091*h®èU\u0097{\u0087 ÆßD\u0087ÞÐ\u008bþ1»¯çãøJÇÕéøÕÈ²uTÅ\u009cjñ[l¶}\u0095\u0080(:\u008d ùÝ\nù2f?zåà'²E4\u008føé\u001b\u008c±\u000bh\u0085ai&é\u0088¶\u0086\u008e4l½×&µ¯Á\u001dÜGUÔ~\u0093p\u0006WÐoßv}\bÏÉÎN´¾?4¡^ ª\u007fH\u009fyö\u0080¢¼ò \u008c\u009dßî\u0097x\u001b õ\u0087}\u0087TjÚÆ×\u0086\u0011±©¿\u0080á\u0091\nÈÝmý\u0081ìzñKUµzY\u001bx½Û\u0097ðo\u0004ó×a^\bWoËJ·RG\u008f\u0098¿\u0017¼3Á/Jý\u0011k#à\u009cØ2^a[0h37ö\\q\u00adô\u009d9\u0090©\u001dÛò³?·oIÚËn\u00812\u0006\u0007ê7Ð\u0087?Ù=å\u0081'\u008d;if*Po'\u008c«\u008eI\u0091Y(1\u0094+ý\u0010Ñ¦\u0089C¼ÁNQbk,P\u0011.²8È\u0093\u0016»\u0098zöé^\u001fê>\u0093\u0087p~\u00142aÿò!\u008bcÝ\u0012t£¨\u001f§=¶0¥SB\u008c¢\r\u001a\u0080ÂÚ¥nV¹3Æu]\u0001\u0095\u0086\u0014 Q\u0011J^Îk\u009bk*u\u0086\u001f+~5Ì,G«Ë\u0095ñ\u0001\u0005I\u001a\u0011þÑ\u009cviáÎøð\tÀHì6ÂÖ\u001b\u001føcÙËóc\t\u008cQ <[\n!\u0098Ì±p~\u0098YÑùâ®KW@¿ç\u0012ÿËÉowÞ\u0010âñ\u0012w{b\tHïÕ*Töø\u0006Ê&ôRr,)ÂùmÞÞA¢:SÌT\u0090/2F8Ñ\u0001ª¿ÍA\u001f\u0083>_\u0087(yÿVüy«T\u000eÍ+Ç.\u0011á@ÆÝÑFN\u009aÖRñÐ¿ývp1\u009e\u0087¤+e\u0012 \nüê?\u009eí(,#°Ø\u0086â\u0010]YFï\u0085h\u0000\u009c%¦xI\u0099&¿\u0090\u0019Ö\u0007U\u001ezE{·±Àv6[Î\u0003Ö\u008fh:ls\u0092°dV¢<\\ã\u008dð-Ë\u0003\u0088^ÎÿØ\u0097\u0083yÙÌxI¾B¡?è¹\u001dWziåäñ-. }ê0\u00adG\u009d1{â\u00ad×jÁË\u008bf\nó\u0004{¼\u0005r\u008e¡då\u000bÅXîßX}\u0097\u000bÓd²p!ÁWG\u009f\u0090|\u009d\u0014;\"íN-[¥=è>\r/i½\u0005\u0010\u0080\u0082knËûLãÓ=\u0090\u0013^\n\u000e®ù\u0005¹ô)C;+gò(\u0019L`\u0097½\u0098Ílèó\u001e7yh\u0085M\u009e²À\u0099-D<ø\u0000²Û¸ý70\u0093Ú\u001aîZ\u008e¿\u0090\\ª£·Tþö\u0000\u009b¶É\u0081\u000b\u0094Ï\t~ç 4îñÝMà¿îp¶r>é'Ð]\u008c\u0089C\u000fñ×µÓá\u0090\u009b´ø¬KQZ3r\u0096\u000bøQ\u0093A}¤\u0018@ÂØâÁb\u009ci\u000eb·\u0092\u0081\u001b¼>se\u0006äÚ\b¹\u0091Å«Í\u009d\u009fíÚÜT\u0012=Te»r\f\u0097ÇÙ«¸\u0018ÓIl÷ú|¼m¾P\u0003ï¼åÀl¼\u0084\fXGÎ äs¾\u001fï·\bq\u008aR\\é T\u0093\u001c\u0096Qæ°§þ\u001d\u008b\u008bµ_>_ðJ/\u0097\u009e%\u0095Má\u0086T\u0017e\u009bs\u0092ÔÏ@\t¬\n\bën\u0098\u0081\u0004\u0081ÊA\"\u0013\u0091g\u009d\u0090\u0019¸ÊZÏV:Þ¸AÂÌóLRÀè\u0095¥,±=ÏXíOöô\u0016w\u0001\u008cÞF\\\u0014²Þ\u0087ûßæØXRÉW\u0005ïÓ\u0016\u001b\u0084~\u0084Çâ«\u0004 \u0085¿ÌÕ;ß#L|L>½^ÏLrT@ÊÁÐ\u0082zFÂb½á¬â[Ç>'×å?#eIHg3\u001f¥\u0099Mb½LùP^ \u0081YI4ËÐ\u0086\u0086\u0004ò\f\u0086j5Ç(oø\u000e¥\u001f\t7fk²£²t\u0098ÛÌB:-¢\bIß)`yÓ?{#øÇX\u001cJ¹ºó&`ÿ\u0018ÿM&ÉfS\u00882\u000e¤\u0097kb´ã¶¤=q,¦3\u0095ý?\u0015\u0002\u000f[?¥|áP,\u000b@þ\u008aòµ\u0010\u008cñ^D¼Ùà;S¾'p\u0001ï:ã¨\u000bGú\u001b\u009a)\u008aÎ\u0095X2ût04Ü;Î'÷}öJÑ¦\u0081\u0007}¸2I·Kýñ4\u009be½|\u0006ì¶ì\u0006(JËw\u009dDÖÉk¤e,ù\u00189\u001a8ÆQ®±¡ó4¦K1\n¦\u0018\u0085Â\u0005à\u001dhà$æj8hÉÔîÝbF\u001d]ÁO¯i¾\u008d\u001fN\u0094jàÜHá\u0088óE±\f\u0010\u000f»wV<\u0094\u001dÂ(ÐS{\u0002%ËÝ-^\u0097Óê©\u001eU5+Êâ2d\u0092\u0000\u0082U\u008e½ñ\u0095©1rã\u0000A\u001d\u0001Õ~f±Ìy@f«¡s£q\u0090\u0096*B½ç\u0097$\u0019a¨¤¶º\u0080X\u0096ìXÄ~]û\u0090¡\u0089u\u0017\u001aÌ)|\u0088\u0094Ï\\bÞ\u0093Ës¼ñ\u0015\nQ\"·\u0005u!\u000b¥Ê:(«õ^Ay d¬¶L\u0087\u0083\u00ad¥\u009b\u0019\u000ee\u00975úçò\u0081\u0018zÊ\u0099\u0016¿a¹>Ó\u0001è\u008eé°\u0006|+dl«Úf©`*Ûÿ ÔSA(\f_§N\"k¡\u009aO\bqKvþ*x-\u0085¼Å\u0011\u00897J\u009d\fYÒa>#KÓ½»gÍ6\u0087bÕÑõ6\u001e\u0083=\u0007 \u0094;\fs\u0085!íl\u0016Í®£Í\u0092\n/\u009a÷ÖrL¦\u008c3Þ:\t!TÖ5¤¢Ý\t0\u0082ã5dº.b{ÝÙ5\u0097{7/\u0089jÀ\u0091t\u0088\u0014¬\u0095Ï\u009a-\u009fÍ¶2d}Á\u001a¢þJ\u0090CeìD¸ËÎª\u009cn-\u009d\u001fðÂ\u0085\u0095vÔ\fb½\bÆ\u009fïfw&Ð\u0088ºÕ]¡<÷t\r\u0014û\t\u0094vò\u00874}Ú==\u0091Y®Û\u009aT(¥`pO\u0013;aq\u0017öv8\u000b\u0098á]\u009déo\u00ad\u000bÃ\u0019¤\u0096\u0093\u001bLo)g@|\u001b\u008dV¯Uàës¢\u0002V§B s}Ð\u0092#\u0002#Æ\u001ax \u008c=+y.¸±C!¯\tmL\bOÊ°MÕÝEJzÎ\u0005¥D\u0017å\u008b\u0003ã\u0081* ßH\u0013 1é\u0005z/«,¡\u008d\\¶\u0003i[ÉÔ\u0004\u0082Ý\u0017\u0090\u009c\u0090{ó,åTù\u0090\u0084I\u0087îßDØ\fSM\\ZÁ8@r¹Ä{¦CvÉ\u0086åM[\u0011<¹óþ\u007f\u0088\u0005¶\u000bZ÷ø<(T¸þY¯bGQ²_\u0010ç]\u0090Lô$êP\u0016Ö\u009f\u008bÇ\u0013\u0092ú\u0082ã\u008e\u0089ñ»¦Ln×ÿvSW n\u0093\u0002NÐÌlf>\u001fI\u008f}ý\b8ì<\fc´P\t{lâÔ\u0097òW×³ì´®MìÙß\u009d,7àÇ_¦<ó4ã_\u008a,½\u001c8haLÐ\u0094ÕáËEÏ®TÊfÿª?®ýòLÃ\u0019\u008c\u008c;HiÍï0,\u001cÍ;\u0085\u0098Å\\³üýy_£U§l¬ÑÈ*\u0018\u008b\u009e\u0094ÓÚ·d$çæ©\u008b*Õo$Iç*1yô)è¸Íä1ÐZ8ìbpú\u009d¸ÄM\u0005xÌ&Æ)\u0098`\u009b±D\u0097¾(KP,&µ\u008eÛÒ1lòÄ\u008e\u0081\u000fÁÁ:¤ä¹\u007fq0:\u0080<\u000e÷Òþð\u0006\u0016aÌh\t\u001a&òtÂózP\u0090\t\u0010K\u008e$|ÕcÛ\nû¸Ap\u0019ÔXÍIÀì¥¦îC\u009cÏ+[\u0083¯üêK\u001aÖº\u0083Gõ- $g\u0002!^ö¨¬LÁ8°MjAèÀ²¯Æ6Ì8\u0003æ\u009aÅ[(:\u009eÒ\u0016³\u001bY§é\u007f\u0097¥®QödWpüÍªAª\u0017\u0010é2\u0099/7+8»ªì\u0006@\u0013K\u000fðÚ\u0085\r\u0083$ÿ\u001bt!kêqì\u000fè¾Í¡<_¹\u0005\u009c\u0081óiïâÈ.\u0082\u0014\u0099\u00adk\u009e$\u0094\u000flµ\u000b\u008f{\u0083ú0¢\u0086í\fc\u0013#m\u0013¤\u0083·\u001bï³~Msô\u0098\u009fûdiØ÷.Z\u0089Ò\u001fÒ\u0007\u0018Ú\u0093\u0099\u0001êYi.E¹.\u009c\u0080ÿ\u0087ä\u0011N½R\u0002\u008f\u008f,8Åâ7AY,\u009a_j¶\u000fè%,±þJ\u009bEbÅ!|n\u0090\u001eUôUG\u007f/Az¯\u0001\u009ba¯ß\u0011\u008c\u001bl·\u008a|o\u00adFÛÇ é\u0013JÒÕ!\u0098ÍÌ\u0097\u009b\u0015ø÷G¶Qéô.ØbDîk\u0018D?Wç\\ Ù\u0000:MÙ«X<Ã\u009d\u000fW\u009bÖM\u00ad+ÿ¼\u00175\u000bî÷K<»_æü^¶\u009b>3!îZêNn7ô\u0014ßìO×\u0085ûÛ\u0004\u00ad!'ú>\u008bcüòQR.\u0002\u0015uÎÝFÂxUeßb[BmØ±\u0013\u0003<ýý¼pOÅ\f\u001e\rü\u001eÿ{Â\u0090\bV\u008c×^\u001eê\r\u0005\u007fN\u001b½?¡Ç7zb«n»õ¤?¯\u001e¦Öô°\u0006Üe\u001ac¸ü6ë\u009dï@qIÖ¯d\u0093C\u0089ø\u0010kY\u009cØ\u0013SùÂ\u009fùùå®\u009fàî\u0083\u00ad=\u0018óçº\u0090Ú\u0081Éy\r:\u007f?¡`n\u0089¨3V|\u001bh\u0016P\u001c9£«è\u009eSR\"±q\u001e_³Ðç\u001b\u009c\u009b\u0012×Âx\u0085\u0017sS\u009dñìûÖ \u0012\u0016\u008aJÊr6õ<\"ô\u0000Z\u001dïDú%çsû²Â\t\u008bb\u001fÛ¬04ËW«§\u0000k³ÚúÐ§\u0016QC\u0085\u0092#[\u0013\u001eòüý\u0098ë9¹J¶ÒÉ3\u000eZ|>ÁÉ\u0001\u0016F\n\u0006Ò\u0017=Q\u007föú¼1\u000fgH\u0083G\u008dõRË\u0094ÆAÞFÄ\u00802R\u000b\u0014x§\u009f/o\u0099Ï\u0012&\u008cÆ\u0096PmRHù\u0017DñË\u0090\u0083\u009f\u0093Ö[\u0000¼!(xU\u001eé+¡k\u0015®j(:â6\u0003ñ\u0017±£\u00ad÷\u00148©Y¡\u0002¤\u0010\u000e¶S)\u001e\u0099ê\u0015\u0099\fã/)\u0093¡\br\u0082\u00194½\\_>\u0088\u0017ï|\u0083wå\u009fP\u0003!\u009f\u0096û\u0099×\t:,=w>ü\u0089ÍÍ\nÙ}þÆò\u0097c*5sW×qÃ·p·£\u008b2;Ð·«ÞÕòìÇ\u0089¶D[Kà\u009f\u0014²3l¿=*ÒÊ$/F\u0097Ñs¼0\u0082\u009di*%\u0004\týgõ2)üÚ}KÃ1\u0006»\u0086\u000fpD\u00940è< ©\u0010©)õ\u008aB\u0014\u009f;xG}\u0092é¥ìdÒ¢\u0081ÌE\"£/ã \f*Å\"ùéB{\u001eöË\u009fÔ\u008eÀ×_ü\u008bì\tÆ¹\u0092hÇ\u000e\u001d\u00ad-(T\u0086ºj\r\u007fåEÎ§¿\u001c90÷Cª×\u008ekT\u0001\u0016/ï\u0002½\u0014eéÞK\u0083\u0010q¯Ö\u001apMC<x*·\u0017m\u0017hhÒ.X\u008f\u0086þY\u0089jY(§³G\u0094ÛaBr\r#\u0091G]¦£/¦ÁÂÇ\u0086!ð\u000e\u0083n|¦Êª.S°õ©\b0«z{ä«\u0093md\f\u001cY\u0013:Í¯gùÏ¿s+\u0017\u0086^\u000e°\u0019R<M°\u0010«V6Ã0·kÓ'«37Õ\u0097a@©$¯Î}ÜæbÈ.n¾0\u0000\u0002ï\u001d\u0010\u0001BdU\u009c¢+\u0006ÿ3\u001b)¿i\u0096ä['q¬\u0095 .H\u0087'+è\u008d\u009eòh\u008djé\u0095b£\u000f\u0099x\u009e\u008bÓ½.D§ÿ \u000e MlQ\u0001\u008d:FK\u0004=)\u0003¯âcF¢;\u0004ù4_m2Å\u0082ÜÙ&Beú~\u0005\u0091æ^\u0083Ç\u0092{ZÐ\u0098ú(â[\u008eç\u0090c\u009c.ù\rcÖ\u0006¯°F\u0081E\u0096qU\u008bèÞFNNxÐ\u0094î!`P¥>0½GxTµ\u008e]Údê)a\u001b\u0083¢MK´\u00006)\u0090¼\u001aÖî§\u009b¢ê\\\u0000v£\u0086\u0003\u0097`÷ÜM\u0010ðÇ¾\u009c²yõ/\u0000hî±å\u001bN¤»\u0012ÇBpÓ\u0098.úMçxãÀSÜhàV\u0084\u0080Ï\u0085úU3$ûuü\u009e%\u0089\u0096uxÜ\u0000ýèq®þ\u0090\u008b\u00adª$Ðè\u0086\u0012ý¥ÿà-w×\u0098¢jUàRóàpQ\u009b:Þÿ\u0089dÄI\u0012öaÜf\u0016ÃK.(\u00ad`9º\u0094µ¡E\röä³¬UúäWg8È\u0011æü\u0005¿\u008ajþA´mèÚ\u001b.üz)J\u008f5ÿ\r;®\u007fÃNè\u0011\u008d3\u001e\u008e\u001dÝ\u0080;\u009a»*\u0094ùLDQÌ5\u009e\u0091j\u008f\u0019²* \u008ayte_{©ÜD@:\u008dk+'íáôÅ\u008aÚ& 9Ó#\u00959_\u0085«ôh\u008e\u0005iò·\u00ad\u0012ú\u009e\u0013²«ßÎá\u0091\u0087\u0007l¼Ï¹\";¬äÖ'\t\u0083y¨p\u0004Mm0\u0000\u0082\u0000\u009cT`è{I\u009e\u001d_Ë\u0013õÅ¤O\u0098%G\rL+\u000bó{°\u009cF\r|Ádáäøø\u0096¢«õÇl¢Ó\u0012\u0016\u001dÎAZ ô×~Árf\u009c@Ò\u0097Ô°ðÞB¬\"à4¯\u0011x\u0084Ö\u0017\u007f @O\u009do\u0002ôÛjÈðm¢\u0084rTàZ²\u001e G~®L\u0082íÎg1YEûVá´Ä\u0003é\u008cÍºFåÀ÷°ÄÖ\u0095 @\u008d\u001aÿ\u0011\u0003\u0091\u0000\u000eÅ¨\u0095\u0004ÇÂ²×ºÖfÐ\u0091Ï\u001cTþÌ\u0089\u00009]\u0085\u000e\u0006\u0012\u0084%Ñ\tGg¾uÃ¨Tí\u0011\u0084»\u00986¾»\u0091!«,44«\u001e-{s+ÞÖNÛ\u0085×H2®\u00838K\u0095\u008dä\u0089\fÂA\u0015s«ªVÙÐ\u0088ù&çyï`Pwà\u0080½9lö\u008d«ë§®Y¿¶:Ú*\u001fÑµ¶Ì\u0089Èo\u0019\u008cú7õ \u0090Å\u0006õ\u0012 ß\u0090øÝÀv\u001a¬ÎèGwP\u009bõFÿ\u0086G»\u0000vC´¶\u0012A\u0014\u007f×Kýñ\u0097\u009b×¾!\u0005$ÓÞl\f\u0003o4' oÈ\\\u008f\u008c#-þS7\u0080µ_\u0095L=\u009ew\u009bÚM\u0085\u009cóË\u009eÍcË\u0018;\t¼¤s\u0093 ÈÀ)ÒNÛ«\u0083¥6à\u001eÃÕy´¹»Qój$\u009f)\u0084vm\u001c¨Âi×\u008b²±o,IvWW\u009cmøpûN\u0015Aýp¹º¨Ë¥9Þ¾\u00156\u00ad\u00ad\u0002b\u0086ó\u0089!\u0081\u0089_¨\u0083\u0091\u0017ø2*+6Þ³Åþ½£×Ó\u0097\u0097JdH^uP\u0098 0N ,R\u000f\u0091\u00941¦\u001a\n6\u0004Ü¨ f\u0098?P³îAà\u0095Nä\rË\u0003Þ¢S\u008f]ó\u009ba)\u001aj\u001b.×°f!\u008e&\na¢\u0002}ô|;´1Äx\u0099c¤eß\u00887ï\u0015~ÕrK\u0099èÖI{\u0083Î1\u0004°CÄ\u0094\u0003)Ê!\u0004l\u0082Áß®+\u0016\\?ùup§u<ÊO;|³)¦\u001e\tYb-Ó©4µÆj\n«:\f7\u0015åf\u0006ba\bh°\u001e\u0013ö\u009cGcoA6H@b\u00859.D|àN\u0093t¢,c8ÑÖ~ðÞ\u0091´Q\u009e\u007f\u0002£5Èyî.\u0014Z\u0081f]\u0086\u0011§f\u009aQ\u008bÞ\u0097tj#äcÙÒL\u009cóÎ/ëãÖmðÅyWô9\u0096\u0010\u0080Ùá¾6Am-lë7\u008e¦¢Í-L¦\u0001nHid¯\u001fê\u0088\u000bFþ\u0095\u009e\u0094\u0006¼\u0089u½W\b\u0089»nÊ¸\u0019\u0001£\u0010¨X\u0084I\u008aïå  #Go\u0012f£*\u001f:6o;\u009a5 §Àn¶*\u009e\u008bîÀûnÀ\u001d\u008b._\u001câ$siù¾Ý @\u008aZ^\u0086\u0091]×\u0084u\n~\u000eø\u001f¢6\u0012o\u0011\u0085MÕ¡$ëeÇ2&Ñä\u009d\u000b\u0013&â\u0084\u008cBÿ2 \u0017óã·\u0084ù0ÚcFrÈ×Ga¹é\u009eä¿X\u0012\u0085MYû\b}I$\u0012Ð¢)ê\u001cæÄÙêW5\bIýû}ipñý\\ò\u001cV¾Þ´F×K{Ìî2S7\u0086\u0016û=Í¯ò]drÝDæ]ò\u0006#\u00862INhdpÊD\u0090^]G\b¦\u00130¤\u009b2gmgÑ\u0096\\õKVoB b\u001do\u009f|wúa.Zê}\u0019î\u0010Wø\u0011Këg!\u008f\u008aàÒ!ë\u0000\nþ¼+\u0094È(ñ®ÝÚgI\t=9;òEôs\u0096èÑ\u009d\u0006\u0081Æ\u008eBè\\]Â2Ò¯\u0099\u0097È&8\u0018QWq-ë3ò\f\u0010NòY\u0014Qÿ\u0014á\u00078ÞI}\u00adcëú\\\u008dÒ,è\u008a>\u0005bdi\u0002ò±Ù\u000e\u0001\u0092\u0095\u001d\u007fØiwh\u0085\u009ba·Yèö\t\u009dh,\u0087¨7T\u0099\u0097\u0015\u0084\u0012L<\u008eÉïU\\L¬ò\u008fý\u0002#ß¼º\u0096\u008f<\u0014¢\u000e\u009dhëm4É\u000b¢ó=J\u009b\u0097\u0006·¹Ð\u008c ã#=k\u001fe\u0007ª.Ê\u001a\u0098õ¬î\u0000\u009eäH\u001fÏ!3ôSý\u001cÌSoá\u0000#®Æ³\u0090\u008c\u0086\u0099@b\u0090ÜÛÔ#ÕÃ\u001a÷¸.5ô\u0092å*úÊ\fÐåºÞ©\u000b±5j|R+nú¦\u0011ÚeÏ\u0099uDøuh©E\u000b\u0004Á¦]f¸\u0086\"\u00adÞ¡?~?#\u0002\u0001Ê«8\"¤ãwð+³¾\u009bQ1³sh zý×«\\>W\b\u008b'ñ-\u0014ý'\u0018Ã\u008eëC4[\u0093R\t\bÍÖ?³©¸ÈÉü¢\u0080\u0088!sîõ°tÑÀN\u0005\u0084Ú\n\nSFàö0~\u00adª A úcÀ5Y,þ¨\u0096\u0097Rjxi»Þ\u0005\u0081åß\u0080\u0010ö\u0088R\u0086\u009c0\r½ñ¤};8ÎL]Eþ[\u009d\u001aÌ\u0017ç`°Õ8\u0018çK@û\u0084)À¸¢\u0018~Vw0qtoe6Á@ù\u0083\u0084(óº&O^©Î¬µqQàrÊ¡¤bÎ9?*e\bOåÀ\u0082É\u0011@\u001e]²MÙ?¶\u008dôx¤WRR\u0016µÖô\u009bEñHßC`·K#\u0093:\u0007%é;ô%{hvþJ«\u001fç¿rÕô=:êÉê¥\u009f-*9s\tDw\u0007h\u0085\u00827\u0099:?&fIG¦°Y±\fº\u001bä\u0004\u00ad]Î\u001b\u009d\u0002¢ç=\u009fi¦þ\u0096è¡ÃÆX·\u0091\u0099Ù°y©¿Ð\u0080\u000eí\u0099¿\u0098l8(EÅô«ÿ@ë\u0097(³\u0003\u00adn3\bï9ç£C*p\u0014@*^\u000b.æ*ê\u009b\u0011ä\u0099Ì,Ú¢Í[Ó\u008c´É'Ú\u0094\u0085çbs\u0005\u001b.Ã\u0084r¨Þ\u0095ÏlgM\u0094²]\u0084Ø\u000bï¤TKäk7år\u0087ÎH\u0000ö3\u009díI²ÎµtjP©ç\u001a\u008f\u0004<èT\u0087/YK¹£Z\u0006½\u0090(h\u0091ò³H¡\fN±&\u0097À\u0019\u0013ìÓ8F9gæÈ\u009ft5b³ùÀ\u008d¼åÞ~I\u0006v¢¸k\u009fz;0zoïÄ«\u0001}a\u0002Q\u001as\u0002\u0096\u0084¢\u0082\u0012\u0006ÛÈ:´&\u0097\u0013î·ó[\u0003-6<ÎÆt¥ÈþÐ\tU\u00ad\töj\u0089\u0096#¨8¨\u0014W/1\fÄ@\u0090±Â\u0012c¸=k+LóG\u0014êKC?\b\u009c8ïÖ|ðÛ\u0096ÞYt\u009c\u001fUÖóKÊëµ+9ãAñÔ¬Y ÐëO2À^ôªó|î\\Ý¼áKë\u000b\u0091þ¬\u0086Å}â~ýº`\u0088ô\u0010´\u009a3úG\u001f«&ï@\u001a*\u008fz\u0002(4Øwµm\u001cIø\u0013oÖê6cJÎJ\u009dv£¬Ìì\u0002\u0007\u0085änÖîÛS\u0003\u0097¥M\u008b±ewåV5(\u0000\r6v\u008f\u0012î\u0019êäV\u000bG*È\u008dgÆä¨Î\u0003,à\niÏ\u008f¿¹(¤\u0085ãoå\u001e7\u008e²Ø\u0092<Ù\u001eoÄÞ(â\u007f\u001b'rÉ-¾Îé\n}vµ\u0014'&\u008aX\u001f&g\u0085¶Cv\u00190\u0018ò\u0000ðº\u0096öTù\u0093/÷]\u00872`ÁAâ+û\u000eñ¼ ò¦Å\u008e\u0086\u0094õ®ó0\u0099énî\u008bæ¬\u008f!ÑÎ¤\u0099÷{4Y³d\u0001UÑ\u009a»½#rÀ+\u0096ÒN\u009bPÏ\u0094\u000e\u009d\u0005ì\u0006Ý\u00861\u0015KyF©\rµ\u0096\u0084±-Cÿ^¼âmµEwë]¨ÂèmMòê\u0013Åm\u001dHj\u0014\u001b\u0082\u0017\f\u0013\u009eæðÃ\u0099ÝW\u0014{\u0011MU\u00903ÀíYè¯øÐ\u0093ÁÁ:\t[Z;\tèö\u009a·:8{Õg¬¸N$L\u0002\u0015àì\u0097ÑF\u008bl\u0001ð:\nD\b2\u0086å¬À\u0019:ÛàÝWwµy³Ü\u008e\u0004îÍ×èt|æ\u000fÊß0Ë?#5!éw}\u0089ëÞÉ\n\u00984ÈUl&\u0087X]&ª\u008a/Lgý|!Ó(UQ\u0082\u008cpQu5\fð?\u0081Sq\u0086ú[7\u008ffÈ\u009dº\u0001Íz¯\u0001÷vY'J\u0086_\u0005\u0087]nõ]2âÚÔz\u001a\u0084\u009c\u0084\u0015ç¼\r\u0087-8])\u0001Âa\u0007¹è\u0086NH\u001dÀ+D\u0005«Íú\u0002\u008f À;cs.6\u0004x96{\u0088dG+\u0001\u0006B\u0098\u009aüIÎ|Cii°É\u0016T\u00003<Côº\u0088\f\u0093N«\u0003Öå³Áê[Ä7\bô¢\u0017\u0006¬Â\u0017×p*dpÛñ\u000fzä^ý¤ô\u009cËB6=\u001dz×\fÕ\u001a\u0094êz\u0015û\u0097Ý\u0086\u001eS\u000eÓ\u0013Z\u00181^ÞFú\u0011\u009b\u0088;P[\u009fhB0×U·N£F\u0091\u0080³'i\u008d\u001d\u008aùÊqz\u0017À\u0080|G+\u0086ü\u009d\u001bP¯Ö\u0006<µð\u0005J*b{ÉÌ#ïf\u009cW<MãHç\u0012\u0093\u0090\u008f\u008ejól¥E2`È\u009b\u0087\u0092CÎ\u0013\r#-ÜN}J#ò´:Îý\u008d\u0089v\u0013Xäaþã¢ì1ç®²\u0093§f\u009c¿\u0088\u008e¥Ñ[ã\u008eÞ\u009bü\r\u0080¢¨j\u0085r\u001fJ;\u0005\u0082iÑ\u0097)\u0098\u0091J@ýOZ\u0097ê\u0014ù\u000eJ\u0017*|:Ñ%©t^Ú\u009b\u0083À\u0096\u0015Eã\u008c\rÙ\u0084\u000eÑ±\u0003,¶\u0088\u001adï)Þ\u0086ÇÊÆ·\u007fÒ\u0002§Ü\u0015\u0002>ß\u0007¥ÿ\u008a±ô¶1\n»¥Ï\u008fheìfÁ»\u0005éñ]\u0094v\u009c\u008eZXÿ\u0011Z\u0098\u0017®ñ\u0097\u0093)\u009bÇ²ðïÎÙ\u0081ÁaON¤S\u009c\u008d\u0091x,Yä^\u0084\u0002RìF\u0095§ãjí)¢\u001dT\u0083\u009a\u009f.jÇ\t\u0012Ã\u0003½¬+W\u0018¬U\f¢Àùeyúª\u0007ÊC\u0005ðþÃª÷$\u0088«*1¨\u0015\u009fZ\u001a\f\u009fâ\u0016¯Åtój¸Ð±\u000e\u0010JÒ3<NU\u0089áfçÞ\u0086\u0087mãïÑ&Ó&»ÌÎIý\u0012E\u001cßá¶¦Þ3Ù¯%£Å\u0001 \u0093Âù\u008a>$½;CbÃ0Z¤ Ð{\u0005Qî\u008f]^wV\nrzßÛ\u001a´\u001fDÝ\u0014\u008f \u009dÁ¾qp¡\u0001åp\u00adNóB£\u001cµº\u000f%¶å»\bUdØÐZ8ó\u0087\u009dS\u009aö\u008dsE8øu²DÉÈ{S¢\u0011\u0086\u008f£®\u0001\u008a¡\u001b`\u008d§\u009e\u0094F\u0003hUÿ;\u008aåpíËÜ\u0016\u0013=U\u0004\u009e\u001a\r]ç¯Ì¾ùñ7\u008d9Û\u009d\"lö\u008cò\u0007\u0006\u0091\u0097\u0085V:SnîÍ\u0010åÐßo£^ïAÛ\u0016VeAA\u0098º7\u0001\u0015¾úØùF±ÊXÑÎ\u0012\u0003\u0086Ç\u0094t)1n\u009b\u009249y÷\u008eª\t\u00892Séó\u009aö\u0017\u009cY\u0003d\u001a_\u0012\u0095Fü\u0095ÿ\u0018\u0092-á¶Tã\u009eí\u008b3Üºt6\u0088I\u008dõ\u001c\u0002Ó;Ï')`\u0013Qþ\u001d\u0091¬h\u0097b¹DbY\u0003^»\u0016\u0003\u0081O«ÇÜ\u001eÑ¹M²Ý %y¥\rL.)\u008e#\u008ax×:àß\u0089]Ý~4\u0086áPá8ý¹\u000e\u000e\u009e\u0084\u0092¬Ô|üíbk¢\u0090$H\u0016ïÀk¶\u0007\u009a\"ïx}x|þõT{\u0095é\u0016YL\u0093\u001dq3\u0011û$f\u0099M'Wu\u001d mØIzAÇ3 §®O\u0086þ\u0094ò\u008f5\u0011¦h\u008aßsáTj;È/\u008fB\u009b\u0004±>\n\t1q0\u009a\u0088¸«yÑ\u008b´\f\u000bæÙ\u0003«\u0096µ8àIt¬\u0001áðw&´\u0097E°ÆÁ\u0098PWå^mjØ\u0096È§\u0095þ.rèA[\u0092\u007f=\u0094UâÔXÖVók\u007f)\u009a78òpÃU{d±e\u0015o-\u001dyà\u0097L\r:åO¡\u0006ÓÇ×K,\u0012\u0002+)«\u0019§+â1\u0087\u0015u$2$\b\u000fLQ\u0019\bT>wÒë3\u0001Í\u0086x\u0010¼\u0018ýðè\u0080ip-Ôk=o.ðß\u0017@\u0096\u0094ÁÒ\u0092Ã\\\u009aI[ñº^Mþð\u0081\u009bXè\u0087Ûò¸@\nc1909\u008e$\u00ad)\u0014?±ä¼&¹oß\u0081O N¼Ü\bî@ûÝRòÍÐ\u0081\u0084²'É\u001b\u008d%Tû)\u009eÌ¸\u000eÅ$¢\u009f\u0002CÅ\b%\u0081¤\u0096ZêúØ)aõÛ?·³_ÔkÒ±ÉÙNkWßåÖå´:1Í<Ìd®Wh\u0099Hû9RKÍ\u0002\u0087\u0093°E\fr\u0010êlÁÃ\u0015ÿáÂ\u008dxÁr\"^C\u000eV@i\u008e+Ê{\u009fö\u00adGão27*A¡¡\b.\u0003z|WÚ¥sÃ¥\u009b\u0015Zr\u009e .Ü\u0091\u008fõ»'\u009b`\u0011Å[î\u0085¯ÅÂ\u008eÖú\u008eöqT$\u001f\u0013E\u0091\u0092¬åù/kêµÍ§\u0016\u001e\u001d\u008a¡6½\u001a\u00ad£\u000eÓJ÷ùl\u001aº\u0098êc\u001dÄU×ÎGL¨a\u008c#u\u008c`*Ý\fÂ\u009c\rîGÜrw©\u008fùéÌ\u0098ê]9ê\u009c®ò£F¨\u001c\u0014\rz\u000fä\u0086\u0093\bmb\u0015\u0014<\u0019ç\u0005$\u008aa3\u00ad\u001d¦\u0006a\u0097\u007f\u008d¡Úb²®\u0097ÝJeL;s6\u0019¤n\u000eÅ&º\rI÷H\u008b\u0011¸à»\u0005bm£Üúí¯÷\u009a¯Ê(ÖÄx©Ì_¤ãÏÞl\bÇ.Ì\u0090\u008e\u0006H\u0017\u001c\u0092\u001c®e\u0084\u0081Wú\u000117¾Yµ6z×µ¤+\u00802YVñë¼öaÖmwÐ¨L\u0090\u008e\u008b\u008c\u0089\n\bØ\tF\u0083mÆ~\u009c¨Ò¸;\u0016®½\u0099\u008bPÐA6C_ºâÐr\u0091¸:Vê·\u001b æLC*4ÝØfnC¼\u0018«§}oEÌ6ös\u0080\u008b@\u0099\u001eÑËÙ¶g\u0006_Z°¨ìÅ£c¾ugEjè6F^\u0082\u0097Â\u009fZ1ÊùF¼ñ(L\u0090ÏúÉSXì\"\u0080\u009b\u0017É]ë?Ð,\u0084Èÿþ½\u0087'\u0017\u009fµ\u0083Ít\\Ó*ÙöHRÆ²\u0016ôÆÖ\u0006OmXþ\u0091\b¹êo5JÁÀä\u000e}ð7e³ìX\b\u0007jjÁ×ë´Jk\u009büÞñLsÎ\u0089\u0098làÈh¢\u0093D\u007fE\u009a/ö\u008f\u001eªÓÒ,c\u0014½\f\u009aT:Ã\u0002ôò!\u0012\u009cül%È\u0087%xC\u008fÅ.fG[v8]'\u0080{¶-¼iÎÞ\u001f¬¿\u0007çb4\u0095¬\u0010øJ\u008bÛñ-â<É\fÒÓ0x \u008f»Ï\u0097ÁCk6(¦5UÈ,0\u0098Ù\u0014\u0081=â3ñ\u00ad ø\u0001ìC\u00154\u0083¹:©þTÜ\t\u001a\u0083\u008e0\u0081íí®ìøZÕ Ã\u0017\tÝÚ\u007f\u0005\u0017é\u000e8~\tz+Îs\u000ek»J\u008c\u0001\u0015Rp\u0017VôD8\u008c\u009fIª\u001f¤Z\u000frxFNe´êÜ\u0083\u0012´2\u0084\u0000Æ\u0099Ðr·3°0\u008f\u0012à1oAe´¹\u0019I\u000fºÞwÞp´m\u0013c\u0017Ý\u008aÎK\tø£\u007f\u00adj\u0017JªôÅ:¬;\u0004V\u0002\u0005\u0017nEÎ&ä5»\u0092ì\u008c\u00adÕ^«¡\u001e\u0015Oú;¿qIñ\u0098?RyÎ#û$C¸im[ü\u0011\u0092è'wBË\u0088§\u0001S\u0098t\u008b\u0084Î\u0001>\u0015\u009f9fî&\u0084\u0089øÙ\u0091\u008eÃQLðWL©D \u0001\u007f\u0081\u008dè`c`\u008fåØ*Ê\u008a  [²ÆþF\u0092«¶ºîÇX\u0083p\fÙ\u0001ÓUx\u0001C@×\u0098\u001f\u0007ÿx¢Æq\u008f`¸\u008d\u009aAÁg\u000f6\\\u0093Ì\\ë\u0086\u0016uNú\u001e=pöÖJ<\u0085\u0019\u001aL¥ÉÌë[\t·¿bð\u0089 °¯\u009cú\u0004Ad±°©jtfSJ*)È\u0019\u0087!H0ö]\u0098aLBlâbì\u009c»ËÍ*\u0086eÕ2Õ%?j\u0092ü:ê]\u0094D(S\u0084¸i\u0086=^m\u001eÂ\u008aÝØÂb¸ýª\u0086\u0087\u009e¾\u0085¸Y\u0093I(þ¤`H^\u009eÊ}Î(\u0092n\u0099¹'z\u0097Ç\u0091»lÆ¯ªÊ\rH¥íé>\u009c\u0000×zëË\n%Ø·\u009c^N\u0083\u00895¾\u0019\u000bÃÚÉÇlº\u008a\u008c|x\u000em>sfù\u0010n\u0090¯\u001em¨\b\u0015ÃþD´ýÇollC7\u0081LñÈ\u0082\u0085Õ)Ä¹å\u0019¹wY*\u0081Ï\u0082\u008c4¦=i·b=7é\u008e¾>m\u0011ç°\u00adÊ#;ëüñ6>\u008b\u009eá\u0015Nô\u0091Å1q\u009c\"1ÁbBWÎ8Ä\u0097è]´\u007f÷\u0087°zç6\u0091x\u008f6#\u0088*G*\u0001ÁBb\u009fí6uµüfU¡ß\u008e@\u0090è·\u0001\rä\u0003[º\u008a\u0081XZ\u0011Ùf\\\u008d&Ì\u0082ÏÉñx\u0093r(HB\u000f(\u0092pP%]pçÙh÷°»ú0ïµh±AWÐJ¸Í_ã{Ñ{nñü1P}Îk\u0092ä\t\u008a£dåsÃ/\u0017Q\u008eN2«\u009e¤¸áIæTx¤\u0095\u009cY\u0092k*¿\u0087\u0083,î\u0011Úçe}\u0007%ï1ì\u0084ê Äq\u001f\n<.\u0085G9v=/\u0013{\u0010þ@¾Ót\u009do\u001ew\u0015\u0089<ìØ+¶ÂAÿc\u009f¢ÎåùÏIïRr¢;YÅ\u008dð\u008a\u008f±Ä\u008f\b¡¢½\fýÈ¸\u0096±\u001béa?eh»Ñ:\u008fÚ¢£\u0015P\u001af§-:8\u0095\u0083Ë)(\u0095\u0089Ù®Ê\u008e\u0086!Ñ\t¦OùOpÕ2»<\u0001ÖZ×\u0081\u008fZWn*\u0017[Ä\u001c$\u001fsÁ¥àþùÐ¶ª¯vAÐ´\t×\u008dBz¬ï[\u0002¾â*æ\u0017âã|âc?\u000e)½\u0094÷èä@\r\u0084Àh¸¯\u0093½('¨ðA\u0080\u0019\u0006ý´\u0003¿F3f¶b\u0083:ô=Ø$Là\u0017Æ\nm\"}º1)Þ°ªú¥tK<aÌ\u0084£PypÝ\u0097©¼gk_\r×d\u0093¡cA.bJ e%¦ù\u0001\u0011\u008d_÷½g¿±U\u0093\u001c¡ÇS¹ÇV±D_\u0005kmÜS³qû²½+ñ\u0006\"\u0015«Åâa"
                     .length();
                  var1 = 11015;
                  var8 = -1;
            }

            var10000 = 49;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 19673) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 9;
            case 1 -> 148;
            case 2 -> 110;
            case 3 -> 122;
            case 4 -> 135;
            case 5 -> 231;
            case 6 -> 112;
            case 7 -> 53;
            case 8 -> 236;
            case 9 -> 100;
            case 10 -> 159;
            case 11 -> 81;
            case 12 -> 59;
            case 13 -> 117;
            case 14 -> 140;
            case 15 -> 22;
            case 16 -> 134;
            case 17 -> 218;
            case 18 -> 124;
            case 19 -> 233;
            case 20 -> 3;
            case 21 -> 70;
            case 22 -> 65;
            case 23 -> 164;
            case 24 -> 55;
            case 25 -> 23;
            case 26 -> 94;
            case 27 -> 211;
            case 28 -> 76;
            case 29 -> 98;
            case 30 -> 215;
            case 31 -> 180;
            case 32 -> 21;
            case 33 -> 47;
            case 34 -> 202;
            case 35 -> 212;
            case 36 -> 156;
            case 37 -> 201;
            case 38 -> 144;
            case 39 -> 108;
            case 40 -> 221;
            case 41 -> 36;
            case 42 -> 166;
            case 43 -> 63;
            case 44 -> 10;
            case 45 -> 191;
            case 46 -> 253;
            case 47 -> 162;
            case 48 -> 39;
            case 49 -> 4;
            case 50 -> 104;
            case 51 -> 175;
            case 52 -> 31;
            case 53 -> 163;
            case 54 -> 106;
            case 55 -> 114;
            case 56 -> 225;
            case 57 -> 69;
            case 58 -> 89;
            case 59 -> 235;
            case 60 -> 230;
            case 61 -> 138;
            case 62 -> 196;
            case 63 -> 77;
            case 64 -> 71;
            case 65 -> 167;
            case 66 -> 182;
            case 67 -> 157;
            case 68 -> 141;
            case 69 -> 242;
            case 70 -> 92;
            case 71 -> 73;
            case 72 -> 91;
            case 73 -> 116;
            case 74 -> 240;
            case 75 -> 18;
            case 76 -> 5;
            case 77 -> 113;
            case 78 -> 169;
            case 79 -> 28;
            case 80 -> 52;
            case 81 -> 171;
            case 82 -> 173;
            case 83 -> 15;
            case 84 -> 1;
            case 85 -> 213;
            case 86 -> 188;
            case 87 -> 205;
            case 88 -> 33;
            case 89 -> 60;
            case 90 -> 193;
            case 91 -> 40;
            case 92 -> 42;
            case 93 -> 101;
            case 94 -> 51;
            case 95 -> 184;
            case 96 -> 132;
            case 97 -> 250;
            case 98 -> 43;
            case 99 -> 38;
            case 100 -> 139;
            case 101 -> 25;
            case 102 -> 72;
            case 103 -> 0;
            case 104 -> 252;
            case 105 -> 137;
            case 106 -> 8;
            case 107 -> 179;
            case 108 -> 119;
            case 109 -> 37;
            case 110 -> 105;
            case 111 -> 80;
            case 112 -> 93;
            case 113 -> 66;
            case 114 -> 75;
            case 115 -> 111;
            case 116 -> 19;
            case 117 -> 246;
            case 118 -> 11;
            case 119 -> 186;
            case 120 -> 189;
            case 121 -> 165;
            case 122 -> 126;
            case 123 -> 146;
            case 124 -> 219;
            case 125 -> 49;
            case 126 -> 194;
            case 127 -> 207;
            case 128 -> 152;
            case 129 -> 198;
            case 130 -> 99;
            case 131 -> 177;
            case 132 -> 245;
            case 133 -> 133;
            case 134 -> 46;
            case 135 -> 13;
            case 136 -> 183;
            case 137 -> 208;
            case 138 -> 172;
            case 139 -> 160;
            case 140 -> 187;
            case 141 -> 30;
            case 142 -> 145;
            case 143 -> 26;
            case 144 -> 84;
            case 145 -> 197;
            case 146 -> 14;
            case 147 -> 83;
            case 148 -> 109;
            case 149 -> 6;
            case 150 -> 87;
            case 151 -> 241;
            case 152 -> 90;
            case 153 -> 56;
            case 154 -> 62;
            case 155 -> 130;
            case 156 -> 12;
            case 157 -> 174;
            case 158 -> 50;
            case 159 -> 48;
            case 160 -> 68;
            case 161 -> 217;
            case 162 -> 96;
            case 163 -> 102;
            case 164 -> 41;
            case 165 -> 153;
            case 166 -> 29;
            case 167 -> 2;
            case 168 -> 79;
            case 169 -> 214;
            case 170 -> 97;
            case 171 -> 136;
            case 172 -> 234;
            case 173 -> 123;
            case 174 -> 61;
            case 175 -> 155;
            case 176 -> 27;
            case 177 -> 243;
            case 178 -> 154;
            case 179 -> 226;
            case 180 -> 147;
            case 181 -> 170;
            case 182 -> 44;
            case 183 -> 195;
            case 184 -> 204;
            case 185 -> 115;
            case 186 -> 107;
            case 187 -> 88;
            case 188 -> 216;
            case 189 -> 185;
            case 190 -> 17;
            case 191 -> 24;
            case 192 -> 78;
            case 193 -> 222;
            case 194 -> 209;
            case 195 -> 7;
            case 196 -> 224;
            case 197 -> 199;
            case 198 -> 34;
            case 199 -> 176;
            case 200 -> 238;
            case 201 -> 95;
            case 202 -> 131;
            case 203 -> 181;
            case 204 -> 121;
            case 205 -> 168;
            case 206 -> 206;
            case 207 -> 58;
            case 208 -> 57;
            case 209 -> 16;
            case 210 -> 228;
            case 211 -> 232;
            case 212 -> 223;
            case 213 -> 45;
            case 214 -> 143;
            case 215 -> 220;
            case 216 -> 35;
            case 217 -> 67;
            case 218 -> 190;
            case 219 -> 151;
            case 220 -> 20;
            case 221 -> 82;
            case 222 -> 142;
            case 223 -> 129;
            case 224 -> 86;
            case 225 -> 248;
            case 226 -> 127;
            case 227 -> 247;
            case 228 -> 255;
            case 229 -> 210;
            case 230 -> 200;
            case 231 -> 192;
            case 232 -> 149;
            case 233 -> 203;
            case 234 -> 128;
            case 235 -> 249;
            case 236 -> 251;
            case 237 -> 150;
            case 238 -> 229;
            case 239 -> 74;
            case 240 -> 244;
            case 241 -> 64;
            case 242 -> 178;
            case 243 -> 239;
            case 244 -> 227;
            case 245 -> 254;
            case 246 -> 158;
            case 247 -> 161;
            case 248 -> 32;
            case 249 -> 118;
            case 250 -> 103;
            case 251 -> 125;
            case 252 -> 237;
            case 253 -> 54;
            case 254 -> 85;
            default -> 120;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private final float IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final float lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final float IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final float lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final float IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private final float IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private final float IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private final float lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      private final float IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      private final float llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      private final float lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11
      ) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var6;
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var7;
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var8;
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var9;
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var10;
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var11;
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

      public final float g() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      public final float h() {
         return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      public final float i() {
         return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      public final float j() {
         return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }

      public final float k() {
         return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      }

      public final float l() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final float m() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final float n() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final float o() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final float p() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final float q() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final float r() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      public final float s() {
         return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      public final float t() {
         return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      public final float u() {
         return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }

      public final float v() {
         return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      }

      @NotNull
      public final IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11
      ) {
         return new IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -25451;
         float var1 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
         float var2 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
         float var3 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
         float var4 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
         float var5 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         float var6 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         float var7 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         float var8 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         float var9 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         float var10 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         float var11 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -14409;
         short var10002 = -25455;
         short var10003 = -31462;
         short var10004 = -25454;
         short var10005 = -22767;
         short var10006 = -25456;
         short var10007 = 10585;
         short var10008 = -25443;
         short var10009 = 6855;
         short var10010 = -25444;
         short var10011 = 19771;
         short var10012 = -25450;
         short var10013 = 30620;
         short var10014 = -25452;
         short var10015 = -19116;
         short var10016 = -25453;
         short var10017 = -31760;
         short var10018 = -25442;
         short var10019 = -31478;
         short var10020 = -25449;
         short var10021 = -8628;
         return "LayoutMetrics(scaledWidth="
            + var11
            + ", scaledHeight="
            + var10
            + ", scale="
            + var9
            + ", margin="
            + var8
            + ", logoSize="
            + var7
            + ", buttonWidth="
            + var6
            + ", buttonHeight="
            + var5
            + ", buttonSpacing="
            + var4
            + ", iconButtonSize="
            + var3
            + ", fontSize="
            + var2
            + ", smallFontSize="
            + var1
            + ")";
      }

      @Override
      public int hashCode() {
         IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.g();
         int var2 = Float.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var2 = var2 * 31 + Float.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         var2 = var2 * 31 + Float.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         var2 = var2 * 31 + Float.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         var2 = var2 * 31 + Float.hashCode(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         var2 = var2 * 31 + Float.hashCode(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
         var2 = var2 * 31 + Float.hashCode(this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll);
         var2 = var2 * 31 + Float.hashCode(this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll);
         var2 = var2 * 31 + Float.hashCode(this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII);
         var2 = var2 * 31 + Float.hashCode(this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI);
         var2 = var2 * 31 + Float.hashCode(this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl);
         if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
            IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.b(new int[2]);
         }

         return var2;
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int[] var2 = IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.g();
         Object var10000 = this;
         if (var2 == null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == null) {
            if (!(
               var10000 instanceof IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
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

            var4 = Float.compare(
               this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
               var3.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
            );
         }

         if (var2 == null) {
            if (var4 != 0) {
               return false;
            }

            var4 = Float.compare(
               this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
               var3.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
            );
         }

         if (var2 == null) {
            if (var4 != 0) {
               return false;
            }

            var4 = Float.compare(
               this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
               var3.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            );
         }

         if (var2 == null) {
            if (var4 != 0) {
               return false;
            }

            var4 = Float.compare(
               this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
               var3.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
            );
         }

         if (var2 == null) {
            if (var4 != 0) {
               return false;
            }

            var4 = Float.compare(
               this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
               var3.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
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
         String[] var5 = new String[11];
         int var3 = 0;
         String var2 = "\bÉ\u0083? ù$\u001fÓyu8;Óðb\u001a\u0095úG*Á\u0002\u001bku\u009fj¦ËF£\u0000A4\n²jc\u0012\u0015\u0095o\u000f\u0004g\u0002ê\u0010C\"H\b\u0086~tRÄ¦\u0010Ïcjr;Sóyv\u0086o*Ï³lø\tñ\u007f³ýÎ$9ÕØ\u000fm¬>\u0085±b«}rk1É»s\u009b\b:ÊÔIìû\u0000\u0017\u0011R\u0091Ã\"Y\u0094^ð3ø¤\u0081ôOiNl\u000eÈø\u009b\u0019#=D\u0087ÛsõT\u008fø";
         int var4 = "\bÉ\u0083? ù$\u001fÓyu8;Óðb\u001a\u0095úG*Á\u0002\u001bku\u009fj¦ËF£\u0000A4\n²jc\u0012\u0015\u0095o\u000f\u0004g\u0002ê\u0010C\"H\b\u0086~tRÄ¦\u0010Ïcjr;Sóyv\u0086o*Ï³lø\tñ\u007f³ýÎ$9ÕØ\u000fm¬>\u0085±b«}rk1É»s\u009b\b:ÊÔIìû\u0000\u0017\u0011R\u0091Ã\"Y\u0094^ð3ø¤\u0081ôOiNl\u000eÈø\u009b\u0019#=D\u0087ÛsõT\u008fø"
            .length();
         char var1 = 16;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 52;
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
                        case 0 -> 111;
                        case 1 -> 61;
                        case 2 -> 22;
                        case 3 -> 66;
                        case 4 -> 122;
                        case 5 -> 75;
                        default -> 72;
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
                        b = new String[11];
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

                     var2 = "×Üz\u008bÏ!\u0098wÚ\u008a\b\u000bÈ\u0011\u00932°\r_\u008a\"5\u0017";
                     var4 = "×Üz\u008bÏ!\u0098wÚ\u008a\b\u000bÈ\u0011\u00932°\r_\u008a\"5\u0017".length();
                     var1 = 11;
                     var8 = -1;
               }

               var10000 = 29;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -25452) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 34;
               case 1 -> 189;
               case 2 -> 54;
               case 3 -> 169;
               case 4 -> 6;
               case 5 -> 117;
               case 6 -> 251;
               case 7 -> 26;
               case 8 -> 28;
               case 9 -> 203;
               case 10 -> 98;
               case 11 -> 135;
               case 12 -> 120;
               case 13 -> 1;
               case 14 -> 47;
               case 15 -> 65;
               case 16 -> 179;
               case 17 -> 36;
               case 18 -> 15;
               case 19 -> 68;
               case 20 -> 219;
               case 21 -> 178;
               case 22 -> 157;
               case 23 -> 102;
               case 24 -> 199;
               case 25 -> 46;
               case 26 -> 70;
               case 27 -> 88;
               case 28 -> 115;
               case 29 -> 208;
               case 30 -> 85;
               case 31 -> 134;
               case 32 -> 82;
               case 33 -> 122;
               case 34 -> 191;
               case 35 -> 132;
               case 36 -> 215;
               case 37 -> 64;
               case 38 -> 55;
               case 39 -> 247;
               case 40 -> 87;
               case 41 -> 165;
               case 42 -> 246;
               case 43 -> 3;
               case 44 -> 150;
               case 45 -> 131;
               case 46 -> 108;
               case 47 -> 118;
               case 48 -> 18;
               case 49 -> 107;
               case 50 -> 32;
               case 51 -> 200;
               case 52 -> 240;
               case 53 -> 146;
               case 54 -> 0;
               case 55 -> 30;
               case 56 -> 127;
               case 57 -> 181;
               case 58 -> 95;
               case 59 -> 162;
               case 60 -> 20;
               case 61 -> 141;
               case 62 -> 194;
               case 63 -> 159;
               case 64 -> 61;
               case 65 -> 16;
               case 66 -> 188;
               case 67 -> 214;
               case 68 -> 101;
               case 69 -> 31;
               case 70 -> 71;
               case 71 -> 33;
               case 72 -> 180;
               case 73 -> 86;
               case 74 -> 177;
               case 75 -> 9;
               case 76 -> 174;
               case 77 -> 23;
               case 78 -> 151;
               case 79 -> 147;
               case 80 -> 92;
               case 81 -> 137;
               case 82 -> 11;
               case 83 -> 213;
               case 84 -> 17;
               case 85 -> 204;
               case 86 -> 99;
               case 87 -> 176;
               case 88 -> 186;
               case 89 -> 21;
               case 90 -> 38;
               case 91 -> 155;
               case 92 -> 113;
               case 93 -> 230;
               case 94 -> 129;
               case 95 -> 41;
               case 96 -> 209;
               case 97 -> 196;
               case 98 -> 184;
               case 99 -> 56;
               case 100 -> 103;
               case 101 -> 4;
               case 102 -> 57;
               case 103 -> 152;
               case 104 -> 89;
               case 105 -> 12;
               case 106 -> 78;
               case 107 -> 5;
               case 108 -> 59;
               case 109 -> 232;
               case 110 -> 228;
               case 111 -> 121;
               case 112 -> 212;
               case 113 -> 110;
               case 114 -> 237;
               case 115 -> 7;
               case 116 -> 160;
               case 117 -> 207;
               case 118 -> 27;
               case 119 -> 104;
               case 120 -> 250;
               case 121 -> 153;
               case 122 -> 136;
               case 123 -> 109;
               case 124 -> 248;
               case 125 -> 231;
               case 126 -> 90;
               case 127 -> 195;
               case 128 -> 74;
               case 129 -> 77;
               case 130 -> 35;
               case 131 -> 223;
               case 132 -> 225;
               case 133 -> 217;
               case 134 -> 130;
               case 135 -> 105;
               case 136 -> 139;
               case 137 -> 222;
               case 138 -> 24;
               case 139 -> 29;
               case 140 -> 22;
               case 141 -> 156;
               case 142 -> 244;
               case 143 -> 2;
               case 144 -> 253;
               case 145 -> 69;
               case 146 -> 143;
               case 147 -> 124;
               case 148 -> 148;
               case 149 -> 63;
               case 150 -> 238;
               case 151 -> 172;
               case 152 -> 42;
               case 153 -> 138;
               case 154 -> 171;
               case 155 -> 25;
               case 156 -> 75;
               case 157 -> 173;
               case 158 -> 190;
               case 159 -> 81;
               case 160 -> 49;
               case 161 -> 193;
               case 162 -> 67;
               case 163 -> 183;
               case 164 -> 149;
               case 165 -> 62;
               case 166 -> 166;
               case 167 -> 226;
               case 168 -> 94;
               case 169 -> 161;
               case 170 -> 211;
               case 171 -> 8;
               case 172 -> 76;
               case 173 -> 170;
               case 174 -> 227;
               case 175 -> 91;
               case 176 -> 100;
               case 177 -> 254;
               case 178 -> 125;
               case 179 -> 58;
               case 180 -> 13;
               case 181 -> 45;
               case 182 -> 224;
               case 183 -> 158;
               case 184 -> 51;
               case 185 -> 126;
               case 186 -> 116;
               case 187 -> 164;
               case 188 -> 163;
               case 189 -> 40;
               case 190 -> 252;
               case 191 -> 233;
               case 192 -> 96;
               case 193 -> 83;
               case 194 -> 243;
               case 195 -> 229;
               case 196 -> 185;
               case 197 -> 218;
               case 198 -> 73;
               case 199 -> 106;
               case 200 -> 93;
               case 201 -> 182;
               case 202 -> 205;
               case 203 -> 50;
               case 204 -> 206;
               case 205 -> 60;
               case 206 -> 53;
               case 207 -> 235;
               case 208 -> 202;
               case 209 -> 221;
               case 210 -> 175;
               case 211 -> 43;
               case 212 -> 44;
               case 213 -> 192;
               case 214 -> 167;
               case 215 -> 154;
               case 216 -> 239;
               case 217 -> 220;
               case 218 -> 201;
               case 219 -> 241;
               case 220 -> 210;
               case 221 -> 128;
               case 222 -> 39;
               case 223 -> 80;
               case 224 -> 236;
               case 225 -> 19;
               case 226 -> 119;
               case 227 -> 142;
               case 228 -> 255;
               case 229 -> 48;
               case 230 -> 249;
               case 231 -> 52;
               case 232 -> 84;
               case 233 -> 123;
               case 234 -> 66;
               case 235 -> 14;
               case 236 -> 111;
               case 237 -> 114;
               case 238 -> 97;
               case 239 -> 140;
               case 240 -> 168;
               case 241 -> 112;
               case 242 -> 197;
               case 243 -> 245;
               case 244 -> 133;
               case 245 -> 144;
               case 246 -> 79;
               case 247 -> 242;
               case 248 -> 10;
               case 249 -> 234;
               case 250 -> 145;
               case 251 -> 216;
               case 252 -> 37;
               case 253 -> 187;
               case 254 -> 72;
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
      public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll o, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, int var12, Object var13) {
         short mask = 0;
         if ((mask & 1) != 0) var1 = o.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if ((mask & 2) != 0) var2 = o.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if ((mask & 4) != 0) var3 = o.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if ((mask & 8) != 0) var4 = o.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         if ((mask & 16) != 0) var5 = o.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         if ((mask & 32) != 0) var6 = o.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         if ((mask & 64) != 0) var7 = o.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         if ((mask & 128) != 0) var8 = o.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
         if ((mask & 256) != 0) var9 = o.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
         if ((mask & 512) != 0) var10 = o.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
         if ((mask & 1024) != 0) var11 = o.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
         return o.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
      }
   }
}
