package me.octo.client;

import it.unimi.dsi.fastutil.booleans.BooleanArrayList;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.fabricmc.fabric.api.client.rendering.v1.level.LevelRenderContext;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class llllllIIlllIIIIIlIllIIIIIIllIIIIllIllIIllIlIIIIlIIllIIllIIlIIIlIIIIIlIllIlIlIIIIlIlII
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static llllllIIlllIIIIIlIllIIIIIIllIIIIllIllIIllIlIIIIlIIllIIllIIlIIIlIIIIIlIllIlIlIIIIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private ArrayList<me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private BooleanArrayList lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private double IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private static llllllIIlllIIIIIlIllIIIIIIllIIIIllIllIIllIlIIIIlIIllIIllIIlIIIlIIIIIlIllIlIlIIIIlIlII llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static String[] f;
   private static String[] g;

   private llllllIIlllIIIIIlIllIIIIIIllIIIIllIllIIllIlIIIIlIIllIIllIIlIIIlIIIIIlIllIlIlIIIIlIlII() {
      short var10001 = 10345;
      short var10002 = 31172;
      var10002 = 10340;
      short var10003 = -27408;
      short var10004 = 10346;
      short var10005 = 5857;
      super(
         "Developer Test",
         "This better not be in main.",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         "Dev"
      );
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new ArrayList<>();
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new BooleanArrayList();
   }

   @SubscribeEvent
   public final void a(@NotNull llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII var1) {
      Object var9 = null; // PX-FIX
      Object var11 = null; // PX-FIX
      String var2;
      double var10;
      label88: {
         String var10000 = lllllIllIIlIlIlIllIlIIlllIlIlIllIlIlIlIIIIlllllIllllIIllIllIllIlllIlIIIlIlIlllIIlllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.r();
         short var10002 = 10337;
         short var10003 = 16426;
         Intrinsics.checkNotNullParameter(var1, "event");
         var2 = var10000;
         short var10001 = 10339;
         var10002 = 16115;
         var9 = me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a("forward");
         label84:
         if (var2 == null) {
            if (((Boolean)(var9))) {
               var10001 = 10349;
               var10002 = -1687;
               var9 = me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a("backward");
               if (var2 != null) {
                  break label84;
               }

               if (((Boolean)(var9))) {
                  var10 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
                  break label88;
               }
            }

            var10001 = 10336;
            var10002 = 4598;
            var9 = me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a("backward");
         }

         if (var2 == null) {
            if (((Boolean)(var9))) {
               var10 = -1.0;
               break label88;
            }

            var10001 = 10348;
            var10002 = -763;
            var9 = me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a("forward");
         }

         var10 = (Boolean)var9 ? 1.0 : this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      }

      double var3;
      label89: {
         var3 = var10;
         this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var3;
         short var18 = 10338;
         short var26 = -30246;
         var11 = me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a("left");
         label69:
         if (var2 == null) {
            if (((Boolean)(var11))) {
               var18 = 10350;
               var26 = 5780;
               var11 = me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a("right");
               if (var2 != null) {
                  break label69;
               }

               if (((Boolean)(var11))) {
                  var10 = 0.0;
                  break label89;
               }
            }

            var18 = 10347;
            var26 = -26361;
            var11 = me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a("left");
         }

         if (var2 == null) {
            if (((Boolean)(var11))) {
               var10 = -1.0;
               break label89;
            }

            var18 = 10351;
            var26 = -15141;
            var11 = me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a("right");
         }

         var10 = (Boolean)var11 ? 1.0 : 0.0;
      }

      double var5 = var10;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.clear();
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.clear();
      if (var2 == null) {
         me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var13 = me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .l();
         if (var13 != null) {
            me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var7 = var13;
            int var8 = 1;

            while (var8 < 41) {
               me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var14 = me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a(
                  me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                  var3,
                  var5,
                  true,
                  var7,
                  false,
                  0.0);
               if (var14 == null) {
                  break;
               }

               var7 = var14;
               this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.add(var7);
               this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
                  .add(
                     me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .k()
                  );
               var8++;
               if (var2 != null) {
                  me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
                     new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[4]
                  );
                  break;
               }
            }

            return;
         }
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIllIlllIIIIIllllIlllIIllIIIlIIllIIllIIlIllIIllIIIlIllIIlIIIIIlIIIIlIlIIIIIIlIlllIllI var1) {
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var19 = null; // PX-FIX
      String var10000 = lllllIllIIlIlIlIllIlIIlllIlIlIllIlIlIlIIIIlllllIllllIIllIllIllIlllIlIIIlIlIlllIIlllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.r();
      short var10002 = 10344;
      short var10003 = -19624;
      Intrinsics.checkNotNullParameter(var1, "event");
      String var2 = var10000;
      if (var2 == null) {
         LevelRenderContext var17 = var1.k();
         if (var17 != null) {
            LevelRenderContext var3 = var17;
            double var4 = 0.15;
            Iterable var6 = CollectionsKt.withIndex(this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl);
            boolean var7 = false;

            for (Object var9 : var6) {
               IndexedValue var10 = (IndexedValue)var9;
               boolean var11 = false;
               int var12 = var10.component1();
               me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var13 = (me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10.component2();
               Vec3 var14 = var13.a();
               AABB var15 = new AABB(var14.subtract(var4, var4, var4), var14.add(var4, var4, var4));
               if (var2 == null) {
                  label29: {
                     boolean var18 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var12);
                     if (var2 == null) {
                        if (var18) {
                           var19 = me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
                           break label29;
                        }

                        var18 = var13.e();
                     }

                     var19 = !var18
                        ? me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl
                        : me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
                  }

                  me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var16 = var19;
                  me.octo.client.utils.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                     var3,
                     var15,
                     var16,
                     1.0,
                     true);
                  if (var2 == null) {
                     continue;
                  }
               }
               break;
            }

            return;
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[13];
      int var3 = 0;
      String var2 = "}h\u0091WÙ\u000eyî\u0007ýb?\u0099À\u0091cÖ{Q\u0096\u0003\u008d\u0002\u0099\u00044ì\u0093¬\u0007¹Û}\u0002¤\u008dù\bï\u001f\"Ijhâä\u00057Í/\u0019L\u0005N-\u0000\u0005©\bk ²®x\u0094 {\u0005\u0007mÞ÷0\u0004£za~";
      int var4 = "}h\u0091WÙ\u000eyî\u0007ýb?\u0099À\u0091cÖ{Q\u0096\u0003\u008d\u0002\u0099\u00044ì\u0093¬\u0007¹Û}\u0002¤\u008dù\bï\u001f\"Ijhâä\u00057Í/\u0019L\u0005N-\u0000\u0005©\bk ²®x\u0094 {\u0005\u0007mÞ÷0\u0004£za~"
         .length();
      char var1 = 5;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 45;
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
                     case 0 -> 40;
                     case 1 -> 75;
                     case 2 -> 31;
                     case 3 -> 109;
                     case 4 -> 61;
                     case 5 -> 3;
                     default -> 107;
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
                     g = new String[13];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new llllllIIlllIIIIIlIllIIIIIIllIIIIllIllIIllIlIIIIlIIllIIllIIlIIIlIIIIIlIllIlIlIIIIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
                     llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new llllllIIlllIIIIIlIllIIIIIIllIIIIllIllIIllIlIIIIlIIllIIllIIlIIIlIIIIIlIllIlIlIIIIlIlII();
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

                  var2 = "\u007fØ5ò=\u0003Z\u001bC`Ý\u0006\u0019\t¶+Uø>0#\u0099ã¯æ¨\u0014\u0003\u001cTsÍÛ\\§";
                  var4 = "\u007fØ5ò=\u0003Z\u001bC`Ý\u0006\u0019\t¶+Uø>0#\u0099ã¯æ¨\u0014\u0003\u001cTsÍÛ\\§".length();
                  var1 = 7;
                  var8 = -1;
            }

            var10000 = 82;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 10344) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 102;
            case 1 -> 158;
            case 2 -> 195;
            case 3 -> 150;
            case 4 -> 51;
            case 5 -> 144;
            case 6 -> 61;
            case 7 -> 251;
            case 8 -> 197;
            case 9 -> 163;
            case 10 -> 183;
            case 11 -> 67;
            case 12 -> 147;
            case 13 -> 37;
            case 14 -> 188;
            case 15 -> 161;
            case 16 -> 254;
            case 17 -> 155;
            case 18 -> 4;
            case 19 -> 72;
            case 20 -> 160;
            case 21 -> 139;
            case 22 -> 10;
            case 23 -> 203;
            case 24 -> 31;
            case 25 -> 209;
            case 26 -> 207;
            case 27 -> 208;
            case 28 -> 62;
            case 29 -> 106;
            case 30 -> 204;
            case 31 -> 149;
            case 32 -> 157;
            case 33 -> 92;
            case 34 -> 221;
            case 35 -> 8;
            case 36 -> 128;
            case 37 -> 206;
            case 38 -> 130;
            case 39 -> 2;
            case 40 -> 54;
            case 41 -> 24;
            case 42 -> 141;
            case 43 -> 134;
            case 44 -> 48;
            case 45 -> 50;
            case 46 -> 60;
            case 47 -> 93;
            case 48 -> 55;
            case 49 -> 170;
            case 50 -> 84;
            case 51 -> 22;
            case 52 -> 190;
            case 53 -> 136;
            case 54 -> 216;
            case 55 -> 13;
            case 56 -> 65;
            case 57 -> 131;
            case 58 -> 35;
            case 59 -> 81;
            case 60 -> 114;
            case 61 -> 227;
            case 62 -> 242;
            case 63 -> 212;
            case 64 -> 104;
            case 65 -> 200;
            case 66 -> 27;
            case 67 -> 231;
            case 68 -> 153;
            case 69 -> 122;
            case 70 -> 97;
            case 71 -> 117;
            case 72 -> 113;
            case 73 -> 111;
            case 74 -> 68;
            case 75 -> 162;
            case 76 -> 100;
            case 77 -> 241;
            case 78 -> 12;
            case 79 -> 213;
            case 80 -> 179;
            case 81 -> 73;
            case 82 -> 121;
            case 83 -> 58;
            case 84 -> 11;
            case 85 -> 39;
            case 86 -> 151;
            case 87 -> 56;
            case 88 -> 165;
            case 89 -> 159;
            case 90 -> 240;
            case 91 -> 20;
            case 92 -> 201;
            case 93 -> 246;
            case 94 -> 71;
            case 95 -> 66;
            case 96 -> 255;
            case 97 -> 88;
            case 98 -> 171;
            case 99 -> 202;
            case 100 -> 70;
            case 101 -> 184;
            case 102 -> 244;
            case 103 -> 152;
            case 104 -> 41;
            case 105 -> 126;
            case 106 -> 5;
            case 107 -> 124;
            case 108 -> 166;
            case 109 -> 146;
            case 110 -> 234;
            case 111 -> 53;
            case 112 -> 142;
            case 113 -> 211;
            case 114 -> 214;
            case 115 -> 98;
            case 116 -> 191;
            case 117 -> 178;
            case 118 -> 120;
            case 119 -> 243;
            case 120 -> 59;
            case 121 -> 77;
            case 122 -> 224;
            case 123 -> 6;
            case 124 -> 140;
            case 125 -> 75;
            case 126 -> 26;
            case 127 -> 110;
            case 128 -> 30;
            case 129 -> 239;
            case 130 -> 119;
            case 131 -> 156;
            case 132 -> 64;
            case 133 -> 33;
            case 134 -> 238;
            case 135 -> 167;
            case 136 -> 21;
            case 137 -> 112;
            case 138 -> 125;
            case 139 -> 220;
            case 140 -> 28;
            case 141 -> 230;
            case 142 -> 192;
            case 143 -> 196;
            case 144 -> 89;
            case 145 -> 94;
            case 146 -> 180;
            case 147 -> 229;
            case 148 -> 69;
            case 149 -> 233;
            case 150 -> 138;
            case 151 -> 210;
            case 152 -> 15;
            case 153 -> 99;
            case 154 -> 137;
            case 155 -> 145;
            case 156 -> 143;
            case 157 -> 87;
            case 158 -> 154;
            case 159 -> 226;
            case 160 -> 205;
            case 161 -> 57;
            case 162 -> 45;
            case 163 -> 176;
            case 164 -> 223;
            case 165 -> 172;
            case 166 -> 16;
            case 167 -> 186;
            case 168 -> 0;
            case 169 -> 108;
            case 170 -> 109;
            case 171 -> 129;
            case 172 -> 245;
            case 173 -> 107;
            case 174 -> 177;
            case 175 -> 173;
            case 176 -> 32;
            case 177 -> 198;
            case 178 -> 199;
            case 179 -> 237;
            case 180 -> 174;
            case 181 -> 118;
            case 182 -> 127;
            case 183 -> 105;
            case 184 -> 123;
            case 185 -> 232;
            case 186 -> 79;
            case 187 -> 91;
            case 188 -> 43;
            case 189 -> 194;
            case 190 -> 36;
            case 191 -> 169;
            case 192 -> 253;
            case 193 -> 19;
            case 194 -> 228;
            case 195 -> 44;
            case 196 -> 235;
            case 197 -> 135;
            case 198 -> 168;
            case 199 -> 14;
            case 200 -> 132;
            case 201 -> 175;
            case 202 -> 247;
            case 203 -> 96;
            case 204 -> 1;
            case 205 -> 215;
            case 206 -> 115;
            case 207 -> 219;
            case 208 -> 52;
            case 209 -> 38;
            case 210 -> 217;
            case 211 -> 182;
            case 212 -> 236;
            case 213 -> 47;
            case 214 -> 74;
            case 215 -> 90;
            case 216 -> 218;
            case 217 -> 181;
            case 218 -> 25;
            case 219 -> 101;
            case 220 -> 85;
            case 221 -> 103;
            case 222 -> 63;
            case 223 -> 95;
            case 224 -> 133;
            case 225 -> 86;
            case 226 -> 34;
            case 227 -> 76;
            case 228 -> 42;
            case 229 -> 250;
            case 230 -> 248;
            case 231 -> 78;
            case 232 -> 18;
            case 233 -> 23;
            case 234 -> 225;
            case 235 -> 49;
            case 236 -> 40;
            case 237 -> 116;
            case 238 -> 249;
            case 239 -> 80;
            case 240 -> 164;
            case 241 -> 3;
            case 242 -> 7;
            case 243 -> 187;
            case 244 -> 46;
            case 245 -> 9;
            case 246 -> 185;
            case 247 -> 193;
            case 248 -> 17;
            case 249 -> 29;
            case 250 -> 148;
            case 251 -> 222;
            case 252 -> 82;
            case 253 -> 83;
            case 254 -> 252;
            default -> 189;
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

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final llllllIIlllIIIIIlIllIIIIIIllIIIIllIllIIllIlIIIIlIIllIIllIIlIIIlIIIIIlIllIlIlIIIIlIlII a() {
         return llllllIIlllIIIIIlIllIIIIIIllIIIIllIllIIllIlIIIIlIIllIIllIIlIIIlIIIIIlIllIlIlIIIIlIlII.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      }
       public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker var1) { this(); }
   }
    public static final me.octo.client.llllllIIlllIIIIIlIllIIIIIIllIIIIllIllIIllIlIIIIlIIllIIllIIlIIIlIIIIIlIllIlIlIIIIlIlII ag() {
        return me.octo.client.llllllIIlllIIIIIlIllIIIIIIllIIIIllIllIIllIlIIIIlIIllIIllIIlIIIlIIIIIlIllIlIlIIIIlIlII.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
    }
}
