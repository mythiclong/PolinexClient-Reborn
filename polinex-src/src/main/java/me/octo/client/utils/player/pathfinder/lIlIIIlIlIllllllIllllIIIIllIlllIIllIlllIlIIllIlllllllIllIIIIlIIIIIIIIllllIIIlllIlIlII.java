package me.octo.client.utils.player.pathfinder;

import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2DoubleOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.ranges.IntRange;
import me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
import me.octo.client.utils.IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII;
import me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.BlockPos.MutableBlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.status.ChunkStatus;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII {
   @NotNull
   public static lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static ArrayList<lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static List<? extends AABB> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static AABB lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static AABB IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static Minecraft IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private static List<me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI> lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static byte IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static byte llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static byte lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static byte lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static float lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private static me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static long IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private static MutableBlockPos llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @Nullable
   private static ChunkAccess IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static int IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static int IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   @NotNull
   private static Long2ByteOpenHashMap IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   @NotNull
   private static Long2DoubleOpenHashMap llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   @NotNull
   private static lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   @NotNull
   private static HashMap<Long, lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   @NotNull
   private static Long2DoubleOpenHashMap llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   @NotNull
   private static Long2DoubleOpenHashMap lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   private static boolean IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   private static String[] a;
   private static String[] b;

   private lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII() {
   }

   @NotNull
   public final ArrayList<lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> a() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @SubscribeEvent
   public final void a(@NotNull IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      short var10001 = 28566;
      short var10002 = 17768;
      Intrinsics.checkNotNullParameter(var1, "event");
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.clear();
   }

   public final void a(boolean var1, boolean var2, boolean var3, boolean var4) {
      int var5;
      ArrayList var6;
      int var7;
      var6 = new ArrayList();
      var7 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      var6.add(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      var5 = var7;
      var6.add(IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
      var7 =(( var1) ? 1 : 0);
      label61:
      if (var5 == 0) {
         if (!var1) {
            var7 =(( var2) ? 1 : 0);
            if (var5 != 0) {
               break label61;
            }

            if (!var2) {
               var7 =(( var3) ? 1 : 0);
               if (var5 != 0) {
                  break label61;
               }

               if (!var3) {
                  var7 =(( var4) ? 1 : 0);
                  if (var5 != 0) {
                     break label61;
                  }

                  if (!var4) {
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var6;
                     return;
                  }
               }
            }
         }

         var7 =(( var1) ? 1 : 0);
      }

      if (var5 == 0) {
         if ((var7 == 0)) {
            var6.add(new AABB(new Vec3(0.0, 0.0, 0.0), new Vec3(513.5, 256.0, 513.5)));
         }

         var7 =(( var3) ? 1 : 0);
      }

      if (var5 == 0) {
         if ((var7 == 0)) {
            var6.add(new AABB(new Vec3(513.5, 0.0, 513.5), new Vec3(1000.0, 256.0, 1000.0)));
         }

         var7 =(( var2) ? 1 : 0);
      }

      if (var5 == 0) {
         if ((var7 == 0)) {
            var6.add(new AABB(new Vec3(0.0, 0.0, 513.5), new Vec3(513.5, 256.0, 1000.0)));
         }

         var7 =(( var4) ? 1 : 0);
      }

      if (var5 == 0 && (var7 == 0)) {
         var6.add(new AABB(new Vec3(513.5, 0.0, 0.0), new Vec3(1000.0, 256.0, 513.5)));
      }

      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var6;
   }

   public final boolean a(@NotNull List<String> var1, @NotNull Vec3 var2, double var3) { String var14 = null; // PX-FIX hoist
        
      Object var18 = null; // PX-FIX
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      short var10002 = 28571;
      short var10003 = 12163;
      Intrinsics.checkNotNullParameter(var1, "names");
      int var5 = var10000;
      Vec3 var17 = var2;
      if (var5 != 0) {
         short var10001 = 28555;
         var10002 = 22255;
         Intrinsics.checkNotNullParameter(var2, "playerPos");
         if (var1.isEmpty()) {
            return true;
         }

         var17 = var2;
      }

      double var6;
      double var8;
      var6 = var17.x;
      var8 = var2.z;
      var var10 = var1;
      boolean var11 = false;
      var18 = var10;
      label142:
      if (var5 != 0) {
         if (var10 instanceof Collection) {
            var18 = (Collection)var10;
            if (var5 == 0) {
               break label142;
            }

            if (((Collection<?>)var18).isEmpty()) {
               return (0 != 0);
            }
         }

         var18 = var10;
      }

      label133:
      for (Object var13 : (Iterable<?>)(var18)) {
          var14 = (String)var13;
         boolean var15 = false;
         String var16 = var14;
         var10000 = var14.hashCode();

         do {
            label129: {
               label150: {
                  if ((var5 == 0)) {
                     switch (var10000) {
                        case -2064978723:
                           short var23 = 28561;
                           var10002 = -16055;
                           var10000 = ((var16.equals("Jungle")) ? 1 : 0);
                           if ((var5 == 0)) {
                              if (var10000 == 0) {
                                 break label150;
                              }

                              double var33;
                              var10000 = (var33 = var6 - (513.5 + var3)) == 0.0 ? 0 : (var33 < 0.0 ? -1 : 1);
                           }

                           if ((var5 != 0)) {
                              break label129;
                           }

                           if (var10000 <= 0) {
                              double var34;
                              var10000 = (var34 = var8 - (513.5 + var3)) == 0.0 ? 0 : (var34 < 0.0 ? -1 : 1);
                              if ((var5 != 0)) {
                                 break label129;
                              }

                              if (var10000 <= 0) {
                                 var10000 = 1;
                                 break label129;
                              }
                           }

                           var10000 = 0;
                           break label129;
                        case -1027402425:
                           short var22 = 28573;
                           var10002 = -2833;
                           var10000 = ((var16.equals("Precursor Remnants")) ? 1 : 0);
                           if ((var5 == 0)) {
                              if (var10000 == 0) {
                                 break label150;
                              }

                              double var31;
                              var10000 = (var31 = var6 - (513.5 - var3)) == 0.0 ? 0 : (var31 < 0.0 ? -1 : 1);
                           }

                           if ((var5 != 0)) {
                              break label129;
                           }

                           if (var10000 >= 0) {
                              double var32;
                              var10000 = (var32 = var8 - (513.5 - var3)) == 0.0 ? 0 : (var32 < 0.0 ? -1 : 1);
                              if ((var5 != 0)) {
                                 break label129;
                              }

                              if (var10000 >= 0) {
                                 var10000 = 1;
                                 break label129;
                              }
                           }

                           var10000 = 0;
                           break label129;
                        case 1143013776:
                           short var21 = 28565;
                           var10002 = 19223;
                           var10000 = ((var16.equals("Mithril Deposits")) ? 1 : 0);
                           break;
                        case 1506266854:
                           short var20 = 28559;
                           var10002 = -21069;
                           var10000 = ((var16.equals("Goblin Holdout")) ? 1 : 0);
                           if ((var5 == 0)) {
                              if (var10000 == 0) {
                                 break label150;
                              }

                              double var29;
                              var10000 = (var29 = var6 - (513.5 + var3)) == 0.0 ? 0 : (var29 < 0.0 ? -1 : 1);
                           }

                           if ((var5 != 0)) {
                              break label129;
                           }

                           if (var10000 <= 0) {
                              double var30;
                              var10000 = (var30 = var8 - (513.5 - var3)) == 0.0 ? 0 : (var30 < 0.0 ? -1 : 1);
                              if ((var5 != 0)) {
                                 break label129;
                              }

                              if (var10000 >= 0) {
                                 var10000 = 1;
                                 break label129;
                              }
                           }

                           var10000 = 0;
                           break label129;
                        default:
                           break label150;
                     }
                  }

                  if ((var5 == 0)) {
                     if (var10000 == 0) {
                        break label150;
                     }

                     double var35;
                     var10000 = (var35 = var6 - (513.5 - var3)) == 0.0 ? 0 : (var35 < 0.0 ? -1 : 1);
                  }

                  if ((var5 != 0)) {
                     break label129;
                  }

                  if (var10000 >= 0) {
                     double var36;
                     var10000 = (var36 = var8 - (513.5 + var3)) == 0.0 ? 0 : (var36 < 0.0 ? -1 : 1);
                     if ((var5 != 0)) {
                        break label129;
                     }

                     if (var10000 <= 0) {
                        var10000 = 1;
                        break label129;
                     }
                  }

                  var10000 = 0;
                  break label129;
               }

               var10000 = 1;
            }

            if (var10000 == 0) {
               continue label133;
            }

            var10000 = 1;
         } while (var5 == 0);

         return (1 != 0);
      }

      return (0 != 0);
   }

   public static boolean a(lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII var0, List<String> var1, Vec3 var2, double var3, int var4, Object var5) {
      int mode = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      if (mode == 0) {
         return (var4 & 4) != 0;
      }
      if ((var4 & 4) != 0) {
         var3 = 0.0;
      }
      return var0.a(var1, var2, var3);
   }

   public static boolean a(lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII var0, Vec3 var1, double var2, int var3, Object var4) {
      int mode = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      if (mode == 0) {
         return (var3 & 2) != 0;
      }
      if ((var3 & 2) != 0) {
         var2 = 0.0;
      }
      return var0.a(var1, var2);
   }

   public static List<BlockPos> a(lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII var0, boolean var1, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         var1 = false;
      }
      return var0.a(var1);
   }

   public final boolean a(@NotNull Vec3 var1, double var2) {
      short var10001 = 28555;
      short var10002 = 22255;
      Intrinsics.checkNotNullParameter(var1, "playerPos");
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.inflate(var2).contains(var1);
   }

   public final boolean a(@NotNull Vec3 var1) {
      short var10001 = 28556;
      short var10002 = -18674;
      Intrinsics.checkNotNullParameter(var1, "playerPos");
      return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.contains(var1);
   }

   private final ClientLevel b() {
      ClientLevel var10000 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.level;
      Intrinsics.checkNotNull(IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.level);
      return var10000;
   }

   public final float c() {
      return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   public final void a(float var1) {
      lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var1;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Nullable
   public final List<BlockPos> a(boolean var1) { ObjectRef var7 = null; // PX-FIX hoist
         ObjectRef var14 = null; // PX-FIX hoist
        
      int var2 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      if (var2 == 0 && IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.player != null) {
         LocalPlayer var3 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.player;
         IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = var1;
         ObjectRef var4 = new ObjectRef();
         BlockPos var10001 = BlockPos.ZERO;
         short var10003 = 28563;
         short var10004 = 19148;
         Intrinsics.checkNotNullExpressionValue(BlockPos.ZERO, "ZERO");
         var4.element = var10001;
         ObjectRef var5 = new ObjectRef();
         var10001 = BlockPos.ZERO;
         var10003 = 28557;
         var10004 = -939;
         Intrinsics.checkNotNullExpressionValue(BlockPos.ZERO, "ZERO");
         var5.element = var10001;
         ObjectRef var6 = new ObjectRef();
         var10001 = BlockPos.ZERO;
         var10003 = 28557;
         var10004 = -939;
         Intrinsics.checkNotNullExpressionValue(BlockPos.ZERO, "ZERO");
         var6.element = var10001;
          var7 = new ObjectRef();
         var10001 = BlockPos.ZERO;
         var10003 = 28557;
         var10004 = -939;
         Intrinsics.checkNotNullExpressionValue(BlockPos.ZERO, "ZERO");
         var7.element = var10001;
         IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.f();
         IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.clear();
         lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll.clear();
         IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = null;
         IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = Integer.MAX_VALUE;
         IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = Integer.MAX_VALUE;
         if (var2 == 0) {
            BlockPos var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a(var3);
            if (var10000 != null) {
               BlockPos var8 = var10000;
               long var9 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a(var8);
               byte var11 = this.d(var9);
               lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var13 = new lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                  var9,
                  var11,
                  new me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
                     0, 0, 0
                  )
               );
               boolean var15 = false;
               var13.b(IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var13.a()));
               var13.c(0.0);
               lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var12 = var13;
               ObjectRef var29 = new ObjectRef();
               var10001 = BlockPos.ZERO;
               var10003 = 28557;
               var10004 = -939;
               Intrinsics.checkNotNullExpressionValue(BlockPos.ZERO, "ZERO");
               var29.element = var10001;
                var14 = new ObjectRef();
               var10001 = BlockPos.ZERO;
               var10003 = 28557;
               var10004 = -939;
               Intrinsics.checkNotNullExpressionValue(BlockPos.ZERO, "ZERO");
               var14.element = var10001;
               ObjectRef var30 = new ObjectRef();
               var10001 = BlockPos.ZERO;
               var10003 = 28557;
               var10004 = -939;
               Intrinsics.checkNotNullExpressionValue(BlockPos.ZERO, "ZERO");
               var30.element = var10001;
               ArrayList var16 = new ArrayList();
               Integer[] var18 = new Integer[]{0, -1, 1, -2, 2, -3, 3};
               Iterator var17 = CollectionsKt.listOf(var18).iterator();

               label182:
               while (true) {
                  int var45 = ((var17.hasNext()) ? 1 : 0);

                  label179:
                  while (var45 != 0) {
                     int var32 = ((Number)var17.next()).intValue();
                     int var46 = var32;
                     if (var2 == 0) {
                        switch (var32) {
                           case 0:
                              a(var4, var5, var6, var7, lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl);
                              a(var29, var8, var7, var14, var5, var30, var6);
                              if (var2 == 0) {
                                 break;
                              }
                           case -3:
                           case -2:
                           case -1:
                              a(var4, var5, var6, var7, lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl - 90.0F);
                              a(var29, var8, var7, var14, var5, var30, var6);
                              if (var2 == 0) {
                                 break;
                              }
                           case 1:
                           case 2:
                           case 3:
                              a(var4, var5, var6, var7, lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl + 90.0F);
                              a(var29, var8, var7, var14, var5, var30, var6);
                        }

                        var46 = 0;
                     }

                     int var19 = var46;

                     while (true) {
                        if (var19 >= 5) {
                           continue label182;
                        }

                        var45 = var19;
                        if (var2 != 0) {
                           break;
                        }
                        BlockPos var20;
                        label195: {
                           BlockPos var21 = switch (var19) {
                              case 0 -> var8.offset(((BlockPos)var4.element).multiply(30));
                              case 1 -> var8.offset(((BlockPos)var4.element).multiply(15));
                              case 2 -> var8.offset(((BlockPos)var4.element).multiply(10));
                              default -> var8.offset(((BlockPos)var4.element).multiply(30 + (var19 - 2) * 10));
                           };
                           Intrinsics.checkNotNull(var21);
                           var20 = var21;
                           int var48 = Math.abs(var32);
                           byte var65 = 2;
                           if (var2 == 0) {
                              if (var48 == 2) {
                                 var10000 = var21.offset(((BlockPos)var7.element).multiply(15));
                                 short var10002 = 28564;
                                 var10003 = -21640;
                                 Intrinsics.checkNotNullExpressionValue(var10000, "offset(...)");
                                 var20 = var10000;
                                 if (var2 == 0) {
                                    break label195;
                                 }
                              }

                              var48 = var32;
                              var65 = -3;
                           }

                           if (var2 == 0) {
                              if (var48 == var65) {
                                 var10000 = var20.offset(((BlockPos)var6.element).multiply(15));
                                 short var67 = 28558;
                                 var10003 = -8920;
                                 Intrinsics.checkNotNullExpressionValue(var10000, "offset(...)");
                                 var20 = var10000;
                                 if (var2 == 0) {
                                    break label195;
                                 }
                              }

                              var48 = var32;
                              var65 = 3;
                           }

                           if (var48 == var65) {
                              var10000 = var20.offset(((BlockPos)var5.element).multiply(15));
                              short var68 = 28558;
                              var10003 = -8920;
                              Intrinsics.checkNotNullExpressionValue(var10000, "offset(...)");
                              var20 = var10000;
                           }
                        }

                        lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid(
                           Math.max(
                              Math.max(Math.max(var20.getX(), ((BlockPos)var29.element).getX()), ((BlockPos)var14.element).getX()),
                              ((BlockPos)var30.element).getX()
                           ),
                           Math.min(
                              Math.min(Math.min(var20.getX(), ((BlockPos)var29.element).getX()), ((BlockPos)var14.element).getX()),
                              ((BlockPos)var30.element).getX()
                           ),
                           Math.max(
                              Math.max(Math.max(var20.getZ(), ((BlockPos)var29.element).getZ()), ((BlockPos)var14.element).getZ()),
                              ((BlockPos)var30.element).getZ()
                           ),
                           Math.min(
                              Math.min(Math.min(var20.getZ(), ((BlockPos)var29.element).getZ()), ((BlockPos)var14.element).getZ()),
                              ((BlockPos)var30.element).getZ()
                           )
                        );
                        IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII var52 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                        var10001 = var20.offset(((BlockPos)var4.element).multiply(2));
                        var10003 = 28558;
                        var10004 = -8920;
                        Intrinsics.checkNotNullExpressionValue(var10001, "offset(...)");
                        IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var52.a(var10001);
                        llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI.clear();
                        IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.b();
                        lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll.clear();
                        llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.clear();
                        List var36 = this.a(var12);
                        if (var2 == 0) {
                           label149:
                           if (var36 != null) {
                              int var53 = var32;
                              if (var2 == 0) {
                                 if (var32 == 0) {
                                    if (!this.a(var36) && var2 == 0) {
                                       continue label182;
                                    }

                                    return var36;
                                 }

                                 var53 = ((this.a(var36)) ? 1 : 0);
                              }

                              if (var2 == 0) {
                                 if (var53 == 0) {
                                    break label149;
                                 }

                                 var16.add(TuplesKt.to(var32, var36));
                              }

                              if (var2 == 0) {
                                 continue label182;
                              }
                           }

                           var19++;
                        }

                        if (var2 != 0) {
                           break label179;
                        }
                     }
                  }

                  Iterable var33 = var16;
                  boolean var34 = false;
                  var var37 = new ArrayList();
                  boolean var22 = false;
                  Iterator var24 = var33.iterator();

                  while (true) {
                     if (var24.hasNext()) {
                        Object var25 = var24.next();
                        Pair var27 = (Pair)var25;
                        boolean var28 = false;
                        boolean var54 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                           (List<? extends BlockPos>)var27.getSecond()
                        );
                        if (var2 != 0) {
                           break;
                        }

                        if (var2 == 0) {
                           if (!var54) {
                              continue;
                           }

                           var37.add(var25);
                        }

                        if (var2 == 0) {
                           continue;
                        }
                     }

                     var33 = (Iterable & List)var37;
                     boolean var55 = false;
                     break;
                  }

                  label198: {
                     Iterator var35;
                     label199: {
                        var35 = var33.iterator();
                        boolean var56 = var35.hasNext();
                        if (var2 == 0) {
                           if (!var56) {
                              var10000 = null;
                              break label198;
                           }

                           var37 = ((ArrayList)(var35.next()));
                           var10000 = ((BlockPos)(Object)(var35));
                           if (var2 != 0) {
                              break label199;
                           }

                           var56 = var35.hasNext();
                        }

                        if (!var56) {
                           var10000 = (BlockPos)(Object)var37;
                           break label198;
                        }

                        var10000 = (BlockPos)(Object)var37;
                     }

                     Pair var38 = (Pair)(Object)var10000;
                     boolean var40 = false;
                     double var39 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(
                        (List<? extends BlockPos>)var38.getSecond()
                     );

                     label99:
                     while (true) {
                        Object var41 = var35.next();
                        Pair var42 = (Pair)var41;
                        boolean var44 = false;
                        double var43 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(
                           (List<? extends BlockPos>)var42.getSecond()
                        );
                        if (Double.compare(var39, var43) > 0) {
                           var37 =((ArrayList)( var41));
                           var39 = var43;
                        }

                        while (!var35.hasNext()) {
                           if (var2 == 0) {
                              var10000 = (BlockPos)(Object)var37;
                              break label99;
                           }

                           var39 = var43;
                        }
                     }
                  }

                  Pair var31 = (Pair)(Object)var10000;
                  if (var31 != null) {
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                        + (((Number)var31.getFirst()).intValue() < 0 ? -90.0F : 90.0F);
                     return (List<BlockPos>)var31.getSecond();
                  }

                  return null;
               }
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private final boolean a(List<? extends BlockPos> var1) { boolean var14 = false; // PX-FIX hoist
        
      int var2;
      IntRange var3;
      IntRange var4;
      IntRange var5;
      double var6;
      Iterable var8;
      int var15;
      var15 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      var3 = new IntRange(-1, 1);
      var4 = new IntRange(-1, 1);
      var2 = var15;
      var5 = new IntRange(0, 3);
      var6 = (var3.getLast() - var3.getFirst()) * (var4.getLast() - var4.getFirst()) * (var5.getLast() - var5.getFirst()) - 4;
      var8 = var1;
      boolean var9 = false;
      var15 = ((var8 instanceof Collection) ? 1 : 0);
      label56:
      if (var2 != 0) {
         if (var15 != 0) {
            var15 = ((((Collection)var8).isEmpty() ? 1 : 0));
            if (var2 == 0) {
               break label56;
            }

            if (var15 != 0) {
               return 0 >= 10;
            }
         }

         var15 = 0;
      }

      int var10 = var15;

      for (Object var12 : var8) {
         BlockPos var13 = (BlockPos)var12;
          var14 = false;
         double var17;
         var15 = (
                  var17 = var6
                        / a(
                           var3,
                           var4,
                           var5,
                           IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .a(var13)
                        )
                     - 0.7
               )
               == 0.0
            ? 0
            : (var17 < 0.0 ? -1 : 1);
         if (var2 == 0) {
            return var15 >= 10;
         }

         if (var2 != 0) {
            var15 = var15 >= 0 ? 1 : 0;
         }

         if (var15 != 0) {
            var10++;
            if (var2 != 0) {
               if (var10 >= 0) {
                  continue;
               }

               CollectionsKt.throwCountOverflow();
            }

            if (var2 == 0) {
               break;
            }
         }
      }

      return var10 >= 10;
   }

   private final double b(List<? extends BlockPos> var1) { Object var7 = null; // PX-FIX hoist
        
      Iterable var3 = var1;
      double var4 = 0.0;
      double var14 = 0.0;
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      Iterator var6 = var3.iterator();
      int var2 = var10000;

      while (true) {
         if (var6.hasNext()) {
             var7 = var6.next();
            BlockPos var8 = (BlockPos)var7;
            boolean var9 = false;
            double var12 = e(
               IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a(var8)
            );
            var14 = var4 + var12;
            if (var2 == 0) {
               break;
            }

            var4 = var14;
            if (var2 != 0) {
               continue;
            }
         }

         var14 = var4;
         break;
      }

      return var14;
   }

   private final List<BlockPos> a(
      lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1
   ) {
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      int var3 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .b(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
      int var2 = var10000;
      int var4 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .d(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
      IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.a(var1);
      ((Map)llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI).put(var1.a(), var1.f());

      while (IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.d()) {
         lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var5 = IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.a();
         lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll.put(var5.a(), var5);
         if (var2 == 0) {
            if (Math.abs(
                     var3
                        - IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .b(var5.a())
                  )
                  <= 5
               && Math.abs(
                     var4
                        - IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .d(var5.a())
                  )
                  <= 5) {
               return this.b(var5);
            }

            this.a(var5, null);
         }

         if (var2 != 0) {
            break;
         }
      }

      return null;
   }

   private final void a(boolean var1, int var2) { short var7 = (short)0; // PX-FIX hoist
         short var14 = (short)0; // PX-FIX hoist
        
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      long var10001 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.b();
      short var10002 = 28562;
      short var10003 = -16277;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Total calculation time: " + var10001);
      int var3 = var10000;
      var10000 = IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.c();
      short var9 = 28572;
      var10002 = -30994;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Scanned nodes: " + var10000);
      var10000 = lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll.size();
      short var10 = 28552;
      var10002 = -26635;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Processed nodes: " + var10000);
      short var11 = 28574;
      var10002 = -2113;
      String var6 = "Path size: " + var2;
      if (var3 == 0) {
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(var6);
         if (var1) {
             var7 = 28575;
            short var12 = -16705;
            var6 = "SUCCESS";
         } else {
            short var8 = 28554;
            short var13 = -452;
            var6 = "FAIL";
         }
      }

       var14 = 28570;
      var10002 = 26151;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("RESULT: " + var6);
   }

   private final List<BlockPos> b(
      lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1
   ) {
      ArrayList var5 = null; // PX-FIX
      ArrayList var3 = new ArrayList();
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var4 = var1;
      int var2 = var10000;

      while (true) {
         if (var4 != null) {
            var5 = var3;
            if (var2 == 0) {
               break;
            }

            var3.add(
               IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .e(var4.a())
            );
            var4 = lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll.get(var4.g());
            if (var2 != 0) {
               continue;
            }
         }

         var5 = ((ArrayList)(Object)(CollectionsKt.reversed(var3)));
         break;
      }

      return (List<BlockPos>)var5;
   }

   private final void a(
      lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1,
      Function2<? super lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI, ? super Double, Unit> var2
   ) { int var7 = 0; // PX-FIX hoist
         boolean var14 = false; // PX-FIX hoist
        
      boolean var39 = false; // PX-FIX
      Object var38 = null; // PX-FIX
      boolean var37 = false; // PX-FIX
      Object var36 = null; // PX-FIX
      long var4 = var1.a();
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      int var6 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .b(var4);
       var7 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .c(var4);
      int var3 = var10000;
      int var8 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .d(var4);
      var10000 = var6;
      int var10001 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.a();
      if (var3 == 0) {
         if (var6 > var10001) {
            return;
         }

         var10000 = var6;
         var10001 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.b();
      }

      if (var3 == 0) {
         if (var10000 < var10001) {
            return;
         }

         var10000 = var8;
         var10001 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.c();
      }

      if (var3 == 0) {
         if (var10000 > var10001) {
            return;
         }

         var10000 = var8;
         var10001 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.d();
      }

      if (var10000 >= var10001) {
         label189: {
            var var9 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            boolean var10 = false;
            var36 = var9;
            label167:
            if (var3 == 0) {
               if (var9 instanceof Collection) {
                  var36 = (Collection)var9;
                  if (var3 != 0) {
                     break label167;
                  }

                  if (((Collection<?>)var36).isEmpty()) {
                     var37 = false;
                     break label189;
                  }
               }

               var36 = var9;
            }

            Iterator var11 = ((Iterable<?>)var36).iterator();

            label158:
            while (true) {
               if (!var11.hasNext()) {
                  var37 = false;
                  break;
               }

               Object var12 = var11.next();
               AABB var13 = (AABB)var12;
                var14 = false;
               var37 = var13.contains(var6 + 0.5, var7 + 0.5, var8 + 0.5);

               while (var37) {
                  var37 = true;
                  if (var3 == 0) {
                     break label158;
                  }
               }
            }
         }

         if (!var37) {
            label191: {
               var var20 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               boolean var22 = false;
               var38 = var20;
               label144:
               if (var3 == 0) {
                  if (var20 instanceof Collection) {
                     var38 = var20;
                     if (var3 != 0) {
                        break label144;
                     }

                     if (((Collection<?>)var38).isEmpty()) {
                        var39 = false;
                        break label191;
                     }
                  }

                  var38 = var20;
               }

               Iterator var24 = ((Iterable<?>)var38).iterator();

               label137:
               while (true) {
                  if (!var24.hasNext()) {
                     var39 = false;
                     break;
                  }

                  Object var26 = var24.next();
                  lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var28 = (lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var26;
                  boolean var31 = false;
                  var39 = var28.a(var6, var7, var8);

                  while (var39) {
                     var39 = true;
                     if (var3 == 0) {
                        break label137;
                     }
                  }
               }
            }

            if (!var39) {
               int var21 = 0;
               int var23 = 0;
               int[] var25 = new int[2];
               int[] var27 = new int[2];
               Iterator var29 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.iterator();

               while (true) {
                  if (var29.hasNext()) {
                     me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var32 = (me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI)var29.next();
                     lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var15 = this.a(
                        var4, var32
                     );
                     if (var3 != 0) {
                        break;
                     }

                     lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var40 = var15;
                     if (var3 == 0) {
                        if (var15 == null) {
                           continue;
                        }

                        var2.invoke(var15, this.a(var15.a()) + 1.0);
                        var40 = var15;
                     }

                     var10000 = var40.c().b();
                     if (var3 == 0) {
                        if (var10000 >= 1) {
                           continue;
                        }

                        var10000 = var32.a();
                     }

                     if (var10000 == 0) {
                        var27[var23++] = var32.c();
                        if (var3 == 0) {
                           continue;
                        }
                     }

                     var25[var21++] = var32.a();
                     if (var3 == 0) {
                        continue;
                     }
                  }

                  var10000 = var21;
                  if (var3 == 0) {
                     if (var21 <= 0) {
                        break;
                     }

                     var10000 = var23;
                  }

                  if (var3 == 0) {
                     if (var10000 <= 0) {
                        break;
                     }

                     var10000 = 0;
                  }

                  int var30 = var10000;
                  int var33 = var21;

                  while (var30 < var33) {
                     int var34 = var25[var30];
                     int var16 = 0;
                     int var17 = var23;

                     label91: {
                        while (var16 < var17) {
                           int var18 = var27[var16];
                           lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var19 = this.a(
                              var4,
                              new me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
                                 var34, 0, var18
                              )
                           );
                           if (var3 != 0) {
                              break label91;
                           }

                           if (var3 == 0) {
                              if (var19 != null) {
                                 var2.invoke(var19, this.a(var19.a()) + 1.4);
                              }

                              var16++;
                           }

                           if (var3 != 0) {
                              break;
                           }
                        }

                        var30++;
                     }

                     if (var3 != 0) {
                        return;
                     }
                  }

                  return;
               }

               return;
            }
         }
      }
   }

   private final lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
      long var1,
      me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var3
   ) { byte var7 = (byte)0; // PX-FIX hoist
        
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      long var5 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(var1, var3.a(), var3.b(), var3.c());
      int var4 = var10000;
       var7 = this.d(var5);
      byte var8 = var7;
      if (var4 != 0) {
         if (var7 == 0) {
            return null;
         }

         var8 = ((byte)((this.c(
            IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a(var5, 0, 1, 0)
         )) ? 1 : 0));
      }

      if (var4 != 0) {
         if (var8 == 0) {
            return null;
         }

         var8 = ((byte)((this.c(
            IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a(var5, 0, 2, 0)
         )) ? 1 : 0));
      }

      return var8 == 0
         ? null
         : new lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var5, var7, var3
         );
   }

   private final double a(long var1) {
      boolean var22 = false; // PX-FIX
      Object var21 = null; // PX-FIX
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      double var4 = lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll.get(var1);
      int var3 = var10000;
      double var23;
      var10000 = (var23 = var4 - -1.0) == 0.0 ? 0 : (var23 < 0.0 ? -1 : 1);
      if (var3 == 0) {
         var10000 = (((var10000 == 0) ? 1 : 0));
      }

      if ((var10000 == 0)) {
         return var4;
      } else {
         double var6 = 0.0;
         int var8 = -2;

         label146:
         while (true) {
            var10000 = var8;

            label144:
            while (true) {
               if (var10000 >= 3) {
                  break label146;
               }

               int var9 = -2;

               label141:
               while (true) {
                  var10000 = var9;

                  label139:
                  while (true) {
                     if (var10000 >= 3) {
                        break label141;
                     }

                     var10000 = var8;
                     if (var3 != 0) {
                        continue label144;
                     }

                     label152: {
                        label135:
                        if (var3 == 0) {
                           if (var8 == 0) {
                              var10000 = var9;
                              if (var3 != 0) {
                                 break label135;
                              }

                              if (var9 == 0) {
                                 break label152;
                              }
                           }

                           var10000 = 0;
                        }

                        int var10 = var10000;

                        while (var10 < 4) {
                           byte var11 = this.d(
                              IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .a(var1, var8, var10, var9)
                           );
                           var10000 = var10;
                           if (var3 != 0) {
                              continue label139;
                           }

                           label154: {
                              if (var3 == 0) {
                                 if (var10 == 0) {
                                    if (var11 != 0) {
                                       break label154;
                                    }

                                    var6 += 0.3;
                                    if (var3 == 0) {
                                       break label154;
                                    }
                                 }

                                 var10000 = var11;
                              }

                              byte var10001 = 3;
                              if (var3 == 0) {
                                 if (var10000 == 3) {
                                    var6 += 0.3;
                                    if (var3 == 0) {
                                       break label154;
                                    }
                                 }

                                 var10000 = var10;
                                 var10001 = 3;
                              }

                              if (var3 == 0) {
                                 if (var10000 == var10001) {
                                    break label154;
                                 }

                                 var10000 = var11;
                                 var10001 = 2;
                              }

                              if (var10000 == var10001) {
                                 var6 += 0.1;
                              }
                           }

                           var10++;
                           if (var3 != 0) {
                              break;
                           }
                        }
                     }

                     var9++;
                     if (var3 != 0) {
                        break label141;
                     }
                     break;
                  }
               }

               var8++;
               if (var3 != 0) {
                  break label146;
               }
               break;
            }
         }

         label155: { List<? extends AABB> var14 = null; // PX-FIX hoist
        
             var14 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            boolean var15 = false;
            var21 = var14;
            label85:
            if (var3 == 0) {
               if (var14 instanceof Collection) {
                  var21 = (Collection)var14;
                  if (var3 != 0) {
                     break label85;
                  }

                  if (((Collection<?>)var21).isEmpty()) {
                     var22 = false;
                     break label155;
                  }
               }

               var21 = var14;
            }

            Iterator var16 = ((Iterable<?>)var21).iterator();

            label76:
            while (true) {
               if (!var16.hasNext()) {
                  var22 = false;
                  break;
               }

               Object var17 = var16.next();
               AABB var12 = (AABB)var17;
               boolean var13 = false;
               var22 = var12.intersects(
                  IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .e(var1)
               );

               while (var22) {
                  var22 = true;
                  if (var3 == 0) {
                     break label76;
                  }
               }
            }
         }

         if (var22) {
            var6 += 20.0;
         }

         ((Map)lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll).put(var1, var6);
         return var6;
      }
   }

   private final double b(long var1) { int var7 = 0; // PX-FIX hoist
        
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      double var4 = llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.get(var1);
      int var3 = var10000;
      double var13;
      var10000 = (var13 = var4 - -1.0) == 0.0 ? 0 : (var13 < 0.0 ? -1 : 1);
      if (var3 != 0) {
         var10000 = (((var10000 == 0) ? 1 : 0));
      }

      if ((var10000 == 0)) {
         return var4;
      } else {
         int var6 = Math.abs(
            IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .b(var1)
               - IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .b(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl)
         );
          var7 = Math.abs(
            IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .d(var1)
               - IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .d(IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl)
         );
         int var8 = Math.min(var6, var7);
         int var9 = Math.max(var6, var7);
         double var10 = 1.4 * var8 + (var9 - var8);
         ((Map)llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl).put(var1, var10);
         return var10;
      }
   }

   private final boolean c(long var1) {
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      byte var4 = this.d(var1);
      int var3 = var10000;
      byte var5 = var4;
      if (var3 == 0) {
         if (var4 != 1) {
            if (var3 != 0) {
               return (var4 != 0);
            }

            if (var4 != 0) {
               return (0 != 0);
            }
         }

         var5 = 1;
      }

      return (var5 != 0);
   }

   private final byte d(long var1) {
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      byte var4 = IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.get(var1);
      int var3 = var10000;
      var10000 = var4;
      if (var3 == 0) {
         if (var4 != -1) {
            return var4;
         }

         var10000 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .b(var1);
      }

      int var5;
      int var6;
      int var7;
      label42: {
         label41: {
            var5 = var10000;
            var6 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .c(var1);
            var7 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .d(var1);
            int var8 = var5 >> 4;
            int var9 = var7 >> 4;
            var10000 = var8;
            if (var3 == 0) {
               if (var8 == IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl) {
                  if (var3 != 0) {
                     break label42;
                  }

                  if (var9 == IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll) {
                     break label41;
                  }
               }

               IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = this.b().getChunk(var8, var9, ChunkStatus.FULL, false);
               IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var8;
               var10000 = var9;
            }

            IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = var10000;
         }

         boolean var15 = false;
      }

      byte var10;
      label31: {
         label30: {
            ChunkAccess var11 = IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
            ChunkAccess var16 = var11;
            if (var3 == 0) {
               if (var11 == null) {
                  break label30;
               }

               llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.set(var5, var6, var7);
               var16 = var11;
            }

            BlockState var17 = var16.getBlockState(llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI);
            short var10002 = 28560;
            short var10003 = -19876;
            Intrinsics.checkNotNullExpressionValue(var17, "getBlockState(...)");
            BlockState var12 = var17;
            var10 = this.a(var12, llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI);
            if (var3 == 0) {
               break label31;
            }
         }

         var10 = 0;
      }

      ((Map)IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl).put(var1, var10);
      return var10;
   }

   private final byte a(BlockState var1, BlockPos var2) {
       byte var7 = (byte)0; // PX-FIX decl var7
      int var3;
      BlockState var5;
      label69: {
         var3 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
         boolean var10000 = var1.isAir();
         if (var3 != 0) {
            if (var10000) {
               return 0;
            }

            var5 = var1;
            if (var3 == 0) {
               break label69;
            }

            var10000 = var1.getCollisionShape(this.b(), var2).isEmpty();
         }

         if (var10000) {
            var5 = var1;
            if (var3 == 0) {
               break label69;
            }

            if (var1.getFluidState().isEmpty()) {
               return 0;
            }
         }

         var5 = var1;
      }

      Block var6 = var5.getBlock();
      short var10002 = 28569;
      short var10003 = 4139;
      Intrinsics.checkNotNullExpressionValue(var6, "getBlock(...)");
      Block var4 = var6;
      if (IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.o(var1) && IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll) {
         return 2;
      }

      if (IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var4)) {
         return 1;
      }

      if (IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.p(var1) || IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.D(var1)) {
         return 2;
      }

      return 3;
   }

   private static final void a(ObjectRef<BlockPos> var0, ObjectRef<BlockPos> var1, ObjectRef<BlockPos> var2, ObjectRef<BlockPos> var3, float var4) {
      var0.element = new BlockPos(
         (int)(
            (float)Math.rint(
               (float)Math.sin(
                  IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .f(var4)
               )
            )
         ),
         0,
         (int)(
            (float)Math.rint(
               -(
                  (float)Math.cos(
                     IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .f(var4)
                  )
               )
            )
         )
      );
      var1.element = new BlockPos(
         (int)Math.rint(
            Math.sin(
               IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .d(var4 - 90.0)
            )
         ),
         0,
         (int)Math.rint(
            -Math.cos(
               IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .d(var4 - 90.0)
            )
         )
      );
      var2.element = new BlockPos(
         (int)Math.rint(
            Math.sin(
               IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .d(var4 + 90.0)
            )
         ),
         0,
         (int)Math.rint(
            -Math.cos(
               IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .d(var4 + 90.0)
            )
         )
      );
      var3.element = new BlockPos(
         (int)Math.rint(
            Math.sin(
               IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .d(var4 + 180.0)
            )
         ),
         0,
         (int)Math.rint(
            -Math.cos(
               IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .d(var4 + 180.0)
            )
         )
      );
   }

   private static final void a(
      ObjectRef<BlockPos> var0,
      BlockPos var1,
      ObjectRef<BlockPos> var2,
      ObjectRef<BlockPos> var3,
      ObjectRef<BlockPos> var4,
      ObjectRef<BlockPos> var5,
      ObjectRef<BlockPos> var6
   ) {
      BlockPos var10001 = var1.offset(((BlockPos)var2.element).multiply(5));
      short var10003 = 28558;
      short var10004 = -8920;
      Intrinsics.checkNotNullExpressionValue(var10001, "offset(...)");
      var0.element = var10001;
      var10001 = var1.offset(((BlockPos)var4.element).multiply(20));
      var10003 = 28558;
      var10004 = -8920;
      Intrinsics.checkNotNullExpressionValue(var10001, "offset(...)");
      var3.element = var10001;
      var10001 = var1.offset(((BlockPos)var6.element).multiply(20));
      var10003 = 28558;
      var10004 = -8920;
      Intrinsics.checkNotNullExpressionValue(var10001, "offset(...)");
      var5.element = var10001;
   }

   private static final double a(IntRange var0, IntRange var1, IntRange var2, long var3) { int var7 = 0; // PX-FIX hoist
        
      boolean var24 = false; // PX-FIX
      Object var23 = null; // PX-FIX
      int var6 = 0;
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
       var7 = var0.getFirst();
      int var5 = var10000;
      int var8 = var0.getLast();
      var10000 = var7;
      if (var5 == 0) {
         if (var7 <= var8) {
            do {
               int var10001;
               label127: {
                  label135: {
                     int var9 = var1.getFirst();
                     int var10 = var1.getLast();
                     if (var9 <= var10) {
                        do {
                           var10000 =((Integer)( var7));
                           if ((var5 == 0)) {
                              break label135;
                           }

                           label113: {
                              label112: {
                                 label129: {
                                    label110: {
                                       if ((var7 != 0)) {
                                          var10000 = var9;
                                          if ((var5 == 0)) {
                                             break label110;
                                          }

                                          if ((var5 == 0)) {
                                             break label112;
                                          }

                                          if (var9 == 0) {
                                             break label129;
                                          }
                                       }

                                       var10000 = var2.getFirst();
                                    }

                                    int var11 = var10000;
                                    int var12 = var2.getLast();
                                    var10000 = var11;
                                    var10001 = var12;
                                    if ((var5 == 0)) {
                                       break label113;
                                    }

                                    if (var11 <= var12) {
                                       do {
                                          long var13 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                             .a(var3,((Integer)( var7)), var11, var9);
                                          byte var15 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d(var13);
                                          if (var15 != 1) {
                                             var6++;
                                          }

                                          label132: {
                                             var var16 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                                             boolean var17 = false;
                                             var23 = var16;
                                             label96:
                                             if ((var5 != 0)) {
                                                if (var16 instanceof Collection) {
                                                   var23 = var16;
                                                   if ((var5 == 0)) {
                                                      break label96;
                                                   }

                                                   if (((Collection<?>)var23).isEmpty()) {
                                                      var24 = false;
                                                      break label132;
                                                   }
                                                }

                                                var23 = var16;
                                             }

                                             Iterator var18 = ((Iterable<?>)var23).iterator();

                                             label89:
                                             while (true) {
                                                if (!var18.hasNext()) {
                                                   var24 = false;
                                                   break;
                                                }

                                                Object var19 = var18.next();
                                                lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var20 = (lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var19;
                                                boolean var21 = false;
                                                var24 = var20.a(
                                                   IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                                      .b(var13),
                                                   IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                                      .c(var13),
                                                   IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                                      .d(var13)
                                                );

                                                while (var24) {
                                                   var24 = true;
                                                   if ((var5 != 0)) {
                                                      break label89;
                                                   }
                                                }
                                             }
                                          }

                                          if (var24) {
                                             var6++;
                                          }

                                          var10000 = var11;
                                          var10001 = var12;
                                          if ((var5 == 0)) {
                                             break label113;
                                          }

                                          if (var11 == var12) {
                                             break;
                                          }

                                          var11++;
                                       } while ((var5 != 0));
                                    }
                                 }

                                 var10000 = var9;
                              }

                              var10001 = var10;
                           }

                           if ((var5 == 0)) {
                              break label127;
                           }

                           if (var10000 == var10001) {
                              break;
                           }

                           var9++;
                        } while ((var5 != 0));
                     }

                     var10000 =((Integer)( var7));
                  }

                  if ((var5 == 0)) {
                     return var10000;
                  }

                  var10001 = var8;
               }

               if (var10000 == var10001) {
                  break;
               }

               var7++;
            } while (var5 == 0);
         }

         var10000 = var6;
      }

      return var10000;
   }

   private static final double e(long var0) { int var7 = 0; // PX-FIX hoist
        
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      double var3 = 0.0;
      int var2 = var10000;
      int var5 = -2;

      label105:
      while (true) {
         var10000 = var5;

         label103:
         while (var10000 < 3) {
            int var6 = -2;

            label100:
            while (true) {
               var10000 = var6;

               label98:
               while (true) {
                  if (var10000 >= 3) {
                     break label100;
                  }

                  var10000 = var5;
                  if (var2 != 0) {
                     continue label103;
                  }

                  label111: {
                     label94:
                     if (var2 == 0) {
                        if (var5 == 0) {
                           var10000 = var6;
                           if (var2 != 0) {
                              break label94;
                           }

                           if (var6 == 0) {
                              break label111;
                           }
                        }

                        var10000 = 0;
                     }

                      var7 = var10000;

                     while (var7 < 4) {
                        byte var8 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d(
                           IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .a(var0, var5, var7, var6)
                        );
                        var10000 = var7;
                        if (var2 != 0) {
                           continue label98;
                        }

                        label113: {
                           if (var2 == 0) {
                              if (var7 == 0) {
                                 if (var8 != 0) {
                                    break label113;
                                 }

                                 var3 += 0.7;
                                 if (var2 == 0) {
                                    break label113;
                                 }
                              }

                              var10000 = var8;
                           }

                           label114: {
                              byte var10001 = 3;
                              if (var2 == 0) {
                                 if (var10000 == 3) {
                                    var3 += 0.7;
                                    if (var2 == 0) {
                                       break label113;
                                    }
                                 }

                                 var10000 = var7;
                                 if (var2 != 0) {
                                    break label114;
                                 }

                                 var10001 = 3;
                              }

                              if (var10000 != var10001) {
                                 var10000 = var8;
                                 if (var2 != 0) {
                                    break label114;
                                 }

                                 if (var8 == 2) {
                                    var3 += 0.3;
                                    if (var2 == 0) {
                                       break label113;
                                    }
                                 }
                              }

                              var10000 = var8;
                           }

                           if (var10000 == 0) {
                              var3 += 0.1;
                           }
                        }

                        var7++;
                        if (var2 != 0) {
                           break;
                        }
                     }
                  }

                  var6++;
                  if (var2 != 0) {
                     break label100;
                  }
                  break;
               }
            }

            var5++;
            if (var2 != 0) {
               return var3;
            }
            continue label105;
         }

         return var3;
      }
   }

   private static final Unit a(
      lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var0,
      lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1,
      double var2
   ) {
      int var4;
      long var5;
      double var7;
      int var9;
      label62: {
         short var10001 = 28567;
         short var10002 = -4454;
         Intrinsics.checkNotNullParameter(var1, "node");
         int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
         var5 = var1.a();
         var7 = var2 + var0.f();
         var9 = 0;
         var4 = var10000;
         var10000 = ((IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.b(var5)) ? 1 : 0);
         if (var4 == 0) {
            if (var10000 != 0) {
               double var12;
               var10000 = (var12 = llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI.get(var5) - var7) == 0.0
                  ? 0
                  : (var12 < 0.0 ? -1 : 1);
               if (var4 == 0) {
                  if (var10000 <= 0) {
                     return Unit.INSTANCE;
                  }

                  var1.b(llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.get(var5));
                  var10000 = 1;
               }

               var9 = var10000;
               if (var4 == 0) {
                  break label62;
               }
            }

            var10000 = ((lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll.containsKey(var5)) ? 1 : 0);
         }

         label51: {
            label63: {
               if (var4 == 0) {
                  if (var10000 == 0) {
                     break label51;
                  }

                  if (var4 != 0) {
                     break label63;
                  }

                  double var13;
                  var10000 = (var13 = llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI.get(var5) - var7) == 0.0
                     ? 0
                     : (var13 < 0.0 ? -1 : 1);
               }

               if (var10000 <= 0) {
                  return Unit.INSTANCE;
               }

               lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll.remove(var5);
            }

            var1.b(llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.get(var5));
            if (var4 == 0) {
               break label62;
            }
         }

         var1.b(IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var5));
      }

      label38: {
         var1.c(var7);
         var1.a(var0.a());
         ((Map)llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI).put(var5, var7);
         if (var4 == 0) {
            if (var9 == 0) {
               break label38;
            }

            IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.b(var1);
         }

         if (var4 == 0) {
            return Unit.INSTANCE;
         }
      }

      IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.a(var1);
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static { me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI[] var7 = null; // PX-FIX hoist
         Long2DoubleOpenHashMap var14 = null; // PX-FIX hoist
        
   pxClinit: { // PX-FIX
      char[] var29 = null; // PX-FIX
      String[] var5 = new String[23];
      int var3 = 0;
      String var2 = "ñû\u009fØ¾Æ\u007f|v\u000f¥\u0007n\u001a8}þ\u001c\u0084\u000f%\u000es\"ÚIy\u0003\u0011¤gä¼\u008ai\u0012¬ø%Â\u008fî¼M@\u0084äF\"\u008a&$rÖ\b\u0082%\u0094\u009ep³\u0014K\u0005\b\b@«,\u0010¿\u0091\u00870óÞLd¥-ð\u00152D@ò\rÊ\u0090)\u001b$Íã\u0093ãÕýè¶\u0005bíoéÇ\u0004V\u0098\u0082v\u000bè§v¯\u0096WÖýaõl\u0010\u0015\u009e½}¨h ª\t\u009b\u001fB%F\u000eG\u0018\u007fhÊlX+lãVÝÜOê\u0099º\u001eòã\u001eú±½tÑ\u0004\u0086h\u001c-\u0012\u0096M¢ UºÍ}]RqSÍ]\u009d\u0010ùB\u00065áD\u0002Ðe\u000bå\"×\u001f¢AP?±\u00adv\u000en3\u008f\n!\u0005¥\u0088G³\u008coÇþ\tÜZ\u000bQÞÅ§(e\u0004rõ\u0082\u009e\u0004\u009d«ûÒ";
      int var4 = "ñû\u009fØ¾Æ\u007f|v\u000f¥\u0007n\u001a8}þ\u001c\u0084\u000f%\u000es\"ÚIy\u0003\u0011¤gä¼\u008ai\u0012¬ø%Â\u008fî¼M@\u0084äF\"\u008a&$rÖ\b\u0082%\u0094\u009ep³\u0014K\u0005\b\b@«,\u0010¿\u0091\u00870óÞLd¥-ð\u00152D@ò\rÊ\u0090)\u001b$Íã\u0093ãÕýè¶\u0005bíoéÇ\u0004V\u0098\u0082v\u000bè§v¯\u0096WÖýaõl\u0010\u0015\u009e½}¨h ª\t\u009b\u001fB%F\u000eG\u0018\u007fhÊlX+lãVÝÜOê\u0099º\u001eòã\u001eú±½tÑ\u0004\u0086h\u001c-\u0012\u0096M¢ UºÍ}]RqSÍ]\u009d\u0010ùB\u00065áD\u0002Ðe\u000bå\"×\u001f¢AP?±\u00adv\u000en3\u008f\n!\u0005¥\u0088G³\u008coÇþ\tÜZ\u000bQÞÅ§(e\u0004rõ\u0082\u009e\u0004\u009d«ûÒ"
         .length();
      char var1 = 11;
      int var11 = -1;

      label52:
      while (true) {
         byte var10000 = 3;
         String var10001 = var2.substring(++var11, var11 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var34 = var10001.toCharArray();
               int var10004 = var34.length;
               int var6 = 0;
               byte var37 = var10000;
               var29 = var34;
               int var23 = var10004;
               byte var43;
               char[] var47;
               int var10006;
               if (var10004 <= 1) {
                  var47 = var34;
                  var43 = var10000;
                  var10006 = var6;
               } else {
                  var37 = var10000;
                  var23 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var47 = var34;
                  var43 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var47[var10006] = (char)(var47[var10006] ^ var43 ^ switch (var6 % 7) {
                     case 0 -> 13;
                     case 1 -> 126;
                     case 2 -> 77;
                     case 3 -> 46;
                     case 4 -> 93;
                     case 5 -> 109;
                     default -> 45;
                  });
                  var6++;
                  if (var37 == 0) {
                     var10006 = var37;
                     var47 = var29;
                     var43 = var37;
                  } else {
                     if (var23 <= var6) {
                        break;
                     }

                     var47 = var29;
                     var43 = var37;
                     var10006 = var6;
                  }
               }
            }

            String var39 = new String(var29).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var39;
                  if ((var11 += var1) >= var4) {
                     a = var5;
                     b = new String[23];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII();
                     me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        .a(IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new ArrayList<>();
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = CollectionsKt.emptyList();
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new AABB(
                        new Vec3(461.0, 61.5, 458.0), new Vec3(561.0, 256.0, 564.0)
                     );
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new AABB(
                        new Vec3(483.0, 80.0, 195.0), new Vec3(515.0, 94.0, 227.0)
                     );
                     Minecraft var18 = Minecraft.getInstance();
                     var10002 = 28568;
                     short var40 = 28090;
                     Intrinsics.checkNotNullExpressionValue(var18, "getInstance(...)");
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var18;
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
                      var7 = new me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI[]{
                        new me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
                           1, 0, 0
                        ),
                        new me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
                           -1, 0, 0
                        ),
                        new me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
                           0, 0, 1
                        ),
                        new me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
                           0, 0, -1
                        )
                     };
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = CollectionsKt.listOf(var7);
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a();
                     llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new MutableBlockPos();
                     IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = Integer.MAX_VALUE;
                     IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = Integer.MAX_VALUE;
                     Long2ByteOpenHashMap var12 = new Long2ByteOpenHashMap();
                     boolean var9 = false;
                     var12.defaultReturnValue((byte)-1);
                     IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = var12;
                     llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = new Long2DoubleOpenHashMap();
                     IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = new lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll();
                     lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = new HashMap<>();
                     Long2DoubleOpenHashMap var13 = new Long2DoubleOpenHashMap();
                     var9 = false;
                     var13.defaultReturnValue(-1.0);
                     llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = var13;
                      var14 = new Long2DoubleOpenHashMap();
                     var9 = false;
                     var14.defaultReturnValue(-1.0);
                     lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = var14;
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var11);
                  break;
               default:
                  var5[var3++] = var39;
                  if ((var11 += var1) < var4) {
                     var1 = var2.charAt(var11);
                     continue label52;
                  }

                  var2 = "ÃÇ0:ap\u0088FX\u0011\u00003bcä\u0003\u001b\u0003zÞ\u0093ß¦!T·à";
                  var4 = "ÃÇ0:ap\u0088FX\u0011\u00003bcä\u0003\u001b\u0003zÞ\u0093ß¦!T·à".length();
                  var1 = '\t';
                  var11 = -1;
            }

            var10000 = 60;
            var10001 = var2.substring(++var11, var11 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) { int var7 = 0; // PX-FIX hoist
        
      int var2 = (var0 ^ 28574) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 97;
            case 1 -> 51;
            case 2 -> 199;
            case 3 -> 130;
            case 4 -> 102;
            case 5 -> 162;
            case 6 -> 27;
            case 7 -> 215;
            case 8 -> 141;
            case 9 -> 10;
            case 10 -> 75;
            case 11 -> 2;
            case 12 -> 156;
            case 13 -> 132;
            case 14 -> 71;
            case 15 -> 147;
            case 16 -> 98;
            case 17 -> 28;
            case 18 -> 79;
            case 19 -> 121;
            case 20 -> 59;
            case 21 -> 33;
            case 22 -> 116;
            case 23 -> 226;
            case 24 -> 163;
            case 25 -> 221;
            case 26 -> 119;
            case 27 -> 193;
            case 28 -> 85;
            case 29 -> 159;
            case 30 -> 42;
            case 31 -> 192;
            case 32 -> 211;
            case 33 -> 233;
            case 34 -> 207;
            case 35 -> 104;
            case 36 -> 9;
            case 37 -> 128;
            case 38 -> 134;
            case 39 -> 92;
            case 40 -> 204;
            case 41 -> 224;
            case 42 -> 22;
            case 43 -> 118;
            case 44 -> 155;
            case 45 -> 23;
            case 46 -> 53;
            case 47 -> 58;
            case 48 -> 84;
            case 49 -> 148;
            case 50 -> 4;
            case 51 -> 243;
            case 52 -> 189;
            case 53 -> 113;
            case 54 -> 144;
            case 55 -> 145;
            case 56 -> 89;
            case 57 -> 152;
            case 58 -> 54;
            case 59 -> 216;
            case 60 -> 48;
            case 61 -> 213;
            case 62 -> 151;
            case 63 -> 154;
            case 64 -> 96;
            case 65 -> 18;
            case 66 -> 6;
            case 67 -> 61;
            case 68 -> 34;
            case 69 -> 41;
            case 70 -> 254;
            case 71 -> 185;
            case 72 -> 255;
            case 73 -> 80;
            case 74 -> 67;
            case 75 -> 123;
            case 76 -> 83;
            case 77 -> 182;
            case 78 -> 131;
            case 79 -> 112;
            case 80 -> 143;
            case 81 -> 244;
            case 82 -> 129;
            case 83 -> 198;
            case 84 -> 114;
            case 85 -> 206;
            case 86 -> 86;
            case 87 -> 173;
            case 88 -> 100;
            case 89 -> 19;
            case 90 -> 252;
            case 91 -> 137;
            case 92 -> 201;
            case 93 -> 81;
            case 94 -> 181;
            case 95 -> 8;
            case 96 -> 140;
            case 97 -> 20;
            case 98 -> 190;
            case 99 -> 31;
            case 100 -> 236;
            case 101 -> 29;
            case 102 -> 168;
            case 103 -> 195;
            case 104 -> 17;
            case 105 -> 167;
            case 106 -> 230;
            case 107 -> 3;
            case 108 -> 95;
            case 109 -> 245;
            case 110 -> 246;
            case 111 -> 66;
            case 112 -> 46;
            case 113 -> 70;
            case 114 -> 26;
            case 115 -> 32;
            case 116 -> 7;
            case 117 -> 60;
            case 118 -> 218;
            case 119 -> 12;
            case 120 -> 101;
            case 121 -> 209;
            case 122 -> 91;
            case 123 -> 188;
            case 124 -> 47;
            case 125 -> 200;
            case 126 -> 21;
            case 127 -> 69;
            case 128 -> 184;
            case 129 -> 65;
            case 130 -> 88;
            case 131 -> 237;
            case 132 -> 107;
            case 133 -> 223;
            case 134 -> 40;
            case 135 -> 241;
            case 136 -> 250;
            case 137 -> 229;
            case 138 -> 172;
            case 139 -> 178;
            case 140 -> 73;
            case 141 -> 191;
            case 142 -> 15;
            case 143 -> 43;
            case 144 -> 117;
            case 145 -> 169;
            case 146 -> 72;
            case 147 -> 103;
            case 148 -> 177;
            case 149 -> 222;
            case 150 -> 171;
            case 151 -> 212;
            case 152 -> 93;
            case 153 -> 251;
            case 154 -> 153;
            case 155 -> 30;
            case 156 -> 68;
            case 157 -> 161;
            case 158 -> 180;
            case 159 -> 249;
            case 160 -> 87;
            case 161 -> 186;
            case 162 -> 253;
            case 163 -> 146;
            case 164 -> 232;
            case 165 -> 196;
            case 166 -> 127;
            case 167 -> 52;
            case 168 -> 110;
            case 169 -> 138;
            case 170 -> 56;
            case 171 -> 0;
            case 172 -> 194;
            case 173 -> 49;
            case 174 -> 94;
            case 175 -> 170;
            case 176 -> 122;
            case 177 -> 228;
            case 178 -> 157;
            case 179 -> 165;
            case 180 -> 238;
            case 181 -> 235;
            case 182 -> 11;
            case 183 -> 39;
            case 184 -> 38;
            case 185 -> 240;
            case 186 -> 1;
            case 187 -> 111;
            case 188 -> 44;
            case 189 -> 45;
            case 190 -> 105;
            case 191 -> 202;
            case 192 -> 231;
            case 193 -> 82;
            case 194 -> 55;
            case 195 -> 234;
            case 196 -> 136;
            case 197 -> 227;
            case 198 -> 160;
            case 199 -> 219;
            case 200 -> 248;
            case 201 -> 106;
            case 202 -> 135;
            case 203 -> 74;
            case 204 -> 13;
            case 205 -> 214;
            case 206 -> 142;
            case 207 -> 120;
            case 208 -> 90;
            case 209 -> 174;
            case 210 -> 108;
            case 211 -> 14;
            case 212 -> 176;
            case 213 -> 37;
            case 214 -> 197;
            case 215 -> 124;
            case 216 -> 64;
            case 217 -> 247;
            case 218 -> 175;
            case 219 -> 133;
            case 220 -> 63;
            case 221 -> 57;
            case 222 -> 78;
            case 223 -> 203;
            case 224 -> 225;
            case 225 -> 76;
            case 226 -> 217;
            case 227 -> 166;
            case 228 -> 125;
            case 229 -> 158;
            case 230 -> 239;
            case 231 -> 77;
            case 232 -> 139;
            case 233 -> 24;
            case 234 -> 25;
            case 235 -> 164;
            case 236 -> 115;
            case 237 -> 50;
            case 238 -> 220;
            case 239 -> 5;
            case 240 -> 210;
            case 241 -> 99;
            case 242 -> 109;
            case 243 -> 35;
            case 244 -> 205;
            case 245 -> 150;
            case 246 -> 208;
            case 247 -> 242;
            case 248 -> 126;
            case 249 -> 187;
            case 250 -> 36;
            case 251 -> 183;
            case 252 -> 149;
            case 253 -> 62;
            case 254 -> 179;
            default -> 16;
         };
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for ( var7 = 0; var7 < var3.length; var7++) {
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

   public static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      @NotNull
      private final Vec3 IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final Vec3 lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final Vec3 IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final double lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final double IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(@NotNull Vec3 var1, @NotNull Vec3 var2, @NotNull Vec3 var3) {
         Intrinsics.checkNotNullParameter(var1, "a");
         Intrinsics.checkNotNullParameter(var2, "b");
         Intrinsics.checkNotNullParameter(var3, "d");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = Math.min(
            Math.min(
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.y,
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.y
            ),
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.y
         );
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = Math.max(
            Math.max(
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.y,
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.y
            ),
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.y
         );
      }

      @NotNull
      public final Vec3 a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final Vec3 b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final Vec3 c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final double d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final double e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final boolean a(int var1, int var2, int var3) { double var7 = 0.0; // PX-FIX hoist
        
         int var4 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
         if (IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               new Vec3(var1 + 0.5, var2 + 0.5, var3 + 0.5)
            )) {
            int var10000;
            label26: {
               double var5 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
                var7 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
               double var9 = var2;
               double var12;
               var10000 = (var12 = var5 - var9) == 0.0 ? 0 : (var12 < 0.0 ? -1 : 1);
               if (var4 != 0) {
                  if (var10000 > 0) {
                     var10000 = 0;
                     break label26;
                  }

                  double var13;
                  var10000 = (var13 = var9 - var7) == 0.0 ? 0 : (var13 < 0.0 ? -1 : 1);
               }

               if (var4 != 0) {
                  var10000 = var10000 <= 0 ? 1 : 0;
               }
            }

            if (var10000 != 0) {
               return true;
            }
         }

         return false;
      }
   }

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      private final long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final byte lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private double lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private double IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private double IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      @Nullable
      private Long IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private static String a;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         long var1,
         byte var3,
         @NotNull me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var4
      ) {
         Intrinsics.checkNotNullParameter(var4, a);
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var3;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var4;
      }

      public final long a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final byte b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final double d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final void a(double var1) {
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var1;
      }

      public final double e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final void b(double var1) {
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
      }

      public final double f() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final void c(double var1) {
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            + this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @Nullable
      public final Long g() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      public final void a(@Nullable Long var1) {
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var1;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: { // PX-FIX
         char[] var10003 = "Y1MJ#A".toCharArray();
         int var10004 = var10003.length;
         int var0 = 0;
         byte var6 = 116;
         char[] var10002 = var10003;
         int var1 = var10004;
         byte var10;
         char[] var10005;
         int var10006;
         if (var10004 <= 1) {
            var10005 = var10003;
            var10 = 116;
            var10006 = var0;
         } else {
            var6 = 116;
            var1 = var10004;
            if (var10004 <= var0) {
               String var9 = new String(var10003).intern();
               byte var4 = -1;
               a = var9;
               break pxClinit; // PX-FIX
            }

            var10005 = var10003;
            var10 = 116;
            var10006 = var0;
         }

         while (true) {
            var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
               case 0 -> 66;
               case 1 -> 35;
               case 2 -> 95;
               case 3 -> 77;
               case 4 -> 50;
               case 5 -> 65;
               default -> 99;
            });
            var0++;
            if (var6 == 0) {
               var10006 = var6;
               var10005 = var10002;
               var10 = var6;
            } else {
               if (var1 <= var0) {
                  String var8 = new String(var10002).intern();
                  byte var3 = -1;
                  a = var8;
                  break pxClinit; // PX-FIX
               }

               var10005 = var10002;
               var10 = var6;
               var10006 = var0;
            }
         }
   } // PX-FIX end pxClinit
      }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @NotNull
      private final ArrayList<lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new ArrayList<>();
      @NotNull
      private final Long2IntOpenHashMap lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new Long2IntOpenHashMap();
      private static String[] a;
      private static String[] b;

      @NotNull
      public final lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         long var1
      ) {
         Object var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .get(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.get(var1));
         short var10002 = 3236;
         short var10003 = -31518;
         Intrinsics.checkNotNullExpressionValue(var10000, "get(...)");
         return (lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
      }

      public final void a(
         @NotNull lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1
      ) {
         short var10001 = 3234;
         short var10002 = -6219;
         Intrinsics.checkNotNullParameter(var1, "node");
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.add(var1);
         int var2 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.size() - 1;
         ((Map)this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII).put(var1.a(), var2);
         this.a(var2);
      }

      @NotNull
      public final lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a() {
         int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
         Object var10001 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(0);
         short var10003 = 3232;
         short var10004 = 31294;
         Intrinsics.checkNotNullExpressionValue(var10001, "get(...)");
         lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var2 = (lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10001;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.remove(var2.a());
         int var1 = var10000;
         Object var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var1 == 0) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.size() == 1) {
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.remove(0);
               return var2;
            }

            var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .remove(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.size() - 1);
            short var10002 = 3235;
            var10003 = 15849;
            Intrinsics.checkNotNullExpressionValue(var4, "removeAt(...)");
         }

         lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var4;
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.set(0, var3);
         ((Map)this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII).put(var3.a(), 0);
         this.b(0);
         return var2;
      }

      public final void b() {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.clear();
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.clear();
      }

      public final boolean b(long var1) {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.containsKey(var1);
      }

      public final void b(
         @NotNull lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1
      ) {
         int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
         short var10002 = 3233;
         short var10003 = 19158;
         Intrinsics.checkNotNullParameter(var1, "node");
         int var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.get(var1.a());
         int var2 = var10000;
         double var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var3).d();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.set(var3, var1);
         double var7;
         var10000 = (var7 = var1.d() - var4) == 0.0 ? 0 : (var7 < 0.0 ? -1 : 1);
         if (var2 == 0) {
            if (var10000 < 0) {
               this.a(var3);
               if (var2 == 0) {
                  return;
               }
            }

            double var8;
            var10000 = (var8 = var1.d() - var4) == 0.0 ? 0 : (var8 < 0.0 ? -1 : 1);
         }

         if (var10000 > 0) {
            this.b(var3);
         }
      }

      public final int c() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.size();
      }

      public final boolean d() {
         int var1 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
         boolean var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.isEmpty();
         if (var1 != 0) {
            var10000 = !var10000;
         }

         return var10000;
      }

      private final void a(int var1) { Object var7 = null; // PX-FIX hoist
        
         int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
         int var3 = var1;
         Object var10001 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var1);
         short var10003 = 3232;
         short var10004 = 31294;
         Intrinsics.checkNotNullExpressionValue(var10001, "get(...)");
         lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var4 = (lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10001;
         int var2 = var10000;

         while (var3 > 0) {
            int var5 = (var3 - 1) / 2;
             var7 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var5);
            short var10002 = 3232;
            var10003 = 31294;
            Intrinsics.checkNotNullExpressionValue(var7, "get(...)");
            lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var6 = (lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var7;
            double var10;
            var10000 = (var10 = var6.d() - var4.d()) == 0.0 ? 0 : (var10 < 0.0 ? -1 : 1);
            if (var2 == 0) {
               if (var10000 <= 0 && var2 == 0) {
                  break;
               }

               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.set(var3, var6);
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.set(var5, var4);
               ((Map)this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII).put(var6.a(), var3);
               ((Map)this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII).put(var4.a(), var5);
               var10000 = var5;
            }

            var3 = var10000;
            if (var2 != 0) {
               break;
            }
         }
      }

      private final void b(int var1) {
      lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var12 = null; // PX-FIX
         int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
         int var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.size();
         int var2 = var10000;
         int var4 = var1;
         Object var10 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var1);
         short var10002 = 3232;
         short var10003 = 31294;
         Intrinsics.checkNotNullExpressionValue(var10, "get(...)");
         lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var5 = (lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10;

         do {
            int var8;
            label53: { int var7 = 0; // PX-FIX hoist
        
               label52: {
                  label51: {
                     label59: {
                        int var10001;
                        label60: {
                           label48: {
                              int var6 = 2 * var4 + 1;
                               var7 = 2 * var4 + 2;
                              var8 = -1;
                              if (var6 < var3) {
                                 var8 = var6;
                                 var10000 = var7;
                                 var10001 = var3;
                                 if (var2 == 0 || var2 == 0) {
                                    break label60;
                                 }

                                 if (var7 < var3) {
                                    double var16;
                                    var10000 = (
                                             var16 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var7).d()
                                                - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var6).d()
                                          )
                                          == 0.0
                                       ? 0
                                       : (var16 < 0.0 ? -1 : 1);
                                    if (var2 == 0) {
                                       break label48;
                                    }

                                    if (var10000 < 0) {
                                       var8 = var7;
                                    }
                                 }
                              }

                              var10000 = var8;
                           }

                           if (var2 == 0) {
                              break label59;
                           }

                           var10001 = -1;
                        }

                        if (var10000 == var10001) {
                           break label51;
                        }

                        var12 = var5;
                        if (var2 == 0) {
                           break label53;
                        }

                        double var17;
                        var10000 = (var17 = var5.d() - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var8).d())
                              == 0.0
                           ? 0
                           : (var17 < 0.0 ? -1 : 1);
                     }

                     if (var10000 > 0) {
                        break label52;
                     }
                  }

                  if (var2 != 0) {
                     break;
                  }
               }

               Object var13 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var8);
               var10002 = 3232;
               var10003 = 31294;
               Intrinsics.checkNotNullExpressionValue(var13, "get(...)");
               var12 = (lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var13;
            }

            lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var9 = var12;
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.set(var4, var9);
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.set(var8, var5);
            ((Map)this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII).put(var9.a(), var4);
            ((Map)this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII).put(var5.a(), var8);
            var4 = var8;
         } while (var2 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static { int var14 = 0; // PX-FIX hoist
        
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[5];
         int var3 = 0;
         String var2 = "Â\u0084áy«\u009a\u0094@\u00049´¦y\u0004æ±]Ù";
         int var4 = "Â\u0084áy«\u009a\u0094@\u00049´¦y\u0004æ±]Ù".length();
         char var1 = '\b';
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
                   var14 = var10004;
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
                        case 0 -> 118;
                        case 1 -> 118;
                        case 2 -> 77;
                        case 3 -> 3;
                        case 4 -> 47;
                        case 5 -> 19;
                        default -> 4;
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
                        b = new String[5];
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

                     var2 = "ã\u0098ø.y\u0007a\u001fÍâ!IÃ\bmÍ\u0087Ãô^ìK";
                     var4 = "ã\u0098ø.y\u0007a\u001fÍâ!IÃ\bmÍ\u0087Ãô^ìK".length();
                     var1 = '\r';
                     var8 = -1;
               }

               var10000 = 121;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
   } // PX-FIX end pxClinit
      }

      private static String a(int var0, int var1) { int var7 = 0; // PX-FIX hoist
        
         int var2 = (var0 ^ 3232) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 151;
               case 1 -> 4;
               case 2 -> 121;
               case 3 -> 105;
               case 4 -> 180;
               case 5 -> 166;
               case 6 -> 252;
               case 7 -> 113;
               case 8 -> 148;
               case 9 -> 71;
               case 10 -> 201;
               case 11 -> 16;
               case 12 -> 2;
               case 13 -> 79;
               case 14 -> 15;
               case 15 -> 181;
               case 16 -> 118;
               case 17 -> 58;
               case 18 -> 30;
               case 19 -> 108;
               case 20 -> 133;
               case 21 -> 68;
               case 22 -> 54;
               case 23 -> 86;
               case 24 -> 81;
               case 25 -> 218;
               case 26 -> 152;
               case 27 -> 217;
               case 28 -> 52;
               case 29 -> 215;
               case 30 -> 32;
               case 31 -> 249;
               case 32 -> 57;
               case 33 -> 212;
               case 34 -> 120;
               case 35 -> 40;
               case 36 -> 10;
               case 37 -> 72;
               case 38 -> 100;
               case 39 -> 210;
               case 40 -> 162;
               case 41 -> 48;
               case 42 -> 206;
               case 43 -> 183;
               case 44 -> 24;
               case 45 -> 195;
               case 46 -> 245;
               case 47 -> 250;
               case 48 -> 111;
               case 49 -> 36;
               case 50 -> 73;
               case 51 -> 254;
               case 52 -> 53;
               case 53 -> 45;
               case 54 -> 173;
               case 55 -> 110;
               case 56 -> 13;
               case 57 -> 184;
               case 58 -> 219;
               case 59 -> 165;
               case 60 -> 61;
               case 61 -> 130;
               case 62 -> 126;
               case 63 -> 112;
               case 64 -> 144;
               case 65 -> 14;
               case 66 -> 246;
               case 67 -> 213;
               case 68 -> 142;
               case 69 -> 42;
               case 70 -> 78;
               case 71 -> 226;
               case 72 -> 92;
               case 73 -> 203;
               case 74 -> 74;
               case 75 -> 229;
               case 76 -> 6;
               case 77 -> 93;
               case 78 -> 64;
               case 79 -> 145;
               case 80 -> 37;
               case 81 -> 31;
               case 82 -> 66;
               case 83 -> 47;
               case 84 -> 251;
               case 85 -> 157;
               case 86 -> 233;
               case 87 -> 211;
               case 88 -> 149;
               case 89 -> 34;
               case 90 -> 27;
               case 91 -> 163;
               case 92 -> 216;
               case 93 -> 230;
               case 94 -> 46;
               case 95 -> 134;
               case 96 -> 8;
               case 97 -> 70;
               case 98 -> 221;
               case 99 -> 197;
               case 100 -> 28;
               case 101 -> 214;
               case 102 -> 26;
               case 103 -> 21;
               case 104 -> 115;
               case 105 -> 189;
               case 106 -> 63;
               case 107 -> 29;
               case 108 -> 223;
               case 109 -> 119;
               case 110 -> 170;
               case 111 -> 67;
               case 112 -> 190;
               case 113 -> 191;
               case 114 -> 140;
               case 115 -> 241;
               case 116 -> 17;
               case 117 -> 200;
               case 118 -> 56;
               case 119 -> 127;
               case 120 -> 51;
               case 121 -> 176;
               case 122 -> 196;
               case 123 -> 80;
               case 124 -> 150;
               case 125 -> 109;
               case 126 -> 91;
               case 127 -> 155;
               case 128 -> 33;
               case 129 -> 132;
               case 130 -> 209;
               case 131 -> 107;
               case 132 -> 99;
               case 133 -> 242;
               case 134 -> 106;
               case 135 -> 35;
               case 136 -> 177;
               case 137 -> 43;
               case 138 -> 192;
               case 139 -> 185;
               case 140 -> 83;
               case 141 -> 179;
               case 142 -> 38;
               case 143 -> 7;
               case 144 -> 220;
               case 145 -> 169;
               case 146 -> 248;
               case 147 -> 153;
               case 148 -> 122;
               case 149 -> 9;
               case 150 -> 39;
               case 151 -> 95;
               case 152 -> 20;
               case 153 -> 50;
               case 154 -> 164;
               case 155 -> 0;
               case 156 -> 231;
               case 157 -> 182;
               case 158 -> 102;
               case 159 -> 253;
               case 160 -> 117;
               case 161 -> 76;
               case 162 -> 186;
               case 163 -> 124;
               case 164 -> 59;
               case 165 -> 25;
               case 166 -> 1;
               case 167 -> 77;
               case 168 -> 97;
               case 169 -> 158;
               case 170 -> 160;
               case 171 -> 125;
               case 172 -> 146;
               case 173 -> 232;
               case 174 -> 228;
               case 175 -> 104;
               case 176 -> 225;
               case 177 -> 62;
               case 178 -> 161;
               case 179 -> 236;
               case 180 -> 156;
               case 181 -> 23;
               case 182 -> 207;
               case 183 -> 85;
               case 184 -> 138;
               case 185 -> 44;
               case 186 -> 208;
               case 187 -> 240;
               case 188 -> 131;
               case 189 -> 12;
               case 190 -> 94;
               case 191 -> 199;
               case 192 -> 88;
               case 193 -> 154;
               case 194 -> 101;
               case 195 -> 114;
               case 196 -> 237;
               case 197 -> 49;
               case 198 -> 137;
               case 199 -> 174;
               case 200 -> 234;
               case 201 -> 82;
               case 202 -> 168;
               case 203 -> 187;
               case 204 -> 103;
               case 205 -> 139;
               case 206 -> 41;
               case 207 -> 172;
               case 208 -> 65;
               case 209 -> 5;
               case 210 -> 18;
               case 211 -> 69;
               case 212 -> 141;
               case 213 -> 129;
               case 214 -> 116;
               case 215 -> 205;
               case 216 -> 123;
               case 217 -> 89;
               case 218 -> 22;
               case 219 -> 167;
               case 220 -> 3;
               case 221 -> 255;
               case 222 -> 204;
               case 223 -> 224;
               case 224 -> 171;
               case 225 -> 235;
               case 226 -> 136;
               case 227 -> 244;
               case 228 -> 55;
               case 229 -> 194;
               case 230 -> 239;
               case 231 -> 188;
               case 232 -> 202;
               case 233 -> 147;
               case 234 -> 222;
               case 235 -> 96;
               case 236 -> 75;
               case 237 -> 87;
               case 238 -> 198;
               case 239 -> 175;
               case 240 -> 60;
               case 241 -> 227;
               case 242 -> 238;
               case 243 -> 19;
               case 244 -> 143;
               case 245 -> 247;
               case 246 -> 90;
               case 247 -> 11;
               case 248 -> 159;
               case 249 -> 84;
               case 250 -> 128;
               case 251 -> 178;
               case 252 -> 193;
               case 253 -> 135;
               case 254 -> 243;
               default -> 98;
            };
            int var5 = (var1 & 0xFF) - var4;
            if (var5 < 0) {
               var5 += 256;
            }

            int var6 = ((var1 & 65535) >>> 8) - var4;
            if (var6 < 0) {
               var6 += 256;
            }

            for ( var7 = 0; var7 < var3.length; var7++) {
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
}
