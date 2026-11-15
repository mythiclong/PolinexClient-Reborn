package me.octo.client;

import dev.jnic.PdfVaZ.JNICLoader;
import java.io.InputStream;
import java.util.List;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.JNIC;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.PictureInPictureRendererRegistry.Context;
import net.minecraft.client.gui.render.pip.PictureInPictureRenderer;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII
@SinceKotlin(
   version = "1.1"
)
public final class Polinex implements ModInitializer {
   @Nullable
   public static final List<IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl> j() {
      return Polinex.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @NotNull
   public static Polinex.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final List<String> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = CollectionsKt.listOf("PackCore");
   @NotNull
   public static String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @Nullable
   private static List<IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static String[] a;
   private static String[] b;

   @me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII
   /**
    * Managed reconstruction of the Fabric entrypoint - PARTIAL, and labelled as such.
    *
    * Evidence for this body (nothing here is guessed):
    *  - `Polinex` declares three methods carrying `@SubscribeEvent` (confirmed in the jar), so it is a listener.
    *  - The global event bus lives on the enum constant
    *    `llII...ll.IIIIIIIIIllIlIll....lIIIIIllIIlIlllIllIIIllllIIIII...` and its register API is `a(Object)`.
    *  - Every other listener in this tree registers with exactly `ENUM_CONSTANT.bus.a(this);` - eight such call
      me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a(me.octo.client.lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI); // PX-RESTORE round356: register one module singleton
      me.octo.client.lIIIlllIIIIIIlIlIIlIlIllIIIIlIllllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI.a(true); // PX-RESTORE round362: modules default to disabled (ctor sets false)
      // PX-RESTORE round370: reflective bootstrap for a private-singleton 2-D handler
      try {
         Class<?> pxC = Class.forName("me.octo.client.IIIIlIlIlIIIIlIlIlIIIllIllllllllIIIIIlIIIlIlIIIIIIlllIIlIllIlIllIllIIlIlIlllIlllIIlII");
         java.lang.reflect.Field pxF = pxC.getDeclaredField("IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIl");
         pxF.setAccessible(true);
         Object pxO = pxF.get(null);
         if (pxO != null) {
            me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a(pxO);
            if (pxO instanceof me.octo.client.llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl) {
               ((me.octo.client.llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl)pxO).a(true);
            }
         }
      } catch (Throwable pxT) { System.out.println("[PX] handler bootstrap failed: " + pxT); }
    *    sites exist (e.g. llIlIlIllIIIllllIIIlIIlIlIIlII....java:78).
    *
    * What is NOT reconstructed: the seven private no-argument native methods a()..g(), the three string-pair
    * methods, the PiP factory and the three event-handler bodies. They are unreachable from here because every one
    * of them is `native` and `dev/jnic` binds nothing in this environment, so this entrypoint registers the
    * listener and stops. See CURRENT-STATUS.md; this is a partial restoration, not a complete one.
    */
   public void onInitialize() {
      net.fabricmc.fabric.api.client.rendering.v1.PictureInPictureRendererRegistry.register(Polinex::a); // PX-FIX: without this the PiP state is submitted but never drawn (black screen)
      // PX-FIX r47: the jar's onInitialize() is native - it is what builds the module registry. Touching the
      // module-manager singleton runs its <clinit>, whose constructor creates every module, and each module
      // registers its own keybind through utils.IlllllllIIIl... (e.g. "Pause Macro" / "Polinex Client Misc").
      // Without this reference nothing ever constructs a module, so no mod keybind exists in Controls.
      me.octo.client.IlllIllIllllIIIllIIIIlIlIllIlIlllIlllIlIIllIIlllIllIIIIlllIlIlIIIllllIIIlIIIlIIIIllll pxModuleRegistry =
         me.octo.client.IlllIllIllllIIIllIIIIlIlIllIlIlllIlllIlIIllIIlllIllIIIIlllIlIlIIIllllIIIlIIIlIIIIllll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
      if (pxModuleRegistry != null) {
         System.out.println("[PX] module registry initialised: " + pxModuleRegistry.getClass().getName());
      }
      pxRegisterConfigKeybinds();
      pxInstallKeybindTicker();
      // PX-FIX r50: the jar's native startup also builds the feature-module registry. That registry lives in
      // lIlIllIlIlIllIlllll...llIII and is filled by its <clinit>/loader; touching the list forces it to run,
      // which is what makes the ClickGUI list modules and registers their per-module keybinds.
      System.out.println("[PX] module registry size: " +
         me.octo.client.lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.size());
      me.octo.client.lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.a(); // PX-FIX r51: run the module loader the native startup used to call
      // PX-FIX r734: the jar's native startup loads polinex/config.json after the module registry is built.
      // Config.l() was preserved only as bytecode comments and had no caller, so settings never round-tripped.
      me.octo.client.llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl
         .IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.l();
      // PX-DEBUG r57: deterministic ClickGUI open (key injection is unreliable in the dev harness).
      // Flip PX_DEBUG_OPEN_GUI to false to disable.
      // PX-DEBUG r61: exercise the client command dispatcher once (proves /pnmacro end-to-end without key injection).
      final boolean PX_DEBUG_RUN_COMMAND = false;
      if (PX_DEBUG_RUN_COMMAND) {
         net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.END_CLIENT_TICK.register(pxClient -> {
            if (pxClient.player != null && !pxCommandSent) {
               pxCommandSent = true;
               System.out.println("[PX-DEBUG] sending command pn");
               pxClient.player.connection.sendCommand("pn");
            }
         });
      }

      final boolean PX_DEBUG_OPEN_GUI = false;
      if (PX_DEBUG_OPEN_GUI) {
         net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.END_CLIENT_TICK.register(pxClient -> {
            if (pxClient.player != null && pxClient.screen == null && !pxOpenGuiDone) {
               pxOpenGuiDone = true;
               System.out.println("[PX-DEBUG] opening ClickGUI programmatically");
               pxClient.setScreen(new me.octo.client.lIIlIlIIllIllllIIIllIIIIIlIIlIllIllllIIlllIIIIIlIlIlllIlIIIlllIlIIlIlllllIIlIIIIIIIll());
            }
         });
      }
      me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a(this);
      pxRegisterHandlers();
   }

   /**
    * PX-FIX r48: the original jar registers its keybinds from polinex/config.json (it writes that file itself;
    * every entry carries a GLFW key code, e.g. "GUI Keybind" = 293 = F4). Nothing in the Java tree read it, so
    * Options > Controls showed no mod keybinds. This reads the same file and feeds the mod's keybind registry,
    * which creates the KeyMapping and calls KeyMappingHelper.registerKeyMapping.
    */
   private static void pxRegisterConfigKeybinds() {
      try {
         java.io.File pxDir = new java.io.File(net.minecraft.client.Minecraft.getInstance().gameDirectory, "polinex");
         java.io.File cfg = new java.io.File(pxDir, "config.json");
         if (!cfg.isFile()) {
            System.out.println("[PX] keybind config not found: " + cfg);
            return;
         }

         String json = new String(java.nio.file.Files.readAllBytes(cfg.toPath()), java.nio.charset.StandardCharsets.UTF_8);
         com.google.gson.JsonObject root = com.google.gson.JsonParser.parseString(json).getAsJsonObject();
         if (!root.has("modules")) {
            return;
         }

         me.octo.client.utils.IlllllllIIIlIlllllIIIllIlIIIlIlIlIIllllIlIlIlIlllIIIIlIIlIlllIllllIlIlIIlIIIlIIIIIIll registry =
            me.octo.client.utils.IlllllllIIIlIlllllIIIllIlIIIlIlIlIIllllIlIlIlIlllIIIIlIIlIlllIllllIlIlIIlIIIlIIIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         int registered = 0;
         java.util.HashSet<String> seen = new java.util.HashSet<>();
         for (java.util.Map.Entry<String, com.google.gson.JsonElement> section : root.getAsJsonObject("modules").entrySet()) {
            if (!section.getValue().isJsonArray()) {
               continue;
            }

            for (com.google.gson.JsonElement element : section.getValue().getAsJsonArray()) {
               if (!element.isJsonObject()) {
                  continue;
               }

               com.google.gson.JsonObject entry = element.getAsJsonObject();
               if (!entry.has("name") || !entry.has("keybind")) {
                  continue;
               }

               int key = entry.get("keybind").getAsInt();
               if (key == 0) {
                  continue;
               }

               String name = entry.get("name").getAsString();
               if (!seen.add(name)) {
                  continue;
               }

               registry.a(name, key, section.getKey(), true);
               registered++;
            }
         }

         registry.a();
         System.out.println("[PX] config keybinds registered: " + registered + " (from " + cfg + ")");
      } catch (Throwable var7) {
         System.out.println("[PX] keybind config load failed: " + var7);
      }
   }

   /**
    * PX-FIX r753: the jar polls its registered keybinds from native code that was never restored, so no
    * keybind did anything (the ClickGUI could not be opened by F4 even though "GUI Keybind" = 293 is
    * registered). This restores the documented behaviour of the "GUI Keybind" setting
    * ("Opens the GUI when pressed!") through the same registry the keybinds were registered with.
    */
   private static void pxInstallKeybindTicker() {
      net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.END_CLIENT_TICK.register(pxClient -> {
         if (pxClient.player == null || pxClient.screen != null) {
            return;
         }

         try {
            me.octo.client.utils.IlllllllIIIlIlllllIIIllIlIIIlIlIlIIllllIlIlIlIlllIIIIlIIlIlllIllllIlIlIIlIIIlIIIIIIll pwKeybinds =
               me.octo.client.utils.IlllllllIIIlIlllllIIIllIlIIIlIlIlIIllllIlIlIlIlllIIIIlIIlIlllIllllIlIlIIlIIIlIIIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            if (pwKeybinds.d("GUI Keybind")) {
               pxClient.setScreen(
                  new me.octo.client.lIIlIlIIllIllllIIIllIIIIIlIIlIllIllllIIlllIIIIIlIlIlllIlIIIlllIlIIlIlllllIIlIIIIIIIll()
               );
            }
         } catch (Throwable pxT) {
            System.out.println("[PX] keybind tick failed: " + pxT);
         }
      });
   }

   private static boolean pxOpenGuiDone = false;
   private static boolean pxCommandSent = false;

   private final native void a();

   private final native void b();

   private final native void c();

   private final native void d();

   private final native void e();

   private final native void f();

   private final native void g();

   @SubscribeEvent
   public final native void a(@NotNull me.octo.client.events.impl.IIIIIIIlllIIllIlllIlllIIlIIIIllIllIlllIlIIllllllIlIIlIIlllIllIllIIlIIlIlIllIlllllIIlI v1);

   @SubscribeEvent
   public final native void a(@NotNull me.octo.client.events.impl.IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI v1);

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll v1) {
      // Native RVA 0x4758c only performs the Kotlin parameter check and returns.
      Intrinsics.checkNotNullParameter(v1, "e");
   }

   private final native void a(String v1, String v2);

   private final native void b(String v1, String v2);

   private static final native void c(String v0, String v1);

   private static final PictureInPictureRenderer a(Context v0) {
      // PX-FIX: rebuilt from the Fabric API; the original body is native/JNIC.
      return new me.octo.client.utils.llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI(net.minecraft.client.Minecraft.getInstance().renderBuffers().bufferSource());
   }

   private static final native Unit h();

   @JvmStatic
   @NotNull
   public static final Identifier a(@NotNull String v0) {
      if (Polinex.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl == null) {
         Polinex.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll();
      }
      return Polinex.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(v0);
   }

   @JvmStatic
   @NotNull
   public static final String b(@NotNull String v0) {
      if (Polinex.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl == null) {
         Polinex.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll();
      }
      return Polinex.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(v0);
   }

   @Nullable
   public static final native List<IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl> i();

   public static final native void a(@Nullable List<IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl> v0);

   public static final void b(@Nullable List<IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl> v0) {
      Polinex.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = v0;
   }

   private static native Exception a(Exception v0);

   private static native String a(int i0, int i1);

static {
      JNICLoader.init();
      $jnicLoader();
      $jnicClinit();
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private static int[] IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private static String[] a;
      private static String[] b;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @JvmStatic
      @NotNull
      public final Identifier a(@NotNull String var1) {
         short var10001 = 16207;
         short var10002 = 3243;
         Intrinsics.checkNotNullParameter(var1, "path");
         short var10000 = 16200;
         var10001 = -15294;
         Identifier var2 = Identifier.fromNamespaceAndPath("polinex", var1);
         var10002 = 16203;
         short var10003 = -31555;
         Intrinsics.checkNotNullExpressionValue(var2, "fromNamespaceAndPath(...)");
         return var2;
      }

      @JvmStatic
      @NotNull
      public final String b(@NotNull String var1) {
      Object var18 = null; // PX-FIX
         short var10001 = 16205;
         short var10002 = 6444;
         Intrinsics.checkNotNullParameter(var1, "path");
         ClassLoader var2 = Polinex.class.getClassLoader();

         String var10000;
         label65: {
            try {
               if (StringsKt.startsWith(var1, "/", false)) {
                  var10000 = var1.substring(1);
                  var10002 = 16206;
                  short var10003 = 8722;
                  Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
                  break label65;
               }
            } catch (Throwable var16) {
               throw (RuntimeException)a(var16);
            }

            var10001 = 16204;
            var10002 = -10378;
            var10000 = "assets/polinex/" + var1;
         }

         String var3 = var10000;

         try {
            var18 = var2.getResourceAsStream(var3);
            if (var18 == null) {
               short var22 = 16202;
               short var10004 = -16194;
               throw new IllegalStateException(("Resource not found: " + var3).toString());
            }
         } catch (Throwable var15) {
            throw (RuntimeException)a(var15);
         }

         InputStream var4 =((InputStream)( var18));
         var var5 = var4;
         Throwable var6 = null;

         String var17;
         try {
            InputStream var7 = var5;
            boolean var8 = false;
            var17 = new String(ByteStreamsKt.readBytes(var7), Charsets.UTF_8);
         } catch (Throwable var13) {
            var6 = var13;
            throw var13;
         } finally {
            CloseableKt.closeFinally(var5, var6);
         }

         return var17;
      }

      @Nullable
      public final List<IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl> a() {
         return Polinex.j();
      }

      public final void a(@Nullable List<IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl> var1) {
         Polinex.b(var1);
      }

      public static void b(int[] var0) {
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var0;
      }

      public static int[] c() {
         return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      private static Throwable a(Throwable var0) {
         return var0;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var21 = null; // PX-FIX
         String[] var5 = new String[7];
         int var3 = 0;
         int[] var10000 = new int[2];
         String var2 = "ë \u009eªº\"w Î\u0013jR\u0090;\u0004\u0005(66\u000f\f\"#*>ç¡§\u0092z¯óÌ\u0016I\u0004Çöní\u0014\u0019}Ô\u001fÁ\u000b3\u000eJú\u0014»8Xz×?SMº";
         int var4 = "ë \u009eªº\"w Î\u0013jR\u0090;\u0004\u0005(66\u000f\f\"#*>ç¡§\u0092z¯óÌ\u0016I\u0004Çöní\u0014\u0019}Ô\u001fÁ\u000b3\u000eJú\u0014»8Xz×?SMº"
            .length();
         b(var10000);
         char var1 = 14;
         int var8 = -1;

         label52:
         while (true) {
            byte var9 = 42;
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
                        case 0 -> 87;
                        case 1 -> 10;
                        case 2 -> 25;
                        case 3 -> 56;
                        case 4 -> 127;
                        case 5 -> 112;
                        default -> 51;
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
                        b = new String[7];
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

                     var2 = "ÛÙÒ\u008cUØ\u0003õ k\u009e³\u0013{\u0003\u0091ÿ]\u0012fÓA\u008a\u0081u\u0007,àû\u00113ëþ";
                     var4 = "ÛÙÒ\u008cUØ\u0003õ k\u009e³\u0013{\u0003\u0091ÿ]\u0012fÓA\u008a\u0081u\u0007,àû\u00113ëþ".length();
                     var1 = 25;
                     var8 = -1;
               }

               var9 = 28;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 16206) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 165;
               case 1 -> 201;
               case 2 -> 247;
               case 3 -> 120;
               case 4 -> 85;
               case 5 -> 3;
               case 6 -> 9;
               case 7 -> 191;
               case 8 -> 123;
               case 9 -> 208;
               case 10 -> 235;
               case 11 -> 176;
               case 12 -> 213;
               case 13 -> 134;
               case 14 -> 125;
               case 15 -> 240;
               case 16 -> 139;
               case 17 -> 122;
               case 18 -> 82;
               case 19 -> 244;
               case 20 -> 58;
               case 21 -> 226;
               case 22 -> 75;
               case 23 -> 126;
               case 24 -> 11;
               case 25 -> 196;
               case 26 -> 181;
               case 27 -> 99;
               case 28 -> 246;
               case 29 -> 121;
               case 30 -> 15;
               case 31 -> 145;
               case 32 -> 214;
               case 33 -> 182;
               case 34 -> 212;
               case 35 -> 86;
               case 36 -> 92;
               case 37 -> 47;
               case 38 -> 223;
               case 39 -> 232;
               case 40 -> 225;
               case 41 -> 248;
               case 42 -> 6;
               case 43 -> 124;
               case 44 -> 113;
               case 45 -> 7;
               case 46 -> 189;
               case 47 -> 132;
               case 48 -> 66;
               case 49 -> 185;
               case 50 -> 205;
               case 51 -> 142;
               case 52 -> 10;
               case 53 -> 62;
               case 54 -> 253;
               case 55 -> 175;
               case 56 -> 89;
               case 57 -> 204;
               case 58 -> 148;
               case 59 -> 55;
               case 60 -> 130;
               case 61 -> 167;
               case 62 -> 109;
               case 63 -> 61;
               case 64 -> 39;
               case 65 -> 29;
               case 66 -> 63;
               case 67 -> 25;
               case 68 -> 59;
               case 69 -> 77;
               case 70 -> 179;
               case 71 -> 154;
               case 72 -> 143;
               case 73 -> 97;
               case 74 -> 187;
               case 75 -> 188;
               case 76 -> 210;
               case 77 -> 192;
               case 78 -> 156;
               case 79 -> 65;
               case 80 -> 119;
               case 81 -> 27;
               case 82 -> 78;
               case 83 -> 252;
               case 84 -> 207;
               case 85 -> 71;
               case 86 -> 46;
               case 87 -> 164;
               case 88 -> 38;
               case 89 -> 116;
               case 90 -> 72;
               case 91 -> 35;
               case 92 -> 21;
               case 93 -> 110;
               case 94 -> 42;
               case 95 -> 54;
               case 96 -> 105;
               case 97 -> 57;
               case 98 -> 49;
               case 99 -> 73;
               case 100 -> 136;
               case 101 -> 106;
               case 102 -> 103;
               case 103 -> 43;
               case 104 -> 19;
               case 105 -> 24;
               case 106 -> 17;
               case 107 -> 20;
               case 108 -> 219;
               case 109 -> 151;
               case 110 -> 44;
               case 111 -> 217;
               case 112 -> 177;
               case 113 -> 102;
               case 114 -> 242;
               case 115 -> 83;
               case 116 -> 5;
               case 117 -> 174;
               case 118 -> 141;
               case 119 -> 1;
               case 120 -> 163;
               case 121 -> 33;
               case 122 -> 197;
               case 123 -> 68;
               case 124 -> 200;
               case 125 -> 153;
               case 126 -> 144;
               case 127 -> 190;
               case 128 -> 183;
               case 129 -> 152;
               case 130 -> 255;
               case 131 -> 193;
               case 132 -> 14;
               case 133 -> 170;
               case 134 -> 155;
               case 135 -> 53;
               case 136 -> 211;
               case 137 -> 30;
               case 138 -> 64;
               case 139 -> 147;
               case 140 -> 127;
               case 141 -> 87;
               case 142 -> 51;
               case 143 -> 107;
               case 144 -> 199;
               case 145 -> 161;
               case 146 -> 131;
               case 147 -> 80;
               case 148 -> 23;
               case 149 -> 93;
               case 150 -> 45;
               case 151 -> 169;
               case 152 -> 198;
               case 153 -> 218;
               case 154 -> 13;
               case 155 -> 0;
               case 156 -> 41;
               case 157 -> 8;
               case 158 -> 243;
               case 159 -> 108;
               case 160 -> 16;
               case 161 -> 149;
               case 162 -> 250;
               case 163 -> 133;
               case 164 -> 32;
               case 165 -> 94;
               case 166 -> 70;
               case 167 -> 79;
               case 168 -> 237;
               case 169 -> 222;
               case 170 -> 157;
               case 171 -> 118;
               case 172 -> 233;
               case 173 -> 215;
               case 174 -> 40;
               case 175 -> 206;
               case 176 -> 230;
               case 177 -> 220;
               case 178 -> 236;
               case 179 -> 76;
               case 180 -> 229;
               case 181 -> 69;
               case 182 -> 162;
               case 183 -> 112;
               case 184 -> 74;
               case 185 -> 203;
               case 186 -> 98;
               case 187 -> 184;
               case 188 -> 146;
               case 189 -> 56;
               case 190 -> 101;
               case 191 -> 81;
               case 192 -> 241;
               case 193 -> 216;
               case 194 -> 160;
               case 195 -> 166;
               case 196 -> 31;
               case 197 -> 67;
               case 198 -> 28;
               case 199 -> 245;
               case 200 -> 48;
               case 201 -> 150;
               case 202 -> 239;
               case 203 -> 168;
               case 204 -> 234;
               case 205 -> 194;
               case 206 -> 129;
               case 207 -> 221;
               case 208 -> 158;
               case 209 -> 37;
               case 210 -> 238;
               case 211 -> 209;
               case 212 -> 95;
               case 213 -> 34;
               case 214 -> 18;
               case 215 -> 173;
               case 216 -> 227;
               case 217 -> 12;
               case 218 -> 138;
               case 219 -> 84;
               case 220 -> 137;
               case 221 -> 178;
               case 222 -> 251;
               case 223 -> 128;
               case 224 -> 96;
               case 225 -> 202;
               case 226 -> 52;
               case 227 -> 140;
               case 228 -> 26;
               case 229 -> 186;
               case 230 -> 104;
               case 231 -> 114;
               case 232 -> 231;
               case 233 -> 90;
               case 234 -> 100;
               case 235 -> 254;
               case 236 -> 2;
               case 237 -> 91;
               case 238 -> 195;
               case 239 -> 228;
               case 240 -> 159;
               case 241 -> 180;
               case 242 -> 4;
               case 243 -> 22;
               case 244 -> 224;
               case 245 -> 115;
               case 246 -> 117;
               case 247 -> 171;
               case 248 -> 172;
               case 249 -> 111;
               case 250 -> 36;
               case 251 -> 60;
               case 252 -> 249;
               case 253 -> 135;
               case 254 -> 50;
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
         public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker marker) {
         this();
      }
      public static void b() {
      }
}

    // PX-FIX JNIC placeholder (Phase 2: Ghidra restore)
    private static void $jnicClinit() {
    }

    // PX-FIX JNIC placeholder (Phase 2: Ghidra restore)
    private static void $jnicLoader() {
    }
   private static final String[][] PX_HANDLERS = {
      {"me.octo.client.IIlIIlIIlllIllllIIIlIlllIIIIlIllIIIlIIIIIIlIlIlIIIIlIIlIIIIlllIllIlIIlIIllIIllIIIIIll", "lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl"},
      {"me.octo.client.IlIllIIlIIIIllIIlIlIIIIIlIllllIIllIlIlIIllIlllIIlIlIllllIIIIlIllIlIIlllIIllllIIllIlll", "IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl"},
      {"me.octo.client.lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll", "IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl"},
      {"me.octo.client.lIlIllIIlIlllllIIlIllIIllIlllIlllllIlIIlllllIllIIIllIIlllIIIllIlIIIIllllllIlIllIIIIIl", "IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl"},
      {"me.octo.client.llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII", "IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl"},
      {"me.octo.client.llIllIlllllIlIlIIllIIIlllIIllIIlIIllIIIlIllllIllIllIllIIIlIllIllIIllIIllIlIIlIIIlIIII", "lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII"},
   };

   private static void pxRegisterHandlers() {
      for (String[] pxP : PX_HANDLERS) {
         try {
            Class<?> pxC = Class.forName(pxP[0]);
            java.lang.reflect.Field pxF = pxC.getDeclaredField(pxP[1]);
            pxF.setAccessible(true);
            Object pxO = pxF.get(null);
            if (pxO == null) continue;
            me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a(pxO);
            if (pxO instanceof me.octo.client.llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl) ((me.octo.client.llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl)pxO).a(true);
            System.out.println("[PX] registered " + pxP[0].substring(pxP[0].lastIndexOf('.') + 1) + " as " + pxO.getClass().getName() + " module=" + (pxO instanceof me.octo.client.llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl));
         } catch (Throwable pxT) { System.out.println("[PX] skip " + pxP[0] + ": " + pxT); }
      }
   }
}
