package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class IllIllllIIlIIIllllllIIIlllllIIlllIlllIIlllIlIIllllIlllIllIIllIIIlllllIIllIlIlIIlllllI {
   public static int var10 = 0; // PX-FIX (retyped int) missing field v2
   
   @NotNull
   public static IllIllllIIlIIIllllllIIIlllllIIlllIlllIIlllIlIIllllIlllIllIIllIIIlllllIIllIlIlIIlllllI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static String[] a;
   private static String[] b;

   private IllIllllIIlIIIllllllIIIlllllIIlllIlllIIlllIlIIllllIlllIllIIllIIIlllllIIllIlIlIIlllllI() {
   }

   public final boolean a(float var1, float var2, int var3) {
      String var4 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
      if (var4 != null
         && me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .player
            != null) {
         LocalPlayer var5 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .player;
         if (var4 != null
            && me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .level
               != null) {
            ClientLevel var6 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .level;
            double var7 = var5.getX();
            double var9 = var5.getY();
            double var11 = var5.getZ();
            double var13 = var5.getDeltaMovement().x;
            double var15 = var5.getDeltaMovement().z;
            double var17 = Math.toRadians(var5.getYRot());
            double var19 = Math.sin(var17);
            double var21 = Math.cos(var17);
            double var23 = 0.0196;
            double var25 = var5.getBbWidth() / 2.0;
            float var27 = var5.getBbHeight();
            int var28 = 0;

            int var43;
            while (true) {
               if (var28 < var3) {
                  double var29 = var1;
                  double var31 = var2;
                  double var33 = var29 * var29 + var31 * var31;
                  double var10000 = var33;
                  double var10001 = 1.0E-4;
                  if (var4 != null) {
                     double var49;
                     var43 = (var49 = var33 - 1.0E-4) == 0.0 ? 0 : (var49 < 0.0 ? -1 : 1);
                     if (var4 == null) {
                        break;
                     }

                     if (var43 >= 0) {
                        double var35 = Math.sqrt(var33);
                        double var44 = var35;
                        var10001 = 1.0;
                        if (var4 != null) {
                           if (var35 < 1.0) {
                              var35 = 1.0;
                           }

                           var44 = var23;
                           var10001 = var35;
                        }

                        double var37 = var44 / var10001;
                        var29 *= var37;
                        var31 *= var37;
                        var13 += var31 * var21 - var29 * var19;
                        var15 += var29 * var21 + var31 * var19;
                     }

                     var7 += var13;
                     var11 += var15;
                     var13 *= 0.546;
                     var10000 = var15;
                     var10001 = 0.546;
                  }

                  var15 = var10000 * var10001;
                  AABB var42 = new AABB(var7 - var25, var9, var11 - var25, var7 + var25, var9 + var27, var11 + var25);
                  int var45 = ((var6.noCollision(var5, var42)) ? 1 : 0);
                  if (var4 == null) {
                     return (var45 != 0);
                  }

                  if ((var45 == 0)) {
                     return false;
                  }

                  double var36 = var9 - 0.5;
                  AABB var38 = new AABB(var7 - var25, var36, var11 - var25, var7 + var25, var36 + 0.1, var11 + var25);
                  var45 = ((var6.noCollision(var5, var38)) ? 1 : 0);
                  if (var4 != null) {
                     var45 = (((var45 == 0) ? 1 : 0));
                  }

                  boolean var39 =( var45 != 0);
                  if (var4 != null) {
                     if (!var39) {
                        double var50;
                        var45 = (var50 = var9 - var5.getY() - -1.0) == 0.0 ? 0 : (var50 < 0.0 ? -1 : 1);
                        if (var4 == null) {
                           return (var45 != 0);
                        }

                        if (var45 < 0) {
                           return (0 != 0);
                        }
                     }

                     var28++;
                  }

                  if (var4 != null) {
                     continue;
                  }
               }

               var43 = 1;
               break;
            }

            return (var43 != 0);
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public final boolean a(@NotNull Vec3 var1) { BlockState var10 = null; // PX-FIX hoist
        
      String var10000 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
      short var10002 = 755;
      short var10003 = 5586;
      Intrinsics.checkNotNullParameter(var1, "pos");
      String var2 = var10000;
      if (var2 != null
         && me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .player
            != null) {
         LocalPlayer var3 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .player;
         if (var2 != null
            && me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .level
               != null) {
            ClientLevel var4 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .level;
            double var5 = var3.getBbWidth() / 2.0;
            float var7 = var3.getBbHeight();
            AABB var8 = new AABB(var1.x - var5, var1.y, var1.z - var5, var1.x + var5, var1.y + var7, var1.z + var5);
            boolean var11 = var4.noCollision(var3, var8);
            if (var2 != null) {
               if (var11) {
                  BlockPos var12 = BlockPos.containing(var1.x, var1.y - 1, var1.z);
                  var10002 = 754;
                  var10003 = -28766;
                  Intrinsics.checkNotNullExpressionValue(var12, "containing(...)");
                  BlockPos var9 = var12;
                  BlockState var13 = var4.getBlockState(var9);
                  var10002 = 759;
                  var10003 = 14865;
                  Intrinsics.checkNotNullExpressionValue(var13, "getBlockState(...)");
                   var10 = var13;
                  boolean var14 = var10.isAir();
                  if (var2 != null) {
                     var14 = !var14;
                  }

                  return var14;
               }

               var11 = false;
            }

            return var11;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public final boolean a(@NotNull Vec3 var1, int var2) {
       boolean var10 = false; // PX-FIX decl var10
      String var10000 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
      short var10002 = 755;
      short var10003 = 5586;
      Intrinsics.checkNotNullParameter(var1, "pos");
      String var3 = var10000;
      if (var3 != null
         && me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .level
            != null) {
         ClientLevel var4 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .level;
         int var5 = 0;

         while (true) {
            if (var5 < var2) {
               BlockPos var8 = BlockPos.containing(var1.x, var1.y - var5, var1.z);
               var10002 = 754;
               var10003 = -28766;
               Intrinsics.checkNotNullExpressionValue(var8, "containing(...)");
               BlockPos var6 = var8;
               BlockState var9 = var4.getBlockState(var6);
               var10002 = 759;
               var10003 = 14865;
               Intrinsics.checkNotNullExpressionValue(var9, "getBlockState(...)");
               BlockState var7 = var9;
               if (var3 != null) {
                  var10 = var7.isAir();
                  if (var3 == null) {
                     break;
                  }

                  if (!var10) {
                     return true;
                  }

                  var5++;
               }

               if (var3 != null) {
                  continue;
               }
            }

            var10 = false;
            break;
         }

         return var10;
      } else {
         return false;
      }
   }

   public final int b(@NotNull Vec3 var1, int var2) {
      String var10000 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
      short var10002 = 757;
      short var10003 = 10328;
      Intrinsics.checkNotNullParameter(var1, "pos");
      String var3 = var10000;
      if (var3 != null
         && me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .level
            != null) {
         ClientLevel var4 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .level;
         int var5 = 0;

         while (true) {
            if (var5 < var2) {
               BlockPos var8 = BlockPos.containing(var1.x, var1.y - var5, var1.z);
               var10002 = 758;
               var10003 = -27825;
               Intrinsics.checkNotNullExpressionValue(var8, "containing(...)");
               BlockPos var6 = var8;
               BlockState var9 = var4.getBlockState(var6);
               var10002 = 756;
               var10003 = 25285;
               Intrinsics.checkNotNullExpressionValue(var9, "getBlockState(...)");
               BlockState var7 = var9;
               if (var3 != null) {
                  var10 = (int)(var7.isAir() ? 1 : 0);
                  if (var3 == null) {
                     break;
                  }

                  if (var10 == 0) {
                     return var5;
                  }

                  var5++;
               }

               if (var3 != null) {
                  continue;
               }
            }

            var10 = -1;
            break;
         }

         return var10;
      } else {
         return -1;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "|\u009e´9)\u001c®åó\nGæ\u009e\u0007»\u0099v\u0090\u000fä\u001b9ôÌS³ÈÁþÒS\u0007¦\u00ad\u00036Î\u000f\u0012\u0086\u0014ëhÂ6Ó \\¢²ó ¥lÍ\u008c\u001a";
      int var4 = "|\u009e´9)\u001c®åó\nGæ\u009e\u0007»\u0099v\u0090\u000fä\u001b9ôÌS³ÈÁþÒS\u0007¦\u00ad\u00036Î\u000f\u0012\u0086\u0014ëhÂ6Ó \\¢²ó ¥lÍ\u008c\u001a"
         .length();
      char var1 = 18;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 71;
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
                     case 0 -> 43;
                     case 1 -> 28;
                     case 2 -> 14;
                     case 3 -> 77;
                     case 4 -> 71;
                     case 5 -> 88;
                     default -> 78;
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
                     b = new String[6];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllIllllIIlIIIllllllIIIlllllIIlllIlllIIlllIlIIllllIlllIllIIllIIIlllllIIllIlIlIIlllllI();
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

                  var2 = "ý\u0092b\u000f½ù\u0006¼?NÙ\u007f\u0098\u001cí\u001bô»Ç";
                  var4 = "ý\u0092b\u000f½ù\u0006¼?NÙ\u007f\u0098\u001cí\u001bô»Ç".length();
                  var1 = 3;
                  var8 = -1;
            }

            var10000 = 60;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 759) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 15;
            case 1 -> 55;
            case 2 -> 221;
            case 3 -> 234;
            case 4 -> 113;
            case 5 -> 91;
            case 6 -> 34;
            case 7 -> 103;
            case 8 -> 99;
            case 9 -> 130;
            case 10 -> 210;
            case 11 -> 213;
            case 12 -> 20;
            case 13 -> 89;
            case 14 -> 26;
            case 15 -> 182;
            case 16 -> 154;
            case 17 -> 101;
            case 18 -> 49;
            case 19 -> 135;
            case 20 -> 92;
            case 21 -> 188;
            case 22 -> 28;
            case 23 -> 175;
            case 24 -> 142;
            case 25 -> 137;
            case 26 -> 93;
            case 27 -> 158;
            case 28 -> 19;
            case 29 -> 179;
            case 30 -> 163;
            case 31 -> 71;
            case 32 -> 151;
            case 33 -> 200;
            case 34 -> 38;
            case 35 -> 29;
            case 36 -> 17;
            case 37 -> 230;
            case 38 -> 115;
            case 39 -> 39;
            case 40 -> 152;
            case 41 -> 250;
            case 42 -> 75;
            case 43 -> 53;
            case 44 -> 87;
            case 45 -> 32;
            case 46 -> 233;
            case 47 -> 206;
            case 48 -> 208;
            case 49 -> 70;
            case 50 -> 191;
            case 51 -> 110;
            case 52 -> 27;
            case 53 -> 140;
            case 54 -> 102;
            case 55 -> 202;
            case 56 -> 59;
            case 57 -> 238;
            case 58 -> 147;
            case 59 -> 112;
            case 60 -> 155;
            case 61 -> 95;
            case 62 -> 114;
            case 63 -> 159;
            case 64 -> 109;
            case 65 -> 69;
            case 66 -> 23;
            case 67 -> 10;
            case 68 -> 170;
            case 69 -> 209;
            case 70 -> 211;
            case 71 -> 128;
            case 72 -> 125;
            case 73 -> 251;
            case 74 -> 252;
            case 75 -> 22;
            case 76 -> 141;
            case 77 -> 162;
            case 78 -> 149;
            case 79 -> 90;
            case 80 -> 192;
            case 81 -> 180;
            case 82 -> 97;
            case 83 -> 255;
            case 84 -> 144;
            case 85 -> 244;
            case 86 -> 236;
            case 87 -> 43;
            case 88 -> 131;
            case 89 -> 76;
            case 90 -> 46;
            case 91 -> 68;
            case 92 -> 242;
            case 93 -> 88;
            case 94 -> 126;
            case 95 -> 248;
            case 96 -> 227;
            case 97 -> 196;
            case 98 -> 253;
            case 99 -> 3;
            case 100 -> 0;
            case 101 -> 167;
            case 102 -> 73;
            case 103 -> 96;
            case 104 -> 223;
            case 105 -> 245;
            case 106 -> 74;
            case 107 -> 228;
            case 108 -> 35;
            case 109 -> 212;
            case 110 -> 190;
            case 111 -> 66;
            case 112 -> 169;
            case 113 -> 199;
            case 114 -> 51;
            case 115 -> 232;
            case 116 -> 185;
            case 117 -> 47;
            case 118 -> 148;
            case 119 -> 14;
            case 120 -> 243;
            case 121 -> 241;
            case 122 -> 153;
            case 123 -> 164;
            case 124 -> 165;
            case 125 -> 83;
            case 126 -> 216;
            case 127 -> 145;
            case 128 -> 64;
            case 129 -> 117;
            case 130 -> 44;
            case 131 -> 136;
            case 132 -> 31;
            case 133 -> 119;
            case 134 -> 124;
            case 135 -> 229;
            case 136 -> 100;
            case 137 -> 127;
            case 138 -> 198;
            case 139 -> 13;
            case 140 -> 16;
            case 141 -> 201;
            case 142 -> 81;
            case 143 -> 65;
            case 144 -> 197;
            case 145 -> 225;
            case 146 -> 63;
            case 147 -> 116;
            case 148 -> 195;
            case 149 -> 108;
            case 150 -> 172;
            case 151 -> 215;
            case 152 -> 123;
            case 153 -> 106;
            case 154 -> 105;
            case 155 -> 160;
            case 156 -> 219;
            case 157 -> 36;
            case 158 -> 150;
            case 159 -> 138;
            case 160 -> 205;
            case 161 -> 40;
            case 162 -> 184;
            case 163 -> 246;
            case 164 -> 183;
            case 165 -> 218;
            case 166 -> 54;
            case 167 -> 85;
            case 168 -> 224;
            case 169 -> 45;
            case 170 -> 217;
            case 171 -> 50;
            case 172 -> 79;
            case 173 -> 178;
            case 174 -> 111;
            case 175 -> 30;
            case 176 -> 18;
            case 177 -> 9;
            case 178 -> 72;
            case 179 -> 176;
            case 180 -> 220;
            case 181 -> 235;
            case 182 -> 240;
            case 183 -> 231;
            case 184 -> 77;
            case 185 -> 4;
            case 186 -> 207;
            case 187 -> 134;
            case 188 -> 254;
            case 189 -> 139;
            case 190 -> 194;
            case 191 -> 7;
            case 192 -> 42;
            case 193 -> 37;
            case 194 -> 98;
            case 195 -> 214;
            case 196 -> 129;
            case 197 -> 104;
            case 198 -> 168;
            case 199 -> 120;
            case 200 -> 86;
            case 201 -> 107;
            case 202 -> 121;
            case 203 -> 166;
            case 204 -> 94;
            case 205 -> 247;
            case 206 -> 156;
            case 207 -> 67;
            case 208 -> 118;
            case 209 -> 61;
            case 210 -> 146;
            case 211 -> 1;
            case 212 -> 80;
            case 213 -> 161;
            case 214 -> 187;
            case 215 -> 122;
            case 216 -> 226;
            case 217 -> 5;
            case 218 -> 62;
            case 219 -> 12;
            case 220 -> 6;
            case 221 -> 171;
            case 222 -> 58;
            case 223 -> 24;
            case 224 -> 41;
            case 225 -> 186;
            case 226 -> 84;
            case 227 -> 33;
            case 228 -> 177;
            case 229 -> 25;
            case 230 -> 174;
            case 231 -> 193;
            case 232 -> 189;
            case 233 -> 8;
            case 234 -> 56;
            case 235 -> 48;
            case 236 -> 11;
            case 237 -> 157;
            case 238 -> 82;
            case 239 -> 203;
            case 240 -> 237;
            case 241 -> 57;
            case 242 -> 21;
            case 243 -> 249;
            case 244 -> 60;
            case 245 -> 133;
            case 246 -> 204;
            case 247 -> 239;
            case 248 -> 173;
            case 249 -> 78;
            case 250 -> 2;
            case 251 -> 52;
            case 252 -> 222;
            case 253 -> 181;
            case 254 -> 132;
            default -> 143;
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
   public static boolean a(IllIllllIIlIIIllllllIIIlllllIIlllIlllIIlllIlIIllllIlllIllIIllIIIlllllIIllIlIlIIlllllI var0, float var1, float var2, int var3, int var4, Object var5) {
      if ((var4 & 4) != 0) {
         var3 = 10;
      }

      return var0.a(var1, var2, var3);
   }

   public static boolean a(IllIllllIIlIIIllllllIIIlllllIIlllIlllIIlllIlIIllllIlllIllIIllIIIlllllIIllIlIlIIlllllI var0, Vec3 var1, int var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = 5;
      }

      return var0.a(var1, var2);
   }

   public static int b(IllIllllIIlIIIllllllIIIlllllIIlllIlllIIlllIlIIllllIlllIllIIllIIIlllllIIllIlIlIIlllllI var0, Vec3 var1, int var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = 10;
      }

      return var0.b(var1, var2);
   }

}
