package me.octo.client.utils;

import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import org.jetbrains.annotations.NotNull;

public final class IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI {
   @NotNull
   public static IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static Pattern lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static Pattern IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static Map<String, Integer> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] a;
   private static String[] b;

   private IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI() {
   }

   public final int a() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final void a(int var1) {
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
   }

   public final long b() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final void a(long var1) {
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
   }

   private final Integer a(String var1) {
      if (!me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m()) {
         return null;
      } else {
         Map var10000 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         String var10001 = var1.toLowerCase(Locale.ROOT);
         short var10003 = 1610;
         short var10004 = -4647;
         Intrinsics.checkNotNullExpressionValue(var10001, "toLowerCase(...)");
         return (Integer)var10000.get(var10001);
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      Object var13 = null; // PX-FIX
      String var2 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var10000 = var1;
      if (var2 == null) {
         Intrinsics.checkNotNullParameter(var1, "e");
         if (!me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m()) {
            return;
         }

         var10000 = var1;
      }

      Packet var10 = var10000.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      if (var2 == null) {
         if (var10000.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI == null) {
            return;
         }

         var10 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      Packet var3 = var10;
      boolean var11 = var3 instanceof ClientboundSystemChatPacket;
      if (var2 == null) {
         if (!var11) {
            return;
         }

         var11 = ((ClientboundSystemChatPacket)var3).overlay();
      }

      if (!var11) {
         String var4;
         IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var12 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         String var10001 = ((ClientboundSystemChatPacket)var3).content().getString();
         short var10003 = 1614;
         short var10004 = 23264;
         Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
         var4 = var12.a(var10001);
         short var18 = 1630;
         short var10002 = 20621;
         var13 = StringsKt.startsWith(var4, "PRISTINE", false);
         label47:
         if (var2 == null) {
            if (((Boolean)(var13))) {
               Matcher var5 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.matcher(var4);
               var13 = var5.find();
               if (var2 != null) {
                  break label47;
               }

               if (((Boolean)(var13))) {
                  String var14 = var5.group(2);
                  var10002 = 1604;
                  var10003 = -1094;
                  Intrinsics.checkNotNullExpressionValue(var14, "group(...)");
                  int var6 = Integer.parseInt(var14);
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII += 256 * var6;
               }
            }

            short var19 = 1642;
            var10002 = -30330;
            var13 = StringsKt.startsWith(var4, "COMPACT", false);
         }

         if (((Boolean)(var13))) {
            Matcher var8 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.matcher(var4);
            Matcher var15 = var8;
            if (var2 == null) {
               if (!var8.find()) {
                  return;
               }

               var15 = var8;
            }

            String var16 = var15.group(1);
            var10002 = 1625;
            var10003 = 26460;
            Intrinsics.checkNotNullExpressionValue(var16, "group(...)");
            String var17 = var16.toLowerCase(Locale.ROOT);
            var10002 = 1645;
            var10003 = 14282;
            Intrinsics.checkNotNullExpressionValue(var17, "toLowerCase(...)");
            String var9 = var17;
            Integer var7 = this.a(var9);
            if (var7 != null) {
               lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  + var7;
            }
         }
      }
   }

   public final int c() {
      String var1 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      int var10000 = (int)IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      if (var1 == null) {
         if (var10000 != -420) {
            if (var1 != null) {
               return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            if (lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII != 0) {
               long var2 = System.currentTimeMillis() - IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               double var4 = var2 / 3600000.0;
               double var8;
               var10000 = (var8 = var4 - 0.0) == 0.0 ? 0 : (var8 < 0.0 ? -1 : 1);
               if (var1 == null) {
                  var10000 = var10000 > 0 ? (int)(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII / var4) : 0;
               }

               return var10000;
            }
         }

         var10000 = 0;
      }

      return var10000;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var25 = null; // PX-FIX
      String[] var5 = new String[39];
      int var3 = 0;
      String var2 = "k\u0083\u0085\u001ep\rô\u0014_\u001eº\u008e\u0017z\u000flK0V&D\u0094©îË´~ª\u0003î\u0007Â¹Æê´v\u0019\u000eG´U©\u008a»\u0001V\\4ð\u0083|ÿ\u0010¿ÜV\u008262D+7*:>%\u00ad\u0086\u0095\u0011e\u0019\u0011\u001c\u0002\r\u0010\u0080~î¾Þæ\u009e³=1\u0007[ýÐùüêß\u0004[\u0093\u0012h\u0016\u001dv\u001eñã°,7ù\u0018O\býLU\u000fÌPL·¹£\u0015\u0000\u0093½M\u0097'¢Å(FzÍ§0Q¯¯¼É\u0086·\nþÆ,e9Ú\u001e¿ä\"\tEÅ\u0012Ï\u0097,éö8\u0010\u001e\u0087~Ïïw\u00adÏÉ\u0007Tÿ1?øC\u0011\u00065}\u0099\u008f½¡\u0096H,p\u0082'\u008b«ÃK\u0012=\\·Ý\u0005u\u0016¥\u009f \u008e\u00009âÊ¸\u008c\u008c\u0011\u0095>\u000føÁ\u0091h\u0013q\u009cV\u0090ÆR\u001d\u0006R\b÷Zúô%k]¯\u0012\\u6\u0091æ¼\u008c¶í(Î\r\u00ad\u008f+>û\u0019\f¬\u0006\u0013\u0010!ã<Þþôrb\u000b\u0087\u0011\u008a6]\bP[\u009aè@)\u000bdqÚÝ\u0095\r¹ü£\u00ad4ûÆÐÕ\u009bfÀ ±ùÒêÀXÜ ÆB½(\u001e\u0003\u001b\u008bª/]jA\b\u0006\n\u008f\u000f#\u0016\u0099Â\u0012\u0086ÃmG\u008dfáí@Cfg\u0011?Yw¨ý\n4Fuu\u0012Ø{ÿH*\bÚéØu\u0085Ô¡é\u000e¦4i¹\r¹ñ\u0016B<=\u009f\tÈ\u0012\rü\u001c £\u009a$rø°w\tÿôÈ\u0083v\u0010\u0012\u0091\u001b\u008f\\Ñ\u0005j\u00811ÎNÚÂ\u0017+$¤Y\u0005Ô\u00004Q\u0094\u000eLo4Ò¦Ô\u0084»ì\u0089â4·\u0001\b\r÷GMß\u0001\u001bí\u0013È\u0091¤\r´/ÆÄ¤fíÈ\u0095óÎÌ¼ù>\r\n\u0017\u0081·ád¼&$íÙÊø\b»¦î\u0005\u0007\u0001_î\u0007º#ô¼X\u001e2\u0010¶nwÔ\u0012øÀr§\u0001([g\u0001Î\u0000\u0007c\u0006\u001dÂHÄ]";
      int var4 = "k\u0083\u0085\u001ep\rô\u0014_\u001eº\u008e\u0017z\u000flK0V&D\u0094©îË´~ª\u0003î\u0007Â¹Æê´v\u0019\u000eG´U©\u008a»\u0001V\\4ð\u0083|ÿ\u0010¿ÜV\u008262D+7*:>%\u00ad\u0086\u0095\u0011e\u0019\u0011\u001c\u0002\r\u0010\u0080~î¾Þæ\u009e³=1\u0007[ýÐùüêß\u0004[\u0093\u0012h\u0016\u001dv\u001eñã°,7ù\u0018O\býLU\u000fÌPL·¹£\u0015\u0000\u0093½M\u0097'¢Å(FzÍ§0Q¯¯¼É\u0086·\nþÆ,e9Ú\u001e¿ä\"\tEÅ\u0012Ï\u0097,éö8\u0010\u001e\u0087~Ïïw\u00adÏÉ\u0007Tÿ1?øC\u0011\u00065}\u0099\u008f½¡\u0096H,p\u0082'\u008b«ÃK\u0012=\\·Ý\u0005u\u0016¥\u009f \u008e\u00009âÊ¸\u008c\u008c\u0011\u0095>\u000føÁ\u0091h\u0013q\u009cV\u0090ÆR\u001d\u0006R\b÷Zúô%k]¯\u0012\\u6\u0091æ¼\u008c¶í(Î\r\u00ad\u008f+>û\u0019\f¬\u0006\u0013\u0010!ã<Þþôrb\u000b\u0087\u0011\u008a6]\bP[\u009aè@)\u000bdqÚÝ\u0095\r¹ü£\u00ad4ûÆÐÕ\u009bfÀ ±ùÒêÀXÜ ÆB½(\u001e\u0003\u001b\u008bª/]jA\b\u0006\n\u008f\u000f#\u0016\u0099Â\u0012\u0086ÃmG\u008dfáí@Cfg\u0011?Yw¨ý\n4Fuu\u0012Ø{ÿH*\bÚéØu\u0085Ô¡é\u000e¦4i¹\r¹ñ\u0016B<=\u009f\tÈ\u0012\rü\u001c £\u009a$rø°w\tÿôÈ\u0083v\u0010\u0012\u0091\u001b\u008f\\Ñ\u0005j\u00811ÎNÚÂ\u0017+$¤Y\u0005Ô\u00004Q\u0094\u000eLo4Ò¦Ô\u0084»ì\u0089â4·\u0001\b\r÷GMß\u0001\u001bí\u0013È\u0091¤\r´/ÆÄ¤fíÈ\u0095óÎÌ¼ù>\r\n\u0017\u0081·ád¼&$íÙÊø\b»¦î\u0005\u0007\u0001_î\u0007º#ô¼X\u001e2\u0010¶nwÔ\u0012øÀr§\u0001([g\u0001Î\u0000\u0007c\u0006\u001dÂHÄ]"
         .length();
      char var1 = 14;
      int var9 = -1;

      label52:
      while (true) {
         short var10000 = 46;
         String var10001 = var2.substring(++var9, var9 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var59 = var10001.toCharArray();
               int var10004 = var59.length;
               int var6 = 0;
               byte var62 = (byte)var10000;
               var25 = var59;
               int var17 = var10004;
               byte var97;
               char[] var101;
               int var10006;
               if (var10004 <= 1) {
                  var101 = var59;
                  var97 = (byte)var10000;
                  var10006 = var6;
               } else {
                  var62 = (byte)var10000;
                  var17 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var101 = var59;
                  var97 = (byte)var10000;
                  var10006 = var6;
               }

               while (true) {
                  var101[var10006] = (char)(var101[var10006] ^ var97 ^ switch (var6 % 7) {
                     case 0 -> 13;
                     case 1 -> 97;
                     case 2 -> 93;
                     case 3 -> 51;
                     case 4 -> 14;
                     case 5 -> 8;
                     default -> 67;
                  });
                  var6++;
                  if (var62 == 0) {
                     var10006 = var62;
                     var101 = var25;
                     var97 = var62;
                  } else {
                     if (var17 <= var6) {
                        break;
                     }

                     var101 = var25;
                     var97 = var62;
                     var10006 = var6;
                  }
               }
            }

            String var64 = new String(var25).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var64;
                  if ((var9 += var1) >= var4) {
                     a = var5;
                     b = new String[39];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI();
                     var10000 = 1626;
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = -420L;
                     short var19 = 19577;
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = Pattern.compile(
                        "You found .* Flawed (.+) Gemstone x(\\d+)!"
                     );
                     var10000 = 1600;
                     short var20 = -27039;
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = Pattern.compile("You found an (.+)!");
                     Pair[] var7 = new Pair[30];
                     var10002 = 1644;
                     short var65 = 29024;
                     var7[0] = TuplesKt.to("mithril", 8);
                     var10002 = 1611;
                     short var66 = -17241;
                     var7[1] = TuplesKt.to("enchanted mithril", 1280);
                     var10002 = 1647;
                     short var67 = 31719;
                     var7[2] = TuplesKt.to("titanium", 20);
                     var10002 = 1621;
                     short var68 = -22202;
                     var7[3] = TuplesKt.to("enchanted titanium", 3200);
                     var10002 = 1629;
                     short var69 = 24308;
                     var7[4] = TuplesKt.to("cobblestone", 1);
                     var10002 = 1607;
                     short var70 = -20926;
                     var7[5] = TuplesKt.to("enchanted cobblestone", 160);
                     var10002 = 1622;
                     short var71 = -25000;
                     var7[6] = TuplesKt.to("tungsten", 60);
                     var10002 = 1620;
                     short var72 = -22249;
                     var7[7] = TuplesKt.to("enchanted tungsten", 9600);
                     var10002 = 1618;
                     short var73 = -2217;
                     var7[8] = TuplesKt.to("umber", 60);
                     var10002 = 1615;
                     short var74 = -6233;
                     var7[9] = TuplesKt.to("enchanted umber", 9600);
                     var10002 = 1640;
                     short var75 = 3175;
                     var7[10] = TuplesKt.to("gold ingot", 3);
                     var10002 = 1613;
                     short var76 = 31719;
                     var7[11] = TuplesKt.to("enchanted gold", 480);
                     var10002 = 1643;
                     short var77 = -15532;
                     var7[12] = TuplesKt.to("iron ingot", 3);
                     var10002 = 1623;
                     short var78 = -2110;
                     var7[13] = TuplesKt.to("enchanted iron", 480);
                     var10002 = 1609;
                     short var79 = 13211;
                     var7[14] = TuplesKt.to("coal", 7);
                     var10002 = 1619;
                     short var80 = -21143;
                     var7[15] = TuplesKt.to("enchanted coal", 1250);
                     var10002 = 1612;
                     short var81 = -16989;
                     var7[16] = TuplesKt.to("diamond", 9);
                     var10002 = 1601;
                     short var82 = -7530;
                     var7[17] = TuplesKt.to("enchanted diamond", 1340);
                     var10002 = 1628;
                     short var83 = -9322;
                     var7[18] = TuplesKt.to("lapis lazuli", 4);
                     var10002 = 1606;
                     short var84 = -7707;
                     var7[19] = TuplesKt.to("enchanted lapis lazuli", 700);
                     var10002 = 1608;
                     short var85 = 24477;
                     var7[20] = TuplesKt.to("emerald", 10);
                     var10002 = 1603;
                     short var86 = 2871;
                     var7[21] = TuplesKt.to("enchanted emerald", 1050);
                     var10002 = 1627;
                     short var87 = 5966;
                     var7[22] = TuplesKt.to("redstone", 5);
                     var10002 = 1624;
                     short var88 = 16928;
                     var7[23] = TuplesKt.to("enchanted redstone", 834);
                     var10002 = 1616;
                     short var89 = -23027;
                     var7[24] = TuplesKt.to("obsidian", 14);
                     var10002 = 1631;
                     short var90 = -28586;
                     var7[25] = TuplesKt.to("enchanted obsidian", 2300);
                     var10002 = 1605;
                     short var91 = -4338;
                     var7[26] = TuplesKt.to("end stone", 2);
                     var10002 = 1617;
                     short var92 = -31903;
                     var7[27] = TuplesKt.to("enchanted end stone", 320);
                     var10002 = 1646;
                     short var93 = 7206;
                     var7[28] = TuplesKt.to("nether quartz", 7);
                     var10002 = 1602;
                     short var94 = -27835;
                     var7[29] = TuplesKt.to("enchanted quartz", 1032);
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = MapsKt.mapOf(var7);
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var9);
                  break;
               default:
                  var5[var3++] = var64;
                  if ((var9 += var1) < var4) {
                     var1 = var2.charAt(var9);
                     continue label52;
                  }

                  var2 = "¦ ¥ÿ\u0015ýÌ6úc\n¬o(²Ç\u001f\u0096j±è";
                  var4 = "¦ ¥ÿ\u0015ýÌ6úc\n¬o(²Ç\u001f\u0096j±è".length();
                  var1 = '\n';
                  var9 = -1;
            }

            var10000 = 79;
            var10001 = var2.substring(++var9, var9 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 1614) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 46;
            case 1 -> 142;
            case 2 -> 127;
            case 3 -> 187;
            case 4 -> 207;
            case 5 -> 183;
            case 6 -> 62;
            case 7 -> 38;
            case 8 -> 119;
            case 9 -> 88;
            case 10 -> 219;
            case 11 -> 184;
            case 12 -> 72;
            case 13 -> 169;
            case 14 -> 130;
            case 15 -> 52;
            case 16 -> 12;
            case 17 -> 105;
            case 18 -> 248;
            case 19 -> 97;
            case 20 -> 99;
            case 21 -> 31;
            case 22 -> 196;
            case 23 -> 236;
            case 24 -> 198;
            case 25 -> 5;
            case 26 -> 240;
            case 27 -> 202;
            case 28 -> 143;
            case 29 -> 58;
            case 30 -> 26;
            case 31 -> 20;
            case 32 -> 33;
            case 33 -> 35;
            case 34 -> 3;
            case 35 -> 252;
            case 36 -> 190;
            case 37 -> 247;
            case 38 -> 182;
            case 39 -> 103;
            case 40 -> 8;
            case 41 -> 223;
            case 42 -> 246;
            case 43 -> 146;
            case 44 -> 19;
            case 45 -> 153;
            case 46 -> 204;
            case 47 -> 102;
            case 48 -> 137;
            case 49 -> 7;
            case 50 -> 24;
            case 51 -> 250;
            case 52 -> 218;
            case 53 -> 51;
            case 54 -> 191;
            case 55 -> 84;
            case 56 -> 6;
            case 57 -> 162;
            case 58 -> 40;
            case 59 -> 17;
            case 60 -> 34;
            case 61 -> 237;
            case 62 -> 138;
            case 63 -> 216;
            case 64 -> 131;
            case 65 -> 210;
            case 66 -> 215;
            case 67 -> 87;
            case 68 -> 244;
            case 69 -> 100;
            case 70 -> 132;
            case 71 -> 91;
            case 72 -> 177;
            case 73 -> 209;
            case 74 -> 83;
            case 75 -> 217;
            case 76 -> 173;
            case 77 -> 118;
            case 78 -> 152;
            case 79 -> 125;
            case 80 -> 254;
            case 81 -> 180;
            case 82 -> 155;
            case 83 -> 245;
            case 84 -> 64;
            case 85 -> 122;
            case 86 -> 86;
            case 87 -> 141;
            case 88 -> 242;
            case 89 -> 79;
            case 90 -> 37;
            case 91 -> 189;
            case 92 -> 197;
            case 93 -> 234;
            case 94 -> 167;
            case 95 -> 231;
            case 96 -> 43;
            case 97 -> 49;
            case 98 -> 70;
            case 99 -> 65;
            case 100 -> 230;
            case 101 -> 140;
            case 102 -> 11;
            case 103 -> 235;
            case 104 -> 81;
            case 105 -> 129;
            case 106 -> 4;
            case 107 -> 80;
            case 108 -> 255;
            case 109 -> 158;
            case 110 -> 227;
            case 111 -> 95;
            case 112 -> 164;
            case 113 -> 232;
            case 114 -> 1;
            case 115 -> 53;
            case 116 -> 126;
            case 117 -> 22;
            case 118 -> 18;
            case 119 -> 101;
            case 120 -> 128;
            case 121 -> 124;
            case 122 -> 147;
            case 123 -> 13;
            case 124 -> 29;
            case 125 -> 112;
            case 126 -> 85;
            case 127 -> 60;
            case 128 -> 107;
            case 129 -> 77;
            case 130 -> 25;
            case 131 -> 94;
            case 132 -> 145;
            case 133 -> 226;
            case 134 -> 249;
            case 135 -> 47;
            case 136 -> 163;
            case 137 -> 224;
            case 138 -> 50;
            case 139 -> 32;
            case 140 -> 21;
            case 141 -> 166;
            case 142 -> 120;
            case 143 -> 179;
            case 144 -> 74;
            case 145 -> 104;
            case 146 -> 14;
            case 147 -> 27;
            case 148 -> 156;
            case 149 -> 233;
            case 150 -> 253;
            case 151 -> 193;
            case 152 -> 251;
            case 153 -> 108;
            case 154 -> 110;
            case 155 -> 93;
            case 156 -> 241;
            case 157 -> 67;
            case 158 -> 135;
            case 159 -> 136;
            case 160 -> 192;
            case 161 -> 82;
            case 162 -> 154;
            case 163 -> 116;
            case 164 -> 45;
            case 165 -> 96;
            case 166 -> 229;
            case 167 -> 133;
            case 168 -> 69;
            case 169 -> 56;
            case 170 -> 76;
            case 171 -> 214;
            case 172 -> 206;
            case 173 -> 61;
            case 174 -> 71;
            case 175 -> 42;
            case 176 -> 238;
            case 177 -> 208;
            case 178 -> 111;
            case 179 -> 23;
            case 180 -> 200;
            case 181 -> 113;
            case 182 -> 195;
            case 183 -> 185;
            case 184 -> 221;
            case 185 -> 149;
            case 186 -> 89;
            case 187 -> 39;
            case 188 -> 78;
            case 189 -> 181;
            case 190 -> 220;
            case 191 -> 109;
            case 192 -> 159;
            case 193 -> 161;
            case 194 -> 59;
            case 195 -> 123;
            case 196 -> 92;
            case 197 -> 212;
            case 198 -> 144;
            case 199 -> 201;
            case 200 -> 73;
            case 201 -> 172;
            case 202 -> 55;
            case 203 -> 54;
            case 204 -> 243;
            case 205 -> 157;
            case 206 -> 174;
            case 207 -> 16;
            case 208 -> 186;
            case 209 -> 63;
            case 210 -> 150;
            case 211 -> 98;
            case 212 -> 9;
            case 213 -> 151;
            case 214 -> 139;
            case 215 -> 44;
            case 216 -> 48;
            case 217 -> 175;
            case 218 -> 2;
            case 219 -> 117;
            case 220 -> 170;
            case 221 -> 0;
            case 222 -> 90;
            case 223 -> 10;
            case 224 -> 66;
            case 225 -> 30;
            case 226 -> 114;
            case 227 -> 160;
            case 228 -> 199;
            case 229 -> 176;
            case 230 -> 36;
            case 231 -> 168;
            case 232 -> 57;
            case 233 -> 188;
            case 234 -> 28;
            case 235 -> 211;
            case 236 -> 75;
            case 237 -> 205;
            case 238 -> 222;
            case 239 -> 148;
            case 240 -> 225;
            case 241 -> 115;
            case 242 -> 41;
            case 243 -> 68;
            case 244 -> 178;
            case 245 -> 121;
            case 246 -> 194;
            case 247 -> 213;
            case 248 -> 165;
            case 249 -> 203;
            case 250 -> 228;
            case 251 -> 15;
            case 252 -> 171;
            case 253 -> 134;
            case 254 -> 106;
            default -> 239;
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
