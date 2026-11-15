package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl {
   @NotNull
   public static lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static String[] a;
   private static String[] b;

   private lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl() {
   }

   public final boolean a() {
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
            Vec3 var4 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var2);
            int var5 = (int)var4.y;
            List var6 = new ArrayList();
            int var7 = -2;

            label114:
            while (true) {
               int var10000 = var7;

               label112:
               while (true) {
                  if (var10000 >= 3) {
                     break label114;
                  }

                  int var8 = -2;

                  while (var8 < 3) {
                     var10000 = var7;
                     if (var1 == null) {
                        continue label112;
                     }

                     label106: {
                        label128: {
                           label104:
                           if (var1 != null) {
                              if (var7 == 0) {
                                 var10000 = var8;
                                 if (var1 == null) {
                                    break label104;
                                 }

                                 if (var8 == 0) {
                                    break label128;
                                 }
                              }

                              var10000 = var7 * var7 + var8 * var8;
                           }

                           double var9 = Math.sqrt(var10000);
                           if (var1 == null) {
                              break label106;
                           }

                           if (var9 <= 3.0) {
                              var6.add(new Pair(var7, var8));
                           }
                        }

                        var8++;
                     }

                     if (var1 == null) {
                        break;
                     }
                  }

                  var7++;
                  if (var1 == null) {
                     break label114;
                  }
                  break;
               }
            }

            Iterator var20 = var6.iterator();

            label81:
            while (true) {
               byte var23 = ((byte)((var20.hasNext()) ? 1 : 0));

               label79:
               while (var23 != 0) {
                  Pair var21 = (Pair)var20.next();
                  int var22 = ((Number)var21.component1()).intValue();
                  int var10 = ((Number)var21.component2()).intValue();
                  int var11 = (int)var4.x + var22;
                  int var12 = (int)var4.z + var10;
                  BlockPos var13 = new BlockPos(var11, var5, var12);
                  BlockState var24 = var3.getBlockState(var13);
                  short var10002 = -29112;
                  short var10003 = 5897;
                  Intrinsics.checkNotNullExpressionValue(var24, "getBlockState(...)");
                  BlockState var14 = var24;
                  var23 = ((byte)((var14.isAir()) ? 1 : 0));

                  label77:
                  while (true) {
                     if (var1 != null) {
                        if (var23 != 0) {
                           return true;
                        }

                        var23 = 1;
                     }

                     int var15 = var23;

                     do {
                        if (var15 >= 5) {
                           continue label81;
                        }

                        BlockPos var16 = new BlockPos(var11, var5 - var15, var12);
                        BlockState var25 = var3.getBlockState(var16);
                        var10002 = -29112;
                        var10003 = 5897;
                        Intrinsics.checkNotNullExpressionValue(var25, "getBlockState(...)");
                        BlockState var17 = var25;
                        if (var1 != null) {
                           var23 = ((byte)((var17.isAir()) ? 1 : 0));
                           if (var1 == null) {
                              continue label77;
                           }

                           if (var1 == null) {
                              continue label79;
                           }

                           if (var23 != 0) {
                              double var18 = Math.sqrt(var22 * var22 + var10 * var10);
                              if (var1 == null) {
                                 continue;
                              }

                              if (var18 <= 4.0) {
                                 return true;
                              }
                           }

                           var15++;
                        }
                     } while (var1 != null);

                     return false;
                  }
               }

               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public final boolean b() {
      return this.a();
   }

   @NotNull
   public final List<Float> c() {
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
            Vec3 var4 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var2);
            int var5 = (int)var4.y;
            List var6 = new ArrayList();
            Pair[] var8 = new Pair[]{
               TuplesKt.to(new Pair(0, 1), 0.0F),
               TuplesKt.to(new Pair(1, 1), 45.0F),
               TuplesKt.to(new Pair(1, 0), 90.0F),
               TuplesKt.to(new Pair(1, -1), 135.0F),
               TuplesKt.to(new Pair(0, -1), 180.0F),
               TuplesKt.to(new Pair(-1, -1), 225.0F),
               TuplesKt.to(new Pair(-1, 0), 270.0F),
               TuplesKt.to(new Pair(-1, 1), 315.0F)
            };
            List var7 = CollectionsKt.listOf(var8);
            Iterator var21 = var7.iterator();

            label51:
            while (true) {
               byte var10000 = ((byte)((var21.hasNext()) ? 1 : 0));

               label49:
               while ((var10000 != 0)) {
                  Pair var9 = (Pair)var21.next();
                  Pair var10 = (Pair)var9.component1();
                  float var11 = ((Number)var9.component2()).floatValue();
                  int var12 = ((Number)var10.component1()).intValue();
                  int var13 = ((Number)var10.component2()).intValue();
                  int var14 = (int)var4.x + var12;
                  int var15 = (int)var4.z + var13;
                  BlockPos var16 = new BlockPos(var14, var5, var15);
                  BlockState var22 = var3.getBlockState(var16);
                  short var10002 = -29111;
                  short var10003 = -2122;
                  Intrinsics.checkNotNullExpressionValue(var22, "getBlockState(...)");
                  BlockState var17 = var22;
                  var10000 = ((byte)((var17.isAir()) ? 1 : 0));
                  if (var1 != null) {
                     if (var10000 != 0) {
                        var6.add(var11);
                        if (var1 != null) {
                           continue label51;
                        }
                     }

                     var10000 = 1;
                  }

                  int var18 = var10000;

                  do {
                     if (var18 >= 4) {
                        continue label51;
                     }

                     BlockPos var19 = new BlockPos(var14, var5 - var18, var15);
                     BlockState var24 = var3.getBlockState(var19);
                     var10002 = -29112;
                     var10003 = 5897;
                     Intrinsics.checkNotNullExpressionValue(var24, "getBlockState(...)");
                     BlockState var20 = var24;
                     if (var1 != null) {
                        var10000 = ((byte)((var20.isAir()) ? 1 : 0));
                        if (var1 == null) {
                           continue label49;
                        }

                        if ((var10000 != 0)) {
                           var6.add(var11);
                           if (var1 != null) {
                              continue label51;
                           }
                        }

                        var18++;
                     }
                  } while (var1 != null);

                  return var6;
               }

               return var6;
            }
         } else {
            return CollectionsKt.emptyList();
         }
      } else {
         return CollectionsKt.emptyList();
      }
   }

   @Nullable
   public final Float d() {
      Object var24 = null; // PX-FIX
      List var23 = null; // PX-FIX
      String var1 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
      if (var1 != null
         && me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .player
            != null) {
         LocalPlayer var2 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .player;
         List var3 = this.c();
         int var10000 = ((var3.isEmpty()) ? 1 : 0);
         if (var1 != null) {
            if (var10000 != 0) {
               return null;
            }

            var10000 = 8;
         }

         Float[] var5 = new Float[var10000];
         var5[0] = 0.0F;
         var5[1] = 45.0F;
         var5[2] = 90.0F;
         var5[3] = 135.0F;
         var5[4] = 180.0F;
         var5[5] = 225.0F;
         var5[6] = 270.0F;
         var5[7] = 315.0F;
         List var4 = CollectionsKt.listOf(var5);
         Iterable var6 = var4;
         boolean var7 = false;
         var var9 = new ArrayList();
         boolean var10 = false;
         Iterator var11 = var6.iterator();

         while (true) {
            if (var11.hasNext()) {
               Object var12 = var11.next();
               float var13 = ((Number)var12).floatValue();
               boolean var14 = false;
               var23 = var3;
               if (var1 == null) {
                  break;
               }

               label85: {
                  var var15 = var3;
                  boolean var16 = false;
                  var24 = var15;
                  label70:
                  if (var1 != null) {
                     if (var15 instanceof Collection) {
                        var24 = (Collection)var15;
                        if (var1 == null) {
                           break label70;
                        }

                        if (((me.octo.client.PXDyn)var24).isEmpty()) {
                           var10000 = 1;
                           break label85;
                        }
                     }

                     var24 = var15;
                  }

                  Iterator var17 = ((me.octo.client.PXDyn)var24).iterator();

                  label63:
                  while (true) {
                     if (!var17.hasNext()) {
                        var10000 = 1;
                        break;
                     }

                     Object var18 = var17.next();
                     float var19 = ((Number)var18).floatValue();
                     boolean var20 = false;
                     float var21 = Math.abs(IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var13 - var19));
                     float var26;
                     var10000 = (var26 = var21 - 90.0F) == 0.0F ? 0 : (var26 < 0.0F ? -1 : 1);

                     while (true) {
                        if (var1 != null) {
                           var10000 = var10000 > 0 ? 1 : 0;
                        }

                        if (var10000 != 0) {
                           break;
                        }

                        var10000 = 0;
                        if (var1 != null) {
                           break label63;
                        }
                     }
                  }
               }

               if (var1 != null) {
                  if (var10000 == 0) {
                     continue;
                  }

                  var9.add(var12);
               }

               if (var1 != null) {
                  continue;
               }
            }

            var23 = var9;
            break;
         }

         List var22 = var23;
         return (Float)CollectionsKt.randomOrNull(var22, (Random)Random.Default);
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

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "\u009f@Uö\u00ad³Óô[µF©è\u0003\u0091\u001e®t\u0012ÈÆ¿&ð©x·.Ýè¤=¢+*ùò";
      int var4 = "\u009f@Uö\u00ad³Óô[µF©è\u0003\u0091\u001e®t\u0012ÈÆ¿&ð©x·.Ýè¤=¢+*ùò".length();
      char var1 = 18;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 8;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 8;
               var10006 = var6;
            } else {
               var13 = 8;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 8;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 43;
                  case 1 -> 49;
                  case 2 -> 53;
                  case 3 -> 90;
                  case 4 -> 62;
                  case 5 -> 74;
                  default -> 42;
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
            b = new String[2];
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl();
            break pxClinit; // PX-FIX
         }

         var1 = var2.charAt(var0);
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -29111) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 56;
            case 1 -> 19;
            case 2 -> 42;
            case 3 -> 229;
            case 4 -> 193;
            case 5 -> 47;
            case 6 -> 13;
            case 7 -> 64;
            case 8 -> 118;
            case 9 -> 130;
            case 10 -> 168;
            case 11 -> 94;
            case 12 -> 243;
            case 13 -> 85;
            case 14 -> 26;
            case 15 -> 249;
            case 16 -> 245;
            case 17 -> 198;
            case 18 -> 84;
            case 19 -> 155;
            case 20 -> 212;
            case 21 -> 179;
            case 22 -> 37;
            case 23 -> 153;
            case 24 -> 207;
            case 25 -> 201;
            case 26 -> 72;
            case 27 -> 184;
            case 28 -> 106;
            case 29 -> 65;
            case 30 -> 188;
            case 31 -> 226;
            case 32 -> 208;
            case 33 -> 71;
            case 34 -> 192;
            case 35 -> 67;
            case 36 -> 2;
            case 37 -> 145;
            case 38 -> 177;
            case 39 -> 11;
            case 40 -> 247;
            case 41 -> 129;
            case 42 -> 170;
            case 43 -> 167;
            case 44 -> 196;
            case 45 -> 18;
            case 46 -> 175;
            case 47 -> 9;
            case 48 -> 103;
            case 49 -> 105;
            case 50 -> 235;
            case 51 -> 6;
            case 52 -> 4;
            case 53 -> 182;
            case 54 -> 133;
            case 55 -> 104;
            case 56 -> 156;
            case 57 -> 250;
            case 58 -> 248;
            case 59 -> 157;
            case 60 -> 180;
            case 61 -> 79;
            case 62 -> 227;
            case 63 -> 27;
            case 64 -> 97;
            case 65 -> 21;
            case 66 -> 57;
            case 67 -> 121;
            case 68 -> 107;
            case 69 -> 147;
            case 70 -> 191;
            case 71 -> 214;
            case 72 -> 232;
            case 73 -> 48;
            case 74 -> 239;
            case 75 -> 211;
            case 76 -> 237;
            case 77 -> 0;
            case 78 -> 190;
            case 79 -> 181;
            case 80 -> 251;
            case 81 -> 200;
            case 82 -> 139;
            case 83 -> 202;
            case 84 -> 169;
            case 85 -> 110;
            case 86 -> 195;
            case 87 -> 176;
            case 88 -> 80;
            case 89 -> 10;
            case 90 -> 225;
            case 91 -> 124;
            case 92 -> 81;
            case 93 -> 51;
            case 94 -> 222;
            case 95 -> 69;
            case 96 -> 34;
            case 97 -> 31;
            case 98 -> 134;
            case 99 -> 206;
            case 100 -> 255;
            case 101 -> 221;
            case 102 -> 199;
            case 103 -> 93;
            case 104 -> 33;
            case 105 -> 49;
            case 106 -> 35;
            case 107 -> 87;
            case 108 -> 102;
            case 109 -> 3;
            case 110 -> 183;
            case 111 -> 185;
            case 112 -> 189;
            case 113 -> 101;
            case 114 -> 83;
            case 115 -> 238;
            case 116 -> 5;
            case 117 -> 233;
            case 118 -> 63;
            case 119 -> 163;
            case 120 -> 114;
            case 121 -> 7;
            case 122 -> 172;
            case 123 -> 54;
            case 124 -> 44;
            case 125 -> 246;
            case 126 -> 29;
            case 127 -> 82;
            case 128 -> 14;
            case 129 -> 98;
            case 130 -> 70;
            case 131 -> 58;
            case 132 -> 92;
            case 133 -> 150;
            case 134 -> 203;
            case 135 -> 241;
            case 136 -> 41;
            case 137 -> 230;
            case 138 -> 24;
            case 139 -> 143;
            case 140 -> 253;
            case 141 -> 62;
            case 142 -> 234;
            case 143 -> 43;
            case 144 -> 111;
            case 145 -> 187;
            case 146 -> 205;
            case 147 -> 166;
            case 148 -> 17;
            case 149 -> 218;
            case 150 -> 240;
            case 151 -> 228;
            case 152 -> 88;
            case 153 -> 117;
            case 154 -> 158;
            case 155 -> 123;
            case 156 -> 59;
            case 157 -> 126;
            case 158 -> 116;
            case 159 -> 220;
            case 160 -> 171;
            case 161 -> 68;
            case 162 -> 223;
            case 163 -> 138;
            case 164 -> 131;
            case 165 -> 173;
            case 166 -> 161;
            case 167 -> 135;
            case 168 -> 23;
            case 169 -> 217;
            case 170 -> 160;
            case 171 -> 197;
            case 172 -> 60;
            case 173 -> 77;
            case 174 -> 45;
            case 175 -> 8;
            case 176 -> 174;
            case 177 -> 120;
            case 178 -> 159;
            case 179 -> 66;
            case 180 -> 132;
            case 181 -> 95;
            case 182 -> 75;
            case 183 -> 22;
            case 184 -> 224;
            case 185 -> 78;
            case 186 -> 40;
            case 187 -> 215;
            case 188 -> 219;
            case 189 -> 1;
            case 190 -> 46;
            case 191 -> 242;
            case 192 -> 100;
            case 193 -> 216;
            case 194 -> 137;
            case 195 -> 149;
            case 196 -> 109;
            case 197 -> 178;
            case 198 -> 20;
            case 199 -> 213;
            case 200 -> 108;
            case 201 -> 164;
            case 202 -> 204;
            case 203 -> 32;
            case 204 -> 128;
            case 205 -> 194;
            case 206 -> 186;
            case 207 -> 91;
            case 208 -> 53;
            case 209 -> 30;
            case 210 -> 141;
            case 211 -> 210;
            case 212 -> 236;
            case 213 -> 36;
            case 214 -> 252;
            case 215 -> 115;
            case 216 -> 142;
            case 217 -> 25;
            case 218 -> 112;
            case 219 -> 86;
            case 220 -> 15;
            case 221 -> 38;
            case 222 -> 209;
            case 223 -> 154;
            case 224 -> 76;
            case 225 -> 28;
            case 226 -> 146;
            case 227 -> 89;
            case 228 -> 231;
            case 229 -> 16;
            case 230 -> 254;
            case 231 -> 52;
            case 232 -> 99;
            case 233 -> 55;
            case 234 -> 113;
            case 235 -> 125;
            case 236 -> 148;
            case 237 -> 73;
            case 238 -> 61;
            case 239 -> 151;
            case 240 -> 165;
            case 241 -> 90;
            case 242 -> 12;
            case 243 -> 144;
            case 244 -> 162;
            case 245 -> 136;
            case 246 -> 127;
            case 247 -> 50;
            case 248 -> 39;
            case 249 -> 74;
            case 250 -> 244;
            case 251 -> 140;
            case 252 -> 96;
            case 253 -> 119;
            case 254 -> 152;
            default -> 122;
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
