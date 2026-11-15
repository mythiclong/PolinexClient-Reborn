package me.octo.client;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.AABB;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIIlIlIIIIIllIIllllIIllIIIlllIlIIIlIIlIIIlIllllIlIIlIIIIIlIIlllllIIIIlIllIllIllIlIlll
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static IIIlIlIIIIIllIIllllIIllIIIlllIlIIIlIIlIIIlIllllIlIIlIIIIIlIIlllllIIIIlIllIllIllIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private final List<BlockPos> lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @Nullable
   private BlockPos lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @JvmField
   @NotNull
   public static IIIlIlIIIIIllIIllllIIllIIIlllIlIIIlIIlIIIlIllllIlIIlIIIIIlIIlllllIIIIlIllIllIllIlIlll IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static String[] f;
   private static String[] g;

   private IIIlIlIIIIIllIIllllIIllIIIlllIlIIIlIIlIIIlIllllIlIIlIIIIIlIIlllllIIIIlIllIllIllIlIlll() {
      short var10001 = 24188;
      short var10002 = -7834;
      var10002 = 24184;
      short var10003 = 15836;
      short var10004 = 24185;
      short var10005 = 25320;
      super(
         "Monolith ESP",
         "Renders an ESP on monolith.",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
         "ESP"
      );
      BlockPos[] var1 = new BlockPos[]{
         new BlockPos(-15, 236, -92),
         new BlockPos(49, 202, -162),
         new BlockPos(56, 214, -25),
         new BlockPos(0, 170, 0),
         new BlockPos(150, 196, 190),
         new BlockPos(-64, 206, -63),
         new BlockPos(-93, 221, -53),
         new BlockPos(-94, 201, -30),
         new BlockPos(-9, 162, 109),
         new BlockPos(1, 183, 23),
         new BlockPos(61, 204, 181),
         new BlockPos(77, 160, 162),
         new BlockPos(92, 187, 131),
         new BlockPos(128, 187, 58)
      };
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = CollectionsKt.listOf(var1);
   }

   @SubscribeEvent(
      priority = EventPriority.HIGH
   )
   public final void a(@NotNull me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var1) {
      int[] var10000 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      short var10002 = 24189;
      short var10003 = 30696;
      Intrinsics.checkNotNullParameter(var1, "event");
      int[] var2 = var10000;
      if (var2 != null) {
         ClientLevel var13 = this.ap().level;
         if (var13 != null) {
            ClientLevel var3;
            label112: {
               var3 = var13;
               IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var14 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .g();
               IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var10001 = IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
               if (var2 != null) {
                  if (var14
                     == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
                     )
                   {
                     break label112;
                  }

                  var14 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .g();
                  var10001 = IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
               }

               if (var14 != var10001) {
                  return;
               }
            }

            BlockPos var15 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
            if (var2 != null) {
               if (this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll == null) {
                  Iterator var4 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.iterator();

                  label103:
                  while (true) {
                     byte var16 = ((byte)((var4.hasNext()) ? 1 : 0));

                     label101:
                     while (var16 != 0) {
                        BlockPos var5 = (BlockPos)var4.next();
                        var16 = -3;

                        label99:
                        while (true) {
                           int var6 = var16;

                           while (true) {
                              int var17 = var6;

                              label94:
                              while (true) {
                                 if (var17 >= 4) {
                                    continue label103;
                                 }

                                 var16 = -1;
                                 if (var2 == null) {
                                    continue label99;
                                 }

                                 if (var2 == null) {
                                    continue label101;
                                 }

                                 int var7 = -1;

                                 while (true) {
                                    int var18 = var7;

                                    label89:
                                    while (true) {
                                       if (var18 >= 2) {
                                          break label94;
                                       }

                                       var17 = -3;
                                       if (var2 == null) {
                                          continue label94;
                                       }

                                       int var8 = -3;

                                       while (true) {
                                          if (var8 >= 4) {
                                             break label89;
                                          }

                                          BlockPos var19 = var5.offset(var6, var7, var8);
                                          var10002 = 24186;
                                          var10003 = -32161;
                                          Intrinsics.checkNotNullExpressionValue(var19, "offset(...)");
                                          BlockPos var9 = var19;
                                          if (var2 != null) {
                                             var18 = ((Intrinsics.areEqual(var3.getBlockState(var9).getBlock(), Blocks.DRAGON_EGG)) ? 1 : 0);
                                             if (var2 == null) {
                                                break;
                                             }

                                             if (var18 != 0) {
                                                short var20 = 24187;
                                                short var21 = 577;
                                                me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                                                   "Found Monolith!"
                                                );
                                                this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var9;
                                                if (var2 != null) {
                                                   break label89;
                                                }
                                             }

                                             var8++;
                                          }

                                          if (var2 == null) {
                                             break label89;
                                          }
                                       }
                                    }

                                    var7++;
                                    if (var2 == null) {
                                       break label94;
                                    }
                                 }
                              }

                              var6++;
                              if (var2 == null) {
                                 break label103;
                              }
                           }
                        }
                     }

                     return;
                  }
               }

               var15 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
               Intrinsics.checkNotNull(this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll);
            }

            BlockPos var10 = var15;
            if (var2 == null) {
               return;
            }

            if (!Intrinsics.areEqual(var3.getBlockState(var10).getBlock(), Blocks.DRAGON_EGG)) {
               this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = null;
               return;
            }

            AABB var11 = new AABB(var10.getX() - 1.0, var10.getY() - 1.0, var10.getZ() - 1.0, var10.getX() + 2.0, var10.getY() + 2.0, var10.getZ() + 2.0);
            int var12 = me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll
               .o();
            IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a(
               var11,
               null,
               new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(var12),
               4.0F,
               null,
               new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(var12),
               0.0F,
               false,
               0.0F);
            IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a(
               var10,
               null,
               null,
               0.0F,
               new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(
                  me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll
                     .a(0.7F)
                     .o()
               ),
               null,
               0.0F,
               false,
               0.0F);
            return;
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "\nÒ7\u001b\u009d\u008b\u000eWo\u0000\u008eû\u0083þ\u0096QÕNDÒ\ts\u0087U\u0087 \u00114<Â#\u000f\u0082(`bÛ¿\u0007[DMÌ*|°³\u000b=Y\u0088y¶6îõð°W";
      int var4 = "\nÒ7\u001b\u009d\u008b\u000eWo\u0000\u008eû\u0083þ\u0096QÕNDÒ\ts\u0087U\u0087 \u00114<Â#\u000f\u0082(`bÛ¿\u0007[DMÌ*|°³\u000b=Y\u0088y¶6îõð°W"
         .length();
      char var1 = 3;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 84;
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
                     case 1 -> 81;
                     case 2 -> 55;
                     case 3 -> 127;
                     case 4 -> 80;
                     case 5 -> 65;
                     default -> 13;
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
                     g = new String[6];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IIIlIlIIIIIllIIllllIIllIIIlllIlIIIlIIlIIIlIllllIlIIlIIIIIlIIlllllIIIIlIllIllIllIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (Object) null
                     );
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new IIIlIlIIIIIllIIllllIIllIIIlllIlIIIlIIlIIIlIllllIlIIlIIIIIlIIlllllIIIIlIllIllIllIlIlll();
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

                  var2 = "\u0099[\u0080â\u0011\f¹^¢y'`|\u0013¯]Ýª";
                  var4 = "\u0099[\u0080â\u0011\f¹^¢y'`|\u0013¯]Ýª".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 66;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 24185) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 42;
            case 1 -> 161;
            case 2 -> 200;
            case 3 -> 55;
            case 4 -> 108;
            case 5 -> 162;
            case 6 -> 37;
            case 7 -> 194;
            case 8 -> 195;
            case 9 -> 178;
            case 10 -> 15;
            case 11 -> 135;
            case 12 -> 235;
            case 13 -> 96;
            case 14 -> 171;
            case 15 -> 27;
            case 16 -> 76;
            case 17 -> 28;
            case 18 -> 22;
            case 19 -> 180;
            case 20 -> 39;
            case 21 -> 190;
            case 22 -> 224;
            case 23 -> 109;
            case 24 -> 118;
            case 25 -> 81;
            case 26 -> 63;
            case 27 -> 58;
            case 28 -> 173;
            case 29 -> 186;
            case 30 -> 225;
            case 31 -> 52;
            case 32 -> 128;
            case 33 -> 243;
            case 34 -> 196;
            case 35 -> 59;
            case 36 -> 75;
            case 37 -> 61;
            case 38 -> 8;
            case 39 -> 166;
            case 40 -> 7;
            case 41 -> 204;
            case 42 -> 230;
            case 43 -> 62;
            case 44 -> 68;
            case 45 -> 100;
            case 46 -> 65;
            case 47 -> 129;
            case 48 -> 29;
            case 49 -> 198;
            case 50 -> 174;
            case 51 -> 210;
            case 52 -> 211;
            case 53 -> 43;
            case 54 -> 177;
            case 55 -> 182;
            case 56 -> 208;
            case 57 -> 165;
            case 58 -> 35;
            case 59 -> 3;
            case 60 -> 25;
            case 61 -> 120;
            case 62 -> 156;
            case 63 -> 239;
            case 64 -> 184;
            case 65 -> 148;
            case 66 -> 133;
            case 67 -> 36;
            case 68 -> 101;
            case 69 -> 10;
            case 70 -> 236;
            case 71 -> 214;
            case 72 -> 139;
            case 73 -> 142;
            case 74 -> 176;
            case 75 -> 150;
            case 76 -> 219;
            case 77 -> 5;
            case 78 -> 46;
            case 79 -> 222;
            case 80 -> 84;
            case 81 -> 231;
            case 82 -> 226;
            case 83 -> 103;
            case 84 -> 79;
            case 85 -> 215;
            case 86 -> 252;
            case 87 -> 205;
            case 88 -> 53;
            case 89 -> 44;
            case 90 -> 86;
            case 91 -> 217;
            case 92 -> 234;
            case 93 -> 152;
            case 94 -> 125;
            case 95 -> 233;
            case 96 -> 66;
            case 97 -> 117;
            case 98 -> 24;
            case 99 -> 74;
            case 100 -> 77;
            case 101 -> 87;
            case 102 -> 60;
            case 103 -> 98;
            case 104 -> 106;
            case 105 -> 6;
            case 106 -> 168;
            case 107 -> 107;
            case 108 -> 19;
            case 109 -> 26;
            case 110 -> 34;
            case 111 -> 126;
            case 112 -> 99;
            case 113 -> 50;
            case 114 -> 170;
            case 115 -> 32;
            case 116 -> 85;
            case 117 -> 105;
            case 118 -> 12;
            case 119 -> 112;
            case 120 -> 72;
            case 121 -> 193;
            case 122 -> 94;
            case 123 -> 134;
            case 124 -> 69;
            case 125 -> 14;
            case 126 -> 149;
            case 127 -> 54;
            case 128 -> 45;
            case 129 -> 254;
            case 130 -> 141;
            case 131 -> 246;
            case 132 -> 114;
            case 133 -> 110;
            case 134 -> 241;
            case 135 -> 113;
            case 136 -> 2;
            case 137 -> 21;
            case 138 -> 245;
            case 139 -> 95;
            case 140 -> 56;
            case 141 -> 20;
            case 142 -> 17;
            case 143 -> 49;
            case 144 -> 124;
            case 145 -> 242;
            case 146 -> 132;
            case 147 -> 229;
            case 148 -> 127;
            case 149 -> 218;
            case 150 -> 119;
            case 151 -> 159;
            case 152 -> 73;
            case 153 -> 136;
            case 154 -> 232;
            case 155 -> 138;
            case 156 -> 189;
            case 157 -> 104;
            case 158 -> 41;
            case 159 -> 40;
            case 160 -> 158;
            case 161 -> 67;
            case 162 -> 146;
            case 163 -> 111;
            case 164 -> 220;
            case 165 -> 89;
            case 166 -> 255;
            case 167 -> 1;
            case 168 -> 102;
            case 169 -> 9;
            case 170 -> 140;
            case 171 -> 221;
            case 172 -> 202;
            case 173 -> 143;
            case 174 -> 185;
            case 175 -> 207;
            case 176 -> 47;
            case 177 -> 183;
            case 178 -> 216;
            case 179 -> 30;
            case 180 -> 23;
            case 181 -> 0;
            case 182 -> 121;
            case 183 -> 203;
            case 184 -> 247;
            case 185 -> 90;
            case 186 -> 33;
            case 187 -> 91;
            case 188 -> 187;
            case 189 -> 169;
            case 190 -> 199;
            case 191 -> 227;
            case 192 -> 179;
            case 193 -> 228;
            case 194 -> 48;
            case 195 -> 238;
            case 196 -> 51;
            case 197 -> 153;
            case 198 -> 175;
            case 199 -> 192;
            case 200 -> 18;
            case 201 -> 16;
            case 202 -> 57;
            case 203 -> 212;
            case 204 -> 71;
            case 205 -> 13;
            case 206 -> 131;
            case 207 -> 172;
            case 208 -> 197;
            case 209 -> 38;
            case 210 -> 70;
            case 211 -> 130;
            case 212 -> 160;
            case 213 -> 155;
            case 214 -> 31;
            case 215 -> 80;
            case 216 -> 82;
            case 217 -> 92;
            case 218 -> 11;
            case 219 -> 223;
            case 220 -> 240;
            case 221 -> 181;
            case 222 -> 164;
            case 223 -> 137;
            case 224 -> 116;
            case 225 -> 123;
            case 226 -> 122;
            case 227 -> 201;
            case 228 -> 151;
            case 229 -> 157;
            case 230 -> 145;
            case 231 -> 237;
            case 232 -> 253;
            case 233 -> 167;
            case 234 -> 191;
            case 235 -> 163;
            case 236 -> 249;
            case 237 -> 209;
            case 238 -> 147;
            case 239 -> 83;
            case 240 -> 144;
            case 241 -> 206;
            case 242 -> 115;
            case 243 -> 78;
            case 244 -> 88;
            case 245 -> 244;
            case 246 -> 213;
            case 247 -> 250;
            case 248 -> 251;
            case 249 -> 64;
            case 250 -> 154;
            case 251 -> 4;
            case 252 -> 248;
            case 253 -> 93;
            case 254 -> 97;
            default -> 188;
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
        // PX-FIX DCM: kotlin-synthesized <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
           this();
        }


      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }
}
