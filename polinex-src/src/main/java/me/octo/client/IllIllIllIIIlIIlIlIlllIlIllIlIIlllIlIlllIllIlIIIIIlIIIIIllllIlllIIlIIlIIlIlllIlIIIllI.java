package me.octo.client;

import java.io.File;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII;
import me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.List;
import java.util.Locale;
import kotlin.ranges.RangesKt;
import okhttp3.Response;
import okhttp3.ResponseBody;
import kotlin.Result;
import kotlin.ResultKt;
import java.net.URLEncoder;
import me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI;

public final class IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI {
   @NotNull
   public static IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static OkHttpClient IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static Lazy lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static ConcurrentHashMap<String, String> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static ConcurrentHashMap<String, Boolean> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static String IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static int lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private static long[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static String[] a;
   private static String[] b;

   public static final String a(IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI var0, llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll var1, File var2) {
      return var0.a(var1, var2);
   }

   public static final String b(IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI var0, llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll var1, File var2) {
      return var0.c(var1, var2);
   }

   public static final String c(IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI var0, llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll var1, File var2) {
      return var0.b(var1, var2);
   }

   public static final String d(IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI var0, llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll var1, File var2) {
      return var0.d(var1, var2);
   }

   private IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI() {
   }

   private final File a() {
      Lazy var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      return (File)var1.getValue();
   }

   @Nullable
   public final String a(@NotNull llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll var1) {
      String var10000 = llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.u();
      short var10002 = -19148;
      short var10003 = -11765;
      Intrinsics.checkNotNullParameter(var1, "track");
      String var3 = var1.j();
      String var2 = var10000;
      String var4 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.get(var3);
      var10000 = var4;
      if (var2 != null) {
         if (var4 != null) {
            short var10001 = -19154;
            var10002 = 9616;
            return Intrinsics.areEqual(var4, "__NOT_FOUND__") ? null : var4;
         }

         var10000 = String.valueOf(IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.putIfAbsent(var3, true));
      }

      if (var10000 != null) {
         return null;
      } else {
         IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(null);
         return null;
      }
   }

   private final String b(llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll param1) {
      String var3 = param1.b().trim();
      String var4 = param1.a().trim();
      if (var3.length() == 0 && StringsKt.isBlank(param1.i())) {
         return null;
      }

      String var5 = StringsKt.isBlank(param1.i())
         ? var4.toLowerCase(Locale.ROOT) + "|" + var3.toLowerCase(Locale.ROOT) + "|" + param1.c().toLowerCase(Locale.ROOT)
         : param1.i();
      String var6 = this.c(var5);
      File var7 = new File(this.a(), var6 + ".jpg");
      if (var7.exists() && var7.length() > 256L) {
         return var7.getAbsolutePath();
      }

      var var8 = CollectionsKt.listOf(new kotlin.reflect.KFunction[]{new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(this), new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(this), new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(this), new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(this)});
      var var9 = var8.iterator();

      while (var9.hasNext()) {
         Function2 var10 = (Function2)var9.next();

         for (int var11 = 0; var11 < 2; var11++) {
            try {
               String var12 = (String)var10.invoke(param1, var7);
               if (var12 != null) {
                  return var12;
               }
            } catch (Exception var12) {
               lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("album art source " + var10 + " attempt " + (var11 + 1) + " failed: " + var12.getMessage());
               if (var11 < 1) {
                  try {
                     Thread.sleep(IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[RangesKt.coerceAtMost(var11, IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.length - 1)]);
                  } catch (InterruptedException var13) {
                     return null;
                  }
               }
            }
         }
      }

      return null;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokevirtual me/octo/client/llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.b ()Ljava/lang/String;
      // 004: checkcast java/lang/CharSequence
      // 007: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
      // 00a: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 00d: astore 3
      // 00e: invokestatic me/octo/client/llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.u ()Ljava/lang/String;
      // 011: aload 1
      // 012: invokevirtual me/octo/client/llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.a ()Ljava/lang/String;
      // 015: checkcast java/lang/CharSequence
      // 018: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
      // 01b: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 01e: astore 4
      // 020: astore 2
      // 021: aload 3
      // 022: checkcast java/lang/CharSequence
      // 025: invokeinterface java/lang/CharSequence.length ()I 1
      // 02a: aload 2
      // 02b: ifnull 039
      // 02e: ifne 03c
      // 031: goto 038
      // 034: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 037: athrow
      // 038: bipush 1
      // 039: goto 03d
      // 03c: bipush 0
      // 03d: ifeq 065
      // 040: aload 1
      // 041: invokevirtual me/octo/client/llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.i ()Ljava/lang/String;
      // 044: checkcast java/lang/CharSequence
      // 047: invokestatic kotlin/text/StringsKt.isBlank (Ljava/lang/CharSequence;)Z
      // 04a: aload 2
      // 04b: ifnull 06f
      // 04e: goto 055
      // 051: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 054: athrow
      // 055: ifeq 065
      // 058: goto 05f
      // 05b: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05e: athrow
      // 05f: aconst_null
      // 060: areturn
      // 061: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 064: athrow
      // 065: aload 1
      // 066: invokevirtual me/octo/client/llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.i ()Ljava/lang/String;
      // 069: checkcast java/lang/CharSequence
      // 06c: invokestatic kotlin/text/StringsKt.isBlank (Ljava/lang/CharSequence;)Z
      // 06f: aload 2
      // 070: ifnull 07e
      // 073: ifne 081
      // 076: goto 07d
      // 079: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07c: athrow
      // 07d: bipush 1
      // 07e: goto 082
      // 081: bipush 0
      // 082: ifeq 090
      // 085: aload 1
      // 086: invokevirtual me/octo/client/llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.i ()Ljava/lang/String;
      // 089: goto 0d5
      // 08c: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08f: athrow
      // 090: aload 4
      // 092: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 095: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 098: dup
      // 099: sipush -19195
      // 09c: sipush 23022
      // 09f: pop2
      // 0a0: ldc "toLowerCase(...)"
      // 0a2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0a5: aload 3
      // 0a6: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 0a9: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 0ac: dup
      // 0ad: sipush -19194
      // 0b0: sipush -20044
      // 0b3: pop2
      // 0b4: ldc "toLowerCase(...)"
      // 0b6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0b9: aload 1
      // 0ba: invokevirtual me/octo/client/llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.c ()Ljava/lang/String;
      // 0bd: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 0c0: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 0c3: dup
      // 0c4: sipush -19194
      // 0c7: sipush -20044
      // 0ca: pop2
      // 0cb: ldc "toLowerCase(...)"
      // 0cd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0d0: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001|\u0001|\u0001" ]
      // 0d5: astore 5
      // 0d7: aload 0
      // 0d8: aload 5
      // 0da: invokespecial me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.c (Ljava/lang/String;)Ljava/lang/String;
      // 0dd: astore 6
      // 0df: new java/io/File
      // 0e2: dup
      // 0e3: aload 0
      // 0e4: invokespecial me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a ()Ljava/io/File;
      // 0e7: aload 6
      // 0e9: sipush -19164
      // 0ec: sipush 15795
      // 0ef: pop2
      // 0f0: ldc ".jpg"
      // 0f2: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 0f7: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 0fa: astore 7
      // 0fc: aload 7
      // 0fe: invokevirtual java/io/File.exists ()Z
      // 101: aload 2
      // 102: ifnull 138
      // 105: ifeq 137
      // 108: goto 10f
      // 10b: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10e: athrow
      // 10f: aload 7
      // 111: invokevirtual java/io/File.length ()J
      // 114: ldc2_w 256
      // 117: lcmp
      // 118: aload 2
      // 119: ifnull 138
      // 11c: goto 123
      // 11f: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 122: athrow
      // 123: ifle 137
      // 126: goto 12d
      // 129: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12c: athrow
      // 12d: aload 7
      // 12f: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 132: areturn
      // 133: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 136: athrow
      // 137: bipush 4
      // 138: anewarray 225
      // 13b: astore 9
      // 13d: aload 9
      // 13f: bipush 0
      // 140: new me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 143: dup
      // 144: aload 0
      // 145: invokespecial me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.<init> (Ljava/lang/Object;)V
      // 148: aastore
      // 149: aload 9
      // 14b: bipush 1
      // 14c: new me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
      // 14f: dup
      // 150: aload 0
      // 151: invokespecial me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.<init> (Ljava/lang/Object;)V
      // 154: aastore
      // 155: aload 9
      // 157: bipush 2
      // 158: new me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
      // 15b: dup
      // 15c: aload 0
      // 15d: invokespecial me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.<init> (Ljava/lang/Object;)V
      // 160: aastore
      // 161: aload 9
      // 163: bipush 3
      // 164: new me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll
      // 167: dup
      // 168: aload 0
      // 169: invokespecial me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.<init> (Ljava/lang/Object;)V
      // 16c: aastore
      // 16d: aload 9
      // 16f: invokestatic kotlin/collections/CollectionsKt.listOf ([Ljava/lang/Object;)Ljava/util/List;
      // 172: astore 8
      // 174: aload 8
      // 176: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 17b: astore 9
      // 17d: aload 9
      // 17f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 184: ifeq 23b
      // 187: aload 9
      // 189: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 18e: checkcast kotlin/jvm/functions/Function2
      // 191: astore 10
      // 193: bipush 0
      // 194: istore 11
      // 196: iload 11
      // 198: aload 2
      // 199: ifnull 184
      // 19c: bipush 2
      // 19d: if_icmpge 17d
      // 1a0: nop
      // 1a1: aload 10
      // 1a3: aload 1
      // 1a4: aload 7
      // 1a6: invokeinterface kotlin/jvm/functions/Function2.invoke (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1ab: checkcast java/lang/String
      // 1ae: astore 12
      // 1b0: aload 2
      // 1b1: ifnull 1c7
      // 1b4: aload 12
      // 1b6: dup
      // 1b7: ifnull 1c6
      // 1ba: goto 1c1
      // 1bd: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c0: athrow
      // 1c1: areturn
      // 1c2: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c5: athrow
      // 1c6: pop
      // 1c7: goto 17d
      // 1ca: astore 12
      // 1cc: aload 10
      // 1ce: iload 11
      // 1d0: bipush 1
      // 1d1: iadd
      // 1d2: aload 12
      // 1d4: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 1d7: astore 14
      // 1d9: istore 15
      // 1db: astore 16
      // 1dd: sipush -19166
      // 1e0: sipush 12404
      // 1e3: pop2
      // 1e4: ldc_w "album art source "
      // 1e7: aload 16
      // 1e9: sipush -19163
      // 1ec: sipush 24168
      // 1ef: pop2
      // 1f0: ldc_w " attempt "
      // 1f3: iload 15
      // 1f5: sipush -19145
      // 1f8: sipush -18898
      // 1fb: pop2
      // 1fc: ldc_w " failed: "
      // 1ff: aload 14
      // 201: invokedynamic makeConcatWithConstants (Ljava/lang/String;Lkotlin/jvm/functions/Function2;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001\u0001" ]
      // 206: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b (Ljava/lang/String;)V
      // 209: aload 2
      // 20a: ifnull 237
      // 20d: iload 11
      // 20f: bipush 1
      // 210: if_icmpge 234
      // 213: goto 21a
      // 216: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 219: athrow
      // 21a: nop
      // 21b: getstatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII [J
      // 21e: iload 11
      // 220: getstatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII [J
      // 223: arraylength
      // 224: bipush 1
      // 225: isub
      // 226: invokestatic kotlin/ranges/RangesKt.coerceAtMost (II)I
      // 229: laload
      // 22a: invokestatic java/lang/Thread.sleep (J)V
      // 22d: goto 234
      // 230: astore 13
      // 232: aconst_null
      // 233: areturn
      // 234: iinc 11 1
      // 237: aload 2
      // 238: ifnonnull 196
      // 23b: aconst_null
      // 23c: areturn
   }

   private final String a(llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll var1, File var2) {
      String var10000 = llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.u();
      String var4 = StringsKt.trim(var1.i()).toString();
      String var3 = var10000;
      int var5 = var4.length();
      if (var3 != null) {
         var5 = var5 == 0 ? 1 : 0;
      }

      return var5 != 0 ? null : this.a(this.a(var4), var2);
   }

   private final String b(llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll param1, File param2) {
      String var10000 = llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.u();
      String var4 = StringsKt.trim((CharSequence)param1.b()).toString();
      String var3 = var10000;
      String var5 = StringsKt.trim((CharSequence)param1.a()).toString();
      int var6 = var4.length();
      if (var3 != null) {
         var6 = var6 == 0 ? 1 : 0;
      }

      if (var6 != 0) {
         return null;
      }

      int var7 = var5.length();
      if (var3 != null) {
         var7 = var7 == 0 ? 1 : 0;
      }

      if (var7 != 0) {
         return null;
      }

      String var8;
      try {
         var8 = URLEncoder.encode(StringsKt.take(var5 + " " + var4, 180), "UTF-8");
      } catch (java.io.UnsupportedEncodingException var17) {
         throw new RuntimeException(var17);
      }

      String var9 = "https://itunes.apple.com/search?term=" + var8 + "&media=music&entity=musicTrack&limit=1";
      if (var3 == null) {
         return null;
      }

      String var10;
      try {
         var10 = this.b(var9);
      } catch (java.io.IOException var18) {
         throw new RuntimeException(var18);
      }

      if (var10 == null) {
         return null;
      }

      JsonObject var11;
      try {
         var11 = JsonParser.parseString(var10).getAsJsonObject();
      } catch (Throwable var19) {
         var11 = null;
      }

      if (var11 == null) {
         return null;
      }

      if (var3 == null) {
         return null;
      }

      com.google.gson.JsonArray var12 = var11.getAsJsonArray("results");
      if (var12 == null) {
         return null;
      }

      if (var3 == null) {
         return null;
      }

      if (var12.size() == 0) {
         return null;
      }

      JsonObject var13 = var12.get(0).getAsJsonObject();
      if (var3 == null) {
         return null;
      }

      com.google.gson.JsonElement var14 = var13.get("artworkUrl100");
      if (var14 == null) {
         return null;
      }

      String var15 = var14.getAsString();
      if (var15 == null) {
         return null;
      }

      return this.a(this.a(var15), param2);
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.u ()Ljava/lang/String;
      // 003: aload 1
      // 004: invokevirtual me/octo/client/llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.b ()Ljava/lang/String;
      // 007: checkcast java/lang/CharSequence
      // 00a: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
      // 00d: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 010: astore 4
      // 012: astore 3
      // 013: aload 1
      // 014: invokevirtual me/octo/client/llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.a ()Ljava/lang/String;
      // 017: checkcast java/lang/CharSequence
      // 01a: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
      // 01d: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 020: astore 5
      // 022: aload 4
      // 024: checkcast java/lang/CharSequence
      // 027: invokeinterface java/lang/CharSequence.length ()I 1
      // 02c: aload 3
      // 02d: ifnull 03b
      // 030: ifne 03e
      // 033: goto 03a
      // 036: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 039: athrow
      // 03a: bipush 1
      // 03b: goto 03f
      // 03e: bipush 0
      // 03f: ifne 069
      // 042: aload 5
      // 044: checkcast java/lang/CharSequence
      // 047: invokeinterface java/lang/CharSequence.length ()I 1
      // 04c: aload 3
      // 04d: ifnull 062
      // 050: goto 057
      // 053: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 056: athrow
      // 057: ifne 065
      // 05a: goto 061
      // 05d: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 060: athrow
      // 061: bipush 1
      // 062: goto 066
      // 065: bipush 0
      // 066: ifeq 06f
      // 069: aconst_null
      // 06a: areturn
      // 06b: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06e: athrow
      // 06f: aload 5
      // 071: aload 4
      // 073: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001 \u0001" ]
      // 078: sipush 180
      // 07b: invokestatic kotlin/text/StringsKt.take (Ljava/lang/String;I)Ljava/lang/String;
      // 07e: sipush -19176
      // 081: sipush -4238
      // 084: pop2
      // 085: ldc_w "UTF-8"
      // 088: invokestatic java/net/URLEncoder.encode (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 08b: astore 6
      // 08d: aload 6
      // 08f: sipush -19157
      // 092: sipush 24642
      // 095: pop2
      // 096: ldc_w "https://itunes.apple.com/search?term="
      // 099: swap
      // 09a: sipush -19196
      // 09d: sipush -22296
      // 0a0: pop2
      // 0a1: ldc_w "&media=music&entity=musicTrack&limit=1"
      // 0a4: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 0a9: astore 7
      // 0ab: aload 3
      // 0ac: ifnull 0c8
      // 0af: aload 0
      // 0b0: aload 7
      // 0b2: invokespecial me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.b (Ljava/lang/String;)Ljava/lang/String;
      // 0b5: dup
      // 0b6: ifnonnull 0ca
      // 0b9: goto 0c0
      // 0bc: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bf: athrow
      // 0c0: pop
      // 0c1: goto 0c8
      // 0c4: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c7: athrow
      // 0c8: aconst_null
      // 0c9: areturn
      // 0ca: astore 8
      // 0cc: aload 0
      // 0cd: astore 11
      // 0cf: nop
      // 0d0: getstatic kotlin/Result.Companion Lkotlin/Result$Companion;
      // 0d3: pop
      // 0d4: aload 11
      // 0d6: checkcast me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI
      // 0d9: astore 12
      // 0db: bipush 0
      // 0dc: istore 13
      // 0de: aload 8
      // 0e0: invokestatic com/google/gson/JsonParser.parseString (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 0e3: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 0e6: invokestatic kotlin/Result.constructor-impl (Ljava/lang/Object;)Ljava/lang/Object;
      // 0e9: astore 12
      // 0eb: goto 0fe
      // 0ee: astore 13
      // 0f0: getstatic kotlin/Result.Companion Lkotlin/Result$Companion;
      // 0f3: pop
      // 0f4: aload 13
      // 0f6: invokestatic kotlin/ResultKt.createFailure (Ljava/lang/Throwable;)Ljava/lang/Object;
      // 0f9: invokestatic kotlin/Result.constructor-impl (Ljava/lang/Object;)Ljava/lang/Object;
      // 0fc: astore 12
      // 0fe: aload 12
      // 100: astore 11
      // 102: aload 11
      // 104: invokestatic kotlin/Result.isFailure-impl (Ljava/lang/Object;)Z
      // 107: ifeq 112
      // 10a: aconst_null
      // 10b: goto 114
      // 10e: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 111: athrow
      // 112: aload 11
      // 114: checkcast com/google/gson/JsonObject
      // 117: dup
      // 118: ifnonnull 122
      // 11b: pop
      // 11c: aconst_null
      // 11d: areturn
      // 11e: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 121: athrow
      // 122: astore 9
      // 124: aload 3
      // 125: ifnull 14a
      // 128: aload 9
      // 12a: sipush -19182
      // 12d: sipush -6329
      // 130: pop2
      // 131: ldc_w "results"
      // 134: invokevirtual com/google/gson/JsonObject.getAsJsonArray (Ljava/lang/String;)Lcom/google/gson/JsonArray;
      // 137: dup
      // 138: ifnonnull 14c
      // 13b: goto 142
      // 13e: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 141: athrow
      // 142: pop
      // 143: goto 14a
      // 146: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 149: athrow
      // 14a: aconst_null
      // 14b: areturn
      // 14c: astore 10
      // 14e: aload 10
      // 150: aload 3
      // 151: ifnull 16d
      // 154: invokevirtual com/google/gson/JsonArray.size ()I
      // 157: ifne 167
      // 15a: goto 161
      // 15d: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 160: athrow
      // 161: aconst_null
      // 162: areturn
      // 163: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 166: athrow
      // 167: aload 10
      // 169: bipush 0
      // 16a: invokevirtual com/google/gson/JsonArray.get (I)Lcom/google/gson/JsonElement;
      // 16d: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 170: astore 11
      // 172: aload 3
      // 173: ifnull 1a6
      // 176: aload 11
      // 178: sipush -19177
      // 17b: sipush 19794
      // 17e: pop2
      // 17f: ldc_w "artworkUrl100"
      // 182: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 185: dup
      // 186: ifnull 19e
      // 189: goto 190
      // 18c: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18f: athrow
      // 190: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 193: dup
      // 194: ifnonnull 1a8
      // 197: goto 19e
      // 19a: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19d: athrow
      // 19e: pop
      // 19f: goto 1a6
      // 1a2: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a5: athrow
      // 1a6: aconst_null
      // 1a7: areturn
      // 1a8: astore 12
      // 1aa: aload 0
      // 1ab: aload 0
      // 1ac: aload 12
      // 1ae: invokespecial me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/String;)Ljava/lang/String;
      // 1b1: aload 2
      // 1b2: invokespecial me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/String;Ljava/io/File;)Ljava/lang/String;
      // 1b5: areturn
   }

   private final String c(llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll param1, File param2) {
      String var10000 = llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.u();
      String var4 = StringsKt.trim((CharSequence)param1.b()).toString();
      String var3 = var10000;
      String var5 = StringsKt.trim((CharSequence)param1.a()).toString();
      int var6 = var4.length();
      if (var3 != null) {
         var6 = var6 == 0 ? 1 : 0;
      }

      if (var6 != 0) {
         return null;
      }

      int var7 = var5.length();
      if (var3 != null) {
         var7 = var7 == 0 ? 1 : 0;
      }

      if (var7 != 0) {
         return null;
      }

      String var8;
      try {
         var8 = URLEncoder.encode("artist:\"" + var5 + "\" track:\"" + var4 + "\"", "UTF-8");
      } catch (java.io.UnsupportedEncodingException var16) {
         throw new RuntimeException(var16);
      }

      String var9 = "https://api.deezer.com/search?q=" + var8 + "&limit=1";
      if (var3 == null) {
         return null;
      }

      String var10;
      try {
         var10 = this.b(var9);
      } catch (java.io.IOException var17) {
         throw new RuntimeException(var17);
      }

      if (var10 == null) {
         return null;
      }

      JsonObject var11;
      try {
         var11 = JsonParser.parseString(var10).getAsJsonObject();
      } catch (Throwable var18) {
         var11 = null;
      }

      if (var11 == null) {
         return null;
      }

      if (var3 == null) {
         return null;
      }

      com.google.gson.JsonArray var12 = var11.getAsJsonArray("data");
      if (var12 == null) {
         return null;
      }

      if (var3 == null) {
         return null;
      }

      if (var12.size() == 0) {
         return null;
      }

      JsonObject var13 = var12.get(0).getAsJsonObject().getAsJsonObject("album");
      if (var13 == null) {
         return null;
      }

      com.google.gson.JsonElement var14 = var13.get("cover_xl");
      String var15 = var14 == null ? null : var14.getAsString();
      if (var15 == null) {
         var14 = var13.get("cover_big");
         var15 = var14 == null ? null : var14.getAsString();
      }

      if (var15 == null) {
         var14 = var13.get("cover_medium");
         var15 = var14 == null ? null : var14.getAsString();
      }

      if (var15 == null) {
         return null;
      }

      return this.a(var15, param2);
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.u ()Ljava/lang/String;
      // 003: aload 1
      // 004: invokevirtual me/octo/client/llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.b ()Ljava/lang/String;
      // 007: checkcast java/lang/CharSequence
      // 00a: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
      // 00d: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 010: astore 4
      // 012: astore 3
      // 013: aload 1
      // 014: invokevirtual me/octo/client/llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.a ()Ljava/lang/String;
      // 017: checkcast java/lang/CharSequence
      // 01a: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
      // 01d: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 020: astore 5
      // 022: aload 4
      // 024: checkcast java/lang/CharSequence
      // 027: invokeinterface java/lang/CharSequence.length ()I 1
      // 02c: aload 3
      // 02d: ifnull 03b
      // 030: ifne 03e
      // 033: goto 03a
      // 036: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 039: athrow
      // 03a: bipush 1
      // 03b: goto 03f
      // 03e: bipush 0
      // 03f: ifne 069
      // 042: aload 5
      // 044: checkcast java/lang/CharSequence
      // 047: invokeinterface java/lang/CharSequence.length ()I 1
      // 04c: aload 3
      // 04d: ifnull 062
      // 050: goto 057
      // 053: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 056: athrow
      // 057: ifne 065
      // 05a: goto 061
      // 05d: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 060: athrow
      // 061: bipush 1
      // 062: goto 066
      // 065: bipush 0
      // 066: ifeq 06f
      // 069: aconst_null
      // 06a: areturn
      // 06b: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06e: athrow
      // 06f: aload 5
      // 071: aload 4
      // 073: sipush -19140
      // 076: sipush -7973
      // 079: pop2
      // 07a: ldc_w "artist:\""
      // 07d: dup_x2
      // 07e: pop
      // 07f: sipush -19138
      // 082: sipush -30077
      // 085: pop2
      // 086: ldc_w "\" track:\""
      // 089: swap
      // 08a: ldc_w "\""
      // 08d: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001" ]
      // 092: sipush -19144
      // 095: sipush -20569
      // 098: pop2
      // 099: ldc_w "UTF-8"
      // 09c: invokestatic java/net/URLEncoder.encode (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 09f: astore 6
      // 0a1: aload 6
      // 0a3: sipush -19174
      // 0a6: sipush 22787
      // 0a9: pop2
      // 0aa: ldc_w "https://api.deezer.com/search?q="
      // 0ad: swap
      // 0ae: sipush -19156
      // 0b1: sipush -9677
      // 0b4: pop2
      // 0b5: ldc_w "&limit=1"
      // 0b8: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 0bd: astore 7
      // 0bf: aload 3
      // 0c0: ifnull 0dc
      // 0c3: aload 0
      // 0c4: aload 7
      // 0c6: invokespecial me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.b (Ljava/lang/String;)Ljava/lang/String;
      // 0c9: dup
      // 0ca: ifnonnull 0de
      // 0cd: goto 0d4
      // 0d0: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d3: athrow
      // 0d4: pop
      // 0d5: goto 0dc
      // 0d8: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0db: athrow
      // 0dc: aconst_null
      // 0dd: areturn
      // 0de: astore 8
      // 0e0: aload 0
      // 0e1: astore 11
      // 0e3: nop
      // 0e4: getstatic kotlin/Result.Companion Lkotlin/Result$Companion;
      // 0e7: pop
      // 0e8: aload 11
      // 0ea: checkcast me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI
      // 0ed: astore 12
      // 0ef: bipush 0
      // 0f0: istore 13
      // 0f2: aload 8
      // 0f4: invokestatic com/google/gson/JsonParser.parseString (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 0f7: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 0fa: invokestatic kotlin/Result.constructor-impl (Ljava/lang/Object;)Ljava/lang/Object;
      // 0fd: astore 12
      // 0ff: goto 112
      // 102: astore 13
      // 104: getstatic kotlin/Result.Companion Lkotlin/Result$Companion;
      // 107: pop
      // 108: aload 13
      // 10a: invokestatic kotlin/ResultKt.createFailure (Ljava/lang/Throwable;)Ljava/lang/Object;
      // 10d: invokestatic kotlin/Result.constructor-impl (Ljava/lang/Object;)Ljava/lang/Object;
      // 110: astore 12
      // 112: aload 12
      // 114: astore 11
      // 116: aload 11
      // 118: invokestatic kotlin/Result.isFailure-impl (Ljava/lang/Object;)Z
      // 11b: ifeq 126
      // 11e: aconst_null
      // 11f: goto 128
      // 122: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 125: athrow
      // 126: aload 11
      // 128: checkcast com/google/gson/JsonObject
      // 12b: dup
      // 12c: ifnonnull 136
      // 12f: pop
      // 130: aconst_null
      // 131: areturn
      // 132: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 135: athrow
      // 136: astore 9
      // 138: aload 3
      // 139: ifnull 15e
      // 13c: aload 9
      // 13e: sipush -19155
      // 141: sipush -14957
      // 144: pop2
      // 145: ldc_w "data"
      // 148: invokevirtual com/google/gson/JsonObject.getAsJsonArray (Ljava/lang/String;)Lcom/google/gson/JsonArray;
      // 14b: dup
      // 14c: ifnonnull 160
      // 14f: goto 156
      // 152: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 155: athrow
      // 156: pop
      // 157: goto 15e
      // 15a: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15d: athrow
      // 15e: aconst_null
      // 15f: areturn
      // 160: astore 10
      // 162: aload 10
      // 164: aload 3
      // 165: ifnull 181
      // 168: invokevirtual com/google/gson/JsonArray.size ()I
      // 16b: ifne 17b
      // 16e: goto 175
      // 171: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 174: athrow
      // 175: aconst_null
      // 176: areturn
      // 177: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17a: athrow
      // 17b: aload 10
      // 17d: bipush 0
      // 17e: invokevirtual com/google/gson/JsonArray.get (I)Lcom/google/gson/JsonElement;
      // 181: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 184: sipush -19143
      // 187: sipush -17119
      // 18a: pop2
      // 18b: ldc_w "album"
      // 18e: invokevirtual com/google/gson/JsonObject.getAsJsonObject (Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 191: dup
      // 192: ifnonnull 19c
      // 195: pop
      // 196: aconst_null
      // 197: areturn
      // 198: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19b: athrow
      // 19c: astore 11
      // 19e: aload 11
      // 1a0: sipush -19147
      // 1a3: sipush -27039
      // 1a6: pop2
      // 1a7: ldc_w "cover_xl"
      // 1aa: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 1ad: dup
      // 1ae: aload 3
      // 1af: ifnull 1ed
      // 1b2: ifnull 1ca
      // 1b5: goto 1bc
      // 1b8: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1bb: athrow
      // 1bc: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 1bf: dup
      // 1c0: ifnonnull 23d
      // 1c3: goto 1ca
      // 1c6: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c9: athrow
      // 1ca: pop
      // 1cb: aload 3
      // 1cc: ifnull 1fb
      // 1cf: goto 1d6
      // 1d2: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d5: athrow
      // 1d6: aload 11
      // 1d8: sipush -19179
      // 1db: sipush -8529
      // 1de: pop2
      // 1df: ldc_w "cover_big"
      // 1e2: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 1e5: dup
      // 1e6: goto 1ed
      // 1e9: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ec: athrow
      // 1ed: ifnull 1fa
      // 1f0: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 1f3: goto 1fc
      // 1f6: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f9: athrow
      // 1fa: pop
      // 1fb: aconst_null
      // 1fc: dup
      // 1fd: ifnonnull 23d
      // 200: pop
      // 201: aload 3
      // 202: ifnull 231
      // 205: goto 20c
      // 208: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20b: athrow
      // 20c: aload 11
      // 20e: sipush -19149
      // 211: sipush 21448
      // 214: pop2
      // 215: ldc_w "cover_medium"
      // 218: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 21b: dup
      // 21c: ifnull 230
      // 21f: goto 226
      // 222: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 225: athrow
      // 226: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 229: goto 232
      // 22c: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22f: athrow
      // 230: pop
      // 231: aconst_null
      // 232: dup
      // 233: ifnonnull 23d
      // 236: pop
      // 237: aconst_null
      // 238: areturn
      // 239: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23c: athrow
      // 23d: astore 12
      // 23f: aload 0
      // 240: aload 12
      // 242: aload 2
      // 243: invokespecial me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/String;Ljava/io/File;)Ljava/lang/String;
      // 246: areturn
   }

   private final String d(llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll param1, File param2) {
      String var10000 = llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.u();
      String var4 = StringsKt.trim((CharSequence)param1.b()).toString();
      String var3 = var10000;
      String var5 = StringsKt.trim((CharSequence)param1.a()).toString();
      int var6 = var4.length();
      if (var3 != null) {
         var6 = var6 == 0 ? 1 : 0;
      }

      if (var6 != 0) {
         return null;
      }

      int var7 = var5.length();
      if (var3 != null) {
         var7 = var7 == 0 ? 1 : 0;
      }

      if (var7 != 0) {
         return null;
      }

      String var8;
      try {
         var8 = URLEncoder.encode("artist:\"" + var5 + "\" AND recording:\"" + var4 + "\"", "UTF-8");
      } catch (java.io.UnsupportedEncodingException var24) {
         throw new RuntimeException(var24);
      }

      String var9 = "https://musicbrainz.org/ws/2/recording/?query=" + var8 + "&fmt=json&limit=3";
      if (var3 == null) {
         return null;
      }

      String var10;
      try {
         var10 = this.b(var9);
      } catch (java.io.IOException var25) {
         throw new RuntimeException(var25);
      }

      if (var10 == null) {
         return null;
      }

      JsonObject var11;
      try {
         var11 = JsonParser.parseString(var10).getAsJsonObject();
      } catch (Throwable var26) {
         var11 = null;
      }

      if (var11 == null) {
         return null;
      }

      if (var3 == null) {
         return null;
      }

      com.google.gson.JsonArray var12 = var11.getAsJsonArray("recordings");
      if (var12 == null) {
         return null;
      }

      if (var12.size() == 0) {
         return null;
      }

      int var14 = var12.size();
      for (int var13 = 0; var13 < var14; var13++) {
         JsonObject var15 = var12.get(var13).getAsJsonObject();
         com.google.gson.JsonArray var16 = var15.getAsJsonArray("releases");
         if (var16 != null) {
            int var17 = var16.size();
            for (int var18 = 0; var18 < var17; var18++) {
               JsonObject var19 = var16.get(var18).getAsJsonObject();
               com.google.gson.JsonElement var20 = var19.get("id");
               String var21 = var20 != null ? var20.getAsString() : null;
               if (var21 != null) {
                  String var22 = "https://coverartarchive.org/release/" + var21 + "/front-1200";
                  String var23 = this.a(var22, param2);
                  if (var23 != null) {
                     return var23;
                  }
               }
            }
         }
      }

      return null;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.u ()Ljava/lang/String;
      // 003: aload 1
      // 004: invokevirtual me/octo/client/llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.b ()Ljava/lang/String;
      // 007: checkcast java/lang/CharSequence
      // 00a: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
      // 00d: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 010: astore 4
      // 012: astore 3
      // 013: aload 1
      // 014: invokevirtual me/octo/client/llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.a ()Ljava/lang/String;
      // 017: checkcast java/lang/CharSequence
      // 01a: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
      // 01d: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 020: astore 5
      // 022: aload 4
      // 024: checkcast java/lang/CharSequence
      // 027: invokeinterface java/lang/CharSequence.length ()I 1
      // 02c: aload 3
      // 02d: ifnull 03b
      // 030: ifne 03e
      // 033: goto 03a
      // 036: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 039: athrow
      // 03a: bipush 1
      // 03b: goto 03f
      // 03e: bipush 0
      // 03f: ifne 069
      // 042: aload 5
      // 044: checkcast java/lang/CharSequence
      // 047: invokeinterface java/lang/CharSequence.length ()I 1
      // 04c: aload 3
      // 04d: ifnull 062
      // 050: goto 057
      // 053: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 056: athrow
      // 057: ifne 065
      // 05a: goto 061
      // 05d: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 060: athrow
      // 061: bipush 1
      // 062: goto 066
      // 065: bipush 0
      // 066: ifeq 06f
      // 069: aconst_null
      // 06a: areturn
      // 06b: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06e: athrow
      // 06f: aload 5
      // 071: aload 4
      // 073: sipush -19152
      // 076: sipush -14770
      // 079: pop2
      // 07a: ldc_w "artist:\""
      // 07d: dup_x2
      // 07e: pop
      // 07f: sipush -19199
      // 082: sipush -18067
      // 085: pop2
      // 086: ldc_w "\" AND recording:\""
      // 089: swap
      // 08a: ldc_w "\""
      // 08d: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001" ]
      // 092: sipush -19144
      // 095: sipush -20569
      // 098: pop2
      // 099: ldc_w "UTF-8"
      // 09c: invokestatic java/net/URLEncoder.encode (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 09f: astore 6
      // 0a1: aload 6
      // 0a3: sipush -19161
      // 0a6: sipush 27955
      // 0a9: pop2
      // 0aa: ldc_w "https://musicbrainz.org/ws/2/recording/?query="
      // 0ad: swap
      // 0ae: sipush -19197
      // 0b1: sipush -9286
      // 0b4: pop2
      // 0b5: ldc_w "&fmt=json&limit=3"
      // 0b8: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 0bd: astore 7
      // 0bf: aload 3
      // 0c0: ifnull 0dc
      // 0c3: aload 0
      // 0c4: aload 7
      // 0c6: invokespecial me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.b (Ljava/lang/String;)Ljava/lang/String;
      // 0c9: dup
      // 0ca: ifnonnull 0de
      // 0cd: goto 0d4
      // 0d0: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d3: athrow
      // 0d4: pop
      // 0d5: goto 0dc
      // 0d8: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0db: athrow
      // 0dc: aconst_null
      // 0dd: areturn
      // 0de: astore 8
      // 0e0: aload 0
      // 0e1: astore 11
      // 0e3: nop
      // 0e4: getstatic kotlin/Result.Companion Lkotlin/Result$Companion;
      // 0e7: pop
      // 0e8: aload 11
      // 0ea: checkcast me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI
      // 0ed: astore 12
      // 0ef: bipush 0
      // 0f0: istore 13
      // 0f2: aload 8
      // 0f4: invokestatic com/google/gson/JsonParser.parseString (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 0f7: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 0fa: invokestatic kotlin/Result.constructor-impl (Ljava/lang/Object;)Ljava/lang/Object;
      // 0fd: astore 12
      // 0ff: goto 112
      // 102: astore 13
      // 104: getstatic kotlin/Result.Companion Lkotlin/Result$Companion;
      // 107: pop
      // 108: aload 13
      // 10a: invokestatic kotlin/ResultKt.createFailure (Ljava/lang/Throwable;)Ljava/lang/Object;
      // 10d: invokestatic kotlin/Result.constructor-impl (Ljava/lang/Object;)Ljava/lang/Object;
      // 110: astore 12
      // 112: aload 12
      // 114: astore 11
      // 116: aload 11
      // 118: invokestatic kotlin/Result.isFailure-impl (Ljava/lang/Object;)Z
      // 11b: ifeq 126
      // 11e: aconst_null
      // 11f: goto 128
      // 122: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 125: athrow
      // 126: aload 11
      // 128: checkcast com/google/gson/JsonObject
      // 12b: dup
      // 12c: ifnonnull 136
      // 12f: pop
      // 130: aconst_null
      // 131: areturn
      // 132: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 135: athrow
      // 136: astore 9
      // 138: aload 3
      // 139: ifnull 15e
      // 13c: aload 9
      // 13e: sipush -19173
      // 141: sipush 14601
      // 144: pop2
      // 145: ldc_w "recordings"
      // 148: invokevirtual com/google/gson/JsonObject.getAsJsonArray (Ljava/lang/String;)Lcom/google/gson/JsonArray;
      // 14b: dup
      // 14c: ifnonnull 160
      // 14f: goto 156
      // 152: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 155: athrow
      // 156: pop
      // 157: goto 15e
      // 15a: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15d: athrow
      // 15e: aconst_null
      // 15f: areturn
      // 160: astore 10
      // 162: aload 10
      // 164: invokevirtual com/google/gson/JsonArray.size ()I
      // 167: aload 3
      // 168: ifnull 17c
      // 16b: ifne 17b
      // 16e: goto 175
      // 171: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 174: athrow
      // 175: aconst_null
      // 176: areturn
      // 177: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17a: athrow
      // 17b: bipush 0
      // 17c: istore 11
      // 17e: aload 10
      // 180: invokevirtual com/google/gson/JsonArray.size ()I
      // 183: istore 12
      // 185: iload 11
      // 187: iload 12
      // 189: if_icmpge 262
      // 18c: aload 10
      // 18e: iload 11
      // 190: invokevirtual com/google/gson/JsonArray.get (I)Lcom/google/gson/JsonElement;
      // 193: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 196: astore 13
      // 198: aload 3
      // 199: ifnull 1b7
      // 19c: aload 13
      // 19e: sipush -19181
      // 1a1: sipush 30106
      // 1a4: pop2
      // 1a5: ldc_w "releases"
      // 1a8: invokevirtual com/google/gson/JsonObject.getAsJsonArray (Ljava/lang/String;)Lcom/google/gson/JsonArray;
      // 1ab: dup
      // 1ac: ifnonnull 1ba
      // 1af: pop
      // 1b0: goto 1b7
      // 1b3: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b6: athrow
      // 1b7: goto 25b
      // 1ba: astore 14
      // 1bc: bipush 0
      // 1bd: istore 15
      // 1bf: aload 14
      // 1c1: invokevirtual com/google/gson/JsonArray.size ()I
      // 1c4: istore 16
      // 1c6: iload 15
      // 1c8: iload 16
      // 1ca: if_icmpge 25b
      // 1cd: aload 14
      // 1cf: iload 15
      // 1d1: invokevirtual com/google/gson/JsonArray.get (I)Lcom/google/gson/JsonElement;
      // 1d4: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 1d7: astore 17
      // 1d9: aload 3
      // 1da: ifnull 211
      // 1dd: aload 17
      // 1df: sipush -19175
      // 1e2: sipush 26350
      // 1e5: pop2
      // 1e6: ldc_w "id"
      // 1e9: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 1ec: aload 3
      // 1ed: ifnull 193
      // 1f0: goto 1f7
      // 1f3: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f6: athrow
      // 1f7: dup
      // 1f8: ifnull 209
      // 1fb: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 1fe: dup
      // 1ff: ifnonnull 214
      // 202: goto 209
      // 205: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 208: athrow
      // 209: pop
      // 20a: goto 211
      // 20d: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 210: athrow
      // 211: goto 254
      // 214: astore 18
      // 216: aload 18
      // 218: sipush -19150
      // 21b: sipush -20038
      // 21e: pop2
      // 21f: ldc_w "https://coverartarchive.org/release/"
      // 222: swap
      // 223: sipush -19200
      // 226: sipush -21496
      // 229: pop2
      // 22a: ldc_w "/front-1200"
      // 22d: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 232: astore 19
      // 234: aload 0
      // 235: aload 19
      // 237: aload 2
      // 238: invokespecial me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/String;Ljava/io/File;)Ljava/lang/String;
      // 23b: astore 20
      // 23d: aload 3
      // 23e: ifnull 257
      // 241: aload 20
      // 243: ifnull 254
      // 246: goto 24d
      // 249: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24c: athrow
      // 24d: aload 20
      // 24f: areturn
      // 250: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 253: athrow
      // 254: iinc 15 1
      // 257: aload 3
      // 258: ifnonnull 1c6
      // 25b: iinc 11 1
      // 25e: aload 3
      // 25f: ifnonnull 185
      // 262: aconst_null
      // 263: areturn
   }

   private final String a(String var1) {
      String var2 = llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.u();
      CharSequence var10000 = var1;
      short var10001 = -19190;
      short var10002 = -7487;
      boolean var3 = StringsKt.contains(var10000, "100x100bb", false);
      if (var2 != null) {
         if (var3) {
            var10001 = -19198;
            var10002 = -20003;
            var10002 = -19172;
            short var28 = 24908;
            return StringsKt.replace(var1, "100x100bb", "1200x1200bb", false);
         }

         var10000 = var1;
         var10001 = -19178;
         var10002 = 14252;
         var3 = StringsKt.contains(var10000, "300x300bb", false);
      }

      if (var2 != null) {
         if (var3) {
            var10001 = -19160;
            var10002 = -1057;
            var10002 = -19142;
            short var27 = -4347;
            return StringsKt.replace(var1, "300x300bb", "1200x1200bb", false);
         }

         var10000 = var1;
         var10001 = -19158;
         var10002 = 662;
         var3 = StringsKt.contains(var10000, "600x600bb", false);
      }

      if (var2 != null) {
         if (var3) {
            var10001 = -19180;
            var10002 = -13242;
            var10002 = -19142;
            short var26 = -4347;
            return StringsKt.replace(var1, "600x600bb", "1200x1200bb", false);
         }

         if (var2 == null) {
            return var1;
         }

         var10000 = var1;
         var10001 = -19170;
         var10002 = 4334;
         var3 = StringsKt.contains(var10000, "ab67616d00004851", false);
      }

      String var6;
      if (var3) {
         var10001 = -19168;
         var10002 = 913;
         var10002 = -19159;
         short var10003 = 7405;
         var6 = StringsKt.replace(var1, "ab67616d00004851", "ab67616d0000b273", false);
      } else {
         var6 = var1;
      }

      return var6;
   }

   private final String b(String param1) throws java.io.IOException {
      // decoy `sipush N; sipush M; pop2` padding and the synthetic `a(Throwable); athrow` rethrow shims dropped (COMMON decoy family).
      String var2 = llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.u();
      var var3 = (new okhttp3.Request.Builder()).url(param1).header("User-Agent", "Polinex-Fabric/1.0 ( https://github.com/OctoSplash01/Polinex-Fabric )").header("Accept", "application/json").build();
      var var4 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.newCall(var3).execute();
      Throwable var5 = null;
      String var6 = null;
      try {
         Response var7 = var4;
         if (var2 == null || var7.isSuccessful()) {
            ResponseBody var8 = var7.body();
            var6 = var8 != null ? var8.string() : null;
         }
      } catch (Throwable var9) {
         var5 = var9;
         throw var9;
      } finally {
         CloseableKt.closeFinally(var4, var5);
      }
      return var6;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.u ()Ljava/lang/String;
      // 03: new okhttp3/Request$Builder
      // 06: dup
      // 07: invokespecial okhttp3/Request$Builder.<init> ()V
      // 0a: aload 1
      // 0b: invokevirtual okhttp3/Request$Builder.url (Ljava/lang/String;)Lokhttp3/Request$Builder;
      // 0e: sipush -19167
      // 11: sipush 19164
      // 14: pop2
      // 15: ldc_w "User-Agent"
      // 18: sipush -19146
      // 1b: sipush 7916
      // 1e: pop2
      // 1f: ldc_w "Polinex-Fabric/1.0 ( https://github.com/OctoSplash01/Polinex-Fabric )"
      // 22: invokevirtual okhttp3/Request$Builder.header (Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;
      // 25: sipush -19137
      // 28: sipush -25979
      // 2b: pop2
      // 2c: ldc_w "Accept"
      // 2f: sipush -19151
      // 32: sipush 5366
      // 35: pop2
      // 36: ldc_w "application/json"
      // 39: invokevirtual okhttp3/Request$Builder.header (Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;
      // 3c: invokevirtual okhttp3/Request$Builder.build ()Lokhttp3/Request;
      // 3f: astore 3
      // 40: astore 2
      // 41: getstatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lokhttp3/OkHttpClient;
      // 44: aload 3
      // 45: invokevirtual okhttp3/OkHttpClient.newCall (Lokhttp3/Request;)Lokhttp3/Call;
      // 48: invokeinterface okhttp3/Call.execute ()Lokhttp3/Response; 1
      // 4d: checkcast java/io/Closeable
      // 50: astore 4
      // 52: aconst_null
      // 53: astore 5
      // 55: nop
      // 56: aload 4
      // 58: checkcast okhttp3/Response
      // 5b: astore 6
      // 5d: bipush 0
      // 5e: istore 7
      // 60: aload 6
      // 62: aload 2
      // 63: ifnull 7d
      // 66: invokevirtual okhttp3/Response.isSuccessful ()Z
      // 69: ifne 7b
      // 6c: goto 73
      // 6f: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 72: athrow
      // 73: aconst_null
      // 74: goto 90
      // 77: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7a: athrow
      // 7b: aload 6
      // 7d: invokevirtual okhttp3/Response.body ()Lokhttp3/ResponseBody;
      // 80: dup
      // 81: ifnull 8e
      // 84: invokevirtual okhttp3/ResponseBody.string ()Ljava/lang/String;
      // 87: goto 90
      // 8a: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8d: athrow
      // 8e: pop
      // 8f: aconst_null
      // 90: astore 6
      // 92: aload 4
      // 94: aload 5
      // 96: invokestatic kotlin/io/CloseableKt.closeFinally (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 99: aload 6
      // 9b: goto b3
      // 9e: astore 7
      // a0: aload 7
      // a2: astore 5
      // a4: aload 7
      // a6: athrow
      // a7: astore 7
      // a9: aload 4
      // ab: aload 5
      // ad: invokestatic kotlin/io/CloseableKt.closeFinally (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // b0: aload 7
      // b2: athrow
      // b3: areturn
   }

   private final String a(String param1, File param2) {
      // decoy `sipush N; sipush M; pop2` padding and the synthetic `a(Throwable); athrow` rethrow shims dropped (COMMON decoy family).
      String var3 = llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.u();
      var var4 = (new okhttp3.Request.Builder()).url(param1).header("User-Agent", "Polinex-Fabric/1.0 ( https://github.com/OctoSplash01/Polinex-Fabric )").build();
      Response var5;
      try {
         var5 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.newCall(var4).execute();
      } catch (java.io.IOException var6) {
         throw new RuntimeException(var6);
      }
      Throwable var7 = null;
      try {
         Response var8 = var5;
         if (var3 != null && !var8.isSuccessful()) {
            return null;
         }
         ResponseBody var9 = var8.body();
         if (var9 == null) {
            return null;
         }
         java.io.FileOutputStream var10;
         try {
            var10 = new java.io.FileOutputStream(param2);
         } catch (java.io.FileNotFoundException var11) {
            throw new RuntimeException(var11);
         }
         Throwable var12 = null;
         try {
            ByteStreamsKt.copyTo(var9.byteStream(), var10, 8192);
         } catch (Throwable var13) {
            var12 = var13;
            throw var13;
         } finally {
            CloseableKt.closeFinally(var10, var12);
         }
      } catch (Throwable var14) {
         var7 = var14;
         throw var14;
      } finally {
         CloseableKt.closeFinally(var5, var7);
      }
      boolean var15 = param2.exists();
      if (var3 != null) {
         if (!var15) {
            return null;
         }
         if (param2.length() <= 256L) {
            return null;
         }
      } else if (!var15) {
         return null;
      }
      return param2.getAbsolutePath();
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.u ()Ljava/lang/String;
      // 003: new okhttp3/Request$Builder
      // 006: dup
      // 007: invokespecial okhttp3/Request$Builder.<init> ()V
      // 00a: aload 1
      // 00b: invokevirtual okhttp3/Request$Builder.url (Ljava/lang/String;)Lokhttp3/Request$Builder;
      // 00e: sipush -19183
      // 011: sipush -32586
      // 014: pop2
      // 015: ldc_w "User-Agent"
      // 018: sipush -19162
      // 01b: sipush 31135
      // 01e: pop2
      // 01f: ldc_w "Polinex-Fabric/1.0 ( https://github.com/OctoSplash01/Polinex-Fabric )"
      // 022: invokevirtual okhttp3/Request$Builder.header (Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;
      // 025: invokevirtual okhttp3/Request$Builder.build ()Lokhttp3/Request;
      // 028: astore 4
      // 02a: getstatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lokhttp3/OkHttpClient;
      // 02d: aload 4
      // 02f: invokevirtual okhttp3/OkHttpClient.newCall (Lokhttp3/Request;)Lokhttp3/Call;
      // 032: invokeinterface okhttp3/Call.execute ()Lokhttp3/Response; 1
      // 037: checkcast java/io/Closeable
      // 03a: astore 5
      // 03c: astore 3
      // 03d: aconst_null
      // 03e: astore 6
      // 040: nop
      // 041: aload 5
      // 043: checkcast okhttp3/Response
      // 046: astore 7
      // 048: bipush 0
      // 049: istore 9
      // 04b: aload 7
      // 04d: aload 3
      // 04e: ifnull 06d
      // 051: invokevirtual okhttp3/Response.isSuccessful ()Z
      // 054: ifne 06b
      // 057: goto 05e
      // 05a: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05d: athrow
      // 05e: aconst_null
      // 05f: astore 17
      // 061: aload 5
      // 063: aload 6
      // 065: invokestatic kotlin/io/CloseableKt.closeFinally (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 068: aload 17
      // 06a: areturn
      // 06b: aload 7
      // 06d: invokevirtual okhttp3/Response.body ()Lokhttp3/ResponseBody;
      // 070: dup
      // 071: ifnonnull 082
      // 074: pop
      // 075: aconst_null
      // 076: astore 16
      // 078: aload 5
      // 07a: aload 6
      // 07c: invokestatic kotlin/io/CloseableKt.closeFinally (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 07f: aload 16
      // 081: areturn
      // 082: astore 10
      // 084: new java/io/FileOutputStream
      // 087: dup
      // 088: aload 2
      // 089: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;)V
      // 08c: checkcast java/io/Closeable
      // 08f: astore 11
      // 091: aconst_null
      // 092: astore 12
      // 094: nop
      // 095: aload 11
      // 097: checkcast java/io/FileOutputStream
      // 09a: astore 13
      // 09c: bipush 0
      // 09d: istore 15
      // 09f: aload 10
      // 0a1: invokevirtual okhttp3/ResponseBody.byteStream ()Ljava/io/InputStream;
      // 0a4: aload 13
      // 0a6: checkcast java/io/OutputStream
      // 0a9: bipush 0
      // 0aa: bipush 2
      // 0ab: aconst_null
      // 0ac: invokestatic kotlin/io/ByteStreamsKt.copyTo$default (Ljava/io/InputStream;Ljava/io/OutputStream;IILjava/lang/Object;)J
      // 0af: lstore 13
      // 0b1: aload 11
      // 0b3: aload 12
      // 0b5: invokestatic kotlin/io/CloseableKt.closeFinally (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 0b8: lload 13
      // 0ba: goto 0d2
      // 0bd: astore 15
      // 0bf: aload 15
      // 0c1: astore 12
      // 0c3: aload 15
      // 0c5: athrow
      // 0c6: astore 15
      // 0c8: aload 11
      // 0ca: aload 12
      // 0cc: invokestatic kotlin/io/CloseableKt.closeFinally (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 0cf: aload 15
      // 0d1: athrow
      // 0d2: nop
      // 0d3: lstore 7
      // 0d5: aload 5
      // 0d7: aload 6
      // 0d9: invokestatic kotlin/io/CloseableKt.closeFinally (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 0dc: lload 7
      // 0de: goto 0f6
      // 0e1: astore 9
      // 0e3: aload 9
      // 0e5: astore 6
      // 0e7: aload 9
      // 0e9: athrow
      // 0ea: astore 9
      // 0ec: aload 5
      // 0ee: aload 6
      // 0f0: invokestatic kotlin/io/CloseableKt.closeFinally (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 0f3: aload 9
      // 0f5: athrow
      // 0f6: pop2
      // 0f7: aload 2
      // 0f8: invokevirtual java/io/File.exists ()Z
      // 0fb: aload 3
      // 0fc: ifnull 123
      // 0ff: ifeq 12d
      // 102: goto 109
      // 105: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 108: athrow
      // 109: aload 2
      // 10a: aload 3
      // 10b: ifnull 127
      // 10e: goto 115
      // 111: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 114: athrow
      // 115: invokevirtual java/io/File.length ()J
      // 118: ldc2_w 256
      // 11b: lcmp
      // 11c: goto 123
      // 11f: invokestatic me/octo/client/IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 122: athrow
      // 123: ifle 12d
      // 126: aload 2
      // 127: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 12a: goto 12e
      // 12d: aconst_null
      // 12e: areturn
   }

   private final String c(String var1) {
      short var10000 = -19169;
      short var10001 = 10973;
      MessageDigest var4;
      try {
         var4 = MessageDigest.getInstance("SHA-1");
      }
      catch (java.security.NoSuchAlgorithmException notAlgorithmException) {
         throw new RuntimeException(notAlgorithmException);
      }
      byte[] var5 = var1.getBytes(Charsets.UTF_8);
      short var10003 = -19141;
      short var10004 = -16026;
      Intrinsics.checkNotNullExpressionValue(var5, "getBytes(...)");
      byte[] var2 = var4.digest(var5);
      Intrinsics.checkNotNull(var2);
      return ArraysKt.joinToString(
         var2, "", null, null, 0, null, IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI::a);
   }

   private static final File b() {
      short var10003 = -19153;
      short var10004 = -9825;
      File var0 = new File(
         lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
         "cache/albumart"
      );
      boolean var2 = false;
      var0.mkdirs();
      return var0;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static final Unit a(llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll var0, String var1) {
      String var2 = llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.u();
      boolean var5 = false /* VF: Semaphore variable */;

      try {
         var5 = true;
         String var3 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var0);
         Map var10000 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         if (var2 == null) {
            var5 = false;
            return Unit.INSTANCE;
         }

         String var10002 = var3;
         if (var3 == null) {
            short var10 = -19171;
            short var10003 = -13291;
            var10002 = "__NOT_FOUND__";
         }

         var10000.put(var1, var10002);
         var5 = false;
      } finally {
         if (var5) {
            IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.remove(var1);
         }
      }

      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.remove(var1);
      return Unit.INSTANCE;
   }

   private static final CharSequence a(byte var0) {
      short var10000 = -19139;
      short var10001 = -26863;
      String var1 = "%02x";
      Object[] var2 = new Object[]{var0};
      String var3 = String.format(var1, Arrays.copyOf(var2, var2.length));
      short var10002 = -19193;
      short var10003 = 5835;
      Intrinsics.checkNotNullExpressionValue(var3, "format(...)");
      return var3;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var25 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[57];
      int var3 = 0;
      String var2 = "ÖÉÁÜu\u0084ïØ@´\u001eµRm\u001e\u0080\u0094÷xñ\u001a7vz\u0007\u0012^\"(ÿ_<¯f®ä\fàio¥ãy^ä{6\u009d+\b\u009d\f\u0080»]\u001cÿA\u0010¿ÆÀ¥Ëm/ÌÕ\u0006ÿ©mÿÿ\u0098Eåâ\u0080Ø[aÃÒ]¹(Ì\u0019µR\u009c¤Û\u009b>\u0004\u0098Ä\b}L°È^ b\u0084¤DàgEb¥%`~Ä»;êö\u0019?\u001cÞÝ\u00ad8KB\u0098Ó8Î'³~\u0080ä]¬\u000bè\t\u0097S½ÆR¢¼½K\u0005\tÚ°kô\bkº\u001eßÍ6\u008e\u0004\u000bèÛ0P\u008cV§÷¤ ¯\r~Ý:_\u0000Î@JýpÓ\u000fã\u0005%&\u0017X\u0090\u0005\u008b Tÿ\r\t !\u001c\u001dÜ§ÎÛé\u0006§´ô\u0093%\u0094\b¡¿\u0007Í\u00adÒá\u0098\u0004WÂSy\u0011ò\u0089{ÊèùÏsÔx|\u0080¼\u00935?\u0083\rI\u0016ÙV,hnì\u0002\u007f\u0094óZ\u0010®)¤S\u0096ÑgS8¸nÕ\u0094Ç\u000fâ\nl¾\u001d×\u0083Üì\u008dl\u0006EÂ©d±ÇLPw/\rfZÐgkÆ\u0083\u0090\u007fW\u0098µW\u00ad\u000føþ^\u0097r[Þ\u0083\u000f\u0004\u000eÙO6\u0080\u0012Ê\u008a-ò8ÏC\u0018W:´1\u0015ØçêgvXîaGÚÃ\u0016Hbt.@\u009c\u0013v/Ñ¤r'û8\t\"t#Õ;ö\u009d\b\u009a\u0082¢IÇT\u0015Ö]È\u000e)£\u0003á/®Ì6é&ãäÁ&V\u0004v¢_{\tK\n3\u0017=.mkç\t(\u0090Ï3=z\u0014\u0001Â%«ßn\u001e\u0080ÜQÓ\u009dÎí\u0089X\u0092ö:O\u0015?â[ìûõ½ÉC6ÉügÀ9þÜa\u008e\té\u008cR°\u008b\ng\u000f¬\u0010z\u0080>fÅw\r\u0087u\"Ç\u0086÷§ý§\r\u0085d@\u0018\u001f¡\bÕÎX\r\u0017i\u000e\u0092 4^(ÚÞçàb02ï\f\bÆ/Y\u0006Â/R4\u0004\u009c¡\u0005w\u0007}\u0000êÓè\u008eü\b\u0002Â\u001a\u009b\u0007\u0092»&E÷ïÂy\u0013UÊT|i\fÖ\u009döÂô¶ÖÙ\u009fL¬Í\u008e\\\u009c\u0094ÒÚãòì¶I¢Æ\rV¬£A®à¡¿©fq-\u0011\u009c|å\fBÄ¹\u0003\u001cÔ£ðîèöPîª \n¹o§íÔ\u009b\u0006e1\u001b\t\u0085\u0019ß\u0002:\\QÅj\r|n¼éÆ\u008dBÂ(Ág-\u0090\twý$\u009e@Ï»·7\t\u0088Ýb3B«e²ñ T¬\u0091p\u007f\u0011®jjý\u0006+»\u0098à´º¾tÓy\u0002\u0096ù\u0012\u0087¢\u00ad\u001a\u0091]¸\nô9ËîÀ`>\u0090ðÈ\u0005ÏGJt;\u0002ËT\u0010\u008d¦À¢\u001aïö\u0094\n@(Ê\\$\u0016\u009e\u0005a£^wW\u000b\u0099§\u001eßI§\u001fÉ³gM\r«\u0018\u0085\u0097§P\u001fë,\u009fQïâ\tmJ\u0080hÓ\u0011.l\u0085\u0011¨=\u0090\u0016+\tÿs\u0098À³W¡´\u009aû\u0090\u000bG Z¾ÝzF\u009efþç\u0011\u0086zýJVµ\u0007í«\u0011g\u0000âõe3\u000f\u0010_CWê\u009cá\u000b¬(ÇB\tôQAü\u000bÑ\u0005è \u0084ë\u0086³Ç¹U&AÀ¥ÓÐ¨\u0010/ù\\â1e?:N\u0087(\t\u0099iÆ\u008a`@Ø.×\u0080È3\u001c)T{$\u0002E";
      int var4 = "ÖÉÁÜu\u0084ïØ@´\u001eµRm\u001e\u0080\u0094÷xñ\u001a7vz\u0007\u0012^\"(ÿ_<¯f®ä\fàio¥ãy^ä{6\u009d+\b\u009d\f\u0080»]\u001cÿA\u0010¿ÆÀ¥Ëm/ÌÕ\u0006ÿ©mÿÿ\u0098Eåâ\u0080Ø[aÃÒ]¹(Ì\u0019µR\u009c¤Û\u009b>\u0004\u0098Ä\b}L°È^ b\u0084¤DàgEb¥%`~Ä»;êö\u0019?\u001cÞÝ\u00ad8KB\u0098Ó8Î'³~\u0080ä]¬\u000bè\t\u0097S½ÆR¢¼½K\u0005\tÚ°kô\bkº\u001eßÍ6\u008e\u0004\u000bèÛ0P\u008cV§÷¤ ¯\r~Ý:_\u0000Î@JýpÓ\u000fã\u0005%&\u0017X\u0090\u0005\u008b Tÿ\r\t !\u001c\u001dÜ§ÎÛé\u0006§´ô\u0093%\u0094\b¡¿\u0007Í\u00adÒá\u0098\u0004WÂSy\u0011ò\u0089{ÊèùÏsÔx|\u0080¼\u00935?\u0083\rI\u0016ÙV,hnì\u0002\u007f\u0094óZ\u0010®)¤S\u0096ÑgS8¸nÕ\u0094Ç\u000fâ\nl¾\u001d×\u0083Üì\u008dl\u0006EÂ©d±ÇLPw/\rfZÐgkÆ\u0083\u0090\u007fW\u0098µW\u00ad\u000føþ^\u0097r[Þ\u0083\u000f\u0004\u000eÙO6\u0080\u0012Ê\u008a-ò8ÏC\u0018W:´1\u0015ØçêgvXîaGÚÃ\u0016Hbt.@\u009c\u0013v/Ñ¤r'û8\t\"t#Õ;ö\u009d\b\u009a\u0082¢IÇT\u0015Ö]È\u000e)£\u0003á/®Ì6é&ãäÁ&V\u0004v¢_{\tK\n3\u0017=.mkç\t(\u0090Ï3=z\u0014\u0001Â%«ßn\u001e\u0080ÜQÓ\u009dÎí\u0089X\u0092ö:O\u0015?â[ìûõ½ÉC6ÉügÀ9þÜa\u008e\té\u008cR°\u008b\ng\u000f¬\u0010z\u0080>fÅw\r\u0087u\"Ç\u0086÷§ý§\r\u0085d@\u0018\u001f¡\bÕÎX\r\u0017i\u000e\u0092 4^(ÚÞçàb02ï\f\bÆ/Y\u0006Â/R4\u0004\u009c¡\u0005w\u0007}\u0000êÓè\u008eü\b\u0002Â\u001a\u009b\u0007\u0092»&E÷ïÂy\u0013UÊT|i\fÖ\u009döÂô¶ÖÙ\u009fL¬Í\u008e\\\u009c\u0094ÒÚãòì¶I¢Æ\rV¬£A®à¡¿©fq-\u0011\u009c|å\fBÄ¹\u0003\u001cÔ£ðîèöPîª \n¹o§íÔ\u009b\u0006e1\u001b\t\u0085\u0019ß\u0002:\\QÅj\r|n¼éÆ\u008dBÂ(Ág-\u0090\twý$\u009e@Ï»·7\t\u0088Ýb3B«e²ñ T¬\u0091p\u007f\u0011®jjý\u0006+»\u0098à´º¾tÓy\u0002\u0096ù\u0012\u0087¢\u00ad\u001a\u0091]¸\nô9ËîÀ`>\u0090ðÈ\u0005ÏGJt;\u0002ËT\u0010\u008d¦À¢\u001aïö\u0094\n@(Ê\\$\u0016\u009e\u0005a£^wW\u000b\u0099§\u001eßI§\u001fÉ³gM\r«\u0018\u0085\u0097§P\u001fë,\u009fQïâ\tmJ\u0080hÓ\u0011.l\u0085\u0011¨=\u0090\u0016+\tÿs\u0098À³W¡´\u009aû\u0090\u000bG Z¾ÝzF\u009efþç\u0011\u0086zýJVµ\u0007í«\u0011g\u0000âõe3\u000f\u0010_CWê\u009cá\u000b¬(ÇB\tôQAü\u000bÑ\u0005è \u0084ë\u0086³Ç¹U&AÀ¥ÓÐ¨\u0010/ù\\â1e?:N\u0087(\t\u0099iÆ\u008a`@Ø.×\u0080È3\u001c)T{$\u0002E"
         .length();
      char var1 = '$';
      int var9 = -1;

      label52:
      while (true) {
         short var10000 = 122;
         String var10001 = var2.substring(++var9, var9 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var29 = var10001.toCharArray();
               int var10004 = var29.length;
               int var6 = 0;
               byte var32 = (byte)var10000;
               var25 = var29;
               int var17 = var10004;
               byte var37;
               char[] var41;
               int var10006;
               if (var10004 <= 1) {
                  var41 = var29;
                  var37 = (byte)var10000;
                  var10006 = var6;
               } else {
                  var32 = (byte)var10000;
                  var17 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var41 = var29;
                  var37 = (byte)var10000;
                  var10006 = var6;
               }

               while (true) {
                  var41[var10006] = (char)(var41[var10006] ^ var37 ^ switch (var6 % 7) {
                     case 0 -> 11;
                     case 1 -> 1;
                     case 2 -> 94;
                     case 3 -> 122;
                     case 4 -> 58;
                     case 5 -> 33;
                     default -> 1;
                  });
                  var6++;
                  if (var32 == 0) {
                     var10006 = var32;
                     var41 = var25;
                     var37 = var32;
                  } else {
                     if (var17 <= var6) {
                        break;
                     }

                     var41 = var25;
                     var37 = var32;
                     var10006 = var6;
                  }
               }
            }

            String var34 = new String(var25).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var34;
                  if ((var9 += var1) >= var4) {
                     a = var5;
                     b = new String[57];
                     var10000 = -19184;
                     short var19 = 19238;
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = "Polinex-Fabric/1.0 ( https://github.com/OctoSplash01/Polinex-Fabric )";
                     var10000 = -19165;
                     short var20 = 4422;
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = "__NOT_FOUND__";
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI();
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new Builder()
                        .connectTimeout(5L, TimeUnit.SECONDS)
                        .readTimeout(8L, TimeUnit.SECONDS)
                        .followRedirects(true)
                        .build();
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = LazyKt.lazy(
                        IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI::b
                     );
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new ConcurrentHashMap<>();
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new ConcurrentHashMap<>();
                     long[] var7 = new long[]{400L};
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var7;
                     break pxClinit;
                  }

                  var1 = var2.charAt(var9);
                  break;
               default:
                  var5[var3++] = var34;
                  if ((var9 += var1) < var4) {
                     var1 = var2.charAt(var9);
                     continue label52;
                  }

                  var2 = "Ég/Ä9\u008e\u0015ëA\u0085Åë®§ \u0088\tÈ\"\u009eÏºO©\rß";
                  var4 = "Ég/Ä9\u008e\u0015ëA\u0085Åë®§ \u0088\tÈ\"\u009eÏºO©\rß".length();
                  var1 = 16;
                  var9 = -1;
            }

            var10000 = 28;
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
      int var2 = (var0 ^ -19150) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 36;
            case 1 -> 184;
            case 2 -> 177;
            case 3 -> 98;
            case 4 -> 212;
            case 5 -> 99;
            case 6 -> 22;
            case 7 -> 138;
            case 8 -> 205;
            case 9 -> 34;
            case 10 -> 225;
            case 11 -> 131;
            case 12 -> 201;
            case 13 -> 230;
            case 14 -> 233;
            case 15 -> 254;
            case 16 -> 154;
            case 17 -> 85;
            case 18 -> 157;
            case 19 -> 103;
            case 20 -> 37;
            case 21 -> 217;
            case 22 -> 198;
            case 23 -> 171;
            case 24 -> 19;
            case 25 -> 213;
            case 26 -> 232;
            case 27 -> 224;
            case 28 -> 176;
            case 29 -> 148;
            case 30 -> 207;
            case 31 -> 66;
            case 32 -> 221;
            case 33 -> 117;
            case 34 -> 56;
            case 35 -> 128;
            case 36 -> 227;
            case 37 -> 182;
            case 38 -> 14;
            case 39 -> 92;
            case 40 -> 9;
            case 41 -> 70;
            case 42 -> 46;
            case 43 -> 133;
            case 44 -> 190;
            case 45 -> 107;
            case 46 -> 90;
            case 47 -> 244;
            case 48 -> 210;
            case 49 -> 218;
            case 50 -> 110;
            case 51 -> 216;
            case 52 -> 136;
            case 53 -> 142;
            case 54 -> 239;
            case 55 -> 96;
            case 56 -> 223;
            case 57 -> 102;
            case 58 -> 78;
            case 59 -> 15;
            case 60 -> 251;
            case 61 -> 243;
            case 62 -> 20;
            case 63 -> 106;
            case 64 -> 140;
            case 65 -> 44;
            case 66 -> 84;
            case 67 -> 242;
            case 68 -> 169;
            case 69 -> 116;
            case 70 -> 215;
            case 71 -> 209;
            case 72 -> 226;
            case 73 -> 95;
            case 74 -> 88;
            case 75 -> 124;
            case 76 -> 76;
            case 77 -> 155;
            case 78 -> 61;
            case 79 -> 1;
            case 80 -> 172;
            case 81 -> 16;
            case 82 -> 161;
            case 83 -> 82;
            case 84 -> 166;
            case 85 -> 173;
            case 86 -> 189;
            case 87 -> 234;
            case 88 -> 75;
            case 89 -> 39;
            case 90 -> 237;
            case 91 -> 145;
            case 92 -> 199;
            case 93 -> 143;
            case 94 -> 48;
            case 95 -> 49;
            case 96 -> 91;
            case 97 -> 89;
            case 98 -> 249;
            case 99 -> 186;
            case 100 -> 126;
            case 101 -> 108;
            case 102 -> 65;
            case 103 -> 118;
            case 104 -> 79;
            case 105 -> 167;
            case 106 -> 222;
            case 107 -> 127;
            case 108 -> 111;
            case 109 -> 57;
            case 110 -> 32;
            case 111 -> 194;
            case 112 -> 168;
            case 113 -> 246;
            case 114 -> 12;
            case 115 -> 153;
            case 116 -> 11;
            case 117 -> 41;
            case 118 -> 86;
            case 119 -> 4;
            case 120 -> 255;
            case 121 -> 101;
            case 122 -> 59;
            case 123 -> 28;
            case 124 -> 38;
            case 125 -> 122;
            case 126 -> 250;
            case 127 -> 191;
            case 128 -> 35;
            case 129 -> 178;
            case 130 -> 197;
            case 131 -> 146;
            case 132 -> 247;
            case 133 -> 18;
            case 134 -> 80;
            case 135 -> 129;
            case 136 -> 132;
            case 137 -> 53;
            case 138 -> 29;
            case 139 -> 252;
            case 140 -> 24;
            case 141 -> 180;
            case 142 -> 13;
            case 143 -> 241;
            case 144 -> 105;
            case 145 -> 214;
            case 146 -> 8;
            case 147 -> 26;
            case 148 -> 40;
            case 149 -> 58;
            case 150 -> 23;
            case 151 -> 6;
            case 152 -> 52;
            case 153 -> 93;
            case 154 -> 77;
            case 155 -> 183;
            case 156 -> 159;
            case 157 -> 30;
            case 158 -> 121;
            case 159 -> 139;
            case 160 -> 5;
            case 161 -> 2;
            case 162 -> 0;
            case 163 -> 160;
            case 164 -> 179;
            case 165 -> 149;
            case 166 -> 69;
            case 167 -> 235;
            case 168 -> 202;
            case 169 -> 67;
            case 170 -> 150;
            case 171 -> 63;
            case 172 -> 203;
            case 173 -> 45;
            case 174 -> 206;
            case 175 -> 165;
            case 176 -> 64;
            case 177 -> 55;
            case 178 -> 43;
            case 179 -> 188;
            case 180 -> 240;
            case 181 -> 137;
            case 182 -> 72;
            case 183 -> 162;
            case 184 -> 54;
            case 185 -> 109;
            case 186 -> 27;
            case 187 -> 100;
            case 188 -> 60;
            case 189 -> 51;
            case 190 -> 135;
            case 191 -> 248;
            case 192 -> 174;
            case 193 -> 47;
            case 194 -> 185;
            case 195 -> 156;
            case 196 -> 253;
            case 197 -> 3;
            case 198 -> 119;
            case 199 -> 245;
            case 200 -> 25;
            case 201 -> 123;
            case 202 -> 114;
            case 203 -> 147;
            case 204 -> 164;
            case 205 -> 33;
            case 206 -> 71;
            case 207 -> 208;
            case 208 -> 42;
            case 209 -> 231;
            case 210 -> 7;
            case 211 -> 120;
            case 212 -> 192;
            case 213 -> 62;
            case 214 -> 238;
            case 215 -> 175;
            case 216 -> 228;
            case 217 -> 187;
            case 218 -> 144;
            case 219 -> 97;
            case 220 -> 170;
            case 221 -> 87;
            case 222 -> 68;
            case 223 -> 211;
            case 224 -> 196;
            case 225 -> 220;
            case 226 -> 50;
            case 227 -> 31;
            case 228 -> 163;
            case 229 -> 204;
            case 230 -> 104;
            case 231 -> 141;
            case 232 -> 115;
            case 233 -> 74;
            case 234 -> 200;
            case 235 -> 94;
            case 236 -> 193;
            case 237 -> 10;
            case 238 -> 151;
            case 239 -> 181;
            case 240 -> 158;
            case 241 -> 113;
            case 242 -> 112;
            case 243 -> 83;
            case 244 -> 229;
            case 245 -> 195;
            case 246 -> 130;
            case 247 -> 152;
            case 248 -> 125;
            case 249 -> 21;
            case 250 -> 134;
            case 251 -> 73;
            case 252 -> 81;
            case 253 -> 219;
            case 254 -> 17;
            default -> 236;
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
   public static class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2 {
      private static java.lang.String[] a;
      private static java.lang.String[] b;

      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(java.lang.Object var1) {
         super(2, var1, me.octo.client.IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.class, "fetchFromItunes", "fetchFromItunes(Lme/octo/client/llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll;Ljava/io/File;)Ljava/lang/String;", 0);
      }

      public final java.lang.String a(me.octo.client.llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll var1, java.io.File var2) {
         kotlin.jvm.internal.Intrinsics.checkNotNullParameter(var1, "p0");
         kotlin.jvm.internal.Intrinsics.checkNotNullParameter(var2, "p1");
         return me.octo.client.IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.c((me.octo.client.IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI)this.receiver, var1, var2);
      }

      @Override
      public java.lang.Object invoke(java.lang.Object var1, java.lang.Object var2) {
         return this.a((me.octo.client.llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll)var1, (java.io.File)var2);
      }

      static {
         // PX-FIX clinit Phase A
      }

      private static String a(int var0, int var1) {
         // PX-FIX Phase A: encrypted string table decryption not inlined
         return null;
      }
   }
   public static class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2 {
      private static java.lang.String[] a;
      private static java.lang.String[] b;

      IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(java.lang.Object var1) {
         super(2, var1, me.octo.client.IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.class, "fetchFromMusicBrainz", "fetchFromMusicBrainz(Lme/octo/client/llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll;Ljava/io/File;)Ljava/lang/String;", 0);
      }

      public final java.lang.String a(me.octo.client.llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll var1, java.io.File var2) {
         kotlin.jvm.internal.Intrinsics.checkNotNullParameter(var1, "p0");
         kotlin.jvm.internal.Intrinsics.checkNotNullParameter(var2, "p1");
         return me.octo.client.IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.d((me.octo.client.IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI)this.receiver, var1, var2);
      }

      @Override
      public java.lang.Object invoke(java.lang.Object var1, java.lang.Object var2) {
         return this.a((me.octo.client.llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll)var1, (java.io.File)var2);
      }

      static {
         // PX-FIX clinit Phase A
      }

      private static String a(int var0, int var1) {
         // PX-FIX Phase A: encrypted string table decryption not inlined
         return null;
      }
   }
   public static class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2 {
      private static java.lang.String[] a;
      private static java.lang.String[] b;

      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(java.lang.Object var1) {
         super(2, var1, me.octo.client.IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.class, "fetchFromDeezer", "fetchFromDeezer(Lme/octo/client/llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll;Ljava/io/File;)Ljava/lang/String;", 0);
      }

      public final java.lang.String a(me.octo.client.llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll var1, java.io.File var2) {
         kotlin.jvm.internal.Intrinsics.checkNotNullParameter(var1, "p0");
         kotlin.jvm.internal.Intrinsics.checkNotNullParameter(var2, "p1");
         return me.octo.client.IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.b((me.octo.client.IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI)this.receiver, var1, var2);
      }

      @Override
      public java.lang.Object invoke(java.lang.Object var1, java.lang.Object var2) {
         return this.a((me.octo.client.llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll)var1, (java.io.File)var2);
      }

      static {
         // PX-FIX clinit Phase A
      }

      private static String a(int var0, int var1) {
         // PX-FIX Phase A: encrypted string table decryption not inlined
         return null;
      }
   }
   public static class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2 {
      private static java.lang.String[] a;
      private static java.lang.String[] b;

      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(java.lang.Object var1) {
         super(2, var1, me.octo.client.IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.class, "fetchFromDirectUrl", "fetchFromDirectUrl(Lme/octo/client/llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll;Ljava/io/File;)Ljava/lang/String;", 0);
      }

      public final java.lang.String a(me.octo.client.llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll var1, java.io.File var2) {
         kotlin.jvm.internal.Intrinsics.checkNotNullParameter(var1, "p0");
         kotlin.jvm.internal.Intrinsics.checkNotNullParameter(var2, "p1");
         return me.octo.client.IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI.a((me.octo.client.IllIllIllIIIlIIlIlIlllIlIllIlIIlllIlIlllIllIlIIIIIlIIIIIllllIlllIIlIIlIIlIlllIlIIIllI)this.receiver, var1, var2);
      }

      @Override
      public java.lang.Object invoke(java.lang.Object var1, java.lang.Object var2) {
         return this.a((me.octo.client.llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll)var1, (java.io.File)var2);
      }

      static {
         // PX-FIX clinit Phase A
      }

      private static String a(int var0, int var1) {
         // PX-FIX Phase A: encrypted string table decryption not inlined
         return null;
      }
   }
}
