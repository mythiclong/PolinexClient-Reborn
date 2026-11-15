package me.octo.client.utils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;

public final class IllIIlllIIIllIIIlIllIllIIIlIlIIIIIIlllIlIlIllIIllIlllIlIIlllIIllIIlIIIlIllIIllIIIlllI {
   private static String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 96;
   private static SecureRandom IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] a;
   private static String[] b;

   private IllIIlllIIIllIIIlIllIllIIIlIlIIIIIIlllIlIlIllIIllIlllIlIIlllIIllIIlIIIlIllIIllIIIlllI() {
   }

   public static void a(String var0, String var1) {
      a(var0, var1, var0x -> System.err.println("[POLINEX REPORT] " + var0x));
   }

   public static void b(String var0, String var1) {
      a(var0, var1, var0x -> System.err.println("[POLINEX SECURITY] " + var0x));
   }

   private static void lambda$b$1(String var0) {
      System.err.println("[POLINEX SECURITY] " + var0);
   }

   public static String a(String var0) {
      String var1 = var0 == null ? "" : var0;
      byte[] var2 = new byte[12];
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.nextBytes(var2);
      String var3 = a(var2);
      String var4 = "v1|" + Instant.now().toEpochMilli() + "|" + var3 + "|" + var1;
      String var5 = b(var4 + "|" + IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
      return c(var4 + "|" + var5);
   }

   private static void a(String var0, String var1, Consumer<String> var2) {
      Objects.requireNonNull(var2, "consumer");
      String var3 = var0 != null && !var0.isBlank() ? var0.trim() : "general";
      String var4 = var1 == null ? "" : var1;
      String var5 = a(var3 + ": " + var4);

      for (String var7 : c(var3, var5)) {
         var2.accept(var7);
      }
   }

   public static List<String> c(String var0, String var1) {
      String var2 = var0 != null && !var0.isBlank() ? var0.trim() : "general";
      String var3 = var1 == null ? "" : var1;
      int var4 = Math.max(32, IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
      if (var3.isEmpty()) {
         return Collections.singletonList(var2 + ":");
      } else {
         ArrayList var5 = new ArrayList(var3.length() / var4 + 1);
         int var6 = 0;

         for (int var7 = 0; var6 < var3.length(); var7++) {
            int var8 = Math.min(var3.length(), var6 + var4);
            var5.add(var2 + ":" + var7 + ":" + var3.substring(var6, var8));
            var6 += var4;
         }

         return var5;
      }
   }

   private static String a() {
      byte[] var0 = new byte[16];
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.nextBytes(var0);
      return a(var0);
   }

   private static String b(String var0) {
      try {
         MessageDigest var1 = MessageDigest.getInstance("SHA-256");
         return a(var1.digest((var0 == null ? "" : var0).getBytes(StandardCharsets.UTF_8)));
      } catch (Exception var2) {
         throw new IllegalStateException("SHA-256 unavailable", var2);
      }
   }

   private static String a(byte[] var0) {
      if (var0 == null) {
         return "";
      } else {
         char[] var1 = new char[var0.length * 2];
         char[] var2 = "0123456789abcdef".toCharArray();
         int var3 = 0;

         for (int var4 = 0; var3 < var0.length; var3++) {
            int var5 = var0[var3] & 255;
            var1[var4++] = var2[var5 >>> 4];
            var1[var4++] = var2[var5 & 15];
         }

         return new String(var1);
      }
   }

   private static String c(String var0) {
      byte[] var1 = (var0 == null ? "" : var0).getBytes(StandardCharsets.UTF_8);
      return Base64.getUrlEncoder().withoutPadding().encodeToString(var1);
   }

   static void $jnicClinit() {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = "polinex-report";
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = "polinex-security";
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = "v1";
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = Locale.ROOT.toLanguageTag();
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new SecureRandom();
      a = new String[0];
      b = new String[0];
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ var1) & 65535;
      return Integer.toHexString(var2);
   }

   public static void $jnicLoader() {
   }

   static {
      $jnicClinit();
   }
}
