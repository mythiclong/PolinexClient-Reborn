package me.octo.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileWriter;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.io.Closeable;
import java.awt.Desktop;
import me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
import java.io.Reader;
import com.google.gson.reflect.TypeToken;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;

public final class lIlIlIIIlllIlllIIIlIIIlIIlIIIlIllllllllIlIlIIlllIllIIIllllIlllIIIIlIIlIIIIIlllIlIllll {
   @NotNull
   public static lIlIlIIIlllIlllIIIlIIIlIIlIIIlIllllllllIlIlIIlllIllIIIllllIlllIIIIlIIlIIIIIlllIlIllll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static Gson lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static File IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static List<String> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @Nullable
   private static List<String> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static String[] a;
   private static String[] b;

   private lIlIlIIIlllIlllIIIlIIIlIIlIIIlIllllllllIlIlIIlllIllIIIllllIlllIIIIlIIlIIIIIlllIlIllll() {
   }

   public final void a(@NotNull List<String> var1) {
      short var10001 = -27971;
      short var10002 = -24362;
      Intrinsics.checkNotNullParameter(var1, "messages");
      this.b(var1);
   }

   @NotNull
   public final List<String> a() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @NotNull
   public final List<String> b() {
      String[] var1 = IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.e();
      List var10000 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      if (var1 != null) {
         if (IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII != null) {
            var10000 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            Intrinsics.checkNotNull(IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
            return var10000;
         }

         this.c();
         var10000 = d();
      }

      return var10000;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public final void c() {
      String[] var1 = IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.e();

      label26: {
         try {
            boolean var10000 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.exists();
            if (var1 == null) {
               break label26;
            }

            if (var10000) {
               return;
            }
         } catch (Exception var5) {
            throw (RuntimeException)a(var5);
         }

         try {
            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.createNewFile();
         } catch (Exception var4) {
            String var6 = var4.getMessage();
            short var10001 = -27973;
            short var10002 = -19157;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "Failed to create failsafe messages file: " + var6
            );
            return;
         }
      }

      try {
         short var8 = -28026;
         this.b(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         short var10 = 23361;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Created failsafe messages file");
      } catch (Exception var3) {
         String var7 = var3.getMessage();
         short var9 = -27973;
         short var11 = -19157;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
            "Failed to create failsafe messages file: " + var7
         );
      }
   }

   @JvmStatic
   @NotNull
   public static final List<String> d() {
      String[] var0 = IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.e();
      try {
         java.lang.reflect.Type var1 = (new lIlIlIIIlllIlllIIIlIIIlIIlIIIlIllllllllIlIlIIlllIllIIIllllIlllIIIIlIIlIIIIIlllIlIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll()).getType();
         java.io.FileReader var2 = new java.io.FileReader(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         try {
            List var3 = var0 != null ? (List)lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.fromJson(var2, var1) : null;
            List var4 = var3 != null ? var3 : lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var4;
            return var4;
         } finally {
            CloseableKt.closeFinally(var2, null);
         }
      } catch (Exception var5) {
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Failed to load failsafe messages:" + var5.getMessage());
         IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }
   }

   @JvmStatic
   public static final boolean e() {
      String[] var10000 = IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.e();
      List var1 = d();
      String[] var0 = var10000;
      int var3 = var1.size();
      if (var0 != null) {
         if (var3 != lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.size()) {
            return (0 != 0);
         }

         var3 = ((Intrinsics.areEqual(
            CollectionsKt.toSet(var1), CollectionsKt.toSet(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI)
         )) ? 1 : 0);
      }

      if (var0 == null) {
         return (var3 != 0);
      } else {
         return (var3 != 0);
      }
   }

   private final void b(List<String> var1) {
      try {
         var var2 = new FileWriter(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         Throwable var3 = null;

         try {
            FileWriter var4 = var2;
            boolean var5 = false;
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.toJson(var1, var4);
            Unit var12 = Unit.INSTANCE;
         } catch (Throwable var9) {
            var3 = var9;
            throw var9;
         } finally {
            CloseableKt.closeFinally(var2, var3);
         }

         IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
      } catch (Exception var11) {
         String var10000 = var11.getMessage();
         short var10001 = -27979;
         short var10002 = 2714;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
            "Failed to save failsafe messages: " + var10000
         );
      }
   }

   public final void f() {
      String[] var10000 = IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.e();
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = null;
      String[] var1 = var10000;
      d();
      int var2 = var1 != null && IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII != null
         ? IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.size()
         : 0;
      short var10001 = -28028;
      short var10002 = 3675;
      var10002 = -27997;
      short var10003 = -27742;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
         "Reloaded failsafe messages (" + var2 + " messages)"
      );
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.b(new String[4]);
      }
   }

   public final void g() {
      String[] var1 = IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.e();
      this.c();
      if (var1 != null) {
         try {
            if (java.awt.Desktop.isDesktopSupported()) {
               java.awt.Desktop.getDesktop().open(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
            } else {
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Desktop is not supported, file located at:" + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.getAbsolutePath());
            }
         } catch (Exception var2) {
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Failed to open messages file:" + var2.getMessage());
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[42];
      int var3 = 0;
      String var2 = "QùÛ6F\u009e¸\u0007\u0000¢H¥\u0016Á!õÖiGÌy\u0012\u0085@ã¯\u009a6\u00050\u0094\u0091\u0017à(\u0005£ävb\u0003\r\u0082\u000e?\u007fÑö\u0015,\u000b)$\u008e\u0014\n3H)i\u007fL\u000f\u0018gí\u000b¿\u008b\u0006xãE\u0082xb\u0092\u0089\u0007m=ÌË ®h\u0007\u009fÙôMðt'\u0003¹e4\tb]\u0007]@\u0096\u0013Å+\u0003ñ\u0017Ï\u0003\u0086d%\t\u0097\u0089¹Ç\u0097Åé¯t\nÖK»\u001aÄoóãd¬\u0003\u008dþN\u001e%6M4h\u001e~æú\baµÖ<\u008a7\u001e\u0086\u0099±Ó§ü\u00137Ï=BÅß\u0004{÷:y\u0003Ý!J\"¡QÝØz\u0083<U²~tjøÿ>.\u008cÕP\u0090\u0010ÐT\u009eýr\u0011nçÉÚ\u0012Hb\u0007\u0081R¸³\u0015\u008e\u001b\u0006\u0081a\u001e~\u008d©\bç$\u007fõ\u0099ïQU\u0003¹ûÞ\u0007Öü\u0010i-\u0011§\u0003X7_\u0007\u000f]\u000f=#ök\b\u0094\u0015/Ëy\u001e\u009d\u0082\u0006\u008e\u0018\\%.Y)\"´\u00addt\u0014ý§\u008a c²\u001b\u0091gd8ð¢Àï\u0096\u0003§\u009b\u009eÊ\bSÅ\u0018\u0011ËÇ\n:r\u008f¼Êc\u0004\u0010]\u008a\n\u0010)\u008eÔØ¹QÉæ\u0002Ç®\u0003ØZo\u0016\u000bbý\u0086Iÿ\u0015ýÚû\u001e!\bÎ\u0094\u0096]Çú\u009a÷\u001eåyü¡Â\u0001\\p{E\u007fiÅ7z°ËaØ\u0082;\u0095c\u0094G\u009b\u008e¤®Ë\u0003ï\u008a\u0016\u001c\u0016«¸\u0000wû\\J\u001cÉ\u0015\u001a\u009eîêØ{B+\u0014L\u0081\u008bD\u008a\u0090¥½\":¦®&\u0014\\ñ®\u000b\u0001\\\u008b\u0016\r\u0016Q\u0089:ðm\u0004oÖi\u00ad\u008c\u001b±¦2òmM\u008d\u0003\u00946q\u0003öm0\u0007`=`\u0093\fÉQ";
      int var4 = "QùÛ6F\u009e¸\u0007\u0000¢H¥\u0016Á!õÖiGÌy\u0012\u0085@ã¯\u009a6\u00050\u0094\u0091\u0017à(\u0005£ävb\u0003\r\u0082\u000e?\u007fÑö\u0015,\u000b)$\u008e\u0014\n3H)i\u007fL\u000f\u0018gí\u000b¿\u008b\u0006xãE\u0082xb\u0092\u0089\u0007m=ÌË ®h\u0007\u009fÙôMðt'\u0003¹e4\tb]\u0007]@\u0096\u0013Å+\u0003ñ\u0017Ï\u0003\u0086d%\t\u0097\u0089¹Ç\u0097Åé¯t\nÖK»\u001aÄoóãd¬\u0003\u008dþN\u001e%6M4h\u001e~æú\baµÖ<\u008a7\u001e\u0086\u0099±Ó§ü\u00137Ï=BÅß\u0004{÷:y\u0003Ý!J\"¡QÝØz\u0083<U²~tjøÿ>.\u008cÕP\u0090\u0010ÐT\u009eýr\u0011nçÉÚ\u0012Hb\u0007\u0081R¸³\u0015\u008e\u001b\u0006\u0081a\u001e~\u008d©\bç$\u007fõ\u0099ïQU\u0003¹ûÞ\u0007Öü\u0010i-\u0011§\u0003X7_\u0007\u000f]\u000f=#ök\b\u0094\u0015/Ëy\u001e\u009d\u0082\u0006\u008e\u0018\\%.Y)\"´\u00addt\u0014ý§\u008a c²\u001b\u0091gd8ð¢Àï\u0096\u0003§\u009b\u009eÊ\bSÅ\u0018\u0011ËÇ\n:r\u008f¼Êc\u0004\u0010]\u008a\n\u0010)\u008eÔØ¹QÉæ\u0002Ç®\u0003ØZo\u0016\u000bbý\u0086Iÿ\u0015ýÚû\u001e!\bÎ\u0094\u0096]Çú\u009a÷\u001eåyü¡Â\u0001\\p{E\u007fiÅ7z°ËaØ\u0082;\u0095c\u0094G\u009b\u008e¤®Ë\u0003ï\u008a\u0016\u001c\u0016«¸\u0000wû\\J\u001cÉ\u0015\u001a\u009eîêØ{B+\u0014L\u0081\u008bD\u008a\u0090¥½\":¦®&\u0014\\ñ®\u000b\u0001\\\u008b\u0016\r\u0016Q\u0089:ðm\u0004oÖi\u00ad\u008c\u001b±¦2òmM\u008d\u0003\u00946q\u0003öm0\u0007`=`\u0093\fÉQ"
         .length();
      char var1 = '\f';
      int var9 = -1;

      label52:
      while (true) {
         byte var10000 = 123;
         String var10001 = var2.substring(++var9, var9 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var58 = var10001.toCharArray();
               int var10004 = var58.length;
               int var6 = 0;
               byte var61 = var10000;
               var21 = var58;
               int var15 = var10004;
               byte var99;
               char[] var104;
               int var10006;
               if (var10004 <= 1) {
                  var104 = var58;
                  var99 = var10000;
                  var10006 = var6;
               } else {
                  var61 = var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var104 = var58;
                  var99 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var104[var10006] = (char)(var104[var10006] ^ var99 ^ switch (var6 % 7) {
                     case 0 -> 32;
                     case 1 -> 103;
                     case 2 -> 30;
                     case 3 -> 43;
                     case 4 -> 55;
                     case 5 -> 108;
                     default -> 104;
                  });
                  var6++;
                  if (var61 == 0) {
                     var10006 = var61;
                     var104 = var21;
                     var99 = var61;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var104 = var21;
                     var99 = var61;
                     var10006 = var6;
                  }
               }
            }

            String var63 = new String(var21).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var63;
                  if ((var9 += var1) >= var4) {
                     a = var5;
                     b = new String[42];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIlIlIIIlllIlllIIIlIIIlIIlIIIlIllllllllIlIlIIlllIllIIIllllIlllIIIIlIIlIIIIIlllIlIllll();
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new GsonBuilder().setPrettyPrinting().create();
                     String var25 = llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a();
                     short var64 = -27994;
                     short var103 = 26118;
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new File(var25, "failsafe_messages.json");
                     String[] var7 = new String[33];
                     var10002 = -27991;
                     short var65 = -27232;
                     var7[0] = "wth";
                     var10002 = -27978;
                     short var66 = -30672;
                     var7[1] = "wtf";
                     var10002 = -27985;
                     short var67 = -32257;
                     var7[2] = "huh";
                     var10002 = -27974;
                     short var68 = -2307;
                     var7[3] = "lag?";
                     var10002 = -27983;
                     short var69 = 19794;
                     var7[4] = "???";
                     var10002 = -27999;
                     short var70 = 5398;
                     var7[5] = "server?";
                     var10002 = -27993;
                     short var71 = 32362;
                     var7[6] = "wtf was that";
                     var10002 = -27980;
                     short var72 = 5275;
                     var7[7] = "lagging";
                     var10002 = -28017;
                     short var73 = 7832;
                     var7[8] = "what";
                     var10002 = -27987;
                     short var74 = 23481;
                     var7[9] = "wtf";
                     var10002 = -28030;
                     short var75 = 32748;
                     var7[10] = "wat";
                     var10002 = -27977;
                     short var76 = -17307;
                     var7[11] = "bruh";
                     var10002 = -28025;
                     short var77 = 29809;
                     var7[12] = "bro what";
                     var10002 = -27989;
                     short var78 = 21499;
                     var7[13] = "hi admins";
                     var10002 = -27981;
                     short var79 = -352;
                     var7[14] = "admin?";
                     var10002 = -27996;
                     short var80 = -10466;
                     var7[15] = "can u not lol";
                     var10002 = -27998;
                     short var81 = -22183;
                     var7[16] = "wtf is this";
                     var10002 = -27975;
                     short var82 = -9479;
                     var7[17] = "wtf is happening";
                     var10002 = -27986;
                     short var83 = -15637;
                     var7[18] = "hi admins";
                     var10002 = -28000;
                     short var84 = 24941;
                     var7[19] = "hello!!";
                     var10002 = -27995;
                     short var85 = -18763;
                     var7[20] = "hiiii";
                     var10002 = -27969;
                     short var86 = -8954;
                     var7[21] = "hi?";
                     var10002 = -27988;
                     short var87 = -25864;
                     var7[22] = "WTF";
                     var7[23] = "?";
                     var10002 = -28031;
                     short var88 = 14842;
                     var7[24] = "why";
                     var10002 = -27970;
                     short var89 = -10801;
                     var7[25] = "why tho";
                     var10002 = -27972;
                     short var90 = 29635;
                     var7[26] = "no way";
                     var10002 = -27990;
                     short var91 = 6629;
                     var7[27] = "seriously?";
                     var10002 = -28032;
                     short var92 = -31345;
                     var7[28] = "come on";
                     var10002 = -27982;
                     short var93 = 19910;
                     var7[29] = "lol what";
                     var10002 = -28027;
                     short var94 = 27981;
                     var7[30] = "omg";
                     var10002 = -27984;
                     short var95 = 28882;
                     var7[31] = "finally";
                     var10002 = -27976;
                     short var96 = 8953;
                     var7[32] = "finally lol";
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = CollectionsKt.listOf(var7);
                     break pxClinit;
                  }

                  var1 = var2.charAt(var9);
                  break;
               default:
                  var5[var3++] = var63;
                  if ((var9 += var1) < var4) {
                     var1 = var2.charAt(var9);
                     continue label52;
                  }

                  var2 = "v\u0090\u0097\u007f+<@\u0099Ö\u0015\u0001\u001d\u0094ed´°oôYÆÛÉ\u009f\u009aÊ³ÑI£®\t\u00adñE^qÏ\u001e/®\u001cê\u0016\u009b 1È";
                  var4 = "v\u0090\u0097\u007f+<@\u0099Ö\u0015\u0001\u001d\u0094ed´°oôYÆÛÉ\u009f\u009aÊ³ÑI£®\t\u00adñE^qÏ\u001e/®\u001cê\u0016\u009b 1È"
                     .length();
                  var1 = 4;
                  var9 = -1;
            }

            var10000 = 60;
            var10001 = var2.substring(++var9, var9 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static Throwable a(Throwable var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -27993) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 9;
            case 1 -> 142;
            case 2 -> 253;
            case 3 -> 155;
            case 4 -> 163;
            case 5 -> 205;
            case 6 -> 99;
            case 7 -> 34;
            case 8 -> 136;
            case 9 -> 202;
            case 10 -> 237;
            case 11 -> 152;
            case 12 -> 22;
            case 13 -> 251;
            case 14 -> 203;
            case 15 -> 144;
            case 16 -> 89;
            case 17 -> 56;
            case 18 -> 53;
            case 19 -> 194;
            case 20 -> 184;
            case 21 -> 109;
            case 22 -> 36;
            case 23 -> 129;
            case 24 -> 168;
            case 25 -> 105;
            case 26 -> 113;
            case 27 -> 96;
            case 28 -> 20;
            case 29 -> 241;
            case 30 -> 17;
            case 31 -> 165;
            case 32 -> 35;
            case 33 -> 0;
            case 34 -> 247;
            case 35 -> 19;
            case 36 -> 157;
            case 37 -> 103;
            case 38 -> 76;
            case 39 -> 2;
            case 40 -> 159;
            case 41 -> 223;
            case 42 -> 186;
            case 43 -> 132;
            case 44 -> 195;
            case 45 -> 93;
            case 46 -> 15;
            case 47 -> 75;
            case 48 -> 41;
            case 49 -> 217;
            case 50 -> 64;
            case 51 -> 169;
            case 52 -> 92;
            case 53 -> 120;
            case 54 -> 209;
            case 55 -> 85;
            case 56 -> 119;
            case 57 -> 154;
            case 58 -> 77;
            case 59 -> 55;
            case 60 -> 210;
            case 61 -> 250;
            case 62 -> 28;
            case 63 -> 178;
            case 64 -> 133;
            case 65 -> 79;
            case 66 -> 208;
            case 67 -> 58;
            case 68 -> 191;
            case 69 -> 108;
            case 70 -> 81;
            case 71 -> 176;
            case 72 -> 16;
            case 73 -> 167;
            case 74 -> 26;
            case 75 -> 214;
            case 76 -> 51;
            case 77 -> 60;
            case 78 -> 50;
            case 79 -> 175;
            case 80 -> 102;
            case 81 -> 71;
            case 82 -> 61;
            case 83 -> 141;
            case 84 -> 172;
            case 85 -> 245;
            case 86 -> 11;
            case 87 -> 29;
            case 88 -> 104;
            case 89 -> 243;
            case 90 -> 161;
            case 91 -> 182;
            case 92 -> 130;
            case 93 -> 73;
            case 94 -> 66;
            case 95 -> 180;
            case 96 -> 143;
            case 97 -> 57;
            case 98 -> 118;
            case 99 -> 230;
            case 100 -> 54;
            case 101 -> 84;
            case 102 -> 187;
            case 103 -> 225;
            case 104 -> 90;
            case 105 -> 150;
            case 106 -> 123;
            case 107 -> 44;
            case 108 -> 204;
            case 109 -> 97;
            case 110 -> 94;
            case 111 -> 13;
            case 112 -> 213;
            case 113 -> 6;
            case 114 -> 244;
            case 115 -> 67;
            case 116 -> 156;
            case 117 -> 101;
            case 118 -> 40;
            case 119 -> 1;
            case 120 -> 4;
            case 121 -> 236;
            case 122 -> 27;
            case 123 -> 135;
            case 124 -> 139;
            case 125 -> 224;
            case 126 -> 18;
            case 127 -> 146;
            case 128 -> 107;
            case 129 -> 21;
            case 130 -> 206;
            case 131 -> 39;
            case 132 -> 147;
            case 133 -> 72;
            case 134 -> 63;
            case 135 -> 177;
            case 136 -> 171;
            case 137 -> 211;
            case 138 -> 215;
            case 139 -> 24;
            case 140 -> 125;
            case 141 -> 231;
            case 142 -> 233;
            case 143 -> 70;
            case 144 -> 252;
            case 145 -> 62;
            case 146 -> 188;
            case 147 -> 106;
            case 148 -> 164;
            case 149 -> 122;
            case 150 -> 14;
            case 151 -> 95;
            case 152 -> 181;
            case 153 -> 111;
            case 154 -> 10;
            case 155 -> 221;
            case 156 -> 242;
            case 157 -> 249;
            case 158 -> 196;
            case 159 -> 170;
            case 160 -> 115;
            case 161 -> 138;
            case 162 -> 48;
            case 163 -> 128;
            case 164 -> 160;
            case 165 -> 239;
            case 166 -> 121;
            case 167 -> 38;
            case 168 -> 185;
            case 169 -> 116;
            case 170 -> 220;
            case 171 -> 23;
            case 172 -> 145;
            case 173 -> 32;
            case 174 -> 216;
            case 175 -> 91;
            case 176 -> 46;
            case 177 -> 149;
            case 178 -> 86;
            case 179 -> 98;
            case 180 -> 114;
            case 181 -> 112;
            case 182 -> 162;
            case 183 -> 235;
            case 184 -> 127;
            case 185 -> 248;
            case 186 -> 183;
            case 187 -> 200;
            case 188 -> 246;
            case 189 -> 190;
            case 190 -> 68;
            case 191 -> 140;
            case 192 -> 31;
            case 193 -> 74;
            case 194 -> 207;
            case 195 -> 42;
            case 196 -> 193;
            case 197 -> 137;
            case 198 -> 226;
            case 199 -> 173;
            case 200 -> 30;
            case 201 -> 201;
            case 202 -> 45;
            case 203 -> 179;
            case 204 -> 87;
            case 205 -> 218;
            case 206 -> 7;
            case 207 -> 52;
            case 208 -> 124;
            case 209 -> 88;
            case 210 -> 234;
            case 211 -> 69;
            case 212 -> 166;
            case 213 -> 8;
            case 214 -> 255;
            case 215 -> 228;
            case 216 -> 151;
            case 217 -> 100;
            case 218 -> 229;
            case 219 -> 254;
            case 220 -> 189;
            case 221 -> 110;
            case 222 -> 148;
            case 223 -> 240;
            case 224 -> 12;
            case 225 -> 78;
            case 226 -> 117;
            case 227 -> 82;
            case 228 -> 198;
            case 229 -> 192;
            case 230 -> 153;
            case 231 -> 238;
            case 232 -> 59;
            case 233 -> 83;
            case 234 -> 219;
            case 235 -> 131;
            case 236 -> 3;
            case 237 -> 80;
            case 238 -> 212;
            case 239 -> 47;
            case 240 -> 232;
            case 241 -> 134;
            case 242 -> 199;
            case 243 -> 65;
            case 244 -> 5;
            case 245 -> 126;
            case 246 -> 197;
            case 247 -> 158;
            case 248 -> 37;
            case 249 -> 227;
            case 250 -> 222;
            case 251 -> 25;
            case 252 -> 174;
            case 253 -> 43;
            case 254 -> 33;
            default -> 49;
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
