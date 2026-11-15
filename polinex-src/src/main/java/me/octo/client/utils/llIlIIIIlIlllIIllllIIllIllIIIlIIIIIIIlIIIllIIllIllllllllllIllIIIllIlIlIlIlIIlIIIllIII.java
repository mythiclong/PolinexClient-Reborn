package me.octo.client.utils;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import org.jetbrains.annotations.NotNull;

public final class llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII
   extends lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   @NotNull
   public static llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static boolean IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static boolean lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static int IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static String[] c;
   private static String[] d;

   private llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII() {
   }

   public final boolean g() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   public final boolean h() {
      return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   public final void i() {
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = false;
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = false;
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      short var10001 = 32613;
      short var10002 = -14165;
      Intrinsics.checkNotNullParameter(var1, "event");
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = 0;
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII var1) {
      short var10001 = 32608;
      short var10002 = 21572;
      Intrinsics.checkNotNullParameter(var1, "event");
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
      int var3 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII++;
      String var2 = var10000;
      int var6 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII % 40;
      if (var2 != null) {
         if (var6 != 0) {
            return;
         }

         var3 = 0;
         var6 = 0;
      }

      int var4 = var6;
      String var5 = lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .k();
      CharSequence var7 = var5;
      var10001 = 32609;
      var10002 = 9355;
      int var8 = ((StringsKt.contains(var7, "Active Effects", false)) ? 1 : 0);
      if (var2 != null) {
         if (var8 == 0) {
            return;
         }

         CharSequence var9 = var5;
         var10001 = 32615;
         var10002 = -2408;
         var8 = ((StringsKt.contains(var9, "Cookie Buff", false)) ? 1 : 0);
      }

      label58:
      if (var2 != null) {
         if (var8 != 0) {
            CharSequence var10 = var5;
            var10001 = 32612;
            var10002 = 30832;
            var8 = ((StringsKt.contains(var10, "Not active! Obtain booster cookies from the", false)) ? 1 : 0);
            if (var2 == null) {
               break label58;
            }

            if (var8 == 0) {
               var3 = 1;
            }
         }

         CharSequence var11 = var5;
         var10001 = 32618;
         var10002 = 31474;
         var8 = ((StringsKt.contains(var11, "God Potion", false)) ? 1 : 0);
      }

      if (var2 != null) {
         if (var8 != 0) {
            var4 = 1;
         }

         var8 = var3;
      }

      label64: {
         byte var16 =((byte)(( IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) ? 1 : 0));
         if (var2 != null) {
            if (var8 !=( (!IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) ? 1 : 0)) {
               IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = (var3 != 0);
            }

            var8 = var4;
            if (var2 == null) {
               break label64;
            }

            var16 =((byte)(( lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) ? 1 : 0));
         }

         if (var8 == var16) {
            return;
         }

         var8 = var4;
      }

      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = (var8 != 0);
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
      short var10002 = 32613;
      short var10003 = -14165;
      Intrinsics.checkNotNullParameter(var1, "event");
      String var2 = var10000;
      Packet var3 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      boolean var5 = var3 instanceof ClientboundSystemChatPacket;
      if (var2 != null) {
         if (!var5) {
            return;
         }

         var5 = ((ClientboundSystemChatPacket)var3).overlay();
      }

      if (!var5) {
         IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var6 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         String var10001 = ((ClientboundSystemChatPacket)var3).content().getString();
         var10003 = 32610;
         short var10004 = -2491;
         Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
         String var4 = var6.a(var10001);
         CharSequence var7 = var4;
         short var12 = 32614;
         var10002 = 20310;
         boolean var8 = StringsKt.contains(var7, "Your Cookie Buff has expired!", false);
         if (var2 != null) {
            if (var8) {
               IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = false;
               if (var2 != null) {
                  return;
               }
            }

            CharSequence var9 = var4;
            short var13 = 32611;
            var10002 = 18516;
            var8 = StringsKt.contains(var9, "You consumed a God Potion!", false);
         }

         if (var2 != null) {
            if (var8) {
               lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = true;
               if (var2 != null) {
                  return;
               }
            }

            CharSequence var10 = var4;
            short var14 = 32616;
            var10002 = -704;
            var8 = StringsKt.contains(var10, "Your God Potion has expired!", false);
         }

         if (var2 != null) {
            if (var8) {
               lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = false;
               if (var2 != null) {
                  return;
               }
            }

            CharSequence var11 = var4;
            short var15 = 32619;
            var10002 = 15176;
            var8 = StringsKt.contains(var11, "consumed a Booster Cookie", false);
         }

         if (var2 != null) {
            if (!var8) {
               return;
            }

            var8 = true;
         }

         IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var8;
      }
   }

   public final boolean j() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   public final boolean k() {
      return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[11];
      int var3 = 0;
      String var2 = "É/\f%è@øÙ\nz¾«½Á\u001aá\u008cñiaÉ;K\u0087Ó\u00149ÄØ\u001f'bu\t¹\u001c\u009a^\f»Å\u0005\u0089ÝW7°\u000e\u0011\u0003õ\\Õ\u0005T¯þ´J¸[\u001d\u001dÞ\u0086\u0016zÞ\u009fæ4\u0003§Yw\u000fÉ\u000e²\u0081Î\u0092`I÷C\u008d,Z\u000be\n\u000bÈ\u0015\u0097\u0011þîÍÕÞ\u001c<+£ÍMAÕÀõý\u0004TC\u0084\u008d àmEÔ+ôX\\Ì·»\u00991\u001aî\u0015þ\u0013[úô§þûÔ:\u0081},\u0005ö×¸vM\n0Ç\u0007\u0000¿ä¯ôV~";
      int var4 = "É/\f%è@øÙ\nz¾«½Á\u001aá\u008cñiaÉ;K\u0087Ó\u00149ÄØ\u001f'bu\t¹\u001c\u009a^\f»Å\u0005\u0089ÝW7°\u000e\u0011\u0003õ\\Õ\u0005T¯þ´J¸[\u001d\u001dÞ\u0086\u0016zÞ\u009fæ4\u0003§Yw\u000fÉ\u000e²\u0081Î\u0092`I÷C\u008d,Z\u000be\n\u000bÈ\u0015\u0097\u0011þîÍÕÞ\u001c<+£ÍMAÕÀõý\u0004TC\u0084\u008d àmEÔ+ôX\\Ì·»\u00991\u001aî\u0015þ\u0013[úô§þûÔ:\u0081},\u0005ö×¸vM\n0Ç\u0007\u0000¿ä¯ôV~"
         .length();
      char var1 = 14;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 41;
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
                     case 0 -> 14;
                     case 1 -> 89;
                     case 2 -> 7;
                     case 3 -> 125;
                     case 4 -> 11;
                     case 5 -> 12;
                     default -> 27;
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
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII();
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = true;
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = true;
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

                  var2 = "ì\u0082\\\u0091Ð\u0087¸½¢\u009e`Q\u0082SHÀÑ ^®\u009cx&D\u0097\u001c£\u0087Ó0\f¸Ö5$¾ÿtÑ\u0007ù\u001eT¶\u0011~Fz-ñ\u0099\u0092®¦";
                  var4 = "ì\u0082\\\u0091Ð\u0087¸½¢\u009e`Q\u0082SHÀÑ ^®\u009cx&D\u0097\u001c£\u0087Ó0\f¸Ö5$¾ÿtÑ\u0007ù\u001eT¶\u0011~Fz-ñ\u0099\u0092®¦"
                     .length();
                  var1 = 25;
                  var8 = -1;
            }

            var10000 = 34;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 32610) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 63;
            case 1 -> 51;
            case 2 -> 114;
            case 3 -> 186;
            case 4 -> 187;
            case 5 -> 211;
            case 6 -> 225;
            case 7 -> 70;
            case 8 -> 255;
            case 9 -> 228;
            case 10 -> 163;
            case 11 -> 123;
            case 12 -> 23;
            case 13 -> 124;
            case 14 -> 36;
            case 15 -> 126;
            case 16 -> 15;
            case 17 -> 44;
            case 18 -> 82;
            case 19 -> 81;
            case 20 -> 48;
            case 21 -> 191;
            case 22 -> 190;
            case 23 -> 162;
            case 24 -> 215;
            case 25 -> 85;
            case 26 -> 93;
            case 27 -> 118;
            case 28 -> 30;
            case 29 -> 12;
            case 30 -> 184;
            case 31 -> 249;
            case 32 -> 13;
            case 33 -> 59;
            case 34 -> 202;
            case 35 -> 119;
            case 36 -> 134;
            case 37 -> 145;
            case 38 -> 102;
            case 39 -> 203;
            case 40 -> 108;
            case 41 -> 230;
            case 42 -> 164;
            case 43 -> 61;
            case 44 -> 62;
            case 45 -> 76;
            case 46 -> 147;
            case 47 -> 79;
            case 48 -> 226;
            case 49 -> 142;
            case 50 -> 253;
            case 51 -> 193;
            case 52 -> 195;
            case 53 -> 231;
            case 54 -> 20;
            case 55 -> 144;
            case 56 -> 159;
            case 57 -> 32;
            case 58 -> 232;
            case 59 -> 11;
            case 60 -> 140;
            case 61 -> 197;
            case 62 -> 252;
            case 63 -> 177;
            case 64 -> 29;
            case 65 -> 54;
            case 66 -> 153;
            case 67 -> 92;
            case 68 -> 146;
            case 69 -> 227;
            case 70 -> 214;
            case 71 -> 161;
            case 72 -> 185;
            case 73 -> 107;
            case 74 -> 112;
            case 75 -> 97;
            case 76 -> 205;
            case 77 -> 91;
            case 78 -> 131;
            case 79 -> 220;
            case 80 -> 178;
            case 81 -> 52;
            case 82 -> 71;
            case 83 -> 50;
            case 84 -> 14;
            case 85 -> 176;
            case 86 -> 157;
            case 87 -> 143;
            case 88 -> 125;
            case 89 -> 16;
            case 90 -> 89;
            case 91 -> 154;
            case 92 -> 217;
            case 93 -> 229;
            case 94 -> 137;
            case 95 -> 55;
            case 96 -> 7;
            case 97 -> 196;
            case 98 -> 65;
            case 99 -> 31;
            case 100 -> 160;
            case 101 -> 212;
            case 102 -> 224;
            case 103 -> 169;
            case 104 -> 40;
            case 105 -> 206;
            case 106 -> 110;
            case 107 -> 99;
            case 108 -> 234;
            case 109 -> 67;
            case 110 -> 132;
            case 111 -> 223;
            case 112 -> 8;
            case 113 -> 6;
            case 114 -> 109;
            case 115 -> 115;
            case 116 -> 239;
            case 117 -> 200;
            case 118 -> 113;
            case 119 -> 172;
            case 120 -> 0;
            case 121 -> 28;
            case 122 -> 37;
            case 123 -> 103;
            case 124 -> 156;
            case 125 -> 17;
            case 126 -> 204;
            case 127 -> 78;
            case 128 -> 254;
            case 129 -> 84;
            case 130 -> 116;
            case 131 -> 141;
            case 132 -> 166;
            case 133 -> 35;
            case 134 -> 90;
            case 135 -> 216;
            case 136 -> 43;
            case 137 -> 73;
            case 138 -> 238;
            case 139 -> 56;
            case 140 -> 39;
            case 141 -> 94;
            case 142 -> 192;
            case 143 -> 106;
            case 144 -> 1;
            case 145 -> 128;
            case 146 -> 33;
            case 147 -> 129;
            case 148 -> 151;
            case 149 -> 210;
            case 150 -> 122;
            case 151 -> 75;
            case 152 -> 207;
            case 153 -> 139;
            case 154 -> 34;
            case 155 -> 26;
            case 156 -> 49;
            case 157 -> 148;
            case 158 -> 244;
            case 159 -> 149;
            case 160 -> 80;
            case 161 -> 86;
            case 162 -> 133;
            case 163 -> 101;
            case 164 -> 180;
            case 165 -> 167;
            case 166 -> 100;
            case 167 -> 221;
            case 168 -> 240;
            case 169 -> 41;
            case 170 -> 10;
            case 171 -> 64;
            case 172 -> 96;
            case 173 -> 45;
            case 174 -> 121;
            case 175 -> 198;
            case 176 -> 47;
            case 177 -> 105;
            case 178 -> 9;
            case 179 -> 218;
            case 180 -> 77;
            case 181 -> 24;
            case 182 -> 235;
            case 183 -> 179;
            case 184 -> 155;
            case 185 -> 173;
            case 186 -> 174;
            case 187 -> 194;
            case 188 -> 19;
            case 189 -> 209;
            case 190 -> 237;
            case 191 -> 38;
            case 192 -> 165;
            case 193 -> 42;
            case 194 -> 170;
            case 195 -> 219;
            case 196 -> 246;
            case 197 -> 95;
            case 198 -> 181;
            case 199 -> 138;
            case 200 -> 150;
            case 201 -> 135;
            case 202 -> 233;
            case 203 -> 152;
            case 204 -> 2;
            case 205 -> 87;
            case 206 -> 117;
            case 207 -> 53;
            case 208 -> 213;
            case 209 -> 247;
            case 210 -> 199;
            case 211 -> 189;
            case 212 -> 168;
            case 213 -> 104;
            case 214 -> 46;
            case 215 -> 25;
            case 216 -> 248;
            case 217 -> 251;
            case 218 -> 175;
            case 219 -> 21;
            case 220 -> 57;
            case 221 -> 74;
            case 222 -> 222;
            case 223 -> 68;
            case 224 -> 98;
            case 225 -> 60;
            case 226 -> 243;
            case 227 -> 72;
            case 228 -> 18;
            case 229 -> 201;
            case 230 -> 120;
            case 231 -> 5;
            case 232 -> 241;
            case 233 -> 242;
            case 234 -> 208;
            case 235 -> 130;
            case 236 -> 127;
            case 237 -> 3;
            case 238 -> 188;
            case 239 -> 236;
            case 240 -> 66;
            case 241 -> 88;
            case 242 -> 69;
            case 243 -> 58;
            case 244 -> 245;
            case 245 -> 27;
            case 246 -> 250;
            case 247 -> 171;
            case 248 -> 183;
            case 249 -> 182;
            case 250 -> 22;
            case 251 -> 111;
            case 252 -> 136;
            case 253 -> 158;
            case 254 -> 83;
            default -> 4;
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
