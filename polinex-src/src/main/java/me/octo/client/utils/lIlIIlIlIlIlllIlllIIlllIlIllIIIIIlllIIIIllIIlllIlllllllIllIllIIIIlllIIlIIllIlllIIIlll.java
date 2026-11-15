package me.octo.client.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import net.minecraft.ChatFormatting;

public final class lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll {
   public static lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll();
   private static Gson lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new GsonBuilder().create();
   private static volatile boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String[] a;
   private static String[] b;

   private lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll() {
   }

   public static final void a() {
      if (!IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = true;
         log("IntegrationManager initialized");
      }
   }

   public static final boolean a(
      lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var0,
      String var1,
      String var2,
      boolean var3,
      Map<String, ? extends Object> var4
   ) {
      LinkedHashMap var5 = new LinkedHashMap();
      var5.put("title", var1);
      var5.put("description", var2);
      if (var4 != null) {
         var5.putAll(var4);
      }

      return a(enumWireName(var0), var5, var3, false);
   }

   public static boolean a(
      lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var0,
      String var1,
      String var2,
      boolean var3,
      Map var4,
      int var5,
      Object var6
   ) {
      if ((var5 & 8) != 0) {
         var3 = false;
      }

      if ((var5 & 16) != 0 || var4 == null) {
         var4 = new LinkedHashMap();
      }

      return a(var0, var1, var2, var3, (Map<String, ? extends Object>)var4);
   }

   public static final boolean a(String var0, Map<String, ? extends Object> var1, boolean var2, boolean var3) {
      try {
         HashMap var4 = new HashMap();
         if (var1 != null) {
            var4.putAll(var1);
         }

         if (var3) {
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var4);
         }

         String var5 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0, var4);
         if (var2) {
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var5);
            return true;
         } else {
            return send(var5);
         }
      } catch (Exception var6) {
         System.out.println("Error sending event: " + var6.getMessage());
         return false;
      }
   }

   public static boolean a(String var0, Map var1, boolean var2, boolean var3, int var4, Object var5) {
      if ((var4 & 2) != 0 || var1 == null) {
         var1 = new LinkedHashMap();
      }

      if ((var4 & 4) != 0) {
         var2 = true;
      }

      if ((var4 & 8) != 0) {
         var3 = true;
      }

      return a(var0, (Map<String, ? extends Object>)var1, var2, var3);
   }

   private final void a(JsonObject var1) {
      try {
         String var2 = getString(var1, "type");
         if (var2 == null) {
            log("[Integration] Unknown message type: null");
            return;
         }

         switch (var2) {
            case "license_check":
               this.b();
               break;
            case "crash":
               this.b(var1);
               break;
            case "disconnect_server":
               this.c(var1);
               break;
            case "connect_hypixel":
               this.d(var1);
               break;
            case "reconnect_server":
               this.e(var1);
               break;
            case "status_request":
               this.g(var1);
               break;
            case "event_response":
               this.h(var1);
               break;
            case "error":
               this.j(var1);
               break;
            case "macro_command":
               this.m(var1);
               break;
            case "save_clip":
               this.n(var1);
               break;
            case "custom_message":
               this.o(var1);
               break;
            case "message_custom":
               this.p(var1);
               break;
            case "scheduler_break":
               this.f(var1);
               break;
            default:
               log("[Integration] Unknown message type: " + var2);
         }
      } catch (Exception var5) {
         log("[Integration] Error handling message: " + var5.getMessage());
      }
   }

   private final void a(HashMap<String, Object> var1) {
      if (var1 != null) {
         var1.putIfAbsent("clientTime", System.currentTimeMillis());
         var1.putIfAbsent("integration", "polinex");
         var1.putIfAbsent("javaVersion", System.getProperty("java.version", "unknown"));
      }
   }

   private final String a(String var1, Map<String, ? extends Object> var2) {
      JsonObject var3 = new JsonObject();
      var3.addProperty("type", "event");
      var3.addProperty("event", var1 == null ? "unknown" : var1);
      JsonObject var4 = new JsonObject();
      if (var2 != null) {
         for (Entry var6 : var2.entrySet()) {
            addAny(var4, (String)var6.getKey(), var6.getValue());
         }
      }

      var3.add("data", var4);
      return var3.toString();
   }

   private final void a(String var1) {
      send(var1);
   }

   private final void b() {
      LinkedHashMap var1 = new LinkedHashMap();
      var1.put("status", "ok");
      var1.put("message", "license_check");
      a("license_check", var1, false, true);
   }

   private final void a(long var1) {
      if (var1 > 0L) {
         try {
            Thread.sleep(Math.min(var1, 5000L));
         } catch (InterruptedException var4) {
            Thread.currentThread().interrupt();
         }
      }
   }

   private final int b(long var1) {
      if (var1 <= 0L) {
         return 0;
      } else {
         return var1 > 2147483647L ? Integer.MAX_VALUE : (int)var1;
      }
   }

   private final long a(int var1) {
      return var1 & 4294967295L;
   }

   private final void a(int var1, int var2) {
      log("Integration delay/update: " + var1 + ":" + var2);
   }

   private final void b(int var1, int var2) {
      log("Integration progress/update: " + var1 + ":" + var2);
   }

   private final void c() {
      log("Integration reconnect/status refresh requested");
   }

   private final void b(int var1) {
      log("Integration numeric update: " + var1);
   }

   private final void b(JsonObject var1) {
      log("Crash request ignored by Java replacement: " + var1);
      LinkedHashMap var2 = new LinkedHashMap();
      var2.put("status", "ignored");
      var2.put("message", "crash command ignored");
      a("crash", var2, false, true);
   }

   private final void c(JsonObject var1) {
      String var2 = firstString(var1, "requestId", "id");
      this.e(var2);
   }

   private final void d(JsonObject var1) {
      String var2 = firstString(var1, "requestId", "id");
      String var3 = firstString(var1, "server", "address");
      this.d(var2 == null ? var3 : var2);
   }

   private final void e(JsonObject var1) {
      String var2 = firstString(var1, "requestId", "id");
      this.f(var2);
   }

   private final void a(
      lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var1,
      String var2,
      String var3,
      String var4
   ) {
      JsonObject var5 = event(enumWireName(var1));
      addNonNull(var5, "requestId", var2);
      addNonNull(var5, "status", var3);
      addNonNull(var5, "message", var4);
      send(var5.toString());
   }

   private final void f(JsonObject var1) {
      String var2 = firstString(var1, "requestId", "id");
      int var3 = getInt(var1, "duration_minutes", 0);
      this.a(var2, "success", "Break started", var3);
   }

   private final void a(String var1, String var2, String var3, int var4) {
      JsonObject var5 = event("scheduler_break_response");
      addNonNull(var5, "requestId", var1);
      addNonNull(var5, "status", var2);
      addNonNull(var5, "message", var3);
      var5.addProperty("duration_minutes", var4);
      send(var5.toString());
   }

   private final void g(JsonObject var1) {
      JsonObject var2 = event("status_update");
      var2.addProperty("status", "ok");
      var2.addProperty("message", "status_update");
      send(var2.toString());
   }

   private final void h(JsonObject var1) {
      log("event_response: " + var1);
   }

   private final void i(JsonObject var1) {
      this.a(var1);
   }

   private final void j(JsonObject var1) {
      log("Integration error: " + var1);
   }

   private final ChatFormatting b(String var1) {
      if (var1 == null) {
         return ChatFormatting.WHITE;
      } else {
         String var2 = var1.trim().toUpperCase(Locale.ROOT).replace('-', '_');

         try {
            return ChatFormatting.valueOf(var2);
         } catch (Throwable var4) {
            return ChatFormatting.WHITE;
         }
      }
   }

   private final void k(JsonObject var1) {
      log("handle k: " + var1);
   }

   private final void l(JsonObject var1) {
      log("handle l: " + var1);
   }

   private final void m(JsonObject var1) {
      String var2 = firstString(var1, "command", "macro_command");
      String var3 = firstString(var1, "requestId", "id");
      String var4 = firstString(var1, "macroType", "most_recent_macro");
      a(var2, true, var4, var3, "Macro command response", null);
   }

   private final void a(JsonObject var1, String var2) {
      JsonObject var3 = event("event_response");
      addNonNull(var3, "requestId", firstString(var1, "requestId", "id"));
      addNonNull(var3, "message", var2);
      send(var3.toString());
   }

   private final boolean c(String var1) {
      if (var1 == null) {
         return false;
      } else {
         String var2 = var1.trim().toLowerCase(Locale.ROOT);
         return var2.equals("success") || var2.equals("ok") || var2.equals("true");
      }
   }

   private final void d(String var1) {
      JsonObject var2 = event("connect_hypixel_response");
      addNonNull(var2, "requestId", var1);
      var2.addProperty("success", true);
      var2.addProperty("message", "Connected to Hypixel");
      send(var2.toString());
   }

   private final void a(String var1, boolean var2, String var3, String var4, String var5) {
      a(var1, var2, var3, var4, var5, null);
   }

   private final void a(String var1, String var2, Object var3) {
      JsonObject var4 = event(var1 == null ? "event_response" : var1);
      addAny(var4, var2 == null ? "value" : var2, var3);
      send(var4.toString());
   }

   private final void n(JsonObject var1) {
      String var2 = firstString(var1, "requestId", "uploadId", "banId");
      String var3 = firstString(var1, "uploadId");
      String var4 = firstString(var1, "banId");
      this.a(var2, true, "Clip saved", var3, var4, null, null, null);
   }

   private final Integer a(JsonElement var1) {
      if (var1 == null) {
         return null;
      } else {
         try {
            return var1.getAsInt();
         } catch (Exception var3) {
            return null;
         }
      }
   }

   private final void a(String var1, boolean var2, String var3, String var4, String var5, Boolean var6, String var7, Integer var8) {
      JsonObject var9 = event("save_clip_response");
      addNonNull(var9, "requestId", var1);
      var9.addProperty("success", var2);
      addNonNull(var9, "message", var3);
      addNonNull(var9, "uploadId", var4);
      addNonNull(var9, "banId", var5);
      if (var6 != null) {
         var9.addProperty("screenshotFailed", var6);
      }

      addNonNull(var9, "macroType", var7);
      if (var8 != null) {
         var9.addProperty("duration_minutes", var8);
      }

      send(var9.toString());
   }

   static void a(
      lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll var0,
      String var1,
      boolean var2,
      String var3,
      String var4,
      String var5,
      Boolean var6,
      String var7,
      Integer var8,
      int var9,
      Object var10
   ) {
      if ((var9 & 8) != 0) {
         var3 = null;
      }

      if ((var9 & 16) != 0) {
         var4 = null;
      }

      if ((var9 & 32) != 0) {
         var5 = null;
      }

      if ((var9 & 64) != 0) {
         var6 = null;
      }

      if ((var9 & 128) != 0) {
         var7 = null;
      }

      if ((var9 & 256) != 0) {
         var8 = null;
      }

      var0.a(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   private final void o(JsonObject var1) {
      String var2 = firstString(var1, "message", "text");
      JsonObject var3 = event("custom_message_response");
      var3.addProperty("success", true);
      addNonNull(var3, "message", var2 == null ? "Custom message response" : var2);
      send(var3.toString());
   }

   private final void a(boolean var1, String var2, String var3) {
      LinkedHashMap var4 = new LinkedHashMap();
      var4.put("success", var1);
      var4.put("title", var2);
      var4.put("description", var3);
      a("event_response", var4, false, true);
   }

   private final void p(JsonObject var1) {
      String var2 = firstString(var1, "message", "text");
      LinkedHashMap var3 = new LinkedHashMap();
      var3.put("message", var2);
      a("message_custom", var3, false, true);
   }

   private final void e(String var1) {
      JsonObject var2 = event("disconnect_server_response");
      addNonNull(var2, "requestId", var1);
      var2.addProperty("success", true);
      var2.addProperty("message", "Disconnected from server");
      send(var2.toString());
   }

   private final void f(String var1) {
      JsonObject var2 = event("reconnect_server_response");
      addNonNull(var2, "requestId", var1);
      var2.addProperty("success", true);
      var2.addProperty("message", "Reconnected to Hypixel");
      send(var2.toString());
   }

   public static final boolean a(
      lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var0,
      String var1,
      String var2,
      boolean var3
   ) {
      return a(var0, var1, var2, var3, new LinkedHashMap<>());
   }

   public static final boolean a(
      lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var0,
      String var1,
      String var2
   ) {
      return a(var0, var1, var2, false, new LinkedHashMap<>());
   }

   public static final boolean a(
      lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var0,
      String var1
   ) {
      return a(var0, var1, "", false, new LinkedHashMap<>());
   }

   public static final boolean a(String var0, Map<String, ? extends Object> var1, boolean var2) {
      return a(var0, var1, var2, false);
   }

   public static final boolean b(String var0, Map<String, ? extends Object> var1) {
      return a(var0, var1, false, false);
   }

   public static final boolean g(String var0) {
      return a(var0, new LinkedHashMap<>(), false, false);
   }

   private static final Unit q(JsonObject var0) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0);
      return Unit.INSTANCE;
   }

   private static final Unit a(String var0, String var1) {
      try {
         if (var1 != null) {
            JsonObject var2 = JsonParser.parseString(var0).getAsJsonObject();
            var2.addProperty("screenshot", var1);
            var0 = var2.toString();
         }
      } catch (Exception var3) {
         System.out.println("Error handling screenshot event: " + var3.getMessage());
      }

      send(var0);
      return Unit.INSTANCE;
   }

   private static final void a(Function1 var0, Object var1) {
      var0.invoke(var1);
   }

   private static final void c(long var0) {
      try {
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0);
      } catch (Exception var3) {
      }
   }

   private static final void c(int var0, int var1) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var0, var1);
   }

   private static final void d() {
   }

   private static final void h(String var0) {
      log("handle disconnect: 3");
   }

   private static final void i(String var0) {
      log("handle disconnect: 5");
   }

   private static final void a(long var0, String var2) {
      c(var0);
   }

   private static final Unit b(
      lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var0,
      String var1,
      String var2,
      String var3
   ) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0, var1, var2, var3);
      return Unit.INSTANCE;
   }

   private static final void b(Function1 var0, Object var1) {
      var0.invoke(var1);
   }

   private static final void a(String var0, int var1) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0, "success", "Break started", var1);
   }

   private static final void b(String var0, int var1) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0, "success", "Break started", var1);
   }

   private static final Unit a(String var0, String var1, int var2, String var3) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0, "success", var1, var2);
      return Unit.INSTANCE;
   }

   private static final void c(Function1 var0, Object var1) {
      var0.invoke(var1);
   }

   private static final Unit a(String var0, boolean var1, String var2, String var3, String var4, String var5) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0, var1, var2, var3, var4);
      return Unit.INSTANCE;
   }

   private static final void d(Function1 var0, Object var1) {
      var0.invoke(var1);
   }

   private static final Unit a(String var0, String var1, Object var2, String var3) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a("macro_command_response", var1, var2);
      return Unit.INSTANCE;
   }

   private static final void e(Function1 var0, Object var1) {
      var0.invoke(var1);
   }

   private static final Unit a(File var0, String var1, String var2, String var3) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var1, true, "Clip saved", var2, var3, null, null, null);
      return Unit.INSTANCE;
   }

   private static final Unit a(String var0, String var1, String var2, File var3, Throwable var4) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
         var0, var4 == null, var4 == null ? "Clip saved" : "Failed to save clip", var1, var2, var4 != null, null, null
      );
      return Unit.INSTANCE;
   }

   private static final void a(Function2 var0, Object var1, Object var2) {
      var0.invoke(var1, var2);
   }

   private static final Unit b(String var0, String var1) {
      a(var0, var1);
      return Unit.INSTANCE;
   }

   private static final void f(Function1 var0, Object var1) {
      var0.invoke(var1);
   }

   static void $jnicClinit() {
      a = new String[0];
      b = new String[0];
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   private static String d(int var0, int var1) {
      return "";
   }

   public static void $jnicLoader() {
   }

   private static JsonObject event(String var0) {
      JsonObject var1 = new JsonObject();
      var1.addProperty("type", "event");
      var1.addProperty("event", var0);
      return var1;
   }

   private static void addNonNull(JsonObject var0, String var1, String var2) {
      if (var2 != null) {
         var0.addProperty(var1, var2);
      }
   }

   private static void addAny(JsonObject var0, String var1, Object var2) {
      if (var1 != null) {
         if (var2 != null) {
            if (var2 instanceof Boolean) {
               var0.addProperty(var1, (Boolean)var2);
            } else if (var2 instanceof Number) {
               var0.addProperty(var1, (Number)var2);
            } else if (var2 instanceof JsonElement) {
               var0.add(var1, (JsonElement)var2);
            } else {
               var0.addProperty(var1, String.valueOf(var2));
            }
         }
      }
   }

   private static String getString(JsonObject var0, String var1) {
      try {
         JsonElement var2 = var0 == null ? null : var0.get(var1);
         return var2 == null ? null : var2.getAsString();
      } catch (Exception var3) {
         return null;
      }
   }

   private static String firstString(JsonObject var0, String... var1) {
      for (String var5 : var1) {
         String var6 = getString(var0, var5);
         if (var6 != null) {
            return var6;
         }
      }

      return null;
   }

   private static int getInt(JsonObject var0, String var1, int var2) {
      try {
         JsonElement var3 = var0 == null ? null : var0.get(var1);
         return var3 == null ? var2 : var3.getAsInt();
      } catch (Exception var4) {
         return var2;
      }
   }

   private static String enumWireName(Object var0) {
      if (var0 == null) {
         return null;
      } else {
         try {
            Method var1 = var0.getClass().getDeclaredMethod("a");
            var1.setAccessible(true);
            Object var2 = var1.invoke(var0);
            return var2 == null ? null : String.valueOf(var2);
         } catch (Throwable var3) {
            return var0 instanceof Enum ? ((Enum)var0).name().toLowerCase(Locale.ROOT) : String.valueOf(var0);
         }
      }
   }

   private static boolean send(String var0) {
      if (var0 == null) {
         return false;
      } else {
         try {
            Class var1 = Class.forName("me.octo.client.utils.IIIlllIIIlllIllIIIlIIlIlIIlIIlIIIlIlIlllIIIllIllllIIIIllIllIIIlllIlllIllIIIIIIIllllll");
            Method var2 = var1.getDeclaredMethod("a", String.class);
            var2.setAccessible(true);
            Object var3 = var2.invoke(null, var0);
            return !(var3 instanceof Boolean) || (Boolean)var3;
         } catch (Throwable var4) {
            System.out.println(var0);
            return true;
         }
      }
   }

   private static void log(String var0) {
      try {
         Class var1 = Class.forName("me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI");
         Method var2 = var1.getDeclaredMethod("e", String.class);
         var2.setAccessible(true);
         var2.invoke(null, var0);
      } catch (Throwable var3) {
         System.out.println(var0);
      }
   }

   static {
      $jnicClinit();
   }
}
