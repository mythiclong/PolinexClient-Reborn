package me.octo.client;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.FloatRef;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;

public final class IllllIllIllllIlllllIlIlIlllIIIIIllllllIIlllIlIIIlIlIIlIIIlIlllIIIllllllIIlIlllIIIlIIl {
   
   @NotNull
   public static IllllIllIllllIlllllIlIlIlllIIIIIllllllIIlllIlIIIlIlIIlIIIlIlllIIIllllllIIlIlllIIIlIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Matrix4f lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static Vector3f IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static Vector3f lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static String[] a;
   private static String[] b;

   private IllllIllIllllIlllllIlIlIlllIIIIIllllllIIlllIlIIIlIlIIlIIIlIlllIIIllllllIIlIlllIIIlIIl() {
   }

   @JvmStatic
   @JvmOverloads
   @Nullable
   public static final Vector3f a(@NotNull Vec3 var0, @NotNull Vec3 var1) {
      String[] var10000 = lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.b();
      short var10002 = 10236;
      short var10003 = -1128;
      Intrinsics.checkNotNullParameter(var0, "pos");
      String[] var2 = var10000;
      short var10001 = 10224;
      var10002 = -28059;
      Intrinsics.checkNotNullParameter(var1, "cameraPos");
      Vector3f var3 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.set(
            (float)(var0.x - var1.x), (float)(var0.y - var1.y), (float)(var0.z - var1.z)
         )
         .mulProject((Matrix4fc)lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      float var9;
      int var4 = (var9 = Math.abs(var3.x) - (Float.MAX_VALUE)) == 0.0F ? 0 : (var9 < 0.0F ? -1 : 1);
      if (var2 == null) {
         var4 = var4 <= 0 ? 1 : 0;
      }

      if (var4 != 0) {
         float var10;
         int var5 = (var10 = Math.abs(var3.y) - (Float.MAX_VALUE)) == 0.0F ? 0 : (var10 < 0.0F ? -1 : 1);
         if (var2 == null) {
            var5 = var5 <= 0 ? 1 : 0;
         }

         if (var5 != 0) {
            float var11;
            int var6 = (var11 = Math.abs(var3.z) - (Float.MAX_VALUE)) == 0.0F ? 0 : (var11 < 0.0F ? -1 : 1);
            if (var2 == null) {
               var6 = var6 <= 0 ? 1 : 0;
            }

            if (var6 != 0) {
               if (var2 != null) {
                  return var3;
               }

               if (var3.z < 1.0F) {
                  return new Vector3f((Vector3fc)var3);
               }
            }
         }
      }

      return null;
   }

   public static Pair<Vector3f, Vector3f> a(@NotNull Vec3 var0, @NotNull Vec3 var1, Vec3 var2, int var3, Object var4) {
      if ((var3 & 4) != 0) {
         var2 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .gameRenderer
            .getMainCamera()
            .position();
      }

      return a(var0, var1, var2);
   }

   public static Vector3f a(@NotNull Vec3 var0, Vec3 var1, int var2, Object var3) {
      if ((var2 & 2) != 0) {
         var1 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .gameRenderer
            .getMainCamera()
            .position();
      }

      return a(var0, var1);
   }

   public static lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII b(@NotNull Vec3 var0, Vec3 var1, int var2, Object var3) {
      if ((var2 & 2) != 0) {
         var1 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .gameRenderer
            .getMainCamera()
            .position();
      }

      return b(var0, var1);
   }

   @JvmStatic
   @JvmOverloads
   @Nullable
   public static final Pair<Vector3f, Vector3f> a(@NotNull Vec3 var0, @NotNull Vec3 var1, @NotNull Vec3 var2) { Vector3f var10 = null; // PX-FIX hoist
      Pair<Vector3f, Vector3f> var20 = null; // PX-FIX hoist
        
      short var10001 = 10229;
      short var10002 = 7010;
      Intrinsics.checkNotNullParameter(var0, "from");
      var10001 = 10238;
      var10002 = 20733;
      Intrinsics.checkNotNullParameter(var1, "to");
      String[] var10000 = lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.b();
      var10002 = 10228;
      short var10003 = -11441;
      Intrinsics.checkNotNullParameter(var2, "cameraPos");
      Vector4f var4 = new Vector4f((float)(var0.x - var2.x), (float)(var0.y - var2.y), (float)(var0.z - var2.z), 1.0F)
         .mul((Matrix4fc)lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      String[] var3 = var10000;
      Vector4f var5 = new Vector4f((float)(var1.x - var2.x), (float)(var1.y - var2.y), (float)(var1.z - var2.z), 1.0F)
         .mul((Matrix4fc)lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      if (var3 == null) {
         IllllIllIllllIlllllIlIlIlllIIIIIllllllIIlllIlIIIlIlIIlIIIlIlllIIIllllllIIlIlllIIIlIIl var11 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         Intrinsics.checkNotNull(var4);
         Intrinsics.checkNotNull(var5);
         Pair var12 = var11.a(var4, var5);
         if (var12 != null) {
            Pair var6 = var12;
            Vector4f var7 = (Vector4f)var6.getFirst();
            Vector4f var8 = (Vector4f)var6.getSecond();
            float var24;
            int var13 = (var24 = Math.abs(var7.w) - 1.0E-6F) == 0.0F ? 0 : (var24 < 0.0F ? -1 : 1);
            if (var3 == null) {
               if (var13 < 0) {
                  return null;
               }

               float var25;
               var13 = (var25 = Math.abs(var8.w) - 1.0E-6F) == 0.0F ? 0 : (var25 < 0.0F ? -1 : 1);
            }

            if (var13 >= 0) {
               Vector3f var9 = new Vector3f(var7.x / var7.w, var7.y / var7.w, var7.z / var7.w);
                var10 = new Vector3f(var8.x / var8.w, var8.y / var8.w, var8.z / var8.w);
               float var26;
               int var14 = (var26 = Math.abs(var9.x) - (Float.MAX_VALUE)) == 0.0F ? 0 : (var26 < 0.0F ? -1 : 1);
               if (var3 == null) {
                  var14 = var14 <= 0 ? 1 : 0;
               }

               label80: {
                  if (var14 != 0) {
                     float var27;
                     int var15 = (var27 = Math.abs(var9.y) - (Float.MAX_VALUE)) == 0.0F ? 0 : (var27 < 0.0F ? -1 : 1);
                     if (var3 == null) {
                        var15 = var15 <= 0 ? 1 : 0;
                     }

                     if (var15 != 0) {
                        float var28;
                        int var16 = (var28 = Math.abs(var9.z) - (Float.MAX_VALUE)) == 0.0F ? 0 : (var28 < 0.0F ? -1 : 1);
                        if (var3 == null) {
                           var16 = var16 <= 0 ? 1 : 0;
                        }

                        if (var16 != 0) {
                           float var29;
                           int var17 = (var29 = Math.abs(var10.x) - (Float.MAX_VALUE)) == 0.0F ? 0 : (var29 < 0.0F ? -1 : 1);
                           if (var3 == null) {
                              var17 = var17 <= 0 ? 1 : 0;
                           }

                           if (var17 != 0) {
                              float var30;
                              int var18 = (var30 = Math.abs(var10.y) - (Float.MAX_VALUE)) == 0.0F ? 0 : (var30 < 0.0F ? -1 : 1);
                              if (var3 == null) {
                                 var18 = var18 <= 0 ? 1 : 0;
                              }

                              if (var18 != 0) {
                                 float var31;
                                 int var19 = (var31 = Math.abs(var10.z) - (Float.MAX_VALUE)) == 0.0F ? 0 : (var31 < 0.0F ? -1 : 1);
                                 if (var3 == null) {
                                    var19 = var19 <= 0 ? 1 : 0;
                                 }

                                 if (var19 != 0) {
                                    var20 = TuplesKt.to(var9, var10);
                                    break label80;
                                 }
                              }
                           }
                        }
                     }
                  }

                  var20 = null;
               }

               if (var3 != null) {
                  me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
                     new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[2]
                  );
               }

               return ((Pair<Vector3f,Vector3f>)(Object)(var20));
            }

            return null;
         }
      }

      return null;
   }

   @JvmStatic
   public static final void a(@NotNull Matrix4fc var0, @NotNull Matrix4fc var1) {
      short var10001 = 10237;
      short var10002 = -23345;
      Intrinsics.checkNotNullParameter(var0, "projectionMatrix");
      var10001 = 10231;
      var10002 = 7959;
      Intrinsics.checkNotNullParameter(var1, "modelViewMatrix");
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.set(var0).mul(var1);
   }

   private final Pair<Vector4f, Vector4f> a(Vector4f var1, Vector4f var2) {
      FloatRef var4 = new FloatRef();
      FloatRef var5 = new FloatRef();
      var5.element = 1.0F;
      String[] var10000 = lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.b();
      float var6 = 1.0E-5F;
      String[] var3 = var10000;
      boolean var7 = a(var6, var4, var5, var1.x + var1.w, var2.x + var2.w);
      if (var3 == null) {
         if (!var7) {
            return null;
         }

         var7 = a(var6, var4, var5, -var1.x + var1.w, -var2.x + var2.w);
      }

      if (var3 == null) {
         if (!var7) {
            return null;
         }

         var7 = a(var6, var4, var5, var1.y + var1.w, var2.y + var2.w);
      }

      if (var3 == null) {
         if (!var7) {
            return null;
         }

         var7 = a(var6, var4, var5, -var1.y + var1.w, -var2.y + var2.w);
      }

      if (var3 == null) {
         if (!var7) {
            return null;
         }

         var7 = a(var6, var4, var5, var1.z + var1.w, var2.z + var2.w);
      }

      if (var3 == null) {
         if (!var7) {
            return null;
         }

         var7 = a(var6, var4, var5, -var1.z + var1.w, -var2.z + var2.w);
      }

      return !var7 ? null : TuplesKt.to(this.a(var1, var2, var4.element), this.a(var1, var2, var5.element));
   }

   private final Vector4f a(Vector4f var1, Vector4f var2, float var3) {
      return new Vector4f(
         var1.x + (var2.x - var1.x) * var3, var1.y + (var2.y - var1.y) * var3, var1.z + (var2.z - var1.z) * var3, var1.w + (var2.w - var1.w) * var3
      );
   }

   @JvmStatic
   @JvmOverloads
   @Nullable
   public static final lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII b(@NotNull Vec3 var0, @NotNull Vec3 var1) {
       lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII var10 = null; // PX-FIX decl var10
      short var10001 = 10230;
      short var10002 = -7030;
      Intrinsics.checkNotNullParameter(var0, "pos");
      var10001 = 10228;
      var10002 = -11441;
      Intrinsics.checkNotNullParameter(var1, "cameraPos");
      Vector3f var3 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.set(
            (float)(var0.x - var1.x), (float)(var0.y - var1.y), (float)(var0.z - var1.z)
         )
         .mulProject((Matrix4fc)lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      String[] var10000 = lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.b();
      int var4 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .getWindow()
         .getGuiScale();
      float var5 = 0.5F / var4;
      String[] var2 = var10000;
      Vector3f var6 = var3.mul(1.0F, -1.0F, 1.0F)
         .add(1.0F, 1.0F, 0.0F)
         .mul(
            var5
               * me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .getMainRenderTarget()
                  .width,
            var5
               * me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .getMainRenderTarget()
                  .height,
            1.0F
         );
      float var13;
      int var7 = (var13 = Math.abs(var6.x) - (Float.MAX_VALUE)) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
      if (var2 == null) {
         var7 = var7 <= 0 ? 1 : 0;
      }

      label43: {
         if (var7 != 0) {
            float var14;
            int var8 = (var14 = Math.abs(var6.y) - (Float.MAX_VALUE)) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
            if (var2 == null) {
               var8 = var8 <= 0 ? 1 : 0;
            }

            if (var8 != 0) {
               float var15;
               int var9 = (var15 = Math.abs(var6.z) - (Float.MAX_VALUE)) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
               if (var2 == null) {
                  var9 = var9 <= 0 ? 1 : 0;
               }

               if (var9 != 0 && var6.z < 1.0F) {
                  var10 = new lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII(
                     (double)var6.x, (double)var6.y, (double)var6.z
                  );
                  break label43;
               }
            }
         }

         var10 = null;
      }

      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.b(new String[5]);
      }

      return var10;
   }

   @JvmStatic
   @JvmOverloads
   @Nullable
   public static final Vector3f a(@NotNull Vec3 var0) {
      short var10001 = 10230;
      short var10002 = -7030;
      Intrinsics.checkNotNullParameter(var0, "pos");
      return a(var0, null);
   }

   @JvmStatic
   @JvmOverloads
   @Nullable
   public static final Pair<Vector3f, Vector3f> c(@NotNull Vec3 var0, @NotNull Vec3 var1) {
      short var10001 = 10239;
      short var10002 = -28441;
      Intrinsics.checkNotNullParameter(var0, "from");
      var10001 = 10225;
      var10002 = -14357;
      Intrinsics.checkNotNullParameter(var1, "to");
      return a(var0, var1, null, 4, null);
   }

   @JvmStatic
   @JvmOverloads
   @Nullable
   public static final lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII b(@NotNull Vec3 var0) {
      short var10001 = 10230;
      short var10002 = -7030;
      Intrinsics.checkNotNullParameter(var0, "pos");
      return b(var0, null);
   }

   private static final boolean a(float var0, FloatRef var1, FloatRef var2, float var3, float var4) { int var10 = 0; // PX-FIX hoist
        
      Object var10000 = null; // PX-FIX
      String[] var5;
      float var8;
      float var10001;
      label66: {
         var5 = lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.b();
         float var12;
         var10000 = (var12 = var3 - -var0) == 0.0F ? 0 : (var12 < 0.0F ? -1 : 1);
         label62:
         if (var5 == null) {
            if ((me.octo.client.PxTruth.truth(var10000))) {
               float var13;
               var10000 = (var13 = var4 - -var0) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
               if (var5 != null) {
                  break label62;
               }

               if ((me.octo.client.PxTruth.truth(var10000))) {
                  return true;
               }
            }

            var8 = var3;
            var10001 = -var0;
            if (var5 != null) {
               break label66;
            }

            float var14;
            var10000 = (var14 = var3 - var10001) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
         }

         if ((me.octo.client.PxTruth.truth(var10000))) {
            var8 = var4;
            var10001 = -var0;
            if (var5 != null) {
               break label66;
            }

            if (var4 < var10001) {
               return false;
            }
         }

         var8 = var4;
         var10001 = var3;
      }

      float var6 = var8 - var10001;
      var8 = Math.abs(var6);
      var10001 = var0;
      if (var5 == null) {
         if (var8 < var0) {
            return false;
         }

         var8 = -var3;
         var10001 = var6;
      }

      label46: {
         float var7;
         label45: {
            var7 = var8 / var10001;
            if (var5 == null) {
               if (!(var3 < -var0)) {
                  break label45;
               }

               var1.element = Math.max(var1.element, var7);
            }

            if (var5 == null) {
               break label46;
            }
         }

         var2.element = Math.min(var2.element, var7);
      }

      float var15;
       var10 = (var15 = var1.element - var2.element) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
      if (var5 == null) {
         var10 = var10 <= 0 ? 1 : 0;
      }

      return (var10 != 0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static { char[] var20 = null; // PX-FIX hoist
        
       var20 = null; // PX-FIX
      String[] var5 = new String[12];
      int var3 = 0;
      String var2 = "T\n9^ý±£ý®,ÕK`nz\u0003á\u0004&\u0004t}\\\u0006\t¯u\u0080~ü\u0082g@,\r\u0017Bø[(£\u0004lÃ\u0017\u0083yW\rw\u0096ôÁ©ð4\u0006ÅZCÐO\u0002é\u0082\tñZK\u009b\u0085>H×É\u0004\ræsu\u0002\u0007\u001d";
      int var4 = "T\n9^ý±£ý®,ÕK`nz\u0003á\u0004&\u0004t}\\\u0006\t¯u\u0080~ü\u0082g@,\r\u0017Bø[(£\u0004lÃ\u0017\u0083yW\rw\u0096ôÁ©ð4\u0006ÅZCÐO\u0002é\u0082\tñZK\u009b\u0085>H×É\u0004\ræsu\u0002\u0007\u001d"
         .length();
      char var1 = 15;
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
                     case 0 -> 74;
                     case 1 -> 30;
                     case 2 -> 104;
                     case 3 -> 13;
                     case 4 -> 101;
                     case 5 -> 114;
                     default -> 14;
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
                     b = new String[12];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllllIllIllllIlllllIlIlIlllIIIIIllllllIIlllIlIIIlIlIIlIIIlIlllIIIllllllIIlIlllIIIlIIl();
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new Matrix4f();
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new Vector3f();
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new Vector3f();
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

                  var2 = "üGî1\u0013ð<=\u008cíÑV8\u0016Ñ\u0018\u0003D å";
                  var4 = "üGî1\u0013ð<=\u008cíÑV8\u0016Ñ\u0018\u0003D å".length();
                  var1 = 16;
                  var8 = -1;
            }

            var10000 = 72;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 10231) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 67;
            case 1 -> 74;
            case 2 -> 38;
            case 3 -> 226;
            case 4 -> 141;
            case 5 -> 72;
            case 6 -> 109;
            case 7 -> 12;
            case 8 -> 59;
            case 9 -> 85;
            case 10 -> 209;
            case 11 -> 157;
            case 12 -> 190;
            case 13 -> 139;
            case 14 -> 250;
            case 15 -> 40;
            case 16 -> 235;
            case 17 -> 198;
            case 18 -> 41;
            case 19 -> 57;
            case 20 -> 164;
            case 21 -> 185;
            case 22 -> 0;
            case 23 -> 242;
            case 24 -> 107;
            case 25 -> 215;
            case 26 -> 172;
            case 27 -> 66;
            case 28 -> 135;
            case 29 -> 100;
            case 30 -> 255;
            case 31 -> 23;
            case 32 -> 126;
            case 33 -> 233;
            case 34 -> 110;
            case 35 -> 238;
            case 36 -> 163;
            case 37 -> 156;
            case 38 -> 87;
            case 39 -> 213;
            case 40 -> 32;
            case 41 -> 44;
            case 42 -> 30;
            case 43 -> 42;
            case 44 -> 25;
            case 45 -> 121;
            case 46 -> 212;
            case 47 -> 105;
            case 48 -> 148;
            case 49 -> 75;
            case 50 -> 20;
            case 51 -> 234;
            case 52 -> 123;
            case 53 -> 241;
            case 54 -> 68;
            case 55 -> 155;
            case 56 -> 49;
            case 57 -> 180;
            case 58 -> 243;
            case 59 -> 161;
            case 60 -> 203;
            case 61 -> 77;
            case 62 -> 14;
            case 63 -> 160;
            case 64 -> 96;
            case 65 -> 120;
            case 66 -> 200;
            case 67 -> 150;
            case 68 -> 136;
            case 69 -> 204;
            case 70 -> 98;
            case 71 -> 80;
            case 72 -> 43;
            case 73 -> 27;
            case 74 -> 132;
            case 75 -> 33;
            case 76 -> 62;
            case 77 -> 124;
            case 78 -> 170;
            case 79 -> 231;
            case 80 -> 229;
            case 81 -> 199;
            case 82 -> 112;
            case 83 -> 21;
            case 84 -> 178;
            case 85 -> 140;
            case 86 -> 9;
            case 87 -> 183;
            case 88 -> 93;
            case 89 -> 151;
            case 90 -> 167;
            case 91 -> 86;
            case 92 -> 184;
            case 93 -> 188;
            case 94 -> 232;
            case 95 -> 50;
            case 96 -> 115;
            case 97 -> 210;
            case 98 -> 113;
            case 99 -> 228;
            case 100 -> 165;
            case 101 -> 22;
            case 102 -> 71;
            case 103 -> 29;
            case 104 -> 16;
            case 105 -> 166;
            case 106 -> 252;
            case 107 -> 114;
            case 108 -> 137;
            case 109 -> 246;
            case 110 -> 223;
            case 111 -> 154;
            case 112 -> 81;
            case 113 -> 53;
            case 114 -> 186;
            case 115 -> 91;
            case 116 -> 237;
            case 117 -> 39;
            case 118 -> 225;
            case 119 -> 214;
            case 120 -> 89;
            case 121 -> 247;
            case 122 -> 61;
            case 123 -> 55;
            case 124 -> 168;
            case 125 -> 244;
            case 126 -> 205;
            case 127 -> 92;
            case 128 -> 106;
            case 129 -> 202;
            case 130 -> 142;
            case 131 -> 17;
            case 132 -> 70;
            case 133 -> 116;
            case 134 -> 224;
            case 135 -> 94;
            case 136 -> 79;
            case 137 -> 169;
            case 138 -> 47;
            case 139 -> 125;
            case 140 -> 152;
            case 141 -> 175;
            case 142 -> 134;
            case 143 -> 240;
            case 144 -> 15;
            case 145 -> 11;
            case 146 -> 90;
            case 147 -> 4;
            case 148 -> 196;
            case 149 -> 118;
            case 150 -> 194;
            case 151 -> 82;
            case 152 -> 13;
            case 153 -> 217;
            case 154 -> 97;
            case 155 -> 159;
            case 156 -> 101;
            case 157 -> 56;
            case 158 -> 76;
            case 159 -> 64;
            case 160 -> 208;
            case 161 -> 187;
            case 162 -> 95;
            case 163 -> 46;
            case 164 -> 219;
            case 165 -> 230;
            case 166 -> 104;
            case 167 -> 201;
            case 168 -> 7;
            case 169 -> 102;
            case 170 -> 111;
            case 171 -> 1;
            case 172 -> 222;
            case 173 -> 10;
            case 174 -> 149;
            case 175 -> 5;
            case 176 -> 146;
            case 177 -> 131;
            case 178 -> 207;
            case 179 -> 253;
            case 180 -> 144;
            case 181 -> 45;
            case 182 -> 69;
            case 183 -> 2;
            case 184 -> 129;
            case 185 -> 31;
            case 186 -> 34;
            case 187 -> 249;
            case 188 -> 189;
            case 189 -> 176;
            case 190 -> 51;
            case 191 -> 119;
            case 192 -> 84;
            case 193 -> 103;
            case 194 -> 147;
            case 195 -> 171;
            case 196 -> 48;
            case 197 -> 122;
            case 198 -> 117;
            case 199 -> 254;
            case 200 -> 236;
            case 201 -> 211;
            case 202 -> 162;
            case 203 -> 206;
            case 204 -> 26;
            case 205 -> 73;
            case 206 -> 143;
            case 207 -> 133;
            case 208 -> 193;
            case 209 -> 145;
            case 210 -> 221;
            case 211 -> 174;
            case 212 -> 78;
            case 213 -> 153;
            case 214 -> 216;
            case 215 -> 28;
            case 216 -> 158;
            case 217 -> 54;
            case 218 -> 52;
            case 219 -> 8;
            case 220 -> 36;
            case 221 -> 248;
            case 222 -> 108;
            case 223 -> 179;
            case 224 -> 182;
            case 225 -> 37;
            case 226 -> 218;
            case 227 -> 239;
            case 228 -> 83;
            case 229 -> 192;
            case 230 -> 181;
            case 231 -> 18;
            case 232 -> 128;
            case 233 -> 60;
            case 234 -> 127;
            case 235 -> 220;
            case 236 -> 6;
            case 237 -> 58;
            case 238 -> 88;
            case 239 -> 177;
            case 240 -> 24;
            case 241 -> 3;
            case 242 -> 173;
            case 243 -> 63;
            case 244 -> 130;
            case 245 -> 99;
            case 246 -> 191;
            case 247 -> 245;
            case 248 -> 195;
            case 249 -> 251;
            case 250 -> 138;
            case 251 -> 19;
            case 252 -> 227;
            case 253 -> 197;
            case 254 -> 65;
            default -> 35;
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
