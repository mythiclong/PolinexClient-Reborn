package me.octo.client.utils.player.pathfinder;

import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.IIllIlllIIIIIllllIlllIIllIIIlIIllIIllIIlIllIIllIIIlIllIIlIIIIIlIIIIlIlIIIIIIlIlllIllI;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import me.octo.client.utils.player.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI;
import me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.Direction.Axis;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
   extends lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   @NotNull
   public static me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static float IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static boolean lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @Nullable
   private static Vec3 IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @Nullable
   private static lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static boolean lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private static lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private static lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private static lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static double IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static boolean llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static String[] c;
   private static String[] d;

   private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
   }

   private final float g() {
      return 130.0F;
   }

   private final float h() {
      return 10.0F;
   }

   public final float i() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   public final void a(float var1) {
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var1;
   }

   @SubscribeEvent
   public final void a(@NotNull IIllIlllIIIIIllllIlllIIllIIIlIIllIIllIIlIllIIllIIIlIllIIlIIIIIlIIIIlIlIIIIIIlIlllIllI var1) {
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      short var10002 = -14909;
      short var10003 = -14559;
      Intrinsics.checkNotNullParameter(var1, "event");
      int var2 = var10000;
      var10000 =(( lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) ? 1 : 0);
      if (var2 == 0) {
         if (!lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) {
            return;
         }

         var10000 = ((lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.j()) ? 1 : 0);
      }

      if (var2 == 0) {
         if (var10000 != 0) {
            return;
         }

         long var12;
         var10000 = (
                  var12 = System.currentTimeMillis()
                     - me.octo.client.utils.player.llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a()
                     - 150L
               )
               == 0L
            ? 0
            : (var12 < 0L ? -1 : 1);
      }

      if (var2 == 0) {
         if (var10000 < 0) {
            return;
         }

         var10000 = ((java.util.function.Supplier<Integer>)(() -> { lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.a(10); return 0; })).get();
      }

      if (var10000 != 0) {
         label39: {
            lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var3;
            label38: {
               Vec3 var10001 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.u();
               LocalPlayer var9 = this.a().player;
               Intrinsics.checkNotNull(var9);
               float var10 = var9.getYRot();
               LocalPlayer var11 = this.a().player;
               Intrinsics.checkNotNull(var11);
               var3 = this.a(var10001, var10, var11.getXRot());
               if (var2 == 0) {
                  if (var3 != null) {
                     break label38;
                  }

                  this.j();
               }

               if (var2 == 0) {
                  break label39;
               }
            }

            LocalPlayer var7 = this.a().player;
            Intrinsics.checkNotNull(var7);
            LocalPlayer var4 = var7;
            var4.setYRot(var4.getYRot() + var3.a());
            LocalPlayer var8 = this.a().player;
            Intrinsics.checkNotNull(var8);
            var4 = var8;
            var4.setXRot(var4.getXRot() + var3.b());
         }

         lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.f();
      }
   }

   private final lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI a(Vec3 var1, float var2, float var3) {
      int var4 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var10000;
      if (var4 == 0 && IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII != null) {
         Vec3 var9 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
         boolean var10 = false;
         var10000 = new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(
            me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a(var1, var9)
               .a(),
            me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a(var1, var9)
               .b()
         );
      } else {
         if (var4 != 0) {
            return null;
         }

         var10000 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
         if (llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI == null) {
            return null;
         }
      }

      lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var5 = var10000;
      float var6 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
         ? 0.0F
         : IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(-35.0F, 40.0F, var5.b());
      var5 = new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(var5.a(), var6);
      lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var7 = this.a(var5, var2, var3);
      lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var8 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(var2 + var7.a(), var3 + var7.b()), var5);
      if (var4 == 0) {
         if (!(
            IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var8.a(), var8.b())
               > 0.1
         )) {
            return null;
         }

         var8 = var7;
      }

      return var4 == 0 ? var8 : null;
   }

   private final lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI a(
      lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var1, float var2, float var3
   ) {
      lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var4 = new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(
         var2, var3
      );
      float var5 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .c(var1.a() - var4.a());
      float var6 = var1.b() - var4.b();
      float var7 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var5, var6);
      float var8 = Math.abs(
         me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .c(lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.a() - var1.a())
      );
      float var9 = Math.abs(lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.b() - var1.b());
      float var10 = this.g() / (2.0F * Math.abs(var5 / var7) * this.b(var8));
      float var11 = this.g() / (2.0F * Math.abs(var6 / var7) * this.b(var9));
      float var12 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(-var10, var10, var5)
         * 0.1F
         * IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      float var13 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(-var11, var11, var6)
         * 0.1F
         * IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      return new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(var12, var13);
   }

   private final float b(float var1) {
      return 1.02F - (float)Math.exp(-Math.abs(var1) * 0.02F);
   }

   public final void a(@NotNull lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var1) {
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      short var10002 = -14911;
      short var10003 = -9206;
      Intrinsics.checkNotNullParameter(var1, "rotation");
      int var2 = var10000;
      lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var3 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      if (var2 == 0) {
         if (llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI == null) {
            lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .o();
         }

         lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = true;
         lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.f();
         var3 = var1;
      }

      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var3;
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = null;
   }

   public final void a(@NotNull Vec3 var1) {
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      short var10002 = -14906;
      short var10003 = 13827;
      Intrinsics.checkNotNullParameter(var1, "point");
      int var2 = var10000;
      Vec3 var3 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      if (var2 == 0) {
         if (IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII == null) {
            lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .o();
         }

         lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = true;
         lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.f();
         var3 = var1;
      }

      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var3;
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = null;
      lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = false;
   }

   public final void a(@NotNull Vec3 var1, boolean var2) {
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      short var10002 = -14907;
      short var10003 = 12913;
      Intrinsics.checkNotNullParameter(var1, "point");
      int var3 = var10000;
      Vec3 var4 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      if (var3 == 0) {
         if (IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII == null) {
            lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .o();
         }

         lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = true;
         lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.f();
         var4 = var1;
      }

      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var4;
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = null;
      lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var2;
   }

   public final void j() {
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = false;
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = null;
      lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = false;
   }

   @Nullable
   public static me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
      @NotNull me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0,
      double var1,
      double var3,
      @NotNull me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var5,
      boolean var6,
      double var7,
      int var9,
      Object var10
   ) {
      int mode = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      if (mode != 0 && (var9 & 8) != 0) {
         var6 = false;
      }
      if ((var9 & 16) != 0) {
         var7 = 0.0;
      }
      return var0.a(var1, var3, var5, var6, var7);
   }

   @Nullable
   public static me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
      @NotNull me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0,
      double var1,
      double var3,
      boolean var5,
      @NotNull me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var6,
      boolean var7,
      double var8,
      int var10,
      Object var11
   ) {
      int mode = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      if (mode == 0 && (var10 & 16) != 0) {
         var7 = false;
      }
      if ((var10 & 32) != 0) {
         var8 = 0.0;
      }
      return var0.a(var1, var3, var5, var6, var7, var8);
   }

   @Nullable
   public final me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
      double var1,
      double var3,
      @NotNull me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var5,
      boolean var6,
      double var7
   ) {
      short var10001 = -14902;
      short var10002 = 10021;
      Intrinsics.checkNotNullParameter(var5, "lastState");
      return this.a(var1, var3, false, var5, var6, var7);
   }

   @Nullable
   public final me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
      double var1,
      double var3,
      boolean var5,
      @NotNull me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var6,
      boolean var7,
      double var8
   ) { float var16 = 0.0f; // PX-FIX hoist
        
      Object var71 = null; // PX-FIX
      boolean var70 = false; // PX-FIX
      Object var67 = null; // PX-FIX
      Object var63 = null; // PX-FIX
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      short var10002 = -14908;
      short var10003 = 26084;
      Intrinsics.checkNotNullParameter(var6, "lastState");
      int var10 = var10000;
      if (var10 == 0) {
         LocalPlayer var59 = this.a().player;
         if (var59 != null) {
            LocalPlayer var11 = var59;
            if (var10 == 0) {
               ClientLevel var60 = this.a().level;
               if (var60 != null) {
                  ClientLevel var12 = var60;
                  Vec3 var13 = var6.a();
                  Vec3 var14 = var6.b();
                  float var15 = var6.c();
                   var16 = var6.d();
                  boolean var17 = var6.e();
                  double var18 = var11.getBbWidth() / 2.0;
                  float var20 = var11.getBbHeight();
                  AABB var21 = new AABB(
                     var13.x - var18 - var8, var13.y, var13.z - var18 - var8, var13.x + var18 + var8, var13.y + var20, var13.z + var18 + var8
                  );
                  boolean var22 = this.c(var12, var11, var21, var14);
                  if (var10 == 0) {
                     AttributeInstance var61 = var11.getAttribute(Attributes.MOVEMENT_SPEED);
                     if (var61 != null) {
                        AttributeInstance var23 = var61;
                        Set var62 = var23.getModifiers();
                        var10002 = -14900;
                        var10003 = 12396;
                        Intrinsics.checkNotNullExpressionValue(var62, "getModifiers(...)");
                        Iterable var25 = var62;
                        boolean var26 = false;
                        Iterator var27 = var25.iterator();

                        label130:
                        while (true) {
                           if (var27.hasNext()) {
                              Object var28 = var27.next();
                              var63 = var28;

                              while (true) {
                                 AttributeModifier var29 = (AttributeModifier)var63;
                                 boolean var30 = false;
                                 Identifier var64 = var29.id();
                                 short var10001 = -14903;
                                 var10002 = 6576;
                                 if (!var64.equals(UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D"))) {
                                    continue label130;
                                 }

                                 var63 = var28;
                                 if (var10 == 0) {
                                    break label130;
                                 }
                              }
                           }

                           var63 = null;
                           break;
                        }

                        label146: {
                           AttributeModifier var24 = (AttributeModifier)var63;
                           double var56 = var7 ? var23.getValue() / var23.getBaseValue() : 2.0;
                           var10000 = ((var11.isSprinting()) ? 1 : 0);
                           if (var10 == 0) {
                              if ((var10000 != 0)) {
                                 var67 = var56 + (var10 == 0 && var24 != null ? var24.amount() : 0.3);
                                 break label146;
                              }

                              double var79;
                              var10000 = (var79 = var1 - 0.0) == 0.0 ? 0 : (var79 < 0.0 ? -1 : 1);
                           }

                           if (var10 == 0) {
                              var10000 = (((var10000 == 0) ? 1 : 0));
                           }

                           if ((var10000 != 0)) {
                              double var80;
                              var10000 = (var80 = var3 - 0.0) == 0.0 ? 0 : (var80 < 0.0 ? -1 : 1);
                              if (var10 == 0) {
                                 var10000 = (((var10000 == 0) ? 1 : 0));
                              }

                              if ((var10000 != 0)) {
                                 var67 = 0.0;
                                 break label146;
                              }
                           }

                           var67 = var56;
                        }

                        double var33;
                        double var35;
                        double var37;
                        double var39;
                        double var43;
                        double var45;
                        label100: {
                           double var57 =((Double)( var67));
                           double var58 = 1.0;
                           double var31 = var17 ? 0.6 : 1.0;
                           var33 = var14.x * var31 * 0.91;
                           var35 = var22 ? 0.1 * var57 * var58 : 0.02 * var57;
                           var37 = var14.z * var31 * 0.91;
                           var39 = var22 ? 0.1 * var57 * var58 : 0.02 * var57;
                           float var41 = var15 + 180.0F;
                           float var42 = var41 + 90.0F;
                           var43 = (
                                 var1
                                       * (float)Math.sin(
                                          IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                             .f(var41)
                                       )
                                    + var3
                                       * (float)Math.sin(
                                          IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                             .f(var42)
                                       )
                              )
                              / IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                           var45 = (
                                 var1
                                       * -(
                                          (float)Math.cos(
                                             IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                                .f(var41)
                                          )
                                       )
                                    + var3
                                       * -(
                                          (float)Math.cos(
                                             IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                                .f(var42)
                                          )
                                       )
                              )
                              / IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                           if (var10 == 0) {
                              MobEffectInstance var68 = var11.getEffect(MobEffects.JUMP_BOOST);
                              if (var68 != null) {
                                 var10000 = var68.getAmplifier();
                                 break label100;
                              }
                           }

                           var10000 = 0;
                        }

                        double var48;
                        double var50;
                        label147: {
                           int var47 = var10000;
                           var48 = var33 + var35 * var43;
                           var50 = var37 + var39 * var45;
                           var70 = var22;
                           label93:
                           if (var10 == 0) {
                              if (var22) {
                                 var70 = var5;
                                 if (var10 != 0) {
                                    break label93;
                                 }

                                 if (var5) {
                                    var71 = 0.42 + var47 * 0.1;
                                    break label147;
                                 }
                              }

                              var70 = var22;
                           }

                           var71 = (var70 ? -0.08 : var14.y - 0.08) * 0.98;
                        }

                        double var52 =((Double)( var71));
                        Vec3 var54 = this.a(var12, var11, var21, new Vec3(var48, var52, var50), var22);
                        Vec3 var72 = var13.add(var54);
                        var10002 = -14894;
                        var10003 = 32155;
                        Intrinsics.checkNotNullExpressionValue(var72, "add(...)");
                        Vec3 var55 = var72;
                        Vec3 var78 = var54.subtract(0.0, IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, 0.0);
                        short var10005 = -14904;
                        short var10006 = -20473;
                        Intrinsics.checkNotNullExpressionValue(var78, "subtract(...)");
                        return new me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                           var55, var78, var15, var16, var22
                        );
                     }
                  }

                  return null;
               }
            }

            return null;
         }
      }

      return null;
   }

   public final boolean k() {
      return llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   }

   public final void a(boolean var1) {
      llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var1;
   }

   private final Vec3 a(Level var1, Entity var2, AABB var3, Vec3 var4, boolean var5) { double var16 = 0.0; // PX-FIX hoist
        
      boolean var30 = false; // PX-FIX
      boolean var24 = false; // PX-FIX
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 0.0;
      llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = false;
      int var6 = var10000;
      Vec3 var7 = this.a(var1, var2, var3, var4);
      double var33;
      var10000 = (var33 = var7.x - var4.x) == 0.0 ? 0 : (var33 < 0.0 ? -1 : 1);
      if (var6 == 0) {
         var10000 = (((var10000 == 0) ? 1 : 0));
      }

      label70: {
         if ((var10000 != 0)) {
            double var34;
            var10000 = (var34 = var7.z - var4.z) == 0.0 ? 0 : (var34 < 0.0 ? -1 : 1);
            if (var6 == 0) {
               var10000 = (((var10000 == 0) ? 1 : 0));
            }

            if ((var10000 != 0)) {
               var24 = false;
               break label70;
            }
         }

         var24 = true;
      }

      boolean var8 = var24;
      int var25 =(( var8) ? 1 : 0);
      if (var6 == 0) {
         if (!var8) {
            return var7;
         }

         var25 =(( var5) ? 1 : 0);
      }

      double var9 =(( ((var25 != 0 ? 1 : 0)!= 0) ? var2.maxUpStep() : 0.0));
      Vec3 var12 = this.a(var1, var2, var3, new Vec3(0.0, var9, 0.0));
      AABB var26 = var3.move(var12);
      short var10002 = -14897;
      short var10003 = 14244;
      Intrinsics.checkNotNullExpressionValue(var26, "move(...)");
      AABB var11 = var26;
      Vec3 var13 = this.a(var1, var2, var11, new Vec3(var4.x, 0.0, var4.z));
      AABB var27 = var11.move(var13);
      var10002 = -14901;
      var10003 = 16819;
      Intrinsics.checkNotNullExpressionValue(var27, "move(...)");
      var11 = var27;
      Vec3 var14 = this.a(var1, var2, var11, new Vec3(0.0, -var9, 0.0));
      Vec3 var15 = new Vec3(var13.x, var12.y + var14.y, var13.z);
      IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var15.y;
       var16 = var7.x * var7.x + var7.z * var7.z;
      double var18 = var15.x * var15.x + var15.z * var15.z;
      Vec3 var20 = var18 > var16 ? var15 : var7;
      double var35;
      var25 = (var35 = var20.x - var4.x) == 0.0 ? 0 : (var35 < 0.0 ? -1 : 1);
      if (var6 == 0) {
         var25 = (((var25 == 0) ? 1 : 0));
      }

      label61: {
         if ((var25 != 0)) {
            double var36;
            var25 = (var36 = var20.z - var4.z) == 0.0 ? 0 : (var36 < 0.0 ? -1 : 1);
            if (var6 == 0) {
               var25 = (((var25 == 0) ? 1 : 0));
            }

            if ((var25 != 0)) {
               var30 = false;
               break label61;
            }
         }

         var30 = true;
      }

      llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var30;
      return var20;
   }

   private final Vec3 a(Level var1, Entity var2, AABB var3, Vec3 var4) { AABB var16 = null; // PX-FIX hoist
        
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      AABB var6 = var3;
      double var7 = var4.x;
      int var5 = var10000;
      double var9 = var4.y;
      double var11 = var4.z;
      double var20;
      var10000 = (var20 = var9 - 0.0) == 0.0 ? 0 : (var20 < 0.0 ? -1 : 1);
      if (var5 != 0) {
         var10000 = (((var10000 == 0) ? 1 : 0));
      }

      if ((var10000 == 0)) {
         var9 = Shapes.collide(Axis.Y, var3, var1.getBlockCollisions(var2, var3.expandTowards(0.0, var9, 0.0)), var9);
         AABB var14 = var3.move(0.0, var9, 0.0);
         short var10002 = -14901;
         short var10003 = 16819;
         Intrinsics.checkNotNullExpressionValue(var14, "move(...)");
         var6 = var14;
      }

      double var21;
      var10000 = (var21 = var7 - 0.0) == 0.0 ? 0 : (var21 < 0.0 ? -1 : 1);
      if (var5 != 0) {
         var10000 = (((var10000 == 0) ? 1 : 0));
      }

      if ((var10000 == 0)) {
         var7 = Shapes.collide(Axis.X, var6, var1.getBlockCollisions(var2, var6.expandTowards(var7, 0.0, 0.0)), var7);
          var16 = var6.move(var7, 0.0, 0.0);
         short var18 = -14901;
         short var19 = 16819;
         Intrinsics.checkNotNullExpressionValue(var16, "move(...)");
         var6 = var16;
      }

      double var22;
      var10000 = (var22 = var11 - 0.0) == 0.0 ? 0 : (var22 < 0.0 ? -1 : 1);
      if (var5 != 0) {
         var10000 = (((var10000 == 0) ? 1 : 0));
      }

      if ((var10000 == 0)) {
         var11 = Shapes.collide(Axis.Z, var6, var1.getBlockCollisions(var2, var6.expandTowards(0.0, 0.0, var11)), var11);
      }

      return new Vec3(var7, var9, var11);
   }

   private final double b(Level var1, Entity var2, AABB var3, Vec3 var4) {
       double var16 = 0.0; // PX-FIX decl var16
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      AABB var10001 = var3.expandTowards(var4.x, 0.0, var4.z);
      short var10003 = -14905;
      short var10004 = 4258;
      Intrinsics.checkNotNullExpressionValue(var10001, "expandTowards(...)");
      AABB var6 = var10001;
      double var7 = 0.0;
      int var5 = var10000;
      Iterator var9 = var1.getBlockCollisions(var2, var6).iterator();

      while (true) {
         if (var9.hasNext()) {
            Object var14 = var9.next();
            short var10002 = -14912;
            var10003 = -5904;
            Intrinsics.checkNotNullExpressionValue(var14, "next(...)");
            VoxelShape var10 = (VoxelShape)var14;
            AABB var15 = var10.bounds();
            var10002 = -14899;
            var10003 = -16908;
            Intrinsics.checkNotNullExpressionValue(var15, "bounds(...)");
            AABB var11 = var15;
            var16 = var11.maxY;
            if (var5 == 0) {
               break;
            }

            double var18 = var3.minY;
            if (var5 != 0) {
               if (!(var11.maxY > var3.minY)) {
                  continue;
               }

               var16 = var11.maxY;
               var18 = var3.minY;
            }

            double var12 = var16 - var18;
            double var17 = var12;
            if (var5 != 0) {
               if (!(var12 > var7)) {
                  continue;
               }

               var17 = var12;
            }

            var7 = var17;
            if (var5 != 0) {
               continue;
            }
         }

         var16 = var7;
         break;
      }

      return var16;
   }

   private final boolean c(Level var1, Entity var2, AABB var3, Vec3 var4) {
      int var5 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      double var11;
      int var10000 = (var11 = var4.y - 0.0) == 0.0 ? 0 : (var11 < 0.0 ? -1 : 1);
      if (var5 != 0) {
         if (var10000 <= 0) {
            AABB var7 = var3.move(0.0, -1.0E-4, 0.0);
            short var10002 = -14901;
            short var10003 = 16819;
            Intrinsics.checkNotNullExpressionValue(var7, "move(...)");
            AABB var6 = var7;
            Iterable var8 = var1.getBlockCollisions(var2, var6);
            var10002 = -14910;
            var10003 = 31345;
            Intrinsics.checkNotNullExpressionValue(var8, "getBlockCollisions(...)");
            return CollectionsKt.any(var8);
         }

         var10000 = 0;
      }

      return (var10000 != 0);
   }

   @Nullable
   public final me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI l() {
      int var1 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      if (var1 != 0) {
         LocalPlayer var10000 = this.a().player;
         if (var10000 != null) {
            LocalPlayer var2 = var10000;
            Vec3 var10002 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var2);
            Vec3 var10003 = var2.getDeltaMovement();
            short var10005 = -14898;
            short var10006 = 15321;
            Intrinsics.checkNotNullExpressionValue(var10003, "getDeltaMovement(...)");
            return new me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
               var10002, var10003, var2.getYRot(), var2.getXRot(), var2.onGround()
            );
         }
      }

      return null;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[17];
      int var3 = 0;
      String var2 = "\u0018k:E\u0011s\u009fê¬òqp\u0018£C\u0015\u0084ðÛ\u0093GÚ9\u0005YÚA.U\t\u001dd¾\u0092H85¯w\b!4ªÆ\u001bBÉ\u000f\u0005ÖÀ\u000bW\u0091\u0012¥0Ë³©áýÖ\u0005ÿè\u0016ì=Ã·{\u0097\tm\u0085ù*±uQM\u0011\u00052\u0016\u0097\u008d\u0002\të\u009e)I«\u0019\u0012Ày\t\u0090\u009ab\u0017\u001c»¿ß&\rgÂUT6¯¦¡à&¼Áë$uôª\u008c×\u0004\r£ :~x]H\u001fÑ¦ñ.\u0093J\u0011VÞ\u0005¥E:\u001e\rÌ\u0003u8Ýÿ\u0015I\u0093\u0010\\]\u0095)_\u0081\u000f\u0001ÆKKªÇ\u0018\u008fÀ\u008aå\t\u0000ípù^f÷d/\u0011\t5\u0018\u0081V\u000e\u001e\"ýM*Óïv\u0093\u0018v";
      int var4 = "\u0018k:E\u0011s\u009fê¬òqp\u0018£C\u0015\u0084ðÛ\u0093GÚ9\u0005YÚA.U\t\u001dd¾\u0092H85¯w\b!4ªÆ\u001bBÉ\u000f\u0005ÖÀ\u000bW\u0091\u0012¥0Ë³©áýÖ\u0005ÿè\u0016ì=Ã·{\u0097\tm\u0085ù*±uQM\u0011\u00052\u0016\u0097\u008d\u0002\të\u009e)I«\u0019\u0012Ày\t\u0090\u009ab\u0017\u001c»¿ß&\rgÂUT6¯¦¡à&¼Áë$uôª\u008c×\u0004\r£ :~x]H\u001fÑ¦ñ.\u0093J\u0011VÞ\u0005¥E:\u001e\rÌ\u0003u8Ýÿ\u0015I\u0093\u0010\\]\u0095)_\u0081\u000f\u0001ÆKKªÇ\u0018\u008fÀ\u008aå\t\u0000ípù^f÷d/\u0011\t5\u0018\u0081V\u000e\u001e\"ýM*Óïv\u0093\u0018v"
         .length();
      char var1 = 23;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 35;
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
                     case 0 -> 45;
                     case 1 -> 87;
                     case 2 -> 36;
                     case 3 -> 14;
                     case 4 -> 3;
                     case 5 -> 56;
                     default -> 24;
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
                     d = new String[17];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll();
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 1.0F;
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(
                        0.0F, 0.0F
                     );
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
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

                  var2 = "KC\u0007Ôl\u0007\u0081MÓYè\bð©\u0002¥µú¿\u0003";
                  var4 = "KC\u0007Ôl\u0007\u0081MÓYè\bð©\u0002¥µú¿\u0003".length();
                  var1 = 11;
                  var8 = -1;
            }

            var10000 = 95;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -14910) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 228;
            case 1 -> 39;
            case 2 -> 135;
            case 3 -> 225;
            case 4 -> 138;
            case 5 -> 28;
            case 6 -> 144;
            case 7 -> 12;
            case 8 -> 252;
            case 9 -> 53;
            case 10 -> 250;
            case 11 -> 20;
            case 12 -> 107;
            case 13 -> 198;
            case 14 -> 65;
            case 15 -> 50;
            case 16 -> 85;
            case 17 -> 215;
            case 18 -> 249;
            case 19 -> 115;
            case 20 -> 96;
            case 21 -> 201;
            case 22 -> 0;
            case 23 -> 243;
            case 24 -> 146;
            case 25 -> 159;
            case 26 -> 55;
            case 27 -> 195;
            case 28 -> 6;
            case 29 -> 22;
            case 30 -> 248;
            case 31 -> 109;
            case 32 -> 36;
            case 33 -> 75;
            case 34 -> 11;
            case 35 -> 181;
            case 36 -> 67;
            case 37 -> 51;
            case 38 -> 58;
            case 39 -> 227;
            case 40 -> 15;
            case 41 -> 242;
            case 42 -> 87;
            case 43 -> 32;
            case 44 -> 209;
            case 45 -> 7;
            case 46 -> 130;
            case 47 -> 173;
            case 48 -> 241;
            case 49 -> 29;
            case 50 -> 88;
            case 51 -> 140;
            case 52 -> 47;
            case 53 -> 61;
            case 54 -> 43;
            case 55 -> 118;
            case 56 -> 113;
            case 57 -> 153;
            case 58 -> 200;
            case 59 -> 18;
            case 60 -> 37;
            case 61 -> 170;
            case 62 -> 129;
            case 63 -> 171;
            case 64 -> 190;
            case 65 -> 68;
            case 66 -> 136;
            case 67 -> 141;
            case 68 -> 4;
            case 69 -> 44;
            case 70 -> 33;
            case 71 -> 185;
            case 72 -> 194;
            case 73 -> 230;
            case 74 -> 232;
            case 75 -> 40;
            case 76 -> 245;
            case 77 -> 191;
            case 78 -> 236;
            case 79 -> 14;
            case 80 -> 158;
            case 81 -> 226;
            case 82 -> 216;
            case 83 -> 116;
            case 84 -> 16;
            case 85 -> 95;
            case 86 -> 206;
            case 87 -> 239;
            case 88 -> 57;
            case 89 -> 82;
            case 90 -> 21;
            case 91 -> 103;
            case 92 -> 17;
            case 93 -> 8;
            case 94 -> 84;
            case 95 -> 23;
            case 96 -> 214;
            case 97 -> 98;
            case 98 -> 105;
            case 99 -> 213;
            case 100 -> 2;
            case 101 -> 222;
            case 102 -> 104;
            case 103 -> 167;
            case 104 -> 117;
            case 105 -> 237;
            case 106 -> 155;
            case 107 -> 110;
            case 108 -> 166;
            case 109 -> 60;
            case 110 -> 42;
            case 111 -> 90;
            case 112 -> 246;
            case 113 -> 205;
            case 114 -> 244;
            case 115 -> 9;
            case 116 -> 31;
            case 117 -> 253;
            case 118 -> 38;
            case 119 -> 255;
            case 120 -> 180;
            case 121 -> 254;
            case 122 -> 125;
            case 123 -> 99;
            case 124 -> 76;
            case 125 -> 69;
            case 126 -> 251;
            case 127 -> 124;
            case 128 -> 74;
            case 129 -> 52;
            case 130 -> 184;
            case 131 -> 114;
            case 132 -> 10;
            case 133 -> 196;
            case 134 -> 165;
            case 135 -> 46;
            case 136 -> 211;
            case 137 -> 131;
            case 138 -> 93;
            case 139 -> 97;
            case 140 -> 66;
            case 141 -> 19;
            case 142 -> 62;
            case 143 -> 63;
            case 144 -> 111;
            case 145 -> 145;
            case 146 -> 234;
            case 147 -> 73;
            case 148 -> 77;
            case 149 -> 169;
            case 150 -> 13;
            case 151 -> 217;
            case 152 -> 137;
            case 153 -> 49;
            case 154 -> 199;
            case 155 -> 210;
            case 156 -> 163;
            case 157 -> 126;
            case 158 -> 192;
            case 159 -> 168;
            case 160 -> 238;
            case 161 -> 220;
            case 162 -> 70;
            case 163 -> 231;
            case 164 -> 188;
            case 165 -> 187;
            case 166 -> 81;
            case 167 -> 235;
            case 168 -> 119;
            case 169 -> 147;
            case 170 -> 56;
            case 171 -> 212;
            case 172 -> 34;
            case 173 -> 176;
            case 174 -> 24;
            case 175 -> 218;
            case 176 -> 78;
            case 177 -> 160;
            case 178 -> 224;
            case 179 -> 219;
            case 180 -> 3;
            case 181 -> 59;
            case 182 -> 1;
            case 183 -> 64;
            case 184 -> 233;
            case 185 -> 152;
            case 186 -> 148;
            case 187 -> 41;
            case 188 -> 132;
            case 189 -> 178;
            case 190 -> 45;
            case 191 -> 174;
            case 192 -> 127;
            case 193 -> 183;
            case 194 -> 100;
            case 195 -> 177;
            case 196 -> 229;
            case 197 -> 122;
            case 198 -> 5;
            case 199 -> 207;
            case 200 -> 142;
            case 201 -> 208;
            case 202 -> 202;
            case 203 -> 102;
            case 204 -> 143;
            case 205 -> 35;
            case 206 -> 54;
            case 207 -> 186;
            case 208 -> 134;
            case 209 -> 25;
            case 210 -> 149;
            case 211 -> 204;
            case 212 -> 139;
            case 213 -> 197;
            case 214 -> 164;
            case 215 -> 27;
            case 216 -> 91;
            case 217 -> 133;
            case 218 -> 72;
            case 219 -> 48;
            case 220 -> 157;
            case 221 -> 175;
            case 222 -> 26;
            case 223 -> 94;
            case 224 -> 151;
            case 225 -> 150;
            case 226 -> 79;
            case 227 -> 240;
            case 228 -> 247;
            case 229 -> 156;
            case 230 -> 120;
            case 231 -> 108;
            case 232 -> 89;
            case 233 -> 193;
            case 234 -> 80;
            case 235 -> 101;
            case 236 -> 86;
            case 237 -> 71;
            case 238 -> 162;
            case 239 -> 223;
            case 240 -> 123;
            case 241 -> 179;
            case 242 -> 112;
            case 243 -> 106;
            case 244 -> 92;
            case 245 -> 128;
            case 246 -> 83;
            case 247 -> 203;
            case 248 -> 189;
            case 249 -> 221;
            case 250 -> 161;
            case 251 -> 154;
            case 252 -> 30;
            case 253 -> 182;
            case 254 -> 121;
            default -> 172;
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

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      @NotNull
      private final Vec3 IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final Vec3 lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final float IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final float lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final boolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         @NotNull Vec3 var1, @NotNull Vec3 var2, float var3, float var4, boolean var5
      ) {
         short var10001 = -5566;
         short var10002 = -28046;
         Intrinsics.checkNotNullParameter(var1, "pos");
         var10001 = -5563;
         var10002 = 31052;
         Intrinsics.checkNotNullParameter(var2, "velocity");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
      }

      @NotNull
      public final Vec3 a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final Vec3 b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final float c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final float d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final boolean e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @NotNull
      public final Vec3 f() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final Vec3 g() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final float h() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final float i() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final boolean j() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @NotNull
      public final me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         @NotNull Vec3 var1, @NotNull Vec3 var2, float var3, float var4, boolean var5
      ) {
         short var10001 = -5561;
         short var10002 = -21221;
         Intrinsics.checkNotNullParameter(var1, "pos");
         var10001 = -5562;
         var10002 = 1851;
         Intrinsics.checkNotNullParameter(var2, "velocity");
         return new me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var2, var3, var4, var5
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -5567;
         boolean var1 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         float var2 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         float var3 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         Vec3 var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         Vec3 var5 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 24039;
         short var10002 = -5564;
         short var10003 = -26985;
         short var10004 = -5568;
         short var10005 = 19455;
         short var10006 = -5560;
         short var10007 = -31124;
         short var10008 = -5565;
         short var10009 = 26410;
         return "SimState(pos=" + var5 + ", velocity=" + var4 + ", yaw=" + var3 + ", pitch=" + var2 + ", onGround=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         var1 = var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
         var1 = var1 * 31 + Float.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         var1 = var1 * 31 + Float.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         return var1 * 31 + Boolean.hashCode(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int var2 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
         Object var10000 = this;
         if (var2 == 0) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == 0) {
            if (!(
               var10000 instanceof me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = var1;
         }

         me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
         int var4 = ((Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )) ? 1 : 0);
         if (var2 == 0) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )) ? 1 : 0);
         }

         if (var2 == 0) {
            if (var4 == 0) {
               return false;
            }

            var4 = Float.compare(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            );
         }

         if (var2 == 0) {
            if (var4 != 0) {
               return false;
            }

            var4 = Float.compare(
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            );
         }

         if (var2 == 0) {
            if (var4 != 0) {
               return false;
            }

            var4 = ((this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) ? 1 : 0);
         }

         if (var2 == 0) {
            if (var4 !=( (!var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) ? 1 : 0)) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[9];
         int var3 = 0;
         String var2 = "\u00adßÈ\u0018þ\u009d\roå\u0014\rð\u0017\u0015\u0018é\u0017Ù)j\u0003Õ \u001a\u000b$aïÀþ'\u009a\u007f&ýü\u000bñôLy\u009bgtÕl*ì\bÄªáUx¯ñ\u001a\bè=d§ÈñçÑ";
         int var4 = "\u00adßÈ\u0018þ\u009d\roå\u0014\rð\u0017\u0015\u0018é\u0017Ù)j\u0003Õ \u001a\u000b$aïÀþ'\u009a\u007f&ýü\u000bñôLy\u009bgtÕl*ì\bÄªáUx¯ñ\u001a\bè=d§ÈñçÑ"
            .length();
         char var1 = 6;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 76;
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
                        case 0 -> 83;
                        case 1 -> 89;
                        case 2 -> 2;
                        case 3 -> 72;
                        case 4 -> 67;
                        case 5 -> 34;
                        default -> 40;
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
                        b = new String[9];
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

                     var2 = "³Ð4\b\u0084¸\u0006\u001eîè(\u001f";
                     var4 = "³Ð4\b\u0084¸\u0006\u001eîè(\u001f".length();
                     var1 = 3;
                     var8 = -1;
               }

               var10000 = 106;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
   } // PX-FIX end pxClinit
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -5568) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 41;
               case 1 -> 99;
               case 2 -> 14;
               case 3 -> 199;
               case 4 -> 6;
               case 5 -> 119;
               case 6 -> 20;
               case 7 -> 174;
               case 8 -> 114;
               case 9 -> 192;
               case 10 -> 84;
               case 11 -> 16;
               case 12 -> 152;
               case 13 -> 72;
               case 14 -> 102;
               case 15 -> 42;
               case 16 -> 132;
               case 17 -> 101;
               case 18 -> 217;
               case 19 -> 178;
               case 20 -> 169;
               case 21 -> 2;
               case 22 -> 85;
               case 23 -> 153;
               case 24 -> 188;
               case 25 -> 236;
               case 26 -> 22;
               case 27 -> 92;
               case 28 -> 78;
               case 29 -> 205;
               case 30 -> 203;
               case 31 -> 253;
               case 32 -> 98;
               case 33 -> 107;
               case 34 -> 254;
               case 35 -> 131;
               case 36 -> 93;
               case 37 -> 212;
               case 38 -> 190;
               case 39 -> 176;
               case 40 -> 166;
               case 41 -> 161;
               case 42 -> 195;
               case 43 -> 91;
               case 44 -> 13;
               case 45 -> 165;
               case 46 -> 197;
               case 47 -> 145;
               case 48 -> 28;
               case 49 -> 17;
               case 50 -> 171;
               case 51 -> 39;
               case 52 -> 5;
               case 53 -> 87;
               case 54 -> 154;
               case 55 -> 181;
               case 56 -> 7;
               case 57 -> 201;
               case 58 -> 21;
               case 59 -> 19;
               case 60 -> 109;
               case 61 -> 65;
               case 62 -> 232;
               case 63 -> 163;
               case 64 -> 231;
               case 65 -> 43;
               case 66 -> 105;
               case 67 -> 191;
               case 68 -> 53;
               case 69 -> 117;
               case 70 -> 47;
               case 71 -> 58;
               case 72 -> 226;
               case 73 -> 44;
               case 74 -> 135;
               case 75 -> 149;
               case 76 -> 67;
               case 77 -> 202;
               case 78 -> 103;
               case 79 -> 9;
               case 80 -> 68;
               case 81 -> 214;
               case 82 -> 147;
               case 83 -> 124;
               case 84 -> 251;
               case 85 -> 95;
               case 86 -> 100;
               case 87 -> 237;
               case 88 -> 52;
               case 89 -> 157;
               case 90 -> 86;
               case 91 -> 243;
               case 92 -> 35;
               case 93 -> 225;
               case 94 -> 36;
               case 95 -> 59;
               case 96 -> 69;
               case 97 -> 116;
               case 98 -> 204;
               case 99 -> 60;
               case 100 -> 54;
               case 101 -> 50;
               case 102 -> 23;
               case 103 -> 223;
               case 104 -> 121;
               case 105 -> 27;
               case 106 -> 10;
               case 107 -> 34;
               case 108 -> 151;
               case 109 -> 63;
               case 110 -> 211;
               case 111 -> 18;
               case 112 -> 196;
               case 113 -> 61;
               case 114 -> 209;
               case 115 -> 129;
               case 116 -> 4;
               case 117 -> 29;
               case 118 -> 71;
               case 119 -> 221;
               case 120 -> 88;
               case 121 -> 80;
               case 122 -> 164;
               case 123 -> 74;
               case 124 -> 1;
               case 125 -> 224;
               case 126 -> 76;
               case 127 -> 140;
               case 128 -> 218;
               case 129 -> 240;
               case 130 -> 12;
               case 131 -> 15;
               case 132 -> 168;
               case 133 -> 38;
               case 134 -> 244;
               case 135 -> 104;
               case 136 -> 162;
               case 137 -> 234;
               case 138 -> 33;
               case 139 -> 183;
               case 140 -> 238;
               case 141 -> 120;
               case 142 -> 3;
               case 143 -> 123;
               case 144 -> 138;
               case 145 -> 242;
               case 146 -> 136;
               case 147 -> 143;
               case 148 -> 62;
               case 149 -> 182;
               case 150 -> 30;
               case 151 -> 167;
               case 152 -> 194;
               case 153 -> 66;
               case 154 -> 81;
               case 155 -> 31;
               case 156 -> 83;
               case 157 -> 172;
               case 158 -> 142;
               case 159 -> 106;
               case 160 -> 189;
               case 161 -> 141;
               case 162 -> 239;
               case 163 -> 206;
               case 164 -> 94;
               case 165 -> 8;
               case 166 -> 0;
               case 167 -> 198;
               case 168 -> 118;
               case 169 -> 90;
               case 170 -> 126;
               case 171 -> 45;
               case 172 -> 247;
               case 173 -> 79;
               case 174 -> 235;
               case 175 -> 246;
               case 176 -> 230;
               case 177 -> 193;
               case 178 -> 97;
               case 179 -> 113;
               case 180 -> 24;
               case 181 -> 137;
               case 182 -> 222;
               case 183 -> 179;
               case 184 -> 227;
               case 185 -> 25;
               case 186 -> 110;
               case 187 -> 56;
               case 188 -> 173;
               case 189 -> 219;
               case 190 -> 241;
               case 191 -> 233;
               case 192 -> 57;
               case 193 -> 49;
               case 194 -> 70;
               case 195 -> 128;
               case 196 -> 207;
               case 197 -> 73;
               case 198 -> 252;
               case 199 -> 249;
               case 200 -> 255;
               case 201 -> 180;
               case 202 -> 184;
               case 203 -> 177;
               case 204 -> 108;
               case 205 -> 220;
               case 206 -> 150;
               case 207 -> 250;
               case 208 -> 200;
               case 209 -> 96;
               case 210 -> 229;
               case 211 -> 228;
               case 212 -> 148;
               case 213 -> 111;
               case 214 -> 40;
               case 215 -> 185;
               case 216 -> 187;
               case 217 -> 144;
               case 218 -> 48;
               case 219 -> 159;
               case 220 -> 82;
               case 221 -> 46;
               case 222 -> 115;
               case 223 -> 122;
               case 224 -> 158;
               case 225 -> 170;
               case 226 -> 37;
               case 227 -> 89;
               case 228 -> 77;
               case 229 -> 245;
               case 230 -> 156;
               case 231 -> 175;
               case 232 -> 127;
               case 233 -> 210;
               case 234 -> 11;
               case 235 -> 215;
               case 236 -> 208;
               case 237 -> 216;
               case 238 -> 213;
               case 239 -> 125;
               case 240 -> 134;
               case 241 -> 75;
               case 242 -> 51;
               case 243 -> 64;
               case 244 -> 155;
               case 245 -> 160;
               case 246 -> 55;
               case 247 -> 186;
               case 248 -> 146;
               case 249 -> 32;
               case 250 -> 112;
               case 251 -> 130;
               case 252 -> 133;
               case 253 -> 26;
               case 254 -> 139;
               default -> 248;
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
   
public static me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI p0, net.minecraft.world.phys.Vec3 p1, net.minecraft.world.phys.Vec3 p2, float p3, float p4, boolean p5, int p6, java.lang.Object p7) {
         return (me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI) null;
      }
}
}
