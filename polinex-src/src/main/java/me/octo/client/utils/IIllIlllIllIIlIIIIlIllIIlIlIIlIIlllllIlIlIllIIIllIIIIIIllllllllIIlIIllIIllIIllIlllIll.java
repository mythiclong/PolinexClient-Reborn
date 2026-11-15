package me.octo.client.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.sounds.SimpleSoundInstance;
import net.minecraft.sounds.SoundEvents;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll {
    public static <T> T listFiles(Object... args) { return null; } // PX-FIX ovld-var
   @NotNull
   public static IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static List<IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static Map<String, Float> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String[] a;
   private static String[] b;

   private IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll() {
   }

   private final File a() {
      String var10002 = me.octo.client.llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      short var10003 = 22073;
      short var10004 = 12097;
      File var1 = new File(var10002, "sounds/clicks");
      File var2 = var1;
      boolean var3 = false;

      try {
         if (!var2.exists()) {
            var2.mkdirs();
         }

         return var1;
      } catch (NoWhenBranchMatchedException var4) {
         throw (RuntimeException)a(var4);
      }
   }

   @NotNull
   public final List<IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> b() {
      File[] var10000;
      try {
         var10000 = this.a().listFiles((java.io.FileFilter)null);
         if (var10000 == null) {
            var10000 = new File[0];
         }
      } catch (NoWhenBranchMatchedException var12) {
         throw (RuntimeException)a(var12);
      }

      File[] var2 = var10000;
      boolean var3 = false;
      Iterable var13 = ArraysKt.sortedWith(
         var2,
         new IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll()
      );
      var3 = false;
      var var5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var13, 10));
      boolean var6 = false;

      for (Object var8 : var13) {
         File var9 = (File)var8;
         boolean var10 = false;
         IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll var10002 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         Intrinsics.checkNotNull(var9);
         var5.add(
            new IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               var10002.b(FilesKt.getNameWithoutExtension(var9)),
               new IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
                  var9
               )
            )
         );
      }

      List var1 = var5;
      return CollectionsKt.plus(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, var1);
   }

   @NotNull
   public final String[] c() {
      Iterable var1 = this.b();
      boolean var2 = false;
      var var4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var1, 10));
      boolean var5 = false;

      for (Object var7 : var1) {
         IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var8 = (IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var7;
         boolean var9 = false;
         var4.add(var8.a());
      }

      var var11 = var4;
      var2 = false;
      return ((String[])(Object)(var11.toArray(new String[0])));
   }

   @NotNull
   public final IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
      @NotNull String param1
   ) {
      Intrinsics.checkNotNullParameter(param1, "name");
      Object var6 = null;

      for (Object var8 : (Iterable)this.b()) {
         llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var7 = (llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var8;
         if (Intrinsics.areEqual(var7.a(), param1)) {
            var6 = var8;
            break;
         }
      }

      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10 = (llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var6;
      if (var10 == null) {
         var10 = (llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.get(1);
      }

      return var10;
   }

   public final void a(@NotNull String var1, float var2) {
      short var10001 = 22074;
      short var10002 = -24483;
      Intrinsics.checkNotNullParameter(var1, "name");
      this.a(this.a(var1), var2);
   }

   public final void a(
      @NotNull IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll param1,
      float param2
   ) {
      // Restored from the original bytecode (0x000-0x138): clamp the volume, apply the
      // per-name volume map, then dispatch on the sound source type.
      Intrinsics.checkNotNullParameter(param1, "entry");
      float var3 = kotlin.ranges.RangesKt.coerceIn(param2, 0.0F, 1.0F);
      Float var4 = (Float)IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.get(param1.a());
      float var5 = var3 * (var4 != null ? var4.floatValue() : 1.0F);
      IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid var6 = param1.b();
      if (var6 instanceof IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll) {
         return;
      }

      if (var6 instanceof IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll) {
         Minecraft var7 = Minecraft.getInstance();
         var7.execute(() -> a(var7, var5));
      } else if (var6 instanceof IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll) {
         me.octo.client.utils.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a("sounds/" + ((IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var6).a(), var5);
      } else if (var6 instanceof IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll) {
         me.octo.client.utils.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(((IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var6).a(), var5);
      } else {
         throw new kotlin.NoWhenBranchMatchedException();
      }
   }
   // PX-FIX W7-6: Kotlin default-argument bridges
   public static void a(
      IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll var0, String var1, float var2, int var3, Object var4
   ) {
      if ((var3 & 2) != 0) {
         var2 = 1.0F;
      }

      var0.a(var1, var2);
   }

   public static void a(
      IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll var0, IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1, float var2, int var3, Object var4
   ) {
      if ((var3 & 2) != 0) {
         var2 = 1.0F;
      }

      var0.a(var1, var2);
   }

   private final String b(String var1) {
      String var2 = StringsKt.trim(StringsKt.replace(StringsKt.replace(var1, '_', ' ', false), '-', ' ', false)).toString();

      boolean var10000;
      label27: {
         try {
            if (var2.length() == 0) {
               var10000 = true;
               break label27;
            }
         } catch (NoWhenBranchMatchedException var5) {
            throw (RuntimeException)a(var5);
         }

         var10000 = false;
      }

      try {
         if (var10000) {
            return var1;
         }
      } catch (NoWhenBranchMatchedException var4) {
         throw (RuntimeException)a(var4);
      }

      CharSequence var6 = var2;
      char[] var3 = new char[]{' '};
      return CollectionsKt.joinToString(
         StringsKt.split(var6, var3, false, 0),
         " ",
         "",
         "",
         -1,
         "...",
         IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll::c
      );
   }

   private static final boolean a(File param0) {
      return param0.isFile() && me.octo.client.utils.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().contains(kotlin.io.FilesKt.getExtension(param0).toLowerCase(java.util.Locale.ROOT));
   }

   private static final void a(Minecraft var0, float var1) {
      var0.getSoundManager().play(SimpleSoundInstance.forUI(SoundEvents.UI_BUTTON_CLICK.value(), 1.0F, var1));
   }

   private static final CharSequence c(String var0) {
      Intrinsics.checkNotNullParameter(var0, "it");
      String var2 = var0.toLowerCase(java.util.Locale.ROOT);
      Intrinsics.checkNotNullExpressionValue(var2, "toLowerCase(...)");
      if (var2.length() > 0) {
         char var3 = var2.charAt(0);
         StringBuilder var5 = new StringBuilder();
         var5.append(String.valueOf(var3).toUpperCase(java.util.Locale.ROOT));
         var5.append(var2.substring(1));
         return var5.toString();
      } else {
         return var2;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var22 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[26];
      int var3 = 0;
      String var2 = "\u008bd#ê\u0010C\u0014¹\u0098R\f\u0096ghÓÒ\u0098E'\u0001Á\u0003pJ©\u0004o\u007fÒË\u0007ò\u0004Q\u009bB[¸\u0004çæÃø\u0004_BB\u0097\u0010þ\u009eG¤«\u007f\u0095ÿÁ¶\t&>ðn;\u000fg\u0017í\u0097Ev¶Ì\u0095\u0082\u0096ä;'î\u000f\u009a\u00adRÀ²\u009cH\u0091K.h\u0096`i\u0085\u0007\u001bwö=Æwo\u0003\u0006b\u008d5|('EòÒ,WAA\b]aÝNöëU\u0093oËÊDÒ4@Ñò«v¥øöºc\bÕÅ\b>Õf÷¡\u0016é\u0098\u001d»\u0084\u0003¥´\u000e\u0005Ç¡\u008dÌ5\u0087§²\u009d\ruÕ|\u0002\u0019Ð\u0005è¼8/ä\b\u001d\u0093\u009bs.<¹Á\u000fAV)¿Ýs¥oõ\u009bØ\bòº×\u0005C£MÌJ\u000e\u009b¦k\u008bàæ¸âÓ°(Â8\u00ad\u0004ad\u0085S\u0005Ù·áÐh\u0010ºò\u0086Dµ\u0097j\u0014÷½!U;\u009eÎö\r®çÚç3Ô\u0096\u0088\u0093\u0010\u0007úd";
      int var4 = "\u008bd#ê\u0010C\u0014¹\u0098R\f\u0096ghÓÒ\u0098E'\u0001Á\u0003pJ©\u0004o\u007fÒË\u0007ò\u0004Q\u009bB[¸\u0004çæÃø\u0004_BB\u0097\u0010þ\u009eG¤«\u007f\u0095ÿÁ¶\t&>ðn;\u000fg\u0017í\u0097Ev¶Ì\u0095\u0082\u0096ä;'î\u000f\u009a\u00adRÀ²\u009cH\u0091K.h\u0096`i\u0085\u0007\u001bwö=Æwo\u0003\u0006b\u008d5|('EòÒ,WAA\b]aÝNöëU\u0093oËÊDÒ4@Ñò«v¥øöºc\bÕÅ\b>Õf÷¡\u0016é\u0098\u001d»\u0084\u0003¥´\u000e\u0005Ç¡\u008dÌ5\u0087§²\u009d\ruÕ|\u0002\u0019Ð\u0005è¼8/ä\b\u001d\u0093\u009bs.<¹Á\u000fAV)¿Ýs¥oõ\u009bØ\bòº×\u0005C£MÌJ\u000e\u009b¦k\u008bàæ¸âÓ°(Â8\u00ad\u0004ad\u0085S\u0005Ù·áÐh\u0010ºò\u0086Dµ\u0097j\u0014÷½!U;\u009eÎö\r®çÚç3Ô\u0096\u0088\u0093\u0010\u0007úd"
         .length();
      char var1 = 4;
      int var9 = -1;

      label52:
      while (true) {
         byte var10000 = 33;
         String var10001 = var2.substring(++var9, var9 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var28 = var10001.toCharArray();
               int var10004 = var28.length;
               int var6 = 0;
               byte var31 = var10000;
               var22 = var28;
               int var16 = var10004;
               byte var38;
               char[] var49;
               int var10006;
               if (var10004 <= 1) {
                  var49 = var28;
                  var38 = var10000;
                  var10006 = var6;
               } else {
                  var31 = var10000;
                  var16 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var49 = var28;
                  var38 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var49[var10006] = (char)(var49[var10006] ^ var38 ^ switch (var6 % 7) {
                     case 0 -> 43;
                     case 1 -> 108;
                     case 2 -> 7;
                     case 3 -> 127;
                     case 4 -> 50;
                     case 5 -> 18;
                     default -> 116;
                  });
                  var6++;
                  if (var31 == 0) {
                     var10006 = var31;
                     var49 = var22;
                     var38 = var31;
                  } else {
                     if (var16 <= var6) {
                        break;
                     }

                     var49 = var22;
                     var38 = var31;
                     var10006 = var6;
                  }
               }
            }

            String var33 = new String(var22).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var33;
                  if ((var9 += var1) >= var4) {
                     a = var5;
                     b = new String[26];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll();
                     IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[] var7 = new IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[7];
                     short var42 = 22060;
                     short var53 = -25231;
                     var7[0] = new IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        "Off",
                        IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     );
                     var42 = 22052;
                     var53 = -2591;
                     var7[1] = new IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        "Vanilla",
                        IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     );
                     var42 = 22061;
                     var53 = 24634;
                     short var65 = 22054;
                     short var72 = 987;
                     var7[2] = new IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        "Snap",
                        new IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                           "clicks/snap.ogg"
                        )
                     );
                     var42 = 22049;
                     var53 = 29328;
                     var65 = 22070;
                     var72 = 28403;
                     var7[3] = new IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        "Crisp",
                        new IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                           "clicks/crisp.ogg"
                        )
                     );
                     var42 = 22078;
                     var53 = -5764;
                     var65 = 22055;
                     var72 = -9406;
                     var7[4] = new IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        "Soft Pop",
                        new IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                           "clicks/soft.ogg"
                        )
                     );
                     var42 = 22062;
                     var53 = -10397;
                     var65 = 22079;
                     var72 = 15083;
                     var7[5] = new IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        "Plop",
                        new IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                           "clicks/plop.ogg"
                        )
                     );
                     var42 = 22053;
                     var53 = 12878;
                     var65 = 22051;
                     var72 = -31991;
                     var7[6] = new IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        "Pop",
                        new IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                           "clicks/pop.ogg"
                        )
                     );
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = CollectionsKt.listOf(var7);
                     Pair[] var10 = new Pair[2];
                     var10002 = 22059;
                     short var34 = 2563;
                     var10[0] = TuplesKt.to("Snap", 1.5F);
                     var10002 = 22076;
                     short var35 = -11712;
                     var10[1] = TuplesKt.to("Crisp", 1.5F);
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = MapsKt.mapOf(var10);
                     break pxClinit;
                  }

                  var1 = var2.charAt(var9);
                  break;
               default:
                  var5[var3++] = var33;
                  if ((var9 += var1) < var4) {
                     var1 = var2.charAt(var9);
                     continue label52;
                  }

                  var2 = "\u0090_\u0083\u000e\u0018Õ\u008d8~\u0096ç¡§\u0082\u0084Â\u0010Û%#1¬U>Üí4òôÑ:\u0003ò";
                  var4 = "\u0090_\u0083\u000e\u0018Õ\u008d8~\u0096ç¡§\u0082\u0084Â\u0010Û%#1¬U>Üí4òôÑ:\u0003ò".length();
                  var1 = 16;
                  var9 = -1;
            }

            var10000 = 94;
            var10001 = var2.substring(++var9, var9 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 22062) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 161;
            case 1 -> 105;
            case 2 -> 63;
            case 3 -> 210;
            case 4 -> 118;
            case 5 -> 96;
            case 6 -> 46;
            case 7 -> 197;
            case 8 -> 127;
            case 9 -> 50;
            case 10 -> 104;
            case 11 -> 42;
            case 12 -> 242;
            case 13 -> 215;
            case 14 -> 162;
            case 15 -> 157;
            case 16 -> 165;
            case 17 -> 154;
            case 18 -> 73;
            case 19 -> 209;
            case 20 -> 241;
            case 21 -> 135;
            case 22 -> 11;
            case 23 -> 56;
            case 24 -> 192;
            case 25 -> 75;
            case 26 -> 110;
            case 27 -> 16;
            case 28 -> 152;
            case 29 -> 177;
            case 30 -> 155;
            case 31 -> 139;
            case 32 -> 129;
            case 33 -> 136;
            case 34 -> 45;
            case 35 -> 237;
            case 36 -> 103;
            case 37 -> 254;
            case 38 -> 1;
            case 39 -> 6;
            case 40 -> 23;
            case 41 -> 184;
            case 42 -> 117;
            case 43 -> 21;
            case 44 -> 235;
            case 45 -> 160;
            case 46 -> 171;
            case 47 -> 189;
            case 48 -> 207;
            case 49 -> 183;
            case 50 -> 44;
            case 51 -> 225;
            case 52 -> 193;
            case 53 -> 143;
            case 54 -> 32;
            case 55 -> 201;
            case 56 -> 41;
            case 57 -> 55;
            case 58 -> 81;
            case 59 -> 51;
            case 60 -> 66;
            case 61 -> 249;
            case 62 -> 206;
            case 63 -> 187;
            case 64 -> 169;
            case 65 -> 68;
            case 66 -> 122;
            case 67 -> 226;
            case 68 -> 191;
            case 69 -> 244;
            case 70 -> 113;
            case 71 -> 24;
            case 72 -> 202;
            case 73 -> 54;
            case 74 -> 121;
            case 75 -> 195;
            case 76 -> 94;
            case 77 -> 57;
            case 78 -> 74;
            case 79 -> 168;
            case 80 -> 3;
            case 81 -> 188;
            case 82 -> 178;
            case 83 -> 250;
            case 84 -> 219;
            case 85 -> 124;
            case 86 -> 116;
            case 87 -> 142;
            case 88 -> 141;
            case 89 -> 53;
            case 90 -> 85;
            case 91 -> 22;
            case 92 -> 236;
            case 93 -> 248;
            case 94 -> 90;
            case 95 -> 101;
            case 96 -> 222;
            case 97 -> 216;
            case 98 -> 212;
            case 99 -> 58;
            case 100 -> 25;
            case 101 -> 4;
            case 102 -> 52;
            case 103 -> 214;
            case 104 -> 91;
            case 105 -> 86;
            case 106 -> 98;
            case 107 -> 88;
            case 108 -> 40;
            case 109 -> 205;
            case 110 -> 133;
            case 111 -> 240;
            case 112 -> 164;
            case 113 -> 175;
            case 114 -> 99;
            case 115 -> 10;
            case 116 -> 170;
            case 117 -> 158;
            case 118 -> 194;
            case 119 -> 92;
            case 120 -> 145;
            case 121 -> 153;
            case 122 -> 60;
            case 123 -> 131;
            case 124 -> 84;
            case 125 -> 35;
            case 126 -> 128;
            case 127 -> 65;
            case 128 -> 243;
            case 129 -> 146;
            case 130 -> 180;
            case 131 -> 36;
            case 132 -> 198;
            case 133 -> 130;
            case 134 -> 0;
            case 135 -> 8;
            case 136 -> 234;
            case 137 -> 147;
            case 138 -> 218;
            case 139 -> 43;
            case 140 -> 115;
            case 141 -> 97;
            case 142 -> 12;
            case 143 -> 204;
            case 144 -> 79;
            case 145 -> 111;
            case 146 -> 28;
            case 147 -> 100;
            case 148 -> 220;
            case 149 -> 13;
            case 150 -> 2;
            case 151 -> 156;
            case 152 -> 18;
            case 153 -> 137;
            case 154 -> 114;
            case 155 -> 253;
            case 156 -> 181;
            case 157 -> 159;
            case 158 -> 252;
            case 159 -> 87;
            case 160 -> 59;
            case 161 -> 230;
            case 162 -> 238;
            case 163 -> 93;
            case 164 -> 106;
            case 165 -> 221;
            case 166 -> 76;
            case 167 -> 138;
            case 168 -> 83;
            case 169 -> 33;
            case 170 -> 78;
            case 171 -> 199;
            case 172 -> 213;
            case 173 -> 17;
            case 174 -> 217;
            case 175 -> 245;
            case 176 -> 107;
            case 177 -> 26;
            case 178 -> 150;
            case 179 -> 30;
            case 180 -> 64;
            case 181 -> 89;
            case 182 -> 176;
            case 183 -> 163;
            case 184 -> 211;
            case 185 -> 38;
            case 186 -> 108;
            case 187 -> 14;
            case 188 -> 67;
            case 189 -> 47;
            case 190 -> 9;
            case 191 -> 223;
            case 192 -> 246;
            case 193 -> 172;
            case 194 -> 255;
            case 195 -> 231;
            case 196 -> 120;
            case 197 -> 196;
            case 198 -> 203;
            case 199 -> 227;
            case 200 -> 39;
            case 201 -> 247;
            case 202 -> 190;
            case 203 -> 49;
            case 204 -> 185;
            case 205 -> 72;
            case 206 -> 27;
            case 207 -> 112;
            case 208 -> 140;
            case 209 -> 179;
            case 210 -> 70;
            case 211 -> 62;
            case 212 -> 61;
            case 213 -> 102;
            case 214 -> 119;
            case 215 -> 233;
            case 216 -> 182;
            case 217 -> 229;
            case 218 -> 34;
            case 219 -> 126;
            case 220 -> 251;
            case 221 -> 173;
            case 222 -> 200;
            case 223 -> 166;
            case 224 -> 148;
            case 225 -> 174;
            case 226 -> 239;
            case 227 -> 144;
            case 228 -> 5;
            case 229 -> 109;
            case 230 -> 224;
            case 231 -> 149;
            case 232 -> 31;
            case 233 -> 19;
            case 234 -> 95;
            case 235 -> 167;
            case 236 -> 48;
            case 237 -> 69;
            case 238 -> 7;
            case 239 -> 80;
            case 240 -> 186;
            case 241 -> 20;
            case 242 -> 82;
            case 243 -> 134;
            case 244 -> 228;
            case 245 -> 125;
            case 246 -> 29;
            case 247 -> 71;
            case 248 -> 151;
            case 249 -> 77;
            case 250 -> 208;
            case 251 -> 132;
            case 252 -> 15;
            case 253 -> 232;
            case 254 -> 37;
            default -> 123;
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

   public abstract static sealed class PXEvMid
      permits IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll,
      IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll,
      IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll,
      IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public PXEvMid(Object... px) {
        }

      private static String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

      private PXEvMid() {
      }

      // jar: public <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
      public PXEvMid(kotlin.jvm.internal.DefaultConstructorMarker var0) {
         this();
      }

      public static void b(String var0) {
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var0;
      }

      public static String b() {
         return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      static {
         if (b() != null) {
            b("tVIhoc");
         }
      }

      public static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
         extends IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid {
         @NotNull
         private final File lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         private static String[] a;
         private static String[] b;

         public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(@NotNull File var1) {
            short var10001 = -25860;
            short var10002 = 20026;
            Intrinsics.checkNotNullParameter(var1, "file");
            super((kotlin.jvm.internal.DefaultConstructorMarker) null);
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
         }

         @NotNull
         public final File a() {
            return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         @NotNull
         public final File c() {
            return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         @NotNull
         public final IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
            @NotNull File var1
         ) {
            short var10001 = -25859;
            short var10002 = 12596;
            Intrinsics.checkNotNullParameter(var1, "file");
            return new IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
               var1
            );
         }

         // jar: public static a(L<self>;Ljava/io/File;ILjava/lang/Object;)L<self>; (Kotlin $default bridge)
         public static IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
            @NotNull IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var0,
            @NotNull File var1, int var2, @Nullable Object var3
         ) {
            if ((var2 & 1) != 0) {
               var1 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }
            return var0.a(var1);
         }

         @NotNull
         @Override
         public String toString() {
            short var10001 = -25858;
            short var10002 = 10952;
            return "External(file=" + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII + ")";
         }

         @Override
         public int hashCode() {
            return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
         }

         @Override
         public boolean equals(@Nullable Object var1) {
            String var2 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
            Object var10000 = this;
            if (var2 == null) {
               if (this == var1) {
                  return true;
               }

               var10000 = var1;
            }

            if (var2 == null) {
               if (!(
                  var10000 instanceof IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
               )) {
                  return false;
               }

               var10000 = var1;
            }

            IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = (IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var10000;
            boolean var4 = Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
            if (var2 == null) {
               if (!var4) {
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
            String var2 = "·î~û\u0004ì¢\u0015r\u000eKZ¾^Ú¹\u0001ê^\u0094\u0088Ñåá";
            int var4 = "·î~û\u0004ì¢\u0015r\u000eKZ¾^Ú¹\u0001ê^\u0094\u0088Ñåá".length();
            char var1 = 4;
            int var0 = -1;

            while (true) {
               char[] var10002;
               label38: {
                  char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                  int var10004 = var10003.length;
                  int var6 = 0;
                  byte var13 = 50;
                  var10002 = var10003;
                  int var8 = var10004;
                  byte var16;
                  char[] var10005;
                  int var10006;
                  if (var10004 <= 1) {
                     var10005 = var10003;
                     var16 = 50;
                     var10006 = var6;
                  } else {
                     var13 = 50;
                     var8 = var10004;
                     if (var10004 <= var6) {
                        break label38;
                     }

                     var10005 = var10003;
                     var16 = 50;
                     var10006 = var6;
                  }

                  while (true) {
                     var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                        case 0 -> 43;
                        case 1 -> 105;
                        case 2 -> 95;
                        case 3 -> 94;
                        case 4 -> 26;
                        case 5 -> 106;
                        default -> 48;
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
            int var2 = (var0 ^ -25860) & 65535;
            if (b[var2] == null) {
               char[] var3 = a[var2].toCharArray();

               short var4 = switch (var3[0] & 0xFF) {
                  case 0 -> 20;
                  case 1 -> 227;
                  case 2 -> 12;
                  case 3 -> 123;
                  case 4 -> 102;
                  case 5 -> 234;
                  case 6 -> 230;
                  case 7 -> 100;
                  case 8 -> 97;
                  case 9 -> 59;
                  case 10 -> 29;
                  case 11 -> 8;
                  case 12 -> 42;
                  case 13 -> 193;
                  case 14 -> 117;
                  case 15 -> 196;
                  case 16 -> 35;
                  case 17 -> 199;
                  case 18 -> 233;
                  case 19 -> 14;
                  case 20 -> 118;
                  case 21 -> 78;
                  case 22 -> 208;
                  case 23 -> 244;
                  case 24 -> 138;
                  case 25 -> 127;
                  case 26 -> 87;
                  case 27 -> 84;
                  case 28 -> 30;
                  case 29 -> 47;
                  case 30 -> 21;
                  case 31 -> 202;
                  case 32 -> 64;
                  case 33 -> 56;
                  case 34 -> 4;
                  case 35 -> 108;
                  case 36 -> 222;
                  case 37 -> 225;
                  case 38 -> 179;
                  case 39 -> 94;
                  case 40 -> 90;
                  case 41 -> 116;
                  case 42 -> 239;
                  case 43 -> 249;
                  case 44 -> 11;
                  case 45 -> 101;
                  case 46 -> 162;
                  case 47 -> 93;
                  case 48 -> 168;
                  case 49 -> 144;
                  case 50 -> 53;
                  case 51 -> 38;
                  case 52 -> 237;
                  case 53 -> 136;
                  case 54 -> 31;
                  case 55 -> 24;
                  case 56 -> 198;
                  case 57 -> 36;
                  case 58 -> 103;
                  case 59 -> 86;
                  case 60 -> 153;
                  case 61 -> 26;
                  case 62 -> 73;
                  case 63 -> 151;
                  case 64 -> 105;
                  case 65 -> 159;
                  case 66 -> 224;
                  case 67 -> 106;
                  case 68 -> 181;
                  case 69 -> 107;
                  case 70 -> 188;
                  case 71 -> 126;
                  case 72 -> 174;
                  case 73 -> 223;
                  case 74 -> 141;
                  case 75 -> 62;
                  case 76 -> 228;
                  case 77 -> 70;
                  case 78 -> 155;
                  case 79 -> 49;
                  case 80 -> 170;
                  case 81 -> 69;
                  case 82 -> 177;
                  case 83 -> 1;
                  case 84 -> 115;
                  case 85 -> 218;
                  case 86 -> 112;
                  case 87 -> 147;
                  case 88 -> 180;
                  case 89 -> 213;
                  case 90 -> 58;
                  case 91 -> 13;
                  case 92 -> 156;
                  case 93 -> 169;
                  case 94 -> 135;
                  case 95 -> 74;
                  case 96 -> 221;
                  case 97 -> 165;
                  case 98 -> 104;
                  case 99 -> 119;
                  case 100 -> 66;
                  case 101 -> 158;
                  case 102 -> 255;
                  case 103 -> 139;
                  case 104 -> 121;
                  case 105 -> 247;
                  case 106 -> 3;
                  case 107 -> 220;
                  case 108 -> 45;
                  case 109 -> 122;
                  case 110 -> 236;
                  case 111 -> 92;
                  case 112 -> 186;
                  case 113 -> 67;
                  case 114 -> 120;
                  case 115 -> 128;
                  case 116 -> 48;
                  case 117 -> 229;
                  case 118 -> 251;
                  case 119 -> 216;
                  case 120 -> 72;
                  case 121 -> 176;
                  case 122 -> 146;
                  case 123 -> 34;
                  case 124 -> 145;
                  case 125 -> 16;
                  case 126 -> 242;
                  case 127 -> 178;
                  case 128 -> 184;
                  case 129 -> 149;
                  case 130 -> 137;
                  case 131 -> 231;
                  case 132 -> 22;
                  case 133 -> 157;
                  case 134 -> 240;
                  case 135 -> 6;
                  case 136 -> 124;
                  case 137 -> 238;
                  case 138 -> 95;
                  case 139 -> 171;
                  case 140 -> 23;
                  case 141 -> 19;
                  case 142 -> 197;
                  case 143 -> 57;
                  case 144 -> 232;
                  case 145 -> 241;
                  case 146 -> 131;
                  case 147 -> 43;
                  case 148 -> 50;
                  case 149 -> 203;
                  case 150 -> 167;
                  case 151 -> 88;
                  case 152 -> 44;
                  case 153 -> 191;
                  case 154 -> 60;
                  case 155 -> 253;
                  case 156 -> 125;
                  case 157 -> 39;
                  case 158 -> 254;
                  case 159 -> 82;
                  case 160 -> 219;
                  case 161 -> 134;
                  case 162 -> 7;
                  case 163 -> 160;
                  case 164 -> 76;
                  case 165 -> 41;
                  case 166 -> 210;
                  case 167 -> 217;
                  case 168 -> 175;
                  case 169 -> 77;
                  case 170 -> 143;
                  case 171 -> 235;
                  case 172 -> 2;
                  case 173 -> 246;
                  case 174 -> 114;
                  case 175 -> 91;
                  case 176 -> 46;
                  case 177 -> 187;
                  case 178 -> 99;
                  case 179 -> 204;
                  case 180 -> 79;
                  case 181 -> 83;
                  case 182 -> 89;
                  case 183 -> 75;
                  case 184 -> 81;
                  case 185 -> 250;
                  case 186 -> 52;
                  case 187 -> 27;
                  case 188 -> 18;
                  case 189 -> 0;
                  case 190 -> 148;
                  case 191 -> 5;
                  case 192 -> 25;
                  case 193 -> 10;
                  case 194 -> 133;
                  case 195 -> 209;
                  case 196 -> 142;
                  case 197 -> 190;
                  case 198 -> 214;
                  case 199 -> 172;
                  case 200 -> 96;
                  case 201 -> 211;
                  case 202 -> 183;
                  case 203 -> 65;
                  case 204 -> 37;
                  case 205 -> 61;
                  case 206 -> 68;
                  case 207 -> 150;
                  case 208 -> 28;
                  case 209 -> 51;
                  case 210 -> 63;
                  case 211 -> 212;
                  case 212 -> 152;
                  case 213 -> 206;
                  case 214 -> 80;
                  case 215 -> 17;
                  case 216 -> 195;
                  case 217 -> 215;
                  case 218 -> 164;
                  case 219 -> 40;
                  case 220 -> 166;
                  case 221 -> 154;
                  case 222 -> 33;
                  case 223 -> 55;
                  case 224 -> 113;
                  case 225 -> 9;
                  case 226 -> 182;
                  case 227 -> 205;
                  case 228 -> 245;
                  case 229 -> 129;
                  case 230 -> 163;
                  case 231 -> 71;
                  case 232 -> 194;
                  case 233 -> 192;
                  case 234 -> 54;
                  case 235 -> 173;
                  case 236 -> 15;
                  case 237 -> 243;
                  case 238 -> 226;
                  case 239 -> 248;
                  case 240 -> 32;
                  case 241 -> 98;
                  case 242 -> 252;
                  case 243 -> 201;
                  case 244 -> 189;
                  case 245 -> 161;
                  case 246 -> 185;
                  case 247 -> 85;
                  case 248 -> 111;
                  case 249 -> 132;
                  case 250 -> 140;
                  case 251 -> 130;
                  case 252 -> 207;
                  case 253 -> 109;
                  case 254 -> 110;
                  default -> 200;
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

      public static final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll
         extends IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid {
         @NotNull
         public static IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll();

         private IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
            super((kotlin.jvm.internal.DefaultConstructorMarker) null);
         }
      }

      public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
         extends IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid {
         @NotNull
         private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         private static String[] a;
         private static String[] b;

         public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(@NotNull String var1) {
            short var10001 = -31570;
            short var10002 = -4150;
            Intrinsics.checkNotNullParameter(var1, "resourcePath");
            super((kotlin.jvm.internal.DefaultConstructorMarker) null);
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
         }

         @NotNull
         public final String a() {
            return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         @NotNull
         public final String c() {
            return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         @NotNull
         public final IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
            @NotNull String var1
         ) {
            short var10001 = -31569;
            short var10002 = -26537;
            Intrinsics.checkNotNullParameter(var1, "resourcePath");
            return new IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               var1
            );
         }

         // jar: public static a(L<self>;Ljava/lang/String;ILjava/lang/Object;)L<self>; (Kotlin $default bridge)
         public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
            @NotNull llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0,
            @NotNull String var1, int var2, @Nullable Object var3
         ) {
            if ((var2 & 1) != 0) {
               var1 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }
            return var0.a(var1);
         }

         @NotNull
         @Override
         public String toString() {
            short var10001 = -31572;
            short var10002 = 8653;
            return "Builtin(resourcePath=" + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII + ")";
         }

         @Override
         public int hashCode() {
            return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
         }

         @Override
         public boolean equals(@Nullable Object var1) {
            String var2 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
            Object var10000 = this;
            if (var2 == null) {
               if (this == var1) {
                  return true;
               }

               var10000 = var1;
            }

            if (var2 == null) {
               if (!(
                  var10000 instanceof IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
               )) {
                  return false;
               }

               var10000 = var1;
            }

            IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
            boolean var4 = Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
            if (var2 == null) {
               if (!var4) {
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
            String var2 = "?²SÜ\u0095¢È\u0098,@\u0087º\f9\u0090\u0093\u0098\u008d*Ë\u0089Lb\u008bþ\u0015\u001e\u0082[ËÌ8ÏþBl+¼Ä¥µ\u0087\u0012tûbz";
            int var4 = "?²SÜ\u0095¢È\u0098,@\u0087º\f9\u0090\u0093\u0098\u008d*Ë\u0089Lb\u008bþ\u0015\u001e\u0082[ËÌ8ÏþBl+¼Ä¥µ\u0087\u0012tûbz".length();
            char var1 = '\f';
            int var0 = -1;

            while (true) {
               char[] var10002;
               label38: {
                  char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                  int var10004 = var10003.length;
                  int var6 = 0;
                  byte var13 = 113;
                  var10002 = var10003;
                  int var8 = var10004;
                  byte var16;
                  char[] var10005;
                  int var10006;
                  if (var10004 <= 1) {
                     var10005 = var10003;
                     var16 = 113;
                     var10006 = var6;
                  } else {
                     var13 = 113;
                     var8 = var10004;
                     if (var10004 <= var6) {
                        break label38;
                     }

                     var10005 = var10003;
                     var16 = 113;
                     var10006 = var6;
                  }

                  while (true) {
                     var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                        case 0 -> 76;
                        case 1 -> 51;
                        case 2 -> 45;
                        case 3 -> 21;
                        case 4 -> 109;
                        case 5 -> 52;
                        default -> 48;
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
            int var2 = (var0 ^ -31570) & 65535;
            if (b[var2] == null) {
               char[] var3 = a[var2].toCharArray();

               short var4 = switch (var3[0] & 0xFF) {
                  case 0 -> 139;
                  case 1 -> 212;
                  case 2 -> 90;
                  case 3 -> 82;
                  case 4 -> 225;
                  case 5 -> 109;
                  case 6 -> 234;
                  case 7 -> 120;
                  case 8 -> 176;
                  case 9 -> 135;
                  case 10 -> 214;
                  case 11 -> 2;
                  case 12 -> 55;
                  case 13 -> 159;
                  case 14 -> 199;
                  case 15 -> 148;
                  case 16 -> 230;
                  case 17 -> 80;
                  case 18 -> 226;
                  case 19 -> 219;
                  case 20 -> 63;
                  case 21 -> 114;
                  case 22 -> 48;
                  case 23 -> 200;
                  case 24 -> 42;
                  case 25 -> 107;
                  case 26 -> 110;
                  case 27 -> 88;
                  case 28 -> 65;
                  case 29 -> 132;
                  case 30 -> 0;
                  case 31 -> 30;
                  case 32 -> 188;
                  case 33 -> 169;
                  case 34 -> 16;
                  case 35 -> 108;
                  case 36 -> 209;
                  case 37 -> 241;
                  case 38 -> 179;
                  case 39 -> 121;
                  case 40 -> 28;
                  case 41 -> 232;
                  case 42 -> 24;
                  case 43 -> 246;
                  case 44 -> 37;
                  case 45 -> 146;
                  case 46 -> 59;
                  case 47 -> 101;
                  case 48 -> 247;
                  case 49 -> 141;
                  case 50 -> 211;
                  case 51 -> 14;
                  case 52 -> 190;
                  case 53 -> 97;
                  case 54 -> 44;
                  case 55 -> 163;
                  case 56 -> 137;
                  case 57 -> 77;
                  case 58 -> 221;
                  case 59 -> 187;
                  case 60 -> 220;
                  case 61 -> 242;
                  case 62 -> 147;
                  case 63 -> 210;
                  case 64 -> 70;
                  case 65 -> 228;
                  case 66 -> 129;
                  case 67 -> 9;
                  case 68 -> 172;
                  case 69 -> 35;
                  case 70 -> 236;
                  case 71 -> 117;
                  case 72 -> 39;
                  case 73 -> 19;
                  case 74 -> 123;
                  case 75 -> 158;
                  case 76 -> 7;
                  case 77 -> 160;
                  case 78 -> 248;
                  case 79 -> 3;
                  case 80 -> 253;
                  case 81 -> 154;
                  case 82 -> 52;
                  case 83 -> 196;
                  case 84 -> 251;
                  case 85 -> 203;
                  case 86 -> 105;
                  case 87 -> 100;
                  case 88 -> 21;
                  case 89 -> 142;
                  case 90 -> 194;
                  case 91 -> 166;
                  case 92 -> 192;
                  case 93 -> 67;
                  case 94 -> 140;
                  case 95 -> 49;
                  case 96 -> 43;
                  case 97 -> 86;
                  case 98 -> 119;
                  case 99 -> 66;
                  case 100 -> 201;
                  case 101 -> 36;
                  case 102 -> 208;
                  case 103 -> 213;
                  case 104 -> 186;
                  case 105 -> 235;
                  case 106 -> 122;
                  case 107 -> 62;
                  case 108 -> 115;
                  case 109 -> 240;
                  case 110 -> 112;
                  case 111 -> 103;
                  case 112 -> 41;
                  case 113 -> 178;
                  case 114 -> 61;
                  case 115 -> 25;
                  case 116 -> 53;
                  case 117 -> 193;
                  case 118 -> 54;
                  case 119 -> 38;
                  case 120 -> 33;
                  case 121 -> 104;
                  case 122 -> 75;
                  case 123 -> 10;
                  case 124 -> 153;
                  case 125 -> 134;
                  case 126 -> 51;
                  case 127 -> 17;
                  case 128 -> 57;
                  case 129 -> 183;
                  case 130 -> 145;
                  case 131 -> 157;
                  case 132 -> 93;
                  case 133 -> 4;
                  case 134 -> 151;
                  case 135 -> 177;
                  case 136 -> 27;
                  case 137 -> 215;
                  case 138 -> 84;
                  case 139 -> 254;
                  case 140 -> 218;
                  case 141 -> 189;
                  case 142 -> 58;
                  case 143 -> 79;
                  case 144 -> 174;
                  case 145 -> 73;
                  case 146 -> 47;
                  case 147 -> 155;
                  case 148 -> 91;
                  case 149 -> 124;
                  case 150 -> 94;
                  case 151 -> 46;
                  case 152 -> 182;
                  case 153 -> 197;
                  case 154 -> 231;
                  case 155 -> 8;
                  case 156 -> 34;
                  case 157 -> 68;
                  case 158 -> 85;
                  case 159 -> 96;
                  case 160 -> 239;
                  case 161 -> 81;
                  case 162 -> 83;
                  case 163 -> 250;
                  case 164 -> 224;
                  case 165 -> 136;
                  case 166 -> 13;
                  case 167 -> 138;
                  case 168 -> 106;
                  case 169 -> 255;
                  case 170 -> 12;
                  case 171 -> 229;
                  case 172 -> 222;
                  case 173 -> 98;
                  case 174 -> 217;
                  case 175 -> 116;
                  case 176 -> 45;
                  case 177 -> 26;
                  case 178 -> 184;
                  case 179 -> 23;
                  case 180 -> 72;
                  case 181 -> 87;
                  case 182 -> 162;
                  case 183 -> 56;
                  case 184 -> 198;
                  case 185 -> 167;
                  case 186 -> 29;
                  case 187 -> 180;
                  case 188 -> 165;
                  case 189 -> 130;
                  case 190 -> 92;
                  case 191 -> 113;
                  case 192 -> 164;
                  case 193 -> 126;
                  case 194 -> 64;
                  case 195 -> 191;
                  case 196 -> 20;
                  case 197 -> 244;
                  case 198 -> 128;
                  case 199 -> 40;
                  case 200 -> 11;
                  case 201 -> 185;
                  case 202 -> 6;
                  case 203 -> 168;
                  case 204 -> 202;
                  case 205 -> 249;
                  case 206 -> 50;
                  case 207 -> 131;
                  case 208 -> 181;
                  case 209 -> 5;
                  case 210 -> 69;
                  case 211 -> 245;
                  case 212 -> 205;
                  case 213 -> 170;
                  case 214 -> 99;
                  case 215 -> 150;
                  case 216 -> 243;
                  case 217 -> 31;
                  case 218 -> 118;
                  case 219 -> 156;
                  case 220 -> 216;
                  case 221 -> 18;
                  case 222 -> 227;
                  case 223 -> 204;
                  case 224 -> 143;
                  case 225 -> 74;
                  case 226 -> 207;
                  case 227 -> 60;
                  case 228 -> 95;
                  case 229 -> 175;
                  case 230 -> 32;
                  case 231 -> 1;
                  case 232 -> 149;
                  case 233 -> 127;
                  case 234 -> 152;
                  case 235 -> 238;
                  case 236 -> 233;
                  case 237 -> 252;
                  case 238 -> 173;
                  case 239 -> 206;
                  case 240 -> 161;
                  case 241 -> 111;
                  case 242 -> 237;
                  case 243 -> 125;
                  case 244 -> 102;
                  case 245 -> 89;
                  case 246 -> 171;
                  case 247 -> 133;
                  case 248 -> 78;
                  case 249 -> 15;
                  case 250 -> 76;
                  case 251 -> 223;
                  case 252 -> 195;
                  case 253 -> 71;
                  case 254 -> 144;
                  default -> 22;
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

      public static final class llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll
         extends IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid {
         @NotNull
         public static IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll();

         private llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll() {
            super((kotlin.jvm.internal.DefaultConstructorMarker) null);
         }
      }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @NotNull
      private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         @NotNull String var1,
         @NotNull IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid var2
      ) {
         short var10001 = -16994;
         short var10002 = -29856;
         Intrinsics.checkNotNullParameter(var1, "displayName");
         var10001 = -16999;
         var10002 = -606;
         Intrinsics.checkNotNullParameter(var2, "source");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      }

      @NotNull
      public final String a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final String c() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid d() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         @NotNull String var1,
         @NotNull IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid var2
      ) {
         short var10001 = -17000;
         short var10002 = 22197;
         Intrinsics.checkNotNullParameter(var1, "displayName");
         var10001 = -16993;
         var10002 = -17203;
         Intrinsics.checkNotNullParameter(var2, "source");
         return new IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10002 = -16998;
         short var10003 = 2827;
         var10003 = -16997;
         short var10004 = -29446;
         return "Entry(displayName="
            + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            + ", source="
            + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         return var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
         Object var10000 = this;
         if (var2 == null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == null) {
            if (!(
               var10000 instanceof IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         boolean var4 = Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         );
         if (var2 == null) {
            if (!var4) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
         }

         if (var2 == null) {
            if (!var4) {
               return false;
            }

            var4 = true;
         }

         return var4;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[6];
         int var3 = 0;
         String var2 = "õYñ¿\u009aüîHñ\u0012OvåÀó÷I4¬';7\u0004à9è\u009a?\u0006\u0089\"ÌkíÏ\u000b\u0084ø\u009eônzPÂ#'\u0093";
         int var4 = "õYñ¿\u009aüîHñ\u0012OvåÀó÷I4¬';7\u0004à9è\u009a?\u0006\u0089\"ÌkíÏ\u000b\u0084ø\u009eônzPÂ#'\u0093".length();
         char var1 = '\t';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 37;
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
                        case 0 -> 32;
                        case 1 -> 50;
                        case 2 -> 16;
                        case 3 -> 24;
                        case 4 -> 79;
                        case 5 -> 121;
                        default -> 109;
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
                        b = new String[6];
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

                     var2 = "õê\u0097¦R¢\u000bcW¶Õ¿\u008a¾\b*ªf";
                     var4 = "õê\u0097¦R¢\u000bcW¶Õ¿\u008a¾\b*ªf".length();
                     var1 = 6;
                     var8 = -1;
               }

               var10000 = 51;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -16997) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 189;
               case 1 -> 19;
               case 2 -> 48;
               case 3 -> 190;
               case 4 -> 86;
               case 5 -> 193;
               case 6 -> 250;
               case 7 -> 194;
               case 8 -> 128;
               case 9 -> 42;
               case 10 -> 139;
               case 11 -> 39;
               case 12 -> 183;
               case 13 -> 244;
               case 14 -> 205;
               case 15 -> 125;
               case 16 -> 90;
               case 17 -> 62;
               case 18 -> 71;
               case 19 -> 52;
               case 20 -> 126;
               case 21 -> 232;
               case 22 -> 34;
               case 23 -> 18;
               case 24 -> 216;
               case 25 -> 240;
               case 26 -> 40;
               case 27 -> 79;
               case 28 -> 142;
               case 29 -> 228;
               case 30 -> 94;
               case 31 -> 127;
               case 32 -> 184;
               case 33 -> 173;
               case 34 -> 38;
               case 35 -> 119;
               case 36 -> 68;
               case 37 -> 72;
               case 38 -> 21;
               case 39 -> 247;
               case 40 -> 242;
               case 41 -> 155;
               case 42 -> 20;
               case 43 -> 136;
               case 44 -> 230;
               case 45 -> 120;
               case 46 -> 83;
               case 47 -> 141;
               case 48 -> 102;
               case 49 -> 204;
               case 50 -> 80;
               case 51 -> 149;
               case 52 -> 134;
               case 53 -> 210;
               case 54 -> 84;
               case 55 -> 186;
               case 56 -> 116;
               case 57 -> 146;
               case 58 -> 12;
               case 59 -> 160;
               case 60 -> 74;
               case 61 -> 17;
               case 62 -> 222;
               case 63 -> 110;
               case 64 -> 25;
               case 65 -> 61;
               case 66 -> 87;
               case 67 -> 51;
               case 68 -> 67;
               case 69 -> 105;
               case 70 -> 93;
               case 71 -> 24;
               case 72 -> 95;
               case 73 -> 106;
               case 74 -> 252;
               case 75 -> 64;
               case 76 -> 129;
               case 77 -> 111;
               case 78 -> 2;
               case 79 -> 176;
               case 80 -> 59;
               case 81 -> 47;
               case 82 -> 11;
               case 83 -> 201;
               case 84 -> 73;
               case 85 -> 117;
               case 86 -> 202;
               case 87 -> 254;
               case 88 -> 239;
               case 89 -> 253;
               case 90 -> 100;
               case 91 -> 77;
               case 92 -> 214;
               case 93 -> 246;
               case 94 -> 0;
               case 95 -> 157;
               case 96 -> 171;
               case 97 -> 225;
               case 98 -> 91;
               case 99 -> 131;
               case 100 -> 255;
               case 101 -> 159;
               case 102 -> 203;
               case 103 -> 234;
               case 104 -> 109;
               case 105 -> 182;
               case 106 -> 224;
               case 107 -> 1;
               case 108 -> 88;
               case 109 -> 178;
               case 110 -> 161;
               case 111 -> 138;
               case 112 -> 76;
               case 113 -> 31;
               case 114 -> 223;
               case 115 -> 175;
               case 116 -> 187;
               case 117 -> 233;
               case 118 -> 248;
               case 119 -> 124;
               case 120 -> 215;
               case 121 -> 16;
               case 122 -> 33;
               case 123 -> 6;
               case 124 -> 28;
               case 125 -> 82;
               case 126 -> 54;
               case 127 -> 199;
               case 128 -> 156;
               case 129 -> 208;
               case 130 -> 113;
               case 131 -> 118;
               case 132 -> 23;
               case 133 -> 66;
               case 134 -> 174;
               case 135 -> 154;
               case 136 -> 249;
               case 137 -> 96;
               case 138 -> 135;
               case 139 -> 237;
               case 140 -> 163;
               case 141 -> 198;
               case 142 -> 114;
               case 143 -> 241;
               case 144 -> 226;
               case 145 -> 49;
               case 146 -> 236;
               case 147 -> 206;
               case 148 -> 166;
               case 149 -> 151;
               case 150 -> 177;
               case 151 -> 98;
               case 152 -> 196;
               case 153 -> 191;
               case 154 -> 211;
               case 155 -> 197;
               case 156 -> 213;
               case 157 -> 231;
               case 158 -> 200;
               case 159 -> 46;
               case 160 -> 212;
               case 161 -> 36;
               case 162 -> 148;
               case 163 -> 27;
               case 164 -> 144;
               case 165 -> 115;
               case 166 -> 57;
               case 167 -> 60;
               case 168 -> 92;
               case 169 -> 89;
               case 170 -> 229;
               case 171 -> 22;
               case 172 -> 209;
               case 173 -> 44;
               case 174 -> 121;
               case 175 -> 5;
               case 176 -> 172;
               case 177 -> 37;
               case 178 -> 101;
               case 179 -> 180;
               case 180 -> 195;
               case 181 -> 137;
               case 182 -> 238;
               case 183 -> 245;
               case 184 -> 108;
               case 185 -> 15;
               case 186 -> 251;
               case 187 -> 140;
               case 188 -> 103;
               case 189 -> 192;
               case 190 -> 169;
               case 191 -> 29;
               case 192 -> 63;
               case 193 -> 217;
               case 194 -> 145;
               case 195 -> 45;
               case 196 -> 55;
               case 197 -> 122;
               case 198 -> 8;
               case 199 -> 181;
               case 200 -> 185;
               case 201 -> 97;
               case 202 -> 14;
               case 203 -> 9;
               case 204 -> 167;
               case 205 -> 165;
               case 206 -> 218;
               case 207 -> 207;
               case 208 -> 219;
               case 209 -> 43;
               case 210 -> 162;
               case 211 -> 104;
               case 212 -> 10;
               case 213 -> 150;
               case 214 -> 188;
               case 215 -> 227;
               case 216 -> 70;
               case 217 -> 132;
               case 218 -> 26;
               case 219 -> 78;
               case 220 -> 220;
               case 221 -> 32;
               case 222 -> 65;
               case 223 -> 221;
               case 224 -> 3;
               case 225 -> 170;
               case 226 -> 147;
               case 227 -> 158;
               case 228 -> 235;
               case 229 -> 143;
               case 230 -> 56;
               case 231 -> 123;
               case 232 -> 35;
               case 233 -> 152;
               case 234 -> 75;
               case 235 -> 41;
               case 236 -> 58;
               case 237 -> 153;
               case 238 -> 13;
               case 239 -> 164;
               case 240 -> 30;
               case 241 -> 81;
               case 242 -> 7;
               case 243 -> 69;
               case 244 -> 53;
               case 245 -> 168;
               case 246 -> 107;
               case 247 -> 99;
               case 248 -> 4;
               case 249 -> 130;
               case 250 -> 85;
               case 251 -> 133;
               case 252 -> 179;
               case 253 -> 112;
               case 254 -> 50;
               default -> 243;
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
   
      // PX-FIX-ok: Kotlin $default bridge (synthetic; jar body translated 1:1)
      public static final me.octo.client.utils.IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(me.octo.client.utils.IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0, java.lang.String var1, me.octo.client.utils.IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid var2, int var3, java.lang.Object var4) {
         java.lang.String var5 = me.octo.client.utils.IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
         if ((var3 & 1) != 0) {
            if (var5 == null) {
               var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            }
         }
         if ((var3 & 2) != 0) {
            var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }
         return var0.a(var1, var2);
      }
}
}
