package me.octo.client.utils;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

public final class lIlIlllllllIIlIlIlllIIllIlllllIlllllllllIIlIlllIlIlIllIlIlIIlIlIIIllllllIIIlIIllllIIl {
   @NotNull
   public static lIlIlllllllIIlIlIlllIIllIlllllIlllllllllIIlIlllIlIlIllIlIlIIlIlIIIllllllIIIlIIllllIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Map<String, String> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static List<String> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static List<String> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static Regex IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static Regex IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static Regex IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private static Regex lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private static Map<String, String> IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static String[] a;
   private static String[] b;

   private lIlIlllllllIIlIlIlllIIllIlllllIlllllllllIIlIlllIlIlIllIlIlIIlIlIIIllllllIIIlIIllllIIl() {
   }

   @NotNull
   public final String a(@NotNull String var1) {
      String var2;
      String var3;
      label50: {
         short var10001 = -2875;
         short var10002 = -27593;
         Intrinsics.checkNotNullParameter(var1, "displayName");
         String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
         var3 = this.c(var1);
         var2 = var10000;
         var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.get(var3);
         String var23 = var10000;
         if (var2 != null) {
            if (var10000 != null) {
               String var11 = var10000;
               boolean var14 = false;
               return var11;
            }

            if (var2 == null) {
               break label50;
            }

            var10000 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.get(var3);
            var23 = var10000;
         }

         if (var23 != null) {
            String var4 = var10000;
            boolean var5 = false;
            return var4;
         }
      }

      MatchResult var18 = (IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll).find( var3, 0);
      MatchResult var24 = var18;
      if (var2 != null) {
         if (var18 != null) {
            MatchResult var10 = var18;
            boolean var13 = false;
            String var21 = ((String)var10.getGroupValues().get(1)).toUpperCase(Locale.ROOT);
            short var28 = -2880;
            short var30 = 2030;
            Intrinsics.checkNotNullExpressionValue(var21, "toUpperCase(...)");
            String var15 = var21;
            String var22 = ((String)var10.getGroupValues().get(2)).toUpperCase(Locale.ROOT);
            var28 = -2841;
            var30 = -14395;
            Intrinsics.checkNotNullExpressionValue(var22, "toUpperCase(...)");
            String var16 = var22;
            var30 = -2847;
            short var10004 = -16036;
            return var15 + "_" + var16 + "_GEM";
         }

         if (var2 == null) {
            return this.d(var3);
         }

         var18 = (lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll).find( var3, 0);
         var24 = var18;
      }

      if (var24 != null) {
         MatchResult var9 = var18;
         boolean var12 = false;
         String var6 = StringsKt.trim((String & CharSequence)var9.getGroupValues().get(1)).toString();
         short var26 = -2836;
         short var10003 = -8909;
         String var19 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.get(var6 + " Shard");
         if (var2 != null) {
            if (var19 != null) {
               String var7 = var19;
               boolean var8 = false;
               return var7;
            }

            String var20 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d(var6);
            short var25 = -2848;
            var26 = 8128;
            var19 = "SHARD_" + var20;
         }

         return var19;
      } else {
         return this.d(var3);
      }
   }

   @NotNull
   public final String b(@NotNull String var1) {
      short var10001 = -2851;
      short var10002 = 25864;
      Intrinsics.checkNotNullParameter(var1, "shardName");
      String var2 = StringsKt.trim(var1).toString();
      var10002 = -2864;
      short var10003 = 31713;
      return this.a(var2 + " Shard");
   }

   private final String c(String var1) {
      String var11;
      label20: {
         var11 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
         CharSequence var4 = StringsKt.trim(
               IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a(var1)
            )
            .toString();
         Regex var5 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         String var6 = " ";
         String var3 = var5.replace(var4, var6);
         String var2 = var11;
         if (var2 != null) {
            MatchResult var10 = (IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI).find( var3, 0);
            if (var10 != null) {
               var11 = var10.getValue();
               if (var2 == null) {
                  return var11;
               }

               if (var11 != null) {
                  break label20;
               }
            }
         }

         var11 = var3;
      }

      CharSequence var7 = StringsKt.trim(var11).toString();
      Regex var8 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      String var9 = " ";
      return var8.replace(var7, var9);
   }

   private final String d(String var1) {
      String var10000 = var1.toUpperCase(Locale.ROOT);
      short var10002 = -2841;
      short var10003 = -14395;
      Intrinsics.checkNotNullExpressionValue(var10000, "toUpperCase(...)");
      CharSequence var2 = var10000;
      Regex var3 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      String var4 = "_";
      var2 = var3.replace(var2, var4);
      var10002 = -2858;
      var10003 = 2303;
      var3 = new Regex("[^A-Z0-9_;:-]");
      var4 = "";
      return var3.replace(var2, var4);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var31 = null; // PX-FIX
      String[] var5 = new String[62];
      int var3 = 0;
      String var2 = "ì>ÝJÌ/tf-\u009eÎ\b4Æ\u008e\u008a°Ø0YÓ¸øTO4\u0011\u0005°Ìö\u0086\u0018\r$\u00817\bX$ô>\u0082kº[ü\u0006\u009fÍA\u0091\u009e\u0095\u0007sole\u0080¤ë\u0007øwjð\u008bo7\u0005p¿>¬ê\nTÐË\u009aQ%B»¡\u000b\bZÑ\u0086<\u009a&õo\u000b\u0016NçdO\u0091¸õLñÅ\u000b(åÃ6\u0097\u0083°H\u009a¾Å\u0087\u008d#\u0013¦¾ãèôQà\u000bm\u00ad_så\u009d\u0098Íh¼¹³\u0085^\u000fm©,ï\u0095Õ\u0004O\u0003\u001bf\u0018¨¹9µf¯Ã\\xÚp<\u0000§ fê·å[Ã´V^wØÁÜ\u0014LåE\u0090\u0004n~Î\t\u00adù\nS\u0080f:+\u0004Òh\u0097\u0010oÊçB#êÄ±n¿RøÕ^j\u008b)üësÂë\u0004Ûäý\b\u0006Í2\"¥2\u0096sRÿ0\u0086áÚÐ\u0095'vô\nÂe¾Oó\u008bËø\u008ac\u0004µ²43\bïö\u0010ÜL>+h\u0010\u0003Ú\u0092\u0017C£¾Å1½°\u001c«Z\u008b2\u000fró¾ékÉQ\u0081<:§¡ÝDF\n\u009a£=ã%\u009d.Þêa\t;èF´\u007f¾¼\u0006\u0004\u0007\u0097\u0018A;\u0096B-\u000b\u0084¡\r\u009cÉôJéªwÂ\u0006ÙÅ\u0016;$1\u0004ªZÏç\bèÃêãW\u0002æR\u0014Ö©\t@ÑYÙÖ\u001enÝ\u0016Ò1}&¢,^8\rø×3üË}\u009f\u009b\u009f\u000bÃ\u008e\u0002\u000f¼\u0007´þÌ¤\u0084F\u008eØå¤7æ\u008d\bæÕÈ9\u0091jÿW\u0004\\õ¬¢\n¤\u0002<[}\u00839\u0013\u008b\u0016\u0004\u0080®\u00adJ\u0006¢JE¯!\u0086\u0004\u0091\u0084\b\u0006\u0007Òµ\u0097$äÒ\u0016\u0005\u0007\u0091\u0013oø\u0006ÚòJ¸Àd\u0007zÕ:«\u0080æw\f\u0082h\u0087\u0092þ(×\u0013á\u0094dï\u000fÙ`8\u0016Y½2>ug\u009d_Ï\u009b \rP\u008c\u0099\u00ad\u0089\u0094Êsaræ|s\u0010\u0095©@y\u0019nõ|X\u008a\u009dú\u000e\u0086?©\u000f|\u0094¬\u008cÏêä\u008f\u008báb\u008b4\u0005[\u0011¸-µ\u001b.íx~ëÞ\u009bR\u0000ßì\u0001z\u0003#ÈÅ\u0014Å\u0012K3\u009d3T\u009f«\u001cOè êhy°ç\u0018E\nEën\u009aí5\f+v\u001d\u0004pÖ¢\u0086\u0006\\\u0003®Íf¤\u000fy9,=ÛØb\u0092vòÚåÔÊõ\f¥)Wç\u0003\bxN\u001eo\u009e\u0091\u0004y}\u0083ó\u0005X\rËº»\u000fy²Ì\u0094pf\u0016\u0083ÐÐ)©YEò\u000ba\u0097\t_\u0092ö\u0003\u0019;l+\b\u00adT\u0007¢_ò£ß\t¬\u009b\u0089\u000f\u0015\u000f\nN\u001d\fÃ³æ.\u00832ýã|R\u009b\u0012\bvþ\u009fÕÌcUu\nÓÐ4\u0089_ôÑÓ\u0011Ä\u0005\u0085\tæ:\u001e";
      int var4 = "ì>ÝJÌ/tf-\u009eÎ\b4Æ\u008e\u008a°Ø0YÓ¸øTO4\u0011\u0005°Ìö\u0086\u0018\r$\u00817\bX$ô>\u0082kº[ü\u0006\u009fÍA\u0091\u009e\u0095\u0007sole\u0080¤ë\u0007øwjð\u008bo7\u0005p¿>¬ê\nTÐË\u009aQ%B»¡\u000b\bZÑ\u0086<\u009a&õo\u000b\u0016NçdO\u0091¸õLñÅ\u000b(åÃ6\u0097\u0083°H\u009a¾Å\u0087\u008d#\u0013¦¾ãèôQà\u000bm\u00ad_så\u009d\u0098Íh¼¹³\u0085^\u000fm©,ï\u0095Õ\u0004O\u0003\u001bf\u0018¨¹9µf¯Ã\\xÚp<\u0000§ fê·å[Ã´V^wØÁÜ\u0014LåE\u0090\u0004n~Î\t\u00adù\nS\u0080f:+\u0004Òh\u0097\u0010oÊçB#êÄ±n¿RøÕ^j\u008b)üësÂë\u0004Ûäý\b\u0006Í2\"¥2\u0096sRÿ0\u0086áÚÐ\u0095'vô\nÂe¾Oó\u008bËø\u008ac\u0004µ²43\bïö\u0010ÜL>+h\u0010\u0003Ú\u0092\u0017C£¾Å1½°\u001c«Z\u008b2\u000fró¾ékÉQ\u0081<:§¡ÝDF\n\u009a£=ã%\u009d.Þêa\t;èF´\u007f¾¼\u0006\u0004\u0007\u0097\u0018A;\u0096B-\u000b\u0084¡\r\u009cÉôJéªwÂ\u0006ÙÅ\u0016;$1\u0004ªZÏç\bèÃêãW\u0002æR\u0014Ö©\t@ÑYÙÖ\u001enÝ\u0016Ò1}&¢,^8\rø×3üË}\u009f\u009b\u009f\u000bÃ\u008e\u0002\u000f¼\u0007´þÌ¤\u0084F\u008eØå¤7æ\u008d\bæÕÈ9\u0091jÿW\u0004\\õ¬¢\n¤\u0002<[}\u00839\u0013\u008b\u0016\u0004\u0080®\u00adJ\u0006¢JE¯!\u0086\u0004\u0091\u0084\b\u0006\u0007Òµ\u0097$äÒ\u0016\u0005\u0007\u0091\u0013oø\u0006ÚòJ¸Àd\u0007zÕ:«\u0080æw\f\u0082h\u0087\u0092þ(×\u0013á\u0094dï\u000fÙ`8\u0016Y½2>ug\u009d_Ï\u009b \rP\u008c\u0099\u00ad\u0089\u0094Êsaræ|s\u0010\u0095©@y\u0019nõ|X\u008a\u009dú\u000e\u0086?©\u000f|\u0094¬\u008cÏêä\u008f\u008báb\u008b4\u0005[\u0011¸-µ\u001b.íx~ëÞ\u009bR\u0000ßì\u0001z\u0003#ÈÅ\u0014Å\u0012K3\u009d3T\u009f«\u001cOè êhy°ç\u0018E\nEën\u009aí5\f+v\u001d\u0004pÖ¢\u0086\u0006\\\u0003®Íf¤\u000fy9,=ÛØb\u0092vòÚåÔÊõ\f¥)Wç\u0003\bxN\u001eo\u009e\u0091\u0004y}\u0083ó\u0005X\rËº»\u000fy²Ì\u0094pf\u0016\u0083ÐÐ)©YEò\u000ba\u0097\t_\u0092ö\u0003\u0019;l+\b\u00adT\u0007¢_ò£ß\t¬\u009b\u0089\u000f\u0015\u000f\nN\u001d\fÃ³æ.\u00832ýã|R\u009b\u0012\bvþ\u009fÕÌcUu\nÓÐ4\u0089_ôÑÓ\u0011Ä\u0005\u0085\tæ:\u001e"
         .length();
      char var1 = 27;
      int var15 = -1;

      label67:
      while (true) {
         byte var10000 = 86;
         String var10001 = var2.substring(++var15, var15 + var1);
         short var10002 = -1;

         while (true) {
            label62: {
               char[] var72 = var10001.toCharArray();
               int var10004 = var72.length;
               int var6 = 0;
               byte var75 = var10000;
               var31 = var72;
               int var24 = var10004;
               byte var132;
               char[] var153;
               int var10006;
               if (var10004 <= 1) {
                  var153 = var72;
                  var132 = var10000;
                  var10006 = var6;
               } else {
                  var75 = var10000;
                  var24 = var10004;
                  if (var10004 <= var6) {
                     break label62;
                  }

                  var153 = var72;
                  var132 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var153[var10006] = (char)(var153[var10006] ^ var132 ^ switch (var6 % 7) {
                     case 0 -> 70;
                     case 1 -> 99;
                     case 2 -> 9;
                     case 3 -> 78;
                     case 4 -> 35;
                     case 5 -> 15;
                     default -> 34;
                  });
                  var6++;
                  if (var75 == 0) {
                     var10006 = var75;
                     var153 = var31;
                     var132 = var75;
                  } else {
                     if (var24 <= var6) {
                        break;
                     }

                     var153 = var31;
                     var132 = var75;
                     var10006 = var6;
                  }
               }
            }

            String var77 = new String(var31).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var77;
                  if ((var15 += var1) >= var4) {
                     a = var5;
                     b = new String[62];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIlIlllllllIIlIlIlllIIllIlllllIlllllllllIIlIlllIlIlIllIlIlIIlIlIIIllllllIIIlIIllllIIl();
                     Pair[] var7 = new Pair[15];
                     var10002 = -2834;
                     short var78 = -29646;
                     short var79 = -2830;
                     short var136 = 30538;
                     var7[0] = TuplesKt.to("Mithril", "MITHRIL_ORE");
                     var10002 = -2856;
                     short var80 = 29311;
                     short var81 = -2838;
                     var136 = 13028;
                     var7[1] = TuplesKt.to("Titanium", "TITANIUM_ORE");
                     var10002 = -2879;
                     short var82 = 3844;
                     short var83 = -2873;
                     var136 = -16853;
                     var7[2] = TuplesKt.to("Tungsten", "TUNGSTEN");
                     var10002 = -2820;
                     short var84 = -6739;
                     short var85 = -2866;
                     var136 = -8159;
                     var7[3] = TuplesKt.to("Umber", "UMBER");
                     var10002 = -2829;
                     short var86 = 31486;
                     short var87 = -2852;
                     var136 = -9414;
                     var7[4] = TuplesKt.to("Glacite", "GLACITE");
                     var10002 = -2850;
                     short var88 = 4058;
                     short var89 = -2827;
                     var136 = 10255;
                     var7[5] = TuplesKt.to("Hard Stone", "HARD_STONE");
                     var10002 = -2857;
                     short var90 = 28415;
                     short var91 = -2845;
                     var136 = 14945;
                     var7[6] = TuplesKt.to("Enchanted Hard Stone", "ENCHANTED_HARD_STONE");
                     var10002 = -2842;
                     short var92 = -16583;
                     short var93 = -2839;
                     var136 = 12475;
                     var7[7] = TuplesKt.to("Refined Diamond", "REFINED_DIAMOND");
                     var10002 = -2859;
                     short var94 = -27075;
                     short var95 = -2817;
                     var136 = 5897;
                     var7[8] = TuplesKt.to("Refined Mineral", "REFINED_MINERAL");
                     var10002 = -2849;
                     short var96 = -30465;
                     short var97 = -2821;
                     var136 = -23814;
                     var7[9] = TuplesKt.to("Diamond Essence", "ESSENCE_DIAMOND");
                     var10002 = -2825;
                     short var98 = -31954;
                     short var99 = -2818;
                     var136 = -18086;
                     var7[10] = TuplesKt.to("Gold Essence", "ESSENCE_GOLD");
                     var10002 = -2877;
                     short var100 = 6011;
                     short var101 = -2846;
                     var136 = -15303;
                     var7[11] = TuplesKt.to("Treasurite", "TREASURITE");
                     var10002 = -2840;
                     short var102 = -17427;
                     short var103 = -2867;
                     var136 = 20169;
                     var7[12] = TuplesKt.to("Glacite Jewel", "GLACITE_JEWEL");
                     var10002 = -2862;
                     short var104 = 1172;
                     short var105 = -2822;
                     var136 = 22158;
                     var7[13] = TuplesKt.to("Veil Shard", "SHARD_GHOST");
                     var10002 = -2853;
                     short var106 = -16747;
                     short var107 = -2874;
                     var136 = 1319;
                     var7[14] = TuplesKt.to("Ghost Shard", "SHARD_GHOST");
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = MapsKt.mapOf(var7);
                     String[] var16 = new String[5];
                     var10002 = -2871;
                     short var108 = 591;
                     var16[0] = "Rough";
                     var10002 = -2868;
                     short var109 = 19585;
                     var16[1] = "Flawed";
                     var10002 = -2863;
                     short var110 = 9995;
                     var16[2] = "Fine";
                     var10002 = -2823;
                     short var111 = -21607;
                     var16[3] = "Flawless";
                     var10002 = -2837;
                     short var112 = -4959;
                     var16[4] = "Perfect";
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = CollectionsKt.listOf(var16);
                     String[] var17 = new String[12];
                     var10002 = -2861;
                     short var113 = 22207;
                     var17[0] = "Ruby";
                     var10002 = -2828;
                     short var114 = -32251;
                     var17[1] = "Amber";
                     var10002 = -2826;
                     short var115 = -19403;
                     var17[2] = "Amethyst";
                     var10002 = -2833;
                     short var116 = -2833;
                     var17[3] = "Jade";
                     var10002 = -2860;
                     short var117 = 16998;
                     var17[4] = "Sapphire";
                     var10002 = -2835;
                     short var118 = 9115;
                     var17[5] = "Topaz";
                     var10002 = -2854;
                     short var119 = -20061;
                     var17[6] = "Jasper";
                     var10002 = -2855;
                     short var120 = 9980;
                     var17[7] = "Opal";
                     var10002 = -2872;
                     short var121 = -22503;
                     var17[8] = "Aquamarine";
                     var10002 = -2869;
                     short var122 = 10004;
                     var17[9] = "Citrine";
                     var10002 = -2878;
                     short var123 = 7968;
                     var17[10] = "Onyx";
                     var10002 = -2870;
                     short var124 = 29444;
                     var17[11] = "Peridot";
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = CollectionsKt.listOf(var17);
                     var10002 = -2844;
                     short var125 = -30615;
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new Regex("\\s+");
                     var10002 = -2865;
                     short var126 = -1963;
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new Regex("[A-Za-z0-9][A-Za-z0-9 ':-]*");
                     var10002 = -2876;
                     short var127 = -31278;
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new Regex(
                        "\\b(Rough|Flawed|Fine|Flawless|Perfect) (Ruby|Amber|Amethyst|Jade|Sapphire|Topaz|Jasper|Opal|Aquamarine|Citrine|Onyx|Peridot) Gemstone\\b",
                        RegexOption.IGNORE_CASE
                     );
                     var10002 = -2843;
                     short var128 = -5789;
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new Regex(
                        "\\b(.+?) Shards?\\b", RegexOption.IGNORE_CASE
                     );
                     Map var18 = MapsKt.createMapBuilder();
                     Map var8 = var18;
                     boolean var9 = false;

                     for (String var11 : IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
                        for (String var13 : lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
                           var136 = -2824;
                           short var157 = -26035;
                           var10001 = var11 + " " + var13 + " Gemstone";
                           String var71 = var11.toUpperCase(Locale.ROOT);
                           var136 = -2841;
                           var157 = -14395;
                           Intrinsics.checkNotNullExpressionValue(var71, "toUpperCase(...)");
                           var77 = var13.toUpperCase(Locale.ROOT);
                           var157 = -2841;
                           short var164 = -14395;
                           Intrinsics.checkNotNullExpressionValue(var77, "toUpperCase(...)");
                           var157 = -2819;
                           var164 = -8956;
                           var8.put(var10001, var71 + "_" + var77 + "_GEM");
                        }
                     }

                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = MapsKt.build(var18);
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var15);
                  break;
               default:
                  var5[var3++] = var77;
                  if ((var15 += var1) < var4) {
                     var1 = var2.charAt(var15);
                     continue label67;
                  }

                  var2 = "\u0004\u008e«Uw3\u00ad\u000búô\n°ëüK#àgù";
                  var4 = "\u0004\u008e«Uw3\u00ad\u000búô\n°ëüK#àgù".length();
                  var1 = 7;
                  var15 = -1;
            }

            var10000 = 32;
            var10001 = var2.substring(++var15, var15 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -2865) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 139;
            case 1 -> 8;
            case 2 -> 77;
            case 3 -> 1;
            case 4 -> 68;
            case 5 -> 246;
            case 6 -> 210;
            case 7 -> 204;
            case 8 -> 153;
            case 9 -> 134;
            case 10 -> 236;
            case 11 -> 185;
            case 12 -> 27;
            case 13 -> 143;
            case 14 -> 172;
            case 15 -> 151;
            case 16 -> 254;
            case 17 -> 19;
            case 18 -> 118;
            case 19 -> 135;
            case 20 -> 216;
            case 21 -> 25;
            case 22 -> 191;
            case 23 -> 88;
            case 24 -> 90;
            case 25 -> 142;
            case 26 -> 113;
            case 27 -> 222;
            case 28 -> 180;
            case 29 -> 207;
            case 30 -> 190;
            case 31 -> 137;
            case 32 -> 93;
            case 33 -> 112;
            case 34 -> 10;
            case 35 -> 239;
            case 36 -> 55;
            case 37 -> 66;
            case 38 -> 78;
            case 39 -> 226;
            case 40 -> 43;
            case 41 -> 125;
            case 42 -> 58;
            case 43 -> 176;
            case 44 -> 225;
            case 45 -> 182;
            case 46 -> 5;
            case 47 -> 202;
            case 48 -> 120;
            case 49 -> 98;
            case 50 -> 11;
            case 51 -> 250;
            case 52 -> 86;
            case 53 -> 0;
            case 54 -> 237;
            case 55 -> 200;
            case 56 -> 219;
            case 57 -> 221;
            case 58 -> 166;
            case 59 -> 46;
            case 60 -> 42;
            case 61 -> 38;
            case 62 -> 100;
            case 63 -> 47;
            case 64 -> 230;
            case 65 -> 170;
            case 66 -> 64;
            case 67 -> 81;
            case 68 -> 20;
            case 69 -> 252;
            case 70 -> 117;
            case 71 -> 215;
            case 72 -> 144;
            case 73 -> 15;
            case 74 -> 13;
            case 75 -> 164;
            case 76 -> 161;
            case 77 -> 69;
            case 78 -> 33;
            case 79 -> 59;
            case 80 -> 223;
            case 81 -> 140;
            case 82 -> 21;
            case 83 -> 229;
            case 84 -> 199;
            case 85 -> 56;
            case 86 -> 9;
            case 87 -> 61;
            case 88 -> 2;
            case 89 -> 34;
            case 90 -> 95;
            case 91 -> 205;
            case 92 -> 127;
            case 93 -> 234;
            case 94 -> 208;
            case 95 -> 218;
            case 96 -> 29;
            case 97 -> 110;
            case 98 -> 217;
            case 99 -> 244;
            case 100 -> 74;
            case 101 -> 57;
            case 102 -> 14;
            case 103 -> 146;
            case 104 -> 97;
            case 105 -> 206;
            case 106 -> 103;
            case 107 -> 235;
            case 108 -> 251;
            case 109 -> 173;
            case 110 -> 23;
            case 111 -> 28;
            case 112 -> 71;
            case 113 -> 108;
            case 114 -> 168;
            case 115 -> 60;
            case 116 -> 84;
            case 117 -> 51;
            case 118 -> 133;
            case 119 -> 39;
            case 120 -> 150;
            case 121 -> 241;
            case 122 -> 83;
            case 123 -> 243;
            case 124 -> 157;
            case 125 -> 109;
            case 126 -> 31;
            case 127 -> 119;
            case 128 -> 162;
            case 129 -> 36;
            case 130 -> 188;
            case 131 -> 107;
            case 132 -> 62;
            case 133 -> 212;
            case 134 -> 12;
            case 135 -> 122;
            case 136 -> 67;
            case 137 -> 85;
            case 138 -> 24;
            case 139 -> 3;
            case 140 -> 183;
            case 141 -> 152;
            case 142 -> 16;
            case 143 -> 184;
            case 144 -> 53;
            case 145 -> 4;
            case 146 -> 30;
            case 147 -> 138;
            case 148 -> 194;
            case 149 -> 49;
            case 150 -> 247;
            case 151 -> 72;
            case 152 -> 105;
            case 153 -> 197;
            case 154 -> 227;
            case 155 -> 91;
            case 156 -> 121;
            case 157 -> 17;
            case 158 -> 130;
            case 159 -> 231;
            case 160 -> 44;
            case 161 -> 37;
            case 162 -> 249;
            case 163 -> 70;
            case 164 -> 102;
            case 165 -> 54;
            case 166 -> 52;
            case 167 -> 228;
            case 168 -> 111;
            case 169 -> 248;
            case 170 -> 116;
            case 171 -> 136;
            case 172 -> 63;
            case 173 -> 18;
            case 174 -> 114;
            case 175 -> 253;
            case 176 -> 149;
            case 177 -> 232;
            case 178 -> 79;
            case 179 -> 123;
            case 180 -> 178;
            case 181 -> 106;
            case 182 -> 156;
            case 183 -> 148;
            case 184 -> 40;
            case 185 -> 192;
            case 186 -> 7;
            case 187 -> 35;
            case 188 -> 177;
            case 189 -> 158;
            case 190 -> 145;
            case 191 -> 155;
            case 192 -> 165;
            case 193 -> 92;
            case 194 -> 163;
            case 195 -> 132;
            case 196 -> 104;
            case 197 -> 195;
            case 198 -> 124;
            case 199 -> 224;
            case 200 -> 128;
            case 201 -> 32;
            case 202 -> 73;
            case 203 -> 255;
            case 204 -> 179;
            case 205 -> 75;
            case 206 -> 187;
            case 207 -> 131;
            case 208 -> 213;
            case 209 -> 147;
            case 210 -> 245;
            case 211 -> 154;
            case 212 -> 186;
            case 213 -> 209;
            case 214 -> 189;
            case 215 -> 48;
            case 216 -> 101;
            case 217 -> 171;
            case 218 -> 6;
            case 219 -> 141;
            case 220 -> 115;
            case 221 -> 129;
            case 222 -> 242;
            case 223 -> 169;
            case 224 -> 196;
            case 225 -> 99;
            case 226 -> 26;
            case 227 -> 45;
            case 228 -> 181;
            case 229 -> 22;
            case 230 -> 167;
            case 231 -> 159;
            case 232 -> 76;
            case 233 -> 160;
            case 234 -> 214;
            case 235 -> 96;
            case 236 -> 82;
            case 237 -> 175;
            case 238 -> 65;
            case 239 -> 87;
            case 240 -> 94;
            case 241 -> 50;
            case 242 -> 41;
            case 243 -> 220;
            case 244 -> 198;
            case 245 -> 80;
            case 246 -> 193;
            case 247 -> 240;
            case 248 -> 211;
            case 249 -> 233;
            case 250 -> 201;
            case 251 -> 238;
            case 252 -> 174;
            case 253 -> 203;
            case 254 -> 126;
            default -> 89;
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
