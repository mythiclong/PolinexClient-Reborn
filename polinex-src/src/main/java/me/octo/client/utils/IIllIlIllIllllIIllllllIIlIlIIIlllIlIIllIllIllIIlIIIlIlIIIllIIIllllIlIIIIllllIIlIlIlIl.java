package me.octo.client.utils;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack.Pose;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.mixin.accessors.BeaconBlockEntityRendererInvoker;
import net.fabricmc.fabric.api.client.rendering.v1.level.LevelRenderContext;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.MultiBufferSource.BufferSource;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3f;

public final class IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl
   extends lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   @NotNull
   public static IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static lIlIllIIlIlllllIIlIllIIllIlllIlllllIlIIlllllIllIIIllIIlllIIIllIlIIIIllllllIlIllIIIIIl IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private static Regex lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static String[] c;
   private static String[] d;

   private IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl() {
   }

   @NotNull
   public final lIlIllIIlIlllllIIlIllIIllIlllIlllllIlIIlllllIllIIIllIIlllIIIllIlIIIIllllllIlIllIIIIIl g() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIllIlllIIIIIllllIlllIIllIIIlIIllIIllIIlIllIIllIIIlIllIIlIIIIIlIIIIlIlIIIIIIlIlllIllI var1) {
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      short var10002 = 1337;
      short var10003 = -27686;
      Intrinsics.checkNotNullParameter(var1, "event");
      int[] var2 = var10000;
      if (var2 != null) {
         LevelRenderContext var8 = var1.k();
         if (var8 != null) {
            LevelRenderContext var3 = var8;
            if (var2 != null) {
               PoseStack var9 = var3.poseStack();
               if (var9 != null) {
                  PoseStack var4 = var9;
                  BufferSource var7 = var3.bufferSource();
                  BufferSource var10 = var7;
                  if (var2 != null) {
                     var10 = var7 instanceof BufferSource ? var7 : null;
                  }

                  if (var10 == null) {
                     return;
                  }

                  BufferSource var5 = var10;
                  Vec3 var11 = this.a().gameRenderer.getMainCamera().position();
                  var10002 = 1341;
                  var10003 = -617;
                  Intrinsics.checkNotNullExpressionValue(var11, "position(...)");
                  Vec3 var6 = var11;
                  var4.pushPose();
                  var4.translate(-var6.x, -var6.y, -var6.z);
                  this.a(
                     var4,
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.a(),
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.c(),
                     var5
                  );
                  this.a(var4, IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.b(), var5);
                  var4.popPose();
                  this.a(var4, IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.d(), var6);
                  this.a(var3, IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.e());
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.f();
                  return;
               }
            }

            return;
         }
      }
   }

   private final void a(
      PoseStack var1,
      List<? extends List<IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI>> var2,
      List<? extends List<IllIIIIlIIIIIllllIlIIllIIllllIIIIlllIllIllllIIlIIlIIIIlIlIIlIIlIIlIIIlllIIllllllIIlIl>> var3,
      BufferSource var4
   ) {
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      RenderType[] var7 = new RenderType[2];
      int[] var5 = var10000;
      var7[0] = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .i();
      var7[1] = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .j();
      List var6 = CollectionsKt.listOf(var7);
      Pose var47 = var1.last();
      short var10002 = 1340;
      short var10003 = -6568;
      Intrinsics.checkNotNullExpressionValue(var47, "last(...)");
      Pose var37 = var47;
      Vec3 var48 = this.a().gameRenderer.getMainCamera().position();
      var10002 = 1341;
      var10003 = -617;
      Intrinsics.checkNotNullExpressionValue(var48, "position(...)");
      Vec3 var8 = var48;
      int var9 = 0;

      while (var9 < 2) {
         label53: {
            label64: {
               label51: {
                  boolean var49 = ((List)var2.get(var9)).isEmpty();
                  if (var5 != null) {
                     if (!var49) {
                        break label51;
                     }

                     var49 = ((List)var3.get(var9)).isEmpty();
                  }

                  if (var49) {
                     break label64;
                  }
               }

               VertexConsumer var50 = var4.getBuffer((RenderType)var6.get(var9));
               var10002 = 1336;
               var10003 = -29695;
               Intrinsics.checkNotNullExpressionValue(var50, "getBuffer(...)");
               VertexConsumer var10 = var50;

               for (IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI var12 :((IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI[])(Object)( (List)var2.get(var9)))) {
                  double var13 = var12.b().x - var12.a().x;
                  double var15 = var12.b().y - var12.a().y;
                  double var17 = var12.b().z - var12.a().z;
                  double var19 = (var12.a().x + var12.b().x) / 2.0;
                  double var21 = (var12.a().y + var12.b().y) / 2.0;
                  double var23 = (var12.a().z + var12.b().z) / 2.0;
                  double var25 = var19 - var8.x;
                  double var27 = var21 - var8.y;
                  double var29 = var23 - var8.z;
                  double var31 = Math.sqrt(var25 * var25 + var27 * var27 + var29 * var29);
                  double var33 = RangesKt.coerceIn(1.0 / (1.0 + var31 * 0.01), 0.3, 1.0);
                  int var35 = this.a(var12.c(), var33);
                  int var36 = this.a(var12.d(), var33);
                  IIlIIlIlllIIllIIIllIIIIIIIIllIIllllIlIlllIIlIlIllIIIIIIIlIlIIIIIlIIIIllIlIIlIIllllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(var37, var10, new Vector3f((float)var12.a().x, (float)var12.a().y, (float)var12.a().z), new Vec3(var13, var15, var17), var35, var36);
                  if (var5 == null || var5 == null) {
                     break;
                  }
               }

               for (IllIIIIlIIIIIllllIlIIllIIllllIIIIlllIllIllllIIlIIlIIIIlIlIIlIIlIIlIIIlllIIllllllIIlIl var38 :((IllIIIIlIIIIIllllIlIIllIIllllIIIIlllIllIllllIIlIIlIIIIlIlIIlIIlIIlIIIlllIIllllllIIlIl[])(Object)( (List)var3.get(var9)))) {
                  double var39 = (var38.a().minX + var38.a().maxX) / 2.0;
                  double var40 = (var38.a().minY + var38.a().maxY) / 2.0;
                  double var41 = (var38.a().minZ + var38.a().maxZ) / 2.0;
                  double var42 = var39 - var8.x;
                  double var43 = var40 - var8.y;
                  double var44 = var41 - var8.z;
                  double var45 = Math.sqrt(var42 * var42 + var43 * var43 + var44 * var44);
                  float var46 = RangesKt.coerceIn((float)(var38.e() / (1.0 + var45 * 0.01)), 0.3F, var38.e());
                  IIlIIlIlllIIllIIIllIIIIIIIIllIIllllIlIlllIIlIlIllIIIIIIIlIlIIIIIlIIIIllIlIIlIIllllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(var1, var10, var38.a(), var38.b(), var38.c(), var38.d(), var46);
                  if (var5 == null) {
                     break label53;
                  }

                  if (var5 == null) {
                     break;
                  }
               }

               var4.endBatch((RenderType)var6.get(var9));
            }

            var9++;
         }

         if (var5 == null) {
            break;
         }
      }
   }

   private final int a(int var1, double var2) {
      int var4 = RangesKt.coerceIn((int)((var1 >> 24 & 0xFF) * var2), 0, 255);
      int var5 = var1 >> 16 & 0xFF;
      int var6 = var1 >> 8 & 0xFF;
      int var7 = var1 & 0xFF;
      return var4 << 24 | var5 << 16 | var6 << 8 | var7;
   }

   private final void a(
      PoseStack var1, List<? extends List<IllIIIIlIIIIIllllIlIIllIIllllIIIIlllIllIllllIIlIIlIIIIlIlIIlIIlIIlIIIlllIIllllllIIlIl>> var2, BufferSource var3
   ) {
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      RenderType[] var6 = new RenderType[]{
         lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .k(),
         null
      };
      int[] var4 = var10000;
      var6[1] = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .l();
      List var5 = CollectionsKt.listOf(var6);
      Vec3 var30 = this.a().gameRenderer.getMainCamera().position();
      short var10002 = 1339;
      short var10003 = -27690;
      Intrinsics.checkNotNullExpressionValue(var30, "position(...)");
      Vec3 var29 = var30;
      Iterator var7 = var2.iterator();
      int var8 = 0;

      while (true) {
         boolean var31 = var7.hasNext();

         int var9;
         List var10;
         do {
            if (!var31) {
               return;
            }

            var9 = var8++;
            var10 = (List)var7.next();
            var31 = var10.isEmpty();
         } while (var4 == null);

         if (!var31) {
            VertexConsumer var32 = var3.getBuffer((RenderType)var5.get(var9));
            var10002 = 1338;
            var10003 = 6444;
            Intrinsics.checkNotNullExpressionValue(var32, "getBuffer(...)");
            VertexConsumer var11 = var32;
            Iterator var12 = var10.iterator();

            while (true) {
               if (var12.hasNext()) {
                  IllIIIIlIIIIIllllIlIIllIIllllIIIIlllIllIllllIIlIIlIIIIlIlIIlIIlIIlIIIlllIIllllllIIlIl var13 = (IllIIIIlIIIIIllllIlIIllIIllllIIIIlllIllIllllIIlIIlIIIIlIlIIlIIlIIlIIIlllIIllllllIIlIl)var12.next();
                  double var14 = (var13.a().minX + var13.a().maxX) / 2.0;
                  double var16 = (var13.a().minY + var13.a().maxY) / 2.0;
                  double var18 = (var13.a().minZ + var13.a().maxZ) / 2.0;
                  double var20 = var14 - var29.x;
                  double var22 = var16 - var29.y;
                  double var24 = var18 - var29.z;
                  double var26 = Math.sqrt(var20 * var20 + var22 * var22 + var24 * var24);
                  float var28 = RangesKt.coerceIn((float)(var13.e() / (1.0 + var26 * 0.008)), 0.0F, var13.e());
                  IIlIIlIlllIIllIIIllIIIIIIIIllIIllllIlIlllIIlIlIllIIIIIIIlIlIIIIIlIIIIllIlIIlIIllllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(var1, var11, var13.a(), var13.b(), var13.c(), var13.d(), var28);
                  if (var4 == null) {
                     break;
                  }

                  if (var4 != null) {
                     continue;
                  }
               }

               var3.endBatch((RenderType)var5.get(var9));
               break;
            }

            if (var4 == null) {
               return;
            }
         }
      }
   }

   private final void a(PoseStack var1, List<lIlIlIIIlllIlllIIIlIIIlIIlIIIlIllllllllIlIlIIlllIllIIIllllIlllIIIIlIIlIIIIIlllIlIllll> var2, Vec3 var3) {
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      Iterator var5 = var2.iterator();
      int[] var4 = var10000;

      while (var5.hasNext()) {
         float var16;
         int var17;
         long var18;
         MultiBufferSource var10001;
         float var10002;
         label25: {
            lIlIlIIIlllIlllIIIlIIIlIIlIIIlIllllllllIlIlIIlllIllIIIllllIlllIIIIlIIlIIIIIlllIlIllll var6 = (lIlIlIIIlllIlllIIIlIIIlIIlIIIlIllllllllIlIlIIlllIllIIIllllIlllIIIIlIIlIIIIIlllIlIllll)var5.next();
            var1.pushPose();
            var1.translate(var6.a().getX() - var3.x, var6.a().getY() - var3.y, var6.a().getZ() - var3.z);
            double var7 = var6.a().getX() + 0.5;
            double var9 = var6.a().getZ() + 0.5;
            double var11 = var3.x - var7;
            double var13 = var3.z - var9;
            float var15 = (float)Math.sqrt(var11 * var11 + var13 * var13);
            var16 = var6.c() ? 1.0F : Math.max(1.0F, var15 * 0.010416667F);
            var17 = var6.b().o();
            var10001 = this.a().renderBuffers().bufferSource();
            var10002 = this.a().getDeltaTracker().getGameTimeDeltaTicks();
            if (var4 != null) {
               ClientLevel var10004 = this.a().level;
               if (var10004 != null) {
                  var18 = var10004.getGameTime();
                  break label25;
               }
            }

            var18 = 0L;
         }

         BeaconBlockEntityRendererInvoker.renderBeam(var1, var10001, var10002, var16, var18, 0, 319, var17);
         var1.popPose();
         if (var4 == null) {
            break;
         }
      }
   }

   private final void a(LevelRenderContext var1, List<IIllIIIIIlIIlIlIlIIlllIIlIlIIIIlIlIIIIllIlIllIllllIlllIllIllIlIlIlIIIlIIIIIIllIIllIII> var2) {
      int[] var3 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      if (!var2.isEmpty()) {
         ArrayList var4 = new ArrayList(var2.size());
         Iterator var5 = var2.iterator();

         IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl var10000;
         while (true) {
            if (var5.hasNext()) {
               IIllIIIIIlIIlIlIlIIlllIIlIlIIIIlIlIIIIllIlIllIllllIlllIllIllIlIlIlIIIlIIIIIIllIIllIII var6 = (IIllIIIIIlIIlIlIlIIlllIIlIlIIIIlIlIIIIllIlIllIllllIlllIllIllIlIlIlIIIlIIIIIIllIIllIII)var5.next();
               CharSequence var8 = var6.a();
               Regex var9 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
               String var10 = "";
               String var7 = var9.replace(var8, var10);
               IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var11 = new IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
                  var7, var6.f(), var6.e().o(), false, 16.0F
               );
               if (var3 == null) {
                  continue;
               }

               var10000 = IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
               if (var3 == null) {
                  break;
               }

               IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var13 = IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var11);
               if (var13 == null) {
                  continue;
               }

               IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var12 = var13;
               var4.add(
                  new IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                     var12, var6.b(), var6.c(), var6.g(), !var6.d()
                  )
               );
               if (var3 != null) {
                  continue;
               }
            }

            var10000 = IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            break;
         }

         var10000.a(var1, var4);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[7];
      int var3 = 0;
      String var2 = "£\u0087u\u00ad#\u000e´IÄ)'8\bSë&ä÷(m\rùK\u009f\tª}\u0091\u001eªãÝ\u0089\b\u000e(_WëU`FX\"GÝÛ\u000fè\r\u000b\u0086Á°aJèø\u0085?8\u0012´";
      int var4 = "£\u0087u\u00ad#\u000e´IÄ)'8\bSë&ä÷(m\rùK\u009f\tª}\u0091\u001eªãÝ\u0089\b\u000e(_WëU`FX\"GÝÛ\u000fè\r\u000b\u0086Á°aJèø\u0085?8\u0012´"
         .length();
      char var1 = 5;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 88;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var25 = var10001.toCharArray();
               int var10004 = var25.length;
               int var6 = 0;
               byte var28 = var10000;
               var20 = var25;
               int var14 = var10004;
               byte var34;
               char[] var38;
               int var10006;
               if (var10004 <= 1) {
                  var38 = var25;
                  var34 = var10000;
                  var10006 = var6;
               } else {
                  var28 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var38 = var25;
                  var34 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var38[var10006] = (char)(var38[var10006] ^ var34 ^ switch (var6 % 7) {
                     case 0 -> 109;
                     case 1 -> 5;
                     case 2 -> 83;
                     case 3 -> 120;
                     case 4 -> 9;
                     case 5 -> 45;
                     default -> 35;
                  });
                  var6++;
                  if (var28 == 0) {
                     var10006 = var28;
                     var38 = var20;
                     var34 = var28;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var38 = var20;
                     var34 = var28;
                     var10006 = var6;
                  }
               }
            }

            String var30 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var30;
                  if ((var8 += var1) >= var4) {
                     c = var5;
                     d = new String[7];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl();
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new lIlIllIIlIlllllIIlIllIIllIlllIlllllIlIIlllllIllIIIllIIlllIIIllIlIIIIllllllIlIllIIIIIl();
                     var10002 = 1343;
                     short var31 = -17566;
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new Regex("§[0-9a-fk-or]");
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var30;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "´gÿ\b¬ò\u0091V\u0094\r0K\u009e©ºûc\u0099ëOÉuÁ";
                  var4 = "´gÿ\b¬ò\u0091V\u0094\r0K\u009e©ºûc\u0099ëOÉuÁ".length();
                  var1 = '\t';
                  var8 = -1;
            }

            var10000 = 33;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 1337) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 239;
            case 1 -> 188;
            case 2 -> 122;
            case 3 -> 56;
            case 4 -> 124;
            case 5 -> 37;
            case 6 -> 153;
            case 7 -> 53;
            case 8 -> 2;
            case 9 -> 70;
            case 10 -> 57;
            case 11 -> 103;
            case 12 -> 212;
            case 13 -> 117;
            case 14 -> 118;
            case 15 -> 15;
            case 16 -> 62;
            case 17 -> 154;
            case 18 -> 214;
            case 19 -> 149;
            case 20 -> 249;
            case 21 -> 3;
            case 22 -> 206;
            case 23 -> 101;
            case 24 -> 79;
            case 25 -> 91;
            case 26 -> 9;
            case 27 -> 69;
            case 28 -> 165;
            case 29 -> 178;
            case 30 -> 158;
            case 31 -> 134;
            case 32 -> 80;
            case 33 -> 45;
            case 34 -> 144;
            case 35 -> 77;
            case 36 -> 35;
            case 37 -> 246;
            case 38 -> 64;
            case 39 -> 92;
            case 40 -> 94;
            case 41 -> 105;
            case 42 -> 95;
            case 43 -> 142;
            case 44 -> 221;
            case 45 -> 213;
            case 46 -> 152;
            case 47 -> 68;
            case 48 -> 175;
            case 49 -> 230;
            case 50 -> 8;
            case 51 -> 36;
            case 52 -> 163;
            case 53 -> 190;
            case 54 -> 137;
            case 55 -> 60;
            case 56 -> 138;
            case 57 -> 14;
            case 58 -> 139;
            case 59 -> 210;
            case 60 -> 141;
            case 61 -> 20;
            case 62 -> 73;
            case 63 -> 215;
            case 64 -> 59;
            case 65 -> 181;
            case 66 -> 130;
            case 67 -> 202;
            case 68 -> 81;
            case 69 -> 242;
            case 70 -> 78;
            case 71 -> 146;
            case 72 -> 97;
            case 73 -> 225;
            case 74 -> 184;
            case 75 -> 65;
            case 76 -> 98;
            case 77 -> 183;
            case 78 -> 23;
            case 79 -> 51;
            case 80 -> 218;
            case 81 -> 209;
            case 82 -> 208;
            case 83 -> 115;
            case 84 -> 232;
            case 85 -> 88;
            case 86 -> 243;
            case 87 -> 28;
            case 88 -> 224;
            case 89 -> 201;
            case 90 -> 217;
            case 91 -> 106;
            case 92 -> 168;
            case 93 -> 16;
            case 94 -> 119;
            case 95 -> 180;
            case 96 -> 128;
            case 97 -> 194;
            case 98 -> 48;
            case 99 -> 173;
            case 100 -> 0;
            case 101 -> 19;
            case 102 -> 216;
            case 103 -> 33;
            case 104 -> 50;
            case 105 -> 11;
            case 106 -> 127;
            case 107 -> 39;
            case 108 -> 40;
            case 109 -> 58;
            case 110 -> 255;
            case 111 -> 131;
            case 112 -> 17;
            case 113 -> 87;
            case 114 -> 236;
            case 115 -> 49;
            case 116 -> 112;
            case 117 -> 226;
            case 118 -> 179;
            case 119 -> 170;
            case 120 -> 211;
            case 121 -> 200;
            case 122 -> 63;
            case 123 -> 162;
            case 124 -> 135;
            case 125 -> 114;
            case 126 -> 250;
            case 127 -> 147;
            case 128 -> 13;
            case 129 -> 27;
            case 130 -> 109;
            case 131 -> 193;
            case 132 -> 104;
            case 133 -> 4;
            case 134 -> 66;
            case 135 -> 24;
            case 136 -> 18;
            case 137 -> 1;
            case 138 -> 177;
            case 139 -> 145;
            case 140 -> 102;
            case 141 -> 197;
            case 142 -> 111;
            case 143 -> 55;
            case 144 -> 96;
            case 145 -> 136;
            case 146 -> 74;
            case 147 -> 129;
            case 148 -> 30;
            case 149 -> 238;
            case 150 -> 231;
            case 151 -> 192;
            case 152 -> 151;
            case 153 -> 71;
            case 154 -> 204;
            case 155 -> 155;
            case 156 -> 140;
            case 157 -> 100;
            case 158 -> 252;
            case 159 -> 253;
            case 160 -> 172;
            case 161 -> 164;
            case 162 -> 107;
            case 163 -> 207;
            case 164 -> 150;
            case 165 -> 52;
            case 166 -> 195;
            case 167 -> 22;
            case 168 -> 233;
            case 169 -> 113;
            case 170 -> 34;
            case 171 -> 7;
            case 172 -> 93;
            case 173 -> 86;
            case 174 -> 251;
            case 175 -> 89;
            case 176 -> 126;
            case 177 -> 21;
            case 178 -> 254;
            case 179 -> 205;
            case 180 -> 189;
            case 181 -> 237;
            case 182 -> 247;
            case 183 -> 120;
            case 184 -> 220;
            case 185 -> 10;
            case 186 -> 167;
            case 187 -> 132;
            case 188 -> 174;
            case 189 -> 229;
            case 190 -> 42;
            case 191 -> 43;
            case 192 -> 199;
            case 193 -> 241;
            case 194 -> 61;
            case 195 -> 159;
            case 196 -> 44;
            case 197 -> 191;
            case 198 -> 6;
            case 199 -> 82;
            case 200 -> 76;
            case 201 -> 83;
            case 202 -> 12;
            case 203 -> 245;
            case 204 -> 26;
            case 205 -> 227;
            case 206 -> 187;
            case 207 -> 198;
            case 208 -> 143;
            case 209 -> 203;
            case 210 -> 31;
            case 211 -> 171;
            case 212 -> 228;
            case 213 -> 67;
            case 214 -> 123;
            case 215 -> 72;
            case 216 -> 121;
            case 217 -> 116;
            case 218 -> 185;
            case 219 -> 156;
            case 220 -> 5;
            case 221 -> 110;
            case 222 -> 46;
            case 223 -> 176;
            case 224 -> 234;
            case 225 -> 223;
            case 226 -> 75;
            case 227 -> 166;
            case 228 -> 169;
            case 229 -> 38;
            case 230 -> 54;
            case 231 -> 244;
            case 232 -> 182;
            case 233 -> 25;
            case 234 -> 108;
            case 235 -> 219;
            case 236 -> 148;
            case 237 -> 85;
            case 238 -> 99;
            case 239 -> 133;
            case 240 -> 47;
            case 241 -> 186;
            case 242 -> 84;
            case 243 -> 248;
            case 244 -> 161;
            case 245 -> 160;
            case 246 -> 125;
            case 247 -> 41;
            case 248 -> 196;
            case 249 -> 240;
            case 250 -> 32;
            case 251 -> 29;
            case 252 -> 235;
            case 253 -> 157;
            case 254 -> 222;
            default -> 90;
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
}
