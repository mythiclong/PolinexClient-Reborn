package me.octo.client.events.impl.base;

import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl;
import me.octo.client.events.impl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
import me.octo.client.events.impl.IIllIlllIIIIIllllIlllIIllIIIlIIllIIllIIlIllIIllIIIlIllIIlIIIIIlIIIIlIlIIIIIIlIlllIllI;
import me.octo.client.events.impl.IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl;
import me.octo.client.events.impl.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
import me.octo.client.events.impl.lIlIIIllllllIlIIlllIllIIIlIllllIIllllIIllllIIIIIlIIlIIIlIlIlIIIIllIIIIIllIIlIIllIllII;
import me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.events.impl.llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII;
import me.octo.client.events.impl.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll;
import me.octo.client.events.impl.llllIlIIIlllIIlIIIlIIlIIllIlIlIlllIIIIIIIIlIlIIllIIlllIIIlIllIIIIllIllllIIIIIIIllIllI;
import me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
import me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
import me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientEntityEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLevelEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements;
import net.fabricmc.fabric.api.client.rendering.v1.level.LevelRenderContext;
import net.fabricmc.fabric.api.client.rendering.v1.level.LevelRenderEvents;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.state.level.BlockOutlineRenderState;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.chunk.LevelChunk;
import org.jetbrains.annotations.NotNull;

public final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
   @NotNull
   public static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] a;
   private static String[] b;

   private IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
   }

   public final void a() {
      ClientTickEvents.START_CLIENT_TICK.register(IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll::a);
      int[] var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      ClientTickEvents.END_CLIENT_TICK.register(IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll::b);
      int[] var1 = var10000;
      LevelRenderEvents.END_MAIN.register(IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll::a);
      LevelRenderEvents.BEFORE_BLOCK_OUTLINE.register(IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll::a);
      ClientEntityEvents.ENTITY_LOAD.register(IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll::a);
      ClientLevelEvents.AFTER_CLIENT_LEVEL_CHANGE.register(IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll::a);
      ClientChunkEvents.CHUNK_LOAD.register(IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll::a);
      short var10001 = -32283;
      short var10002 = -16571;
      var10002 = -32276;
      short var10003 = 7461;
      HudElementRegistry.attachElementAfter(
         VanillaHudElements.CHAT,
         Identifier.fromNamespaceAndPath("polinex", "hud_render_event"),
         IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll::a
      );
      short var2 = -32280;
      var10001 = -9080;
      lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.e("Events registered successfully");
      if (var1 != null) {
         lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[2]
         );
      }
   }

   private static final void a(Minecraft var0) {
      int[] var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      short var10002 = -32287;
      short var10003 = 24268;
      Intrinsics.checkNotNullParameter(var0, "it");
      int[] var1 = var10000;
      lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b();
      me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .a(
            IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
      );
      int var3 = 1;
      if (var1 == null) {
         if (lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .player
               != null
            && lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .level
               != null) {
            me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .a(
                  llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               );
         }

         var3 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII % 20;
      }

      if (var1 == null) {
         if (var3 == 0) {
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = 0;
            me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .a(
                  lIlIIIllllllIlIIlllIllIIIlIllllIIllllIIllllIIIIIlIIlIIIlIlIlIIIIllIIIIIllIIlIIllIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               );
         }

         var3 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      int var2 = var3;
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2 + 1;
   }

   private static final void b(Minecraft var0) {
      short var10001 = -32275;
      short var10002 = -21734;
      Intrinsics.checkNotNullParameter(var0, "it");
      me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .a(
            IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         );
   }

   private static final void a(LevelRenderContext var0) {
      short var10001 = -32279;
      short var10002 = -22256;
      Intrinsics.checkNotNullParameter(var0, "context");
      lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b();
      me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .a(new IIllIlllIIIIIllllIlllIIllIIIlIIllIIllIIlIllIIllIIIlIllIIlIIIIIlIIIIlIlIIIIIIlIlllIllI(var0));
   }

   private static final boolean a(LevelRenderContext var0, BlockOutlineRenderState var1) {
      short var10001 = -32288;
      short var10002 = 10811;
      Intrinsics.checkNotNullParameter(var0, "worldRenderContext");
      int[] var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      var10002 = -32274;
      short var10003 = -26954;
      Intrinsics.checkNotNullParameter(var1, "blockOutlineContext");
      int[] var2 = var10000;
      boolean var3 = me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .b(new llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII(var0, var1));
      if (var2 == null) {
         var3 = !var3;
      }

      return var3;
   }

   private static final void a(Entity var0, ClientLevel var1) {
      short var10001 = -32285;
      short var10002 = -31436;
      Intrinsics.checkNotNullParameter(var0, "entity");
      var10001 = -32277;
      var10002 = 18249;
      Intrinsics.checkNotNullParameter(var1, "world");
      me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .a(new llllIlIIIlllIIlIIIlIIlIIllIlIlIlllIIIIIIIIlIlIIllIIlllIIIlIllIIIIllIllllIIIIIIIllIllI(var0, var1));
   }

   private static final void a(Minecraft var0, ClientLevel var1) {
      short var10001 = -32286;
      short var10002 = 8748;
      Intrinsics.checkNotNullParameter(var0, "mc");
      var10001 = -32277;
      var10002 = 18249;
      Intrinsics.checkNotNullParameter(var1, "world");
      me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .a(new IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl(var0, var1));
   }

   private static final void a(ClientLevel var0, LevelChunk var1) {
      short var10001 = -32284;
      short var10002 = 5713;
      Intrinsics.checkNotNullParameter(var0, "world");
      var10001 = -32273;
      var10002 = -3657;
      Intrinsics.checkNotNullParameter(var1, "chunk");
      me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .a(new IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl(var0, var1));
   }

   private static final void a(GuiGraphicsExtractor var0, DeltaTracker var1) {
      short var10001 = -32282;
      short var10002 = -32254;
      Intrinsics.checkNotNullParameter(var0, "context");
      var10001 = -32281;
      var10002 = 21033;
      Intrinsics.checkNotNullParameter(var1, "tickCounter");
      me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .a(new llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll(var0, var1.getGameTimeDeltaPartialTick(true)));
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[15];
      int var3 = 0;
      String var2 = "\u0015\u0092 ñ\u008cj\u009d\u0005Gt\u0093(-\u000br@Go£ñý?\u0002±\u0080\u0007qëßÃ:\u008f-\u0002ËR\u00120Ï}_ð-D>7\u00914¿ e\u000fxóú\u0006 ê9ß®³\u0002Åç\u0002§=\u0010e\u0016=\u000e:eÂì\u008c\u0097O¬^îðr\u0005èÏ÷ºI\u0013è\u0090ÌØw.Júì\\Z\u00adÞÄs|8E½\u0007oì\u001c#B\u0093\"";
      int var4 = "\u0015\u0092 ñ\u008cj\u009d\u0005Gt\u0093(-\u000br@Go£ñý?\u0002±\u0080\u0007qëßÃ:\u008f-\u0002ËR\u00120Ï}_ð-D>7\u00914¿ e\u000fxóú\u0006 ê9ß®³\u0002Åç\u0002§=\u0010e\u0016=\u000e:eÂì\u008c\u0097O¬^îðr\u0005èÏ÷ºI\u0013è\u0090ÌØw.Júì\\Z\u00adÞÄs|8E½\u0007oì\u001c#B\u0093\""
         .length();
      char var1 = 7;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 12;
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
                     case 0 -> 66;
                     case 1 -> 84;
                     case 2 -> 85;
                     case 3 -> 79;
                     case 4 -> 32;
                     case 5 -> 17;
                     default -> 94;
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
                     b = new String[15];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll();
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "\\%èAÜöí'\u0095T!\u000e\u001a\u0015]g\u00186ä\u0099N\u001dÊ4Ð\u0081|Z®º\u0005ëç}!\u008b";
                  var4 = "\\%èAÜöí'\u0095T!\u000e\u001a\u0015]g\u00186ä\u0099N\u001dÊ4Ð\u0081|Z®º\u0005ëç}!\u008b".length();
                  var1 = 30;
                  var8 = -1;
            }

            var10000 = 93;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -32283) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 181;
            case 1 -> 200;
            case 2 -> 140;
            case 3 -> 5;
            case 4 -> 138;
            case 5 -> 150;
            case 6 -> 57;
            case 7 -> 189;
            case 8 -> 207;
            case 9 -> 211;
            case 10 -> 212;
            case 11 -> 255;
            case 12 -> 175;
            case 13 -> 67;
            case 14 -> 113;
            case 15 -> 177;
            case 16 -> 77;
            case 17 -> 52;
            case 18 -> 147;
            case 19 -> 23;
            case 20 -> 86;
            case 21 -> 10;
            case 22 -> 33;
            case 23 -> 204;
            case 24 -> 36;
            case 25 -> 219;
            case 26 -> 123;
            case 27 -> 97;
            case 28 -> 83;
            case 29 -> 158;
            case 30 -> 171;
            case 31 -> 40;
            case 32 -> 214;
            case 33 -> 206;
            case 34 -> 208;
            case 35 -> 112;
            case 36 -> 105;
            case 37 -> 245;
            case 38 -> 142;
            case 39 -> 229;
            case 40 -> 155;
            case 41 -> 136;
            case 42 -> 183;
            case 43 -> 226;
            case 44 -> 248;
            case 45 -> 250;
            case 46 -> 127;
            case 47 -> 202;
            case 48 -> 197;
            case 49 -> 81;
            case 50 -> 99;
            case 51 -> 236;
            case 52 -> 131;
            case 53 -> 194;
            case 54 -> 213;
            case 55 -> 8;
            case 56 -> 25;
            case 57 -> 100;
            case 58 -> 173;
            case 59 -> 63;
            case 60 -> 225;
            case 61 -> 93;
            case 62 -> 80;
            case 63 -> 166;
            case 64 -> 152;
            case 65 -> 137;
            case 66 -> 14;
            case 67 -> 130;
            case 68 -> 38;
            case 69 -> 221;
            case 70 -> 44;
            case 71 -> 124;
            case 72 -> 161;
            case 73 -> 186;
            case 74 -> 146;
            case 75 -> 114;
            case 76 -> 90;
            case 77 -> 41;
            case 78 -> 144;
            case 79 -> 108;
            case 80 -> 228;
            case 81 -> 15;
            case 82 -> 2;
            case 83 -> 232;
            case 84 -> 187;
            case 85 -> 116;
            case 86 -> 203;
            case 87 -> 215;
            case 88 -> 68;
            case 89 -> 118;
            case 90 -> 22;
            case 91 -> 26;
            case 92 -> 159;
            case 93 -> 94;
            case 94 -> 243;
            case 95 -> 172;
            case 96 -> 4;
            case 97 -> 230;
            case 98 -> 9;
            case 99 -> 66;
            case 100 -> 227;
            case 101 -> 188;
            case 102 -> 233;
            case 103 -> 32;
            case 104 -> 21;
            case 105 -> 143;
            case 106 -> 252;
            case 107 -> 191;
            case 108 -> 199;
            case 109 -> 16;
            case 110 -> 6;
            case 111 -> 195;
            case 112 -> 55;
            case 113 -> 31;
            case 114 -> 27;
            case 115 -> 164;
            case 116 -> 222;
            case 117 -> 153;
            case 118 -> 42;
            case 119 -> 106;
            case 120 -> 7;
            case 121 -> 117;
            case 122 -> 39;
            case 123 -> 167;
            case 124 -> 72;
            case 125 -> 237;
            case 126 -> 50;
            case 127 -> 37;
            case 128 -> 134;
            case 129 -> 48;
            case 130 -> 133;
            case 131 -> 149;
            case 132 -> 34;
            case 133 -> 224;
            case 134 -> 104;
            case 135 -> 244;
            case 136 -> 174;
            case 137 -> 95;
            case 138 -> 223;
            case 139 -> 70;
            case 140 -> 240;
            case 141 -> 71;
            case 142 -> 126;
            case 143 -> 128;
            case 144 -> 82;
            case 145 -> 253;
            case 146 -> 132;
            case 147 -> 182;
            case 148 -> 163;
            case 149 -> 179;
            case 150 -> 87;
            case 151 -> 56;
            case 152 -> 110;
            case 153 -> 29;
            case 154 -> 234;
            case 155 -> 119;
            case 156 -> 249;
            case 157 -> 49;
            case 158 -> 192;
            case 159 -> 3;
            case 160 -> 18;
            case 161 -> 141;
            case 162 -> 102;
            case 163 -> 46;
            case 164 -> 205;
            case 165 -> 151;
            case 166 -> 242;
            case 167 -> 1;
            case 168 -> 84;
            case 169 -> 115;
            case 170 -> 190;
            case 171 -> 11;
            case 172 -> 101;
            case 173 -> 19;
            case 174 -> 201;
            case 175 -> 231;
            case 176 -> 246;
            case 177 -> 218;
            case 178 -> 51;
            case 179 -> 45;
            case 180 -> 209;
            case 181 -> 69;
            case 182 -> 129;
            case 183 -> 74;
            case 184 -> 107;
            case 185 -> 89;
            case 186 -> 85;
            case 187 -> 160;
            case 188 -> 75;
            case 189 -> 111;
            case 190 -> 54;
            case 191 -> 78;
            case 192 -> 92;
            case 193 -> 217;
            case 194 -> 65;
            case 195 -> 176;
            case 196 -> 120;
            case 197 -> 13;
            case 198 -> 30;
            case 199 -> 162;
            case 200 -> 254;
            case 201 -> 47;
            case 202 -> 79;
            case 203 -> 62;
            case 204 -> 196;
            case 205 -> 43;
            case 206 -> 216;
            case 207 -> 60;
            case 208 -> 239;
            case 209 -> 251;
            case 210 -> 20;
            case 211 -> 96;
            case 212 -> 235;
            case 213 -> 59;
            case 214 -> 98;
            case 215 -> 61;
            case 216 -> 184;
            case 217 -> 241;
            case 218 -> 193;
            case 219 -> 121;
            case 220 -> 0;
            case 221 -> 170;
            case 222 -> 28;
            case 223 -> 76;
            case 224 -> 122;
            case 225 -> 157;
            case 226 -> 35;
            case 227 -> 145;
            case 228 -> 238;
            case 229 -> 220;
            case 230 -> 12;
            case 231 -> 247;
            case 232 -> 178;
            case 233 -> 154;
            case 234 -> 148;
            case 235 -> 17;
            case 236 -> 156;
            case 237 -> 109;
            case 238 -> 169;
            case 239 -> 180;
            case 240 -> 135;
            case 241 -> 73;
            case 242 -> 168;
            case 243 -> 64;
            case 244 -> 198;
            case 245 -> 53;
            case 246 -> 24;
            case 247 -> 58;
            case 248 -> 125;
            case 249 -> 210;
            case 250 -> 88;
            case 251 -> 91;
            case 252 -> 139;
            case 253 -> 185;
            case 254 -> 165;
            default -> 103;
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
