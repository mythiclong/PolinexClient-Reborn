package me.octo.client.utils.player.pathfinder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.utils.lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII;
import me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll
   extends lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {

   @NotNull
   public static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] c;
   private static String[] d;

   private IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
   }

   @NotNull
   public final ArrayList<String> a(@NotNull List<? extends Vec3> var1, int var2) {
      Object var33 = null; // PX-FIX
      short var10001 = -25419;
      short var10002 = 17158;
      Intrinsics.checkNotNullParameter(var1, "path");
      Vec3 var4 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
      int var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      Iterable var6 = CollectionsKt.take(var1, var2);
      boolean var7 = false;
      int var3 = var10000;
      var var9 = new ArrayList();
      boolean var10 = false;

      for (Object var12 : var6) {
         Vec3 var13 = (Vec3)var12;
         boolean var14 = false;
         boolean var30 = lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a(
            lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
            var4,
            var13,
            null,
            0,
            false,
            0.0,
            false,
            false,
            0.0,
            508,
            null);
         if (var3 == 0) {
            if (!var30) {
               continue;
            }

            var9.add(var12);
         }

         if (var3 != 0) {
            break;
         }
      }

      label140: {
         var var19 = var9;
         boolean var31 = var19.isEmpty();
         if (var3 == 0) {
            if (!var31) {
               var33 = var19;
               break label140;
            }

            var31 = false;
         }

         var33 = CollectionsKt.take(var1, var2 / 2);
      }

      List var5 = (List)var33;
      boolean[] var20 = new boolean[4];
      double var21 = Double.POSITIVE_INFINITY;
      List var22 = this.g();
      lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var23 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .o();

      label133:
      for (boolean[] var26 : (List<boolean[]>) (List<?>) var22) {
         float var27;
         label156: {
            var27 = var23.a();
            boolean var34 = var26[0];
            if (var3 == 0) {
               if (var34) {
                  var34 = var26[2];
                  if (var3 == 0) {
                     if (var34) {
                        var27 -= 45.0F;
                     }

                     var34 = var26[3];
                  }

                  if (!var34) {
                     break label156;
                  }

                  var27 += 45.0F;
                  if (var3 == 0) {
                     break label156;
                  }
               }

               var34 = var26[1];
            }

            if (var3 == 0) {
               if (var34) {
                  var27 -= 180.0F;
                  var34 = var26[2];
                  if (var3 == 0) {
                     if (var34) {
                        var27 += 45.0F;
                     }

                     var34 = var26[3];
                  }

                  if (!var34) {
                     break label156;
                  }

                  var27 -= 45.0F;
                  if (var3 == 0) {
                     break label156;
                  }
               }

               var34 = var26[2];
            }

            if (var3 == 0) {
               if (var34) {
                  var27 -= 90.0F;
                  if (var3 == 0) {
                     break label156;
                  }
               }

               var34 = var26[3];
            }

            if (var34) {
               var27 += 90.0F;
            }
         }

         double var28 = 0.0;
         Vec3 var37 = var4.add(
            me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .d(var27)
               .b()
               .scale(10.0)
         );
         var10002 = -25417;
         short var10003 = -4430;
         Intrinsics.checkNotNullExpressionValue(var37, "add(...)");
         Vec3 var16 = var37;

         for (Vec3 var18 : (List<Vec3>)var5) {
            var28 += lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a(var4, var16, var18, false, true);
            if (var3 != 0) {
               continue label133;
            }

            if (var3 != 0) {
               break;
            }
         }

         double var38 = var28;
         if (var3 == 0) {
            if (!(var28 < var21)) {
               continue;
            }

            var20 = var26;
            var38 = var28;
         }

         var21 = var38;
         if (var3 != 0) {
            break;
         }
      }

      ArrayList var25 = new ArrayList();
      boolean var29 = false;
      boolean var39 = var20[0];
      if (var3 == 0) {
         if (var39) {
            var10001 = -25414;
            var10002 = 7987;
            var25.add("forward");
         }

         var39 = var20[1];
      }

      if (var3 == 0) {
         if (var39) {
            var10001 = -25416;
            var10002 = 2899;
            var25.add("backward");
         }

         var39 = var20[2];
      }

      if (var3 == 0) {
         if (var39) {
            var10001 = -25411;
            var10002 = -1153;
            var25.add("left");
         }

         var39 = var20[3];
      }

      if (var3 == 0 && var39) {
         var10001 = -25412;
         var10002 = 23754;
         var25.add("right");
      }

      return var25;
   }

   @NotNull
   public final ArrayList<String> a(@NotNull Vec3 var1) {
      int var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      short var10002 = -25409;
      short var10003 = -25854;
      Intrinsics.checkNotNullParameter(var1, "target");
      int var2 = var10000;
      boolean[] var3 = new boolean[4];
      float var4 = Float.MAX_VALUE;
      List var5 = this.g();
      lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var6 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(var1);
      float var7 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .o()
         .a();

      for (boolean[] var9 : (List<boolean[]>) (List<?>) var5) {
         float var10;
         label114: {
            var10 = var7;
            boolean var14 = var9[0];
            if (var2 != 0) {
               if (var14) {
                  var14 = var9[2];
                  if (var2 != 0) {
                     if (var14) {
                        var10 = var7 - 45.0F;
                     }

                     var14 = var9[3];
                  }

                  if (!var14) {
                     break label114;
                  }

                  var10 += 45.0F;
                  if (var2 != 0) {
                     break label114;
                  }
               }

               var14 = var9[1];
            }

            if (var2 != 0) {
               if (var14) {
                  var10 -= 180.0F;
                  var14 = var9[2];
                  if (var2 != 0) {
                     if (var14) {
                        var10 += 45.0F;
                     }

                     var14 = var9[3];
                  }

                  if (!var14) {
                     break label114;
                  }

                  var10 -= 45.0F;
                  if (var2 != 0) {
                     break label114;
                  }
               }

               var14 = var9[2];
            }

            if (var2 != 0) {
               if (var14) {
                  var10 -= 90.0F;
                  if (var2 != 0) {
                     break label114;
                  }
               }

               var14 = var9[3];
            }

            if (var14) {
               var10 += 90.0F;
            }
         }

         float var11 = Math.abs(
            me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a(new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(var10, 0.0F), var6)
               .a()
         );
         float var17 = var11;
         if (var2 != 0) {
            if (!(var11 < var4)) {
               continue;
            }

            var3 = var9;
            var17 = var11;
         }

         var4 = var17;
         if (var2 == 0) {
            break;
         }
      }

      ArrayList var12 = new ArrayList();
      boolean var13 = false;
      boolean var18 = var3[0];
      if (var2 != 0) {
         if (var18) {
            short var10001 = -25415;
            var10002 = 30015;
            var12.add("forward");
         }

         var18 = var3[1];
      }

      if (var2 != 0) {
         if (var18) {
            short var19 = -25410;
            var10002 = -2976;
            var12.add("backward");
         }

         var18 = var3[2];
      }

      if (var2 != 0) {
         if (var18) {
            short var20 = -25413;
            var10002 = 12534;
            var12.add("left");
         }

         var18 = var3[3];
      }

      if (var2 != 0 && var18) {
         short var21 = -25418;
         var10002 = 3167;
         var12.add("right");
      }

      return var12;
   }

   private final List<boolean[]> g() {
      boolean[][] var1 = new boolean[8][];
      boolean[] var2 = new boolean[]{true, false, false, false};
      var1[0] = var2;
      var2 = new boolean[]{false, true, false, false};
      var1[1] = var2;
      var2 = new boolean[]{false, false, true, false};
      var1[2] = var2;
      var2 = new boolean[]{false, false, false, true};
      var1[3] = var2;
      var2 = new boolean[]{true, false, true, false};
      var1[4] = var2;
      var2 = new boolean[]{true, false, false, true};
      var1[5] = var2;
      var2 = new boolean[]{false, true, true, false};
      var1[6] = var2;
      var2 = new boolean[]{false, true, false, true};
      var1[7] = var2;
      return CollectionsKt.listOf(var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[11];
      int var3 = 0;
      String var2 = "×IÉÖ\u007fE\b\u0095bD¿ïðvM\u0004\u0083vL¦\u0005L¥iMÍ\u0004\u0084+¬\r\u0007\u0013F\u0001èb\u0096\u0005\u0007\u0004£ãT>\u0001\u008e\bµ\u009e@ o\u0003f3\b\u00923ÀsÁ\r\u009d\u0019";
      int var4 = "×IÉÖ\u007fE\b\u0095bD¿ïðvM\u0004\u0083vL¦\u0005L¥iMÍ\u0004\u0084+¬\r\u0007\u0013F\u0001èb\u0096\u0005\u0007\u0004£ãT>\u0001\u008e\bµ\u009e@ o\u0003f3\b\u00923ÀsÁ\r\u009d\u0019"
         .length();
      char var1 = 6;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 102;
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
                     case 0 -> 120;
                     case 1 -> 24;
                     case 2 -> 30;
                     case 3 -> 124;
                     case 4 -> 118;
                     case 5 -> 69;
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
                     c = var5;
                     d = new String[11];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll();
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

                  var2 = "ë}\u001c×â\u0004\u0006°ðg";
                  var4 = "ë}\u001c×â\u0004\u0006°ðg".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 67;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -25409) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 154;
            case 1 -> 148;
            case 2 -> 177;
            case 3 -> 244;
            case 4 -> 223;
            case 5 -> 73;
            case 6 -> 254;
            case 7 -> 211;
            case 8 -> 205;
            case 9 -> 80;
            case 10 -> 217;
            case 11 -> 255;
            case 12 -> 241;
            case 13 -> 200;
            case 14 -> 162;
            case 15 -> 10;
            case 16 -> 164;
            case 17 -> 84;
            case 18 -> 103;
            case 19 -> 49;
            case 20 -> 167;
            case 21 -> 212;
            case 22 -> 172;
            case 23 -> 90;
            case 24 -> 250;
            case 25 -> 153;
            case 26 -> 195;
            case 27 -> 130;
            case 28 -> 143;
            case 29 -> 198;
            case 30 -> 136;
            case 31 -> 50;
            case 32 -> 31;
            case 33 -> 6;
            case 34 -> 247;
            case 35 -> 53;
            case 36 -> 66;
            case 37 -> 207;
            case 38 -> 134;
            case 39 -> 105;
            case 40 -> 35;
            case 41 -> 67;
            case 42 -> 163;
            case 43 -> 51;
            case 44 -> 48;
            case 45 -> 107;
            case 46 -> 94;
            case 47 -> 174;
            case 48 -> 30;
            case 49 -> 196;
            case 50 -> 44;
            case 51 -> 184;
            case 52 -> 165;
            case 53 -> 65;
            case 54 -> 12;
            case 55 -> 188;
            case 56 -> 32;
            case 57 -> 125;
            case 58 -> 147;
            case 59 -> 216;
            case 60 -> 175;
            case 61 -> 185;
            case 62 -> 152;
            case 63 -> 104;
            case 64 -> 79;
            case 65 -> 75;
            case 66 -> 81;
            case 67 -> 168;
            case 68 -> 96;
            case 69 -> 139;
            case 70 -> 33;
            case 71 -> 232;
            case 72 -> 208;
            case 73 -> 76;
            case 74 -> 62;
            case 75 -> 159;
            case 76 -> 85;
            case 77 -> 74;
            case 78 -> 89;
            case 79 -> 140;
            case 80 -> 34;
            case 81 -> 135;
            case 82 -> 170;
            case 83 -> 239;
            case 84 -> 124;
            case 85 -> 253;
            case 86 -> 179;
            case 87 -> 91;
            case 88 -> 132;
            case 89 -> 111;
            case 90 -> 129;
            case 91 -> 87;
            case 92 -> 228;
            case 93 -> 238;
            case 94 -> 122;
            case 95 -> 127;
            case 96 -> 11;
            case 97 -> 230;
            case 98 -> 131;
            case 99 -> 22;
            case 100 -> 137;
            case 101 -> 16;
            case 102 -> 97;
            case 103 -> 150;
            case 104 -> 192;
            case 105 -> 18;
            case 106 -> 229;
            case 107 -> 83;
            case 108 -> 64;
            case 109 -> 54;
            case 110 -> 251;
            case 111 -> 23;
            case 112 -> 27;
            case 113 -> 156;
            case 114 -> 237;
            case 115 -> 220;
            case 116 -> 227;
            case 117 -> 193;
            case 118 -> 82;
            case 119 -> 219;
            case 120 -> 186;
            case 121 -> 55;
            case 122 -> 63;
            case 123 -> 113;
            case 124 -> 215;
            case 125 -> 9;
            case 126 -> 57;
            case 127 -> 106;
            case 128 -> 40;
            case 129 -> 201;
            case 130 -> 202;
            case 131 -> 71;
            case 132 -> 47;
            case 133 -> 224;
            case 134 -> 77;
            case 135 -> 158;
            case 136 -> 26;
            case 137 -> 20;
            case 138 -> 109;
            case 139 -> 119;
            case 140 -> 197;
            case 141 -> 204;
            case 142 -> 93;
            case 143 -> 72;
            case 144 -> 88;
            case 145 -> 13;
            case 146 -> 92;
            case 147 -> 252;
            case 148 -> 194;
            case 149 -> 101;
            case 150 -> 160;
            case 151 -> 187;
            case 152 -> 29;
            case 153 -> 41;
            case 154 -> 0;
            case 155 -> 169;
            case 156 -> 191;
            case 157 -> 142;
            case 158 -> 4;
            case 159 -> 218;
            case 160 -> 25;
            case 161 -> 118;
            case 162 -> 37;
            case 163 -> 235;
            case 164 -> 178;
            case 165 -> 121;
            case 166 -> 78;
            case 167 -> 95;
            case 168 -> 115;
            case 169 -> 98;
            case 170 -> 3;
            case 171 -> 138;
            case 172 -> 190;
            case 173 -> 7;
            case 174 -> 99;
            case 175 -> 146;
            case 176 -> 144;
            case 177 -> 171;
            case 178 -> 161;
            case 179 -> 68;
            case 180 -> 123;
            case 181 -> 166;
            case 182 -> 225;
            case 183 -> 86;
            case 184 -> 58;
            case 185 -> 181;
            case 186 -> 245;
            case 187 -> 183;
            case 188 -> 19;
            case 189 -> 56;
            case 190 -> 221;
            case 191 -> 157;
            case 192 -> 141;
            case 193 -> 112;
            case 194 -> 2;
            case 195 -> 209;
            case 196 -> 14;
            case 197 -> 128;
            case 198 -> 120;
            case 199 -> 176;
            case 200 -> 203;
            case 201 -> 69;
            case 202 -> 114;
            case 203 -> 42;
            case 204 -> 1;
            case 205 -> 155;
            case 206 -> 246;
            case 207 -> 43;
            case 208 -> 189;
            case 209 -> 46;
            case 210 -> 39;
            case 211 -> 15;
            case 212 -> 116;
            case 213 -> 206;
            case 214 -> 182;
            case 215 -> 59;
            case 216 -> 21;
            case 217 -> 102;
            case 218 -> 248;
            case 219 -> 28;
            case 220 -> 36;
            case 221 -> 226;
            case 222 -> 173;
            case 223 -> 222;
            case 224 -> 24;
            case 225 -> 126;
            case 226 -> 214;
            case 227 -> 213;
            case 228 -> 180;
            case 229 -> 249;
            case 230 -> 243;
            case 231 -> 240;
            case 232 -> 52;
            case 233 -> 110;
            case 234 -> 100;
            case 235 -> 231;
            case 236 -> 117;
            case 237 -> 151;
            case 238 -> 210;
            case 239 -> 5;
            case 240 -> 17;
            case 241 -> 199;
            case 242 -> 234;
            case 243 -> 61;
            case 244 -> 236;
            case 245 -> 233;
            case 246 -> 149;
            case 247 -> 145;
            case 248 -> 70;
            case 249 -> 60;
            case 250 -> 8;
            case 251 -> 108;
            case 252 -> 38;
            case 253 -> 45;
            case 254 -> 133;
            default -> 242;
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
