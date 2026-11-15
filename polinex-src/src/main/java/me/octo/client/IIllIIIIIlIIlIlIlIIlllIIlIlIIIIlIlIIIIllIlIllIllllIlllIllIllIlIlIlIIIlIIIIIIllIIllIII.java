package me.octo.client;

import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.player.LocalPlayer;
import org.jetbrains.annotations.NotNull;

public final class IIllIIIIIlIIlIlIlIIlllIIlIlIIIIlIlIIIIllIlIllIllllIlllIllIllIlIlIlIIIlIIIIIIllIIllIII {
   @NotNull
   public static IIllIIIIIlIIlIlIlIIlllIIlIlIIIIlIlIIIIllIlIllIllllIlllIllIllIlIlIlIIIlIIIIIIllIIllIII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static String[] a;
   private static String[] b;

   private IIllIIIIIlIIlIlIlIIlllIIlIlIIIIlIlIIIIllIlIllIllllIlllIllIllIlIlIlIIIlIIIIIIllIIllIII() {
   }

   public final void a() {
      int var25 = 0; // PX-FIX
      Object var23 = null; // PX-FIX
      String var10000 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
      long var2 = System.currentTimeMillis();
      String var1 = var10000;
      long var20 = var2 - lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      if (var1 != null) {
         if (var20 < 100L) {
            return;
         }

         var20 = var2;
      }

      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var20;
      if (var1 != null
         && me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .player
            != null) {
         LocalPlayer var4 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .player;
         boolean var21 = IIIIIIIIIIlllIIIIlIllIlIllIIlIlllIIIllIllIlllllIllIlIlIIlIIIlIllIIllIIlIlIIlIllIllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b();
         if (var1 != null) {
            if (!var21) {
               double var5 = lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a();
               int var7 = IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a();
               double var44;
               int var22 = (var44 = var5 - 6.0) == 0.0 ? 0 : (var44 < 0.0 ? -1 : 1);
               if (var1 != null) {
                  var22 = var22 < 0 ? 1 : 0;
               }

               int var8;
               label91: {
                  label105: {
                     var8 = var22;
                     float var45;
                     var23 = (var45 = var4.getXRot() - 25.0F) == 0.0F ? 0 : (var45 < 0.0F ? -1 : 1);
                     if (var1 != null) {
                        if (((Boolean)var23)) {
                           break label105;
                        }

                        var23 = var7;
                     }

                     if (var1 == null) {
                        break label91;
                     }

                     if ((((((Boolean)(Object)((Boolean)var23 ? 1 : 0)))) ? 1 : 0)  < 3) {
                        var23 = 1;
                        break label91;
                     }
                  }

                  var23 = 0;
               }

               label79: {
                  label107: {
                     int var9 =((Integer)( var23));
                     int var24 = var8;
                     if (var1 != null) {
                        if (var8 == 0) {
                           var25 = var9;
                           if (var1 == null) {
                              break label79;
                           }

                           if (var9 == 0) {
                              break label107;
                           }
                        }

                        var24 =(( lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0);
                     }

                     label70: {
                        if (var1 != null) {
                           if (var24 != 0) {
                              break label70;
                           }

                           IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var2;
                           lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = true;
                           var24 = var8;
                        }

                        short var10001 = 14288;
                        short var10002 = 23953;
                        String var11 = "%.1f";
                        Object[] var12 = new Object[]{var5};
                        String var29 = String.format(var11, Arrays.copyOf(var12, var12.length));
                        short var10003 = 14291;
                        short var10004 = 12772;
                        Intrinsics.checkNotNullExpressionValue(var29, "format(...)");
                        var10003 = 14292;
                        var10004 = -4899;
                        var11 = "%.1f";
                        var12 = new Object[]{var4.getXRot()};
                        String var37 = String.format(var11, Arrays.copyOf(var12, var12.length));
                        short var10005 = 14303;
                        short var10006 = -2660;
                        Intrinsics.checkNotNullExpressionValue(var37, "format(...)");
                        String var14 = var37;
                        String var16 = var29;
                        int var17 = var24;
                        short var26 = 14297;
                        var10001 = 27728;
                        var10002 = 14296;
                        var10003 = -22174;
                        var10004 = 14289;
                        var10005 = -28278;
                        var10006 = 14290;
                        short var10007 = 14434;
                        short var10008 = 14299;
                        short var10009 = 14102;
                        me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
                           "[WallStare] Started staring - wall=" + var17 + " (" + var16 + "m), floor=" + var9 + " (pitch=" + var14 + "°, depth=" + var7 + ")"
                        );
                     }

                     long var10 = var2 - IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                     long var27 = var10;
                     if (var1 != null) {
                        if (var10 < 100L) {
                           return;
                        }

                        var27 = var10;
                     }

                     short var31 = 14298;
                     short var34 = -23723;
                     var34 = 14295;
                     short var39 = 13884;
                     me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
                        "[WallStare] Triggering adjustment after " + var27 + "ms"
                     );
                     this.b();
                     if (var1 != null) {
                        return;
                     }
                  }

                  var25 =(( lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0);
               }

               if (var1 != null) {
                  if (var25 != 0) {
                     short var28 = 14293;
                     short var32 = -27196;
                     me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
                        "[WallStare] Stopped staring - looking at open area"
                     );
                  }

                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 0L;
                  var25 = 0;
               }

               lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = (var25 != 0);
               return;
            }

            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 0L;
            var21 = false;
         }

         lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var21;
      }
   }

   private final void b() {
      String var1 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
      if (var1 != null) {
         Pair var10000 = IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(new lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI(System.currentTimeMillis()), true);
         if (var10000 != null) {
            Pair var2 = var10000;
            float var3 = 0.25F + (float)Math.random() * 0.25F;
            IIIIIIIIIIlllIIIIlIllIlIllIIlIlllIIIllIllIlllllIllIlIlIIlIIIlIllIIllIIlIlIIlIllIllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(((Number)var2.getFirst()).floatValue(), ((Number)var2.getSecond()).floatValue())
               .a(var3);
            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = System.currentTimeMillis();
            return;
         }
      }
   }

   public final void c() {
      short var10000 = 14294;
      short var10001 = -25089;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("[WallStare] Reset");
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 0L;
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = false;
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = 0L;
   }

   public final boolean d() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[13];
      int var3 = 0;
      String var2 = "|\f\u009bÖ+k\u001eA=!Ý\b($\u009dx¼-\u001bo\n\u007f\u0018Ï\u00973¿½\u0081ºC\u0004B/4Ð\u0002rH\u0011Ú\u001aÆ*üò\u0014þ÷;'\u008bE.;\u0094Â2\u0083öí·\u0099A¸\u0088bõ\u0095R\u0012\u0004ì÷£]kGè@\u009cL\u000fÞÇF¦1üÕ\u0014VwZ0\u0004TÕâ1ð<ÂÖ\u009f\u0089Å\u0094\u0004ÂÐ$/\tû¬5àâ\u0081ÿÞÅ()Ý¸Ò3íí\u001dÈGÀ\u0004¿È¸¿ø¡ã\u00910éx\u001b÷Afb\u009bÁ .¼C\u0012Ò\u0086YàÇ#@\u0002\u0095)\u0096\u0092Yò^º\u0012»â9üRj«Ö\u0099_\u009bj7Ñ±\u001c«Ý\u008c\u0088lá©þ";
      int var4 = "|\f\u009bÖ+k\u001eA=!Ý\b($\u009dx¼-\u001bo\n\u007f\u0018Ï\u00973¿½\u0081ºC\u0004B/4Ð\u0002rH\u0011Ú\u001aÆ*üò\u0014þ÷;'\u008bE.;\u0094Â2\u0083öí·\u0099A¸\u0088bõ\u0095R\u0012\u0004ì÷£]kGè@\u009cL\u000fÞÇF¦1üÕ\u0014VwZ0\u0004TÕâ1ð<ÂÖ\u009f\u0089Å\u0094\u0004ÂÐ$/\tû¬5àâ\u0081ÿÞÅ()Ý¸Ò3íí\u001dÈGÀ\u0004¿È¸¿ø¡ã\u00910éx\u001b÷Afb\u009bÁ .¼C\u0012Ò\u0086YàÇ#@\u0002\u0095)\u0096\u0092Yò^º\u0012»â9üRj«Ö\u0099_\u009bj7Ñ±\u001c«Ý\u008c\u0088lá©þ"
         .length();
      char var1 = 11;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 24;
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
                     case 0 -> 45;
                     case 1 -> 7;
                     case 2 -> 114;
                     case 3 -> 67;
                     case 4 -> 80;
                     case 5 -> 118;
                     default -> 15;
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
                     b = new String[13];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIllIIIIIlIIlIlIlIIlllIIlIlIIIIlIlIIIIllIlIllIllllIlllIllIllIlIlIlIIIlIIIIIIllIIllIII();
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

                  var2 = "YÂ\u000b³ë=u @0{§9Ñ";
                  var4 = "YÂ\u000b³ë=u @0{§9Ñ".length();
                  var1 = 2;
                  var8 = -1;
            }

            var10000 = 105;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 14291) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 238;
            case 1 -> 169;
            case 2 -> 244;
            case 3 -> 164;
            case 4 -> 162;
            case 5 -> 234;
            case 6 -> 20;
            case 7 -> 98;
            case 8 -> 35;
            case 9 -> 4;
            case 10 -> 147;
            case 11 -> 38;
            case 12 -> 39;
            case 13 -> 1;
            case 14 -> 174;
            case 15 -> 50;
            case 16 -> 211;
            case 17 -> 90;
            case 18 -> 226;
            case 19 -> 154;
            case 20 -> 155;
            case 21 -> 225;
            case 22 -> 247;
            case 23 -> 194;
            case 24 -> 88;
            case 25 -> 176;
            case 26 -> 87;
            case 27 -> 165;
            case 28 -> 14;
            case 29 -> 37;
            case 30 -> 77;
            case 31 -> 8;
            case 32 -> 148;
            case 33 -> 29;
            case 34 -> 48;
            case 35 -> 86;
            case 36 -> 5;
            case 37 -> 59;
            case 38 -> 163;
            case 39 -> 143;
            case 40 -> 13;
            case 41 -> 117;
            case 42 -> 137;
            case 43 -> 78;
            case 44 -> 202;
            case 45 -> 177;
            case 46 -> 209;
            case 47 -> 206;
            case 48 -> 212;
            case 49 -> 153;
            case 50 -> 133;
            case 51 -> 25;
            case 52 -> 68;
            case 53 -> 42;
            case 54 -> 122;
            case 55 -> 111;
            case 56 -> 71;
            case 57 -> 248;
            case 58 -> 115;
            case 59 -> 218;
            case 60 -> 19;
            case 61 -> 198;
            case 62 -> 44;
            case 63 -> 255;
            case 64 -> 54;
            case 65 -> 208;
            case 66 -> 241;
            case 67 -> 116;
            case 68 -> 210;
            case 69 -> 113;
            case 70 -> 254;
            case 71 -> 18;
            case 72 -> 102;
            case 73 -> 181;
            case 74 -> 99;
            case 75 -> 2;
            case 76 -> 65;
            case 77 -> 58;
            case 78 -> 229;
            case 79 -> 125;
            case 80 -> 119;
            case 81 -> 151;
            case 82 -> 46;
            case 83 -> 161;
            case 84 -> 135;
            case 85 -> 239;
            case 86 -> 128;
            case 87 -> 112;
            case 88 -> 110;
            case 89 -> 131;
            case 90 -> 168;
            case 91 -> 227;
            case 92 -> 17;
            case 93 -> 160;
            case 94 -> 80;
            case 95 -> 16;
            case 96 -> 190;
            case 97 -> 43;
            case 98 -> 93;
            case 99 -> 108;
            case 100 -> 182;
            case 101 -> 45;
            case 102 -> 49;
            case 103 -> 139;
            case 104 -> 222;
            case 105 -> 56;
            case 106 -> 47;
            case 107 -> 240;
            case 108 -> 141;
            case 109 -> 107;
            case 110 -> 195;
            case 111 -> 67;
            case 112 -> 188;
            case 113 -> 96;
            case 114 -> 41;
            case 115 -> 191;
            case 116 -> 82;
            case 117 -> 34;
            case 118 -> 228;
            case 119 -> 63;
            case 120 -> 242;
            case 121 -> 123;
            case 122 -> 185;
            case 123 -> 197;
            case 124 -> 22;
            case 125 -> 73;
            case 126 -> 126;
            case 127 -> 92;
            case 128 -> 179;
            case 129 -> 27;
            case 130 -> 230;
            case 131 -> 146;
            case 132 -> 9;
            case 133 -> 127;
            case 134 -> 203;
            case 135 -> 114;
            case 136 -> 15;
            case 137 -> 217;
            case 138 -> 246;
            case 139 -> 97;
            case 140 -> 172;
            case 141 -> 171;
            case 142 -> 166;
            case 143 -> 57;
            case 144 -> 83;
            case 145 -> 249;
            case 146 -> 36;
            case 147 -> 232;
            case 148 -> 173;
            case 149 -> 136;
            case 150 -> 94;
            case 151 -> 81;
            case 152 -> 224;
            case 153 -> 12;
            case 154 -> 118;
            case 155 -> 219;
            case 156 -> 204;
            case 157 -> 157;
            case 158 -> 167;
            case 159 -> 103;
            case 160 -> 30;
            case 161 -> 235;
            case 162 -> 89;
            case 163 -> 26;
            case 164 -> 95;
            case 165 -> 66;
            case 166 -> 252;
            case 167 -> 23;
            case 168 -> 121;
            case 169 -> 3;
            case 170 -> 104;
            case 171 -> 33;
            case 172 -> 40;
            case 173 -> 158;
            case 174 -> 156;
            case 175 -> 79;
            case 176 -> 183;
            case 177 -> 109;
            case 178 -> 91;
            case 179 -> 62;
            case 180 -> 178;
            case 181 -> 51;
            case 182 -> 215;
            case 183 -> 223;
            case 184 -> 132;
            case 185 -> 6;
            case 186 -> 85;
            case 187 -> 52;
            case 188 -> 64;
            case 189 -> 138;
            case 190 -> 76;
            case 191 -> 186;
            case 192 -> 200;
            case 193 -> 84;
            case 194 -> 28;
            case 195 -> 253;
            case 196 -> 205;
            case 197 -> 145;
            case 198 -> 129;
            case 199 -> 72;
            case 200 -> 10;
            case 201 -> 180;
            case 202 -> 221;
            case 203 -> 220;
            case 204 -> 214;
            case 205 -> 159;
            case 206 -> 152;
            case 207 -> 213;
            case 208 -> 69;
            case 209 -> 142;
            case 210 -> 149;
            case 211 -> 140;
            case 212 -> 130;
            case 213 -> 53;
            case 214 -> 237;
            case 215 -> 245;
            case 216 -> 55;
            case 217 -> 199;
            case 218 -> 193;
            case 219 -> 184;
            case 220 -> 21;
            case 221 -> 175;
            case 222 -> 144;
            case 223 -> 187;
            case 224 -> 31;
            case 225 -> 233;
            case 226 -> 0;
            case 227 -> 101;
            case 228 -> 24;
            case 229 -> 106;
            case 230 -> 70;
            case 231 -> 120;
            case 232 -> 150;
            case 233 -> 250;
            case 234 -> 134;
            case 235 -> 216;
            case 236 -> 243;
            case 237 -> 60;
            case 238 -> 231;
            case 239 -> 75;
            case 240 -> 100;
            case 241 -> 207;
            case 242 -> 201;
            case 243 -> 105;
            case 244 -> 189;
            case 245 -> 251;
            case 246 -> 61;
            case 247 -> 11;
            case 248 -> 192;
            case 249 -> 124;
            case 250 -> 236;
            case 251 -> 196;
            case 252 -> 32;
            case 253 -> 74;
            case 254 -> 7;
            default -> 170;
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
