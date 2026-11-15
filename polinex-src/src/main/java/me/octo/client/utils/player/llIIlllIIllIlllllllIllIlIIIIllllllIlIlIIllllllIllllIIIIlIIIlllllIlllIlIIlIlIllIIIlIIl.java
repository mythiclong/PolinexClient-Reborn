package me.octo.client.utils.player;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI;
import me.octo.client.lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI;
import me.octo.client.lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll;
import me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.client.Options;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl
   extends me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4) { return null; } // PX-FIX ovld

   public static <T> T a(Object p0, Object p1, Object p2) { return null; } // PX-FIX ovld

   public static <T> T a(Object p0, Object p1, Object p2, Object p3) { return null; } // PX-FIX ovld

   public static <T> T b(Object p0, Object p1, Object p2, Object p3, Object p4) { return null; } // PX-FIX ovld
   public static Vec3 a(llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl p0, boolean p1, int p2, Object p3) {
      // SYNB1-defaultarg
      if ((p2 & 1) != 0) { p1 = false; }
      return p0.f(p1);
   }

   public static void a(llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl p0, Vec3 p1, boolean p2, int p3, Object p4) {
      if ((p3 & 2) != 0) { p2 = false; }
      p0.a(p1, p2);
   }

   public static void a(llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl p0, Vec3 p1, Vec3 p2, boolean p3, double p4, int p5, Object p6) {
      if ((p5 & 4) != 0) { p3 = false; }
      if ((p5 & 8) != 0) { p4 = 0.0; }
      p0.a(p1, p2, p3, p4);
   }

   public static void a(llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl p0, boolean p1, boolean p2, boolean p3, boolean p4, int p5, Object p6) {
      if ((p5 & 1) != 0) { p1 = false; }
      if ((p5 & 2) != 0) { p2 = false; }
      if ((p5 & 4) != 0) { p3 = false; }
      if ((p5 & 8) != 0) { p4 = false; }
      p0.a(p1, p2, p3, p4);
   }

   public static void b(llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl p0, Vec3 p1, Vec3 p2, boolean p3, double p4, int p5, Object p6) {
      if ((p5 & 4) != 0) { p3 = true; }
      if ((p5 & 8) != 0) { p4 = 0.3; }
      p0.b(p1, p2, p3, p4);
   }

   public static void h() {
   }

   @NotNull
   public static llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static List<boolean[]> IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static boolean lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private static lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static boolean llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static boolean lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static boolean lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static int lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static boolean lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static boolean IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private static Vec3 llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @NotNull
   private static lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static String IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static String[] c;
   private static String[] d;

   private llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl() {
   }

   public static final boolean g() {
      return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   public static final void a(boolean var0) {
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var0;
   }

   @NotNull
   public final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI i() {
      return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   public final boolean j() {
      return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   public final void b(boolean var1) {
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var1;
   }

   public final boolean k() {
      return lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   public final void c(boolean var1) {
      lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var1;
   }

   public final boolean l() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   public final void d(boolean var1) {
      lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var1;
   }

   public final int m() {
      return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   public final void b(int var1) {
      lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var1;
   }

   public final boolean n() {
      return lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   }

   public final void e(boolean var1) {
      lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var1;
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII var1) { int var12 = 0; // PX-FIX hoist
        
      Object var51 = null; // PX-FIX
      int var49 = 0; // PX-FIX
      Iterable var48 = null; // PX-FIX
      Object var35 = null; // PX-FIX
      Object var33 = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      short var10002 = 3809;
      short var10003 = -650;
      Intrinsics.checkNotNullParameter(var1, "event");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      byte var31 = ((byte)((IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m()) ? 1 : 0));
      if (var2 != null) {
         if (var31 != 0) {
            LocalPlayer var3;
            byte var4;
            label251: {
               label265: {
                  LocalPlayer var34 = this.a().player;
                  Intrinsics.checkNotNull(var34);
                  var3 = var34;
                  var4 = ((byte)((var3.onGround()) ? 1 : 0));
                  var35 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                  label249:
                  if (var2 != null) {
                     if (!lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl) {
                        var35 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                        if (var2 == null) {
                           break label249;
                        }

                        if (lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI) {
                           var35 = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                           if (var2 == null) {
                              break label249;
                           }

                           if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl == -1) {
                              lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = false;
                              lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 0;
                              if (var2 != null) {
                                 break label265;
                              }
                           }
                        }
                     }

                     var35 = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                  }

                  if (var2 == null) {
                     break label251;
                  }

                  if (((Boolean)var35)) {
                     int var5 = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl++;
                     var35 = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                     if (var2 == null) {
                        break label251;
                     }

                     if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl > 500) {
                        lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = -1;
                     }
                  }
               }

               var35 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
            }

            label230: {
               label266: {
                  label228:
                  if (var2 != null) {
                     if (!((Boolean)var35)) {
                        var35 = var4;
                        if (var2 == null) {
                           break label228;
                        }

                        if (var4 == 0) {
                           double var88;
                           var35 = (var88 = var3.getDeltaMovement().y - 0.0) == 0.0 ? 0 : (var88 < 0.0 ? -1 : 1);
                           if (var2 == null) {
                              break label228;
                           }

                           if (((Boolean)var35)) {
                              lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = true;
                              lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = false;
                              lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = -1;
                              if (var2 != null) {
                                 break label266;
                              }
                           }
                        }
                     }

                     var35 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                  }

                  if (var2 == null) {
                     break label230;
                  }

                  if (!((Boolean)var35)) {
                     var35 = var4;
                     if (var2 == null) {
                        break label230;
                     }

                     if (var4 != 0) {
                        lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = false;
                        lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = true;
                     }
                  }
               }

               lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = (var4 != 0);
               var35 = this.w();
            }

            if (var2 != null) {
               if (!((Boolean)var35)) {
                  if (IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .O()
                     == null) {
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.f();
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = false;
                     return;
                  }

                  float var29;
                  label268: {
                     LocalPlayer var36 = this.a().player;
                     Intrinsics.checkNotNull(var36);
                     var29 = var36.getYRot() + 180.0F;
                     short var10001 = 3784;
                     var10002 = -21197;
                     boolean var37 = this.a("forward");
                     if (var2 != null) {
                        if (var37) {
                           var10001 = 3831;
                           var10002 = -7923;
                           boolean var38 = this.a("left");
                           if (var2 != null) {
                              if (var38) {
                                 var29 -= 45.0F;
                              }

                              var10001 = 3787;
                              var10002 = 14544;
                              var38 = this.a("right");
                           }

                           if (!var38) {
                              break label268;
                           }

                           var29 += 45.0F;
                           if (var2 != null) {
                              break label268;
                           }
                        }

                        var10001 = 3807;
                        var10002 = 26275;
                        var37 = this.a("backward");
                     }

                     if (var2 != null) {
                        if (var37) {
                           var29 -= 180.0F;
                           var10001 = 3831;
                           var10002 = -7923;
                           boolean var39 = this.a("left");
                           if (var2 != null) {
                              if (var39) {
                                 var29 += 45.0F;
                              }

                              var10001 = 3787;
                              var10002 = 14544;
                              var39 = this.a("right");
                           }

                           if (!var39) {
                              break label268;
                           }

                           var29 -= 45.0F;
                           if (var2 != null) {
                              break label268;
                           }
                        }

                        var10001 = 3831;
                        var10002 = -7923;
                        var37 = this.a("left");
                     }

                     if (var2 != null) {
                        if (var37) {
                           var29 -= 90.0F;
                           if (var2 != null) {
                              break label268;
                           }
                        }

                        var10001 = 3787;
                        var10002 = 14544;
                        var37 = this.a("right");
                     }

                     if (var37) {
                        var29 += 90.0F;
                     }
                  }

                  lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var6 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .d(var29);
                  Vec3 var40 = var6.b().scale(0.3);
                  var10002 = 3827;
                  var10003 = -27448;
                  Intrinsics.checkNotNullExpressionValue(var40, "scale(...)");
                  Vec3 var7 = var40;
                  Vec3 var41 = var6.c().scale(0.1);
                  var10002 = 3805;
                  var10003 = -1903;
                  Intrinsics.checkNotNullExpressionValue(var41, "scale(...)");
                  Vec3 var8 = var41;
                  Vec3 var42 = var6.d().scale(0.1);
                  var10002 = 3805;
                  var10003 = -1903;
                  Intrinsics.checkNotNullExpressionValue(var42, "scale(...)");
                  Vec3 var9 = var42;
                  Vec3 var10 = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
                  Vec3 var43 = var10.add(0.0, 0.5, 0.0);
                  var10002 = 3790;
                  var10003 = 13285;
                  Intrinsics.checkNotNullExpressionValue(var43, "add(...)");
                  Vec3 var11 = var43;
                   var12 = 1;

                  label178:
                  while (true) {
                     int var44 = var12;

                     label175:
                     while (var44 < 8) {
                        Vec3 var45 = var11.add(var7);
                        var10002 = 3790;
                        var10003 = 13285;
                        Intrinsics.checkNotNullExpressionValue(var45, "add(...)");
                        var11 = var45;
                        BlockPos[] var13 = new BlockPos[]{
                           me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .a(var11),
                           null,
                           null
                        };
                        me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI var73 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                        Vec3 var82 = var11.add(var8);
                        short var10005 = 3790;
                        short var10006 = 13285;
                        Intrinsics.checkNotNullExpressionValue(var82, "add(...)");
                        var13[1] = var73.a(var82);
                        me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI var74 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                        Vec3 var83 = var11.add(var9);
                        var10005 = 3790;
                        var10006 = 13285;
                        Intrinsics.checkNotNullExpressionValue(var83, "add(...)");
                        var13[2] = var74.a(var83);
                        Iterable var30 = CollectionsKt.arrayListOf(var13);
                        boolean var14 = false;
                        if (var2 == null) {
                           return;
                        }

                        for (Object var16 : var30) {
                           BlockPos var17 = (BlockPos)var16;
                           boolean var18 = false;
                           ClientLevel var46 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().level;
                           Intrinsics.checkNotNull(var46);
                           BlockState var47 = var46.getBlockState(var17);
                           var10002 = 3800;
                           var10003 = 8104;
                           Intrinsics.checkNotNullExpressionValue(var47, "getBlockState(...)");
                           BlockState var19 = var47;
                           double var20 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .g(var17)
                              .y;
                           if (var2 != null) {
                              var44 = ((var19.isAir()) ? 1 : 0);
                              if (var2 == null) {
                                 continue label175;
                              }

                              if (var44 == 0 && var20 - var10.y > 0.5) {
                                 label276: {
                                    Iterable var22 = (Iterable)(new IntRange(2, 7));
                                    boolean var23 = false;
                                    var48 = var22;
                                    label151:
                                    if (var2 != null) {
                                       if (var22 instanceof Collection) {
                                          var48 = (Collection)var22;
                                          if (var2 == null) {
                                             break label151;
                                          }

                                          if ((!var48.iterator().hasNext())) {
                                             var49 = 1;
                                             break label276;
                                          }
                                       }

                                       var48 = var22;
                                    }

                                    Iterator var24 = var48.iterator();

                                    label142:
                                    while (true) {
                                       if (!var24.hasNext()) {
                                          var49 = 1;
                                          break;
                                       }

                                       int var25 = ((IntIterator)var24).nextInt();
                                       boolean var27 = false;
                                       ClientLevel var50 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().level;
                                       Intrinsics.checkNotNull(var50);
                                       var49 = ((var50.getBlockState(var17.offset(0, var25, 0)).isAir()) ? 1 : 0);

                                       while (true) {
                                          if (var2 != null) {
                                             var49 = var49 == 0 ? 1 : 0;
                                          }

                                          if (var49 != 0) {
                                             break;
                                          }

                                          var49 = 0;
                                          if (var2 != null) {
                                             break label142;
                                          }
                                       }
                                    }
                                 }

                                 int var59;
                                 int var28 = var49;
                                 var51 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
                                 var10002 = 3796;
                                 var10003 = -29742;
                                 var59 = ((IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("shift")) ? 1 : 0);
                                 label130:
                                 if (var2 != null) {
                                    if (var59 == 0) {
                                       var59 = var28;
                                       if (var2 == null) {
                                          break label130;
                                       }

                                       if (var28 == 0) {
                                          var59 = 100;
                                          break label130;
                                       }
                                    }

                                    var59 = 400;
                                 }

                                 llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = ((me.octo.client.PXDyn)var51).a(var59);
                                 return;
                              }
                           }

                           if (var2 == null) {
                              break;
                           }
                        }

                        var12++;
                        if (var2 != null) {
                           continue label178;
                        }
                        break;
                     }

                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = false;
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.f();
                     return;
                  }
               }

               IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.f();
               var35 = 0;
            }

            llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = (boolean)var35;
            return;
         }

         lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = false;
         lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = false;
         var31 = -1;
      }

      label260: {
         lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var31;
         if (var2 != null) {
            LocalPlayer var32 = this.a().player;
            if (var32 != null) {
               var33 = var32.onGround();
               break label260;
            }
         }

         var33 = true;
      }

      lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll =((Boolean)( var33));
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.f();
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = false;
   }

   public final double o() {
       double var12 = 0.0; // PX-FIX decl var12
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1;
      MobEffectInstance var11;
      label33: {
         var1 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
         if (var1 != null) {
            LocalPlayer var10000 = this.a().player;
            if (var10000 != null) {
               var11 = var10000.getEffect(MobEffects.JUMP_BOOST);
               break label33;
            }
         }

         var11 = null;
      }

      MobEffectInstance var2 = var11;
      double var3 = var2 != null ? 0.42 + (var2.getAmplifier() + 1) * 0.1 : 0.42;
      double var5 = 0.0784;
      double var7 = 0.0;
      double var9 = var3;

      while (true) {
         if (var9 > var5) {
            var7 += var9;
            var12 = var9 * 0.98 - 0.08;
            if (var1 == null) {
               break;
            }

            var9 = var12;
            if (var1 != null) {
               continue;
            }
         }

         var12 = var7;
         break;
      }

      return var12;
   }

   @Nullable
   public final Vec3 f(boolean var1) { boolean var12 = false; // PX-FIX hoist
        
      double var56 = 0; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      if (var2 != null) {
         LocalPlayer var10000 = this.a().player;
         if (var10000 != null) {
            LocalPlayer var3 = var10000;
            if (var2 != null) {
               ClientLevel var51 = this.a().level;
               if (var51 != null) {
                  ClientLevel var4 = var51;
                  AttributeInstance var5 = var3.getAttribute(Attributes.MOVEMENT_SPEED);
                  Intrinsics.checkNotNull(var5);
                  Set var52 = var5.getModifiers();
                  short var10002 = 3814;
                  short var10003 = 28709;
                  Intrinsics.checkNotNullExpressionValue(var52, "getModifiers(...)");
                  Iterable var7 = var52;
                  boolean var8 = false;
                  Iterator var9 = var7.iterator();

                  label111:
                  while (true) {
                     if (var9.hasNext()) {
                        Object var10 = var9.next();
                        var10000 = (LocalPlayer)var10;

                        while (true) {
                           AttributeModifier var11 = (AttributeModifier)(Object)var10000;
                            var12 = false;
                           Identifier var54 = var11.id();
                           short var10001 = 3797;
                           var10002 = 8290;
                           if (!var54.equals(UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D"))) {
                              continue label111;
                           }

                           var10000 = (LocalPlayer)var10;
                           if (var2 != null) {
                              break label111;
                           }
                        }
                     }

                     var10000 = null;
                     break;
                  }

                  label101: {
                     AttributeModifier var6 = (AttributeModifier)(Object)var10000;
                     double var44 = Math.min(var5.getBaseValue(), 0.6);
                     double var55 = MathKt.roundToInt(var44 * 100) / 1000.0;
                     if (var2 != null) {
                        double var45 = var55;
                        if (var6 == null) {
                           var56 = var45;
                           break label101;
                        }

                        var55 = var45;
                     }

                     var56 = var55 * (1.0 + var6.amount());
                  }

                  double var13;
                  double var15;
                  double var18;
                  double var47;
                  label89: {
                     double var46 = var56;
                     var47 = 0.02 * (var46 / 0.7);
                     var13 = var3.getDeltaMovement().x;
                     var15 = var3.getDeltaMovement().z;
                     MobEffectInstance var17 = var3.getEffect(MobEffects.JUMP_BOOST);
                     var18 = 0.42 + (var2 != null && var17 != null ? (var17.getAmplifier() + 1) * 0.1 : 0.0);
                     int var57 = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                     byte var62 = -1;
                     if (var2 != null) {
                        if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl == -1) {
                           break label89;
                        }

                        var57 = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                        var62 = 3;
                     }

                     if (var57 < var62) {
                        var13 /= 0.546;
                        var15 /= 0.546;
                     }
                  }

                  double var20 = var3.getX();
                  double var22 = var3.getY();
                  double var24 = var3.getZ();
                  double var26 = var3.getBbWidth() / 2.0;
                  float var28 = var3.getBbHeight();
                  int var29 = 0;

                  while (var29 < 101) {
                     double var30 = var3.zza;
                     double var32 = var3.xxa;
                     double var34 = var30 * var30 + var32 * var32;
                     double var58 = var34;
                     double var63 = 1.0E-4F;
                     if (var2 != null) {
                        if (var34 >= 1.0E-4F) {
                           double var36 = Math.sqrt(var34);
                           double var59 = var36;
                           var63 = 1.0;
                           if (var2 != null) {
                              if (var36 < 1.0) {
                                 var36 = 1.0;
                              }

                              var36 = var47 / var36;
                              var30 *= var36;
                              var59 = var32;
                              var63 = var36;
                           }

                           var32 = var59 * var63;
                           double var38 = Math.toRadians(var3.getYRot());
                           double var40 = Math.sin(var38);
                           double var42 = Math.cos(var38);
                           var13 += var32 * var42 - var30 * var40;
                           var15 += var30 * var42 + var32 * var40;
                        }

                        var20 += var13;
                        var22 += var18;
                        var24 += var15;
                        var13 *= 0.98;
                        var15 *= 0.98;
                        var58 = var18 - 0.08;
                        var63 = 0.98F;
                     }

                     var18 = var58 * var63;
                     AABB var50 = new AABB(var20 - var26, var22, var24 - var26, var20 + var26, var22 + var28, var24 + var26);
                     if (var2 != null) {
                        if (!var4.noCollision(var3, var50)) {
                           AABB var37 = new AABB(var20 - var26, var22, var24 - var26, var20 + var26, var22 + 0.01, var24 + var26);
                           int var60 = ((var4.noCollision(var3, var37)) ? 1 : 0);
                           if (var2 != null) {
                              if (var60 != 0) {
                                 return new Vec3(var20, var22, var24);
                              }

                              double var66;
                              var60 = (var66 = var18 - 0.0) == 0.0 ? 0 : (var66 < 0.0 ? -1 : 1);
                           }

                           if (var60 < 0) {
                              return new Vec3(var20, var22, var24);
                           }

                           return new Vec3(var20, var22, var24);
                        }

                        var29++;
                     }

                     if (var2 == null) {
                        break;
                     }
                  }

                  return new Vec3(var20, var22, var24);
               }
            }

            return null;
         }
      }

      return null;
   }

   public final void p() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      if (var1 != null) {
         Options var10000 = this.a().options;
         if (var10000 != null) {
            Options var2 = var10000;
            KeyMapping var10001 = var2.keyUp;
            short var10003 = 3813;
            short var10004 = -7708;
            Intrinsics.checkNotNullExpressionValue(var2.keyUp, "keyUp");
            this.a(var10001, false);
            var10001 = var2.keyDown;
            var10003 = 3828;
            var10004 = 9263;
            Intrinsics.checkNotNullExpressionValue(var2.keyDown, "keyDown");
            this.a(var10001, false);
            var10001 = var2.keyRight;
            var10003 = 3776;
            var10004 = 2789;
            Intrinsics.checkNotNullExpressionValue(var2.keyRight, "keyRight");
            this.a(var10001, false);
            var10001 = var2.keyLeft;
            var10003 = 3795;
            var10004 = 3377;
            Intrinsics.checkNotNullExpressionValue(var2.keyLeft, "keyLeft");
            this.a(var10001, false);
            return;
         }
      }
   }

   public final void q() {
      this.p();
      short var10001 = 3781;
      short var10002 = -21919;
      this.a("jump", false);
   }

   public final void r() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      this.p();
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var10000;
      if (var1 != null) {
         Options var3 = this.a().options;
         if (var3 != null) {
            Options var2 = var3;
            KeyMapping var10001 = var2.keyJump;
            short var10003 = 3779;
            short var10004 = 10545;
            Intrinsics.checkNotNullExpressionValue(var2.keyJump, "keyJump");
            this.a(var10001, false);
            var10001 = var2.keyShift;
            var10003 = 3810;
            var10004 = 2196;
            Intrinsics.checkNotNullExpressionValue(var2.keyShift, "keyShift");
            this.a(var10001, false);
            var10001 = var2.keyAttack;
            var10003 = 3838;
            var10004 = -4325;
            Intrinsics.checkNotNullExpressionValue(var2.keyAttack, "keyAttack");
            this.a(var10001, false);
            return;
         }
      }
   }

   public final void a(@NotNull String var1, boolean var2) { short var12 = (short)0; // PX-FIX hoist
        
      Object var7 = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      short var10002 = 3825;
      short var10003 = -13738;
      Intrinsics.checkNotNullParameter(var1, "name");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = var10000;
      if (var3 != null) {
         Options var6 = this.a().options;
         if (var6 != null) {
            Options var4;
            label107: {
               label108: {
                  label109: {
                     label110: {
                        label111: {
                           label82: {
                              label101: {
                                 var4 = var6;
                                 var7 = var1.hashCode();
                                 label79:
                                 if (var3 != null) {
                                    switch ((Integer)(var7)) {
                                       case -1407259064:
                                          short var22 = 3801;
                                          var10002 = 27367;
                                          if (!var1.equals("attack")) {
                                             return;
                                          }
                                          break label108;
                                       case -895679974:
                                          short var20 = 3822;
                                          var10002 = 29381;
                                          if (!var1.equals("sprint")) {
                                             return;
                                          }
                                          break label109;
                                       case -677145915:
                                          short var13 = 3784;
                                          var10002 = -21197;
                                          if (!var1.equals("forward")) {
                                             return;
                                          }

                                          KeyMapping var14 = var4.keyUp;
                                          var10003 = 3813;
                                          short var10004 = -7708;
                                          Intrinsics.checkNotNullExpressionValue(var4.keyUp, "keyUp");
                                          this.a(var14, var2);
                                          if (var3 != null) {
                                             return;
                                          }
                                          break;
                                       case 116103:
                                           var12 = 3785;
                                          var10002 = -30682;
                                          if (!var1.equals("use")) {
                                             return;
                                          }
                                          break label107;
                                       case 3273774:
                                          short var11 = 3781;
                                          var10002 = -21919;
                                          if (!var1.equals("jump")) {
                                             return;
                                          }
                                          break label111;
                                       case 3317767:
                                          short var10 = 3831;
                                          var10002 = -7923;
                                          var7 = var1.equals("left");
                                          break label79;
                                       case 108511772:
                                          short var9 = 3787;
                                          var10002 = 14544;
                                          if (!var1.equals("right")) {
                                             return;
                                          }
                                          break label101;
                                       case 109582100:
                                          short var8 = 3820;
                                          var10002 = -26921;
                                          if (!var1.equals("sneak")) {
                                             return;
                                          }
                                          break label110;
                                       case 2121976803:
                                          short var10001 = 3807;
                                          var10002 = 26275;
                                          if (!var1.equals("backward")) {
                                             return;
                                          }
                                          break;
                                       default:
                                          return;
                                    }

                                    KeyMapping var15 = var4.keyDown;
                                    var10003 = 3828;
                                    short var43 = 9263;
                                    Intrinsics.checkNotNullExpressionValue(var4.keyDown, "keyDown");
                                    this.a(var15, var2);
                                    if (var3 != null) {
                                       return;
                                    }
                                    break label101;
                                 }

                                 if (((Boolean)(var7))) {
                                    return;
                                 }
                                 break label82;
                              }

                              KeyMapping var16 = var4.keyRight;
                              var10003 = 3776;
                              short var44 = 2789;
                              Intrinsics.checkNotNullExpressionValue(var4.keyRight, "keyRight");
                              this.a(var16, var2);
                              if (var3 != null) {
                                 return;
                              }
                           }

                           KeyMapping var17 = var4.keyLeft;
                           var10003 = 3795;
                           short var45 = 3377;
                           Intrinsics.checkNotNullExpressionValue(var4.keyLeft, "keyLeft");
                           this.a(var17, var2);
                           if (var3 != null) {
                              return;
                           }
                        }

                        KeyMapping var18 = var4.keyJump;
                        var10003 = 3789;
                        short var46 = 4103;
                        Intrinsics.checkNotNullExpressionValue(var4.keyJump, "keyJump");
                        this.a(var18, var2);
                        if (var3 != null) {
                           return;
                        }
                     }

                     KeyMapping var19 = var4.keyShift;
                     var10003 = 3811;
                     short var47 = 20439;
                     Intrinsics.checkNotNullExpressionValue(var4.keyShift, "keyShift");
                     this.a(var19, var2);
                     if (var3 != null) {
                        return;
                     }
                  }

                  KeyMapping var21 = var4.keySprint;
                  var10003 = 3799;
                  short var48 = -26830;
                  Intrinsics.checkNotNullExpressionValue(var4.keySprint, "keySprint");
                  this.a(var21, var2);
                  if (var3 != null) {
                     return;
                  }
               }

               KeyMapping var23 = var4.keyAttack;
               var10003 = 3780;
               short var49 = 29866;
               Intrinsics.checkNotNullExpressionValue(var4.keyAttack, "keyAttack");
               this.a(var23, var2);
               if (var3 != null) {
                  return;
               }
            }

            KeyMapping var24 = var4.keyUse;
            var10003 = 3783;
            short var50 = -14537;
            Intrinsics.checkNotNullExpressionValue(var4.keyUse, "keyUse");
            this.a(var24, var2);
            return;
         }
      }
   }

   public final boolean a(@NotNull String var1) { short var12 = (short)0; // PX-FIX hoist
        
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      short var10002 = 3815;
      short var10003 = 16158;
      Intrinsics.checkNotNullParameter(var1, "name");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      if (var2 != null) {
         Options var5 = this.a().options;
         if (var5 != null) {
            Options var3 = var5;
            int var6 = var1.hashCode();
            if (var2 != null) {
               switch (var6) {
                  case -1407259064:
                     short var14 = 3836;
                     var10002 = -29981;
                     byte var31 = ((byte)((var1.equals("attack")) ? 1 : 0));
                     if (var2 == null) {
                        return (var31 != 0);
                     }

                     if (var31 != 0) {
                        return var3.keyAttack.isDown();
                     }

                     return (0 != 0);
                  case -895679974:
                     short var13 = 3808;
                     var10002 = 21901;
                     byte var30 = ((byte)((var1.equals("sprint")) ? 1 : 0));
                     if (var2 == null) {
                        return (var30 != 0);
                     }

                     if (var30 != 0) {
                        return var3.keySprint.isDown();
                     }

                     return (0 != 0);
                  case -677145915:
                      var12 = 3788;
                     var10002 = 9419;
                     byte var29 = ((byte)((var1.equals("forward")) ? 1 : 0));
                     if (var2 == null) {
                        return (var29 != 0);
                     }

                     if (var29 != 0) {
                        return var3.keyUp.isDown();
                     }

                     return (0 != 0);
                  case 116103:
                     short var11 = 3824;
                     var10002 = -32187;
                     byte var28 = ((byte)((var1.equals("use")) ? 1 : 0));
                     if (var2 == null) {
                        return (var28 != 0);
                     }

                     if (var28 != 0) {
                        return var3.keyUse.isDown();
                     }

                     return (0 != 0);
                  case 3273774:
                     short var10 = 3816;
                     var10002 = 3139;
                     byte var27 = ((byte)((var1.equals("jump")) ? 1 : 0));
                     if (var2 == null) {
                        return (var27 != 0);
                     }

                     if (var27 != 0) {
                        return var3.keyJump.isDown();
                     }

                     return (0 != 0);
                  case 3317767:
                     short var9 = 3839;
                     var10002 = -30550;
                     var6 = ((var1.equals("left")) ? 1 : 0);
                     break;
                  case 108511772:
                     short var8 = 3777;
                     var10002 = -22588;
                     byte var26 = ((byte)((var1.equals("right")) ? 1 : 0));
                     if (var2 == null) {
                        return (var26 != 0);
                     }

                     if (var26 != 0) {
                        return var3.keyRight.isDown();
                     }

                     return (0 != 0);
                  case 109582100:
                     short var7 = 3820;
                     var10002 = -26921;
                     byte var25 = ((byte)((var1.equals("sneak")) ? 1 : 0));
                     if (var2 == null) {
                        return (var25 != 0);
                     }

                     if (var25 != 0) {
                        return var3.keyShift.isDown();
                     }

                     return (0 != 0);
                  case 2121976803:
                     short var10001 = 3830;
                     var10002 = 19895;
                     byte var24 = ((byte)((var1.equals("backward")) ? 1 : 0));
                     if (var2 == null) {
                        return (var24 != 0);
                     }

                     if (var24 != 0) {
                        return var3.keyDown.isDown();
                     }

                     return (0 != 0);
                  default:
                     return (0 != 0);
               }
            }

            if (var2 == null) {
               return (var6 != 0);
            }

            if (var6 != 0) {
               return var3.keyLeft.isDown();
            }

            return (0 != 0);
         }
      }

      return false;
   }

   public final void a(@NotNull Vec3 var1, boolean var2) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3;
      label27: {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
         short var10002 = 3837;
         short var10003 = 10794;
         Intrinsics.checkNotNullParameter(var1, "to");
         var3 = var10000;
         llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var10 = this;
         if (var3 != null) {
            this.p();
            if (!var2) {
               break label27;
            }

            var10 = this;
         }

         short var10001 = 3829;
         var10002 = -30654;
         var10.a("sneak", true);
      }

      Iterable var4 = me.octo.client.utils.player.pathfinder.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(var1);
      boolean var5 = false;

      for (Object var7 : var4) {
         String var8 = (String)var7;
         boolean var9 = false;
         IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var8, true);
         if (var3 != null && var3 != null) {
            continue;
         }
         break;
      }
   }

   public final boolean s() {
      return IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   }

   public final void g(boolean var1) {
      IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var1;
   }

   public final void a(@NotNull Vec3 var1, @NotNull Vec3 var2, boolean var3, double var4) {
      byte var35 = 0; // PX-FIX
      Object var34 = null; // PX-FIX
      Object var33 = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      short var10002 = 3798;
      short var10003 = 2805;
      Intrinsics.checkNotNullParameter(var1, "from");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var6 = var10000;
      short var10001 = 3823;
      var10002 = -14127;
      Intrinsics.checkNotNullParameter(var2, "to");
      if (var6 != null) {
         LocalPlayer var32 = this.a().player;
         if (var32 != null) {
            lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var8;
            Vec3 var9;
            label178: {
               LocalPlayer var7 = var32;
               var8 = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .o();
               var9 = IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var7);
               var33 = ((java.util.function.Supplier<Object>)(() -> { IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.a(100); return null; })).get();
               label177:
               if (var6 != null) {
                  if (!((Boolean)var33)) {
                     var33 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
                     if (var6 == null) {
                        break label177;
                     }

                     if (!IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) {
                        break label178;
                     }
                  }

                  llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var1;
                  var33 = false;
               }

               IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl =((Boolean)( var33));
            }

            double var11;
            List var19;
            boolean[] var20;
            double var21;
            label167: {
               label185: {
                  IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.f();
                  Vec3 var10 = me.octo.client.utils.lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a(llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI, var2, var9, false);
                  var11 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .c(var9, var10);
                  double var13 = var2.subtract(llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI).length();
                  double var15 = var10.subtract(llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI).length();
                  double var17 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .c(var9, var2);
                  var19 = var17 < 3.0
                     ? CollectionsKt.listOf(var2)
                     : me.octo.client.utils.lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.a(
                        me.octo.client.utils.lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                        llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI,
                        var2,
                        0.0,
                        var15 / var13,
                        4,
                        null);
                  var20 = new boolean[4];
                  var21 = Double.POSITIVE_INFINITY;
                  var34 = var3;
                  if (var6 != null) {
                     if (var3) {
                        break label185;
                     }

                     var34 = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .c(3);
                  }

                  if (var6 == null) {
                     break label167;
                  }

                  if (!((Boolean)var34)) {
                     var34 = 1;
                     break label167;
                  }
               }

               var34 = 0;
            }

            byte var23 =((Byte)( var34));
            Iterator var24 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.iterator();

            label155:
            while (true) {
               if (var24.hasNext()) {
                  boolean[] var25 = (boolean[])var24.next();
                  if (var6 == null) {
                     break;
                  }

                  var35 = var23;
                  label149:
                  if (var6 != null) {
                     if (var23 != 0) {
                        var35 = ((byte)((var25[2]) ? 1 : 0));
                        if (var6 == null) {
                           break label149;
                        }

                        if (var35 == 0) {
                           var35 = ((byte)((var25[3]) ? 1 : 0));
                           if (var6 == null) {
                              break label149;
                           }

                           if (var35 == 0 && var6 != null) {
                              continue;
                           }
                        }
                     }

                     double var52;
                     var35 = (byte)((var52 = ((byte)((var11 - var4 != 0.0) ? 1 : 0))) == (byte)((0.0 != 0) ? 0 : (var52 < 0.0 ? -1 : 1)) ? 1 : 0);
                  }

                  label188: {
                     if (var6 != null) {
                        if (var35 >= 0) {
                           break label188;
                        }

                        var35 = ((byte)((var25[2]) ? 1 : 0));
                     }

                     label137: {
                        if (var6 != null) {
                           if (var35 != 0) {
                              break label137;
                           }

                           var35 = ((byte)((var25[3]) ? 1 : 0));
                        }

                        if (var35 == 0) {
                           break label188;
                        }
                     }

                     if (var6 != null) {
                        continue;
                     }
                  }

                  float var26;
                  label189: {
                     var26 = var8.a();
                     boolean var36 = var25[0];
                     if (var6 != null) {
                        if (var36) {
                           boolean var37 = var25[2];
                           if (var6 != null) {
                              if (var37) {
                                 var26 -= 45.0F;
                              }

                              var37 = var25[3];
                           }

                           if (!var37) {
                              break label189;
                           }

                           var26 += 45.0F;
                           if (var6 != null) {
                              break label189;
                           }
                        }

                        var36 = var25[1];
                     }

                     if (var6 != null) {
                        if (var36) {
                           var26 -= 180.0F;
                           boolean var38 = var25[2];
                           if (var6 != null) {
                              if (var38) {
                                 var26 += 45.0F;
                              }

                              var38 = var25[3];
                           }

                           if (!var38) {
                              break label189;
                           }

                           var26 -= 45.0F;
                           if (var6 != null) {
                              break label189;
                           }
                        }

                        var36 = var25[2];
                     }

                     if (var6 != null) {
                        if (var36) {
                           var26 -= 90.0F;
                           if (var6 != null) {
                              break label189;
                           }
                        }

                        var36 = var25[3];
                     }

                     if (var36) {
                        var26 += 90.0F;
                     }
                  }

                  double var27 = 0.0;
                  Vec3 var39 = var9.add(
                     lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .d(var26)
                        .b()
                        .scale(10.0)
                  );
                  var10002 = 3790;
                  var10003 = 13285;
                  Intrinsics.checkNotNullExpressionValue(var39, "add(...)");
                  Vec3 var29 = var39;

                  for (Vec3 var31 : (List<Vec3>)var19) {
                     var27 += me.octo.client.utils.lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a(var9, var29, var31, false, true);
                     if (var6 == null) {
                        continue label155;
                     }

                     if (var6 == null) {
                        break;
                     }
                  }

                  double var40 = var27;
                  if (var6 != null) {
                     if (!(var27 < var21)) {
                        continue;
                     }

                     var20 = var25;
                     var40 = var27;
                  }

                  var21 = var40;
                  if (var6 != null) {
                     continue;
                  }
               }

               var10001 = 3784;
               var10002 = -21197;
               this.a("forward", var20[0]);
               var10001 = 3807;
               var10002 = 26275;
               this.a("backward", var20[1]);
               var10001 = 3831;
               var10002 = -7923;
               this.a("left", var20[2]);
               var10001 = 3787;
               var10002 = 14544;
               this.a("right", var20[3]);
               break;
            }

            return;
         }
      }
   }

   public final void a(@NotNull Vec3 var1, float var2) { LocalPlayer var12 = null; // PX-FIX hoist
        
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      short var10002 = 3823;
      short var10003 = -14127;
      Intrinsics.checkNotNullParameter(var1, "to");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = var10000;
      if (var3 != null) {
          var12 = this.a().player;
         if (var12 != null) {
            double var8 = var12.distanceToSqr(var1);
            boolean var10 = false;
            if (var3 != null && var8 < var2) {
               IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.p();
               return;
            }
         }
      }

      this.p();
      Iterable var4 = me.octo.client.utils.player.pathfinder.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(var1);
      boolean var5 = false;

      for (Object var7 : var4) {
         String var11 = (String)var7;
         boolean var9 = false;
         IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var11, true);
         if (var3 != null && var3 != null) {
            continue;
         }
         break;
      }
   }

   private final void a(KeyMapping var1, boolean var2) {
      var1.setDown(var2);
   }

   public final void t() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      this.r();
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var10000;
      if (var1 != null) {
         Options var3 = this.a().options;
         if (var3 != null) {
            Options var2 = var3;
            KeyMapping var10001 = var2.keySprint;
            short var10003 = 3819;
            short var10004 = 3648;
            Intrinsics.checkNotNullExpressionValue(var2.keySprint, "keySprint");
            this.a(var10001, false);
            var10001 = var2.keyUse;
            var10003 = 3812;
            var10004 = 24209;
            Intrinsics.checkNotNullExpressionValue(var2.keyUse, "keyUse");
            this.a(var10001, false);
            this.v();
            return;
         }
      }
   }

   public final void u() {
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .h()
         .q();
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .g()
         .q();
      lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
         .a()
         .j(false);
      lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
         .e()
         .j(false);
      lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
         .d()
         .j(false);
      lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
         .b()
         .j(false);
      lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
         .c()
         .j(false);
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .e()
         .k();
      llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl
         .a()
         .v();
   }

   public final void v() {
      IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .g();
      lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .g();
      llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .g();
      IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .g();
      IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .g();
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .h();
      lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .h();
      llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .k();
      lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .h();
      me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .j();
      lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .l();
   }

   public final void a(boolean var1, boolean var2, boolean var3, boolean var4) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var5 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      if (var5 != null) {
         Options var10000 = this.a().options;
         if (var10000 != null) {
            Options var6 = var10000;
            KeyMapping var10001 = var6.keyUp;
            short var10003 = 3778;
            short var10004 = -25435;
            Intrinsics.checkNotNullExpressionValue(var6.keyUp, "keyUp");
            this.a(var10001, var1);
            var10001 = var6.keyDown;
            var10003 = 3821;
            var10004 = -23056;
            Intrinsics.checkNotNullExpressionValue(var6.keyDown, "keyDown");
            this.a(var10001, var2);
            var10001 = var6.keyLeft;
            var10003 = 3802;
            var10004 = -17934;
            Intrinsics.checkNotNullExpressionValue(var6.keyLeft, "keyLeft");
            this.a(var10001, var3);
            var10001 = var6.keyRight;
            var10003 = 3826;
            var10004 = 11220;
            Intrinsics.checkNotNullExpressionValue(var6.keyRight, "keyRight");
            this.a(var10001, var4);
            return;
         }
      }
   }

   public final boolean w() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      short var10001 = 3784;
      short var10002 = -21197;
      boolean var10000 = this.a("forward");
      if (var1 != null) {
         if (!var10000) {
            var10001 = 3807;
            var10002 = 26275;
            var10000 = this.a("backward");
            if (var1 == null) {
               return var10000;
            }

            if (!var10000) {
               var10001 = 3831;
               var10002 = -7923;
               var10000 = this.a("left");
               if (var1 == null) {
                  return var10000;
               }

               if (!var10000) {
                  var10001 = 3787;
                  var10002 = 14544;
                  var10000 = this.a("right");
                  if (var1 == null) {
                     return var10000;
                  }

                  if (!var10000) {
                     return false;
                  }
               }
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   public final boolean x() {
      int var39 = 0; // PX-FIX
      int var29 = 0; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      LocalPlayer var10001 = this.a().player;
      Intrinsics.checkNotNull(var10001);
      BlockPos var28 = BlockPos.containing(
         IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var10001).add(0.0, -0.1, 0.0)
      );
      short var10003 = 3803;
      short var10004 = 10326;
      Intrinsics.checkNotNullExpressionValue(var28, "containing(...)");
      BlockPos var2 = var28;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var10000;
      Minecraft var18 = this.a();
      if (var1 != null) {
         ClientLevel var19 = var18.level;
         Intrinsics.checkNotNull(var18.level);
         if (!var19.getBlockState(var2).isAir()) {
            return false;
         }

         var18 = this.a();
      }

      LocalPlayer var20 = var18.player;
      Intrinsics.checkNotNull(var18.player);
      AABB var21 = var20.getBoundingBox().inflate(0.1, 0.1, 0.1);
      short var10002 = 3804;
      var10003 = -5301;
      Intrinsics.checkNotNullExpressionValue(var21, "inflate(...)");
      AABB var3 = var21;
      int var4 = (int)Math.floor(var3.minX);
      int var5 = (int)Math.ceil(var3.maxX);
      int var22 = var4;
      if (var1 != null) {
         if (var4 <= var5) {
            do {
               label122: {
                  int var6 = (int)Math.floor(var3.minY);
                  int var7 = (int)Math.floor(var3.maxY);
                  if (var6 <= var7) {
                     do {
                        int var8 = (int)Math.floor(var3.minZ);
                        int var9 = (int)Math.ceil(var3.maxZ);
                        var39 = var8;
                        var29 = var9;
                        if (var1 == null) {
                           break label122;
                        }

                        label102: {
                           label123: {
                              if (var8 <= var9) {
                                 do {
                                    BlockPos var10 = new BlockPos(var4, var6, var8);
                                    ClientLevel var23 = this.a().level;
                                    Intrinsics.checkNotNull(var23);
                                    BlockState var24 = var23.getBlockState(var10);
                                    var10002 = 3792;
                                    var10003 = 20195;
                                    Intrinsics.checkNotNullExpressionValue(var24, "getBlockState(...)");
                                    BlockState var11 = var24;
                                    var39 = ((var11.isAir()) ? 1 : 0);
                                    if (var1 == null) {
                                       break label123;
                                    }

                                    label96: { double var12 = 0.0; // PX-FIX hoist
        
                                       if ((var39 != 0)) {
                                          var39 = ((var11.isSolidRender()) ? 1 : 0);
                                          if (var1 == null || var1 == null) {
                                             break label96;
                                          }

                                          if ((var39 == 0)) {
                                              var12 = 0.15;
                                             double var25 = var10.getX();
                                             var10001 = this.a().player;
                                             Intrinsics.checkNotNull(var10001);
                                             double var14 = var25 - var10001.getX();
                                             double var26 = var10.getZ();
                                             var10001 = this.a().player;
                                             Intrinsics.checkNotNull(var10001);
                                             double var16 = var26 - var10001.getZ();
                                             double var35;
                                             int var27 = (var35 = var14 - var12) == 0.0 ? 0 : (var35 < 0.0 ? -1 : 1);
                                             if (var1 != null) {
                                                if (var27 >= 0) {
                                                   double var36;
                                                   int var40 = (var36 = var14 - (1 - var12)) == 0.0 ? 0 : (var36 < 0.0 ? -1 : 1);
                                                   if (var1 == null) {
                                                      return (var40 != 0);
                                                   }

                                                   if (var40 <= 0) {
                                                      double var37;
                                                      int var41 = (var37 = var16 - var12) == 0.0 ? 0 : (var37 < 0.0 ? -1 : 1);
                                                      if (var1 == null) {
                                                         return (var41 != 0);
                                                      }

                                                      if (var41 >= 0) {
                                                         double var38;
                                                         int var42 = (var38 = var16 - (1 - var12)) == 0.0 ? 0 : (var38 < 0.0 ? -1 : 1);
                                                         if (var1 == null) {
                                                            return (var42 != 0);
                                                         }

                                                         if (var42 <= 0) {
                                                            return (0 != 0);
                                                         }
                                                      }
                                                   }
                                                }

                                                var27 = 1;
                                             }

                                             return (var27 != 0);
                                          }
                                       }

                                       var39 = var8;
                                    }

                                    var29 = var9;
                                    if (var1 == null) {
                                       break label102;
                                    }

                                    if (var39 ==( ((var9 == 0)) ? 1 : 0)) {
                                       break;
                                    }

                                    var8++;
                                 } while (var1 != null);
                              }

                              var39 = var6;
                           }

                           var29 = var7;
                        }

                        if (var1 == null) {
                           break label122;
                        }

                        if (var39 == var29) {
                           break;
                        }

                        var6++;
                     } while (var1 != null);
                  }

                  var39 = var4;
                  if (var1 == null) {
                     return (var4 != 0);
                  }

                  var29 = var5;
               }

               if (var39 == var29) {
                  break;
               }

               var4++;
            } while (var1 != null);
         }

         var22 = 0;
      }

      return (var22 != 0);
   }

   public final boolean y() { short var12 = (short)0; // PX-FIX hoist
        
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      LocalPlayer var10001 = this.a().player;
      Intrinsics.checkNotNull(var10001);
      BlockPos var9 = BlockPos.containing(IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var10001).add(0.0, -0.1, 0.0));
      LocalPlayer var10002 = this.a().player;
      Intrinsics.checkNotNull(var10002);
      BlockPos var10 = var9.relative(var10002.getDirection(), 1);
      short var10003 = 3791;
      short var10004 = 20180;
      Intrinsics.checkNotNullExpressionValue(var10, "relative(...)");
      BlockPos var2 = var10;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var10000;
      ClientLevel var5 = this.a().level;
      Intrinsics.checkNotNull(var5);
      BlockState var6 = var5.getBlockState(var2);
      short var11 = 3800;
      var10003 = 8104;
      Intrinsics.checkNotNullExpressionValue(var6, "getBlockState(...)");
      BlockState var3 = var6;
      Block var7 = var3.getBlock();
       var12 = 3818;
      var10003 = -14763;
      Intrinsics.checkNotNullExpressionValue(var7, "getBlock(...)");
      Block var4 = var7;
      boolean var8 = var3.isAir();
      if (var1 != null) {
         if (!var8) {
            boolean var15 = Intrinsics.areEqual(var4, Blocks.CHEST);
            if (var1 == null) {
               return var15;
            }

            if (!var15) {
               boolean var16 = Intrinsics.areEqual(var4, Blocks.TRAPPED_CHEST);
               if (var1 == null) {
                  return var16;
               }

               if (!var16) {
                  boolean var17 = var3.getFluidState().isEmpty();
                  if (var1 == null) {
                     return var17;
                  }

                  if (var17) {
                     return false;
                  }
               }
            }
         }

         var8 = true;
      }

      return var8;
   }

   public final void a(@NotNull BlockPos var1) { int var12 = 0; // PX-FIX hoist
        
      byte var20 = 0; // PX-FIX
      short var10001 = 3786;
      int var10002 = -30250;
      Intrinsics.checkNotNullParameter(var1, "pos");
      Vec3 var3 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .d(var1);
      LocalPlayer var10000 = this.a().player;
      Intrinsics.checkNotNull(var10000);
      Vec3 var17 = var10000.getEyePosition();
      var10002 = (short)3794;
      short var10003 = -18251;
      Intrinsics.checkNotNullExpressionValue(var17, "getEyePosition(...)");
      Vec3 var4 = var17;
      lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI var5 = new lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI(
         lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(var3)
            .a()
      );
      double var6 = 0.3;
      int var8 = 0;
      Vec3 var9 = var4;
      Vec3 var10 = new Vec3(var5.c().x * var6, 0.0, var5.c().z * var6);
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var18 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      byte var11 = 0;
       var12 = 0;
      Vec3 var13 = var4;
      Vec3 var14 = new Vec3(var5.d().x * var6, 0.0, var5.d().z * var6);
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var18;
      byte var15 = 0;
      int var16 = 0;

      while (true) {
         label104:
         if (var16 < 31) {
            Vec3 var19 = var9.add(var10);
            var10002 = (short)3806;
            var10003 = 16203;
            Intrinsics.checkNotNullExpressionValue(var19, "add(...)");
            var9 = var19;
            if (var2 == null) {
               break;
            }

            label101: {
               label112: {
                  label113: {
                     var20 = var11;
                     if (var2 != null) {
                        if (var11 == 0) {
                           break label113;
                        }

                        var20 =(byte)( var16);
                     }

                     if (var2 == null) {
                        break label101;
                     }

                     if (var20 > 10) {
                        break label112;
                     }
                  }

                  if (llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a(var1, var9)
                     != null) {
                     var8++;
                     if (var2 != null) {
                        break label112;
                     }
                  }

                  me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI var21 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                  BlockPos var24 = BlockPos.containing(var9);
                  var10003 = 3793;
                  short var10004 = 5930;
                  Intrinsics.checkNotNullExpressionValue(var24, "containing(...)");
                  var20 = ((byte)((Intrinsics.areEqual(var21.j(var24), Blocks.AIR)) ? 1 : 0));
                  if (var2 == null) {
                     break label101;
                  }

                  if (var20 == 0) {
                     var11 = 1;
                  }
               }

               Vec3 var22 = var13.add(var14);
               var10002 = (short)3790;
               var10003 = 13285;
               Intrinsics.checkNotNullExpressionValue(var22, "add(...)");
               var13 = var22;
               var20 = var15;
            }

            label82: {
               label114: {
                  label115: {
                     if (var2 != null) {
                        if (var20 == 0) {
                           break label115;
                        }

                        var20 =(byte)( var16);
                     }

                     if (var2 == null) {
                        break label82;
                     }

                     if (var20 > 10) {
                        break label114;
                     }
                  }

                  if (llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a(var1, var13)
                     != null) {
                     var12++;
                     if (var2 != null) {
                        break label114;
                     }
                  }

                  me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI var23 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                  BlockPos var25 = BlockPos.containing(var13);
                  var10003 = 3793;
                  short var39 = 5930;
                  Intrinsics.checkNotNullExpressionValue(var25, "containing(...)");
                  var20 = ((byte)((Intrinsics.areEqual(var23.j(var25), Blocks.AIR)) ? 1 : 0));
                  if (var2 == null) {
                     break label82;
                  }

                  if (var20 == 0) {
                     var15 = 1;
                  }
               }

               var20 = var11;
            }

            label63: {
               if (var2 != null) {
                  if (var20 == 0) {
                     break label63;
                  }

                  var20 = var15;
               }

               if (var20 != 0) {
                  break label104;
               }
            }

            var16++;
            if (var2 != null) {
               continue;
            }
         }

         var10001 = 3831;
         var10002 = (short)-7923;
         var10002 = var8;
         if (var2 != null) {
            var10002 = var8 > var12 ? 1 : 0;
         }

         this.a("left", (var10002 != 0));
         break;
      }

      var10001 = 3787;
      int var33 = 14544;
      var33 = var8;
      if (var2 != null) {
         var33 = var8 <= var12 ? 1 : 0;
      }

      this.a("right", (var33 != 0));
   }

   public final void b(@NotNull Vec3 var1, @NotNull Vec3 var2, boolean var3, double var4) {
      Object var27 = null; // PX-FIX
      Object var25 = null; // PX-FIX
      Object var23 = null; // PX-FIX
      Object var21 = null; // PX-FIX
      short var10001 = 3782;
      int var10002 = 24574;
      Intrinsics.checkNotNullParameter(var1, "from");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      var10002 = (short)3823;
      short var10003 = -14127;
      Intrinsics.checkNotNullParameter(var2, "to");
      float var7 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(var1, var2)
         .a();
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var6 = var10000;
      double var11 = var7;
      int var13 = 0;
      Vec3 var8 = new Vec3(
         Math.sin(
            IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .d(var11 + 180.0)
         ),
         0.0,
         -Math.cos(
            IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .d(var11 + 180.0)
         )
      );
      IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var18 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      LocalPlayer var30 = this.a().player;
      Intrinsics.checkNotNull(var30);
      double var9 = var18.a(IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var30), var2, var8, true);
      int var19 =(( var3) ? 1 : 0);
      if (var6 != null) {
         if (!var3) {
            var10001 = 3781;
            var10002 = (short)-21919;
            this.a("jump", llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI);
         }

         this.p();
         double var70;
         var19 = (var70 = var9 - 1.5) == 0.0 ? 0 : (var70 < 0.0 ? -1 : 1);
      }

      label206:
      if (var6 != null) {
         if (var19 >= 0) {
            LocalPlayer var20 = this.a().player;
            Intrinsics.checkNotNull(var20);
            var19 = ((var20.onGround()) ? 1 : 0);
            if (var6 == null) {
               break label206;
            }

            if (var19 != 0) {
               var19 = 0;
               break label206;
            }
         }

         var19 = 1;
      }

      int var12;
      var12 = var19;
      double var71;
      var21 = (var71 = var9 - var4) == 0.0 ? 0 : (var71 < 0.0 ? -1 : 1);
      label198:
      if (var6 != null) {
         if (((Boolean)var21)) {
            LocalPlayer var22 = this.a().player;
            Intrinsics.checkNotNull(var22);
            var21 = var22.onGround();
            if (var6 == null) {
               break label198;
            }

            if (!((Boolean)var21)) {
               var21 = 0;
               break label198;
            }
         }

         var21 = 1;
      }

      float var14;
      float var15;
      label190: {
         var13 =((Integer)( var21));
         var14 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .c(var2)
            .a();
         var15 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(var2, var7, 0.0F)
            .a();
         float var72;
         var23 = (var72 = -45.0F - var14) == 0.0F ? 0 : (var72 < 0.0F ? -1 : 1);
         if (var6 != null) {
            if (((Boolean)var23)) {
               var23 = 0;
               break label190;
            }

            float var73;
            var23 = (var73 = var14 - 45.0F) == 0.0F ? 0 : (var73 < 0.0F ? -1 : 1);
         }

         if (var6 != null) {
            var23 = ((Boolean)var23) ? 1 : 0;
         }
      }

      if (!((Boolean)var23)) {
         llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var24 = this;
         var10001 = 3784;
         var10002 = (short)-21197;
         String var33 = "forward";
         var10002 = var12;
         if (var6 != null) {
            this.a("forward", (var12 != 0));
            if (var13 != 0) {
               return;
            }

            var24 = this;
            var10001 = 3831;
            short var52 = -7923;
            var33 = "left";
            float var74;
            var10002 = (var74 = var15 - 0.0F) == 0.0F ? 0 : (var74 < 0.0F ? -1 : 1);
         }

         if (var6 != null) {
            var10002 = var10002 < 0 ? 1 : 0;
         }

         var24.a(var33, (var10002 != 0));
         var10001 = 3787;
         int var53 = 14544;
         float var75;
         var53 = (var75 = var15 - 0.0F) == 0.0F ? 0 : (var75 < 0.0F ? -1 : 1);
         if (var6 != null) {
            var53 = var53 > 0 ? 1 : 0;
         }

         this.a("right", (var53 != 0));
         if (var6 != null) {
            return;
         }

         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[1]
         );
      }

      label171: {
         float var76;
         var25 = (var76 = 45.0F - var14) == 0.0F ? 0 : (var76 < 0.0F ? -1 : 1);
         if (var6 != null) {
            if (((Boolean)var25)) {
               var25 = 0;
               break label171;
            }

            float var77;
            var25 = (var77 = var14 - 135.0F) == 0.0F ? 0 : (var77 < 0.0F ? -1 : 1);
         }

         if (var6 != null) {
            var25 = ((Boolean)var25) ? 1 : 0;
         }
      }

      if (!((Boolean)var25)) {
         llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var26 = this;
         var10001 = 3787;
         int var55 = 14544;
         String var37 = "right";
         var55 = var12;
         if (var6 != null) {
            this.a("right", (var12 != 0));
            if (var13 != 0) {
               return;
            }

            var26 = this;
            var10001 = 3784;
            short var57 = -21197;
            var37 = "forward";
            float var78;
            var55 = (var78 = var15 - 0.0F) == 0.0F ? 0 : (var78 < 0.0F ? -1 : 1);
         }

         if (var6 != null) {
            var55 = var55 < 0 ? 1 : 0;
         }

         var26.a(var37, (var55 != 0));
         var10001 = 3807;
         int var58 = 26275;
         float var79;
         var58 = (var79 = var15 - 0.0F) == 0.0F ? 0 : (var79 < 0.0F ? -1 : 1);
         if (var6 != null) {
            var58 = var58 > 0 ? 1 : 0;
         }

         this.a("backward", (var58 != 0));
         if (var6 != null) {
            return;
         }
      }

      label154: {
         float var80;
         var27 = (var80 = -135.0F - var14) == 0.0F ? 0 : (var80 < 0.0F ? -1 : 1);
         if (var6 != null) {
            if (((Boolean)var27)) {
               var27 = 0;
               break label154;
            }

            float var81;
            var27 = (var81 = var14 - -45.0F) == 0.0F ? 0 : (var81 < 0.0F ? -1 : 1);
         }

         if (var6 != null) {
            var27 = ((Boolean)var27) ? 1 : 0;
         }
      }

      if (!((Boolean)var27)) {
         llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var28 = this;
         var10001 = 3831;
         int var60 = -7923;
         String var41 = "left";
         var60 = var12;
         if (var6 != null) {
            this.a("left", (var12 != 0));
            if (var13 != 0) {
               return;
            }

            var28 = this;
            var10001 = 3784;
            short var62 = -21197;
            var41 = "forward";
            float var82;
            var60 = (var82 = var15 - 0.0F) == 0.0F ? 0 : (var82 < 0.0F ? -1 : 1);
         }

         if (var6 != null) {
            var60 = var60 > 0 ? 1 : 0;
         }

         var28.a(var41, (var60 != 0));
         var10001 = 3807;
         int var63 = 26275;
         float var83;
         var63 = (var83 = var15 - 0.0F) == 0.0F ? 0 : (var83 < 0.0F ? -1 : 1);
         if (var6 != null) {
            var63 = var63 < 0 ? 1 : 0;
         }

         this.a("backward", (var63 != 0));
         if (var6 != null) {
            return;
         }
      }

      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var29 = this;
      var10001 = 3807;
      int var65 = 26275;
      String var45 = "backward";
      var65 = var12;
      if (var6 != null) {
         this.a("backward", (var12 != 0));
         if (var13 != 0) {
            return;
         }

         var29 = this;
         var10001 = 3831;
         short var67 = -7923;
         var45 = "left";
         float var84;
         var65 = (var84 = var15 - 0.0F) == 0.0F ? 0 : (var84 < 0.0F ? -1 : 1);
      }

      if (var6 != null) {
         var65 = var65 > 0 ? 1 : 0;
      }

      var29.a(var45, (var65 != 0));
      var10001 = 3787;
      int var68 = 14544;
      float var85;
      var68 = (var85 = var15 - 0.0F) == 0.0F ? 0 : (var85 < 0.0F ? -1 : 1);
      if (var6 != null) {
         var68 = var68 < 0 ? 1 : 0;
      }

      this.a("right", (var68 != 0));
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var30 = null; // PX-FIX
      String[] var5 = new String[60];
      int var3 = 0;
      String var2 = "¤\u008c-m\t»\u0011ûý\u009bO\u0086í\u001c\u0006-\u00ad)~Æ¸\u0004ö=è¡\u0005þ¸wl×\b®¹YûÒí\u0018ß\u0007ºÂÛ\u008c\u009e\u0012\u0016\u0005>GK#\u0089\u0007Ü³\u0017¢\u0007×%\u0007\b\u0006*bÞJ\u009c\r¢A÷×\u00ad3WÚ\u0090OFêç\ba¬ö\u0002Þ®p\u008a\u0003NØ\u0084\u0007:÷l\\\u0016\u008d\u0085\u0005ä94\\¿\u0003&°:$<\u0000¶æR\u001aì\u0090ei2\u0014\u0087\u0094´³æI ×Úi½ä\u008cä'C¢Ûn-'®ÆÝ\u0005£\u000fóµ\u0088\t\u0087\u0092|\u009foU\u0094eH\u000443°`\u000f5z4î\u0082£\u001dÄ\u0084HLjgæ³\u0012a\u0082 \u008cT\u0019fWzk@%Í\u0018ÃêNÈ\u0007ºîÛ\u000f\u008e¯\u0002\u0013s\fbZ\t.IþêÇc\u0013\u0014&µ£FæÌ\n6ÁI\fÇ¥q*\u0001t\fhqÜ¶\u0096®\u0094\u009a\u009f£ap\b»\u000bÉ\u0010\u0087\u0088u¥\bªÍ\u008f.ñ+\u0095:\u0006¢4\u009eJ\u008c\u0082\u00123øjÃ\u001dðOj_ÌäÑY\u0086Q9\u001c²\u000f2\u0092Ôó\u009e\u0000\u009e°ôÆB»¦Ü\u008b\u0007ÿÈsË\u009b7 \u0005'Jh\u0082í\u0006¹\u001c»H\u0094~\u0004Õ\u008b\u0087\u000e\u0011ÒsV½\u0099Ú¶H\u00115CÚ\u0091\u0006¬ï¤\u0005D\u0090×\u0093\u0081\u0006ìÙ\u0001{´²\b\u0003ëì°e«ÁØ\bÎ*U\u0088R¬'8\u0007\u0005 ,Îz\u008fÍ\u0005aA§½\u0090\u0002£Ï\u0006þìCÝüf\u0004û\u001cÏv\u0004ðØ§ç\t:\u009cË^\u0099mJb\u0093\r×Zö\u0097\u008ez=;j¼\u0019\u0094\f\u0005 \u0099\u009f¦\u0097\u0007ÊµÕlEÛ*\u0004}&Û.\bÞ5e×\u0012pÇº\u0004Ý \u0086{\u0003¿\u0082º\nÞüT«dQ\u0005´\u008f§\bm¶!\u001aÝÑùX\u0002Ã¦\u0006\u0092@\u0098ÄLS";
      int var4 = "¤\u008c-m\t»\u0011ûý\u009bO\u0086í\u001c\u0006-\u00ad)~Æ¸\u0004ö=è¡\u0005þ¸wl×\b®¹YûÒí\u0018ß\u0007ºÂÛ\u008c\u009e\u0012\u0016\u0005>GK#\u0089\u0007Ü³\u0017¢\u0007×%\u0007\b\u0006*bÞJ\u009c\r¢A÷×\u00ad3WÚ\u0090OFêç\ba¬ö\u0002Þ®p\u008a\u0003NØ\u0084\u0007:÷l\\\u0016\u008d\u0085\u0005ä94\\¿\u0003&°:$<\u0000¶æR\u001aì\u0090ei2\u0014\u0087\u0094´³æI ×Úi½ä\u008cä'C¢Ûn-'®ÆÝ\u0005£\u000fóµ\u0088\t\u0087\u0092|\u009foU\u0094eH\u000443°`\u000f5z4î\u0082£\u001dÄ\u0084HLjgæ³\u0012a\u0082 \u008cT\u0019fWzk@%Í\u0018ÃêNÈ\u0007ºîÛ\u000f\u008e¯\u0002\u0013s\fbZ\t.IþêÇc\u0013\u0014&µ£FæÌ\n6ÁI\fÇ¥q*\u0001t\fhqÜ¶\u0096®\u0094\u009a\u009f£ap\b»\u000bÉ\u0010\u0087\u0088u¥\bªÍ\u008f.ñ+\u0095:\u0006¢4\u009eJ\u008c\u0082\u00123øjÃ\u001dðOj_ÌäÑY\u0086Q9\u001c²\u000f2\u0092Ôó\u009e\u0000\u009e°ôÆB»¦Ü\u008b\u0007ÿÈsË\u009b7 \u0005'Jh\u0082í\u0006¹\u001c»H\u0094~\u0004Õ\u008b\u0087\u000e\u0011ÒsV½\u0099Ú¶H\u00115CÚ\u0091\u0006¬ï¤\u0005D\u0090×\u0093\u0081\u0006ìÙ\u0001{´²\b\u0003ëì°e«ÁØ\bÎ*U\u0088R¬'8\u0007\u0005 ,Îz\u008fÍ\u0005aA§½\u0090\u0002£Ï\u0006þìCÝüf\u0004û\u001cÏv\u0004ðØ§ç\t:\u009cË^\u0099mJb\u0093\r×Zö\u0097\u008ez=;j¼\u0019\u0094\f\u0005 \u0099\u009f¦\u0097\u0007ÊµÕlEÛ*\u0004}&Û.\bÞ5e×\u0012pÇº\u0004Ý \u0086{\u0003¿\u0082º\nÞüT«dQ\u0005´\u008f§\bm¶!\u001aÝÑùX\u0002Ã¦\u0006\u0092@\u0098ÄLS"
         .length();
      b((lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[])null);
      char var1 = 4;
      int var10 = -1;

      label52:
      while (true) {
         byte var10000 = 120;
         String var10001 = var2.substring(++var10, var10 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var35 = var10001.toCharArray();
               int var10004 = var35.length;
               int var6 = 0;
               byte var38 = var10000;
               var30 = var35;
               int var24 = var10004;
               byte var44;
               char[] var48;
               int var10006;
               if (var10004 <= 1) {
                  var48 = var35;
                  var44 = var10000;
                  var10006 = var6;
               } else {
                  var38 = var10000;
                  var24 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var48 = var35;
                  var44 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var48[var10006] = (char)(var48[var10006] ^ var44 ^ switch (var6 % 7) {
                     case 0 -> 4;
                     case 1 -> 122;
                     case 2 -> 4;
                     case 3 -> 111;
                     case 4 -> 49;
                     case 5 -> 119;
                     default -> 63;
                  });
                  var6++;
                  if (var38 == 0) {
                     var10006 = var38;
                     var48 = var30;
                     var44 = var38;
                  } else {
                     if (var24 <= var6) {
                        break;
                     }

                     var48 = var30;
                     var44 = var38;
                     var10006 = var6;
                  }
               }
            }

            String var40 = new String(var30).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var40;
                  if ((var10 += var1) >= var4) {
                     c = var5;
                     d = new String[60];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl();
                     boolean[][] var7 = new boolean[8][];
                     boolean[] var8 = new boolean[]{true, false, false, false};
                     var7[0] = var8;
                     var8 = new boolean[]{false, true, false, false};
                     var7[1] = var8;
                     var8 = new boolean[]{false, false, true, false};
                     var7[2] = var8;
                     var8 = new boolean[]{false, false, false, true};
                     var7[3] = var8;
                     var8 = new boolean[]{true, false, true, false};
                     var7[4] = var8;
                     var8 = new boolean[]{true, false, false, true};
                     var7[5] = var8;
                     var8 = new boolean[]{false, true, true, false};
                     var7[6] = var8;
                     var8 = new boolean[]{false, true, false, true};
                     var7[7] = var8;
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = CollectionsKt.listOf(var7);
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = -1;
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = true;
                     Vec3 var19 = Vec3.ZERO;
                     var10002 = 3817;
                     short var41 = 11952;
                     Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
                     llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var19;
                     IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var10);
                  break;
               default:
                  var5[var3++] = var40;
                  if ((var10 += var1) < var4) {
                     var1 = var2.charAt(var10);
                     continue label52;
                  }

                  var2 = "\u0017B\u009a®\t\u0010L\u0082Z¸·îþ\u001d";
                  var4 = "\u0017B\u009a®\t\u0010L\u0082Z¸·îþ\u001d".length();
                  var1 = 4;
                  var10 = -1;
            }

            var10000 = 81;
            var10001 = var2.substring(++var10, var10 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   public static void b(String var0) {
      IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var0;
   }

   public static String z() {
      return IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 3781) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 43;
            case 1 -> 160;
            case 2 -> 197;
            case 3 -> 76;
            case 4 -> 159;
            case 5 -> 101;
            case 6 -> 239;
            case 7 -> 49;
            case 8 -> 219;
            case 9 -> 191;
            case 10 -> 103;
            case 11 -> 250;
            case 12 -> 21;
            case 13 -> 99;
            case 14 -> 186;
            case 15 -> 77;
            case 16 -> 70;
            case 17 -> 90;
            case 18 -> 156;
            case 19 -> 1;
            case 20 -> 206;
            case 21 -> 198;
            case 22 -> 16;
            case 23 -> 65;
            case 24 -> 31;
            case 25 -> 228;
            case 26 -> 14;
            case 27 -> 252;
            case 28 -> 58;
            case 29 -> 105;
            case 30 -> 134;
            case 31 -> 181;
            case 32 -> 91;
            case 33 -> 73;
            case 34 -> 157;
            case 35 -> 174;
            case 36 -> 78;
            case 37 -> 208;
            case 38 -> 97;
            case 39 -> 29;
            case 40 -> 189;
            case 41 -> 142;
            case 42 -> 238;
            case 43 -> 127;
            case 44 -> 121;
            case 45 -> 177;
            case 46 -> 52;
            case 47 -> 42;
            case 48 -> 141;
            case 49 -> 96;
            case 50 -> 223;
            case 51 -> 72;
            case 52 -> 66;
            case 53 -> 150;
            case 54 -> 108;
            case 55 -> 244;
            case 56 -> 25;
            case 57 -> 81;
            case 58 -> 46;
            case 59 -> 54;
            case 60 -> 114;
            case 61 -> 204;
            case 62 -> 109;
            case 63 -> 110;
            case 64 -> 236;
            case 65 -> 85;
            case 66 -> 124;
            case 67 -> 118;
            case 68 -> 45;
            case 69 -> 237;
            case 70 -> 19;
            case 71 -> 217;
            case 72 -> 199;
            case 73 -> 0;
            case 74 -> 88;
            case 75 -> 209;
            case 76 -> 7;
            case 77 -> 94;
            case 78 -> 41;
            case 79 -> 128;
            case 80 -> 20;
            case 81 -> 253;
            case 82 -> 2;
            case 83 -> 123;
            case 84 -> 146;
            case 85 -> 39;
            case 86 -> 36;
            case 87 -> 115;
            case 88 -> 243;
            case 89 -> 176;
            case 90 -> 172;
            case 91 -> 180;
            case 92 -> 203;
            case 93 -> 62;
            case 94 -> 194;
            case 95 -> 12;
            case 96 -> 144;
            case 97 -> 53;
            case 98 -> 213;
            case 99 -> 34;
            case 100 -> 111;
            case 101 -> 35;
            case 102 -> 51;
            case 103 -> 231;
            case 104 -> 64;
            case 105 -> 241;
            case 106 -> 202;
            case 107 -> 129;
            case 108 -> 98;
            case 109 -> 11;
            case 110 -> 28;
            case 111 -> 133;
            case 112 -> 126;
            case 113 -> 5;
            case 114 -> 205;
            case 115 -> 153;
            case 116 -> 185;
            case 117 -> 225;
            case 118 -> 136;
            case 119 -> 48;
            case 120 -> 218;
            case 121 -> 222;
            case 122 -> 207;
            case 123 -> 188;
            case 124 -> 214;
            case 125 -> 210;
            case 126 -> 122;
            case 127 -> 195;
            case 128 -> 120;
            case 129 -> 117;
            case 130 -> 212;
            case 131 -> 10;
            case 132 -> 89;
            case 133 -> 119;
            case 134 -> 74;
            case 135 -> 211;
            case 136 -> 234;
            case 137 -> 158;
            case 138 -> 18;
            case 139 -> 192;
            case 140 -> 93;
            case 141 -> 171;
            case 142 -> 246;
            case 143 -> 164;
            case 144 -> 170;
            case 145 -> 179;
            case 146 -> 151;
            case 147 -> 161;
            case 148 -> 83;
            case 149 -> 104;
            case 150 -> 248;
            case 151 -> 33;
            case 152 -> 230;
            case 153 -> 112;
            case 154 -> 154;
            case 155 -> 100;
            case 156 -> 221;
            case 157 -> 235;
            case 158 -> 130;
            case 159 -> 200;
            case 160 -> 60;
            case 161 -> 135;
            case 162 -> 247;
            case 163 -> 4;
            case 164 -> 3;
            case 165 -> 30;
            case 166 -> 224;
            case 167 -> 232;
            case 168 -> 215;
            case 169 -> 87;
            case 170 -> 107;
            case 171 -> 137;
            case 172 -> 8;
            case 173 -> 47;
            case 174 -> 92;
            case 175 -> 190;
            case 176 -> 251;
            case 177 -> 50;
            case 178 -> 187;
            case 179 -> 220;
            case 180 -> 245;
            case 181 -> 26;
            case 182 -> 82;
            case 183 -> 149;
            case 184 -> 80;
            case 185 -> 125;
            case 186 -> 152;
            case 187 -> 59;
            case 188 -> 113;
            case 189 -> 56;
            case 190 -> 249;
            case 191 -> 95;
            case 192 -> 24;
            case 193 -> 75;
            case 194 -> 169;
            case 195 -> 143;
            case 196 -> 23;
            case 197 -> 227;
            case 198 -> 132;
            case 199 -> 254;
            case 200 -> 79;
            case 201 -> 139;
            case 202 -> 86;
            case 203 -> 22;
            case 204 -> 32;
            case 205 -> 102;
            case 206 -> 145;
            case 207 -> 17;
            case 208 -> 201;
            case 209 -> 178;
            case 210 -> 44;
            case 211 -> 68;
            case 212 -> 63;
            case 213 -> 233;
            case 214 -> 148;
            case 215 -> 168;
            case 216 -> 175;
            case 217 -> 242;
            case 218 -> 167;
            case 219 -> 37;
            case 220 -> 147;
            case 221 -> 165;
            case 222 -> 40;
            case 223 -> 38;
            case 224 -> 193;
            case 225 -> 184;
            case 226 -> 196;
            case 227 -> 229;
            case 228 -> 183;
            case 229 -> 69;
            case 230 -> 9;
            case 231 -> 116;
            case 232 -> 71;
            case 233 -> 67;
            case 234 -> 138;
            case 235 -> 140;
            case 236 -> 226;
            case 237 -> 61;
            case 238 -> 84;
            case 239 -> 166;
            case 240 -> 240;
            case 241 -> 216;
            case 242 -> 131;
            case 243 -> 15;
            case 244 -> 27;
            case 245 -> 155;
            case 246 -> 182;
            case 247 -> 13;
            case 248 -> 57;
            case 249 -> 173;
            case 250 -> 55;
            case 251 -> 162;
            case 252 -> 6;
            case 253 -> 106;
            case 254 -> 255;
            default -> 163;
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
