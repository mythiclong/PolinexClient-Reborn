package me.octo.client;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIllIIIllllllIIllIIIlIllIllIIlIIlIlllIlllIIIIllIIlIIIIllIlIllIIlllIllllIllIIlllIlIlII {
   @NotNull
   public static final IIllIIIllllllIIllIIIlIllIllIIlIIlIlllIlllIIIIllIIlIIIIllIlIllIIlllIllllIllIIlllIlIlII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl =
      new IIllIIIllllllIIllIIIlIllIllIIlIIlIlllIlllIIIIllIIlIIIIllIlIllIIlllIllllIllIIlllIlIlII();
   @NotNull
   private static final Gson lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII =
      new Gson();
   @NotNull
   private static final String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl =
      "https://api.polinexclient.net/polinex/mod/fabric/routes";
   @NotNull
   private static final ConcurrentHashMap<String, Integer> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI =
      new ConcurrentHashMap<>();
   private static String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII =
      new String[4];
   private static String[] b;
   private static String[] c;

   private IIllIIIllllllIIllIIIlIllIllIIlIIlIlllIlllIIIIllIIlIIIIllIlIllIIlllIllllIllIIlllIlIlII() {
   }

   public final boolean a(@NotNull String var1) {
      Integer value = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var1);
      return value != null && value > 0;
   }

   @Nullable
   public final List<IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl> a() {
      return Collections.emptyList();
   }

   @Nullable
   public final List<IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl> b() {
      return Collections.emptyList();
   }

   @Nullable
   public final IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl b(
      @NotNull String var1
   ) {
      return null;
   }

   @Nullable
   public final String c(@NotNull String var1) {
      return "";
   }

   @NotNull
   public final lIIIllllllllIIIlIIIIllIIIIlllllIlIIIllIIIIlIIIlIIIllIIlllIlIllIlllIIIlIllllIIllIlIlII d(
      @NotNull String var1
   ) {
      return null;
   }

   @Nullable
   public final lIIllIIIIlIIlIIllIIlIllIIllIllIlIIlllIllIIIlIIllIlIIllIIlIIIlllIllIlIlIllIIlllIlIlllI a(
      @NotNull String var1, @NotNull String var2, @NotNull String var3
   ) {
      return null;
   }

   @Nullable
   public final lIIllIIIIlIIlIIllIIlIllIIllIllIlIIlllIllIIIlIIllIlIIllIIlIIIlllIllIlIlIllIIlllIlIlllI a(
      @NotNull String var1, @NotNull String var2
   ) {
      return null;
   }

   public final boolean e(@NotNull String var1) {
      return false;
   }

   @NotNull
   public final lllIIllIIlIIlllllIIlIIIIlIIlIIIllllIIIIlIllllIIIIllllllIlIlIlIIIlIlIllllIIlIIIllIllIl a(
      @NotNull String var1, int var2
   ) {
      return null;
   }

   private final List<IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl> f(
      String var1
   ) {
      String response = me.octo.client.utils.IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.d(
         var1
      );
      if (response == null || response.isBlank()) {
         return null;
      }
      try {
         JsonElement root = JsonParser.parseString(response);
         if (!root.isJsonArray()) {
            return null;
         }
         JsonArray array = root.getAsJsonArray();
         List<IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl> routes =
            new ArrayList<>(array.size());
         for (JsonElement element : array) {
            if (!element.isJsonObject()) {
               return null;
            }
            routes.add(route(element.getAsJsonObject()));
         }
         return routes;
      } catch (RuntimeException ignored) {
         return null;
      }
   }

   private final lIIllIIIIlIIlIIllIIlIllIIllIllIlIIlllIllIIIlIIllIlIIllIIlIIIlllIllIlIlIllIIlllIlIlllI a(
      JsonObject var1
   ) {
      if (var1 == null) {
         return null;
      }
      return new lIIllIIIIlIIlIIllIIlIllIIllIllIlIIlllIllIIIlIIllIlIIllIIlIIIlllIllIlIlIllIIlllIlIlllI(
         bool(var1, "success"),
         bool(var1, "duplicate"),
         string(var1, "message"),
         string(var1, "id")
      );
   }

   private static IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl route(
      JsonObject object
   ) {
      return new IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl(
         string(object, "id"),
         string(object, "name"),
         string(object, "type"),
         integer(object, "points"),
         false,
         string(object, "author"),
         integer(object, "downloads"),
         0L,
         null,
         null
      );
   }

   private static String string(JsonObject object, String key) {
      JsonElement value = object.get(key);
      return value == null || value.isJsonNull() ? null : value.getAsString();
   }

   private static int integer(JsonObject object, String key) {
      JsonElement value = object.get(key);
      return value == null || value.isJsonNull() ? 0 : value.getAsInt();
   }

   private static boolean bool(JsonObject object, String key) {
      JsonElement value = object.get(key);
      return value != null && !value.isJsonNull() && value.getAsBoolean();
   }

   public static void b(String[] var0) {
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var0;
   }

   public static String[] c() {
      return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
