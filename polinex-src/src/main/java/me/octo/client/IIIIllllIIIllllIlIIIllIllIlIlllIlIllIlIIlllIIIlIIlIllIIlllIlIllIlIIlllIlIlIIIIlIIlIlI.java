package me.octo.client;

import java.net.URLEncoder;
import java.util.concurrent.TimeUnit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.Request.Builder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIIIllllIIIllllIlIIIllIllIlIlllIlIllIlIIlllIIIlIIlIllIIlllIlIllIlIIlllIlIlIIIIlIIlIlI {
   @NotNull
   public static IIIIllllIIIllllIlIIIllIllIlIlllIlIllIlIIlllIIIlIIlIllIIlllIlIllIlIIlllIlIlIIIIlIIlIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static OkHttpClient lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String[] a;
   private static String[] b;

   private IIIIllllIIIllllIlIIIllIllIlIlllIlIllIlIIlllIIIlIIlIllIIlllIlIllIlIIlllIlIlIIIIlIIlIlI() {
   }

   @Nullable
   public final IIIIllllIIIllllIlIIIllIllIlIlllIlIllIlIIlllIIIlIIlIllIIlllIlIllIlIIlllIlIlIIIIlIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
      @NotNull llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll var1
   ) {
      Response var45 = null; // PX-FIX
      Object var40 = null; // PX-FIX
      String var10000 = llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.u();
      short var10002 = 28146;
      short var10003 = 12287;
      Intrinsics.checkNotNullParameter(var1, "track");
      String var2 = var10000;

      try {
         var10000 = var1.a();
         short var48 = 28138;
         var10002 = 32453;
         String var34 = URLEncoder.encode(var10000, "UTF-8");
         var10000 = var1.b();
         var48 = 28148;
         var10002 = 29724;
         String var4 = URLEncoder.encode(var10000, "UTF-8");
         CharSequence var6 = var1.c();

         label112: {
            label111: {
               try {
                  var40 = var6.length();
                  if (var2 == null) {
                     break label112;
                  }

                  if ((me.octo.client.PxTruth.truth(var40))) {
                     break label111;
                  }
               } catch (Throwable var28) {
                  throw (RuntimeException)a(var28);
               }

               var40 = 0;
               break label112;
            }

            var40 = 1;
         }

         if (!(me.octo.client.PxTruth.truth(var40))) {
            boolean var7 = false;
            var10000 = var1.b();
         } else {
            var10000 = String.valueOf(var6);
         }

         var10000 = var10000;
         var48 = 28148;
         var10002 = 29724;
         String var5 = URLEncoder.encode(var10000, "UTF-8");
         short var43 = 28151;
         long var35 = RangesKt.coerceAtLeast(var1.d() / 1000L, 1L);
         var48 = -3872;
         var10002 = 28155;
         var10003 = -17838;
         short var10004 = 28145;
         short var10005 = 20012;
         short var10006 = 28152;
         short var10007 = -22514;
         String var8 = "https://lrclib.net/api/get?artist_name=" + var34 + "&track_name=" + var4 + "&album_name=" + var5 + "&duration=" + var35;
         Builder var44 = new Builder().url(var8);
         var48 = 28139;
         var10002 = -30964;
         var10002 = 28158;
         var10003 = -30255;
         Request var9 = var44.header("User-Agent", "Polinex-Fabric/1.0 (https://github.com/polinexclient)").build();
         var var10 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.newCall(var9).execute();
         Throwable var11 = null;

         try {
            Response var12 = var10;
            boolean var13 = false;

            label126: {
               try {
                  var45 = var12;
                  if (var2 == null) {
                     break label126;
                  }

                  if (!var12.isSuccessful()) {
                     return null;
                  }
               } catch (Throwable var29) {
                  throw (RuntimeException)a(var29);
               }

               var45 = var12;
            }

            try {
               ResponseBody var46 = var45.body();
               if (var46 == null) {
                  return null;
               }

               var10000 = var46.string();
               if (var10000 == null) {
                  return null;
               }
            } catch (Throwable var30) {
               throw (RuntimeException)a(var30);
            }

            String var14 = var10000;
            return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var14);
         } catch (Throwable var31) {
            var11 = var31;
            throw var31;
         } finally {
            CloseableKt.closeFinally(var10, var11);
         }
      } catch (Exception var33) {
         var10000 = var33.getMessage();
         short var10001 = 28153;
         var10002 = -7185;
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("lrclib lookup failed: " + var10000);
         return null;
      }
   }

   private final IIIIllllIIIllllIlIIIllIllIlIlllIlIllIlIIlllIIIlIIlIllIIlllIlIllIlIIlllIlIlIIIIlIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
      String var1
   ) {
      String var3;
      String var4;
      String var7;
      label13: {
         var7 = llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.u();
         short var10003 = 28149;
         short var10004 = -495;
         var3 = this.a(var1, "plainLyrics");
         var10003 = 28150;
         var10004 = -26143;
         var4 = this.a(var1, "syncedLyrics");
         String var2 = var7;
         if (var2 != null) {
            short var10002 = 28147;
            var10003 = 7841;
            var7 = this.a(var1, "instrumental");
            if (var7 != null) {
               break label13;
            }
         }

         short var8 = 28159;
         short var10001 = -32688;
         var7 = "false";
      }

      String var5 = var7;
      short var9 = 28154;
      short var10 = -4411;
      boolean var6 = StringsKt.equals(var5, "true", true);
      return new IIIIllllIIIllllIlIIIllIllIlIlllIlIllIlIIlllIIIlIIlIllIIlllIlIllIlIIlllIlIlIIIIlIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         var3, var4, var6
      );
   }

   private final String a(String var1, String var2) {
      char var28 = 0; // PX-FIX
      char var25 = 0; // PX-FIX
      int var22 = 0; // PX-FIX
      int var21 = 0; // PX-FIX
      String var10000 = llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.u();
      String var4 = "\"" + var2 + "\"";
      String var3 = var10000;
      int var5 = StringsKt.indexOf(var1, var4, 0, false);
      int var20 = var5;
      int var10001 = -1;
      if (var3 != null) {
         if (var5 == -1) {
            return null;
         }

         var20 = var5;
         var10001 = var4.length();
      }

      var5 = var20 + var10001;

      while (true) {
         if (var5 < var1.length()) {
            var21 = var1.charAt(var5);
            var10001 = 58;
            if (var3 == null || var3 == null) {
               break;
            }

            if (var21 != 58) {
               var5++;
               if (var3 != null) {
                  continue;
               }
            }
         }

         var21 = var5;
         var10001 = var1.length();
         break;
      }

      if (var21 >= (((var10001 != 0) ? 1 : 0))) {
         return null;
      } else {
         var5++;

         while (true) {
            if (var5 < var1.length()) {
               var22 = CharsKt.isWhitespace(var1.charAt(var5)) ? 1 : 0;
               if (var3 == null || var3 == null) {
                  break;
               }

               if (var22 == 0) {
                  var5++;
                  if (var3 != null) {
                     continue;
                  }
               }
            }

            var22 = var5;
            break;
         }

         label140: {
            if (var3 != null) {
               if (var22 >= (((var1.length() != 0) ? 1 : 0))) {
                  return null;
               }

               var10000 = var1;
               var10001 = var5;
               if (var3 == null) {
                  break label140;
               }

               var22 = var1.charAt(var5);
            }

            switch ((Integer)(var22)) {
               case 34:
                  StringBuilder var6 = new StringBuilder();
                  var5++;

                  while (var5 < var1.length()) {
                     if (var3 == null) {
                        return var1;
                     }

                     char var7;
                     var7 = var1.charAt(var5);
                     var25 = var7;
                     var10001 = 92;
                     label127:
                     if (var3 != null) {
                        if (var7 == '\\') {
                           var25 = (char)(var5 + 1);
                           var10001 = var1.length();
                           if (var3 == null) {
                              break label127;
                           }

                           if (var25 < var10001) {
                              char var8 = var1.charAt(var5 + 1);
                              switch (var8) {
                                 case '"':
                                    var6.append('"');
                                    break;
                                 case '/':
                                    var6.append('/');
                                    break;
                                 case '\\':
                                    var6.append('\\');
                                    break;
                                 case 'n':
                                    var6.append('\n');
                                    break;
                                 case 'r':
                                    var6.append('\r');
                                    break;
                                 case 't':
                                    var6.append('\t');
                                    break;
                                 case 'u':
                                    if (var5 + 5 < var1.length()) {
                                       var10000 = var1.substring(var5 + 2, var5 + 6);
                                       short var10002 = 28144;
                                       short var10003 = -7973;
                                       Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
                                       String var9 = var10000;
                                       var6.append((char)Integer.parseInt(var9, CharsKt.checkRadix(16)));
                                       var5 += 4;
                                    }
                                    break;
                                 default:
                                    var6.append(var8);
                              }

                              var5 += 2;
                              if (var3 != null) {
                                 continue;
                              }
                           }
                        }

                        var25 = var7;
                        var10001 = 34;
                     }

                     if (var25 == var10001) {
                        return var6.toString();
                     }

                     var6.append(var7);
                     var5++;
                     if (var3 == null) {
                        break;
                     }
                  }

                  return null;
               case 110:
                  return null;
               default:
                  var10000 = var1;
                  var10001 = var5;
            }
         }

         var10000 = var10000.substring(var10001);
         short var33 = 28157;
         short var35 = -12543;
         Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
         CharSequence var17 = var10000;
         boolean var18 = false;
         int var19 = 0;
         int var10 = var17.length();

         label109: {
            while (var19 < var10) {
               char var11 = var17.charAt(var19);
               boolean var12 = false;
               var28 = var11;
               if (var3 == null) {
                  break label109;
               }

               label105:
               if (var3 != null) {
                  if (var11 != ',') {
                     var28 = var11;
                     if (var3 == null) {
                        break label105;
                     }

                     if (var11 != '}') {
                        var28 = var11;
                        if (var3 == null) {
                           break label105;
                        }

                        if (var11 != '\n') {
                           var28 = 0;
                           break label105;
                        }
                     }
                  }

                  var28 = 1;
               }

               if (var28 != 0) {
                  var28 = (char)var19;
                  break label109;
               }

               var19++;
               if (var3 == null) {
                  break;
               }
            }

            var28 = (char)-1;
         }

         int var16 = var28;
         if (var16 == -1) {
            var10000 = null;
         } else {
            var10000 = var1.substring(var5, var5 + var16);
            var33 = 28157;
            var35 = -12543;
            Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
            var10000 = StringsKt.trim(var10000).toString();
         }

         return var10000;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var22 = null; // PX-FIX
      String[] var5 = new String[18];
      int var3 = 0;
      String var2 = "¼Ænc\fSì\u008cäP\u0094miu\u0095dÑ\n\u0090íóÅZÞXÝ,r\u0016T+~×7Wµ;ð\u009f\u0015\u009aú\u009fÔ»/´Z=\u008fü5©;un¿Â\u001b/_zåîÕµB\u0085Úu\u000e\u009eº\u0019Kß\u0002!\\Aµ\u0086?\u001eöê\u001c\u0083\nd\u000e¢Jq1¬q¬\u001a \u0012\u0003e«Ä\u0005´Ö&\u0006Þ5áz|F\u009eÇ?\u008fÛnulÇå\u0000\u008f\u00924\u0007¶\u009b\u001co\u007f\u00865ÌÃ§Ö}\u0014¾«\u0015«+a*\u0002Îe¡.cüXªZBl\u0083å\u000e\u0007\u0086é\u009aù\u0012\u009b\u0083]\u008dì,vp\u0005|ÿbBô\f\bÙ@\u000eù`Y!\u0088ï1õ\u000eÛ\u008drû\u008a>õ\u0006\u0090=U:A²\fÏ»\u0001º*:öz\u0006÷\n\u009d\fÅÒ½\u008dïôO\u009cSÚ×ò'\u000f6\u0086®Ç¿ý6\u0014\bâÏ\u0014M{ä\u0097©\u008a\u0080Ü§Ç¡µUn\u0006ôô½õ\u0019Ò\u0080\u001cÓÝe\u0005Uée,\u0084\u000bZ>\"\u00adù\u0093ÒVhãØ";
      int var4 = "¼Ænc\fSì\u008cäP\u0094miu\u0095dÑ\n\u0090íóÅZÞXÝ,r\u0016T+~×7Wµ;ð\u009f\u0015\u009aú\u009fÔ»/´Z=\u008fü5©;un¿Â\u001b/_zåîÕµB\u0085Úu\u000e\u009eº\u0019Kß\u0002!\\Aµ\u0086?\u001eöê\u001c\u0083\nd\u000e¢Jq1¬q¬\u001a \u0012\u0003e«Ä\u0005´Ö&\u0006Þ5áz|F\u009eÇ?\u008fÛnulÇå\u0000\u008f\u00924\u0007¶\u009b\u001co\u007f\u00865ÌÃ§Ö}\u0014¾«\u0015«+a*\u0002Îe¡.cüXªZBl\u0083å\u000e\u0007\u0086é\u009aù\u0012\u009b\u0083]\u008dì,vp\u0005|ÿbBô\f\bÙ@\u000eù`Y!\u0088ï1õ\u000eÛ\u008drû\u008a>õ\u0006\u0090=U:A²\fÏ»\u0001º*:öz\u0006÷\n\u009d\fÅÒ½\u008dïôO\u009cSÚ×ò'\u000f6\u0086®Ç¿ý6\u0014\bâÏ\u0014M{ä\u0097©\u008a\u0080Ü§Ç¡µUn\u0006ôô½õ\u0019Ò\u0080\u001cÓÝe\u0005Uée,\u0084\u000bZ>\"\u00adù\u0093ÒVhãØ"
         .length();
      char var1 = 4;
      int var8 = -1;

      label52:
while (true) {
         short var10000 = 19;
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
                     case 0 -> 73;
                     case 1 -> 28;
                     case 2 -> 46;
                     case 3 -> 16;
                     case 4 -> 42;
                     case 5 -> 93;
                     default -> 3;
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
                     b = new String[18];
                     var10000 = 28156;
                     short var17 = -7758;
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = "Polinex-Fabric/1.0 (https://github.com/polinexclient)";
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIIIllllIIIllllIlIIIllIllIlIlllIlIllIlIIlllIIIlIIlIllIIlllIlIllIlIIlllIlIlIIIIlIIlIlI();
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new okhttp3.OkHttpClient.Builder()
                        .connectTimeout(5L, TimeUnit.SECONDS)
                        .readTimeout(8L, TimeUnit.SECONDS)
                        .build();
                     break label52;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var31;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "ÀËH÷¾\nè\u0016nÐ(ÖBÚ?\u000f";
                  var4 = "ÀËH÷¾\nè\u0016nÐ(ÖBÚ?\u000f".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 15;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 28154) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 161;
            case 1 -> 144;
            case 2 -> 235;
            case 3 -> 20;
            case 4 -> 69;
            case 5 -> 29;
            case 6 -> 98;
            case 7 -> 104;
            case 8 -> 249;
            case 9 -> 35;
            case 10 -> 85;
            case 11 -> 232;
            case 12 -> 156;
            case 13 -> 134;
            case 14 -> 141;
            case 15 -> 194;
            case 16 -> 50;
            case 17 -> 68;
            case 18 -> 11;
            case 19 -> 165;
            case 20 -> 221;
            case 21 -> 247;
            case 22 -> 75;
            case 23 -> 205;
            case 24 -> 7;
            case 25 -> 23;
            case 26 -> 67;
            case 27 -> 154;
            case 28 -> 118;
            case 29 -> 181;
            case 30 -> 25;
            case 31 -> 146;
            case 32 -> 106;
            case 33 -> 239;
            case 34 -> 63;
            case 35 -> 162;
            case 36 -> 214;
            case 37 -> 206;
            case 38 -> 173;
            case 39 -> 155;
            case 40 -> 74;
            case 41 -> 58;
            case 42 -> 160;
            case 43 -> 158;
            case 44 -> 140;
            case 45 -> 149;
            case 46 -> 36;
            case 47 -> 64;
            case 48 -> 207;
            case 49 -> 218;
            case 50 -> 136;
            case 51 -> 135;
            case 52 -> 116;
            case 53 -> 228;
            case 54 -> 6;
            case 55 -> 139;
            case 56 -> 89;
            case 57 -> 83;
            case 58 -> 217;
            case 59 -> 198;
            case 60 -> 27;
            case 61 -> 2;
            case 62 -> 231;
            case 63 -> 191;
            case 64 -> 117;
            case 65 -> 86;
            case 66 -> 110;
            case 67 -> 180;
            case 68 -> 84;
            case 69 -> 82;
            case 70 -> 114;
            case 71 -> 192;
            case 72 -> 195;
            case 73 -> 88;
            case 74 -> 130;
            case 75 -> 44;
            case 76 -> 133;
            case 77 -> 92;
            case 78 -> 79;
            case 79 -> 184;
            case 80 -> 209;
            case 81 -> 159;
            case 82 -> 102;
            case 83 -> 109;
            case 84 -> 219;
            case 85 -> 163;
            case 86 -> 53;
            case 87 -> 80;
            case 88 -> 157;
            case 89 -> 73;
            case 90 -> 60;
            case 91 -> 122;
            case 92 -> 187;
            case 93 -> 211;
            case 94 -> 95;
            case 95 -> 99;
            case 96 -> 254;
            case 97 -> 142;
            case 98 -> 152;
            case 99 -> 39;
            case 100 -> 113;
            case 101 -> 237;
            case 102 -> 127;
            case 103 -> 251;
            case 104 -> 171;
            case 105 -> 107;
            case 106 -> 216;
            case 107 -> 197;
            case 108 -> 188;
            case 109 -> 26;
            case 110 -> 97;
            case 111 -> 243;
            case 112 -> 100;
            case 113 -> 248;
            case 114 -> 185;
            case 115 -> 225;
            case 116 -> 166;
            case 117 -> 227;
            case 118 -> 40;
            case 119 -> 61;
            case 120 -> 178;
            case 121 -> 101;
            case 122 -> 3;
            case 123 -> 18;
            case 124 -> 28;
            case 125 -> 87;
            case 126 -> 47;
            case 127 -> 8;
            case 128 -> 164;
            case 129 -> 233;
            case 130 -> 31;
            case 131 -> 103;
            case 132 -> 220;
            case 133 -> 151;
            case 134 -> 242;
            case 135 -> 10;
            case 136 -> 119;
            case 137 -> 170;
            case 138 -> 70;
            case 139 -> 234;
            case 140 -> 128;
            case 141 -> 49;
            case 142 -> 112;
            case 143 -> 226;
            case 144 -> 91;
            case 145 -> 252;
            case 146 -> 120;
            case 147 -> 202;
            case 148 -> 43;
            case 149 -> 121;
            case 150 -> 0;
            case 151 -> 16;
            case 152 -> 201;
            case 153 -> 14;
            case 154 -> 48;
            case 155 -> 13;
            case 156 -> 96;
            case 157 -> 24;
            case 158 -> 193;
            case 159 -> 245;
            case 160 -> 212;
            case 161 -> 177;
            case 162 -> 175;
            case 163 -> 132;
            case 164 -> 108;
            case 165 -> 76;
            case 166 -> 78;
            case 167 -> 37;
            case 168 -> 22;
            case 169 -> 213;
            case 170 -> 168;
            case 171 -> 238;
            case 172 -> 56;
            case 173 -> 210;
            case 174 -> 17;
            case 175 -> 172;
            case 176 -> 208;
            case 177 -> 123;
            case 178 -> 131;
            case 179 -> 1;
            case 180 -> 186;
            case 181 -> 72;
            case 182 -> 174;
            case 183 -> 138;
            case 184 -> 111;
            case 185 -> 137;
            case 186 -> 77;
            case 187 -> 199;
            case 188 -> 12;
            case 189 -> 21;
            case 190 -> 196;
            case 191 -> 54;
            case 192 -> 33;
            case 193 -> 124;
            case 194 -> 169;
            case 195 -> 55;
            case 196 -> 5;
            case 197 -> 52;
            case 198 -> 229;
            case 199 -> 167;
            case 200 -> 244;
            case 201 -> 224;
            case 202 -> 34;
            case 203 -> 143;
            case 204 -> 38;
            case 205 -> 59;
            case 206 -> 65;
            case 207 -> 62;
            case 208 -> 176;
            case 209 -> 223;
            case 210 -> 30;
            case 211 -> 190;
            case 212 -> 15;
            case 213 -> 57;
            case 214 -> 182;
            case 215 -> 203;
            case 216 -> 32;
            case 217 -> 250;
            case 218 -> 41;
            case 219 -> 150;
            case 220 -> 148;
            case 221 -> 215;
            case 222 -> 125;
            case 223 -> 115;
            case 224 -> 204;
            case 225 -> 90;
            case 226 -> 147;
            case 227 -> 66;
            case 228 -> 93;
            case 229 -> 153;
            case 230 -> 51;
            case 231 -> 241;
            case 232 -> 126;
            case 233 -> 255;
            case 234 -> 4;
            case 235 -> 246;
            case 236 -> 236;
            case 237 -> 240;
            case 238 -> 200;
            case 239 -> 222;
            case 240 -> 9;
            case 241 -> 45;
            case 242 -> 81;
            case 243 -> 46;
            case 244 -> 105;
            case 245 -> 253;
            case 246 -> 94;
            case 247 -> 230;
            case 248 -> 189;
            case 249 -> 129;
            case 250 -> 145;
            case 251 -> 179;
            case 252 -> 71;
            case 253 -> 183;
            case 254 -> 19;
            default -> 42;
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
   public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll p0, String p1, String p2, boolean p3, int m, Object mk) {
      if ((m & 1) != 0) {
         p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }
      if ((m & 2) != 0) {
         p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }
      if ((m & 4) != 0) {
         p3 = p0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }
      return new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(p1, p2, p3);
   }

      @Nullable
      private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @Nullable
      private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(@Nullable String var1, @Nullable String var2, boolean var3) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      }

      @Nullable
      public final String a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final String b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @Nullable
      public final String d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final String e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final IIIIllllIIIllllIlIIIllIllIlIlllIlIllIlIIlllIIIlIIlIllIIlllIlIllIlIIlllIlIlIIIIlIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         @Nullable String var1, @Nullable String var2, boolean var3
      ) {
         return new IIIIllllIIIllllIlIIIllIllIlIlllIlIllIlIIlllIIIlIIlIllIIlllIlIllIlIIlllIlIlIIIIlIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 31514;
         boolean var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         String var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         String var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 24912;
         short var10002 = 31515;
         short var10003 = 27041;
         short var10004 = 31513;
         short var10005 = 29301;
         return "LyricsResponse(plain=" + var3 + ", synced=" + var2 + ", instrumental=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         String var1;
         int var4;
         label25: {
            var1 = llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.u();
            String var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            if (var1 != null) {
               if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl == null) {
                  var4 = 0;
                  break label25;
               }

               var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            }

            var4 = var10000.hashCode();
         }

         int var6;
         label19: {
            int var2 = var4;
            var4 = var2 * 31;
            String var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (var1 != null) {
               if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII == null) {
                  var6 = 0;
                  break label19;
               }

               var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            var6 = var10001.hashCode();
         }

         int var3 = var4 + var6;
         return var3 * 31 + Boolean.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.u();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof IIIIllllIIIllllIlIIIllIllIlIlllIlIllIlIIlllIIIlIIlIllIIlllIlIllIlIIlllIlIlIIIIlIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IIIIllllIIIllllIlIIIllIllIlIlllIlIllIlIIlllIIIlIIlIllIIlllIlIllIlIIlllIlIlIIIIlIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (IIIIllllIIIllllIlIIIllIllIlIlllIlIllIlIIlllIIIlIIlIllIIlllIlIllIlIIlllIlIlIIIIlIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         boolean var4 = Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         );
         if (var2 != null) {
            if (!var4) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
         }

         if (var2 != null) {
            if (!var4) {
               return false;
            }

            var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         if (var2 != null) {
            if (var4 != var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
               return false;
            }

            var4 = true;
         }

         return var4;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
         pxClinit: {
         String[] var5 = new String[3];
         int var3 = 0;
         String var2 = "Ïl\u00134\\²_Zé\u0015¹\u0094°I\u0004\u001fÏüd\u0016\u001a\u009f³'$«õ\u008e{ó\u0004\u000fÔ²jø7É\u009bÑÔ´ÐfÙH,";
         int var4 = "Ïl\u00134\\²_Zé\u0015¹\u0094°I\u0004\u001fÏüd\u0016\u001a\u009f³'$«õ\u008e{ó\u0004\u000fÔ²jø7É\u009bÑÔ´ÐfÙH,".length();
         char var1 = '\t';
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 55;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 55;
                  var10006 = var6;
               } else {
                  var13 = 55;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 55;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 125;
                     case 1 -> 10;
                     case 2 -> 78;
                     case 3 -> 116;
                     case 4 -> 85;
                     case 5 -> 94;
                     default -> 105;
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
               b = new String[3];
               break pxClinit;
            }

            var1 = var2.charAt(var0);
         }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 31515) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 20;
               case 1 -> 153;
               case 2 -> 221;
               case 3 -> 188;
               case 4 -> 86;
               case 5 -> 40;
               case 6 -> 189;
               case 7 -> 233;
               case 8 -> 92;
               case 9 -> 36;
               case 10 -> 168;
               case 11 -> 89;
               case 12 -> 228;
               case 13 -> 30;
               case 14 -> 170;
               case 15 -> 148;
               case 16 -> 175;
               case 17 -> 134;
               case 18 -> 9;
               case 19 -> 67;
               case 20 -> 108;
               case 21 -> 250;
               case 22 -> 194;
               case 23 -> 5;
               case 24 -> 71;
               case 25 -> 70;
               case 26 -> 62;
               case 27 -> 53;
               case 28 -> 73;
               case 29 -> 6;
               case 30 -> 220;
               case 31 -> 39;
               case 32 -> 7;
               case 33 -> 245;
               case 34 -> 64;
               case 35 -> 8;
               case 36 -> 131;
               case 37 -> 138;
               case 38 -> 164;
               case 39 -> 199;
               case 40 -> 96;
               case 41 -> 11;
               case 42 -> 238;
               case 43 -> 21;
               case 44 -> 95;
               case 45 -> 142;
               case 46 -> 129;
               case 47 -> 251;
               case 48 -> 102;
               case 49 -> 118;
               case 50 -> 182;
               case 51 -> 97;
               case 52 -> 31;
               case 53 -> 165;
               case 54 -> 83;
               case 55 -> 254;
               case 56 -> 186;
               case 57 -> 74;
               case 58 -> 196;
               case 59 -> 82;
               case 60 -> 59;
               case 61 -> 155;
               case 62 -> 63;
               case 63 -> 12;
               case 64 -> 35;
               case 65 -> 180;
               case 66 -> 18;
               case 67 -> 213;
               case 68 -> 246;
               case 69 -> 17;
               case 70 -> 204;
               case 71 -> 48;
               case 72 -> 1;
               case 73 -> 242;
               case 74 -> 114;
               case 75 -> 247;
               case 76 -> 141;
               case 77 -> 132;
               case 78 -> 198;
               case 79 -> 29;
               case 80 -> 128;
               case 81 -> 156;
               case 82 -> 143;
               case 83 -> 237;
               case 84 -> 154;
               case 85 -> 121;
               case 86 -> 28;
               case 87 -> 206;
               case 88 -> 227;
               case 89 -> 187;
               case 90 -> 26;
               case 91 -> 171;
               case 92 -> 130;
               case 93 -> 101;
               case 94 -> 111;
               case 95 -> 46;
               case 96 -> 161;
               case 97 -> 68;
               case 98 -> 113;
               case 99 -> 50;
               case 100 -> 100;
               case 101 -> 60;
               case 102 -> 123;
               case 103 -> 230;
               case 104 -> 103;
               case 105 -> 94;
               case 106 -> 61;
               case 107 -> 116;
               case 108 -> 25;
               case 109 -> 255;
               case 110 -> 27;
               case 111 -> 56;
               case 112 -> 81;
               case 113 -> 207;
               case 114 -> 174;
               case 115 -> 93;
               case 116 -> 239;
               case 117 -> 210;
               case 118 -> 91;
               case 119 -> 85;
               case 120 -> 252;
               case 121 -> 44;
               case 122 -> 219;
               case 123 -> 38;
               case 124 -> 159;
               case 125 -> 193;
               case 126 -> 4;
               case 127 -> 211;
               case 128 -> 236;
               case 129 -> 185;
               case 130 -> 115;
               case 131 -> 45;
               case 132 -> 184;
               case 133 -> 248;
               case 134 -> 109;
               case 135 -> 72;
               case 136 -> 214;
               case 137 -> 136;
               case 138 -> 23;
               case 139 -> 176;
               case 140 -> 34;
               case 141 -> 178;
               case 142 -> 120;
               case 143 -> 105;
               case 144 -> 2;
               case 145 -> 157;
               case 146 -> 241;
               case 147 -> 181;
               case 148 -> 208;
               case 149 -> 41;
               case 150 -> 127;
               case 151 -> 75;
               case 152 -> 200;
               case 153 -> 191;
               case 154 -> 90;
               case 155 -> 253;
               case 156 -> 22;
               case 157 -> 183;
               case 158 -> 195;
               case 159 -> 52;
               case 160 -> 202;
               case 161 -> 76;
               case 162 -> 98;
               case 163 -> 51;
               case 164 -> 33;
               case 165 -> 13;
               case 166 -> 172;
               case 167 -> 137;
               case 168 -> 55;
               case 169 -> 212;
               case 170 -> 201;
               case 171 -> 234;
               case 172 -> 192;
               case 173 -> 179;
               case 174 -> 99;
               case 175 -> 106;
               case 176 -> 57;
               case 177 -> 249;
               case 178 -> 151;
               case 179 -> 49;
               case 180 -> 66;
               case 181 -> 78;
               case 182 -> 10;
               case 183 -> 124;
               case 184 -> 149;
               case 185 -> 69;
               case 186 -> 125;
               case 187 -> 107;
               case 188 -> 197;
               case 189 -> 232;
               case 190 -> 162;
               case 191 -> 14;
               case 192 -> 167;
               case 193 -> 146;
               case 194 -> 173;
               case 195 -> 150;
               case 196 -> 217;
               case 197 -> 80;
               case 198 -> 65;
               case 199 -> 226;
               case 200 -> 244;
               case 201 -> 84;
               case 202 -> 163;
               case 203 -> 122;
               case 204 -> 225;
               case 205 -> 218;
               case 206 -> 209;
               case 207 -> 158;
               case 208 -> 166;
               case 209 -> 243;
               case 210 -> 231;
               case 211 -> 177;
               case 212 -> 229;
               case 213 -> 88;
               case 214 -> 216;
               case 215 -> 112;
               case 216 -> 54;
               case 217 -> 77;
               case 218 -> 139;
               case 219 -> 3;
               case 220 -> 190;
               case 221 -> 47;
               case 222 -> 224;
               case 223 -> 169;
               case 224 -> 205;
               case 225 -> 37;
               case 226 -> 19;
               case 227 -> 240;
               case 228 -> 16;
               case 229 -> 152;
               case 230 -> 32;
               case 231 -> 58;
               case 232 -> 144;
               case 233 -> 140;
               case 234 -> 42;
               case 235 -> 110;
               case 236 -> 203;
               case 237 -> 24;
               case 238 -> 15;
               case 239 -> 119;
               case 240 -> 147;
               case 241 -> 79;
               case 242 -> 135;
               case 243 -> 145;
               case 244 -> 126;
               case 245 -> 133;
               case 246 -> 117;
               case 247 -> 43;
               case 248 -> 235;
               case 249 -> 87;
               case 250 -> 222;
               case 251 -> 160;
               case 252 -> 223;
               case 253 -> 104;
               case 254 -> 0;
               default -> 215;
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
}
