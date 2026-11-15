package me.octo.client.utils;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import javax.imageio.ImageIO;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IlllIlllllIIIlIIllIIIlIlIIlIIIlIlIIIlIllIIIIllllIIIIlIllIllllIlllIlIIlIllIIIlIIIlIlIl {
   @NotNull
   public static IlllIlllllIIIlIIllIIIlIlIIlIIIlIlIIIlIllIIIIllllIIIIlIllIllllIlllIlIIlIllIIIlIIIlIlIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @Nullable
   private static TrayIcon lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] a;
   private static String[] b;

   private IlllIlllllIIIlIIllIIIlIlIIlIIIlIlIIIlIllIIIIllllIIIIlIllIllllIlllIlIIlIllIIIlIIIlIlIl() {
   }

   private final TrayIcon a() {
      BufferedImage var24 = null; // PX-FIX
      TrayIcon var26;
      if (SystemTray.isSupported()) {
         SystemTray var1 = SystemTray.getSystemTray();

         BufferedImage var3;
         try {
            label82: {
               Class var10000 = this.getClass();
               short var10001 = -6238;
               short var10002 = -9438;
               InputStream var23 = var10000.getResourceAsStream("/assets/polinex/logo64.png");
               if (var23 != null) {
                  var var5 = var23;
                  Throwable var6 = null;

                  BufferedImage var21;
                  try {
                     InputStream var7 = var5;
                     boolean var8 = false;
                     var21 = ImageIO.read(var7);
                  } catch (Throwable var15) {
                     var6 = var15;
                     throw var15;
                  } finally {
                     CloseableKt.closeFinally(var5, var6);
                  }

                  var24 = var21;
                  if (var21 != null) {
                     break label82;
                  }
               }

               short var25 = -6239;
               IlllIlllllIIIlIIllIIIlIlIIlIIIlIlIIIlIllIIIIllllIIIIlIllIllllIlllIlIIlIllIIIlIIIlIlIl var20 = this;
               var10001 = -1839;
               boolean var22 = false;
               System.out.println("Resource not found: logo64");
               var24 = null;
            }

            var3 = var24;
         } catch (IOException var18) {
            var18.printStackTrace();
            var3 = null;
         }

         BufferedImage var2 = var3;

         try {
            if (var2 == null) {
               short var27 = -6248;
               short var29 = 27621;
               System.out.println("Failed to load notification icon.");
               return null;
            }
         } catch (Throwable var17) {
            throw (RuntimeException)a(var17);
         }

         Image var30 = var3;
         short var10003 = -6251;
         short var10004 = 16040;
         TrayIcon var19 = new TrayIcon(var30, "Polinex");
         var19.setImageAutoSize(true);

         TrayIcon var4;
         try {
            var1.add(var19);
            var4 = var19;
         } catch (AWTException var14) {
            var14.printStackTrace();
            var4 = null;
         }

         var26 = var4;
      } else {
         var26 = null;
      }

      return var26;
   }

   public final void a(@NotNull String var1, @NotNull String var2) {
      String var3;
      CharSequence var8;
      label41: {
         short var10001 = -6249;
         short var10002 = -26904;
         Intrinsics.checkNotNullParameter(var1, "title");
         String var10000 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
         var10002 = -6235;
         short var10003 = 24151;
         Intrinsics.checkNotNullParameter(var2, "message");
         var10001 = -6261;
         var10002 = 3516;
         String var11 = System.getProperty("os.name");
         var10003 = -6252;
         short var10004 = 6968;
         Intrinsics.checkNotNullExpressionValue(var11, "getProperty(...)");
         String var12 = var11.toLowerCase(Locale.ROOT);
         var10003 = -6265;
         var10004 = 1012;
         Intrinsics.checkNotNullExpressionValue(var12, "toLowerCase(...)");
         String var4 = var12;
         var3 = var10000;
         var8 = var4;
         var10001 = -6268;
         var10002 = -22673;
         boolean var7 = StringsKt.contains(var8, "win", false);
         if (var3 == null) {
            if (var7) {
               this.b(var1, var2);
               if (var3 == null) {
                  return;
               }
            }

            var8 = var4;
            if (var3 != null) {
               break label41;
            }

            var10001 = -6271;
            var10002 = 6381;
            var7 = StringsKt.contains(var8, "mac", false);
         }

         if (var7) {
            this.c(var1, var2);
            if (var3 == null) {
               return;
            }
         }

         var8 = var4;
      }

      label24: {
         CharSequence var5 = var8;
         if (var3 == null) {
            short var20 = -6241;
            short var23 = -2230;
            if (!new Regex("aux|nux|aix").containsMatchIn(var5)) {
               break label24;
            }

            this.d(var1, var2);
         }

         if (var3 == null) {
            return;
         }
      }

      short var9 = -6232;
      short var15 = 26226;
      System.out.println("Unsupported OS for desktop notifications.");
   }

   private final void b(String param1, String param2) {
      String var3 = me.octo.client.utils.IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();

      if (var3 == null) {
         if (lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII != null) {
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.displayMessage(param1, param2, java.awt.TrayIcon.MessageType.INFO);
            return;
         }
      }

      String var4 = param1.replace((CharSequence) "'", (CharSequence) "\\'");
      String var5 = param2.replace((CharSequence) "'", (CharSequence) "\\'");
      String var6 = kotlin.text.StringsKt.trimIndent("\n                [Windows.UI.Notifications.ToastNotificationManager, Windows.UI.Notifications, ContentType = WindowsRuntime] | Out-Null\n                $template = [Windows.UI.Notifications.ToastNotificationManager]::GetTemplateContent([Windows.UI.Notifications.ToastTemplateType]::ToastText02)\n                $nodes = $template.GetElementsByTagName('text')\n                $nodes.Item(0).AppendChild($template.CreateTextNode('" + var4 + "')) | Out-Null\n                $nodes.Item(1).AppendChild($template.CreateTextNode('" + var5 + "')) | Out-Null\n                $toast = [Windows.UI.Notifications.ToastNotification]::new($template)\n                [Windows.UI.Notifications.ToastNotificationManager]::CreateToastNotifier('Polinex').Show($toast)\n            ");

      try {
         java.lang.Runtime.getRuntime().exec(new String[]{"powershell", "-NoProfile", "-NonInteractive", "-Command", var6});
      } catch (Exception exception) {
         exception.printStackTrace();
      }
   }

   private final void c(String var1, String var2) {
      try {
         Runtime var10000 = Runtime.getRuntime();
         String[] var4 = new String[3];
         short var10003 = -6269;
         short var10004 = 3461;
         var4[0] = "osascript";
         var10003 = -6250;
         var10004 = 9956;
         var4[1] = "-e";
         short var10005 = -6234;
         short var10006 = 22599;
         var10006 = -6260;
         short var10007 = 10576;
         var4[2] = "display notification \"" + var2 + "\" with title \"" + var1 + "\"";
         Process var3 = var10000.exec(var4);
         var3.waitFor();
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   private final void d(String param1, String param2) {
String var3 = me.octo.client.utils.IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();

try {
   if (var3 == null) {
      if (this.a("notify-send")) {
         Process var4 = java.lang.Runtime.getRuntime().exec(new String[]{"notify-send", param1, param2});
         int var5 = var4.waitFor();
         if (var5 == 0) {
            return;
         }
      }

      if (this.a("kdialog")) {
         Process var4 = java.lang.Runtime.getRuntime().exec(new String[]{"kdialog", "--passivepopup", param2, "5", "--title", param1});
         int var5 = var4.waitFor();
         if (var5 == 0) {
            return;
         }
      }

      if (this.a("zenity")) {
         Process var4 = java.lang.Runtime.getRuntime().exec(new String[]{"zenity", "--notification", "--text=" + param1 + ": " + param2});
         int var5 = var4.waitFor();
         if (var5 == 0) {
            return;
         }
      }
   }

   System.out.println("Desktop Notification: " + param1 + " - " + param2);
} catch (Exception var4) {
   var4.printStackTrace();
   System.out.println("Desktop Notification: " + param1 + " - " + param2);
}
   }

   private final boolean a(String var1) {
      int var9 = 0; // PX-FIX
      String var2 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();

      int var3;
      try {
         Runtime var10000 = Runtime.getRuntime();
         String[] var4 = new String[3];
         short var10003 = -6264;
         short var10004 = 15544;
         var4[0] = "sh";
         var10003 = -6236;
         var10004 = 11369;
         var4[1] = "-c";
         var10004 = -6245;
         short var10005 = -18186;
         var4[2] = "command -v " + var1;
         Process var7 = var10000.exec(var4);
         int var8 = var7.waitFor();

         label27: {
            label26: {
               try {
                  var9 = var8;
                  if (var2 != null) {
                     break label27;
                  }

                  if (var8 == 0) {
                     break label26;
                  }
               } catch (Exception var5) {
                  throw (RuntimeException)a(var5);
               }

               var9 = 0;
               break label27;
            }

            var9 = 1;
         }

         var3 = var9;
      } catch (Exception var6) {
         var3 = 0;
      }

      return (var3 != 0);
   }

   public final void b() {
      String var1 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      if (var1 == null && lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII != null) {
         TrayIcon var2 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         boolean var3 = false;
         SystemTray.getSystemTray().remove(var2);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[44];
      int var3 = 0;
      String var2 = "\u0096\u0080`_tÍ\u0086ï\tä!*Cü\u0080_#©\nH\u0098UýÖ\u0082(W~\u001a\u0003½ÿA\u000b\u0013\u0085àR\u0017ðÃDç®X\u0010\u0089âÒ¸\u007fw¢\u001b{nNo©H\u008f¹\u0003StÈ\u0006t+\u0080ÌP#Ƭ=D\u0099\u0085 3¶\u001d ò\u0019Í \u001bo\u0015¼ÔsD\u001b×Ý0C&§ÀZD\u009ar/Un\u001c\u009a\u00ad~·b¡¾\u000f\u0006W¦T!`¥²!ìj\u001eI\u0095é\u0091ew\u0080½¦Ê$+\u001f=Ñ\u0006O\u0005áÖ-íu9\u00894EËK&õèR¾y\u0082¬\u008a¡,øf\u0096x\u0013»\u0002sH\"%å©æÿ© \u008bÞ\u0089\u0087Þ \u000b¼£¿~\u0099ãH²\r\u008dÀ\u0082CÄ\u00ad&}8,¥þÂ\u008eUB)ê^+\u009ahÀ\u008aîë8\u0091¢ºFÙm½ü\u007f{1\u001ayýåG\u009c'\u0097J®\u0098/oþfi\u009b\u0003^bf\u001b>X\u0016½¤\taË\u00adÇ BJËM/iÆu\u009d\u0082àæa,/\u0004\u008fÅ\u009b6çÎÈÆÊµ\u0099\u0097\u001dÓ@ó¼¿#ëB¡n\u0095¸w\u001f\u0098ò$\u008e\u0000ö\u0013ª/¶ºJ{¥Ì\u0087ÌsA.;ý0ù=õ\u001d\u0090\u0088«û/\u0084\\©?°k¨\u0011\u000e\n·ÞÀ6ër\u00ad\u0001\f!ß\u001aöÐ]¸ÐaK!ú§ý\u008fÉ 0ÉNXQâ\u0096uA\u0097ÞH>åb4^\b`ý×má¼\u0012d\u009cw'©Û÷Z»§}\u0089Â¿ÏkõÂ«b\u0083àËe\u001b?àEgÞ½Ö$Y&P²[[ü¦ölKC\u0087«èÖõI\u001b$ìN ¯}°\u000bafÈºKË¬·×Ç<&ÍX\u0006Xìí¡µ\u0080\t9+þª³É\u0002Y&º\u0007\tÅØÂ\u0006\u0011N\u0002\u000bõâª×êßºxM!\t\u0087\u009c\u009aÿBkûSrùÍ\u009dÂÅ\tµ²5ôÝèê\u0014\u009aÊn×\u0086\u0092\u001eÁ\u0085í\u0096\u001c§Fü¾\u008eà\u0001\u0098\u0007\u0000\u0094Mqö²òºýdê\u000f\u0085¡£\f#ÇE8R{Qä\u009cË½Tµ'Ï\u0002G\u0006ù\u0083Yk\rÚcëWåÙë\u009aëv\u0081M\u0092Ò$\u000b\u0089ò²ü-éô0\rþtù/J Ar9y÷«ÙfO\u0081\noÝÁW\u009bÙ&¸\u001cW\u0090ÒE\u001c\u0089CË\u0014b\túvqã,Ñì\u0087e\u0089a\u008eRã3Â\r^x\u0011\u0014u^]}Í\u0011LÈ\b§\u0094NÚYÅB\u0090í³Ñ_dB7\u001f\u009c;¶N¶6b\b\u0004<\u000eÌ `¯àWg\u009c½\u009e$P&q²\u000f\u0095Å\u0000X\\A9\u0091ÝÏíW\\ÀÕ\u0003sý?\u000eG\u0003¬$ï/\u0081\u008b\u000fªÀ]^æ\n9\u0006\u0095\u001eÕqFº|#\u0007ÄÑ1Ò?õÞ\u0002\u009dZ\u0016\u009cyy\u0084Ñ~\u0016\u0012\u0080\\ê÷Fu~ùá\u0012>ïÙ\u0001\u0002,x\u0002í\u0002\u0005\u0084\u008aKpa\u0010>8m\u0097²@¼\u0090éúq\u001aÑæ\u0080l\u0007À\u0004{bwê\u0093\u0002\u0019Â\u000b×tÍh\u008f$~xx\b®!ç+NM\u007f« \u0096-]BwO®û!aúPD\u0081>géÁ?\u0095ã\u0007I\u009eAè\u0003Ñ5kTIR\u0096o5n¼ã7ß[\u0091\u0007#t×°÷\u0085}\u0012Ô4Ë\u008bêòÿ%\u0089õ8cO\rqH\u009cT\u009b\bB\u009fË¢I\u008e5nÂ¯ \u001c\u0003FÏ\u0097Bk\u0018?\u0013ø±röo\u009dà\u008c-¾Mö\u0090õ\u0012|\tOË\u0099>{\u000b¯\u008f\u0095_<êú\u0085;\u007f[\u000bÃ\túÃTÂ«\u0002êfù\u000eS¡ÙÚ{7U´\u0011æPo\u0018a\u001aY\u000fÇÖ\u00174þ,Àu\u0003ÒhÝ©/{I~CÔ¡6£Jú\u0006Ü\u008b\u0095Øò¡\u000e8\u001cªcÏÕ+®6Hi\u0090]º\u001aZWuEQß4ÝÛI9i\u0002\u0017tO7_è¤ª ¡¬\u0080´\u0016\u0085\u001e~þ)G\u001bú)AûTd\u0001:wiÃ/ÕáD\u0007£(N\u0085v\u0015î\u0002\u0010â\u0007é\u008bÛÂ\u0090¥\u009c\u0007\u0098õ)>\u009abs\u0016¡òÞõ%P\u0088×Sä\u0090à\t\u0097\u0097¥Ü\u0099\u0099\u009e-/";
      int var4 = "\u0096\u0080`_tÍ\u0086ï\tä!*Cü\u0080_#©\nH\u0098UýÖ\u0082(W~\u001a\u0003½ÿA\u000b\u0013\u0085àR\u0017ðÃDç®X\u0010\u0089âÒ¸\u007fw¢\u001b{nNo©H\u008f¹\u0003StÈ\u0006t+\u0080ÌP#Ƭ=D\u0099\u0085 3¶\u001d ò\u0019Í \u001bo\u0015¼ÔsD\u001b×Ý0C&§ÀZD\u009ar/Un\u001c\u009a\u00ad~·b¡¾\u000f\u0006W¦T!`¥²!ìj\u001eI\u0095é\u0091ew\u0080½¦Ê$+\u001f=Ñ\u0006O\u0005áÖ-íu9\u00894EËK&õèR¾y\u0082¬\u008a¡,øf\u0096x\u0013»\u0002sH\"%å©æÿ© \u008bÞ\u0089\u0087Þ \u000b¼£¿~\u0099ãH²\r\u008dÀ\u0082CÄ\u00ad&}8,¥þÂ\u008eUB)ê^+\u009ahÀ\u008aîë8\u0091¢ºFÙm½ü\u007f{1\u001ayýåG\u009c'\u0097J®\u0098/oþfi\u009b\u0003^bf\u001b>X\u0016½¤\taË\u00adÇ BJËM/iÆu\u009d\u0082àæa,/\u0004\u008fÅ\u009b6çÎÈÆÊµ\u0099\u0097\u001dÓ@ó¼¿#ëB¡n\u0095¸w\u001f\u0098ò$\u008e\u0000ö\u0013ª/¶ºJ{¥Ì\u0087ÌsA.;ý0ù=õ\u001d\u0090\u0088«û/\u0084\\©?°k¨\u0011\u000e\n·ÞÀ6ër\u00ad\u0001\f!ß\u001aöÐ]¸ÐaK!ú§ý\u008fÉ 0ÉNXQâ\u0096uA\u0097ÞH>åb4^\b`ý×má¼\u0012d\u009cw'©Û÷Z»§}\u0089Â¿ÏkõÂ«b\u0083àËe\u001b?àEgÞ½Ö$Y&P²[[ü¦ölKC\u0087«èÖõI\u001b$ìN ¯}°\u000bafÈºKË¬·×Ç<&ÍX\u0006Xìí¡µ\u0080\t9+þª³É\u0002Y&º\u0007\tÅØÂ\u0006\u0011N\u0002\u000bõâª×êßºxM!\t\u0087\u009c\u009aÿBkûSrùÍ\u009dÂÅ\tµ²5ôÝèê\u0014\u009aÊn×\u0086\u0092\u001eÁ\u0085í\u0096\u001c§Fü¾\u008eà\u0001\u0098\u0007\u0000\u0094Mqö²òºýdê\u000f\u0085¡£\f#ÇE8R{Qä\u009cË½Tµ'Ï\u0002G\u0006ù\u0083Yk\rÚcëWåÙë\u009aëv\u0081M\u0092Ò$\u000b\u0089ò²ü-éô0\rþtù/J Ar9y÷«ÙfO\u0081\noÝÁW\u009bÙ&¸\u001cW\u0090ÒE\u001c\u0089CË\u0014b\túvqã,Ñì\u0087e\u0089a\u008eRã3Â\r^x\u0011\u0014u^]}Í\u0011LÈ\b§\u0094NÚYÅB\u0090í³Ñ_dB7\u001f\u009c;¶N¶6b\b\u0004<\u000eÌ `¯àWg\u009c½\u009e$P&q²\u000f\u0095Å\u0000X\\A9\u0091ÝÏíW\\ÀÕ\u0003sý?\u000eG\u0003¬$ï/\u0081\u008b\u000fªÀ]^æ\n9\u0006\u0095\u001eÕqFº|#\u0007ÄÑ1Ò?õÞ\u0002\u009dZ\u0016\u009cyy\u0084Ñ~\u0016\u0012\u0080\\ê÷Fu~ùá\u0012>ïÙ\u0001\u0002,x\u0002í\u0002\u0005\u0084\u008aKpa\u0010>8m\u0097²@¼\u0090éúq\u001aÑæ\u0080l\u0007À\u0004{bwê\u0093\u0002\u0019Â\u000b×tÍh\u008f$~xx\b®!ç+NM\u007f« \u0096-]BwO®û!aúPD\u0081>géÁ?\u0095ã\u0007I\u009eAè\u0003Ñ5kTIR\u0096o5n¼ã7ß[\u0091\u0007#t×°÷\u0085}\u0012Ô4Ë\u008bêòÿ%\u0089õ8cO\rqH\u009cT\u009b\bB\u009fË¢I\u008e5nÂ¯ \u001c\u0003FÏ\u0097Bk\u0018?\u0013ø±röo\u009dà\u008c-¾Mö\u0090õ\u0012|\tOË\u0099>{\u000b¯\u008f\u0095_<êú\u0085;\u007f[\u000bÃ\túÃTÂ«\u0002êfù\u000eS¡ÙÚ{7U´\u0011æPo\u0018a\u001aY\u000fÇÖ\u00174þ,Àu\u0003ÒhÝ©/{I~CÔ¡6£Jú\u0006Ü\u008b\u0095Øò¡\u000e8\u001cªcÏÕ+®6Hi\u0090]º\u001aZWuEQß4ÝÛI9i\u0002\u0017tO7_è¤ª ¡¬\u0080´\u0016\u0085\u001e~þ)G\u001bú)AûTd\u0001:wiÃ/ÕáD\u0007£(N\u0085v\u0015î\u0002\u0010â\u0007é\u008bÛÂ\u0090¥\u009c\u0007\u0098õ)>\u009abs\u0016¡òÞõ%P\u0088×Sä\u0090à\t\u0097\u0097¥Ü\u0099\u0099\u009e-/"
         .length();
      char var1 = '\b';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 32;
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
                     case 0 -> 50;
                     case 1 -> 83;
                     case 2 -> 55;
                     case 3 -> 71;
                     case 4 -> 85;
                     case 5 -> 75;
                     default -> 40;
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
                     b = new String[44];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IlllIlllllIIIlIIllIIIlIlIIlIIIlIlIIIlIllIIIIllllIIIIlIllIllllIlllIlIIlIllIIIlIIIlIlIl();
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a();
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "\u001cR3üõÚ`AáMÂ¾\u0011o²©!\u008dx\u0007\u0081m\u0089ø8kK²4\u009aQ¯ùÒÕ7\u0085Oúæ<\u0007\u0011NâD Û\u0081";
                  var4 = "\u001cR3üõÚ`AáMÂ¾\u0011o²©!\u008dx\u0007\u0081m\u0089ø8kK²4\u009aQ¯ùÒÕ7\u0085Oúæ<\u0007\u0011NâD Û\u0081".length();
                  var1 = ')';
                  var8 = -1;
            }

            var10000 = 97;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static Throwable a(Throwable var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -6270) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 87;
            case 1 -> 86;
            case 2 -> 58;
            case 3 -> 136;
            case 4 -> 210;
            case 5 -> 16;
            case 6 -> 146;
            case 7 -> 162;
            case 8 -> 214;
            case 9 -> 175;
            case 10 -> 22;
            case 11 -> 195;
            case 12 -> 180;
            case 13 -> 148;
            case 14 -> 12;
            case 15 -> 242;
            case 16 -> 209;
            case 17 -> 52;
            case 18 -> 248;
            case 19 -> 48;
            case 20 -> 188;
            case 21 -> 224;
            case 22 -> 231;
            case 23 -> 140;
            case 24 -> 167;
            case 25 -> 78;
            case 26 -> 94;
            case 27 -> 72;
            case 28 -> 174;
            case 29 -> 125;
            case 30 -> 19;
            case 31 -> 33;
            case 32 -> 178;
            case 33 -> 227;
            case 34 -> 60;
            case 35 -> 200;
            case 36 -> 97;
            case 37 -> 254;
            case 38 -> 83;
            case 39 -> 203;
            case 40 -> 2;
            case 41 -> 46;
            case 42 -> 255;
            case 43 -> 41;
            case 44 -> 237;
            case 45 -> 173;
            case 46 -> 75;
            case 47 -> 155;
            case 48 -> 14;
            case 49 -> 138;
            case 50 -> 107;
            case 51 -> 8;
            case 52 -> 73;
            case 53 -> 93;
            case 54 -> 32;
            case 55 -> 221;
            case 56 -> 246;
            case 57 -> 247;
            case 58 -> 149;
            case 59 -> 36;
            case 60 -> 82;
            case 61 -> 185;
            case 62 -> 135;
            case 63 -> 158;
            case 64 -> 131;
            case 65 -> 57;
            case 66 -> 230;
            case 67 -> 26;
            case 68 -> 47;
            case 69 -> 100;
            case 70 -> 56;
            case 71 -> 198;
            case 72 -> 183;
            case 73 -> 166;
            case 74 -> 67;
            case 75 -> 190;
            case 76 -> 102;
            case 77 -> 59;
            case 78 -> 99;
            case 79 -> 88;
            case 80 -> 163;
            case 81 -> 108;
            case 82 -> 187;
            case 83 -> 112;
            case 84 -> 90;
            case 85 -> 217;
            case 86 -> 141;
            case 87 -> 244;
            case 88 -> 20;
            case 89 -> 238;
            case 90 -> 192;
            case 91 -> 165;
            case 92 -> 23;
            case 93 -> 28;
            case 94 -> 150;
            case 95 -> 117;
            case 96 -> 104;
            case 97 -> 144;
            case 98 -> 61;
            case 99 -> 54;
            case 100 -> 239;
            case 101 -> 181;
            case 102 -> 208;
            case 103 -> 145;
            case 104 -> 11;
            case 105 -> 96;
            case 106 -> 21;
            case 107 -> 202;
            case 108 -> 142;
            case 109 -> 53;
            case 110 -> 29;
            case 111 -> 115;
            case 112 -> 232;
            case 113 -> 147;
            case 114 -> 215;
            case 115 -> 66;
            case 116 -> 212;
            case 117 -> 95;
            case 118 -> 234;
            case 119 -> 128;
            case 120 -> 228;
            case 121 -> 216;
            case 122 -> 15;
            case 123 -> 243;
            case 124 -> 199;
            case 125 -> 156;
            case 126 -> 9;
            case 127 -> 1;
            case 128 -> 92;
            case 129 -> 235;
            case 130 -> 55;
            case 131 -> 153;
            case 132 -> 10;
            case 133 -> 245;
            case 134 -> 177;
            case 135 -> 119;
            case 136 -> 206;
            case 137 -> 7;
            case 138 -> 179;
            case 139 -> 211;
            case 140 -> 137;
            case 141 -> 44;
            case 142 -> 25;
            case 143 -> 116;
            case 144 -> 252;
            case 145 -> 196;
            case 146 -> 37;
            case 147 -> 121;
            case 148 -> 189;
            case 149 -> 220;
            case 150 -> 6;
            case 151 -> 84;
            case 152 -> 120;
            case 153 -> 197;
            case 154 -> 182;
            case 155 -> 5;
            case 156 -> 133;
            case 157 -> 63;
            case 158 -> 45;
            case 159 -> 109;
            case 160 -> 89;
            case 161 -> 172;
            case 162 -> 240;
            case 163 -> 251;
            case 164 -> 134;
            case 165 -> 3;
            case 166 -> 130;
            case 167 -> 91;
            case 168 -> 194;
            case 169 -> 0;
            case 170 -> 204;
            case 171 -> 129;
            case 172 -> 118;
            case 173 -> 205;
            case 174 -> 250;
            case 175 -> 43;
            case 176 -> 4;
            case 177 -> 114;
            case 178 -> 68;
            case 179 -> 103;
            case 180 -> 154;
            case 181 -> 39;
            case 182 -> 143;
            case 183 -> 201;
            case 184 -> 207;
            case 185 -> 213;
            case 186 -> 184;
            case 187 -> 122;
            case 188 -> 233;
            case 189 -> 110;
            case 190 -> 123;
            case 191 -> 222;
            case 192 -> 71;
            case 193 -> 24;
            case 194 -> 253;
            case 195 -> 51;
            case 196 -> 76;
            case 197 -> 80;
            case 198 -> 132;
            case 199 -> 17;
            case 200 -> 34;
            case 201 -> 171;
            case 202 -> 169;
            case 203 -> 223;
            case 204 -> 27;
            case 205 -> 77;
            case 206 -> 151;
            case 207 -> 74;
            case 208 -> 226;
            case 209 -> 152;
            case 210 -> 38;
            case 211 -> 186;
            case 212 -> 31;
            case 213 -> 40;
            case 214 -> 126;
            case 215 -> 62;
            case 216 -> 79;
            case 217 -> 168;
            case 218 -> 85;
            case 219 -> 225;
            case 220 -> 164;
            case 221 -> 249;
            case 222 -> 157;
            case 223 -> 65;
            case 224 -> 170;
            case 225 -> 124;
            case 226 -> 30;
            case 227 -> 161;
            case 228 -> 64;
            case 229 -> 113;
            case 230 -> 219;
            case 231 -> 106;
            case 232 -> 191;
            case 233 -> 139;
            case 234 -> 218;
            case 235 -> 35;
            case 236 -> 70;
            case 237 -> 111;
            case 238 -> 241;
            case 239 -> 98;
            case 240 -> 13;
            case 241 -> 176;
            case 242 -> 105;
            case 243 -> 49;
            case 244 -> 101;
            case 245 -> 50;
            case 246 -> 236;
            case 247 -> 69;
            case 248 -> 160;
            case 249 -> 159;
            case 250 -> 229;
            case 251 -> 193;
            case 252 -> 42;
            case 253 -> 81;
            case 254 -> 127;
            default -> 18;
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
