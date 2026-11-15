package me.octo.client.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.File;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.FilesKt;
import kotlin.io.path.PathsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII {
   public static me.octo.client.PXDyn var12 = null; // PX-FIX missing field v2
   
   @NotNull
   public static llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @JvmField
   @NotNull
   public static Gson lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static Gson IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String[] a;
   private static String[] b;

   private llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII() {
   }

   @NotNull
   // PX-FIX SYN5: synthetic members recovered from class bytes ((name,descriptor) exact).
   // Reified <T> wrappers: the jar inlines Gson.fromJson against the shared Gson field; the source
   // delegates to the equivalent instance helper (same observable behaviour, different bytecode).
   // The jar's readText$default call is emitted here as the public two-argument readText(File|Path,
   // Charset) with a null charset, because javac filters out ACC_SYNTHETIC members when resolving a
   // method by name (the same call site already exists in this class, so it compiles identically).

   @Nullable
   public final <T> T a(@NotNull String var1) {
      return (T)this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.fromJson(var1, Object.class);
   }

   @Nullable
   public final <T> T a(@NotNull JsonElement var1) {
      return (T)this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.fromJson(var1, Object.class);
   }

   @Nullable
   public final <T> T a(@NotNull File var1) {
      return (T)this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.fromJson(FilesKt.readText(var1, (java.nio.charset.Charset)null), Object.class);
   }

   @Nullable
   public final <T> T a(@NotNull Path var1) {
      String var2;
      try {
         var2 = PathsKt.readText(var1, (java.nio.charset.Charset)null);
      } catch (java.io.IOException var3) {
         throw new java.io.UncheckedIOException(var3);
      }
      return (T)this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.fromJson(var2, Object.class);
   }

   @Nullable
   public final <T> List<T> a(@NotNull JsonArray var1) {
      List<T> var2 = new ArrayList<>();
      for (JsonElement var3 : var1) {
         var2.add(this.a(var3));
      }
      return var2;
   }

   // PX-FIX SYN5: Kotlin default-arg mask bridges (jar ACC_SYNTHETIC; (name,descriptor) exact).
   // The jar opaque predicate (static int[] null check + dead UnsupportedOperationException throw)
   // was dropped; mask test, default assignment and delegation to the real instance method are kept.

   public static void a(@NotNull llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII var0, Object var1, File var2, boolean var3, int var4, Object var5) {
      if ((var4 & 4) != 0) {
         var3 = false;
      }
      var0.a(var1, var2, var3);
   }

   public static void a(@NotNull llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII var0, Object var1, Path var2, boolean var3, int var4, Object var5) {
      if ((var4 & 4) != 0) {
         var3 = false;
      }
      var0.a(var1, var2, var3);
   }

   public static void b(@NotNull llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII var0, Object var1, File var2, boolean var3, int var4, Object var5) {
      if ((var4 & 4) != 0) {
         var3 = false;
      }
      var0.b(var1, var2, var3);
   }

   public static void b(@NotNull llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII var0, Object var1, Path var2, boolean var3, int var4, Object var5) {
      if ((var4 & 4) != 0) {
         var3 = false;
      }
      var0.b(var1, var2, var3);
   }
   public final Gson a() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public final JsonObject a(@NotNull Function1<? super JsonObject, Unit> var1) {
      short var10001 = 26703;
      short var10002 = -23102;
      Intrinsics.checkNotNullParameter(var1, "builder");
      boolean var2 = false;
      JsonObject var3 = new JsonObject();
      var1.invoke(var3);
      return var3;
   }

   @NotNull
   public final JsonArray b(@NotNull Function1<? super JsonArray, Unit> var1) {
      short var10001 = 26699;
      short var10002 = -8349;
      Intrinsics.checkNotNullParameter(var1, "builder");
      boolean var2 = false;
      JsonArray var3 = new JsonArray();
      var1.invoke(var3);
      return var3;
   }

   @NotNull
   public final String a(@Nullable Object var1) {
      String var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.toJson(var1);
      short var10002 = 26700;
      short var10003 = 32515;
      Intrinsics.checkNotNullExpressionValue(var10000, "toJson(...)");
      return var10000;
   }

   @NotNull
   public final String b(@Nullable Object var1) {
      String var10000 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.toJson(var1);
      short var10002 = 26690;
      short var10003 = -5188;
      Intrinsics.checkNotNullExpressionValue(var10000, "toJson(...)");
      return var10000;
   }

   @NotNull
   public final JsonElement c(@Nullable Object var1) {
      JsonElement var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.toJsonTree(var1);
      short var10002 = 26701;
      short var10003 = -9911;
      Intrinsics.checkNotNullExpressionValue(var10000, "toJsonTree(...)");
      return var10000;
   }

    public final <T> void a(T param1, @NotNull File param2, boolean param3) {
       Intrinsics.checkNotNullParameter(param2, "file");
       JsonArray var5;
       if (param2.exists() && param2.length() > 0L) {
          try {
             var5 = this.c(FilesKt.readText(param2, (java.nio.charset.Charset) null));
          } catch (Exception var7) {
             var5 = new JsonArray();
          }
       } else {
          var5 = new JsonArray();
       }
       var5.add(this.c(param1));
       this.b(var5, param2, param3);
    }

   public final <T> void a(T var1, @NotNull Path var2, boolean var3) {
      short var10001 = 26708;
      short var10002 = 26512;
      Intrinsics.checkNotNullParameter(var2, "path");
      File var4 = var2.toFile();
      short var10004 = 26707;
      short var10005 = -27767;
      Intrinsics.checkNotNullExpressionValue(var4, "toFile(...)");
      this.a(var1, var4, var3);
   }

   @NotNull
   public final JsonObject b(@NotNull String var1) {
      short var10001 = 26697;
      short var10002 = 834;
      Intrinsics.checkNotNullParameter(var1, "json");
      JsonObject var10000 = JsonParser.parseString(var1).getAsJsonObject();
      var10002 = 26695;
      short var10003 = -29571;
      Intrinsics.checkNotNullExpressionValue(var10000, "getAsJsonObject(...)");
      return var10000;
   }

   @NotNull
   public final JsonArray c(@NotNull String var1) {
      short var10001 = 26697;
      short var10002 = 834;
      Intrinsics.checkNotNullParameter(var1, "json");
      JsonArray var10000 = JsonParser.parseString(var1).getAsJsonArray();
      var10002 = 26713;
      short var10003 = -28003;
      Intrinsics.checkNotNullExpressionValue(var10000, "getAsJsonArray(...)");
      return var10000;
   }

   @NotNull
   public final JsonElement d(@NotNull String var1) {
      short var10001 = 26697;
      short var10002 = 834;
      Intrinsics.checkNotNullParameter(var1, "json");
      JsonElement var10000 = JsonParser.parseString(var1);
      var10002 = 26730;
      short var10003 = 8947;
      Intrinsics.checkNotNullExpressionValue(var10000, "parseString(...)");
      return var10000;
   }

   @NotNull
   public final JsonObject b(@NotNull File var1) {
      short var10001 = 26729;
      short var10002 = -8981;
      Intrinsics.checkNotNullParameter(var1, "file");
      return this.b(FilesKt.readText(var1, null));
   }

   @NotNull
   public final JsonObject b(@NotNull Path var1) {
      short var10001 = 26708;
      short var10002 = 26512;
      Intrinsics.checkNotNullParameter(var1, "path");
      try {
         return this.b(PathsKt.readText(var1, null));
      }
      catch (java.io.IOException iOException) {
         throw new RuntimeException(iOException);
      }
   }

   public final void b(@NotNull Object var1, @NotNull File var2, boolean var3) {
      short var10001 = 26709;
      short var10002 = 8188;
      Intrinsics.checkNotNullParameter(var1, "obj");
      String[] var10000 = lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.i();
      var10002 = 26711;
      short var10003 = 26705;
      Intrinsics.checkNotNullParameter(var2, "file");
      String[] var4 = var10000;
      boolean var6 = var2.getParentFile().exists();
      if (var4 == null) {
         if (!var6) {
            var2.getParentFile().mkdirs();
         }

         var6 = var3;
      }

      String var5 = var6 ? this.b(var1) : this.a(var1);
      FilesKt.writeText(var2, var5, kotlin.text.Charsets.UTF_8);
   }

   public final void b(@NotNull Object var1, @NotNull Path var2, boolean var3) {
      short var10001 = 26704;
      short var10002 = -14650;
      Intrinsics.checkNotNullParameter(var1, "obj");
      var10001 = 26708;
      var10002 = 26512;
      Intrinsics.checkNotNullParameter(var2, "path");
      String var4 = var3 ? this.b(var1) : this.a(var1);
      try {
         PathsKt.writeText(var2, var4, kotlin.text.Charsets.UTF_8, new OpenOption[0]);
      }
      catch (java.io.IOException iOException) {
         throw new RuntimeException(iOException);
      }
   }

   @Nullable
   public final String a(@NotNull JsonObject param1, @NotNull String param2) {
        Intrinsics.checkNotNullParameter(param1, "<this>");
        Intrinsics.checkNotNullParameter(param2, "key");
        String var3;
        try {
            var3 = param1.has(param2) && param1.get(param2).isJsonPrimitive() ? param1.get(param2).getAsString() : null;
        } catch (Exception var4) {
            var3 = null;
        }
        return var3;
   }

   @Nullable
   public final Integer b(@NotNull JsonObject param1, @NotNull String param2) {
        Intrinsics.checkNotNullParameter(param1, "<this>");
        Intrinsics.checkNotNullParameter(param2, "key");
        Integer var3;
        try {
            var3 = param1.has(param2) && param1.get(param2).isJsonPrimitive() ? param1.get(param2).getAsInt() : null;
        } catch (Exception var4) {
            var3 = null;
        }
        return var3;
   }

   @Nullable
   public final Long c(@NotNull JsonObject param1, @NotNull String param2) {
        Intrinsics.checkNotNullParameter(param1, "<this>");
        Intrinsics.checkNotNullParameter(param2, "key");
        Long var3;
        try {
            var3 = param1.has(param2) && param1.get(param2).isJsonPrimitive() ? param1.get(param2).getAsLong() : null;
        } catch (Exception var4) {
            var3 = null;
        }
        return var3;
   }

   @Nullable
   public final Double d(@NotNull JsonObject param1, @NotNull String param2) {
        Intrinsics.checkNotNullParameter(param1, "<this>");
        Intrinsics.checkNotNullParameter(param2, "key");
        Double var3;
        try {
            var3 = param1.has(param2) && param1.get(param2).isJsonPrimitive() ? param1.get(param2).getAsDouble() : null;
        } catch (Exception var4) {
            var3 = null;
        }
        return var3;
   }

   @Nullable
   public final Float e(@NotNull JsonObject param1, @NotNull String param2) {
        Intrinsics.checkNotNullParameter(param1, "<this>");
        Intrinsics.checkNotNullParameter(param2, "key");
        Float var3;
        try {
            var3 = param1.has(param2) && param1.get(param2).isJsonPrimitive() ? param1.get(param2).getAsFloat() : null;
        } catch (Exception var4) {
            var3 = null;
        }
        return var3;
   }

   @Nullable
   public final Boolean f(@NotNull JsonObject param1, @NotNull String param2) {
        Intrinsics.checkNotNullParameter(param1, "<this>");
        Intrinsics.checkNotNullParameter(param2, "key");
        Boolean var3;
        try {
            var3 = param1.has(param2) && param1.get(param2).isJsonPrimitive() ? param1.get(param2).getAsBoolean() : null;
        } catch (Exception var4) {
            var3 = null;
        }
        return var3;
   }

   @Nullable
   public final JsonObject g(@NotNull JsonObject param1, @NotNull String param2) {
        Intrinsics.checkNotNullParameter(param1, "<this>");
        Intrinsics.checkNotNullParameter(param2, "key");
        JsonObject var3;
        try {
            var3 = param1.has(param2) && param1.get(param2).isJsonObject() ? param1.get(param2).getAsJsonObject() : null;
        } catch (Exception var4) {
            var3 = null;
        }
        return var3;
   }

   @Nullable
   public final JsonArray h(@NotNull JsonObject param1, @NotNull String param2) {
        Intrinsics.checkNotNullParameter(param1, "<this>");
        Intrinsics.checkNotNullParameter(param2, "key");
        JsonArray var3;
        try {
            var3 = param1.has(param2) && param1.get(param2).isJsonArray() ? param1.get(param2).getAsJsonArray() : null;
        } catch (Exception var4) {
            var3 = null;
        }
        return var3;
   }

   @Nullable
   public final Vec3 i(@NotNull JsonObject param1, @NotNull String param2) {
        Intrinsics.checkNotNullParameter(param1, "<this>");
        Intrinsics.checkNotNullParameter(param2, "key");
        Vec3 var3;
        try {
            if (param1.has(param2) && param1.get(param2).isJsonObject()) {
                JsonObject var4 = param1.get(param2).getAsJsonObject();
                Intrinsics.checkNotNull(var4);
                Double var5 = this.d(var4, "x");
                if (var5 == null) {
                    return null;
                }
                double var6 = var5.doubleValue();
                Double var7 = this.d(var4, "y");
                if (var7 == null) {
                    return null;
                }
                double var8 = var7.doubleValue();
                Double var9 = this.d(var4, "z");
                if (var9 == null) {
                    return null;
                }
                double var10 = var9.doubleValue();
                var3 = new Vec3(var6, var8, var10);
            } else {
                var3 = null;
            }
        } catch (Exception var11) {
            var3 = null;
        }
        return var3;
   }

   public final void a(@NotNull JsonObject var1, @NotNull String var2, @Nullable String var3) {
      short var10001 = 26688;
      short var10002 = -4692;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      var10001 = 26691;
      var10002 = 7642;
      Intrinsics.checkNotNullParameter(var2, "key");
      var1.addProperty(var2, var3);
   }

   public final void a(@NotNull JsonObject var1, @NotNull String var2, @Nullable Number var3) {
      short var10001 = 26688;
      short var10002 = -4692;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      var10001 = 26691;
      var10002 = 7642;
      Intrinsics.checkNotNullParameter(var2, "key");
      var1.addProperty(var2, var3);
   }

   public final void a(@NotNull JsonObject var1, @NotNull String var2, @Nullable Boolean var3) {
      short var10001 = 26689;
      short var10002 = 29585;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      var10001 = 26719;
      var10002 = 30793;
      Intrinsics.checkNotNullParameter(var2, "key");
      var1.addProperty(var2, var3);
   }

   public final void a(@NotNull JsonObject var1, @NotNull String var2, @Nullable Character var3) {
      short var10001 = 26688;
      short var10002 = -4692;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      var10001 = 26691;
      var10002 = 7642;
      Intrinsics.checkNotNullParameter(var2, "key");
      var1.addProperty(var2, var3);
   }

   public final void a(@NotNull JsonObject var1, @NotNull String var2, @Nullable JsonElement var3) {
      short var10001 = 26688;
      short var10002 = -4692;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      var10001 = 26691;
      var10002 = 7642;
      Intrinsics.checkNotNullParameter(var2, "key");
      var1.add(var2, var3);
   }

   public final void a(@NotNull JsonArray var1, @NotNull String var2) {
      short var10001 = 26688;
      short var10002 = -4692;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      var10001 = 26698;
      var10002 = -7232;
      Intrinsics.checkNotNullParameter(var2, "value");
      var1.add(var2);
   }

   public final void a(@NotNull JsonArray var1, @NotNull Number var2) {
      short var10001 = 26688;
      short var10002 = -4692;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      var10001 = 26694;
      var10002 = 8360;
      Intrinsics.checkNotNullParameter(var2, "value");
      var1.add(var2);
   }

   public final void a(@NotNull JsonArray var1, boolean var2) {
      short var10001 = 26688;
      short var10002 = -4692;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      Boolean var3 = var2;
      var10002 = 26696;
      short var10003 = -1765;
      Intrinsics.checkNotNull(var3, "null cannot be cast to non-null type kotlin.Boolean");
      var1.add(var2);
   }

   public final void a(@NotNull JsonArray var1, char var2) {
      short var10001 = 26688;
      short var10002 = -4692;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      Character var3 = var2;
      var10002 = 26706;
      short var10003 = 21890;
      Intrinsics.checkNotNull(var3, "null cannot be cast to non-null type kotlin.Char");
      var1.add(var2);
   }

   public final void a(@NotNull JsonArray var1, @NotNull JsonElement var2) {
      short var10001 = 26688;
      short var10002 = -4692;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      var10001 = 26698;
      var10002 = -7232;
      Intrinsics.checkNotNullParameter(var2, "value");
      var1.add(var2);
   }

   @NotNull
   public final List<String> b(@NotNull JsonArray var1) { boolean var11 = false; // PX-FIX hoist
        
      Collection var13 = null; // PX-FIX
      short var10001 = 26688;
      short var10002 = -4692;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      String[] var10000 = lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.i();
      Iterable var3 = (Iterable)var1;
      String[] var2 = var10000;
      boolean var4 = false;
      Collection var6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var3, 10));
      boolean var7 = false;
      Iterator var8 = var3.iterator();

      while (true) {
         if (var8.hasNext()) {
            Object var9 = var8.next();
            var13 = var6;
            JsonElement var10 = (JsonElement)var9;
            if (var2 != null) {
               break;
            }

             var11 = false;
            var6.add(var10.getAsString());
            if (var2 == null) {
               continue;
            }
         }

         var13 = var6;
         break;
      }

      return (List<String>)var13;
   }

   @NotNull
   public final List<Integer> c(@NotNull JsonArray var1) { boolean var11 = false; // PX-FIX hoist
        
      short var10001 = 26688;
      short var10002 = -4692;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      Iterable var3 = (Iterable)var1;
      boolean var4 = false;
      String[] var2 = lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.i();
      Collection var6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var3, 10));
      boolean var7 = false;
      Iterator var8 = var3.iterator();

      Collection var10000;
      while (true) {
         if (var8.hasNext()) {
            Object var9 = var8.next();
            var10000 = var6;
            JsonElement var10 = (JsonElement)var9;
            if (var2 != null) {
               break;
            }

             var11 = false;
            var6.add(var10.getAsInt());
            if (var2 == null) {
               continue;
            }
         }

         var10000 = var6;
         break;
      }

      return (List<Integer>)var10000;
   }

   @NotNull
   public final List<Long> d(@NotNull JsonArray var1) { boolean var11 = false; // PX-FIX hoist
        
      Collection var13 = null; // PX-FIX
      short var10001 = 26688;
      short var10002 = -4692;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      Iterable var3 = (Iterable)var1;
      String[] var10000 = lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.i();
      boolean var4 = false;
      String[] var2 = var10000;
      Collection var6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var3, 10));
      boolean var7 = false;
      Iterator var8 = var3.iterator();

      while (true) {
         if (var8.hasNext()) {
            Object var9 = var8.next();
            var13 = var6;
            JsonElement var10 = (JsonElement)var9;
            if (var2 != null) {
               break;
            }

             var11 = false;
            var6.add(var10.getAsLong());
            if (var2 == null) {
               continue;
            }
         }

         var13 = var6;
         break;
      }

      return (List<Long>)var13;
   }

   @NotNull
   public final List<Double> e(@NotNull JsonArray var1) { boolean var11 = false; // PX-FIX hoist
        
      Collection var13 = null; // PX-FIX
      short var10001 = 26688;
      short var10002 = -4692;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      Iterable var3 = (Iterable)var1;
      boolean var4 = false;
      String[] var10000 = lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.i();
      Collection var6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var3, 10));
      String[] var2 = var10000;
      boolean var7 = false;
      Iterator var8 = var3.iterator();

      while (true) {
         if (var8.hasNext()) {
            Object var9 = var8.next();
            var13 = var6;
            JsonElement var10 = (JsonElement)var9;
            if (var2 != null) {
               break;
            }

             var11 = false;
            var6.add(var10.getAsDouble());
            if (var2 == null) {
               continue;
            }
         }

         var13 = var6;
         break;
      }

      return (List<Double>)var13;
   }

   @NotNull
   public final List<Boolean> f(@NotNull JsonArray var1) { boolean var11 = false; // PX-FIX hoist
        
      Collection var13 = null; // PX-FIX
      short var10001 = 26688;
      short var10002 = -4692;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      Iterable var3 = (Iterable)var1;
      boolean var4 = false;
      String[] var10000 = lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.i();
      Collection var6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var3, 10));
      String[] var2 = var10000;
      boolean var7 = false;
      Iterator var8 = var3.iterator();

      while (true) {
         if (var8.hasNext()) {
            Object var9 = var8.next();
            var13 = var6;
            JsonElement var10 = (JsonElement)var9;
            if (var2 != null) {
               break;
            }

             var11 = false;
            var6.add(var10.getAsBoolean());
            if (var2 == null) {
               continue;
            }
         }

         var13 = var6;
         break;
      }

      return (List<Boolean>)var13;
   }

   @NotNull
   public final JsonObject a(@NotNull Map<String, ? extends Object> var1) {
      String[] var10000 = lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.i();
      short var10002 = 26688;
      short var10003 = -4692;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      String[] var2 = var10000;
      boolean var4 = false;
      JsonObject var5 = new JsonObject();
      JsonObject var6 = var5;
      boolean var7 = false;
      boolean var9 = false;

      for (Entry var11 : var1.entrySet()) {
         boolean var13 = false;
         String var14 = (String)var11.getKey();
         Object var15 = var11.getValue();
         if (var2 == null) {
            label96: {
               var10000 = (String[])var15;
               if (var2 == null) {
                  if (var15 == null) {
                     var6.add(var14, (JsonElement)JsonNull.INSTANCE);
                     if (var2 == null) {
                        break label96;
                     }
                  }

                  var10000 = (String[])var15;
               }

               boolean var18 = (Object)var10000 instanceof String;
               if (var2 == null) {
                  if (var18) {
                     var6.addProperty(var14, (String)var15);
                     if (var2 == null) {
                        break label96;
                     }
                  }

                  var18 = var15 instanceof Number;
               }

               if (var2 == null) {
                  if (var18) {
                     var6.addProperty(var14, (Number)var15);
                     if (var2 == null) {
                        break label96;
                     }
                  }

                  var18 = var15 instanceof Boolean;
               }

               if (var2 == null) {
                  if (var18) {
                     var6.addProperty(var14, (Boolean)var15);
                     if (var2 == null) {
                        break label96;
                     }
                  }

                  var18 = var15 instanceof Character;
               }

               if (var2 == null) {
                  if (var18) {
                     var6.addProperty(var14, (Character)var15);
                     if (var2 == null) {
                        break label96;
                     }
                  }

                  var18 = var15 instanceof JsonElement;
               }

               if (var2 == null) {
                  if (var18) {
                     var6.add(var14, (JsonElement)var15);
                     if (var2 == null) {
                        break label96;
                     }
                  }

                  var18 = var15 instanceof Map;
               }

               if (var2 == null) {
                  if (var18) {
                     llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII var19 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                     short var10005 = 26715;
                     short var10006 = -2789;
                     Intrinsics.checkNotNull(var15, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                     var6.add(var14, (JsonElement)var19.a((Map<String, ? extends Object>)var15));
                     if (var2 == null) {
                        break label96;
                     }
                  }

                  var18 = var15 instanceof List;
               }

               if (var18) {
                  var6.add(
                     var14, (JsonElement)IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a((List<? extends Object>)var15)
                  );
                  if (var2 == null) {
                     break label96;
                  }
               }

               var6.add(var14, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.toJsonTree(var15));
            }

            if (var2 == null) {
               continue;
            }
         }
         break;
      }

      if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.b(new String[2]);
      }

      return var5;
   }

   @NotNull
   public final JsonArray a(@NotNull List<? extends Object> var1) { boolean var12 = false; // PX-FIX hoist
        
      String[] var10000 = lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.i();
      short var10002 = 26688;
      short var10003 = -4692;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      String[] var2 = var10000;
      JsonArray var3 = new JsonArray();
      Iterable var4 = var1;
      boolean var5 = false;

      for (Object var7 : var4) {
         boolean var9 = false;
         if (var2 == null) {
            label92: {
               var10000 = (String[])var7;
               if (var2 == null) {
                  if (var7 == null) {
                     var3.add((JsonElement)JsonNull.INSTANCE);
                     if (var2 == null) {
                        break label92;
                     }
                  }

                  var10000 = (String[])var7;
               }

                var12 = (Object)var10000 instanceof String;
               if (var2 == null) {
                  if (var12) {
                     var3.add((String)var7);
                     if (var2 == null) {
                        break label92;
                     }
                  }

                  var12 = var7 instanceof Number;
               }

               if (var2 == null) {
                  if (var12) {
                     var3.add((Number)var7);
                     if (var2 == null) {
                        break label92;
                     }
                  }

                  var12 = var7 instanceof Boolean;
               }

               if (var2 == null) {
                  if (var12) {
                     var3.add((Boolean)var7);
                     if (var2 == null) {
                        break label92;
                     }
                  }

                  var12 = var7 instanceof Character;
               }

               if (var2 == null) {
                  if (var12) {
                     var3.add((Character)var7);
                     if (var2 == null) {
                        break label92;
                     }
                  }

                  var12 = var7 instanceof JsonElement;
               }

               if (var2 == null) {
                  if (var12) {
                     var3.add((JsonElement)var7);
                     if (var2 == null) {
                        break label92;
                     }
                  }

                  var12 = var7 instanceof Map;
               }

               if (var2 == null) {
                  if (var12) {
                     llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII var10001 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                     short var10004 = 26693;
                     short var10005 = 4626;
                     Intrinsics.checkNotNull(var7, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                     var3.add((JsonElement)var10001.a((Map<String, ? extends Object>)var7));
                     if (var2 == null) {
                        break label92;
                     }
                  }

                  var12 = var7 instanceof List;
               }

               if (var12) {
                  var3.add((JsonElement)IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a((List<? extends Object>)var7));
                  if (var2 == null) {
                     break label92;
                  }
               }

               var3.add(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.toJsonTree(var7));
            }

            if (var2 == null) {
               continue;
            }
         }
         break;
      }

      return var3;
   }

   @NotNull
   public final Map<String, Object> a(@NotNull JsonObject var1) { Entry var12 = null; // PX-FIX hoist
        
      JsonPrimitive var57 = null; // PX-FIX
      Object var52 = null; // PX-FIX
      JsonElement var51 = null; // PX-FIX
      JsonPrimitive var49 = null; // PX-FIX
      JsonElement var44 = null; // PX-FIX
      String var43 = null; // PX-FIX
      short var10001 = 26688;
      short var10002 = -4692;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      Set var10000 = var1.entrySet();
      var10002 = 26718;
      short var10003 = 11954;
      Intrinsics.checkNotNullExpressionValue(var10000, "entrySet(...)");
      Iterable var3 = var10000;
      boolean var4 = false;
      String[] var40 = lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.i();
      int var5 = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(var3, 10)), 16);
      String[] var2 = var40;
      Map var7 = new LinkedHashMap(var5);
      boolean var8 = false;
      Iterator var9 = var3.iterator();

      label185:
      while (true) {
         boolean var41 = var9.hasNext();

         label182:
         while (var41) {
            Object var10 = var9.next();
            if (var2 != null) {
               return var7;
            }

            label191: {
                var12 = (Entry)var10;
               boolean var13 = false;
               Intrinsics.checkNotNull(var12);
               String var14 = (String)var12.getKey();
               JsonElement var15 = (JsonElement)var12.getValue();
               var43 = var14;
               boolean var50 = var15.isJsonNull();
               if (var2 == null) {
                  if (var50) {
                     var52 = null;
                     break label191;
                  }

                  var50 = var15.isJsonPrimitive();
               }

               if (var2 == null) {
                  if (var50) {
                     JsonPrimitive var38 = var15.getAsJsonPrimitive();
                     var50 = var38.isString();
                     if (var2 == null) {
                        if (var50) {
                           var52 = var38.getAsString();
                           break label191;
                        }

                        var50 = var38.isNumber();
                     }

                     label193: {
                        if (var2 == null) {
                           if (var50) {
                              var52 = var38.getAsNumber();
                              break label191;
                           }

                           var57 = var38;
                           if (var2 != null) {
                              break label193;
                           }

                           var50 = var38.isBoolean();
                        }

                        if (var50) {
                           var52 = var38.getAsBoolean();
                           break label191;
                        }

                        var57 = var38;
                     }

                     var52 = var57.getAsString();
                     break label191;
                  }

                  var50 = var15.isJsonObject();
               }

               label195: {
                  if (var2 == null) {
                     if (var50) {
                        llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII var55 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                        JsonObject var60 = var15.getAsJsonObject();
                        short var65 = 26695;
                        short var10005 = -29571;
                        Intrinsics.checkNotNullExpressionValue(var60, "getAsJsonObject(...)");
                        var52 = var55.a(var60);
                        break label191;
                     }

                     var51 = var15;
                     if (var2 != null) {
                        break label195;
                     }

                     var50 = var15.isJsonArray();
                  }

                  if (!var50) {
                     var52 = null;
                     break label191;
                  }

                  var51 = var15;
               }

               JsonArray var53 = var51.getAsJsonArray();
               var10003 = 26731;
               short var10004 = 15082;
               Intrinsics.checkNotNullExpressionValue(var53, "getAsJsonArray(...)");
               Iterable var16 = (Iterable)var53;
               boolean var18 = false;
               var var20 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var16, 10));
               boolean var21 = false;

               for (Object var23 : var16) {
                  JsonElement var24 = (JsonElement)var23;
                  boolean var26 = false;
                  var41 = var24.isJsonNull();
                  if (var2 != null) {
                     continue label182;
                  }

                  label137: {
                     label198: {
                        if (var2 == null) {
                           if (var41) {
                              var10000 = null;
                              break label198;
                           }

                           var41 = var24.isJsonPrimitive();
                        }

                        if (var2 == null) {
                           if (var41) {
                              JsonPrimitive var39 = var24.getAsJsonPrimitive();
                              boolean var48 = var39.isString();
                              if (var2 == null) {
                                 if (var48) {
                                    var10000 = ((Set)(Object)(var39.getAsString()));
                                    break label198;
                                 }

                                 var48 = var39.isNumber();
                              }

                              label200: {
                                 if (var2 == null) {
                                    if (var48) {
                                       var10000 = ((Set)(Object)(var39.getAsNumber()));
                                       break label198;
                                    }

                                    var49 = var39;
                                    if (var2 != null) {
                                       break label200;
                                    }

                                    var48 = var39.isBoolean();
                                 }

                                 if (var48) {
                                    var10000 = ((Set)(Object)(var39.getAsBoolean()));
                                    break label198;
                                 }

                                 var49 = var39;
                              }

                              var10000 = ((Set)(Object)(var49.getAsString()));
                              break label198;
                           }

                           var41 = var24.isJsonObject();
                        }

                        label202: {
                           if (var2 == null) {
                              if (var41) {
                                 llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII var47 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                                 JsonObject var54 = var24.getAsJsonObject();
                                 var10003 = 26695;
                                 var10004 = -29571;
                                 Intrinsics.checkNotNullExpressionValue(var54, "getAsJsonObject(...)");
                                 var10000 = ((Set)(Object)(var47.a(var54)));
                                 break label198;
                              }

                              var44 = var24;
                              if (var2 != null) {
                                 break label202;
                              }

                              var41 = var24.isJsonArray();
                           }

                           if (!var41) {
                              var10000 = null;
                              break label198;
                           }

                           var44 = var24;
                        }

                        JsonArray var46 = var44.getAsJsonArray();
                        var10002 = 26731;
                        var10003 = 15082;
                        Intrinsics.checkNotNullExpressionValue(var46, "getAsJsonArray(...)");
                        Iterable var27 = (Iterable)var46;
                        boolean var28 = false;
                        var var30 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var27, 10));
                        boolean var31 = false;

                        for (Object var33 : var27) {
                           JsonElement var34 = (JsonElement)var33;
                           boolean var36 = false;
                           var30.add(var34);
                           if (var2 != null) {
                              break label137;
                           }

                           if (var2 != null) {
                              lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
                                 new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[2]
                              );
                              break;
                           }
                        }

                        var10000 = ((Set)(Object)(var30));
                     }

                     var20.add(var10000);
                  }

                  if (var2 != null) {
                     break;
                  }
               }

               var52 = var20;
               var43 = var14;
            }

            Pair var37 = TuplesKt.to(var43, var52);
            var7.put(var37.getFirst(), var37.getSecond());
            if (var2 == null) {
               continue label185;
            }
            break;
         }

         return var7;
      }
   }

   @NotNull
   public final JsonObject a(@NotNull JsonObject var1, @NotNull JsonObject var2) { Set var12 = null; // PX-FIX hoist
         JsonElement var11 = null; // PX-FIX hoist
        
      String[] var10000 = lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.i();
      short var10002 = 26688;
      short var10003 = -4692;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      String[] var3 = var10000;
      short var10001 = 26702;
      var10002 = -1395;
      Intrinsics.checkNotNullParameter(var2, "other");
       var12 = var2.entrySet();
      var10002 = 26718;
      var10003 = 11954;
      Intrinsics.checkNotNullExpressionValue(var12, "entrySet(...)");
      Iterable var4 = var12;
      boolean var5 = false;

      for (Object var7 : var4) {
         Entry var8 = (Entry)var7;
         boolean var9 = false;
         Intrinsics.checkNotNull(var8);
         String var10 = (String)var8.getKey();
          var11 = (JsonElement)var8.getValue();
         var1.add(var10, var11);
         if (var3 == null && var3 == null) {
            continue;
         }
         break;
      }

      return var1;
   }

   @NotNull
   public final JsonObject b(@NotNull JsonObject var1, @NotNull JsonObject var2) { JsonElement var11 = null; // PX-FIX hoist
        
      String var16 = null; // PX-FIX
      short var10001 = 26688;
      short var10002 = -4692;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      var10001 = 26714;
      var10002 = 28019;
      Intrinsics.checkNotNullParameter(var2, "other");
      String[] var10000 = lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.i();
      Set var15 = var2.entrySet();
      short var10003 = 26728;
      short var10004 = 12249;
      Intrinsics.checkNotNullExpressionValue(var15, "entrySet(...)");
      Iterable var4 = var15;
      String[] var3 = var10000;
      boolean var5 = false;
      Iterator var6 = var4.iterator();

      while (true) {
         if (var6.hasNext()) {
            Object var7 = var6.next();
            Entry var8 = (Entry)var7;
            boolean var9 = false;
            Intrinsics.checkNotNull(var8);
            String var10 = (String)var8.getKey();
             var11 = (JsonElement)var8.getValue();
            var12 = ((me.octo.client.PXDyn)(Object)(Object)(var1));
            if (var3 != null) {
               break;
            }

            label31: {
               var16 = var10;
               label30:
               if (var3 == null) {
                  if (var1.has(var10)) {
                     var12 = ((me.octo.client.PXDyn)(Object)(Object)(var1));
                     var16 = var10;
                     if (var3 != null) {
                        break label30;
                     }

                     if (var1.get(var10).isJsonObject() && var11.isJsonObject()) {
                        llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII var13 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                        JsonObject var17 = var1.get(var10).getAsJsonObject();
                        var10003 = 26734;
                        var10004 = 24845;
                        Intrinsics.checkNotNullExpressionValue(var17, "getAsJsonObject(...)");
                        JsonObject var19 = var11.getAsJsonObject();
                        var10004 = 26695;
                        short var10005 = -29571;
                        Intrinsics.checkNotNullExpressionValue(var19, "getAsJsonObject(...)");
                        var13.b(var17, var19);
                        if (var3 == null) {
                           break label31;
                        }
                     }
                  }

                  var12 = ((me.octo.client.PXDyn)(Object)(Object)(var1));
                  var16 = var10;
               }

               var12.add(var16, var11);
            }

            if (var3 == null) {
               continue;
            }
         }

         var12 = ((me.octo.client.PXDyn)(Object)(Object)(var1));
         break;
      }

      return ((JsonObject)(Object)(var12));
   }

   public final boolean e(@NotNull String var1) {
      short var10001 = 26716;
      short var10002 = 22152;
      Intrinsics.checkNotNullParameter(var1, "json");

      boolean var2;
      try {
         JsonParser.parseString(var1);
         var2 = true;
      } catch (Exception var4) {
         var2 = false;
      }

      return var2;
   }

   public final boolean a(@NotNull JsonObject var1, @NotNull String... var2) {
       boolean var11 = false; // PX-FIX decl var11
      String[] var10000 = lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.i();
      short var10002 = 26688;
      short var10003 = -4692;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      String[] var3 = var10000;
      short var10001 = 26712;
      var10002 = -25620;
      Intrinsics.checkNotNullParameter(var2, "keys");
      String[] var4 = var2;
      boolean var5 = false;
      int var6 = 0;
      int var7 = var2.length;

      while (true) {
         if (var6 < var7) {
            String var8 = var4[var6];
            boolean var10 = false;
            if (var3 == null) {
               var11 = var1.has(var8);
               if (var3 != null) {
                  break;
               }

               if (!var11) {
                  var11 = false;
                  break;
               }

               var6++;
            }

            if (var3 == null) {
               continue;
            }
         }

         var11 = true;
         break;
      }

      return var11;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static { Gson var11 = null; // PX-FIX hoist
        
      char[] var22 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[37];
      int var3 = 0;
      String var2 = "ãÂè\u0016Á\u0007TÜ\u008dZÉ\u0007\u00993í\u000f2 ßN\u0084å®0tüÞä\u0098+\u0016o£\u0018À\u0005ß\fÆ\u0014¿uG|\u001f8.\u0092u,íg\u0080Æ6q\u0004Y!Ù\u0019\u001dþne\u0004ë*u@\u0005Í`\u0013å-\u0007Òý]~Ó\u0083Ú\u000b\u0016ª2ÒráÞüÅ\u001a\f\u000fsã\u009eûçÄ\u0010\u0004¤\u0099\u0003\u008c«nú\u000bõÄN\u001fýX/ËûüË\u0003*úz\u0006´¦\u00051î\u0094\u0006s^ý.ñw\u0005!µ°øÊ\u0014\u0087\u0091OÌ8rSo\u0004`7\u0098em\\\u0097\u001f\u0087~ú\u000bM6\u0083í\u0095]Z\u0001U¥\u001eWggc-õïÁÑ\u0006¶a,|þÌh\u009c\u0007ò\u0015ê¤\u009a8n\u0092ª¥åfK{¤ú$!ÇÆÅò\u009e÷\u0011\u0089¢Ão^S\u0004Ê¦º¦ncÐûÎx\u0094\u0013ÚÁÕ÷¦V\u0083»®8¶þ%ÕÕ\u0085IcÐ^0t[\u000fC\u0005.Toc¢WÐö\u0095\u001f+©\u001a\u0019}¯\u000e\u000f\u0091\u009aqä+\u0096\u0004'4âAð\u0015\u008bÅ\u0086\b\u0002ö÷\u0013kÒ\u0013\u0019\u0080\u001e:åî~ªO§ÒÒä\u0095<\u0094dàµ««â¡[ywgMbfPd]ýuðÍçJö8áôïgÏÆF\u0085I\u0098\u0004\u0017UÝf\u0013\u0080¢¯ª$¾Ðöt])è°b>)\u0084\u0096\n\rFê5ú}ø¦\u001f(wps\u0004\u0003µs\u0089\u0004\u008fÛù~\u0007ó\u001a\u0092¹¦QS0\u0093¾ý\u0016&\u0088»=I+\u0088\u009fA\u0088k¦hÞl.9ÃàÔ!\u000fC\u0016Ø\u0010ìµP#º\u001a\u0014¡¿\u001eÑjø:¿²å\u0089\u000bq{Òòà·ï\\ã\u000eÈ\u0003\u0089\u009f\u0099\u000bô\u0089´\u001as£\u0086ÞÎ^m\u0004\u0096_\u0098¸\u0004rYÈ|\u0004.O\u008fº\u0003âÉô\u0010*ó\t6 @\u0083\u000eþÓ\u008a©<\f\u000f^\u0013Ã\u008aÇ¯)\u001eqâ@ß¯¸`h$hÇ¾b\rp\u001eód¥+½eK8\u001c\u009a\u0089";
      int var4 = "ãÂè\u0016Á\u0007TÜ\u008dZÉ\u0007\u00993í\u000f2 ßN\u0084å®0tüÞä\u0098+\u0016o£\u0018À\u0005ß\fÆ\u0014¿uG|\u001f8.\u0092u,íg\u0080Æ6q\u0004Y!Ù\u0019\u001dþne\u0004ë*u@\u0005Í`\u0013å-\u0007Òý]~Ó\u0083Ú\u000b\u0016ª2ÒráÞüÅ\u001a\f\u000fsã\u009eûçÄ\u0010\u0004¤\u0099\u0003\u008c«nú\u000bõÄN\u001fýX/ËûüË\u0003*úz\u0006´¦\u00051î\u0094\u0006s^ý.ñw\u0005!µ°øÊ\u0014\u0087\u0091OÌ8rSo\u0004`7\u0098em\\\u0097\u001f\u0087~ú\u000bM6\u0083í\u0095]Z\u0001U¥\u001eWggc-õïÁÑ\u0006¶a,|þÌh\u009c\u0007ò\u0015ê¤\u009a8n\u0092ª¥åfK{¤ú$!ÇÆÅò\u009e÷\u0011\u0089¢Ão^S\u0004Ê¦º¦ncÐûÎx\u0094\u0013ÚÁÕ÷¦V\u0083»®8¶þ%ÕÕ\u0085IcÐ^0t[\u000fC\u0005.Toc¢WÐö\u0095\u001f+©\u001a\u0019}¯\u000e\u000f\u0091\u009aqä+\u0096\u0004'4âAð\u0015\u008bÅ\u0086\b\u0002ö÷\u0013kÒ\u0013\u0019\u0080\u001e:åî~ªO§ÒÒä\u0095<\u0094dàµ««â¡[ywgMbfPd]ýuðÍçJö8áôïgÏÆF\u0085I\u0098\u0004\u0017UÝf\u0013\u0080¢¯ª$¾Ðöt])è°b>)\u0084\u0096\n\rFê5ú}ø¦\u001f(wps\u0004\u0003µs\u0089\u0004\u008fÛù~\u0007ó\u001a\u0092¹¦QS0\u0093¾ý\u0016&\u0088»=I+\u0088\u009fA\u0088k¦hÞl.9ÃàÔ!\u000fC\u0016Ø\u0010ìµP#º\u001a\u0014¡¿\u001eÑjø:¿²å\u0089\u000bq{Òòà·ï\\ã\u000eÈ\u0003\u0089\u009f\u0099\u000bô\u0089´\u001as£\u0086ÞÎ^m\u0004\u0096_\u0098¸\u0004rYÈ|\u0004.O\u008fº\u0003âÉô\u0010*ó\t6 @\u0083\u000eþÓ\u008a©<\f\u000f^\u0013Ã\u008aÇ¯)\u001eqâ@ß¯¸`h$hÇ¾b\rp\u001eód¥+½eK8\u001c\u009a\u0089"
         .length();
      char var1 = 5;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 85;
         String var10001 = var2.substring(++var8, var8 + var1);
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
               char[] var42;
               int var10006;
               if (var10004 <= 1) {
                  var42 = var28;
                  var38 = var10000;
                  var10006 = var6;
               } else {
                  var31 = var10000;
                  var16 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var42 = var28;
                  var38 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var42[var10006] = (char)(var42[var10006] ^ var38 ^ switch (var6 % 7) {
                     case 0 -> 85;
                     case 1 -> 78;
                     case 2 -> 21;
                     case 3 -> 64;
                     case 4 -> 5;
                     case 5 -> 63;
                     default -> 101;
                  });
                  var6++;
                  if (var31 == 0) {
                     var10006 = var31;
                     var42 = var22;
                     var38 = var31;
                  } else {
                     if (var16 <= var6) {
                        break;
                     }

                     var42 = var22;
                     var38 = var31;
                     var10006 = var6;
                  }
               }
            }

            String var33 = new String(var22).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var33;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[37];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII();
                     Gson var10 = new GsonBuilder().registerTypeAdapter(Instant.class, new TypeAdapter<Instant>() {
   public void write(JsonWriter p0, Instant p1) { } // PX-FIX abs2



   public Instant read(JsonReader p0) { return null; } // PX-FIX abs

                        private static String[] a;
                        private static String[] b;

                        public void a(JsonWriter var1, Instant var2x) throws java.io.IOException {
                           String[] var3 = me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.i();
                           kotlin.jvm.internal.Intrinsics.checkNotNullParameter(var1, "out");
                           if (var2x == null) {
                             var1.nullValue();
                           } else {
                             var1.value(var2x.toString());
                           }
                        }

                        public Instant a(JsonReader var1) {
                           short var10001x = 6666;
                           short var10002x = -31073;
                           Intrinsics.checkNotNullParameter(var1, "reader");
                           Instant var10000x;
                           try {
                              var10000x = Instant.parse(var1.nextString());
                           }
                           catch (java.io.IOException iOException) {
                              throw new RuntimeException(iOException);
                           }
                           var10002x = 6665;
                           short var10003 = 435;
                           Intrinsics.checkNotNullExpressionValue(var10000x, "parse(...)");
                           return var10000x;
                        }

                        // $VF: Irreducible bytecode was duplicated to produce valid code
                        static {
   pxClinit: {
                           String[] var5 = new String[3];
                           int var3 = 0;
                           String var2 = "x<ÿ\n.ÛÏ\u001c\u008a_NG7,\u0006µÏí\r¿Ò";
                           int var4 = "x<ÿ\n.ÛÏ\u001c\u008a_NG7,\u0006µÏí\r¿Ò".length();
                           char var1 = 3;
                           int var0 = -1;

                           while (true) {
                              char[] var10002;
                              label38: {
                                 char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                                 int var10004 = var10003.length;
                                 int var6 = 0;
                                 byte var13 = 89;
                                 var10002 = var10003;
                                 int var8 = var10004;
                                 byte var16;
                                 char[] var10005;
                                 int var10006;
                                 if (var10004 <= 1) {
                                    var10005 = var10003;
                                    var16 = 89;
                                    var10006 = var6;
                                 } else {
                                    var13 = 89;
                                    var8 = var10004;
                                    if (var10004 <= var6) {
                                       break label38;
                                    }

                                    var10005 = var10003;
                                    var16 = 89;
                                    var10006 = var6;
                                 }

                                 while (true) {
                                    var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                                       case 0 -> 50;
                                       case 1 -> 96;
                                       case 2 -> 50;
                                       case 3 -> 39;
                                       case 4 -> 30;
                                       case 5 -> 127;
                                       default -> 73;
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

                        private static String a(int var0, int var1x) {
                           int var2x = (var0 ^ 6664) & 65535;
                           if (b[var2x] == null) {
                              char[] var3 = a[var2x].toCharArray();

                              short var4x = switch (var3[0] & 0xFF) {
                                 case 0 -> 95;
                                 case 1 -> 82;
                                 case 2 -> 153;
                                 case 3 -> 129;
                                 case 4 -> 234;
                                 case 5 -> 43;
                                 case 6 -> 163;
                                 case 7 -> 199;
                                 case 8 -> 127;
                                 case 9 -> 42;
                                 case 10 -> 244;
                                 case 11 -> 76;
                                 case 12 -> 224;
                                 case 13 -> 247;
                                 case 14 -> 84;
                                 case 15 -> 145;
                                 case 16 -> 112;
                                 case 17 -> 14;
                                 case 18 -> 34;
                                 case 19 -> 140;
                                 case 20 -> 190;
                                 case 21 -> 24;
                                 case 22 -> 121;
                                 case 23 -> 202;
                                 case 24 -> 253;
                                 case 25 -> 222;
                                 case 26 -> 132;
                                 case 27 -> 239;
                                 case 28 -> 73;
                                 case 29 -> 99;
                                 case 30 -> 124;
                                 case 31 -> 207;
                                 case 32 -> 221;
                                 case 33 -> 189;
                                 case 34 -> 77;
                                 case 35 -> 22;
                                 case 36 -> 193;
                                 case 37 -> 37;
                                 case 38 -> 187;
                                 case 39 -> 235;
                                 case 40 -> 214;
                                 case 41 -> 49;
                                 case 42 -> 12;
                                 case 43 -> 119;
                                 case 44 -> 142;
                                 case 45 -> 15;
                                 case 46 -> 4;
                                 case 47 -> 61;
                                 case 48 -> 108;
                                 case 49 -> 78;
                                 case 50 -> 62;
                                 case 51 -> 102;
                                 case 52 -> 66;
                                 case 53 -> 176;
                                 case 54 -> 139;
                                 case 55 -> 144;
                                 case 56 -> 80;
                                 case 57 -> 250;
                                 case 58 -> 213;
                                 case 59 -> 143;
                                 case 60 -> 123;
                                 case 61 -> 133;
                                 case 62 -> 97;
                                 case 63 -> 58;
                                 case 64 -> 13;
                                 case 65 -> 28;
                                 case 66 -> 65;
                                 case 67 -> 220;
                                 case 68 -> 72;
                                 case 69 -> 126;
                                 case 70 -> 45;
                                 case 71 -> 10;
                                 case 72 -> 228;
                                 case 73 -> 241;
                                 case 74 -> 109;
                                 case 75 -> 236;
                                 case 76 -> 209;
                                 case 77 -> 135;
                                 case 78 -> 105;
                                 case 79 -> 25;
                                 case 80 -> 71;
                                 case 81 -> 50;
                                 case 82 -> 201;
                                 case 83 -> 198;
                                 case 84 -> 216;
                                 case 85 -> 138;
                                 case 86 -> 227;
                                 case 87 -> 183;
                                 case 88 -> 159;
                                 case 89 -> 64;
                                 case 90 -> 122;
                                 case 91 -> 20;
                                 case 92 -> 44;
                                 case 93 -> 197;
                                 case 94 -> 136;
                                 case 95 -> 246;
                                 case 96 -> 115;
                                 case 97 -> 69;
                                 case 98 -> 252;
                                 case 99 -> 180;
                                 case 100 -> 237;
                                 case 101 -> 248;
                                 case 102 -> 83;
                                 case 103 -> 196;
                                 case 104 -> 39;
                                 case 105 -> 219;
                                 case 106 -> 40;
                                 case 107 -> 35;
                                 case 108 -> 9;
                                 case 109 -> 67;
                                 case 110 -> 188;
                                 case 111 -> 179;
                                 case 112 -> 151;
                                 case 113 -> 158;
                                 case 114 -> 32;
                                 case 115 -> 242;
                                 case 116 -> 54;
                                 case 117 -> 27;
                                 case 118 -> 150;
                                 case 119 -> 92;
                                 case 120 -> 68;
                                 case 121 -> 117;
                                 case 122 -> 182;
                                 case 123 -> 174;
                                 case 124 -> 195;
                                 case 125 -> 85;
                                 case 126 -> 134;
                                 case 127 -> 17;
                                 case 128 -> 212;
                                 case 129 -> 110;
                                 case 130 -> 111;
                                 case 131 -> 120;
                                 case 132 -> 3;
                                 case 133 -> 249;
                                 case 134 -> 107;
                                 case 135 -> 156;
                                 case 136 -> 141;
                                 case 137 -> 172;
                                 case 138 -> 55;
                                 case 139 -> 205;
                                 case 140 -> 130;
                                 case 141 -> 238;
                                 case 142 -> 6;
                                 case 143 -> 94;
                                 case 144 -> 215;
                                 case 145 -> 200;
                                 case 146 -> 240;
                                 case 147 -> 225;
                                 case 148 -> 19;
                                 case 149 -> 223;
                                 case 150 -> 23;
                                 case 151 -> 255;
                                 case 152 -> 41;
                                 case 153 -> 217;
                                 case 154 -> 46;
                                 case 155 -> 165;
                                 case 156 -> 245;
                                 case 157 -> 81;
                                 case 158 -> 114;
                                 case 159 -> 26;
                                 case 160 -> 103;
                                 case 161 -> 168;
                                 case 162 -> 29;
                                 case 163 -> 149;
                                 case 164 -> 52;
                                 case 165 -> 181;
                                 case 166 -> 30;
                                 case 167 -> 33;
                                 case 168 -> 178;
                                 case 169 -> 18;
                                 case 170 -> 131;
                                 case 171 -> 16;
                                 case 172 -> 210;
                                 case 173 -> 2;
                                 case 174 -> 137;
                                 case 175 -> 157;
                                 case 176 -> 11;
                                 case 177 -> 31;
                                 case 178 -> 231;
                                 case 179 -> 233;
                                 case 180 -> 59;
                                 case 181 -> 208;
                                 case 182 -> 98;
                                 case 183 -> 155;
                                 case 184 -> 38;
                                 case 185 -> 148;
                                 case 186 -> 53;
                                 case 187 -> 113;
                                 case 188 -> 70;
                                 case 189 -> 166;
                                 case 190 -> 147;
                                 case 191 -> 186;
                                 case 192 -> 152;
                                 case 193 -> 87;
                                 case 194 -> 173;
                                 case 195 -> 21;
                                 case 196 -> 218;
                                 case 197 -> 171;
                                 case 198 -> 164;
                                 case 199 -> 7;
                                 case 200 -> 74;
                                 case 201 -> 0;
                                 case 202 -> 91;
                                 case 203 -> 226;
                                 case 204 -> 48;
                                 case 205 -> 100;
                                 case 206 -> 162;
                                 case 207 -> 60;
                                 case 208 -> 160;
                                 case 209 -> 154;
                                 case 210 -> 194;
                                 case 211 -> 232;
                                 case 212 -> 1;
                                 case 213 -> 191;
                                 case 214 -> 5;
                                 case 215 -> 79;
                                 case 216 -> 230;
                                 case 217 -> 118;
                                 case 218 -> 101;
                                 case 219 -> 229;
                                 case 220 -> 251;
                                 case 221 -> 185;
                                 case 222 -> 243;
                                 case 223 -> 206;
                                 case 224 -> 88;
                                 case 225 -> 184;
                                 case 226 -> 90;
                                 case 227 -> 128;
                                 case 228 -> 93;
                                 case 229 -> 96;
                                 case 230 -> 170;
                                 case 231 -> 63;
                                 case 232 -> 167;
                                 case 233 -> 116;
                                 case 234 -> 203;
                                 case 235 -> 47;
                                 case 236 -> 106;
                                 case 237 -> 125;
                                 case 238 -> 75;
                                 case 239 -> 254;
                                 case 240 -> 161;
                                 case 241 -> 56;
                                 case 242 -> 36;
                                 case 243 -> 89;
                                 case 244 -> 192;
                                 case 245 -> 57;
                                 case 246 -> 169;
                                 case 247 -> 51;
                                 case 248 -> 211;
                                 case 249 -> 104;
                                 case 250 -> 86;
                                 case 251 -> 175;
                                 case 252 -> 177;
                                 case 253 -> 146;
                                 case 254 -> 204;
                                 default -> 8;
                              };
                              int var5x = (var1x & 0xFF) - var4x;
                              if (var5x < 0) {
                                 var5x += 256;
                              }

                              int var6 = ((var1x & 65535) >>> 8) - var4x;
                              if (var6 < 0) {
                                 var6 += 256;
                              }

                              for (int var7 = 0; var7 < var3.length; var7++) {
                                 int var8x = var7 % 2;
                                 char var10002x = var3[var7];
                                 if (var8x == 0) {
                                    var3[var7] = (char)(var10002x ^ var5x);
                                    var5x = ((var5x >>> 3 | var5x << 5) ^ var3[var7]) & 0xFF;
                                 } else {
                                    var3[var7] = (char)(var10002x ^ var6);
                                    var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
                                 }
                              }

                              b[var2x] = new String(var3).intern();
                           }

                           return b[var2x];
                        }
                     }).create();
                     var10002 = 26692;
                     short var34 = 2777;
                     Intrinsics.checkNotNullExpressionValue(var10, "create(...)");
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var10;
                      var11 = new GsonBuilder().setPrettyPrinting().registerTypeAdapter(Instant.class, new TypeAdapter<Instant>() {
   public void write(JsonWriter p0, Instant p1) { } // PX-FIX abs2



   public Instant read(JsonReader p0) { return null; } // PX-FIX abs

                        private static String[] a;
                        private static String[] b;

                        public void a(JsonWriter var1, Instant var2) {
                           String[] var3 = lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.i();
                           JsonWriter var10000 = var1;
                           short var10001 = -28494;
                           short var10002 = 19386;
                           String var4 = "out";
                           if (var3 == null) {
                              Intrinsics.checkNotNullParameter(var1, "out");
                              if (var2 == null) {
                                 try {
                                    var1.nullValue();
                                 }
                                 catch (java.io.IOException iOException) {
                                    throw new RuntimeException(iOException);
                                 }
                                 return;
                              }

                              var10000 = var1;
                              var4 = var2.toString();
                           }

                           try {
                              var10000.value(var4);
                           }
                           catch (java.io.IOException iOException) {
                              throw new RuntimeException(iOException);
                           }
                        }

                        public Instant a(JsonReader var1) {
                           short var10001 = -28496;
                           short var10002 = 13965;
                           Intrinsics.checkNotNullParameter(var1, "reader");
                           Instant var10000;
                           try {
                              var10000 = Instant.parse(var1.nextString());
                           }
                           catch (java.io.IOException iOException) {
                              throw new RuntimeException(iOException);
                           }
                           var10002 = -28493;
                           short var10003 = 20535;
                           Intrinsics.checkNotNullExpressionValue(var10000, "parse(...)");
                           return var10000;
                        }

                        // $VF: Irreducible bytecode was duplicated to produce valid code
                        static {
   pxClinit: {
                           String[] var5 = new String[3];
                           int var3 = 0;
                           String var2 = "\u0013ï\u0086\n=`¹¹Y¦4¢#\u0084\u0006Ñîuû±A";
                           int var4 = "\u0013ï\u0086\n=`¹¹Y¦4¢#\u0084\u0006Ñîuû±A".length();
                           char var1 = 3;
                           int var0 = -1;

                           while (true) {
                              char[] var10002;
                              label38: {
                                 char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                                 int var10004 = var10003.length;
                                 int var6 = 0;
                                 byte var13 = 49;
                                 var10002 = var10003;
                                 int var8 = var10004;
                                 byte var16;
                                 char[] var10005;
                                 int var10006;
                                 if (var10004 <= 1) {
                                    var10005 = var10003;
                                    var16 = 49;
                                    var10006 = var6;
                                 } else {
                                    var13 = 49;
                                    var8 = var10004;
                                    if (var10004 <= var6) {
                                       break label38;
                                    }

                                    var10005 = var10003;
                                    var16 = 49;
                                    var10006 = var6;
                                 }

                                 while (true) {
                                    var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                                       case 0 -> 105;
                                       case 1 -> 30;
                                       case 2 -> 40;
                                       case 3 -> 95;
                                       case 4 -> 37;
                                       case 5 -> 88;
                                       default -> 75;
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
                           int var2 = (var0 ^ -28494) & 65535;
                           if (b[var2] == null) {
                              char[] var3 = a[var2].toCharArray();

                              short var4 = switch (var3[0] & 0xFF) {
                                 case 0 -> 79;
                                 case 1 -> 212;
                                 case 2 -> 47;
                                 case 3 -> 92;
                                 case 4 -> 71;
                                 case 5 -> 176;
                                 case 6 -> 133;
                                 case 7 -> 173;
                                 case 8 -> 35;
                                 case 9 -> 252;
                                 case 10 -> 220;
                                 case 11 -> 253;
                                 case 12 -> 170;
                                 case 13 -> 208;
                                 case 14 -> 22;
                                 case 15 -> 236;
                                 case 16 -> 223;
                                 case 17 -> 126;
                                 case 18 -> 132;
                                 case 19 -> 54;
                                 case 20 -> 243;
                                 case 21 -> 163;
                                 case 22 -> 33;
                                 case 23 -> 74;
                                 case 24 -> 88;
                                 case 25 -> 100;
                                 case 26 -> 51;
                                 case 27 -> 192;
                                 case 28 -> 191;
                                 case 29 -> 50;
                                 case 30 -> 210;
                                 case 31 -> 26;
                                 case 32 -> 144;
                                 case 33 -> 206;
                                 case 34 -> 211;
                                 case 35 -> 109;
                                 case 36 -> 181;
                                 case 37 -> 217;
                                 case 38 -> 246;
                                 case 39 -> 239;
                                 case 40 -> 194;
                                 case 41 -> 219;
                                 case 42 -> 171;
                                 case 43 -> 105;
                                 case 44 -> 148;
                                 case 45 -> 238;
                                 case 46 -> 198;
                                 case 47 -> 8;
                                 case 48 -> 1;
                                 case 49 -> 118;
                                 case 50 -> 154;
                                 case 51 -> 99;
                                 case 52 -> 147;
                                 case 53 -> 117;
                                 case 54 -> 186;
                                 case 55 -> 199;
                                 case 56 -> 245;
                                 case 57 -> 232;
                                 case 58 -> 161;
                                 case 59 -> 69;
                                 case 60 -> 45;
                                 case 61 -> 75;
                                 case 62 -> 94;
                                 case 63 -> 63;
                                 case 64 -> 43;
                                 case 65 -> 153;
                                 case 66 -> 207;
                                 case 67 -> 251;
                                 case 68 -> 167;
                                 case 69 -> 39;
                                 case 70 -> 242;
                                 case 71 -> 189;
                                 case 72 -> 248;
                                 case 73 -> 149;
                                 case 74 -> 67;
                                 case 75 -> 150;
                                 case 76 -> 68;
                                 case 77 -> 19;
                                 case 78 -> 37;
                                 case 79 -> 138;
                                 case 80 -> 98;
                                 case 81 -> 119;
                                 case 82 -> 85;
                                 case 83 -> 102;
                                 case 84 -> 165;
                                 case 85 -> 11;
                                 case 86 -> 62;
                                 case 87 -> 80;
                                 case 88 -> 44;
                                 case 89 -> 73;
                                 case 90 -> 38;
                                 case 91 -> 46;
                                 case 92 -> 10;
                                 case 93 -> 77;
                                 case 94 -> 30;
                                 case 95 -> 188;
                                 case 96 -> 218;
                                 case 97 -> 56;
                                 case 98 -> 234;
                                 case 99 -> 197;
                                 case 100 -> 168;
                                 case 101 -> 34;
                                 case 102 -> 84;
                                 case 103 -> 180;
                                 case 104 -> 250;
                                 case 105 -> 229;
                                 case 106 -> 226;
                                 case 107 -> 141;
                                 case 108 -> 78;
                                 case 109 -> 172;
                                 case 110 -> 42;
                                 case 111 -> 108;
                                 case 112 -> 58;
                                 case 113 -> 17;
                                 case 114 -> 157;
                                 case 115 -> 49;
                                 case 116 -> 160;
                                 case 117 -> 70;
                                 case 118 -> 221;
                                 case 119 -> 255;
                                 case 120 -> 201;
                                 case 121 -> 179;
                                 case 122 -> 155;
                                 case 123 -> 66;
                                 case 124 -> 166;
                                 case 125 -> 240;
                                 case 126 -> 29;
                                 case 127 -> 6;
                                 case 128 -> 193;
                                 case 129 -> 225;
                                 case 130 -> 202;
                                 case 131 -> 184;
                                 case 132 -> 187;
                                 case 133 -> 125;
                                 case 134 -> 124;
                                 case 135 -> 57;
                                 case 136 -> 244;
                                 case 137 -> 146;
                                 case 138 -> 15;
                                 case 139 -> 129;
                                 case 140 -> 93;
                                 case 141 -> 81;
                                 case 142 -> 0;
                                 case 143 -> 97;
                                 case 144 -> 121;
                                 case 145 -> 214;
                                 case 146 -> 182;
                                 case 147 -> 143;
                                 case 148 -> 237;
                                 case 149 -> 27;
                                 case 150 -> 16;
                                 case 151 -> 20;
                                 case 152 -> 134;
                                 case 153 -> 183;
                                 case 154 -> 224;
                                 case 155 -> 112;
                                 case 156 -> 87;
                                 case 157 -> 174;
                                 case 158 -> 72;
                                 case 159 -> 113;
                                 case 160 -> 40;
                                 case 161 -> 205;
                                 case 162 -> 24;
                                 case 163 -> 254;
                                 case 164 -> 101;
                                 case 165 -> 200;
                                 case 166 -> 131;
                                 case 167 -> 41;
                                 case 168 -> 137;
                                 case 169 -> 5;
                                 case 170 -> 209;
                                 case 171 -> 106;
                                 case 172 -> 231;
                                 case 173 -> 4;
                                 case 174 -> 115;
                                 case 175 -> 83;
                                 case 176 -> 89;
                                 case 177 -> 13;
                                 case 178 -> 135;
                                 case 179 -> 142;
                                 case 180 -> 9;
                                 case 181 -> 233;
                                 case 182 -> 53;
                                 case 183 -> 204;
                                 case 184 -> 91;
                                 case 185 -> 122;
                                 case 186 -> 249;
                                 case 187 -> 195;
                                 case 188 -> 230;
                                 case 189 -> 55;
                                 case 190 -> 190;
                                 case 191 -> 36;
                                 case 192 -> 95;
                                 case 193 -> 175;
                                 case 194 -> 158;
                                 case 195 -> 127;
                                 case 196 -> 222;
                                 case 197 -> 59;
                                 case 198 -> 104;
                                 case 199 -> 12;
                                 case 200 -> 111;
                                 case 201 -> 162;
                                 case 202 -> 25;
                                 case 203 -> 247;
                                 case 204 -> 120;
                                 case 205 -> 139;
                                 case 206 -> 96;
                                 case 207 -> 159;
                                 case 208 -> 178;
                                 case 209 -> 228;
                                 case 210 -> 21;
                                 case 211 -> 32;
                                 case 212 -> 3;
                                 case 213 -> 65;
                                 case 214 -> 2;
                                 case 215 -> 107;
                                 case 216 -> 48;
                                 case 217 -> 235;
                                 case 218 -> 123;
                                 case 219 -> 18;
                                 case 220 -> 114;
                                 case 221 -> 14;
                                 case 222 -> 241;
                                 case 223 -> 116;
                                 case 224 -> 196;
                                 case 225 -> 60;
                                 case 226 -> 156;
                                 case 227 -> 52;
                                 case 228 -> 86;
                                 case 229 -> 7;
                                 case 230 -> 64;
                                 case 231 -> 169;
                                 case 232 -> 140;
                                 case 233 -> 145;
                                 case 234 -> 164;
                                 case 235 -> 203;
                                 case 236 -> 28;
                                 case 237 -> 215;
                                 case 238 -> 177;
                                 case 239 -> 216;
                                 case 240 -> 61;
                                 case 241 -> 185;
                                 case 242 -> 110;
                                 case 243 -> 130;
                                 case 244 -> 76;
                                 case 245 -> 151;
                                 case 246 -> 152;
                                 case 247 -> 23;
                                 case 248 -> 103;
                                 case 249 -> 31;
                                 case 250 -> 213;
                                 case 251 -> 227;
                                 case 252 -> 82;
                                 case 253 -> 136;
                                 case 254 -> 90;
                                 default -> 128;
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
                     }).create();
                     var10002 = 26705;
                     short var35 = 14832;
                     Intrinsics.checkNotNullExpressionValue(var11, "create(...)");
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var11;
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var33;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "\u0087lÜp\u00148\u0095\u0012æ9\u009dÙ8ÿ â:u\u0093ôâ \u0083#Ð";
                  var4 = "\u0087lÜp\u00148\u0095\u0012æ9\u009dÙ8ÿ â:u\u0093ôâ \u0083#Ð".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 51;
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
      int var2 = (var0 ^ 26698) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 82;
            case 1 -> 98;
            case 2 -> 202;
            case 3 -> 26;
            case 4 -> 147;
            case 5 -> 75;
            case 6 -> 180;
            case 7 -> 76;
            case 8 -> 78;
            case 9 -> 213;
            case 10 -> 16;
            case 11 -> 96;
            case 12 -> 160;
            case 13 -> 53;
            case 14 -> 68;
            case 15 -> 169;
            case 16 -> 13;
            case 17 -> 189;
            case 18 -> 23;
            case 19 -> 79;
            case 20 -> 201;
            case 21 -> 210;
            case 22 -> 161;
            case 23 -> 112;
            case 24 -> 110;
            case 25 -> 51;
            case 26 -> 10;
            case 27 -> 155;
            case 28 -> 156;
            case 29 -> 20;
            case 30 -> 232;
            case 31 -> 159;
            case 32 -> 137;
            case 33 -> 81;
            case 34 -> 190;
            case 35 -> 165;
            case 36 -> 4;
            case 37 -> 25;
            case 38 -> 11;
            case 39 -> 238;
            case 40 -> 146;
            case 41 -> 216;
            case 42 -> 153;
            case 43 -> 60;
            case 44 -> 114;
            case 45 -> 74;
            case 46 -> 50;
            case 47 -> 222;
            case 48 -> 72;
            case 49 -> 151;
            case 50 -> 176;
            case 51 -> 134;
            case 52 -> 206;
            case 53 -> 172;
            case 54 -> 131;
            case 55 -> 195;
            case 56 -> 117;
            case 57 -> 47;
            case 58 -> 240;
            case 59 -> 22;
            case 60 -> 87;
            case 61 -> 120;
            case 62 -> 191;
            case 63 -> 246;
            case 64 -> 128;
            case 65 -> 181;
            case 66 -> 194;
            case 67 -> 24;
            case 68 -> 130;
            case 69 -> 184;
            case 70 -> 143;
            case 71 -> 239;
            case 72 -> 245;
            case 73 -> 88;
            case 74 -> 14;
            case 75 -> 208;
            case 76 -> 253;
            case 77 -> 171;
            case 78 -> 2;
            case 79 -> 84;
            case 80 -> 140;
            case 81 -> 192;
            case 82 -> 219;
            case 83 -> 106;
            case 84 -> 45;
            case 85 -> 228;
            case 86 -> 227;
            case 87 -> 186;
            case 88 -> 162;
            case 89 -> 126;
            case 90 -> 41;
            case 91 -> 139;
            case 92 -> 113;
            case 93 -> 173;
            case 94 -> 212;
            case 95 -> 215;
            case 96 -> 183;
            case 97 -> 167;
            case 98 -> 119;
            case 99 -> 174;
            case 100 -> 35;
            case 101 -> 49;
            case 102 -> 33;
            case 103 -> 9;
            case 104 -> 30;
            case 105 -> 15;
            case 106 -> 124;
            case 107 -> 71;
            case 108 -> 247;
            case 109 -> 170;
            case 110 -> 199;
            case 111 -> 52;
            case 112 -> 196;
            case 113 -> 132;
            case 114 -> 61;
            case 115 -> 66;
            case 116 -> 58;
            case 117 -> 5;
            case 118 -> 168;
            case 119 -> 220;
            case 120 -> 144;
            case 121 -> 230;
            case 122 -> 255;
            case 123 -> 62;
            case 124 -> 223;
            case 125 -> 164;
            case 126 -> 27;
            case 127 -> 243;
            case 128 -> 182;
            case 129 -> 32;
            case 130 -> 149;
            case 131 -> 108;
            case 132 -> 250;
            case 133 -> 1;
            case 134 -> 135;
            case 135 -> 157;
            case 136 -> 129;
            case 137 -> 224;
            case 138 -> 150;
            case 139 -> 166;
            case 140 -> 90;
            case 141 -> 80;
            case 142 -> 248;
            case 143 -> 163;
            case 144 -> 218;
            case 145 -> 57;
            case 146 -> 109;
            case 147 -> 133;
            case 148 -> 234;
            case 149 -> 77;
            case 150 -> 21;
            case 151 -> 177;
            case 152 -> 211;
            case 153 -> 103;
            case 154 -> 12;
            case 155 -> 241;
            case 156 -> 6;
            case 157 -> 197;
            case 158 -> 63;
            case 159 -> 123;
            case 160 -> 217;
            case 161 -> 37;
            case 162 -> 242;
            case 163 -> 55;
            case 164 -> 118;
            case 165 -> 187;
            case 166 -> 38;
            case 167 -> 236;
            case 168 -> 125;
            case 169 -> 64;
            case 170 -> 7;
            case 171 -> 175;
            case 172 -> 200;
            case 173 -> 198;
            case 174 -> 28;
            case 175 -> 65;
            case 176 -> 188;
            case 177 -> 95;
            case 178 -> 29;
            case 179 -> 225;
            case 180 -> 36;
            case 181 -> 107;
            case 182 -> 185;
            case 183 -> 178;
            case 184 -> 102;
            case 185 -> 0;
            case 186 -> 104;
            case 187 -> 145;
            case 188 -> 231;
            case 189 -> 154;
            case 190 -> 233;
            case 191 -> 205;
            case 192 -> 226;
            case 193 -> 17;
            case 194 -> 252;
            case 195 -> 70;
            case 196 -> 34;
            case 197 -> 249;
            case 198 -> 214;
            case 199 -> 221;
            case 200 -> 136;
            case 201 -> 207;
            case 202 -> 127;
            case 203 -> 54;
            case 204 -> 19;
            case 205 -> 235;
            case 206 -> 116;
            case 207 -> 83;
            case 208 -> 93;
            case 209 -> 56;
            case 210 -> 18;
            case 211 -> 148;
            case 212 -> 203;
            case 213 -> 39;
            case 214 -> 141;
            case 215 -> 229;
            case 216 -> 244;
            case 217 -> 73;
            case 218 -> 115;
            case 219 -> 94;
            case 220 -> 97;
            case 221 -> 40;
            case 222 -> 122;
            case 223 -> 209;
            case 224 -> 99;
            case 225 -> 100;
            case 226 -> 111;
            case 227 -> 43;
            case 228 -> 121;
            case 229 -> 3;
            case 230 -> 204;
            case 231 -> 158;
            case 232 -> 138;
            case 233 -> 251;
            case 234 -> 44;
            case 235 -> 193;
            case 236 -> 91;
            case 237 -> 152;
            case 238 -> 86;
            case 239 -> 42;
            case 240 -> 48;
            case 241 -> 8;
            case 242 -> 69;
            case 243 -> 92;
            case 244 -> 89;
            case 245 -> 59;
            case 246 -> 67;
            case 247 -> 101;
            case 248 -> 254;
            case 249 -> 179;
            case 250 -> 142;
            case 251 -> 237;
            case 252 -> 46;
            case 253 -> 85;
            case 254 -> 105;
            default -> 31;
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
