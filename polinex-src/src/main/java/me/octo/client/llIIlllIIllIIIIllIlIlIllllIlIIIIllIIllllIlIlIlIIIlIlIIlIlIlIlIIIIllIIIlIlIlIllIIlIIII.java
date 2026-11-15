package me.octo.client;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.HitResult.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llIIlllIIllIIIIllIlIlIllllIlIIIIllIIllllIlIlIlIIIlIlIIlIlIlIlIIIIllIIIlIlIlIllIIlIIII
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static llIIlllIIllIIIIllIlIlIllllIlIIIIllIIllllIlIlIlIIIlIlIIlIlIlIlIIIIllIIIlIlIlIllIIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @Nullable
   private BlockPos lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private List<BlockPos> lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private int IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private boolean llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @NotNull
   private static llIIlllIIllIIIIllIlIlIllllIlIIIIllIIllllIlIlIlIIIlIlIIlIlIlIlIIIIllIIIlIlIlIllIIlIIII IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static String[] f;
   private static String[] g;

   private llIIlllIIllIIIIllIlIlIllllIlIIIIllIIllllIlIlIlIIIlIlIIlIlIlIlIIIIllIIIlIlIlIllIIlIIII() {
      short var10001 = 15951;
      short var10002 = 31389;
      var10002 = 15936;
      short var10003 = -3977;
      short var10004 = 15946;
      short var10005 = -21768;
      super(
         "Sweep Overlay",
         "Highlights wood that will be broken in Galatea.",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
         "Render"
      );
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new ArrayList<>();
   }

   @Nullable
   public final BlockPos ag() {
      return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   public final void a(@Nullable BlockPos var1) {
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var1;
   }

   @NotNull
   public final List<BlockPos> ah() {
      return this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   }

   public final void a(@NotNull List<BlockPos> var1) {
      short var10001 = 15948;
      short var10002 = -27523;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var1;
   }

   public final int ai() {
      return this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   }

   public final void a(int var1) {
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var1;
   }

   public final boolean aG() {
      return this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   }

   public final void d(boolean var1) {
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var1;
   }

   private final BlockPos a(LocalPlayer var1, double var2) {
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      LocalPlayer var10001 = this.ap().player;
      Intrinsics.checkNotNull(var10001);
      Entity var13 = var10001;
      LocalPlayer var10004 = this.ap().player;
      Intrinsics.checkNotNull(var10004);
      float var16 = var10004.getYRot();
      LocalPlayer var10005 = this.ap().player;
      Intrinsics.checkNotNull(var10005);
      HitResult var5 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(
         var13, var2, 1.0F, var16, var10005.getXRot()
      );
      String var4 = var10000;
      HitResult var8 = var5;
      if (var4 == null) {
         if (var5.getType() != Type.BLOCK) {
            return null;
         }

         short var14 = 15949;
         short var10002 = -14082;
         Intrinsics.checkNotNull(var5, "null cannot be cast to non-null type net.minecraft.world.phys.BlockHitResult");
         var8 = var5;
      }

      BlockPos var9 = ((BlockHitResult)var8).getBlockPos();
      short var15 = 15950;
      short var10003 = -27693;
      Intrinsics.checkNotNullExpressionValue(var9, "getBlockPos(...)");
      BlockPos var6 = var9;
      if (var4 == null) {
         ClientLevel var10 = this.ap().level;
         if (var10 != null) {
            ClientLevel var7 = var10;
            boolean var11 = var7.getBlockState(var6).is(Blocks.MANGROVE_WOOD);
            if (var4 == null) {
               if (var11) {
                  return var6;
               }

               var11 = var7.getBlockState(var6).is(Blocks.STRIPPED_SPRUCE_WOOD);
            }

            if (!var11) {
               return null;
            }

            return var6;
         }
      }

      return null;
   }


   static BlockPos a(llIIlllIIllIIIIllIlIlIllllIlIIIIllIIllllIlIlIlIIIlIlIIlIlIlIlIIIIllIIIlIlIlIllIIlIIII var0, LocalPlayer var1, double var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = 5.0;
      }

      return var0.a(var1, var2);
   }
   private final int a(int var1, int var2) {
      double var5;
      label14: {
         String var3 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
         int var10000 = var2;
         if (var3 == null) {
            if (var2 <= 0) {
               var5 = var1;
               break label14;
            }

            var10000 = 3;
         }

         var5 = var10000 * Math.log(var1) - 1.75 * Math.log(var2) + 2;
      }

      int var4 = MathKt.roundToInt(var5);
      return Math.min(35, var4);
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl var1) {
      short var10001 = 15938;
      short var10002 = -28366;
      Intrinsics.checkNotNullParameter(var1, "event");
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = me.octo.client.utils.lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .i();
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .q();
   }

   @SubscribeEvent(
      priority = EventPriority.HIGH
   )
   public final void a(@NotNull me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var1) {
      Object var28 = null; // PX-FIX
      Object var27 = null; // PX-FIX
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      short var10002 = 15937;
      short var10003 = 12102;
      Intrinsics.checkNotNullParameter(var1, "event");
      String var2 = var10000;
      llIIlllIIllIIIIllIlIlIllllIlIIIIllIIllllIlIlIlIIIlIlIIlIlIlIlIIIIllIIIlIlIlIllIIlIIII var23 = this;
      if (var2 == null) {
         if (!this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI) {
            return;
         }

         var23 = this;
      }

      LocalPlayer var24 = var23.ap().player;
      if (var24 != null) {
         LocalPlayer var3 = var24;
         if (var2 == null) {
            ClientLevel var25 = this.ap().level;
            if (var25 != null) {
               ClientLevel var4 = var25;
               BlockPos var5 = a(this, var3, 0.0, 2, null);
               BlockPos var26 = var5;
               if (var2 == null) {
                  if (var5 == null) {
                     this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = null;
                     return;
                  }

                  var26 = var5;
               }

               var27 = Intrinsics.areEqual(var26, this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl);
               label150:
               if (var2 == null) {
                  if (((Boolean)(var27))) {
                     label146: {
                        this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var5;
                        this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.clear();
                        Block var7 = var4.getBlockState(var5).getBlock();
                        var28 = Intrinsics.areEqual(var7, Blocks.STRIPPED_SPRUCE_WOOD);
                        if (var2 == null) {
                           if ((Boolean)var28) {
                              var28 = 7;
                              break label146;
                           }

                           var28 = Intrinsics.areEqual(var7, Blocks.MANGROVE_WOOD);
                        }

                        if (var2 == null) {
                           var28 = ((Boolean)var28 ? 50 : 0);
                        }
                     }

                     int var6 =((Integer)( var28));
                     int var20 = this.a(this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, var6);
                     HashSet var8 = new HashSet();
                     ArrayDeque var9 = new ArrayDeque();
                     int var10 = 0;
                     var9.add(var5);
                     var8.add(var5);

                     label140:
                     while (true) {
                        var27 = var10;

                        label138:
                        while (true) {
                           if (((Integer)var27) >= (((var20 != 0) ? 1 : 0))) {
                              break label140;
                           }

                           var27 = var9.isEmpty();

                           while (true) {
                              if (var2 != null) {
                                 break label150;
                              }

                              if (!((Boolean)var27)) {
                                 break label140;
                              }

                              BlockPos var11;
                              var11 = (BlockPos)var9.removeFirst();
                              BlockState var29 = var4.getBlockState(var11);
                              var10002 = 15944;
                              var10003 = -28202;
                              Intrinsics.checkNotNullExpressionValue(var29, "getBlockState(...)");
                              BlockState var12 = var29;
                              boolean var30 = var12.is(Blocks.STRIPPED_SPRUCE_WOOD);
                              label106:
                              if (var2 == null) {
                                 if (!var30) {
                                    boolean var31 = var12.is(Blocks.MANGROVE_WOOD);
                                    if (var2 != null) {
                                       break label106;
                                    }

                                    if (!var31) {
                                       continue label140;
                                    }
                                 }

                                 var10++;
                                 this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.add(var11);
                              }

                              BlockPos[] var13 = me.octo.client.utils.lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .h();
                              int var14 = 0;
                              int var15 = var13.length;

                              while (true) {
                                 if (var14 >= var15) {
                                    continue label140;
                                 }

                                 BlockPos var16 = var13[var14];
                                 BlockPos var32 = var11.offset(var16);
                                 var10002 = 15945;
                                 var10003 = -7432;
                                 Intrinsics.checkNotNullExpressionValue(var32, "offset(...)");
                                 BlockPos var17 = var32;
                                 BlockState var33 = var4.getBlockState(var17);
                                 var10002 = 15947;
                                 var10003 = 19102;
                                 Intrinsics.checkNotNullExpressionValue(var33, "getBlockState(...)");
                                 BlockState var18 = var33;
                                 if (var2 == null) {
                                    var27 = var8.contains(var17);
                                    if (var2 != null) {
                                       break;
                                    }

                                    if (var2 != null) {
                                       continue label138;
                                    }

                                    label119:
                                    if (((Boolean)(var27))) {
                                       boolean var34 = var9.contains(var17);
                                       if (var2 == null) {
                                          if (var34) {
                                             break label119;
                                          }

                                          var34 = var18.is(Blocks.STRIPPED_SPRUCE_WOOD);
                                       }

                                       if (var2 == null && (var34 || var2 == null && var18.is(Blocks.MANGROVE_WOOD))) {
                                          var9.add(var17);
                                          var8.add(var17);
                                       }
                                    }

                                    var14++;
                                 }

                                 if (var2 != null) {
                                    break label140;
                                 }
                              }
                           }
                        }
                     }
                  }

                  var27 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.isEmpty();
               }

               if (var2 == null) {
                  var27 =((Boolean)(Object)( (Boolean)var27 ? 1 : 0));
               }

               if (!((Boolean)var27)) {
                  llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var19 = new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(
                     me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll
                        .a(0.7F)
                        .o()
                  );

                  for (BlockPos var22 : this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll) {
                     IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a(
                        var22, null, var19, 2.0F, null, null, 0.0F, false, 0.0F);
                     if (var2 != null) {
                        break;
                     }
                  }
               }

               return;
            }
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[11];
      int var3 = 0;
      String var2 = "\u0083\u0015z¸Áï\u009d\u008d@6ÁP\u008dÿÏSÉ9\u000b¦àÅTo~+\u0082É`j\u0006xD\u008c´O\u0091\u0012½\u0012½X9ó\u0082\u000e£F½^\u0002>>k÷>\u0007s\u0012EºT\u000f\u001bLë\u0097GÔ1\u0085DH\u00040Æ¼Ýñ,;5\u008a\u0087ñYì^\u0084\u0011E\u0010Bf(\u008eU\\j&ç5®v\u001a´ó\u008d\u007fe¾\u000f$\u009c$¸ü\u0002l3ò0ip»\u0000\u0092xLÅþÀ\u0080ê\u0002ÒpÄ#ñV\u0010; m\u000e#9ÁWÈv¡|\u009a«\u000f\u0018\r\u0015G\u000b\u0085ÀÄ\u000eS\u00adU\u0081ï5/Æ%\u000b\u0019\u009e²rã\u001e\u009f\u0088\u0081Çá\u00871\u0099û°ó\\jiM\u0094p\u008ch\u0006\tcñ#D+ø\u0000 õèfùy\u0005òª¡";
      int var4 = "\u0083\u0015z¸Áï\u009d\u008d@6ÁP\u008dÿÏSÉ9\u000b¦àÅTo~+\u0082É`j\u0006xD\u008c´O\u0091\u0012½\u0012½X9ó\u0082\u000e£F½^\u0002>>k÷>\u0007s\u0012EºT\u000f\u001bLë\u0097GÔ1\u0085DH\u00040Æ¼Ýñ,;5\u008a\u0087ñYì^\u0084\u0011E\u0010Bf(\u008eU\\j&ç5®v\u001a´ó\u008d\u007fe¾\u000f$\u009c$¸ü\u0002l3ò0ip»\u0000\u0092xLÅþÀ\u0080ê\u0002ÒpÄ#ñV\u0010; m\u000e#9ÁWÈv¡|\u009a«\u000f\u0018\r\u0015G\u000b\u0085ÀÄ\u000eS\u00adU\u0081ï5/Æ%\u000b\u0019\u009e²rã\u001e\u009f\u0088\u0081Çá\u00871\u0099û°ó\\jiM\u0094p\u008ch\u0006\tcñ#D+ø\u0000 õèfùy\u0005òª¡"
         .length();
      char var1 = 18;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 58;
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
                     case 0 -> 69;
                     case 1 -> 28;
                     case 2 -> 32;
                     case 3 -> 111;
                     case 4 -> 97;
                     case 5 -> 13;
                     default -> 118;
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
                     g = new String[11];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new llIIlllIIllIIIIllIlIlIllllIlIIIIllIIllllIlIlIlIIIlIlIIlIlIlIlIIIIllIIIlIlIlIllIIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new llIIlllIIllIIIIllIlIlIllllIlIIIIllIIllllIlIlIlIIIlIlIIlIlIlIlIIIIllIIIlIlIlIllIIlIIII();
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

                  var2 = "OréPÁ\u00057Üæ\u0085 ";
                  var4 = "OréPÁ\u00057Üæ\u0085 ".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 32;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String d(int var0, int var1) {
      int var2 = (var0 ^ 15944) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 239;
            case 1 -> 117;
            case 2 -> 70;
            case 3 -> 57;
            case 4 -> 3;
            case 5 -> 158;
            case 6 -> 201;
            case 7 -> 163;
            case 8 -> 243;
            case 9 -> 37;
            case 10 -> 219;
            case 11 -> 28;
            case 12 -> 77;
            case 13 -> 73;
            case 14 -> 126;
            case 15 -> 220;
            case 16 -> 40;
            case 17 -> 146;
            case 18 -> 165;
            case 19 -> 89;
            case 20 -> 208;
            case 21 -> 32;
            case 22 -> 241;
            case 23 -> 252;
            case 24 -> 81;
            case 25 -> 71;
            case 26 -> 172;
            case 27 -> 125;
            case 28 -> 138;
            case 29 -> 98;
            case 30 -> 78;
            case 31 -> 190;
            case 32 -> 170;
            case 33 -> 203;
            case 34 -> 186;
            case 35 -> 129;
            case 36 -> 216;
            case 37 -> 5;
            case 38 -> 41;
            case 39 -> 60;
            case 40 -> 248;
            case 41 -> 65;
            case 42 -> 247;
            case 43 -> 107;
            case 44 -> 132;
            case 45 -> 131;
            case 46 -> 154;
            case 47 -> 151;
            case 48 -> 173;
            case 49 -> 214;
            case 50 -> 145;
            case 51 -> 127;
            case 52 -> 83;
            case 53 -> 221;
            case 54 -> 156;
            case 55 -> 139;
            case 56 -> 0;
            case 57 -> 106;
            case 58 -> 119;
            case 59 -> 232;
            case 60 -> 14;
            case 61 -> 13;
            case 62 -> 15;
            case 63 -> 67;
            case 64 -> 105;
            case 65 -> 184;
            case 66 -> 236;
            case 67 -> 50;
            case 68 -> 176;
            case 69 -> 181;
            case 70 -> 101;
            case 71 -> 80;
            case 72 -> 215;
            case 73 -> 169;
            case 74 -> 35;
            case 75 -> 234;
            case 76 -> 253;
            case 77 -> 164;
            case 78 -> 29;
            case 79 -> 209;
            case 80 -> 197;
            case 81 -> 92;
            case 82 -> 251;
            case 83 -> 52;
            case 84 -> 68;
            case 85 -> 121;
            case 86 -> 26;
            case 87 -> 104;
            case 88 -> 199;
            case 89 -> 11;
            case 90 -> 2;
            case 91 -> 210;
            case 92 -> 8;
            case 93 -> 116;
            case 94 -> 118;
            case 95 -> 44;
            case 96 -> 171;
            case 97 -> 109;
            case 98 -> 228;
            case 99 -> 182;
            case 100 -> 19;
            case 101 -> 56;
            case 102 -> 12;
            case 103 -> 49;
            case 104 -> 112;
            case 105 -> 33;
            case 106 -> 100;
            case 107 -> 205;
            case 108 -> 159;
            case 109 -> 91;
            case 110 -> 147;
            case 111 -> 161;
            case 112 -> 142;
            case 113 -> 223;
            case 114 -> 246;
            case 115 -> 141;
            case 116 -> 224;
            case 117 -> 17;
            case 118 -> 111;
            case 119 -> 157;
            case 120 -> 227;
            case 121 -> 72;
            case 122 -> 168;
            case 123 -> 85;
            case 124 -> 95;
            case 125 -> 30;
            case 126 -> 74;
            case 127 -> 204;
            case 128 -> 122;
            case 129 -> 94;
            case 130 -> 187;
            case 131 -> 196;
            case 132 -> 6;
            case 133 -> 97;
            case 134 -> 218;
            case 135 -> 123;
            case 136 -> 192;
            case 137 -> 46;
            case 138 -> 55;
            case 139 -> 102;
            case 140 -> 193;
            case 141 -> 155;
            case 142 -> 230;
            case 143 -> 43;
            case 144 -> 237;
            case 145 -> 226;
            case 146 -> 24;
            case 147 -> 198;
            case 148 -> 4;
            case 149 -> 115;
            case 150 -> 7;
            case 151 -> 99;
            case 152 -> 194;
            case 153 -> 238;
            case 154 -> 191;
            case 155 -> 200;
            case 156 -> 225;
            case 157 -> 20;
            case 158 -> 53;
            case 159 -> 178;
            case 160 -> 207;
            case 161 -> 167;
            case 162 -> 18;
            case 163 -> 206;
            case 164 -> 54;
            case 165 -> 245;
            case 166 -> 160;
            case 167 -> 27;
            case 168 -> 96;
            case 169 -> 90;
            case 170 -> 175;
            case 171 -> 254;
            case 172 -> 135;
            case 173 -> 9;
            case 174 -> 140;
            case 175 -> 255;
            case 176 -> 189;
            case 177 -> 240;
            case 178 -> 174;
            case 179 -> 183;
            case 180 -> 162;
            case 181 -> 1;
            case 182 -> 38;
            case 183 -> 136;
            case 184 -> 124;
            case 185 -> 134;
            case 186 -> 84;
            case 187 -> 69;
            case 188 -> 22;
            case 189 -> 133;
            case 190 -> 45;
            case 191 -> 144;
            case 192 -> 61;
            case 193 -> 36;
            case 194 -> 249;
            case 195 -> 25;
            case 196 -> 31;
            case 197 -> 62;
            case 198 -> 233;
            case 199 -> 10;
            case 200 -> 222;
            case 201 -> 166;
            case 202 -> 250;
            case 203 -> 64;
            case 204 -> 150;
            case 205 -> 217;
            case 206 -> 48;
            case 207 -> 21;
            case 208 -> 42;
            case 209 -> 235;
            case 210 -> 195;
            case 211 -> 242;
            case 212 -> 213;
            case 213 -> 87;
            case 214 -> 130;
            case 215 -> 137;
            case 216 -> 108;
            case 217 -> 66;
            case 218 -> 128;
            case 219 -> 148;
            case 220 -> 202;
            case 221 -> 34;
            case 222 -> 58;
            case 223 -> 86;
            case 224 -> 39;
            case 225 -> 180;
            case 226 -> 149;
            case 227 -> 120;
            case 228 -> 113;
            case 229 -> 51;
            case 230 -> 93;
            case 231 -> 75;
            case 232 -> 177;
            case 233 -> 16;
            case 234 -> 188;
            case 235 -> 63;
            case 236 -> 23;
            case 237 -> 114;
            case 238 -> 212;
            case 239 -> 143;
            case 240 -> 110;
            case 241 -> 76;
            case 242 -> 179;
            case 243 -> 244;
            case 244 -> 231;
            case 245 -> 229;
            case 246 -> 103;
            case 247 -> 79;
            case 248 -> 211;
            case 249 -> 185;
            case 250 -> 47;
            case 251 -> 152;
            case 252 -> 59;
            case 253 -> 82;
            case 254 -> 88;
            default -> 153;
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
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final llIIlllIIllIIIIllIlIlIllllIlIIIIllIIllllIlIlIlIIIlIlIIlIlIlIlIIIIllIIIlIlIlIllIIlIIII a() {
         return llIIlllIIllIIIIllIlIlIllllIlIIIIllIIllllIlIlIlIIIlIlIIlIlIlIlIIIIllIIIlIlIlIllIIlIIII.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
      }
   }

  // PX-FIX synth restored from jar bytecode
  public static final me.octo.client.llIIlllIIllIIIIllIlIlIllllIlIIIIllIIllllIlIlIlIIIlIlIIlIlIlIlIIIIllIIIlIlIlIllIIlIIII aH() { return IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl; }
}
