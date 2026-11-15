package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.protocol.game.ClientboundLevelParticlesPacket;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IllIlllIllIIlIIlIllllIlIIIIlIlllIIIlllIIlIllIlIIIIIlIllIlllIlllIlIIIIIlIllIIIlIllIIII
   extends IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI {

   @NotNull
   public static IllIlllIllIIlIIlIllllIlIIIIlIlllIIIlllIIlIllIlIIIIIlIllIlllIlllIlIIIIIlIllIIIlIllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI;
   @Nullable
   private Pair<? extends ParticleOptions, ? extends Vec3> lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
   @Nullable
   private Pair<? extends ParticleOptions, ? extends Vec3> IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
   @Nullable
   private BlockPos llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll;
   private boolean llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
   private boolean IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII;
   private int llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
   @Nullable
   private Integer lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
   @Nullable
   private BlockPos IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
   @NotNull
   private static IllIlllIllIIlIIlIllllIlIIIIlIlllIIIlllIIlIllIlIIIIIlIllIlllIlllIlIIIIIlIllIIIlIllIIII llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
   private static String[] h;
   private static String[] i;

   public IllIlllIllIIlIIlIllllIlIIIIlIlllIIIlllIIlIllIlIIIIIlIllIlllIlllIlIIIIIlIllIIIlIllIIII() {
      short var10001 = -1942;
      short var10002 = -23416;
      var10002 = -1943;
      short var10003 = -11444;
      short var10004 = -1939;
      short var10005 = 3243;
      super(
         "Berberis Macro",
         "Gathers Wilted Berberis bushes.",
         me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
         "Rift",
         CollectionsKt.emptyList(),
         CollectionsKt.emptyList(),
         false
      , new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[0]);
      this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
   }

   @NotNull
   @Override
   protected lIIllIIlIllIIllIIlIIIIIlIlIlllIIIlllllllllIlIllIIIIlllllllllIlIllIIIlIlllllllIlllIlll aL() {
      return new lIIllIIlIllIIllIIlIIIIIlIlIlllIIIlllllllllIlIllIIIIlllllllllIlIllIIIlIlllllllIlllIlll(true, true, false, false, false, null, 60, null);
   }

   @Nullable
   public final Pair<ParticleOptions, Vec3> a5() {
      return ((Pair<ParticleOptions,Vec3>)(Object)(this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI));
   }

   public final void a(@Nullable Pair<? extends ParticleOptions, ? extends Vec3> var1) {
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = var1;
   }

   @Nullable
   public final Pair<ParticleOptions, Vec3> a6() {
      return ((Pair<ParticleOptions,Vec3>)(Object)(this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll));
   }

   public final void b(@Nullable Pair<? extends ParticleOptions, ? extends Vec3> var1) {
      this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = var1;
   }

   @Nullable
   public final BlockPos a7() {
      return this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll;
   }

   public final void a(@Nullable BlockPos var1) {
      this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = var1;
   }

   public final boolean a8() {
      return this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
   }

   public final void e(boolean var1) {
      this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = var1;
   }

   public final boolean a9() {
      return this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII;
   }

   public final void f(boolean var1) {
      this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = var1;
   }

   public final int a_() {
      return this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
   }

   public final void a(int var1) {
      this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl = var1;
   }

   @Nullable
   public final Integer ba() {
      return this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
   }

   public final void a(@Nullable Integer var1) {
      this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = var1;
   }

   @Override
   public void aC() {
      Object var66 = null; // PX-FIX
      Object var52 = null; // PX-FIX
      Object var41 = null; // PX-FIX
      Object var39 = null; // PX-FIX
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      int var49;
      label370: {
         label325: {
            label371: {
               int[] var1;
               label356: {
                  label331: {
                     var1 = IllIlllIllIIlIIlIllllIlIIIIlIlllIIIlllIIlIllIlIIIIIlIllIlllIlllIlIIIIIlIllIIIlIllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
                     var49 = ((int[])IllIlllIllIIlIIlIllllIlIIIIlIlllIIIlllIIlIllIlIIIIIlIllIlllIlllIlIIIIIlIllIIIlIllIIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII)[this.W()
                        .ordinal()];
                     if (var1 != null) {
                        switch (var49) {
                           case 1:
                              var49 = ((int[])IllIlllIllIIlIIlIllllIlIIIIlIlllIIIlllIIlIllIlIIIIIlIllIlllIlllIlIIIIIlIllIIIlIllIIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)[this.aJ()
                                 .a()
                                 .ordinal()];
                              break;
                           case 2:
                              break label331;
                           case 3:
                              break label356;
                           default:
                              return;
                        }
                     }

                     label314: {
                        label357: {
                           label312: {
                              label333: {
                                 if (var1 != null) {
                                    switch (var49) {
                                       case 1:
                                          var39 = llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
                                          if (var1 == null) {
                                             break label333;
                                          }

                                          var49 = ((llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                             .aA()) ? 1 : 0);
                                          break;
                                       case 2:
                                          break label357;
                                       default:
                                          break label314;
                                    }
                                 }

                                 if (var49 == 0) {
                                    Object var40 = me.octo.client.utils.IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                       .d();
                                    if (var1 != null) {
                                       if (var40 == null) {
                                          var41 = null;
                                          break label312;
                                       }

                                       var40 = (Collection)var40;
                                    }

                                    Object var6 = var40;
                                    boolean var7 = false;
                                    var41 = ((me.octo.client.PXDyn)var6).toArray(new String[0]);
                                    break label312;
                                 }

                                 var39 = llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
                              }

                              llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] var42 = ((me.octo.client.PXDyn)var39).ag();
                              if (var42 != null) {
                                 llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] var27 = var42;
                                 boolean var8 = false;
                                 llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] var9 = var27;
                                 var var10 = new ArrayList(var27.length);
                                 boolean var11 = false;
                                 int var12 = 0;
                                 int var13 = var27.length;

                                 while (var12 < var13) {
                                    llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var14 = var9[var12];
                                    boolean var16 = false;
                                    var10.add(var14.a());
                                    var12++;
                                    if (var1 == null) {
                                       return;
                                    }

                                    if (var1 == null) {
                                       break;
                                    }
                                 }

                                 var var28 = var10;
                                 var8 = false;
                                 var41 = var28.toArray(new String[0]);
                              } else {
                                 var41 = null;
                              }
                           }

                           String[] var4 = ((String[])(Object)(((String)( var41))));
                           boolean var43;
                           if (var1 != null && var4 != null) {
                              String[] var5 = var4;
                              boolean var25 = false;
                              int var29 = 0;
                              int var33 = var4.length;

                              while (true) {
                                 if (var29 < var33) {
                                    String var35 = var5[var29];
                                    boolean var37 = false;
                                    CharSequence var44 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                       .a(var35);
                                    short var10001 = -1944;
                                    short var10002 = -1040;
                                    var43 = StringsKt.contains(var44, "Dreadfarm", false);
                                    if (var1 == null) {
                                       break;
                                    }

                                    label239:
                                    if (var1 != null) {
                                       if (!var43) {
                                          CharSequence var46 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                             .a(var35);
                                          var10001 = -1941;
                                          var10002 = -2236;
                                          var43 = StringsKt.contains(var46, "West Village", false);
                                          if (var1 == null) {
                                             break label239;
                                          }

                                          if (!var43) {
                                             var43 = false;
                                             break label239;
                                          }
                                       }

                                       var43 = true;
                                    }

                                    if (var43) {
                                       var43 = false;
                                       break;
                                    }

                                    var29++;
                                    if (var1 != null) {
                                       continue;
                                    }
                                 }

                                 var43 = true;
                                 break;
                              }

                              var43 = var43;
                           } else {
                              var43 = false;
                           }

                           if (var43) {
                              short var75 = -1952;
                              short var81 = 6477;
                              this.a(
                                 "In the wrong starting area: go to Dreadfarm",
                                 me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                              );
                              this.N();
                              return;
                           }

                           this.a(
                              IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                           );
                           if (var1 != null) {
                              return;
                           }
                        }

                        this.a(
                           IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll,
                           2000
                        );
                     }

                     if (var1 != null) {
                        return;
                     }
                  }

                  Object var47 = this;
                  if (var1 != null) {
                     if (this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI == null) {
                        return;
                     }

                     var47 = this;
                  }

                  if (var1 != null) {
                     if (((IllIlllIllIIlIIlIllllIlIIIIlIlllIIIlllIIlIllIlIIIIIlIllIlllIlllIlIIIIIlIllIIIlIllIIII)var47).llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl
                        >= 60) {
                        this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = null;
                        this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = null;
                        this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = null;
                        this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl = 0;
                        IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll var69 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                           .e();
                        if (var1 != null) {
                           if (var69.d()) {
                              return;
                           }

                           var69 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                              .e();
                        }

                        var69.k();
                        return;
                     }

                     Pair var48 = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
                     Intrinsics.checkNotNull(this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI);
                     var47 = var48.getSecond();
                  }

                  Vec3 var2 = (Vec3)var47;
                  Vec3 var3 = var1 != null && this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll != null
                     ? (Vec3)this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.getSecond()
                     : null;
                  if (var1 != null) {
                     if (var3 != null) {
                        double var86;
                        var49 = (
                                 var86 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                       .c(var2, var3)
                                    - 2.0
                              )
                              == 0.0
                           ? 0
                           : (var86 < 0.0 ? -1 : 1);
                        if (var1 == null) {
                           break label370;
                        }

                        if (var49 > 0) {
                           var49 = this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
                           break label370;
                        }
                     }

                     this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl = 0;
                  }

                  BlockPos var20 = me.octo.client.utils.lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .f(var2);
                  if (Intrinsics.areEqual(this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll, var20)) {
                     return;
                  }

                  double var23 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(var20, false);
                  me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var50 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  LocalPlayer var71 = this.ap().player;
                  Intrinsics.checkNotNull(var71);
                  double var30 = var50.c(
                     me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var71), var2
                  );
                  double var36 = this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII ? 1.0 : 2.0;
                  double var87;
                  var49 = (var87 = var23 - var36) == 0.0 ? 0 : (var87 < 0.0 ? -1 : 1);
                  label255:
                  if (var1 != null) {
                     label341: {
                        if (var49 > 0) {
                           var49 = ((IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                              .e()
                              .d()) ? 1 : 0);
                           if (var1 != null) {
                              if (var49 == 0) {
                                 break label341;
                              }

                              double var88;
                              var49 = (var88 = var30 - var36) == 0.0 ? 0 : (var88 < 0.0 ? -1 : 1);
                           }

                           if (var1 == null) {
                              break label255;
                           }

                           if (var49 > 0) {
                              break label341;
                           }
                        }

                        var52 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                           .e();
                        if (var1 == null) {
                           break label371;
                        }

                        var49 = ((me.octo.client.PXDyn)var52).d();
                        break label255;
                     }

                     BlockPos var53 = var20.below();
                     int var77 = -1950;
                     short var10003 = -12660;
                     Intrinsics.checkNotNullExpressionValue(var53, "below(...)");
                     BlockPos var38 = var53;
                     IllIlllIllIIlIIlIllllIlIIIIlIlllIIIlllIIlIllIlIIIIIlIllIlllIlllIlIIIIIlIllIIIlIllIIII var54 = this;
                     if (var1 != null) {
                        ClientLevel var55 = this.ap().level;
                        Intrinsics.checkNotNull(var55);
                        if (var55.getBlockState(var38).isAir()) {
                           var77 = var38.getX();
                           LocalPlayer var82 = this.ap().player;
                           Intrinsics.checkNotNull(var82);
                           var38 = new BlockPos(var77, (int)var82.getY(), var38.getZ());
                        }

                        var54 = this;
                     }

                     var54.b(var38);
                     if (var1 != null) {
                        return;
                     }
                     break label356;
                  }

                  if (var49 != 0) {
                     break label325;
                  }

                  var52 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                     .e();
                  break label371;
               }

               var49 = this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
               if (var1 != null) {
                  if (this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl >= 100) {
                     this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = null;
                     this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = null;
                     this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl = 0;
                     this.a(
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                     );
                     return;
                  }

                  var49 = ((me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .w()) ? 1 : 0);
               }

               if (var1 != null) {
                  if (var49 != 0) {
                     me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .p();
                  }

                  me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var57 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  Pair var72 = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
                  Intrinsics.checkNotNull(this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI);
                  Vec3 var73 = (Vec3)var72.getSecond();
                  LocalPlayer var79 = this.ap().player;
                  Intrinsics.checkNotNull(var79);
                  double var89;
                  var49 = (
                           var89 = var57.a(
                                 var73,
                                 me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var79)
                              )
                              - 2.0
                        )
                        == 0.0
                     ? 0
                     : (var89 < 0.0 ? -1 : 1);
               }

               if (var49 > 0) {
                  this.a(
                     IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                  );
               }

               BlockPos var19;
               label194: {
                  LocalPlayer var58 = this.ap().player;
                  Intrinsics.checkNotNull(var58);
                  Entity var59 = var58;
                  LocalPlayer var83 = this.ap().player;
                  Intrinsics.checkNotNull(var83);
                  float var84 = var83.getYRot();
                  LocalPlayer var10004 = this.ap().player;
                  Intrinsics.checkNotNull(var10004);
                  HitResult var18 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(
                     var59, 5.0, 1.0F, var84, var10004.getXRot()
                  );
                  me.octo.client.utils.lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII var60 = me.octo.client.utils.lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                  Pair var74 = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
                  Intrinsics.checkNotNull(this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI);
                  var19 = var60.f((Vec3)var74.getSecond());
                  BlockPos var21 = a(this, 0.0, 1, null);
                  boolean var61 = Intrinsics.areEqual(var1 != null && var21 != null ? var21.getCenter() : null, var19.getCenter());
                  if (var1 != null) {
                     if (!var61) {
                        break label194;
                     }

                     this.ap().hitResult = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(
                        var19
                     );
                     me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .i();
                  }

                  this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = var19;
                  this.a(
                     IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                  );
                  this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = false;
                  me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .g();
                  if (var1 != null) {
                     return;
                  }
               }

               lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var24 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a(var19);
               float var26 = var24.f();
               float var31 = var24.g();
               LocalPlayer var62 = this.ap().player;
               Intrinsics.checkNotNull(var62);
               float var90;
               var49 = (var90 = var62.getYRot() - var26) == 0.0F ? 0 : (var90 < 0.0F ? -1 : 1);
               if (var1 != null) {
                  var49 = (((var49 == 0) ? 1 : 0));
               }

               label343: {
                  label184: {
                     label344: {
                        if ((var49 != 0)) {
                           LocalPlayer var64 = this.ap().player;
                           Intrinsics.checkNotNull(var64);
                           float var91;
                           var49 = (var91 = var64.getXRot() - var31) == 0.0F ? 0 : (var91 < 0.0F ? -1 : 1);
                           if (var1 != null) {
                              var49 = (((var49 == 0) ? 1 : 0));
                           }

                           if ((var49 != 0)) {
                              break label344;
                           }
                        }

                        var66 = this;
                        if (var1 == null) {
                           break label184;
                        }

                        if (!this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll) {
                           break label343;
                        }
                     }

                     var66 = this;
                  }

                  this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = true;
                  List var34 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.a(
                     me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                     var19,
                     CollectionsKt.emptyList(),
                     null,
                     0.0,
                     0.0,
                     0.0);
                  Object var67 = var34;
                  if (var1 != null) {
                     if (var34.isEmpty()) {
                        this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = false;
                        this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = true;
                        this.a(
                           IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                        );
                        return;
                     }

                     var67 = CollectionsKt.first(var34);
                  }

                  me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a((Vec3)var67);
                  if (var1 != null) {
                     return;
                  }
               }

               Vec3 var68 = var19.getCenter();
               short var80 = -1948;
               short var85 = -25457;
               Intrinsics.checkNotNullExpressionValue(var68, "getCenter(...)");
               me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a(var68);
               return;
            }

            ((me.octo.client.PXDyn)var52).k();
         }

         this.a(
            IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
         );
         this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl = 0;
         return;
      }

      int var22 = var49;
      this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl = var22 + 1;
   }

   private final void b(BlockPos var1) {
      int[] var2 = IllIlllIllIIlIIlIllllIlIIIIlIlllIIIlllIIlIllIlIIIIIlIllIlllIlllIlIIIIIlIllIIIlIllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      int var10000 = ((IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .e()
         .d()) ? 1 : 0);
      if (var2 != null) {
         if ((var10000 == 0)) {
            label38: {
               if (this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI != null) {
                  me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var4 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  BlockPos var10002 = this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
                  Intrinsics.checkNotNull(this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI);
                  double var7;
                  var10000 = (var7 = var4.a(var1, var10002) - 2.0) == 0.0 ? 0 : (var7 < 0.0 ? -1 : 1);
                  if (var2 == null) {
                     break label38;
                  }

                  if (var10000 <= 0) {
                     var10000 = 0;
                     break label38;
                  }
               }

               var10000 = 1;
            }

            int var3 = var10000;
            var10000 = var3;
            if (var2 != null) {
               if (var3 == 0) {
                  return;
               }

               var10000 = ((java.util.function.Supplier<Integer>)(() -> { this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII.a(300); return 0; })).get();
            }

            if (var2 != null) {
               if (var10000 == 0) {
                  return;
               }

               this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = var1;
               IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                  ((BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                     .e())),
                  ((IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll)(Object)(var1)),
                  0,
                  false);
            }

            this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII.f();
            return;
         }

         this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = var1;
         IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
            ((BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
               .e())),
            ((IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll)(Object)(var1)),
            0,
            false);
      }

      this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII.f();
   }

   private final BlockPos b(double var1) {
      int[] var10000 = IllIlllIllIIlIIlIllllIlIIIIlIlllIIIlllIIlIllIlIIIIIlIllIlllIlllIlIIIIIlIllIIIlIllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      LocalPlayer var10001 = this.ap().player;
      Intrinsics.checkNotNull(var10001);
      Entity var8 = var10001;
      LocalPlayer var10004 = this.ap().player;
      Intrinsics.checkNotNull(var10004);
      float var11 = var10004.getYRot();
      LocalPlayer var10005 = this.ap().player;
      Intrinsics.checkNotNull(var10005);
      HitResult var4 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(
         var8, var1, 1.0F, var11, var10005.getXRot()
      );
      int[] var3 = var10000;
      HitResult var6 = var4;
      if (var3 != null) {
         if (var4.getType() != Type.BLOCK) {
            return null;
         }

         short var9 = -1946;
         short var10002 = -22283;
         Intrinsics.checkNotNull(var4, "null cannot be cast to non-null type net.minecraft.world.phys.BlockHitResult");
         var6 = var4;
      }

      BlockPos var7 = ((BlockHitResult)var6).getBlockPos();
      short var10 = -1940;
      short var10003 = 7170;
      Intrinsics.checkNotNullExpressionValue(var7, "getBlockPos(...)");
      return var7;
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.lIIIlIllllIIllIlIlIllIlIllllIIlIIlIIIllllIlIllIIllIIIlllIIIIllIlIIllIlllIIIIllIIlIIlI var1) {
      int[] var10000 = IllIlllIllIIlIIlIllllIlIIIIlIlllIIIlllIIlIllIlIIIIIlIllIlllIlllIlIIIIIlIllIIIlIllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      short var10002 = -1937;
      short var10003 = 25135;
      Intrinsics.checkNotNullParameter(var1, "event");
      ClientboundLevelParticlesPacket var3 = var1.k();
      int[] var2 = var10000;
      Vec3 var4 = new Vec3(var3.getX(), var3.getY(), var3.getZ());
      if (this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI != null) {
         me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var8 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         LocalPlayer var10001 = this.ap().player;
         Intrinsics.checkNotNull(var10001);
         if (var8.c(me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var10001), var4) > 10.0
            )
          {
            return;
         }

         if (this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll != null) {
            me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var9 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            Pair var13 = this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
            Intrinsics.checkNotNull(this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll);
            if (var9.c((Vec3)var13.getSecond(), var4) > 5.0) {
               return;
            }
         }
      }

      label44: {
         ParticleType var5 = var3.getParticle().getType();
         boolean var10 = Intrinsics.areEqual(var5, ParticleTypes.FIREWORK);
         if (var2 != null) {
            if (var10) {
               IllIlllIllIIlIIlIllllIlIIIIlIlllIIIlllIIlIllIlIIIIIlIllIlllIlllIlIIIIIlIllIIIlIllIIII var11 = this;
               if (var2 != null) {
                  if (this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI != null) {
                     this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
                  }

                  var11 = this;
               }

               var11.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = new Pair(var3.getParticle(), var4);
               if (var2 != null) {
                  break label44;
               }
            }

            var10 = Intrinsics.areEqual(var5, ParticleTypes.EXPLOSION);
         }

         if (var10) {
            if (this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI != null) {
               Pair var6 = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
               boolean var7 = false;
               if (var2 != null) {
                  me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var12 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  Pair var14 = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
                  Intrinsics.checkNotNull(this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI);
                  if (var12.c((Vec3)var14.getSecond(), var4) < 1.0) {
                     this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = null;
                     this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = null;
                  }
               }
            }
         }
      }

      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         IllIlllIllIIlIIlIllllIlIIIIlIlllIIIlllIIlIllIlIIIIIlIllIlllIlllIlIIIIIlIllIIIlIllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b(
            new int[1]
         );
      }
   }

   @Override
   public void M() {
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      int[] var1;
      Integer var5;
      label26: {
         int[] var10000 = IllIlllIllIIlIIlIllllIlIIIIlIlllIIIlllIIlIllIlIIIIIlIllIlllIlllIlIIIIIlIllIIIlIllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
         this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = null;
         this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = null;
         this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = null;
         var1 = var10000;
         this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = null;
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var10003 = IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
         Vec3 var10005 = Vec3.ZERO;
         short var10007 = -1951;
         short var10008 = -6268;
         Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
         short var10006 = -1945;
         var10007 = 24991;
         this.a(new lIllllIllllIIllIlIllIlIlIIIIlIIlllllllIlIIIIIIlIlIlIIIlIIIIllIllllIllllIIIlllIIIIlIlI(var10003, 2000, var10005, "/warp rift"));
         if (var1 != null) {
            short var10002 = -1938;
            short var8 = 21015;
            me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10001 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a("Wand of Farming");
            if (var10001 != null) {
               var5 = var10001.b();
               break label26;
            }
         }

         var5 = null;
      }

      this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = var5;
      IllIlllIllIIlIIlIllllIlIIIIlIlllIIIlllIIlIllIlIIIIIlIllIlllIlllIlIIIIIlIllIIIlIllIIII var2 = this;
      if (var1 != null) {
         if (this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl == null) {
            short var4 = -1947;
            short var7 = -4933;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.h(
               "You need a Wand of Farming to use this macro! Disabling..."
            );
            this.N();
            return;
         }

         me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll var3 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         var5 = this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
         Intrinsics.checkNotNull(this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl);
         var3.b(var5);
         this.aM();
         super.M();
         var2 = this;
      }

      var2.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
      );
      if (var1 == null) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[3]
         );
      }
   }

   @Override
   public void N() {
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = null;
      this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = null;
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = null;
      this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = null;
      this.aN();
      super.N();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[15];
      int var3 = 0;
      String var2 = "ë\u0093f§N\u00ad/\u0081Í½Î\tÖFÂ}\u0004,ò\u001f0\u000fõ\u008c\u0089æ¦gò\u0093ÅÓ\u001aN*\u0003»\u0005¥}ü'6\tv_\u0083èÉ\nÔDÍ\u001fVíõÆ5óx¿2^Éï\u0081\u0007\u0004=%\u0081\u001bU[×SzK\n\b\u0096¤³\u0097\u000e·¸jâ\u0000<Ä\u0015\u008b\u0016jQN.\f\u0016mèN4Y¯\u0006ª¤\u008d¨\u000eÎûÂ«Ó\f£\u009a\u008bV=Ý^\u001d:\u000bÈ\u0082åñÁ\u009cH\rdû\u0082\u0006ç4\bå\u001d\ns`O[X\u009b<Ì\u001c\u000f.òÌô\u0098G\u0082\f¢»0\u000eÁ#/\u009d\u0019æR\u0007²è\u0093\u0004é\u009fÔ\u008b(LÔx±æãb]ðÿ6vpj+\u009e¸r5c§\u0086b}DºQÄ\u0083¸ÈD\u0086\t±ÏØÐX\u0005È{ê0\u0084Ã\u000e×\u0093Ä\u0096k»·\u0088$-\u0096Jµ\u0010´F\u00ad\u0092§4CÕ;ë¬\u0095\u001aP&\u0099\nwe¡\u0019\u001d\u0003ËðTÊ+Õ:\u001eÎ\u009bzR,k\u0097a\u0003\u0093üÿ\u0094\u0093õ3\u0016!\u009c¹!Amç¤;¨(½ZQé¡ã\u008d\u008f\u008eDmu";
      int var4 = "ë\u0093f§N\u00ad/\u0081Í½Î\tÖFÂ}\u0004,ò\u001f0\u000fõ\u008c\u0089æ¦gò\u0093ÅÓ\u001aN*\u0003»\u0005¥}ü'6\tv_\u0083èÉ\nÔDÍ\u001fVíõÆ5óx¿2^Éï\u0081\u0007\u0004=%\u0081\u001bU[×SzK\n\b\u0096¤³\u0097\u000e·¸jâ\u0000<Ä\u0015\u008b\u0016jQN.\f\u0016mèN4Y¯\u0006ª¤\u008d¨\u000eÎûÂ«Ó\f£\u009a\u008bV=Ý^\u001d:\u000bÈ\u0082åñÁ\u009cH\rdû\u0082\u0006ç4\bå\u001d\ns`O[X\u009b<Ì\u001c\u000f.òÌô\u0098G\u0082\f¢»0\u000eÁ#/\u009d\u0019æR\u0007²è\u0093\u0004é\u009fÔ\u008b(LÔx±æãb]ðÿ6vpj+\u009e¸r5c§\u0086b}DºQÄ\u0083¸ÈD\u0086\t±ÏØÐX\u0005È{ê0\u0084Ã\u000e×\u0093Ä\u0096k»·\u0088$-\u0096Jµ\u0010´F\u00ad\u0092§4CÕ;ë¬\u0095\u001aP&\u0099\nwe¡\u0019\u001d\u0003ËðTÊ+Õ:\u001eÎ\u009bzR,k\u0097a\u0003\u0093üÿ\u0094\u0093õ3\u0016!\u009c¹!Amç¤;¨(½ZQé¡ã\u008d\u008f\u008eDmu"
         .length();
      char var1 = 16;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 47;
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
                     case 0 -> 17;
                     case 1 -> 21;
                     case 2 -> 12;
                     case 3 -> 54;
                     case 4 -> 95;
                     case 5 -> 48;
                     default -> 69;
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
                     h = var5;
                     i = new String[15];
                     lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = new IllIlllIllIIlIIlIllllIlIIIIlIlllIIIlllIIlIllIlIIIIIlIllIlllIlllIlIIIIIlIllIIIlIllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = new IllIlllIllIIlIIlIllllIlIIIIlIlllIIIlllIIlIllIlIIIIIlIllIlllIlllIlIIIIIlIllIIIlIllIIII();
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

                  var2 = "EûVÚ\nu0Q§ñ;´à}c";
                  var4 = "EûVÚ\nu0Q§ñ;´à}c".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 53;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -1940) & 65535;
      if (i[var2] == null) {
         char[] var3 = h[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 172;
            case 1 -> 86;
            case 2 -> 17;
            case 3 -> 105;
            case 4 -> 98;
            case 5 -> 120;
            case 6 -> 229;
            case 7 -> 170;
            case 8 -> 82;
            case 9 -> 148;
            case 10 -> 158;
            case 11 -> 84;
            case 12 -> 220;
            case 13 -> 41;
            case 14 -> 114;
            case 15 -> 136;
            case 16 -> 207;
            case 17 -> 66;
            case 18 -> 107;
            case 19 -> 205;
            case 20 -> 191;
            case 21 -> 144;
            case 22 -> 70;
            case 23 -> 30;
            case 24 -> 203;
            case 25 -> 151;
            case 26 -> 119;
            case 27 -> 174;
            case 28 -> 92;
            case 29 -> 21;
            case 30 -> 74;
            case 31 -> 190;
            case 32 -> 52;
            case 33 -> 130;
            case 34 -> 58;
            case 35 -> 252;
            case 36 -> 4;
            case 37 -> 255;
            case 38 -> 186;
            case 39 -> 147;
            case 40 -> 197;
            case 41 -> 210;
            case 42 -> 15;
            case 43 -> 42;
            case 44 -> 72;
            case 45 -> 215;
            case 46 -> 87;
            case 47 -> 199;
            case 48 -> 11;
            case 49 -> 222;
            case 50 -> 188;
            case 51 -> 156;
            case 52 -> 43;
            case 53 -> 79;
            case 54 -> 232;
            case 55 -> 126;
            case 56 -> 194;
            case 57 -> 155;
            case 58 -> 179;
            case 59 -> 12;
            case 60 -> 131;
            case 61 -> 51;
            case 62 -> 162;
            case 63 -> 44;
            case 64 -> 139;
            case 65 -> 246;
            case 66 -> 16;
            case 67 -> 75;
            case 68 -> 163;
            case 69 -> 143;
            case 70 -> 240;
            case 71 -> 219;
            case 72 -> 228;
            case 73 -> 57;
            case 74 -> 213;
            case 75 -> 204;
            case 76 -> 216;
            case 77 -> 8;
            case 78 -> 242;
            case 79 -> 161;
            case 80 -> 102;
            case 81 -> 89;
            case 82 -> 109;
            case 83 -> 211;
            case 84 -> 77;
            case 85 -> 85;
            case 86 -> 55;
            case 87 -> 125;
            case 88 -> 22;
            case 89 -> 212;
            case 90 -> 150;
            case 91 -> 231;
            case 92 -> 198;
            case 93 -> 166;
            case 94 -> 140;
            case 95 -> 124;
            case 96 -> 236;
            case 97 -> 73;
            case 98 -> 39;
            case 99 -> 88;
            case 100 -> 157;
            case 101 -> 101;
            case 102 -> 63;
            case 103 -> 97;
            case 104 -> 29;
            case 105 -> 33;
            case 106 -> 25;
            case 107 -> 200;
            case 108 -> 93;
            case 109 -> 37;
            case 110 -> 28;
            case 111 -> 118;
            case 112 -> 62;
            case 113 -> 251;
            case 114 -> 128;
            case 115 -> 13;
            case 116 -> 224;
            case 117 -> 149;
            case 118 -> 117;
            case 119 -> 14;
            case 120 -> 95;
            case 121 -> 106;
            case 122 -> 23;
            case 123 -> 175;
            case 124 -> 206;
            case 125 -> 192;
            case 126 -> 110;
            case 127 -> 169;
            case 128 -> 3;
            case 129 -> 195;
            case 130 -> 100;
            case 131 -> 34;
            case 132 -> 32;
            case 133 -> 208;
            case 134 -> 36;
            case 135 -> 223;
            case 136 -> 180;
            case 137 -> 189;
            case 138 -> 221;
            case 139 -> 2;
            case 140 -> 184;
            case 141 -> 127;
            case 142 -> 64;
            case 143 -> 47;
            case 144 -> 103;
            case 145 -> 241;
            case 146 -> 40;
            case 147 -> 226;
            case 148 -> 233;
            case 149 -> 154;
            case 150 -> 237;
            case 151 -> 45;
            case 152 -> 173;
            case 153 -> 135;
            case 154 -> 19;
            case 155 -> 49;
            case 156 -> 46;
            case 157 -> 177;
            case 158 -> 26;
            case 159 -> 83;
            case 160 -> 152;
            case 161 -> 230;
            case 162 -> 116;
            case 163 -> 145;
            case 164 -> 18;
            case 165 -> 0;
            case 166 -> 217;
            case 167 -> 185;
            case 168 -> 59;
            case 169 -> 214;
            case 170 -> 65;
            case 171 -> 178;
            case 172 -> 61;
            case 173 -> 10;
            case 174 -> 146;
            case 175 -> 209;
            case 176 -> 90;
            case 177 -> 165;
            case 178 -> 159;
            case 179 -> 54;
            case 180 -> 81;
            case 181 -> 111;
            case 182 -> 249;
            case 183 -> 112;
            case 184 -> 60;
            case 185 -> 78;
            case 186 -> 227;
            case 187 -> 254;
            case 188 -> 48;
            case 189 -> 121;
            case 190 -> 244;
            case 191 -> 69;
            case 192 -> 133;
            case 193 -> 9;
            case 194 -> 1;
            case 195 -> 235;
            case 196 -> 31;
            case 197 -> 7;
            case 198 -> 183;
            case 199 -> 96;
            case 200 -> 99;
            case 201 -> 67;
            case 202 -> 132;
            case 203 -> 123;
            case 204 -> 153;
            case 205 -> 50;
            case 206 -> 91;
            case 207 -> 24;
            case 208 -> 76;
            case 209 -> 129;
            case 210 -> 38;
            case 211 -> 56;
            case 212 -> 35;
            case 213 -> 80;
            case 214 -> 122;
            case 215 -> 5;
            case 216 -> 6;
            case 217 -> 53;
            case 218 -> 108;
            case 219 -> 202;
            case 220 -> 193;
            case 221 -> 27;
            case 222 -> 20;
            case 223 -> 137;
            case 224 -> 196;
            case 225 -> 164;
            case 226 -> 247;
            case 227 -> 187;
            case 228 -> 243;
            case 229 -> 176;
            case 230 -> 218;
            case 231 -> 225;
            case 232 -> 160;
            case 233 -> 250;
            case 234 -> 113;
            case 235 -> 171;
            case 236 -> 234;
            case 237 -> 134;
            case 238 -> 245;
            case 239 -> 138;
            case 240 -> 248;
            case 241 -> 181;
            case 242 -> 201;
            case 243 -> 71;
            case 244 -> 94;
            case 245 -> 68;
            case 246 -> 238;
            case 247 -> 141;
            case 248 -> 182;
            case 249 -> 115;
            case 250 -> 253;
            case 251 -> 167;
            case 252 -> 239;
            case 253 -> 168;
            case 254 -> 104;
            default -> 142;
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

         i[var2] = new String(var3).intern();
      }

      return i[var2];
   }

   static BlockPos a(IllIlllIllIIlIIlIllllIlIIIIlIlllIIIlllIIlIllIlIIIIIlIllIlllIlllIlIIIIIlIllIIIlIllIIII var0, double var1, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         var1 = 5.0;
      }

      return var0.b(var1);
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

      private static int[] IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final IllIlllIllIIlIIlIllllIlIIIIlIlllIIIlllIIlIllIlIIIIIlIllIlllIlllIlIIIIIlIllIIIlIllIIII a() {
         return IllIlllIllIIlIIlIllllIlIIIIlIlllIIIlllIIlIllIlIIIIIlIllIlllIlllIlIIIIIlIllIIIlIllIIII.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
      }

      public static void b(int[] var0) {
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var0;
      }

      public static int[] b() {
         return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      static {
         if (b() == null) {
            b(new int[3]);
         }
      }
   
   public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker p0) {
      this();
   }
}

   public static final me.octo.client.IllIlllIllIIlIIlIllllIlIIIIlIlllIIIlllIIlIllIlIIIIIlIllIlllIlllIlIIIIIlIllIIIlIllIIII bb() {
      return null;
   }
}
