package me.octo.client.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.llIIIIIIIllIllIIllIlIIlIlIIIlllllllllIIIlllIIIlIIlIlIllIlIllIlllllIllIIllllIlIIllIllI;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.StainedGlassBlock;
import net.minecraft.world.level.block.StainedGlassPaneBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl {
   public static me.octo.client.PXDyn llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll = null; // PX-FIX missing field

   @NotNull
   public static IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Map<Block, Block> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static Set<Block> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static int[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static String[] a;
   private static String[] b;

   private IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl() {
   }

   @NotNull
   public static final Map<Block, Block> a() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final boolean a(@NotNull BlockState var1) {
      short var10001 = 28220;
      short var10002 = -19938;
      Intrinsics.checkNotNullParameter(var1, "state");
      return var1.is(Blocks.OBSIDIAN);
   }

   public final boolean b(@NotNull BlockState var1) {
      short var10001 = 28220;
      short var10002 = -19938;
      Intrinsics.checkNotNullParameter(var1, "state");
      return var1.is(Blocks.END_STONE);
   }

   public final boolean c(@NotNull BlockState var1) {
      short var10001 = 28220;
      short var10002 = -19938;
      Intrinsics.checkNotNullParameter(var1, "state");
      return var1.is(Blocks.STONE);
   }

   public final boolean d(@NotNull BlockState var1) {
      short var10001 = 28220;
      short var10002 = -19938;
      Intrinsics.checkNotNullParameter(var1, "state");
      return var1.is(Blocks.COBBLESTONE);
   }

   public final boolean e(@NotNull BlockState var1) {
      short var10001 = 28220;
      short var10002 = -19938;
      Intrinsics.checkNotNullParameter(var1, "state");
      return var1.is(Blocks.SAND);
   }

   public final boolean f(@NotNull BlockState var1) {
      short var10001 = 28220;
      short var10002 = -19938;
      Intrinsics.checkNotNullParameter(var1, "state");
      return var1.is(Blocks.RED_SAND);
   }

   public final boolean g(@NotNull BlockState var1) {
      short var10001 = 28220;
      short var10002 = -19938;
      Intrinsics.checkNotNullParameter(var1, "state");
      return var1.is(Blocks.MYCELIUM);
   }

   public final boolean a(@NotNull Block var1) {
      short var10001 = 28216;
      short var10002 = 22433;
      Intrinsics.checkNotNullParameter(var1, "block");
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.contains(var1);
   }

   public final boolean h(@NotNull BlockState var1) {
      short var10001 = 28220;
      short var10002 = -19938;
      Intrinsics.checkNotNullParameter(var1, "state");
      return var1.is(Blocks.LIGHT_BLUE_WOOL);
   }

   public final boolean i(@NotNull BlockState var1) {
      int[] var10000 = c();
      short var10002 = 28220;
      short var10003 = -19938;
      Intrinsics.checkNotNullParameter(var1, "state");
      int[] var2 = var10000;
      boolean var3 = var1.is(Blocks.PRISMARINE);
      if (var2 != null) {
         if (!var3) {
            boolean var4 = var1.is(Blocks.PRISMARINE_WALL);
            if (var2 == null) {
               return var4;
            }

            if (!var4) {
               boolean var5 = var1.is(Blocks.PRISMARINE_BRICKS);
               if (var2 == null) {
                  return var5;
               }

               if (!var5) {
                  boolean var6 = var1.is(Blocks.DARK_PRISMARINE);
                  if (var2 == null) {
                     return var6;
                  }

                  if (!var6) {
                     return false;
                  }
               }
            }
         }

         var3 = true;
      }

      return var3;
   }

   public final boolean j(@NotNull BlockState var1) {
      int[] var10000 = c();
      short var10002 = 28220;
      short var10003 = -19938;
      Intrinsics.checkNotNullParameter(var1, "state");
      int[] var2 = var10000;
      boolean var3 = var1.is(Blocks.GRAY_WOOL);
      if (var2 != null) {
         if (!var3) {
            boolean var4 = var1.is(Blocks.CYAN_TERRACOTTA);
            if (var2 == null) {
               return var4;
            }

            if (!var4) {
               return false;
            }
         }

         var3 = true;
      }

      return var3;
   }

   public final boolean k(@NotNull BlockState var1) {
      short var10001 = 28220;
      short var10002 = -19938;
      Intrinsics.checkNotNullParameter(var1, "state");
      return var1.is(Blocks.POLISHED_DIORITE);
   }

   public final boolean l(@NotNull BlockState var1) {
      int[] var10000 = c();
      short var10002 = 28221;
      short var10003 = -11696;
      Intrinsics.checkNotNullParameter(var1, "state");
      int[] var2 = var10000;
      boolean var3 = var1.is(Blocks.TERRACOTTA);
      if (var2 != null) {
         if (!var3) {
            boolean var4 = var1.is(Blocks.SMOOTH_RED_SANDSTONE);
            if (var2 == null) {
               return var4;
            }

            if (!var4) {
               boolean var5 = var1.is(Blocks.BROWN_TERRACOTTA);
               if (var2 == null) {
                  return var5;
               }

               if (!var5) {
                  return false;
               }
            }
         }

         var3 = true;
      }

      return var3;
   }

   public final boolean m(@NotNull BlockState var1) {
      int[] var10000 = c();
      short var10002 = 28220;
      short var10003 = -19938;
      Intrinsics.checkNotNullParameter(var1, "state");
      int[] var2 = var10000;
      boolean var3 = var1.is(Blocks.CLAY);
      if (var2 != null) {
         if (!var3) {
            boolean var4 = var1.is(Blocks.INFESTED_COBBLESTONE);
            if (var2 == null) {
               return var4;
            }

            if (!var4) {
               return false;
            }
         }

         var3 = true;
      }

      return var3;
   }

   public final boolean n(@NotNull BlockState var1) {
      short var10001 = 28220;
      short var10002 = -19938;
      Intrinsics.checkNotNullParameter(var1, "state");
      return var1.is(Blocks.PACKED_ICE);
   }

   public final boolean o(@NotNull BlockState var1) {
      int[] var10000 = c();
      short var10002 = 28220;
      short var10003 = -19938;
      Intrinsics.checkNotNullParameter(var1, "state");
      int[] var2 = var10000;
      boolean var3 = var1.is(Blocks.GOLD_BLOCK);
      if (var2 != null) {
         if (!var3) {
            boolean var4 = var1.is(Blocks.IRON_BLOCK);
            if (var2 == null) {
               return var4;
            }

            if (!var4) {
               boolean var5 = var1.is(Blocks.REDSTONE_BLOCK);
               if (var2 == null) {
                  return var5;
               }

               if (!var5) {
                  boolean var6 = var1.is(Blocks.LAPIS_BLOCK);
                  if (var2 == null) {
                     return var6;
                  }

                  if (!var6) {
                     boolean var7 = var1.is(Blocks.EMERALD_BLOCK);
                     if (var2 == null) {
                        return var7;
                     }

                     if (!var7) {
                        boolean var8 = var1.is(Blocks.COAL_BLOCK);
                        if (var2 == null) {
                           return var8;
                        }

                        if (!var8) {
                           boolean var9 = var1.is(Blocks.DIAMOND_BLOCK);
                           if (var2 == null) {
                              return var9;
                           }

                           if (!var9) {
                              boolean var10 = var1.is(Blocks.QUARTZ_BLOCK);
                              if (var2 == null) {
                                 return var10;
                              }

                              if (!var10) {
                                 boolean var11 = var1.is(Blocks.GOLD_ORE);
                                 if (var2 == null) {
                                    return var11;
                                 }

                                 if (!var11) {
                                    boolean var12 = var1.is(Blocks.IRON_ORE);
                                    if (var2 == null) {
                                       return var12;
                                    }

                                    if (!var12) {
                                       boolean var13 = var1.is(Blocks.COAL_ORE);
                                       if (var2 == null) {
                                          return var13;
                                       }

                                       if (!var13) {
                                          boolean var14 = var1.is(Blocks.LAPIS_ORE);
                                          if (var2 == null) {
                                             return var14;
                                          }

                                          if (!var14) {
                                             boolean var15 = var1.is(Blocks.DIAMOND_ORE);
                                             if (var2 == null) {
                                                return var15;
                                             }

                                             if (!var15) {
                                                boolean var16 = var1.is(Blocks.REDSTONE_ORE);
                                                if (var2 == null) {
                                                   return var16;
                                                }

                                                if (!var16) {
                                                   boolean var17 = var1.is(Blocks.EMERALD_ORE);
                                                   if (var2 == null) {
                                                      return var17;
                                                   }

                                                   if (!var17) {
                                                      return false;
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         var3 = true;
      }

      return var3;
   }

   public final boolean p(@NotNull BlockState var1) {
      int[] var10000 = c();
      short var10002 = 28220;
      short var10003 = -19938;
      Intrinsics.checkNotNullParameter(var1, "state");
      int[] var2 = var10000;
      boolean var3 = this.h(var1);
      if (var2 != null) {
         if (!var3) {
            boolean var4 = this.i(var1);
            if (var2 == null) {
               return var4;
            }

            if (!var4) {
               boolean var5 = this.j(var1);
               if (var2 == null) {
                  return var5;
               }

               if (!var5) {
                  return false;
               }
            }
         }

         var3 = true;
      }

      return var3;
   }

   public final boolean q(@NotNull BlockState var1) {
      int[] var10000 = c();
      short var10002 = 28220;
      short var10003 = -19938;
      Intrinsics.checkNotNullParameter(var1, "state");
      int[] var2 = var10000;
      boolean var3 = var1.is(Blocks.WHITE_STAINED_GLASS_PANE);
      if (var2 != null) {
         if (!var3) {
            boolean var4 = var1.is(Blocks.WHITE_STAINED_GLASS);
            if (var2 == null) {
               return var4;
            }

            if (!var4) {
               return false;
            }
         }

         var3 = true;
      }

      return var3;
   }

   public final boolean r(@NotNull BlockState var1) {
      int[] var10000 = c();
      short var10002 = 28220;
      short var10003 = -19938;
      Intrinsics.checkNotNullParameter(var1, "state");
      int[] var2 = var10000;
      boolean var3 = var1.is(Blocks.YELLOW_STAINED_GLASS_PANE);
      if (var2 != null) {
         if (!var3) {
            boolean var4 = var1.is(Blocks.YELLOW_STAINED_GLASS);
            if (var2 == null) {
               return var4;
            }

            if (!var4) {
               return false;
            }
         }

         var3 = true;
      }

      return var3;
   }

   public final boolean s(@NotNull BlockState var1) {
      int[] var10000 = c();
      short var10002 = 28220;
      short var10003 = -19938;
      Intrinsics.checkNotNullParameter(var1, "state");
      int[] var2 = var10000;
      boolean var3 = var1.is(Blocks.ORANGE_STAINED_GLASS_PANE);
      if (var2 != null) {
         if (!var3) {
            boolean var4 = var1.is(Blocks.ORANGE_STAINED_GLASS);
            if (var2 == null) {
               return var4;
            }

            if (!var4) {
               return false;
            }
         }

         var3 = true;
      }

      return var3;
   }

   public final boolean t(@NotNull BlockState var1) {
      int[] var10000 = c();
      short var10002 = 28220;
      short var10003 = -19938;
      Intrinsics.checkNotNullParameter(var1, "state");
      int[] var2 = var10000;
      boolean var3 = var1.is(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE);
      if (var2 != null) {
         if (!var3) {
            boolean var4 = var1.is(Blocks.LIGHT_BLUE_STAINED_GLASS);
            if (var2 == null) {
               return var4;
            }

            if (!var4) {
               return false;
            }
         }

         var3 = true;
      }

      return var3;
   }

   public final boolean u(@NotNull BlockState var1) {
      int[] var10000 = c();
      short var10002 = 28220;
      short var10003 = -19938;
      Intrinsics.checkNotNullParameter(var1, "state");
      int[] var2 = var10000;
      boolean var3 = var1.is(Blocks.LIME_STAINED_GLASS_PANE);
      if (var2 != null) {
         if (!var3) {
            boolean var4 = var1.is(Blocks.LIME_STAINED_GLASS);
            if (var2 == null) {
               return var4;
            }

            if (!var4) {
               return false;
            }
         }

         var3 = true;
      }

      return var3;
   }

   public final boolean v(@NotNull BlockState var1) {
      int[] var10000 = c();
      short var10002 = 28220;
      short var10003 = -19938;
      Intrinsics.checkNotNullParameter(var1, "state");
      int[] var2 = var10000;
      boolean var3 = var1.is(Blocks.PURPLE_STAINED_GLASS_PANE);
      if (var2 != null) {
         if (!var3) {
            boolean var4 = var1.is(Blocks.PURPLE_STAINED_GLASS);
            if (var2 == null) {
               return var4;
            }

            if (!var4) {
               return false;
            }
         }

         var3 = true;
      }

      return var3;
   }

   public final boolean w(@NotNull BlockState var1) {
      int[] var10000 = c();
      short var10002 = 28220;
      short var10003 = -19938;
      Intrinsics.checkNotNullParameter(var1, "state");
      int[] var2 = var10000;
      boolean var3 = var1.is(Blocks.MAGENTA_STAINED_GLASS_PANE);
      if (var2 != null) {
         if (!var3) {
            boolean var4 = var1.is(Blocks.MAGENTA_STAINED_GLASS);
            if (var2 == null) {
               return var4;
            }

            if (!var4) {
               return false;
            }
         }

         var3 = true;
      }

      return var3;
   }

   public final boolean x(@NotNull BlockState var1) {
      int[] var10000 = c();
      short var10002 = 28220;
      short var10003 = -19938;
      Intrinsics.checkNotNullParameter(var1, "state");
      int[] var2 = var10000;
      boolean var3 = var1.is(Blocks.BLUE_STAINED_GLASS_PANE);
      if (var2 != null) {
         if (!var3) {
            boolean var4 = var1.is(Blocks.BLUE_STAINED_GLASS);
            if (var2 == null) {
               return var4;
            }

            if (!var4) {
               return false;
            }
         }

         var3 = true;
      }

      return var3;
   }

   public final boolean y(@NotNull BlockState var1) {
      int[] var10000 = c();
      short var10002 = 28220;
      short var10003 = -19938;
      Intrinsics.checkNotNullParameter(var1, "state");
      int[] var2 = var10000;
      boolean var3 = var1.is(Blocks.BROWN_STAINED_GLASS_PANE);
      if (var2 != null) {
         if (!var3) {
            boolean var4 = var1.is(Blocks.BROWN_STAINED_GLASS);
            if (var2 == null) {
               return var4;
            }

            if (!var4) {
               return false;
            }
         }

         var3 = true;
      }

      return var3;
   }

   public final boolean z(@NotNull BlockState var1) {
      int[] var10000 = c();
      short var10002 = 28220;
      short var10003 = -19938;
      Intrinsics.checkNotNullParameter(var1, "state");
      int[] var2 = var10000;
      boolean var3 = var1.is(Blocks.GREEN_STAINED_GLASS_PANE);
      if (var2 != null) {
         if (!var3) {
            boolean var4 = var1.is(Blocks.GREEN_STAINED_GLASS);
            if (var2 == null) {
               return var4;
            }

            if (!var4) {
               return false;
            }
         }

         var3 = true;
      }

      return var3;
   }

   public final boolean A(@NotNull BlockState var1) {
      int[] var10000 = c();
      short var10002 = 28220;
      short var10003 = -19938;
      Intrinsics.checkNotNullParameter(var1, "state");
      int[] var2 = var10000;
      boolean var3 = var1.is(Blocks.BLACK_STAINED_GLASS_PANE);
      if (var2 != null) {
         if (!var3) {
            boolean var4 = var1.is(Blocks.BLACK_STAINED_GLASS);
            if (var2 == null) {
               return var4;
            }

            if (!var4) {
               return false;
            }
         }

         var3 = true;
      }

      return var3;
   }

   public final boolean B(@NotNull BlockState var1) {
      int[] var10000 = c();
      short var10002 = 28220;
      short var10003 = -19938;
      Intrinsics.checkNotNullParameter(var1, "state");
      int[] var2 = var10000;
      boolean var3 = var1.is(Blocks.RED_STAINED_GLASS_PANE);
      if (var2 != null) {
         if (!var3) {
            boolean var4 = var1.is(Blocks.RED_STAINED_GLASS);
            if (var2 == null) {
               return var4;
            }

            if (!var4) {
               return false;
            }
         }

         var3 = true;
      }

      return var3;
   }

   public final boolean C(@NotNull BlockState var1) {
      int[] var10000 = c();
      short var10002 = 28220;
      short var10003 = -19938;
      Intrinsics.checkNotNullParameter(var1, "state");
      int[] var2 = var10000;
      boolean var3 = this.x(var1);
      if (var2 != null) {
         if (!var3) {
            boolean var4 = this.y(var1);
            if (var2 == null) {
               return var4;
            }

            if (!var4) {
               boolean var5 = this.z(var1);
               if (var2 == null) {
                  return var5;
               }

               if (!var5) {
                  boolean var6 = this.A(var1);
                  if (var2 == null) {
                     return var6;
                  }

                  if (!var6) {
                     return false;
                  }
               }
            }
         }

         var3 = true;
      }

      return var3;
   }

   public final boolean D(@NotNull BlockState var1) {
      int[] var10000 = c();
      short var10002 = 28220;
      short var10003 = -19938;
      Intrinsics.checkNotNullParameter(var1, "state");
      int[] var2 = var10000;
      boolean var3 = this.q(var1);
      if (var2 != null) {
         if (!var3) {
            boolean var4 = this.r(var1);
            if (var2 == null) {
               return var4;
            }

            if (!var4) {
               boolean var5 = this.s(var1);
               if (var2 == null) {
                  return var5;
               }

               if (!var5) {
                  boolean var6 = this.t(var1);
                  if (var2 == null) {
                     return var6;
                  }

                  if (!var6) {
                     boolean var7 = this.u(var1);
                     if (var2 == null) {
                        return var7;
                     }

                     if (!var7) {
                        boolean var8 = this.v(var1);
                        if (var2 == null) {
                           return var8;
                        }

                        if (!var8) {
                           boolean var9 = this.w(var1);
                           if (var2 == null) {
                              return var9;
                           }

                           if (!var9) {
                              boolean var10 = this.x(var1);
                              if (var2 == null) {
                                 return var10;
                              }

                              if (!var10) {
                                 boolean var11 = this.y(var1);
                                 if (var2 == null) {
                                    return var11;
                                 }

                                 if (!var11) {
                                    boolean var12 = this.z(var1);
                                    if (var2 == null) {
                                       return var12;
                                    }

                                    if (!var12) {
                                       boolean var13 = this.A(var1);
                                       if (var2 == null) {
                                          return var13;
                                       }

                                       if (!var13) {
                                          boolean var14 = this.B(var1);
                                          if (var2 == null) {
                                             return var14;
                                          }

                                          if (!var14) {
                                             return false;
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         var3 = true;
      }

      return var3;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @NotNull
   public final Map<BlockPos, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll> a(
      @NotNull BlockPos var1, int var2, boolean var3, boolean var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9
   ) {
      Object var37 = null; // PX-FIX
      Object var33 = null; // PX-FIX
      Block var32 = null; // PX-FIX
      int var27 = 0; // PX-FIX
      int[] var10000 = c();
      short var10002 = 28217;
      short var10003 = 9090;
      Intrinsics.checkNotNullParameter(var1, "position");
      HashMap var11 = new HashMap();
      Vec3 var10001 = lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .g(var1)
         .add(new Vec3(0.0, 1.27, 0.0));
      var10003 = 28223;
      short var10004 = -32070;
      Intrinsics.checkNotNullExpressionValue(var10001, "add(...)");
      Vec3 var12 = var10001;
      double var13 = Math.pow(var2, 2);
      int[] var10 = var10000;
      int var15 = -var2;
      int var26 = var15;
      if (var10 != null) {
         if (var15 > var2) {
            return var11;
         }

         var26 = -var2;
      }

      while (true) {
         label148: {
            int var16 = var26;
            if (var16 <= var2) {
               do {
                  int var17 = -var2;
                  var27 = var17;
                  var37 = var2;
                  if (var10 == null) {
                     break label148;
                  }

                  label149: {
                     if (var17 <= var2) {
                        do {
                           var27 = var16;
                           if (var10 == null) {
                              var37 = var2;
                              break label149;
                           }

                           label125: {
                              label144: {
                                 label123:
                                 if (var16 == 0) {
                                    var27 = var17;
                                    if (var10 == null) {
                                       break label125;
                                    }

                                    if (var10 != null) {
                                       if (var17 != 0) {
                                          break label123;
                                       }

                                       var27 = var15;
                                    }

                                    if (var10 == null) {
                                       break label125;
                                    }

                                    if ((((var27 != 0) ? 1 : 0)) <= 0) {
                                       break label144;
                                    }
                                 }

                                 BlockPos var28 = var1.offset(var16, var15, var17);
                                 var10002 = 28219;
                                 var10003 = -5911;
                                 Intrinsics.checkNotNullExpressionValue(var28, "offset(...)");
                                 BlockPos var18 = var28;
                                 ClientLevel var29 = llIIIIIIIllIllIIllIlIIlIlIIIlllllllllIIIlllIIIlIIlIlIllIlIllIlllllIllIIllllIlIIllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                    .a()
                                    .level;
                                 Intrinsics.checkNotNull(var29);
                                 BlockState var30 = var29.getBlockState(var18);
                                 var10002 = 28210;
                                 var10003 = -30809;
                                 Intrinsics.checkNotNullExpressionValue(var30, "getBlockState(...)");
                                 BlockState var19 = var30;
                                 var27 = ((this.a(var19, var3, var4, var5, var6, var7, var8, var9)) ? 1 : 0);
                                 if (var10 == null) {
                                    break label125;
                                 }

                                 if ((var27 == 0)) {
                                    double var47;
                                    var27 = (
                                             var47 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                                   .b(
                                                      var12,
                                                      lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                                         .d(var18)
                                                   )
                                                - var13
                                          )
                                          == 0.0
                                       ? 0
                                       : (var47 < 0.0 ? -1 : 1);
                                    if (var10 == null) {
                                       break label125;
                                    }

                                    if ((((var27 != 0) ? 1 : 0)) < 0) {
                                       label108: {
                                          label146: {
                                             Block var21 = var19.getBlock();
                                             boolean var31 = var21 instanceof StainedGlassBlock;
                                             if (var10 != null) {
                                                if (var31) {
                                                   Block var34 = var19.getBlock();
                                                   var10002 = 28218;
                                                   var10003 = 7926;
                                                   Intrinsics.checkNotNull(
                                                      var34, "null cannot be cast to non-null type net.minecraft.world.level.block.StainedGlassBlock"
                                                   );
                                                   var33 = ((StainedGlassBlock)var34).getColor();
                                                   break label108;
                                                }

                                                var32 = var21;
                                                if (var10 == null) {
                                                   break label146;
                                                }

                                                var31 = var21 instanceof StainedGlassPaneBlock;
                                             }

                                             if (!var31) {
                                                var33 = null;
                                                break label108;
                                             }

                                             var32 = var19.getBlock();
                                             var10002 = 28222;
                                             var10003 = 20902;
                                             Intrinsics.checkNotNull(
                                                var32, "null cannot be cast to non-null type net.minecraft.world.level.block.StainedGlassPaneBlock"
                                             );
                                          }

                                          var33 = ((StainedGlassPaneBlock)var32).getColor();
                                       }

                                       DyeColor var20 =((DyeColor)( var33));
                                       if (var10 != null) {
                                          if (var20 != null) {
                                             boolean var23 = false;
                                             if (var10 != null) {
                                                llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var35 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                                                   var20
                                                );
                                                if (var35 != null) {
                                                   llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var24 = var35;
                                                   boolean var25 = false;
                                                   llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var36 = ((llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll)(var11.put(
                                                      var18, var24
                                                   )));
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }

                              var27 = var17;
                           }

                           var37 = var2;
                           if (var10 == null) {
                              break label149;
                           }

                           if (var27 ==( ((var2 == 0)) ? 1 : 0)) {
                              break;
                           }

                           var17++;
                        } while (var10 != null);
                     }

                     var27 = var16;
                     var37 = var2;
                  }

                  if (var10 == null) {
                     break label148;
                  }

                  if (var27 ==( ((var37 == null)) ? 1 : 0)) {
                     break;
                  }

                  var16++;
               } while (var10 != null);
            }

            var27 = var15;
            var37 = var2;
         }

         if (var27 ==( ((var37 == null)) ? 1 : 0)) {
            break;
         }

         var15++;
         if (var10 == null) {
            break;
         }

         var26 = -var2;
      }

      return var11;
   }

   private final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll a(DyeColor var1) {
      Object llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll = null; // PX-FIX
      return switch ((Integer)(((Object[])IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)[var1.ordinal()])) {
         case 1 -> new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 110, 0);
         case 2 -> new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(250, 0, 250);
         case 3 -> new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(102, 178, 255);
         case 4 -> new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 210, 0);
         case 5 -> new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(160, 255, 47);
         case 6 -> new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(153, 50, 204);
         case 7 -> new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(200, 15, 45);
         default -> null;
      };
   }

   private final boolean a(BlockState var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6, boolean var7, boolean var8) {
      int[] var9 = c();
      boolean var10000 = this.s(var1);
      if (var9 != null) {
         if (var10000) {
            if (var9 == null) {
               return var3;
            }

            if (var3) {
               return true;
            }
         }

         var10000 = this.u(var1);
      }

      if (var9 != null) {
         if (var10000) {
            if (var9 == null) {
               return var5;
            }

            if (var5) {
               return true;
            }
         }

         var10000 = this.v(var1);
      }

      if (var9 != null) {
         if (var10000) {
            if (var9 == null) {
               return var6;
            }

            if (var6) {
               return true;
            }
         }

         var10000 = this.t(var1);
      }

      if (var9 != null) {
         if (var10000) {
            if (var9 == null) {
               return var4;
            }

            if (var4) {
               return true;
            }
         }

         var10000 = this.B(var1);
      }

      if (var9 != null) {
         if (var10000) {
            if (var9 == null) {
               return var8;
            }

            if (var8) {
               return true;
            }
         }

         var10000 = this.r(var1);
      }

      if (var9 != null) {
         if (var10000) {
            if (var9 == null) {
               return var2;
            }

            if (var2) {
               return true;
            }
         }

         var10000 = this.w(var1);
      }

      if (var9 != null) {
         if (!var10000) {
            return false;
         }

         var10000 = var7;
      }

      return var9 == null ? var10000 : var10000;
   }

   public final boolean E(@NotNull BlockState var1) {
      int[] var10000 = c();
      short var10002 = 28220;
      short var10003 = -19938;
      Intrinsics.checkNotNullParameter(var1, "state");
      int[] var2 = var10000;
      boolean var3 = this.C(var1);
      if (var2 != null) {
         if (!var3) {
            boolean var4 = this.m(var1);
            if (var2 == null) {
               return var4;
            }

            if (!var4) {
               boolean var5 = this.l(var1);
               if (var2 == null) {
                  return var5;
               }

               if (!var5) {
                  boolean var6 = this.n(var1);
                  if (var2 == null) {
                     return var6;
                  }

                  if (!var6) {
                     return false;
                  }
               }
            }
         }

         var3 = true;
      }

      return var3;
   }

   public final boolean F(@NotNull BlockState var1) {
      int[] var10000 = c();
      short var10002 = 28220;
      short var10003 = -19938;
      Intrinsics.checkNotNullParameter(var1, "state");
      int[] var2 = var10000;
      boolean var3 = this.p(var1);
      if (var2 != null) {
         if (!var3) {
            boolean var4 = this.k(var1);
            if (var2 == null) {
               return var4;
            }

            if (!var4) {
               boolean var5 = this.m(var1);
               if (var2 == null) {
                  return var5;
               }

               if (!var5) {
                  boolean var6 = this.l(var1);
                  if (var2 == null) {
                     return var6;
                  }

                  if (!var6) {
                     boolean var7 = this.n(var1);
                     if (var2 == null) {
                        return var7;
                     }

                     if (!var7) {
                        return false;
                     }
                  }
               }
            }
         }

         var3 = true;
      }

      return var3;
   }

   public final boolean G(@NotNull BlockState var1) {
      int[] var10000 = c();
      short var10002 = 28220;
      short var10003 = -19938;
      Intrinsics.checkNotNullParameter(var1, "state");
      int[] var2 = var10000;
      boolean var3 = var1.is(Blocks.CHEST);
      if (var2 != null) {
         if (!var3) {
            boolean var4 = var1.is(Blocks.TRAPPED_CHEST);
            if (var2 == null) {
               return var4;
            }

            if (!var4) {
               return false;
            }
         }

         var3 = true;
      }

      return var3;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var23 = null; // PX-FIX
      String[] var5 = new String[9];
      int[] var10000 = new int[5];
      int var3 = 0;
      String var2 = "\u0089¯X\u0013õ]²à\\v\rS\u0084b´ÏuÔ¨\u001aÒ\"©\u000e/3÷â)º4Ç,\u0018F\u001a¿Bç ¦Ê|Þ\bJ\u0085\u009a£@Ù#î°\u008e\u00074M®oF\u0084f9bÀ\u009fÎoÅXÉ>KÙ\u0013üÌx\u00ad`ÕÀ\u0096°\u0012\u000b\u000f\u0004£\b\u0084Õ8D-ë6\u0005Ù\u0088ÜÂM\bYà\u0080¦FD\u0014\u0088Z×\u009c\u0093u\u008c\u0091\u009dy¹E±5\u0013®FV+çc|«î\u0086\u0097Ê\u0000K\u0084¾vÆ^r+\u008d|Æ\u008eÈ9CùÀ¸\u009f\u0086w\u0003ýs\u0012E\u0097|¡\u009eÑ~\u0012\tÑH\u0094 <óT¨\u0016\twPÛxeuk\u0000\u008a4>ô\u0006ãÂ´[¢Ö\u0000\b´\u008c\u0019\u0000Ú¾×?\u0005}ëu¢¹";
      int var4 = "\u0089¯X\u0013õ]²à\\v\rS\u0084b´ÏuÔ¨\u001aÒ\"©\u000e/3÷â)º4Ç,\u0018F\u001a¿Bç ¦Ê|Þ\bJ\u0085\u009a£@Ù#î°\u008e\u00074M®oF\u0084f9bÀ\u009fÎoÅXÉ>KÙ\u0013üÌx\u00ad`ÕÀ\u0096°\u0012\u000b\u000f\u0004£\b\u0084Õ8D-ë6\u0005Ù\u0088ÜÂM\bYà\u0080¦FD\u0014\u0088Z×\u009c\u0093u\u008c\u0091\u009dy¹E±5\u0013®FV+çc|«î\u0086\u0097Ê\u0000K\u0084¾vÆ^r+\u008d|Æ\u008eÈ9CùÀ¸\u009f\u0086w\u0003ýs\u0012E\u0097|¡\u009eÑ~\u0012\tÑH\u0094 <óT¨\u0016\twPÛxeuk\u0000\u008a4>ô\u0006ãÂ´[¢Ö\u0000\b´\u008c\u0019\u0000Ú¾×?\u0005}ëu¢¹"
         .length();
      b(var10000);
      char var1 = 'V';
      int var9 = -1;

      label52:
      while (true) {
         byte var11 = 103;
         String var10001 = var2.substring(++var9, var9 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var27 = var10001.toCharArray();
               int var10004 = var27.length;
               int var6 = 0;
               byte var30 = var11;
               var23 = var27;
               int var17 = var10004;
               byte var35;
               char[] var39;
               int var10006;
               if (var10004 <= 1) {
                  var39 = var27;
                  var35 = var11;
                  var10006 = var6;
               } else {
                  var30 = var11;
                  var17 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var39 = var27;
                  var35 = var11;
                  var10006 = var6;
               }

               while (true) {
                  var39[var10006] = (char)(var39[var10006] ^ var35 ^ switch (var6 % 7) {
                     case 0 -> 11;
                     case 1 -> 14;
                     case 2 -> 76;
                     case 3 -> 27;
                     case 4 -> 61;
                     case 5 -> 85;
                     default -> 101;
                  });
                  var6++;
                  if (var30 == 0) {
                     var10006 = var30;
                     var39 = var23;
                     var35 = var30;
                  } else {
                     if (var17 <= var6) {
                        break;
                     }

                     var39 = var23;
                     var35 = var30;
                     var10006 = var6;
                  }
               }
            }

            String var32 = new String(var23).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var32;
                  if ((var9 += var1) >= var4) {
                     a = var5;
                     b = new String[9];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl();
                     Pair[] var7 = new Pair[]{
                        TuplesKt.to(Blocks.SAND, Blocks.SANDSTONE),
                        TuplesKt.to(Blocks.RED_SAND, Blocks.RED_SANDSTONE),
                        TuplesKt.to(Blocks.MYCELIUM, Blocks.BROWN_TERRACOTTA),
                        TuplesKt.to(Blocks.END_STONE, Blocks.BEDROCK),
                        TuplesKt.to(Blocks.OBSIDIAN, Blocks.BEDROCK)
                     };
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = MapsKt.mapOf(var7);
                     Block[] var10 = new Block[]{
                        Blocks.INFESTED_STONE,
                        Blocks.GOLD_ORE,
                        Blocks.IRON_ORE,
                        Blocks.COAL_ORE,
                        Blocks.LAPIS_ORE,
                        Blocks.DIAMOND_ORE,
                        Blocks.REDSTONE_ORE,
                        Blocks.EMERALD_ORE,
                        Blocks.STONE,
                        Blocks.WHITE_TERRACOTTA,
                        Blocks.ORANGE_TERRACOTTA,
                        Blocks.MAGENTA_TERRACOTTA,
                        Blocks.LIGHT_BLUE_TERRACOTTA,
                        Blocks.YELLOW_TERRACOTTA,
                        Blocks.LIME_TERRACOTTA,
                        Blocks.PINK_TERRACOTTA,
                        Blocks.GRAY_TERRACOTTA,
                        Blocks.LIGHT_GRAY_TERRACOTTA,
                        Blocks.CYAN_TERRACOTTA,
                        Blocks.PURPLE_TERRACOTTA,
                        Blocks.BLUE_TERRACOTTA,
                        Blocks.BROWN_TERRACOTTA,
                        Blocks.GREEN_TERRACOTTA,
                        Blocks.RED_TERRACOTTA,
                        Blocks.BLACK_TERRACOTTA,
                        Blocks.ORANGE_WOOL,
                        Blocks.MAGENTA_WOOL,
                        Blocks.LIGHT_BLUE_WOOL,
                        Blocks.YELLOW_WOOL,
                        Blocks.LIME_WOOL,
                        Blocks.PINK_WOOL,
                        Blocks.GRAY_WOOL,
                        Blocks.CYAN_WOOL,
                        Blocks.BLUE_WOOL,
                        Blocks.BROWN_WOOL,
                        Blocks.GREEN_WOOL,
                        Blocks.BLACK_WOOL
                     };
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = SetsKt.setOf(var10);
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var9);
                  break;
               default:
                  var5[var3++] = var32;
                  if ((var9 += var1) < var4) {
                     var1 = var2.charAt(var9);
                     continue label52;
                  }

                  var2 = "`Üò`m\u0012\u009f¸\u008eé\\ÁdßÝ\u000b\u0096ôc!\u0085*÷ò";
                  var4 = "`Üò`m\u0012\u009f¸\u008eé\\ÁdßÝ\u000b\u0096ôc!\u0085*÷ò".length();
                  var1 = 5;
                  var9 = -1;
            }

            var11 = 71;
            var10001 = var2.substring(++var9, var9 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   public static void b(int[] var0) {
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var0;
   }

   public static int[] c() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 28218) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 208;
            case 1 -> 124;
            case 2 -> 40;
            case 3 -> 6;
            case 4 -> 228;
            case 5 -> 233;
            case 6 -> 112;
            case 7 -> 34;
            case 8 -> 227;
            case 9 -> 223;
            case 10 -> 103;
            case 11 -> 44;
            case 12 -> 12;
            case 13 -> 220;
            case 14 -> 119;
            case 15 -> 96;
            case 16 -> 144;
            case 17 -> 188;
            case 18 -> 25;
            case 19 -> 50;
            case 20 -> 179;
            case 21 -> 53;
            case 22 -> 97;
            case 23 -> 62;
            case 24 -> 191;
            case 25 -> 37;
            case 26 -> 77;
            case 27 -> 76;
            case 28 -> 116;
            case 29 -> 121;
            case 30 -> 244;
            case 31 -> 117;
            case 32 -> 126;
            case 33 -> 141;
            case 34 -> 253;
            case 35 -> 156;
            case 36 -> 47;
            case 37 -> 177;
            case 38 -> 207;
            case 39 -> 135;
            case 40 -> 169;
            case 41 -> 9;
            case 42 -> 29;
            case 43 -> 80;
            case 44 -> 241;
            case 45 -> 180;
            case 46 -> 105;
            case 47 -> 254;
            case 48 -> 67;
            case 49 -> 130;
            case 50 -> 225;
            case 51 -> 187;
            case 52 -> 143;
            case 53 -> 61;
            case 54 -> 240;
            case 55 -> 21;
            case 56 -> 217;
            case 57 -> 201;
            case 58 -> 149;
            case 59 -> 138;
            case 60 -> 39;
            case 61 -> 246;
            case 62 -> 175;
            case 63 -> 129;
            case 64 -> 154;
            case 65 -> 167;
            case 66 -> 166;
            case 67 -> 66;
            case 68 -> 210;
            case 69 -> 216;
            case 70 -> 160;
            case 71 -> 74;
            case 72 -> 27;
            case 73 -> 4;
            case 74 -> 232;
            case 75 -> 101;
            case 76 -> 235;
            case 77 -> 42;
            case 78 -> 205;
            case 79 -> 224;
            case 80 -> 90;
            case 81 -> 199;
            case 82 -> 102;
            case 83 -> 237;
            case 84 -> 136;
            case 85 -> 139;
            case 86 -> 219;
            case 87 -> 173;
            case 88 -> 183;
            case 89 -> 109;
            case 90 -> 99;
            case 91 -> 145;
            case 92 -> 59;
            case 93 -> 0;
            case 94 -> 13;
            case 95 -> 212;
            case 96 -> 218;
            case 97 -> 198;
            case 98 -> 46;
            case 99 -> 221;
            case 100 -> 178;
            case 101 -> 215;
            case 102 -> 65;
            case 103 -> 68;
            case 104 -> 146;
            case 105 -> 190;
            case 106 -> 125;
            case 107 -> 174;
            case 108 -> 238;
            case 109 -> 55;
            case 110 -> 193;
            case 111 -> 231;
            case 112 -> 86;
            case 113 -> 2;
            case 114 -> 115;
            case 115 -> 230;
            case 116 -> 10;
            case 117 -> 203;
            case 118 -> 26;
            case 119 -> 137;
            case 120 -> 22;
            case 121 -> 108;
            case 122 -> 98;
            case 123 -> 36;
            case 124 -> 48;
            case 125 -> 194;
            case 126 -> 51;
            case 127 -> 128;
            case 128 -> 41;
            case 129 -> 153;
            case 130 -> 58;
            case 131 -> 226;
            case 132 -> 132;
            case 133 -> 189;
            case 134 -> 123;
            case 135 -> 38;
            case 136 -> 151;
            case 137 -> 35;
            case 138 -> 104;
            case 139 -> 155;
            case 140 -> 23;
            case 141 -> 111;
            case 142 -> 206;
            case 143 -> 255;
            case 144 -> 204;
            case 145 -> 5;
            case 146 -> 229;
            case 147 -> 192;
            case 148 -> 52;
            case 149 -> 251;
            case 150 -> 16;
            case 151 -> 247;
            case 152 -> 15;
            case 153 -> 152;
            case 154 -> 110;
            case 155 -> 70;
            case 156 -> 32;
            case 157 -> 134;
            case 158 -> 234;
            case 159 -> 56;
            case 160 -> 172;
            case 161 -> 213;
            case 162 -> 242;
            case 163 -> 168;
            case 164 -> 197;
            case 165 -> 148;
            case 166 -> 196;
            case 167 -> 20;
            case 168 -> 245;
            case 169 -> 182;
            case 170 -> 106;
            case 171 -> 140;
            case 172 -> 54;
            case 173 -> 159;
            case 174 -> 87;
            case 175 -> 78;
            case 176 -> 165;
            case 177 -> 236;
            case 178 -> 94;
            case 179 -> 24;
            case 180 -> 185;
            case 181 -> 202;
            case 182 -> 30;
            case 183 -> 163;
            case 184 -> 248;
            case 185 -> 83;
            case 186 -> 147;
            case 187 -> 209;
            case 188 -> 100;
            case 189 -> 81;
            case 190 -> 249;
            case 191 -> 85;
            case 192 -> 92;
            case 193 -> 195;
            case 194 -> 82;
            case 195 -> 131;
            case 196 -> 45;
            case 197 -> 127;
            case 198 -> 181;
            case 199 -> 33;
            case 200 -> 91;
            case 201 -> 200;
            case 202 -> 69;
            case 203 -> 118;
            case 204 -> 60;
            case 205 -> 57;
            case 206 -> 49;
            case 207 -> 63;
            case 208 -> 79;
            case 209 -> 11;
            case 210 -> 84;
            case 211 -> 243;
            case 212 -> 250;
            case 213 -> 162;
            case 214 -> 184;
            case 215 -> 28;
            case 216 -> 1;
            case 217 -> 31;
            case 218 -> 8;
            case 219 -> 7;
            case 220 -> 93;
            case 221 -> 89;
            case 222 -> 95;
            case 223 -> 150;
            case 224 -> 72;
            case 225 -> 176;
            case 226 -> 158;
            case 227 -> 114;
            case 228 -> 161;
            case 229 -> 107;
            case 230 -> 142;
            case 231 -> 19;
            case 232 -> 239;
            case 233 -> 122;
            case 234 -> 88;
            case 235 -> 18;
            case 236 -> 120;
            case 237 -> 113;
            case 238 -> 43;
            case 239 -> 64;
            case 240 -> 222;
            case 241 -> 211;
            case 242 -> 73;
            case 243 -> 17;
            case 244 -> 3;
            case 245 -> 71;
            case 246 -> 75;
            case 247 -> 133;
            case 248 -> 252;
            case 249 -> 157;
            case 250 -> 170;
            case 251 -> 164;
            case 252 -> 171;
            case 253 -> 14;
            case 254 -> 214;
            default -> 186;
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

   // PX-FIX synth restored from jar bytecode
  public static void b() { }
}
