package me.octo.client;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.CameraType;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.util.Mth;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IllllIIllIIIlIIlIIlIllIIllIlllIIlIllllIIlIIIIIIlIIIIIllIlllIlIIIlIlIlIIlllllIllIllIll
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static IllllIIllIIIlIIlIIlIllIIllIlllIIlIllllIIlIIIIIIlIIIIIllIlllIlIIIlIlIlIIlllllIllIllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private float lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private float lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private float IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @Nullable
   private CameraType llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private boolean IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @JvmField
   @NotNull
   public static IllllIIllIIIlIIlIIlIllIIllIlllIIlIllllIIlIIIIIIlIIIIIllIlllIlIIIlIlIlIIlllllIllIllIll IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static String[] f;
   private static String[] g;

   private IllllIIllIIIlIIlIIlIllIIllIlllIIlIllllIIlIIIIIIlIIIIIllIlllIlIIIlIlIlIIlllllIllIllIll() {
      short var10001 = -2802;
      short var10002 = -12649;
      var10002 = -2804;
      short var10003 = 20389;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      short var10004 = -2803;
      short var10005 = -19208;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         IlIlllIllIllIlIlIlllIIIllIIllIIlIlIlIIlIlIlIllllIIIllIllIlllIIlIllIlIIIIIlIIllIIllIIl.a(),
         IlIlllIllIllIlIlIlllIIIllIIllIIlIlIlIIlIlIlIllllIIIllIllIlllIIlIllIlIIIIIlIIllIIllIIl.b()
      };
      super("Freelook", "Allows more rotation options in third person.", var3, "Camera", var1);
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 4.0F;
   }

   public final float ag() {
      return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   public final void a(float var1) {
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var1;
   }

   public final float ah() {
      return this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   }

   public final void b(float var1) {
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var1;
   }

   public final float ai() {
      return this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   }

   public final void c(float var1) {
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var1;
   }

   @Override
   public void aB() {
      String var1 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      IllllIIllIIIlIIlIIlIllIIllIlllIIlIllllIIlIIIIIIlIIIIIllIlllIlIIIlIlIlIIlllllIllIllIll var10000 = this;
      if (var1 == null) {
         if (this.ap().player == null) {
            return;
         }

         LocalPlayer var10001 = this.ap().player;
         Intrinsics.checkNotNull(var10001);
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var10001.getYRot();
         var10001 = this.ap().player;
         Intrinsics.checkNotNull(var10001);
         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var10001.getXRot();
         this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 4.0F;
         this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = this.ap().options.getCameraType();
         var10000 = this;
      }

      var10000.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = false;
      if (var1 == null) {
         label24: {
            if (!((Boolean)((me.octo.client.PXDyn)(Object)(IlIlllIllIllIlIlIlllIIIllIIllIIlIlIlIIlIlIlIllllIIIllIllIlllIIlIllIlIIIIIlIIllIIllIIl.a())).al())) {
               var10000 = this;
               if (var1 != null) {
                  break label24;
               }

               if (this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI != CameraType.THIRD_PERSON_BACK) {
                  this.ap().options.setCameraType(CameraType.THIRD_PERSON_BACK);
               }
            }

            var10000 = this;
         }

         var10000.aB();
      }
   }

   @Override
   public void aC() {
      String var1 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      if (var1 == null && this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI != null) {
         CameraType var2 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
         boolean var3 = false;
         this.ap().options.setCameraType(var2);
      }

      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 4.0F;
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = false;
      super.aC();
   }

   public final boolean aG() {
      String var1 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      boolean var10000 = this.ae();
      if (var1 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = ((me.octo.client.PXDyn)(Object)(IlIlllIllIllIlIlIlllIIIllIIllIIlIlIlIIlIlIlIllllIIIllIllIlllIIlIllIlIIIIIlIIllIIllIIl.a())).al();
      }

      label48: {
         if (var1 == null) {
            if (var10000) {
               var10000 = this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
               break label48;
            }

            var10000 = this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
         }

         if (var1 == null) {
            var10000 = !var10000;
         }
      }

      boolean var2 = var10000;
      var10000 = var2;
      if (var1 == null) {
         if (var2) {
            if (this.ap().options.getCameraType() == CameraType.THIRD_PERSON_BACK) {
               return true;
            }

            return ((Boolean)((me.octo.client.PXDyn)(Object)(IlIlllIllIllIlIlIlllIIIllIIllIIlIlIlIIlIlIlIllllIIIllIllIlllIIlIllIlIIIIIlIIllIIllIIl.b())).al())
               && this.ap().options.getCameraType() == CameraType.FIRST_PERSON;
         }

         var10000 = false;
      }

      return var10000;
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl var1) {
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      short var10002 = -2801;
      short var10003 = -18347;
      Intrinsics.checkNotNullParameter(var1, "event");
      String var2 = var10000;
      int var3 = ((this.ae()) ? 1 : 0);
      if (var2 == null) {
         if (var3 == 0) {
            return;
         }

         var3 = var1.k();
      }

      if (var2 == null) {
         if (var3 != 2) {
            return;
         }

         var3 = ((var1.n()) ? 1 : 0);
      }

      if (var2 == null) {
         if (var3 != 0) {
            this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = true;
            this.d(true);
            if (var2 == null) {
               return;
            }
         }

         var3 = ((var1.o()) ? 1 : 0);
      }

      if (var3 != 0) {
         this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = false;
         this.d(false);
      }
   }

   private final void d(boolean var1) {
      String var2 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      if (this.ap().player != null) {
         boolean var10000 = ((me.octo.client.PXDyn)(Object)(IlIlllIllIllIlIlIlllIIIllIIllIIlIlIlIIlIlIlIllllIIIllIllIlllIIlIllIlIIIIIlIIllIIllIIl.a())).al();
         if (var2 == null) {
            if (var10000) {
               if (var1) {
                  this.ap().options.setCameraType(CameraType.THIRD_PERSON_BACK);
                  LocalPlayer var10001 = this.ap().player;
                  Intrinsics.checkNotNull(var10001);
                  this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var10001.getYRot();
                  var10001 = this.ap().player;
                  Intrinsics.checkNotNull(var10001);
                  this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var10001.getXRot();
                  if (var2 == null) {
                     return;
                  }
               }

               if (this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI != null) {
                  CameraType var5 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
                  boolean var6 = false;
                  this.ap().options.setCameraType(var5);
                  return;
               }

               if (var2 == null) {
                  return;
               }
            }

            var10000 = var1;
         }

         if (var10000) {
            if (this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI != null) {
               CameraType var3 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
               boolean var4 = false;
               this.ap().options.setCameraType(var3);
               return;
            }

            if (var2 == null) {
               return;
            }
         }

         this.ap().options.setCameraType(CameraType.THIRD_PERSON_BACK);
         LocalPlayer var8 = this.ap().player;
         Intrinsics.checkNotNull(var8);
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var8.getYRot();
         var8 = this.ap().player;
         Intrinsics.checkNotNull(var8);
         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var8.getXRot();
      }
   }

   public final void aH() {
      String var1 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      IllllIIllIIIlIIlIIlIllIIllIlllIIlIllllIIlIIIIIIlIIIIIllIlllIlIIIlIlIlIIlllllIllIllIll var10000 = this;
      if (var1 == null) {
         if (!this.ae()) {
            return;
         }

         var10000 = this;
      }

      if (var10000.ap().screen == null) {
         int var2 = 0;

         while (true) {
            if (var2 < 8) {
               if (var1 != null) {
                  break;
               }

               boolean var3 = me.octo.client.utils.lIIIlIllllIIllIlIlIllIlIllllIIlIIlIIIllllIlIllIIllIIIlllIIIIllIlIIllIlllIIIIllIIlIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(263);
               if (var1 == null) {
                  if (var3) {
                     this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl += 0.5F;
                  }

                  var3 = me.octo.client.utils.lIIIlIllllIIllIlIlIllIlIllllIIlIIlIIIllllIlIllIIllIIIlllIIIIllIlIIllIlllIIIIllIIlIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(262);
               }

               if (var1 == null) {
                  if (var3) {
                     this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl -= 0.5F;
                  }

                  var3 = me.octo.client.utils.lIIIlIllllIIllIlIlIllIlIllllIIlIIlIIIllllIlIllIIllIIIlllIIIIllIlIIllIlllIIIIllIIlIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(265);
               }

               if (var1 == null) {
                  if (var3) {
                     this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll += 0.5F;
                  }

                  var3 = me.octo.client.utils.lIIIlIllllIIllIlIlIllIlIllllIIlIIlIIIllllIlIllIIllIIIlllIIIIllIlIIllIlllIIIIllIIlIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(264);
               }

               if (var3) {
                  this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll -= 0.5F;
               }

               var2++;
               if (var1 == null) {
                  continue;
               }
            }

            this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = Mth.clamp(
               this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll, -90.0F, 90.0F
            );
            break;
         }
      }
   }

   public final void a(double var1) {
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = Mth.clamp(
         this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl - (float)var1 * 0.5F, 1.0F, 20.0F
      );
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "ÐöaGd\u0093£J%\u0085Tr»\u0093w\u008b\u001eB\u0088è%\u0099ê»]<\u000bàªra=%a¡s\u000e\fN\u001eOïò\u0094\u008c\u0006:\u0095\u007f\u008d\u0083\u0093";
      int var4 = "ÐöaGd\u0093£J%\u0085Tr»\u0093w\u008b\u001eB\u0088è%\u0099ê»]<\u000bàªra=%a¡s\u000e\fN\u001eOïò\u0094\u008c\u0006:\u0095\u007f\u008d\u0083\u0093"
         .length();
      char var1 = '-';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 126;
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
                     case 0 -> 55;
                     case 1 -> 102;
                     case 2 -> 41;
                     case 3 -> 106;
                     case 4 -> 74;
                     case 5 -> 118;
                     default -> 110;
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
                     g = new String[4];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IllllIIllIIIlIIlIIlIllIIllIlllIIlIllllIIlIIIIIIlIIIIIllIlllIlIIIlIlIlIIlllllIllIllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
                     IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new IllllIIllIIIlIIlIIlIllIIllIlllIIlIllllIIlIIIIIIlIIIIIllIlllIlIIIlIlIlIIlllllIllIllIll();
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

                  var2 = "pÜ)gìr7]\u0005\u0080¡pGß";
                  var4 = "pÜ)gìr7]\u0005\u0080¡pGß".length();
                  var1 = '\b';
                  var8 = -1;
            }

            var10000 = 74;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -2804) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 154;
            case 1 -> 250;
            case 2 -> 5;
            case 3 -> 95;
            case 4 -> 61;
            case 5 -> 172;
            case 6 -> 7;
            case 7 -> 91;
            case 8 -> 253;
            case 9 -> 60;
            case 10 -> 240;
            case 11 -> 98;
            case 12 -> 109;
            case 13 -> 76;
            case 14 -> 144;
            case 15 -> 246;
            case 16 -> 190;
            case 17 -> 16;
            case 18 -> 55;
            case 19 -> 194;
            case 20 -> 106;
            case 21 -> 114;
            case 22 -> 137;
            case 23 -> 117;
            case 24 -> 155;
            case 25 -> 22;
            case 26 -> 147;
            case 27 -> 41;
            case 28 -> 90;
            case 29 -> 202;
            case 30 -> 3;
            case 31 -> 15;
            case 32 -> 161;
            case 33 -> 65;
            case 34 -> 122;
            case 35 -> 105;
            case 36 -> 35;
            case 37 -> 8;
            case 38 -> 242;
            case 39 -> 94;
            case 40 -> 85;
            case 41 -> 42;
            case 42 -> 113;
            case 43 -> 72;
            case 44 -> 49;
            case 45 -> 232;
            case 46 -> 136;
            case 47 -> 50;
            case 48 -> 221;
            case 49 -> 38;
            case 50 -> 174;
            case 51 -> 12;
            case 52 -> 227;
            case 53 -> 52;
            case 54 -> 187;
            case 55 -> 228;
            case 56 -> 80;
            case 57 -> 237;
            case 58 -> 216;
            case 59 -> 28;
            case 60 -> 66;
            case 61 -> 59;
            case 62 -> 45;
            case 63 -> 157;
            case 64 -> 215;
            case 65 -> 198;
            case 66 -> 164;
            case 67 -> 88;
            case 68 -> 244;
            case 69 -> 220;
            case 70 -> 56;
            case 71 -> 238;
            case 72 -> 248;
            case 73 -> 218;
            case 74 -> 167;
            case 75 -> 255;
            case 76 -> 48;
            case 77 -> 46;
            case 78 -> 251;
            case 79 -> 235;
            case 80 -> 123;
            case 81 -> 163;
            case 82 -> 32;
            case 83 -> 9;
            case 84 -> 171;
            case 85 -> 131;
            case 86 -> 27;
            case 87 -> 36;
            case 88 -> 0;
            case 89 -> 204;
            case 90 -> 199;
            case 91 -> 79;
            case 92 -> 197;
            case 93 -> 10;
            case 94 -> 141;
            case 95 -> 132;
            case 96 -> 47;
            case 97 -> 152;
            case 98 -> 81;
            case 99 -> 148;
            case 100 -> 129;
            case 101 -> 177;
            case 102 -> 138;
            case 103 -> 119;
            case 104 -> 217;
            case 105 -> 151;
            case 106 -> 193;
            case 107 -> 175;
            case 108 -> 37;
            case 109 -> 183;
            case 110 -> 20;
            case 111 -> 184;
            case 112 -> 143;
            case 113 -> 182;
            case 114 -> 236;
            case 115 -> 200;
            case 116 -> 11;
            case 117 -> 153;
            case 118 -> 78;
            case 119 -> 162;
            case 120 -> 44;
            case 121 -> 231;
            case 122 -> 158;
            case 123 -> 112;
            case 124 -> 54;
            case 125 -> 111;
            case 126 -> 130;
            case 127 -> 120;
            case 128 -> 107;
            case 129 -> 139;
            case 130 -> 223;
            case 131 -> 69;
            case 132 -> 225;
            case 133 -> 234;
            case 134 -> 25;
            case 135 -> 208;
            case 136 -> 2;
            case 137 -> 156;
            case 138 -> 203;
            case 139 -> 14;
            case 140 -> 67;
            case 141 -> 73;
            case 142 -> 1;
            case 143 -> 181;
            case 144 -> 101;
            case 145 -> 219;
            case 146 -> 29;
            case 147 -> 87;
            case 148 -> 249;
            case 149 -> 173;
            case 150 -> 124;
            case 151 -> 127;
            case 152 -> 92;
            case 153 -> 205;
            case 154 -> 128;
            case 155 -> 160;
            case 156 -> 133;
            case 157 -> 68;
            case 158 -> 224;
            case 159 -> 33;
            case 160 -> 77;
            case 161 -> 99;
            case 162 -> 212;
            case 163 -> 82;
            case 164 -> 222;
            case 165 -> 63;
            case 166 -> 121;
            case 167 -> 254;
            case 168 -> 176;
            case 169 -> 26;
            case 170 -> 97;
            case 171 -> 74;
            case 172 -> 13;
            case 173 -> 34;
            case 174 -> 233;
            case 175 -> 178;
            case 176 -> 23;
            case 177 -> 86;
            case 178 -> 245;
            case 179 -> 230;
            case 180 -> 40;
            case 181 -> 89;
            case 182 -> 145;
            case 183 -> 118;
            case 184 -> 168;
            case 185 -> 108;
            case 186 -> 195;
            case 187 -> 103;
            case 188 -> 239;
            case 189 -> 71;
            case 190 -> 126;
            case 191 -> 96;
            case 192 -> 75;
            case 193 -> 6;
            case 194 -> 110;
            case 195 -> 214;
            case 196 -> 169;
            case 197 -> 30;
            case 198 -> 116;
            case 199 -> 84;
            case 200 -> 252;
            case 201 -> 51;
            case 202 -> 179;
            case 203 -> 134;
            case 204 -> 166;
            case 205 -> 170;
            case 206 -> 188;
            case 207 -> 209;
            case 208 -> 146;
            case 209 -> 17;
            case 210 -> 210;
            case 211 -> 192;
            case 212 -> 70;
            case 213 -> 31;
            case 214 -> 165;
            case 215 -> 135;
            case 216 -> 226;
            case 217 -> 149;
            case 218 -> 102;
            case 219 -> 4;
            case 220 -> 19;
            case 221 -> 142;
            case 222 -> 104;
            case 223 -> 213;
            case 224 -> 62;
            case 225 -> 140;
            case 226 -> 186;
            case 227 -> 180;
            case 228 -> 196;
            case 229 -> 58;
            case 230 -> 243;
            case 231 -> 211;
            case 232 -> 53;
            case 233 -> 207;
            case 234 -> 100;
            case 235 -> 229;
            case 236 -> 93;
            case 237 -> 125;
            case 238 -> 159;
            case 239 -> 150;
            case 240 -> 206;
            case 241 -> 64;
            case 242 -> 57;
            case 243 -> 241;
            case 244 -> 39;
            case 245 -> 191;
            case 246 -> 83;
            case 247 -> 247;
            case 248 -> 24;
            case 249 -> 115;
            case 250 -> 18;
            case 251 -> 201;
            case 252 -> 43;
            case 253 -> 189;
            case 254 -> 185;
            default -> 21;
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
       public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker var1) { this(); }
   }
}
