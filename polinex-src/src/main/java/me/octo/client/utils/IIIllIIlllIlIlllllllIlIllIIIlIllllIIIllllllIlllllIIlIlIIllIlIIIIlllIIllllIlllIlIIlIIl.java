package me.octo.client.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIIllIIlllIlIlllllllIlIllIIIlIllllIIIllllllIlllllIIlIlIIllIlIIIIlllIIllllIlllIlIIlIIl {
   public static <T> T a(Object p0) { return null; } // PX-FIX ovld

   @NotNull
   public static IIIllIIlllIlIlllllllIlIllIIIlIllllIIIllllllIlllllIIlIlIIllIlIIIIlllIIllllIlllIlIIlIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static List<llllllIlIlIIlIIllIIllllIllIlIlIllIIIlIIlIllllIlIllIIIIlllIIlIllIIlIIlIllIIIlIIIllIllI> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @Nullable
   private static Integer IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static File lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static String[] a;
   private static String[] b;

   private IIIllIIlllIlIlllllllIlIllIIIlIllllIIIllllllIlllllIIlIlIIllIlIIIIlllIIllllIlllIlIIlIIl() {
   }

   @NotNull
   public final List<llllllIlIlIIlIIllIIllllIllIlIlIllIIIlIIlIllllIlIllIIIIlllIIlIllIIlIIlIllIIIlIIIllIllI> a() {
      return CollectionsKt.toList(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
   }

   @Nullable
   public final llllllIlIlIIlIIllIIllllIllIlIlIllIIIlIIlIllllIlIllIIIIlllIIlIllIIlIIlIllIIIlIIIllIllI b() {
      int var4 = 0; // PX-FIX
      String[] var1 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.e();
      llllllIlIlIIlIIllIIllllIllIlIlIllIIIlIIlIllllIlIllIIIIlllIIlIllIIlIIlIllIIIlIIIllIllI var10000;
      if (var1 != null && IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl != null) {
         int var2;
         label30: {
            var2 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.intValue();
            boolean var3 = false;
            var4 = 0;
            int var10001 = var2;
            if (var1 != null) {
               if (0 > var2) {
                  var4 = 0;
                  break label30;
               }

               var4 = var2;
               if (var1 == null) {
                  break label30;
               }

               var10001 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.size();
            }

            var4 = var4 < var10001 ? 1 : 0;
         }

         var10000 = var4 != 0 ? lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.get(var2) : null;
      } else {
         var10000 = null;
      }

      return var10000;
   }

   @Nullable
   public final Integer c() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final boolean a(@NotNull llllllIlIlIIlIIllIIllllIllIlIlIllIIIlIIlIllllIlIllIIIIlllIIlIllIIlIIlIllIIIlIIIllIllI var1) {
      Intrinsics.checkNotNullParameter(var1, "proxy");
      // Original bytecode (offsets 17-140): scan the static list, compare names case-insensitively
      // (StringsKt.equals(a(), a(), true)); on a hit return false, otherwise add and save via f().
      java.util.List<llllllIlIlIIlIIllIIllllIllIlIlIllIIIlIIlIllllIlIllIIIIlllIIlIllIIlIIlIllIIIlIIIllIllI> var3 =
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      boolean var10 = false;
      if (!(var3 instanceof java.util.Collection && ((java.util.Collection<?>)var3).isEmpty())) {
         for (llllllIlIlIIlIIllIIllllIllIlIlIllIIIlIIlIllllIlIllIIIIlllIIlIllIIlIIlIllIIIlIIIllIllI var7 : var3) {
            if (kotlin.text.StringsKt.equals(var7.a(), var1.a(), true)) {
               var10 = true;
               break;
            }
         }
      }

      if (var10) {
         return false;
      }

      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.add(var1);
      this.f();
      return true;
   }

   public final boolean a(int var1) {
      String[] var2;
      int var10000;
      label52: {
         var2 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.e();
         var10000 = 0;
         int var10001 = var1;
         if (var2 != null) {
            if (0 > var1) {
               var10000 = 0;
               break label52;
            }

            var10000 = var1;
            if (var2 == null) {
               break label52;
            }

            var10001 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.size();
         }

         var10000 = var10000 < var10001 ? 1 : 0;
      }

      if (var10000 == 0) {
         return false;
      } else {
         label42: {
            label56: {
               if (IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl != null
                  && IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == var1) {
                  this.d();
                  if (var2 != null) {
                     break label56;
                  }
               }

               if (var2 == null) {
                  break label42;
               }

               if (IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl != null) {
                  Integer var4 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                  Intrinsics.checkNotNull(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
                  int var5 = var4;
                  if (var2 == null) {
                     return (var5 != 0);
                  }

                  if (var5 > var1) {
                     Integer var6 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                     Intrinsics.checkNotNull(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var6 - 1;
                  }
               }
            }

            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.remove(var1);
         }

         this.f();
         return (1 != 0);
      }
   }

   public final boolean b(int var1) {
      int var10000;
      label25: {
         String[] var2 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.e();
         var10000 = 0;
         int var10001 = var1;
         if (var2 != null) {
            if (0 > var1) {
               var10000 = 0;
               break label25;
            }

            var10000 = var1;
            if (var2 == null) {
               break label25;
            }

            var10001 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.size();
         }

         var10000 = var10000 < var10001 ? 1 : 0;
      }

      if (var10000 == 0) {
         return false;
      } else {
         llllllIlIlIIlIIllIIllllIllIlIlIllIIIlIIlIllllIlIllIIIIlllIIlIllIIlIIlIllIIIlIIIllIllI var3 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.get(
            var1
         );
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
         IIlllllllIlIlllIIIIllIllIlIIIIIlllIlIIlllllllllIIllIIIlIIlllIIIlIlIllIllllIIIIIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var3);
         IIlllllllIlIlllIIIIllIllIlIIIIIlllIlIIlllllllllIIllIIIlIIlllIIIlIlIllIllllIIIIIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(true);
         this.f();
         return true;
      }
   }

   public final void d() {
      String[] var1 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.e();
      if (var1 != null) {
         if (IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == null) {
            return;
         }

         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = null;
         IIlllllllIlIlllIIIIllIllIlIIIIIlllIlIIlllllllllIIllIIIlIIlllIIIlIlIllIllllIIIIIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(null);
         IIlllllllIlIlllIIIIllIllIlIIIIIlllIlIIlllllllllIIllIIIlIIlllIIIlIlIllIllllIIIIIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(false);
      }

      this.f();
   }

   public final boolean c(int var1) {
      String[] var2 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.e();
      if (IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl != null) {
         int var10000 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if (var2 == null) {
            return (var10000 != 0);
         }

         if (var10000 == var1) {
            return (1 != 0);
         }
      }

      return (0 != 0);
   }

   public final boolean e() {
      String[] var1 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.e();
      if (IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl != null) {
         boolean var10000 = IIlllllllIlIlllIIIIllIllIlIIIIIlllIlIIlllllllllIIllIIIlIIlllIIIlIlIllIllllIIIIIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a();
         if (var1 == null) {
            return var10000;
         }

         if (var10000) {
            return true;
         }
      }

      return false;
   }

   private final void f() {
      String[] var1 = me.octo.client.utils.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.e();
      if (var1 != null) {
         java.io.File var7 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.getParentFile();
         if (var7 != null) {
            var7.mkdirs();
         }
      }
      com.google.gson.JsonObject var2 = new com.google.gson.JsonObject();
      var2.addProperty("activeIndex", (Number)IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      com.google.gson.JsonArray var3 = new com.google.gson.JsonArray();
      for (Object var8 : lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
         me.octo.client.utils.llllllIlIlIIlIIllIIllllIllIlIlIllIIIlIIlIllllIlIllIIIIlllIIlIllIIlIIlIllIIIlIIIllIllI var5 = (me.octo.client.utils.llllllIlIlIIlIIllIIllllIllIlIlIllIIIlIIlIllllIlIllIIIIlllIIlIllIIlIIlIllIIIlIIIllIllI)var8;
         com.google.gson.JsonObject var6 = new com.google.gson.JsonObject();
         var6.addProperty("name", var5.a());
         var6.addProperty("type", var5.b().name());
         var6.addProperty("ip", var5.c());
         var6.addProperty("port", (Number)Integer.valueOf(var5.d()));
         var6.addProperty("username", var5.e());
         var6.addProperty("password", var5.f());
         var3.add((com.google.gson.JsonElement)var6);
      }
      var2.add("proxies", (com.google.gson.JsonElement)var3);
      try {
         java.io.Closeable var4 = (java.io.Closeable)(new java.io.FileWriter(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI));
         Throwable var5t = null;
         try {
            ((java.io.FileWriter)var4).write(var2.toString());
         } finally {
            kotlin.io.CloseableKt.closeFinally(var4, var5t);
         }
      } catch (Exception var9) {
         var9.printStackTrace();
      }
   }

   private final void g() {
      if (!lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.exists()) {
         return;
      }

      try {
         java.io.FileReader var1 = new java.io.FileReader(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         try {
            com.google.gson.JsonObject var5 = com.google.gson.JsonParser.parseReader((java.io.Reader)var1).getAsJsonObject();
            if (var5.has("activeIndex") && !var5.get("activeIndex").isJsonNull()) {
               IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = Integer.valueOf(var5.get("activeIndex").getAsInt());
            }

            if (var5.has("proxies")) {
               com.google.gson.JsonArray var6 = var5.getAsJsonArray("proxies");
               lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.clear();
               java.util.Iterator<com.google.gson.JsonElement> var7 = var6.iterator();
               Intrinsics.checkNotNullExpressionValue(var7, "iterator(...)");

               while (var7.hasNext()) {
                  com.google.gson.JsonObject var9 = ((com.google.gson.JsonElement)var7.next()).getAsJsonObject();
                  IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var10 =
                     IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a(var9.get("type").getAsString());
                  if (var10 == null) {
                     var10 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
                  }

                  String var11 = var9.has("username") ? var9.get("username").getAsString() : "";
                  Intrinsics.checkNotNull(var11);
                  String var12 = var9.has("password") ? var9.get("password").getAsString() : "";
                  Intrinsics.checkNotNull(var12);
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.add(
                     new llllllIlIlIIlIIllIIllllIllIlIlIllIIIlIIlIllllIlIllIIIIlllIIlIllIIlIIlIllIIIlIIIllIllI(
                        var9.get("name").getAsString(),
                        var10,
                        var9.get("ip").getAsString(),
                        var9.get("port").getAsInt(),
                        var11,
                        var12
                     )
                  );
               }
            }

            if (IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl != null) {
               int var13 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.size();
               int var14 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.intValue();
               if (0 <= var14 && var14 < var13) {
                  IIlllllllIlIlllIIIIllIllIlIIIIIlllIlIIlllllllllIIllIIIlIIlllIIIlIlIllIllllIIIIIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.get(var14)
                  );
                  IIlllllllIlIlllIIIIllIllIlIIIIIlllIlIIlllllllllIIllIIIlIIlllIIIlIlIllIllllIIIIIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(true);
               }
            }
         } finally {
            kotlin.io.CloseableKt.closeFinally(var1, (Throwable)null);
         }
      } catch (Exception var16) {
         var16.printStackTrace();
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[21];
      int var3 = 0;
      String var2 = "õþ²¥»,|)\u0002\u0017M\u0002X\u000f\u0004c\u0091T\u0014\u0010RÚ\u0007Æ#'È+^\u0085ýqßèº\u000b\u0007Uõ\tï\u0080*â\u000bØ\u001b\u0090\u0010Ôæ®ÿ\u0005\u008b%\u00045ßÚÆ\b¯ýJ\u0094i%\u0003Æ\r\u0097Ta\u0017Îo>á¹\u009c!\u001c#\bJ\u0003öKþÞñ¹\b¿]ûÑ\u0092¢Yø\u0004\u009f\u001cË¥\u0014\u0096!rÚ\u008b¿o\u0095>¸Ã\u0019Vôy\u00adê8_±\u00045×ÚÇ\u0004hì³~\u0004\n\u001aÿ \u0010¨\u0096XOÈ\u0016µ\rñA\béaûmi\u0005m\u0080\u000eAp";
      int var4 = "õþ²¥»,|)\u0002\u0017M\u0002X\u000f\u0004c\u0091T\u0014\u0010RÚ\u0007Æ#'È+^\u0085ýqßèº\u000b\u0007Uõ\tï\u0080*â\u000bØ\u001b\u0090\u0010Ôæ®ÿ\u0005\u008b%\u00045ßÚÆ\b¯ýJ\u0094i%\u0003Æ\r\u0097Ta\u0017Îo>á¹\u009c!\u001c#\bJ\u0003öKþÞñ¹\b¿]ûÑ\u0092¢Yø\u0004\u009f\u001cË¥\u0014\u0096!rÚ\u008b¿o\u0095>¸Ã\u0019Vôy\u00adê8_±\u00045×ÚÇ\u0004hì³~\u0004\n\u001aÿ \u0010¨\u0096XOÈ\u0016µ\rñA\béaûmi\u0005m\u0080\u000eAp"
         .length();
      char var1 = '\b';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 12;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var25 = var10001.toCharArray();
               int var10004 = var25.length;
               int var6 = 0;
               byte var28 = var10000;
               var20 = var25;
               int var14 = var10004;
               byte var34;
               char[] var38;
               int var10006;
               if (var10004 <= 1) {
                  var38 = var25;
                  var34 = var10000;
                  var10006 = var6;
               } else {
                  var28 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var38 = var25;
                  var34 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var38[var10006] = (char)(var38[var10006] ^ var34 ^ switch (var6 % 7) {
                     case 0 -> 72;
                     case 1 -> 84;
                     case 2 -> 54;
                     case 3 -> 18;
                     case 4 -> 1;
                     case 5 -> 10;
                     default -> 104;
                  });
                  var6++;
                  if (var28 == 0) {
                     var10006 = var28;
                     var38 = var20;
                     var34 = var28;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var38 = var20;
                     var34 = var28;
                     var10006 = var6;
                  }
               }
            }

            String var30 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var30;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[21];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIIllIIlllIlIlllllllIlIllIIIlIllllIIIllllllIlllllIIlIlIIllIlIIIIlllIIllllIlllIlIIlIIl();
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new ArrayList<>();
                     var10002 = -28252;
                     short var31 = -15280;
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new File("polinex/proxies.json");
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.g();
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var30;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "øÐ\u0091lñl\u000f«4\u0004\u0006\u0007Ìw?ºC\u0085\u009f";
                  var4 = "øÐ\u0091lñl\u000f«4\u0004\u0006\u0007Ìw?ºC\u0085\u009f".length();
                  var1 = 11;
                  var8 = -1;
            }

            var10000 = 45;
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
      int var2 = (var0 ^ -28247) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 227;
            case 1 -> 157;
            case 2 -> 199;
            case 3 -> 39;
            case 4 -> 224;
            case 5 -> 85;
            case 6 -> 219;
            case 7 -> 189;
            case 8 -> 217;
            case 9 -> 234;
            case 10 -> 14;
            case 11 -> 105;
            case 12 -> 181;
            case 13 -> 162;
            case 14 -> 155;
            case 15 -> 252;
            case 16 -> 223;
            case 17 -> 32;
            case 18 -> 114;
            case 19 -> 229;
            case 20 -> 235;
            case 21 -> 192;
            case 22 -> 20;
            case 23 -> 138;
            case 24 -> 182;
            case 25 -> 2;
            case 26 -> 212;
            case 27 -> 168;
            case 28 -> 210;
            case 29 -> 209;
            case 30 -> 172;
            case 31 -> 161;
            case 32 -> 36;
            case 33 -> 111;
            case 34 -> 221;
            case 35 -> 59;
            case 36 -> 198;
            case 37 -> 244;
            case 38 -> 18;
            case 39 -> 195;
            case 40 -> 63;
            case 41 -> 99;
            case 42 -> 43;
            case 43 -> 151;
            case 44 -> 101;
            case 45 -> 186;
            case 46 -> 242;
            case 47 -> 94;
            case 48 -> 73;
            case 49 -> 93;
            case 50 -> 191;
            case 51 -> 27;
            case 52 -> 118;
            case 53 -> 11;
            case 54 -> 51;
            case 55 -> 26;
            case 56 -> 70;
            case 57 -> 237;
            case 58 -> 92;
            case 59 -> 68;
            case 60 -> 34;
            case 61 -> 140;
            case 62 -> 204;
            case 63 -> 125;
            case 64 -> 102;
            case 65 -> 71;
            case 66 -> 200;
            case 67 -> 202;
            case 68 -> 173;
            case 69 -> 160;
            case 70 -> 222;
            case 71 -> 159;
            case 72 -> 10;
            case 73 -> 214;
            case 74 -> 228;
            case 75 -> 178;
            case 76 -> 251;
            case 77 -> 44;
            case 78 -> 19;
            case 79 -> 146;
            case 80 -> 231;
            case 81 -> 245;
            case 82 -> 103;
            case 83 -> 78;
            case 84 -> 167;
            case 85 -> 58;
            case 86 -> 88;
            case 87 -> 106;
            case 88 -> 132;
            case 89 -> 131;
            case 90 -> 185;
            case 91 -> 170;
            case 92 -> 104;
            case 93 -> 196;
            case 94 -> 203;
            case 95 -> 150;
            case 96 -> 249;
            case 97 -> 166;
            case 98 -> 130;
            case 99 -> 124;
            case 100 -> 35;
            case 101 -> 22;
            case 102 -> 216;
            case 103 -> 47;
            case 104 -> 207;
            case 105 -> 109;
            case 106 -> 154;
            case 107 -> 158;
            case 108 -> 197;
            case 109 -> 112;
            case 110 -> 232;
            case 111 -> 243;
            case 112 -> 95;
            case 113 -> 247;
            case 114 -> 211;
            case 115 -> 145;
            case 116 -> 255;
            case 117 -> 218;
            case 118 -> 25;
            case 119 -> 213;
            case 120 -> 12;
            case 121 -> 21;
            case 122 -> 183;
            case 123 -> 16;
            case 124 -> 15;
            case 125 -> 215;
            case 126 -> 38;
            case 127 -> 205;
            case 128 -> 5;
            case 129 -> 53;
            case 130 -> 86;
            case 131 -> 143;
            case 132 -> 188;
            case 133 -> 30;
            case 134 -> 122;
            case 135 -> 0;
            case 136 -> 175;
            case 137 -> 24;
            case 138 -> 8;
            case 139 -> 137;
            case 140 -> 54;
            case 141 -> 230;
            case 142 -> 110;
            case 143 -> 97;
            case 144 -> 72;
            case 145 -> 40;
            case 146 -> 177;
            case 147 -> 225;
            case 148 -> 126;
            case 149 -> 45;
            case 150 -> 123;
            case 151 -> 254;
            case 152 -> 253;
            case 153 -> 28;
            case 154 -> 80;
            case 155 -> 29;
            case 156 -> 13;
            case 157 -> 76;
            case 158 -> 115;
            case 159 -> 67;
            case 160 -> 83;
            case 161 -> 74;
            case 162 -> 9;
            case 163 -> 250;
            case 164 -> 17;
            case 165 -> 66;
            case 166 -> 4;
            case 167 -> 165;
            case 168 -> 142;
            case 169 -> 116;
            case 170 -> 153;
            case 171 -> 79;
            case 172 -> 42;
            case 173 -> 3;
            case 174 -> 187;
            case 175 -> 171;
            case 176 -> 201;
            case 177 -> 91;
            case 178 -> 120;
            case 179 -> 1;
            case 180 -> 164;
            case 181 -> 64;
            case 182 -> 75;
            case 183 -> 141;
            case 184 -> 128;
            case 185 -> 121;
            case 186 -> 37;
            case 187 -> 81;
            case 188 -> 41;
            case 189 -> 133;
            case 190 -> 87;
            case 191 -> 82;
            case 192 -> 31;
            case 193 -> 139;
            case 194 -> 84;
            case 195 -> 169;
            case 196 -> 156;
            case 197 -> 69;
            case 198 -> 147;
            case 199 -> 241;
            case 200 -> 52;
            case 201 -> 163;
            case 202 -> 62;
            case 203 -> 248;
            case 204 -> 135;
            case 205 -> 89;
            case 206 -> 107;
            case 207 -> 238;
            case 208 -> 190;
            case 209 -> 60;
            case 210 -> 174;
            case 211 -> 48;
            case 212 -> 233;
            case 213 -> 61;
            case 214 -> 55;
            case 215 -> 176;
            case 216 -> 148;
            case 217 -> 90;
            case 218 -> 50;
            case 219 -> 246;
            case 220 -> 208;
            case 221 -> 180;
            case 222 -> 49;
            case 223 -> 23;
            case 224 -> 226;
            case 225 -> 206;
            case 226 -> 117;
            case 227 -> 127;
            case 228 -> 46;
            case 229 -> 96;
            case 230 -> 56;
            case 231 -> 57;
            case 232 -> 136;
            case 233 -> 193;
            case 234 -> 184;
            case 235 -> 119;
            case 236 -> 179;
            case 237 -> 7;
            case 238 -> 240;
            case 239 -> 134;
            case 240 -> 144;
            case 241 -> 220;
            case 242 -> 6;
            case 243 -> 77;
            case 244 -> 108;
            case 245 -> 149;
            case 246 -> 33;
            case 247 -> 152;
            case 248 -> 100;
            case 249 -> 129;
            case 250 -> 194;
            case 251 -> 65;
            case 252 -> 239;
            case 253 -> 113;
            case 254 -> 98;
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
}
