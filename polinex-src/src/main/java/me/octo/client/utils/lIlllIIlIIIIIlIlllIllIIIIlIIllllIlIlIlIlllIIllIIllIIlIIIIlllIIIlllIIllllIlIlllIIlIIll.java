package me.octo.client.utils;

import java.util.Locale;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

public final class lIlllIIlIIIIIlIlllIllIIIIlIIllllIlIlIlIlllIIllIIllIIlIIIIlllIIIlllIIllllIlIlllIIlIIll {
   @NotNull
   public static lIlllIIlIIIIIlIlllIllIIIIlIIllllIlIlIlIlllIIllIIllIIlIIIIlllIIIlllIIllllIlIlllIIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static volatile long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static String[] a;
   private static String[] b;

   private lIlllIIlIIIIIlIlllIllIIIIlIIllllIlIlIlIlllIIllIIllIIlIIIIlllIIIlllIIllllIlIlllIIlIIll() {
   }

   @JvmStatic
   public static final void a(@NotNull String var0, @NotNull String var1) {
      short var10001 = -3320;
      short var10002 = -31427;
      Intrinsics.checkNotNullParameter(var0, "macro");
      var10001 = -3268;
      var10002 = -9860;
      Intrinsics.checkNotNullParameter(var1, "type");
      String var2 = StringsKt.trim(var0).toString();
      String var10000 = UUID.randomUUID().toString();
      var10002 = -3275;
      short var10003 = -10913;
      Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
      String var3 = var10000;
      IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(null);
   }

   @JvmStatic
   private static final boolean a(String var0, String var1, String var2) {
      return false;
   }

   private final boolean b(String var1, String var2, String var3) {
      boolean var4;
      String var5;
      boolean var6;
      var6 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i();
      String var10001 = (var2 + " " + var3).toLowerCase(Locale.ROOT);
      short var10003 = -3279;
      short var10004 = -31970;
      Intrinsics.checkNotNullExpressionValue(var10001, "toLowerCase(...)");
      var5 = var10001;
      var4 = var6;
      short var9 = -3327;
      short var10002 = -15289;
      var6 = Intrinsics.areEqual(var1, "start");
      label31:
      if (var4) {
         if (var6) {
            CharSequence var7 = var5;
            short var10 = -3298;
            var10002 = -17863;
            var6 = StringsKt.contains(var7, "already active", false);
            if (!var4) {
               break label31;
            }

            if (var6) {
               return true;
            }
         }

         short var11 = -3317;
         var10002 = -20231;
         var6 = Intrinsics.areEqual(var1, "stop");
      }

      if (var4) {
         if (var6) {
            CharSequence var8 = var5;
            short var12 = -3273;
            var10002 = -32765;
            var6 = StringsKt.contains(var8, "no active", false);
            if (!var4) {
               return var6;
            }

            if (var6) {
               return true;
            }
         }

         var6 = false;
      }

      return var6;
   }

   private final String a(String var1) {
      boolean var2 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.h();
      String var10000 = var1;
      if (!var2) {
         if (var1.length() <= 800) {
            return var1;
         }

         var10000 = StringsKt.take(var1, 800);
      }

      short var10001 = -3311;
      short var10002 = 18845;
      return var10000 + "...(truncated)";
   }

   private static final Unit c(String var0, String var1, String var2) {
      short var10000 = ((short)((IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i()) ? 1 : 0));
      boolean var4 = a(var0, var1, var2);
      boolean var3 = (var10000 != 0);
      if (!var4) {
         long var5 = System.currentTimeMillis();
         long var10 = var5 - IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         if (var3) {
            if (var10 < 60000L) {
               return Unit.INSTANCE;
            }

            var10 = var5;
         }

         IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var10;
         var10000 = -3312;
         short var10001 = 19891;
         short var10002 = -3301;
         short var10003 = -32709;
         short var10004 = -3314;
         short var10005 = 8910;
         short var10006 = -3321;
         short var10007 = -3874;
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c(
            "Failed to send macro status for stats (requestId=" + var2 + ", macro='" + var0 + "', type='" + var1 + "')"
         );
      }

      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var22 = null; // PX-FIX
      String[] var5 = new String[47];
      int var3 = 0;
      String var2 = "åiEÅ¶\u007f\u001dgm5º¢íÆ`<V^Ýx(h\u0092ç\u0096+Õ`ºÉ`õ¤¢\u0018l\u0012¹\u0086±ÁA\u0085\u008c±\n\"Áþ\u0010\r\u000b£\\\u0001k!¯'ÁÛ\u009b\u008b\u000e\u007fö1¬Þ¹T;ñË=÷R¡\ný\u0096a³Ç5\u0000aÔ\n/\u0082õ|\u0099»\u008fî*\u001dÂ*µ\u0089\u0099ª³çú\u009a\rãN\u0093Þbë XZ\u0086üØ0\b\"©ôî)Åy¾#\u0017úp\u0082\u000e\u0019Ö!óÄ+\u0007$¼þ\u0003\u0004\u0014\n\tÖe\u0004Ü`é\u0094÷\u0017\bî¨\u0003c\u0098ßÈÌ\bË\u0093§\u0004\f3ZQ\u0007±ÜÐsìæ\u0088\u000e\u000e§9\u009a\u0005ô\u0084ECW¾\u007f±¤1âf\u0086@LuË»Y\u0090wîeÛ¦\u0095¬¼\u0017\u000fU\u0099\u0091r\u0011ËS)\u0098\u0005ö¯,]R¬\u001fr{¥ßRÎ\u001bLs`\bú\u0007\u008d\u009b R\u0015\u001c´\u0004é\u0095\u008a,0r\u009cô\u0001CÄ2AQ\u009b¹\u0014°lÒÀ\rÝ±À\u0007ÐÝ\u008bRqØ\u001b{\u0092\u0013²c\u0094o¦»;\u008c\u0092$E7kf\u0094ï7\u0004Ô¸j]\u0004\u0093¨=2/M\u009f\u0085Ô\u0084&\t\u001fádµaz\u0003Ôà(\u0090c@Üçtë\u009eM¿\u008c©\u001c\u0082\u008bÿbÛäËGÎð\u0085\u0018¼Ã\têü\u0004\u00017oÁ\u0005õÄ \nÙ\u0002Eâ\tÅ_f\u009b,\u0001\u001dê&\u0007\u0010\u001a\u008cTP\b\u00898Ì¢#Æ¹<m^ºxÄh\u000eé< \u008e²vGé0ÛÀkîO\u009d*êº$Îù\u0016?ÿð\u001bE%\u00ad\u0090\u000eõYU\u009bLFØ]\u000bB\u0007¾7j\"÷Ö#>>\u001eÐp\u0089i¶Ã\u00125\u0015c²\u0017g*ÏÄÜ\u0090:~')\u00901\u001bÙ\u0012\u0096h \u0019ÛË!6r\u001aµ¶\u0003ÁÓûú\u0086|u\t\u0013¾\u009b?m f\u008c\u0002\u0005\fËÀ\\\u009c\u0007aÝo®:QV\u0002²Ç\u0004EOX£\tè\u000fì\u001a\u009bè\u0096+¢\u000bH¯×\u0082\u0016ÖÑ9- (\u00057AxºÒ/=\u0098\u008b4E:1\u009cæ\u0014UofÂWØX\u0097m \u001dûLh\u0099=_\u0082µÝ\u0001³\u008feÕ\u0004\n[ös\u0082h\\Í\u0015+\u007f\u0005\u00948\u0014ùq\n$ym¦\u0095<\u0088 I$\f¾\u0098\tzÝ\u0004ªuD»\u0093$\u0005t´Ï³}\nI\u0019÷B\u0015\u000bZ¦\u009fò\u0004\u0092}å1\r?Eå\u0081\\e\u0014\u008cÜ±P\u0007ÓBT¾0EÛL!P3¹õP9äãÑ+ÿu\u0084\u009fXÐ\u008a?YFG¨\u0005cÀ~\t¿äë(>\u001c\rêü\u0012'\u008bÃÈ\u009c)\u008a\b\rzd\u0005S\u0083\u001aaÄ|\u008eR$*\u0010Ü9\u0010g\róá}\nÊÄÑ\u0087\u0092¼û\u0007Ì\u0086\bñ\u0010h\u0014\t\u0090S¬$oE \u00adN";
      int var4 = "åiEÅ¶\u007f\u001dgm5º¢íÆ`<V^Ýx(h\u0092ç\u0096+Õ`ºÉ`õ¤¢\u0018l\u0012¹\u0086±ÁA\u0085\u008c±\n\"Áþ\u0010\r\u000b£\\\u0001k!¯'ÁÛ\u009b\u008b\u000e\u007fö1¬Þ¹T;ñË=÷R¡\ný\u0096a³Ç5\u0000aÔ\n/\u0082õ|\u0099»\u008fî*\u001dÂ*µ\u0089\u0099ª³çú\u009a\rãN\u0093Þbë XZ\u0086üØ0\b\"©ôî)Åy¾#\u0017úp\u0082\u000e\u0019Ö!óÄ+\u0007$¼þ\u0003\u0004\u0014\n\tÖe\u0004Ü`é\u0094÷\u0017\bî¨\u0003c\u0098ßÈÌ\bË\u0093§\u0004\f3ZQ\u0007±ÜÐsìæ\u0088\u000e\u000e§9\u009a\u0005ô\u0084ECW¾\u007f±¤1âf\u0086@LuË»Y\u0090wîeÛ¦\u0095¬¼\u0017\u000fU\u0099\u0091r\u0011ËS)\u0098\u0005ö¯,]R¬\u001fr{¥ßRÎ\u001bLs`\bú\u0007\u008d\u009b R\u0015\u001c´\u0004é\u0095\u008a,0r\u009cô\u0001CÄ2AQ\u009b¹\u0014°lÒÀ\rÝ±À\u0007ÐÝ\u008bRqØ\u001b{\u0092\u0013²c\u0094o¦»;\u008c\u0092$E7kf\u0094ï7\u0004Ô¸j]\u0004\u0093¨=2/M\u009f\u0085Ô\u0084&\t\u001fádµaz\u0003Ôà(\u0090c@Üçtë\u009eM¿\u008c©\u001c\u0082\u008bÿbÛäËGÎð\u0085\u0018¼Ã\têü\u0004\u00017oÁ\u0005õÄ \nÙ\u0002Eâ\tÅ_f\u009b,\u0001\u001dê&\u0007\u0010\u001a\u008cTP\b\u00898Ì¢#Æ¹<m^ºxÄh\u000eé< \u008e²vGé0ÛÀkîO\u009d*êº$Îù\u0016?ÿð\u001bE%\u00ad\u0090\u000eõYU\u009bLFØ]\u000bB\u0007¾7j\"÷Ö#>>\u001eÐp\u0089i¶Ã\u00125\u0015c²\u0017g*ÏÄÜ\u0090:~')\u00901\u001bÙ\u0012\u0096h \u0019ÛË!6r\u001aµ¶\u0003ÁÓûú\u0086|u\t\u0013¾\u009b?m f\u008c\u0002\u0005\fËÀ\\\u009c\u0007aÝo®:QV\u0002²Ç\u0004EOX£\tè\u000fì\u001a\u009bè\u0096+¢\u000bH¯×\u0082\u0016ÖÑ9- (\u00057AxºÒ/=\u0098\u008b4E:1\u009cæ\u0014UofÂWØX\u0097m \u001dûLh\u0099=_\u0082µÝ\u0001³\u008feÕ\u0004\n[ös\u0082h\\Í\u0015+\u007f\u0005\u00948\u0014ùq\n$ym¦\u0095<\u0088 I$\f¾\u0098\tzÝ\u0004ªuD»\u0093$\u0005t´Ï³}\nI\u0019÷B\u0015\u000bZ¦\u009fò\u0004\u0092}å1\r?Eå\u0081\\e\u0014\u008cÜ±P\u0007ÓBT¾0EÛL!P3¹õP9äãÑ+ÿu\u0084\u009fXÐ\u008a?YFG¨\u0005cÀ~\t¿äë(>\u001c\rêü\u0012'\u008bÃÈ\u009c)\u008a\b\rzd\u0005S\u0083\u001aaÄ|\u008eR$*\u0010Ü9\u0010g\róá}\nÊÄÑ\u0087\u0092¼û\u0007Ì\u0086\bñ\u0010h\u0014\t\u0090S¬$oE \u00adN"
         .length();
      char var1 = '\t';
      int var8 = -1;

      label52:
      while (true) {
         short var10000 = 65;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var26 = var10001.toCharArray();
               int var10004 = var26.length;
               int var6 = 0;
               byte var29 = (byte)var10000;
               var22 = var26;
               int var15 = var10004;
               byte var34;
               char[] var38;
               int var10006;
               if (var10004 <= 1) {
                  var38 = var26;
                  var34 = (byte)var10000;
                  var10006 = var6;
               } else {
                  var29 = (byte)var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var38 = var26;
                  var34 = (byte)var10000;
                  var10006 = var6;
               }

               while (true) {
                  var38[var10006] = (char)(var38[var10006] ^ var34 ^ switch (var6 % 7) {
                     case 0 -> 66;
                     case 1 -> 7;
                     case 2 -> 28;
                     case 3 -> 36;
                     case 4 -> 87;
                     case 5 -> 21;
                     default -> 40;
                  });
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var38 = var22;
                     var34 = var29;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var38 = var22;
                     var34 = var29;
                     var10006 = var6;
                  }
               }
            }

            String var31 = new String(var22).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var31;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[47];
                     var10000 = -3318;
                     short var17 = -7075;
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = "https://api.polinexclient.net/polinex/mod/macro";
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIlllIIlIIIIIlIlllIllIIIIlIIllllIlIlIlIlllIIllIIllIIlIIIIlllIIIlllIIllllIlIlllIIlIIll();
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var31;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "C¬\u0099L¥&¥Vè2Åjtè\u0001\u001b<íÜ\u008dá2P\u0096àÒö$õ-\u0080|ba\u0001ÚÅ\u001aµ\u008ccý\u008f\u0007=V-÷mælü#$k^\u0007VÂ²ó\r\u0087S/zXo¹\f\u009cRvy¿";
                  var4 = "C¬\u0099L¥&¥Vè2Åjtè\u0001\u001b<íÜ\u008dá2P\u0096àÒö$õ-\u0080|ba\u0001ÚÅ\u001aµ\u008ccý\u008f\u0007=V-÷mælü#$k^\u0007VÂ²ó\r\u0087S/zXo¹\f\u009cRvy¿"
                     .length();
                  var1 = '=';
                  var8 = -1;
            }

            var10000 = 75;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -3301) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 13;
            case 1 -> 32;
            case 2 -> 193;
            case 3 -> 108;
            case 4 -> 73;
            case 5 -> 233;
            case 6 -> 167;
            case 7 -> 80;
            case 8 -> 3;
            case 9 -> 17;
            case 10 -> 8;
            case 11 -> 133;
            case 12 -> 204;
            case 13 -> 122;
            case 14 -> 48;
            case 15 -> 203;
            case 16 -> 54;
            case 17 -> 82;
            case 18 -> 239;
            case 19 -> 210;
            case 20 -> 225;
            case 21 -> 236;
            case 22 -> 231;
            case 23 -> 95;
            case 24 -> 245;
            case 25 -> 150;
            case 26 -> 190;
            case 27 -> 98;
            case 28 -> 200;
            case 29 -> 155;
            case 30 -> 65;
            case 31 -> 195;
            case 32 -> 4;
            case 33 -> 252;
            case 34 -> 87;
            case 35 -> 90;
            case 36 -> 179;
            case 37 -> 165;
            case 38 -> 220;
            case 39 -> 70;
            case 40 -> 24;
            case 41 -> 88;
            case 42 -> 69;
            case 43 -> 119;
            case 44 -> 123;
            case 45 -> 52;
            case 46 -> 188;
            case 47 -> 149;
            case 48 -> 240;
            case 49 -> 97;
            case 50 -> 1;
            case 51 -> 49;
            case 52 -> 60;
            case 53 -> 238;
            case 54 -> 153;
            case 55 -> 53;
            case 56 -> 201;
            case 57 -> 253;
            case 58 -> 110;
            case 59 -> 213;
            case 60 -> 99;
            case 61 -> 131;
            case 62 -> 168;
            case 63 -> 47;
            case 64 -> 248;
            case 65 -> 46;
            case 66 -> 129;
            case 67 -> 28;
            case 68 -> 211;
            case 69 -> 31;
            case 70 -> 161;
            case 71 -> 20;
            case 72 -> 174;
            case 73 -> 58;
            case 74 -> 140;
            case 75 -> 145;
            case 76 -> 241;
            case 77 -> 64;
            case 78 -> 55;
            case 79 -> 136;
            case 80 -> 137;
            case 81 -> 121;
            case 82 -> 171;
            case 83 -> 23;
            case 84 -> 109;
            case 85 -> 63;
            case 86 -> 104;
            case 87 -> 94;
            case 88 -> 186;
            case 89 -> 66;
            case 90 -> 7;
            case 91 -> 159;
            case 92 -> 185;
            case 93 -> 40;
            case 94 -> 181;
            case 95 -> 107;
            case 96 -> 157;
            case 97 -> 198;
            case 98 -> 196;
            case 99 -> 127;
            case 100 -> 36;
            case 101 -> 128;
            case 102 -> 244;
            case 103 -> 2;
            case 104 -> 84;
            case 105 -> 229;
            case 106 -> 92;
            case 107 -> 180;
            case 108 -> 219;
            case 109 -> 170;
            case 110 -> 51;
            case 111 -> 163;
            case 112 -> 192;
            case 113 -> 202;
            case 114 -> 11;
            case 115 -> 143;
            case 116 -> 91;
            case 117 -> 45;
            case 118 -> 43;
            case 119 -> 93;
            case 120 -> 209;
            case 121 -> 71;
            case 122 -> 199;
            case 123 -> 37;
            case 124 -> 183;
            case 125 -> 148;
            case 126 -> 16;
            case 127 -> 254;
            case 128 -> 176;
            case 129 -> 221;
            case 130 -> 100;
            case 131 -> 57;
            case 132 -> 114;
            case 133 -> 112;
            case 134 -> 27;
            case 135 -> 18;
            case 136 -> 142;
            case 137 -> 218;
            case 138 -> 228;
            case 139 -> 230;
            case 140 -> 56;
            case 141 -> 144;
            case 142 -> 101;
            case 143 -> 175;
            case 144 -> 22;
            case 145 -> 151;
            case 146 -> 194;
            case 147 -> 6;
            case 148 -> 160;
            case 149 -> 154;
            case 150 -> 217;
            case 151 -> 124;
            case 152 -> 197;
            case 153 -> 26;
            case 154 -> 116;
            case 155 -> 86;
            case 156 -> 184;
            case 157 -> 191;
            case 158 -> 135;
            case 159 -> 206;
            case 160 -> 15;
            case 161 -> 38;
            case 162 -> 247;
            case 163 -> 25;
            case 164 -> 35;
            case 165 -> 242;
            case 166 -> 214;
            case 167 -> 164;
            case 168 -> 81;
            case 169 -> 106;
            case 170 -> 111;
            case 171 -> 232;
            case 172 -> 130;
            case 173 -> 103;
            case 174 -> 79;
            case 175 -> 42;
            case 176 -> 41;
            case 177 -> 72;
            case 178 -> 102;
            case 179 -> 216;
            case 180 -> 29;
            case 181 -> 251;
            case 182 -> 224;
            case 183 -> 222;
            case 184 -> 5;
            case 185 -> 166;
            case 186 -> 234;
            case 187 -> 67;
            case 188 -> 118;
            case 189 -> 34;
            case 190 -> 125;
            case 191 -> 189;
            case 192 -> 152;
            case 193 -> 68;
            case 194 -> 187;
            case 195 -> 44;
            case 196 -> 76;
            case 197 -> 9;
            case 198 -> 237;
            case 199 -> 182;
            case 200 -> 59;
            case 201 -> 208;
            case 202 -> 21;
            case 203 -> 215;
            case 204 -> 19;
            case 205 -> 235;
            case 206 -> 14;
            case 207 -> 117;
            case 208 -> 74;
            case 209 -> 10;
            case 210 -> 178;
            case 211 -> 120;
            case 212 -> 156;
            case 213 -> 39;
            case 214 -> 246;
            case 215 -> 173;
            case 216 -> 141;
            case 217 -> 132;
            case 218 -> 138;
            case 219 -> 96;
            case 220 -> 147;
            case 221 -> 212;
            case 222 -> 83;
            case 223 -> 115;
            case 224 -> 205;
            case 225 -> 12;
            case 226 -> 61;
            case 227 -> 177;
            case 228 -> 85;
            case 229 -> 250;
            case 230 -> 113;
            case 231 -> 75;
            case 232 -> 169;
            case 233 -> 62;
            case 234 -> 77;
            case 235 -> 146;
            case 236 -> 89;
            case 237 -> 207;
            case 238 -> 0;
            case 239 -> 255;
            case 240 -> 243;
            case 241 -> 172;
            case 242 -> 226;
            case 243 -> 78;
            case 244 -> 126;
            case 245 -> 223;
            case 246 -> 162;
            case 247 -> 30;
            case 248 -> 139;
            case 249 -> 158;
            case 250 -> 249;
            case 251 -> 227;
            case 252 -> 134;
            case 253 -> 105;
            case 254 -> 50;
            default -> 33;
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
