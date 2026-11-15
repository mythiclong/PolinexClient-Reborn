package me.octo.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.awt.datatransfer.DataFlavor;
import me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI;

public final class llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII {
    public llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII(Object... pxVarargs) { } // PX-FIX varargs ctor

   @NotNull
   public static llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static Gson lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static Map<String, llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static List<String> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static String[] a;
   private static String[] b;

   private llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII() {
   }

   private final File a() {
      String var10002 = llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      short var10003 = -20529;
      short var10004 = -23969;
      File var1 = new File(var10002, "themes");
      boolean var3 = false;
      if (!var1.exists()) {
         var1.mkdirs();
      }

      return var1;
   }

   @NotNull
   public final List<String> b() {
      File[] var10000 = this.a().listFiles((java.io.FileFilter)null);
      if (var10000 == null) {
         var10000 = new File[0];
      }

      File[] var1 = var10000;
      boolean var4 = false;
      File[] var5 = var1;
      var var6 = new ArrayList(var1.length);
      boolean var7 = false;
      int var8 = 0;

      for (int var9 = var1.length; var8 < var9; var8++) {
         File var10 = var5[var8];
         boolean var12 = false;
         Intrinsics.checkNotNull(var10);
         var6.add(FilesKt.getNameWithoutExtension(var10));
      }

      var var3 = var6;
      var4 = false;
      List var2 = CollectionsKt.sortedWith(
         var3,
         new llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI()
      );
      if (!Intrinsics.areEqual(var2, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI)) {
         lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var2;
      }

      return var2;
   }

   @Nullable
   public final llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
      @NotNull String var1
   ) {
      short var10001 = -20539;
      short var10002 = -9969;
      Intrinsics.checkNotNullParameter(var1, "name");
      llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.get(
         var1
      );
      if (var2 != null) {
         boolean var5 = false;
         return var2;
      } else {
         File var12 = this.a();
         short var10004 = -20482;
         short var10005 = -20725;
         File var8 = new File(var12, var1 + ".json");

         try {
            if (!var8.exists()) {
               return null;
            }
         } catch (Exception var7) {
            throw (RuntimeException)a(var7);
         }

         llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3;
         try {
            Charset var11 = StandardCharsets.UTF_8;
            short var15 = -20542;
            var10004 = 16976;
            Intrinsics.checkNotNullExpressionValue(StandardCharsets.UTF_8, "UTF_8");
            JsonObject var9 = JsonParser.parseString(FilesKt.readText(var8, var11)).getAsJsonObject();
            Intrinsics.checkNotNull(var9);
            llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var4 = this.a(
               var9, var1
            );
            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.put(var1, var4);
            var3 = var4;
         } catch (Exception var6) {
            String var10 = var6.getMessage();
            var10002 = -20517;
            short var10003 = -21967;
            var10003 = -20487;
            var10004 = -21885;
            me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b(
               "Failed to load theme " + var1 + ": " + var10
            );
            var3 = null;
         }

         return var3;
      }
   }

   public final boolean a(
      @NotNull llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      short var10001 = -20536;
      short var10002 = 18305;
      Intrinsics.checkNotNullParameter(var1, "data");

      boolean var2;
      try {
         String var5 = this.h(var1.a());
         var1.a(var5);
         File var9 = this.a();
         short var13 = -20482;
         short var10005 = -20725;
         File var3 = new File(var9, var5 + ".json");
         String var7 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.toJson((JsonElement)this.d(var1));
         short var12 = -20532;
         var13 = -12844;
         Intrinsics.checkNotNullExpressionValue(var7, "toJson(...)");
         Charset var10 = StandardCharsets.UTF_8;
         var13 = -20544;
         var10005 = -28519;
         Intrinsics.checkNotNullExpressionValue(StandardCharsets.UTF_8, "UTF_8");
         FilesKt.writeText(var3, var7, var10);
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.put(var5, var1);
         var2 = true;
      } catch (Exception var4) {
         String var10000 = var1.a();
         String var6 = var4.getMessage();
         var10002 = -20527;
         short var10003 = -12415;
         var10003 = -20494;
         short var10004 = 7457;
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b(
            "Failed to save theme " + var10000 + ": " + var6
         );
         var2 = false;
      }

      return var2;
   }

   public final boolean b(@NotNull String var1) {
      short var10001 = -20484;
      short var10002 = -30139;
      Intrinsics.checkNotNullParameter(var1, "name");
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.remove(var1);
      File var2 = this.a();
      short var10004 = -20488;
      short var10005 = -18662;
      return new File(var2, var1 + ".json").delete();
   }

   public final boolean a(@NotNull String var1, @NotNull String var2) {
      short var10001 = -20493;
      short var10002 = -13983;
      Intrinsics.checkNotNullParameter(var1, "oldName");
      int[] var10000 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      var10002 = -20531;
      short var10003 = -27563;
      Intrinsics.checkNotNullParameter(var2, "newName");
      int[] var3 = var10000;
      if (var3 == null) {
         llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var7 = this.a(
            var1
         );
         if (var7 != null) {
            llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var4 = var7;
            String var5 = this.h(var2);
            boolean var8 = Intrinsics.areEqual(var5, var1);
            if (var3 == null) {
               if (!var8) {
                  File var11 = this.a();
                  short var10004 = -20482;
                  short var10005 = -20725;
                  File var6 = new File(var11, var5 + ".json");
                  boolean var9 = var6.exists();
                  if (var3 == null) {
                     if (var9) {
                        return false;
                     }

                     var4.a(var5);
                     var9 = this.a(var4);
                  }

                  if (var3 == null) {
                     if (!var9) {
                        return false;
                     }

                     this.b(var1);
                     var9 = true;
                  }

                  return var9;
               }

               var8 = true;
            }

            return var8;
         }
      }

      return false;
   }

   public final boolean c(@NotNull String var1) {
      short var10001 = -20539;
      short var10002 = -9969;
      Intrinsics.checkNotNullParameter(var1, "name");
      File var2 = this.a();
      short var10004 = -20482;
      short var10005 = -20725;
      return new File(var2, var1 + ".json").exists();
   }

   @NotNull
   public final File c() {
      return this.a();
   }

   @NotNull
   public final llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll d(
      @NotNull String var1
   ) {
      short var10001 = -20539;
      short var10002 = -9969;
      Intrinsics.checkNotNullParameter(var1, "name");
      llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2 = new llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         var1, null, null, null, 14, null
      );
      Map var3 = llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b();
      boolean var4 = false;

      for (Entry var6 : (Iterable<Entry>)(var3.entrySet())) {
         boolean var8 = false;
         String var9 = (String)var6.getKey();
         Function0 var10 = (Function0)var6.getValue();
         me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var11 = (me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll)var10.invoke();
         var2.b().put(var9, var11.o());
      }

      var3 = llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .c();
      var4 = false;

      for (Entry var18 : (Iterable<Entry>)(var3.entrySet())) {
         boolean var20 = false;
         String var22 = (String)var18.getKey();
         Function0 var24 = (Function0)var18.getValue();
         Map var10000 = var2.c();
         float[] var26 = (float[])var24.invoke();
         float[] var27 = Arrays.copyOf(var26, var26.length);
         short var10004 = -20523;
         short var10005 = 19036;
         Intrinsics.checkNotNullExpressionValue(var27, "copyOf(...)");
         var10000.put(var22, var27);
      }

      var3 = llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .d();
      var4 = false;

      for (Entry var19 : (Iterable<Entry>)(var3.entrySet())) {
         boolean var21 = false;
         String var23 = (String)var19.getKey();
         Function0 var25 = (Function0)var19.getValue();
         var2.d().put(var23, (Float)var25.invoke());
      }

      return var2;
   }

   public final void b(
      @NotNull llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      short var10001 = -20536;
      short var10002 = 18305;
      Intrinsics.checkNotNullParameter(var1, "data");
      Map var2 = llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b();
      boolean var3 = false;

      for (Entry var5 : (Iterable<Entry>)(var2.entrySet())) {
         boolean var7 = false;
         String var8 = (String)var5.getKey();
         Integer var10000 = var1.b().get(var8);
         if (var10000 != null) {
            int var9 = var10000;
            llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(var8, new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var9, true));
         }
      }

      var2 = llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .c();
      var3 = false;

      for (Entry var16 : (Iterable<Entry>)(var2.entrySet())) {
         boolean var18 = false;
         String var20 = (String)var16.getKey();
         float[] var24 = var1.c().get(var20);
         if (var24 != null) {
            float[] var22 = var24;
            llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI var25 = llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            float[] var27 = Arrays.copyOf(var22, var22.length);
            short var10004 = -20524;
            short var10005 = -21927;
            Intrinsics.checkNotNullExpressionValue(var27, "copyOf(...)");
            var25.a(var20, var27);
         }
      }

      var2 = llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .d();
      var3 = false;

      for (Entry var17 : (Iterable<Entry>)(var2.entrySet())) {
         boolean var19 = false;
         String var21 = (String)var17.getKey();
         Float var26 = var1.d().get(var21);
         if (var26 != null) {
            float var23 = var26;
            llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(var21, var23);
         }
      }
   }

   @NotNull
   public final String c(
      @NotNull llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      short var10001 = -20483;
      short var10002 = 1016;
      Intrinsics.checkNotNullParameter(var1, "data");
      String var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.toJson((JsonElement)this.d(var1));
      var10002 = -20485;
      short var10003 = -21217;
      Intrinsics.checkNotNullExpressionValue(var10000, "toJson(...)");
      return var10000;
   }

   @Nullable
   public final llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll e(
      @NotNull String param1
   ) {
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "json");
      llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2;
      try {
         com.google.gson.JsonObject var3 = com.google.gson.JsonParser.parseString(param1).getAsJsonObject();
         kotlin.jvm.internal.Intrinsics.checkNotNull(var3);
         com.google.gson.JsonElement var5 = var3.get("name");
         var2 = this.a(var3, var5 != null ? var5.getAsString() : "Imported");
      } catch (Exception var4) {
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Failed to parse theme json:" + var4.getMessage());
         var2 = null;
      }
      return var2;
   }

   public final void f(@NotNull String var1) {
      short var10001 = -20521;
      short var10002 = 2415;
      Intrinsics.checkNotNullParameter(var1, "text");

      try {
         Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(var1), null);
      } catch (Exception var3) {
         String var10000 = var3.getMessage();
         var10001 = -20486;
         var10002 = 8476;
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Clipboard copy failed: " + var10000);
      }
   }

   @Nullable
   public final String d() {
      int[] var1 = me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      String var2;
      try {
         var var4 = Toolkit.getDefaultToolkit().getSystemClipboard();
         if (var1 == null && !var4.isDataFlavorAvailable(DataFlavor.stringFlavor)) {
            return null;
         }

         Object var5 = var4.getData(DataFlavor.stringFlavor);
         var2 = (var1 != null || var5 instanceof String) ? (String)var5 : null;
      } catch (Exception var6) {
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Clipboard read failed:" + var6.getMessage());
         var2 = null;
      }

      return var2;
   }

   @Nullable
   public final llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
      @NotNull File param1
   ) {
      Intrinsics.checkNotNullParameter(param1, "file");
      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3;
      try {
         String var6 = kotlin.io.FilesKt.readText(param1, java.nio.charset.StandardCharsets.UTF_8);
         llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var5 = this.e(var6);
         if (var5 != null) {
            String var8 = var5.a();
            var5.a(this.h(kotlin.text.StringsKt.isBlank((CharSequence)var8) ? kotlin.io.FilesKt.getNameWithoutExtension(param1) : var8));
         }

         var3 = var5;
      } catch (Exception var4) {
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Failed to import theme from file: " + var4.getMessage());
         var3 = null;
      }

      return var3;
   }

   private final JsonObject d(
      llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      int[] var10000 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      JsonObject var3 = new JsonObject();
      short var10002 = -20539;
      short var10003 = -9969;
      var3.addProperty("name", var1.a());
      var10002 = -20520;
      var10003 = -18662;
      var3.addProperty("version", 1);
      JsonObject var4 = new JsonObject();
      Map var5 = var1.b();
      boolean var6 = false;
      int[] var2 = var10000;
      Iterator var7 = var5.entrySet().iterator();

      while (true) {
         if (var7.hasNext()) {
            Entry var8 = (Entry)var7.next();
            boolean var10 = false;
            String var11 = (String)var8.getKey();
            int var12 = ((Number)var8.getValue()).intValue();
            var10002 = -20535;
            var10003 = -14135;
            String var13 = "%08X";
            Object[] var14 = new Object[]{var12};
            String var42 = String.format(var13, Arrays.copyOf(var14, var14.length));
            short var10004 = -20518;
            short var10005 = 18345;
            Intrinsics.checkNotNullExpressionValue(var42, "format(...)");
            var4.addProperty(var11, "#" + var42);
            if (var2 != null) {
               break;
            }

            if (var2 == null) {
               continue;
            }
         }

         short var10001 = -20496;
         var10002 = -19727;
         var3.add("colors", (JsonElement)var4);
         break;
      }

      JsonObject var22 = new JsonObject();
      Map var23 = var1.c();
      boolean var25 = false;
      Iterator var27 = var23.entrySet().iterator();

      while (true) {
         if (var27.hasNext()) {
            Entry var9 = (Entry)var27.next();
            boolean var31 = false;
            String var32 = (String)var9.getKey();
            float[] var34 = (float[])var9.getValue();
            JsonArray var36 = new JsonArray();
            float[] var15 = var34;
            boolean var16 = false;
            int var17 = 0;
            if (var2 != null) {
               break;
            }

            int var18 = var34.length;

            label46: {
               while (var17 < var18) {
                  float var19 = var15[var17];
                  boolean var21 = false;
                  var36.add(var19);
                  var17++;
                  if (var2 != null) {
                     break label46;
                  }

                  if (var2 != null) {
                     break;
                  }
               }

               var22.add(var32, (JsonElement)var36);
            }

            if (var2 == null) {
               continue;
            }
         }

         short var38 = -20543;
         var10002 = 11593;
         var3.add("shaders", (JsonElement)var22);
         break;
      }

      JsonObject var24 = new JsonObject();
      Map var26 = var1.d();
      boolean var28 = false;
      Iterator var29 = var26.entrySet().iterator();

      while (true) {
         if (var29.hasNext()) {
            Entry var30 = (Entry)var29.next();
            boolean var33 = false;
            String var35 = (String)var30.getKey();
            float var37 = ((Number)var30.getValue()).floatValue();
            var24.addProperty(var35, var37);
            if (var2 != null) {
               break;
            }

            if (var2 == null) {
               continue;
            }
         }

         short var39 = -20538;
         var10002 = 25615;
         var3.add("numbers", (JsonElement)var24);
         break;
      }

      return var3;
   }

   private final llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
      JsonObject var1, String var2
   ) {
      String var32;
      label95: {
         short var10001 = -20539;
         short var10002 = -9969;
         JsonElement var10000 = var1.get("name");
         if (var10000 != null) {
            var32 = var10000.getAsString();
            if (var32 != null) {
               break label95;
            }
         }

         var32 = var2;
      }

      String var3 = var32;
      llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var4 = new llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         var3, null, null, null, 14, null
      );
      short var41 = -20522;
      short var45 = -20544;
      JsonObject var33 = var1.getAsJsonObject("colors");
      if (var33 != null) {
         Set var34 = var33.entrySet();
         if (var34 != null) {
            Iterable var5 = var34;
            boolean var6 = false;

            for (Object var8 : var5) {
               Entry var9 = (Entry)var8;
               boolean var10 = false;
               JsonElement var11 = (JsonElement)var9.getValue();
               Integer var35;
               if (var11.isJsonPrimitive() && var11.getAsJsonPrimitive().isNumber()) {
                  var35 = var11.getAsInt();
               } else if (var11.isJsonPrimitive() && var11.getAsJsonPrimitive().isString()) {
                  llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII var36 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  String var42 = var11.getAsString();
                  short var10003 = -20514;
                  short var10004 = -12480;
                  Intrinsics.checkNotNullExpressionValue(var42, "getAsString(...)");
                  var35 = var36.g(var42);
               } else {
                  var35 = null;
               }

               Integer var12 = var35;
               if (var12 != null) {
                  var4.b().put((String)var9.getKey(), var12);
               }
            }
         }
      }

      var41 = -20513;
      var45 = 10236;
      JsonObject var37 = var1.getAsJsonObject("shaders");
      if (var37 != null) {
         Set var38 = var37.entrySet();
         if (var38 != null) {
            Iterable var18 = var38;
            boolean var20 = false;

            for (Object var24 : var18) {
               Entry var26 = (Entry)var24;
               boolean var28 = false;
               JsonArray var30 = ((JsonElement)var26.getValue()).getAsJsonArray();
               Map var31 = var4.c();
               Object var13 = var26.getKey();
               int var14 = 0;
               int var15 = var30.size();

               float[] var16;
               for (var16 = new float[var15]; var14 < var15; var14++) {
                  var16[var14] = var30.get(var14).getAsFloat();
               }

               var31.put(var13, var16);
            }
         }
      }

      var41 = -20481;
      var45 = 10671;
      JsonObject var39 = var1.getAsJsonObject("numbers");
      if (var39 != null) {
         Set var40 = var39.entrySet();
         if (var40 != null) {
            Iterable var19 = var40;
            boolean var21 = false;

            for (Object var25 : var19) {
               Entry var27 = (Entry)var25;
               boolean var29 = false;
               var4.d().put((String)var27.getKey(), ((JsonElement)var27.getValue()).getAsFloat());
            }
         }
      }

      return var4;
   }

   private final int g(String var1) {
      Object var10000 = null; // PX-FIX: init（乱序赋值）
      String var2 = StringsKt.removePrefix((String)var10000, "0x");

      StringsKt.removePrefix(var1, "#");
      short var10001 = -20533;
      short var10002 = 22439;
      return switch (var2.length()) {
         case 6 -> 0xFF000000 | (int)Long.parseLong(var2, CharsKt.checkRadix(16));
         default -> -1;
         case 8 -> (int)Long.parseLong(var2, CharsKt.checkRadix(16));
      };
   }

   @NotNull
   public final String h(@NotNull String var1) {
      Object var16 = null; // PX-FIX
      int[] var2;
      Object var15;
      label69: {
         short var10001 = -20539;
         short var10002 = -9969;
         Intrinsics.checkNotNullParameter(var1, "name");
         var15 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
         CharSequence var4 = StringsKt.trim(var1).toString();
         var2 = (int[])var15;
         boolean var12 = StringsKt.isBlank(var4);
         if (var2 == null) {
            if (!var12) {
               var15 = var4;
               break label69;
            }

            boolean var13 = false;
         }

         short var14 = -20526;
         var10001 = -18195;
         var15 = "Untitled";
      }

      String var3 = (String)var15;
      StringBuilder var11 = new StringBuilder();
      var var5 = var3;
      boolean var6 = false;
      int var7 = 0;

      while (true) {
         if (var7 < var5.length()) {
            char var8 = var5.charAt(var7);
            boolean var10 = false;
            var16 = Character.isLetterOrDigit(var8);
            if (var2 != null) {
               break;
            }

            label57: {
               label73: {
                  if (var2 == null) {
                     if (!((Boolean)var16)) {
                        break label73;
                     }

                     var16 = var8;
                  }

                  byte var22 = 32;
                  if (var2 == null) {
                     if (((Character)var16) == ' ') {
                        break label73;
                     }

                     var16 = var8;
                     var22 = 95;
                  }

                  if (var2 == null) {
                     if ((Boolean)var16 == ((var22 == 0))) {
                        break label73;
                     }

                     var16 = var8;
                     var22 = 45;
                  }

                  if ((Boolean)var16 != ((var22 == 0))) {
                     break label57;
                  }
               }

               var11.append(var8);
            }

            var7++;
            if (var2 == null) {
               continue;
            }
         }

         var15 = var11.toString();
         short var24 = -20515;
         short var10003 = 30560;
         Intrinsics.checkNotNullExpressionValue(var15, "toString(...)");
         var5 = StringsKt.take((String)var15, 40);
         var16 = StringsKt.isBlank(var5);
         break;
      }

      if (var2 == null) {
         if (((Boolean)(var16))) {
            return var5;
         }

         boolean var18 = false;
      }

      short var19 = -20537;
      short var23 = 8981;
      return "Untitled";
   }

   private static final boolean b(File var0) {
      int[] var1 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      boolean var10000 = var0.isFile();
      if (var1 == null) {
         if (!var10000) {
            return false;
         }

         String var2 = var0.getName();
         short var10002 = -20540;
         short var10003 = 747;
         Intrinsics.checkNotNullExpressionValue(var2, "getName(...)");
         short var10001 = -20482;
         var10002 = -20725;
         var10000 = StringsKt.endsWith(var2, ".json", false);
      }

      return var1 != null ? var10000 : var10000;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[43];
      int var3 = 0;
      String var2 = "TÆ¥Ï¼\bæLù»\u0005\u0015eü¼Fã\b\u0081\u0004]\u00ad½«r\u0087ºJì.À,ì\u0007ãVA\u0088(&;\"\u0095Ñ¢ã ¼ù\u0092R\u007fYóZÅÞh0{\u001fµÿ\u00839(\u0089\u0095%\u0004\u009bëB¤Æ8\u0010µ\u001d¾Ó\u000b\u0005\u001cr6ë\u001d£Cc4\u0088\u0007\u0086\u0089[È\u0016Æl\u0004\u0088F®C\rÝÖåÔ¢L\u00123ï4\u0006\u0016G\b)ðY,ðè\u0095\u0001\b\u007fK\b>XtF\u0089\u0004\u0099\u0080\u0002É\u0015\u008f'á=Hgôéó\u0010w\u0012À~\u0019T\u0098íNT=\u0006\u0000$\u0094\u0091T\u0086\u0004ÏA\u008cm\u000bO\u008barH;\u0093zW}Ð\u000b\u008f¤y\u0097K\u0087óí[\u008fQ\u0017`\u0089¹XD_Ó\u0082u»Ìc\u0081ÕÄ\u0012*y1K·\u0003\u0018\u0002\u0006Ç\u0004`\u001ag\u0097\u0004\u008e£\u009fâ\u0006\u001b«Ì\"¾\u0096\u0006\u0097ÿ\u009a\u000fª\u0017\u000b¯\u008a²Xo=S³ODÓ\u0007{\u0088Ln$b¸\u0005¥oú\u0094¼\u001cï.í\u001cÉCÄmõ\u0080´\u0000ß*;^-\u007fo¢U-/\u0005U\u0086WG\u0005\u008e¿\u009f\u008e\u0010\u0007K\u0015â[!´\u008a\u0007Ä\u000b¡ Ä\u001d6\b\u0089\u0095M\u0080r}Å³\f\u000b\u0007i\u009fã\\@úÉ«\u0004â\u0004åå\u0085l\u0017\u0085\u0096\u0005»Ó#!\r+J\u0016Wø\u0005Ø¶©íAÙ¹QÙ\u000b%\u0091ã;EQ\u0016>çõÆ\u0005\u009dCÜØ½\u0002Ó©\u0005Ô\u0015õ\u0012\u0098\u0007rÚw\u001a\u001eZm\u0004\u0019d\u001a\\\u0004ê)6ñ\u0002Ï\u0010";
      int var4 = "TÆ¥Ï¼\bæLù»\u0005\u0015eü¼Fã\b\u0081\u0004]\u00ad½«r\u0087ºJì.À,ì\u0007ãVA\u0088(&;\"\u0095Ñ¢ã ¼ù\u0092R\u007fYóZÅÞh0{\u001fµÿ\u00839(\u0089\u0095%\u0004\u009bëB¤Æ8\u0010µ\u001d¾Ó\u000b\u0005\u001cr6ë\u001d£Cc4\u0088\u0007\u0086\u0089[È\u0016Æl\u0004\u0088F®C\rÝÖåÔ¢L\u00123ï4\u0006\u0016G\b)ðY,ðè\u0095\u0001\b\u007fK\b>XtF\u0089\u0004\u0099\u0080\u0002É\u0015\u008f'á=Hgôéó\u0010w\u0012À~\u0019T\u0098íNT=\u0006\u0000$\u0094\u0091T\u0086\u0004ÏA\u008cm\u000bO\u008barH;\u0093zW}Ð\u000b\u008f¤y\u0097K\u0087óí[\u008fQ\u0017`\u0089¹XD_Ó\u0082u»Ìc\u0081ÕÄ\u0012*y1K·\u0003\u0018\u0002\u0006Ç\u0004`\u001ag\u0097\u0004\u008e£\u009fâ\u0006\u001b«Ì\"¾\u0096\u0006\u0097ÿ\u009a\u000fª\u0017\u000b¯\u008a²Xo=S³ODÓ\u0007{\u0088Ln$b¸\u0005¥oú\u0094¼\u001cï.í\u001cÉCÄmõ\u0080´\u0000ß*;^-\u007fo¢U-/\u0005U\u0086WG\u0005\u008e¿\u009f\u008e\u0010\u0007K\u0015â[!´\u008a\u0007Ä\u000b¡ Ä\u001d6\b\u0089\u0095M\u0080r}Å³\f\u000b\u0007i\u009fã\\@úÉ«\u0004â\u0004åå\u0085l\u0017\u0085\u0096\u0005»Ó#!\r+J\u0016Wø\u0005Ø¶©íAÙ¹QÙ\u000b%\u0091ã;EQ\u0016>çõÆ\u0005\u009dCÜØ½\u0002Ó©\u0005Ô\u0015õ\u0012\u0098\u0007rÚw\u001a\u001eZm\u0004\u0019d\u001a\\\u0004ê)6ñ\u0002Ï\u0010"
         .length();
      char var1 = 11;
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
                     case 0 -> 92;
                     case 1 -> 101;
                     case 2 -> 81;
                     case 3 -> 121;
                     case 4 -> 82;
                     case 5 -> 71;
                     default -> 115;
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
                     b = new String[43];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII();
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new GsonBuilder().setPrettyPrinting().create();
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new LinkedHashMap<>();
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = CollectionsKt.emptyList();
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

                  var2 = "VÄYMu\u0084\u0010\u0006k\u0099{¤+¢";
                  var4 = "VÄYMu\u0084\u0010\u0006k\u0099{¤+¢".length();
                  var1 = 7;
                  var8 = -1;
            }

            var10000 = 71;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -20518) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 118;
            case 1 -> 152;
            case 2 -> 42;
            case 3 -> 231;
            case 4 -> 141;
            case 5 -> 90;
            case 6 -> 71;
            case 7 -> 210;
            case 8 -> 165;
            case 9 -> 47;
            case 10 -> 64;
            case 11 -> 128;
            case 12 -> 32;
            case 13 -> 225;
            case 14 -> 205;
            case 15 -> 244;
            case 16 -> 62;
            case 17 -> 218;
            case 18 -> 174;
            case 19 -> 120;
            case 20 -> 17;
            case 21 -> 237;
            case 22 -> 247;
            case 23 -> 135;
            case 24 -> 7;
            case 25 -> 20;
            case 26 -> 156;
            case 27 -> 202;
            case 28 -> 221;
            case 29 -> 153;
            case 30 -> 65;
            case 31 -> 112;
            case 32 -> 99;
            case 33 -> 146;
            case 34 -> 236;
            case 35 -> 117;
            case 36 -> 115;
            case 37 -> 241;
            case 38 -> 159;
            case 39 -> 75;
            case 40 -> 61;
            case 41 -> 226;
            case 42 -> 181;
            case 43 -> 126;
            case 44 -> 168;
            case 45 -> 44;
            case 46 -> 102;
            case 47 -> 110;
            case 48 -> 29;
            case 49 -> 150;
            case 50 -> 158;
            case 51 -> 133;
            case 52 -> 79;
            case 53 -> 224;
            case 54 -> 15;
            case 55 -> 243;
            case 56 -> 151;
            case 57 -> 84;
            case 58 -> 30;
            case 59 -> 1;
            case 60 -> 201;
            case 61 -> 0;
            case 62 -> 220;
            case 63 -> 253;
            case 64 -> 145;
            case 65 -> 104;
            case 66 -> 11;
            case 67 -> 105;
            case 68 -> 183;
            case 69 -> 223;
            case 70 -> 19;
            case 71 -> 48;
            case 72 -> 162;
            case 73 -> 6;
            case 74 -> 31;
            case 75 -> 242;
            case 76 -> 209;
            case 77 -> 63;
            case 78 -> 27;
            case 79 -> 188;
            case 80 -> 95;
            case 81 -> 250;
            case 82 -> 60;
            case 83 -> 122;
            case 84 -> 164;
            case 85 -> 114;
            case 86 -> 132;
            case 87 -> 40;
            case 88 -> 67;
            case 89 -> 39;
            case 90 -> 130;
            case 91 -> 77;
            case 92 -> 147;
            case 93 -> 229;
            case 94 -> 172;
            case 95 -> 85;
            case 96 -> 97;
            case 97 -> 3;
            case 98 -> 238;
            case 99 -> 55;
            case 100 -> 136;
            case 101 -> 21;
            case 102 -> 81;
            case 103 -> 228;
            case 104 -> 199;
            case 105 -> 208;
            case 106 -> 140;
            case 107 -> 148;
            case 108 -> 157;
            case 109 -> 66;
            case 110 -> 94;
            case 111 -> 251;
            case 112 -> 222;
            case 113 -> 9;
            case 114 -> 101;
            case 115 -> 13;
            case 116 -> 169;
            case 117 -> 255;
            case 118 -> 195;
            case 119 -> 207;
            case 120 -> 166;
            case 121 -> 239;
            case 122 -> 12;
            case 123 -> 22;
            case 124 -> 143;
            case 125 -> 68;
            case 126 -> 10;
            case 127 -> 211;
            case 128 -> 4;
            case 129 -> 215;
            case 130 -> 193;
            case 131 -> 175;
            case 132 -> 41;
            case 133 -> 107;
            case 134 -> 34;
            case 135 -> 91;
            case 136 -> 134;
            case 137 -> 93;
            case 138 -> 73;
            case 139 -> 76;
            case 140 -> 46;
            case 141 -> 28;
            case 142 -> 69;
            case 143 -> 163;
            case 144 -> 182;
            case 145 -> 16;
            case 146 -> 26;
            case 147 -> 185;
            case 148 -> 18;
            case 149 -> 184;
            case 150 -> 58;
            case 151 -> 57;
            case 152 -> 43;
            case 153 -> 33;
            case 154 -> 212;
            case 155 -> 189;
            case 156 -> 51;
            case 157 -> 177;
            case 158 -> 254;
            case 159 -> 170;
            case 160 -> 125;
            case 161 -> 203;
            case 162 -> 111;
            case 163 -> 96;
            case 164 -> 92;
            case 165 -> 155;
            case 166 -> 214;
            case 167 -> 230;
            case 168 -> 197;
            case 169 -> 131;
            case 170 -> 35;
            case 171 -> 87;
            case 172 -> 206;
            case 173 -> 249;
            case 174 -> 213;
            case 175 -> 98;
            case 176 -> 49;
            case 177 -> 56;
            case 178 -> 233;
            case 179 -> 127;
            case 180 -> 173;
            case 181 -> 248;
            case 182 -> 192;
            case 183 -> 24;
            case 184 -> 8;
            case 185 -> 23;
            case 186 -> 198;
            case 187 -> 160;
            case 188 -> 78;
            case 189 -> 167;
            case 190 -> 142;
            case 191 -> 5;
            case 192 -> 139;
            case 193 -> 154;
            case 194 -> 70;
            case 195 -> 232;
            case 196 -> 124;
            case 197 -> 50;
            case 198 -> 25;
            case 199 -> 149;
            case 200 -> 179;
            case 201 -> 119;
            case 202 -> 246;
            case 203 -> 53;
            case 204 -> 216;
            case 205 -> 80;
            case 206 -> 74;
            case 207 -> 138;
            case 208 -> 36;
            case 209 -> 204;
            case 210 -> 121;
            case 211 -> 86;
            case 212 -> 161;
            case 213 -> 187;
            case 214 -> 178;
            case 215 -> 194;
            case 216 -> 191;
            case 217 -> 38;
            case 218 -> 108;
            case 219 -> 37;
            case 220 -> 72;
            case 221 -> 45;
            case 222 -> 227;
            case 223 -> 52;
            case 224 -> 144;
            case 225 -> 116;
            case 226 -> 82;
            case 227 -> 200;
            case 228 -> 171;
            case 229 -> 245;
            case 230 -> 14;
            case 231 -> 219;
            case 232 -> 54;
            case 233 -> 83;
            case 234 -> 113;
            case 235 -> 240;
            case 236 -> 186;
            case 237 -> 137;
            case 238 -> 103;
            case 239 -> 88;
            case 240 -> 176;
            case 241 -> 106;
            case 242 -> 123;
            case 243 -> 217;
            case 244 -> 59;
            case 245 -> 190;
            case 246 -> 100;
            case 247 -> 2;
            case 248 -> 235;
            case 249 -> 180;
            case 250 -> 234;
            case 251 -> 196;
            case 252 -> 252;
            case 253 -> 109;
            case 254 -> 129;
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
           this("", new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>()); // PX-FIX: 委托主构造器（final 字段初始化）
        }

      @NotNull
      private String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final LinkedHashMap<String, Integer> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final LinkedHashMap<String, float[]> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @NotNull
      private final LinkedHashMap<String, Float> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         @NotNull String var1,
         @NotNull LinkedHashMap<String, Integer> var2,
         @NotNull LinkedHashMap<String, float[]> var3,
         @NotNull LinkedHashMap<String, Float> var4
      ) {
         short var10001 = 25452;
         short var10002 = -16312;
         Intrinsics.checkNotNullParameter(var1, "name");
         var10001 = 25441;
         var10002 = -24999;
         Intrinsics.checkNotNullParameter(var2, "colors");
         var10001 = 25448;
         var10002 = 128;
         Intrinsics.checkNotNullParameter(var3, "shaders");
         var10001 = 25440;
         var10002 = 22748;
         Intrinsics.checkNotNullParameter(var4, "numbers");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
      }

      @NotNull
      public final String a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final void a(@NotNull String var1) {
         short var10001 = 25447;
         short var10002 = -21710;
         Intrinsics.checkNotNullParameter(var1, "<set-?>");
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      }

      @NotNull
      public final LinkedHashMap<String, Integer> b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final LinkedHashMap<String, float[]> c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final LinkedHashMap<String, Float> d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll b(
         @NotNull String var1
      ) {
         short var10001 = 25451;
         short var10002 = -19938;
         Intrinsics.checkNotNullParameter(var1, "newName");
         int[] var10000 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
         llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = new llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, null, null, null, 14, null
         );
         var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .putAll(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         int[] var2 = var10000;
         Map var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         boolean var5 = false;
         Iterator var6 = var4.entrySet().iterator();

         while (true) {
            if (var6.hasNext()) {
               Entry var7 = (Entry)var6.next();
               boolean var9 = false;
               String var10 = (String)var7.getKey();
               float[] var11 = (float[])var7.getValue();
               Map var12 = var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               float[] var13 = Arrays.copyOf(var11, var11.length);
               short var10004 = 25446;
               short var10005 = 28871;
               Intrinsics.checkNotNullExpressionValue(var13, "copyOf(...)");
               var12.put(var10, var13);
               if (var2 != null) {
                  break;
               }

               if (var2 == null) {
                  continue;
               }
            }

            var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
               .putAll(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
            break;
         }

         return var3;
      }

      @NotNull
      public final String e() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final LinkedHashMap<String, Integer> f() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final LinkedHashMap<String, float[]> g() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final LinkedHashMap<String, Float> h() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         @NotNull String var1,
         @NotNull LinkedHashMap<String, Integer> var2,
         @NotNull LinkedHashMap<String, float[]> var3,
         @NotNull LinkedHashMap<String, Float> var4
      ) {
         short var10001 = 25445;
         short var10002 = 18468;
         Intrinsics.checkNotNullParameter(var1, "name");
         var10001 = 25449;
         var10002 = -14913;
         Intrinsics.checkNotNullParameter(var2, "colors");
         var10001 = 25442;
         var10002 = 4555;
         Intrinsics.checkNotNullParameter(var3, "shaders");
         var10001 = 25453;
         var10002 = 7640;
         Intrinsics.checkNotNullParameter(var4, "numbers");
         return new llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2, var3, var4
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 25455;
         LinkedHashMap var1 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         LinkedHashMap var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         LinkedHashMap var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         String var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -21841;
         short var10002 = 25443;
         short var10003 = -10777;
         short var10004 = 25444;
         short var10005 = -13206;
         short var10006 = 25454;
         short var10007 = -24995;
         return "ThemeData(name=" + var4 + ", colors=" + var3 + ", shaders=" + var2 + ", numbers=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         var1 = var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
         var1 = var1 * 31 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.hashCode();
         return var1 * 31 + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int[] var2 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
         Object var10000 = this;
         if (var2 == null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == null) {
            if (!(
               var10000 instanceof llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
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

            var4 = Intrinsics.areEqual(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            );
         }

         if (var2 == null) {
            if (!var4) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
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

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
         this(null, null, null, null, 15, null);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[16];
         int var3 = 0;
         String var2 = "\u0002yé\u0015 \u0090Z\u001e°±\u0004>ÌzÇ\u000bÍ\u000fµlf\u008e$ÃÆÎl\u0007X\u0085¦¯Ñ\u0003ê\u0007U+\u0017ª¦:\b\u0006\u0094\\\u0082\u0010\"À\u00075\u008d©ÆüqC\t{\\Ö¶X\bþf\u009f\u0004.°xH\u0007û¤Â[\u001c\u0004_\n\u008eÜe¼\u0083\u001d³i\u008d_\u000fÇí0ÃKÏ§×\u0099[fÆ1\u0096M\u0007\u0019\u009b,\u0004L)U\u0006¯´å\rÎc";
         int var4 = "\u0002yé\u0015 \u0090Z\u001e°±\u0004>ÌzÇ\u000bÍ\u000fµlf\u008e$ÃÆÎl\u0007X\u0085¦¯Ñ\u0003ê\u0007U+\u0017ª¦:\b\u0006\u0094\\\u0082\u0010\"À\u00075\u008d©ÆüqC\t{\\Ö¶X\bþf\u009f\u0004.°xH\u0007û¤Â[\u001c\u0004_\n\u008eÜe¼\u0083\u001d³i\u008d_\u000fÇí0ÃKÏ§×\u0099[fÆ1\u0096M\u0007\u0019\u009b,\u0004L)U\u0006¯´å\rÎc"
            .length();
         char var1 = '\n';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 18;
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
                        case 0 -> 43;
                        case 1 -> 50;
                        case 2 -> 70;
                        case 3 -> 96;
                        case 4 -> 121;
                        case 5 -> 111;
                        default -> 25;
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
                        b = new String[16];
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

                     var2 = "T\u009e\u0018\u0005\u0006ÑSC\u0007s\u008d£*\u0007öÄ";
                     var4 = "T\u009e\u0018\u0005\u0006ÑSC\u0007s\u008d£*\u0007öÄ".length();
                     var1 = '\b';
                     var8 = -1;
               }

               var10000 = 25;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 25444) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 133;
               case 1 -> 166;
               case 2 -> 108;
               case 3 -> 161;
               case 4 -> 0;
               case 5 -> 20;
               case 6 -> 105;
               case 7 -> 187;
               case 8 -> 205;
               case 9 -> 242;
               case 10 -> 66;
               case 11 -> 96;
               case 12 -> 76;
               case 13 -> 104;
               case 14 -> 102;
               case 15 -> 153;
               case 16 -> 122;
               case 17 -> 84;
               case 18 -> 106;
               case 19 -> 137;
               case 20 -> 127;
               case 21 -> 253;
               case 22 -> 145;
               case 23 -> 207;
               case 24 -> 86;
               case 25 -> 151;
               case 26 -> 21;
               case 27 -> 217;
               case 28 -> 195;
               case 29 -> 8;
               case 30 -> 6;
               case 31 -> 24;
               case 32 -> 45;
               case 33 -> 152;
               case 34 -> 154;
               case 35 -> 120;
               case 36 -> 88;
               case 37 -> 26;
               case 38 -> 210;
               case 39 -> 129;
               case 40 -> 246;
               case 41 -> 238;
               case 42 -> 197;
               case 43 -> 215;
               case 44 -> 51;
               case 45 -> 22;
               case 46 -> 74;
               case 47 -> 233;
               case 48 -> 254;
               case 49 -> 182;
               case 50 -> 128;
               case 51 -> 170;
               case 52 -> 10;
               case 53 -> 103;
               case 54 -> 138;
               case 55 -> 155;
               case 56 -> 19;
               case 57 -> 221;
               case 58 -> 71;
               case 59 -> 83;
               case 60 -> 14;
               case 61 -> 172;
               case 62 -> 57;
               case 63 -> 18;
               case 64 -> 43;
               case 65 -> 239;
               case 66 -> 121;
               case 67 -> 147;
               case 68 -> 1;
               case 69 -> 116;
               case 70 -> 34;
               case 71 -> 113;
               case 72 -> 250;
               case 73 -> 179;
               case 74 -> 230;
               case 75 -> 175;
               case 76 -> 236;
               case 77 -> 67;
               case 78 -> 111;
               case 79 -> 159;
               case 80 -> 219;
               case 81 -> 228;
               case 82 -> 109;
               case 83 -> 65;
               case 84 -> 222;
               case 85 -> 125;
               case 86 -> 12;
               case 87 -> 50;
               case 88 -> 87;
               case 89 -> 186;
               case 90 -> 220;
               case 91 -> 206;
               case 92 -> 58;
               case 93 -> 13;
               case 94 -> 135;
               case 95 -> 2;
               case 96 -> 91;
               case 97 -> 213;
               case 98 -> 224;
               case 99 -> 110;
               case 100 -> 32;
               case 101 -> 209;
               case 102 -> 214;
               case 103 -> 23;
               case 104 -> 99;
               case 105 -> 37;
               case 106 -> 47;
               case 107 -> 41;
               case 108 -> 218;
               case 109 -> 178;
               case 110 -> 149;
               case 111 -> 90;
               case 112 -> 148;
               case 113 -> 255;
               case 114 -> 227;
               case 115 -> 62;
               case 116 -> 17;
               case 117 -> 191;
               case 118 -> 199;
               case 119 -> 100;
               case 120 -> 95;
               case 121 -> 52;
               case 122 -> 171;
               case 123 -> 223;
               case 124 -> 130;
               case 125 -> 49;
               case 126 -> 79;
               case 127 -> 61;
               case 128 -> 225;
               case 129 -> 15;
               case 130 -> 252;
               case 131 -> 249;
               case 132 -> 40;
               case 133 -> 192;
               case 134 -> 177;
               case 135 -> 112;
               case 136 -> 150;
               case 137 -> 180;
               case 138 -> 25;
               case 139 -> 131;
               case 140 -> 98;
               case 141 -> 31;
               case 142 -> 169;
               case 143 -> 188;
               case 144 -> 36;
               case 145 -> 201;
               case 146 -> 38;
               case 147 -> 63;
               case 148 -> 89;
               case 149 -> 69;
               case 150 -> 202;
               case 151 -> 78;
               case 152 -> 27;
               case 153 -> 229;
               case 154 -> 234;
               case 155 -> 142;
               case 156 -> 123;
               case 157 -> 29;
               case 158 -> 75;
               case 159 -> 33;
               case 160 -> 97;
               case 161 -> 193;
               case 162 -> 72;
               case 163 -> 70;
               case 164 -> 158;
               case 165 -> 115;
               case 166 -> 183;
               case 167 -> 216;
               case 168 -> 204;
               case 169 -> 11;
               case 170 -> 211;
               case 171 -> 42;
               case 172 -> 59;
               case 173 -> 139;
               case 174 -> 77;
               case 175 -> 248;
               case 176 -> 241;
               case 177 -> 208;
               case 178 -> 164;
               case 179 -> 56;
               case 180 -> 35;
               case 181 -> 212;
               case 182 -> 244;
               case 183 -> 194;
               case 184 -> 64;
               case 185 -> 247;
               case 186 -> 80;
               case 187 -> 160;
               case 188 -> 146;
               case 189 -> 39;
               case 190 -> 196;
               case 191 -> 200;
               case 192 -> 157;
               case 193 -> 156;
               case 194 -> 44;
               case 195 -> 189;
               case 196 -> 93;
               case 197 -> 94;
               case 198 -> 46;
               case 199 -> 82;
               case 200 -> 85;
               case 201 -> 243;
               case 202 -> 237;
               case 203 -> 245;
               case 204 -> 92;
               case 205 -> 60;
               case 206 -> 165;
               case 207 -> 144;
               case 208 -> 235;
               case 209 -> 226;
               case 210 -> 30;
               case 211 -> 173;
               case 212 -> 54;
               case 213 -> 174;
               case 214 -> 162;
               case 215 -> 163;
               case 216 -> 232;
               case 217 -> 168;
               case 218 -> 107;
               case 219 -> 3;
               case 220 -> 198;
               case 221 -> 119;
               case 222 -> 53;
               case 223 -> 140;
               case 224 -> 73;
               case 225 -> 184;
               case 226 -> 181;
               case 227 -> 114;
               case 228 -> 55;
               case 229 -> 118;
               case 230 -> 134;
               case 231 -> 124;
               case 232 -> 185;
               case 233 -> 4;
               case 234 -> 141;
               case 235 -> 16;
               case 236 -> 126;
               case 237 -> 203;
               case 238 -> 81;
               case 239 -> 101;
               case 240 -> 176;
               case 241 -> 251;
               case 242 -> 240;
               case 243 -> 190;
               case 244 -> 48;
               case 245 -> 9;
               case 246 -> 231;
               case 247 -> 7;
               case 248 -> 117;
               case 249 -> 68;
               case 250 -> 28;
               case 251 -> 136;
               case 252 -> 143;
               case 253 -> 167;
               case 254 -> 5;
               default -> 132;
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
       public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(java.lang.String var0, java.util.LinkedHashMap var1, java.util.LinkedHashMap var2, java.util.LinkedHashMap var3, int var4, kotlin.jvm.internal.DefaultConstructorMarker var5) { this((var4 & 1) != 0 ? "Untitled" : var0, (var4 & 2) != 0 ? new java.util.LinkedHashMap() : var1, (var4 & 4) != 0 ? new java.util.LinkedHashMap() : var2, (var4 & 8) != 0 ? new java.util.LinkedHashMap() : var3); }
       public static me.octo.client.llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(me.octo.client.llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0, java.lang.String var1, int var2, java.lang.Object var3) {
           if ((var2 & 1) != 0) var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
           return var0.b(var1);
       }
       public static me.octo.client.llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(me.octo.client.llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0, java.lang.String var1, java.util.LinkedHashMap var2, java.util.LinkedHashMap var3, java.util.LinkedHashMap var4, int var5, java.lang.Object var6) {
           if ((var5 & 8) != 0) var4 = var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
           return var0.a(var1, var2, var3, var4);
       }
   }
    public static me.octo.client.llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(me.octo.client.llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII var0, java.lang.String var1, int var2, java.lang.Object var3) {
        if ((var2 & 1) != 0) var1 = "Custom";
        return var0.d(var1);
    }
}
