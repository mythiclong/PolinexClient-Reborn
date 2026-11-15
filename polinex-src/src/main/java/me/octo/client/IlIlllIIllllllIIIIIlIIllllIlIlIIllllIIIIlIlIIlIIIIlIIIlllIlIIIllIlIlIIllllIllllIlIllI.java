package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.ClipContext.Block;
import net.minecraft.world.level.ClipContext.Fluid;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI {
   @NotNull
   public static IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static String[] a;
   private static String[] b;

   private IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI() {
   }

   @Nullable
   public final Pair<Float, Float> a(@NotNull lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI var1, boolean var2) {
      Object var91 = null; // PX-FIX
      double var88 = 0; // PX-FIX
      Object var87 = null; // PX-FIX
      Object var85 = null; // PX-FIX
      Object var84 = null; // PX-FIX
      double var83 = 0; // PX-FIX
      Object var81 = null; // PX-FIX
      Object var80 = null; // PX-FIX
      List var77 = null; // PX-FIX
      String var10000 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
      short var10002 = 10882;
      short var10003 = -10881;
      Intrinsics.checkNotNullParameter(var1, "context");
      String var3 = var10000;
      if (var3 != null
         && me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .player
            != null) {
         LocalPlayer var4 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .player;
         if (var3 != null
            && me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .level
               != null) {
            ClientLevel var5 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .level;
            List var6 = new ArrayList();
            byte var7 = 8;
            Float[] var9 = new Float[]{-40.0F, -20.0F, -10.0F, 0.0F, 10.0F, 15.0F, 20.0F, 27.5F, 35.0F, 50.0F};
            List var8 = CollectionsKt.listOf(var9);
            int var35 = 0;

            while (true) {
               if (var35 < var7) {
                  float var10 = var4.getYRot() + var35 * 360.0F / var7 + var1.h() * 10.0F;
                  var10000 = String.valueOf(var8);
                  if (var3 == null) {
                     break;
                  }

                  Iterator var11 = var8.iterator();

                  label297: {
                     while (var11.hasNext()) {
                        float var12 = ((Number)var11.next()).floatValue();
                        float var13 = var12 + var1.h() * 8.0F - 4.0F;
                        float var14 = RangesKt.coerceIn(var13, -70.0F, 85.0F);
                        Vec3 var15 = new Vec3(var4.getX(), var4.getY() + var4.getEyeHeight(), var4.getZ());
                        double var16 = Math.toRadians(var10);
                        double var18 = Math.toRadians(var14);
                        double var20 = -Math.sin(var16) * Math.cos(var18);
                        double var22 = -Math.sin(var18);
                        double var24 = Math.cos(var16) * Math.cos(var18);
                        Vec3 var26 = new Vec3(var15.x + var20 * 10.0, var15.y + var22 * 10.0, var15.z + var24 * 10.0);
                        BlockHitResult var73 = var5.clip(new ClipContext(var15, var26, Block.OUTLINE, Fluid.NONE, var4));
                        var10002 = 10881;
                        var10003 = 9161;
                        Intrinsics.checkNotNullExpressionValue(var73, "clip(...)");
                        BlockHitResult var27 = var73;
                        if (var3 == null) {
                           break label297;
                        }

                        double var28 = var27.getType() == Type.MISS ? 10.0 : var15.distanceTo(var27.getLocation());
                        var6.add(
                           new IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                              var10, var14, var28
                           )
                        );
                        if (var3 == null) {
                           break;
                        }
                     }

                     var35++;
                  }

                  if (var3 != null) {
                     continue;
                  }
               }

               var10000 = String.valueOf(var6);
               break;
            }

            if (var3 != null) {
               if (var10000.isEmpty()) {
                  return null;
               }

               var10000 = String.valueOf(var6);
            }

            Object var37 = var10000;
            boolean var39 = false;
            var var44 = new ArrayList();
            boolean var47 = false;

            for (Object var56 : (Iterable<?>)(var37)) {
               IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var17 = (IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var56;
               boolean var59 = false;
               double var94;
               int var74 = (var94 = var17.c() - 4.0) == 0.0 ? 0 : (var94 < 0.0 ? -1 : 1);
               if (var3 != null) {
                  var74 = var74 > 0 ? 1 : 0;
               }

               if (var74 != 0) {
                  var44.add(var56);
                  if (var3 == null) {
                     break;
                  }
               }
            }

            List var36 = var44;
            boolean var75 = var36.isEmpty();
            if (var3 != null) {
               var75 = !var75;
            }

            List var76;
            if (var75) {
               var76 = var36;
            } else {
               Iterable var40 = var6;
               boolean var42 = false;
               var76 = CollectionsKt.take(
                  CollectionsKt.sortedWith(
                     var40,
                     new IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI()
                  ),
                  20
               );
            }

            var37 = var76;
            List var41 = var1.l();
            Iterable var45 = (Iterable)var37;
            var47 = false;
            Collection var57 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var45, 10));
            boolean var58 = false;
            Iterator var60 = var45.iterator();

            final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
               private final IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
               private double lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               private static String[] a;
               private static String[] b;

               public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                  IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1,
                  double var2
               ) {
                  short var10001 = 30308;
                  short var10002 = -286;
                  Intrinsics.checkNotNullParameter(var1, "candidate");
                  super();
                  this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
                  this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
               }

               public final IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a() {
                  return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
               }

               public final double b() {
                  return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               }

               public final void a(double var1) {
                  this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
               }

               public final IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll c() {
                  return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
               }

               public final double d() {
                  return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               }

               public final llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
                  IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1,
                  double var2
               ) {
                  short var10001 = 30311;
                  short var10002 = 724;
                  Intrinsics.checkNotNullParameter(var1, "candidate");
                  return new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(var1, var2);
               }

               @Override
               public String toString() {
                  short var10000 = 30309;
                  double var1 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                  IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  short var10001 = 19692;
                  short var10002 = 30310;
                  short var10003 = -25900;
                  return "ScoredCandidate(candidate=" + var3 + ", score=" + var1 + ")";
               }

               @Override
               public int hashCode() {
                  int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
                  return var1 * 31 + Double.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
               }

               @Override
               public boolean equals(Object var1) {
                  String var2 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
                  Object var10000 = this;
                  if (var2 != null) {
                     if (this == var1) {
                        return true;
                     }

                     var10000 = var1;
                  }

                  if (var2 != null) {
                     if (!(var10000 instanceof llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)) {
                        return false;
                     }

                     var10000 = var1;
                  }

                  llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
                  int var4 = ((Intrinsics.areEqual(
                     this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                     var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  )) ? 1 : 0);
                  if (var2 != null) {
                     if (var4 == 0) {
                        return false;
                     }

                     var4 = Double.compare(
                        this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                        var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     );
                  }

                  if (var2 != null) {
                     if (var4 != 0) {
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
                  String[] var5 = new String[4];
                  int var3 = 0;
                  String var2 = "\u0083I\u009c0¹Ré\u0088Ï\u001a:\u0086\u009c\u009d\u00943ã±ã\u0092\u0086>- Ó\u001c]ÿ*\u000et\u0013qs6I";
                  int var4 = "\u0083I\u009c0¹Ré\u0088Ï\u001a:\u0086\u009c\u009d\u00943ã±ã\u0092\u0086>- Ó\u001c]ÿ*\u000et\u0013qs6I".length();
                  char var1 = '\t';
                  int var8 = -1;

                  label52:
                  while (true) {
                     byte var10000 = 25;
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
                                 case 0 -> 4;
                                 case 1 -> 40;
                                 case 2 -> 55;
                                 case 3 -> 15;
                                 case 4 -> 60;
                                 case 5 -> 3;
                                 default -> 70;
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
                                 b = new String[4];
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

                              var2 = "ã\u0085w\u009b \u008aDR\të·Í³Ï~{QÁ";
                              var4 = "ã\u0085w\u009b \u008aDR\të·Í³Ï~{QÁ".length();
                              var1 = '\b';
                              var8 = -1;
                        }

                        var10000 = 34;
                        var10001 = var2.substring(++var8, var8 + var1);
                        var10002 = 0;
                     }
                  }
   } // PX-FIX end pxClinit
               }

               private static String a(int var0, int var1) {
                  int var2 = (var0 ^ 30308) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 186;
                        case 1 -> 154;
                        case 2 -> 76;
                        case 3 -> 251;
                        case 4 -> 220;
                        case 5 -> 72;
                        case 6 -> 250;
                        case 7 -> 177;
                        case 8 -> 242;
                        case 9 -> 230;
                        case 10 -> 123;
                        case 11 -> 194;
                        case 12 -> 17;
                        case 13 -> 80;
                        case 14 -> 141;
                        case 15 -> 138;
                        case 16 -> 185;
                        case 17 -> 134;
                        case 18 -> 249;
                        case 19 -> 162;
                        case 20 -> 243;
                        case 21 -> 158;
                        case 22 -> 105;
                        case 23 -> 85;
                        case 24 -> 232;
                        case 25 -> 231;
                        case 26 -> 13;
                        case 27 -> 152;
                        case 28 -> 37;
                        case 29 -> 19;
                        case 30 -> 20;
                        case 31 -> 181;
                        case 32 -> 248;
                        case 33 -> 183;
                        case 34 -> 66;
                        case 35 -> 31;
                        case 36 -> 121;
                        case 37 -> 52;
                        case 38 -> 234;
                        case 39 -> 120;
                        case 40 -> 213;
                        case 41 -> 106;
                        case 42 -> 184;
                        case 43 -> 40;
                        case 44 -> 200;
                        case 45 -> 145;
                        case 46 -> 110;
                        case 47 -> 246;
                        case 48 -> 45;
                        case 49 -> 103;
                        case 50 -> 8;
                        case 51 -> 199;
                        case 52 -> 74;
                        case 53 -> 216;
                        case 54 -> 71;
                        case 55 -> 44;
                        case 56 -> 169;
                        case 57 -> 164;
                        case 58 -> 210;
                        case 59 -> 9;
                        case 60 -> 65;
                        case 61 -> 89;
                        case 62 -> 132;
                        case 63 -> 166;
                        case 64 -> 111;
                        case 65 -> 22;
                        case 66 -> 78;
                        case 67 -> 147;
                        case 68 -> 193;
                        case 69 -> 215;
                        case 70 -> 104;
                        case 71 -> 99;
                        case 72 -> 182;
                        case 73 -> 94;
                        case 74 -> 29;
                        case 75 -> 117;
                        case 76 -> 101;
                        case 77 -> 27;
                        case 78 -> 140;
                        case 79 -> 188;
                        case 80 -> 1;
                        case 81 -> 219;
                        case 82 -> 28;
                        case 83 -> 68;
                        case 84 -> 171;
                        case 85 -> 197;
                        case 86 -> 204;
                        case 87 -> 33;
                        case 88 -> 155;
                        case 89 -> 143;
                        case 90 -> 218;
                        case 91 -> 130;
                        case 92 -> 125;
                        case 93 -> 153;
                        case 94 -> 223;
                        case 95 -> 247;
                        case 96 -> 34;
                        case 97 -> 187;
                        case 98 -> 73;
                        case 99 -> 196;
                        case 100 -> 161;
                        case 101 -> 163;
                        case 102 -> 244;
                        case 103 -> 57;
                        case 104 -> 189;
                        case 105 -> 198;
                        case 106 -> 144;
                        case 107 -> 150;
                        case 108 -> 48;
                        case 109 -> 252;
                        case 110 -> 201;
                        case 111 -> 254;
                        case 112 -> 35;
                        case 113 -> 55;
                        case 114 -> 233;
                        case 115 -> 63;
                        case 116 -> 39;
                        case 117 -> 241;
                        case 118 -> 192;
                        case 119 -> 119;
                        case 120 -> 207;
                        case 121 -> 115;
                        case 122 -> 46;
                        case 123 -> 236;
                        case 124 -> 0;
                        case 125 -> 139;
                        case 126 -> 157;
                        case 127 -> 56;
                        case 128 -> 168;
                        case 129 -> 146;
                        case 130 -> 60;
                        case 131 -> 114;
                        case 132 -> 100;
                        case 133 -> 14;
                        case 134 -> 83;
                        case 135 -> 75;
                        case 136 -> 91;
                        case 137 -> 79;
                        case 138 -> 173;
                        case 139 -> 156;
                        case 140 -> 209;
                        case 141 -> 191;
                        case 142 -> 113;
                        case 143 -> 176;
                        case 144 -> 18;
                        case 145 -> 224;
                        case 146 -> 180;
                        case 147 -> 25;
                        case 148 -> 167;
                        case 149 -> 208;
                        case 150 -> 7;
                        case 151 -> 116;
                        case 152 -> 129;
                        case 153 -> 70;
                        case 154 -> 86;
                        case 155 -> 95;
                        case 156 -> 148;
                        case 157 -> 42;
                        case 158 -> 229;
                        case 159 -> 92;
                        case 160 -> 178;
                        case 161 -> 96;
                        case 162 -> 142;
                        case 163 -> 2;
                        case 164 -> 131;
                        case 165 -> 87;
                        case 166 -> 203;
                        case 167 -> 88;
                        case 168 -> 240;
                        case 169 -> 3;
                        case 170 -> 136;
                        case 171 -> 24;
                        case 172 -> 179;
                        case 173 -> 205;
                        case 174 -> 90;
                        case 175 -> 108;
                        case 176 -> 202;
                        case 177 -> 253;
                        case 178 -> 23;
                        case 179 -> 172;
                        case 180 -> 124;
                        case 181 -> 239;
                        case 182 -> 126;
                        case 183 -> 11;
                        case 184 -> 175;
                        case 185 -> 221;
                        case 186 -> 174;
                        case 187 -> 206;
                        case 188 -> 6;
                        case 189 -> 225;
                        case 190 -> 217;
                        case 191 -> 61;
                        case 192 -> 128;
                        case 193 -> 137;
                        case 194 -> 214;
                        case 195 -> 133;
                        case 196 -> 93;
                        case 197 -> 235;
                        case 198 -> 226;
                        case 199 -> 109;
                        case 200 -> 135;
                        case 201 -> 170;
                        case 202 -> 151;
                        case 203 -> 62;
                        case 204 -> 15;
                        case 205 -> 38;
                        case 206 -> 98;
                        case 207 -> 10;
                        case 208 -> 159;
                        case 209 -> 26;
                        case 210 -> 238;
                        case 211 -> 149;
                        case 212 -> 118;
                        case 213 -> 227;
                        case 214 -> 12;
                        case 215 -> 107;
                        case 216 -> 36;
                        case 217 -> 122;
                        case 218 -> 97;
                        case 219 -> 59;
                        case 220 -> 245;
                        case 221 -> 211;
                        case 222 -> 160;
                        case 223 -> 81;
                        case 224 -> 58;
                        case 225 -> 77;
                        case 226 -> 32;
                        case 227 -> 195;
                        case 228 -> 165;
                        case 229 -> 112;
                        case 230 -> 255;
                        case 231 -> 51;
                        case 232 -> 43;
                        case 233 -> 82;
                        case 234 -> 53;
                        case 235 -> 5;
                        case 236 -> 102;
                        case 237 -> 47;
                        case 238 -> 50;
                        case 239 -> 49;
                        case 240 -> 228;
                        case 241 -> 54;
                        case 242 -> 4;
                        case 243 -> 69;
                        case 244 -> 84;
                        case 245 -> 21;
                        case 246 -> 237;
                        case 247 -> 67;
                        case 248 -> 30;
                        case 249 -> 64;
                        case 250 -> 222;
                        case 251 -> 212;
                        case 252 -> 41;
                        case 253 -> 127;
                        case 254 -> 16;
                        default -> 190;
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

            while (true) {
               if (var60.hasNext()) {
                  Object var19 = var60.next();
                  IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var61 = (IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var19;
                  boolean var21 = false;
                  double var62 = var61.c();
                  double var64 = 0.0;
                  var77 = var41;
                  if (var3 == null) {
                     break;
                  }

                  boolean var78 = var77.isEmpty();
                  if (var3 != null) {
                     var78 = !var78;
                  }

                  if (var78) {
                     label264: {
                        label319: {
                           label320: {
                              Iterator var65 = var41.iterator();
                              var10000 = String.valueOf(var65);
                              if (var3 != null) {
                                 if (!var65.hasNext()) {
                                    var80 = null;
                                    break label320;
                                 }

                                 var10000 = (String)var65.next();
                              }

                              float var66 = ((Number)(Object)var10000).floatValue();
                              boolean var68 = false;
                              float var29 = Math.abs(IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var61.a() - var66));
                              var66 = var29;

                              while (var65.hasNext()) {
                                 float var69 = ((Number)var65.next()).floatValue();
                                 boolean var70 = false;
                                 float var30 = Math.abs(
                                    IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var61.a() - var69)
                                 );
                                 var66 = Math.min(var66, var30);
                                 if (var3 == null) {
                                    break label319;
                                 }

                                 if (var3 == null) {
                                    break;
                                 }
                              }

                              var80 = var66;
                           }

                           if (var80 != null) {
                              var81 = var80;
                              break label264;
                           }
                        }

                        var81 = 180.0F;
                     }

                     label322: {
                        float var31 =((Float)( var81));
                        float var95;
                        int var82 = (var95 = var31 - 60.0F) == 0.0F ? 0 : (var95 < 0.0F ? -1 : 1);
                        if (var3 != null) {
                           if (var82 > 0) {
                              var83 = 1.0;
                              break label322;
                           }

                           float var96;
                           var82 = (var96 = 40.0F - var31) == 0.0F ? 0 : (var96 < 0.0F ? -1 : 1);
                        }

                        label237: {
                           if (var3 != null) {
                              if (var82 > 0) {
                                 var82 = 0;
                                 break label237;
                              }

                              float var97;
                              var82 = (var97 = var31 - 60.0F) == 0.0F ? 0 : (var97 < 0.0F ? -1 : 1);
                           }

                           if (var3 != null) {
                              var82 = var82 <= 0 ? 1 : 0;
                           }
                        }

                        if (var82 != 0) {
                           var83 = 1.5;
                        } else {
                           label230: {
                              float var98;
                              var84 = (var98 = 20.0F - var31) == 0.0F ? 0 : (var98 < 0.0F ? -1 : 1);
                              if (var3 != null) {
                                 if (((Boolean)var84)) {
                                    var84 = 0;
                                    break label230;
                                 }

                                 float var99;
                                 var84 = (var99 = var31 - 40.0F) == 0.0F ? 0 : (var99 < 0.0F ? -1 : 1);
                              }

                              if (var3 != null) {
                                 var84 = ((Boolean)var84) ? 1 : 0;
                              }
                           }

                           if (!((Boolean)var84)) {
                              var83 = 3.0;
                           } else {
                              label223: {
                                 float var100;
                                 var85 = (var100 = 10.0F - var31) == 0.0F ? 0 : (var100 < 0.0F ? -1 : 1);
                                 if (var3 != null) {
                                    if (((Boolean)var85)) {
                                       var85 = 0;
                                       break label223;
                                    }

                                    float var101;
                                    var85 = (var101 = var31 - 20.0F) == 0.0F ? 0 : (var101 < 0.0F ? -1 : 1);
                                 }

                                 if (var3 != null) {
                                    var85 = ((Boolean)var85) ? 1 : 0;
                                 }
                              }

                              var83 = ((Boolean)var85 ? 0.5 : -2.5);
                           }
                        }
                     }

                     var64 = var83;
                  }

                  label323: {
                     float var71 = Math.abs(IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var61.a() - var4.getYRot()));
                     float var102;
                     int var86 = (var102 = var71 - 80.0F) == 0.0F ? 0 : (var102 < 0.0F ? -1 : 1);
                     if (var3 != null) {
                        if (var86 > 0) {
                           var88 = 0.5;
                           break label323;
                        }

                        float var103;
                        var86 = (var103 = 40.0F - var71) == 0.0F ? 0 : (var103 < 0.0F ? -1 : 1);
                     }

                     label213: {
                        if (var3 != null) {
                           if (var86 > 0) {
                              var86 = 0;
                              break label213;
                           }

                           float var104;
                           var86 = (var104 = var71 - 80.0F) == 0.0F ? 0 : (var104 < 0.0F ? -1 : 1);
                        }

                        if (var3 != null) {
                           var86 = var86 <= 0 ? 1 : 0;
                        }
                     }

                     if (var86 != 0) {
                        var88 = 0.85;
                     } else {
                        label206: {
                           float var105;
                           var87 = (var105 = 20.0F - var71) == 0.0F ? 0 : (var105 < 0.0F ? -1 : 1);
                           if (var3 != null) {
                              if (((Boolean)var87)) {
                                 var87 = 0;
                                 break label206;
                              }

                              float var106;
                              var87 = (var106 = var71 - 40.0F) == 0.0F ? 0 : (var106 < 0.0F ? -1 : 1);
                           }

                           if (var3 != null) {
                              var87 = ((Boolean)var87) ? 1 : 0;
                           }
                        }

                        var88 = ((Boolean)var87 ? 1.8 : 0.0);
                     }
                  }

                  double var32 = var88;
                  var62 += var64 + var32;
                  var57.add(new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(var61, var62));
                  if (var3 != null) {
                     continue;
                  }
               }

               var77 = ((List)(Object)(var57));
               break;
            }

            label324: {
               List var43 = (List)var77;
               Iterable var49 = var43;
               boolean var52 = false;
               List var46 = CollectionsKt.sortedWith(
                  var49,
                  new IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll()
               );
               int var89 =(( var2) ? 1 : 0);
               if (var3 != null) {
                  if (!var2) {
                     List var55 = CollectionsKt.take(var46, 5);
                     var91 = ((llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var55.get(var1.a(0, var55.size()))).a();
                     break label324;
                  }

                  float var107;
                  var89 = (var107 = var1.h() - 0.35F) == 0.0F ? 0 : (var107 < 0.0F ? -1 : 1);
               }

               label325: {
                  if (var3 != null) {
                     if (var89 < 0) {
                        List var54 = CollectionsKt.take(var46, 8);
                        var91 = ((llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var54.get(var1.a(0, var54.size()))).a();
                        break label324;
                     }

                     var10000 = String.valueOf(var1);
                     if (var3 == null) {
                        break label325;
                     }

                     float var108;
                     var89 = (var108 = var1.h() - 0.65F) == 0.0F ? 0 : (var108 < 0.0F ? -1 : 1);
                  }

                  if (var89 < 0) {
                     List var53 = CollectionsKt.take(var46, RangesKt.coerceAtLeast((int)(var46.size() * 0.6F), 8));
                     var91 = ((llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var53.get(var1.a(0, var53.size()))).a();
                     break label324;
                  }

                  var10000 = (String)var46.get(var1.a(0, var46.size()));
               }

               var91 = ((llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)(Object)var10000).a();
            }

            IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var50 = ((me.octo.client.IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)(Object)(((llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)( var91))));
            return TuplesKt.to(var50.a(), var50.b());
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private final float a(float var1) {
      String var10000 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
      float var3 = var1 % 360.0F;
      String var2 = var10000;
      float var6;
      int var4 = (var6 = var3 - 180.0F) == 0.0F ? 0 : (var6 < 0.0F ? -1 : 1);
      if (var2 != null) {
         if (var4 > 0) {
            var3 -= 360.0F;
         }

         if (var2 == null) {
            return var3;
         }

         float var7;
         var4 = (var7 = var3 - -180.0F) == 0.0F ? 0 : (var7 < 0.0F ? -1 : 1);
      }

      if (var4 < 0) {
         var3 += 360.0F;
      }

      return var3;
   }

   public final int a() {
      String var1 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
      if (var1 != null
         && me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .player
            != null) {
         LocalPlayer var2 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .player;
         if (var1 != null
            && me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .level
               != null) {
            ClientLevel var3 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .level;
            int var4 = 0;
            int var5 = 1;

            byte var7;
            while (true) {
               if (var5 < 11) {
                  BlockPos var10000 = var2.blockPosition().below(var5);
                  short var10002 = 10883;
                  short var10003 = -3443;
                  Intrinsics.checkNotNullExpressionValue(var10000, "below(...)");
                  BlockPos var6 = var10000;
                  if (var1 != null) {
                     var7 = ((byte)((var3.getBlockState(var6).isAir()) ? 1 : 0));
                     if (var1 == null) {
                        break;
                     }

                     if (var7 == 0) {
                        return var4;
                     }

                     var4++;
                     var5++;
                  }

                  if (var1 != null) {
                     continue;
                  }
               }

               var7 = 10;
               break;
            }

            return var7;
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "z\u008d®HØÔ³\u0002Æ!\u0007\u0085<r.\u00130À\tõë{³\u0098Q\u000ftV";
      int var4 = "z\u008d®HØÔ³\u0002Æ!\u0007\u0085<r.\u00130À\tõë{³\u0098Q\u000ftV".length();
      char var1 = '\n';
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 125;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 125;
               var10006 = var6;
            } else {
               var13 = 125;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 125;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 72;
                  case 1 -> 7;
                  case 2 -> 120;
                  case 3 -> 109;
                  case 4 -> 70;
                  case 5 -> 8;
                  default -> 5;
               });
               var6++;
               if (var13 == 0) {
                  var10006 = var13;
                  var10005 = var10002;
                  var16 = var13;
               } else {
                  if (var8 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var16 = var13;
                  var10006 = var6;
               }
            }
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var5[var3++] = var15;
         if ((var0 += var1) >= var4) {
            a = var5;
            b = new String[3];
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI();
            break pxClinit; // PX-FIX
         }

         var1 = var2.charAt(var0);
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 10883) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 97;
            case 1 -> 232;
            case 2 -> 110;
            case 3 -> 81;
            case 4 -> 133;
            case 5 -> 98;
            case 6 -> 239;
            case 7 -> 178;
            case 8 -> 121;
            case 9 -> 139;
            case 10 -> 13;
            case 11 -> 240;
            case 12 -> 7;
            case 13 -> 99;
            case 14 -> 42;
            case 15 -> 123;
            case 16 -> 64;
            case 17 -> 225;
            case 18 -> 116;
            case 19 -> 41;
            case 20 -> 40;
            case 21 -> 11;
            case 22 -> 6;
            case 23 -> 65;
            case 24 -> 189;
            case 25 -> 120;
            case 26 -> 216;
            case 27 -> 25;
            case 28 -> 104;
            case 29 -> 125;
            case 30 -> 132;
            case 31 -> 39;
            case 32 -> 118;
            case 33 -> 75;
            case 34 -> 141;
            case 35 -> 224;
            case 36 -> 153;
            case 37 -> 204;
            case 38 -> 155;
            case 39 -> 228;
            case 40 -> 122;
            case 41 -> 248;
            case 42 -> 247;
            case 43 -> 70;
            case 44 -> 222;
            case 45 -> 94;
            case 46 -> 30;
            case 47 -> 192;
            case 48 -> 112;
            case 49 -> 128;
            case 50 -> 58;
            case 51 -> 114;
            case 52 -> 187;
            case 53 -> 5;
            case 54 -> 10;
            case 55 -> 196;
            case 56 -> 160;
            case 57 -> 45;
            case 58 -> 79;
            case 59 -> 231;
            case 60 -> 206;
            case 61 -> 131;
            case 62 -> 183;
            case 63 -> 158;
            case 64 -> 60;
            case 65 -> 93;
            case 66 -> 214;
            case 67 -> 246;
            case 68 -> 229;
            case 69 -> 236;
            case 70 -> 56;
            case 71 -> 220;
            case 72 -> 90;
            case 73 -> 173;
            case 74 -> 249;
            case 75 -> 27;
            case 76 -> 208;
            case 77 -> 71;
            case 78 -> 111;
            case 79 -> 96;
            case 80 -> 107;
            case 81 -> 164;
            case 82 -> 74;
            case 83 -> 200;
            case 84 -> 148;
            case 85 -> 176;
            case 86 -> 29;
            case 87 -> 66;
            case 88 -> 67;
            case 89 -> 190;
            case 90 -> 82;
            case 91 -> 59;
            case 92 -> 202;
            case 93 -> 86;
            case 94 -> 35;
            case 95 -> 227;
            case 96 -> 144;
            case 97 -> 106;
            case 98 -> 134;
            case 99 -> 51;
            case 100 -> 210;
            case 101 -> 135;
            case 102 -> 68;
            case 103 -> 95;
            case 104 -> 168;
            case 105 -> 33;
            case 106 -> 181;
            case 107 -> 119;
            case 108 -> 166;
            case 109 -> 36;
            case 110 -> 46;
            case 111 -> 84;
            case 112 -> 1;
            case 113 -> 77;
            case 114 -> 21;
            case 115 -> 24;
            case 116 -> 146;
            case 117 -> 207;
            case 118 -> 205;
            case 119 -> 126;
            case 120 -> 150;
            case 121 -> 109;
            case 122 -> 221;
            case 123 -> 198;
            case 124 -> 188;
            case 125 -> 226;
            case 126 -> 157;
            case 127 -> 34;
            case 128 -> 54;
            case 129 -> 101;
            case 130 -> 252;
            case 131 -> 201;
            case 132 -> 28;
            case 133 -> 243;
            case 134 -> 215;
            case 135 -> 209;
            case 136 -> 255;
            case 137 -> 142;
            case 138 -> 175;
            case 139 -> 23;
            case 140 -> 50;
            case 141 -> 199;
            case 142 -> 167;
            case 143 -> 174;
            case 144 -> 218;
            case 145 -> 105;
            case 146 -> 251;
            case 147 -> 163;
            case 148 -> 211;
            case 149 -> 20;
            case 150 -> 2;
            case 151 -> 14;
            case 152 -> 78;
            case 153 -> 238;
            case 154 -> 16;
            case 155 -> 83;
            case 156 -> 161;
            case 157 -> 72;
            case 158 -> 85;
            case 159 -> 17;
            case 160 -> 48;
            case 161 -> 31;
            case 162 -> 63;
            case 163 -> 76;
            case 164 -> 250;
            case 165 -> 26;
            case 166 -> 103;
            case 167 -> 177;
            case 168 -> 15;
            case 169 -> 18;
            case 170 -> 193;
            case 171 -> 203;
            case 172 -> 73;
            case 173 -> 136;
            case 174 -> 180;
            case 175 -> 22;
            case 176 -> 172;
            case 177 -> 0;
            case 178 -> 235;
            case 179 -> 151;
            case 180 -> 88;
            case 181 -> 117;
            case 182 -> 4;
            case 183 -> 124;
            case 184 -> 191;
            case 185 -> 233;
            case 186 -> 89;
            case 187 -> 184;
            case 188 -> 195;
            case 189 -> 129;
            case 190 -> 165;
            case 191 -> 47;
            case 192 -> 38;
            case 193 -> 223;
            case 194 -> 170;
            case 195 -> 32;
            case 196 -> 147;
            case 197 -> 108;
            case 198 -> 19;
            case 199 -> 242;
            case 200 -> 154;
            case 201 -> 234;
            case 202 -> 55;
            case 203 -> 37;
            case 204 -> 102;
            case 205 -> 241;
            case 206 -> 179;
            case 207 -> 237;
            case 208 -> 91;
            case 209 -> 212;
            case 210 -> 115;
            case 211 -> 171;
            case 212 -> 8;
            case 213 -> 145;
            case 214 -> 149;
            case 215 -> 182;
            case 216 -> 87;
            case 217 -> 185;
            case 218 -> 254;
            case 219 -> 53;
            case 220 -> 127;
            case 221 -> 230;
            case 222 -> 92;
            case 223 -> 44;
            case 224 -> 213;
            case 225 -> 169;
            case 226 -> 253;
            case 227 -> 62;
            case 228 -> 197;
            case 229 -> 113;
            case 230 -> 143;
            case 231 -> 159;
            case 232 -> 219;
            case 233 -> 156;
            case 234 -> 162;
            case 235 -> 194;
            case 236 -> 140;
            case 237 -> 52;
            case 238 -> 152;
            case 239 -> 245;
            case 240 -> 186;
            case 241 -> 138;
            case 242 -> 137;
            case 243 -> 80;
            case 244 -> 100;
            case 245 -> 217;
            case 246 -> 244;
            case 247 -> 61;
            case 248 -> 9;
            case 249 -> 3;
            case 250 -> 49;
            case 251 -> 57;
            case 252 -> 130;
            case 253 -> 69;
            case 254 -> 12;
            default -> 43;
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private final float IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final float lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final double IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(float var1, float var2, double var3) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      }

      public final float a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final float b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final double c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final float d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final float e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final double f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public static IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0, float var1, float var2, double var3, int var4, Object var5
      ) {
         String var6 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
         if ((var4 & 1) != 0 && var6 != null) {
            var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         }

         if ((var4 & 2) != 0 && var6 != null) {
            var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         if ((var4 & 4) != 0) {
            var3 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         return var0.a(var1, var2, var3);
      }

      @NotNull
      public final IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         float var1, float var2, double var3
      ) {
         return new IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -1609;
         double var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         float var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         float var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 16149;
         short var10002 = -1610;
         short var10003 = 32038;
         short var10004 = -1612;
         short var10005 = 26459;
         return "RotationCandidate(yaw=" + var4 + ", pitch=" + var3 + ", clearance=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Float.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var1 = var1 * 31 + Float.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         return var1 * 31 + Double.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         int var4 = Float.compare(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         );
         if (var2 != null) {
            if (var4 != 0) {
               return false;
            }

            var4 = Float.compare(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
         }

         if (var2 != null) {
            if (var4 != 0) {
               return false;
            }

            var4 = Double.compare(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            );
         }

         if (var2 != null) {
            if (var4 != 0) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: { // PX-FIX
         String[] var5 = new String[3];
         int var3 = 0;
         String var2 = "%à+\u0012`DBë\u0016ÇpÂ®ÙÐra\u0014¸\u00841{v\u001bÉ\u001d¨\u001cx~.\f\u0099á¯7\u0090Gu\u0095gÊid";
         int var4 = "%à+\u0012`DBë\u0016ÇpÂ®ÙÐra\u0014¸\u00841{v\u001bÉ\u001d¨\u001cx~.\f\u0099á¯7\u0090Gu\u0095gÊid".length();
         char var1 = '\b';
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 31;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 31;
                  var10006 = var6;
               } else {
                  var13 = 31;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 31;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 111;
                     case 1 -> 15;
                     case 2 -> 71;
                     case 3 -> 94;
                     case 4 -> 27;
                     case 5 -> 22;
                     default -> 67;
                  });
                  var6++;
                  if (var13 == 0) {
                     var10006 = var13;
                     var10005 = var10002;
                     var16 = var13;
                  } else {
                     if (var8 <= var6) {
                        break;
                     }

                     var10005 = var10002;
                     var16 = var13;
                     var10006 = var6;
                  }
               }
            }

            String var15 = new String(var10002).intern();
            byte var10 = -1;
            var5[var3++] = var15;
            if ((var0 += var1) >= var4) {
               a = var5;
               b = new String[3];
               break pxClinit; // PX-FIX
            }

            var1 = var2.charAt(var0);
         }
   } // PX-FIX end pxClinit
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -1610) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 213;
               case 1 -> 236;
               case 2 -> 126;
               case 3 -> 205;
               case 4 -> 166;
               case 5 -> 136;
               case 6 -> 65;
               case 7 -> 99;
               case 8 -> 3;
               case 9 -> 237;
               case 10 -> 169;
               case 11 -> 21;
               case 12 -> 224;
               case 13 -> 12;
               case 14 -> 112;
               case 15 -> 161;
               case 16 -> 4;
               case 17 -> 235;
               case 18 -> 128;
               case 19 -> 227;
               case 20 -> 120;
               case 21 -> 125;
               case 22 -> 74;
               case 23 -> 171;
               case 24 -> 94;
               case 25 -> 195;
               case 26 -> 93;
               case 27 -> 100;
               case 28 -> 138;
               case 29 -> 131;
               case 30 -> 156;
               case 31 -> 25;
               case 32 -> 52;
               case 33 -> 72;
               case 34 -> 103;
               case 35 -> 252;
               case 36 -> 23;
               case 37 -> 54;
               case 38 -> 96;
               case 39 -> 254;
               case 40 -> 77;
               case 41 -> 108;
               case 42 -> 53;
               case 43 -> 19;
               case 44 -> 151;
               case 45 -> 63;
               case 46 -> 38;
               case 47 -> 189;
               case 48 -> 70;
               case 49 -> 184;
               case 50 -> 85;
               case 51 -> 82;
               case 52 -> 105;
               case 53 -> 167;
               case 54 -> 16;
               case 55 -> 201;
               case 56 -> 35;
               case 57 -> 191;
               case 58 -> 79;
               case 59 -> 245;
               case 60 -> 22;
               case 61 -> 71;
               case 62 -> 49;
               case 63 -> 238;
               case 64 -> 247;
               case 65 -> 20;
               case 66 -> 110;
               case 67 -> 228;
               case 68 -> 208;
               case 69 -> 225;
               case 70 -> 170;
               case 71 -> 187;
               case 72 -> 127;
               case 73 -> 95;
               case 74 -> 152;
               case 75 -> 107;
               case 76 -> 5;
               case 77 -> 98;
               case 78 -> 62;
               case 79 -> 153;
               case 80 -> 146;
               case 81 -> 182;
               case 82 -> 60;
               case 83 -> 78;
               case 84 -> 121;
               case 85 -> 173;
               case 86 -> 18;
               case 87 -> 86;
               case 88 -> 117;
               case 89 -> 155;
               case 90 -> 223;
               case 91 -> 124;
               case 92 -> 194;
               case 93 -> 26;
               case 94 -> 229;
               case 95 -> 255;
               case 96 -> 185;
               case 97 -> 192;
               case 98 -> 113;
               case 99 -> 30;
               case 100 -> 162;
               case 101 -> 239;
               case 102 -> 32;
               case 103 -> 10;
               case 104 -> 0;
               case 105 -> 51;
               case 106 -> 106;
               case 107 -> 196;
               case 108 -> 143;
               case 109 -> 46;
               case 110 -> 57;
               case 111 -> 31;
               case 112 -> 66;
               case 113 -> 97;
               case 114 -> 234;
               case 115 -> 50;
               case 116 -> 11;
               case 117 -> 42;
               case 118 -> 149;
               case 119 -> 181;
               case 120 -> 8;
               case 121 -> 37;
               case 122 -> 133;
               case 123 -> 241;
               case 124 -> 248;
               case 125 -> 134;
               case 126 -> 200;
               case 127 -> 219;
               case 128 -> 118;
               case 129 -> 163;
               case 130 -> 148;
               case 131 -> 193;
               case 132 -> 242;
               case 133 -> 87;
               case 134 -> 190;
               case 135 -> 144;
               case 136 -> 164;
               case 137 -> 188;
               case 138 -> 157;
               case 139 -> 249;
               case 140 -> 159;
               case 141 -> 214;
               case 142 -> 59;
               case 143 -> 180;
               case 144 -> 84;
               case 145 -> 40;
               case 146 -> 14;
               case 147 -> 140;
               case 148 -> 43;
               case 149 -> 33;
               case 150 -> 116;
               case 151 -> 141;
               case 152 -> 34;
               case 153 -> 69;
               case 154 -> 24;
               case 155 -> 56;
               case 156 -> 244;
               case 157 -> 218;
               case 158 -> 207;
               case 159 -> 90;
               case 160 -> 240;
               case 161 -> 27;
               case 162 -> 17;
               case 163 -> 75;
               case 164 -> 83;
               case 165 -> 232;
               case 166 -> 61;
               case 167 -> 132;
               case 168 -> 135;
               case 169 -> 198;
               case 170 -> 233;
               case 171 -> 199;
               case 172 -> 145;
               case 173 -> 13;
               case 174 -> 197;
               case 175 -> 114;
               case 176 -> 36;
               case 177 -> 29;
               case 178 -> 174;
               case 179 -> 111;
               case 180 -> 6;
               case 181 -> 68;
               case 182 -> 67;
               case 183 -> 48;
               case 184 -> 89;
               case 185 -> 15;
               case 186 -> 47;
               case 187 -> 28;
               case 188 -> 80;
               case 189 -> 175;
               case 190 -> 203;
               case 191 -> 55;
               case 192 -> 221;
               case 193 -> 137;
               case 194 -> 73;
               case 195 -> 92;
               case 196 -> 177;
               case 197 -> 39;
               case 198 -> 183;
               case 199 -> 158;
               case 200 -> 45;
               case 201 -> 58;
               case 202 -> 251;
               case 203 -> 246;
               case 204 -> 1;
               case 205 -> 160;
               case 206 -> 104;
               case 207 -> 122;
               case 208 -> 102;
               case 209 -> 217;
               case 210 -> 179;
               case 211 -> 215;
               case 212 -> 212;
               case 213 -> 243;
               case 214 -> 142;
               case 215 -> 129;
               case 216 -> 2;
               case 217 -> 139;
               case 218 -> 220;
               case 219 -> 109;
               case 220 -> 253;
               case 221 -> 41;
               case 222 -> 168;
               case 223 -> 230;
               case 224 -> 178;
               case 225 -> 44;
               case 226 -> 209;
               case 227 -> 64;
               case 228 -> 130;
               case 229 -> 165;
               case 230 -> 9;
               case 231 -> 210;
               case 232 -> 186;
               case 233 -> 150;
               case 234 -> 172;
               case 235 -> 88;
               case 236 -> 216;
               case 237 -> 250;
               case 238 -> 7;
               case 239 -> 176;
               case 240 -> 226;
               case 241 -> 81;
               case 242 -> 147;
               case 243 -> 211;
               case 244 -> 154;
               case 245 -> 222;
               case 246 -> 206;
               case 247 -> 231;
               case 248 -> 101;
               case 249 -> 123;
               case 250 -> 202;
               case 251 -> 115;
               case 252 -> 76;
               case 253 -> 204;
               case 254 -> 119;
               default -> 91;
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
   public static kotlin.Pair a(IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI var0, lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI var1, boolean var2, int var3, Object var4) {
      String var5 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
      if (var5 != null && (var3 & 2) != 0) {
         var2 = false;
      }

      return var0.a(var1, var2);
   }
}
