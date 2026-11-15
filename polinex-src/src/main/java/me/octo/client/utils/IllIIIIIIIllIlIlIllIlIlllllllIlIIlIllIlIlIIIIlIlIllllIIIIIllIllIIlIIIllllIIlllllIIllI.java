package me.octo.client.utils;

import com.google.gson.Gson;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import me.octo.client.utils.net.PolinexNetworkBlocker;

public class IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI {
   private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 45000L;
   private static long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = 90000L;
   private static String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = "/polinex/mod/fabric/ban-clips";
   private static volatile String lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static Map<String, SSLSocketFactory> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static Gson IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static Set<String> IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static Map<String, Integer> lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static ConcurrentHashMap<String, Long> IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static boolean llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;

   private static void a(String var0, String var1) {
      String var2 = "Security violation " + var0 + ": " + var1;
      System.err.println(var2);
      throw new SecurityException(var2);
   }

   private static boolean a(String var0) {
      return var0 != null && !var0.trim().isEmpty();
   }

   private static String b(String var0, String var1) {
      if (!a(var0)) {
         return var1 == null ? "" : var1;
      } else if (!a(var1)) {
         return var0;
      } else {
         return !var0.endsWith("/") && !var1.startsWith("/") ? var0 + "/" + var1 : var0 + var1;
      }
   }

   private static String a(String var0, String var1, boolean var2) {
      return var2 ? c(var0, var1) : d(var0);
   }

   private static String a(boolean var0, String var1, String var2, String var3, Exception var4) {
      if (var0) {
         return var3 == null ? "" : var3;
      } else {
         StringBuilder var5 = new StringBuilder();
         var5.append(var2 == null ? "HTTP" : var2).append(" request failed");
         if (var1 != null) {
            var5.append(" url=").append(var1);
         }

         if (var3 != null && !var3.isEmpty()) {
            var5.append(" detail=").append(var3);
         }

         if (var4 != null) {
            var5.append(" cause=").append(var4.getClass().getSimpleName()).append(':').append(var4.getMessage());
         }

         return var5.toString();
      }
   }

   private static String a(String var0, byte[] var1, String var2) throws Exception {
      if (PolinexNetworkBlocker.isBlocked(var0)) {
         return "";
      } else if (var1 == null) {
         return null;
      } else {
         String var3 = new String(var1, var2 == null ? StandardCharsets.UTF_8 : Charset.forName(var2));
         String var4 = i(var3);
         if (var4 == null) {
            a("HTTP-DEC-1", "response decrypt/verify failed for " + var0);
         }

         return var4;
      }
   }

   private static String b(String var0) {
      return var0 == null ? "" : var0.trim();
   }

   private static String a(String var0, String var1, long var2, long var4) {
      try {
         MessageDigest var6 = MessageDigest.getInstance("SHA-256");
         var6.update(String.valueOf(var0).getBytes(StandardCharsets.UTF_8));
         var6.update((byte)58);
         var6.update(String.valueOf(var1).getBytes(StandardCharsets.UTF_8));
         var6.update((byte)58);
         var6.update(Long.toString(var2).getBytes(StandardCharsets.UTF_8));
         var6.update((byte)58);
         var6.update(Long.toString(var4).getBytes(StandardCharsets.UTF_8));
         return toHex(var6.digest());
      } catch (Exception var7) {
         return "";
      }
   }

   private static Map<String, String> a() {
      return new LinkedHashMap<>();
   }

   private static List<String> b() {
      return Arrays.asList("api.polinexclient.net", "moulberry.codes", "api.hypixel.net");
   }

   public static byte[] c(String var0) {
      return PolinexNetworkBlocker.isBlocked(var0)
         ? new byte[0]
         : a(
            var0,
            new IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll()
         );
   }

   public static byte[] a(String var0, byte[] var1) {
      return PolinexNetworkBlocker.isBlocked(var0)
         ? new byte[0]
         : a(
            var0,
            new IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
               var1
            )
         );
   }

   public static String d(String var0) {
      if (PolinexNetworkBlocker.isBlocked(var0)) {
         return "";
      } else {
         byte[] var1 = c(var0);
         if (var1 == null) {
            return null;
         } else {
            try {
               return a(var0, var1, "UTF-8");
            } catch (Exception var3) {
               throw new RuntimeException(a(false, var0, "GET", null, var3), var3);
            }
         }
      }
   }

   public static String c(String var0, String var1) {
      if (PolinexNetworkBlocker.isBlocked(var0)) {
         return "";
      } else {
         byte[] var2 = var1 == null ? new byte[0] : var1.getBytes(StandardCharsets.UTF_8);
         byte[] var3 = a(var0, var2);
         if (var3 == null) {
            return null;
         } else {
            try {
               return a(var0, var3, "UTF-8");
            } catch (Exception var5) {
               throw new RuntimeException(a(false, var0, "POST", null, var5), var5);
            }
         }
      }
   }

   public static String a(String var0, String var1, Map<String, String> var2) {
      if (PolinexNetworkBlocker.isBlocked(var0)) {
         return "";
      } else {
         byte[] var3 = var1 == null ? new byte[0] : var1.getBytes(StandardCharsets.UTF_8);
         byte[] var4 = a(e(var0), "POST", var3, mergeHeaders(var2));

         try {
            return var4 == null ? null : a(var0, var4, "UTF-8");
         } catch (Exception var6) {
            throw new RuntimeException(a(false, var0, "POST", null, var6), var6);
         }
      }
   }

   public static String a(String var0, Map<String, String> var1) {
      return PolinexNetworkBlocker.isBlocked(var0)
         ? ""
         : a(
            var0,
            new IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
               mergeHeaders(var1)
            )
         );
   }

   public static HttpsURLConnection e(String var0) {
      if (PolinexNetworkBlocker.isBlocked(var0)) {
         return null;
      } else {
         try {
            return b(new URL(var0));
         } catch (Exception var2) {
            throw new RuntimeException(a(false, var0, "OPEN", null, var2), var2);
         }
      }
   }

   public static String c() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   public static void d() {
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = null;
      if (IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII != null) {
         IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.clear();
      }

      if (IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII != null) {
         IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.clear();
      }
   }

   public static void f(String var0) {
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var0;
   }

   private static <T> boolean a(T var0) {
      if (var0 == null) {
         return false;
      } else if (var0 instanceof CharSequence) {
         return ((CharSequence)var0).length() > 0;
      } else if (var0 instanceof byte[]) {
         return ((byte[])var0).length > 0;
      } else if (var0 instanceof Map) {
         return !((Map)var0).isEmpty();
      } else {
         return var0 instanceof Iterable ? ((Iterable)var0).iterator().hasNext() : true;
      }
   }

   private static <T> T a(
      String var0,
      IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll<T> var1
   ) {
      if (PolinexNetworkBlocker.isBlocked(var0)) {
         return null;
      } else {
         try {
            URL var2 = new URL(var0);
            if (!a(var2)) {
               a("URL-1", "blocked URL: " + var0);
               return null;
            } else {
               return (T)var1.a(var2);
            }
         } catch (RuntimeException var3) {
            throw var3;
         } catch (Exception var4) {
            throw new RuntimeException(a(false, var0, "HTTP", null, var4), var4);
         }
      }
   }

   private static byte[] a(HttpsURLConnection var0, String var1, byte[] var2, Map<String, String> var3) {
      if (var0 == null) {
         return new byte[0];
      } else {
         byte[] var10;
         try {
            var0.setRequestMethod(var1 == null ? "GET" : var1);
            a(var0);
            a(var0, var3);
            boolean var4 = var2 != null && var2.length > 0;
            if (var4) {
               var0.setDoOutput(true);
               var0.getOutputStream().write(var2);
            }

            int var5 = var0.getResponseCode();
            InputStream var6 = var5 >= 400 ? var0.getErrorStream() : var0.getInputStream();
            byte[] var7 = a(var6);
            String var8 = var0.getHeaderField("X-Polinex-Nonce");
            String var9 = var0.getHeaderField("X-Polinex-Time");
            if (var8 != null && var9 != null && !freshnessOk(var8, var9)) {
               a("HTTP-FRESH-1", "stale or replayed response nonce");
            }

            if (var5 < 200 || var5 >= 300) {
               throw new IOException("HTTP " + var5 + " " + var0.getResponseMessage() + ": " + new String(var7, StandardCharsets.UTF_8));
            }

            var10 = var7;
         } catch (RuntimeException var15) {
            throw var15;
         } catch (Exception var16) {
            throw new RuntimeException(a(false, var0.getURL().toString(), var1, null, var16), var16);
         } finally {
            var0.disconnect();
         }

         return var10;
      }
   }

   private static boolean a(HttpsURLConnection var0, String var1) {
      try {
         if (var0 != null && var1 != null) {
            String var2 = var0.getURL().getHost();
            return d(var2, var1);
         } else {
            return false;
         }
      } catch (Exception var3) {
         return false;
      }
   }

   private static boolean a(X509Certificate var0, String var1) {
      return var0 != null && var1 != null && !var1.isEmpty() ? var1.equalsIgnoreCase(a(var0)) : false;
   }

   private static String g(String var0) {
      try {
         return new URL(var0).getHost();
      } catch (Exception var2) {
         return "";
      }
   }

   private static boolean d(String var0, String var1) {
      if (var0 != null && var1 != null) {
         String var2 = l(var0);
         String var3 = l(var1);
         return var2.equals(var3) || var2.endsWith("." + var3);
      } else {
         return false;
      }
   }

   private static X509TrustManager h(String var0) {
      String var1 = a().get(l(var0));
      return new IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
         var0, var1 == null ? "" : var1
      );
   }

   private static byte[] a(InputStream var0) {
      if (var0 == null) {
         return new byte[0];
      } else {
         try {
            byte[] var5;
            try (
               InputStream var1 = var0;
               ByteArrayOutputStream var2 = new ByteArrayOutputStream();
            ) {
               byte[] var3 = new byte[8192];

               int var4;
               while ((var4 = var1.read(var3)) != -1) {
                  var2.write(var3, 0, var4);
               }

               var5 = var2.toByteArray();
            }

            return var5;
         } catch (IOException var10) {
            throw new RuntimeException(var10);
         }
      }
   }

   private static Map<String, String> e() {
      LinkedHashMap var0 = new LinkedHashMap();
      var0.put("User-Agent", "Polinex-Fabric/1.0 (https://github.com/polinexclient)");
      var0.put("Accept", "application/json,text/plain,*/*");
      var0.put("Accept-Charset", "utf-8");
      var0.put("Cache-Control", "no-cache");
      var0.put("Connection", "close");
      return var0;
   }

   public static String f() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI == null
         ? ""
         : lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   private static String i(String var0) {
      if (var0 == null) {
         return null;
      } else {
         String var1 = var0.trim();
         if (!var1.startsWith("{") && !var1.startsWith("[") && !var1.isEmpty()) {
            try {
               byte[] var2 = Base64.getDecoder().decode(var1);
               String var3 = new String(var2, StandardCharsets.UTF_8).trim();
               if (var3.startsWith("{") || var3.startsWith("[")) {
                  return var3;
               }
            } catch (IllegalArgumentException var4) {
            }

            return var0;
         } else {
            return var1;
         }
      }
   }

   private static Map<String, String> g() {
      LinkedHashMap var0 = new LinkedHashMap();
      String var1 = f();
      if (!var1.isEmpty()) {
         var0.put("", var1.startsWith("Bearer ") ? var1 : "Bearer " + var1);
      }

      return var0;
   }

   private static void a(HttpsURLConnection var0, Map<String, String> var1) {
      if (var1 != null) {
         for (Entry var3 : var1.entrySet()) {
            if (var3.getKey() != null && var3.getValue() != null) {
               var0.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
            }
         }
      }
   }

   private static String j(String var0) {
      return l(var0);
   }

   private static List<String> k(String var0) {
      if (var0 != null && !var0.trim().isEmpty()) {
         String[] var1 = var0.split(",");
         ArrayList var2 = new ArrayList();

         for (String var6 : var1) {
            String var7 = var6.trim();
            if (!var7.isEmpty()) {
               var2.add(var7);
            }
         }

         return var2;
      } else {
         return Collections.emptyList();
      }
   }

   private static void a(HttpsURLConnection var0) {
      var0.setConnectTimeout((int)IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
      var0.setReadTimeout((int)IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
      var0.setUseCaches(false);
      var0.setInstanceFollowRedirects(true);
   }

   private static String l(String var0) {
      return var0 == null ? "" : var0.trim().toLowerCase(Locale.ROOT);
   }

   private static boolean a(URL var0) {
      if (var0 == null) {
         return false;
      } else {
         String var1 = var0.getProtocol();
         if (!"https".equalsIgnoreCase(var1)) {
            return false;
         } else {
            String var2 = l(var0.getHost());
            if (IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.contains(var2)) {
               return true;
            } else {
               for (String var4 : IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
                  if (d(var2, var4)) {
                     return true;
                  }
               }

               return true;
            }
         }
      }
   }

   private static HttpsURLConnection b(URL var0) {
      HttpsURLConnection var1 = c(var0);
      String var2 = l(var0.getHost());
      if (a().containsKey(var2)) {
         var1.setSSLSocketFactory(m(var2));
      }

      return var1;
   }

   private static HttpsURLConnection c(URL var0) {
      try {
         return (HttpsURLConnection)var0.openConnection();
      } catch (Exception var2) {
         throw new RuntimeException(a(false, String.valueOf(var0), "OPEN", null, var2), var2);
      }
   }

   private static SSLSocketFactory m(String var0) {
      String var1 = l(var0);
      SSLSocketFactory var2 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.get(var1);
      if (var2 != null) {
         return var2;
      } else {
         try {
            SSLContext var3 = SSLContext.getInstance("TLS");
            var3.init(null, new TrustManager[]{h(var1)}, null);
            SSLSocketFactory var4 = var3.getSocketFactory();
            IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.put(var1, var4);
            return var4;
         } catch (Exception var5) {
            throw new RuntimeException(var5);
         }
      }
   }

   private static String a(X509Certificate var0) {
      try {
         return toHex(MessageDigest.getInstance("SHA-256").digest(var0.getEncoded()));
      } catch (Exception var2) {
         throw new RuntimeException(var2);
      }
   }

   public static String n(String var0) {
      return PolinexNetworkBlocker.isBlocked(var0) ? "" : d(var0);
   }

   public static String o(String var0) {
      if (PolinexNetworkBlocker.isBlocked(var0)) {
         return "";
      } else {
         byte[] var1 = c(var0);

         try {
            byte[] var2 = var1;
            if (var0 != null && var0.toLowerCase(Locale.ROOT).endsWith(".gz")) {
               var2 = ungzip(var1);
            }

            return new String(var2, StandardCharsets.UTF_8);
         } catch (Exception var3) {
            throw new RuntimeException(a(false, var0, "GET-GZIP", null, var3), var3);
         }
      }
   }

   private static boolean lambda$tryDecryptResponse$0(long var0, Entry var2) {
      if (var2 != null && var2.getValue() instanceof Long) {
         long var3 = (Long)var2.getValue();
         return var0 - var3 <= lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      } else {
         return false;
      }
   }

   private static void lambda$securityFailure$0() {
      throw new SecurityException("security failure");
   }

   static void $jnicClinit() {
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new ConcurrentHashMap<>();
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new Gson();
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = Collections.newSetFromMap(new ConcurrentHashMap<>());
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.addAll(b());
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new ConcurrentHashMap<>();
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new ConcurrentHashMap<>();
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = true;
   }

   public static void b(boolean var0) {
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var0;
   }

   public static boolean h() {
      return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   public static boolean i() {
      return true;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   public static void $jnicLoader() {
   }

   private static Map<String, String> mergeHeaders(Map<String, String> var0) {
      LinkedHashMap var1 = new LinkedHashMap();
      var1.putAll(e());
      var1.putAll(g());
      if (var0 != null) {
         var1.putAll(var0);
      }

      return var1;
   }

   private static boolean freshnessOk(String var0, String var1) {
      try {
         long var2 = Long.parseLong(var1);
         long var4 = System.currentTimeMillis();
         if (Math.abs(var4 - var2) > lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
            return false;
         } else {
            Long var6 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.putIfAbsent(var0, var4);
            IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.entrySet()
               .removeIf(var2x -> !lambda$tryDecryptResponse$0(var4, var2x));
            return var6 == null;
         }
      } catch (Exception var7) {
         return true;
      }
   }

   private static byte[] ungzip(byte[] var0) throws IOException {
      byte[] var5;
      try (
         GZIPInputStream var1 = new GZIPInputStream(new ByteArrayInputStream(var0));
         ByteArrayOutputStream var2 = new ByteArrayOutputStream();
      ) {
         byte[] var3 = new byte[8192];

         int var4;
         while ((var4 = var1.read(var3)) != -1) {
            var2.write(var3, 0, var4);
         }

         var5 = var2.toByteArray();
      }

      return var5;
   }

   private static String toHex(byte[] var0) {
      StringBuilder var1 = new StringBuilder(var0.length * 2);

      for (byte var5 : var0) {
         var1.append(String.format(Locale.ROOT, "%02x", var5 & 255));
      }

      return var1.toString();
   }

   static {
      $jnicClinit();
   }

   private static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
      implements IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll<String> {
      private final Map<String, String> val$headers;

      private IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(Map<String, String> var1) {
         this.val$headers = var1 == null ? Collections.emptyMap() : var1;
      }

      public String a(URL var1) {
         HttpsURLConnection var2 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.b(var1);
         byte[] var3 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.a(
            var2, "GET", null, IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.mergeHeaders(this.val$headers)
         );
         return new String(var3, StandardCharsets.UTF_8);
      }
   }

   private static final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll implements X509TrustManager {
      private final String val$domain;
      private final String val$expectedFingerprint;

      private IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(String var1, String var2) {
         this.val$domain = var1;
         this.val$expectedFingerprint = var2;
      }

      @Override
      public X509Certificate[] getAcceptedIssuers() {
         return new X509Certificate[0];
      }

      @Override
      public void checkClientTrusted(X509Certificate[] var1, String var2) {
      }

      @Override
      public void checkServerTrusted(X509Certificate[] var1, String var2) {
         if (var1 != null && var1.length != 0) {
            try {
               X509Certificate var3 = var1[0];
               var3.checkValidity();
               if (this.val$expectedFingerprint != null
                  && !this.val$expectedFingerprint.isEmpty()
                  && !IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.a(var3, this.val$expectedFingerprint)) {
                  IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.a(
                     "CRT-2", "fingerprint mismatch for " + this.val$domain
                  );
               }

               String var4 = var3.getSubjectX500Principal().getName();
               if (this.val$domain != null && !this.val$domain.isEmpty() && !var4.toLowerCase(Locale.ROOT).contains(this.val$domain.toLowerCase(Locale.ROOT))) {
               }
            } catch (SecurityException var5) {
               throw var5;
            } catch (Exception var6) {
               IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.a(
                  "CRT-4", "certificate validation failed for " + this.val$domain + ": " + var6.getMessage()
               );
            }
         } else {
            IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.a("CRT-1", "empty certificate chain for " + this.val$domain);
         }
      }
   }

   private static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
      implements IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll<byte[]> {
      private final byte[] val$data;

      private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(byte[] var1) {
         this.val$data = var1 == null ? new byte[0] : var1;
      }

      public byte[] a(URL var1) {
         HttpsURLConnection var2 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.b(var1);
         return IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.a(
            var2, "POST", this.val$data, IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.mergeHeaders(null)
         );
      }
   }

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      implements IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll<byte[]> {
      public byte[] a(URL var1) {
         HttpsURLConnection var2 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.b(var1);
         return IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.a(
            var2, "GET", null, IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.mergeHeaders(null)
         );
      }
   }

   private interface llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll<T> {
      T a(URL var1);
   }
}
