package me.octo.client;

import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.util.Mth;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llIIIIIIIllIllIIllIlIIlIlIIIlllllllllIIIlllIIIlIIlIlIllIlIllIlllllIllIIllllIlIIllIllI
   extends me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
    public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4) { return null; } // PX-FIX ovld2
   public static <T> T a(Object p0, Object p1, Object p2, Object p3) { return null; } // PX-FIX ovld

   @NotNull
   public static llIIIIIIIllIllIIllIlIIlIlIIIlllllllllIIIlllIIIlIIlIlIllIlIllIlllllIllIIllllIlIIllIllI IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static double IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static double lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static double IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static String[] c;
   private static String[] d;

   private llIIIIIIIllIllIIllIlIIlIlIIIlllllllllIIIlllIIIlIIlIlIllIlIllIlllllIllIIllllIlIIllIllI() {
   }

   private final Vec3 a(double var1, double var3) {
      double var5 = Math.toRadians(var1);
      double var7 = Math.toRadians(var3);
      double var9 = Math.cos(-var7);
      double var11 = Math.sin(-var7);
      double var13 = Math.cos(-var5 - Math.PI);
      double var15 = Math.sin(-var5 - Math.PI);
      return new Vec3(var15 * var9, var11, var13 * var9);
   }

   private final double a(Vec3 var1, double var2, double var4, double var6, int var8) {
      Object var46 = null; // PX-FIX
      Vec3 var10 = this.a(var2, var4);
      double var22 = 0.0;
      var22 = var10.x * 0.6;
      double var24 = 0.0;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllllIIIlIIllIllIIIllllIIIlllIllIlllllIIIlllIIIIlIIIIIlIIlIIlllIlllIllIllIIllIlIlII.f();
      var24 = var10.y * 0.6;
      double var26 = 0.0;
      var26 = var10.z * 0.6;
      double var28 = 0.0;
      var28 = var1.x;
      double var30 = 0.0;
      var30 = var1.y;
      double var32 = 0.0;
      var32 = var1.z;
      double var11 = var28;
      double var13 = var32;
      double var34 = 0.0;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var9 = var10000;
      int var15 = 0;

      double var10001;
      while (true) {
         if (var15 < var8) {
            boolean var17 = false;
            double var40 = var24 - 0.03;
            var22 *= 0.92;
            var24 = var40 * 0.92;
            var26 *= 0.92;
            var34 = var30;
            var28 += var22;
            var30 += var24;
            var32 += var26;
            if (var9 != null) {
               var46 = (var34 - var6) * (var30 - var6);
               var10001 = 0.0;
               if (var9 == null) {
                  break;
               }

               if ((((Boolean)var46) ? 1 : 0) <= 0.0) {
                  double var18 = var28 - var11;
                  double var20 = var32 - var13;
                  return Math.sqrt(var18 * var18 + var20 * var20);
               }

               var15++;
            }

            if (var9 != null) {
               continue;
            }
         }

         var46 = var28;
         var10001 = var11;
         break;
      }

      double var36 = ((Double)var46) - var10001;
      double var37 = var32 - var13;
      return Math.sqrt(var36 * var36 + var37 * var37);
   }

   public static lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI a(llIIIIIIIllIllIIllIlIIlIlIIIlllllllllIIIlllIIIlIIlIlIllIlIllIlllllIllIIllllIlIIllIllI var0, AABB var1, boolean var2, Vec3 var3, boolean var4, int var5, Object var6) {
      if ((var5 & 2) != 0) {
         var2 = true;
      }

      if ((var5 & 4) != 0) {
         var3 = null;
      }

      if ((var5 & 8) != 0) {
         var4 = false;
      }

      return var0.a(var1, var2, var3, var4);
   }

   public static double a(llIIIIIIIllIllIIllIlIIlIlIIIlllllllllIIIlllIIIlIIlIlIllIlIllIlllllIllIIllllIlIIllIllI var0, Vec3 var1, double var2, double var4, double var6, int var7, int var8, Object var9) {
      if ((var8 & 16) != 0) {
         var7 = 200;
      }

      return var0.a(var1, var2, var4, var6, var7);
   }

   public static Vec3 a(llIIIIIIIllIllIIllIlIIlIlIIIlllllllllIIIlllIIIlIIlIlIllIlIllIlllllIllIIllllIlIIllIllI var0, Vec3 var1, double var2, double var4, int var5, int var6, Object var7) {
      if ((var6 & 8) != 0) {
         var5 = 200;
      }

      return var0.a(var1, var2, var4, var5);
   }

   private final Vec3 a(Vec3 var1, double var2, double var4, int var6) {
      Vec3 var8 = this.a(var2, var4);
      double var12 = 0.0;
      var12 = var8.x * 0.6;
      double var14 = 0.0;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllllIIIlIIllIllIIIllllIIIlllIllIlllllIIIlllIIIIlIIIIIlIIlIIlllIlllIllIllIIllIlIlII.f();
      var14 = var8.y * 0.6;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var7 = var10000;
      double var16 = 0.0;
      var16 = var8.z * 0.6;
      double var18 = 0.0;
      var18 = var1.x;
      double var20 = 0.0;
      var20 = var1.y;
      double var22 = 0.0;
      var22 = var1.z;
      int var9 = 0;

      while (var9 < var6) {
         boolean var11 = false;
         double var26 = var14 - 0.03;
         var12 *= 0.92;
         var14 = var26 * 0.92;
         var16 *= 0.92;
         var18 += var12;
         var20 += var14;
         var22 += var16;
         var9++;
         if (var7 == null) {
            break;
         }
      }

      return new Vec3(var18, var20, var22);
   }

   @Nullable
   public final lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI a(
      @NotNull AABB var1, boolean var2, @Nullable Vec3 var3, boolean var4
   ) {
      Object var67 = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var5;
      Vec3 var6;
      List var7;
      short var54;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllllIIIlIIllIllIIIllllIIIlllIllIlllllIIIlllIIIIlIIIIIlIIlIIlllIlllIllIllIIllIlIlII.f();
      short var10002 = -15433;
      short var10003 = -25860;
      Intrinsics.checkNotNullParameter(var1, "box");
      var5 = var10000;
      var6 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.u();
      var7 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.a(
         me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         var1,
         null,
         null,
         0.0,
         0.0,
         0.0);
      var54 =((short)(( var2) ? 1 : 0));
      label104:
      if (var5 != null) {
         if (var2) {
            var54 = ((short)((var7.isEmpty()) ? 1 : 0));
            if (var5 == null) {
               break label104;
            }

            if ((var54 != 0)) {
               if (!var4) {
                  var54 = (short)-15437;
                  short var10001 = 13603;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
                     "no visible points on target box"
                  );
               }

               return null;
            }
         }

         var54 =((short)(( var2) ? 1 : 0));
      }

      Vec3 var56;
      if ((var54 != 0)) {
         var56 = (Vec3)CollectionsKt.random(var7, (Random)Random.Default);
      } else {
         var56 = var3;
         if (var3 == null) {
            return null;
         }
      }

      Vec3 var8 = var56;
      double var9 = var6.x;
      double var11 = var6.y;
      double var13 = var6.z;
      double var15 = var8.x;
      double var17 = var8.z;
      double var19 = var8.y;
      double var21 = var15 - var9;
      double var23 = var17 - var13;
      double var25 = var19 - var11;
      double var27 = Math.sqrt(var21 * var21 + var23 * var23);
      double var57 = var27;
      double var68 = 0.001;
      if (var5 != null) {
         if (var27 < 0.001) {
            double var65 = var25;
            if (var5 != null) {
               var65 = var25 > 0.0 ? 0.0 : 45.0;
            }

            double var48;
            label69: {
               var48 = var65;
               if (var5 != null) {
                  LocalPlayer var66 = this.a().player;
                  if (var66 != null) {
                     var67 = var66.getYRot();
                     break label69;
                  }
               }

               var67 = 0.0F;
            }

            float var50 =((Float)( var67));
            return new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(var50, (float)var48);
         }

         var57 = -var21;
         var68 = var23;
      }

      double var29 = Math.atan2(var57, var68);
      double var31 = var29 * (180.0 / Math.PI);
      var31 = Mth.wrapDegrees(var31);
      double var33 = Double.NaN;
      double var35 = Double.MAX_VALUE;
      double var37 = 5.0;
      double var39 = 85.0;
      double var41 = 0.25;

      while (true) {
         if (var37 <= var39) {
            double var43 = a(this, var6, var31, var37, var19);
            double var45 = Math.abs(var43 - var27);
            double var58 = var45;
            var68 = var35;
            if (var5 != null) {
               double var76;
               var54 = (short)((var76 = var45 - var35) == 0.0 ? 0 : (var76 < 0.0 ? -1 : 1));
               if (var5 == null) {
                  break;
               }

               if (var54 < 0) {
                  var35 = var45;
                  var33 = var37;
               }

               var58 = var37;
               var68 = var41;
            }

            var37 = var58 + var68;
            if (var5 != null) {
               continue;
            }

            me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
               new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[3]
            );
         }

         var54 = ((short)((Double.isNaN(var33)) ? 1 : 0));
         break;
      }

      label110: {
         if (var5 != null) {
            if (var54 == 0) {
               double var77;
               var54 = (short)((var77 = var35 - 1.0) == 0.0 ? 0 : (var77 < 0.0 ? -1 : 1));
               if (var5 == null) {
                  break label110;
               }

               if (var54 <= 0) {
                  var54 =((short)(( var4) ? 1 : 0));
                  break label110;
               }
            }

            var54 =((short)(( var4) ? 1 : 0));
         }

         if (var54 != 0) {
            short var61 = -15434;
            short var70 = 22210;
            String var51 = "no good pitch (minErr=%.3f, reqD=%.2f)";
            Object[] var44 = new Object[]{var35, var27};
            String var62 = String.format(var51, Arrays.copyOf(var44, var44.length));
            var10002 = -15438;
            var10003 = -2650;
            Intrinsics.checkNotNullExpressionValue(var62, "format(...)");
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(var62);
         }

         return null;
      }

      if (var54 != 0) {
         double var52 = a(this, var6, var31, var33, var19);
         short var63 = -15440;
         Vec3 var53 = a(String.valueOf(this), var6, var31, var33);
         short var71 = -15449;
         String var46 = "yaw=%.2f pitch=%.2f reqD=%.2f simD=%.2f err=%.3f land=(%.2f, %.2f, %.2f) entry=(%.2f, %.2f, %.2f)";
         Object[] var47 = new Object[]{var31, var33, var27, var52, Math.abs(var52 - var27), var53.x, var53.y, var53.z, var15, var19, var17};
         String var64 = String.format(var46, Arrays.copyOf(var47, var47.length));
         var10002 = -15439;
         var10003 = 6835;
         Intrinsics.checkNotNullExpressionValue(var64, "format(...)");
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(var64);
      }

      return new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI((float)var31, (float)var33);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "¦\u0084\u001bPøÉ§\u000f\"æ±³uô\u000bPýä\u001bÞTE1l8\u0002ð<Ï2ã\u000b Ë\u0090¢\u0099èÃ\u0080\u0085\u0099F\u000b\u008c\u000f\u0005:+û\u0095âOÕ\u001fa\u0089\\\\ÏáE\u001alé\u001bD¿§ð\u008f \t\u0093z.\u0002Íóx(0¹ ó®ë¬Û\u009d\u0013\u0013(\u009d¼1PåøCJè-\u0098E\u009c\u0013P\u007fB'b®\u0001\u0014LÞ\rD[û\u007fÁµ:\u0090\u0083±¶kJØ\rÑ^\b@Ô³\u0082g$,ºàÒÑ\u0099Hu\u008eõ\u0084";
      int var4 = "¦\u0084\u001bPøÉ§\u000f\"æ±³uô\u000bPýä\u001bÞTE1l8\u0002ð<Ï2ã\u000b Ë\u0090¢\u0099èÃ\u0080\u0085\u0099F\u000b\u008c\u000f\u0005:+û\u0095âOÕ\u001fa\u0089\\\\ÏáE\u001alé\u001bD¿§ð\u008f \t\u0093z.\u0002Íóx(0¹ ó®ë¬Û\u009d\u0013\u0013(\u009d¼1PåøCJè-\u0098E\u009c\u0013P\u007fB'b®\u0001\u0014LÞ\rD[û\u007fÁµ:\u0090\u0083±¶kJØ\rÑ^\b@Ô³\u0082g$,ºàÒÑ\u0099Hu\u008eõ\u0084"
         .length();
      char var1 = 31;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 121;
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
                     case 0 -> 121;
                     case 1 -> 72;
                     case 2 -> 53;
                     case 3 -> 107;
                     case 4 -> 38;
                     case 5 -> 51;
                     default -> 7;
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
                     d = new String[6];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new llIIIIIIIllIllIIllIlIIlIlIIIlllllllllIIIlllIIIlIIlIlIllIlIllIlllllIllIIllllIlIIllIllI();
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

                  var2 = "¾,2&\u008aNaçNïEé1Ãçv\u0099\u008bÈ9îBõnKzqHW\u00addUáêÂ\u001b\u0013}¼ª\u001b»";
                  var4 = "¾,2&\u008aNaçNïEé1Ãçv\u0099\u008bÈ9îBõnKzqHW\u00addUáêÂ\u001b\u0013}¼ª\u001b»".length();
                  var1 = 3;
                  var8 = -1;
            }

            var10000 = 44;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -15437) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 59;
            case 1 -> 228;
            case 2 -> 30;
            case 3 -> 129;
            case 4 -> 139;
            case 5 -> 184;
            case 6 -> 222;
            case 7 -> 47;
            case 8 -> 168;
            case 9 -> 180;
            case 10 -> 69;
            case 11 -> 132;
            case 12 -> 105;
            case 13 -> 134;
            case 14 -> 46;
            case 15 -> 104;
            case 16 -> 78;
            case 17 -> 143;
            case 18 -> 238;
            case 19 -> 203;
            case 20 -> 179;
            case 21 -> 28;
            case 22 -> 166;
            case 23 -> 218;
            case 24 -> 176;
            case 25 -> 204;
            case 26 -> 205;
            case 27 -> 80;
            case 28 -> 14;
            case 29 -> 126;
            case 30 -> 18;
            case 31 -> 51;
            case 32 -> 96;
            case 33 -> 142;
            case 34 -> 220;
            case 35 -> 87;
            case 36 -> 3;
            case 37 -> 229;
            case 38 -> 53;
            case 39 -> 125;
            case 40 -> 153;
            case 41 -> 111;
            case 42 -> 244;
            case 43 -> 75;
            case 44 -> 58;
            case 45 -> 25;
            case 46 -> 64;
            case 47 -> 253;
            case 48 -> 151;
            case 49 -> 240;
            case 50 -> 239;
            case 51 -> 138;
            case 52 -> 236;
            case 53 -> 94;
            case 54 -> 234;
            case 55 -> 63;
            case 56 -> 248;
            case 57 -> 149;
            case 58 -> 6;
            case 59 -> 100;
            case 60 -> 23;
            case 61 -> 189;
            case 62 -> 11;
            case 63 -> 249;
            case 64 -> 54;
            case 65 -> 255;
            case 66 -> 182;
            case 67 -> 242;
            case 68 -> 202;
            case 69 -> 192;
            case 70 -> 221;
            case 71 -> 127;
            case 72 -> 207;
            case 73 -> 231;
            case 74 -> 77;
            case 75 -> 72;
            case 76 -> 19;
            case 77 -> 190;
            case 78 -> 99;
            case 79 -> 233;
            case 80 -> 137;
            case 81 -> 148;
            case 82 -> 131;
            case 83 -> 102;
            case 84 -> 114;
            case 85 -> 211;
            case 86 -> 86;
            case 87 -> 65;
            case 88 -> 40;
            case 89 -> 2;
            case 90 -> 227;
            case 91 -> 251;
            case 92 -> 145;
            case 93 -> 169;
            case 94 -> 247;
            case 95 -> 45;
            case 96 -> 71;
            case 97 -> 89;
            case 98 -> 113;
            case 99 -> 116;
            case 100 -> 212;
            case 101 -> 150;
            case 102 -> 120;
            case 103 -> 62;
            case 104 -> 7;
            case 105 -> 43;
            case 106 -> 0;
            case 107 -> 101;
            case 108 -> 92;
            case 109 -> 85;
            case 110 -> 241;
            case 111 -> 52;
            case 112 -> 181;
            case 113 -> 122;
            case 114 -> 93;
            case 115 -> 154;
            case 116 -> 216;
            case 117 -> 36;
            case 118 -> 193;
            case 119 -> 172;
            case 120 -> 165;
            case 121 -> 90;
            case 122 -> 197;
            case 123 -> 109;
            case 124 -> 98;
            case 125 -> 55;
            case 126 -> 209;
            case 127 -> 206;
            case 128 -> 199;
            case 129 -> 214;
            case 130 -> 57;
            case 131 -> 61;
            case 132 -> 108;
            case 133 -> 27;
            case 134 -> 194;
            case 135 -> 16;
            case 136 -> 12;
            case 137 -> 183;
            case 138 -> 213;
            case 139 -> 13;
            case 140 -> 201;
            case 141 -> 223;
            case 142 -> 215;
            case 143 -> 243;
            case 144 -> 41;
            case 145 -> 250;
            case 146 -> 44;
            case 147 -> 185;
            case 148 -> 49;
            case 149 -> 171;
            case 150 -> 219;
            case 151 -> 237;
            case 152 -> 73;
            case 153 -> 198;
            case 154 -> 26;
            case 155 -> 157;
            case 156 -> 254;
            case 157 -> 230;
            case 158 -> 124;
            case 159 -> 161;
            case 160 -> 187;
            case 161 -> 135;
            case 162 -> 110;
            case 163 -> 1;
            case 164 -> 188;
            case 165 -> 156;
            case 166 -> 91;
            case 167 -> 159;
            case 168 -> 9;
            case 169 -> 147;
            case 170 -> 112;
            case 171 -> 136;
            case 172 -> 79;
            case 173 -> 174;
            case 174 -> 152;
            case 175 -> 210;
            case 176 -> 20;
            case 177 -> 106;
            case 178 -> 123;
            case 179 -> 225;
            case 180 -> 88;
            case 181 -> 160;
            case 182 -> 33;
            case 183 -> 34;
            case 184 -> 67;
            case 185 -> 118;
            case 186 -> 175;
            case 187 -> 245;
            case 188 -> 95;
            case 189 -> 15;
            case 190 -> 217;
            case 191 -> 38;
            case 192 -> 208;
            case 193 -> 162;
            case 194 -> 81;
            case 195 -> 252;
            case 196 -> 37;
            case 197 -> 119;
            case 198 -> 5;
            case 199 -> 130;
            case 200 -> 163;
            case 201 -> 133;
            case 202 -> 178;
            case 203 -> 146;
            case 204 -> 82;
            case 205 -> 103;
            case 206 -> 196;
            case 207 -> 74;
            case 208 -> 235;
            case 209 -> 56;
            case 210 -> 191;
            case 211 -> 224;
            case 212 -> 48;
            case 213 -> 141;
            case 214 -> 200;
            case 215 -> 177;
            case 216 -> 70;
            case 217 -> 84;
            case 218 -> 128;
            case 219 -> 170;
            case 220 -> 195;
            case 221 -> 155;
            case 222 -> 50;
            case 223 -> 17;
            case 224 -> 31;
            case 225 -> 246;
            case 226 -> 186;
            case 227 -> 164;
            case 228 -> 10;
            case 229 -> 97;
            case 230 -> 8;
            case 231 -> 76;
            case 232 -> 39;
            case 233 -> 35;
            case 234 -> 144;
            case 235 -> 115;
            case 236 -> 107;
            case 237 -> 32;
            case 238 -> 42;
            case 239 -> 140;
            case 240 -> 60;
            case 241 -> 4;
            case 242 -> 226;
            case 243 -> 24;
            case 244 -> 29;
            case 245 -> 117;
            case 246 -> 22;
            case 247 -> 232;
            case 248 -> 121;
            case 249 -> 158;
            case 250 -> 173;
            case 251 -> 21;
            case 252 -> 68;
            case 253 -> 83;
            case 254 -> 167;
            default -> 66;
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
