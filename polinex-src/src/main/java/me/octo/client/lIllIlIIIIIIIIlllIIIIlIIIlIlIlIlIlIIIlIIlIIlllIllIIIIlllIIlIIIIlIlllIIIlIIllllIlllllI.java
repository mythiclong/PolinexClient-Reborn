package me.octo.client;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack.Pose;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3fc;

public final class lIllIlIIIIIIIIlllIIIIlIIIlIlIlIlIlIIIlIIlIIlllIllIIIIlllIIlIIIIlIlllIIIlIIllllIlllllI {
   private static String[] a;
   private static String[] b;

   @NotNull
   public static final VertexConsumer a(@NotNull VertexConsumer var0, @NotNull Matrix4fc var1, double var2, double var4, double var6) {
      short var10001 = 14753;
      short var10002 = -6437;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 14759;
      var10002 = 12943;
      Intrinsics.checkNotNullParameter(var1, "pose");
      boolean var8 = false;
      VertexConsumer var10000 = var0.addVertex(var1, (float)var2, (float)var4, (float)var6);
      var10002 = 14762;
      short var10003 = -31346;
      Intrinsics.checkNotNullExpressionValue(var10000, "addVertex(...)");
      return var10000;
   }

   @NotNull
   public static final VertexConsumer a(@NotNull VertexConsumer var0, @NotNull Pose var1, double var2, double var4, double var6) {
      short var10001 = 14753;
      short var10002 = -6437;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 14759;
      var10002 = 12943;
      Intrinsics.checkNotNullParameter(var1, "pose");
      boolean var8 = false;
      Matrix4f var10000 = var1.pose();
      var10002 = 14755;
      short var10003 = -28898;
      Intrinsics.checkNotNullExpressionValue(var10000, "pose(...)");
      Matrix4fc var10 = (Matrix4fc)var10000;
      boolean var17 = false;
      VertexConsumer var18 = var0.addVertex(var10, (float)var2, (float)var4, (float)var6);
      var10002 = 14762;
      var10003 = -31346;
      Intrinsics.checkNotNullExpressionValue(var18, "addVertex(...)");
      return var18;
   }

   @NotNull
   public static final VertexConsumer a(@NotNull VertexConsumer var0, @NotNull Matrix4fc var1, @NotNull Vec3 var2) {
      short var10001 = 14753;
      short var10002 = -6437;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 14759;
      var10002 = 12943;
      Intrinsics.checkNotNullParameter(var1, "pose");
      var10001 = 14757;
      var10002 = 919;
      Intrinsics.checkNotNullParameter(var2, "pos");
      boolean var3 = false;
      double var6 = var2.x;
      double var8 = var2.y;
      double var10 = var2.z;
      boolean var12 = false;
      VertexConsumer var10000 = var0.addVertex(var1, (float)var6, (float)var8, (float)var10);
      var10002 = 14762;
      short var10003 = -31346;
      Intrinsics.checkNotNullExpressionValue(var10000, "addVertex(...)");
      return var10000;
   }

   @NotNull
   public static final VertexConsumer a(@NotNull VertexConsumer var0, @NotNull Pose var1, @NotNull Vec3 var2) {
      short var10001 = 14753;
      short var10002 = -6437;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 14759;
      var10002 = 12943;
      Intrinsics.checkNotNullParameter(var1, "pose");
      var10001 = 14757;
      var10002 = 919;
      Intrinsics.checkNotNullParameter(var2, "pos");
      boolean var3 = false;
      double var6 = var2.x;
      double var8 = var2.y;
      double var10 = var2.z;
      boolean var12 = false;
      Matrix4f var10000 = var1.pose();
      var10002 = 14754;
      short var10003 = 17994;
      Intrinsics.checkNotNullExpressionValue(var10000, "pose(...)");
      Matrix4fc var14 = (Matrix4fc)var10000;
      boolean var21 = false;
      VertexConsumer var22 = var0.addVertex(var14, (float)var6, (float)var8, (float)var10);
      var10002 = 14762;
      var10003 = -31346;
      Intrinsics.checkNotNullExpressionValue(var22, "addVertex(...)");
      return var22;
   }

   @NotNull
   public static final VertexConsumer a(
      @NotNull VertexConsumer var0,
      @NotNull Matrix4fc var1,
      @NotNull lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII var2
   ) {
      short var10001 = 14753;
      short var10002 = -6437;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 14759;
      var10002 = 12943;
      Intrinsics.checkNotNullParameter(var1, "pose");
      var10001 = 14757;
      var10002 = 919;
      Intrinsics.checkNotNullParameter(var2, "pos");
      boolean var3 = false;
      VertexConsumer var10000 = var0.addVertex(var1, var2.i(), var2.j(), var2.k());
      var10002 = 14762;
      short var10003 = -31346;
      Intrinsics.checkNotNullExpressionValue(var10000, "addVertex(...)");
      return var10000;
   }

   @NotNull
   public static final VertexConsumer a(
      @NotNull VertexConsumer var0, @NotNull Pose var1, @NotNull lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII var2
   ) {
      short var10001 = 14753;
      short var10002 = -6437;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 14759;
      var10002 = 12943;
      Intrinsics.checkNotNullParameter(var1, "pose");
      var10001 = 14757;
      var10002 = 919;
      Intrinsics.checkNotNullParameter(var2, "pos");
      boolean var3 = false;
      VertexConsumer var10000 = var0.addVertex(var1, var2.i(), var2.j(), var2.k());
      var10002 = 14762;
      short var10003 = -31346;
      Intrinsics.checkNotNullExpressionValue(var10000, "addVertex(...)");
      return var10000;
   }

   @NotNull
   public static final VertexConsumer a(@NotNull VertexConsumer var0, @NotNull Matrix4fc var1, @NotNull Vector3fc var2) {
      short var10001 = 14753;
      short var10002 = -6437;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 14759;
      var10002 = 12943;
      Intrinsics.checkNotNullParameter(var1, "pose");
      var10001 = 14756;
      var10002 = -28881;
      Intrinsics.checkNotNullParameter(var2, "pos");
      boolean var3 = false;
      VertexConsumer var10000 = var0.addVertex(var1, var2.x(), var2.y(), var2.z());
      var10002 = 14762;
      short var10003 = -31346;
      Intrinsics.checkNotNullExpressionValue(var10000, "addVertex(...)");
      return var10000;
   }

   @NotNull
   public static final VertexConsumer a(@NotNull VertexConsumer var0, @NotNull Pose var1, @NotNull Vector3fc var2) {
      short var10001 = 14753;
      short var10002 = -6437;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 14759;
      var10002 = 12943;
      Intrinsics.checkNotNullParameter(var1, "pose");
      var10001 = 14757;
      var10002 = 919;
      Intrinsics.checkNotNullParameter(var2, "pos");
      boolean var3 = false;
      VertexConsumer var10000 = var0.addVertex(var1, var2.x(), var2.y(), var2.z());
      var10002 = 14762;
      short var10003 = -31346;
      Intrinsics.checkNotNullExpressionValue(var10000, "addVertex(...)");
      return var10000;
   }

   @NotNull
   public static final VertexConsumer b(
      @NotNull VertexConsumer var0, @NotNull Pose var1, @NotNull lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII var2
   ) {
      short var10001 = 14753;
      short var10002 = -6437;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 14759;
      var10002 = 12943;
      Intrinsics.checkNotNullParameter(var1, "pose");
      var10001 = 14758;
      var10002 = -6566;
      Intrinsics.checkNotNullParameter(var2, "normal");
      boolean var3 = false;
      VertexConsumer var10000 = var0.setNormal(var1, var2.i(), var2.j(), var2.k());
      var10002 = 14761;
      short var10003 = 21626;
      Intrinsics.checkNotNullExpressionValue(var10000, "setNormal(...)");
      return var10000;
   }

   @NotNull
   public static final VertexConsumer a(
      @NotNull VertexConsumer var0, @NotNull llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1
   ) {
      short var10001 = 14753;
      short var10002 = -6437;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 14767;
      var10002 = -23985;
      Intrinsics.checkNotNullParameter(var1, "color");
      boolean var2 = false;
      VertexConsumer var10000 = var0.setColor(var1.h());
      var10002 = 14760;
      short var10003 = -29986;
      Intrinsics.checkNotNullExpressionValue(var10000, "setColor(...)");
      return var10000;
   }

   public static final void a(
      @NotNull VertexConsumer var0,
      @NotNull Matrix4fc var1,
      @NotNull AABB var2,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3,
      int var4
   ) {
      short var10001 = 14753;
      short var10002 = -6437;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 14759;
      var10002 = 12943;
      Intrinsics.checkNotNullParameter(var1, "pose");
      int var10000 = ((IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.c()) ? 1 : 0);
      var10002 = 14763;
      short var10003 = 30635;
      Intrinsics.checkNotNullParameter(var2, "box");
      boolean var5 = (var10000 != 0);
      var10000 = var4 & 16777215;
      if (!var5) {
         var10000 = var10000 != 16777215 ? 1 : 0;
      }

      int var6;
      int var9;
      label664: {
         double var10;
         double var12;
         double var14;
         label635: {
            var6 = var10000;
            boolean var8 = false;
            var9 = 0;
            var10000 = var9++;
            var10 = var2.minZ;
            var12 = var2.minY;
            var14 = var2.minX;
            int var16 = var10000;
            boolean var17 = false;
            var10000 = var6;
            if (!var5) {
               if (var6 == 0) {
                  break label635;
               }

               var10000 = var4 & 1 << var16;
            }

            if (var10000 == 0) {
               if (!var5) {
                  break label664;
               }

               me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
                  new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[1]
               );
            }
         }

         boolean var26 = false;
         VertexConsumer var239 = var0.addVertex(var1, (float)var14, (float)var12, (float)var10);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var239, "addVertex(...)");
         if (!var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label665: {
         double var51;
         double var74;
         double var97;
         label618: {
            var10000 = var9++;
            var51 = var2.minZ;
            var74 = var2.minY;
            var97 = var2.maxX;
            int var120 = var10000;
            boolean var143 = false;
            var10000 = var6;
            if (!var5) {
               if (var6 == 0) {
                  break label618;
               }

               var10000 = var4 & 1 << var120;
            }

            if (var10000 == 0 && !var5) {
               break label665;
            }
         }

         boolean var166 = false;
         VertexConsumer var240 = var0.addVertex(var1, (float)var97, (float)var74, (float)var51);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var240, "addVertex(...)");
         if (!var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label666: {
         double var52;
         double var75;
         double var98;
         label602: {
            var10000 = var9++;
            var52 = var2.minZ;
            var75 = var2.minY;
            var98 = var2.maxX;
            int var121 = var10000;
            boolean var144 = false;
            var10000 = var6;
            if (!var5) {
               if (var6 == 0) {
                  break label602;
               }

               var10000 = var4 & 1 << var121;
            }

            if (var10000 == 0 && !var5) {
               break label666;
            }
         }

         boolean var167 = false;
         VertexConsumer var241 = var0.addVertex(var1, (float)var98, (float)var75, (float)var52);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var241, "addVertex(...)");
         if (!var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label667: {
         double var53;
         double var76;
         double var99;
         label586: {
            var10000 = var9++;
            var53 = var2.maxZ;
            var76 = var2.minY;
            var99 = var2.maxX;
            int var122 = var10000;
            boolean var145 = false;
            var10000 = var6;
            if (!var5) {
               if (var6 == 0) {
                  break label586;
               }

               var10000 = var4 & 1 << var122;
            }

            if (var10000 == 0 && !var5) {
               break label667;
            }
         }

         boolean var168 = false;
         VertexConsumer var242 = var0.addVertex(var1, (float)var99, (float)var76, (float)var53);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var242, "addVertex(...)");
         if (!var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label668: {
         double var54;
         double var77;
         double var100;
         label570: {
            var10000 = var9++;
            var54 = var2.maxZ;
            var77 = var2.minY;
            var100 = var2.maxX;
            int var123 = var10000;
            boolean var146 = false;
            var10000 = var6;
            if (!var5) {
               if (var6 == 0) {
                  break label570;
               }

               var10000 = var4 & 1 << var123;
            }

            if (var10000 == 0 && !var5) {
               break label668;
            }
         }

         boolean var169 = false;
         VertexConsumer var243 = var0.addVertex(var1, (float)var100, (float)var77, (float)var54);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var243, "addVertex(...)");
         if (!var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label669: {
         double var55;
         double var78;
         double var101;
         label554: {
            var10000 = var9++;
            var55 = var2.maxZ;
            var78 = var2.minY;
            var101 = var2.minX;
            int var124 = var10000;
            boolean var147 = false;
            var10000 = var6;
            if (!var5) {
               if (var6 == 0) {
                  break label554;
               }

               var10000 = var4 & 1 << var124;
            }

            if (var10000 == 0 && !var5) {
               break label669;
            }
         }

         boolean var170 = false;
         VertexConsumer var244 = var0.addVertex(var1, (float)var101, (float)var78, (float)var55);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var244, "addVertex(...)");
         if (!var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label670: {
         double var56;
         double var79;
         double var102;
         label538: {
            var10000 = var9++;
            var56 = var2.maxZ;
            var79 = var2.minY;
            var102 = var2.minX;
            int var125 = var10000;
            boolean var148 = false;
            var10000 = var6;
            if (!var5) {
               if (var6 == 0) {
                  break label538;
               }

               var10000 = var4 & 1 << var125;
            }

            if (var10000 == 0 && !var5) {
               break label670;
            }
         }

         boolean var171 = false;
         VertexConsumer var245 = var0.addVertex(var1, (float)var102, (float)var79, (float)var56);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var245, "addVertex(...)");
         if (!var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label671: {
         double var57;
         double var80;
         double var103;
         label522: {
            var10000 = var9++;
            var57 = var2.minZ;
            var80 = var2.minY;
            var103 = var2.minX;
            int var126 = var10000;
            boolean var149 = false;
            var10000 = var6;
            if (!var5) {
               if (var6 == 0) {
                  break label522;
               }

               var10000 = var4 & 1 << var126;
            }

            if (var10000 == 0 && !var5) {
               break label671;
            }
         }

         boolean var172 = false;
         VertexConsumer var246 = var0.addVertex(var1, (float)var103, (float)var80, (float)var57);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var246, "addVertex(...)");
         if (!var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label672: {
         double var58;
         double var81;
         double var104;
         label506: {
            var10000 = var9++;
            var58 = var2.minZ;
            var81 = var2.minY;
            var104 = var2.minX;
            int var127 = var10000;
            boolean var150 = false;
            var10000 = var6;
            if (!var5) {
               if (var6 == 0) {
                  break label506;
               }

               var10000 = var4 & 1 << var127;
            }

            if (var10000 == 0 && !var5) {
               break label672;
            }
         }

         boolean var173 = false;
         VertexConsumer var247 = var0.addVertex(var1, (float)var104, (float)var81, (float)var58);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var247, "addVertex(...)");
         if (!var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label673: {
         double var59;
         double var82;
         double var105;
         label490: {
            var10000 = var9++;
            var59 = var2.minZ;
            var82 = var2.maxY;
            var105 = var2.minX;
            int var128 = var10000;
            boolean var151 = false;
            var10000 = var6;
            if (!var5) {
               if (var6 == 0) {
                  break label490;
               }

               var10000 = var4 & 1 << var128;
            }

            if (var10000 == 0 && !var5) {
               break label673;
            }
         }

         boolean var174 = false;
         VertexConsumer var248 = var0.addVertex(var1, (float)var105, (float)var82, (float)var59);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var248, "addVertex(...)");
         if (!var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label674: {
         double var60;
         double var83;
         double var106;
         label474: {
            var10000 = var9++;
            var60 = var2.minZ;
            var83 = var2.minY;
            var106 = var2.maxX;
            int var129 = var10000;
            boolean var152 = false;
            var10000 = var6;
            if (!var5) {
               if (var6 == 0) {
                  break label474;
               }

               var10000 = var4 & 1 << var129;
            }

            if (var10000 == 0 && !var5) {
               break label674;
            }
         }

         boolean var175 = false;
         VertexConsumer var249 = var0.addVertex(var1, (float)var106, (float)var83, (float)var60);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var249, "addVertex(...)");
         if (!var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label675: {
         double var61;
         double var84;
         double var107;
         label458: {
            var10000 = var9++;
            var61 = var2.minZ;
            var84 = var2.maxY;
            var107 = var2.maxX;
            int var130 = var10000;
            boolean var153 = false;
            var10000 = var6;
            if (!var5) {
               if (var6 == 0) {
                  break label458;
               }

               var10000 = var4 & 1 << var130;
            }

            if (var10000 == 0 && !var5) {
               break label675;
            }
         }

         boolean var176 = false;
         VertexConsumer var250 = var0.addVertex(var1, (float)var107, (float)var84, (float)var61);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var250, "addVertex(...)");
         if (!var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label676: {
         double var62;
         double var85;
         double var108;
         label442: {
            var10000 = var9++;
            var62 = var2.maxZ;
            var85 = var2.minY;
            var108 = var2.maxX;
            int var131 = var10000;
            boolean var154 = false;
            var10000 = var6;
            if (!var5) {
               if (var6 == 0) {
                  break label442;
               }

               var10000 = var4 & 1 << var131;
            }

            if (var10000 == 0 && !var5) {
               break label676;
            }
         }

         boolean var177 = false;
         VertexConsumer var251 = var0.addVertex(var1, (float)var108, (float)var85, (float)var62);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var251, "addVertex(...)");
         if (!var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label677: {
         double var63;
         double var86;
         double var109;
         label426: {
            var10000 = var9++;
            var63 = var2.maxZ;
            var86 = var2.maxY;
            var109 = var2.maxX;
            int var132 = var10000;
            boolean var155 = false;
            var10000 = var6;
            if (!var5) {
               if (var6 == 0) {
                  break label426;
               }

               var10000 = var4 & 1 << var132;
            }

            if (var10000 == 0 && !var5) {
               break label677;
            }
         }

         boolean var178 = false;
         VertexConsumer var252 = var0.addVertex(var1, (float)var109, (float)var86, (float)var63);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var252, "addVertex(...)");
         if (!var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label678: {
         double var64;
         double var87;
         double var110;
         label410: {
            var10000 = var9++;
            var64 = var2.maxZ;
            var87 = var2.minY;
            var110 = var2.minX;
            int var133 = var10000;
            boolean var156 = false;
            var10000 = var6;
            if (!var5) {
               if (var6 == 0) {
                  break label410;
               }

               var10000 = var4 & 1 << var133;
            }

            if (var10000 == 0 && !var5) {
               break label678;
            }
         }

         boolean var179 = false;
         VertexConsumer var253 = var0.addVertex(var1, (float)var110, (float)var87, (float)var64);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var253, "addVertex(...)");
         if (!var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label679: {
         double var65;
         double var88;
         double var111;
         label394: {
            var10000 = var9++;
            var65 = var2.maxZ;
            var88 = var2.maxY;
            var111 = var2.minX;
            int var134 = var10000;
            boolean var157 = false;
            var10000 = var6;
            if (!var5) {
               if (var6 == 0) {
                  break label394;
               }

               var10000 = var4 & 1 << var134;
            }

            if (var10000 == 0 && !var5) {
               break label679;
            }
         }

         boolean var180 = false;
         VertexConsumer var254 = var0.addVertex(var1, (float)var111, (float)var88, (float)var65);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var254, "addVertex(...)");
         if (!var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label680: {
         double var66;
         double var89;
         double var112;
         label378: {
            var10000 = var9++;
            var66 = var2.minZ;
            var89 = var2.maxY;
            var112 = var2.minX;
            int var135 = var10000;
            boolean var158 = false;
            var10000 = var6;
            if (!var5) {
               if (var6 == 0) {
                  break label378;
               }

               var10000 = var4 & 1 << var135;
            }

            if (var10000 == 0 && !var5) {
               break label680;
            }
         }

         boolean var181 = false;
         VertexConsumer var255 = var0.addVertex(var1, (float)var112, (float)var89, (float)var66);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var255, "addVertex(...)");
         if (!var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label681: {
         double var67;
         double var90;
         double var113;
         label362: {
            var10000 = var9++;
            var67 = var2.minZ;
            var90 = var2.maxY;
            var113 = var2.maxX;
            int var136 = var10000;
            boolean var159 = false;
            var10000 = var6;
            if (!var5) {
               if (var6 == 0) {
                  break label362;
               }

               var10000 = var4 & 1 << var136;
            }

            if (var10000 == 0 && !var5) {
               break label681;
            }
         }

         boolean var182 = false;
         VertexConsumer var256 = var0.addVertex(var1, (float)var113, (float)var90, (float)var67);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var256, "addVertex(...)");
         if (!var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label682: {
         double var68;
         double var91;
         double var114;
         label346: {
            var10000 = var9++;
            var68 = var2.minZ;
            var91 = var2.maxY;
            var114 = var2.maxX;
            int var137 = var10000;
            boolean var160 = false;
            var10000 = var6;
            if (!var5) {
               if (var6 == 0) {
                  break label346;
               }

               var10000 = var4 & 1 << var137;
            }

            if (var10000 == 0 && !var5) {
               break label682;
            }
         }

         boolean var183 = false;
         VertexConsumer var257 = var0.addVertex(var1, (float)var114, (float)var91, (float)var68);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var257, "addVertex(...)");
         if (!var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label683: {
         double var69;
         double var92;
         double var115;
         label330: {
            var10000 = var9++;
            var69 = var2.maxZ;
            var92 = var2.maxY;
            var115 = var2.maxX;
            int var138 = var10000;
            boolean var161 = false;
            var10000 = var6;
            if (!var5) {
               if (var6 == 0) {
                  break label330;
               }

               var10000 = var4 & 1 << var138;
            }

            if (var10000 == 0 && !var5) {
               break label683;
            }
         }

         boolean var184 = false;
         VertexConsumer var258 = var0.addVertex(var1, (float)var115, (float)var92, (float)var69);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var258, "addVertex(...)");
         if (!var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label684: {
         double var70;
         double var93;
         double var116;
         label314: {
            var10000 = var9++;
            var70 = var2.maxZ;
            var93 = var2.maxY;
            var116 = var2.maxX;
            int var139 = var10000;
            boolean var162 = false;
            var10000 = var6;
            if (!var5) {
               if (var6 == 0) {
                  break label314;
               }

               var10000 = var4 & 1 << var139;
            }

            if (var10000 == 0 && !var5) {
               break label684;
            }
         }

         boolean var185 = false;
         VertexConsumer var259 = var0.addVertex(var1, (float)var116, (float)var93, (float)var70);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var259, "addVertex(...)");
         if (!var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label685: {
         double var71;
         double var94;
         double var117;
         label298: {
            var10000 = var9++;
            var71 = var2.maxZ;
            var94 = var2.maxY;
            var117 = var2.minX;
            int var140 = var10000;
            boolean var163 = false;
            var10000 = var6;
            if (!var5) {
               if (var6 == 0) {
                  break label298;
               }

               var10000 = var4 & 1 << var140;
            }

            if (var10000 == 0 && !var5) {
               break label685;
            }
         }

         boolean var186 = false;
         VertexConsumer var260 = var0.addVertex(var1, (float)var117, (float)var94, (float)var71);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var260, "addVertex(...)");
         if (!var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label686: {
         double var72;
         double var95;
         double var118;
         label282: {
            var10000 = var9++;
            var72 = var2.maxZ;
            var95 = var2.maxY;
            var118 = var2.minX;
            int var141 = var10000;
            boolean var164 = false;
            var10000 = var6;
            if (!var5) {
               if (var6 == 0) {
                  break label282;
               }

               var10000 = var4 & 1 << var141;
            }

            if (var10000 == 0 && !var5) {
               break label686;
            }
         }

         boolean var187 = false;
         VertexConsumer var261 = var0.addVertex(var1, (float)var118, (float)var95, (float)var72);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var261, "addVertex(...)");
         if (!var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      double var73;
      double var96;
      double var119;
      label266: {
         var10000 = var9++;
         var73 = var2.minZ;
         var96 = var2.maxY;
         var119 = var2.minX;
         int var142 = var10000;
         boolean var165 = false;
         var10000 = var6;
         if (!var5) {
            if (var6 == 0) {
               break label266;
            }

            var10000 = var4 & 1 << var142;
         }

         if (var10000 == 0 && !var5) {
            return;
         }
      }

      boolean var188 = false;
      VertexConsumer var262 = var0.addVertex(var1, (float)var119, (float)var96, (float)var73);
      var10002 = 14762;
      var10003 = -31346;
      Intrinsics.checkNotNullExpressionValue(var262, "addVertex(...)");
      if (!var5 && var3 != null) {
         var0.setColor(var3.h());
      }
   }

   public static final void a(
      @NotNull VertexConsumer var0,
      @NotNull Pose var1,
      @NotNull AABB var2,
      @NotNull llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3,
      float var4
   ) {
      short var10001 = 14753;
      short var10002 = -6437;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 14759;
      var10002 = 12943;
      Intrinsics.checkNotNullParameter(var1, "pose");
      var10001 = 14763;
      var10002 = 30635;
      Intrinsics.checkNotNullParameter(var2, "box");
      byte var10000 = ((byte)((IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.b()) ? 1 : 0));
      var10002 = 14765;
      short var10003 = -12494;
      Intrinsics.checkNotNullParameter(var3, "color");
      boolean var5 = (var10000 != 0);
      double[] var7 = new double[]{var2.minX, var2.maxX};
      double[] var6 = var7;
      double[] var8 = new double[]{var2.minY, var2.maxY};
      var7 = var8;
      double[] var9 = new double[]{var2.minZ, var2.maxZ};
      var8 = var9;
      int var13 = 0;

      while (true) {
         if (var13 < 2) {
            var10000 = 0;
            if (!var5) {
               break;
            }

            int var10 = 0;

            label82: {
               while (var10 < 2) {
                  a(var0, var1, var3, var4, var6[0], var7[var13], var8[var10], var6[1], var7[var13], var8[var10], 1.0F, 0.0F, 0.0F);
                  var10++;
                  if (!var5) {
                     break label82;
                  }

                  if (!var5) {
                     break;
                  }
               }

               var13++;
            }

            if (var5) {
               continue;
            }
         }

         var10000 = 0;
         break;
      }

      int var14 = var10000;

      while (true) {
         if (var14 < 2) {
            var10000 = 0;
            if (!var5) {
               break;
            }

            int var16 = 0;

            label62: {
               while (var16 < 2) {
                  a(var0, var1, var3, var4, var6[var14], var7[0], var8[var16], var6[var14], var7[1], var8[var16], 0.0F, 1.0F, 0.0F);
                  var16++;
                  if (!var5) {
                     break label62;
                  }

                  if (!var5) {
                     break;
                  }
               }

               var14++;
            }

            if (var5) {
               continue;
            }
         }

         var10000 = 0;
         break;
      }

      int var15 = var10000;

      while (var15 < 2) {
         int var17 = 0;

         while (true) {
            if (var17 < 2) {
               a(var0, var1, var3, var4, var6[var15], var7[var17], var8[0], var6[var15], var7[var17], var8[1], 0.0F, 0.0F, 1.0F);
               var17++;
               if (!var5) {
                  break;
               }

               if (var5) {
                  continue;
               }
            }

            var15++;
            break;
         }

         if (!var5) {
            break;
         }
      }
   }

   public static final void b(
      @NotNull VertexConsumer var0,
      @NotNull Matrix4fc var1,
      @NotNull AABB var2,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3,
      int var4
   ) {
      short var10001 = 14766;
      short var10002 = 8767;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 14752;
      var10002 = 7237;
      Intrinsics.checkNotNullParameter(var1, "pose");
      int var10000 = ((IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.b()) ? 1 : 0);
      var10002 = 14764;
      short var10003 = 28177;
      Intrinsics.checkNotNullParameter(var2, "box");
      boolean var5 = (var10000 != 0);
      var10000 = var4 & 16777215;
      if (var5) {
         var10000 = var10000 != 16777215 ? 1 : 0;
      }

      int var6;
      int var9;
      label671: {
         double var10;
         double var12;
         double var14;
         label642: {
            var6 = var10000;
            boolean var8 = false;
            var9 = 0;
            var10000 = var9++;
            var10 = var2.minZ;
            var12 = var2.minY;
            var14 = var2.minX;
            int var16 = var10000;
            boolean var17 = false;
            var10000 = var6;
            if (var5) {
               if (var6 == 0) {
                  break label642;
               }

               var10000 = var4 & 1 << var16;
            }

            if (var10000 == 0 && var5) {
               break label671;
            }
         }

         boolean var26 = false;
         VertexConsumer var239 = var0.addVertex(var1, (float)var14, (float)var12, (float)var10);
         var10002 = 14776;
         var10003 = 13892;
         Intrinsics.checkNotNullExpressionValue(var239, "addVertex(...)");
         if (var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label672: {
         double var51;
         double var74;
         double var97;
         label626: {
            var10000 = var9++;
            var51 = var2.minZ;
            var74 = var2.minY;
            var97 = var2.maxX;
            int var120 = var10000;
            boolean var143 = false;
            var10000 = var6;
            if (var5) {
               if (var6 == 0) {
                  break label626;
               }

               var10000 = var4 & 1 << var120;
            }

            if (var10000 == 0 && var5) {
               break label672;
            }
         }

         boolean var166 = false;
         VertexConsumer var240 = var0.addVertex(var1, (float)var97, (float)var74, (float)var51);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var240, "addVertex(...)");
         if (var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label673: {
         double var52;
         double var75;
         double var98;
         label610: {
            var10000 = var9++;
            var52 = var2.maxZ;
            var75 = var2.minY;
            var98 = var2.maxX;
            int var121 = var10000;
            boolean var144 = false;
            var10000 = var6;
            if (var5) {
               if (var6 == 0) {
                  break label610;
               }

               var10000 = var4 & 1 << var121;
            }

            if (var10000 == 0 && var5) {
               break label673;
            }
         }

         boolean var167 = false;
         VertexConsumer var241 = var0.addVertex(var1, (float)var98, (float)var75, (float)var52);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var241, "addVertex(...)");
         if (var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label674: {
         double var53;
         double var76;
         double var99;
         label594: {
            var10000 = var9++;
            var53 = var2.maxZ;
            var76 = var2.minY;
            var99 = var2.minX;
            int var122 = var10000;
            boolean var145 = false;
            var10000 = var6;
            if (var5) {
               if (var6 == 0) {
                  break label594;
               }

               var10000 = var4 & 1 << var122;
            }

            if (var10000 == 0 && var5) {
               break label674;
            }
         }

         boolean var168 = false;
         VertexConsumer var242 = var0.addVertex(var1, (float)var99, (float)var76, (float)var53);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var242, "addVertex(...)");
         if (var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label675: {
         double var54;
         double var77;
         double var100;
         label578: {
            var10000 = var9++;
            var54 = var2.minZ;
            var77 = var2.maxY;
            var100 = var2.minX;
            int var123 = var10000;
            boolean var146 = false;
            var10000 = var6;
            if (var5) {
               if (var6 == 0) {
                  break label578;
               }

               var10000 = var4 & 1 << var123;
            }

            if (var10000 == 0 && var5) {
               break label675;
            }
         }

         boolean var169 = false;
         VertexConsumer var243 = var0.addVertex(var1, (float)var100, (float)var77, (float)var54);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var243, "addVertex(...)");
         if (var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label676: {
         double var55;
         double var78;
         double var101;
         label562: {
            var10000 = var9++;
            var55 = var2.maxZ;
            var78 = var2.maxY;
            var101 = var2.minX;
            int var124 = var10000;
            boolean var147 = false;
            var10000 = var6;
            if (var5) {
               if (var6 == 0) {
                  break label562;
               }

               var10000 = var4 & 1 << var124;
            }

            if (var10000 == 0 && var5) {
               break label676;
            }
         }

         boolean var170 = false;
         VertexConsumer var244 = var0.addVertex(var1, (float)var101, (float)var78, (float)var55);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var244, "addVertex(...)");
         if (var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label677: {
         double var56;
         double var79;
         double var102;
         label546: {
            var10000 = var9++;
            var56 = var2.maxZ;
            var79 = var2.maxY;
            var102 = var2.maxX;
            int var125 = var10000;
            boolean var148 = false;
            var10000 = var6;
            if (var5) {
               if (var6 == 0) {
                  break label546;
               }

               var10000 = var4 & 1 << var125;
            }

            if (var10000 == 0 && var5) {
               break label677;
            }
         }

         boolean var171 = false;
         VertexConsumer var245 = var0.addVertex(var1, (float)var102, (float)var79, (float)var56);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var245, "addVertex(...)");
         if (var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label678: {
         double var57;
         double var80;
         double var103;
         label530: {
            var10000 = var9++;
            var57 = var2.minZ;
            var80 = var2.maxY;
            var103 = var2.maxX;
            int var126 = var10000;
            boolean var149 = false;
            var10000 = var6;
            if (var5) {
               if (var6 == 0) {
                  break label530;
               }

               var10000 = var4 & 1 << var126;
            }

            if (var10000 == 0 && var5) {
               break label678;
            }
         }

         boolean var172 = false;
         VertexConsumer var246 = var0.addVertex(var1, (float)var103, (float)var80, (float)var57);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var246, "addVertex(...)");
         if (var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label679: {
         double var58;
         double var81;
         double var104;
         label514: {
            var10000 = var9++;
            var58 = var2.minZ;
            var81 = var2.minY;
            var104 = var2.minX;
            int var127 = var10000;
            boolean var150 = false;
            var10000 = var6;
            if (var5) {
               if (var6 == 0) {
                  break label514;
               }

               var10000 = var4 & 1 << var127;
            }

            if (var10000 == 0 && var5) {
               break label679;
            }
         }

         boolean var173 = false;
         VertexConsumer var247 = var0.addVertex(var1, (float)var104, (float)var81, (float)var58);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var247, "addVertex(...)");
         if (var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label680: {
         double var59;
         double var82;
         double var105;
         label498: {
            var10000 = var9++;
            var59 = var2.minZ;
            var82 = var2.maxY;
            var105 = var2.minX;
            int var128 = var10000;
            boolean var151 = false;
            var10000 = var6;
            if (var5) {
               if (var6 == 0) {
                  break label498;
               }

               var10000 = var4 & 1 << var128;
            }

            if (var10000 == 0 && var5) {
               break label680;
            }
         }

         boolean var174 = false;
         VertexConsumer var248 = var0.addVertex(var1, (float)var105, (float)var82, (float)var59);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var248, "addVertex(...)");
         if (var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label681: {
         double var60;
         double var83;
         double var106;
         label482: {
            var10000 = var9++;
            var60 = var2.minZ;
            var83 = var2.maxY;
            var106 = var2.maxX;
            int var129 = var10000;
            boolean var152 = false;
            var10000 = var6;
            if (var5) {
               if (var6 == 0) {
                  break label482;
               }

               var10000 = var4 & 1 << var129;
            }

            if (var10000 == 0 && var5) {
               break label681;
            }
         }

         boolean var175 = false;
         VertexConsumer var249 = var0.addVertex(var1, (float)var106, (float)var83, (float)var60);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var249, "addVertex(...)");
         if (var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label682: {
         double var61;
         double var84;
         double var107;
         label466: {
            var10000 = var9++;
            var61 = var2.minZ;
            var84 = var2.minY;
            var107 = var2.maxX;
            int var130 = var10000;
            boolean var153 = false;
            var10000 = var6;
            if (var5) {
               if (var6 == 0) {
                  break label466;
               }

               var10000 = var4 & 1 << var130;
            }

            if (var10000 == 0 && var5) {
               break label682;
            }
         }

         boolean var176 = false;
         VertexConsumer var250 = var0.addVertex(var1, (float)var107, (float)var84, (float)var61);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var250, "addVertex(...)");
         if (var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label683: {
         double var62;
         double var85;
         double var108;
         label450: {
            var10000 = var9++;
            var62 = var2.minZ;
            var85 = var2.minY;
            var108 = var2.maxX;
            int var131 = var10000;
            boolean var154 = false;
            var10000 = var6;
            if (var5) {
               if (var6 == 0) {
                  break label450;
               }

               var10000 = var4 & 1 << var131;
            }

            if (var10000 == 0 && var5) {
               break label683;
            }
         }

         boolean var177 = false;
         VertexConsumer var251 = var0.addVertex(var1, (float)var108, (float)var85, (float)var62);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var251, "addVertex(...)");
         if (var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label684: {
         double var63;
         double var86;
         double var109;
         label434: {
            var10000 = var9++;
            var63 = var2.minZ;
            var86 = var2.maxY;
            var109 = var2.maxX;
            int var132 = var10000;
            boolean var155 = false;
            var10000 = var6;
            if (var5) {
               if (var6 == 0) {
                  break label434;
               }

               var10000 = var4 & 1 << var132;
            }

            if (var10000 == 0 && var5) {
               break label684;
            }
         }

         boolean var178 = false;
         VertexConsumer var252 = var0.addVertex(var1, (float)var109, (float)var86, (float)var63);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var252, "addVertex(...)");
         if (var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label685: {
         double var64;
         double var87;
         double var110;
         label418: {
            var10000 = var9++;
            var64 = var2.maxZ;
            var87 = var2.maxY;
            var110 = var2.maxX;
            int var133 = var10000;
            boolean var156 = false;
            var10000 = var6;
            if (var5) {
               if (var6 == 0) {
                  break label418;
               }

               var10000 = var4 & 1 << var133;
            }

            if (var10000 == 0 && var5) {
               break label685;
            }
         }

         boolean var179 = false;
         VertexConsumer var253 = var0.addVertex(var1, (float)var110, (float)var87, (float)var64);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var253, "addVertex(...)");
         if (var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label686: {
         double var65;
         double var88;
         double var111;
         label402: {
            var10000 = var9++;
            var65 = var2.maxZ;
            var88 = var2.minY;
            var111 = var2.maxX;
            int var134 = var10000;
            boolean var157 = false;
            var10000 = var6;
            if (var5) {
               if (var6 == 0) {
                  break label402;
               }

               var10000 = var4 & 1 << var134;
            }

            if (var10000 == 0 && var5) {
               break label686;
            }
         }

         boolean var180 = false;
         VertexConsumer var254 = var0.addVertex(var1, (float)var111, (float)var88, (float)var65);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var254, "addVertex(...)");
         if (var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label687: {
         double var66;
         double var89;
         double var112;
         label386: {
            var10000 = var9++;
            var66 = var2.maxZ;
            var89 = var2.minY;
            var112 = var2.minX;
            int var135 = var10000;
            boolean var158 = false;
            var10000 = var6;
            if (var5) {
               if (var6 == 0) {
                  break label386;
               }

               var10000 = var4 & 1 << var135;
            }

            if (var10000 == 0 && var5) {
               break label687;
            }
         }

         boolean var181 = false;
         VertexConsumer var255 = var0.addVertex(var1, (float)var112, (float)var89, (float)var66);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var255, "addVertex(...)");
         if (var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label688: {
         double var67;
         double var90;
         double var113;
         label370: {
            var10000 = var9++;
            var67 = var2.maxZ;
            var90 = var2.minY;
            var113 = var2.maxX;
            int var136 = var10000;
            boolean var159 = false;
            var10000 = var6;
            if (var5) {
               if (var6 == 0) {
                  break label370;
               }

               var10000 = var4 & 1 << var136;
            }

            if (var10000 == 0 && var5) {
               break label688;
            }
         }

         boolean var182 = false;
         VertexConsumer var256 = var0.addVertex(var1, (float)var113, (float)var90, (float)var67);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var256, "addVertex(...)");
         if (var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label689: {
         double var68;
         double var91;
         double var114;
         label354: {
            var10000 = var9++;
            var68 = var2.maxZ;
            var91 = var2.maxY;
            var114 = var2.maxX;
            int var137 = var10000;
            boolean var160 = false;
            var10000 = var6;
            if (var5) {
               if (var6 == 0) {
                  break label354;
               }

               var10000 = var4 & 1 << var137;
            }

            if (var10000 == 0 && var5) {
               break label689;
            }
         }

         boolean var183 = false;
         VertexConsumer var257 = var0.addVertex(var1, (float)var114, (float)var91, (float)var68);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var257, "addVertex(...)");
         if (var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label690: {
         double var69;
         double var92;
         double var115;
         label338: {
            var10000 = var9++;
            var69 = var2.maxZ;
            var92 = var2.maxY;
            var115 = var2.minX;
            int var138 = var10000;
            boolean var161 = false;
            var10000 = var6;
            if (var5) {
               if (var6 == 0) {
                  break label338;
               }

               var10000 = var4 & 1 << var138;
            }

            if (var10000 == 0 && var5) {
               break label690;
            }
         }

         boolean var184 = false;
         VertexConsumer var258 = var0.addVertex(var1, (float)var115, (float)var92, (float)var69);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var258, "addVertex(...)");
         if (var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label691: {
         double var70;
         double var93;
         double var116;
         label322: {
            var10000 = var9++;
            var70 = var2.minZ;
            var93 = var2.minY;
            var116 = var2.minX;
            int var139 = var10000;
            boolean var162 = false;
            var10000 = var6;
            if (var5) {
               if (var6 == 0) {
                  break label322;
               }

               var10000 = var4 & 1 << var139;
            }

            if (var10000 == 0 && var5) {
               break label691;
            }
         }

         boolean var185 = false;
         VertexConsumer var259 = var0.addVertex(var1, (float)var116, (float)var93, (float)var70);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var259, "addVertex(...)");
         if (var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label692: {
         double var71;
         double var94;
         double var117;
         label306: {
            var10000 = var9++;
            var71 = var2.maxZ;
            var94 = var2.minY;
            var117 = var2.minX;
            int var140 = var10000;
            boolean var163 = false;
            var10000 = var6;
            if (var5) {
               if (var6 == 0) {
                  break label306;
               }

               var10000 = var4 & 1 << var140;
            }

            if (var10000 == 0 && var5) {
               break label692;
            }
         }

         boolean var186 = false;
         VertexConsumer var260 = var0.addVertex(var1, (float)var117, (float)var94, (float)var71);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var260, "addVertex(...)");
         if (var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label693: {
         double var72;
         double var95;
         double var118;
         label290: {
            var10000 = var9++;
            var72 = var2.maxZ;
            var95 = var2.maxY;
            var118 = var2.minX;
            int var141 = var10000;
            boolean var164 = false;
            var10000 = var6;
            if (var5) {
               if (var6 == 0) {
                  break label290;
               }

               var10000 = var4 & 1 << var141;
            }

            if (var10000 == 0 && var5) {
               break label693;
            }
         }

         boolean var187 = false;
         VertexConsumer var261 = var0.addVertex(var1, (float)var118, (float)var95, (float)var72);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var261, "addVertex(...)");
         if (var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      label694: {
         double var73;
         double var96;
         double var119;
         label274: {
            var10000 = var9++;
            var73 = var2.minZ;
            var96 = var2.maxY;
            var119 = var2.minX;
            int var142 = var10000;
            boolean var165 = false;
            var10000 = var6;
            if (var5) {
               if (var6 == 0) {
                  break label274;
               }

               var10000 = var4 & 1 << var142;
            }

            if (var10000 == 0 && var5) {
               break label694;
            }
         }

         boolean var188 = false;
         VertexConsumer var262 = var0.addVertex(var1, (float)var119, (float)var96, (float)var73);
         var10002 = 14762;
         var10003 = -31346;
         Intrinsics.checkNotNullExpressionValue(var262, "addVertex(...)");
         if (var5 && var3 != null) {
            var0.setColor(var3.h());
         }
      }

      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.b(
            !var5
         );
      }
   }

   private static final void a(
      VertexConsumer var0,
      Pose var1,
      llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2,
      float var3,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      double var14,
      float var16,
      float var17,
      float var18
   ) {
      var0.addVertex((Matrix4fc)var1.pose(), (float)var4, (float)var6, (float)var8).setColor(var2.h()).setNormal(var1, var16, var17, var18).setLineWidth(var3);
      var0.addVertex((Matrix4fc)var1.pose(), (float)var10, (float)var12, (float)var14)
         .setColor(var2.h())
         .setNormal(var1, var16, var17, var18)
         .setLineWidth(var3);
   }

   public static void a(
      @NotNull VertexConsumer var0,
      @NotNull Matrix4fc var1,
      @NotNull AABB var2,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3,
      int var4,
      int var5,
      @Nullable Object var6
   ) {
      boolean var7 = IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.c();
      if ((var5 & 4) != 0) {
         if (var7) {
            var2 = null;
         }

         if ((var5 & 8) != 0) {
            if (!var7) {
               var4 = -1;
            }
         }
      }

      a(var0, var1, var2, var3, var4);
   }

   public static void b(
      @NotNull VertexConsumer var0,
      @NotNull Matrix4fc var1,
      @NotNull AABB var2,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3,
      int var4,
      int var5,
      @Nullable Object var6
   ) {
      boolean var7 = IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.b();
      if ((var5 & 4) != 0) {
         if (!var7) {
            var2 = null;
         }

         if ((var5 & 8) != 0) {
            if (!var7) {
               var4 = -1;
            }
         }
      }

      b(var0, var1, var2, var3, var4);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[17];
      int var3 = 0;
      String var2 = "V\u0093\t´\u0088Õ\u0004\u009bÉËv\u0080\b\u000e\u0085ös\u0015ÇSï\u0085²\u007fÕÐ{ \u000e\u008e£R\u0086û::¬&ÞÑäû¦\u00033U\u009a\u0003ç¨\u0000\u0005'·-W\n\u0006\u0014~û\u0010U|\u0005\u0094t[/Ä\u0004¹ò\u0090õ\u0006ºÀ.Çï\u0086\t$x#¤mwV\u0099ë\t\u0003\u0092ÇùñÜÅì\u0099\u0003\u0098\u0018´\u0003\u0083\u0017×\u0006õ_ÅHÙ¡";
      int var4 = "V\u0093\t´\u0088Õ\u0004\u009bÉËv\u0080\b\u000e\u0085ös\u0015ÇSï\u0085²\u007fÕÐ{ \u000e\u008e£R\u0086û::¬&ÞÑäû¦\u00033U\u009a\u0003ç¨\u0000\u0005'·-W\n\u0006\u0014~û\u0010U|\u0005\u0094t[/Ä\u0004¹ò\u0090õ\u0006ºÀ.Çï\u0086\t$x#¤mwV\u0099ë\t\u0003\u0092ÇùñÜÅì\u0099\u0003\u0098\u0018´\u0003\u0083\u0017×\u0006õ_ÅHÙ¡"
         .length();
      char var1 = '\r';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 29;
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
                     case 0 -> 10;
                     case 1 -> 53;
                     case 2 -> 85;
                     case 3 -> 84;
                     case 4 -> 40;
                     case 5 -> 48;
                     default -> 67;
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
                     b = new String[17];
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

                  var2 = "Q\u0092Ï»\u000e7{'ß\u0017SåÃ\u009fq¤S\u0017\u0012";
                  var4 = "Q\u0092Ï»\u000e7{'ß\u0017SåÃ\u009fq¤S\u0017\u0012".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 31;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 14760) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 13;
            case 1 -> 10;
            case 2 -> 207;
            case 3 -> 0;
            case 4 -> 215;
            case 5 -> 149;
            case 6 -> 106;
            case 7 -> 233;
            case 8 -> 227;
            case 9 -> 49;
            case 10 -> 110;
            case 11 -> 160;
            case 12 -> 248;
            case 13 -> 250;
            case 14 -> 205;
            case 15 -> 19;
            case 16 -> 84;
            case 17 -> 45;
            case 18 -> 8;
            case 19 -> 180;
            case 20 -> 186;
            case 21 -> 15;
            case 22 -> 78;
            case 23 -> 193;
            case 24 -> 85;
            case 25 -> 164;
            case 26 -> 63;
            case 27 -> 24;
            case 28 -> 238;
            case 29 -> 86;
            case 30 -> 33;
            case 31 -> 169;
            case 32 -> 50;
            case 33 -> 182;
            case 34 -> 1;
            case 35 -> 55;
            case 36 -> 101;
            case 37 -> 173;
            case 38 -> 95;
            case 39 -> 240;
            case 40 -> 168;
            case 41 -> 190;
            case 42 -> 122;
            case 43 -> 162;
            case 44 -> 249;
            case 45 -> 31;
            case 46 -> 253;
            case 47 -> 23;
            case 48 -> 223;
            case 49 -> 26;
            case 50 -> 154;
            case 51 -> 7;
            case 52 -> 104;
            case 53 -> 123;
            case 54 -> 118;
            case 55 -> 46;
            case 56 -> 37;
            case 57 -> 66;
            case 58 -> 241;
            case 59 -> 12;
            case 60 -> 211;
            case 61 -> 141;
            case 62 -> 30;
            case 63 -> 77;
            case 64 -> 119;
            case 65 -> 172;
            case 66 -> 218;
            case 67 -> 34;
            case 68 -> 91;
            case 69 -> 4;
            case 70 -> 82;
            case 71 -> 221;
            case 72 -> 18;
            case 73 -> 236;
            case 74 -> 113;
            case 75 -> 72;
            case 76 -> 161;
            case 77 -> 56;
            case 78 -> 59;
            case 79 -> 156;
            case 80 -> 229;
            case 81 -> 88;
            case 82 -> 230;
            case 83 -> 137;
            case 84 -> 94;
            case 85 -> 69;
            case 86 -> 159;
            case 87 -> 107;
            case 88 -> 121;
            case 89 -> 58;
            case 90 -> 146;
            case 91 -> 64;
            case 92 -> 212;
            case 93 -> 40;
            case 94 -> 243;
            case 95 -> 246;
            case 96 -> 217;
            case 97 -> 138;
            case 98 -> 76;
            case 99 -> 143;
            case 100 -> 92;
            case 101 -> 5;
            case 102 -> 198;
            case 103 -> 112;
            case 104 -> 6;
            case 105 -> 210;
            case 106 -> 65;
            case 107 -> 129;
            case 108 -> 70;
            case 109 -> 132;
            case 110 -> 42;
            case 111 -> 214;
            case 112 -> 170;
            case 113 -> 47;
            case 114 -> 126;
            case 115 -> 158;
            case 116 -> 148;
            case 117 -> 20;
            case 118 -> 116;
            case 119 -> 220;
            case 120 -> 44;
            case 121 -> 133;
            case 122 -> 181;
            case 123 -> 3;
            case 124 -> 187;
            case 125 -> 192;
            case 126 -> 125;
            case 127 -> 188;
            case 128 -> 114;
            case 129 -> 201;
            case 130 -> 11;
            case 131 -> 111;
            case 132 -> 174;
            case 133 -> 131;
            case 134 -> 100;
            case 135 -> 235;
            case 136 -> 80;
            case 137 -> 93;
            case 138 -> 136;
            case 139 -> 157;
            case 140 -> 219;
            case 141 -> 52;
            case 142 -> 54;
            case 143 -> 48;
            case 144 -> 87;
            case 145 -> 247;
            case 146 -> 153;
            case 147 -> 191;
            case 148 -> 179;
            case 149 -> 29;
            case 150 -> 194;
            case 151 -> 196;
            case 152 -> 99;
            case 153 -> 150;
            case 154 -> 176;
            case 155 -> 231;
            case 156 -> 2;
            case 157 -> 67;
            case 158 -> 115;
            case 159 -> 38;
            case 160 -> 203;
            case 161 -> 108;
            case 162 -> 255;
            case 163 -> 222;
            case 164 -> 252;
            case 165 -> 73;
            case 166 -> 81;
            case 167 -> 208;
            case 168 -> 197;
            case 169 -> 195;
            case 170 -> 166;
            case 171 -> 171;
            case 172 -> 139;
            case 173 -> 74;
            case 174 -> 103;
            case 175 -> 242;
            case 176 -> 97;
            case 177 -> 165;
            case 178 -> 51;
            case 179 -> 234;
            case 180 -> 142;
            case 181 -> 167;
            case 182 -> 109;
            case 183 -> 200;
            case 184 -> 17;
            case 185 -> 79;
            case 186 -> 14;
            case 187 -> 224;
            case 188 -> 228;
            case 189 -> 128;
            case 190 -> 43;
            case 191 -> 177;
            case 192 -> 25;
            case 193 -> 245;
            case 194 -> 147;
            case 195 -> 35;
            case 196 -> 145;
            case 197 -> 135;
            case 198 -> 98;
            case 199 -> 61;
            case 200 -> 102;
            case 201 -> 232;
            case 202 -> 202;
            case 203 -> 117;
            case 204 -> 16;
            case 205 -> 96;
            case 206 -> 163;
            case 207 -> 189;
            case 208 -> 251;
            case 209 -> 57;
            case 210 -> 185;
            case 211 -> 39;
            case 212 -> 53;
            case 213 -> 175;
            case 214 -> 9;
            case 215 -> 36;
            case 216 -> 124;
            case 217 -> 28;
            case 218 -> 254;
            case 219 -> 105;
            case 220 -> 41;
            case 221 -> 244;
            case 222 -> 209;
            case 223 -> 199;
            case 224 -> 151;
            case 225 -> 120;
            case 226 -> 206;
            case 227 -> 75;
            case 228 -> 22;
            case 229 -> 216;
            case 230 -> 83;
            case 231 -> 71;
            case 232 -> 225;
            case 233 -> 213;
            case 234 -> 183;
            case 235 -> 134;
            case 236 -> 155;
            case 237 -> 90;
            case 238 -> 226;
            case 239 -> 144;
            case 240 -> 127;
            case 241 -> 32;
            case 242 -> 27;
            case 243 -> 239;
            case 244 -> 237;
            case 245 -> 152;
            case 246 -> 130;
            case 247 -> 178;
            case 248 -> 184;
            case 249 -> 89;
            case 250 -> 60;
            case 251 -> 62;
            case 252 -> 68;
            case 253 -> 21;
            case 254 -> 204;
            default -> 140;
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
