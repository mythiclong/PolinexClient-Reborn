package me.octo.client.utils;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.File;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.time.Duration;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl {
   @NotNull
   public static lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static ConcurrentHashMap<String, lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static ConcurrentHashMap<String, lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static HttpClient lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static String[] a;
   private static String[] b;

   private lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl() {
   }

   @JvmStatic
   public static final void a(@NotNull File var0, @NotNull String var1, long var2) {
      short var10000 = ((short)((IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i()) ? 1 : 0));
      short var10002 = 473;
      short var10003 = 27734;
      Intrinsics.checkNotNullParameter(var0, "clipFile");
      boolean var4 = (var10000 != 0);
      short var10001 = 455;
      var10002 = -3361;
      Intrinsics.checkNotNullParameter(var1, "banId");
      if (var4) {
         label20:
         if (var0.exists()) {
            if (var4) {
               if (var0.length() <= 0L) {
                  break label20;
               }

               lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.put(
                  var1,
                  new lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     var0, var1, var2
                  )
               );
            }

            var10000 = 468;
            long var5 = var0.length();
            String var7 = var0.getName();
            var10001 = 18723;
            var10002 = 454;
            var10003 = 16997;
            short var10004 = 452;
            short var10005 = 9322;
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d(
               "Ban clip queued banId=" + var1 + " file=" + var7 + " size=" + var5
            );
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var1);
            return;
         }

         var10001 = 494;
         var10002 = 15139;
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c(
            "Ban clip queue skipped: file missing or empty for banId=" + var1
         );
      }
   }

   @JvmStatic
   public static final void a(@NotNull JsonObject var0) {
      Object var17 = null; // PX-FIX
      short var10000 = ((short)((IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i()) ? 1 : 0));
      short var10002 = 478;
      short var10003 = -6624;
      Intrinsics.checkNotNullParameter(var0, "json");
      boolean var1 = (var10000 != 0);
      if (var1) {
         short var10001 = 467;
         var10002 = 27936;
         JsonElement var11 = var0.get("uploadId");
         if (var11 != null) {
            String var12 = var11.getAsString();
            if (var12 != null) {
               String var2 = var12;
               if (var1) {
                  var10001 = 477;
                  var10002 = 19054;
                  JsonElement var13 = var0.get("banId");
                  if (var13 != null) {
                     String var14 = var13.getAsString();
                     if (var14 != null) {
                        String var3;
                        label42: {
                           var3 = var14;
                           if (var1) {
                              var10001 = 491;
                              var10002 = 19530;
                              JsonElement var15 = var0.get("presignedUrl");
                              if (var15 != null) {
                                 String var16 = var15.getAsString();
                                 if (var16 != null) {
                                    String var5 = var16;
                                    boolean var7 = false;
                                    var10000 = ((short)((StringsKt.isBlank(var5)) ? 1 : 0));
                                    if (var1) {
                                       var10000 = (((short)((var10000 == 0) ? 1 : 0)));
                                    }

                                    var17 =( ((Boolean)(Object)(var10000 != 0 ? var5 : null)));
                                    break label42;
                                 }
                              }
                           }

                           var17 = null;
                        }

                        String var4 =((String)( var17));
                        IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.put(
                           var3,
                           new lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                              var2, var3, var4
                           )
                        );
                        boolean var8 = var4 != null;
                        var10000 = 492;
                        var10001 = -2983;
                        var10002 = 457;
                        var10003 = 27746;
                        short var10004 = 465;
                        short var10005 = 22393;
                        lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d(
                           "Ban clip init received banId=" + var3 + " uploadId=" + var2 + " hasPresignedUrl=" + var8
                        );
                        IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var3);
                        return;
                     }
                  }
               }

               return;
            }
         }
      }
   }

   private final void a(String var1) {
      boolean var2 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i();
      if (var2) {
         lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.get(
            var1
         );
         if (var10000 != null) {
            lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = var10000;
            if (var2) {
               lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var5 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.get(
                  var1
               );
               if (var5 != null) {
                  lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var4 = var5;
                  boolean var6 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.remove(var1, var3);
                  if (var2) {
                     if (!var6) {
                        short var10001 = 453;
                        short var10002 = -8029;
                        lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c(
                           "Ban clip upload aborted: concurrent modification for banId=" + var1
                        );
                        return;
                     }

                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.remove(var1, var4);
                  }

                  IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(null);
                  return;
               }
            }

            return;
         }
      }
   }

   private final boolean a(
      lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1,
      lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var2
   ) {
      Object var7 = null; // PX-FIX
      boolean var3 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.h();
      int var10000 = ((var1.a().exists()) ? 1 : 0);
      if (!var3) {
         if ((var10000 != 0)) {
            long var11;
            var10000 = (var11 = var1.a().length() - 0L) == 0L ? 0 : (var11 < 0L ? -1 : 1);
            if (var3) {
               return (var10000 != 0);
            }

            if (var10000 > 0) {
               label32: {
                  label43: {
                     CharSequence var4 = var2.c();
                     CharSequence var6 = var4;
                     if (!var3) {
                        if (var4 == null) {
                           break label43;
                        }

                        var6 = var4;
                     }

                     var7 = StringsKt.isBlank(var6);
                     if (var3) {
                        break label32;
                     }

                     if (!((Boolean)var7)) {
                        var7 = false;
                        break label32;
                     }
                  }

                  var7 = true;
               }

               if (((Boolean)(var7))) {
                  String var8 = var1.b();
                  short var9 = 474;
                  short var10 = -14681;
                  lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c(
                     "Ban clip upload aborted: no presignedUrl for banId=" + var8
                  );
                  return false;
               }

               return this.b(var1, var2);
            }
         }

         String var5 = var1.b();
         short var10001 = 458;
         short var10002 = 9441;
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("Ban clip upload skipped: file missing or empty banId=" + var5);
         var10000 = 0;
      }

      return (var10000 != 0);
   }

   private final boolean b(
      lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1,
      lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var2
   ) {
      return false;
   }

   private final boolean c(
      lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1,
      lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var2
   ) {
      return false;
   }

   private static final Unit d(
      lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0,
      lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1
   ) {
      label16: {
         short var10000 = ((short)((IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i()) ? 1 : 0));
         String var10001 = var0.b();
         String var10002 = var1.a();
         String var4 = var0.a().getName();
         String var5 = var10002;
         String var6 = var10001;
         short var10 = 464;
         short var14 = 5134;
         short var10003 = 476;
         short var10004 = -1649;
         short var10005 = 466;
         short var10006 = -7792;
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d(
            "Ban clip upload starting banId=" + var6 + " uploadId=" + var5 + " file=" + var4
         );
         boolean var2 = (var10000 != 0);
         boolean var3 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0, var1);
         if (var2) {
            if (!var3) {
               break label16;
            }

            String var7 = var0.b();
            short var11 = 448;
            short var15 = 32164;
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("Ban clip upload complete banId=" + var7);
            var10000 = 472;
            short var12 = -23815;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "§aClipping: Ban clip upload finished. The local clip was kept."
            );
         }

         if (var2) {
            return Unit.INSTANCE;
         }
      }

      short var9 = 469;
      short var13 = -1657;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
         "§cClipping: Ban clip upload failed. The local clip was kept."
      );
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var21 = null; // PX-FIX
      String[] var5 = new String[39];
      int var3 = 0;
      String var2 = "2]\u0095©!\rÏ\u008bÚ\u0016\u0001¤\u0006éEà\u0016²»\u0002Ë-BÆý_Á7Ð\u0082ìv±\u001e3[´Ýð¢ËÚ\u007f\u0016-Ë\u00190û>§´\u009f\u008a¢\u0016\u0013\u001bç5\u008cHa\u0001×\nÜ\u001fPñù\u0003öF\b\\\u0094Ã¢MînW='\u0015\u008a÷î$\u009e:!Þ±?\u0006Ò)àÇqp\t¤sºßÁvOï\u008dñ\u0004$\u0095 \u0006h\u0090§á\u0017\u008d\u00935ËA\u008b±äÒ¬o|p/ìXKI\u0089$\u008a¥\u008bÖÎM¼\u0095ÙS«ï9Ï\u009e\u001fHÁÞ\u0096ÎÂÚVT'¾Æ$W\u001cùg¶½\u007f\näÑ^y\u008f\u0003AÀ)Ó\u0002CÛ\u0005\u009dÃe\u0088>\u0006¨£ÎF\u00ad¸;\u008f\u008b\u0003èõù\u008e\n8Ü§yIùkßrI9Ù\u0087Æã½@üï¨¸Nü\u0094\u0093l\u0099ª)\u0088u¯\u008c\u008eüyrÿ\u008ey%Nb\u0087\u001aûªiõgu\u0006\u009cïHn}i\t\u008b\u0001;õµô\u000f\u0080\u0098+d\u0019~ºZ³{C\u0086ãoH¥\u0095È\u0016\u0093\u0084fj6\u00adöI´\u0095°¹¼\u008eDhûËAp&\u0012uW\u0006{9.)2×ßo\u001fÝÖRQõ\u001eö_¢OÞ»Ë\u0018\u000e\u0086Éµ\u0005üD\u0086£{aï8\u001eè\u0015\u0080Å\"ÐC\t\u008c¨À¼\u001fV$8\u001d\u0092GbÝ¥&\u0014&?\u0012¥¢©ë\u0002#ºÛOAÇÖ\u0011Ì\u0082Ó\u009b\n\u0005\u0000qC[\rû\u00067\u0094\u0004ê×\u0083}\u0005\u009a\u0017\u0085\u0012\"\n`õÎý\u009d\u0093\u0003Òa\u0091\n¢,\u0083>\u009c\u0019Õvñx3\u0014<p\u001e\u009b'CÑ\u0081§\u0090\u0016¯\u0014·béþJ/é\u0018.fù\u008aØ\u0084MK$Òq\u008cRÛ\u0000qnè}Ì@Ì<3\u0097\u008a 2Ä\bÞ\u008d+Ô2!ò¡>K\\ï^êö?mz\u0018\"ý×¬:u\u0011\u0012\u0011\u007f\u0010@Û)\u009eð\u0099%\u0019dqU«*[à\u0001BkQz9NáÝ+\u008d¤exG\bx]æ\u0017\u0015\u0019u¡FÈ\u0007\u0006\u0006\u0013t3åm$Ka\u009bµæRì\u007ftd1¸n\u008b±Õ¼ç\u0088b\u0085<\u0019\u0094³e\u00ad¶fÝ¿\nâéÍÄ<\u0094¤\u0014\u0003\u0095]Ð\u0018\u0087¶\u009d( \u0016Ä\"Îøê\"oë4\\c^&ðîÖ\u0088\u000feÈ\u001du\u0091t}\u009e¦Îò·«o¢\td\u0014e\u001d\u001d\u001cb£©\u008f\u001eU\u0016r\u0015¼;\u0002\u0083pEç1YI)Ó>\u001eÛrnæ\\%\bÌV¸/Â¯\nÝ\u0006ón¥ÿÀ\u008f\u0011kk¾\u008f\u009f2\u009a\u00ad~Y\u0011\u0090IØ\u0017\u0005u\u001f¶ù$¦\u00110\u00123«ûÕ\u009d\u0007e¢LY-\u0002\u0081/Áü\u008dè\rô·>¼\f\bå½\u009dRf\u0000\u009e(8r\u0003¼ù\u0002ÛpNçPYe)Vzý\u0096?ñ\u007fsQ\u0010tí\u0096×¥\u009f\u009d(ôgFÉO7\u009bD\u0084}\u008f²ÈÇ7\u009d\u0001=&t\u0017:³,}\n¡Öãa\u0090òT\u000bÁ×\u001d\u0080,â\u001cÉg\tÙÈº§/\u008f×Ý6r\u009e}ÀØ`\u007f\u0010^\u0017cs\u0095\fÎ T¯\u007f#\u0093.8Ïi?";
      int var4 = "2]\u0095©!\rÏ\u008bÚ\u0016\u0001¤\u0006éEà\u0016²»\u0002Ë-BÆý_Á7Ð\u0082ìv±\u001e3[´Ýð¢ËÚ\u007f\u0016-Ë\u00190û>§´\u009f\u008a¢\u0016\u0013\u001bç5\u008cHa\u0001×\nÜ\u001fPñù\u0003öF\b\\\u0094Ã¢MînW='\u0015\u008a÷î$\u009e:!Þ±?\u0006Ò)àÇqp\t¤sºßÁvOï\u008dñ\u0004$\u0095 \u0006h\u0090§á\u0017\u008d\u00935ËA\u008b±äÒ¬o|p/ìXKI\u0089$\u008a¥\u008bÖÎM¼\u0095ÙS«ï9Ï\u009e\u001fHÁÞ\u0096ÎÂÚVT'¾Æ$W\u001cùg¶½\u007f\näÑ^y\u008f\u0003AÀ)Ó\u0002CÛ\u0005\u009dÃe\u0088>\u0006¨£ÎF\u00ad¸;\u008f\u008b\u0003èõù\u008e\n8Ü§yIùkßrI9Ù\u0087Æã½@üï¨¸Nü\u0094\u0093l\u0099ª)\u0088u¯\u008c\u008eüyrÿ\u008ey%Nb\u0087\u001aûªiõgu\u0006\u009cïHn}i\t\u008b\u0001;õµô\u000f\u0080\u0098+d\u0019~ºZ³{C\u0086ãoH¥\u0095È\u0016\u0093\u0084fj6\u00adöI´\u0095°¹¼\u008eDhûËAp&\u0012uW\u0006{9.)2×ßo\u001fÝÖRQõ\u001eö_¢OÞ»Ë\u0018\u000e\u0086Éµ\u0005üD\u0086£{aï8\u001eè\u0015\u0080Å\"ÐC\t\u008c¨À¼\u001fV$8\u001d\u0092GbÝ¥&\u0014&?\u0012¥¢©ë\u0002#ºÛOAÇÖ\u0011Ì\u0082Ó\u009b\n\u0005\u0000qC[\rû\u00067\u0094\u0004ê×\u0083}\u0005\u009a\u0017\u0085\u0012\"\n`õÎý\u009d\u0093\u0003Òa\u0091\n¢,\u0083>\u009c\u0019Õvñx3\u0014<p\u001e\u009b'CÑ\u0081§\u0090\u0016¯\u0014·béþJ/é\u0018.fù\u008aØ\u0084MK$Òq\u008cRÛ\u0000qnè}Ì@Ì<3\u0097\u008a 2Ä\bÞ\u008d+Ô2!ò¡>K\\ï^êö?mz\u0018\"ý×¬:u\u0011\u0012\u0011\u007f\u0010@Û)\u009eð\u0099%\u0019dqU«*[à\u0001BkQz9NáÝ+\u008d¤exG\bx]æ\u0017\u0015\u0019u¡FÈ\u0007\u0006\u0006\u0013t3åm$Ka\u009bµæRì\u007ftd1¸n\u008b±Õ¼ç\u0088b\u0085<\u0019\u0094³e\u00ad¶fÝ¿\nâéÍÄ<\u0094¤\u0014\u0003\u0095]Ð\u0018\u0087¶\u009d( \u0016Ä\"Îøê\"oë4\\c^&ðîÖ\u0088\u000feÈ\u001du\u0091t}\u009e¦Îò·«o¢\td\u0014e\u001d\u001d\u001cb£©\u008f\u001eU\u0016r\u0015¼;\u0002\u0083pEç1YI)Ó>\u001eÛrnæ\\%\bÌV¸/Â¯\nÝ\u0006ón¥ÿÀ\u008f\u0011kk¾\u008f\u009f2\u009a\u00ad~Y\u0011\u0090IØ\u0017\u0005u\u001f¶ù$¦\u00110\u00123«ûÕ\u009d\u0007e¢LY-\u0002\u0081/Áü\u008dè\rô·>¼\f\bå½\u009dRf\u0000\u009e(8r\u0003¼ù\u0002ÛpNçPYe)Vzý\u0096?ñ\u007fsQ\u0010tí\u0096×¥\u009f\u009d(ôgFÉO7\u009bD\u0084}\u008f²ÈÇ7\u009d\u0001=&t\u0017:³,}\n¡Öãa\u0090òT\u000bÁ×\u001d\u0080,â\u001cÉg\tÙÈº§/\u008f×Ý6r\u009e}ÀØ`\u007f\u0010^\u0017cs\u0095\fÎ T¯\u007f#\u0093.8Ïi?"
         .length();
      char var1 = '\f';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 53;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var26 = var10001.toCharArray();
               int var10004 = var26.length;
               int var6 = 0;
               byte var29 = var10000;
               var21 = var26;
               int var15 = var10004;
               byte var35;
               char[] var39;
               int var10006;
               if (var10004 <= 1) {
                  var39 = var26;
                  var35 = var10000;
                  var10006 = var6;
               } else {
                  var29 = var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var39 = var26;
                  var35 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var39[var10006] = (char)(var39[var10006] ^ var35 ^ switch (var6 % 7) {
                     case 0 -> 80;
                     case 1 -> 58;
                     case 2 -> 15;
                     case 3 -> 32;
                     case 4 -> 39;
                     case 5 -> 59;
                     default -> 33;
                  });
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var39 = var21;
                     var35 = var29;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var39 = var21;
                     var35 = var29;
                     var10006 = var6;
                  }
               }
            }

            String var31 = new String(var21).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var31;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[39];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl();
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new ConcurrentHashMap<>();
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new ConcurrentHashMap<>();
                     HttpClient var10 = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(15L)).version(Version.HTTP_1_1).build();
                     var10002 = 479;
                     short var32 = 3220;
                     Intrinsics.checkNotNullExpressionValue(var10, "build(...)");
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var10;
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

                  var2 = "ë\u009dvÓ¢g\u009d £Go|\u009cQÀ\u0081Ìa\u009fk#\u008d\u0007KÇgl\u0006\u0090°ºF\u0007*ãTÉL\u0010\u009c";
                  var4 = "ë\u009dvÓ¢g\u009d £Go|\u009cQÀ\u0081Ìa\u009fk#\u008d\u0007KÇgl\u0006\u0090°ºF\u0007*ãTÉL\u0010\u009c".length();
                  var1 = ' ';
                  var8 = -1;
            }

            var10000 = 11;
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
      int var2 = (var0 ^ 463) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 100;
            case 1 -> 53;
            case 2 -> 38;
            case 3 -> 236;
            case 4 -> 34;
            case 5 -> 106;
            case 6 -> 124;
            case 7 -> 225;
            case 8 -> 229;
            case 9 -> 44;
            case 10 -> 184;
            case 11 -> 123;
            case 12 -> 1;
            case 13 -> 83;
            case 14 -> 75;
            case 15 -> 174;
            case 16 -> 81;
            case 17 -> 149;
            case 18 -> 43;
            case 19 -> 183;
            case 20 -> 95;
            case 21 -> 166;
            case 22 -> 62;
            case 23 -> 206;
            case 24 -> 6;
            case 25 -> 22;
            case 26 -> 203;
            case 27 -> 29;
            case 28 -> 101;
            case 29 -> 234;
            case 30 -> 227;
            case 31 -> 15;
            case 32 -> 85;
            case 33 -> 248;
            case 34 -> 196;
            case 35 -> 163;
            case 36 -> 147;
            case 37 -> 168;
            case 38 -> 194;
            case 39 -> 98;
            case 40 -> 179;
            case 41 -> 138;
            case 42 -> 133;
            case 43 -> 216;
            case 44 -> 65;
            case 45 -> 162;
            case 46 -> 112;
            case 47 -> 37;
            case 48 -> 107;
            case 49 -> 74;
            case 50 -> 148;
            case 51 -> 51;
            case 52 -> 110;
            case 53 -> 56;
            case 54 -> 26;
            case 55 -> 159;
            case 56 -> 249;
            case 57 -> 8;
            case 58 -> 136;
            case 59 -> 189;
            case 60 -> 143;
            case 61 -> 199;
            case 62 -> 180;
            case 63 -> 80;
            case 64 -> 164;
            case 65 -> 119;
            case 66 -> 79;
            case 67 -> 61;
            case 68 -> 230;
            case 69 -> 93;
            case 70 -> 232;
            case 71 -> 41;
            case 72 -> 99;
            case 73 -> 226;
            case 74 -> 73;
            case 75 -> 97;
            case 76 -> 115;
            case 77 -> 144;
            case 78 -> 24;
            case 79 -> 2;
            case 80 -> 140;
            case 81 -> 152;
            case 82 -> 20;
            case 83 -> 30;
            case 84 -> 176;
            case 85 -> 254;
            case 86 -> 187;
            case 87 -> 156;
            case 88 -> 50;
            case 89 -> 48;
            case 90 -> 77;
            case 91 -> 27;
            case 92 -> 231;
            case 93 -> 190;
            case 94 -> 250;
            case 95 -> 255;
            case 96 -> 146;
            case 97 -> 12;
            case 98 -> 118;
            case 99 -> 14;
            case 100 -> 9;
            case 101 -> 167;
            case 102 -> 11;
            case 103 -> 55;
            case 104 -> 212;
            case 105 -> 130;
            case 106 -> 131;
            case 107 -> 4;
            case 108 -> 171;
            case 109 -> 172;
            case 110 -> 47;
            case 111 -> 121;
            case 112 -> 84;
            case 113 -> 116;
            case 114 -> 129;
            case 115 -> 252;
            case 116 -> 235;
            case 117 -> 16;
            case 118 -> 165;
            case 119 -> 45;
            case 120 -> 243;
            case 121 -> 21;
            case 122 -> 132;
            case 123 -> 33;
            case 124 -> 233;
            case 125 -> 40;
            case 126 -> 215;
            case 127 -> 222;
            case 128 -> 13;
            case 129 -> 193;
            case 130 -> 78;
            case 131 -> 71;
            case 132 -> 64;
            case 133 -> 70;
            case 134 -> 137;
            case 135 -> 195;
            case 136 -> 160;
            case 137 -> 239;
            case 138 -> 35;
            case 139 -> 66;
            case 140 -> 219;
            case 141 -> 211;
            case 142 -> 89;
            case 143 -> 59;
            case 144 -> 198;
            case 145 -> 161;
            case 146 -> 175;
            case 147 -> 86;
            case 148 -> 3;
            case 149 -> 63;
            case 150 -> 218;
            case 151 -> 10;
            case 152 -> 122;
            case 153 -> 105;
            case 154 -> 155;
            case 155 -> 237;
            case 156 -> 32;
            case 157 -> 247;
            case 158 -> 142;
            case 159 -> 214;
            case 160 -> 94;
            case 161 -> 205;
            case 162 -> 158;
            case 163 -> 5;
            case 164 -> 202;
            case 165 -> 87;
            case 166 -> 36;
            case 167 -> 58;
            case 168 -> 242;
            case 169 -> 68;
            case 170 -> 141;
            case 171 -> 111;
            case 172 -> 186;
            case 173 -> 102;
            case 174 -> 245;
            case 175 -> 241;
            case 176 -> 224;
            case 177 -> 19;
            case 178 -> 104;
            case 179 -> 92;
            case 180 -> 67;
            case 181 -> 240;
            case 182 -> 42;
            case 183 -> 170;
            case 184 -> 0;
            case 185 -> 213;
            case 186 -> 82;
            case 187 -> 126;
            case 188 -> 154;
            case 189 -> 253;
            case 190 -> 96;
            case 191 -> 207;
            case 192 -> 220;
            case 193 -> 182;
            case 194 -> 72;
            case 195 -> 113;
            case 196 -> 134;
            case 197 -> 76;
            case 198 -> 90;
            case 199 -> 25;
            case 200 -> 197;
            case 201 -> 46;
            case 202 -> 57;
            case 203 -> 204;
            case 204 -> 18;
            case 205 -> 120;
            case 206 -> 151;
            case 207 -> 114;
            case 208 -> 244;
            case 209 -> 7;
            case 210 -> 128;
            case 211 -> 125;
            case 212 -> 181;
            case 213 -> 177;
            case 214 -> 127;
            case 215 -> 208;
            case 216 -> 135;
            case 217 -> 54;
            case 218 -> 60;
            case 219 -> 150;
            case 220 -> 221;
            case 221 -> 109;
            case 222 -> 52;
            case 223 -> 23;
            case 224 -> 201;
            case 225 -> 153;
            case 226 -> 157;
            case 227 -> 17;
            case 228 -> 28;
            case 229 -> 178;
            case 230 -> 246;
            case 231 -> 188;
            case 232 -> 108;
            case 233 -> 217;
            case 234 -> 251;
            case 235 -> 223;
            case 236 -> 200;
            case 237 -> 191;
            case 238 -> 192;
            case 239 -> 39;
            case 240 -> 210;
            case 241 -> 49;
            case 242 -> 31;
            case 243 -> 169;
            case 244 -> 139;
            case 245 -> 88;
            case 246 -> 117;
            case 247 -> 91;
            case 248 -> 69;
            case 249 -> 145;
            case 250 -> 228;
            case 251 -> 185;
            case 252 -> 103;
            case 253 -> 173;
            case 254 -> 238;
            default -> 209;
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

   private static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
   public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI p0, String p1, String p2, String p3, int m, Object mk) {
      if ((m & 1) != 0) {
         p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }
      if ((m & 2) != 0) {
         p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }
      if ((m & 4) != 0) {
         p3 = p0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }
      return new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(p1, p2, p3);
   }

      @NotNull
      private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @Nullable
      private final String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         @NotNull String var1, @NotNull String var2, @Nullable String var3
      ) {
         short var10001 = 8853;
         short var10002 = 4474;
         Intrinsics.checkNotNullParameter(var1, "uploadId");
         var10001 = 8848;
         var10002 = -25359;
         Intrinsics.checkNotNullParameter(var2, "banId");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      }

      @NotNull
      public final String a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final String b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final String c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final String d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final String e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final String f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         @NotNull String var1, @NotNull String var2, @Nullable String var3
      ) {
         short var10001 = 8854;
         short var10002 = 2377;
         Intrinsics.checkNotNullParameter(var1, "uploadId");
         var10001 = 8852;
         var10002 = 18495;
         Intrinsics.checkNotNullParameter(var2, "banId");
         return new lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 8850;
         String var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         String var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         String var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -32614;
         short var10002 = 8855;
         short var10003 = -30451;
         short var10004 = 8851;
         short var10005 = -27402;
         return "UploadInit(uploadId=" + var3 + ", banId=" + var2 + ", presignedUrl=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var2 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         int var10000 = ((IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i()) ? 1 : 0);
         var2 = var2 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
         boolean var1 = (var10000 != 0);
         var10000 = var2 * 31;
         String var10001 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if (var1) {
            if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == null) {
               return var10000 + 0;
            }

            var10001 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         return var10000 + var10001.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         boolean var2 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.h();
         Object var10000 = this;
         if (!var2) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (!var2) {
            if (!(
               var10000 instanceof lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
         boolean var4 = Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         );
         if (!var2) {
            if (!var4) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
         }

         if (!var2) {
            if (!var4) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            );
         }

         if (!var2) {
            if (!var4) {
               return false;
            }

            var4 = true;
         }

         return var4;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[7];
         int var3 = 0;
         String var2 = "Ì%Nb\u0010\u0096J\u0012\b\u0003§Ëf`ô\u0087\u008f\u0005úê\u007f\u008eq\bE\u0095\u007ft6T\u008eJ\u0014&\t7ç?&¯\u000e?v\\\u0018êø\u0000\\\u0086X\u0005j";
         int var4 = "Ì%Nb\u0010\u0096J\u0012\b\u0003§Ëf`ô\u0087\u008f\u0005úê\u007f\u008eq\bE\u0095\u007ft6T\u008eJ\u0014&\t7ç?&¯\u000e?v\\\u0018êø\u0000\\\u0086X\u0005j"
            .length();
         char var1 = '\b';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 39;
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
                        case 0 -> 36;
                        case 1 -> 8;
                        case 2 -> 39;
                        case 3 -> 21;
                        case 4 -> 126;
                        case 5 -> 93;
                        default -> 64;
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
                        b = new String[7];
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

                     var2 = "\u0014ª\u000bä\u0013ß¾ý\u000e\u0001áÕªU(\u0005Ì´\u0089u\u009f";
                     var4 = "\u0014ª\u000bä\u0013ß¾ý\u000e\u0001áÕªU(\u0005Ì´\u0089u\u009f".length();
                     var1 = 15;
                     var8 = -1;
               }

               var10000 = 124;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
   } // PX-FIX end pxClinit
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 8854) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 225;
               case 1 -> 98;
               case 2 -> 168;
               case 3 -> 207;
               case 4 -> 254;
               case 5 -> 153;
               case 6 -> 94;
               case 7 -> 29;
               case 8 -> 84;
               case 9 -> 0;
               case 10 -> 163;
               case 11 -> 123;
               case 12 -> 75;
               case 13 -> 186;
               case 14 -> 175;
               case 15 -> 15;
               case 16 -> 28;
               case 17 -> 191;
               case 18 -> 64;
               case 19 -> 47;
               case 20 -> 141;
               case 21 -> 108;
               case 22 -> 91;
               case 23 -> 116;
               case 24 -> 40;
               case 25 -> 223;
               case 26 -> 86;
               case 27 -> 159;
               case 28 -> 110;
               case 29 -> 245;
               case 30 -> 172;
               case 31 -> 208;
               case 32 -> 12;
               case 33 -> 151;
               case 34 -> 11;
               case 35 -> 231;
               case 36 -> 198;
               case 37 -> 42;
               case 38 -> 193;
               case 39 -> 20;
               case 40 -> 101;
               case 41 -> 16;
               case 42 -> 117;
               case 43 -> 155;
               case 44 -> 3;
               case 45 -> 232;
               case 46 -> 53;
               case 47 -> 92;
               case 48 -> 162;
               case 49 -> 180;
               case 50 -> 224;
               case 51 -> 178;
               case 52 -> 112;
               case 53 -> 187;
               case 54 -> 8;
               case 55 -> 188;
               case 56 -> 209;
               case 57 -> 89;
               case 58 -> 165;
               case 59 -> 5;
               case 60 -> 90;
               case 61 -> 228;
               case 62 -> 132;
               case 63 -> 138;
               case 64 -> 192;
               case 65 -> 242;
               case 66 -> 102;
               case 67 -> 19;
               case 68 -> 212;
               case 69 -> 249;
               case 70 -> 71;
               case 71 -> 63;
               case 72 -> 200;
               case 73 -> 9;
               case 74 -> 135;
               case 75 -> 119;
               case 76 -> 150;
               case 77 -> 87;
               case 78 -> 190;
               case 79 -> 226;
               case 80 -> 176;
               case 81 -> 21;
               case 82 -> 24;
               case 83 -> 109;
               case 84 -> 124;
               case 85 -> 73;
               case 86 -> 166;
               case 87 -> 82;
               case 88 -> 173;
               case 89 -> 213;
               case 90 -> 14;
               case 91 -> 2;
               case 92 -> 1;
               case 93 -> 211;
               case 94 -> 128;
               case 95 -> 199;
               case 96 -> 70;
               case 97 -> 222;
               case 98 -> 243;
               case 99 -> 216;
               case 100 -> 206;
               case 101 -> 250;
               case 102 -> 26;
               case 103 -> 238;
               case 104 -> 240;
               case 105 -> 6;
               case 106 -> 118;
               case 107 -> 23;
               case 108 -> 107;
               case 109 -> 134;
               case 110 -> 60;
               case 111 -> 152;
               case 112 -> 145;
               case 113 -> 167;
               case 114 -> 115;
               case 115 -> 189;
               case 116 -> 229;
               case 117 -> 52;
               case 118 -> 67;
               case 119 -> 34;
               case 120 -> 120;
               case 121 -> 46;
               case 122 -> 133;
               case 123 -> 236;
               case 124 -> 104;
               case 125 -> 181;
               case 126 -> 201;
               case 127 -> 215;
               case 128 -> 140;
               case 129 -> 114;
               case 130 -> 13;
               case 131 -> 68;
               case 132 -> 85;
               case 133 -> 131;
               case 134 -> 100;
               case 135 -> 247;
               case 136 -> 93;
               case 137 -> 99;
               case 138 -> 185;
               case 139 -> 56;
               case 140 -> 83;
               case 141 -> 230;
               case 142 -> 156;
               case 143 -> 146;
               case 144 -> 49;
               case 145 -> 241;
               case 146 -> 97;
               case 147 -> 113;
               case 148 -> 251;
               case 149 -> 217;
               case 150 -> 76;
               case 151 -> 174;
               case 152 -> 157;
               case 153 -> 96;
               case 154 -> 139;
               case 155 -> 50;
               case 156 -> 103;
               case 157 -> 158;
               case 158 -> 10;
               case 159 -> 30;
               case 160 -> 79;
               case 161 -> 160;
               case 162 -> 80;
               case 163 -> 248;
               case 164 -> 55;
               case 165 -> 210;
               case 166 -> 154;
               case 167 -> 237;
               case 168 -> 69;
               case 169 -> 203;
               case 170 -> 148;
               case 171 -> 121;
               case 172 -> 43;
               case 173 -> 126;
               case 174 -> 221;
               case 175 -> 65;
               case 176 -> 57;
               case 177 -> 246;
               case 178 -> 74;
               case 179 -> 111;
               case 180 -> 36;
               case 181 -> 48;
               case 182 -> 33;
               case 183 -> 177;
               case 184 -> 137;
               case 185 -> 233;
               case 186 -> 59;
               case 187 -> 45;
               case 188 -> 41;
               case 189 -> 244;
               case 190 -> 220;
               case 191 -> 95;
               case 192 -> 18;
               case 193 -> 37;
               case 194 -> 136;
               case 195 -> 182;
               case 196 -> 7;
               case 197 -> 147;
               case 198 -> 149;
               case 199 -> 130;
               case 200 -> 234;
               case 201 -> 197;
               case 202 -> 105;
               case 203 -> 78;
               case 204 -> 195;
               case 205 -> 25;
               case 206 -> 4;
               case 207 -> 143;
               case 208 -> 184;
               case 209 -> 88;
               case 210 -> 129;
               case 211 -> 235;
               case 212 -> 171;
               case 213 -> 81;
               case 214 -> 239;
               case 215 -> 204;
               case 216 -> 77;
               case 217 -> 66;
               case 218 -> 194;
               case 219 -> 22;
               case 220 -> 17;
               case 221 -> 35;
               case 222 -> 252;
               case 223 -> 219;
               case 224 -> 122;
               case 225 -> 170;
               case 226 -> 72;
               case 227 -> 255;
               case 228 -> 202;
               case 229 -> 183;
               case 230 -> 58;
               case 231 -> 51;
               case 232 -> 106;
               case 233 -> 179;
               case 234 -> 196;
               case 235 -> 205;
               case 236 -> 44;
               case 237 -> 32;
               case 238 -> 39;
               case 239 -> 38;
               case 240 -> 214;
               case 241 -> 31;
               case 242 -> 169;
               case 243 -> 161;
               case 244 -> 61;
               case 245 -> 54;
               case 246 -> 125;
               case 247 -> 127;
               case 248 -> 253;
               case 249 -> 164;
               case 250 -> 218;
               case 251 -> 227;
               case 252 -> 62;
               case 253 -> 144;
               case 254 -> 142;
               default -> 27;
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

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
   public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll p0, File p1, String p2, long p3, int m, Object mk) {
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

      @NotNull
      private final File IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(@NotNull File var1, @NotNull String var2, long var3) {
         short var10001 = 2918;
         short var10002 = 14918;
         Intrinsics.checkNotNullParameter(var1, "file");
         var10001 = 2916;
         var10002 = 10850;
         Intrinsics.checkNotNullParameter(var2, "banId");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      }

      @NotNull
      public final File a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final String b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final long c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final File d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final String e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final long f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         @NotNull File var1, @NotNull String var2, long var3
      ) {
         short var10001 = 2913;
         short var10002 = -6669;
         Intrinsics.checkNotNullParameter(var1, "file");
         var10001 = 2917;
         var10002 = -30483;
         Intrinsics.checkNotNullParameter(var2, "banId");
         return new lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 2912;
         long var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         String var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         File var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -24954;
         short var10002 = 2915;
         short var10003 = -13452;
         short var10004 = 2914;
         short var10005 = -21526;
         return "PendingClip(file=" + var4 + ", banId=" + var3 + ", banTimestamp=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         var1 = var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
         return var1 * 31 + Long.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         boolean var2 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i();
         Object var10000 = this;
         if (var2) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2) {
            if (!(
               var10000 instanceof lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         int var4 = ((Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )) ? 1 : 0);
         if (var2) {
            if ((var4 == 0)) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )) ? 1 : 0);
         }

         if (var2) {
            if ((var4 == 0)) {
               return false;
            }

            long var5;
            var4 = (
                     var5 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        - var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                  )
                  == 0L
               ? 0
               : (var5 < 0L ? -1 : 1);
         }

         if (var2) {
            if ((var4 != 0)) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[7];
         int var3 = 0;
         String var2 = "\u007fo65¸<\fÅð\u0017ú:[;\u000fÐÐ\u0004?\u001fÌ·\u000fU§\u008cÄe\u009d^¢|\nG\u0089c43\bá\u0089\u001a\u0001·8\tø\u0005ý\u008b\u0012\u00001";
         int var4 = "\u007fo65¸<\fÅð\u0017ú:[;\u000fÐÐ\u0004?\u001fÌ·\u000fU§\u008cÄe\u009d^¢|\nG\u0089c43\bá\u0089\u001a\u0001·8\tø\u0005ý\u008b\u0012\u00001"
            .length();
         char var1 = 17;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 40;
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
                        case 0 -> 100;
                        case 1 -> 89;
                        case 2 -> 76;
                        case 3 -> 115;
                        case 4 -> 16;
                        case 5 -> 95;
                        default -> 23;
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
                        b = new String[7];
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

                     var2 = "z#\u0084s\u0085\u0004ÜòÖl";
                     var4 = "z#\u0084s\u0085\u0004ÜòÖl".length();
                     var1 = 5;
                     var8 = -1;
               }

               var10000 = 10;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
   } // PX-FIX end pxClinit
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 2912) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 18;
               case 1 -> 85;
               case 2 -> 235;
               case 3 -> 66;
               case 4 -> 229;
               case 5 -> 115;
               case 6 -> 242;
               case 7 -> 160;
               case 8 -> 177;
               case 9 -> 21;
               case 10 -> 27;
               case 11 -> 118;
               case 12 -> 203;
               case 13 -> 153;
               case 14 -> 77;
               case 15 -> 163;
               case 16 -> 60;
               case 17 -> 151;
               case 18 -> 58;
               case 19 -> 30;
               case 20 -> 119;
               case 21 -> 65;
               case 22 -> 23;
               case 23 -> 7;
               case 24 -> 122;
               case 25 -> 181;
               case 26 -> 120;
               case 27 -> 161;
               case 28 -> 14;
               case 29 -> 148;
               case 30 -> 39;
               case 31 -> 183;
               case 32 -> 149;
               case 33 -> 4;
               case 34 -> 96;
               case 35 -> 159;
               case 36 -> 175;
               case 37 -> 166;
               case 38 -> 195;
               case 39 -> 74;
               case 40 -> 134;
               case 41 -> 239;
               case 42 -> 218;
               case 43 -> 234;
               case 44 -> 173;
               case 45 -> 204;
               case 46 -> 19;
               case 47 -> 50;
               case 48 -> 147;
               case 49 -> 193;
               case 50 -> 157;
               case 51 -> 35;
               case 52 -> 137;
               case 53 -> 42;
               case 54 -> 29;
               case 55 -> 83;
               case 56 -> 125;
               case 57 -> 205;
               case 58 -> 155;
               case 59 -> 109;
               case 60 -> 81;
               case 61 -> 189;
               case 62 -> 214;
               case 63 -> 13;
               case 64 -> 64;
               case 65 -> 72;
               case 66 -> 224;
               case 67 -> 33;
               case 68 -> 101;
               case 69 -> 8;
               case 70 -> 5;
               case 71 -> 63;
               case 72 -> 152;
               case 73 -> 103;
               case 74 -> 43;
               case 75 -> 82;
               case 76 -> 123;
               case 77 -> 34;
               case 78 -> 144;
               case 79 -> 202;
               case 80 -> 190;
               case 81 -> 182;
               case 82 -> 59;
               case 83 -> 164;
               case 84 -> 89;
               case 85 -> 116;
               case 86 -> 62;
               case 87 -> 225;
               case 88 -> 237;
               case 89 -> 255;
               case 90 -> 233;
               case 91 -> 26;
               case 92 -> 126;
               case 93 -> 221;
               case 94 -> 108;
               case 95 -> 154;
               case 96 -> 176;
               case 97 -> 124;
               case 98 -> 201;
               case 99 -> 254;
               case 100 -> 87;
               case 101 -> 73;
               case 102 -> 170;
               case 103 -> 216;
               case 104 -> 93;
               case 105 -> 247;
               case 106 -> 69;
               case 107 -> 68;
               case 108 -> 53;
               case 109 -> 16;
               case 110 -> 174;
               case 111 -> 54;
               case 112 -> 212;
               case 113 -> 200;
               case 114 -> 248;
               case 115 -> 222;
               case 116 -> 2;
               case 117 -> 98;
               case 118 -> 6;
               case 119 -> 48;
               case 120 -> 220;
               case 121 -> 11;
               case 122 -> 104;
               case 123 -> 25;
               case 124 -> 140;
               case 125 -> 211;
               case 126 -> 231;
               case 127 -> 196;
               case 128 -> 76;
               case 129 -> 245;
               case 130 -> 121;
               case 131 -> 208;
               case 132 -> 252;
               case 133 -> 184;
               case 134 -> 61;
               case 135 -> 169;
               case 136 -> 139;
               case 137 -> 198;
               case 138 -> 167;
               case 139 -> 86;
               case 140 -> 24;
               case 141 -> 3;
               case 142 -> 49;
               case 143 -> 95;
               case 144 -> 99;
               case 145 -> 186;
               case 146 -> 102;
               case 147 -> 107;
               case 148 -> 44;
               case 149 -> 117;
               case 150 -> 230;
               case 151 -> 100;
               case 152 -> 132;
               case 153 -> 188;
               case 154 -> 192;
               case 155 -> 112;
               case 156 -> 111;
               case 157 -> 197;
               case 158 -> 46;
               case 159 -> 129;
               case 160 -> 226;
               case 161 -> 36;
               case 162 -> 207;
               case 163 -> 210;
               case 164 -> 219;
               case 165 -> 70;
               case 166 -> 228;
               case 167 -> 131;
               case 168 -> 127;
               case 169 -> 12;
               case 170 -> 84;
               case 171 -> 240;
               case 172 -> 232;
               case 173 -> 243;
               case 174 -> 45;
               case 175 -> 41;
               case 176 -> 97;
               case 177 -> 143;
               case 178 -> 114;
               case 179 -> 146;
               case 180 -> 15;
               case 181 -> 105;
               case 182 -> 191;
               case 183 -> 227;
               case 184 -> 47;
               case 185 -> 253;
               case 186 -> 110;
               case 187 -> 209;
               case 188 -> 128;
               case 189 -> 158;
               case 190 -> 130;
               case 191 -> 206;
               case 192 -> 165;
               case 193 -> 10;
               case 194 -> 156;
               case 195 -> 52;
               case 196 -> 215;
               case 197 -> 142;
               case 198 -> 213;
               case 199 -> 91;
               case 200 -> 40;
               case 201 -> 162;
               case 202 -> 1;
               case 203 -> 31;
               case 204 -> 217;
               case 205 -> 20;
               case 206 -> 244;
               case 207 -> 178;
               case 208 -> 79;
               case 209 -> 88;
               case 210 -> 0;
               case 211 -> 199;
               case 212 -> 179;
               case 213 -> 106;
               case 214 -> 9;
               case 215 -> 38;
               case 216 -> 78;
               case 217 -> 172;
               case 218 -> 187;
               case 219 -> 67;
               case 220 -> 75;
               case 221 -> 92;
               case 222 -> 56;
               case 223 -> 180;
               case 224 -> 141;
               case 225 -> 241;
               case 226 -> 55;
               case 227 -> 113;
               case 228 -> 246;
               case 229 -> 80;
               case 230 -> 236;
               case 231 -> 17;
               case 232 -> 145;
               case 233 -> 57;
               case 234 -> 135;
               case 235 -> 171;
               case 236 -> 194;
               case 237 -> 249;
               case 238 -> 150;
               case 239 -> 37;
               case 240 -> 238;
               case 241 -> 250;
               case 242 -> 133;
               case 243 -> 223;
               case 244 -> 32;
               case 245 -> 22;
               case 246 -> 94;
               case 247 -> 251;
               case 248 -> 138;
               case 249 -> 71;
               case 250 -> 136;
               case 251 -> 28;
               case 252 -> 168;
               case 253 -> 90;
               case 254 -> 185;
               default -> 51;
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
